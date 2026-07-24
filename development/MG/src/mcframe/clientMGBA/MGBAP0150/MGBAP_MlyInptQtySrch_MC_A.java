package mcframe.clientMGBA.MGBAP0150;

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
import mcframe.clientMGBA.MGBAP0150.MGBAP_MlyInptQtySrch_MC.MG_MGBAL0150_Srch01Caller;

/**
 * 画面"MGBAP_MlyInptQtySrch"パネルクラスです。<p>
 *
 * 投入数に関して月別に計画値と実績値を参照する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBAP_MlyInptQtySrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBAP0150";

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
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_par_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_par_itm_typ;	// [Cnd]の[par_itm_typ_p.itm_typ]を[Cnd_par_itm_typ]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_typ_d_cd;	// [Cnd]の[par_itm_typ_p.itm_typ_d_cd]を[Cnd_par_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_par_itm_typ_d_nm;	// [Cnd]の[par_itm_typ_p.itm_typ_d_nm]を[Cnd_par_itm_typ_d_nm]としてエイリアス定義。
	public MCLabel Cnd_par_itm_jnl_cd_Label = null;
	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_jnl_cd = null;
	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_jnl_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_par_itm_p_PPanel;
	public MCTextField Cnd_par_itm_cd;	// [Cnd]の[par_itm_p.itm_cd]を[Cnd_par_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub1;	// [Cnd]の[par_itm_p.itm_sub1]を[Cnd_par_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub2;	// [Cnd]の[par_itm_p.itm_sub2]を[Cnd_par_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub3;	// [Cnd]の[par_itm_p.itm_sub3]を[Cnd_par_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_par_itm_nm;	// [Cnd]の[par_itm_p.itm_nm]を[Cnd_par_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_par_lot_no_Label = null;
	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_par_lot_no = null;
	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_par_sublot_no = null;
	public MCLabel Cnd_par_sno1_Label = null;
	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public MCTextField Cnd_par_sno1 = null;
	public MCLabel Cnd_par_sno2_Label = null;
	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public MCTextField Cnd_par_sno2 = null;
	public MCLabel Cnd_par_sno3_Label = null;
	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public MCTextField Cnd_par_sno3 = null;
	public MCLabel Cnd_par_sno4_Label = null;
	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public MCTextField Cnd_par_sno4 = null;
	public MCLabel Cnd_par_asst_typ_Label = null;
	/**
	 * Parent asset type 親資産区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_asst_typ = null;
	/**
	 * Parent asset type name 親資産区分名.<p>
	 *
	 */
	public MCTextField Cnd_par_asst_typ_nm = null;
	public MCLabel Cnd_inpt_dpt_cd_Label = null;
	/**
	 * Input dept. cd. 投入部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_inpt_dpt_cd = null;
	/**
	 * Input dept. name 投入部門名.<p>
	 *
	 */
	public MCTextField Cnd_inpt_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public MCLabel Cnd_itm_jnl_cd_Label = null;
	/**
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_jnl_cd = null;
	/**
	 * Child item journal name 子品目仕訳名.<p>
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
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_lot_no = null;
	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_sublot_no = null;
	public MCLabel Cnd_sno1_Label = null;
	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public MCTextField Cnd_sno1 = null;
	public MCLabel Cnd_sno2_Label = null;
	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public MCTextField Cnd_sno2 = null;
	public MCLabel Cnd_sno3_Label = null;
	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public MCTextField Cnd_sno3 = null;
	public MCLabel Cnd_sno4_Label = null;
	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public MCTextField Cnd_sno4 = null;
	public MCLabel Cnd_asst_typ_Label = null;
	/**
	 * Child asset type 子資産区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_asst_typ = null;
	/**
	 * Child asset type name 子資産区分名.<p>
	 *
	 */
	public MCTextField Cnd_asst_typ_nm = null;
	public MCLabel Cnd_site_cd_Label = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_site_nm = null;
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
	public MCLabel Cnd_str_ln_cd_Label = null;
	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_str_ln_cd = null;
	/**
	 * Line name ライン名.<p>
	 *
	 */
	public MCTextField Cnd_str_ln_nm = null;
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
	public MCLabel Cnd_stk_bp_cd_Label = null;
	/**
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_stk_bp_cd = null;
	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public MCTextField Cnd_stk_bp_nm = null;
	public MCLabel Cnd_par_itm_grp_cd1_Label = null;
	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd1 = null;
	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm1 = null;
	public MCLabel Cnd_par_itm_grp_cd2_Label = null;
	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd2 = null;
	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm2 = null;
	public MCLabel Cnd_par_itm_grp_cd3_Label = null;
	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd3 = null;
	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm3 = null;
	public MCLabel Cnd_par_itm_grp_cd4_Label = null;
	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd4 = null;
	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm4 = null;
	public MCLabel Cnd_par_itm_grp_cd5_Label = null;
	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd5 = null;
	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm5 = null;
	public MCLabel Cnd_par_itm_grp_cd6_Label = null;
	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd6 = null;
	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm6 = null;
	public MCLabel Cnd_par_itm_grp_cd7_Label = null;
	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd7 = null;
	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm7 = null;
	public MCLabel Cnd_par_itm_grp_cd8_Label = null;
	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd8 = null;
	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm8 = null;
	public MCLabel Cnd_par_itm_grp_cd9_Label = null;
	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd9 = null;
	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm9 = null;
	public MCLabel Cnd_par_itm_grp_cd10_Label = null;
	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd10 = null;
	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm10 = null;
	public MCLabel Cnd_itm_grp_cd1_Label = null;
	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd1 = null;
	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm1 = null;
	public MCLabel Cnd_itm_grp_cd2_Label = null;
	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd2 = null;
	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm2 = null;
	public MCLabel Cnd_itm_grp_cd3_Label = null;
	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd3 = null;
	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm3 = null;
	public MCLabel Cnd_itm_grp_cd4_Label = null;
	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd4 = null;
	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm4 = null;
	public MCLabel Cnd_itm_grp_cd5_Label = null;
	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd5 = null;
	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm5 = null;
	public MCLabel Cnd_itm_grp_cd6_Label = null;
	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd6 = null;
	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm6 = null;
	public MCLabel Cnd_itm_grp_cd7_Label = null;
	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd7 = null;
	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm7 = null;
	public MCLabel Cnd_itm_grp_cd8_Label = null;
	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd8 = null;
	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm8 = null;
	public MCLabel Cnd_itm_grp_cd9_Label = null;
	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd9 = null;
	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm9 = null;
	public MCLabel Cnd_itm_grp_cd10_Label = null;
	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd10 = null;
	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm10 = null;
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
	 * Parent item 親品目.<p>
	 *
	 */
	public MCCheckBox Cnd_par_itm_flg = null;
	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public MCCheckBox Cnd_par_itm_typ_flg = null;
	/**
	 * Parent item type details 親品目区分詳細.<p>
	 *
	 */
	public MCCheckBox Cnd_par_itm_typ_d_flg = null;
	/**
	 * Parent item journal 親品目仕訳.<p>
	 *
	 */
	public MCCheckBox Cnd_par_itm_jnl_flg = null;
	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_par_lot_flg = null;
	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_par_sublot_flg = null;
	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public MCCheckBox Cnd_par_sno1_flg = null;
	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public MCCheckBox Cnd_par_sno2_flg = null;
	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public MCCheckBox Cnd_par_sno3_flg = null;
	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public MCCheckBox Cnd_par_sno4_flg = null;
	/**
	 * Parent asset type 親資産区分.<p>
	 *
	 */
	public MCCheckBox Cnd_par_asst_flg = null;
	/**
	 * Input dept. 投入部門.<p>
	 *
	 */
	public MCCheckBox Cnd_inpt_dpt_flg = null;
	/**
	 * Child item 子品目.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_flg = null;
	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_typ_flg = null;
	/**
	 * Child item type details 子品目区分詳細.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_typ_d_flg = null;
	/**
	 * Child item journal 子品目仕訳.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_jnl_flg = null;
	/**
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_lot_flg = null;
	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_sublot_flg = null;
	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public MCCheckBox Cnd_sno1_flg = null;
	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public MCCheckBox Cnd_sno2_flg = null;
	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public MCCheckBox Cnd_sno3_flg = null;
	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public MCCheckBox Cnd_sno4_flg = null;
	/**
	 * Child asset type 子資産区分.<p>
	 *
	 */
	public MCCheckBox Cnd_asst_flg = null;
	/**
	 * Location 場所.<p>
	 *
	 */
	public MCCheckBox Cnd_loc_flg = null;
	/**
	 * Line ライン.<p>
	 *
	 */
	public MCCheckBox Cnd_str_ln_flg = null;
	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public MCCheckBox Cnd_site_flg = null;
	/**
	 * Operation 工程.<p>
	 *
	 */
	public MCCheckBox Cnd_oper_flg = null;
	/**
	 * Company holding inventory 在庫先.<p>
	 *
	 */
	public MCCheckBox Cnd_stk_bp_flg = null;
	/**
	 * Cost element item 費目.<p>
	 *
	 */
	public MCCheckBox Cnd_expns_flg = null;
	/**
	 * Parent item classification 1 親品目分類１.<p>
	 *
	 */
	public MCCheckBox Cnd_par_itm_grp_flg1 = null;
	/**
	 * Parent item classification 2 親品目分類２.<p>
	 *
	 */
	public MCCheckBox Cnd_par_itm_grp_flg2 = null;
	/**
	 * Parent item classification 3 親品目分類３.<p>
	 *
	 */
	public MCCheckBox Cnd_par_itm_grp_flg3 = null;
	/**
	 * Parent item classification 4 親品目分類４.<p>
	 *
	 */
	public MCCheckBox Cnd_par_itm_grp_flg4 = null;
	/**
	 * Parent item classification 5 親品目分類５.<p>
	 *
	 */
	public MCCheckBox Cnd_par_itm_grp_flg5 = null;
	/**
	 * Parent item classification 6 親品目分類６.<p>
	 *
	 */
	public MCCheckBox Cnd_par_itm_grp_flg6 = null;
	/**
	 * Parent item classification 7 親品目分類７.<p>
	 *
	 */
	public MCCheckBox Cnd_par_itm_grp_flg7 = null;
	/**
	 * Parent item classification 8 親品目分類８.<p>
	 *
	 */
	public MCCheckBox Cnd_par_itm_grp_flg8 = null;
	/**
	 * Parent item classification 9 親品目分類９.<p>
	 *
	 */
	public MCCheckBox Cnd_par_itm_grp_flg9 = null;
	/**
	 * Parent item classification 10 親品目分類１０.<p>
	 *
	 */
	public MCCheckBox Cnd_par_itm_grp_flg10 = null;
	/**
	 * Child item classification 1 子品目分類１.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg1 = null;
	/**
	 * Child item classification 2 子品目分類２.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg2 = null;
	/**
	 * Child item classification 3 子品目分類３.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg3 = null;
	/**
	 * Child item classification 4 子品目分類４.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg4 = null;
	/**
	 * Child item classification 5 子品目分類５.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg5 = null;
	/**
	 * Child item classification 6 子品目分類６.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg6 = null;
	/**
	 * Child item classification 7 子品目分類７.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg7 = null;
	/**
	 * Child item classification 8 子品目分類８.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg8 = null;
	/**
	 * Child item classification 9 子品目分類９.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg9 = null;
	/**
	 * Child item classification 10 子品目分類１０.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_grp_flg10 = null;
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
	public MCTable2<mcframe.clientMGBA.MGBAP0150.DispRsltR> DispRsltTable = null;
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
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D DispRslt_par_itm_p_PPanel;
	public MCColumnConfig columnDispRslt_par_itm_cd;// [DispRslt]の[par_itm_p.itm_cd]を[columnDispRslt_par_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_par_itm_sub1;// [DispRslt]の[par_itm_p.itm_sub1]を[columnDispRslt_par_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_par_itm_sub2;// [DispRslt]の[par_itm_p.itm_sub2]を[columnDispRslt_par_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_par_itm_sub3;// [DispRslt]の[par_itm_p.itm_sub3]を[columnDispRslt_par_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_par_itm_nm;// [DispRslt]の[par_itm_p.itm_nm]を[columnDispRslt_par_itm_nm]としてエイリアス定義。
	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_typ = null;
	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_typ_nm = null;
	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_typ_d_cd = null;
	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_typ_d_nm = null;
	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_jnl_cd = null;
	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_jnl_nm = null;
	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_cd1 = null;
	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_nm1 = null;
	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_cd2 = null;
	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_nm2 = null;
	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_cd3 = null;
	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_nm3 = null;
	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_cd4 = null;
	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_nm4 = null;
	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_cd5 = null;
	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_nm5 = null;
	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_cd6 = null;
	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_nm6 = null;
	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_cd7 = null;
	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_nm7 = null;
	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_cd8 = null;
	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_nm8 = null;
	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_cd9 = null;
	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_nm9 = null;
	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_cd10 = null;
	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_itm_grp_nm10 = null;
	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_lot_no = null;
	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_sublot_no = null;
	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_sno1 = null;
	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_sno2 = null;
	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_sno3 = null;
	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_sno4 = null;
	/**
	 * Parent asset type 親資産区分.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_asst_typ = null;
	/**
	 * Parent asset type name 親資産区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_par_asst_typ_nm = null;
	/**
	 * Input dept. cd. 投入部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_inpt_dpt_cd = null;
	/**
	 * Input dept. name 投入部門名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_inpt_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D DispRslt_itm_p_PPanel;
	public MCColumnConfig columnDispRslt_itm_cd;// [DispRslt]の[itm_p.itm_cd]を[columnDispRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_itm_sub1;// [DispRslt]の[itm_p.itm_sub1]を[columnDispRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_itm_sub2;// [DispRslt]の[itm_p.itm_sub2]を[columnDispRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_itm_sub3;// [DispRslt]の[itm_p.itm_sub3]を[columnDispRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDispRslt_itm_nm;// [DispRslt]の[itm_p.itm_nm]を[columnDispRslt_itm_nm]としてエイリアス定義。
	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_typ = null;
	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_typ_nm = null;
	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_typ_d_cd = null;
	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_typ_d_nm = null;
	/**
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_jnl_cd = null;
	/**
	 * Child item journal name 子品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_jnl_nm = null;
	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd1 = null;
	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm1 = null;
	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd2 = null;
	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm2 = null;
	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd3 = null;
	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm3 = null;
	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd4 = null;
	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm4 = null;
	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd5 = null;
	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm5 = null;
	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd6 = null;
	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm6 = null;
	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd7 = null;
	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm7 = null;
	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd8 = null;
	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm8 = null;
	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd9 = null;
	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm9 = null;
	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_cd10 = null;
	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_grp_nm10 = null;
	/**
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_lot_no = null;
	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sublot_no = null;
	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sno1 = null;
	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sno2 = null;
	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sno3 = null;
	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_sno4 = null;
	/**
	 * Child asset type 子資産区分.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_asst_typ = null;
	/**
	 * Child asset type name 子資産区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_asst_typ_nm = null;
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
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_str_ln_cd = null;
	/**
	 * Line name ライン名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_str_ln_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_site_nm = null;
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
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_stk_bp_cd = null;
	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_stk_bp_nm = null;
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_expns_cd = null;
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_expns_nm = null;
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
	
	/** [MG_MGBAL0150_Srch01]のCallerの作成 */
	protected MGBAP_MlyInptQtySrch_MC.MG_MGBAL0150_Srch01Caller createMG_MGBAL0150_Srch01() {
		MGBAP_MlyInptQtySrch_MC.MG_MGBAL0150_Srch01Caller<MGBAP_MlyInptQtySrch, MG_MGBAL0150_Srch01Bridge>
		caller = ((MGBAP_MlyInptQtySrch_MC)this).new MG_MGBAL0150_Srch01Caller<MGBAP_MlyInptQtySrch, MG_MGBAL0150_Srch01Bridge>(
					(MGBAP_MlyInptQtySrch)this, new MG_MGBAL0150_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBAL0150_Srch01]の呼び出し */
	protected void callMG_MGBAL0150_Srch01() {
		MCCaller caller = createMG_MGBAL0150_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBA.MGBAP0150.CndR aCndR;
	/** [DispRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBA.MGBAP0150.DispRsltR> aDispRsltL;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBA.MGBAP0150.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBA.MGBAP0150.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBA.MGBAP0150.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBA.MGBAP0150.CndR createCndR() {
		return mcframe.clientMGBA.MGBAP0150.CndR.create();
	}

	/**
	 * コピーによってaDispRsltLを設定します。
	 *
	 * aDispRsltLのインスタンスは変更されません。
	 *
	 * @param dataset DispRsltL
	 */
	public void setDispRsltL(MCList<mcframe.clientMGBA.MGBAP0150.DispRsltR> aList) {
		if (getDispRsltL() != aList) {
			getDispRsltL().setAll(aList);
		}
	}

	/**
	 * [DispRslt]ブロックのコンテナaDispRsltLを返します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBA.MGBAP0150.DispRsltR> getDispRsltL() {
		return aDispRsltL;
	}

	/**
	 * aDispRsltRを作成します。
	 *
	 * @return DispRsltR
	 */
	public mcframe.clientMGBA.MGBAP0150.DispRsltR createDispRsltR() {
		return mcframe.clientMGBA.MGBAP0150.DispRsltR.create();
	}

	/**
	 * aDispRsltLを作成します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBA.MGBAP0150.DispRsltR> createDispRsltL() {
		return MCList.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.class);
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
	public void setRsltL(MCList<mcframe.clientMGBA.MGBAP0150.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBA.MGBAP0150.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBA.MGBAP0150.RsltR createRsltR() {
		return mcframe.clientMGBA.MGBAP0150.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBA.MGBAP0150.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBA.MGBAP0150.RsltR.class);
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
	public MGBAP_MlyInptQtySrch_MC_A() {
		aCndR = createCndR();
		aDispRsltL = createDispRsltL();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBAP_MlyInptQtySrch_MC_A(String name) {
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
		MGBAP_MlyInptQtySrch_MC.jbCreateTop((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbCreateFold((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbCreateTab1((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbCreateTab2((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbCreateTab3((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbCreateTab4((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbCreateCnd((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbCreateCnd2((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbCreateCnd3((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbCreateTtl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbCreateLPnl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbCreateCtrl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbCreateDispRslt((MGBAP_MlyInptQtySrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBAP_MlyInptQtySrch p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term = p.Cnd_term_p_PPanel.Term_term;
		p.Cnd_term.addAliasName("Cnd.term", p);
		p.Cnd_par_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().par_itm_typ_p());
		p.Cnd_par_itm_typ_p_PPanel.setName("Cnd.par_itm_typ_p");
		p.Cnd_par_itm_typ = p.Cnd_par_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_par_itm_typ.addAliasName("Cnd.par_itm_typ", p);
		p.Cnd_par_itm_typ_d_cd = p.Cnd_par_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_par_itm_typ_d_cd.addAliasName("Cnd.par_itm_typ_d_cd", p);
		p.Cnd_par_itm_typ_d_nm = p.Cnd_par_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Cnd_par_itm_typ_d_nm.addAliasName("Cnd.par_itm_typ_d_nm", p);
		p.Cnd_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().par_itm_p());
		p.Cnd_par_itm_p_PPanel.setName("Cnd.par_itm_p");
		p.Cnd_par_itm_cd = p.Cnd_par_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_par_itm_cd.addAliasName("Cnd.par_itm_cd", p);
		p.Cnd_par_itm_sub1 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_par_itm_sub1.addAliasName("Cnd.par_itm_sub1", p);
		p.Cnd_par_itm_sub2 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_par_itm_sub2.addAliasName("Cnd.par_itm_sub2", p);
		p.Cnd_par_itm_sub3 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_par_itm_sub3.addAliasName("Cnd.par_itm_sub3", p);
		p.Cnd_par_itm_nm = p.Cnd_par_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_par_itm_nm.addAliasName("Cnd.par_itm_nm", p);
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
	protected static void jbCreateCnd2(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 * [Ttl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTtl(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBAP_MlyInptQtySrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispRslt(MGBAP_MlyInptQtySrch p) {
		p.DispRslt_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.$par_itm_p);
		p.DispRslt_par_itm_p_PPanel.setName("DispRslt.par_itm_p");
		p.columnDispRslt_par_itm_cd = p.DispRslt_par_itm_p_PPanel.columnItm_itm_cd;
		p.columnDispRslt_par_itm_cd.addAliasName("DispRslt.par_itm_cd", p);
		p.columnDispRslt_par_itm_sub1 = p.DispRslt_par_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDispRslt_par_itm_sub1.addAliasName("DispRslt.par_itm_sub1", p);
		p.columnDispRslt_par_itm_sub2 = p.DispRslt_par_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDispRslt_par_itm_sub2.addAliasName("DispRslt.par_itm_sub2", p);
		p.columnDispRslt_par_itm_sub3 = p.DispRslt_par_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDispRslt_par_itm_sub3.addAliasName("DispRslt.par_itm_sub3", p);
		p.columnDispRslt_par_itm_nm = p.DispRslt_par_itm_p_PPanel.columnItm_itm_nm;
		p.columnDispRslt_par_itm_nm.addAliasName("DispRslt.par_itm_nm", p);
		p.DispRslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.$itm_p);
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
		p.DispRslt_qty_00_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.$qty_00_p);
		p.DispRslt_qty_00_p_PPanel.setName("DispRslt.qty_00_p");
		p.columnDispRslt_col_00 = p.DispRslt_qty_00_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_00.addAliasName("DispRslt.col_00", p);
		p.DispRslt_qty_01_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.$qty_01_p);
		p.DispRslt_qty_01_p_PPanel.setName("DispRslt.qty_01_p");
		p.columnDispRslt_col_01 = p.DispRslt_qty_01_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_01.addAliasName("DispRslt.col_01", p);
		p.DispRslt_qty_02_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.$qty_02_p);
		p.DispRslt_qty_02_p_PPanel.setName("DispRslt.qty_02_p");
		p.columnDispRslt_col_02 = p.DispRslt_qty_02_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_02.addAliasName("DispRslt.col_02", p);
		p.DispRslt_qty_03_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.$qty_03_p);
		p.DispRslt_qty_03_p_PPanel.setName("DispRslt.qty_03_p");
		p.columnDispRslt_col_03 = p.DispRslt_qty_03_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_03.addAliasName("DispRslt.col_03", p);
		p.DispRslt_qty_04_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.$qty_04_p);
		p.DispRslt_qty_04_p_PPanel.setName("DispRslt.qty_04_p");
		p.columnDispRslt_col_04 = p.DispRslt_qty_04_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_04.addAliasName("DispRslt.col_04", p);
		p.DispRslt_qty_05_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.$qty_05_p);
		p.DispRslt_qty_05_p_PPanel.setName("DispRslt.qty_05_p");
		p.columnDispRslt_col_05 = p.DispRslt_qty_05_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_05.addAliasName("DispRslt.col_05", p);
		p.DispRslt_qty_06_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.$qty_06_p);
		p.DispRslt_qty_06_p_PPanel.setName("DispRslt.qty_06_p");
		p.columnDispRslt_col_06 = p.DispRslt_qty_06_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_06.addAliasName("DispRslt.col_06", p);
		p.DispRslt_qty_07_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.$qty_07_p);
		p.DispRslt_qty_07_p_PPanel.setName("DispRslt.qty_07_p");
		p.columnDispRslt_col_07 = p.DispRslt_qty_07_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_07.addAliasName("DispRslt.col_07", p);
		p.DispRslt_qty_08_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.$qty_08_p);
		p.DispRslt_qty_08_p_PPanel.setName("DispRslt.qty_08_p");
		p.columnDispRslt_col_08 = p.DispRslt_qty_08_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_08.addAliasName("DispRslt.col_08", p);
		p.DispRslt_qty_09_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.$qty_09_p);
		p.DispRslt_qty_09_p_PPanel.setName("DispRslt.qty_09_p");
		p.columnDispRslt_col_09 = p.DispRslt_qty_09_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_09.addAliasName("DispRslt.col_09", p);
		p.DispRslt_qty_10_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.$qty_10_p);
		p.DispRslt_qty_10_p_PPanel.setName("DispRslt.qty_10_p");
		p.columnDispRslt_col_10 = p.DispRslt_qty_10_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_10.addAliasName("DispRslt.col_10", p);
		p.DispRslt_qty_11_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.$qty_11_p);
		p.DispRslt_qty_11_p_PPanel.setName("DispRslt.qty_11_p");
		p.columnDispRslt_col_11 = p.DispRslt_qty_11_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_11.addAliasName("DispRslt.col_11", p);
		p.DispRslt_ttl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBA.MGBAP0150.DispRsltR.$ttl_qty_p);
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
	
	
	/** [Cnd_par_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_jnl_cd_p = null;

	/**
	 * [Cnd_par_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_jnl_cd_ListPutter() {
		if (Cnd_par_itm_jnl_cd_p == null) {
			Cnd_par_itm_jnl_cd_p = createCnd_par_itm_jnl_cd_ListPutter(Cnd_par_itm_jnl_cd, "par_itm_jnl_cd", "par_itm_jnl_nm");

		}
		return Cnd_par_itm_jnl_cd_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_cd_p = createCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_cd, "par_itm_cd", "par_itm_nm","par_itm_sub1","par_itm_sub2","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub1_p = createCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub1, "par_itm_sub1", "par_itm_nm","par_itm_sub2","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub2_p = createCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub2, "par_itm_sub2", "par_itm_nm","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub3_p = createCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub3, "par_itm_sub3", "par_itm_nm");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_par_asst_typ_ListPutter]の定義 */
	private MCListPutter Cnd_par_asst_typ_p = null;

	/**
	 * [Cnd_par_asst_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_asst_typ_ListPutter() {
		if (Cnd_par_asst_typ_p == null) {
			Cnd_par_asst_typ_p = createCnd_par_asst_typ_ListPutter(Cnd_par_asst_typ, "par_asst_typ", "par_asst_typ_nm");

		}
		return Cnd_par_asst_typ_p;
	}
	
	
	/** [Cnd_inpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_inpt_dpt_cd_p = null;

	/**
	 * [Cnd_inpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_inpt_dpt_cd_ListPutter() {
		if (Cnd_inpt_dpt_cd_p == null) {
			Cnd_inpt_dpt_cd_p = createCnd_inpt_dpt_cd_ListPutter(Cnd_inpt_dpt_cd, "inpt_dpt_cd", "inpt_dpt_nm");

		}
		return Cnd_inpt_dpt_cd_p;
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
	
	
	/** [Cnd_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_site_cd_p = null;

	/**
	 * [Cnd_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_site_cd_ListPutter() {
		if (Cnd_site_cd_p == null) {
			Cnd_site_cd_p = createCnd_site_cd_ListPutter(Cnd_site_cd, "site_cd", "site_nm");

		}
		return Cnd_site_cd_p;
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
	
	
	/** [Cnd_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_str_ln_cd_p = null;

	/**
	 * [Cnd_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_str_ln_cd_ListPutter() {
		if (Cnd_str_ln_cd_p == null) {
			Cnd_str_ln_cd_p = createCnd_str_ln_cd_ListPutter(Cnd_str_ln_cd, "str_ln_cd", "str_ln_nm");

		}
		return Cnd_str_ln_cd_p;
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
	
	
	/** [Cnd_stk_bp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_stk_bp_cd_p = null;

	/**
	 * [Cnd_stk_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_stk_bp_cd_ListPutter() {
		if (Cnd_stk_bp_cd_p == null) {
			Cnd_stk_bp_cd_p = createCnd_stk_bp_cd_ListPutter(Cnd_stk_bp_cd, "stk_bp_cd", "stk_bp_nm");

		}
		return Cnd_stk_bp_cd_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd1_p = null;

	/**
	 * [Cnd_par_itm_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd1_ListPutter() {
		if (Cnd_par_itm_grp_cd1_p == null) {
			Cnd_par_itm_grp_cd1_p = createCnd_par_itm_grp_cd1_ListPutter(Cnd_par_itm_grp_cd1, "par_itm_grp_cd1", "par_itm_grp_nm1");

		}
		return Cnd_par_itm_grp_cd1_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd2_p = null;

	/**
	 * [Cnd_par_itm_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd2_ListPutter() {
		if (Cnd_par_itm_grp_cd2_p == null) {
			Cnd_par_itm_grp_cd2_p = createCnd_par_itm_grp_cd2_ListPutter(Cnd_par_itm_grp_cd2, "par_itm_grp_cd2", "par_itm_grp_nm2");

		}
		return Cnd_par_itm_grp_cd2_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd3_p = null;

	/**
	 * [Cnd_par_itm_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd3_ListPutter() {
		if (Cnd_par_itm_grp_cd3_p == null) {
			Cnd_par_itm_grp_cd3_p = createCnd_par_itm_grp_cd3_ListPutter(Cnd_par_itm_grp_cd3, "par_itm_grp_cd3", "par_itm_grp_nm3");

		}
		return Cnd_par_itm_grp_cd3_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd4_p = null;

	/**
	 * [Cnd_par_itm_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd4_ListPutter() {
		if (Cnd_par_itm_grp_cd4_p == null) {
			Cnd_par_itm_grp_cd4_p = createCnd_par_itm_grp_cd4_ListPutter(Cnd_par_itm_grp_cd4, "par_itm_grp_cd4", "par_itm_grp_nm4");

		}
		return Cnd_par_itm_grp_cd4_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd5_p = null;

	/**
	 * [Cnd_par_itm_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd5_ListPutter() {
		if (Cnd_par_itm_grp_cd5_p == null) {
			Cnd_par_itm_grp_cd5_p = createCnd_par_itm_grp_cd5_ListPutter(Cnd_par_itm_grp_cd5, "par_itm_grp_cd5", "par_itm_grp_nm5");

		}
		return Cnd_par_itm_grp_cd5_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd6_p = null;

	/**
	 * [Cnd_par_itm_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd6_ListPutter() {
		if (Cnd_par_itm_grp_cd6_p == null) {
			Cnd_par_itm_grp_cd6_p = createCnd_par_itm_grp_cd6_ListPutter(Cnd_par_itm_grp_cd6, "par_itm_grp_cd6", "par_itm_grp_nm6");

		}
		return Cnd_par_itm_grp_cd6_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd7_p = null;

	/**
	 * [Cnd_par_itm_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd7_ListPutter() {
		if (Cnd_par_itm_grp_cd7_p == null) {
			Cnd_par_itm_grp_cd7_p = createCnd_par_itm_grp_cd7_ListPutter(Cnd_par_itm_grp_cd7, "par_itm_grp_cd7", "par_itm_grp_nm7");

		}
		return Cnd_par_itm_grp_cd7_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd8_p = null;

	/**
	 * [Cnd_par_itm_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd8_ListPutter() {
		if (Cnd_par_itm_grp_cd8_p == null) {
			Cnd_par_itm_grp_cd8_p = createCnd_par_itm_grp_cd8_ListPutter(Cnd_par_itm_grp_cd8, "par_itm_grp_cd8", "par_itm_grp_nm8");

		}
		return Cnd_par_itm_grp_cd8_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd9_p = null;

	/**
	 * [Cnd_par_itm_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd9_ListPutter() {
		if (Cnd_par_itm_grp_cd9_p == null) {
			Cnd_par_itm_grp_cd9_p = createCnd_par_itm_grp_cd9_ListPutter(Cnd_par_itm_grp_cd9, "par_itm_grp_cd9", "par_itm_grp_nm9");

		}
		return Cnd_par_itm_grp_cd9_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd10_p = null;

	/**
	 * [Cnd_par_itm_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd10_ListPutter() {
		if (Cnd_par_itm_grp_cd10_p == null) {
			Cnd_par_itm_grp_cd10_p = createCnd_par_itm_grp_cd10_ListPutter(Cnd_par_itm_grp_cd10, "par_itm_grp_cd10", "par_itm_grp_nm10");

		}
		return Cnd_par_itm_grp_cd10_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBAP_MlyInptQtySrch create(){
		MGBAP_MlyInptQtySrch p = new MGBAP_MlyInptQtySrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBAP_MlyInptQtySrch create(String name){
		MGBAP_MlyInptQtySrch p = new MGBAP_MlyInptQtySrch(name);
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
		MGBAP_MlyInptQtySrch_MC.jbfInitTop((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbfInitFold((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbfInitTab1((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbfInitTab2((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbfInitTab3((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbfInitTab4((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbfInitCnd((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbfInitCnd2((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbfInitCnd3((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbfInitTtl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbfInitLPnl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbfInitCtrl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbfInitDispRslt((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbInitTop((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbInitFold((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbInitTab1((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbInitTab2((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbInitTab3((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbInitTab4((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbInitCnd((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbInitCnd2((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbInitCnd3((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbInitTtl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbInitLPnl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbInitCtrl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.jbInitDispRslt((MGBAP_MlyInptQtySrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBAP_MlyInptQtySrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBAP_MlyInptQtySrch p) {
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
	protected static void jbfInitTab1(MGBAP_MlyInptQtySrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBAP_MlyInptQtySrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MGBAP_MlyInptQtySrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MGBAP_MlyInptQtySrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBAP_MlyInptQtySrch p) {
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
		p.Cnd_par_itm_jnl_cd_Label = p.beansFactory.createLabel("Cnd.par_itm_jnl_cd_Label");
		p.Cnd_par_itm_jnl_cd = p.beansFactory.createTextComboBox("Cnd.par_itm_jnl_cd");
		p.Cnd_par_itm_jnl_cd.setLabel(p.Cnd_par_itm_jnl_cd_Label);
		p.Cnd_par_itm_jnl_nm = p.beansFactory.createTextField("Cnd.par_itm_jnl_nm");
		p.Cnd_par_lot_no_Label = p.beansFactory.createLabel("Cnd.par_lot_no_Label");
		p.Cnd_par_lot_no = p.beansFactory.createTextField("Cnd.par_lot_no");
		p.Cnd_par_lot_no.setLabel(p.Cnd_par_lot_no_Label);
		p.Cnd_par_sublot_no = p.beansFactory.createTextField("Cnd.par_sublot_no");
		p.Cnd_par_sno1_Label = p.beansFactory.createLabel("Cnd.par_sno1_Label");
		p.Cnd_par_sno1 = p.beansFactory.createTextField("Cnd.par_sno1");
		p.Cnd_par_sno1.setLabel(p.Cnd_par_sno1_Label);
		p.Cnd_par_sno2_Label = p.beansFactory.createLabel("Cnd.par_sno2_Label");
		p.Cnd_par_sno2 = p.beansFactory.createTextField("Cnd.par_sno2");
		p.Cnd_par_sno2.setLabel(p.Cnd_par_sno2_Label);
		p.Cnd_par_sno3_Label = p.beansFactory.createLabel("Cnd.par_sno3_Label");
		p.Cnd_par_sno3 = p.beansFactory.createTextField("Cnd.par_sno3");
		p.Cnd_par_sno3.setLabel(p.Cnd_par_sno3_Label);
		p.Cnd_par_sno4_Label = p.beansFactory.createLabel("Cnd.par_sno4_Label");
		p.Cnd_par_sno4 = p.beansFactory.createTextField("Cnd.par_sno4");
		p.Cnd_par_sno4.setLabel(p.Cnd_par_sno4_Label);
		p.Cnd_par_asst_typ_Label = p.beansFactory.createLabel("Cnd.par_asst_typ_Label");
		p.Cnd_par_asst_typ = p.beansFactory.createTextComboBox("Cnd.par_asst_typ");
		p.Cnd_par_asst_typ.setLabel(p.Cnd_par_asst_typ_Label);
		p.Cnd_par_asst_typ_nm = p.beansFactory.createTextField("Cnd.par_asst_typ_nm");
		p.Cnd_inpt_dpt_cd_Label = p.beansFactory.createLabel("Cnd.inpt_dpt_cd_Label");
		p.Cnd_inpt_dpt_cd = p.beansFactory.createTextComboBox("Cnd.inpt_dpt_cd");
		p.Cnd_inpt_dpt_cd.setLabel(p.Cnd_inpt_dpt_cd_Label);
		p.Cnd_inpt_dpt_nm = p.beansFactory.createTextField("Cnd.inpt_dpt_nm");
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
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.str_ln_cd_Label");
		p.Cnd_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.str_ln_cd");
		p.Cnd_str_ln_cd.setLabel(p.Cnd_str_ln_cd_Label);
		p.Cnd_str_ln_nm = p.beansFactory.createTextField("Cnd.str_ln_nm");
		p.Cnd_oper_cd_Label = p.beansFactory.createLabel("Cnd.oper_cd_Label");
		p.Cnd_oper_cd = p.beansFactory.createTextComboBox("Cnd.oper_cd");
		p.Cnd_oper_cd.setLabel(p.Cnd_oper_cd_Label);
		p.Cnd_oper_nm = p.beansFactory.createTextField("Cnd.oper_nm");
		p.Cnd_stk_bp_cd_Label = p.beansFactory.createLabel("Cnd.stk_bp_cd_Label");
		p.Cnd_stk_bp_cd = p.beansFactory.createTextField("Cnd.stk_bp_cd");
		p.Cnd_stk_bp_cd.setLabel(p.Cnd_stk_bp_cd_Label);
		p.Cnd_stk_bp_nm = p.beansFactory.createTextField("Cnd.stk_bp_nm");
		p.Cnd_par_itm_grp_cd1_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd1_Label");
		p.Cnd_par_itm_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd1");
		p.Cnd_par_itm_grp_cd1.setLabel(p.Cnd_par_itm_grp_cd1_Label);
		p.Cnd_par_itm_grp_nm1 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm1");
		p.Cnd_par_itm_grp_cd2_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd2_Label");
		p.Cnd_par_itm_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd2");
		p.Cnd_par_itm_grp_cd2.setLabel(p.Cnd_par_itm_grp_cd2_Label);
		p.Cnd_par_itm_grp_nm2 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm2");
		p.Cnd_par_itm_grp_cd3_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd3_Label");
		p.Cnd_par_itm_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd3");
		p.Cnd_par_itm_grp_cd3.setLabel(p.Cnd_par_itm_grp_cd3_Label);
		p.Cnd_par_itm_grp_nm3 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm3");
		p.Cnd_par_itm_grp_cd4_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd4_Label");
		p.Cnd_par_itm_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd4");
		p.Cnd_par_itm_grp_cd4.setLabel(p.Cnd_par_itm_grp_cd4_Label);
		p.Cnd_par_itm_grp_nm4 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm4");
		p.Cnd_par_itm_grp_cd5_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd5_Label");
		p.Cnd_par_itm_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd5");
		p.Cnd_par_itm_grp_cd5.setLabel(p.Cnd_par_itm_grp_cd5_Label);
		p.Cnd_par_itm_grp_nm5 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm5");
		p.Cnd_par_itm_grp_cd6_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd6_Label");
		p.Cnd_par_itm_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd6");
		p.Cnd_par_itm_grp_cd6.setLabel(p.Cnd_par_itm_grp_cd6_Label);
		p.Cnd_par_itm_grp_nm6 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm6");
		p.Cnd_par_itm_grp_cd7_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd7_Label");
		p.Cnd_par_itm_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd7");
		p.Cnd_par_itm_grp_cd7.setLabel(p.Cnd_par_itm_grp_cd7_Label);
		p.Cnd_par_itm_grp_nm7 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm7");
		p.Cnd_par_itm_grp_cd8_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd8_Label");
		p.Cnd_par_itm_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd8");
		p.Cnd_par_itm_grp_cd8.setLabel(p.Cnd_par_itm_grp_cd8_Label);
		p.Cnd_par_itm_grp_nm8 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm8");
		p.Cnd_par_itm_grp_cd9_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd9_Label");
		p.Cnd_par_itm_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd9");
		p.Cnd_par_itm_grp_cd9.setLabel(p.Cnd_par_itm_grp_cd9_Label);
		p.Cnd_par_itm_grp_nm9 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm9");
		p.Cnd_par_itm_grp_cd10_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd10_Label");
		p.Cnd_par_itm_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd10");
		p.Cnd_par_itm_grp_cd10.setLabel(p.Cnd_par_itm_grp_cd10_Label);
		p.Cnd_par_itm_grp_nm10 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm10");
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
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_mng_dpt_flg = p.beansFactory.createCheckBox("Cnd.mng_dpt_flg");
		p.Cnd_par_itm_flg = p.beansFactory.createCheckBox("Cnd.par_itm_flg");
		p.Cnd_par_itm_typ_flg = p.beansFactory.createCheckBox("Cnd.par_itm_typ_flg");
		p.Cnd_par_itm_typ_d_flg = p.beansFactory.createCheckBox("Cnd.par_itm_typ_d_flg");
		p.Cnd_par_itm_jnl_flg = p.beansFactory.createCheckBox("Cnd.par_itm_jnl_flg");
		p.Cnd_par_lot_flg = p.beansFactory.createCheckBox("Cnd.par_lot_flg");
		p.Cnd_par_sublot_flg = p.beansFactory.createCheckBox("Cnd.par_sublot_flg");
		p.Cnd_par_sno1_flg = p.beansFactory.createCheckBox("Cnd.par_sno1_flg");
		p.Cnd_par_sno2_flg = p.beansFactory.createCheckBox("Cnd.par_sno2_flg");
		p.Cnd_par_sno3_flg = p.beansFactory.createCheckBox("Cnd.par_sno3_flg");
		p.Cnd_par_sno4_flg = p.beansFactory.createCheckBox("Cnd.par_sno4_flg");
		p.Cnd_par_asst_flg = p.beansFactory.createCheckBox("Cnd.par_asst_flg");
		p.Cnd_inpt_dpt_flg = p.beansFactory.createCheckBox("Cnd.inpt_dpt_flg");
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
		p.Cnd_asst_flg = p.beansFactory.createCheckBox("Cnd.asst_flg");
		p.Cnd_loc_flg = p.beansFactory.createCheckBox("Cnd.loc_flg");
		p.Cnd_str_ln_flg = p.beansFactory.createCheckBox("Cnd.str_ln_flg");
		p.Cnd_site_flg = p.beansFactory.createCheckBox("Cnd.site_flg");
		p.Cnd_oper_flg = p.beansFactory.createCheckBox("Cnd.oper_flg");
		p.Cnd_stk_bp_flg = p.beansFactory.createCheckBox("Cnd.stk_bp_flg");
		p.Cnd_expns_flg = p.beansFactory.createCheckBox("Cnd.expns_flg");
		p.Cnd_par_itm_grp_flg1 = p.beansFactory.createCheckBox("Cnd.par_itm_grp_flg1");
		p.Cnd_par_itm_grp_flg2 = p.beansFactory.createCheckBox("Cnd.par_itm_grp_flg2");
		p.Cnd_par_itm_grp_flg3 = p.beansFactory.createCheckBox("Cnd.par_itm_grp_flg3");
		p.Cnd_par_itm_grp_flg4 = p.beansFactory.createCheckBox("Cnd.par_itm_grp_flg4");
		p.Cnd_par_itm_grp_flg5 = p.beansFactory.createCheckBox("Cnd.par_itm_grp_flg5");
		p.Cnd_par_itm_grp_flg6 = p.beansFactory.createCheckBox("Cnd.par_itm_grp_flg6");
		p.Cnd_par_itm_grp_flg7 = p.beansFactory.createCheckBox("Cnd.par_itm_grp_flg7");
		p.Cnd_par_itm_grp_flg8 = p.beansFactory.createCheckBox("Cnd.par_itm_grp_flg8");
		p.Cnd_par_itm_grp_flg9 = p.beansFactory.createCheckBox("Cnd.par_itm_grp_flg9");
		p.Cnd_par_itm_grp_flg10 = p.beansFactory.createCheckBox("Cnd.par_itm_grp_flg10");
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
		p.Cnd_select_all = p.beansFactory.createButton("Cnd.select_all", "no_border");
		p.Cnd_deselect_all = p.beansFactory.createButton("Cnd.deselect_all", "no_border");
		p.Cnd_disp_key = p.beansFactory.createCheckBox("Cnd.disp_key");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBAP_MlyInptQtySrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MGBAP_MlyInptQtySrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTtl(MGBAP_MlyInptQtySrch p) {
		// ブロック関連の初期化
		p.TtlPanel = p.beansFactory.createPanel("Ttl");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MGBAP_MlyInptQtySrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBAP_MlyInptQtySrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispRslt(MGBAP_MlyInptQtySrch p) {
		// ブロック関連の初期化
		p.DispRsltPanel = p.beansFactory.createPanel("DispRslt");
		p.DispRsltScrollPane = p.beansFactory.createScrollPane("DispRslt.scroll");
		p.createDispRsltTable();
		// ブロックの項目の初期化
		p.columnDispRslt_wg_cd = p.beansFactory.createTableColumn("DispRslt.wg_cd", MCColumnType.TEXT);
		p.columnDispRslt_wg_nm = p.beansFactory.createTableColumn("DispRslt.wg_nm", MCColumnType.TEXT);
		p.columnDispRslt_mng_dpt_cd = p.beansFactory.createTableColumn("DispRslt.mng_dpt_cd", MCColumnType.TEXT);
		p.columnDispRslt_mng_dpt_nm = p.beansFactory.createTableColumn("DispRslt.mng_dpt_nm", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_typ = p.beansFactory.createTableColumn("DispRslt.par_itm_typ", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_typ_nm = p.beansFactory.createTableColumn("DispRslt.par_itm_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_typ_d_cd = p.beansFactory.createTableColumn("DispRslt.par_itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_typ_d_nm = p.beansFactory.createTableColumn("DispRslt.par_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_jnl_cd = p.beansFactory.createTableColumn("DispRslt.par_itm_jnl_cd", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_jnl_nm = p.beansFactory.createTableColumn("DispRslt.par_itm_jnl_nm", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_cd1 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_cd1", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_nm1 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_nm1", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_cd2 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_cd2", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_nm2 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_nm2", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_cd3 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_cd3", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_nm3 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_nm3", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_cd4 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_cd4", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_nm4 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_nm4", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_cd5 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_cd5", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_nm5 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_nm5", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_cd6 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_cd6", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_nm6 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_nm6", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_cd7 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_cd7", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_nm7 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_nm7", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_cd8 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_cd8", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_nm8 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_nm8", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_cd9 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_cd9", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_nm9 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_nm9", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_cd10 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_cd10", MCColumnType.TEXT);
		p.columnDispRslt_par_itm_grp_nm10 = p.beansFactory.createTableColumn("DispRslt.par_itm_grp_nm10", MCColumnType.TEXT);
		p.columnDispRslt_par_lot_no = p.beansFactory.createTableColumn("DispRslt.par_lot_no", MCColumnType.TEXT);
		p.columnDispRslt_par_sublot_no = p.beansFactory.createTableColumn("DispRslt.par_sublot_no", MCColumnType.TEXT);
		p.columnDispRslt_par_sno1 = p.beansFactory.createTableColumn("DispRslt.par_sno1", MCColumnType.TEXT);
		p.columnDispRslt_par_sno2 = p.beansFactory.createTableColumn("DispRslt.par_sno2", MCColumnType.TEXT);
		p.columnDispRslt_par_sno3 = p.beansFactory.createTableColumn("DispRslt.par_sno3", MCColumnType.TEXT);
		p.columnDispRslt_par_sno4 = p.beansFactory.createTableColumn("DispRslt.par_sno4", MCColumnType.TEXT);
		p.columnDispRslt_par_asst_typ = p.beansFactory.createTableColumn("DispRslt.par_asst_typ", MCColumnType.TEXT);
		p.columnDispRslt_par_asst_typ_nm = p.beansFactory.createTableColumn("DispRslt.par_asst_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_inpt_dpt_cd = p.beansFactory.createTableColumn("DispRslt.inpt_dpt_cd", MCColumnType.TEXT);
		p.columnDispRslt_inpt_dpt_nm = p.beansFactory.createTableColumn("DispRslt.inpt_dpt_nm", MCColumnType.TEXT);
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
		p.columnDispRslt_asst_typ = p.beansFactory.createTableColumn("DispRslt.asst_typ", MCColumnType.TEXT);
		p.columnDispRslt_asst_typ_nm = p.beansFactory.createTableColumn("DispRslt.asst_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_loc_cd = p.beansFactory.createTableColumn("DispRslt.loc_cd", MCColumnType.TEXT);
		p.columnDispRslt_loc_nm = p.beansFactory.createTableColumn("DispRslt.loc_nm", MCColumnType.TEXT);
		p.columnDispRslt_str_ln_cd = p.beansFactory.createTableColumn("DispRslt.str_ln_cd", MCColumnType.TEXT);
		p.columnDispRslt_str_ln_nm = p.beansFactory.createTableColumn("DispRslt.str_ln_nm", MCColumnType.TEXT);
		p.columnDispRslt_site_cd = p.beansFactory.createTableColumn("DispRslt.site_cd", MCColumnType.TEXT);
		p.columnDispRslt_site_nm = p.beansFactory.createTableColumn("DispRslt.site_nm", MCColumnType.TEXT);
		p.columnDispRslt_oper_cd = p.beansFactory.createTableColumn("DispRslt.oper_cd", MCColumnType.TEXT);
		p.columnDispRslt_oper_nm = p.beansFactory.createTableColumn("DispRslt.oper_nm", MCColumnType.TEXT);
		p.columnDispRslt_stk_bp_cd = p.beansFactory.createTableColumn("DispRslt.stk_bp_cd", MCColumnType.TEXT);
		p.columnDispRslt_stk_bp_nm = p.beansFactory.createTableColumn("DispRslt.stk_bp_nm", MCColumnType.TEXT);
		p.columnDispRslt_expns_cd = p.beansFactory.createTableColumn("DispRslt.expns_cd", MCColumnType.TEXT);
		p.columnDispRslt_expns_nm = p.beansFactory.createTableColumn("DispRslt.expns_nm", MCColumnType.TEXT);
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
	protected static void jbInitTop(MGBAP_MlyInptQtySrch p) {
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
	protected static void jbInitFold(MGBAP_MlyInptQtySrch p) {
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
	protected static void jbInitTab1(MGBAP_MlyInptQtySrch p) {
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
	protected static void jbInitTab2(MGBAP_MlyInptQtySrch p) {
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
	protected static void jbInitTab3(MGBAP_MlyInptQtySrch p) {
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
	protected static void jbInitTab4(MGBAP_MlyInptQtySrch p) {
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
	protected static void jbInitCnd(MGBAP_MlyInptQtySrch p) {
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
		p.Cnd_pln_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.pln_calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_pln_calc_ctg_nm);
		p.Cnd_pln_calc_ctg_nm.setNextBeans(p.Cnd_act_calc_ctg_cd);
		p.Cnd_pln_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.pln_calc_ctg_nm_META);
		p.Cnd_act_calc_ctg_cd.setListType(MCListType.FREE);
		p.Cnd_act_calc_ctg_cd.setLinkBeans(p.Cnd_act_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_act_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_act_calc_ctg_cd);
		p.Cnd_act_calc_ctg_cd.setNextBeans(p.Cnd_act_calc_ctg_nm);
		p.Cnd_act_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.act_calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_act_calc_ctg_nm);
		p.Cnd_act_calc_ctg_nm.setNextBeans(p.Cnd_term_p_PPanel);
		p.Cnd_act_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.act_calc_ctg_nm_META);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_term_p_PPanel.Term_term.setListType(MCListType.FREE);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_mng_dpt_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_mng_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mng_dpt_cd, true);
		p.Cnd_mng_dpt_cd.setLinkBeans(p.Cnd_mng_dpt_nm);
		p.CndPanel.add(p.Cnd_mng_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_mng_dpt_cd);
		p.Cnd_mng_dpt_cd.setNextBeans(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.mng_dpt_cd_META);
		p.CndPanel.add(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_nm.setNextBeans(p.Cnd_par_itm_typ_p_PPanel);
		p.Cnd_mng_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.mng_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_mng_dpt_nm, true);
		p.CndPanel.add(p.Cnd_par_itm_typ_p_PPanel);
		p.Cnd_par_itm_typ_p_PPanel.setNextBeans(p.Cnd_par_itm_jnl_cd);
		p.Cnd_par_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_jnl_cd, true);
		p.Cnd_par_itm_jnl_cd.setLinkBeans(p.Cnd_par_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_par_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_par_itm_jnl_cd);
		p.Cnd_par_itm_jnl_cd.setNextBeans(p.Cnd_par_itm_jnl_nm);
		p.Cnd_par_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_par_itm_jnl_nm);
		p.Cnd_par_itm_jnl_nm.setNextBeans(p.Cnd_par_itm_p_PPanel);
		p.Cnd_par_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_jnl_nm_META);
		p.setPluralValueEnable(p.Cnd_par_itm_jnl_nm, true);
		p.CndPanel.add(p.Cnd_par_itm_p_PPanel);
		p.Cnd_par_itm_p_PPanel.setNextBeans(p.Cnd_par_lot_no);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub1,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_sub3, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_par_itm_nm);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_par_lot_no_Label);
		p.CndPanel.add(p.Cnd_par_lot_no);
		p.Cnd_par_lot_no.setNextBeans(p.Cnd_par_sublot_no);
		p.Cnd_par_lot_no.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_lot_no_META);
		p.setPluralValueEnable(p.Cnd_par_lot_no, true);
		p.CndPanel.add(p.Cnd_par_sublot_no);
		p.Cnd_par_sublot_no.setNextBeans(p.Cnd_par_sno1);
		p.Cnd_par_sublot_no.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_sublot_no_META);
		p.setPluralValueEnable(p.Cnd_par_sublot_no, true);
		p.CndPanel.add(p.Cnd_par_sno1_Label);
		p.CndPanel.add(p.Cnd_par_sno1);
		p.Cnd_par_sno1.setNextBeans(p.Cnd_par_sno2);
		p.Cnd_par_sno1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_sno1_META);
		p.setPluralValueEnable(p.Cnd_par_sno1, true);
		p.CndPanel.add(p.Cnd_par_sno2_Label);
		p.CndPanel.add(p.Cnd_par_sno2);
		p.Cnd_par_sno2.setNextBeans(p.Cnd_par_sno3);
		p.Cnd_par_sno2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_sno2_META);
		p.setPluralValueEnable(p.Cnd_par_sno2, true);
		p.CndPanel.add(p.Cnd_par_sno3_Label);
		p.CndPanel.add(p.Cnd_par_sno3);
		p.Cnd_par_sno3.setNextBeans(p.Cnd_par_sno4);
		p.Cnd_par_sno3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_sno3_META);
		p.setPluralValueEnable(p.Cnd_par_sno3, true);
		p.CndPanel.add(p.Cnd_par_sno4_Label);
		p.CndPanel.add(p.Cnd_par_sno4);
		p.Cnd_par_sno4.setNextBeans(p.Cnd_par_asst_typ);
		p.Cnd_par_sno4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_sno4_META);
		p.setPluralValueEnable(p.Cnd_par_sno4, true);
		p.Cnd_par_asst_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_asst_typ, true);
		p.Cnd_par_asst_typ.setLinkBeans(p.Cnd_par_asst_typ_nm);
		p.CndPanel.add(p.Cnd_par_asst_typ_Label);
		p.CndPanel.add(p.Cnd_par_asst_typ);
		p.Cnd_par_asst_typ.setNextBeans(p.Cnd_par_asst_typ_nm);
		p.Cnd_par_asst_typ.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_asst_typ_META);
		p.CndPanel.add(p.Cnd_par_asst_typ_nm);
		p.Cnd_par_asst_typ_nm.setNextBeans(p.Cnd_inpt_dpt_cd);
		p.Cnd_par_asst_typ_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_asst_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_par_asst_typ_nm, true);
		p.Cnd_inpt_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_inpt_dpt_cd, true);
		p.Cnd_inpt_dpt_cd.setLinkBeans(p.Cnd_inpt_dpt_nm);
		p.CndPanel.add(p.Cnd_inpt_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_inpt_dpt_cd);
		p.Cnd_inpt_dpt_cd.setNextBeans(p.Cnd_inpt_dpt_nm);
		p.Cnd_inpt_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.inpt_dpt_cd_META);
		p.CndPanel.add(p.Cnd_inpt_dpt_nm);
		p.Cnd_inpt_dpt_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_inpt_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.inpt_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_inpt_dpt_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_jnl_cd, true);
		p.Cnd_itm_jnl_cd.setLinkBeans(p.Cnd_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setNextBeans(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_jnl_nm_META);
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
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno1);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.sublot_no_META);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno1_Label);
		p.CndPanel.add(p.Cnd_sno1);
		p.Cnd_sno1.setNextBeans(p.Cnd_sno2);
		p.Cnd_sno1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.sno1_META);
		p.setPluralValueEnable(p.Cnd_sno1, true);
		p.CndPanel.add(p.Cnd_sno2_Label);
		p.CndPanel.add(p.Cnd_sno2);
		p.Cnd_sno2.setNextBeans(p.Cnd_sno3);
		p.Cnd_sno2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.sno2_META);
		p.setPluralValueEnable(p.Cnd_sno2, true);
		p.CndPanel.add(p.Cnd_sno3_Label);
		p.CndPanel.add(p.Cnd_sno3);
		p.Cnd_sno3.setNextBeans(p.Cnd_sno4);
		p.Cnd_sno3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.sno3_META);
		p.setPluralValueEnable(p.Cnd_sno3, true);
		p.CndPanel.add(p.Cnd_sno4_Label);
		p.CndPanel.add(p.Cnd_sno4);
		p.Cnd_sno4.setNextBeans(p.Cnd_asst_typ);
		p.Cnd_sno4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.sno4_META);
		p.setPluralValueEnable(p.Cnd_sno4, true);
		p.Cnd_asst_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asst_typ, true);
		p.Cnd_asst_typ.setLinkBeans(p.Cnd_asst_typ_nm);
		p.CndPanel.add(p.Cnd_asst_typ_Label);
		p.CndPanel.add(p.Cnd_asst_typ);
		p.Cnd_asst_typ.setNextBeans(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.asst_typ_META);
		p.CndPanel.add(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_asst_typ_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.asst_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_asst_typ_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_oper_cd);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.Cnd_oper_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_cd, true);
		p.Cnd_oper_cd.setLinkBeans(p.Cnd_oper_nm);
		p.CndPanel.add(p.Cnd_oper_cd_Label);
		p.CndPanel.add(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setNextBeans(p.Cnd_oper_nm);
		p.Cnd_oper_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.oper_cd_META);
		p.CndPanel.add(p.Cnd_oper_nm);
		p.Cnd_oper_nm.setNextBeans(p.Cnd_stk_bp_cd);
		p.Cnd_oper_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.oper_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_nm, true);
		p.CndPanel.add(p.Cnd_stk_bp_cd_Label);
		p.CndPanel.add(p.Cnd_stk_bp_cd);
		p.Cnd_stk_bp_cd.setNextBeans(p.Cnd_stk_bp_nm);
		p.Cnd_stk_bp_cd.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.stk_bp_cd_META);
		p.Cnd_stk_bp_cd.addLinkBeans(p.Cnd_stk_bp_nm);
		p.Cnd_stk_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_bp_cd, true);
		p.CndPanel.add(p.Cnd_stk_bp_nm);
		p.Cnd_stk_bp_nm.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.stk_bp_nm_META);
		p.setPluralValueEnable(p.Cnd_stk_bp_nm, true);
		p.Cnd_par_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd1, true);
		p.Cnd_par_itm_grp_cd1.setLinkBeans(p.Cnd_par_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_par_itm_grp_cd1);
		p.Cnd_par_itm_grp_cd1.setNextBeans(p.Cnd_par_itm_grp_nm1);
		p.Cnd_par_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm1);
		p.Cnd_par_itm_grp_nm1.setNextBeans(p.Cnd_par_itm_grp_cd2);
		p.Cnd_par_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm1, true);
		p.Cnd_par_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd2, true);
		p.Cnd_par_itm_grp_cd2.setLinkBeans(p.Cnd_par_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd2);
		p.Cnd_par_itm_grp_cd2.setNextBeans(p.Cnd_par_itm_grp_nm2);
		p.Cnd_par_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm2);
		p.Cnd_par_itm_grp_nm2.setNextBeans(p.Cnd_par_itm_grp_cd3);
		p.Cnd_par_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm2, true);
		p.Cnd_par_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd3, true);
		p.Cnd_par_itm_grp_cd3.setLinkBeans(p.Cnd_par_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd3);
		p.Cnd_par_itm_grp_cd3.setNextBeans(p.Cnd_par_itm_grp_nm3);
		p.Cnd_par_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm3);
		p.Cnd_par_itm_grp_nm3.setNextBeans(p.Cnd_par_itm_grp_cd4);
		p.Cnd_par_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm3, true);
		p.Cnd_par_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd4, true);
		p.Cnd_par_itm_grp_cd4.setLinkBeans(p.Cnd_par_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd4);
		p.Cnd_par_itm_grp_cd4.setNextBeans(p.Cnd_par_itm_grp_nm4);
		p.Cnd_par_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm4);
		p.Cnd_par_itm_grp_nm4.setNextBeans(p.Cnd_par_itm_grp_cd5);
		p.Cnd_par_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm4, true);
		p.Cnd_par_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd5, true);
		p.Cnd_par_itm_grp_cd5.setLinkBeans(p.Cnd_par_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd5);
		p.Cnd_par_itm_grp_cd5.setNextBeans(p.Cnd_par_itm_grp_nm5);
		p.Cnd_par_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm5);
		p.Cnd_par_itm_grp_nm5.setNextBeans(p.Cnd_par_itm_grp_cd6);
		p.Cnd_par_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm5, true);
		p.Cnd_par_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd6, true);
		p.Cnd_par_itm_grp_cd6.setLinkBeans(p.Cnd_par_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd6);
		p.Cnd_par_itm_grp_cd6.setNextBeans(p.Cnd_par_itm_grp_nm6);
		p.Cnd_par_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm6);
		p.Cnd_par_itm_grp_nm6.setNextBeans(p.Cnd_par_itm_grp_cd7);
		p.Cnd_par_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm6, true);
		p.Cnd_par_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd7, true);
		p.Cnd_par_itm_grp_cd7.setLinkBeans(p.Cnd_par_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd7);
		p.Cnd_par_itm_grp_cd7.setNextBeans(p.Cnd_par_itm_grp_nm7);
		p.Cnd_par_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm7);
		p.Cnd_par_itm_grp_nm7.setNextBeans(p.Cnd_par_itm_grp_cd8);
		p.Cnd_par_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm7, true);
		p.Cnd_par_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd8, true);
		p.Cnd_par_itm_grp_cd8.setLinkBeans(p.Cnd_par_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd8);
		p.Cnd_par_itm_grp_cd8.setNextBeans(p.Cnd_par_itm_grp_nm8);
		p.Cnd_par_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm8);
		p.Cnd_par_itm_grp_nm8.setNextBeans(p.Cnd_par_itm_grp_cd9);
		p.Cnd_par_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm8, true);
		p.Cnd_par_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd9, true);
		p.Cnd_par_itm_grp_cd9.setLinkBeans(p.Cnd_par_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd9);
		p.Cnd_par_itm_grp_cd9.setNextBeans(p.Cnd_par_itm_grp_nm9);
		p.Cnd_par_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm9);
		p.Cnd_par_itm_grp_nm9.setNextBeans(p.Cnd_par_itm_grp_cd10);
		p.Cnd_par_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm9, true);
		p.Cnd_par_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd10, true);
		p.Cnd_par_itm_grp_cd10.setLinkBeans(p.Cnd_par_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd10);
		p.Cnd_par_itm_grp_cd10.setNextBeans(p.Cnd_par_itm_grp_nm10);
		p.Cnd_par_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm10);
		p.Cnd_par_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm10, true);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd1);
		p.Cnd3Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_cd1_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_cd2_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_cd3_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_cd4_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_cd5_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_cd6_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_cd7_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_cd8_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_cd9_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_cd10_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
		p.TtlPanel.add(p.Cnd_wg_flg);
		p.TtlPanel.setLastBeans(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setNextBeans(p.Cnd_mng_dpt_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.wg_flg_META);
		p.TtlPanel.add(p.Cnd_mng_dpt_flg);
		p.Cnd_mng_dpt_flg.setNextBeans(p.Cnd_par_itm_flg);
		p.Cnd_mng_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.mng_dpt_flg_META);
		p.TtlPanel.add(p.Cnd_par_itm_flg);
		p.Cnd_par_itm_flg.setNextBeans(p.Cnd_par_itm_typ_flg);
		p.Cnd_par_itm_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_flg_META);
		p.TtlPanel.add(p.Cnd_par_itm_typ_flg);
		p.Cnd_par_itm_typ_flg.setNextBeans(p.Cnd_par_itm_typ_d_flg);
		p.Cnd_par_itm_typ_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_typ_flg_META);
		p.TtlPanel.add(p.Cnd_par_itm_typ_d_flg);
		p.Cnd_par_itm_typ_d_flg.setNextBeans(p.Cnd_par_itm_jnl_flg);
		p.Cnd_par_itm_typ_d_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_typ_d_flg_META);
		p.TtlPanel.add(p.Cnd_par_itm_jnl_flg);
		p.Cnd_par_itm_jnl_flg.setNextBeans(p.Cnd_par_lot_flg);
		p.Cnd_par_itm_jnl_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_jnl_flg_META);
		p.TtlPanel.add(p.Cnd_par_lot_flg);
		p.Cnd_par_lot_flg.setNextBeans(p.Cnd_par_sublot_flg);
		p.Cnd_par_lot_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_lot_flg_META);
		p.TtlPanel.add(p.Cnd_par_sublot_flg);
		p.Cnd_par_sublot_flg.setNextBeans(p.Cnd_par_sno1_flg);
		p.Cnd_par_sublot_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_sublot_flg_META);
		p.TtlPanel.add(p.Cnd_par_sno1_flg);
		p.Cnd_par_sno1_flg.setNextBeans(p.Cnd_par_sno2_flg);
		p.Cnd_par_sno1_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_sno1_flg_META);
		p.TtlPanel.add(p.Cnd_par_sno2_flg);
		p.Cnd_par_sno2_flg.setNextBeans(p.Cnd_par_sno3_flg);
		p.Cnd_par_sno2_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_sno2_flg_META);
		p.TtlPanel.add(p.Cnd_par_sno3_flg);
		p.Cnd_par_sno3_flg.setNextBeans(p.Cnd_par_sno4_flg);
		p.Cnd_par_sno3_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_sno3_flg_META);
		p.TtlPanel.add(p.Cnd_par_sno4_flg);
		p.Cnd_par_sno4_flg.setNextBeans(p.Cnd_par_asst_flg);
		p.Cnd_par_sno4_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_sno4_flg_META);
		p.TtlPanel.add(p.Cnd_par_asst_flg);
		p.Cnd_par_asst_flg.setNextBeans(p.Cnd_inpt_dpt_flg);
		p.Cnd_par_asst_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_asst_flg_META);
		p.TtlPanel.add(p.Cnd_inpt_dpt_flg);
		p.Cnd_inpt_dpt_flg.setNextBeans(p.Cnd_itm_flg);
		p.Cnd_inpt_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.inpt_dpt_flg_META);
		p.TtlPanel.add(p.Cnd_itm_flg);
		p.Cnd_itm_flg.setNextBeans(p.Cnd_itm_typ_flg);
		p.Cnd_itm_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_flg_META);
		p.TtlPanel.add(p.Cnd_itm_typ_flg);
		p.Cnd_itm_typ_flg.setNextBeans(p.Cnd_itm_typ_d_flg);
		p.Cnd_itm_typ_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_typ_flg_META);
		p.TtlPanel.add(p.Cnd_itm_typ_d_flg);
		p.Cnd_itm_typ_d_flg.setNextBeans(p.Cnd_itm_jnl_flg);
		p.Cnd_itm_typ_d_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_typ_d_flg_META);
		p.TtlPanel.add(p.Cnd_itm_jnl_flg);
		p.Cnd_itm_jnl_flg.setNextBeans(p.Cnd_lot_flg);
		p.Cnd_itm_jnl_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_jnl_flg_META);
		p.TtlPanel.add(p.Cnd_lot_flg);
		p.Cnd_lot_flg.setNextBeans(p.Cnd_sublot_flg);
		p.Cnd_lot_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.lot_flg_META);
		p.TtlPanel.add(p.Cnd_sublot_flg);
		p.Cnd_sublot_flg.setNextBeans(p.Cnd_sno1_flg);
		p.Cnd_sublot_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.sublot_flg_META);
		p.TtlPanel.add(p.Cnd_sno1_flg);
		p.Cnd_sno1_flg.setNextBeans(p.Cnd_sno2_flg);
		p.Cnd_sno1_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.sno1_flg_META);
		p.TtlPanel.add(p.Cnd_sno2_flg);
		p.Cnd_sno2_flg.setNextBeans(p.Cnd_sno3_flg);
		p.Cnd_sno2_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.sno2_flg_META);
		p.TtlPanel.add(p.Cnd_sno3_flg);
		p.Cnd_sno3_flg.setNextBeans(p.Cnd_sno4_flg);
		p.Cnd_sno3_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.sno3_flg_META);
		p.TtlPanel.add(p.Cnd_sno4_flg);
		p.Cnd_sno4_flg.setNextBeans(p.Cnd_asst_flg);
		p.Cnd_sno4_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.sno4_flg_META);
		p.TtlPanel.add(p.Cnd_asst_flg);
		p.Cnd_asst_flg.setNextBeans(p.Cnd_loc_flg);
		p.Cnd_asst_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.asst_flg_META);
		p.TtlPanel.add(p.Cnd_loc_flg);
		p.Cnd_loc_flg.setNextBeans(p.Cnd_str_ln_flg);
		p.Cnd_loc_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.loc_flg_META);
		p.TtlPanel.add(p.Cnd_str_ln_flg);
		p.Cnd_str_ln_flg.setNextBeans(p.Cnd_site_flg);
		p.Cnd_str_ln_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.str_ln_flg_META);
		p.TtlPanel.add(p.Cnd_site_flg);
		p.Cnd_site_flg.setNextBeans(p.Cnd_oper_flg);
		p.Cnd_site_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.site_flg_META);
		p.TtlPanel.add(p.Cnd_oper_flg);
		p.Cnd_oper_flg.setNextBeans(p.Cnd_stk_bp_flg);
		p.Cnd_oper_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.oper_flg_META);
		p.TtlPanel.add(p.Cnd_stk_bp_flg);
		p.Cnd_stk_bp_flg.setNextBeans(p.Cnd_expns_flg);
		p.Cnd_stk_bp_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.stk_bp_flg_META);
		p.TtlPanel.add(p.Cnd_expns_flg);
		p.Cnd_expns_flg.setNextBeans(p.Cnd_par_itm_grp_flg1);
		p.Cnd_expns_flg.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.expns_flg_META);
		p.TtlPanel.add(p.Cnd_par_itm_grp_flg1);
		p.Cnd_par_itm_grp_flg1.setNextBeans(p.Cnd_par_itm_grp_flg2);
		p.Cnd_par_itm_grp_flg1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_flg1_META);
		p.TtlPanel.add(p.Cnd_par_itm_grp_flg2);
		p.Cnd_par_itm_grp_flg2.setNextBeans(p.Cnd_par_itm_grp_flg3);
		p.Cnd_par_itm_grp_flg2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_flg2_META);
		p.TtlPanel.add(p.Cnd_par_itm_grp_flg3);
		p.Cnd_par_itm_grp_flg3.setNextBeans(p.Cnd_par_itm_grp_flg4);
		p.Cnd_par_itm_grp_flg3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_flg3_META);
		p.TtlPanel.add(p.Cnd_par_itm_grp_flg4);
		p.Cnd_par_itm_grp_flg4.setNextBeans(p.Cnd_par_itm_grp_flg5);
		p.Cnd_par_itm_grp_flg4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_flg4_META);
		p.TtlPanel.add(p.Cnd_par_itm_grp_flg5);
		p.Cnd_par_itm_grp_flg5.setNextBeans(p.Cnd_par_itm_grp_flg6);
		p.Cnd_par_itm_grp_flg5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_flg5_META);
		p.TtlPanel.add(p.Cnd_par_itm_grp_flg6);
		p.Cnd_par_itm_grp_flg6.setNextBeans(p.Cnd_par_itm_grp_flg7);
		p.Cnd_par_itm_grp_flg6.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_flg6_META);
		p.TtlPanel.add(p.Cnd_par_itm_grp_flg7);
		p.Cnd_par_itm_grp_flg7.setNextBeans(p.Cnd_par_itm_grp_flg8);
		p.Cnd_par_itm_grp_flg7.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_flg7_META);
		p.TtlPanel.add(p.Cnd_par_itm_grp_flg8);
		p.Cnd_par_itm_grp_flg8.setNextBeans(p.Cnd_par_itm_grp_flg9);
		p.Cnd_par_itm_grp_flg8.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_flg8_META);
		p.TtlPanel.add(p.Cnd_par_itm_grp_flg9);
		p.Cnd_par_itm_grp_flg9.setNextBeans(p.Cnd_par_itm_grp_flg10);
		p.Cnd_par_itm_grp_flg9.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_flg9_META);
		p.TtlPanel.add(p.Cnd_par_itm_grp_flg10);
		p.Cnd_par_itm_grp_flg10.setNextBeans(p.Cnd_itm_grp_flg1);
		p.Cnd_par_itm_grp_flg10.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.par_itm_grp_flg10_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg1);
		p.Cnd_itm_grp_flg1.setNextBeans(p.Cnd_itm_grp_flg2);
		p.Cnd_itm_grp_flg1.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_flg1_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg2);
		p.Cnd_itm_grp_flg2.setNextBeans(p.Cnd_itm_grp_flg3);
		p.Cnd_itm_grp_flg2.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_flg2_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg3);
		p.Cnd_itm_grp_flg3.setNextBeans(p.Cnd_itm_grp_flg4);
		p.Cnd_itm_grp_flg3.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_flg3_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg4);
		p.Cnd_itm_grp_flg4.setNextBeans(p.Cnd_itm_grp_flg5);
		p.Cnd_itm_grp_flg4.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_flg4_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg5);
		p.Cnd_itm_grp_flg5.setNextBeans(p.Cnd_itm_grp_flg6);
		p.Cnd_itm_grp_flg5.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_flg5_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg6);
		p.Cnd_itm_grp_flg6.setNextBeans(p.Cnd_itm_grp_flg7);
		p.Cnd_itm_grp_flg6.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_flg6_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg7);
		p.Cnd_itm_grp_flg7.setNextBeans(p.Cnd_itm_grp_flg8);
		p.Cnd_itm_grp_flg7.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_flg7_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg8);
		p.Cnd_itm_grp_flg8.setNextBeans(p.Cnd_itm_grp_flg9);
		p.Cnd_itm_grp_flg8.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_flg8_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg9);
		p.Cnd_itm_grp_flg9.setNextBeans(p.Cnd_itm_grp_flg10);
		p.Cnd_itm_grp_flg9.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_flg9_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg10);
		p.Cnd_itm_grp_flg10.setNextBeans(p.Cnd_select_all);
		p.Cnd_itm_grp_flg10.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.itm_grp_flg10_META);
		p.Cnd_select_all.setIcon("SELECT_ALL");
		p.Cnd_select_all.setFunctionKey(MCFunctionKey.F13);
		p.TtlPanel.add(p.Cnd_select_all);
		p.Cnd_select_all.setNextBeans(p.Cnd_deselect_all);
		p.Cnd_deselect_all.setIcon("DESELECT_ALL");
		p.Cnd_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.TtlPanel.add(p.Cnd_deselect_all);
		p.LPnlPanel.add(p.Cnd_disp_key);
		p.LPnlPanel.setLastBeans(p.Cnd_disp_key);
		p.Cnd_disp_key.setRow(p.getCndR(), mcframe.clientMGBA.MGBAP0150.CndR.disp_key_META);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MGBAP_MlyInptQtySrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MGBAP_MlyInptQtySrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTtl(MGBAP_MlyInptQtySrch p) {
		// ブロック関連の初期化
		p.TtlPanel.setValueCheck(false);
		p.TtlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MGBAP_MlyInptQtySrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBAP_MlyInptQtySrch p) {
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
	protected static void jbInitDispRslt(MGBAP_MlyInptQtySrch p) {
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
		MGBAP_MlyInptQtySrch_MC.mcInitTop((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.mcInitFold((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.mcInitTab1((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.mcInitTab2((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.mcInitTab3((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.mcInitTab4((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.mcInitCnd((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.mcInitCnd2((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.mcInitCnd3((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.mcInitTtl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.mcInitLPnl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.mcInitCtrl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.mcInitDispRslt((MGBAP_MlyInptQtySrch)this);

		// [SRCH]ステータスのモードの設定
		MGBAP_MlyInptQtySrch_MC.statusInitSRCH_Top((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitSRCH_Fold((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitSRCH_Tab1((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitSRCH_Tab2((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitSRCH_Tab3((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitSRCH_Tab4((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitSRCH_Cnd((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitSRCH_Cnd2((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitSRCH_Cnd3((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitSRCH_Ttl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitSRCH_LPnl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitSRCH_Ctrl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitSRCH_DispRslt((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitSRCH_Rslt((MGBAP_MlyInptQtySrch)this);

		// [REF]ステータスのモードの設定
		MGBAP_MlyInptQtySrch_MC.statusInitREF_Top((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitREF_Fold((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitREF_Tab1((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitREF_Tab2((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitREF_Tab3((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitREF_Tab4((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitREF_Cnd((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitREF_Cnd2((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitREF_Cnd3((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitREF_Ttl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitREF_LPnl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitREF_Ctrl((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitREF_DispRslt((MGBAP_MlyInptQtySrch)this);
		MGBAP_MlyInptQtySrch_MC.statusInitREF_Rslt((MGBAP_MlyInptQtySrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBAP_MlyInptQtySrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBAP_MlyInptQtySrch p) {
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
		p.Cnd_par_itm_jnl_cd.setListListener(p);
		p.Cnd_par_itm_jnl_cd.addAllListener(p);
		p.Cnd_par_itm_jnl_nm.setListListener(p);
		p.Cnd_par_itm_jnl_nm.addAllListener(p);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_lot_no.setListListener(p);
		p.Cnd_par_lot_no.addAllListener(p);
		p.Cnd_par_sublot_no.setListListener(p);
		p.Cnd_par_sublot_no.addAllListener(p);
		p.Cnd_par_sno1.setListListener(p);
		p.Cnd_par_sno1.addAllListener(p);
		p.Cnd_par_sno2.setListListener(p);
		p.Cnd_par_sno2.addAllListener(p);
		p.Cnd_par_sno3.setListListener(p);
		p.Cnd_par_sno3.addAllListener(p);
		p.Cnd_par_sno4.setListListener(p);
		p.Cnd_par_sno4.addAllListener(p);
		p.Cnd_par_asst_typ.setListListener(p);
		p.Cnd_par_asst_typ.addAllListener(p);
		p.Cnd_par_asst_typ_nm.setListListener(p);
		p.Cnd_par_asst_typ_nm.addAllListener(p);
		p.Cnd_inpt_dpt_cd.setListListener(p);
		p.Cnd_inpt_dpt_cd.addAllListener(p);
		p.Cnd_inpt_dpt_nm.setListListener(p);
		p.Cnd_inpt_dpt_nm.addAllListener(p);
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
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_str_ln_cd.setListListener(p);
		p.Cnd_str_ln_cd.addAllListener(p);
		p.Cnd_str_ln_nm.setListListener(p);
		p.Cnd_str_ln_nm.addAllListener(p);
		p.Cnd_oper_cd.setListListener(p);
		p.Cnd_oper_cd.addAllListener(p);
		p.Cnd_oper_nm.setListListener(p);
		p.Cnd_oper_nm.addAllListener(p);
		p.Cnd_stk_bp_cd.setListListener(p);
		p.Cnd_stk_bp_cd.addAllListener(p);
		p.Cnd_stk_bp_nm.setListListener(p);
		p.Cnd_stk_bp_nm.addAllListener(p);
		p.Cnd_par_itm_grp_cd1.setListListener(p);
		p.Cnd_par_itm_grp_cd1.addAllListener(p);
		p.Cnd_par_itm_grp_nm1.setListListener(p);
		p.Cnd_par_itm_grp_nm1.addAllListener(p);
		p.Cnd_par_itm_grp_cd2.setListListener(p);
		p.Cnd_par_itm_grp_cd2.addAllListener(p);
		p.Cnd_par_itm_grp_nm2.setListListener(p);
		p.Cnd_par_itm_grp_nm2.addAllListener(p);
		p.Cnd_par_itm_grp_cd3.setListListener(p);
		p.Cnd_par_itm_grp_cd3.addAllListener(p);
		p.Cnd_par_itm_grp_nm3.setListListener(p);
		p.Cnd_par_itm_grp_nm3.addAllListener(p);
		p.Cnd_par_itm_grp_cd4.setListListener(p);
		p.Cnd_par_itm_grp_cd4.addAllListener(p);
		p.Cnd_par_itm_grp_nm4.setListListener(p);
		p.Cnd_par_itm_grp_nm4.addAllListener(p);
		p.Cnd_par_itm_grp_cd5.setListListener(p);
		p.Cnd_par_itm_grp_cd5.addAllListener(p);
		p.Cnd_par_itm_grp_nm5.setListListener(p);
		p.Cnd_par_itm_grp_nm5.addAllListener(p);
		p.Cnd_par_itm_grp_cd6.setListListener(p);
		p.Cnd_par_itm_grp_cd6.addAllListener(p);
		p.Cnd_par_itm_grp_nm6.setListListener(p);
		p.Cnd_par_itm_grp_nm6.addAllListener(p);
		p.Cnd_par_itm_grp_cd7.setListListener(p);
		p.Cnd_par_itm_grp_cd7.addAllListener(p);
		p.Cnd_par_itm_grp_nm7.setListListener(p);
		p.Cnd_par_itm_grp_nm7.addAllListener(p);
		p.Cnd_par_itm_grp_cd8.setListListener(p);
		p.Cnd_par_itm_grp_cd8.addAllListener(p);
		p.Cnd_par_itm_grp_nm8.setListListener(p);
		p.Cnd_par_itm_grp_nm8.addAllListener(p);
		p.Cnd_par_itm_grp_cd9.setListListener(p);
		p.Cnd_par_itm_grp_cd9.addAllListener(p);
		p.Cnd_par_itm_grp_nm9.setListListener(p);
		p.Cnd_par_itm_grp_nm9.addAllListener(p);
		p.Cnd_par_itm_grp_cd10.setListListener(p);
		p.Cnd_par_itm_grp_cd10.addAllListener(p);
		p.Cnd_par_itm_grp_nm10.setListListener(p);
		p.Cnd_par_itm_grp_nm10.addAllListener(p);
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
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_mng_dpt_flg.addAllListener(p);
		p.Cnd_par_itm_flg.addAllListener(p);
		p.Cnd_par_itm_typ_flg.addAllListener(p);
		p.Cnd_par_itm_typ_d_flg.addAllListener(p);
		p.Cnd_par_itm_jnl_flg.addAllListener(p);
		p.Cnd_par_lot_flg.addAllListener(p);
		p.Cnd_par_sublot_flg.addAllListener(p);
		p.Cnd_par_sno1_flg.addAllListener(p);
		p.Cnd_par_sno2_flg.addAllListener(p);
		p.Cnd_par_sno3_flg.addAllListener(p);
		p.Cnd_par_sno4_flg.addAllListener(p);
		p.Cnd_par_asst_flg.addAllListener(p);
		p.Cnd_inpt_dpt_flg.addAllListener(p);
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
		p.Cnd_asst_flg.addAllListener(p);
		p.Cnd_loc_flg.addAllListener(p);
		p.Cnd_str_ln_flg.addAllListener(p);
		p.Cnd_site_flg.addAllListener(p);
		p.Cnd_oper_flg.addAllListener(p);
		p.Cnd_stk_bp_flg.addAllListener(p);
		p.Cnd_expns_flg.addAllListener(p);
		p.Cnd_par_itm_grp_flg1.addAllListener(p);
		p.Cnd_par_itm_grp_flg2.addAllListener(p);
		p.Cnd_par_itm_grp_flg3.addAllListener(p);
		p.Cnd_par_itm_grp_flg4.addAllListener(p);
		p.Cnd_par_itm_grp_flg5.addAllListener(p);
		p.Cnd_par_itm_grp_flg6.addAllListener(p);
		p.Cnd_par_itm_grp_flg7.addAllListener(p);
		p.Cnd_par_itm_grp_flg8.addAllListener(p);
		p.Cnd_par_itm_grp_flg9.addAllListener(p);
		p.Cnd_par_itm_grp_flg10.addAllListener(p);
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
		p.Cnd_select_all.addAllListener(p);
		p.Cnd_select_all.setAPMethodName("doCnd_select_all");
		p.Cnd_deselect_all.addAllListener(p);
		p.Cnd_deselect_all.setAPMethodName("doCnd_deselect_all");
		p.Cnd_disp_key.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 *  [Ttl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTtl(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MGBAP_MlyInptQtySrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBAP_MlyInptQtySrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispRslt(MGBAP_MlyInptQtySrch p) {
		p.DispRsltTable.addAllListener(p);
		p.columnDispRslt_wg_cd.addAllListener(p);
		p.columnDispRslt_wg_cd.setListListener(p);
		p.columnDispRslt_wg_nm.addAllListener(p);
		p.columnDispRslt_wg_nm.setListListener(p);
		p.columnDispRslt_mng_dpt_cd.addAllListener(p);
		p.columnDispRslt_mng_dpt_cd.setListListener(p);
		p.columnDispRslt_mng_dpt_nm.addAllListener(p);
		p.columnDispRslt_mng_dpt_nm.setListListener(p);
		p.columnDispRslt_par_itm_typ.addAllListener(p);
		p.columnDispRslt_par_itm_typ.setListListener(p);
		p.columnDispRslt_par_itm_typ_nm.addAllListener(p);
		p.columnDispRslt_par_itm_typ_nm.setListListener(p);
		p.columnDispRslt_par_itm_typ_d_cd.addAllListener(p);
		p.columnDispRslt_par_itm_typ_d_cd.setListListener(p);
		p.columnDispRslt_par_itm_typ_d_nm.addAllListener(p);
		p.columnDispRslt_par_itm_typ_d_nm.setListListener(p);
		p.columnDispRslt_par_itm_jnl_cd.addAllListener(p);
		p.columnDispRslt_par_itm_jnl_cd.setListListener(p);
		p.columnDispRslt_par_itm_jnl_nm.addAllListener(p);
		p.columnDispRslt_par_itm_jnl_nm.setListListener(p);
		p.columnDispRslt_par_itm_grp_cd1.addAllListener(p);
		p.columnDispRslt_par_itm_grp_cd1.setListListener(p);
		p.columnDispRslt_par_itm_grp_nm1.addAllListener(p);
		p.columnDispRslt_par_itm_grp_nm1.setListListener(p);
		p.columnDispRslt_par_itm_grp_cd2.addAllListener(p);
		p.columnDispRslt_par_itm_grp_cd2.setListListener(p);
		p.columnDispRslt_par_itm_grp_nm2.addAllListener(p);
		p.columnDispRslt_par_itm_grp_nm2.setListListener(p);
		p.columnDispRslt_par_itm_grp_cd3.addAllListener(p);
		p.columnDispRslt_par_itm_grp_cd3.setListListener(p);
		p.columnDispRslt_par_itm_grp_nm3.addAllListener(p);
		p.columnDispRslt_par_itm_grp_nm3.setListListener(p);
		p.columnDispRslt_par_itm_grp_cd4.addAllListener(p);
		p.columnDispRslt_par_itm_grp_cd4.setListListener(p);
		p.columnDispRslt_par_itm_grp_nm4.addAllListener(p);
		p.columnDispRslt_par_itm_grp_nm4.setListListener(p);
		p.columnDispRslt_par_itm_grp_cd5.addAllListener(p);
		p.columnDispRslt_par_itm_grp_cd5.setListListener(p);
		p.columnDispRslt_par_itm_grp_nm5.addAllListener(p);
		p.columnDispRslt_par_itm_grp_nm5.setListListener(p);
		p.columnDispRslt_par_itm_grp_cd6.addAllListener(p);
		p.columnDispRslt_par_itm_grp_cd6.setListListener(p);
		p.columnDispRslt_par_itm_grp_nm6.addAllListener(p);
		p.columnDispRslt_par_itm_grp_nm6.setListListener(p);
		p.columnDispRslt_par_itm_grp_cd7.addAllListener(p);
		p.columnDispRslt_par_itm_grp_cd7.setListListener(p);
		p.columnDispRslt_par_itm_grp_nm7.addAllListener(p);
		p.columnDispRslt_par_itm_grp_nm7.setListListener(p);
		p.columnDispRslt_par_itm_grp_cd8.addAllListener(p);
		p.columnDispRslt_par_itm_grp_cd8.setListListener(p);
		p.columnDispRslt_par_itm_grp_nm8.addAllListener(p);
		p.columnDispRslt_par_itm_grp_nm8.setListListener(p);
		p.columnDispRslt_par_itm_grp_cd9.addAllListener(p);
		p.columnDispRslt_par_itm_grp_cd9.setListListener(p);
		p.columnDispRslt_par_itm_grp_nm9.addAllListener(p);
		p.columnDispRslt_par_itm_grp_nm9.setListListener(p);
		p.columnDispRslt_par_itm_grp_cd10.addAllListener(p);
		p.columnDispRslt_par_itm_grp_cd10.setListListener(p);
		p.columnDispRslt_par_itm_grp_nm10.addAllListener(p);
		p.columnDispRslt_par_itm_grp_nm10.setListListener(p);
		p.columnDispRslt_par_lot_no.addAllListener(p);
		p.columnDispRslt_par_lot_no.setListListener(p);
		p.columnDispRslt_par_sublot_no.addAllListener(p);
		p.columnDispRslt_par_sublot_no.setListListener(p);
		p.columnDispRslt_par_sno1.addAllListener(p);
		p.columnDispRslt_par_sno1.setListListener(p);
		p.columnDispRslt_par_sno2.addAllListener(p);
		p.columnDispRslt_par_sno2.setListListener(p);
		p.columnDispRslt_par_sno3.addAllListener(p);
		p.columnDispRslt_par_sno3.setListListener(p);
		p.columnDispRslt_par_sno4.addAllListener(p);
		p.columnDispRslt_par_sno4.setListListener(p);
		p.columnDispRslt_par_asst_typ.addAllListener(p);
		p.columnDispRslt_par_asst_typ.setListListener(p);
		p.columnDispRslt_par_asst_typ_nm.addAllListener(p);
		p.columnDispRslt_par_asst_typ_nm.setListListener(p);
		p.columnDispRslt_inpt_dpt_cd.addAllListener(p);
		p.columnDispRslt_inpt_dpt_cd.setListListener(p);
		p.columnDispRslt_inpt_dpt_nm.addAllListener(p);
		p.columnDispRslt_inpt_dpt_nm.setListListener(p);
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
		p.columnDispRslt_asst_typ.addAllListener(p);
		p.columnDispRslt_asst_typ.setListListener(p);
		p.columnDispRslt_asst_typ_nm.addAllListener(p);
		p.columnDispRslt_asst_typ_nm.setListListener(p);
		p.columnDispRslt_loc_cd.addAllListener(p);
		p.columnDispRslt_loc_cd.setListListener(p);
		p.columnDispRslt_loc_nm.addAllListener(p);
		p.columnDispRslt_loc_nm.setListListener(p);
		p.columnDispRslt_str_ln_cd.addAllListener(p);
		p.columnDispRslt_str_ln_cd.setListListener(p);
		p.columnDispRslt_str_ln_nm.addAllListener(p);
		p.columnDispRslt_str_ln_nm.setListListener(p);
		p.columnDispRslt_site_cd.addAllListener(p);
		p.columnDispRslt_site_cd.setListListener(p);
		p.columnDispRslt_site_nm.addAllListener(p);
		p.columnDispRslt_site_nm.setListListener(p);
		p.columnDispRslt_oper_cd.addAllListener(p);
		p.columnDispRslt_oper_cd.setListListener(p);
		p.columnDispRslt_oper_nm.addAllListener(p);
		p.columnDispRslt_oper_nm.setListListener(p);
		p.columnDispRslt_stk_bp_cd.addAllListener(p);
		p.columnDispRslt_stk_bp_cd.setListListener(p);
		p.columnDispRslt_stk_bp_nm.addAllListener(p);
		p.columnDispRslt_stk_bp_nm.setListListener(p);
		p.columnDispRslt_expns_cd.addAllListener(p);
		p.columnDispRslt_expns_cd.setListListener(p);
		p.columnDispRslt_expns_nm.addAllListener(p);
		p.columnDispRslt_expns_nm.setListListener(p);
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
	protected static void statusInitSRCH_Top(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab4(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBAP_MlyInptQtySrch p){
		p.Cnd_pln_calc_ctg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_act_calc_ctg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_par_itm_jnl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_jnl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_par_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_sno1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_sno2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_sno3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_sno4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_asst_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_inpt_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_inpt_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
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
		p.Cnd_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_stk_bp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm10.putMode(p, SRCH, MCMode.ENABLE);
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
		p.Cnd_wg_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_mng_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_itm_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_itm_typ_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_itm_typ_d_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_itm_jnl_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_lot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_sublot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_sno1_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_sno2_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_sno3_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_sno4_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_asst_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_inpt_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
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
		p.Cnd_asst_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_loc_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_str_ln_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_site_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_oper_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_stk_bp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_expns_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg1.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg2.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg3.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg4.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg5.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg6.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg7.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg8.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg9.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg10.putMode(p, SRCH, MCMode.REQUIRED);
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
		p.Cnd_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ttl(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [SRCH]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DispRslt(MGBAP_MlyInptQtySrch p){
		p.columnDispRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispRslt_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDispRslt_par_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_jnl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_jnl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_asst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_inpt_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_inpt_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.columnDispRslt_asst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_stk_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_stk_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_expns_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_expns_nm.putMode(p, SRCH, MCMode.READ_ONLY);
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
	protected static void statusInitSRCH_Rslt(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBAP_MlyInptQtySrch p){
		p.Cnd_pln_calc_ctg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_act_calc_ctg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_par_itm_jnl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_jnl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_par_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_sno1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_sno2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_sno3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_sno4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_asst_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_inpt_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inpt_dpt_nm.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm10.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_wg_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mng_dpt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_itm_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_itm_typ_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_itm_typ_d_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_itm_jnl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_lot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_sublot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_sno1_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_sno2_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_sno3_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_sno4_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_asst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_inpt_dpt_flg.putMode(p, REF, MCMode.REQUIRED);
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
		p.Cnd_asst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_loc_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_str_ln_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_site_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_oper_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_stk_bp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_expns_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg1.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg2.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg3.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg4.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg5.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg6.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg7.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg8.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg9.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_flg10.putMode(p, REF, MCMode.REQUIRED);
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
		p.Cnd_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [REF]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ttl(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBAP_MlyInptQtySrch p){

	}

	/**
	 * [REF]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispRslt(MGBAP_MlyInptQtySrch p){
		p.columnDispRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DispRslt_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDispRslt_par_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_grp_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_inpt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_inpt_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnDispRslt_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_stk_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_stk_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_Rslt(MGBAP_MlyInptQtySrch p){

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
		MGBAP_MlyInptQtySrch_MC.setTableConfigDispRslt((MGBAP_MlyInptQtySrch)this);
	}

	/**
	 * [DispRslt]ブロックのTableの設定
	 */
	protected static void setTableConfigDispRslt(MGBAP_MlyInptQtySrch p) {
		p.columnDispRslt_wg_cd.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.wg_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_cd);
		p.columnDispRslt_wg_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.wg_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_nm);
		p.columnDispRslt_mng_dpt_cd.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.mng_dpt_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_cd);
		p.columnDispRslt_mng_dpt_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.mng_dpt_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_nm);
		p.DispRsltTable.addTable(p.DispRslt_par_itm_p_PPanel.ItmTable);
		p.columnDispRslt_par_itm_typ.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_typ);
		p.columnDispRslt_par_itm_typ_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_typ_nm);
		p.columnDispRslt_par_itm_typ_d_cd.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_typ_d_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_typ_d_cd);
		p.columnDispRslt_par_itm_typ_d_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_typ_d_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_typ_d_nm);
		p.columnDispRslt_par_itm_jnl_cd.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_jnl_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_jnl_cd);
		p.columnDispRslt_par_itm_jnl_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_jnl_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_jnl_nm);
		p.columnDispRslt_par_itm_grp_cd1.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_cd1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_cd1);
		p.columnDispRslt_par_itm_grp_nm1.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_nm1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_nm1);
		p.columnDispRslt_par_itm_grp_cd2.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_cd2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_cd2);
		p.columnDispRslt_par_itm_grp_nm2.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_nm2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_nm2);
		p.columnDispRslt_par_itm_grp_cd3.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_cd3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_cd3);
		p.columnDispRslt_par_itm_grp_nm3.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_nm3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_nm3);
		p.columnDispRslt_par_itm_grp_cd4.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_cd4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_cd4);
		p.columnDispRslt_par_itm_grp_nm4.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_nm4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_nm4);
		p.columnDispRslt_par_itm_grp_cd5.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_cd5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_cd5);
		p.columnDispRslt_par_itm_grp_nm5.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_nm5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_nm5);
		p.columnDispRslt_par_itm_grp_cd6.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_cd6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_cd6);
		p.columnDispRslt_par_itm_grp_nm6.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_nm6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_nm6);
		p.columnDispRslt_par_itm_grp_cd7.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_cd7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_cd7);
		p.columnDispRslt_par_itm_grp_nm7.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_nm7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_nm7);
		p.columnDispRslt_par_itm_grp_cd8.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_cd8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_cd8);
		p.columnDispRslt_par_itm_grp_nm8.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_nm8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_nm8);
		p.columnDispRslt_par_itm_grp_cd9.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_cd9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_cd9);
		p.columnDispRslt_par_itm_grp_nm9.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_nm9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_nm9);
		p.columnDispRslt_par_itm_grp_cd10.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_cd10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_cd10);
		p.columnDispRslt_par_itm_grp_nm10.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_itm_grp_nm10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_grp_nm10);
		p.columnDispRslt_par_lot_no.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_lot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_lot_no);
		p.columnDispRslt_par_sublot_no.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_sublot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_sublot_no);
		p.columnDispRslt_par_sno1.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_sno1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_sno1);
		p.columnDispRslt_par_sno2.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_sno2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_sno2);
		p.columnDispRslt_par_sno3.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_sno3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_sno3);
		p.columnDispRslt_par_sno4.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_sno4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_sno4);
		p.columnDispRslt_par_asst_typ.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_asst_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_asst_typ);
		p.columnDispRslt_par_asst_typ_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.par_asst_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_asst_typ_nm);
		p.columnDispRslt_inpt_dpt_cd.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.inpt_dpt_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_inpt_dpt_cd);
		p.columnDispRslt_inpt_dpt_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.inpt_dpt_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_inpt_dpt_nm);
		p.DispRsltTable.addTable(p.DispRslt_itm_p_PPanel.ItmTable);
		p.columnDispRslt_itm_typ.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ);
		p.columnDispRslt_itm_typ_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_nm);
		p.columnDispRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_typ_d_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_cd);
		p.columnDispRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_typ_d_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_nm);
		p.columnDispRslt_itm_jnl_cd.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_jnl_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_jnl_cd);
		p.columnDispRslt_itm_jnl_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_jnl_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_jnl_nm);
		p.columnDispRslt_itm_grp_cd1.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_cd1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd1);
		p.columnDispRslt_itm_grp_nm1.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_nm1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm1);
		p.columnDispRslt_itm_grp_cd2.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_cd2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd2);
		p.columnDispRslt_itm_grp_nm2.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_nm2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm2);
		p.columnDispRslt_itm_grp_cd3.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_cd3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd3);
		p.columnDispRslt_itm_grp_nm3.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_nm3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm3);
		p.columnDispRslt_itm_grp_cd4.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_cd4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd4);
		p.columnDispRslt_itm_grp_nm4.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_nm4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm4);
		p.columnDispRslt_itm_grp_cd5.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_cd5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd5);
		p.columnDispRslt_itm_grp_nm5.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_nm5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm5);
		p.columnDispRslt_itm_grp_cd6.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_cd6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd6);
		p.columnDispRslt_itm_grp_nm6.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_nm6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm6);
		p.columnDispRslt_itm_grp_cd7.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_cd7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd7);
		p.columnDispRslt_itm_grp_nm7.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_nm7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm7);
		p.columnDispRslt_itm_grp_cd8.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_cd8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd8);
		p.columnDispRslt_itm_grp_nm8.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_nm8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm8);
		p.columnDispRslt_itm_grp_cd9.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_cd9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd9);
		p.columnDispRslt_itm_grp_nm9.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_nm9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm9);
		p.columnDispRslt_itm_grp_cd10.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_cd10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd10);
		p.columnDispRslt_itm_grp_nm10.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.itm_grp_nm10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm10);
		p.columnDispRslt_lot_no.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.lot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_lot_no);
		p.columnDispRslt_sublot_no.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.sublot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sublot_no);
		p.columnDispRslt_sno1.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.sno1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno1);
		p.columnDispRslt_sno2.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.sno2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno2);
		p.columnDispRslt_sno3.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.sno3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno3);
		p.columnDispRslt_sno4.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.sno4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno4);
		p.columnDispRslt_asst_typ.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.asst_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_asst_typ);
		p.columnDispRslt_asst_typ_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.asst_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_asst_typ_nm);
		p.columnDispRslt_loc_cd.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.loc_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_loc_cd);
		p.columnDispRslt_loc_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.loc_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_loc_nm);
		p.columnDispRslt_str_ln_cd.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.str_ln_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_str_ln_cd);
		p.columnDispRslt_str_ln_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.str_ln_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_str_ln_nm);
		p.columnDispRslt_site_cd.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.site_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_site_cd);
		p.columnDispRslt_site_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.site_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_site_nm);
		p.columnDispRslt_oper_cd.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.oper_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_oper_cd);
		p.columnDispRslt_oper_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.oper_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_oper_nm);
		p.columnDispRslt_stk_bp_cd.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.stk_bp_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_stk_bp_cd);
		p.columnDispRslt_stk_bp_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.stk_bp_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_stk_bp_nm);
		p.columnDispRslt_expns_cd.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.expns_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_expns_cd);
		p.columnDispRslt_expns_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.expns_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_expns_nm);
		p.columnDispRslt_unit_cd.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.unit_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_unit_cd);
		p.columnDispRslt_unit_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.unit_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_unit_nm);
		p.columnDispRslt_dec_place.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.dec_place_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dec_place);
		p.columnDispRslt_elm_no.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.elm_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm_no);
		p.columnDispRslt_elm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.elm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm);
		p.columnDispRslt_elm_nm.setMeta(mcframe.clientMGBA.MGBAP0150.DispRsltR.elm_nm_META);
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
		Cnd_par_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_jnl_cd.getListConfig().setPutter(getCnd_par_itm_jnl_cd_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_par_asst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_asst_typ.getListConfig().setPutter(getCnd_par_asst_typ_ListPutter());
		Cnd_inpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_inpt_dpt_cd.getListConfig().setPutter(getCnd_inpt_dpt_cd_ListPutter());
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
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
		Cnd_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_cd.getListConfig().setPutter(getCnd_oper_cd_ListPutter());
		Cnd_stk_bp_cd.getListConfig().setPutter(getCnd_stk_bp_cd_ListPutter());
		Cnd_par_itm_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd1.getListConfig().setPutter(getCnd_par_itm_grp_cd1_ListPutter());
		Cnd_par_itm_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd2.getListConfig().setPutter(getCnd_par_itm_grp_cd2_ListPutter());
		Cnd_par_itm_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd3.getListConfig().setPutter(getCnd_par_itm_grp_cd3_ListPutter());
		Cnd_par_itm_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd4.getListConfig().setPutter(getCnd_par_itm_grp_cd4_ListPutter());
		Cnd_par_itm_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd5.getListConfig().setPutter(getCnd_par_itm_grp_cd5_ListPutter());
		Cnd_par_itm_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd6.getListConfig().setPutter(getCnd_par_itm_grp_cd6_ListPutter());
		Cnd_par_itm_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd7.getListConfig().setPutter(getCnd_par_itm_grp_cd7_ListPutter());
		Cnd_par_itm_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd8.getListConfig().setPutter(getCnd_par_itm_grp_cd8_ListPutter());
		Cnd_par_itm_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd9.getListConfig().setPutter(getCnd_par_itm_grp_cd9_ListPutter());
		Cnd_par_itm_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd10.getListConfig().setPutter(getCnd_par_itm_grp_cd10_ListPutter());
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
	 * [Cnd_par_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_par_asst_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_asst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AsstTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_inpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_inpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
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
	 * [Cnd_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
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
	 * [Cnd_stk_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp10");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_pln_calc_ctg_cd) return getCnd_pln_calc_ctg_cd(row, info);
		if(combo == Cnd_act_calc_ctg_cd) return getCnd_act_calc_ctg_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_mng_dpt_cd) return getCnd_mng_dpt_cd(row, info);
		if(combo == Cnd_par_itm_jnl_cd) return getCnd_par_itm_jnl_cd(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_cd) return getCnd_par_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub1) return getCnd_par_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub2) return getCnd_par_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub3) return getCnd_par_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_par_asst_typ) return getCnd_par_asst_typ(row, info);
		if(combo == Cnd_inpt_dpt_cd) return getCnd_inpt_dpt_cd(row, info);
		if(combo == Cnd_itm_jnl_cd) return getCnd_itm_jnl_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_asst_typ) return getCnd_asst_typ(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_oper_cd) return getCnd_oper_cd(row, info);
		if(combo == Cnd_stk_bp_cd) return getCnd_stk_bp_cd(row, info);
		if(combo == Cnd_par_itm_grp_cd1) return getCnd_par_itm_grp_cd1(row, info);
		if(combo == Cnd_par_itm_grp_cd2) return getCnd_par_itm_grp_cd2(row, info);
		if(combo == Cnd_par_itm_grp_cd3) return getCnd_par_itm_grp_cd3(row, info);
		if(combo == Cnd_par_itm_grp_cd4) return getCnd_par_itm_grp_cd4(row, info);
		if(combo == Cnd_par_itm_grp_cd5) return getCnd_par_itm_grp_cd5(row, info);
		if(combo == Cnd_par_itm_grp_cd6) return getCnd_par_itm_grp_cd6(row, info);
		if(combo == Cnd_par_itm_grp_cd7) return getCnd_par_itm_grp_cd7(row, info);
		if(combo == Cnd_par_itm_grp_cd8) return getCnd_par_itm_grp_cd8(row, info);
		if(combo == Cnd_par_itm_grp_cd9) return getCnd_par_itm_grp_cd9(row, info);
		if(combo == Cnd_par_itm_grp_cd10) return getCnd_par_itm_grp_cd10(row, info);
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
		if (vc == Cnd_par_itm_jnl_cd) return doCnd_par_itm_jnl_cd_VC(info);
		if (vc == Cnd_par_itm_jnl_nm) return doCnd_par_itm_jnl_nm_VC(info);
		if (vc == Cnd_par_lot_no) return doCnd_par_lot_no_VC(info);
		if (vc == Cnd_par_sublot_no) return doCnd_par_sublot_no_VC(info);
		if (vc == Cnd_par_sno1) return doCnd_par_sno1_VC(info);
		if (vc == Cnd_par_sno2) return doCnd_par_sno2_VC(info);
		if (vc == Cnd_par_sno3) return doCnd_par_sno3_VC(info);
		if (vc == Cnd_par_sno4) return doCnd_par_sno4_VC(info);
		if (vc == Cnd_par_asst_typ) return doCnd_par_asst_typ_VC(info);
		if (vc == Cnd_par_asst_typ_nm) return doCnd_par_asst_typ_nm_VC(info);
		if (vc == Cnd_inpt_dpt_cd) return doCnd_inpt_dpt_cd_VC(info);
		if (vc == Cnd_inpt_dpt_nm) return doCnd_inpt_dpt_nm_VC(info);
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
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_oper_cd) return doCnd_oper_cd_VC(info);
		if (vc == Cnd_oper_nm) return doCnd_oper_nm_VC(info);
		if (vc == Cnd_stk_bp_cd) return doCnd_stk_bp_cd_VC(info);
		if (vc == Cnd_stk_bp_nm) return doCnd_stk_bp_nm_VC(info);
		if (vc == Cnd_par_itm_grp_cd1) return doCnd_par_itm_grp_cd1_VC(info);
		if (vc == Cnd_par_itm_grp_nm1) return doCnd_par_itm_grp_nm1_VC(info);
		if (vc == Cnd_par_itm_grp_cd2) return doCnd_par_itm_grp_cd2_VC(info);
		if (vc == Cnd_par_itm_grp_nm2) return doCnd_par_itm_grp_nm2_VC(info);
		if (vc == Cnd_par_itm_grp_cd3) return doCnd_par_itm_grp_cd3_VC(info);
		if (vc == Cnd_par_itm_grp_nm3) return doCnd_par_itm_grp_nm3_VC(info);
		if (vc == Cnd_par_itm_grp_cd4) return doCnd_par_itm_grp_cd4_VC(info);
		if (vc == Cnd_par_itm_grp_nm4) return doCnd_par_itm_grp_nm4_VC(info);
		if (vc == Cnd_par_itm_grp_cd5) return doCnd_par_itm_grp_cd5_VC(info);
		if (vc == Cnd_par_itm_grp_nm5) return doCnd_par_itm_grp_nm5_VC(info);
		if (vc == Cnd_par_itm_grp_cd6) return doCnd_par_itm_grp_cd6_VC(info);
		if (vc == Cnd_par_itm_grp_nm6) return doCnd_par_itm_grp_nm6_VC(info);
		if (vc == Cnd_par_itm_grp_cd7) return doCnd_par_itm_grp_cd7_VC(info);
		if (vc == Cnd_par_itm_grp_nm7) return doCnd_par_itm_grp_nm7_VC(info);
		if (vc == Cnd_par_itm_grp_cd8) return doCnd_par_itm_grp_cd8_VC(info);
		if (vc == Cnd_par_itm_grp_nm8) return doCnd_par_itm_grp_nm8_VC(info);
		if (vc == Cnd_par_itm_grp_cd9) return doCnd_par_itm_grp_cd9_VC(info);
		if (vc == Cnd_par_itm_grp_nm9) return doCnd_par_itm_grp_nm9_VC(info);
		if (vc == Cnd_par_itm_grp_cd10) return doCnd_par_itm_grp_cd10_VC(info);
		if (vc == Cnd_par_itm_grp_nm10) return doCnd_par_itm_grp_nm10_VC(info);
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
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_mng_dpt_flg) return doCnd_mng_dpt_flg_VC(info);
		if (vc == Cnd_par_itm_flg) return doCnd_par_itm_flg_VC(info);
		if (vc == Cnd_par_itm_typ_flg) return doCnd_par_itm_typ_flg_VC(info);
		if (vc == Cnd_par_itm_typ_d_flg) return doCnd_par_itm_typ_d_flg_VC(info);
		if (vc == Cnd_par_itm_jnl_flg) return doCnd_par_itm_jnl_flg_VC(info);
		if (vc == Cnd_par_lot_flg) return doCnd_par_lot_flg_VC(info);
		if (vc == Cnd_par_sublot_flg) return doCnd_par_sublot_flg_VC(info);
		if (vc == Cnd_par_sno1_flg) return doCnd_par_sno1_flg_VC(info);
		if (vc == Cnd_par_sno2_flg) return doCnd_par_sno2_flg_VC(info);
		if (vc == Cnd_par_sno3_flg) return doCnd_par_sno3_flg_VC(info);
		if (vc == Cnd_par_sno4_flg) return doCnd_par_sno4_flg_VC(info);
		if (vc == Cnd_par_asst_flg) return doCnd_par_asst_flg_VC(info);
		if (vc == Cnd_inpt_dpt_flg) return doCnd_inpt_dpt_flg_VC(info);
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
		if (vc == Cnd_asst_flg) return doCnd_asst_flg_VC(info);
		if (vc == Cnd_loc_flg) return doCnd_loc_flg_VC(info);
		if (vc == Cnd_str_ln_flg) return doCnd_str_ln_flg_VC(info);
		if (vc == Cnd_site_flg) return doCnd_site_flg_VC(info);
		if (vc == Cnd_oper_flg) return doCnd_oper_flg_VC(info);
		if (vc == Cnd_stk_bp_flg) return doCnd_stk_bp_flg_VC(info);
		if (vc == Cnd_expns_flg) return doCnd_expns_flg_VC(info);
		if (vc == Cnd_par_itm_grp_flg1) return doCnd_par_itm_grp_flg1_VC(info);
		if (vc == Cnd_par_itm_grp_flg2) return doCnd_par_itm_grp_flg2_VC(info);
		if (vc == Cnd_par_itm_grp_flg3) return doCnd_par_itm_grp_flg3_VC(info);
		if (vc == Cnd_par_itm_grp_flg4) return doCnd_par_itm_grp_flg4_VC(info);
		if (vc == Cnd_par_itm_grp_flg5) return doCnd_par_itm_grp_flg5_VC(info);
		if (vc == Cnd_par_itm_grp_flg6) return doCnd_par_itm_grp_flg6_VC(info);
		if (vc == Cnd_par_itm_grp_flg7) return doCnd_par_itm_grp_flg7_VC(info);
		if (vc == Cnd_par_itm_grp_flg8) return doCnd_par_itm_grp_flg8_VC(info);
		if (vc == Cnd_par_itm_grp_flg9) return doCnd_par_itm_grp_flg9_VC(info);
		if (vc == Cnd_par_itm_grp_flg10) return doCnd_par_itm_grp_flg10_VC(info);
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
		if (vc == Cnd_disp_key) return doCnd_disp_key_VC(info);
		if (vc == columnDispRslt_wg_cd) return doDispRslt_wg_cd_VC(info);
		if (vc == columnDispRslt_wg_nm) return doDispRslt_wg_nm_VC(info);
		if (vc == columnDispRslt_mng_dpt_cd) return doDispRslt_mng_dpt_cd_VC(info);
		if (vc == columnDispRslt_mng_dpt_nm) return doDispRslt_mng_dpt_nm_VC(info);
		if (vc == columnDispRslt_par_itm_typ) return doDispRslt_par_itm_typ_VC(info);
		if (vc == columnDispRslt_par_itm_typ_nm) return doDispRslt_par_itm_typ_nm_VC(info);
		if (vc == columnDispRslt_par_itm_typ_d_cd) return doDispRslt_par_itm_typ_d_cd_VC(info);
		if (vc == columnDispRslt_par_itm_typ_d_nm) return doDispRslt_par_itm_typ_d_nm_VC(info);
		if (vc == columnDispRslt_par_itm_jnl_cd) return doDispRslt_par_itm_jnl_cd_VC(info);
		if (vc == columnDispRslt_par_itm_jnl_nm) return doDispRslt_par_itm_jnl_nm_VC(info);
		if (vc == columnDispRslt_par_itm_grp_cd1) return doDispRslt_par_itm_grp_cd1_VC(info);
		if (vc == columnDispRslt_par_itm_grp_nm1) return doDispRslt_par_itm_grp_nm1_VC(info);
		if (vc == columnDispRslt_par_itm_grp_cd2) return doDispRslt_par_itm_grp_cd2_VC(info);
		if (vc == columnDispRslt_par_itm_grp_nm2) return doDispRslt_par_itm_grp_nm2_VC(info);
		if (vc == columnDispRslt_par_itm_grp_cd3) return doDispRslt_par_itm_grp_cd3_VC(info);
		if (vc == columnDispRslt_par_itm_grp_nm3) return doDispRslt_par_itm_grp_nm3_VC(info);
		if (vc == columnDispRslt_par_itm_grp_cd4) return doDispRslt_par_itm_grp_cd4_VC(info);
		if (vc == columnDispRslt_par_itm_grp_nm4) return doDispRslt_par_itm_grp_nm4_VC(info);
		if (vc == columnDispRslt_par_itm_grp_cd5) return doDispRslt_par_itm_grp_cd5_VC(info);
		if (vc == columnDispRslt_par_itm_grp_nm5) return doDispRslt_par_itm_grp_nm5_VC(info);
		if (vc == columnDispRslt_par_itm_grp_cd6) return doDispRslt_par_itm_grp_cd6_VC(info);
		if (vc == columnDispRslt_par_itm_grp_nm6) return doDispRslt_par_itm_grp_nm6_VC(info);
		if (vc == columnDispRslt_par_itm_grp_cd7) return doDispRslt_par_itm_grp_cd7_VC(info);
		if (vc == columnDispRslt_par_itm_grp_nm7) return doDispRslt_par_itm_grp_nm7_VC(info);
		if (vc == columnDispRslt_par_itm_grp_cd8) return doDispRslt_par_itm_grp_cd8_VC(info);
		if (vc == columnDispRslt_par_itm_grp_nm8) return doDispRslt_par_itm_grp_nm8_VC(info);
		if (vc == columnDispRslt_par_itm_grp_cd9) return doDispRslt_par_itm_grp_cd9_VC(info);
		if (vc == columnDispRslt_par_itm_grp_nm9) return doDispRslt_par_itm_grp_nm9_VC(info);
		if (vc == columnDispRslt_par_itm_grp_cd10) return doDispRslt_par_itm_grp_cd10_VC(info);
		if (vc == columnDispRslt_par_itm_grp_nm10) return doDispRslt_par_itm_grp_nm10_VC(info);
		if (vc == columnDispRslt_par_lot_no) return doDispRslt_par_lot_no_VC(info);
		if (vc == columnDispRslt_par_sublot_no) return doDispRslt_par_sublot_no_VC(info);
		if (vc == columnDispRslt_par_sno1) return doDispRslt_par_sno1_VC(info);
		if (vc == columnDispRslt_par_sno2) return doDispRslt_par_sno2_VC(info);
		if (vc == columnDispRslt_par_sno3) return doDispRslt_par_sno3_VC(info);
		if (vc == columnDispRslt_par_sno4) return doDispRslt_par_sno4_VC(info);
		if (vc == columnDispRslt_par_asst_typ) return doDispRslt_par_asst_typ_VC(info);
		if (vc == columnDispRslt_par_asst_typ_nm) return doDispRslt_par_asst_typ_nm_VC(info);
		if (vc == columnDispRslt_inpt_dpt_cd) return doDispRslt_inpt_dpt_cd_VC(info);
		if (vc == columnDispRslt_inpt_dpt_nm) return doDispRslt_inpt_dpt_nm_VC(info);
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
		if (vc == columnDispRslt_asst_typ) return doDispRslt_asst_typ_VC(info);
		if (vc == columnDispRslt_asst_typ_nm) return doDispRslt_asst_typ_nm_VC(info);
		if (vc == columnDispRslt_loc_cd) return doDispRslt_loc_cd_VC(info);
		if (vc == columnDispRslt_loc_nm) return doDispRslt_loc_nm_VC(info);
		if (vc == columnDispRslt_str_ln_cd) return doDispRslt_str_ln_cd_VC(info);
		if (vc == columnDispRslt_str_ln_nm) return doDispRslt_str_ln_nm_VC(info);
		if (vc == columnDispRslt_site_cd) return doDispRslt_site_cd_VC(info);
		if (vc == columnDispRslt_site_nm) return doDispRslt_site_nm_VC(info);
		if (vc == columnDispRslt_oper_cd) return doDispRslt_oper_cd_VC(info);
		if (vc == columnDispRslt_oper_nm) return doDispRslt_oper_nm_VC(info);
		if (vc == columnDispRslt_stk_bp_cd) return doDispRslt_stk_bp_cd_VC(info);
		if (vc == columnDispRslt_stk_bp_nm) return doDispRslt_stk_bp_nm_VC(info);
		if (vc == columnDispRslt_expns_cd) return doDispRslt_expns_cd_VC(info);
		if (vc == columnDispRslt_expns_nm) return doDispRslt_expns_nm_VC(info);
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
	 * [Cnd]パネルの[par_itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_site_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_str_ln_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm10_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[par_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_typ_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_typ_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_typ_d_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_typ_d_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_jnl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_jnl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_lot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_lot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_sublot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_sublot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_sno1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_sno1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_sno2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_sno2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_sno3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_sno3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_sno4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_sno4_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_asst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_asst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_dpt_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asst_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_str_ln_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[site_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_site_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_bp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[expns_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_expns_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_flg1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_flg2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_flg3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_flg4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_flg5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_flg6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_flg7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_flg8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_flg9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_flg10_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[par_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_itm_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[par_asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_par_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[inpt_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_inpt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[inpt_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_inpt_dpt_nm_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_site_nm_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_stk_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_expns_nm_VC(MCEventInfo info){
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
		else if (nc == Cnd_par_itm_jnl_cd) doCnd_par_itm_jnl_cd_NC(info);
		else if (nc == Cnd_par_itm_jnl_nm) doCnd_par_itm_jnl_nm_NC(info);
		else if (nc == Cnd_par_lot_no) doCnd_par_lot_no_NC(info);
		else if (nc == Cnd_par_sublot_no) doCnd_par_sublot_no_NC(info);
		else if (nc == Cnd_par_sno1) doCnd_par_sno1_NC(info);
		else if (nc == Cnd_par_sno2) doCnd_par_sno2_NC(info);
		else if (nc == Cnd_par_sno3) doCnd_par_sno3_NC(info);
		else if (nc == Cnd_par_sno4) doCnd_par_sno4_NC(info);
		else if (nc == Cnd_par_asst_typ) doCnd_par_asst_typ_NC(info);
		else if (nc == Cnd_par_asst_typ_nm) doCnd_par_asst_typ_nm_NC(info);
		else if (nc == Cnd_inpt_dpt_cd) doCnd_inpt_dpt_cd_NC(info);
		else if (nc == Cnd_inpt_dpt_nm) doCnd_inpt_dpt_nm_NC(info);
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
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_oper_cd) doCnd_oper_cd_NC(info);
		else if (nc == Cnd_oper_nm) doCnd_oper_nm_NC(info);
		else if (nc == Cnd_stk_bp_cd) doCnd_stk_bp_cd_NC(info);
		else if (nc == Cnd_stk_bp_nm) doCnd_stk_bp_nm_NC(info);
		else if (nc == Cnd_par_itm_grp_cd1) doCnd_par_itm_grp_cd1_NC(info);
		else if (nc == Cnd_par_itm_grp_nm1) doCnd_par_itm_grp_nm1_NC(info);
		else if (nc == Cnd_par_itm_grp_cd2) doCnd_par_itm_grp_cd2_NC(info);
		else if (nc == Cnd_par_itm_grp_nm2) doCnd_par_itm_grp_nm2_NC(info);
		else if (nc == Cnd_par_itm_grp_cd3) doCnd_par_itm_grp_cd3_NC(info);
		else if (nc == Cnd_par_itm_grp_nm3) doCnd_par_itm_grp_nm3_NC(info);
		else if (nc == Cnd_par_itm_grp_cd4) doCnd_par_itm_grp_cd4_NC(info);
		else if (nc == Cnd_par_itm_grp_nm4) doCnd_par_itm_grp_nm4_NC(info);
		else if (nc == Cnd_par_itm_grp_cd5) doCnd_par_itm_grp_cd5_NC(info);
		else if (nc == Cnd_par_itm_grp_nm5) doCnd_par_itm_grp_nm5_NC(info);
		else if (nc == Cnd_par_itm_grp_cd6) doCnd_par_itm_grp_cd6_NC(info);
		else if (nc == Cnd_par_itm_grp_nm6) doCnd_par_itm_grp_nm6_NC(info);
		else if (nc == Cnd_par_itm_grp_cd7) doCnd_par_itm_grp_cd7_NC(info);
		else if (nc == Cnd_par_itm_grp_nm7) doCnd_par_itm_grp_nm7_NC(info);
		else if (nc == Cnd_par_itm_grp_cd8) doCnd_par_itm_grp_cd8_NC(info);
		else if (nc == Cnd_par_itm_grp_nm8) doCnd_par_itm_grp_nm8_NC(info);
		else if (nc == Cnd_par_itm_grp_cd9) doCnd_par_itm_grp_cd9_NC(info);
		else if (nc == Cnd_par_itm_grp_nm9) doCnd_par_itm_grp_nm9_NC(info);
		else if (nc == Cnd_par_itm_grp_cd10) doCnd_par_itm_grp_cd10_NC(info);
		else if (nc == Cnd_par_itm_grp_nm10) doCnd_par_itm_grp_nm10_NC(info);
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
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_mng_dpt_flg) doCnd_mng_dpt_flg_NC(info);
		else if (nc == Cnd_par_itm_flg) doCnd_par_itm_flg_NC(info);
		else if (nc == Cnd_par_itm_typ_flg) doCnd_par_itm_typ_flg_NC(info);
		else if (nc == Cnd_par_itm_typ_d_flg) doCnd_par_itm_typ_d_flg_NC(info);
		else if (nc == Cnd_par_itm_jnl_flg) doCnd_par_itm_jnl_flg_NC(info);
		else if (nc == Cnd_par_lot_flg) doCnd_par_lot_flg_NC(info);
		else if (nc == Cnd_par_sublot_flg) doCnd_par_sublot_flg_NC(info);
		else if (nc == Cnd_par_sno1_flg) doCnd_par_sno1_flg_NC(info);
		else if (nc == Cnd_par_sno2_flg) doCnd_par_sno2_flg_NC(info);
		else if (nc == Cnd_par_sno3_flg) doCnd_par_sno3_flg_NC(info);
		else if (nc == Cnd_par_sno4_flg) doCnd_par_sno4_flg_NC(info);
		else if (nc == Cnd_par_asst_flg) doCnd_par_asst_flg_NC(info);
		else if (nc == Cnd_inpt_dpt_flg) doCnd_inpt_dpt_flg_NC(info);
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
		else if (nc == Cnd_asst_flg) doCnd_asst_flg_NC(info);
		else if (nc == Cnd_loc_flg) doCnd_loc_flg_NC(info);
		else if (nc == Cnd_str_ln_flg) doCnd_str_ln_flg_NC(info);
		else if (nc == Cnd_site_flg) doCnd_site_flg_NC(info);
		else if (nc == Cnd_oper_flg) doCnd_oper_flg_NC(info);
		else if (nc == Cnd_stk_bp_flg) doCnd_stk_bp_flg_NC(info);
		else if (nc == Cnd_expns_flg) doCnd_expns_flg_NC(info);
		else if (nc == Cnd_par_itm_grp_flg1) doCnd_par_itm_grp_flg1_NC(info);
		else if (nc == Cnd_par_itm_grp_flg2) doCnd_par_itm_grp_flg2_NC(info);
		else if (nc == Cnd_par_itm_grp_flg3) doCnd_par_itm_grp_flg3_NC(info);
		else if (nc == Cnd_par_itm_grp_flg4) doCnd_par_itm_grp_flg4_NC(info);
		else if (nc == Cnd_par_itm_grp_flg5) doCnd_par_itm_grp_flg5_NC(info);
		else if (nc == Cnd_par_itm_grp_flg6) doCnd_par_itm_grp_flg6_NC(info);
		else if (nc == Cnd_par_itm_grp_flg7) doCnd_par_itm_grp_flg7_NC(info);
		else if (nc == Cnd_par_itm_grp_flg8) doCnd_par_itm_grp_flg8_NC(info);
		else if (nc == Cnd_par_itm_grp_flg9) doCnd_par_itm_grp_flg9_NC(info);
		else if (nc == Cnd_par_itm_grp_flg10) doCnd_par_itm_grp_flg10_NC(info);
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
		else if (nc == Cnd_disp_key) doCnd_disp_key_NC(info);
		else if (nc == columnDispRslt_wg_cd) doDispRslt_wg_cd_NC(info);
		else if (nc == columnDispRslt_wg_nm) doDispRslt_wg_nm_NC(info);
		else if (nc == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_NC(info);
		else if (nc == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_NC(info);
		else if (nc == columnDispRslt_par_itm_typ) doDispRslt_par_itm_typ_NC(info);
		else if (nc == columnDispRslt_par_itm_typ_nm) doDispRslt_par_itm_typ_nm_NC(info);
		else if (nc == columnDispRslt_par_itm_typ_d_cd) doDispRslt_par_itm_typ_d_cd_NC(info);
		else if (nc == columnDispRslt_par_itm_typ_d_nm) doDispRslt_par_itm_typ_d_nm_NC(info);
		else if (nc == columnDispRslt_par_itm_jnl_cd) doDispRslt_par_itm_jnl_cd_NC(info);
		else if (nc == columnDispRslt_par_itm_jnl_nm) doDispRslt_par_itm_jnl_nm_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_cd1) doDispRslt_par_itm_grp_cd1_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_nm1) doDispRslt_par_itm_grp_nm1_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_cd2) doDispRslt_par_itm_grp_cd2_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_nm2) doDispRslt_par_itm_grp_nm2_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_cd3) doDispRslt_par_itm_grp_cd3_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_nm3) doDispRslt_par_itm_grp_nm3_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_cd4) doDispRslt_par_itm_grp_cd4_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_nm4) doDispRslt_par_itm_grp_nm4_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_cd5) doDispRslt_par_itm_grp_cd5_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_nm5) doDispRslt_par_itm_grp_nm5_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_cd6) doDispRslt_par_itm_grp_cd6_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_nm6) doDispRslt_par_itm_grp_nm6_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_cd7) doDispRslt_par_itm_grp_cd7_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_nm7) doDispRslt_par_itm_grp_nm7_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_cd8) doDispRslt_par_itm_grp_cd8_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_nm8) doDispRslt_par_itm_grp_nm8_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_cd9) doDispRslt_par_itm_grp_cd9_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_nm9) doDispRslt_par_itm_grp_nm9_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_cd10) doDispRslt_par_itm_grp_cd10_NC(info);
		else if (nc == columnDispRslt_par_itm_grp_nm10) doDispRslt_par_itm_grp_nm10_NC(info);
		else if (nc == columnDispRslt_par_lot_no) doDispRslt_par_lot_no_NC(info);
		else if (nc == columnDispRslt_par_sublot_no) doDispRslt_par_sublot_no_NC(info);
		else if (nc == columnDispRslt_par_sno1) doDispRslt_par_sno1_NC(info);
		else if (nc == columnDispRslt_par_sno2) doDispRslt_par_sno2_NC(info);
		else if (nc == columnDispRslt_par_sno3) doDispRslt_par_sno3_NC(info);
		else if (nc == columnDispRslt_par_sno4) doDispRslt_par_sno4_NC(info);
		else if (nc == columnDispRslt_par_asst_typ) doDispRslt_par_asst_typ_NC(info);
		else if (nc == columnDispRslt_par_asst_typ_nm) doDispRslt_par_asst_typ_nm_NC(info);
		else if (nc == columnDispRslt_inpt_dpt_cd) doDispRslt_inpt_dpt_cd_NC(info);
		else if (nc == columnDispRslt_inpt_dpt_nm) doDispRslt_inpt_dpt_nm_NC(info);
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
		else if (nc == columnDispRslt_asst_typ) doDispRslt_asst_typ_NC(info);
		else if (nc == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NC(info);
		else if (nc == columnDispRslt_loc_cd) doDispRslt_loc_cd_NC(info);
		else if (nc == columnDispRslt_loc_nm) doDispRslt_loc_nm_NC(info);
		else if (nc == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_NC(info);
		else if (nc == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_NC(info);
		else if (nc == columnDispRslt_site_cd) doDispRslt_site_cd_NC(info);
		else if (nc == columnDispRslt_site_nm) doDispRslt_site_nm_NC(info);
		else if (nc == columnDispRslt_oper_cd) doDispRslt_oper_cd_NC(info);
		else if (nc == columnDispRslt_oper_nm) doDispRslt_oper_nm_NC(info);
		else if (nc == columnDispRslt_stk_bp_cd) doDispRslt_stk_bp_cd_NC(info);
		else if (nc == columnDispRslt_stk_bp_nm) doDispRslt_stk_bp_nm_NC(info);
		else if (nc == columnDispRslt_expns_cd) doDispRslt_expns_cd_NC(info);
		else if (nc == columnDispRslt_expns_nm) doDispRslt_expns_nm_NC(info);
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
	 * [Cnd]パネルの[par_itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm10_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[par_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_typ_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_typ_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_typ_d_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_typ_d_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_jnl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_lot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_lot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sublot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sublot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno4_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_asst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_asst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_dpt_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg10_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[par_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno1_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno2_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno3_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno4_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[inpt_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_inpt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[inpt_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_inpt_dpt_nm_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_nm_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_stk_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_expns_nm_NC(MCEventInfo info){
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
		else if (ne == Cnd_par_itm_jnl_cd) doCnd_par_itm_jnl_cd_NE(info);
		else if (ne == Cnd_par_itm_jnl_nm) doCnd_par_itm_jnl_nm_NE(info);
		else if (ne == Cnd_par_lot_no) doCnd_par_lot_no_NE(info);
		else if (ne == Cnd_par_sublot_no) doCnd_par_sublot_no_NE(info);
		else if (ne == Cnd_par_sno1) doCnd_par_sno1_NE(info);
		else if (ne == Cnd_par_sno2) doCnd_par_sno2_NE(info);
		else if (ne == Cnd_par_sno3) doCnd_par_sno3_NE(info);
		else if (ne == Cnd_par_sno4) doCnd_par_sno4_NE(info);
		else if (ne == Cnd_par_asst_typ) doCnd_par_asst_typ_NE(info);
		else if (ne == Cnd_par_asst_typ_nm) doCnd_par_asst_typ_nm_NE(info);
		else if (ne == Cnd_inpt_dpt_cd) doCnd_inpt_dpt_cd_NE(info);
		else if (ne == Cnd_inpt_dpt_nm) doCnd_inpt_dpt_nm_NE(info);
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
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_oper_cd) doCnd_oper_cd_NE(info);
		else if (ne == Cnd_oper_nm) doCnd_oper_nm_NE(info);
		else if (ne == Cnd_stk_bp_cd) doCnd_stk_bp_cd_NE(info);
		else if (ne == Cnd_stk_bp_nm) doCnd_stk_bp_nm_NE(info);
		else if (ne == Cnd_par_itm_grp_cd1) doCnd_par_itm_grp_cd1_NE(info);
		else if (ne == Cnd_par_itm_grp_nm1) doCnd_par_itm_grp_nm1_NE(info);
		else if (ne == Cnd_par_itm_grp_cd2) doCnd_par_itm_grp_cd2_NE(info);
		else if (ne == Cnd_par_itm_grp_nm2) doCnd_par_itm_grp_nm2_NE(info);
		else if (ne == Cnd_par_itm_grp_cd3) doCnd_par_itm_grp_cd3_NE(info);
		else if (ne == Cnd_par_itm_grp_nm3) doCnd_par_itm_grp_nm3_NE(info);
		else if (ne == Cnd_par_itm_grp_cd4) doCnd_par_itm_grp_cd4_NE(info);
		else if (ne == Cnd_par_itm_grp_nm4) doCnd_par_itm_grp_nm4_NE(info);
		else if (ne == Cnd_par_itm_grp_cd5) doCnd_par_itm_grp_cd5_NE(info);
		else if (ne == Cnd_par_itm_grp_nm5) doCnd_par_itm_grp_nm5_NE(info);
		else if (ne == Cnd_par_itm_grp_cd6) doCnd_par_itm_grp_cd6_NE(info);
		else if (ne == Cnd_par_itm_grp_nm6) doCnd_par_itm_grp_nm6_NE(info);
		else if (ne == Cnd_par_itm_grp_cd7) doCnd_par_itm_grp_cd7_NE(info);
		else if (ne == Cnd_par_itm_grp_nm7) doCnd_par_itm_grp_nm7_NE(info);
		else if (ne == Cnd_par_itm_grp_cd8) doCnd_par_itm_grp_cd8_NE(info);
		else if (ne == Cnd_par_itm_grp_nm8) doCnd_par_itm_grp_nm8_NE(info);
		else if (ne == Cnd_par_itm_grp_cd9) doCnd_par_itm_grp_cd9_NE(info);
		else if (ne == Cnd_par_itm_grp_nm9) doCnd_par_itm_grp_nm9_NE(info);
		else if (ne == Cnd_par_itm_grp_cd10) doCnd_par_itm_grp_cd10_NE(info);
		else if (ne == Cnd_par_itm_grp_nm10) doCnd_par_itm_grp_nm10_NE(info);
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
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_mng_dpt_flg) doCnd_mng_dpt_flg_NE(info);
		else if (ne == Cnd_par_itm_flg) doCnd_par_itm_flg_NE(info);
		else if (ne == Cnd_par_itm_typ_flg) doCnd_par_itm_typ_flg_NE(info);
		else if (ne == Cnd_par_itm_typ_d_flg) doCnd_par_itm_typ_d_flg_NE(info);
		else if (ne == Cnd_par_itm_jnl_flg) doCnd_par_itm_jnl_flg_NE(info);
		else if (ne == Cnd_par_lot_flg) doCnd_par_lot_flg_NE(info);
		else if (ne == Cnd_par_sublot_flg) doCnd_par_sublot_flg_NE(info);
		else if (ne == Cnd_par_sno1_flg) doCnd_par_sno1_flg_NE(info);
		else if (ne == Cnd_par_sno2_flg) doCnd_par_sno2_flg_NE(info);
		else if (ne == Cnd_par_sno3_flg) doCnd_par_sno3_flg_NE(info);
		else if (ne == Cnd_par_sno4_flg) doCnd_par_sno4_flg_NE(info);
		else if (ne == Cnd_par_asst_flg) doCnd_par_asst_flg_NE(info);
		else if (ne == Cnd_inpt_dpt_flg) doCnd_inpt_dpt_flg_NE(info);
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
		else if (ne == Cnd_asst_flg) doCnd_asst_flg_NE(info);
		else if (ne == Cnd_loc_flg) doCnd_loc_flg_NE(info);
		else if (ne == Cnd_str_ln_flg) doCnd_str_ln_flg_NE(info);
		else if (ne == Cnd_site_flg) doCnd_site_flg_NE(info);
		else if (ne == Cnd_oper_flg) doCnd_oper_flg_NE(info);
		else if (ne == Cnd_stk_bp_flg) doCnd_stk_bp_flg_NE(info);
		else if (ne == Cnd_expns_flg) doCnd_expns_flg_NE(info);
		else if (ne == Cnd_par_itm_grp_flg1) doCnd_par_itm_grp_flg1_NE(info);
		else if (ne == Cnd_par_itm_grp_flg2) doCnd_par_itm_grp_flg2_NE(info);
		else if (ne == Cnd_par_itm_grp_flg3) doCnd_par_itm_grp_flg3_NE(info);
		else if (ne == Cnd_par_itm_grp_flg4) doCnd_par_itm_grp_flg4_NE(info);
		else if (ne == Cnd_par_itm_grp_flg5) doCnd_par_itm_grp_flg5_NE(info);
		else if (ne == Cnd_par_itm_grp_flg6) doCnd_par_itm_grp_flg6_NE(info);
		else if (ne == Cnd_par_itm_grp_flg7) doCnd_par_itm_grp_flg7_NE(info);
		else if (ne == Cnd_par_itm_grp_flg8) doCnd_par_itm_grp_flg8_NE(info);
		else if (ne == Cnd_par_itm_grp_flg9) doCnd_par_itm_grp_flg9_NE(info);
		else if (ne == Cnd_par_itm_grp_flg10) doCnd_par_itm_grp_flg10_NE(info);
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
		else if (ne == Cnd_disp_key) doCnd_disp_key_NE(info);
		else if (ne == columnDispRslt_wg_cd) doDispRslt_wg_cd_NE(info);
		else if (ne == columnDispRslt_wg_nm) doDispRslt_wg_nm_NE(info);
		else if (ne == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_NE(info);
		else if (ne == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_NE(info);
		else if (ne == columnDispRslt_par_itm_typ) doDispRslt_par_itm_typ_NE(info);
		else if (ne == columnDispRslt_par_itm_typ_nm) doDispRslt_par_itm_typ_nm_NE(info);
		else if (ne == columnDispRslt_par_itm_typ_d_cd) doDispRslt_par_itm_typ_d_cd_NE(info);
		else if (ne == columnDispRslt_par_itm_typ_d_nm) doDispRslt_par_itm_typ_d_nm_NE(info);
		else if (ne == columnDispRslt_par_itm_jnl_cd) doDispRslt_par_itm_jnl_cd_NE(info);
		else if (ne == columnDispRslt_par_itm_jnl_nm) doDispRslt_par_itm_jnl_nm_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_cd1) doDispRslt_par_itm_grp_cd1_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_nm1) doDispRslt_par_itm_grp_nm1_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_cd2) doDispRslt_par_itm_grp_cd2_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_nm2) doDispRslt_par_itm_grp_nm2_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_cd3) doDispRslt_par_itm_grp_cd3_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_nm3) doDispRslt_par_itm_grp_nm3_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_cd4) doDispRslt_par_itm_grp_cd4_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_nm4) doDispRslt_par_itm_grp_nm4_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_cd5) doDispRslt_par_itm_grp_cd5_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_nm5) doDispRslt_par_itm_grp_nm5_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_cd6) doDispRslt_par_itm_grp_cd6_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_nm6) doDispRslt_par_itm_grp_nm6_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_cd7) doDispRslt_par_itm_grp_cd7_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_nm7) doDispRslt_par_itm_grp_nm7_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_cd8) doDispRslt_par_itm_grp_cd8_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_nm8) doDispRslt_par_itm_grp_nm8_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_cd9) doDispRslt_par_itm_grp_cd9_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_nm9) doDispRslt_par_itm_grp_nm9_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_cd10) doDispRslt_par_itm_grp_cd10_NE(info);
		else if (ne == columnDispRslt_par_itm_grp_nm10) doDispRslt_par_itm_grp_nm10_NE(info);
		else if (ne == columnDispRslt_par_lot_no) doDispRslt_par_lot_no_NE(info);
		else if (ne == columnDispRslt_par_sublot_no) doDispRslt_par_sublot_no_NE(info);
		else if (ne == columnDispRslt_par_sno1) doDispRslt_par_sno1_NE(info);
		else if (ne == columnDispRslt_par_sno2) doDispRslt_par_sno2_NE(info);
		else if (ne == columnDispRslt_par_sno3) doDispRslt_par_sno3_NE(info);
		else if (ne == columnDispRslt_par_sno4) doDispRslt_par_sno4_NE(info);
		else if (ne == columnDispRslt_par_asst_typ) doDispRslt_par_asst_typ_NE(info);
		else if (ne == columnDispRslt_par_asst_typ_nm) doDispRslt_par_asst_typ_nm_NE(info);
		else if (ne == columnDispRslt_inpt_dpt_cd) doDispRslt_inpt_dpt_cd_NE(info);
		else if (ne == columnDispRslt_inpt_dpt_nm) doDispRslt_inpt_dpt_nm_NE(info);
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
		else if (ne == columnDispRslt_asst_typ) doDispRslt_asst_typ_NE(info);
		else if (ne == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NE(info);
		else if (ne == columnDispRslt_loc_cd) doDispRslt_loc_cd_NE(info);
		else if (ne == columnDispRslt_loc_nm) doDispRslt_loc_nm_NE(info);
		else if (ne == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_NE(info);
		else if (ne == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_NE(info);
		else if (ne == columnDispRslt_site_cd) doDispRslt_site_cd_NE(info);
		else if (ne == columnDispRslt_site_nm) doDispRslt_site_nm_NE(info);
		else if (ne == columnDispRslt_oper_cd) doDispRslt_oper_cd_NE(info);
		else if (ne == columnDispRslt_oper_nm) doDispRslt_oper_nm_NE(info);
		else if (ne == columnDispRslt_stk_bp_cd) doDispRslt_stk_bp_cd_NE(info);
		else if (ne == columnDispRslt_stk_bp_nm) doDispRslt_stk_bp_nm_NE(info);
		else if (ne == columnDispRslt_expns_cd) doDispRslt_expns_cd_NE(info);
		else if (ne == columnDispRslt_expns_nm) doDispRslt_expns_nm_NE(info);
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
	 * [Cnd]パネルの[par_itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm10_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[par_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_typ_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_typ_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_typ_d_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_typ_d_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_jnl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_lot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_lot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sublot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sublot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno4_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_asst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_asst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_dpt_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg10_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[par_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno1_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno2_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno3_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno4_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[inpt_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_inpt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[inpt_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_inpt_dpt_nm_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_nm_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_stk_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_expns_nm_NE(MCEventInfo info){
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
		else if (nx == Cnd_par_itm_jnl_cd) doCnd_par_itm_jnl_cd_NX(info);
		else if (nx == Cnd_par_itm_jnl_nm) doCnd_par_itm_jnl_nm_NX(info);
		else if (nx == Cnd_par_lot_no) doCnd_par_lot_no_NX(info);
		else if (nx == Cnd_par_sublot_no) doCnd_par_sublot_no_NX(info);
		else if (nx == Cnd_par_sno1) doCnd_par_sno1_NX(info);
		else if (nx == Cnd_par_sno2) doCnd_par_sno2_NX(info);
		else if (nx == Cnd_par_sno3) doCnd_par_sno3_NX(info);
		else if (nx == Cnd_par_sno4) doCnd_par_sno4_NX(info);
		else if (nx == Cnd_par_asst_typ) doCnd_par_asst_typ_NX(info);
		else if (nx == Cnd_par_asst_typ_nm) doCnd_par_asst_typ_nm_NX(info);
		else if (nx == Cnd_inpt_dpt_cd) doCnd_inpt_dpt_cd_NX(info);
		else if (nx == Cnd_inpt_dpt_nm) doCnd_inpt_dpt_nm_NX(info);
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
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_oper_cd) doCnd_oper_cd_NX(info);
		else if (nx == Cnd_oper_nm) doCnd_oper_nm_NX(info);
		else if (nx == Cnd_stk_bp_cd) doCnd_stk_bp_cd_NX(info);
		else if (nx == Cnd_stk_bp_nm) doCnd_stk_bp_nm_NX(info);
		else if (nx == Cnd_par_itm_grp_cd1) doCnd_par_itm_grp_cd1_NX(info);
		else if (nx == Cnd_par_itm_grp_nm1) doCnd_par_itm_grp_nm1_NX(info);
		else if (nx == Cnd_par_itm_grp_cd2) doCnd_par_itm_grp_cd2_NX(info);
		else if (nx == Cnd_par_itm_grp_nm2) doCnd_par_itm_grp_nm2_NX(info);
		else if (nx == Cnd_par_itm_grp_cd3) doCnd_par_itm_grp_cd3_NX(info);
		else if (nx == Cnd_par_itm_grp_nm3) doCnd_par_itm_grp_nm3_NX(info);
		else if (nx == Cnd_par_itm_grp_cd4) doCnd_par_itm_grp_cd4_NX(info);
		else if (nx == Cnd_par_itm_grp_nm4) doCnd_par_itm_grp_nm4_NX(info);
		else if (nx == Cnd_par_itm_grp_cd5) doCnd_par_itm_grp_cd5_NX(info);
		else if (nx == Cnd_par_itm_grp_nm5) doCnd_par_itm_grp_nm5_NX(info);
		else if (nx == Cnd_par_itm_grp_cd6) doCnd_par_itm_grp_cd6_NX(info);
		else if (nx == Cnd_par_itm_grp_nm6) doCnd_par_itm_grp_nm6_NX(info);
		else if (nx == Cnd_par_itm_grp_cd7) doCnd_par_itm_grp_cd7_NX(info);
		else if (nx == Cnd_par_itm_grp_nm7) doCnd_par_itm_grp_nm7_NX(info);
		else if (nx == Cnd_par_itm_grp_cd8) doCnd_par_itm_grp_cd8_NX(info);
		else if (nx == Cnd_par_itm_grp_nm8) doCnd_par_itm_grp_nm8_NX(info);
		else if (nx == Cnd_par_itm_grp_cd9) doCnd_par_itm_grp_cd9_NX(info);
		else if (nx == Cnd_par_itm_grp_nm9) doCnd_par_itm_grp_nm9_NX(info);
		else if (nx == Cnd_par_itm_grp_cd10) doCnd_par_itm_grp_cd10_NX(info);
		else if (nx == Cnd_par_itm_grp_nm10) doCnd_par_itm_grp_nm10_NX(info);
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
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_mng_dpt_flg) doCnd_mng_dpt_flg_NX(info);
		else if (nx == Cnd_par_itm_flg) doCnd_par_itm_flg_NX(info);
		else if (nx == Cnd_par_itm_typ_flg) doCnd_par_itm_typ_flg_NX(info);
		else if (nx == Cnd_par_itm_typ_d_flg) doCnd_par_itm_typ_d_flg_NX(info);
		else if (nx == Cnd_par_itm_jnl_flg) doCnd_par_itm_jnl_flg_NX(info);
		else if (nx == Cnd_par_lot_flg) doCnd_par_lot_flg_NX(info);
		else if (nx == Cnd_par_sublot_flg) doCnd_par_sublot_flg_NX(info);
		else if (nx == Cnd_par_sno1_flg) doCnd_par_sno1_flg_NX(info);
		else if (nx == Cnd_par_sno2_flg) doCnd_par_sno2_flg_NX(info);
		else if (nx == Cnd_par_sno3_flg) doCnd_par_sno3_flg_NX(info);
		else if (nx == Cnd_par_sno4_flg) doCnd_par_sno4_flg_NX(info);
		else if (nx == Cnd_par_asst_flg) doCnd_par_asst_flg_NX(info);
		else if (nx == Cnd_inpt_dpt_flg) doCnd_inpt_dpt_flg_NX(info);
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
		else if (nx == Cnd_asst_flg) doCnd_asst_flg_NX(info);
		else if (nx == Cnd_loc_flg) doCnd_loc_flg_NX(info);
		else if (nx == Cnd_str_ln_flg) doCnd_str_ln_flg_NX(info);
		else if (nx == Cnd_site_flg) doCnd_site_flg_NX(info);
		else if (nx == Cnd_oper_flg) doCnd_oper_flg_NX(info);
		else if (nx == Cnd_stk_bp_flg) doCnd_stk_bp_flg_NX(info);
		else if (nx == Cnd_expns_flg) doCnd_expns_flg_NX(info);
		else if (nx == Cnd_par_itm_grp_flg1) doCnd_par_itm_grp_flg1_NX(info);
		else if (nx == Cnd_par_itm_grp_flg2) doCnd_par_itm_grp_flg2_NX(info);
		else if (nx == Cnd_par_itm_grp_flg3) doCnd_par_itm_grp_flg3_NX(info);
		else if (nx == Cnd_par_itm_grp_flg4) doCnd_par_itm_grp_flg4_NX(info);
		else if (nx == Cnd_par_itm_grp_flg5) doCnd_par_itm_grp_flg5_NX(info);
		else if (nx == Cnd_par_itm_grp_flg6) doCnd_par_itm_grp_flg6_NX(info);
		else if (nx == Cnd_par_itm_grp_flg7) doCnd_par_itm_grp_flg7_NX(info);
		else if (nx == Cnd_par_itm_grp_flg8) doCnd_par_itm_grp_flg8_NX(info);
		else if (nx == Cnd_par_itm_grp_flg9) doCnd_par_itm_grp_flg9_NX(info);
		else if (nx == Cnd_par_itm_grp_flg10) doCnd_par_itm_grp_flg10_NX(info);
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
		else if (nx == Cnd_disp_key) doCnd_disp_key_NX(info);
		else if (nx == columnDispRslt_wg_cd) doDispRslt_wg_cd_NX(info);
		else if (nx == columnDispRslt_wg_nm) doDispRslt_wg_nm_NX(info);
		else if (nx == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_NX(info);
		else if (nx == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_NX(info);
		else if (nx == columnDispRslt_par_itm_typ) doDispRslt_par_itm_typ_NX(info);
		else if (nx == columnDispRslt_par_itm_typ_nm) doDispRslt_par_itm_typ_nm_NX(info);
		else if (nx == columnDispRslt_par_itm_typ_d_cd) doDispRslt_par_itm_typ_d_cd_NX(info);
		else if (nx == columnDispRslt_par_itm_typ_d_nm) doDispRslt_par_itm_typ_d_nm_NX(info);
		else if (nx == columnDispRslt_par_itm_jnl_cd) doDispRslt_par_itm_jnl_cd_NX(info);
		else if (nx == columnDispRslt_par_itm_jnl_nm) doDispRslt_par_itm_jnl_nm_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_cd1) doDispRslt_par_itm_grp_cd1_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_nm1) doDispRslt_par_itm_grp_nm1_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_cd2) doDispRslt_par_itm_grp_cd2_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_nm2) doDispRslt_par_itm_grp_nm2_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_cd3) doDispRslt_par_itm_grp_cd3_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_nm3) doDispRslt_par_itm_grp_nm3_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_cd4) doDispRslt_par_itm_grp_cd4_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_nm4) doDispRslt_par_itm_grp_nm4_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_cd5) doDispRslt_par_itm_grp_cd5_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_nm5) doDispRslt_par_itm_grp_nm5_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_cd6) doDispRslt_par_itm_grp_cd6_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_nm6) doDispRslt_par_itm_grp_nm6_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_cd7) doDispRslt_par_itm_grp_cd7_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_nm7) doDispRslt_par_itm_grp_nm7_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_cd8) doDispRslt_par_itm_grp_cd8_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_nm8) doDispRslt_par_itm_grp_nm8_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_cd9) doDispRslt_par_itm_grp_cd9_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_nm9) doDispRslt_par_itm_grp_nm9_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_cd10) doDispRslt_par_itm_grp_cd10_NX(info);
		else if (nx == columnDispRslt_par_itm_grp_nm10) doDispRslt_par_itm_grp_nm10_NX(info);
		else if (nx == columnDispRslt_par_lot_no) doDispRslt_par_lot_no_NX(info);
		else if (nx == columnDispRslt_par_sublot_no) doDispRslt_par_sublot_no_NX(info);
		else if (nx == columnDispRslt_par_sno1) doDispRslt_par_sno1_NX(info);
		else if (nx == columnDispRslt_par_sno2) doDispRslt_par_sno2_NX(info);
		else if (nx == columnDispRslt_par_sno3) doDispRslt_par_sno3_NX(info);
		else if (nx == columnDispRslt_par_sno4) doDispRslt_par_sno4_NX(info);
		else if (nx == columnDispRslt_par_asst_typ) doDispRslt_par_asst_typ_NX(info);
		else if (nx == columnDispRslt_par_asst_typ_nm) doDispRslt_par_asst_typ_nm_NX(info);
		else if (nx == columnDispRslt_inpt_dpt_cd) doDispRslt_inpt_dpt_cd_NX(info);
		else if (nx == columnDispRslt_inpt_dpt_nm) doDispRslt_inpt_dpt_nm_NX(info);
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
		else if (nx == columnDispRslt_asst_typ) doDispRslt_asst_typ_NX(info);
		else if (nx == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NX(info);
		else if (nx == columnDispRslt_loc_cd) doDispRslt_loc_cd_NX(info);
		else if (nx == columnDispRslt_loc_nm) doDispRslt_loc_nm_NX(info);
		else if (nx == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_NX(info);
		else if (nx == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_NX(info);
		else if (nx == columnDispRslt_site_cd) doDispRslt_site_cd_NX(info);
		else if (nx == columnDispRslt_site_nm) doDispRslt_site_nm_NX(info);
		else if (nx == columnDispRslt_oper_cd) doDispRslt_oper_cd_NX(info);
		else if (nx == columnDispRslt_oper_nm) doDispRslt_oper_nm_NX(info);
		else if (nx == columnDispRslt_stk_bp_cd) doDispRslt_stk_bp_cd_NX(info);
		else if (nx == columnDispRslt_stk_bp_nm) doDispRslt_stk_bp_nm_NX(info);
		else if (nx == columnDispRslt_expns_cd) doDispRslt_expns_cd_NX(info);
		else if (nx == columnDispRslt_expns_nm) doDispRslt_expns_nm_NX(info);
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
	 * [Cnd]パネルの[par_itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm10_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[par_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_typ_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_typ_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_typ_d_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_typ_d_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_jnl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_lot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_lot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sublot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sublot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno4_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_asst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_asst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_dpt_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_flg10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_flg10_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[par_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno1_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno2_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno3_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno4_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[inpt_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_inpt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[inpt_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_inpt_dpt_nm_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_nm_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_stk_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_expns_nm_NX(MCEventInfo info){
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
		else if (lc == Cnd_par_itm_jnl_cd) doCnd_par_itm_jnl_cd_LC(info);
		else if (lc == Cnd_par_itm_jnl_nm) doCnd_par_itm_jnl_nm_LC(info);
		else if (lc == Cnd_par_lot_no) doCnd_par_lot_no_LC(info);
		else if (lc == Cnd_par_sublot_no) doCnd_par_sublot_no_LC(info);
		else if (lc == Cnd_par_sno1) doCnd_par_sno1_LC(info);
		else if (lc == Cnd_par_sno2) doCnd_par_sno2_LC(info);
		else if (lc == Cnd_par_sno3) doCnd_par_sno3_LC(info);
		else if (lc == Cnd_par_sno4) doCnd_par_sno4_LC(info);
		else if (lc == Cnd_par_asst_typ) doCnd_par_asst_typ_LC(info);
		else if (lc == Cnd_par_asst_typ_nm) doCnd_par_asst_typ_nm_LC(info);
		else if (lc == Cnd_inpt_dpt_cd) doCnd_inpt_dpt_cd_LC(info);
		else if (lc == Cnd_inpt_dpt_nm) doCnd_inpt_dpt_nm_LC(info);
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
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_oper_cd) doCnd_oper_cd_LC(info);
		else if (lc == Cnd_oper_nm) doCnd_oper_nm_LC(info);
		else if (lc == Cnd_stk_bp_cd) doCnd_stk_bp_cd_LC(info);
		else if (lc == Cnd_stk_bp_nm) doCnd_stk_bp_nm_LC(info);
		else if (lc == Cnd_par_itm_grp_cd1) doCnd_par_itm_grp_cd1_LC(info);
		else if (lc == Cnd_par_itm_grp_nm1) doCnd_par_itm_grp_nm1_LC(info);
		else if (lc == Cnd_par_itm_grp_cd2) doCnd_par_itm_grp_cd2_LC(info);
		else if (lc == Cnd_par_itm_grp_nm2) doCnd_par_itm_grp_nm2_LC(info);
		else if (lc == Cnd_par_itm_grp_cd3) doCnd_par_itm_grp_cd3_LC(info);
		else if (lc == Cnd_par_itm_grp_nm3) doCnd_par_itm_grp_nm3_LC(info);
		else if (lc == Cnd_par_itm_grp_cd4) doCnd_par_itm_grp_cd4_LC(info);
		else if (lc == Cnd_par_itm_grp_nm4) doCnd_par_itm_grp_nm4_LC(info);
		else if (lc == Cnd_par_itm_grp_cd5) doCnd_par_itm_grp_cd5_LC(info);
		else if (lc == Cnd_par_itm_grp_nm5) doCnd_par_itm_grp_nm5_LC(info);
		else if (lc == Cnd_par_itm_grp_cd6) doCnd_par_itm_grp_cd6_LC(info);
		else if (lc == Cnd_par_itm_grp_nm6) doCnd_par_itm_grp_nm6_LC(info);
		else if (lc == Cnd_par_itm_grp_cd7) doCnd_par_itm_grp_cd7_LC(info);
		else if (lc == Cnd_par_itm_grp_nm7) doCnd_par_itm_grp_nm7_LC(info);
		else if (lc == Cnd_par_itm_grp_cd8) doCnd_par_itm_grp_cd8_LC(info);
		else if (lc == Cnd_par_itm_grp_nm8) doCnd_par_itm_grp_nm8_LC(info);
		else if (lc == Cnd_par_itm_grp_cd9) doCnd_par_itm_grp_cd9_LC(info);
		else if (lc == Cnd_par_itm_grp_nm9) doCnd_par_itm_grp_nm9_LC(info);
		else if (lc == Cnd_par_itm_grp_cd10) doCnd_par_itm_grp_cd10_LC(info);
		else if (lc == Cnd_par_itm_grp_nm10) doCnd_par_itm_grp_nm10_LC(info);
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
		else if (lc == columnDispRslt_wg_cd) doDispRslt_wg_cd_LC(info);
		else if (lc == columnDispRslt_wg_nm) doDispRslt_wg_nm_LC(info);
		else if (lc == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_LC(info);
		else if (lc == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_LC(info);
		else if (lc == columnDispRslt_par_itm_typ) doDispRslt_par_itm_typ_LC(info);
		else if (lc == columnDispRslt_par_itm_typ_nm) doDispRslt_par_itm_typ_nm_LC(info);
		else if (lc == columnDispRslt_par_itm_typ_d_cd) doDispRslt_par_itm_typ_d_cd_LC(info);
		else if (lc == columnDispRslt_par_itm_typ_d_nm) doDispRslt_par_itm_typ_d_nm_LC(info);
		else if (lc == columnDispRslt_par_itm_jnl_cd) doDispRslt_par_itm_jnl_cd_LC(info);
		else if (lc == columnDispRslt_par_itm_jnl_nm) doDispRslt_par_itm_jnl_nm_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_cd1) doDispRslt_par_itm_grp_cd1_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_nm1) doDispRslt_par_itm_grp_nm1_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_cd2) doDispRslt_par_itm_grp_cd2_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_nm2) doDispRslt_par_itm_grp_nm2_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_cd3) doDispRslt_par_itm_grp_cd3_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_nm3) doDispRslt_par_itm_grp_nm3_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_cd4) doDispRslt_par_itm_grp_cd4_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_nm4) doDispRslt_par_itm_grp_nm4_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_cd5) doDispRslt_par_itm_grp_cd5_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_nm5) doDispRslt_par_itm_grp_nm5_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_cd6) doDispRslt_par_itm_grp_cd6_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_nm6) doDispRslt_par_itm_grp_nm6_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_cd7) doDispRslt_par_itm_grp_cd7_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_nm7) doDispRslt_par_itm_grp_nm7_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_cd8) doDispRslt_par_itm_grp_cd8_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_nm8) doDispRslt_par_itm_grp_nm8_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_cd9) doDispRslt_par_itm_grp_cd9_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_nm9) doDispRslt_par_itm_grp_nm9_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_cd10) doDispRslt_par_itm_grp_cd10_LC(info);
		else if (lc == columnDispRslt_par_itm_grp_nm10) doDispRslt_par_itm_grp_nm10_LC(info);
		else if (lc == columnDispRslt_par_lot_no) doDispRslt_par_lot_no_LC(info);
		else if (lc == columnDispRslt_par_sublot_no) doDispRslt_par_sublot_no_LC(info);
		else if (lc == columnDispRslt_par_sno1) doDispRslt_par_sno1_LC(info);
		else if (lc == columnDispRslt_par_sno2) doDispRslt_par_sno2_LC(info);
		else if (lc == columnDispRslt_par_sno3) doDispRslt_par_sno3_LC(info);
		else if (lc == columnDispRslt_par_sno4) doDispRslt_par_sno4_LC(info);
		else if (lc == columnDispRslt_par_asst_typ) doDispRslt_par_asst_typ_LC(info);
		else if (lc == columnDispRslt_par_asst_typ_nm) doDispRslt_par_asst_typ_nm_LC(info);
		else if (lc == columnDispRslt_inpt_dpt_cd) doDispRslt_inpt_dpt_cd_LC(info);
		else if (lc == columnDispRslt_inpt_dpt_nm) doDispRslt_inpt_dpt_nm_LC(info);
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
		else if (lc == columnDispRslt_asst_typ) doDispRslt_asst_typ_LC(info);
		else if (lc == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_LC(info);
		else if (lc == columnDispRslt_loc_cd) doDispRslt_loc_cd_LC(info);
		else if (lc == columnDispRslt_loc_nm) doDispRslt_loc_nm_LC(info);
		else if (lc == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_LC(info);
		else if (lc == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_LC(info);
		else if (lc == columnDispRslt_site_cd) doDispRslt_site_cd_LC(info);
		else if (lc == columnDispRslt_site_nm) doDispRslt_site_nm_LC(info);
		else if (lc == columnDispRslt_oper_cd) doDispRslt_oper_cd_LC(info);
		else if (lc == columnDispRslt_oper_nm) doDispRslt_oper_nm_LC(info);
		else if (lc == columnDispRslt_stk_bp_cd) doDispRslt_stk_bp_cd_LC(info);
		else if (lc == columnDispRslt_stk_bp_nm) doDispRslt_stk_bp_nm_LC(info);
		else if (lc == columnDispRslt_expns_cd) doDispRslt_expns_cd_LC(info);
		else if (lc == columnDispRslt_expns_nm) doDispRslt_expns_nm_LC(info);
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
	 * [Cnd]パネルの[par_itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_sno4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm10_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[par_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_itm_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno1_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno2_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno3_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_sno4_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[par_asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_par_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[inpt_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_inpt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[inpt_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_inpt_dpt_nm_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_site_nm_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_stk_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_expns_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_par_itm_jnl_cd]の作成メソッド
	 */
	public MCList getCnd_par_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_asst_typ]の作成メソッド
	 */
	public MCList getCnd_par_asst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAsstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_inpt_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_inpt_dpt_cd(MCRow row, MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_oper_cd]の作成メソッド
	 */
	public MCList getCnd_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_stk_bp_cd]の作成メソッド
	 */
	public MCList getCnd_stk_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp10(row, info);
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBAL0150.Srch01")) {
			return new MG_MGBAL0150_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBAL0150_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBAL0150_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBAL0150_Srch01;

		/** コンストラクタ */
		protected MG_MGBAL0150_Srch01Bridge() {
			p_MG_MGBAL0150_Srch01 = new MCParam(PDef.MG_MGBAL0150_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBAL0150_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBA.MGBAP0150.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBA.MGBAP0150.RsltR.class));

			p_MG_MGBAL0150_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBAL0150_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBAL0150_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBAL0150_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBAL0150_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBA.MGBAP0150.CndR up0() {
			return (mcframe.clientMGBA.MGBAP0150.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBA.MGBAP0150.RsltR> down0() {
			return (MCList<mcframe.clientMGBA.MGBAP0150.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBAL0150_Srch01.addDownBlock(MCList.create(mcframe.clientMGBA.MGBAP0150.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBAL0150_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBA.MGBAP0150.RsltR>)p_MG_MGBAL0150_Srch01.getContainerParam().getDownBlock(0));
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