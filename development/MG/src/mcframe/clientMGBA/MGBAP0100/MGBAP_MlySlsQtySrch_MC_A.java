package mcframe.clientMGBA.MGBAP0100;

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
import mcframe.clientMGBA.MGBAP0100.MGBAP_MlySlsQtySrch_MC.MG_MGBAL0100_Srch01Caller;

/**
 * 画面"MGBAP_MlySlsQtySrch"パネルクラスです。<p>
 *
 * 売上数に関して月別に計画値と実績値を参照する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBAP_MlySlsQtySrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBA";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBAP0100";

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
	// [Tab5]ブロック関連のField定義
	public MCPanel Tab5Panel = null;
	// [Tab5]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
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
	public MCLabel Cnd_mng_dpt_cd_Label = null;
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mng_dpt_cd = null;
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public MCTextField Cnd_mng_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public MCLabel Cnd_itm_jnl_cd_Label = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCTextField Cnd_itm_jnl_nm = null;
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
	public MCLabel Cnd_asst_typ_Label = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCTextField Cnd_asst_typ_nm = null;
	public MCLabel Cnd_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Cnd_cst_nm = null;
	public MCLabel Cnd_cst_cntry_cd_Label = null;
	/**
	 * Country cd. (Customer) 国ＣＤ（得意先）.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_cntry_cd = null;
	/**
	 * Country name (Customer) 国名（得意先）.<p>
	 *
	 */
	public MCTextField Cnd_cst_cntry_nm = null;
	public MCLabel Cnd_cst_area_cd_Label = null;
	/**
	 * Region cd. (Customer) 地域ＣＤ（得意先）.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_area_cd = null;
	/**
	 * Region name (Customer) 地域名（得意先）.<p>
	 *
	 */
	public MCTextField Cnd_cst_area_nm = null;
	public MCLabel Cnd_dlv_cd_Label = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_nm = null;
	public MCLabel Cnd_dlv_cntry_cd_Label = null;
	/**
	 * Country cd. (Delivery) 国ＣＤ（納品先）.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_cntry_cd = null;
	/**
	 * Country name (Delivery) 国名（納品先）.<p>
	 *
	 */
	public MCTextField Cnd_dlv_cntry_nm = null;
	public MCLabel Cnd_dlv_area_cd_Label = null;
	/**
	 * Region cd. (Delivery) 地域ＣＤ（納品先）.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_area_cd = null;
	/**
	 * Region name (Delivery) 地域名（納品先）.<p>
	 *
	 */
	public MCTextField Cnd_dlv_area_nm = null;
	public MCLabel Cnd_sls_dpt_cd_Label = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCTextField Cnd_sls_dpt_nm = null;
	public MCLabel Cnd_sls_usr_cd_Label = null;
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sls_usr_cd = null;
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public MCTextField Cnd_sls_usr_nm = null;
	public MCLabel Cnd_alc_dpt_cd_Label = null;
	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_dpt_cd = null;
	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public MCTextField Cnd_alc_dpt_nm = null;
	public MCLabel Cnd_dest_cd1_Label = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCTextField Cnd_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm1 = null;
	public MCLabel Cnd_dest_cd2_Label = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCTextField Cnd_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm2 = null;
	public MCLabel Cnd_dest_cd3_Label = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCTextField Cnd_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm3 = null;
	public MCLabel Cnd_cost_sls_cd1_Label = null;
	/**
	 * Sales classification cd. 1 売上分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_cost_sls_cd1 = null;
	/**
	 * Sales classification name 1 売上分類名１.<p>
	 *
	 */
	public MCTextField Cnd_cost_sls_nm1 = null;
	public MCLabel Cnd_cost_sls_cd2_Label = null;
	/**
	 * Sales classification cd. 2 売上分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_cost_sls_cd2 = null;
	/**
	 * Sales classification name 2 売上分類名２.<p>
	 *
	 */
	public MCTextField Cnd_cost_sls_nm2 = null;
	public MCLabel Cnd_cost_sls_cd3_Label = null;
	/**
	 * Sales classification cd. 3 売上分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_cost_sls_cd3 = null;
	/**
	 * Sales classification name 3 売上分類名３.<p>
	 *
	 */
	public MCTextField Cnd_cost_sls_nm3 = null;
	public MCLabel Cnd_cost_sls_cd4_Label = null;
	/**
	 * Sales classification cd. 4 売上分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_cost_sls_cd4 = null;
	/**
	 * Sales classification name 4 売上分類名４.<p>
	 *
	 */
	public MCTextField Cnd_cost_sls_nm4 = null;
	public MCLabel Cnd_cost_sls_cd5_Label = null;
	/**
	 * Sales classification cd. 5 売上分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_cost_sls_cd5 = null;
	/**
	 * Sales classification name 5 売上分類名５.<p>
	 *
	 */
	public MCTextField Cnd_cost_sls_nm5 = null;
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
	public MCLabel Cnd_cst_grp_cd1_Label = null;
	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd1 = null;
	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm1 = null;
	public MCLabel Cnd_cst_grp_cd2_Label = null;
	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd2 = null;
	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm2 = null;
	public MCLabel Cnd_cst_grp_cd3_Label = null;
	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd3 = null;
	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm3 = null;
	public MCLabel Cnd_cst_grp_cd4_Label = null;
	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd4 = null;
	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm4 = null;
	public MCLabel Cnd_cst_grp_cd5_Label = null;
	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd5 = null;
	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm5 = null;
	public MCLabel Cnd_cst_grp_cd6_Label = null;
	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd6 = null;
	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm6 = null;
	public MCLabel Cnd_cst_grp_cd7_Label = null;
	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd7 = null;
	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm7 = null;
	public MCLabel Cnd_cst_grp_cd8_Label = null;
	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd8 = null;
	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm8 = null;
	public MCLabel Cnd_cst_grp_cd9_Label = null;
	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd9 = null;
	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm9 = null;
	public MCLabel Cnd_cst_grp_cd10_Label = null;
	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd10 = null;
	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm10 = null;
	public MCLabel Cnd_dlv_grp_cd1_Label = null;
	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd1 = null;
	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm1 = null;
	public MCLabel Cnd_dlv_grp_cd2_Label = null;
	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd2 = null;
	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm2 = null;
	public MCLabel Cnd_dlv_grp_cd3_Label = null;
	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd3 = null;
	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm3 = null;
	public MCLabel Cnd_dlv_grp_cd4_Label = null;
	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd4 = null;
	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm4 = null;
	public MCLabel Cnd_dlv_grp_cd5_Label = null;
	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd5 = null;
	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm5 = null;
	public MCLabel Cnd_dlv_grp_cd6_Label = null;
	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd6 = null;
	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm6 = null;
	public MCLabel Cnd_dlv_grp_cd7_Label = null;
	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd7 = null;
	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm7 = null;
	public MCLabel Cnd_dlv_grp_cd8_Label = null;
	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd8 = null;
	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm8 = null;
	public MCLabel Cnd_dlv_grp_cd9_Label = null;
	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd9 = null;
	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm9 = null;
	public MCLabel Cnd_dlv_grp_cd10_Label = null;
	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd10 = null;
	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm10 = null;
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
	/**
	 * Management dept. 管理部門.<p>
	 *
	 */
	public MCCheckBox Cnd_mng_dpt_flg = null;
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
	 * Item journal 品目仕訳.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_jnl_flg = null;
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
	 * Customer 得意先.<p>
	 *
	 */
	public MCCheckBox Cnd_cst_flg = null;
	/**
	 * Country (Customer) 国（得意先）.<p>
	 *
	 */
	public MCCheckBox Cnd_cst_cntry_flg = null;
	/**
	 * Region (Customer) 地域（得意先）.<p>
	 *
	 */
	public MCCheckBox Cnd_cst_area_flg = null;
	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_flg = null;
	/**
	 * Country (Delivery) 国（納品先）.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_cntry_flg = null;
	/**
	 * Region (Delivery) 地域（納品先）.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_area_flg = null;
	/**
	 * Sales dept. 売上部門.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_dpt_flg = null;
	/**
	 * PIC 担当者.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_usr_flg = null;
	/**
	 * Allocation dept. 配賦部門.<p>
	 *
	 */
	public MCCheckBox Cnd_alc_dpt_flg = null;
	/**
	 * Distribution channel 1 仕向先１.<p>
	 *
	 */
	public MCCheckBox Cnd_dest1_flg = null;
	/**
	 * Distribution channel 2 仕向先２.<p>
	 *
	 */
	public MCCheckBox Cnd_dest2_flg = null;
	/**
	 * Distribution channel 3 仕向先３.<p>
	 *
	 */
	public MCCheckBox Cnd_dest3_flg = null;
	/**
	 * Sales classification 1 売上分類１.<p>
	 *
	 */
	public MCCheckBox Cnd_cost_sls1_flg = null;
	/**
	 * Sales classification 2 売上分類２.<p>
	 *
	 */
	public MCCheckBox Cnd_cost_sls2_flg = null;
	/**
	 * Sales classification 3 売上分類３.<p>
	 *
	 */
	public MCCheckBox Cnd_cost_sls3_flg = null;
	/**
	 * Sales classification 4 売上分類４.<p>
	 *
	 */
	public MCCheckBox Cnd_cost_sls4_flg = null;
	/**
	 * Sales classification 5 売上分類５.<p>
	 *
	 */
	public MCCheckBox Cnd_cost_sls5_flg = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCCheckBox Cnd_asst_flg = null;
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
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public MCCheckBox Cnd_cst_grp_flg1 = null;
	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public MCCheckBox Cnd_cst_grp_flg2 = null;
	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public MCCheckBox Cnd_cst_grp_flg3 = null;
	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public MCCheckBox Cnd_cst_grp_flg4 = null;
	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public MCCheckBox Cnd_cst_grp_flg5 = null;
	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public MCCheckBox Cnd_cst_grp_flg6 = null;
	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public MCCheckBox Cnd_cst_grp_flg7 = null;
	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public MCCheckBox Cnd_cst_grp_flg8 = null;
	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public MCCheckBox Cnd_cst_grp_flg9 = null;
	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public MCCheckBox Cnd_cst_grp_flg10 = null;
	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_grp_flg1 = null;
	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_grp_flg2 = null;
	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_grp_flg3 = null;
	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_grp_flg4 = null;
	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_grp_flg5 = null;
	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_grp_flg6 = null;
	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_grp_flg7 = null;
	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_grp_flg8 = null;
	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_grp_flg9 = null;
	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_grp_flg10 = null;
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
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Cnd3]ブロック関連のField定義
	public MCPanel Cnd3Panel = null;
	// [Cnd3]ブロックの項目のField定義
	// [Cnd4]ブロック関連のField定義
	public MCPanel Cnd4Panel = null;
	// [Cnd4]ブロックの項目のField定義
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
	public MCTable2<mcframe.clientMGBA.MGBAP0100.DispRsltR> DispRsltTable = null;
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
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_mng_dpt_cd = null;
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_mng_dpt_nm = null;
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
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_jnl_nm = null;
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
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_nm = null;
	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_cd1 = null;
	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_nm1 = null;
	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_cd2 = null;
	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_nm2 = null;
	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_cd3 = null;
	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_nm3 = null;
	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_cd4 = null;
	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_nm4 = null;
	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_cd5 = null;
	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_nm5 = null;
	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_cd6 = null;
	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_nm6 = null;
	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_cd7 = null;
	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_nm7 = null;
	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_cd8 = null;
	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_nm8 = null;
	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_cd9 = null;
	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_nm9 = null;
	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_cd10 = null;
	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_grp_nm10 = null;
	/**
	 * Country cd. (Customer) 国ＣＤ（得意先）.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_cntry_cd = null;
	/**
	 * Country name (Customer) 国名（得意先）.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_cntry_nm = null;
	/**
	 * Region cd. (Customer) 地域ＣＤ（得意先）.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_area_cd = null;
	/**
	 * Region name (Customer) 地域名（得意先）.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cst_area_nm = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_nm = null;
	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_cd1 = null;
	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_nm1 = null;
	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_cd2 = null;
	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_nm2 = null;
	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_cd3 = null;
	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_nm3 = null;
	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_cd4 = null;
	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_nm4 = null;
	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_cd5 = null;
	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_nm5 = null;
	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_cd6 = null;
	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_nm6 = null;
	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_cd7 = null;
	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_nm7 = null;
	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_cd8 = null;
	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_nm8 = null;
	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_cd9 = null;
	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_nm9 = null;
	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_cd10 = null;
	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_grp_nm10 = null;
	/**
	 * Country cd. (Delivery) 国ＣＤ（納品先）.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_cntry_cd = null;
	/**
	 * Country name (Delivery) 国名（納品先）.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_cntry_nm = null;
	/**
	 * Region cd. (Delivery) 地域ＣＤ（納品先）.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_area_cd = null;
	/**
	 * Region name (Delivery) 地域名（納品先）.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dlv_area_nm = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sls_dpt_nm = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sls_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sls_usr_nm = null;
	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_alc_dpt_cd = null;
	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_alc_dpt_nm = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先１名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dest_nm1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先２名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dest_nm2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先３名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dest_nm3 = null;
	/**
	 * Sales classification cd. 1 売上分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cost_sls_cd1 = null;
	/**
	 * Sales classification name 1 売上分類名１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cost_sls_nm1 = null;
	/**
	 * Sales classification cd. 2 売上分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cost_sls_cd2 = null;
	/**
	 * Sales classification name 2 売上分類名２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cost_sls_nm2 = null;
	/**
	 * Sales classification cd. 3 売上分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cost_sls_cd3 = null;
	/**
	 * Sales classification name 3 売上分類名３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cost_sls_nm3 = null;
	/**
	 * Sales classification cd. 4 売上分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cost_sls_cd4 = null;
	/**
	 * Sales classification name 4 売上分類名４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cost_sls_nm4 = null;
	/**
	 * Sales classification cd. 5 売上分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cost_sls_cd5 = null;
	/**
	 * Sales classification name 5 売上分類名５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cost_sls_nm5 = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_asst_typ_nm = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_dec_place = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_00_p_PPanel;
	public MCColumnConfig columnDispRslt_col_00;// [DispRslt]の[qty_00_p.qty]を[columnDispRslt_col_00]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_01_p_PPanel;
	public MCColumnConfig columnDispRslt_col_01;// [DispRslt]の[qty_01_p.qty]を[columnDispRslt_col_01]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_02_p_PPanel;
	public MCColumnConfig columnDispRslt_col_02;// [DispRslt]の[qty_02_p.qty]を[columnDispRslt_col_02]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_03_p_PPanel;
	public MCColumnConfig columnDispRslt_col_03;// [DispRslt]の[qty_03_p.qty]を[columnDispRslt_col_03]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_04_p_PPanel;
	public MCColumnConfig columnDispRslt_col_04;// [DispRslt]の[qty_04_p.qty]を[columnDispRslt_col_04]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_05_p_PPanel;
	public MCColumnConfig columnDispRslt_col_05;// [DispRslt]の[qty_05_p.qty]を[columnDispRslt_col_05]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_06_p_PPanel;
	public MCColumnConfig columnDispRslt_col_06;// [DispRslt]の[qty_06_p.qty]を[columnDispRslt_col_06]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_07_p_PPanel;
	public MCColumnConfig columnDispRslt_col_07;// [DispRslt]の[qty_07_p.qty]を[columnDispRslt_col_07]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_08_p_PPanel;
	public MCColumnConfig columnDispRslt_col_08;// [DispRslt]の[qty_08_p.qty]を[columnDispRslt_col_08]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_09_p_PPanel;
	public MCColumnConfig columnDispRslt_col_09;// [DispRslt]の[qty_09_p.qty]を[columnDispRslt_col_09]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_10_p_PPanel;
	public MCColumnConfig columnDispRslt_col_10;// [DispRslt]の[qty_10_p.qty]を[columnDispRslt_col_10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_11_p_PPanel;
	public MCColumnConfig columnDispRslt_col_11;// [DispRslt]の[qty_11_p.qty]を[columnDispRslt_col_11]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_ttl_qty_p_PPanel;
	public MCColumnConfig columnDispRslt_ttl;// [DispRslt]の[ttl_qty_p.qty]を[columnDispRslt_ttl]としてエイリアス定義。
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
	
	/** [MG_MGBAL0100_Srch01]のCallerの作成 */
	protected MGBAP_MlySlsQtySrch_MC.MG_MGBAL0100_Srch01Caller createMG_MGBAL0100_Srch01() {
		MGBAP_MlySlsQtySrch_MC.MG_MGBAL0100_Srch01Caller<MGBAP_MlySlsQtySrch, MG_MGBAL0100_Srch01Bridge>
		caller = ((MGBAP_MlySlsQtySrch_MC)this).new MG_MGBAL0100_Srch01Caller<MGBAP_MlySlsQtySrch, MG_MGBAL0100_Srch01Bridge>(
					(MGBAP_MlySlsQtySrch)this, new MG_MGBAL0100_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBAL0100_Srch01]の呼び出し */
	protected void callMG_MGBAL0100_Srch01() {
		MCCaller caller = createMG_MGBAL0100_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBA.MGBAP0100.CndR aCndR;
	/** [DispRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBA.MGBAP0100.DispRsltR> aDispRsltL;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBA.MGBAP0100.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBA.MGBAP0100.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBA.MGBAP0100.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBA.MGBAP0100.CndR createCndR() {
		return mcframe.clientMGBA.MGBAP0100.CndR.create();
	}

	/**
	 * コピーによってaDispRsltLを設定します。
	 *
	 * aDispRsltLのインスタンスは変更されません。
	 *
	 * @param dataset DispRsltL
	 */
	public void setDispRsltL(MCList<mcframe.clientMGBA.MGBAP0100.DispRsltR> aList) {
		if (getDispRsltL() != aList) {
			getDispRsltL().setAll(aList);
		}
	}

	/**
	 * [DispRslt]ブロックのコンテナaDispRsltLを返します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBA.MGBAP0100.DispRsltR> getDispRsltL() {
		return aDispRsltL;
	}

	/**
	 * aDispRsltRを作成します。
	 *
	 * @return DispRsltR
	 */
	public mcframe.clientMGBA.MGBAP0100.DispRsltR createDispRsltR() {
		return mcframe.clientMGBA.MGBAP0100.DispRsltR.create();
	}

	/**
	 * aDispRsltLを作成します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBA.MGBAP0100.DispRsltR> createDispRsltL() {
		return MCList.create(mcframe.clientMGBA.MGBAP0100.DispRsltR.class);
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
	public void setRsltL(MCList<mcframe.clientMGBA.MGBAP0100.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBA.MGBAP0100.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBA.MGBAP0100.RsltR createRsltR() {
		return mcframe.clientMGBA.MGBAP0100.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBA.MGBAP0100.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBA.MGBAP0100.RsltR.class);
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(Tab4Panel);
		ret.add(Tab5Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(Cnd3Panel);
		ret.add(Cnd4Panel);
		ret.add(TtlPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(DispRsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBAP_MlySlsQtySrch_MC_A() {
		aCndR = createCndR();
		aDispRsltL = createDispRsltL();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBAP_MlySlsQtySrch_MC_A(String name) {
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
		MGBAP_MlySlsQtySrch_MC.jbCreateTop((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbCreateFold((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbCreateTab1((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbCreateTab2((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbCreateTab3((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbCreateTab4((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbCreateTab5((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbCreateCnd((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbCreateCnd2((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbCreateCnd3((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbCreateCnd4((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbCreateTtl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbCreateLPnl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbCreateCtrl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbCreateDispRslt((MGBAP_MlySlsQtySrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 * [Tab5]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab5(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBAP_MlySlsQtySrch p) {
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
	protected static void jbCreateCnd2(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 * [Cnd4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd4(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 * [Ttl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTtl(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBAP_MlySlsQtySrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispRslt(MGBAP_MlySlsQtySrch p) {
		p.DispRslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBA.MGBAP0100.DispRsltR.$itm_p);
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
		p.DispRslt_qty_00_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0100.DispRsltR.$qty_00_p);
		p.DispRslt_qty_00_p_PPanel.setName("DispRslt.qty_00_p");
		p.columnDispRslt_col_00 = p.DispRslt_qty_00_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_00.addAliasName("DispRslt.col_00", p);
		p.DispRslt_qty_01_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0100.DispRsltR.$qty_01_p);
		p.DispRslt_qty_01_p_PPanel.setName("DispRslt.qty_01_p");
		p.columnDispRslt_col_01 = p.DispRslt_qty_01_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_01.addAliasName("DispRslt.col_01", p);
		p.DispRslt_qty_02_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0100.DispRsltR.$qty_02_p);
		p.DispRslt_qty_02_p_PPanel.setName("DispRslt.qty_02_p");
		p.columnDispRslt_col_02 = p.DispRslt_qty_02_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_02.addAliasName("DispRslt.col_02", p);
		p.DispRslt_qty_03_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0100.DispRsltR.$qty_03_p);
		p.DispRslt_qty_03_p_PPanel.setName("DispRslt.qty_03_p");
		p.columnDispRslt_col_03 = p.DispRslt_qty_03_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_03.addAliasName("DispRslt.col_03", p);
		p.DispRslt_qty_04_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0100.DispRsltR.$qty_04_p);
		p.DispRslt_qty_04_p_PPanel.setName("DispRslt.qty_04_p");
		p.columnDispRslt_col_04 = p.DispRslt_qty_04_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_04.addAliasName("DispRslt.col_04", p);
		p.DispRslt_qty_05_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0100.DispRsltR.$qty_05_p);
		p.DispRslt_qty_05_p_PPanel.setName("DispRslt.qty_05_p");
		p.columnDispRslt_col_05 = p.DispRslt_qty_05_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_05.addAliasName("DispRslt.col_05", p);
		p.DispRslt_qty_06_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0100.DispRsltR.$qty_06_p);
		p.DispRslt_qty_06_p_PPanel.setName("DispRslt.qty_06_p");
		p.columnDispRslt_col_06 = p.DispRslt_qty_06_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_06.addAliasName("DispRslt.col_06", p);
		p.DispRslt_qty_07_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0100.DispRsltR.$qty_07_p);
		p.DispRslt_qty_07_p_PPanel.setName("DispRslt.qty_07_p");
		p.columnDispRslt_col_07 = p.DispRslt_qty_07_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_07.addAliasName("DispRslt.col_07", p);
		p.DispRslt_qty_08_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0100.DispRsltR.$qty_08_p);
		p.DispRslt_qty_08_p_PPanel.setName("DispRslt.qty_08_p");
		p.columnDispRslt_col_08 = p.DispRslt_qty_08_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_08.addAliasName("DispRslt.col_08", p);
		p.DispRslt_qty_09_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0100.DispRsltR.$qty_09_p);
		p.DispRslt_qty_09_p_PPanel.setName("DispRslt.qty_09_p");
		p.columnDispRslt_col_09 = p.DispRslt_qty_09_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_09.addAliasName("DispRslt.col_09", p);
		p.DispRslt_qty_10_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0100.DispRsltR.$qty_10_p);
		p.DispRslt_qty_10_p_PPanel.setName("DispRslt.qty_10_p");
		p.columnDispRslt_col_10 = p.DispRslt_qty_10_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_10.addAliasName("DispRslt.col_10", p);
		p.DispRslt_qty_11_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0100.DispRsltR.$qty_11_p);
		p.DispRslt_qty_11_p_PPanel.setName("DispRslt.qty_11_p");
		p.columnDispRslt_col_11 = p.DispRslt_qty_11_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_11.addAliasName("DispRslt.col_11", p);
		p.DispRslt_ttl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0100.DispRsltR.$ttl_qty_p);
		p.DispRslt_ttl_qty_p_PPanel.setName("DispRslt.ttl_qty_p");
		p.columnDispRslt_ttl = p.DispRslt_ttl_qty_p_PPanel.columnQty_qty;
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
	
	
	/** [Cnd_mng_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mng_dpt_cd_p = null;

	/**
	 * [Cnd_mng_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mng_dpt_cd_ListPutter() {
		if (Cnd_mng_dpt_cd_p == null) {
			Cnd_mng_dpt_cd_p = createCnd_mng_dpt_cd_ListPutter(Cnd_mng_dpt_cd, "mng_dpt_cd", "mng_dpt_nm");

		}
		return Cnd_mng_dpt_cd_p;
	}
	
	
	/** [Cnd_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_jnl_cd_p = null;

	/**
	 * [Cnd_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_jnl_cd_ListPutter() {
		if (Cnd_itm_jnl_cd_p == null) {
			Cnd_itm_jnl_cd_p = createCnd_itm_jnl_cd_ListPutter(Cnd_itm_jnl_cd, "itm_jnl_cd", "itm_jnl_nm");

		}
		return Cnd_itm_jnl_cd_p;
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
	
	
	/** [Cnd_asst_typ_ListPutter]の定義 */
	private MCListPutter Cnd_asst_typ_p = null;

	/**
	 * [Cnd_asst_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_asst_typ_ListPutter() {
		if (Cnd_asst_typ_p == null) {
			Cnd_asst_typ_p = createCnd_asst_typ_ListPutter(Cnd_asst_typ, "asst_typ", "asst_typ_nm");

		}
		return Cnd_asst_typ_p;
	}
	
	
	/** [Cnd_cst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cst_cd_p = null;

	/**
	 * [Cnd_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_cd_ListPutter() {
		if (Cnd_cst_cd_p == null) {
			Cnd_cst_cd_p = createCnd_cst_cd_ListPutter(Cnd_cst_cd, "cst_cd", "cst_nm");

		}
		return Cnd_cst_cd_p;
	}
	
	
	/** [Cnd_cst_cntry_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cst_cntry_cd_p = null;

	/**
	 * [Cnd_cst_cntry_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_cntry_cd_ListPutter() {
		if (Cnd_cst_cntry_cd_p == null) {
			Cnd_cst_cntry_cd_p = createCnd_cst_cntry_cd_ListPutter(Cnd_cst_cntry_cd, "cst_cntry_cd", "cst_cntry_nm");

		}
		return Cnd_cst_cntry_cd_p;
	}
	
	
	/** [Cnd_cst_area_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cst_area_cd_p = null;

	/**
	 * [Cnd_cst_area_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_area_cd_ListPutter() {
		if (Cnd_cst_area_cd_p == null) {
			Cnd_cst_area_cd_p = createCnd_cst_area_cd_ListPutter(Cnd_cst_area_cd, "cst_area_cd", "cst_area_nm");

		}
		return Cnd_cst_area_cd_p;
	}
	
	
	/** [Cnd_dlv_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_cd_p = null;

	/**
	 * [Cnd_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_cd_ListPutter() {
		if (Cnd_dlv_cd_p == null) {
			Cnd_dlv_cd_p = createCnd_dlv_cd_ListPutter(Cnd_dlv_cd, "dlv_cd", "dlv_nm");

		}
		return Cnd_dlv_cd_p;
	}
	
	
	/** [Cnd_dlv_cntry_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_cntry_cd_p = null;

	/**
	 * [Cnd_dlv_cntry_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_cntry_cd_ListPutter() {
		if (Cnd_dlv_cntry_cd_p == null) {
			Cnd_dlv_cntry_cd_p = createCnd_dlv_cntry_cd_ListPutter(Cnd_dlv_cntry_cd, "dlv_cntry_cd", "dlv_cntry_nm");

		}
		return Cnd_dlv_cntry_cd_p;
	}
	
	
	/** [Cnd_dlv_area_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_area_cd_p = null;

	/**
	 * [Cnd_dlv_area_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_area_cd_ListPutter() {
		if (Cnd_dlv_area_cd_p == null) {
			Cnd_dlv_area_cd_p = createCnd_dlv_area_cd_ListPutter(Cnd_dlv_area_cd, "dlv_area_cd", "dlv_area_nm");

		}
		return Cnd_dlv_area_cd_p;
	}
	
	
	/** [Cnd_sls_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sls_dpt_cd_p = null;

	/**
	 * [Cnd_sls_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_dpt_cd_ListPutter() {
		if (Cnd_sls_dpt_cd_p == null) {
			Cnd_sls_dpt_cd_p = createCnd_sls_dpt_cd_ListPutter(Cnd_sls_dpt_cd, "sls_dpt_cd", "sls_dpt_nm");

		}
		return Cnd_sls_dpt_cd_p;
	}
	
	
	/** [Cnd_sls_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sls_usr_cd_p = null;

	/**
	 * [Cnd_sls_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_usr_cd_ListPutter() {
		if (Cnd_sls_usr_cd_p == null) {
			Cnd_sls_usr_cd_p = createCnd_sls_usr_cd_ListPutter(Cnd_sls_usr_cd, "sls_usr_cd", "sls_usr_nm");

		}
		return Cnd_sls_usr_cd_p;
	}
	
	
	/** [Cnd_alc_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_alc_dpt_cd_p = null;

	/**
	 * [Cnd_alc_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_dpt_cd_ListPutter() {
		if (Cnd_alc_dpt_cd_p == null) {
			Cnd_alc_dpt_cd_p = createCnd_alc_dpt_cd_ListPutter(Cnd_alc_dpt_cd, "alc_dpt_cd", "alc_dpt_nm");

		}
		return Cnd_alc_dpt_cd_p;
	}
	
	
	/** [Cnd_dest_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_dest_cd1_p = null;

	/**
	 * [Cnd_dest_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_cd1_ListPutter() {
		if (Cnd_dest_cd1_p == null) {
			Cnd_dest_cd1_p = createCnd_dest_cd1_ListPutter(Cnd_dest_cd1, "dest_cd1", "dest_nm1");

		}
		return Cnd_dest_cd1_p;
	}
	
	
	/** [Cnd_dest_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_dest_cd2_p = null;

	/**
	 * [Cnd_dest_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_cd2_ListPutter() {
		if (Cnd_dest_cd2_p == null) {
			Cnd_dest_cd2_p = createCnd_dest_cd2_ListPutter(Cnd_dest_cd2, "dest_cd2", "dest_nm2");

		}
		return Cnd_dest_cd2_p;
	}
	
	
	/** [Cnd_dest_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_dest_cd3_p = null;

	/**
	 * [Cnd_dest_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_cd3_ListPutter() {
		if (Cnd_dest_cd3_p == null) {
			Cnd_dest_cd3_p = createCnd_dest_cd3_ListPutter(Cnd_dest_cd3, "dest_cd3", "dest_nm3");

		}
		return Cnd_dest_cd3_p;
	}
	
	
	/** [Cnd_cost_sls_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_cost_sls_cd1_p = null;

	/**
	 * [Cnd_cost_sls_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cost_sls_cd1_ListPutter() {
		if (Cnd_cost_sls_cd1_p == null) {
			Cnd_cost_sls_cd1_p = createCnd_cost_sls_cd1_ListPutter(Cnd_cost_sls_cd1, "cost_sls_cd1", "cost_sls_nm1");

		}
		return Cnd_cost_sls_cd1_p;
	}
	
	
	/** [Cnd_cost_sls_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_cost_sls_cd2_p = null;

	/**
	 * [Cnd_cost_sls_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cost_sls_cd2_ListPutter() {
		if (Cnd_cost_sls_cd2_p == null) {
			Cnd_cost_sls_cd2_p = createCnd_cost_sls_cd2_ListPutter(Cnd_cost_sls_cd2, "cost_sls_cd2", "cost_sls_nm2");

		}
		return Cnd_cost_sls_cd2_p;
	}
	
	
	/** [Cnd_cost_sls_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_cost_sls_cd3_p = null;

	/**
	 * [Cnd_cost_sls_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cost_sls_cd3_ListPutter() {
		if (Cnd_cost_sls_cd3_p == null) {
			Cnd_cost_sls_cd3_p = createCnd_cost_sls_cd3_ListPutter(Cnd_cost_sls_cd3, "cost_sls_cd3", "cost_sls_nm3");

		}
		return Cnd_cost_sls_cd3_p;
	}
	
	
	/** [Cnd_cost_sls_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_cost_sls_cd4_p = null;

	/**
	 * [Cnd_cost_sls_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cost_sls_cd4_ListPutter() {
		if (Cnd_cost_sls_cd4_p == null) {
			Cnd_cost_sls_cd4_p = createCnd_cost_sls_cd4_ListPutter(Cnd_cost_sls_cd4, "cost_sls_cd4", "cost_sls_nm4");

		}
		return Cnd_cost_sls_cd4_p;
	}
	
	
	/** [Cnd_cost_sls_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_cost_sls_cd5_p = null;

	/**
	 * [Cnd_cost_sls_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cost_sls_cd5_ListPutter() {
		if (Cnd_cost_sls_cd5_p == null) {
			Cnd_cost_sls_cd5_p = createCnd_cost_sls_cd5_ListPutter(Cnd_cost_sls_cd5, "cost_sls_cd5", "cost_sls_nm5");

		}
		return Cnd_cost_sls_cd5_p;
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
	
	
	/** [Cnd_cst_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd1_p = null;

	/**
	 * [Cnd_cst_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd1_ListPutter() {
		if (Cnd_cst_grp_cd1_p == null) {
			Cnd_cst_grp_cd1_p = createCnd_cst_grp_cd1_ListPutter(Cnd_cst_grp_cd1, "cst_grp_cd1", "cst_grp_nm1");

		}
		return Cnd_cst_grp_cd1_p;
	}
	
	
	/** [Cnd_cst_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd2_p = null;

	/**
	 * [Cnd_cst_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd2_ListPutter() {
		if (Cnd_cst_grp_cd2_p == null) {
			Cnd_cst_grp_cd2_p = createCnd_cst_grp_cd2_ListPutter(Cnd_cst_grp_cd2, "cst_grp_cd2", "cst_grp_nm2");

		}
		return Cnd_cst_grp_cd2_p;
	}
	
	
	/** [Cnd_cst_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd3_p = null;

	/**
	 * [Cnd_cst_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd3_ListPutter() {
		if (Cnd_cst_grp_cd3_p == null) {
			Cnd_cst_grp_cd3_p = createCnd_cst_grp_cd3_ListPutter(Cnd_cst_grp_cd3, "cst_grp_cd3", "cst_grp_nm3");

		}
		return Cnd_cst_grp_cd3_p;
	}
	
	
	/** [Cnd_cst_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd4_p = null;

	/**
	 * [Cnd_cst_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd4_ListPutter() {
		if (Cnd_cst_grp_cd4_p == null) {
			Cnd_cst_grp_cd4_p = createCnd_cst_grp_cd4_ListPutter(Cnd_cst_grp_cd4, "cst_grp_cd4", "cst_grp_nm4");

		}
		return Cnd_cst_grp_cd4_p;
	}
	
	
	/** [Cnd_cst_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd5_p = null;

	/**
	 * [Cnd_cst_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd5_ListPutter() {
		if (Cnd_cst_grp_cd5_p == null) {
			Cnd_cst_grp_cd5_p = createCnd_cst_grp_cd5_ListPutter(Cnd_cst_grp_cd5, "cst_grp_cd5", "cst_grp_nm5");

		}
		return Cnd_cst_grp_cd5_p;
	}
	
	
	/** [Cnd_cst_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd6_p = null;

	/**
	 * [Cnd_cst_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd6_ListPutter() {
		if (Cnd_cst_grp_cd6_p == null) {
			Cnd_cst_grp_cd6_p = createCnd_cst_grp_cd6_ListPutter(Cnd_cst_grp_cd6, "cst_grp_cd6", "cst_grp_nm6");

		}
		return Cnd_cst_grp_cd6_p;
	}
	
	
	/** [Cnd_cst_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd7_p = null;

	/**
	 * [Cnd_cst_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd7_ListPutter() {
		if (Cnd_cst_grp_cd7_p == null) {
			Cnd_cst_grp_cd7_p = createCnd_cst_grp_cd7_ListPutter(Cnd_cst_grp_cd7, "cst_grp_cd7", "cst_grp_nm7");

		}
		return Cnd_cst_grp_cd7_p;
	}
	
	
	/** [Cnd_cst_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd8_p = null;

	/**
	 * [Cnd_cst_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd8_ListPutter() {
		if (Cnd_cst_grp_cd8_p == null) {
			Cnd_cst_grp_cd8_p = createCnd_cst_grp_cd8_ListPutter(Cnd_cst_grp_cd8, "cst_grp_cd8", "cst_grp_nm8");

		}
		return Cnd_cst_grp_cd8_p;
	}
	
	
	/** [Cnd_cst_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd9_p = null;

	/**
	 * [Cnd_cst_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd9_ListPutter() {
		if (Cnd_cst_grp_cd9_p == null) {
			Cnd_cst_grp_cd9_p = createCnd_cst_grp_cd9_ListPutter(Cnd_cst_grp_cd9, "cst_grp_cd9", "cst_grp_nm9");

		}
		return Cnd_cst_grp_cd9_p;
	}
	
	
	/** [Cnd_cst_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd10_p = null;

	/**
	 * [Cnd_cst_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd10_ListPutter() {
		if (Cnd_cst_grp_cd10_p == null) {
			Cnd_cst_grp_cd10_p = createCnd_cst_grp_cd10_ListPutter(Cnd_cst_grp_cd10, "cst_grp_cd10", "cst_grp_nm10");

		}
		return Cnd_cst_grp_cd10_p;
	}
	
	
	/** [Cnd_dlv_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd1_p = null;

	/**
	 * [Cnd_dlv_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd1_ListPutter() {
		if (Cnd_dlv_grp_cd1_p == null) {
			Cnd_dlv_grp_cd1_p = createCnd_dlv_grp_cd1_ListPutter(Cnd_dlv_grp_cd1, "dlv_grp_cd1", "dlv_grp_nm1");

		}
		return Cnd_dlv_grp_cd1_p;
	}
	
	
	/** [Cnd_dlv_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd2_p = null;

	/**
	 * [Cnd_dlv_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd2_ListPutter() {
		if (Cnd_dlv_grp_cd2_p == null) {
			Cnd_dlv_grp_cd2_p = createCnd_dlv_grp_cd2_ListPutter(Cnd_dlv_grp_cd2, "dlv_grp_cd2", "dlv_grp_nm2");

		}
		return Cnd_dlv_grp_cd2_p;
	}
	
	
	/** [Cnd_dlv_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd3_p = null;

	/**
	 * [Cnd_dlv_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd3_ListPutter() {
		if (Cnd_dlv_grp_cd3_p == null) {
			Cnd_dlv_grp_cd3_p = createCnd_dlv_grp_cd3_ListPutter(Cnd_dlv_grp_cd3, "dlv_grp_cd3", "dlv_grp_nm3");

		}
		return Cnd_dlv_grp_cd3_p;
	}
	
	
	/** [Cnd_dlv_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd4_p = null;

	/**
	 * [Cnd_dlv_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd4_ListPutter() {
		if (Cnd_dlv_grp_cd4_p == null) {
			Cnd_dlv_grp_cd4_p = createCnd_dlv_grp_cd4_ListPutter(Cnd_dlv_grp_cd4, "dlv_grp_cd4", "dlv_grp_nm4");

		}
		return Cnd_dlv_grp_cd4_p;
	}
	
	
	/** [Cnd_dlv_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd5_p = null;

	/**
	 * [Cnd_dlv_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd5_ListPutter() {
		if (Cnd_dlv_grp_cd5_p == null) {
			Cnd_dlv_grp_cd5_p = createCnd_dlv_grp_cd5_ListPutter(Cnd_dlv_grp_cd5, "dlv_grp_cd5", "dlv_grp_nm5");

		}
		return Cnd_dlv_grp_cd5_p;
	}
	
	
	/** [Cnd_dlv_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd6_p = null;

	/**
	 * [Cnd_dlv_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd6_ListPutter() {
		if (Cnd_dlv_grp_cd6_p == null) {
			Cnd_dlv_grp_cd6_p = createCnd_dlv_grp_cd6_ListPutter(Cnd_dlv_grp_cd6, "dlv_grp_cd6", "dlv_grp_nm6");

		}
		return Cnd_dlv_grp_cd6_p;
	}
	
	
	/** [Cnd_dlv_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd7_p = null;

	/**
	 * [Cnd_dlv_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd7_ListPutter() {
		if (Cnd_dlv_grp_cd7_p == null) {
			Cnd_dlv_grp_cd7_p = createCnd_dlv_grp_cd7_ListPutter(Cnd_dlv_grp_cd7, "dlv_grp_cd7", "dlv_grp_nm7");

		}
		return Cnd_dlv_grp_cd7_p;
	}
	
	
	/** [Cnd_dlv_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd8_p = null;

	/**
	 * [Cnd_dlv_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd8_ListPutter() {
		if (Cnd_dlv_grp_cd8_p == null) {
			Cnd_dlv_grp_cd8_p = createCnd_dlv_grp_cd8_ListPutter(Cnd_dlv_grp_cd8, "dlv_grp_cd8", "dlv_grp_nm8");

		}
		return Cnd_dlv_grp_cd8_p;
	}
	
	
	/** [Cnd_dlv_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd9_p = null;

	/**
	 * [Cnd_dlv_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd9_ListPutter() {
		if (Cnd_dlv_grp_cd9_p == null) {
			Cnd_dlv_grp_cd9_p = createCnd_dlv_grp_cd9_ListPutter(Cnd_dlv_grp_cd9, "dlv_grp_cd9", "dlv_grp_nm9");

		}
		return Cnd_dlv_grp_cd9_p;
	}
	
	
	/** [Cnd_dlv_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd10_p = null;

	/**
	 * [Cnd_dlv_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd10_ListPutter() {
		if (Cnd_dlv_grp_cd10_p == null) {
			Cnd_dlv_grp_cd10_p = createCnd_dlv_grp_cd10_ListPutter(Cnd_dlv_grp_cd10, "dlv_grp_cd10", "dlv_grp_nm10");

		}
		return Cnd_dlv_grp_cd10_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBAP_MlySlsQtySrch create(){
		MGBAP_MlySlsQtySrch p = new MGBAP_MlySlsQtySrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBAP_MlySlsQtySrch create(String name){
		MGBAP_MlySlsQtySrch p = new MGBAP_MlySlsQtySrch(name);
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
		MGBAP_MlySlsQtySrch_MC.jbfInitTop((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbfInitFold((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbfInitTab1((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbfInitTab2((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbfInitTab3((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbfInitTab4((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbfInitTab5((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbfInitCnd((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbfInitCnd2((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbfInitCnd3((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbfInitCnd4((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbfInitTtl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbfInitLPnl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbfInitCtrl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbfInitDispRslt((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbInitTop((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbInitFold((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbInitTab1((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbInitTab2((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbInitTab3((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbInitTab4((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbInitTab5((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbInitCnd((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbInitCnd2((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbInitCnd3((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbInitCnd4((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbInitTtl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbInitLPnl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbInitCtrl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.jbInitDispRslt((MGBAP_MlySlsQtySrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBAP_MlySlsQtySrch p) {
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
	protected static void jbfInitTab1(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab5(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.Tab5Panel = p.beansFactory.createPanel("Tab5");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
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
		p.Cnd_mng_dpt_cd_Label = p.beansFactory.createLabel("Cnd.mng_dpt_cd_Label");
		p.Cnd_mng_dpt_cd = p.beansFactory.createTextComboBox("Cnd.mng_dpt_cd");
		p.Cnd_mng_dpt_cd.setLabel(p.Cnd_mng_dpt_cd_Label);
		p.Cnd_mng_dpt_nm = p.beansFactory.createTextField("Cnd.mng_dpt_nm");
		p.Cnd_itm_jnl_cd_Label = p.beansFactory.createLabel("Cnd.itm_jnl_cd_Label");
		p.Cnd_itm_jnl_cd = p.beansFactory.createTextComboBox("Cnd.itm_jnl_cd");
		p.Cnd_itm_jnl_cd.setLabel(p.Cnd_itm_jnl_cd_Label);
		p.Cnd_itm_jnl_nm = p.beansFactory.createTextField("Cnd.itm_jnl_nm");
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
		p.Cnd_asst_typ_Label = p.beansFactory.createLabel("Cnd.asst_typ_Label");
		p.Cnd_asst_typ = p.beansFactory.createTextComboBox("Cnd.asst_typ");
		p.Cnd_asst_typ.setLabel(p.Cnd_asst_typ_Label);
		p.Cnd_asst_typ_nm = p.beansFactory.createTextField("Cnd.asst_typ_nm");
		p.Cnd_cst_cd_Label = p.beansFactory.createLabel("Cnd.cst_cd_Label");
		p.Cnd_cst_cd = p.beansFactory.createTextField("Cnd.cst_cd");
		p.Cnd_cst_cd.setLabel(p.Cnd_cst_cd_Label);
		p.Cnd_cst_nm = p.beansFactory.createTextField("Cnd.cst_nm");
		p.Cnd_cst_cntry_cd_Label = p.beansFactory.createLabel("Cnd.cst_cntry_cd_Label");
		p.Cnd_cst_cntry_cd = p.beansFactory.createTextComboBox("Cnd.cst_cntry_cd");
		p.Cnd_cst_cntry_cd.setLabel(p.Cnd_cst_cntry_cd_Label);
		p.Cnd_cst_cntry_nm = p.beansFactory.createTextField("Cnd.cst_cntry_nm");
		p.Cnd_cst_area_cd_Label = p.beansFactory.createLabel("Cnd.cst_area_cd_Label");
		p.Cnd_cst_area_cd = p.beansFactory.createTextComboBox("Cnd.cst_area_cd");
		p.Cnd_cst_area_cd.setLabel(p.Cnd_cst_area_cd_Label);
		p.Cnd_cst_area_nm = p.beansFactory.createTextField("Cnd.cst_area_nm");
		p.Cnd_dlv_cd_Label = p.beansFactory.createLabel("Cnd.dlv_cd_Label");
		p.Cnd_dlv_cd = p.beansFactory.createTextField("Cnd.dlv_cd");
		p.Cnd_dlv_cd.setLabel(p.Cnd_dlv_cd_Label);
		p.Cnd_dlv_nm = p.beansFactory.createTextField("Cnd.dlv_nm");
		p.Cnd_dlv_cntry_cd_Label = p.beansFactory.createLabel("Cnd.dlv_cntry_cd_Label");
		p.Cnd_dlv_cntry_cd = p.beansFactory.createTextComboBox("Cnd.dlv_cntry_cd");
		p.Cnd_dlv_cntry_cd.setLabel(p.Cnd_dlv_cntry_cd_Label);
		p.Cnd_dlv_cntry_nm = p.beansFactory.createTextField("Cnd.dlv_cntry_nm");
		p.Cnd_dlv_area_cd_Label = p.beansFactory.createLabel("Cnd.dlv_area_cd_Label");
		p.Cnd_dlv_area_cd = p.beansFactory.createTextComboBox("Cnd.dlv_area_cd");
		p.Cnd_dlv_area_cd.setLabel(p.Cnd_dlv_area_cd_Label);
		p.Cnd_dlv_area_nm = p.beansFactory.createTextField("Cnd.dlv_area_nm");
		p.Cnd_sls_dpt_cd_Label = p.beansFactory.createLabel("Cnd.sls_dpt_cd_Label");
		p.Cnd_sls_dpt_cd = p.beansFactory.createTextComboBox("Cnd.sls_dpt_cd");
		p.Cnd_sls_dpt_cd.setLabel(p.Cnd_sls_dpt_cd_Label);
		p.Cnd_sls_dpt_nm = p.beansFactory.createTextField("Cnd.sls_dpt_nm");
		p.Cnd_sls_usr_cd_Label = p.beansFactory.createLabel("Cnd.sls_usr_cd_Label");
		p.Cnd_sls_usr_cd = p.beansFactory.createTextField("Cnd.sls_usr_cd");
		p.Cnd_sls_usr_cd.setLabel(p.Cnd_sls_usr_cd_Label);
		p.Cnd_sls_usr_nm = p.beansFactory.createTextField("Cnd.sls_usr_nm");
		p.Cnd_alc_dpt_cd_Label = p.beansFactory.createLabel("Cnd.alc_dpt_cd_Label");
		p.Cnd_alc_dpt_cd = p.beansFactory.createTextComboBox("Cnd.alc_dpt_cd");
		p.Cnd_alc_dpt_cd.setLabel(p.Cnd_alc_dpt_cd_Label);
		p.Cnd_alc_dpt_nm = p.beansFactory.createTextField("Cnd.alc_dpt_nm");
		p.Cnd_dest_cd1_Label = p.beansFactory.createLabel("Cnd.dest_cd1_Label");
		p.Cnd_dest_cd1 = p.beansFactory.createTextField("Cnd.dest_cd1");
		p.Cnd_dest_cd1.setLabel(p.Cnd_dest_cd1_Label);
		p.Cnd_dest_nm1 = p.beansFactory.createTextField("Cnd.dest_nm1");
		p.Cnd_dest_cd2_Label = p.beansFactory.createLabel("Cnd.dest_cd2_Label");
		p.Cnd_dest_cd2 = p.beansFactory.createTextField("Cnd.dest_cd2");
		p.Cnd_dest_cd2.setLabel(p.Cnd_dest_cd2_Label);
		p.Cnd_dest_nm2 = p.beansFactory.createTextField("Cnd.dest_nm2");
		p.Cnd_dest_cd3_Label = p.beansFactory.createLabel("Cnd.dest_cd3_Label");
		p.Cnd_dest_cd3 = p.beansFactory.createTextField("Cnd.dest_cd3");
		p.Cnd_dest_cd3.setLabel(p.Cnd_dest_cd3_Label);
		p.Cnd_dest_nm3 = p.beansFactory.createTextField("Cnd.dest_nm3");
		p.Cnd_cost_sls_cd1_Label = p.beansFactory.createLabel("Cnd.cost_sls_cd1_Label");
		p.Cnd_cost_sls_cd1 = p.beansFactory.createTextComboBox("Cnd.cost_sls_cd1");
		p.Cnd_cost_sls_cd1.setLabel(p.Cnd_cost_sls_cd1_Label);
		p.Cnd_cost_sls_nm1 = p.beansFactory.createTextField("Cnd.cost_sls_nm1");
		p.Cnd_cost_sls_cd2_Label = p.beansFactory.createLabel("Cnd.cost_sls_cd2_Label");
		p.Cnd_cost_sls_cd2 = p.beansFactory.createTextComboBox("Cnd.cost_sls_cd2");
		p.Cnd_cost_sls_cd2.setLabel(p.Cnd_cost_sls_cd2_Label);
		p.Cnd_cost_sls_nm2 = p.beansFactory.createTextField("Cnd.cost_sls_nm2");
		p.Cnd_cost_sls_cd3_Label = p.beansFactory.createLabel("Cnd.cost_sls_cd3_Label");
		p.Cnd_cost_sls_cd3 = p.beansFactory.createTextComboBox("Cnd.cost_sls_cd3");
		p.Cnd_cost_sls_cd3.setLabel(p.Cnd_cost_sls_cd3_Label);
		p.Cnd_cost_sls_nm3 = p.beansFactory.createTextField("Cnd.cost_sls_nm3");
		p.Cnd_cost_sls_cd4_Label = p.beansFactory.createLabel("Cnd.cost_sls_cd4_Label");
		p.Cnd_cost_sls_cd4 = p.beansFactory.createTextComboBox("Cnd.cost_sls_cd4");
		p.Cnd_cost_sls_cd4.setLabel(p.Cnd_cost_sls_cd4_Label);
		p.Cnd_cost_sls_nm4 = p.beansFactory.createTextField("Cnd.cost_sls_nm4");
		p.Cnd_cost_sls_cd5_Label = p.beansFactory.createLabel("Cnd.cost_sls_cd5_Label");
		p.Cnd_cost_sls_cd5 = p.beansFactory.createTextComboBox("Cnd.cost_sls_cd5");
		p.Cnd_cost_sls_cd5.setLabel(p.Cnd_cost_sls_cd5_Label);
		p.Cnd_cost_sls_nm5 = p.beansFactory.createTextField("Cnd.cost_sls_nm5");
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
		p.Cnd_cst_grp_cd1_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd1_Label");
		p.Cnd_cst_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd1");
		p.Cnd_cst_grp_cd1.setLabel(p.Cnd_cst_grp_cd1_Label);
		p.Cnd_cst_grp_nm1 = p.beansFactory.createTextField("Cnd.cst_grp_nm1");
		p.Cnd_cst_grp_cd2_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd2_Label");
		p.Cnd_cst_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd2");
		p.Cnd_cst_grp_cd2.setLabel(p.Cnd_cst_grp_cd2_Label);
		p.Cnd_cst_grp_nm2 = p.beansFactory.createTextField("Cnd.cst_grp_nm2");
		p.Cnd_cst_grp_cd3_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd3_Label");
		p.Cnd_cst_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd3");
		p.Cnd_cst_grp_cd3.setLabel(p.Cnd_cst_grp_cd3_Label);
		p.Cnd_cst_grp_nm3 = p.beansFactory.createTextField("Cnd.cst_grp_nm3");
		p.Cnd_cst_grp_cd4_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd4_Label");
		p.Cnd_cst_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd4");
		p.Cnd_cst_grp_cd4.setLabel(p.Cnd_cst_grp_cd4_Label);
		p.Cnd_cst_grp_nm4 = p.beansFactory.createTextField("Cnd.cst_grp_nm4");
		p.Cnd_cst_grp_cd5_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd5_Label");
		p.Cnd_cst_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd5");
		p.Cnd_cst_grp_cd5.setLabel(p.Cnd_cst_grp_cd5_Label);
		p.Cnd_cst_grp_nm5 = p.beansFactory.createTextField("Cnd.cst_grp_nm5");
		p.Cnd_cst_grp_cd6_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd6_Label");
		p.Cnd_cst_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd6");
		p.Cnd_cst_grp_cd6.setLabel(p.Cnd_cst_grp_cd6_Label);
		p.Cnd_cst_grp_nm6 = p.beansFactory.createTextField("Cnd.cst_grp_nm6");
		p.Cnd_cst_grp_cd7_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd7_Label");
		p.Cnd_cst_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd7");
		p.Cnd_cst_grp_cd7.setLabel(p.Cnd_cst_grp_cd7_Label);
		p.Cnd_cst_grp_nm7 = p.beansFactory.createTextField("Cnd.cst_grp_nm7");
		p.Cnd_cst_grp_cd8_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd8_Label");
		p.Cnd_cst_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd8");
		p.Cnd_cst_grp_cd8.setLabel(p.Cnd_cst_grp_cd8_Label);
		p.Cnd_cst_grp_nm8 = p.beansFactory.createTextField("Cnd.cst_grp_nm8");
		p.Cnd_cst_grp_cd9_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd9_Label");
		p.Cnd_cst_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd9");
		p.Cnd_cst_grp_cd9.setLabel(p.Cnd_cst_grp_cd9_Label);
		p.Cnd_cst_grp_nm9 = p.beansFactory.createTextField("Cnd.cst_grp_nm9");
		p.Cnd_cst_grp_cd10_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd10_Label");
		p.Cnd_cst_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd10");
		p.Cnd_cst_grp_cd10.setLabel(p.Cnd_cst_grp_cd10_Label);
		p.Cnd_cst_grp_nm10 = p.beansFactory.createTextField("Cnd.cst_grp_nm10");
		p.Cnd_dlv_grp_cd1_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd1_Label");
		p.Cnd_dlv_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd1");
		p.Cnd_dlv_grp_cd1.setLabel(p.Cnd_dlv_grp_cd1_Label);
		p.Cnd_dlv_grp_nm1 = p.beansFactory.createTextField("Cnd.dlv_grp_nm1");
		p.Cnd_dlv_grp_cd2_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd2_Label");
		p.Cnd_dlv_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd2");
		p.Cnd_dlv_grp_cd2.setLabel(p.Cnd_dlv_grp_cd2_Label);
		p.Cnd_dlv_grp_nm2 = p.beansFactory.createTextField("Cnd.dlv_grp_nm2");
		p.Cnd_dlv_grp_cd3_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd3_Label");
		p.Cnd_dlv_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd3");
		p.Cnd_dlv_grp_cd3.setLabel(p.Cnd_dlv_grp_cd3_Label);
		p.Cnd_dlv_grp_nm3 = p.beansFactory.createTextField("Cnd.dlv_grp_nm3");
		p.Cnd_dlv_grp_cd4_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd4_Label");
		p.Cnd_dlv_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd4");
		p.Cnd_dlv_grp_cd4.setLabel(p.Cnd_dlv_grp_cd4_Label);
		p.Cnd_dlv_grp_nm4 = p.beansFactory.createTextField("Cnd.dlv_grp_nm4");
		p.Cnd_dlv_grp_cd5_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd5_Label");
		p.Cnd_dlv_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd5");
		p.Cnd_dlv_grp_cd5.setLabel(p.Cnd_dlv_grp_cd5_Label);
		p.Cnd_dlv_grp_nm5 = p.beansFactory.createTextField("Cnd.dlv_grp_nm5");
		p.Cnd_dlv_grp_cd6_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd6_Label");
		p.Cnd_dlv_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd6");
		p.Cnd_dlv_grp_cd6.setLabel(p.Cnd_dlv_grp_cd6_Label);
		p.Cnd_dlv_grp_nm6 = p.beansFactory.createTextField("Cnd.dlv_grp_nm6");
		p.Cnd_dlv_grp_cd7_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd7_Label");
		p.Cnd_dlv_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd7");
		p.Cnd_dlv_grp_cd7.setLabel(p.Cnd_dlv_grp_cd7_Label);
		p.Cnd_dlv_grp_nm7 = p.beansFactory.createTextField("Cnd.dlv_grp_nm7");
		p.Cnd_dlv_grp_cd8_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd8_Label");
		p.Cnd_dlv_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd8");
		p.Cnd_dlv_grp_cd8.setLabel(p.Cnd_dlv_grp_cd8_Label);
		p.Cnd_dlv_grp_nm8 = p.beansFactory.createTextField("Cnd.dlv_grp_nm8");
		p.Cnd_dlv_grp_cd9_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd9_Label");
		p.Cnd_dlv_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd9");
		p.Cnd_dlv_grp_cd9.setLabel(p.Cnd_dlv_grp_cd9_Label);
		p.Cnd_dlv_grp_nm9 = p.beansFactory.createTextField("Cnd.dlv_grp_nm9");
		p.Cnd_dlv_grp_cd10_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd10_Label");
		p.Cnd_dlv_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd10");
		p.Cnd_dlv_grp_cd10.setLabel(p.Cnd_dlv_grp_cd10_Label);
		p.Cnd_dlv_grp_nm10 = p.beansFactory.createTextField("Cnd.dlv_grp_nm10");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_mng_dpt_flg = p.beansFactory.createCheckBox("Cnd.mng_dpt_flg");
		p.Cnd_itm_flg = p.beansFactory.createCheckBox("Cnd.itm_flg");
		p.Cnd_itm_typ_flg = p.beansFactory.createCheckBox("Cnd.itm_typ_flg");
		p.Cnd_itm_typ_d_flg = p.beansFactory.createCheckBox("Cnd.itm_typ_d_flg");
		p.Cnd_itm_jnl_flg = p.beansFactory.createCheckBox("Cnd.itm_jnl_flg");
		p.Cnd_lot_flg = p.beansFactory.createCheckBox("Cnd.lot_flg");
		p.Cnd_sublot_flg = p.beansFactory.createCheckBox("Cnd.sublot_flg");
		p.Cnd_sno1_flg = p.beansFactory.createCheckBox("Cnd.sno1_flg");
		p.Cnd_sno2_flg = p.beansFactory.createCheckBox("Cnd.sno2_flg");
		p.Cnd_sno3_flg = p.beansFactory.createCheckBox("Cnd.sno3_flg");
		p.Cnd_sno4_flg = p.beansFactory.createCheckBox("Cnd.sno4_flg");
		p.Cnd_cst_flg = p.beansFactory.createCheckBox("Cnd.cst_flg");
		p.Cnd_cst_cntry_flg = p.beansFactory.createCheckBox("Cnd.cst_cntry_flg");
		p.Cnd_cst_area_flg = p.beansFactory.createCheckBox("Cnd.cst_area_flg");
		p.Cnd_dlv_flg = p.beansFactory.createCheckBox("Cnd.dlv_flg");
		p.Cnd_dlv_cntry_flg = p.beansFactory.createCheckBox("Cnd.dlv_cntry_flg");
		p.Cnd_dlv_area_flg = p.beansFactory.createCheckBox("Cnd.dlv_area_flg");
		p.Cnd_sls_dpt_flg = p.beansFactory.createCheckBox("Cnd.sls_dpt_flg");
		p.Cnd_sls_usr_flg = p.beansFactory.createCheckBox("Cnd.sls_usr_flg");
		p.Cnd_alc_dpt_flg = p.beansFactory.createCheckBox("Cnd.alc_dpt_flg");
		p.Cnd_dest1_flg = p.beansFactory.createCheckBox("Cnd.dest1_flg");
		p.Cnd_dest2_flg = p.beansFactory.createCheckBox("Cnd.dest2_flg");
		p.Cnd_dest3_flg = p.beansFactory.createCheckBox("Cnd.dest3_flg");
		p.Cnd_cost_sls1_flg = p.beansFactory.createCheckBox("Cnd.cost_sls1_flg");
		p.Cnd_cost_sls2_flg = p.beansFactory.createCheckBox("Cnd.cost_sls2_flg");
		p.Cnd_cost_sls3_flg = p.beansFactory.createCheckBox("Cnd.cost_sls3_flg");
		p.Cnd_cost_sls4_flg = p.beansFactory.createCheckBox("Cnd.cost_sls4_flg");
		p.Cnd_cost_sls5_flg = p.beansFactory.createCheckBox("Cnd.cost_sls5_flg");
		p.Cnd_asst_flg = p.beansFactory.createCheckBox("Cnd.asst_flg");
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
		p.Cnd_cst_grp_flg1 = p.beansFactory.createCheckBox("Cnd.cst_grp_flg1");
		p.Cnd_cst_grp_flg2 = p.beansFactory.createCheckBox("Cnd.cst_grp_flg2");
		p.Cnd_cst_grp_flg3 = p.beansFactory.createCheckBox("Cnd.cst_grp_flg3");
		p.Cnd_cst_grp_flg4 = p.beansFactory.createCheckBox("Cnd.cst_grp_flg4");
		p.Cnd_cst_grp_flg5 = p.beansFactory.createCheckBox("Cnd.cst_grp_flg5");
		p.Cnd_cst_grp_flg6 = p.beansFactory.createCheckBox("Cnd.cst_grp_flg6");
		p.Cnd_cst_grp_flg7 = p.beansFactory.createCheckBox("Cnd.cst_grp_flg7");
		p.Cnd_cst_grp_flg8 = p.beansFactory.createCheckBox("Cnd.cst_grp_flg8");
		p.Cnd_cst_grp_flg9 = p.beansFactory.createCheckBox("Cnd.cst_grp_flg9");
		p.Cnd_cst_grp_flg10 = p.beansFactory.createCheckBox("Cnd.cst_grp_flg10");
		p.Cnd_dlv_grp_flg1 = p.beansFactory.createCheckBox("Cnd.dlv_grp_flg1");
		p.Cnd_dlv_grp_flg2 = p.beansFactory.createCheckBox("Cnd.dlv_grp_flg2");
		p.Cnd_dlv_grp_flg3 = p.beansFactory.createCheckBox("Cnd.dlv_grp_flg3");
		p.Cnd_dlv_grp_flg4 = p.beansFactory.createCheckBox("Cnd.dlv_grp_flg4");
		p.Cnd_dlv_grp_flg5 = p.beansFactory.createCheckBox("Cnd.dlv_grp_flg5");
		p.Cnd_dlv_grp_flg6 = p.beansFactory.createCheckBox("Cnd.dlv_grp_flg6");
		p.Cnd_dlv_grp_flg7 = p.beansFactory.createCheckBox("Cnd.dlv_grp_flg7");
		p.Cnd_dlv_grp_flg8 = p.beansFactory.createCheckBox("Cnd.dlv_grp_flg8");
		p.Cnd_dlv_grp_flg9 = p.beansFactory.createCheckBox("Cnd.dlv_grp_flg9");
		p.Cnd_dlv_grp_flg10 = p.beansFactory.createCheckBox("Cnd.dlv_grp_flg10");
		p.Cnd_select_all = p.beansFactory.createButton("Cnd.select_all", "no_border");
		p.Cnd_deselect_all = p.beansFactory.createButton("Cnd.deselect_all", "no_border");
		p.Cnd_disp_key = p.beansFactory.createCheckBox("Cnd.disp_key");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd4(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.Cnd4Panel = p.beansFactory.createPanel("Cnd4");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTtl(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.TtlPanel = p.beansFactory.createPanel("Ttl");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispRslt(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.DispRsltPanel = p.beansFactory.createPanel("DispRslt");
		p.DispRsltScrollPane = p.beansFactory.createScrollPane("DispRslt.scroll");
		p.createDispRsltTable();
		// ブロックの項目の初期化
		p.columnDispRslt_wg_cd = p.beansFactory.createTableColumn("DispRslt.wg_cd", MCColumnType.TEXT);
		p.columnDispRslt_wg_nm = p.beansFactory.createTableColumn("DispRslt.wg_nm", MCColumnType.TEXT);
		p.columnDispRslt_mng_dpt_cd = p.beansFactory.createTableColumn("DispRslt.mng_dpt_cd", MCColumnType.TEXT);
		p.columnDispRslt_mng_dpt_nm = p.beansFactory.createTableColumn("DispRslt.mng_dpt_nm", MCColumnType.TEXT);
		p.columnDispRslt_itm_typ = p.beansFactory.createTableColumn("DispRslt.itm_typ", MCColumnType.TEXT);
		p.columnDispRslt_itm_typ_nm = p.beansFactory.createTableColumn("DispRslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("DispRslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDispRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("DispRslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDispRslt_itm_jnl_cd = p.beansFactory.createTableColumn("DispRslt.itm_jnl_cd", MCColumnType.TEXT);
		p.columnDispRslt_itm_jnl_nm = p.beansFactory.createTableColumn("DispRslt.itm_jnl_nm", MCColumnType.TEXT);
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
		p.columnDispRslt_cst_cd = p.beansFactory.createTableColumn("DispRslt.cst_cd", MCColumnType.TEXT);
		p.columnDispRslt_cst_nm = p.beansFactory.createTableColumn("DispRslt.cst_nm", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_cd1 = p.beansFactory.createTableColumn("DispRslt.cst_grp_cd1", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_nm1 = p.beansFactory.createTableColumn("DispRslt.cst_grp_nm1", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_cd2 = p.beansFactory.createTableColumn("DispRslt.cst_grp_cd2", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_nm2 = p.beansFactory.createTableColumn("DispRslt.cst_grp_nm2", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_cd3 = p.beansFactory.createTableColumn("DispRslt.cst_grp_cd3", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_nm3 = p.beansFactory.createTableColumn("DispRslt.cst_grp_nm3", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_cd4 = p.beansFactory.createTableColumn("DispRslt.cst_grp_cd4", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_nm4 = p.beansFactory.createTableColumn("DispRslt.cst_grp_nm4", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_cd5 = p.beansFactory.createTableColumn("DispRslt.cst_grp_cd5", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_nm5 = p.beansFactory.createTableColumn("DispRslt.cst_grp_nm5", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_cd6 = p.beansFactory.createTableColumn("DispRslt.cst_grp_cd6", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_nm6 = p.beansFactory.createTableColumn("DispRslt.cst_grp_nm6", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_cd7 = p.beansFactory.createTableColumn("DispRslt.cst_grp_cd7", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_nm7 = p.beansFactory.createTableColumn("DispRslt.cst_grp_nm7", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_cd8 = p.beansFactory.createTableColumn("DispRslt.cst_grp_cd8", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_nm8 = p.beansFactory.createTableColumn("DispRslt.cst_grp_nm8", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_cd9 = p.beansFactory.createTableColumn("DispRslt.cst_grp_cd9", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_nm9 = p.beansFactory.createTableColumn("DispRslt.cst_grp_nm9", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_cd10 = p.beansFactory.createTableColumn("DispRslt.cst_grp_cd10", MCColumnType.TEXT);
		p.columnDispRslt_cst_grp_nm10 = p.beansFactory.createTableColumn("DispRslt.cst_grp_nm10", MCColumnType.TEXT);
		p.columnDispRslt_cst_cntry_cd = p.beansFactory.createTableColumn("DispRslt.cst_cntry_cd", MCColumnType.TEXT);
		p.columnDispRslt_cst_cntry_nm = p.beansFactory.createTableColumn("DispRslt.cst_cntry_nm", MCColumnType.TEXT);
		p.columnDispRslt_cst_area_cd = p.beansFactory.createTableColumn("DispRslt.cst_area_cd", MCColumnType.TEXT);
		p.columnDispRslt_cst_area_nm = p.beansFactory.createTableColumn("DispRslt.cst_area_nm", MCColumnType.TEXT);
		p.columnDispRslt_dlv_cd = p.beansFactory.createTableColumn("DispRslt.dlv_cd", MCColumnType.TEXT);
		p.columnDispRslt_dlv_nm = p.beansFactory.createTableColumn("DispRslt.dlv_nm", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_cd1 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_cd1", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_nm1 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_nm1", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_cd2 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_cd2", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_nm2 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_nm2", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_cd3 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_cd3", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_nm3 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_nm3", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_cd4 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_cd4", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_nm4 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_nm4", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_cd5 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_cd5", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_nm5 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_nm5", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_cd6 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_cd6", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_nm6 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_nm6", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_cd7 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_cd7", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_nm7 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_nm7", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_cd8 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_cd8", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_nm8 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_nm8", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_cd9 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_cd9", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_nm9 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_nm9", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_cd10 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_cd10", MCColumnType.TEXT);
		p.columnDispRslt_dlv_grp_nm10 = p.beansFactory.createTableColumn("DispRslt.dlv_grp_nm10", MCColumnType.TEXT);
		p.columnDispRslt_dlv_cntry_cd = p.beansFactory.createTableColumn("DispRslt.dlv_cntry_cd", MCColumnType.TEXT);
		p.columnDispRslt_dlv_cntry_nm = p.beansFactory.createTableColumn("DispRslt.dlv_cntry_nm", MCColumnType.TEXT);
		p.columnDispRslt_dlv_area_cd = p.beansFactory.createTableColumn("DispRslt.dlv_area_cd", MCColumnType.TEXT);
		p.columnDispRslt_dlv_area_nm = p.beansFactory.createTableColumn("DispRslt.dlv_area_nm", MCColumnType.TEXT);
		p.columnDispRslt_sls_dpt_cd = p.beansFactory.createTableColumn("DispRslt.sls_dpt_cd", MCColumnType.TEXT);
		p.columnDispRslt_sls_dpt_nm = p.beansFactory.createTableColumn("DispRslt.sls_dpt_nm", MCColumnType.TEXT);
		p.columnDispRslt_sls_usr_cd = p.beansFactory.createTableColumn("DispRslt.sls_usr_cd", MCColumnType.TEXT);
		p.columnDispRslt_sls_usr_nm = p.beansFactory.createTableColumn("DispRslt.sls_usr_nm", MCColumnType.TEXT);
		p.columnDispRslt_alc_dpt_cd = p.beansFactory.createTableColumn("DispRslt.alc_dpt_cd", MCColumnType.TEXT);
		p.columnDispRslt_alc_dpt_nm = p.beansFactory.createTableColumn("DispRslt.alc_dpt_nm", MCColumnType.TEXT);
		p.columnDispRslt_dest_cd1 = p.beansFactory.createTableColumn("DispRslt.dest_cd1", MCColumnType.TEXT);
		p.columnDispRslt_dest_nm1 = p.beansFactory.createTableColumn("DispRslt.dest_nm1", MCColumnType.TEXT);
		p.columnDispRslt_dest_cd2 = p.beansFactory.createTableColumn("DispRslt.dest_cd2", MCColumnType.TEXT);
		p.columnDispRslt_dest_nm2 = p.beansFactory.createTableColumn("DispRslt.dest_nm2", MCColumnType.TEXT);
		p.columnDispRslt_dest_cd3 = p.beansFactory.createTableColumn("DispRslt.dest_cd3", MCColumnType.TEXT);
		p.columnDispRslt_dest_nm3 = p.beansFactory.createTableColumn("DispRslt.dest_nm3", MCColumnType.TEXT);
		p.columnDispRslt_cost_sls_cd1 = p.beansFactory.createTableColumn("DispRslt.cost_sls_cd1", MCColumnType.TEXT);
		p.columnDispRslt_cost_sls_nm1 = p.beansFactory.createTableColumn("DispRslt.cost_sls_nm1", MCColumnType.TEXT);
		p.columnDispRslt_cost_sls_cd2 = p.beansFactory.createTableColumn("DispRslt.cost_sls_cd2", MCColumnType.TEXT);
		p.columnDispRslt_cost_sls_nm2 = p.beansFactory.createTableColumn("DispRslt.cost_sls_nm2", MCColumnType.TEXT);
		p.columnDispRslt_cost_sls_cd3 = p.beansFactory.createTableColumn("DispRslt.cost_sls_cd3", MCColumnType.TEXT);
		p.columnDispRslt_cost_sls_nm3 = p.beansFactory.createTableColumn("DispRslt.cost_sls_nm3", MCColumnType.TEXT);
		p.columnDispRslt_cost_sls_cd4 = p.beansFactory.createTableColumn("DispRslt.cost_sls_cd4", MCColumnType.TEXT);
		p.columnDispRslt_cost_sls_nm4 = p.beansFactory.createTableColumn("DispRslt.cost_sls_nm4", MCColumnType.TEXT);
		p.columnDispRslt_cost_sls_cd5 = p.beansFactory.createTableColumn("DispRslt.cost_sls_cd5", MCColumnType.TEXT);
		p.columnDispRslt_cost_sls_nm5 = p.beansFactory.createTableColumn("DispRslt.cost_sls_nm5", MCColumnType.TEXT);
		p.columnDispRslt_asst_typ = p.beansFactory.createTableColumn("DispRslt.asst_typ", MCColumnType.TEXT);
		p.columnDispRslt_asst_typ_nm = p.beansFactory.createTableColumn("DispRslt.asst_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_unit_cd = p.beansFactory.createTableColumn("DispRslt.unit_cd", MCColumnType.TEXT);
		p.columnDispRslt_unit_nm = p.beansFactory.createTableColumn("DispRslt.unit_nm", MCColumnType.TEXT);
		p.columnDispRslt_dec_place = p.beansFactory.createTableColumn("DispRslt.dec_place", MCColumnType.NUMBER);
		p.columnDispRslt_elm_no = p.beansFactory.createTableColumn("DispRslt.elm_no", MCColumnType.NUMBER);
		p.columnDispRslt_elm = p.beansFactory.createTableColumn("DispRslt.elm", MCColumnType.TEXT);
		p.columnDispRslt_elm_nm = p.beansFactory.createTableColumn("DispRslt.elm_nm", MCColumnType.TEXT);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
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
	protected static void jbInitFold(MGBAP_MlySlsQtySrch p) {
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
		p.Tab4Panel.setNextBeans(p.Tab5Panel);
		p.FoldTab.add(p.Tab5Panel, "Fold.tab5");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MGBAP_MlySlsQtySrch p) {
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
	protected static void jbInitTab2(MGBAP_MlySlsQtySrch p) {
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
	protected static void jbInitTab3(MGBAP_MlySlsQtySrch p) {
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
	protected static void jbInitTab4(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.Tab4Panel.setNextBeans(p.Tab5Panel);
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.Cnd4Panel, null);
		p.Tab4Panel.setLastBeans(p.Cnd4Panel);
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab5(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.Tab5Panel.setValueCheck(false);
		p.Tab5Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab5Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab5Panel.add(p.TtlPanel, null);
		p.Tab5Panel.setLastBeans(p.TtlPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_pln_calc_ctg_cd.setListType(MCListType.FREE);
		p.Cnd_pln_calc_ctg_cd.setLinkBeans(p.Cnd_pln_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_pln_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_pln_calc_ctg_cd);
		p.CndPanel.setLastBeans(p.Cnd_pln_calc_ctg_cd);
		p.Cnd_pln_calc_ctg_cd.setNextBeans(p.Cnd_pln_calc_ctg_nm);
		p.Cnd_pln_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.pln_calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_pln_calc_ctg_nm);
		p.Cnd_pln_calc_ctg_nm.setNextBeans(p.Cnd_act_calc_ctg_cd);
		p.Cnd_pln_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.pln_calc_ctg_nm_META);
		p.Cnd_act_calc_ctg_cd.setListType(MCListType.FREE);
		p.Cnd_act_calc_ctg_cd.setLinkBeans(p.Cnd_act_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_act_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_act_calc_ctg_cd);
		p.Cnd_act_calc_ctg_cd.setNextBeans(p.Cnd_act_calc_ctg_nm);
		p.Cnd_act_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.act_calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_act_calc_ctg_nm);
		p.Cnd_act_calc_ctg_nm.setNextBeans(p.Cnd_term_p_PPanel);
		p.Cnd_act_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.act_calc_ctg_nm_META);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_term_p_PPanel.Term_term.setListType(MCListType.FREE);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_mng_dpt_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_mng_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mng_dpt_cd, true);
		p.Cnd_mng_dpt_cd.setLinkBeans(p.Cnd_mng_dpt_nm);
		p.CndPanel.add(p.Cnd_mng_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_mng_dpt_cd);
		p.Cnd_mng_dpt_cd.setNextBeans(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.mng_dpt_cd_META);
		p.CndPanel.add(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_mng_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.mng_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_mng_dpt_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_jnl_cd, true);
		p.Cnd_itm_jnl_cd.setLinkBeans(p.Cnd_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setNextBeans(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_jnl_nm_META);
		p.setPluralValueEnable(p.Cnd_itm_jnl_nm, true);
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
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno1);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sublot_no_META);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno1_Label);
		p.CndPanel.add(p.Cnd_sno1);
		p.Cnd_sno1.setNextBeans(p.Cnd_sno2);
		p.Cnd_sno1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sno1_META);
		p.setPluralValueEnable(p.Cnd_sno1, true);
		p.CndPanel.add(p.Cnd_sno2_Label);
		p.CndPanel.add(p.Cnd_sno2);
		p.Cnd_sno2.setNextBeans(p.Cnd_sno3);
		p.Cnd_sno2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sno2_META);
		p.setPluralValueEnable(p.Cnd_sno2, true);
		p.CndPanel.add(p.Cnd_sno3_Label);
		p.CndPanel.add(p.Cnd_sno3);
		p.Cnd_sno3.setNextBeans(p.Cnd_sno4);
		p.Cnd_sno3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sno3_META);
		p.setPluralValueEnable(p.Cnd_sno3, true);
		p.CndPanel.add(p.Cnd_sno4_Label);
		p.CndPanel.add(p.Cnd_sno4);
		p.Cnd_sno4.setNextBeans(p.Cnd_asst_typ);
		p.Cnd_sno4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sno4_META);
		p.setPluralValueEnable(p.Cnd_sno4, true);
		p.Cnd_asst_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asst_typ, true);
		p.Cnd_asst_typ.setLinkBeans(p.Cnd_asst_typ_nm);
		p.CndPanel.add(p.Cnd_asst_typ_Label);
		p.CndPanel.add(p.Cnd_asst_typ);
		p.Cnd_asst_typ.setNextBeans(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.asst_typ_META);
		p.CndPanel.add(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_asst_typ_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.asst_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_asst_typ_nm, true);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_cst_cntry_cd);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.Cnd_cst_cntry_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cntry_cd, true);
		p.Cnd_cst_cntry_cd.setLinkBeans(p.Cnd_cst_cntry_nm);
		p.CndPanel.add(p.Cnd_cst_cntry_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cntry_cd);
		p.Cnd_cst_cntry_cd.setNextBeans(p.Cnd_cst_cntry_nm);
		p.Cnd_cst_cntry_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_cntry_cd_META);
		p.CndPanel.add(p.Cnd_cst_cntry_nm);
		p.Cnd_cst_cntry_nm.setNextBeans(p.Cnd_cst_area_cd);
		p.Cnd_cst_cntry_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_cntry_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_cntry_nm, true);
		p.Cnd_cst_area_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_area_cd, true);
		p.Cnd_cst_area_cd.setLinkBeans(p.Cnd_cst_area_nm);
		p.CndPanel.add(p.Cnd_cst_area_cd_Label);
		p.CndPanel.add(p.Cnd_cst_area_cd);
		p.Cnd_cst_area_cd.setNextBeans(p.Cnd_cst_area_nm);
		p.Cnd_cst_area_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_area_cd_META);
		p.CndPanel.add(p.Cnd_cst_area_nm);
		p.Cnd_cst_area_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_cst_area_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_area_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_area_nm, true);
		p.CndPanel.add(p.Cnd_dlv_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_cd_META);
		p.Cnd_dlv_cd.addLinkBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.CndPanel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_dlv_cntry_cd);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.Cnd_dlv_cntry_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cntry_cd, true);
		p.Cnd_dlv_cntry_cd.setLinkBeans(p.Cnd_dlv_cntry_nm);
		p.CndPanel.add(p.Cnd_dlv_cntry_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cntry_cd);
		p.Cnd_dlv_cntry_cd.setNextBeans(p.Cnd_dlv_cntry_nm);
		p.Cnd_dlv_cntry_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_cntry_cd_META);
		p.CndPanel.add(p.Cnd_dlv_cntry_nm);
		p.Cnd_dlv_cntry_nm.setNextBeans(p.Cnd_dlv_area_cd);
		p.Cnd_dlv_cntry_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_cntry_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_cntry_nm, true);
		p.Cnd_dlv_area_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_area_cd, true);
		p.Cnd_dlv_area_cd.setLinkBeans(p.Cnd_dlv_area_nm);
		p.CndPanel.add(p.Cnd_dlv_area_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_area_cd);
		p.Cnd_dlv_area_cd.setNextBeans(p.Cnd_dlv_area_nm);
		p.Cnd_dlv_area_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_area_cd_META);
		p.CndPanel.add(p.Cnd_dlv_area_nm);
		p.Cnd_dlv_area_nm.setNextBeans(p.Cnd_sls_dpt_cd);
		p.Cnd_dlv_area_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_area_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_area_nm, true);
		p.Cnd_sls_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_dpt_cd, true);
		p.Cnd_sls_dpt_cd.setLinkBeans(p.Cnd_sls_dpt_nm);
		p.CndPanel.add(p.Cnd_sls_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_dpt_cd.setNextBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sls_dpt_cd_META);
		p.CndPanel.add(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_nm.setNextBeans(p.Cnd_sls_usr_cd);
		p.Cnd_sls_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sls_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_dpt_nm, true);
		p.CndPanel.add(p.Cnd_sls_usr_cd_Label);
		p.CndPanel.add(p.Cnd_sls_usr_cd);
		p.Cnd_sls_usr_cd.setNextBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sls_usr_cd_META);
		p.Cnd_sls_usr_cd.addLinkBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_usr_cd, true);
		p.CndPanel.add(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_nm.setNextBeans(p.Cnd_alc_dpt_cd);
		p.Cnd_sls_usr_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sls_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_usr_nm, true);
		p.Cnd_alc_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_dpt_cd, true);
		p.Cnd_alc_dpt_cd.setLinkBeans(p.Cnd_alc_dpt_nm);
		p.CndPanel.add(p.Cnd_alc_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_alc_dpt_cd);
		p.Cnd_alc_dpt_cd.setNextBeans(p.Cnd_alc_dpt_nm);
		p.Cnd_alc_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.alc_dpt_cd_META);
		p.CndPanel.add(p.Cnd_alc_dpt_nm);
		p.Cnd_alc_dpt_nm.setNextBeans(p.Cnd_dest_cd1);
		p.Cnd_alc_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.alc_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_alc_dpt_nm, true);
		p.CndPanel.add(p.Cnd_dest_cd1_Label);
		p.CndPanel.add(p.Cnd_dest_cd1);
		p.Cnd_dest_cd1.setNextBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dest_cd1_META);
		p.Cnd_dest_cd1.addLinkBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd1, true);
		p.CndPanel.add(p.Cnd_dest_nm1);
		p.Cnd_dest_nm1.setNextBeans(p.Cnd_dest_cd2);
		p.Cnd_dest_nm1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dest_nm1_META);
		p.setPluralValueEnable(p.Cnd_dest_nm1, true);
		p.CndPanel.add(p.Cnd_dest_cd2_Label);
		p.CndPanel.add(p.Cnd_dest_cd2);
		p.Cnd_dest_cd2.setNextBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dest_cd2_META);
		p.Cnd_dest_cd2.addLinkBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd2, true);
		p.CndPanel.add(p.Cnd_dest_nm2);
		p.Cnd_dest_nm2.setNextBeans(p.Cnd_dest_cd3);
		p.Cnd_dest_nm2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dest_nm2_META);
		p.setPluralValueEnable(p.Cnd_dest_nm2, true);
		p.CndPanel.add(p.Cnd_dest_cd3_Label);
		p.CndPanel.add(p.Cnd_dest_cd3);
		p.Cnd_dest_cd3.setNextBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dest_cd3_META);
		p.Cnd_dest_cd3.addLinkBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd3, true);
		p.CndPanel.add(p.Cnd_dest_nm3);
		p.Cnd_dest_nm3.setNextBeans(p.Cnd_cost_sls_cd1);
		p.Cnd_dest_nm3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dest_nm3_META);
		p.setPluralValueEnable(p.Cnd_dest_nm3, true);
		p.Cnd_cost_sls_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cost_sls_cd1, true);
		p.Cnd_cost_sls_cd1.setLinkBeans(p.Cnd_cost_sls_nm1);
		p.CndPanel.add(p.Cnd_cost_sls_cd1_Label);
		p.CndPanel.add(p.Cnd_cost_sls_cd1);
		p.Cnd_cost_sls_cd1.setNextBeans(p.Cnd_cost_sls_nm1);
		p.Cnd_cost_sls_cd1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cost_sls_cd1_META);
		p.CndPanel.add(p.Cnd_cost_sls_nm1);
		p.Cnd_cost_sls_nm1.setNextBeans(p.Cnd_cost_sls_cd2);
		p.Cnd_cost_sls_nm1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cost_sls_nm1_META);
		p.setPluralValueEnable(p.Cnd_cost_sls_nm1, true);
		p.Cnd_cost_sls_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cost_sls_cd2, true);
		p.Cnd_cost_sls_cd2.setLinkBeans(p.Cnd_cost_sls_nm2);
		p.CndPanel.add(p.Cnd_cost_sls_cd2_Label);
		p.CndPanel.add(p.Cnd_cost_sls_cd2);
		p.Cnd_cost_sls_cd2.setNextBeans(p.Cnd_cost_sls_nm2);
		p.Cnd_cost_sls_cd2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cost_sls_cd2_META);
		p.CndPanel.add(p.Cnd_cost_sls_nm2);
		p.Cnd_cost_sls_nm2.setNextBeans(p.Cnd_cost_sls_cd3);
		p.Cnd_cost_sls_nm2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cost_sls_nm2_META);
		p.setPluralValueEnable(p.Cnd_cost_sls_nm2, true);
		p.Cnd_cost_sls_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cost_sls_cd3, true);
		p.Cnd_cost_sls_cd3.setLinkBeans(p.Cnd_cost_sls_nm3);
		p.CndPanel.add(p.Cnd_cost_sls_cd3_Label);
		p.CndPanel.add(p.Cnd_cost_sls_cd3);
		p.Cnd_cost_sls_cd3.setNextBeans(p.Cnd_cost_sls_nm3);
		p.Cnd_cost_sls_cd3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cost_sls_cd3_META);
		p.CndPanel.add(p.Cnd_cost_sls_nm3);
		p.Cnd_cost_sls_nm3.setNextBeans(p.Cnd_cost_sls_cd4);
		p.Cnd_cost_sls_nm3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cost_sls_nm3_META);
		p.setPluralValueEnable(p.Cnd_cost_sls_nm3, true);
		p.Cnd_cost_sls_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cost_sls_cd4, true);
		p.Cnd_cost_sls_cd4.setLinkBeans(p.Cnd_cost_sls_nm4);
		p.CndPanel.add(p.Cnd_cost_sls_cd4_Label);
		p.CndPanel.add(p.Cnd_cost_sls_cd4);
		p.Cnd_cost_sls_cd4.setNextBeans(p.Cnd_cost_sls_nm4);
		p.Cnd_cost_sls_cd4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cost_sls_cd4_META);
		p.CndPanel.add(p.Cnd_cost_sls_nm4);
		p.Cnd_cost_sls_nm4.setNextBeans(p.Cnd_cost_sls_cd5);
		p.Cnd_cost_sls_nm4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cost_sls_nm4_META);
		p.setPluralValueEnable(p.Cnd_cost_sls_nm4, true);
		p.Cnd_cost_sls_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cost_sls_cd5, true);
		p.Cnd_cost_sls_cd5.setLinkBeans(p.Cnd_cost_sls_nm5);
		p.CndPanel.add(p.Cnd_cost_sls_cd5_Label);
		p.CndPanel.add(p.Cnd_cost_sls_cd5);
		p.Cnd_cost_sls_cd5.setNextBeans(p.Cnd_cost_sls_nm5);
		p.Cnd_cost_sls_cd5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cost_sls_cd5_META);
		p.CndPanel.add(p.Cnd_cost_sls_nm5);
		p.Cnd_cost_sls_nm5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cost_sls_nm5_META);
		p.setPluralValueEnable(p.Cnd_cost_sls_nm5, true);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
		p.Cnd_cst_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd1, true);
		p.Cnd_cst_grp_cd1.setLinkBeans(p.Cnd_cst_grp_nm1);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd1_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd1);
		p.Cnd3Panel.setLastBeans(p.Cnd_cst_grp_cd1);
		p.Cnd_cst_grp_cd1.setNextBeans(p.Cnd_cst_grp_nm1);
		p.Cnd_cst_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_cd1_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm1);
		p.Cnd_cst_grp_nm1.setNextBeans(p.Cnd_cst_grp_cd2);
		p.Cnd_cst_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm1, true);
		p.Cnd_cst_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd2, true);
		p.Cnd_cst_grp_cd2.setLinkBeans(p.Cnd_cst_grp_nm2);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd2_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd2);
		p.Cnd_cst_grp_cd2.setNextBeans(p.Cnd_cst_grp_nm2);
		p.Cnd_cst_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_cd2_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm2);
		p.Cnd_cst_grp_nm2.setNextBeans(p.Cnd_cst_grp_cd3);
		p.Cnd_cst_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm2, true);
		p.Cnd_cst_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd3, true);
		p.Cnd_cst_grp_cd3.setLinkBeans(p.Cnd_cst_grp_nm3);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd3_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd3);
		p.Cnd_cst_grp_cd3.setNextBeans(p.Cnd_cst_grp_nm3);
		p.Cnd_cst_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_cd3_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm3);
		p.Cnd_cst_grp_nm3.setNextBeans(p.Cnd_cst_grp_cd4);
		p.Cnd_cst_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm3, true);
		p.Cnd_cst_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd4, true);
		p.Cnd_cst_grp_cd4.setLinkBeans(p.Cnd_cst_grp_nm4);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd4_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd4);
		p.Cnd_cst_grp_cd4.setNextBeans(p.Cnd_cst_grp_nm4);
		p.Cnd_cst_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_cd4_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm4);
		p.Cnd_cst_grp_nm4.setNextBeans(p.Cnd_cst_grp_cd5);
		p.Cnd_cst_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm4, true);
		p.Cnd_cst_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd5, true);
		p.Cnd_cst_grp_cd5.setLinkBeans(p.Cnd_cst_grp_nm5);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd5_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd5);
		p.Cnd_cst_grp_cd5.setNextBeans(p.Cnd_cst_grp_nm5);
		p.Cnd_cst_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_cd5_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm5);
		p.Cnd_cst_grp_nm5.setNextBeans(p.Cnd_cst_grp_cd6);
		p.Cnd_cst_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm5, true);
		p.Cnd_cst_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd6, true);
		p.Cnd_cst_grp_cd6.setLinkBeans(p.Cnd_cst_grp_nm6);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd6_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd6);
		p.Cnd_cst_grp_cd6.setNextBeans(p.Cnd_cst_grp_nm6);
		p.Cnd_cst_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_cd6_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm6);
		p.Cnd_cst_grp_nm6.setNextBeans(p.Cnd_cst_grp_cd7);
		p.Cnd_cst_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm6, true);
		p.Cnd_cst_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd7, true);
		p.Cnd_cst_grp_cd7.setLinkBeans(p.Cnd_cst_grp_nm7);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd7_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd7);
		p.Cnd_cst_grp_cd7.setNextBeans(p.Cnd_cst_grp_nm7);
		p.Cnd_cst_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_cd7_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm7);
		p.Cnd_cst_grp_nm7.setNextBeans(p.Cnd_cst_grp_cd8);
		p.Cnd_cst_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm7, true);
		p.Cnd_cst_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd8, true);
		p.Cnd_cst_grp_cd8.setLinkBeans(p.Cnd_cst_grp_nm8);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd8_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd8);
		p.Cnd_cst_grp_cd8.setNextBeans(p.Cnd_cst_grp_nm8);
		p.Cnd_cst_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_cd8_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm8);
		p.Cnd_cst_grp_nm8.setNextBeans(p.Cnd_cst_grp_cd9);
		p.Cnd_cst_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm8, true);
		p.Cnd_cst_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd9, true);
		p.Cnd_cst_grp_cd9.setLinkBeans(p.Cnd_cst_grp_nm9);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd9_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd9);
		p.Cnd_cst_grp_cd9.setNextBeans(p.Cnd_cst_grp_nm9);
		p.Cnd_cst_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_cd9_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm9);
		p.Cnd_cst_grp_nm9.setNextBeans(p.Cnd_cst_grp_cd10);
		p.Cnd_cst_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm9, true);
		p.Cnd_cst_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd10, true);
		p.Cnd_cst_grp_cd10.setLinkBeans(p.Cnd_cst_grp_nm10);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd10_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd10);
		p.Cnd_cst_grp_cd10.setNextBeans(p.Cnd_cst_grp_nm10);
		p.Cnd_cst_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_cd10_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm10);
		p.Cnd_cst_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm10, true);
		p.Cnd_dlv_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd1, true);
		p.Cnd_dlv_grp_cd1.setLinkBeans(p.Cnd_dlv_grp_nm1);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd1_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd1);
		p.Cnd4Panel.setLastBeans(p.Cnd_dlv_grp_cd1);
		p.Cnd_dlv_grp_cd1.setNextBeans(p.Cnd_dlv_grp_nm1);
		p.Cnd_dlv_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_cd1_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm1);
		p.Cnd_dlv_grp_nm1.setNextBeans(p.Cnd_dlv_grp_cd2);
		p.Cnd_dlv_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm1, true);
		p.Cnd_dlv_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd2, true);
		p.Cnd_dlv_grp_cd2.setLinkBeans(p.Cnd_dlv_grp_nm2);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd2_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd2);
		p.Cnd_dlv_grp_cd2.setNextBeans(p.Cnd_dlv_grp_nm2);
		p.Cnd_dlv_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_cd2_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm2);
		p.Cnd_dlv_grp_nm2.setNextBeans(p.Cnd_dlv_grp_cd3);
		p.Cnd_dlv_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm2, true);
		p.Cnd_dlv_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd3, true);
		p.Cnd_dlv_grp_cd3.setLinkBeans(p.Cnd_dlv_grp_nm3);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd3_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd3);
		p.Cnd_dlv_grp_cd3.setNextBeans(p.Cnd_dlv_grp_nm3);
		p.Cnd_dlv_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_cd3_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm3);
		p.Cnd_dlv_grp_nm3.setNextBeans(p.Cnd_dlv_grp_cd4);
		p.Cnd_dlv_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm3, true);
		p.Cnd_dlv_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd4, true);
		p.Cnd_dlv_grp_cd4.setLinkBeans(p.Cnd_dlv_grp_nm4);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd4_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd4);
		p.Cnd_dlv_grp_cd4.setNextBeans(p.Cnd_dlv_grp_nm4);
		p.Cnd_dlv_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_cd4_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm4);
		p.Cnd_dlv_grp_nm4.setNextBeans(p.Cnd_dlv_grp_cd5);
		p.Cnd_dlv_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm4, true);
		p.Cnd_dlv_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd5, true);
		p.Cnd_dlv_grp_cd5.setLinkBeans(p.Cnd_dlv_grp_nm5);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd5_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd5);
		p.Cnd_dlv_grp_cd5.setNextBeans(p.Cnd_dlv_grp_nm5);
		p.Cnd_dlv_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_cd5_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm5);
		p.Cnd_dlv_grp_nm5.setNextBeans(p.Cnd_dlv_grp_cd6);
		p.Cnd_dlv_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm5, true);
		p.Cnd_dlv_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd6, true);
		p.Cnd_dlv_grp_cd6.setLinkBeans(p.Cnd_dlv_grp_nm6);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd6_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd6);
		p.Cnd_dlv_grp_cd6.setNextBeans(p.Cnd_dlv_grp_nm6);
		p.Cnd_dlv_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_cd6_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm6);
		p.Cnd_dlv_grp_nm6.setNextBeans(p.Cnd_dlv_grp_cd7);
		p.Cnd_dlv_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm6, true);
		p.Cnd_dlv_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd7, true);
		p.Cnd_dlv_grp_cd7.setLinkBeans(p.Cnd_dlv_grp_nm7);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd7_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd7);
		p.Cnd_dlv_grp_cd7.setNextBeans(p.Cnd_dlv_grp_nm7);
		p.Cnd_dlv_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_cd7_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm7);
		p.Cnd_dlv_grp_nm7.setNextBeans(p.Cnd_dlv_grp_cd8);
		p.Cnd_dlv_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm7, true);
		p.Cnd_dlv_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd8, true);
		p.Cnd_dlv_grp_cd8.setLinkBeans(p.Cnd_dlv_grp_nm8);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd8_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd8);
		p.Cnd_dlv_grp_cd8.setNextBeans(p.Cnd_dlv_grp_nm8);
		p.Cnd_dlv_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_cd8_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm8);
		p.Cnd_dlv_grp_nm8.setNextBeans(p.Cnd_dlv_grp_cd9);
		p.Cnd_dlv_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm8, true);
		p.Cnd_dlv_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd9, true);
		p.Cnd_dlv_grp_cd9.setLinkBeans(p.Cnd_dlv_grp_nm9);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd9_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd9);
		p.Cnd_dlv_grp_cd9.setNextBeans(p.Cnd_dlv_grp_nm9);
		p.Cnd_dlv_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_cd9_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm9);
		p.Cnd_dlv_grp_nm9.setNextBeans(p.Cnd_dlv_grp_cd10);
		p.Cnd_dlv_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm9, true);
		p.Cnd_dlv_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd10, true);
		p.Cnd_dlv_grp_cd10.setLinkBeans(p.Cnd_dlv_grp_nm10);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd10_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd10);
		p.Cnd_dlv_grp_cd10.setNextBeans(p.Cnd_dlv_grp_nm10);
		p.Cnd_dlv_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_cd10_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm10);
		p.Cnd_dlv_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm10, true);
		p.TtlPanel.add(p.Cnd_wg_flg);
		p.TtlPanel.setLastBeans(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setNextBeans(p.Cnd_mng_dpt_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.wg_flg_META);
		p.TtlPanel.add(p.Cnd_mng_dpt_flg);
		p.Cnd_mng_dpt_flg.setNextBeans(p.Cnd_itm_flg);
		p.Cnd_mng_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.mng_dpt_flg_META);
		p.TtlPanel.add(p.Cnd_itm_flg);
		p.Cnd_itm_flg.setNextBeans(p.Cnd_itm_typ_flg);
		p.Cnd_itm_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_flg_META);
		p.TtlPanel.add(p.Cnd_itm_typ_flg);
		p.Cnd_itm_typ_flg.setNextBeans(p.Cnd_itm_typ_d_flg);
		p.Cnd_itm_typ_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_typ_flg_META);
		p.TtlPanel.add(p.Cnd_itm_typ_d_flg);
		p.Cnd_itm_typ_d_flg.setNextBeans(p.Cnd_itm_jnl_flg);
		p.Cnd_itm_typ_d_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_typ_d_flg_META);
		p.TtlPanel.add(p.Cnd_itm_jnl_flg);
		p.Cnd_itm_jnl_flg.setNextBeans(p.Cnd_lot_flg);
		p.Cnd_itm_jnl_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_jnl_flg_META);
		p.TtlPanel.add(p.Cnd_lot_flg);
		p.Cnd_lot_flg.setNextBeans(p.Cnd_sublot_flg);
		p.Cnd_lot_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.lot_flg_META);
		p.TtlPanel.add(p.Cnd_sublot_flg);
		p.Cnd_sublot_flg.setNextBeans(p.Cnd_sno1_flg);
		p.Cnd_sublot_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sublot_flg_META);
		p.TtlPanel.add(p.Cnd_sno1_flg);
		p.Cnd_sno1_flg.setNextBeans(p.Cnd_sno2_flg);
		p.Cnd_sno1_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sno1_flg_META);
		p.TtlPanel.add(p.Cnd_sno2_flg);
		p.Cnd_sno2_flg.setNextBeans(p.Cnd_sno3_flg);
		p.Cnd_sno2_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sno2_flg_META);
		p.TtlPanel.add(p.Cnd_sno3_flg);
		p.Cnd_sno3_flg.setNextBeans(p.Cnd_sno4_flg);
		p.Cnd_sno3_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sno3_flg_META);
		p.TtlPanel.add(p.Cnd_sno4_flg);
		p.Cnd_sno4_flg.setNextBeans(p.Cnd_cst_flg);
		p.Cnd_sno4_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sno4_flg_META);
		p.TtlPanel.add(p.Cnd_cst_flg);
		p.Cnd_cst_flg.setNextBeans(p.Cnd_cst_cntry_flg);
		p.Cnd_cst_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_flg_META);
		p.TtlPanel.add(p.Cnd_cst_cntry_flg);
		p.Cnd_cst_cntry_flg.setNextBeans(p.Cnd_cst_area_flg);
		p.Cnd_cst_cntry_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_cntry_flg_META);
		p.TtlPanel.add(p.Cnd_cst_area_flg);
		p.Cnd_cst_area_flg.setNextBeans(p.Cnd_dlv_flg);
		p.Cnd_cst_area_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_area_flg_META);
		p.TtlPanel.add(p.Cnd_dlv_flg);
		p.Cnd_dlv_flg.setNextBeans(p.Cnd_dlv_cntry_flg);
		p.Cnd_dlv_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_flg_META);
		p.TtlPanel.add(p.Cnd_dlv_cntry_flg);
		p.Cnd_dlv_cntry_flg.setNextBeans(p.Cnd_dlv_area_flg);
		p.Cnd_dlv_cntry_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_cntry_flg_META);
		p.TtlPanel.add(p.Cnd_dlv_area_flg);
		p.Cnd_dlv_area_flg.setNextBeans(p.Cnd_sls_dpt_flg);
		p.Cnd_dlv_area_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_area_flg_META);
		p.TtlPanel.add(p.Cnd_sls_dpt_flg);
		p.Cnd_sls_dpt_flg.setNextBeans(p.Cnd_sls_usr_flg);
		p.Cnd_sls_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sls_dpt_flg_META);
		p.TtlPanel.add(p.Cnd_sls_usr_flg);
		p.Cnd_sls_usr_flg.setNextBeans(p.Cnd_alc_dpt_flg);
		p.Cnd_sls_usr_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.sls_usr_flg_META);
		p.TtlPanel.add(p.Cnd_alc_dpt_flg);
		p.Cnd_alc_dpt_flg.setNextBeans(p.Cnd_dest1_flg);
		p.Cnd_alc_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.alc_dpt_flg_META);
		p.TtlPanel.add(p.Cnd_dest1_flg);
		p.Cnd_dest1_flg.setNextBeans(p.Cnd_dest2_flg);
		p.Cnd_dest1_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dest1_flg_META);
		p.TtlPanel.add(p.Cnd_dest2_flg);
		p.Cnd_dest2_flg.setNextBeans(p.Cnd_dest3_flg);
		p.Cnd_dest2_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dest2_flg_META);
		p.TtlPanel.add(p.Cnd_dest3_flg);
		p.Cnd_dest3_flg.setNextBeans(p.Cnd_cost_sls1_flg);
		p.Cnd_dest3_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dest3_flg_META);
		p.TtlPanel.add(p.Cnd_cost_sls1_flg);
		p.Cnd_cost_sls1_flg.setNextBeans(p.Cnd_cost_sls2_flg);
		p.Cnd_cost_sls1_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cost_sls1_flg_META);
		p.TtlPanel.add(p.Cnd_cost_sls2_flg);
		p.Cnd_cost_sls2_flg.setNextBeans(p.Cnd_cost_sls3_flg);
		p.Cnd_cost_sls2_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cost_sls2_flg_META);
		p.TtlPanel.add(p.Cnd_cost_sls3_flg);
		p.Cnd_cost_sls3_flg.setNextBeans(p.Cnd_cost_sls4_flg);
		p.Cnd_cost_sls3_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cost_sls3_flg_META);
		p.TtlPanel.add(p.Cnd_cost_sls4_flg);
		p.Cnd_cost_sls4_flg.setNextBeans(p.Cnd_cost_sls5_flg);
		p.Cnd_cost_sls4_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cost_sls4_flg_META);
		p.TtlPanel.add(p.Cnd_cost_sls5_flg);
		p.Cnd_cost_sls5_flg.setNextBeans(p.Cnd_asst_flg);
		p.Cnd_cost_sls5_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cost_sls5_flg_META);
		p.TtlPanel.add(p.Cnd_asst_flg);
		p.Cnd_asst_flg.setNextBeans(p.Cnd_itm_grp_flg1);
		p.Cnd_asst_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.asst_flg_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg1);
		p.Cnd_itm_grp_flg1.setNextBeans(p.Cnd_itm_grp_flg2);
		p.Cnd_itm_grp_flg1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_flg1_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg2);
		p.Cnd_itm_grp_flg2.setNextBeans(p.Cnd_itm_grp_flg3);
		p.Cnd_itm_grp_flg2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_flg2_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg3);
		p.Cnd_itm_grp_flg3.setNextBeans(p.Cnd_itm_grp_flg4);
		p.Cnd_itm_grp_flg3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_flg3_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg4);
		p.Cnd_itm_grp_flg4.setNextBeans(p.Cnd_itm_grp_flg5);
		p.Cnd_itm_grp_flg4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_flg4_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg5);
		p.Cnd_itm_grp_flg5.setNextBeans(p.Cnd_itm_grp_flg6);
		p.Cnd_itm_grp_flg5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_flg5_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg6);
		p.Cnd_itm_grp_flg6.setNextBeans(p.Cnd_itm_grp_flg7);
		p.Cnd_itm_grp_flg6.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_flg6_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg7);
		p.Cnd_itm_grp_flg7.setNextBeans(p.Cnd_itm_grp_flg8);
		p.Cnd_itm_grp_flg7.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_flg7_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg8);
		p.Cnd_itm_grp_flg8.setNextBeans(p.Cnd_itm_grp_flg9);
		p.Cnd_itm_grp_flg8.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_flg8_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg9);
		p.Cnd_itm_grp_flg9.setNextBeans(p.Cnd_itm_grp_flg10);
		p.Cnd_itm_grp_flg9.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_flg9_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg10);
		p.Cnd_itm_grp_flg10.setNextBeans(p.Cnd_cst_grp_flg1);
		p.Cnd_itm_grp_flg10.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.itm_grp_flg10_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg1);
		p.Cnd_cst_grp_flg1.setNextBeans(p.Cnd_cst_grp_flg2);
		p.Cnd_cst_grp_flg1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_flg1_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg2);
		p.Cnd_cst_grp_flg2.setNextBeans(p.Cnd_cst_grp_flg3);
		p.Cnd_cst_grp_flg2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_flg2_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg3);
		p.Cnd_cst_grp_flg3.setNextBeans(p.Cnd_cst_grp_flg4);
		p.Cnd_cst_grp_flg3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_flg3_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg4);
		p.Cnd_cst_grp_flg4.setNextBeans(p.Cnd_cst_grp_flg5);
		p.Cnd_cst_grp_flg4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_flg4_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg5);
		p.Cnd_cst_grp_flg5.setNextBeans(p.Cnd_cst_grp_flg6);
		p.Cnd_cst_grp_flg5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_flg5_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg6);
		p.Cnd_cst_grp_flg6.setNextBeans(p.Cnd_cst_grp_flg7);
		p.Cnd_cst_grp_flg6.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_flg6_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg7);
		p.Cnd_cst_grp_flg7.setNextBeans(p.Cnd_cst_grp_flg8);
		p.Cnd_cst_grp_flg7.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_flg7_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg8);
		p.Cnd_cst_grp_flg8.setNextBeans(p.Cnd_cst_grp_flg9);
		p.Cnd_cst_grp_flg8.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_flg8_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg9);
		p.Cnd_cst_grp_flg9.setNextBeans(p.Cnd_cst_grp_flg10);
		p.Cnd_cst_grp_flg9.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_flg9_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg10);
		p.Cnd_cst_grp_flg10.setNextBeans(p.Cnd_dlv_grp_flg1);
		p.Cnd_cst_grp_flg10.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.cst_grp_flg10_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg1);
		p.Cnd_dlv_grp_flg1.setNextBeans(p.Cnd_dlv_grp_flg2);
		p.Cnd_dlv_grp_flg1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_flg1_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg2);
		p.Cnd_dlv_grp_flg2.setNextBeans(p.Cnd_dlv_grp_flg3);
		p.Cnd_dlv_grp_flg2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_flg2_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg3);
		p.Cnd_dlv_grp_flg3.setNextBeans(p.Cnd_dlv_grp_flg4);
		p.Cnd_dlv_grp_flg3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_flg3_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg4);
		p.Cnd_dlv_grp_flg4.setNextBeans(p.Cnd_dlv_grp_flg5);
		p.Cnd_dlv_grp_flg4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_flg4_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg5);
		p.Cnd_dlv_grp_flg5.setNextBeans(p.Cnd_dlv_grp_flg6);
		p.Cnd_dlv_grp_flg5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_flg5_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg6);
		p.Cnd_dlv_grp_flg6.setNextBeans(p.Cnd_dlv_grp_flg7);
		p.Cnd_dlv_grp_flg6.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_flg6_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg7);
		p.Cnd_dlv_grp_flg7.setNextBeans(p.Cnd_dlv_grp_flg8);
		p.Cnd_dlv_grp_flg7.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_flg7_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg8);
		p.Cnd_dlv_grp_flg8.setNextBeans(p.Cnd_dlv_grp_flg9);
		p.Cnd_dlv_grp_flg8.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_flg8_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg9);
		p.Cnd_dlv_grp_flg9.setNextBeans(p.Cnd_dlv_grp_flg10);
		p.Cnd_dlv_grp_flg9.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_flg9_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg10);
		p.Cnd_dlv_grp_flg10.setNextBeans(p.Cnd_select_all);
		p.Cnd_dlv_grp_flg10.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.dlv_grp_flg10_META);
		p.Cnd_select_all.setIcon("SELECT_ALL");
		p.Cnd_select_all.setFunctionKey(MCFunctionKey.F13);
		p.TtlPanel.add(p.Cnd_select_all);
		p.Cnd_select_all.setNextBeans(p.Cnd_deselect_all);
		p.Cnd_deselect_all.setIcon("DESELECT_ALL");
		p.Cnd_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.TtlPanel.add(p.Cnd_deselect_all);
		p.LPnlPanel.add(p.Cnd_disp_key);
		p.LPnlPanel.setLastBeans(p.Cnd_disp_key);
		p.Cnd_disp_key.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0100.CndR.disp_key_META);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd4(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.Cnd4Panel.setValueCheck(false);
		p.Cnd4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTtl(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.TtlPanel.setValueCheck(false);
		p.TtlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MGBAP_MlySlsQtySrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBAP_MlySlsQtySrch p) {
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
	protected static void jbInitDispRslt(MGBAP_MlySlsQtySrch p) {
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
		MGBAP_MlySlsQtySrch_MC.mcInitTop((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.mcInitFold((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.mcInitTab1((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.mcInitTab2((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.mcInitTab3((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.mcInitTab4((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.mcInitTab5((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.mcInitCnd((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.mcInitCnd2((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.mcInitCnd3((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.mcInitCnd4((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.mcInitTtl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.mcInitLPnl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.mcInitCtrl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.mcInitDispRslt((MGBAP_MlySlsQtySrch)this);

		// [SRCH]ステータスのモードの設定
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_Top((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_Fold((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_Tab1((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_Tab2((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_Tab3((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_Tab4((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_Tab5((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_Cnd((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_Cnd2((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_Cnd3((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_Cnd4((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_Ttl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_LPnl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_Ctrl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_DispRslt((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitSRCH_Rslt((MGBAP_MlySlsQtySrch)this);

		// [REF]ステータスのモードの設定
		MGBAP_MlySlsQtySrch_MC.statusInitREF_Top((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitREF_Fold((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitREF_Tab1((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitREF_Tab2((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitREF_Tab3((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitREF_Tab4((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitREF_Tab5((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitREF_Cnd((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitREF_Cnd2((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitREF_Cnd3((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitREF_Cnd4((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitREF_Ttl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitREF_LPnl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitREF_Ctrl((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitREF_DispRslt((MGBAP_MlySlsQtySrch)this);
		MGBAP_MlySlsQtySrch_MC.statusInitREF_Rslt((MGBAP_MlySlsQtySrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBAP_MlySlsQtySrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 *  [Tab5]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab5(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBAP_MlySlsQtySrch p) {
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
		p.Cnd_mng_dpt_cd.setListListener(p);
		p.Cnd_mng_dpt_cd.addAllListener(p);
		p.Cnd_mng_dpt_nm.setListListener(p);
		p.Cnd_mng_dpt_nm.addAllListener(p);
		p.Cnd_itm_jnl_cd.setListListener(p);
		p.Cnd_itm_jnl_cd.addAllListener(p);
		p.Cnd_itm_jnl_nm.setListListener(p);
		p.Cnd_itm_jnl_nm.addAllListener(p);
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
		p.Cnd_asst_typ.setListListener(p);
		p.Cnd_asst_typ.addAllListener(p);
		p.Cnd_asst_typ_nm.setListListener(p);
		p.Cnd_asst_typ_nm.addAllListener(p);
		p.Cnd_cst_cd.setListListener(p);
		p.Cnd_cst_cd.addAllListener(p);
		p.Cnd_cst_nm.setListListener(p);
		p.Cnd_cst_nm.addAllListener(p);
		p.Cnd_cst_cntry_cd.setListListener(p);
		p.Cnd_cst_cntry_cd.addAllListener(p);
		p.Cnd_cst_cntry_nm.setListListener(p);
		p.Cnd_cst_cntry_nm.addAllListener(p);
		p.Cnd_cst_area_cd.setListListener(p);
		p.Cnd_cst_area_cd.addAllListener(p);
		p.Cnd_cst_area_nm.setListListener(p);
		p.Cnd_cst_area_nm.addAllListener(p);
		p.Cnd_dlv_cd.setListListener(p);
		p.Cnd_dlv_cd.addAllListener(p);
		p.Cnd_dlv_nm.setListListener(p);
		p.Cnd_dlv_nm.addAllListener(p);
		p.Cnd_dlv_cntry_cd.setListListener(p);
		p.Cnd_dlv_cntry_cd.addAllListener(p);
		p.Cnd_dlv_cntry_nm.setListListener(p);
		p.Cnd_dlv_cntry_nm.addAllListener(p);
		p.Cnd_dlv_area_cd.setListListener(p);
		p.Cnd_dlv_area_cd.addAllListener(p);
		p.Cnd_dlv_area_nm.setListListener(p);
		p.Cnd_dlv_area_nm.addAllListener(p);
		p.Cnd_sls_dpt_cd.setListListener(p);
		p.Cnd_sls_dpt_cd.addAllListener(p);
		p.Cnd_sls_dpt_nm.setListListener(p);
		p.Cnd_sls_dpt_nm.addAllListener(p);
		p.Cnd_sls_usr_cd.setListListener(p);
		p.Cnd_sls_usr_cd.addAllListener(p);
		p.Cnd_sls_usr_nm.setListListener(p);
		p.Cnd_sls_usr_nm.addAllListener(p);
		p.Cnd_alc_dpt_cd.setListListener(p);
		p.Cnd_alc_dpt_cd.addAllListener(p);
		p.Cnd_alc_dpt_nm.setListListener(p);
		p.Cnd_alc_dpt_nm.addAllListener(p);
		p.Cnd_dest_cd1.setListListener(p);
		p.Cnd_dest_cd1.addAllListener(p);
		p.Cnd_dest_nm1.setListListener(p);
		p.Cnd_dest_nm1.addAllListener(p);
		p.Cnd_dest_cd2.setListListener(p);
		p.Cnd_dest_cd2.addAllListener(p);
		p.Cnd_dest_nm2.setListListener(p);
		p.Cnd_dest_nm2.addAllListener(p);
		p.Cnd_dest_cd3.setListListener(p);
		p.Cnd_dest_cd3.addAllListener(p);
		p.Cnd_dest_nm3.setListListener(p);
		p.Cnd_dest_nm3.addAllListener(p);
		p.Cnd_cost_sls_cd1.setListListener(p);
		p.Cnd_cost_sls_cd1.addAllListener(p);
		p.Cnd_cost_sls_nm1.setListListener(p);
		p.Cnd_cost_sls_nm1.addAllListener(p);
		p.Cnd_cost_sls_cd2.setListListener(p);
		p.Cnd_cost_sls_cd2.addAllListener(p);
		p.Cnd_cost_sls_nm2.setListListener(p);
		p.Cnd_cost_sls_nm2.addAllListener(p);
		p.Cnd_cost_sls_cd3.setListListener(p);
		p.Cnd_cost_sls_cd3.addAllListener(p);
		p.Cnd_cost_sls_nm3.setListListener(p);
		p.Cnd_cost_sls_nm3.addAllListener(p);
		p.Cnd_cost_sls_cd4.setListListener(p);
		p.Cnd_cost_sls_cd4.addAllListener(p);
		p.Cnd_cost_sls_nm4.setListListener(p);
		p.Cnd_cost_sls_nm4.addAllListener(p);
		p.Cnd_cost_sls_cd5.setListListener(p);
		p.Cnd_cost_sls_cd5.addAllListener(p);
		p.Cnd_cost_sls_nm5.setListListener(p);
		p.Cnd_cost_sls_nm5.addAllListener(p);
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
		p.Cnd_cst_grp_cd1.setListListener(p);
		p.Cnd_cst_grp_cd1.addAllListener(p);
		p.Cnd_cst_grp_nm1.setListListener(p);
		p.Cnd_cst_grp_nm1.addAllListener(p);
		p.Cnd_cst_grp_cd2.setListListener(p);
		p.Cnd_cst_grp_cd2.addAllListener(p);
		p.Cnd_cst_grp_nm2.setListListener(p);
		p.Cnd_cst_grp_nm2.addAllListener(p);
		p.Cnd_cst_grp_cd3.setListListener(p);
		p.Cnd_cst_grp_cd3.addAllListener(p);
		p.Cnd_cst_grp_nm3.setListListener(p);
		p.Cnd_cst_grp_nm3.addAllListener(p);
		p.Cnd_cst_grp_cd4.setListListener(p);
		p.Cnd_cst_grp_cd4.addAllListener(p);
		p.Cnd_cst_grp_nm4.setListListener(p);
		p.Cnd_cst_grp_nm4.addAllListener(p);
		p.Cnd_cst_grp_cd5.setListListener(p);
		p.Cnd_cst_grp_cd5.addAllListener(p);
		p.Cnd_cst_grp_nm5.setListListener(p);
		p.Cnd_cst_grp_nm5.addAllListener(p);
		p.Cnd_cst_grp_cd6.setListListener(p);
		p.Cnd_cst_grp_cd6.addAllListener(p);
		p.Cnd_cst_grp_nm6.setListListener(p);
		p.Cnd_cst_grp_nm6.addAllListener(p);
		p.Cnd_cst_grp_cd7.setListListener(p);
		p.Cnd_cst_grp_cd7.addAllListener(p);
		p.Cnd_cst_grp_nm7.setListListener(p);
		p.Cnd_cst_grp_nm7.addAllListener(p);
		p.Cnd_cst_grp_cd8.setListListener(p);
		p.Cnd_cst_grp_cd8.addAllListener(p);
		p.Cnd_cst_grp_nm8.setListListener(p);
		p.Cnd_cst_grp_nm8.addAllListener(p);
		p.Cnd_cst_grp_cd9.setListListener(p);
		p.Cnd_cst_grp_cd9.addAllListener(p);
		p.Cnd_cst_grp_nm9.setListListener(p);
		p.Cnd_cst_grp_nm9.addAllListener(p);
		p.Cnd_cst_grp_cd10.setListListener(p);
		p.Cnd_cst_grp_cd10.addAllListener(p);
		p.Cnd_cst_grp_nm10.setListListener(p);
		p.Cnd_cst_grp_nm10.addAllListener(p);
		p.Cnd_dlv_grp_cd1.setListListener(p);
		p.Cnd_dlv_grp_cd1.addAllListener(p);
		p.Cnd_dlv_grp_nm1.setListListener(p);
		p.Cnd_dlv_grp_nm1.addAllListener(p);
		p.Cnd_dlv_grp_cd2.setListListener(p);
		p.Cnd_dlv_grp_cd2.addAllListener(p);
		p.Cnd_dlv_grp_nm2.setListListener(p);
		p.Cnd_dlv_grp_nm2.addAllListener(p);
		p.Cnd_dlv_grp_cd3.setListListener(p);
		p.Cnd_dlv_grp_cd3.addAllListener(p);
		p.Cnd_dlv_grp_nm3.setListListener(p);
		p.Cnd_dlv_grp_nm3.addAllListener(p);
		p.Cnd_dlv_grp_cd4.setListListener(p);
		p.Cnd_dlv_grp_cd4.addAllListener(p);
		p.Cnd_dlv_grp_nm4.setListListener(p);
		p.Cnd_dlv_grp_nm4.addAllListener(p);
		p.Cnd_dlv_grp_cd5.setListListener(p);
		p.Cnd_dlv_grp_cd5.addAllListener(p);
		p.Cnd_dlv_grp_nm5.setListListener(p);
		p.Cnd_dlv_grp_nm5.addAllListener(p);
		p.Cnd_dlv_grp_cd6.setListListener(p);
		p.Cnd_dlv_grp_cd6.addAllListener(p);
		p.Cnd_dlv_grp_nm6.setListListener(p);
		p.Cnd_dlv_grp_nm6.addAllListener(p);
		p.Cnd_dlv_grp_cd7.setListListener(p);
		p.Cnd_dlv_grp_cd7.addAllListener(p);
		p.Cnd_dlv_grp_nm7.setListListener(p);
		p.Cnd_dlv_grp_nm7.addAllListener(p);
		p.Cnd_dlv_grp_cd8.setListListener(p);
		p.Cnd_dlv_grp_cd8.addAllListener(p);
		p.Cnd_dlv_grp_nm8.setListListener(p);
		p.Cnd_dlv_grp_nm8.addAllListener(p);
		p.Cnd_dlv_grp_cd9.setListListener(p);
		p.Cnd_dlv_grp_cd9.addAllListener(p);
		p.Cnd_dlv_grp_nm9.setListListener(p);
		p.Cnd_dlv_grp_nm9.addAllListener(p);
		p.Cnd_dlv_grp_cd10.setListListener(p);
		p.Cnd_dlv_grp_cd10.addAllListener(p);
		p.Cnd_dlv_grp_nm10.setListListener(p);
		p.Cnd_dlv_grp_nm10.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_mng_dpt_flg.addAllListener(p);
		p.Cnd_itm_flg.addAllListener(p);
		p.Cnd_itm_typ_flg.addAllListener(p);
		p.Cnd_itm_typ_d_flg.addAllListener(p);
		p.Cnd_itm_jnl_flg.addAllListener(p);
		p.Cnd_lot_flg.addAllListener(p);
		p.Cnd_sublot_flg.addAllListener(p);
		p.Cnd_sno1_flg.addAllListener(p);
		p.Cnd_sno2_flg.addAllListener(p);
		p.Cnd_sno3_flg.addAllListener(p);
		p.Cnd_sno4_flg.addAllListener(p);
		p.Cnd_cst_flg.addAllListener(p);
		p.Cnd_cst_cntry_flg.addAllListener(p);
		p.Cnd_cst_area_flg.addAllListener(p);
		p.Cnd_dlv_flg.addAllListener(p);
		p.Cnd_dlv_cntry_flg.addAllListener(p);
		p.Cnd_dlv_area_flg.addAllListener(p);
		p.Cnd_sls_dpt_flg.addAllListener(p);
		p.Cnd_sls_usr_flg.addAllListener(p);
		p.Cnd_alc_dpt_flg.addAllListener(p);
		p.Cnd_dest1_flg.addAllListener(p);
		p.Cnd_dest2_flg.addAllListener(p);
		p.Cnd_dest3_flg.addAllListener(p);
		p.Cnd_cost_sls1_flg.addAllListener(p);
		p.Cnd_cost_sls2_flg.addAllListener(p);
		p.Cnd_cost_sls3_flg.addAllListener(p);
		p.Cnd_cost_sls4_flg.addAllListener(p);
		p.Cnd_cost_sls5_flg.addAllListener(p);
		p.Cnd_asst_flg.addAllListener(p);
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
		p.Cnd_cst_grp_flg1.addAllListener(p);
		p.Cnd_cst_grp_flg2.addAllListener(p);
		p.Cnd_cst_grp_flg3.addAllListener(p);
		p.Cnd_cst_grp_flg4.addAllListener(p);
		p.Cnd_cst_grp_flg5.addAllListener(p);
		p.Cnd_cst_grp_flg6.addAllListener(p);
		p.Cnd_cst_grp_flg7.addAllListener(p);
		p.Cnd_cst_grp_flg8.addAllListener(p);
		p.Cnd_cst_grp_flg9.addAllListener(p);
		p.Cnd_cst_grp_flg10.addAllListener(p);
		p.Cnd_dlv_grp_flg1.addAllListener(p);
		p.Cnd_dlv_grp_flg2.addAllListener(p);
		p.Cnd_dlv_grp_flg3.addAllListener(p);
		p.Cnd_dlv_grp_flg4.addAllListener(p);
		p.Cnd_dlv_grp_flg5.addAllListener(p);
		p.Cnd_dlv_grp_flg6.addAllListener(p);
		p.Cnd_dlv_grp_flg7.addAllListener(p);
		p.Cnd_dlv_grp_flg8.addAllListener(p);
		p.Cnd_dlv_grp_flg9.addAllListener(p);
		p.Cnd_dlv_grp_flg10.addAllListener(p);
		p.Cnd_select_all.addAllListener(p);
		p.Cnd_select_all.setAPMethodName("doCnd_select_all");
		p.Cnd_deselect_all.addAllListener(p);
		p.Cnd_deselect_all.setAPMethodName("doCnd_deselect_all");
		p.Cnd_disp_key.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 *  [Cnd4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd4(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 *  [Ttl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTtl(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MGBAP_MlySlsQtySrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBAP_MlySlsQtySrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispRslt(MGBAP_MlySlsQtySrch p) {
		p.DispRsltTable.addAllListener(p);
		p.columnDispRslt_wg_cd.addAllListener(p);
		p.columnDispRslt_wg_cd.setListListener(p);
		p.columnDispRslt_wg_nm.addAllListener(p);
		p.columnDispRslt_wg_nm.setListListener(p);
		p.columnDispRslt_mng_dpt_cd.addAllListener(p);
		p.columnDispRslt_mng_dpt_cd.setListListener(p);
		p.columnDispRslt_mng_dpt_nm.addAllListener(p);
		p.columnDispRslt_mng_dpt_nm.setListListener(p);
		p.columnDispRslt_itm_typ.addAllListener(p);
		p.columnDispRslt_itm_typ.setListListener(p);
		p.columnDispRslt_itm_typ_nm.addAllListener(p);
		p.columnDispRslt_itm_typ_nm.setListListener(p);
		p.columnDispRslt_itm_typ_d_cd.addAllListener(p);
		p.columnDispRslt_itm_typ_d_cd.setListListener(p);
		p.columnDispRslt_itm_typ_d_nm.addAllListener(p);
		p.columnDispRslt_itm_typ_d_nm.setListListener(p);
		p.columnDispRslt_itm_jnl_cd.addAllListener(p);
		p.columnDispRslt_itm_jnl_cd.setListListener(p);
		p.columnDispRslt_itm_jnl_nm.addAllListener(p);
		p.columnDispRslt_itm_jnl_nm.setListListener(p);
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
		p.columnDispRslt_cst_cd.addAllListener(p);
		p.columnDispRslt_cst_cd.setListListener(p);
		p.columnDispRslt_cst_nm.addAllListener(p);
		p.columnDispRslt_cst_nm.setListListener(p);
		p.columnDispRslt_cst_grp_cd1.addAllListener(p);
		p.columnDispRslt_cst_grp_cd1.setListListener(p);
		p.columnDispRslt_cst_grp_nm1.addAllListener(p);
		p.columnDispRslt_cst_grp_nm1.setListListener(p);
		p.columnDispRslt_cst_grp_cd2.addAllListener(p);
		p.columnDispRslt_cst_grp_cd2.setListListener(p);
		p.columnDispRslt_cst_grp_nm2.addAllListener(p);
		p.columnDispRslt_cst_grp_nm2.setListListener(p);
		p.columnDispRslt_cst_grp_cd3.addAllListener(p);
		p.columnDispRslt_cst_grp_cd3.setListListener(p);
		p.columnDispRslt_cst_grp_nm3.addAllListener(p);
		p.columnDispRslt_cst_grp_nm3.setListListener(p);
		p.columnDispRslt_cst_grp_cd4.addAllListener(p);
		p.columnDispRslt_cst_grp_cd4.setListListener(p);
		p.columnDispRslt_cst_grp_nm4.addAllListener(p);
		p.columnDispRslt_cst_grp_nm4.setListListener(p);
		p.columnDispRslt_cst_grp_cd5.addAllListener(p);
		p.columnDispRslt_cst_grp_cd5.setListListener(p);
		p.columnDispRslt_cst_grp_nm5.addAllListener(p);
		p.columnDispRslt_cst_grp_nm5.setListListener(p);
		p.columnDispRslt_cst_grp_cd6.addAllListener(p);
		p.columnDispRslt_cst_grp_cd6.setListListener(p);
		p.columnDispRslt_cst_grp_nm6.addAllListener(p);
		p.columnDispRslt_cst_grp_nm6.setListListener(p);
		p.columnDispRslt_cst_grp_cd7.addAllListener(p);
		p.columnDispRslt_cst_grp_cd7.setListListener(p);
		p.columnDispRslt_cst_grp_nm7.addAllListener(p);
		p.columnDispRslt_cst_grp_nm7.setListListener(p);
		p.columnDispRslt_cst_grp_cd8.addAllListener(p);
		p.columnDispRslt_cst_grp_cd8.setListListener(p);
		p.columnDispRslt_cst_grp_nm8.addAllListener(p);
		p.columnDispRslt_cst_grp_nm8.setListListener(p);
		p.columnDispRslt_cst_grp_cd9.addAllListener(p);
		p.columnDispRslt_cst_grp_cd9.setListListener(p);
		p.columnDispRslt_cst_grp_nm9.addAllListener(p);
		p.columnDispRslt_cst_grp_nm9.setListListener(p);
		p.columnDispRslt_cst_grp_cd10.addAllListener(p);
		p.columnDispRslt_cst_grp_cd10.setListListener(p);
		p.columnDispRslt_cst_grp_nm10.addAllListener(p);
		p.columnDispRslt_cst_grp_nm10.setListListener(p);
		p.columnDispRslt_cst_cntry_cd.addAllListener(p);
		p.columnDispRslt_cst_cntry_cd.setListListener(p);
		p.columnDispRslt_cst_cntry_nm.addAllListener(p);
		p.columnDispRslt_cst_cntry_nm.setListListener(p);
		p.columnDispRslt_cst_area_cd.addAllListener(p);
		p.columnDispRslt_cst_area_cd.setListListener(p);
		p.columnDispRslt_cst_area_nm.addAllListener(p);
		p.columnDispRslt_cst_area_nm.setListListener(p);
		p.columnDispRslt_dlv_cd.addAllListener(p);
		p.columnDispRslt_dlv_cd.setListListener(p);
		p.columnDispRslt_dlv_nm.addAllListener(p);
		p.columnDispRslt_dlv_nm.setListListener(p);
		p.columnDispRslt_dlv_grp_cd1.addAllListener(p);
		p.columnDispRslt_dlv_grp_cd1.setListListener(p);
		p.columnDispRslt_dlv_grp_nm1.addAllListener(p);
		p.columnDispRslt_dlv_grp_nm1.setListListener(p);
		p.columnDispRslt_dlv_grp_cd2.addAllListener(p);
		p.columnDispRslt_dlv_grp_cd2.setListListener(p);
		p.columnDispRslt_dlv_grp_nm2.addAllListener(p);
		p.columnDispRslt_dlv_grp_nm2.setListListener(p);
		p.columnDispRslt_dlv_grp_cd3.addAllListener(p);
		p.columnDispRslt_dlv_grp_cd3.setListListener(p);
		p.columnDispRslt_dlv_grp_nm3.addAllListener(p);
		p.columnDispRslt_dlv_grp_nm3.setListListener(p);
		p.columnDispRslt_dlv_grp_cd4.addAllListener(p);
		p.columnDispRslt_dlv_grp_cd4.setListListener(p);
		p.columnDispRslt_dlv_grp_nm4.addAllListener(p);
		p.columnDispRslt_dlv_grp_nm4.setListListener(p);
		p.columnDispRslt_dlv_grp_cd5.addAllListener(p);
		p.columnDispRslt_dlv_grp_cd5.setListListener(p);
		p.columnDispRslt_dlv_grp_nm5.addAllListener(p);
		p.columnDispRslt_dlv_grp_nm5.setListListener(p);
		p.columnDispRslt_dlv_grp_cd6.addAllListener(p);
		p.columnDispRslt_dlv_grp_cd6.setListListener(p);
		p.columnDispRslt_dlv_grp_nm6.addAllListener(p);
		p.columnDispRslt_dlv_grp_nm6.setListListener(p);
		p.columnDispRslt_dlv_grp_cd7.addAllListener(p);
		p.columnDispRslt_dlv_grp_cd7.setListListener(p);
		p.columnDispRslt_dlv_grp_nm7.addAllListener(p);
		p.columnDispRslt_dlv_grp_nm7.setListListener(p);
		p.columnDispRslt_dlv_grp_cd8.addAllListener(p);
		p.columnDispRslt_dlv_grp_cd8.setListListener(p);
		p.columnDispRslt_dlv_grp_nm8.addAllListener(p);
		p.columnDispRslt_dlv_grp_nm8.setListListener(p);
		p.columnDispRslt_dlv_grp_cd9.addAllListener(p);
		p.columnDispRslt_dlv_grp_cd9.setListListener(p);
		p.columnDispRslt_dlv_grp_nm9.addAllListener(p);
		p.columnDispRslt_dlv_grp_nm9.setListListener(p);
		p.columnDispRslt_dlv_grp_cd10.addAllListener(p);
		p.columnDispRslt_dlv_grp_cd10.setListListener(p);
		p.columnDispRslt_dlv_grp_nm10.addAllListener(p);
		p.columnDispRslt_dlv_grp_nm10.setListListener(p);
		p.columnDispRslt_dlv_cntry_cd.addAllListener(p);
		p.columnDispRslt_dlv_cntry_cd.setListListener(p);
		p.columnDispRslt_dlv_cntry_nm.addAllListener(p);
		p.columnDispRslt_dlv_cntry_nm.setListListener(p);
		p.columnDispRslt_dlv_area_cd.addAllListener(p);
		p.columnDispRslt_dlv_area_cd.setListListener(p);
		p.columnDispRslt_dlv_area_nm.addAllListener(p);
		p.columnDispRslt_dlv_area_nm.setListListener(p);
		p.columnDispRslt_sls_dpt_cd.addAllListener(p);
		p.columnDispRslt_sls_dpt_cd.setListListener(p);
		p.columnDispRslt_sls_dpt_nm.addAllListener(p);
		p.columnDispRslt_sls_dpt_nm.setListListener(p);
		p.columnDispRslt_sls_usr_cd.addAllListener(p);
		p.columnDispRslt_sls_usr_cd.setListListener(p);
		p.columnDispRslt_sls_usr_nm.addAllListener(p);
		p.columnDispRslt_sls_usr_nm.setListListener(p);
		p.columnDispRslt_alc_dpt_cd.addAllListener(p);
		p.columnDispRslt_alc_dpt_cd.setListListener(p);
		p.columnDispRslt_alc_dpt_nm.addAllListener(p);
		p.columnDispRslt_alc_dpt_nm.setListListener(p);
		p.columnDispRslt_dest_cd1.addAllListener(p);
		p.columnDispRslt_dest_cd1.setListListener(p);
		p.columnDispRslt_dest_nm1.addAllListener(p);
		p.columnDispRslt_dest_nm1.setListListener(p);
		p.columnDispRslt_dest_cd2.addAllListener(p);
		p.columnDispRslt_dest_cd2.setListListener(p);
		p.columnDispRslt_dest_nm2.addAllListener(p);
		p.columnDispRslt_dest_nm2.setListListener(p);
		p.columnDispRslt_dest_cd3.addAllListener(p);
		p.columnDispRslt_dest_cd3.setListListener(p);
		p.columnDispRslt_dest_nm3.addAllListener(p);
		p.columnDispRslt_dest_nm3.setListListener(p);
		p.columnDispRslt_cost_sls_cd1.addAllListener(p);
		p.columnDispRslt_cost_sls_cd1.setListListener(p);
		p.columnDispRslt_cost_sls_nm1.addAllListener(p);
		p.columnDispRslt_cost_sls_nm1.setListListener(p);
		p.columnDispRslt_cost_sls_cd2.addAllListener(p);
		p.columnDispRslt_cost_sls_cd2.setListListener(p);
		p.columnDispRslt_cost_sls_nm2.addAllListener(p);
		p.columnDispRslt_cost_sls_nm2.setListListener(p);
		p.columnDispRslt_cost_sls_cd3.addAllListener(p);
		p.columnDispRslt_cost_sls_cd3.setListListener(p);
		p.columnDispRslt_cost_sls_nm3.addAllListener(p);
		p.columnDispRslt_cost_sls_nm3.setListListener(p);
		p.columnDispRslt_cost_sls_cd4.addAllListener(p);
		p.columnDispRslt_cost_sls_cd4.setListListener(p);
		p.columnDispRslt_cost_sls_nm4.addAllListener(p);
		p.columnDispRslt_cost_sls_nm4.setListListener(p);
		p.columnDispRslt_cost_sls_cd5.addAllListener(p);
		p.columnDispRslt_cost_sls_cd5.setListListener(p);
		p.columnDispRslt_cost_sls_nm5.addAllListener(p);
		p.columnDispRslt_cost_sls_nm5.setListListener(p);
		p.columnDispRslt_asst_typ.addAllListener(p);
		p.columnDispRslt_asst_typ.setListListener(p);
		p.columnDispRslt_asst_typ_nm.addAllListener(p);
		p.columnDispRslt_asst_typ_nm.setListListener(p);
		p.columnDispRslt_unit_cd.addAllListener(p);
		p.columnDispRslt_unit_cd.setListListener(p);
		p.columnDispRslt_unit_nm.addAllListener(p);
		p.columnDispRslt_unit_nm.setListListener(p);
		p.columnDispRslt_dec_place.addAllListener(p);
		p.columnDispRslt_dec_place.setListListener(p);
		p.columnDispRslt_elm_no.addAllListener(p);
		p.columnDispRslt_elm_no.setListListener(p);
		p.columnDispRslt_elm.addAllListener(p);
		p.columnDispRslt_elm.setListListener(p);
		p.columnDispRslt_elm_nm.addAllListener(p);
		p.columnDispRslt_elm_nm.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab4(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab5(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBAP_MlySlsQtySrch p){
		p.Cnd_pln_calc_ctg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_act_calc_ctg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_cntry_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_cntry_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_area_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_area_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_cntry_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_cntry_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_area_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_area_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cost_sls_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cost_sls_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cost_sls_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cost_sls_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cost_sls_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cost_sls_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cost_sls_cd4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cost_sls_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cost_sls_cd5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cost_sls_nm5.putMode(p, SRCH, MCMode.ENABLE);
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
		p.Cnd_cst_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_cd4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_cd5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_nm5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_cd6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_nm6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_cd7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_nm7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_cd8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_nm8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_cd9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_nm9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_cd10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_grp_nm10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_mng_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_typ_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_typ_d_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_jnl_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_lot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sublot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno1_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno2_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno3_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno4_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_cntry_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_area_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_cntry_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_area_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sls_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sls_usr_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_alc_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dest1_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dest2_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dest3_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cost_sls1_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cost_sls2_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cost_sls3_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cost_sls4_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cost_sls5_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_asst_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg1.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg2.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg3.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg4.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg5.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg6.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg7.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg8.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg9.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg10.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg1.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg2.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg3.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg4.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg5.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg6.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg7.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg8.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg9.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg10.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg1.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg2.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg3.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg4.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg5.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg6.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg7.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg8.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg9.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg10.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd4(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ttl(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DispRslt(MGBAP_MlySlsQtySrch p){
		p.columnDispRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDispRslt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_jnl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_itm_jnl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.columnDispRslt_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_area_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cst_area_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_area_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_area_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sls_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sls_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sls_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sls_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_alc_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_alc_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispRslt_elm_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispRslt_elm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispRslt_elm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_00_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_01_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_02_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_03_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_04_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_05_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_06_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_07_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_08_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_09_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_10_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_11_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_ttl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [REF]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab5(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBAP_MlySlsQtySrch p){
		p.Cnd_pln_calc_ctg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_act_calc_ctg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_cst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_cntry_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_cntry_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_area_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_area_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_cntry_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_cntry_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_area_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_area_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cost_sls_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cost_sls_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cost_sls_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cost_sls_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cost_sls_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cost_sls_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cost_sls_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cost_sls_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cost_sls_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cost_sls_nm5.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_cst_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mng_dpt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_typ_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_typ_d_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_jnl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_lot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sublot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno1_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno2_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno3_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno4_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_cntry_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_area_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_cntry_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_area_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sls_dpt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sls_usr_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_alc_dpt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dest1_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dest2_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dest3_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cost_sls1_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cost_sls2_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cost_sls3_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cost_sls4_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cost_sls5_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_asst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg1.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg2.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg3.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg4.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg5.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg6.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg7.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg8.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg9.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_grp_flg10.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg1.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg2.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg3.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg4.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg5.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg6.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg7.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg8.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg9.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_grp_flg10.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg1.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg2.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg3.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg4.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg5.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg6.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg7.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg8.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg9.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_grp_flg10.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [REF]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd4(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [REF]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ttl(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBAP_MlySlsQtySrch p){

	}

	/**
	 * [REF]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispRslt(MGBAP_MlySlsQtySrch p){
		p.columnDispRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDispRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnDispRslt_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_grp_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_area_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cst_area_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_grp_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_area_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dlv_area_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sls_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sls_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sls_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sls_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_alc_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_alc_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dest_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dest_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dest_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dest_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dest_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dest_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cost_sls_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispRslt_elm_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispRslt_elm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispRslt_elm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_00_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_01_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_02_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_03_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_04_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_05_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_06_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_07_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_08_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_09_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_10_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_11_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_ttl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBAP_MlySlsQtySrch p){

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
		MGBAP_MlySlsQtySrch_MC.setTableConfigDispRslt((MGBAP_MlySlsQtySrch)this);
	}

	/**
	 * [DispRslt]ブロックのTableの設定
	 */
	protected static void setTableConfigDispRslt(MGBAP_MlySlsQtySrch p) {
		p.columnDispRslt_wg_cd.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.wg_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_cd);
		p.columnDispRslt_wg_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.wg_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_nm);
		p.columnDispRslt_mng_dpt_cd.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.mng_dpt_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_cd);
		p.columnDispRslt_mng_dpt_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.mng_dpt_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_nm);
		p.DispRsltTable.addTable(p.DispRslt_itm_p_PPanel.ItmTable);
		p.columnDispRslt_itm_typ.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ);
		p.columnDispRslt_itm_typ_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_nm);
		p.columnDispRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_typ_d_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_cd);
		p.columnDispRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_typ_d_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_nm);
		p.columnDispRslt_itm_jnl_cd.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_jnl_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_jnl_cd);
		p.columnDispRslt_itm_jnl_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_jnl_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_jnl_nm);
		p.columnDispRslt_itm_grp_cd1.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_cd1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd1);
		p.columnDispRslt_itm_grp_nm1.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_nm1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm1);
		p.columnDispRslt_itm_grp_cd2.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_cd2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd2);
		p.columnDispRslt_itm_grp_nm2.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_nm2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm2);
		p.columnDispRslt_itm_grp_cd3.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_cd3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd3);
		p.columnDispRslt_itm_grp_nm3.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_nm3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm3);
		p.columnDispRslt_itm_grp_cd4.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_cd4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd4);
		p.columnDispRslt_itm_grp_nm4.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_nm4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm4);
		p.columnDispRslt_itm_grp_cd5.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_cd5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd5);
		p.columnDispRslt_itm_grp_nm5.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_nm5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm5);
		p.columnDispRslt_itm_grp_cd6.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_cd6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd6);
		p.columnDispRslt_itm_grp_nm6.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_nm6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm6);
		p.columnDispRslt_itm_grp_cd7.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_cd7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd7);
		p.columnDispRslt_itm_grp_nm7.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_nm7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm7);
		p.columnDispRslt_itm_grp_cd8.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_cd8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd8);
		p.columnDispRslt_itm_grp_nm8.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_nm8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm8);
		p.columnDispRslt_itm_grp_cd9.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_cd9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd9);
		p.columnDispRslt_itm_grp_nm9.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_nm9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm9);
		p.columnDispRslt_itm_grp_cd10.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_cd10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd10);
		p.columnDispRslt_itm_grp_nm10.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.itm_grp_nm10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm10);
		p.columnDispRslt_lot_no.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.lot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_lot_no);
		p.columnDispRslt_sublot_no.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.sublot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sublot_no);
		p.columnDispRslt_sno1.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.sno1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno1);
		p.columnDispRslt_sno2.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.sno2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno2);
		p.columnDispRslt_sno3.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.sno3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno3);
		p.columnDispRslt_sno4.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.sno4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno4);
		p.columnDispRslt_cst_cd.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_cd);
		p.columnDispRslt_cst_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_nm);
		p.columnDispRslt_cst_grp_cd1.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_cd1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_cd1);
		p.columnDispRslt_cst_grp_nm1.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_nm1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_nm1);
		p.columnDispRslt_cst_grp_cd2.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_cd2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_cd2);
		p.columnDispRslt_cst_grp_nm2.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_nm2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_nm2);
		p.columnDispRslt_cst_grp_cd3.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_cd3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_cd3);
		p.columnDispRslt_cst_grp_nm3.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_nm3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_nm3);
		p.columnDispRslt_cst_grp_cd4.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_cd4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_cd4);
		p.columnDispRslt_cst_grp_nm4.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_nm4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_nm4);
		p.columnDispRslt_cst_grp_cd5.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_cd5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_cd5);
		p.columnDispRslt_cst_grp_nm5.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_nm5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_nm5);
		p.columnDispRslt_cst_grp_cd6.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_cd6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_cd6);
		p.columnDispRslt_cst_grp_nm6.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_nm6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_nm6);
		p.columnDispRslt_cst_grp_cd7.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_cd7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_cd7);
		p.columnDispRslt_cst_grp_nm7.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_nm7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_nm7);
		p.columnDispRslt_cst_grp_cd8.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_cd8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_cd8);
		p.columnDispRslt_cst_grp_nm8.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_nm8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_nm8);
		p.columnDispRslt_cst_grp_cd9.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_cd9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_cd9);
		p.columnDispRslt_cst_grp_nm9.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_nm9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_nm9);
		p.columnDispRslt_cst_grp_cd10.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_cd10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_cd10);
		p.columnDispRslt_cst_grp_nm10.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_grp_nm10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_grp_nm10);
		p.columnDispRslt_cst_cntry_cd.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_cntry_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_cntry_cd);
		p.columnDispRslt_cst_cntry_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_cntry_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_cntry_nm);
		p.columnDispRslt_cst_area_cd.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_area_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_area_cd);
		p.columnDispRslt_cst_area_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cst_area_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cst_area_nm);
		p.columnDispRslt_dlv_cd.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_cd);
		p.columnDispRslt_dlv_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_nm);
		p.columnDispRslt_dlv_grp_cd1.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_cd1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_cd1);
		p.columnDispRslt_dlv_grp_nm1.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_nm1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_nm1);
		p.columnDispRslt_dlv_grp_cd2.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_cd2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_cd2);
		p.columnDispRslt_dlv_grp_nm2.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_nm2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_nm2);
		p.columnDispRslt_dlv_grp_cd3.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_cd3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_cd3);
		p.columnDispRslt_dlv_grp_nm3.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_nm3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_nm3);
		p.columnDispRslt_dlv_grp_cd4.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_cd4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_cd4);
		p.columnDispRslt_dlv_grp_nm4.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_nm4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_nm4);
		p.columnDispRslt_dlv_grp_cd5.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_cd5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_cd5);
		p.columnDispRslt_dlv_grp_nm5.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_nm5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_nm5);
		p.columnDispRslt_dlv_grp_cd6.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_cd6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_cd6);
		p.columnDispRslt_dlv_grp_nm6.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_nm6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_nm6);
		p.columnDispRslt_dlv_grp_cd7.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_cd7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_cd7);
		p.columnDispRslt_dlv_grp_nm7.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_nm7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_nm7);
		p.columnDispRslt_dlv_grp_cd8.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_cd8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_cd8);
		p.columnDispRslt_dlv_grp_nm8.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_nm8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_nm8);
		p.columnDispRslt_dlv_grp_cd9.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_cd9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_cd9);
		p.columnDispRslt_dlv_grp_nm9.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_nm9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_nm9);
		p.columnDispRslt_dlv_grp_cd10.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_cd10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_cd10);
		p.columnDispRslt_dlv_grp_nm10.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_grp_nm10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_grp_nm10);
		p.columnDispRslt_dlv_cntry_cd.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_cntry_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_cntry_cd);
		p.columnDispRslt_dlv_cntry_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_cntry_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_cntry_nm);
		p.columnDispRslt_dlv_area_cd.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_area_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_area_cd);
		p.columnDispRslt_dlv_area_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dlv_area_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dlv_area_nm);
		p.columnDispRslt_sls_dpt_cd.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.sls_dpt_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sls_dpt_cd);
		p.columnDispRslt_sls_dpt_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.sls_dpt_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sls_dpt_nm);
		p.columnDispRslt_sls_usr_cd.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.sls_usr_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sls_usr_cd);
		p.columnDispRslt_sls_usr_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.sls_usr_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sls_usr_nm);
		p.columnDispRslt_alc_dpt_cd.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.alc_dpt_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_alc_dpt_cd);
		p.columnDispRslt_alc_dpt_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.alc_dpt_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_alc_dpt_nm);
		p.columnDispRslt_dest_cd1.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dest_cd1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dest_cd1);
		p.columnDispRslt_dest_nm1.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dest_nm1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dest_nm1);
		p.columnDispRslt_dest_cd2.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dest_cd2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dest_cd2);
		p.columnDispRslt_dest_nm2.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dest_nm2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dest_nm2);
		p.columnDispRslt_dest_cd3.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dest_cd3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dest_cd3);
		p.columnDispRslt_dest_nm3.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dest_nm3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dest_nm3);
		p.columnDispRslt_cost_sls_cd1.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cost_sls_cd1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cost_sls_cd1);
		p.columnDispRslt_cost_sls_nm1.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cost_sls_nm1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cost_sls_nm1);
		p.columnDispRslt_cost_sls_cd2.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cost_sls_cd2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cost_sls_cd2);
		p.columnDispRslt_cost_sls_nm2.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cost_sls_nm2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cost_sls_nm2);
		p.columnDispRslt_cost_sls_cd3.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cost_sls_cd3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cost_sls_cd3);
		p.columnDispRslt_cost_sls_nm3.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cost_sls_nm3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cost_sls_nm3);
		p.columnDispRslt_cost_sls_cd4.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cost_sls_cd4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cost_sls_cd4);
		p.columnDispRslt_cost_sls_nm4.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cost_sls_nm4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cost_sls_nm4);
		p.columnDispRslt_cost_sls_cd5.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cost_sls_cd5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cost_sls_cd5);
		p.columnDispRslt_cost_sls_nm5.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.cost_sls_nm5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cost_sls_nm5);
		p.columnDispRslt_asst_typ.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.asst_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_asst_typ);
		p.columnDispRslt_asst_typ_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.asst_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_asst_typ_nm);
		p.columnDispRslt_unit_cd.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.unit_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_unit_cd);
		p.columnDispRslt_unit_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.unit_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_unit_nm);
		p.columnDispRslt_dec_place.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.dec_place_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dec_place);
		p.columnDispRslt_elm_no.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.elm_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm_no);
		p.columnDispRslt_elm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.elm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm);
		p.columnDispRslt_elm_nm.setMeta(mcframe.clientMGBA.MGBAP0100.DispRsltR.elm_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm_nm);
		p.DispRsltTable.addTable(p.DispRslt_qty_00_p_PPanel.QtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_01_p_PPanel.QtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_02_p_PPanel.QtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_03_p_PPanel.QtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_04_p_PPanel.QtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_05_p_PPanel.QtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_06_p_PPanel.QtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_07_p_PPanel.QtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_08_p_PPanel.QtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_09_p_PPanel.QtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_10_p_PPanel.QtyTable);
		p.DispRsltTable.addTable(p.DispRslt_qty_11_p_PPanel.QtyTable);
		p.DispRsltTable.addTable(p.DispRslt_ttl_qty_p_PPanel.QtyTable);
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
		Cnd_mng_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mng_dpt_cd.getListConfig().setPutter(getCnd_mng_dpt_cd_ListPutter());
		Cnd_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_jnl_cd.getListConfig().setPutter(getCnd_itm_jnl_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_asst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_asst_typ.getListConfig().setPutter(getCnd_asst_typ_ListPutter());
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_cst_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_cntry_cd.getListConfig().setPutter(getCnd_cst_cntry_cd_ListPutter());
		Cnd_cst_area_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_area_cd.getListConfig().setPutter(getCnd_cst_area_cd_ListPutter());
		Cnd_dlv_cd.getListConfig().setPutter(getCnd_dlv_cd_ListPutter());
		Cnd_dlv_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_cntry_cd.getListConfig().setPutter(getCnd_dlv_cntry_cd_ListPutter());
		Cnd_dlv_area_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_area_cd.getListConfig().setPutter(getCnd_dlv_area_cd_ListPutter());
		Cnd_sls_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sls_dpt_cd.getListConfig().setPutter(getCnd_sls_dpt_cd_ListPutter());
		Cnd_sls_usr_cd.getListConfig().setPutter(getCnd_sls_usr_cd_ListPutter());
		Cnd_alc_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_dpt_cd.getListConfig().setPutter(getCnd_alc_dpt_cd_ListPutter());
		Cnd_dest_cd1.getListConfig().setPutter(getCnd_dest_cd1_ListPutter());
		Cnd_dest_cd2.getListConfig().setPutter(getCnd_dest_cd2_ListPutter());
		Cnd_dest_cd3.getListConfig().setPutter(getCnd_dest_cd3_ListPutter());
		Cnd_cost_sls_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cost_sls_cd1.getListConfig().setPutter(getCnd_cost_sls_cd1_ListPutter());
		Cnd_cost_sls_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cost_sls_cd2.getListConfig().setPutter(getCnd_cost_sls_cd2_ListPutter());
		Cnd_cost_sls_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cost_sls_cd3.getListConfig().setPutter(getCnd_cost_sls_cd3_ListPutter());
		Cnd_cost_sls_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cost_sls_cd4.getListConfig().setPutter(getCnd_cost_sls_cd4_ListPutter());
		Cnd_cost_sls_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cost_sls_cd5.getListConfig().setPutter(getCnd_cost_sls_cd5_ListPutter());
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
		Cnd_cst_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd1.getListConfig().setPutter(getCnd_cst_grp_cd1_ListPutter());
		Cnd_cst_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd2.getListConfig().setPutter(getCnd_cst_grp_cd2_ListPutter());
		Cnd_cst_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd3.getListConfig().setPutter(getCnd_cst_grp_cd3_ListPutter());
		Cnd_cst_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd4.getListConfig().setPutter(getCnd_cst_grp_cd4_ListPutter());
		Cnd_cst_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd5.getListConfig().setPutter(getCnd_cst_grp_cd5_ListPutter());
		Cnd_cst_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd6.getListConfig().setPutter(getCnd_cst_grp_cd6_ListPutter());
		Cnd_cst_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd7.getListConfig().setPutter(getCnd_cst_grp_cd7_ListPutter());
		Cnd_cst_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd8.getListConfig().setPutter(getCnd_cst_grp_cd8_ListPutter());
		Cnd_cst_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd9.getListConfig().setPutter(getCnd_cst_grp_cd9_ListPutter());
		Cnd_cst_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd10.getListConfig().setPutter(getCnd_cst_grp_cd10_ListPutter());
		Cnd_dlv_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd1.getListConfig().setPutter(getCnd_dlv_grp_cd1_ListPutter());
		Cnd_dlv_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd2.getListConfig().setPutter(getCnd_dlv_grp_cd2_ListPutter());
		Cnd_dlv_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd3.getListConfig().setPutter(getCnd_dlv_grp_cd3_ListPutter());
		Cnd_dlv_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd4.getListConfig().setPutter(getCnd_dlv_grp_cd4_ListPutter());
		Cnd_dlv_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd5.getListConfig().setPutter(getCnd_dlv_grp_cd5_ListPutter());
		Cnd_dlv_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd6.getListConfig().setPutter(getCnd_dlv_grp_cd6_ListPutter());
		Cnd_dlv_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd7.getListConfig().setPutter(getCnd_dlv_grp_cd7_ListPutter());
		Cnd_dlv_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd8.getListConfig().setPutter(getCnd_dlv_grp_cd8_ListPutter());
		Cnd_dlv_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd9.getListConfig().setPutter(getCnd_dlv_grp_cd9_ListPutter());
		Cnd_dlv_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd10.getListConfig().setPutter(getCnd_dlv_grp_cd10_ListPutter());
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
	 * [Cnd_mng_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mng_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
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
	 * [Cnd_asst_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_asst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AsstTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_cntry_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_cntry_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_area_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_area_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Area");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_cntry_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_cntry_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_area_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_area_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Area");
		return lp;
	}
	 
	/**
	 * [Cnd_sls_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_sls_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_alc_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_cost_sls_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cost_sls_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostSls");
		return lp;
	}
	 
	/**
	 * [Cnd_cost_sls_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cost_sls_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostSls");
		return lp;
	}
	 
	/**
	 * [Cnd_cost_sls_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cost_sls_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostSls");
		return lp;
	}
	 
	/**
	 * [Cnd_cost_sls_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cost_sls_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostSls");
		return lp;
	}
	 
	/**
	 * [Cnd_cost_sls_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cost_sls_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostSls");
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
	 * [Cnd_cst_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_mng_dpt_cd) return getCnd_mng_dpt_cd(row, info);
		if(combo == Cnd_itm_jnl_cd) return getCnd_itm_jnl_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_asst_typ) return getCnd_asst_typ(row, info);
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_cst_cntry_cd) return getCnd_cst_cntry_cd(row, info);
		if(combo == Cnd_cst_area_cd) return getCnd_cst_area_cd(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_dlv_cntry_cd) return getCnd_dlv_cntry_cd(row, info);
		if(combo == Cnd_dlv_area_cd) return getCnd_dlv_area_cd(row, info);
		if(combo == Cnd_sls_dpt_cd) return getCnd_sls_dpt_cd(row, info);
		if(combo == Cnd_sls_usr_cd) return getCnd_sls_usr_cd(row, info);
		if(combo == Cnd_alc_dpt_cd) return getCnd_alc_dpt_cd(row, info);
		if(combo == Cnd_dest_cd1) return getCnd_dest_cd1(row, info);
		if(combo == Cnd_dest_cd2) return getCnd_dest_cd2(row, info);
		if(combo == Cnd_dest_cd3) return getCnd_dest_cd3(row, info);
		if(combo == Cnd_cost_sls_cd1) return getCnd_cost_sls_cd1(row, info);
		if(combo == Cnd_cost_sls_cd2) return getCnd_cost_sls_cd2(row, info);
		if(combo == Cnd_cost_sls_cd3) return getCnd_cost_sls_cd3(row, info);
		if(combo == Cnd_cost_sls_cd4) return getCnd_cost_sls_cd4(row, info);
		if(combo == Cnd_cost_sls_cd5) return getCnd_cost_sls_cd5(row, info);
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
		if(combo == Cnd_cst_grp_cd1) return getCnd_cst_grp_cd1(row, info);
		if(combo == Cnd_cst_grp_cd2) return getCnd_cst_grp_cd2(row, info);
		if(combo == Cnd_cst_grp_cd3) return getCnd_cst_grp_cd3(row, info);
		if(combo == Cnd_cst_grp_cd4) return getCnd_cst_grp_cd4(row, info);
		if(combo == Cnd_cst_grp_cd5) return getCnd_cst_grp_cd5(row, info);
		if(combo == Cnd_cst_grp_cd6) return getCnd_cst_grp_cd6(row, info);
		if(combo == Cnd_cst_grp_cd7) return getCnd_cst_grp_cd7(row, info);
		if(combo == Cnd_cst_grp_cd8) return getCnd_cst_grp_cd8(row, info);
		if(combo == Cnd_cst_grp_cd9) return getCnd_cst_grp_cd9(row, info);
		if(combo == Cnd_cst_grp_cd10) return getCnd_cst_grp_cd10(row, info);
		if(combo == Cnd_dlv_grp_cd1) return getCnd_dlv_grp_cd1(row, info);
		if(combo == Cnd_dlv_grp_cd2) return getCnd_dlv_grp_cd2(row, info);
		if(combo == Cnd_dlv_grp_cd3) return getCnd_dlv_grp_cd3(row, info);
		if(combo == Cnd_dlv_grp_cd4) return getCnd_dlv_grp_cd4(row, info);
		if(combo == Cnd_dlv_grp_cd5) return getCnd_dlv_grp_cd5(row, info);
		if(combo == Cnd_dlv_grp_cd6) return getCnd_dlv_grp_cd6(row, info);
		if(combo == Cnd_dlv_grp_cd7) return getCnd_dlv_grp_cd7(row, info);
		if(combo == Cnd_dlv_grp_cd8) return getCnd_dlv_grp_cd8(row, info);
		if(combo == Cnd_dlv_grp_cd9) return getCnd_dlv_grp_cd9(row, info);
		if(combo == Cnd_dlv_grp_cd10) return getCnd_dlv_grp_cd10(row, info);
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
		if (vc == Cnd_pln_calc_ctg_cd) return doCnd_pln_calc_ctg_cd_VC(info);
		if (vc == Cnd_pln_calc_ctg_nm) return doCnd_pln_calc_ctg_nm_VC(info);
		if (vc == Cnd_act_calc_ctg_cd) return doCnd_act_calc_ctg_cd_VC(info);
		if (vc == Cnd_act_calc_ctg_nm) return doCnd_act_calc_ctg_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_mng_dpt_cd) return doCnd_mng_dpt_cd_VC(info);
		if (vc == Cnd_mng_dpt_nm) return doCnd_mng_dpt_nm_VC(info);
		if (vc == Cnd_itm_jnl_cd) return doCnd_itm_jnl_cd_VC(info);
		if (vc == Cnd_itm_jnl_nm) return doCnd_itm_jnl_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_sno1) return doCnd_sno1_VC(info);
		if (vc == Cnd_sno2) return doCnd_sno2_VC(info);
		if (vc == Cnd_sno3) return doCnd_sno3_VC(info);
		if (vc == Cnd_sno4) return doCnd_sno4_VC(info);
		if (vc == Cnd_asst_typ) return doCnd_asst_typ_VC(info);
		if (vc == Cnd_asst_typ_nm) return doCnd_asst_typ_nm_VC(info);
		if (vc == Cnd_cst_cd) return doCnd_cst_cd_VC(info);
		if (vc == Cnd_cst_nm) return doCnd_cst_nm_VC(info);
		if (vc == Cnd_cst_cntry_cd) return doCnd_cst_cntry_cd_VC(info);
		if (vc == Cnd_cst_cntry_nm) return doCnd_cst_cntry_nm_VC(info);
		if (vc == Cnd_cst_area_cd) return doCnd_cst_area_cd_VC(info);
		if (vc == Cnd_cst_area_nm) return doCnd_cst_area_nm_VC(info);
		if (vc == Cnd_dlv_cd) return doCnd_dlv_cd_VC(info);
		if (vc == Cnd_dlv_nm) return doCnd_dlv_nm_VC(info);
		if (vc == Cnd_dlv_cntry_cd) return doCnd_dlv_cntry_cd_VC(info);
		if (vc == Cnd_dlv_cntry_nm) return doCnd_dlv_cntry_nm_VC(info);
		if (vc == Cnd_dlv_area_cd) return doCnd_dlv_area_cd_VC(info);
		if (vc == Cnd_dlv_area_nm) return doCnd_dlv_area_nm_VC(info);
		if (vc == Cnd_sls_dpt_cd) return doCnd_sls_dpt_cd_VC(info);
		if (vc == Cnd_sls_dpt_nm) return doCnd_sls_dpt_nm_VC(info);
		if (vc == Cnd_sls_usr_cd) return doCnd_sls_usr_cd_VC(info);
		if (vc == Cnd_sls_usr_nm) return doCnd_sls_usr_nm_VC(info);
		if (vc == Cnd_alc_dpt_cd) return doCnd_alc_dpt_cd_VC(info);
		if (vc == Cnd_alc_dpt_nm) return doCnd_alc_dpt_nm_VC(info);
		if (vc == Cnd_dest_cd1) return doCnd_dest_cd1_VC(info);
		if (vc == Cnd_dest_nm1) return doCnd_dest_nm1_VC(info);
		if (vc == Cnd_dest_cd2) return doCnd_dest_cd2_VC(info);
		if (vc == Cnd_dest_nm2) return doCnd_dest_nm2_VC(info);
		if (vc == Cnd_dest_cd3) return doCnd_dest_cd3_VC(info);
		if (vc == Cnd_dest_nm3) return doCnd_dest_nm3_VC(info);
		if (vc == Cnd_cost_sls_cd1) return doCnd_cost_sls_cd1_VC(info);
		if (vc == Cnd_cost_sls_nm1) return doCnd_cost_sls_nm1_VC(info);
		if (vc == Cnd_cost_sls_cd2) return doCnd_cost_sls_cd2_VC(info);
		if (vc == Cnd_cost_sls_nm2) return doCnd_cost_sls_nm2_VC(info);
		if (vc == Cnd_cost_sls_cd3) return doCnd_cost_sls_cd3_VC(info);
		if (vc == Cnd_cost_sls_nm3) return doCnd_cost_sls_nm3_VC(info);
		if (vc == Cnd_cost_sls_cd4) return doCnd_cost_sls_cd4_VC(info);
		if (vc == Cnd_cost_sls_nm4) return doCnd_cost_sls_nm4_VC(info);
		if (vc == Cnd_cost_sls_cd5) return doCnd_cost_sls_cd5_VC(info);
		if (vc == Cnd_cost_sls_nm5) return doCnd_cost_sls_nm5_VC(info);
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
		if (vc == Cnd_cst_grp_cd1) return doCnd_cst_grp_cd1_VC(info);
		if (vc == Cnd_cst_grp_nm1) return doCnd_cst_grp_nm1_VC(info);
		if (vc == Cnd_cst_grp_cd2) return doCnd_cst_grp_cd2_VC(info);
		if (vc == Cnd_cst_grp_nm2) return doCnd_cst_grp_nm2_VC(info);
		if (vc == Cnd_cst_grp_cd3) return doCnd_cst_grp_cd3_VC(info);
		if (vc == Cnd_cst_grp_nm3) return doCnd_cst_grp_nm3_VC(info);
		if (vc == Cnd_cst_grp_cd4) return doCnd_cst_grp_cd4_VC(info);
		if (vc == Cnd_cst_grp_nm4) return doCnd_cst_grp_nm4_VC(info);
		if (vc == Cnd_cst_grp_cd5) return doCnd_cst_grp_cd5_VC(info);
		if (vc == Cnd_cst_grp_nm5) return doCnd_cst_grp_nm5_VC(info);
		if (vc == Cnd_cst_grp_cd6) return doCnd_cst_grp_cd6_VC(info);
		if (vc == Cnd_cst_grp_nm6) return doCnd_cst_grp_nm6_VC(info);
		if (vc == Cnd_cst_grp_cd7) return doCnd_cst_grp_cd7_VC(info);
		if (vc == Cnd_cst_grp_nm7) return doCnd_cst_grp_nm7_VC(info);
		if (vc == Cnd_cst_grp_cd8) return doCnd_cst_grp_cd8_VC(info);
		if (vc == Cnd_cst_grp_nm8) return doCnd_cst_grp_nm8_VC(info);
		if (vc == Cnd_cst_grp_cd9) return doCnd_cst_grp_cd9_VC(info);
		if (vc == Cnd_cst_grp_nm9) return doCnd_cst_grp_nm9_VC(info);
		if (vc == Cnd_cst_grp_cd10) return doCnd_cst_grp_cd10_VC(info);
		if (vc == Cnd_cst_grp_nm10) return doCnd_cst_grp_nm10_VC(info);
		if (vc == Cnd_dlv_grp_cd1) return doCnd_dlv_grp_cd1_VC(info);
		if (vc == Cnd_dlv_grp_nm1) return doCnd_dlv_grp_nm1_VC(info);
		if (vc == Cnd_dlv_grp_cd2) return doCnd_dlv_grp_cd2_VC(info);
		if (vc == Cnd_dlv_grp_nm2) return doCnd_dlv_grp_nm2_VC(info);
		if (vc == Cnd_dlv_grp_cd3) return doCnd_dlv_grp_cd3_VC(info);
		if (vc == Cnd_dlv_grp_nm3) return doCnd_dlv_grp_nm3_VC(info);
		if (vc == Cnd_dlv_grp_cd4) return doCnd_dlv_grp_cd4_VC(info);
		if (vc == Cnd_dlv_grp_nm4) return doCnd_dlv_grp_nm4_VC(info);
		if (vc == Cnd_dlv_grp_cd5) return doCnd_dlv_grp_cd5_VC(info);
		if (vc == Cnd_dlv_grp_nm5) return doCnd_dlv_grp_nm5_VC(info);
		if (vc == Cnd_dlv_grp_cd6) return doCnd_dlv_grp_cd6_VC(info);
		if (vc == Cnd_dlv_grp_nm6) return doCnd_dlv_grp_nm6_VC(info);
		if (vc == Cnd_dlv_grp_cd7) return doCnd_dlv_grp_cd7_VC(info);
		if (vc == Cnd_dlv_grp_nm7) return doCnd_dlv_grp_nm7_VC(info);
		if (vc == Cnd_dlv_grp_cd8) return doCnd_dlv_grp_cd8_VC(info);
		if (vc == Cnd_dlv_grp_nm8) return doCnd_dlv_grp_nm8_VC(info);
		if (vc == Cnd_dlv_grp_cd9) return doCnd_dlv_grp_cd9_VC(info);
		if (vc == Cnd_dlv_grp_nm9) return doCnd_dlv_grp_nm9_VC(info);
		if (vc == Cnd_dlv_grp_cd10) return doCnd_dlv_grp_cd10_VC(info);
		if (vc == Cnd_dlv_grp_nm10) return doCnd_dlv_grp_nm10_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_mng_dpt_flg) return doCnd_mng_dpt_flg_VC(info);
		if (vc == Cnd_itm_flg) return doCnd_itm_flg_VC(info);
		if (vc == Cnd_itm_typ_flg) return doCnd_itm_typ_flg_VC(info);
		if (vc == Cnd_itm_typ_d_flg) return doCnd_itm_typ_d_flg_VC(info);
		if (vc == Cnd_itm_jnl_flg) return doCnd_itm_jnl_flg_VC(info);
		if (vc == Cnd_lot_flg) return doCnd_lot_flg_VC(info);
		if (vc == Cnd_sublot_flg) return doCnd_sublot_flg_VC(info);
		if (vc == Cnd_sno1_flg) return doCnd_sno1_flg_VC(info);
		if (vc == Cnd_sno2_flg) return doCnd_sno2_flg_VC(info);
		if (vc == Cnd_sno3_flg) return doCnd_sno3_flg_VC(info);
		if (vc == Cnd_sno4_flg) return doCnd_sno4_flg_VC(info);
		if (vc == Cnd_cst_flg) return doCnd_cst_flg_VC(info);
		if (vc == Cnd_cst_cntry_flg) return doCnd_cst_cntry_flg_VC(info);
		if (vc == Cnd_cst_area_flg) return doCnd_cst_area_flg_VC(info);
		if (vc == Cnd_dlv_flg) return doCnd_dlv_flg_VC(info);
		if (vc == Cnd_dlv_cntry_flg) return doCnd_dlv_cntry_flg_VC(info);
		if (vc == Cnd_dlv_area_flg) return doCnd_dlv_area_flg_VC(info);
		if (vc == Cnd_sls_dpt_flg) return doCnd_sls_dpt_flg_VC(info);
		if (vc == Cnd_sls_usr_flg) return doCnd_sls_usr_flg_VC(info);
		if (vc == Cnd_alc_dpt_flg) return doCnd_alc_dpt_flg_VC(info);
		if (vc == Cnd_dest1_flg) return doCnd_dest1_flg_VC(info);
		if (vc == Cnd_dest2_flg) return doCnd_dest2_flg_VC(info);
		if (vc == Cnd_dest3_flg) return doCnd_dest3_flg_VC(info);
		if (vc == Cnd_cost_sls1_flg) return doCnd_cost_sls1_flg_VC(info);
		if (vc == Cnd_cost_sls2_flg) return doCnd_cost_sls2_flg_VC(info);
		if (vc == Cnd_cost_sls3_flg) return doCnd_cost_sls3_flg_VC(info);
		if (vc == Cnd_cost_sls4_flg) return doCnd_cost_sls4_flg_VC(info);
		if (vc == Cnd_cost_sls5_flg) return doCnd_cost_sls5_flg_VC(info);
		if (vc == Cnd_asst_flg) return doCnd_asst_flg_VC(info);
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
		if (vc == Cnd_cst_grp_flg1) return doCnd_cst_grp_flg1_VC(info);
		if (vc == Cnd_cst_grp_flg2) return doCnd_cst_grp_flg2_VC(info);
		if (vc == Cnd_cst_grp_flg3) return doCnd_cst_grp_flg3_VC(info);
		if (vc == Cnd_cst_grp_flg4) return doCnd_cst_grp_flg4_VC(info);
		if (vc == Cnd_cst_grp_flg5) return doCnd_cst_grp_flg5_VC(info);
		if (vc == Cnd_cst_grp_flg6) return doCnd_cst_grp_flg6_VC(info);
		if (vc == Cnd_cst_grp_flg7) return doCnd_cst_grp_flg7_VC(info);
		if (vc == Cnd_cst_grp_flg8) return doCnd_cst_grp_flg8_VC(info);
		if (vc == Cnd_cst_grp_flg9) return doCnd_cst_grp_flg9_VC(info);
		if (vc == Cnd_cst_grp_flg10) return doCnd_cst_grp_flg10_VC(info);
		if (vc == Cnd_dlv_grp_flg1) return doCnd_dlv_grp_flg1_VC(info);
		if (vc == Cnd_dlv_grp_flg2) return doCnd_dlv_grp_flg2_VC(info);
		if (vc == Cnd_dlv_grp_flg3) return doCnd_dlv_grp_flg3_VC(info);
		if (vc == Cnd_dlv_grp_flg4) return doCnd_dlv_grp_flg4_VC(info);
		if (vc == Cnd_dlv_grp_flg5) return doCnd_dlv_grp_flg5_VC(info);
		if (vc == Cnd_dlv_grp_flg6) return doCnd_dlv_grp_flg6_VC(info);
		if (vc == Cnd_dlv_grp_flg7) return doCnd_dlv_grp_flg7_VC(info);
		if (vc == Cnd_dlv_grp_flg8) return doCnd_dlv_grp_flg8_VC(info);
		if (vc == Cnd_dlv_grp_flg9) return doCnd_dlv_grp_flg9_VC(info);
		if (vc == Cnd_dlv_grp_flg10) return doCnd_dlv_grp_flg10_VC(info);
		if (vc == Cnd_disp_key) return doCnd_disp_key_VC(info);
		if (vc == columnDispRslt_wg_cd) return doDispRslt_wg_cd_VC(info);
		if (vc == columnDispRslt_wg_nm) return doDispRslt_wg_nm_VC(info);
		if (vc == columnDispRslt_mng_dpt_cd) return doDispRslt_mng_dpt_cd_VC(info);
		if (vc == columnDispRslt_mng_dpt_nm) return doDispRslt_mng_dpt_nm_VC(info);
		if (vc == columnDispRslt_itm_typ) return doDispRslt_itm_typ_VC(info);
		if (vc == columnDispRslt_itm_typ_nm) return doDispRslt_itm_typ_nm_VC(info);
		if (vc == columnDispRslt_itm_typ_d_cd) return doDispRslt_itm_typ_d_cd_VC(info);
		if (vc == columnDispRslt_itm_typ_d_nm) return doDispRslt_itm_typ_d_nm_VC(info);
		if (vc == columnDispRslt_itm_jnl_cd) return doDispRslt_itm_jnl_cd_VC(info);
		if (vc == columnDispRslt_itm_jnl_nm) return doDispRslt_itm_jnl_nm_VC(info);
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
		if (vc == columnDispRslt_cst_cd) return doDispRslt_cst_cd_VC(info);
		if (vc == columnDispRslt_cst_nm) return doDispRslt_cst_nm_VC(info);
		if (vc == columnDispRslt_cst_grp_cd1) return doDispRslt_cst_grp_cd1_VC(info);
		if (vc == columnDispRslt_cst_grp_nm1) return doDispRslt_cst_grp_nm1_VC(info);
		if (vc == columnDispRslt_cst_grp_cd2) return doDispRslt_cst_grp_cd2_VC(info);
		if (vc == columnDispRslt_cst_grp_nm2) return doDispRslt_cst_grp_nm2_VC(info);
		if (vc == columnDispRslt_cst_grp_cd3) return doDispRslt_cst_grp_cd3_VC(info);
		if (vc == columnDispRslt_cst_grp_nm3) return doDispRslt_cst_grp_nm3_VC(info);
		if (vc == columnDispRslt_cst_grp_cd4) return doDispRslt_cst_grp_cd4_VC(info);
		if (vc == columnDispRslt_cst_grp_nm4) return doDispRslt_cst_grp_nm4_VC(info);
		if (vc == columnDispRslt_cst_grp_cd5) return doDispRslt_cst_grp_cd5_VC(info);
		if (vc == columnDispRslt_cst_grp_nm5) return doDispRslt_cst_grp_nm5_VC(info);
		if (vc == columnDispRslt_cst_grp_cd6) return doDispRslt_cst_grp_cd6_VC(info);
		if (vc == columnDispRslt_cst_grp_nm6) return doDispRslt_cst_grp_nm6_VC(info);
		if (vc == columnDispRslt_cst_grp_cd7) return doDispRslt_cst_grp_cd7_VC(info);
		if (vc == columnDispRslt_cst_grp_nm7) return doDispRslt_cst_grp_nm7_VC(info);
		if (vc == columnDispRslt_cst_grp_cd8) return doDispRslt_cst_grp_cd8_VC(info);
		if (vc == columnDispRslt_cst_grp_nm8) return doDispRslt_cst_grp_nm8_VC(info);
		if (vc == columnDispRslt_cst_grp_cd9) return doDispRslt_cst_grp_cd9_VC(info);
		if (vc == columnDispRslt_cst_grp_nm9) return doDispRslt_cst_grp_nm9_VC(info);
		if (vc == columnDispRslt_cst_grp_cd10) return doDispRslt_cst_grp_cd10_VC(info);
		if (vc == columnDispRslt_cst_grp_nm10) return doDispRslt_cst_grp_nm10_VC(info);
		if (vc == columnDispRslt_cst_cntry_cd) return doDispRslt_cst_cntry_cd_VC(info);
		if (vc == columnDispRslt_cst_cntry_nm) return doDispRslt_cst_cntry_nm_VC(info);
		if (vc == columnDispRslt_cst_area_cd) return doDispRslt_cst_area_cd_VC(info);
		if (vc == columnDispRslt_cst_area_nm) return doDispRslt_cst_area_nm_VC(info);
		if (vc == columnDispRslt_dlv_cd) return doDispRslt_dlv_cd_VC(info);
		if (vc == columnDispRslt_dlv_nm) return doDispRslt_dlv_nm_VC(info);
		if (vc == columnDispRslt_dlv_grp_cd1) return doDispRslt_dlv_grp_cd1_VC(info);
		if (vc == columnDispRslt_dlv_grp_nm1) return doDispRslt_dlv_grp_nm1_VC(info);
		if (vc == columnDispRslt_dlv_grp_cd2) return doDispRslt_dlv_grp_cd2_VC(info);
		if (vc == columnDispRslt_dlv_grp_nm2) return doDispRslt_dlv_grp_nm2_VC(info);
		if (vc == columnDispRslt_dlv_grp_cd3) return doDispRslt_dlv_grp_cd3_VC(info);
		if (vc == columnDispRslt_dlv_grp_nm3) return doDispRslt_dlv_grp_nm3_VC(info);
		if (vc == columnDispRslt_dlv_grp_cd4) return doDispRslt_dlv_grp_cd4_VC(info);
		if (vc == columnDispRslt_dlv_grp_nm4) return doDispRslt_dlv_grp_nm4_VC(info);
		if (vc == columnDispRslt_dlv_grp_cd5) return doDispRslt_dlv_grp_cd5_VC(info);
		if (vc == columnDispRslt_dlv_grp_nm5) return doDispRslt_dlv_grp_nm5_VC(info);
		if (vc == columnDispRslt_dlv_grp_cd6) return doDispRslt_dlv_grp_cd6_VC(info);
		if (vc == columnDispRslt_dlv_grp_nm6) return doDispRslt_dlv_grp_nm6_VC(info);
		if (vc == columnDispRslt_dlv_grp_cd7) return doDispRslt_dlv_grp_cd7_VC(info);
		if (vc == columnDispRslt_dlv_grp_nm7) return doDispRslt_dlv_grp_nm7_VC(info);
		if (vc == columnDispRslt_dlv_grp_cd8) return doDispRslt_dlv_grp_cd8_VC(info);
		if (vc == columnDispRslt_dlv_grp_nm8) return doDispRslt_dlv_grp_nm8_VC(info);
		if (vc == columnDispRslt_dlv_grp_cd9) return doDispRslt_dlv_grp_cd9_VC(info);
		if (vc == columnDispRslt_dlv_grp_nm9) return doDispRslt_dlv_grp_nm9_VC(info);
		if (vc == columnDispRslt_dlv_grp_cd10) return doDispRslt_dlv_grp_cd10_VC(info);
		if (vc == columnDispRslt_dlv_grp_nm10) return doDispRslt_dlv_grp_nm10_VC(info);
		if (vc == columnDispRslt_dlv_cntry_cd) return doDispRslt_dlv_cntry_cd_VC(info);
		if (vc == columnDispRslt_dlv_cntry_nm) return doDispRslt_dlv_cntry_nm_VC(info);
		if (vc == columnDispRslt_dlv_area_cd) return doDispRslt_dlv_area_cd_VC(info);
		if (vc == columnDispRslt_dlv_area_nm) return doDispRslt_dlv_area_nm_VC(info);
		if (vc == columnDispRslt_sls_dpt_cd) return doDispRslt_sls_dpt_cd_VC(info);
		if (vc == columnDispRslt_sls_dpt_nm) return doDispRslt_sls_dpt_nm_VC(info);
		if (vc == columnDispRslt_sls_usr_cd) return doDispRslt_sls_usr_cd_VC(info);
		if (vc == columnDispRslt_sls_usr_nm) return doDispRslt_sls_usr_nm_VC(info);
		if (vc == columnDispRslt_alc_dpt_cd) return doDispRslt_alc_dpt_cd_VC(info);
		if (vc == columnDispRslt_alc_dpt_nm) return doDispRslt_alc_dpt_nm_VC(info);
		if (vc == columnDispRslt_dest_cd1) return doDispRslt_dest_cd1_VC(info);
		if (vc == columnDispRslt_dest_nm1) return doDispRslt_dest_nm1_VC(info);
		if (vc == columnDispRslt_dest_cd2) return doDispRslt_dest_cd2_VC(info);
		if (vc == columnDispRslt_dest_nm2) return doDispRslt_dest_nm2_VC(info);
		if (vc == columnDispRslt_dest_cd3) return doDispRslt_dest_cd3_VC(info);
		if (vc == columnDispRslt_dest_nm3) return doDispRslt_dest_nm3_VC(info);
		if (vc == columnDispRslt_cost_sls_cd1) return doDispRslt_cost_sls_cd1_VC(info);
		if (vc == columnDispRslt_cost_sls_nm1) return doDispRslt_cost_sls_nm1_VC(info);
		if (vc == columnDispRslt_cost_sls_cd2) return doDispRslt_cost_sls_cd2_VC(info);
		if (vc == columnDispRslt_cost_sls_nm2) return doDispRslt_cost_sls_nm2_VC(info);
		if (vc == columnDispRslt_cost_sls_cd3) return doDispRslt_cost_sls_cd3_VC(info);
		if (vc == columnDispRslt_cost_sls_nm3) return doDispRslt_cost_sls_nm3_VC(info);
		if (vc == columnDispRslt_cost_sls_cd4) return doDispRslt_cost_sls_cd4_VC(info);
		if (vc == columnDispRslt_cost_sls_nm4) return doDispRslt_cost_sls_nm4_VC(info);
		if (vc == columnDispRslt_cost_sls_cd5) return doDispRslt_cost_sls_cd5_VC(info);
		if (vc == columnDispRslt_cost_sls_nm5) return doDispRslt_cost_sls_nm5_VC(info);
		if (vc == columnDispRslt_asst_typ) return doDispRslt_asst_typ_VC(info);
		if (vc == columnDispRslt_asst_typ_nm) return doDispRslt_asst_typ_nm_VC(info);
		if (vc == columnDispRslt_unit_cd) return doDispRslt_unit_cd_VC(info);
		if (vc == columnDispRslt_unit_nm) return doDispRslt_unit_nm_VC(info);
		if (vc == columnDispRslt_dec_place) return doDispRslt_dec_place_VC(info);
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
	 * [Cnd]パネルの[mng_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mng_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mng_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mng_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_jnl_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_sls_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_sls_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_sls_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_sls_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_sls_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_sls_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_sls_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_sls_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_sls_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_sls_nm5_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm10_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[mng_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mng_dpt_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_jnl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_jnl_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_cntry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_cntry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_area_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_area_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_cntry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_cntry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_area_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_area_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_usr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_usr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_sls1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_sls1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_sls2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_sls2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_sls3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_sls3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_sls4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_sls4_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_sls5_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_sls5_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asst_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_grp_flg1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_flg1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_flg2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_flg3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_flg4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_flg5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_flg6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_flg7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_flg8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_flg9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_flg10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_flg1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_flg2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_flg3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_flg4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_flg5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_flg6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_flg7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_flg8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_flg9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_flg10_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[mng_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_mng_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[mng_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_mng_dpt_nm_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_jnl_nm_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cst_area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cst_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dlv_area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dlv_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[alc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_alc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[alc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_alc_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cost_sls_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cost_sls_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cost_sls_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cost_sls_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cost_sls_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cost_sls_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cost_sls_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cost_sls_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cost_sls_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cost_sls_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_dec_place_VC(MCEventInfo info){
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
		else if (nc == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_NC(info);
		else if (nc == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_NC(info);
		else if (nc == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NC(info);
		else if (nc == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NC(info);
		else if (nc == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NC(info);
		else if (nc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NC(info);
		else if (nc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_sno1) doCnd_sno1_NC(info);
		else if (nc == Cnd_sno2) doCnd_sno2_NC(info);
		else if (nc == Cnd_sno3) doCnd_sno3_NC(info);
		else if (nc == Cnd_sno4) doCnd_sno4_NC(info);
		else if (nc == Cnd_asst_typ) doCnd_asst_typ_NC(info);
		else if (nc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NC(info);
		else if (nc == Cnd_cst_cd) doCnd_cst_cd_NC(info);
		else if (nc == Cnd_cst_nm) doCnd_cst_nm_NC(info);
		else if (nc == Cnd_cst_cntry_cd) doCnd_cst_cntry_cd_NC(info);
		else if (nc == Cnd_cst_cntry_nm) doCnd_cst_cntry_nm_NC(info);
		else if (nc == Cnd_cst_area_cd) doCnd_cst_area_cd_NC(info);
		else if (nc == Cnd_cst_area_nm) doCnd_cst_area_nm_NC(info);
		else if (nc == Cnd_dlv_cd) doCnd_dlv_cd_NC(info);
		else if (nc == Cnd_dlv_nm) doCnd_dlv_nm_NC(info);
		else if (nc == Cnd_dlv_cntry_cd) doCnd_dlv_cntry_cd_NC(info);
		else if (nc == Cnd_dlv_cntry_nm) doCnd_dlv_cntry_nm_NC(info);
		else if (nc == Cnd_dlv_area_cd) doCnd_dlv_area_cd_NC(info);
		else if (nc == Cnd_dlv_area_nm) doCnd_dlv_area_nm_NC(info);
		else if (nc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NC(info);
		else if (nc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NC(info);
		else if (nc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NC(info);
		else if (nc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NC(info);
		else if (nc == Cnd_alc_dpt_cd) doCnd_alc_dpt_cd_NC(info);
		else if (nc == Cnd_alc_dpt_nm) doCnd_alc_dpt_nm_NC(info);
		else if (nc == Cnd_dest_cd1) doCnd_dest_cd1_NC(info);
		else if (nc == Cnd_dest_nm1) doCnd_dest_nm1_NC(info);
		else if (nc == Cnd_dest_cd2) doCnd_dest_cd2_NC(info);
		else if (nc == Cnd_dest_nm2) doCnd_dest_nm2_NC(info);
		else if (nc == Cnd_dest_cd3) doCnd_dest_cd3_NC(info);
		else if (nc == Cnd_dest_nm3) doCnd_dest_nm3_NC(info);
		else if (nc == Cnd_cost_sls_cd1) doCnd_cost_sls_cd1_NC(info);
		else if (nc == Cnd_cost_sls_nm1) doCnd_cost_sls_nm1_NC(info);
		else if (nc == Cnd_cost_sls_cd2) doCnd_cost_sls_cd2_NC(info);
		else if (nc == Cnd_cost_sls_nm2) doCnd_cost_sls_nm2_NC(info);
		else if (nc == Cnd_cost_sls_cd3) doCnd_cost_sls_cd3_NC(info);
		else if (nc == Cnd_cost_sls_nm3) doCnd_cost_sls_nm3_NC(info);
		else if (nc == Cnd_cost_sls_cd4) doCnd_cost_sls_cd4_NC(info);
		else if (nc == Cnd_cost_sls_nm4) doCnd_cost_sls_nm4_NC(info);
		else if (nc == Cnd_cost_sls_cd5) doCnd_cost_sls_cd5_NC(info);
		else if (nc == Cnd_cost_sls_nm5) doCnd_cost_sls_nm5_NC(info);
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
		else if (nc == Cnd_cst_grp_cd1) doCnd_cst_grp_cd1_NC(info);
		else if (nc == Cnd_cst_grp_nm1) doCnd_cst_grp_nm1_NC(info);
		else if (nc == Cnd_cst_grp_cd2) doCnd_cst_grp_cd2_NC(info);
		else if (nc == Cnd_cst_grp_nm2) doCnd_cst_grp_nm2_NC(info);
		else if (nc == Cnd_cst_grp_cd3) doCnd_cst_grp_cd3_NC(info);
		else if (nc == Cnd_cst_grp_nm3) doCnd_cst_grp_nm3_NC(info);
		else if (nc == Cnd_cst_grp_cd4) doCnd_cst_grp_cd4_NC(info);
		else if (nc == Cnd_cst_grp_nm4) doCnd_cst_grp_nm4_NC(info);
		else if (nc == Cnd_cst_grp_cd5) doCnd_cst_grp_cd5_NC(info);
		else if (nc == Cnd_cst_grp_nm5) doCnd_cst_grp_nm5_NC(info);
		else if (nc == Cnd_cst_grp_cd6) doCnd_cst_grp_cd6_NC(info);
		else if (nc == Cnd_cst_grp_nm6) doCnd_cst_grp_nm6_NC(info);
		else if (nc == Cnd_cst_grp_cd7) doCnd_cst_grp_cd7_NC(info);
		else if (nc == Cnd_cst_grp_nm7) doCnd_cst_grp_nm7_NC(info);
		else if (nc == Cnd_cst_grp_cd8) doCnd_cst_grp_cd8_NC(info);
		else if (nc == Cnd_cst_grp_nm8) doCnd_cst_grp_nm8_NC(info);
		else if (nc == Cnd_cst_grp_cd9) doCnd_cst_grp_cd9_NC(info);
		else if (nc == Cnd_cst_grp_nm9) doCnd_cst_grp_nm9_NC(info);
		else if (nc == Cnd_cst_grp_cd10) doCnd_cst_grp_cd10_NC(info);
		else if (nc == Cnd_cst_grp_nm10) doCnd_cst_grp_nm10_NC(info);
		else if (nc == Cnd_dlv_grp_cd1) doCnd_dlv_grp_cd1_NC(info);
		else if (nc == Cnd_dlv_grp_nm1) doCnd_dlv_grp_nm1_NC(info);
		else if (nc == Cnd_dlv_grp_cd2) doCnd_dlv_grp_cd2_NC(info);
		else if (nc == Cnd_dlv_grp_nm2) doCnd_dlv_grp_nm2_NC(info);
		else if (nc == Cnd_dlv_grp_cd3) doCnd_dlv_grp_cd3_NC(info);
		else if (nc == Cnd_dlv_grp_nm3) doCnd_dlv_grp_nm3_NC(info);
		else if (nc == Cnd_dlv_grp_cd4) doCnd_dlv_grp_cd4_NC(info);
		else if (nc == Cnd_dlv_grp_nm4) doCnd_dlv_grp_nm4_NC(info);
		else if (nc == Cnd_dlv_grp_cd5) doCnd_dlv_grp_cd5_NC(info);
		else if (nc == Cnd_dlv_grp_nm5) doCnd_dlv_grp_nm5_NC(info);
		else if (nc == Cnd_dlv_grp_cd6) doCnd_dlv_grp_cd6_NC(info);
		else if (nc == Cnd_dlv_grp_nm6) doCnd_dlv_grp_nm6_NC(info);
		else if (nc == Cnd_dlv_grp_cd7) doCnd_dlv_grp_cd7_NC(info);
		else if (nc == Cnd_dlv_grp_nm7) doCnd_dlv_grp_nm7_NC(info);
		else if (nc == Cnd_dlv_grp_cd8) doCnd_dlv_grp_cd8_NC(info);
		else if (nc == Cnd_dlv_grp_nm8) doCnd_dlv_grp_nm8_NC(info);
		else if (nc == Cnd_dlv_grp_cd9) doCnd_dlv_grp_cd9_NC(info);
		else if (nc == Cnd_dlv_grp_nm9) doCnd_dlv_grp_nm9_NC(info);
		else if (nc == Cnd_dlv_grp_cd10) doCnd_dlv_grp_cd10_NC(info);
		else if (nc == Cnd_dlv_grp_nm10) doCnd_dlv_grp_nm10_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_mng_dpt_flg) doCnd_mng_dpt_flg_NC(info);
		else if (nc == Cnd_itm_flg) doCnd_itm_flg_NC(info);
		else if (nc == Cnd_itm_typ_flg) doCnd_itm_typ_flg_NC(info);
		else if (nc == Cnd_itm_typ_d_flg) doCnd_itm_typ_d_flg_NC(info);
		else if (nc == Cnd_itm_jnl_flg) doCnd_itm_jnl_flg_NC(info);
		else if (nc == Cnd_lot_flg) doCnd_lot_flg_NC(info);
		else if (nc == Cnd_sublot_flg) doCnd_sublot_flg_NC(info);
		else if (nc == Cnd_sno1_flg) doCnd_sno1_flg_NC(info);
		else if (nc == Cnd_sno2_flg) doCnd_sno2_flg_NC(info);
		else if (nc == Cnd_sno3_flg) doCnd_sno3_flg_NC(info);
		else if (nc == Cnd_sno4_flg) doCnd_sno4_flg_NC(info);
		else if (nc == Cnd_cst_flg) doCnd_cst_flg_NC(info);
		else if (nc == Cnd_cst_cntry_flg) doCnd_cst_cntry_flg_NC(info);
		else if (nc == Cnd_cst_area_flg) doCnd_cst_area_flg_NC(info);
		else if (nc == Cnd_dlv_flg) doCnd_dlv_flg_NC(info);
		else if (nc == Cnd_dlv_cntry_flg) doCnd_dlv_cntry_flg_NC(info);
		else if (nc == Cnd_dlv_area_flg) doCnd_dlv_area_flg_NC(info);
		else if (nc == Cnd_sls_dpt_flg) doCnd_sls_dpt_flg_NC(info);
		else if (nc == Cnd_sls_usr_flg) doCnd_sls_usr_flg_NC(info);
		else if (nc == Cnd_alc_dpt_flg) doCnd_alc_dpt_flg_NC(info);
		else if (nc == Cnd_dest1_flg) doCnd_dest1_flg_NC(info);
		else if (nc == Cnd_dest2_flg) doCnd_dest2_flg_NC(info);
		else if (nc == Cnd_dest3_flg) doCnd_dest3_flg_NC(info);
		else if (nc == Cnd_cost_sls1_flg) doCnd_cost_sls1_flg_NC(info);
		else if (nc == Cnd_cost_sls2_flg) doCnd_cost_sls2_flg_NC(info);
		else if (nc == Cnd_cost_sls3_flg) doCnd_cost_sls3_flg_NC(info);
		else if (nc == Cnd_cost_sls4_flg) doCnd_cost_sls4_flg_NC(info);
		else if (nc == Cnd_cost_sls5_flg) doCnd_cost_sls5_flg_NC(info);
		else if (nc == Cnd_asst_flg) doCnd_asst_flg_NC(info);
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
		else if (nc == Cnd_cst_grp_flg1) doCnd_cst_grp_flg1_NC(info);
		else if (nc == Cnd_cst_grp_flg2) doCnd_cst_grp_flg2_NC(info);
		else if (nc == Cnd_cst_grp_flg3) doCnd_cst_grp_flg3_NC(info);
		else if (nc == Cnd_cst_grp_flg4) doCnd_cst_grp_flg4_NC(info);
		else if (nc == Cnd_cst_grp_flg5) doCnd_cst_grp_flg5_NC(info);
		else if (nc == Cnd_cst_grp_flg6) doCnd_cst_grp_flg6_NC(info);
		else if (nc == Cnd_cst_grp_flg7) doCnd_cst_grp_flg7_NC(info);
		else if (nc == Cnd_cst_grp_flg8) doCnd_cst_grp_flg8_NC(info);
		else if (nc == Cnd_cst_grp_flg9) doCnd_cst_grp_flg9_NC(info);
		else if (nc == Cnd_cst_grp_flg10) doCnd_cst_grp_flg10_NC(info);
		else if (nc == Cnd_dlv_grp_flg1) doCnd_dlv_grp_flg1_NC(info);
		else if (nc == Cnd_dlv_grp_flg2) doCnd_dlv_grp_flg2_NC(info);
		else if (nc == Cnd_dlv_grp_flg3) doCnd_dlv_grp_flg3_NC(info);
		else if (nc == Cnd_dlv_grp_flg4) doCnd_dlv_grp_flg4_NC(info);
		else if (nc == Cnd_dlv_grp_flg5) doCnd_dlv_grp_flg5_NC(info);
		else if (nc == Cnd_dlv_grp_flg6) doCnd_dlv_grp_flg6_NC(info);
		else if (nc == Cnd_dlv_grp_flg7) doCnd_dlv_grp_flg7_NC(info);
		else if (nc == Cnd_dlv_grp_flg8) doCnd_dlv_grp_flg8_NC(info);
		else if (nc == Cnd_dlv_grp_flg9) doCnd_dlv_grp_flg9_NC(info);
		else if (nc == Cnd_dlv_grp_flg10) doCnd_dlv_grp_flg10_NC(info);
		else if (nc == Cnd_disp_key) doCnd_disp_key_NC(info);
		else if (nc == columnDispRslt_wg_cd) doDispRslt_wg_cd_NC(info);
		else if (nc == columnDispRslt_wg_nm) doDispRslt_wg_nm_NC(info);
		else if (nc == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_NC(info);
		else if (nc == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_NC(info);
		else if (nc == columnDispRslt_itm_typ) doDispRslt_itm_typ_NC(info);
		else if (nc == columnDispRslt_itm_typ_nm) doDispRslt_itm_typ_nm_NC(info);
		else if (nc == columnDispRslt_itm_typ_d_cd) doDispRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnDispRslt_itm_typ_d_nm) doDispRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnDispRslt_itm_jnl_cd) doDispRslt_itm_jnl_cd_NC(info);
		else if (nc == columnDispRslt_itm_jnl_nm) doDispRslt_itm_jnl_nm_NC(info);
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
		else if (nc == columnDispRslt_cst_cd) doDispRslt_cst_cd_NC(info);
		else if (nc == columnDispRslt_cst_nm) doDispRslt_cst_nm_NC(info);
		else if (nc == columnDispRslt_cst_grp_cd1) doDispRslt_cst_grp_cd1_NC(info);
		else if (nc == columnDispRslt_cst_grp_nm1) doDispRslt_cst_grp_nm1_NC(info);
		else if (nc == columnDispRslt_cst_grp_cd2) doDispRslt_cst_grp_cd2_NC(info);
		else if (nc == columnDispRslt_cst_grp_nm2) doDispRslt_cst_grp_nm2_NC(info);
		else if (nc == columnDispRslt_cst_grp_cd3) doDispRslt_cst_grp_cd3_NC(info);
		else if (nc == columnDispRslt_cst_grp_nm3) doDispRslt_cst_grp_nm3_NC(info);
		else if (nc == columnDispRslt_cst_grp_cd4) doDispRslt_cst_grp_cd4_NC(info);
		else if (nc == columnDispRslt_cst_grp_nm4) doDispRslt_cst_grp_nm4_NC(info);
		else if (nc == columnDispRslt_cst_grp_cd5) doDispRslt_cst_grp_cd5_NC(info);
		else if (nc == columnDispRslt_cst_grp_nm5) doDispRslt_cst_grp_nm5_NC(info);
		else if (nc == columnDispRslt_cst_grp_cd6) doDispRslt_cst_grp_cd6_NC(info);
		else if (nc == columnDispRslt_cst_grp_nm6) doDispRslt_cst_grp_nm6_NC(info);
		else if (nc == columnDispRslt_cst_grp_cd7) doDispRslt_cst_grp_cd7_NC(info);
		else if (nc == columnDispRslt_cst_grp_nm7) doDispRslt_cst_grp_nm7_NC(info);
		else if (nc == columnDispRslt_cst_grp_cd8) doDispRslt_cst_grp_cd8_NC(info);
		else if (nc == columnDispRslt_cst_grp_nm8) doDispRslt_cst_grp_nm8_NC(info);
		else if (nc == columnDispRslt_cst_grp_cd9) doDispRslt_cst_grp_cd9_NC(info);
		else if (nc == columnDispRslt_cst_grp_nm9) doDispRslt_cst_grp_nm9_NC(info);
		else if (nc == columnDispRslt_cst_grp_cd10) doDispRslt_cst_grp_cd10_NC(info);
		else if (nc == columnDispRslt_cst_grp_nm10) doDispRslt_cst_grp_nm10_NC(info);
		else if (nc == columnDispRslt_cst_cntry_cd) doDispRslt_cst_cntry_cd_NC(info);
		else if (nc == columnDispRslt_cst_cntry_nm) doDispRslt_cst_cntry_nm_NC(info);
		else if (nc == columnDispRslt_cst_area_cd) doDispRslt_cst_area_cd_NC(info);
		else if (nc == columnDispRslt_cst_area_nm) doDispRslt_cst_area_nm_NC(info);
		else if (nc == columnDispRslt_dlv_cd) doDispRslt_dlv_cd_NC(info);
		else if (nc == columnDispRslt_dlv_nm) doDispRslt_dlv_nm_NC(info);
		else if (nc == columnDispRslt_dlv_grp_cd1) doDispRslt_dlv_grp_cd1_NC(info);
		else if (nc == columnDispRslt_dlv_grp_nm1) doDispRslt_dlv_grp_nm1_NC(info);
		else if (nc == columnDispRslt_dlv_grp_cd2) doDispRslt_dlv_grp_cd2_NC(info);
		else if (nc == columnDispRslt_dlv_grp_nm2) doDispRslt_dlv_grp_nm2_NC(info);
		else if (nc == columnDispRslt_dlv_grp_cd3) doDispRslt_dlv_grp_cd3_NC(info);
		else if (nc == columnDispRslt_dlv_grp_nm3) doDispRslt_dlv_grp_nm3_NC(info);
		else if (nc == columnDispRslt_dlv_grp_cd4) doDispRslt_dlv_grp_cd4_NC(info);
		else if (nc == columnDispRslt_dlv_grp_nm4) doDispRslt_dlv_grp_nm4_NC(info);
		else if (nc == columnDispRslt_dlv_grp_cd5) doDispRslt_dlv_grp_cd5_NC(info);
		else if (nc == columnDispRslt_dlv_grp_nm5) doDispRslt_dlv_grp_nm5_NC(info);
		else if (nc == columnDispRslt_dlv_grp_cd6) doDispRslt_dlv_grp_cd6_NC(info);
		else if (nc == columnDispRslt_dlv_grp_nm6) doDispRslt_dlv_grp_nm6_NC(info);
		else if (nc == columnDispRslt_dlv_grp_cd7) doDispRslt_dlv_grp_cd7_NC(info);
		else if (nc == columnDispRslt_dlv_grp_nm7) doDispRslt_dlv_grp_nm7_NC(info);
		else if (nc == columnDispRslt_dlv_grp_cd8) doDispRslt_dlv_grp_cd8_NC(info);
		else if (nc == columnDispRslt_dlv_grp_nm8) doDispRslt_dlv_grp_nm8_NC(info);
		else if (nc == columnDispRslt_dlv_grp_cd9) doDispRslt_dlv_grp_cd9_NC(info);
		else if (nc == columnDispRslt_dlv_grp_nm9) doDispRslt_dlv_grp_nm9_NC(info);
		else if (nc == columnDispRslt_dlv_grp_cd10) doDispRslt_dlv_grp_cd10_NC(info);
		else if (nc == columnDispRslt_dlv_grp_nm10) doDispRslt_dlv_grp_nm10_NC(info);
		else if (nc == columnDispRslt_dlv_cntry_cd) doDispRslt_dlv_cntry_cd_NC(info);
		else if (nc == columnDispRslt_dlv_cntry_nm) doDispRslt_dlv_cntry_nm_NC(info);
		else if (nc == columnDispRslt_dlv_area_cd) doDispRslt_dlv_area_cd_NC(info);
		else if (nc == columnDispRslt_dlv_area_nm) doDispRslt_dlv_area_nm_NC(info);
		else if (nc == columnDispRslt_sls_dpt_cd) doDispRslt_sls_dpt_cd_NC(info);
		else if (nc == columnDispRslt_sls_dpt_nm) doDispRslt_sls_dpt_nm_NC(info);
		else if (nc == columnDispRslt_sls_usr_cd) doDispRslt_sls_usr_cd_NC(info);
		else if (nc == columnDispRslt_sls_usr_nm) doDispRslt_sls_usr_nm_NC(info);
		else if (nc == columnDispRslt_alc_dpt_cd) doDispRslt_alc_dpt_cd_NC(info);
		else if (nc == columnDispRslt_alc_dpt_nm) doDispRslt_alc_dpt_nm_NC(info);
		else if (nc == columnDispRslt_dest_cd1) doDispRslt_dest_cd1_NC(info);
		else if (nc == columnDispRslt_dest_nm1) doDispRslt_dest_nm1_NC(info);
		else if (nc == columnDispRslt_dest_cd2) doDispRslt_dest_cd2_NC(info);
		else if (nc == columnDispRslt_dest_nm2) doDispRslt_dest_nm2_NC(info);
		else if (nc == columnDispRslt_dest_cd3) doDispRslt_dest_cd3_NC(info);
		else if (nc == columnDispRslt_dest_nm3) doDispRslt_dest_nm3_NC(info);
		else if (nc == columnDispRslt_cost_sls_cd1) doDispRslt_cost_sls_cd1_NC(info);
		else if (nc == columnDispRslt_cost_sls_nm1) doDispRslt_cost_sls_nm1_NC(info);
		else if (nc == columnDispRslt_cost_sls_cd2) doDispRslt_cost_sls_cd2_NC(info);
		else if (nc == columnDispRslt_cost_sls_nm2) doDispRslt_cost_sls_nm2_NC(info);
		else if (nc == columnDispRslt_cost_sls_cd3) doDispRslt_cost_sls_cd3_NC(info);
		else if (nc == columnDispRslt_cost_sls_nm3) doDispRslt_cost_sls_nm3_NC(info);
		else if (nc == columnDispRslt_cost_sls_cd4) doDispRslt_cost_sls_cd4_NC(info);
		else if (nc == columnDispRslt_cost_sls_nm4) doDispRslt_cost_sls_nm4_NC(info);
		else if (nc == columnDispRslt_cost_sls_cd5) doDispRslt_cost_sls_cd5_NC(info);
		else if (nc == columnDispRslt_cost_sls_nm5) doDispRslt_cost_sls_nm5_NC(info);
		else if (nc == columnDispRslt_asst_typ) doDispRslt_asst_typ_NC(info);
		else if (nc == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NC(info);
		else if (nc == columnDispRslt_unit_cd) doDispRslt_unit_cd_NC(info);
		else if (nc == columnDispRslt_unit_nm) doDispRslt_unit_nm_NC(info);
		else if (nc == columnDispRslt_dec_place) doDispRslt_dec_place_NC(info);
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
	 * [Cnd]パネルの[mng_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mng_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm5_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mng_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_jnl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cntry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cntry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_area_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_area_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cntry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cntry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_area_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_area_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls4_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls5_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls5_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_grp_flg1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[mng_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mng_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_nm_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_nm_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd4_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm4_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd5_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm5_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dec_place_NC(MCEventInfo info){
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
		else if (ne == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_NE(info);
		else if (ne == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_NE(info);
		else if (ne == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NE(info);
		else if (ne == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NE(info);
		else if (ne == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NE(info);
		else if (ne == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NE(info);
		else if (ne == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_sno1) doCnd_sno1_NE(info);
		else if (ne == Cnd_sno2) doCnd_sno2_NE(info);
		else if (ne == Cnd_sno3) doCnd_sno3_NE(info);
		else if (ne == Cnd_sno4) doCnd_sno4_NE(info);
		else if (ne == Cnd_asst_typ) doCnd_asst_typ_NE(info);
		else if (ne == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NE(info);
		else if (ne == Cnd_cst_cd) doCnd_cst_cd_NE(info);
		else if (ne == Cnd_cst_nm) doCnd_cst_nm_NE(info);
		else if (ne == Cnd_cst_cntry_cd) doCnd_cst_cntry_cd_NE(info);
		else if (ne == Cnd_cst_cntry_nm) doCnd_cst_cntry_nm_NE(info);
		else if (ne == Cnd_cst_area_cd) doCnd_cst_area_cd_NE(info);
		else if (ne == Cnd_cst_area_nm) doCnd_cst_area_nm_NE(info);
		else if (ne == Cnd_dlv_cd) doCnd_dlv_cd_NE(info);
		else if (ne == Cnd_dlv_nm) doCnd_dlv_nm_NE(info);
		else if (ne == Cnd_dlv_cntry_cd) doCnd_dlv_cntry_cd_NE(info);
		else if (ne == Cnd_dlv_cntry_nm) doCnd_dlv_cntry_nm_NE(info);
		else if (ne == Cnd_dlv_area_cd) doCnd_dlv_area_cd_NE(info);
		else if (ne == Cnd_dlv_area_nm) doCnd_dlv_area_nm_NE(info);
		else if (ne == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NE(info);
		else if (ne == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NE(info);
		else if (ne == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NE(info);
		else if (ne == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NE(info);
		else if (ne == Cnd_alc_dpt_cd) doCnd_alc_dpt_cd_NE(info);
		else if (ne == Cnd_alc_dpt_nm) doCnd_alc_dpt_nm_NE(info);
		else if (ne == Cnd_dest_cd1) doCnd_dest_cd1_NE(info);
		else if (ne == Cnd_dest_nm1) doCnd_dest_nm1_NE(info);
		else if (ne == Cnd_dest_cd2) doCnd_dest_cd2_NE(info);
		else if (ne == Cnd_dest_nm2) doCnd_dest_nm2_NE(info);
		else if (ne == Cnd_dest_cd3) doCnd_dest_cd3_NE(info);
		else if (ne == Cnd_dest_nm3) doCnd_dest_nm3_NE(info);
		else if (ne == Cnd_cost_sls_cd1) doCnd_cost_sls_cd1_NE(info);
		else if (ne == Cnd_cost_sls_nm1) doCnd_cost_sls_nm1_NE(info);
		else if (ne == Cnd_cost_sls_cd2) doCnd_cost_sls_cd2_NE(info);
		else if (ne == Cnd_cost_sls_nm2) doCnd_cost_sls_nm2_NE(info);
		else if (ne == Cnd_cost_sls_cd3) doCnd_cost_sls_cd3_NE(info);
		else if (ne == Cnd_cost_sls_nm3) doCnd_cost_sls_nm3_NE(info);
		else if (ne == Cnd_cost_sls_cd4) doCnd_cost_sls_cd4_NE(info);
		else if (ne == Cnd_cost_sls_nm4) doCnd_cost_sls_nm4_NE(info);
		else if (ne == Cnd_cost_sls_cd5) doCnd_cost_sls_cd5_NE(info);
		else if (ne == Cnd_cost_sls_nm5) doCnd_cost_sls_nm5_NE(info);
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
		else if (ne == Cnd_cst_grp_cd1) doCnd_cst_grp_cd1_NE(info);
		else if (ne == Cnd_cst_grp_nm1) doCnd_cst_grp_nm1_NE(info);
		else if (ne == Cnd_cst_grp_cd2) doCnd_cst_grp_cd2_NE(info);
		else if (ne == Cnd_cst_grp_nm2) doCnd_cst_grp_nm2_NE(info);
		else if (ne == Cnd_cst_grp_cd3) doCnd_cst_grp_cd3_NE(info);
		else if (ne == Cnd_cst_grp_nm3) doCnd_cst_grp_nm3_NE(info);
		else if (ne == Cnd_cst_grp_cd4) doCnd_cst_grp_cd4_NE(info);
		else if (ne == Cnd_cst_grp_nm4) doCnd_cst_grp_nm4_NE(info);
		else if (ne == Cnd_cst_grp_cd5) doCnd_cst_grp_cd5_NE(info);
		else if (ne == Cnd_cst_grp_nm5) doCnd_cst_grp_nm5_NE(info);
		else if (ne == Cnd_cst_grp_cd6) doCnd_cst_grp_cd6_NE(info);
		else if (ne == Cnd_cst_grp_nm6) doCnd_cst_grp_nm6_NE(info);
		else if (ne == Cnd_cst_grp_cd7) doCnd_cst_grp_cd7_NE(info);
		else if (ne == Cnd_cst_grp_nm7) doCnd_cst_grp_nm7_NE(info);
		else if (ne == Cnd_cst_grp_cd8) doCnd_cst_grp_cd8_NE(info);
		else if (ne == Cnd_cst_grp_nm8) doCnd_cst_grp_nm8_NE(info);
		else if (ne == Cnd_cst_grp_cd9) doCnd_cst_grp_cd9_NE(info);
		else if (ne == Cnd_cst_grp_nm9) doCnd_cst_grp_nm9_NE(info);
		else if (ne == Cnd_cst_grp_cd10) doCnd_cst_grp_cd10_NE(info);
		else if (ne == Cnd_cst_grp_nm10) doCnd_cst_grp_nm10_NE(info);
		else if (ne == Cnd_dlv_grp_cd1) doCnd_dlv_grp_cd1_NE(info);
		else if (ne == Cnd_dlv_grp_nm1) doCnd_dlv_grp_nm1_NE(info);
		else if (ne == Cnd_dlv_grp_cd2) doCnd_dlv_grp_cd2_NE(info);
		else if (ne == Cnd_dlv_grp_nm2) doCnd_dlv_grp_nm2_NE(info);
		else if (ne == Cnd_dlv_grp_cd3) doCnd_dlv_grp_cd3_NE(info);
		else if (ne == Cnd_dlv_grp_nm3) doCnd_dlv_grp_nm3_NE(info);
		else if (ne == Cnd_dlv_grp_cd4) doCnd_dlv_grp_cd4_NE(info);
		else if (ne == Cnd_dlv_grp_nm4) doCnd_dlv_grp_nm4_NE(info);
		else if (ne == Cnd_dlv_grp_cd5) doCnd_dlv_grp_cd5_NE(info);
		else if (ne == Cnd_dlv_grp_nm5) doCnd_dlv_grp_nm5_NE(info);
		else if (ne == Cnd_dlv_grp_cd6) doCnd_dlv_grp_cd6_NE(info);
		else if (ne == Cnd_dlv_grp_nm6) doCnd_dlv_grp_nm6_NE(info);
		else if (ne == Cnd_dlv_grp_cd7) doCnd_dlv_grp_cd7_NE(info);
		else if (ne == Cnd_dlv_grp_nm7) doCnd_dlv_grp_nm7_NE(info);
		else if (ne == Cnd_dlv_grp_cd8) doCnd_dlv_grp_cd8_NE(info);
		else if (ne == Cnd_dlv_grp_nm8) doCnd_dlv_grp_nm8_NE(info);
		else if (ne == Cnd_dlv_grp_cd9) doCnd_dlv_grp_cd9_NE(info);
		else if (ne == Cnd_dlv_grp_nm9) doCnd_dlv_grp_nm9_NE(info);
		else if (ne == Cnd_dlv_grp_cd10) doCnd_dlv_grp_cd10_NE(info);
		else if (ne == Cnd_dlv_grp_nm10) doCnd_dlv_grp_nm10_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_mng_dpt_flg) doCnd_mng_dpt_flg_NE(info);
		else if (ne == Cnd_itm_flg) doCnd_itm_flg_NE(info);
		else if (ne == Cnd_itm_typ_flg) doCnd_itm_typ_flg_NE(info);
		else if (ne == Cnd_itm_typ_d_flg) doCnd_itm_typ_d_flg_NE(info);
		else if (ne == Cnd_itm_jnl_flg) doCnd_itm_jnl_flg_NE(info);
		else if (ne == Cnd_lot_flg) doCnd_lot_flg_NE(info);
		else if (ne == Cnd_sublot_flg) doCnd_sublot_flg_NE(info);
		else if (ne == Cnd_sno1_flg) doCnd_sno1_flg_NE(info);
		else if (ne == Cnd_sno2_flg) doCnd_sno2_flg_NE(info);
		else if (ne == Cnd_sno3_flg) doCnd_sno3_flg_NE(info);
		else if (ne == Cnd_sno4_flg) doCnd_sno4_flg_NE(info);
		else if (ne == Cnd_cst_flg) doCnd_cst_flg_NE(info);
		else if (ne == Cnd_cst_cntry_flg) doCnd_cst_cntry_flg_NE(info);
		else if (ne == Cnd_cst_area_flg) doCnd_cst_area_flg_NE(info);
		else if (ne == Cnd_dlv_flg) doCnd_dlv_flg_NE(info);
		else if (ne == Cnd_dlv_cntry_flg) doCnd_dlv_cntry_flg_NE(info);
		else if (ne == Cnd_dlv_area_flg) doCnd_dlv_area_flg_NE(info);
		else if (ne == Cnd_sls_dpt_flg) doCnd_sls_dpt_flg_NE(info);
		else if (ne == Cnd_sls_usr_flg) doCnd_sls_usr_flg_NE(info);
		else if (ne == Cnd_alc_dpt_flg) doCnd_alc_dpt_flg_NE(info);
		else if (ne == Cnd_dest1_flg) doCnd_dest1_flg_NE(info);
		else if (ne == Cnd_dest2_flg) doCnd_dest2_flg_NE(info);
		else if (ne == Cnd_dest3_flg) doCnd_dest3_flg_NE(info);
		else if (ne == Cnd_cost_sls1_flg) doCnd_cost_sls1_flg_NE(info);
		else if (ne == Cnd_cost_sls2_flg) doCnd_cost_sls2_flg_NE(info);
		else if (ne == Cnd_cost_sls3_flg) doCnd_cost_sls3_flg_NE(info);
		else if (ne == Cnd_cost_sls4_flg) doCnd_cost_sls4_flg_NE(info);
		else if (ne == Cnd_cost_sls5_flg) doCnd_cost_sls5_flg_NE(info);
		else if (ne == Cnd_asst_flg) doCnd_asst_flg_NE(info);
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
		else if (ne == Cnd_cst_grp_flg1) doCnd_cst_grp_flg1_NE(info);
		else if (ne == Cnd_cst_grp_flg2) doCnd_cst_grp_flg2_NE(info);
		else if (ne == Cnd_cst_grp_flg3) doCnd_cst_grp_flg3_NE(info);
		else if (ne == Cnd_cst_grp_flg4) doCnd_cst_grp_flg4_NE(info);
		else if (ne == Cnd_cst_grp_flg5) doCnd_cst_grp_flg5_NE(info);
		else if (ne == Cnd_cst_grp_flg6) doCnd_cst_grp_flg6_NE(info);
		else if (ne == Cnd_cst_grp_flg7) doCnd_cst_grp_flg7_NE(info);
		else if (ne == Cnd_cst_grp_flg8) doCnd_cst_grp_flg8_NE(info);
		else if (ne == Cnd_cst_grp_flg9) doCnd_cst_grp_flg9_NE(info);
		else if (ne == Cnd_cst_grp_flg10) doCnd_cst_grp_flg10_NE(info);
		else if (ne == Cnd_dlv_grp_flg1) doCnd_dlv_grp_flg1_NE(info);
		else if (ne == Cnd_dlv_grp_flg2) doCnd_dlv_grp_flg2_NE(info);
		else if (ne == Cnd_dlv_grp_flg3) doCnd_dlv_grp_flg3_NE(info);
		else if (ne == Cnd_dlv_grp_flg4) doCnd_dlv_grp_flg4_NE(info);
		else if (ne == Cnd_dlv_grp_flg5) doCnd_dlv_grp_flg5_NE(info);
		else if (ne == Cnd_dlv_grp_flg6) doCnd_dlv_grp_flg6_NE(info);
		else if (ne == Cnd_dlv_grp_flg7) doCnd_dlv_grp_flg7_NE(info);
		else if (ne == Cnd_dlv_grp_flg8) doCnd_dlv_grp_flg8_NE(info);
		else if (ne == Cnd_dlv_grp_flg9) doCnd_dlv_grp_flg9_NE(info);
		else if (ne == Cnd_dlv_grp_flg10) doCnd_dlv_grp_flg10_NE(info);
		else if (ne == Cnd_disp_key) doCnd_disp_key_NE(info);
		else if (ne == columnDispRslt_wg_cd) doDispRslt_wg_cd_NE(info);
		else if (ne == columnDispRslt_wg_nm) doDispRslt_wg_nm_NE(info);
		else if (ne == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_NE(info);
		else if (ne == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_NE(info);
		else if (ne == columnDispRslt_itm_typ) doDispRslt_itm_typ_NE(info);
		else if (ne == columnDispRslt_itm_typ_nm) doDispRslt_itm_typ_nm_NE(info);
		else if (ne == columnDispRslt_itm_typ_d_cd) doDispRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnDispRslt_itm_typ_d_nm) doDispRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnDispRslt_itm_jnl_cd) doDispRslt_itm_jnl_cd_NE(info);
		else if (ne == columnDispRslt_itm_jnl_nm) doDispRslt_itm_jnl_nm_NE(info);
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
		else if (ne == columnDispRslt_cst_cd) doDispRslt_cst_cd_NE(info);
		else if (ne == columnDispRslt_cst_nm) doDispRslt_cst_nm_NE(info);
		else if (ne == columnDispRslt_cst_grp_cd1) doDispRslt_cst_grp_cd1_NE(info);
		else if (ne == columnDispRslt_cst_grp_nm1) doDispRslt_cst_grp_nm1_NE(info);
		else if (ne == columnDispRslt_cst_grp_cd2) doDispRslt_cst_grp_cd2_NE(info);
		else if (ne == columnDispRslt_cst_grp_nm2) doDispRslt_cst_grp_nm2_NE(info);
		else if (ne == columnDispRslt_cst_grp_cd3) doDispRslt_cst_grp_cd3_NE(info);
		else if (ne == columnDispRslt_cst_grp_nm3) doDispRslt_cst_grp_nm3_NE(info);
		else if (ne == columnDispRslt_cst_grp_cd4) doDispRslt_cst_grp_cd4_NE(info);
		else if (ne == columnDispRslt_cst_grp_nm4) doDispRslt_cst_grp_nm4_NE(info);
		else if (ne == columnDispRslt_cst_grp_cd5) doDispRslt_cst_grp_cd5_NE(info);
		else if (ne == columnDispRslt_cst_grp_nm5) doDispRslt_cst_grp_nm5_NE(info);
		else if (ne == columnDispRslt_cst_grp_cd6) doDispRslt_cst_grp_cd6_NE(info);
		else if (ne == columnDispRslt_cst_grp_nm6) doDispRslt_cst_grp_nm6_NE(info);
		else if (ne == columnDispRslt_cst_grp_cd7) doDispRslt_cst_grp_cd7_NE(info);
		else if (ne == columnDispRslt_cst_grp_nm7) doDispRslt_cst_grp_nm7_NE(info);
		else if (ne == columnDispRslt_cst_grp_cd8) doDispRslt_cst_grp_cd8_NE(info);
		else if (ne == columnDispRslt_cst_grp_nm8) doDispRslt_cst_grp_nm8_NE(info);
		else if (ne == columnDispRslt_cst_grp_cd9) doDispRslt_cst_grp_cd9_NE(info);
		else if (ne == columnDispRslt_cst_grp_nm9) doDispRslt_cst_grp_nm9_NE(info);
		else if (ne == columnDispRslt_cst_grp_cd10) doDispRslt_cst_grp_cd10_NE(info);
		else if (ne == columnDispRslt_cst_grp_nm10) doDispRslt_cst_grp_nm10_NE(info);
		else if (ne == columnDispRslt_cst_cntry_cd) doDispRslt_cst_cntry_cd_NE(info);
		else if (ne == columnDispRslt_cst_cntry_nm) doDispRslt_cst_cntry_nm_NE(info);
		else if (ne == columnDispRslt_cst_area_cd) doDispRslt_cst_area_cd_NE(info);
		else if (ne == columnDispRslt_cst_area_nm) doDispRslt_cst_area_nm_NE(info);
		else if (ne == columnDispRslt_dlv_cd) doDispRslt_dlv_cd_NE(info);
		else if (ne == columnDispRslt_dlv_nm) doDispRslt_dlv_nm_NE(info);
		else if (ne == columnDispRslt_dlv_grp_cd1) doDispRslt_dlv_grp_cd1_NE(info);
		else if (ne == columnDispRslt_dlv_grp_nm1) doDispRslt_dlv_grp_nm1_NE(info);
		else if (ne == columnDispRslt_dlv_grp_cd2) doDispRslt_dlv_grp_cd2_NE(info);
		else if (ne == columnDispRslt_dlv_grp_nm2) doDispRslt_dlv_grp_nm2_NE(info);
		else if (ne == columnDispRslt_dlv_grp_cd3) doDispRslt_dlv_grp_cd3_NE(info);
		else if (ne == columnDispRslt_dlv_grp_nm3) doDispRslt_dlv_grp_nm3_NE(info);
		else if (ne == columnDispRslt_dlv_grp_cd4) doDispRslt_dlv_grp_cd4_NE(info);
		else if (ne == columnDispRslt_dlv_grp_nm4) doDispRslt_dlv_grp_nm4_NE(info);
		else if (ne == columnDispRslt_dlv_grp_cd5) doDispRslt_dlv_grp_cd5_NE(info);
		else if (ne == columnDispRslt_dlv_grp_nm5) doDispRslt_dlv_grp_nm5_NE(info);
		else if (ne == columnDispRslt_dlv_grp_cd6) doDispRslt_dlv_grp_cd6_NE(info);
		else if (ne == columnDispRslt_dlv_grp_nm6) doDispRslt_dlv_grp_nm6_NE(info);
		else if (ne == columnDispRslt_dlv_grp_cd7) doDispRslt_dlv_grp_cd7_NE(info);
		else if (ne == columnDispRslt_dlv_grp_nm7) doDispRslt_dlv_grp_nm7_NE(info);
		else if (ne == columnDispRslt_dlv_grp_cd8) doDispRslt_dlv_grp_cd8_NE(info);
		else if (ne == columnDispRslt_dlv_grp_nm8) doDispRslt_dlv_grp_nm8_NE(info);
		else if (ne == columnDispRslt_dlv_grp_cd9) doDispRslt_dlv_grp_cd9_NE(info);
		else if (ne == columnDispRslt_dlv_grp_nm9) doDispRslt_dlv_grp_nm9_NE(info);
		else if (ne == columnDispRslt_dlv_grp_cd10) doDispRslt_dlv_grp_cd10_NE(info);
		else if (ne == columnDispRslt_dlv_grp_nm10) doDispRslt_dlv_grp_nm10_NE(info);
		else if (ne == columnDispRslt_dlv_cntry_cd) doDispRslt_dlv_cntry_cd_NE(info);
		else if (ne == columnDispRslt_dlv_cntry_nm) doDispRslt_dlv_cntry_nm_NE(info);
		else if (ne == columnDispRslt_dlv_area_cd) doDispRslt_dlv_area_cd_NE(info);
		else if (ne == columnDispRslt_dlv_area_nm) doDispRslt_dlv_area_nm_NE(info);
		else if (ne == columnDispRslt_sls_dpt_cd) doDispRslt_sls_dpt_cd_NE(info);
		else if (ne == columnDispRslt_sls_dpt_nm) doDispRslt_sls_dpt_nm_NE(info);
		else if (ne == columnDispRslt_sls_usr_cd) doDispRslt_sls_usr_cd_NE(info);
		else if (ne == columnDispRslt_sls_usr_nm) doDispRslt_sls_usr_nm_NE(info);
		else if (ne == columnDispRslt_alc_dpt_cd) doDispRslt_alc_dpt_cd_NE(info);
		else if (ne == columnDispRslt_alc_dpt_nm) doDispRslt_alc_dpt_nm_NE(info);
		else if (ne == columnDispRslt_dest_cd1) doDispRslt_dest_cd1_NE(info);
		else if (ne == columnDispRslt_dest_nm1) doDispRslt_dest_nm1_NE(info);
		else if (ne == columnDispRslt_dest_cd2) doDispRslt_dest_cd2_NE(info);
		else if (ne == columnDispRslt_dest_nm2) doDispRslt_dest_nm2_NE(info);
		else if (ne == columnDispRslt_dest_cd3) doDispRslt_dest_cd3_NE(info);
		else if (ne == columnDispRslt_dest_nm3) doDispRslt_dest_nm3_NE(info);
		else if (ne == columnDispRslt_cost_sls_cd1) doDispRslt_cost_sls_cd1_NE(info);
		else if (ne == columnDispRslt_cost_sls_nm1) doDispRslt_cost_sls_nm1_NE(info);
		else if (ne == columnDispRslt_cost_sls_cd2) doDispRslt_cost_sls_cd2_NE(info);
		else if (ne == columnDispRslt_cost_sls_nm2) doDispRslt_cost_sls_nm2_NE(info);
		else if (ne == columnDispRslt_cost_sls_cd3) doDispRslt_cost_sls_cd3_NE(info);
		else if (ne == columnDispRslt_cost_sls_nm3) doDispRslt_cost_sls_nm3_NE(info);
		else if (ne == columnDispRslt_cost_sls_cd4) doDispRslt_cost_sls_cd4_NE(info);
		else if (ne == columnDispRslt_cost_sls_nm4) doDispRslt_cost_sls_nm4_NE(info);
		else if (ne == columnDispRslt_cost_sls_cd5) doDispRslt_cost_sls_cd5_NE(info);
		else if (ne == columnDispRslt_cost_sls_nm5) doDispRslt_cost_sls_nm5_NE(info);
		else if (ne == columnDispRslt_asst_typ) doDispRslt_asst_typ_NE(info);
		else if (ne == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NE(info);
		else if (ne == columnDispRslt_unit_cd) doDispRslt_unit_cd_NE(info);
		else if (ne == columnDispRslt_unit_nm) doDispRslt_unit_nm_NE(info);
		else if (ne == columnDispRslt_dec_place) doDispRslt_dec_place_NE(info);
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
	 * [Cnd]パネルの[mng_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mng_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm5_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mng_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_jnl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cntry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cntry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_area_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_area_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cntry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cntry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_area_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_area_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls4_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls5_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls5_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_grp_flg1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[mng_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mng_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_nm_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_nm_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd4_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm4_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd5_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm5_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dec_place_NE(MCEventInfo info){
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
		else if (nx == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_NX(info);
		else if (nx == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_NX(info);
		else if (nx == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NX(info);
		else if (nx == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NX(info);
		else if (nx == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NX(info);
		else if (nx == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NX(info);
		else if (nx == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_sno1) doCnd_sno1_NX(info);
		else if (nx == Cnd_sno2) doCnd_sno2_NX(info);
		else if (nx == Cnd_sno3) doCnd_sno3_NX(info);
		else if (nx == Cnd_sno4) doCnd_sno4_NX(info);
		else if (nx == Cnd_asst_typ) doCnd_asst_typ_NX(info);
		else if (nx == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NX(info);
		else if (nx == Cnd_cst_cd) doCnd_cst_cd_NX(info);
		else if (nx == Cnd_cst_nm) doCnd_cst_nm_NX(info);
		else if (nx == Cnd_cst_cntry_cd) doCnd_cst_cntry_cd_NX(info);
		else if (nx == Cnd_cst_cntry_nm) doCnd_cst_cntry_nm_NX(info);
		else if (nx == Cnd_cst_area_cd) doCnd_cst_area_cd_NX(info);
		else if (nx == Cnd_cst_area_nm) doCnd_cst_area_nm_NX(info);
		else if (nx == Cnd_dlv_cd) doCnd_dlv_cd_NX(info);
		else if (nx == Cnd_dlv_nm) doCnd_dlv_nm_NX(info);
		else if (nx == Cnd_dlv_cntry_cd) doCnd_dlv_cntry_cd_NX(info);
		else if (nx == Cnd_dlv_cntry_nm) doCnd_dlv_cntry_nm_NX(info);
		else if (nx == Cnd_dlv_area_cd) doCnd_dlv_area_cd_NX(info);
		else if (nx == Cnd_dlv_area_nm) doCnd_dlv_area_nm_NX(info);
		else if (nx == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NX(info);
		else if (nx == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NX(info);
		else if (nx == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NX(info);
		else if (nx == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NX(info);
		else if (nx == Cnd_alc_dpt_cd) doCnd_alc_dpt_cd_NX(info);
		else if (nx == Cnd_alc_dpt_nm) doCnd_alc_dpt_nm_NX(info);
		else if (nx == Cnd_dest_cd1) doCnd_dest_cd1_NX(info);
		else if (nx == Cnd_dest_nm1) doCnd_dest_nm1_NX(info);
		else if (nx == Cnd_dest_cd2) doCnd_dest_cd2_NX(info);
		else if (nx == Cnd_dest_nm2) doCnd_dest_nm2_NX(info);
		else if (nx == Cnd_dest_cd3) doCnd_dest_cd3_NX(info);
		else if (nx == Cnd_dest_nm3) doCnd_dest_nm3_NX(info);
		else if (nx == Cnd_cost_sls_cd1) doCnd_cost_sls_cd1_NX(info);
		else if (nx == Cnd_cost_sls_nm1) doCnd_cost_sls_nm1_NX(info);
		else if (nx == Cnd_cost_sls_cd2) doCnd_cost_sls_cd2_NX(info);
		else if (nx == Cnd_cost_sls_nm2) doCnd_cost_sls_nm2_NX(info);
		else if (nx == Cnd_cost_sls_cd3) doCnd_cost_sls_cd3_NX(info);
		else if (nx == Cnd_cost_sls_nm3) doCnd_cost_sls_nm3_NX(info);
		else if (nx == Cnd_cost_sls_cd4) doCnd_cost_sls_cd4_NX(info);
		else if (nx == Cnd_cost_sls_nm4) doCnd_cost_sls_nm4_NX(info);
		else if (nx == Cnd_cost_sls_cd5) doCnd_cost_sls_cd5_NX(info);
		else if (nx == Cnd_cost_sls_nm5) doCnd_cost_sls_nm5_NX(info);
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
		else if (nx == Cnd_cst_grp_cd1) doCnd_cst_grp_cd1_NX(info);
		else if (nx == Cnd_cst_grp_nm1) doCnd_cst_grp_nm1_NX(info);
		else if (nx == Cnd_cst_grp_cd2) doCnd_cst_grp_cd2_NX(info);
		else if (nx == Cnd_cst_grp_nm2) doCnd_cst_grp_nm2_NX(info);
		else if (nx == Cnd_cst_grp_cd3) doCnd_cst_grp_cd3_NX(info);
		else if (nx == Cnd_cst_grp_nm3) doCnd_cst_grp_nm3_NX(info);
		else if (nx == Cnd_cst_grp_cd4) doCnd_cst_grp_cd4_NX(info);
		else if (nx == Cnd_cst_grp_nm4) doCnd_cst_grp_nm4_NX(info);
		else if (nx == Cnd_cst_grp_cd5) doCnd_cst_grp_cd5_NX(info);
		else if (nx == Cnd_cst_grp_nm5) doCnd_cst_grp_nm5_NX(info);
		else if (nx == Cnd_cst_grp_cd6) doCnd_cst_grp_cd6_NX(info);
		else if (nx == Cnd_cst_grp_nm6) doCnd_cst_grp_nm6_NX(info);
		else if (nx == Cnd_cst_grp_cd7) doCnd_cst_grp_cd7_NX(info);
		else if (nx == Cnd_cst_grp_nm7) doCnd_cst_grp_nm7_NX(info);
		else if (nx == Cnd_cst_grp_cd8) doCnd_cst_grp_cd8_NX(info);
		else if (nx == Cnd_cst_grp_nm8) doCnd_cst_grp_nm8_NX(info);
		else if (nx == Cnd_cst_grp_cd9) doCnd_cst_grp_cd9_NX(info);
		else if (nx == Cnd_cst_grp_nm9) doCnd_cst_grp_nm9_NX(info);
		else if (nx == Cnd_cst_grp_cd10) doCnd_cst_grp_cd10_NX(info);
		else if (nx == Cnd_cst_grp_nm10) doCnd_cst_grp_nm10_NX(info);
		else if (nx == Cnd_dlv_grp_cd1) doCnd_dlv_grp_cd1_NX(info);
		else if (nx == Cnd_dlv_grp_nm1) doCnd_dlv_grp_nm1_NX(info);
		else if (nx == Cnd_dlv_grp_cd2) doCnd_dlv_grp_cd2_NX(info);
		else if (nx == Cnd_dlv_grp_nm2) doCnd_dlv_grp_nm2_NX(info);
		else if (nx == Cnd_dlv_grp_cd3) doCnd_dlv_grp_cd3_NX(info);
		else if (nx == Cnd_dlv_grp_nm3) doCnd_dlv_grp_nm3_NX(info);
		else if (nx == Cnd_dlv_grp_cd4) doCnd_dlv_grp_cd4_NX(info);
		else if (nx == Cnd_dlv_grp_nm4) doCnd_dlv_grp_nm4_NX(info);
		else if (nx == Cnd_dlv_grp_cd5) doCnd_dlv_grp_cd5_NX(info);
		else if (nx == Cnd_dlv_grp_nm5) doCnd_dlv_grp_nm5_NX(info);
		else if (nx == Cnd_dlv_grp_cd6) doCnd_dlv_grp_cd6_NX(info);
		else if (nx == Cnd_dlv_grp_nm6) doCnd_dlv_grp_nm6_NX(info);
		else if (nx == Cnd_dlv_grp_cd7) doCnd_dlv_grp_cd7_NX(info);
		else if (nx == Cnd_dlv_grp_nm7) doCnd_dlv_grp_nm7_NX(info);
		else if (nx == Cnd_dlv_grp_cd8) doCnd_dlv_grp_cd8_NX(info);
		else if (nx == Cnd_dlv_grp_nm8) doCnd_dlv_grp_nm8_NX(info);
		else if (nx == Cnd_dlv_grp_cd9) doCnd_dlv_grp_cd9_NX(info);
		else if (nx == Cnd_dlv_grp_nm9) doCnd_dlv_grp_nm9_NX(info);
		else if (nx == Cnd_dlv_grp_cd10) doCnd_dlv_grp_cd10_NX(info);
		else if (nx == Cnd_dlv_grp_nm10) doCnd_dlv_grp_nm10_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_mng_dpt_flg) doCnd_mng_dpt_flg_NX(info);
		else if (nx == Cnd_itm_flg) doCnd_itm_flg_NX(info);
		else if (nx == Cnd_itm_typ_flg) doCnd_itm_typ_flg_NX(info);
		else if (nx == Cnd_itm_typ_d_flg) doCnd_itm_typ_d_flg_NX(info);
		else if (nx == Cnd_itm_jnl_flg) doCnd_itm_jnl_flg_NX(info);
		else if (nx == Cnd_lot_flg) doCnd_lot_flg_NX(info);
		else if (nx == Cnd_sublot_flg) doCnd_sublot_flg_NX(info);
		else if (nx == Cnd_sno1_flg) doCnd_sno1_flg_NX(info);
		else if (nx == Cnd_sno2_flg) doCnd_sno2_flg_NX(info);
		else if (nx == Cnd_sno3_flg) doCnd_sno3_flg_NX(info);
		else if (nx == Cnd_sno4_flg) doCnd_sno4_flg_NX(info);
		else if (nx == Cnd_cst_flg) doCnd_cst_flg_NX(info);
		else if (nx == Cnd_cst_cntry_flg) doCnd_cst_cntry_flg_NX(info);
		else if (nx == Cnd_cst_area_flg) doCnd_cst_area_flg_NX(info);
		else if (nx == Cnd_dlv_flg) doCnd_dlv_flg_NX(info);
		else if (nx == Cnd_dlv_cntry_flg) doCnd_dlv_cntry_flg_NX(info);
		else if (nx == Cnd_dlv_area_flg) doCnd_dlv_area_flg_NX(info);
		else if (nx == Cnd_sls_dpt_flg) doCnd_sls_dpt_flg_NX(info);
		else if (nx == Cnd_sls_usr_flg) doCnd_sls_usr_flg_NX(info);
		else if (nx == Cnd_alc_dpt_flg) doCnd_alc_dpt_flg_NX(info);
		else if (nx == Cnd_dest1_flg) doCnd_dest1_flg_NX(info);
		else if (nx == Cnd_dest2_flg) doCnd_dest2_flg_NX(info);
		else if (nx == Cnd_dest3_flg) doCnd_dest3_flg_NX(info);
		else if (nx == Cnd_cost_sls1_flg) doCnd_cost_sls1_flg_NX(info);
		else if (nx == Cnd_cost_sls2_flg) doCnd_cost_sls2_flg_NX(info);
		else if (nx == Cnd_cost_sls3_flg) doCnd_cost_sls3_flg_NX(info);
		else if (nx == Cnd_cost_sls4_flg) doCnd_cost_sls4_flg_NX(info);
		else if (nx == Cnd_cost_sls5_flg) doCnd_cost_sls5_flg_NX(info);
		else if (nx == Cnd_asst_flg) doCnd_asst_flg_NX(info);
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
		else if (nx == Cnd_cst_grp_flg1) doCnd_cst_grp_flg1_NX(info);
		else if (nx == Cnd_cst_grp_flg2) doCnd_cst_grp_flg2_NX(info);
		else if (nx == Cnd_cst_grp_flg3) doCnd_cst_grp_flg3_NX(info);
		else if (nx == Cnd_cst_grp_flg4) doCnd_cst_grp_flg4_NX(info);
		else if (nx == Cnd_cst_grp_flg5) doCnd_cst_grp_flg5_NX(info);
		else if (nx == Cnd_cst_grp_flg6) doCnd_cst_grp_flg6_NX(info);
		else if (nx == Cnd_cst_grp_flg7) doCnd_cst_grp_flg7_NX(info);
		else if (nx == Cnd_cst_grp_flg8) doCnd_cst_grp_flg8_NX(info);
		else if (nx == Cnd_cst_grp_flg9) doCnd_cst_grp_flg9_NX(info);
		else if (nx == Cnd_cst_grp_flg10) doCnd_cst_grp_flg10_NX(info);
		else if (nx == Cnd_dlv_grp_flg1) doCnd_dlv_grp_flg1_NX(info);
		else if (nx == Cnd_dlv_grp_flg2) doCnd_dlv_grp_flg2_NX(info);
		else if (nx == Cnd_dlv_grp_flg3) doCnd_dlv_grp_flg3_NX(info);
		else if (nx == Cnd_dlv_grp_flg4) doCnd_dlv_grp_flg4_NX(info);
		else if (nx == Cnd_dlv_grp_flg5) doCnd_dlv_grp_flg5_NX(info);
		else if (nx == Cnd_dlv_grp_flg6) doCnd_dlv_grp_flg6_NX(info);
		else if (nx == Cnd_dlv_grp_flg7) doCnd_dlv_grp_flg7_NX(info);
		else if (nx == Cnd_dlv_grp_flg8) doCnd_dlv_grp_flg8_NX(info);
		else if (nx == Cnd_dlv_grp_flg9) doCnd_dlv_grp_flg9_NX(info);
		else if (nx == Cnd_dlv_grp_flg10) doCnd_dlv_grp_flg10_NX(info);
		else if (nx == Cnd_disp_key) doCnd_disp_key_NX(info);
		else if (nx == columnDispRslt_wg_cd) doDispRslt_wg_cd_NX(info);
		else if (nx == columnDispRslt_wg_nm) doDispRslt_wg_nm_NX(info);
		else if (nx == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_NX(info);
		else if (nx == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_NX(info);
		else if (nx == columnDispRslt_itm_typ) doDispRslt_itm_typ_NX(info);
		else if (nx == columnDispRslt_itm_typ_nm) doDispRslt_itm_typ_nm_NX(info);
		else if (nx == columnDispRslt_itm_typ_d_cd) doDispRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnDispRslt_itm_typ_d_nm) doDispRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnDispRslt_itm_jnl_cd) doDispRslt_itm_jnl_cd_NX(info);
		else if (nx == columnDispRslt_itm_jnl_nm) doDispRslt_itm_jnl_nm_NX(info);
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
		else if (nx == columnDispRslt_cst_cd) doDispRslt_cst_cd_NX(info);
		else if (nx == columnDispRslt_cst_nm) doDispRslt_cst_nm_NX(info);
		else if (nx == columnDispRslt_cst_grp_cd1) doDispRslt_cst_grp_cd1_NX(info);
		else if (nx == columnDispRslt_cst_grp_nm1) doDispRslt_cst_grp_nm1_NX(info);
		else if (nx == columnDispRslt_cst_grp_cd2) doDispRslt_cst_grp_cd2_NX(info);
		else if (nx == columnDispRslt_cst_grp_nm2) doDispRslt_cst_grp_nm2_NX(info);
		else if (nx == columnDispRslt_cst_grp_cd3) doDispRslt_cst_grp_cd3_NX(info);
		else if (nx == columnDispRslt_cst_grp_nm3) doDispRslt_cst_grp_nm3_NX(info);
		else if (nx == columnDispRslt_cst_grp_cd4) doDispRslt_cst_grp_cd4_NX(info);
		else if (nx == columnDispRslt_cst_grp_nm4) doDispRslt_cst_grp_nm4_NX(info);
		else if (nx == columnDispRslt_cst_grp_cd5) doDispRslt_cst_grp_cd5_NX(info);
		else if (nx == columnDispRslt_cst_grp_nm5) doDispRslt_cst_grp_nm5_NX(info);
		else if (nx == columnDispRslt_cst_grp_cd6) doDispRslt_cst_grp_cd6_NX(info);
		else if (nx == columnDispRslt_cst_grp_nm6) doDispRslt_cst_grp_nm6_NX(info);
		else if (nx == columnDispRslt_cst_grp_cd7) doDispRslt_cst_grp_cd7_NX(info);
		else if (nx == columnDispRslt_cst_grp_nm7) doDispRslt_cst_grp_nm7_NX(info);
		else if (nx == columnDispRslt_cst_grp_cd8) doDispRslt_cst_grp_cd8_NX(info);
		else if (nx == columnDispRslt_cst_grp_nm8) doDispRslt_cst_grp_nm8_NX(info);
		else if (nx == columnDispRslt_cst_grp_cd9) doDispRslt_cst_grp_cd9_NX(info);
		else if (nx == columnDispRslt_cst_grp_nm9) doDispRslt_cst_grp_nm9_NX(info);
		else if (nx == columnDispRslt_cst_grp_cd10) doDispRslt_cst_grp_cd10_NX(info);
		else if (nx == columnDispRslt_cst_grp_nm10) doDispRslt_cst_grp_nm10_NX(info);
		else if (nx == columnDispRslt_cst_cntry_cd) doDispRslt_cst_cntry_cd_NX(info);
		else if (nx == columnDispRslt_cst_cntry_nm) doDispRslt_cst_cntry_nm_NX(info);
		else if (nx == columnDispRslt_cst_area_cd) doDispRslt_cst_area_cd_NX(info);
		else if (nx == columnDispRslt_cst_area_nm) doDispRslt_cst_area_nm_NX(info);
		else if (nx == columnDispRslt_dlv_cd) doDispRslt_dlv_cd_NX(info);
		else if (nx == columnDispRslt_dlv_nm) doDispRslt_dlv_nm_NX(info);
		else if (nx == columnDispRslt_dlv_grp_cd1) doDispRslt_dlv_grp_cd1_NX(info);
		else if (nx == columnDispRslt_dlv_grp_nm1) doDispRslt_dlv_grp_nm1_NX(info);
		else if (nx == columnDispRslt_dlv_grp_cd2) doDispRslt_dlv_grp_cd2_NX(info);
		else if (nx == columnDispRslt_dlv_grp_nm2) doDispRslt_dlv_grp_nm2_NX(info);
		else if (nx == columnDispRslt_dlv_grp_cd3) doDispRslt_dlv_grp_cd3_NX(info);
		else if (nx == columnDispRslt_dlv_grp_nm3) doDispRslt_dlv_grp_nm3_NX(info);
		else if (nx == columnDispRslt_dlv_grp_cd4) doDispRslt_dlv_grp_cd4_NX(info);
		else if (nx == columnDispRslt_dlv_grp_nm4) doDispRslt_dlv_grp_nm4_NX(info);
		else if (nx == columnDispRslt_dlv_grp_cd5) doDispRslt_dlv_grp_cd5_NX(info);
		else if (nx == columnDispRslt_dlv_grp_nm5) doDispRslt_dlv_grp_nm5_NX(info);
		else if (nx == columnDispRslt_dlv_grp_cd6) doDispRslt_dlv_grp_cd6_NX(info);
		else if (nx == columnDispRslt_dlv_grp_nm6) doDispRslt_dlv_grp_nm6_NX(info);
		else if (nx == columnDispRslt_dlv_grp_cd7) doDispRslt_dlv_grp_cd7_NX(info);
		else if (nx == columnDispRslt_dlv_grp_nm7) doDispRslt_dlv_grp_nm7_NX(info);
		else if (nx == columnDispRslt_dlv_grp_cd8) doDispRslt_dlv_grp_cd8_NX(info);
		else if (nx == columnDispRslt_dlv_grp_nm8) doDispRslt_dlv_grp_nm8_NX(info);
		else if (nx == columnDispRslt_dlv_grp_cd9) doDispRslt_dlv_grp_cd9_NX(info);
		else if (nx == columnDispRslt_dlv_grp_nm9) doDispRslt_dlv_grp_nm9_NX(info);
		else if (nx == columnDispRslt_dlv_grp_cd10) doDispRslt_dlv_grp_cd10_NX(info);
		else if (nx == columnDispRslt_dlv_grp_nm10) doDispRslt_dlv_grp_nm10_NX(info);
		else if (nx == columnDispRslt_dlv_cntry_cd) doDispRslt_dlv_cntry_cd_NX(info);
		else if (nx == columnDispRslt_dlv_cntry_nm) doDispRslt_dlv_cntry_nm_NX(info);
		else if (nx == columnDispRslt_dlv_area_cd) doDispRslt_dlv_area_cd_NX(info);
		else if (nx == columnDispRslt_dlv_area_nm) doDispRslt_dlv_area_nm_NX(info);
		else if (nx == columnDispRslt_sls_dpt_cd) doDispRslt_sls_dpt_cd_NX(info);
		else if (nx == columnDispRslt_sls_dpt_nm) doDispRslt_sls_dpt_nm_NX(info);
		else if (nx == columnDispRslt_sls_usr_cd) doDispRslt_sls_usr_cd_NX(info);
		else if (nx == columnDispRslt_sls_usr_nm) doDispRslt_sls_usr_nm_NX(info);
		else if (nx == columnDispRslt_alc_dpt_cd) doDispRslt_alc_dpt_cd_NX(info);
		else if (nx == columnDispRslt_alc_dpt_nm) doDispRslt_alc_dpt_nm_NX(info);
		else if (nx == columnDispRslt_dest_cd1) doDispRslt_dest_cd1_NX(info);
		else if (nx == columnDispRslt_dest_nm1) doDispRslt_dest_nm1_NX(info);
		else if (nx == columnDispRslt_dest_cd2) doDispRslt_dest_cd2_NX(info);
		else if (nx == columnDispRslt_dest_nm2) doDispRslt_dest_nm2_NX(info);
		else if (nx == columnDispRslt_dest_cd3) doDispRslt_dest_cd3_NX(info);
		else if (nx == columnDispRslt_dest_nm3) doDispRslt_dest_nm3_NX(info);
		else if (nx == columnDispRslt_cost_sls_cd1) doDispRslt_cost_sls_cd1_NX(info);
		else if (nx == columnDispRslt_cost_sls_nm1) doDispRslt_cost_sls_nm1_NX(info);
		else if (nx == columnDispRslt_cost_sls_cd2) doDispRslt_cost_sls_cd2_NX(info);
		else if (nx == columnDispRslt_cost_sls_nm2) doDispRslt_cost_sls_nm2_NX(info);
		else if (nx == columnDispRslt_cost_sls_cd3) doDispRslt_cost_sls_cd3_NX(info);
		else if (nx == columnDispRslt_cost_sls_nm3) doDispRslt_cost_sls_nm3_NX(info);
		else if (nx == columnDispRslt_cost_sls_cd4) doDispRslt_cost_sls_cd4_NX(info);
		else if (nx == columnDispRslt_cost_sls_nm4) doDispRslt_cost_sls_nm4_NX(info);
		else if (nx == columnDispRslt_cost_sls_cd5) doDispRslt_cost_sls_cd5_NX(info);
		else if (nx == columnDispRslt_cost_sls_nm5) doDispRslt_cost_sls_nm5_NX(info);
		else if (nx == columnDispRslt_asst_typ) doDispRslt_asst_typ_NX(info);
		else if (nx == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NX(info);
		else if (nx == columnDispRslt_unit_cd) doDispRslt_unit_cd_NX(info);
		else if (nx == columnDispRslt_unit_nm) doDispRslt_unit_nm_NX(info);
		else if (nx == columnDispRslt_dec_place) doDispRslt_dec_place_NX(info);
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
	 * [Cnd]パネルの[mng_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mng_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm5_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mng_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_jnl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cntry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cntry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_area_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_area_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cntry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cntry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_area_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_area_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls4_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls5_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls5_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_grp_flg1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_flg10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_flg10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_flg10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_flg10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[mng_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mng_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_nm_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_nm_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd4_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm4_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd5_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm5_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dec_place_NX(MCEventInfo info){
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
		else if (lc == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_LC(info);
		else if (lc == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_LC(info);
		else if (lc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_LC(info);
		else if (lc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_sno1) doCnd_sno1_LC(info);
		else if (lc == Cnd_sno2) doCnd_sno2_LC(info);
		else if (lc == Cnd_sno3) doCnd_sno3_LC(info);
		else if (lc == Cnd_sno4) doCnd_sno4_LC(info);
		else if (lc == Cnd_asst_typ) doCnd_asst_typ_LC(info);
		else if (lc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_LC(info);
		else if (lc == Cnd_cst_cd) doCnd_cst_cd_LC(info);
		else if (lc == Cnd_cst_nm) doCnd_cst_nm_LC(info);
		else if (lc == Cnd_cst_cntry_cd) doCnd_cst_cntry_cd_LC(info);
		else if (lc == Cnd_cst_cntry_nm) doCnd_cst_cntry_nm_LC(info);
		else if (lc == Cnd_cst_area_cd) doCnd_cst_area_cd_LC(info);
		else if (lc == Cnd_cst_area_nm) doCnd_cst_area_nm_LC(info);
		else if (lc == Cnd_dlv_cd) doCnd_dlv_cd_LC(info);
		else if (lc == Cnd_dlv_nm) doCnd_dlv_nm_LC(info);
		else if (lc == Cnd_dlv_cntry_cd) doCnd_dlv_cntry_cd_LC(info);
		else if (lc == Cnd_dlv_cntry_nm) doCnd_dlv_cntry_nm_LC(info);
		else if (lc == Cnd_dlv_area_cd) doCnd_dlv_area_cd_LC(info);
		else if (lc == Cnd_dlv_area_nm) doCnd_dlv_area_nm_LC(info);
		else if (lc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_LC(info);
		else if (lc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_LC(info);
		else if (lc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_LC(info);
		else if (lc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_LC(info);
		else if (lc == Cnd_alc_dpt_cd) doCnd_alc_dpt_cd_LC(info);
		else if (lc == Cnd_alc_dpt_nm) doCnd_alc_dpt_nm_LC(info);
		else if (lc == Cnd_dest_cd1) doCnd_dest_cd1_LC(info);
		else if (lc == Cnd_dest_nm1) doCnd_dest_nm1_LC(info);
		else if (lc == Cnd_dest_cd2) doCnd_dest_cd2_LC(info);
		else if (lc == Cnd_dest_nm2) doCnd_dest_nm2_LC(info);
		else if (lc == Cnd_dest_cd3) doCnd_dest_cd3_LC(info);
		else if (lc == Cnd_dest_nm3) doCnd_dest_nm3_LC(info);
		else if (lc == Cnd_cost_sls_cd1) doCnd_cost_sls_cd1_LC(info);
		else if (lc == Cnd_cost_sls_nm1) doCnd_cost_sls_nm1_LC(info);
		else if (lc == Cnd_cost_sls_cd2) doCnd_cost_sls_cd2_LC(info);
		else if (lc == Cnd_cost_sls_nm2) doCnd_cost_sls_nm2_LC(info);
		else if (lc == Cnd_cost_sls_cd3) doCnd_cost_sls_cd3_LC(info);
		else if (lc == Cnd_cost_sls_nm3) doCnd_cost_sls_nm3_LC(info);
		else if (lc == Cnd_cost_sls_cd4) doCnd_cost_sls_cd4_LC(info);
		else if (lc == Cnd_cost_sls_nm4) doCnd_cost_sls_nm4_LC(info);
		else if (lc == Cnd_cost_sls_cd5) doCnd_cost_sls_cd5_LC(info);
		else if (lc == Cnd_cost_sls_nm5) doCnd_cost_sls_nm5_LC(info);
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
		else if (lc == Cnd_cst_grp_cd1) doCnd_cst_grp_cd1_LC(info);
		else if (lc == Cnd_cst_grp_nm1) doCnd_cst_grp_nm1_LC(info);
		else if (lc == Cnd_cst_grp_cd2) doCnd_cst_grp_cd2_LC(info);
		else if (lc == Cnd_cst_grp_nm2) doCnd_cst_grp_nm2_LC(info);
		else if (lc == Cnd_cst_grp_cd3) doCnd_cst_grp_cd3_LC(info);
		else if (lc == Cnd_cst_grp_nm3) doCnd_cst_grp_nm3_LC(info);
		else if (lc == Cnd_cst_grp_cd4) doCnd_cst_grp_cd4_LC(info);
		else if (lc == Cnd_cst_grp_nm4) doCnd_cst_grp_nm4_LC(info);
		else if (lc == Cnd_cst_grp_cd5) doCnd_cst_grp_cd5_LC(info);
		else if (lc == Cnd_cst_grp_nm5) doCnd_cst_grp_nm5_LC(info);
		else if (lc == Cnd_cst_grp_cd6) doCnd_cst_grp_cd6_LC(info);
		else if (lc == Cnd_cst_grp_nm6) doCnd_cst_grp_nm6_LC(info);
		else if (lc == Cnd_cst_grp_cd7) doCnd_cst_grp_cd7_LC(info);
		else if (lc == Cnd_cst_grp_nm7) doCnd_cst_grp_nm7_LC(info);
		else if (lc == Cnd_cst_grp_cd8) doCnd_cst_grp_cd8_LC(info);
		else if (lc == Cnd_cst_grp_nm8) doCnd_cst_grp_nm8_LC(info);
		else if (lc == Cnd_cst_grp_cd9) doCnd_cst_grp_cd9_LC(info);
		else if (lc == Cnd_cst_grp_nm9) doCnd_cst_grp_nm9_LC(info);
		else if (lc == Cnd_cst_grp_cd10) doCnd_cst_grp_cd10_LC(info);
		else if (lc == Cnd_cst_grp_nm10) doCnd_cst_grp_nm10_LC(info);
		else if (lc == Cnd_dlv_grp_cd1) doCnd_dlv_grp_cd1_LC(info);
		else if (lc == Cnd_dlv_grp_nm1) doCnd_dlv_grp_nm1_LC(info);
		else if (lc == Cnd_dlv_grp_cd2) doCnd_dlv_grp_cd2_LC(info);
		else if (lc == Cnd_dlv_grp_nm2) doCnd_dlv_grp_nm2_LC(info);
		else if (lc == Cnd_dlv_grp_cd3) doCnd_dlv_grp_cd3_LC(info);
		else if (lc == Cnd_dlv_grp_nm3) doCnd_dlv_grp_nm3_LC(info);
		else if (lc == Cnd_dlv_grp_cd4) doCnd_dlv_grp_cd4_LC(info);
		else if (lc == Cnd_dlv_grp_nm4) doCnd_dlv_grp_nm4_LC(info);
		else if (lc == Cnd_dlv_grp_cd5) doCnd_dlv_grp_cd5_LC(info);
		else if (lc == Cnd_dlv_grp_nm5) doCnd_dlv_grp_nm5_LC(info);
		else if (lc == Cnd_dlv_grp_cd6) doCnd_dlv_grp_cd6_LC(info);
		else if (lc == Cnd_dlv_grp_nm6) doCnd_dlv_grp_nm6_LC(info);
		else if (lc == Cnd_dlv_grp_cd7) doCnd_dlv_grp_cd7_LC(info);
		else if (lc == Cnd_dlv_grp_nm7) doCnd_dlv_grp_nm7_LC(info);
		else if (lc == Cnd_dlv_grp_cd8) doCnd_dlv_grp_cd8_LC(info);
		else if (lc == Cnd_dlv_grp_nm8) doCnd_dlv_grp_nm8_LC(info);
		else if (lc == Cnd_dlv_grp_cd9) doCnd_dlv_grp_cd9_LC(info);
		else if (lc == Cnd_dlv_grp_nm9) doCnd_dlv_grp_nm9_LC(info);
		else if (lc == Cnd_dlv_grp_cd10) doCnd_dlv_grp_cd10_LC(info);
		else if (lc == Cnd_dlv_grp_nm10) doCnd_dlv_grp_nm10_LC(info);
		else if (lc == columnDispRslt_wg_cd) doDispRslt_wg_cd_LC(info);
		else if (lc == columnDispRslt_wg_nm) doDispRslt_wg_nm_LC(info);
		else if (lc == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_LC(info);
		else if (lc == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_LC(info);
		else if (lc == columnDispRslt_itm_typ) doDispRslt_itm_typ_LC(info);
		else if (lc == columnDispRslt_itm_typ_nm) doDispRslt_itm_typ_nm_LC(info);
		else if (lc == columnDispRslt_itm_typ_d_cd) doDispRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnDispRslt_itm_typ_d_nm) doDispRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnDispRslt_itm_jnl_cd) doDispRslt_itm_jnl_cd_LC(info);
		else if (lc == columnDispRslt_itm_jnl_nm) doDispRslt_itm_jnl_nm_LC(info);
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
		else if (lc == columnDispRslt_cst_cd) doDispRslt_cst_cd_LC(info);
		else if (lc == columnDispRslt_cst_nm) doDispRslt_cst_nm_LC(info);
		else if (lc == columnDispRslt_cst_grp_cd1) doDispRslt_cst_grp_cd1_LC(info);
		else if (lc == columnDispRslt_cst_grp_nm1) doDispRslt_cst_grp_nm1_LC(info);
		else if (lc == columnDispRslt_cst_grp_cd2) doDispRslt_cst_grp_cd2_LC(info);
		else if (lc == columnDispRslt_cst_grp_nm2) doDispRslt_cst_grp_nm2_LC(info);
		else if (lc == columnDispRslt_cst_grp_cd3) doDispRslt_cst_grp_cd3_LC(info);
		else if (lc == columnDispRslt_cst_grp_nm3) doDispRslt_cst_grp_nm3_LC(info);
		else if (lc == columnDispRslt_cst_grp_cd4) doDispRslt_cst_grp_cd4_LC(info);
		else if (lc == columnDispRslt_cst_grp_nm4) doDispRslt_cst_grp_nm4_LC(info);
		else if (lc == columnDispRslt_cst_grp_cd5) doDispRslt_cst_grp_cd5_LC(info);
		else if (lc == columnDispRslt_cst_grp_nm5) doDispRslt_cst_grp_nm5_LC(info);
		else if (lc == columnDispRslt_cst_grp_cd6) doDispRslt_cst_grp_cd6_LC(info);
		else if (lc == columnDispRslt_cst_grp_nm6) doDispRslt_cst_grp_nm6_LC(info);
		else if (lc == columnDispRslt_cst_grp_cd7) doDispRslt_cst_grp_cd7_LC(info);
		else if (lc == columnDispRslt_cst_grp_nm7) doDispRslt_cst_grp_nm7_LC(info);
		else if (lc == columnDispRslt_cst_grp_cd8) doDispRslt_cst_grp_cd8_LC(info);
		else if (lc == columnDispRslt_cst_grp_nm8) doDispRslt_cst_grp_nm8_LC(info);
		else if (lc == columnDispRslt_cst_grp_cd9) doDispRslt_cst_grp_cd9_LC(info);
		else if (lc == columnDispRslt_cst_grp_nm9) doDispRslt_cst_grp_nm9_LC(info);
		else if (lc == columnDispRslt_cst_grp_cd10) doDispRslt_cst_grp_cd10_LC(info);
		else if (lc == columnDispRslt_cst_grp_nm10) doDispRslt_cst_grp_nm10_LC(info);
		else if (lc == columnDispRslt_cst_cntry_cd) doDispRslt_cst_cntry_cd_LC(info);
		else if (lc == columnDispRslt_cst_cntry_nm) doDispRslt_cst_cntry_nm_LC(info);
		else if (lc == columnDispRslt_cst_area_cd) doDispRslt_cst_area_cd_LC(info);
		else if (lc == columnDispRslt_cst_area_nm) doDispRslt_cst_area_nm_LC(info);
		else if (lc == columnDispRslt_dlv_cd) doDispRslt_dlv_cd_LC(info);
		else if (lc == columnDispRslt_dlv_nm) doDispRslt_dlv_nm_LC(info);
		else if (lc == columnDispRslt_dlv_grp_cd1) doDispRslt_dlv_grp_cd1_LC(info);
		else if (lc == columnDispRslt_dlv_grp_nm1) doDispRslt_dlv_grp_nm1_LC(info);
		else if (lc == columnDispRslt_dlv_grp_cd2) doDispRslt_dlv_grp_cd2_LC(info);
		else if (lc == columnDispRslt_dlv_grp_nm2) doDispRslt_dlv_grp_nm2_LC(info);
		else if (lc == columnDispRslt_dlv_grp_cd3) doDispRslt_dlv_grp_cd3_LC(info);
		else if (lc == columnDispRslt_dlv_grp_nm3) doDispRslt_dlv_grp_nm3_LC(info);
		else if (lc == columnDispRslt_dlv_grp_cd4) doDispRslt_dlv_grp_cd4_LC(info);
		else if (lc == columnDispRslt_dlv_grp_nm4) doDispRslt_dlv_grp_nm4_LC(info);
		else if (lc == columnDispRslt_dlv_grp_cd5) doDispRslt_dlv_grp_cd5_LC(info);
		else if (lc == columnDispRslt_dlv_grp_nm5) doDispRslt_dlv_grp_nm5_LC(info);
		else if (lc == columnDispRslt_dlv_grp_cd6) doDispRslt_dlv_grp_cd6_LC(info);
		else if (lc == columnDispRslt_dlv_grp_nm6) doDispRslt_dlv_grp_nm6_LC(info);
		else if (lc == columnDispRslt_dlv_grp_cd7) doDispRslt_dlv_grp_cd7_LC(info);
		else if (lc == columnDispRslt_dlv_grp_nm7) doDispRslt_dlv_grp_nm7_LC(info);
		else if (lc == columnDispRslt_dlv_grp_cd8) doDispRslt_dlv_grp_cd8_LC(info);
		else if (lc == columnDispRslt_dlv_grp_nm8) doDispRslt_dlv_grp_nm8_LC(info);
		else if (lc == columnDispRslt_dlv_grp_cd9) doDispRslt_dlv_grp_cd9_LC(info);
		else if (lc == columnDispRslt_dlv_grp_nm9) doDispRslt_dlv_grp_nm9_LC(info);
		else if (lc == columnDispRslt_dlv_grp_cd10) doDispRslt_dlv_grp_cd10_LC(info);
		else if (lc == columnDispRslt_dlv_grp_nm10) doDispRslt_dlv_grp_nm10_LC(info);
		else if (lc == columnDispRslt_dlv_cntry_cd) doDispRslt_dlv_cntry_cd_LC(info);
		else if (lc == columnDispRslt_dlv_cntry_nm) doDispRslt_dlv_cntry_nm_LC(info);
		else if (lc == columnDispRslt_dlv_area_cd) doDispRslt_dlv_area_cd_LC(info);
		else if (lc == columnDispRslt_dlv_area_nm) doDispRslt_dlv_area_nm_LC(info);
		else if (lc == columnDispRslt_sls_dpt_cd) doDispRslt_sls_dpt_cd_LC(info);
		else if (lc == columnDispRslt_sls_dpt_nm) doDispRslt_sls_dpt_nm_LC(info);
		else if (lc == columnDispRslt_sls_usr_cd) doDispRslt_sls_usr_cd_LC(info);
		else if (lc == columnDispRslt_sls_usr_nm) doDispRslt_sls_usr_nm_LC(info);
		else if (lc == columnDispRslt_alc_dpt_cd) doDispRslt_alc_dpt_cd_LC(info);
		else if (lc == columnDispRslt_alc_dpt_nm) doDispRslt_alc_dpt_nm_LC(info);
		else if (lc == columnDispRslt_dest_cd1) doDispRslt_dest_cd1_LC(info);
		else if (lc == columnDispRslt_dest_nm1) doDispRslt_dest_nm1_LC(info);
		else if (lc == columnDispRslt_dest_cd2) doDispRslt_dest_cd2_LC(info);
		else if (lc == columnDispRslt_dest_nm2) doDispRslt_dest_nm2_LC(info);
		else if (lc == columnDispRslt_dest_cd3) doDispRslt_dest_cd3_LC(info);
		else if (lc == columnDispRslt_dest_nm3) doDispRslt_dest_nm3_LC(info);
		else if (lc == columnDispRslt_cost_sls_cd1) doDispRslt_cost_sls_cd1_LC(info);
		else if (lc == columnDispRslt_cost_sls_nm1) doDispRslt_cost_sls_nm1_LC(info);
		else if (lc == columnDispRslt_cost_sls_cd2) doDispRslt_cost_sls_cd2_LC(info);
		else if (lc == columnDispRslt_cost_sls_nm2) doDispRslt_cost_sls_nm2_LC(info);
		else if (lc == columnDispRslt_cost_sls_cd3) doDispRslt_cost_sls_cd3_LC(info);
		else if (lc == columnDispRslt_cost_sls_nm3) doDispRslt_cost_sls_nm3_LC(info);
		else if (lc == columnDispRslt_cost_sls_cd4) doDispRslt_cost_sls_cd4_LC(info);
		else if (lc == columnDispRslt_cost_sls_nm4) doDispRslt_cost_sls_nm4_LC(info);
		else if (lc == columnDispRslt_cost_sls_cd5) doDispRslt_cost_sls_cd5_LC(info);
		else if (lc == columnDispRslt_cost_sls_nm5) doDispRslt_cost_sls_nm5_LC(info);
		else if (lc == columnDispRslt_asst_typ) doDispRslt_asst_typ_LC(info);
		else if (lc == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_LC(info);
		else if (lc == columnDispRslt_unit_cd) doDispRslt_unit_cd_LC(info);
		else if (lc == columnDispRslt_unit_nm) doDispRslt_unit_nm_LC(info);
		else if (lc == columnDispRslt_dec_place) doDispRslt_dec_place_LC(info);
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
	 * [Cnd]パネルの[mng_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mng_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mng_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_area_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_area_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_sls_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_sls_nm5_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm10_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[mng_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mng_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mng_dpt_nm_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_jnl_nm_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cst_area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cst_area_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dlv_area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dlv_area_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[alc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_alc_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd4_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm4_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_cd5_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cost_sls_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cost_sls_nm5_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_dec_place_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_mng_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_mng_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_jnl_cd]の作成メソッド
	 */
	public MCList getCnd_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
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
	 * コンボ／リストのリスト[Cnd_asst_typ]の作成メソッド
	 */
	public MCList getCnd_asst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAsstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_cd]の作成メソッド
	 */
	public MCList getCnd_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_cntry_cd]の作成メソッド
	 */
	public MCList getCnd_cst_cntry_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_area_cd]の作成メソッド
	 */
	public MCList getCnd_cst_area_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArea(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_cd]の作成メソッド
	 */
	public MCList getCnd_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_cntry_cd]の作成メソッド
	 */
	public MCList getCnd_dlv_cntry_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_area_cd]の作成メソッド
	 */
	public MCList getCnd_dlv_area_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArea(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_sls_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_usr_cd]の作成メソッド
	 */
	public MCList getCnd_sls_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_alc_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd1]の作成メソッド
	 */
	public MCList getCnd_dest_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd2]の作成メソッド
	 */
	public MCList getCnd_dest_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd3]の作成メソッド
	 */
	public MCList getCnd_dest_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cost_sls_cd1]の作成メソッド
	 */
	public MCList getCnd_cost_sls_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostSls(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cost_sls_cd2]の作成メソッド
	 */
	public MCList getCnd_cost_sls_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostSls(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cost_sls_cd3]の作成メソッド
	 */
	public MCList getCnd_cost_sls_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostSls(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cost_sls_cd4]の作成メソッド
	 */
	public MCList getCnd_cost_sls_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostSls(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cost_sls_cd5]の作成メソッド
	 */
	public MCList getCnd_cost_sls_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostSls(row, info);
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
	 * コンボ／リストのリスト[Cnd_cst_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBAL0100.Srch01")) {
			return new MG_MGBAL0100_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBAL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBAL0100_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBAL0100_Srch01;

		/** コンストラクタ */
		protected MG_MGBAL0100_Srch01Bridge() {
			p_MG_MGBAL0100_Srch01 = new MCParam(PDef.MG_MGBAL0100_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBAL0100_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBA.MGBAP0100.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBA.MGBAP0100.RsltR.class));

			p_MG_MGBAL0100_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBAL0100_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBAL0100_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBAL0100_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBAL0100_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBA.MGBAP0100.CndR up0() {
			return (mcframe.clientMGBA.MGBAP0100.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBA.MGBAP0100.RsltR> down0() {
			return (MCList<mcframe.clientMGBA.MGBAP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBAL0100_Srch01.addDownBlock(MCList.create(mcframe.clientMGBA.MGBAP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBAL0100_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBA.MGBAP0100.RsltR>)p_MG_MGBAL0100_Srch01.getContainerParam().getDownBlock(0));
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