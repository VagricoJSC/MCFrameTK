package mcframe.clientMGBD.MGBDP0250;

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
import mcframe.clientMGBD.MGBDP0250.MGBDP_PreAlcChk_MC.MG_MGBDL0250_Srch01Caller;

/**
 * 画面"MGBDP_PreAlcChk"パネルクラスです。<p>
 *
 * 一次配賦計算結果を照合します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_PreAlcChk_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBDP0250";

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
	// [Tab5]ブロック関連のField定義
	public MCPanel Tab5Panel = null;
	// [Tab5]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * DEST,View allocation destination,1;SRC,View allocation source,2 DEST,配賦先を参照する,1;SRC,配賦元を参照する,2.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_DEST = null;
	public MCRadioButton Cnd_ope_SRC = null;
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
	public MCLabel Cnd_itm_mfg_inst_no_Label = null;
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_itm_mfg_inst_no = null;
	public MCLabel Cnd_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_iv_no = null;
	public MCLabel Cnd_po_no_Label = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_no = null;
	public MCLabel Cnd_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_no = null;
	public MCLabel Cnd_src_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_src_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_src_wg_nm = null;
	public MCLabel Cnd_src_alc_ac_cd_Label = null;
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_src_alc_ac_cd = null;
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public MCTextField Cnd_src_alc_ac_nm = null;
	public MCLabel Cnd_src_alc_ac_grp_cd1_Label = null;
	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_src_alc_ac_grp_cd1 = null;
	/**
	 * Allocation account group name 1 配賦科目グループ名１.<p>
	 *
	 */
	public MCTextField Cnd_src_alc_ac_grp_nm1 = null;
	public MCLabel Cnd_src_alc_ac_grp_cd2_Label = null;
	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_src_alc_ac_grp_cd2 = null;
	/**
	 * Allocation account group name 2 配賦科目グループ名２.<p>
	 *
	 */
	public MCTextField Cnd_src_alc_ac_grp_nm2 = null;
	public MCLabel Cnd_src_alc_ac_grp_cd3_Label = null;
	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_src_alc_ac_grp_cd3 = null;
	/**
	 * Allocation account group name 3 配賦科目グループ名３.<p>
	 *
	 */
	public MCTextField Cnd_src_alc_ac_grp_nm3 = null;
	public MCLabel Cnd_dest_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_dest_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_dest_wg_nm = null;
	public MCLabel Cnd_dest_alc_ac_cd_Label = null;
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_dest_alc_ac_cd = null;
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public MCTextField Cnd_dest_alc_ac_nm = null;
	public MCLabel Cnd_dest_alc_ac_grp_cd1_Label = null;
	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_dest_alc_ac_grp_cd1 = null;
	/**
	 * Allocation account group name 1 配賦科目グループ名１.<p>
	 *
	 */
	public MCTextField Cnd_dest_alc_ac_grp_nm1 = null;
	public MCLabel Cnd_dest_alc_ac_grp_cd2_Label = null;
	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_dest_alc_ac_grp_cd2 = null;
	/**
	 * Allocation account group name 2 配賦科目グループ名２.<p>
	 *
	 */
	public MCTextField Cnd_dest_alc_ac_grp_nm2 = null;
	public MCLabel Cnd_dest_alc_ac_grp_cd3_Label = null;
	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_dest_alc_ac_grp_cd3 = null;
	/**
	 * Allocation account group name 3 配賦科目グループ名３.<p>
	 *
	 */
	public MCTextField Cnd_dest_alc_ac_grp_nm3 = null;
	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public MCCheckBox Cnd_pre_alc_lvl_flg = null;
	/**
	 * Allocation source WG 配賦元ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_src_wg_flg = null;
	/**
	 * Allocation source allocation account 配賦元配賦科目.<p>
	 *
	 */
	public MCCheckBox Cnd_src_alc_ac_flg = null;
	/**
	 * Allocation destination WG 配賦先ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_dest_wg_flg = null;
	/**
	 * Allocation destination allocation account 配賦先配賦科目.<p>
	 *
	 */
	public MCCheckBox Cnd_dest_alc_ac_flg = null;
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCCheckBox Cnd_ym_flg = null;
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
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_itm_mfg_inst_flg = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_flg = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_po_flg = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_slo_flg = null;
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
	// [DispDtl]ブロック関連のField定義
	public MCPanel DispDtlPanel = null;
	public MCScrollPane DispDtlScrollPane = null;
	public MCColumnGroupTable<mcframe.clientMGBD.MGBDP0250.DispDtlR> DispDtlTable = null;
	// [DispDtl]ブロックの項目のField定義
	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_pre_alc_lvl = null;
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_ym = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_wg_nm = null;
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_alc_ac_cd = null;
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_alc_ac_nm = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_dpt_nm = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_loc_nm = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_oper_nm = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_bp_nm = null;
	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_ctg_cd = null;
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_ctg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D DispDtl_itm_p_PPanel;
	public MCColumnConfig columnDispDtl_itm_cd;// [DispDtl]の[itm_p.itm_cd]を[columnDispDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDispDtl_itm_sub1;// [DispDtl]の[itm_p.itm_sub1]を[columnDispDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDispDtl_itm_sub2;// [DispDtl]の[itm_p.itm_sub2]を[columnDispDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDispDtl_itm_sub3;// [DispDtl]の[itm_p.itm_sub3]を[columnDispDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDispDtl_itm_nm;// [DispDtl]の[itm_p.itm_nm]を[columnDispDtl_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_typ_d_nm = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_sublot_no = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_sno1 = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_sno2 = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_sno3 = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_sno4 = null;
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_itm_mfg_inst_no = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_iv_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_po_no = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_slo_no = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_wg_cd2 = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_wg_nm2 = null;
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_alc_ac_cd2 = null;
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_alc_ac_nm2 = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnDispDtl_ttl = null;
	public MCColumnGroup cgDispDtl_grp1 = null;
	public MCColumnGroup cgDispDtl_grp2 = null;
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
	
	/** [MG_MGBDL0250_Srch01]のCallerの作成 */
	protected MGBDP_PreAlcChk_MC.MG_MGBDL0250_Srch01Caller createMG_MGBDL0250_Srch01() {
		MGBDP_PreAlcChk_MC.MG_MGBDL0250_Srch01Caller<MGBDP_PreAlcChk, MG_MGBDL0250_Srch01Bridge>
		caller = ((MGBDP_PreAlcChk_MC)this).new MG_MGBDL0250_Srch01Caller<MGBDP_PreAlcChk, MG_MGBDL0250_Srch01Bridge>(
					(MGBDP_PreAlcChk)this, new MG_MGBDL0250_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBDL0250_Srch01]の呼び出し */
	protected void callMG_MGBDL0250_Srch01() {
		MCCaller caller = createMG_MGBDL0250_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0250.CndR aCndR;
	/** [DispDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0250.DispDtlR> aDispDtlL;
	/** [Key]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0250.KeyR> aKeyL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0250.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0250.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0250.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0250.CndR.create();
	}

	/**
	 * コピーによってaDispDtlLを設定します。
	 *
	 * aDispDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DispDtlL
	 */
	public void setDispDtlL(MCList<mcframe.clientMGBD.MGBDP0250.DispDtlR> aList) {
		if (getDispDtlL() != aList) {
			getDispDtlL().setAll(aList);
		}
	}

	/**
	 * [DispDtl]ブロックのコンテナaDispDtlLを返します。
	 *
	 * @return DispDtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0250.DispDtlR> getDispDtlL() {
		return aDispDtlL;
	}

	/**
	 * aDispDtlRを作成します。
	 *
	 * @return DispDtlR
	 */
	public mcframe.clientMGBD.MGBDP0250.DispDtlR createDispDtlR() {
		return mcframe.clientMGBD.MGBDP0250.DispDtlR.create();
	}

	/**
	 * aDispDtlLを作成します。
	 *
	 * @return DispDtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0250.DispDtlR> createDispDtlL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0250.DispDtlR.class);
	}

	/**
	 * DispDtlTableを初期化します。
	 */
	protected void createDispDtlTable(){
		if(DispDtlTable == null){
			DispDtlTable = beansFactory.createColumnGroupTable("DispDtl.table");
		}
	}

	/**
	 * コピーによってaKeyLを設定します。
	 *
	 * aKeyLのインスタンスは変更されません。
	 *
	 * @param dataset KeyL
	 */
	public void setKeyL(MCList<mcframe.clientMGBD.MGBDP0250.KeyR> aList) {
		if (getKeyL() != aList) {
			getKeyL().setAll(aList);
		}
	}

	/**
	 * [Key]ブロックのコンテナaKeyLを返します。
	 *
	 * @return KeyL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0250.KeyR> getKeyL() {
		return aKeyL;
	}

	/**
	 * aKeyRを作成します。
	 *
	 * @return KeyR
	 */
	public mcframe.clientMGBD.MGBDP0250.KeyR createKeyR() {
		return mcframe.clientMGBD.MGBDP0250.KeyR.create();
	}

	/**
	 * aKeyLを作成します。
	 *
	 * @return KeyL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0250.KeyR> createKeyL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0250.KeyR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDispDtlL())) ret.add(getDispDtlL());
		if(!MCCollectionUtil.contains(ret, getKeyL())) ret.add(getKeyL());
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
		if(aCnt == getDispDtlL()) return "DispDtl";
		if(aCnt == getKeyL()) return "Key";
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
		if(bId.equals("DispDtl")) return getDispDtlL();
		if(bId.equals("Key")) return getKeyL();
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
		ret.add(Tab5Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(Cnd3Panel);
		ret.add(TtlPanel);
		ret.add(CtrlPanel);
		ret.add(DispDtlPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_PreAlcChk_MC_A() {
		aCndR = createCndR();
		aDispDtlL = createDispDtlL();
		aKeyL = createKeyL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_PreAlcChk_MC_A(String name) {
		aCndR = createCndR();
		aDispDtlL = createDispDtlL();
		createDispDtlTable();
		DispDtlTable.setRowName(name);
		aKeyL = createKeyL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBDP_PreAlcChk_MC.jbCreateScreenOpe((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbCreateTop((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbCreateFold((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbCreateTab1((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbCreateTab2((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbCreateTab3((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbCreateTab5((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbCreateCnd((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbCreateCnd2((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbCreateCnd3((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbCreateTtl((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbCreateCtrl((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbCreateDispDtl((MGBDP_PreAlcChk)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBDP_PreAlcChk p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBDP_PreAlcChk p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBDP_PreAlcChk p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBDP_PreAlcChk p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBDP_PreAlcChk p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MGBDP_PreAlcChk p) {
	}

	/**
	 * [Tab5]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab5(MGBDP_PreAlcChk p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_PreAlcChk p) {
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
	protected static void jbCreateCnd2(MGBDP_PreAlcChk p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MGBDP_PreAlcChk p) {
	}

	/**
	 * [Ttl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTtl(MGBDP_PreAlcChk p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBDP_PreAlcChk p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispDtl(MGBDP_PreAlcChk p) {
		p.DispDtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0250.DispDtlR.$itm_p);
		p.DispDtl_itm_p_PPanel.setName("DispDtl.itm_p");
		p.columnDispDtl_itm_cd = p.DispDtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnDispDtl_itm_cd.addAliasName("DispDtl.itm_cd", p);
		p.columnDispDtl_itm_sub1 = p.DispDtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDispDtl_itm_sub1.addAliasName("DispDtl.itm_sub1", p);
		p.columnDispDtl_itm_sub2 = p.DispDtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDispDtl_itm_sub2.addAliasName("DispDtl.itm_sub2", p);
		p.columnDispDtl_itm_sub3 = p.DispDtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDispDtl_itm_sub3.addAliasName("DispDtl.itm_sub3", p);
		p.columnDispDtl_itm_nm = p.DispDtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnDispDtl_itm_nm.addAliasName("DispDtl.itm_nm", p);
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
	
	
	/** [Cnd_src_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_src_wg_cd_p = null;

	/**
	 * [Cnd_src_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_src_wg_cd_ListPutter() {
		if (Cnd_src_wg_cd_p == null) {
			Cnd_src_wg_cd_p = createCnd_src_wg_cd_ListPutter(Cnd_src_wg_cd, "src_wg_cd", "src_wg_nm");

		}
		return Cnd_src_wg_cd_p;
	}
	
	
	/** [Cnd_src_alc_ac_cd_ListPutter]の定義 */
	private MCListPutter Cnd_src_alc_ac_cd_p = null;

	/**
	 * [Cnd_src_alc_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_src_alc_ac_cd_ListPutter() {
		if (Cnd_src_alc_ac_cd_p == null) {
			Cnd_src_alc_ac_cd_p = createCnd_src_alc_ac_cd_ListPutter(Cnd_src_alc_ac_cd, "src_alc_ac_cd", "src_alc_ac_nm");

		}
		return Cnd_src_alc_ac_cd_p;
	}
	
	
	/** [Cnd_src_alc_ac_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_src_alc_ac_grp_cd1_p = null;

	/**
	 * [Cnd_src_alc_ac_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_src_alc_ac_grp_cd1_ListPutter() {
		if (Cnd_src_alc_ac_grp_cd1_p == null) {
			Cnd_src_alc_ac_grp_cd1_p = createCnd_src_alc_ac_grp_cd1_ListPutter(Cnd_src_alc_ac_grp_cd1, "src_alc_ac_grp_cd1", "src_alc_ac_grp_nm1");

		}
		return Cnd_src_alc_ac_grp_cd1_p;
	}
	
	
	/** [Cnd_src_alc_ac_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_src_alc_ac_grp_cd2_p = null;

	/**
	 * [Cnd_src_alc_ac_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_src_alc_ac_grp_cd2_ListPutter() {
		if (Cnd_src_alc_ac_grp_cd2_p == null) {
			Cnd_src_alc_ac_grp_cd2_p = createCnd_src_alc_ac_grp_cd2_ListPutter(Cnd_src_alc_ac_grp_cd2, "src_alc_ac_grp_cd2", "src_alc_ac_grp_nm2");

		}
		return Cnd_src_alc_ac_grp_cd2_p;
	}
	
	
	/** [Cnd_src_alc_ac_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_src_alc_ac_grp_cd3_p = null;

	/**
	 * [Cnd_src_alc_ac_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_src_alc_ac_grp_cd3_ListPutter() {
		if (Cnd_src_alc_ac_grp_cd3_p == null) {
			Cnd_src_alc_ac_grp_cd3_p = createCnd_src_alc_ac_grp_cd3_ListPutter(Cnd_src_alc_ac_grp_cd3, "src_alc_ac_grp_cd3", "src_alc_ac_grp_nm3");

		}
		return Cnd_src_alc_ac_grp_cd3_p;
	}
	
	
	/** [Cnd_dest_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dest_wg_cd_p = null;

	/**
	 * [Cnd_dest_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_wg_cd_ListPutter() {
		if (Cnd_dest_wg_cd_p == null) {
			Cnd_dest_wg_cd_p = createCnd_dest_wg_cd_ListPutter(Cnd_dest_wg_cd, "dest_wg_cd", "dest_wg_nm");

		}
		return Cnd_dest_wg_cd_p;
	}
	
	
	/** [Cnd_dest_alc_ac_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dest_alc_ac_cd_p = null;

	/**
	 * [Cnd_dest_alc_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_alc_ac_cd_ListPutter() {
		if (Cnd_dest_alc_ac_cd_p == null) {
			Cnd_dest_alc_ac_cd_p = createCnd_dest_alc_ac_cd_ListPutter(Cnd_dest_alc_ac_cd, "dest_alc_ac_cd", "dest_alc_ac_nm");

		}
		return Cnd_dest_alc_ac_cd_p;
	}
	
	
	/** [Cnd_dest_alc_ac_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_dest_alc_ac_grp_cd1_p = null;

	/**
	 * [Cnd_dest_alc_ac_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_alc_ac_grp_cd1_ListPutter() {
		if (Cnd_dest_alc_ac_grp_cd1_p == null) {
			Cnd_dest_alc_ac_grp_cd1_p = createCnd_dest_alc_ac_grp_cd1_ListPutter(Cnd_dest_alc_ac_grp_cd1, "dest_alc_ac_grp_cd1", "dest_alc_ac_grp_nm1");

		}
		return Cnd_dest_alc_ac_grp_cd1_p;
	}
	
	
	/** [Cnd_dest_alc_ac_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_dest_alc_ac_grp_cd2_p = null;

	/**
	 * [Cnd_dest_alc_ac_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_alc_ac_grp_cd2_ListPutter() {
		if (Cnd_dest_alc_ac_grp_cd2_p == null) {
			Cnd_dest_alc_ac_grp_cd2_p = createCnd_dest_alc_ac_grp_cd2_ListPutter(Cnd_dest_alc_ac_grp_cd2, "dest_alc_ac_grp_cd2", "dest_alc_ac_grp_nm2");

		}
		return Cnd_dest_alc_ac_grp_cd2_p;
	}
	
	
	/** [Cnd_dest_alc_ac_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_dest_alc_ac_grp_cd3_p = null;

	/**
	 * [Cnd_dest_alc_ac_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_alc_ac_grp_cd3_ListPutter() {
		if (Cnd_dest_alc_ac_grp_cd3_p == null) {
			Cnd_dest_alc_ac_grp_cd3_p = createCnd_dest_alc_ac_grp_cd3_ListPutter(Cnd_dest_alc_ac_grp_cd3, "dest_alc_ac_grp_cd3", "dest_alc_ac_grp_nm3");

		}
		return Cnd_dest_alc_ac_grp_cd3_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_PreAlcChk create(){
		MGBDP_PreAlcChk p = new MGBDP_PreAlcChk();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_PreAlcChk create(String name){
		MGBDP_PreAlcChk p = new MGBDP_PreAlcChk(name);
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
		MGBDP_PreAlcChk_MC.jbfInitScreenOpe((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbfInitTop((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbfInitFold((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbfInitTab1((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbfInitTab2((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbfInitTab3((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbfInitTab5((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbfInitCnd((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbfInitCnd2((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbfInitCnd3((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbfInitTtl((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbfInitCtrl((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbfInitDispDtl((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbInitScreenOpe((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbInitTop((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbInitFold((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbInitTab1((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbInitTab2((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbInitTab3((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbInitTab5((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbInitCnd((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbInitCnd2((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbInitCnd3((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbInitTtl((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbInitCtrl((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.jbInitDispDtl((MGBDP_PreAlcChk)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBDP_PreAlcChk p) {
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
	protected static void jbfInitTab1(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab5(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.Tab5Panel = p.beansFactory.createPanel("Tab5");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_DEST = p.beansFactory.createRadioButton("Cnd.ope_DEST");
		p.Cnd_ope_SRC = p.beansFactory.createRadioButton("Cnd.ope_SRC");
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_term = p.beansFactory.createDateField("Cnd.term");
		p.Cnd_ym_fr_Label = p.beansFactory.createLabel("Cnd.ym_fr_Label");
		p.Cnd_ym_fr = p.beansFactory.createDateField("Cnd.ym_fr");
		p.Cnd_ym_fr.setLabel(p.Cnd_ym_fr_Label);
		p.Cnd_ym_to_Label = p.beansFactory.createLabel("Cnd.ym_to_Label");
		p.Cnd_ym_to = p.beansFactory.createDateField("Cnd.ym_to");
		p.Cnd_ym_to.setLabel(p.Cnd_ym_to_Label);
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
		p.Cnd_itm_mfg_inst_no_Label = p.beansFactory.createLabel("Cnd.itm_mfg_inst_no_Label");
		p.Cnd_itm_mfg_inst_no = p.beansFactory.createTextField("Cnd.itm_mfg_inst_no");
		p.Cnd_itm_mfg_inst_no.setLabel(p.Cnd_itm_mfg_inst_no_Label);
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_po_no_Label = p.beansFactory.createLabel("Cnd.po_no_Label");
		p.Cnd_po_no = p.beansFactory.createTextField("Cnd.po_no");
		p.Cnd_po_no.setLabel(p.Cnd_po_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_src_wg_cd_Label = p.beansFactory.createLabel("Cnd.src_wg_cd_Label");
		p.Cnd_src_wg_cd = p.beansFactory.createTextComboBox("Cnd.src_wg_cd");
		p.Cnd_src_wg_cd.setLabel(p.Cnd_src_wg_cd_Label);
		p.Cnd_src_wg_nm = p.beansFactory.createTextField("Cnd.src_wg_nm");
		p.Cnd_src_alc_ac_cd_Label = p.beansFactory.createLabel("Cnd.src_alc_ac_cd_Label");
		p.Cnd_src_alc_ac_cd = p.beansFactory.createTextComboBox("Cnd.src_alc_ac_cd");
		p.Cnd_src_alc_ac_cd.setLabel(p.Cnd_src_alc_ac_cd_Label);
		p.Cnd_src_alc_ac_nm = p.beansFactory.createTextField("Cnd.src_alc_ac_nm");
		p.Cnd_src_alc_ac_grp_cd1_Label = p.beansFactory.createLabel("Cnd.src_alc_ac_grp_cd1_Label");
		p.Cnd_src_alc_ac_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.src_alc_ac_grp_cd1");
		p.Cnd_src_alc_ac_grp_cd1.setLabel(p.Cnd_src_alc_ac_grp_cd1_Label);
		p.Cnd_src_alc_ac_grp_nm1 = p.beansFactory.createTextField("Cnd.src_alc_ac_grp_nm1");
		p.Cnd_src_alc_ac_grp_cd2_Label = p.beansFactory.createLabel("Cnd.src_alc_ac_grp_cd2_Label");
		p.Cnd_src_alc_ac_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.src_alc_ac_grp_cd2");
		p.Cnd_src_alc_ac_grp_cd2.setLabel(p.Cnd_src_alc_ac_grp_cd2_Label);
		p.Cnd_src_alc_ac_grp_nm2 = p.beansFactory.createTextField("Cnd.src_alc_ac_grp_nm2");
		p.Cnd_src_alc_ac_grp_cd3_Label = p.beansFactory.createLabel("Cnd.src_alc_ac_grp_cd3_Label");
		p.Cnd_src_alc_ac_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.src_alc_ac_grp_cd3");
		p.Cnd_src_alc_ac_grp_cd3.setLabel(p.Cnd_src_alc_ac_grp_cd3_Label);
		p.Cnd_src_alc_ac_grp_nm3 = p.beansFactory.createTextField("Cnd.src_alc_ac_grp_nm3");
		p.Cnd_dest_wg_cd_Label = p.beansFactory.createLabel("Cnd.dest_wg_cd_Label");
		p.Cnd_dest_wg_cd = p.beansFactory.createTextComboBox("Cnd.dest_wg_cd");
		p.Cnd_dest_wg_cd.setLabel(p.Cnd_dest_wg_cd_Label);
		p.Cnd_dest_wg_nm = p.beansFactory.createTextField("Cnd.dest_wg_nm");
		p.Cnd_dest_alc_ac_cd_Label = p.beansFactory.createLabel("Cnd.dest_alc_ac_cd_Label");
		p.Cnd_dest_alc_ac_cd = p.beansFactory.createTextComboBox("Cnd.dest_alc_ac_cd");
		p.Cnd_dest_alc_ac_cd.setLabel(p.Cnd_dest_alc_ac_cd_Label);
		p.Cnd_dest_alc_ac_nm = p.beansFactory.createTextField("Cnd.dest_alc_ac_nm");
		p.Cnd_dest_alc_ac_grp_cd1_Label = p.beansFactory.createLabel("Cnd.dest_alc_ac_grp_cd1_Label");
		p.Cnd_dest_alc_ac_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.dest_alc_ac_grp_cd1");
		p.Cnd_dest_alc_ac_grp_cd1.setLabel(p.Cnd_dest_alc_ac_grp_cd1_Label);
		p.Cnd_dest_alc_ac_grp_nm1 = p.beansFactory.createTextField("Cnd.dest_alc_ac_grp_nm1");
		p.Cnd_dest_alc_ac_grp_cd2_Label = p.beansFactory.createLabel("Cnd.dest_alc_ac_grp_cd2_Label");
		p.Cnd_dest_alc_ac_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.dest_alc_ac_grp_cd2");
		p.Cnd_dest_alc_ac_grp_cd2.setLabel(p.Cnd_dest_alc_ac_grp_cd2_Label);
		p.Cnd_dest_alc_ac_grp_nm2 = p.beansFactory.createTextField("Cnd.dest_alc_ac_grp_nm2");
		p.Cnd_dest_alc_ac_grp_cd3_Label = p.beansFactory.createLabel("Cnd.dest_alc_ac_grp_cd3_Label");
		p.Cnd_dest_alc_ac_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.dest_alc_ac_grp_cd3");
		p.Cnd_dest_alc_ac_grp_cd3.setLabel(p.Cnd_dest_alc_ac_grp_cd3_Label);
		p.Cnd_dest_alc_ac_grp_nm3 = p.beansFactory.createTextField("Cnd.dest_alc_ac_grp_nm3");
		p.Cnd_pre_alc_lvl_flg = p.beansFactory.createCheckBox("Cnd.pre_alc_lvl_flg");
		p.Cnd_src_wg_flg = p.beansFactory.createCheckBox("Cnd.src_wg_flg");
		p.Cnd_src_alc_ac_flg = p.beansFactory.createCheckBox("Cnd.src_alc_ac_flg");
		p.Cnd_dest_wg_flg = p.beansFactory.createCheckBox("Cnd.dest_wg_flg");
		p.Cnd_dest_alc_ac_flg = p.beansFactory.createCheckBox("Cnd.dest_alc_ac_flg");
		p.Cnd_ym_flg = p.beansFactory.createCheckBox("Cnd.ym_flg");
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
		p.Cnd_itm_mfg_inst_flg = p.beansFactory.createCheckBox("Cnd.itm_mfg_inst_flg");
		p.Cnd_iv_flg = p.beansFactory.createCheckBox("Cnd.iv_flg");
		p.Cnd_po_flg = p.beansFactory.createCheckBox("Cnd.po_flg");
		p.Cnd_slo_flg = p.beansFactory.createCheckBox("Cnd.slo_flg");
		p.Cnd_select_all = p.beansFactory.createButton("Cnd.select_all", "no_border");
		p.Cnd_deselect_all = p.beansFactory.createButton("Cnd.deselect_all", "no_border");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTtl(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.TtlPanel = p.beansFactory.createPanel("Ttl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispDtl(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.DispDtlPanel = p.beansFactory.createPanel("DispDtl");
		p.DispDtlScrollPane = p.beansFactory.createScrollPane("DispDtl.scroll");
		p.createDispDtlTable();
		// ブロックの項目の初期化
		p.columnDispDtl_pre_alc_lvl = p.beansFactory.createTableColumn("DispDtl.pre_alc_lvl", MCColumnType.NUMBER);
		p.columnDispDtl_ym = p.beansFactory.createTableColumn("DispDtl.ym", MCColumnType.DATE);
		p.columnDispDtl_wg_cd = p.beansFactory.createTableColumn("DispDtl.wg_cd", MCColumnType.TEXT);
		p.columnDispDtl_wg_nm = p.beansFactory.createTableColumn("DispDtl.wg_nm", MCColumnType.TEXT);
		p.columnDispDtl_alc_ac_cd = p.beansFactory.createTableColumn("DispDtl.alc_ac_cd", MCColumnType.TEXT);
		p.columnDispDtl_alc_ac_nm = p.beansFactory.createTableColumn("DispDtl.alc_ac_nm", MCColumnType.TEXT);
		p.columnDispDtl_dpt_cd = p.beansFactory.createTableColumn("DispDtl.dpt_cd", MCColumnType.TEXT);
		p.columnDispDtl_dpt_nm = p.beansFactory.createTableColumn("DispDtl.dpt_nm", MCColumnType.TEXT);
		p.columnDispDtl_loc_cd = p.beansFactory.createTableColumn("DispDtl.loc_cd", MCColumnType.TEXT);
		p.columnDispDtl_loc_nm = p.beansFactory.createTableColumn("DispDtl.loc_nm", MCColumnType.TEXT);
		p.columnDispDtl_oper_cd = p.beansFactory.createTableColumn("DispDtl.oper_cd", MCColumnType.TEXT);
		p.columnDispDtl_oper_nm = p.beansFactory.createTableColumn("DispDtl.oper_nm", MCColumnType.TEXT);
		p.columnDispDtl_bp_cd = p.beansFactory.createTableColumn("DispDtl.bp_cd", MCColumnType.TEXT);
		p.columnDispDtl_bp_nm = p.beansFactory.createTableColumn("DispDtl.bp_nm", MCColumnType.TEXT);
		p.columnDispDtl_ctg_cd = p.beansFactory.createTableColumn("DispDtl.ctg_cd", MCColumnType.TEXT);
		p.columnDispDtl_ctg_nm = p.beansFactory.createTableColumn("DispDtl.ctg_nm", MCColumnType.TEXT);
		p.columnDispDtl_itm_typ = p.beansFactory.createTableColumn("DispDtl.itm_typ", MCColumnType.TEXT);
		p.columnDispDtl_itm_typ_nm = p.beansFactory.createTableColumn("DispDtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDispDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("DispDtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDispDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("DispDtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDispDtl_lot_no = p.beansFactory.createTableColumn("DispDtl.lot_no", MCColumnType.TEXT);
		p.columnDispDtl_sublot_no = p.beansFactory.createTableColumn("DispDtl.sublot_no", MCColumnType.TEXT);
		p.columnDispDtl_sno1 = p.beansFactory.createTableColumn("DispDtl.sno1", MCColumnType.TEXT);
		p.columnDispDtl_sno2 = p.beansFactory.createTableColumn("DispDtl.sno2", MCColumnType.TEXT);
		p.columnDispDtl_sno3 = p.beansFactory.createTableColumn("DispDtl.sno3", MCColumnType.TEXT);
		p.columnDispDtl_sno4 = p.beansFactory.createTableColumn("DispDtl.sno4", MCColumnType.TEXT);
		p.columnDispDtl_itm_mfg_inst_no = p.beansFactory.createTableColumn("DispDtl.itm_mfg_inst_no", MCColumnType.TEXT);
		p.columnDispDtl_iv_no = p.beansFactory.createTableColumn("DispDtl.iv_no", MCColumnType.TEXT);
		p.columnDispDtl_po_no = p.beansFactory.createTableColumn("DispDtl.po_no", MCColumnType.TEXT);
		p.columnDispDtl_slo_no = p.beansFactory.createTableColumn("DispDtl.slo_no", MCColumnType.TEXT);
		p.columnDispDtl_wg_cd2 = p.beansFactory.createTableColumn("DispDtl.wg_cd2", MCColumnType.TEXT);
		p.columnDispDtl_wg_nm2 = p.beansFactory.createTableColumn("DispDtl.wg_nm2", MCColumnType.TEXT);
		p.columnDispDtl_alc_ac_cd2 = p.beansFactory.createTableColumn("DispDtl.alc_ac_cd2", MCColumnType.TEXT);
		p.columnDispDtl_alc_ac_nm2 = p.beansFactory.createTableColumn("DispDtl.alc_ac_nm2", MCColumnType.TEXT);
		p.columnDispDtl_ttl = p.beansFactory.createTableColumn("DispDtl.ttl", MCColumnType.NUMBER);
		p.cgDispDtl_grp1 = p.beansFactory.createColumnGroup("DispDtl.grp1");
		p.cgDispDtl_grp2 = p.beansFactory.createColumnGroup("DispDtl.grp2");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBDP_PreAlcChk p) {
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
	protected static void jbInitTop(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.DispDtlPanel);
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
	protected static void jbInitFold(MGBDP_PreAlcChk p) {
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
		p.Tab3Panel.setNextBeans(p.Tab5Panel);
		p.FoldTab.add(p.Tab5Panel, "Fold.tab5");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MGBDP_PreAlcChk p) {
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
	protected static void jbInitTab2(MGBDP_PreAlcChk p) {
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
	protected static void jbInitTab3(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab5Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.Cnd3Panel, null);
		p.Tab3Panel.setLastBeans(p.Cnd3Panel);
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab5(MGBDP_PreAlcChk p) {
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
	protected static void jbInitCnd(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_DEST);
		p.Cnd_ope_DEST.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEST);
		p.ScreenOpePanel.add(p.Cnd_ope_DEST);
		p.Cnd_ope_DEST.setNextBeans(p.Cnd_ope_SRC);
		p.Cnd_ope_SRC.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_SRC);
		p.ScreenOpePanel.add(p.Cnd_ope_SRC);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.ope_META);
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_no_p_PPanel.setNextBeans(p.Cnd_term);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListType(MCListType.STRICT);
		p.setPluralValueEnable(p.Cnd_calc_no_p_PPanel.CalcNo_calc_no, true);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setLinkBeans(p.Cnd_rmrks,p.Cnd_term);
		p.CndPanel.add(p.Cnd_term);
		p.Cnd_term.setNextBeans(p.Cnd_ym_fr);
		p.Cnd_term.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.term_META);
		p.Cnd_term.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ym_fr);
		p.Cnd_ym_fr.setNextBeans(p.Cnd_ym_to);
		p.Cnd_ym_fr.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.ym_fr_META);
		p.Cnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ym_to_Label);
		p.CndPanel.add(p.Cnd_ym_to);
		p.Cnd_ym_to.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_ym_to.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.ym_to_META);
		p.Cnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.Cnd_dpt_cd.setLinkBeans(p.Cnd_dpt_nm);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.dpt_cd_META);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_oper_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_oper_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_cd, true);
		p.Cnd_oper_cd.setLinkBeans(p.Cnd_oper_nm);
		p.CndPanel.add(p.Cnd_oper_cd_Label);
		p.CndPanel.add(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setNextBeans(p.Cnd_oper_nm);
		p.Cnd_oper_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.oper_cd_META);
		p.CndPanel.add(p.Cnd_oper_nm);
		p.Cnd_oper_nm.setNextBeans(p.Cnd_bp_cd);
		p.Cnd_oper_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.oper_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_nm, true);
		p.CndPanel.add(p.Cnd_bp_cd_Label);
		p.CndPanel.add(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_cd, true);
		p.CndPanel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_ctg_cd);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.bp_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_nm, true);
		p.Cnd_ctg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ctg_cd, true);
		p.Cnd_ctg_cd.setLinkBeans(p.Cnd_ctg_nm);
		p.CndPanel.add(p.Cnd_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_ctg_cd);
		p.Cnd_ctg_cd.setNextBeans(p.Cnd_ctg_nm);
		p.Cnd_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.ctg_cd_META);
		p.CndPanel.add(p.Cnd_ctg_nm);
		p.Cnd_ctg_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.ctg_nm_META);
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
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno1);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.sublot_no_META);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno1_Label);
		p.CndPanel.add(p.Cnd_sno1);
		p.Cnd_sno1.setNextBeans(p.Cnd_sno2);
		p.Cnd_sno1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.sno1_META);
		p.setPluralValueEnable(p.Cnd_sno1, true);
		p.CndPanel.add(p.Cnd_sno2_Label);
		p.CndPanel.add(p.Cnd_sno2);
		p.Cnd_sno2.setNextBeans(p.Cnd_sno3);
		p.Cnd_sno2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.sno2_META);
		p.setPluralValueEnable(p.Cnd_sno2, true);
		p.CndPanel.add(p.Cnd_sno3_Label);
		p.CndPanel.add(p.Cnd_sno3);
		p.Cnd_sno3.setNextBeans(p.Cnd_sno4);
		p.Cnd_sno3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.sno3_META);
		p.setPluralValueEnable(p.Cnd_sno3, true);
		p.CndPanel.add(p.Cnd_sno4_Label);
		p.CndPanel.add(p.Cnd_sno4);
		p.Cnd_sno4.setNextBeans(p.Cnd_itm_mfg_inst_no);
		p.Cnd_sno4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.sno4_META);
		p.setPluralValueEnable(p.Cnd_sno4, true);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_no_Label);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_no);
		p.Cnd_itm_mfg_inst_no.setNextBeans(p.Cnd_iv_no);
		p.Cnd_itm_mfg_inst_no.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.itm_mfg_inst_no_META);
		p.setPluralValueEnable(p.Cnd_itm_mfg_inst_no, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_po_no);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_po_no_Label);
		p.CndPanel.add(p.Cnd_po_no);
		p.Cnd_po_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_po_no.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.po_no_META);
		p.setPluralValueEnable(p.Cnd_po_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.Cnd_src_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_src_wg_cd, true);
		p.Cnd_src_wg_cd.setLinkBeans(p.Cnd_src_wg_nm);
		p.Cnd2Panel.add(p.Cnd_src_wg_cd_Label);
		p.Cnd2Panel.add(p.Cnd_src_wg_cd);
		p.Cnd2Panel.setLastBeans(p.Cnd_src_wg_cd);
		p.Cnd_src_wg_cd.setNextBeans(p.Cnd_src_wg_nm);
		p.Cnd_src_wg_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.src_wg_cd_META);
		p.Cnd2Panel.add(p.Cnd_src_wg_nm);
		p.Cnd_src_wg_nm.setNextBeans(p.Cnd_src_alc_ac_cd);
		p.Cnd_src_wg_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.src_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_src_wg_nm, true);
		p.Cnd_src_alc_ac_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_src_alc_ac_cd, true);
		p.Cnd_src_alc_ac_cd.setLinkBeans(p.Cnd_src_alc_ac_nm);
		p.Cnd2Panel.add(p.Cnd_src_alc_ac_cd_Label);
		p.Cnd2Panel.add(p.Cnd_src_alc_ac_cd);
		p.Cnd_src_alc_ac_cd.setNextBeans(p.Cnd_src_alc_ac_nm);
		p.Cnd_src_alc_ac_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.src_alc_ac_cd_META);
		p.Cnd2Panel.add(p.Cnd_src_alc_ac_nm);
		p.Cnd_src_alc_ac_nm.setNextBeans(p.Cnd_src_alc_ac_grp_cd1);
		p.Cnd_src_alc_ac_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.src_alc_ac_nm_META);
		p.setPluralValueEnable(p.Cnd_src_alc_ac_nm, true);
		p.Cnd_src_alc_ac_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_src_alc_ac_grp_cd1, true);
		p.Cnd_src_alc_ac_grp_cd1.setLinkBeans(p.Cnd_src_alc_ac_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_src_alc_ac_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_src_alc_ac_grp_cd1);
		p.Cnd_src_alc_ac_grp_cd1.setNextBeans(p.Cnd_src_alc_ac_grp_nm1);
		p.Cnd_src_alc_ac_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.src_alc_ac_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_src_alc_ac_grp_nm1);
		p.Cnd_src_alc_ac_grp_nm1.setNextBeans(p.Cnd_src_alc_ac_grp_cd2);
		p.Cnd_src_alc_ac_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.src_alc_ac_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_src_alc_ac_grp_nm1, true);
		p.Cnd_src_alc_ac_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_src_alc_ac_grp_cd2, true);
		p.Cnd_src_alc_ac_grp_cd2.setLinkBeans(p.Cnd_src_alc_ac_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_src_alc_ac_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_src_alc_ac_grp_cd2);
		p.Cnd_src_alc_ac_grp_cd2.setNextBeans(p.Cnd_src_alc_ac_grp_nm2);
		p.Cnd_src_alc_ac_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.src_alc_ac_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_src_alc_ac_grp_nm2);
		p.Cnd_src_alc_ac_grp_nm2.setNextBeans(p.Cnd_src_alc_ac_grp_cd3);
		p.Cnd_src_alc_ac_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.src_alc_ac_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_src_alc_ac_grp_nm2, true);
		p.Cnd_src_alc_ac_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_src_alc_ac_grp_cd3, true);
		p.Cnd_src_alc_ac_grp_cd3.setLinkBeans(p.Cnd_src_alc_ac_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_src_alc_ac_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_src_alc_ac_grp_cd3);
		p.Cnd_src_alc_ac_grp_cd3.setNextBeans(p.Cnd_src_alc_ac_grp_nm3);
		p.Cnd_src_alc_ac_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.src_alc_ac_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_src_alc_ac_grp_nm3);
		p.Cnd_src_alc_ac_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.src_alc_ac_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_src_alc_ac_grp_nm3, true);
		p.Cnd_dest_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_wg_cd, true);
		p.Cnd_dest_wg_cd.setLinkBeans(p.Cnd_dest_wg_nm);
		p.Cnd3Panel.add(p.Cnd_dest_wg_cd_Label);
		p.Cnd3Panel.add(p.Cnd_dest_wg_cd);
		p.Cnd3Panel.setLastBeans(p.Cnd_dest_wg_cd);
		p.Cnd_dest_wg_cd.setNextBeans(p.Cnd_dest_wg_nm);
		p.Cnd_dest_wg_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.dest_wg_cd_META);
		p.Cnd3Panel.add(p.Cnd_dest_wg_nm);
		p.Cnd_dest_wg_nm.setNextBeans(p.Cnd_dest_alc_ac_cd);
		p.Cnd_dest_wg_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.dest_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_dest_wg_nm, true);
		p.Cnd_dest_alc_ac_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_alc_ac_cd, true);
		p.Cnd_dest_alc_ac_cd.setLinkBeans(p.Cnd_dest_alc_ac_nm);
		p.Cnd3Panel.add(p.Cnd_dest_alc_ac_cd_Label);
		p.Cnd3Panel.add(p.Cnd_dest_alc_ac_cd);
		p.Cnd_dest_alc_ac_cd.setNextBeans(p.Cnd_dest_alc_ac_nm);
		p.Cnd_dest_alc_ac_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.dest_alc_ac_cd_META);
		p.Cnd3Panel.add(p.Cnd_dest_alc_ac_nm);
		p.Cnd_dest_alc_ac_nm.setNextBeans(p.Cnd_dest_alc_ac_grp_cd1);
		p.Cnd_dest_alc_ac_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.dest_alc_ac_nm_META);
		p.setPluralValueEnable(p.Cnd_dest_alc_ac_nm, true);
		p.Cnd_dest_alc_ac_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_alc_ac_grp_cd1, true);
		p.Cnd_dest_alc_ac_grp_cd1.setLinkBeans(p.Cnd_dest_alc_ac_grp_nm1);
		p.Cnd3Panel.add(p.Cnd_dest_alc_ac_grp_cd1_Label);
		p.Cnd3Panel.add(p.Cnd_dest_alc_ac_grp_cd1);
		p.Cnd_dest_alc_ac_grp_cd1.setNextBeans(p.Cnd_dest_alc_ac_grp_nm1);
		p.Cnd_dest_alc_ac_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.dest_alc_ac_grp_cd1_META);
		p.Cnd3Panel.add(p.Cnd_dest_alc_ac_grp_nm1);
		p.Cnd_dest_alc_ac_grp_nm1.setNextBeans(p.Cnd_dest_alc_ac_grp_cd2);
		p.Cnd_dest_alc_ac_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.dest_alc_ac_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_dest_alc_ac_grp_nm1, true);
		p.Cnd_dest_alc_ac_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_alc_ac_grp_cd2, true);
		p.Cnd_dest_alc_ac_grp_cd2.setLinkBeans(p.Cnd_dest_alc_ac_grp_nm2);
		p.Cnd3Panel.add(p.Cnd_dest_alc_ac_grp_cd2_Label);
		p.Cnd3Panel.add(p.Cnd_dest_alc_ac_grp_cd2);
		p.Cnd_dest_alc_ac_grp_cd2.setNextBeans(p.Cnd_dest_alc_ac_grp_nm2);
		p.Cnd_dest_alc_ac_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.dest_alc_ac_grp_cd2_META);
		p.Cnd3Panel.add(p.Cnd_dest_alc_ac_grp_nm2);
		p.Cnd_dest_alc_ac_grp_nm2.setNextBeans(p.Cnd_dest_alc_ac_grp_cd3);
		p.Cnd_dest_alc_ac_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.dest_alc_ac_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_dest_alc_ac_grp_nm2, true);
		p.Cnd_dest_alc_ac_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_alc_ac_grp_cd3, true);
		p.Cnd_dest_alc_ac_grp_cd3.setLinkBeans(p.Cnd_dest_alc_ac_grp_nm3);
		p.Cnd3Panel.add(p.Cnd_dest_alc_ac_grp_cd3_Label);
		p.Cnd3Panel.add(p.Cnd_dest_alc_ac_grp_cd3);
		p.Cnd_dest_alc_ac_grp_cd3.setNextBeans(p.Cnd_dest_alc_ac_grp_nm3);
		p.Cnd_dest_alc_ac_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.dest_alc_ac_grp_cd3_META);
		p.Cnd3Panel.add(p.Cnd_dest_alc_ac_grp_nm3);
		p.Cnd_dest_alc_ac_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.dest_alc_ac_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_dest_alc_ac_grp_nm3, true);
		p.TtlPanel.add(p.Cnd_pre_alc_lvl_flg);
		p.TtlPanel.setLastBeans(p.Cnd_pre_alc_lvl_flg);
		p.Cnd_pre_alc_lvl_flg.setNextBeans(p.Cnd_src_wg_flg);
		p.Cnd_pre_alc_lvl_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.pre_alc_lvl_flg_META);
		p.TtlPanel.add(p.Cnd_src_wg_flg);
		p.Cnd_src_wg_flg.setNextBeans(p.Cnd_src_alc_ac_flg);
		p.Cnd_src_wg_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.src_wg_flg_META);
		p.TtlPanel.add(p.Cnd_src_alc_ac_flg);
		p.Cnd_src_alc_ac_flg.setNextBeans(p.Cnd_dest_wg_flg);
		p.Cnd_src_alc_ac_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.src_alc_ac_flg_META);
		p.TtlPanel.add(p.Cnd_dest_wg_flg);
		p.Cnd_dest_wg_flg.setNextBeans(p.Cnd_dest_alc_ac_flg);
		p.Cnd_dest_wg_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.dest_wg_flg_META);
		p.TtlPanel.add(p.Cnd_dest_alc_ac_flg);
		p.Cnd_dest_alc_ac_flg.setNextBeans(p.Cnd_ym_flg);
		p.Cnd_dest_alc_ac_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.dest_alc_ac_flg_META);
		p.TtlPanel.add(p.Cnd_ym_flg);
		p.Cnd_ym_flg.setNextBeans(p.Cnd_dpt_flg);
		p.Cnd_ym_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.ym_flg_META);
		p.TtlPanel.add(p.Cnd_dpt_flg);
		p.Cnd_dpt_flg.setNextBeans(p.Cnd_loc_flg);
		p.Cnd_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.dpt_flg_META);
		p.TtlPanel.add(p.Cnd_loc_flg);
		p.Cnd_loc_flg.setNextBeans(p.Cnd_oper_flg);
		p.Cnd_loc_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.loc_flg_META);
		p.TtlPanel.add(p.Cnd_oper_flg);
		p.Cnd_oper_flg.setNextBeans(p.Cnd_bp_flg);
		p.Cnd_oper_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.oper_flg_META);
		p.TtlPanel.add(p.Cnd_bp_flg);
		p.Cnd_bp_flg.setNextBeans(p.Cnd_ctg_flg);
		p.Cnd_bp_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.bp_flg_META);
		p.TtlPanel.add(p.Cnd_ctg_flg);
		p.Cnd_ctg_flg.setNextBeans(p.Cnd_itm_flg);
		p.Cnd_ctg_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.ctg_flg_META);
		p.TtlPanel.add(p.Cnd_itm_flg);
		p.Cnd_itm_flg.setNextBeans(p.Cnd_itm_typ_flg);
		p.Cnd_itm_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.itm_flg_META);
		p.TtlPanel.add(p.Cnd_itm_typ_flg);
		p.Cnd_itm_typ_flg.setNextBeans(p.Cnd_itm_typ_d_flg);
		p.Cnd_itm_typ_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.itm_typ_flg_META);
		p.TtlPanel.add(p.Cnd_itm_typ_d_flg);
		p.Cnd_itm_typ_d_flg.setNextBeans(p.Cnd_lot_flg);
		p.Cnd_itm_typ_d_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.itm_typ_d_flg_META);
		p.TtlPanel.add(p.Cnd_lot_flg);
		p.Cnd_lot_flg.setNextBeans(p.Cnd_sublot_flg);
		p.Cnd_lot_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.lot_flg_META);
		p.TtlPanel.add(p.Cnd_sublot_flg);
		p.Cnd_sublot_flg.setNextBeans(p.Cnd_sno1_flg);
		p.Cnd_sublot_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.sublot_flg_META);
		p.TtlPanel.add(p.Cnd_sno1_flg);
		p.Cnd_sno1_flg.setNextBeans(p.Cnd_sno2_flg);
		p.Cnd_sno1_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.sno1_flg_META);
		p.TtlPanel.add(p.Cnd_sno2_flg);
		p.Cnd_sno2_flg.setNextBeans(p.Cnd_sno3_flg);
		p.Cnd_sno2_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.sno2_flg_META);
		p.TtlPanel.add(p.Cnd_sno3_flg);
		p.Cnd_sno3_flg.setNextBeans(p.Cnd_sno4_flg);
		p.Cnd_sno3_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.sno3_flg_META);
		p.TtlPanel.add(p.Cnd_sno4_flg);
		p.Cnd_sno4_flg.setNextBeans(p.Cnd_itm_mfg_inst_flg);
		p.Cnd_sno4_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.sno4_flg_META);
		p.TtlPanel.add(p.Cnd_itm_mfg_inst_flg);
		p.Cnd_itm_mfg_inst_flg.setNextBeans(p.Cnd_iv_flg);
		p.Cnd_itm_mfg_inst_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.itm_mfg_inst_flg_META);
		p.TtlPanel.add(p.Cnd_iv_flg);
		p.Cnd_iv_flg.setNextBeans(p.Cnd_po_flg);
		p.Cnd_iv_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.iv_flg_META);
		p.TtlPanel.add(p.Cnd_po_flg);
		p.Cnd_po_flg.setNextBeans(p.Cnd_slo_flg);
		p.Cnd_po_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.po_flg_META);
		p.TtlPanel.add(p.Cnd_slo_flg);
		p.Cnd_slo_flg.setNextBeans(p.Cnd_select_all);
		p.Cnd_slo_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0250.CndR.slo_flg_META);
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
	protected static void jbInitCnd2(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTtl(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.TtlPanel.setValueCheck(false);
		p.TtlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [DispDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispDtl(MGBDP_PreAlcChk p) {
		// ブロック関連の初期化
		p.add(p.DispDtlPanel);
		p.DispDtlPanel.add(p.DispDtlScrollPane);
		p.DispDtlPanel.setLastBeans(p.DispDtlTable);
		p.DispDtlScrollPane.setViewportView(p.DispDtlTable);
		p.DispDtlTable.setList(p.getDispDtlL());
		p.DispDtlTable.setStatusColumnVisible(false);
		p.DispDtlPanel.setLayoutPosition("CBC");
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
		MGBDP_PreAlcChk_MC.mcInitScreenOpe((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.mcInitTop((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.mcInitFold((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.mcInitTab1((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.mcInitTab2((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.mcInitTab3((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.mcInitTab5((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.mcInitCnd((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.mcInitCnd2((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.mcInitCnd3((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.mcInitTtl((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.mcInitCtrl((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.mcInitDispDtl((MGBDP_PreAlcChk)this);

		// [SRCH]ステータスのモードの設定
		MGBDP_PreAlcChk_MC.statusInitSRCH_ScreenOpe((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitSRCH_Top((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitSRCH_Fold((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitSRCH_Tab1((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitSRCH_Tab2((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitSRCH_Tab3((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitSRCH_Tab5((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitSRCH_Cnd((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitSRCH_Cnd2((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitSRCH_Cnd3((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitSRCH_Ttl((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitSRCH_Ctrl((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitSRCH_DispDtl((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitSRCH_Key((MGBDP_PreAlcChk)this);

		// [REF]ステータスのモードの設定
		MGBDP_PreAlcChk_MC.statusInitREF_ScreenOpe((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitREF_Top((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitREF_Fold((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitREF_Tab1((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitREF_Tab2((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitREF_Tab3((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitREF_Tab5((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitREF_Cnd((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitREF_Cnd2((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitREF_Cnd3((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitREF_Ttl((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitREF_Ctrl((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitREF_DispDtl((MGBDP_PreAlcChk)this);
		MGBDP_PreAlcChk_MC.statusInitREF_Key((MGBDP_PreAlcChk)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBDP_PreAlcChk p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBDP_PreAlcChk p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBDP_PreAlcChk p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBDP_PreAlcChk p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBDP_PreAlcChk p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MGBDP_PreAlcChk p) {
	}

	/**
	 *  [Tab5]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab5(MGBDP_PreAlcChk p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_PreAlcChk p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_DEST.addAllListener(p);
		p.Cnd_ope_SRC.addAllListener(p);
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_term.setListListener(p);
		p.Cnd_term.addAllListener(p);
		p.Cnd_ym_fr.setListListener(p);
		p.Cnd_ym_fr.addAllListener(p);
		p.Cnd_ym_to.setListListener(p);
		p.Cnd_ym_to.addAllListener(p);
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
		p.Cnd_itm_mfg_inst_no.setListListener(p);
		p.Cnd_itm_mfg_inst_no.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_po_no.setListListener(p);
		p.Cnd_po_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_src_wg_cd.setListListener(p);
		p.Cnd_src_wg_cd.addAllListener(p);
		p.Cnd_src_wg_nm.setListListener(p);
		p.Cnd_src_wg_nm.addAllListener(p);
		p.Cnd_src_alc_ac_cd.setListListener(p);
		p.Cnd_src_alc_ac_cd.addAllListener(p);
		p.Cnd_src_alc_ac_nm.setListListener(p);
		p.Cnd_src_alc_ac_nm.addAllListener(p);
		p.Cnd_src_alc_ac_grp_cd1.setListListener(p);
		p.Cnd_src_alc_ac_grp_cd1.addAllListener(p);
		p.Cnd_src_alc_ac_grp_nm1.setListListener(p);
		p.Cnd_src_alc_ac_grp_nm1.addAllListener(p);
		p.Cnd_src_alc_ac_grp_cd2.setListListener(p);
		p.Cnd_src_alc_ac_grp_cd2.addAllListener(p);
		p.Cnd_src_alc_ac_grp_nm2.setListListener(p);
		p.Cnd_src_alc_ac_grp_nm2.addAllListener(p);
		p.Cnd_src_alc_ac_grp_cd3.setListListener(p);
		p.Cnd_src_alc_ac_grp_cd3.addAllListener(p);
		p.Cnd_src_alc_ac_grp_nm3.setListListener(p);
		p.Cnd_src_alc_ac_grp_nm3.addAllListener(p);
		p.Cnd_dest_wg_cd.setListListener(p);
		p.Cnd_dest_wg_cd.addAllListener(p);
		p.Cnd_dest_wg_nm.setListListener(p);
		p.Cnd_dest_wg_nm.addAllListener(p);
		p.Cnd_dest_alc_ac_cd.setListListener(p);
		p.Cnd_dest_alc_ac_cd.addAllListener(p);
		p.Cnd_dest_alc_ac_nm.setListListener(p);
		p.Cnd_dest_alc_ac_nm.addAllListener(p);
		p.Cnd_dest_alc_ac_grp_cd1.setListListener(p);
		p.Cnd_dest_alc_ac_grp_cd1.addAllListener(p);
		p.Cnd_dest_alc_ac_grp_nm1.setListListener(p);
		p.Cnd_dest_alc_ac_grp_nm1.addAllListener(p);
		p.Cnd_dest_alc_ac_grp_cd2.setListListener(p);
		p.Cnd_dest_alc_ac_grp_cd2.addAllListener(p);
		p.Cnd_dest_alc_ac_grp_nm2.setListListener(p);
		p.Cnd_dest_alc_ac_grp_nm2.addAllListener(p);
		p.Cnd_dest_alc_ac_grp_cd3.setListListener(p);
		p.Cnd_dest_alc_ac_grp_cd3.addAllListener(p);
		p.Cnd_dest_alc_ac_grp_nm3.setListListener(p);
		p.Cnd_dest_alc_ac_grp_nm3.addAllListener(p);
		p.Cnd_pre_alc_lvl_flg.addAllListener(p);
		p.Cnd_src_wg_flg.addAllListener(p);
		p.Cnd_src_alc_ac_flg.addAllListener(p);
		p.Cnd_dest_wg_flg.addAllListener(p);
		p.Cnd_dest_alc_ac_flg.addAllListener(p);
		p.Cnd_ym_flg.addAllListener(p);
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
		p.Cnd_itm_mfg_inst_flg.addAllListener(p);
		p.Cnd_iv_flg.addAllListener(p);
		p.Cnd_po_flg.addAllListener(p);
		p.Cnd_slo_flg.addAllListener(p);
		p.Cnd_select_all.addAllListener(p);
		p.Cnd_select_all.setAPMethodName("doCnd_select_all");
		p.Cnd_deselect_all.addAllListener(p);
		p.Cnd_deselect_all.setAPMethodName("doCnd_deselect_all");
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBDP_PreAlcChk p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MGBDP_PreAlcChk p) {
	}

	/**
	 *  [Ttl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTtl(MGBDP_PreAlcChk p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBDP_PreAlcChk p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispDtl(MGBDP_PreAlcChk p) {
		p.DispDtlTable.addAllListener(p);
		p.columnDispDtl_pre_alc_lvl.addAllListener(p);
		p.columnDispDtl_pre_alc_lvl.setListListener(p);
		p.columnDispDtl_ym.addAllListener(p);
		p.columnDispDtl_ym.setListListener(p);
		p.columnDispDtl_wg_cd.addAllListener(p);
		p.columnDispDtl_wg_cd.setListListener(p);
		p.columnDispDtl_wg_nm.addAllListener(p);
		p.columnDispDtl_wg_nm.setListListener(p);
		p.columnDispDtl_alc_ac_cd.addAllListener(p);
		p.columnDispDtl_alc_ac_cd.setListListener(p);
		p.columnDispDtl_alc_ac_nm.addAllListener(p);
		p.columnDispDtl_alc_ac_nm.setListListener(p);
		p.columnDispDtl_dpt_cd.addAllListener(p);
		p.columnDispDtl_dpt_cd.setListListener(p);
		p.columnDispDtl_dpt_nm.addAllListener(p);
		p.columnDispDtl_dpt_nm.setListListener(p);
		p.columnDispDtl_loc_cd.addAllListener(p);
		p.columnDispDtl_loc_cd.setListListener(p);
		p.columnDispDtl_loc_nm.addAllListener(p);
		p.columnDispDtl_loc_nm.setListListener(p);
		p.columnDispDtl_oper_cd.addAllListener(p);
		p.columnDispDtl_oper_cd.setListListener(p);
		p.columnDispDtl_oper_nm.addAllListener(p);
		p.columnDispDtl_oper_nm.setListListener(p);
		p.columnDispDtl_bp_cd.addAllListener(p);
		p.columnDispDtl_bp_cd.setListListener(p);
		p.columnDispDtl_bp_nm.addAllListener(p);
		p.columnDispDtl_bp_nm.setListListener(p);
		p.columnDispDtl_ctg_cd.addAllListener(p);
		p.columnDispDtl_ctg_cd.setListListener(p);
		p.columnDispDtl_ctg_nm.addAllListener(p);
		p.columnDispDtl_ctg_nm.setListListener(p);
		p.columnDispDtl_itm_typ.addAllListener(p);
		p.columnDispDtl_itm_typ.setListListener(p);
		p.columnDispDtl_itm_typ_nm.addAllListener(p);
		p.columnDispDtl_itm_typ_nm.setListListener(p);
		p.columnDispDtl_itm_typ_d_cd.addAllListener(p);
		p.columnDispDtl_itm_typ_d_cd.setListListener(p);
		p.columnDispDtl_itm_typ_d_nm.addAllListener(p);
		p.columnDispDtl_itm_typ_d_nm.setListListener(p);
		p.columnDispDtl_lot_no.addAllListener(p);
		p.columnDispDtl_lot_no.setListListener(p);
		p.columnDispDtl_sublot_no.addAllListener(p);
		p.columnDispDtl_sublot_no.setListListener(p);
		p.columnDispDtl_sno1.addAllListener(p);
		p.columnDispDtl_sno1.setListListener(p);
		p.columnDispDtl_sno2.addAllListener(p);
		p.columnDispDtl_sno2.setListListener(p);
		p.columnDispDtl_sno3.addAllListener(p);
		p.columnDispDtl_sno3.setListListener(p);
		p.columnDispDtl_sno4.addAllListener(p);
		p.columnDispDtl_sno4.setListListener(p);
		p.columnDispDtl_itm_mfg_inst_no.addAllListener(p);
		p.columnDispDtl_itm_mfg_inst_no.setListListener(p);
		p.columnDispDtl_iv_no.addAllListener(p);
		p.columnDispDtl_iv_no.setListListener(p);
		p.columnDispDtl_po_no.addAllListener(p);
		p.columnDispDtl_po_no.setListListener(p);
		p.columnDispDtl_slo_no.addAllListener(p);
		p.columnDispDtl_slo_no.setListListener(p);
		p.columnDispDtl_wg_cd2.addAllListener(p);
		p.columnDispDtl_wg_cd2.setListListener(p);
		p.columnDispDtl_wg_nm2.addAllListener(p);
		p.columnDispDtl_wg_nm2.setListListener(p);
		p.columnDispDtl_alc_ac_cd2.addAllListener(p);
		p.columnDispDtl_alc_ac_cd2.setListListener(p);
		p.columnDispDtl_alc_ac_nm2.addAllListener(p);
		p.columnDispDtl_alc_ac_nm2.setListListener(p);
		p.columnDispDtl_ttl.addAllListener(p);
		p.columnDispDtl_ttl.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MGBDP_PreAlcChk p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBDP_PreAlcChk p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBDP_PreAlcChk p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MGBDP_PreAlcChk p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MGBDP_PreAlcChk p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MGBDP_PreAlcChk p){

	}

	/**
	 * [SRCH]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab5(MGBDP_PreAlcChk p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBDP_PreAlcChk p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_term.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_ym_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, SRCH, MCMode.ENABLE);
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
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_src_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_src_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_src_alc_ac_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_src_alc_ac_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_src_alc_ac_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_src_alc_ac_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_src_alc_ac_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_src_alc_ac_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_src_alc_ac_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_src_alc_ac_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pre_alc_lvl_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_src_wg_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_src_alc_ac_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dest_wg_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dest_alc_ac_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ym_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_loc_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_oper_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ctg_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_typ_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_typ_d_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_lot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sublot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno1_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno2_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno3_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno4_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_mfg_inst_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_iv_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_po_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_slo_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MGBDP_PreAlcChk p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MGBDP_PreAlcChk p){

	}

	/**
	 * [SRCH]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ttl(MGBDP_PreAlcChk p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBDP_PreAlcChk p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DispDtl(MGBDP_PreAlcChk p){
		p.columnDispDtl_pre_alc_lvl.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_alc_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_alc_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DispDtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDispDtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_itm_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_wg_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_wg_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_alc_ac_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_alc_ac_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDispDtl_ttl.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Key]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Key(MGBDP_PreAlcChk p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBDP_PreAlcChk p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBDP_PreAlcChk p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBDP_PreAlcChk p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBDP_PreAlcChk p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBDP_PreAlcChk p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MGBDP_PreAlcChk p){

	}

	/**
	 * [REF]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab5(MGBDP_PreAlcChk p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBDP_PreAlcChk p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_term.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_ym_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_itm_mfg_inst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_src_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_src_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_src_alc_ac_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_src_alc_ac_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_src_alc_ac_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_src_alc_ac_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_src_alc_ac_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_src_alc_ac_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_src_alc_ac_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_src_alc_ac_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_alc_ac_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pre_alc_lvl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_src_wg_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_src_alc_ac_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dest_wg_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dest_alc_ac_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ym_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dpt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_loc_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_oper_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ctg_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_typ_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_typ_d_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_lot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sublot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno1_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno2_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno3_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno4_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_mfg_inst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_iv_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_po_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_slo_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBDP_PreAlcChk p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MGBDP_PreAlcChk p){

	}

	/**
	 * [REF]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ttl(MGBDP_PreAlcChk p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBDP_PreAlcChk p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[DispDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_DispDtl(MGBDP_PreAlcChk p){
		p.columnDispDtl_pre_alc_lvl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_alc_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_alc_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DispDtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDispDtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_itm_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_wg_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_wg_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_alc_ac_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_alc_ac_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDispDtl_ttl.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Key]ブロックのモードの設定
	 */
	protected static void statusInitREF_Key(MGBDP_PreAlcChk p){

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
		MGBDP_PreAlcChk_MC.setTableConfigDispDtl((MGBDP_PreAlcChk)this);
	}

	/**
	 * [DispDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDispDtl(MGBDP_PreAlcChk p) {
		p.columnDispDtl_pre_alc_lvl.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.pre_alc_lvl_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_pre_alc_lvl);
		p.columnDispDtl_ym.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.ym_META);
		p.columnDispDtl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_ym);
		p.columnDispDtl_wg_cd.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.wg_cd_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_wg_cd);
		p.columnDispDtl_wg_nm.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.wg_nm_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_wg_nm);
		p.columnDispDtl_alc_ac_cd.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.alc_ac_cd_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_alc_ac_cd);
		p.columnDispDtl_alc_ac_nm.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.alc_ac_nm_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_alc_ac_nm);
		p.columnDispDtl_dpt_cd.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.dpt_cd_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_dpt_cd);
		p.columnDispDtl_dpt_nm.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.dpt_nm_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_dpt_nm);
		p.columnDispDtl_loc_cd.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.loc_cd_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_loc_cd);
		p.columnDispDtl_loc_nm.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.loc_nm_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_loc_nm);
		p.columnDispDtl_oper_cd.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.oper_cd_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_oper_cd);
		p.columnDispDtl_oper_nm.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.oper_nm_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_oper_nm);
		p.columnDispDtl_bp_cd.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.bp_cd_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_bp_cd);
		p.columnDispDtl_bp_nm.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.bp_nm_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_bp_nm);
		p.columnDispDtl_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.ctg_cd_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_ctg_cd);
		p.columnDispDtl_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.ctg_nm_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_ctg_nm);
		p.DispDtlTable.addTable(p.DispDtl_itm_p_PPanel.ItmTable);
		p.columnDispDtl_itm_typ.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.itm_typ_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_typ);
		p.columnDispDtl_itm_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.itm_typ_nm_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_typ_nm);
		p.columnDispDtl_itm_typ_d_cd.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.itm_typ_d_cd_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_typ_d_cd);
		p.columnDispDtl_itm_typ_d_nm.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.itm_typ_d_nm_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_typ_d_nm);
		p.columnDispDtl_lot_no.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.lot_no_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_lot_no);
		p.columnDispDtl_sublot_no.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.sublot_no_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_sublot_no);
		p.columnDispDtl_sno1.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.sno1_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_sno1);
		p.columnDispDtl_sno2.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.sno2_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_sno2);
		p.columnDispDtl_sno3.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.sno3_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_sno3);
		p.columnDispDtl_sno4.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.sno4_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_sno4);
		p.columnDispDtl_itm_mfg_inst_no.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.itm_mfg_inst_no_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_itm_mfg_inst_no);
		p.columnDispDtl_iv_no.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.iv_no_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_iv_no);
		p.columnDispDtl_po_no.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.po_no_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_po_no);
		p.columnDispDtl_slo_no.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.slo_no_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_slo_no);
		p.columnDispDtl_wg_cd2.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.wg_cd2_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_wg_cd2);
		p.columnDispDtl_wg_nm2.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.wg_nm2_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_wg_nm2);
		p.columnDispDtl_alc_ac_cd2.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.alc_ac_cd2_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_alc_ac_cd2);
		p.columnDispDtl_alc_ac_nm2.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.alc_ac_nm2_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_alc_ac_nm2);
		p.columnDispDtl_ttl.setMeta(mcframe.clientMGBD.MGBDP0250.DispDtlR.ttl_META);
		p.DispDtlTable.addColumnConfig(p.columnDispDtl_ttl);
		p.cgDispDtl_grp1.add(p.columnDispDtl_pre_alc_lvl);
		p.cgDispDtl_grp1.add(p.columnDispDtl_ym);
		p.cgDispDtl_grp1.add(p.columnDispDtl_wg_cd);
		p.cgDispDtl_grp1.add(p.columnDispDtl_wg_nm);
		p.cgDispDtl_grp1.add(p.columnDispDtl_alc_ac_cd);
		p.cgDispDtl_grp1.add(p.columnDispDtl_alc_ac_nm);
		p.cgDispDtl_grp1.add(p.columnDispDtl_dpt_cd);
		p.cgDispDtl_grp1.add(p.columnDispDtl_dpt_nm);
		p.cgDispDtl_grp1.add(p.columnDispDtl_loc_cd);
		p.cgDispDtl_grp1.add(p.columnDispDtl_loc_nm);
		p.cgDispDtl_grp1.add(p.columnDispDtl_oper_cd);
		p.cgDispDtl_grp1.add(p.columnDispDtl_oper_nm);
		p.cgDispDtl_grp1.add(p.columnDispDtl_bp_cd);
		p.cgDispDtl_grp1.add(p.columnDispDtl_bp_nm);
		p.cgDispDtl_grp1.add(p.columnDispDtl_ctg_cd);
		p.cgDispDtl_grp1.add(p.columnDispDtl_ctg_nm);
		p.cgDispDtl_grp1.add(p.DispDtl_itm_p_PPanel.ItmTable);
		p.cgDispDtl_grp1.add(p.columnDispDtl_itm_typ);
		p.cgDispDtl_grp1.add(p.columnDispDtl_itm_typ_nm);
		p.cgDispDtl_grp1.add(p.columnDispDtl_itm_typ_d_cd);
		p.cgDispDtl_grp1.add(p.columnDispDtl_itm_typ_d_nm);
		p.cgDispDtl_grp1.add(p.columnDispDtl_lot_no);
		p.cgDispDtl_grp1.add(p.columnDispDtl_sublot_no);
		p.cgDispDtl_grp1.add(p.columnDispDtl_sno1);
		p.cgDispDtl_grp1.add(p.columnDispDtl_sno2);
		p.cgDispDtl_grp1.add(p.columnDispDtl_sno3);
		p.cgDispDtl_grp1.add(p.columnDispDtl_sno4);
		p.cgDispDtl_grp1.add(p.columnDispDtl_itm_mfg_inst_no);
		p.cgDispDtl_grp1.add(p.columnDispDtl_iv_no);
		p.cgDispDtl_grp1.add(p.columnDispDtl_po_no);
		p.cgDispDtl_grp1.add(p.columnDispDtl_slo_no);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_grp1);
		p.cgDispDtl_grp2.add(p.columnDispDtl_wg_cd2);
		p.cgDispDtl_grp2.add(p.columnDispDtl_wg_nm2);
		p.cgDispDtl_grp2.add(p.columnDispDtl_alc_ac_cd2);
		p.cgDispDtl_grp2.add(p.columnDispDtl_alc_ac_nm2);
		p.cgDispDtl_grp2.add(p.columnDispDtl_ttl);
		p.DispDtlTable.addColumnGroup(p.cgDispDtl_grp2);
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
		Cnd_src_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_src_wg_cd.getListConfig().setPutter(getCnd_src_wg_cd_ListPutter());
		Cnd_src_alc_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_src_alc_ac_cd.getListConfig().setPutter(getCnd_src_alc_ac_cd_ListPutter());
		Cnd_src_alc_ac_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_src_alc_ac_grp_cd1.getListConfig().setPutter(getCnd_src_alc_ac_grp_cd1_ListPutter());
		Cnd_src_alc_ac_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_src_alc_ac_grp_cd2.getListConfig().setPutter(getCnd_src_alc_ac_grp_cd2_ListPutter());
		Cnd_src_alc_ac_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_src_alc_ac_grp_cd3.getListConfig().setPutter(getCnd_src_alc_ac_grp_cd3_ListPutter());
		Cnd_dest_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dest_wg_cd.getListConfig().setPutter(getCnd_dest_wg_cd_ListPutter());
		Cnd_dest_alc_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dest_alc_ac_cd.getListConfig().setPutter(getCnd_dest_alc_ac_cd_ListPutter());
		Cnd_dest_alc_ac_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dest_alc_ac_grp_cd1.getListConfig().setPutter(getCnd_dest_alc_ac_grp_cd1_ListPutter());
		Cnd_dest_alc_ac_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dest_alc_ac_grp_cd2.getListConfig().setPutter(getCnd_dest_alc_ac_grp_cd2_ListPutter());
		Cnd_dest_alc_ac_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dest_alc_ac_grp_cd3.getListConfig().setPutter(getCnd_dest_alc_ac_grp_cd3_ListPutter());
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
	 * [Cnd_src_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_src_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Cnd_src_alc_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_src_alc_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAc");
		return lp;
	}
	 
	/**
	 * [Cnd_src_alc_ac_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_src_alc_ac_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_src_alc_ac_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_src_alc_ac_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_src_alc_ac_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_src_alc_ac_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_alc_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_alc_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAc");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_alc_ac_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_alc_ac_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_alc_ac_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_alc_ac_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_alc_ac_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_alc_ac_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp3");
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
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_oper_cd) return getCnd_oper_cd(row, info);
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		if(combo == Cnd_ctg_cd) return getCnd_ctg_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_src_wg_cd) return getCnd_src_wg_cd(row, info);
		if(combo == Cnd_src_alc_ac_cd) return getCnd_src_alc_ac_cd(row, info);
		if(combo == Cnd_src_alc_ac_grp_cd1) return getCnd_src_alc_ac_grp_cd1(row, info);
		if(combo == Cnd_src_alc_ac_grp_cd2) return getCnd_src_alc_ac_grp_cd2(row, info);
		if(combo == Cnd_src_alc_ac_grp_cd3) return getCnd_src_alc_ac_grp_cd3(row, info);
		if(combo == Cnd_dest_wg_cd) return getCnd_dest_wg_cd(row, info);
		if(combo == Cnd_dest_alc_ac_cd) return getCnd_dest_alc_ac_cd(row, info);
		if(combo == Cnd_dest_alc_ac_grp_cd1) return getCnd_dest_alc_ac_grp_cd1(row, info);
		if(combo == Cnd_dest_alc_ac_grp_cd2) return getCnd_dest_alc_ac_grp_cd2(row, info);
		if(combo == Cnd_dest_alc_ac_grp_cd3) return getCnd_dest_alc_ac_grp_cd3(row, info);
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
		if (vc == DispDtlTable) return doDispDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_term) return doCnd_term_VC(info);
		if (vc == Cnd_ym_fr) return doCnd_ym_fr_VC(info);
		if (vc == Cnd_ym_to) return doCnd_ym_to_VC(info);
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
		if (vc == Cnd_itm_mfg_inst_no) return doCnd_itm_mfg_inst_no_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_po_no) return doCnd_po_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_src_wg_cd) return doCnd_src_wg_cd_VC(info);
		if (vc == Cnd_src_wg_nm) return doCnd_src_wg_nm_VC(info);
		if (vc == Cnd_src_alc_ac_cd) return doCnd_src_alc_ac_cd_VC(info);
		if (vc == Cnd_src_alc_ac_nm) return doCnd_src_alc_ac_nm_VC(info);
		if (vc == Cnd_src_alc_ac_grp_cd1) return doCnd_src_alc_ac_grp_cd1_VC(info);
		if (vc == Cnd_src_alc_ac_grp_nm1) return doCnd_src_alc_ac_grp_nm1_VC(info);
		if (vc == Cnd_src_alc_ac_grp_cd2) return doCnd_src_alc_ac_grp_cd2_VC(info);
		if (vc == Cnd_src_alc_ac_grp_nm2) return doCnd_src_alc_ac_grp_nm2_VC(info);
		if (vc == Cnd_src_alc_ac_grp_cd3) return doCnd_src_alc_ac_grp_cd3_VC(info);
		if (vc == Cnd_src_alc_ac_grp_nm3) return doCnd_src_alc_ac_grp_nm3_VC(info);
		if (vc == Cnd_dest_wg_cd) return doCnd_dest_wg_cd_VC(info);
		if (vc == Cnd_dest_wg_nm) return doCnd_dest_wg_nm_VC(info);
		if (vc == Cnd_dest_alc_ac_cd) return doCnd_dest_alc_ac_cd_VC(info);
		if (vc == Cnd_dest_alc_ac_nm) return doCnd_dest_alc_ac_nm_VC(info);
		if (vc == Cnd_dest_alc_ac_grp_cd1) return doCnd_dest_alc_ac_grp_cd1_VC(info);
		if (vc == Cnd_dest_alc_ac_grp_nm1) return doCnd_dest_alc_ac_grp_nm1_VC(info);
		if (vc == Cnd_dest_alc_ac_grp_cd2) return doCnd_dest_alc_ac_grp_cd2_VC(info);
		if (vc == Cnd_dest_alc_ac_grp_nm2) return doCnd_dest_alc_ac_grp_nm2_VC(info);
		if (vc == Cnd_dest_alc_ac_grp_cd3) return doCnd_dest_alc_ac_grp_cd3_VC(info);
		if (vc == Cnd_dest_alc_ac_grp_nm3) return doCnd_dest_alc_ac_grp_nm3_VC(info);
		if (vc == Cnd_pre_alc_lvl_flg) return doCnd_pre_alc_lvl_flg_VC(info);
		if (vc == Cnd_src_wg_flg) return doCnd_src_wg_flg_VC(info);
		if (vc == Cnd_src_alc_ac_flg) return doCnd_src_alc_ac_flg_VC(info);
		if (vc == Cnd_dest_wg_flg) return doCnd_dest_wg_flg_VC(info);
		if (vc == Cnd_dest_alc_ac_flg) return doCnd_dest_alc_ac_flg_VC(info);
		if (vc == Cnd_ym_flg) return doCnd_ym_flg_VC(info);
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
		if (vc == Cnd_itm_mfg_inst_flg) return doCnd_itm_mfg_inst_flg_VC(info);
		if (vc == Cnd_iv_flg) return doCnd_iv_flg_VC(info);
		if (vc == Cnd_po_flg) return doCnd_po_flg_VC(info);
		if (vc == Cnd_slo_flg) return doCnd_slo_flg_VC(info);
		if (vc == columnDispDtl_pre_alc_lvl) return doDispDtl_pre_alc_lvl_VC(info);
		if (vc == columnDispDtl_ym) return doDispDtl_ym_VC(info);
		if (vc == columnDispDtl_wg_cd) return doDispDtl_wg_cd_VC(info);
		if (vc == columnDispDtl_wg_nm) return doDispDtl_wg_nm_VC(info);
		if (vc == columnDispDtl_alc_ac_cd) return doDispDtl_alc_ac_cd_VC(info);
		if (vc == columnDispDtl_alc_ac_nm) return doDispDtl_alc_ac_nm_VC(info);
		if (vc == columnDispDtl_dpt_cd) return doDispDtl_dpt_cd_VC(info);
		if (vc == columnDispDtl_dpt_nm) return doDispDtl_dpt_nm_VC(info);
		if (vc == columnDispDtl_loc_cd) return doDispDtl_loc_cd_VC(info);
		if (vc == columnDispDtl_loc_nm) return doDispDtl_loc_nm_VC(info);
		if (vc == columnDispDtl_oper_cd) return doDispDtl_oper_cd_VC(info);
		if (vc == columnDispDtl_oper_nm) return doDispDtl_oper_nm_VC(info);
		if (vc == columnDispDtl_bp_cd) return doDispDtl_bp_cd_VC(info);
		if (vc == columnDispDtl_bp_nm) return doDispDtl_bp_nm_VC(info);
		if (vc == columnDispDtl_ctg_cd) return doDispDtl_ctg_cd_VC(info);
		if (vc == columnDispDtl_ctg_nm) return doDispDtl_ctg_nm_VC(info);
		if (vc == columnDispDtl_itm_typ) return doDispDtl_itm_typ_VC(info);
		if (vc == columnDispDtl_itm_typ_nm) return doDispDtl_itm_typ_nm_VC(info);
		if (vc == columnDispDtl_itm_typ_d_cd) return doDispDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDispDtl_itm_typ_d_nm) return doDispDtl_itm_typ_d_nm_VC(info);
		if (vc == columnDispDtl_lot_no) return doDispDtl_lot_no_VC(info);
		if (vc == columnDispDtl_sublot_no) return doDispDtl_sublot_no_VC(info);
		if (vc == columnDispDtl_sno1) return doDispDtl_sno1_VC(info);
		if (vc == columnDispDtl_sno2) return doDispDtl_sno2_VC(info);
		if (vc == columnDispDtl_sno3) return doDispDtl_sno3_VC(info);
		if (vc == columnDispDtl_sno4) return doDispDtl_sno4_VC(info);
		if (vc == columnDispDtl_itm_mfg_inst_no) return doDispDtl_itm_mfg_inst_no_VC(info);
		if (vc == columnDispDtl_iv_no) return doDispDtl_iv_no_VC(info);
		if (vc == columnDispDtl_po_no) return doDispDtl_po_no_VC(info);
		if (vc == columnDispDtl_slo_no) return doDispDtl_slo_no_VC(info);
		if (vc == columnDispDtl_wg_cd2) return doDispDtl_wg_cd2_VC(info);
		if (vc == columnDispDtl_wg_nm2) return doDispDtl_wg_nm2_VC(info);
		if (vc == columnDispDtl_alc_ac_cd2) return doDispDtl_alc_ac_cd2_VC(info);
		if (vc == columnDispDtl_alc_ac_nm2) return doDispDtl_alc_ac_nm2_VC(info);
		if (vc == columnDispDtl_ttl) return doDispDtl_ttl_VC(info);
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
	 * [DispDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_mfg_inst_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[src_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_src_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[src_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_src_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_src_alc_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_src_alc_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_src_alc_ac_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_src_alc_ac_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_src_alc_ac_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_src_alc_ac_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_src_alc_ac_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_src_alc_ac_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_alc_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_alc_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_alc_ac_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_alc_ac_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_alc_ac_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_alc_ac_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_alc_ac_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_alc_ac_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pre_alc_lvl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_lvl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[src_wg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_src_wg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_src_alc_ac_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_wg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_wg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_alc_ac_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_mfg_inst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[pre_alc_lvl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_pre_alc_lvl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[alc_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_alc_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[alc_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_alc_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[itm_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_itm_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[wg_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_wg_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[wg_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_wg_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[alc_ac_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_alc_ac_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[alc_ac_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_alc_ac_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispDtl]パネルの[ttl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispDtl_ttl_VC(MCEventInfo info){
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
		else if (nc == DispDtlTable) doDispDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_term) doCnd_term_NC(info);
		else if (nc == Cnd_ym_fr) doCnd_ym_fr_NC(info);
		else if (nc == Cnd_ym_to) doCnd_ym_to_NC(info);
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
		else if (nc == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_po_no) doCnd_po_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_src_wg_cd) doCnd_src_wg_cd_NC(info);
		else if (nc == Cnd_src_wg_nm) doCnd_src_wg_nm_NC(info);
		else if (nc == Cnd_src_alc_ac_cd) doCnd_src_alc_ac_cd_NC(info);
		else if (nc == Cnd_src_alc_ac_nm) doCnd_src_alc_ac_nm_NC(info);
		else if (nc == Cnd_src_alc_ac_grp_cd1) doCnd_src_alc_ac_grp_cd1_NC(info);
		else if (nc == Cnd_src_alc_ac_grp_nm1) doCnd_src_alc_ac_grp_nm1_NC(info);
		else if (nc == Cnd_src_alc_ac_grp_cd2) doCnd_src_alc_ac_grp_cd2_NC(info);
		else if (nc == Cnd_src_alc_ac_grp_nm2) doCnd_src_alc_ac_grp_nm2_NC(info);
		else if (nc == Cnd_src_alc_ac_grp_cd3) doCnd_src_alc_ac_grp_cd3_NC(info);
		else if (nc == Cnd_src_alc_ac_grp_nm3) doCnd_src_alc_ac_grp_nm3_NC(info);
		else if (nc == Cnd_dest_wg_cd) doCnd_dest_wg_cd_NC(info);
		else if (nc == Cnd_dest_wg_nm) doCnd_dest_wg_nm_NC(info);
		else if (nc == Cnd_dest_alc_ac_cd) doCnd_dest_alc_ac_cd_NC(info);
		else if (nc == Cnd_dest_alc_ac_nm) doCnd_dest_alc_ac_nm_NC(info);
		else if (nc == Cnd_dest_alc_ac_grp_cd1) doCnd_dest_alc_ac_grp_cd1_NC(info);
		else if (nc == Cnd_dest_alc_ac_grp_nm1) doCnd_dest_alc_ac_grp_nm1_NC(info);
		else if (nc == Cnd_dest_alc_ac_grp_cd2) doCnd_dest_alc_ac_grp_cd2_NC(info);
		else if (nc == Cnd_dest_alc_ac_grp_nm2) doCnd_dest_alc_ac_grp_nm2_NC(info);
		else if (nc == Cnd_dest_alc_ac_grp_cd3) doCnd_dest_alc_ac_grp_cd3_NC(info);
		else if (nc == Cnd_dest_alc_ac_grp_nm3) doCnd_dest_alc_ac_grp_nm3_NC(info);
		else if (nc == Cnd_pre_alc_lvl_flg) doCnd_pre_alc_lvl_flg_NC(info);
		else if (nc == Cnd_src_wg_flg) doCnd_src_wg_flg_NC(info);
		else if (nc == Cnd_src_alc_ac_flg) doCnd_src_alc_ac_flg_NC(info);
		else if (nc == Cnd_dest_wg_flg) doCnd_dest_wg_flg_NC(info);
		else if (nc == Cnd_dest_alc_ac_flg) doCnd_dest_alc_ac_flg_NC(info);
		else if (nc == Cnd_ym_flg) doCnd_ym_flg_NC(info);
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
		else if (nc == Cnd_itm_mfg_inst_flg) doCnd_itm_mfg_inst_flg_NC(info);
		else if (nc == Cnd_iv_flg) doCnd_iv_flg_NC(info);
		else if (nc == Cnd_po_flg) doCnd_po_flg_NC(info);
		else if (nc == Cnd_slo_flg) doCnd_slo_flg_NC(info);
		else if (nc == columnDispDtl_pre_alc_lvl) doDispDtl_pre_alc_lvl_NC(info);
		else if (nc == columnDispDtl_ym) doDispDtl_ym_NC(info);
		else if (nc == columnDispDtl_wg_cd) doDispDtl_wg_cd_NC(info);
		else if (nc == columnDispDtl_wg_nm) doDispDtl_wg_nm_NC(info);
		else if (nc == columnDispDtl_alc_ac_cd) doDispDtl_alc_ac_cd_NC(info);
		else if (nc == columnDispDtl_alc_ac_nm) doDispDtl_alc_ac_nm_NC(info);
		else if (nc == columnDispDtl_dpt_cd) doDispDtl_dpt_cd_NC(info);
		else if (nc == columnDispDtl_dpt_nm) doDispDtl_dpt_nm_NC(info);
		else if (nc == columnDispDtl_loc_cd) doDispDtl_loc_cd_NC(info);
		else if (nc == columnDispDtl_loc_nm) doDispDtl_loc_nm_NC(info);
		else if (nc == columnDispDtl_oper_cd) doDispDtl_oper_cd_NC(info);
		else if (nc == columnDispDtl_oper_nm) doDispDtl_oper_nm_NC(info);
		else if (nc == columnDispDtl_bp_cd) doDispDtl_bp_cd_NC(info);
		else if (nc == columnDispDtl_bp_nm) doDispDtl_bp_nm_NC(info);
		else if (nc == columnDispDtl_ctg_cd) doDispDtl_ctg_cd_NC(info);
		else if (nc == columnDispDtl_ctg_nm) doDispDtl_ctg_nm_NC(info);
		else if (nc == columnDispDtl_itm_typ) doDispDtl_itm_typ_NC(info);
		else if (nc == columnDispDtl_itm_typ_nm) doDispDtl_itm_typ_nm_NC(info);
		else if (nc == columnDispDtl_itm_typ_d_cd) doDispDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDispDtl_itm_typ_d_nm) doDispDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnDispDtl_lot_no) doDispDtl_lot_no_NC(info);
		else if (nc == columnDispDtl_sublot_no) doDispDtl_sublot_no_NC(info);
		else if (nc == columnDispDtl_sno1) doDispDtl_sno1_NC(info);
		else if (nc == columnDispDtl_sno2) doDispDtl_sno2_NC(info);
		else if (nc == columnDispDtl_sno3) doDispDtl_sno3_NC(info);
		else if (nc == columnDispDtl_sno4) doDispDtl_sno4_NC(info);
		else if (nc == columnDispDtl_itm_mfg_inst_no) doDispDtl_itm_mfg_inst_no_NC(info);
		else if (nc == columnDispDtl_iv_no) doDispDtl_iv_no_NC(info);
		else if (nc == columnDispDtl_po_no) doDispDtl_po_no_NC(info);
		else if (nc == columnDispDtl_slo_no) doDispDtl_slo_no_NC(info);
		else if (nc == columnDispDtl_wg_cd2) doDispDtl_wg_cd2_NC(info);
		else if (nc == columnDispDtl_wg_nm2) doDispDtl_wg_nm2_NC(info);
		else if (nc == columnDispDtl_alc_ac_cd2) doDispDtl_alc_ac_cd2_NC(info);
		else if (nc == columnDispDtl_alc_ac_nm2) doDispDtl_alc_ac_nm2_NC(info);
		else if (nc == columnDispDtl_ttl) doDispDtl_ttl_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_lvl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_lvl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_wg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_wg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_flg_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[pre_alc_lvl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_pre_alc_lvl_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ym_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno1_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno2_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno3_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno4_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_po_no_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_cd2_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_nm2_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_cd2_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_nm2_NC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ttl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ttl_NC(MCEventInfo info){
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
		else if (ne == DispDtlTable) doDispDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_term) doCnd_term_NE(info);
		else if (ne == Cnd_ym_fr) doCnd_ym_fr_NE(info);
		else if (ne == Cnd_ym_to) doCnd_ym_to_NE(info);
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
		else if (ne == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_po_no) doCnd_po_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_src_wg_cd) doCnd_src_wg_cd_NE(info);
		else if (ne == Cnd_src_wg_nm) doCnd_src_wg_nm_NE(info);
		else if (ne == Cnd_src_alc_ac_cd) doCnd_src_alc_ac_cd_NE(info);
		else if (ne == Cnd_src_alc_ac_nm) doCnd_src_alc_ac_nm_NE(info);
		else if (ne == Cnd_src_alc_ac_grp_cd1) doCnd_src_alc_ac_grp_cd1_NE(info);
		else if (ne == Cnd_src_alc_ac_grp_nm1) doCnd_src_alc_ac_grp_nm1_NE(info);
		else if (ne == Cnd_src_alc_ac_grp_cd2) doCnd_src_alc_ac_grp_cd2_NE(info);
		else if (ne == Cnd_src_alc_ac_grp_nm2) doCnd_src_alc_ac_grp_nm2_NE(info);
		else if (ne == Cnd_src_alc_ac_grp_cd3) doCnd_src_alc_ac_grp_cd3_NE(info);
		else if (ne == Cnd_src_alc_ac_grp_nm3) doCnd_src_alc_ac_grp_nm3_NE(info);
		else if (ne == Cnd_dest_wg_cd) doCnd_dest_wg_cd_NE(info);
		else if (ne == Cnd_dest_wg_nm) doCnd_dest_wg_nm_NE(info);
		else if (ne == Cnd_dest_alc_ac_cd) doCnd_dest_alc_ac_cd_NE(info);
		else if (ne == Cnd_dest_alc_ac_nm) doCnd_dest_alc_ac_nm_NE(info);
		else if (ne == Cnd_dest_alc_ac_grp_cd1) doCnd_dest_alc_ac_grp_cd1_NE(info);
		else if (ne == Cnd_dest_alc_ac_grp_nm1) doCnd_dest_alc_ac_grp_nm1_NE(info);
		else if (ne == Cnd_dest_alc_ac_grp_cd2) doCnd_dest_alc_ac_grp_cd2_NE(info);
		else if (ne == Cnd_dest_alc_ac_grp_nm2) doCnd_dest_alc_ac_grp_nm2_NE(info);
		else if (ne == Cnd_dest_alc_ac_grp_cd3) doCnd_dest_alc_ac_grp_cd3_NE(info);
		else if (ne == Cnd_dest_alc_ac_grp_nm3) doCnd_dest_alc_ac_grp_nm3_NE(info);
		else if (ne == Cnd_pre_alc_lvl_flg) doCnd_pre_alc_lvl_flg_NE(info);
		else if (ne == Cnd_src_wg_flg) doCnd_src_wg_flg_NE(info);
		else if (ne == Cnd_src_alc_ac_flg) doCnd_src_alc_ac_flg_NE(info);
		else if (ne == Cnd_dest_wg_flg) doCnd_dest_wg_flg_NE(info);
		else if (ne == Cnd_dest_alc_ac_flg) doCnd_dest_alc_ac_flg_NE(info);
		else if (ne == Cnd_ym_flg) doCnd_ym_flg_NE(info);
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
		else if (ne == Cnd_itm_mfg_inst_flg) doCnd_itm_mfg_inst_flg_NE(info);
		else if (ne == Cnd_iv_flg) doCnd_iv_flg_NE(info);
		else if (ne == Cnd_po_flg) doCnd_po_flg_NE(info);
		else if (ne == Cnd_slo_flg) doCnd_slo_flg_NE(info);
		else if (ne == columnDispDtl_pre_alc_lvl) doDispDtl_pre_alc_lvl_NE(info);
		else if (ne == columnDispDtl_ym) doDispDtl_ym_NE(info);
		else if (ne == columnDispDtl_wg_cd) doDispDtl_wg_cd_NE(info);
		else if (ne == columnDispDtl_wg_nm) doDispDtl_wg_nm_NE(info);
		else if (ne == columnDispDtl_alc_ac_cd) doDispDtl_alc_ac_cd_NE(info);
		else if (ne == columnDispDtl_alc_ac_nm) doDispDtl_alc_ac_nm_NE(info);
		else if (ne == columnDispDtl_dpt_cd) doDispDtl_dpt_cd_NE(info);
		else if (ne == columnDispDtl_dpt_nm) doDispDtl_dpt_nm_NE(info);
		else if (ne == columnDispDtl_loc_cd) doDispDtl_loc_cd_NE(info);
		else if (ne == columnDispDtl_loc_nm) doDispDtl_loc_nm_NE(info);
		else if (ne == columnDispDtl_oper_cd) doDispDtl_oper_cd_NE(info);
		else if (ne == columnDispDtl_oper_nm) doDispDtl_oper_nm_NE(info);
		else if (ne == columnDispDtl_bp_cd) doDispDtl_bp_cd_NE(info);
		else if (ne == columnDispDtl_bp_nm) doDispDtl_bp_nm_NE(info);
		else if (ne == columnDispDtl_ctg_cd) doDispDtl_ctg_cd_NE(info);
		else if (ne == columnDispDtl_ctg_nm) doDispDtl_ctg_nm_NE(info);
		else if (ne == columnDispDtl_itm_typ) doDispDtl_itm_typ_NE(info);
		else if (ne == columnDispDtl_itm_typ_nm) doDispDtl_itm_typ_nm_NE(info);
		else if (ne == columnDispDtl_itm_typ_d_cd) doDispDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDispDtl_itm_typ_d_nm) doDispDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnDispDtl_lot_no) doDispDtl_lot_no_NE(info);
		else if (ne == columnDispDtl_sublot_no) doDispDtl_sublot_no_NE(info);
		else if (ne == columnDispDtl_sno1) doDispDtl_sno1_NE(info);
		else if (ne == columnDispDtl_sno2) doDispDtl_sno2_NE(info);
		else if (ne == columnDispDtl_sno3) doDispDtl_sno3_NE(info);
		else if (ne == columnDispDtl_sno4) doDispDtl_sno4_NE(info);
		else if (ne == columnDispDtl_itm_mfg_inst_no) doDispDtl_itm_mfg_inst_no_NE(info);
		else if (ne == columnDispDtl_iv_no) doDispDtl_iv_no_NE(info);
		else if (ne == columnDispDtl_po_no) doDispDtl_po_no_NE(info);
		else if (ne == columnDispDtl_slo_no) doDispDtl_slo_no_NE(info);
		else if (ne == columnDispDtl_wg_cd2) doDispDtl_wg_cd2_NE(info);
		else if (ne == columnDispDtl_wg_nm2) doDispDtl_wg_nm2_NE(info);
		else if (ne == columnDispDtl_alc_ac_cd2) doDispDtl_alc_ac_cd2_NE(info);
		else if (ne == columnDispDtl_alc_ac_nm2) doDispDtl_alc_ac_nm2_NE(info);
		else if (ne == columnDispDtl_ttl) doDispDtl_ttl_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_lvl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_lvl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_wg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_wg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_flg_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[pre_alc_lvl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_pre_alc_lvl_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ym_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno1_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno2_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno3_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno4_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_po_no_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_cd2_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_nm2_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_cd2_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_nm2_NE(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ttl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ttl_NE(MCEventInfo info){
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
		else if (nx == DispDtlTable) doDispDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_term) doCnd_term_NX(info);
		else if (nx == Cnd_ym_fr) doCnd_ym_fr_NX(info);
		else if (nx == Cnd_ym_to) doCnd_ym_to_NX(info);
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
		else if (nx == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_po_no) doCnd_po_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_src_wg_cd) doCnd_src_wg_cd_NX(info);
		else if (nx == Cnd_src_wg_nm) doCnd_src_wg_nm_NX(info);
		else if (nx == Cnd_src_alc_ac_cd) doCnd_src_alc_ac_cd_NX(info);
		else if (nx == Cnd_src_alc_ac_nm) doCnd_src_alc_ac_nm_NX(info);
		else if (nx == Cnd_src_alc_ac_grp_cd1) doCnd_src_alc_ac_grp_cd1_NX(info);
		else if (nx == Cnd_src_alc_ac_grp_nm1) doCnd_src_alc_ac_grp_nm1_NX(info);
		else if (nx == Cnd_src_alc_ac_grp_cd2) doCnd_src_alc_ac_grp_cd2_NX(info);
		else if (nx == Cnd_src_alc_ac_grp_nm2) doCnd_src_alc_ac_grp_nm2_NX(info);
		else if (nx == Cnd_src_alc_ac_grp_cd3) doCnd_src_alc_ac_grp_cd3_NX(info);
		else if (nx == Cnd_src_alc_ac_grp_nm3) doCnd_src_alc_ac_grp_nm3_NX(info);
		else if (nx == Cnd_dest_wg_cd) doCnd_dest_wg_cd_NX(info);
		else if (nx == Cnd_dest_wg_nm) doCnd_dest_wg_nm_NX(info);
		else if (nx == Cnd_dest_alc_ac_cd) doCnd_dest_alc_ac_cd_NX(info);
		else if (nx == Cnd_dest_alc_ac_nm) doCnd_dest_alc_ac_nm_NX(info);
		else if (nx == Cnd_dest_alc_ac_grp_cd1) doCnd_dest_alc_ac_grp_cd1_NX(info);
		else if (nx == Cnd_dest_alc_ac_grp_nm1) doCnd_dest_alc_ac_grp_nm1_NX(info);
		else if (nx == Cnd_dest_alc_ac_grp_cd2) doCnd_dest_alc_ac_grp_cd2_NX(info);
		else if (nx == Cnd_dest_alc_ac_grp_nm2) doCnd_dest_alc_ac_grp_nm2_NX(info);
		else if (nx == Cnd_dest_alc_ac_grp_cd3) doCnd_dest_alc_ac_grp_cd3_NX(info);
		else if (nx == Cnd_dest_alc_ac_grp_nm3) doCnd_dest_alc_ac_grp_nm3_NX(info);
		else if (nx == Cnd_pre_alc_lvl_flg) doCnd_pre_alc_lvl_flg_NX(info);
		else if (nx == Cnd_src_wg_flg) doCnd_src_wg_flg_NX(info);
		else if (nx == Cnd_src_alc_ac_flg) doCnd_src_alc_ac_flg_NX(info);
		else if (nx == Cnd_dest_wg_flg) doCnd_dest_wg_flg_NX(info);
		else if (nx == Cnd_dest_alc_ac_flg) doCnd_dest_alc_ac_flg_NX(info);
		else if (nx == Cnd_ym_flg) doCnd_ym_flg_NX(info);
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
		else if (nx == Cnd_itm_mfg_inst_flg) doCnd_itm_mfg_inst_flg_NX(info);
		else if (nx == Cnd_iv_flg) doCnd_iv_flg_NX(info);
		else if (nx == Cnd_po_flg) doCnd_po_flg_NX(info);
		else if (nx == Cnd_slo_flg) doCnd_slo_flg_NX(info);
		else if (nx == columnDispDtl_pre_alc_lvl) doDispDtl_pre_alc_lvl_NX(info);
		else if (nx == columnDispDtl_ym) doDispDtl_ym_NX(info);
		else if (nx == columnDispDtl_wg_cd) doDispDtl_wg_cd_NX(info);
		else if (nx == columnDispDtl_wg_nm) doDispDtl_wg_nm_NX(info);
		else if (nx == columnDispDtl_alc_ac_cd) doDispDtl_alc_ac_cd_NX(info);
		else if (nx == columnDispDtl_alc_ac_nm) doDispDtl_alc_ac_nm_NX(info);
		else if (nx == columnDispDtl_dpt_cd) doDispDtl_dpt_cd_NX(info);
		else if (nx == columnDispDtl_dpt_nm) doDispDtl_dpt_nm_NX(info);
		else if (nx == columnDispDtl_loc_cd) doDispDtl_loc_cd_NX(info);
		else if (nx == columnDispDtl_loc_nm) doDispDtl_loc_nm_NX(info);
		else if (nx == columnDispDtl_oper_cd) doDispDtl_oper_cd_NX(info);
		else if (nx == columnDispDtl_oper_nm) doDispDtl_oper_nm_NX(info);
		else if (nx == columnDispDtl_bp_cd) doDispDtl_bp_cd_NX(info);
		else if (nx == columnDispDtl_bp_nm) doDispDtl_bp_nm_NX(info);
		else if (nx == columnDispDtl_ctg_cd) doDispDtl_ctg_cd_NX(info);
		else if (nx == columnDispDtl_ctg_nm) doDispDtl_ctg_nm_NX(info);
		else if (nx == columnDispDtl_itm_typ) doDispDtl_itm_typ_NX(info);
		else if (nx == columnDispDtl_itm_typ_nm) doDispDtl_itm_typ_nm_NX(info);
		else if (nx == columnDispDtl_itm_typ_d_cd) doDispDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDispDtl_itm_typ_d_nm) doDispDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnDispDtl_lot_no) doDispDtl_lot_no_NX(info);
		else if (nx == columnDispDtl_sublot_no) doDispDtl_sublot_no_NX(info);
		else if (nx == columnDispDtl_sno1) doDispDtl_sno1_NX(info);
		else if (nx == columnDispDtl_sno2) doDispDtl_sno2_NX(info);
		else if (nx == columnDispDtl_sno3) doDispDtl_sno3_NX(info);
		else if (nx == columnDispDtl_sno4) doDispDtl_sno4_NX(info);
		else if (nx == columnDispDtl_itm_mfg_inst_no) doDispDtl_itm_mfg_inst_no_NX(info);
		else if (nx == columnDispDtl_iv_no) doDispDtl_iv_no_NX(info);
		else if (nx == columnDispDtl_po_no) doDispDtl_po_no_NX(info);
		else if (nx == columnDispDtl_slo_no) doDispDtl_slo_no_NX(info);
		else if (nx == columnDispDtl_wg_cd2) doDispDtl_wg_cd2_NX(info);
		else if (nx == columnDispDtl_wg_nm2) doDispDtl_wg_nm2_NX(info);
		else if (nx == columnDispDtl_alc_ac_cd2) doDispDtl_alc_ac_cd2_NX(info);
		else if (nx == columnDispDtl_alc_ac_nm2) doDispDtl_alc_ac_nm2_NX(info);
		else if (nx == columnDispDtl_ttl) doDispDtl_ttl_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_lvl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_lvl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_wg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_wg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_flg_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[pre_alc_lvl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_pre_alc_lvl_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ym_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno1_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno2_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno3_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno4_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_po_no_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_cd2_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_nm2_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_cd2_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_nm2_NX(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ttl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ttl_NX(MCEventInfo info){
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
		else if (lc == Cnd_ym_fr) doCnd_ym_fr_LC(info);
		else if (lc == Cnd_ym_to) doCnd_ym_to_LC(info);
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
		else if (lc == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_po_no) doCnd_po_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_src_wg_cd) doCnd_src_wg_cd_LC(info);
		else if (lc == Cnd_src_wg_nm) doCnd_src_wg_nm_LC(info);
		else if (lc == Cnd_src_alc_ac_cd) doCnd_src_alc_ac_cd_LC(info);
		else if (lc == Cnd_src_alc_ac_nm) doCnd_src_alc_ac_nm_LC(info);
		else if (lc == Cnd_src_alc_ac_grp_cd1) doCnd_src_alc_ac_grp_cd1_LC(info);
		else if (lc == Cnd_src_alc_ac_grp_nm1) doCnd_src_alc_ac_grp_nm1_LC(info);
		else if (lc == Cnd_src_alc_ac_grp_cd2) doCnd_src_alc_ac_grp_cd2_LC(info);
		else if (lc == Cnd_src_alc_ac_grp_nm2) doCnd_src_alc_ac_grp_nm2_LC(info);
		else if (lc == Cnd_src_alc_ac_grp_cd3) doCnd_src_alc_ac_grp_cd3_LC(info);
		else if (lc == Cnd_src_alc_ac_grp_nm3) doCnd_src_alc_ac_grp_nm3_LC(info);
		else if (lc == Cnd_dest_wg_cd) doCnd_dest_wg_cd_LC(info);
		else if (lc == Cnd_dest_wg_nm) doCnd_dest_wg_nm_LC(info);
		else if (lc == Cnd_dest_alc_ac_cd) doCnd_dest_alc_ac_cd_LC(info);
		else if (lc == Cnd_dest_alc_ac_nm) doCnd_dest_alc_ac_nm_LC(info);
		else if (lc == Cnd_dest_alc_ac_grp_cd1) doCnd_dest_alc_ac_grp_cd1_LC(info);
		else if (lc == Cnd_dest_alc_ac_grp_nm1) doCnd_dest_alc_ac_grp_nm1_LC(info);
		else if (lc == Cnd_dest_alc_ac_grp_cd2) doCnd_dest_alc_ac_grp_cd2_LC(info);
		else if (lc == Cnd_dest_alc_ac_grp_nm2) doCnd_dest_alc_ac_grp_nm2_LC(info);
		else if (lc == Cnd_dest_alc_ac_grp_cd3) doCnd_dest_alc_ac_grp_cd3_LC(info);
		else if (lc == Cnd_dest_alc_ac_grp_nm3) doCnd_dest_alc_ac_grp_nm3_LC(info);
		else if (lc == columnDispDtl_pre_alc_lvl) doDispDtl_pre_alc_lvl_LC(info);
		else if (lc == columnDispDtl_ym) doDispDtl_ym_LC(info);
		else if (lc == columnDispDtl_wg_cd) doDispDtl_wg_cd_LC(info);
		else if (lc == columnDispDtl_wg_nm) doDispDtl_wg_nm_LC(info);
		else if (lc == columnDispDtl_alc_ac_cd) doDispDtl_alc_ac_cd_LC(info);
		else if (lc == columnDispDtl_alc_ac_nm) doDispDtl_alc_ac_nm_LC(info);
		else if (lc == columnDispDtl_dpt_cd) doDispDtl_dpt_cd_LC(info);
		else if (lc == columnDispDtl_dpt_nm) doDispDtl_dpt_nm_LC(info);
		else if (lc == columnDispDtl_loc_cd) doDispDtl_loc_cd_LC(info);
		else if (lc == columnDispDtl_loc_nm) doDispDtl_loc_nm_LC(info);
		else if (lc == columnDispDtl_oper_cd) doDispDtl_oper_cd_LC(info);
		else if (lc == columnDispDtl_oper_nm) doDispDtl_oper_nm_LC(info);
		else if (lc == columnDispDtl_bp_cd) doDispDtl_bp_cd_LC(info);
		else if (lc == columnDispDtl_bp_nm) doDispDtl_bp_nm_LC(info);
		else if (lc == columnDispDtl_ctg_cd) doDispDtl_ctg_cd_LC(info);
		else if (lc == columnDispDtl_ctg_nm) doDispDtl_ctg_nm_LC(info);
		else if (lc == columnDispDtl_itm_typ) doDispDtl_itm_typ_LC(info);
		else if (lc == columnDispDtl_itm_typ_nm) doDispDtl_itm_typ_nm_LC(info);
		else if (lc == columnDispDtl_itm_typ_d_cd) doDispDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDispDtl_itm_typ_d_nm) doDispDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnDispDtl_lot_no) doDispDtl_lot_no_LC(info);
		else if (lc == columnDispDtl_sublot_no) doDispDtl_sublot_no_LC(info);
		else if (lc == columnDispDtl_sno1) doDispDtl_sno1_LC(info);
		else if (lc == columnDispDtl_sno2) doDispDtl_sno2_LC(info);
		else if (lc == columnDispDtl_sno3) doDispDtl_sno3_LC(info);
		else if (lc == columnDispDtl_sno4) doDispDtl_sno4_LC(info);
		else if (lc == columnDispDtl_itm_mfg_inst_no) doDispDtl_itm_mfg_inst_no_LC(info);
		else if (lc == columnDispDtl_iv_no) doDispDtl_iv_no_LC(info);
		else if (lc == columnDispDtl_po_no) doDispDtl_po_no_LC(info);
		else if (lc == columnDispDtl_slo_no) doDispDtl_slo_no_LC(info);
		else if (lc == columnDispDtl_wg_cd2) doDispDtl_wg_cd2_LC(info);
		else if (lc == columnDispDtl_wg_nm2) doDispDtl_wg_nm2_LC(info);
		else if (lc == columnDispDtl_alc_ac_cd2) doDispDtl_alc_ac_cd2_LC(info);
		else if (lc == columnDispDtl_alc_ac_nm2) doDispDtl_alc_ac_nm2_LC(info);
		else if (lc == columnDispDtl_ttl) doDispDtl_ttl_LC(info);
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
	 * [Cnd]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[src_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_alc_ac_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_alc_ac_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_alc_ac_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_alc_ac_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[pre_alc_lvl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_pre_alc_lvl_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ym_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno1_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno2_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno3_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_sno4_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_po_no_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_cd2_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[wg_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_wg_nm2_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_cd2_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[alc_ac_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_alc_ac_nm2_LC(MCEventInfo info){
	}

	/**
	 * [DispDtl]パネルの[ttl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispDtl_ttl_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_src_wg_cd]の作成メソッド
	 */
	public MCList getCnd_src_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_src_alc_ac_cd]の作成メソッド
	 */
	public MCList getCnd_src_alc_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_src_alc_ac_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_src_alc_ac_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_src_alc_ac_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_src_alc_ac_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_src_alc_ac_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_src_alc_ac_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_wg_cd]の作成メソッド
	 */
	public MCList getCnd_dest_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_alc_ac_cd]の作成メソッド
	 */
	public MCList getCnd_dest_alc_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_alc_ac_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_dest_alc_ac_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_alc_ac_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_dest_alc_ac_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_alc_ac_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_dest_alc_ac_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp3(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0250.Srch01")) {
			return new MG_MGBDL0250_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0250_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0250_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0250_Srch01;

		/** コンストラクタ */
		protected MG_MGBDL0250_Srch01Bridge() {
			p_MG_MGBDL0250_Srch01 = new MCParam(PDef.MG_MGBDL0250_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0250_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0250.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0250.DispDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0250.KeyR.class));

			p_MG_MGBDL0250_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0250_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0250_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0250_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0250_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0250.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0250.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0250.DispDtlR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0250.DispDtlR>)down(0);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0250.KeyR> down1() {
			return (MCList<mcframe.clientMGBD.MGBDP0250.KeyR>)down(1);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0250_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0250.DispDtlR.class));
			p_MG_MGBDL0250_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0250.KeyR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0250_Srch01;
		}

		protected void show() {
			setDispDtlL((MCList<mcframe.clientMGBD.MGBDP0250.DispDtlR>)p_MG_MGBDL0250_Srch01.getContainerParam().getDownBlock(0));
			setKeyL((MCList<mcframe.clientMGBD.MGBDP0250.KeyR>)p_MG_MGBDL0250_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDispDtlL().clear();
			getKeyL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDispDtlL());
			result.add(getKeyL());
			return result;
		}
	}
}