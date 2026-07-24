package mcframe.clientMGBF.MGBFP0470;

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
import mcframe.clientMGBF.MGBFP0470.MGBFP_MlyPurcCostSrch_MC.MG_MGBFL0470_Srch01Caller;

/**
 * 画面"MGBFP_MlyPurcCostSrch"パネルクラスです。<p>
 *
 * 月別に購買原価情報を参照する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFP_MlyPurcCostSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBFP0470";

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
	public MCLabel Cnd_ac_slip_typ_Label = null;
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_slip_typ = null;
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public MCTextField Cnd_ac_slip_typ_nm = null;
	public MCLabel Cnd_ac_rsn_cd_Label = null;
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_rsn_cd = null;
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public MCTextField Cnd_ac_rsn_nm = null;
	/**
	 * No accounting reason 会計理由無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_ac_rsn_flg = null;
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
	 * Calculation group cd. 計算グループＣＤ.<p>
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
	 * Allocation dept. 配賦部門.<p>
	 *
	 */
	public MCCheckBox Cnd_alc_dpt_flg = null;
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCCheckBox Cnd_ac_slip_typ_flg = null;
	/**
	 * Accounting reason 会計理由.<p>
	 *
	 */
	public MCCheckBox Cnd_ac_rsn_flg = null;
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
	public MCTable2<mcframe.clientMGBF.MGBFP0470.DispRsltR> DispRsltTable = null;
	// [DispRslt]ブロックの項目のField定義
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
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_ac_slip_typ = null;
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_ac_slip_typ_nm = null;
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_ac_rsn_cd = null;
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_ac_rsn_nm = null;
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
	public MCColumnConfig columnDispRslt_col_00 = null;
	public MCColumnConfig columnDispRslt_col_01 = null;
	public MCColumnConfig columnDispRslt_col_02 = null;
	public MCColumnConfig columnDispRslt_col_03 = null;
	public MCColumnConfig columnDispRslt_col_04 = null;
	public MCColumnConfig columnDispRslt_col_05 = null;
	public MCColumnConfig columnDispRslt_col_06 = null;
	public MCColumnConfig columnDispRslt_col_07 = null;
	public MCColumnConfig columnDispRslt_col_08 = null;
	public MCColumnConfig columnDispRslt_col_09 = null;
	public MCColumnConfig columnDispRslt_col_10 = null;
	public MCColumnConfig columnDispRslt_col_11 = null;
	public MCColumnConfig columnDispRslt_col_12 = null;
	public MCColumnConfig columnDispRslt_col_13 = null;
	public MCColumnConfig columnDispRslt_col_14 = null;
	public MCColumnConfig columnDispRslt_col_15 = null;
	public MCColumnConfig columnDispRslt_col_16 = null;
	public MCColumnConfig columnDispRslt_col_17 = null;
	public MCColumnConfig columnDispRslt_col_18 = null;
	public MCColumnConfig columnDispRslt_col_19 = null;
	public MCColumnConfig columnDispRslt_col_20 = null;
	public MCColumnConfig columnDispRslt_col_21 = null;
	public MCColumnConfig columnDispRslt_col_22 = null;
	public MCColumnConfig columnDispRslt_col_23 = null;
	public MCColumnConfig columnDispRslt_col_24 = null;
	public MCColumnConfig columnDispRslt_col_25 = null;
	public MCColumnConfig columnDispRslt_col_26 = null;
	public MCColumnConfig columnDispRslt_col_27 = null;
	public MCColumnConfig columnDispRslt_col_28 = null;
	public MCColumnConfig columnDispRslt_col_29 = null;
	public MCColumnConfig columnDispRslt_col_30 = null;
	public MCColumnConfig columnDispRslt_col_31 = null;
	public MCColumnConfig columnDispRslt_col_32 = null;
	public MCColumnConfig columnDispRslt_col_33 = null;
	public MCColumnConfig columnDispRslt_col_34 = null;
	public MCColumnConfig columnDispRslt_col_35 = null;
	public MCColumnConfig columnDispRslt_col_36 = null;
	public MCColumnConfig columnDispRslt_col_37 = null;
	public MCColumnConfig columnDispRslt_col_38 = null;
	public MCColumnConfig columnDispRslt_col_39 = null;
	public MCColumnConfig columnDispRslt_col_40 = null;
	public MCColumnConfig columnDispRslt_col_41 = null;
	public MCColumnConfig columnDispRslt_col_42 = null;
	public MCColumnConfig columnDispRslt_col_43 = null;
	public MCColumnConfig columnDispRslt_col_44 = null;
	public MCColumnConfig columnDispRslt_col_45 = null;
	public MCColumnConfig columnDispRslt_col_46 = null;
	public MCColumnConfig columnDispRslt_col_47 = null;
	public MCColumnConfig columnDispRslt_col_48 = null;
	public MCColumnConfig columnDispRslt_col_49 = null;
	public MCColumnConfig columnDispRslt_col_50 = null;
	public MCColumnConfig columnDispRslt_col_51 = null;
	public MCColumnConfig columnDispRslt_col_52 = null;
	public MCColumnConfig columnDispRslt_col_53 = null;
	public MCColumnConfig columnDispRslt_col_54 = null;
	public MCColumnConfig columnDispRslt_col_55 = null;
	public MCColumnConfig columnDispRslt_col_56 = null;
	public MCColumnConfig columnDispRslt_col_57 = null;
	public MCColumnConfig columnDispRslt_col_58 = null;
	public MCColumnConfig columnDispRslt_col_59 = null;
	public MCColumnConfig columnDispRslt_col_60 = null;
	public MCColumnConfig columnDispRslt_col_61 = null;
	public MCColumnConfig columnDispRslt_col_62 = null;
	public MCColumnConfig columnDispRslt_col_63 = null;
	public MCColumnConfig columnDispRslt_col_64 = null;
	public MCColumnConfig columnDispRslt_col_65 = null;
	public MCColumnConfig columnDispRslt_col_66 = null;
	public MCColumnConfig columnDispRslt_col_67 = null;
	public MCColumnConfig columnDispRslt_col_68 = null;
	public MCColumnConfig columnDispRslt_col_69 = null;
	public MCColumnConfig columnDispRslt_col_70 = null;
	public MCColumnConfig columnDispRslt_col_71 = null;
	public MCColumnConfig columnDispRslt_col_72 = null;
	public MCColumnConfig columnDispRslt_col_73 = null;
	public MCColumnConfig columnDispRslt_col_74 = null;
	public MCColumnConfig columnDispRslt_col_75 = null;
	public MCColumnConfig columnDispRslt_col_76 = null;
	public MCColumnConfig columnDispRslt_col_77 = null;
	public MCColumnConfig columnDispRslt_col_78 = null;
	public MCColumnConfig columnDispRslt_col_79 = null;
	public MCColumnConfig columnDispRslt_col_80 = null;
	public MCColumnConfig columnDispRslt_col_81 = null;
	public MCColumnConfig columnDispRslt_col_82 = null;
	public MCColumnConfig columnDispRslt_col_83 = null;
	public MCColumnConfig columnDispRslt_col_84 = null;
	public MCColumnConfig columnDispRslt_col_85 = null;
	public MCColumnConfig columnDispRslt_col_86 = null;
	public MCColumnConfig columnDispRslt_col_87 = null;
	public MCColumnConfig columnDispRslt_col_88 = null;
	public MCColumnConfig columnDispRslt_col_89 = null;
	public MCColumnConfig columnDispRslt_col_90 = null;
	public MCColumnConfig columnDispRslt_col_91 = null;
	public MCColumnConfig columnDispRslt_col_92 = null;
	public MCColumnConfig columnDispRslt_col_93 = null;
	public MCColumnConfig columnDispRslt_col_94 = null;
	public MCColumnConfig columnDispRslt_col_95 = null;
	public MCColumnConfig columnDispRslt_col_96 = null;
	public MCColumnConfig columnDispRslt_col_97 = null;
	public MCColumnConfig columnDispRslt_col_98 = null;
	public MCColumnConfig columnDispRslt_col_99 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_ttl = null;
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
	
	/** [MG_MGBFL0470_Srch01]のCallerの作成 */
	protected MGBFP_MlyPurcCostSrch_MC.MG_MGBFL0470_Srch01Caller createMG_MGBFL0470_Srch01() {
		MGBFP_MlyPurcCostSrch_MC.MG_MGBFL0470_Srch01Caller<MGBFP_MlyPurcCostSrch, MG_MGBFL0470_Srch01Bridge>
		caller = ((MGBFP_MlyPurcCostSrch_MC)this).new MG_MGBFL0470_Srch01Caller<MGBFP_MlyPurcCostSrch, MG_MGBFL0470_Srch01Bridge>(
					(MGBFP_MlyPurcCostSrch)this, new MG_MGBFL0470_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBFL0470_Srch01]の呼び出し */
	protected void callMG_MGBFL0470_Srch01() {
		MCCaller caller = createMG_MGBFL0470_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0470.CndR aCndR;
	/** [DispRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0470.DispRsltR> aDispRsltL;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0470.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBF.MGBFP0470.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0470.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0470.CndR createCndR() {
		return mcframe.clientMGBF.MGBFP0470.CndR.create();
	}

	/**
	 * コピーによってaDispRsltLを設定します。
	 *
	 * aDispRsltLのインスタンスは変更されません。
	 *
	 * @param dataset DispRsltL
	 */
	public void setDispRsltL(MCList<mcframe.clientMGBF.MGBFP0470.DispRsltR> aList) {
		if (getDispRsltL() != aList) {
			getDispRsltL().setAll(aList);
		}
	}

	/**
	 * [DispRslt]ブロックのコンテナaDispRsltLを返します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0470.DispRsltR> getDispRsltL() {
		return aDispRsltL;
	}

	/**
	 * aDispRsltRを作成します。
	 *
	 * @return DispRsltR
	 */
	public mcframe.clientMGBF.MGBFP0470.DispRsltR createDispRsltR() {
		return mcframe.clientMGBF.MGBFP0470.DispRsltR.create();
	}

	/**
	 * aDispRsltLを作成します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0470.DispRsltR> createDispRsltL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0470.DispRsltR.class);
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
	public void setRsltL(MCList<mcframe.clientMGBF.MGBFP0470.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0470.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBF.MGBFP0470.RsltR createRsltR() {
		return mcframe.clientMGBF.MGBFP0470.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0470.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0470.RsltR.class);
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
	public MGBFP_MlyPurcCostSrch_MC_A() {
		aCndR = createCndR();
		aDispRsltL = createDispRsltL();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBFP_MlyPurcCostSrch_MC_A(String name) {
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
		MGBFP_MlyPurcCostSrch_MC.jbCreateTop((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbCreateFold((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbCreateTab1((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbCreateTab2((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbCreateTab3((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbCreateTab4((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbCreateCnd((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbCreateCnd2((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbCreateCnd3((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbCreateCnd4((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbCreateTtl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbCreateLPnl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbCreateCtrl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbCreateDispRslt((MGBFP_MlyPurcCostSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBFP_MlyPurcCostSrch p) {
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
	protected static void jbCreateCnd2(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 * [Cnd4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd4(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 * [Ttl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTtl(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBFP_MlyPurcCostSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispRslt(MGBFP_MlyPurcCostSrch p) {
		p.DispRslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBF.MGBFP0470.DispRsltR.$itm_p);
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
	
	
	/** [Cnd_ac_slip_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ac_slip_typ_p = null;

	/**
	 * [Cnd_ac_slip_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_slip_typ_ListPutter() {
		if (Cnd_ac_slip_typ_p == null) {
			Cnd_ac_slip_typ_p = createCnd_ac_slip_typ_ListPutter(Cnd_ac_slip_typ, "ac_slip_typ", "ac_slip_typ_nm");

		}
		return Cnd_ac_slip_typ_p;
	}
	
	
	/** [Cnd_ac_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ac_rsn_cd_p = null;

	/**
	 * [Cnd_ac_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_rsn_cd_ListPutter() {
		if (Cnd_ac_rsn_cd_p == null) {
			Cnd_ac_rsn_cd_p = createCnd_ac_rsn_cd_ListPutter(Cnd_ac_rsn_cd, "ac_rsn_cd", "ac_rsn_nm");

		}
		return Cnd_ac_rsn_cd_p;
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
	public static MGBFP_MlyPurcCostSrch create(){
		MGBFP_MlyPurcCostSrch p = new MGBFP_MlyPurcCostSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_MlyPurcCostSrch create(String name){
		MGBFP_MlyPurcCostSrch p = new MGBFP_MlyPurcCostSrch(name);
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
		MGBFP_MlyPurcCostSrch_MC.jbfInitTop((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbfInitFold((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbfInitTab1((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbfInitTab2((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbfInitTab3((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbfInitTab4((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbfInitCnd((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbfInitCnd2((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbfInitCnd3((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbfInitCnd4((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbfInitTtl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbfInitLPnl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbfInitCtrl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbfInitDispRslt((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbInitTop((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbInitFold((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbInitTab1((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbInitTab2((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbInitTab3((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbInitTab4((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbInitCnd((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbInitCnd2((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbInitCnd3((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbInitCnd4((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbInitTtl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbInitLPnl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbInitCtrl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.jbInitDispRslt((MGBFP_MlyPurcCostSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBFP_MlyPurcCostSrch p) {
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
	protected static void jbfInitTab1(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBFP_MlyPurcCostSrch p) {
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
		p.Cnd_ac_slip_typ_Label = p.beansFactory.createLabel("Cnd.ac_slip_typ_Label");
		p.Cnd_ac_slip_typ = p.beansFactory.createTextComboBox("Cnd.ac_slip_typ");
		p.Cnd_ac_slip_typ.setLabel(p.Cnd_ac_slip_typ_Label);
		p.Cnd_ac_slip_typ_nm = p.beansFactory.createTextField("Cnd.ac_slip_typ_nm");
		p.Cnd_ac_rsn_cd_Label = p.beansFactory.createLabel("Cnd.ac_rsn_cd_Label");
		p.Cnd_ac_rsn_cd = p.beansFactory.createTextComboBox("Cnd.ac_rsn_cd");
		p.Cnd_ac_rsn_cd.setLabel(p.Cnd_ac_rsn_cd_Label);
		p.Cnd_ac_rsn_nm = p.beansFactory.createTextField("Cnd.ac_rsn_nm");
		p.Cnd_no_ac_rsn_flg = p.beansFactory.createCheckBox("Cnd.no_ac_rsn_flg");
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_cntry_cd_Label = p.beansFactory.createLabel("Cnd.cntry_cd_Label");
		p.Cnd_cntry_cd = p.beansFactory.createTextComboBox("Cnd.cntry_cd");
		p.Cnd_cntry_cd.setLabel(p.Cnd_cntry_cd_Label);
		p.Cnd_cntry_nm = p.beansFactory.createTextField("Cnd.cntry_nm");
		p.Cnd_area_cd_Label = p.beansFactory.createLabel("Cnd.area_cd_Label");
		p.Cnd_area_cd = p.beansFactory.createTextComboBox("Cnd.area_cd");
		p.Cnd_area_cd.setLabel(p.Cnd_area_cd_Label);
		p.Cnd_area_nm = p.beansFactory.createTextField("Cnd.area_nm");
		p.Cnd_alc_dpt_cd_Label = p.beansFactory.createLabel("Cnd.alc_dpt_cd_Label");
		p.Cnd_alc_dpt_cd = p.beansFactory.createTextComboBox("Cnd.alc_dpt_cd");
		p.Cnd_alc_dpt_cd.setLabel(p.Cnd_alc_dpt_cd_Label);
		p.Cnd_alc_dpt_nm = p.beansFactory.createTextField("Cnd.alc_dpt_nm");
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
		p.Cnd_alc_dpt_flg = p.beansFactory.createCheckBox("Cnd.alc_dpt_flg");
		p.Cnd_ac_slip_typ_flg = p.beansFactory.createCheckBox("Cnd.ac_slip_typ_flg");
		p.Cnd_ac_rsn_flg = p.beansFactory.createCheckBox("Cnd.ac_rsn_flg");
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
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd4(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.Cnd4Panel = p.beansFactory.createPanel("Cnd4");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTtl(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.TtlPanel = p.beansFactory.createPanel("Ttl");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispRslt(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.DispRsltPanel = p.beansFactory.createPanel("DispRslt");
		p.DispRsltScrollPane = p.beansFactory.createScrollPane("DispRslt.scroll");
		p.createDispRsltTable();
		// ブロックの項目の初期化
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
		p.columnDispRslt_alc_dpt_cd = p.beansFactory.createTableColumn("DispRslt.alc_dpt_cd", MCColumnType.TEXT);
		p.columnDispRslt_alc_dpt_nm = p.beansFactory.createTableColumn("DispRslt.alc_dpt_nm", MCColumnType.TEXT);
		p.columnDispRslt_ac_slip_typ = p.beansFactory.createTableColumn("DispRslt.ac_slip_typ", MCColumnType.TEXT);
		p.columnDispRslt_ac_slip_typ_nm = p.beansFactory.createTableColumn("DispRslt.ac_slip_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_ac_rsn_cd = p.beansFactory.createTableColumn("DispRslt.ac_rsn_cd", MCColumnType.TEXT);
		p.columnDispRslt_ac_rsn_nm = p.beansFactory.createTableColumn("DispRslt.ac_rsn_nm", MCColumnType.TEXT);
		p.columnDispRslt_asst_typ = p.beansFactory.createTableColumn("DispRslt.asst_typ", MCColumnType.TEXT);
		p.columnDispRslt_asst_typ_nm = p.beansFactory.createTableColumn("DispRslt.asst_typ_nm", MCColumnType.TEXT);
		p.columnDispRslt_unit_cd = p.beansFactory.createTableColumn("DispRslt.unit_cd", MCColumnType.TEXT);
		p.columnDispRslt_unit_nm = p.beansFactory.createTableColumn("DispRslt.unit_nm", MCColumnType.TEXT);
		p.columnDispRslt_dec_place = p.beansFactory.createTableColumn("DispRslt.dec_place", MCColumnType.NUMBER);
		p.columnDispRslt_elm_no = p.beansFactory.createTableColumn("DispRslt.elm_no", MCColumnType.NUMBER);
		p.columnDispRslt_elm = p.beansFactory.createTableColumn("DispRslt.elm", MCColumnType.TEXT);
		p.columnDispRslt_elm_nm = p.beansFactory.createTableColumn("DispRslt.elm_nm", MCColumnType.TEXT);
		p.columnDispRslt_col_00 = p.beansFactory.createTableColumn("DispRslt.col_00", MCColumnType.NUMBER);
		p.columnDispRslt_col_01 = p.beansFactory.createTableColumn("DispRslt.col_01", MCColumnType.NUMBER);
		p.columnDispRslt_col_02 = p.beansFactory.createTableColumn("DispRslt.col_02", MCColumnType.NUMBER);
		p.columnDispRslt_col_03 = p.beansFactory.createTableColumn("DispRslt.col_03", MCColumnType.NUMBER);
		p.columnDispRslt_col_04 = p.beansFactory.createTableColumn("DispRslt.col_04", MCColumnType.NUMBER);
		p.columnDispRslt_col_05 = p.beansFactory.createTableColumn("DispRslt.col_05", MCColumnType.NUMBER);
		p.columnDispRslt_col_06 = p.beansFactory.createTableColumn("DispRslt.col_06", MCColumnType.NUMBER);
		p.columnDispRslt_col_07 = p.beansFactory.createTableColumn("DispRslt.col_07", MCColumnType.NUMBER);
		p.columnDispRslt_col_08 = p.beansFactory.createTableColumn("DispRslt.col_08", MCColumnType.NUMBER);
		p.columnDispRslt_col_09 = p.beansFactory.createTableColumn("DispRslt.col_09", MCColumnType.NUMBER);
		p.columnDispRslt_col_10 = p.beansFactory.createTableColumn("DispRslt.col_10", MCColumnType.NUMBER);
		p.columnDispRslt_col_11 = p.beansFactory.createTableColumn("DispRslt.col_11", MCColumnType.NUMBER);
		p.columnDispRslt_col_12 = p.beansFactory.createTableColumn("DispRslt.col_12", MCColumnType.NUMBER);
		p.columnDispRslt_col_13 = p.beansFactory.createTableColumn("DispRslt.col_13", MCColumnType.NUMBER);
		p.columnDispRslt_col_14 = p.beansFactory.createTableColumn("DispRslt.col_14", MCColumnType.NUMBER);
		p.columnDispRslt_col_15 = p.beansFactory.createTableColumn("DispRslt.col_15", MCColumnType.NUMBER);
		p.columnDispRslt_col_16 = p.beansFactory.createTableColumn("DispRslt.col_16", MCColumnType.NUMBER);
		p.columnDispRslt_col_17 = p.beansFactory.createTableColumn("DispRslt.col_17", MCColumnType.NUMBER);
		p.columnDispRslt_col_18 = p.beansFactory.createTableColumn("DispRslt.col_18", MCColumnType.NUMBER);
		p.columnDispRslt_col_19 = p.beansFactory.createTableColumn("DispRslt.col_19", MCColumnType.NUMBER);
		p.columnDispRslt_col_20 = p.beansFactory.createTableColumn("DispRslt.col_20", MCColumnType.NUMBER);
		p.columnDispRslt_col_21 = p.beansFactory.createTableColumn("DispRslt.col_21", MCColumnType.NUMBER);
		p.columnDispRslt_col_22 = p.beansFactory.createTableColumn("DispRslt.col_22", MCColumnType.NUMBER);
		p.columnDispRslt_col_23 = p.beansFactory.createTableColumn("DispRslt.col_23", MCColumnType.NUMBER);
		p.columnDispRslt_col_24 = p.beansFactory.createTableColumn("DispRslt.col_24", MCColumnType.NUMBER);
		p.columnDispRslt_col_25 = p.beansFactory.createTableColumn("DispRslt.col_25", MCColumnType.NUMBER);
		p.columnDispRslt_col_26 = p.beansFactory.createTableColumn("DispRslt.col_26", MCColumnType.NUMBER);
		p.columnDispRslt_col_27 = p.beansFactory.createTableColumn("DispRslt.col_27", MCColumnType.NUMBER);
		p.columnDispRslt_col_28 = p.beansFactory.createTableColumn("DispRslt.col_28", MCColumnType.NUMBER);
		p.columnDispRslt_col_29 = p.beansFactory.createTableColumn("DispRslt.col_29", MCColumnType.NUMBER);
		p.columnDispRslt_col_30 = p.beansFactory.createTableColumn("DispRslt.col_30", MCColumnType.NUMBER);
		p.columnDispRslt_col_31 = p.beansFactory.createTableColumn("DispRslt.col_31", MCColumnType.NUMBER);
		p.columnDispRslt_col_32 = p.beansFactory.createTableColumn("DispRslt.col_32", MCColumnType.NUMBER);
		p.columnDispRslt_col_33 = p.beansFactory.createTableColumn("DispRslt.col_33", MCColumnType.NUMBER);
		p.columnDispRslt_col_34 = p.beansFactory.createTableColumn("DispRslt.col_34", MCColumnType.NUMBER);
		p.columnDispRslt_col_35 = p.beansFactory.createTableColumn("DispRslt.col_35", MCColumnType.NUMBER);
		p.columnDispRslt_col_36 = p.beansFactory.createTableColumn("DispRslt.col_36", MCColumnType.NUMBER);
		p.columnDispRslt_col_37 = p.beansFactory.createTableColumn("DispRslt.col_37", MCColumnType.NUMBER);
		p.columnDispRslt_col_38 = p.beansFactory.createTableColumn("DispRslt.col_38", MCColumnType.NUMBER);
		p.columnDispRslt_col_39 = p.beansFactory.createTableColumn("DispRslt.col_39", MCColumnType.NUMBER);
		p.columnDispRslt_col_40 = p.beansFactory.createTableColumn("DispRslt.col_40", MCColumnType.NUMBER);
		p.columnDispRslt_col_41 = p.beansFactory.createTableColumn("DispRslt.col_41", MCColumnType.NUMBER);
		p.columnDispRslt_col_42 = p.beansFactory.createTableColumn("DispRslt.col_42", MCColumnType.NUMBER);
		p.columnDispRslt_col_43 = p.beansFactory.createTableColumn("DispRslt.col_43", MCColumnType.NUMBER);
		p.columnDispRslt_col_44 = p.beansFactory.createTableColumn("DispRslt.col_44", MCColumnType.NUMBER);
		p.columnDispRslt_col_45 = p.beansFactory.createTableColumn("DispRslt.col_45", MCColumnType.NUMBER);
		p.columnDispRslt_col_46 = p.beansFactory.createTableColumn("DispRslt.col_46", MCColumnType.NUMBER);
		p.columnDispRslt_col_47 = p.beansFactory.createTableColumn("DispRslt.col_47", MCColumnType.NUMBER);
		p.columnDispRslt_col_48 = p.beansFactory.createTableColumn("DispRslt.col_48", MCColumnType.NUMBER);
		p.columnDispRslt_col_49 = p.beansFactory.createTableColumn("DispRslt.col_49", MCColumnType.NUMBER);
		p.columnDispRslt_col_50 = p.beansFactory.createTableColumn("DispRslt.col_50", MCColumnType.NUMBER);
		p.columnDispRslt_col_51 = p.beansFactory.createTableColumn("DispRslt.col_51", MCColumnType.NUMBER);
		p.columnDispRslt_col_52 = p.beansFactory.createTableColumn("DispRslt.col_52", MCColumnType.NUMBER);
		p.columnDispRslt_col_53 = p.beansFactory.createTableColumn("DispRslt.col_53", MCColumnType.NUMBER);
		p.columnDispRslt_col_54 = p.beansFactory.createTableColumn("DispRslt.col_54", MCColumnType.NUMBER);
		p.columnDispRslt_col_55 = p.beansFactory.createTableColumn("DispRslt.col_55", MCColumnType.NUMBER);
		p.columnDispRslt_col_56 = p.beansFactory.createTableColumn("DispRslt.col_56", MCColumnType.NUMBER);
		p.columnDispRslt_col_57 = p.beansFactory.createTableColumn("DispRslt.col_57", MCColumnType.NUMBER);
		p.columnDispRslt_col_58 = p.beansFactory.createTableColumn("DispRslt.col_58", MCColumnType.NUMBER);
		p.columnDispRslt_col_59 = p.beansFactory.createTableColumn("DispRslt.col_59", MCColumnType.NUMBER);
		p.columnDispRslt_col_60 = p.beansFactory.createTableColumn("DispRslt.col_60", MCColumnType.NUMBER);
		p.columnDispRslt_col_61 = p.beansFactory.createTableColumn("DispRslt.col_61", MCColumnType.NUMBER);
		p.columnDispRslt_col_62 = p.beansFactory.createTableColumn("DispRslt.col_62", MCColumnType.NUMBER);
		p.columnDispRslt_col_63 = p.beansFactory.createTableColumn("DispRslt.col_63", MCColumnType.NUMBER);
		p.columnDispRslt_col_64 = p.beansFactory.createTableColumn("DispRslt.col_64", MCColumnType.NUMBER);
		p.columnDispRslt_col_65 = p.beansFactory.createTableColumn("DispRslt.col_65", MCColumnType.NUMBER);
		p.columnDispRslt_col_66 = p.beansFactory.createTableColumn("DispRslt.col_66", MCColumnType.NUMBER);
		p.columnDispRslt_col_67 = p.beansFactory.createTableColumn("DispRslt.col_67", MCColumnType.NUMBER);
		p.columnDispRslt_col_68 = p.beansFactory.createTableColumn("DispRslt.col_68", MCColumnType.NUMBER);
		p.columnDispRslt_col_69 = p.beansFactory.createTableColumn("DispRslt.col_69", MCColumnType.NUMBER);
		p.columnDispRslt_col_70 = p.beansFactory.createTableColumn("DispRslt.col_70", MCColumnType.NUMBER);
		p.columnDispRslt_col_71 = p.beansFactory.createTableColumn("DispRslt.col_71", MCColumnType.NUMBER);
		p.columnDispRslt_col_72 = p.beansFactory.createTableColumn("DispRslt.col_72", MCColumnType.NUMBER);
		p.columnDispRslt_col_73 = p.beansFactory.createTableColumn("DispRslt.col_73", MCColumnType.NUMBER);
		p.columnDispRslt_col_74 = p.beansFactory.createTableColumn("DispRslt.col_74", MCColumnType.NUMBER);
		p.columnDispRslt_col_75 = p.beansFactory.createTableColumn("DispRslt.col_75", MCColumnType.NUMBER);
		p.columnDispRslt_col_76 = p.beansFactory.createTableColumn("DispRslt.col_76", MCColumnType.NUMBER);
		p.columnDispRslt_col_77 = p.beansFactory.createTableColumn("DispRslt.col_77", MCColumnType.NUMBER);
		p.columnDispRslt_col_78 = p.beansFactory.createTableColumn("DispRslt.col_78", MCColumnType.NUMBER);
		p.columnDispRslt_col_79 = p.beansFactory.createTableColumn("DispRslt.col_79", MCColumnType.NUMBER);
		p.columnDispRslt_col_80 = p.beansFactory.createTableColumn("DispRslt.col_80", MCColumnType.NUMBER);
		p.columnDispRslt_col_81 = p.beansFactory.createTableColumn("DispRslt.col_81", MCColumnType.NUMBER);
		p.columnDispRslt_col_82 = p.beansFactory.createTableColumn("DispRslt.col_82", MCColumnType.NUMBER);
		p.columnDispRslt_col_83 = p.beansFactory.createTableColumn("DispRslt.col_83", MCColumnType.NUMBER);
		p.columnDispRslt_col_84 = p.beansFactory.createTableColumn("DispRslt.col_84", MCColumnType.NUMBER);
		p.columnDispRslt_col_85 = p.beansFactory.createTableColumn("DispRslt.col_85", MCColumnType.NUMBER);
		p.columnDispRslt_col_86 = p.beansFactory.createTableColumn("DispRslt.col_86", MCColumnType.NUMBER);
		p.columnDispRslt_col_87 = p.beansFactory.createTableColumn("DispRslt.col_87", MCColumnType.NUMBER);
		p.columnDispRslt_col_88 = p.beansFactory.createTableColumn("DispRslt.col_88", MCColumnType.NUMBER);
		p.columnDispRslt_col_89 = p.beansFactory.createTableColumn("DispRslt.col_89", MCColumnType.NUMBER);
		p.columnDispRslt_col_90 = p.beansFactory.createTableColumn("DispRslt.col_90", MCColumnType.NUMBER);
		p.columnDispRslt_col_91 = p.beansFactory.createTableColumn("DispRslt.col_91", MCColumnType.NUMBER);
		p.columnDispRslt_col_92 = p.beansFactory.createTableColumn("DispRslt.col_92", MCColumnType.NUMBER);
		p.columnDispRslt_col_93 = p.beansFactory.createTableColumn("DispRslt.col_93", MCColumnType.NUMBER);
		p.columnDispRslt_col_94 = p.beansFactory.createTableColumn("DispRslt.col_94", MCColumnType.NUMBER);
		p.columnDispRslt_col_95 = p.beansFactory.createTableColumn("DispRslt.col_95", MCColumnType.NUMBER);
		p.columnDispRslt_col_96 = p.beansFactory.createTableColumn("DispRslt.col_96", MCColumnType.NUMBER);
		p.columnDispRslt_col_97 = p.beansFactory.createTableColumn("DispRslt.col_97", MCColumnType.NUMBER);
		p.columnDispRslt_col_98 = p.beansFactory.createTableColumn("DispRslt.col_98", MCColumnType.NUMBER);
		p.columnDispRslt_col_99 = p.beansFactory.createTableColumn("DispRslt.col_99", MCColumnType.NUMBER);
		p.columnDispRslt_ttl = p.beansFactory.createTableColumn("DispRslt.ttl", MCColumnType.NUMBER);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.Cnd4Panel);
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
	protected static void jbInitFold(MGBFP_MlyPurcCostSrch p) {
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
	protected static void jbInitTab1(MGBFP_MlyPurcCostSrch p) {
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
	protected static void jbInitTab2(MGBFP_MlyPurcCostSrch p) {
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
	protected static void jbInitTab3(MGBFP_MlyPurcCostSrch p) {
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
	protected static void jbInitTab4(MGBFP_MlyPurcCostSrch p) {
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
	protected static void jbInitCnd(MGBFP_MlyPurcCostSrch p) {
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
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_ym_fr);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ym_fr);
		p.Cnd_ym_fr.setNextBeans(p.Cnd_ym_to);
		p.Cnd_ym_fr.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.ym_fr_META);
		p.Cnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ym_to_Label);
		p.CndPanel.add(p.Cnd_ym_to);
		p.Cnd_ym_to.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ym_to.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.ym_to_META);
		p.Cnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_mng_dpt_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_mng_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mng_dpt_cd, true);
		p.Cnd_mng_dpt_cd.setLinkBeans(p.Cnd_mng_dpt_nm);
		p.CndPanel.add(p.Cnd_mng_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_mng_dpt_cd);
		p.Cnd_mng_dpt_cd.setNextBeans(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.mng_dpt_cd_META);
		p.CndPanel.add(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_mng_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.mng_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_mng_dpt_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_jnl_cd, true);
		p.Cnd_itm_jnl_cd.setLinkBeans(p.Cnd_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setNextBeans(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_jnl_nm_META);
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
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno1);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.sublot_no_META);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno1_Label);
		p.CndPanel.add(p.Cnd_sno1);
		p.Cnd_sno1.setNextBeans(p.Cnd_sno2);
		p.Cnd_sno1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.sno1_META);
		p.setPluralValueEnable(p.Cnd_sno1, true);
		p.CndPanel.add(p.Cnd_sno2_Label);
		p.CndPanel.add(p.Cnd_sno2);
		p.Cnd_sno2.setNextBeans(p.Cnd_sno3);
		p.Cnd_sno2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.sno2_META);
		p.setPluralValueEnable(p.Cnd_sno2, true);
		p.CndPanel.add(p.Cnd_sno3_Label);
		p.CndPanel.add(p.Cnd_sno3);
		p.Cnd_sno3.setNextBeans(p.Cnd_sno4);
		p.Cnd_sno3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.sno3_META);
		p.setPluralValueEnable(p.Cnd_sno3, true);
		p.CndPanel.add(p.Cnd_sno4_Label);
		p.CndPanel.add(p.Cnd_sno4);
		p.Cnd_sno4.setNextBeans(p.Cnd_asst_typ);
		p.Cnd_sno4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.sno4_META);
		p.setPluralValueEnable(p.Cnd_sno4, true);
		p.Cnd_asst_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asst_typ, true);
		p.Cnd_asst_typ.setLinkBeans(p.Cnd_asst_typ_nm);
		p.CndPanel.add(p.Cnd_asst_typ_Label);
		p.CndPanel.add(p.Cnd_asst_typ);
		p.Cnd_asst_typ.setNextBeans(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.asst_typ_META);
		p.CndPanel.add(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ_nm.setNextBeans(p.Cnd_ac_slip_typ);
		p.Cnd_asst_typ_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.asst_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_asst_typ_nm, true);
		p.Cnd_ac_slip_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_slip_typ, true);
		p.Cnd_ac_slip_typ.setLinkBeans(p.Cnd_ac_slip_typ_nm);
		p.CndPanel.add(p.Cnd_ac_slip_typ_Label);
		p.CndPanel.add(p.Cnd_ac_slip_typ);
		p.Cnd_ac_slip_typ.setNextBeans(p.Cnd_ac_slip_typ_nm);
		p.Cnd_ac_slip_typ.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.ac_slip_typ_META);
		p.CndPanel.add(p.Cnd_ac_slip_typ_nm);
		p.Cnd_ac_slip_typ_nm.setNextBeans(p.Cnd_ac_rsn_cd);
		p.Cnd_ac_slip_typ_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.ac_slip_typ_nm_META);
		p.Cnd_ac_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_rsn_cd, true);
		p.Cnd_ac_rsn_cd.setLinkBeans(p.Cnd_ac_rsn_nm);
		p.CndPanel.add(p.Cnd_ac_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_ac_rsn_cd);
		p.Cnd_ac_rsn_cd.setNextBeans(p.Cnd_ac_rsn_nm);
		p.Cnd_ac_rsn_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.ac_rsn_cd_META);
		p.CndPanel.add(p.Cnd_ac_rsn_nm);
		p.Cnd_ac_rsn_nm.setNextBeans(p.Cnd_no_ac_rsn_flg);
		p.Cnd_ac_rsn_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.ac_rsn_nm_META);
		p.setPluralValueEnable(p.Cnd_ac_rsn_nm, true);
		p.CndPanel.add(p.Cnd_no_ac_rsn_flg);
		p.Cnd_no_ac_rsn_flg.setNextBeans(p.Cnd_bp_cd);
		p.Cnd_no_ac_rsn_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.no_ac_rsn_flg_META);
		p.CndPanel.add(p.Cnd_bp_cd_Label);
		p.CndPanel.add(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_cd, true);
		p.CndPanel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_cntry_cd);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_nm, true);
		p.Cnd_cntry_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cntry_cd, true);
		p.Cnd_cntry_cd.setLinkBeans(p.Cnd_cntry_nm);
		p.CndPanel.add(p.Cnd_cntry_cd_Label);
		p.CndPanel.add(p.Cnd_cntry_cd);
		p.Cnd_cntry_cd.setNextBeans(p.Cnd_cntry_nm);
		p.Cnd_cntry_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.cntry_cd_META);
		p.CndPanel.add(p.Cnd_cntry_nm);
		p.Cnd_cntry_nm.setNextBeans(p.Cnd_area_cd);
		p.Cnd_cntry_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.cntry_nm_META);
		p.setPluralValueEnable(p.Cnd_cntry_nm, true);
		p.Cnd_area_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_area_cd, true);
		p.Cnd_area_cd.setLinkBeans(p.Cnd_area_nm);
		p.CndPanel.add(p.Cnd_area_cd_Label);
		p.CndPanel.add(p.Cnd_area_cd);
		p.Cnd_area_cd.setNextBeans(p.Cnd_area_nm);
		p.Cnd_area_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.area_cd_META);
		p.CndPanel.add(p.Cnd_area_nm);
		p.Cnd_area_nm.setNextBeans(p.Cnd_alc_dpt_cd);
		p.Cnd_area_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.area_nm_META);
		p.setPluralValueEnable(p.Cnd_area_nm, true);
		p.Cnd_alc_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_dpt_cd, true);
		p.Cnd_alc_dpt_cd.setLinkBeans(p.Cnd_alc_dpt_nm);
		p.CndPanel.add(p.Cnd_alc_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_alc_dpt_cd);
		p.Cnd_alc_dpt_cd.setNextBeans(p.Cnd_alc_dpt_nm);
		p.Cnd_alc_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.alc_dpt_cd_META);
		p.CndPanel.add(p.Cnd_alc_dpt_nm);
		p.Cnd_alc_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.alc_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_alc_dpt_nm, true);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
		p.Cnd_bp_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd1, true);
		p.Cnd_bp_grp_cd1.setLinkBeans(p.Cnd_bp_grp_nm1);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd1_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd1);
		p.Cnd3Panel.setLastBeans(p.Cnd_bp_grp_cd1);
		p.Cnd_bp_grp_cd1.setNextBeans(p.Cnd_bp_grp_nm1);
		p.Cnd_bp_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_cd1_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm1);
		p.Cnd_bp_grp_nm1.setNextBeans(p.Cnd_bp_grp_cd2);
		p.Cnd_bp_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm1, true);
		p.Cnd_bp_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd2, true);
		p.Cnd_bp_grp_cd2.setLinkBeans(p.Cnd_bp_grp_nm2);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd2_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd2);
		p.Cnd_bp_grp_cd2.setNextBeans(p.Cnd_bp_grp_nm2);
		p.Cnd_bp_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_cd2_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm2);
		p.Cnd_bp_grp_nm2.setNextBeans(p.Cnd_bp_grp_cd3);
		p.Cnd_bp_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm2, true);
		p.Cnd_bp_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd3, true);
		p.Cnd_bp_grp_cd3.setLinkBeans(p.Cnd_bp_grp_nm3);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd3_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd3);
		p.Cnd_bp_grp_cd3.setNextBeans(p.Cnd_bp_grp_nm3);
		p.Cnd_bp_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_cd3_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm3);
		p.Cnd_bp_grp_nm3.setNextBeans(p.Cnd_bp_grp_cd4);
		p.Cnd_bp_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm3, true);
		p.Cnd_bp_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd4, true);
		p.Cnd_bp_grp_cd4.setLinkBeans(p.Cnd_bp_grp_nm4);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd4_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd4);
		p.Cnd_bp_grp_cd4.setNextBeans(p.Cnd_bp_grp_nm4);
		p.Cnd_bp_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_cd4_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm4);
		p.Cnd_bp_grp_nm4.setNextBeans(p.Cnd_bp_grp_cd5);
		p.Cnd_bp_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm4, true);
		p.Cnd_bp_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd5, true);
		p.Cnd_bp_grp_cd5.setLinkBeans(p.Cnd_bp_grp_nm5);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd5_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd5);
		p.Cnd_bp_grp_cd5.setNextBeans(p.Cnd_bp_grp_nm5);
		p.Cnd_bp_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_cd5_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm5);
		p.Cnd_bp_grp_nm5.setNextBeans(p.Cnd_bp_grp_cd6);
		p.Cnd_bp_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm5, true);
		p.Cnd_bp_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd6, true);
		p.Cnd_bp_grp_cd6.setLinkBeans(p.Cnd_bp_grp_nm6);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd6_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd6);
		p.Cnd_bp_grp_cd6.setNextBeans(p.Cnd_bp_grp_nm6);
		p.Cnd_bp_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_cd6_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm6);
		p.Cnd_bp_grp_nm6.setNextBeans(p.Cnd_bp_grp_cd7);
		p.Cnd_bp_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm6, true);
		p.Cnd_bp_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd7, true);
		p.Cnd_bp_grp_cd7.setLinkBeans(p.Cnd_bp_grp_nm7);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd7_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd7);
		p.Cnd_bp_grp_cd7.setNextBeans(p.Cnd_bp_grp_nm7);
		p.Cnd_bp_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_cd7_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm7);
		p.Cnd_bp_grp_nm7.setNextBeans(p.Cnd_bp_grp_cd8);
		p.Cnd_bp_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm7, true);
		p.Cnd_bp_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd8, true);
		p.Cnd_bp_grp_cd8.setLinkBeans(p.Cnd_bp_grp_nm8);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd8_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd8);
		p.Cnd_bp_grp_cd8.setNextBeans(p.Cnd_bp_grp_nm8);
		p.Cnd_bp_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_cd8_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm8);
		p.Cnd_bp_grp_nm8.setNextBeans(p.Cnd_bp_grp_cd9);
		p.Cnd_bp_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm8, true);
		p.Cnd_bp_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd9, true);
		p.Cnd_bp_grp_cd9.setLinkBeans(p.Cnd_bp_grp_nm9);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd9_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd9);
		p.Cnd_bp_grp_cd9.setNextBeans(p.Cnd_bp_grp_nm9);
		p.Cnd_bp_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_cd9_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm9);
		p.Cnd_bp_grp_nm9.setNextBeans(p.Cnd_bp_grp_cd10);
		p.Cnd_bp_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm9, true);
		p.Cnd_bp_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd10, true);
		p.Cnd_bp_grp_cd10.setLinkBeans(p.Cnd_bp_grp_nm10);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd10_Label);
		p.Cnd3Panel.add(p.Cnd_bp_grp_cd10);
		p.Cnd_bp_grp_cd10.setNextBeans(p.Cnd_bp_grp_nm10);
		p.Cnd_bp_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_cd10_META);
		p.Cnd3Panel.add(p.Cnd_bp_grp_nm10);
		p.Cnd_bp_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm10, true);
		p.TtlPanel.add(p.Cnd_calc_grp_flg);
		p.TtlPanel.setLastBeans(p.Cnd_calc_grp_flg);
		p.Cnd_calc_grp_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_calc_grp_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.calc_grp_flg_META);
		p.TtlPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setNextBeans(p.Cnd_mng_dpt_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.wg_flg_META);
		p.TtlPanel.add(p.Cnd_mng_dpt_flg);
		p.Cnd_mng_dpt_flg.setNextBeans(p.Cnd_itm_flg);
		p.Cnd_mng_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.mng_dpt_flg_META);
		p.TtlPanel.add(p.Cnd_itm_flg);
		p.Cnd_itm_flg.setNextBeans(p.Cnd_itm_typ_flg);
		p.Cnd_itm_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_flg_META);
		p.TtlPanel.add(p.Cnd_itm_typ_flg);
		p.Cnd_itm_typ_flg.setNextBeans(p.Cnd_itm_typ_d_flg);
		p.Cnd_itm_typ_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_typ_flg_META);
		p.TtlPanel.add(p.Cnd_itm_typ_d_flg);
		p.Cnd_itm_typ_d_flg.setNextBeans(p.Cnd_itm_jnl_flg);
		p.Cnd_itm_typ_d_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_typ_d_flg_META);
		p.TtlPanel.add(p.Cnd_itm_jnl_flg);
		p.Cnd_itm_jnl_flg.setNextBeans(p.Cnd_lot_flg);
		p.Cnd_itm_jnl_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_jnl_flg_META);
		p.TtlPanel.add(p.Cnd_lot_flg);
		p.Cnd_lot_flg.setNextBeans(p.Cnd_sublot_flg);
		p.Cnd_lot_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.lot_flg_META);
		p.TtlPanel.add(p.Cnd_sublot_flg);
		p.Cnd_sublot_flg.setNextBeans(p.Cnd_sno1_flg);
		p.Cnd_sublot_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.sublot_flg_META);
		p.TtlPanel.add(p.Cnd_sno1_flg);
		p.Cnd_sno1_flg.setNextBeans(p.Cnd_sno2_flg);
		p.Cnd_sno1_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.sno1_flg_META);
		p.TtlPanel.add(p.Cnd_sno2_flg);
		p.Cnd_sno2_flg.setNextBeans(p.Cnd_sno3_flg);
		p.Cnd_sno2_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.sno2_flg_META);
		p.TtlPanel.add(p.Cnd_sno3_flg);
		p.Cnd_sno3_flg.setNextBeans(p.Cnd_sno4_flg);
		p.Cnd_sno3_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.sno3_flg_META);
		p.TtlPanel.add(p.Cnd_sno4_flg);
		p.Cnd_sno4_flg.setNextBeans(p.Cnd_asst_flg);
		p.Cnd_sno4_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.sno4_flg_META);
		p.TtlPanel.add(p.Cnd_asst_flg);
		p.Cnd_asst_flg.setNextBeans(p.Cnd_bp_flg);
		p.Cnd_asst_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.asst_flg_META);
		p.TtlPanel.add(p.Cnd_bp_flg);
		p.Cnd_bp_flg.setNextBeans(p.Cnd_cntry_flg);
		p.Cnd_bp_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_flg_META);
		p.TtlPanel.add(p.Cnd_cntry_flg);
		p.Cnd_cntry_flg.setNextBeans(p.Cnd_area_flg);
		p.Cnd_cntry_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.cntry_flg_META);
		p.TtlPanel.add(p.Cnd_area_flg);
		p.Cnd_area_flg.setNextBeans(p.Cnd_alc_dpt_flg);
		p.Cnd_area_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.area_flg_META);
		p.TtlPanel.add(p.Cnd_alc_dpt_flg);
		p.Cnd_alc_dpt_flg.setNextBeans(p.Cnd_ac_slip_typ_flg);
		p.Cnd_alc_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.alc_dpt_flg_META);
		p.TtlPanel.add(p.Cnd_ac_slip_typ_flg);
		p.Cnd_ac_slip_typ_flg.setNextBeans(p.Cnd_ac_rsn_flg);
		p.Cnd_ac_slip_typ_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.ac_slip_typ_flg_META);
		p.TtlPanel.add(p.Cnd_ac_rsn_flg);
		p.Cnd_ac_rsn_flg.setNextBeans(p.Cnd_itm_grp_flg1);
		p.Cnd_ac_rsn_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.ac_rsn_flg_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg1);
		p.Cnd_itm_grp_flg1.setNextBeans(p.Cnd_itm_grp_flg2);
		p.Cnd_itm_grp_flg1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_flg1_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg2);
		p.Cnd_itm_grp_flg2.setNextBeans(p.Cnd_itm_grp_flg3);
		p.Cnd_itm_grp_flg2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_flg2_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg3);
		p.Cnd_itm_grp_flg3.setNextBeans(p.Cnd_itm_grp_flg4);
		p.Cnd_itm_grp_flg3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_flg3_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg4);
		p.Cnd_itm_grp_flg4.setNextBeans(p.Cnd_itm_grp_flg5);
		p.Cnd_itm_grp_flg4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_flg4_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg5);
		p.Cnd_itm_grp_flg5.setNextBeans(p.Cnd_itm_grp_flg6);
		p.Cnd_itm_grp_flg5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_flg5_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg6);
		p.Cnd_itm_grp_flg6.setNextBeans(p.Cnd_itm_grp_flg7);
		p.Cnd_itm_grp_flg6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_flg6_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg7);
		p.Cnd_itm_grp_flg7.setNextBeans(p.Cnd_itm_grp_flg8);
		p.Cnd_itm_grp_flg7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_flg7_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg8);
		p.Cnd_itm_grp_flg8.setNextBeans(p.Cnd_itm_grp_flg9);
		p.Cnd_itm_grp_flg8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_flg8_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg9);
		p.Cnd_itm_grp_flg9.setNextBeans(p.Cnd_itm_grp_flg10);
		p.Cnd_itm_grp_flg9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_flg9_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg10);
		p.Cnd_itm_grp_flg10.setNextBeans(p.Cnd_bp_grp_flg1);
		p.Cnd_itm_grp_flg10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.itm_grp_flg10_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg1);
		p.Cnd_bp_grp_flg1.setNextBeans(p.Cnd_bp_grp_flg2);
		p.Cnd_bp_grp_flg1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_flg1_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg2);
		p.Cnd_bp_grp_flg2.setNextBeans(p.Cnd_bp_grp_flg3);
		p.Cnd_bp_grp_flg2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_flg2_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg3);
		p.Cnd_bp_grp_flg3.setNextBeans(p.Cnd_bp_grp_flg4);
		p.Cnd_bp_grp_flg3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_flg3_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg4);
		p.Cnd_bp_grp_flg4.setNextBeans(p.Cnd_bp_grp_flg5);
		p.Cnd_bp_grp_flg4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_flg4_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg5);
		p.Cnd_bp_grp_flg5.setNextBeans(p.Cnd_bp_grp_flg6);
		p.Cnd_bp_grp_flg5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_flg5_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg6);
		p.Cnd_bp_grp_flg6.setNextBeans(p.Cnd_bp_grp_flg7);
		p.Cnd_bp_grp_flg6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_flg6_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg7);
		p.Cnd_bp_grp_flg7.setNextBeans(p.Cnd_bp_grp_flg8);
		p.Cnd_bp_grp_flg7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_flg7_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg8);
		p.Cnd_bp_grp_flg8.setNextBeans(p.Cnd_bp_grp_flg9);
		p.Cnd_bp_grp_flg8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_flg8_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg9);
		p.Cnd_bp_grp_flg9.setNextBeans(p.Cnd_bp_grp_flg10);
		p.Cnd_bp_grp_flg9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_flg9_META);
		p.TtlPanel.add(p.Cnd_bp_grp_flg10);
		p.Cnd_bp_grp_flg10.setNextBeans(p.Cnd_select_all);
		p.Cnd_bp_grp_flg10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.bp_grp_flg10_META);
		p.Cnd_select_all.setIcon("SELECT_ALL");
		p.Cnd_select_all.setFunctionKey(MCFunctionKey.F13);
		p.TtlPanel.add(p.Cnd_select_all);
		p.Cnd_select_all.setNextBeans(p.Cnd_deselect_all);
		p.Cnd_deselect_all.setIcon("DESELECT_ALL");
		p.Cnd_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.TtlPanel.add(p.Cnd_deselect_all);
		p.LPnlPanel.add(p.Cnd_disp_key);
		p.LPnlPanel.setLastBeans(p.Cnd_disp_key);
		p.Cnd_disp_key.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0470.CndR.disp_key_META);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd4(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.add(p.Cnd4Panel);
		p.Cnd4Panel.setNextBeans(p.DispRsltPanel);
		p.Cnd4Panel.setValueCheck(false);
		p.Cnd4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTtl(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.TtlPanel.setValueCheck(false);
		p.TtlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MGBFP_MlyPurcCostSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBFP_MlyPurcCostSrch p) {
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
	protected static void jbInitDispRslt(MGBFP_MlyPurcCostSrch p) {
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
		MGBFP_MlyPurcCostSrch_MC.mcInitTop((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.mcInitFold((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.mcInitTab1((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.mcInitTab2((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.mcInitTab3((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.mcInitTab4((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.mcInitCnd((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.mcInitCnd2((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.mcInitCnd3((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.mcInitCnd4((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.mcInitTtl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.mcInitLPnl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.mcInitCtrl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.mcInitDispRslt((MGBFP_MlyPurcCostSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBFP_MlyPurcCostSrch_MC.statusInitSRCH_Top((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitSRCH_Fold((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitSRCH_Tab1((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitSRCH_Tab2((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitSRCH_Tab3((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitSRCH_Tab4((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitSRCH_Cnd((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitSRCH_Cnd2((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitSRCH_Cnd3((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitSRCH_Cnd4((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitSRCH_Ttl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitSRCH_LPnl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitSRCH_Ctrl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitSRCH_DispRslt((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitSRCH_Rslt((MGBFP_MlyPurcCostSrch)this);

		// [REF]ステータスのモードの設定
		MGBFP_MlyPurcCostSrch_MC.statusInitREF_Top((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitREF_Fold((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitREF_Tab1((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitREF_Tab2((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitREF_Tab3((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitREF_Tab4((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitREF_Cnd((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitREF_Cnd2((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitREF_Cnd3((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitREF_Cnd4((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitREF_Ttl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitREF_LPnl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitREF_Ctrl((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitREF_DispRslt((MGBFP_MlyPurcCostSrch)this);
		MGBFP_MlyPurcCostSrch_MC.statusInitREF_Rslt((MGBFP_MlyPurcCostSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBFP_MlyPurcCostSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBFP_MlyPurcCostSrch p) {
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
		p.Cnd_ac_slip_typ.setListListener(p);
		p.Cnd_ac_slip_typ.addAllListener(p);
		p.Cnd_ac_slip_typ_nm.setListListener(p);
		p.Cnd_ac_slip_typ_nm.addAllListener(p);
		p.Cnd_ac_rsn_cd.setListListener(p);
		p.Cnd_ac_rsn_cd.addAllListener(p);
		p.Cnd_ac_rsn_nm.setListListener(p);
		p.Cnd_ac_rsn_nm.addAllListener(p);
		p.Cnd_no_ac_rsn_flg.addAllListener(p);
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_cntry_cd.setListListener(p);
		p.Cnd_cntry_cd.addAllListener(p);
		p.Cnd_cntry_nm.setListListener(p);
		p.Cnd_cntry_nm.addAllListener(p);
		p.Cnd_area_cd.setListListener(p);
		p.Cnd_area_cd.addAllListener(p);
		p.Cnd_area_nm.setListListener(p);
		p.Cnd_area_nm.addAllListener(p);
		p.Cnd_alc_dpt_cd.setListListener(p);
		p.Cnd_alc_dpt_cd.addAllListener(p);
		p.Cnd_alc_dpt_nm.setListListener(p);
		p.Cnd_alc_dpt_nm.addAllListener(p);
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
		p.Cnd_alc_dpt_flg.addAllListener(p);
		p.Cnd_ac_slip_typ_flg.addAllListener(p);
		p.Cnd_ac_rsn_flg.addAllListener(p);
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
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 *  [Cnd4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd4(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 *  [Ttl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTtl(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MGBFP_MlyPurcCostSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBFP_MlyPurcCostSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispRslt(MGBFP_MlyPurcCostSrch p) {
		p.DispRsltTable.addAllListener(p);
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
		p.columnDispRslt_alc_dpt_cd.addAllListener(p);
		p.columnDispRslt_alc_dpt_cd.setListListener(p);
		p.columnDispRslt_alc_dpt_nm.addAllListener(p);
		p.columnDispRslt_alc_dpt_nm.setListListener(p);
		p.columnDispRslt_ac_slip_typ.addAllListener(p);
		p.columnDispRslt_ac_slip_typ.setListListener(p);
		p.columnDispRslt_ac_slip_typ_nm.addAllListener(p);
		p.columnDispRslt_ac_slip_typ_nm.setListListener(p);
		p.columnDispRslt_ac_rsn_cd.addAllListener(p);
		p.columnDispRslt_ac_rsn_cd.setListListener(p);
		p.columnDispRslt_ac_rsn_nm.addAllListener(p);
		p.columnDispRslt_ac_rsn_nm.setListListener(p);
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
		p.columnDispRslt_col_00.addAllListener(p);
		p.columnDispRslt_col_00.setListListener(p);
		p.columnDispRslt_col_01.addAllListener(p);
		p.columnDispRslt_col_01.setListListener(p);
		p.columnDispRslt_col_02.addAllListener(p);
		p.columnDispRslt_col_02.setListListener(p);
		p.columnDispRslt_col_03.addAllListener(p);
		p.columnDispRslt_col_03.setListListener(p);
		p.columnDispRslt_col_04.addAllListener(p);
		p.columnDispRslt_col_04.setListListener(p);
		p.columnDispRslt_col_05.addAllListener(p);
		p.columnDispRslt_col_05.setListListener(p);
		p.columnDispRslt_col_06.addAllListener(p);
		p.columnDispRslt_col_06.setListListener(p);
		p.columnDispRslt_col_07.addAllListener(p);
		p.columnDispRslt_col_07.setListListener(p);
		p.columnDispRslt_col_08.addAllListener(p);
		p.columnDispRslt_col_08.setListListener(p);
		p.columnDispRslt_col_09.addAllListener(p);
		p.columnDispRslt_col_09.setListListener(p);
		p.columnDispRslt_col_10.addAllListener(p);
		p.columnDispRslt_col_10.setListListener(p);
		p.columnDispRslt_col_11.addAllListener(p);
		p.columnDispRslt_col_11.setListListener(p);
		p.columnDispRslt_col_12.addAllListener(p);
		p.columnDispRslt_col_12.setListListener(p);
		p.columnDispRslt_col_13.addAllListener(p);
		p.columnDispRslt_col_13.setListListener(p);
		p.columnDispRslt_col_14.addAllListener(p);
		p.columnDispRslt_col_14.setListListener(p);
		p.columnDispRslt_col_15.addAllListener(p);
		p.columnDispRslt_col_15.setListListener(p);
		p.columnDispRslt_col_16.addAllListener(p);
		p.columnDispRslt_col_16.setListListener(p);
		p.columnDispRslt_col_17.addAllListener(p);
		p.columnDispRslt_col_17.setListListener(p);
		p.columnDispRslt_col_18.addAllListener(p);
		p.columnDispRslt_col_18.setListListener(p);
		p.columnDispRslt_col_19.addAllListener(p);
		p.columnDispRslt_col_19.setListListener(p);
		p.columnDispRslt_col_20.addAllListener(p);
		p.columnDispRslt_col_20.setListListener(p);
		p.columnDispRslt_col_21.addAllListener(p);
		p.columnDispRslt_col_21.setListListener(p);
		p.columnDispRslt_col_22.addAllListener(p);
		p.columnDispRslt_col_22.setListListener(p);
		p.columnDispRslt_col_23.addAllListener(p);
		p.columnDispRslt_col_23.setListListener(p);
		p.columnDispRslt_col_24.addAllListener(p);
		p.columnDispRslt_col_24.setListListener(p);
		p.columnDispRslt_col_25.addAllListener(p);
		p.columnDispRslt_col_25.setListListener(p);
		p.columnDispRslt_col_26.addAllListener(p);
		p.columnDispRslt_col_26.setListListener(p);
		p.columnDispRslt_col_27.addAllListener(p);
		p.columnDispRslt_col_27.setListListener(p);
		p.columnDispRslt_col_28.addAllListener(p);
		p.columnDispRslt_col_28.setListListener(p);
		p.columnDispRslt_col_29.addAllListener(p);
		p.columnDispRslt_col_29.setListListener(p);
		p.columnDispRslt_col_30.addAllListener(p);
		p.columnDispRslt_col_30.setListListener(p);
		p.columnDispRslt_col_31.addAllListener(p);
		p.columnDispRslt_col_31.setListListener(p);
		p.columnDispRslt_col_32.addAllListener(p);
		p.columnDispRslt_col_32.setListListener(p);
		p.columnDispRslt_col_33.addAllListener(p);
		p.columnDispRslt_col_33.setListListener(p);
		p.columnDispRslt_col_34.addAllListener(p);
		p.columnDispRslt_col_34.setListListener(p);
		p.columnDispRslt_col_35.addAllListener(p);
		p.columnDispRslt_col_35.setListListener(p);
		p.columnDispRslt_col_36.addAllListener(p);
		p.columnDispRslt_col_36.setListListener(p);
		p.columnDispRslt_col_37.addAllListener(p);
		p.columnDispRslt_col_37.setListListener(p);
		p.columnDispRslt_col_38.addAllListener(p);
		p.columnDispRslt_col_38.setListListener(p);
		p.columnDispRslt_col_39.addAllListener(p);
		p.columnDispRslt_col_39.setListListener(p);
		p.columnDispRslt_col_40.addAllListener(p);
		p.columnDispRslt_col_40.setListListener(p);
		p.columnDispRslt_col_41.addAllListener(p);
		p.columnDispRslt_col_41.setListListener(p);
		p.columnDispRslt_col_42.addAllListener(p);
		p.columnDispRslt_col_42.setListListener(p);
		p.columnDispRslt_col_43.addAllListener(p);
		p.columnDispRslt_col_43.setListListener(p);
		p.columnDispRslt_col_44.addAllListener(p);
		p.columnDispRslt_col_44.setListListener(p);
		p.columnDispRslt_col_45.addAllListener(p);
		p.columnDispRslt_col_45.setListListener(p);
		p.columnDispRslt_col_46.addAllListener(p);
		p.columnDispRslt_col_46.setListListener(p);
		p.columnDispRslt_col_47.addAllListener(p);
		p.columnDispRslt_col_47.setListListener(p);
		p.columnDispRslt_col_48.addAllListener(p);
		p.columnDispRslt_col_48.setListListener(p);
		p.columnDispRslt_col_49.addAllListener(p);
		p.columnDispRslt_col_49.setListListener(p);
		p.columnDispRslt_col_50.addAllListener(p);
		p.columnDispRslt_col_50.setListListener(p);
		p.columnDispRslt_col_51.addAllListener(p);
		p.columnDispRslt_col_51.setListListener(p);
		p.columnDispRslt_col_52.addAllListener(p);
		p.columnDispRslt_col_52.setListListener(p);
		p.columnDispRslt_col_53.addAllListener(p);
		p.columnDispRslt_col_53.setListListener(p);
		p.columnDispRslt_col_54.addAllListener(p);
		p.columnDispRslt_col_54.setListListener(p);
		p.columnDispRslt_col_55.addAllListener(p);
		p.columnDispRslt_col_55.setListListener(p);
		p.columnDispRslt_col_56.addAllListener(p);
		p.columnDispRslt_col_56.setListListener(p);
		p.columnDispRslt_col_57.addAllListener(p);
		p.columnDispRslt_col_57.setListListener(p);
		p.columnDispRslt_col_58.addAllListener(p);
		p.columnDispRslt_col_58.setListListener(p);
		p.columnDispRslt_col_59.addAllListener(p);
		p.columnDispRslt_col_59.setListListener(p);
		p.columnDispRslt_col_60.addAllListener(p);
		p.columnDispRslt_col_60.setListListener(p);
		p.columnDispRslt_col_61.addAllListener(p);
		p.columnDispRslt_col_61.setListListener(p);
		p.columnDispRslt_col_62.addAllListener(p);
		p.columnDispRslt_col_62.setListListener(p);
		p.columnDispRslt_col_63.addAllListener(p);
		p.columnDispRslt_col_63.setListListener(p);
		p.columnDispRslt_col_64.addAllListener(p);
		p.columnDispRslt_col_64.setListListener(p);
		p.columnDispRslt_col_65.addAllListener(p);
		p.columnDispRslt_col_65.setListListener(p);
		p.columnDispRslt_col_66.addAllListener(p);
		p.columnDispRslt_col_66.setListListener(p);
		p.columnDispRslt_col_67.addAllListener(p);
		p.columnDispRslt_col_67.setListListener(p);
		p.columnDispRslt_col_68.addAllListener(p);
		p.columnDispRslt_col_68.setListListener(p);
		p.columnDispRslt_col_69.addAllListener(p);
		p.columnDispRslt_col_69.setListListener(p);
		p.columnDispRslt_col_70.addAllListener(p);
		p.columnDispRslt_col_70.setListListener(p);
		p.columnDispRslt_col_71.addAllListener(p);
		p.columnDispRslt_col_71.setListListener(p);
		p.columnDispRslt_col_72.addAllListener(p);
		p.columnDispRslt_col_72.setListListener(p);
		p.columnDispRslt_col_73.addAllListener(p);
		p.columnDispRslt_col_73.setListListener(p);
		p.columnDispRslt_col_74.addAllListener(p);
		p.columnDispRslt_col_74.setListListener(p);
		p.columnDispRslt_col_75.addAllListener(p);
		p.columnDispRslt_col_75.setListListener(p);
		p.columnDispRslt_col_76.addAllListener(p);
		p.columnDispRslt_col_76.setListListener(p);
		p.columnDispRslt_col_77.addAllListener(p);
		p.columnDispRslt_col_77.setListListener(p);
		p.columnDispRslt_col_78.addAllListener(p);
		p.columnDispRslt_col_78.setListListener(p);
		p.columnDispRslt_col_79.addAllListener(p);
		p.columnDispRslt_col_79.setListListener(p);
		p.columnDispRslt_col_80.addAllListener(p);
		p.columnDispRslt_col_80.setListListener(p);
		p.columnDispRslt_col_81.addAllListener(p);
		p.columnDispRslt_col_81.setListListener(p);
		p.columnDispRslt_col_82.addAllListener(p);
		p.columnDispRslt_col_82.setListListener(p);
		p.columnDispRslt_col_83.addAllListener(p);
		p.columnDispRslt_col_83.setListListener(p);
		p.columnDispRslt_col_84.addAllListener(p);
		p.columnDispRslt_col_84.setListListener(p);
		p.columnDispRslt_col_85.addAllListener(p);
		p.columnDispRslt_col_85.setListListener(p);
		p.columnDispRslt_col_86.addAllListener(p);
		p.columnDispRslt_col_86.setListListener(p);
		p.columnDispRslt_col_87.addAllListener(p);
		p.columnDispRslt_col_87.setListListener(p);
		p.columnDispRslt_col_88.addAllListener(p);
		p.columnDispRslt_col_88.setListListener(p);
		p.columnDispRslt_col_89.addAllListener(p);
		p.columnDispRslt_col_89.setListListener(p);
		p.columnDispRslt_col_90.addAllListener(p);
		p.columnDispRslt_col_90.setListListener(p);
		p.columnDispRslt_col_91.addAllListener(p);
		p.columnDispRslt_col_91.setListListener(p);
		p.columnDispRslt_col_92.addAllListener(p);
		p.columnDispRslt_col_92.setListListener(p);
		p.columnDispRslt_col_93.addAllListener(p);
		p.columnDispRslt_col_93.setListListener(p);
		p.columnDispRslt_col_94.addAllListener(p);
		p.columnDispRslt_col_94.setListListener(p);
		p.columnDispRslt_col_95.addAllListener(p);
		p.columnDispRslt_col_95.setListListener(p);
		p.columnDispRslt_col_96.addAllListener(p);
		p.columnDispRslt_col_96.setListListener(p);
		p.columnDispRslt_col_97.addAllListener(p);
		p.columnDispRslt_col_97.setListListener(p);
		p.columnDispRslt_col_98.addAllListener(p);
		p.columnDispRslt_col_98.setListListener(p);
		p.columnDispRslt_col_99.addAllListener(p);
		p.columnDispRslt_col_99.setListListener(p);
		p.columnDispRslt_ttl.addAllListener(p);
		p.columnDispRslt_ttl.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab4(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBFP_MlyPurcCostSrch p){
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, SRCH, MCMode.REQUIRED);
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
		p.Cnd_ac_slip_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ac_rsn_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_rsn_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_ac_rsn_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alc_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
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
		p.Cnd_alc_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ac_slip_typ_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ac_rsn_flg.putMode(p, SRCH, MCMode.REQUIRED);
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

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd4(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ttl(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [SRCH]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DispRslt(MGBFP_MlyPurcCostSrch p){
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
		p.columnDispRslt_alc_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_alc_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_ac_slip_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_ac_slip_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_ac_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_ac_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispRslt_elm_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispRslt_elm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDispRslt_elm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_00.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_01.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_02.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_03.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_04.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_05.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_06.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_07.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_08.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_09.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_11.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_12.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_13.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_14.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_15.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_16.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_17.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_18.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_19.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_20.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_21.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_22.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_23.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_24.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_25.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_26.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_27.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_28.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_29.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_30.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_31.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_32.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_33.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_34.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_35.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_36.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_37.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_38.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_39.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_40.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_41.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_42.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_43.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_44.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_45.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_46.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_47.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_48.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_49.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_50.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_51.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_52.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_53.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_54.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_55.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_56.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_57.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_58.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_59.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_60.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_61.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_62.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_63.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_64.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_65.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_66.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_67.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_68.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_69.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_70.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_71.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_72.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_73.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_74.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_75.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_76.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_77.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_78.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_79.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_80.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_81.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_82.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_83.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_84.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_85.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_86.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_87.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_88.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_89.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_90.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_91.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_92.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_93.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_94.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_95.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_96.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_97.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_98.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_col_99.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispRslt_ttl.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBFP_MlyPurcCostSrch p){
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, REF, MCMode.REQUIRED);
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
		p.Cnd_ac_slip_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ac_rsn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_rsn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_ac_rsn_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_dpt_nm.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_alc_dpt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ac_slip_typ_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ac_rsn_flg.putMode(p, REF, MCMode.REQUIRED);
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

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd4(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [REF]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ttl(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBFP_MlyPurcCostSrch p){

	}

	/**
	 * [REF]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispRslt(MGBFP_MlyPurcCostSrch p){
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
		p.columnDispRslt_alc_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_alc_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_ac_slip_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_ac_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_ac_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispRslt_elm_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispRslt_elm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDispRslt_elm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_00.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_01.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_02.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_03.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_04.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_05.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_06.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_07.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_08.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_09.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_11.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_12.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_13.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_14.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_15.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_16.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_17.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_18.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_19.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_20.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_21.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_22.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_23.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_24.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_25.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_26.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_27.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_28.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_29.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_30.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_31.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_32.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_33.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_34.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_35.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_36.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_37.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_38.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_39.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_40.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_41.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_42.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_43.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_44.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_45.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_46.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_47.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_48.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_49.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_50.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_51.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_52.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_53.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_54.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_55.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_56.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_57.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_58.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_59.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_60.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_61.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_62.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_63.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_64.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_65.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_66.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_67.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_68.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_69.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_70.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_71.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_72.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_73.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_74.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_75.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_76.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_77.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_78.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_79.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_80.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_81.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_82.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_83.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_84.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_85.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_86.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_87.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_88.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_89.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_90.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_91.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_92.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_93.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_94.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_95.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_96.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_97.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_98.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_col_99.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispRslt_ttl.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBFP_MlyPurcCostSrch p){

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
		MGBFP_MlyPurcCostSrch_MC.setTableConfigDispRslt((MGBFP_MlyPurcCostSrch)this);
	}

	/**
	 * [DispRslt]ブロックのTableの設定
	 */
	protected static void setTableConfigDispRslt(MGBFP_MlyPurcCostSrch p) {
		p.columnDispRslt_calc_grp_cd.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.calc_grp_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_calc_grp_cd);
		p.columnDispRslt_calc_grp_nm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.calc_grp_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_calc_grp_nm);
		p.columnDispRslt_wg_cd.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.wg_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_cd);
		p.columnDispRslt_wg_nm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.wg_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_nm);
		p.columnDispRslt_mng_dpt_cd.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.mng_dpt_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_cd);
		p.columnDispRslt_mng_dpt_nm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.mng_dpt_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_nm);
		p.DispRsltTable.addTable(p.DispRslt_itm_p_PPanel.ItmTable);
		p.columnDispRslt_itm_typ.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ);
		p.columnDispRslt_itm_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_nm);
		p.columnDispRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_typ_d_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_cd);
		p.columnDispRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_typ_d_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_typ_d_nm);
		p.columnDispRslt_itm_jnl_cd.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_jnl_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_jnl_cd);
		p.columnDispRslt_itm_jnl_nm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_jnl_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_jnl_nm);
		p.columnDispRslt_itm_grp_cd1.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_cd1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd1);
		p.columnDispRslt_itm_grp_nm1.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_nm1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm1);
		p.columnDispRslt_itm_grp_cd2.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_cd2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd2);
		p.columnDispRslt_itm_grp_nm2.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_nm2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm2);
		p.columnDispRslt_itm_grp_cd3.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_cd3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd3);
		p.columnDispRslt_itm_grp_nm3.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_nm3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm3);
		p.columnDispRslt_itm_grp_cd4.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_cd4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd4);
		p.columnDispRslt_itm_grp_nm4.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_nm4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm4);
		p.columnDispRslt_itm_grp_cd5.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_cd5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd5);
		p.columnDispRslt_itm_grp_nm5.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_nm5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm5);
		p.columnDispRslt_itm_grp_cd6.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_cd6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd6);
		p.columnDispRslt_itm_grp_nm6.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_nm6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm6);
		p.columnDispRslt_itm_grp_cd7.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_cd7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd7);
		p.columnDispRslt_itm_grp_nm7.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_nm7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm7);
		p.columnDispRslt_itm_grp_cd8.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_cd8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd8);
		p.columnDispRslt_itm_grp_nm8.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_nm8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm8);
		p.columnDispRslt_itm_grp_cd9.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_cd9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd9);
		p.columnDispRslt_itm_grp_nm9.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_nm9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm9);
		p.columnDispRslt_itm_grp_cd10.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_cd10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_cd10);
		p.columnDispRslt_itm_grp_nm10.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.itm_grp_nm10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_itm_grp_nm10);
		p.columnDispRslt_lot_no.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.lot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_lot_no);
		p.columnDispRslt_sublot_no.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.sublot_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sublot_no);
		p.columnDispRslt_sno1.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.sno1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno1);
		p.columnDispRslt_sno2.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.sno2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno2);
		p.columnDispRslt_sno3.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.sno3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno3);
		p.columnDispRslt_sno4.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.sno4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_sno4);
		p.columnDispRslt_bp_cd.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_cd);
		p.columnDispRslt_bp_nm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_nm);
		p.columnDispRslt_bp_grp_cd1.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_cd1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd1);
		p.columnDispRslt_bp_grp_nm1.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_nm1_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm1);
		p.columnDispRslt_bp_grp_cd2.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_cd2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd2);
		p.columnDispRslt_bp_grp_nm2.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_nm2_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm2);
		p.columnDispRslt_bp_grp_cd3.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_cd3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd3);
		p.columnDispRslt_bp_grp_nm3.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_nm3_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm3);
		p.columnDispRslt_bp_grp_cd4.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_cd4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd4);
		p.columnDispRslt_bp_grp_nm4.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_nm4_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm4);
		p.columnDispRslt_bp_grp_cd5.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_cd5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd5);
		p.columnDispRslt_bp_grp_nm5.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_nm5_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm5);
		p.columnDispRslt_bp_grp_cd6.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_cd6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd6);
		p.columnDispRslt_bp_grp_nm6.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_nm6_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm6);
		p.columnDispRslt_bp_grp_cd7.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_cd7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd7);
		p.columnDispRslt_bp_grp_nm7.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_nm7_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm7);
		p.columnDispRslt_bp_grp_cd8.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_cd8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd8);
		p.columnDispRslt_bp_grp_nm8.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_nm8_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm8);
		p.columnDispRslt_bp_grp_cd9.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_cd9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd9);
		p.columnDispRslt_bp_grp_nm9.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_nm9_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm9);
		p.columnDispRslt_bp_grp_cd10.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_cd10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_cd10);
		p.columnDispRslt_bp_grp_nm10.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.bp_grp_nm10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_bp_grp_nm10);
		p.columnDispRslt_cntry_cd.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.cntry_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cntry_cd);
		p.columnDispRslt_cntry_nm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.cntry_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_cntry_nm);
		p.columnDispRslt_area_cd.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.area_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_area_cd);
		p.columnDispRslt_area_nm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.area_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_area_nm);
		p.columnDispRslt_alc_dpt_cd.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.alc_dpt_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_alc_dpt_cd);
		p.columnDispRslt_alc_dpt_nm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.alc_dpt_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_alc_dpt_nm);
		p.columnDispRslt_ac_slip_typ.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.ac_slip_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_ac_slip_typ);
		p.columnDispRslt_ac_slip_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.ac_slip_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_ac_slip_typ_nm);
		p.columnDispRslt_ac_rsn_cd.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.ac_rsn_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_ac_rsn_cd);
		p.columnDispRslt_ac_rsn_nm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.ac_rsn_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_ac_rsn_nm);
		p.columnDispRslt_asst_typ.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.asst_typ_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_asst_typ);
		p.columnDispRslt_asst_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.asst_typ_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_asst_typ_nm);
		p.columnDispRslt_unit_cd.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.unit_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_unit_cd);
		p.columnDispRslt_unit_nm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.unit_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_unit_nm);
		p.columnDispRslt_dec_place.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.dec_place_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_dec_place);
		p.columnDispRslt_elm_no.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.elm_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm_no);
		p.columnDispRslt_elm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.elm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm);
		p.columnDispRslt_elm_nm.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.elm_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm_nm);
		p.columnDispRslt_col_00.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_00_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_00);
		p.columnDispRslt_col_01.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_01_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_01);
		p.columnDispRslt_col_02.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_02_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_02);
		p.columnDispRslt_col_03.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_03_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_03);
		p.columnDispRslt_col_04.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_04_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_04);
		p.columnDispRslt_col_05.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_05_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_05);
		p.columnDispRslt_col_06.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_06_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_06);
		p.columnDispRslt_col_07.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_07_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_07);
		p.columnDispRslt_col_08.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_08_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_08);
		p.columnDispRslt_col_09.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_09_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_09);
		p.columnDispRslt_col_10.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_10_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_10);
		p.columnDispRslt_col_11.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_11_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_11);
		p.columnDispRslt_col_12.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_12_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_12);
		p.columnDispRslt_col_13.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_13_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_13);
		p.columnDispRslt_col_14.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_14_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_14);
		p.columnDispRslt_col_15.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_15_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_15);
		p.columnDispRslt_col_16.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_16_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_16);
		p.columnDispRslt_col_17.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_17_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_17);
		p.columnDispRslt_col_18.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_18_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_18);
		p.columnDispRslt_col_19.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_19_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_19);
		p.columnDispRslt_col_20.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_20_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_20);
		p.columnDispRslt_col_21.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_21_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_21);
		p.columnDispRslt_col_22.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_22_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_22);
		p.columnDispRslt_col_23.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_23_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_23);
		p.columnDispRslt_col_24.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_24_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_24);
		p.columnDispRslt_col_25.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_25_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_25);
		p.columnDispRslt_col_26.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_26_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_26);
		p.columnDispRslt_col_27.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_27_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_27);
		p.columnDispRslt_col_28.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_28_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_28);
		p.columnDispRslt_col_29.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_29_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_29);
		p.columnDispRslt_col_30.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_30_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_30);
		p.columnDispRslt_col_31.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_31_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_31);
		p.columnDispRslt_col_32.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_32_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_32);
		p.columnDispRslt_col_33.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_33_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_33);
		p.columnDispRslt_col_34.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_34_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_34);
		p.columnDispRslt_col_35.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_35_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_35);
		p.columnDispRslt_col_36.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_36_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_36);
		p.columnDispRslt_col_37.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_37_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_37);
		p.columnDispRslt_col_38.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_38_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_38);
		p.columnDispRslt_col_39.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_39_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_39);
		p.columnDispRslt_col_40.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_40_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_40);
		p.columnDispRslt_col_41.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_41_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_41);
		p.columnDispRslt_col_42.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_42_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_42);
		p.columnDispRslt_col_43.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_43_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_43);
		p.columnDispRslt_col_44.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_44_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_44);
		p.columnDispRslt_col_45.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_45_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_45);
		p.columnDispRslt_col_46.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_46_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_46);
		p.columnDispRslt_col_47.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_47_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_47);
		p.columnDispRslt_col_48.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_48_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_48);
		p.columnDispRslt_col_49.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_49_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_49);
		p.columnDispRslt_col_50.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_50_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_50);
		p.columnDispRslt_col_51.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_51_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_51);
		p.columnDispRslt_col_52.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_52_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_52);
		p.columnDispRslt_col_53.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_53_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_53);
		p.columnDispRslt_col_54.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_54_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_54);
		p.columnDispRslt_col_55.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_55_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_55);
		p.columnDispRslt_col_56.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_56_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_56);
		p.columnDispRslt_col_57.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_57_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_57);
		p.columnDispRslt_col_58.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_58_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_58);
		p.columnDispRslt_col_59.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_59_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_59);
		p.columnDispRslt_col_60.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_60_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_60);
		p.columnDispRslt_col_61.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_61_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_61);
		p.columnDispRslt_col_62.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_62_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_62);
		p.columnDispRslt_col_63.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_63_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_63);
		p.columnDispRslt_col_64.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_64_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_64);
		p.columnDispRslt_col_65.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_65_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_65);
		p.columnDispRslt_col_66.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_66_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_66);
		p.columnDispRslt_col_67.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_67_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_67);
		p.columnDispRslt_col_68.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_68_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_68);
		p.columnDispRslt_col_69.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_69_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_69);
		p.columnDispRslt_col_70.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_70_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_70);
		p.columnDispRslt_col_71.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_71_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_71);
		p.columnDispRslt_col_72.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_72_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_72);
		p.columnDispRslt_col_73.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_73_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_73);
		p.columnDispRslt_col_74.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_74_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_74);
		p.columnDispRslt_col_75.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_75_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_75);
		p.columnDispRslt_col_76.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_76_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_76);
		p.columnDispRslt_col_77.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_77_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_77);
		p.columnDispRslt_col_78.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_78_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_78);
		p.columnDispRslt_col_79.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_79_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_79);
		p.columnDispRslt_col_80.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_80_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_80);
		p.columnDispRslt_col_81.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_81_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_81);
		p.columnDispRslt_col_82.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_82_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_82);
		p.columnDispRslt_col_83.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_83_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_83);
		p.columnDispRslt_col_84.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_84_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_84);
		p.columnDispRslt_col_85.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_85_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_85);
		p.columnDispRslt_col_86.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_86_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_86);
		p.columnDispRslt_col_87.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_87_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_87);
		p.columnDispRslt_col_88.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_88_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_88);
		p.columnDispRslt_col_89.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_89_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_89);
		p.columnDispRslt_col_90.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_90_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_90);
		p.columnDispRslt_col_91.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_91_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_91);
		p.columnDispRslt_col_92.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_92_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_92);
		p.columnDispRslt_col_93.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_93_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_93);
		p.columnDispRslt_col_94.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_94_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_94);
		p.columnDispRslt_col_95.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_95_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_95);
		p.columnDispRslt_col_96.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_96_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_96);
		p.columnDispRslt_col_97.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_97_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_97);
		p.columnDispRslt_col_98.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_98_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_98);
		p.columnDispRslt_col_99.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.col_99_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_col_99);
		p.columnDispRslt_ttl.setMeta(mcframe.clientMGBF.MGBFP0470.DispRsltR.ttl_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_ttl);
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
		Cnd_ac_slip_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_slip_typ.getListConfig().setPutter(getCnd_ac_slip_typ_ListPutter());
		Cnd_ac_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_rsn_cd.getListConfig().setPutter(getCnd_ac_rsn_cd_ListPutter());
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
		Cnd_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cntry_cd.getListConfig().setPutter(getCnd_cntry_cd_ListPutter());
		Cnd_area_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_area_cd.getListConfig().setPutter(getCnd_area_cd_ListPutter());
		Cnd_alc_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_dpt_cd.getListConfig().setPutter(getCnd_alc_dpt_cd_ListPutter());
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
	 * [Cnd_ac_slip_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_slip_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcSlipTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcRsn");
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
	 * [Cnd_alc_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
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
		if(combo == Cnd_mng_dpt_cd) return getCnd_mng_dpt_cd(row, info);
		if(combo == Cnd_itm_jnl_cd) return getCnd_itm_jnl_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_asst_typ) return getCnd_asst_typ(row, info);
		if(combo == Cnd_ac_slip_typ) return getCnd_ac_slip_typ(row, info);
		if(combo == Cnd_ac_rsn_cd) return getCnd_ac_rsn_cd(row, info);
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		if(combo == Cnd_cntry_cd) return getCnd_cntry_cd(row, info);
		if(combo == Cnd_area_cd) return getCnd_area_cd(row, info);
		if(combo == Cnd_alc_dpt_cd) return getCnd_alc_dpt_cd(row, info);
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
		if (vc == Cnd_ac_slip_typ) return doCnd_ac_slip_typ_VC(info);
		if (vc == Cnd_ac_slip_typ_nm) return doCnd_ac_slip_typ_nm_VC(info);
		if (vc == Cnd_ac_rsn_cd) return doCnd_ac_rsn_cd_VC(info);
		if (vc == Cnd_ac_rsn_nm) return doCnd_ac_rsn_nm_VC(info);
		if (vc == Cnd_no_ac_rsn_flg) return doCnd_no_ac_rsn_flg_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_cntry_cd) return doCnd_cntry_cd_VC(info);
		if (vc == Cnd_cntry_nm) return doCnd_cntry_nm_VC(info);
		if (vc == Cnd_area_cd) return doCnd_area_cd_VC(info);
		if (vc == Cnd_area_nm) return doCnd_area_nm_VC(info);
		if (vc == Cnd_alc_dpt_cd) return doCnd_alc_dpt_cd_VC(info);
		if (vc == Cnd_alc_dpt_nm) return doCnd_alc_dpt_nm_VC(info);
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
		if (vc == Cnd_alc_dpt_flg) return doCnd_alc_dpt_flg_VC(info);
		if (vc == Cnd_ac_slip_typ_flg) return doCnd_ac_slip_typ_flg_VC(info);
		if (vc == Cnd_ac_rsn_flg) return doCnd_ac_rsn_flg_VC(info);
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
		if (vc == columnDispRslt_alc_dpt_cd) return doDispRslt_alc_dpt_cd_VC(info);
		if (vc == columnDispRslt_alc_dpt_nm) return doDispRslt_alc_dpt_nm_VC(info);
		if (vc == columnDispRslt_ac_slip_typ) return doDispRslt_ac_slip_typ_VC(info);
		if (vc == columnDispRslt_ac_slip_typ_nm) return doDispRslt_ac_slip_typ_nm_VC(info);
		if (vc == columnDispRslt_ac_rsn_cd) return doDispRslt_ac_rsn_cd_VC(info);
		if (vc == columnDispRslt_ac_rsn_nm) return doDispRslt_ac_rsn_nm_VC(info);
		if (vc == columnDispRslt_asst_typ) return doDispRslt_asst_typ_VC(info);
		if (vc == columnDispRslt_asst_typ_nm) return doDispRslt_asst_typ_nm_VC(info);
		if (vc == columnDispRslt_unit_cd) return doDispRslt_unit_cd_VC(info);
		if (vc == columnDispRslt_unit_nm) return doDispRslt_unit_nm_VC(info);
		if (vc == columnDispRslt_dec_place) return doDispRslt_dec_place_VC(info);
		if (vc == columnDispRslt_elm_no) return doDispRslt_elm_no_VC(info);
		if (vc == columnDispRslt_elm) return doDispRslt_elm_VC(info);
		if (vc == columnDispRslt_elm_nm) return doDispRslt_elm_nm_VC(info);
		if (vc == columnDispRslt_col_00) return doDispRslt_col_00_VC(info);
		if (vc == columnDispRslt_col_01) return doDispRslt_col_01_VC(info);
		if (vc == columnDispRslt_col_02) return doDispRslt_col_02_VC(info);
		if (vc == columnDispRslt_col_03) return doDispRslt_col_03_VC(info);
		if (vc == columnDispRslt_col_04) return doDispRslt_col_04_VC(info);
		if (vc == columnDispRslt_col_05) return doDispRslt_col_05_VC(info);
		if (vc == columnDispRslt_col_06) return doDispRslt_col_06_VC(info);
		if (vc == columnDispRslt_col_07) return doDispRslt_col_07_VC(info);
		if (vc == columnDispRslt_col_08) return doDispRslt_col_08_VC(info);
		if (vc == columnDispRslt_col_09) return doDispRslt_col_09_VC(info);
		if (vc == columnDispRslt_col_10) return doDispRslt_col_10_VC(info);
		if (vc == columnDispRslt_col_11) return doDispRslt_col_11_VC(info);
		if (vc == columnDispRslt_col_12) return doDispRslt_col_12_VC(info);
		if (vc == columnDispRslt_col_13) return doDispRslt_col_13_VC(info);
		if (vc == columnDispRslt_col_14) return doDispRslt_col_14_VC(info);
		if (vc == columnDispRslt_col_15) return doDispRslt_col_15_VC(info);
		if (vc == columnDispRslt_col_16) return doDispRslt_col_16_VC(info);
		if (vc == columnDispRslt_col_17) return doDispRslt_col_17_VC(info);
		if (vc == columnDispRslt_col_18) return doDispRslt_col_18_VC(info);
		if (vc == columnDispRslt_col_19) return doDispRslt_col_19_VC(info);
		if (vc == columnDispRslt_col_20) return doDispRslt_col_20_VC(info);
		if (vc == columnDispRslt_col_21) return doDispRslt_col_21_VC(info);
		if (vc == columnDispRslt_col_22) return doDispRslt_col_22_VC(info);
		if (vc == columnDispRslt_col_23) return doDispRslt_col_23_VC(info);
		if (vc == columnDispRslt_col_24) return doDispRslt_col_24_VC(info);
		if (vc == columnDispRslt_col_25) return doDispRslt_col_25_VC(info);
		if (vc == columnDispRslt_col_26) return doDispRslt_col_26_VC(info);
		if (vc == columnDispRslt_col_27) return doDispRslt_col_27_VC(info);
		if (vc == columnDispRslt_col_28) return doDispRslt_col_28_VC(info);
		if (vc == columnDispRslt_col_29) return doDispRslt_col_29_VC(info);
		if (vc == columnDispRslt_col_30) return doDispRslt_col_30_VC(info);
		if (vc == columnDispRslt_col_31) return doDispRslt_col_31_VC(info);
		if (vc == columnDispRslt_col_32) return doDispRslt_col_32_VC(info);
		if (vc == columnDispRslt_col_33) return doDispRslt_col_33_VC(info);
		if (vc == columnDispRslt_col_34) return doDispRslt_col_34_VC(info);
		if (vc == columnDispRslt_col_35) return doDispRslt_col_35_VC(info);
		if (vc == columnDispRslt_col_36) return doDispRslt_col_36_VC(info);
		if (vc == columnDispRslt_col_37) return doDispRslt_col_37_VC(info);
		if (vc == columnDispRslt_col_38) return doDispRslt_col_38_VC(info);
		if (vc == columnDispRslt_col_39) return doDispRslt_col_39_VC(info);
		if (vc == columnDispRslt_col_40) return doDispRslt_col_40_VC(info);
		if (vc == columnDispRslt_col_41) return doDispRslt_col_41_VC(info);
		if (vc == columnDispRslt_col_42) return doDispRslt_col_42_VC(info);
		if (vc == columnDispRslt_col_43) return doDispRslt_col_43_VC(info);
		if (vc == columnDispRslt_col_44) return doDispRslt_col_44_VC(info);
		if (vc == columnDispRslt_col_45) return doDispRslt_col_45_VC(info);
		if (vc == columnDispRslt_col_46) return doDispRslt_col_46_VC(info);
		if (vc == columnDispRslt_col_47) return doDispRslt_col_47_VC(info);
		if (vc == columnDispRslt_col_48) return doDispRslt_col_48_VC(info);
		if (vc == columnDispRslt_col_49) return doDispRslt_col_49_VC(info);
		if (vc == columnDispRslt_col_50) return doDispRslt_col_50_VC(info);
		if (vc == columnDispRslt_col_51) return doDispRslt_col_51_VC(info);
		if (vc == columnDispRslt_col_52) return doDispRslt_col_52_VC(info);
		if (vc == columnDispRslt_col_53) return doDispRslt_col_53_VC(info);
		if (vc == columnDispRslt_col_54) return doDispRslt_col_54_VC(info);
		if (vc == columnDispRslt_col_55) return doDispRslt_col_55_VC(info);
		if (vc == columnDispRslt_col_56) return doDispRslt_col_56_VC(info);
		if (vc == columnDispRslt_col_57) return doDispRslt_col_57_VC(info);
		if (vc == columnDispRslt_col_58) return doDispRslt_col_58_VC(info);
		if (vc == columnDispRslt_col_59) return doDispRslt_col_59_VC(info);
		if (vc == columnDispRslt_col_60) return doDispRslt_col_60_VC(info);
		if (vc == columnDispRslt_col_61) return doDispRslt_col_61_VC(info);
		if (vc == columnDispRslt_col_62) return doDispRslt_col_62_VC(info);
		if (vc == columnDispRslt_col_63) return doDispRslt_col_63_VC(info);
		if (vc == columnDispRslt_col_64) return doDispRslt_col_64_VC(info);
		if (vc == columnDispRslt_col_65) return doDispRslt_col_65_VC(info);
		if (vc == columnDispRslt_col_66) return doDispRslt_col_66_VC(info);
		if (vc == columnDispRslt_col_67) return doDispRslt_col_67_VC(info);
		if (vc == columnDispRslt_col_68) return doDispRslt_col_68_VC(info);
		if (vc == columnDispRslt_col_69) return doDispRslt_col_69_VC(info);
		if (vc == columnDispRslt_col_70) return doDispRslt_col_70_VC(info);
		if (vc == columnDispRslt_col_71) return doDispRslt_col_71_VC(info);
		if (vc == columnDispRslt_col_72) return doDispRslt_col_72_VC(info);
		if (vc == columnDispRslt_col_73) return doDispRslt_col_73_VC(info);
		if (vc == columnDispRslt_col_74) return doDispRslt_col_74_VC(info);
		if (vc == columnDispRslt_col_75) return doDispRslt_col_75_VC(info);
		if (vc == columnDispRslt_col_76) return doDispRslt_col_76_VC(info);
		if (vc == columnDispRslt_col_77) return doDispRslt_col_77_VC(info);
		if (vc == columnDispRslt_col_78) return doDispRslt_col_78_VC(info);
		if (vc == columnDispRslt_col_79) return doDispRslt_col_79_VC(info);
		if (vc == columnDispRslt_col_80) return doDispRslt_col_80_VC(info);
		if (vc == columnDispRslt_col_81) return doDispRslt_col_81_VC(info);
		if (vc == columnDispRslt_col_82) return doDispRslt_col_82_VC(info);
		if (vc == columnDispRslt_col_83) return doDispRslt_col_83_VC(info);
		if (vc == columnDispRslt_col_84) return doDispRslt_col_84_VC(info);
		if (vc == columnDispRslt_col_85) return doDispRslt_col_85_VC(info);
		if (vc == columnDispRslt_col_86) return doDispRslt_col_86_VC(info);
		if (vc == columnDispRslt_col_87) return doDispRslt_col_87_VC(info);
		if (vc == columnDispRslt_col_88) return doDispRslt_col_88_VC(info);
		if (vc == columnDispRslt_col_89) return doDispRslt_col_89_VC(info);
		if (vc == columnDispRslt_col_90) return doDispRslt_col_90_VC(info);
		if (vc == columnDispRslt_col_91) return doDispRslt_col_91_VC(info);
		if (vc == columnDispRslt_col_92) return doDispRslt_col_92_VC(info);
		if (vc == columnDispRslt_col_93) return doDispRslt_col_93_VC(info);
		if (vc == columnDispRslt_col_94) return doDispRslt_col_94_VC(info);
		if (vc == columnDispRslt_col_95) return doDispRslt_col_95_VC(info);
		if (vc == columnDispRslt_col_96) return doDispRslt_col_96_VC(info);
		if (vc == columnDispRslt_col_97) return doDispRslt_col_97_VC(info);
		if (vc == columnDispRslt_col_98) return doDispRslt_col_98_VC(info);
		if (vc == columnDispRslt_col_99) return doDispRslt_col_99_VC(info);
		if (vc == columnDispRslt_ttl) return doDispRslt_ttl_VC(info);
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
	 * [Cnd]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_ac_rsn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_ac_rsn_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[alc_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_slip_typ_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_rsn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_rsn_flg_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[ac_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_ac_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[ac_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_ac_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[ac_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_ac_rsn_nm_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_00_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_02_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_04_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_06_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_08_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_10_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_12_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_14_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_16_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_18_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_20_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_22]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_22_VC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_24]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_24_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_25]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_25_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_26]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_26_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_27]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_27_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_28]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_28_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_29]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_29_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_30]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_30_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_31]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_31_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_32]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_32_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_33]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_33_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_34]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_34_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_35]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_35_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_36]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_36_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_37]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_37_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_38]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_38_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_39]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_39_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_40]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_40_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_41]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_41_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_42]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_42_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_43]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_43_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_44]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_44_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_45]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_45_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_46]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_46_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_47]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_47_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_48]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_48_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_49]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_49_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_50]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_50_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_51]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_51_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_52]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_52_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_53]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_53_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_54]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_54_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_55]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_55_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_56]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_56_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_57]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_57_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_58]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_58_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_59]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_59_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_60]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_60_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_61]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_61_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_62]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_62_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_63]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_63_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_64]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_64_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_65]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_65_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_66]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_66_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_67]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_67_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_68]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_68_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_69]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_69_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_70]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_70_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_71]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_71_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_72]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_72_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_73]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_73_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_74]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_74_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_75]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_75_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_76]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_76_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_77]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_77_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_78]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_78_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_79]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_79_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_80]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_80_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_81]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_81_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_82]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_82_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_83]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_83_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_84]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_84_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_85]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_85_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_86]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_86_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_87]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_87_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_88]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_88_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_89]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_89_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_90]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_90_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_91]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_91_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_92]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_92_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_93]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_93_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_94]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_94_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_95]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_95_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_96]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_96_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_97]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_97_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_98]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_98_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispRslt]パネルの[col_99]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispRslt_col_99_VC(MCEventInfo info){
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
		else if (nc == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NC(info);
		else if (nc == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NC(info);
		else if (nc == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_NC(info);
		else if (nc == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_NC(info);
		else if (nc == Cnd_no_ac_rsn_flg) doCnd_no_ac_rsn_flg_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_cntry_cd) doCnd_cntry_cd_NC(info);
		else if (nc == Cnd_cntry_nm) doCnd_cntry_nm_NC(info);
		else if (nc == Cnd_area_cd) doCnd_area_cd_NC(info);
		else if (nc == Cnd_area_nm) doCnd_area_nm_NC(info);
		else if (nc == Cnd_alc_dpt_cd) doCnd_alc_dpt_cd_NC(info);
		else if (nc == Cnd_alc_dpt_nm) doCnd_alc_dpt_nm_NC(info);
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
		else if (nc == Cnd_alc_dpt_flg) doCnd_alc_dpt_flg_NC(info);
		else if (nc == Cnd_ac_slip_typ_flg) doCnd_ac_slip_typ_flg_NC(info);
		else if (nc == Cnd_ac_rsn_flg) doCnd_ac_rsn_flg_NC(info);
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
		else if (nc == columnDispRslt_alc_dpt_cd) doDispRslt_alc_dpt_cd_NC(info);
		else if (nc == columnDispRslt_alc_dpt_nm) doDispRslt_alc_dpt_nm_NC(info);
		else if (nc == columnDispRslt_ac_slip_typ) doDispRslt_ac_slip_typ_NC(info);
		else if (nc == columnDispRslt_ac_slip_typ_nm) doDispRslt_ac_slip_typ_nm_NC(info);
		else if (nc == columnDispRslt_ac_rsn_cd) doDispRslt_ac_rsn_cd_NC(info);
		else if (nc == columnDispRslt_ac_rsn_nm) doDispRslt_ac_rsn_nm_NC(info);
		else if (nc == columnDispRslt_asst_typ) doDispRslt_asst_typ_NC(info);
		else if (nc == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NC(info);
		else if (nc == columnDispRslt_unit_cd) doDispRslt_unit_cd_NC(info);
		else if (nc == columnDispRslt_unit_nm) doDispRslt_unit_nm_NC(info);
		else if (nc == columnDispRslt_dec_place) doDispRslt_dec_place_NC(info);
		else if (nc == columnDispRslt_elm_no) doDispRslt_elm_no_NC(info);
		else if (nc == columnDispRslt_elm) doDispRslt_elm_NC(info);
		else if (nc == columnDispRslt_elm_nm) doDispRslt_elm_nm_NC(info);
		else if (nc == columnDispRslt_col_00) doDispRslt_col_00_NC(info);
		else if (nc == columnDispRslt_col_01) doDispRslt_col_01_NC(info);
		else if (nc == columnDispRslt_col_02) doDispRslt_col_02_NC(info);
		else if (nc == columnDispRslt_col_03) doDispRslt_col_03_NC(info);
		else if (nc == columnDispRslt_col_04) doDispRslt_col_04_NC(info);
		else if (nc == columnDispRslt_col_05) doDispRslt_col_05_NC(info);
		else if (nc == columnDispRslt_col_06) doDispRslt_col_06_NC(info);
		else if (nc == columnDispRslt_col_07) doDispRslt_col_07_NC(info);
		else if (nc == columnDispRslt_col_08) doDispRslt_col_08_NC(info);
		else if (nc == columnDispRslt_col_09) doDispRslt_col_09_NC(info);
		else if (nc == columnDispRslt_col_10) doDispRslt_col_10_NC(info);
		else if (nc == columnDispRslt_col_11) doDispRslt_col_11_NC(info);
		else if (nc == columnDispRslt_col_12) doDispRslt_col_12_NC(info);
		else if (nc == columnDispRslt_col_13) doDispRslt_col_13_NC(info);
		else if (nc == columnDispRslt_col_14) doDispRslt_col_14_NC(info);
		else if (nc == columnDispRslt_col_15) doDispRslt_col_15_NC(info);
		else if (nc == columnDispRslt_col_16) doDispRslt_col_16_NC(info);
		else if (nc == columnDispRslt_col_17) doDispRslt_col_17_NC(info);
		else if (nc == columnDispRslt_col_18) doDispRslt_col_18_NC(info);
		else if (nc == columnDispRslt_col_19) doDispRslt_col_19_NC(info);
		else if (nc == columnDispRslt_col_20) doDispRslt_col_20_NC(info);
		else if (nc == columnDispRslt_col_21) doDispRslt_col_21_NC(info);
		else if (nc == columnDispRslt_col_22) doDispRslt_col_22_NC(info);
		else if (nc == columnDispRslt_col_23) doDispRslt_col_23_NC(info);
		else if (nc == columnDispRslt_col_24) doDispRslt_col_24_NC(info);
		else if (nc == columnDispRslt_col_25) doDispRslt_col_25_NC(info);
		else if (nc == columnDispRslt_col_26) doDispRslt_col_26_NC(info);
		else if (nc == columnDispRslt_col_27) doDispRslt_col_27_NC(info);
		else if (nc == columnDispRslt_col_28) doDispRslt_col_28_NC(info);
		else if (nc == columnDispRslt_col_29) doDispRslt_col_29_NC(info);
		else if (nc == columnDispRslt_col_30) doDispRslt_col_30_NC(info);
		else if (nc == columnDispRslt_col_31) doDispRslt_col_31_NC(info);
		else if (nc == columnDispRslt_col_32) doDispRslt_col_32_NC(info);
		else if (nc == columnDispRslt_col_33) doDispRslt_col_33_NC(info);
		else if (nc == columnDispRslt_col_34) doDispRslt_col_34_NC(info);
		else if (nc == columnDispRslt_col_35) doDispRslt_col_35_NC(info);
		else if (nc == columnDispRslt_col_36) doDispRslt_col_36_NC(info);
		else if (nc == columnDispRslt_col_37) doDispRslt_col_37_NC(info);
		else if (nc == columnDispRslt_col_38) doDispRslt_col_38_NC(info);
		else if (nc == columnDispRslt_col_39) doDispRslt_col_39_NC(info);
		else if (nc == columnDispRslt_col_40) doDispRslt_col_40_NC(info);
		else if (nc == columnDispRslt_col_41) doDispRslt_col_41_NC(info);
		else if (nc == columnDispRslt_col_42) doDispRslt_col_42_NC(info);
		else if (nc == columnDispRslt_col_43) doDispRslt_col_43_NC(info);
		else if (nc == columnDispRslt_col_44) doDispRslt_col_44_NC(info);
		else if (nc == columnDispRslt_col_45) doDispRslt_col_45_NC(info);
		else if (nc == columnDispRslt_col_46) doDispRslt_col_46_NC(info);
		else if (nc == columnDispRslt_col_47) doDispRslt_col_47_NC(info);
		else if (nc == columnDispRslt_col_48) doDispRslt_col_48_NC(info);
		else if (nc == columnDispRslt_col_49) doDispRslt_col_49_NC(info);
		else if (nc == columnDispRslt_col_50) doDispRslt_col_50_NC(info);
		else if (nc == columnDispRslt_col_51) doDispRslt_col_51_NC(info);
		else if (nc == columnDispRslt_col_52) doDispRslt_col_52_NC(info);
		else if (nc == columnDispRslt_col_53) doDispRslt_col_53_NC(info);
		else if (nc == columnDispRslt_col_54) doDispRslt_col_54_NC(info);
		else if (nc == columnDispRslt_col_55) doDispRslt_col_55_NC(info);
		else if (nc == columnDispRslt_col_56) doDispRslt_col_56_NC(info);
		else if (nc == columnDispRslt_col_57) doDispRslt_col_57_NC(info);
		else if (nc == columnDispRslt_col_58) doDispRslt_col_58_NC(info);
		else if (nc == columnDispRslt_col_59) doDispRslt_col_59_NC(info);
		else if (nc == columnDispRslt_col_60) doDispRslt_col_60_NC(info);
		else if (nc == columnDispRslt_col_61) doDispRslt_col_61_NC(info);
		else if (nc == columnDispRslt_col_62) doDispRslt_col_62_NC(info);
		else if (nc == columnDispRslt_col_63) doDispRslt_col_63_NC(info);
		else if (nc == columnDispRslt_col_64) doDispRslt_col_64_NC(info);
		else if (nc == columnDispRslt_col_65) doDispRslt_col_65_NC(info);
		else if (nc == columnDispRslt_col_66) doDispRslt_col_66_NC(info);
		else if (nc == columnDispRslt_col_67) doDispRslt_col_67_NC(info);
		else if (nc == columnDispRslt_col_68) doDispRslt_col_68_NC(info);
		else if (nc == columnDispRslt_col_69) doDispRslt_col_69_NC(info);
		else if (nc == columnDispRslt_col_70) doDispRslt_col_70_NC(info);
		else if (nc == columnDispRslt_col_71) doDispRslt_col_71_NC(info);
		else if (nc == columnDispRslt_col_72) doDispRslt_col_72_NC(info);
		else if (nc == columnDispRslt_col_73) doDispRslt_col_73_NC(info);
		else if (nc == columnDispRslt_col_74) doDispRslt_col_74_NC(info);
		else if (nc == columnDispRslt_col_75) doDispRslt_col_75_NC(info);
		else if (nc == columnDispRslt_col_76) doDispRslt_col_76_NC(info);
		else if (nc == columnDispRslt_col_77) doDispRslt_col_77_NC(info);
		else if (nc == columnDispRslt_col_78) doDispRslt_col_78_NC(info);
		else if (nc == columnDispRslt_col_79) doDispRslt_col_79_NC(info);
		else if (nc == columnDispRslt_col_80) doDispRslt_col_80_NC(info);
		else if (nc == columnDispRslt_col_81) doDispRslt_col_81_NC(info);
		else if (nc == columnDispRslt_col_82) doDispRslt_col_82_NC(info);
		else if (nc == columnDispRslt_col_83) doDispRslt_col_83_NC(info);
		else if (nc == columnDispRslt_col_84) doDispRslt_col_84_NC(info);
		else if (nc == columnDispRslt_col_85) doDispRslt_col_85_NC(info);
		else if (nc == columnDispRslt_col_86) doDispRslt_col_86_NC(info);
		else if (nc == columnDispRslt_col_87) doDispRslt_col_87_NC(info);
		else if (nc == columnDispRslt_col_88) doDispRslt_col_88_NC(info);
		else if (nc == columnDispRslt_col_89) doDispRslt_col_89_NC(info);
		else if (nc == columnDispRslt_col_90) doDispRslt_col_90_NC(info);
		else if (nc == columnDispRslt_col_91) doDispRslt_col_91_NC(info);
		else if (nc == columnDispRslt_col_92) doDispRslt_col_92_NC(info);
		else if (nc == columnDispRslt_col_93) doDispRslt_col_93_NC(info);
		else if (nc == columnDispRslt_col_94) doDispRslt_col_94_NC(info);
		else if (nc == columnDispRslt_col_95) doDispRslt_col_95_NC(info);
		else if (nc == columnDispRslt_col_96) doDispRslt_col_96_NC(info);
		else if (nc == columnDispRslt_col_97) doDispRslt_col_97_NC(info);
		else if (nc == columnDispRslt_col_98) doDispRslt_col_98_NC(info);
		else if (nc == columnDispRslt_col_99) doDispRslt_col_99_NC(info);
		else if (nc == columnDispRslt_ttl) doDispRslt_ttl_NC(info);
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
	 * [Cnd]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_ac_rsn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_ac_rsn_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[alc_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_flg_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ac_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ac_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ac_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_rsn_nm_NC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_00_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_01_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_02_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_03_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_04_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_05_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_06_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_07_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_08_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_09_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_10_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_11_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_12_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_13_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_14_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_15_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_16_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_17_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_18_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_19_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_20_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_21]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_21_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_22]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_22_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_23]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_23_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_24]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_24_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_25]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_25_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_26]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_26_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_27]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_27_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_28]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_28_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_29]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_29_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_30]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_30_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_31]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_31_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_32]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_32_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_33]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_33_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_34]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_34_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_35]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_35_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_36]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_36_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_37]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_37_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_38]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_38_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_39]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_39_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_40]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_40_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_41]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_41_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_42]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_42_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_43]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_43_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_44]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_44_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_45]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_45_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_46]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_46_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_47]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_47_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_48]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_48_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_49]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_49_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_50]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_50_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_51]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_51_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_52]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_52_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_53]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_53_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_54]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_54_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_55]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_55_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_56]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_56_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_57]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_57_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_58]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_58_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_59]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_59_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_60]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_60_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_61]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_61_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_62]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_62_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_63]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_63_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_64]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_64_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_65]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_65_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_66]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_66_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_67]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_67_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_68]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_68_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_69]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_69_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_70]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_70_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_71]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_71_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_72]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_72_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_73]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_73_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_74]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_74_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_75]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_75_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_76]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_76_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_77]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_77_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_78]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_78_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_79]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_79_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_80]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_80_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_81]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_81_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_82]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_82_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_83]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_83_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_84]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_84_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_85]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_85_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_86]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_86_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_87]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_87_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_88]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_88_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_89]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_89_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_90]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_90_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_91]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_91_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_92]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_92_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_93]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_93_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_94]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_94_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_95]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_95_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_96]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_96_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_97]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_97_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_98]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_98_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_99]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_99_NC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ttl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ttl_NC(MCEventInfo info){
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
		else if (ne == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NE(info);
		else if (ne == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NE(info);
		else if (ne == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_NE(info);
		else if (ne == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_NE(info);
		else if (ne == Cnd_no_ac_rsn_flg) doCnd_no_ac_rsn_flg_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_cntry_cd) doCnd_cntry_cd_NE(info);
		else if (ne == Cnd_cntry_nm) doCnd_cntry_nm_NE(info);
		else if (ne == Cnd_area_cd) doCnd_area_cd_NE(info);
		else if (ne == Cnd_area_nm) doCnd_area_nm_NE(info);
		else if (ne == Cnd_alc_dpt_cd) doCnd_alc_dpt_cd_NE(info);
		else if (ne == Cnd_alc_dpt_nm) doCnd_alc_dpt_nm_NE(info);
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
		else if (ne == Cnd_alc_dpt_flg) doCnd_alc_dpt_flg_NE(info);
		else if (ne == Cnd_ac_slip_typ_flg) doCnd_ac_slip_typ_flg_NE(info);
		else if (ne == Cnd_ac_rsn_flg) doCnd_ac_rsn_flg_NE(info);
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
		else if (ne == columnDispRslt_alc_dpt_cd) doDispRslt_alc_dpt_cd_NE(info);
		else if (ne == columnDispRslt_alc_dpt_nm) doDispRslt_alc_dpt_nm_NE(info);
		else if (ne == columnDispRslt_ac_slip_typ) doDispRslt_ac_slip_typ_NE(info);
		else if (ne == columnDispRslt_ac_slip_typ_nm) doDispRslt_ac_slip_typ_nm_NE(info);
		else if (ne == columnDispRslt_ac_rsn_cd) doDispRslt_ac_rsn_cd_NE(info);
		else if (ne == columnDispRslt_ac_rsn_nm) doDispRslt_ac_rsn_nm_NE(info);
		else if (ne == columnDispRslt_asst_typ) doDispRslt_asst_typ_NE(info);
		else if (ne == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NE(info);
		else if (ne == columnDispRslt_unit_cd) doDispRslt_unit_cd_NE(info);
		else if (ne == columnDispRslt_unit_nm) doDispRslt_unit_nm_NE(info);
		else if (ne == columnDispRslt_dec_place) doDispRslt_dec_place_NE(info);
		else if (ne == columnDispRslt_elm_no) doDispRslt_elm_no_NE(info);
		else if (ne == columnDispRslt_elm) doDispRslt_elm_NE(info);
		else if (ne == columnDispRslt_elm_nm) doDispRslt_elm_nm_NE(info);
		else if (ne == columnDispRslt_col_00) doDispRslt_col_00_NE(info);
		else if (ne == columnDispRslt_col_01) doDispRslt_col_01_NE(info);
		else if (ne == columnDispRslt_col_02) doDispRslt_col_02_NE(info);
		else if (ne == columnDispRslt_col_03) doDispRslt_col_03_NE(info);
		else if (ne == columnDispRslt_col_04) doDispRslt_col_04_NE(info);
		else if (ne == columnDispRslt_col_05) doDispRslt_col_05_NE(info);
		else if (ne == columnDispRslt_col_06) doDispRslt_col_06_NE(info);
		else if (ne == columnDispRslt_col_07) doDispRslt_col_07_NE(info);
		else if (ne == columnDispRslt_col_08) doDispRslt_col_08_NE(info);
		else if (ne == columnDispRslt_col_09) doDispRslt_col_09_NE(info);
		else if (ne == columnDispRslt_col_10) doDispRslt_col_10_NE(info);
		else if (ne == columnDispRslt_col_11) doDispRslt_col_11_NE(info);
		else if (ne == columnDispRslt_col_12) doDispRslt_col_12_NE(info);
		else if (ne == columnDispRslt_col_13) doDispRslt_col_13_NE(info);
		else if (ne == columnDispRslt_col_14) doDispRslt_col_14_NE(info);
		else if (ne == columnDispRslt_col_15) doDispRslt_col_15_NE(info);
		else if (ne == columnDispRslt_col_16) doDispRslt_col_16_NE(info);
		else if (ne == columnDispRslt_col_17) doDispRslt_col_17_NE(info);
		else if (ne == columnDispRslt_col_18) doDispRslt_col_18_NE(info);
		else if (ne == columnDispRslt_col_19) doDispRslt_col_19_NE(info);
		else if (ne == columnDispRslt_col_20) doDispRslt_col_20_NE(info);
		else if (ne == columnDispRslt_col_21) doDispRslt_col_21_NE(info);
		else if (ne == columnDispRslt_col_22) doDispRslt_col_22_NE(info);
		else if (ne == columnDispRslt_col_23) doDispRslt_col_23_NE(info);
		else if (ne == columnDispRslt_col_24) doDispRslt_col_24_NE(info);
		else if (ne == columnDispRslt_col_25) doDispRslt_col_25_NE(info);
		else if (ne == columnDispRslt_col_26) doDispRslt_col_26_NE(info);
		else if (ne == columnDispRslt_col_27) doDispRslt_col_27_NE(info);
		else if (ne == columnDispRslt_col_28) doDispRslt_col_28_NE(info);
		else if (ne == columnDispRslt_col_29) doDispRslt_col_29_NE(info);
		else if (ne == columnDispRslt_col_30) doDispRslt_col_30_NE(info);
		else if (ne == columnDispRslt_col_31) doDispRslt_col_31_NE(info);
		else if (ne == columnDispRslt_col_32) doDispRslt_col_32_NE(info);
		else if (ne == columnDispRslt_col_33) doDispRslt_col_33_NE(info);
		else if (ne == columnDispRslt_col_34) doDispRslt_col_34_NE(info);
		else if (ne == columnDispRslt_col_35) doDispRslt_col_35_NE(info);
		else if (ne == columnDispRslt_col_36) doDispRslt_col_36_NE(info);
		else if (ne == columnDispRslt_col_37) doDispRslt_col_37_NE(info);
		else if (ne == columnDispRslt_col_38) doDispRslt_col_38_NE(info);
		else if (ne == columnDispRslt_col_39) doDispRslt_col_39_NE(info);
		else if (ne == columnDispRslt_col_40) doDispRslt_col_40_NE(info);
		else if (ne == columnDispRslt_col_41) doDispRslt_col_41_NE(info);
		else if (ne == columnDispRslt_col_42) doDispRslt_col_42_NE(info);
		else if (ne == columnDispRslt_col_43) doDispRslt_col_43_NE(info);
		else if (ne == columnDispRslt_col_44) doDispRslt_col_44_NE(info);
		else if (ne == columnDispRslt_col_45) doDispRslt_col_45_NE(info);
		else if (ne == columnDispRslt_col_46) doDispRslt_col_46_NE(info);
		else if (ne == columnDispRslt_col_47) doDispRslt_col_47_NE(info);
		else if (ne == columnDispRslt_col_48) doDispRslt_col_48_NE(info);
		else if (ne == columnDispRslt_col_49) doDispRslt_col_49_NE(info);
		else if (ne == columnDispRslt_col_50) doDispRslt_col_50_NE(info);
		else if (ne == columnDispRslt_col_51) doDispRslt_col_51_NE(info);
		else if (ne == columnDispRslt_col_52) doDispRslt_col_52_NE(info);
		else if (ne == columnDispRslt_col_53) doDispRslt_col_53_NE(info);
		else if (ne == columnDispRslt_col_54) doDispRslt_col_54_NE(info);
		else if (ne == columnDispRslt_col_55) doDispRslt_col_55_NE(info);
		else if (ne == columnDispRslt_col_56) doDispRslt_col_56_NE(info);
		else if (ne == columnDispRslt_col_57) doDispRslt_col_57_NE(info);
		else if (ne == columnDispRslt_col_58) doDispRslt_col_58_NE(info);
		else if (ne == columnDispRslt_col_59) doDispRslt_col_59_NE(info);
		else if (ne == columnDispRslt_col_60) doDispRslt_col_60_NE(info);
		else if (ne == columnDispRslt_col_61) doDispRslt_col_61_NE(info);
		else if (ne == columnDispRslt_col_62) doDispRslt_col_62_NE(info);
		else if (ne == columnDispRslt_col_63) doDispRslt_col_63_NE(info);
		else if (ne == columnDispRslt_col_64) doDispRslt_col_64_NE(info);
		else if (ne == columnDispRslt_col_65) doDispRslt_col_65_NE(info);
		else if (ne == columnDispRslt_col_66) doDispRslt_col_66_NE(info);
		else if (ne == columnDispRslt_col_67) doDispRslt_col_67_NE(info);
		else if (ne == columnDispRslt_col_68) doDispRslt_col_68_NE(info);
		else if (ne == columnDispRslt_col_69) doDispRslt_col_69_NE(info);
		else if (ne == columnDispRslt_col_70) doDispRslt_col_70_NE(info);
		else if (ne == columnDispRslt_col_71) doDispRslt_col_71_NE(info);
		else if (ne == columnDispRslt_col_72) doDispRslt_col_72_NE(info);
		else if (ne == columnDispRslt_col_73) doDispRslt_col_73_NE(info);
		else if (ne == columnDispRslt_col_74) doDispRslt_col_74_NE(info);
		else if (ne == columnDispRslt_col_75) doDispRslt_col_75_NE(info);
		else if (ne == columnDispRslt_col_76) doDispRslt_col_76_NE(info);
		else if (ne == columnDispRslt_col_77) doDispRslt_col_77_NE(info);
		else if (ne == columnDispRslt_col_78) doDispRslt_col_78_NE(info);
		else if (ne == columnDispRslt_col_79) doDispRslt_col_79_NE(info);
		else if (ne == columnDispRslt_col_80) doDispRslt_col_80_NE(info);
		else if (ne == columnDispRslt_col_81) doDispRslt_col_81_NE(info);
		else if (ne == columnDispRslt_col_82) doDispRslt_col_82_NE(info);
		else if (ne == columnDispRslt_col_83) doDispRslt_col_83_NE(info);
		else if (ne == columnDispRslt_col_84) doDispRslt_col_84_NE(info);
		else if (ne == columnDispRslt_col_85) doDispRslt_col_85_NE(info);
		else if (ne == columnDispRslt_col_86) doDispRslt_col_86_NE(info);
		else if (ne == columnDispRslt_col_87) doDispRslt_col_87_NE(info);
		else if (ne == columnDispRslt_col_88) doDispRslt_col_88_NE(info);
		else if (ne == columnDispRslt_col_89) doDispRslt_col_89_NE(info);
		else if (ne == columnDispRslt_col_90) doDispRslt_col_90_NE(info);
		else if (ne == columnDispRslt_col_91) doDispRslt_col_91_NE(info);
		else if (ne == columnDispRslt_col_92) doDispRslt_col_92_NE(info);
		else if (ne == columnDispRslt_col_93) doDispRslt_col_93_NE(info);
		else if (ne == columnDispRslt_col_94) doDispRslt_col_94_NE(info);
		else if (ne == columnDispRslt_col_95) doDispRslt_col_95_NE(info);
		else if (ne == columnDispRslt_col_96) doDispRslt_col_96_NE(info);
		else if (ne == columnDispRslt_col_97) doDispRslt_col_97_NE(info);
		else if (ne == columnDispRslt_col_98) doDispRslt_col_98_NE(info);
		else if (ne == columnDispRslt_col_99) doDispRslt_col_99_NE(info);
		else if (ne == columnDispRslt_ttl) doDispRslt_ttl_NE(info);
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
	 * [Cnd]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_ac_rsn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_ac_rsn_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[alc_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_flg_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ac_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ac_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ac_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_rsn_nm_NE(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_00_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_01_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_02_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_03_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_04_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_05_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_06_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_07_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_08_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_09_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_10_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_11_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_12_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_13_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_14_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_15_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_16_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_17_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_18_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_19_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_20_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_21]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_21_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_22]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_22_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_23]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_23_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_24]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_24_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_25]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_25_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_26]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_26_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_27]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_27_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_28]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_28_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_29]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_29_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_30]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_30_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_31]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_31_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_32]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_32_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_33]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_33_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_34]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_34_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_35]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_35_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_36]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_36_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_37]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_37_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_38]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_38_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_39]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_39_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_40]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_40_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_41]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_41_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_42]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_42_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_43]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_43_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_44]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_44_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_45]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_45_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_46]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_46_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_47]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_47_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_48]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_48_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_49]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_49_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_50]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_50_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_51]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_51_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_52]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_52_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_53]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_53_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_54]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_54_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_55]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_55_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_56]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_56_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_57]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_57_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_58]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_58_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_59]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_59_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_60]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_60_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_61]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_61_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_62]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_62_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_63]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_63_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_64]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_64_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_65]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_65_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_66]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_66_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_67]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_67_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_68]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_68_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_69]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_69_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_70]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_70_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_71]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_71_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_72]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_72_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_73]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_73_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_74]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_74_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_75]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_75_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_76]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_76_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_77]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_77_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_78]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_78_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_79]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_79_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_80]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_80_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_81]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_81_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_82]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_82_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_83]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_83_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_84]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_84_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_85]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_85_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_86]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_86_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_87]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_87_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_88]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_88_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_89]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_89_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_90]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_90_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_91]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_91_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_92]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_92_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_93]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_93_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_94]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_94_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_95]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_95_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_96]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_96_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_97]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_97_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_98]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_98_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_99]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_99_NE(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ttl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ttl_NE(MCEventInfo info){
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
		else if (nx == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NX(info);
		else if (nx == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NX(info);
		else if (nx == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_NX(info);
		else if (nx == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_NX(info);
		else if (nx == Cnd_no_ac_rsn_flg) doCnd_no_ac_rsn_flg_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_cntry_cd) doCnd_cntry_cd_NX(info);
		else if (nx == Cnd_cntry_nm) doCnd_cntry_nm_NX(info);
		else if (nx == Cnd_area_cd) doCnd_area_cd_NX(info);
		else if (nx == Cnd_area_nm) doCnd_area_nm_NX(info);
		else if (nx == Cnd_alc_dpt_cd) doCnd_alc_dpt_cd_NX(info);
		else if (nx == Cnd_alc_dpt_nm) doCnd_alc_dpt_nm_NX(info);
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
		else if (nx == Cnd_alc_dpt_flg) doCnd_alc_dpt_flg_NX(info);
		else if (nx == Cnd_ac_slip_typ_flg) doCnd_ac_slip_typ_flg_NX(info);
		else if (nx == Cnd_ac_rsn_flg) doCnd_ac_rsn_flg_NX(info);
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
		else if (nx == columnDispRslt_alc_dpt_cd) doDispRslt_alc_dpt_cd_NX(info);
		else if (nx == columnDispRslt_alc_dpt_nm) doDispRslt_alc_dpt_nm_NX(info);
		else if (nx == columnDispRslt_ac_slip_typ) doDispRslt_ac_slip_typ_NX(info);
		else if (nx == columnDispRslt_ac_slip_typ_nm) doDispRslt_ac_slip_typ_nm_NX(info);
		else if (nx == columnDispRslt_ac_rsn_cd) doDispRslt_ac_rsn_cd_NX(info);
		else if (nx == columnDispRslt_ac_rsn_nm) doDispRslt_ac_rsn_nm_NX(info);
		else if (nx == columnDispRslt_asst_typ) doDispRslt_asst_typ_NX(info);
		else if (nx == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_NX(info);
		else if (nx == columnDispRslt_unit_cd) doDispRslt_unit_cd_NX(info);
		else if (nx == columnDispRslt_unit_nm) doDispRslt_unit_nm_NX(info);
		else if (nx == columnDispRslt_dec_place) doDispRslt_dec_place_NX(info);
		else if (nx == columnDispRslt_elm_no) doDispRslt_elm_no_NX(info);
		else if (nx == columnDispRslt_elm) doDispRslt_elm_NX(info);
		else if (nx == columnDispRslt_elm_nm) doDispRslt_elm_nm_NX(info);
		else if (nx == columnDispRslt_col_00) doDispRslt_col_00_NX(info);
		else if (nx == columnDispRslt_col_01) doDispRslt_col_01_NX(info);
		else if (nx == columnDispRslt_col_02) doDispRslt_col_02_NX(info);
		else if (nx == columnDispRslt_col_03) doDispRslt_col_03_NX(info);
		else if (nx == columnDispRslt_col_04) doDispRslt_col_04_NX(info);
		else if (nx == columnDispRslt_col_05) doDispRslt_col_05_NX(info);
		else if (nx == columnDispRslt_col_06) doDispRslt_col_06_NX(info);
		else if (nx == columnDispRslt_col_07) doDispRslt_col_07_NX(info);
		else if (nx == columnDispRslt_col_08) doDispRslt_col_08_NX(info);
		else if (nx == columnDispRslt_col_09) doDispRslt_col_09_NX(info);
		else if (nx == columnDispRslt_col_10) doDispRslt_col_10_NX(info);
		else if (nx == columnDispRslt_col_11) doDispRslt_col_11_NX(info);
		else if (nx == columnDispRslt_col_12) doDispRslt_col_12_NX(info);
		else if (nx == columnDispRslt_col_13) doDispRslt_col_13_NX(info);
		else if (nx == columnDispRslt_col_14) doDispRslt_col_14_NX(info);
		else if (nx == columnDispRslt_col_15) doDispRslt_col_15_NX(info);
		else if (nx == columnDispRslt_col_16) doDispRslt_col_16_NX(info);
		else if (nx == columnDispRslt_col_17) doDispRslt_col_17_NX(info);
		else if (nx == columnDispRslt_col_18) doDispRslt_col_18_NX(info);
		else if (nx == columnDispRslt_col_19) doDispRslt_col_19_NX(info);
		else if (nx == columnDispRslt_col_20) doDispRslt_col_20_NX(info);
		else if (nx == columnDispRslt_col_21) doDispRslt_col_21_NX(info);
		else if (nx == columnDispRslt_col_22) doDispRslt_col_22_NX(info);
		else if (nx == columnDispRslt_col_23) doDispRslt_col_23_NX(info);
		else if (nx == columnDispRslt_col_24) doDispRslt_col_24_NX(info);
		else if (nx == columnDispRslt_col_25) doDispRslt_col_25_NX(info);
		else if (nx == columnDispRslt_col_26) doDispRslt_col_26_NX(info);
		else if (nx == columnDispRslt_col_27) doDispRslt_col_27_NX(info);
		else if (nx == columnDispRslt_col_28) doDispRslt_col_28_NX(info);
		else if (nx == columnDispRslt_col_29) doDispRslt_col_29_NX(info);
		else if (nx == columnDispRslt_col_30) doDispRslt_col_30_NX(info);
		else if (nx == columnDispRslt_col_31) doDispRslt_col_31_NX(info);
		else if (nx == columnDispRslt_col_32) doDispRslt_col_32_NX(info);
		else if (nx == columnDispRslt_col_33) doDispRslt_col_33_NX(info);
		else if (nx == columnDispRslt_col_34) doDispRslt_col_34_NX(info);
		else if (nx == columnDispRslt_col_35) doDispRslt_col_35_NX(info);
		else if (nx == columnDispRslt_col_36) doDispRslt_col_36_NX(info);
		else if (nx == columnDispRslt_col_37) doDispRslt_col_37_NX(info);
		else if (nx == columnDispRslt_col_38) doDispRslt_col_38_NX(info);
		else if (nx == columnDispRslt_col_39) doDispRslt_col_39_NX(info);
		else if (nx == columnDispRslt_col_40) doDispRslt_col_40_NX(info);
		else if (nx == columnDispRslt_col_41) doDispRslt_col_41_NX(info);
		else if (nx == columnDispRslt_col_42) doDispRslt_col_42_NX(info);
		else if (nx == columnDispRslt_col_43) doDispRslt_col_43_NX(info);
		else if (nx == columnDispRslt_col_44) doDispRslt_col_44_NX(info);
		else if (nx == columnDispRslt_col_45) doDispRslt_col_45_NX(info);
		else if (nx == columnDispRslt_col_46) doDispRslt_col_46_NX(info);
		else if (nx == columnDispRslt_col_47) doDispRslt_col_47_NX(info);
		else if (nx == columnDispRslt_col_48) doDispRslt_col_48_NX(info);
		else if (nx == columnDispRslt_col_49) doDispRslt_col_49_NX(info);
		else if (nx == columnDispRslt_col_50) doDispRslt_col_50_NX(info);
		else if (nx == columnDispRslt_col_51) doDispRslt_col_51_NX(info);
		else if (nx == columnDispRslt_col_52) doDispRslt_col_52_NX(info);
		else if (nx == columnDispRslt_col_53) doDispRslt_col_53_NX(info);
		else if (nx == columnDispRslt_col_54) doDispRslt_col_54_NX(info);
		else if (nx == columnDispRslt_col_55) doDispRslt_col_55_NX(info);
		else if (nx == columnDispRslt_col_56) doDispRslt_col_56_NX(info);
		else if (nx == columnDispRslt_col_57) doDispRslt_col_57_NX(info);
		else if (nx == columnDispRslt_col_58) doDispRslt_col_58_NX(info);
		else if (nx == columnDispRslt_col_59) doDispRslt_col_59_NX(info);
		else if (nx == columnDispRslt_col_60) doDispRslt_col_60_NX(info);
		else if (nx == columnDispRslt_col_61) doDispRslt_col_61_NX(info);
		else if (nx == columnDispRslt_col_62) doDispRslt_col_62_NX(info);
		else if (nx == columnDispRslt_col_63) doDispRslt_col_63_NX(info);
		else if (nx == columnDispRslt_col_64) doDispRslt_col_64_NX(info);
		else if (nx == columnDispRslt_col_65) doDispRslt_col_65_NX(info);
		else if (nx == columnDispRslt_col_66) doDispRslt_col_66_NX(info);
		else if (nx == columnDispRslt_col_67) doDispRslt_col_67_NX(info);
		else if (nx == columnDispRslt_col_68) doDispRslt_col_68_NX(info);
		else if (nx == columnDispRslt_col_69) doDispRslt_col_69_NX(info);
		else if (nx == columnDispRslt_col_70) doDispRslt_col_70_NX(info);
		else if (nx == columnDispRslt_col_71) doDispRslt_col_71_NX(info);
		else if (nx == columnDispRslt_col_72) doDispRslt_col_72_NX(info);
		else if (nx == columnDispRslt_col_73) doDispRslt_col_73_NX(info);
		else if (nx == columnDispRslt_col_74) doDispRslt_col_74_NX(info);
		else if (nx == columnDispRslt_col_75) doDispRslt_col_75_NX(info);
		else if (nx == columnDispRslt_col_76) doDispRslt_col_76_NX(info);
		else if (nx == columnDispRslt_col_77) doDispRslt_col_77_NX(info);
		else if (nx == columnDispRslt_col_78) doDispRslt_col_78_NX(info);
		else if (nx == columnDispRslt_col_79) doDispRslt_col_79_NX(info);
		else if (nx == columnDispRslt_col_80) doDispRslt_col_80_NX(info);
		else if (nx == columnDispRslt_col_81) doDispRslt_col_81_NX(info);
		else if (nx == columnDispRslt_col_82) doDispRslt_col_82_NX(info);
		else if (nx == columnDispRslt_col_83) doDispRslt_col_83_NX(info);
		else if (nx == columnDispRslt_col_84) doDispRslt_col_84_NX(info);
		else if (nx == columnDispRslt_col_85) doDispRslt_col_85_NX(info);
		else if (nx == columnDispRslt_col_86) doDispRslt_col_86_NX(info);
		else if (nx == columnDispRslt_col_87) doDispRslt_col_87_NX(info);
		else if (nx == columnDispRslt_col_88) doDispRslt_col_88_NX(info);
		else if (nx == columnDispRslt_col_89) doDispRslt_col_89_NX(info);
		else if (nx == columnDispRslt_col_90) doDispRslt_col_90_NX(info);
		else if (nx == columnDispRslt_col_91) doDispRslt_col_91_NX(info);
		else if (nx == columnDispRslt_col_92) doDispRslt_col_92_NX(info);
		else if (nx == columnDispRslt_col_93) doDispRslt_col_93_NX(info);
		else if (nx == columnDispRslt_col_94) doDispRslt_col_94_NX(info);
		else if (nx == columnDispRslt_col_95) doDispRslt_col_95_NX(info);
		else if (nx == columnDispRslt_col_96) doDispRslt_col_96_NX(info);
		else if (nx == columnDispRslt_col_97) doDispRslt_col_97_NX(info);
		else if (nx == columnDispRslt_col_98) doDispRslt_col_98_NX(info);
		else if (nx == columnDispRslt_col_99) doDispRslt_col_99_NX(info);
		else if (nx == columnDispRslt_ttl) doDispRslt_ttl_NX(info);
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
	 * [Cnd]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_ac_rsn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_ac_rsn_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[alc_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_flg_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ac_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ac_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ac_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_rsn_nm_NX(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_00_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_01_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_02_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_03_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_04_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_05_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_06_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_07_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_08_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_09_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_10_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_11_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_12_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_13_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_14_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_15_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_16_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_17_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_18_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_19_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_20_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_21]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_21_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_22]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_22_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_23]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_23_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_24]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_24_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_25]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_25_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_26]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_26_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_27]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_27_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_28]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_28_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_29]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_29_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_30]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_30_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_31]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_31_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_32]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_32_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_33]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_33_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_34]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_34_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_35]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_35_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_36]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_36_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_37]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_37_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_38]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_38_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_39]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_39_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_40]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_40_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_41]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_41_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_42]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_42_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_43]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_43_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_44]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_44_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_45]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_45_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_46]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_46_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_47]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_47_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_48]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_48_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_49]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_49_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_50]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_50_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_51]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_51_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_52]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_52_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_53]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_53_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_54]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_54_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_55]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_55_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_56]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_56_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_57]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_57_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_58]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_58_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_59]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_59_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_60]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_60_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_61]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_61_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_62]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_62_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_63]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_63_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_64]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_64_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_65]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_65_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_66]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_66_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_67]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_67_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_68]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_68_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_69]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_69_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_70]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_70_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_71]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_71_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_72]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_72_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_73]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_73_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_74]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_74_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_75]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_75_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_76]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_76_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_77]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_77_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_78]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_78_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_79]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_79_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_80]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_80_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_81]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_81_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_82]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_82_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_83]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_83_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_84]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_84_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_85]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_85_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_86]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_86_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_87]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_87_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_88]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_88_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_89]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_89_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_90]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_90_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_91]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_91_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_92]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_92_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_93]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_93_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_94]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_94_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_95]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_95_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_96]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_96_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_97]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_97_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_98]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_98_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_99]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_99_NX(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ttl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ttl_NX(MCEventInfo info){
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
		else if (lc == Cnd_ac_slip_typ) doCnd_ac_slip_typ_LC(info);
		else if (lc == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_LC(info);
		else if (lc == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_LC(info);
		else if (lc == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_LC(info);
		else if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_cntry_cd) doCnd_cntry_cd_LC(info);
		else if (lc == Cnd_cntry_nm) doCnd_cntry_nm_LC(info);
		else if (lc == Cnd_area_cd) doCnd_area_cd_LC(info);
		else if (lc == Cnd_area_nm) doCnd_area_nm_LC(info);
		else if (lc == Cnd_alc_dpt_cd) doCnd_alc_dpt_cd_LC(info);
		else if (lc == Cnd_alc_dpt_nm) doCnd_alc_dpt_nm_LC(info);
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
		else if (lc == columnDispRslt_alc_dpt_cd) doDispRslt_alc_dpt_cd_LC(info);
		else if (lc == columnDispRslt_alc_dpt_nm) doDispRslt_alc_dpt_nm_LC(info);
		else if (lc == columnDispRslt_ac_slip_typ) doDispRslt_ac_slip_typ_LC(info);
		else if (lc == columnDispRslt_ac_slip_typ_nm) doDispRslt_ac_slip_typ_nm_LC(info);
		else if (lc == columnDispRslt_ac_rsn_cd) doDispRslt_ac_rsn_cd_LC(info);
		else if (lc == columnDispRslt_ac_rsn_nm) doDispRslt_ac_rsn_nm_LC(info);
		else if (lc == columnDispRslt_asst_typ) doDispRslt_asst_typ_LC(info);
		else if (lc == columnDispRslt_asst_typ_nm) doDispRslt_asst_typ_nm_LC(info);
		else if (lc == columnDispRslt_unit_cd) doDispRslt_unit_cd_LC(info);
		else if (lc == columnDispRslt_unit_nm) doDispRslt_unit_nm_LC(info);
		else if (lc == columnDispRslt_dec_place) doDispRslt_dec_place_LC(info);
		else if (lc == columnDispRslt_elm_no) doDispRslt_elm_no_LC(info);
		else if (lc == columnDispRslt_elm) doDispRslt_elm_LC(info);
		else if (lc == columnDispRslt_elm_nm) doDispRslt_elm_nm_LC(info);
		else if (lc == columnDispRslt_col_00) doDispRslt_col_00_LC(info);
		else if (lc == columnDispRslt_col_01) doDispRslt_col_01_LC(info);
		else if (lc == columnDispRslt_col_02) doDispRslt_col_02_LC(info);
		else if (lc == columnDispRslt_col_03) doDispRslt_col_03_LC(info);
		else if (lc == columnDispRslt_col_04) doDispRslt_col_04_LC(info);
		else if (lc == columnDispRslt_col_05) doDispRslt_col_05_LC(info);
		else if (lc == columnDispRslt_col_06) doDispRslt_col_06_LC(info);
		else if (lc == columnDispRslt_col_07) doDispRslt_col_07_LC(info);
		else if (lc == columnDispRslt_col_08) doDispRslt_col_08_LC(info);
		else if (lc == columnDispRslt_col_09) doDispRslt_col_09_LC(info);
		else if (lc == columnDispRslt_col_10) doDispRslt_col_10_LC(info);
		else if (lc == columnDispRslt_col_11) doDispRslt_col_11_LC(info);
		else if (lc == columnDispRslt_col_12) doDispRslt_col_12_LC(info);
		else if (lc == columnDispRslt_col_13) doDispRslt_col_13_LC(info);
		else if (lc == columnDispRslt_col_14) doDispRslt_col_14_LC(info);
		else if (lc == columnDispRslt_col_15) doDispRslt_col_15_LC(info);
		else if (lc == columnDispRslt_col_16) doDispRslt_col_16_LC(info);
		else if (lc == columnDispRslt_col_17) doDispRslt_col_17_LC(info);
		else if (lc == columnDispRslt_col_18) doDispRslt_col_18_LC(info);
		else if (lc == columnDispRslt_col_19) doDispRslt_col_19_LC(info);
		else if (lc == columnDispRslt_col_20) doDispRslt_col_20_LC(info);
		else if (lc == columnDispRslt_col_21) doDispRslt_col_21_LC(info);
		else if (lc == columnDispRslt_col_22) doDispRslt_col_22_LC(info);
		else if (lc == columnDispRslt_col_23) doDispRslt_col_23_LC(info);
		else if (lc == columnDispRslt_col_24) doDispRslt_col_24_LC(info);
		else if (lc == columnDispRslt_col_25) doDispRslt_col_25_LC(info);
		else if (lc == columnDispRslt_col_26) doDispRslt_col_26_LC(info);
		else if (lc == columnDispRslt_col_27) doDispRslt_col_27_LC(info);
		else if (lc == columnDispRslt_col_28) doDispRslt_col_28_LC(info);
		else if (lc == columnDispRslt_col_29) doDispRslt_col_29_LC(info);
		else if (lc == columnDispRslt_col_30) doDispRslt_col_30_LC(info);
		else if (lc == columnDispRslt_col_31) doDispRslt_col_31_LC(info);
		else if (lc == columnDispRslt_col_32) doDispRslt_col_32_LC(info);
		else if (lc == columnDispRslt_col_33) doDispRslt_col_33_LC(info);
		else if (lc == columnDispRslt_col_34) doDispRslt_col_34_LC(info);
		else if (lc == columnDispRslt_col_35) doDispRslt_col_35_LC(info);
		else if (lc == columnDispRslt_col_36) doDispRslt_col_36_LC(info);
		else if (lc == columnDispRslt_col_37) doDispRslt_col_37_LC(info);
		else if (lc == columnDispRslt_col_38) doDispRslt_col_38_LC(info);
		else if (lc == columnDispRslt_col_39) doDispRslt_col_39_LC(info);
		else if (lc == columnDispRslt_col_40) doDispRslt_col_40_LC(info);
		else if (lc == columnDispRslt_col_41) doDispRslt_col_41_LC(info);
		else if (lc == columnDispRslt_col_42) doDispRslt_col_42_LC(info);
		else if (lc == columnDispRslt_col_43) doDispRslt_col_43_LC(info);
		else if (lc == columnDispRslt_col_44) doDispRslt_col_44_LC(info);
		else if (lc == columnDispRslt_col_45) doDispRslt_col_45_LC(info);
		else if (lc == columnDispRslt_col_46) doDispRslt_col_46_LC(info);
		else if (lc == columnDispRslt_col_47) doDispRslt_col_47_LC(info);
		else if (lc == columnDispRslt_col_48) doDispRslt_col_48_LC(info);
		else if (lc == columnDispRslt_col_49) doDispRslt_col_49_LC(info);
		else if (lc == columnDispRslt_col_50) doDispRslt_col_50_LC(info);
		else if (lc == columnDispRslt_col_51) doDispRslt_col_51_LC(info);
		else if (lc == columnDispRslt_col_52) doDispRslt_col_52_LC(info);
		else if (lc == columnDispRslt_col_53) doDispRslt_col_53_LC(info);
		else if (lc == columnDispRslt_col_54) doDispRslt_col_54_LC(info);
		else if (lc == columnDispRslt_col_55) doDispRslt_col_55_LC(info);
		else if (lc == columnDispRslt_col_56) doDispRslt_col_56_LC(info);
		else if (lc == columnDispRslt_col_57) doDispRslt_col_57_LC(info);
		else if (lc == columnDispRslt_col_58) doDispRslt_col_58_LC(info);
		else if (lc == columnDispRslt_col_59) doDispRslt_col_59_LC(info);
		else if (lc == columnDispRslt_col_60) doDispRslt_col_60_LC(info);
		else if (lc == columnDispRslt_col_61) doDispRslt_col_61_LC(info);
		else if (lc == columnDispRslt_col_62) doDispRslt_col_62_LC(info);
		else if (lc == columnDispRslt_col_63) doDispRslt_col_63_LC(info);
		else if (lc == columnDispRslt_col_64) doDispRslt_col_64_LC(info);
		else if (lc == columnDispRslt_col_65) doDispRslt_col_65_LC(info);
		else if (lc == columnDispRslt_col_66) doDispRslt_col_66_LC(info);
		else if (lc == columnDispRslt_col_67) doDispRslt_col_67_LC(info);
		else if (lc == columnDispRslt_col_68) doDispRslt_col_68_LC(info);
		else if (lc == columnDispRslt_col_69) doDispRslt_col_69_LC(info);
		else if (lc == columnDispRslt_col_70) doDispRslt_col_70_LC(info);
		else if (lc == columnDispRslt_col_71) doDispRslt_col_71_LC(info);
		else if (lc == columnDispRslt_col_72) doDispRslt_col_72_LC(info);
		else if (lc == columnDispRslt_col_73) doDispRslt_col_73_LC(info);
		else if (lc == columnDispRslt_col_74) doDispRslt_col_74_LC(info);
		else if (lc == columnDispRslt_col_75) doDispRslt_col_75_LC(info);
		else if (lc == columnDispRslt_col_76) doDispRslt_col_76_LC(info);
		else if (lc == columnDispRslt_col_77) doDispRslt_col_77_LC(info);
		else if (lc == columnDispRslt_col_78) doDispRslt_col_78_LC(info);
		else if (lc == columnDispRslt_col_79) doDispRslt_col_79_LC(info);
		else if (lc == columnDispRslt_col_80) doDispRslt_col_80_LC(info);
		else if (lc == columnDispRslt_col_81) doDispRslt_col_81_LC(info);
		else if (lc == columnDispRslt_col_82) doDispRslt_col_82_LC(info);
		else if (lc == columnDispRslt_col_83) doDispRslt_col_83_LC(info);
		else if (lc == columnDispRslt_col_84) doDispRslt_col_84_LC(info);
		else if (lc == columnDispRslt_col_85) doDispRslt_col_85_LC(info);
		else if (lc == columnDispRslt_col_86) doDispRslt_col_86_LC(info);
		else if (lc == columnDispRslt_col_87) doDispRslt_col_87_LC(info);
		else if (lc == columnDispRslt_col_88) doDispRslt_col_88_LC(info);
		else if (lc == columnDispRslt_col_89) doDispRslt_col_89_LC(info);
		else if (lc == columnDispRslt_col_90) doDispRslt_col_90_LC(info);
		else if (lc == columnDispRslt_col_91) doDispRslt_col_91_LC(info);
		else if (lc == columnDispRslt_col_92) doDispRslt_col_92_LC(info);
		else if (lc == columnDispRslt_col_93) doDispRslt_col_93_LC(info);
		else if (lc == columnDispRslt_col_94) doDispRslt_col_94_LC(info);
		else if (lc == columnDispRslt_col_95) doDispRslt_col_95_LC(info);
		else if (lc == columnDispRslt_col_96) doDispRslt_col_96_LC(info);
		else if (lc == columnDispRslt_col_97) doDispRslt_col_97_LC(info);
		else if (lc == columnDispRslt_col_98) doDispRslt_col_98_LC(info);
		else if (lc == columnDispRslt_col_99) doDispRslt_col_99_LC(info);
		else if (lc == columnDispRslt_ttl) doDispRslt_ttl_LC(info);
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
	 * [Cnd]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ac_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ac_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ac_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ac_rsn_nm_LC(MCEventInfo info){
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
	 * [DispRslt]パネルの[col_00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_00_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_01_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_02_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_03_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_04_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_05_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_06_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_07_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_08_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_09_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_10_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_11_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_12_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_13_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_14_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_15_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_16_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_17_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_18_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_19_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_20_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_21]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_21_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_22]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_22_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_23]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_23_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_24]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_24_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_25]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_25_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_26]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_26_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_27]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_27_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_28]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_28_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_29]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_29_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_30]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_30_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_31]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_31_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_32]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_32_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_33]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_33_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_34]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_34_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_35]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_35_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_36]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_36_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_37]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_37_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_38]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_38_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_39]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_39_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_40]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_40_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_41]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_41_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_42]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_42_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_43]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_43_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_44]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_44_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_45]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_45_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_46]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_46_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_47]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_47_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_48]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_48_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_49]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_49_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_50]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_50_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_51]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_51_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_52]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_52_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_53]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_53_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_54]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_54_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_55]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_55_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_56]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_56_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_57]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_57_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_58]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_58_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_59]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_59_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_60]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_60_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_61]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_61_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_62]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_62_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_63]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_63_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_64]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_64_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_65]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_65_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_66]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_66_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_67]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_67_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_68]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_68_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_69]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_69_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_70]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_70_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_71]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_71_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_72]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_72_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_73]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_73_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_74]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_74_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_75]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_75_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_76]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_76_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_77]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_77_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_78]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_78_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_79]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_79_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_80]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_80_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_81]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_81_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_82]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_82_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_83]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_83_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_84]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_84_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_85]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_85_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_86]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_86_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_87]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_87_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_88]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_88_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_89]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_89_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_90]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_90_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_91]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_91_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_92]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_92_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_93]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_93_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_94]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_94_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_95]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_95_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_96]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_96_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_97]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_97_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_98]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_98_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[col_99]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_col_99_LC(MCEventInfo info){
	}

	/**
	 * [DispRslt]パネルの[ttl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispRslt_ttl_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_ac_slip_typ]の作成メソッド
	 */
	public MCList getCnd_ac_slip_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcSlipTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_ac_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcRsn(row, info);
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
	 * コンボ／リストのリスト[Cnd_alc_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_alc_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
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
		if (id.equals("MG.MGBFL0470.Srch01")) {
			return new MG_MGBFL0470_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBFL0470_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0470_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0470_Srch01;

		/** コンストラクタ */
		protected MG_MGBFL0470_Srch01Bridge() {
			p_MG_MGBFL0470_Srch01 = new MCParam(PDef.MG_MGBFL0470_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0470_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBF.MGBFP0470.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0470.RsltR.class));

			p_MG_MGBFL0470_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0470_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0470_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0470_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0470_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBF.MGBFP0470.CndR up0() {
			return (mcframe.clientMGBF.MGBFP0470.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBF.MGBFP0470.RsltR> down0() {
			return (MCList<mcframe.clientMGBF.MGBFP0470.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0470_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0470.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0470_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBF.MGBFP0470.RsltR>)p_MG_MGBFL0470_Srch01.getContainerParam().getDownBlock(0));
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