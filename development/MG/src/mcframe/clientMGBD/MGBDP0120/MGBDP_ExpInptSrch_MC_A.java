package mcframe.clientMGBD.MGBDP0120;

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
import mcframe.clientMGBD.MGBDP0120.MGBDP_ExpInptSrch_MC.MG_MGBDL0120_Srch01Caller;
import mcframe.clientMGBD.MGBDP0120.MGBDP_ExpInptSrch_MC.MG_MGBDL0120_Ins01Caller;

/**
 * 画面"MGBDP_ExpInptSrch"パネルクラスです。<p>
 *
 * 投入展開データを参照します。展開されたデータを投入計画へ反映します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_ExpInptSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBDP0120";

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
	// [Tab5]ブロック関連のField定義
	public MCPanel Tab5Panel = null;
	// [Tab5]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * REF,View,0;INS,Apply to planning data,1 REF,参照する,0;INS,計画データに反映する,1.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_INS = null;
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
	public MCLabel Cnd_itm_mfg_inst_no_Label = null;
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_itm_mfg_inst_no = null;
	public MCLabel Cnd_mfg_act_no_Label = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_act_no = null;
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
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_mfg_inst_flg = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_mfg_act_flg = null;
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
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCCheckBox Cnd_asst_typ_flg = null;
	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCCheckBox Cnd_disp_seq_flg = null;
	/**
	 * Operation 工程.<p>
	 *
	 */
	public MCCheckBox Cnd_oper_flg = null;
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
	 * Supply type 支給区分.<p>
	 *
	 */
	public MCCheckBox Cnd_prov_typ_flg = null;
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
	// [InsCnd]ブロック関連のField定義
	public MCPanel InsCndPanel = null;
	// [InsCnd]ブロックの項目のField定義
	public MCLabel InsCnd_calc_grp_cd_Label = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox InsCnd_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCTextField InsCnd_calc_grp_nm = null;
	public mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H InsCnd_calc_no_p_PPanel;
	public MCTextComboBox InsCnd_calc_no;	// [InsCnd]の[calc_no_p.calc_no]を[InsCnd_calc_no]としてエイリアス定義。
	public MCTextField InsCnd_rmrks;	// [InsCnd]の[calc_no_p.rmrks]を[InsCnd_rmrks]としてエイリアス定義。
	/**
	 * First month of the term 対象期間先頭年月.<p>
	 *
	 */
	public MCDateField InsCnd_st_ym = null;
	/**
	 * Last month of the term 対象期間末尾年月.<p>
	 *
	 */
	public MCDateField InsCnd_end_ym = null;
	public MCLabel InsCnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox InsCnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField InsCnd_wg_nm = null;
	public MCLabel InsCnd_calc_ctg_cd_Label = null;
	/**
	 * Applied calculation category cd. 反映先計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox InsCnd_calc_ctg_cd = null;
	/**
	 * Applied calculation category name 反映先計算カテゴリ名.<p>
	 *
	 */
	public MCTextField InsCnd_calc_ctg_nm = null;
	/**
	 * Applied amount 金額反映.<p>
	 *
	 */
	public MCCheckBox InsCnd_amt_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [DispRslt]ブロック関連のField定義
	public MCPanel DispRsltPanel = null;
	public MCScrollPane DispRsltScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0120.DispRsltR> DispRsltTable = null;
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
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_itm_mfg_inst_no = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_mfg_act_no = null;
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
	 * Routing 工順.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_disp_seq = null;
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
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_oper_seq = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispRslt_ttl_qty_p_PPanel;
	public MCColumnConfig columnDispRslt_ttl;// [DispRslt]の[ttl_qty_p.qty]を[columnDispRslt_ttl]としてエイリアス定義。
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
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Input plan entry 投入計画登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBAP0070 = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF, INS};
	
	/** [MG_MGBDL0120_Srch01]のCallerの作成 */
	protected MGBDP_ExpInptSrch_MC.MG_MGBDL0120_Srch01Caller createMG_MGBDL0120_Srch01() {
		MGBDP_ExpInptSrch_MC.MG_MGBDL0120_Srch01Caller<MGBDP_ExpInptSrch, MG_MGBDL0120_Srch01Bridge>
		caller = ((MGBDP_ExpInptSrch_MC)this).new MG_MGBDL0120_Srch01Caller<MGBDP_ExpInptSrch, MG_MGBDL0120_Srch01Bridge>(
					(MGBDP_ExpInptSrch)this, new MG_MGBDL0120_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBDL0120_Srch01]の呼び出し */
	protected void callMG_MGBDL0120_Srch01() {
		MCCaller caller = createMG_MGBDL0120_Srch01();
		caller.exec();
	}
	/** [MG_MGBDL0120_Ins01]のCallerの作成 */
	protected MGBDP_ExpInptSrch_MC.MG_MGBDL0120_Ins01Caller createMG_MGBDL0120_Ins01() {
		MGBDP_ExpInptSrch_MC.MG_MGBDL0120_Ins01Caller<MGBDP_ExpInptSrch, MG_MGBDL0120_Ins01Bridge>
		caller = ((MGBDP_ExpInptSrch_MC)this).new MG_MGBDL0120_Ins01Caller<MGBDP_ExpInptSrch, MG_MGBDL0120_Ins01Bridge>(
					(MGBDP_ExpInptSrch)this, new MG_MGBDL0120_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBDL0120_Ins01]の呼び出し */
	protected void callMG_MGBDL0120_Ins01() {
		MCCaller caller = createMG_MGBDL0120_Ins01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0120.CndR aCndR;
	/** [InsCnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0120.InsCndR aInsCndR;
	/** [DispRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0120.DispRsltR> aDispRsltL;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0120.RsltR> aRsltL;
	/** [Rslt2]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0120.Rslt2R aRslt2R;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0120.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0120.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0120.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0120.CndR.create();
	}

	/**
	 * 項目コピーによってaInsCndRを設定します。
	 *
	 * aInsCndRのインスタンスは変更されません。
	 *
	 * @param row InsCndR
	 */
	public void setInsCndR(mcframe.clientMGBD.MGBDP0120.InsCndR row) {
		if (row != null) {
			MCRow.copyall(getInsCndR(), row);
		}
	}

	/**
	 * [InsCnd]ブロックのコンテナaInsCndRを返します。
	 *
	 * @return InsCndR
	 */
	public mcframe.clientMGBD.MGBDP0120.InsCndR getInsCndR() {
		return aInsCndR;
	}

	/**
	 * aInsCndRを作成します。
	 *
	 * @return InsCndR
	 */
	public mcframe.clientMGBD.MGBDP0120.InsCndR createInsCndR() {
		return mcframe.clientMGBD.MGBDP0120.InsCndR.create();
	}

	/**
	 * コピーによってaDispRsltLを設定します。
	 *
	 * aDispRsltLのインスタンスは変更されません。
	 *
	 * @param dataset DispRsltL
	 */
	public void setDispRsltL(MCList<mcframe.clientMGBD.MGBDP0120.DispRsltR> aList) {
		if (getDispRsltL() != aList) {
			getDispRsltL().setAll(aList);
		}
	}

	/**
	 * [DispRslt]ブロックのコンテナaDispRsltLを返します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0120.DispRsltR> getDispRsltL() {
		return aDispRsltL;
	}

	/**
	 * aDispRsltRを作成します。
	 *
	 * @return DispRsltR
	 */
	public mcframe.clientMGBD.MGBDP0120.DispRsltR createDispRsltR() {
		return mcframe.clientMGBD.MGBDP0120.DispRsltR.create();
	}

	/**
	 * aDispRsltLを作成します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0120.DispRsltR> createDispRsltL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.class);
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
	public void setRsltL(MCList<mcframe.clientMGBD.MGBDP0120.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0120.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBD.MGBDP0120.RsltR createRsltR() {
		return mcframe.clientMGBD.MGBDP0120.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0120.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0120.RsltR.class);
	}

	/**
	 * 項目コピーによってaRslt2Rを設定します。
	 *
	 * aRslt2Rのインスタンスは変更されません。
	 *
	 * @param row Rslt2R
	 */
	public void setRslt2R(mcframe.clientMGBD.MGBDP0120.Rslt2R row) {
		if (row != null) {
			MCRow.copyall(getRslt2R(), row);
		}
	}

	/**
	 * [Rslt2]ブロックのコンテナaRslt2Rを返します。
	 *
	 * @return Rslt2R
	 */
	public mcframe.clientMGBD.MGBDP0120.Rslt2R getRslt2R() {
		return aRslt2R;
	}

	/**
	 * aRslt2Rを作成します。
	 *
	 * @return Rslt2R
	 */
	public mcframe.clientMGBD.MGBDP0120.Rslt2R createRslt2R() {
		return mcframe.clientMGBD.MGBDP0120.Rslt2R.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getInsCndR())) ret.add(getInsCndR());
		if(!MCCollectionUtil.contains(ret, getDispRsltL())) ret.add(getDispRsltL());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getRslt2R())) ret.add(getRslt2R());
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
		if(aCnt == getInsCndR()) return "InsCnd";
		if(aCnt == getDispRsltL()) return "DispRslt";
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getRslt2R()) return "Rslt2";
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
		if(bId.equals("InsCnd")) return getInsCndR();
		if(bId.equals("DispRslt")) return getDispRsltL();
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("Rslt2")) return getRslt2R();
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
		ret.add(Tab5Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(Cnd3Panel);
		ret.add(TtlPanel);
		ret.add(InsCndPanel);
		ret.add(CtrlPanel);
		ret.add(DispRsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ExpInptSrch_MC_A() {
		aCndR = createCndR();
		aInsCndR = createInsCndR();
		aDispRsltL = createDispRsltL();
		aRsltL = createRsltL();
		aRslt2R = createRslt2R();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_ExpInptSrch_MC_A(String name) {
		aCndR = createCndR();
		aInsCndR = createInsCndR();
		aDispRsltL = createDispRsltL();
		createDispRsltTable();
		DispRsltTable.setRowName(name);
		aRsltL = createRsltL();
		aRslt2R = createRslt2R();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBDP_ExpInptSrch_MC.jbCreateScreenOpe((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbCreateTop((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbCreateFold((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbCreateTab1((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbCreateTab2((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbCreateTab3((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbCreateTab4((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbCreateTab5((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbCreateCnd((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbCreateCnd2((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbCreateCnd3((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbCreateTtl((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbCreateInsCnd((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbCreateCtrl((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbCreateDispRslt((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbCreateBtn((MGBDP_ExpInptSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBDP_ExpInptSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBDP_ExpInptSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBDP_ExpInptSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBDP_ExpInptSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBDP_ExpInptSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MGBDP_ExpInptSrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MGBDP_ExpInptSrch p) {
	}

	/**
	 * [Tab5]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab5(MGBDP_ExpInptSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_ExpInptSrch p) {
		p.Cnd_calc_no_p_PPanel = mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.create(p.getCndR().calc_no_p());
		p.Cnd_calc_no_p_PPanel.setName("Cnd.calc_no_p");
		p.Cnd_calc_no = p.Cnd_calc_no_p_PPanel.CalcNo_calc_no;
		p.Cnd_calc_no.addAliasName("Cnd.calc_no", p);
		p.Cnd_rmrks = p.Cnd_calc_no_p_PPanel.CalcNo_rmrks;
		p.Cnd_rmrks.addAliasName("Cnd.rmrks", p);
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
	protected static void jbCreateCnd2(MGBDP_ExpInptSrch p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MGBDP_ExpInptSrch p) {
	}

	/**
	 * [Ttl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTtl(MGBDP_ExpInptSrch p) {
	}

	/**
	 * [InsCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateInsCnd(MGBDP_ExpInptSrch p) {
		p.InsCnd_calc_no_p_PPanel = mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.create(p.getInsCndR().calc_no_p());
		p.InsCnd_calc_no_p_PPanel.setName("InsCnd.calc_no_p");
		p.InsCnd_calc_no = p.InsCnd_calc_no_p_PPanel.CalcNo_calc_no;
		p.InsCnd_calc_no.addAliasName("InsCnd.calc_no", p);
		p.InsCnd_rmrks = p.InsCnd_calc_no_p_PPanel.CalcNo_rmrks;
		p.InsCnd_rmrks.addAliasName("InsCnd.rmrks", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBDP_ExpInptSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispRslt(MGBDP_ExpInptSrch p) {
		p.DispRslt_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.$par_itm_p);
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
		p.DispRslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.$itm_p);
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
		p.DispRslt_ttl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.$ttl_qty_p);
		p.DispRslt_ttl_qty_p_PPanel.setName("DispRslt.ttl_qty_p");
		p.columnDispRslt_ttl = p.DispRslt_ttl_qty_p_PPanel.columnQty_qty;
		p.columnDispRslt_ttl.addAliasName("DispRslt.ttl", p);
		p.DispRslt_qty_00_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.$qty_00_p);
		p.DispRslt_qty_00_p_PPanel.setName("DispRslt.qty_00_p");
		p.columnDispRslt_col_00 = p.DispRslt_qty_00_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_00.addAliasName("DispRslt.col_00", p);
		p.DispRslt_qty_01_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.$qty_01_p);
		p.DispRslt_qty_01_p_PPanel.setName("DispRslt.qty_01_p");
		p.columnDispRslt_col_01 = p.DispRslt_qty_01_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_01.addAliasName("DispRslt.col_01", p);
		p.DispRslt_qty_02_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.$qty_02_p);
		p.DispRslt_qty_02_p_PPanel.setName("DispRslt.qty_02_p");
		p.columnDispRslt_col_02 = p.DispRslt_qty_02_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_02.addAliasName("DispRslt.col_02", p);
		p.DispRslt_qty_03_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.$qty_03_p);
		p.DispRslt_qty_03_p_PPanel.setName("DispRslt.qty_03_p");
		p.columnDispRslt_col_03 = p.DispRslt_qty_03_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_03.addAliasName("DispRslt.col_03", p);
		p.DispRslt_qty_04_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.$qty_04_p);
		p.DispRslt_qty_04_p_PPanel.setName("DispRslt.qty_04_p");
		p.columnDispRslt_col_04 = p.DispRslt_qty_04_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_04.addAliasName("DispRslt.col_04", p);
		p.DispRslt_qty_05_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.$qty_05_p);
		p.DispRslt_qty_05_p_PPanel.setName("DispRslt.qty_05_p");
		p.columnDispRslt_col_05 = p.DispRslt_qty_05_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_05.addAliasName("DispRslt.col_05", p);
		p.DispRslt_qty_06_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.$qty_06_p);
		p.DispRslt_qty_06_p_PPanel.setName("DispRslt.qty_06_p");
		p.columnDispRslt_col_06 = p.DispRslt_qty_06_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_06.addAliasName("DispRslt.col_06", p);
		p.DispRslt_qty_07_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.$qty_07_p);
		p.DispRslt_qty_07_p_PPanel.setName("DispRslt.qty_07_p");
		p.columnDispRslt_col_07 = p.DispRslt_qty_07_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_07.addAliasName("DispRslt.col_07", p);
		p.DispRslt_qty_08_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.$qty_08_p);
		p.DispRslt_qty_08_p_PPanel.setName("DispRslt.qty_08_p");
		p.columnDispRslt_col_08 = p.DispRslt_qty_08_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_08.addAliasName("DispRslt.col_08", p);
		p.DispRslt_qty_09_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.$qty_09_p);
		p.DispRslt_qty_09_p_PPanel.setName("DispRslt.qty_09_p");
		p.columnDispRslt_col_09 = p.DispRslt_qty_09_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_09.addAliasName("DispRslt.col_09", p);
		p.DispRslt_qty_10_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.$qty_10_p);
		p.DispRslt_qty_10_p_PPanel.setName("DispRslt.qty_10_p");
		p.columnDispRslt_col_10 = p.DispRslt_qty_10_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_10.addAliasName("DispRslt.col_10", p);
		p.DispRslt_qty_11_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0120.DispRsltR.$qty_11_p);
		p.DispRslt_qty_11_p_PPanel.setName("DispRslt.qty_11_p");
		p.columnDispRslt_col_11 = p.DispRslt_qty_11_p_PPanel.columnQty_qty;
		p.columnDispRslt_col_11.addAliasName("DispRslt.col_11", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBDP_ExpInptSrch p) {
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
	
	
	/** [InsCnd_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter InsCnd_calc_grp_cd_p = null;

	/**
	 * [InsCnd_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getInsCnd_calc_grp_cd_ListPutter() {
		if (InsCnd_calc_grp_cd_p == null) {
			InsCnd_calc_grp_cd_p = createInsCnd_calc_grp_cd_ListPutter(InsCnd_calc_grp_cd, "calc_grp_cd", "calc_grp_nm");

		}
		return InsCnd_calc_grp_cd_p;
	}
	
	
	/** [InsCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の定義 */
	private MCListPutter InsCnd_calc_no_p_PPanel_CalcNo_calc_no_p = null;

	/**
	 * [InsCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の取得
	 */
	protected MCListPutter getInsCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter() {
		if (InsCnd_calc_no_p_PPanel_CalcNo_calc_no_p == null) {
			InsCnd_calc_no_p_PPanel_CalcNo_calc_no_p = createInsCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(InsCnd_calc_no_p_PPanel.CalcNo_calc_no, "calc_no", "rmrks","st_ym","end_ym");
		}
		return InsCnd_calc_no_p_PPanel_CalcNo_calc_no_p;
	}
	
	
	/** [InsCnd_wg_cd_ListPutter]の定義 */
	private MCListPutter InsCnd_wg_cd_p = null;

	/**
	 * [InsCnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getInsCnd_wg_cd_ListPutter() {
		if (InsCnd_wg_cd_p == null) {
			InsCnd_wg_cd_p = createInsCnd_wg_cd_ListPutter(InsCnd_wg_cd, "wg_cd", "wg_nm");

		}
		return InsCnd_wg_cd_p;
	}
	
	
	/** [InsCnd_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter InsCnd_calc_ctg_cd_p = null;

	/**
	 * [InsCnd_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getInsCnd_calc_ctg_cd_ListPutter() {
		if (InsCnd_calc_ctg_cd_p == null) {
			InsCnd_calc_ctg_cd_p = createInsCnd_calc_ctg_cd_ListPutter(InsCnd_calc_ctg_cd, "calc_ctg_cd", "calc_ctg_nm");

		}
		return InsCnd_calc_ctg_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_ExpInptSrch create(){
		MGBDP_ExpInptSrch p = new MGBDP_ExpInptSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_ExpInptSrch create(String name){
		MGBDP_ExpInptSrch p = new MGBDP_ExpInptSrch(name);
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
		MGBDP_ExpInptSrch_MC.jbfInitScreenOpe((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbfInitTop((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbfInitFold((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbfInitTab1((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbfInitTab2((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbfInitTab3((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbfInitTab4((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbfInitTab5((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbfInitCnd((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbfInitCnd2((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbfInitCnd3((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbfInitTtl((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbfInitInsCnd((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbfInitCtrl((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbfInitDispRslt((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbfInitBtn((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitScreenOpe((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitTop((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitFold((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitTab1((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitTab2((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitTab3((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitTab4((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitTab5((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitCnd((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitCnd2((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitCnd3((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitTtl((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitInsCnd((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitCtrl((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitDispRslt((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.jbInitBtn((MGBDP_ExpInptSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBDP_ExpInptSrch p) {
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
	protected static void jbfInitTab1(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab5(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.Tab5Panel = p.beansFactory.createPanel("Tab5");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
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
		p.Cnd_par_itm_jnl_cd_Label = p.beansFactory.createLabel("Cnd.par_itm_jnl_cd_Label");
		p.Cnd_par_itm_jnl_cd = p.beansFactory.createTextComboBox("Cnd.par_itm_jnl_cd");
		p.Cnd_par_itm_jnl_cd.setLabel(p.Cnd_par_itm_jnl_cd_Label);
		p.Cnd_par_itm_jnl_nm = p.beansFactory.createTextField("Cnd.par_itm_jnl_nm");
		p.Cnd_itm_mfg_inst_no_Label = p.beansFactory.createLabel("Cnd.itm_mfg_inst_no_Label");
		p.Cnd_itm_mfg_inst_no = p.beansFactory.createTextField("Cnd.itm_mfg_inst_no");
		p.Cnd_itm_mfg_inst_no.setLabel(p.Cnd_itm_mfg_inst_no_Label);
		p.Cnd_mfg_act_no_Label = p.beansFactory.createLabel("Cnd.mfg_act_no_Label");
		p.Cnd_mfg_act_no = p.beansFactory.createTextField("Cnd.mfg_act_no");
		p.Cnd_mfg_act_no.setLabel(p.Cnd_mfg_act_no_Label);
		p.Cnd_asst_typ_Label = p.beansFactory.createLabel("Cnd.asst_typ_Label");
		p.Cnd_asst_typ = p.beansFactory.createTextComboBox("Cnd.asst_typ");
		p.Cnd_asst_typ.setLabel(p.Cnd_asst_typ_Label);
		p.Cnd_asst_typ_nm = p.beansFactory.createTextField("Cnd.asst_typ_nm");
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
		p.Cnd_prov_typ_Label = p.beansFactory.createLabel("Cnd.prov_typ_Label");
		p.Cnd_prov_typ = p.beansFactory.createTextComboBox("Cnd.prov_typ");
		p.Cnd_prov_typ.setLabel(p.Cnd_prov_typ_Label);
		p.Cnd_prov_typ_nm = p.beansFactory.createTextField("Cnd.prov_typ_nm");
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
		p.Cnd_itm_mfg_inst_flg = p.beansFactory.createCheckBox("Cnd.itm_mfg_inst_flg");
		p.Cnd_mfg_act_flg = p.beansFactory.createCheckBox("Cnd.mfg_act_flg");
		p.Cnd_par_lot_flg = p.beansFactory.createCheckBox("Cnd.par_lot_flg");
		p.Cnd_par_sublot_flg = p.beansFactory.createCheckBox("Cnd.par_sublot_flg");
		p.Cnd_par_sno1_flg = p.beansFactory.createCheckBox("Cnd.par_sno1_flg");
		p.Cnd_par_sno2_flg = p.beansFactory.createCheckBox("Cnd.par_sno2_flg");
		p.Cnd_par_sno3_flg = p.beansFactory.createCheckBox("Cnd.par_sno3_flg");
		p.Cnd_par_sno4_flg = p.beansFactory.createCheckBox("Cnd.par_sno4_flg");
		p.Cnd_loc_flg = p.beansFactory.createCheckBox("Cnd.loc_flg");
		p.Cnd_str_ln_flg = p.beansFactory.createCheckBox("Cnd.str_ln_flg");
		p.Cnd_site_flg = p.beansFactory.createCheckBox("Cnd.site_flg");
		p.Cnd_asst_typ_flg = p.beansFactory.createCheckBox("Cnd.asst_typ_flg");
		p.Cnd_disp_seq_flg = p.beansFactory.createCheckBox("Cnd.disp_seq_flg");
		p.Cnd_oper_flg = p.beansFactory.createCheckBox("Cnd.oper_flg");
		p.Cnd_lot_flg = p.beansFactory.createCheckBox("Cnd.lot_flg");
		p.Cnd_sublot_flg = p.beansFactory.createCheckBox("Cnd.sublot_flg");
		p.Cnd_sno1_flg = p.beansFactory.createCheckBox("Cnd.sno1_flg");
		p.Cnd_sno2_flg = p.beansFactory.createCheckBox("Cnd.sno2_flg");
		p.Cnd_sno3_flg = p.beansFactory.createCheckBox("Cnd.sno3_flg");
		p.Cnd_sno4_flg = p.beansFactory.createCheckBox("Cnd.sno4_flg");
		p.Cnd_prov_typ_flg = p.beansFactory.createCheckBox("Cnd.prov_typ_flg");
		p.Cnd_select_all = p.beansFactory.createButton("Cnd.select_all", "no_border");
		p.Cnd_deselect_all = p.beansFactory.createButton("Cnd.deselect_all", "no_border");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTtl(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.TtlPanel = p.beansFactory.createPanel("Ttl");
		// ブロックの項目の初期化
	}

	/**
	 * [InsCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitInsCnd(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.InsCndPanel = p.beansFactory.createPanel("InsCnd");
		// ブロックの項目の初期化
		p.InsCnd_calc_grp_cd_Label = p.beansFactory.createLabel("InsCnd.calc_grp_cd_Label");
		p.InsCnd_calc_grp_cd = p.beansFactory.createTextComboBox("InsCnd.calc_grp_cd");
		p.InsCnd_calc_grp_cd.setLabel(p.InsCnd_calc_grp_cd_Label);
		p.InsCnd_calc_grp_nm = p.beansFactory.createTextField("InsCnd.calc_grp_nm");
		p.InsCnd_st_ym = p.beansFactory.createDateField("InsCnd.st_ym");
		p.InsCnd_end_ym = p.beansFactory.createDateField("InsCnd.end_ym");
		p.InsCnd_wg_cd_Label = p.beansFactory.createLabel("InsCnd.wg_cd_Label");
		p.InsCnd_wg_cd = p.beansFactory.createTextComboBox("InsCnd.wg_cd");
		p.InsCnd_wg_cd.setLabel(p.InsCnd_wg_cd_Label);
		p.InsCnd_wg_nm = p.beansFactory.createTextField("InsCnd.wg_nm");
		p.InsCnd_calc_ctg_cd_Label = p.beansFactory.createLabel("InsCnd.calc_ctg_cd_Label");
		p.InsCnd_calc_ctg_cd = p.beansFactory.createTextComboBox("InsCnd.calc_ctg_cd");
		p.InsCnd_calc_ctg_cd.setLabel(p.InsCnd_calc_ctg_cd_Label);
		p.InsCnd_calc_ctg_nm = p.beansFactory.createTextField("InsCnd.calc_ctg_nm");
		p.InsCnd_amt_flg = p.beansFactory.createCheckBox("InsCnd.amt_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispRslt(MGBDP_ExpInptSrch p) {
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
		p.columnDispRslt_itm_mfg_inst_no = p.beansFactory.createTableColumn("DispRslt.itm_mfg_inst_no", MCColumnType.TEXT);
		p.columnDispRslt_mfg_act_no = p.beansFactory.createTableColumn("DispRslt.mfg_act_no", MCColumnType.TEXT);
		p.columnDispRslt_par_lot_no = p.beansFactory.createTableColumn("DispRslt.par_lot_no", MCColumnType.TEXT);
		p.columnDispRslt_par_sublot_no = p.beansFactory.createTableColumn("DispRslt.par_sublot_no", MCColumnType.TEXT);
		p.columnDispRslt_par_sno1 = p.beansFactory.createTableColumn("DispRslt.par_sno1", MCColumnType.TEXT);
		p.columnDispRslt_par_sno2 = p.beansFactory.createTableColumn("DispRslt.par_sno2", MCColumnType.TEXT);
		p.columnDispRslt_par_sno3 = p.beansFactory.createTableColumn("DispRslt.par_sno3", MCColumnType.TEXT);
		p.columnDispRslt_par_sno4 = p.beansFactory.createTableColumn("DispRslt.par_sno4", MCColumnType.TEXT);
		p.columnDispRslt_loc_cd = p.beansFactory.createTableColumn("DispRslt.loc_cd", MCColumnType.TEXT);
		p.columnDispRslt_loc_nm = p.beansFactory.createTableColumn("DispRslt.loc_nm", MCColumnType.TEXT);
		p.columnDispRslt_str_ln_cd = p.beansFactory.createTableColumn("DispRslt.str_ln_cd", MCColumnType.TEXT);
		p.columnDispRslt_str_ln_nm = p.beansFactory.createTableColumn("DispRslt.str_ln_nm", MCColumnType.TEXT);
		p.columnDispRslt_site_cd = p.beansFactory.createTableColumn("DispRslt.site_cd", MCColumnType.TEXT);
		p.columnDispRslt_site_nm = p.beansFactory.createTableColumn("DispRslt.site_nm", MCColumnType.TEXT);
		p.columnDispRslt_asst_typ = p.beansFactory.createTableColumn("DispRslt.asst_typ", MCColumnType.TEXT);
		p.columnDispRslt_asst_typ_nm = p.beansFactory.createTableColumn("DispRslt.asst_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_disp_seq = p.beansFactory.createTableColumn("DispRslt.disp_seq", MCColumnType.NUMBER);
		p.columnDispRslt_oper_cd = p.beansFactory.createTableColumn("DispRslt.oper_cd", MCColumnType.TEXT);
		p.columnDispRslt_oper_nm = p.beansFactory.createTableColumn("DispRslt.oper_nm", MCColumnType.TEXT);
		p.columnDispRslt_oper_seq = p.beansFactory.createTableColumn("DispRslt.oper_seq", MCColumnType.NUMBER);
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
		p.columnDispRslt_prov_typ = p.beansFactory.createTableColumn("DispRslt.prov_typ", MCColumnType.TEXT);
		p.columnDispRslt_prov_typ_nm = p.beansFactory.createTableColumn("DispRslt.prov_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_unit_cd = p.beansFactory.createTableColumn("DispRslt.unit_cd", MCColumnType.TEXT);
		p.columnDispRslt_unit_nm = p.beansFactory.createTableColumn("DispRslt.unit_nm", MCColumnType.TEXT);
		p.columnDispRslt_dec_place = p.beansFactory.createTableColumn("DispRslt.dec_place", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBAP0070 = p.beansFactory.createButton("Btn.open_MGBAP0070", "open");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBDP_ExpInptSrch p) {
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
	protected static void jbInitTop(MGBDP_ExpInptSrch p) {
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
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MGBDP_ExpInptSrch p) {
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
	protected static void jbInitTab1(MGBDP_ExpInptSrch p) {
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
	protected static void jbInitTab2(MGBDP_ExpInptSrch p) {
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
	protected static void jbInitTab3(MGBDP_ExpInptSrch p) {
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
	protected static void jbInitTab4(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel.setNextBeans(p.Tab5Panel);
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.TtlPanel, null);
		p.Tab4Panel.setLastBeans(p.TtlPanel);
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab5(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.Tab5Panel.setValueCheck(false);
		p.Tab5Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab5Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab5Panel.add(p.InsCndPanel, null);
		p.Tab5Panel.setLastBeans(p.InsCndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.ope_META);
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_no_p_PPanel.setNextBeans(p.Cnd_term);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setLinkBeans(p.Cnd_rmrks,p.Cnd_term);
		p.CndPanel.add(p.Cnd_term);
		p.Cnd_term.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_term.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.term_META);
		p.Cnd_term.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_mng_dpt_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_mng_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mng_dpt_cd, true);
		p.Cnd_mng_dpt_cd.setLinkBeans(p.Cnd_mng_dpt_nm);
		p.CndPanel.add(p.Cnd_mng_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_mng_dpt_cd);
		p.Cnd_mng_dpt_cd.setNextBeans(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.mng_dpt_cd_META);
		p.CndPanel.add(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_nm.setNextBeans(p.Cnd_par_itm_typ_p_PPanel);
		p.Cnd_mng_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.mng_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_mng_dpt_nm, true);
		p.CndPanel.add(p.Cnd_par_itm_typ_p_PPanel);
		p.Cnd_par_itm_typ_p_PPanel.setNextBeans(p.Cnd_par_itm_jnl_cd);
		p.Cnd_par_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_jnl_cd, true);
		p.Cnd_par_itm_jnl_cd.setLinkBeans(p.Cnd_par_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_par_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_par_itm_jnl_cd);
		p.Cnd_par_itm_jnl_cd.setNextBeans(p.Cnd_par_itm_jnl_nm);
		p.Cnd_par_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_par_itm_jnl_nm);
		p.Cnd_par_itm_jnl_nm.setNextBeans(p.Cnd_par_itm_p_PPanel);
		p.Cnd_par_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_jnl_nm_META);
		p.setPluralValueEnable(p.Cnd_par_itm_jnl_nm, true);
		p.CndPanel.add(p.Cnd_par_itm_p_PPanel);
		p.Cnd_par_itm_p_PPanel.setNextBeans(p.Cnd_itm_mfg_inst_no);
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
		p.CndPanel.add(p.Cnd_itm_mfg_inst_no_Label);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_no);
		p.Cnd_itm_mfg_inst_no.setNextBeans(p.Cnd_mfg_act_no);
		p.Cnd_itm_mfg_inst_no.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_mfg_inst_no_META);
		p.setPluralValueEnable(p.Cnd_itm_mfg_inst_no, true);
		p.CndPanel.add(p.Cnd_mfg_act_no_Label);
		p.CndPanel.add(p.Cnd_mfg_act_no);
		p.Cnd_mfg_act_no.setNextBeans(p.Cnd_asst_typ);
		p.Cnd_mfg_act_no.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.mfg_act_no_META);
		p.setPluralValueEnable(p.Cnd_mfg_act_no, true);
		p.Cnd_asst_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asst_typ, true);
		p.Cnd_asst_typ.setLinkBeans(p.Cnd_asst_typ_nm);
		p.CndPanel.add(p.Cnd_asst_typ_Label);
		p.CndPanel.add(p.Cnd_asst_typ);
		p.Cnd_asst_typ.setNextBeans(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.asst_typ_META);
		p.CndPanel.add(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ_nm.setNextBeans(p.Cnd_par_lot_no);
		p.Cnd_asst_typ_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.asst_typ_nm_META);
		p.CndPanel.add(p.Cnd_par_lot_no_Label);
		p.CndPanel.add(p.Cnd_par_lot_no);
		p.Cnd_par_lot_no.setNextBeans(p.Cnd_par_sublot_no);
		p.Cnd_par_lot_no.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_lot_no_META);
		p.setPluralValueEnable(p.Cnd_par_lot_no, true);
		p.CndPanel.add(p.Cnd_par_sublot_no);
		p.Cnd_par_sublot_no.setNextBeans(p.Cnd_par_sno1);
		p.Cnd_par_sublot_no.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_sublot_no_META);
		p.setPluralValueEnable(p.Cnd_par_sublot_no, true);
		p.CndPanel.add(p.Cnd_par_sno1_Label);
		p.CndPanel.add(p.Cnd_par_sno1);
		p.Cnd_par_sno1.setNextBeans(p.Cnd_par_sno2);
		p.Cnd_par_sno1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_sno1_META);
		p.setPluralValueEnable(p.Cnd_par_sno1, true);
		p.CndPanel.add(p.Cnd_par_sno2_Label);
		p.CndPanel.add(p.Cnd_par_sno2);
		p.Cnd_par_sno2.setNextBeans(p.Cnd_par_sno3);
		p.Cnd_par_sno2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_sno2_META);
		p.setPluralValueEnable(p.Cnd_par_sno2, true);
		p.CndPanel.add(p.Cnd_par_sno3_Label);
		p.CndPanel.add(p.Cnd_par_sno3);
		p.Cnd_par_sno3.setNextBeans(p.Cnd_par_sno4);
		p.Cnd_par_sno3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_sno3_META);
		p.setPluralValueEnable(p.Cnd_par_sno3, true);
		p.CndPanel.add(p.Cnd_par_sno4_Label);
		p.CndPanel.add(p.Cnd_par_sno4);
		p.Cnd_par_sno4.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_par_sno4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_sno4_META);
		p.setPluralValueEnable(p.Cnd_par_sno4, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_jnl_cd, true);
		p.Cnd_itm_jnl_cd.setLinkBeans(p.Cnd_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setNextBeans(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_jnl_nm_META);
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
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno1);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.sublot_no_META);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno1_Label);
		p.CndPanel.add(p.Cnd_sno1);
		p.Cnd_sno1.setNextBeans(p.Cnd_sno2);
		p.Cnd_sno1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.sno1_META);
		p.setPluralValueEnable(p.Cnd_sno1, true);
		p.CndPanel.add(p.Cnd_sno2_Label);
		p.CndPanel.add(p.Cnd_sno2);
		p.Cnd_sno2.setNextBeans(p.Cnd_sno3);
		p.Cnd_sno2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.sno2_META);
		p.setPluralValueEnable(p.Cnd_sno2, true);
		p.CndPanel.add(p.Cnd_sno3_Label);
		p.CndPanel.add(p.Cnd_sno3);
		p.Cnd_sno3.setNextBeans(p.Cnd_sno4);
		p.Cnd_sno3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.sno3_META);
		p.setPluralValueEnable(p.Cnd_sno3, true);
		p.CndPanel.add(p.Cnd_sno4_Label);
		p.CndPanel.add(p.Cnd_sno4);
		p.Cnd_sno4.setNextBeans(p.Cnd_site_cd);
		p.Cnd_sno4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.sno4_META);
		p.setPluralValueEnable(p.Cnd_sno4, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_oper_cd);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.Cnd_oper_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_cd, true);
		p.Cnd_oper_cd.setLinkBeans(p.Cnd_oper_nm);
		p.CndPanel.add(p.Cnd_oper_cd_Label);
		p.CndPanel.add(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setNextBeans(p.Cnd_oper_nm);
		p.Cnd_oper_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.oper_cd_META);
		p.CndPanel.add(p.Cnd_oper_nm);
		p.Cnd_oper_nm.setNextBeans(p.Cnd_prov_typ);
		p.Cnd_oper_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.oper_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_nm, true);
		p.Cnd_prov_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prov_typ, true);
		p.Cnd_prov_typ.setLinkBeans(p.Cnd_prov_typ_nm);
		p.CndPanel.add(p.Cnd_prov_typ_Label);
		p.CndPanel.add(p.Cnd_prov_typ);
		p.Cnd_prov_typ.setNextBeans(p.Cnd_prov_typ_nm);
		p.Cnd_prov_typ.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.prov_typ_META);
		p.CndPanel.add(p.Cnd_prov_typ_nm);
		p.Cnd_prov_typ_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.prov_typ_nm_META);
		p.Cnd_par_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd1, true);
		p.Cnd_par_itm_grp_cd1.setLinkBeans(p.Cnd_par_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_par_itm_grp_cd1);
		p.Cnd_par_itm_grp_cd1.setNextBeans(p.Cnd_par_itm_grp_nm1);
		p.Cnd_par_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm1);
		p.Cnd_par_itm_grp_nm1.setNextBeans(p.Cnd_par_itm_grp_cd2);
		p.Cnd_par_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm1, true);
		p.Cnd_par_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd2, true);
		p.Cnd_par_itm_grp_cd2.setLinkBeans(p.Cnd_par_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd2);
		p.Cnd_par_itm_grp_cd2.setNextBeans(p.Cnd_par_itm_grp_nm2);
		p.Cnd_par_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm2);
		p.Cnd_par_itm_grp_nm2.setNextBeans(p.Cnd_par_itm_grp_cd3);
		p.Cnd_par_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm2, true);
		p.Cnd_par_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd3, true);
		p.Cnd_par_itm_grp_cd3.setLinkBeans(p.Cnd_par_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd3);
		p.Cnd_par_itm_grp_cd3.setNextBeans(p.Cnd_par_itm_grp_nm3);
		p.Cnd_par_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm3);
		p.Cnd_par_itm_grp_nm3.setNextBeans(p.Cnd_par_itm_grp_cd4);
		p.Cnd_par_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm3, true);
		p.Cnd_par_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd4, true);
		p.Cnd_par_itm_grp_cd4.setLinkBeans(p.Cnd_par_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd4);
		p.Cnd_par_itm_grp_cd4.setNextBeans(p.Cnd_par_itm_grp_nm4);
		p.Cnd_par_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm4);
		p.Cnd_par_itm_grp_nm4.setNextBeans(p.Cnd_par_itm_grp_cd5);
		p.Cnd_par_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm4, true);
		p.Cnd_par_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd5, true);
		p.Cnd_par_itm_grp_cd5.setLinkBeans(p.Cnd_par_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd5);
		p.Cnd_par_itm_grp_cd5.setNextBeans(p.Cnd_par_itm_grp_nm5);
		p.Cnd_par_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm5);
		p.Cnd_par_itm_grp_nm5.setNextBeans(p.Cnd_par_itm_grp_cd6);
		p.Cnd_par_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm5, true);
		p.Cnd_par_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd6, true);
		p.Cnd_par_itm_grp_cd6.setLinkBeans(p.Cnd_par_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd6);
		p.Cnd_par_itm_grp_cd6.setNextBeans(p.Cnd_par_itm_grp_nm6);
		p.Cnd_par_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm6);
		p.Cnd_par_itm_grp_nm6.setNextBeans(p.Cnd_par_itm_grp_cd7);
		p.Cnd_par_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm6, true);
		p.Cnd_par_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd7, true);
		p.Cnd_par_itm_grp_cd7.setLinkBeans(p.Cnd_par_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd7);
		p.Cnd_par_itm_grp_cd7.setNextBeans(p.Cnd_par_itm_grp_nm7);
		p.Cnd_par_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm7);
		p.Cnd_par_itm_grp_nm7.setNextBeans(p.Cnd_par_itm_grp_cd8);
		p.Cnd_par_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm7, true);
		p.Cnd_par_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd8, true);
		p.Cnd_par_itm_grp_cd8.setLinkBeans(p.Cnd_par_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd8);
		p.Cnd_par_itm_grp_cd8.setNextBeans(p.Cnd_par_itm_grp_nm8);
		p.Cnd_par_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm8);
		p.Cnd_par_itm_grp_nm8.setNextBeans(p.Cnd_par_itm_grp_cd9);
		p.Cnd_par_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm8, true);
		p.Cnd_par_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd9, true);
		p.Cnd_par_itm_grp_cd9.setLinkBeans(p.Cnd_par_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd9);
		p.Cnd_par_itm_grp_cd9.setNextBeans(p.Cnd_par_itm_grp_nm9);
		p.Cnd_par_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm9);
		p.Cnd_par_itm_grp_nm9.setNextBeans(p.Cnd_par_itm_grp_cd10);
		p.Cnd_par_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm9, true);
		p.Cnd_par_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd10, true);
		p.Cnd_par_itm_grp_cd10.setLinkBeans(p.Cnd_par_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd10);
		p.Cnd_par_itm_grp_cd10.setNextBeans(p.Cnd_par_itm_grp_nm10);
		p.Cnd_par_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm10);
		p.Cnd_par_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm10, true);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd1);
		p.Cnd3Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_cd1_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_cd2_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_cd3_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_cd4_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_cd5_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_cd6_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_cd7_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_cd8_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_cd9_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Cnd3Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_cd10_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
		p.TtlPanel.add(p.Cnd_wg_flg);
		p.TtlPanel.setLastBeans(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setNextBeans(p.Cnd_mng_dpt_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.wg_flg_META);
		p.TtlPanel.add(p.Cnd_mng_dpt_flg);
		p.Cnd_mng_dpt_flg.setNextBeans(p.Cnd_par_itm_flg);
		p.Cnd_mng_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.mng_dpt_flg_META);
		p.TtlPanel.add(p.Cnd_par_itm_flg);
		p.Cnd_par_itm_flg.setNextBeans(p.Cnd_par_itm_typ_flg);
		p.Cnd_par_itm_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_flg_META);
		p.TtlPanel.add(p.Cnd_par_itm_typ_flg);
		p.Cnd_par_itm_typ_flg.setNextBeans(p.Cnd_par_itm_typ_d_flg);
		p.Cnd_par_itm_typ_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_typ_flg_META);
		p.TtlPanel.add(p.Cnd_par_itm_typ_d_flg);
		p.Cnd_par_itm_typ_d_flg.setNextBeans(p.Cnd_par_itm_jnl_flg);
		p.Cnd_par_itm_typ_d_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_typ_d_flg_META);
		p.TtlPanel.add(p.Cnd_par_itm_jnl_flg);
		p.Cnd_par_itm_jnl_flg.setNextBeans(p.Cnd_itm_mfg_inst_flg);
		p.Cnd_par_itm_jnl_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_itm_jnl_flg_META);
		p.TtlPanel.add(p.Cnd_itm_mfg_inst_flg);
		p.Cnd_itm_mfg_inst_flg.setNextBeans(p.Cnd_mfg_act_flg);
		p.Cnd_itm_mfg_inst_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.itm_mfg_inst_flg_META);
		p.TtlPanel.add(p.Cnd_mfg_act_flg);
		p.Cnd_mfg_act_flg.setNextBeans(p.Cnd_par_lot_flg);
		p.Cnd_mfg_act_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.mfg_act_flg_META);
		p.TtlPanel.add(p.Cnd_par_lot_flg);
		p.Cnd_par_lot_flg.setNextBeans(p.Cnd_par_sublot_flg);
		p.Cnd_par_lot_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_lot_flg_META);
		p.TtlPanel.add(p.Cnd_par_sublot_flg);
		p.Cnd_par_sublot_flg.setNextBeans(p.Cnd_par_sno1_flg);
		p.Cnd_par_sublot_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_sublot_flg_META);
		p.TtlPanel.add(p.Cnd_par_sno1_flg);
		p.Cnd_par_sno1_flg.setNextBeans(p.Cnd_par_sno2_flg);
		p.Cnd_par_sno1_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_sno1_flg_META);
		p.TtlPanel.add(p.Cnd_par_sno2_flg);
		p.Cnd_par_sno2_flg.setNextBeans(p.Cnd_par_sno3_flg);
		p.Cnd_par_sno2_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_sno2_flg_META);
		p.TtlPanel.add(p.Cnd_par_sno3_flg);
		p.Cnd_par_sno3_flg.setNextBeans(p.Cnd_par_sno4_flg);
		p.Cnd_par_sno3_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_sno3_flg_META);
		p.TtlPanel.add(p.Cnd_par_sno4_flg);
		p.Cnd_par_sno4_flg.setNextBeans(p.Cnd_loc_flg);
		p.Cnd_par_sno4_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.par_sno4_flg_META);
		p.TtlPanel.add(p.Cnd_loc_flg);
		p.Cnd_loc_flg.setNextBeans(p.Cnd_str_ln_flg);
		p.Cnd_loc_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.loc_flg_META);
		p.TtlPanel.add(p.Cnd_str_ln_flg);
		p.Cnd_str_ln_flg.setNextBeans(p.Cnd_site_flg);
		p.Cnd_str_ln_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.str_ln_flg_META);
		p.TtlPanel.add(p.Cnd_site_flg);
		p.Cnd_site_flg.setNextBeans(p.Cnd_asst_typ_flg);
		p.Cnd_site_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.site_flg_META);
		p.TtlPanel.add(p.Cnd_asst_typ_flg);
		p.Cnd_asst_typ_flg.setNextBeans(p.Cnd_disp_seq_flg);
		p.Cnd_asst_typ_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.asst_typ_flg_META);
		p.TtlPanel.add(p.Cnd_disp_seq_flg);
		p.Cnd_disp_seq_flg.setNextBeans(p.Cnd_oper_flg);
		p.Cnd_disp_seq_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.disp_seq_flg_META);
		p.TtlPanel.add(p.Cnd_oper_flg);
		p.Cnd_oper_flg.setNextBeans(p.Cnd_lot_flg);
		p.Cnd_oper_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.oper_flg_META);
		p.TtlPanel.add(p.Cnd_lot_flg);
		p.Cnd_lot_flg.setNextBeans(p.Cnd_sublot_flg);
		p.Cnd_lot_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.lot_flg_META);
		p.TtlPanel.add(p.Cnd_sublot_flg);
		p.Cnd_sublot_flg.setNextBeans(p.Cnd_sno1_flg);
		p.Cnd_sublot_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.sublot_flg_META);
		p.TtlPanel.add(p.Cnd_sno1_flg);
		p.Cnd_sno1_flg.setNextBeans(p.Cnd_sno2_flg);
		p.Cnd_sno1_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.sno1_flg_META);
		p.TtlPanel.add(p.Cnd_sno2_flg);
		p.Cnd_sno2_flg.setNextBeans(p.Cnd_sno3_flg);
		p.Cnd_sno2_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.sno2_flg_META);
		p.TtlPanel.add(p.Cnd_sno3_flg);
		p.Cnd_sno3_flg.setNextBeans(p.Cnd_sno4_flg);
		p.Cnd_sno3_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.sno3_flg_META);
		p.TtlPanel.add(p.Cnd_sno4_flg);
		p.Cnd_sno4_flg.setNextBeans(p.Cnd_prov_typ_flg);
		p.Cnd_sno4_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.sno4_flg_META);
		p.TtlPanel.add(p.Cnd_prov_typ_flg);
		p.Cnd_prov_typ_flg.setNextBeans(p.Cnd_select_all);
		p.Cnd_prov_typ_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0120.CndR.prov_typ_flg_META);
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
	protected static void jbInitCnd2(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTtl(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.TtlPanel.setValueCheck(false);
		p.TtlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [InsCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitInsCnd(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.InsCndPanel.setValueCheck(false);
		p.InsCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.InsCndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.InsCnd_calc_grp_cd.setListType(MCListType.STRICT);
		p.InsCnd_calc_grp_cd.setLinkBeans(p.InsCnd_calc_grp_nm);
		p.InsCndPanel.add(p.InsCnd_calc_grp_cd_Label);
		p.InsCndPanel.add(p.InsCnd_calc_grp_cd);
		p.InsCndPanel.setLastBeans(p.InsCnd_calc_grp_cd);
		p.InsCnd_calc_grp_cd.setNextBeans(p.InsCnd_calc_grp_nm);
		p.InsCnd_calc_grp_cd.setRow(p.getInsCndR(), mcframe.clientMGBD.MGBDP0120.InsCndR.calc_grp_cd_META);
		p.InsCndPanel.add(p.InsCnd_calc_grp_nm);
		p.InsCnd_calc_grp_nm.setNextBeans(p.InsCnd_calc_no_p_PPanel);
		p.InsCnd_calc_grp_nm.setRow(p.getInsCndR(), mcframe.clientMGBD.MGBDP0120.InsCndR.calc_grp_nm_META);
		p.InsCndPanel.add(p.InsCnd_calc_no_p_PPanel);
		p.InsCnd_calc_no_p_PPanel.setNextBeans(p.InsCnd_st_ym);
		p.InsCnd_calc_no_p_PPanel.CalcNo_calc_no.setLinkBeans(p.InsCnd_rmrks,p.InsCnd_st_ym,p.InsCnd_end_ym);
		p.InsCndPanel.add(p.InsCnd_st_ym);
		p.InsCnd_st_ym.setNextBeans(p.InsCnd_end_ym);
		p.InsCnd_st_ym.setRow(p.getInsCndR(), mcframe.clientMGBD.MGBDP0120.InsCndR.st_ym_META);
		p.InsCnd_st_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.InsCndPanel.add(p.InsCnd_end_ym);
		p.InsCnd_end_ym.setNextBeans(p.InsCnd_wg_cd);
		p.InsCnd_end_ym.setRow(p.getInsCndR(), mcframe.clientMGBD.MGBDP0120.InsCndR.end_ym_META);
		p.InsCnd_end_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.InsCnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.InsCnd_wg_cd, true);
		p.InsCnd_wg_cd.setLinkBeans(p.InsCnd_wg_nm);
		p.InsCndPanel.add(p.InsCnd_wg_cd_Label);
		p.InsCndPanel.add(p.InsCnd_wg_cd);
		p.InsCnd_wg_cd.setNextBeans(p.InsCnd_wg_nm);
		p.InsCnd_wg_cd.setRow(p.getInsCndR(), mcframe.clientMGBD.MGBDP0120.InsCndR.wg_cd_META);
		p.InsCndPanel.add(p.InsCnd_wg_nm);
		p.InsCnd_wg_nm.setNextBeans(p.InsCnd_calc_ctg_cd);
		p.InsCnd_wg_nm.setRow(p.getInsCndR(), mcframe.clientMGBD.MGBDP0120.InsCndR.wg_nm_META);
		p.InsCnd_calc_ctg_cd.setListType(MCListType.STRICT);
		p.InsCnd_calc_ctg_cd.setLinkBeans(p.InsCnd_calc_ctg_nm);
		p.InsCndPanel.add(p.InsCnd_calc_ctg_cd_Label);
		p.InsCndPanel.add(p.InsCnd_calc_ctg_cd);
		p.InsCnd_calc_ctg_cd.setNextBeans(p.InsCnd_calc_ctg_nm);
		p.InsCnd_calc_ctg_cd.setRow(p.getInsCndR(), mcframe.clientMGBD.MGBDP0120.InsCndR.calc_ctg_cd_META);
		p.InsCndPanel.add(p.InsCnd_calc_ctg_nm);
		p.InsCnd_calc_ctg_nm.setNextBeans(p.InsCnd_amt_flg);
		p.InsCnd_calc_ctg_nm.setRow(p.getInsCndR(), mcframe.clientMGBD.MGBDP0120.InsCndR.calc_ctg_nm_META);
		p.InsCndPanel.add(p.InsCnd_amt_flg);
		p.InsCnd_amt_flg.setRow(p.getInsCndR(), mcframe.clientMGBD.MGBDP0120.InsCndR.amt_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBDP_ExpInptSrch p) {
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
	protected static void jbInitDispRslt(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.add(p.DispRsltPanel);
		p.DispRsltPanel.setNextBeans(p.BtnPanel);
		p.DispRsltPanel.add(p.DispRsltScrollPane);
		p.DispRsltPanel.setLastBeans(p.DispRsltTable);
		p.DispRsltScrollPane.setViewportView(p.DispRsltTable);
		p.DispRsltTable.setList(p.getDispRsltL());
		p.DispRsltTable.setStatusColumnVisible(false);
		p.DispRsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBDP_ExpInptSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MGBAP0070.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBAP0070);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBAP0070);
		p.Btn_open_MGBAP0070.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
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
		MGBDP_ExpInptSrch_MC.mcInitScreenOpe((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.mcInitTop((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.mcInitFold((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.mcInitTab1((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.mcInitTab2((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.mcInitTab3((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.mcInitTab4((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.mcInitTab5((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.mcInitCnd((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.mcInitCnd2((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.mcInitCnd3((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.mcInitTtl((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.mcInitInsCnd((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.mcInitCtrl((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.mcInitDispRslt((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.mcInitBtn((MGBDP_ExpInptSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBDP_ExpInptSrch_MC.statusInitSRCH_ScreenOpe((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_Top((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_Fold((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_Tab1((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_Tab2((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_Tab3((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_Tab4((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_Tab5((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_Cnd((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_Cnd2((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_Cnd3((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_Ttl((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_InsCnd((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_Ctrl((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_DispRslt((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_Rslt((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_Btn((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitSRCH_Rslt2((MGBDP_ExpInptSrch)this);

		// [REF]ステータスのモードの設定
		MGBDP_ExpInptSrch_MC.statusInitREF_ScreenOpe((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_Top((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_Fold((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_Tab1((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_Tab2((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_Tab3((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_Tab4((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_Tab5((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_Cnd((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_Cnd2((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_Cnd3((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_Ttl((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_InsCnd((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_Ctrl((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_DispRslt((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_Rslt((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_Btn((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitREF_Rslt2((MGBDP_ExpInptSrch)this);

		// [INS]ステータスのモードの設定
		MGBDP_ExpInptSrch_MC.statusInitINS_ScreenOpe((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_Top((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_Fold((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_Tab1((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_Tab2((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_Tab3((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_Tab4((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_Tab5((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_Cnd((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_Cnd2((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_Cnd3((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_Ttl((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_InsCnd((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_Ctrl((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_DispRslt((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_Rslt((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_Btn((MGBDP_ExpInptSrch)this);
		MGBDP_ExpInptSrch_MC.statusInitINS_Rslt2((MGBDP_ExpInptSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBDP_ExpInptSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBDP_ExpInptSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBDP_ExpInptSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBDP_ExpInptSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBDP_ExpInptSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MGBDP_ExpInptSrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MGBDP_ExpInptSrch p) {
	}

	/**
	 *  [Tab5]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab5(MGBDP_ExpInptSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_ExpInptSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
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
		p.Cnd_par_itm_jnl_cd.setListListener(p);
		p.Cnd_par_itm_jnl_cd.addAllListener(p);
		p.Cnd_par_itm_jnl_nm.setListListener(p);
		p.Cnd_par_itm_jnl_nm.addAllListener(p);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_mfg_inst_no.setListListener(p);
		p.Cnd_itm_mfg_inst_no.addAllListener(p);
		p.Cnd_mfg_act_no.setListListener(p);
		p.Cnd_mfg_act_no.addAllListener(p);
		p.Cnd_asst_typ.setListListener(p);
		p.Cnd_asst_typ.addAllListener(p);
		p.Cnd_asst_typ_nm.setListListener(p);
		p.Cnd_asst_typ_nm.addAllListener(p);
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
		p.Cnd_prov_typ.setListListener(p);
		p.Cnd_prov_typ.addAllListener(p);
		p.Cnd_prov_typ_nm.setListListener(p);
		p.Cnd_prov_typ_nm.addAllListener(p);
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
		p.Cnd_itm_mfg_inst_flg.addAllListener(p);
		p.Cnd_mfg_act_flg.addAllListener(p);
		p.Cnd_par_lot_flg.addAllListener(p);
		p.Cnd_par_sublot_flg.addAllListener(p);
		p.Cnd_par_sno1_flg.addAllListener(p);
		p.Cnd_par_sno2_flg.addAllListener(p);
		p.Cnd_par_sno3_flg.addAllListener(p);
		p.Cnd_par_sno4_flg.addAllListener(p);
		p.Cnd_loc_flg.addAllListener(p);
		p.Cnd_str_ln_flg.addAllListener(p);
		p.Cnd_site_flg.addAllListener(p);
		p.Cnd_asst_typ_flg.addAllListener(p);
		p.Cnd_disp_seq_flg.addAllListener(p);
		p.Cnd_oper_flg.addAllListener(p);
		p.Cnd_lot_flg.addAllListener(p);
		p.Cnd_sublot_flg.addAllListener(p);
		p.Cnd_sno1_flg.addAllListener(p);
		p.Cnd_sno2_flg.addAllListener(p);
		p.Cnd_sno3_flg.addAllListener(p);
		p.Cnd_sno4_flg.addAllListener(p);
		p.Cnd_prov_typ_flg.addAllListener(p);
		p.Cnd_select_all.addAllListener(p);
		p.Cnd_select_all.setAPMethodName("doCnd_select_all");
		p.Cnd_deselect_all.addAllListener(p);
		p.Cnd_deselect_all.setAPMethodName("doCnd_deselect_all");
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBDP_ExpInptSrch p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MGBDP_ExpInptSrch p) {
	}

	/**
	 *  [Ttl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTtl(MGBDP_ExpInptSrch p) {
	}

	/**
	 *  [InsCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitInsCnd(MGBDP_ExpInptSrch p) {
		p.InsCnd_calc_grp_cd.setListListener(p);
		p.InsCnd_calc_grp_cd.addAllListener(p);
		p.InsCnd_calc_grp_nm.setListListener(p);
		p.InsCnd_calc_grp_nm.addAllListener(p);
		p.InsCnd_calc_no_p_PPanel.CalcNo_calc_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.InsCnd_st_ym.setListListener(p);
		p.InsCnd_st_ym.addAllListener(p);
		p.InsCnd_end_ym.setListListener(p);
		p.InsCnd_end_ym.addAllListener(p);
		p.InsCnd_wg_cd.setListListener(p);
		p.InsCnd_wg_cd.addAllListener(p);
		p.InsCnd_wg_nm.setListListener(p);
		p.InsCnd_wg_nm.addAllListener(p);
		p.InsCnd_calc_ctg_cd.setListListener(p);
		p.InsCnd_calc_ctg_cd.addAllListener(p);
		p.InsCnd_calc_ctg_nm.setListListener(p);
		p.InsCnd_calc_ctg_nm.addAllListener(p);
		p.InsCnd_amt_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBDP_ExpInptSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispRslt(MGBDP_ExpInptSrch p) {
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
		p.columnDispRslt_itm_mfg_inst_no.addAllListener(p);
		p.columnDispRslt_itm_mfg_inst_no.setListListener(p);
		p.columnDispRslt_mfg_act_no.addAllListener(p);
		p.columnDispRslt_mfg_act_no.setListListener(p);
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
		p.columnDispRslt_asst_typ.addAllListener(p);
		p.columnDispRslt_asst_typ.setListListener(p);
		p.columnDispRslt_asst_typ_nm.addAllListener(p);
		p.columnDispRslt_asst_typ_nm.setListListener(p);
		p.columnDispRslt_disp_seq.addAllListener(p);
		p.columnDispRslt_disp_seq.setListListener(p);
		p.columnDispRslt_oper_cd.addAllListener(p);
		p.columnDispRslt_oper_cd.setListListener(p);
		p.columnDispRslt_oper_nm.addAllListener(p);
		p.columnDispRslt_oper_nm.setListListener(p);
		p.columnDispRslt_oper_seq.addAllListener(p);
		p.columnDispRslt_oper_seq.setListListener(p);
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
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBDP_ExpInptSrch p) {
		p.Btn_open_MGBAP0070.addAllListener(p);
		p.Btn_open_MGBAP0070.setAPMethodName("doBtn_open_MGBAP0070");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MGBDP_ExpInptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBDP_ExpInptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBDP_ExpInptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MGBDP_ExpInptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MGBDP_ExpInptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MGBDP_ExpInptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab4(MGBDP_ExpInptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab5(MGBDP_ExpInptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBDP_ExpInptSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_term.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_par_itm_jnl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_jnl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_par_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_sno1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_sno2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_sno3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_sno4.putMode(p, SRCH, MCMode.ENABLE);
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
		p.Cnd_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prov_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.Cnd_itm_mfg_inst_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_mfg_act_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_lot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_sublot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_sno1_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_sno2_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_sno3_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_sno4_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_loc_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_str_ln_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_site_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_asst_typ_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_disp_seq_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_oper_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_lot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sublot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno1_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno2_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno3_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno4_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_prov_typ_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MGBDP_ExpInptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MGBDP_ExpInptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ttl(MGBDP_ExpInptSrch p){

	}

	/**
	 * [SRCH]ステータスの[InsCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_InsCnd(MGBDP_ExpInptSrch p){
		p.InsCnd_calc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.InsCnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.InsCnd_calc_no_p_PPanel.putStatus(SRCH, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.READ_ONLY);
		p.InsCnd_st_ym.putMode(p, SRCH, MCMode.INVISIBLE);
		p.InsCnd_end_ym.putMode(p, SRCH, MCMode.INVISIBLE);
		p.InsCnd_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.InsCnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.InsCnd_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.InsCnd_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.InsCnd_amt_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBDP_ExpInptSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DispRslt(MGBDP_ExpInptSrch p){
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
		p.columnDispRslt_itm_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_mfg_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_oper_seq.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.columnDispRslt_prov_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.DispRslt_ttl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
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

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBDP_ExpInptSrch p){

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MGBDP_ExpInptSrch p){
		p.Btn_open_MGBAP0070.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt2(MGBDP_ExpInptSrch p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBDP_ExpInptSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBDP_ExpInptSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBDP_ExpInptSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBDP_ExpInptSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBDP_ExpInptSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MGBDP_ExpInptSrch p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MGBDP_ExpInptSrch p){

	}

	/**
	 * [REF]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab5(MGBDP_ExpInptSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBDP_ExpInptSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_term.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_par_itm_jnl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_jnl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_par_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_sno1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_sno2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_sno3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_sno4.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prov_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prov_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.Cnd_itm_mfg_inst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mfg_act_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_lot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_sublot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_sno1_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_sno2_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_sno3_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_sno4_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_loc_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_str_ln_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_site_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_asst_typ_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_disp_seq_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_oper_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_lot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sublot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno1_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno2_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno3_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno4_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_prov_typ_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBDP_ExpInptSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MGBDP_ExpInptSrch p){

	}

	/**
	 * [REF]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ttl(MGBDP_ExpInptSrch p){

	}

	/**
	 * [REF]ステータスの[InsCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_InsCnd(MGBDP_ExpInptSrch p){
		p.InsCnd_calc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.InsCnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.InsCnd_calc_no_p_PPanel.putStatus(REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.READ_ONLY);
		p.InsCnd_st_ym.putMode(p, REF, MCMode.INVISIBLE);
		p.InsCnd_end_ym.putMode(p, REF, MCMode.INVISIBLE);
		p.InsCnd_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.InsCnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.InsCnd_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.InsCnd_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.InsCnd_amt_flg.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBDP_ExpInptSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispRslt(MGBDP_ExpInptSrch p){
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
		p.columnDispRslt_itm_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_mfg_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_oper_seq.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnDispRslt_prov_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_prov_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.DispRslt_ttl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
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

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBDP_ExpInptSrch p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBDP_ExpInptSrch p){
		p.Btn_open_MGBAP0070.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Rslt2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt2(MGBDP_ExpInptSrch p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MGBDP_ExpInptSrch p){

	}

	/**
	 * [INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS_Top(MGBDP_ExpInptSrch p){

	}

	/**
	 * [INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS_Fold(MGBDP_ExpInptSrch p){

	}

	/**
	 * [INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab1(MGBDP_ExpInptSrch p){

	}

	/**
	 * [INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab2(MGBDP_ExpInptSrch p){

	}

	/**
	 * [INS]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab3(MGBDP_ExpInptSrch p){

	}

	/**
	 * [INS]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab4(MGBDP_ExpInptSrch p){

	}

	/**
	 * [INS]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab5(MGBDP_ExpInptSrch p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MGBDP_ExpInptSrch p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_calc_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(INS, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.READ_ONLY);
		p.Cnd_term.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_mng_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_mng_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_par_itm_jnl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_jnl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_itm_mfg_inst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_mfg_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_asst_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_asst_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_lot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_sublot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_sno1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_sno2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_sno3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_sno4.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_jnl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_jnl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_lot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno4.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_oper_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_oper_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_prov_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_prov_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd4.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm4.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd5.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm5.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd6.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm6.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd7.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm7.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd8.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm8.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd9.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm9.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd10.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm10.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_cd1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_cd2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_cd3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_cd4.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_nm4.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_cd5.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_nm5.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_cd6.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_nm6.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_cd7.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_nm7.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_cd8.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_nm8.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_cd9.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_nm9.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_cd10.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_grp_nm10.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_mng_dpt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_typ_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_typ_d_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_jnl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_mfg_inst_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_mfg_act_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_lot_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_sublot_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_sno1_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_sno2_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_sno3_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_sno4_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_loc_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_str_ln_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_site_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_asst_typ_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_disp_seq_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_oper_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_lot_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sublot_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno1_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno2_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno3_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno4_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_prov_typ_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_select_all.putMode(p, INS, MCMode.DISABLE);
		p.Cnd_deselect_all.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd2(MGBDP_ExpInptSrch p){

	}

	/**
	 * [INS]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd3(MGBDP_ExpInptSrch p){

	}

	/**
	 * [INS]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ttl(MGBDP_ExpInptSrch p){

	}

	/**
	 * [INS]ステータスの[InsCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_InsCnd(MGBDP_ExpInptSrch p){
		p.InsCnd_calc_grp_cd.putMode(p, INS, MCMode.REQUIRED);
		p.InsCnd_calc_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.InsCnd_calc_no_p_PPanel.putStatus(INS, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.InsCnd_st_ym.putMode(p, INS, MCMode.INVISIBLE);
		p.InsCnd_end_ym.putMode(p, INS, MCMode.INVISIBLE);
		p.InsCnd_wg_cd.putMode(p, INS, MCMode.ENABLE);
		p.InsCnd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.InsCnd_calc_ctg_cd.putMode(p, INS, MCMode.REQUIRED);
		p.InsCnd_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.InsCnd_amt_flg.putMode(p, INS, MCMode.REQUIRED);

	}

	/**
	 * [INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ctrl(MGBDP_ExpInptSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(INS, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [INS]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_DispRslt(MGBDP_ExpInptSrch p){
		p.columnDispRslt_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DispRslt_par_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDispRslt_par_itm_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_typ_d_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_typ_d_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_jnl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_par_itm_jnl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_itm_mfg_inst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_mfg_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_par_lot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_par_sublot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_par_sno4.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_site_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_site_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_disp_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_oper_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_oper_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_oper_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.DispRslt_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDispRslt_itm_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_d_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_itm_typ_d_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_itm_jnl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_itm_jnl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_lot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_sublot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_sno1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_sno2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_sno3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_sno4.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_prov_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_prov_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDispRslt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.DispRslt_ttl_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispRslt_qty_00_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.DispRslt_qty_01_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.DispRslt_qty_02_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.DispRslt_qty_03_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.DispRslt_qty_04_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.DispRslt_qty_05_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.DispRslt_qty_06_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.DispRslt_qty_07_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.DispRslt_qty_08_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.DispRslt_qty_09_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.DispRslt_qty_10_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.DispRslt_qty_11_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MGBDP_ExpInptSrch p){

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MGBDP_ExpInptSrch p){
		p.Btn_open_MGBAP0070.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Rslt2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt2(MGBDP_ExpInptSrch p){

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
		MGBDP_ExpInptSrch_MC.setTableConfigDispRslt((MGBDP_ExpInptSrch)this);
	}

	/**
	 * [DispRslt]ブロックのTableの設定
	 */
	protected static void setTableConfigDispRslt(MGBDP_ExpInptSrch p) {
		p.columnDispRslt_wg_cd.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.wg_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_cd);
		p.columnDispRslt_wg_nm.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.wg_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_nm);
		p.columnDispRslt_mng_dpt_cd.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.mng_dpt_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_cd);
		p.columnDispRslt_mng_dpt_nm.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.mng_dpt_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_nm);
		p.DispRsltTable.addTable(p.DispRslt_par_itm_p_PPanel.ItmTable);
		p.columnDispRslt_par_itm_typ.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.par_itm_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_typ);
		p.columnDispRslt_par_itm_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.par_itm_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_typ_nm);
		p.columnDispRslt_par_itm_typ_d_cd.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.par_itm_typ_d_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_typ_d_cd);
		p.columnDispRslt_par_itm_typ_d_nm.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.par_itm_typ_d_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_typ_d_nm);
		p.columnDispRslt_par_itm_jnl_cd.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.par_itm_jnl_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_jnl_cd);
		p.columnDispRslt_par_itm_jnl_nm.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.par_itm_jnl_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_itm_jnl_nm);
		p.columnDispRslt_itm_mfg_inst_no.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.itm_mfg_inst_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_mfg_inst_no);
		p.columnDispRslt_mfg_act_no.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.mfg_act_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mfg_act_no);
		p.columnDispRslt_par_lot_no.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.par_lot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_lot_no);
		p.columnDispRslt_par_sublot_no.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.par_sublot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_sublot_no);
		p.columnDispRslt_par_sno1.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.par_sno1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_sno1);
		p.columnDispRslt_par_sno2.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.par_sno2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_sno2);
		p.columnDispRslt_par_sno3.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.par_sno3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_sno3);
		p.columnDispRslt_par_sno4.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.par_sno4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_par_sno4);
		p.columnDispRslt_loc_cd.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.loc_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_loc_cd);
		p.columnDispRslt_loc_nm.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.loc_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_loc_nm);
		p.columnDispRslt_str_ln_cd.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.str_ln_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_str_ln_cd);
		p.columnDispRslt_str_ln_nm.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.str_ln_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_str_ln_nm);
		p.columnDispRslt_site_cd.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.site_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_site_cd);
		p.columnDispRslt_site_nm.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.site_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_site_nm);
		p.columnDispRslt_asst_typ.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.asst_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_asst_typ);
		p.columnDispRslt_asst_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.asst_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_asst_typ_nm);
		p.columnDispRslt_disp_seq.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.disp_seq_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_disp_seq);
		p.columnDispRslt_oper_cd.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.oper_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_oper_cd);
		p.columnDispRslt_oper_nm.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.oper_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_oper_nm);
		p.columnDispRslt_oper_seq.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.oper_seq_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_oper_seq);
		p.DispRsltTable.addTable(p.DispRslt_itm_p_PPanel.ItmTable);
		p.columnDispRslt_itm_typ.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.itm_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ);
		p.columnDispRslt_itm_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.itm_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_nm);
		p.columnDispRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.itm_typ_d_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_cd);
		p.columnDispRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.itm_typ_d_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_nm);
		p.columnDispRslt_itm_jnl_cd.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.itm_jnl_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_jnl_cd);
		p.columnDispRslt_itm_jnl_nm.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.itm_jnl_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_jnl_nm);
		p.columnDispRslt_lot_no.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.lot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_lot_no);
		p.columnDispRslt_sublot_no.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.sublot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sublot_no);
		p.columnDispRslt_sno1.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.sno1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno1);
		p.columnDispRslt_sno2.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.sno2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno2);
		p.columnDispRslt_sno3.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.sno3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno3);
		p.columnDispRslt_sno4.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.sno4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno4);
		p.columnDispRslt_prov_typ.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.prov_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_prov_typ);
		p.columnDispRslt_prov_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.prov_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_prov_typ_nm);
		p.columnDispRslt_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.unit_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_unit_cd);
		p.columnDispRslt_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.unit_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_unit_nm);
		p.columnDispRslt_dec_place.setMeta(mcframe.clientMGBD.MGBDP0120.DispRsltR.dec_place_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dec_place);
		p.DispRsltTable.addTable(p.DispRslt_ttl_qty_p_PPanel.QtyTable);
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
		Cnd_par_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_jnl_cd.getListConfig().setPutter(getCnd_par_itm_jnl_cd_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_asst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_asst_typ.getListConfig().setPutter(getCnd_asst_typ_ListPutter());
		Cnd_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_jnl_cd.getListConfig().setPutter(getCnd_itm_jnl_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
		Cnd_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_cd.getListConfig().setPutter(getCnd_oper_cd_ListPutter());
		Cnd_prov_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prov_typ.getListConfig().setPutter(getCnd_prov_typ_ListPutter());
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
		InsCnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		InsCnd_calc_grp_cd.getListConfig().setPutter(getInsCnd_calc_grp_cd_ListPutter());
		InsCnd_calc_no_p_PPanel.CalcNo_calc_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		InsCnd_calc_no_p_PPanel.CalcNo_calc_no.getListConfig().setPutter(getInsCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter());
		InsCnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		InsCnd_wg_cd.getListConfig().setPutter(getInsCnd_wg_cd_ListPutter());
		InsCnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		InsCnd_calc_ctg_cd.getListConfig().setPutter(getInsCnd_calc_ctg_cd_ListPutter());
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
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
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
		else if (INS.equals(status)) {
			setINSStatus();
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
	 * [Cnd_asst_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_asst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AsstTyp");
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
	 * [Cnd_prov_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prov_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvTyp");
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
	 * [InsCnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createInsCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcGrp");
		return lp;
	}
	 
	/**
	 * [InsCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の作成
	 */
	protected MCListPutter createInsCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CalcNo");
		return lp;
	}

	/**
	 * [InsCnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createInsCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [InsCnd_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createInsCnd_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
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
		if(combo == Cnd_par_itm_jnl_cd) return getCnd_par_itm_jnl_cd(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_cd) return getCnd_par_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub1) return getCnd_par_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub2) return getCnd_par_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub3) return getCnd_par_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_asst_typ) return getCnd_asst_typ(row, info);
		if(combo == Cnd_itm_jnl_cd) return getCnd_itm_jnl_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_oper_cd) return getCnd_oper_cd(row, info);
		if(combo == Cnd_prov_typ) return getCnd_prov_typ(row, info);
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
		if(combo == InsCnd_calc_grp_cd) return getInsCnd_calc_grp_cd(row, info);
		if(combo == InsCnd_calc_no_p_PPanel.CalcNo_calc_no) return getInsCnd_calc_no_p_PPanel_CalcNo_calc_no(row, info);
		if(combo == InsCnd_wg_cd) return getInsCnd_wg_cd(row, info);
		if(combo == InsCnd_calc_ctg_cd) return getInsCnd_calc_ctg_cd(row, info);
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
		else if (ap == Btn_open_MGBAP0070) doBtn_open_MGBAP0070(info);
		else if (ap == Btn_ins) doBtn_ins(info);
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
	 * [Btn]パネルの[open_MGBAP0070]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBAP0070(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_term) return doCnd_term_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_mng_dpt_cd) return doCnd_mng_dpt_cd_VC(info);
		if (vc == Cnd_mng_dpt_nm) return doCnd_mng_dpt_nm_VC(info);
		if (vc == Cnd_par_itm_jnl_cd) return doCnd_par_itm_jnl_cd_VC(info);
		if (vc == Cnd_par_itm_jnl_nm) return doCnd_par_itm_jnl_nm_VC(info);
		if (vc == Cnd_itm_mfg_inst_no) return doCnd_itm_mfg_inst_no_VC(info);
		if (vc == Cnd_mfg_act_no) return doCnd_mfg_act_no_VC(info);
		if (vc == Cnd_asst_typ) return doCnd_asst_typ_VC(info);
		if (vc == Cnd_asst_typ_nm) return doCnd_asst_typ_nm_VC(info);
		if (vc == Cnd_par_lot_no) return doCnd_par_lot_no_VC(info);
		if (vc == Cnd_par_sublot_no) return doCnd_par_sublot_no_VC(info);
		if (vc == Cnd_par_sno1) return doCnd_par_sno1_VC(info);
		if (vc == Cnd_par_sno2) return doCnd_par_sno2_VC(info);
		if (vc == Cnd_par_sno3) return doCnd_par_sno3_VC(info);
		if (vc == Cnd_par_sno4) return doCnd_par_sno4_VC(info);
		if (vc == Cnd_itm_jnl_cd) return doCnd_itm_jnl_cd_VC(info);
		if (vc == Cnd_itm_jnl_nm) return doCnd_itm_jnl_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_sno1) return doCnd_sno1_VC(info);
		if (vc == Cnd_sno2) return doCnd_sno2_VC(info);
		if (vc == Cnd_sno3) return doCnd_sno3_VC(info);
		if (vc == Cnd_sno4) return doCnd_sno4_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_oper_cd) return doCnd_oper_cd_VC(info);
		if (vc == Cnd_oper_nm) return doCnd_oper_nm_VC(info);
		if (vc == Cnd_prov_typ) return doCnd_prov_typ_VC(info);
		if (vc == Cnd_prov_typ_nm) return doCnd_prov_typ_nm_VC(info);
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
		if (vc == Cnd_itm_mfg_inst_flg) return doCnd_itm_mfg_inst_flg_VC(info);
		if (vc == Cnd_mfg_act_flg) return doCnd_mfg_act_flg_VC(info);
		if (vc == Cnd_par_lot_flg) return doCnd_par_lot_flg_VC(info);
		if (vc == Cnd_par_sublot_flg) return doCnd_par_sublot_flg_VC(info);
		if (vc == Cnd_par_sno1_flg) return doCnd_par_sno1_flg_VC(info);
		if (vc == Cnd_par_sno2_flg) return doCnd_par_sno2_flg_VC(info);
		if (vc == Cnd_par_sno3_flg) return doCnd_par_sno3_flg_VC(info);
		if (vc == Cnd_par_sno4_flg) return doCnd_par_sno4_flg_VC(info);
		if (vc == Cnd_loc_flg) return doCnd_loc_flg_VC(info);
		if (vc == Cnd_str_ln_flg) return doCnd_str_ln_flg_VC(info);
		if (vc == Cnd_site_flg) return doCnd_site_flg_VC(info);
		if (vc == Cnd_asst_typ_flg) return doCnd_asst_typ_flg_VC(info);
		if (vc == Cnd_disp_seq_flg) return doCnd_disp_seq_flg_VC(info);
		if (vc == Cnd_oper_flg) return doCnd_oper_flg_VC(info);
		if (vc == Cnd_lot_flg) return doCnd_lot_flg_VC(info);
		if (vc == Cnd_sublot_flg) return doCnd_sublot_flg_VC(info);
		if (vc == Cnd_sno1_flg) return doCnd_sno1_flg_VC(info);
		if (vc == Cnd_sno2_flg) return doCnd_sno2_flg_VC(info);
		if (vc == Cnd_sno3_flg) return doCnd_sno3_flg_VC(info);
		if (vc == Cnd_sno4_flg) return doCnd_sno4_flg_VC(info);
		if (vc == Cnd_prov_typ_flg) return doCnd_prov_typ_flg_VC(info);
		if (vc == InsCnd_calc_grp_cd) return doInsCnd_calc_grp_cd_VC(info);
		if (vc == InsCnd_calc_grp_nm) return doInsCnd_calc_grp_nm_VC(info);
		if (vc == InsCnd_st_ym) return doInsCnd_st_ym_VC(info);
		if (vc == InsCnd_end_ym) return doInsCnd_end_ym_VC(info);
		if (vc == InsCnd_wg_cd) return doInsCnd_wg_cd_VC(info);
		if (vc == InsCnd_wg_nm) return doInsCnd_wg_nm_VC(info);
		if (vc == InsCnd_calc_ctg_cd) return doInsCnd_calc_ctg_cd_VC(info);
		if (vc == InsCnd_calc_ctg_nm) return doInsCnd_calc_ctg_nm_VC(info);
		if (vc == InsCnd_amt_flg) return doInsCnd_amt_flg_VC(info);
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
		if (vc == columnDispRslt_itm_mfg_inst_no) return doDispRslt_itm_mfg_inst_no_VC(info);
		if (vc == columnDispRslt_mfg_act_no) return doDispRslt_mfg_act_no_VC(info);
		if (vc == columnDispRslt_par_lot_no) return doDispRslt_par_lot_no_VC(info);
		if (vc == columnDispRslt_par_sublot_no) return doDispRslt_par_sublot_no_VC(info);
		if (vc == columnDispRslt_par_sno1) return doDispRslt_par_sno1_VC(info);
		if (vc == columnDispRslt_par_sno2) return doDispRslt_par_sno2_VC(info);
		if (vc == columnDispRslt_par_sno3) return doDispRslt_par_sno3_VC(info);
		if (vc == columnDispRslt_par_sno4) return doDispRslt_par_sno4_VC(info);
		if (vc == columnDispRslt_loc_cd) return doDispRslt_loc_cd_VC(info);
		if (vc == columnDispRslt_loc_nm) return doDispRslt_loc_nm_VC(info);
		if (vc == columnDispRslt_str_ln_cd) return doDispRslt_str_ln_cd_VC(info);
		if (vc == columnDispRslt_str_ln_nm) return doDispRslt_str_ln_nm_VC(info);
		if (vc == columnDispRslt_site_cd) return doDispRslt_site_cd_VC(info);
		if (vc == columnDispRslt_site_nm) return doDispRslt_site_nm_VC(info);
		if (vc == columnDispRslt_asst_typ) return doDispRslt_asst_typ_VC(info);
		if (vc == columnDispRslt_asst_typ_nm) return doDispRslt_asst_typ_nm_VC(info);
		if (vc == columnDispRslt_disp_seq) return doDispRslt_disp_seq_VC(info);
		if (vc == columnDispRslt_oper_cd) return doDispRslt_oper_cd_VC(info);
		if (vc == columnDispRslt_oper_nm) return doDispRslt_oper_nm_VC(info);
		if (vc == columnDispRslt_oper_seq) return doDispRslt_oper_seq_VC(info);
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
		if (vc == columnDispRslt_prov_typ) return doDispRslt_prov_typ_VC(info);
		if (vc == columnDispRslt_prov_typ_nm) return doDispRslt_prov_typ_nm_VC(info);
		if (vc == columnDispRslt_unit_cd) return doDispRslt_unit_cd_VC(info);
		if (vc == columnDispRslt_unit_nm) return doDispRslt_unit_nm_VC(info);
		if (vc == columnDispRslt_dec_place) return doDispRslt_dec_place_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_act_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_mfg_inst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_act_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asst_typ_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[disp_seq_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_seq_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[prov_typ_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_typ_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InsCnd]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInsCnd_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InsCnd]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInsCnd_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InsCnd]パネルの[st_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInsCnd_st_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InsCnd]パネルの[end_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInsCnd_end_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InsCnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInsCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InsCnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInsCnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InsCnd]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInsCnd_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InsCnd]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInsCnd_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [InsCnd]パネルの[amt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doInsCnd_amt_flg_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[itm_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_itm_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_mfg_act_no_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_disp_seq_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_oper_seq_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == DispRsltTable) doDispRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_term) doCnd_term_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NC(info);
		else if (nc == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NC(info);
		else if (nc == Cnd_par_itm_jnl_cd) doCnd_par_itm_jnl_cd_NC(info);
		else if (nc == Cnd_par_itm_jnl_nm) doCnd_par_itm_jnl_nm_NC(info);
		else if (nc == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NC(info);
		else if (nc == Cnd_mfg_act_no) doCnd_mfg_act_no_NC(info);
		else if (nc == Cnd_asst_typ) doCnd_asst_typ_NC(info);
		else if (nc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NC(info);
		else if (nc == Cnd_par_lot_no) doCnd_par_lot_no_NC(info);
		else if (nc == Cnd_par_sublot_no) doCnd_par_sublot_no_NC(info);
		else if (nc == Cnd_par_sno1) doCnd_par_sno1_NC(info);
		else if (nc == Cnd_par_sno2) doCnd_par_sno2_NC(info);
		else if (nc == Cnd_par_sno3) doCnd_par_sno3_NC(info);
		else if (nc == Cnd_par_sno4) doCnd_par_sno4_NC(info);
		else if (nc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NC(info);
		else if (nc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_sno1) doCnd_sno1_NC(info);
		else if (nc == Cnd_sno2) doCnd_sno2_NC(info);
		else if (nc == Cnd_sno3) doCnd_sno3_NC(info);
		else if (nc == Cnd_sno4) doCnd_sno4_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_oper_cd) doCnd_oper_cd_NC(info);
		else if (nc == Cnd_oper_nm) doCnd_oper_nm_NC(info);
		else if (nc == Cnd_prov_typ) doCnd_prov_typ_NC(info);
		else if (nc == Cnd_prov_typ_nm) doCnd_prov_typ_nm_NC(info);
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
		else if (nc == Cnd_itm_mfg_inst_flg) doCnd_itm_mfg_inst_flg_NC(info);
		else if (nc == Cnd_mfg_act_flg) doCnd_mfg_act_flg_NC(info);
		else if (nc == Cnd_par_lot_flg) doCnd_par_lot_flg_NC(info);
		else if (nc == Cnd_par_sublot_flg) doCnd_par_sublot_flg_NC(info);
		else if (nc == Cnd_par_sno1_flg) doCnd_par_sno1_flg_NC(info);
		else if (nc == Cnd_par_sno2_flg) doCnd_par_sno2_flg_NC(info);
		else if (nc == Cnd_par_sno3_flg) doCnd_par_sno3_flg_NC(info);
		else if (nc == Cnd_par_sno4_flg) doCnd_par_sno4_flg_NC(info);
		else if (nc == Cnd_loc_flg) doCnd_loc_flg_NC(info);
		else if (nc == Cnd_str_ln_flg) doCnd_str_ln_flg_NC(info);
		else if (nc == Cnd_site_flg) doCnd_site_flg_NC(info);
		else if (nc == Cnd_asst_typ_flg) doCnd_asst_typ_flg_NC(info);
		else if (nc == Cnd_disp_seq_flg) doCnd_disp_seq_flg_NC(info);
		else if (nc == Cnd_oper_flg) doCnd_oper_flg_NC(info);
		else if (nc == Cnd_lot_flg) doCnd_lot_flg_NC(info);
		else if (nc == Cnd_sublot_flg) doCnd_sublot_flg_NC(info);
		else if (nc == Cnd_sno1_flg) doCnd_sno1_flg_NC(info);
		else if (nc == Cnd_sno2_flg) doCnd_sno2_flg_NC(info);
		else if (nc == Cnd_sno3_flg) doCnd_sno3_flg_NC(info);
		else if (nc == Cnd_sno4_flg) doCnd_sno4_flg_NC(info);
		else if (nc == Cnd_prov_typ_flg) doCnd_prov_typ_flg_NC(info);
		else if (nc == InsCnd_calc_grp_cd) doInsCnd_calc_grp_cd_NC(info);
		else if (nc == InsCnd_calc_grp_nm) doInsCnd_calc_grp_nm_NC(info);
		else if (nc == InsCnd_st_ym) doInsCnd_st_ym_NC(info);
		else if (nc == InsCnd_end_ym) doInsCnd_end_ym_NC(info);
		else if (nc == InsCnd_wg_cd) doInsCnd_wg_cd_NC(info);
		else if (nc == InsCnd_wg_nm) doInsCnd_wg_nm_NC(info);
		else if (nc == InsCnd_calc_ctg_cd) doInsCnd_calc_ctg_cd_NC(info);
		else if (nc == InsCnd_calc_ctg_nm) doInsCnd_calc_ctg_nm_NC(info);
		else if (nc == InsCnd_amt_flg) doInsCnd_amt_flg_NC(info);
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
		else if (nc == columnDispRslt_itm_mfg_inst_no) doDispRslt_itm_mfg_inst_no_NC(info);
		else if (nc == columnDispRslt_mfg_act_no) doDispRslt_mfg_act_no_NC(info);
		else if (nc == columnDispRslt_par_lot_no) doDispRslt_par_lot_no_NC(info);
		else if (nc == columnDispRslt_par_sublot_no) doDispRslt_par_sublot_no_NC(info);
		else if (nc == columnDispRslt_par_sno1) doDispRslt_par_sno1_NC(info);
		else if (nc == columnDispRslt_par_sno2) doDispRslt_par_sno2_NC(info);
		else if (nc == columnDispRslt_par_sno3) doDispRslt_par_sno3_NC(info);
		else if (nc == columnDispRslt_par_sno4) doDispRslt_par_sno4_NC(info);
		else if (nc == columnDispRslt_loc_cd) doDispRslt_loc_cd_NC(info);
		else if (nc == columnDispRslt_loc_nm) doDispRslt_loc_nm_NC(info);
		else if (nc == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_NC(info);
		else if (nc == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_NC(info);
		else if (nc == columnDispRslt_site_cd) doDispRslt_site_cd_NC(info);
		else if (nc == columnDispRslt_site_nm) doDispRslt_site_nm_NC(info);
		else if (nc == columnDispRslt_asst_typ) doDispRslt_asst_typ_NC(info);
		else if (nc == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NC(info);
		else if (nc == columnDispRslt_disp_seq) doDispRslt_disp_seq_NC(info);
		else if (nc == columnDispRslt_oper_cd) doDispRslt_oper_cd_NC(info);
		else if (nc == columnDispRslt_oper_nm) doDispRslt_oper_nm_NC(info);
		else if (nc == columnDispRslt_oper_seq) doDispRslt_oper_seq_NC(info);
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
		else if (nc == columnDispRslt_prov_typ) doDispRslt_prov_typ_NC(info);
		else if (nc == columnDispRslt_prov_typ_nm) doDispRslt_prov_typ_nm_NC(info);
		else if (nc == columnDispRslt_unit_cd) doDispRslt_unit_cd_NC(info);
		else if (nc == columnDispRslt_unit_nm) doDispRslt_unit_nm_NC(info);
		else if (nc == columnDispRslt_dec_place) doDispRslt_dec_place_NC(info);
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
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_seq_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_seq_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[prov_typ_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_flg_NC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[st_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_st_ym_NC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[end_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_end_ym_NC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[amt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_amt_flg_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mfg_act_no_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_disp_seq_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_seq_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == DispRsltTable) doDispRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_term) doCnd_term_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NE(info);
		else if (ne == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NE(info);
		else if (ne == Cnd_par_itm_jnl_cd) doCnd_par_itm_jnl_cd_NE(info);
		else if (ne == Cnd_par_itm_jnl_nm) doCnd_par_itm_jnl_nm_NE(info);
		else if (ne == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NE(info);
		else if (ne == Cnd_mfg_act_no) doCnd_mfg_act_no_NE(info);
		else if (ne == Cnd_asst_typ) doCnd_asst_typ_NE(info);
		else if (ne == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NE(info);
		else if (ne == Cnd_par_lot_no) doCnd_par_lot_no_NE(info);
		else if (ne == Cnd_par_sublot_no) doCnd_par_sublot_no_NE(info);
		else if (ne == Cnd_par_sno1) doCnd_par_sno1_NE(info);
		else if (ne == Cnd_par_sno2) doCnd_par_sno2_NE(info);
		else if (ne == Cnd_par_sno3) doCnd_par_sno3_NE(info);
		else if (ne == Cnd_par_sno4) doCnd_par_sno4_NE(info);
		else if (ne == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NE(info);
		else if (ne == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_sno1) doCnd_sno1_NE(info);
		else if (ne == Cnd_sno2) doCnd_sno2_NE(info);
		else if (ne == Cnd_sno3) doCnd_sno3_NE(info);
		else if (ne == Cnd_sno4) doCnd_sno4_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_oper_cd) doCnd_oper_cd_NE(info);
		else if (ne == Cnd_oper_nm) doCnd_oper_nm_NE(info);
		else if (ne == Cnd_prov_typ) doCnd_prov_typ_NE(info);
		else if (ne == Cnd_prov_typ_nm) doCnd_prov_typ_nm_NE(info);
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
		else if (ne == Cnd_itm_mfg_inst_flg) doCnd_itm_mfg_inst_flg_NE(info);
		else if (ne == Cnd_mfg_act_flg) doCnd_mfg_act_flg_NE(info);
		else if (ne == Cnd_par_lot_flg) doCnd_par_lot_flg_NE(info);
		else if (ne == Cnd_par_sublot_flg) doCnd_par_sublot_flg_NE(info);
		else if (ne == Cnd_par_sno1_flg) doCnd_par_sno1_flg_NE(info);
		else if (ne == Cnd_par_sno2_flg) doCnd_par_sno2_flg_NE(info);
		else if (ne == Cnd_par_sno3_flg) doCnd_par_sno3_flg_NE(info);
		else if (ne == Cnd_par_sno4_flg) doCnd_par_sno4_flg_NE(info);
		else if (ne == Cnd_loc_flg) doCnd_loc_flg_NE(info);
		else if (ne == Cnd_str_ln_flg) doCnd_str_ln_flg_NE(info);
		else if (ne == Cnd_site_flg) doCnd_site_flg_NE(info);
		else if (ne == Cnd_asst_typ_flg) doCnd_asst_typ_flg_NE(info);
		else if (ne == Cnd_disp_seq_flg) doCnd_disp_seq_flg_NE(info);
		else if (ne == Cnd_oper_flg) doCnd_oper_flg_NE(info);
		else if (ne == Cnd_lot_flg) doCnd_lot_flg_NE(info);
		else if (ne == Cnd_sublot_flg) doCnd_sublot_flg_NE(info);
		else if (ne == Cnd_sno1_flg) doCnd_sno1_flg_NE(info);
		else if (ne == Cnd_sno2_flg) doCnd_sno2_flg_NE(info);
		else if (ne == Cnd_sno3_flg) doCnd_sno3_flg_NE(info);
		else if (ne == Cnd_sno4_flg) doCnd_sno4_flg_NE(info);
		else if (ne == Cnd_prov_typ_flg) doCnd_prov_typ_flg_NE(info);
		else if (ne == InsCnd_calc_grp_cd) doInsCnd_calc_grp_cd_NE(info);
		else if (ne == InsCnd_calc_grp_nm) doInsCnd_calc_grp_nm_NE(info);
		else if (ne == InsCnd_st_ym) doInsCnd_st_ym_NE(info);
		else if (ne == InsCnd_end_ym) doInsCnd_end_ym_NE(info);
		else if (ne == InsCnd_wg_cd) doInsCnd_wg_cd_NE(info);
		else if (ne == InsCnd_wg_nm) doInsCnd_wg_nm_NE(info);
		else if (ne == InsCnd_calc_ctg_cd) doInsCnd_calc_ctg_cd_NE(info);
		else if (ne == InsCnd_calc_ctg_nm) doInsCnd_calc_ctg_nm_NE(info);
		else if (ne == InsCnd_amt_flg) doInsCnd_amt_flg_NE(info);
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
		else if (ne == columnDispRslt_itm_mfg_inst_no) doDispRslt_itm_mfg_inst_no_NE(info);
		else if (ne == columnDispRslt_mfg_act_no) doDispRslt_mfg_act_no_NE(info);
		else if (ne == columnDispRslt_par_lot_no) doDispRslt_par_lot_no_NE(info);
		else if (ne == columnDispRslt_par_sublot_no) doDispRslt_par_sublot_no_NE(info);
		else if (ne == columnDispRslt_par_sno1) doDispRslt_par_sno1_NE(info);
		else if (ne == columnDispRslt_par_sno2) doDispRslt_par_sno2_NE(info);
		else if (ne == columnDispRslt_par_sno3) doDispRslt_par_sno3_NE(info);
		else if (ne == columnDispRslt_par_sno4) doDispRslt_par_sno4_NE(info);
		else if (ne == columnDispRslt_loc_cd) doDispRslt_loc_cd_NE(info);
		else if (ne == columnDispRslt_loc_nm) doDispRslt_loc_nm_NE(info);
		else if (ne == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_NE(info);
		else if (ne == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_NE(info);
		else if (ne == columnDispRslt_site_cd) doDispRslt_site_cd_NE(info);
		else if (ne == columnDispRslt_site_nm) doDispRslt_site_nm_NE(info);
		else if (ne == columnDispRslt_asst_typ) doDispRslt_asst_typ_NE(info);
		else if (ne == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NE(info);
		else if (ne == columnDispRslt_disp_seq) doDispRslt_disp_seq_NE(info);
		else if (ne == columnDispRslt_oper_cd) doDispRslt_oper_cd_NE(info);
		else if (ne == columnDispRslt_oper_nm) doDispRslt_oper_nm_NE(info);
		else if (ne == columnDispRslt_oper_seq) doDispRslt_oper_seq_NE(info);
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
		else if (ne == columnDispRslt_prov_typ) doDispRslt_prov_typ_NE(info);
		else if (ne == columnDispRslt_prov_typ_nm) doDispRslt_prov_typ_nm_NE(info);
		else if (ne == columnDispRslt_unit_cd) doDispRslt_unit_cd_NE(info);
		else if (ne == columnDispRslt_unit_nm) doDispRslt_unit_nm_NE(info);
		else if (ne == columnDispRslt_dec_place) doDispRslt_dec_place_NE(info);
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
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_seq_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_seq_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[prov_typ_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_flg_NE(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[st_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_st_ym_NE(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[end_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_end_ym_NE(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[amt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_amt_flg_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mfg_act_no_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_disp_seq_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_seq_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == DispRsltTable) doDispRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_term) doCnd_term_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NX(info);
		else if (nx == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NX(info);
		else if (nx == Cnd_par_itm_jnl_cd) doCnd_par_itm_jnl_cd_NX(info);
		else if (nx == Cnd_par_itm_jnl_nm) doCnd_par_itm_jnl_nm_NX(info);
		else if (nx == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NX(info);
		else if (nx == Cnd_mfg_act_no) doCnd_mfg_act_no_NX(info);
		else if (nx == Cnd_asst_typ) doCnd_asst_typ_NX(info);
		else if (nx == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NX(info);
		else if (nx == Cnd_par_lot_no) doCnd_par_lot_no_NX(info);
		else if (nx == Cnd_par_sublot_no) doCnd_par_sublot_no_NX(info);
		else if (nx == Cnd_par_sno1) doCnd_par_sno1_NX(info);
		else if (nx == Cnd_par_sno2) doCnd_par_sno2_NX(info);
		else if (nx == Cnd_par_sno3) doCnd_par_sno3_NX(info);
		else if (nx == Cnd_par_sno4) doCnd_par_sno4_NX(info);
		else if (nx == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NX(info);
		else if (nx == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_sno1) doCnd_sno1_NX(info);
		else if (nx == Cnd_sno2) doCnd_sno2_NX(info);
		else if (nx == Cnd_sno3) doCnd_sno3_NX(info);
		else if (nx == Cnd_sno4) doCnd_sno4_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_oper_cd) doCnd_oper_cd_NX(info);
		else if (nx == Cnd_oper_nm) doCnd_oper_nm_NX(info);
		else if (nx == Cnd_prov_typ) doCnd_prov_typ_NX(info);
		else if (nx == Cnd_prov_typ_nm) doCnd_prov_typ_nm_NX(info);
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
		else if (nx == Cnd_itm_mfg_inst_flg) doCnd_itm_mfg_inst_flg_NX(info);
		else if (nx == Cnd_mfg_act_flg) doCnd_mfg_act_flg_NX(info);
		else if (nx == Cnd_par_lot_flg) doCnd_par_lot_flg_NX(info);
		else if (nx == Cnd_par_sublot_flg) doCnd_par_sublot_flg_NX(info);
		else if (nx == Cnd_par_sno1_flg) doCnd_par_sno1_flg_NX(info);
		else if (nx == Cnd_par_sno2_flg) doCnd_par_sno2_flg_NX(info);
		else if (nx == Cnd_par_sno3_flg) doCnd_par_sno3_flg_NX(info);
		else if (nx == Cnd_par_sno4_flg) doCnd_par_sno4_flg_NX(info);
		else if (nx == Cnd_loc_flg) doCnd_loc_flg_NX(info);
		else if (nx == Cnd_str_ln_flg) doCnd_str_ln_flg_NX(info);
		else if (nx == Cnd_site_flg) doCnd_site_flg_NX(info);
		else if (nx == Cnd_asst_typ_flg) doCnd_asst_typ_flg_NX(info);
		else if (nx == Cnd_disp_seq_flg) doCnd_disp_seq_flg_NX(info);
		else if (nx == Cnd_oper_flg) doCnd_oper_flg_NX(info);
		else if (nx == Cnd_lot_flg) doCnd_lot_flg_NX(info);
		else if (nx == Cnd_sublot_flg) doCnd_sublot_flg_NX(info);
		else if (nx == Cnd_sno1_flg) doCnd_sno1_flg_NX(info);
		else if (nx == Cnd_sno2_flg) doCnd_sno2_flg_NX(info);
		else if (nx == Cnd_sno3_flg) doCnd_sno3_flg_NX(info);
		else if (nx == Cnd_sno4_flg) doCnd_sno4_flg_NX(info);
		else if (nx == Cnd_prov_typ_flg) doCnd_prov_typ_flg_NX(info);
		else if (nx == InsCnd_calc_grp_cd) doInsCnd_calc_grp_cd_NX(info);
		else if (nx == InsCnd_calc_grp_nm) doInsCnd_calc_grp_nm_NX(info);
		else if (nx == InsCnd_st_ym) doInsCnd_st_ym_NX(info);
		else if (nx == InsCnd_end_ym) doInsCnd_end_ym_NX(info);
		else if (nx == InsCnd_wg_cd) doInsCnd_wg_cd_NX(info);
		else if (nx == InsCnd_wg_nm) doInsCnd_wg_nm_NX(info);
		else if (nx == InsCnd_calc_ctg_cd) doInsCnd_calc_ctg_cd_NX(info);
		else if (nx == InsCnd_calc_ctg_nm) doInsCnd_calc_ctg_nm_NX(info);
		else if (nx == InsCnd_amt_flg) doInsCnd_amt_flg_NX(info);
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
		else if (nx == columnDispRslt_itm_mfg_inst_no) doDispRslt_itm_mfg_inst_no_NX(info);
		else if (nx == columnDispRslt_mfg_act_no) doDispRslt_mfg_act_no_NX(info);
		else if (nx == columnDispRslt_par_lot_no) doDispRslt_par_lot_no_NX(info);
		else if (nx == columnDispRslt_par_sublot_no) doDispRslt_par_sublot_no_NX(info);
		else if (nx == columnDispRslt_par_sno1) doDispRslt_par_sno1_NX(info);
		else if (nx == columnDispRslt_par_sno2) doDispRslt_par_sno2_NX(info);
		else if (nx == columnDispRslt_par_sno3) doDispRslt_par_sno3_NX(info);
		else if (nx == columnDispRslt_par_sno4) doDispRslt_par_sno4_NX(info);
		else if (nx == columnDispRslt_loc_cd) doDispRslt_loc_cd_NX(info);
		else if (nx == columnDispRslt_loc_nm) doDispRslt_loc_nm_NX(info);
		else if (nx == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_NX(info);
		else if (nx == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_NX(info);
		else if (nx == columnDispRslt_site_cd) doDispRslt_site_cd_NX(info);
		else if (nx == columnDispRslt_site_nm) doDispRslt_site_nm_NX(info);
		else if (nx == columnDispRslt_asst_typ) doDispRslt_asst_typ_NX(info);
		else if (nx == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NX(info);
		else if (nx == columnDispRslt_disp_seq) doDispRslt_disp_seq_NX(info);
		else if (nx == columnDispRslt_oper_cd) doDispRslt_oper_cd_NX(info);
		else if (nx == columnDispRslt_oper_nm) doDispRslt_oper_nm_NX(info);
		else if (nx == columnDispRslt_oper_seq) doDispRslt_oper_seq_NX(info);
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
		else if (nx == columnDispRslt_prov_typ) doDispRslt_prov_typ_NX(info);
		else if (nx == columnDispRslt_prov_typ_nm) doDispRslt_prov_typ_nm_NX(info);
		else if (nx == columnDispRslt_unit_cd) doDispRslt_unit_cd_NX(info);
		else if (nx == columnDispRslt_unit_nm) doDispRslt_unit_nm_NX(info);
		else if (nx == columnDispRslt_dec_place) doDispRslt_dec_place_NX(info);
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
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_seq_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_seq_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[prov_typ_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_flg_NX(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[st_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_st_ym_NX(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[end_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_end_ym_NX(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[amt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_amt_flg_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mfg_act_no_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_disp_seq_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_seq_NX(MCEventInfo info){
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
		else if (lc == Cnd_par_itm_jnl_cd) doCnd_par_itm_jnl_cd_LC(info);
		else if (lc == Cnd_par_itm_jnl_nm) doCnd_par_itm_jnl_nm_LC(info);
		else if (lc == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_LC(info);
		else if (lc == Cnd_mfg_act_no) doCnd_mfg_act_no_LC(info);
		else if (lc == Cnd_asst_typ) doCnd_asst_typ_LC(info);
		else if (lc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_LC(info);
		else if (lc == Cnd_par_lot_no) doCnd_par_lot_no_LC(info);
		else if (lc == Cnd_par_sublot_no) doCnd_par_sublot_no_LC(info);
		else if (lc == Cnd_par_sno1) doCnd_par_sno1_LC(info);
		else if (lc == Cnd_par_sno2) doCnd_par_sno2_LC(info);
		else if (lc == Cnd_par_sno3) doCnd_par_sno3_LC(info);
		else if (lc == Cnd_par_sno4) doCnd_par_sno4_LC(info);
		else if (lc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_LC(info);
		else if (lc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_sno1) doCnd_sno1_LC(info);
		else if (lc == Cnd_sno2) doCnd_sno2_LC(info);
		else if (lc == Cnd_sno3) doCnd_sno3_LC(info);
		else if (lc == Cnd_sno4) doCnd_sno4_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_oper_cd) doCnd_oper_cd_LC(info);
		else if (lc == Cnd_oper_nm) doCnd_oper_nm_LC(info);
		else if (lc == Cnd_prov_typ) doCnd_prov_typ_LC(info);
		else if (lc == Cnd_prov_typ_nm) doCnd_prov_typ_nm_LC(info);
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
		else if (lc == InsCnd_calc_grp_cd) doInsCnd_calc_grp_cd_LC(info);
		else if (lc == InsCnd_calc_grp_nm) doInsCnd_calc_grp_nm_LC(info);
		else if (lc == InsCnd_st_ym) doInsCnd_st_ym_LC(info);
		else if (lc == InsCnd_end_ym) doInsCnd_end_ym_LC(info);
		else if (lc == InsCnd_wg_cd) doInsCnd_wg_cd_LC(info);
		else if (lc == InsCnd_wg_nm) doInsCnd_wg_nm_LC(info);
		else if (lc == InsCnd_calc_ctg_cd) doInsCnd_calc_ctg_cd_LC(info);
		else if (lc == InsCnd_calc_ctg_nm) doInsCnd_calc_ctg_nm_LC(info);
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
		else if (lc == columnDispRslt_itm_mfg_inst_no) doDispRslt_itm_mfg_inst_no_LC(info);
		else if (lc == columnDispRslt_mfg_act_no) doDispRslt_mfg_act_no_LC(info);
		else if (lc == columnDispRslt_par_lot_no) doDispRslt_par_lot_no_LC(info);
		else if (lc == columnDispRslt_par_sublot_no) doDispRslt_par_sublot_no_LC(info);
		else if (lc == columnDispRslt_par_sno1) doDispRslt_par_sno1_LC(info);
		else if (lc == columnDispRslt_par_sno2) doDispRslt_par_sno2_LC(info);
		else if (lc == columnDispRslt_par_sno3) doDispRslt_par_sno3_LC(info);
		else if (lc == columnDispRslt_par_sno4) doDispRslt_par_sno4_LC(info);
		else if (lc == columnDispRslt_loc_cd) doDispRslt_loc_cd_LC(info);
		else if (lc == columnDispRslt_loc_nm) doDispRslt_loc_nm_LC(info);
		else if (lc == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_LC(info);
		else if (lc == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_LC(info);
		else if (lc == columnDispRslt_site_cd) doDispRslt_site_cd_LC(info);
		else if (lc == columnDispRslt_site_nm) doDispRslt_site_nm_LC(info);
		else if (lc == columnDispRslt_asst_typ) doDispRslt_asst_typ_LC(info);
		else if (lc == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_LC(info);
		else if (lc == columnDispRslt_disp_seq) doDispRslt_disp_seq_LC(info);
		else if (lc == columnDispRslt_oper_cd) doDispRslt_oper_cd_LC(info);
		else if (lc == columnDispRslt_oper_nm) doDispRslt_oper_nm_LC(info);
		else if (lc == columnDispRslt_oper_seq) doDispRslt_oper_seq_LC(info);
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
		else if (lc == columnDispRslt_prov_typ) doDispRslt_prov_typ_LC(info);
		else if (lc == columnDispRslt_prov_typ_nm) doDispRslt_prov_typ_nm_LC(info);
		else if (lc == columnDispRslt_unit_cd) doDispRslt_unit_cd_LC(info);
		else if (lc == columnDispRslt_unit_nm) doDispRslt_unit_nm_LC(info);
		else if (lc == columnDispRslt_dec_place) doDispRslt_dec_place_LC(info);
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
	 * [Cnd]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_LC(MCEventInfo info){
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
	 * [InsCnd]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[st_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_st_ym_LC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[end_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_end_ym_LC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [InsCnd]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doInsCnd_calc_ctg_nm_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_mfg_act_no_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_disp_seq_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_oper_seq_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_asst_typ]の作成メソッド
	 */
	public MCList getCnd_asst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAsstTyp(row, info);
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
	 * コンボ／リストのリスト[Cnd_prov_typ]の作成メソッド
	 */
	public MCList getCnd_prov_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvTyp(row, info);
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

	/**
	 * コンボ／リストのリスト[InsCnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getInsCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[InsCnd_calc_no_p_PPanel_CalcNo_calc_no]の作成メソッド
	 */
	public MCList getInsCnd_calc_no_p_PPanel_CalcNo_calc_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCalcNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[InsCnd_wg_cd]の作成メソッド
	 */
	public MCList getInsCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[InsCnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getInsCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0120.Srch01")) {
			return new MG_MGBDL0120_Srch01Bridge();
		}
		if (id.equals("MG.MGBDL0120.Ins01")) {
			return new MG_MGBDL0120_Ins01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0120_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0120_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0120_Srch01;

		/** コンストラクタ */
		protected MG_MGBDL0120_Srch01Bridge() {
			p_MG_MGBDL0120_Srch01 = new MCParam(PDef.MG_MGBDL0120_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0120_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0120.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0120.RsltR.class));
			param.addDownBlock(mcframe.clientMGBD.MGBDP0120.Rslt2R.create());

			p_MG_MGBDL0120_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0120_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0120_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0120_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0120_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0120.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0120.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0120.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0120.RsltR>)down(0);
		}
		protected mcframe.clientMGBD.MGBDP0120.Rslt2R down1() {
			return (mcframe.clientMGBD.MGBDP0120.Rslt2R)down(1);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0120_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0120.RsltR.class));
			p_MG_MGBDL0120_Srch01.addDownBlock(mcframe.clientMGBD.MGBDP0120.Rslt2R.create());
		}
		protected MCParam param() {
			return p_MG_MGBDL0120_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0120.RsltR>)p_MG_MGBDL0120_Srch01.getContainerParam().getDownBlock(0));
			setRslt2R((mcframe.clientMGBD.MGBDP0120.Rslt2R)p_MG_MGBDL0120_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getRsltL().clear();
			getRslt2R().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getRslt2R());
			return result;
		}
	}
	/**
	 * [MG_MGBDL0120_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0120_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0120_Ins01;

		/** コンストラクタ */
		protected MG_MGBDL0120_Ins01Bridge() {
			p_MG_MGBDL0120_Ins01 = new MCParam(PDef.MG_MGBDL0120_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0120_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0120.InsCndR.create());
			// Down

			p_MG_MGBDL0120_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0120_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0120_Ins01.addUpBlock(getInsCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0120_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0120_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0120.InsCndR up0() {
			return (mcframe.clientMGBD.MGBDP0120.InsCndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBDL0120_Ins01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getInsCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}