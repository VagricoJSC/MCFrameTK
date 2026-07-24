package mcframe.clientMGBB.MGBBP0170;

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
import mcframe.clientMGBB.MGBBP0170.MGBBP_ActSlsSrch_MC.MG_MGBBL0170_Srch01Caller;

/**
 * 画面"MGBBP_ActSlsSrch"パネルクラスです。<p>
 *
 * 売上実績を照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBBP_ActSlsSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBBP0170";

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
	public MCLabel Cnd_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_ctg_nm = null;
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
	public MCLabel Cnd_act_sls_id_Label = null;
	/**
	 * Sales result ID 売上実績ＩＤ.<p>
	 *
	 */
	public MCTextField Cnd_act_sls_id = null;
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
	public MCLabel Cnd_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_no = null;
	/**
	 * No sales order No. 受注ＮＯ無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_slo_no_flg = null;
	public MCLabel Cnd_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_iv_no = null;
	/**
	 * No invoice No. インボイスＮＯ無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_iv_no_flg = null;
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
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sls_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCTextField Cnd_sls_usr_nm = null;
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
	/**
	 * Company holding inventory not exist 在庫先無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_stk_bp_flg = null;
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
	public MCLabel Cnd_rec_eval_typ_Label = null;
	/**
	 * Individual evaluation type 個別評価区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_rec_eval_typ = null;
	/**
	 * Individual evaluation type name 個別評価区分名.<p>
	 *
	 */
	public MCTextField Cnd_rec_eval_typ_nm = null;
	public MCLabel Cnd_rmrks_Label = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCTextField Cnd_rmrks = null;
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
	 * Calculation category 計算カテゴリ.<p>
	 *
	 */
	public MCCheckBox Cnd_calc_ctg_flg = null;
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCCheckBox Cnd_ym_flg = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCCheckBox Cnd_ac_dt_flg = null;
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
	public MCCheckBox Cnd_asst_typ_flg = null;
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
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_slo_no_flg = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_no_flg = null;
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
	 * Company holding inventory 在庫先.<p>
	 *
	 */
	public MCCheckBox Cnd_stk_bp_flg = null;
	/**
	 * Allocation dept. 配賦部門.<p>
	 *
	 */
	public MCCheckBox Cnd_alc_dpt_flg = null;
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
	 * Transaction currency 取引通貨.<p>
	 *
	 */
	public MCCheckBox Cnd_trd_cur_flg = null;
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCCheckBox Cnd_xrate_flg = null;
	/**
	 * Individual evaluation type 個別評価区分.<p>
	 *
	 */
	public MCCheckBox Cnd_rec_eval_typ_flg = null;
	/**
	 * Sales result ID 売上実績ＩＤ.<p>
	 *
	 */
	public MCCheckBox Cnd_alc_sls_id_flg = null;
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
	// [Cnd4]ブロック関連のField定義
	public MCPanel Cnd4Panel = null;
	// [Cnd4]ブロックの項目のField定義
	// [Ttl]ブロック関連のField定義
	public MCPanel TtlPanel = null;
	// [Ttl]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBB.MGBBP0170.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_ctg_nm = null;
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
	 * Year month 年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ym = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mng_dpt_cd = null;
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mng_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_nm = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_jnl_nm = null;
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd1 = null;
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm1 = null;
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd2 = null;
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm2 = null;
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd3 = null;
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm3 = null;
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd4 = null;
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm4 = null;
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd5 = null;
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm5 = null;
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd6 = null;
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm6 = null;
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd7 = null;
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm7 = null;
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd8 = null;
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm8 = null;
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd9 = null;
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm9 = null;
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_cd10 = null;
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_grp_nm10 = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_no = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno1 = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno2 = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno3 = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno4 = null;
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_slip_typ = null;
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_slip_typ_nm = null;
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_rsn_cd = null;
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_rsn_nm = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asst_typ_nm = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_nm = null;
	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_cd1 = null;
	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_nm1 = null;
	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_cd2 = null;
	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_nm2 = null;
	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_cd3 = null;
	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_nm3 = null;
	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_cd4 = null;
	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_nm4 = null;
	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_cd5 = null;
	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_nm5 = null;
	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_cd6 = null;
	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_nm6 = null;
	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_cd7 = null;
	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_nm7 = null;
	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_cd8 = null;
	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_nm8 = null;
	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_cd9 = null;
	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_nm9 = null;
	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_cd10 = null;
	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_grp_nm10 = null;
	/**
	 * Country cd. (Customer) 国ＣＤ（得意先）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_cntry_cd = null;
	/**
	 * Country name (Customer) 国名（得意先）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_cntry_nm = null;
	/**
	 * Region cd. (Customer) 地域ＣＤ（得意先）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_area_cd = null;
	/**
	 * Region name (Customer) 地域名（得意先）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_area_nm = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_nm = null;
	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_cd1 = null;
	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_nm1 = null;
	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_cd2 = null;
	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_nm2 = null;
	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_cd3 = null;
	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_nm3 = null;
	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_cd4 = null;
	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_nm4 = null;
	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_cd5 = null;
	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_nm5 = null;
	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_cd6 = null;
	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_nm6 = null;
	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_cd7 = null;
	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_nm7 = null;
	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_cd8 = null;
	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_nm8 = null;
	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_cd9 = null;
	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_nm9 = null;
	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_cd10 = null;
	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_grp_nm10 = null;
	/**
	 * Country cd. (Delivery) 国ＣＤ（納品先）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_cntry_cd = null;
	/**
	 * Country name (Delivery) 国名（納品先）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_cntry_nm = null;
	/**
	 * Region cd. (Delivery) 地域ＣＤ（納品先）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_area_cd = null;
	/**
	 * Region name (Delivery) 地域名（納品先）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_area_nm = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_no = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_p_PPanel;
	public MCColumnConfig columnRslt_qty;// [Rslt]の[qty_p.qty]を[columnRslt_qty]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dec_place = null;
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
	public MCColumnConfig columnRslt_trd_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_amt;// [Rslt]の[trd_amt_p.amt]を[columnRslt_trd_cur_amt]としてエイリアス定義。
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_amt_p_PPanel;
	public MCColumnConfig columnRslt_amt;// [Rslt]の[amt_p.amt]を[columnRslt_amt]としてエイリアス定義。
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dpt_nm = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_usr_nm = null;
	/**
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_bp_cd = null;
	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_bp_nm = null;
	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_dpt_cd = null;
	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_dpt_nm = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先１名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_nm1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先２名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_nm2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先３名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_nm3 = null;
	/**
	 * Sales classification cd. 1 売上分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cost_sls_cd1 = null;
	/**
	 * Sales classification name 1 売上分類名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cost_sls_nm1 = null;
	/**
	 * Sales classification cd. 2 売上分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cost_sls_cd2 = null;
	/**
	 * Sales classification name 2 売上分類名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cost_sls_nm2 = null;
	/**
	 * Sales classification cd. 3 売上分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cost_sls_cd3 = null;
	/**
	 * Sales classification name 3 売上分類名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cost_sls_nm3 = null;
	/**
	 * Sales classification cd. 4 売上分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cost_sls_cd4 = null;
	/**
	 * Sales classification name 4 売上分類名４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cost_sls_nm4 = null;
	/**
	 * Sales classification cd. 5 売上分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cost_sls_cd5 = null;
	/**
	 * Sales classification name 5 売上分類名５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cost_sls_nm5 = null;
	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_val1 = null;
	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_val2 = null;
	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_val3 = null;
	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_val4 = null;
	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_val5 = null;
	/**
	 * Individual evaluation type 個別評価区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rec_eval_typ = null;
	/**
	 * Individual evaluation type name 個別評価区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rec_eval_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_expns_amt_p_PPanel;
	public MCColumnConfig columnRslt_expns_amt;// [Rslt]の[expns_amt_p.amt]を[columnRslt_expns_amt]としてエイリアス定義。
	/**
	 * Zero evaluation ゼロ評価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_zero_effect_flg = null;
	/**
	 * Sales result ID 売上実績ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_sls_id = null;
	/**
	 * Sales result ID branch No. 売上実績ＩＤ枝番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_sls_id_sub = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rmrks = null;
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
	 * Manual cost adjustment entry 費目別原価登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0200 = null;
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
	
	/** [MG_MGBBL0170_Srch01]のCallerの作成 */
	protected MGBBP_ActSlsSrch_MC.MG_MGBBL0170_Srch01Caller createMG_MGBBL0170_Srch01() {
		MGBBP_ActSlsSrch_MC.MG_MGBBL0170_Srch01Caller<MGBBP_ActSlsSrch, MG_MGBBL0170_Srch01Bridge>
		caller = ((MGBBP_ActSlsSrch_MC)this).new MG_MGBBL0170_Srch01Caller<MGBBP_ActSlsSrch, MG_MGBBL0170_Srch01Bridge>(
					(MGBBP_ActSlsSrch)this, new MG_MGBBL0170_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBBL0170_Srch01]の呼び出し */
	protected void callMG_MGBBL0170_Srch01() {
		MCCaller caller = createMG_MGBBL0170_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBB.MGBBP0170.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBB.MGBBP0170.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBB.MGBBP0170.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0170.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0170.CndR createCndR() {
		return mcframe.clientMGBB.MGBBP0170.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBB.MGBBP0170.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBB.MGBBP0170.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBB.MGBBP0170.RsltR createRsltR() {
		return mcframe.clientMGBB.MGBBP0170.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBB.MGBBP0170.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBB.MGBBP0170.RsltR.class);
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
		ret.add(Tab5Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(Cnd3Panel);
		ret.add(Cnd4Panel);
		ret.add(TtlPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_ActSlsSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBBP_ActSlsSrch_MC_A(String name) {
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
		MGBBP_ActSlsSrch_MC.jbCreateTop((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbCreateFold((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbCreateTab1((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbCreateTab2((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbCreateTab3((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbCreateTab4((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbCreateTab5((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbCreateCnd((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbCreateCnd2((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbCreateCnd3((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbCreateCnd4((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbCreateTtl((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbCreateCtrl((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbCreateRslt((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbCreateBtn((MGBBP_ActSlsSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBBP_ActSlsSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBBP_ActSlsSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBBP_ActSlsSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBBP_ActSlsSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MGBBP_ActSlsSrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MGBBP_ActSlsSrch p) {
	}

	/**
	 * [Tab5]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab5(MGBBP_ActSlsSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBBP_ActSlsSrch p) {
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
	protected static void jbCreateCnd2(MGBBP_ActSlsSrch p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MGBBP_ActSlsSrch p) {
	}

	/**
	 * [Cnd4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd4(MGBBP_ActSlsSrch p) {
	}

	/**
	 * [Ttl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTtl(MGBBP_ActSlsSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBBP_ActSlsSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBBP_ActSlsSrch p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBB.MGBBP0170.RsltR.$itm_p);
		p.Rslt_itm_p_PPanel.setName("Rslt.itm_p");
		p.columnRslt_itm_cd = p.Rslt_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_itm_cd.addAliasName("Rslt.itm_cd", p);
		p.columnRslt_itm_sub1 = p.Rslt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_itm_sub1.addAliasName("Rslt.itm_sub1", p);
		p.columnRslt_itm_sub2 = p.Rslt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_itm_sub2.addAliasName("Rslt.itm_sub2", p);
		p.columnRslt_itm_sub3 = p.Rslt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_itm_sub3.addAliasName("Rslt.itm_sub3", p);
		p.columnRslt_itm_nm = p.Rslt_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_itm_nm.addAliasName("Rslt.itm_nm", p);
		p.Rslt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBB.MGBBP0170.RsltR.$qty_p);
		p.Rslt_qty_p_PPanel.setName("Rslt.qty_p");
		p.columnRslt_qty = p.Rslt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_qty.addAliasName("Rslt.qty", p);
		p.Rslt_trd_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBB.MGBBP0170.RsltR.$trd_amt_p);
		p.Rslt_trd_amt_p_PPanel.setName("Rslt.trd_amt_p");
		p.columnRslt_trd_cur_amt = p.Rslt_trd_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_amt.addAliasName("Rslt.trd_cur_amt", p);
		p.Rslt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBB.MGBBP0170.RsltR.$amt_p);
		p.Rslt_amt_p_PPanel.setName("Rslt.amt_p");
		p.columnRslt_amt = p.Rslt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_amt.addAliasName("Rslt.amt", p);
		p.Rslt_expns_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBB.MGBBP0170.RsltR.$expns_amt_p);
		p.Rslt_expns_amt_p_PPanel.setName("Rslt.expns_amt_p");
		p.columnRslt_expns_amt = p.Rslt_expns_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_expns_amt.addAliasName("Rslt.expns_amt", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBBP_ActSlsSrch p) {
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

	
	/** [Cnd_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_ctg_cd_p = null;

	/**
	 * [Cnd_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_ctg_cd_ListPutter() {
		if (Cnd_calc_ctg_cd_p == null) {
			Cnd_calc_ctg_cd_p = createCnd_calc_ctg_cd_ListPutter(Cnd_calc_ctg_cd, "calc_ctg_cd", "calc_ctg_nm");

		}
		return Cnd_calc_ctg_cd_p;
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
	
	
	/** [Cnd_rec_eval_typ_ListPutter]の定義 */
	private MCListPutter Cnd_rec_eval_typ_p = null;

	/**
	 * [Cnd_rec_eval_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rec_eval_typ_ListPutter() {
		if (Cnd_rec_eval_typ_p == null) {
			Cnd_rec_eval_typ_p = createCnd_rec_eval_typ_ListPutter(Cnd_rec_eval_typ, "rec_eval_typ", "rec_eval_typ_nm");

		}
		return Cnd_rec_eval_typ_p;
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
	public static MGBBP_ActSlsSrch create(){
		MGBBP_ActSlsSrch p = new MGBBP_ActSlsSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBBP_ActSlsSrch create(String name){
		MGBBP_ActSlsSrch p = new MGBBP_ActSlsSrch(name);
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
		MGBBP_ActSlsSrch_MC.jbfInitTop((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbfInitFold((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbfInitTab1((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbfInitTab2((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbfInitTab3((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbfInitTab4((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbfInitTab5((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbfInitCnd((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbfInitCnd2((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbfInitCnd3((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbfInitCnd4((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbfInitTtl((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbfInitCtrl((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbfInitRslt((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbfInitBtn((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbInitTop((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbInitFold((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbInitTab1((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbInitTab2((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbInitTab3((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbInitTab4((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbInitTab5((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbInitCnd((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbInitCnd2((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbInitCnd3((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbInitCnd4((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbInitTtl((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbInitCtrl((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbInitRslt((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.jbInitBtn((MGBBP_ActSlsSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBBP_ActSlsSrch p) {
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
	protected static void jbfInitTab1(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab5(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.Tab5Panel = p.beansFactory.createPanel("Tab5");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.calc_ctg_cd_Label");
		p.Cnd_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.calc_ctg_cd");
		p.Cnd_calc_ctg_cd.setLabel(p.Cnd_calc_ctg_cd_Label);
		p.Cnd_calc_ctg_nm = p.beansFactory.createTextField("Cnd.calc_ctg_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_ym_fr_Label = p.beansFactory.createLabel("Cnd.ym_fr_Label");
		p.Cnd_ym_fr = p.beansFactory.createDateField("Cnd.ym_fr");
		p.Cnd_ym_fr.setLabel(p.Cnd_ym_fr_Label);
		p.Cnd_ym_to_Label = p.beansFactory.createLabel("Cnd.ym_to_Label");
		p.Cnd_ym_to = p.beansFactory.createDateField("Cnd.ym_to");
		p.Cnd_ym_to.setLabel(p.Cnd_ym_to_Label);
		p.Cnd_mng_dpt_cd_Label = p.beansFactory.createLabel("Cnd.mng_dpt_cd_Label");
		p.Cnd_mng_dpt_cd = p.beansFactory.createTextComboBox("Cnd.mng_dpt_cd");
		p.Cnd_mng_dpt_cd.setLabel(p.Cnd_mng_dpt_cd_Label);
		p.Cnd_mng_dpt_nm = p.beansFactory.createTextField("Cnd.mng_dpt_nm");
		p.Cnd_asst_typ_Label = p.beansFactory.createLabel("Cnd.asst_typ_Label");
		p.Cnd_asst_typ = p.beansFactory.createTextComboBox("Cnd.asst_typ");
		p.Cnd_asst_typ.setLabel(p.Cnd_asst_typ_Label);
		p.Cnd_asst_typ_nm = p.beansFactory.createTextField("Cnd.asst_typ_nm");
		p.Cnd_act_sls_id_Label = p.beansFactory.createLabel("Cnd.act_sls_id_Label");
		p.Cnd_act_sls_id = p.beansFactory.createTextField("Cnd.act_sls_id");
		p.Cnd_act_sls_id.setLabel(p.Cnd_act_sls_id_Label);
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
		p.Cnd_ac_slip_typ_Label = p.beansFactory.createLabel("Cnd.ac_slip_typ_Label");
		p.Cnd_ac_slip_typ = p.beansFactory.createTextComboBox("Cnd.ac_slip_typ");
		p.Cnd_ac_slip_typ.setLabel(p.Cnd_ac_slip_typ_Label);
		p.Cnd_ac_slip_typ_nm = p.beansFactory.createTextField("Cnd.ac_slip_typ_nm");
		p.Cnd_ac_rsn_cd_Label = p.beansFactory.createLabel("Cnd.ac_rsn_cd_Label");
		p.Cnd_ac_rsn_cd = p.beansFactory.createTextComboBox("Cnd.ac_rsn_cd");
		p.Cnd_ac_rsn_cd.setLabel(p.Cnd_ac_rsn_cd_Label);
		p.Cnd_ac_rsn_nm = p.beansFactory.createTextField("Cnd.ac_rsn_nm");
		p.Cnd_no_ac_rsn_flg = p.beansFactory.createCheckBox("Cnd.no_ac_rsn_flg");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
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
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_no_slo_no_flg = p.beansFactory.createCheckBox("Cnd.no_slo_no_flg");
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_no_iv_no_flg = p.beansFactory.createCheckBox("Cnd.no_iv_no_flg");
		p.Cnd_sls_dpt_cd_Label = p.beansFactory.createLabel("Cnd.sls_dpt_cd_Label");
		p.Cnd_sls_dpt_cd = p.beansFactory.createTextComboBox("Cnd.sls_dpt_cd");
		p.Cnd_sls_dpt_cd.setLabel(p.Cnd_sls_dpt_cd_Label);
		p.Cnd_sls_dpt_nm = p.beansFactory.createTextField("Cnd.sls_dpt_nm");
		p.Cnd_sls_usr_cd_Label = p.beansFactory.createLabel("Cnd.sls_usr_cd_Label");
		p.Cnd_sls_usr_cd = p.beansFactory.createTextField("Cnd.sls_usr_cd");
		p.Cnd_sls_usr_cd.setLabel(p.Cnd_sls_usr_cd_Label);
		p.Cnd_sls_usr_nm = p.beansFactory.createTextField("Cnd.sls_usr_nm");
		p.Cnd_stk_bp_cd_Label = p.beansFactory.createLabel("Cnd.stk_bp_cd_Label");
		p.Cnd_stk_bp_cd = p.beansFactory.createTextField("Cnd.stk_bp_cd");
		p.Cnd_stk_bp_cd.setLabel(p.Cnd_stk_bp_cd_Label);
		p.Cnd_stk_bp_nm = p.beansFactory.createTextField("Cnd.stk_bp_nm");
		p.Cnd_no_stk_bp_flg = p.beansFactory.createCheckBox("Cnd.no_stk_bp_flg");
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
		p.Cnd_rec_eval_typ_Label = p.beansFactory.createLabel("Cnd.rec_eval_typ_Label");
		p.Cnd_rec_eval_typ = p.beansFactory.createTextComboBox("Cnd.rec_eval_typ");
		p.Cnd_rec_eval_typ.setLabel(p.Cnd_rec_eval_typ_Label);
		p.Cnd_rec_eval_typ_nm = p.beansFactory.createTextField("Cnd.rec_eval_typ_nm");
		p.Cnd_rmrks_Label = p.beansFactory.createLabel("Cnd.rmrks_Label");
		p.Cnd_rmrks = p.beansFactory.createTextField("Cnd.rmrks");
		p.Cnd_rmrks.setLabel(p.Cnd_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
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
		p.Cnd_calc_ctg_flg = p.beansFactory.createCheckBox("Cnd.calc_ctg_flg");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_ym_flg = p.beansFactory.createCheckBox("Cnd.ym_flg");
		p.Cnd_ac_dt_flg = p.beansFactory.createCheckBox("Cnd.ac_dt_flg");
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
		p.Cnd_asst_typ_flg = p.beansFactory.createCheckBox("Cnd.asst_typ_flg");
		p.Cnd_ac_slip_typ_flg = p.beansFactory.createCheckBox("Cnd.ac_slip_typ_flg");
		p.Cnd_ac_rsn_flg = p.beansFactory.createCheckBox("Cnd.ac_rsn_flg");
		p.Cnd_slo_no_flg = p.beansFactory.createCheckBox("Cnd.slo_no_flg");
		p.Cnd_iv_no_flg = p.beansFactory.createCheckBox("Cnd.iv_no_flg");
		p.Cnd_sls_dpt_flg = p.beansFactory.createCheckBox("Cnd.sls_dpt_flg");
		p.Cnd_sls_usr_flg = p.beansFactory.createCheckBox("Cnd.sls_usr_flg");
		p.Cnd_stk_bp_flg = p.beansFactory.createCheckBox("Cnd.stk_bp_flg");
		p.Cnd_alc_dpt_flg = p.beansFactory.createCheckBox("Cnd.alc_dpt_flg");
		p.Cnd_cst_flg = p.beansFactory.createCheckBox("Cnd.cst_flg");
		p.Cnd_cst_cntry_flg = p.beansFactory.createCheckBox("Cnd.cst_cntry_flg");
		p.Cnd_cst_area_flg = p.beansFactory.createCheckBox("Cnd.cst_area_flg");
		p.Cnd_dlv_flg = p.beansFactory.createCheckBox("Cnd.dlv_flg");
		p.Cnd_dlv_cntry_flg = p.beansFactory.createCheckBox("Cnd.dlv_cntry_flg");
		p.Cnd_dlv_area_flg = p.beansFactory.createCheckBox("Cnd.dlv_area_flg");
		p.Cnd_dest1_flg = p.beansFactory.createCheckBox("Cnd.dest1_flg");
		p.Cnd_dest2_flg = p.beansFactory.createCheckBox("Cnd.dest2_flg");
		p.Cnd_dest3_flg = p.beansFactory.createCheckBox("Cnd.dest3_flg");
		p.Cnd_cost_sls1_flg = p.beansFactory.createCheckBox("Cnd.cost_sls1_flg");
		p.Cnd_cost_sls2_flg = p.beansFactory.createCheckBox("Cnd.cost_sls2_flg");
		p.Cnd_cost_sls3_flg = p.beansFactory.createCheckBox("Cnd.cost_sls3_flg");
		p.Cnd_cost_sls4_flg = p.beansFactory.createCheckBox("Cnd.cost_sls4_flg");
		p.Cnd_cost_sls5_flg = p.beansFactory.createCheckBox("Cnd.cost_sls5_flg");
		p.Cnd_trd_cur_flg = p.beansFactory.createCheckBox("Cnd.trd_cur_flg");
		p.Cnd_xrate_flg = p.beansFactory.createCheckBox("Cnd.xrate_flg");
		p.Cnd_rec_eval_typ_flg = p.beansFactory.createCheckBox("Cnd.rec_eval_typ_flg");
		p.Cnd_alc_sls_id_flg = p.beansFactory.createCheckBox("Cnd.alc_sls_id_flg");
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
		p.Cnd_cur_cd = p.beansFactory.createTextField("Cnd.cur_cd");
		p.Cnd_amt_dec_place = p.beansFactory.createNumberField("Cnd.amt_dec_place");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd4(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.Cnd4Panel = p.beansFactory.createPanel("Cnd4");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTtl(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.TtlPanel = p.beansFactory.createPanel("Ttl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_calc_ctg_cd = p.beansFactory.createTableColumn("Rslt.calc_ctg_cd", MCColumnType.TEXT);
		p.columnRslt_calc_ctg_nm = p.beansFactory.createTableColumn("Rslt.calc_ctg_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_ym = p.beansFactory.createTableColumn("Rslt.ym", MCColumnType.DATE);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_mng_dpt_cd = p.beansFactory.createTableColumn("Rslt.mng_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_mng_dpt_nm = p.beansFactory.createTableColumn("Rslt.mng_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_itm_jnl_cd = p.beansFactory.createTableColumn("Rslt.itm_jnl_cd", MCColumnType.TEXT);
		p.columnRslt_itm_jnl_nm = p.beansFactory.createTableColumn("Rslt.itm_jnl_nm", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd1 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd1", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm1 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm1", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd2 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd2", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm2 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm2", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd3 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd3", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm3 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm3", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd4 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd4", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm4 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm4", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd5 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd5", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm5 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm5", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd6 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd6", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm6 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm6", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd7 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd7", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm7 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm7", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd8 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd8", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm8 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm8", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd9 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd9", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm9 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm9", MCColumnType.TEXT);
		p.columnRslt_itm_grp_cd10 = p.beansFactory.createTableColumn("Rslt.itm_grp_cd10", MCColumnType.TEXT);
		p.columnRslt_itm_grp_nm10 = p.beansFactory.createTableColumn("Rslt.itm_grp_nm10", MCColumnType.TEXT);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_sno1 = p.beansFactory.createTableColumn("Rslt.sno1", MCColumnType.TEXT);
		p.columnRslt_sno2 = p.beansFactory.createTableColumn("Rslt.sno2", MCColumnType.TEXT);
		p.columnRslt_sno3 = p.beansFactory.createTableColumn("Rslt.sno3", MCColumnType.TEXT);
		p.columnRslt_sno4 = p.beansFactory.createTableColumn("Rslt.sno4", MCColumnType.TEXT);
		p.columnRslt_ac_slip_typ = p.beansFactory.createTableColumn("Rslt.ac_slip_typ", MCColumnType.TEXT);
		p.columnRslt_ac_slip_typ_nm = p.beansFactory.createTableColumn("Rslt.ac_slip_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ac_rsn_cd = p.beansFactory.createTableColumn("Rslt.ac_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_ac_rsn_nm = p.beansFactory.createTableColumn("Rslt.ac_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_asst_typ = p.beansFactory.createTableColumn("Rslt.asst_typ", MCColumnType.TEXT);
		p.columnRslt_asst_typ_nm = p.beansFactory.createTableColumn("Rslt.asst_typ_nm", MCColumnType.TEXT);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_cst_grp_cd1 = p.beansFactory.createTableColumn("Rslt.cst_grp_cd1", MCColumnType.TEXT);
		p.columnRslt_cst_grp_nm1 = p.beansFactory.createTableColumn("Rslt.cst_grp_nm1", MCColumnType.TEXT);
		p.columnRslt_cst_grp_cd2 = p.beansFactory.createTableColumn("Rslt.cst_grp_cd2", MCColumnType.TEXT);
		p.columnRslt_cst_grp_nm2 = p.beansFactory.createTableColumn("Rslt.cst_grp_nm2", MCColumnType.TEXT);
		p.columnRslt_cst_grp_cd3 = p.beansFactory.createTableColumn("Rslt.cst_grp_cd3", MCColumnType.TEXT);
		p.columnRslt_cst_grp_nm3 = p.beansFactory.createTableColumn("Rslt.cst_grp_nm3", MCColumnType.TEXT);
		p.columnRslt_cst_grp_cd4 = p.beansFactory.createTableColumn("Rslt.cst_grp_cd4", MCColumnType.TEXT);
		p.columnRslt_cst_grp_nm4 = p.beansFactory.createTableColumn("Rslt.cst_grp_nm4", MCColumnType.TEXT);
		p.columnRslt_cst_grp_cd5 = p.beansFactory.createTableColumn("Rslt.cst_grp_cd5", MCColumnType.TEXT);
		p.columnRslt_cst_grp_nm5 = p.beansFactory.createTableColumn("Rslt.cst_grp_nm5", MCColumnType.TEXT);
		p.columnRslt_cst_grp_cd6 = p.beansFactory.createTableColumn("Rslt.cst_grp_cd6", MCColumnType.TEXT);
		p.columnRslt_cst_grp_nm6 = p.beansFactory.createTableColumn("Rslt.cst_grp_nm6", MCColumnType.TEXT);
		p.columnRslt_cst_grp_cd7 = p.beansFactory.createTableColumn("Rslt.cst_grp_cd7", MCColumnType.TEXT);
		p.columnRslt_cst_grp_nm7 = p.beansFactory.createTableColumn("Rslt.cst_grp_nm7", MCColumnType.TEXT);
		p.columnRslt_cst_grp_cd8 = p.beansFactory.createTableColumn("Rslt.cst_grp_cd8", MCColumnType.TEXT);
		p.columnRslt_cst_grp_nm8 = p.beansFactory.createTableColumn("Rslt.cst_grp_nm8", MCColumnType.TEXT);
		p.columnRslt_cst_grp_cd9 = p.beansFactory.createTableColumn("Rslt.cst_grp_cd9", MCColumnType.TEXT);
		p.columnRslt_cst_grp_nm9 = p.beansFactory.createTableColumn("Rslt.cst_grp_nm9", MCColumnType.TEXT);
		p.columnRslt_cst_grp_cd10 = p.beansFactory.createTableColumn("Rslt.cst_grp_cd10", MCColumnType.TEXT);
		p.columnRslt_cst_grp_nm10 = p.beansFactory.createTableColumn("Rslt.cst_grp_nm10", MCColumnType.TEXT);
		p.columnRslt_cst_cntry_cd = p.beansFactory.createTableColumn("Rslt.cst_cntry_cd", MCColumnType.TEXT);
		p.columnRslt_cst_cntry_nm = p.beansFactory.createTableColumn("Rslt.cst_cntry_nm", MCColumnType.TEXT);
		p.columnRslt_cst_area_cd = p.beansFactory.createTableColumn("Rslt.cst_area_cd", MCColumnType.TEXT);
		p.columnRslt_cst_area_nm = p.beansFactory.createTableColumn("Rslt.cst_area_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_cd = p.beansFactory.createTableColumn("Rslt.dlv_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_nm = p.beansFactory.createTableColumn("Rslt.dlv_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_cd1 = p.beansFactory.createTableColumn("Rslt.dlv_grp_cd1", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_nm1 = p.beansFactory.createTableColumn("Rslt.dlv_grp_nm1", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_cd2 = p.beansFactory.createTableColumn("Rslt.dlv_grp_cd2", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_nm2 = p.beansFactory.createTableColumn("Rslt.dlv_grp_nm2", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_cd3 = p.beansFactory.createTableColumn("Rslt.dlv_grp_cd3", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_nm3 = p.beansFactory.createTableColumn("Rslt.dlv_grp_nm3", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_cd4 = p.beansFactory.createTableColumn("Rslt.dlv_grp_cd4", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_nm4 = p.beansFactory.createTableColumn("Rslt.dlv_grp_nm4", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_cd5 = p.beansFactory.createTableColumn("Rslt.dlv_grp_cd5", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_nm5 = p.beansFactory.createTableColumn("Rslt.dlv_grp_nm5", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_cd6 = p.beansFactory.createTableColumn("Rslt.dlv_grp_cd6", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_nm6 = p.beansFactory.createTableColumn("Rslt.dlv_grp_nm6", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_cd7 = p.beansFactory.createTableColumn("Rslt.dlv_grp_cd7", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_nm7 = p.beansFactory.createTableColumn("Rslt.dlv_grp_nm7", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_cd8 = p.beansFactory.createTableColumn("Rslt.dlv_grp_cd8", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_nm8 = p.beansFactory.createTableColumn("Rslt.dlv_grp_nm8", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_cd9 = p.beansFactory.createTableColumn("Rslt.dlv_grp_cd9", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_nm9 = p.beansFactory.createTableColumn("Rslt.dlv_grp_nm9", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_cd10 = p.beansFactory.createTableColumn("Rslt.dlv_grp_cd10", MCColumnType.TEXT);
		p.columnRslt_dlv_grp_nm10 = p.beansFactory.createTableColumn("Rslt.dlv_grp_nm10", MCColumnType.TEXT);
		p.columnRslt_dlv_cntry_cd = p.beansFactory.createTableColumn("Rslt.dlv_cntry_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_cntry_nm = p.beansFactory.createTableColumn("Rslt.dlv_cntry_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_area_cd = p.beansFactory.createTableColumn("Rslt.dlv_area_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_area_nm = p.beansFactory.createTableColumn("Rslt.dlv_area_nm", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_unit_cd = p.beansFactory.createTableColumn("Rslt.unit_cd", MCColumnType.TEXT);
		p.columnRslt_unit_nm = p.beansFactory.createTableColumn("Rslt.unit_nm", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_sls_dpt_cd = p.beansFactory.createTableColumn("Rslt.sls_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_sls_dpt_nm = p.beansFactory.createTableColumn("Rslt.sls_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_sls_usr_cd = p.beansFactory.createTableColumn("Rslt.sls_usr_cd", MCColumnType.TEXT);
		p.columnRslt_sls_usr_nm = p.beansFactory.createTableColumn("Rslt.sls_usr_nm", MCColumnType.TEXT);
		p.columnRslt_stk_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_bp_nm", MCColumnType.TEXT);
		p.columnRslt_alc_dpt_cd = p.beansFactory.createTableColumn("Rslt.alc_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_alc_dpt_nm = p.beansFactory.createTableColumn("Rslt.alc_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_dest_cd1 = p.beansFactory.createTableColumn("Rslt.dest_cd1", MCColumnType.TEXT);
		p.columnRslt_dest_nm1 = p.beansFactory.createTableColumn("Rslt.dest_nm1", MCColumnType.TEXT);
		p.columnRslt_dest_cd2 = p.beansFactory.createTableColumn("Rslt.dest_cd2", MCColumnType.TEXT);
		p.columnRslt_dest_nm2 = p.beansFactory.createTableColumn("Rslt.dest_nm2", MCColumnType.TEXT);
		p.columnRslt_dest_cd3 = p.beansFactory.createTableColumn("Rslt.dest_cd3", MCColumnType.TEXT);
		p.columnRslt_dest_nm3 = p.beansFactory.createTableColumn("Rslt.dest_nm3", MCColumnType.TEXT);
		p.columnRslt_cost_sls_cd1 = p.beansFactory.createTableColumn("Rslt.cost_sls_cd1", MCColumnType.TEXT);
		p.columnRslt_cost_sls_nm1 = p.beansFactory.createTableColumn("Rslt.cost_sls_nm1", MCColumnType.TEXT);
		p.columnRslt_cost_sls_cd2 = p.beansFactory.createTableColumn("Rslt.cost_sls_cd2", MCColumnType.TEXT);
		p.columnRslt_cost_sls_nm2 = p.beansFactory.createTableColumn("Rslt.cost_sls_nm2", MCColumnType.TEXT);
		p.columnRslt_cost_sls_cd3 = p.beansFactory.createTableColumn("Rslt.cost_sls_cd3", MCColumnType.TEXT);
		p.columnRslt_cost_sls_nm3 = p.beansFactory.createTableColumn("Rslt.cost_sls_nm3", MCColumnType.TEXT);
		p.columnRslt_cost_sls_cd4 = p.beansFactory.createTableColumn("Rslt.cost_sls_cd4", MCColumnType.TEXT);
		p.columnRslt_cost_sls_nm4 = p.beansFactory.createTableColumn("Rslt.cost_sls_nm4", MCColumnType.TEXT);
		p.columnRslt_cost_sls_cd5 = p.beansFactory.createTableColumn("Rslt.cost_sls_cd5", MCColumnType.TEXT);
		p.columnRslt_cost_sls_nm5 = p.beansFactory.createTableColumn("Rslt.cost_sls_nm5", MCColumnType.TEXT);
		p.columnRslt_alc_val1 = p.beansFactory.createTableColumn("Rslt.alc_val1", MCColumnType.NUMBER);
		p.columnRslt_alc_val2 = p.beansFactory.createTableColumn("Rslt.alc_val2", MCColumnType.NUMBER);
		p.columnRslt_alc_val3 = p.beansFactory.createTableColumn("Rslt.alc_val3", MCColumnType.NUMBER);
		p.columnRslt_alc_val4 = p.beansFactory.createTableColumn("Rslt.alc_val4", MCColumnType.NUMBER);
		p.columnRslt_alc_val5 = p.beansFactory.createTableColumn("Rslt.alc_val5", MCColumnType.NUMBER);
		p.columnRslt_rec_eval_typ = p.beansFactory.createTableColumn("Rslt.rec_eval_typ", MCColumnType.TEXT);
		p.columnRslt_rec_eval_typ_nm = p.beansFactory.createTableColumn("Rslt.rec_eval_typ_nm", MCColumnType.TEXT);
		p.columnRslt_zero_effect_flg = p.beansFactory.createTableColumn("Rslt.zero_effect_flg", MCColumnType.CHECK);
		p.columnRslt_act_sls_id = p.beansFactory.createTableColumn("Rslt.act_sls_id", MCColumnType.TEXT);
		p.columnRslt_act_sls_id_sub = p.beansFactory.createTableColumn("Rslt.act_sls_id_sub", MCColumnType.TEXT);
		p.columnRslt_rmrks = p.beansFactory.createTableColumn("Rslt.rmrks", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBBP0200 = p.beansFactory.createButton("Btn.open_MGBBP0200", "open");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBBP_ActSlsSrch p) {
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
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MGBBP_ActSlsSrch p) {
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
	protected static void jbInitTab1(MGBBP_ActSlsSrch p) {
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
	protected static void jbInitTab2(MGBBP_ActSlsSrch p) {
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
	protected static void jbInitTab3(MGBBP_ActSlsSrch p) {
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
	protected static void jbInitTab4(MGBBP_ActSlsSrch p) {
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
	protected static void jbInitTab5(MGBBP_ActSlsSrch p) {
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
	protected static void jbInitCnd(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_calc_ctg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_ctg_cd, true);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ctg_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.calc_ctg_nm_META);
		p.setPluralValueEnable(p.Cnd_calc_ctg_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_ym_fr);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ym_fr);
		p.Cnd_ym_fr.setNextBeans(p.Cnd_ym_to);
		p.Cnd_ym_fr.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.ym_fr_META);
		p.Cnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ym_to_Label);
		p.CndPanel.add(p.Cnd_ym_to);
		p.Cnd_ym_to.setNextBeans(p.Cnd_mng_dpt_cd);
		p.Cnd_ym_to.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.ym_to_META);
		p.Cnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_mng_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mng_dpt_cd, true);
		p.Cnd_mng_dpt_cd.setLinkBeans(p.Cnd_mng_dpt_nm);
		p.CndPanel.add(p.Cnd_mng_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_mng_dpt_cd);
		p.Cnd_mng_dpt_cd.setNextBeans(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.mng_dpt_cd_META);
		p.CndPanel.add(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_nm.setNextBeans(p.Cnd_asst_typ);
		p.Cnd_mng_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.mng_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_mng_dpt_nm, true);
		p.Cnd_asst_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asst_typ, true);
		p.Cnd_asst_typ.setLinkBeans(p.Cnd_asst_typ_nm);
		p.CndPanel.add(p.Cnd_asst_typ_Label);
		p.CndPanel.add(p.Cnd_asst_typ);
		p.Cnd_asst_typ.setNextBeans(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.asst_typ_META);
		p.CndPanel.add(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ_nm.setNextBeans(p.Cnd_act_sls_id);
		p.Cnd_asst_typ_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.asst_typ_nm_META);
		p.CndPanel.add(p.Cnd_act_sls_id_Label);
		p.CndPanel.add(p.Cnd_act_sls_id);
		p.Cnd_act_sls_id.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_act_sls_id.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.act_sls_id_META);
		p.setPluralValueEnable(p.Cnd_act_sls_id, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_jnl_cd, true);
		p.Cnd_itm_jnl_cd.setLinkBeans(p.Cnd_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setNextBeans(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_jnl_nm_META);
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
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno1);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sublot_no_META);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno1_Label);
		p.CndPanel.add(p.Cnd_sno1);
		p.Cnd_sno1.setNextBeans(p.Cnd_sno2);
		p.Cnd_sno1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sno1_META);
		p.setPluralValueEnable(p.Cnd_sno1, true);
		p.CndPanel.add(p.Cnd_sno2_Label);
		p.CndPanel.add(p.Cnd_sno2);
		p.Cnd_sno2.setNextBeans(p.Cnd_sno3);
		p.Cnd_sno2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sno2_META);
		p.setPluralValueEnable(p.Cnd_sno2, true);
		p.CndPanel.add(p.Cnd_sno3_Label);
		p.CndPanel.add(p.Cnd_sno3);
		p.Cnd_sno3.setNextBeans(p.Cnd_sno4);
		p.Cnd_sno3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sno3_META);
		p.setPluralValueEnable(p.Cnd_sno3, true);
		p.CndPanel.add(p.Cnd_sno4_Label);
		p.CndPanel.add(p.Cnd_sno4);
		p.Cnd_sno4.setNextBeans(p.Cnd_ac_slip_typ);
		p.Cnd_sno4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sno4_META);
		p.setPluralValueEnable(p.Cnd_sno4, true);
		p.Cnd_ac_slip_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_slip_typ, true);
		p.Cnd_ac_slip_typ.setLinkBeans(p.Cnd_ac_slip_typ_nm);
		p.CndPanel.add(p.Cnd_ac_slip_typ_Label);
		p.CndPanel.add(p.Cnd_ac_slip_typ);
		p.Cnd_ac_slip_typ.setNextBeans(p.Cnd_ac_slip_typ_nm);
		p.Cnd_ac_slip_typ.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.ac_slip_typ_META);
		p.CndPanel.add(p.Cnd_ac_slip_typ_nm);
		p.Cnd_ac_slip_typ_nm.setNextBeans(p.Cnd_ac_rsn_cd);
		p.Cnd_ac_slip_typ_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.ac_slip_typ_nm_META);
		p.Cnd_ac_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_rsn_cd, true);
		p.Cnd_ac_rsn_cd.setLinkBeans(p.Cnd_ac_rsn_nm);
		p.CndPanel.add(p.Cnd_ac_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_ac_rsn_cd);
		p.Cnd_ac_rsn_cd.setNextBeans(p.Cnd_ac_rsn_nm);
		p.Cnd_ac_rsn_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.ac_rsn_cd_META);
		p.CndPanel.add(p.Cnd_ac_rsn_nm);
		p.Cnd_ac_rsn_nm.setNextBeans(p.Cnd_no_ac_rsn_flg);
		p.Cnd_ac_rsn_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.ac_rsn_nm_META);
		p.setPluralValueEnable(p.Cnd_ac_rsn_nm, true);
		p.CndPanel.add(p.Cnd_no_ac_rsn_flg);
		p.Cnd_no_ac_rsn_flg.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_no_ac_rsn_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.no_ac_rsn_flg_META);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_cst_cntry_cd);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.Cnd_cst_cntry_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cntry_cd, true);
		p.Cnd_cst_cntry_cd.setLinkBeans(p.Cnd_cst_cntry_nm);
		p.CndPanel.add(p.Cnd_cst_cntry_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cntry_cd);
		p.Cnd_cst_cntry_cd.setNextBeans(p.Cnd_cst_cntry_nm);
		p.Cnd_cst_cntry_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_cntry_cd_META);
		p.CndPanel.add(p.Cnd_cst_cntry_nm);
		p.Cnd_cst_cntry_nm.setNextBeans(p.Cnd_cst_area_cd);
		p.Cnd_cst_cntry_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_cntry_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_cntry_nm, true);
		p.Cnd_cst_area_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_area_cd, true);
		p.Cnd_cst_area_cd.setLinkBeans(p.Cnd_cst_area_nm);
		p.CndPanel.add(p.Cnd_cst_area_cd_Label);
		p.CndPanel.add(p.Cnd_cst_area_cd);
		p.Cnd_cst_area_cd.setNextBeans(p.Cnd_cst_area_nm);
		p.Cnd_cst_area_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_area_cd_META);
		p.CndPanel.add(p.Cnd_cst_area_nm);
		p.Cnd_cst_area_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_cst_area_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_area_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_area_nm, true);
		p.CndPanel.add(p.Cnd_dlv_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_cd_META);
		p.Cnd_dlv_cd.addLinkBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.CndPanel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_dlv_cntry_cd);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.Cnd_dlv_cntry_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cntry_cd, true);
		p.Cnd_dlv_cntry_cd.setLinkBeans(p.Cnd_dlv_cntry_nm);
		p.CndPanel.add(p.Cnd_dlv_cntry_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cntry_cd);
		p.Cnd_dlv_cntry_cd.setNextBeans(p.Cnd_dlv_cntry_nm);
		p.Cnd_dlv_cntry_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_cntry_cd_META);
		p.CndPanel.add(p.Cnd_dlv_cntry_nm);
		p.Cnd_dlv_cntry_nm.setNextBeans(p.Cnd_dlv_area_cd);
		p.Cnd_dlv_cntry_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_cntry_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_cntry_nm, true);
		p.Cnd_dlv_area_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_area_cd, true);
		p.Cnd_dlv_area_cd.setLinkBeans(p.Cnd_dlv_area_nm);
		p.CndPanel.add(p.Cnd_dlv_area_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_area_cd);
		p.Cnd_dlv_area_cd.setNextBeans(p.Cnd_dlv_area_nm);
		p.Cnd_dlv_area_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_area_cd_META);
		p.CndPanel.add(p.Cnd_dlv_area_nm);
		p.Cnd_dlv_area_nm.setNextBeans(p.Cnd_slo_no);
		p.Cnd_dlv_area_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_area_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_area_nm, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_no_slo_no_flg);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_no_slo_no_flg);
		p.Cnd_no_slo_no_flg.setNextBeans(p.Cnd_iv_no);
		p.Cnd_no_slo_no_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.no_slo_no_flg_META);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_no_iv_no_flg);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_no_iv_no_flg);
		p.Cnd_no_iv_no_flg.setNextBeans(p.Cnd_sls_dpt_cd);
		p.Cnd_no_iv_no_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.no_iv_no_flg_META);
		p.Cnd_sls_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_dpt_cd, true);
		p.Cnd_sls_dpt_cd.setLinkBeans(p.Cnd_sls_dpt_nm);
		p.CndPanel.add(p.Cnd_sls_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_dpt_cd.setNextBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sls_dpt_cd_META);
		p.CndPanel.add(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_nm.setNextBeans(p.Cnd_sls_usr_cd);
		p.Cnd_sls_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sls_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_dpt_nm, true);
		p.CndPanel.add(p.Cnd_sls_usr_cd_Label);
		p.CndPanel.add(p.Cnd_sls_usr_cd);
		p.Cnd_sls_usr_cd.setNextBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sls_usr_cd_META);
		p.Cnd_sls_usr_cd.addLinkBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_usr_cd, true);
		p.CndPanel.add(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_nm.setNextBeans(p.Cnd_stk_bp_cd);
		p.Cnd_sls_usr_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sls_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_usr_nm, true);
		p.CndPanel.add(p.Cnd_stk_bp_cd_Label);
		p.CndPanel.add(p.Cnd_stk_bp_cd);
		p.Cnd_stk_bp_cd.setNextBeans(p.Cnd_stk_bp_nm);
		p.Cnd_stk_bp_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.stk_bp_cd_META);
		p.Cnd_stk_bp_cd.addLinkBeans(p.Cnd_stk_bp_nm);
		p.Cnd_stk_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_bp_cd, true);
		p.CndPanel.add(p.Cnd_stk_bp_nm);
		p.Cnd_stk_bp_nm.setNextBeans(p.Cnd_no_stk_bp_flg);
		p.Cnd_stk_bp_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.stk_bp_nm_META);
		p.setPluralValueEnable(p.Cnd_stk_bp_nm, true);
		p.CndPanel.add(p.Cnd_no_stk_bp_flg);
		p.Cnd_no_stk_bp_flg.setNextBeans(p.Cnd_alc_dpt_cd);
		p.Cnd_no_stk_bp_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.no_stk_bp_flg_META);
		p.Cnd_alc_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_dpt_cd, true);
		p.Cnd_alc_dpt_cd.setLinkBeans(p.Cnd_alc_dpt_nm);
		p.CndPanel.add(p.Cnd_alc_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_alc_dpt_cd);
		p.Cnd_alc_dpt_cd.setNextBeans(p.Cnd_alc_dpt_nm);
		p.Cnd_alc_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.alc_dpt_cd_META);
		p.CndPanel.add(p.Cnd_alc_dpt_nm);
		p.Cnd_alc_dpt_nm.setNextBeans(p.Cnd_dest_cd1);
		p.Cnd_alc_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.alc_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_alc_dpt_nm, true);
		p.CndPanel.add(p.Cnd_dest_cd1_Label);
		p.CndPanel.add(p.Cnd_dest_cd1);
		p.Cnd_dest_cd1.setNextBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dest_cd1_META);
		p.Cnd_dest_cd1.addLinkBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd1, true);
		p.CndPanel.add(p.Cnd_dest_nm1);
		p.Cnd_dest_nm1.setNextBeans(p.Cnd_dest_cd2);
		p.Cnd_dest_nm1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dest_nm1_META);
		p.setPluralValueEnable(p.Cnd_dest_nm1, true);
		p.CndPanel.add(p.Cnd_dest_cd2_Label);
		p.CndPanel.add(p.Cnd_dest_cd2);
		p.Cnd_dest_cd2.setNextBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dest_cd2_META);
		p.Cnd_dest_cd2.addLinkBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd2, true);
		p.CndPanel.add(p.Cnd_dest_nm2);
		p.Cnd_dest_nm2.setNextBeans(p.Cnd_dest_cd3);
		p.Cnd_dest_nm2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dest_nm2_META);
		p.setPluralValueEnable(p.Cnd_dest_nm2, true);
		p.CndPanel.add(p.Cnd_dest_cd3_Label);
		p.CndPanel.add(p.Cnd_dest_cd3);
		p.Cnd_dest_cd3.setNextBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dest_cd3_META);
		p.Cnd_dest_cd3.addLinkBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd3, true);
		p.CndPanel.add(p.Cnd_dest_nm3);
		p.Cnd_dest_nm3.setNextBeans(p.Cnd_cost_sls_cd1);
		p.Cnd_dest_nm3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dest_nm3_META);
		p.setPluralValueEnable(p.Cnd_dest_nm3, true);
		p.Cnd_cost_sls_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cost_sls_cd1, true);
		p.Cnd_cost_sls_cd1.setLinkBeans(p.Cnd_cost_sls_nm1);
		p.CndPanel.add(p.Cnd_cost_sls_cd1_Label);
		p.CndPanel.add(p.Cnd_cost_sls_cd1);
		p.Cnd_cost_sls_cd1.setNextBeans(p.Cnd_cost_sls_nm1);
		p.Cnd_cost_sls_cd1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cost_sls_cd1_META);
		p.CndPanel.add(p.Cnd_cost_sls_nm1);
		p.Cnd_cost_sls_nm1.setNextBeans(p.Cnd_cost_sls_cd2);
		p.Cnd_cost_sls_nm1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cost_sls_nm1_META);
		p.setPluralValueEnable(p.Cnd_cost_sls_nm1, true);
		p.Cnd_cost_sls_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cost_sls_cd2, true);
		p.Cnd_cost_sls_cd2.setLinkBeans(p.Cnd_cost_sls_nm2);
		p.CndPanel.add(p.Cnd_cost_sls_cd2_Label);
		p.CndPanel.add(p.Cnd_cost_sls_cd2);
		p.Cnd_cost_sls_cd2.setNextBeans(p.Cnd_cost_sls_nm2);
		p.Cnd_cost_sls_cd2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cost_sls_cd2_META);
		p.CndPanel.add(p.Cnd_cost_sls_nm2);
		p.Cnd_cost_sls_nm2.setNextBeans(p.Cnd_cost_sls_cd3);
		p.Cnd_cost_sls_nm2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cost_sls_nm2_META);
		p.setPluralValueEnable(p.Cnd_cost_sls_nm2, true);
		p.Cnd_cost_sls_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cost_sls_cd3, true);
		p.Cnd_cost_sls_cd3.setLinkBeans(p.Cnd_cost_sls_nm3);
		p.CndPanel.add(p.Cnd_cost_sls_cd3_Label);
		p.CndPanel.add(p.Cnd_cost_sls_cd3);
		p.Cnd_cost_sls_cd3.setNextBeans(p.Cnd_cost_sls_nm3);
		p.Cnd_cost_sls_cd3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cost_sls_cd3_META);
		p.CndPanel.add(p.Cnd_cost_sls_nm3);
		p.Cnd_cost_sls_nm3.setNextBeans(p.Cnd_cost_sls_cd4);
		p.Cnd_cost_sls_nm3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cost_sls_nm3_META);
		p.setPluralValueEnable(p.Cnd_cost_sls_nm3, true);
		p.Cnd_cost_sls_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cost_sls_cd4, true);
		p.Cnd_cost_sls_cd4.setLinkBeans(p.Cnd_cost_sls_nm4);
		p.CndPanel.add(p.Cnd_cost_sls_cd4_Label);
		p.CndPanel.add(p.Cnd_cost_sls_cd4);
		p.Cnd_cost_sls_cd4.setNextBeans(p.Cnd_cost_sls_nm4);
		p.Cnd_cost_sls_cd4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cost_sls_cd4_META);
		p.CndPanel.add(p.Cnd_cost_sls_nm4);
		p.Cnd_cost_sls_nm4.setNextBeans(p.Cnd_cost_sls_cd5);
		p.Cnd_cost_sls_nm4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cost_sls_nm4_META);
		p.setPluralValueEnable(p.Cnd_cost_sls_nm4, true);
		p.Cnd_cost_sls_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cost_sls_cd5, true);
		p.Cnd_cost_sls_cd5.setLinkBeans(p.Cnd_cost_sls_nm5);
		p.CndPanel.add(p.Cnd_cost_sls_cd5_Label);
		p.CndPanel.add(p.Cnd_cost_sls_cd5);
		p.Cnd_cost_sls_cd5.setNextBeans(p.Cnd_cost_sls_nm5);
		p.Cnd_cost_sls_cd5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cost_sls_cd5_META);
		p.CndPanel.add(p.Cnd_cost_sls_nm5);
		p.Cnd_cost_sls_nm5.setNextBeans(p.Cnd_rec_eval_typ);
		p.Cnd_cost_sls_nm5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cost_sls_nm5_META);
		p.setPluralValueEnable(p.Cnd_cost_sls_nm5, true);
		p.Cnd_rec_eval_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rec_eval_typ, true);
		p.Cnd_rec_eval_typ.setLinkBeans(p.Cnd_rec_eval_typ_nm);
		p.CndPanel.add(p.Cnd_rec_eval_typ_Label);
		p.CndPanel.add(p.Cnd_rec_eval_typ);
		p.Cnd_rec_eval_typ.setNextBeans(p.Cnd_rec_eval_typ_nm);
		p.Cnd_rec_eval_typ.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.rec_eval_typ_META);
		p.CndPanel.add(p.Cnd_rec_eval_typ_nm);
		p.Cnd_rec_eval_typ_nm.setNextBeans(p.Cnd_rmrks);
		p.Cnd_rec_eval_typ_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.rec_eval_typ_nm_META);
		p.CndPanel.add(p.Cnd_rmrks_Label);
		p.CndPanel.add(p.Cnd_rmrks);
		p.Cnd_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_rmrks.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.rmrks_META);
		p.setPluralValueEnable(p.Cnd_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_cur_cd);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
		p.Cnd_cst_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd1, true);
		p.Cnd_cst_grp_cd1.setLinkBeans(p.Cnd_cst_grp_nm1);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd1_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd1);
		p.Cnd3Panel.setLastBeans(p.Cnd_cst_grp_cd1);
		p.Cnd_cst_grp_cd1.setNextBeans(p.Cnd_cst_grp_nm1);
		p.Cnd_cst_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_cd1_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm1);
		p.Cnd_cst_grp_nm1.setNextBeans(p.Cnd_cst_grp_cd2);
		p.Cnd_cst_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm1, true);
		p.Cnd_cst_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd2, true);
		p.Cnd_cst_grp_cd2.setLinkBeans(p.Cnd_cst_grp_nm2);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd2_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd2);
		p.Cnd_cst_grp_cd2.setNextBeans(p.Cnd_cst_grp_nm2);
		p.Cnd_cst_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_cd2_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm2);
		p.Cnd_cst_grp_nm2.setNextBeans(p.Cnd_cst_grp_cd3);
		p.Cnd_cst_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm2, true);
		p.Cnd_cst_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd3, true);
		p.Cnd_cst_grp_cd3.setLinkBeans(p.Cnd_cst_grp_nm3);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd3_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd3);
		p.Cnd_cst_grp_cd3.setNextBeans(p.Cnd_cst_grp_nm3);
		p.Cnd_cst_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_cd3_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm3);
		p.Cnd_cst_grp_nm3.setNextBeans(p.Cnd_cst_grp_cd4);
		p.Cnd_cst_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm3, true);
		p.Cnd_cst_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd4, true);
		p.Cnd_cst_grp_cd4.setLinkBeans(p.Cnd_cst_grp_nm4);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd4_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd4);
		p.Cnd_cst_grp_cd4.setNextBeans(p.Cnd_cst_grp_nm4);
		p.Cnd_cst_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_cd4_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm4);
		p.Cnd_cst_grp_nm4.setNextBeans(p.Cnd_cst_grp_cd5);
		p.Cnd_cst_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm4, true);
		p.Cnd_cst_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd5, true);
		p.Cnd_cst_grp_cd5.setLinkBeans(p.Cnd_cst_grp_nm5);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd5_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd5);
		p.Cnd_cst_grp_cd5.setNextBeans(p.Cnd_cst_grp_nm5);
		p.Cnd_cst_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_cd5_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm5);
		p.Cnd_cst_grp_nm5.setNextBeans(p.Cnd_cst_grp_cd6);
		p.Cnd_cst_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm5, true);
		p.Cnd_cst_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd6, true);
		p.Cnd_cst_grp_cd6.setLinkBeans(p.Cnd_cst_grp_nm6);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd6_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd6);
		p.Cnd_cst_grp_cd6.setNextBeans(p.Cnd_cst_grp_nm6);
		p.Cnd_cst_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_cd6_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm6);
		p.Cnd_cst_grp_nm6.setNextBeans(p.Cnd_cst_grp_cd7);
		p.Cnd_cst_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm6, true);
		p.Cnd_cst_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd7, true);
		p.Cnd_cst_grp_cd7.setLinkBeans(p.Cnd_cst_grp_nm7);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd7_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd7);
		p.Cnd_cst_grp_cd7.setNextBeans(p.Cnd_cst_grp_nm7);
		p.Cnd_cst_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_cd7_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm7);
		p.Cnd_cst_grp_nm7.setNextBeans(p.Cnd_cst_grp_cd8);
		p.Cnd_cst_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm7, true);
		p.Cnd_cst_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd8, true);
		p.Cnd_cst_grp_cd8.setLinkBeans(p.Cnd_cst_grp_nm8);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd8_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd8);
		p.Cnd_cst_grp_cd8.setNextBeans(p.Cnd_cst_grp_nm8);
		p.Cnd_cst_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_cd8_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm8);
		p.Cnd_cst_grp_nm8.setNextBeans(p.Cnd_cst_grp_cd9);
		p.Cnd_cst_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm8, true);
		p.Cnd_cst_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd9, true);
		p.Cnd_cst_grp_cd9.setLinkBeans(p.Cnd_cst_grp_nm9);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd9_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd9);
		p.Cnd_cst_grp_cd9.setNextBeans(p.Cnd_cst_grp_nm9);
		p.Cnd_cst_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_cd9_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm9);
		p.Cnd_cst_grp_nm9.setNextBeans(p.Cnd_cst_grp_cd10);
		p.Cnd_cst_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm9, true);
		p.Cnd_cst_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd10, true);
		p.Cnd_cst_grp_cd10.setLinkBeans(p.Cnd_cst_grp_nm10);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd10_Label);
		p.Cnd3Panel.add(p.Cnd_cst_grp_cd10);
		p.Cnd_cst_grp_cd10.setNextBeans(p.Cnd_cst_grp_nm10);
		p.Cnd_cst_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_cd10_META);
		p.Cnd3Panel.add(p.Cnd_cst_grp_nm10);
		p.Cnd_cst_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm10, true);
		p.Cnd_dlv_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd1, true);
		p.Cnd_dlv_grp_cd1.setLinkBeans(p.Cnd_dlv_grp_nm1);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd1_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd1);
		p.Cnd4Panel.setLastBeans(p.Cnd_dlv_grp_cd1);
		p.Cnd_dlv_grp_cd1.setNextBeans(p.Cnd_dlv_grp_nm1);
		p.Cnd_dlv_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_cd1_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm1);
		p.Cnd_dlv_grp_nm1.setNextBeans(p.Cnd_dlv_grp_cd2);
		p.Cnd_dlv_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm1, true);
		p.Cnd_dlv_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd2, true);
		p.Cnd_dlv_grp_cd2.setLinkBeans(p.Cnd_dlv_grp_nm2);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd2_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd2);
		p.Cnd_dlv_grp_cd2.setNextBeans(p.Cnd_dlv_grp_nm2);
		p.Cnd_dlv_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_cd2_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm2);
		p.Cnd_dlv_grp_nm2.setNextBeans(p.Cnd_dlv_grp_cd3);
		p.Cnd_dlv_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm2, true);
		p.Cnd_dlv_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd3, true);
		p.Cnd_dlv_grp_cd3.setLinkBeans(p.Cnd_dlv_grp_nm3);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd3_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd3);
		p.Cnd_dlv_grp_cd3.setNextBeans(p.Cnd_dlv_grp_nm3);
		p.Cnd_dlv_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_cd3_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm3);
		p.Cnd_dlv_grp_nm3.setNextBeans(p.Cnd_dlv_grp_cd4);
		p.Cnd_dlv_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm3, true);
		p.Cnd_dlv_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd4, true);
		p.Cnd_dlv_grp_cd4.setLinkBeans(p.Cnd_dlv_grp_nm4);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd4_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd4);
		p.Cnd_dlv_grp_cd4.setNextBeans(p.Cnd_dlv_grp_nm4);
		p.Cnd_dlv_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_cd4_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm4);
		p.Cnd_dlv_grp_nm4.setNextBeans(p.Cnd_dlv_grp_cd5);
		p.Cnd_dlv_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm4, true);
		p.Cnd_dlv_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd5, true);
		p.Cnd_dlv_grp_cd5.setLinkBeans(p.Cnd_dlv_grp_nm5);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd5_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd5);
		p.Cnd_dlv_grp_cd5.setNextBeans(p.Cnd_dlv_grp_nm5);
		p.Cnd_dlv_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_cd5_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm5);
		p.Cnd_dlv_grp_nm5.setNextBeans(p.Cnd_dlv_grp_cd6);
		p.Cnd_dlv_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm5, true);
		p.Cnd_dlv_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd6, true);
		p.Cnd_dlv_grp_cd6.setLinkBeans(p.Cnd_dlv_grp_nm6);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd6_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd6);
		p.Cnd_dlv_grp_cd6.setNextBeans(p.Cnd_dlv_grp_nm6);
		p.Cnd_dlv_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_cd6_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm6);
		p.Cnd_dlv_grp_nm6.setNextBeans(p.Cnd_dlv_grp_cd7);
		p.Cnd_dlv_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm6, true);
		p.Cnd_dlv_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd7, true);
		p.Cnd_dlv_grp_cd7.setLinkBeans(p.Cnd_dlv_grp_nm7);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd7_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd7);
		p.Cnd_dlv_grp_cd7.setNextBeans(p.Cnd_dlv_grp_nm7);
		p.Cnd_dlv_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_cd7_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm7);
		p.Cnd_dlv_grp_nm7.setNextBeans(p.Cnd_dlv_grp_cd8);
		p.Cnd_dlv_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm7, true);
		p.Cnd_dlv_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd8, true);
		p.Cnd_dlv_grp_cd8.setLinkBeans(p.Cnd_dlv_grp_nm8);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd8_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd8);
		p.Cnd_dlv_grp_cd8.setNextBeans(p.Cnd_dlv_grp_nm8);
		p.Cnd_dlv_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_cd8_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm8);
		p.Cnd_dlv_grp_nm8.setNextBeans(p.Cnd_dlv_grp_cd9);
		p.Cnd_dlv_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm8, true);
		p.Cnd_dlv_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd9, true);
		p.Cnd_dlv_grp_cd9.setLinkBeans(p.Cnd_dlv_grp_nm9);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd9_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd9);
		p.Cnd_dlv_grp_cd9.setNextBeans(p.Cnd_dlv_grp_nm9);
		p.Cnd_dlv_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_cd9_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm9);
		p.Cnd_dlv_grp_nm9.setNextBeans(p.Cnd_dlv_grp_cd10);
		p.Cnd_dlv_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm9, true);
		p.Cnd_dlv_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd10, true);
		p.Cnd_dlv_grp_cd10.setLinkBeans(p.Cnd_dlv_grp_nm10);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd10_Label);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_cd10);
		p.Cnd_dlv_grp_cd10.setNextBeans(p.Cnd_dlv_grp_nm10);
		p.Cnd_dlv_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_cd10_META);
		p.Cnd4Panel.add(p.Cnd_dlv_grp_nm10);
		p.Cnd_dlv_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm10, true);
		p.TtlPanel.add(p.Cnd_calc_ctg_flg);
		p.TtlPanel.setLastBeans(p.Cnd_calc_ctg_flg);
		p.Cnd_calc_ctg_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_calc_ctg_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.calc_ctg_flg_META);
		p.TtlPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setNextBeans(p.Cnd_ym_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.wg_flg_META);
		p.TtlPanel.add(p.Cnd_ym_flg);
		p.Cnd_ym_flg.setNextBeans(p.Cnd_ac_dt_flg);
		p.Cnd_ym_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.ym_flg_META);
		p.TtlPanel.add(p.Cnd_ac_dt_flg);
		p.Cnd_ac_dt_flg.setNextBeans(p.Cnd_mng_dpt_flg);
		p.Cnd_ac_dt_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.ac_dt_flg_META);
		p.TtlPanel.add(p.Cnd_mng_dpt_flg);
		p.Cnd_mng_dpt_flg.setNextBeans(p.Cnd_itm_flg);
		p.Cnd_mng_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.mng_dpt_flg_META);
		p.TtlPanel.add(p.Cnd_itm_flg);
		p.Cnd_itm_flg.setNextBeans(p.Cnd_itm_typ_flg);
		p.Cnd_itm_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_flg_META);
		p.TtlPanel.add(p.Cnd_itm_typ_flg);
		p.Cnd_itm_typ_flg.setNextBeans(p.Cnd_itm_typ_d_flg);
		p.Cnd_itm_typ_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_typ_flg_META);
		p.TtlPanel.add(p.Cnd_itm_typ_d_flg);
		p.Cnd_itm_typ_d_flg.setNextBeans(p.Cnd_itm_jnl_flg);
		p.Cnd_itm_typ_d_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_typ_d_flg_META);
		p.TtlPanel.add(p.Cnd_itm_jnl_flg);
		p.Cnd_itm_jnl_flg.setNextBeans(p.Cnd_lot_flg);
		p.Cnd_itm_jnl_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_jnl_flg_META);
		p.TtlPanel.add(p.Cnd_lot_flg);
		p.Cnd_lot_flg.setNextBeans(p.Cnd_sublot_flg);
		p.Cnd_lot_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.lot_flg_META);
		p.TtlPanel.add(p.Cnd_sublot_flg);
		p.Cnd_sublot_flg.setNextBeans(p.Cnd_sno1_flg);
		p.Cnd_sublot_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sublot_flg_META);
		p.TtlPanel.add(p.Cnd_sno1_flg);
		p.Cnd_sno1_flg.setNextBeans(p.Cnd_sno2_flg);
		p.Cnd_sno1_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sno1_flg_META);
		p.TtlPanel.add(p.Cnd_sno2_flg);
		p.Cnd_sno2_flg.setNextBeans(p.Cnd_sno3_flg);
		p.Cnd_sno2_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sno2_flg_META);
		p.TtlPanel.add(p.Cnd_sno3_flg);
		p.Cnd_sno3_flg.setNextBeans(p.Cnd_sno4_flg);
		p.Cnd_sno3_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sno3_flg_META);
		p.TtlPanel.add(p.Cnd_sno4_flg);
		p.Cnd_sno4_flg.setNextBeans(p.Cnd_asst_typ_flg);
		p.Cnd_sno4_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sno4_flg_META);
		p.TtlPanel.add(p.Cnd_asst_typ_flg);
		p.Cnd_asst_typ_flg.setNextBeans(p.Cnd_ac_slip_typ_flg);
		p.Cnd_asst_typ_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.asst_typ_flg_META);
		p.TtlPanel.add(p.Cnd_ac_slip_typ_flg);
		p.Cnd_ac_slip_typ_flg.setNextBeans(p.Cnd_ac_rsn_flg);
		p.Cnd_ac_slip_typ_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.ac_slip_typ_flg_META);
		p.TtlPanel.add(p.Cnd_ac_rsn_flg);
		p.Cnd_ac_rsn_flg.setNextBeans(p.Cnd_slo_no_flg);
		p.Cnd_ac_rsn_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.ac_rsn_flg_META);
		p.TtlPanel.add(p.Cnd_slo_no_flg);
		p.Cnd_slo_no_flg.setNextBeans(p.Cnd_iv_no_flg);
		p.Cnd_slo_no_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.slo_no_flg_META);
		p.TtlPanel.add(p.Cnd_iv_no_flg);
		p.Cnd_iv_no_flg.setNextBeans(p.Cnd_sls_dpt_flg);
		p.Cnd_iv_no_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.iv_no_flg_META);
		p.TtlPanel.add(p.Cnd_sls_dpt_flg);
		p.Cnd_sls_dpt_flg.setNextBeans(p.Cnd_sls_usr_flg);
		p.Cnd_sls_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sls_dpt_flg_META);
		p.TtlPanel.add(p.Cnd_sls_usr_flg);
		p.Cnd_sls_usr_flg.setNextBeans(p.Cnd_stk_bp_flg);
		p.Cnd_sls_usr_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.sls_usr_flg_META);
		p.TtlPanel.add(p.Cnd_stk_bp_flg);
		p.Cnd_stk_bp_flg.setNextBeans(p.Cnd_alc_dpt_flg);
		p.Cnd_stk_bp_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.stk_bp_flg_META);
		p.TtlPanel.add(p.Cnd_alc_dpt_flg);
		p.Cnd_alc_dpt_flg.setNextBeans(p.Cnd_cst_flg);
		p.Cnd_alc_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.alc_dpt_flg_META);
		p.TtlPanel.add(p.Cnd_cst_flg);
		p.Cnd_cst_flg.setNextBeans(p.Cnd_cst_cntry_flg);
		p.Cnd_cst_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_flg_META);
		p.TtlPanel.add(p.Cnd_cst_cntry_flg);
		p.Cnd_cst_cntry_flg.setNextBeans(p.Cnd_cst_area_flg);
		p.Cnd_cst_cntry_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_cntry_flg_META);
		p.TtlPanel.add(p.Cnd_cst_area_flg);
		p.Cnd_cst_area_flg.setNextBeans(p.Cnd_dlv_flg);
		p.Cnd_cst_area_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_area_flg_META);
		p.TtlPanel.add(p.Cnd_dlv_flg);
		p.Cnd_dlv_flg.setNextBeans(p.Cnd_dlv_cntry_flg);
		p.Cnd_dlv_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_flg_META);
		p.TtlPanel.add(p.Cnd_dlv_cntry_flg);
		p.Cnd_dlv_cntry_flg.setNextBeans(p.Cnd_dlv_area_flg);
		p.Cnd_dlv_cntry_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_cntry_flg_META);
		p.TtlPanel.add(p.Cnd_dlv_area_flg);
		p.Cnd_dlv_area_flg.setNextBeans(p.Cnd_dest1_flg);
		p.Cnd_dlv_area_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_area_flg_META);
		p.TtlPanel.add(p.Cnd_dest1_flg);
		p.Cnd_dest1_flg.setNextBeans(p.Cnd_dest2_flg);
		p.Cnd_dest1_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dest1_flg_META);
		p.TtlPanel.add(p.Cnd_dest2_flg);
		p.Cnd_dest2_flg.setNextBeans(p.Cnd_dest3_flg);
		p.Cnd_dest2_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dest2_flg_META);
		p.TtlPanel.add(p.Cnd_dest3_flg);
		p.Cnd_dest3_flg.setNextBeans(p.Cnd_cost_sls1_flg);
		p.Cnd_dest3_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dest3_flg_META);
		p.TtlPanel.add(p.Cnd_cost_sls1_flg);
		p.Cnd_cost_sls1_flg.setNextBeans(p.Cnd_cost_sls2_flg);
		p.Cnd_cost_sls1_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cost_sls1_flg_META);
		p.TtlPanel.add(p.Cnd_cost_sls2_flg);
		p.Cnd_cost_sls2_flg.setNextBeans(p.Cnd_cost_sls3_flg);
		p.Cnd_cost_sls2_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cost_sls2_flg_META);
		p.TtlPanel.add(p.Cnd_cost_sls3_flg);
		p.Cnd_cost_sls3_flg.setNextBeans(p.Cnd_cost_sls4_flg);
		p.Cnd_cost_sls3_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cost_sls3_flg_META);
		p.TtlPanel.add(p.Cnd_cost_sls4_flg);
		p.Cnd_cost_sls4_flg.setNextBeans(p.Cnd_cost_sls5_flg);
		p.Cnd_cost_sls4_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cost_sls4_flg_META);
		p.TtlPanel.add(p.Cnd_cost_sls5_flg);
		p.Cnd_cost_sls5_flg.setNextBeans(p.Cnd_trd_cur_flg);
		p.Cnd_cost_sls5_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cost_sls5_flg_META);
		p.TtlPanel.add(p.Cnd_trd_cur_flg);
		p.Cnd_trd_cur_flg.setNextBeans(p.Cnd_xrate_flg);
		p.Cnd_trd_cur_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.trd_cur_flg_META);
		p.TtlPanel.add(p.Cnd_xrate_flg);
		p.Cnd_xrate_flg.setNextBeans(p.Cnd_rec_eval_typ_flg);
		p.Cnd_xrate_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.xrate_flg_META);
		p.TtlPanel.add(p.Cnd_rec_eval_typ_flg);
		p.Cnd_rec_eval_typ_flg.setNextBeans(p.Cnd_alc_sls_id_flg);
		p.Cnd_rec_eval_typ_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.rec_eval_typ_flg_META);
		p.TtlPanel.add(p.Cnd_alc_sls_id_flg);
		p.Cnd_alc_sls_id_flg.setNextBeans(p.Cnd_itm_grp_flg1);
		p.Cnd_alc_sls_id_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.alc_sls_id_flg_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg1);
		p.Cnd_itm_grp_flg1.setNextBeans(p.Cnd_itm_grp_flg2);
		p.Cnd_itm_grp_flg1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_flg1_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg2);
		p.Cnd_itm_grp_flg2.setNextBeans(p.Cnd_itm_grp_flg3);
		p.Cnd_itm_grp_flg2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_flg2_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg3);
		p.Cnd_itm_grp_flg3.setNextBeans(p.Cnd_itm_grp_flg4);
		p.Cnd_itm_grp_flg3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_flg3_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg4);
		p.Cnd_itm_grp_flg4.setNextBeans(p.Cnd_itm_grp_flg5);
		p.Cnd_itm_grp_flg4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_flg4_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg5);
		p.Cnd_itm_grp_flg5.setNextBeans(p.Cnd_itm_grp_flg6);
		p.Cnd_itm_grp_flg5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_flg5_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg6);
		p.Cnd_itm_grp_flg6.setNextBeans(p.Cnd_itm_grp_flg7);
		p.Cnd_itm_grp_flg6.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_flg6_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg7);
		p.Cnd_itm_grp_flg7.setNextBeans(p.Cnd_itm_grp_flg8);
		p.Cnd_itm_grp_flg7.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_flg7_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg8);
		p.Cnd_itm_grp_flg8.setNextBeans(p.Cnd_itm_grp_flg9);
		p.Cnd_itm_grp_flg8.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_flg8_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg9);
		p.Cnd_itm_grp_flg9.setNextBeans(p.Cnd_itm_grp_flg10);
		p.Cnd_itm_grp_flg9.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_flg9_META);
		p.TtlPanel.add(p.Cnd_itm_grp_flg10);
		p.Cnd_itm_grp_flg10.setNextBeans(p.Cnd_cst_grp_flg1);
		p.Cnd_itm_grp_flg10.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.itm_grp_flg10_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg1);
		p.Cnd_cst_grp_flg1.setNextBeans(p.Cnd_cst_grp_flg2);
		p.Cnd_cst_grp_flg1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_flg1_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg2);
		p.Cnd_cst_grp_flg2.setNextBeans(p.Cnd_cst_grp_flg3);
		p.Cnd_cst_grp_flg2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_flg2_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg3);
		p.Cnd_cst_grp_flg3.setNextBeans(p.Cnd_cst_grp_flg4);
		p.Cnd_cst_grp_flg3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_flg3_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg4);
		p.Cnd_cst_grp_flg4.setNextBeans(p.Cnd_cst_grp_flg5);
		p.Cnd_cst_grp_flg4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_flg4_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg5);
		p.Cnd_cst_grp_flg5.setNextBeans(p.Cnd_cst_grp_flg6);
		p.Cnd_cst_grp_flg5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_flg5_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg6);
		p.Cnd_cst_grp_flg6.setNextBeans(p.Cnd_cst_grp_flg7);
		p.Cnd_cst_grp_flg6.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_flg6_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg7);
		p.Cnd_cst_grp_flg7.setNextBeans(p.Cnd_cst_grp_flg8);
		p.Cnd_cst_grp_flg7.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_flg7_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg8);
		p.Cnd_cst_grp_flg8.setNextBeans(p.Cnd_cst_grp_flg9);
		p.Cnd_cst_grp_flg8.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_flg8_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg9);
		p.Cnd_cst_grp_flg9.setNextBeans(p.Cnd_cst_grp_flg10);
		p.Cnd_cst_grp_flg9.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_flg9_META);
		p.TtlPanel.add(p.Cnd_cst_grp_flg10);
		p.Cnd_cst_grp_flg10.setNextBeans(p.Cnd_dlv_grp_flg1);
		p.Cnd_cst_grp_flg10.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cst_grp_flg10_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg1);
		p.Cnd_dlv_grp_flg1.setNextBeans(p.Cnd_dlv_grp_flg2);
		p.Cnd_dlv_grp_flg1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_flg1_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg2);
		p.Cnd_dlv_grp_flg2.setNextBeans(p.Cnd_dlv_grp_flg3);
		p.Cnd_dlv_grp_flg2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_flg2_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg3);
		p.Cnd_dlv_grp_flg3.setNextBeans(p.Cnd_dlv_grp_flg4);
		p.Cnd_dlv_grp_flg3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_flg3_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg4);
		p.Cnd_dlv_grp_flg4.setNextBeans(p.Cnd_dlv_grp_flg5);
		p.Cnd_dlv_grp_flg4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_flg4_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg5);
		p.Cnd_dlv_grp_flg5.setNextBeans(p.Cnd_dlv_grp_flg6);
		p.Cnd_dlv_grp_flg5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_flg5_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg6);
		p.Cnd_dlv_grp_flg6.setNextBeans(p.Cnd_dlv_grp_flg7);
		p.Cnd_dlv_grp_flg6.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_flg6_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg7);
		p.Cnd_dlv_grp_flg7.setNextBeans(p.Cnd_dlv_grp_flg8);
		p.Cnd_dlv_grp_flg7.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_flg7_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg8);
		p.Cnd_dlv_grp_flg8.setNextBeans(p.Cnd_dlv_grp_flg9);
		p.Cnd_dlv_grp_flg8.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_flg8_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg9);
		p.Cnd_dlv_grp_flg9.setNextBeans(p.Cnd_dlv_grp_flg10);
		p.Cnd_dlv_grp_flg9.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_flg9_META);
		p.TtlPanel.add(p.Cnd_dlv_grp_flg10);
		p.Cnd_dlv_grp_flg10.setNextBeans(p.Cnd_select_all);
		p.Cnd_dlv_grp_flg10.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.dlv_grp_flg10_META);
		p.Cnd_select_all.setIcon("SELECT_ALL");
		p.Cnd_select_all.setFunctionKey(MCFunctionKey.F13);
		p.TtlPanel.add(p.Cnd_select_all);
		p.Cnd_select_all.setNextBeans(p.Cnd_deselect_all);
		p.Cnd_deselect_all.setIcon("DESELECT_ALL");
		p.Cnd_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.TtlPanel.add(p.Cnd_deselect_all);
		p.CndPanel.add(p.Cnd_cur_cd);
		p.Cnd_cur_cd.setNextBeans(p.Cnd_amt_dec_place);
		p.Cnd_cur_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.cur_cd_META);
		p.CndPanel.add(p.Cnd_amt_dec_place);
		p.Cnd_amt_dec_place.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0170.CndR.amt_dec_place_META);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd4(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.Cnd4Panel.setValueCheck(false);
		p.Cnd4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTtl(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.TtlPanel.setValueCheck(false);
		p.TtlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MGBBP_ActSlsSrch p) {
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
	protected static void jbInitBtn(MGBBP_ActSlsSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MGBBP0200.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBBP0200);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBBP0200);
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
		MGBBP_ActSlsSrch_MC.mcInitTop((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.mcInitFold((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.mcInitTab1((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.mcInitTab2((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.mcInitTab3((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.mcInitTab4((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.mcInitTab5((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.mcInitCnd((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.mcInitCnd2((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.mcInitCnd3((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.mcInitCnd4((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.mcInitTtl((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.mcInitCtrl((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.mcInitRslt((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.mcInitBtn((MGBBP_ActSlsSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBBP_ActSlsSrch_MC.statusInitSRCH_Top((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitSRCH_Fold((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitSRCH_Tab1((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitSRCH_Tab2((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitSRCH_Tab3((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitSRCH_Tab4((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitSRCH_Tab5((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitSRCH_Cnd((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitSRCH_Cnd2((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitSRCH_Cnd3((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitSRCH_Cnd4((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitSRCH_Ttl((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitSRCH_Ctrl((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitSRCH_Rslt((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitSRCH_Btn((MGBBP_ActSlsSrch)this);

		// [REF]ステータスのモードの設定
		MGBBP_ActSlsSrch_MC.statusInitREF_Top((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitREF_Fold((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitREF_Tab1((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitREF_Tab2((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitREF_Tab3((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitREF_Tab4((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitREF_Tab5((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitREF_Cnd((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitREF_Cnd2((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitREF_Cnd3((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitREF_Cnd4((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitREF_Ttl((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitREF_Ctrl((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitREF_Rslt((MGBBP_ActSlsSrch)this);
		MGBBP_ActSlsSrch_MC.statusInitREF_Btn((MGBBP_ActSlsSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBBP_ActSlsSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBBP_ActSlsSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBBP_ActSlsSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBBP_ActSlsSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MGBBP_ActSlsSrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MGBBP_ActSlsSrch p) {
	}

	/**
	 *  [Tab5]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab5(MGBBP_ActSlsSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBBP_ActSlsSrch p) {
		p.Cnd_calc_ctg_cd.setListListener(p);
		p.Cnd_calc_ctg_cd.addAllListener(p);
		p.Cnd_calc_ctg_nm.setListListener(p);
		p.Cnd_calc_ctg_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_ym_fr.setListListener(p);
		p.Cnd_ym_fr.addAllListener(p);
		p.Cnd_ym_to.setListListener(p);
		p.Cnd_ym_to.addAllListener(p);
		p.Cnd_mng_dpt_cd.setListListener(p);
		p.Cnd_mng_dpt_cd.addAllListener(p);
		p.Cnd_mng_dpt_nm.setListListener(p);
		p.Cnd_mng_dpt_nm.addAllListener(p);
		p.Cnd_asst_typ.setListListener(p);
		p.Cnd_asst_typ.addAllListener(p);
		p.Cnd_asst_typ_nm.setListListener(p);
		p.Cnd_asst_typ_nm.addAllListener(p);
		p.Cnd_act_sls_id.setListListener(p);
		p.Cnd_act_sls_id.addAllListener(p);
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
		p.Cnd_ac_slip_typ.setListListener(p);
		p.Cnd_ac_slip_typ.addAllListener(p);
		p.Cnd_ac_slip_typ_nm.setListListener(p);
		p.Cnd_ac_slip_typ_nm.addAllListener(p);
		p.Cnd_ac_rsn_cd.setListListener(p);
		p.Cnd_ac_rsn_cd.addAllListener(p);
		p.Cnd_ac_rsn_nm.setListListener(p);
		p.Cnd_ac_rsn_nm.addAllListener(p);
		p.Cnd_no_ac_rsn_flg.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
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
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_no_slo_no_flg.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_no_iv_no_flg.addAllListener(p);
		p.Cnd_sls_dpt_cd.setListListener(p);
		p.Cnd_sls_dpt_cd.addAllListener(p);
		p.Cnd_sls_dpt_nm.setListListener(p);
		p.Cnd_sls_dpt_nm.addAllListener(p);
		p.Cnd_sls_usr_cd.setListListener(p);
		p.Cnd_sls_usr_cd.addAllListener(p);
		p.Cnd_sls_usr_nm.setListListener(p);
		p.Cnd_sls_usr_nm.addAllListener(p);
		p.Cnd_stk_bp_cd.setListListener(p);
		p.Cnd_stk_bp_cd.addAllListener(p);
		p.Cnd_stk_bp_nm.setListListener(p);
		p.Cnd_stk_bp_nm.addAllListener(p);
		p.Cnd_no_stk_bp_flg.addAllListener(p);
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
		p.Cnd_rec_eval_typ.setListListener(p);
		p.Cnd_rec_eval_typ.addAllListener(p);
		p.Cnd_rec_eval_typ_nm.setListListener(p);
		p.Cnd_rec_eval_typ_nm.addAllListener(p);
		p.Cnd_rmrks.setListListener(p);
		p.Cnd_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
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
		p.Cnd_calc_ctg_flg.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_ym_flg.addAllListener(p);
		p.Cnd_ac_dt_flg.addAllListener(p);
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
		p.Cnd_asst_typ_flg.addAllListener(p);
		p.Cnd_ac_slip_typ_flg.addAllListener(p);
		p.Cnd_ac_rsn_flg.addAllListener(p);
		p.Cnd_slo_no_flg.addAllListener(p);
		p.Cnd_iv_no_flg.addAllListener(p);
		p.Cnd_sls_dpt_flg.addAllListener(p);
		p.Cnd_sls_usr_flg.addAllListener(p);
		p.Cnd_stk_bp_flg.addAllListener(p);
		p.Cnd_alc_dpt_flg.addAllListener(p);
		p.Cnd_cst_flg.addAllListener(p);
		p.Cnd_cst_cntry_flg.addAllListener(p);
		p.Cnd_cst_area_flg.addAllListener(p);
		p.Cnd_dlv_flg.addAllListener(p);
		p.Cnd_dlv_cntry_flg.addAllListener(p);
		p.Cnd_dlv_area_flg.addAllListener(p);
		p.Cnd_dest1_flg.addAllListener(p);
		p.Cnd_dest2_flg.addAllListener(p);
		p.Cnd_dest3_flg.addAllListener(p);
		p.Cnd_cost_sls1_flg.addAllListener(p);
		p.Cnd_cost_sls2_flg.addAllListener(p);
		p.Cnd_cost_sls3_flg.addAllListener(p);
		p.Cnd_cost_sls4_flg.addAllListener(p);
		p.Cnd_cost_sls5_flg.addAllListener(p);
		p.Cnd_trd_cur_flg.addAllListener(p);
		p.Cnd_xrate_flg.addAllListener(p);
		p.Cnd_rec_eval_typ_flg.addAllListener(p);
		p.Cnd_alc_sls_id_flg.addAllListener(p);
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
		p.Cnd_cur_cd.setListListener(p);
		p.Cnd_cur_cd.addAllListener(p);
		p.Cnd_amt_dec_place.setListListener(p);
		p.Cnd_amt_dec_place.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBBP_ActSlsSrch p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MGBBP_ActSlsSrch p) {
	}

	/**
	 *  [Cnd4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd4(MGBBP_ActSlsSrch p) {
	}

	/**
	 *  [Ttl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTtl(MGBBP_ActSlsSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBBP_ActSlsSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBBP_ActSlsSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_calc_ctg_cd.addAllListener(p);
		p.columnRslt_calc_ctg_cd.setListListener(p);
		p.columnRslt_calc_ctg_nm.addAllListener(p);
		p.columnRslt_calc_ctg_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_ym.addAllListener(p);
		p.columnRslt_ym.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_mng_dpt_cd.addAllListener(p);
		p.columnRslt_mng_dpt_cd.setListListener(p);
		p.columnRslt_mng_dpt_nm.addAllListener(p);
		p.columnRslt_mng_dpt_nm.setListListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
		p.columnRslt_itm_jnl_cd.addAllListener(p);
		p.columnRslt_itm_jnl_cd.setListListener(p);
		p.columnRslt_itm_jnl_nm.addAllListener(p);
		p.columnRslt_itm_jnl_nm.setListListener(p);
		p.columnRslt_itm_grp_cd1.addAllListener(p);
		p.columnRslt_itm_grp_cd1.setListListener(p);
		p.columnRslt_itm_grp_nm1.addAllListener(p);
		p.columnRslt_itm_grp_nm1.setListListener(p);
		p.columnRslt_itm_grp_cd2.addAllListener(p);
		p.columnRslt_itm_grp_cd2.setListListener(p);
		p.columnRslt_itm_grp_nm2.addAllListener(p);
		p.columnRslt_itm_grp_nm2.setListListener(p);
		p.columnRslt_itm_grp_cd3.addAllListener(p);
		p.columnRslt_itm_grp_cd3.setListListener(p);
		p.columnRslt_itm_grp_nm3.addAllListener(p);
		p.columnRslt_itm_grp_nm3.setListListener(p);
		p.columnRslt_itm_grp_cd4.addAllListener(p);
		p.columnRslt_itm_grp_cd4.setListListener(p);
		p.columnRslt_itm_grp_nm4.addAllListener(p);
		p.columnRslt_itm_grp_nm4.setListListener(p);
		p.columnRslt_itm_grp_cd5.addAllListener(p);
		p.columnRslt_itm_grp_cd5.setListListener(p);
		p.columnRslt_itm_grp_nm5.addAllListener(p);
		p.columnRslt_itm_grp_nm5.setListListener(p);
		p.columnRslt_itm_grp_cd6.addAllListener(p);
		p.columnRslt_itm_grp_cd6.setListListener(p);
		p.columnRslt_itm_grp_nm6.addAllListener(p);
		p.columnRslt_itm_grp_nm6.setListListener(p);
		p.columnRslt_itm_grp_cd7.addAllListener(p);
		p.columnRslt_itm_grp_cd7.setListListener(p);
		p.columnRslt_itm_grp_nm7.addAllListener(p);
		p.columnRslt_itm_grp_nm7.setListListener(p);
		p.columnRslt_itm_grp_cd8.addAllListener(p);
		p.columnRslt_itm_grp_cd8.setListListener(p);
		p.columnRslt_itm_grp_nm8.addAllListener(p);
		p.columnRslt_itm_grp_nm8.setListListener(p);
		p.columnRslt_itm_grp_cd9.addAllListener(p);
		p.columnRslt_itm_grp_cd9.setListListener(p);
		p.columnRslt_itm_grp_nm9.addAllListener(p);
		p.columnRslt_itm_grp_nm9.setListListener(p);
		p.columnRslt_itm_grp_cd10.addAllListener(p);
		p.columnRslt_itm_grp_cd10.setListListener(p);
		p.columnRslt_itm_grp_nm10.addAllListener(p);
		p.columnRslt_itm_grp_nm10.setListListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_sno1.addAllListener(p);
		p.columnRslt_sno1.setListListener(p);
		p.columnRslt_sno2.addAllListener(p);
		p.columnRslt_sno2.setListListener(p);
		p.columnRslt_sno3.addAllListener(p);
		p.columnRslt_sno3.setListListener(p);
		p.columnRslt_sno4.addAllListener(p);
		p.columnRslt_sno4.setListListener(p);
		p.columnRslt_ac_slip_typ.addAllListener(p);
		p.columnRslt_ac_slip_typ.setListListener(p);
		p.columnRslt_ac_slip_typ_nm.addAllListener(p);
		p.columnRslt_ac_slip_typ_nm.setListListener(p);
		p.columnRslt_ac_rsn_cd.addAllListener(p);
		p.columnRslt_ac_rsn_cd.setListListener(p);
		p.columnRslt_ac_rsn_nm.addAllListener(p);
		p.columnRslt_ac_rsn_nm.setListListener(p);
		p.columnRslt_asst_typ.addAllListener(p);
		p.columnRslt_asst_typ.setListListener(p);
		p.columnRslt_asst_typ_nm.addAllListener(p);
		p.columnRslt_asst_typ_nm.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.columnRslt_cst_grp_cd1.addAllListener(p);
		p.columnRslt_cst_grp_cd1.setListListener(p);
		p.columnRslt_cst_grp_nm1.addAllListener(p);
		p.columnRslt_cst_grp_nm1.setListListener(p);
		p.columnRslt_cst_grp_cd2.addAllListener(p);
		p.columnRslt_cst_grp_cd2.setListListener(p);
		p.columnRslt_cst_grp_nm2.addAllListener(p);
		p.columnRslt_cst_grp_nm2.setListListener(p);
		p.columnRslt_cst_grp_cd3.addAllListener(p);
		p.columnRslt_cst_grp_cd3.setListListener(p);
		p.columnRslt_cst_grp_nm3.addAllListener(p);
		p.columnRslt_cst_grp_nm3.setListListener(p);
		p.columnRslt_cst_grp_cd4.addAllListener(p);
		p.columnRslt_cst_grp_cd4.setListListener(p);
		p.columnRslt_cst_grp_nm4.addAllListener(p);
		p.columnRslt_cst_grp_nm4.setListListener(p);
		p.columnRslt_cst_grp_cd5.addAllListener(p);
		p.columnRslt_cst_grp_cd5.setListListener(p);
		p.columnRslt_cst_grp_nm5.addAllListener(p);
		p.columnRslt_cst_grp_nm5.setListListener(p);
		p.columnRslt_cst_grp_cd6.addAllListener(p);
		p.columnRslt_cst_grp_cd6.setListListener(p);
		p.columnRslt_cst_grp_nm6.addAllListener(p);
		p.columnRslt_cst_grp_nm6.setListListener(p);
		p.columnRslt_cst_grp_cd7.addAllListener(p);
		p.columnRslt_cst_grp_cd7.setListListener(p);
		p.columnRslt_cst_grp_nm7.addAllListener(p);
		p.columnRslt_cst_grp_nm7.setListListener(p);
		p.columnRslt_cst_grp_cd8.addAllListener(p);
		p.columnRslt_cst_grp_cd8.setListListener(p);
		p.columnRslt_cst_grp_nm8.addAllListener(p);
		p.columnRslt_cst_grp_nm8.setListListener(p);
		p.columnRslt_cst_grp_cd9.addAllListener(p);
		p.columnRslt_cst_grp_cd9.setListListener(p);
		p.columnRslt_cst_grp_nm9.addAllListener(p);
		p.columnRslt_cst_grp_nm9.setListListener(p);
		p.columnRslt_cst_grp_cd10.addAllListener(p);
		p.columnRslt_cst_grp_cd10.setListListener(p);
		p.columnRslt_cst_grp_nm10.addAllListener(p);
		p.columnRslt_cst_grp_nm10.setListListener(p);
		p.columnRslt_cst_cntry_cd.addAllListener(p);
		p.columnRslt_cst_cntry_cd.setListListener(p);
		p.columnRslt_cst_cntry_nm.addAllListener(p);
		p.columnRslt_cst_cntry_nm.setListListener(p);
		p.columnRslt_cst_area_cd.addAllListener(p);
		p.columnRslt_cst_area_cd.setListListener(p);
		p.columnRslt_cst_area_nm.addAllListener(p);
		p.columnRslt_cst_area_nm.setListListener(p);
		p.columnRslt_dlv_cd.addAllListener(p);
		p.columnRslt_dlv_cd.setListListener(p);
		p.columnRslt_dlv_nm.addAllListener(p);
		p.columnRslt_dlv_nm.setListListener(p);
		p.columnRslt_dlv_grp_cd1.addAllListener(p);
		p.columnRslt_dlv_grp_cd1.setListListener(p);
		p.columnRslt_dlv_grp_nm1.addAllListener(p);
		p.columnRslt_dlv_grp_nm1.setListListener(p);
		p.columnRslt_dlv_grp_cd2.addAllListener(p);
		p.columnRslt_dlv_grp_cd2.setListListener(p);
		p.columnRslt_dlv_grp_nm2.addAllListener(p);
		p.columnRslt_dlv_grp_nm2.setListListener(p);
		p.columnRslt_dlv_grp_cd3.addAllListener(p);
		p.columnRslt_dlv_grp_cd3.setListListener(p);
		p.columnRslt_dlv_grp_nm3.addAllListener(p);
		p.columnRslt_dlv_grp_nm3.setListListener(p);
		p.columnRslt_dlv_grp_cd4.addAllListener(p);
		p.columnRslt_dlv_grp_cd4.setListListener(p);
		p.columnRslt_dlv_grp_nm4.addAllListener(p);
		p.columnRslt_dlv_grp_nm4.setListListener(p);
		p.columnRslt_dlv_grp_cd5.addAllListener(p);
		p.columnRslt_dlv_grp_cd5.setListListener(p);
		p.columnRslt_dlv_grp_nm5.addAllListener(p);
		p.columnRslt_dlv_grp_nm5.setListListener(p);
		p.columnRslt_dlv_grp_cd6.addAllListener(p);
		p.columnRslt_dlv_grp_cd6.setListListener(p);
		p.columnRslt_dlv_grp_nm6.addAllListener(p);
		p.columnRslt_dlv_grp_nm6.setListListener(p);
		p.columnRslt_dlv_grp_cd7.addAllListener(p);
		p.columnRslt_dlv_grp_cd7.setListListener(p);
		p.columnRslt_dlv_grp_nm7.addAllListener(p);
		p.columnRslt_dlv_grp_nm7.setListListener(p);
		p.columnRslt_dlv_grp_cd8.addAllListener(p);
		p.columnRslt_dlv_grp_cd8.setListListener(p);
		p.columnRslt_dlv_grp_nm8.addAllListener(p);
		p.columnRslt_dlv_grp_nm8.setListListener(p);
		p.columnRslt_dlv_grp_cd9.addAllListener(p);
		p.columnRslt_dlv_grp_cd9.setListListener(p);
		p.columnRslt_dlv_grp_nm9.addAllListener(p);
		p.columnRslt_dlv_grp_nm9.setListListener(p);
		p.columnRslt_dlv_grp_cd10.addAllListener(p);
		p.columnRslt_dlv_grp_cd10.setListListener(p);
		p.columnRslt_dlv_grp_nm10.addAllListener(p);
		p.columnRslt_dlv_grp_nm10.setListListener(p);
		p.columnRslt_dlv_cntry_cd.addAllListener(p);
		p.columnRslt_dlv_cntry_cd.setListListener(p);
		p.columnRslt_dlv_cntry_nm.addAllListener(p);
		p.columnRslt_dlv_cntry_nm.setListListener(p);
		p.columnRslt_dlv_area_cd.addAllListener(p);
		p.columnRslt_dlv_area_cd.setListListener(p);
		p.columnRslt_dlv_area_nm.addAllListener(p);
		p.columnRslt_dlv_area_nm.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_unit_cd.addAllListener(p);
		p.columnRslt_unit_cd.setListListener(p);
		p.columnRslt_unit_nm.addAllListener(p);
		p.columnRslt_unit_nm.setListListener(p);
		p.columnRslt_dec_place.addAllListener(p);
		p.columnRslt_dec_place.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_amt_dec_place.setListListener(p);
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
		p.columnRslt_sls_dpt_cd.addAllListener(p);
		p.columnRslt_sls_dpt_cd.setListListener(p);
		p.columnRslt_sls_dpt_nm.addAllListener(p);
		p.columnRslt_sls_dpt_nm.setListListener(p);
		p.columnRslt_sls_usr_cd.addAllListener(p);
		p.columnRslt_sls_usr_cd.setListListener(p);
		p.columnRslt_sls_usr_nm.addAllListener(p);
		p.columnRslt_sls_usr_nm.setListListener(p);
		p.columnRslt_stk_bp_cd.addAllListener(p);
		p.columnRslt_stk_bp_cd.setListListener(p);
		p.columnRslt_stk_bp_nm.addAllListener(p);
		p.columnRslt_stk_bp_nm.setListListener(p);
		p.columnRslt_alc_dpt_cd.addAllListener(p);
		p.columnRslt_alc_dpt_cd.setListListener(p);
		p.columnRslt_alc_dpt_nm.addAllListener(p);
		p.columnRslt_alc_dpt_nm.setListListener(p);
		p.columnRslt_dest_cd1.addAllListener(p);
		p.columnRslt_dest_cd1.setListListener(p);
		p.columnRslt_dest_nm1.addAllListener(p);
		p.columnRslt_dest_nm1.setListListener(p);
		p.columnRslt_dest_cd2.addAllListener(p);
		p.columnRslt_dest_cd2.setListListener(p);
		p.columnRslt_dest_nm2.addAllListener(p);
		p.columnRslt_dest_nm2.setListListener(p);
		p.columnRslt_dest_cd3.addAllListener(p);
		p.columnRslt_dest_cd3.setListListener(p);
		p.columnRslt_dest_nm3.addAllListener(p);
		p.columnRslt_dest_nm3.setListListener(p);
		p.columnRslt_cost_sls_cd1.addAllListener(p);
		p.columnRslt_cost_sls_cd1.setListListener(p);
		p.columnRslt_cost_sls_nm1.addAllListener(p);
		p.columnRslt_cost_sls_nm1.setListListener(p);
		p.columnRslt_cost_sls_cd2.addAllListener(p);
		p.columnRslt_cost_sls_cd2.setListListener(p);
		p.columnRslt_cost_sls_nm2.addAllListener(p);
		p.columnRslt_cost_sls_nm2.setListListener(p);
		p.columnRslt_cost_sls_cd3.addAllListener(p);
		p.columnRslt_cost_sls_cd3.setListListener(p);
		p.columnRslt_cost_sls_nm3.addAllListener(p);
		p.columnRslt_cost_sls_nm3.setListListener(p);
		p.columnRslt_cost_sls_cd4.addAllListener(p);
		p.columnRslt_cost_sls_cd4.setListListener(p);
		p.columnRslt_cost_sls_nm4.addAllListener(p);
		p.columnRslt_cost_sls_nm4.setListListener(p);
		p.columnRslt_cost_sls_cd5.addAllListener(p);
		p.columnRslt_cost_sls_cd5.setListListener(p);
		p.columnRslt_cost_sls_nm5.addAllListener(p);
		p.columnRslt_cost_sls_nm5.setListListener(p);
		p.columnRslt_alc_val1.addAllListener(p);
		p.columnRslt_alc_val1.setListListener(p);
		p.columnRslt_alc_val2.addAllListener(p);
		p.columnRslt_alc_val2.setListListener(p);
		p.columnRslt_alc_val3.addAllListener(p);
		p.columnRslt_alc_val3.setListListener(p);
		p.columnRslt_alc_val4.addAllListener(p);
		p.columnRslt_alc_val4.setListListener(p);
		p.columnRslt_alc_val5.addAllListener(p);
		p.columnRslt_alc_val5.setListListener(p);
		p.columnRslt_rec_eval_typ.addAllListener(p);
		p.columnRslt_rec_eval_typ.setListListener(p);
		p.columnRslt_rec_eval_typ_nm.addAllListener(p);
		p.columnRslt_rec_eval_typ_nm.setListListener(p);
		p.columnRslt_zero_effect_flg.addAllListener(p);
		p.columnRslt_act_sls_id.addAllListener(p);
		p.columnRslt_act_sls_id.setListListener(p);
		p.columnRslt_act_sls_id_sub.addAllListener(p);
		p.columnRslt_act_sls_id_sub.setListListener(p);
		p.columnRslt_rmrks.addAllListener(p);
		p.columnRslt_rmrks.setListListener(p);
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
	protected static void mcInitBtn(MGBBP_ActSlsSrch p) {
		p.Btn_open_MGBBP0200.addAllListener(p);
		p.Btn_open_MGBBP0200.setAPMethodName("doBtn_open_MGBBP0200");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBBP_ActSlsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBBP_ActSlsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MGBBP_ActSlsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MGBBP_ActSlsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MGBBP_ActSlsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab4(MGBBP_ActSlsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab5(MGBBP_ActSlsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBBP_ActSlsSrch p){
		p.Cnd_calc_ctg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_act_sls_id.putMode(p, SRCH, MCMode.ENABLE);
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
		p.Cnd_ac_slip_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ac_rsn_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_rsn_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_ac_rsn_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
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
		p.Cnd_slo_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_slo_no_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_iv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_iv_no_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_stk_bp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_stk_bp_flg.putMode(p, SRCH, MCMode.REQUIRED);
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
		p.Cnd_rec_eval_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rec_eval_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
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
		p.Cnd_calc_ctg_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ym_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ac_dt_flg.putMode(p, SRCH, MCMode.REQUIRED);
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
		p.Cnd_asst_typ_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ac_slip_typ_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ac_rsn_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_slo_no_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_iv_no_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sls_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sls_usr_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_stk_bp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_alc_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_cntry_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cst_area_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_cntry_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_area_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dest1_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dest2_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dest3_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cost_sls1_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cost_sls2_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cost_sls3_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cost_sls4_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cost_sls5_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_trd_cur_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_xrate_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rec_eval_typ_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_alc_sls_id_flg.putMode(p, SRCH, MCMode.REQUIRED);
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
		p.Cnd_cur_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MGBBP_ActSlsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MGBBP_ActSlsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd4(MGBBP_ActSlsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ttl(MGBBP_ActSlsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBBP_ActSlsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBBP_ActSlsSrch p){
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_area_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_area_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_area_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_area_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_trd_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_val1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_val2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_val3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_val4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_val5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_expns_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_zero_effect_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act_sls_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act_sls_id_sub.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
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
	protected static void statusInitSRCH_Btn(MGBBP_ActSlsSrch p){
		p.Btn_open_MGBBP0200.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBBP_ActSlsSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBBP_ActSlsSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBBP_ActSlsSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBBP_ActSlsSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MGBBP_ActSlsSrch p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MGBBP_ActSlsSrch p){

	}

	/**
	 * [REF]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab5(MGBBP_ActSlsSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBBP_ActSlsSrch p){
		p.Cnd_calc_ctg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_act_sls_id.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_ac_slip_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ac_rsn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_rsn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_ac_rsn_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_trd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_slo_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_slo_no_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_iv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_iv_no_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sls_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_stk_bp_flg.putMode(p, REF, MCMode.REQUIRED);
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
		p.Cnd_rec_eval_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rec_eval_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_calc_ctg_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ym_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ac_dt_flg.putMode(p, REF, MCMode.REQUIRED);
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
		p.Cnd_asst_typ_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ac_slip_typ_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ac_rsn_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_slo_no_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_iv_no_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sls_dpt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sls_usr_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_stk_bp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_alc_dpt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_cntry_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cst_area_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_cntry_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_area_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dest1_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dest2_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dest3_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cost_sls1_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cost_sls2_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cost_sls3_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cost_sls4_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cost_sls5_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_trd_cur_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_xrate_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rec_eval_typ_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_alc_sls_id_flg.putMode(p, REF, MCMode.REQUIRED);
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
		p.Cnd_cur_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBBP_ActSlsSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MGBBP_ActSlsSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd4(MGBBP_ActSlsSrch p){

	}

	/**
	 * [REF]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ttl(MGBBP_ActSlsSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBBP_ActSlsSrch p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBBP_ActSlsSrch p){
		p.columnRslt_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_grp_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_grp_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_area_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_area_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_grp_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_area_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_area_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_trd_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cost_sls_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_val1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_val2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_val3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_val4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_val5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rec_eval_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_expns_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_zero_effect_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act_sls_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act_sls_id_sub.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_Btn(MGBBP_ActSlsSrch p){
		p.Btn_open_MGBBP0200.putMode(p, REF, MCMode.ENABLE);

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
		MGBBP_ActSlsSrch_MC.setTableConfigRslt((MGBBP_ActSlsSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBBP_ActSlsSrch p) {
		p.columnRslt_calc_ctg_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.calc_ctg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_ctg_cd);
		p.columnRslt_calc_ctg_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.calc_ctg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_ctg_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_ym.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.ym_META);
		p.columnRslt_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ym);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_mng_dpt_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.mng_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mng_dpt_cd);
		p.columnRslt_mng_dpt_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.mng_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mng_dpt_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.columnRslt_itm_jnl_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_jnl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_cd);
		p.columnRslt_itm_jnl_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_jnl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_nm);
		p.columnRslt_itm_grp_cd1.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd1);
		p.columnRslt_itm_grp_nm1.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm1);
		p.columnRslt_itm_grp_cd2.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd2);
		p.columnRslt_itm_grp_nm2.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm2);
		p.columnRslt_itm_grp_cd3.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd3);
		p.columnRslt_itm_grp_nm3.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm3);
		p.columnRslt_itm_grp_cd4.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_cd4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd4);
		p.columnRslt_itm_grp_nm4.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm4);
		p.columnRslt_itm_grp_cd5.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_cd5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd5);
		p.columnRslt_itm_grp_nm5.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_nm5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm5);
		p.columnRslt_itm_grp_cd6.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_cd6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd6);
		p.columnRslt_itm_grp_nm6.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_nm6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm6);
		p.columnRslt_itm_grp_cd7.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_cd7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd7);
		p.columnRslt_itm_grp_nm7.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_nm7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm7);
		p.columnRslt_itm_grp_cd8.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_cd8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd8);
		p.columnRslt_itm_grp_nm8.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_nm8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm8);
		p.columnRslt_itm_grp_cd9.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_cd9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd9);
		p.columnRslt_itm_grp_nm9.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_nm9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm9);
		p.columnRslt_itm_grp_cd10.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_cd10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_cd10);
		p.columnRslt_itm_grp_nm10.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.itm_grp_nm10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_grp_nm10);
		p.columnRslt_lot_no.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.columnRslt_sno1.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.sno1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1);
		p.columnRslt_sno2.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.sno2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2);
		p.columnRslt_sno3.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.sno3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3);
		p.columnRslt_sno4.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.sno4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4);
		p.columnRslt_ac_slip_typ.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.ac_slip_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_slip_typ);
		p.columnRslt_ac_slip_typ_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.ac_slip_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_slip_typ_nm);
		p.columnRslt_ac_rsn_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.ac_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_rsn_cd);
		p.columnRslt_ac_rsn_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.ac_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_rsn_nm);
		p.columnRslt_asst_typ.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.asst_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asst_typ);
		p.columnRslt_asst_typ_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.asst_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asst_typ_nm);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.columnRslt_cst_grp_cd1.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_cd1);
		p.columnRslt_cst_grp_nm1.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_nm1);
		p.columnRslt_cst_grp_cd2.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_cd2);
		p.columnRslt_cst_grp_nm2.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_nm2);
		p.columnRslt_cst_grp_cd3.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_cd3);
		p.columnRslt_cst_grp_nm3.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_nm3);
		p.columnRslt_cst_grp_cd4.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_cd4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_cd4);
		p.columnRslt_cst_grp_nm4.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_nm4);
		p.columnRslt_cst_grp_cd5.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_cd5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_cd5);
		p.columnRslt_cst_grp_nm5.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_nm5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_nm5);
		p.columnRslt_cst_grp_cd6.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_cd6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_cd6);
		p.columnRslt_cst_grp_nm6.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_nm6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_nm6);
		p.columnRslt_cst_grp_cd7.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_cd7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_cd7);
		p.columnRslt_cst_grp_nm7.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_nm7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_nm7);
		p.columnRslt_cst_grp_cd8.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_cd8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_cd8);
		p.columnRslt_cst_grp_nm8.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_nm8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_nm8);
		p.columnRslt_cst_grp_cd9.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_cd9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_cd9);
		p.columnRslt_cst_grp_nm9.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_nm9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_nm9);
		p.columnRslt_cst_grp_cd10.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_cd10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_cd10);
		p.columnRslt_cst_grp_nm10.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_grp_nm10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_grp_nm10);
		p.columnRslt_cst_cntry_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_cntry_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cntry_cd);
		p.columnRslt_cst_cntry_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_cntry_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cntry_nm);
		p.columnRslt_cst_area_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_area_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_area_cd);
		p.columnRslt_cst_area_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cst_area_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_area_nm);
		p.columnRslt_dlv_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_cd);
		p.columnRslt_dlv_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_nm);
		p.columnRslt_dlv_grp_cd1.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_cd1);
		p.columnRslt_dlv_grp_nm1.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_nm1);
		p.columnRslt_dlv_grp_cd2.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_cd2);
		p.columnRslt_dlv_grp_nm2.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_nm2);
		p.columnRslt_dlv_grp_cd3.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_cd3);
		p.columnRslt_dlv_grp_nm3.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_nm3);
		p.columnRslt_dlv_grp_cd4.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_cd4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_cd4);
		p.columnRslt_dlv_grp_nm4.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_nm4);
		p.columnRslt_dlv_grp_cd5.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_cd5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_cd5);
		p.columnRslt_dlv_grp_nm5.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_nm5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_nm5);
		p.columnRslt_dlv_grp_cd6.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_cd6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_cd6);
		p.columnRslt_dlv_grp_nm6.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_nm6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_nm6);
		p.columnRslt_dlv_grp_cd7.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_cd7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_cd7);
		p.columnRslt_dlv_grp_nm7.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_nm7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_nm7);
		p.columnRslt_dlv_grp_cd8.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_cd8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_cd8);
		p.columnRslt_dlv_grp_nm8.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_nm8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_nm8);
		p.columnRslt_dlv_grp_cd9.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_cd9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_cd9);
		p.columnRslt_dlv_grp_nm9.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_nm9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_nm9);
		p.columnRslt_dlv_grp_cd10.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_cd10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_cd10);
		p.columnRslt_dlv_grp_nm10.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_grp_nm10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_grp_nm10);
		p.columnRslt_dlv_cntry_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_cntry_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_cntry_cd);
		p.columnRslt_dlv_cntry_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_cntry_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_cntry_nm);
		p.columnRslt_dlv_area_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_area_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_area_cd);
		p.columnRslt_dlv_area_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dlv_area_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_area_nm);
		p.columnRslt_slo_no.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_iv_no.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.RsltTable.addTable(p.Rslt_qty_p_PPanel.QtyTable);
		p.columnRslt_unit_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_cd);
		p.columnRslt_unit_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_nm);
		p.columnRslt_dec_place.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_amt_dec_place.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.trd_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_trd_amt_p_PPanel.AmtTable);
		p.columnRslt_xrate.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.RsltTable.addTable(p.Rslt_amt_p_PPanel.AmtTable);
		p.columnRslt_sls_dpt_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.sls_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_cd);
		p.columnRslt_sls_dpt_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.sls_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_nm);
		p.columnRslt_sls_usr_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.sls_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_usr_cd);
		p.columnRslt_sls_usr_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.sls_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_usr_nm);
		p.columnRslt_stk_bp_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.stk_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_cd);
		p.columnRslt_stk_bp_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.stk_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_nm);
		p.columnRslt_alc_dpt_cd.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.alc_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_dpt_cd);
		p.columnRslt_alc_dpt_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.alc_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_dpt_nm);
		p.columnRslt_dest_cd1.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dest_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd1);
		p.columnRslt_dest_nm1.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dest_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_nm1);
		p.columnRslt_dest_cd2.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dest_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd2);
		p.columnRslt_dest_nm2.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dest_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_nm2);
		p.columnRslt_dest_cd3.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dest_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd3);
		p.columnRslt_dest_nm3.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.dest_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_nm3);
		p.columnRslt_cost_sls_cd1.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cost_sls_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cost_sls_cd1);
		p.columnRslt_cost_sls_nm1.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cost_sls_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cost_sls_nm1);
		p.columnRslt_cost_sls_cd2.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cost_sls_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cost_sls_cd2);
		p.columnRslt_cost_sls_nm2.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cost_sls_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cost_sls_nm2);
		p.columnRslt_cost_sls_cd3.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cost_sls_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cost_sls_cd3);
		p.columnRslt_cost_sls_nm3.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cost_sls_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cost_sls_nm3);
		p.columnRslt_cost_sls_cd4.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cost_sls_cd4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cost_sls_cd4);
		p.columnRslt_cost_sls_nm4.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cost_sls_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cost_sls_nm4);
		p.columnRslt_cost_sls_cd5.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cost_sls_cd5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cost_sls_cd5);
		p.columnRslt_cost_sls_nm5.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.cost_sls_nm5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cost_sls_nm5);
		p.columnRslt_alc_val1.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.alc_val1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_val1);
		p.columnRslt_alc_val2.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.alc_val2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_val2);
		p.columnRslt_alc_val3.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.alc_val3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_val3);
		p.columnRslt_alc_val4.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.alc_val4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_val4);
		p.columnRslt_alc_val5.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.alc_val5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_val5);
		p.columnRslt_rec_eval_typ.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.rec_eval_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rec_eval_typ);
		p.columnRslt_rec_eval_typ_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.rec_eval_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rec_eval_typ_nm);
		p.RsltTable.addTable(p.Rslt_expns_amt_p_PPanel.AmtTable);
		p.columnRslt_zero_effect_flg.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.zero_effect_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_zero_effect_flg);
		p.columnRslt_act_sls_id.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.act_sls_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_sls_id);
		p.columnRslt_act_sls_id_sub.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.act_sls_id_sub_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_sls_id_sub);
		p.columnRslt_rmrks.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMGBB.MGBBP0170.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_ctg_cd.getListConfig().setPutter(getCnd_calc_ctg_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_mng_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mng_dpt_cd.getListConfig().setPutter(getCnd_mng_dpt_cd_ListPutter());
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
		Cnd_ac_slip_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_slip_typ.getListConfig().setPutter(getCnd_ac_slip_typ_ListPutter());
		Cnd_ac_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_rsn_cd.getListConfig().setPutter(getCnd_ac_rsn_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
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
		Cnd_stk_bp_cd.getListConfig().setPutter(getCnd_stk_bp_cd_ListPutter());
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
		Cnd_rec_eval_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rec_eval_typ.getListConfig().setPutter(getCnd_rec_eval_typ_ListPutter());
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
	 * [Cnd_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
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
	 * [Cnd_stk_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Cnd_rec_eval_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rec_eval_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.RecEvalTyp");
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
		if(combo == Cnd_calc_ctg_cd) return getCnd_calc_ctg_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_mng_dpt_cd) return getCnd_mng_dpt_cd(row, info);
		if(combo == Cnd_asst_typ) return getCnd_asst_typ(row, info);
		if(combo == Cnd_itm_jnl_cd) return getCnd_itm_jnl_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_ac_slip_typ) return getCnd_ac_slip_typ(row, info);
		if(combo == Cnd_ac_rsn_cd) return getCnd_ac_rsn_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_cst_cntry_cd) return getCnd_cst_cntry_cd(row, info);
		if(combo == Cnd_cst_area_cd) return getCnd_cst_area_cd(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_dlv_cntry_cd) return getCnd_dlv_cntry_cd(row, info);
		if(combo == Cnd_dlv_area_cd) return getCnd_dlv_area_cd(row, info);
		if(combo == Cnd_sls_dpt_cd) return getCnd_sls_dpt_cd(row, info);
		if(combo == Cnd_sls_usr_cd) return getCnd_sls_usr_cd(row, info);
		if(combo == Cnd_stk_bp_cd) return getCnd_stk_bp_cd(row, info);
		if(combo == Cnd_alc_dpt_cd) return getCnd_alc_dpt_cd(row, info);
		if(combo == Cnd_dest_cd1) return getCnd_dest_cd1(row, info);
		if(combo == Cnd_dest_cd2) return getCnd_dest_cd2(row, info);
		if(combo == Cnd_dest_cd3) return getCnd_dest_cd3(row, info);
		if(combo == Cnd_cost_sls_cd1) return getCnd_cost_sls_cd1(row, info);
		if(combo == Cnd_cost_sls_cd2) return getCnd_cost_sls_cd2(row, info);
		if(combo == Cnd_cost_sls_cd3) return getCnd_cost_sls_cd3(row, info);
		if(combo == Cnd_cost_sls_cd4) return getCnd_cost_sls_cd4(row, info);
		if(combo == Cnd_cost_sls_cd5) return getCnd_cost_sls_cd5(row, info);
		if(combo == Cnd_rec_eval_typ) return getCnd_rec_eval_typ(row, info);
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
		else if (ap == Btn_open_MGBBP0200) doBtn_open_MGBBP0200(info);
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
	 * [Btn]パネルの[open_MGBBP0200]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0200(MCEventInfo info);

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
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_ym_fr) return doCnd_ym_fr_VC(info);
		if (vc == Cnd_ym_to) return doCnd_ym_to_VC(info);
		if (vc == Cnd_mng_dpt_cd) return doCnd_mng_dpt_cd_VC(info);
		if (vc == Cnd_mng_dpt_nm) return doCnd_mng_dpt_nm_VC(info);
		if (vc == Cnd_asst_typ) return doCnd_asst_typ_VC(info);
		if (vc == Cnd_asst_typ_nm) return doCnd_asst_typ_nm_VC(info);
		if (vc == Cnd_act_sls_id) return doCnd_act_sls_id_VC(info);
		if (vc == Cnd_itm_jnl_cd) return doCnd_itm_jnl_cd_VC(info);
		if (vc == Cnd_itm_jnl_nm) return doCnd_itm_jnl_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_sno1) return doCnd_sno1_VC(info);
		if (vc == Cnd_sno2) return doCnd_sno2_VC(info);
		if (vc == Cnd_sno3) return doCnd_sno3_VC(info);
		if (vc == Cnd_sno4) return doCnd_sno4_VC(info);
		if (vc == Cnd_ac_slip_typ) return doCnd_ac_slip_typ_VC(info);
		if (vc == Cnd_ac_slip_typ_nm) return doCnd_ac_slip_typ_nm_VC(info);
		if (vc == Cnd_ac_rsn_cd) return doCnd_ac_rsn_cd_VC(info);
		if (vc == Cnd_ac_rsn_nm) return doCnd_ac_rsn_nm_VC(info);
		if (vc == Cnd_no_ac_rsn_flg) return doCnd_no_ac_rsn_flg_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
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
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_no_slo_no_flg) return doCnd_no_slo_no_flg_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_no_iv_no_flg) return doCnd_no_iv_no_flg_VC(info);
		if (vc == Cnd_sls_dpt_cd) return doCnd_sls_dpt_cd_VC(info);
		if (vc == Cnd_sls_dpt_nm) return doCnd_sls_dpt_nm_VC(info);
		if (vc == Cnd_sls_usr_cd) return doCnd_sls_usr_cd_VC(info);
		if (vc == Cnd_sls_usr_nm) return doCnd_sls_usr_nm_VC(info);
		if (vc == Cnd_stk_bp_cd) return doCnd_stk_bp_cd_VC(info);
		if (vc == Cnd_stk_bp_nm) return doCnd_stk_bp_nm_VC(info);
		if (vc == Cnd_no_stk_bp_flg) return doCnd_no_stk_bp_flg_VC(info);
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
		if (vc == Cnd_rec_eval_typ) return doCnd_rec_eval_typ_VC(info);
		if (vc == Cnd_rec_eval_typ_nm) return doCnd_rec_eval_typ_nm_VC(info);
		if (vc == Cnd_rmrks) return doCnd_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
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
		if (vc == Cnd_calc_ctg_flg) return doCnd_calc_ctg_flg_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_ym_flg) return doCnd_ym_flg_VC(info);
		if (vc == Cnd_ac_dt_flg) return doCnd_ac_dt_flg_VC(info);
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
		if (vc == Cnd_asst_typ_flg) return doCnd_asst_typ_flg_VC(info);
		if (vc == Cnd_ac_slip_typ_flg) return doCnd_ac_slip_typ_flg_VC(info);
		if (vc == Cnd_ac_rsn_flg) return doCnd_ac_rsn_flg_VC(info);
		if (vc == Cnd_slo_no_flg) return doCnd_slo_no_flg_VC(info);
		if (vc == Cnd_iv_no_flg) return doCnd_iv_no_flg_VC(info);
		if (vc == Cnd_sls_dpt_flg) return doCnd_sls_dpt_flg_VC(info);
		if (vc == Cnd_sls_usr_flg) return doCnd_sls_usr_flg_VC(info);
		if (vc == Cnd_stk_bp_flg) return doCnd_stk_bp_flg_VC(info);
		if (vc == Cnd_alc_dpt_flg) return doCnd_alc_dpt_flg_VC(info);
		if (vc == Cnd_cst_flg) return doCnd_cst_flg_VC(info);
		if (vc == Cnd_cst_cntry_flg) return doCnd_cst_cntry_flg_VC(info);
		if (vc == Cnd_cst_area_flg) return doCnd_cst_area_flg_VC(info);
		if (vc == Cnd_dlv_flg) return doCnd_dlv_flg_VC(info);
		if (vc == Cnd_dlv_cntry_flg) return doCnd_dlv_cntry_flg_VC(info);
		if (vc == Cnd_dlv_area_flg) return doCnd_dlv_area_flg_VC(info);
		if (vc == Cnd_dest1_flg) return doCnd_dest1_flg_VC(info);
		if (vc == Cnd_dest2_flg) return doCnd_dest2_flg_VC(info);
		if (vc == Cnd_dest3_flg) return doCnd_dest3_flg_VC(info);
		if (vc == Cnd_cost_sls1_flg) return doCnd_cost_sls1_flg_VC(info);
		if (vc == Cnd_cost_sls2_flg) return doCnd_cost_sls2_flg_VC(info);
		if (vc == Cnd_cost_sls3_flg) return doCnd_cost_sls3_flg_VC(info);
		if (vc == Cnd_cost_sls4_flg) return doCnd_cost_sls4_flg_VC(info);
		if (vc == Cnd_cost_sls5_flg) return doCnd_cost_sls5_flg_VC(info);
		if (vc == Cnd_trd_cur_flg) return doCnd_trd_cur_flg_VC(info);
		if (vc == Cnd_xrate_flg) return doCnd_xrate_flg_VC(info);
		if (vc == Cnd_rec_eval_typ_flg) return doCnd_rec_eval_typ_flg_VC(info);
		if (vc == Cnd_alc_sls_id_flg) return doCnd_alc_sls_id_flg_VC(info);
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
		if (vc == Cnd_cur_cd) return doCnd_cur_cd_VC(info);
		if (vc == Cnd_amt_dec_place) return doCnd_amt_dec_place_VC(info);
		if (vc == columnRslt_calc_ctg_cd) return doRslt_calc_ctg_cd_VC(info);
		if (vc == columnRslt_calc_ctg_nm) return doRslt_calc_ctg_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_ym) return doRslt_ym_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_mng_dpt_cd) return doRslt_mng_dpt_cd_VC(info);
		if (vc == columnRslt_mng_dpt_nm) return doRslt_mng_dpt_nm_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_itm_jnl_cd) return doRslt_itm_jnl_cd_VC(info);
		if (vc == columnRslt_itm_jnl_nm) return doRslt_itm_jnl_nm_VC(info);
		if (vc == columnRslt_itm_grp_cd1) return doRslt_itm_grp_cd1_VC(info);
		if (vc == columnRslt_itm_grp_nm1) return doRslt_itm_grp_nm1_VC(info);
		if (vc == columnRslt_itm_grp_cd2) return doRslt_itm_grp_cd2_VC(info);
		if (vc == columnRslt_itm_grp_nm2) return doRslt_itm_grp_nm2_VC(info);
		if (vc == columnRslt_itm_grp_cd3) return doRslt_itm_grp_cd3_VC(info);
		if (vc == columnRslt_itm_grp_nm3) return doRslt_itm_grp_nm3_VC(info);
		if (vc == columnRslt_itm_grp_cd4) return doRslt_itm_grp_cd4_VC(info);
		if (vc == columnRslt_itm_grp_nm4) return doRslt_itm_grp_nm4_VC(info);
		if (vc == columnRslt_itm_grp_cd5) return doRslt_itm_grp_cd5_VC(info);
		if (vc == columnRslt_itm_grp_nm5) return doRslt_itm_grp_nm5_VC(info);
		if (vc == columnRslt_itm_grp_cd6) return doRslt_itm_grp_cd6_VC(info);
		if (vc == columnRslt_itm_grp_nm6) return doRslt_itm_grp_nm6_VC(info);
		if (vc == columnRslt_itm_grp_cd7) return doRslt_itm_grp_cd7_VC(info);
		if (vc == columnRslt_itm_grp_nm7) return doRslt_itm_grp_nm7_VC(info);
		if (vc == columnRslt_itm_grp_cd8) return doRslt_itm_grp_cd8_VC(info);
		if (vc == columnRslt_itm_grp_nm8) return doRslt_itm_grp_nm8_VC(info);
		if (vc == columnRslt_itm_grp_cd9) return doRslt_itm_grp_cd9_VC(info);
		if (vc == columnRslt_itm_grp_nm9) return doRslt_itm_grp_nm9_VC(info);
		if (vc == columnRslt_itm_grp_cd10) return doRslt_itm_grp_cd10_VC(info);
		if (vc == columnRslt_itm_grp_nm10) return doRslt_itm_grp_nm10_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_sno1) return doRslt_sno1_VC(info);
		if (vc == columnRslt_sno2) return doRslt_sno2_VC(info);
		if (vc == columnRslt_sno3) return doRslt_sno3_VC(info);
		if (vc == columnRslt_sno4) return doRslt_sno4_VC(info);
		if (vc == columnRslt_ac_slip_typ) return doRslt_ac_slip_typ_VC(info);
		if (vc == columnRslt_ac_slip_typ_nm) return doRslt_ac_slip_typ_nm_VC(info);
		if (vc == columnRslt_ac_rsn_cd) return doRslt_ac_rsn_cd_VC(info);
		if (vc == columnRslt_ac_rsn_nm) return doRslt_ac_rsn_nm_VC(info);
		if (vc == columnRslt_asst_typ) return doRslt_asst_typ_VC(info);
		if (vc == columnRslt_asst_typ_nm) return doRslt_asst_typ_nm_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_cst_grp_cd1) return doRslt_cst_grp_cd1_VC(info);
		if (vc == columnRslt_cst_grp_nm1) return doRslt_cst_grp_nm1_VC(info);
		if (vc == columnRslt_cst_grp_cd2) return doRslt_cst_grp_cd2_VC(info);
		if (vc == columnRslt_cst_grp_nm2) return doRslt_cst_grp_nm2_VC(info);
		if (vc == columnRslt_cst_grp_cd3) return doRslt_cst_grp_cd3_VC(info);
		if (vc == columnRslt_cst_grp_nm3) return doRslt_cst_grp_nm3_VC(info);
		if (vc == columnRslt_cst_grp_cd4) return doRslt_cst_grp_cd4_VC(info);
		if (vc == columnRslt_cst_grp_nm4) return doRslt_cst_grp_nm4_VC(info);
		if (vc == columnRslt_cst_grp_cd5) return doRslt_cst_grp_cd5_VC(info);
		if (vc == columnRslt_cst_grp_nm5) return doRslt_cst_grp_nm5_VC(info);
		if (vc == columnRslt_cst_grp_cd6) return doRslt_cst_grp_cd6_VC(info);
		if (vc == columnRslt_cst_grp_nm6) return doRslt_cst_grp_nm6_VC(info);
		if (vc == columnRslt_cst_grp_cd7) return doRslt_cst_grp_cd7_VC(info);
		if (vc == columnRslt_cst_grp_nm7) return doRslt_cst_grp_nm7_VC(info);
		if (vc == columnRslt_cst_grp_cd8) return doRslt_cst_grp_cd8_VC(info);
		if (vc == columnRslt_cst_grp_nm8) return doRslt_cst_grp_nm8_VC(info);
		if (vc == columnRslt_cst_grp_cd9) return doRslt_cst_grp_cd9_VC(info);
		if (vc == columnRslt_cst_grp_nm9) return doRslt_cst_grp_nm9_VC(info);
		if (vc == columnRslt_cst_grp_cd10) return doRslt_cst_grp_cd10_VC(info);
		if (vc == columnRslt_cst_grp_nm10) return doRslt_cst_grp_nm10_VC(info);
		if (vc == columnRslt_cst_cntry_cd) return doRslt_cst_cntry_cd_VC(info);
		if (vc == columnRslt_cst_cntry_nm) return doRslt_cst_cntry_nm_VC(info);
		if (vc == columnRslt_cst_area_cd) return doRslt_cst_area_cd_VC(info);
		if (vc == columnRslt_cst_area_nm) return doRslt_cst_area_nm_VC(info);
		if (vc == columnRslt_dlv_cd) return doRslt_dlv_cd_VC(info);
		if (vc == columnRslt_dlv_nm) return doRslt_dlv_nm_VC(info);
		if (vc == columnRslt_dlv_grp_cd1) return doRslt_dlv_grp_cd1_VC(info);
		if (vc == columnRslt_dlv_grp_nm1) return doRslt_dlv_grp_nm1_VC(info);
		if (vc == columnRslt_dlv_grp_cd2) return doRslt_dlv_grp_cd2_VC(info);
		if (vc == columnRslt_dlv_grp_nm2) return doRslt_dlv_grp_nm2_VC(info);
		if (vc == columnRslt_dlv_grp_cd3) return doRslt_dlv_grp_cd3_VC(info);
		if (vc == columnRslt_dlv_grp_nm3) return doRslt_dlv_grp_nm3_VC(info);
		if (vc == columnRslt_dlv_grp_cd4) return doRslt_dlv_grp_cd4_VC(info);
		if (vc == columnRslt_dlv_grp_nm4) return doRslt_dlv_grp_nm4_VC(info);
		if (vc == columnRslt_dlv_grp_cd5) return doRslt_dlv_grp_cd5_VC(info);
		if (vc == columnRslt_dlv_grp_nm5) return doRslt_dlv_grp_nm5_VC(info);
		if (vc == columnRslt_dlv_grp_cd6) return doRslt_dlv_grp_cd6_VC(info);
		if (vc == columnRslt_dlv_grp_nm6) return doRslt_dlv_grp_nm6_VC(info);
		if (vc == columnRslt_dlv_grp_cd7) return doRslt_dlv_grp_cd7_VC(info);
		if (vc == columnRslt_dlv_grp_nm7) return doRslt_dlv_grp_nm7_VC(info);
		if (vc == columnRslt_dlv_grp_cd8) return doRslt_dlv_grp_cd8_VC(info);
		if (vc == columnRslt_dlv_grp_nm8) return doRslt_dlv_grp_nm8_VC(info);
		if (vc == columnRslt_dlv_grp_cd9) return doRslt_dlv_grp_cd9_VC(info);
		if (vc == columnRslt_dlv_grp_nm9) return doRslt_dlv_grp_nm9_VC(info);
		if (vc == columnRslt_dlv_grp_cd10) return doRslt_dlv_grp_cd10_VC(info);
		if (vc == columnRslt_dlv_grp_nm10) return doRslt_dlv_grp_nm10_VC(info);
		if (vc == columnRslt_dlv_cntry_cd) return doRslt_dlv_cntry_cd_VC(info);
		if (vc == columnRslt_dlv_cntry_nm) return doRslt_dlv_cntry_nm_VC(info);
		if (vc == columnRslt_dlv_area_cd) return doRslt_dlv_area_cd_VC(info);
		if (vc == columnRslt_dlv_area_nm) return doRslt_dlv_area_nm_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_unit_cd) return doRslt_unit_cd_VC(info);
		if (vc == columnRslt_unit_nm) return doRslt_unit_nm_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_amt_dec_place) return doRslt_trd_amt_dec_place_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_sls_dpt_cd) return doRslt_sls_dpt_cd_VC(info);
		if (vc == columnRslt_sls_dpt_nm) return doRslt_sls_dpt_nm_VC(info);
		if (vc == columnRslt_sls_usr_cd) return doRslt_sls_usr_cd_VC(info);
		if (vc == columnRslt_sls_usr_nm) return doRslt_sls_usr_nm_VC(info);
		if (vc == columnRslt_stk_bp_cd) return doRslt_stk_bp_cd_VC(info);
		if (vc == columnRslt_stk_bp_nm) return doRslt_stk_bp_nm_VC(info);
		if (vc == columnRslt_alc_dpt_cd) return doRslt_alc_dpt_cd_VC(info);
		if (vc == columnRslt_alc_dpt_nm) return doRslt_alc_dpt_nm_VC(info);
		if (vc == columnRslt_dest_cd1) return doRslt_dest_cd1_VC(info);
		if (vc == columnRslt_dest_nm1) return doRslt_dest_nm1_VC(info);
		if (vc == columnRslt_dest_cd2) return doRslt_dest_cd2_VC(info);
		if (vc == columnRslt_dest_nm2) return doRslt_dest_nm2_VC(info);
		if (vc == columnRslt_dest_cd3) return doRslt_dest_cd3_VC(info);
		if (vc == columnRslt_dest_nm3) return doRslt_dest_nm3_VC(info);
		if (vc == columnRslt_cost_sls_cd1) return doRslt_cost_sls_cd1_VC(info);
		if (vc == columnRslt_cost_sls_nm1) return doRslt_cost_sls_nm1_VC(info);
		if (vc == columnRslt_cost_sls_cd2) return doRslt_cost_sls_cd2_VC(info);
		if (vc == columnRslt_cost_sls_nm2) return doRslt_cost_sls_nm2_VC(info);
		if (vc == columnRslt_cost_sls_cd3) return doRslt_cost_sls_cd3_VC(info);
		if (vc == columnRslt_cost_sls_nm3) return doRslt_cost_sls_nm3_VC(info);
		if (vc == columnRslt_cost_sls_cd4) return doRslt_cost_sls_cd4_VC(info);
		if (vc == columnRslt_cost_sls_nm4) return doRslt_cost_sls_nm4_VC(info);
		if (vc == columnRslt_cost_sls_cd5) return doRslt_cost_sls_cd5_VC(info);
		if (vc == columnRslt_cost_sls_nm5) return doRslt_cost_sls_nm5_VC(info);
		if (vc == columnRslt_alc_val1) return doRslt_alc_val1_VC(info);
		if (vc == columnRslt_alc_val2) return doRslt_alc_val2_VC(info);
		if (vc == columnRslt_alc_val3) return doRslt_alc_val3_VC(info);
		if (vc == columnRslt_alc_val4) return doRslt_alc_val4_VC(info);
		if (vc == columnRslt_alc_val5) return doRslt_alc_val5_VC(info);
		if (vc == columnRslt_rec_eval_typ) return doRslt_rec_eval_typ_VC(info);
		if (vc == columnRslt_rec_eval_typ_nm) return doRslt_rec_eval_typ_nm_VC(info);
		if (vc == columnRslt_zero_effect_flg) return doRslt_zero_effect_flg_VC(info);
		if (vc == columnRslt_act_sls_id) return doRslt_act_sls_id_VC(info);
		if (vc == columnRslt_act_sls_id_sub) return doRslt_act_sls_id_sub_VC(info);
		if (vc == columnRslt_rmrks) return doRslt_rmrks_VC(info);
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
	 * [Cnd]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_ctg_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_sls_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_sls_id_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_slo_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_slo_no_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[no_iv_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_iv_no_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[no_stk_bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_stk_bp_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rec_eval_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rec_eval_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rec_eval_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rec_eval_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_ctg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_ctg_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ym_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_dt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asst_typ_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_no_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_bp_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cur_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cur_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xrate_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xrate_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rec_eval_typ_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rec_eval_typ_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_sls_id_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_sls_id_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_ctg_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ym_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[mng_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mng_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mng_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mng_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_amt_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cost_sls_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cost_sls_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cost_sls_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cost_sls_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cost_sls_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cost_sls_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cost_sls_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cost_sls_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cost_sls_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cost_sls_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_val1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_val1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_val2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_val2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_val3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_val3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_val4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_val4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_val5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_val5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rec_eval_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rec_eval_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rec_eval_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rec_eval_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[zero_effect_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_zero_effect_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_sls_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_sls_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_sls_id_sub]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_sls_id_sub_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rmrks_VC(MCEventInfo info){
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
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_ym_fr) doCnd_ym_fr_NC(info);
		else if (nc == Cnd_ym_to) doCnd_ym_to_NC(info);
		else if (nc == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NC(info);
		else if (nc == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NC(info);
		else if (nc == Cnd_asst_typ) doCnd_asst_typ_NC(info);
		else if (nc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NC(info);
		else if (nc == Cnd_act_sls_id) doCnd_act_sls_id_NC(info);
		else if (nc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NC(info);
		else if (nc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_sno1) doCnd_sno1_NC(info);
		else if (nc == Cnd_sno2) doCnd_sno2_NC(info);
		else if (nc == Cnd_sno3) doCnd_sno3_NC(info);
		else if (nc == Cnd_sno4) doCnd_sno4_NC(info);
		else if (nc == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NC(info);
		else if (nc == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NC(info);
		else if (nc == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_NC(info);
		else if (nc == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_NC(info);
		else if (nc == Cnd_no_ac_rsn_flg) doCnd_no_ac_rsn_flg_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
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
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_no_slo_no_flg) doCnd_no_slo_no_flg_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_no_iv_no_flg) doCnd_no_iv_no_flg_NC(info);
		else if (nc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NC(info);
		else if (nc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NC(info);
		else if (nc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NC(info);
		else if (nc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NC(info);
		else if (nc == Cnd_stk_bp_cd) doCnd_stk_bp_cd_NC(info);
		else if (nc == Cnd_stk_bp_nm) doCnd_stk_bp_nm_NC(info);
		else if (nc == Cnd_no_stk_bp_flg) doCnd_no_stk_bp_flg_NC(info);
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
		else if (nc == Cnd_rec_eval_typ) doCnd_rec_eval_typ_NC(info);
		else if (nc == Cnd_rec_eval_typ_nm) doCnd_rec_eval_typ_nm_NC(info);
		else if (nc == Cnd_rmrks) doCnd_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
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
		else if (nc == Cnd_calc_ctg_flg) doCnd_calc_ctg_flg_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_ym_flg) doCnd_ym_flg_NC(info);
		else if (nc == Cnd_ac_dt_flg) doCnd_ac_dt_flg_NC(info);
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
		else if (nc == Cnd_asst_typ_flg) doCnd_asst_typ_flg_NC(info);
		else if (nc == Cnd_ac_slip_typ_flg) doCnd_ac_slip_typ_flg_NC(info);
		else if (nc == Cnd_ac_rsn_flg) doCnd_ac_rsn_flg_NC(info);
		else if (nc == Cnd_slo_no_flg) doCnd_slo_no_flg_NC(info);
		else if (nc == Cnd_iv_no_flg) doCnd_iv_no_flg_NC(info);
		else if (nc == Cnd_sls_dpt_flg) doCnd_sls_dpt_flg_NC(info);
		else if (nc == Cnd_sls_usr_flg) doCnd_sls_usr_flg_NC(info);
		else if (nc == Cnd_stk_bp_flg) doCnd_stk_bp_flg_NC(info);
		else if (nc == Cnd_alc_dpt_flg) doCnd_alc_dpt_flg_NC(info);
		else if (nc == Cnd_cst_flg) doCnd_cst_flg_NC(info);
		else if (nc == Cnd_cst_cntry_flg) doCnd_cst_cntry_flg_NC(info);
		else if (nc == Cnd_cst_area_flg) doCnd_cst_area_flg_NC(info);
		else if (nc == Cnd_dlv_flg) doCnd_dlv_flg_NC(info);
		else if (nc == Cnd_dlv_cntry_flg) doCnd_dlv_cntry_flg_NC(info);
		else if (nc == Cnd_dlv_area_flg) doCnd_dlv_area_flg_NC(info);
		else if (nc == Cnd_dest1_flg) doCnd_dest1_flg_NC(info);
		else if (nc == Cnd_dest2_flg) doCnd_dest2_flg_NC(info);
		else if (nc == Cnd_dest3_flg) doCnd_dest3_flg_NC(info);
		else if (nc == Cnd_cost_sls1_flg) doCnd_cost_sls1_flg_NC(info);
		else if (nc == Cnd_cost_sls2_flg) doCnd_cost_sls2_flg_NC(info);
		else if (nc == Cnd_cost_sls3_flg) doCnd_cost_sls3_flg_NC(info);
		else if (nc == Cnd_cost_sls4_flg) doCnd_cost_sls4_flg_NC(info);
		else if (nc == Cnd_cost_sls5_flg) doCnd_cost_sls5_flg_NC(info);
		else if (nc == Cnd_trd_cur_flg) doCnd_trd_cur_flg_NC(info);
		else if (nc == Cnd_xrate_flg) doCnd_xrate_flg_NC(info);
		else if (nc == Cnd_rec_eval_typ_flg) doCnd_rec_eval_typ_flg_NC(info);
		else if (nc == Cnd_alc_sls_id_flg) doCnd_alc_sls_id_flg_NC(info);
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
		else if (nc == Cnd_cur_cd) doCnd_cur_cd_NC(info);
		else if (nc == Cnd_amt_dec_place) doCnd_amt_dec_place_NC(info);
		else if (nc == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NC(info);
		else if (nc == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_ym) doRslt_ym_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_mng_dpt_cd) doRslt_mng_dpt_cd_NC(info);
		else if (nc == columnRslt_mng_dpt_nm) doRslt_mng_dpt_nm_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NC(info);
		else if (nc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NC(info);
		else if (nc == columnRslt_itm_grp_cd1) doRslt_itm_grp_cd1_NC(info);
		else if (nc == columnRslt_itm_grp_nm1) doRslt_itm_grp_nm1_NC(info);
		else if (nc == columnRslt_itm_grp_cd2) doRslt_itm_grp_cd2_NC(info);
		else if (nc == columnRslt_itm_grp_nm2) doRslt_itm_grp_nm2_NC(info);
		else if (nc == columnRslt_itm_grp_cd3) doRslt_itm_grp_cd3_NC(info);
		else if (nc == columnRslt_itm_grp_nm3) doRslt_itm_grp_nm3_NC(info);
		else if (nc == columnRslt_itm_grp_cd4) doRslt_itm_grp_cd4_NC(info);
		else if (nc == columnRslt_itm_grp_nm4) doRslt_itm_grp_nm4_NC(info);
		else if (nc == columnRslt_itm_grp_cd5) doRslt_itm_grp_cd5_NC(info);
		else if (nc == columnRslt_itm_grp_nm5) doRslt_itm_grp_nm5_NC(info);
		else if (nc == columnRslt_itm_grp_cd6) doRslt_itm_grp_cd6_NC(info);
		else if (nc == columnRslt_itm_grp_nm6) doRslt_itm_grp_nm6_NC(info);
		else if (nc == columnRslt_itm_grp_cd7) doRslt_itm_grp_cd7_NC(info);
		else if (nc == columnRslt_itm_grp_nm7) doRslt_itm_grp_nm7_NC(info);
		else if (nc == columnRslt_itm_grp_cd8) doRslt_itm_grp_cd8_NC(info);
		else if (nc == columnRslt_itm_grp_nm8) doRslt_itm_grp_nm8_NC(info);
		else if (nc == columnRslt_itm_grp_cd9) doRslt_itm_grp_cd9_NC(info);
		else if (nc == columnRslt_itm_grp_nm9) doRslt_itm_grp_nm9_NC(info);
		else if (nc == columnRslt_itm_grp_cd10) doRslt_itm_grp_cd10_NC(info);
		else if (nc == columnRslt_itm_grp_nm10) doRslt_itm_grp_nm10_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_sno1) doRslt_sno1_NC(info);
		else if (nc == columnRslt_sno2) doRslt_sno2_NC(info);
		else if (nc == columnRslt_sno3) doRslt_sno3_NC(info);
		else if (nc == columnRslt_sno4) doRslt_sno4_NC(info);
		else if (nc == columnRslt_ac_slip_typ) doRslt_ac_slip_typ_NC(info);
		else if (nc == columnRslt_ac_slip_typ_nm) doRslt_ac_slip_typ_nm_NC(info);
		else if (nc == columnRslt_ac_rsn_cd) doRslt_ac_rsn_cd_NC(info);
		else if (nc == columnRslt_ac_rsn_nm) doRslt_ac_rsn_nm_NC(info);
		else if (nc == columnRslt_asst_typ) doRslt_asst_typ_NC(info);
		else if (nc == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_cst_grp_cd1) doRslt_cst_grp_cd1_NC(info);
		else if (nc == columnRslt_cst_grp_nm1) doRslt_cst_grp_nm1_NC(info);
		else if (nc == columnRslt_cst_grp_cd2) doRslt_cst_grp_cd2_NC(info);
		else if (nc == columnRslt_cst_grp_nm2) doRslt_cst_grp_nm2_NC(info);
		else if (nc == columnRslt_cst_grp_cd3) doRslt_cst_grp_cd3_NC(info);
		else if (nc == columnRslt_cst_grp_nm3) doRslt_cst_grp_nm3_NC(info);
		else if (nc == columnRslt_cst_grp_cd4) doRslt_cst_grp_cd4_NC(info);
		else if (nc == columnRslt_cst_grp_nm4) doRslt_cst_grp_nm4_NC(info);
		else if (nc == columnRslt_cst_grp_cd5) doRslt_cst_grp_cd5_NC(info);
		else if (nc == columnRslt_cst_grp_nm5) doRslt_cst_grp_nm5_NC(info);
		else if (nc == columnRslt_cst_grp_cd6) doRslt_cst_grp_cd6_NC(info);
		else if (nc == columnRslt_cst_grp_nm6) doRslt_cst_grp_nm6_NC(info);
		else if (nc == columnRslt_cst_grp_cd7) doRslt_cst_grp_cd7_NC(info);
		else if (nc == columnRslt_cst_grp_nm7) doRslt_cst_grp_nm7_NC(info);
		else if (nc == columnRslt_cst_grp_cd8) doRslt_cst_grp_cd8_NC(info);
		else if (nc == columnRslt_cst_grp_nm8) doRslt_cst_grp_nm8_NC(info);
		else if (nc == columnRslt_cst_grp_cd9) doRslt_cst_grp_cd9_NC(info);
		else if (nc == columnRslt_cst_grp_nm9) doRslt_cst_grp_nm9_NC(info);
		else if (nc == columnRslt_cst_grp_cd10) doRslt_cst_grp_cd10_NC(info);
		else if (nc == columnRslt_cst_grp_nm10) doRslt_cst_grp_nm10_NC(info);
		else if (nc == columnRslt_cst_cntry_cd) doRslt_cst_cntry_cd_NC(info);
		else if (nc == columnRslt_cst_cntry_nm) doRslt_cst_cntry_nm_NC(info);
		else if (nc == columnRslt_cst_area_cd) doRslt_cst_area_cd_NC(info);
		else if (nc == columnRslt_cst_area_nm) doRslt_cst_area_nm_NC(info);
		else if (nc == columnRslt_dlv_cd) doRslt_dlv_cd_NC(info);
		else if (nc == columnRslt_dlv_nm) doRslt_dlv_nm_NC(info);
		else if (nc == columnRslt_dlv_grp_cd1) doRslt_dlv_grp_cd1_NC(info);
		else if (nc == columnRslt_dlv_grp_nm1) doRslt_dlv_grp_nm1_NC(info);
		else if (nc == columnRslt_dlv_grp_cd2) doRslt_dlv_grp_cd2_NC(info);
		else if (nc == columnRslt_dlv_grp_nm2) doRslt_dlv_grp_nm2_NC(info);
		else if (nc == columnRslt_dlv_grp_cd3) doRslt_dlv_grp_cd3_NC(info);
		else if (nc == columnRslt_dlv_grp_nm3) doRslt_dlv_grp_nm3_NC(info);
		else if (nc == columnRslt_dlv_grp_cd4) doRslt_dlv_grp_cd4_NC(info);
		else if (nc == columnRslt_dlv_grp_nm4) doRslt_dlv_grp_nm4_NC(info);
		else if (nc == columnRslt_dlv_grp_cd5) doRslt_dlv_grp_cd5_NC(info);
		else if (nc == columnRslt_dlv_grp_nm5) doRslt_dlv_grp_nm5_NC(info);
		else if (nc == columnRslt_dlv_grp_cd6) doRslt_dlv_grp_cd6_NC(info);
		else if (nc == columnRslt_dlv_grp_nm6) doRslt_dlv_grp_nm6_NC(info);
		else if (nc == columnRslt_dlv_grp_cd7) doRslt_dlv_grp_cd7_NC(info);
		else if (nc == columnRslt_dlv_grp_nm7) doRslt_dlv_grp_nm7_NC(info);
		else if (nc == columnRslt_dlv_grp_cd8) doRslt_dlv_grp_cd8_NC(info);
		else if (nc == columnRslt_dlv_grp_nm8) doRslt_dlv_grp_nm8_NC(info);
		else if (nc == columnRslt_dlv_grp_cd9) doRslt_dlv_grp_cd9_NC(info);
		else if (nc == columnRslt_dlv_grp_nm9) doRslt_dlv_grp_nm9_NC(info);
		else if (nc == columnRslt_dlv_grp_cd10) doRslt_dlv_grp_cd10_NC(info);
		else if (nc == columnRslt_dlv_grp_nm10) doRslt_dlv_grp_nm10_NC(info);
		else if (nc == columnRslt_dlv_cntry_cd) doRslt_dlv_cntry_cd_NC(info);
		else if (nc == columnRslt_dlv_cntry_nm) doRslt_dlv_cntry_nm_NC(info);
		else if (nc == columnRslt_dlv_area_cd) doRslt_dlv_area_cd_NC(info);
		else if (nc == columnRslt_dlv_area_nm) doRslt_dlv_area_nm_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_unit_cd) doRslt_unit_cd_NC(info);
		else if (nc == columnRslt_unit_nm) doRslt_unit_nm_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NC(info);
		else if (nc == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NC(info);
		else if (nc == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NC(info);
		else if (nc == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NC(info);
		else if (nc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NC(info);
		else if (nc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NC(info);
		else if (nc == columnRslt_alc_dpt_cd) doRslt_alc_dpt_cd_NC(info);
		else if (nc == columnRslt_alc_dpt_nm) doRslt_alc_dpt_nm_NC(info);
		else if (nc == columnRslt_dest_cd1) doRslt_dest_cd1_NC(info);
		else if (nc == columnRslt_dest_nm1) doRslt_dest_nm1_NC(info);
		else if (nc == columnRslt_dest_cd2) doRslt_dest_cd2_NC(info);
		else if (nc == columnRslt_dest_nm2) doRslt_dest_nm2_NC(info);
		else if (nc == columnRslt_dest_cd3) doRslt_dest_cd3_NC(info);
		else if (nc == columnRslt_dest_nm3) doRslt_dest_nm3_NC(info);
		else if (nc == columnRslt_cost_sls_cd1) doRslt_cost_sls_cd1_NC(info);
		else if (nc == columnRslt_cost_sls_nm1) doRslt_cost_sls_nm1_NC(info);
		else if (nc == columnRslt_cost_sls_cd2) doRslt_cost_sls_cd2_NC(info);
		else if (nc == columnRslt_cost_sls_nm2) doRslt_cost_sls_nm2_NC(info);
		else if (nc == columnRslt_cost_sls_cd3) doRslt_cost_sls_cd3_NC(info);
		else if (nc == columnRslt_cost_sls_nm3) doRslt_cost_sls_nm3_NC(info);
		else if (nc == columnRslt_cost_sls_cd4) doRslt_cost_sls_cd4_NC(info);
		else if (nc == columnRslt_cost_sls_nm4) doRslt_cost_sls_nm4_NC(info);
		else if (nc == columnRslt_cost_sls_cd5) doRslt_cost_sls_cd5_NC(info);
		else if (nc == columnRslt_cost_sls_nm5) doRslt_cost_sls_nm5_NC(info);
		else if (nc == columnRslt_alc_val1) doRslt_alc_val1_NC(info);
		else if (nc == columnRslt_alc_val2) doRslt_alc_val2_NC(info);
		else if (nc == columnRslt_alc_val3) doRslt_alc_val3_NC(info);
		else if (nc == columnRslt_alc_val4) doRslt_alc_val4_NC(info);
		else if (nc == columnRslt_alc_val5) doRslt_alc_val5_NC(info);
		else if (nc == columnRslt_rec_eval_typ) doRslt_rec_eval_typ_NC(info);
		else if (nc == columnRslt_rec_eval_typ_nm) doRslt_rec_eval_typ_nm_NC(info);
		else if (nc == columnRslt_zero_effect_flg) doRslt_zero_effect_flg_NC(info);
		else if (nc == columnRslt_act_sls_id) doRslt_act_sls_id_NC(info);
		else if (nc == columnRslt_act_sls_id_sub) doRslt_act_sls_id_sub_NC(info);
		else if (nc == columnRslt_rmrks) doRslt_rmrks_NC(info);
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
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_sls_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sls_id_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_slo_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_slo_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_iv_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_iv_no_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[no_stk_bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_stk_bp_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[rec_eval_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rec_eval_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rec_eval_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rec_eval_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_ctg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cur_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rec_eval_typ_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rec_eval_typ_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_sls_id_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_sls_id_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mng_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mng_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mng_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mng_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rec_eval_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rec_eval_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[zero_effect_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_zero_effect_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sls_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sls_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sls_id_sub]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sls_id_sub_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_NC(MCEventInfo info){
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
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_ym_fr) doCnd_ym_fr_NE(info);
		else if (ne == Cnd_ym_to) doCnd_ym_to_NE(info);
		else if (ne == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NE(info);
		else if (ne == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NE(info);
		else if (ne == Cnd_asst_typ) doCnd_asst_typ_NE(info);
		else if (ne == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NE(info);
		else if (ne == Cnd_act_sls_id) doCnd_act_sls_id_NE(info);
		else if (ne == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NE(info);
		else if (ne == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_sno1) doCnd_sno1_NE(info);
		else if (ne == Cnd_sno2) doCnd_sno2_NE(info);
		else if (ne == Cnd_sno3) doCnd_sno3_NE(info);
		else if (ne == Cnd_sno4) doCnd_sno4_NE(info);
		else if (ne == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NE(info);
		else if (ne == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NE(info);
		else if (ne == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_NE(info);
		else if (ne == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_NE(info);
		else if (ne == Cnd_no_ac_rsn_flg) doCnd_no_ac_rsn_flg_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
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
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_no_slo_no_flg) doCnd_no_slo_no_flg_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_no_iv_no_flg) doCnd_no_iv_no_flg_NE(info);
		else if (ne == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NE(info);
		else if (ne == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NE(info);
		else if (ne == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NE(info);
		else if (ne == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NE(info);
		else if (ne == Cnd_stk_bp_cd) doCnd_stk_bp_cd_NE(info);
		else if (ne == Cnd_stk_bp_nm) doCnd_stk_bp_nm_NE(info);
		else if (ne == Cnd_no_stk_bp_flg) doCnd_no_stk_bp_flg_NE(info);
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
		else if (ne == Cnd_rec_eval_typ) doCnd_rec_eval_typ_NE(info);
		else if (ne == Cnd_rec_eval_typ_nm) doCnd_rec_eval_typ_nm_NE(info);
		else if (ne == Cnd_rmrks) doCnd_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
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
		else if (ne == Cnd_calc_ctg_flg) doCnd_calc_ctg_flg_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_ym_flg) doCnd_ym_flg_NE(info);
		else if (ne == Cnd_ac_dt_flg) doCnd_ac_dt_flg_NE(info);
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
		else if (ne == Cnd_asst_typ_flg) doCnd_asst_typ_flg_NE(info);
		else if (ne == Cnd_ac_slip_typ_flg) doCnd_ac_slip_typ_flg_NE(info);
		else if (ne == Cnd_ac_rsn_flg) doCnd_ac_rsn_flg_NE(info);
		else if (ne == Cnd_slo_no_flg) doCnd_slo_no_flg_NE(info);
		else if (ne == Cnd_iv_no_flg) doCnd_iv_no_flg_NE(info);
		else if (ne == Cnd_sls_dpt_flg) doCnd_sls_dpt_flg_NE(info);
		else if (ne == Cnd_sls_usr_flg) doCnd_sls_usr_flg_NE(info);
		else if (ne == Cnd_stk_bp_flg) doCnd_stk_bp_flg_NE(info);
		else if (ne == Cnd_alc_dpt_flg) doCnd_alc_dpt_flg_NE(info);
		else if (ne == Cnd_cst_flg) doCnd_cst_flg_NE(info);
		else if (ne == Cnd_cst_cntry_flg) doCnd_cst_cntry_flg_NE(info);
		else if (ne == Cnd_cst_area_flg) doCnd_cst_area_flg_NE(info);
		else if (ne == Cnd_dlv_flg) doCnd_dlv_flg_NE(info);
		else if (ne == Cnd_dlv_cntry_flg) doCnd_dlv_cntry_flg_NE(info);
		else if (ne == Cnd_dlv_area_flg) doCnd_dlv_area_flg_NE(info);
		else if (ne == Cnd_dest1_flg) doCnd_dest1_flg_NE(info);
		else if (ne == Cnd_dest2_flg) doCnd_dest2_flg_NE(info);
		else if (ne == Cnd_dest3_flg) doCnd_dest3_flg_NE(info);
		else if (ne == Cnd_cost_sls1_flg) doCnd_cost_sls1_flg_NE(info);
		else if (ne == Cnd_cost_sls2_flg) doCnd_cost_sls2_flg_NE(info);
		else if (ne == Cnd_cost_sls3_flg) doCnd_cost_sls3_flg_NE(info);
		else if (ne == Cnd_cost_sls4_flg) doCnd_cost_sls4_flg_NE(info);
		else if (ne == Cnd_cost_sls5_flg) doCnd_cost_sls5_flg_NE(info);
		else if (ne == Cnd_trd_cur_flg) doCnd_trd_cur_flg_NE(info);
		else if (ne == Cnd_xrate_flg) doCnd_xrate_flg_NE(info);
		else if (ne == Cnd_rec_eval_typ_flg) doCnd_rec_eval_typ_flg_NE(info);
		else if (ne == Cnd_alc_sls_id_flg) doCnd_alc_sls_id_flg_NE(info);
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
		else if (ne == Cnd_cur_cd) doCnd_cur_cd_NE(info);
		else if (ne == Cnd_amt_dec_place) doCnd_amt_dec_place_NE(info);
		else if (ne == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NE(info);
		else if (ne == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_ym) doRslt_ym_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_mng_dpt_cd) doRslt_mng_dpt_cd_NE(info);
		else if (ne == columnRslt_mng_dpt_nm) doRslt_mng_dpt_nm_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NE(info);
		else if (ne == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NE(info);
		else if (ne == columnRslt_itm_grp_cd1) doRslt_itm_grp_cd1_NE(info);
		else if (ne == columnRslt_itm_grp_nm1) doRslt_itm_grp_nm1_NE(info);
		else if (ne == columnRslt_itm_grp_cd2) doRslt_itm_grp_cd2_NE(info);
		else if (ne == columnRslt_itm_grp_nm2) doRslt_itm_grp_nm2_NE(info);
		else if (ne == columnRslt_itm_grp_cd3) doRslt_itm_grp_cd3_NE(info);
		else if (ne == columnRslt_itm_grp_nm3) doRslt_itm_grp_nm3_NE(info);
		else if (ne == columnRslt_itm_grp_cd4) doRslt_itm_grp_cd4_NE(info);
		else if (ne == columnRslt_itm_grp_nm4) doRslt_itm_grp_nm4_NE(info);
		else if (ne == columnRslt_itm_grp_cd5) doRslt_itm_grp_cd5_NE(info);
		else if (ne == columnRslt_itm_grp_nm5) doRslt_itm_grp_nm5_NE(info);
		else if (ne == columnRslt_itm_grp_cd6) doRslt_itm_grp_cd6_NE(info);
		else if (ne == columnRslt_itm_grp_nm6) doRslt_itm_grp_nm6_NE(info);
		else if (ne == columnRslt_itm_grp_cd7) doRslt_itm_grp_cd7_NE(info);
		else if (ne == columnRslt_itm_grp_nm7) doRslt_itm_grp_nm7_NE(info);
		else if (ne == columnRslt_itm_grp_cd8) doRslt_itm_grp_cd8_NE(info);
		else if (ne == columnRslt_itm_grp_nm8) doRslt_itm_grp_nm8_NE(info);
		else if (ne == columnRslt_itm_grp_cd9) doRslt_itm_grp_cd9_NE(info);
		else if (ne == columnRslt_itm_grp_nm9) doRslt_itm_grp_nm9_NE(info);
		else if (ne == columnRslt_itm_grp_cd10) doRslt_itm_grp_cd10_NE(info);
		else if (ne == columnRslt_itm_grp_nm10) doRslt_itm_grp_nm10_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_sno1) doRslt_sno1_NE(info);
		else if (ne == columnRslt_sno2) doRslt_sno2_NE(info);
		else if (ne == columnRslt_sno3) doRslt_sno3_NE(info);
		else if (ne == columnRslt_sno4) doRslt_sno4_NE(info);
		else if (ne == columnRslt_ac_slip_typ) doRslt_ac_slip_typ_NE(info);
		else if (ne == columnRslt_ac_slip_typ_nm) doRslt_ac_slip_typ_nm_NE(info);
		else if (ne == columnRslt_ac_rsn_cd) doRslt_ac_rsn_cd_NE(info);
		else if (ne == columnRslt_ac_rsn_nm) doRslt_ac_rsn_nm_NE(info);
		else if (ne == columnRslt_asst_typ) doRslt_asst_typ_NE(info);
		else if (ne == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_cst_grp_cd1) doRslt_cst_grp_cd1_NE(info);
		else if (ne == columnRslt_cst_grp_nm1) doRslt_cst_grp_nm1_NE(info);
		else if (ne == columnRslt_cst_grp_cd2) doRslt_cst_grp_cd2_NE(info);
		else if (ne == columnRslt_cst_grp_nm2) doRslt_cst_grp_nm2_NE(info);
		else if (ne == columnRslt_cst_grp_cd3) doRslt_cst_grp_cd3_NE(info);
		else if (ne == columnRslt_cst_grp_nm3) doRslt_cst_grp_nm3_NE(info);
		else if (ne == columnRslt_cst_grp_cd4) doRslt_cst_grp_cd4_NE(info);
		else if (ne == columnRslt_cst_grp_nm4) doRslt_cst_grp_nm4_NE(info);
		else if (ne == columnRslt_cst_grp_cd5) doRslt_cst_grp_cd5_NE(info);
		else if (ne == columnRslt_cst_grp_nm5) doRslt_cst_grp_nm5_NE(info);
		else if (ne == columnRslt_cst_grp_cd6) doRslt_cst_grp_cd6_NE(info);
		else if (ne == columnRslt_cst_grp_nm6) doRslt_cst_grp_nm6_NE(info);
		else if (ne == columnRslt_cst_grp_cd7) doRslt_cst_grp_cd7_NE(info);
		else if (ne == columnRslt_cst_grp_nm7) doRslt_cst_grp_nm7_NE(info);
		else if (ne == columnRslt_cst_grp_cd8) doRslt_cst_grp_cd8_NE(info);
		else if (ne == columnRslt_cst_grp_nm8) doRslt_cst_grp_nm8_NE(info);
		else if (ne == columnRslt_cst_grp_cd9) doRslt_cst_grp_cd9_NE(info);
		else if (ne == columnRslt_cst_grp_nm9) doRslt_cst_grp_nm9_NE(info);
		else if (ne == columnRslt_cst_grp_cd10) doRslt_cst_grp_cd10_NE(info);
		else if (ne == columnRslt_cst_grp_nm10) doRslt_cst_grp_nm10_NE(info);
		else if (ne == columnRslt_cst_cntry_cd) doRslt_cst_cntry_cd_NE(info);
		else if (ne == columnRslt_cst_cntry_nm) doRslt_cst_cntry_nm_NE(info);
		else if (ne == columnRslt_cst_area_cd) doRslt_cst_area_cd_NE(info);
		else if (ne == columnRslt_cst_area_nm) doRslt_cst_area_nm_NE(info);
		else if (ne == columnRslt_dlv_cd) doRslt_dlv_cd_NE(info);
		else if (ne == columnRslt_dlv_nm) doRslt_dlv_nm_NE(info);
		else if (ne == columnRslt_dlv_grp_cd1) doRslt_dlv_grp_cd1_NE(info);
		else if (ne == columnRslt_dlv_grp_nm1) doRslt_dlv_grp_nm1_NE(info);
		else if (ne == columnRslt_dlv_grp_cd2) doRslt_dlv_grp_cd2_NE(info);
		else if (ne == columnRslt_dlv_grp_nm2) doRslt_dlv_grp_nm2_NE(info);
		else if (ne == columnRslt_dlv_grp_cd3) doRslt_dlv_grp_cd3_NE(info);
		else if (ne == columnRslt_dlv_grp_nm3) doRslt_dlv_grp_nm3_NE(info);
		else if (ne == columnRslt_dlv_grp_cd4) doRslt_dlv_grp_cd4_NE(info);
		else if (ne == columnRslt_dlv_grp_nm4) doRslt_dlv_grp_nm4_NE(info);
		else if (ne == columnRslt_dlv_grp_cd5) doRslt_dlv_grp_cd5_NE(info);
		else if (ne == columnRslt_dlv_grp_nm5) doRslt_dlv_grp_nm5_NE(info);
		else if (ne == columnRslt_dlv_grp_cd6) doRslt_dlv_grp_cd6_NE(info);
		else if (ne == columnRslt_dlv_grp_nm6) doRslt_dlv_grp_nm6_NE(info);
		else if (ne == columnRslt_dlv_grp_cd7) doRslt_dlv_grp_cd7_NE(info);
		else if (ne == columnRslt_dlv_grp_nm7) doRslt_dlv_grp_nm7_NE(info);
		else if (ne == columnRslt_dlv_grp_cd8) doRslt_dlv_grp_cd8_NE(info);
		else if (ne == columnRslt_dlv_grp_nm8) doRslt_dlv_grp_nm8_NE(info);
		else if (ne == columnRslt_dlv_grp_cd9) doRslt_dlv_grp_cd9_NE(info);
		else if (ne == columnRslt_dlv_grp_nm9) doRslt_dlv_grp_nm9_NE(info);
		else if (ne == columnRslt_dlv_grp_cd10) doRslt_dlv_grp_cd10_NE(info);
		else if (ne == columnRslt_dlv_grp_nm10) doRslt_dlv_grp_nm10_NE(info);
		else if (ne == columnRslt_dlv_cntry_cd) doRslt_dlv_cntry_cd_NE(info);
		else if (ne == columnRslt_dlv_cntry_nm) doRslt_dlv_cntry_nm_NE(info);
		else if (ne == columnRslt_dlv_area_cd) doRslt_dlv_area_cd_NE(info);
		else if (ne == columnRslt_dlv_area_nm) doRslt_dlv_area_nm_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_unit_cd) doRslt_unit_cd_NE(info);
		else if (ne == columnRslt_unit_nm) doRslt_unit_nm_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NE(info);
		else if (ne == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NE(info);
		else if (ne == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NE(info);
		else if (ne == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NE(info);
		else if (ne == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NE(info);
		else if (ne == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NE(info);
		else if (ne == columnRslt_alc_dpt_cd) doRslt_alc_dpt_cd_NE(info);
		else if (ne == columnRslt_alc_dpt_nm) doRslt_alc_dpt_nm_NE(info);
		else if (ne == columnRslt_dest_cd1) doRslt_dest_cd1_NE(info);
		else if (ne == columnRslt_dest_nm1) doRslt_dest_nm1_NE(info);
		else if (ne == columnRslt_dest_cd2) doRslt_dest_cd2_NE(info);
		else if (ne == columnRslt_dest_nm2) doRslt_dest_nm2_NE(info);
		else if (ne == columnRslt_dest_cd3) doRslt_dest_cd3_NE(info);
		else if (ne == columnRslt_dest_nm3) doRslt_dest_nm3_NE(info);
		else if (ne == columnRslt_cost_sls_cd1) doRslt_cost_sls_cd1_NE(info);
		else if (ne == columnRslt_cost_sls_nm1) doRslt_cost_sls_nm1_NE(info);
		else if (ne == columnRslt_cost_sls_cd2) doRslt_cost_sls_cd2_NE(info);
		else if (ne == columnRslt_cost_sls_nm2) doRslt_cost_sls_nm2_NE(info);
		else if (ne == columnRslt_cost_sls_cd3) doRslt_cost_sls_cd3_NE(info);
		else if (ne == columnRslt_cost_sls_nm3) doRslt_cost_sls_nm3_NE(info);
		else if (ne == columnRslt_cost_sls_cd4) doRslt_cost_sls_cd4_NE(info);
		else if (ne == columnRslt_cost_sls_nm4) doRslt_cost_sls_nm4_NE(info);
		else if (ne == columnRslt_cost_sls_cd5) doRslt_cost_sls_cd5_NE(info);
		else if (ne == columnRslt_cost_sls_nm5) doRslt_cost_sls_nm5_NE(info);
		else if (ne == columnRslt_alc_val1) doRslt_alc_val1_NE(info);
		else if (ne == columnRslt_alc_val2) doRslt_alc_val2_NE(info);
		else if (ne == columnRslt_alc_val3) doRslt_alc_val3_NE(info);
		else if (ne == columnRslt_alc_val4) doRslt_alc_val4_NE(info);
		else if (ne == columnRslt_alc_val5) doRslt_alc_val5_NE(info);
		else if (ne == columnRslt_rec_eval_typ) doRslt_rec_eval_typ_NE(info);
		else if (ne == columnRslt_rec_eval_typ_nm) doRslt_rec_eval_typ_nm_NE(info);
		else if (ne == columnRslt_zero_effect_flg) doRslt_zero_effect_flg_NE(info);
		else if (ne == columnRslt_act_sls_id) doRslt_act_sls_id_NE(info);
		else if (ne == columnRslt_act_sls_id_sub) doRslt_act_sls_id_sub_NE(info);
		else if (ne == columnRslt_rmrks) doRslt_rmrks_NE(info);
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
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[act_sls_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sls_id_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_slo_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_slo_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_iv_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_iv_no_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[no_stk_bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_stk_bp_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[rec_eval_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rec_eval_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rec_eval_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rec_eval_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_ctg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cur_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rec_eval_typ_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rec_eval_typ_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_sls_id_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_sls_id_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mng_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mng_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mng_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mng_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rec_eval_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rec_eval_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[zero_effect_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_zero_effect_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sls_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sls_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sls_id_sub]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sls_id_sub_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_NE(MCEventInfo info){
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
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_ym_fr) doCnd_ym_fr_NX(info);
		else if (nx == Cnd_ym_to) doCnd_ym_to_NX(info);
		else if (nx == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NX(info);
		else if (nx == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NX(info);
		else if (nx == Cnd_asst_typ) doCnd_asst_typ_NX(info);
		else if (nx == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NX(info);
		else if (nx == Cnd_act_sls_id) doCnd_act_sls_id_NX(info);
		else if (nx == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NX(info);
		else if (nx == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_sno1) doCnd_sno1_NX(info);
		else if (nx == Cnd_sno2) doCnd_sno2_NX(info);
		else if (nx == Cnd_sno3) doCnd_sno3_NX(info);
		else if (nx == Cnd_sno4) doCnd_sno4_NX(info);
		else if (nx == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NX(info);
		else if (nx == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NX(info);
		else if (nx == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_NX(info);
		else if (nx == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_NX(info);
		else if (nx == Cnd_no_ac_rsn_flg) doCnd_no_ac_rsn_flg_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
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
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_no_slo_no_flg) doCnd_no_slo_no_flg_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_no_iv_no_flg) doCnd_no_iv_no_flg_NX(info);
		else if (nx == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NX(info);
		else if (nx == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NX(info);
		else if (nx == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NX(info);
		else if (nx == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NX(info);
		else if (nx == Cnd_stk_bp_cd) doCnd_stk_bp_cd_NX(info);
		else if (nx == Cnd_stk_bp_nm) doCnd_stk_bp_nm_NX(info);
		else if (nx == Cnd_no_stk_bp_flg) doCnd_no_stk_bp_flg_NX(info);
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
		else if (nx == Cnd_rec_eval_typ) doCnd_rec_eval_typ_NX(info);
		else if (nx == Cnd_rec_eval_typ_nm) doCnd_rec_eval_typ_nm_NX(info);
		else if (nx == Cnd_rmrks) doCnd_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
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
		else if (nx == Cnd_calc_ctg_flg) doCnd_calc_ctg_flg_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_ym_flg) doCnd_ym_flg_NX(info);
		else if (nx == Cnd_ac_dt_flg) doCnd_ac_dt_flg_NX(info);
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
		else if (nx == Cnd_asst_typ_flg) doCnd_asst_typ_flg_NX(info);
		else if (nx == Cnd_ac_slip_typ_flg) doCnd_ac_slip_typ_flg_NX(info);
		else if (nx == Cnd_ac_rsn_flg) doCnd_ac_rsn_flg_NX(info);
		else if (nx == Cnd_slo_no_flg) doCnd_slo_no_flg_NX(info);
		else if (nx == Cnd_iv_no_flg) doCnd_iv_no_flg_NX(info);
		else if (nx == Cnd_sls_dpt_flg) doCnd_sls_dpt_flg_NX(info);
		else if (nx == Cnd_sls_usr_flg) doCnd_sls_usr_flg_NX(info);
		else if (nx == Cnd_stk_bp_flg) doCnd_stk_bp_flg_NX(info);
		else if (nx == Cnd_alc_dpt_flg) doCnd_alc_dpt_flg_NX(info);
		else if (nx == Cnd_cst_flg) doCnd_cst_flg_NX(info);
		else if (nx == Cnd_cst_cntry_flg) doCnd_cst_cntry_flg_NX(info);
		else if (nx == Cnd_cst_area_flg) doCnd_cst_area_flg_NX(info);
		else if (nx == Cnd_dlv_flg) doCnd_dlv_flg_NX(info);
		else if (nx == Cnd_dlv_cntry_flg) doCnd_dlv_cntry_flg_NX(info);
		else if (nx == Cnd_dlv_area_flg) doCnd_dlv_area_flg_NX(info);
		else if (nx == Cnd_dest1_flg) doCnd_dest1_flg_NX(info);
		else if (nx == Cnd_dest2_flg) doCnd_dest2_flg_NX(info);
		else if (nx == Cnd_dest3_flg) doCnd_dest3_flg_NX(info);
		else if (nx == Cnd_cost_sls1_flg) doCnd_cost_sls1_flg_NX(info);
		else if (nx == Cnd_cost_sls2_flg) doCnd_cost_sls2_flg_NX(info);
		else if (nx == Cnd_cost_sls3_flg) doCnd_cost_sls3_flg_NX(info);
		else if (nx == Cnd_cost_sls4_flg) doCnd_cost_sls4_flg_NX(info);
		else if (nx == Cnd_cost_sls5_flg) doCnd_cost_sls5_flg_NX(info);
		else if (nx == Cnd_trd_cur_flg) doCnd_trd_cur_flg_NX(info);
		else if (nx == Cnd_xrate_flg) doCnd_xrate_flg_NX(info);
		else if (nx == Cnd_rec_eval_typ_flg) doCnd_rec_eval_typ_flg_NX(info);
		else if (nx == Cnd_alc_sls_id_flg) doCnd_alc_sls_id_flg_NX(info);
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
		else if (nx == Cnd_cur_cd) doCnd_cur_cd_NX(info);
		else if (nx == Cnd_amt_dec_place) doCnd_amt_dec_place_NX(info);
		else if (nx == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NX(info);
		else if (nx == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_ym) doRslt_ym_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_mng_dpt_cd) doRslt_mng_dpt_cd_NX(info);
		else if (nx == columnRslt_mng_dpt_nm) doRslt_mng_dpt_nm_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NX(info);
		else if (nx == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NX(info);
		else if (nx == columnRslt_itm_grp_cd1) doRslt_itm_grp_cd1_NX(info);
		else if (nx == columnRslt_itm_grp_nm1) doRslt_itm_grp_nm1_NX(info);
		else if (nx == columnRslt_itm_grp_cd2) doRslt_itm_grp_cd2_NX(info);
		else if (nx == columnRslt_itm_grp_nm2) doRslt_itm_grp_nm2_NX(info);
		else if (nx == columnRslt_itm_grp_cd3) doRslt_itm_grp_cd3_NX(info);
		else if (nx == columnRslt_itm_grp_nm3) doRslt_itm_grp_nm3_NX(info);
		else if (nx == columnRslt_itm_grp_cd4) doRslt_itm_grp_cd4_NX(info);
		else if (nx == columnRslt_itm_grp_nm4) doRslt_itm_grp_nm4_NX(info);
		else if (nx == columnRslt_itm_grp_cd5) doRslt_itm_grp_cd5_NX(info);
		else if (nx == columnRslt_itm_grp_nm5) doRslt_itm_grp_nm5_NX(info);
		else if (nx == columnRslt_itm_grp_cd6) doRslt_itm_grp_cd6_NX(info);
		else if (nx == columnRslt_itm_grp_nm6) doRslt_itm_grp_nm6_NX(info);
		else if (nx == columnRslt_itm_grp_cd7) doRslt_itm_grp_cd7_NX(info);
		else if (nx == columnRslt_itm_grp_nm7) doRslt_itm_grp_nm7_NX(info);
		else if (nx == columnRslt_itm_grp_cd8) doRslt_itm_grp_cd8_NX(info);
		else if (nx == columnRslt_itm_grp_nm8) doRslt_itm_grp_nm8_NX(info);
		else if (nx == columnRslt_itm_grp_cd9) doRslt_itm_grp_cd9_NX(info);
		else if (nx == columnRslt_itm_grp_nm9) doRslt_itm_grp_nm9_NX(info);
		else if (nx == columnRslt_itm_grp_cd10) doRslt_itm_grp_cd10_NX(info);
		else if (nx == columnRslt_itm_grp_nm10) doRslt_itm_grp_nm10_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_sno1) doRslt_sno1_NX(info);
		else if (nx == columnRslt_sno2) doRslt_sno2_NX(info);
		else if (nx == columnRslt_sno3) doRslt_sno3_NX(info);
		else if (nx == columnRslt_sno4) doRslt_sno4_NX(info);
		else if (nx == columnRslt_ac_slip_typ) doRslt_ac_slip_typ_NX(info);
		else if (nx == columnRslt_ac_slip_typ_nm) doRslt_ac_slip_typ_nm_NX(info);
		else if (nx == columnRslt_ac_rsn_cd) doRslt_ac_rsn_cd_NX(info);
		else if (nx == columnRslt_ac_rsn_nm) doRslt_ac_rsn_nm_NX(info);
		else if (nx == columnRslt_asst_typ) doRslt_asst_typ_NX(info);
		else if (nx == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_cst_grp_cd1) doRslt_cst_grp_cd1_NX(info);
		else if (nx == columnRslt_cst_grp_nm1) doRslt_cst_grp_nm1_NX(info);
		else if (nx == columnRslt_cst_grp_cd2) doRslt_cst_grp_cd2_NX(info);
		else if (nx == columnRslt_cst_grp_nm2) doRslt_cst_grp_nm2_NX(info);
		else if (nx == columnRslt_cst_grp_cd3) doRslt_cst_grp_cd3_NX(info);
		else if (nx == columnRslt_cst_grp_nm3) doRslt_cst_grp_nm3_NX(info);
		else if (nx == columnRslt_cst_grp_cd4) doRslt_cst_grp_cd4_NX(info);
		else if (nx == columnRslt_cst_grp_nm4) doRslt_cst_grp_nm4_NX(info);
		else if (nx == columnRslt_cst_grp_cd5) doRslt_cst_grp_cd5_NX(info);
		else if (nx == columnRslt_cst_grp_nm5) doRslt_cst_grp_nm5_NX(info);
		else if (nx == columnRslt_cst_grp_cd6) doRslt_cst_grp_cd6_NX(info);
		else if (nx == columnRslt_cst_grp_nm6) doRslt_cst_grp_nm6_NX(info);
		else if (nx == columnRslt_cst_grp_cd7) doRslt_cst_grp_cd7_NX(info);
		else if (nx == columnRslt_cst_grp_nm7) doRslt_cst_grp_nm7_NX(info);
		else if (nx == columnRslt_cst_grp_cd8) doRslt_cst_grp_cd8_NX(info);
		else if (nx == columnRslt_cst_grp_nm8) doRslt_cst_grp_nm8_NX(info);
		else if (nx == columnRslt_cst_grp_cd9) doRslt_cst_grp_cd9_NX(info);
		else if (nx == columnRslt_cst_grp_nm9) doRslt_cst_grp_nm9_NX(info);
		else if (nx == columnRslt_cst_grp_cd10) doRslt_cst_grp_cd10_NX(info);
		else if (nx == columnRslt_cst_grp_nm10) doRslt_cst_grp_nm10_NX(info);
		else if (nx == columnRslt_cst_cntry_cd) doRslt_cst_cntry_cd_NX(info);
		else if (nx == columnRslt_cst_cntry_nm) doRslt_cst_cntry_nm_NX(info);
		else if (nx == columnRslt_cst_area_cd) doRslt_cst_area_cd_NX(info);
		else if (nx == columnRslt_cst_area_nm) doRslt_cst_area_nm_NX(info);
		else if (nx == columnRslt_dlv_cd) doRslt_dlv_cd_NX(info);
		else if (nx == columnRslt_dlv_nm) doRslt_dlv_nm_NX(info);
		else if (nx == columnRslt_dlv_grp_cd1) doRslt_dlv_grp_cd1_NX(info);
		else if (nx == columnRslt_dlv_grp_nm1) doRslt_dlv_grp_nm1_NX(info);
		else if (nx == columnRslt_dlv_grp_cd2) doRslt_dlv_grp_cd2_NX(info);
		else if (nx == columnRslt_dlv_grp_nm2) doRslt_dlv_grp_nm2_NX(info);
		else if (nx == columnRslt_dlv_grp_cd3) doRslt_dlv_grp_cd3_NX(info);
		else if (nx == columnRslt_dlv_grp_nm3) doRslt_dlv_grp_nm3_NX(info);
		else if (nx == columnRslt_dlv_grp_cd4) doRslt_dlv_grp_cd4_NX(info);
		else if (nx == columnRslt_dlv_grp_nm4) doRslt_dlv_grp_nm4_NX(info);
		else if (nx == columnRslt_dlv_grp_cd5) doRslt_dlv_grp_cd5_NX(info);
		else if (nx == columnRslt_dlv_grp_nm5) doRslt_dlv_grp_nm5_NX(info);
		else if (nx == columnRslt_dlv_grp_cd6) doRslt_dlv_grp_cd6_NX(info);
		else if (nx == columnRslt_dlv_grp_nm6) doRslt_dlv_grp_nm6_NX(info);
		else if (nx == columnRslt_dlv_grp_cd7) doRslt_dlv_grp_cd7_NX(info);
		else if (nx == columnRslt_dlv_grp_nm7) doRslt_dlv_grp_nm7_NX(info);
		else if (nx == columnRslt_dlv_grp_cd8) doRslt_dlv_grp_cd8_NX(info);
		else if (nx == columnRslt_dlv_grp_nm8) doRslt_dlv_grp_nm8_NX(info);
		else if (nx == columnRslt_dlv_grp_cd9) doRslt_dlv_grp_cd9_NX(info);
		else if (nx == columnRslt_dlv_grp_nm9) doRslt_dlv_grp_nm9_NX(info);
		else if (nx == columnRslt_dlv_grp_cd10) doRslt_dlv_grp_cd10_NX(info);
		else if (nx == columnRslt_dlv_grp_nm10) doRslt_dlv_grp_nm10_NX(info);
		else if (nx == columnRslt_dlv_cntry_cd) doRslt_dlv_cntry_cd_NX(info);
		else if (nx == columnRslt_dlv_cntry_nm) doRslt_dlv_cntry_nm_NX(info);
		else if (nx == columnRslt_dlv_area_cd) doRslt_dlv_area_cd_NX(info);
		else if (nx == columnRslt_dlv_area_nm) doRslt_dlv_area_nm_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_unit_cd) doRslt_unit_cd_NX(info);
		else if (nx == columnRslt_unit_nm) doRslt_unit_nm_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NX(info);
		else if (nx == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NX(info);
		else if (nx == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NX(info);
		else if (nx == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NX(info);
		else if (nx == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NX(info);
		else if (nx == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NX(info);
		else if (nx == columnRslt_alc_dpt_cd) doRslt_alc_dpt_cd_NX(info);
		else if (nx == columnRslt_alc_dpt_nm) doRslt_alc_dpt_nm_NX(info);
		else if (nx == columnRslt_dest_cd1) doRslt_dest_cd1_NX(info);
		else if (nx == columnRslt_dest_nm1) doRslt_dest_nm1_NX(info);
		else if (nx == columnRslt_dest_cd2) doRslt_dest_cd2_NX(info);
		else if (nx == columnRslt_dest_nm2) doRslt_dest_nm2_NX(info);
		else if (nx == columnRslt_dest_cd3) doRslt_dest_cd3_NX(info);
		else if (nx == columnRslt_dest_nm3) doRslt_dest_nm3_NX(info);
		else if (nx == columnRslt_cost_sls_cd1) doRslt_cost_sls_cd1_NX(info);
		else if (nx == columnRslt_cost_sls_nm1) doRslt_cost_sls_nm1_NX(info);
		else if (nx == columnRslt_cost_sls_cd2) doRslt_cost_sls_cd2_NX(info);
		else if (nx == columnRslt_cost_sls_nm2) doRslt_cost_sls_nm2_NX(info);
		else if (nx == columnRslt_cost_sls_cd3) doRslt_cost_sls_cd3_NX(info);
		else if (nx == columnRslt_cost_sls_nm3) doRslt_cost_sls_nm3_NX(info);
		else if (nx == columnRslt_cost_sls_cd4) doRslt_cost_sls_cd4_NX(info);
		else if (nx == columnRslt_cost_sls_nm4) doRslt_cost_sls_nm4_NX(info);
		else if (nx == columnRslt_cost_sls_cd5) doRslt_cost_sls_cd5_NX(info);
		else if (nx == columnRslt_cost_sls_nm5) doRslt_cost_sls_nm5_NX(info);
		else if (nx == columnRslt_alc_val1) doRslt_alc_val1_NX(info);
		else if (nx == columnRslt_alc_val2) doRslt_alc_val2_NX(info);
		else if (nx == columnRslt_alc_val3) doRslt_alc_val3_NX(info);
		else if (nx == columnRslt_alc_val4) doRslt_alc_val4_NX(info);
		else if (nx == columnRslt_alc_val5) doRslt_alc_val5_NX(info);
		else if (nx == columnRslt_rec_eval_typ) doRslt_rec_eval_typ_NX(info);
		else if (nx == columnRslt_rec_eval_typ_nm) doRslt_rec_eval_typ_nm_NX(info);
		else if (nx == columnRslt_zero_effect_flg) doRslt_zero_effect_flg_NX(info);
		else if (nx == columnRslt_act_sls_id) doRslt_act_sls_id_NX(info);
		else if (nx == columnRslt_act_sls_id_sub) doRslt_act_sls_id_sub_NX(info);
		else if (nx == columnRslt_rmrks) doRslt_rmrks_NX(info);
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
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[act_sls_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sls_id_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_slo_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_slo_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_iv_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_iv_no_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[no_stk_bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_stk_bp_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[rec_eval_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rec_eval_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rec_eval_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rec_eval_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[calc_ctg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[asst_typ_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_dpt_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cur_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rec_eval_typ_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rec_eval_typ_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_sls_id_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_sls_id_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mng_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mng_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mng_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mng_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rec_eval_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rec_eval_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[zero_effect_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_zero_effect_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sls_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sls_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sls_id_sub]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sls_id_sub_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_NX(MCEventInfo info){
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
		if (lc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_LC(info);
		else if (lc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_ym_fr) doCnd_ym_fr_LC(info);
		else if (lc == Cnd_ym_to) doCnd_ym_to_LC(info);
		else if (lc == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_LC(info);
		else if (lc == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_LC(info);
		else if (lc == Cnd_asst_typ) doCnd_asst_typ_LC(info);
		else if (lc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_LC(info);
		else if (lc == Cnd_act_sls_id) doCnd_act_sls_id_LC(info);
		else if (lc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_LC(info);
		else if (lc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_sno1) doCnd_sno1_LC(info);
		else if (lc == Cnd_sno2) doCnd_sno2_LC(info);
		else if (lc == Cnd_sno3) doCnd_sno3_LC(info);
		else if (lc == Cnd_sno4) doCnd_sno4_LC(info);
		else if (lc == Cnd_ac_slip_typ) doCnd_ac_slip_typ_LC(info);
		else if (lc == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_LC(info);
		else if (lc == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_LC(info);
		else if (lc == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
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
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_LC(info);
		else if (lc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_LC(info);
		else if (lc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_LC(info);
		else if (lc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_LC(info);
		else if (lc == Cnd_stk_bp_cd) doCnd_stk_bp_cd_LC(info);
		else if (lc == Cnd_stk_bp_nm) doCnd_stk_bp_nm_LC(info);
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
		else if (lc == Cnd_rec_eval_typ) doCnd_rec_eval_typ_LC(info);
		else if (lc == Cnd_rec_eval_typ_nm) doCnd_rec_eval_typ_nm_LC(info);
		else if (lc == Cnd_rmrks) doCnd_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
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
		else if (lc == Cnd_cur_cd) doCnd_cur_cd_LC(info);
		else if (lc == Cnd_amt_dec_place) doCnd_amt_dec_place_LC(info);
		else if (lc == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_LC(info);
		else if (lc == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_ym) doRslt_ym_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_mng_dpt_cd) doRslt_mng_dpt_cd_LC(info);
		else if (lc == columnRslt_mng_dpt_nm) doRslt_mng_dpt_nm_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_LC(info);
		else if (lc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_LC(info);
		else if (lc == columnRslt_itm_grp_cd1) doRslt_itm_grp_cd1_LC(info);
		else if (lc == columnRslt_itm_grp_nm1) doRslt_itm_grp_nm1_LC(info);
		else if (lc == columnRslt_itm_grp_cd2) doRslt_itm_grp_cd2_LC(info);
		else if (lc == columnRslt_itm_grp_nm2) doRslt_itm_grp_nm2_LC(info);
		else if (lc == columnRslt_itm_grp_cd3) doRslt_itm_grp_cd3_LC(info);
		else if (lc == columnRslt_itm_grp_nm3) doRslt_itm_grp_nm3_LC(info);
		else if (lc == columnRslt_itm_grp_cd4) doRslt_itm_grp_cd4_LC(info);
		else if (lc == columnRslt_itm_grp_nm4) doRslt_itm_grp_nm4_LC(info);
		else if (lc == columnRslt_itm_grp_cd5) doRslt_itm_grp_cd5_LC(info);
		else if (lc == columnRslt_itm_grp_nm5) doRslt_itm_grp_nm5_LC(info);
		else if (lc == columnRslt_itm_grp_cd6) doRslt_itm_grp_cd6_LC(info);
		else if (lc == columnRslt_itm_grp_nm6) doRslt_itm_grp_nm6_LC(info);
		else if (lc == columnRslt_itm_grp_cd7) doRslt_itm_grp_cd7_LC(info);
		else if (lc == columnRslt_itm_grp_nm7) doRslt_itm_grp_nm7_LC(info);
		else if (lc == columnRslt_itm_grp_cd8) doRslt_itm_grp_cd8_LC(info);
		else if (lc == columnRslt_itm_grp_nm8) doRslt_itm_grp_nm8_LC(info);
		else if (lc == columnRslt_itm_grp_cd9) doRslt_itm_grp_cd9_LC(info);
		else if (lc == columnRslt_itm_grp_nm9) doRslt_itm_grp_nm9_LC(info);
		else if (lc == columnRslt_itm_grp_cd10) doRslt_itm_grp_cd10_LC(info);
		else if (lc == columnRslt_itm_grp_nm10) doRslt_itm_grp_nm10_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_sno1) doRslt_sno1_LC(info);
		else if (lc == columnRslt_sno2) doRslt_sno2_LC(info);
		else if (lc == columnRslt_sno3) doRslt_sno3_LC(info);
		else if (lc == columnRslt_sno4) doRslt_sno4_LC(info);
		else if (lc == columnRslt_ac_slip_typ) doRslt_ac_slip_typ_LC(info);
		else if (lc == columnRslt_ac_slip_typ_nm) doRslt_ac_slip_typ_nm_LC(info);
		else if (lc == columnRslt_ac_rsn_cd) doRslt_ac_rsn_cd_LC(info);
		else if (lc == columnRslt_ac_rsn_nm) doRslt_ac_rsn_nm_LC(info);
		else if (lc == columnRslt_asst_typ) doRslt_asst_typ_LC(info);
		else if (lc == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_cst_grp_cd1) doRslt_cst_grp_cd1_LC(info);
		else if (lc == columnRslt_cst_grp_nm1) doRslt_cst_grp_nm1_LC(info);
		else if (lc == columnRslt_cst_grp_cd2) doRslt_cst_grp_cd2_LC(info);
		else if (lc == columnRslt_cst_grp_nm2) doRslt_cst_grp_nm2_LC(info);
		else if (lc == columnRslt_cst_grp_cd3) doRslt_cst_grp_cd3_LC(info);
		else if (lc == columnRslt_cst_grp_nm3) doRslt_cst_grp_nm3_LC(info);
		else if (lc == columnRslt_cst_grp_cd4) doRslt_cst_grp_cd4_LC(info);
		else if (lc == columnRslt_cst_grp_nm4) doRslt_cst_grp_nm4_LC(info);
		else if (lc == columnRslt_cst_grp_cd5) doRslt_cst_grp_cd5_LC(info);
		else if (lc == columnRslt_cst_grp_nm5) doRslt_cst_grp_nm5_LC(info);
		else if (lc == columnRslt_cst_grp_cd6) doRslt_cst_grp_cd6_LC(info);
		else if (lc == columnRslt_cst_grp_nm6) doRslt_cst_grp_nm6_LC(info);
		else if (lc == columnRslt_cst_grp_cd7) doRslt_cst_grp_cd7_LC(info);
		else if (lc == columnRslt_cst_grp_nm7) doRslt_cst_grp_nm7_LC(info);
		else if (lc == columnRslt_cst_grp_cd8) doRslt_cst_grp_cd8_LC(info);
		else if (lc == columnRslt_cst_grp_nm8) doRslt_cst_grp_nm8_LC(info);
		else if (lc == columnRslt_cst_grp_cd9) doRslt_cst_grp_cd9_LC(info);
		else if (lc == columnRslt_cst_grp_nm9) doRslt_cst_grp_nm9_LC(info);
		else if (lc == columnRslt_cst_grp_cd10) doRslt_cst_grp_cd10_LC(info);
		else if (lc == columnRslt_cst_grp_nm10) doRslt_cst_grp_nm10_LC(info);
		else if (lc == columnRslt_cst_cntry_cd) doRslt_cst_cntry_cd_LC(info);
		else if (lc == columnRslt_cst_cntry_nm) doRslt_cst_cntry_nm_LC(info);
		else if (lc == columnRslt_cst_area_cd) doRslt_cst_area_cd_LC(info);
		else if (lc == columnRslt_cst_area_nm) doRslt_cst_area_nm_LC(info);
		else if (lc == columnRslt_dlv_cd) doRslt_dlv_cd_LC(info);
		else if (lc == columnRslt_dlv_nm) doRslt_dlv_nm_LC(info);
		else if (lc == columnRslt_dlv_grp_cd1) doRslt_dlv_grp_cd1_LC(info);
		else if (lc == columnRslt_dlv_grp_nm1) doRslt_dlv_grp_nm1_LC(info);
		else if (lc == columnRslt_dlv_grp_cd2) doRslt_dlv_grp_cd2_LC(info);
		else if (lc == columnRslt_dlv_grp_nm2) doRslt_dlv_grp_nm2_LC(info);
		else if (lc == columnRslt_dlv_grp_cd3) doRslt_dlv_grp_cd3_LC(info);
		else if (lc == columnRslt_dlv_grp_nm3) doRslt_dlv_grp_nm3_LC(info);
		else if (lc == columnRslt_dlv_grp_cd4) doRslt_dlv_grp_cd4_LC(info);
		else if (lc == columnRslt_dlv_grp_nm4) doRslt_dlv_grp_nm4_LC(info);
		else if (lc == columnRslt_dlv_grp_cd5) doRslt_dlv_grp_cd5_LC(info);
		else if (lc == columnRslt_dlv_grp_nm5) doRslt_dlv_grp_nm5_LC(info);
		else if (lc == columnRslt_dlv_grp_cd6) doRslt_dlv_grp_cd6_LC(info);
		else if (lc == columnRslt_dlv_grp_nm6) doRslt_dlv_grp_nm6_LC(info);
		else if (lc == columnRslt_dlv_grp_cd7) doRslt_dlv_grp_cd7_LC(info);
		else if (lc == columnRslt_dlv_grp_nm7) doRslt_dlv_grp_nm7_LC(info);
		else if (lc == columnRslt_dlv_grp_cd8) doRslt_dlv_grp_cd8_LC(info);
		else if (lc == columnRslt_dlv_grp_nm8) doRslt_dlv_grp_nm8_LC(info);
		else if (lc == columnRslt_dlv_grp_cd9) doRslt_dlv_grp_cd9_LC(info);
		else if (lc == columnRslt_dlv_grp_nm9) doRslt_dlv_grp_nm9_LC(info);
		else if (lc == columnRslt_dlv_grp_cd10) doRslt_dlv_grp_cd10_LC(info);
		else if (lc == columnRslt_dlv_grp_nm10) doRslt_dlv_grp_nm10_LC(info);
		else if (lc == columnRslt_dlv_cntry_cd) doRslt_dlv_cntry_cd_LC(info);
		else if (lc == columnRslt_dlv_cntry_nm) doRslt_dlv_cntry_nm_LC(info);
		else if (lc == columnRslt_dlv_area_cd) doRslt_dlv_area_cd_LC(info);
		else if (lc == columnRslt_dlv_area_nm) doRslt_dlv_area_nm_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_unit_cd) doRslt_unit_cd_LC(info);
		else if (lc == columnRslt_unit_nm) doRslt_unit_nm_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_LC(info);
		else if (lc == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_LC(info);
		else if (lc == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_LC(info);
		else if (lc == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_LC(info);
		else if (lc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_LC(info);
		else if (lc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_LC(info);
		else if (lc == columnRslt_alc_dpt_cd) doRslt_alc_dpt_cd_LC(info);
		else if (lc == columnRslt_alc_dpt_nm) doRslt_alc_dpt_nm_LC(info);
		else if (lc == columnRslt_dest_cd1) doRslt_dest_cd1_LC(info);
		else if (lc == columnRslt_dest_nm1) doRslt_dest_nm1_LC(info);
		else if (lc == columnRslt_dest_cd2) doRslt_dest_cd2_LC(info);
		else if (lc == columnRslt_dest_nm2) doRslt_dest_nm2_LC(info);
		else if (lc == columnRslt_dest_cd3) doRslt_dest_cd3_LC(info);
		else if (lc == columnRslt_dest_nm3) doRslt_dest_nm3_LC(info);
		else if (lc == columnRslt_cost_sls_cd1) doRslt_cost_sls_cd1_LC(info);
		else if (lc == columnRslt_cost_sls_nm1) doRslt_cost_sls_nm1_LC(info);
		else if (lc == columnRslt_cost_sls_cd2) doRslt_cost_sls_cd2_LC(info);
		else if (lc == columnRslt_cost_sls_nm2) doRslt_cost_sls_nm2_LC(info);
		else if (lc == columnRslt_cost_sls_cd3) doRslt_cost_sls_cd3_LC(info);
		else if (lc == columnRslt_cost_sls_nm3) doRslt_cost_sls_nm3_LC(info);
		else if (lc == columnRslt_cost_sls_cd4) doRslt_cost_sls_cd4_LC(info);
		else if (lc == columnRslt_cost_sls_nm4) doRslt_cost_sls_nm4_LC(info);
		else if (lc == columnRslt_cost_sls_cd5) doRslt_cost_sls_cd5_LC(info);
		else if (lc == columnRslt_cost_sls_nm5) doRslt_cost_sls_nm5_LC(info);
		else if (lc == columnRslt_alc_val1) doRslt_alc_val1_LC(info);
		else if (lc == columnRslt_alc_val2) doRslt_alc_val2_LC(info);
		else if (lc == columnRslt_alc_val3) doRslt_alc_val3_LC(info);
		else if (lc == columnRslt_alc_val4) doRslt_alc_val4_LC(info);
		else if (lc == columnRslt_alc_val5) doRslt_alc_val5_LC(info);
		else if (lc == columnRslt_rec_eval_typ) doRslt_rec_eval_typ_LC(info);
		else if (lc == columnRslt_rec_eval_typ_nm) doRslt_rec_eval_typ_nm_LC(info);
		else if (lc == columnRslt_act_sls_id) doRslt_act_sls_id_LC(info);
		else if (lc == columnRslt_act_sls_id_sub) doRslt_act_sls_id_sub_LC(info);
		else if (lc == columnRslt_rmrks) doRslt_rmrks_LC(info);
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
	 * [Cnd]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_sls_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sls_id_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[rec_eval_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rec_eval_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rec_eval_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rec_eval_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mng_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mng_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mng_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mng_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_area_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_area_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_sls_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_sls_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_val5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_val5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rec_eval_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rec_eval_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rec_eval_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sls_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sls_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sls_id_sub]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sls_id_sub_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
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
	 * コンボ／リストのリスト[Cnd_stk_bp_cd]の作成メソッド
	 */
	public MCList getCnd_stk_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
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
	 * コンボ／リストのリスト[Cnd_rec_eval_typ]の作成メソッド
	 */
	public MCList getCnd_rec_eval_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getRecEvalTyp(row, info);
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
		if (id.equals("MG.MGBBL0170.Srch01")) {
			return new MG_MGBBL0170_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBBL0170_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0170_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0170_Srch01;

		/** コンストラクタ */
		protected MG_MGBBL0170_Srch01Bridge() {
			p_MG_MGBBL0170_Srch01 = new MCParam(PDef.MG_MGBBL0170_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0170_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0170.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0170.RsltR.class));

			p_MG_MGBBL0170_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0170_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0170_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0170_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0170_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0170.CndR up0() {
			return (mcframe.clientMGBB.MGBBP0170.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0170.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0170.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0170_Srch01.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0170.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0170_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0170.RsltR>)p_MG_MGBBL0170_Srch01.getContainerParam().getDownBlock(0));
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