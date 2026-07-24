package mcframe.clientMGBD.MGBDP0140;

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
import mcframe.clientMGBD.MGBDP0140.MGBDP_ExpProvSrch_MC.MG_MGBDL0140_Srch01Caller;

/**
 * 画面"MGBDP_ExpProvSrch"パネルクラスです。<p>
 *
 * 支給展開結果を参照する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_ExpProvSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBD";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBDP0140";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_calc_grp_cd_Label = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_grp_nm = null;
	public mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H Cnd_calc_no_p_PPanel;
	public MCTextComboBox Cnd_calc_no;	// [Cnd]の[calc_no_p.calc_no]を[Cnd_calc_no]としてエイリアス定義。
	public MCTextField Cnd_rmrks;	// [Cnd]の[calc_no_p.rmrks]を[Cnd_rmrks]としてエイリアス定義。
	/**
	 * Term 期.<p>
	 *
	 */
	public MCDateField Cnd_term = null;
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
	public MCLabel Cnd_prov_typ_Label = null;
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_prov_typ = null;
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public MCTextField Cnd_prov_typ_nm = null;
	public MCLabel Cnd_prsppl_cd_Label = null;
	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_cd = null;
	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_nm = null;
	public MCLabel Cnd_prsppl_cntry_cd_Label = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_cntry_nm = null;
	public MCLabel Cnd_prsppl_area_cd_Label = null;
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_area_cd = null;
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_area_nm = null;
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
	public MCLabel Cnd_prsppl_grp_cd1_Label = null;
	/**
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_grp_cd1 = null;
	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_grp_nm1 = null;
	public MCLabel Cnd_prsppl_grp_cd2_Label = null;
	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_grp_cd2 = null;
	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_grp_nm2 = null;
	public MCLabel Cnd_prsppl_grp_cd3_Label = null;
	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_grp_cd3 = null;
	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_grp_nm3 = null;
	public MCLabel Cnd_prsppl_grp_cd4_Label = null;
	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_grp_cd4 = null;
	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_grp_nm4 = null;
	public MCLabel Cnd_prsppl_grp_cd5_Label = null;
	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_grp_cd5 = null;
	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_grp_nm5 = null;
	public MCLabel Cnd_prsppl_grp_cd6_Label = null;
	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_grp_cd6 = null;
	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_grp_nm6 = null;
	public MCLabel Cnd_prsppl_grp_cd7_Label = null;
	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_grp_cd7 = null;
	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_grp_nm7 = null;
	public MCLabel Cnd_prsppl_grp_cd8_Label = null;
	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_grp_cd8 = null;
	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_grp_nm8 = null;
	public MCLabel Cnd_prsppl_grp_cd9_Label = null;
	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_grp_cd9 = null;
	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_grp_nm9 = null;
	public MCLabel Cnd_prsppl_grp_cd10_Label = null;
	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_prsppl_grp_cd10 = null;
	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_prsppl_grp_nm10 = null;
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
	 * Subcontractor 支給先.<p>
	 *
	 */
	public MCCheckBox Cnd_prsppl_flg = null;
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public MCCheckBox Cnd_prov_flg = null;
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
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Cnd3]ブロック関連のField定義
	public MCPanel Cnd3Panel = null;
	// [Cnd3]ブロックの項目のField定義
	// [Ttl]ブロック関連のField定義
	public MCPanel TtlPanel = null;
	// [Ttl]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [DispRslt]ブロック関連のField定義
	public MCPanel DispRsltPanel = null;
	public MCScrollPane DispRsltScrollPane = null;
	public MCColumnGroupTable<mcframe.clientMGBD.MGBDP0140.DispRsltR> DispRsltTable = null;
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
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_prsppl_cd = null;
	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_prsppl_nm = null;
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_prov_typ = null;
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_prov_typ_nm = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_p_PPanel;
	public MCColumnConfig columnDispRslt_qty;// [DispRslt]の[qty_p.qty]を[columnDispRslt_qty]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_ttl = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_00_p_PPanel;
	public MCColumnConfig columnDispRslt_col_00;// [DispRslt]の[qty_00_p.qty]を[columnDispRslt_col_00]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_01 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_02_p_PPanel;
	public MCColumnConfig columnDispRslt_col_02;// [DispRslt]の[qty_02_p.qty]を[columnDispRslt_col_02]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_03 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_04_p_PPanel;
	public MCColumnConfig columnDispRslt_col_04;// [DispRslt]の[qty_04_p.qty]を[columnDispRslt_col_04]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_05 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_06_p_PPanel;
	public MCColumnConfig columnDispRslt_col_06;// [DispRslt]の[qty_06_p.qty]を[columnDispRslt_col_06]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_07 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_08_p_PPanel;
	public MCColumnConfig columnDispRslt_col_08;// [DispRslt]の[qty_08_p.qty]を[columnDispRslt_col_08]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_09 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_10_p_PPanel;
	public MCColumnConfig columnDispRslt_col_10;// [DispRslt]の[qty_10_p.qty]を[columnDispRslt_col_10]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_11 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_12_p_PPanel;
	public MCColumnConfig columnDispRslt_col_12;// [DispRslt]の[qty_12_p.qty]を[columnDispRslt_col_12]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_13 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_14_p_PPanel;
	public MCColumnConfig columnDispRslt_col_14;// [DispRslt]の[qty_14_p.qty]を[columnDispRslt_col_14]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_15 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_16_p_PPanel;
	public MCColumnConfig columnDispRslt_col_16;// [DispRslt]の[qty_16_p.qty]を[columnDispRslt_col_16]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_17 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_18_p_PPanel;
	public MCColumnConfig columnDispRslt_col_18;// [DispRslt]の[qty_18_p.qty]を[columnDispRslt_col_18]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_19 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_20_p_PPanel;
	public MCColumnConfig columnDispRslt_col_20;// [DispRslt]の[qty_20_p.qty]を[columnDispRslt_col_20]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_21 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_qty_22_p_PPanel;
	public MCColumnConfig columnDispRslt_col_22;// [DispRslt]の[qty_22_p.qty]を[columnDispRslt_col_22]としてエイリアス定義。
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_23 = null;
	public MCColumnGroup cgDispRslt_cg_ttl = null;
	public MCColumnGroup cgDispRslt_cg0 = null;
	public MCColumnGroup cgDispRslt_cg1 = null;
	public MCColumnGroup cgDispRslt_cg2 = null;
	public MCColumnGroup cgDispRslt_cg3 = null;
	public MCColumnGroup cgDispRslt_cg4 = null;
	public MCColumnGroup cgDispRslt_cg5 = null;
	public MCColumnGroup cgDispRslt_cg6 = null;
	public MCColumnGroup cgDispRslt_cg7 = null;
	public MCColumnGroup cgDispRslt_cg8 = null;
	public MCColumnGroup cgDispRslt_cg9 = null;
	public MCColumnGroup cgDispRslt_cg10 = null;
	public MCColumnGroup cgDispRslt_cg11 = null;
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
	
	/** [MG_MGBDL0140_Srch01]のCallerの作成 */
	protected MGBDP_ExpProvSrch_MC.MG_MGBDL0140_Srch01Caller createMG_MGBDL0140_Srch01() {
		MGBDP_ExpProvSrch_MC.MG_MGBDL0140_Srch01Caller<MGBDP_ExpProvSrch, MG_MGBDL0140_Srch01Bridge>
		caller = ((MGBDP_ExpProvSrch_MC)this).new MG_MGBDL0140_Srch01Caller<MGBDP_ExpProvSrch, MG_MGBDL0140_Srch01Bridge>(
					(MGBDP_ExpProvSrch)this, new MG_MGBDL0140_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBDL0140_Srch01]の呼び出し */
	protected void callMG_MGBDL0140_Srch01() {
		MCCaller caller = createMG_MGBDL0140_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0140.CndR aCndR;
	/** [DispRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0140.DispRsltR> aDispRsltL;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0140.RsltR> aRsltL;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0140.HdrR aHdrR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0140.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0140.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0140.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0140.CndR.create();
	}

	/**
	 * コピーによってaDispRsltLを設定します。
	 *
	 * aDispRsltLのインスタンスは変更されません。
	 *
	 * @param dataset DispRsltL
	 */
	public void setDispRsltL(MCList<mcframe.clientMGBD.MGBDP0140.DispRsltR> aList) {
		if (getDispRsltL() != aList) {
			getDispRsltL().setAll(aList);
		}
	}

	/**
	 * [DispRslt]ブロックのコンテナaDispRsltLを返します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0140.DispRsltR> getDispRsltL() {
		return aDispRsltL;
	}

	/**
	 * aDispRsltRを作成します。
	 *
	 * @return DispRsltR
	 */
	public mcframe.clientMGBD.MGBDP0140.DispRsltR createDispRsltR() {
		return mcframe.clientMGBD.MGBDP0140.DispRsltR.create();
	}

	/**
	 * aDispRsltLを作成します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0140.DispRsltR> createDispRsltL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0140.DispRsltR.class);
	}

	/**
	 * DispRsltTableを初期化します。
	 */
	protected void createDispRsltTable(){
		if(DispRsltTable == null){
			DispRsltTable = beansFactory.createColumnGroupTable("DispRslt.table");
		}
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBD.MGBDP0140.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0140.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBD.MGBDP0140.RsltR createRsltR() {
		return mcframe.clientMGBD.MGBDP0140.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0140.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0140.RsltR.class);
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMGBD.MGBDP0140.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMGBD.MGBDP0140.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMGBD.MGBDP0140.HdrR createHdrR() {
		return mcframe.clientMGBD.MGBDP0140.HdrR.create();
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
		if(aCnt == getDispRsltL()) return "DispRslt";
		if(aCnt == getRsltL()) return "Rslt";
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
		if(bId.equals("DispRslt")) return getDispRsltL();
		if(bId.equals("Rslt")) return getRsltL();
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
		ret.add(CtrlPanel);
		ret.add(DispRsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ExpProvSrch_MC_A() {
		aCndR = createCndR();
		aDispRsltL = createDispRsltL();
		aRsltL = createRsltL();
		aHdrR = createHdrR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_ExpProvSrch_MC_A(String name) {
		aCndR = createCndR();
		aDispRsltL = createDispRsltL();
		createDispRsltTable();
		DispRsltTable.setRowName(name);
		aRsltL = createRsltL();
		aHdrR = createHdrR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBDP_ExpProvSrch_MC.jbCreateTop((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbCreateFold((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbCreateTab1((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbCreateTab2((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbCreateTab3((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbCreateTab4((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbCreateCnd((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbCreateCnd2((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbCreateCnd3((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbCreateTtl((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbCreateCtrl((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbCreateDispRslt((MGBDP_ExpProvSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBDP_ExpProvSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBDP_ExpProvSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBDP_ExpProvSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBDP_ExpProvSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MGBDP_ExpProvSrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MGBDP_ExpProvSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_ExpProvSrch p) {
		p.Cnd_calc_no_p_PPanel = mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.create(p.getCndR().calc_no_p());
		p.Cnd_calc_no_p_PPanel.setName("Cnd.calc_no_p");
		p.Cnd_calc_no = p.Cnd_calc_no_p_PPanel.CalcNo_calc_no;
		p.Cnd_calc_no.addAliasName("Cnd.calc_no", p);
		p.Cnd_rmrks = p.Cnd_calc_no_p_PPanel.CalcNo_rmrks;
		p.Cnd_rmrks.addAliasName("Cnd.rmrks", p);
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
	protected static void jbCreateCnd2(MGBDP_ExpProvSrch p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MGBDP_ExpProvSrch p) {
	}

	/**
	 * [Ttl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTtl(MGBDP_ExpProvSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBDP_ExpProvSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispRslt(MGBDP_ExpProvSrch p) {
		p.DispRslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0140.DispRsltR.$itm_p);
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
		p.DispRslt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0140.DispRsltR.$qty_p);
		p.DispRslt_qty_p_PPanel.setName("DispRslt.qty_p");
		p.columnDispRslt_qty = p.DispRslt_qty_p_PPanel.columnQty_qty;
		p.columnDispRslt_qty.addAliasName("DispRslt.qty", p);
		p.DispRslt_qty_00_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0140.DispRsltR.$qty_00_p);
		p.DispRslt_qty_00_p_PPanel.setName("DispRslt.qty_00_p");
		p.columnDispRslt_col_00 = p.DispRslt_qty_00_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_00.addAliasName("DispRslt.col_00", p);
		p.DispRslt_qty_02_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0140.DispRsltR.$qty_02_p);
		p.DispRslt_qty_02_p_PPanel.setName("DispRslt.qty_02_p");
		p.columnDispRslt_col_02 = p.DispRslt_qty_02_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_02.addAliasName("DispRslt.col_02", p);
		p.DispRslt_qty_04_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0140.DispRsltR.$qty_04_p);
		p.DispRslt_qty_04_p_PPanel.setName("DispRslt.qty_04_p");
		p.columnDispRslt_col_04 = p.DispRslt_qty_04_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_04.addAliasName("DispRslt.col_04", p);
		p.DispRslt_qty_06_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0140.DispRsltR.$qty_06_p);
		p.DispRslt_qty_06_p_PPanel.setName("DispRslt.qty_06_p");
		p.columnDispRslt_col_06 = p.DispRslt_qty_06_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_06.addAliasName("DispRslt.col_06", p);
		p.DispRslt_qty_08_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0140.DispRsltR.$qty_08_p);
		p.DispRslt_qty_08_p_PPanel.setName("DispRslt.qty_08_p");
		p.columnDispRslt_col_08 = p.DispRslt_qty_08_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_08.addAliasName("DispRslt.col_08", p);
		p.DispRslt_qty_10_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0140.DispRsltR.$qty_10_p);
		p.DispRslt_qty_10_p_PPanel.setName("DispRslt.qty_10_p");
		p.columnDispRslt_col_10 = p.DispRslt_qty_10_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_10.addAliasName("DispRslt.col_10", p);
		p.DispRslt_qty_12_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0140.DispRsltR.$qty_12_p);
		p.DispRslt_qty_12_p_PPanel.setName("DispRslt.qty_12_p");
		p.columnDispRslt_col_12 = p.DispRslt_qty_12_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_12.addAliasName("DispRslt.col_12", p);
		p.DispRslt_qty_14_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0140.DispRsltR.$qty_14_p);
		p.DispRslt_qty_14_p_PPanel.setName("DispRslt.qty_14_p");
		p.columnDispRslt_col_14 = p.DispRslt_qty_14_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_14.addAliasName("DispRslt.col_14", p);
		p.DispRslt_qty_16_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0140.DispRsltR.$qty_16_p);
		p.DispRslt_qty_16_p_PPanel.setName("DispRslt.qty_16_p");
		p.columnDispRslt_col_16 = p.DispRslt_qty_16_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_16.addAliasName("DispRslt.col_16", p);
		p.DispRslt_qty_18_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0140.DispRsltR.$qty_18_p);
		p.DispRslt_qty_18_p_PPanel.setName("DispRslt.qty_18_p");
		p.columnDispRslt_col_18 = p.DispRslt_qty_18_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_18.addAliasName("DispRslt.col_18", p);
		p.DispRslt_qty_20_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0140.DispRsltR.$qty_20_p);
		p.DispRslt_qty_20_p_PPanel.setName("DispRslt.qty_20_p");
		p.columnDispRslt_col_20 = p.DispRslt_qty_20_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_20.addAliasName("DispRslt.col_20", p);
		p.DispRslt_qty_22_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0140.DispRsltR.$qty_22_p);
		p.DispRslt_qty_22_p_PPanel.setName("DispRslt.qty_22_p");
		p.columnDispRslt_col_22 = p.DispRslt_qty_22_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_22.addAliasName("DispRslt.col_22", p);
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

	
	/** [Cnd_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_grp_cd_p = null;

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_grp_cd_ListPutter() {
		if (Cnd_calc_grp_cd_p == null) {
			Cnd_calc_grp_cd_p = createCnd_calc_grp_cd_ListPutter(Cnd_calc_grp_cd, "calc_grp_cd", "calc_grp_nm");

		}
		return Cnd_calc_grp_cd_p;
	}
	
	
	/** [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の定義 */
	private MCListPutter Cnd_calc_no_p_PPanel_CalcNo_calc_no_p = null;

	/**
	 * [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter() {
		if (Cnd_calc_no_p_PPanel_CalcNo_calc_no_p == null) {
			Cnd_calc_no_p_PPanel_CalcNo_calc_no_p = createCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(Cnd_calc_no_p_PPanel.CalcNo_calc_no, "calc_no", "rmrks","term");
		}
		return Cnd_calc_no_p_PPanel_CalcNo_calc_no_p;
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
	
	
	/** [Cnd_prov_typ_ListPutter]の定義 */
	private MCListPutter Cnd_prov_typ_p = null;

	/**
	 * [Cnd_prov_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prov_typ_ListPutter() {
		if (Cnd_prov_typ_p == null) {
			Cnd_prov_typ_p = createCnd_prov_typ_ListPutter(Cnd_prov_typ, "prov_typ", "prov_typ_nm");

		}
		return Cnd_prov_typ_p;
	}
	
	
	/** [Cnd_prsppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_cd_p = null;

	/**
	 * [Cnd_prsppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_cd_ListPutter() {
		if (Cnd_prsppl_cd_p == null) {
			Cnd_prsppl_cd_p = createCnd_prsppl_cd_ListPutter(Cnd_prsppl_cd, "prsppl_cd", "prsppl_nm");

		}
		return Cnd_prsppl_cd_p;
	}
	
	
	/** [Cnd_prsppl_cntry_cd_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_cntry_cd_p = null;

	/**
	 * [Cnd_prsppl_cntry_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_cntry_cd_ListPutter() {
		if (Cnd_prsppl_cntry_cd_p == null) {
			Cnd_prsppl_cntry_cd_p = createCnd_prsppl_cntry_cd_ListPutter(Cnd_prsppl_cntry_cd, "prsppl_cntry_cd", "prsppl_cntry_nm");

		}
		return Cnd_prsppl_cntry_cd_p;
	}
	
	
	/** [Cnd_prsppl_area_cd_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_area_cd_p = null;

	/**
	 * [Cnd_prsppl_area_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_area_cd_ListPutter() {
		if (Cnd_prsppl_area_cd_p == null) {
			Cnd_prsppl_area_cd_p = createCnd_prsppl_area_cd_ListPutter(Cnd_prsppl_area_cd, "prsppl_area_cd", "prsppl_area_nm");

		}
		return Cnd_prsppl_area_cd_p;
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
	
	
	/** [Cnd_prsppl_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_grp_cd1_p = null;

	/**
	 * [Cnd_prsppl_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_grp_cd1_ListPutter() {
		if (Cnd_prsppl_grp_cd1_p == null) {
			Cnd_prsppl_grp_cd1_p = createCnd_prsppl_grp_cd1_ListPutter(Cnd_prsppl_grp_cd1, "prsppl_grp_cd1", "prsppl_grp_nm1");

		}
		return Cnd_prsppl_grp_cd1_p;
	}
	
	
	/** [Cnd_prsppl_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_grp_cd2_p = null;

	/**
	 * [Cnd_prsppl_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_grp_cd2_ListPutter() {
		if (Cnd_prsppl_grp_cd2_p == null) {
			Cnd_prsppl_grp_cd2_p = createCnd_prsppl_grp_cd2_ListPutter(Cnd_prsppl_grp_cd2, "prsppl_grp_cd2", "prsppl_grp_nm2");

		}
		return Cnd_prsppl_grp_cd2_p;
	}
	
	
	/** [Cnd_prsppl_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_grp_cd3_p = null;

	/**
	 * [Cnd_prsppl_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_grp_cd3_ListPutter() {
		if (Cnd_prsppl_grp_cd3_p == null) {
			Cnd_prsppl_grp_cd3_p = createCnd_prsppl_grp_cd3_ListPutter(Cnd_prsppl_grp_cd3, "prsppl_grp_cd3", "prsppl_grp_nm3");

		}
		return Cnd_prsppl_grp_cd3_p;
	}
	
	
	/** [Cnd_prsppl_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_grp_cd4_p = null;

	/**
	 * [Cnd_prsppl_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_grp_cd4_ListPutter() {
		if (Cnd_prsppl_grp_cd4_p == null) {
			Cnd_prsppl_grp_cd4_p = createCnd_prsppl_grp_cd4_ListPutter(Cnd_prsppl_grp_cd4, "prsppl_grp_cd4", "prsppl_grp_nm4");

		}
		return Cnd_prsppl_grp_cd4_p;
	}
	
	
	/** [Cnd_prsppl_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_grp_cd5_p = null;

	/**
	 * [Cnd_prsppl_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_grp_cd5_ListPutter() {
		if (Cnd_prsppl_grp_cd5_p == null) {
			Cnd_prsppl_grp_cd5_p = createCnd_prsppl_grp_cd5_ListPutter(Cnd_prsppl_grp_cd5, "prsppl_grp_cd5", "prsppl_grp_nm5");

		}
		return Cnd_prsppl_grp_cd5_p;
	}
	
	
	/** [Cnd_prsppl_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_grp_cd6_p = null;

	/**
	 * [Cnd_prsppl_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_grp_cd6_ListPutter() {
		if (Cnd_prsppl_grp_cd6_p == null) {
			Cnd_prsppl_grp_cd6_p = createCnd_prsppl_grp_cd6_ListPutter(Cnd_prsppl_grp_cd6, "prsppl_grp_cd6", "prsppl_grp_nm6");

		}
		return Cnd_prsppl_grp_cd6_p;
	}
	
	
	/** [Cnd_prsppl_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_grp_cd7_p = null;

	/**
	 * [Cnd_prsppl_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_grp_cd7_ListPutter() {
		if (Cnd_prsppl_grp_cd7_p == null) {
			Cnd_prsppl_grp_cd7_p = createCnd_prsppl_grp_cd7_ListPutter(Cnd_prsppl_grp_cd7, "prsppl_grp_cd7", "prsppl_grp_nm7");

		}
		return Cnd_prsppl_grp_cd7_p;
	}
	
	
	/** [Cnd_prsppl_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_grp_cd8_p = null;

	/**
	 * [Cnd_prsppl_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_grp_cd8_ListPutter() {
		if (Cnd_prsppl_grp_cd8_p == null) {
			Cnd_prsppl_grp_cd8_p = createCnd_prsppl_grp_cd8_ListPutter(Cnd_prsppl_grp_cd8, "prsppl_grp_cd8", "prsppl_grp_nm8");

		}
		return Cnd_prsppl_grp_cd8_p;
	}
	
	
	/** [Cnd_prsppl_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_grp_cd9_p = null;

	/**
	 * [Cnd_prsppl_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_grp_cd9_ListPutter() {
		if (Cnd_prsppl_grp_cd9_p == null) {
			Cnd_prsppl_grp_cd9_p = createCnd_prsppl_grp_cd9_ListPutter(Cnd_prsppl_grp_cd9, "prsppl_grp_cd9", "prsppl_grp_nm9");

		}
		return Cnd_prsppl_grp_cd9_p;
	}
	
	
	/** [Cnd_prsppl_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_prsppl_grp_cd10_p = null;

	/**
	 * [Cnd_prsppl_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prsppl_grp_cd10_ListPutter() {
		if (Cnd_prsppl_grp_cd10_p == null) {
			Cnd_prsppl_grp_cd10_p = createCnd_prsppl_grp_cd10_ListPutter(Cnd_prsppl_grp_cd10, "prsppl_grp_cd10", "prsppl_grp_nm10");

		}
		return Cnd_prsppl_grp_cd10_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_ExpProvSrch create(){
		MGBDP_ExpProvSrch p = new MGBDP_ExpProvSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_ExpProvSrch create(String name){
		MGBDP_ExpProvSrch p = new MGBDP_ExpProvSrch(name);
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
		MGBDP_ExpProvSrch_MC.jbfInitTop((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbfInitFold((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbfInitTab1((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbfInitTab2((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbfInitTab3((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbfInitTab4((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbfInitCnd((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbfInitCnd2((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbfInitCnd3((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbfInitTtl((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbfInitCtrl((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbfInitDispRslt((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbInitTop((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbInitFold((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbInitTab1((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbInitTab2((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbInitTab3((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbInitTab4((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbInitCnd((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbInitCnd2((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbInitCnd3((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbInitTtl((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbInitCtrl((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.jbInitDispRslt((MGBDP_ExpProvSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBDP_ExpProvSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBDP_ExpProvSrch p) {
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
	protected static void jbfInitTab1(MGBDP_ExpProvSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBDP_ExpProvSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MGBDP_ExpProvSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MGBDP_ExpProvSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_ExpProvSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_term = p.beansFactory.createDateField("Cnd.term");
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
		p.Cnd_prov_typ_Label = p.beansFactory.createLabel("Cnd.prov_typ_Label");
		p.Cnd_prov_typ = p.beansFactory.createTextComboBox("Cnd.prov_typ");
		p.Cnd_prov_typ.setLabel(p.Cnd_prov_typ_Label);
		p.Cnd_prov_typ_nm = p.beansFactory.createTextField("Cnd.prov_typ_nm");
		p.Cnd_prsppl_cd_Label = p.beansFactory.createLabel("Cnd.prsppl_cd_Label");
		p.Cnd_prsppl_cd = p.beansFactory.createTextField("Cnd.prsppl_cd");
		p.Cnd_prsppl_cd.setLabel(p.Cnd_prsppl_cd_Label);
		p.Cnd_prsppl_nm = p.beansFactory.createTextField("Cnd.prsppl_nm");
		p.Cnd_prsppl_cntry_cd_Label = p.beansFactory.createLabel("Cnd.prsppl_cntry_cd_Label");
		p.Cnd_prsppl_cntry_cd = p.beansFactory.createTextComboBox("Cnd.prsppl_cntry_cd");
		p.Cnd_prsppl_cntry_cd.setLabel(p.Cnd_prsppl_cntry_cd_Label);
		p.Cnd_prsppl_cntry_nm = p.beansFactory.createTextField("Cnd.prsppl_cntry_nm");
		p.Cnd_prsppl_area_cd_Label = p.beansFactory.createLabel("Cnd.prsppl_area_cd_Label");
		p.Cnd_prsppl_area_cd = p.beansFactory.createTextComboBox("Cnd.prsppl_area_cd");
		p.Cnd_prsppl_area_cd.setLabel(p.Cnd_prsppl_area_cd_Label);
		p.Cnd_prsppl_area_nm = p.beansFactory.createTextField("Cnd.prsppl_area_nm");
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
		p.Cnd_prsppl_grp_cd1_Label = p.beansFactory.createLabel("Cnd.prsppl_grp_cd1_Label");
		p.Cnd_prsppl_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.prsppl_grp_cd1");
		p.Cnd_prsppl_grp_cd1.setLabel(p.Cnd_prsppl_grp_cd1_Label);
		p.Cnd_prsppl_grp_nm1 = p.beansFactory.createTextField("Cnd.prsppl_grp_nm1");
		p.Cnd_prsppl_grp_cd2_Label = p.beansFactory.createLabel("Cnd.prsppl_grp_cd2_Label");
		p.Cnd_prsppl_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.prsppl_grp_cd2");
		p.Cnd_prsppl_grp_cd2.setLabel(p.Cnd_prsppl_grp_cd2_Label);
		p.Cnd_prsppl_grp_nm2 = p.beansFactory.createTextField("Cnd.prsppl_grp_nm2");
		p.Cnd_prsppl_grp_cd3_Label = p.beansFactory.createLabel("Cnd.prsppl_grp_cd3_Label");
		p.Cnd_prsppl_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.prsppl_grp_cd3");
		p.Cnd_prsppl_grp_cd3.setLabel(p.Cnd_prsppl_grp_cd3_Label);
		p.Cnd_prsppl_grp_nm3 = p.beansFactory.createTextField("Cnd.prsppl_grp_nm3");
		p.Cnd_prsppl_grp_cd4_Label = p.beansFactory.createLabel("Cnd.prsppl_grp_cd4_Label");
		p.Cnd_prsppl_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.prsppl_grp_cd4");
		p.Cnd_prsppl_grp_cd4.setLabel(p.Cnd_prsppl_grp_cd4_Label);
		p.Cnd_prsppl_grp_nm4 = p.beansFactory.createTextField("Cnd.prsppl_grp_nm4");
		p.Cnd_prsppl_grp_cd5_Label = p.beansFactory.createLabel("Cnd.prsppl_grp_cd5_Label");
		p.Cnd_prsppl_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.prsppl_grp_cd5");
		p.Cnd_prsppl_grp_cd5.setLabel(p.Cnd_prsppl_grp_cd5_Label);
		p.Cnd_prsppl_grp_nm5 = p.beansFactory.createTextField("Cnd.prsppl_grp_nm5");
		p.Cnd_prsppl_grp_cd6_Label = p.beansFactory.createLabel("Cnd.prsppl_grp_cd6_Label");
		p.Cnd_prsppl_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.prsppl_grp_cd6");
		p.Cnd_prsppl_grp_cd6.setLabel(p.Cnd_prsppl_grp_cd6_Label);
		p.Cnd_prsppl_grp_nm6 = p.beansFactory.createTextField("Cnd.prsppl_grp_nm6");
		p.Cnd_prsppl_grp_cd7_Label = p.beansFactory.createLabel("Cnd.prsppl_grp_cd7_Label");
		p.Cnd_prsppl_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.prsppl_grp_cd7");
		p.Cnd_prsppl_grp_cd7.setLabel(p.Cnd_prsppl_grp_cd7_Label);
		p.Cnd_prsppl_grp_nm7 = p.beansFactory.createTextField("Cnd.prsppl_grp_nm7");
		p.Cnd_prsppl_grp_cd8_Label = p.beansFactory.createLabel("Cnd.prsppl_grp_cd8_Label");
		p.Cnd_prsppl_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.prsppl_grp_cd8");
		p.Cnd_prsppl_grp_cd8.setLabel(p.Cnd_prsppl_grp_cd8_Label);
		p.Cnd_prsppl_grp_nm8 = p.beansFactory.createTextField("Cnd.prsppl_grp_nm8");
		p.Cnd_prsppl_grp_cd9_Label = p.beansFactory.createLabel("Cnd.prsppl_grp_cd9_Label");
		p.Cnd_prsppl_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.prsppl_grp_cd9");
		p.Cnd_prsppl_grp_cd9.setLabel(p.Cnd_prsppl_grp_cd9_Label);
		p.Cnd_prsppl_grp_nm9 = p.beansFactory.createTextField("Cnd.prsppl_grp_nm9");
		p.Cnd_prsppl_grp_cd10_Label = p.beansFactory.createLabel("Cnd.prsppl_grp_cd10_Label");
		p.Cnd_prsppl_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.prsppl_grp_cd10");
		p.Cnd_prsppl_grp_cd10.setLabel(p.Cnd_prsppl_grp_cd10_Label);
		p.Cnd_prsppl_grp_nm10 = p.beansFactory.createTextField("Cnd.prsppl_grp_nm10");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_mng_dpt_flg = p.beansFactory.createCheckBox("Cnd.mng_dpt_flg");
		p.Cnd_lot_flg = p.beansFactory.createCheckBox("Cnd.lot_flg");
		p.Cnd_sublot_flg = p.beansFactory.createCheckBox("Cnd.sublot_flg");
		p.Cnd_sno1_flg = p.beansFactory.createCheckBox("Cnd.sno1_flg");
		p.Cnd_sno2_flg = p.beansFactory.createCheckBox("Cnd.sno2_flg");
		p.Cnd_sno3_flg = p.beansFactory.createCheckBox("Cnd.sno3_flg");
		p.Cnd_sno4_flg = p.beansFactory.createCheckBox("Cnd.sno4_flg");
		p.Cnd_prsppl_flg = p.beansFactory.createCheckBox("Cnd.prsppl_flg");
		p.Cnd_prov_flg = p.beansFactory.createCheckBox("Cnd.prov_flg");
		p.Cnd_select_all = p.beansFactory.createButton("Cnd.select_all", "no_border");
		p.Cnd_deselect_all = p.beansFactory.createButton("Cnd.deselect_all", "no_border");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBDP_ExpProvSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MGBDP_ExpProvSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTtl(MGBDP_ExpProvSrch p) {
		// ブロック関連の初期化
		p.TtlPanel = p.beansFactory.createPanel("Ttl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBDP_ExpProvSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispRslt(MGBDP_ExpProvSrch p) {
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
		p.columnDispRslt_lot_no = p.beansFactory.createTableColumn("DispRslt.lot_no", MCColumnType.TEXT);
		p.columnDispRslt_sublot_no = p.beansFactory.createTableColumn("DispRslt.sublot_no", MCColumnType.TEXT);
		p.columnDispRslt_sno1 = p.beansFactory.createTableColumn("DispRslt.sno1", MCColumnType.TEXT);
		p.columnDispRslt_sno2 = p.beansFactory.createTableColumn("DispRslt.sno2", MCColumnType.TEXT);
		p.columnDispRslt_sno3 = p.beansFactory.createTableColumn("DispRslt.sno3", MCColumnType.TEXT);
		p.columnDispRslt_sno4 = p.beansFactory.createTableColumn("DispRslt.sno4", MCColumnType.TEXT);
		p.columnDispRslt_prsppl_cd = p.beansFactory.createTableColumn("DispRslt.prsppl_cd", MCColumnType.TEXT);
		p.columnDispRslt_prsppl_nm = p.beansFactory.createTableColumn("DispRslt.prsppl_nm", MCColumnType.TEXT);
		p.columnDispRslt_prov_typ = p.beansFactory.createTableColumn("DispRslt.prov_typ", MCColumnType.TEXT);
		p.columnDispRslt_prov_typ_nm = p.beansFactory.createTableColumn("DispRslt.prov_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_unit_cd = p.beansFactory.createTableColumn("DispRslt.unit_cd", MCColumnType.TEXT);
		p.columnDispRslt_unit_nm = p.beansFactory.createTableColumn("DispRslt.unit_nm", MCColumnType.TEXT);
		p.columnDispRslt_dec_place = p.beansFactory.createTableColumn("DispRslt.dec_place", MCColumnType.NUMBER);
		p.columnDispRslt_ttl = p.beansFactory.createTableColumn("DispRslt.ttl", MCColumnType.NUMBER);
		p.columnDispRslt_col_01 = p.beansFactory.createTableColumn("DispRslt.col_01", MCColumnType.NUMBER);
		p.columnDispRslt_col_03 = p.beansFactory.createTableColumn("DispRslt.col_03", MCColumnType.NUMBER);
		p.columnDispRslt_col_05 = p.beansFactory.createTableColumn("DispRslt.col_05", MCColumnType.NUMBER);
		p.columnDispRslt_col_07 = p.beansFactory.createTableColumn("DispRslt.col_07", MCColumnType.NUMBER);
		p.columnDispRslt_col_09 = p.beansFactory.createTableColumn("DispRslt.col_09", MCColumnType.NUMBER);
		p.columnDispRslt_col_11 = p.beansFactory.createTableColumn("DispRslt.col_11", MCColumnType.NUMBER);
		p.columnDispRslt_col_13 = p.beansFactory.createTableColumn("DispRslt.col_13", MCColumnType.NUMBER);
		p.columnDispRslt_col_15 = p.beansFactory.createTableColumn("DispRslt.col_15", MCColumnType.NUMBER);
		p.columnDispRslt_col_17 = p.beansFactory.createTableColumn("DispRslt.col_17", MCColumnType.NUMBER);
		p.columnDispRslt_col_19 = p.beansFactory.createTableColumn("DispRslt.col_19", MCColumnType.NUMBER);
		p.columnDispRslt_col_21 = p.beansFactory.createTableColumn("DispRslt.col_21", MCColumnType.NUMBER);
		p.columnDispRslt_col_23 = p.beansFactory.createTableColumn("DispRslt.col_23", MCColumnType.NUMBER);
		p.cgDispRslt_cg_ttl = p.beansFactory.createColumnGroup("DispRslt.cg_ttl");
		p.cgDispRslt_cg0 = p.beansFactory.createColumnGroup("DispRslt.cg0");
		p.cgDispRslt_cg1 = p.beansFactory.createColumnGroup("DispRslt.cg1");
		p.cgDispRslt_cg2 = p.beansFactory.createColumnGroup("DispRslt.cg2");
		p.cgDispRslt_cg3 = p.beansFactory.createColumnGroup("DispRslt.cg3");
		p.cgDispRslt_cg4 = p.beansFactory.createColumnGroup("DispRslt.cg4");
		p.cgDispRslt_cg5 = p.beansFactory.createColumnGroup("DispRslt.cg5");
		p.cgDispRslt_cg6 = p.beansFactory.createColumnGroup("DispRslt.cg6");
		p.cgDispRslt_cg7 = p.beansFactory.createColumnGroup("DispRslt.cg7");
		p.cgDispRslt_cg8 = p.beansFactory.createColumnGroup("DispRslt.cg8");
		p.cgDispRslt_cg9 = p.beansFactory.createColumnGroup("DispRslt.cg9");
		p.cgDispRslt_cg10 = p.beansFactory.createColumnGroup("DispRslt.cg10");
		p.cgDispRslt_cg11 = p.beansFactory.createColumnGroup("DispRslt.cg11");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBDP_ExpProvSrch p) {
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
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MGBDP_ExpProvSrch p) {
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
	protected static void jbInitTab1(MGBDP_ExpProvSrch p) {
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
	protected static void jbInitTab2(MGBDP_ExpProvSrch p) {
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
	protected static void jbInitTab3(MGBDP_ExpProvSrch p) {
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
	protected static void jbInitTab4(MGBDP_ExpProvSrch p) {
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
	protected static void jbInitCnd(MGBDP_ExpProvSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_no_p_PPanel.setNextBeans(p.Cnd_term);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setLinkBeans(p.Cnd_rmrks,p.Cnd_term);
		p.CndPanel.add(p.Cnd_term);
		p.Cnd_term.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_term.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.term_META);
		p.Cnd_term.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_mng_dpt_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_mng_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mng_dpt_cd, true);
		p.Cnd_mng_dpt_cd.setLinkBeans(p.Cnd_mng_dpt_nm);
		p.CndPanel.add(p.Cnd_mng_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_mng_dpt_cd);
		p.Cnd_mng_dpt_cd.setNextBeans(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.mng_dpt_cd_META);
		p.CndPanel.add(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_mng_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.mng_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_mng_dpt_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_jnl_cd, true);
		p.Cnd_itm_jnl_cd.setLinkBeans(p.Cnd_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setNextBeans(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_jnl_nm_META);
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
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno1);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.sublot_no_META);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno1_Label);
		p.CndPanel.add(p.Cnd_sno1);
		p.Cnd_sno1.setNextBeans(p.Cnd_sno2);
		p.Cnd_sno1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.sno1_META);
		p.setPluralValueEnable(p.Cnd_sno1, true);
		p.CndPanel.add(p.Cnd_sno2_Label);
		p.CndPanel.add(p.Cnd_sno2);
		p.Cnd_sno2.setNextBeans(p.Cnd_sno3);
		p.Cnd_sno2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.sno2_META);
		p.setPluralValueEnable(p.Cnd_sno2, true);
		p.CndPanel.add(p.Cnd_sno3_Label);
		p.CndPanel.add(p.Cnd_sno3);
		p.Cnd_sno3.setNextBeans(p.Cnd_sno4);
		p.Cnd_sno3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.sno3_META);
		p.setPluralValueEnable(p.Cnd_sno3, true);
		p.CndPanel.add(p.Cnd_sno4_Label);
		p.CndPanel.add(p.Cnd_sno4);
		p.Cnd_sno4.setNextBeans(p.Cnd_prov_typ);
		p.Cnd_sno4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.sno4_META);
		p.setPluralValueEnable(p.Cnd_sno4, true);
		p.Cnd_prov_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prov_typ, true);
		p.Cnd_prov_typ.setLinkBeans(p.Cnd_prov_typ_nm);
		p.CndPanel.add(p.Cnd_prov_typ_Label);
		p.CndPanel.add(p.Cnd_prov_typ);
		p.Cnd_prov_typ.setNextBeans(p.Cnd_prov_typ_nm);
		p.Cnd_prov_typ.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prov_typ_META);
		p.CndPanel.add(p.Cnd_prov_typ_nm);
		p.Cnd_prov_typ_nm.setNextBeans(p.Cnd_prsppl_cd);
		p.Cnd_prov_typ_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prov_typ_nm_META);
		p.CndPanel.add(p.Cnd_prsppl_cd_Label);
		p.CndPanel.add(p.Cnd_prsppl_cd);
		p.Cnd_prsppl_cd.setNextBeans(p.Cnd_prsppl_nm);
		p.Cnd_prsppl_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_cd_META);
		p.Cnd_prsppl_cd.addLinkBeans(p.Cnd_prsppl_nm);
		p.Cnd_prsppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_cd, true);
		p.CndPanel.add(p.Cnd_prsppl_nm);
		p.Cnd_prsppl_nm.setNextBeans(p.Cnd_prsppl_cntry_cd);
		p.Cnd_prsppl_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_nm_META);
		p.setPluralValueEnable(p.Cnd_prsppl_nm, true);
		p.Cnd_prsppl_cntry_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_cntry_cd, true);
		p.Cnd_prsppl_cntry_cd.setLinkBeans(p.Cnd_prsppl_cntry_nm);
		p.CndPanel.add(p.Cnd_prsppl_cntry_cd_Label);
		p.CndPanel.add(p.Cnd_prsppl_cntry_cd);
		p.Cnd_prsppl_cntry_cd.setNextBeans(p.Cnd_prsppl_cntry_nm);
		p.Cnd_prsppl_cntry_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_cntry_cd_META);
		p.CndPanel.add(p.Cnd_prsppl_cntry_nm);
		p.Cnd_prsppl_cntry_nm.setNextBeans(p.Cnd_prsppl_area_cd);
		p.Cnd_prsppl_cntry_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_cntry_nm_META);
		p.setPluralValueEnable(p.Cnd_prsppl_cntry_nm, true);
		p.Cnd_prsppl_area_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_area_cd, true);
		p.Cnd_prsppl_area_cd.setLinkBeans(p.Cnd_prsppl_area_nm);
		p.CndPanel.add(p.Cnd_prsppl_area_cd_Label);
		p.CndPanel.add(p.Cnd_prsppl_area_cd);
		p.Cnd_prsppl_area_cd.setNextBeans(p.Cnd_prsppl_area_nm);
		p.Cnd_prsppl_area_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_area_cd_META);
		p.CndPanel.add(p.Cnd_prsppl_area_nm);
		p.Cnd_prsppl_area_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_area_nm_META);
		p.setPluralValueEnable(p.Cnd_prsppl_area_nm, true);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
		p.Cnd_prsppl_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_cd1, true);
		p.Cnd_prsppl_grp_cd1.setLinkBeans(p.Cnd_prsppl_grp_nm1);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd1_Label);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd1);
		p.Cnd3Panel.setLastBeans(p.Cnd_prsppl_grp_cd1);
		p.Cnd_prsppl_grp_cd1.setNextBeans(p.Cnd_prsppl_grp_nm1);
		p.Cnd_prsppl_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_cd1_META);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_nm1);
		p.Cnd_prsppl_grp_nm1.setNextBeans(p.Cnd_prsppl_grp_cd2);
		p.Cnd_prsppl_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_nm1, true);
		p.Cnd_prsppl_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_cd2, true);
		p.Cnd_prsppl_grp_cd2.setLinkBeans(p.Cnd_prsppl_grp_nm2);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd2_Label);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd2);
		p.Cnd_prsppl_grp_cd2.setNextBeans(p.Cnd_prsppl_grp_nm2);
		p.Cnd_prsppl_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_cd2_META);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_nm2);
		p.Cnd_prsppl_grp_nm2.setNextBeans(p.Cnd_prsppl_grp_cd3);
		p.Cnd_prsppl_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_nm2, true);
		p.Cnd_prsppl_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_cd3, true);
		p.Cnd_prsppl_grp_cd3.setLinkBeans(p.Cnd_prsppl_grp_nm3);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd3_Label);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd3);
		p.Cnd_prsppl_grp_cd3.setNextBeans(p.Cnd_prsppl_grp_nm3);
		p.Cnd_prsppl_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_cd3_META);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_nm3);
		p.Cnd_prsppl_grp_nm3.setNextBeans(p.Cnd_prsppl_grp_cd4);
		p.Cnd_prsppl_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_nm3, true);
		p.Cnd_prsppl_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_cd4, true);
		p.Cnd_prsppl_grp_cd4.setLinkBeans(p.Cnd_prsppl_grp_nm4);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd4_Label);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd4);
		p.Cnd_prsppl_grp_cd4.setNextBeans(p.Cnd_prsppl_grp_nm4);
		p.Cnd_prsppl_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_cd4_META);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_nm4);
		p.Cnd_prsppl_grp_nm4.setNextBeans(p.Cnd_prsppl_grp_cd5);
		p.Cnd_prsppl_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_nm4, true);
		p.Cnd_prsppl_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_cd5, true);
		p.Cnd_prsppl_grp_cd5.setLinkBeans(p.Cnd_prsppl_grp_nm5);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd5_Label);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd5);
		p.Cnd_prsppl_grp_cd5.setNextBeans(p.Cnd_prsppl_grp_nm5);
		p.Cnd_prsppl_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_cd5_META);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_nm5);
		p.Cnd_prsppl_grp_nm5.setNextBeans(p.Cnd_prsppl_grp_cd6);
		p.Cnd_prsppl_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_nm5, true);
		p.Cnd_prsppl_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_cd6, true);
		p.Cnd_prsppl_grp_cd6.setLinkBeans(p.Cnd_prsppl_grp_nm6);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd6_Label);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd6);
		p.Cnd_prsppl_grp_cd6.setNextBeans(p.Cnd_prsppl_grp_nm6);
		p.Cnd_prsppl_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_cd6_META);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_nm6);
		p.Cnd_prsppl_grp_nm6.setNextBeans(p.Cnd_prsppl_grp_cd7);
		p.Cnd_prsppl_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_nm6, true);
		p.Cnd_prsppl_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_cd7, true);
		p.Cnd_prsppl_grp_cd7.setLinkBeans(p.Cnd_prsppl_grp_nm7);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd7_Label);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd7);
		p.Cnd_prsppl_grp_cd7.setNextBeans(p.Cnd_prsppl_grp_nm7);
		p.Cnd_prsppl_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_cd7_META);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_nm7);
		p.Cnd_prsppl_grp_nm7.setNextBeans(p.Cnd_prsppl_grp_cd8);
		p.Cnd_prsppl_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_nm7, true);
		p.Cnd_prsppl_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_cd8, true);
		p.Cnd_prsppl_grp_cd8.setLinkBeans(p.Cnd_prsppl_grp_nm8);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd8_Label);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd8);
		p.Cnd_prsppl_grp_cd8.setNextBeans(p.Cnd_prsppl_grp_nm8);
		p.Cnd_prsppl_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_cd8_META);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_nm8);
		p.Cnd_prsppl_grp_nm8.setNextBeans(p.Cnd_prsppl_grp_cd9);
		p.Cnd_prsppl_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_nm8, true);
		p.Cnd_prsppl_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_cd9, true);
		p.Cnd_prsppl_grp_cd9.setLinkBeans(p.Cnd_prsppl_grp_nm9);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd9_Label);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd9);
		p.Cnd_prsppl_grp_cd9.setNextBeans(p.Cnd_prsppl_grp_nm9);
		p.Cnd_prsppl_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_cd9_META);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_nm9);
		p.Cnd_prsppl_grp_nm9.setNextBeans(p.Cnd_prsppl_grp_cd10);
		p.Cnd_prsppl_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_nm9, true);
		p.Cnd_prsppl_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_cd10, true);
		p.Cnd_prsppl_grp_cd10.setLinkBeans(p.Cnd_prsppl_grp_nm10);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd10_Label);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_cd10);
		p.Cnd_prsppl_grp_cd10.setNextBeans(p.Cnd_prsppl_grp_nm10);
		p.Cnd_prsppl_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_cd10_META);
		p.Cnd3Panel.add(p.Cnd_prsppl_grp_nm10);
		p.Cnd_prsppl_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_prsppl_grp_nm10, true);
		p.TtlPanel.add(p.Cnd_wg_flg);
		p.TtlPanel.setLastBeans(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setNextBeans(p.Cnd_mng_dpt_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.wg_flg_META);
		p.TtlPanel.add(p.Cnd_mng_dpt_flg);
		p.Cnd_mng_dpt_flg.setNextBeans(p.Cnd_lot_flg);
		p.Cnd_mng_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.mng_dpt_flg_META);
		p.TtlPanel.add(p.Cnd_lot_flg);
		p.Cnd_lot_flg.setNextBeans(p.Cnd_sublot_flg);
		p.Cnd_lot_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.lot_flg_META);
		p.TtlPanel.add(p.Cnd_sublot_flg);
		p.Cnd_sublot_flg.setNextBeans(p.Cnd_sno1_flg);
		p.Cnd_sublot_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.sublot_flg_META);
		p.TtlPanel.add(p.Cnd_sno1_flg);
		p.Cnd_sno1_flg.setNextBeans(p.Cnd_sno2_flg);
		p.Cnd_sno1_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.sno1_flg_META);
		p.TtlPanel.add(p.Cnd_sno2_flg);
		p.Cnd_sno2_flg.setNextBeans(p.Cnd_sno3_flg);
		p.Cnd_sno2_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.sno2_flg_META);
		p.TtlPanel.add(p.Cnd_sno3_flg);
		p.Cnd_sno3_flg.setNextBeans(p.Cnd_sno4_flg);
		p.Cnd_sno3_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.sno3_flg_META);
		p.TtlPanel.add(p.Cnd_sno4_flg);
		p.Cnd_sno4_flg.setNextBeans(p.Cnd_prsppl_flg);
		p.Cnd_sno4_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.sno4_flg_META);
		p.TtlPanel.add(p.Cnd_prsppl_flg);
		p.Cnd_prsppl_flg.setNextBeans(p.Cnd_prov_flg);
		p.Cnd_prsppl_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prsppl_flg_META);
		p.TtlPanel.add(p.Cnd_prov_flg);
		p.Cnd_prov_flg.setNextBeans(p.Cnd_select_all);
		p.Cnd_prov_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0140.CndR.prov_flg_META);
		p.Cnd_select_all.setIcon("SELECT_ALL");
		p.Cnd_select_all.setFunctionKey(MCFunctionKey.F13);
		p.TtlPanel.add(p.Cnd_select_all);
		p.Cnd_select_all.setNextBeans(p.Cnd_deselect_all);
		p.Cnd_deselect_all.setIcon("DESELECT_ALL");
		p.Cnd_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.TtlPanel.add(p.Cnd_deselect_all);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MGBDP_ExpProvSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MGBDP_ExpProvSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTtl(MGBDP_ExpProvSrch p) {
		// ブロック関連の初期化
		p.TtlPanel.setValueCheck(false);
		p.TtlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBDP_ExpProvSrch p) {
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
	protected static void jbInitDispRslt(MGBDP_ExpProvSrch p) {
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
		MGBDP_ExpProvSrch_MC.mcInitTop((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.mcInitFold((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.mcInitTab1((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.mcInitTab2((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.mcInitTab3((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.mcInitTab4((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.mcInitCnd((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.mcInitCnd2((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.mcInitCnd3((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.mcInitTtl((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.mcInitCtrl((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.mcInitDispRslt((MGBDP_ExpProvSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBDP_ExpProvSrch_MC.statusInitSRCH_Top((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitSRCH_Fold((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitSRCH_Tab1((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitSRCH_Tab2((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitSRCH_Tab3((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitSRCH_Tab4((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitSRCH_Cnd((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitSRCH_Cnd2((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitSRCH_Cnd3((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitSRCH_Ttl((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitSRCH_Ctrl((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitSRCH_DispRslt((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitSRCH_Rslt((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitSRCH_Hdr((MGBDP_ExpProvSrch)this);

		// [REF]ステータスのモードの設定
		MGBDP_ExpProvSrch_MC.statusInitREF_Top((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitREF_Fold((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitREF_Tab1((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitREF_Tab2((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitREF_Tab3((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitREF_Tab4((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitREF_Cnd((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitREF_Cnd2((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitREF_Cnd3((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitREF_Ttl((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitREF_Ctrl((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitREF_DispRslt((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitREF_Rslt((MGBDP_ExpProvSrch)this);
		MGBDP_ExpProvSrch_MC.statusInitREF_Hdr((MGBDP_ExpProvSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBDP_ExpProvSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBDP_ExpProvSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBDP_ExpProvSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBDP_ExpProvSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MGBDP_ExpProvSrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MGBDP_ExpProvSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_ExpProvSrch p) {
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_term.setListListener(p);
		p.Cnd_term.addAllListener(p);
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
		p.Cnd_prov_typ.setListListener(p);
		p.Cnd_prov_typ.addAllListener(p);
		p.Cnd_prov_typ_nm.setListListener(p);
		p.Cnd_prov_typ_nm.addAllListener(p);
		p.Cnd_prsppl_cd.setListListener(p);
		p.Cnd_prsppl_cd.addAllListener(p);
		p.Cnd_prsppl_nm.setListListener(p);
		p.Cnd_prsppl_nm.addAllListener(p);
		p.Cnd_prsppl_cntry_cd.setListListener(p);
		p.Cnd_prsppl_cntry_cd.addAllListener(p);
		p.Cnd_prsppl_cntry_nm.setListListener(p);
		p.Cnd_prsppl_cntry_nm.addAllListener(p);
		p.Cnd_prsppl_area_cd.setListListener(p);
		p.Cnd_prsppl_area_cd.addAllListener(p);
		p.Cnd_prsppl_area_nm.setListListener(p);
		p.Cnd_prsppl_area_nm.addAllListener(p);
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
		p.Cnd_prsppl_grp_cd1.setListListener(p);
		p.Cnd_prsppl_grp_cd1.addAllListener(p);
		p.Cnd_prsppl_grp_nm1.setListListener(p);
		p.Cnd_prsppl_grp_nm1.addAllListener(p);
		p.Cnd_prsppl_grp_cd2.setListListener(p);
		p.Cnd_prsppl_grp_cd2.addAllListener(p);
		p.Cnd_prsppl_grp_nm2.setListListener(p);
		p.Cnd_prsppl_grp_nm2.addAllListener(p);
		p.Cnd_prsppl_grp_cd3.setListListener(p);
		p.Cnd_prsppl_grp_cd3.addAllListener(p);
		p.Cnd_prsppl_grp_nm3.setListListener(p);
		p.Cnd_prsppl_grp_nm3.addAllListener(p);
		p.Cnd_prsppl_grp_cd4.setListListener(p);
		p.Cnd_prsppl_grp_cd4.addAllListener(p);
		p.Cnd_prsppl_grp_nm4.setListListener(p);
		p.Cnd_prsppl_grp_nm4.addAllListener(p);
		p.Cnd_prsppl_grp_cd5.setListListener(p);
		p.Cnd_prsppl_grp_cd5.addAllListener(p);
		p.Cnd_prsppl_grp_nm5.setListListener(p);
		p.Cnd_prsppl_grp_nm5.addAllListener(p);
		p.Cnd_prsppl_grp_cd6.setListListener(p);
		p.Cnd_prsppl_grp_cd6.addAllListener(p);
		p.Cnd_prsppl_grp_nm6.setListListener(p);
		p.Cnd_prsppl_grp_nm6.addAllListener(p);
		p.Cnd_prsppl_grp_cd7.setListListener(p);
		p.Cnd_prsppl_grp_cd7.addAllListener(p);
		p.Cnd_prsppl_grp_nm7.setListListener(p);
		p.Cnd_prsppl_grp_nm7.addAllListener(p);
		p.Cnd_prsppl_grp_cd8.setListListener(p);
		p.Cnd_prsppl_grp_cd8.addAllListener(p);
		p.Cnd_prsppl_grp_nm8.setListListener(p);
		p.Cnd_prsppl_grp_nm8.addAllListener(p);
		p.Cnd_prsppl_grp_cd9.setListListener(p);
		p.Cnd_prsppl_grp_cd9.addAllListener(p);
		p.Cnd_prsppl_grp_nm9.setListListener(p);
		p.Cnd_prsppl_grp_nm9.addAllListener(p);
		p.Cnd_prsppl_grp_cd10.setListListener(p);
		p.Cnd_prsppl_grp_cd10.addAllListener(p);
		p.Cnd_prsppl_grp_nm10.setListListener(p);
		p.Cnd_prsppl_grp_nm10.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_mng_dpt_flg.addAllListener(p);
		p.Cnd_lot_flg.addAllListener(p);
		p.Cnd_sublot_flg.addAllListener(p);
		p.Cnd_sno1_flg.addAllListener(p);
		p.Cnd_sno2_flg.addAllListener(p);
		p.Cnd_sno3_flg.addAllListener(p);
		p.Cnd_sno4_flg.addAllListener(p);
		p.Cnd_prsppl_flg.addAllListener(p);
		p.Cnd_prov_flg.addAllListener(p);
		p.Cnd_select_all.addAllListener(p);
		p.Cnd_select_all.setAPMethodName("doCnd_select_all");
		p.Cnd_deselect_all.addAllListener(p);
		p.Cnd_deselect_all.setAPMethodName("doCnd_deselect_all");
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBDP_ExpProvSrch p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MGBDP_ExpProvSrch p) {
	}

	/**
	 *  [Ttl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTtl(MGBDP_ExpProvSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBDP_ExpProvSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispRslt(MGBDP_ExpProvSrch p) {
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
		p.columnDispRslt_prsppl_cd.addAllListener(p);
		p.columnDispRslt_prsppl_cd.setListListener(p);
		p.columnDispRslt_prsppl_nm.addAllListener(p);
		p.columnDispRslt_prsppl_nm.setListListener(p);
		p.columnDispRslt_prov_typ.addAllListener(p);
		p.columnDispRslt_prov_typ.setListListener(p);
		p.columnDispRslt_prov_typ_nm.addAllListener(p);
		p.columnDispRslt_prov_typ_nm.setListListener(p);
		p.columnDispRslt_unit_cd.addAllListener(p);
		p.columnDispRslt_unit_cd.setListListener(p);
		p.columnDispRslt_unit_nm.addAllListener(p);
		p.columnDispRslt_unit_nm.setListListener(p);
		p.columnDispRslt_dec_place.addAllListener(p);
		p.columnDispRslt_dec_place.setListListener(p);
		p.columnDispRslt_ttl.addAllListener(p);
		p.columnDispRslt_ttl.setListListener(p);
		p.columnDispRslt_col_01.addAllListener(p);
		p.columnDispRslt_col_01.setListListener(p);
		p.columnDispRslt_col_03.addAllListener(p);
		p.columnDispRslt_col_03.setListListener(p);
		p.columnDispRslt_col_05.addAllListener(p);
		p.columnDispRslt_col_05.setListListener(p);
		p.columnDispRslt_col_07.addAllListener(p);
		p.columnDispRslt_col_07.setListListener(p);
		p.columnDispRslt_col_09.addAllListener(p);
		p.columnDispRslt_col_09.setListListener(p);
		p.columnDispRslt_col_11.addAllListener(p);
		p.columnDispRslt_col_11.setListListener(p);
		p.columnDispRslt_col_13.addAllListener(p);
		p.columnDispRslt_col_13.setListListener(p);
		p.columnDispRslt_col_15.addAllListener(p);
		p.columnDispRslt_col_15.setListListener(p);
		p.columnDispRslt_col_17.addAllListener(p);
		p.columnDispRslt_col_17.setListListener(p);
		p.columnDispRslt_col_19.addAllListener(p);
		p.columnDispRslt_col_19.setListListener(p);
		p.columnDispRslt_col_21.addAllListener(p);
		p.columnDispRslt_col_21.setListListener(p);
		p.columnDispRslt_col_23.addAllListener(p);
		p.columnDispRslt_col_23.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBDP_ExpProvSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBDP_ExpProvSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MGBDP_ExpProvSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MGBDP_ExpProvSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MGBDP_ExpProvSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab4(MGBDP_ExpProvSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBDP_ExpProvSrch p){
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_term.putMode(p, SRCH, MCMode.INVISIBLE);
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
		p.Cnd_prov_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_prsppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_cntry_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_cntry_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_area_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_area_nm.putMode(p, SRCH, MCMode.ENABLE);
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
		p.Cnd_prsppl_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_mng_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_lot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sublot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno1_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno2_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno3_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno4_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_prsppl_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_prov_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MGBDP_ExpProvSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MGBDP_ExpProvSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ttl(MGBDP_ExpProvSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBDP_ExpProvSrch p){

	}

	/**
	 * [SRCH]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DispRslt(MGBDP_ExpProvSrch p){
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
		p.columnDispRslt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_prsppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_prsppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_prov_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.DispRslt_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_ttl.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_00_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_01.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_02_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_03.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_04_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_05.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_06_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_07.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_08_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_09.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_10_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_11.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_12_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_13.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_14_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_15.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_16_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_17.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_18_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_19.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_20_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_21.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_qty_22_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_23.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBDP_ExpProvSrch p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MGBDP_ExpProvSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBDP_ExpProvSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBDP_ExpProvSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBDP_ExpProvSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBDP_ExpProvSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MGBDP_ExpProvSrch p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MGBDP_ExpProvSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBDP_ExpProvSrch p){
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_term.putMode(p, REF, MCMode.INVISIBLE);
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
		p.Cnd_prov_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prov_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_prsppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_cntry_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_cntry_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_area_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_area_nm.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_prsppl_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prsppl_grp_nm10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mng_dpt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_lot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sublot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno1_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno2_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno3_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno4_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_prsppl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_prov_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBDP_ExpProvSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MGBDP_ExpProvSrch p){

	}

	/**
	 * [REF]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ttl(MGBDP_ExpProvSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBDP_ExpProvSrch p){

	}

	/**
	 * [REF]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispRslt(MGBDP_ExpProvSrch p){
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
		p.columnDispRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_prsppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_prsppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_prov_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_prov_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.DispRslt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_ttl.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_00_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_01.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_02_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_03.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_04_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_05.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_06_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_07.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_08_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_09.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_10_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_11.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_12_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_13.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_14_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_15.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_16_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_17.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_18_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_19.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_20_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_21.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_qty_22_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispRslt_col_23.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBDP_ExpProvSrch p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MGBDP_ExpProvSrch p){

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
		MGBDP_ExpProvSrch_MC.setTableConfigDispRslt((MGBDP_ExpProvSrch)this);
	}

	/**
	 * [DispRslt]ブロックのTableの設定
	 */
	protected static void setTableConfigDispRslt(MGBDP_ExpProvSrch p) {
		p.columnDispRslt_wg_cd.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.wg_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_cd);
		p.columnDispRslt_wg_nm.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.wg_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_nm);
		p.columnDispRslt_mng_dpt_cd.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.mng_dpt_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_cd);
		p.columnDispRslt_mng_dpt_nm.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.mng_dpt_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_nm);
		p.DispRsltTable.addTable(p.DispRslt_itm_p_PPanel.ItmTable);
		p.columnDispRslt_itm_typ.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.itm_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ);
		p.columnDispRslt_itm_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.itm_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_nm);
		p.columnDispRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.itm_typ_d_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_cd);
		p.columnDispRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.itm_typ_d_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_nm);
		p.columnDispRslt_itm_jnl_cd.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.itm_jnl_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_jnl_cd);
		p.columnDispRslt_itm_jnl_nm.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.itm_jnl_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_jnl_nm);
		p.columnDispRslt_lot_no.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.lot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_lot_no);
		p.columnDispRslt_sublot_no.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.sublot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sublot_no);
		p.columnDispRslt_sno1.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.sno1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno1);
		p.columnDispRslt_sno2.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.sno2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno2);
		p.columnDispRslt_sno3.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.sno3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno3);
		p.columnDispRslt_sno4.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.sno4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno4);
		p.columnDispRslt_prsppl_cd.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.prsppl_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_prsppl_cd);
		p.columnDispRslt_prsppl_nm.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.prsppl_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_prsppl_nm);
		p.columnDispRslt_prov_typ.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.prov_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_prov_typ);
		p.columnDispRslt_prov_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.prov_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_prov_typ_nm);
		p.columnDispRslt_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.unit_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_unit_cd);
		p.columnDispRslt_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.unit_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_unit_nm);
		p.columnDispRslt_dec_place.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.dec_place_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dec_place);
		p.DispRsltTable.addTable(p.DispRslt_qty_p_PPanel.QtyTable);
		p.columnDispRslt_ttl.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.ttl_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_ttl);
		p.DispRsltTable.addTable(p.DispRslt_qty_00_p_PPanel.QtyTable);
		p.columnDispRslt_col_01.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.col_01_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_01);
		p.DispRsltTable.addTable(p.DispRslt_qty_02_p_PPanel.QtyTable);
		p.columnDispRslt_col_03.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.col_03_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_03);
		p.DispRsltTable.addTable(p.DispRslt_qty_04_p_PPanel.QtyTable);
		p.columnDispRslt_col_05.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.col_05_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_05);
		p.DispRsltTable.addTable(p.DispRslt_qty_06_p_PPanel.QtyTable);
		p.columnDispRslt_col_07.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.col_07_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_07);
		p.DispRsltTable.addTable(p.DispRslt_qty_08_p_PPanel.QtyTable);
		p.columnDispRslt_col_09.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.col_09_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_09);
		p.DispRsltTable.addTable(p.DispRslt_qty_10_p_PPanel.QtyTable);
		p.columnDispRslt_col_11.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.col_11_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_11);
		p.DispRsltTable.addTable(p.DispRslt_qty_12_p_PPanel.QtyTable);
		p.columnDispRslt_col_13.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.col_13_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_13);
		p.DispRsltTable.addTable(p.DispRslt_qty_14_p_PPanel.QtyTable);
		p.columnDispRslt_col_15.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.col_15_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_15);
		p.DispRsltTable.addTable(p.DispRslt_qty_16_p_PPanel.QtyTable);
		p.columnDispRslt_col_17.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.col_17_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_17);
		p.DispRsltTable.addTable(p.DispRslt_qty_18_p_PPanel.QtyTable);
		p.columnDispRslt_col_19.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.col_19_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_19);
		p.DispRsltTable.addTable(p.DispRslt_qty_20_p_PPanel.QtyTable);
		p.columnDispRslt_col_21.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.col_21_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_21);
		p.DispRsltTable.addTable(p.DispRslt_qty_22_p_PPanel.QtyTable);
		p.columnDispRslt_col_23.setMeta(mcframe.clientMGBD.MGBDP0140.DispRsltR.col_23_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_23);
		p.DispRsltTable.addColumnGroup(p.DispRslt_itm_p_PPanel.ItmTable);
		p.cgDispRslt_cg_ttl.add(p.DispRslt_qty_p_PPanel.QtyTable);
		p.cgDispRslt_cg_ttl.add(p.columnDispRslt_ttl);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg_ttl);
		p.cgDispRslt_cg0.add(p.DispRslt_qty_00_p_PPanel.QtyTable);
		p.cgDispRslt_cg0.add(p.columnDispRslt_col_01);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg0);
		p.cgDispRslt_cg1.add(p.DispRslt_qty_02_p_PPanel.QtyTable);
		p.cgDispRslt_cg1.add(p.columnDispRslt_col_03);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg1);
		p.cgDispRslt_cg2.add(p.DispRslt_qty_04_p_PPanel.QtyTable);
		p.cgDispRslt_cg2.add(p.columnDispRslt_col_05);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg2);
		p.cgDispRslt_cg3.add(p.DispRslt_qty_06_p_PPanel.QtyTable);
		p.cgDispRslt_cg3.add(p.columnDispRslt_col_07);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg3);
		p.cgDispRslt_cg4.add(p.DispRslt_qty_08_p_PPanel.QtyTable);
		p.cgDispRslt_cg4.add(p.columnDispRslt_col_09);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg4);
		p.cgDispRslt_cg5.add(p.DispRslt_qty_10_p_PPanel.QtyTable);
		p.cgDispRslt_cg5.add(p.columnDispRslt_col_11);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg5);
		p.cgDispRslt_cg6.add(p.DispRslt_qty_12_p_PPanel.QtyTable);
		p.cgDispRslt_cg6.add(p.columnDispRslt_col_13);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg6);
		p.cgDispRslt_cg7.add(p.DispRslt_qty_14_p_PPanel.QtyTable);
		p.cgDispRslt_cg7.add(p.columnDispRslt_col_15);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg7);
		p.cgDispRslt_cg8.add(p.DispRslt_qty_16_p_PPanel.QtyTable);
		p.cgDispRslt_cg8.add(p.columnDispRslt_col_17);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg8);
		p.cgDispRslt_cg9.add(p.DispRslt_qty_18_p_PPanel.QtyTable);
		p.cgDispRslt_cg9.add(p.columnDispRslt_col_19);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg9);
		p.cgDispRslt_cg10.add(p.DispRslt_qty_20_p_PPanel.QtyTable);
		p.cgDispRslt_cg10.add(p.columnDispRslt_col_21);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg10);
		p.cgDispRslt_cg11.add(p.DispRslt_qty_22_p_PPanel.QtyTable);
		p.cgDispRslt_cg11.add(p.columnDispRslt_col_23);
		p.DispRsltTable.addColumnGroup(p.cgDispRslt_cg11);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd.getListConfig().setPutter(getCnd_calc_grp_cd_ListPutter());
		Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_no_p_PPanel.CalcNo_calc_no.getListConfig().setPutter(getCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter());
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
		Cnd_prov_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prov_typ.getListConfig().setPutter(getCnd_prov_typ_ListPutter());
		Cnd_prsppl_cd.getListConfig().setPutter(getCnd_prsppl_cd_ListPutter());
		Cnd_prsppl_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_cntry_cd.getListConfig().setPutter(getCnd_prsppl_cntry_cd_ListPutter());
		Cnd_prsppl_area_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_area_cd.getListConfig().setPutter(getCnd_prsppl_area_cd_ListPutter());
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
		Cnd_prsppl_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_grp_cd1.getListConfig().setPutter(getCnd_prsppl_grp_cd1_ListPutter());
		Cnd_prsppl_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_grp_cd2.getListConfig().setPutter(getCnd_prsppl_grp_cd2_ListPutter());
		Cnd_prsppl_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_grp_cd3.getListConfig().setPutter(getCnd_prsppl_grp_cd3_ListPutter());
		Cnd_prsppl_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_grp_cd4.getListConfig().setPutter(getCnd_prsppl_grp_cd4_ListPutter());
		Cnd_prsppl_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_grp_cd5.getListConfig().setPutter(getCnd_prsppl_grp_cd5_ListPutter());
		Cnd_prsppl_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_grp_cd6.getListConfig().setPutter(getCnd_prsppl_grp_cd6_ListPutter());
		Cnd_prsppl_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_grp_cd7.getListConfig().setPutter(getCnd_prsppl_grp_cd7_ListPutter());
		Cnd_prsppl_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_grp_cd8.getListConfig().setPutter(getCnd_prsppl_grp_cd8_ListPutter());
		Cnd_prsppl_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_grp_cd9.getListConfig().setPutter(getCnd_prsppl_grp_cd9_ListPutter());
		Cnd_prsppl_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prsppl_grp_cd10.getListConfig().setPutter(getCnd_prsppl_grp_cd10_ListPutter());
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
	 * [Cnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CalcNo");
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
	 * [Cnd_prov_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prov_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_cntry_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_cntry_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_area_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_area_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Area");
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
	 * [Cnd_prsppl_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_prsppl_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prsppl_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_calc_no_p_PPanel.CalcNo_calc_no) return getCnd_calc_no_p_PPanel_CalcNo_calc_no(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_mng_dpt_cd) return getCnd_mng_dpt_cd(row, info);
		if(combo == Cnd_itm_jnl_cd) return getCnd_itm_jnl_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_prov_typ) return getCnd_prov_typ(row, info);
		if(combo == Cnd_prsppl_cd) return getCnd_prsppl_cd(row, info);
		if(combo == Cnd_prsppl_cntry_cd) return getCnd_prsppl_cntry_cd(row, info);
		if(combo == Cnd_prsppl_area_cd) return getCnd_prsppl_area_cd(row, info);
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
		if(combo == Cnd_prsppl_grp_cd1) return getCnd_prsppl_grp_cd1(row, info);
		if(combo == Cnd_prsppl_grp_cd2) return getCnd_prsppl_grp_cd2(row, info);
		if(combo == Cnd_prsppl_grp_cd3) return getCnd_prsppl_grp_cd3(row, info);
		if(combo == Cnd_prsppl_grp_cd4) return getCnd_prsppl_grp_cd4(row, info);
		if(combo == Cnd_prsppl_grp_cd5) return getCnd_prsppl_grp_cd5(row, info);
		if(combo == Cnd_prsppl_grp_cd6) return getCnd_prsppl_grp_cd6(row, info);
		if(combo == Cnd_prsppl_grp_cd7) return getCnd_prsppl_grp_cd7(row, info);
		if(combo == Cnd_prsppl_grp_cd8) return getCnd_prsppl_grp_cd8(row, info);
		if(combo == Cnd_prsppl_grp_cd9) return getCnd_prsppl_grp_cd9(row, info);
		if(combo == Cnd_prsppl_grp_cd10) return getCnd_prsppl_grp_cd10(row, info);
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
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_term) return doCnd_term_VC(info);
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
		if (vc == Cnd_prov_typ) return doCnd_prov_typ_VC(info);
		if (vc == Cnd_prov_typ_nm) return doCnd_prov_typ_nm_VC(info);
		if (vc == Cnd_prsppl_cd) return doCnd_prsppl_cd_VC(info);
		if (vc == Cnd_prsppl_nm) return doCnd_prsppl_nm_VC(info);
		if (vc == Cnd_prsppl_cntry_cd) return doCnd_prsppl_cntry_cd_VC(info);
		if (vc == Cnd_prsppl_cntry_nm) return doCnd_prsppl_cntry_nm_VC(info);
		if (vc == Cnd_prsppl_area_cd) return doCnd_prsppl_area_cd_VC(info);
		if (vc == Cnd_prsppl_area_nm) return doCnd_prsppl_area_nm_VC(info);
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
		if (vc == Cnd_prsppl_grp_cd1) return doCnd_prsppl_grp_cd1_VC(info);
		if (vc == Cnd_prsppl_grp_nm1) return doCnd_prsppl_grp_nm1_VC(info);
		if (vc == Cnd_prsppl_grp_cd2) return doCnd_prsppl_grp_cd2_VC(info);
		if (vc == Cnd_prsppl_grp_nm2) return doCnd_prsppl_grp_nm2_VC(info);
		if (vc == Cnd_prsppl_grp_cd3) return doCnd_prsppl_grp_cd3_VC(info);
		if (vc == Cnd_prsppl_grp_nm3) return doCnd_prsppl_grp_nm3_VC(info);
		if (vc == Cnd_prsppl_grp_cd4) return doCnd_prsppl_grp_cd4_VC(info);
		if (vc == Cnd_prsppl_grp_nm4) return doCnd_prsppl_grp_nm4_VC(info);
		if (vc == Cnd_prsppl_grp_cd5) return doCnd_prsppl_grp_cd5_VC(info);
		if (vc == Cnd_prsppl_grp_nm5) return doCnd_prsppl_grp_nm5_VC(info);
		if (vc == Cnd_prsppl_grp_cd6) return doCnd_prsppl_grp_cd6_VC(info);
		if (vc == Cnd_prsppl_grp_nm6) return doCnd_prsppl_grp_nm6_VC(info);
		if (vc == Cnd_prsppl_grp_cd7) return doCnd_prsppl_grp_cd7_VC(info);
		if (vc == Cnd_prsppl_grp_nm7) return doCnd_prsppl_grp_nm7_VC(info);
		if (vc == Cnd_prsppl_grp_cd8) return doCnd_prsppl_grp_cd8_VC(info);
		if (vc == Cnd_prsppl_grp_nm8) return doCnd_prsppl_grp_nm8_VC(info);
		if (vc == Cnd_prsppl_grp_cd9) return doCnd_prsppl_grp_cd9_VC(info);
		if (vc == Cnd_prsppl_grp_nm9) return doCnd_prsppl_grp_nm9_VC(info);
		if (vc == Cnd_prsppl_grp_cd10) return doCnd_prsppl_grp_cd10_VC(info);
		if (vc == Cnd_prsppl_grp_nm10) return doCnd_prsppl_grp_nm10_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_mng_dpt_flg) return doCnd_mng_dpt_flg_VC(info);
		if (vc == Cnd_lot_flg) return doCnd_lot_flg_VC(info);
		if (vc == Cnd_sublot_flg) return doCnd_sublot_flg_VC(info);
		if (vc == Cnd_sno1_flg) return doCnd_sno1_flg_VC(info);
		if (vc == Cnd_sno2_flg) return doCnd_sno2_flg_VC(info);
		if (vc == Cnd_sno3_flg) return doCnd_sno3_flg_VC(info);
		if (vc == Cnd_sno4_flg) return doCnd_sno4_flg_VC(info);
		if (vc == Cnd_prsppl_flg) return doCnd_prsppl_flg_VC(info);
		if (vc == Cnd_prov_flg) return doCnd_prov_flg_VC(info);
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
		if (vc == columnDispRslt_lot_no) return doDispRslt_lot_no_VC(info);
		if (vc == columnDispRslt_sublot_no) return doDispRslt_sublot_no_VC(info);
		if (vc == columnDispRslt_sno1) return doDispRslt_sno1_VC(info);
		if (vc == columnDispRslt_sno2) return doDispRslt_sno2_VC(info);
		if (vc == columnDispRslt_sno3) return doDispRslt_sno3_VC(info);
		if (vc == columnDispRslt_sno4) return doDispRslt_sno4_VC(info);
		if (vc == columnDispRslt_prsppl_cd) return doDispRslt_prsppl_cd_VC(info);
		if (vc == columnDispRslt_prsppl_nm) return doDispRslt_prsppl_nm_VC(info);
		if (vc == columnDispRslt_prov_typ) return doDispRslt_prov_typ_VC(info);
		if (vc == columnDispRslt_prov_typ_nm) return doDispRslt_prov_typ_nm_VC(info);
		if (vc == columnDispRslt_unit_cd) return doDispRslt_unit_cd_VC(info);
		if (vc == columnDispRslt_unit_nm) return doDispRslt_unit_nm_VC(info);
		if (vc == columnDispRslt_dec_place) return doDispRslt_dec_place_VC(info);
		if (vc == columnDispRslt_ttl) return doDispRslt_ttl_VC(info);
		if (vc == columnDispRslt_col_01) return doDispRslt_col_01_VC(info);
		if (vc == columnDispRslt_col_03) return doDispRslt_col_03_VC(info);
		if (vc == columnDispRslt_col_05) return doDispRslt_col_05_VC(info);
		if (vc == columnDispRslt_col_07) return doDispRslt_col_07_VC(info);
		if (vc == columnDispRslt_col_09) return doDispRslt_col_09_VC(info);
		if (vc == columnDispRslt_col_11) return doDispRslt_col_11_VC(info);
		if (vc == columnDispRslt_col_13) return doDispRslt_col_13_VC(info);
		if (vc == columnDispRslt_col_15) return doDispRslt_col_15_VC(info);
		if (vc == columnDispRslt_col_17) return doDispRslt_col_17_VC(info);
		if (vc == columnDispRslt_col_19) return doDispRslt_col_19_VC(info);
		if (vc == columnDispRslt_col_21) return doDispRslt_col_21_VC(info);
		if (vc == columnDispRslt_col_23) return doDispRslt_col_23_VC(info);
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
	 * [Cnd]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[term]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_term_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[prov_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_area_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[prsppl_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_grp_nm10_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[prsppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prsppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_flg_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[prsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_prsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[prsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_prsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[prov_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_prov_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[prov_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_prov_typ_nm_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[ttl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_ttl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_21]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_21_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_23]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_23_VC(MCEventInfo info){
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
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_term) doCnd_term_NC(info);
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
		else if (nc == Cnd_prov_typ) doCnd_prov_typ_NC(info);
		else if (nc == Cnd_prov_typ_nm) doCnd_prov_typ_nm_NC(info);
		else if (nc == Cnd_prsppl_cd) doCnd_prsppl_cd_NC(info);
		else if (nc == Cnd_prsppl_nm) doCnd_prsppl_nm_NC(info);
		else if (nc == Cnd_prsppl_cntry_cd) doCnd_prsppl_cntry_cd_NC(info);
		else if (nc == Cnd_prsppl_cntry_nm) doCnd_prsppl_cntry_nm_NC(info);
		else if (nc == Cnd_prsppl_area_cd) doCnd_prsppl_area_cd_NC(info);
		else if (nc == Cnd_prsppl_area_nm) doCnd_prsppl_area_nm_NC(info);
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
		else if (nc == Cnd_prsppl_grp_cd1) doCnd_prsppl_grp_cd1_NC(info);
		else if (nc == Cnd_prsppl_grp_nm1) doCnd_prsppl_grp_nm1_NC(info);
		else if (nc == Cnd_prsppl_grp_cd2) doCnd_prsppl_grp_cd2_NC(info);
		else if (nc == Cnd_prsppl_grp_nm2) doCnd_prsppl_grp_nm2_NC(info);
		else if (nc == Cnd_prsppl_grp_cd3) doCnd_prsppl_grp_cd3_NC(info);
		else if (nc == Cnd_prsppl_grp_nm3) doCnd_prsppl_grp_nm3_NC(info);
		else if (nc == Cnd_prsppl_grp_cd4) doCnd_prsppl_grp_cd4_NC(info);
		else if (nc == Cnd_prsppl_grp_nm4) doCnd_prsppl_grp_nm4_NC(info);
		else if (nc == Cnd_prsppl_grp_cd5) doCnd_prsppl_grp_cd5_NC(info);
		else if (nc == Cnd_prsppl_grp_nm5) doCnd_prsppl_grp_nm5_NC(info);
		else if (nc == Cnd_prsppl_grp_cd6) doCnd_prsppl_grp_cd6_NC(info);
		else if (nc == Cnd_prsppl_grp_nm6) doCnd_prsppl_grp_nm6_NC(info);
		else if (nc == Cnd_prsppl_grp_cd7) doCnd_prsppl_grp_cd7_NC(info);
		else if (nc == Cnd_prsppl_grp_nm7) doCnd_prsppl_grp_nm7_NC(info);
		else if (nc == Cnd_prsppl_grp_cd8) doCnd_prsppl_grp_cd8_NC(info);
		else if (nc == Cnd_prsppl_grp_nm8) doCnd_prsppl_grp_nm8_NC(info);
		else if (nc == Cnd_prsppl_grp_cd9) doCnd_prsppl_grp_cd9_NC(info);
		else if (nc == Cnd_prsppl_grp_nm9) doCnd_prsppl_grp_nm9_NC(info);
		else if (nc == Cnd_prsppl_grp_cd10) doCnd_prsppl_grp_cd10_NC(info);
		else if (nc == Cnd_prsppl_grp_nm10) doCnd_prsppl_grp_nm10_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_mng_dpt_flg) doCnd_mng_dpt_flg_NC(info);
		else if (nc == Cnd_lot_flg) doCnd_lot_flg_NC(info);
		else if (nc == Cnd_sublot_flg) doCnd_sublot_flg_NC(info);
		else if (nc == Cnd_sno1_flg) doCnd_sno1_flg_NC(info);
		else if (nc == Cnd_sno2_flg) doCnd_sno2_flg_NC(info);
		else if (nc == Cnd_sno3_flg) doCnd_sno3_flg_NC(info);
		else if (nc == Cnd_sno4_flg) doCnd_sno4_flg_NC(info);
		else if (nc == Cnd_prsppl_flg) doCnd_prsppl_flg_NC(info);
		else if (nc == Cnd_prov_flg) doCnd_prov_flg_NC(info);
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
		else if (nc == columnDispRslt_lot_no) doDispRslt_lot_no_NC(info);
		else if (nc == columnDispRslt_sublot_no) doDispRslt_sublot_no_NC(info);
		else if (nc == columnDispRslt_sno1) doDispRslt_sno1_NC(info);
		else if (nc == columnDispRslt_sno2) doDispRslt_sno2_NC(info);
		else if (nc == columnDispRslt_sno3) doDispRslt_sno3_NC(info);
		else if (nc == columnDispRslt_sno4) doDispRslt_sno4_NC(info);
		else if (nc == columnDispRslt_prsppl_cd) doDispRslt_prsppl_cd_NC(info);
		else if (nc == columnDispRslt_prsppl_nm) doDispRslt_prsppl_nm_NC(info);
		else if (nc == columnDispRslt_prov_typ) doDispRslt_prov_typ_NC(info);
		else if (nc == columnDispRslt_prov_typ_nm) doDispRslt_prov_typ_nm_NC(info);
		else if (nc == columnDispRslt_unit_cd) doDispRslt_unit_cd_NC(info);
		else if (nc == columnDispRslt_unit_nm) doDispRslt_unit_nm_NC(info);
		else if (nc == columnDispRslt_dec_place) doDispRslt_dec_place_NC(info);
		else if (nc == columnDispRslt_ttl) doDispRslt_ttl_NC(info);
		else if (nc == columnDispRslt_col_01) doDispRslt_col_01_NC(info);
		else if (nc == columnDispRslt_col_03) doDispRslt_col_03_NC(info);
		else if (nc == columnDispRslt_col_05) doDispRslt_col_05_NC(info);
		else if (nc == columnDispRslt_col_07) doDispRslt_col_07_NC(info);
		else if (nc == columnDispRslt_col_09) doDispRslt_col_09_NC(info);
		else if (nc == columnDispRslt_col_11) doDispRslt_col_11_NC(info);
		else if (nc == columnDispRslt_col_13) doDispRslt_col_13_NC(info);
		else if (nc == columnDispRslt_col_15) doDispRslt_col_15_NC(info);
		else if (nc == columnDispRslt_col_17) doDispRslt_col_17_NC(info);
		else if (nc == columnDispRslt_col_19) doDispRslt_col_19_NC(info);
		else if (nc == columnDispRslt_col_21) doDispRslt_col_21_NC(info);
		else if (nc == columnDispRslt_col_23) doDispRslt_col_23_NC(info);
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
	 * [Cnd]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[term]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_term_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[prov_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_area_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[prsppl_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm10_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[prsppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_flg_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[prsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[prsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[prov_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prov_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[prov_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prov_typ_nm_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[ttl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ttl_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_01_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_03_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_05_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_07_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_09_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_11_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_13_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_15_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_17_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_19_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_21]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_21_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_23]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_23_NC(MCEventInfo info){
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
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_term) doCnd_term_NE(info);
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
		else if (ne == Cnd_prov_typ) doCnd_prov_typ_NE(info);
		else if (ne == Cnd_prov_typ_nm) doCnd_prov_typ_nm_NE(info);
		else if (ne == Cnd_prsppl_cd) doCnd_prsppl_cd_NE(info);
		else if (ne == Cnd_prsppl_nm) doCnd_prsppl_nm_NE(info);
		else if (ne == Cnd_prsppl_cntry_cd) doCnd_prsppl_cntry_cd_NE(info);
		else if (ne == Cnd_prsppl_cntry_nm) doCnd_prsppl_cntry_nm_NE(info);
		else if (ne == Cnd_prsppl_area_cd) doCnd_prsppl_area_cd_NE(info);
		else if (ne == Cnd_prsppl_area_nm) doCnd_prsppl_area_nm_NE(info);
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
		else if (ne == Cnd_prsppl_grp_cd1) doCnd_prsppl_grp_cd1_NE(info);
		else if (ne == Cnd_prsppl_grp_nm1) doCnd_prsppl_grp_nm1_NE(info);
		else if (ne == Cnd_prsppl_grp_cd2) doCnd_prsppl_grp_cd2_NE(info);
		else if (ne == Cnd_prsppl_grp_nm2) doCnd_prsppl_grp_nm2_NE(info);
		else if (ne == Cnd_prsppl_grp_cd3) doCnd_prsppl_grp_cd3_NE(info);
		else if (ne == Cnd_prsppl_grp_nm3) doCnd_prsppl_grp_nm3_NE(info);
		else if (ne == Cnd_prsppl_grp_cd4) doCnd_prsppl_grp_cd4_NE(info);
		else if (ne == Cnd_prsppl_grp_nm4) doCnd_prsppl_grp_nm4_NE(info);
		else if (ne == Cnd_prsppl_grp_cd5) doCnd_prsppl_grp_cd5_NE(info);
		else if (ne == Cnd_prsppl_grp_nm5) doCnd_prsppl_grp_nm5_NE(info);
		else if (ne == Cnd_prsppl_grp_cd6) doCnd_prsppl_grp_cd6_NE(info);
		else if (ne == Cnd_prsppl_grp_nm6) doCnd_prsppl_grp_nm6_NE(info);
		else if (ne == Cnd_prsppl_grp_cd7) doCnd_prsppl_grp_cd7_NE(info);
		else if (ne == Cnd_prsppl_grp_nm7) doCnd_prsppl_grp_nm7_NE(info);
		else if (ne == Cnd_prsppl_grp_cd8) doCnd_prsppl_grp_cd8_NE(info);
		else if (ne == Cnd_prsppl_grp_nm8) doCnd_prsppl_grp_nm8_NE(info);
		else if (ne == Cnd_prsppl_grp_cd9) doCnd_prsppl_grp_cd9_NE(info);
		else if (ne == Cnd_prsppl_grp_nm9) doCnd_prsppl_grp_nm9_NE(info);
		else if (ne == Cnd_prsppl_grp_cd10) doCnd_prsppl_grp_cd10_NE(info);
		else if (ne == Cnd_prsppl_grp_nm10) doCnd_prsppl_grp_nm10_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_mng_dpt_flg) doCnd_mng_dpt_flg_NE(info);
		else if (ne == Cnd_lot_flg) doCnd_lot_flg_NE(info);
		else if (ne == Cnd_sublot_flg) doCnd_sublot_flg_NE(info);
		else if (ne == Cnd_sno1_flg) doCnd_sno1_flg_NE(info);
		else if (ne == Cnd_sno2_flg) doCnd_sno2_flg_NE(info);
		else if (ne == Cnd_sno3_flg) doCnd_sno3_flg_NE(info);
		else if (ne == Cnd_sno4_flg) doCnd_sno4_flg_NE(info);
		else if (ne == Cnd_prsppl_flg) doCnd_prsppl_flg_NE(info);
		else if (ne == Cnd_prov_flg) doCnd_prov_flg_NE(info);
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
		else if (ne == columnDispRslt_lot_no) doDispRslt_lot_no_NE(info);
		else if (ne == columnDispRslt_sublot_no) doDispRslt_sublot_no_NE(info);
		else if (ne == columnDispRslt_sno1) doDispRslt_sno1_NE(info);
		else if (ne == columnDispRslt_sno2) doDispRslt_sno2_NE(info);
		else if (ne == columnDispRslt_sno3) doDispRslt_sno3_NE(info);
		else if (ne == columnDispRslt_sno4) doDispRslt_sno4_NE(info);
		else if (ne == columnDispRslt_prsppl_cd) doDispRslt_prsppl_cd_NE(info);
		else if (ne == columnDispRslt_prsppl_nm) doDispRslt_prsppl_nm_NE(info);
		else if (ne == columnDispRslt_prov_typ) doDispRslt_prov_typ_NE(info);
		else if (ne == columnDispRslt_prov_typ_nm) doDispRslt_prov_typ_nm_NE(info);
		else if (ne == columnDispRslt_unit_cd) doDispRslt_unit_cd_NE(info);
		else if (ne == columnDispRslt_unit_nm) doDispRslt_unit_nm_NE(info);
		else if (ne == columnDispRslt_dec_place) doDispRslt_dec_place_NE(info);
		else if (ne == columnDispRslt_ttl) doDispRslt_ttl_NE(info);
		else if (ne == columnDispRslt_col_01) doDispRslt_col_01_NE(info);
		else if (ne == columnDispRslt_col_03) doDispRslt_col_03_NE(info);
		else if (ne == columnDispRslt_col_05) doDispRslt_col_05_NE(info);
		else if (ne == columnDispRslt_col_07) doDispRslt_col_07_NE(info);
		else if (ne == columnDispRslt_col_09) doDispRslt_col_09_NE(info);
		else if (ne == columnDispRslt_col_11) doDispRslt_col_11_NE(info);
		else if (ne == columnDispRslt_col_13) doDispRslt_col_13_NE(info);
		else if (ne == columnDispRslt_col_15) doDispRslt_col_15_NE(info);
		else if (ne == columnDispRslt_col_17) doDispRslt_col_17_NE(info);
		else if (ne == columnDispRslt_col_19) doDispRslt_col_19_NE(info);
		else if (ne == columnDispRslt_col_21) doDispRslt_col_21_NE(info);
		else if (ne == columnDispRslt_col_23) doDispRslt_col_23_NE(info);
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
	 * [Cnd]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[term]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_term_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[prov_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_area_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[prsppl_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm10_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[prsppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_flg_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[prsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[prsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[prov_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prov_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[prov_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prov_typ_nm_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[ttl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ttl_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_01_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_03_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_05_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_07_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_09_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_11_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_13_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_15_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_17_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_19_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_21]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_21_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_23]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_23_NE(MCEventInfo info){
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
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_term) doCnd_term_NX(info);
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
		else if (nx == Cnd_prov_typ) doCnd_prov_typ_NX(info);
		else if (nx == Cnd_prov_typ_nm) doCnd_prov_typ_nm_NX(info);
		else if (nx == Cnd_prsppl_cd) doCnd_prsppl_cd_NX(info);
		else if (nx == Cnd_prsppl_nm) doCnd_prsppl_nm_NX(info);
		else if (nx == Cnd_prsppl_cntry_cd) doCnd_prsppl_cntry_cd_NX(info);
		else if (nx == Cnd_prsppl_cntry_nm) doCnd_prsppl_cntry_nm_NX(info);
		else if (nx == Cnd_prsppl_area_cd) doCnd_prsppl_area_cd_NX(info);
		else if (nx == Cnd_prsppl_area_nm) doCnd_prsppl_area_nm_NX(info);
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
		else if (nx == Cnd_prsppl_grp_cd1) doCnd_prsppl_grp_cd1_NX(info);
		else if (nx == Cnd_prsppl_grp_nm1) doCnd_prsppl_grp_nm1_NX(info);
		else if (nx == Cnd_prsppl_grp_cd2) doCnd_prsppl_grp_cd2_NX(info);
		else if (nx == Cnd_prsppl_grp_nm2) doCnd_prsppl_grp_nm2_NX(info);
		else if (nx == Cnd_prsppl_grp_cd3) doCnd_prsppl_grp_cd3_NX(info);
		else if (nx == Cnd_prsppl_grp_nm3) doCnd_prsppl_grp_nm3_NX(info);
		else if (nx == Cnd_prsppl_grp_cd4) doCnd_prsppl_grp_cd4_NX(info);
		else if (nx == Cnd_prsppl_grp_nm4) doCnd_prsppl_grp_nm4_NX(info);
		else if (nx == Cnd_prsppl_grp_cd5) doCnd_prsppl_grp_cd5_NX(info);
		else if (nx == Cnd_prsppl_grp_nm5) doCnd_prsppl_grp_nm5_NX(info);
		else if (nx == Cnd_prsppl_grp_cd6) doCnd_prsppl_grp_cd6_NX(info);
		else if (nx == Cnd_prsppl_grp_nm6) doCnd_prsppl_grp_nm6_NX(info);
		else if (nx == Cnd_prsppl_grp_cd7) doCnd_prsppl_grp_cd7_NX(info);
		else if (nx == Cnd_prsppl_grp_nm7) doCnd_prsppl_grp_nm7_NX(info);
		else if (nx == Cnd_prsppl_grp_cd8) doCnd_prsppl_grp_cd8_NX(info);
		else if (nx == Cnd_prsppl_grp_nm8) doCnd_prsppl_grp_nm8_NX(info);
		else if (nx == Cnd_prsppl_grp_cd9) doCnd_prsppl_grp_cd9_NX(info);
		else if (nx == Cnd_prsppl_grp_nm9) doCnd_prsppl_grp_nm9_NX(info);
		else if (nx == Cnd_prsppl_grp_cd10) doCnd_prsppl_grp_cd10_NX(info);
		else if (nx == Cnd_prsppl_grp_nm10) doCnd_prsppl_grp_nm10_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_mng_dpt_flg) doCnd_mng_dpt_flg_NX(info);
		else if (nx == Cnd_lot_flg) doCnd_lot_flg_NX(info);
		else if (nx == Cnd_sublot_flg) doCnd_sublot_flg_NX(info);
		else if (nx == Cnd_sno1_flg) doCnd_sno1_flg_NX(info);
		else if (nx == Cnd_sno2_flg) doCnd_sno2_flg_NX(info);
		else if (nx == Cnd_sno3_flg) doCnd_sno3_flg_NX(info);
		else if (nx == Cnd_sno4_flg) doCnd_sno4_flg_NX(info);
		else if (nx == Cnd_prsppl_flg) doCnd_prsppl_flg_NX(info);
		else if (nx == Cnd_prov_flg) doCnd_prov_flg_NX(info);
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
		else if (nx == columnDispRslt_lot_no) doDispRslt_lot_no_NX(info);
		else if (nx == columnDispRslt_sublot_no) doDispRslt_sublot_no_NX(info);
		else if (nx == columnDispRslt_sno1) doDispRslt_sno1_NX(info);
		else if (nx == columnDispRslt_sno2) doDispRslt_sno2_NX(info);
		else if (nx == columnDispRslt_sno3) doDispRslt_sno3_NX(info);
		else if (nx == columnDispRslt_sno4) doDispRslt_sno4_NX(info);
		else if (nx == columnDispRslt_prsppl_cd) doDispRslt_prsppl_cd_NX(info);
		else if (nx == columnDispRslt_prsppl_nm) doDispRslt_prsppl_nm_NX(info);
		else if (nx == columnDispRslt_prov_typ) doDispRslt_prov_typ_NX(info);
		else if (nx == columnDispRslt_prov_typ_nm) doDispRslt_prov_typ_nm_NX(info);
		else if (nx == columnDispRslt_unit_cd) doDispRslt_unit_cd_NX(info);
		else if (nx == columnDispRslt_unit_nm) doDispRslt_unit_nm_NX(info);
		else if (nx == columnDispRslt_dec_place) doDispRslt_dec_place_NX(info);
		else if (nx == columnDispRslt_ttl) doDispRslt_ttl_NX(info);
		else if (nx == columnDispRslt_col_01) doDispRslt_col_01_NX(info);
		else if (nx == columnDispRslt_col_03) doDispRslt_col_03_NX(info);
		else if (nx == columnDispRslt_col_05) doDispRslt_col_05_NX(info);
		else if (nx == columnDispRslt_col_07) doDispRslt_col_07_NX(info);
		else if (nx == columnDispRslt_col_09) doDispRslt_col_09_NX(info);
		else if (nx == columnDispRslt_col_11) doDispRslt_col_11_NX(info);
		else if (nx == columnDispRslt_col_13) doDispRslt_col_13_NX(info);
		else if (nx == columnDispRslt_col_15) doDispRslt_col_15_NX(info);
		else if (nx == columnDispRslt_col_17) doDispRslt_col_17_NX(info);
		else if (nx == columnDispRslt_col_19) doDispRslt_col_19_NX(info);
		else if (nx == columnDispRslt_col_21) doDispRslt_col_21_NX(info);
		else if (nx == columnDispRslt_col_23) doDispRslt_col_23_NX(info);
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
	 * [Cnd]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[term]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_term_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[prov_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_area_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[prsppl_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm10_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[prsppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_flg_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[prsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[prsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[prov_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prov_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[prov_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prov_typ_nm_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[ttl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ttl_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_01_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_03_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_05_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_07_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_09_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_11_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_13_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_15_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_17_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_19_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_21]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_21_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_23]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_23_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_LC(info);
		else if (lc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_LC(info);
		else if (lc == Cnd_term) doCnd_term_LC(info);
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
		else if (lc == Cnd_prov_typ) doCnd_prov_typ_LC(info);
		else if (lc == Cnd_prov_typ_nm) doCnd_prov_typ_nm_LC(info);
		else if (lc == Cnd_prsppl_cd) doCnd_prsppl_cd_LC(info);
		else if (lc == Cnd_prsppl_nm) doCnd_prsppl_nm_LC(info);
		else if (lc == Cnd_prsppl_cntry_cd) doCnd_prsppl_cntry_cd_LC(info);
		else if (lc == Cnd_prsppl_cntry_nm) doCnd_prsppl_cntry_nm_LC(info);
		else if (lc == Cnd_prsppl_area_cd) doCnd_prsppl_area_cd_LC(info);
		else if (lc == Cnd_prsppl_area_nm) doCnd_prsppl_area_nm_LC(info);
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
		else if (lc == Cnd_prsppl_grp_cd1) doCnd_prsppl_grp_cd1_LC(info);
		else if (lc == Cnd_prsppl_grp_nm1) doCnd_prsppl_grp_nm1_LC(info);
		else if (lc == Cnd_prsppl_grp_cd2) doCnd_prsppl_grp_cd2_LC(info);
		else if (lc == Cnd_prsppl_grp_nm2) doCnd_prsppl_grp_nm2_LC(info);
		else if (lc == Cnd_prsppl_grp_cd3) doCnd_prsppl_grp_cd3_LC(info);
		else if (lc == Cnd_prsppl_grp_nm3) doCnd_prsppl_grp_nm3_LC(info);
		else if (lc == Cnd_prsppl_grp_cd4) doCnd_prsppl_grp_cd4_LC(info);
		else if (lc == Cnd_prsppl_grp_nm4) doCnd_prsppl_grp_nm4_LC(info);
		else if (lc == Cnd_prsppl_grp_cd5) doCnd_prsppl_grp_cd5_LC(info);
		else if (lc == Cnd_prsppl_grp_nm5) doCnd_prsppl_grp_nm5_LC(info);
		else if (lc == Cnd_prsppl_grp_cd6) doCnd_prsppl_grp_cd6_LC(info);
		else if (lc == Cnd_prsppl_grp_nm6) doCnd_prsppl_grp_nm6_LC(info);
		else if (lc == Cnd_prsppl_grp_cd7) doCnd_prsppl_grp_cd7_LC(info);
		else if (lc == Cnd_prsppl_grp_nm7) doCnd_prsppl_grp_nm7_LC(info);
		else if (lc == Cnd_prsppl_grp_cd8) doCnd_prsppl_grp_cd8_LC(info);
		else if (lc == Cnd_prsppl_grp_nm8) doCnd_prsppl_grp_nm8_LC(info);
		else if (lc == Cnd_prsppl_grp_cd9) doCnd_prsppl_grp_cd9_LC(info);
		else if (lc == Cnd_prsppl_grp_nm9) doCnd_prsppl_grp_nm9_LC(info);
		else if (lc == Cnd_prsppl_grp_cd10) doCnd_prsppl_grp_cd10_LC(info);
		else if (lc == Cnd_prsppl_grp_nm10) doCnd_prsppl_grp_nm10_LC(info);
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
		else if (lc == columnDispRslt_lot_no) doDispRslt_lot_no_LC(info);
		else if (lc == columnDispRslt_sublot_no) doDispRslt_sublot_no_LC(info);
		else if (lc == columnDispRslt_sno1) doDispRslt_sno1_LC(info);
		else if (lc == columnDispRslt_sno2) doDispRslt_sno2_LC(info);
		else if (lc == columnDispRslt_sno3) doDispRslt_sno3_LC(info);
		else if (lc == columnDispRslt_sno4) doDispRslt_sno4_LC(info);
		else if (lc == columnDispRslt_prsppl_cd) doDispRslt_prsppl_cd_LC(info);
		else if (lc == columnDispRslt_prsppl_nm) doDispRslt_prsppl_nm_LC(info);
		else if (lc == columnDispRslt_prov_typ) doDispRslt_prov_typ_LC(info);
		else if (lc == columnDispRslt_prov_typ_nm) doDispRslt_prov_typ_nm_LC(info);
		else if (lc == columnDispRslt_unit_cd) doDispRslt_unit_cd_LC(info);
		else if (lc == columnDispRslt_unit_nm) doDispRslt_unit_nm_LC(info);
		else if (lc == columnDispRslt_dec_place) doDispRslt_dec_place_LC(info);
		else if (lc == columnDispRslt_ttl) doDispRslt_ttl_LC(info);
		else if (lc == columnDispRslt_col_01) doDispRslt_col_01_LC(info);
		else if (lc == columnDispRslt_col_03) doDispRslt_col_03_LC(info);
		else if (lc == columnDispRslt_col_05) doDispRslt_col_05_LC(info);
		else if (lc == columnDispRslt_col_07) doDispRslt_col_07_LC(info);
		else if (lc == columnDispRslt_col_09) doDispRslt_col_09_LC(info);
		else if (lc == columnDispRslt_col_11) doDispRslt_col_11_LC(info);
		else if (lc == columnDispRslt_col_13) doDispRslt_col_13_LC(info);
		else if (lc == columnDispRslt_col_15) doDispRslt_col_15_LC(info);
		else if (lc == columnDispRslt_col_17) doDispRslt_col_17_LC(info);
		else if (lc == columnDispRslt_col_19) doDispRslt_col_19_LC(info);
		else if (lc == columnDispRslt_col_21) doDispRslt_col_21_LC(info);
		else if (lc == columnDispRslt_col_23) doDispRslt_col_23_LC(info);
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[term]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_term_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[prov_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_area_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[prsppl_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prsppl_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prsppl_grp_nm10_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[prsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[prsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[prov_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prov_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[prov_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_prov_typ_nm_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[ttl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ttl_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_01_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_03_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_05_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_07_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_09_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_11_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_13_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_15_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_17_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_19_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_21]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_21_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_23]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_23_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_no_p_PPanel_CalcNo_calc_no]の作成メソッド
	 */
	public MCList getCnd_calc_no_p_PPanel_CalcNo_calc_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCalcNo(row, info);
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
	 * コンボ／リストのリスト[Cnd_prov_typ]の作成メソッド
	 */
	public MCList getCnd_prov_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_cd]の作成メソッド
	 */
	public MCList getCnd_prsppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_cntry_cd]の作成メソッド
	 */
	public MCList getCnd_prsppl_cntry_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_area_cd]の作成メソッド
	 */
	public MCList getCnd_prsppl_area_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArea(row, info);
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
	 * コンボ／リストのリスト[Cnd_prsppl_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_prsppl_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_prsppl_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_prsppl_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_prsppl_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_prsppl_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_prsppl_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_prsppl_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_prsppl_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_prsppl_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prsppl_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_prsppl_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0140.Srch01")) {
			return new MG_MGBDL0140_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0140_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0140_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0140_Srch01;

		/** コンストラクタ */
		protected MG_MGBDL0140_Srch01Bridge() {
			p_MG_MGBDL0140_Srch01 = new MCParam(PDef.MG_MGBDL0140_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0140_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0140.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0140.RsltR.class));
			param.addDownBlock(mcframe.clientMGBD.MGBDP0140.HdrR.create());

			p_MG_MGBDL0140_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0140_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0140_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0140_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0140_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0140.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0140.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0140.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0140.RsltR>)down(0);
		}
		protected mcframe.clientMGBD.MGBDP0140.HdrR down1() {
			return (mcframe.clientMGBD.MGBDP0140.HdrR)down(1);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0140_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0140.RsltR.class));
			p_MG_MGBDL0140_Srch01.addDownBlock(mcframe.clientMGBD.MGBDP0140.HdrR.create());
		}
		protected MCParam param() {
			return p_MG_MGBDL0140_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0140.RsltR>)p_MG_MGBDL0140_Srch01.getContainerParam().getDownBlock(0));
			setHdrR((mcframe.clientMGBD.MGBDP0140.HdrR)p_MG_MGBDL0140_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getRsltL().clear();
			getHdrR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getHdrR());
			return result;
		}
	}
}