package mcframe.clientMGBG.MGBGP0060;

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
import mcframe.clientMGBG.MGBGP0060.MGBGP_MlyAlcAmtSrch_MC.MG_MGBGL0060_Srch01Caller;

/**
 * 画面"MGBGP_MlyAlcAmtSrch"パネルクラスです。<p>
 *
 * 配賦費用に関して月別に計画値と実績値を参照する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBGP_MlyAlcAmtSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBGP0060";

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
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * BEFORE,View data before departmental alloc.;AFTER,View data after departmental alloc. BEFORE,一次配賦処理前のデータを参照する;AFTER,一次配賦処理後のデータを参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_pre_alc_typ_Group = null;
	public MCRadioButton Cnd_pre_alc_typ_BEFORE = null;
	public MCRadioButton Cnd_pre_alc_typ_AFTER = null;
	public MCLabel Cnd_pln_calc_ctg_cd_Label = null;
	/**
	 * Plan calculation category cd. 計画計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pln_calc_ctg_cd = null;
	/**
	 * Plan calculation category name 計画計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_pln_calc_ctg_nm = null;
	public MCLabel Cnd_act_calc_ctg_cd_Label = null;
	/**
	 * Result calculation category cd. 実績計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_act_calc_ctg_cd = null;
	/**
	 * Result calculation category name 実績計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_act_calc_ctg_nm = null;
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term;	// [Cnd]の[term_p.term]を[Cnd_term]としてエイリアス定義。
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
	public MCLabel Cnd_alc_rec_typ_Label = null;
	/**
	 * Expense incurred type 費用発生区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_rec_typ = null;
	/**
	 * Expense incurred type name 費用発生区分名.<p>
	 *
	 */
	public MCTextField Cnd_alc_rec_typ_nm = null;
	public MCLabel Cnd_alc_ac_cd_Label = null;
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_ac_cd = null;
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public MCTextField Cnd_alc_ac_nm = null;
	public MCLabel Cnd_alc_ac_grp_cd1_Label = null;
	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_ac_grp_cd1 = null;
	/**
	 * Allocation account group name 1 配賦科目グループ名１.<p>
	 *
	 */
	public MCTextField Cnd_alc_ac_grp_nm1 = null;
	public MCLabel Cnd_alc_ac_grp_cd2_Label = null;
	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_ac_grp_cd2 = null;
	/**
	 * Allocation account group name 2 配賦科目グループ名２.<p>
	 *
	 */
	public MCTextField Cnd_alc_ac_grp_nm2 = null;
	public MCLabel Cnd_alc_ac_grp_cd3_Label = null;
	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_ac_grp_cd3 = null;
	/**
	 * Allocation account group name 3 配賦科目グループ名３.<p>
	 *
	 */
	public MCTextField Cnd_alc_ac_grp_nm3 = null;
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
	public MCLabel Cnd_loc_cd_Label = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCTextField Cnd_loc_nm = null;
	public MCLabel Cnd_oper_cd_Label = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCTextField Cnd_oper_nm = null;
	public MCLabel Cnd_bp_cd_Label = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCTextField Cnd_bp_nm = null;
	public MCLabel Cnd_ctg_cd_Label = null;
	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ctg_cd = null;
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public MCTextField Cnd_ctg_nm = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_lot_no_Label = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_sublot_no = null;
	public MCLabel Cnd_sno1_Label = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCTextField Cnd_sno1 = null;
	public MCLabel Cnd_sno2_Label = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCTextField Cnd_sno2 = null;
	public MCLabel Cnd_sno3_Label = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCTextField Cnd_sno3 = null;
	public MCLabel Cnd_sno4_Label = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCTextField Cnd_sno4 = null;
	public MCLabel Cnd_itm_grp_cd1_Label = null;
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd1 = null;
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm1 = null;
	public MCLabel Cnd_itm_grp_cd2_Label = null;
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd2 = null;
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm2 = null;
	public MCLabel Cnd_itm_grp_cd3_Label = null;
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd3 = null;
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm3 = null;
	public MCLabel Cnd_itm_grp_cd4_Label = null;
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd4 = null;
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm4 = null;
	public MCLabel Cnd_itm_grp_cd5_Label = null;
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd5 = null;
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm5 = null;
	public MCLabel Cnd_itm_grp_cd6_Label = null;
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd6 = null;
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm6 = null;
	public MCLabel Cnd_itm_grp_cd7_Label = null;
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd7 = null;
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm7 = null;
	public MCLabel Cnd_itm_grp_cd8_Label = null;
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd8 = null;
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm8 = null;
	public MCLabel Cnd_itm_grp_cd9_Label = null;
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd9 = null;
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm9 = null;
	public MCLabel Cnd_itm_grp_cd10_Label = null;
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd10 = null;
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm10 = null;
	public MCLabel Cnd_bp_grp_cd1_Label = null;
	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd1 = null;
	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm1 = null;
	public MCLabel Cnd_bp_grp_cd2_Label = null;
	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd2 = null;
	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm2 = null;
	public MCLabel Cnd_bp_grp_cd3_Label = null;
	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd3 = null;
	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm3 = null;
	public MCLabel Cnd_bp_grp_cd4_Label = null;
	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd4 = null;
	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm4 = null;
	public MCLabel Cnd_bp_grp_cd5_Label = null;
	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd5 = null;
	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm5 = null;
	public MCLabel Cnd_bp_grp_cd6_Label = null;
	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd6 = null;
	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm6 = null;
	public MCLabel Cnd_bp_grp_cd7_Label = null;
	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd7 = null;
	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm7 = null;
	public MCLabel Cnd_bp_grp_cd8_Label = null;
	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd8 = null;
	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm8 = null;
	public MCLabel Cnd_bp_grp_cd9_Label = null;
	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd9 = null;
	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm9 = null;
	public MCLabel Cnd_bp_grp_cd10_Label = null;
	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd10 = null;
	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm10 = null;
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
	/**
	 * Expense incurred type 費用発生区分.<p>
	 *
	 */
	public MCCheckBox Cnd_alc_rec_typ_flg = null;
	/**
	 * Allocation account 配賦科目.<p>
	 *
	 */
	public MCCheckBox Cnd_alc_ac_flg = null;
	/**
	 * Allocation account G 1 配賦科目Ｇ１.<p>
	 *
	 */
	public MCCheckBox Cnd_alc_ac_grp1_flg = null;
	/**
	 * Allocation account G 2 配賦科目Ｇ２.<p>
	 *
	 */
	public MCCheckBox Cnd_alc_ac_grp2_flg = null;
	/**
	 * Allocation account G 3 配賦科目Ｇ３.<p>
	 *
	 */
	public MCCheckBox Cnd_alc_ac_grp3_flg = null;
	/**
	 * Dept. 部門.<p>
	 *
	 */
	public MCCheckBox Cnd_dpt_flg = null;
	/**
	 * Location 場所.<p>
	 *
	 */
	public MCCheckBox Cnd_loc_flg = null;
	/**
	 * Operation 工程.<p>
	 *
	 */
	public MCCheckBox Cnd_oper_flg = null;
	/**
	 * BP 取引先.<p>
	 *
	 */
	public MCCheckBox Cnd_bp_flg = null;
	/**
	 * Item category 品群.<p>
	 *
	 */
	public MCCheckBox Cnd_ctg_flg = null;
	/**
	 * Item 品目.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_flg = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_typ_flg = null;
	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_typ_d_flg = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_lot_flg = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_sublot_flg = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCCheckBox Cnd_sno1_flg = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCCheckBox Cnd_sno2_flg = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCCheckBox Cnd_sno3_flg = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCCheckBox Cnd_sno4_flg = null;
	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg1 = null;
	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg2 = null;
	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg3 = null;
	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg4 = null;
	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg5 = null;
	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg6 = null;
	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg7 = null;
	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg8 = null;
	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg9 = null;
	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg10 = null;
	/**
	 * BP classification 1 取引先分類１.<p>
	 *
	 */
	public MCCheckBox Cnd_bp_grp_flg1 = null;
	/**
	 * BP classification 2 取引先分類２.<p>
	 *
	 */
	public MCCheckBox Cnd_bp_grp_flg2 = null;
	/**
	 * BP classification 3 取引先分類３.<p>
	 *
	 */
	public MCCheckBox Cnd_bp_grp_flg3 = null;
	/**
	 * BP classification 4 取引先分類４.<p>
	 *
	 */
	public MCCheckBox Cnd_bp_grp_flg4 = null;
	/**
	 * BP classification 5 取引先分類５.<p>
	 *
	 */
	public MCCheckBox Cnd_bp_grp_flg5 = null;
	/**
	 * BP classification 6 取引先分類６.<p>
	 *
	 */
	public MCCheckBox Cnd_bp_grp_flg6 = null;
	/**
	 * BP classification 7 取引先分類７.<p>
	 *
	 */
	public MCCheckBox Cnd_bp_grp_flg7 = null;
	/**
	 * BP classification 8 取引先分類８.<p>
	 *
	 */
	public MCCheckBox Cnd_bp_grp_flg8 = null;
	/**
	 * BP classification 9 取引先分類９.<p>
	 *
	 */
	public MCCheckBox Cnd_bp_grp_flg9 = null;
	/**
	 * BP classification 10 取引先分類１０.<p>
	 *
	 */
	public MCCheckBox Cnd_bp_grp_flg10 = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Cnd_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Cnd_deselect_all = null;
	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public MCCheckBox Cnd_disp_key = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_cur_cd = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Cnd_amt_dec_place = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Cnd3]ブロック関連のField定義
	public MCPanel Cnd3Panel = null;
	// [Cnd3]ブロックの項目のField定義
	// [Ttl]ブロック関連のField定義
	public MCPanel TtlPanel = null;
	// [Ttl]ブロックの項目のField定義
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [DispRslt]ブロック関連のField定義
	public MCPanel DispRsltPanel = null;
	public MCScrollPane DispRsltScrollPane = null;
	public MCTable2<mcframe.clientMGBG.MGBGP0060.DispRsltR> DispRsltTable = null;
	// [DispRslt]ブロックの項目のField定義
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_wg_nm = null;
	/**
	 * Expense incurred type 費用発生区分.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_alc_rec_typ = null;
	/**
	 * Expense incurred type name 費用発生区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_alc_rec_typ_nm = null;
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_alc_ac_cd = null;
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_alc_ac_nm = null;
	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_alc_ac_grp_cd1 = null;
	/**
	 * Allocation account group name 1 配賦科目グループ名１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_alc_ac_grp_nm1 = null;
	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_alc_ac_grp_cd2 = null;
	/**
	 * Allocation account group name 2 配賦科目グループ名２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_alc_ac_grp_nm2 = null;
	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_alc_ac_grp_cd3 = null;
	/**
	 * Allocation account group name 3 配賦科目グループ名３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_alc_ac_grp_nm3 = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dpt_nm = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_loc_nm = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_oper_nm = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_nm = null;
	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_ctg_cd = null;
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_ctg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D DispRslt_itm_p_PPanel;
	public MCColumnConfig columnDispRslt_itm_cd;// [DispRslt]の[itm_p.itm_cd]を[columnDispRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_itm_sub1;// [DispRslt]の[itm_p.itm_sub1]を[columnDispRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_itm_sub2;// [DispRslt]の[itm_p.itm_sub2]を[columnDispRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_itm_sub3;// [DispRslt]の[itm_p.itm_sub3]を[columnDispRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_itm_nm;// [DispRslt]の[itm_p.itm_nm]を[columnDispRslt_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_typ_d_nm = null;
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd1 = null;
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm1 = null;
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd2 = null;
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm2 = null;
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd3 = null;
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm3 = null;
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd4 = null;
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm4 = null;
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd5 = null;
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm5 = null;
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd6 = null;
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm6 = null;
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd7 = null;
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm7 = null;
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd8 = null;
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm8 = null;
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd9 = null;
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm9 = null;
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd10 = null;
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm10 = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sublot_no = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sno1 = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sno2 = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sno3 = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sno4 = null;
	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_cd1 = null;
	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_nm1 = null;
	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_cd2 = null;
	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_nm2 = null;
	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_cd3 = null;
	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_nm3 = null;
	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_cd4 = null;
	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_nm4 = null;
	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_cd5 = null;
	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_nm5 = null;
	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_cd6 = null;
	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_nm6 = null;
	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_cd7 = null;
	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_nm7 = null;
	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_cd8 = null;
	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_nm8 = null;
	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_cd9 = null;
	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_nm9 = null;
	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_cd10 = null;
	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_bp_grp_nm10 = null;
	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_elm_no = null;
	/**
	 * Column key 項目キー.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_elm = null;
	/**
	 * Column 項目.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_elm_nm = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_00_p_PPanel;
	public MCColumnConfig columnDispRslt_col_00;// [DispRslt]の[amt_00_p.amt]を[columnDispRslt_col_00]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_01_p_PPanel;
	public MCColumnConfig columnDispRslt_col_01;// [DispRslt]の[amt_01_p.amt]を[columnDispRslt_col_01]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_02_p_PPanel;
	public MCColumnConfig columnDispRslt_col_02;// [DispRslt]の[amt_02_p.amt]を[columnDispRslt_col_02]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_03_p_PPanel;
	public MCColumnConfig columnDispRslt_col_03;// [DispRslt]の[amt_03_p.amt]を[columnDispRslt_col_03]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_04_p_PPanel;
	public MCColumnConfig columnDispRslt_col_04;// [DispRslt]の[amt_04_p.amt]を[columnDispRslt_col_04]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_05_p_PPanel;
	public MCColumnConfig columnDispRslt_col_05;// [DispRslt]の[amt_05_p.amt]を[columnDispRslt_col_05]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_06_p_PPanel;
	public MCColumnConfig columnDispRslt_col_06;// [DispRslt]の[amt_06_p.amt]を[columnDispRslt_col_06]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_07_p_PPanel;
	public MCColumnConfig columnDispRslt_col_07;// [DispRslt]の[amt_07_p.amt]を[columnDispRslt_col_07]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_08_p_PPanel;
	public MCColumnConfig columnDispRslt_col_08;// [DispRslt]の[amt_08_p.amt]を[columnDispRslt_col_08]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_09_p_PPanel;
	public MCColumnConfig columnDispRslt_col_09;// [DispRslt]の[amt_09_p.amt]を[columnDispRslt_col_09]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_10_p_PPanel;
	public MCColumnConfig columnDispRslt_col_10;// [DispRslt]の[amt_10_p.amt]を[columnDispRslt_col_10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_11_p_PPanel;
	public MCColumnConfig columnDispRslt_col_11;// [DispRslt]の[amt_11_p.amt]を[columnDispRslt_col_11]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_ttl_amt_p_PPanel;
	public MCColumnConfig columnDispRslt_ttl;// [DispRslt]の[ttl_amt_p.amt]を[columnDispRslt_ttl]としてエイリアス定義。
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
	
	/** [MG_MGBGL0060_Srch01]のCallerの作成 */
	protected MGBGP_MlyAlcAmtSrch_MC.MG_MGBGL0060_Srch01Caller createMG_MGBGL0060_Srch01() {
		MGBGP_MlyAlcAmtSrch_MC.MG_MGBGL0060_Srch01Caller<MGBGP_MlyAlcAmtSrch, MG_MGBGL0060_Srch01Bridge>
		caller = ((MGBGP_MlyAlcAmtSrch_MC)this).new MG_MGBGL0060_Srch01Caller<MGBGP_MlyAlcAmtSrch, MG_MGBGL0060_Srch01Bridge>(
					(MGBGP_MlyAlcAmtSrch)this, new MG_MGBGL0060_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBGL0060_Srch01]の呼び出し */
	protected void callMG_MGBGL0060_Srch01() {
		MCCaller caller = createMG_MGBGL0060_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBG.MGBGP0060.CndR aCndR;
	/** [DispRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBG.MGBGP0060.DispRsltR> aDispRsltL;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBG.MGBGP0060.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBG.MGBGP0060.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBG.MGBGP0060.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBG.MGBGP0060.CndR createCndR() {
		return mcframe.clientMGBG.MGBGP0060.CndR.create();
	}

	/**
	 * コピーによってaDispRsltLを設定します。
	 *
	 * aDispRsltLのインスタンスは変更されません。
	 *
	 * @param dataset DispRsltL
	 */
	public void setDispRsltL(MCList<mcframe.clientMGBG.MGBGP0060.DispRsltR> aList) {
		if (getDispRsltL() != aList) {
			getDispRsltL().setAll(aList);
		}
	}

	/**
	 * [DispRslt]ブロックのコンテナaDispRsltLを返します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBG.MGBGP0060.DispRsltR> getDispRsltL() {
		return aDispRsltL;
	}

	/**
	 * aDispRsltRを作成します。
	 *
	 * @return DispRsltR
	 */
	public mcframe.clientMGBG.MGBGP0060.DispRsltR createDispRsltR() {
		return mcframe.clientMGBG.MGBGP0060.DispRsltR.create();
	}

	/**
	 * aDispRsltLを作成します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBG.MGBGP0060.DispRsltR> createDispRsltL() {
		return MCList.create(mcframe.clientMGBG.MGBGP0060.DispRsltR.class);
	}

	/**
	 * DispRsltTableを初期化します。
	 */
	protected void createDispRsltTable(){
		if(DispRsltTable == null){
			DispRsltTable = beansFactory.createTable2("DispRslt.table");
		}
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBG.MGBGP0060.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBG.MGBGP0060.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBG.MGBGP0060.RsltR createRsltR() {
		return mcframe.clientMGBG.MGBGP0060.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBG.MGBGP0060.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBG.MGBGP0060.RsltR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDispRsltL())) ret.add(getDispRsltL());
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
		if(aCnt == getDispRsltL()) return "DispRslt";
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
		if(bId.equals("DispRslt")) return getDispRsltL();
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
		ret.add(ScreenOpePanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(Tab4Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(Cnd3Panel);
		ret.add(TtlPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(DispRsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBGP_MlyAlcAmtSrch_MC_A() {
		aCndR = createCndR();
		aDispRsltL = createDispRsltL();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBGP_MlyAlcAmtSrch_MC_A(String name) {
		aCndR = createCndR();
		aDispRsltL = createDispRsltL();
		createDispRsltTable();
		DispRsltTable.setRowName(name);
		aRsltL = createRsltL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBGP_MlyAlcAmtSrch_MC.jbCreateScreenOpe((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbCreateTop((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbCreateFold((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbCreateTab1((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbCreateTab2((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbCreateTab3((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbCreateTab4((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbCreateCnd((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbCreateCnd2((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbCreateCnd3((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbCreateTtl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbCreateLPnl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbCreateCtrl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbCreateDispRslt((MGBGP_MlyAlcAmtSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBGP_MlyAlcAmtSrch p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term = p.Cnd_term_p_PPanel.Term_term;
		p.Cnd_term.addAliasName("Cnd.term", p);
		p.Cnd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().itm_typ_p());
		p.Cnd_itm_typ_p_PPanel.setName("Cnd.itm_typ_p");
		p.Cnd_itm_typ = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_itm_typ.addAliasName("Cnd.itm_typ", p);
		p.Cnd_itm_typ_d_cd = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_itm_typ_d_cd.addAliasName("Cnd.itm_typ_d_cd", p);
		p.Cnd_itm_typ_d_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Cnd_itm_typ_d_nm.addAliasName("Cnd.itm_typ_d_nm", p);
		p.Cnd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm_p());
		p.Cnd_itm_p_PPanel.setName("Cnd.itm_p");
		p.Cnd_itm_cd = p.Cnd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_itm_cd.addAliasName("Cnd.itm_cd", p);
		p.Cnd_itm_sub1 = p.Cnd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_itm_sub1.addAliasName("Cnd.itm_sub1", p);
		p.Cnd_itm_sub2 = p.Cnd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_itm_sub2.addAliasName("Cnd.itm_sub2", p);
		p.Cnd_itm_sub3 = p.Cnd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_itm_sub3.addAliasName("Cnd.itm_sub3", p);
		p.Cnd_itm_nm = p.Cnd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_itm_nm.addAliasName("Cnd.itm_nm", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 * [Ttl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTtl(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBGP_MlyAlcAmtSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispRslt(MGBGP_MlyAlcAmtSrch p) {
		p.DispRslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBG.MGBGP0060.DispRsltR.$itm_p);
		p.DispRslt_itm_p_PPanel.setName("DispRslt.itm_p");
		p.columnDispRslt_itm_cd = p.DispRslt_itm_p_PPanel.columnItm_itm_cd;
		p.columnDispRslt_itm_cd.addAliasName("DispRslt.itm_cd", p);
		p.columnDispRslt_itm_sub1 = p.DispRslt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDispRslt_itm_sub1.addAliasName("DispRslt.itm_sub1", p);
		p.columnDispRslt_itm_sub2 = p.DispRslt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDispRslt_itm_sub2.addAliasName("DispRslt.itm_sub2", p);
		p.columnDispRslt_itm_sub3 = p.DispRslt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDispRslt_itm_sub3.addAliasName("DispRslt.itm_sub3", p);
		p.columnDispRslt_itm_nm = p.DispRslt_itm_p_PPanel.columnItm_itm_nm;
		p.columnDispRslt_itm_nm.addAliasName("DispRslt.itm_nm", p);
		p.DispRslt_amt_00_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBG.MGBGP0060.DispRsltR.$amt_00_p);
		p.DispRslt_amt_00_p_PPanel.setName("DispRslt.amt_00_p");
		p.columnDispRslt_col_00 = p.DispRslt_amt_00_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_00.addAliasName("DispRslt.col_00", p);
		p.DispRslt_amt_01_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBG.MGBGP0060.DispRsltR.$amt_01_p);
		p.DispRslt_amt_01_p_PPanel.setName("DispRslt.amt_01_p");
		p.columnDispRslt_col_01 = p.DispRslt_amt_01_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_01.addAliasName("DispRslt.col_01", p);
		p.DispRslt_amt_02_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBG.MGBGP0060.DispRsltR.$amt_02_p);
		p.DispRslt_amt_02_p_PPanel.setName("DispRslt.amt_02_p");
		p.columnDispRslt_col_02 = p.DispRslt_amt_02_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_02.addAliasName("DispRslt.col_02", p);
		p.DispRslt_amt_03_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBG.MGBGP0060.DispRsltR.$amt_03_p);
		p.DispRslt_amt_03_p_PPanel.setName("DispRslt.amt_03_p");
		p.columnDispRslt_col_03 = p.DispRslt_amt_03_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_03.addAliasName("DispRslt.col_03", p);
		p.DispRslt_amt_04_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBG.MGBGP0060.DispRsltR.$amt_04_p);
		p.DispRslt_amt_04_p_PPanel.setName("DispRslt.amt_04_p");
		p.columnDispRslt_col_04 = p.DispRslt_amt_04_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_04.addAliasName("DispRslt.col_04", p);
		p.DispRslt_amt_05_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBG.MGBGP0060.DispRsltR.$amt_05_p);
		p.DispRslt_amt_05_p_PPanel.setName("DispRslt.amt_05_p");
		p.columnDispRslt_col_05 = p.DispRslt_amt_05_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_05.addAliasName("DispRslt.col_05", p);
		p.DispRslt_amt_06_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBG.MGBGP0060.DispRsltR.$amt_06_p);
		p.DispRslt_amt_06_p_PPanel.setName("DispRslt.amt_06_p");
		p.columnDispRslt_col_06 = p.DispRslt_amt_06_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_06.addAliasName("DispRslt.col_06", p);
		p.DispRslt_amt_07_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBG.MGBGP0060.DispRsltR.$amt_07_p);
		p.DispRslt_amt_07_p_PPanel.setName("DispRslt.amt_07_p");
		p.columnDispRslt_col_07 = p.DispRslt_amt_07_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_07.addAliasName("DispRslt.col_07", p);
		p.DispRslt_amt_08_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBG.MGBGP0060.DispRsltR.$amt_08_p);
		p.DispRslt_amt_08_p_PPanel.setName("DispRslt.amt_08_p");
		p.columnDispRslt_col_08 = p.DispRslt_amt_08_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_08.addAliasName("DispRslt.col_08", p);
		p.DispRslt_amt_09_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBG.MGBGP0060.DispRsltR.$amt_09_p);
		p.DispRslt_amt_09_p_PPanel.setName("DispRslt.amt_09_p");
		p.columnDispRslt_col_09 = p.DispRslt_amt_09_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_09.addAliasName("DispRslt.col_09", p);
		p.DispRslt_amt_10_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBG.MGBGP0060.DispRsltR.$amt_10_p);
		p.DispRslt_amt_10_p_PPanel.setName("DispRslt.amt_10_p");
		p.columnDispRslt_col_10 = p.DispRslt_amt_10_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_10.addAliasName("DispRslt.col_10", p);
		p.DispRslt_amt_11_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBG.MGBGP0060.DispRsltR.$amt_11_p);
		p.DispRslt_amt_11_p_PPanel.setName("DispRslt.amt_11_p");
		p.columnDispRslt_col_11 = p.DispRslt_amt_11_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_11.addAliasName("DispRslt.col_11", p);
		p.DispRslt_ttl_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBG.MGBGP0060.DispRsltR.$ttl_amt_p);
		p.DispRslt_ttl_amt_p_PPanel.setName("DispRslt.ttl_amt_p");
		p.columnDispRslt_ttl = p.DispRslt_ttl_amt_p_PPanel.columnAmt_amt;
		p.columnDispRslt_ttl.addAliasName("DispRslt.ttl", p);
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

	
	/** [Cnd_pln_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pln_calc_ctg_cd_p = null;

	/**
	 * [Cnd_pln_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pln_calc_ctg_cd_ListPutter() {
		if (Cnd_pln_calc_ctg_cd_p == null) {
			Cnd_pln_calc_ctg_cd_p = createCnd_pln_calc_ctg_cd_ListPutter(Cnd_pln_calc_ctg_cd, "pln_calc_ctg_cd", "pln_calc_ctg_nm");

		}
		return Cnd_pln_calc_ctg_cd_p;
	}
	
	
	/** [Cnd_act_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_act_calc_ctg_cd_p = null;

	/**
	 * [Cnd_act_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_act_calc_ctg_cd_ListPutter() {
		if (Cnd_act_calc_ctg_cd_p == null) {
			Cnd_act_calc_ctg_cd_p = createCnd_act_calc_ctg_cd_ListPutter(Cnd_act_calc_ctg_cd, "act_calc_ctg_cd", "act_calc_ctg_nm");

		}
		return Cnd_act_calc_ctg_cd_p;
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
	
	
	/** [Cnd_alc_rec_typ_ListPutter]の定義 */
	private MCListPutter Cnd_alc_rec_typ_p = null;

	/**
	 * [Cnd_alc_rec_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_rec_typ_ListPutter() {
		if (Cnd_alc_rec_typ_p == null) {
			Cnd_alc_rec_typ_p = createCnd_alc_rec_typ_ListPutter(Cnd_alc_rec_typ, "alc_rec_typ", "alc_rec_typ_nm");

		}
		return Cnd_alc_rec_typ_p;
	}
	
	
	/** [Cnd_alc_ac_cd_ListPutter]の定義 */
	private MCListPutter Cnd_alc_ac_cd_p = null;

	/**
	 * [Cnd_alc_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_ac_cd_ListPutter() {
		if (Cnd_alc_ac_cd_p == null) {
			Cnd_alc_ac_cd_p = createCnd_alc_ac_cd_ListPutter(Cnd_alc_ac_cd, "alc_ac_cd", "alc_ac_nm");

		}
		return Cnd_alc_ac_cd_p;
	}
	
	
	/** [Cnd_alc_ac_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_alc_ac_grp_cd1_p = null;

	/**
	 * [Cnd_alc_ac_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_ac_grp_cd1_ListPutter() {
		if (Cnd_alc_ac_grp_cd1_p == null) {
			Cnd_alc_ac_grp_cd1_p = createCnd_alc_ac_grp_cd1_ListPutter(Cnd_alc_ac_grp_cd1, "alc_ac_grp_cd1", "alc_ac_grp_nm1");

		}
		return Cnd_alc_ac_grp_cd1_p;
	}
	
	
	/** [Cnd_alc_ac_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_alc_ac_grp_cd2_p = null;

	/**
	 * [Cnd_alc_ac_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_ac_grp_cd2_ListPutter() {
		if (Cnd_alc_ac_grp_cd2_p == null) {
			Cnd_alc_ac_grp_cd2_p = createCnd_alc_ac_grp_cd2_ListPutter(Cnd_alc_ac_grp_cd2, "alc_ac_grp_cd2", "alc_ac_grp_nm2");

		}
		return Cnd_alc_ac_grp_cd2_p;
	}
	
	
	/** [Cnd_alc_ac_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_alc_ac_grp_cd3_p = null;

	/**
	 * [Cnd_alc_ac_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_ac_grp_cd3_ListPutter() {
		if (Cnd_alc_ac_grp_cd3_p == null) {
			Cnd_alc_ac_grp_cd3_p = createCnd_alc_ac_grp_cd3_ListPutter(Cnd_alc_ac_grp_cd3, "alc_ac_grp_cd3", "alc_ac_grp_nm3");

		}
		return Cnd_alc_ac_grp_cd3_p;
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
	
	
	/** [Cnd_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_loc_cd_p = null;

	/**
	 * [Cnd_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loc_cd_ListPutter() {
		if (Cnd_loc_cd_p == null) {
			Cnd_loc_cd_p = createCnd_loc_cd_ListPutter(Cnd_loc_cd, "loc_cd", "loc_nm");

		}
		return Cnd_loc_cd_p;
	}
	
	
	/** [Cnd_oper_cd_ListPutter]の定義 */
	private MCListPutter Cnd_oper_cd_p = null;

	/**
	 * [Cnd_oper_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_oper_cd_ListPutter() {
		if (Cnd_oper_cd_p == null) {
			Cnd_oper_cd_p = createCnd_oper_cd_ListPutter(Cnd_oper_cd, "oper_cd", "oper_nm");

		}
		return Cnd_oper_cd_p;
	}
	
	
	/** [Cnd_bp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bp_cd_p = null;

	/**
	 * [Cnd_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_cd_ListPutter() {
		if (Cnd_bp_cd_p == null) {
			Cnd_bp_cd_p = createCnd_bp_cd_ListPutter(Cnd_bp_cd, "bp_cd", "bp_nm");

		}
		return Cnd_bp_cd_p;
	}
	
	
	/** [Cnd_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ctg_cd_p = null;

	/**
	 * [Cnd_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ctg_cd_ListPutter() {
		if (Cnd_ctg_cd_p == null) {
			Cnd_ctg_cd_p = createCnd_ctg_cd_ListPutter(Cnd_ctg_cd, "ctg_cd", "ctg_nm");

		}
		return Cnd_ctg_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_itm_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd1_p = null;

	/**
	 * [Cnd_itm_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd1_ListPutter() {
		if (Cnd_itm_grp_cd1_p == null) {
			Cnd_itm_grp_cd1_p = createCnd_itm_grp_cd1_ListPutter(Cnd_itm_grp_cd1, "itm_grp_cd1", "itm_grp_nm1");

		}
		return Cnd_itm_grp_cd1_p;
	}
	
	
	/** [Cnd_itm_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd2_p = null;

	/**
	 * [Cnd_itm_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd2_ListPutter() {
		if (Cnd_itm_grp_cd2_p == null) {
			Cnd_itm_grp_cd2_p = createCnd_itm_grp_cd2_ListPutter(Cnd_itm_grp_cd2, "itm_grp_cd2", "itm_grp_nm2");

		}
		return Cnd_itm_grp_cd2_p;
	}
	
	
	/** [Cnd_itm_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd3_p = null;

	/**
	 * [Cnd_itm_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd3_ListPutter() {
		if (Cnd_itm_grp_cd3_p == null) {
			Cnd_itm_grp_cd3_p = createCnd_itm_grp_cd3_ListPutter(Cnd_itm_grp_cd3, "itm_grp_cd3", "itm_grp_nm3");

		}
		return Cnd_itm_grp_cd3_p;
	}
	
	
	/** [Cnd_itm_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd4_p = null;

	/**
	 * [Cnd_itm_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd4_ListPutter() {
		if (Cnd_itm_grp_cd4_p == null) {
			Cnd_itm_grp_cd4_p = createCnd_itm_grp_cd4_ListPutter(Cnd_itm_grp_cd4, "itm_grp_cd4", "itm_grp_nm4");

		}
		return Cnd_itm_grp_cd4_p;
	}
	
	
	/** [Cnd_itm_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd5_p = null;

	/**
	 * [Cnd_itm_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd5_ListPutter() {
		if (Cnd_itm_grp_cd5_p == null) {
			Cnd_itm_grp_cd5_p = createCnd_itm_grp_cd5_ListPutter(Cnd_itm_grp_cd5, "itm_grp_cd5", "itm_grp_nm5");

		}
		return Cnd_itm_grp_cd5_p;
	}
	
	
	/** [Cnd_itm_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd6_p = null;

	/**
	 * [Cnd_itm_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd6_ListPutter() {
		if (Cnd_itm_grp_cd6_p == null) {
			Cnd_itm_grp_cd6_p = createCnd_itm_grp_cd6_ListPutter(Cnd_itm_grp_cd6, "itm_grp_cd6", "itm_grp_nm6");

		}
		return Cnd_itm_grp_cd6_p;
	}
	
	
	/** [Cnd_itm_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd7_p = null;

	/**
	 * [Cnd_itm_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd7_ListPutter() {
		if (Cnd_itm_grp_cd7_p == null) {
			Cnd_itm_grp_cd7_p = createCnd_itm_grp_cd7_ListPutter(Cnd_itm_grp_cd7, "itm_grp_cd7", "itm_grp_nm7");

		}
		return Cnd_itm_grp_cd7_p;
	}
	
	
	/** [Cnd_itm_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd8_p = null;

	/**
	 * [Cnd_itm_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd8_ListPutter() {
		if (Cnd_itm_grp_cd8_p == null) {
			Cnd_itm_grp_cd8_p = createCnd_itm_grp_cd8_ListPutter(Cnd_itm_grp_cd8, "itm_grp_cd8", "itm_grp_nm8");

		}
		return Cnd_itm_grp_cd8_p;
	}
	
	
	/** [Cnd_itm_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd9_p = null;

	/**
	 * [Cnd_itm_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd9_ListPutter() {
		if (Cnd_itm_grp_cd9_p == null) {
			Cnd_itm_grp_cd9_p = createCnd_itm_grp_cd9_ListPutter(Cnd_itm_grp_cd9, "itm_grp_cd9", "itm_grp_nm9");

		}
		return Cnd_itm_grp_cd9_p;
	}
	
	
	/** [Cnd_itm_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd10_p = null;

	/**
	 * [Cnd_itm_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd10_ListPutter() {
		if (Cnd_itm_grp_cd10_p == null) {
			Cnd_itm_grp_cd10_p = createCnd_itm_grp_cd10_ListPutter(Cnd_itm_grp_cd10, "itm_grp_cd10", "itm_grp_nm10");

		}
		return Cnd_itm_grp_cd10_p;
	}
	
	
	/** [Cnd_bp_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd1_p = null;

	/**
	 * [Cnd_bp_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd1_ListPutter() {
		if (Cnd_bp_grp_cd1_p == null) {
			Cnd_bp_grp_cd1_p = createCnd_bp_grp_cd1_ListPutter(Cnd_bp_grp_cd1, "bp_grp_cd1", "bp_grp_nm1");

		}
		return Cnd_bp_grp_cd1_p;
	}
	
	
	/** [Cnd_bp_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd2_p = null;

	/**
	 * [Cnd_bp_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd2_ListPutter() {
		if (Cnd_bp_grp_cd2_p == null) {
			Cnd_bp_grp_cd2_p = createCnd_bp_grp_cd2_ListPutter(Cnd_bp_grp_cd2, "bp_grp_cd2", "bp_grp_nm2");

		}
		return Cnd_bp_grp_cd2_p;
	}
	
	
	/** [Cnd_bp_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd3_p = null;

	/**
	 * [Cnd_bp_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd3_ListPutter() {
		if (Cnd_bp_grp_cd3_p == null) {
			Cnd_bp_grp_cd3_p = createCnd_bp_grp_cd3_ListPutter(Cnd_bp_grp_cd3, "bp_grp_cd3", "bp_grp_nm3");

		}
		return Cnd_bp_grp_cd3_p;
	}
	
	
	/** [Cnd_bp_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd4_p = null;

	/**
	 * [Cnd_bp_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd4_ListPutter() {
		if (Cnd_bp_grp_cd4_p == null) {
			Cnd_bp_grp_cd4_p = createCnd_bp_grp_cd4_ListPutter(Cnd_bp_grp_cd4, "bp_grp_cd4", "bp_grp_nm4");

		}
		return Cnd_bp_grp_cd4_p;
	}
	
	
	/** [Cnd_bp_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd5_p = null;

	/**
	 * [Cnd_bp_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd5_ListPutter() {
		if (Cnd_bp_grp_cd5_p == null) {
			Cnd_bp_grp_cd5_p = createCnd_bp_grp_cd5_ListPutter(Cnd_bp_grp_cd5, "bp_grp_cd5", "bp_grp_nm5");

		}
		return Cnd_bp_grp_cd5_p;
	}
	
	
	/** [Cnd_bp_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd6_p = null;

	/**
	 * [Cnd_bp_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd6_ListPutter() {
		if (Cnd_bp_grp_cd6_p == null) {
			Cnd_bp_grp_cd6_p = createCnd_bp_grp_cd6_ListPutter(Cnd_bp_grp_cd6, "bp_grp_cd6", "bp_grp_nm6");

		}
		return Cnd_bp_grp_cd6_p;
	}
	
	
	/** [Cnd_bp_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd7_p = null;

	/**
	 * [Cnd_bp_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd7_ListPutter() {
		if (Cnd_bp_grp_cd7_p == null) {
			Cnd_bp_grp_cd7_p = createCnd_bp_grp_cd7_ListPutter(Cnd_bp_grp_cd7, "bp_grp_cd7", "bp_grp_nm7");

		}
		return Cnd_bp_grp_cd7_p;
	}
	
	
	/** [Cnd_bp_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd8_p = null;

	/**
	 * [Cnd_bp_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd8_ListPutter() {
		if (Cnd_bp_grp_cd8_p == null) {
			Cnd_bp_grp_cd8_p = createCnd_bp_grp_cd8_ListPutter(Cnd_bp_grp_cd8, "bp_grp_cd8", "bp_grp_nm8");

		}
		return Cnd_bp_grp_cd8_p;
	}
	
	
	/** [Cnd_bp_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd9_p = null;

	/**
	 * [Cnd_bp_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd9_ListPutter() {
		if (Cnd_bp_grp_cd9_p == null) {
			Cnd_bp_grp_cd9_p = createCnd_bp_grp_cd9_ListPutter(Cnd_bp_grp_cd9, "bp_grp_cd9", "bp_grp_nm9");

		}
		return Cnd_bp_grp_cd9_p;
	}
	
	
	/** [Cnd_bp_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd10_p = null;

	/**
	 * [Cnd_bp_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd10_ListPutter() {
		if (Cnd_bp_grp_cd10_p == null) {
			Cnd_bp_grp_cd10_p = createCnd_bp_grp_cd10_ListPutter(Cnd_bp_grp_cd10, "bp_grp_cd10", "bp_grp_nm10");

		}
		return Cnd_bp_grp_cd10_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBGP_MlyAlcAmtSrch create(){
		MGBGP_MlyAlcAmtSrch p = new MGBGP_MlyAlcAmtSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBGP_MlyAlcAmtSrch create(String name){
		MGBGP_MlyAlcAmtSrch p = new MGBGP_MlyAlcAmtSrch(name);
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
		MGBGP_MlyAlcAmtSrch_MC.jbfInitScreenOpe((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbfInitTop((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbfInitFold((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbfInitTab1((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbfInitTab2((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbfInitTab3((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbfInitTab4((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbfInitCnd((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbfInitCnd2((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbfInitCnd3((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbfInitTtl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbfInitLPnl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbfInitCtrl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbfInitDispRslt((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbInitScreenOpe((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbInitTop((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbInitFold((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbInitTab1((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbInitTab2((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbInitTab3((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbInitTab4((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbInitCnd((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbInitCnd2((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbInitCnd3((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbInitTtl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbInitLPnl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbInitCtrl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.jbInitDispRslt((MGBGP_MlyAlcAmtSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBGP_MlyAlcAmtSrch p) {
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
	protected static void jbfInitTab1(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_pre_alc_typ_Group = p.beansFactory.createButtonGroup("Cnd.pre_alc_typ");
		p.Cnd_pre_alc_typ_BEFORE = p.beansFactory.createRadioButton("Cnd.pre_alc_typ_BEFORE");
		p.Cnd_pre_alc_typ_AFTER = p.beansFactory.createRadioButton("Cnd.pre_alc_typ_AFTER");
		p.Cnd_pln_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.pln_calc_ctg_cd_Label");
		p.Cnd_pln_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.pln_calc_ctg_cd");
		p.Cnd_pln_calc_ctg_cd.setLabel(p.Cnd_pln_calc_ctg_cd_Label);
		p.Cnd_pln_calc_ctg_nm = p.beansFactory.createTextField("Cnd.pln_calc_ctg_nm");
		p.Cnd_act_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.act_calc_ctg_cd_Label");
		p.Cnd_act_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.act_calc_ctg_cd");
		p.Cnd_act_calc_ctg_cd.setLabel(p.Cnd_act_calc_ctg_cd_Label);
		p.Cnd_act_calc_ctg_nm = p.beansFactory.createTextField("Cnd.act_calc_ctg_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_alc_rec_typ_Label = p.beansFactory.createLabel("Cnd.alc_rec_typ_Label");
		p.Cnd_alc_rec_typ = p.beansFactory.createTextComboBox("Cnd.alc_rec_typ");
		p.Cnd_alc_rec_typ.setLabel(p.Cnd_alc_rec_typ_Label);
		p.Cnd_alc_rec_typ_nm = p.beansFactory.createTextField("Cnd.alc_rec_typ_nm");
		p.Cnd_alc_ac_cd_Label = p.beansFactory.createLabel("Cnd.alc_ac_cd_Label");
		p.Cnd_alc_ac_cd = p.beansFactory.createTextComboBox("Cnd.alc_ac_cd");
		p.Cnd_alc_ac_cd.setLabel(p.Cnd_alc_ac_cd_Label);
		p.Cnd_alc_ac_nm = p.beansFactory.createTextField("Cnd.alc_ac_nm");
		p.Cnd_alc_ac_grp_cd1_Label = p.beansFactory.createLabel("Cnd.alc_ac_grp_cd1_Label");
		p.Cnd_alc_ac_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.alc_ac_grp_cd1");
		p.Cnd_alc_ac_grp_cd1.setLabel(p.Cnd_alc_ac_grp_cd1_Label);
		p.Cnd_alc_ac_grp_nm1 = p.beansFactory.createTextField("Cnd.alc_ac_grp_nm1");
		p.Cnd_alc_ac_grp_cd2_Label = p.beansFactory.createLabel("Cnd.alc_ac_grp_cd2_Label");
		p.Cnd_alc_ac_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.alc_ac_grp_cd2");
		p.Cnd_alc_ac_grp_cd2.setLabel(p.Cnd_alc_ac_grp_cd2_Label);
		p.Cnd_alc_ac_grp_nm2 = p.beansFactory.createTextField("Cnd.alc_ac_grp_nm2");
		p.Cnd_alc_ac_grp_cd3_Label = p.beansFactory.createLabel("Cnd.alc_ac_grp_cd3_Label");
		p.Cnd_alc_ac_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.alc_ac_grp_cd3");
		p.Cnd_alc_ac_grp_cd3.setLabel(p.Cnd_alc_ac_grp_cd3_Label);
		p.Cnd_alc_ac_grp_nm3 = p.beansFactory.createTextField("Cnd.alc_ac_grp_nm3");
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextComboBox("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_oper_cd_Label = p.beansFactory.createLabel("Cnd.oper_cd_Label");
		p.Cnd_oper_cd = p.beansFactory.createTextComboBox("Cnd.oper_cd");
		p.Cnd_oper_cd.setLabel(p.Cnd_oper_cd_Label);
		p.Cnd_oper_nm = p.beansFactory.createTextField("Cnd.oper_nm");
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_ctg_cd_Label = p.beansFactory.createLabel("Cnd.ctg_cd_Label");
		p.Cnd_ctg_cd = p.beansFactory.createTextComboBox("Cnd.ctg_cd");
		p.Cnd_ctg_cd.setLabel(p.Cnd_ctg_cd_Label);
		p.Cnd_ctg_nm = p.beansFactory.createTextField("Cnd.ctg_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextField("Cnd.sublot_no");
		p.Cnd_sno1_Label = p.beansFactory.createLabel("Cnd.sno1_Label");
		p.Cnd_sno1 = p.beansFactory.createTextField("Cnd.sno1");
		p.Cnd_sno1.setLabel(p.Cnd_sno1_Label);
		p.Cnd_sno2_Label = p.beansFactory.createLabel("Cnd.sno2_Label");
		p.Cnd_sno2 = p.beansFactory.createTextField("Cnd.sno2");
		p.Cnd_sno2.setLabel(p.Cnd_sno2_Label);
		p.Cnd_sno3_Label = p.beansFactory.createLabel("Cnd.sno3_Label");
		p.Cnd_sno3 = p.beansFactory.createTextField("Cnd.sno3");
		p.Cnd_sno3.setLabel(p.Cnd_sno3_Label);
		p.Cnd_sno4_Label = p.beansFactory.createLabel("Cnd.sno4_Label");
		p.Cnd_sno4 = p.beansFactory.createTextField("Cnd.sno4");
		p.Cnd_sno4.setLabel(p.Cnd_sno4_Label);
		p.Cnd_itm_grp_cd1_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd1_Label");
		p.Cnd_itm_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd1");
		p.Cnd_itm_grp_cd1.setLabel(p.Cnd_itm_grp_cd1_Label);
		p.Cnd_itm_grp_nm1 = p.beansFactory.createTextField("Cnd.itm_grp_nm1");
		p.Cnd_itm_grp_cd2_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd2_Label");
		p.Cnd_itm_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd2");
		p.Cnd_itm_grp_cd2.setLabel(p.Cnd_itm_grp_cd2_Label);
		p.Cnd_itm_grp_nm2 = p.beansFactory.createTextField("Cnd.itm_grp_nm2");
		p.Cnd_itm_grp_cd3_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd3_Label");
		p.Cnd_itm_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd3");
		p.Cnd_itm_grp_cd3.setLabel(p.Cnd_itm_grp_cd3_Label);
		p.Cnd_itm_grp_nm3 = p.beansFactory.createTextField("Cnd.itm_grp_nm3");
		p.Cnd_itm_grp_cd4_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd4_Label");
		p.Cnd_itm_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd4");
		p.Cnd_itm_grp_cd4.setLabel(p.Cnd_itm_grp_cd4_Label);
		p.Cnd_itm_grp_nm4 = p.beansFactory.createTextField("Cnd.itm_grp_nm4");
		p.Cnd_itm_grp_cd5_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd5_Label");
		p.Cnd_itm_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd5");
		p.Cnd_itm_grp_cd5.setLabel(p.Cnd_itm_grp_cd5_Label);
		p.Cnd_itm_grp_nm5 = p.beansFactory.createTextField("Cnd.itm_grp_nm5");
		p.Cnd_itm_grp_cd6_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd6_Label");
		p.Cnd_itm_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd6");
		p.Cnd_itm_grp_cd6.setLabel(p.Cnd_itm_grp_cd6_Label);
		p.Cnd_itm_grp_nm6 = p.beansFactory.createTextField("Cnd.itm_grp_nm6");
		p.Cnd_itm_grp_cd7_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd7_Label");
		p.Cnd_itm_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd7");
		p.Cnd_itm_grp_cd7.setLabel(p.Cnd_itm_grp_cd7_Label);
		p.Cnd_itm_grp_nm7 = p.beansFactory.createTextField("Cnd.itm_grp_nm7");
		p.Cnd_itm_grp_cd8_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd8_Label");
		p.Cnd_itm_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd8");
		p.Cnd_itm_grp_cd8.setLabel(p.Cnd_itm_grp_cd8_Label);
		p.Cnd_itm_grp_nm8 = p.beansFactory.createTextField("Cnd.itm_grp_nm8");
		p.Cnd_itm_grp_cd9_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd9_Label");
		p.Cnd_itm_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd9");
		p.Cnd_itm_grp_cd9.setLabel(p.Cnd_itm_grp_cd9_Label);
		p.Cnd_itm_grp_nm9 = p.beansFactory.createTextField("Cnd.itm_grp_nm9");
		p.Cnd_itm_grp_cd10_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd10_Label");
		p.Cnd_itm_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd10");
		p.Cnd_itm_grp_cd10.setLabel(p.Cnd_itm_grp_cd10_Label);
		p.Cnd_itm_grp_nm10 = p.beansFactory.createTextField("Cnd.itm_grp_nm10");
		p.Cnd_bp_grp_cd1_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd1_Label");
		p.Cnd_bp_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd1");
		p.Cnd_bp_grp_cd1.setLabel(p.Cnd_bp_grp_cd1_Label);
		p.Cnd_bp_grp_nm1 = p.beansFactory.createTextField("Cnd.bp_grp_nm1");
		p.Cnd_bp_grp_cd2_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd2_Label");
		p.Cnd_bp_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd2");
		p.Cnd_bp_grp_cd2.setLabel(p.Cnd_bp_grp_cd2_Label);
		p.Cnd_bp_grp_nm2 = p.beansFactory.createTextField("Cnd.bp_grp_nm2");
		p.Cnd_bp_grp_cd3_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd3_Label");
		p.Cnd_bp_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd3");
		p.Cnd_bp_grp_cd3.setLabel(p.Cnd_bp_grp_cd3_Label);
		p.Cnd_bp_grp_nm3 = p.beansFactory.createTextField("Cnd.bp_grp_nm3");
		p.Cnd_bp_grp_cd4_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd4_Label");
		p.Cnd_bp_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd4");
		p.Cnd_bp_grp_cd4.setLabel(p.Cnd_bp_grp_cd4_Label);
		p.Cnd_bp_grp_nm4 = p.beansFactory.createTextField("Cnd.bp_grp_nm4");
		p.Cnd_bp_grp_cd5_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd5_Label");
		p.Cnd_bp_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd5");
		p.Cnd_bp_grp_cd5.setLabel(p.Cnd_bp_grp_cd5_Label);
		p.Cnd_bp_grp_nm5 = p.beansFactory.createTextField("Cnd.bp_grp_nm5");
		p.Cnd_bp_grp_cd6_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd6_Label");
		p.Cnd_bp_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd6");
		p.Cnd_bp_grp_cd6.setLabel(p.Cnd_bp_grp_cd6_Label);
		p.Cnd_bp_grp_nm6 = p.beansFactory.createTextField("Cnd.bp_grp_nm6");
		p.Cnd_bp_grp_cd7_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd7_Label");
		p.Cnd_bp_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd7");
		p.Cnd_bp_grp_cd7.setLabel(p.Cnd_bp_grp_cd7_Label);
		p.Cnd_bp_grp_nm7 = p.beansFactory.createTextField("Cnd.bp_grp_nm7");
		p.Cnd_bp_grp_cd8_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd8_Label");
		p.Cnd_bp_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd8");
		p.Cnd_bp_grp_cd8.setLabel(p.Cnd_bp_grp_cd8_Label);
		p.Cnd_bp_grp_nm8 = p.beansFactory.createTextField("Cnd.bp_grp_nm8");
		p.Cnd_bp_grp_cd9_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd9_Label");
		p.Cnd_bp_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd9");
		p.Cnd_bp_grp_cd9.setLabel(p.Cnd_bp_grp_cd9_Label);
		p.Cnd_bp_grp_nm9 = p.beansFactory.createTextField("Cnd.bp_grp_nm9");
		p.Cnd_bp_grp_cd10_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd10_Label");
		p.Cnd_bp_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd10");
		p.Cnd_bp_grp_cd10.setLabel(p.Cnd_bp_grp_cd10_Label);
		p.Cnd_bp_grp_nm10 = p.beansFactory.createTextField("Cnd.bp_grp_nm10");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_alc_rec_typ_flg = p.beansFactory.createCheckBox("Cnd.alc_rec_typ_flg");
		p.Cnd_alc_ac_flg = p.beansFactory.createCheckBox("Cnd.alc_ac_flg");
		p.Cnd_alc_ac_grp1_flg = p.beansFactory.createCheckBox("Cnd.alc_ac_grp1_flg");
		p.Cnd_alc_ac_grp2_flg = p.beansFactory.createCheckBox("Cnd.alc_ac_grp2_flg");
		p.Cnd_alc_ac_grp3_flg = p.beansFactory.createCheckBox("Cnd.alc_ac_grp3_flg");
		p.Cnd_dpt_flg = p.beansFactory.createCheckBox("Cnd.dpt_flg");
		p.Cnd_loc_flg = p.beansFactory.createCheckBox("Cnd.loc_flg");
		p.Cnd_oper_flg = p.beansFactory.createCheckBox("Cnd.oper_flg");
		p.Cnd_bp_flg = p.beansFactory.createCheckBox("Cnd.bp_flg");
		p.Cnd_ctg_flg = p.beansFactory.createCheckBox("Cnd.ctg_flg");
		p.Cnd_itm_flg = p.beansFactory.createCheckBox("Cnd.itm_flg");
		p.Cnd_itm_typ_flg = p.beansFactory.createCheckBox("Cnd.itm_typ_flg");
		p.Cnd_itm_typ_d_flg = p.beansFactory.createCheckBox("Cnd.itm_typ_d_flg");
		p.Cnd_lot_flg = p.beansFactory.createCheckBox("Cnd.lot_flg");
		p.Cnd_sublot_flg = p.beansFactory.createCheckBox("Cnd.sublot_flg");
		p.Cnd_sno1_flg = p.beansFactory.createCheckBox("Cnd.sno1_flg");
		p.Cnd_sno2_flg = p.beansFactory.createCheckBox("Cnd.sno2_flg");
		p.Cnd_sno3_flg = p.beansFactory.createCheckBox("Cnd.sno3_flg");
		p.Cnd_sno4_flg = p.beansFactory.createCheckBox("Cnd.sno4_flg");
		p.Cnd_itm_grp_flg1 = p.beansFactory.createCheckBox("Cnd.itm_grp_flg1");
		p.Cnd_itm_grp_flg2 = p.beansFactory.createCheckBox("Cnd.itm_grp_flg2");
		p.Cnd_itm_grp_flg3 = p.beansFactory.createCheckBox("Cnd.itm_grp_flg3");
		p.Cnd_itm_grp_flg4 = p.beansFactory.createCheckBox("Cnd.itm_grp_flg4");
		p.Cnd_itm_grp_flg5 = p.beansFactory.createCheckBox("Cnd.itm_grp_flg5");
		p.Cnd_itm_grp_flg6 = p.beansFactory.createCheckBox("Cnd.itm_grp_flg6");
		p.Cnd_itm_grp_flg7 = p.beansFactory.createCheckBox("Cnd.itm_grp_flg7");
		p.Cnd_itm_grp_flg8 = p.beansFactory.createCheckBox("Cnd.itm_grp_flg8");
		p.Cnd_itm_grp_flg9 = p.beansFactory.createCheckBox("Cnd.itm_grp_flg9");
		p.Cnd_itm_grp_flg10 = p.beansFactory.createCheckBox("Cnd.itm_grp_flg10");
		p.Cnd_bp_grp_flg1 = p.beansFactory.createCheckBox("Cnd.bp_grp_flg1");
		p.Cnd_bp_grp_flg2 = p.beansFactory.createCheckBox("Cnd.bp_grp_flg2");
		p.Cnd_bp_grp_flg3 = p.beansFactory.createCheckBox("Cnd.bp_grp_flg3");
		p.Cnd_bp_grp_flg4 = p.beansFactory.createCheckBox("Cnd.bp_grp_flg4");
		p.Cnd_bp_grp_flg5 = p.beansFactory.createCheckBox("Cnd.bp_grp_flg5");
		p.Cnd_bp_grp_flg6 = p.beansFactory.createCheckBox("Cnd.bp_grp_flg6");
		p.Cnd_bp_grp_flg7 = p.beansFactory.createCheckBox("Cnd.bp_grp_flg7");
		p.Cnd_bp_grp_flg8 = p.beansFactory.createCheckBox("Cnd.bp_grp_flg8");
		p.Cnd_bp_grp_flg9 = p.beansFactory.createCheckBox("Cnd.bp_grp_flg9");
		p.Cnd_bp_grp_flg10 = p.beansFactory.createCheckBox("Cnd.bp_grp_flg10");
		p.Cnd_select_all = p.beansFactory.createButton("Cnd.select_all", "no_border");
		p.Cnd_deselect_all = p.beansFactory.createButton("Cnd.deselect_all", "no_border");
		p.Cnd_disp_key = p.beansFactory.createCheckBox("Cnd.disp_key");
		p.Cnd_cur_cd = p.beansFactory.createTextField("Cnd.cur_cd");
		p.Cnd_amt_dec_place = p.beansFactory.createNumberField("Cnd.amt_dec_place");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTtl(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.TtlPanel = p.beansFactory.createPanel("Ttl");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispRslt(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.DispRsltPanel = p.beansFactory.createPanel("DispRslt");
		p.DispRsltScrollPane = p.beansFactory.createScrollPane("DispRslt.scroll");
		p.createDispRsltTable();
		// ブロックの項目の初期化
		p.columnDispRslt_wg_cd = p.beansFactory.createTableColumn("DispRslt.wg_cd", MCColumnType.TEXT);
		p.columnDispRslt_wg_nm = p.beansFactory.createTableColumn("DispRslt.wg_nm", MCColumnType.TEXT);
		p.columnDispRslt_alc_rec_typ = p.beansFactory.createTableColumn("DispRslt.alc_rec_typ", MCColumnType.TEXT);
		p.columnDispRslt_alc_rec_typ_nm = p.beansFactory.createTableColumn("DispRslt.alc_rec_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_alc_ac_cd = p.beansFactory.createTableColumn("DispRslt.alc_ac_cd", MCColumnType.TEXT);
		p.columnDispRslt_alc_ac_nm = p.beansFactory.createTableColumn("DispRslt.alc_ac_nm", MCColumnType.TEXT);
		p.columnDispRslt_alc_ac_grp_cd1 = p.beansFactory.createTableColumn("DispRslt.alc_ac_grp_cd1", MCColumnType.TEXT);
		p.columnDispRslt_alc_ac_grp_nm1 = p.beansFactory.createTableColumn("DispRslt.alc_ac_grp_nm1", MCColumnType.TEXT);
		p.columnDispRslt_alc_ac_grp_cd2 = p.beansFactory.createTableColumn("DispRslt.alc_ac_grp_cd2", MCColumnType.TEXT);
		p.columnDispRslt_alc_ac_grp_nm2 = p.beansFactory.createTableColumn("DispRslt.alc_ac_grp_nm2", MCColumnType.TEXT);
		p.columnDispRslt_alc_ac_grp_cd3 = p.beansFactory.createTableColumn("DispRslt.alc_ac_grp_cd3", MCColumnType.TEXT);
		p.columnDispRslt_alc_ac_grp_nm3 = p.beansFactory.createTableColumn("DispRslt.alc_ac_grp_nm3", MCColumnType.TEXT);
		p.columnDispRslt_dpt_cd = p.beansFactory.createTableColumn("DispRslt.dpt_cd", MCColumnType.TEXT);
		p.columnDispRslt_dpt_nm = p.beansFactory.createTableColumn("DispRslt.dpt_nm", MCColumnType.TEXT);
		p.columnDispRslt_loc_cd = p.beansFactory.createTableColumn("DispRslt.loc_cd", MCColumnType.TEXT);
		p.columnDispRslt_loc_nm = p.beansFactory.createTableColumn("DispRslt.loc_nm", MCColumnType.TEXT);
		p.columnDispRslt_oper_cd = p.beansFactory.createTableColumn("DispRslt.oper_cd", MCColumnType.TEXT);
		p.columnDispRslt_oper_nm = p.beansFactory.createTableColumn("DispRslt.oper_nm", MCColumnType.TEXT);
		p.columnDispRslt_bp_cd = p.beansFactory.createTableColumn("DispRslt.bp_cd", MCColumnType.TEXT);
		p.columnDispRslt_bp_nm = p.beansFactory.createTableColumn("DispRslt.bp_nm", MCColumnType.TEXT);
		p.columnDispRslt_ctg_cd = p.beansFactory.createTableColumn("DispRslt.ctg_cd", MCColumnType.TEXT);
		p.columnDispRslt_ctg_nm = p.beansFactory.createTableColumn("DispRslt.ctg_nm", MCColumnType.TEXT);
		p.columnDispRslt_itm_typ = p.beansFactory.createTableColumn("DispRslt.itm_typ", MCColumnType.TEXT);
		p.columnDispRslt_itm_typ_nm = p.beansFactory.createTableColumn("DispRslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("DispRslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDispRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("DispRslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_cd1 = p.beansFactory.createTableColumn("DispRslt.itm_grp_cd1", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_nm1 = p.beansFactory.createTableColumn("DispRslt.itm_grp_nm1", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_cd2 = p.beansFactory.createTableColumn("DispRslt.itm_grp_cd2", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_nm2 = p.beansFactory.createTableColumn("DispRslt.itm_grp_nm2", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_cd3 = p.beansFactory.createTableColumn("DispRslt.itm_grp_cd3", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_nm3 = p.beansFactory.createTableColumn("DispRslt.itm_grp_nm3", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_cd4 = p.beansFactory.createTableColumn("DispRslt.itm_grp_cd4", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_nm4 = p.beansFactory.createTableColumn("DispRslt.itm_grp_nm4", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_cd5 = p.beansFactory.createTableColumn("DispRslt.itm_grp_cd5", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_nm5 = p.beansFactory.createTableColumn("DispRslt.itm_grp_nm5", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_cd6 = p.beansFactory.createTableColumn("DispRslt.itm_grp_cd6", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_nm6 = p.beansFactory.createTableColumn("DispRslt.itm_grp_nm6", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_cd7 = p.beansFactory.createTableColumn("DispRslt.itm_grp_cd7", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_nm7 = p.beansFactory.createTableColumn("DispRslt.itm_grp_nm7", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_cd8 = p.beansFactory.createTableColumn("DispRslt.itm_grp_cd8", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_nm8 = p.beansFactory.createTableColumn("DispRslt.itm_grp_nm8", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_cd9 = p.beansFactory.createTableColumn("DispRslt.itm_grp_cd9", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_nm9 = p.beansFactory.createTableColumn("DispRslt.itm_grp_nm9", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_cd10 = p.beansFactory.createTableColumn("DispRslt.itm_grp_cd10", MCColumnType.TEXT);
		p.columnDispRslt_itm_grp_nm10 = p.beansFactory.createTableColumn("DispRslt.itm_grp_nm10", MCColumnType.TEXT);
		p.columnDispRslt_lot_no = p.beansFactory.createTableColumn("DispRslt.lot_no", MCColumnType.TEXT);
		p.columnDispRslt_sublot_no = p.beansFactory.createTableColumn("DispRslt.sublot_no", MCColumnType.TEXT);
		p.columnDispRslt_sno1 = p.beansFactory.createTableColumn("DispRslt.sno1", MCColumnType.TEXT);
		p.columnDispRslt_sno2 = p.beansFactory.createTableColumn("DispRslt.sno2", MCColumnType.TEXT);
		p.columnDispRslt_sno3 = p.beansFactory.createTableColumn("DispRslt.sno3", MCColumnType.TEXT);
		p.columnDispRslt_sno4 = p.beansFactory.createTableColumn("DispRslt.sno4", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_cd1 = p.beansFactory.createTableColumn("DispRslt.bp_grp_cd1", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_nm1 = p.beansFactory.createTableColumn("DispRslt.bp_grp_nm1", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_cd2 = p.beansFactory.createTableColumn("DispRslt.bp_grp_cd2", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_nm2 = p.beansFactory.createTableColumn("DispRslt.bp_grp_nm2", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_cd3 = p.beansFactory.createTableColumn("DispRslt.bp_grp_cd3", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_nm3 = p.beansFactory.createTableColumn("DispRslt.bp_grp_nm3", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_cd4 = p.beansFactory.createTableColumn("DispRslt.bp_grp_cd4", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_nm4 = p.beansFactory.createTableColumn("DispRslt.bp_grp_nm4", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_cd5 = p.beansFactory.createTableColumn("DispRslt.bp_grp_cd5", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_nm5 = p.beansFactory.createTableColumn("DispRslt.bp_grp_nm5", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_cd6 = p.beansFactory.createTableColumn("DispRslt.bp_grp_cd6", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_nm6 = p.beansFactory.createTableColumn("DispRslt.bp_grp_nm6", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_cd7 = p.beansFactory.createTableColumn("DispRslt.bp_grp_cd7", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_nm7 = p.beansFactory.createTableColumn("DispRslt.bp_grp_nm7", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_cd8 = p.beansFactory.createTableColumn("DispRslt.bp_grp_cd8", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_nm8 = p.beansFactory.createTableColumn("DispRslt.bp_grp_nm8", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_cd9 = p.beansFactory.createTableColumn("DispRslt.bp_grp_cd9", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_nm9 = p.beansFactory.createTableColumn("DispRslt.bp_grp_nm9", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_cd10 = p.beansFactory.createTableColumn("DispRslt.bp_grp_cd10", MCColumnType.TEXT);
		p.columnDispRslt_bp_grp_nm10 = p.beansFactory.createTableColumn("DispRslt.bp_grp_nm10", MCColumnType.TEXT);
		p.columnDispRslt_elm_no = p.beansFactory.createTableColumn("DispRslt.elm_no", MCColumnType.NUMBER);
		p.columnDispRslt_elm = p.beansFactory.createTableColumn("DispRslt.elm", MCColumnType.TEXT);
		p.columnDispRslt_elm_nm = p.beansFactory.createTableColumn("DispRslt.elm_nm", MCColumnType.TEXT);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBGP_MlyAlcAmtSrch p) {
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
	protected static void jbInitTop(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.DispRsltPanel);
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
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MGBGP_MlyAlcAmtSrch p) {
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
	protected static void jbInitTab1(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.Cnd3Panel, null);
		p.Tab3Panel.setLastBeans(p.Cnd3Panel);
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.TtlPanel, null);
		p.Tab4Panel.setLastBeans(p.TtlPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_pre_alc_typ_Group);
		p.Cnd_pre_alc_typ_Group.setFirstBeans(p.Cnd_pre_alc_typ_BEFORE);
		p.Cnd_pre_alc_typ_BEFORE.setActionCommand("0");
		p.Cnd_pre_alc_typ_Group.add(p.Cnd_pre_alc_typ_BEFORE);
		p.ScreenOpePanel.add(p.Cnd_pre_alc_typ_BEFORE);
		p.Cnd_pre_alc_typ_BEFORE.setNextBeans(p.Cnd_pre_alc_typ_AFTER);
		p.Cnd_pre_alc_typ_AFTER.setActionCommand("1");
		p.Cnd_pre_alc_typ_Group.add(p.Cnd_pre_alc_typ_AFTER);
		p.ScreenOpePanel.add(p.Cnd_pre_alc_typ_AFTER);
		p.Cnd_pre_alc_typ_Group.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.pre_alc_typ_META);
		p.Cnd_pln_calc_ctg_cd.setListType(MCListType.FREE);
		p.Cnd_pln_calc_ctg_cd.setLinkBeans(p.Cnd_pln_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_pln_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_pln_calc_ctg_cd);
		p.CndPanel.setLastBeans(p.Cnd_pln_calc_ctg_cd);
		p.Cnd_pln_calc_ctg_cd.setNextBeans(p.Cnd_pln_calc_ctg_nm);
		p.Cnd_pln_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.pln_calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_pln_calc_ctg_nm);
		p.Cnd_pln_calc_ctg_nm.setNextBeans(p.Cnd_act_calc_ctg_cd);
		p.Cnd_pln_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.pln_calc_ctg_nm_META);
		p.Cnd_act_calc_ctg_cd.setListType(MCListType.FREE);
		p.Cnd_act_calc_ctg_cd.setLinkBeans(p.Cnd_act_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_act_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_act_calc_ctg_cd);
		p.Cnd_act_calc_ctg_cd.setNextBeans(p.Cnd_act_calc_ctg_nm);
		p.Cnd_act_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.act_calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_act_calc_ctg_nm);
		p.Cnd_act_calc_ctg_nm.setNextBeans(p.Cnd_term_p_PPanel);
		p.Cnd_act_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.act_calc_ctg_nm_META);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_term_p_PPanel.Term_term.setListType(MCListType.FREE);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_alc_rec_typ);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_alc_rec_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_rec_typ, true);
		p.Cnd_alc_rec_typ.setLinkBeans(p.Cnd_alc_rec_typ_nm);
		p.CndPanel.add(p.Cnd_alc_rec_typ_Label);
		p.CndPanel.add(p.Cnd_alc_rec_typ);
		p.Cnd_alc_rec_typ.setNextBeans(p.Cnd_alc_rec_typ_nm);
		p.Cnd_alc_rec_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.alc_rec_typ_META);
		p.CndPanel.add(p.Cnd_alc_rec_typ_nm);
		p.Cnd_alc_rec_typ_nm.setNextBeans(p.Cnd_alc_ac_cd);
		p.Cnd_alc_rec_typ_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.alc_rec_typ_nm_META);
		p.Cnd_alc_ac_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_ac_cd, true);
		p.Cnd_alc_ac_cd.setLinkBeans(p.Cnd_alc_ac_nm);
		p.CndPanel.add(p.Cnd_alc_ac_cd_Label);
		p.CndPanel.add(p.Cnd_alc_ac_cd);
		p.Cnd_alc_ac_cd.setNextBeans(p.Cnd_alc_ac_nm);
		p.Cnd_alc_ac_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.alc_ac_cd_META);
		p.CndPanel.add(p.Cnd_alc_ac_nm);
		p.Cnd_alc_ac_nm.setNextBeans(p.Cnd_alc_ac_grp_cd1);
		p.Cnd_alc_ac_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.alc_ac_nm_META);
		p.setPluralValueEnable(p.Cnd_alc_ac_nm, true);
		p.Cnd_alc_ac_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_cd1, true);
		p.Cnd_alc_ac_grp_cd1.setLinkBeans(p.Cnd_alc_ac_grp_nm1);
		p.CndPanel.add(p.Cnd_alc_ac_grp_cd1_Label);
		p.CndPanel.add(p.Cnd_alc_ac_grp_cd1);
		p.Cnd_alc_ac_grp_cd1.setNextBeans(p.Cnd_alc_ac_grp_nm1);
		p.Cnd_alc_ac_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.alc_ac_grp_cd1_META);
		p.CndPanel.add(p.Cnd_alc_ac_grp_nm1);
		p.Cnd_alc_ac_grp_nm1.setNextBeans(p.Cnd_alc_ac_grp_cd2);
		p.Cnd_alc_ac_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.alc_ac_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_nm1, true);
		p.Cnd_alc_ac_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_cd2, true);
		p.Cnd_alc_ac_grp_cd2.setLinkBeans(p.Cnd_alc_ac_grp_nm2);
		p.CndPanel.add(p.Cnd_alc_ac_grp_cd2_Label);
		p.CndPanel.add(p.Cnd_alc_ac_grp_cd2);
		p.Cnd_alc_ac_grp_cd2.setNextBeans(p.Cnd_alc_ac_grp_nm2);
		p.Cnd_alc_ac_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.alc_ac_grp_cd2_META);
		p.CndPanel.add(p.Cnd_alc_ac_grp_nm2);
		p.Cnd_alc_ac_grp_nm2.setNextBeans(p.Cnd_alc_ac_grp_cd3);
		p.Cnd_alc_ac_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.alc_ac_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_nm2, true);
		p.Cnd_alc_ac_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_cd3, true);
		p.Cnd_alc_ac_grp_cd3.setLinkBeans(p.Cnd_alc_ac_grp_nm3);
		p.CndPanel.add(p.Cnd_alc_ac_grp_cd3_Label);
		p.CndPanel.add(p.Cnd_alc_ac_grp_cd3);
		p.Cnd_alc_ac_grp_cd3.setNextBeans(p.Cnd_alc_ac_grp_nm3);
		p.Cnd_alc_ac_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.alc_ac_grp_cd3_META);
		p.CndPanel.add(p.Cnd_alc_ac_grp_nm3);
		p.Cnd_alc_ac_grp_nm3.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_alc_ac_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.alc_ac_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_nm3, true);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.Cnd_dpt_cd.setLinkBeans(p.Cnd_dpt_nm);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.dpt_cd_META);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_oper_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_oper_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_cd, true);
		p.Cnd_oper_cd.setLinkBeans(p.Cnd_oper_nm);
		p.CndPanel.add(p.Cnd_oper_cd_Label);
		p.CndPanel.add(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setNextBeans(p.Cnd_oper_nm);
		p.Cnd_oper_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.oper_cd_META);
		p.CndPanel.add(p.Cnd_oper_nm);
		p.Cnd_oper_nm.setNextBeans(p.Cnd_bp_cd);
		p.Cnd_oper_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.oper_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_nm, true);
		p.CndPanel.add(p.Cnd_bp_cd_Label);
		p.CndPanel.add(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_cd, true);
		p.CndPanel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_ctg_cd);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_nm, true);
		p.Cnd_ctg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ctg_cd, true);
		p.Cnd_ctg_cd.setLinkBeans(p.Cnd_ctg_nm);
		p.CndPanel.add(p.Cnd_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_ctg_cd);
		p.Cnd_ctg_cd.setNextBeans(p.Cnd_ctg_nm);
		p.Cnd_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.ctg_cd_META);
		p.CndPanel.add(p.Cnd_ctg_nm);
		p.Cnd_ctg_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.ctg_nm_META);
		p.setPluralValueEnable(p.Cnd_ctg_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno1);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.sublot_no_META);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno1_Label);
		p.CndPanel.add(p.Cnd_sno1);
		p.Cnd_sno1.setNextBeans(p.Cnd_sno2);
		p.Cnd_sno1.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.sno1_META);
		p.setPluralValueEnable(p.Cnd_sno1, true);
		p.CndPanel.add(p.Cnd_sno2_Label);
		p.CndPanel.add(p.Cnd_sno2);
		p.Cnd_sno2.setNextBeans(p.Cnd_sno3);
		p.Cnd_sno2.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.sno2_META);
		p.setPluralValueEnable(p.Cnd_sno2, true);
		p.CndPanel.add(p.Cnd_sno3_Label);
		p.CndPanel.add(p.Cnd_sno3);
		p.Cnd_sno3.setNextBeans(p.Cnd_sno4);
		p.Cnd_sno3.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.sno3_META);
		p.setPluralValueEnable(p.Cnd_sno3, true);
		p.CndPanel.add(p.Cnd_sno4_Label);
		p.CndPanel.add(p.Cnd_sno4);
		p.Cnd_sno4.setNextBeans(p.Cnd_cur_cd);
		p.Cnd_sno4.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.sno4_META);
		p.setPluralValueEnable(p.Cnd_sno4, true);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
		p.Cnd_bp_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd1, true);
		p.Cnd_bp_grp_cd1.setLinkBeans(p.Cnd_bp_grp_nm1);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd1_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd1);
		p.Cnd3Panel.setLastBeans(p.Cnd_bp_grp_cd1);
		p.Cnd_bp_grp_cd1.setNextBeans(p.Cnd_bp_grp_nm1);
		p.Cnd_bp_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_cd1_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm1);
		p.Cnd_bp_grp_nm1.setNextBeans(p.Cnd_bp_grp_cd2);
		p.Cnd_bp_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm1, true);
		p.Cnd_bp_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd2, true);
		p.Cnd_bp_grp_cd2.setLinkBeans(p.Cnd_bp_grp_nm2);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd2_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd2);
		p.Cnd_bp_grp_cd2.setNextBeans(p.Cnd_bp_grp_nm2);
		p.Cnd_bp_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_cd2_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm2);
		p.Cnd_bp_grp_nm2.setNextBeans(p.Cnd_bp_grp_cd3);
		p.Cnd_bp_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm2, true);
		p.Cnd_bp_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd3, true);
		p.Cnd_bp_grp_cd3.setLinkBeans(p.Cnd_bp_grp_nm3);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd3_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd3);
		p.Cnd_bp_grp_cd3.setNextBeans(p.Cnd_bp_grp_nm3);
		p.Cnd_bp_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_cd3_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm3);
		p.Cnd_bp_grp_nm3.setNextBeans(p.Cnd_bp_grp_cd4);
		p.Cnd_bp_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm3, true);
		p.Cnd_bp_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd4, true);
		p.Cnd_bp_grp_cd4.setLinkBeans(p.Cnd_bp_grp_nm4);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd4_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd4);
		p.Cnd_bp_grp_cd4.setNextBeans(p.Cnd_bp_grp_nm4);
		p.Cnd_bp_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_cd4_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm4);
		p.Cnd_bp_grp_nm4.setNextBeans(p.Cnd_bp_grp_cd5);
		p.Cnd_bp_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm4, true);
		p.Cnd_bp_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd5, true);
		p.Cnd_bp_grp_cd5.setLinkBeans(p.Cnd_bp_grp_nm5);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd5_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd5);
		p.Cnd_bp_grp_cd5.setNextBeans(p.Cnd_bp_grp_nm5);
		p.Cnd_bp_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_cd5_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm5);
		p.Cnd_bp_grp_nm5.setNextBeans(p.Cnd_bp_grp_cd6);
		p.Cnd_bp_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm5, true);
		p.Cnd_bp_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd6, true);
		p.Cnd_bp_grp_cd6.setLinkBeans(p.Cnd_bp_grp_nm6);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd6_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd6);
		p.Cnd_bp_grp_cd6.setNextBeans(p.Cnd_bp_grp_nm6);
		p.Cnd_bp_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_cd6_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm6);
		p.Cnd_bp_grp_nm6.setNextBeans(p.Cnd_bp_grp_cd7);
		p.Cnd_bp_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm6, true);
		p.Cnd_bp_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd7, true);
		p.Cnd_bp_grp_cd7.setLinkBeans(p.Cnd_bp_grp_nm7);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd7_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd7);
		p.Cnd_bp_grp_cd7.setNextBeans(p.Cnd_bp_grp_nm7);
		p.Cnd_bp_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_cd7_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm7);
		p.Cnd_bp_grp_nm7.setNextBeans(p.Cnd_bp_grp_cd8);
		p.Cnd_bp_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm7, true);
		p.Cnd_bp_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd8, true);
		p.Cnd_bp_grp_cd8.setLinkBeans(p.Cnd_bp_grp_nm8);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd8_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd8);
		p.Cnd_bp_grp_cd8.setNextBeans(p.Cnd_bp_grp_nm8);
		p.Cnd_bp_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_cd8_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm8);
		p.Cnd_bp_grp_nm8.setNextBeans(p.Cnd_bp_grp_cd9);
		p.Cnd_bp_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm8, true);
		p.Cnd_bp_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd9, true);
		p.Cnd_bp_grp_cd9.setLinkBeans(p.Cnd_bp_grp_nm9);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd9_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd9);
		p.Cnd_bp_grp_cd9.setNextBeans(p.Cnd_bp_grp_nm9);
		p.Cnd_bp_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_cd9_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm9);
		p.Cnd_bp_grp_nm9.setNextBeans(p.Cnd_bp_grp_cd10);
		p.Cnd_bp_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm9, true);
		p.Cnd_bp_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd10, true);
		p.Cnd_bp_grp_cd10.setLinkBeans(p.Cnd_bp_grp_nm10);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd10_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd10);
		p.Cnd_bp_grp_cd10.setNextBeans(p.Cnd_bp_grp_nm10);
		p.Cnd_bp_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_cd10_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm10);
		p.Cnd_bp_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm10, true);
		p.TtlPanel.add(p.Cnd_wg_flg);
		p.TtlPanel.setLastBeans(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setNextBeans(p.Cnd_alc_rec_typ_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.wg_flg_META);
		p.TtlPanel.add(p.Cnd_alc_rec_typ_flg);
		p.Cnd_alc_rec_typ_flg.setNextBeans(p.Cnd_alc_ac_flg);
		p.Cnd_alc_rec_typ_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.alc_rec_typ_flg_META);
		p.TtlPanel.add(p.Cnd_alc_ac_flg);
		p.Cnd_alc_ac_flg.setNextBeans(p.Cnd_alc_ac_grp1_flg);
		p.Cnd_alc_ac_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.alc_ac_flg_META);
		p.TtlPanel.add(p.Cnd_alc_ac_grp1_flg);
		p.Cnd_alc_ac_grp1_flg.setNextBeans(p.Cnd_alc_ac_grp2_flg);
		p.Cnd_alc_ac_grp1_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.alc_ac_grp1_flg_META);
		p.TtlPanel.add(p.Cnd_alc_ac_grp2_flg);
		p.Cnd_alc_ac_grp2_flg.setNextBeans(p.Cnd_alc_ac_grp3_flg);
		p.Cnd_alc_ac_grp2_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.alc_ac_grp2_flg_META);
		p.TtlPanel.add(p.Cnd_alc_ac_grp3_flg);
		p.Cnd_alc_ac_grp3_flg.setNextBeans(p.Cnd_dpt_flg);
		p.Cnd_alc_ac_grp3_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.alc_ac_grp3_flg_META);
		p.TtlPanel.add(p.Cnd_dpt_flg);
		p.Cnd_dpt_flg.setNextBeans(p.Cnd_loc_flg);
		p.Cnd_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.dpt_flg_META);
		p.TtlPanel.add(p.Cnd_loc_flg);
		p.Cnd_loc_flg.setNextBeans(p.Cnd_oper_flg);
		p.Cnd_loc_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.loc_flg_META);
		p.TtlPanel.add(p.Cnd_oper_flg);
		p.Cnd_oper_flg.setNextBeans(p.Cnd_bp_flg);
		p.Cnd_oper_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.oper_flg_META);
		p.TtlPanel.add(p.Cnd_bp_flg);
		p.Cnd_bp_flg.setNextBeans(p.Cnd_ctg_flg);
		p.Cnd_bp_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_flg_META);
		p.TtlPanel.add(p.Cnd_ctg_flg);
		p.Cnd_ctg_flg.setNextBeans(p.Cnd_itm_flg);
		p.Cnd_ctg_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.ctg_flg_META);
		p.TtlPanel.add(p.Cnd_itm_flg);
		p.Cnd_itm_flg.setNextBeans(p.Cnd_itm_typ_flg);
		p.Cnd_itm_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_flg_META);
		p.TtlPanel.add(p.Cnd_itm_typ_flg);
		p.Cnd_itm_typ_flg.setNextBeans(p.Cnd_itm_typ_d_flg);
		p.Cnd_itm_typ_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_typ_flg_META);
		p.TtlPanel.add(p.Cnd_itm_typ_d_flg);
		p.Cnd_itm_typ_d_flg.setNextBeans(p.Cnd_lot_flg);
		p.Cnd_itm_typ_d_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_typ_d_flg_META);
		p.TtlPanel.add(p.Cnd_lot_flg);
		p.Cnd_lot_flg.setNextBeans(p.Cnd_sublot_flg);
		p.Cnd_lot_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.lot_flg_META);
		p.TtlPanel.add(p.Cnd_sublot_flg);
		p.Cnd_sublot_flg.setNextBeans(p.Cnd_sno1_flg);
		p.Cnd_sublot_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.sublot_flg_META);
		p.TtlPanel.add(p.Cnd_sno1_flg);
		p.Cnd_sno1_flg.setNextBeans(p.Cnd_sno2_flg);
		p.Cnd_sno1_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.sno1_flg_META);
		p.TtlPanel.add(p.Cnd_sno2_flg);
		p.Cnd_sno2_flg.setNextBeans(p.Cnd_sno3_flg);
		p.Cnd_sno2_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.sno2_flg_META);
		p.TtlPanel.add(p.Cnd_sno3_flg);
		p.Cnd_sno3_flg.setNextBeans(p.Cnd_sno4_flg);
		p.Cnd_sno3_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.sno3_flg_META);
		p.TtlPanel.add(p.Cnd_sno4_flg);
		p.Cnd_sno4_flg.setNextBeans(p.Cnd_itm_grp_flg1);
		p.Cnd_sno4_flg.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.sno4_flg_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg1);
		p.Cnd_itm_grp_flg1.setNextBeans(p.Cnd_itm_grp_flg2);
		p.Cnd_itm_grp_flg1.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_flg1_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg2);
		p.Cnd_itm_grp_flg2.setNextBeans(p.Cnd_itm_grp_flg3);
		p.Cnd_itm_grp_flg2.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_flg2_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg3);
		p.Cnd_itm_grp_flg3.setNextBeans(p.Cnd_itm_grp_flg4);
		p.Cnd_itm_grp_flg3.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_flg3_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg4);
		p.Cnd_itm_grp_flg4.setNextBeans(p.Cnd_itm_grp_flg5);
		p.Cnd_itm_grp_flg4.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_flg4_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg5);
		p.Cnd_itm_grp_flg5.setNextBeans(p.Cnd_itm_grp_flg6);
		p.Cnd_itm_grp_flg5.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_flg5_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg6);
		p.Cnd_itm_grp_flg6.setNextBeans(p.Cnd_itm_grp_flg7);
		p.Cnd_itm_grp_flg6.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_flg6_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg7);
		p.Cnd_itm_grp_flg7.setNextBeans(p.Cnd_itm_grp_flg8);
		p.Cnd_itm_grp_flg7.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_flg7_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg8);
		p.Cnd_itm_grp_flg8.setNextBeans(p.Cnd_itm_grp_flg9);
		p.Cnd_itm_grp_flg8.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_flg8_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg9);
		p.Cnd_itm_grp_flg9.setNextBeans(p.Cnd_itm_grp_flg10);
		p.Cnd_itm_grp_flg9.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_flg9_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg10);
		p.Cnd_itm_grp_flg10.setNextBeans(p.Cnd_bp_grp_flg1);
		p.Cnd_itm_grp_flg10.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.itm_grp_flg10_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg1);
		p.Cnd_bp_grp_flg1.setNextBeans(p.Cnd_bp_grp_flg2);
		p.Cnd_bp_grp_flg1.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_flg1_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg2);
		p.Cnd_bp_grp_flg2.setNextBeans(p.Cnd_bp_grp_flg3);
		p.Cnd_bp_grp_flg2.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_flg2_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg3);
		p.Cnd_bp_grp_flg3.setNextBeans(p.Cnd_bp_grp_flg4);
		p.Cnd_bp_grp_flg3.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_flg3_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg4);
		p.Cnd_bp_grp_flg4.setNextBeans(p.Cnd_bp_grp_flg5);
		p.Cnd_bp_grp_flg4.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_flg4_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg5);
		p.Cnd_bp_grp_flg5.setNextBeans(p.Cnd_bp_grp_flg6);
		p.Cnd_bp_grp_flg5.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_flg5_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg6);
		p.Cnd_bp_grp_flg6.setNextBeans(p.Cnd_bp_grp_flg7);
		p.Cnd_bp_grp_flg6.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_flg6_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg7);
		p.Cnd_bp_grp_flg7.setNextBeans(p.Cnd_bp_grp_flg8);
		p.Cnd_bp_grp_flg7.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_flg7_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg8);
		p.Cnd_bp_grp_flg8.setNextBeans(p.Cnd_bp_grp_flg9);
		p.Cnd_bp_grp_flg8.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_flg8_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg9);
		p.Cnd_bp_grp_flg9.setNextBeans(p.Cnd_bp_grp_flg10);
		p.Cnd_bp_grp_flg9.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_flg9_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg10);
		p.Cnd_bp_grp_flg10.setNextBeans(p.Cnd_select_all);
		p.Cnd_bp_grp_flg10.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.bp_grp_flg10_META);
		p.Cnd_select_all.setIcon("SELECT_ALL");
		p.Cnd_select_all.setFunctionKey(MCFunctionKey.F13);
		p.TtlPanel.add(p.Cnd_select_all);
		p.Cnd_select_all.setNextBeans(p.Cnd_deselect_all);
		p.Cnd_deselect_all.setIcon("DESELECT_ALL");
		p.Cnd_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.TtlPanel.add(p.Cnd_deselect_all);
		p.LPnlPanel.add(p.Cnd_disp_key);
		p.LPnlPanel.setLastBeans(p.Cnd_disp_key);
		p.Cnd_disp_key.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.disp_key_META);
		p.CndPanel.add(p.Cnd_cur_cd);
		p.Cnd_cur_cd.setNextBeans(p.Cnd_amt_dec_place);
		p.Cnd_cur_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.cur_cd_META);
		p.CndPanel.add(p.Cnd_amt_dec_place);
		p.Cnd_amt_dec_place.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0060.CndR.amt_dec_place_META);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTtl(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.TtlPanel.setValueCheck(false);
		p.TtlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [DispRslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispRslt(MGBGP_MlyAlcAmtSrch p) {
		// ブロック関連の初期化
		p.add(p.DispRsltPanel);
		p.DispRsltPanel.add(p.DispRsltScrollPane);
		p.DispRsltPanel.setLastBeans(p.DispRsltTable);
		p.DispRsltScrollPane.setViewportView(p.DispRsltTable);
		p.DispRsltTable.setList(p.getDispRsltL());
		p.DispRsltTable.setStatusColumnVisible(false);
		p.DispRsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
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
		MGBGP_MlyAlcAmtSrch_MC.mcInitScreenOpe((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.mcInitTop((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.mcInitFold((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.mcInitTab1((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.mcInitTab2((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.mcInitTab3((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.mcInitTab4((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.mcInitCnd((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.mcInitCnd2((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.mcInitCnd3((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.mcInitTtl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.mcInitLPnl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.mcInitCtrl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.mcInitDispRslt((MGBGP_MlyAlcAmtSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBGP_MlyAlcAmtSrch_MC.statusInitSRCH_ScreenOpe((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitSRCH_Top((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitSRCH_Fold((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitSRCH_Tab1((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitSRCH_Tab2((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitSRCH_Tab3((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitSRCH_Tab4((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitSRCH_Cnd((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitSRCH_Cnd2((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitSRCH_Cnd3((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitSRCH_Ttl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitSRCH_LPnl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitSRCH_Ctrl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitSRCH_DispRslt((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitSRCH_Rslt((MGBGP_MlyAlcAmtSrch)this);

		// [REF]ステータスのモードの設定
		MGBGP_MlyAlcAmtSrch_MC.statusInitREF_ScreenOpe((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitREF_Top((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitREF_Fold((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitREF_Tab1((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitREF_Tab2((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitREF_Tab3((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitREF_Tab4((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitREF_Cnd((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitREF_Cnd2((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitREF_Cnd3((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitREF_Ttl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitREF_LPnl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitREF_Ctrl((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitREF_DispRslt((MGBGP_MlyAlcAmtSrch)this);
		MGBGP_MlyAlcAmtSrch_MC.statusInitREF_Rslt((MGBGP_MlyAlcAmtSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBGP_MlyAlcAmtSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBGP_MlyAlcAmtSrch p) {
		p.Cnd_pre_alc_typ_Group.addAllListener(p);
		p.Cnd_pre_alc_typ_BEFORE.addAllListener(p);
		p.Cnd_pre_alc_typ_AFTER.addAllListener(p);
		p.Cnd_pln_calc_ctg_cd.setListListener(p);
		p.Cnd_pln_calc_ctg_cd.addAllListener(p);
		p.Cnd_pln_calc_ctg_nm.setListListener(p);
		p.Cnd_pln_calc_ctg_nm.addAllListener(p);
		p.Cnd_act_calc_ctg_cd.setListListener(p);
		p.Cnd_act_calc_ctg_cd.addAllListener(p);
		p.Cnd_act_calc_ctg_nm.setListListener(p);
		p.Cnd_act_calc_ctg_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_alc_rec_typ.setListListener(p);
		p.Cnd_alc_rec_typ.addAllListener(p);
		p.Cnd_alc_rec_typ_nm.setListListener(p);
		p.Cnd_alc_rec_typ_nm.addAllListener(p);
		p.Cnd_alc_ac_cd.setListListener(p);
		p.Cnd_alc_ac_cd.addAllListener(p);
		p.Cnd_alc_ac_nm.setListListener(p);
		p.Cnd_alc_ac_nm.addAllListener(p);
		p.Cnd_alc_ac_grp_cd1.setListListener(p);
		p.Cnd_alc_ac_grp_cd1.addAllListener(p);
		p.Cnd_alc_ac_grp_nm1.setListListener(p);
		p.Cnd_alc_ac_grp_nm1.addAllListener(p);
		p.Cnd_alc_ac_grp_cd2.setListListener(p);
		p.Cnd_alc_ac_grp_cd2.addAllListener(p);
		p.Cnd_alc_ac_grp_nm2.setListListener(p);
		p.Cnd_alc_ac_grp_nm2.addAllListener(p);
		p.Cnd_alc_ac_grp_cd3.setListListener(p);
		p.Cnd_alc_ac_grp_cd3.addAllListener(p);
		p.Cnd_alc_ac_grp_nm3.setListListener(p);
		p.Cnd_alc_ac_grp_nm3.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_oper_cd.setListListener(p);
		p.Cnd_oper_cd.addAllListener(p);
		p.Cnd_oper_nm.setListListener(p);
		p.Cnd_oper_nm.addAllListener(p);
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_ctg_cd.setListListener(p);
		p.Cnd_ctg_cd.addAllListener(p);
		p.Cnd_ctg_nm.setListListener(p);
		p.Cnd_ctg_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_sno1.setListListener(p);
		p.Cnd_sno1.addAllListener(p);
		p.Cnd_sno2.setListListener(p);
		p.Cnd_sno2.addAllListener(p);
		p.Cnd_sno3.setListListener(p);
		p.Cnd_sno3.addAllListener(p);
		p.Cnd_sno4.setListListener(p);
		p.Cnd_sno4.addAllListener(p);
		p.Cnd_itm_grp_cd1.setListListener(p);
		p.Cnd_itm_grp_cd1.addAllListener(p);
		p.Cnd_itm_grp_nm1.setListListener(p);
		p.Cnd_itm_grp_nm1.addAllListener(p);
		p.Cnd_itm_grp_cd2.setListListener(p);
		p.Cnd_itm_grp_cd2.addAllListener(p);
		p.Cnd_itm_grp_nm2.setListListener(p);
		p.Cnd_itm_grp_nm2.addAllListener(p);
		p.Cnd_itm_grp_cd3.setListListener(p);
		p.Cnd_itm_grp_cd3.addAllListener(p);
		p.Cnd_itm_grp_nm3.setListListener(p);
		p.Cnd_itm_grp_nm3.addAllListener(p);
		p.Cnd_itm_grp_cd4.setListListener(p);
		p.Cnd_itm_grp_cd4.addAllListener(p);
		p.Cnd_itm_grp_nm4.setListListener(p);
		p.Cnd_itm_grp_nm4.addAllListener(p);
		p.Cnd_itm_grp_cd5.setListListener(p);
		p.Cnd_itm_grp_cd5.addAllListener(p);
		p.Cnd_itm_grp_nm5.setListListener(p);
		p.Cnd_itm_grp_nm5.addAllListener(p);
		p.Cnd_itm_grp_cd6.setListListener(p);
		p.Cnd_itm_grp_cd6.addAllListener(p);
		p.Cnd_itm_grp_nm6.setListListener(p);
		p.Cnd_itm_grp_nm6.addAllListener(p);
		p.Cnd_itm_grp_cd7.setListListener(p);
		p.Cnd_itm_grp_cd7.addAllListener(p);
		p.Cnd_itm_grp_nm7.setListListener(p);
		p.Cnd_itm_grp_nm7.addAllListener(p);
		p.Cnd_itm_grp_cd8.setListListener(p);
		p.Cnd_itm_grp_cd8.addAllListener(p);
		p.Cnd_itm_grp_nm8.setListListener(p);
		p.Cnd_itm_grp_nm8.addAllListener(p);
		p.Cnd_itm_grp_cd9.setListListener(p);
		p.Cnd_itm_grp_cd9.addAllListener(p);
		p.Cnd_itm_grp_nm9.setListListener(p);
		p.Cnd_itm_grp_nm9.addAllListener(p);
		p.Cnd_itm_grp_cd10.setListListener(p);
		p.Cnd_itm_grp_cd10.addAllListener(p);
		p.Cnd_itm_grp_nm10.setListListener(p);
		p.Cnd_itm_grp_nm10.addAllListener(p);
		p.Cnd_bp_grp_cd1.setListListener(p);
		p.Cnd_bp_grp_cd1.addAllListener(p);
		p.Cnd_bp_grp_nm1.setListListener(p);
		p.Cnd_bp_grp_nm1.addAllListener(p);
		p.Cnd_bp_grp_cd2.setListListener(p);
		p.Cnd_bp_grp_cd2.addAllListener(p);
		p.Cnd_bp_grp_nm2.setListListener(p);
		p.Cnd_bp_grp_nm2.addAllListener(p);
		p.Cnd_bp_grp_cd3.setListListener(p);
		p.Cnd_bp_grp_cd3.addAllListener(p);
		p.Cnd_bp_grp_nm3.setListListener(p);
		p.Cnd_bp_grp_nm3.addAllListener(p);
		p.Cnd_bp_grp_cd4.setListListener(p);
		p.Cnd_bp_grp_cd4.addAllListener(p);
		p.Cnd_bp_grp_nm4.setListListener(p);
		p.Cnd_bp_grp_nm4.addAllListener(p);
		p.Cnd_bp_grp_cd5.setListListener(p);
		p.Cnd_bp_grp_cd5.addAllListener(p);
		p.Cnd_bp_grp_nm5.setListListener(p);
		p.Cnd_bp_grp_nm5.addAllListener(p);
		p.Cnd_bp_grp_cd6.setListListener(p);
		p.Cnd_bp_grp_cd6.addAllListener(p);
		p.Cnd_bp_grp_nm6.setListListener(p);
		p.Cnd_bp_grp_nm6.addAllListener(p);
		p.Cnd_bp_grp_cd7.setListListener(p);
		p.Cnd_bp_grp_cd7.addAllListener(p);
		p.Cnd_bp_grp_nm7.setListListener(p);
		p.Cnd_bp_grp_nm7.addAllListener(p);
		p.Cnd_bp_grp_cd8.setListListener(p);
		p.Cnd_bp_grp_cd8.addAllListener(p);
		p.Cnd_bp_grp_nm8.setListListener(p);
		p.Cnd_bp_grp_nm8.addAllListener(p);
		p.Cnd_bp_grp_cd9.setListListener(p);
		p.Cnd_bp_grp_cd9.addAllListener(p);
		p.Cnd_bp_grp_nm9.setListListener(p);
		p.Cnd_bp_grp_nm9.addAllListener(p);
		p.Cnd_bp_grp_cd10.setListListener(p);
		p.Cnd_bp_grp_cd10.addAllListener(p);
		p.Cnd_bp_grp_nm10.setListListener(p);
		p.Cnd_bp_grp_nm10.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_alc_rec_typ_flg.addAllListener(p);
		p.Cnd_alc_ac_flg.addAllListener(p);
		p.Cnd_alc_ac_grp1_flg.addAllListener(p);
		p.Cnd_alc_ac_grp2_flg.addAllListener(p);
		p.Cnd_alc_ac_grp3_flg.addAllListener(p);
		p.Cnd_dpt_flg.addAllListener(p);
		p.Cnd_loc_flg.addAllListener(p);
		p.Cnd_oper_flg.addAllListener(p);
		p.Cnd_bp_flg.addAllListener(p);
		p.Cnd_ctg_flg.addAllListener(p);
		p.Cnd_itm_flg.addAllListener(p);
		p.Cnd_itm_typ_flg.addAllListener(p);
		p.Cnd_itm_typ_d_flg.addAllListener(p);
		p.Cnd_lot_flg.addAllListener(p);
		p.Cnd_sublot_flg.addAllListener(p);
		p.Cnd_sno1_flg.addAllListener(p);
		p.Cnd_sno2_flg.addAllListener(p);
		p.Cnd_sno3_flg.addAllListener(p);
		p.Cnd_sno4_flg.addAllListener(p);
		p.Cnd_itm_grp_flg1.addAllListener(p);
		p.Cnd_itm_grp_flg2.addAllListener(p);
		p.Cnd_itm_grp_flg3.addAllListener(p);
		p.Cnd_itm_grp_flg4.addAllListener(p);
		p.Cnd_itm_grp_flg5.addAllListener(p);
		p.Cnd_itm_grp_flg6.addAllListener(p);
		p.Cnd_itm_grp_flg7.addAllListener(p);
		p.Cnd_itm_grp_flg8.addAllListener(p);
		p.Cnd_itm_grp_flg9.addAllListener(p);
		p.Cnd_itm_grp_flg10.addAllListener(p);
		p.Cnd_bp_grp_flg1.addAllListener(p);
		p.Cnd_bp_grp_flg2.addAllListener(p);
		p.Cnd_bp_grp_flg3.addAllListener(p);
		p.Cnd_bp_grp_flg4.addAllListener(p);
		p.Cnd_bp_grp_flg5.addAllListener(p);
		p.Cnd_bp_grp_flg6.addAllListener(p);
		p.Cnd_bp_grp_flg7.addAllListener(p);
		p.Cnd_bp_grp_flg8.addAllListener(p);
		p.Cnd_bp_grp_flg9.addAllListener(p);
		p.Cnd_bp_grp_flg10.addAllListener(p);
		p.Cnd_select_all.addAllListener(p);
		p.Cnd_select_all.setAPMethodName("doCnd_select_all");
		p.Cnd_deselect_all.addAllListener(p);
		p.Cnd_deselect_all.setAPMethodName("doCnd_deselect_all");
		p.Cnd_disp_key.addAllListener(p);
		p.Cnd_cur_cd.setListListener(p);
		p.Cnd_cur_cd.addAllListener(p);
		p.Cnd_amt_dec_place.setListListener(p);
		p.Cnd_amt_dec_place.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 *  [Ttl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTtl(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MGBGP_MlyAlcAmtSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBGP_MlyAlcAmtSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispRslt(MGBGP_MlyAlcAmtSrch p) {
		p.DispRsltTable.addAllListener(p);
		p.columnDispRslt_wg_cd.addAllListener(p);
		p.columnDispRslt_wg_cd.setListListener(p);
		p.columnDispRslt_wg_nm.addAllListener(p);
		p.columnDispRslt_wg_nm.setListListener(p);
		p.columnDispRslt_alc_rec_typ.addAllListener(p);
		p.columnDispRslt_alc_rec_typ.setListListener(p);
		p.columnDispRslt_alc_rec_typ_nm.addAllListener(p);
		p.columnDispRslt_alc_rec_typ_nm.setListListener(p);
		p.columnDispRslt_alc_ac_cd.addAllListener(p);
		p.columnDispRslt_alc_ac_cd.setListListener(p);
		p.columnDispRslt_alc_ac_nm.addAllListener(p);
		p.columnDispRslt_alc_ac_nm.setListListener(p);
		p.columnDispRslt_alc_ac_grp_cd1.addAllListener(p);
		p.columnDispRslt_alc_ac_grp_cd1.setListListener(p);
		p.columnDispRslt_alc_ac_grp_nm1.addAllListener(p);
		p.columnDispRslt_alc_ac_grp_nm1.setListListener(p);
		p.columnDispRslt_alc_ac_grp_cd2.addAllListener(p);
		p.columnDispRslt_alc_ac_grp_cd2.setListListener(p);
		p.columnDispRslt_alc_ac_grp_nm2.addAllListener(p);
		p.columnDispRslt_alc_ac_grp_nm2.setListListener(p);
		p.columnDispRslt_alc_ac_grp_cd3.addAllListener(p);
		p.columnDispRslt_alc_ac_grp_cd3.setListListener(p);
		p.columnDispRslt_alc_ac_grp_nm3.addAllListener(p);
		p.columnDispRslt_alc_ac_grp_nm3.setListListener(p);
		p.columnDispRslt_dpt_cd.addAllListener(p);
		p.columnDispRslt_dpt_cd.setListListener(p);
		p.columnDispRslt_dpt_nm.addAllListener(p);
		p.columnDispRslt_dpt_nm.setListListener(p);
		p.columnDispRslt_loc_cd.addAllListener(p);
		p.columnDispRslt_loc_cd.setListListener(p);
		p.columnDispRslt_loc_nm.addAllListener(p);
		p.columnDispRslt_loc_nm.setListListener(p);
		p.columnDispRslt_oper_cd.addAllListener(p);
		p.columnDispRslt_oper_cd.setListListener(p);
		p.columnDispRslt_oper_nm.addAllListener(p);
		p.columnDispRslt_oper_nm.setListListener(p);
		p.columnDispRslt_bp_cd.addAllListener(p);
		p.columnDispRslt_bp_cd.setListListener(p);
		p.columnDispRslt_bp_nm.addAllListener(p);
		p.columnDispRslt_bp_nm.setListListener(p);
		p.columnDispRslt_ctg_cd.addAllListener(p);
		p.columnDispRslt_ctg_cd.setListListener(p);
		p.columnDispRslt_ctg_nm.addAllListener(p);
		p.columnDispRslt_ctg_nm.setListListener(p);
		p.columnDispRslt_itm_typ.addAllListener(p);
		p.columnDispRslt_itm_typ.setListListener(p);
		p.columnDispRslt_itm_typ_nm.addAllListener(p);
		p.columnDispRslt_itm_typ_nm.setListListener(p);
		p.columnDispRslt_itm_typ_d_cd.addAllListener(p);
		p.columnDispRslt_itm_typ_d_cd.setListListener(p);
		p.columnDispRslt_itm_typ_d_nm.addAllListener(p);
		p.columnDispRslt_itm_typ_d_nm.setListListener(p);
		p.columnDispRslt_itm_grp_cd1.addAllListener(p);
		p.columnDispRslt_itm_grp_cd1.setListListener(p);
		p.columnDispRslt_itm_grp_nm1.addAllListener(p);
		p.columnDispRslt_itm_grp_nm1.setListListener(p);
		p.columnDispRslt_itm_grp_cd2.addAllListener(p);
		p.columnDispRslt_itm_grp_cd2.setListListener(p);
		p.columnDispRslt_itm_grp_nm2.addAllListener(p);
		p.columnDispRslt_itm_grp_nm2.setListListener(p);
		p.columnDispRslt_itm_grp_cd3.addAllListener(p);
		p.columnDispRslt_itm_grp_cd3.setListListener(p);
		p.columnDispRslt_itm_grp_nm3.addAllListener(p);
		p.columnDispRslt_itm_grp_nm3.setListListener(p);
		p.columnDispRslt_itm_grp_cd4.addAllListener(p);
		p.columnDispRslt_itm_grp_cd4.setListListener(p);
		p.columnDispRslt_itm_grp_nm4.addAllListener(p);
		p.columnDispRslt_itm_grp_nm4.setListListener(p);
		p.columnDispRslt_itm_grp_cd5.addAllListener(p);
		p.columnDispRslt_itm_grp_cd5.setListListener(p);
		p.columnDispRslt_itm_grp_nm5.addAllListener(p);
		p.columnDispRslt_itm_grp_nm5.setListListener(p);
		p.columnDispRslt_itm_grp_cd6.addAllListener(p);
		p.columnDispRslt_itm_grp_cd6.setListListener(p);
		p.columnDispRslt_itm_grp_nm6.addAllListener(p);
		p.columnDispRslt_itm_grp_nm6.setListListener(p);
		p.columnDispRslt_itm_grp_cd7.addAllListener(p);
		p.columnDispRslt_itm_grp_cd7.setListListener(p);
		p.columnDispRslt_itm_grp_nm7.addAllListener(p);
		p.columnDispRslt_itm_grp_nm7.setListListener(p);
		p.columnDispRslt_itm_grp_cd8.addAllListener(p);
		p.columnDispRslt_itm_grp_cd8.setListListener(p);
		p.columnDispRslt_itm_grp_nm8.addAllListener(p);
		p.columnDispRslt_itm_grp_nm8.setListListener(p);
		p.columnDispRslt_itm_grp_cd9.addAllListener(p);
		p.columnDispRslt_itm_grp_cd9.setListListener(p);
		p.columnDispRslt_itm_grp_nm9.addAllListener(p);
		p.columnDispRslt_itm_grp_nm9.setListListener(p);
		p.columnDispRslt_itm_grp_cd10.addAllListener(p);
		p.columnDispRslt_itm_grp_cd10.setListListener(p);
		p.columnDispRslt_itm_grp_nm10.addAllListener(p);
		p.columnDispRslt_itm_grp_nm10.setListListener(p);
		p.columnDispRslt_lot_no.addAllListener(p);
		p.columnDispRslt_lot_no.setListListener(p);
		p.columnDispRslt_sublot_no.addAllListener(p);
		p.columnDispRslt_sublot_no.setListListener(p);
		p.columnDispRslt_sno1.addAllListener(p);
		p.columnDispRslt_sno1.setListListener(p);
		p.columnDispRslt_sno2.addAllListener(p);
		p.columnDispRslt_sno2.setListListener(p);
		p.columnDispRslt_sno3.addAllListener(p);
		p.columnDispRslt_sno3.setListListener(p);
		p.columnDispRslt_sno4.addAllListener(p);
		p.columnDispRslt_sno4.setListListener(p);
		p.columnDispRslt_bp_grp_cd1.addAllListener(p);
		p.columnDispRslt_bp_grp_cd1.setListListener(p);
		p.columnDispRslt_bp_grp_nm1.addAllListener(p);
		p.columnDispRslt_bp_grp_nm1.setListListener(p);
		p.columnDispRslt_bp_grp_cd2.addAllListener(p);
		p.columnDispRslt_bp_grp_cd2.setListListener(p);
		p.columnDispRslt_bp_grp_nm2.addAllListener(p);
		p.columnDispRslt_bp_grp_nm2.setListListener(p);
		p.columnDispRslt_bp_grp_cd3.addAllListener(p);
		p.columnDispRslt_bp_grp_cd3.setListListener(p);
		p.columnDispRslt_bp_grp_nm3.addAllListener(p);
		p.columnDispRslt_bp_grp_nm3.setListListener(p);
		p.columnDispRslt_bp_grp_cd4.addAllListener(p);
		p.columnDispRslt_bp_grp_cd4.setListListener(p);
		p.columnDispRslt_bp_grp_nm4.addAllListener(p);
		p.columnDispRslt_bp_grp_nm4.setListListener(p);
		p.columnDispRslt_bp_grp_cd5.addAllListener(p);
		p.columnDispRslt_bp_grp_cd5.setListListener(p);
		p.columnDispRslt_bp_grp_nm5.addAllListener(p);
		p.columnDispRslt_bp_grp_nm5.setListListener(p);
		p.columnDispRslt_bp_grp_cd6.addAllListener(p);
		p.columnDispRslt_bp_grp_cd6.setListListener(p);
		p.columnDispRslt_bp_grp_nm6.addAllListener(p);
		p.columnDispRslt_bp_grp_nm6.setListListener(p);
		p.columnDispRslt_bp_grp_cd7.addAllListener(p);
		p.columnDispRslt_bp_grp_cd7.setListListener(p);
		p.columnDispRslt_bp_grp_nm7.addAllListener(p);
		p.columnDispRslt_bp_grp_nm7.setListListener(p);
		p.columnDispRslt_bp_grp_cd8.addAllListener(p);
		p.columnDispRslt_bp_grp_cd8.setListListener(p);
		p.columnDispRslt_bp_grp_nm8.addAllListener(p);
		p.columnDispRslt_bp_grp_nm8.setListListener(p);
		p.columnDispRslt_bp_grp_cd9.addAllListener(p);
		p.columnDispRslt_bp_grp_cd9.setListListener(p);
		p.columnDispRslt_bp_grp_nm9.addAllListener(p);
		p.columnDispRslt_bp_grp_nm9.setListListener(p);
		p.columnDispRslt_bp_grp_cd10.addAllListener(p);
		p.columnDispRslt_bp_grp_cd10.setListListener(p);
		p.columnDispRslt_bp_grp_nm10.addAllListener(p);
		p.columnDispRslt_bp_grp_nm10.setListListener(p);
		p.columnDispRslt_elm_no.addAllListener(p);
		p.columnDispRslt_elm_no.setListListener(p);
		p.columnDispRslt_elm.addAllListener(p);
		p.columnDispRslt_elm.setListListener(p);
		p.columnDispRslt_elm_nm.addAllListener(p);
		p.columnDispRslt_elm_nm.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab4(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBGP_MlyAlcAmtSrch p){
		p.Cnd_pln_calc_ctg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_act_calc_ctg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_rec_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_rec_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_alc_ac_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ctg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ctg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_cd4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_cd5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_nm5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_cd6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_nm6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_cd7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_nm7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_cd8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_nm8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_cd9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_nm9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_cd10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_nm10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_rec_typ_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_grp1_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_grp2_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_ac_grp3_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dpt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_oper_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ctg_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_d_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lot_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno1_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno2_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno3_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno4_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_flg1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_flg2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_flg3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_flg4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_flg5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_flg6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_flg7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_flg8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_flg9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_flg10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_flg1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_flg2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_flg3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_flg4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_flg5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_flg6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_flg7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_flg8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_flg9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_flg10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_disp_key.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cur_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ttl(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [SRCH]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DispRslt(MGBGP_MlyAlcAmtSrch p){
		p.columnDispRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_alc_rec_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_alc_rec_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_grp_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_grp_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_grp_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_grp_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_grp_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_grp_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDispRslt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_elm_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispRslt_elm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispRslt_elm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_amt_00_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_01_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_02_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_03_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_04_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_05_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_06_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_07_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_08_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_09_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_10_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_11_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_ttl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBGP_MlyAlcAmtSrch p){
		p.Cnd_pln_calc_ctg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_act_calc_ctg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_rec_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_rec_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_alc_ac_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ctg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ctg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_rec_typ_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp1_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp2_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp3_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ctg_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_d_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lot_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno1_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno2_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno3_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno4_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_flg1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_flg2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_flg3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_flg4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_flg5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_flg6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_flg7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_flg8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_flg9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_flg10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_flg1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_flg2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_flg3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_flg4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_flg5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_flg6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_flg7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_flg8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_flg9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_flg10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_disp_key.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cur_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [REF]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ttl(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBGP_MlyAlcAmtSrch p){

	}

	/**
	 * [REF]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispRslt(MGBGP_MlyAlcAmtSrch p){
		p.columnDispRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_alc_rec_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_alc_rec_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_alc_ac_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDispRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_grp_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_grp_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_elm_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispRslt_elm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispRslt_elm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_amt_00_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_01_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_02_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_03_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_04_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_05_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_06_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_07_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_08_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_09_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_10_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_11_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_ttl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBGP_MlyAlcAmtSrch p){

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
		MGBGP_MlyAlcAmtSrch_MC.setTableConfigDispRslt((MGBGP_MlyAlcAmtSrch)this);
	}

	/**
	 * [DispRslt]ブロックのTableの設定
	 */
	protected static void setTableConfigDispRslt(MGBGP_MlyAlcAmtSrch p) {
		p.columnDispRslt_wg_cd.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.wg_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_cd);
		p.columnDispRslt_wg_nm.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.wg_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_nm);
		p.columnDispRslt_alc_rec_typ.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.alc_rec_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_alc_rec_typ);
		p.columnDispRslt_alc_rec_typ_nm.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.alc_rec_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_alc_rec_typ_nm);
		p.columnDispRslt_alc_ac_cd.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.alc_ac_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_alc_ac_cd);
		p.columnDispRslt_alc_ac_nm.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.alc_ac_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_alc_ac_nm);
		p.columnDispRslt_alc_ac_grp_cd1.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.alc_ac_grp_cd1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_alc_ac_grp_cd1);
		p.columnDispRslt_alc_ac_grp_nm1.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.alc_ac_grp_nm1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_alc_ac_grp_nm1);
		p.columnDispRslt_alc_ac_grp_cd2.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.alc_ac_grp_cd2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_alc_ac_grp_cd2);
		p.columnDispRslt_alc_ac_grp_nm2.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.alc_ac_grp_nm2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_alc_ac_grp_nm2);
		p.columnDispRslt_alc_ac_grp_cd3.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.alc_ac_grp_cd3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_alc_ac_grp_cd3);
		p.columnDispRslt_alc_ac_grp_nm3.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.alc_ac_grp_nm3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_alc_ac_grp_nm3);
		p.columnDispRslt_dpt_cd.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.dpt_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dpt_cd);
		p.columnDispRslt_dpt_nm.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.dpt_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dpt_nm);
		p.columnDispRslt_loc_cd.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.loc_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_loc_cd);
		p.columnDispRslt_loc_nm.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.loc_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_loc_nm);
		p.columnDispRslt_oper_cd.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.oper_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_oper_cd);
		p.columnDispRslt_oper_nm.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.oper_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_oper_nm);
		p.columnDispRslt_bp_cd.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_cd);
		p.columnDispRslt_bp_nm.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_nm);
		p.columnDispRslt_ctg_cd.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.ctg_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_ctg_cd);
		p.columnDispRslt_ctg_nm.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.ctg_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_ctg_nm);
		p.DispRsltTable.addTable(p.DispRslt_itm_p_PPanel.ItmTable);
		p.columnDispRslt_itm_typ.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ);
		p.columnDispRslt_itm_typ_nm.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_nm);
		p.columnDispRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_typ_d_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_cd);
		p.columnDispRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_typ_d_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_nm);
		p.columnDispRslt_itm_grp_cd1.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_cd1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd1);
		p.columnDispRslt_itm_grp_nm1.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_nm1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm1);
		p.columnDispRslt_itm_grp_cd2.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_cd2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd2);
		p.columnDispRslt_itm_grp_nm2.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_nm2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm2);
		p.columnDispRslt_itm_grp_cd3.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_cd3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd3);
		p.columnDispRslt_itm_grp_nm3.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_nm3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm3);
		p.columnDispRslt_itm_grp_cd4.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_cd4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd4);
		p.columnDispRslt_itm_grp_nm4.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_nm4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm4);
		p.columnDispRslt_itm_grp_cd5.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_cd5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd5);
		p.columnDispRslt_itm_grp_nm5.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_nm5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm5);
		p.columnDispRslt_itm_grp_cd6.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_cd6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd6);
		p.columnDispRslt_itm_grp_nm6.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_nm6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm6);
		p.columnDispRslt_itm_grp_cd7.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_cd7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd7);
		p.columnDispRslt_itm_grp_nm7.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_nm7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm7);
		p.columnDispRslt_itm_grp_cd8.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_cd8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd8);
		p.columnDispRslt_itm_grp_nm8.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_nm8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm8);
		p.columnDispRslt_itm_grp_cd9.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_cd9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd9);
		p.columnDispRslt_itm_grp_nm9.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_nm9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm9);
		p.columnDispRslt_itm_grp_cd10.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_cd10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd10);
		p.columnDispRslt_itm_grp_nm10.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.itm_grp_nm10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm10);
		p.columnDispRslt_lot_no.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.lot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_lot_no);
		p.columnDispRslt_sublot_no.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.sublot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sublot_no);
		p.columnDispRslt_sno1.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.sno1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno1);
		p.columnDispRslt_sno2.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.sno2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno2);
		p.columnDispRslt_sno3.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.sno3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno3);
		p.columnDispRslt_sno4.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.sno4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno4);
		p.columnDispRslt_bp_grp_cd1.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_cd1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd1);
		p.columnDispRslt_bp_grp_nm1.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_nm1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm1);
		p.columnDispRslt_bp_grp_cd2.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_cd2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd2);
		p.columnDispRslt_bp_grp_nm2.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_nm2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm2);
		p.columnDispRslt_bp_grp_cd3.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_cd3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd3);
		p.columnDispRslt_bp_grp_nm3.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_nm3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm3);
		p.columnDispRslt_bp_grp_cd4.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_cd4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd4);
		p.columnDispRslt_bp_grp_nm4.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_nm4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm4);
		p.columnDispRslt_bp_grp_cd5.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_cd5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd5);
		p.columnDispRslt_bp_grp_nm5.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_nm5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm5);
		p.columnDispRslt_bp_grp_cd6.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_cd6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd6);
		p.columnDispRslt_bp_grp_nm6.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_nm6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm6);
		p.columnDispRslt_bp_grp_cd7.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_cd7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd7);
		p.columnDispRslt_bp_grp_nm7.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_nm7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm7);
		p.columnDispRslt_bp_grp_cd8.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_cd8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd8);
		p.columnDispRslt_bp_grp_nm8.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_nm8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm8);
		p.columnDispRslt_bp_grp_cd9.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_cd9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd9);
		p.columnDispRslt_bp_grp_nm9.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_nm9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm9);
		p.columnDispRslt_bp_grp_cd10.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_cd10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd10);
		p.columnDispRslt_bp_grp_nm10.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.bp_grp_nm10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm10);
		p.columnDispRslt_elm_no.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.elm_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm_no);
		p.columnDispRslt_elm.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.elm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm);
		p.columnDispRslt_elm_nm.setMeta(mcframe.clientMGBG.MGBGP0060.DispRsltR.elm_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm_nm);
		p.DispRsltTable.addTable(p.DispRslt_amt_00_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_01_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_02_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_03_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_04_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_05_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_06_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_07_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_08_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_09_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_10_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_11_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_ttl_amt_p_PPanel.AmtTable);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_pln_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pln_calc_ctg_cd.getListConfig().setPutter(getCnd_pln_calc_ctg_cd_ListPutter());
		Cnd_act_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_act_calc_ctg_cd.getListConfig().setPutter(getCnd_act_calc_ctg_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_alc_rec_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_rec_typ.getListConfig().setPutter(getCnd_alc_rec_typ_ListPutter());
		Cnd_alc_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_ac_cd.getListConfig().setPutter(getCnd_alc_ac_cd_ListPutter());
		Cnd_alc_ac_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_ac_grp_cd1.getListConfig().setPutter(getCnd_alc_ac_grp_cd1_ListPutter());
		Cnd_alc_ac_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_ac_grp_cd2.getListConfig().setPutter(getCnd_alc_ac_grp_cd2_ListPutter());
		Cnd_alc_ac_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_ac_grp_cd3.getListConfig().setPutter(getCnd_alc_ac_grp_cd3_ListPutter());
		Cnd_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_cd.getListConfig().setPutter(getCnd_oper_cd_ListPutter());
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
		Cnd_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ctg_cd.getListConfig().setPutter(getCnd_ctg_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_itm_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd1.getListConfig().setPutter(getCnd_itm_grp_cd1_ListPutter());
		Cnd_itm_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd2.getListConfig().setPutter(getCnd_itm_grp_cd2_ListPutter());
		Cnd_itm_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd3.getListConfig().setPutter(getCnd_itm_grp_cd3_ListPutter());
		Cnd_itm_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd4.getListConfig().setPutter(getCnd_itm_grp_cd4_ListPutter());
		Cnd_itm_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd5.getListConfig().setPutter(getCnd_itm_grp_cd5_ListPutter());
		Cnd_itm_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd6.getListConfig().setPutter(getCnd_itm_grp_cd6_ListPutter());
		Cnd_itm_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd7.getListConfig().setPutter(getCnd_itm_grp_cd7_ListPutter());
		Cnd_itm_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd8.getListConfig().setPutter(getCnd_itm_grp_cd8_ListPutter());
		Cnd_itm_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd9.getListConfig().setPutter(getCnd_itm_grp_cd9_ListPutter());
		Cnd_itm_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd10.getListConfig().setPutter(getCnd_itm_grp_cd10_ListPutter());
		Cnd_bp_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd1.getListConfig().setPutter(getCnd_bp_grp_cd1_ListPutter());
		Cnd_bp_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd2.getListConfig().setPutter(getCnd_bp_grp_cd2_ListPutter());
		Cnd_bp_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd3.getListConfig().setPutter(getCnd_bp_grp_cd3_ListPutter());
		Cnd_bp_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd4.getListConfig().setPutter(getCnd_bp_grp_cd4_ListPutter());
		Cnd_bp_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd5.getListConfig().setPutter(getCnd_bp_grp_cd5_ListPutter());
		Cnd_bp_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd6.getListConfig().setPutter(getCnd_bp_grp_cd6_ListPutter());
		Cnd_bp_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd7.getListConfig().setPutter(getCnd_bp_grp_cd7_ListPutter());
		Cnd_bp_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd8.getListConfig().setPutter(getCnd_bp_grp_cd8_ListPutter());
		Cnd_bp_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd9.getListConfig().setPutter(getCnd_bp_grp_cd9_ListPutter());
		Cnd_bp_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd10.getListConfig().setPutter(getCnd_bp_grp_cd10_ListPutter());
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
	 * [Cnd_pln_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pln_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Cnd_act_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_act_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Cnd_alc_rec_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_rec_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.AlcRecTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_alc_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAc");
		return lp;
	}
	 
	/**
	 * [Cnd_alc_ac_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_ac_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_alc_ac_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_ac_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_alc_ac_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_ac_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCtg");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_itm_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp10");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_pln_calc_ctg_cd) return getCnd_pln_calc_ctg_cd(row, info);
		if(combo == Cnd_act_calc_ctg_cd) return getCnd_act_calc_ctg_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_alc_rec_typ) return getCnd_alc_rec_typ(row, info);
		if(combo == Cnd_alc_ac_cd) return getCnd_alc_ac_cd(row, info);
		if(combo == Cnd_alc_ac_grp_cd1) return getCnd_alc_ac_grp_cd1(row, info);
		if(combo == Cnd_alc_ac_grp_cd2) return getCnd_alc_ac_grp_cd2(row, info);
		if(combo == Cnd_alc_ac_grp_cd3) return getCnd_alc_ac_grp_cd3(row, info);
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_oper_cd) return getCnd_oper_cd(row, info);
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		if(combo == Cnd_ctg_cd) return getCnd_ctg_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_itm_grp_cd1) return getCnd_itm_grp_cd1(row, info);
		if(combo == Cnd_itm_grp_cd2) return getCnd_itm_grp_cd2(row, info);
		if(combo == Cnd_itm_grp_cd3) return getCnd_itm_grp_cd3(row, info);
		if(combo == Cnd_itm_grp_cd4) return getCnd_itm_grp_cd4(row, info);
		if(combo == Cnd_itm_grp_cd5) return getCnd_itm_grp_cd5(row, info);
		if(combo == Cnd_itm_grp_cd6) return getCnd_itm_grp_cd6(row, info);
		if(combo == Cnd_itm_grp_cd7) return getCnd_itm_grp_cd7(row, info);
		if(combo == Cnd_itm_grp_cd8) return getCnd_itm_grp_cd8(row, info);
		if(combo == Cnd_itm_grp_cd9) return getCnd_itm_grp_cd9(row, info);
		if(combo == Cnd_itm_grp_cd10) return getCnd_itm_grp_cd10(row, info);
		if(combo == Cnd_bp_grp_cd1) return getCnd_bp_grp_cd1(row, info);
		if(combo == Cnd_bp_grp_cd2) return getCnd_bp_grp_cd2(row, info);
		if(combo == Cnd_bp_grp_cd3) return getCnd_bp_grp_cd3(row, info);
		if(combo == Cnd_bp_grp_cd4) return getCnd_bp_grp_cd4(row, info);
		if(combo == Cnd_bp_grp_cd5) return getCnd_bp_grp_cd5(row, info);
		if(combo == Cnd_bp_grp_cd6) return getCnd_bp_grp_cd6(row, info);
		if(combo == Cnd_bp_grp_cd7) return getCnd_bp_grp_cd7(row, info);
		if(combo == Cnd_bp_grp_cd8) return getCnd_bp_grp_cd8(row, info);
		if(combo == Cnd_bp_grp_cd9) return getCnd_bp_grp_cd9(row, info);
		if(combo == Cnd_bp_grp_cd10) return getCnd_bp_grp_cd10(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_select_all) doCnd_select_all(info);
		else if (ap == Cnd_deselect_all) doCnd_deselect_all(info);
		else if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
	}

	/**
	 * [Cnd]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_select_all(MCEventInfo info);

	/**
	 * [Cnd]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_deselect_all(MCEventInfo info);

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

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
		if (vc == DispRsltTable) return doDispRslt_VC(info);
		if (vc == Cnd_pre_alc_typ_Group) return doCnd_pre_alc_typ_VC(info);
		if (vc == Cnd_pln_calc_ctg_cd) return doCnd_pln_calc_ctg_cd_VC(info);
		if (vc == Cnd_pln_calc_ctg_nm) return doCnd_pln_calc_ctg_nm_VC(info);
		if (vc == Cnd_act_calc_ctg_cd) return doCnd_act_calc_ctg_cd_VC(info);
		if (vc == Cnd_act_calc_ctg_nm) return doCnd_act_calc_ctg_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_alc_rec_typ) return doCnd_alc_rec_typ_VC(info);
		if (vc == Cnd_alc_rec_typ_nm) return doCnd_alc_rec_typ_nm_VC(info);
		if (vc == Cnd_alc_ac_cd) return doCnd_alc_ac_cd_VC(info);
		if (vc == Cnd_alc_ac_nm) return doCnd_alc_ac_nm_VC(info);
		if (vc == Cnd_alc_ac_grp_cd1) return doCnd_alc_ac_grp_cd1_VC(info);
		if (vc == Cnd_alc_ac_grp_nm1) return doCnd_alc_ac_grp_nm1_VC(info);
		if (vc == Cnd_alc_ac_grp_cd2) return doCnd_alc_ac_grp_cd2_VC(info);
		if (vc == Cnd_alc_ac_grp_nm2) return doCnd_alc_ac_grp_nm2_VC(info);
		if (vc == Cnd_alc_ac_grp_cd3) return doCnd_alc_ac_grp_cd3_VC(info);
		if (vc == Cnd_alc_ac_grp_nm3) return doCnd_alc_ac_grp_nm3_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_oper_cd) return doCnd_oper_cd_VC(info);
		if (vc == Cnd_oper_nm) return doCnd_oper_nm_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_ctg_cd) return doCnd_ctg_cd_VC(info);
		if (vc == Cnd_ctg_nm) return doCnd_ctg_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_sno1) return doCnd_sno1_VC(info);
		if (vc == Cnd_sno2) return doCnd_sno2_VC(info);
		if (vc == Cnd_sno3) return doCnd_sno3_VC(info);
		if (vc == Cnd_sno4) return doCnd_sno4_VC(info);
		if (vc == Cnd_itm_grp_cd1) return doCnd_itm_grp_cd1_VC(info);
		if (vc == Cnd_itm_grp_nm1) return doCnd_itm_grp_nm1_VC(info);
		if (vc == Cnd_itm_grp_cd2) return doCnd_itm_grp_cd2_VC(info);
		if (vc == Cnd_itm_grp_nm2) return doCnd_itm_grp_nm2_VC(info);
		if (vc == Cnd_itm_grp_cd3) return doCnd_itm_grp_cd3_VC(info);
		if (vc == Cnd_itm_grp_nm3) return doCnd_itm_grp_nm3_VC(info);
		if (vc == Cnd_itm_grp_cd4) return doCnd_itm_grp_cd4_VC(info);
		if (vc == Cnd_itm_grp_nm4) return doCnd_itm_grp_nm4_VC(info);
		if (vc == Cnd_itm_grp_cd5) return doCnd_itm_grp_cd5_VC(info);
		if (vc == Cnd_itm_grp_nm5) return doCnd_itm_grp_nm5_VC(info);
		if (vc == Cnd_itm_grp_cd6) return doCnd_itm_grp_cd6_VC(info);
		if (vc == Cnd_itm_grp_nm6) return doCnd_itm_grp_nm6_VC(info);
		if (vc == Cnd_itm_grp_cd7) return doCnd_itm_grp_cd7_VC(info);
		if (vc == Cnd_itm_grp_nm7) return doCnd_itm_grp_nm7_VC(info);
		if (vc == Cnd_itm_grp_cd8) return doCnd_itm_grp_cd8_VC(info);
		if (vc == Cnd_itm_grp_nm8) return doCnd_itm_grp_nm8_VC(info);
		if (vc == Cnd_itm_grp_cd9) return doCnd_itm_grp_cd9_VC(info);
		if (vc == Cnd_itm_grp_nm9) return doCnd_itm_grp_nm9_VC(info);
		if (vc == Cnd_itm_grp_cd10) return doCnd_itm_grp_cd10_VC(info);
		if (vc == Cnd_itm_grp_nm10) return doCnd_itm_grp_nm10_VC(info);
		if (vc == Cnd_bp_grp_cd1) return doCnd_bp_grp_cd1_VC(info);
		if (vc == Cnd_bp_grp_nm1) return doCnd_bp_grp_nm1_VC(info);
		if (vc == Cnd_bp_grp_cd2) return doCnd_bp_grp_cd2_VC(info);
		if (vc == Cnd_bp_grp_nm2) return doCnd_bp_grp_nm2_VC(info);
		if (vc == Cnd_bp_grp_cd3) return doCnd_bp_grp_cd3_VC(info);
		if (vc == Cnd_bp_grp_nm3) return doCnd_bp_grp_nm3_VC(info);
		if (vc == Cnd_bp_grp_cd4) return doCnd_bp_grp_cd4_VC(info);
		if (vc == Cnd_bp_grp_nm4) return doCnd_bp_grp_nm4_VC(info);
		if (vc == Cnd_bp_grp_cd5) return doCnd_bp_grp_cd5_VC(info);
		if (vc == Cnd_bp_grp_nm5) return doCnd_bp_grp_nm5_VC(info);
		if (vc == Cnd_bp_grp_cd6) return doCnd_bp_grp_cd6_VC(info);
		if (vc == Cnd_bp_grp_nm6) return doCnd_bp_grp_nm6_VC(info);
		if (vc == Cnd_bp_grp_cd7) return doCnd_bp_grp_cd7_VC(info);
		if (vc == Cnd_bp_grp_nm7) return doCnd_bp_grp_nm7_VC(info);
		if (vc == Cnd_bp_grp_cd8) return doCnd_bp_grp_cd8_VC(info);
		if (vc == Cnd_bp_grp_nm8) return doCnd_bp_grp_nm8_VC(info);
		if (vc == Cnd_bp_grp_cd9) return doCnd_bp_grp_cd9_VC(info);
		if (vc == Cnd_bp_grp_nm9) return doCnd_bp_grp_nm9_VC(info);
		if (vc == Cnd_bp_grp_cd10) return doCnd_bp_grp_cd10_VC(info);
		if (vc == Cnd_bp_grp_nm10) return doCnd_bp_grp_nm10_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_alc_rec_typ_flg) return doCnd_alc_rec_typ_flg_VC(info);
		if (vc == Cnd_alc_ac_flg) return doCnd_alc_ac_flg_VC(info);
		if (vc == Cnd_alc_ac_grp1_flg) return doCnd_alc_ac_grp1_flg_VC(info);
		if (vc == Cnd_alc_ac_grp2_flg) return doCnd_alc_ac_grp2_flg_VC(info);
		if (vc == Cnd_alc_ac_grp3_flg) return doCnd_alc_ac_grp3_flg_VC(info);
		if (vc == Cnd_dpt_flg) return doCnd_dpt_flg_VC(info);
		if (vc == Cnd_loc_flg) return doCnd_loc_flg_VC(info);
		if (vc == Cnd_oper_flg) return doCnd_oper_flg_VC(info);
		if (vc == Cnd_bp_flg) return doCnd_bp_flg_VC(info);
		if (vc == Cnd_ctg_flg) return doCnd_ctg_flg_VC(info);
		if (vc == Cnd_itm_flg) return doCnd_itm_flg_VC(info);
		if (vc == Cnd_itm_typ_flg) return doCnd_itm_typ_flg_VC(info);
		if (vc == Cnd_itm_typ_d_flg) return doCnd_itm_typ_d_flg_VC(info);
		if (vc == Cnd_lot_flg) return doCnd_lot_flg_VC(info);
		if (vc == Cnd_sublot_flg) return doCnd_sublot_flg_VC(info);
		if (vc == Cnd_sno1_flg) return doCnd_sno1_flg_VC(info);
		if (vc == Cnd_sno2_flg) return doCnd_sno2_flg_VC(info);
		if (vc == Cnd_sno3_flg) return doCnd_sno3_flg_VC(info);
		if (vc == Cnd_sno4_flg) return doCnd_sno4_flg_VC(info);
		if (vc == Cnd_itm_grp_flg1) return doCnd_itm_grp_flg1_VC(info);
		if (vc == Cnd_itm_grp_flg2) return doCnd_itm_grp_flg2_VC(info);
		if (vc == Cnd_itm_grp_flg3) return doCnd_itm_grp_flg3_VC(info);
		if (vc == Cnd_itm_grp_flg4) return doCnd_itm_grp_flg4_VC(info);
		if (vc == Cnd_itm_grp_flg5) return doCnd_itm_grp_flg5_VC(info);
		if (vc == Cnd_itm_grp_flg6) return doCnd_itm_grp_flg6_VC(info);
		if (vc == Cnd_itm_grp_flg7) return doCnd_itm_grp_flg7_VC(info);
		if (vc == Cnd_itm_grp_flg8) return doCnd_itm_grp_flg8_VC(info);
		if (vc == Cnd_itm_grp_flg9) return doCnd_itm_grp_flg9_VC(info);
		if (vc == Cnd_itm_grp_flg10) return doCnd_itm_grp_flg10_VC(info);
		if (vc == Cnd_bp_grp_flg1) return doCnd_bp_grp_flg1_VC(info);
		if (vc == Cnd_bp_grp_flg2) return doCnd_bp_grp_flg2_VC(info);
		if (vc == Cnd_bp_grp_flg3) return doCnd_bp_grp_flg3_VC(info);
		if (vc == Cnd_bp_grp_flg4) return doCnd_bp_grp_flg4_VC(info);
		if (vc == Cnd_bp_grp_flg5) return doCnd_bp_grp_flg5_VC(info);
		if (vc == Cnd_bp_grp_flg6) return doCnd_bp_grp_flg6_VC(info);
		if (vc == Cnd_bp_grp_flg7) return doCnd_bp_grp_flg7_VC(info);
		if (vc == Cnd_bp_grp_flg8) return doCnd_bp_grp_flg8_VC(info);
		if (vc == Cnd_bp_grp_flg9) return doCnd_bp_grp_flg9_VC(info);
		if (vc == Cnd_bp_grp_flg10) return doCnd_bp_grp_flg10_VC(info);
		if (vc == Cnd_disp_key) return doCnd_disp_key_VC(info);
		if (vc == Cnd_cur_cd) return doCnd_cur_cd_VC(info);
		if (vc == Cnd_amt_dec_place) return doCnd_amt_dec_place_VC(info);
		if (vc == columnDispRslt_wg_cd) return doDispRslt_wg_cd_VC(info);
		if (vc == columnDispRslt_wg_nm) return doDispRslt_wg_nm_VC(info);
		if (vc == columnDispRslt_alc_rec_typ) return doDispRslt_alc_rec_typ_VC(info);
		if (vc == columnDispRslt_alc_rec_typ_nm) return doDispRslt_alc_rec_typ_nm_VC(info);
		if (vc == columnDispRslt_alc_ac_cd) return doDispRslt_alc_ac_cd_VC(info);
		if (vc == columnDispRslt_alc_ac_nm) return doDispRslt_alc_ac_nm_VC(info);
		if (vc == columnDispRslt_alc_ac_grp_cd1) return doDispRslt_alc_ac_grp_cd1_VC(info);
		if (vc == columnDispRslt_alc_ac_grp_nm1) return doDispRslt_alc_ac_grp_nm1_VC(info);
		if (vc == columnDispRslt_alc_ac_grp_cd2) return doDispRslt_alc_ac_grp_cd2_VC(info);
		if (vc == columnDispRslt_alc_ac_grp_nm2) return doDispRslt_alc_ac_grp_nm2_VC(info);
		if (vc == columnDispRslt_alc_ac_grp_cd3) return doDispRslt_alc_ac_grp_cd3_VC(info);
		if (vc == columnDispRslt_alc_ac_grp_nm3) return doDispRslt_alc_ac_grp_nm3_VC(info);
		if (vc == columnDispRslt_dpt_cd) return doDispRslt_dpt_cd_VC(info);
		if (vc == columnDispRslt_dpt_nm) return doDispRslt_dpt_nm_VC(info);
		if (vc == columnDispRslt_loc_cd) return doDispRslt_loc_cd_VC(info);
		if (vc == columnDispRslt_loc_nm) return doDispRslt_loc_nm_VC(info);
		if (vc == columnDispRslt_oper_cd) return doDispRslt_oper_cd_VC(info);
		if (vc == columnDispRslt_oper_nm) return doDispRslt_oper_nm_VC(info);
		if (vc == columnDispRslt_bp_cd) return doDispRslt_bp_cd_VC(info);
		if (vc == columnDispRslt_bp_nm) return doDispRslt_bp_nm_VC(info);
		if (vc == columnDispRslt_ctg_cd) return doDispRslt_ctg_cd_VC(info);
		if (vc == columnDispRslt_ctg_nm) return doDispRslt_ctg_nm_VC(info);
		if (vc == columnDispRslt_itm_typ) return doDispRslt_itm_typ_VC(info);
		if (vc == columnDispRslt_itm_typ_nm) return doDispRslt_itm_typ_nm_VC(info);
		if (vc == columnDispRslt_itm_typ_d_cd) return doDispRslt_itm_typ_d_cd_VC(info);
		if (vc == columnDispRslt_itm_typ_d_nm) return doDispRslt_itm_typ_d_nm_VC(info);
		if (vc == columnDispRslt_itm_grp_cd1) return doDispRslt_itm_grp_cd1_VC(info);
		if (vc == columnDispRslt_itm_grp_nm1) return doDispRslt_itm_grp_nm1_VC(info);
		if (vc == columnDispRslt_itm_grp_cd2) return doDispRslt_itm_grp_cd2_VC(info);
		if (vc == columnDispRslt_itm_grp_nm2) return doDispRslt_itm_grp_nm2_VC(info);
		if (vc == columnDispRslt_itm_grp_cd3) return doDispRslt_itm_grp_cd3_VC(info);
		if (vc == columnDispRslt_itm_grp_nm3) return doDispRslt_itm_grp_nm3_VC(info);
		if (vc == columnDispRslt_itm_grp_cd4) return doDispRslt_itm_grp_cd4_VC(info);
		if (vc == columnDispRslt_itm_grp_nm4) return doDispRslt_itm_grp_nm4_VC(info);
		if (vc == columnDispRslt_itm_grp_cd5) return doDispRslt_itm_grp_cd5_VC(info);
		if (vc == columnDispRslt_itm_grp_nm5) return doDispRslt_itm_grp_nm5_VC(info);
		if (vc == columnDispRslt_itm_grp_cd6) return doDispRslt_itm_grp_cd6_VC(info);
		if (vc == columnDispRslt_itm_grp_nm6) return doDispRslt_itm_grp_nm6_VC(info);
		if (vc == columnDispRslt_itm_grp_cd7) return doDispRslt_itm_grp_cd7_VC(info);
		if (vc == columnDispRslt_itm_grp_nm7) return doDispRslt_itm_grp_nm7_VC(info);
		if (vc == columnDispRslt_itm_grp_cd8) return doDispRslt_itm_grp_cd8_VC(info);
		if (vc == columnDispRslt_itm_grp_nm8) return doDispRslt_itm_grp_nm8_VC(info);
		if (vc == columnDispRslt_itm_grp_cd9) return doDispRslt_itm_grp_cd9_VC(info);
		if (vc == columnDispRslt_itm_grp_nm9) return doDispRslt_itm_grp_nm9_VC(info);
		if (vc == columnDispRslt_itm_grp_cd10) return doDispRslt_itm_grp_cd10_VC(info);
		if (vc == columnDispRslt_itm_grp_nm10) return doDispRslt_itm_grp_nm10_VC(info);
		if (vc == columnDispRslt_lot_no) return doDispRslt_lot_no_VC(info);
		if (vc == columnDispRslt_sublot_no) return doDispRslt_sublot_no_VC(info);
		if (vc == columnDispRslt_sno1) return doDispRslt_sno1_VC(info);
		if (vc == columnDispRslt_sno2) return doDispRslt_sno2_VC(info);
		if (vc == columnDispRslt_sno3) return doDispRslt_sno3_VC(info);
		if (vc == columnDispRslt_sno4) return doDispRslt_sno4_VC(info);
		if (vc == columnDispRslt_bp_grp_cd1) return doDispRslt_bp_grp_cd1_VC(info);
		if (vc == columnDispRslt_bp_grp_nm1) return doDispRslt_bp_grp_nm1_VC(info);
		if (vc == columnDispRslt_bp_grp_cd2) return doDispRslt_bp_grp_cd2_VC(info);
		if (vc == columnDispRslt_bp_grp_nm2) return doDispRslt_bp_grp_nm2_VC(info);
		if (vc == columnDispRslt_bp_grp_cd3) return doDispRslt_bp_grp_cd3_VC(info);
		if (vc == columnDispRslt_bp_grp_nm3) return doDispRslt_bp_grp_nm3_VC(info);
		if (vc == columnDispRslt_bp_grp_cd4) return doDispRslt_bp_grp_cd4_VC(info);
		if (vc == columnDispRslt_bp_grp_nm4) return doDispRslt_bp_grp_nm4_VC(info);
		if (vc == columnDispRslt_bp_grp_cd5) return doDispRslt_bp_grp_cd5_VC(info);
		if (vc == columnDispRslt_bp_grp_nm5) return doDispRslt_bp_grp_nm5_VC(info);
		if (vc == columnDispRslt_bp_grp_cd6) return doDispRslt_bp_grp_cd6_VC(info);
		if (vc == columnDispRslt_bp_grp_nm6) return doDispRslt_bp_grp_nm6_VC(info);
		if (vc == columnDispRslt_bp_grp_cd7) return doDispRslt_bp_grp_cd7_VC(info);
		if (vc == columnDispRslt_bp_grp_nm7) return doDispRslt_bp_grp_nm7_VC(info);
		if (vc == columnDispRslt_bp_grp_cd8) return doDispRslt_bp_grp_cd8_VC(info);
		if (vc == columnDispRslt_bp_grp_nm8) return doDispRslt_bp_grp_nm8_VC(info);
		if (vc == columnDispRslt_bp_grp_cd9) return doDispRslt_bp_grp_cd9_VC(info);
		if (vc == columnDispRslt_bp_grp_nm9) return doDispRslt_bp_grp_nm9_VC(info);
		if (vc == columnDispRslt_bp_grp_cd10) return doDispRslt_bp_grp_cd10_VC(info);
		if (vc == columnDispRslt_bp_grp_nm10) return doDispRslt_bp_grp_nm10_VC(info);
		if (vc == columnDispRslt_elm_no) return doDispRslt_elm_no_VC(info);
		if (vc == columnDispRslt_elm) return doDispRslt_elm_VC(info);
		if (vc == columnDispRslt_elm_nm) return doDispRslt_elm_nm_VC(info);
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
	 * [DispRslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pre_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pln_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pln_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_calc_ctg_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[alc_rec_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_rec_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_rec_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_rec_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_nm3_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_rec_typ_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_rec_typ_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ctg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ctg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_typ_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_typ_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_typ_d_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_typ_d_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sublot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sublot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno4_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_flg1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_flg2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_flg3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_flg4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_flg5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_flg6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_flg7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_flg8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_flg9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_flg10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_flg1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_flg2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_flg3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_flg4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_flg5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_flg6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_flg7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_flg8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_flg9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_flg10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[disp_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_key_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[alc_rec_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_alc_rec_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[alc_rec_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_alc_rec_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[alc_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_alc_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[alc_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_alc_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_alc_ac_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_alc_ac_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_alc_ac_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_alc_ac_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_alc_ac_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_alc_ac_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_bp_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[elm_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_elm_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[elm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_elm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[elm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_elm_nm_VC(MCEventInfo info){
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
		else if (nc == DispRsltTable) doDispRslt_NC(info);
		else if (nc == Cnd_pre_alc_typ_Group) doCnd_pre_alc_typ_NC(info);
		else if (nc == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_NC(info);
		else if (nc == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_NC(info);
		else if (nc == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NC(info);
		else if (nc == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_alc_rec_typ) doCnd_alc_rec_typ_NC(info);
		else if (nc == Cnd_alc_rec_typ_nm) doCnd_alc_rec_typ_nm_NC(info);
		else if (nc == Cnd_alc_ac_cd) doCnd_alc_ac_cd_NC(info);
		else if (nc == Cnd_alc_ac_nm) doCnd_alc_ac_nm_NC(info);
		else if (nc == Cnd_alc_ac_grp_cd1) doCnd_alc_ac_grp_cd1_NC(info);
		else if (nc == Cnd_alc_ac_grp_nm1) doCnd_alc_ac_grp_nm1_NC(info);
		else if (nc == Cnd_alc_ac_grp_cd2) doCnd_alc_ac_grp_cd2_NC(info);
		else if (nc == Cnd_alc_ac_grp_nm2) doCnd_alc_ac_grp_nm2_NC(info);
		else if (nc == Cnd_alc_ac_grp_cd3) doCnd_alc_ac_grp_cd3_NC(info);
		else if (nc == Cnd_alc_ac_grp_nm3) doCnd_alc_ac_grp_nm3_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_oper_cd) doCnd_oper_cd_NC(info);
		else if (nc == Cnd_oper_nm) doCnd_oper_nm_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_ctg_cd) doCnd_ctg_cd_NC(info);
		else if (nc == Cnd_ctg_nm) doCnd_ctg_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_sno1) doCnd_sno1_NC(info);
		else if (nc == Cnd_sno2) doCnd_sno2_NC(info);
		else if (nc == Cnd_sno3) doCnd_sno3_NC(info);
		else if (nc == Cnd_sno4) doCnd_sno4_NC(info);
		else if (nc == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_NC(info);
		else if (nc == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_NC(info);
		else if (nc == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_NC(info);
		else if (nc == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_NC(info);
		else if (nc == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_NC(info);
		else if (nc == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_NC(info);
		else if (nc == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_NC(info);
		else if (nc == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_NC(info);
		else if (nc == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_NC(info);
		else if (nc == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_NC(info);
		else if (nc == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_NC(info);
		else if (nc == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_NC(info);
		else if (nc == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_NC(info);
		else if (nc == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_NC(info);
		else if (nc == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_NC(info);
		else if (nc == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_NC(info);
		else if (nc == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_NC(info);
		else if (nc == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_NC(info);
		else if (nc == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_NC(info);
		else if (nc == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_NC(info);
		else if (nc == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_NC(info);
		else if (nc == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_NC(info);
		else if (nc == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_NC(info);
		else if (nc == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_NC(info);
		else if (nc == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_NC(info);
		else if (nc == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_NC(info);
		else if (nc == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_NC(info);
		else if (nc == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_NC(info);
		else if (nc == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_NC(info);
		else if (nc == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_NC(info);
		else if (nc == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_NC(info);
		else if (nc == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_NC(info);
		else if (nc == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_NC(info);
		else if (nc == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_NC(info);
		else if (nc == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_NC(info);
		else if (nc == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_NC(info);
		else if (nc == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_NC(info);
		else if (nc == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_NC(info);
		else if (nc == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_NC(info);
		else if (nc == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_alc_rec_typ_flg) doCnd_alc_rec_typ_flg_NC(info);
		else if (nc == Cnd_alc_ac_flg) doCnd_alc_ac_flg_NC(info);
		else if (nc == Cnd_alc_ac_grp1_flg) doCnd_alc_ac_grp1_flg_NC(info);
		else if (nc == Cnd_alc_ac_grp2_flg) doCnd_alc_ac_grp2_flg_NC(info);
		else if (nc == Cnd_alc_ac_grp3_flg) doCnd_alc_ac_grp3_flg_NC(info);
		else if (nc == Cnd_dpt_flg) doCnd_dpt_flg_NC(info);
		else if (nc == Cnd_loc_flg) doCnd_loc_flg_NC(info);
		else if (nc == Cnd_oper_flg) doCnd_oper_flg_NC(info);
		else if (nc == Cnd_bp_flg) doCnd_bp_flg_NC(info);
		else if (nc == Cnd_ctg_flg) doCnd_ctg_flg_NC(info);
		else if (nc == Cnd_itm_flg) doCnd_itm_flg_NC(info);
		else if (nc == Cnd_itm_typ_flg) doCnd_itm_typ_flg_NC(info);
		else if (nc == Cnd_itm_typ_d_flg) doCnd_itm_typ_d_flg_NC(info);
		else if (nc == Cnd_lot_flg) doCnd_lot_flg_NC(info);
		else if (nc == Cnd_sublot_flg) doCnd_sublot_flg_NC(info);
		else if (nc == Cnd_sno1_flg) doCnd_sno1_flg_NC(info);
		else if (nc == Cnd_sno2_flg) doCnd_sno2_flg_NC(info);
		else if (nc == Cnd_sno3_flg) doCnd_sno3_flg_NC(info);
		else if (nc == Cnd_sno4_flg) doCnd_sno4_flg_NC(info);
		else if (nc == Cnd_itm_grp_flg1) doCnd_itm_grp_flg1_NC(info);
		else if (nc == Cnd_itm_grp_flg2) doCnd_itm_grp_flg2_NC(info);
		else if (nc == Cnd_itm_grp_flg3) doCnd_itm_grp_flg3_NC(info);
		else if (nc == Cnd_itm_grp_flg4) doCnd_itm_grp_flg4_NC(info);
		else if (nc == Cnd_itm_grp_flg5) doCnd_itm_grp_flg5_NC(info);
		else if (nc == Cnd_itm_grp_flg6) doCnd_itm_grp_flg6_NC(info);
		else if (nc == Cnd_itm_grp_flg7) doCnd_itm_grp_flg7_NC(info);
		else if (nc == Cnd_itm_grp_flg8) doCnd_itm_grp_flg8_NC(info);
		else if (nc == Cnd_itm_grp_flg9) doCnd_itm_grp_flg9_NC(info);
		else if (nc == Cnd_itm_grp_flg10) doCnd_itm_grp_flg10_NC(info);
		else if (nc == Cnd_bp_grp_flg1) doCnd_bp_grp_flg1_NC(info);
		else if (nc == Cnd_bp_grp_flg2) doCnd_bp_grp_flg2_NC(info);
		else if (nc == Cnd_bp_grp_flg3) doCnd_bp_grp_flg3_NC(info);
		else if (nc == Cnd_bp_grp_flg4) doCnd_bp_grp_flg4_NC(info);
		else if (nc == Cnd_bp_grp_flg5) doCnd_bp_grp_flg5_NC(info);
		else if (nc == Cnd_bp_grp_flg6) doCnd_bp_grp_flg6_NC(info);
		else if (nc == Cnd_bp_grp_flg7) doCnd_bp_grp_flg7_NC(info);
		else if (nc == Cnd_bp_grp_flg8) doCnd_bp_grp_flg8_NC(info);
		else if (nc == Cnd_bp_grp_flg9) doCnd_bp_grp_flg9_NC(info);
		else if (nc == Cnd_bp_grp_flg10) doCnd_bp_grp_flg10_NC(info);
		else if (nc == Cnd_disp_key) doCnd_disp_key_NC(info);
		else if (nc == Cnd_cur_cd) doCnd_cur_cd_NC(info);
		else if (nc == Cnd_amt_dec_place) doCnd_amt_dec_place_NC(info);
		else if (nc == columnDispRslt_wg_cd) doDispRslt_wg_cd_NC(info);
		else if (nc == columnDispRslt_wg_nm) doDispRslt_wg_nm_NC(info);
		else if (nc == columnDispRslt_alc_rec_typ) doDispRslt_alc_rec_typ_NC(info);
		else if (nc == columnDispRslt_alc_rec_typ_nm) doDispRslt_alc_rec_typ_nm_NC(info);
		else if (nc == columnDispRslt_alc_ac_cd) doDispRslt_alc_ac_cd_NC(info);
		else if (nc == columnDispRslt_alc_ac_nm) doDispRslt_alc_ac_nm_NC(info);
		else if (nc == columnDispRslt_alc_ac_grp_cd1) doDispRslt_alc_ac_grp_cd1_NC(info);
		else if (nc == columnDispRslt_alc_ac_grp_nm1) doDispRslt_alc_ac_grp_nm1_NC(info);
		else if (nc == columnDispRslt_alc_ac_grp_cd2) doDispRslt_alc_ac_grp_cd2_NC(info);
		else if (nc == columnDispRslt_alc_ac_grp_nm2) doDispRslt_alc_ac_grp_nm2_NC(info);
		else if (nc == columnDispRslt_alc_ac_grp_cd3) doDispRslt_alc_ac_grp_cd3_NC(info);
		else if (nc == columnDispRslt_alc_ac_grp_nm3) doDispRslt_alc_ac_grp_nm3_NC(info);
		else if (nc == columnDispRslt_dpt_cd) doDispRslt_dpt_cd_NC(info);
		else if (nc == columnDispRslt_dpt_nm) doDispRslt_dpt_nm_NC(info);
		else if (nc == columnDispRslt_loc_cd) doDispRslt_loc_cd_NC(info);
		else if (nc == columnDispRslt_loc_nm) doDispRslt_loc_nm_NC(info);
		else if (nc == columnDispRslt_oper_cd) doDispRslt_oper_cd_NC(info);
		else if (nc == columnDispRslt_oper_nm) doDispRslt_oper_nm_NC(info);
		else if (nc == columnDispRslt_bp_cd) doDispRslt_bp_cd_NC(info);
		else if (nc == columnDispRslt_bp_nm) doDispRslt_bp_nm_NC(info);
		else if (nc == columnDispRslt_ctg_cd) doDispRslt_ctg_cd_NC(info);
		else if (nc == columnDispRslt_ctg_nm) doDispRslt_ctg_nm_NC(info);
		else if (nc == columnDispRslt_itm_typ) doDispRslt_itm_typ_NC(info);
		else if (nc == columnDispRslt_itm_typ_nm) doDispRslt_itm_typ_nm_NC(info);
		else if (nc == columnDispRslt_itm_typ_d_cd) doDispRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnDispRslt_itm_typ_d_nm) doDispRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnDispRslt_itm_grp_cd1) doDispRslt_itm_grp_cd1_NC(info);
		else if (nc == columnDispRslt_itm_grp_nm1) doDispRslt_itm_grp_nm1_NC(info);
		else if (nc == columnDispRslt_itm_grp_cd2) doDispRslt_itm_grp_cd2_NC(info);
		else if (nc == columnDispRslt_itm_grp_nm2) doDispRslt_itm_grp_nm2_NC(info);
		else if (nc == columnDispRslt_itm_grp_cd3) doDispRslt_itm_grp_cd3_NC(info);
		else if (nc == columnDispRslt_itm_grp_nm3) doDispRslt_itm_grp_nm3_NC(info);
		else if (nc == columnDispRslt_itm_grp_cd4) doDispRslt_itm_grp_cd4_NC(info);
		else if (nc == columnDispRslt_itm_grp_nm4) doDispRslt_itm_grp_nm4_NC(info);
		else if (nc == columnDispRslt_itm_grp_cd5) doDispRslt_itm_grp_cd5_NC(info);
		else if (nc == columnDispRslt_itm_grp_nm5) doDispRslt_itm_grp_nm5_NC(info);
		else if (nc == columnDispRslt_itm_grp_cd6) doDispRslt_itm_grp_cd6_NC(info);
		else if (nc == columnDispRslt_itm_grp_nm6) doDispRslt_itm_grp_nm6_NC(info);
		else if (nc == columnDispRslt_itm_grp_cd7) doDispRslt_itm_grp_cd7_NC(info);
		else if (nc == columnDispRslt_itm_grp_nm7) doDispRslt_itm_grp_nm7_NC(info);
		else if (nc == columnDispRslt_itm_grp_cd8) doDispRslt_itm_grp_cd8_NC(info);
		else if (nc == columnDispRslt_itm_grp_nm8) doDispRslt_itm_grp_nm8_NC(info);
		else if (nc == columnDispRslt_itm_grp_cd9) doDispRslt_itm_grp_cd9_NC(info);
		else if (nc == columnDispRslt_itm_grp_nm9) doDispRslt_itm_grp_nm9_NC(info);
		else if (nc == columnDispRslt_itm_grp_cd10) doDispRslt_itm_grp_cd10_NC(info);
		else if (nc == columnDispRslt_itm_grp_nm10) doDispRslt_itm_grp_nm10_NC(info);
		else if (nc == columnDispRslt_lot_no) doDispRslt_lot_no_NC(info);
		else if (nc == columnDispRslt_sublot_no) doDispRslt_sublot_no_NC(info);
		else if (nc == columnDispRslt_sno1) doDispRslt_sno1_NC(info);
		else if (nc == columnDispRslt_sno2) doDispRslt_sno2_NC(info);
		else if (nc == columnDispRslt_sno3) doDispRslt_sno3_NC(info);
		else if (nc == columnDispRslt_sno4) doDispRslt_sno4_NC(info);
		else if (nc == columnDispRslt_bp_grp_cd1) doDispRslt_bp_grp_cd1_NC(info);
		else if (nc == columnDispRslt_bp_grp_nm1) doDispRslt_bp_grp_nm1_NC(info);
		else if (nc == columnDispRslt_bp_grp_cd2) doDispRslt_bp_grp_cd2_NC(info);
		else if (nc == columnDispRslt_bp_grp_nm2) doDispRslt_bp_grp_nm2_NC(info);
		else if (nc == columnDispRslt_bp_grp_cd3) doDispRslt_bp_grp_cd3_NC(info);
		else if (nc == columnDispRslt_bp_grp_nm3) doDispRslt_bp_grp_nm3_NC(info);
		else if (nc == columnDispRslt_bp_grp_cd4) doDispRslt_bp_grp_cd4_NC(info);
		else if (nc == columnDispRslt_bp_grp_nm4) doDispRslt_bp_grp_nm4_NC(info);
		else if (nc == columnDispRslt_bp_grp_cd5) doDispRslt_bp_grp_cd5_NC(info);
		else if (nc == columnDispRslt_bp_grp_nm5) doDispRslt_bp_grp_nm5_NC(info);
		else if (nc == columnDispRslt_bp_grp_cd6) doDispRslt_bp_grp_cd6_NC(info);
		else if (nc == columnDispRslt_bp_grp_nm6) doDispRslt_bp_grp_nm6_NC(info);
		else if (nc == columnDispRslt_bp_grp_cd7) doDispRslt_bp_grp_cd7_NC(info);
		else if (nc == columnDispRslt_bp_grp_nm7) doDispRslt_bp_grp_nm7_NC(info);
		else if (nc == columnDispRslt_bp_grp_cd8) doDispRslt_bp_grp_cd8_NC(info);
		else if (nc == columnDispRslt_bp_grp_nm8) doDispRslt_bp_grp_nm8_NC(info);
		else if (nc == columnDispRslt_bp_grp_cd9) doDispRslt_bp_grp_cd9_NC(info);
		else if (nc == columnDispRslt_bp_grp_nm9) doDispRslt_bp_grp_nm9_NC(info);
		else if (nc == columnDispRslt_bp_grp_cd10) doDispRslt_bp_grp_cd10_NC(info);
		else if (nc == columnDispRslt_bp_grp_nm10) doDispRslt_bp_grp_nm10_NC(info);
		else if (nc == columnDispRslt_elm_no) doDispRslt_elm_no_NC(info);
		else if (nc == columnDispRslt_elm) doDispRslt_elm_NC(info);
		else if (nc == columnDispRslt_elm_nm) doDispRslt_elm_nm_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[alc_rec_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rec_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_rec_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rec_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm3_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_rec_typ_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rec_typ_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_typ_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_typ_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_typ_d_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_typ_d_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_rec_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_rec_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_rec_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_rec_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno4_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_no_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_nm_NC(MCEventInfo info){
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
		else if (ne == DispRsltTable) doDispRslt_NE(info);
		else if (ne == Cnd_pre_alc_typ_Group) doCnd_pre_alc_typ_NE(info);
		else if (ne == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_NE(info);
		else if (ne == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_NE(info);
		else if (ne == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NE(info);
		else if (ne == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_alc_rec_typ) doCnd_alc_rec_typ_NE(info);
		else if (ne == Cnd_alc_rec_typ_nm) doCnd_alc_rec_typ_nm_NE(info);
		else if (ne == Cnd_alc_ac_cd) doCnd_alc_ac_cd_NE(info);
		else if (ne == Cnd_alc_ac_nm) doCnd_alc_ac_nm_NE(info);
		else if (ne == Cnd_alc_ac_grp_cd1) doCnd_alc_ac_grp_cd1_NE(info);
		else if (ne == Cnd_alc_ac_grp_nm1) doCnd_alc_ac_grp_nm1_NE(info);
		else if (ne == Cnd_alc_ac_grp_cd2) doCnd_alc_ac_grp_cd2_NE(info);
		else if (ne == Cnd_alc_ac_grp_nm2) doCnd_alc_ac_grp_nm2_NE(info);
		else if (ne == Cnd_alc_ac_grp_cd3) doCnd_alc_ac_grp_cd3_NE(info);
		else if (ne == Cnd_alc_ac_grp_nm3) doCnd_alc_ac_grp_nm3_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_oper_cd) doCnd_oper_cd_NE(info);
		else if (ne == Cnd_oper_nm) doCnd_oper_nm_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_ctg_cd) doCnd_ctg_cd_NE(info);
		else if (ne == Cnd_ctg_nm) doCnd_ctg_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_sno1) doCnd_sno1_NE(info);
		else if (ne == Cnd_sno2) doCnd_sno2_NE(info);
		else if (ne == Cnd_sno3) doCnd_sno3_NE(info);
		else if (ne == Cnd_sno4) doCnd_sno4_NE(info);
		else if (ne == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_NE(info);
		else if (ne == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_NE(info);
		else if (ne == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_NE(info);
		else if (ne == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_NE(info);
		else if (ne == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_NE(info);
		else if (ne == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_NE(info);
		else if (ne == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_NE(info);
		else if (ne == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_NE(info);
		else if (ne == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_NE(info);
		else if (ne == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_NE(info);
		else if (ne == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_NE(info);
		else if (ne == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_NE(info);
		else if (ne == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_NE(info);
		else if (ne == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_NE(info);
		else if (ne == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_NE(info);
		else if (ne == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_NE(info);
		else if (ne == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_NE(info);
		else if (ne == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_NE(info);
		else if (ne == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_NE(info);
		else if (ne == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_NE(info);
		else if (ne == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_NE(info);
		else if (ne == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_NE(info);
		else if (ne == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_NE(info);
		else if (ne == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_NE(info);
		else if (ne == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_NE(info);
		else if (ne == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_NE(info);
		else if (ne == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_NE(info);
		else if (ne == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_NE(info);
		else if (ne == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_NE(info);
		else if (ne == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_NE(info);
		else if (ne == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_NE(info);
		else if (ne == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_NE(info);
		else if (ne == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_NE(info);
		else if (ne == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_NE(info);
		else if (ne == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_NE(info);
		else if (ne == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_NE(info);
		else if (ne == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_NE(info);
		else if (ne == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_NE(info);
		else if (ne == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_NE(info);
		else if (ne == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_alc_rec_typ_flg) doCnd_alc_rec_typ_flg_NE(info);
		else if (ne == Cnd_alc_ac_flg) doCnd_alc_ac_flg_NE(info);
		else if (ne == Cnd_alc_ac_grp1_flg) doCnd_alc_ac_grp1_flg_NE(info);
		else if (ne == Cnd_alc_ac_grp2_flg) doCnd_alc_ac_grp2_flg_NE(info);
		else if (ne == Cnd_alc_ac_grp3_flg) doCnd_alc_ac_grp3_flg_NE(info);
		else if (ne == Cnd_dpt_flg) doCnd_dpt_flg_NE(info);
		else if (ne == Cnd_loc_flg) doCnd_loc_flg_NE(info);
		else if (ne == Cnd_oper_flg) doCnd_oper_flg_NE(info);
		else if (ne == Cnd_bp_flg) doCnd_bp_flg_NE(info);
		else if (ne == Cnd_ctg_flg) doCnd_ctg_flg_NE(info);
		else if (ne == Cnd_itm_flg) doCnd_itm_flg_NE(info);
		else if (ne == Cnd_itm_typ_flg) doCnd_itm_typ_flg_NE(info);
		else if (ne == Cnd_itm_typ_d_flg) doCnd_itm_typ_d_flg_NE(info);
		else if (ne == Cnd_lot_flg) doCnd_lot_flg_NE(info);
		else if (ne == Cnd_sublot_flg) doCnd_sublot_flg_NE(info);
		else if (ne == Cnd_sno1_flg) doCnd_sno1_flg_NE(info);
		else if (ne == Cnd_sno2_flg) doCnd_sno2_flg_NE(info);
		else if (ne == Cnd_sno3_flg) doCnd_sno3_flg_NE(info);
		else if (ne == Cnd_sno4_flg) doCnd_sno4_flg_NE(info);
		else if (ne == Cnd_itm_grp_flg1) doCnd_itm_grp_flg1_NE(info);
		else if (ne == Cnd_itm_grp_flg2) doCnd_itm_grp_flg2_NE(info);
		else if (ne == Cnd_itm_grp_flg3) doCnd_itm_grp_flg3_NE(info);
		else if (ne == Cnd_itm_grp_flg4) doCnd_itm_grp_flg4_NE(info);
		else if (ne == Cnd_itm_grp_flg5) doCnd_itm_grp_flg5_NE(info);
		else if (ne == Cnd_itm_grp_flg6) doCnd_itm_grp_flg6_NE(info);
		else if (ne == Cnd_itm_grp_flg7) doCnd_itm_grp_flg7_NE(info);
		else if (ne == Cnd_itm_grp_flg8) doCnd_itm_grp_flg8_NE(info);
		else if (ne == Cnd_itm_grp_flg9) doCnd_itm_grp_flg9_NE(info);
		else if (ne == Cnd_itm_grp_flg10) doCnd_itm_grp_flg10_NE(info);
		else if (ne == Cnd_bp_grp_flg1) doCnd_bp_grp_flg1_NE(info);
		else if (ne == Cnd_bp_grp_flg2) doCnd_bp_grp_flg2_NE(info);
		else if (ne == Cnd_bp_grp_flg3) doCnd_bp_grp_flg3_NE(info);
		else if (ne == Cnd_bp_grp_flg4) doCnd_bp_grp_flg4_NE(info);
		else if (ne == Cnd_bp_grp_flg5) doCnd_bp_grp_flg5_NE(info);
		else if (ne == Cnd_bp_grp_flg6) doCnd_bp_grp_flg6_NE(info);
		else if (ne == Cnd_bp_grp_flg7) doCnd_bp_grp_flg7_NE(info);
		else if (ne == Cnd_bp_grp_flg8) doCnd_bp_grp_flg8_NE(info);
		else if (ne == Cnd_bp_grp_flg9) doCnd_bp_grp_flg9_NE(info);
		else if (ne == Cnd_bp_grp_flg10) doCnd_bp_grp_flg10_NE(info);
		else if (ne == Cnd_disp_key) doCnd_disp_key_NE(info);
		else if (ne == Cnd_cur_cd) doCnd_cur_cd_NE(info);
		else if (ne == Cnd_amt_dec_place) doCnd_amt_dec_place_NE(info);
		else if (ne == columnDispRslt_wg_cd) doDispRslt_wg_cd_NE(info);
		else if (ne == columnDispRslt_wg_nm) doDispRslt_wg_nm_NE(info);
		else if (ne == columnDispRslt_alc_rec_typ) doDispRslt_alc_rec_typ_NE(info);
		else if (ne == columnDispRslt_alc_rec_typ_nm) doDispRslt_alc_rec_typ_nm_NE(info);
		else if (ne == columnDispRslt_alc_ac_cd) doDispRslt_alc_ac_cd_NE(info);
		else if (ne == columnDispRslt_alc_ac_nm) doDispRslt_alc_ac_nm_NE(info);
		else if (ne == columnDispRslt_alc_ac_grp_cd1) doDispRslt_alc_ac_grp_cd1_NE(info);
		else if (ne == columnDispRslt_alc_ac_grp_nm1) doDispRslt_alc_ac_grp_nm1_NE(info);
		else if (ne == columnDispRslt_alc_ac_grp_cd2) doDispRslt_alc_ac_grp_cd2_NE(info);
		else if (ne == columnDispRslt_alc_ac_grp_nm2) doDispRslt_alc_ac_grp_nm2_NE(info);
		else if (ne == columnDispRslt_alc_ac_grp_cd3) doDispRslt_alc_ac_grp_cd3_NE(info);
		else if (ne == columnDispRslt_alc_ac_grp_nm3) doDispRslt_alc_ac_grp_nm3_NE(info);
		else if (ne == columnDispRslt_dpt_cd) doDispRslt_dpt_cd_NE(info);
		else if (ne == columnDispRslt_dpt_nm) doDispRslt_dpt_nm_NE(info);
		else if (ne == columnDispRslt_loc_cd) doDispRslt_loc_cd_NE(info);
		else if (ne == columnDispRslt_loc_nm) doDispRslt_loc_nm_NE(info);
		else if (ne == columnDispRslt_oper_cd) doDispRslt_oper_cd_NE(info);
		else if (ne == columnDispRslt_oper_nm) doDispRslt_oper_nm_NE(info);
		else if (ne == columnDispRslt_bp_cd) doDispRslt_bp_cd_NE(info);
		else if (ne == columnDispRslt_bp_nm) doDispRslt_bp_nm_NE(info);
		else if (ne == columnDispRslt_ctg_cd) doDispRslt_ctg_cd_NE(info);
		else if (ne == columnDispRslt_ctg_nm) doDispRslt_ctg_nm_NE(info);
		else if (ne == columnDispRslt_itm_typ) doDispRslt_itm_typ_NE(info);
		else if (ne == columnDispRslt_itm_typ_nm) doDispRslt_itm_typ_nm_NE(info);
		else if (ne == columnDispRslt_itm_typ_d_cd) doDispRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnDispRslt_itm_typ_d_nm) doDispRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnDispRslt_itm_grp_cd1) doDispRslt_itm_grp_cd1_NE(info);
		else if (ne == columnDispRslt_itm_grp_nm1) doDispRslt_itm_grp_nm1_NE(info);
		else if (ne == columnDispRslt_itm_grp_cd2) doDispRslt_itm_grp_cd2_NE(info);
		else if (ne == columnDispRslt_itm_grp_nm2) doDispRslt_itm_grp_nm2_NE(info);
		else if (ne == columnDispRslt_itm_grp_cd3) doDispRslt_itm_grp_cd3_NE(info);
		else if (ne == columnDispRslt_itm_grp_nm3) doDispRslt_itm_grp_nm3_NE(info);
		else if (ne == columnDispRslt_itm_grp_cd4) doDispRslt_itm_grp_cd4_NE(info);
		else if (ne == columnDispRslt_itm_grp_nm4) doDispRslt_itm_grp_nm4_NE(info);
		else if (ne == columnDispRslt_itm_grp_cd5) doDispRslt_itm_grp_cd5_NE(info);
		else if (ne == columnDispRslt_itm_grp_nm5) doDispRslt_itm_grp_nm5_NE(info);
		else if (ne == columnDispRslt_itm_grp_cd6) doDispRslt_itm_grp_cd6_NE(info);
		else if (ne == columnDispRslt_itm_grp_nm6) doDispRslt_itm_grp_nm6_NE(info);
		else if (ne == columnDispRslt_itm_grp_cd7) doDispRslt_itm_grp_cd7_NE(info);
		else if (ne == columnDispRslt_itm_grp_nm7) doDispRslt_itm_grp_nm7_NE(info);
		else if (ne == columnDispRslt_itm_grp_cd8) doDispRslt_itm_grp_cd8_NE(info);
		else if (ne == columnDispRslt_itm_grp_nm8) doDispRslt_itm_grp_nm8_NE(info);
		else if (ne == columnDispRslt_itm_grp_cd9) doDispRslt_itm_grp_cd9_NE(info);
		else if (ne == columnDispRslt_itm_grp_nm9) doDispRslt_itm_grp_nm9_NE(info);
		else if (ne == columnDispRslt_itm_grp_cd10) doDispRslt_itm_grp_cd10_NE(info);
		else if (ne == columnDispRslt_itm_grp_nm10) doDispRslt_itm_grp_nm10_NE(info);
		else if (ne == columnDispRslt_lot_no) doDispRslt_lot_no_NE(info);
		else if (ne == columnDispRslt_sublot_no) doDispRslt_sublot_no_NE(info);
		else if (ne == columnDispRslt_sno1) doDispRslt_sno1_NE(info);
		else if (ne == columnDispRslt_sno2) doDispRslt_sno2_NE(info);
		else if (ne == columnDispRslt_sno3) doDispRslt_sno3_NE(info);
		else if (ne == columnDispRslt_sno4) doDispRslt_sno4_NE(info);
		else if (ne == columnDispRslt_bp_grp_cd1) doDispRslt_bp_grp_cd1_NE(info);
		else if (ne == columnDispRslt_bp_grp_nm1) doDispRslt_bp_grp_nm1_NE(info);
		else if (ne == columnDispRslt_bp_grp_cd2) doDispRslt_bp_grp_cd2_NE(info);
		else if (ne == columnDispRslt_bp_grp_nm2) doDispRslt_bp_grp_nm2_NE(info);
		else if (ne == columnDispRslt_bp_grp_cd3) doDispRslt_bp_grp_cd3_NE(info);
		else if (ne == columnDispRslt_bp_grp_nm3) doDispRslt_bp_grp_nm3_NE(info);
		else if (ne == columnDispRslt_bp_grp_cd4) doDispRslt_bp_grp_cd4_NE(info);
		else if (ne == columnDispRslt_bp_grp_nm4) doDispRslt_bp_grp_nm4_NE(info);
		else if (ne == columnDispRslt_bp_grp_cd5) doDispRslt_bp_grp_cd5_NE(info);
		else if (ne == columnDispRslt_bp_grp_nm5) doDispRslt_bp_grp_nm5_NE(info);
		else if (ne == columnDispRslt_bp_grp_cd6) doDispRslt_bp_grp_cd6_NE(info);
		else if (ne == columnDispRslt_bp_grp_nm6) doDispRslt_bp_grp_nm6_NE(info);
		else if (ne == columnDispRslt_bp_grp_cd7) doDispRslt_bp_grp_cd7_NE(info);
		else if (ne == columnDispRslt_bp_grp_nm7) doDispRslt_bp_grp_nm7_NE(info);
		else if (ne == columnDispRslt_bp_grp_cd8) doDispRslt_bp_grp_cd8_NE(info);
		else if (ne == columnDispRslt_bp_grp_nm8) doDispRslt_bp_grp_nm8_NE(info);
		else if (ne == columnDispRslt_bp_grp_cd9) doDispRslt_bp_grp_cd9_NE(info);
		else if (ne == columnDispRslt_bp_grp_nm9) doDispRslt_bp_grp_nm9_NE(info);
		else if (ne == columnDispRslt_bp_grp_cd10) doDispRslt_bp_grp_cd10_NE(info);
		else if (ne == columnDispRslt_bp_grp_nm10) doDispRslt_bp_grp_nm10_NE(info);
		else if (ne == columnDispRslt_elm_no) doDispRslt_elm_no_NE(info);
		else if (ne == columnDispRslt_elm) doDispRslt_elm_NE(info);
		else if (ne == columnDispRslt_elm_nm) doDispRslt_elm_nm_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[alc_rec_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rec_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_rec_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rec_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm3_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_rec_typ_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rec_typ_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_typ_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_typ_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_typ_d_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_typ_d_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_rec_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_rec_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_rec_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_rec_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno4_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_no_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_nm_NE(MCEventInfo info){
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
		else if (nx == DispRsltTable) doDispRslt_NX(info);
		else if (nx == Cnd_pre_alc_typ_Group) doCnd_pre_alc_typ_NX(info);
		else if (nx == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_NX(info);
		else if (nx == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_NX(info);
		else if (nx == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NX(info);
		else if (nx == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_alc_rec_typ) doCnd_alc_rec_typ_NX(info);
		else if (nx == Cnd_alc_rec_typ_nm) doCnd_alc_rec_typ_nm_NX(info);
		else if (nx == Cnd_alc_ac_cd) doCnd_alc_ac_cd_NX(info);
		else if (nx == Cnd_alc_ac_nm) doCnd_alc_ac_nm_NX(info);
		else if (nx == Cnd_alc_ac_grp_cd1) doCnd_alc_ac_grp_cd1_NX(info);
		else if (nx == Cnd_alc_ac_grp_nm1) doCnd_alc_ac_grp_nm1_NX(info);
		else if (nx == Cnd_alc_ac_grp_cd2) doCnd_alc_ac_grp_cd2_NX(info);
		else if (nx == Cnd_alc_ac_grp_nm2) doCnd_alc_ac_grp_nm2_NX(info);
		else if (nx == Cnd_alc_ac_grp_cd3) doCnd_alc_ac_grp_cd3_NX(info);
		else if (nx == Cnd_alc_ac_grp_nm3) doCnd_alc_ac_grp_nm3_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_oper_cd) doCnd_oper_cd_NX(info);
		else if (nx == Cnd_oper_nm) doCnd_oper_nm_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_ctg_cd) doCnd_ctg_cd_NX(info);
		else if (nx == Cnd_ctg_nm) doCnd_ctg_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_sno1) doCnd_sno1_NX(info);
		else if (nx == Cnd_sno2) doCnd_sno2_NX(info);
		else if (nx == Cnd_sno3) doCnd_sno3_NX(info);
		else if (nx == Cnd_sno4) doCnd_sno4_NX(info);
		else if (nx == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_NX(info);
		else if (nx == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_NX(info);
		else if (nx == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_NX(info);
		else if (nx == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_NX(info);
		else if (nx == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_NX(info);
		else if (nx == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_NX(info);
		else if (nx == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_NX(info);
		else if (nx == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_NX(info);
		else if (nx == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_NX(info);
		else if (nx == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_NX(info);
		else if (nx == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_NX(info);
		else if (nx == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_NX(info);
		else if (nx == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_NX(info);
		else if (nx == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_NX(info);
		else if (nx == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_NX(info);
		else if (nx == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_NX(info);
		else if (nx == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_NX(info);
		else if (nx == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_NX(info);
		else if (nx == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_NX(info);
		else if (nx == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_NX(info);
		else if (nx == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_NX(info);
		else if (nx == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_NX(info);
		else if (nx == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_NX(info);
		else if (nx == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_NX(info);
		else if (nx == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_NX(info);
		else if (nx == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_NX(info);
		else if (nx == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_NX(info);
		else if (nx == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_NX(info);
		else if (nx == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_NX(info);
		else if (nx == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_NX(info);
		else if (nx == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_NX(info);
		else if (nx == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_NX(info);
		else if (nx == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_NX(info);
		else if (nx == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_NX(info);
		else if (nx == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_NX(info);
		else if (nx == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_NX(info);
		else if (nx == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_NX(info);
		else if (nx == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_NX(info);
		else if (nx == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_NX(info);
		else if (nx == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_alc_rec_typ_flg) doCnd_alc_rec_typ_flg_NX(info);
		else if (nx == Cnd_alc_ac_flg) doCnd_alc_ac_flg_NX(info);
		else if (nx == Cnd_alc_ac_grp1_flg) doCnd_alc_ac_grp1_flg_NX(info);
		else if (nx == Cnd_alc_ac_grp2_flg) doCnd_alc_ac_grp2_flg_NX(info);
		else if (nx == Cnd_alc_ac_grp3_flg) doCnd_alc_ac_grp3_flg_NX(info);
		else if (nx == Cnd_dpt_flg) doCnd_dpt_flg_NX(info);
		else if (nx == Cnd_loc_flg) doCnd_loc_flg_NX(info);
		else if (nx == Cnd_oper_flg) doCnd_oper_flg_NX(info);
		else if (nx == Cnd_bp_flg) doCnd_bp_flg_NX(info);
		else if (nx == Cnd_ctg_flg) doCnd_ctg_flg_NX(info);
		else if (nx == Cnd_itm_flg) doCnd_itm_flg_NX(info);
		else if (nx == Cnd_itm_typ_flg) doCnd_itm_typ_flg_NX(info);
		else if (nx == Cnd_itm_typ_d_flg) doCnd_itm_typ_d_flg_NX(info);
		else if (nx == Cnd_lot_flg) doCnd_lot_flg_NX(info);
		else if (nx == Cnd_sublot_flg) doCnd_sublot_flg_NX(info);
		else if (nx == Cnd_sno1_flg) doCnd_sno1_flg_NX(info);
		else if (nx == Cnd_sno2_flg) doCnd_sno2_flg_NX(info);
		else if (nx == Cnd_sno3_flg) doCnd_sno3_flg_NX(info);
		else if (nx == Cnd_sno4_flg) doCnd_sno4_flg_NX(info);
		else if (nx == Cnd_itm_grp_flg1) doCnd_itm_grp_flg1_NX(info);
		else if (nx == Cnd_itm_grp_flg2) doCnd_itm_grp_flg2_NX(info);
		else if (nx == Cnd_itm_grp_flg3) doCnd_itm_grp_flg3_NX(info);
		else if (nx == Cnd_itm_grp_flg4) doCnd_itm_grp_flg4_NX(info);
		else if (nx == Cnd_itm_grp_flg5) doCnd_itm_grp_flg5_NX(info);
		else if (nx == Cnd_itm_grp_flg6) doCnd_itm_grp_flg6_NX(info);
		else if (nx == Cnd_itm_grp_flg7) doCnd_itm_grp_flg7_NX(info);
		else if (nx == Cnd_itm_grp_flg8) doCnd_itm_grp_flg8_NX(info);
		else if (nx == Cnd_itm_grp_flg9) doCnd_itm_grp_flg9_NX(info);
		else if (nx == Cnd_itm_grp_flg10) doCnd_itm_grp_flg10_NX(info);
		else if (nx == Cnd_bp_grp_flg1) doCnd_bp_grp_flg1_NX(info);
		else if (nx == Cnd_bp_grp_flg2) doCnd_bp_grp_flg2_NX(info);
		else if (nx == Cnd_bp_grp_flg3) doCnd_bp_grp_flg3_NX(info);
		else if (nx == Cnd_bp_grp_flg4) doCnd_bp_grp_flg4_NX(info);
		else if (nx == Cnd_bp_grp_flg5) doCnd_bp_grp_flg5_NX(info);
		else if (nx == Cnd_bp_grp_flg6) doCnd_bp_grp_flg6_NX(info);
		else if (nx == Cnd_bp_grp_flg7) doCnd_bp_grp_flg7_NX(info);
		else if (nx == Cnd_bp_grp_flg8) doCnd_bp_grp_flg8_NX(info);
		else if (nx == Cnd_bp_grp_flg9) doCnd_bp_grp_flg9_NX(info);
		else if (nx == Cnd_bp_grp_flg10) doCnd_bp_grp_flg10_NX(info);
		else if (nx == Cnd_disp_key) doCnd_disp_key_NX(info);
		else if (nx == Cnd_cur_cd) doCnd_cur_cd_NX(info);
		else if (nx == Cnd_amt_dec_place) doCnd_amt_dec_place_NX(info);
		else if (nx == columnDispRslt_wg_cd) doDispRslt_wg_cd_NX(info);
		else if (nx == columnDispRslt_wg_nm) doDispRslt_wg_nm_NX(info);
		else if (nx == columnDispRslt_alc_rec_typ) doDispRslt_alc_rec_typ_NX(info);
		else if (nx == columnDispRslt_alc_rec_typ_nm) doDispRslt_alc_rec_typ_nm_NX(info);
		else if (nx == columnDispRslt_alc_ac_cd) doDispRslt_alc_ac_cd_NX(info);
		else if (nx == columnDispRslt_alc_ac_nm) doDispRslt_alc_ac_nm_NX(info);
		else if (nx == columnDispRslt_alc_ac_grp_cd1) doDispRslt_alc_ac_grp_cd1_NX(info);
		else if (nx == columnDispRslt_alc_ac_grp_nm1) doDispRslt_alc_ac_grp_nm1_NX(info);
		else if (nx == columnDispRslt_alc_ac_grp_cd2) doDispRslt_alc_ac_grp_cd2_NX(info);
		else if (nx == columnDispRslt_alc_ac_grp_nm2) doDispRslt_alc_ac_grp_nm2_NX(info);
		else if (nx == columnDispRslt_alc_ac_grp_cd3) doDispRslt_alc_ac_grp_cd3_NX(info);
		else if (nx == columnDispRslt_alc_ac_grp_nm3) doDispRslt_alc_ac_grp_nm3_NX(info);
		else if (nx == columnDispRslt_dpt_cd) doDispRslt_dpt_cd_NX(info);
		else if (nx == columnDispRslt_dpt_nm) doDispRslt_dpt_nm_NX(info);
		else if (nx == columnDispRslt_loc_cd) doDispRslt_loc_cd_NX(info);
		else if (nx == columnDispRslt_loc_nm) doDispRslt_loc_nm_NX(info);
		else if (nx == columnDispRslt_oper_cd) doDispRslt_oper_cd_NX(info);
		else if (nx == columnDispRslt_oper_nm) doDispRslt_oper_nm_NX(info);
		else if (nx == columnDispRslt_bp_cd) doDispRslt_bp_cd_NX(info);
		else if (nx == columnDispRslt_bp_nm) doDispRslt_bp_nm_NX(info);
		else if (nx == columnDispRslt_ctg_cd) doDispRslt_ctg_cd_NX(info);
		else if (nx == columnDispRslt_ctg_nm) doDispRslt_ctg_nm_NX(info);
		else if (nx == columnDispRslt_itm_typ) doDispRslt_itm_typ_NX(info);
		else if (nx == columnDispRslt_itm_typ_nm) doDispRslt_itm_typ_nm_NX(info);
		else if (nx == columnDispRslt_itm_typ_d_cd) doDispRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnDispRslt_itm_typ_d_nm) doDispRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnDispRslt_itm_grp_cd1) doDispRslt_itm_grp_cd1_NX(info);
		else if (nx == columnDispRslt_itm_grp_nm1) doDispRslt_itm_grp_nm1_NX(info);
		else if (nx == columnDispRslt_itm_grp_cd2) doDispRslt_itm_grp_cd2_NX(info);
		else if (nx == columnDispRslt_itm_grp_nm2) doDispRslt_itm_grp_nm2_NX(info);
		else if (nx == columnDispRslt_itm_grp_cd3) doDispRslt_itm_grp_cd3_NX(info);
		else if (nx == columnDispRslt_itm_grp_nm3) doDispRslt_itm_grp_nm3_NX(info);
		else if (nx == columnDispRslt_itm_grp_cd4) doDispRslt_itm_grp_cd4_NX(info);
		else if (nx == columnDispRslt_itm_grp_nm4) doDispRslt_itm_grp_nm4_NX(info);
		else if (nx == columnDispRslt_itm_grp_cd5) doDispRslt_itm_grp_cd5_NX(info);
		else if (nx == columnDispRslt_itm_grp_nm5) doDispRslt_itm_grp_nm5_NX(info);
		else if (nx == columnDispRslt_itm_grp_cd6) doDispRslt_itm_grp_cd6_NX(info);
		else if (nx == columnDispRslt_itm_grp_nm6) doDispRslt_itm_grp_nm6_NX(info);
		else if (nx == columnDispRslt_itm_grp_cd7) doDispRslt_itm_grp_cd7_NX(info);
		else if (nx == columnDispRslt_itm_grp_nm7) doDispRslt_itm_grp_nm7_NX(info);
		else if (nx == columnDispRslt_itm_grp_cd8) doDispRslt_itm_grp_cd8_NX(info);
		else if (nx == columnDispRslt_itm_grp_nm8) doDispRslt_itm_grp_nm8_NX(info);
		else if (nx == columnDispRslt_itm_grp_cd9) doDispRslt_itm_grp_cd9_NX(info);
		else if (nx == columnDispRslt_itm_grp_nm9) doDispRslt_itm_grp_nm9_NX(info);
		else if (nx == columnDispRslt_itm_grp_cd10) doDispRslt_itm_grp_cd10_NX(info);
		else if (nx == columnDispRslt_itm_grp_nm10) doDispRslt_itm_grp_nm10_NX(info);
		else if (nx == columnDispRslt_lot_no) doDispRslt_lot_no_NX(info);
		else if (nx == columnDispRslt_sublot_no) doDispRslt_sublot_no_NX(info);
		else if (nx == columnDispRslt_sno1) doDispRslt_sno1_NX(info);
		else if (nx == columnDispRslt_sno2) doDispRslt_sno2_NX(info);
		else if (nx == columnDispRslt_sno3) doDispRslt_sno3_NX(info);
		else if (nx == columnDispRslt_sno4) doDispRslt_sno4_NX(info);
		else if (nx == columnDispRslt_bp_grp_cd1) doDispRslt_bp_grp_cd1_NX(info);
		else if (nx == columnDispRslt_bp_grp_nm1) doDispRslt_bp_grp_nm1_NX(info);
		else if (nx == columnDispRslt_bp_grp_cd2) doDispRslt_bp_grp_cd2_NX(info);
		else if (nx == columnDispRslt_bp_grp_nm2) doDispRslt_bp_grp_nm2_NX(info);
		else if (nx == columnDispRslt_bp_grp_cd3) doDispRslt_bp_grp_cd3_NX(info);
		else if (nx == columnDispRslt_bp_grp_nm3) doDispRslt_bp_grp_nm3_NX(info);
		else if (nx == columnDispRslt_bp_grp_cd4) doDispRslt_bp_grp_cd4_NX(info);
		else if (nx == columnDispRslt_bp_grp_nm4) doDispRslt_bp_grp_nm4_NX(info);
		else if (nx == columnDispRslt_bp_grp_cd5) doDispRslt_bp_grp_cd5_NX(info);
		else if (nx == columnDispRslt_bp_grp_nm5) doDispRslt_bp_grp_nm5_NX(info);
		else if (nx == columnDispRslt_bp_grp_cd6) doDispRslt_bp_grp_cd6_NX(info);
		else if (nx == columnDispRslt_bp_grp_nm6) doDispRslt_bp_grp_nm6_NX(info);
		else if (nx == columnDispRslt_bp_grp_cd7) doDispRslt_bp_grp_cd7_NX(info);
		else if (nx == columnDispRslt_bp_grp_nm7) doDispRslt_bp_grp_nm7_NX(info);
		else if (nx == columnDispRslt_bp_grp_cd8) doDispRslt_bp_grp_cd8_NX(info);
		else if (nx == columnDispRslt_bp_grp_nm8) doDispRslt_bp_grp_nm8_NX(info);
		else if (nx == columnDispRslt_bp_grp_cd9) doDispRslt_bp_grp_cd9_NX(info);
		else if (nx == columnDispRslt_bp_grp_nm9) doDispRslt_bp_grp_nm9_NX(info);
		else if (nx == columnDispRslt_bp_grp_cd10) doDispRslt_bp_grp_cd10_NX(info);
		else if (nx == columnDispRslt_bp_grp_nm10) doDispRslt_bp_grp_nm10_NX(info);
		else if (nx == columnDispRslt_elm_no) doDispRslt_elm_no_NX(info);
		else if (nx == columnDispRslt_elm) doDispRslt_elm_NX(info);
		else if (nx == columnDispRslt_elm_nm) doDispRslt_elm_nm_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[alc_rec_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rec_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_rec_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rec_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm3_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_rec_typ_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rec_typ_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_typ_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_typ_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_typ_d_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_typ_d_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_flg10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_flg10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_flg10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_flg10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_rec_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_rec_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_rec_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_rec_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno4_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_no_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_LC(info);
		else if (lc == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_LC(info);
		else if (lc == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_LC(info);
		else if (lc == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_alc_rec_typ) doCnd_alc_rec_typ_LC(info);
		else if (lc == Cnd_alc_rec_typ_nm) doCnd_alc_rec_typ_nm_LC(info);
		else if (lc == Cnd_alc_ac_cd) doCnd_alc_ac_cd_LC(info);
		else if (lc == Cnd_alc_ac_nm) doCnd_alc_ac_nm_LC(info);
		else if (lc == Cnd_alc_ac_grp_cd1) doCnd_alc_ac_grp_cd1_LC(info);
		else if (lc == Cnd_alc_ac_grp_nm1) doCnd_alc_ac_grp_nm1_LC(info);
		else if (lc == Cnd_alc_ac_grp_cd2) doCnd_alc_ac_grp_cd2_LC(info);
		else if (lc == Cnd_alc_ac_grp_nm2) doCnd_alc_ac_grp_nm2_LC(info);
		else if (lc == Cnd_alc_ac_grp_cd3) doCnd_alc_ac_grp_cd3_LC(info);
		else if (lc == Cnd_alc_ac_grp_nm3) doCnd_alc_ac_grp_nm3_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_oper_cd) doCnd_oper_cd_LC(info);
		else if (lc == Cnd_oper_nm) doCnd_oper_nm_LC(info);
		else if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_ctg_cd) doCnd_ctg_cd_LC(info);
		else if (lc == Cnd_ctg_nm) doCnd_ctg_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_sno1) doCnd_sno1_LC(info);
		else if (lc == Cnd_sno2) doCnd_sno2_LC(info);
		else if (lc == Cnd_sno3) doCnd_sno3_LC(info);
		else if (lc == Cnd_sno4) doCnd_sno4_LC(info);
		else if (lc == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_LC(info);
		else if (lc == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_LC(info);
		else if (lc == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_LC(info);
		else if (lc == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_LC(info);
		else if (lc == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_LC(info);
		else if (lc == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_LC(info);
		else if (lc == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_LC(info);
		else if (lc == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_LC(info);
		else if (lc == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_LC(info);
		else if (lc == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_LC(info);
		else if (lc == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_LC(info);
		else if (lc == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_LC(info);
		else if (lc == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_LC(info);
		else if (lc == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_LC(info);
		else if (lc == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_LC(info);
		else if (lc == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_LC(info);
		else if (lc == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_LC(info);
		else if (lc == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_LC(info);
		else if (lc == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_LC(info);
		else if (lc == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_LC(info);
		else if (lc == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_LC(info);
		else if (lc == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_LC(info);
		else if (lc == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_LC(info);
		else if (lc == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_LC(info);
		else if (lc == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_LC(info);
		else if (lc == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_LC(info);
		else if (lc == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_LC(info);
		else if (lc == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_LC(info);
		else if (lc == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_LC(info);
		else if (lc == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_LC(info);
		else if (lc == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_LC(info);
		else if (lc == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_LC(info);
		else if (lc == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_LC(info);
		else if (lc == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_LC(info);
		else if (lc == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_LC(info);
		else if (lc == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_LC(info);
		else if (lc == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_LC(info);
		else if (lc == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_LC(info);
		else if (lc == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_LC(info);
		else if (lc == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_LC(info);
		else if (lc == Cnd_cur_cd) doCnd_cur_cd_LC(info);
		else if (lc == Cnd_amt_dec_place) doCnd_amt_dec_place_LC(info);
		else if (lc == columnDispRslt_wg_cd) doDispRslt_wg_cd_LC(info);
		else if (lc == columnDispRslt_wg_nm) doDispRslt_wg_nm_LC(info);
		else if (lc == columnDispRslt_alc_rec_typ) doDispRslt_alc_rec_typ_LC(info);
		else if (lc == columnDispRslt_alc_rec_typ_nm) doDispRslt_alc_rec_typ_nm_LC(info);
		else if (lc == columnDispRslt_alc_ac_cd) doDispRslt_alc_ac_cd_LC(info);
		else if (lc == columnDispRslt_alc_ac_nm) doDispRslt_alc_ac_nm_LC(info);
		else if (lc == columnDispRslt_alc_ac_grp_cd1) doDispRslt_alc_ac_grp_cd1_LC(info);
		else if (lc == columnDispRslt_alc_ac_grp_nm1) doDispRslt_alc_ac_grp_nm1_LC(info);
		else if (lc == columnDispRslt_alc_ac_grp_cd2) doDispRslt_alc_ac_grp_cd2_LC(info);
		else if (lc == columnDispRslt_alc_ac_grp_nm2) doDispRslt_alc_ac_grp_nm2_LC(info);
		else if (lc == columnDispRslt_alc_ac_grp_cd3) doDispRslt_alc_ac_grp_cd3_LC(info);
		else if (lc == columnDispRslt_alc_ac_grp_nm3) doDispRslt_alc_ac_grp_nm3_LC(info);
		else if (lc == columnDispRslt_dpt_cd) doDispRslt_dpt_cd_LC(info);
		else if (lc == columnDispRslt_dpt_nm) doDispRslt_dpt_nm_LC(info);
		else if (lc == columnDispRslt_loc_cd) doDispRslt_loc_cd_LC(info);
		else if (lc == columnDispRslt_loc_nm) doDispRslt_loc_nm_LC(info);
		else if (lc == columnDispRslt_oper_cd) doDispRslt_oper_cd_LC(info);
		else if (lc == columnDispRslt_oper_nm) doDispRslt_oper_nm_LC(info);
		else if (lc == columnDispRslt_bp_cd) doDispRslt_bp_cd_LC(info);
		else if (lc == columnDispRslt_bp_nm) doDispRslt_bp_nm_LC(info);
		else if (lc == columnDispRslt_ctg_cd) doDispRslt_ctg_cd_LC(info);
		else if (lc == columnDispRslt_ctg_nm) doDispRslt_ctg_nm_LC(info);
		else if (lc == columnDispRslt_itm_typ) doDispRslt_itm_typ_LC(info);
		else if (lc == columnDispRslt_itm_typ_nm) doDispRslt_itm_typ_nm_LC(info);
		else if (lc == columnDispRslt_itm_typ_d_cd) doDispRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnDispRslt_itm_typ_d_nm) doDispRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnDispRslt_itm_grp_cd1) doDispRslt_itm_grp_cd1_LC(info);
		else if (lc == columnDispRslt_itm_grp_nm1) doDispRslt_itm_grp_nm1_LC(info);
		else if (lc == columnDispRslt_itm_grp_cd2) doDispRslt_itm_grp_cd2_LC(info);
		else if (lc == columnDispRslt_itm_grp_nm2) doDispRslt_itm_grp_nm2_LC(info);
		else if (lc == columnDispRslt_itm_grp_cd3) doDispRslt_itm_grp_cd3_LC(info);
		else if (lc == columnDispRslt_itm_grp_nm3) doDispRslt_itm_grp_nm3_LC(info);
		else if (lc == columnDispRslt_itm_grp_cd4) doDispRslt_itm_grp_cd4_LC(info);
		else if (lc == columnDispRslt_itm_grp_nm4) doDispRslt_itm_grp_nm4_LC(info);
		else if (lc == columnDispRslt_itm_grp_cd5) doDispRslt_itm_grp_cd5_LC(info);
		else if (lc == columnDispRslt_itm_grp_nm5) doDispRslt_itm_grp_nm5_LC(info);
		else if (lc == columnDispRslt_itm_grp_cd6) doDispRslt_itm_grp_cd6_LC(info);
		else if (lc == columnDispRslt_itm_grp_nm6) doDispRslt_itm_grp_nm6_LC(info);
		else if (lc == columnDispRslt_itm_grp_cd7) doDispRslt_itm_grp_cd7_LC(info);
		else if (lc == columnDispRslt_itm_grp_nm7) doDispRslt_itm_grp_nm7_LC(info);
		else if (lc == columnDispRslt_itm_grp_cd8) doDispRslt_itm_grp_cd8_LC(info);
		else if (lc == columnDispRslt_itm_grp_nm8) doDispRslt_itm_grp_nm8_LC(info);
		else if (lc == columnDispRslt_itm_grp_cd9) doDispRslt_itm_grp_cd9_LC(info);
		else if (lc == columnDispRslt_itm_grp_nm9) doDispRslt_itm_grp_nm9_LC(info);
		else if (lc == columnDispRslt_itm_grp_cd10) doDispRslt_itm_grp_cd10_LC(info);
		else if (lc == columnDispRslt_itm_grp_nm10) doDispRslt_itm_grp_nm10_LC(info);
		else if (lc == columnDispRslt_lot_no) doDispRslt_lot_no_LC(info);
		else if (lc == columnDispRslt_sublot_no) doDispRslt_sublot_no_LC(info);
		else if (lc == columnDispRslt_sno1) doDispRslt_sno1_LC(info);
		else if (lc == columnDispRslt_sno2) doDispRslt_sno2_LC(info);
		else if (lc == columnDispRslt_sno3) doDispRslt_sno3_LC(info);
		else if (lc == columnDispRslt_sno4) doDispRslt_sno4_LC(info);
		else if (lc == columnDispRslt_bp_grp_cd1) doDispRslt_bp_grp_cd1_LC(info);
		else if (lc == columnDispRslt_bp_grp_nm1) doDispRslt_bp_grp_nm1_LC(info);
		else if (lc == columnDispRslt_bp_grp_cd2) doDispRslt_bp_grp_cd2_LC(info);
		else if (lc == columnDispRslt_bp_grp_nm2) doDispRslt_bp_grp_nm2_LC(info);
		else if (lc == columnDispRslt_bp_grp_cd3) doDispRslt_bp_grp_cd3_LC(info);
		else if (lc == columnDispRslt_bp_grp_nm3) doDispRslt_bp_grp_nm3_LC(info);
		else if (lc == columnDispRslt_bp_grp_cd4) doDispRslt_bp_grp_cd4_LC(info);
		else if (lc == columnDispRslt_bp_grp_nm4) doDispRslt_bp_grp_nm4_LC(info);
		else if (lc == columnDispRslt_bp_grp_cd5) doDispRslt_bp_grp_cd5_LC(info);
		else if (lc == columnDispRslt_bp_grp_nm5) doDispRslt_bp_grp_nm5_LC(info);
		else if (lc == columnDispRslt_bp_grp_cd6) doDispRslt_bp_grp_cd6_LC(info);
		else if (lc == columnDispRslt_bp_grp_nm6) doDispRslt_bp_grp_nm6_LC(info);
		else if (lc == columnDispRslt_bp_grp_cd7) doDispRslt_bp_grp_cd7_LC(info);
		else if (lc == columnDispRslt_bp_grp_nm7) doDispRslt_bp_grp_nm7_LC(info);
		else if (lc == columnDispRslt_bp_grp_cd8) doDispRslt_bp_grp_cd8_LC(info);
		else if (lc == columnDispRslt_bp_grp_nm8) doDispRslt_bp_grp_nm8_LC(info);
		else if (lc == columnDispRslt_bp_grp_cd9) doDispRslt_bp_grp_cd9_LC(info);
		else if (lc == columnDispRslt_bp_grp_nm9) doDispRslt_bp_grp_nm9_LC(info);
		else if (lc == columnDispRslt_bp_grp_cd10) doDispRslt_bp_grp_cd10_LC(info);
		else if (lc == columnDispRslt_bp_grp_nm10) doDispRslt_bp_grp_nm10_LC(info);
		else if (lc == columnDispRslt_elm_no) doDispRslt_elm_no_LC(info);
		else if (lc == columnDispRslt_elm) doDispRslt_elm_LC(info);
		else if (lc == columnDispRslt_elm_nm) doDispRslt_elm_nm_LC(info);
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[alc_rec_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rec_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_rec_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rec_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm3_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_rec_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_rec_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_rec_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_rec_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_ac_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_ac_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sno4_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[bp_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_bp_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_no_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[elm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_elm_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_pln_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_pln_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_act_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_act_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_rec_typ]の作成メソッド
	 */
	public MCList getCnd_alc_rec_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getAlcRecTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_ac_cd]の作成メソッド
	 */
	public MCList getCnd_alc_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_ac_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_alc_ac_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_ac_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_alc_ac_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_ac_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_alc_ac_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_oper_cd]の作成メソッド
	 */
	public MCList getCnd_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_cd]の作成メソッド
	 */
	public MCList getCnd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBGL0060.Srch01")) {
			return new MG_MGBGL0060_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBGL0060_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0060_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0060_Srch01;

		/** コンストラクタ */
		protected MG_MGBGL0060_Srch01Bridge() {
			p_MG_MGBGL0060_Srch01 = new MCParam(PDef.MG_MGBGL0060_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0060_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBG.MGBGP0060.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0060.RsltR.class));

			p_MG_MGBGL0060_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0060_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0060_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0060_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0060_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBG.MGBGP0060.CndR up0() {
			return (mcframe.clientMGBG.MGBGP0060.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBG.MGBGP0060.RsltR> down0() {
			return (MCList<mcframe.clientMGBG.MGBGP0060.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBGL0060_Srch01.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0060.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBGL0060_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBG.MGBGP0060.RsltR>)p_MG_MGBGL0060_Srch01.getContainerParam().getDownBlock(0));
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