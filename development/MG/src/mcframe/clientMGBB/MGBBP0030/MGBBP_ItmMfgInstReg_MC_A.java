package mcframe.clientMGBB.MGBBP0030;

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
import mcframe.clientMGBB.MGBBP0030.MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Srch01Caller;
import mcframe.clientMGBB.MGBBP0030.MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Upd01Caller;
import mcframe.clientMGBB.MGBBP0030.MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Del01Caller;
import mcframe.clientMGBB.MGBBP0030.MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Del02Caller;
import mcframe.clientMGBB.MGBBP0030.MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Imp01Caller;
import mcframe.clientMGBB.MGBBP0030.MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Ins01Caller;
import mcframe.clientMGBB.MGBBP0030.MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Ins02Caller;

/**
 * 画面"MGBBP_ItmMfgInstReg"パネルクラスです。<p>
 *
 * 品目製造指図情報を登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBBP_ItmMfgInstReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBBP0030";

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
	 * REF,View,0;UPD,Create/Modify,1;DEL,Delete,2;DELBULK,Delete (Bulk),3;INS_FILE,Import from file,4;INSDEL_FILE,Import from file after bulk deletion,5 REF,参照する,0;UPD,登録・訂正する,1;DEL,削除する,2;DELBULK,削除する（一括）,3;INS_FILE,ファイルから取り込む,4;INSDEL_FILE,一括削除後にファイルから取り込む,5.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_DELBULK = null;
	public MCRadioButton Cnd_ope_INS_FILE = null;
	public MCRadioButton Cnd_ope_INSDEL_FILE = null;
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
	public MCLabel Cnd_sppl_cd_Label = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCTextField Cnd_sppl_nm = null;
	/**
	 * Without supplier 発注先無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_sppl_flg = null;
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
	public MCLabel Cnd_po_no_Label = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_no = null;
	/**
	 * Without PO No. 発注ＮＯ無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_po_no_flg = null;
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
	public MCLabel Cnd_schd_st_dt_fr_Label = null;
	/**
	 * Scheduled start date FROM 着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_schd_st_dt_fr = null;
	public MCLabel Cnd_schd_st_dt_to_Label = null;
	/**
	 * Scheduled start date TO 着手予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_schd_st_dt_to = null;
	public MCLabel Cnd_schd_end_dt_fr_Label = null;
	/**
	 * Scheduled end date FROM 終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_schd_end_dt_fr = null;
	public MCLabel Cnd_schd_end_dt_to_Label = null;
	/**
	 * Scheduled end date TO 終了予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_schd_end_dt_to = null;
	public MCLabel Cnd_act_st_dt_fr_Label = null;
	/**
	 * Actual start date FROM 着手実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_act_st_dt_fr = null;
	public MCLabel Cnd_act_st_dt_to_Label = null;
	/**
	 * Actual start date TO 着手実績日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_act_st_dt_to = null;
	public MCLabel Cnd_act_end_dt_fr_Label = null;
	/**
	 * Actual end date FROM 終了実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_act_end_dt_fr = null;
	public MCLabel Cnd_act_end_dt_to_Label = null;
	/**
	 * Actual end date TO 終了実績日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_act_end_dt_to = null;
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
	public MCLabel Cnd_sppl_grp_cd1_Label = null;
	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd1 = null;
	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm1 = null;
	public MCLabel Cnd_sppl_grp_cd2_Label = null;
	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd2 = null;
	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm2 = null;
	public MCLabel Cnd_sppl_grp_cd3_Label = null;
	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd3 = null;
	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm3 = null;
	public MCLabel Cnd_sppl_grp_cd4_Label = null;
	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd4 = null;
	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm4 = null;
	public MCLabel Cnd_sppl_grp_cd5_Label = null;
	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd5 = null;
	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm5 = null;
	public MCLabel Cnd_sppl_grp_cd6_Label = null;
	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd6 = null;
	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm6 = null;
	public MCLabel Cnd_sppl_grp_cd7_Label = null;
	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd7 = null;
	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm7 = null;
	public MCLabel Cnd_sppl_grp_cd8_Label = null;
	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd8 = null;
	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm8 = null;
	public MCLabel Cnd_sppl_grp_cd9_Label = null;
	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd9 = null;
	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm9 = null;
	public MCLabel Cnd_sppl_grp_cd10_Label = null;
	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd10 = null;
	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm10 = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Cnd3]ブロック関連のField定義
	public MCPanel Cnd3Panel = null;
	// [Cnd3]ブロックの項目のField定義
	// [DelCnd]ブロック関連のField定義
	public MCPanel DelCndPanel = null;
	// [DelCnd]ブロックの項目のField定義
	public MCLabel DelCnd_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox DelCnd_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCTextField DelCnd_calc_ctg_nm = null;
	public MCLabel DelCnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox DelCnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField DelCnd_wg_nm = null;
	public MCLabel DelCnd_mng_dpt_cd_Label = null;
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox DelCnd_mng_dpt_cd = null;
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public MCTextField DelCnd_mng_dpt_nm = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBB.MGBBP0030.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
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
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_mfg_inst_no = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_act_no = null;
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
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_nm = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_no = null;
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
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_st_dt = null;
	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_end_dt = null;
	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_st_dt = null;
	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_end_dt = null;
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
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
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
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Operation order info. 指図工程情報一覧.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0040 = null;
	/**
	 * Mfg. result 製造実績一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0100 = null;
	/**
	 * Input result 投入実績一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0120 = null;
	/**
	 * Order direct man-hour result 指図工数実績一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0130 = null;
	/**
	 * In process order result 指図仕掛実績一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0150 = null;
	/**
	 * Mfg. result IF 製造実績ＩＦ一覧.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0300 = null;
	/**
	 * Input result IF 投入実績ＩＦ一覧.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0320 = null;
	/**
	 * Order direct man-hour result IF 指図工数実績ＩＦ一覧.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0330 = null;
	/**
	 * In process order result IF 指図仕掛実績ＩＦ一覧.<p>
	 *
	 */
	public MCButton Btn_open_MGBBP0350 = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn_rcopy = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins_in_file = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins_del_in_file = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del_bulk = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [DEL_BULK]モードを表す定数 */
	public static final String DEL_BULK = "DEL_BULK";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [INS_DEL]モードを表す定数 */
	public static final String INS_DEL = "INS_DEL";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_REF, REF, UPD, SRCH_DEL, DEL, DEL_BULK, INS, INS_DEL, FIX_U};
	
	/** [MG_MGBBL0030_Srch01]のCallerの作成 */
	protected MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Srch01Caller createMG_MGBBL0030_Srch01() {
		MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Srch01Caller<MGBBP_ItmMfgInstReg, MG_MGBBL0030_Srch01Bridge>
		caller = ((MGBBP_ItmMfgInstReg_MC)this).new MG_MGBBL0030_Srch01Caller<MGBBP_ItmMfgInstReg, MG_MGBBL0030_Srch01Bridge>(
					(MGBBP_ItmMfgInstReg)this, new MG_MGBBL0030_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBBL0030_Srch01]の呼び出し */
	protected void callMG_MGBBL0030_Srch01() {
		MCCaller caller = createMG_MGBBL0030_Srch01();
		caller.exec();
	}
	/** [MG_MGBBL0030_Upd01]のCallerの作成 */
	protected MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Upd01Caller createMG_MGBBL0030_Upd01() {
		MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Upd01Caller<MGBBP_ItmMfgInstReg, MG_MGBBL0030_Upd01Bridge>
		caller = ((MGBBP_ItmMfgInstReg_MC)this).new MG_MGBBL0030_Upd01Caller<MGBBP_ItmMfgInstReg, MG_MGBBL0030_Upd01Bridge>(
					(MGBBP_ItmMfgInstReg)this, new MG_MGBBL0030_Upd01Bridge());
		return caller;
	}
	/** [MG_MGBBL0030_Upd01]の呼び出し */
	protected void callMG_MGBBL0030_Upd01() {
		MCCaller caller = createMG_MGBBL0030_Upd01();
		caller.exec();
	}
	/** [MG_MGBBL0030_Del01]のCallerの作成 */
	protected MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Del01Caller createMG_MGBBL0030_Del01() {
		MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Del01Caller<MGBBP_ItmMfgInstReg, MG_MGBBL0030_Del01Bridge>
		caller = ((MGBBP_ItmMfgInstReg_MC)this).new MG_MGBBL0030_Del01Caller<MGBBP_ItmMfgInstReg, MG_MGBBL0030_Del01Bridge>(
					(MGBBP_ItmMfgInstReg)this, new MG_MGBBL0030_Del01Bridge());
		return caller;
	}
	/** [MG_MGBBL0030_Del01]の呼び出し */
	protected void callMG_MGBBL0030_Del01() {
		MCCaller caller = createMG_MGBBL0030_Del01();
		caller.exec();
	}
	/** [MG_MGBBL0030_Del02]のCallerの作成 */
	protected MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Del02Caller createMG_MGBBL0030_Del02() {
		MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Del02Caller<MGBBP_ItmMfgInstReg, MG_MGBBL0030_Del02Bridge>
		caller = ((MGBBP_ItmMfgInstReg_MC)this).new MG_MGBBL0030_Del02Caller<MGBBP_ItmMfgInstReg, MG_MGBBL0030_Del02Bridge>(
					(MGBBP_ItmMfgInstReg)this, new MG_MGBBL0030_Del02Bridge());
		return caller;
	}
	/** [MG_MGBBL0030_Del02]の呼び出し */
	protected void callMG_MGBBL0030_Del02() {
		MCCaller caller = createMG_MGBBL0030_Del02();
		caller.exec();
	}
	/** [MG_MGBBL0030_Imp01]のCallerの作成 */
	protected MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Imp01Caller createMG_MGBBL0030_Imp01() {
		MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Imp01Caller<MGBBP_ItmMfgInstReg, MG_MGBBL0030_Imp01Bridge>
		caller = ((MGBBP_ItmMfgInstReg_MC)this).new MG_MGBBL0030_Imp01Caller<MGBBP_ItmMfgInstReg, MG_MGBBL0030_Imp01Bridge>(
					(MGBBP_ItmMfgInstReg)this, new MG_MGBBL0030_Imp01Bridge());
		return caller;
	}
	/** [MG_MGBBL0030_Imp01]の呼び出し */
	protected void callMG_MGBBL0030_Imp01() {
		MCCaller caller = createMG_MGBBL0030_Imp01();
		caller.exec();
	}
	/** [MG_MGBBL0030_Ins01]のCallerの作成 */
	protected MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Ins01Caller createMG_MGBBL0030_Ins01() {
		MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Ins01Caller<MGBBP_ItmMfgInstReg, MG_MGBBL0030_Ins01Bridge>
		caller = ((MGBBP_ItmMfgInstReg_MC)this).new MG_MGBBL0030_Ins01Caller<MGBBP_ItmMfgInstReg, MG_MGBBL0030_Ins01Bridge>(
					(MGBBP_ItmMfgInstReg)this, new MG_MGBBL0030_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBBL0030_Ins01]の呼び出し */
	protected void callMG_MGBBL0030_Ins01() {
		MCCaller caller = createMG_MGBBL0030_Ins01();
		caller.exec();
	}
	/** [MG_MGBBL0030_Ins02]のCallerの作成 */
	protected MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Ins02Caller createMG_MGBBL0030_Ins02() {
		MGBBP_ItmMfgInstReg_MC.MG_MGBBL0030_Ins02Caller<MGBBP_ItmMfgInstReg, MG_MGBBL0030_Ins02Bridge>
		caller = ((MGBBP_ItmMfgInstReg_MC)this).new MG_MGBBL0030_Ins02Caller<MGBBP_ItmMfgInstReg, MG_MGBBL0030_Ins02Bridge>(
					(MGBBP_ItmMfgInstReg)this, new MG_MGBBL0030_Ins02Bridge());
		return caller;
	}
	/** [MG_MGBBL0030_Ins02]の呼び出し */
	protected void callMG_MGBBL0030_Ins02() {
		MCCaller caller = createMG_MGBBL0030_Ins02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBB.MGBBP0030.CndR aCndR;
	/** [DelCnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBB.MGBBP0030.DelCndR aDelCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBB.MGBBP0030.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBB.MGBBP0030.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0030.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBB.MGBBP0030.CndR createCndR() {
		return mcframe.clientMGBB.MGBBP0030.CndR.create();
	}

	/**
	 * 項目コピーによってaDelCndRを設定します。
	 *
	 * aDelCndRのインスタンスは変更されません。
	 *
	 * @param row DelCndR
	 */
	public void setDelCndR(mcframe.clientMGBB.MGBBP0030.DelCndR row) {
		if (row != null) {
			MCRow.copyall(getDelCndR(), row);
		}
	}

	/**
	 * [DelCnd]ブロックのコンテナaDelCndRを返します。
	 *
	 * @return DelCndR
	 */
	public mcframe.clientMGBB.MGBBP0030.DelCndR getDelCndR() {
		return aDelCndR;
	}

	/**
	 * aDelCndRを作成します。
	 *
	 * @return DelCndR
	 */
	public mcframe.clientMGBB.MGBBP0030.DelCndR createDelCndR() {
		return mcframe.clientMGBB.MGBBP0030.DelCndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBB.MGBBP0030.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBB.MGBBP0030.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBB.MGBBP0030.RsltR createRsltR() {
		return mcframe.clientMGBB.MGBBP0030.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBB.MGBBP0030.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBB.MGBBP0030.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getDelCndR())) ret.add(getDelCndR());
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
		if(aCnt == getDelCndR()) return "DelCnd";
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
		if(bId.equals("DelCnd")) return getDelCndR();
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
		ret.add(DelCndPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBBP_ItmMfgInstReg_MC_A() {
		aCndR = createCndR();
		aDelCndR = createDelCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBBP_ItmMfgInstReg_MC_A(String name) {
		aCndR = createCndR();
		aDelCndR = createDelCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBBP_ItmMfgInstReg_MC.jbCreateScreenOpe((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbCreateTop((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbCreateFold((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbCreateTab1((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbCreateTab2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbCreateTab3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbCreateTab4((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbCreateCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbCreateCnd2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbCreateCnd3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbCreateDelCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbCreateCtrl((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbCreateRslt((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbCreateBtn((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbCreateEastBtn((MGBBP_ItmMfgInstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBBP_ItmMfgInstReg p) {
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
	protected static void jbCreateCnd2(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 * [DelCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDelCnd(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBBP_ItmMfgInstReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBBP_ItmMfgInstReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBB.MGBBP0030.RsltR.$itm_p);
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
		p.Rslt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBB.MGBBP0030.RsltR.$qty_p);
		p.Rslt_qty_p_PPanel.setName("Rslt.qty_p");
		p.columnRslt_qty = p.Rslt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_qty.addAliasName("Rslt.qty", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMGBB.MGBBP0030.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBBP_ItmMfgInstReg p) {
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
	
	
	/** [Cnd_sppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_cd_p = null;

	/**
	 * [Cnd_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_cd_ListPutter() {
		if (Cnd_sppl_cd_p == null) {
			Cnd_sppl_cd_p = createCnd_sppl_cd_ListPutter(Cnd_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Cnd_sppl_cd_p;
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
	
	
	/** [Cnd_sppl_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd1_p = null;

	/**
	 * [Cnd_sppl_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd1_ListPutter() {
		if (Cnd_sppl_grp_cd1_p == null) {
			Cnd_sppl_grp_cd1_p = createCnd_sppl_grp_cd1_ListPutter(Cnd_sppl_grp_cd1, "sppl_grp_cd1", "sppl_grp_nm1");

		}
		return Cnd_sppl_grp_cd1_p;
	}
	
	
	/** [Cnd_sppl_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd2_p = null;

	/**
	 * [Cnd_sppl_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd2_ListPutter() {
		if (Cnd_sppl_grp_cd2_p == null) {
			Cnd_sppl_grp_cd2_p = createCnd_sppl_grp_cd2_ListPutter(Cnd_sppl_grp_cd2, "sppl_grp_cd2", "sppl_grp_nm2");

		}
		return Cnd_sppl_grp_cd2_p;
	}
	
	
	/** [Cnd_sppl_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd3_p = null;

	/**
	 * [Cnd_sppl_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd3_ListPutter() {
		if (Cnd_sppl_grp_cd3_p == null) {
			Cnd_sppl_grp_cd3_p = createCnd_sppl_grp_cd3_ListPutter(Cnd_sppl_grp_cd3, "sppl_grp_cd3", "sppl_grp_nm3");

		}
		return Cnd_sppl_grp_cd3_p;
	}
	
	
	/** [Cnd_sppl_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd4_p = null;

	/**
	 * [Cnd_sppl_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd4_ListPutter() {
		if (Cnd_sppl_grp_cd4_p == null) {
			Cnd_sppl_grp_cd4_p = createCnd_sppl_grp_cd4_ListPutter(Cnd_sppl_grp_cd4, "sppl_grp_cd4", "sppl_grp_nm4");

		}
		return Cnd_sppl_grp_cd4_p;
	}
	
	
	/** [Cnd_sppl_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd5_p = null;

	/**
	 * [Cnd_sppl_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd5_ListPutter() {
		if (Cnd_sppl_grp_cd5_p == null) {
			Cnd_sppl_grp_cd5_p = createCnd_sppl_grp_cd5_ListPutter(Cnd_sppl_grp_cd5, "sppl_grp_cd5", "sppl_grp_nm5");

		}
		return Cnd_sppl_grp_cd5_p;
	}
	
	
	/** [Cnd_sppl_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd6_p = null;

	/**
	 * [Cnd_sppl_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd6_ListPutter() {
		if (Cnd_sppl_grp_cd6_p == null) {
			Cnd_sppl_grp_cd6_p = createCnd_sppl_grp_cd6_ListPutter(Cnd_sppl_grp_cd6, "sppl_grp_cd6", "sppl_grp_nm6");

		}
		return Cnd_sppl_grp_cd6_p;
	}
	
	
	/** [Cnd_sppl_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd7_p = null;

	/**
	 * [Cnd_sppl_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd7_ListPutter() {
		if (Cnd_sppl_grp_cd7_p == null) {
			Cnd_sppl_grp_cd7_p = createCnd_sppl_grp_cd7_ListPutter(Cnd_sppl_grp_cd7, "sppl_grp_cd7", "sppl_grp_nm7");

		}
		return Cnd_sppl_grp_cd7_p;
	}
	
	
	/** [Cnd_sppl_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd8_p = null;

	/**
	 * [Cnd_sppl_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd8_ListPutter() {
		if (Cnd_sppl_grp_cd8_p == null) {
			Cnd_sppl_grp_cd8_p = createCnd_sppl_grp_cd8_ListPutter(Cnd_sppl_grp_cd8, "sppl_grp_cd8", "sppl_grp_nm8");

		}
		return Cnd_sppl_grp_cd8_p;
	}
	
	
	/** [Cnd_sppl_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd9_p = null;

	/**
	 * [Cnd_sppl_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd9_ListPutter() {
		if (Cnd_sppl_grp_cd9_p == null) {
			Cnd_sppl_grp_cd9_p = createCnd_sppl_grp_cd9_ListPutter(Cnd_sppl_grp_cd9, "sppl_grp_cd9", "sppl_grp_nm9");

		}
		return Cnd_sppl_grp_cd9_p;
	}
	
	
	/** [Cnd_sppl_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd10_p = null;

	/**
	 * [Cnd_sppl_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd10_ListPutter() {
		if (Cnd_sppl_grp_cd10_p == null) {
			Cnd_sppl_grp_cd10_p = createCnd_sppl_grp_cd10_ListPutter(Cnd_sppl_grp_cd10, "sppl_grp_cd10", "sppl_grp_nm10");

		}
		return Cnd_sppl_grp_cd10_p;
	}
	
	
	/** [DelCnd_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter DelCnd_calc_ctg_cd_p = null;

	/**
	 * [DelCnd_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDelCnd_calc_ctg_cd_ListPutter() {
		if (DelCnd_calc_ctg_cd_p == null) {
			DelCnd_calc_ctg_cd_p = createDelCnd_calc_ctg_cd_ListPutter(DelCnd_calc_ctg_cd, "calc_ctg_cd", "calc_ctg_nm");

		}
		return DelCnd_calc_ctg_cd_p;
	}
	
	
	/** [DelCnd_wg_cd_ListPutter]の定義 */
	private MCListPutter DelCnd_wg_cd_p = null;

	/**
	 * [DelCnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDelCnd_wg_cd_ListPutter() {
		if (DelCnd_wg_cd_p == null) {
			DelCnd_wg_cd_p = createDelCnd_wg_cd_ListPutter(DelCnd_wg_cd, "wg_cd", "wg_nm");

		}
		return DelCnd_wg_cd_p;
	}
	
	
	/** [DelCnd_mng_dpt_cd_ListPutter]の定義 */
	private MCListPutter DelCnd_mng_dpt_cd_p = null;

	/**
	 * [DelCnd_mng_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDelCnd_mng_dpt_cd_ListPutter() {
		if (DelCnd_mng_dpt_cd_p == null) {
			DelCnd_mng_dpt_cd_p = createDelCnd_mng_dpt_cd_ListPutter(DelCnd_mng_dpt_cd, "mng_dpt_cd", "mng_dpt_nm");

		}
		return DelCnd_mng_dpt_cd_p;
	}
	
	
	/** [Rslt_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Rslt_calc_ctg_cd_p = null;

	/**
	 * [Rslt_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_calc_ctg_cd_ListPutter() {
		if (Rslt_calc_ctg_cd_p == null) {
			Rslt_calc_ctg_cd_p = createRslt_calc_ctg_cd_ListPutter(columnRslt_calc_ctg_cd, "calc_ctg_cd", "calc_ctg_nm");

		}
		return Rslt_calc_ctg_cd_p;
	}
	
	
	/** [Rslt_wg_cd_ListPutter]の定義 */
	private MCListPutter Rslt_wg_cd_p = null;

	/**
	 * [Rslt_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_wg_cd_ListPutter() {
		if (Rslt_wg_cd_p == null) {
			Rslt_wg_cd_p = createRslt_wg_cd_ListPutter(columnRslt_wg_cd, "wg_cd", "wg_nm");

		}
		return Rslt_wg_cd_p;
	}
	
	
	/** [Rslt_mng_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_mng_dpt_cd_p = null;

	/**
	 * [Rslt_mng_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_mng_dpt_cd_ListPutter() {
		if (Rslt_mng_dpt_cd_p == null) {
			Rslt_mng_dpt_cd_p = createRslt_mng_dpt_cd_ListPutter(columnRslt_mng_dpt_cd, "mng_dpt_cd", "mng_dpt_nm");

		}
		return Rslt_mng_dpt_cd_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_cd_p = createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","itm_jnl_cd","unit_cd","unit_nm","dec_place","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_sub1_p = createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","itm_jnl_cd","unit_cd","unit_nm","dec_place","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_sub2_p = createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","itm_jnl_cd","unit_cd","unit_nm","dec_place","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_sub3_p = createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","itm_jnl_cd","unit_cd","unit_nm","dec_place","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Rslt_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_jnl_cd_p = null;

	/**
	 * [Rslt_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_jnl_cd_ListPutter() {
		if (Rslt_itm_jnl_cd_p == null) {
			Rslt_itm_jnl_cd_p = createRslt_itm_jnl_cd_ListPutter(columnRslt_itm_jnl_cd, "itm_jnl_cd", "itm_jnl_nm");

		}
		return Rslt_itm_jnl_cd_p;
	}
	
	
	/** [Rslt_sppl_cd_ListPutter]の定義 */
	private MCListPutter Rslt_sppl_cd_p = null;

	/**
	 * [Rslt_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_sppl_cd_ListPutter() {
		if (Rslt_sppl_cd_p == null) {
			Rslt_sppl_cd_p = createRslt_sppl_cd_ListPutter(columnRslt_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Rslt_sppl_cd_p;
	}
	
	
	/** [Rslt_asst_typ_ListPutter]の定義 */
	private MCListPutter Rslt_asst_typ_p = null;

	/**
	 * [Rslt_asst_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_asst_typ_ListPutter() {
		if (Rslt_asst_typ_p == null) {
			Rslt_asst_typ_p = createRslt_asst_typ_ListPutter(columnRslt_asst_typ, "asst_typ", "asst_typ_nm");

		}
		return Rslt_asst_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBBP_ItmMfgInstReg create(){
		MGBBP_ItmMfgInstReg p = new MGBBP_ItmMfgInstReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBBP_ItmMfgInstReg create(String name){
		MGBBP_ItmMfgInstReg p = new MGBBP_ItmMfgInstReg(name);
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
		MGBBP_ItmMfgInstReg_MC.jbfInitScreenOpe((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbfInitTop((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbfInitFold((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbfInitTab1((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbfInitTab2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbfInitTab3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbfInitTab4((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbfInitCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbfInitCnd2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbfInitCnd3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbfInitDelCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbfInitCtrl((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbfInitRslt((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbfInitBtn((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbfInitEastBtn((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbInitScreenOpe((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbInitTop((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbInitFold((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbInitTab1((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbInitTab2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbInitTab3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbInitTab4((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbInitCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbInitCnd2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbInitCnd3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbInitDelCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbInitCtrl((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbInitRslt((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbInitBtn((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.jbInitEastBtn((MGBBP_ItmMfgInstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBBP_ItmMfgInstReg p) {
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
	protected static void jbfInitTab1(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_DELBULK = p.beansFactory.createRadioButton("Cnd.ope_DELBULK");
		p.Cnd_ope_INS_FILE = p.beansFactory.createRadioButton("Cnd.ope_INS_FILE");
		p.Cnd_ope_INSDEL_FILE = p.beansFactory.createRadioButton("Cnd.ope_INSDEL_FILE");
		p.Cnd_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.calc_ctg_cd_Label");
		p.Cnd_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.calc_ctg_cd");
		p.Cnd_calc_ctg_cd.setLabel(p.Cnd_calc_ctg_cd_Label);
		p.Cnd_calc_ctg_nm = p.beansFactory.createTextField("Cnd.calc_ctg_nm");
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
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_no_sppl_flg = p.beansFactory.createCheckBox("Cnd.no_sppl_flg");
		p.Cnd_cntry_cd_Label = p.beansFactory.createLabel("Cnd.cntry_cd_Label");
		p.Cnd_cntry_cd = p.beansFactory.createTextComboBox("Cnd.cntry_cd");
		p.Cnd_cntry_cd.setLabel(p.Cnd_cntry_cd_Label);
		p.Cnd_cntry_nm = p.beansFactory.createTextField("Cnd.cntry_nm");
		p.Cnd_area_cd_Label = p.beansFactory.createLabel("Cnd.area_cd_Label");
		p.Cnd_area_cd = p.beansFactory.createTextComboBox("Cnd.area_cd");
		p.Cnd_area_cd.setLabel(p.Cnd_area_cd_Label);
		p.Cnd_area_nm = p.beansFactory.createTextField("Cnd.area_nm");
		p.Cnd_po_no_Label = p.beansFactory.createLabel("Cnd.po_no_Label");
		p.Cnd_po_no = p.beansFactory.createTextField("Cnd.po_no");
		p.Cnd_po_no.setLabel(p.Cnd_po_no_Label);
		p.Cnd_no_po_no_flg = p.beansFactory.createCheckBox("Cnd.no_po_no_flg");
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_no_slo_no_flg = p.beansFactory.createCheckBox("Cnd.no_slo_no_flg");
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_no_iv_no_flg = p.beansFactory.createCheckBox("Cnd.no_iv_no_flg");
		p.Cnd_schd_st_dt_fr_Label = p.beansFactory.createLabel("Cnd.schd_st_dt_fr_Label");
		p.Cnd_schd_st_dt_fr = p.beansFactory.createDateField("Cnd.schd_st_dt_fr");
		p.Cnd_schd_st_dt_fr.setLabel(p.Cnd_schd_st_dt_fr_Label);
		p.Cnd_schd_st_dt_to_Label = p.beansFactory.createLabel("Cnd.schd_st_dt_to_Label");
		p.Cnd_schd_st_dt_to = p.beansFactory.createDateField("Cnd.schd_st_dt_to");
		p.Cnd_schd_st_dt_to.setLabel(p.Cnd_schd_st_dt_to_Label);
		p.Cnd_schd_end_dt_fr_Label = p.beansFactory.createLabel("Cnd.schd_end_dt_fr_Label");
		p.Cnd_schd_end_dt_fr = p.beansFactory.createDateField("Cnd.schd_end_dt_fr");
		p.Cnd_schd_end_dt_fr.setLabel(p.Cnd_schd_end_dt_fr_Label);
		p.Cnd_schd_end_dt_to_Label = p.beansFactory.createLabel("Cnd.schd_end_dt_to_Label");
		p.Cnd_schd_end_dt_to = p.beansFactory.createDateField("Cnd.schd_end_dt_to");
		p.Cnd_schd_end_dt_to.setLabel(p.Cnd_schd_end_dt_to_Label);
		p.Cnd_act_st_dt_fr_Label = p.beansFactory.createLabel("Cnd.act_st_dt_fr_Label");
		p.Cnd_act_st_dt_fr = p.beansFactory.createDateField("Cnd.act_st_dt_fr");
		p.Cnd_act_st_dt_fr.setLabel(p.Cnd_act_st_dt_fr_Label);
		p.Cnd_act_st_dt_to_Label = p.beansFactory.createLabel("Cnd.act_st_dt_to_Label");
		p.Cnd_act_st_dt_to = p.beansFactory.createDateField("Cnd.act_st_dt_to");
		p.Cnd_act_st_dt_to.setLabel(p.Cnd_act_st_dt_to_Label);
		p.Cnd_act_end_dt_fr_Label = p.beansFactory.createLabel("Cnd.act_end_dt_fr_Label");
		p.Cnd_act_end_dt_fr = p.beansFactory.createDateField("Cnd.act_end_dt_fr");
		p.Cnd_act_end_dt_fr.setLabel(p.Cnd_act_end_dt_fr_Label);
		p.Cnd_act_end_dt_to_Label = p.beansFactory.createLabel("Cnd.act_end_dt_to_Label");
		p.Cnd_act_end_dt_to = p.beansFactory.createDateField("Cnd.act_end_dt_to");
		p.Cnd_act_end_dt_to.setLabel(p.Cnd_act_end_dt_to_Label);
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
		p.Cnd_sppl_grp_cd1_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd1_Label");
		p.Cnd_sppl_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd1");
		p.Cnd_sppl_grp_cd1.setLabel(p.Cnd_sppl_grp_cd1_Label);
		p.Cnd_sppl_grp_nm1 = p.beansFactory.createTextField("Cnd.sppl_grp_nm1");
		p.Cnd_sppl_grp_cd2_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd2_Label");
		p.Cnd_sppl_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd2");
		p.Cnd_sppl_grp_cd2.setLabel(p.Cnd_sppl_grp_cd2_Label);
		p.Cnd_sppl_grp_nm2 = p.beansFactory.createTextField("Cnd.sppl_grp_nm2");
		p.Cnd_sppl_grp_cd3_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd3_Label");
		p.Cnd_sppl_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd3");
		p.Cnd_sppl_grp_cd3.setLabel(p.Cnd_sppl_grp_cd3_Label);
		p.Cnd_sppl_grp_nm3 = p.beansFactory.createTextField("Cnd.sppl_grp_nm3");
		p.Cnd_sppl_grp_cd4_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd4_Label");
		p.Cnd_sppl_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd4");
		p.Cnd_sppl_grp_cd4.setLabel(p.Cnd_sppl_grp_cd4_Label);
		p.Cnd_sppl_grp_nm4 = p.beansFactory.createTextField("Cnd.sppl_grp_nm4");
		p.Cnd_sppl_grp_cd5_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd5_Label");
		p.Cnd_sppl_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd5");
		p.Cnd_sppl_grp_cd5.setLabel(p.Cnd_sppl_grp_cd5_Label);
		p.Cnd_sppl_grp_nm5 = p.beansFactory.createTextField("Cnd.sppl_grp_nm5");
		p.Cnd_sppl_grp_cd6_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd6_Label");
		p.Cnd_sppl_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd6");
		p.Cnd_sppl_grp_cd6.setLabel(p.Cnd_sppl_grp_cd6_Label);
		p.Cnd_sppl_grp_nm6 = p.beansFactory.createTextField("Cnd.sppl_grp_nm6");
		p.Cnd_sppl_grp_cd7_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd7_Label");
		p.Cnd_sppl_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd7");
		p.Cnd_sppl_grp_cd7.setLabel(p.Cnd_sppl_grp_cd7_Label);
		p.Cnd_sppl_grp_nm7 = p.beansFactory.createTextField("Cnd.sppl_grp_nm7");
		p.Cnd_sppl_grp_cd8_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd8_Label");
		p.Cnd_sppl_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd8");
		p.Cnd_sppl_grp_cd8.setLabel(p.Cnd_sppl_grp_cd8_Label);
		p.Cnd_sppl_grp_nm8 = p.beansFactory.createTextField("Cnd.sppl_grp_nm8");
		p.Cnd_sppl_grp_cd9_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd9_Label");
		p.Cnd_sppl_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd9");
		p.Cnd_sppl_grp_cd9.setLabel(p.Cnd_sppl_grp_cd9_Label);
		p.Cnd_sppl_grp_nm9 = p.beansFactory.createTextField("Cnd.sppl_grp_nm9");
		p.Cnd_sppl_grp_cd10_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd10_Label");
		p.Cnd_sppl_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd10");
		p.Cnd_sppl_grp_cd10.setLabel(p.Cnd_sppl_grp_cd10_Label);
		p.Cnd_sppl_grp_nm10 = p.beansFactory.createTextField("Cnd.sppl_grp_nm10");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [DelCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDelCnd(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.DelCndPanel = p.beansFactory.createPanel("DelCnd");
		// ブロックの項目の初期化
		p.DelCnd_calc_ctg_cd_Label = p.beansFactory.createLabel("DelCnd.calc_ctg_cd_Label");
		p.DelCnd_calc_ctg_cd = p.beansFactory.createTextComboBox("DelCnd.calc_ctg_cd");
		p.DelCnd_calc_ctg_cd.setLabel(p.DelCnd_calc_ctg_cd_Label);
		p.DelCnd_calc_ctg_nm = p.beansFactory.createTextField("DelCnd.calc_ctg_nm");
		p.DelCnd_wg_cd_Label = p.beansFactory.createLabel("DelCnd.wg_cd_Label");
		p.DelCnd_wg_cd = p.beansFactory.createTextComboBox("DelCnd.wg_cd");
		p.DelCnd_wg_cd.setLabel(p.DelCnd_wg_cd_Label);
		p.DelCnd_wg_nm = p.beansFactory.createTextField("DelCnd.wg_nm");
		p.DelCnd_mng_dpt_cd_Label = p.beansFactory.createLabel("DelCnd.mng_dpt_cd_Label");
		p.DelCnd_mng_dpt_cd = p.beansFactory.createTextComboBox("DelCnd.mng_dpt_cd");
		p.DelCnd_mng_dpt_cd.setLabel(p.DelCnd_mng_dpt_cd_Label);
		p.DelCnd_mng_dpt_nm = p.beansFactory.createTextField("DelCnd.mng_dpt_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_calc_ctg_cd = p.beansFactory.createTableColumn("Rslt.calc_ctg_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_calc_ctg_nm = p.beansFactory.createTableColumn("Rslt.calc_ctg_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_mng_dpt_cd = p.beansFactory.createTableColumn("Rslt.mng_dpt_cd", MCColumnType.TEXT_COMBO_FREE);
		p.columnRslt_mng_dpt_nm = p.beansFactory.createTableColumn("Rslt.mng_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_itm_jnl_cd = p.beansFactory.createTableColumn("Rslt.itm_jnl_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_itm_jnl_nm = p.beansFactory.createTableColumn("Rslt.itm_jnl_nm", MCColumnType.TEXT);
		p.columnRslt_itm_mfg_inst_no = p.beansFactory.createTableColumn("Rslt.itm_mfg_inst_no", MCColumnType.TEXT);
		p.columnRslt_mfg_act_no = p.beansFactory.createTableColumn("Rslt.mfg_act_no", MCColumnType.TEXT);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_sno1 = p.beansFactory.createTableColumn("Rslt.sno1", MCColumnType.TEXT);
		p.columnRslt_sno2 = p.beansFactory.createTableColumn("Rslt.sno2", MCColumnType.TEXT);
		p.columnRslt_sno3 = p.beansFactory.createTableColumn("Rslt.sno3", MCColumnType.TEXT);
		p.columnRslt_sno4 = p.beansFactory.createTableColumn("Rslt.sno4", MCColumnType.TEXT);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_po_no = p.beansFactory.createTableColumn("Rslt.po_no", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_asst_typ = p.beansFactory.createTableColumn("Rslt.asst_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_asst_typ_nm = p.beansFactory.createTableColumn("Rslt.asst_typ_nm", MCColumnType.TEXT);
		p.columnRslt_unit_cd = p.beansFactory.createTableColumn("Rslt.unit_cd", MCColumnType.TEXT);
		p.columnRslt_unit_nm = p.beansFactory.createTableColumn("Rslt.unit_nm", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_schd_st_dt = p.beansFactory.createTableColumn("Rslt.schd_st_dt", MCColumnType.DATE);
		p.columnRslt_schd_end_dt = p.beansFactory.createTableColumn("Rslt.schd_end_dt", MCColumnType.DATE);
		p.columnRslt_act_st_dt = p.beansFactory.createTableColumn("Rslt.act_st_dt", MCColumnType.DATE);
		p.columnRslt_act_end_dt = p.beansFactory.createTableColumn("Rslt.act_end_dt", MCColumnType.DATE);
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
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBBP0040 = p.beansFactory.createButton("Btn.open_MGBBP0040", "open");
		p.Btn_open_MGBBP0100 = p.beansFactory.createButton("Btn.open_MGBBP0100", "open");
		p.Btn_open_MGBBP0120 = p.beansFactory.createButton("Btn.open_MGBBP0120", "open");
		p.Btn_open_MGBBP0130 = p.beansFactory.createButton("Btn.open_MGBBP0130", "open");
		p.Btn_open_MGBBP0150 = p.beansFactory.createButton("Btn.open_MGBBP0150", "open");
		p.Btn_open_MGBBP0300 = p.beansFactory.createButton("Btn.open_MGBBP0300", "open");
		p.Btn_open_MGBBP0320 = p.beansFactory.createButton("Btn.open_MGBBP0320", "open");
		p.Btn_open_MGBBP0330 = p.beansFactory.createButton("Btn.open_MGBBP0330", "open");
		p.Btn_open_MGBBP0350 = p.beansFactory.createButton("Btn.open_MGBBP0350", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_ins_in_file = p.beansFactory.createButton("Btn.ins_in_file", "upd");
		p.Btn_ins_del_in_file = p.beansFactory.createButton("Btn.ins_del_in_file", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
		p.Btn_del_bulk = p.beansFactory.createButton("Btn.del_bulk", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBBP_ItmMfgInstReg p) {
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
	protected static void jbInitTop(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
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
	protected static void jbInitFold(MGBBP_ItmMfgInstReg p) {
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
	protected static void jbInitTab1(MGBBP_ItmMfgInstReg p) {
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
	protected static void jbInitTab2(MGBBP_ItmMfgInstReg p) {
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
	protected static void jbInitTab3(MGBBP_ItmMfgInstReg p) {
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
	protected static void jbInitTab4(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.DelCndPanel, null);
		p.Tab4Panel.setLastBeans(p.DelCndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_DELBULK);
		p.Cnd_ope_DELBULK.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_DELBULK);
		p.ScreenOpePanel.add(p.Cnd_ope_DELBULK);
		p.Cnd_ope_DELBULK.setNextBeans(p.Cnd_ope_INS_FILE);
		p.Cnd_ope_INS_FILE.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS_FILE);
		p.ScreenOpePanel.add(p.Cnd_ope_INS_FILE);
		p.Cnd_ope_INS_FILE.setNextBeans(p.Cnd_ope_INSDEL_FILE);
		p.Cnd_ope_INSDEL_FILE.setActionCommand("5");
		p.Cnd_ope_Group.add(p.Cnd_ope_INSDEL_FILE);
		p.ScreenOpePanel.add(p.Cnd_ope_INSDEL_FILE);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.ope_META);
		p.Cnd_calc_ctg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_ctg_cd, true);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ctg_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.calc_ctg_nm_META);
		p.setPluralValueEnable(p.Cnd_calc_ctg_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_mng_dpt_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_mng_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mng_dpt_cd, true);
		p.Cnd_mng_dpt_cd.setLinkBeans(p.Cnd_mng_dpt_nm);
		p.CndPanel.add(p.Cnd_mng_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_mng_dpt_cd);
		p.Cnd_mng_dpt_cd.setNextBeans(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.mng_dpt_cd_META);
		p.CndPanel.add(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_mng_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.mng_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_mng_dpt_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_jnl_cd, true);
		p.Cnd_itm_jnl_cd.setLinkBeans(p.Cnd_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setNextBeans(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_jnl_nm_META);
		p.setPluralValueEnable(p.Cnd_itm_jnl_nm, true);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_itm_mfg_inst_no);
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
		p.CndPanel.add(p.Cnd_itm_mfg_inst_no_Label);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_no);
		p.Cnd_itm_mfg_inst_no.setNextBeans(p.Cnd_mfg_act_no);
		p.Cnd_itm_mfg_inst_no.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_mfg_inst_no_META);
		p.setPluralValueEnable(p.Cnd_itm_mfg_inst_no, true);
		p.CndPanel.add(p.Cnd_mfg_act_no_Label);
		p.CndPanel.add(p.Cnd_mfg_act_no);
		p.Cnd_mfg_act_no.setNextBeans(p.Cnd_asst_typ);
		p.Cnd_mfg_act_no.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.mfg_act_no_META);
		p.setPluralValueEnable(p.Cnd_mfg_act_no, true);
		p.Cnd_asst_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asst_typ, true);
		p.Cnd_asst_typ.setLinkBeans(p.Cnd_asst_typ_nm);
		p.CndPanel.add(p.Cnd_asst_typ_Label);
		p.CndPanel.add(p.Cnd_asst_typ);
		p.Cnd_asst_typ.setNextBeans(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.asst_typ_META);
		p.CndPanel.add(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ_nm.setNextBeans(p.Cnd_lot_no);
		p.Cnd_asst_typ_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.asst_typ_nm_META);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno1);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sublot_no_META);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno1_Label);
		p.CndPanel.add(p.Cnd_sno1);
		p.Cnd_sno1.setNextBeans(p.Cnd_sno2);
		p.Cnd_sno1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sno1_META);
		p.setPluralValueEnable(p.Cnd_sno1, true);
		p.CndPanel.add(p.Cnd_sno2_Label);
		p.CndPanel.add(p.Cnd_sno2);
		p.Cnd_sno2.setNextBeans(p.Cnd_sno3);
		p.Cnd_sno2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sno2_META);
		p.setPluralValueEnable(p.Cnd_sno2, true);
		p.CndPanel.add(p.Cnd_sno3_Label);
		p.CndPanel.add(p.Cnd_sno3);
		p.Cnd_sno3.setNextBeans(p.Cnd_sno4);
		p.Cnd_sno3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sno3_META);
		p.setPluralValueEnable(p.Cnd_sno3, true);
		p.CndPanel.add(p.Cnd_sno4_Label);
		p.CndPanel.add(p.Cnd_sno4);
		p.Cnd_sno4.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_sno4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sno4_META);
		p.setPluralValueEnable(p.Cnd_sno4, true);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_no_sppl_flg);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.CndPanel.add(p.Cnd_no_sppl_flg);
		p.Cnd_no_sppl_flg.setNextBeans(p.Cnd_cntry_cd);
		p.Cnd_no_sppl_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.no_sppl_flg_META);
		p.Cnd_cntry_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cntry_cd, true);
		p.Cnd_cntry_cd.setLinkBeans(p.Cnd_cntry_nm);
		p.CndPanel.add(p.Cnd_cntry_cd_Label);
		p.CndPanel.add(p.Cnd_cntry_cd);
		p.Cnd_cntry_cd.setNextBeans(p.Cnd_cntry_nm);
		p.Cnd_cntry_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.cntry_cd_META);
		p.CndPanel.add(p.Cnd_cntry_nm);
		p.Cnd_cntry_nm.setNextBeans(p.Cnd_area_cd);
		p.Cnd_cntry_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.cntry_nm_META);
		p.setPluralValueEnable(p.Cnd_cntry_nm, true);
		p.Cnd_area_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_area_cd, true);
		p.Cnd_area_cd.setLinkBeans(p.Cnd_area_nm);
		p.CndPanel.add(p.Cnd_area_cd_Label);
		p.CndPanel.add(p.Cnd_area_cd);
		p.Cnd_area_cd.setNextBeans(p.Cnd_area_nm);
		p.Cnd_area_cd.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.area_cd_META);
		p.CndPanel.add(p.Cnd_area_nm);
		p.Cnd_area_nm.setNextBeans(p.Cnd_po_no);
		p.Cnd_area_nm.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.area_nm_META);
		p.setPluralValueEnable(p.Cnd_area_nm, true);
		p.CndPanel.add(p.Cnd_po_no_Label);
		p.CndPanel.add(p.Cnd_po_no);
		p.Cnd_po_no.setNextBeans(p.Cnd_no_po_no_flg);
		p.Cnd_po_no.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.po_no_META);
		p.setPluralValueEnable(p.Cnd_po_no, true);
		p.CndPanel.add(p.Cnd_no_po_no_flg);
		p.Cnd_no_po_no_flg.setNextBeans(p.Cnd_slo_no);
		p.Cnd_no_po_no_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.no_po_no_flg_META);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_no_slo_no_flg);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_no_slo_no_flg);
		p.Cnd_no_slo_no_flg.setNextBeans(p.Cnd_iv_no);
		p.Cnd_no_slo_no_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.no_slo_no_flg_META);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_no_iv_no_flg);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_no_iv_no_flg);
		p.Cnd_no_iv_no_flg.setNextBeans(p.Cnd_schd_st_dt_fr);
		p.Cnd_no_iv_no_flg.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.no_iv_no_flg_META);
		p.CndPanel.add(p.Cnd_schd_st_dt_fr_Label);
		p.CndPanel.add(p.Cnd_schd_st_dt_fr);
		p.Cnd_schd_st_dt_fr.setNextBeans(p.Cnd_schd_st_dt_to);
		p.Cnd_schd_st_dt_fr.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.schd_st_dt_fr_META);
		p.Cnd_schd_st_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_schd_st_dt_to_Label);
		p.CndPanel.add(p.Cnd_schd_st_dt_to);
		p.Cnd_schd_st_dt_to.setNextBeans(p.Cnd_schd_end_dt_fr);
		p.Cnd_schd_st_dt_to.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.schd_st_dt_to_META);
		p.Cnd_schd_st_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_schd_end_dt_fr_Label);
		p.CndPanel.add(p.Cnd_schd_end_dt_fr);
		p.Cnd_schd_end_dt_fr.setNextBeans(p.Cnd_schd_end_dt_to);
		p.Cnd_schd_end_dt_fr.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.schd_end_dt_fr_META);
		p.Cnd_schd_end_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_schd_end_dt_to_Label);
		p.CndPanel.add(p.Cnd_schd_end_dt_to);
		p.Cnd_schd_end_dt_to.setNextBeans(p.Cnd_act_st_dt_fr);
		p.Cnd_schd_end_dt_to.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.schd_end_dt_to_META);
		p.Cnd_schd_end_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_act_st_dt_fr_Label);
		p.CndPanel.add(p.Cnd_act_st_dt_fr);
		p.Cnd_act_st_dt_fr.setNextBeans(p.Cnd_act_st_dt_to);
		p.Cnd_act_st_dt_fr.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.act_st_dt_fr_META);
		p.Cnd_act_st_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_act_st_dt_to_Label);
		p.CndPanel.add(p.Cnd_act_st_dt_to);
		p.Cnd_act_st_dt_to.setNextBeans(p.Cnd_act_end_dt_fr);
		p.Cnd_act_st_dt_to.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.act_st_dt_to_META);
		p.Cnd_act_st_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_act_end_dt_fr_Label);
		p.CndPanel.add(p.Cnd_act_end_dt_fr);
		p.Cnd_act_end_dt_fr.setNextBeans(p.Cnd_act_end_dt_to);
		p.Cnd_act_end_dt_fr.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.act_end_dt_fr_META);
		p.Cnd_act_end_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_act_end_dt_to_Label);
		p.CndPanel.add(p.Cnd_act_end_dt_to);
		p.Cnd_act_end_dt_to.setNextBeans(p.Cnd_rmrks);
		p.Cnd_act_end_dt_to.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.act_end_dt_to_META);
		p.Cnd_act_end_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rmrks_Label);
		p.CndPanel.add(p.Cnd_rmrks);
		p.Cnd_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_rmrks.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.rmrks_META);
		p.setPluralValueEnable(p.Cnd_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
		p.Cnd_sppl_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd1, true);
		p.Cnd_sppl_grp_cd1.setLinkBeans(p.Cnd_sppl_grp_nm1);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd1_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd1);
		p.Cnd3Panel.setLastBeans(p.Cnd_sppl_grp_cd1);
		p.Cnd_sppl_grp_cd1.setNextBeans(p.Cnd_sppl_grp_nm1);
		p.Cnd_sppl_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_cd1_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm1);
		p.Cnd_sppl_grp_nm1.setNextBeans(p.Cnd_sppl_grp_cd2);
		p.Cnd_sppl_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm1, true);
		p.Cnd_sppl_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd2, true);
		p.Cnd_sppl_grp_cd2.setLinkBeans(p.Cnd_sppl_grp_nm2);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd2_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd2);
		p.Cnd_sppl_grp_cd2.setNextBeans(p.Cnd_sppl_grp_nm2);
		p.Cnd_sppl_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_cd2_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm2);
		p.Cnd_sppl_grp_nm2.setNextBeans(p.Cnd_sppl_grp_cd3);
		p.Cnd_sppl_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm2, true);
		p.Cnd_sppl_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd3, true);
		p.Cnd_sppl_grp_cd3.setLinkBeans(p.Cnd_sppl_grp_nm3);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd3_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd3);
		p.Cnd_sppl_grp_cd3.setNextBeans(p.Cnd_sppl_grp_nm3);
		p.Cnd_sppl_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_cd3_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm3);
		p.Cnd_sppl_grp_nm3.setNextBeans(p.Cnd_sppl_grp_cd4);
		p.Cnd_sppl_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm3, true);
		p.Cnd_sppl_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd4, true);
		p.Cnd_sppl_grp_cd4.setLinkBeans(p.Cnd_sppl_grp_nm4);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd4_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd4);
		p.Cnd_sppl_grp_cd4.setNextBeans(p.Cnd_sppl_grp_nm4);
		p.Cnd_sppl_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_cd4_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm4);
		p.Cnd_sppl_grp_nm4.setNextBeans(p.Cnd_sppl_grp_cd5);
		p.Cnd_sppl_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm4, true);
		p.Cnd_sppl_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd5, true);
		p.Cnd_sppl_grp_cd5.setLinkBeans(p.Cnd_sppl_grp_nm5);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd5_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd5);
		p.Cnd_sppl_grp_cd5.setNextBeans(p.Cnd_sppl_grp_nm5);
		p.Cnd_sppl_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_cd5_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm5);
		p.Cnd_sppl_grp_nm5.setNextBeans(p.Cnd_sppl_grp_cd6);
		p.Cnd_sppl_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm5, true);
		p.Cnd_sppl_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd6, true);
		p.Cnd_sppl_grp_cd6.setLinkBeans(p.Cnd_sppl_grp_nm6);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd6_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd6);
		p.Cnd_sppl_grp_cd6.setNextBeans(p.Cnd_sppl_grp_nm6);
		p.Cnd_sppl_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_cd6_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm6);
		p.Cnd_sppl_grp_nm6.setNextBeans(p.Cnd_sppl_grp_cd7);
		p.Cnd_sppl_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm6, true);
		p.Cnd_sppl_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd7, true);
		p.Cnd_sppl_grp_cd7.setLinkBeans(p.Cnd_sppl_grp_nm7);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd7_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd7);
		p.Cnd_sppl_grp_cd7.setNextBeans(p.Cnd_sppl_grp_nm7);
		p.Cnd_sppl_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_cd7_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm7);
		p.Cnd_sppl_grp_nm7.setNextBeans(p.Cnd_sppl_grp_cd8);
		p.Cnd_sppl_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm7, true);
		p.Cnd_sppl_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd8, true);
		p.Cnd_sppl_grp_cd8.setLinkBeans(p.Cnd_sppl_grp_nm8);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd8_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd8);
		p.Cnd_sppl_grp_cd8.setNextBeans(p.Cnd_sppl_grp_nm8);
		p.Cnd_sppl_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_cd8_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm8);
		p.Cnd_sppl_grp_nm8.setNextBeans(p.Cnd_sppl_grp_cd9);
		p.Cnd_sppl_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm8, true);
		p.Cnd_sppl_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd9, true);
		p.Cnd_sppl_grp_cd9.setLinkBeans(p.Cnd_sppl_grp_nm9);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd9_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd9);
		p.Cnd_sppl_grp_cd9.setNextBeans(p.Cnd_sppl_grp_nm9);
		p.Cnd_sppl_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_cd9_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm9);
		p.Cnd_sppl_grp_nm9.setNextBeans(p.Cnd_sppl_grp_cd10);
		p.Cnd_sppl_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm9, true);
		p.Cnd_sppl_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd10, true);
		p.Cnd_sppl_grp_cd10.setLinkBeans(p.Cnd_sppl_grp_nm10);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd10_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd10);
		p.Cnd_sppl_grp_cd10.setNextBeans(p.Cnd_sppl_grp_nm10);
		p.Cnd_sppl_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_cd10_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm10);
		p.Cnd_sppl_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBB.MGBBP0030.CndR.sppl_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm10, true);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DelCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDelCnd(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.DelCndPanel.setValueCheck(false);
		p.DelCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DelCndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.DelCnd_calc_ctg_cd.setListType(MCListType.STRICT);
		p.DelCnd_calc_ctg_cd.setLinkBeans(p.DelCnd_calc_ctg_nm);
		p.DelCndPanel.add(p.DelCnd_calc_ctg_cd_Label);
		p.DelCndPanel.add(p.DelCnd_calc_ctg_cd);
		p.DelCndPanel.setLastBeans(p.DelCnd_calc_ctg_cd);
		p.DelCnd_calc_ctg_cd.setNextBeans(p.DelCnd_calc_ctg_nm);
		p.DelCnd_calc_ctg_cd.setRow(p.getDelCndR(), mcframe.clientMGBB.MGBBP0030.DelCndR.calc_ctg_cd_META);
		p.DelCndPanel.add(p.DelCnd_calc_ctg_nm);
		p.DelCnd_calc_ctg_nm.setNextBeans(p.DelCnd_wg_cd);
		p.DelCnd_calc_ctg_nm.setRow(p.getDelCndR(), mcframe.clientMGBB.MGBBP0030.DelCndR.calc_ctg_nm_META);
		p.DelCnd_wg_cd.setListType(MCListType.STRICT);
		p.DelCnd_wg_cd.setLinkBeans(p.DelCnd_wg_nm);
		p.DelCndPanel.add(p.DelCnd_wg_cd_Label);
		p.DelCndPanel.add(p.DelCnd_wg_cd);
		p.DelCnd_wg_cd.setNextBeans(p.DelCnd_wg_nm);
		p.DelCnd_wg_cd.setRow(p.getDelCndR(), mcframe.clientMGBB.MGBBP0030.DelCndR.wg_cd_META);
		p.DelCndPanel.add(p.DelCnd_wg_nm);
		p.DelCnd_wg_nm.setNextBeans(p.DelCnd_mng_dpt_cd);
		p.DelCnd_wg_nm.setRow(p.getDelCndR(), mcframe.clientMGBB.MGBBP0030.DelCndR.wg_nm_META);
		p.DelCnd_mng_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.DelCnd_mng_dpt_cd, true);
		p.DelCnd_mng_dpt_cd.setLinkBeans(p.DelCnd_mng_dpt_nm);
		p.DelCndPanel.add(p.DelCnd_mng_dpt_cd_Label);
		p.DelCndPanel.add(p.DelCnd_mng_dpt_cd);
		p.DelCnd_mng_dpt_cd.setNextBeans(p.DelCnd_mng_dpt_nm);
		p.DelCnd_mng_dpt_cd.setRow(p.getDelCndR(), mcframe.clientMGBB.MGBBP0030.DelCndR.mng_dpt_cd_META);
		p.DelCndPanel.add(p.DelCnd_mng_dpt_nm);
		p.DelCnd_mng_dpt_nm.setRow(p.getDelCndR(), mcframe.clientMGBB.MGBBP0030.DelCndR.mng_dpt_nm_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBBP_ItmMfgInstReg p) {
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
	protected static void jbInitRslt(MGBBP_ItmMfgInstReg p) {
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
	protected static void jbInitBtn(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MGBBP0040.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBBP0040);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBBP0040);
		p.Btn_open_MGBBP0040.setNextBeans(p.Btn_open_MGBBP0100);
		p.Btn_open_MGBBP0100.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MGBBP0100);
		p.Btn_open_MGBBP0100.setNextBeans(p.Btn_open_MGBBP0120);
		p.Btn_open_MGBBP0120.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MGBBP0120);
		p.Btn_open_MGBBP0120.setNextBeans(p.Btn_open_MGBBP0130);
		p.Btn_open_MGBBP0130.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_open_MGBBP0130);
		p.Btn_open_MGBBP0130.setNextBeans(p.Btn_open_MGBBP0150);
		p.Btn_open_MGBBP0150.setFunctionKey(MCFunctionKey.F15);
		p.BtnPanel.add(p.Btn_open_MGBBP0150);
		p.Btn_open_MGBBP0150.setNextBeans(p.Btn_open_MGBBP0300);
		p.Btn_open_MGBBP0300.setFunctionKey(MCFunctionKey.F19);
		p.BtnPanel.add(p.Btn_open_MGBBP0300);
		p.Btn_open_MGBBP0300.setNextBeans(p.Btn_open_MGBBP0320);
		p.Btn_open_MGBBP0320.setFunctionKey(MCFunctionKey.F20);
		p.BtnPanel.add(p.Btn_open_MGBBP0320);
		p.Btn_open_MGBBP0320.setNextBeans(p.Btn_open_MGBBP0330);
		p.Btn_open_MGBBP0330.setFunctionKey(MCFunctionKey.F21);
		p.BtnPanel.add(p.Btn_open_MGBBP0330);
		p.Btn_open_MGBBP0330.setNextBeans(p.Btn_open_MGBBP0350);
		p.Btn_open_MGBBP0350.setFunctionKey(MCFunctionKey.F23);
		p.BtnPanel.add(p.Btn_open_MGBBP0350);
		p.Btn_open_MGBBP0350.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_ins_in_file);
		p.Btn_ins_in_file.setIcon("REGISTER");
		p.Btn_ins_in_file.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins_in_file);
		p.Btn_ins_in_file.setNextBeans(p.Btn_ins_del_in_file);
		p.Btn_ins_del_in_file.setIcon("REGISTER");
		p.Btn_ins_del_in_file.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins_del_in_file);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
		p.Btn_del.setNextBeans(p.Btn_del_bulk);
		p.Btn_del_bulk.setIcon("DELETE");
		p.Btn_del_bulk.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_bulk);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MGBBP_ItmMfgInstReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
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
		MGBBP_ItmMfgInstReg_MC.mcInitScreenOpe((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.mcInitTop((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.mcInitFold((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.mcInitTab1((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.mcInitTab2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.mcInitTab3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.mcInitTab4((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.mcInitCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.mcInitCnd2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.mcInitCnd3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.mcInitDelCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.mcInitCtrl((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.mcInitRslt((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.mcInitBtn((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.mcInitEastBtn((MGBBP_ItmMfgInstReg)this);

		// [SRCH_REF]ステータスのモードの設定
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__REF_ScreenOpe((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__REF_Top((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__REF_Fold((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__REF_Tab1((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__REF_Tab2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__REF_Tab3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__REF_Tab4((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__REF_Cnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__REF_Cnd2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__REF_Cnd3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__REF_DelCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__REF_Ctrl((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__REF_Rslt((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__REF_Btn((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__REF_EastBtn((MGBBP_ItmMfgInstReg)this);

		// [REF]ステータスのモードの設定
		MGBBP_ItmMfgInstReg_MC.statusInitREF_ScreenOpe((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitREF_Top((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitREF_Fold((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitREF_Tab1((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitREF_Tab2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitREF_Tab3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitREF_Tab4((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitREF_Cnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitREF_Cnd2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitREF_Cnd3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitREF_DelCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitREF_Ctrl((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitREF_Rslt((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitREF_Btn((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitREF_EastBtn((MGBBP_ItmMfgInstReg)this);

		// [UPD]ステータスのモードの設定
		MGBBP_ItmMfgInstReg_MC.statusInitUPD_ScreenOpe((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitUPD_Top((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitUPD_Fold((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitUPD_Tab1((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitUPD_Tab2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitUPD_Tab3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitUPD_Tab4((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitUPD_Cnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitUPD_Cnd2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitUPD_Cnd3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitUPD_DelCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitUPD_Ctrl((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitUPD_Rslt((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitUPD_Btn((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitUPD_EastBtn((MGBBP_ItmMfgInstReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__DEL_ScreenOpe((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__DEL_Top((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__DEL_Fold((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__DEL_Tab1((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__DEL_Tab2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__DEL_Tab3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__DEL_Tab4((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__DEL_Cnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__DEL_Cnd2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__DEL_Cnd3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__DEL_DelCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__DEL_Ctrl((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__DEL_Rslt((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__DEL_Btn((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitSRCH__DEL_EastBtn((MGBBP_ItmMfgInstReg)this);

		// [DEL]ステータスのモードの設定
		MGBBP_ItmMfgInstReg_MC.statusInitDEL_ScreenOpe((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL_Top((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL_Fold((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL_Tab1((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL_Tab2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL_Tab3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL_Tab4((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL_Cnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL_Cnd2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL_Cnd3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL_DelCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL_Ctrl((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL_Rslt((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL_Btn((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL_EastBtn((MGBBP_ItmMfgInstReg)this);

		// [DEL_BULK]ステータスのモードの設定
		MGBBP_ItmMfgInstReg_MC.statusInitDEL__BULK_ScreenOpe((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL__BULK_Top((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL__BULK_Fold((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL__BULK_Tab1((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL__BULK_Tab2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL__BULK_Tab3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL__BULK_Tab4((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL__BULK_Cnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL__BULK_Cnd2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL__BULK_Cnd3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL__BULK_DelCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL__BULK_Ctrl((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL__BULK_Rslt((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL__BULK_Btn((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitDEL__BULK_EastBtn((MGBBP_ItmMfgInstReg)this);

		// [INS]ステータスのモードの設定
		MGBBP_ItmMfgInstReg_MC.statusInitINS_ScreenOpe((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS_Top((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS_Fold((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS_Tab1((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS_Tab2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS_Tab3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS_Tab4((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS_Cnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS_Cnd2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS_Cnd3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS_DelCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS_Ctrl((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS_Rslt((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS_Btn((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS_EastBtn((MGBBP_ItmMfgInstReg)this);

		// [INS_DEL]ステータスのモードの設定
		MGBBP_ItmMfgInstReg_MC.statusInitINS__DEL_ScreenOpe((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS__DEL_Top((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS__DEL_Fold((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS__DEL_Tab1((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS__DEL_Tab2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS__DEL_Tab3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS__DEL_Tab4((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS__DEL_Cnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS__DEL_Cnd2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS__DEL_Cnd3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS__DEL_DelCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS__DEL_Ctrl((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS__DEL_Rslt((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS__DEL_Btn((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitINS__DEL_EastBtn((MGBBP_ItmMfgInstReg)this);

		// [FIX_U]ステータスのモードの設定
		MGBBP_ItmMfgInstReg_MC.statusInitFIX__U_ScreenOpe((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitFIX__U_Top((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitFIX__U_Fold((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitFIX__U_Tab1((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitFIX__U_Tab2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitFIX__U_Tab3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitFIX__U_Tab4((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitFIX__U_Cnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitFIX__U_Cnd2((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitFIX__U_Cnd3((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitFIX__U_DelCnd((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitFIX__U_Ctrl((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitFIX__U_Rslt((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitFIX__U_Btn((MGBBP_ItmMfgInstReg)this);
		MGBBP_ItmMfgInstReg_MC.statusInitFIX__U_EastBtn((MGBBP_ItmMfgInstReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBBP_ItmMfgInstReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBBP_ItmMfgInstReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_DELBULK.addAllListener(p);
		p.Cnd_ope_INS_FILE.addAllListener(p);
		p.Cnd_ope_INSDEL_FILE.addAllListener(p);
		p.Cnd_calc_ctg_cd.setListListener(p);
		p.Cnd_calc_ctg_cd.addAllListener(p);
		p.Cnd_calc_ctg_nm.setListListener(p);
		p.Cnd_calc_ctg_nm.addAllListener(p);
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
		p.Cnd_itm_mfg_inst_no.setListListener(p);
		p.Cnd_itm_mfg_inst_no.addAllListener(p);
		p.Cnd_mfg_act_no.setListListener(p);
		p.Cnd_mfg_act_no.addAllListener(p);
		p.Cnd_asst_typ.setListListener(p);
		p.Cnd_asst_typ.addAllListener(p);
		p.Cnd_asst_typ_nm.setListListener(p);
		p.Cnd_asst_typ_nm.addAllListener(p);
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
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_no_sppl_flg.addAllListener(p);
		p.Cnd_cntry_cd.setListListener(p);
		p.Cnd_cntry_cd.addAllListener(p);
		p.Cnd_cntry_nm.setListListener(p);
		p.Cnd_cntry_nm.addAllListener(p);
		p.Cnd_area_cd.setListListener(p);
		p.Cnd_area_cd.addAllListener(p);
		p.Cnd_area_nm.setListListener(p);
		p.Cnd_area_nm.addAllListener(p);
		p.Cnd_po_no.setListListener(p);
		p.Cnd_po_no.addAllListener(p);
		p.Cnd_no_po_no_flg.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_no_slo_no_flg.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_no_iv_no_flg.addAllListener(p);
		p.Cnd_schd_st_dt_fr.setListListener(p);
		p.Cnd_schd_st_dt_fr.addAllListener(p);
		p.Cnd_schd_st_dt_to.setListListener(p);
		p.Cnd_schd_st_dt_to.addAllListener(p);
		p.Cnd_schd_end_dt_fr.setListListener(p);
		p.Cnd_schd_end_dt_fr.addAllListener(p);
		p.Cnd_schd_end_dt_to.setListListener(p);
		p.Cnd_schd_end_dt_to.addAllListener(p);
		p.Cnd_act_st_dt_fr.setListListener(p);
		p.Cnd_act_st_dt_fr.addAllListener(p);
		p.Cnd_act_st_dt_to.setListListener(p);
		p.Cnd_act_st_dt_to.addAllListener(p);
		p.Cnd_act_end_dt_fr.setListListener(p);
		p.Cnd_act_end_dt_fr.addAllListener(p);
		p.Cnd_act_end_dt_to.setListListener(p);
		p.Cnd_act_end_dt_to.addAllListener(p);
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
		p.Cnd_sppl_grp_cd1.setListListener(p);
		p.Cnd_sppl_grp_cd1.addAllListener(p);
		p.Cnd_sppl_grp_nm1.setListListener(p);
		p.Cnd_sppl_grp_nm1.addAllListener(p);
		p.Cnd_sppl_grp_cd2.setListListener(p);
		p.Cnd_sppl_grp_cd2.addAllListener(p);
		p.Cnd_sppl_grp_nm2.setListListener(p);
		p.Cnd_sppl_grp_nm2.addAllListener(p);
		p.Cnd_sppl_grp_cd3.setListListener(p);
		p.Cnd_sppl_grp_cd3.addAllListener(p);
		p.Cnd_sppl_grp_nm3.setListListener(p);
		p.Cnd_sppl_grp_nm3.addAllListener(p);
		p.Cnd_sppl_grp_cd4.setListListener(p);
		p.Cnd_sppl_grp_cd4.addAllListener(p);
		p.Cnd_sppl_grp_nm4.setListListener(p);
		p.Cnd_sppl_grp_nm4.addAllListener(p);
		p.Cnd_sppl_grp_cd5.setListListener(p);
		p.Cnd_sppl_grp_cd5.addAllListener(p);
		p.Cnd_sppl_grp_nm5.setListListener(p);
		p.Cnd_sppl_grp_nm5.addAllListener(p);
		p.Cnd_sppl_grp_cd6.setListListener(p);
		p.Cnd_sppl_grp_cd6.addAllListener(p);
		p.Cnd_sppl_grp_nm6.setListListener(p);
		p.Cnd_sppl_grp_nm6.addAllListener(p);
		p.Cnd_sppl_grp_cd7.setListListener(p);
		p.Cnd_sppl_grp_cd7.addAllListener(p);
		p.Cnd_sppl_grp_nm7.setListListener(p);
		p.Cnd_sppl_grp_nm7.addAllListener(p);
		p.Cnd_sppl_grp_cd8.setListListener(p);
		p.Cnd_sppl_grp_cd8.addAllListener(p);
		p.Cnd_sppl_grp_nm8.setListListener(p);
		p.Cnd_sppl_grp_nm8.addAllListener(p);
		p.Cnd_sppl_grp_cd9.setListListener(p);
		p.Cnd_sppl_grp_cd9.addAllListener(p);
		p.Cnd_sppl_grp_nm9.setListListener(p);
		p.Cnd_sppl_grp_nm9.addAllListener(p);
		p.Cnd_sppl_grp_cd10.setListListener(p);
		p.Cnd_sppl_grp_cd10.addAllListener(p);
		p.Cnd_sppl_grp_nm10.setListListener(p);
		p.Cnd_sppl_grp_nm10.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 *  [DelCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDelCnd(MGBBP_ItmMfgInstReg p) {
		p.DelCnd_calc_ctg_cd.setListListener(p);
		p.DelCnd_calc_ctg_cd.addAllListener(p);
		p.DelCnd_calc_ctg_nm.setListListener(p);
		p.DelCnd_calc_ctg_nm.addAllListener(p);
		p.DelCnd_wg_cd.setListListener(p);
		p.DelCnd_wg_cd.addAllListener(p);
		p.DelCnd_wg_nm.setListListener(p);
		p.DelCnd_wg_nm.addAllListener(p);
		p.DelCnd_mng_dpt_cd.setListListener(p);
		p.DelCnd_mng_dpt_cd.addAllListener(p);
		p.DelCnd_mng_dpt_nm.setListListener(p);
		p.DelCnd_mng_dpt_nm.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBBP_ItmMfgInstReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBBP_ItmMfgInstReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_calc_ctg_cd.addAllListener(p);
		p.columnRslt_calc_ctg_cd.setListListener(p);
		p.columnRslt_calc_ctg_nm.addAllListener(p);
		p.columnRslt_calc_ctg_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_mng_dpt_cd.addAllListener(p);
		p.columnRslt_mng_dpt_cd.setListListener(p);
		p.columnRslt_mng_dpt_nm.addAllListener(p);
		p.columnRslt_mng_dpt_nm.setListListener(p);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
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
		p.columnRslt_itm_mfg_inst_no.addAllListener(p);
		p.columnRslt_itm_mfg_inst_no.setListListener(p);
		p.columnRslt_mfg_act_no.addAllListener(p);
		p.columnRslt_mfg_act_no.setListListener(p);
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
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_po_no.addAllListener(p);
		p.columnRslt_po_no.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_asst_typ.addAllListener(p);
		p.columnRslt_asst_typ.setListListener(p);
		p.columnRslt_asst_typ_nm.addAllListener(p);
		p.columnRslt_asst_typ_nm.setListListener(p);
		p.columnRslt_unit_cd.addAllListener(p);
		p.columnRslt_unit_cd.setListListener(p);
		p.columnRslt_unit_nm.addAllListener(p);
		p.columnRslt_unit_nm.setListListener(p);
		p.columnRslt_dec_place.addAllListener(p);
		p.columnRslt_dec_place.setListListener(p);
		p.columnRslt_schd_st_dt.addAllListener(p);
		p.columnRslt_schd_st_dt.setListListener(p);
		p.columnRslt_schd_end_dt.addAllListener(p);
		p.columnRslt_schd_end_dt.setListListener(p);
		p.columnRslt_act_st_dt.addAllListener(p);
		p.columnRslt_act_st_dt.setListListener(p);
		p.columnRslt_act_end_dt.addAllListener(p);
		p.columnRslt_act_end_dt.setListListener(p);
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
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBBP_ItmMfgInstReg p) {
		p.Btn_open_MGBBP0040.addAllListener(p);
		p.Btn_open_MGBBP0040.setAPMethodName("doBtn_open_MGBBP0040");
		p.Btn_open_MGBBP0100.addAllListener(p);
		p.Btn_open_MGBBP0100.setAPMethodName("doBtn_open_MGBBP0100");
		p.Btn_open_MGBBP0120.addAllListener(p);
		p.Btn_open_MGBBP0120.setAPMethodName("doBtn_open_MGBBP0120");
		p.Btn_open_MGBBP0130.addAllListener(p);
		p.Btn_open_MGBBP0130.setAPMethodName("doBtn_open_MGBBP0130");
		p.Btn_open_MGBBP0150.addAllListener(p);
		p.Btn_open_MGBBP0150.setAPMethodName("doBtn_open_MGBBP0150");
		p.Btn_open_MGBBP0300.addAllListener(p);
		p.Btn_open_MGBBP0300.setAPMethodName("doBtn_open_MGBBP0300");
		p.Btn_open_MGBBP0320.addAllListener(p);
		p.Btn_open_MGBBP0320.setAPMethodName("doBtn_open_MGBBP0320");
		p.Btn_open_MGBBP0330.addAllListener(p);
		p.Btn_open_MGBBP0330.setAPMethodName("doBtn_open_MGBBP0330");
		p.Btn_open_MGBBP0350.addAllListener(p);
		p.Btn_open_MGBBP0350.setAPMethodName("doBtn_open_MGBBP0350");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_ins_in_file.addAllListener(p);
		p.Btn_ins_in_file.setAPMethodName("doBtn_ins_in_file");
		p.Btn_ins_del_in_file.addAllListener(p);
		p.Btn_ins_del_in_file.setAPMethodName("doBtn_ins_del_in_file");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
		p.Btn_del_bulk.addAllListener(p);
		p.Btn_del_bulk.setAPMethodName("doBtn_del_bulk");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBBP_ItmMfgInstReg p) {
	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab1(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab4(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MGBBP_ItmMfgInstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_lot_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_cntry_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_no_po_no_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_slo_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_no_slo_no_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_iv_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_no_iv_no_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_schd_st_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_schd_st_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_schd_end_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_schd_end_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_act_st_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_act_st_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_act_end_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_act_end_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, SRCH_REF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_DelCnd(MGBBP_ItmMfgInstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_calc_ctg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MGBBP_ItmMfgInstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MGBBP_ItmMfgInstReg p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_schd_st_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_schd_end_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_act_st_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_act_end_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MGBBP_ItmMfgInstReg p){
		p.Btn_open_MGBBP0040.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MGBBP0100.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MGBBP0120.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MGBBP0130.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MGBBP0150.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MGBBP0300.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MGBBP0320.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MGBBP0330.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MGBBP0350.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_ins_in_file.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBBP_ItmMfgInstReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cntry_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_po_no_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_slo_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_slo_no_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_iv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_iv_no_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_schd_st_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_schd_st_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_schd_end_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_schd_end_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_act_st_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_act_st_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_act_end_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_act_end_dt_to.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_sppl_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [REF]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_DelCnd(MGBBP_ItmMfgInstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBBP_ItmMfgInstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBBP_ItmMfgInstReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_schd_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_schd_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
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
		p.columnRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBBP_ItmMfgInstReg p){
		p.Btn_open_MGBBP0040.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBBP0100.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBBP0120.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBBP0130.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBBP0150.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBBP0300.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBBP0320.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBBP0330.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBBP0350.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins_in_file.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab4(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBBP_ItmMfgInstReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cntry_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_no_po_no_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_no_slo_no_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_no_iv_no_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_schd_st_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_schd_st_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_schd_end_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_schd_end_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_act_st_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_act_st_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_act_end_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_act_end_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [UPD]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DelCnd(MGBBP_ItmMfgInstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MGBBP_ItmMfgInstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MGBBP_ItmMfgInstReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_calc_ctg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_mng_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnRslt_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_mfg_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sublot_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sno1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sno2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sno3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sno4.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_asst_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_asst_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnRslt_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_schd_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_schd_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_act_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_act_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MGBBP_ItmMfgInstReg p){
		p.Btn_open_MGBBP0040.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBBP0100.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBBP0120.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBBP0130.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBBP0150.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBBP0300.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBBP0320.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBBP0330.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBBP0350.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ins_in_file.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab4(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MGBBP_ItmMfgInstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_lot_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_cntry_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_no_po_no_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_slo_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_no_slo_no_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_iv_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_no_iv_no_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_schd_st_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_schd_st_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_schd_end_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_schd_end_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_act_st_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_act_st_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_act_end_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_act_end_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_DelCnd(MGBBP_ItmMfgInstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_calc_ctg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MGBBP_ItmMfgInstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MGBBP_ItmMfgInstReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_schd_st_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_schd_end_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_act_st_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_act_end_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MGBBP_ItmMfgInstReg p){
		p.Btn_open_MGBBP0040.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0100.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0120.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0130.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0150.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0300.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0320.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0330.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0350.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_ins_in_file.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab4(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MGBBP_ItmMfgInstReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_lot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_cntry_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_no_po_no_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_slo_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_no_slo_no_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_iv_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_no_iv_no_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_schd_st_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_schd_st_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_schd_end_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_schd_end_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_act_st_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_act_st_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_act_end_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_act_end_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DelCnd(MGBBP_ItmMfgInstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MGBBP_ItmMfgInstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MGBBP_ItmMfgInstReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_calc_ctg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_schd_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_schd_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_act_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_act_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MGBBP_ItmMfgInstReg p){
		p.Btn_open_MGBBP0040.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBBP0100.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBBP0120.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBBP0130.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBBP0150.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBBP0300.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBBP0320.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBBP0330.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBBP0350.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins_in_file.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_del_bulk.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_ScreenOpe(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Top(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Fold(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Tab1(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Tab2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Tab3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Tab4(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Cnd(MGBBP_ItmMfgInstReg p){
		p.Cnd_ope_Group.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_lot_no.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.Cnd_cntry_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_no_po_no_flg.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.Cnd_slo_no.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_no_slo_no_flg.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.Cnd_iv_no.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_no_iv_no_flg.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.Cnd_schd_st_dt_fr.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_schd_st_dt_to.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_schd_end_dt_fr.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_schd_end_dt_to.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_act_st_dt_fr.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_act_st_dt_to.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_act_end_dt_fr.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_act_end_dt_to.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, DEL_BULK, MCMode.ENABLE);

	}

	/**
	 * [DEL_BULK]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Cnd2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Cnd3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_DelCnd(MGBBP_ItmMfgInstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.DelCnd_calc_ctg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.DelCnd_wg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.DelCnd_mng_dpt_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_BULK]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Ctrl(MGBBP_ItmMfgInstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL_BULK, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [DEL_BULK]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Rslt(MGBBP_ItmMfgInstReg p){
		p.columnRslt_check.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_schd_st_dt.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_schd_end_dt.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_act_st_dt.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_act_end_dt.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL_BULK, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_BULK]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Btn(MGBBP_ItmMfgInstReg p){
		p.Btn_open_MGBBP0040.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_open_MGBBP0100.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_open_MGBBP0120.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_open_MGBBP0130.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_open_MGBBP0150.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_open_MGBBP0300.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_open_MGBBP0320.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_open_MGBBP0330.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_open_MGBBP0350.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_radd.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_ins_in_file.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.Btn_del_bulk.putMode(p, DEL_BULK, MCMode.ENABLE);

	}

	/**
	 * [DEL_BULK]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_EastBtn(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS_Top(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS_Fold(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab1(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab4(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MGBBP_ItmMfgInstReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_mng_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_mng_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_jnl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_jnl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_itm_mfg_inst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_mfg_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_asst_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_asst_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_lot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno4.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_no_sppl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_cntry_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_cntry_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_area_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_area_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_no_po_no_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_no_slo_no_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_no_iv_no_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_schd_st_dt_fr.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_schd_st_dt_to.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_schd_end_dt_fr.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_schd_end_dt_to.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_act_st_dt_fr.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_act_st_dt_to.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_act_end_dt_fr.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_act_end_dt_to.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
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
		p.Cnd_sppl_grp_cd1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_cd2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_cd3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_cd4.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_nm4.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_cd5.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_nm5.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_cd6.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_nm6.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_cd7.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_nm7.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_cd8.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_nm8.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_cd9.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_nm9.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_cd10.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_nm10.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_DelCnd(MGBBP_ItmMfgInstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.DelCnd_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ctrl(MGBBP_ItmMfgInstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(INS, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MGBBP_ItmMfgInstReg p){
		p.columnRslt_check.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_schd_st_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_schd_end_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_act_st_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_act_end_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MGBBP_ItmMfgInstReg p){
		p.Btn_open_MGBBP0040.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MGBBP0100.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MGBBP0120.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MGBBP0130.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MGBBP0150.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MGBBP0300.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MGBBP0320.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MGBBP0330.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MGBBP0350.putMode(p, INS, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, INS, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.DISABLE);
		p.Btn_radd.putMode(p, INS, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_ins_in_file.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins_del_in_file.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_ScreenOpe(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Top(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Fold(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Tab1(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Tab2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Tab3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Tab4(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Cnd(MGBBP_ItmMfgInstReg p){
		p.Cnd_ope_Group.putMode(p, INS_DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(INS_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(INS_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_lot_no.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, INS_DEL, MCMode.REQUIRED);
		p.Cnd_cntry_cd.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_no_po_no_flg.putMode(p, INS_DEL, MCMode.REQUIRED);
		p.Cnd_slo_no.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_no_slo_no_flg.putMode(p, INS_DEL, MCMode.REQUIRED);
		p.Cnd_iv_no.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_no_iv_no_flg.putMode(p, INS_DEL, MCMode.REQUIRED);
		p.Cnd_schd_st_dt_fr.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_schd_st_dt_to.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_schd_end_dt_fr.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_schd_end_dt_to.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_act_st_dt_fr.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_act_st_dt_to.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_act_end_dt_fr.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_act_end_dt_to.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, INS_DEL, MCMode.ENABLE);

	}

	/**
	 * [INS_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Cnd2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Cnd3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_DelCnd(MGBBP_ItmMfgInstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, INS_DEL, MCMode.REQUIRED);
		p.DelCnd_calc_ctg_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, INS_DEL, MCMode.REQUIRED);
		p.DelCnd_wg_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_cd.putMode(p, INS_DEL, MCMode.ENABLE);
		p.DelCnd_mng_dpt_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [INS_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Ctrl(MGBBP_ItmMfgInstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(INS_DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [INS_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Rslt(MGBBP_ItmMfgInstReg p){
		p.columnRslt_check.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(INS_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(INS_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_schd_st_dt.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_schd_end_dt.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_act_st_dt.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_act_end_dt.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(INS_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, INS_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [INS_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Btn(MGBBP_ItmMfgInstReg p){
		p.Btn_open_MGBBP0040.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0100.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0120.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0130.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0150.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0300.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0320.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0330.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_open_MGBBP0350.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.Btn_ins_in_file.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Btn_del.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, INS_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [INS_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_EastBtn(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab4(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MGBBP_ItmMfgInstReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mng_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_mfg_inst_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_asst_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_lot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_no_sppl_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_cntry_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_no_po_no_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_slo_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_no_slo_no_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_iv_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_no_iv_no_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_schd_st_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_schd_st_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_schd_end_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_schd_end_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_act_st_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_act_st_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_act_end_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_act_end_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd3(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DelCnd(MGBBP_ItmMfgInstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_calc_ctg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_mng_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MGBBP_ItmMfgInstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_U, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MGBBP_ItmMfgInstReg p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_schd_st_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_schd_end_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_act_st_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_act_end_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MGBBP_ItmMfgInstReg p){
		p.Btn_open_MGBBP0040.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MGBBP0100.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MGBBP0120.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MGBBP0130.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MGBBP0150.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MGBBP0300.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MGBBP0320.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MGBBP0330.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MGBBP0350.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_ins_in_file.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MGBBP_ItmMfgInstReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_REF;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MGBBP_ItmMfgInstReg_MC.setTableConfigRslt((MGBBP_ItmMfgInstReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBBP_ItmMfgInstReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_calc_ctg_cd.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.calc_ctg_cd_META);
		p.columnRslt_calc_ctg_cd.addLinkBeans(p.columnRslt_calc_ctg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_ctg_cd);
		p.columnRslt_calc_ctg_nm.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.calc_ctg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_ctg_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.wg_cd_META);
		p.columnRslt_wg_cd.addLinkBeans(p.columnRslt_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_mng_dpt_cd.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.mng_dpt_cd_META);
		p.columnRslt_mng_dpt_cd.addLinkBeans(p.columnRslt_mng_dpt_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_mng_dpt_cd);
		p.columnRslt_mng_dpt_nm.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.mng_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mng_dpt_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub1, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_itm_jnl_cd, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_itm_jnl_cd, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub3, p.columnRslt_itm_jnl_cd, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_jnl_cd, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.columnRslt_itm_jnl_cd.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.itm_jnl_cd_META);
		p.columnRslt_itm_jnl_cd.addLinkBeans(p.columnRslt_itm_jnl_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_cd);
		p.columnRslt_itm_jnl_nm.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.itm_jnl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_nm);
		p.columnRslt_itm_mfg_inst_no.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.itm_mfg_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_mfg_inst_no);
		p.columnRslt_mfg_act_no.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.mfg_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_act_no);
		p.columnRslt_lot_no.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.columnRslt_sno1.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.sno1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1);
		p.columnRslt_sno2.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.sno2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2);
		p.columnRslt_sno3.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.sno3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3);
		p.columnRslt_sno4.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.sno4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.sppl_cd_META);
		p.columnRslt_sppl_cd.setListType(MCListType.STRICT);
		p.columnRslt_sppl_cd.addLinkBeans(p.columnRslt_sppl_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_po_no.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_no);
		p.columnRslt_slo_no.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_iv_no.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_asst_typ.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.asst_typ_META);
		p.columnRslt_asst_typ.addLinkBeans(p.columnRslt_asst_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_asst_typ);
		p.columnRslt_asst_typ_nm.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.asst_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asst_typ_nm);
		p.RsltTable.addTable(p.Rslt_qty_p_PPanel.QtyTable);
		p.columnRslt_unit_cd.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_cd);
		p.columnRslt_unit_nm.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_nm);
		p.columnRslt_dec_place.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.columnRslt_schd_st_dt.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.schd_st_dt_META);
		p.columnRslt_schd_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_st_dt);
		p.columnRslt_schd_end_dt.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.schd_end_dt_META);
		p.columnRslt_schd_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_end_dt);
		p.columnRslt_act_st_dt.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.act_st_dt_META);
		p.columnRslt_act_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_act_st_dt);
		p.columnRslt_act_end_dt.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.act_end_dt_META);
		p.columnRslt_act_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_act_end_dt);
		p.columnRslt_rmrks.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMGBB.MGBBP0030.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
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
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
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
		Cnd_sppl_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd1.getListConfig().setPutter(getCnd_sppl_grp_cd1_ListPutter());
		Cnd_sppl_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd2.getListConfig().setPutter(getCnd_sppl_grp_cd2_ListPutter());
		Cnd_sppl_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd3.getListConfig().setPutter(getCnd_sppl_grp_cd3_ListPutter());
		Cnd_sppl_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd4.getListConfig().setPutter(getCnd_sppl_grp_cd4_ListPutter());
		Cnd_sppl_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd5.getListConfig().setPutter(getCnd_sppl_grp_cd5_ListPutter());
		Cnd_sppl_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd6.getListConfig().setPutter(getCnd_sppl_grp_cd6_ListPutter());
		Cnd_sppl_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd7.getListConfig().setPutter(getCnd_sppl_grp_cd7_ListPutter());
		Cnd_sppl_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd8.getListConfig().setPutter(getCnd_sppl_grp_cd8_ListPutter());
		Cnd_sppl_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd9.getListConfig().setPutter(getCnd_sppl_grp_cd9_ListPutter());
		Cnd_sppl_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd10.getListConfig().setPutter(getCnd_sppl_grp_cd10_ListPutter());
		DelCnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		DelCnd_calc_ctg_cd.getListConfig().setPutter(getDelCnd_calc_ctg_cd_ListPutter());
		DelCnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		DelCnd_wg_cd.getListConfig().setPutter(getDelCnd_wg_cd_ListPutter());
		DelCnd_mng_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		DelCnd_mng_dpt_cd.getListConfig().setPutter(getDelCnd_mng_dpt_cd_ListPutter());
		columnRslt_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_calc_ctg_cd.getListConfig().setPutter(getRslt_calc_ctg_cd_ListPutter());
		columnRslt_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_wg_cd.getListConfig().setPutter(getRslt_wg_cd_ListPutter());
		columnRslt_mng_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_mng_dpt_cd.getListConfig().setPutter(getRslt_mng_dpt_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnRslt_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_itm_jnl_cd.getListConfig().setPutter(getRslt_itm_jnl_cd_ListPutter());
		columnRslt_sppl_cd.getListConfig().setPutter(getRslt_sppl_cd_ListPutter());
		columnRslt_asst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_asst_typ.getListConfig().setPutter(getRslt_asst_typ_ListPutter());
	}

	/**
	 * この画面を[SRCH_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REFStatus() {
		status = SRCH_REF;
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
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DELStatus() {
		status = SRCH_DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_BULK]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_BULKStatus() {
		status = DEL_BULK;
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
	 * この画面を[INS_DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_DELStatus() {
		status = INS_DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (DEL_BULK.equals(status)) {
			setDEL_BULKStatus();
		}
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (INS_DEL.equals(status)) {
			setINS_DELStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
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
	 * [Cnd_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_sppl_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
		return lp;
	}
	 
	/**
	 * [DelCnd_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDelCnd_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DelCnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDelCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [DelCnd_mng_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDelCnd_mng_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Rslt_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Rslt_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Rslt_mng_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_mng_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Rslt_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
		return lp;
	}
	 
	/**
	 * [Rslt_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rslt_asst_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_asst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AsstTyp");
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
		if(combo == Cnd_itm_jnl_cd) return getCnd_itm_jnl_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_asst_typ) return getCnd_asst_typ(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
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
		if(combo == Cnd_sppl_grp_cd1) return getCnd_sppl_grp_cd1(row, info);
		if(combo == Cnd_sppl_grp_cd2) return getCnd_sppl_grp_cd2(row, info);
		if(combo == Cnd_sppl_grp_cd3) return getCnd_sppl_grp_cd3(row, info);
		if(combo == Cnd_sppl_grp_cd4) return getCnd_sppl_grp_cd4(row, info);
		if(combo == Cnd_sppl_grp_cd5) return getCnd_sppl_grp_cd5(row, info);
		if(combo == Cnd_sppl_grp_cd6) return getCnd_sppl_grp_cd6(row, info);
		if(combo == Cnd_sppl_grp_cd7) return getCnd_sppl_grp_cd7(row, info);
		if(combo == Cnd_sppl_grp_cd8) return getCnd_sppl_grp_cd8(row, info);
		if(combo == Cnd_sppl_grp_cd9) return getCnd_sppl_grp_cd9(row, info);
		if(combo == Cnd_sppl_grp_cd10) return getCnd_sppl_grp_cd10(row, info);
		if(combo == DelCnd_calc_ctg_cd) return getDelCnd_calc_ctg_cd(row, info);
		if(combo == DelCnd_wg_cd) return getDelCnd_wg_cd(row, info);
		if(combo == DelCnd_mng_dpt_cd) return getDelCnd_mng_dpt_cd(row, info);
		if(combo == columnRslt_calc_ctg_cd) return getRslt_calc_ctg_cd(row, info);
		if(combo == columnRslt_wg_cd) return getRslt_wg_cd(row, info);
		if(combo == columnRslt_mng_dpt_cd) return getRslt_mng_dpt_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_cd) return getRslt_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub1) return getRslt_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub2) return getRslt_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub3) return getRslt_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnRslt_itm_jnl_cd) return getRslt_itm_jnl_cd(row, info);
		if(combo == columnRslt_sppl_cd) return getRslt_sppl_cd(row, info);
		if(combo == columnRslt_asst_typ) return getRslt_asst_typ(row, info);
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
		else if (ap == Btn_open_MGBBP0040) doBtn_open_MGBBP0040(info);
		else if (ap == Btn_open_MGBBP0100) doBtn_open_MGBBP0100(info);
		else if (ap == Btn_open_MGBBP0120) doBtn_open_MGBBP0120(info);
		else if (ap == Btn_open_MGBBP0130) doBtn_open_MGBBP0130(info);
		else if (ap == Btn_open_MGBBP0150) doBtn_open_MGBBP0150(info);
		else if (ap == Btn_open_MGBBP0300) doBtn_open_MGBBP0300(info);
		else if (ap == Btn_open_MGBBP0320) doBtn_open_MGBBP0320(info);
		else if (ap == Btn_open_MGBBP0330) doBtn_open_MGBBP0330(info);
		else if (ap == Btn_open_MGBBP0350) doBtn_open_MGBBP0350(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_ins_in_file) doBtn_ins_in_file(info);
		else if (ap == Btn_ins_del_in_file) doBtn_ins_del_in_file(info);
		else if (ap == Btn_del) doBtn_del(info);
		else if (ap == Btn_del_bulk) doBtn_del_bulk(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0040]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0040(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0100]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0100(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0120(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0130]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0130(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0150]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0150(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0300]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0300(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0320]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0320(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0330]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0330(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBBP0350]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBBP0350(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins_in_file]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins_in_file(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins_del_in_file]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins_del_in_file(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_bulk]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_bulk(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_mng_dpt_cd) return doCnd_mng_dpt_cd_VC(info);
		if (vc == Cnd_mng_dpt_nm) return doCnd_mng_dpt_nm_VC(info);
		if (vc == Cnd_itm_jnl_cd) return doCnd_itm_jnl_cd_VC(info);
		if (vc == Cnd_itm_jnl_nm) return doCnd_itm_jnl_nm_VC(info);
		if (vc == Cnd_itm_mfg_inst_no) return doCnd_itm_mfg_inst_no_VC(info);
		if (vc == Cnd_mfg_act_no) return doCnd_mfg_act_no_VC(info);
		if (vc == Cnd_asst_typ) return doCnd_asst_typ_VC(info);
		if (vc == Cnd_asst_typ_nm) return doCnd_asst_typ_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_sno1) return doCnd_sno1_VC(info);
		if (vc == Cnd_sno2) return doCnd_sno2_VC(info);
		if (vc == Cnd_sno3) return doCnd_sno3_VC(info);
		if (vc == Cnd_sno4) return doCnd_sno4_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_no_sppl_flg) return doCnd_no_sppl_flg_VC(info);
		if (vc == Cnd_cntry_cd) return doCnd_cntry_cd_VC(info);
		if (vc == Cnd_cntry_nm) return doCnd_cntry_nm_VC(info);
		if (vc == Cnd_area_cd) return doCnd_area_cd_VC(info);
		if (vc == Cnd_area_nm) return doCnd_area_nm_VC(info);
		if (vc == Cnd_po_no) return doCnd_po_no_VC(info);
		if (vc == Cnd_no_po_no_flg) return doCnd_no_po_no_flg_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_no_slo_no_flg) return doCnd_no_slo_no_flg_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_no_iv_no_flg) return doCnd_no_iv_no_flg_VC(info);
		if (vc == Cnd_schd_st_dt_fr) return doCnd_schd_st_dt_fr_VC(info);
		if (vc == Cnd_schd_st_dt_to) return doCnd_schd_st_dt_to_VC(info);
		if (vc == Cnd_schd_end_dt_fr) return doCnd_schd_end_dt_fr_VC(info);
		if (vc == Cnd_schd_end_dt_to) return doCnd_schd_end_dt_to_VC(info);
		if (vc == Cnd_act_st_dt_fr) return doCnd_act_st_dt_fr_VC(info);
		if (vc == Cnd_act_st_dt_to) return doCnd_act_st_dt_to_VC(info);
		if (vc == Cnd_act_end_dt_fr) return doCnd_act_end_dt_fr_VC(info);
		if (vc == Cnd_act_end_dt_to) return doCnd_act_end_dt_to_VC(info);
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
		if (vc == Cnd_sppl_grp_cd1) return doCnd_sppl_grp_cd1_VC(info);
		if (vc == Cnd_sppl_grp_nm1) return doCnd_sppl_grp_nm1_VC(info);
		if (vc == Cnd_sppl_grp_cd2) return doCnd_sppl_grp_cd2_VC(info);
		if (vc == Cnd_sppl_grp_nm2) return doCnd_sppl_grp_nm2_VC(info);
		if (vc == Cnd_sppl_grp_cd3) return doCnd_sppl_grp_cd3_VC(info);
		if (vc == Cnd_sppl_grp_nm3) return doCnd_sppl_grp_nm3_VC(info);
		if (vc == Cnd_sppl_grp_cd4) return doCnd_sppl_grp_cd4_VC(info);
		if (vc == Cnd_sppl_grp_nm4) return doCnd_sppl_grp_nm4_VC(info);
		if (vc == Cnd_sppl_grp_cd5) return doCnd_sppl_grp_cd5_VC(info);
		if (vc == Cnd_sppl_grp_nm5) return doCnd_sppl_grp_nm5_VC(info);
		if (vc == Cnd_sppl_grp_cd6) return doCnd_sppl_grp_cd6_VC(info);
		if (vc == Cnd_sppl_grp_nm6) return doCnd_sppl_grp_nm6_VC(info);
		if (vc == Cnd_sppl_grp_cd7) return doCnd_sppl_grp_cd7_VC(info);
		if (vc == Cnd_sppl_grp_nm7) return doCnd_sppl_grp_nm7_VC(info);
		if (vc == Cnd_sppl_grp_cd8) return doCnd_sppl_grp_cd8_VC(info);
		if (vc == Cnd_sppl_grp_nm8) return doCnd_sppl_grp_nm8_VC(info);
		if (vc == Cnd_sppl_grp_cd9) return doCnd_sppl_grp_cd9_VC(info);
		if (vc == Cnd_sppl_grp_nm9) return doCnd_sppl_grp_nm9_VC(info);
		if (vc == Cnd_sppl_grp_cd10) return doCnd_sppl_grp_cd10_VC(info);
		if (vc == Cnd_sppl_grp_nm10) return doCnd_sppl_grp_nm10_VC(info);
		if (vc == DelCnd_calc_ctg_cd) return doDelCnd_calc_ctg_cd_VC(info);
		if (vc == DelCnd_calc_ctg_nm) return doDelCnd_calc_ctg_nm_VC(info);
		if (vc == DelCnd_wg_cd) return doDelCnd_wg_cd_VC(info);
		if (vc == DelCnd_wg_nm) return doDelCnd_wg_nm_VC(info);
		if (vc == DelCnd_mng_dpt_cd) return doDelCnd_mng_dpt_cd_VC(info);
		if (vc == DelCnd_mng_dpt_nm) return doDelCnd_mng_dpt_nm_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_calc_ctg_cd) return doRslt_calc_ctg_cd_VC(info);
		if (vc == columnRslt_calc_ctg_nm) return doRslt_calc_ctg_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_mng_dpt_cd) return doRslt_mng_dpt_cd_VC(info);
		if (vc == columnRslt_mng_dpt_nm) return doRslt_mng_dpt_nm_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_itm_jnl_cd) return doRslt_itm_jnl_cd_VC(info);
		if (vc == columnRslt_itm_jnl_nm) return doRslt_itm_jnl_nm_VC(info);
		if (vc == columnRslt_itm_mfg_inst_no) return doRslt_itm_mfg_inst_no_VC(info);
		if (vc == columnRslt_mfg_act_no) return doRslt_mfg_act_no_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_sno1) return doRslt_sno1_VC(info);
		if (vc == columnRslt_sno2) return doRslt_sno2_VC(info);
		if (vc == columnRslt_sno3) return doRslt_sno3_VC(info);
		if (vc == columnRslt_sno4) return doRslt_sno4_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_po_no) return doRslt_po_no_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_asst_typ) return doRslt_asst_typ_VC(info);
		if (vc == columnRslt_asst_typ_nm) return doRslt_asst_typ_nm_VC(info);
		if (vc == columnRslt_unit_cd) return doRslt_unit_cd_VC(info);
		if (vc == columnRslt_unit_nm) return doRslt_unit_nm_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_schd_st_dt) return doRslt_schd_st_dt_VC(info);
		if (vc == columnRslt_schd_end_dt) return doRslt_schd_end_dt_VC(info);
		if (vc == columnRslt_act_st_dt) return doRslt_act_st_dt_VC(info);
		if (vc == columnRslt_act_end_dt) return doRslt_act_end_dt_VC(info);
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
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_sppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_sppl_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_po_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_po_no_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_st_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_st_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_st_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_st_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_end_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_end_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_end_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_end_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_st_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_st_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_st_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_st_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_end_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_end_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_end_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_end_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[mng_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_mng_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[mng_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_mng_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_act_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_end_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
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
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NC(info);
		else if (nc == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NC(info);
		else if (nc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NC(info);
		else if (nc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NC(info);
		else if (nc == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NC(info);
		else if (nc == Cnd_mfg_act_no) doCnd_mfg_act_no_NC(info);
		else if (nc == Cnd_asst_typ) doCnd_asst_typ_NC(info);
		else if (nc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_sno1) doCnd_sno1_NC(info);
		else if (nc == Cnd_sno2) doCnd_sno2_NC(info);
		else if (nc == Cnd_sno3) doCnd_sno3_NC(info);
		else if (nc == Cnd_sno4) doCnd_sno4_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_no_sppl_flg) doCnd_no_sppl_flg_NC(info);
		else if (nc == Cnd_cntry_cd) doCnd_cntry_cd_NC(info);
		else if (nc == Cnd_cntry_nm) doCnd_cntry_nm_NC(info);
		else if (nc == Cnd_area_cd) doCnd_area_cd_NC(info);
		else if (nc == Cnd_area_nm) doCnd_area_nm_NC(info);
		else if (nc == Cnd_po_no) doCnd_po_no_NC(info);
		else if (nc == Cnd_no_po_no_flg) doCnd_no_po_no_flg_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_no_slo_no_flg) doCnd_no_slo_no_flg_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_no_iv_no_flg) doCnd_no_iv_no_flg_NC(info);
		else if (nc == Cnd_schd_st_dt_fr) doCnd_schd_st_dt_fr_NC(info);
		else if (nc == Cnd_schd_st_dt_to) doCnd_schd_st_dt_to_NC(info);
		else if (nc == Cnd_schd_end_dt_fr) doCnd_schd_end_dt_fr_NC(info);
		else if (nc == Cnd_schd_end_dt_to) doCnd_schd_end_dt_to_NC(info);
		else if (nc == Cnd_act_st_dt_fr) doCnd_act_st_dt_fr_NC(info);
		else if (nc == Cnd_act_st_dt_to) doCnd_act_st_dt_to_NC(info);
		else if (nc == Cnd_act_end_dt_fr) doCnd_act_end_dt_fr_NC(info);
		else if (nc == Cnd_act_end_dt_to) doCnd_act_end_dt_to_NC(info);
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
		else if (nc == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_NC(info);
		else if (nc == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_NC(info);
		else if (nc == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_NC(info);
		else if (nc == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_NC(info);
		else if (nc == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_NC(info);
		else if (nc == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_NC(info);
		else if (nc == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_NC(info);
		else if (nc == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_NC(info);
		else if (nc == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_NC(info);
		else if (nc == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_NC(info);
		else if (nc == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_NC(info);
		else if (nc == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_NC(info);
		else if (nc == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_NC(info);
		else if (nc == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_NC(info);
		else if (nc == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_NC(info);
		else if (nc == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_NC(info);
		else if (nc == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_NC(info);
		else if (nc == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_NC(info);
		else if (nc == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_NC(info);
		else if (nc == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_NC(info);
		else if (nc == DelCnd_calc_ctg_cd) doDelCnd_calc_ctg_cd_NC(info);
		else if (nc == DelCnd_calc_ctg_nm) doDelCnd_calc_ctg_nm_NC(info);
		else if (nc == DelCnd_wg_cd) doDelCnd_wg_cd_NC(info);
		else if (nc == DelCnd_wg_nm) doDelCnd_wg_nm_NC(info);
		else if (nc == DelCnd_mng_dpt_cd) doDelCnd_mng_dpt_cd_NC(info);
		else if (nc == DelCnd_mng_dpt_nm) doDelCnd_mng_dpt_nm_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NC(info);
		else if (nc == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_mng_dpt_cd) doRslt_mng_dpt_cd_NC(info);
		else if (nc == columnRslt_mng_dpt_nm) doRslt_mng_dpt_nm_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NC(info);
		else if (nc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NC(info);
		else if (nc == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NC(info);
		else if (nc == columnRslt_mfg_act_no) doRslt_mfg_act_no_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_sno1) doRslt_sno1_NC(info);
		else if (nc == columnRslt_sno2) doRslt_sno2_NC(info);
		else if (nc == columnRslt_sno3) doRslt_sno3_NC(info);
		else if (nc == columnRslt_sno4) doRslt_sno4_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_po_no) doRslt_po_no_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_asst_typ) doRslt_asst_typ_NC(info);
		else if (nc == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NC(info);
		else if (nc == columnRslt_unit_cd) doRslt_unit_cd_NC(info);
		else if (nc == columnRslt_unit_nm) doRslt_unit_nm_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_schd_st_dt) doRslt_schd_st_dt_NC(info);
		else if (nc == columnRslt_schd_end_dt) doRslt_schd_end_dt_NC(info);
		else if (nc == columnRslt_act_st_dt) doRslt_act_st_dt_NC(info);
		else if (nc == columnRslt_act_end_dt) doRslt_act_end_dt_NC(info);
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
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
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
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_sppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_sppl_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_po_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_po_no_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_st_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_st_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_st_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_st_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_end_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_end_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_end_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_end_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_st_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_st_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_st_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_st_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_end_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_end_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_end_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_end_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[mng_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_mng_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[mng_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_mng_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_end_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NE(info);
		else if (ne == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NE(info);
		else if (ne == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NE(info);
		else if (ne == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NE(info);
		else if (ne == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NE(info);
		else if (ne == Cnd_mfg_act_no) doCnd_mfg_act_no_NE(info);
		else if (ne == Cnd_asst_typ) doCnd_asst_typ_NE(info);
		else if (ne == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_sno1) doCnd_sno1_NE(info);
		else if (ne == Cnd_sno2) doCnd_sno2_NE(info);
		else if (ne == Cnd_sno3) doCnd_sno3_NE(info);
		else if (ne == Cnd_sno4) doCnd_sno4_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_no_sppl_flg) doCnd_no_sppl_flg_NE(info);
		else if (ne == Cnd_cntry_cd) doCnd_cntry_cd_NE(info);
		else if (ne == Cnd_cntry_nm) doCnd_cntry_nm_NE(info);
		else if (ne == Cnd_area_cd) doCnd_area_cd_NE(info);
		else if (ne == Cnd_area_nm) doCnd_area_nm_NE(info);
		else if (ne == Cnd_po_no) doCnd_po_no_NE(info);
		else if (ne == Cnd_no_po_no_flg) doCnd_no_po_no_flg_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_no_slo_no_flg) doCnd_no_slo_no_flg_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_no_iv_no_flg) doCnd_no_iv_no_flg_NE(info);
		else if (ne == Cnd_schd_st_dt_fr) doCnd_schd_st_dt_fr_NE(info);
		else if (ne == Cnd_schd_st_dt_to) doCnd_schd_st_dt_to_NE(info);
		else if (ne == Cnd_schd_end_dt_fr) doCnd_schd_end_dt_fr_NE(info);
		else if (ne == Cnd_schd_end_dt_to) doCnd_schd_end_dt_to_NE(info);
		else if (ne == Cnd_act_st_dt_fr) doCnd_act_st_dt_fr_NE(info);
		else if (ne == Cnd_act_st_dt_to) doCnd_act_st_dt_to_NE(info);
		else if (ne == Cnd_act_end_dt_fr) doCnd_act_end_dt_fr_NE(info);
		else if (ne == Cnd_act_end_dt_to) doCnd_act_end_dt_to_NE(info);
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
		else if (ne == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_NE(info);
		else if (ne == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_NE(info);
		else if (ne == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_NE(info);
		else if (ne == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_NE(info);
		else if (ne == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_NE(info);
		else if (ne == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_NE(info);
		else if (ne == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_NE(info);
		else if (ne == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_NE(info);
		else if (ne == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_NE(info);
		else if (ne == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_NE(info);
		else if (ne == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_NE(info);
		else if (ne == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_NE(info);
		else if (ne == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_NE(info);
		else if (ne == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_NE(info);
		else if (ne == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_NE(info);
		else if (ne == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_NE(info);
		else if (ne == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_NE(info);
		else if (ne == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_NE(info);
		else if (ne == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_NE(info);
		else if (ne == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_NE(info);
		else if (ne == DelCnd_calc_ctg_cd) doDelCnd_calc_ctg_cd_NE(info);
		else if (ne == DelCnd_calc_ctg_nm) doDelCnd_calc_ctg_nm_NE(info);
		else if (ne == DelCnd_wg_cd) doDelCnd_wg_cd_NE(info);
		else if (ne == DelCnd_wg_nm) doDelCnd_wg_nm_NE(info);
		else if (ne == DelCnd_mng_dpt_cd) doDelCnd_mng_dpt_cd_NE(info);
		else if (ne == DelCnd_mng_dpt_nm) doDelCnd_mng_dpt_nm_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NE(info);
		else if (ne == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_mng_dpt_cd) doRslt_mng_dpt_cd_NE(info);
		else if (ne == columnRslt_mng_dpt_nm) doRslt_mng_dpt_nm_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NE(info);
		else if (ne == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NE(info);
		else if (ne == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NE(info);
		else if (ne == columnRslt_mfg_act_no) doRslt_mfg_act_no_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_sno1) doRslt_sno1_NE(info);
		else if (ne == columnRslt_sno2) doRslt_sno2_NE(info);
		else if (ne == columnRslt_sno3) doRslt_sno3_NE(info);
		else if (ne == columnRslt_sno4) doRslt_sno4_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_po_no) doRslt_po_no_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_asst_typ) doRslt_asst_typ_NE(info);
		else if (ne == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NE(info);
		else if (ne == columnRslt_unit_cd) doRslt_unit_cd_NE(info);
		else if (ne == columnRslt_unit_nm) doRslt_unit_nm_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_schd_st_dt) doRslt_schd_st_dt_NE(info);
		else if (ne == columnRslt_schd_end_dt) doRslt_schd_end_dt_NE(info);
		else if (ne == columnRslt_act_st_dt) doRslt_act_st_dt_NE(info);
		else if (ne == columnRslt_act_end_dt) doRslt_act_end_dt_NE(info);
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
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
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
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_sppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_sppl_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_po_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_po_no_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_st_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_st_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_st_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_st_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_end_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_end_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_end_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_end_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_st_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_st_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_st_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_st_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_end_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_end_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_end_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_end_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[mng_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_mng_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[mng_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_mng_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_end_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NX(info);
		else if (nx == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NX(info);
		else if (nx == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NX(info);
		else if (nx == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NX(info);
		else if (nx == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NX(info);
		else if (nx == Cnd_mfg_act_no) doCnd_mfg_act_no_NX(info);
		else if (nx == Cnd_asst_typ) doCnd_asst_typ_NX(info);
		else if (nx == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_sno1) doCnd_sno1_NX(info);
		else if (nx == Cnd_sno2) doCnd_sno2_NX(info);
		else if (nx == Cnd_sno3) doCnd_sno3_NX(info);
		else if (nx == Cnd_sno4) doCnd_sno4_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_no_sppl_flg) doCnd_no_sppl_flg_NX(info);
		else if (nx == Cnd_cntry_cd) doCnd_cntry_cd_NX(info);
		else if (nx == Cnd_cntry_nm) doCnd_cntry_nm_NX(info);
		else if (nx == Cnd_area_cd) doCnd_area_cd_NX(info);
		else if (nx == Cnd_area_nm) doCnd_area_nm_NX(info);
		else if (nx == Cnd_po_no) doCnd_po_no_NX(info);
		else if (nx == Cnd_no_po_no_flg) doCnd_no_po_no_flg_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_no_slo_no_flg) doCnd_no_slo_no_flg_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_no_iv_no_flg) doCnd_no_iv_no_flg_NX(info);
		else if (nx == Cnd_schd_st_dt_fr) doCnd_schd_st_dt_fr_NX(info);
		else if (nx == Cnd_schd_st_dt_to) doCnd_schd_st_dt_to_NX(info);
		else if (nx == Cnd_schd_end_dt_fr) doCnd_schd_end_dt_fr_NX(info);
		else if (nx == Cnd_schd_end_dt_to) doCnd_schd_end_dt_to_NX(info);
		else if (nx == Cnd_act_st_dt_fr) doCnd_act_st_dt_fr_NX(info);
		else if (nx == Cnd_act_st_dt_to) doCnd_act_st_dt_to_NX(info);
		else if (nx == Cnd_act_end_dt_fr) doCnd_act_end_dt_fr_NX(info);
		else if (nx == Cnd_act_end_dt_to) doCnd_act_end_dt_to_NX(info);
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
		else if (nx == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_NX(info);
		else if (nx == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_NX(info);
		else if (nx == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_NX(info);
		else if (nx == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_NX(info);
		else if (nx == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_NX(info);
		else if (nx == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_NX(info);
		else if (nx == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_NX(info);
		else if (nx == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_NX(info);
		else if (nx == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_NX(info);
		else if (nx == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_NX(info);
		else if (nx == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_NX(info);
		else if (nx == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_NX(info);
		else if (nx == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_NX(info);
		else if (nx == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_NX(info);
		else if (nx == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_NX(info);
		else if (nx == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_NX(info);
		else if (nx == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_NX(info);
		else if (nx == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_NX(info);
		else if (nx == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_NX(info);
		else if (nx == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_NX(info);
		else if (nx == DelCnd_calc_ctg_cd) doDelCnd_calc_ctg_cd_NX(info);
		else if (nx == DelCnd_calc_ctg_nm) doDelCnd_calc_ctg_nm_NX(info);
		else if (nx == DelCnd_wg_cd) doDelCnd_wg_cd_NX(info);
		else if (nx == DelCnd_wg_nm) doDelCnd_wg_nm_NX(info);
		else if (nx == DelCnd_mng_dpt_cd) doDelCnd_mng_dpt_cd_NX(info);
		else if (nx == DelCnd_mng_dpt_nm) doDelCnd_mng_dpt_nm_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NX(info);
		else if (nx == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_mng_dpt_cd) doRslt_mng_dpt_cd_NX(info);
		else if (nx == columnRslt_mng_dpt_nm) doRslt_mng_dpt_nm_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NX(info);
		else if (nx == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NX(info);
		else if (nx == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NX(info);
		else if (nx == columnRslt_mfg_act_no) doRslt_mfg_act_no_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_sno1) doRslt_sno1_NX(info);
		else if (nx == columnRslt_sno2) doRslt_sno2_NX(info);
		else if (nx == columnRslt_sno3) doRslt_sno3_NX(info);
		else if (nx == columnRslt_sno4) doRslt_sno4_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_po_no) doRslt_po_no_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_asst_typ) doRslt_asst_typ_NX(info);
		else if (nx == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NX(info);
		else if (nx == columnRslt_unit_cd) doRslt_unit_cd_NX(info);
		else if (nx == columnRslt_unit_nm) doRslt_unit_nm_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_schd_st_dt) doRslt_schd_st_dt_NX(info);
		else if (nx == columnRslt_schd_end_dt) doRslt_schd_end_dt_NX(info);
		else if (nx == columnRslt_act_st_dt) doRslt_act_st_dt_NX(info);
		else if (nx == columnRslt_act_end_dt) doRslt_act_end_dt_NX(info);
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
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
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
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_sppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_sppl_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_po_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_po_no_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_st_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_st_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_st_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_st_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_end_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_end_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_end_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_end_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_st_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_st_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_st_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_st_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_end_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_end_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_end_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_end_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[mng_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_mng_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[mng_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_mng_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_end_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
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
		else if (lc == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_LC(info);
		else if (lc == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_LC(info);
		else if (lc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_LC(info);
		else if (lc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_LC(info);
		else if (lc == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_LC(info);
		else if (lc == Cnd_mfg_act_no) doCnd_mfg_act_no_LC(info);
		else if (lc == Cnd_asst_typ) doCnd_asst_typ_LC(info);
		else if (lc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_sno1) doCnd_sno1_LC(info);
		else if (lc == Cnd_sno2) doCnd_sno2_LC(info);
		else if (lc == Cnd_sno3) doCnd_sno3_LC(info);
		else if (lc == Cnd_sno4) doCnd_sno4_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_cntry_cd) doCnd_cntry_cd_LC(info);
		else if (lc == Cnd_cntry_nm) doCnd_cntry_nm_LC(info);
		else if (lc == Cnd_area_cd) doCnd_area_cd_LC(info);
		else if (lc == Cnd_area_nm) doCnd_area_nm_LC(info);
		else if (lc == Cnd_po_no) doCnd_po_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_schd_st_dt_fr) doCnd_schd_st_dt_fr_LC(info);
		else if (lc == Cnd_schd_st_dt_to) doCnd_schd_st_dt_to_LC(info);
		else if (lc == Cnd_schd_end_dt_fr) doCnd_schd_end_dt_fr_LC(info);
		else if (lc == Cnd_schd_end_dt_to) doCnd_schd_end_dt_to_LC(info);
		else if (lc == Cnd_act_st_dt_fr) doCnd_act_st_dt_fr_LC(info);
		else if (lc == Cnd_act_st_dt_to) doCnd_act_st_dt_to_LC(info);
		else if (lc == Cnd_act_end_dt_fr) doCnd_act_end_dt_fr_LC(info);
		else if (lc == Cnd_act_end_dt_to) doCnd_act_end_dt_to_LC(info);
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
		else if (lc == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_LC(info);
		else if (lc == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_LC(info);
		else if (lc == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_LC(info);
		else if (lc == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_LC(info);
		else if (lc == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_LC(info);
		else if (lc == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_LC(info);
		else if (lc == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_LC(info);
		else if (lc == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_LC(info);
		else if (lc == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_LC(info);
		else if (lc == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_LC(info);
		else if (lc == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_LC(info);
		else if (lc == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_LC(info);
		else if (lc == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_LC(info);
		else if (lc == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_LC(info);
		else if (lc == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_LC(info);
		else if (lc == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_LC(info);
		else if (lc == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_LC(info);
		else if (lc == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_LC(info);
		else if (lc == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_LC(info);
		else if (lc == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_LC(info);
		else if (lc == DelCnd_calc_ctg_cd) doDelCnd_calc_ctg_cd_LC(info);
		else if (lc == DelCnd_calc_ctg_nm) doDelCnd_calc_ctg_nm_LC(info);
		else if (lc == DelCnd_wg_cd) doDelCnd_wg_cd_LC(info);
		else if (lc == DelCnd_wg_nm) doDelCnd_wg_nm_LC(info);
		else if (lc == DelCnd_mng_dpt_cd) doDelCnd_mng_dpt_cd_LC(info);
		else if (lc == DelCnd_mng_dpt_nm) doDelCnd_mng_dpt_nm_LC(info);
		else if (lc == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_LC(info);
		else if (lc == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_mng_dpt_cd) doRslt_mng_dpt_cd_LC(info);
		else if (lc == columnRslt_mng_dpt_nm) doRslt_mng_dpt_nm_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_LC(info);
		else if (lc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_LC(info);
		else if (lc == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_LC(info);
		else if (lc == columnRslt_mfg_act_no) doRslt_mfg_act_no_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_sno1) doRslt_sno1_LC(info);
		else if (lc == columnRslt_sno2) doRslt_sno2_LC(info);
		else if (lc == columnRslt_sno3) doRslt_sno3_LC(info);
		else if (lc == columnRslt_sno4) doRslt_sno4_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_po_no) doRslt_po_no_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_asst_typ) doRslt_asst_typ_LC(info);
		else if (lc == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_LC(info);
		else if (lc == columnRslt_unit_cd) doRslt_unit_cd_LC(info);
		else if (lc == columnRslt_unit_nm) doRslt_unit_nm_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_schd_st_dt) doRslt_schd_st_dt_LC(info);
		else if (lc == columnRslt_schd_end_dt) doRslt_schd_end_dt_LC(info);
		else if (lc == columnRslt_act_st_dt) doRslt_act_st_dt_LC(info);
		else if (lc == columnRslt_act_end_dt) doRslt_act_end_dt_LC(info);
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
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
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
	 * [Cnd]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_st_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_st_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_st_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_st_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_end_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_end_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_end_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_end_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_st_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_st_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_st_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_st_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_end_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_end_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_end_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_end_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[mng_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_mng_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[mng_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_mng_dpt_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_end_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[DelCnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getDelCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[DelCnd_wg_cd]の作成メソッド
	 */
	public MCList getDelCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[DelCnd_mng_dpt_cd]の作成メソッド
	 */
	public MCList getDelCnd_mng_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_calc_ctg_cd]の作成メソッド
	 */
	public MCList getRslt_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_wg_cd]の作成メソッド
	 */
	public MCList getRslt_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_mng_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_mng_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_itm_jnl_cd]の作成メソッド
	 */
	public MCList getRslt_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_sppl_cd]の作成メソッド
	 */
	public MCList getRslt_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_asst_typ]の作成メソッド
	 */
	public MCList getRslt_asst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAsstTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBBL0030.Srch01")) {
			return new MG_MGBBL0030_Srch01Bridge();
		}
		if (id.equals("MG.MGBBL0030.Upd01")) {
			return new MG_MGBBL0030_Upd01Bridge();
		}
		if (id.equals("MG.MGBBL0030.Del01")) {
			return new MG_MGBBL0030_Del01Bridge();
		}
		if (id.equals("MG.MGBBL0030.Del02")) {
			return new MG_MGBBL0030_Del02Bridge();
		}
		if (id.equals("MG.MGBBL0030.Imp01")) {
			return new MG_MGBBL0030_Imp01Bridge();
		}
		if (id.equals("MG.MGBBL0030.Ins01")) {
			return new MG_MGBBL0030_Ins01Bridge();
		}
		if (id.equals("MG.MGBBL0030.Ins02")) {
			return new MG_MGBBL0030_Ins02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBBL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0030_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0030_Srch01;

		/** コンストラクタ */
		protected MG_MGBBL0030_Srch01Bridge() {
			p_MG_MGBBL0030_Srch01 = new MCParam(PDef.MG_MGBBL0030_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0030_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0030.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0030.RsltR.class));

			p_MG_MGBBL0030_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0030_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0030_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0030_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0030_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0030.CndR up0() {
			return (mcframe.clientMGBB.MGBBP0030.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0030.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0030_Srch01.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0030_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0030.RsltR>)p_MG_MGBBL0030_Srch01.getContainerParam().getDownBlock(0));
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
	/**
	 * [MG_MGBBL0030_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0030_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0030_Upd01;

		/** コンストラクタ */
		protected MG_MGBBL0030_Upd01Bridge() {
			p_MG_MGBBL0030_Upd01 = new MCParam(PDef.MG_MGBBL0030_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0030_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0030.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0030.RsltR.class));

			p_MG_MGBBL0030_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0030_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0030_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0030_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0030_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0030.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0030.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0030.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0030_Upd01.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0030_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0030.RsltR>)p_MG_MGBBL0030_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MG_MGBBL0030_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0030_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0030_Del01;

		/** コンストラクタ */
		protected MG_MGBBL0030_Del01Bridge() {
			p_MG_MGBBL0030_Del01 = new MCParam(PDef.MG_MGBBL0030_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0030_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0030.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0030.RsltR.class));

			p_MG_MGBBL0030_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0030_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0030_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0030_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0030_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0030.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0030.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0030.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0030_Del01.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0030_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0030.RsltR>)p_MG_MGBBL0030_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MG_MGBBL0030_Del02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0030_Del02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0030_Del02;

		/** コンストラクタ */
		protected MG_MGBBL0030_Del02Bridge() {
			p_MG_MGBBL0030_Del02 = new MCParam(PDef.MG_MGBBL0030_Del02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0030_Del02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0030.DelCndR.create());
			// Down

			p_MG_MGBBL0030_Del02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0030_Del02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0030_Del02.addUpBlock(getDelCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0030_Del02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0030_Del02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0030.DelCndR up0() {
			return (mcframe.clientMGBB.MGBBP0030.DelCndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBBL0030_Del02;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDelCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBBL0030_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0030_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0030_Imp01;

		/** コンストラクタ */
		protected MG_MGBBL0030_Imp01Bridge() {
			p_MG_MGBBL0030_Imp01 = new MCParam(PDef.MG_MGBBL0030_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0030_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0030.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0030.RsltR.class));

			p_MG_MGBBL0030_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0030_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0030_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0030_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0030_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0030.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0030.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBB.MGBBP0030.RsltR> down0() {
			return (MCList<mcframe.clientMGBB.MGBBP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBBL0030_Imp01.addDownBlock(MCList.create(mcframe.clientMGBB.MGBBP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBBL0030_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBB.MGBBP0030.RsltR>)p_MG_MGBBL0030_Imp01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MG_MGBBL0030_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0030_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0030_Ins01;

		/** コンストラクタ */
		protected MG_MGBBL0030_Ins01Bridge() {
			p_MG_MGBBL0030_Ins01 = new MCParam(PDef.MG_MGBBL0030_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0030_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0030.RsltR.class));
			// Down

			p_MG_MGBBL0030_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0030_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0030_Ins01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0030_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0030_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBB.MGBBP0030.RsltR> up0() {
			return (MCList<mcframe.clientMGBB.MGBBP0030.RsltR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBBL0030_Ins01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBBL0030_Ins02]の定型処理のInnerClass
	 */
	protected class MG_MGBBL0030_Ins02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBBL0030_Ins02;

		/** コンストラクタ */
		protected MG_MGBBL0030_Ins02Bridge() {
			p_MG_MGBBL0030_Ins02 = new MCParam(PDef.MG_MGBBL0030_Ins02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBBL0030_Ins02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBB.MGBBP0030.DelCndR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBB.MGBBP0030.RsltR.class));
			// Down

			p_MG_MGBBL0030_Ins02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBBL0030_Ins02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBBL0030_Ins02.addUpBlock(getDelCndR());
			p_MG_MGBBL0030_Ins02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBBL0030_Ins02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBBL0030_Ins02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBB.MGBBP0030.DelCndR up0() {
			return (mcframe.clientMGBB.MGBBP0030.DelCndR)up(0);
		}
		protected MCList<mcframe.clientMGBB.MGBBP0030.RsltR> up1() {
			return (MCList<mcframe.clientMGBB.MGBBP0030.RsltR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBBL0030_Ins02;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDelCndR());
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}