package mcframe.clientMGBF.MGBFP0440;

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
import mcframe.clientMGBF.MGBFP0440.MGBFP_MlyStkWipCostSrch_MC.MG_MGBFL0440_Srch01Caller;

/**
 * 画面"MGBFP_MlyStkWipCostSrch"パネルクラスです。<p>
 *
 * 月別に在庫仕掛情報を参照する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFP_MlyStkWipCostSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBF";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBFP0440";

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
	public MCLabel Cnd_ym_fr_Label = null;
	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ym_fr = null;
	public MCLabel Cnd_ym_to_Label = null;
	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ym_to = null;
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
	/**
	 * Exclude other company's asset 他社資産を除く.<p>
	 *
	 */
	public MCCheckBox Cnd_except_other_flg = null;
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
	/**
	 * Without BP 取引先無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_bp_flg = null;
	public MCLabel Cnd_cntry_cd_Label = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCTextField Cnd_cntry_nm = null;
	public MCLabel Cnd_area_cd_Label = null;
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_area_cd = null;
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public MCTextField Cnd_area_nm = null;
	/**
	 * Ending inventory 月末在庫.<p>
	 *
	 */
	public MCCheckBox Cnd_end_stk_flg = null;
	/**
	 * Ending WIP 月末仕掛.<p>
	 *
	 */
	public MCCheckBox Cnd_end_wip_flg = null;
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
	 * Calculation group 計算グループ.<p>
	 *
	 */
	public MCCheckBox Cnd_calc_grp_flg = null;
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
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCCheckBox Cnd_asst_flg = null;
	/**
	 * BP 取引先.<p>
	 *
	 */
	public MCCheckBox Cnd_bp_flg = null;
	/**
	 * Country 国.<p>
	 *
	 */
	public MCCheckBox Cnd_cntry_flg = null;
	/**
	 * Region 地域.<p>
	 *
	 */
	public MCCheckBox Cnd_area_flg = null;
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
	 * Operation 工程.<p>
	 *
	 */
	public MCCheckBox Cnd_oper_flg = null;
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCCheckBox Cnd_qty_flg = null;
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
	 * Display unit price 単価表示.<p>
	 *
	 */
	public MCCheckBox Cnd_disp_upri = null;
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
	public MCTable2<mcframe.clientMGBF.MGBFP0440.DispRsltR> DispRsltTable = null;
	// [DispRslt]ブロックの項目のField定義
	/**
	 * Type 区分.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_calc_rec_typ = null;
	/**
	 * Calculation record type name 計算レコード区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_calc_rec_typ_nm = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_calc_grp_nm = null;
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
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_cntry_nm = null;
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_area_cd = null;
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_area_nm = null;
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
	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_000 = null;
	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_001 = null;
	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_002 = null;
	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_003 = null;
	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_004 = null;
	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_005 = null;
	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_006 = null;
	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_007 = null;
	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_008 = null;
	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_009 = null;
	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_010 = null;
	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_011 = null;
	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_012 = null;
	/**
	 * Month 13 年月１３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_013 = null;
	/**
	 * Month 14 年月１４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_014 = null;
	/**
	 * Month 15 年月１５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_015 = null;
	/**
	 * Month 16 年月１６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_016 = null;
	/**
	 * Month 17 年月１７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_017 = null;
	/**
	 * Month 18 年月１８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_018 = null;
	/**
	 * Month 19 年月１９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_019 = null;
	/**
	 * Month 20 年月２０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_020 = null;
	/**
	 * Month 21 年月２１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_021 = null;
	/**
	 * Month 22 年月２２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_022 = null;
	/**
	 * Month 23 年月２３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_023 = null;
	/**
	 * Month 24 年月２４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_024 = null;
	/**
	 * Month 25 年月２５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_025 = null;
	/**
	 * Month 26 年月２６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_026 = null;
	/**
	 * Month 27 年月２７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_027 = null;
	/**
	 * Month 28 年月２８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_028 = null;
	/**
	 * Month 29 年月２９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_029 = null;
	/**
	 * Month 30 年月３０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_030 = null;
	/**
	 * Month 31 年月３１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_031 = null;
	/**
	 * Month 32 年月３２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_032 = null;
	/**
	 * Month 33 年月３３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_033 = null;
	/**
	 * Month 34 年月３４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_034 = null;
	/**
	 * Month 35 年月３５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_035 = null;
	/**
	 * Month 36 年月３６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_036 = null;
	/**
	 * Month 37 年月３７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_037 = null;
	/**
	 * Month 38 年月３８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_038 = null;
	/**
	 * Month 39 年月３９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_039 = null;
	/**
	 * Month 40 年月４０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_040 = null;
	/**
	 * Month 41 年月４１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_041 = null;
	/**
	 * Month 42 年月４２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_042 = null;
	/**
	 * Month 43 年月４３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_043 = null;
	/**
	 * Month 44 年月４４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_044 = null;
	/**
	 * Month 45 年月４５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_045 = null;
	/**
	 * Month 46 年月４６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_046 = null;
	/**
	 * Month 47 年月４７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_047 = null;
	/**
	 * Month 48 年月４８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_048 = null;
	/**
	 * Month 49 年月４９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_049 = null;
	/**
	 * Month 50 年月５０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_050 = null;
	/**
	 * Month 51 年月５１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_051 = null;
	/**
	 * Month 52 年月５２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_052 = null;
	/**
	 * Month 53 年月５３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_053 = null;
	/**
	 * Month 54 年月５４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_054 = null;
	/**
	 * Month 55 年月５５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_055 = null;
	/**
	 * Month 56 年月５６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_056 = null;
	/**
	 * Month 57 年月５７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_057 = null;
	/**
	 * Month 58 年月５８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_058 = null;
	/**
	 * Month 59 年月５９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_059 = null;
	/**
	 * Month 60 年月６０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_060 = null;
	/**
	 * Month 61 年月６１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_061 = null;
	/**
	 * Month 62 年月６２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_062 = null;
	/**
	 * Month 63 年月６３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_063 = null;
	/**
	 * Month 64 年月６４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_064 = null;
	/**
	 * Month 65 年月６５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_065 = null;
	/**
	 * Month 66 年月６６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_066 = null;
	/**
	 * Month 67 年月６７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_067 = null;
	/**
	 * Month 68 年月６８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_068 = null;
	/**
	 * Month 69 年月６９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_069 = null;
	/**
	 * Month 70 年月７０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_070 = null;
	/**
	 * Month 71 年月７１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_071 = null;
	/**
	 * Month 72 年月７２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_072 = null;
	/**
	 * Month 73 年月７３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_073 = null;
	/**
	 * Month 74 年月７４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_074 = null;
	/**
	 * Month 75 年月７５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_075 = null;
	/**
	 * Month 76 年月７６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_076 = null;
	/**
	 * Month 77 年月７７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_077 = null;
	/**
	 * Month 78 年月７８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_078 = null;
	/**
	 * Month 79 年月７９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_079 = null;
	/**
	 * Month 80 年月８０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_080 = null;
	/**
	 * Month 81 年月８１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_081 = null;
	/**
	 * Month 82 年月８２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_082 = null;
	/**
	 * Month 83 年月８３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_083 = null;
	/**
	 * Month 84 年月８４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_084 = null;
	/**
	 * Month 85 年月８５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_085 = null;
	/**
	 * Month 86 年月８６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_086 = null;
	/**
	 * Month 87 年月８７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_087 = null;
	/**
	 * Month 88 年月８８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_088 = null;
	/**
	 * Month 89 年月８９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_089 = null;
	/**
	 * Month 90 年月９０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_090 = null;
	/**
	 * Month 91 年月９１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_091 = null;
	/**
	 * Month 92 年月９２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_092 = null;
	/**
	 * Month 93 年月９３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_093 = null;
	/**
	 * Month 94 年月９４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_094 = null;
	/**
	 * Month 95 年月９５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_095 = null;
	/**
	 * Month 96 年月９６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_096 = null;
	/**
	 * Month 97 年月９７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_097 = null;
	/**
	 * Month 98 年月９８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_098 = null;
	/**
	 * Month 99 年月９９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_099 = null;
	/**
	 * Month 100 年月１００.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_100 = null;
	/**
	 * Month 101 年月１０１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_101 = null;
	/**
	 * Month 102 年月１０２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_102 = null;
	/**
	 * Month 103 年月１０３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_103 = null;
	/**
	 * Month 104 年月１０４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_104 = null;
	/**
	 * Month 105 年月１０５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_105 = null;
	/**
	 * Month 106 年月１０６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_106 = null;
	/**
	 * Month 107 年月１０７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_107 = null;
	/**
	 * Month 108 年月１０８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_108 = null;
	/**
	 * Month 109 年月１０９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_109 = null;
	/**
	 * Month 110 年月１１０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_110 = null;
	/**
	 * Month 111 年月１１１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_111 = null;
	/**
	 * Month 112 年月１１２.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_112 = null;
	/**
	 * Month 113 年月１１３.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_113 = null;
	/**
	 * Month 114 年月１１４.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_114 = null;
	/**
	 * Month 115 年月１１５.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_115 = null;
	/**
	 * Month 116 年月１１６.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_116 = null;
	/**
	 * Month 117 年月１１７.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_117 = null;
	/**
	 * Month 118 年月１１８.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_118 = null;
	/**
	 * Month 119 年月１１９.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_119 = null;
	/**
	 * Month 120 年月１２０.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_120 = null;
	/**
	 * Month 121 年月１２１.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_col_121 = null;
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
	
	/** [MG_MGBFL0440_Srch01]のCallerの作成 */
	protected MGBFP_MlyStkWipCostSrch_MC.MG_MGBFL0440_Srch01Caller createMG_MGBFL0440_Srch01() {
		MGBFP_MlyStkWipCostSrch_MC.MG_MGBFL0440_Srch01Caller<MGBFP_MlyStkWipCostSrch, MG_MGBFL0440_Srch01Bridge>
		caller = ((MGBFP_MlyStkWipCostSrch_MC)this).new MG_MGBFL0440_Srch01Caller<MGBFP_MlyStkWipCostSrch, MG_MGBFL0440_Srch01Bridge>(
					(MGBFP_MlyStkWipCostSrch)this, new MG_MGBFL0440_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBFL0440_Srch01]の呼び出し */
	protected void callMG_MGBFL0440_Srch01() {
		MCCaller caller = createMG_MGBFL0440_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0440.CndR aCndR;
	/** [DispRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0440.DispRsltR> aDispRsltL;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0440.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBF.MGBFP0440.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0440.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0440.CndR createCndR() {
		return mcframe.clientMGBF.MGBFP0440.CndR.create();
	}

	/**
	 * コピーによってaDispRsltLを設定します。
	 *
	 * aDispRsltLのインスタンスは変更されません。
	 *
	 * @param dataset DispRsltL
	 */
	public void setDispRsltL(MCList<mcframe.clientMGBF.MGBFP0440.DispRsltR> aList) {
		if (getDispRsltL() != aList) {
			getDispRsltL().setAll(aList);
		}
	}

	/**
	 * [DispRslt]ブロックのコンテナaDispRsltLを返します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0440.DispRsltR> getDispRsltL() {
		return aDispRsltL;
	}

	/**
	 * aDispRsltRを作成します。
	 *
	 * @return DispRsltR
	 */
	public mcframe.clientMGBF.MGBFP0440.DispRsltR createDispRsltR() {
		return mcframe.clientMGBF.MGBFP0440.DispRsltR.create();
	}

	/**
	 * aDispRsltLを作成します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0440.DispRsltR> createDispRsltL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0440.DispRsltR.class);
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
	public void setRsltL(MCList<mcframe.clientMGBF.MGBFP0440.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0440.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBF.MGBFP0440.RsltR createRsltR() {
		return mcframe.clientMGBF.MGBFP0440.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0440.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0440.RsltR.class);
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
	public MGBFP_MlyStkWipCostSrch_MC_A() {
		aCndR = createCndR();
		aDispRsltL = createDispRsltL();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBFP_MlyStkWipCostSrch_MC_A(String name) {
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
		MGBFP_MlyStkWipCostSrch_MC.jbCreateTop((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbCreateFold((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbCreateTab1((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbCreateTab2((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbCreateTab3((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbCreateTab4((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbCreateCnd((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbCreateCnd2((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbCreateCnd3((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbCreateTtl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbCreateLPnl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbCreateCtrl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbCreateDispRslt((MGBFP_MlyStkWipCostSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBFP_MlyStkWipCostSrch p) {
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
	protected static void jbCreateCnd2(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 * [Ttl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTtl(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBFP_MlyStkWipCostSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispRslt(MGBFP_MlyStkWipCostSrch p) {
		p.DispRslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBF.MGBFP0440.DispRsltR.$itm_p);
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
	
	
	/** [Cnd_cntry_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cntry_cd_p = null;

	/**
	 * [Cnd_cntry_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cntry_cd_ListPutter() {
		if (Cnd_cntry_cd_p == null) {
			Cnd_cntry_cd_p = createCnd_cntry_cd_ListPutter(Cnd_cntry_cd, "cntry_cd", "cntry_nm");

		}
		return Cnd_cntry_cd_p;
	}
	
	
	/** [Cnd_area_cd_ListPutter]の定義 */
	private MCListPutter Cnd_area_cd_p = null;

	/**
	 * [Cnd_area_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_area_cd_ListPutter() {
		if (Cnd_area_cd_p == null) {
			Cnd_area_cd_p = createCnd_area_cd_ListPutter(Cnd_area_cd, "area_cd", "area_nm");

		}
		return Cnd_area_cd_p;
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
	public static MGBFP_MlyStkWipCostSrch create(){
		MGBFP_MlyStkWipCostSrch p = new MGBFP_MlyStkWipCostSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_MlyStkWipCostSrch create(String name){
		MGBFP_MlyStkWipCostSrch p = new MGBFP_MlyStkWipCostSrch(name);
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
		MGBFP_MlyStkWipCostSrch_MC.jbfInitTop((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbfInitFold((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbfInitTab1((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbfInitTab2((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbfInitTab3((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbfInitTab4((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbfInitCnd((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbfInitCnd2((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbfInitCnd3((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbfInitTtl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbfInitLPnl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbfInitCtrl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbfInitDispRslt((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbInitTop((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbInitFold((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbInitTab1((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbInitTab2((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbInitTab3((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbInitTab4((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbInitCnd((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbInitCnd2((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbInitCnd3((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbInitTtl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbInitLPnl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbInitCtrl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.jbInitDispRslt((MGBFP_MlyStkWipCostSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBFP_MlyStkWipCostSrch p) {
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
	protected static void jbfInitTab1(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_ym_fr_Label = p.beansFactory.createLabel("Cnd.ym_fr_Label");
		p.Cnd_ym_fr = p.beansFactory.createDateField("Cnd.ym_fr");
		p.Cnd_ym_fr.setLabel(p.Cnd_ym_fr_Label);
		p.Cnd_ym_to_Label = p.beansFactory.createLabel("Cnd.ym_to_Label");
		p.Cnd_ym_to = p.beansFactory.createDateField("Cnd.ym_to");
		p.Cnd_ym_to.setLabel(p.Cnd_ym_to_Label);
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_itm_jnl_cd_Label = p.beansFactory.createLabel("Cnd.itm_jnl_cd_Label");
		p.Cnd_itm_jnl_cd = p.beansFactory.createTextComboBox("Cnd.itm_jnl_cd");
		p.Cnd_itm_jnl_cd.setLabel(p.Cnd_itm_jnl_cd_Label);
		p.Cnd_itm_jnl_nm = p.beansFactory.createTextField("Cnd.itm_jnl_nm");
		p.Cnd_mng_dpt_cd_Label = p.beansFactory.createLabel("Cnd.mng_dpt_cd_Label");
		p.Cnd_mng_dpt_cd = p.beansFactory.createTextComboBox("Cnd.mng_dpt_cd");
		p.Cnd_mng_dpt_cd.setLabel(p.Cnd_mng_dpt_cd_Label);
		p.Cnd_mng_dpt_nm = p.beansFactory.createTextField("Cnd.mng_dpt_nm");
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
		p.Cnd_asst_typ_Label = p.beansFactory.createLabel("Cnd.asst_typ_Label");
		p.Cnd_asst_typ = p.beansFactory.createTextComboBox("Cnd.asst_typ");
		p.Cnd_asst_typ.setLabel(p.Cnd_asst_typ_Label);
		p.Cnd_asst_typ_nm = p.beansFactory.createTextField("Cnd.asst_typ_nm");
		p.Cnd_except_other_flg = p.beansFactory.createCheckBox("Cnd.except_other_flg");
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_no_bp_flg = p.beansFactory.createCheckBox("Cnd.no_bp_flg");
		p.Cnd_cntry_cd_Label = p.beansFactory.createLabel("Cnd.cntry_cd_Label");
		p.Cnd_cntry_cd = p.beansFactory.createTextComboBox("Cnd.cntry_cd");
		p.Cnd_cntry_cd.setLabel(p.Cnd_cntry_cd_Label);
		p.Cnd_cntry_nm = p.beansFactory.createTextField("Cnd.cntry_nm");
		p.Cnd_area_cd_Label = p.beansFactory.createLabel("Cnd.area_cd_Label");
		p.Cnd_area_cd = p.beansFactory.createTextComboBox("Cnd.area_cd");
		p.Cnd_area_cd.setLabel(p.Cnd_area_cd_Label);
		p.Cnd_area_nm = p.beansFactory.createTextField("Cnd.area_nm");
		p.Cnd_end_stk_flg = p.beansFactory.createCheckBox("Cnd.end_stk_flg");
		p.Cnd_end_wip_flg = p.beansFactory.createCheckBox("Cnd.end_wip_flg");
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
		p.Cnd_calc_grp_flg = p.beansFactory.createCheckBox("Cnd.calc_grp_flg");
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
		p.Cnd_asst_flg = p.beansFactory.createCheckBox("Cnd.asst_flg");
		p.Cnd_bp_flg = p.beansFactory.createCheckBox("Cnd.bp_flg");
		p.Cnd_cntry_flg = p.beansFactory.createCheckBox("Cnd.cntry_flg");
		p.Cnd_area_flg = p.beansFactory.createCheckBox("Cnd.area_flg");
		p.Cnd_loc_flg = p.beansFactory.createCheckBox("Cnd.loc_flg");
		p.Cnd_str_ln_flg = p.beansFactory.createCheckBox("Cnd.str_ln_flg");
		p.Cnd_oper_flg = p.beansFactory.createCheckBox("Cnd.oper_flg");
		p.Cnd_qty_flg = p.beansFactory.createCheckBox("Cnd.qty_flg");
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
		p.Cnd_disp_upri = p.beansFactory.createCheckBox("Cnd.disp_upri");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTtl(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.TtlPanel = p.beansFactory.createPanel("Ttl");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispRslt(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.DispRsltPanel = p.beansFactory.createPanel("DispRslt");
		p.DispRsltScrollPane = p.beansFactory.createScrollPane("DispRslt.scroll");
		p.createDispRsltTable();
		// ブロックの項目の初期化
		p.columnDispRslt_calc_rec_typ = p.beansFactory.createTableColumn("DispRslt.calc_rec_typ", MCColumnType.TEXT);
		p.columnDispRslt_calc_rec_typ_nm = p.beansFactory.createTableColumn("DispRslt.calc_rec_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_calc_grp_cd = p.beansFactory.createTableColumn("DispRslt.calc_grp_cd", MCColumnType.TEXT);
		p.columnDispRslt_calc_grp_nm = p.beansFactory.createTableColumn("DispRslt.calc_grp_nm", MCColumnType.TEXT);
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
		p.columnDispRslt_bp_cd = p.beansFactory.createTableColumn("DispRslt.bp_cd", MCColumnType.TEXT);
		p.columnDispRslt_bp_nm = p.beansFactory.createTableColumn("DispRslt.bp_nm", MCColumnType.TEXT);
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
		p.columnDispRslt_cntry_cd = p.beansFactory.createTableColumn("DispRslt.cntry_cd", MCColumnType.TEXT);
		p.columnDispRslt_cntry_nm = p.beansFactory.createTableColumn("DispRslt.cntry_nm", MCColumnType.TEXT);
		p.columnDispRslt_area_cd = p.beansFactory.createTableColumn("DispRslt.area_cd", MCColumnType.TEXT);
		p.columnDispRslt_area_nm = p.beansFactory.createTableColumn("DispRslt.area_nm", MCColumnType.TEXT);
		p.columnDispRslt_loc_cd = p.beansFactory.createTableColumn("DispRslt.loc_cd", MCColumnType.TEXT);
		p.columnDispRslt_loc_nm = p.beansFactory.createTableColumn("DispRslt.loc_nm", MCColumnType.TEXT);
		p.columnDispRslt_str_ln_cd = p.beansFactory.createTableColumn("DispRslt.str_ln_cd", MCColumnType.TEXT);
		p.columnDispRslt_str_ln_nm = p.beansFactory.createTableColumn("DispRslt.str_ln_nm", MCColumnType.TEXT);
		p.columnDispRslt_oper_cd = p.beansFactory.createTableColumn("DispRslt.oper_cd", MCColumnType.TEXT);
		p.columnDispRslt_oper_nm = p.beansFactory.createTableColumn("DispRslt.oper_nm", MCColumnType.TEXT);
		p.columnDispRslt_asst_typ = p.beansFactory.createTableColumn("DispRslt.asst_typ", MCColumnType.TEXT);
		p.columnDispRslt_asst_typ_nm = p.beansFactory.createTableColumn("DispRslt.asst_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_unit_cd = p.beansFactory.createTableColumn("DispRslt.unit_cd", MCColumnType.TEXT);
		p.columnDispRslt_unit_nm = p.beansFactory.createTableColumn("DispRslt.unit_nm", MCColumnType.TEXT);
		p.columnDispRslt_dec_place = p.beansFactory.createTableColumn("DispRslt.dec_place", MCColumnType.NUMBER);
		p.columnDispRslt_elm_no = p.beansFactory.createTableColumn("DispRslt.elm_no", MCColumnType.NUMBER);
		p.columnDispRslt_elm = p.beansFactory.createTableColumn("DispRslt.elm", MCColumnType.TEXT);
		p.columnDispRslt_elm_nm = p.beansFactory.createTableColumn("DispRslt.elm_nm", MCColumnType.TEXT);
		p.columnDispRslt_col_000 = p.beansFactory.createTableColumn("DispRslt.col_000", MCColumnType.NUMBER);
		p.columnDispRslt_col_001 = p.beansFactory.createTableColumn("DispRslt.col_001", MCColumnType.NUMBER);
		p.columnDispRslt_col_002 = p.beansFactory.createTableColumn("DispRslt.col_002", MCColumnType.NUMBER);
		p.columnDispRslt_col_003 = p.beansFactory.createTableColumn("DispRslt.col_003", MCColumnType.NUMBER);
		p.columnDispRslt_col_004 = p.beansFactory.createTableColumn("DispRslt.col_004", MCColumnType.NUMBER);
		p.columnDispRslt_col_005 = p.beansFactory.createTableColumn("DispRslt.col_005", MCColumnType.NUMBER);
		p.columnDispRslt_col_006 = p.beansFactory.createTableColumn("DispRslt.col_006", MCColumnType.NUMBER);
		p.columnDispRslt_col_007 = p.beansFactory.createTableColumn("DispRslt.col_007", MCColumnType.NUMBER);
		p.columnDispRslt_col_008 = p.beansFactory.createTableColumn("DispRslt.col_008", MCColumnType.NUMBER);
		p.columnDispRslt_col_009 = p.beansFactory.createTableColumn("DispRslt.col_009", MCColumnType.NUMBER);
		p.columnDispRslt_col_010 = p.beansFactory.createTableColumn("DispRslt.col_010", MCColumnType.NUMBER);
		p.columnDispRslt_col_011 = p.beansFactory.createTableColumn("DispRslt.col_011", MCColumnType.NUMBER);
		p.columnDispRslt_col_012 = p.beansFactory.createTableColumn("DispRslt.col_012", MCColumnType.NUMBER);
		p.columnDispRslt_col_013 = p.beansFactory.createTableColumn("DispRslt.col_013", MCColumnType.NUMBER);
		p.columnDispRslt_col_014 = p.beansFactory.createTableColumn("DispRslt.col_014", MCColumnType.NUMBER);
		p.columnDispRslt_col_015 = p.beansFactory.createTableColumn("DispRslt.col_015", MCColumnType.NUMBER);
		p.columnDispRslt_col_016 = p.beansFactory.createTableColumn("DispRslt.col_016", MCColumnType.NUMBER);
		p.columnDispRslt_col_017 = p.beansFactory.createTableColumn("DispRslt.col_017", MCColumnType.NUMBER);
		p.columnDispRslt_col_018 = p.beansFactory.createTableColumn("DispRslt.col_018", MCColumnType.NUMBER);
		p.columnDispRslt_col_019 = p.beansFactory.createTableColumn("DispRslt.col_019", MCColumnType.NUMBER);
		p.columnDispRslt_col_020 = p.beansFactory.createTableColumn("DispRslt.col_020", MCColumnType.NUMBER);
		p.columnDispRslt_col_021 = p.beansFactory.createTableColumn("DispRslt.col_021", MCColumnType.NUMBER);
		p.columnDispRslt_col_022 = p.beansFactory.createTableColumn("DispRslt.col_022", MCColumnType.NUMBER);
		p.columnDispRslt_col_023 = p.beansFactory.createTableColumn("DispRslt.col_023", MCColumnType.NUMBER);
		p.columnDispRslt_col_024 = p.beansFactory.createTableColumn("DispRslt.col_024", MCColumnType.NUMBER);
		p.columnDispRslt_col_025 = p.beansFactory.createTableColumn("DispRslt.col_025", MCColumnType.NUMBER);
		p.columnDispRslt_col_026 = p.beansFactory.createTableColumn("DispRslt.col_026", MCColumnType.NUMBER);
		p.columnDispRslt_col_027 = p.beansFactory.createTableColumn("DispRslt.col_027", MCColumnType.NUMBER);
		p.columnDispRslt_col_028 = p.beansFactory.createTableColumn("DispRslt.col_028", MCColumnType.NUMBER);
		p.columnDispRslt_col_029 = p.beansFactory.createTableColumn("DispRslt.col_029", MCColumnType.NUMBER);
		p.columnDispRslt_col_030 = p.beansFactory.createTableColumn("DispRslt.col_030", MCColumnType.NUMBER);
		p.columnDispRslt_col_031 = p.beansFactory.createTableColumn("DispRslt.col_031", MCColumnType.NUMBER);
		p.columnDispRslt_col_032 = p.beansFactory.createTableColumn("DispRslt.col_032", MCColumnType.NUMBER);
		p.columnDispRslt_col_033 = p.beansFactory.createTableColumn("DispRslt.col_033", MCColumnType.NUMBER);
		p.columnDispRslt_col_034 = p.beansFactory.createTableColumn("DispRslt.col_034", MCColumnType.NUMBER);
		p.columnDispRslt_col_035 = p.beansFactory.createTableColumn("DispRslt.col_035", MCColumnType.NUMBER);
		p.columnDispRslt_col_036 = p.beansFactory.createTableColumn("DispRslt.col_036", MCColumnType.NUMBER);
		p.columnDispRslt_col_037 = p.beansFactory.createTableColumn("DispRslt.col_037", MCColumnType.NUMBER);
		p.columnDispRslt_col_038 = p.beansFactory.createTableColumn("DispRslt.col_038", MCColumnType.NUMBER);
		p.columnDispRslt_col_039 = p.beansFactory.createTableColumn("DispRslt.col_039", MCColumnType.NUMBER);
		p.columnDispRslt_col_040 = p.beansFactory.createTableColumn("DispRslt.col_040", MCColumnType.NUMBER);
		p.columnDispRslt_col_041 = p.beansFactory.createTableColumn("DispRslt.col_041", MCColumnType.NUMBER);
		p.columnDispRslt_col_042 = p.beansFactory.createTableColumn("DispRslt.col_042", MCColumnType.NUMBER);
		p.columnDispRslt_col_043 = p.beansFactory.createTableColumn("DispRslt.col_043", MCColumnType.NUMBER);
		p.columnDispRslt_col_044 = p.beansFactory.createTableColumn("DispRslt.col_044", MCColumnType.NUMBER);
		p.columnDispRslt_col_045 = p.beansFactory.createTableColumn("DispRslt.col_045", MCColumnType.NUMBER);
		p.columnDispRslt_col_046 = p.beansFactory.createTableColumn("DispRslt.col_046", MCColumnType.NUMBER);
		p.columnDispRslt_col_047 = p.beansFactory.createTableColumn("DispRslt.col_047", MCColumnType.NUMBER);
		p.columnDispRslt_col_048 = p.beansFactory.createTableColumn("DispRslt.col_048", MCColumnType.NUMBER);
		p.columnDispRslt_col_049 = p.beansFactory.createTableColumn("DispRslt.col_049", MCColumnType.NUMBER);
		p.columnDispRslt_col_050 = p.beansFactory.createTableColumn("DispRslt.col_050", MCColumnType.NUMBER);
		p.columnDispRslt_col_051 = p.beansFactory.createTableColumn("DispRslt.col_051", MCColumnType.NUMBER);
		p.columnDispRslt_col_052 = p.beansFactory.createTableColumn("DispRslt.col_052", MCColumnType.NUMBER);
		p.columnDispRslt_col_053 = p.beansFactory.createTableColumn("DispRslt.col_053", MCColumnType.NUMBER);
		p.columnDispRslt_col_054 = p.beansFactory.createTableColumn("DispRslt.col_054", MCColumnType.NUMBER);
		p.columnDispRslt_col_055 = p.beansFactory.createTableColumn("DispRslt.col_055", MCColumnType.NUMBER);
		p.columnDispRslt_col_056 = p.beansFactory.createTableColumn("DispRslt.col_056", MCColumnType.NUMBER);
		p.columnDispRslt_col_057 = p.beansFactory.createTableColumn("DispRslt.col_057", MCColumnType.NUMBER);
		p.columnDispRslt_col_058 = p.beansFactory.createTableColumn("DispRslt.col_058", MCColumnType.NUMBER);
		p.columnDispRslt_col_059 = p.beansFactory.createTableColumn("DispRslt.col_059", MCColumnType.NUMBER);
		p.columnDispRslt_col_060 = p.beansFactory.createTableColumn("DispRslt.col_060", MCColumnType.NUMBER);
		p.columnDispRslt_col_061 = p.beansFactory.createTableColumn("DispRslt.col_061", MCColumnType.NUMBER);
		p.columnDispRslt_col_062 = p.beansFactory.createTableColumn("DispRslt.col_062", MCColumnType.NUMBER);
		p.columnDispRslt_col_063 = p.beansFactory.createTableColumn("DispRslt.col_063", MCColumnType.NUMBER);
		p.columnDispRslt_col_064 = p.beansFactory.createTableColumn("DispRslt.col_064", MCColumnType.NUMBER);
		p.columnDispRslt_col_065 = p.beansFactory.createTableColumn("DispRslt.col_065", MCColumnType.NUMBER);
		p.columnDispRslt_col_066 = p.beansFactory.createTableColumn("DispRslt.col_066", MCColumnType.NUMBER);
		p.columnDispRslt_col_067 = p.beansFactory.createTableColumn("DispRslt.col_067", MCColumnType.NUMBER);
		p.columnDispRslt_col_068 = p.beansFactory.createTableColumn("DispRslt.col_068", MCColumnType.NUMBER);
		p.columnDispRslt_col_069 = p.beansFactory.createTableColumn("DispRslt.col_069", MCColumnType.NUMBER);
		p.columnDispRslt_col_070 = p.beansFactory.createTableColumn("DispRslt.col_070", MCColumnType.NUMBER);
		p.columnDispRslt_col_071 = p.beansFactory.createTableColumn("DispRslt.col_071", MCColumnType.NUMBER);
		p.columnDispRslt_col_072 = p.beansFactory.createTableColumn("DispRslt.col_072", MCColumnType.NUMBER);
		p.columnDispRslt_col_073 = p.beansFactory.createTableColumn("DispRslt.col_073", MCColumnType.NUMBER);
		p.columnDispRslt_col_074 = p.beansFactory.createTableColumn("DispRslt.col_074", MCColumnType.NUMBER);
		p.columnDispRslt_col_075 = p.beansFactory.createTableColumn("DispRslt.col_075", MCColumnType.NUMBER);
		p.columnDispRslt_col_076 = p.beansFactory.createTableColumn("DispRslt.col_076", MCColumnType.NUMBER);
		p.columnDispRslt_col_077 = p.beansFactory.createTableColumn("DispRslt.col_077", MCColumnType.NUMBER);
		p.columnDispRslt_col_078 = p.beansFactory.createTableColumn("DispRslt.col_078", MCColumnType.NUMBER);
		p.columnDispRslt_col_079 = p.beansFactory.createTableColumn("DispRslt.col_079", MCColumnType.NUMBER);
		p.columnDispRslt_col_080 = p.beansFactory.createTableColumn("DispRslt.col_080", MCColumnType.NUMBER);
		p.columnDispRslt_col_081 = p.beansFactory.createTableColumn("DispRslt.col_081", MCColumnType.NUMBER);
		p.columnDispRslt_col_082 = p.beansFactory.createTableColumn("DispRslt.col_082", MCColumnType.NUMBER);
		p.columnDispRslt_col_083 = p.beansFactory.createTableColumn("DispRslt.col_083", MCColumnType.NUMBER);
		p.columnDispRslt_col_084 = p.beansFactory.createTableColumn("DispRslt.col_084", MCColumnType.NUMBER);
		p.columnDispRslt_col_085 = p.beansFactory.createTableColumn("DispRslt.col_085", MCColumnType.NUMBER);
		p.columnDispRslt_col_086 = p.beansFactory.createTableColumn("DispRslt.col_086", MCColumnType.NUMBER);
		p.columnDispRslt_col_087 = p.beansFactory.createTableColumn("DispRslt.col_087", MCColumnType.NUMBER);
		p.columnDispRslt_col_088 = p.beansFactory.createTableColumn("DispRslt.col_088", MCColumnType.NUMBER);
		p.columnDispRslt_col_089 = p.beansFactory.createTableColumn("DispRslt.col_089", MCColumnType.NUMBER);
		p.columnDispRslt_col_090 = p.beansFactory.createTableColumn("DispRslt.col_090", MCColumnType.NUMBER);
		p.columnDispRslt_col_091 = p.beansFactory.createTableColumn("DispRslt.col_091", MCColumnType.NUMBER);
		p.columnDispRslt_col_092 = p.beansFactory.createTableColumn("DispRslt.col_092", MCColumnType.NUMBER);
		p.columnDispRslt_col_093 = p.beansFactory.createTableColumn("DispRslt.col_093", MCColumnType.NUMBER);
		p.columnDispRslt_col_094 = p.beansFactory.createTableColumn("DispRslt.col_094", MCColumnType.NUMBER);
		p.columnDispRslt_col_095 = p.beansFactory.createTableColumn("DispRslt.col_095", MCColumnType.NUMBER);
		p.columnDispRslt_col_096 = p.beansFactory.createTableColumn("DispRslt.col_096", MCColumnType.NUMBER);
		p.columnDispRslt_col_097 = p.beansFactory.createTableColumn("DispRslt.col_097", MCColumnType.NUMBER);
		p.columnDispRslt_col_098 = p.beansFactory.createTableColumn("DispRslt.col_098", MCColumnType.NUMBER);
		p.columnDispRslt_col_099 = p.beansFactory.createTableColumn("DispRslt.col_099", MCColumnType.NUMBER);
		p.columnDispRslt_col_100 = p.beansFactory.createTableColumn("DispRslt.col_100", MCColumnType.NUMBER);
		p.columnDispRslt_col_101 = p.beansFactory.createTableColumn("DispRslt.col_101", MCColumnType.NUMBER);
		p.columnDispRslt_col_102 = p.beansFactory.createTableColumn("DispRslt.col_102", MCColumnType.NUMBER);
		p.columnDispRslt_col_103 = p.beansFactory.createTableColumn("DispRslt.col_103", MCColumnType.NUMBER);
		p.columnDispRslt_col_104 = p.beansFactory.createTableColumn("DispRslt.col_104", MCColumnType.NUMBER);
		p.columnDispRslt_col_105 = p.beansFactory.createTableColumn("DispRslt.col_105", MCColumnType.NUMBER);
		p.columnDispRslt_col_106 = p.beansFactory.createTableColumn("DispRslt.col_106", MCColumnType.NUMBER);
		p.columnDispRslt_col_107 = p.beansFactory.createTableColumn("DispRslt.col_107", MCColumnType.NUMBER);
		p.columnDispRslt_col_108 = p.beansFactory.createTableColumn("DispRslt.col_108", MCColumnType.NUMBER);
		p.columnDispRslt_col_109 = p.beansFactory.createTableColumn("DispRslt.col_109", MCColumnType.NUMBER);
		p.columnDispRslt_col_110 = p.beansFactory.createTableColumn("DispRslt.col_110", MCColumnType.NUMBER);
		p.columnDispRslt_col_111 = p.beansFactory.createTableColumn("DispRslt.col_111", MCColumnType.NUMBER);
		p.columnDispRslt_col_112 = p.beansFactory.createTableColumn("DispRslt.col_112", MCColumnType.NUMBER);
		p.columnDispRslt_col_113 = p.beansFactory.createTableColumn("DispRslt.col_113", MCColumnType.NUMBER);
		p.columnDispRslt_col_114 = p.beansFactory.createTableColumn("DispRslt.col_114", MCColumnType.NUMBER);
		p.columnDispRslt_col_115 = p.beansFactory.createTableColumn("DispRslt.col_115", MCColumnType.NUMBER);
		p.columnDispRslt_col_116 = p.beansFactory.createTableColumn("DispRslt.col_116", MCColumnType.NUMBER);
		p.columnDispRslt_col_117 = p.beansFactory.createTableColumn("DispRslt.col_117", MCColumnType.NUMBER);
		p.columnDispRslt_col_118 = p.beansFactory.createTableColumn("DispRslt.col_118", MCColumnType.NUMBER);
		p.columnDispRslt_col_119 = p.beansFactory.createTableColumn("DispRslt.col_119", MCColumnType.NUMBER);
		p.columnDispRslt_col_120 = p.beansFactory.createTableColumn("DispRslt.col_120", MCColumnType.NUMBER);
		p.columnDispRslt_col_121 = p.beansFactory.createTableColumn("DispRslt.col_121", MCColumnType.NUMBER);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBFP_MlyStkWipCostSrch p) {
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
	protected static void jbInitFold(MGBFP_MlyStkWipCostSrch p) {
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
	protected static void jbInitTab1(MGBFP_MlyStkWipCostSrch p) {
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
	protected static void jbInitTab2(MGBFP_MlyStkWipCostSrch p) {
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
	protected static void jbInitTab3(MGBFP_MlyStkWipCostSrch p) {
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
	protected static void jbInitTab4(MGBFP_MlyStkWipCostSrch p) {
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
	protected static void jbInitCnd(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_grp_cd, true);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_ym_fr);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ym_fr);
		p.Cnd_ym_fr.setNextBeans(p.Cnd_ym_to);
		p.Cnd_ym_fr.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.ym_fr_META);
		p.Cnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ym_to_Label);
		p.CndPanel.add(p.Cnd_ym_to);
		p.Cnd_ym_to.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ym_to.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.ym_to_META);
		p.Cnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_jnl_cd, true);
		p.Cnd_itm_jnl_cd.setLinkBeans(p.Cnd_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setNextBeans(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_jnl_nm_META);
		p.setPluralValueEnable(p.Cnd_itm_jnl_nm, true);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_mng_dpt_cd);
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
		p.Cnd_mng_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mng_dpt_cd, true);
		p.Cnd_mng_dpt_cd.setLinkBeans(p.Cnd_mng_dpt_nm);
		p.CndPanel.add(p.Cnd_mng_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_mng_dpt_cd);
		p.Cnd_mng_dpt_cd.setNextBeans(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.mng_dpt_cd_META);
		p.CndPanel.add(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_nm.setNextBeans(p.Cnd_lot_no);
		p.Cnd_mng_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.mng_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_mng_dpt_nm, true);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno1);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.sublot_no_META);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno1_Label);
		p.CndPanel.add(p.Cnd_sno1);
		p.Cnd_sno1.setNextBeans(p.Cnd_sno2);
		p.Cnd_sno1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.sno1_META);
		p.setPluralValueEnable(p.Cnd_sno1, true);
		p.CndPanel.add(p.Cnd_sno2_Label);
		p.CndPanel.add(p.Cnd_sno2);
		p.Cnd_sno2.setNextBeans(p.Cnd_sno3);
		p.Cnd_sno2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.sno2_META);
		p.setPluralValueEnable(p.Cnd_sno2, true);
		p.CndPanel.add(p.Cnd_sno3_Label);
		p.CndPanel.add(p.Cnd_sno3);
		p.Cnd_sno3.setNextBeans(p.Cnd_sno4);
		p.Cnd_sno3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.sno3_META);
		p.setPluralValueEnable(p.Cnd_sno3, true);
		p.CndPanel.add(p.Cnd_sno4_Label);
		p.CndPanel.add(p.Cnd_sno4);
		p.Cnd_sno4.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_sno4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.sno4_META);
		p.setPluralValueEnable(p.Cnd_sno4, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_oper_cd);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.Cnd_oper_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_cd, true);
		p.Cnd_oper_cd.setLinkBeans(p.Cnd_oper_nm);
		p.CndPanel.add(p.Cnd_oper_cd_Label);
		p.CndPanel.add(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setNextBeans(p.Cnd_oper_nm);
		p.Cnd_oper_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.oper_cd_META);
		p.CndPanel.add(p.Cnd_oper_nm);
		p.Cnd_oper_nm.setNextBeans(p.Cnd_asst_typ);
		p.Cnd_oper_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.oper_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_nm, true);
		p.Cnd_asst_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asst_typ, true);
		p.Cnd_asst_typ.setLinkBeans(p.Cnd_asst_typ_nm);
		p.CndPanel.add(p.Cnd_asst_typ_Label);
		p.CndPanel.add(p.Cnd_asst_typ);
		p.Cnd_asst_typ.setNextBeans(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.asst_typ_META);
		p.CndPanel.add(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ_nm.setNextBeans(p.Cnd_except_other_flg);
		p.Cnd_asst_typ_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.asst_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_asst_typ_nm, true);
		p.CndPanel.add(p.Cnd_except_other_flg);
		p.Cnd_except_other_flg.setNextBeans(p.Cnd_bp_cd);
		p.Cnd_except_other_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.except_other_flg_META);
		p.CndPanel.add(p.Cnd_bp_cd_Label);
		p.CndPanel.add(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_cd, true);
		p.CndPanel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_no_bp_flg);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_nm, true);
		p.CndPanel.add(p.Cnd_no_bp_flg);
		p.Cnd_no_bp_flg.setNextBeans(p.Cnd_cntry_cd);
		p.Cnd_no_bp_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.no_bp_flg_META);
		p.Cnd_cntry_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cntry_cd, true);
		p.Cnd_cntry_cd.setLinkBeans(p.Cnd_cntry_nm);
		p.CndPanel.add(p.Cnd_cntry_cd_Label);
		p.CndPanel.add(p.Cnd_cntry_cd);
		p.Cnd_cntry_cd.setNextBeans(p.Cnd_cntry_nm);
		p.Cnd_cntry_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.cntry_cd_META);
		p.CndPanel.add(p.Cnd_cntry_nm);
		p.Cnd_cntry_nm.setNextBeans(p.Cnd_area_cd);
		p.Cnd_cntry_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.cntry_nm_META);
		p.setPluralValueEnable(p.Cnd_cntry_nm, true);
		p.Cnd_area_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_area_cd, true);
		p.Cnd_area_cd.setLinkBeans(p.Cnd_area_nm);
		p.CndPanel.add(p.Cnd_area_cd_Label);
		p.CndPanel.add(p.Cnd_area_cd);
		p.Cnd_area_cd.setNextBeans(p.Cnd_area_nm);
		p.Cnd_area_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.area_cd_META);
		p.CndPanel.add(p.Cnd_area_nm);
		p.Cnd_area_nm.setNextBeans(p.Cnd_end_stk_flg);
		p.Cnd_area_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.area_nm_META);
		p.setPluralValueEnable(p.Cnd_area_nm, true);
		p.CndPanel.add(p.Cnd_end_stk_flg);
		p.Cnd_end_stk_flg.setNextBeans(p.Cnd_end_wip_flg);
		p.Cnd_end_stk_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.end_stk_flg_META);
		p.CndPanel.add(p.Cnd_end_wip_flg);
		p.Cnd_end_wip_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.end_wip_flg_META);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
		p.Cnd_bp_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd1, true);
		p.Cnd_bp_grp_cd1.setLinkBeans(p.Cnd_bp_grp_nm1);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd1_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd1);
		p.Cnd3Panel.setLastBeans(p.Cnd_bp_grp_cd1);
		p.Cnd_bp_grp_cd1.setNextBeans(p.Cnd_bp_grp_nm1);
		p.Cnd_bp_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_cd1_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm1);
		p.Cnd_bp_grp_nm1.setNextBeans(p.Cnd_bp_grp_cd2);
		p.Cnd_bp_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm1, true);
		p.Cnd_bp_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd2, true);
		p.Cnd_bp_grp_cd2.setLinkBeans(p.Cnd_bp_grp_nm2);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd2_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd2);
		p.Cnd_bp_grp_cd2.setNextBeans(p.Cnd_bp_grp_nm2);
		p.Cnd_bp_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_cd2_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm2);
		p.Cnd_bp_grp_nm2.setNextBeans(p.Cnd_bp_grp_cd3);
		p.Cnd_bp_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm2, true);
		p.Cnd_bp_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd3, true);
		p.Cnd_bp_grp_cd3.setLinkBeans(p.Cnd_bp_grp_nm3);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd3_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd3);
		p.Cnd_bp_grp_cd3.setNextBeans(p.Cnd_bp_grp_nm3);
		p.Cnd_bp_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_cd3_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm3);
		p.Cnd_bp_grp_nm3.setNextBeans(p.Cnd_bp_grp_cd4);
		p.Cnd_bp_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm3, true);
		p.Cnd_bp_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd4, true);
		p.Cnd_bp_grp_cd4.setLinkBeans(p.Cnd_bp_grp_nm4);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd4_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd4);
		p.Cnd_bp_grp_cd4.setNextBeans(p.Cnd_bp_grp_nm4);
		p.Cnd_bp_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_cd4_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm4);
		p.Cnd_bp_grp_nm4.setNextBeans(p.Cnd_bp_grp_cd5);
		p.Cnd_bp_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm4, true);
		p.Cnd_bp_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd5, true);
		p.Cnd_bp_grp_cd5.setLinkBeans(p.Cnd_bp_grp_nm5);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd5_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd5);
		p.Cnd_bp_grp_cd5.setNextBeans(p.Cnd_bp_grp_nm5);
		p.Cnd_bp_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_cd5_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm5);
		p.Cnd_bp_grp_nm5.setNextBeans(p.Cnd_bp_grp_cd6);
		p.Cnd_bp_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm5, true);
		p.Cnd_bp_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd6, true);
		p.Cnd_bp_grp_cd6.setLinkBeans(p.Cnd_bp_grp_nm6);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd6_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd6);
		p.Cnd_bp_grp_cd6.setNextBeans(p.Cnd_bp_grp_nm6);
		p.Cnd_bp_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_cd6_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm6);
		p.Cnd_bp_grp_nm6.setNextBeans(p.Cnd_bp_grp_cd7);
		p.Cnd_bp_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm6, true);
		p.Cnd_bp_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd7, true);
		p.Cnd_bp_grp_cd7.setLinkBeans(p.Cnd_bp_grp_nm7);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd7_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd7);
		p.Cnd_bp_grp_cd7.setNextBeans(p.Cnd_bp_grp_nm7);
		p.Cnd_bp_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_cd7_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm7);
		p.Cnd_bp_grp_nm7.setNextBeans(p.Cnd_bp_grp_cd8);
		p.Cnd_bp_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm7, true);
		p.Cnd_bp_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd8, true);
		p.Cnd_bp_grp_cd8.setLinkBeans(p.Cnd_bp_grp_nm8);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd8_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd8);
		p.Cnd_bp_grp_cd8.setNextBeans(p.Cnd_bp_grp_nm8);
		p.Cnd_bp_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_cd8_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm8);
		p.Cnd_bp_grp_nm8.setNextBeans(p.Cnd_bp_grp_cd9);
		p.Cnd_bp_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm8, true);
		p.Cnd_bp_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd9, true);
		p.Cnd_bp_grp_cd9.setLinkBeans(p.Cnd_bp_grp_nm9);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd9_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd9);
		p.Cnd_bp_grp_cd9.setNextBeans(p.Cnd_bp_grp_nm9);
		p.Cnd_bp_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_cd9_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm9);
		p.Cnd_bp_grp_nm9.setNextBeans(p.Cnd_bp_grp_cd10);
		p.Cnd_bp_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm9, true);
		p.Cnd_bp_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd10, true);
		p.Cnd_bp_grp_cd10.setLinkBeans(p.Cnd_bp_grp_nm10);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd10_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd10);
		p.Cnd_bp_grp_cd10.setNextBeans(p.Cnd_bp_grp_nm10);
		p.Cnd_bp_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_cd10_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm10);
		p.Cnd_bp_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm10, true);
		p.TtlPanel.add(p.Cnd_calc_grp_flg);
		p.TtlPanel.setLastBeans(p.Cnd_calc_grp_flg);
		p.Cnd_calc_grp_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_calc_grp_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.calc_grp_flg_META);
		p.TtlPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setNextBeans(p.Cnd_mng_dpt_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.wg_flg_META);
		p.TtlPanel.add(p.Cnd_mng_dpt_flg);
		p.Cnd_mng_dpt_flg.setNextBeans(p.Cnd_itm_flg);
		p.Cnd_mng_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.mng_dpt_flg_META);
		p.TtlPanel.add(p.Cnd_itm_flg);
		p.Cnd_itm_flg.setNextBeans(p.Cnd_itm_typ_flg);
		p.Cnd_itm_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_flg_META);
		p.TtlPanel.add(p.Cnd_itm_typ_flg);
		p.Cnd_itm_typ_flg.setNextBeans(p.Cnd_itm_typ_d_flg);
		p.Cnd_itm_typ_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_typ_flg_META);
		p.TtlPanel.add(p.Cnd_itm_typ_d_flg);
		p.Cnd_itm_typ_d_flg.setNextBeans(p.Cnd_itm_jnl_flg);
		p.Cnd_itm_typ_d_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_typ_d_flg_META);
		p.TtlPanel.add(p.Cnd_itm_jnl_flg);
		p.Cnd_itm_jnl_flg.setNextBeans(p.Cnd_lot_flg);
		p.Cnd_itm_jnl_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_jnl_flg_META);
		p.TtlPanel.add(p.Cnd_lot_flg);
		p.Cnd_lot_flg.setNextBeans(p.Cnd_sublot_flg);
		p.Cnd_lot_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.lot_flg_META);
		p.TtlPanel.add(p.Cnd_sublot_flg);
		p.Cnd_sublot_flg.setNextBeans(p.Cnd_sno1_flg);
		p.Cnd_sublot_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.sublot_flg_META);
		p.TtlPanel.add(p.Cnd_sno1_flg);
		p.Cnd_sno1_flg.setNextBeans(p.Cnd_sno2_flg);
		p.Cnd_sno1_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.sno1_flg_META);
		p.TtlPanel.add(p.Cnd_sno2_flg);
		p.Cnd_sno2_flg.setNextBeans(p.Cnd_sno3_flg);
		p.Cnd_sno2_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.sno2_flg_META);
		p.TtlPanel.add(p.Cnd_sno3_flg);
		p.Cnd_sno3_flg.setNextBeans(p.Cnd_sno4_flg);
		p.Cnd_sno3_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.sno3_flg_META);
		p.TtlPanel.add(p.Cnd_sno4_flg);
		p.Cnd_sno4_flg.setNextBeans(p.Cnd_asst_flg);
		p.Cnd_sno4_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.sno4_flg_META);
		p.TtlPanel.add(p.Cnd_asst_flg);
		p.Cnd_asst_flg.setNextBeans(p.Cnd_bp_flg);
		p.Cnd_asst_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.asst_flg_META);
		p.TtlPanel.add(p.Cnd_bp_flg);
		p.Cnd_bp_flg.setNextBeans(p.Cnd_cntry_flg);
		p.Cnd_bp_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_flg_META);
		p.TtlPanel.add(p.Cnd_cntry_flg);
		p.Cnd_cntry_flg.setNextBeans(p.Cnd_area_flg);
		p.Cnd_cntry_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.cntry_flg_META);
		p.TtlPanel.add(p.Cnd_area_flg);
		p.Cnd_area_flg.setNextBeans(p.Cnd_loc_flg);
		p.Cnd_area_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.area_flg_META);
		p.TtlPanel.add(p.Cnd_loc_flg);
		p.Cnd_loc_flg.setNextBeans(p.Cnd_str_ln_flg);
		p.Cnd_loc_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.loc_flg_META);
		p.TtlPanel.add(p.Cnd_str_ln_flg);
		p.Cnd_str_ln_flg.setNextBeans(p.Cnd_oper_flg);
		p.Cnd_str_ln_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.str_ln_flg_META);
		p.TtlPanel.add(p.Cnd_oper_flg);
		p.Cnd_oper_flg.setNextBeans(p.Cnd_qty_flg);
		p.Cnd_oper_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.oper_flg_META);
		p.TtlPanel.add(p.Cnd_qty_flg);
		p.Cnd_qty_flg.setNextBeans(p.Cnd_itm_grp_flg1);
		p.Cnd_qty_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.qty_flg_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg1);
		p.Cnd_itm_grp_flg1.setNextBeans(p.Cnd_itm_grp_flg2);
		p.Cnd_itm_grp_flg1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_flg1_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg2);
		p.Cnd_itm_grp_flg2.setNextBeans(p.Cnd_itm_grp_flg3);
		p.Cnd_itm_grp_flg2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_flg2_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg3);
		p.Cnd_itm_grp_flg3.setNextBeans(p.Cnd_itm_grp_flg4);
		p.Cnd_itm_grp_flg3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_flg3_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg4);
		p.Cnd_itm_grp_flg4.setNextBeans(p.Cnd_itm_grp_flg5);
		p.Cnd_itm_grp_flg4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_flg4_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg5);
		p.Cnd_itm_grp_flg5.setNextBeans(p.Cnd_itm_grp_flg6);
		p.Cnd_itm_grp_flg5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_flg5_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg6);
		p.Cnd_itm_grp_flg6.setNextBeans(p.Cnd_itm_grp_flg7);
		p.Cnd_itm_grp_flg6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_flg6_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg7);
		p.Cnd_itm_grp_flg7.setNextBeans(p.Cnd_itm_grp_flg8);
		p.Cnd_itm_grp_flg7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_flg7_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg8);
		p.Cnd_itm_grp_flg8.setNextBeans(p.Cnd_itm_grp_flg9);
		p.Cnd_itm_grp_flg8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_flg8_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg9);
		p.Cnd_itm_grp_flg9.setNextBeans(p.Cnd_itm_grp_flg10);
		p.Cnd_itm_grp_flg9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_flg9_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg10);
		p.Cnd_itm_grp_flg10.setNextBeans(p.Cnd_bp_grp_flg1);
		p.Cnd_itm_grp_flg10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.itm_grp_flg10_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg1);
		p.Cnd_bp_grp_flg1.setNextBeans(p.Cnd_bp_grp_flg2);
		p.Cnd_bp_grp_flg1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_flg1_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg2);
		p.Cnd_bp_grp_flg2.setNextBeans(p.Cnd_bp_grp_flg3);
		p.Cnd_bp_grp_flg2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_flg2_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg3);
		p.Cnd_bp_grp_flg3.setNextBeans(p.Cnd_bp_grp_flg4);
		p.Cnd_bp_grp_flg3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_flg3_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg4);
		p.Cnd_bp_grp_flg4.setNextBeans(p.Cnd_bp_grp_flg5);
		p.Cnd_bp_grp_flg4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_flg4_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg5);
		p.Cnd_bp_grp_flg5.setNextBeans(p.Cnd_bp_grp_flg6);
		p.Cnd_bp_grp_flg5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_flg5_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg6);
		p.Cnd_bp_grp_flg6.setNextBeans(p.Cnd_bp_grp_flg7);
		p.Cnd_bp_grp_flg6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_flg6_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg7);
		p.Cnd_bp_grp_flg7.setNextBeans(p.Cnd_bp_grp_flg8);
		p.Cnd_bp_grp_flg7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_flg7_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg8);
		p.Cnd_bp_grp_flg8.setNextBeans(p.Cnd_bp_grp_flg9);
		p.Cnd_bp_grp_flg8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_flg8_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg9);
		p.Cnd_bp_grp_flg9.setNextBeans(p.Cnd_bp_grp_flg10);
		p.Cnd_bp_grp_flg9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_flg9_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg10);
		p.Cnd_bp_grp_flg10.setNextBeans(p.Cnd_select_all);
		p.Cnd_bp_grp_flg10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.bp_grp_flg10_META);
		p.Cnd_select_all.setIcon("SELECT_ALL");
		p.Cnd_select_all.setFunctionKey(MCFunctionKey.F13);
		p.TtlPanel.add(p.Cnd_select_all);
		p.Cnd_select_all.setNextBeans(p.Cnd_deselect_all);
		p.Cnd_deselect_all.setIcon("DESELECT_ALL");
		p.Cnd_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.TtlPanel.add(p.Cnd_deselect_all);
		p.LPnlPanel.add(p.Cnd_disp_key);
		p.LPnlPanel.setLastBeans(p.Cnd_disp_key);
		p.Cnd_disp_key.setNextBeans(p.Cnd_disp_upri);
		p.Cnd_disp_key.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.disp_key_META);
		p.LPnlPanel.add(p.Cnd_disp_upri);
		p.Cnd_disp_upri.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0440.CndR.disp_upri_META);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTtl(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.TtlPanel.setValueCheck(false);
		p.TtlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MGBFP_MlyStkWipCostSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBFP_MlyStkWipCostSrch p) {
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
	protected static void jbInitDispRslt(MGBFP_MlyStkWipCostSrch p) {
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
		MGBFP_MlyStkWipCostSrch_MC.mcInitTop((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.mcInitFold((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.mcInitTab1((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.mcInitTab2((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.mcInitTab3((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.mcInitTab4((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.mcInitCnd((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.mcInitCnd2((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.mcInitCnd3((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.mcInitTtl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.mcInitLPnl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.mcInitCtrl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.mcInitDispRslt((MGBFP_MlyStkWipCostSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBFP_MlyStkWipCostSrch_MC.statusInitSRCH_Top((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitSRCH_Fold((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitSRCH_Tab1((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitSRCH_Tab2((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitSRCH_Tab3((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitSRCH_Tab4((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitSRCH_Cnd((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitSRCH_Cnd2((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitSRCH_Cnd3((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitSRCH_Ttl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitSRCH_LPnl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitSRCH_Ctrl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitSRCH_DispRslt((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitSRCH_Rslt((MGBFP_MlyStkWipCostSrch)this);

		// [REF]ステータスのモードの設定
		MGBFP_MlyStkWipCostSrch_MC.statusInitREF_Top((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitREF_Fold((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitREF_Tab1((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitREF_Tab2((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitREF_Tab3((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitREF_Tab4((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitREF_Cnd((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitREF_Cnd2((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitREF_Cnd3((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitREF_Ttl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitREF_LPnl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitREF_Ctrl((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitREF_DispRslt((MGBFP_MlyStkWipCostSrch)this);
		MGBFP_MlyStkWipCostSrch_MC.statusInitREF_Rslt((MGBFP_MlyStkWipCostSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBFP_MlyStkWipCostSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBFP_MlyStkWipCostSrch p) {
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_ym_fr.setListListener(p);
		p.Cnd_ym_fr.addAllListener(p);
		p.Cnd_ym_to.setListListener(p);
		p.Cnd_ym_to.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_itm_jnl_cd.setListListener(p);
		p.Cnd_itm_jnl_cd.addAllListener(p);
		p.Cnd_itm_jnl_nm.setListListener(p);
		p.Cnd_itm_jnl_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_mng_dpt_cd.setListListener(p);
		p.Cnd_mng_dpt_cd.addAllListener(p);
		p.Cnd_mng_dpt_nm.setListListener(p);
		p.Cnd_mng_dpt_nm.addAllListener(p);
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
		p.Cnd_asst_typ.setListListener(p);
		p.Cnd_asst_typ.addAllListener(p);
		p.Cnd_asst_typ_nm.setListListener(p);
		p.Cnd_asst_typ_nm.addAllListener(p);
		p.Cnd_except_other_flg.addAllListener(p);
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_no_bp_flg.addAllListener(p);
		p.Cnd_cntry_cd.setListListener(p);
		p.Cnd_cntry_cd.addAllListener(p);
		p.Cnd_cntry_nm.setListListener(p);
		p.Cnd_cntry_nm.addAllListener(p);
		p.Cnd_area_cd.setListListener(p);
		p.Cnd_area_cd.addAllListener(p);
		p.Cnd_area_nm.setListListener(p);
		p.Cnd_area_nm.addAllListener(p);
		p.Cnd_end_stk_flg.addAllListener(p);
		p.Cnd_end_wip_flg.addAllListener(p);
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
		p.Cnd_calc_grp_flg.addAllListener(p);
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
		p.Cnd_asst_flg.addAllListener(p);
		p.Cnd_bp_flg.addAllListener(p);
		p.Cnd_cntry_flg.addAllListener(p);
		p.Cnd_area_flg.addAllListener(p);
		p.Cnd_loc_flg.addAllListener(p);
		p.Cnd_str_ln_flg.addAllListener(p);
		p.Cnd_oper_flg.addAllListener(p);
		p.Cnd_qty_flg.addAllListener(p);
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
		p.Cnd_disp_upri.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 *  [Ttl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTtl(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MGBFP_MlyStkWipCostSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBFP_MlyStkWipCostSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispRslt(MGBFP_MlyStkWipCostSrch p) {
		p.DispRsltTable.addAllListener(p);
		p.columnDispRslt_calc_rec_typ.addAllListener(p);
		p.columnDispRslt_calc_rec_typ.setListListener(p);
		p.columnDispRslt_calc_rec_typ_nm.addAllListener(p);
		p.columnDispRslt_calc_rec_typ_nm.setListListener(p);
		p.columnDispRslt_calc_grp_cd.addAllListener(p);
		p.columnDispRslt_calc_grp_cd.setListListener(p);
		p.columnDispRslt_calc_grp_nm.addAllListener(p);
		p.columnDispRslt_calc_grp_nm.setListListener(p);
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
		p.columnDispRslt_bp_cd.addAllListener(p);
		p.columnDispRslt_bp_cd.setListListener(p);
		p.columnDispRslt_bp_nm.addAllListener(p);
		p.columnDispRslt_bp_nm.setListListener(p);
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
		p.columnDispRslt_cntry_cd.addAllListener(p);
		p.columnDispRslt_cntry_cd.setListListener(p);
		p.columnDispRslt_cntry_nm.addAllListener(p);
		p.columnDispRslt_cntry_nm.setListListener(p);
		p.columnDispRslt_area_cd.addAllListener(p);
		p.columnDispRslt_area_cd.setListListener(p);
		p.columnDispRslt_area_nm.addAllListener(p);
		p.columnDispRslt_area_nm.setListListener(p);
		p.columnDispRslt_loc_cd.addAllListener(p);
		p.columnDispRslt_loc_cd.setListListener(p);
		p.columnDispRslt_loc_nm.addAllListener(p);
		p.columnDispRslt_loc_nm.setListListener(p);
		p.columnDispRslt_str_ln_cd.addAllListener(p);
		p.columnDispRslt_str_ln_cd.setListListener(p);
		p.columnDispRslt_str_ln_nm.addAllListener(p);
		p.columnDispRslt_str_ln_nm.setListListener(p);
		p.columnDispRslt_oper_cd.addAllListener(p);
		p.columnDispRslt_oper_cd.setListListener(p);
		p.columnDispRslt_oper_nm.addAllListener(p);
		p.columnDispRslt_oper_nm.setListListener(p);
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
		p.columnDispRslt_col_000.addAllListener(p);
		p.columnDispRslt_col_000.setListListener(p);
		p.columnDispRslt_col_001.addAllListener(p);
		p.columnDispRslt_col_001.setListListener(p);
		p.columnDispRslt_col_002.addAllListener(p);
		p.columnDispRslt_col_002.setListListener(p);
		p.columnDispRslt_col_003.addAllListener(p);
		p.columnDispRslt_col_003.setListListener(p);
		p.columnDispRslt_col_004.addAllListener(p);
		p.columnDispRslt_col_004.setListListener(p);
		p.columnDispRslt_col_005.addAllListener(p);
		p.columnDispRslt_col_005.setListListener(p);
		p.columnDispRslt_col_006.addAllListener(p);
		p.columnDispRslt_col_006.setListListener(p);
		p.columnDispRslt_col_007.addAllListener(p);
		p.columnDispRslt_col_007.setListListener(p);
		p.columnDispRslt_col_008.addAllListener(p);
		p.columnDispRslt_col_008.setListListener(p);
		p.columnDispRslt_col_009.addAllListener(p);
		p.columnDispRslt_col_009.setListListener(p);
		p.columnDispRslt_col_010.addAllListener(p);
		p.columnDispRslt_col_010.setListListener(p);
		p.columnDispRslt_col_011.addAllListener(p);
		p.columnDispRslt_col_011.setListListener(p);
		p.columnDispRslt_col_012.addAllListener(p);
		p.columnDispRslt_col_012.setListListener(p);
		p.columnDispRslt_col_013.addAllListener(p);
		p.columnDispRslt_col_013.setListListener(p);
		p.columnDispRslt_col_014.addAllListener(p);
		p.columnDispRslt_col_014.setListListener(p);
		p.columnDispRslt_col_015.addAllListener(p);
		p.columnDispRslt_col_015.setListListener(p);
		p.columnDispRslt_col_016.addAllListener(p);
		p.columnDispRslt_col_016.setListListener(p);
		p.columnDispRslt_col_017.addAllListener(p);
		p.columnDispRslt_col_017.setListListener(p);
		p.columnDispRslt_col_018.addAllListener(p);
		p.columnDispRslt_col_018.setListListener(p);
		p.columnDispRslt_col_019.addAllListener(p);
		p.columnDispRslt_col_019.setListListener(p);
		p.columnDispRslt_col_020.addAllListener(p);
		p.columnDispRslt_col_020.setListListener(p);
		p.columnDispRslt_col_021.addAllListener(p);
		p.columnDispRslt_col_021.setListListener(p);
		p.columnDispRslt_col_022.addAllListener(p);
		p.columnDispRslt_col_022.setListListener(p);
		p.columnDispRslt_col_023.addAllListener(p);
		p.columnDispRslt_col_023.setListListener(p);
		p.columnDispRslt_col_024.addAllListener(p);
		p.columnDispRslt_col_024.setListListener(p);
		p.columnDispRslt_col_025.addAllListener(p);
		p.columnDispRslt_col_025.setListListener(p);
		p.columnDispRslt_col_026.addAllListener(p);
		p.columnDispRslt_col_026.setListListener(p);
		p.columnDispRslt_col_027.addAllListener(p);
		p.columnDispRslt_col_027.setListListener(p);
		p.columnDispRslt_col_028.addAllListener(p);
		p.columnDispRslt_col_028.setListListener(p);
		p.columnDispRslt_col_029.addAllListener(p);
		p.columnDispRslt_col_029.setListListener(p);
		p.columnDispRslt_col_030.addAllListener(p);
		p.columnDispRslt_col_030.setListListener(p);
		p.columnDispRslt_col_031.addAllListener(p);
		p.columnDispRslt_col_031.setListListener(p);
		p.columnDispRslt_col_032.addAllListener(p);
		p.columnDispRslt_col_032.setListListener(p);
		p.columnDispRslt_col_033.addAllListener(p);
		p.columnDispRslt_col_033.setListListener(p);
		p.columnDispRslt_col_034.addAllListener(p);
		p.columnDispRslt_col_034.setListListener(p);
		p.columnDispRslt_col_035.addAllListener(p);
		p.columnDispRslt_col_035.setListListener(p);
		p.columnDispRslt_col_036.addAllListener(p);
		p.columnDispRslt_col_036.setListListener(p);
		p.columnDispRslt_col_037.addAllListener(p);
		p.columnDispRslt_col_037.setListListener(p);
		p.columnDispRslt_col_038.addAllListener(p);
		p.columnDispRslt_col_038.setListListener(p);
		p.columnDispRslt_col_039.addAllListener(p);
		p.columnDispRslt_col_039.setListListener(p);
		p.columnDispRslt_col_040.addAllListener(p);
		p.columnDispRslt_col_040.setListListener(p);
		p.columnDispRslt_col_041.addAllListener(p);
		p.columnDispRslt_col_041.setListListener(p);
		p.columnDispRslt_col_042.addAllListener(p);
		p.columnDispRslt_col_042.setListListener(p);
		p.columnDispRslt_col_043.addAllListener(p);
		p.columnDispRslt_col_043.setListListener(p);
		p.columnDispRslt_col_044.addAllListener(p);
		p.columnDispRslt_col_044.setListListener(p);
		p.columnDispRslt_col_045.addAllListener(p);
		p.columnDispRslt_col_045.setListListener(p);
		p.columnDispRslt_col_046.addAllListener(p);
		p.columnDispRslt_col_046.setListListener(p);
		p.columnDispRslt_col_047.addAllListener(p);
		p.columnDispRslt_col_047.setListListener(p);
		p.columnDispRslt_col_048.addAllListener(p);
		p.columnDispRslt_col_048.setListListener(p);
		p.columnDispRslt_col_049.addAllListener(p);
		p.columnDispRslt_col_049.setListListener(p);
		p.columnDispRslt_col_050.addAllListener(p);
		p.columnDispRslt_col_050.setListListener(p);
		p.columnDispRslt_col_051.addAllListener(p);
		p.columnDispRslt_col_051.setListListener(p);
		p.columnDispRslt_col_052.addAllListener(p);
		p.columnDispRslt_col_052.setListListener(p);
		p.columnDispRslt_col_053.addAllListener(p);
		p.columnDispRslt_col_053.setListListener(p);
		p.columnDispRslt_col_054.addAllListener(p);
		p.columnDispRslt_col_054.setListListener(p);
		p.columnDispRslt_col_055.addAllListener(p);
		p.columnDispRslt_col_055.setListListener(p);
		p.columnDispRslt_col_056.addAllListener(p);
		p.columnDispRslt_col_056.setListListener(p);
		p.columnDispRslt_col_057.addAllListener(p);
		p.columnDispRslt_col_057.setListListener(p);
		p.columnDispRslt_col_058.addAllListener(p);
		p.columnDispRslt_col_058.setListListener(p);
		p.columnDispRslt_col_059.addAllListener(p);
		p.columnDispRslt_col_059.setListListener(p);
		p.columnDispRslt_col_060.addAllListener(p);
		p.columnDispRslt_col_060.setListListener(p);
		p.columnDispRslt_col_061.addAllListener(p);
		p.columnDispRslt_col_061.setListListener(p);
		p.columnDispRslt_col_062.addAllListener(p);
		p.columnDispRslt_col_062.setListListener(p);
		p.columnDispRslt_col_063.addAllListener(p);
		p.columnDispRslt_col_063.setListListener(p);
		p.columnDispRslt_col_064.addAllListener(p);
		p.columnDispRslt_col_064.setListListener(p);
		p.columnDispRslt_col_065.addAllListener(p);
		p.columnDispRslt_col_065.setListListener(p);
		p.columnDispRslt_col_066.addAllListener(p);
		p.columnDispRslt_col_066.setListListener(p);
		p.columnDispRslt_col_067.addAllListener(p);
		p.columnDispRslt_col_067.setListListener(p);
		p.columnDispRslt_col_068.addAllListener(p);
		p.columnDispRslt_col_068.setListListener(p);
		p.columnDispRslt_col_069.addAllListener(p);
		p.columnDispRslt_col_069.setListListener(p);
		p.columnDispRslt_col_070.addAllListener(p);
		p.columnDispRslt_col_070.setListListener(p);
		p.columnDispRslt_col_071.addAllListener(p);
		p.columnDispRslt_col_071.setListListener(p);
		p.columnDispRslt_col_072.addAllListener(p);
		p.columnDispRslt_col_072.setListListener(p);
		p.columnDispRslt_col_073.addAllListener(p);
		p.columnDispRslt_col_073.setListListener(p);
		p.columnDispRslt_col_074.addAllListener(p);
		p.columnDispRslt_col_074.setListListener(p);
		p.columnDispRslt_col_075.addAllListener(p);
		p.columnDispRslt_col_075.setListListener(p);
		p.columnDispRslt_col_076.addAllListener(p);
		p.columnDispRslt_col_076.setListListener(p);
		p.columnDispRslt_col_077.addAllListener(p);
		p.columnDispRslt_col_077.setListListener(p);
		p.columnDispRslt_col_078.addAllListener(p);
		p.columnDispRslt_col_078.setListListener(p);
		p.columnDispRslt_col_079.addAllListener(p);
		p.columnDispRslt_col_079.setListListener(p);
		p.columnDispRslt_col_080.addAllListener(p);
		p.columnDispRslt_col_080.setListListener(p);
		p.columnDispRslt_col_081.addAllListener(p);
		p.columnDispRslt_col_081.setListListener(p);
		p.columnDispRslt_col_082.addAllListener(p);
		p.columnDispRslt_col_082.setListListener(p);
		p.columnDispRslt_col_083.addAllListener(p);
		p.columnDispRslt_col_083.setListListener(p);
		p.columnDispRslt_col_084.addAllListener(p);
		p.columnDispRslt_col_084.setListListener(p);
		p.columnDispRslt_col_085.addAllListener(p);
		p.columnDispRslt_col_085.setListListener(p);
		p.columnDispRslt_col_086.addAllListener(p);
		p.columnDispRslt_col_086.setListListener(p);
		p.columnDispRslt_col_087.addAllListener(p);
		p.columnDispRslt_col_087.setListListener(p);
		p.columnDispRslt_col_088.addAllListener(p);
		p.columnDispRslt_col_088.setListListener(p);
		p.columnDispRslt_col_089.addAllListener(p);
		p.columnDispRslt_col_089.setListListener(p);
		p.columnDispRslt_col_090.addAllListener(p);
		p.columnDispRslt_col_090.setListListener(p);
		p.columnDispRslt_col_091.addAllListener(p);
		p.columnDispRslt_col_091.setListListener(p);
		p.columnDispRslt_col_092.addAllListener(p);
		p.columnDispRslt_col_092.setListListener(p);
		p.columnDispRslt_col_093.addAllListener(p);
		p.columnDispRslt_col_093.setListListener(p);
		p.columnDispRslt_col_094.addAllListener(p);
		p.columnDispRslt_col_094.setListListener(p);
		p.columnDispRslt_col_095.addAllListener(p);
		p.columnDispRslt_col_095.setListListener(p);
		p.columnDispRslt_col_096.addAllListener(p);
		p.columnDispRslt_col_096.setListListener(p);
		p.columnDispRslt_col_097.addAllListener(p);
		p.columnDispRslt_col_097.setListListener(p);
		p.columnDispRslt_col_098.addAllListener(p);
		p.columnDispRslt_col_098.setListListener(p);
		p.columnDispRslt_col_099.addAllListener(p);
		p.columnDispRslt_col_099.setListListener(p);
		p.columnDispRslt_col_100.addAllListener(p);
		p.columnDispRslt_col_100.setListListener(p);
		p.columnDispRslt_col_101.addAllListener(p);
		p.columnDispRslt_col_101.setListListener(p);
		p.columnDispRslt_col_102.addAllListener(p);
		p.columnDispRslt_col_102.setListListener(p);
		p.columnDispRslt_col_103.addAllListener(p);
		p.columnDispRslt_col_103.setListListener(p);
		p.columnDispRslt_col_104.addAllListener(p);
		p.columnDispRslt_col_104.setListListener(p);
		p.columnDispRslt_col_105.addAllListener(p);
		p.columnDispRslt_col_105.setListListener(p);
		p.columnDispRslt_col_106.addAllListener(p);
		p.columnDispRslt_col_106.setListListener(p);
		p.columnDispRslt_col_107.addAllListener(p);
		p.columnDispRslt_col_107.setListListener(p);
		p.columnDispRslt_col_108.addAllListener(p);
		p.columnDispRslt_col_108.setListListener(p);
		p.columnDispRslt_col_109.addAllListener(p);
		p.columnDispRslt_col_109.setListListener(p);
		p.columnDispRslt_col_110.addAllListener(p);
		p.columnDispRslt_col_110.setListListener(p);
		p.columnDispRslt_col_111.addAllListener(p);
		p.columnDispRslt_col_111.setListListener(p);
		p.columnDispRslt_col_112.addAllListener(p);
		p.columnDispRslt_col_112.setListListener(p);
		p.columnDispRslt_col_113.addAllListener(p);
		p.columnDispRslt_col_113.setListListener(p);
		p.columnDispRslt_col_114.addAllListener(p);
		p.columnDispRslt_col_114.setListListener(p);
		p.columnDispRslt_col_115.addAllListener(p);
		p.columnDispRslt_col_115.setListListener(p);
		p.columnDispRslt_col_116.addAllListener(p);
		p.columnDispRslt_col_116.setListListener(p);
		p.columnDispRslt_col_117.addAllListener(p);
		p.columnDispRslt_col_117.setListListener(p);
		p.columnDispRslt_col_118.addAllListener(p);
		p.columnDispRslt_col_118.setListListener(p);
		p.columnDispRslt_col_119.addAllListener(p);
		p.columnDispRslt_col_119.setListListener(p);
		p.columnDispRslt_col_120.addAllListener(p);
		p.columnDispRslt_col_120.setListListener(p);
		p.columnDispRslt_col_121.addAllListener(p);
		p.columnDispRslt_col_121.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab4(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBFP_MlyStkWipCostSrch p){
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_mng_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_except_other_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_bp_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_end_stk_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_end_wip_flg.putMode(p, SRCH, MCMode.REQUIRED);
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
		p.Cnd_calc_grp_flg.putMode(p, SRCH, MCMode.REQUIRED);
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
		p.Cnd_asst_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cntry_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_area_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_loc_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_str_ln_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_oper_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_qty_flg.putMode(p, SRCH, MCMode.REQUIRED);
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
		p.Cnd_bp_grp_flg1.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg2.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg3.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg4.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg5.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg6.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg7.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg8.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg9.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg10.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_disp_key.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_disp_upri.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ttl(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DispRslt(MGBFP_MlyStkWipCostSrch p){
		p.columnDispRslt_calc_rec_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispRslt_calc_rec_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_calc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.columnDispRslt_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.columnDispRslt_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_area_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_area_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispRslt_elm_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispRslt_elm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispRslt_elm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_000.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_001.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_002.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_003.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_004.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_005.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_006.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_007.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_008.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_009.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_010.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_011.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_012.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_013.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_014.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_015.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_016.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_017.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_018.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_019.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_020.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_021.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_022.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_023.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_024.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_025.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_026.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_027.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_028.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_029.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_030.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_031.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_032.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_033.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_034.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_035.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_036.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_037.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_038.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_039.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_040.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_041.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_042.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_043.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_044.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_045.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_046.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_047.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_048.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_049.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_050.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_051.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_052.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_053.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_054.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_055.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_056.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_057.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_058.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_059.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_060.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_061.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_062.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_063.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_064.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_065.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_066.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_067.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_068.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_069.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_070.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_071.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_072.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_073.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_074.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_075.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_076.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_077.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_078.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_079.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_080.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_081.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_082.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_083.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_084.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_085.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_086.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_087.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_088.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_089.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_090.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_091.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_092.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_093.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_094.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_095.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_096.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_097.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_098.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_099.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_100.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_101.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_102.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_103.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_104.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_105.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_106.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_107.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_108.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_109.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_110.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_111.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_112.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_113.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_114.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_115.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_116.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_117.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_118.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_119.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_120.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_121.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBFP_MlyStkWipCostSrch p){
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_mng_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_except_other_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_bp_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_end_stk_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_end_wip_flg.putMode(p, REF, MCMode.REQUIRED);
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
		p.Cnd_calc_grp_flg.putMode(p, REF, MCMode.REQUIRED);
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
		p.Cnd_asst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cntry_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_area_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_loc_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_str_ln_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_oper_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_qty_flg.putMode(p, REF, MCMode.REQUIRED);
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
		p.Cnd_bp_grp_flg1.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg2.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg3.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg4.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg5.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg6.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg7.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg8.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg9.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_grp_flg10.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_disp_key.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_disp_upri.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [REF]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ttl(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBFP_MlyStkWipCostSrch p){

	}

	/**
	 * [REF]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispRslt(MGBFP_MlyStkWipCostSrch p){
		p.columnDispRslt_calc_rec_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispRslt_calc_rec_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_calc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnDispRslt_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnDispRslt_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_area_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_area_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispRslt_elm_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispRslt_elm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispRslt_elm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_000.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_001.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_002.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_003.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_004.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_005.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_006.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_007.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_008.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_009.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_010.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_011.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_012.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_013.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_014.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_015.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_016.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_017.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_018.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_019.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_020.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_021.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_022.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_023.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_024.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_025.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_026.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_027.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_028.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_029.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_030.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_031.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_032.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_033.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_034.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_035.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_036.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_037.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_038.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_039.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_040.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_041.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_042.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_043.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_044.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_045.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_046.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_047.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_048.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_049.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_050.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_051.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_052.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_053.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_054.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_055.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_056.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_057.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_058.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_059.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_060.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_061.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_062.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_063.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_064.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_065.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_066.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_067.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_068.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_069.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_070.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_071.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_072.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_073.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_074.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_075.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_076.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_077.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_078.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_079.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_080.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_081.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_082.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_083.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_084.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_085.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_086.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_087.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_088.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_089.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_090.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_091.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_092.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_093.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_094.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_095.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_096.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_097.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_098.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_099.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_100.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_101.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_102.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_103.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_104.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_105.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_106.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_107.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_108.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_109.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_110.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_111.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_112.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_113.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_114.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_115.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_116.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_117.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_118.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_119.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_120.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_121.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBFP_MlyStkWipCostSrch p){

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
		MGBFP_MlyStkWipCostSrch_MC.setTableConfigDispRslt((MGBFP_MlyStkWipCostSrch)this);
	}

	/**
	 * [DispRslt]ブロックのTableの設定
	 */
	protected static void setTableConfigDispRslt(MGBFP_MlyStkWipCostSrch p) {
		p.columnDispRslt_calc_rec_typ.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.calc_rec_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_calc_rec_typ);
		p.columnDispRslt_calc_rec_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.calc_rec_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_calc_rec_typ_nm);
		p.columnDispRslt_calc_grp_cd.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.calc_grp_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_calc_grp_cd);
		p.columnDispRslt_calc_grp_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.calc_grp_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_calc_grp_nm);
		p.columnDispRslt_wg_cd.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.wg_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_cd);
		p.columnDispRslt_wg_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.wg_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_nm);
		p.columnDispRslt_mng_dpt_cd.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.mng_dpt_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_cd);
		p.columnDispRslt_mng_dpt_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.mng_dpt_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_nm);
		p.DispRsltTable.addTable(p.DispRslt_itm_p_PPanel.ItmTable);
		p.columnDispRslt_itm_typ.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ);
		p.columnDispRslt_itm_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_nm);
		p.columnDispRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_typ_d_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_cd);
		p.columnDispRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_typ_d_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_nm);
		p.columnDispRslt_itm_jnl_cd.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_jnl_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_jnl_cd);
		p.columnDispRslt_itm_jnl_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_jnl_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_jnl_nm);
		p.columnDispRslt_itm_grp_cd1.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_cd1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd1);
		p.columnDispRslt_itm_grp_nm1.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_nm1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm1);
		p.columnDispRslt_itm_grp_cd2.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_cd2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd2);
		p.columnDispRslt_itm_grp_nm2.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_nm2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm2);
		p.columnDispRslt_itm_grp_cd3.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_cd3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd3);
		p.columnDispRslt_itm_grp_nm3.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_nm3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm3);
		p.columnDispRslt_itm_grp_cd4.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_cd4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd4);
		p.columnDispRslt_itm_grp_nm4.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_nm4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm4);
		p.columnDispRslt_itm_grp_cd5.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_cd5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd5);
		p.columnDispRslt_itm_grp_nm5.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_nm5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm5);
		p.columnDispRslt_itm_grp_cd6.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_cd6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd6);
		p.columnDispRslt_itm_grp_nm6.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_nm6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm6);
		p.columnDispRslt_itm_grp_cd7.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_cd7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd7);
		p.columnDispRslt_itm_grp_nm7.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_nm7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm7);
		p.columnDispRslt_itm_grp_cd8.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_cd8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd8);
		p.columnDispRslt_itm_grp_nm8.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_nm8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm8);
		p.columnDispRslt_itm_grp_cd9.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_cd9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd9);
		p.columnDispRslt_itm_grp_nm9.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_nm9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm9);
		p.columnDispRslt_itm_grp_cd10.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_cd10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd10);
		p.columnDispRslt_itm_grp_nm10.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.itm_grp_nm10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm10);
		p.columnDispRslt_lot_no.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.lot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_lot_no);
		p.columnDispRslt_sublot_no.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.sublot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sublot_no);
		p.columnDispRslt_sno1.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.sno1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno1);
		p.columnDispRslt_sno2.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.sno2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno2);
		p.columnDispRslt_sno3.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.sno3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno3);
		p.columnDispRslt_sno4.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.sno4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno4);
		p.columnDispRslt_bp_cd.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_cd);
		p.columnDispRslt_bp_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_nm);
		p.columnDispRslt_bp_grp_cd1.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_cd1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd1);
		p.columnDispRslt_bp_grp_nm1.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_nm1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm1);
		p.columnDispRslt_bp_grp_cd2.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_cd2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd2);
		p.columnDispRslt_bp_grp_nm2.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_nm2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm2);
		p.columnDispRslt_bp_grp_cd3.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_cd3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd3);
		p.columnDispRslt_bp_grp_nm3.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_nm3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm3);
		p.columnDispRslt_bp_grp_cd4.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_cd4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd4);
		p.columnDispRslt_bp_grp_nm4.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_nm4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm4);
		p.columnDispRslt_bp_grp_cd5.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_cd5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd5);
		p.columnDispRslt_bp_grp_nm5.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_nm5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm5);
		p.columnDispRslt_bp_grp_cd6.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_cd6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd6);
		p.columnDispRslt_bp_grp_nm6.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_nm6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm6);
		p.columnDispRslt_bp_grp_cd7.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_cd7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd7);
		p.columnDispRslt_bp_grp_nm7.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_nm7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm7);
		p.columnDispRslt_bp_grp_cd8.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_cd8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd8);
		p.columnDispRslt_bp_grp_nm8.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_nm8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm8);
		p.columnDispRslt_bp_grp_cd9.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_cd9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd9);
		p.columnDispRslt_bp_grp_nm9.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_nm9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm9);
		p.columnDispRslt_bp_grp_cd10.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_cd10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd10);
		p.columnDispRslt_bp_grp_nm10.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.bp_grp_nm10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm10);
		p.columnDispRslt_cntry_cd.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.cntry_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cntry_cd);
		p.columnDispRslt_cntry_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.cntry_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cntry_nm);
		p.columnDispRslt_area_cd.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.area_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_area_cd);
		p.columnDispRslt_area_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.area_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_area_nm);
		p.columnDispRslt_loc_cd.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.loc_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_loc_cd);
		p.columnDispRslt_loc_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.loc_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_loc_nm);
		p.columnDispRslt_str_ln_cd.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.str_ln_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_str_ln_cd);
		p.columnDispRslt_str_ln_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.str_ln_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_str_ln_nm);
		p.columnDispRslt_oper_cd.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.oper_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_oper_cd);
		p.columnDispRslt_oper_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.oper_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_oper_nm);
		p.columnDispRslt_asst_typ.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.asst_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_asst_typ);
		p.columnDispRslt_asst_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.asst_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_asst_typ_nm);
		p.columnDispRslt_unit_cd.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.unit_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_unit_cd);
		p.columnDispRslt_unit_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.unit_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_unit_nm);
		p.columnDispRslt_dec_place.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.dec_place_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dec_place);
		p.columnDispRslt_elm_no.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.elm_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm_no);
		p.columnDispRslt_elm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.elm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm);
		p.columnDispRslt_elm_nm.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.elm_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm_nm);
		p.columnDispRslt_col_000.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_000_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_000);
		p.columnDispRslt_col_001.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_001_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_001);
		p.columnDispRslt_col_002.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_002_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_002);
		p.columnDispRslt_col_003.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_003_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_003);
		p.columnDispRslt_col_004.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_004_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_004);
		p.columnDispRslt_col_005.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_005_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_005);
		p.columnDispRslt_col_006.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_006_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_006);
		p.columnDispRslt_col_007.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_007_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_007);
		p.columnDispRslt_col_008.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_008_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_008);
		p.columnDispRslt_col_009.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_009_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_009);
		p.columnDispRslt_col_010.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_010_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_010);
		p.columnDispRslt_col_011.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_011_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_011);
		p.columnDispRslt_col_012.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_012_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_012);
		p.columnDispRslt_col_013.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_013_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_013);
		p.columnDispRslt_col_014.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_014_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_014);
		p.columnDispRslt_col_015.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_015_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_015);
		p.columnDispRslt_col_016.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_016_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_016);
		p.columnDispRslt_col_017.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_017_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_017);
		p.columnDispRslt_col_018.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_018_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_018);
		p.columnDispRslt_col_019.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_019_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_019);
		p.columnDispRslt_col_020.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_020_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_020);
		p.columnDispRslt_col_021.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_021_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_021);
		p.columnDispRslt_col_022.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_022_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_022);
		p.columnDispRslt_col_023.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_023_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_023);
		p.columnDispRslt_col_024.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_024_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_024);
		p.columnDispRslt_col_025.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_025_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_025);
		p.columnDispRslt_col_026.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_026_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_026);
		p.columnDispRslt_col_027.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_027_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_027);
		p.columnDispRslt_col_028.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_028_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_028);
		p.columnDispRslt_col_029.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_029_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_029);
		p.columnDispRslt_col_030.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_030_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_030);
		p.columnDispRslt_col_031.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_031_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_031);
		p.columnDispRslt_col_032.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_032_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_032);
		p.columnDispRslt_col_033.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_033_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_033);
		p.columnDispRslt_col_034.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_034_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_034);
		p.columnDispRslt_col_035.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_035_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_035);
		p.columnDispRslt_col_036.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_036_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_036);
		p.columnDispRslt_col_037.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_037_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_037);
		p.columnDispRslt_col_038.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_038_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_038);
		p.columnDispRslt_col_039.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_039_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_039);
		p.columnDispRslt_col_040.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_040_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_040);
		p.columnDispRslt_col_041.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_041_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_041);
		p.columnDispRslt_col_042.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_042_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_042);
		p.columnDispRslt_col_043.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_043_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_043);
		p.columnDispRslt_col_044.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_044_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_044);
		p.columnDispRslt_col_045.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_045_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_045);
		p.columnDispRslt_col_046.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_046_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_046);
		p.columnDispRslt_col_047.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_047_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_047);
		p.columnDispRslt_col_048.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_048_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_048);
		p.columnDispRslt_col_049.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_049_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_049);
		p.columnDispRslt_col_050.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_050_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_050);
		p.columnDispRslt_col_051.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_051_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_051);
		p.columnDispRslt_col_052.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_052_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_052);
		p.columnDispRslt_col_053.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_053_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_053);
		p.columnDispRslt_col_054.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_054_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_054);
		p.columnDispRslt_col_055.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_055_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_055);
		p.columnDispRslt_col_056.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_056_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_056);
		p.columnDispRslt_col_057.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_057_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_057);
		p.columnDispRslt_col_058.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_058_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_058);
		p.columnDispRslt_col_059.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_059_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_059);
		p.columnDispRslt_col_060.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_060_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_060);
		p.columnDispRslt_col_061.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_061_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_061);
		p.columnDispRslt_col_062.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_062_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_062);
		p.columnDispRslt_col_063.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_063_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_063);
		p.columnDispRslt_col_064.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_064_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_064);
		p.columnDispRslt_col_065.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_065_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_065);
		p.columnDispRslt_col_066.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_066_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_066);
		p.columnDispRslt_col_067.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_067_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_067);
		p.columnDispRslt_col_068.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_068_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_068);
		p.columnDispRslt_col_069.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_069_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_069);
		p.columnDispRslt_col_070.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_070_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_070);
		p.columnDispRslt_col_071.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_071_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_071);
		p.columnDispRslt_col_072.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_072_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_072);
		p.columnDispRslt_col_073.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_073_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_073);
		p.columnDispRslt_col_074.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_074_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_074);
		p.columnDispRslt_col_075.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_075_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_075);
		p.columnDispRslt_col_076.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_076_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_076);
		p.columnDispRslt_col_077.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_077_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_077);
		p.columnDispRslt_col_078.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_078_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_078);
		p.columnDispRslt_col_079.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_079_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_079);
		p.columnDispRslt_col_080.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_080_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_080);
		p.columnDispRslt_col_081.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_081_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_081);
		p.columnDispRslt_col_082.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_082_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_082);
		p.columnDispRslt_col_083.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_083_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_083);
		p.columnDispRslt_col_084.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_084_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_084);
		p.columnDispRslt_col_085.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_085_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_085);
		p.columnDispRslt_col_086.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_086_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_086);
		p.columnDispRslt_col_087.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_087_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_087);
		p.columnDispRslt_col_088.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_088_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_088);
		p.columnDispRslt_col_089.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_089_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_089);
		p.columnDispRslt_col_090.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_090_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_090);
		p.columnDispRslt_col_091.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_091_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_091);
		p.columnDispRslt_col_092.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_092_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_092);
		p.columnDispRslt_col_093.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_093_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_093);
		p.columnDispRslt_col_094.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_094_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_094);
		p.columnDispRslt_col_095.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_095_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_095);
		p.columnDispRslt_col_096.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_096_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_096);
		p.columnDispRslt_col_097.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_097_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_097);
		p.columnDispRslt_col_098.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_098_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_098);
		p.columnDispRslt_col_099.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_099_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_099);
		p.columnDispRslt_col_100.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_100_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_100);
		p.columnDispRslt_col_101.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_101_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_101);
		p.columnDispRslt_col_102.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_102_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_102);
		p.columnDispRslt_col_103.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_103_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_103);
		p.columnDispRslt_col_104.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_104_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_104);
		p.columnDispRslt_col_105.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_105_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_105);
		p.columnDispRslt_col_106.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_106_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_106);
		p.columnDispRslt_col_107.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_107_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_107);
		p.columnDispRslt_col_108.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_108_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_108);
		p.columnDispRslt_col_109.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_109_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_109);
		p.columnDispRslt_col_110.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_110_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_110);
		p.columnDispRslt_col_111.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_111_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_111);
		p.columnDispRslt_col_112.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_112_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_112);
		p.columnDispRslt_col_113.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_113_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_113);
		p.columnDispRslt_col_114.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_114_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_114);
		p.columnDispRslt_col_115.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_115_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_115);
		p.columnDispRslt_col_116.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_116_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_116);
		p.columnDispRslt_col_117.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_117_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_117);
		p.columnDispRslt_col_118.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_118_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_118);
		p.columnDispRslt_col_119.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_119_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_119);
		p.columnDispRslt_col_120.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_120_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_120);
		p.columnDispRslt_col_121.setMeta(mcframe.clientMGBF.MGBFP0440.DispRsltR.col_121_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_121);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd.getListConfig().setPutter(getCnd_calc_grp_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_jnl_cd.getListConfig().setPutter(getCnd_itm_jnl_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_mng_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mng_dpt_cd.getListConfig().setPutter(getCnd_mng_dpt_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
		Cnd_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_cd.getListConfig().setPutter(getCnd_oper_cd_ListPutter());
		Cnd_asst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_asst_typ.getListConfig().setPutter(getCnd_asst_typ_ListPutter());
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
		Cnd_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cntry_cd.getListConfig().setPutter(getCnd_cntry_cd_ListPutter());
		Cnd_area_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_area_cd.getListConfig().setPutter(getCnd_area_cd_ListPutter());
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
	 * [Cnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCalcGrp");
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
	 * [Cnd_mng_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mng_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_asst_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_asst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AsstTyp");
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
	 * [Cnd_cntry_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cntry_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
		return lp;
	}
	 
	/**
	 * [Cnd_area_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_area_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_itm_jnl_cd) return getCnd_itm_jnl_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_mng_dpt_cd) return getCnd_mng_dpt_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_oper_cd) return getCnd_oper_cd(row, info);
		if(combo == Cnd_asst_typ) return getCnd_asst_typ(row, info);
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		if(combo == Cnd_cntry_cd) return getCnd_cntry_cd(row, info);
		if(combo == Cnd_area_cd) return getCnd_area_cd(row, info);
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
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_ym_fr) return doCnd_ym_fr_VC(info);
		if (vc == Cnd_ym_to) return doCnd_ym_to_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_itm_jnl_cd) return doCnd_itm_jnl_cd_VC(info);
		if (vc == Cnd_itm_jnl_nm) return doCnd_itm_jnl_nm_VC(info);
		if (vc == Cnd_mng_dpt_cd) return doCnd_mng_dpt_cd_VC(info);
		if (vc == Cnd_mng_dpt_nm) return doCnd_mng_dpt_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_sno1) return doCnd_sno1_VC(info);
		if (vc == Cnd_sno2) return doCnd_sno2_VC(info);
		if (vc == Cnd_sno3) return doCnd_sno3_VC(info);
		if (vc == Cnd_sno4) return doCnd_sno4_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_oper_cd) return doCnd_oper_cd_VC(info);
		if (vc == Cnd_oper_nm) return doCnd_oper_nm_VC(info);
		if (vc == Cnd_asst_typ) return doCnd_asst_typ_VC(info);
		if (vc == Cnd_asst_typ_nm) return doCnd_asst_typ_nm_VC(info);
		if (vc == Cnd_except_other_flg) return doCnd_except_other_flg_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_no_bp_flg) return doCnd_no_bp_flg_VC(info);
		if (vc == Cnd_cntry_cd) return doCnd_cntry_cd_VC(info);
		if (vc == Cnd_cntry_nm) return doCnd_cntry_nm_VC(info);
		if (vc == Cnd_area_cd) return doCnd_area_cd_VC(info);
		if (vc == Cnd_area_nm) return doCnd_area_nm_VC(info);
		if (vc == Cnd_end_stk_flg) return doCnd_end_stk_flg_VC(info);
		if (vc == Cnd_end_wip_flg) return doCnd_end_wip_flg_VC(info);
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
		if (vc == Cnd_calc_grp_flg) return doCnd_calc_grp_flg_VC(info);
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
		if (vc == Cnd_asst_flg) return doCnd_asst_flg_VC(info);
		if (vc == Cnd_bp_flg) return doCnd_bp_flg_VC(info);
		if (vc == Cnd_cntry_flg) return doCnd_cntry_flg_VC(info);
		if (vc == Cnd_area_flg) return doCnd_area_flg_VC(info);
		if (vc == Cnd_loc_flg) return doCnd_loc_flg_VC(info);
		if (vc == Cnd_str_ln_flg) return doCnd_str_ln_flg_VC(info);
		if (vc == Cnd_oper_flg) return doCnd_oper_flg_VC(info);
		if (vc == Cnd_qty_flg) return doCnd_qty_flg_VC(info);
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
		if (vc == Cnd_disp_upri) return doCnd_disp_upri_VC(info);
		if (vc == columnDispRslt_calc_rec_typ) return doDispRslt_calc_rec_typ_VC(info);
		if (vc == columnDispRslt_calc_rec_typ_nm) return doDispRslt_calc_rec_typ_nm_VC(info);
		if (vc == columnDispRslt_calc_grp_cd) return doDispRslt_calc_grp_cd_VC(info);
		if (vc == columnDispRslt_calc_grp_nm) return doDispRslt_calc_grp_nm_VC(info);
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
		if (vc == columnDispRslt_bp_cd) return doDispRslt_bp_cd_VC(info);
		if (vc == columnDispRslt_bp_nm) return doDispRslt_bp_nm_VC(info);
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
		if (vc == columnDispRslt_cntry_cd) return doDispRslt_cntry_cd_VC(info);
		if (vc == columnDispRslt_cntry_nm) return doDispRslt_cntry_nm_VC(info);
		if (vc == columnDispRslt_area_cd) return doDispRslt_area_cd_VC(info);
		if (vc == columnDispRslt_area_nm) return doDispRslt_area_nm_VC(info);
		if (vc == columnDispRslt_loc_cd) return doDispRslt_loc_cd_VC(info);
		if (vc == columnDispRslt_loc_nm) return doDispRslt_loc_nm_VC(info);
		if (vc == columnDispRslt_str_ln_cd) return doDispRslt_str_ln_cd_VC(info);
		if (vc == columnDispRslt_str_ln_nm) return doDispRslt_str_ln_nm_VC(info);
		if (vc == columnDispRslt_oper_cd) return doDispRslt_oper_cd_VC(info);
		if (vc == columnDispRslt_oper_nm) return doDispRslt_oper_nm_VC(info);
		if (vc == columnDispRslt_asst_typ) return doDispRslt_asst_typ_VC(info);
		if (vc == columnDispRslt_asst_typ_nm) return doDispRslt_asst_typ_nm_VC(info);
		if (vc == columnDispRslt_unit_cd) return doDispRslt_unit_cd_VC(info);
		if (vc == columnDispRslt_unit_nm) return doDispRslt_unit_nm_VC(info);
		if (vc == columnDispRslt_dec_place) return doDispRslt_dec_place_VC(info);
		if (vc == columnDispRslt_elm_no) return doDispRslt_elm_no_VC(info);
		if (vc == columnDispRslt_elm) return doDispRslt_elm_VC(info);
		if (vc == columnDispRslt_elm_nm) return doDispRslt_elm_nm_VC(info);
		if (vc == columnDispRslt_col_000) return doDispRslt_col_000_VC(info);
		if (vc == columnDispRslt_col_001) return doDispRslt_col_001_VC(info);
		if (vc == columnDispRslt_col_002) return doDispRslt_col_002_VC(info);
		if (vc == columnDispRslt_col_003) return doDispRslt_col_003_VC(info);
		if (vc == columnDispRslt_col_004) return doDispRslt_col_004_VC(info);
		if (vc == columnDispRslt_col_005) return doDispRslt_col_005_VC(info);
		if (vc == columnDispRslt_col_006) return doDispRslt_col_006_VC(info);
		if (vc == columnDispRslt_col_007) return doDispRslt_col_007_VC(info);
		if (vc == columnDispRslt_col_008) return doDispRslt_col_008_VC(info);
		if (vc == columnDispRslt_col_009) return doDispRslt_col_009_VC(info);
		if (vc == columnDispRslt_col_010) return doDispRslt_col_010_VC(info);
		if (vc == columnDispRslt_col_011) return doDispRslt_col_011_VC(info);
		if (vc == columnDispRslt_col_012) return doDispRslt_col_012_VC(info);
		if (vc == columnDispRslt_col_013) return doDispRslt_col_013_VC(info);
		if (vc == columnDispRslt_col_014) return doDispRslt_col_014_VC(info);
		if (vc == columnDispRslt_col_015) return doDispRslt_col_015_VC(info);
		if (vc == columnDispRslt_col_016) return doDispRslt_col_016_VC(info);
		if (vc == columnDispRslt_col_017) return doDispRslt_col_017_VC(info);
		if (vc == columnDispRslt_col_018) return doDispRslt_col_018_VC(info);
		if (vc == columnDispRslt_col_019) return doDispRslt_col_019_VC(info);
		if (vc == columnDispRslt_col_020) return doDispRslt_col_020_VC(info);
		if (vc == columnDispRslt_col_021) return doDispRslt_col_021_VC(info);
		if (vc == columnDispRslt_col_022) return doDispRslt_col_022_VC(info);
		if (vc == columnDispRslt_col_023) return doDispRslt_col_023_VC(info);
		if (vc == columnDispRslt_col_024) return doDispRslt_col_024_VC(info);
		if (vc == columnDispRslt_col_025) return doDispRslt_col_025_VC(info);
		if (vc == columnDispRslt_col_026) return doDispRslt_col_026_VC(info);
		if (vc == columnDispRslt_col_027) return doDispRslt_col_027_VC(info);
		if (vc == columnDispRslt_col_028) return doDispRslt_col_028_VC(info);
		if (vc == columnDispRslt_col_029) return doDispRslt_col_029_VC(info);
		if (vc == columnDispRslt_col_030) return doDispRslt_col_030_VC(info);
		if (vc == columnDispRslt_col_031) return doDispRslt_col_031_VC(info);
		if (vc == columnDispRslt_col_032) return doDispRslt_col_032_VC(info);
		if (vc == columnDispRslt_col_033) return doDispRslt_col_033_VC(info);
		if (vc == columnDispRslt_col_034) return doDispRslt_col_034_VC(info);
		if (vc == columnDispRslt_col_035) return doDispRslt_col_035_VC(info);
		if (vc == columnDispRslt_col_036) return doDispRslt_col_036_VC(info);
		if (vc == columnDispRslt_col_037) return doDispRslt_col_037_VC(info);
		if (vc == columnDispRslt_col_038) return doDispRslt_col_038_VC(info);
		if (vc == columnDispRslt_col_039) return doDispRslt_col_039_VC(info);
		if (vc == columnDispRslt_col_040) return doDispRslt_col_040_VC(info);
		if (vc == columnDispRslt_col_041) return doDispRslt_col_041_VC(info);
		if (vc == columnDispRslt_col_042) return doDispRslt_col_042_VC(info);
		if (vc == columnDispRslt_col_043) return doDispRslt_col_043_VC(info);
		if (vc == columnDispRslt_col_044) return doDispRslt_col_044_VC(info);
		if (vc == columnDispRslt_col_045) return doDispRslt_col_045_VC(info);
		if (vc == columnDispRslt_col_046) return doDispRslt_col_046_VC(info);
		if (vc == columnDispRslt_col_047) return doDispRslt_col_047_VC(info);
		if (vc == columnDispRslt_col_048) return doDispRslt_col_048_VC(info);
		if (vc == columnDispRslt_col_049) return doDispRslt_col_049_VC(info);
		if (vc == columnDispRslt_col_050) return doDispRslt_col_050_VC(info);
		if (vc == columnDispRslt_col_051) return doDispRslt_col_051_VC(info);
		if (vc == columnDispRslt_col_052) return doDispRslt_col_052_VC(info);
		if (vc == columnDispRslt_col_053) return doDispRslt_col_053_VC(info);
		if (vc == columnDispRslt_col_054) return doDispRslt_col_054_VC(info);
		if (vc == columnDispRslt_col_055) return doDispRslt_col_055_VC(info);
		if (vc == columnDispRslt_col_056) return doDispRslt_col_056_VC(info);
		if (vc == columnDispRslt_col_057) return doDispRslt_col_057_VC(info);
		if (vc == columnDispRslt_col_058) return doDispRslt_col_058_VC(info);
		if (vc == columnDispRslt_col_059) return doDispRslt_col_059_VC(info);
		if (vc == columnDispRslt_col_060) return doDispRslt_col_060_VC(info);
		if (vc == columnDispRslt_col_061) return doDispRslt_col_061_VC(info);
		if (vc == columnDispRslt_col_062) return doDispRslt_col_062_VC(info);
		if (vc == columnDispRslt_col_063) return doDispRslt_col_063_VC(info);
		if (vc == columnDispRslt_col_064) return doDispRslt_col_064_VC(info);
		if (vc == columnDispRslt_col_065) return doDispRslt_col_065_VC(info);
		if (vc == columnDispRslt_col_066) return doDispRslt_col_066_VC(info);
		if (vc == columnDispRslt_col_067) return doDispRslt_col_067_VC(info);
		if (vc == columnDispRslt_col_068) return doDispRslt_col_068_VC(info);
		if (vc == columnDispRslt_col_069) return doDispRslt_col_069_VC(info);
		if (vc == columnDispRslt_col_070) return doDispRslt_col_070_VC(info);
		if (vc == columnDispRslt_col_071) return doDispRslt_col_071_VC(info);
		if (vc == columnDispRslt_col_072) return doDispRslt_col_072_VC(info);
		if (vc == columnDispRslt_col_073) return doDispRslt_col_073_VC(info);
		if (vc == columnDispRslt_col_074) return doDispRslt_col_074_VC(info);
		if (vc == columnDispRslt_col_075) return doDispRslt_col_075_VC(info);
		if (vc == columnDispRslt_col_076) return doDispRslt_col_076_VC(info);
		if (vc == columnDispRslt_col_077) return doDispRslt_col_077_VC(info);
		if (vc == columnDispRslt_col_078) return doDispRslt_col_078_VC(info);
		if (vc == columnDispRslt_col_079) return doDispRslt_col_079_VC(info);
		if (vc == columnDispRslt_col_080) return doDispRslt_col_080_VC(info);
		if (vc == columnDispRslt_col_081) return doDispRslt_col_081_VC(info);
		if (vc == columnDispRslt_col_082) return doDispRslt_col_082_VC(info);
		if (vc == columnDispRslt_col_083) return doDispRslt_col_083_VC(info);
		if (vc == columnDispRslt_col_084) return doDispRslt_col_084_VC(info);
		if (vc == columnDispRslt_col_085) return doDispRslt_col_085_VC(info);
		if (vc == columnDispRslt_col_086) return doDispRslt_col_086_VC(info);
		if (vc == columnDispRslt_col_087) return doDispRslt_col_087_VC(info);
		if (vc == columnDispRslt_col_088) return doDispRslt_col_088_VC(info);
		if (vc == columnDispRslt_col_089) return doDispRslt_col_089_VC(info);
		if (vc == columnDispRslt_col_090) return doDispRslt_col_090_VC(info);
		if (vc == columnDispRslt_col_091) return doDispRslt_col_091_VC(info);
		if (vc == columnDispRslt_col_092) return doDispRslt_col_092_VC(info);
		if (vc == columnDispRslt_col_093) return doDispRslt_col_093_VC(info);
		if (vc == columnDispRslt_col_094) return doDispRslt_col_094_VC(info);
		if (vc == columnDispRslt_col_095) return doDispRslt_col_095_VC(info);
		if (vc == columnDispRslt_col_096) return doDispRslt_col_096_VC(info);
		if (vc == columnDispRslt_col_097) return doDispRslt_col_097_VC(info);
		if (vc == columnDispRslt_col_098) return doDispRslt_col_098_VC(info);
		if (vc == columnDispRslt_col_099) return doDispRslt_col_099_VC(info);
		if (vc == columnDispRslt_col_100) return doDispRslt_col_100_VC(info);
		if (vc == columnDispRslt_col_101) return doDispRslt_col_101_VC(info);
		if (vc == columnDispRslt_col_102) return doDispRslt_col_102_VC(info);
		if (vc == columnDispRslt_col_103) return doDispRslt_col_103_VC(info);
		if (vc == columnDispRslt_col_104) return doDispRslt_col_104_VC(info);
		if (vc == columnDispRslt_col_105) return doDispRslt_col_105_VC(info);
		if (vc == columnDispRslt_col_106) return doDispRslt_col_106_VC(info);
		if (vc == columnDispRslt_col_107) return doDispRslt_col_107_VC(info);
		if (vc == columnDispRslt_col_108) return doDispRslt_col_108_VC(info);
		if (vc == columnDispRslt_col_109) return doDispRslt_col_109_VC(info);
		if (vc == columnDispRslt_col_110) return doDispRslt_col_110_VC(info);
		if (vc == columnDispRslt_col_111) return doDispRslt_col_111_VC(info);
		if (vc == columnDispRslt_col_112) return doDispRslt_col_112_VC(info);
		if (vc == columnDispRslt_col_113) return doDispRslt_col_113_VC(info);
		if (vc == columnDispRslt_col_114) return doDispRslt_col_114_VC(info);
		if (vc == columnDispRslt_col_115) return doDispRslt_col_115_VC(info);
		if (vc == columnDispRslt_col_116) return doDispRslt_col_116_VC(info);
		if (vc == columnDispRslt_col_117) return doDispRslt_col_117_VC(info);
		if (vc == columnDispRslt_col_118) return doDispRslt_col_118_VC(info);
		if (vc == columnDispRslt_col_119) return doDispRslt_col_119_VC(info);
		if (vc == columnDispRslt_col_120) return doDispRslt_col_120_VC(info);
		if (vc == columnDispRslt_col_121) return doDispRslt_col_121_VC(info);
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
	 * [Cnd]パネルの[ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[except_other_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_except_other_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[no_bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_bp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[end_stk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_end_stk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[end_wip_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_end_wip_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asst_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cntry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cntry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[area_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_area_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qty_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qty_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[calc_rec_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_calc_rec_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[calc_rec_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_calc_rec_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_calc_grp_nm_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_area_nm_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_000]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_000_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_001]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_001_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_002]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_002_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_003]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_003_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_004]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_004_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_005]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_005_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_006]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_006_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_007]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_007_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_008]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_008_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_009]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_009_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_010]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_010_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_011]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_011_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_012]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_012_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_013]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_013_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_014]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_014_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_015]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_015_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_016]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_016_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_017]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_017_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_018]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_018_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_019]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_019_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_020]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_020_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_021]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_021_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_022]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_022_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_023]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_023_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_024]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_024_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_025]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_025_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_026]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_026_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_027]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_027_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_028]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_028_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_029]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_029_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_030]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_030_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_031]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_031_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_032]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_032_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_033]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_033_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_034]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_034_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_035]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_035_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_036]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_036_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_037]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_037_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_038]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_038_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_039]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_039_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_040]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_040_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_041]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_041_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_042]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_042_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_043]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_043_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_044]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_044_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_045]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_045_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_046]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_046_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_047]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_047_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_048]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_048_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_049]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_049_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_050]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_050_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_051]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_051_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_052]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_052_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_053]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_053_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_054]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_054_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_055]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_055_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_056]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_056_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_057]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_057_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_058]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_058_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_059]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_059_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_060]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_060_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_061]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_061_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_062]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_062_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_063]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_063_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_064]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_064_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_065]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_065_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_066]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_066_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_067]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_067_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_068]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_068_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_069]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_069_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_070]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_070_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_071]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_071_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_072]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_072_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_073]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_073_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_074]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_074_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_075]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_075_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_076]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_076_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_077]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_077_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_078]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_078_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_079]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_079_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_080]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_080_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_081]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_081_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_082]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_082_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_083]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_083_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_084]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_084_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_085]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_085_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_086]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_086_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_087]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_087_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_088]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_088_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_089]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_089_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_090]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_090_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_091]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_091_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_092]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_092_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_093]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_093_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_094]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_094_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_095]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_095_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_096]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_096_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_097]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_097_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_098]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_098_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_099]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_099_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_100]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_100_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_101]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_101_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_102]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_102_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_103]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_103_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_104]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_104_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_105]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_105_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_106]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_106_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_107]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_107_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_108]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_108_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_109]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_109_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_110]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_110_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_111]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_111_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_112]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_112_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_113]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_113_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_114]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_114_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_115]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_115_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_116]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_116_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_117]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_117_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_118]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_118_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_119]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_119_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_120]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_120_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_121]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_121_VC(MCEventInfo info){
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
		else if (nc == Cnd_ym_fr) doCnd_ym_fr_NC(info);
		else if (nc == Cnd_ym_to) doCnd_ym_to_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NC(info);
		else if (nc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NC(info);
		else if (nc == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NC(info);
		else if (nc == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_sno1) doCnd_sno1_NC(info);
		else if (nc == Cnd_sno2) doCnd_sno2_NC(info);
		else if (nc == Cnd_sno3) doCnd_sno3_NC(info);
		else if (nc == Cnd_sno4) doCnd_sno4_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_oper_cd) doCnd_oper_cd_NC(info);
		else if (nc == Cnd_oper_nm) doCnd_oper_nm_NC(info);
		else if (nc == Cnd_asst_typ) doCnd_asst_typ_NC(info);
		else if (nc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NC(info);
		else if (nc == Cnd_except_other_flg) doCnd_except_other_flg_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_no_bp_flg) doCnd_no_bp_flg_NC(info);
		else if (nc == Cnd_cntry_cd) doCnd_cntry_cd_NC(info);
		else if (nc == Cnd_cntry_nm) doCnd_cntry_nm_NC(info);
		else if (nc == Cnd_area_cd) doCnd_area_cd_NC(info);
		else if (nc == Cnd_area_nm) doCnd_area_nm_NC(info);
		else if (nc == Cnd_end_stk_flg) doCnd_end_stk_flg_NC(info);
		else if (nc == Cnd_end_wip_flg) doCnd_end_wip_flg_NC(info);
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
		else if (nc == Cnd_calc_grp_flg) doCnd_calc_grp_flg_NC(info);
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
		else if (nc == Cnd_asst_flg) doCnd_asst_flg_NC(info);
		else if (nc == Cnd_bp_flg) doCnd_bp_flg_NC(info);
		else if (nc == Cnd_cntry_flg) doCnd_cntry_flg_NC(info);
		else if (nc == Cnd_area_flg) doCnd_area_flg_NC(info);
		else if (nc == Cnd_loc_flg) doCnd_loc_flg_NC(info);
		else if (nc == Cnd_str_ln_flg) doCnd_str_ln_flg_NC(info);
		else if (nc == Cnd_oper_flg) doCnd_oper_flg_NC(info);
		else if (nc == Cnd_qty_flg) doCnd_qty_flg_NC(info);
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
		else if (nc == Cnd_disp_upri) doCnd_disp_upri_NC(info);
		else if (nc == columnDispRslt_calc_rec_typ) doDispRslt_calc_rec_typ_NC(info);
		else if (nc == columnDispRslt_calc_rec_typ_nm) doDispRslt_calc_rec_typ_nm_NC(info);
		else if (nc == columnDispRslt_calc_grp_cd) doDispRslt_calc_grp_cd_NC(info);
		else if (nc == columnDispRslt_calc_grp_nm) doDispRslt_calc_grp_nm_NC(info);
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
		else if (nc == columnDispRslt_bp_cd) doDispRslt_bp_cd_NC(info);
		else if (nc == columnDispRslt_bp_nm) doDispRslt_bp_nm_NC(info);
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
		else if (nc == columnDispRslt_cntry_cd) doDispRslt_cntry_cd_NC(info);
		else if (nc == columnDispRslt_cntry_nm) doDispRslt_cntry_nm_NC(info);
		else if (nc == columnDispRslt_area_cd) doDispRslt_area_cd_NC(info);
		else if (nc == columnDispRslt_area_nm) doDispRslt_area_nm_NC(info);
		else if (nc == columnDispRslt_loc_cd) doDispRslt_loc_cd_NC(info);
		else if (nc == columnDispRslt_loc_nm) doDispRslt_loc_nm_NC(info);
		else if (nc == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_NC(info);
		else if (nc == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_NC(info);
		else if (nc == columnDispRslt_oper_cd) doDispRslt_oper_cd_NC(info);
		else if (nc == columnDispRslt_oper_nm) doDispRslt_oper_nm_NC(info);
		else if (nc == columnDispRslt_asst_typ) doDispRslt_asst_typ_NC(info);
		else if (nc == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NC(info);
		else if (nc == columnDispRslt_unit_cd) doDispRslt_unit_cd_NC(info);
		else if (nc == columnDispRslt_unit_nm) doDispRslt_unit_nm_NC(info);
		else if (nc == columnDispRslt_dec_place) doDispRslt_dec_place_NC(info);
		else if (nc == columnDispRslt_elm_no) doDispRslt_elm_no_NC(info);
		else if (nc == columnDispRslt_elm) doDispRslt_elm_NC(info);
		else if (nc == columnDispRslt_elm_nm) doDispRslt_elm_nm_NC(info);
		else if (nc == columnDispRslt_col_000) doDispRslt_col_000_NC(info);
		else if (nc == columnDispRslt_col_001) doDispRslt_col_001_NC(info);
		else if (nc == columnDispRslt_col_002) doDispRslt_col_002_NC(info);
		else if (nc == columnDispRslt_col_003) doDispRslt_col_003_NC(info);
		else if (nc == columnDispRslt_col_004) doDispRslt_col_004_NC(info);
		else if (nc == columnDispRslt_col_005) doDispRslt_col_005_NC(info);
		else if (nc == columnDispRslt_col_006) doDispRslt_col_006_NC(info);
		else if (nc == columnDispRslt_col_007) doDispRslt_col_007_NC(info);
		else if (nc == columnDispRslt_col_008) doDispRslt_col_008_NC(info);
		else if (nc == columnDispRslt_col_009) doDispRslt_col_009_NC(info);
		else if (nc == columnDispRslt_col_010) doDispRslt_col_010_NC(info);
		else if (nc == columnDispRslt_col_011) doDispRslt_col_011_NC(info);
		else if (nc == columnDispRslt_col_012) doDispRslt_col_012_NC(info);
		else if (nc == columnDispRslt_col_013) doDispRslt_col_013_NC(info);
		else if (nc == columnDispRslt_col_014) doDispRslt_col_014_NC(info);
		else if (nc == columnDispRslt_col_015) doDispRslt_col_015_NC(info);
		else if (nc == columnDispRslt_col_016) doDispRslt_col_016_NC(info);
		else if (nc == columnDispRslt_col_017) doDispRslt_col_017_NC(info);
		else if (nc == columnDispRslt_col_018) doDispRslt_col_018_NC(info);
		else if (nc == columnDispRslt_col_019) doDispRslt_col_019_NC(info);
		else if (nc == columnDispRslt_col_020) doDispRslt_col_020_NC(info);
		else if (nc == columnDispRslt_col_021) doDispRslt_col_021_NC(info);
		else if (nc == columnDispRslt_col_022) doDispRslt_col_022_NC(info);
		else if (nc == columnDispRslt_col_023) doDispRslt_col_023_NC(info);
		else if (nc == columnDispRslt_col_024) doDispRslt_col_024_NC(info);
		else if (nc == columnDispRslt_col_025) doDispRslt_col_025_NC(info);
		else if (nc == columnDispRslt_col_026) doDispRslt_col_026_NC(info);
		else if (nc == columnDispRslt_col_027) doDispRslt_col_027_NC(info);
		else if (nc == columnDispRslt_col_028) doDispRslt_col_028_NC(info);
		else if (nc == columnDispRslt_col_029) doDispRslt_col_029_NC(info);
		else if (nc == columnDispRslt_col_030) doDispRslt_col_030_NC(info);
		else if (nc == columnDispRslt_col_031) doDispRslt_col_031_NC(info);
		else if (nc == columnDispRslt_col_032) doDispRslt_col_032_NC(info);
		else if (nc == columnDispRslt_col_033) doDispRslt_col_033_NC(info);
		else if (nc == columnDispRslt_col_034) doDispRslt_col_034_NC(info);
		else if (nc == columnDispRslt_col_035) doDispRslt_col_035_NC(info);
		else if (nc == columnDispRslt_col_036) doDispRslt_col_036_NC(info);
		else if (nc == columnDispRslt_col_037) doDispRslt_col_037_NC(info);
		else if (nc == columnDispRslt_col_038) doDispRslt_col_038_NC(info);
		else if (nc == columnDispRslt_col_039) doDispRslt_col_039_NC(info);
		else if (nc == columnDispRslt_col_040) doDispRslt_col_040_NC(info);
		else if (nc == columnDispRslt_col_041) doDispRslt_col_041_NC(info);
		else if (nc == columnDispRslt_col_042) doDispRslt_col_042_NC(info);
		else if (nc == columnDispRslt_col_043) doDispRslt_col_043_NC(info);
		else if (nc == columnDispRslt_col_044) doDispRslt_col_044_NC(info);
		else if (nc == columnDispRslt_col_045) doDispRslt_col_045_NC(info);
		else if (nc == columnDispRslt_col_046) doDispRslt_col_046_NC(info);
		else if (nc == columnDispRslt_col_047) doDispRslt_col_047_NC(info);
		else if (nc == columnDispRslt_col_048) doDispRslt_col_048_NC(info);
		else if (nc == columnDispRslt_col_049) doDispRslt_col_049_NC(info);
		else if (nc == columnDispRslt_col_050) doDispRslt_col_050_NC(info);
		else if (nc == columnDispRslt_col_051) doDispRslt_col_051_NC(info);
		else if (nc == columnDispRslt_col_052) doDispRslt_col_052_NC(info);
		else if (nc == columnDispRslt_col_053) doDispRslt_col_053_NC(info);
		else if (nc == columnDispRslt_col_054) doDispRslt_col_054_NC(info);
		else if (nc == columnDispRslt_col_055) doDispRslt_col_055_NC(info);
		else if (nc == columnDispRslt_col_056) doDispRslt_col_056_NC(info);
		else if (nc == columnDispRslt_col_057) doDispRslt_col_057_NC(info);
		else if (nc == columnDispRslt_col_058) doDispRslt_col_058_NC(info);
		else if (nc == columnDispRslt_col_059) doDispRslt_col_059_NC(info);
		else if (nc == columnDispRslt_col_060) doDispRslt_col_060_NC(info);
		else if (nc == columnDispRslt_col_061) doDispRslt_col_061_NC(info);
		else if (nc == columnDispRslt_col_062) doDispRslt_col_062_NC(info);
		else if (nc == columnDispRslt_col_063) doDispRslt_col_063_NC(info);
		else if (nc == columnDispRslt_col_064) doDispRslt_col_064_NC(info);
		else if (nc == columnDispRslt_col_065) doDispRslt_col_065_NC(info);
		else if (nc == columnDispRslt_col_066) doDispRslt_col_066_NC(info);
		else if (nc == columnDispRslt_col_067) doDispRslt_col_067_NC(info);
		else if (nc == columnDispRslt_col_068) doDispRslt_col_068_NC(info);
		else if (nc == columnDispRslt_col_069) doDispRslt_col_069_NC(info);
		else if (nc == columnDispRslt_col_070) doDispRslt_col_070_NC(info);
		else if (nc == columnDispRslt_col_071) doDispRslt_col_071_NC(info);
		else if (nc == columnDispRslt_col_072) doDispRslt_col_072_NC(info);
		else if (nc == columnDispRslt_col_073) doDispRslt_col_073_NC(info);
		else if (nc == columnDispRslt_col_074) doDispRslt_col_074_NC(info);
		else if (nc == columnDispRslt_col_075) doDispRslt_col_075_NC(info);
		else if (nc == columnDispRslt_col_076) doDispRslt_col_076_NC(info);
		else if (nc == columnDispRslt_col_077) doDispRslt_col_077_NC(info);
		else if (nc == columnDispRslt_col_078) doDispRslt_col_078_NC(info);
		else if (nc == columnDispRslt_col_079) doDispRslt_col_079_NC(info);
		else if (nc == columnDispRslt_col_080) doDispRslt_col_080_NC(info);
		else if (nc == columnDispRslt_col_081) doDispRslt_col_081_NC(info);
		else if (nc == columnDispRslt_col_082) doDispRslt_col_082_NC(info);
		else if (nc == columnDispRslt_col_083) doDispRslt_col_083_NC(info);
		else if (nc == columnDispRslt_col_084) doDispRslt_col_084_NC(info);
		else if (nc == columnDispRslt_col_085) doDispRslt_col_085_NC(info);
		else if (nc == columnDispRslt_col_086) doDispRslt_col_086_NC(info);
		else if (nc == columnDispRslt_col_087) doDispRslt_col_087_NC(info);
		else if (nc == columnDispRslt_col_088) doDispRslt_col_088_NC(info);
		else if (nc == columnDispRslt_col_089) doDispRslt_col_089_NC(info);
		else if (nc == columnDispRslt_col_090) doDispRslt_col_090_NC(info);
		else if (nc == columnDispRslt_col_091) doDispRslt_col_091_NC(info);
		else if (nc == columnDispRslt_col_092) doDispRslt_col_092_NC(info);
		else if (nc == columnDispRslt_col_093) doDispRslt_col_093_NC(info);
		else if (nc == columnDispRslt_col_094) doDispRslt_col_094_NC(info);
		else if (nc == columnDispRslt_col_095) doDispRslt_col_095_NC(info);
		else if (nc == columnDispRslt_col_096) doDispRslt_col_096_NC(info);
		else if (nc == columnDispRslt_col_097) doDispRslt_col_097_NC(info);
		else if (nc == columnDispRslt_col_098) doDispRslt_col_098_NC(info);
		else if (nc == columnDispRslt_col_099) doDispRslt_col_099_NC(info);
		else if (nc == columnDispRslt_col_100) doDispRslt_col_100_NC(info);
		else if (nc == columnDispRslt_col_101) doDispRslt_col_101_NC(info);
		else if (nc == columnDispRslt_col_102) doDispRslt_col_102_NC(info);
		else if (nc == columnDispRslt_col_103) doDispRslt_col_103_NC(info);
		else if (nc == columnDispRslt_col_104) doDispRslt_col_104_NC(info);
		else if (nc == columnDispRslt_col_105) doDispRslt_col_105_NC(info);
		else if (nc == columnDispRslt_col_106) doDispRslt_col_106_NC(info);
		else if (nc == columnDispRslt_col_107) doDispRslt_col_107_NC(info);
		else if (nc == columnDispRslt_col_108) doDispRslt_col_108_NC(info);
		else if (nc == columnDispRslt_col_109) doDispRslt_col_109_NC(info);
		else if (nc == columnDispRslt_col_110) doDispRslt_col_110_NC(info);
		else if (nc == columnDispRslt_col_111) doDispRslt_col_111_NC(info);
		else if (nc == columnDispRslt_col_112) doDispRslt_col_112_NC(info);
		else if (nc == columnDispRslt_col_113) doDispRslt_col_113_NC(info);
		else if (nc == columnDispRslt_col_114) doDispRslt_col_114_NC(info);
		else if (nc == columnDispRslt_col_115) doDispRslt_col_115_NC(info);
		else if (nc == columnDispRslt_col_116) doDispRslt_col_116_NC(info);
		else if (nc == columnDispRslt_col_117) doDispRslt_col_117_NC(info);
		else if (nc == columnDispRslt_col_118) doDispRslt_col_118_NC(info);
		else if (nc == columnDispRslt_col_119) doDispRslt_col_119_NC(info);
		else if (nc == columnDispRslt_col_120) doDispRslt_col_120_NC(info);
		else if (nc == columnDispRslt_col_121) doDispRslt_col_121_NC(info);
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
	 * [Cnd]パネルの[ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[except_other_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_other_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[no_bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_stk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_stk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_wip_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_wip_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qty_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qty_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_upri_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_rec_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_rec_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_rec_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_rec_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_nm_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_area_nm_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_000]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_000_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_001]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_001_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_002]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_002_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_003]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_003_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_004]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_004_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_005]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_005_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_006]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_006_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_007]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_007_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_008]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_008_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_009]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_009_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_010]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_010_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_011]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_011_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_012]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_012_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_013]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_013_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_014]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_014_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_015]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_015_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_016]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_016_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_017]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_017_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_018]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_018_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_019]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_019_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_020]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_020_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_021]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_021_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_022]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_022_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_023]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_023_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_024]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_024_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_025]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_025_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_026]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_026_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_027]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_027_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_028]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_028_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_029]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_029_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_030]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_030_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_031]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_031_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_032]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_032_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_033]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_033_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_034]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_034_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_035]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_035_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_036]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_036_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_037]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_037_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_038]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_038_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_039]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_039_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_040]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_040_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_041]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_041_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_042]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_042_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_043]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_043_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_044]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_044_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_045]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_045_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_046]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_046_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_047]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_047_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_048]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_048_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_049]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_049_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_050]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_050_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_051]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_051_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_052]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_052_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_053]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_053_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_054]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_054_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_055]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_055_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_056]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_056_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_057]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_057_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_058]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_058_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_059]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_059_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_060]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_060_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_061]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_061_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_062]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_062_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_063]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_063_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_064]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_064_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_065]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_065_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_066]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_066_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_067]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_067_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_068]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_068_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_069]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_069_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_070]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_070_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_071]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_071_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_072]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_072_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_073]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_073_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_074]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_074_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_075]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_075_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_076]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_076_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_077]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_077_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_078]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_078_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_079]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_079_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_080]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_080_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_081]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_081_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_082]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_082_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_083]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_083_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_084]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_084_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_085]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_085_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_086]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_086_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_087]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_087_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_088]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_088_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_089]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_089_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_090]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_090_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_091]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_091_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_092]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_092_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_093]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_093_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_094]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_094_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_095]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_095_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_096]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_096_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_097]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_097_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_098]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_098_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_099]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_099_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_100]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_100_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_101]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_101_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_102]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_102_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_103]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_103_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_104]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_104_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_105]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_105_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_106]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_106_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_107]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_107_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_108]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_108_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_109]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_109_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_110]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_110_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_111]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_111_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_112]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_112_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_113]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_113_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_114]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_114_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_115]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_115_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_116]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_116_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_117]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_117_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_118]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_118_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_119]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_119_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_120]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_120_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_121]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_121_NC(MCEventInfo info){
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
		else if (ne == Cnd_ym_fr) doCnd_ym_fr_NE(info);
		else if (ne == Cnd_ym_to) doCnd_ym_to_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NE(info);
		else if (ne == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NE(info);
		else if (ne == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NE(info);
		else if (ne == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_sno1) doCnd_sno1_NE(info);
		else if (ne == Cnd_sno2) doCnd_sno2_NE(info);
		else if (ne == Cnd_sno3) doCnd_sno3_NE(info);
		else if (ne == Cnd_sno4) doCnd_sno4_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_oper_cd) doCnd_oper_cd_NE(info);
		else if (ne == Cnd_oper_nm) doCnd_oper_nm_NE(info);
		else if (ne == Cnd_asst_typ) doCnd_asst_typ_NE(info);
		else if (ne == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NE(info);
		else if (ne == Cnd_except_other_flg) doCnd_except_other_flg_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_no_bp_flg) doCnd_no_bp_flg_NE(info);
		else if (ne == Cnd_cntry_cd) doCnd_cntry_cd_NE(info);
		else if (ne == Cnd_cntry_nm) doCnd_cntry_nm_NE(info);
		else if (ne == Cnd_area_cd) doCnd_area_cd_NE(info);
		else if (ne == Cnd_area_nm) doCnd_area_nm_NE(info);
		else if (ne == Cnd_end_stk_flg) doCnd_end_stk_flg_NE(info);
		else if (ne == Cnd_end_wip_flg) doCnd_end_wip_flg_NE(info);
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
		else if (ne == Cnd_calc_grp_flg) doCnd_calc_grp_flg_NE(info);
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
		else if (ne == Cnd_asst_flg) doCnd_asst_flg_NE(info);
		else if (ne == Cnd_bp_flg) doCnd_bp_flg_NE(info);
		else if (ne == Cnd_cntry_flg) doCnd_cntry_flg_NE(info);
		else if (ne == Cnd_area_flg) doCnd_area_flg_NE(info);
		else if (ne == Cnd_loc_flg) doCnd_loc_flg_NE(info);
		else if (ne == Cnd_str_ln_flg) doCnd_str_ln_flg_NE(info);
		else if (ne == Cnd_oper_flg) doCnd_oper_flg_NE(info);
		else if (ne == Cnd_qty_flg) doCnd_qty_flg_NE(info);
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
		else if (ne == Cnd_disp_upri) doCnd_disp_upri_NE(info);
		else if (ne == columnDispRslt_calc_rec_typ) doDispRslt_calc_rec_typ_NE(info);
		else if (ne == columnDispRslt_calc_rec_typ_nm) doDispRslt_calc_rec_typ_nm_NE(info);
		else if (ne == columnDispRslt_calc_grp_cd) doDispRslt_calc_grp_cd_NE(info);
		else if (ne == columnDispRslt_calc_grp_nm) doDispRslt_calc_grp_nm_NE(info);
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
		else if (ne == columnDispRslt_bp_cd) doDispRslt_bp_cd_NE(info);
		else if (ne == columnDispRslt_bp_nm) doDispRslt_bp_nm_NE(info);
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
		else if (ne == columnDispRslt_cntry_cd) doDispRslt_cntry_cd_NE(info);
		else if (ne == columnDispRslt_cntry_nm) doDispRslt_cntry_nm_NE(info);
		else if (ne == columnDispRslt_area_cd) doDispRslt_area_cd_NE(info);
		else if (ne == columnDispRslt_area_nm) doDispRslt_area_nm_NE(info);
		else if (ne == columnDispRslt_loc_cd) doDispRslt_loc_cd_NE(info);
		else if (ne == columnDispRslt_loc_nm) doDispRslt_loc_nm_NE(info);
		else if (ne == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_NE(info);
		else if (ne == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_NE(info);
		else if (ne == columnDispRslt_oper_cd) doDispRslt_oper_cd_NE(info);
		else if (ne == columnDispRslt_oper_nm) doDispRslt_oper_nm_NE(info);
		else if (ne == columnDispRslt_asst_typ) doDispRslt_asst_typ_NE(info);
		else if (ne == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NE(info);
		else if (ne == columnDispRslt_unit_cd) doDispRslt_unit_cd_NE(info);
		else if (ne == columnDispRslt_unit_nm) doDispRslt_unit_nm_NE(info);
		else if (ne == columnDispRslt_dec_place) doDispRslt_dec_place_NE(info);
		else if (ne == columnDispRslt_elm_no) doDispRslt_elm_no_NE(info);
		else if (ne == columnDispRslt_elm) doDispRslt_elm_NE(info);
		else if (ne == columnDispRslt_elm_nm) doDispRslt_elm_nm_NE(info);
		else if (ne == columnDispRslt_col_000) doDispRslt_col_000_NE(info);
		else if (ne == columnDispRslt_col_001) doDispRslt_col_001_NE(info);
		else if (ne == columnDispRslt_col_002) doDispRslt_col_002_NE(info);
		else if (ne == columnDispRslt_col_003) doDispRslt_col_003_NE(info);
		else if (ne == columnDispRslt_col_004) doDispRslt_col_004_NE(info);
		else if (ne == columnDispRslt_col_005) doDispRslt_col_005_NE(info);
		else if (ne == columnDispRslt_col_006) doDispRslt_col_006_NE(info);
		else if (ne == columnDispRslt_col_007) doDispRslt_col_007_NE(info);
		else if (ne == columnDispRslt_col_008) doDispRslt_col_008_NE(info);
		else if (ne == columnDispRslt_col_009) doDispRslt_col_009_NE(info);
		else if (ne == columnDispRslt_col_010) doDispRslt_col_010_NE(info);
		else if (ne == columnDispRslt_col_011) doDispRslt_col_011_NE(info);
		else if (ne == columnDispRslt_col_012) doDispRslt_col_012_NE(info);
		else if (ne == columnDispRslt_col_013) doDispRslt_col_013_NE(info);
		else if (ne == columnDispRslt_col_014) doDispRslt_col_014_NE(info);
		else if (ne == columnDispRslt_col_015) doDispRslt_col_015_NE(info);
		else if (ne == columnDispRslt_col_016) doDispRslt_col_016_NE(info);
		else if (ne == columnDispRslt_col_017) doDispRslt_col_017_NE(info);
		else if (ne == columnDispRslt_col_018) doDispRslt_col_018_NE(info);
		else if (ne == columnDispRslt_col_019) doDispRslt_col_019_NE(info);
		else if (ne == columnDispRslt_col_020) doDispRslt_col_020_NE(info);
		else if (ne == columnDispRslt_col_021) doDispRslt_col_021_NE(info);
		else if (ne == columnDispRslt_col_022) doDispRslt_col_022_NE(info);
		else if (ne == columnDispRslt_col_023) doDispRslt_col_023_NE(info);
		else if (ne == columnDispRslt_col_024) doDispRslt_col_024_NE(info);
		else if (ne == columnDispRslt_col_025) doDispRslt_col_025_NE(info);
		else if (ne == columnDispRslt_col_026) doDispRslt_col_026_NE(info);
		else if (ne == columnDispRslt_col_027) doDispRslt_col_027_NE(info);
		else if (ne == columnDispRslt_col_028) doDispRslt_col_028_NE(info);
		else if (ne == columnDispRslt_col_029) doDispRslt_col_029_NE(info);
		else if (ne == columnDispRslt_col_030) doDispRslt_col_030_NE(info);
		else if (ne == columnDispRslt_col_031) doDispRslt_col_031_NE(info);
		else if (ne == columnDispRslt_col_032) doDispRslt_col_032_NE(info);
		else if (ne == columnDispRslt_col_033) doDispRslt_col_033_NE(info);
		else if (ne == columnDispRslt_col_034) doDispRslt_col_034_NE(info);
		else if (ne == columnDispRslt_col_035) doDispRslt_col_035_NE(info);
		else if (ne == columnDispRslt_col_036) doDispRslt_col_036_NE(info);
		else if (ne == columnDispRslt_col_037) doDispRslt_col_037_NE(info);
		else if (ne == columnDispRslt_col_038) doDispRslt_col_038_NE(info);
		else if (ne == columnDispRslt_col_039) doDispRslt_col_039_NE(info);
		else if (ne == columnDispRslt_col_040) doDispRslt_col_040_NE(info);
		else if (ne == columnDispRslt_col_041) doDispRslt_col_041_NE(info);
		else if (ne == columnDispRslt_col_042) doDispRslt_col_042_NE(info);
		else if (ne == columnDispRslt_col_043) doDispRslt_col_043_NE(info);
		else if (ne == columnDispRslt_col_044) doDispRslt_col_044_NE(info);
		else if (ne == columnDispRslt_col_045) doDispRslt_col_045_NE(info);
		else if (ne == columnDispRslt_col_046) doDispRslt_col_046_NE(info);
		else if (ne == columnDispRslt_col_047) doDispRslt_col_047_NE(info);
		else if (ne == columnDispRslt_col_048) doDispRslt_col_048_NE(info);
		else if (ne == columnDispRslt_col_049) doDispRslt_col_049_NE(info);
		else if (ne == columnDispRslt_col_050) doDispRslt_col_050_NE(info);
		else if (ne == columnDispRslt_col_051) doDispRslt_col_051_NE(info);
		else if (ne == columnDispRslt_col_052) doDispRslt_col_052_NE(info);
		else if (ne == columnDispRslt_col_053) doDispRslt_col_053_NE(info);
		else if (ne == columnDispRslt_col_054) doDispRslt_col_054_NE(info);
		else if (ne == columnDispRslt_col_055) doDispRslt_col_055_NE(info);
		else if (ne == columnDispRslt_col_056) doDispRslt_col_056_NE(info);
		else if (ne == columnDispRslt_col_057) doDispRslt_col_057_NE(info);
		else if (ne == columnDispRslt_col_058) doDispRslt_col_058_NE(info);
		else if (ne == columnDispRslt_col_059) doDispRslt_col_059_NE(info);
		else if (ne == columnDispRslt_col_060) doDispRslt_col_060_NE(info);
		else if (ne == columnDispRslt_col_061) doDispRslt_col_061_NE(info);
		else if (ne == columnDispRslt_col_062) doDispRslt_col_062_NE(info);
		else if (ne == columnDispRslt_col_063) doDispRslt_col_063_NE(info);
		else if (ne == columnDispRslt_col_064) doDispRslt_col_064_NE(info);
		else if (ne == columnDispRslt_col_065) doDispRslt_col_065_NE(info);
		else if (ne == columnDispRslt_col_066) doDispRslt_col_066_NE(info);
		else if (ne == columnDispRslt_col_067) doDispRslt_col_067_NE(info);
		else if (ne == columnDispRslt_col_068) doDispRslt_col_068_NE(info);
		else if (ne == columnDispRslt_col_069) doDispRslt_col_069_NE(info);
		else if (ne == columnDispRslt_col_070) doDispRslt_col_070_NE(info);
		else if (ne == columnDispRslt_col_071) doDispRslt_col_071_NE(info);
		else if (ne == columnDispRslt_col_072) doDispRslt_col_072_NE(info);
		else if (ne == columnDispRslt_col_073) doDispRslt_col_073_NE(info);
		else if (ne == columnDispRslt_col_074) doDispRslt_col_074_NE(info);
		else if (ne == columnDispRslt_col_075) doDispRslt_col_075_NE(info);
		else if (ne == columnDispRslt_col_076) doDispRslt_col_076_NE(info);
		else if (ne == columnDispRslt_col_077) doDispRslt_col_077_NE(info);
		else if (ne == columnDispRslt_col_078) doDispRslt_col_078_NE(info);
		else if (ne == columnDispRslt_col_079) doDispRslt_col_079_NE(info);
		else if (ne == columnDispRslt_col_080) doDispRslt_col_080_NE(info);
		else if (ne == columnDispRslt_col_081) doDispRslt_col_081_NE(info);
		else if (ne == columnDispRslt_col_082) doDispRslt_col_082_NE(info);
		else if (ne == columnDispRslt_col_083) doDispRslt_col_083_NE(info);
		else if (ne == columnDispRslt_col_084) doDispRslt_col_084_NE(info);
		else if (ne == columnDispRslt_col_085) doDispRslt_col_085_NE(info);
		else if (ne == columnDispRslt_col_086) doDispRslt_col_086_NE(info);
		else if (ne == columnDispRslt_col_087) doDispRslt_col_087_NE(info);
		else if (ne == columnDispRslt_col_088) doDispRslt_col_088_NE(info);
		else if (ne == columnDispRslt_col_089) doDispRslt_col_089_NE(info);
		else if (ne == columnDispRslt_col_090) doDispRslt_col_090_NE(info);
		else if (ne == columnDispRslt_col_091) doDispRslt_col_091_NE(info);
		else if (ne == columnDispRslt_col_092) doDispRslt_col_092_NE(info);
		else if (ne == columnDispRslt_col_093) doDispRslt_col_093_NE(info);
		else if (ne == columnDispRslt_col_094) doDispRslt_col_094_NE(info);
		else if (ne == columnDispRslt_col_095) doDispRslt_col_095_NE(info);
		else if (ne == columnDispRslt_col_096) doDispRslt_col_096_NE(info);
		else if (ne == columnDispRslt_col_097) doDispRslt_col_097_NE(info);
		else if (ne == columnDispRslt_col_098) doDispRslt_col_098_NE(info);
		else if (ne == columnDispRslt_col_099) doDispRslt_col_099_NE(info);
		else if (ne == columnDispRslt_col_100) doDispRslt_col_100_NE(info);
		else if (ne == columnDispRslt_col_101) doDispRslt_col_101_NE(info);
		else if (ne == columnDispRslt_col_102) doDispRslt_col_102_NE(info);
		else if (ne == columnDispRslt_col_103) doDispRslt_col_103_NE(info);
		else if (ne == columnDispRslt_col_104) doDispRslt_col_104_NE(info);
		else if (ne == columnDispRslt_col_105) doDispRslt_col_105_NE(info);
		else if (ne == columnDispRslt_col_106) doDispRslt_col_106_NE(info);
		else if (ne == columnDispRslt_col_107) doDispRslt_col_107_NE(info);
		else if (ne == columnDispRslt_col_108) doDispRslt_col_108_NE(info);
		else if (ne == columnDispRslt_col_109) doDispRslt_col_109_NE(info);
		else if (ne == columnDispRslt_col_110) doDispRslt_col_110_NE(info);
		else if (ne == columnDispRslt_col_111) doDispRslt_col_111_NE(info);
		else if (ne == columnDispRslt_col_112) doDispRslt_col_112_NE(info);
		else if (ne == columnDispRslt_col_113) doDispRslt_col_113_NE(info);
		else if (ne == columnDispRslt_col_114) doDispRslt_col_114_NE(info);
		else if (ne == columnDispRslt_col_115) doDispRslt_col_115_NE(info);
		else if (ne == columnDispRslt_col_116) doDispRslt_col_116_NE(info);
		else if (ne == columnDispRslt_col_117) doDispRslt_col_117_NE(info);
		else if (ne == columnDispRslt_col_118) doDispRslt_col_118_NE(info);
		else if (ne == columnDispRslt_col_119) doDispRslt_col_119_NE(info);
		else if (ne == columnDispRslt_col_120) doDispRslt_col_120_NE(info);
		else if (ne == columnDispRslt_col_121) doDispRslt_col_121_NE(info);
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
	 * [Cnd]パネルの[ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[except_other_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_other_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[no_bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_stk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_stk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_wip_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_wip_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qty_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qty_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_upri_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_rec_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_rec_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_rec_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_rec_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_nm_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_area_nm_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_000]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_000_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_001]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_001_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_002]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_002_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_003]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_003_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_004]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_004_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_005]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_005_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_006]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_006_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_007]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_007_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_008]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_008_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_009]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_009_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_010]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_010_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_011]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_011_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_012]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_012_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_013]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_013_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_014]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_014_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_015]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_015_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_016]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_016_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_017]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_017_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_018]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_018_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_019]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_019_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_020]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_020_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_021]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_021_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_022]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_022_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_023]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_023_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_024]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_024_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_025]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_025_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_026]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_026_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_027]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_027_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_028]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_028_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_029]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_029_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_030]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_030_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_031]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_031_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_032]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_032_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_033]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_033_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_034]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_034_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_035]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_035_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_036]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_036_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_037]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_037_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_038]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_038_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_039]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_039_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_040]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_040_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_041]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_041_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_042]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_042_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_043]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_043_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_044]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_044_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_045]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_045_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_046]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_046_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_047]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_047_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_048]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_048_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_049]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_049_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_050]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_050_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_051]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_051_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_052]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_052_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_053]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_053_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_054]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_054_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_055]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_055_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_056]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_056_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_057]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_057_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_058]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_058_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_059]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_059_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_060]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_060_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_061]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_061_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_062]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_062_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_063]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_063_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_064]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_064_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_065]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_065_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_066]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_066_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_067]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_067_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_068]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_068_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_069]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_069_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_070]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_070_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_071]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_071_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_072]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_072_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_073]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_073_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_074]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_074_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_075]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_075_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_076]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_076_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_077]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_077_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_078]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_078_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_079]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_079_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_080]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_080_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_081]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_081_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_082]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_082_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_083]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_083_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_084]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_084_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_085]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_085_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_086]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_086_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_087]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_087_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_088]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_088_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_089]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_089_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_090]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_090_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_091]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_091_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_092]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_092_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_093]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_093_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_094]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_094_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_095]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_095_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_096]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_096_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_097]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_097_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_098]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_098_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_099]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_099_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_100]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_100_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_101]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_101_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_102]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_102_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_103]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_103_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_104]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_104_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_105]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_105_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_106]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_106_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_107]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_107_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_108]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_108_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_109]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_109_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_110]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_110_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_111]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_111_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_112]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_112_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_113]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_113_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_114]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_114_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_115]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_115_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_116]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_116_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_117]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_117_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_118]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_118_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_119]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_119_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_120]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_120_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_121]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_121_NE(MCEventInfo info){
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
		else if (nx == Cnd_ym_fr) doCnd_ym_fr_NX(info);
		else if (nx == Cnd_ym_to) doCnd_ym_to_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NX(info);
		else if (nx == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NX(info);
		else if (nx == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NX(info);
		else if (nx == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_sno1) doCnd_sno1_NX(info);
		else if (nx == Cnd_sno2) doCnd_sno2_NX(info);
		else if (nx == Cnd_sno3) doCnd_sno3_NX(info);
		else if (nx == Cnd_sno4) doCnd_sno4_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_oper_cd) doCnd_oper_cd_NX(info);
		else if (nx == Cnd_oper_nm) doCnd_oper_nm_NX(info);
		else if (nx == Cnd_asst_typ) doCnd_asst_typ_NX(info);
		else if (nx == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NX(info);
		else if (nx == Cnd_except_other_flg) doCnd_except_other_flg_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_no_bp_flg) doCnd_no_bp_flg_NX(info);
		else if (nx == Cnd_cntry_cd) doCnd_cntry_cd_NX(info);
		else if (nx == Cnd_cntry_nm) doCnd_cntry_nm_NX(info);
		else if (nx == Cnd_area_cd) doCnd_area_cd_NX(info);
		else if (nx == Cnd_area_nm) doCnd_area_nm_NX(info);
		else if (nx == Cnd_end_stk_flg) doCnd_end_stk_flg_NX(info);
		else if (nx == Cnd_end_wip_flg) doCnd_end_wip_flg_NX(info);
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
		else if (nx == Cnd_calc_grp_flg) doCnd_calc_grp_flg_NX(info);
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
		else if (nx == Cnd_asst_flg) doCnd_asst_flg_NX(info);
		else if (nx == Cnd_bp_flg) doCnd_bp_flg_NX(info);
		else if (nx == Cnd_cntry_flg) doCnd_cntry_flg_NX(info);
		else if (nx == Cnd_area_flg) doCnd_area_flg_NX(info);
		else if (nx == Cnd_loc_flg) doCnd_loc_flg_NX(info);
		else if (nx == Cnd_str_ln_flg) doCnd_str_ln_flg_NX(info);
		else if (nx == Cnd_oper_flg) doCnd_oper_flg_NX(info);
		else if (nx == Cnd_qty_flg) doCnd_qty_flg_NX(info);
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
		else if (nx == Cnd_disp_upri) doCnd_disp_upri_NX(info);
		else if (nx == columnDispRslt_calc_rec_typ) doDispRslt_calc_rec_typ_NX(info);
		else if (nx == columnDispRslt_calc_rec_typ_nm) doDispRslt_calc_rec_typ_nm_NX(info);
		else if (nx == columnDispRslt_calc_grp_cd) doDispRslt_calc_grp_cd_NX(info);
		else if (nx == columnDispRslt_calc_grp_nm) doDispRslt_calc_grp_nm_NX(info);
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
		else if (nx == columnDispRslt_bp_cd) doDispRslt_bp_cd_NX(info);
		else if (nx == columnDispRslt_bp_nm) doDispRslt_bp_nm_NX(info);
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
		else if (nx == columnDispRslt_cntry_cd) doDispRslt_cntry_cd_NX(info);
		else if (nx == columnDispRslt_cntry_nm) doDispRslt_cntry_nm_NX(info);
		else if (nx == columnDispRslt_area_cd) doDispRslt_area_cd_NX(info);
		else if (nx == columnDispRslt_area_nm) doDispRslt_area_nm_NX(info);
		else if (nx == columnDispRslt_loc_cd) doDispRslt_loc_cd_NX(info);
		else if (nx == columnDispRslt_loc_nm) doDispRslt_loc_nm_NX(info);
		else if (nx == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_NX(info);
		else if (nx == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_NX(info);
		else if (nx == columnDispRslt_oper_cd) doDispRslt_oper_cd_NX(info);
		else if (nx == columnDispRslt_oper_nm) doDispRslt_oper_nm_NX(info);
		else if (nx == columnDispRslt_asst_typ) doDispRslt_asst_typ_NX(info);
		else if (nx == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NX(info);
		else if (nx == columnDispRslt_unit_cd) doDispRslt_unit_cd_NX(info);
		else if (nx == columnDispRslt_unit_nm) doDispRslt_unit_nm_NX(info);
		else if (nx == columnDispRslt_dec_place) doDispRslt_dec_place_NX(info);
		else if (nx == columnDispRslt_elm_no) doDispRslt_elm_no_NX(info);
		else if (nx == columnDispRslt_elm) doDispRslt_elm_NX(info);
		else if (nx == columnDispRslt_elm_nm) doDispRslt_elm_nm_NX(info);
		else if (nx == columnDispRslt_col_000) doDispRslt_col_000_NX(info);
		else if (nx == columnDispRslt_col_001) doDispRslt_col_001_NX(info);
		else if (nx == columnDispRslt_col_002) doDispRslt_col_002_NX(info);
		else if (nx == columnDispRslt_col_003) doDispRslt_col_003_NX(info);
		else if (nx == columnDispRslt_col_004) doDispRslt_col_004_NX(info);
		else if (nx == columnDispRslt_col_005) doDispRslt_col_005_NX(info);
		else if (nx == columnDispRslt_col_006) doDispRslt_col_006_NX(info);
		else if (nx == columnDispRslt_col_007) doDispRslt_col_007_NX(info);
		else if (nx == columnDispRslt_col_008) doDispRslt_col_008_NX(info);
		else if (nx == columnDispRslt_col_009) doDispRslt_col_009_NX(info);
		else if (nx == columnDispRslt_col_010) doDispRslt_col_010_NX(info);
		else if (nx == columnDispRslt_col_011) doDispRslt_col_011_NX(info);
		else if (nx == columnDispRslt_col_012) doDispRslt_col_012_NX(info);
		else if (nx == columnDispRslt_col_013) doDispRslt_col_013_NX(info);
		else if (nx == columnDispRslt_col_014) doDispRslt_col_014_NX(info);
		else if (nx == columnDispRslt_col_015) doDispRslt_col_015_NX(info);
		else if (nx == columnDispRslt_col_016) doDispRslt_col_016_NX(info);
		else if (nx == columnDispRslt_col_017) doDispRslt_col_017_NX(info);
		else if (nx == columnDispRslt_col_018) doDispRslt_col_018_NX(info);
		else if (nx == columnDispRslt_col_019) doDispRslt_col_019_NX(info);
		else if (nx == columnDispRslt_col_020) doDispRslt_col_020_NX(info);
		else if (nx == columnDispRslt_col_021) doDispRslt_col_021_NX(info);
		else if (nx == columnDispRslt_col_022) doDispRslt_col_022_NX(info);
		else if (nx == columnDispRslt_col_023) doDispRslt_col_023_NX(info);
		else if (nx == columnDispRslt_col_024) doDispRslt_col_024_NX(info);
		else if (nx == columnDispRslt_col_025) doDispRslt_col_025_NX(info);
		else if (nx == columnDispRslt_col_026) doDispRslt_col_026_NX(info);
		else if (nx == columnDispRslt_col_027) doDispRslt_col_027_NX(info);
		else if (nx == columnDispRslt_col_028) doDispRslt_col_028_NX(info);
		else if (nx == columnDispRslt_col_029) doDispRslt_col_029_NX(info);
		else if (nx == columnDispRslt_col_030) doDispRslt_col_030_NX(info);
		else if (nx == columnDispRslt_col_031) doDispRslt_col_031_NX(info);
		else if (nx == columnDispRslt_col_032) doDispRslt_col_032_NX(info);
		else if (nx == columnDispRslt_col_033) doDispRslt_col_033_NX(info);
		else if (nx == columnDispRslt_col_034) doDispRslt_col_034_NX(info);
		else if (nx == columnDispRslt_col_035) doDispRslt_col_035_NX(info);
		else if (nx == columnDispRslt_col_036) doDispRslt_col_036_NX(info);
		else if (nx == columnDispRslt_col_037) doDispRslt_col_037_NX(info);
		else if (nx == columnDispRslt_col_038) doDispRslt_col_038_NX(info);
		else if (nx == columnDispRslt_col_039) doDispRslt_col_039_NX(info);
		else if (nx == columnDispRslt_col_040) doDispRslt_col_040_NX(info);
		else if (nx == columnDispRslt_col_041) doDispRslt_col_041_NX(info);
		else if (nx == columnDispRslt_col_042) doDispRslt_col_042_NX(info);
		else if (nx == columnDispRslt_col_043) doDispRslt_col_043_NX(info);
		else if (nx == columnDispRslt_col_044) doDispRslt_col_044_NX(info);
		else if (nx == columnDispRslt_col_045) doDispRslt_col_045_NX(info);
		else if (nx == columnDispRslt_col_046) doDispRslt_col_046_NX(info);
		else if (nx == columnDispRslt_col_047) doDispRslt_col_047_NX(info);
		else if (nx == columnDispRslt_col_048) doDispRslt_col_048_NX(info);
		else if (nx == columnDispRslt_col_049) doDispRslt_col_049_NX(info);
		else if (nx == columnDispRslt_col_050) doDispRslt_col_050_NX(info);
		else if (nx == columnDispRslt_col_051) doDispRslt_col_051_NX(info);
		else if (nx == columnDispRslt_col_052) doDispRslt_col_052_NX(info);
		else if (nx == columnDispRslt_col_053) doDispRslt_col_053_NX(info);
		else if (nx == columnDispRslt_col_054) doDispRslt_col_054_NX(info);
		else if (nx == columnDispRslt_col_055) doDispRslt_col_055_NX(info);
		else if (nx == columnDispRslt_col_056) doDispRslt_col_056_NX(info);
		else if (nx == columnDispRslt_col_057) doDispRslt_col_057_NX(info);
		else if (nx == columnDispRslt_col_058) doDispRslt_col_058_NX(info);
		else if (nx == columnDispRslt_col_059) doDispRslt_col_059_NX(info);
		else if (nx == columnDispRslt_col_060) doDispRslt_col_060_NX(info);
		else if (nx == columnDispRslt_col_061) doDispRslt_col_061_NX(info);
		else if (nx == columnDispRslt_col_062) doDispRslt_col_062_NX(info);
		else if (nx == columnDispRslt_col_063) doDispRslt_col_063_NX(info);
		else if (nx == columnDispRslt_col_064) doDispRslt_col_064_NX(info);
		else if (nx == columnDispRslt_col_065) doDispRslt_col_065_NX(info);
		else if (nx == columnDispRslt_col_066) doDispRslt_col_066_NX(info);
		else if (nx == columnDispRslt_col_067) doDispRslt_col_067_NX(info);
		else if (nx == columnDispRslt_col_068) doDispRslt_col_068_NX(info);
		else if (nx == columnDispRslt_col_069) doDispRslt_col_069_NX(info);
		else if (nx == columnDispRslt_col_070) doDispRslt_col_070_NX(info);
		else if (nx == columnDispRslt_col_071) doDispRslt_col_071_NX(info);
		else if (nx == columnDispRslt_col_072) doDispRslt_col_072_NX(info);
		else if (nx == columnDispRslt_col_073) doDispRslt_col_073_NX(info);
		else if (nx == columnDispRslt_col_074) doDispRslt_col_074_NX(info);
		else if (nx == columnDispRslt_col_075) doDispRslt_col_075_NX(info);
		else if (nx == columnDispRslt_col_076) doDispRslt_col_076_NX(info);
		else if (nx == columnDispRslt_col_077) doDispRslt_col_077_NX(info);
		else if (nx == columnDispRslt_col_078) doDispRslt_col_078_NX(info);
		else if (nx == columnDispRslt_col_079) doDispRslt_col_079_NX(info);
		else if (nx == columnDispRslt_col_080) doDispRslt_col_080_NX(info);
		else if (nx == columnDispRslt_col_081) doDispRslt_col_081_NX(info);
		else if (nx == columnDispRslt_col_082) doDispRslt_col_082_NX(info);
		else if (nx == columnDispRslt_col_083) doDispRslt_col_083_NX(info);
		else if (nx == columnDispRslt_col_084) doDispRslt_col_084_NX(info);
		else if (nx == columnDispRslt_col_085) doDispRslt_col_085_NX(info);
		else if (nx == columnDispRslt_col_086) doDispRslt_col_086_NX(info);
		else if (nx == columnDispRslt_col_087) doDispRslt_col_087_NX(info);
		else if (nx == columnDispRslt_col_088) doDispRslt_col_088_NX(info);
		else if (nx == columnDispRslt_col_089) doDispRslt_col_089_NX(info);
		else if (nx == columnDispRslt_col_090) doDispRslt_col_090_NX(info);
		else if (nx == columnDispRslt_col_091) doDispRslt_col_091_NX(info);
		else if (nx == columnDispRslt_col_092) doDispRslt_col_092_NX(info);
		else if (nx == columnDispRslt_col_093) doDispRslt_col_093_NX(info);
		else if (nx == columnDispRslt_col_094) doDispRslt_col_094_NX(info);
		else if (nx == columnDispRslt_col_095) doDispRslt_col_095_NX(info);
		else if (nx == columnDispRslt_col_096) doDispRslt_col_096_NX(info);
		else if (nx == columnDispRslt_col_097) doDispRslt_col_097_NX(info);
		else if (nx == columnDispRslt_col_098) doDispRslt_col_098_NX(info);
		else if (nx == columnDispRslt_col_099) doDispRslt_col_099_NX(info);
		else if (nx == columnDispRslt_col_100) doDispRslt_col_100_NX(info);
		else if (nx == columnDispRslt_col_101) doDispRslt_col_101_NX(info);
		else if (nx == columnDispRslt_col_102) doDispRslt_col_102_NX(info);
		else if (nx == columnDispRslt_col_103) doDispRslt_col_103_NX(info);
		else if (nx == columnDispRslt_col_104) doDispRslt_col_104_NX(info);
		else if (nx == columnDispRslt_col_105) doDispRslt_col_105_NX(info);
		else if (nx == columnDispRslt_col_106) doDispRslt_col_106_NX(info);
		else if (nx == columnDispRslt_col_107) doDispRslt_col_107_NX(info);
		else if (nx == columnDispRslt_col_108) doDispRslt_col_108_NX(info);
		else if (nx == columnDispRslt_col_109) doDispRslt_col_109_NX(info);
		else if (nx == columnDispRslt_col_110) doDispRslt_col_110_NX(info);
		else if (nx == columnDispRslt_col_111) doDispRslt_col_111_NX(info);
		else if (nx == columnDispRslt_col_112) doDispRslt_col_112_NX(info);
		else if (nx == columnDispRslt_col_113) doDispRslt_col_113_NX(info);
		else if (nx == columnDispRslt_col_114) doDispRslt_col_114_NX(info);
		else if (nx == columnDispRslt_col_115) doDispRslt_col_115_NX(info);
		else if (nx == columnDispRslt_col_116) doDispRslt_col_116_NX(info);
		else if (nx == columnDispRslt_col_117) doDispRslt_col_117_NX(info);
		else if (nx == columnDispRslt_col_118) doDispRslt_col_118_NX(info);
		else if (nx == columnDispRslt_col_119) doDispRslt_col_119_NX(info);
		else if (nx == columnDispRslt_col_120) doDispRslt_col_120_NX(info);
		else if (nx == columnDispRslt_col_121) doDispRslt_col_121_NX(info);
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
	 * [Cnd]パネルの[ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[except_other_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_except_other_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[no_bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_stk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_stk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_wip_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_wip_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qty_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qty_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_upri_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_rec_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_rec_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_rec_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_rec_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_nm_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_area_nm_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_000]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_000_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_001]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_001_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_002]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_002_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_003]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_003_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_004]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_004_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_005]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_005_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_006]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_006_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_007]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_007_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_008]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_008_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_009]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_009_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_010]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_010_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_011]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_011_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_012]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_012_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_013]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_013_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_014]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_014_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_015]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_015_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_016]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_016_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_017]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_017_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_018]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_018_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_019]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_019_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_020]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_020_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_021]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_021_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_022]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_022_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_023]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_023_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_024]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_024_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_025]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_025_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_026]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_026_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_027]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_027_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_028]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_028_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_029]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_029_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_030]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_030_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_031]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_031_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_032]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_032_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_033]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_033_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_034]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_034_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_035]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_035_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_036]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_036_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_037]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_037_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_038]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_038_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_039]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_039_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_040]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_040_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_041]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_041_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_042]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_042_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_043]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_043_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_044]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_044_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_045]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_045_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_046]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_046_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_047]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_047_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_048]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_048_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_049]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_049_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_050]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_050_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_051]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_051_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_052]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_052_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_053]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_053_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_054]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_054_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_055]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_055_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_056]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_056_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_057]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_057_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_058]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_058_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_059]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_059_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_060]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_060_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_061]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_061_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_062]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_062_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_063]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_063_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_064]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_064_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_065]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_065_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_066]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_066_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_067]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_067_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_068]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_068_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_069]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_069_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_070]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_070_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_071]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_071_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_072]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_072_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_073]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_073_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_074]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_074_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_075]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_075_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_076]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_076_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_077]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_077_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_078]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_078_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_079]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_079_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_080]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_080_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_081]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_081_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_082]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_082_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_083]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_083_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_084]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_084_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_085]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_085_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_086]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_086_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_087]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_087_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_088]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_088_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_089]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_089_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_090]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_090_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_091]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_091_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_092]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_092_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_093]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_093_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_094]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_094_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_095]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_095_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_096]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_096_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_097]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_097_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_098]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_098_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_099]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_099_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_100]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_100_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_101]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_101_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_102]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_102_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_103]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_103_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_104]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_104_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_105]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_105_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_106]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_106_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_107]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_107_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_108]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_108_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_109]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_109_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_110]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_110_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_111]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_111_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_112]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_112_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_113]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_113_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_114]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_114_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_115]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_115_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_116]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_116_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_117]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_117_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_118]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_118_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_119]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_119_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_120]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_120_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_121]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_121_NX(MCEventInfo info){
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
		else if (lc == Cnd_ym_fr) doCnd_ym_fr_LC(info);
		else if (lc == Cnd_ym_to) doCnd_ym_to_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_LC(info);
		else if (lc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_LC(info);
		else if (lc == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_LC(info);
		else if (lc == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_sno1) doCnd_sno1_LC(info);
		else if (lc == Cnd_sno2) doCnd_sno2_LC(info);
		else if (lc == Cnd_sno3) doCnd_sno3_LC(info);
		else if (lc == Cnd_sno4) doCnd_sno4_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_oper_cd) doCnd_oper_cd_LC(info);
		else if (lc == Cnd_oper_nm) doCnd_oper_nm_LC(info);
		else if (lc == Cnd_asst_typ) doCnd_asst_typ_LC(info);
		else if (lc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_LC(info);
		else if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_cntry_cd) doCnd_cntry_cd_LC(info);
		else if (lc == Cnd_cntry_nm) doCnd_cntry_nm_LC(info);
		else if (lc == Cnd_area_cd) doCnd_area_cd_LC(info);
		else if (lc == Cnd_area_nm) doCnd_area_nm_LC(info);
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
		else if (lc == columnDispRslt_calc_rec_typ) doDispRslt_calc_rec_typ_LC(info);
		else if (lc == columnDispRslt_calc_rec_typ_nm) doDispRslt_calc_rec_typ_nm_LC(info);
		else if (lc == columnDispRslt_calc_grp_cd) doDispRslt_calc_grp_cd_LC(info);
		else if (lc == columnDispRslt_calc_grp_nm) doDispRslt_calc_grp_nm_LC(info);
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
		else if (lc == columnDispRslt_bp_cd) doDispRslt_bp_cd_LC(info);
		else if (lc == columnDispRslt_bp_nm) doDispRslt_bp_nm_LC(info);
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
		else if (lc == columnDispRslt_cntry_cd) doDispRslt_cntry_cd_LC(info);
		else if (lc == columnDispRslt_cntry_nm) doDispRslt_cntry_nm_LC(info);
		else if (lc == columnDispRslt_area_cd) doDispRslt_area_cd_LC(info);
		else if (lc == columnDispRslt_area_nm) doDispRslt_area_nm_LC(info);
		else if (lc == columnDispRslt_loc_cd) doDispRslt_loc_cd_LC(info);
		else if (lc == columnDispRslt_loc_nm) doDispRslt_loc_nm_LC(info);
		else if (lc == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_LC(info);
		else if (lc == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_LC(info);
		else if (lc == columnDispRslt_oper_cd) doDispRslt_oper_cd_LC(info);
		else if (lc == columnDispRslt_oper_nm) doDispRslt_oper_nm_LC(info);
		else if (lc == columnDispRslt_asst_typ) doDispRslt_asst_typ_LC(info);
		else if (lc == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_LC(info);
		else if (lc == columnDispRslt_unit_cd) doDispRslt_unit_cd_LC(info);
		else if (lc == columnDispRslt_unit_nm) doDispRslt_unit_nm_LC(info);
		else if (lc == columnDispRslt_dec_place) doDispRslt_dec_place_LC(info);
		else if (lc == columnDispRslt_elm_no) doDispRslt_elm_no_LC(info);
		else if (lc == columnDispRslt_elm) doDispRslt_elm_LC(info);
		else if (lc == columnDispRslt_elm_nm) doDispRslt_elm_nm_LC(info);
		else if (lc == columnDispRslt_col_000) doDispRslt_col_000_LC(info);
		else if (lc == columnDispRslt_col_001) doDispRslt_col_001_LC(info);
		else if (lc == columnDispRslt_col_002) doDispRslt_col_002_LC(info);
		else if (lc == columnDispRslt_col_003) doDispRslt_col_003_LC(info);
		else if (lc == columnDispRslt_col_004) doDispRslt_col_004_LC(info);
		else if (lc == columnDispRslt_col_005) doDispRslt_col_005_LC(info);
		else if (lc == columnDispRslt_col_006) doDispRslt_col_006_LC(info);
		else if (lc == columnDispRslt_col_007) doDispRslt_col_007_LC(info);
		else if (lc == columnDispRslt_col_008) doDispRslt_col_008_LC(info);
		else if (lc == columnDispRslt_col_009) doDispRslt_col_009_LC(info);
		else if (lc == columnDispRslt_col_010) doDispRslt_col_010_LC(info);
		else if (lc == columnDispRslt_col_011) doDispRslt_col_011_LC(info);
		else if (lc == columnDispRslt_col_012) doDispRslt_col_012_LC(info);
		else if (lc == columnDispRslt_col_013) doDispRslt_col_013_LC(info);
		else if (lc == columnDispRslt_col_014) doDispRslt_col_014_LC(info);
		else if (lc == columnDispRslt_col_015) doDispRslt_col_015_LC(info);
		else if (lc == columnDispRslt_col_016) doDispRslt_col_016_LC(info);
		else if (lc == columnDispRslt_col_017) doDispRslt_col_017_LC(info);
		else if (lc == columnDispRslt_col_018) doDispRslt_col_018_LC(info);
		else if (lc == columnDispRslt_col_019) doDispRslt_col_019_LC(info);
		else if (lc == columnDispRslt_col_020) doDispRslt_col_020_LC(info);
		else if (lc == columnDispRslt_col_021) doDispRslt_col_021_LC(info);
		else if (lc == columnDispRslt_col_022) doDispRslt_col_022_LC(info);
		else if (lc == columnDispRslt_col_023) doDispRslt_col_023_LC(info);
		else if (lc == columnDispRslt_col_024) doDispRslt_col_024_LC(info);
		else if (lc == columnDispRslt_col_025) doDispRslt_col_025_LC(info);
		else if (lc == columnDispRslt_col_026) doDispRslt_col_026_LC(info);
		else if (lc == columnDispRslt_col_027) doDispRslt_col_027_LC(info);
		else if (lc == columnDispRslt_col_028) doDispRslt_col_028_LC(info);
		else if (lc == columnDispRslt_col_029) doDispRslt_col_029_LC(info);
		else if (lc == columnDispRslt_col_030) doDispRslt_col_030_LC(info);
		else if (lc == columnDispRslt_col_031) doDispRslt_col_031_LC(info);
		else if (lc == columnDispRslt_col_032) doDispRslt_col_032_LC(info);
		else if (lc == columnDispRslt_col_033) doDispRslt_col_033_LC(info);
		else if (lc == columnDispRslt_col_034) doDispRslt_col_034_LC(info);
		else if (lc == columnDispRslt_col_035) doDispRslt_col_035_LC(info);
		else if (lc == columnDispRslt_col_036) doDispRslt_col_036_LC(info);
		else if (lc == columnDispRslt_col_037) doDispRslt_col_037_LC(info);
		else if (lc == columnDispRslt_col_038) doDispRslt_col_038_LC(info);
		else if (lc == columnDispRslt_col_039) doDispRslt_col_039_LC(info);
		else if (lc == columnDispRslt_col_040) doDispRslt_col_040_LC(info);
		else if (lc == columnDispRslt_col_041) doDispRslt_col_041_LC(info);
		else if (lc == columnDispRslt_col_042) doDispRslt_col_042_LC(info);
		else if (lc == columnDispRslt_col_043) doDispRslt_col_043_LC(info);
		else if (lc == columnDispRslt_col_044) doDispRslt_col_044_LC(info);
		else if (lc == columnDispRslt_col_045) doDispRslt_col_045_LC(info);
		else if (lc == columnDispRslt_col_046) doDispRslt_col_046_LC(info);
		else if (lc == columnDispRslt_col_047) doDispRslt_col_047_LC(info);
		else if (lc == columnDispRslt_col_048) doDispRslt_col_048_LC(info);
		else if (lc == columnDispRslt_col_049) doDispRslt_col_049_LC(info);
		else if (lc == columnDispRslt_col_050) doDispRslt_col_050_LC(info);
		else if (lc == columnDispRslt_col_051) doDispRslt_col_051_LC(info);
		else if (lc == columnDispRslt_col_052) doDispRslt_col_052_LC(info);
		else if (lc == columnDispRslt_col_053) doDispRslt_col_053_LC(info);
		else if (lc == columnDispRslt_col_054) doDispRslt_col_054_LC(info);
		else if (lc == columnDispRslt_col_055) doDispRslt_col_055_LC(info);
		else if (lc == columnDispRslt_col_056) doDispRslt_col_056_LC(info);
		else if (lc == columnDispRslt_col_057) doDispRslt_col_057_LC(info);
		else if (lc == columnDispRslt_col_058) doDispRslt_col_058_LC(info);
		else if (lc == columnDispRslt_col_059) doDispRslt_col_059_LC(info);
		else if (lc == columnDispRslt_col_060) doDispRslt_col_060_LC(info);
		else if (lc == columnDispRslt_col_061) doDispRslt_col_061_LC(info);
		else if (lc == columnDispRslt_col_062) doDispRslt_col_062_LC(info);
		else if (lc == columnDispRslt_col_063) doDispRslt_col_063_LC(info);
		else if (lc == columnDispRslt_col_064) doDispRslt_col_064_LC(info);
		else if (lc == columnDispRslt_col_065) doDispRslt_col_065_LC(info);
		else if (lc == columnDispRslt_col_066) doDispRslt_col_066_LC(info);
		else if (lc == columnDispRslt_col_067) doDispRslt_col_067_LC(info);
		else if (lc == columnDispRslt_col_068) doDispRslt_col_068_LC(info);
		else if (lc == columnDispRslt_col_069) doDispRslt_col_069_LC(info);
		else if (lc == columnDispRslt_col_070) doDispRslt_col_070_LC(info);
		else if (lc == columnDispRslt_col_071) doDispRslt_col_071_LC(info);
		else if (lc == columnDispRslt_col_072) doDispRslt_col_072_LC(info);
		else if (lc == columnDispRslt_col_073) doDispRslt_col_073_LC(info);
		else if (lc == columnDispRslt_col_074) doDispRslt_col_074_LC(info);
		else if (lc == columnDispRslt_col_075) doDispRslt_col_075_LC(info);
		else if (lc == columnDispRslt_col_076) doDispRslt_col_076_LC(info);
		else if (lc == columnDispRslt_col_077) doDispRslt_col_077_LC(info);
		else if (lc == columnDispRslt_col_078) doDispRslt_col_078_LC(info);
		else if (lc == columnDispRslt_col_079) doDispRslt_col_079_LC(info);
		else if (lc == columnDispRslt_col_080) doDispRslt_col_080_LC(info);
		else if (lc == columnDispRslt_col_081) doDispRslt_col_081_LC(info);
		else if (lc == columnDispRslt_col_082) doDispRslt_col_082_LC(info);
		else if (lc == columnDispRslt_col_083) doDispRslt_col_083_LC(info);
		else if (lc == columnDispRslt_col_084) doDispRslt_col_084_LC(info);
		else if (lc == columnDispRslt_col_085) doDispRslt_col_085_LC(info);
		else if (lc == columnDispRslt_col_086) doDispRslt_col_086_LC(info);
		else if (lc == columnDispRslt_col_087) doDispRslt_col_087_LC(info);
		else if (lc == columnDispRslt_col_088) doDispRslt_col_088_LC(info);
		else if (lc == columnDispRslt_col_089) doDispRslt_col_089_LC(info);
		else if (lc == columnDispRslt_col_090) doDispRslt_col_090_LC(info);
		else if (lc == columnDispRslt_col_091) doDispRslt_col_091_LC(info);
		else if (lc == columnDispRslt_col_092) doDispRslt_col_092_LC(info);
		else if (lc == columnDispRslt_col_093) doDispRslt_col_093_LC(info);
		else if (lc == columnDispRslt_col_094) doDispRslt_col_094_LC(info);
		else if (lc == columnDispRslt_col_095) doDispRslt_col_095_LC(info);
		else if (lc == columnDispRslt_col_096) doDispRslt_col_096_LC(info);
		else if (lc == columnDispRslt_col_097) doDispRslt_col_097_LC(info);
		else if (lc == columnDispRslt_col_098) doDispRslt_col_098_LC(info);
		else if (lc == columnDispRslt_col_099) doDispRslt_col_099_LC(info);
		else if (lc == columnDispRslt_col_100) doDispRslt_col_100_LC(info);
		else if (lc == columnDispRslt_col_101) doDispRslt_col_101_LC(info);
		else if (lc == columnDispRslt_col_102) doDispRslt_col_102_LC(info);
		else if (lc == columnDispRslt_col_103) doDispRslt_col_103_LC(info);
		else if (lc == columnDispRslt_col_104) doDispRslt_col_104_LC(info);
		else if (lc == columnDispRslt_col_105) doDispRslt_col_105_LC(info);
		else if (lc == columnDispRslt_col_106) doDispRslt_col_106_LC(info);
		else if (lc == columnDispRslt_col_107) doDispRslt_col_107_LC(info);
		else if (lc == columnDispRslt_col_108) doDispRslt_col_108_LC(info);
		else if (lc == columnDispRslt_col_109) doDispRslt_col_109_LC(info);
		else if (lc == columnDispRslt_col_110) doDispRslt_col_110_LC(info);
		else if (lc == columnDispRslt_col_111) doDispRslt_col_111_LC(info);
		else if (lc == columnDispRslt_col_112) doDispRslt_col_112_LC(info);
		else if (lc == columnDispRslt_col_113) doDispRslt_col_113_LC(info);
		else if (lc == columnDispRslt_col_114) doDispRslt_col_114_LC(info);
		else if (lc == columnDispRslt_col_115) doDispRslt_col_115_LC(info);
		else if (lc == columnDispRslt_col_116) doDispRslt_col_116_LC(info);
		else if (lc == columnDispRslt_col_117) doDispRslt_col_117_LC(info);
		else if (lc == columnDispRslt_col_118) doDispRslt_col_118_LC(info);
		else if (lc == columnDispRslt_col_119) doDispRslt_col_119_LC(info);
		else if (lc == columnDispRslt_col_120) doDispRslt_col_120_LC(info);
		else if (lc == columnDispRslt_col_121) doDispRslt_col_121_LC(info);
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
	 * [Cnd]パネルの[ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[calc_rec_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_rec_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_rec_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_rec_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_calc_grp_nm_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_area_nm_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_000]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_000_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_001]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_001_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_002]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_002_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_003]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_003_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_004]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_004_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_005]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_005_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_006]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_006_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_007]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_007_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_008]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_008_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_009]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_009_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_010]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_010_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_011]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_011_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_012]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_012_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_013]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_013_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_014]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_014_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_015]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_015_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_016]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_016_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_017]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_017_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_018]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_018_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_019]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_019_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_020]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_020_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_021]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_021_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_022]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_022_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_023]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_023_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_024]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_024_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_025]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_025_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_026]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_026_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_027]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_027_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_028]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_028_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_029]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_029_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_030]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_030_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_031]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_031_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_032]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_032_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_033]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_033_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_034]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_034_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_035]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_035_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_036]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_036_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_037]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_037_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_038]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_038_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_039]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_039_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_040]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_040_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_041]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_041_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_042]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_042_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_043]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_043_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_044]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_044_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_045]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_045_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_046]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_046_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_047]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_047_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_048]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_048_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_049]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_049_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_050]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_050_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_051]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_051_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_052]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_052_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_053]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_053_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_054]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_054_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_055]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_055_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_056]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_056_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_057]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_057_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_058]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_058_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_059]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_059_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_060]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_060_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_061]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_061_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_062]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_062_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_063]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_063_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_064]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_064_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_065]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_065_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_066]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_066_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_067]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_067_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_068]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_068_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_069]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_069_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_070]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_070_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_071]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_071_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_072]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_072_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_073]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_073_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_074]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_074_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_075]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_075_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_076]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_076_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_077]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_077_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_078]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_078_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_079]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_079_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_080]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_080_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_081]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_081_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_082]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_082_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_083]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_083_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_084]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_084_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_085]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_085_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_086]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_086_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_087]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_087_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_088]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_088_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_089]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_089_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_090]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_090_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_091]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_091_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_092]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_092_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_093]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_093_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_094]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_094_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_095]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_095_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_096]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_096_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_097]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_097_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_098]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_098_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_099]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_099_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_100]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_100_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_101]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_101_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_102]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_102_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_103]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_103_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_104]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_104_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_105]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_105_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_106]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_106_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_107]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_107_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_108]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_108_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_109]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_109_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_110]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_110_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_111]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_111_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_112]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_112_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_113]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_113_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_114]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_114_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_115]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_115_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_116]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_116_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_117]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_117_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_118]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_118_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_119]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_119_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_120]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_120_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_121]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_121_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
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
	 * コンボ／リストのリスト[Cnd_mng_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_mng_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
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
	 * コンボ／リストのリスト[Cnd_asst_typ]の作成メソッド
	 */
	public MCList getCnd_asst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAsstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_cd]の作成メソッド
	 */
	public MCList getCnd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cntry_cd]の作成メソッド
	 */
	public MCList getCnd_cntry_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_area_cd]の作成メソッド
	 */
	public MCList getCnd_area_cd(MCRow row, MCEventInfo info){
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
		if (id.equals("MG.MGBFL0440.Srch01")) {
			return new MG_MGBFL0440_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBFL0440_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0440_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0440_Srch01;

		/** コンストラクタ */
		protected MG_MGBFL0440_Srch01Bridge() {
			p_MG_MGBFL0440_Srch01 = new MCParam(PDef.MG_MGBFL0440_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0440_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBF.MGBFP0440.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0440.RsltR.class));

			p_MG_MGBFL0440_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0440_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0440_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0440_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0440_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBF.MGBFP0440.CndR up0() {
			return (mcframe.clientMGBF.MGBFP0440.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBF.MGBFP0440.RsltR> down0() {
			return (MCList<mcframe.clientMGBF.MGBFP0440.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0440_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0440.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0440_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBF.MGBFP0440.RsltR>)p_MG_MGBFL0440_Srch01.getContainerParam().getDownBlock(0));
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