package mcframe.clientMGBF.MGBFP0260;

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
import mcframe.clientMGBF.MGBFP0260.MGBFP_CostIoSrch_MC.MG_MGBFL0260_Srch01Caller;

/**
 * 画面"MGBFP_CostIoSrch"パネルクラスです。<p>
 *
 * 原価個別受払表を照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFP_CostIoSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBFP0260";

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
	/**
	 * First month of the term 対象期間先頭年月.<p>
	 *
	 */
	public MCDateField Cnd_st_ym = null;
	public MCLabel Cnd_cost_io_id_Label = null;
	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public MCNumberComboBox Cnd_cost_io_id = null;
	/**
	 * GR/GI list name 受払表名.<p>
	 *
	 */
	public MCTextField Cnd_cost_io_nm = null;
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
	public MCLabel Cnd_ym_Label = null;
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDateComboBox Cnd_ym = null;
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
	 * Exclude other company's asset 他社資産除く.<p>
	 *
	 */
	public MCCheckBox Cnd_except_other_flg = null;
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
	 * BP 取引先.<p>
	 *
	 */
	public MCCheckBox Cnd_bp_flg = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCCheckBox Cnd_asst_typ_flg = null;
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
	// [Ttl]ブロック関連のField定義
	public MCPanel TtlPanel = null;
	// [Ttl]ブロックの項目のField定義
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	/**
	 * Display difference amount 差額表示.<p>
	 *
	 */
	public MCCheckBox LPnl_diff = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCColumnGroupTable<mcframe.clientMGBF.MGBFP0260.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
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
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_nm = null;
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
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri01 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty01_p_PPanel;
	public MCColumnConfig columnRslt_qty01;// [Rslt]の[qty01_p.qty]を[columnRslt_qty01]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std01 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt01 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff01 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri02 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty02_p_PPanel;
	public MCColumnConfig columnRslt_qty02;// [Rslt]の[qty02_p.qty]を[columnRslt_qty02]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std02 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt02 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff02 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri03 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty03_p_PPanel;
	public MCColumnConfig columnRslt_qty03;// [Rslt]の[qty03_p.qty]を[columnRslt_qty03]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std03 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt03 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff03 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri04 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty04_p_PPanel;
	public MCColumnConfig columnRslt_qty04;// [Rslt]の[qty04_p.qty]を[columnRslt_qty04]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std04 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt04 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff04 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri05 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty05_p_PPanel;
	public MCColumnConfig columnRslt_qty05;// [Rslt]の[qty05_p.qty]を[columnRslt_qty05]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std05 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt05 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff05 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri06 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty06_p_PPanel;
	public MCColumnConfig columnRslt_qty06;// [Rslt]の[qty06_p.qty]を[columnRslt_qty06]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std06 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt06 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff06 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri07 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty07_p_PPanel;
	public MCColumnConfig columnRslt_qty07;// [Rslt]の[qty07_p.qty]を[columnRslt_qty07]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std07 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt07 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff07 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri08 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty08_p_PPanel;
	public MCColumnConfig columnRslt_qty08;// [Rslt]の[qty08_p.qty]を[columnRslt_qty08]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std08 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt08 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff08 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri09 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty09_p_PPanel;
	public MCColumnConfig columnRslt_qty09;// [Rslt]の[qty09_p.qty]を[columnRslt_qty09]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std09 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt09 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff09 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri10 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty10_p_PPanel;
	public MCColumnConfig columnRslt_qty10;// [Rslt]の[qty10_p.qty]を[columnRslt_qty10]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std10 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt10 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff10 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri11 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty11_p_PPanel;
	public MCColumnConfig columnRslt_qty11;// [Rslt]の[qty11_p.qty]を[columnRslt_qty11]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std11 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt11 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff11 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri12 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty12_p_PPanel;
	public MCColumnConfig columnRslt_qty12;// [Rslt]の[qty12_p.qty]を[columnRslt_qty12]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std12 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt12 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff12 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri13 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty13_p_PPanel;
	public MCColumnConfig columnRslt_qty13;// [Rslt]の[qty13_p.qty]を[columnRslt_qty13]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std13 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt13 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff13 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri14 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty14_p_PPanel;
	public MCColumnConfig columnRslt_qty14;// [Rslt]の[qty14_p.qty]を[columnRslt_qty14]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std14 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt14 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff14 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri15 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty15_p_PPanel;
	public MCColumnConfig columnRslt_qty15;// [Rslt]の[qty15_p.qty]を[columnRslt_qty15]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std15 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt15 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff15 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri16 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty16_p_PPanel;
	public MCColumnConfig columnRslt_qty16;// [Rslt]の[qty16_p.qty]を[columnRslt_qty16]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std16 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt16 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff16 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri17 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty17_p_PPanel;
	public MCColumnConfig columnRslt_qty17;// [Rslt]の[qty17_p.qty]を[columnRslt_qty17]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std17 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt17 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff17 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri18 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty18_p_PPanel;
	public MCColumnConfig columnRslt_qty18;// [Rslt]の[qty18_p.qty]を[columnRslt_qty18]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std18 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt18 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff18 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri19 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty19_p_PPanel;
	public MCColumnConfig columnRslt_qty19;// [Rslt]の[qty19_p.qty]を[columnRslt_qty19]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std19 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt19 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff19 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri20 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty20_p_PPanel;
	public MCColumnConfig columnRslt_qty20;// [Rslt]の[qty20_p.qty]を[columnRslt_qty20]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std20 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt20 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff20 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri21 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty21_p_PPanel;
	public MCColumnConfig columnRslt_qty21;// [Rslt]の[qty21_p.qty]を[columnRslt_qty21]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std21 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt21 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff21 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri22 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty22_p_PPanel;
	public MCColumnConfig columnRslt_qty22;// [Rslt]の[qty22_p.qty]を[columnRslt_qty22]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std22 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt22 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff22 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri23 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty23_p_PPanel;
	public MCColumnConfig columnRslt_qty23;// [Rslt]の[qty23_p.qty]を[columnRslt_qty23]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std23 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt23 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff23 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri24 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty24_p_PPanel;
	public MCColumnConfig columnRslt_qty24;// [Rslt]の[qty24_p.qty]を[columnRslt_qty24]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std24 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt24 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff24 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri25 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty25_p_PPanel;
	public MCColumnConfig columnRslt_qty25;// [Rslt]の[qty25_p.qty]を[columnRslt_qty25]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std25 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt25 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff25 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri26 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty26_p_PPanel;
	public MCColumnConfig columnRslt_qty26;// [Rslt]の[qty26_p.qty]を[columnRslt_qty26]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std26 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt26 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff26 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri27 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty27_p_PPanel;
	public MCColumnConfig columnRslt_qty27;// [Rslt]の[qty27_p.qty]を[columnRslt_qty27]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std27 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt27 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff27 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri28 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty28_p_PPanel;
	public MCColumnConfig columnRslt_qty28;// [Rslt]の[qty28_p.qty]を[columnRslt_qty28]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std28 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt28 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff28 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri29 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty29_p_PPanel;
	public MCColumnConfig columnRslt_qty29;// [Rslt]の[qty29_p.qty]を[columnRslt_qty29]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std29 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt29 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff29 = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri30 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty30_p_PPanel;
	public MCColumnConfig columnRslt_qty30;// [Rslt]の[qty30_p.qty]を[columnRslt_qty30]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_std30 = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt30 = null;
	/**
	 * Variance 差異.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff30 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_diff_qty_p_PPanel;
	public MCColumnConfig columnRslt_diff_qty;// [Rslt]の[diff_qty_p.qty]を[columnRslt_diff_qty]としてエイリアス定義。
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff_std = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_diff_amt = null;
	public MCColumnGroup cgRslt_title01 = null;
	public MCColumnGroup cgRslt_title02 = null;
	public MCColumnGroup cgRslt_title03 = null;
	public MCColumnGroup cgRslt_title04 = null;
	public MCColumnGroup cgRslt_title05 = null;
	public MCColumnGroup cgRslt_title06 = null;
	public MCColumnGroup cgRslt_title07 = null;
	public MCColumnGroup cgRslt_title08 = null;
	public MCColumnGroup cgRslt_title09 = null;
	public MCColumnGroup cgRslt_title10 = null;
	public MCColumnGroup cgRslt_title11 = null;
	public MCColumnGroup cgRslt_title12 = null;
	public MCColumnGroup cgRslt_title13 = null;
	public MCColumnGroup cgRslt_title14 = null;
	public MCColumnGroup cgRslt_title15 = null;
	public MCColumnGroup cgRslt_title16 = null;
	public MCColumnGroup cgRslt_title17 = null;
	public MCColumnGroup cgRslt_title18 = null;
	public MCColumnGroup cgRslt_title19 = null;
	public MCColumnGroup cgRslt_title20 = null;
	public MCColumnGroup cgRslt_title21 = null;
	public MCColumnGroup cgRslt_title22 = null;
	public MCColumnGroup cgRslt_title23 = null;
	public MCColumnGroup cgRslt_title24 = null;
	public MCColumnGroup cgRslt_title25 = null;
	public MCColumnGroup cgRslt_title26 = null;
	public MCColumnGroup cgRslt_title27 = null;
	public MCColumnGroup cgRslt_title28 = null;
	public MCColumnGroup cgRslt_title29 = null;
	public MCColumnGroup cgRslt_title30 = null;
	public MCColumnGroup cgRslt_diff_title = null;
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
	
	/** [MG_MGBFL0260_Srch01]のCallerの作成 */
	protected MGBFP_CostIoSrch_MC.MG_MGBFL0260_Srch01Caller createMG_MGBFL0260_Srch01() {
		MGBFP_CostIoSrch_MC.MG_MGBFL0260_Srch01Caller<MGBFP_CostIoSrch, MG_MGBFL0260_Srch01Bridge>
		caller = ((MGBFP_CostIoSrch_MC)this).new MG_MGBFL0260_Srch01Caller<MGBFP_CostIoSrch, MG_MGBFL0260_Srch01Bridge>(
					(MGBFP_CostIoSrch)this, new MG_MGBFL0260_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBFL0260_Srch01]の呼び出し */
	protected void callMG_MGBFL0260_Srch01() {
		MCCaller caller = createMG_MGBFL0260_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0260.CndR aCndR;
	/** [LPnl]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0260.LPnlR aLPnlR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0260.RsltR> aRsltL;
	/** [Mstr]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0260.MstrR> aMstrL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBF.MGBFP0260.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0260.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0260.CndR createCndR() {
		return mcframe.clientMGBF.MGBFP0260.CndR.create();
	}

	/**
	 * 項目コピーによってaLPnlRを設定します。
	 *
	 * aLPnlRのインスタンスは変更されません。
	 *
	 * @param row LPnlR
	 */
	public void setLPnlR(mcframe.clientMGBF.MGBFP0260.LPnlR row) {
		if (row != null) {
			MCRow.copyall(getLPnlR(), row);
		}
	}

	/**
	 * [LPnl]ブロックのコンテナaLPnlRを返します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMGBF.MGBFP0260.LPnlR getLPnlR() {
		return aLPnlR;
	}

	/**
	 * aLPnlRを作成します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMGBF.MGBFP0260.LPnlR createLPnlR() {
		return mcframe.clientMGBF.MGBFP0260.LPnlR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBF.MGBFP0260.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0260.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBF.MGBFP0260.RsltR createRsltR() {
		return mcframe.clientMGBF.MGBFP0260.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0260.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0260.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createColumnGroupTable("Rslt.table");
		}
	}

	/**
	 * コピーによってaMstrLを設定します。
	 *
	 * aMstrLのインスタンスは変更されません。
	 *
	 * @param dataset MstrL
	 */
	public void setMstrL(MCList<mcframe.clientMGBF.MGBFP0260.MstrR> aList) {
		if (getMstrL() != aList) {
			getMstrL().setAll(aList);
		}
	}

	/**
	 * [Mstr]ブロックのコンテナaMstrLを返します。
	 *
	 * @return MstrL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0260.MstrR> getMstrL() {
		return aMstrL;
	}

	/**
	 * aMstrRを作成します。
	 *
	 * @return MstrR
	 */
	public mcframe.clientMGBF.MGBFP0260.MstrR createMstrR() {
		return mcframe.clientMGBF.MGBFP0260.MstrR.create();
	}

	/**
	 * aMstrLを作成します。
	 *
	 * @return MstrL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0260.MstrR> createMstrL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0260.MstrR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getLPnlR())) ret.add(getLPnlR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getMstrL())) ret.add(getMstrL());
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
		if(aCnt == getLPnlR()) return "LPnl";
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getMstrL()) return "Mstr";
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
		if(bId.equals("LPnl")) return getLPnlR();
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("Mstr")) return getMstrL();
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
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(TtlPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_CostIoSrch_MC_A() {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();
		aMstrL = createMstrL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBFP_CostIoSrch_MC_A(String name) {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aMstrL = createMstrL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBFP_CostIoSrch_MC.jbCreateTop((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbCreateFold((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbCreateTab1((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbCreateTab2((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbCreateTab3((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbCreateCnd((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbCreateCnd2((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbCreateTtl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbCreateLPnl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbCreateCtrl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbCreateRslt((MGBFP_CostIoSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBFP_CostIoSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBFP_CostIoSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBFP_CostIoSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBFP_CostIoSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MGBFP_CostIoSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBFP_CostIoSrch p) {
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
	protected static void jbCreateCnd2(MGBFP_CostIoSrch p) {
	}

	/**
	 * [Ttl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTtl(MGBFP_CostIoSrch p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MGBFP_CostIoSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBFP_CostIoSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBFP_CostIoSrch p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$itm_p);
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
		p.Rslt_qty01_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty01_p);
		p.Rslt_qty01_p_PPanel.setName("Rslt.qty01_p");
		p.columnRslt_qty01 = p.Rslt_qty01_p_PPanel.columnQty_qty;
		p.columnRslt_qty01.addAliasName("Rslt.qty01", p);
		p.Rslt_qty02_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty02_p);
		p.Rslt_qty02_p_PPanel.setName("Rslt.qty02_p");
		p.columnRslt_qty02 = p.Rslt_qty02_p_PPanel.columnQty_qty;
		p.columnRslt_qty02.addAliasName("Rslt.qty02", p);
		p.Rslt_qty03_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty03_p);
		p.Rslt_qty03_p_PPanel.setName("Rslt.qty03_p");
		p.columnRslt_qty03 = p.Rslt_qty03_p_PPanel.columnQty_qty;
		p.columnRslt_qty03.addAliasName("Rslt.qty03", p);
		p.Rslt_qty04_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty04_p);
		p.Rslt_qty04_p_PPanel.setName("Rslt.qty04_p");
		p.columnRslt_qty04 = p.Rslt_qty04_p_PPanel.columnQty_qty;
		p.columnRslt_qty04.addAliasName("Rslt.qty04", p);
		p.Rslt_qty05_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty05_p);
		p.Rslt_qty05_p_PPanel.setName("Rslt.qty05_p");
		p.columnRslt_qty05 = p.Rslt_qty05_p_PPanel.columnQty_qty;
		p.columnRslt_qty05.addAliasName("Rslt.qty05", p);
		p.Rslt_qty06_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty06_p);
		p.Rslt_qty06_p_PPanel.setName("Rslt.qty06_p");
		p.columnRslt_qty06 = p.Rslt_qty06_p_PPanel.columnQty_qty;
		p.columnRslt_qty06.addAliasName("Rslt.qty06", p);
		p.Rslt_qty07_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty07_p);
		p.Rslt_qty07_p_PPanel.setName("Rslt.qty07_p");
		p.columnRslt_qty07 = p.Rslt_qty07_p_PPanel.columnQty_qty;
		p.columnRslt_qty07.addAliasName("Rslt.qty07", p);
		p.Rslt_qty08_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty08_p);
		p.Rslt_qty08_p_PPanel.setName("Rslt.qty08_p");
		p.columnRslt_qty08 = p.Rslt_qty08_p_PPanel.columnQty_qty;
		p.columnRslt_qty08.addAliasName("Rslt.qty08", p);
		p.Rslt_qty09_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty09_p);
		p.Rslt_qty09_p_PPanel.setName("Rslt.qty09_p");
		p.columnRslt_qty09 = p.Rslt_qty09_p_PPanel.columnQty_qty;
		p.columnRslt_qty09.addAliasName("Rslt.qty09", p);
		p.Rslt_qty10_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty10_p);
		p.Rslt_qty10_p_PPanel.setName("Rslt.qty10_p");
		p.columnRslt_qty10 = p.Rslt_qty10_p_PPanel.columnQty_qty;
		p.columnRslt_qty10.addAliasName("Rslt.qty10", p);
		p.Rslt_qty11_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty11_p);
		p.Rslt_qty11_p_PPanel.setName("Rslt.qty11_p");
		p.columnRslt_qty11 = p.Rslt_qty11_p_PPanel.columnQty_qty;
		p.columnRslt_qty11.addAliasName("Rslt.qty11", p);
		p.Rslt_qty12_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty12_p);
		p.Rslt_qty12_p_PPanel.setName("Rslt.qty12_p");
		p.columnRslt_qty12 = p.Rslt_qty12_p_PPanel.columnQty_qty;
		p.columnRslt_qty12.addAliasName("Rslt.qty12", p);
		p.Rslt_qty13_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty13_p);
		p.Rslt_qty13_p_PPanel.setName("Rslt.qty13_p");
		p.columnRslt_qty13 = p.Rslt_qty13_p_PPanel.columnQty_qty;
		p.columnRslt_qty13.addAliasName("Rslt.qty13", p);
		p.Rslt_qty14_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty14_p);
		p.Rslt_qty14_p_PPanel.setName("Rslt.qty14_p");
		p.columnRslt_qty14 = p.Rslt_qty14_p_PPanel.columnQty_qty;
		p.columnRslt_qty14.addAliasName("Rslt.qty14", p);
		p.Rslt_qty15_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty15_p);
		p.Rslt_qty15_p_PPanel.setName("Rslt.qty15_p");
		p.columnRslt_qty15 = p.Rslt_qty15_p_PPanel.columnQty_qty;
		p.columnRslt_qty15.addAliasName("Rslt.qty15", p);
		p.Rslt_qty16_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty16_p);
		p.Rslt_qty16_p_PPanel.setName("Rslt.qty16_p");
		p.columnRslt_qty16 = p.Rslt_qty16_p_PPanel.columnQty_qty;
		p.columnRslt_qty16.addAliasName("Rslt.qty16", p);
		p.Rslt_qty17_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty17_p);
		p.Rslt_qty17_p_PPanel.setName("Rslt.qty17_p");
		p.columnRslt_qty17 = p.Rslt_qty17_p_PPanel.columnQty_qty;
		p.columnRslt_qty17.addAliasName("Rslt.qty17", p);
		p.Rslt_qty18_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty18_p);
		p.Rslt_qty18_p_PPanel.setName("Rslt.qty18_p");
		p.columnRslt_qty18 = p.Rslt_qty18_p_PPanel.columnQty_qty;
		p.columnRslt_qty18.addAliasName("Rslt.qty18", p);
		p.Rslt_qty19_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty19_p);
		p.Rslt_qty19_p_PPanel.setName("Rslt.qty19_p");
		p.columnRslt_qty19 = p.Rslt_qty19_p_PPanel.columnQty_qty;
		p.columnRslt_qty19.addAliasName("Rslt.qty19", p);
		p.Rslt_qty20_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty20_p);
		p.Rslt_qty20_p_PPanel.setName("Rslt.qty20_p");
		p.columnRslt_qty20 = p.Rslt_qty20_p_PPanel.columnQty_qty;
		p.columnRslt_qty20.addAliasName("Rslt.qty20", p);
		p.Rslt_qty21_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty21_p);
		p.Rslt_qty21_p_PPanel.setName("Rslt.qty21_p");
		p.columnRslt_qty21 = p.Rslt_qty21_p_PPanel.columnQty_qty;
		p.columnRslt_qty21.addAliasName("Rslt.qty21", p);
		p.Rslt_qty22_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty22_p);
		p.Rslt_qty22_p_PPanel.setName("Rslt.qty22_p");
		p.columnRslt_qty22 = p.Rslt_qty22_p_PPanel.columnQty_qty;
		p.columnRslt_qty22.addAliasName("Rslt.qty22", p);
		p.Rslt_qty23_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty23_p);
		p.Rslt_qty23_p_PPanel.setName("Rslt.qty23_p");
		p.columnRslt_qty23 = p.Rslt_qty23_p_PPanel.columnQty_qty;
		p.columnRslt_qty23.addAliasName("Rslt.qty23", p);
		p.Rslt_qty24_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty24_p);
		p.Rslt_qty24_p_PPanel.setName("Rslt.qty24_p");
		p.columnRslt_qty24 = p.Rslt_qty24_p_PPanel.columnQty_qty;
		p.columnRslt_qty24.addAliasName("Rslt.qty24", p);
		p.Rslt_qty25_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty25_p);
		p.Rslt_qty25_p_PPanel.setName("Rslt.qty25_p");
		p.columnRslt_qty25 = p.Rslt_qty25_p_PPanel.columnQty_qty;
		p.columnRslt_qty25.addAliasName("Rslt.qty25", p);
		p.Rslt_qty26_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty26_p);
		p.Rslt_qty26_p_PPanel.setName("Rslt.qty26_p");
		p.columnRslt_qty26 = p.Rslt_qty26_p_PPanel.columnQty_qty;
		p.columnRslt_qty26.addAliasName("Rslt.qty26", p);
		p.Rslt_qty27_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty27_p);
		p.Rslt_qty27_p_PPanel.setName("Rslt.qty27_p");
		p.columnRslt_qty27 = p.Rslt_qty27_p_PPanel.columnQty_qty;
		p.columnRslt_qty27.addAliasName("Rslt.qty27", p);
		p.Rslt_qty28_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty28_p);
		p.Rslt_qty28_p_PPanel.setName("Rslt.qty28_p");
		p.columnRslt_qty28 = p.Rslt_qty28_p_PPanel.columnQty_qty;
		p.columnRslt_qty28.addAliasName("Rslt.qty28", p);
		p.Rslt_qty29_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty29_p);
		p.Rslt_qty29_p_PPanel.setName("Rslt.qty29_p");
		p.columnRslt_qty29 = p.Rslt_qty29_p_PPanel.columnQty_qty;
		p.columnRslt_qty29.addAliasName("Rslt.qty29", p);
		p.Rslt_qty30_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$qty30_p);
		p.Rslt_qty30_p_PPanel.setName("Rslt.qty30_p");
		p.columnRslt_qty30 = p.Rslt_qty30_p_PPanel.columnQty_qty;
		p.columnRslt_qty30.addAliasName("Rslt.qty30", p);
		p.Rslt_diff_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBF.MGBFP0260.RsltR.$diff_qty_p);
		p.Rslt_diff_qty_p_PPanel.setName("Rslt.diff_qty_p");
		p.columnRslt_diff_qty = p.Rslt_diff_qty_p_PPanel.columnQty_qty;
		p.columnRslt_diff_qty.addAliasName("Rslt.diff_qty", p);
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
			Cnd_calc_no_p_PPanel_CalcNo_calc_no_p = createCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(Cnd_calc_no_p_PPanel.CalcNo_calc_no, "calc_no", "rmrks","term","st_ym");
		}
		return Cnd_calc_no_p_PPanel_CalcNo_calc_no_p;
	}
	
	
	/** [Cnd_cost_io_id_ListPutter]の定義 */
	private MCListPutter Cnd_cost_io_id_p = null;

	/**
	 * [Cnd_cost_io_id_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cost_io_id_ListPutter() {
		if (Cnd_cost_io_id_p == null) {
			Cnd_cost_io_id_p = createCnd_cost_io_id_ListPutter(Cnd_cost_io_id, "cost_io_id", "cost_io_nm");

		}
		return Cnd_cost_io_id_p;
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
	
	
	/** [Cnd_ym_ListPutter]の定義 */
	private MCListPutter Cnd_ym_p = null;

	/**
	 * [Cnd_ym_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ym_ListPutter() {
		if (Cnd_ym_p == null) {
			Cnd_ym_p = createCnd_ym_ListPutter(Cnd_ym, "ym");

		}
		return Cnd_ym_p;
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
	public static MGBFP_CostIoSrch create(){
		MGBFP_CostIoSrch p = new MGBFP_CostIoSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_CostIoSrch create(String name){
		MGBFP_CostIoSrch p = new MGBFP_CostIoSrch(name);
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
		MGBFP_CostIoSrch_MC.jbfInitTop((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbfInitFold((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbfInitTab1((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbfInitTab2((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbfInitTab3((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbfInitCnd((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbfInitCnd2((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbfInitTtl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbfInitLPnl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbfInitCtrl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbfInitRslt((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbInitTop((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbInitFold((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbInitTab1((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbInitTab2((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbInitTab3((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbInitCnd((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbInitCnd2((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbInitTtl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbInitLPnl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbInitCtrl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.jbInitRslt((MGBFP_CostIoSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBFP_CostIoSrch p) {
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
	protected static void jbfInitTab1(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_term = p.beansFactory.createDateField("Cnd.term");
		p.Cnd_st_ym = p.beansFactory.createDateField("Cnd.st_ym");
		p.Cnd_cost_io_id_Label = p.beansFactory.createLabel("Cnd.cost_io_id_Label");
		p.Cnd_cost_io_id = p.beansFactory.createNumberComboBox("Cnd.cost_io_id");
		p.Cnd_cost_io_id.setLabel(p.Cnd_cost_io_id_Label);
		p.Cnd_cost_io_nm = p.beansFactory.createTextField("Cnd.cost_io_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_ym_Label = p.beansFactory.createLabel("Cnd.ym_Label");
		p.Cnd_ym = p.beansFactory.createDateComboBox("Cnd.ym");
		p.Cnd_ym.setLabel(p.Cnd_ym_Label);
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
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_no_bp_flg = p.beansFactory.createCheckBox("Cnd.no_bp_flg");
		p.Cnd_asst_typ_Label = p.beansFactory.createLabel("Cnd.asst_typ_Label");
		p.Cnd_asst_typ = p.beansFactory.createTextComboBox("Cnd.asst_typ");
		p.Cnd_asst_typ.setLabel(p.Cnd_asst_typ_Label);
		p.Cnd_asst_typ_nm = p.beansFactory.createTextField("Cnd.asst_typ_nm");
		p.Cnd_except_other_flg = p.beansFactory.createCheckBox("Cnd.except_other_flg");
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
		p.Cnd_lot_flg = p.beansFactory.createCheckBox("Cnd.lot_flg");
		p.Cnd_sublot_flg = p.beansFactory.createCheckBox("Cnd.sublot_flg");
		p.Cnd_sno1_flg = p.beansFactory.createCheckBox("Cnd.sno1_flg");
		p.Cnd_sno2_flg = p.beansFactory.createCheckBox("Cnd.sno2_flg");
		p.Cnd_sno3_flg = p.beansFactory.createCheckBox("Cnd.sno3_flg");
		p.Cnd_sno4_flg = p.beansFactory.createCheckBox("Cnd.sno4_flg");
		p.Cnd_bp_flg = p.beansFactory.createCheckBox("Cnd.bp_flg");
		p.Cnd_asst_typ_flg = p.beansFactory.createCheckBox("Cnd.asst_typ_flg");
		p.Cnd_select_all = p.beansFactory.createButton("Cnd.select_all", "no_border");
		p.Cnd_deselect_all = p.beansFactory.createButton("Cnd.deselect_all", "no_border");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTtl(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.TtlPanel = p.beansFactory.createPanel("Ttl");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
		p.LPnl_diff = p.beansFactory.createCheckBox("LPnl.diff");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_ym = p.beansFactory.createTableColumn("Rslt.ym", MCColumnType.DATE);
		p.columnRslt_mng_dpt_cd = p.beansFactory.createTableColumn("Rslt.mng_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_mng_dpt_nm = p.beansFactory.createTableColumn("Rslt.mng_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_itm_jnl_cd = p.beansFactory.createTableColumn("Rslt.itm_jnl_cd", MCColumnType.TEXT);
		p.columnRslt_itm_jnl_nm = p.beansFactory.createTableColumn("Rslt.itm_jnl_nm", MCColumnType.TEXT);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_sno1 = p.beansFactory.createTableColumn("Rslt.sno1", MCColumnType.TEXT);
		p.columnRslt_sno2 = p.beansFactory.createTableColumn("Rslt.sno2", MCColumnType.TEXT);
		p.columnRslt_sno3 = p.beansFactory.createTableColumn("Rslt.sno3", MCColumnType.TEXT);
		p.columnRslt_sno4 = p.beansFactory.createTableColumn("Rslt.sno4", MCColumnType.TEXT);
		p.columnRslt_bp_cd = p.beansFactory.createTableColumn("Rslt.bp_cd", MCColumnType.TEXT);
		p.columnRslt_bp_nm = p.beansFactory.createTableColumn("Rslt.bp_nm", MCColumnType.TEXT);
		p.columnRslt_asst_typ = p.beansFactory.createTableColumn("Rslt.asst_typ", MCColumnType.TEXT);
		p.columnRslt_asst_typ_nm = p.beansFactory.createTableColumn("Rslt.asst_typ_nm", MCColumnType.TEXT);
		p.columnRslt_unit_cd = p.beansFactory.createTableColumn("Rslt.unit_cd", MCColumnType.TEXT);
		p.columnRslt_unit_nm = p.beansFactory.createTableColumn("Rslt.unit_nm", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_upri01 = p.beansFactory.createTableColumn("Rslt.upri01", MCColumnType.NUMBER);
		p.columnRslt_std01 = p.beansFactory.createTableColumn("Rslt.std01", MCColumnType.NUMBER);
		p.columnRslt_amt01 = p.beansFactory.createTableColumn("Rslt.amt01", MCColumnType.NUMBER);
		p.columnRslt_diff01 = p.beansFactory.createTableColumn("Rslt.diff01", MCColumnType.NUMBER);
		p.columnRslt_upri02 = p.beansFactory.createTableColumn("Rslt.upri02", MCColumnType.NUMBER);
		p.columnRslt_std02 = p.beansFactory.createTableColumn("Rslt.std02", MCColumnType.NUMBER);
		p.columnRslt_amt02 = p.beansFactory.createTableColumn("Rslt.amt02", MCColumnType.NUMBER);
		p.columnRslt_diff02 = p.beansFactory.createTableColumn("Rslt.diff02", MCColumnType.NUMBER);
		p.columnRslt_upri03 = p.beansFactory.createTableColumn("Rslt.upri03", MCColumnType.NUMBER);
		p.columnRslt_std03 = p.beansFactory.createTableColumn("Rslt.std03", MCColumnType.NUMBER);
		p.columnRslt_amt03 = p.beansFactory.createTableColumn("Rslt.amt03", MCColumnType.NUMBER);
		p.columnRslt_diff03 = p.beansFactory.createTableColumn("Rslt.diff03", MCColumnType.NUMBER);
		p.columnRslt_upri04 = p.beansFactory.createTableColumn("Rslt.upri04", MCColumnType.NUMBER);
		p.columnRslt_std04 = p.beansFactory.createTableColumn("Rslt.std04", MCColumnType.NUMBER);
		p.columnRslt_amt04 = p.beansFactory.createTableColumn("Rslt.amt04", MCColumnType.NUMBER);
		p.columnRslt_diff04 = p.beansFactory.createTableColumn("Rslt.diff04", MCColumnType.NUMBER);
		p.columnRslt_upri05 = p.beansFactory.createTableColumn("Rslt.upri05", MCColumnType.NUMBER);
		p.columnRslt_std05 = p.beansFactory.createTableColumn("Rslt.std05", MCColumnType.NUMBER);
		p.columnRslt_amt05 = p.beansFactory.createTableColumn("Rslt.amt05", MCColumnType.NUMBER);
		p.columnRslt_diff05 = p.beansFactory.createTableColumn("Rslt.diff05", MCColumnType.NUMBER);
		p.columnRslt_upri06 = p.beansFactory.createTableColumn("Rslt.upri06", MCColumnType.NUMBER);
		p.columnRslt_std06 = p.beansFactory.createTableColumn("Rslt.std06", MCColumnType.NUMBER);
		p.columnRslt_amt06 = p.beansFactory.createTableColumn("Rslt.amt06", MCColumnType.NUMBER);
		p.columnRslt_diff06 = p.beansFactory.createTableColumn("Rslt.diff06", MCColumnType.NUMBER);
		p.columnRslt_upri07 = p.beansFactory.createTableColumn("Rslt.upri07", MCColumnType.NUMBER);
		p.columnRslt_std07 = p.beansFactory.createTableColumn("Rslt.std07", MCColumnType.NUMBER);
		p.columnRslt_amt07 = p.beansFactory.createTableColumn("Rslt.amt07", MCColumnType.NUMBER);
		p.columnRslt_diff07 = p.beansFactory.createTableColumn("Rslt.diff07", MCColumnType.NUMBER);
		p.columnRslt_upri08 = p.beansFactory.createTableColumn("Rslt.upri08", MCColumnType.NUMBER);
		p.columnRslt_std08 = p.beansFactory.createTableColumn("Rslt.std08", MCColumnType.NUMBER);
		p.columnRslt_amt08 = p.beansFactory.createTableColumn("Rslt.amt08", MCColumnType.NUMBER);
		p.columnRslt_diff08 = p.beansFactory.createTableColumn("Rslt.diff08", MCColumnType.NUMBER);
		p.columnRslt_upri09 = p.beansFactory.createTableColumn("Rslt.upri09", MCColumnType.NUMBER);
		p.columnRslt_std09 = p.beansFactory.createTableColumn("Rslt.std09", MCColumnType.NUMBER);
		p.columnRslt_amt09 = p.beansFactory.createTableColumn("Rslt.amt09", MCColumnType.NUMBER);
		p.columnRslt_diff09 = p.beansFactory.createTableColumn("Rslt.diff09", MCColumnType.NUMBER);
		p.columnRslt_upri10 = p.beansFactory.createTableColumn("Rslt.upri10", MCColumnType.NUMBER);
		p.columnRslt_std10 = p.beansFactory.createTableColumn("Rslt.std10", MCColumnType.NUMBER);
		p.columnRslt_amt10 = p.beansFactory.createTableColumn("Rslt.amt10", MCColumnType.NUMBER);
		p.columnRslt_diff10 = p.beansFactory.createTableColumn("Rslt.diff10", MCColumnType.NUMBER);
		p.columnRslt_upri11 = p.beansFactory.createTableColumn("Rslt.upri11", MCColumnType.NUMBER);
		p.columnRslt_std11 = p.beansFactory.createTableColumn("Rslt.std11", MCColumnType.NUMBER);
		p.columnRslt_amt11 = p.beansFactory.createTableColumn("Rslt.amt11", MCColumnType.NUMBER);
		p.columnRslt_diff11 = p.beansFactory.createTableColumn("Rslt.diff11", MCColumnType.NUMBER);
		p.columnRslt_upri12 = p.beansFactory.createTableColumn("Rslt.upri12", MCColumnType.NUMBER);
		p.columnRslt_std12 = p.beansFactory.createTableColumn("Rslt.std12", MCColumnType.NUMBER);
		p.columnRslt_amt12 = p.beansFactory.createTableColumn("Rslt.amt12", MCColumnType.NUMBER);
		p.columnRslt_diff12 = p.beansFactory.createTableColumn("Rslt.diff12", MCColumnType.NUMBER);
		p.columnRslt_upri13 = p.beansFactory.createTableColumn("Rslt.upri13", MCColumnType.NUMBER);
		p.columnRslt_std13 = p.beansFactory.createTableColumn("Rslt.std13", MCColumnType.NUMBER);
		p.columnRslt_amt13 = p.beansFactory.createTableColumn("Rslt.amt13", MCColumnType.NUMBER);
		p.columnRslt_diff13 = p.beansFactory.createTableColumn("Rslt.diff13", MCColumnType.NUMBER);
		p.columnRslt_upri14 = p.beansFactory.createTableColumn("Rslt.upri14", MCColumnType.NUMBER);
		p.columnRslt_std14 = p.beansFactory.createTableColumn("Rslt.std14", MCColumnType.NUMBER);
		p.columnRslt_amt14 = p.beansFactory.createTableColumn("Rslt.amt14", MCColumnType.NUMBER);
		p.columnRslt_diff14 = p.beansFactory.createTableColumn("Rslt.diff14", MCColumnType.NUMBER);
		p.columnRslt_upri15 = p.beansFactory.createTableColumn("Rslt.upri15", MCColumnType.NUMBER);
		p.columnRslt_std15 = p.beansFactory.createTableColumn("Rslt.std15", MCColumnType.NUMBER);
		p.columnRslt_amt15 = p.beansFactory.createTableColumn("Rslt.amt15", MCColumnType.NUMBER);
		p.columnRslt_diff15 = p.beansFactory.createTableColumn("Rslt.diff15", MCColumnType.NUMBER);
		p.columnRslt_upri16 = p.beansFactory.createTableColumn("Rslt.upri16", MCColumnType.NUMBER);
		p.columnRslt_std16 = p.beansFactory.createTableColumn("Rslt.std16", MCColumnType.NUMBER);
		p.columnRslt_amt16 = p.beansFactory.createTableColumn("Rslt.amt16", MCColumnType.NUMBER);
		p.columnRslt_diff16 = p.beansFactory.createTableColumn("Rslt.diff16", MCColumnType.NUMBER);
		p.columnRslt_upri17 = p.beansFactory.createTableColumn("Rslt.upri17", MCColumnType.NUMBER);
		p.columnRslt_std17 = p.beansFactory.createTableColumn("Rslt.std17", MCColumnType.NUMBER);
		p.columnRslt_amt17 = p.beansFactory.createTableColumn("Rslt.amt17", MCColumnType.NUMBER);
		p.columnRslt_diff17 = p.beansFactory.createTableColumn("Rslt.diff17", MCColumnType.NUMBER);
		p.columnRslt_upri18 = p.beansFactory.createTableColumn("Rslt.upri18", MCColumnType.NUMBER);
		p.columnRslt_std18 = p.beansFactory.createTableColumn("Rslt.std18", MCColumnType.NUMBER);
		p.columnRslt_amt18 = p.beansFactory.createTableColumn("Rslt.amt18", MCColumnType.NUMBER);
		p.columnRslt_diff18 = p.beansFactory.createTableColumn("Rslt.diff18", MCColumnType.NUMBER);
		p.columnRslt_upri19 = p.beansFactory.createTableColumn("Rslt.upri19", MCColumnType.NUMBER);
		p.columnRslt_std19 = p.beansFactory.createTableColumn("Rslt.std19", MCColumnType.NUMBER);
		p.columnRslt_amt19 = p.beansFactory.createTableColumn("Rslt.amt19", MCColumnType.NUMBER);
		p.columnRslt_diff19 = p.beansFactory.createTableColumn("Rslt.diff19", MCColumnType.NUMBER);
		p.columnRslt_upri20 = p.beansFactory.createTableColumn("Rslt.upri20", MCColumnType.NUMBER);
		p.columnRslt_std20 = p.beansFactory.createTableColumn("Rslt.std20", MCColumnType.NUMBER);
		p.columnRslt_amt20 = p.beansFactory.createTableColumn("Rslt.amt20", MCColumnType.NUMBER);
		p.columnRslt_diff20 = p.beansFactory.createTableColumn("Rslt.diff20", MCColumnType.NUMBER);
		p.columnRslt_upri21 = p.beansFactory.createTableColumn("Rslt.upri21", MCColumnType.NUMBER);
		p.columnRslt_std21 = p.beansFactory.createTableColumn("Rslt.std21", MCColumnType.NUMBER);
		p.columnRslt_amt21 = p.beansFactory.createTableColumn("Rslt.amt21", MCColumnType.NUMBER);
		p.columnRslt_diff21 = p.beansFactory.createTableColumn("Rslt.diff21", MCColumnType.NUMBER);
		p.columnRslt_upri22 = p.beansFactory.createTableColumn("Rslt.upri22", MCColumnType.NUMBER);
		p.columnRslt_std22 = p.beansFactory.createTableColumn("Rslt.std22", MCColumnType.NUMBER);
		p.columnRslt_amt22 = p.beansFactory.createTableColumn("Rslt.amt22", MCColumnType.NUMBER);
		p.columnRslt_diff22 = p.beansFactory.createTableColumn("Rslt.diff22", MCColumnType.NUMBER);
		p.columnRslt_upri23 = p.beansFactory.createTableColumn("Rslt.upri23", MCColumnType.NUMBER);
		p.columnRslt_std23 = p.beansFactory.createTableColumn("Rslt.std23", MCColumnType.NUMBER);
		p.columnRslt_amt23 = p.beansFactory.createTableColumn("Rslt.amt23", MCColumnType.NUMBER);
		p.columnRslt_diff23 = p.beansFactory.createTableColumn("Rslt.diff23", MCColumnType.NUMBER);
		p.columnRslt_upri24 = p.beansFactory.createTableColumn("Rslt.upri24", MCColumnType.NUMBER);
		p.columnRslt_std24 = p.beansFactory.createTableColumn("Rslt.std24", MCColumnType.NUMBER);
		p.columnRslt_amt24 = p.beansFactory.createTableColumn("Rslt.amt24", MCColumnType.NUMBER);
		p.columnRslt_diff24 = p.beansFactory.createTableColumn("Rslt.diff24", MCColumnType.NUMBER);
		p.columnRslt_upri25 = p.beansFactory.createTableColumn("Rslt.upri25", MCColumnType.NUMBER);
		p.columnRslt_std25 = p.beansFactory.createTableColumn("Rslt.std25", MCColumnType.NUMBER);
		p.columnRslt_amt25 = p.beansFactory.createTableColumn("Rslt.amt25", MCColumnType.NUMBER);
		p.columnRslt_diff25 = p.beansFactory.createTableColumn("Rslt.diff25", MCColumnType.NUMBER);
		p.columnRslt_upri26 = p.beansFactory.createTableColumn("Rslt.upri26", MCColumnType.NUMBER);
		p.columnRslt_std26 = p.beansFactory.createTableColumn("Rslt.std26", MCColumnType.NUMBER);
		p.columnRslt_amt26 = p.beansFactory.createTableColumn("Rslt.amt26", MCColumnType.NUMBER);
		p.columnRslt_diff26 = p.beansFactory.createTableColumn("Rslt.diff26", MCColumnType.NUMBER);
		p.columnRslt_upri27 = p.beansFactory.createTableColumn("Rslt.upri27", MCColumnType.NUMBER);
		p.columnRslt_std27 = p.beansFactory.createTableColumn("Rslt.std27", MCColumnType.NUMBER);
		p.columnRslt_amt27 = p.beansFactory.createTableColumn("Rslt.amt27", MCColumnType.NUMBER);
		p.columnRslt_diff27 = p.beansFactory.createTableColumn("Rslt.diff27", MCColumnType.NUMBER);
		p.columnRslt_upri28 = p.beansFactory.createTableColumn("Rslt.upri28", MCColumnType.NUMBER);
		p.columnRslt_std28 = p.beansFactory.createTableColumn("Rslt.std28", MCColumnType.NUMBER);
		p.columnRslt_amt28 = p.beansFactory.createTableColumn("Rslt.amt28", MCColumnType.NUMBER);
		p.columnRslt_diff28 = p.beansFactory.createTableColumn("Rslt.diff28", MCColumnType.NUMBER);
		p.columnRslt_upri29 = p.beansFactory.createTableColumn("Rslt.upri29", MCColumnType.NUMBER);
		p.columnRslt_std29 = p.beansFactory.createTableColumn("Rslt.std29", MCColumnType.NUMBER);
		p.columnRslt_amt29 = p.beansFactory.createTableColumn("Rslt.amt29", MCColumnType.NUMBER);
		p.columnRslt_diff29 = p.beansFactory.createTableColumn("Rslt.diff29", MCColumnType.NUMBER);
		p.columnRslt_upri30 = p.beansFactory.createTableColumn("Rslt.upri30", MCColumnType.NUMBER);
		p.columnRslt_std30 = p.beansFactory.createTableColumn("Rslt.std30", MCColumnType.NUMBER);
		p.columnRslt_amt30 = p.beansFactory.createTableColumn("Rslt.amt30", MCColumnType.NUMBER);
		p.columnRslt_diff30 = p.beansFactory.createTableColumn("Rslt.diff30", MCColumnType.NUMBER);
		p.columnRslt_diff_std = p.beansFactory.createTableColumn("Rslt.diff_std", MCColumnType.NUMBER);
		p.columnRslt_diff_amt = p.beansFactory.createTableColumn("Rslt.diff_amt", MCColumnType.NUMBER);
		p.cgRslt_title01 = p.beansFactory.createColumnGroup("Rslt.title01");
		p.cgRslt_title02 = p.beansFactory.createColumnGroup("Rslt.title02");
		p.cgRslt_title03 = p.beansFactory.createColumnGroup("Rslt.title03");
		p.cgRslt_title04 = p.beansFactory.createColumnGroup("Rslt.title04");
		p.cgRslt_title05 = p.beansFactory.createColumnGroup("Rslt.title05");
		p.cgRslt_title06 = p.beansFactory.createColumnGroup("Rslt.title06");
		p.cgRslt_title07 = p.beansFactory.createColumnGroup("Rslt.title07");
		p.cgRslt_title08 = p.beansFactory.createColumnGroup("Rslt.title08");
		p.cgRslt_title09 = p.beansFactory.createColumnGroup("Rslt.title09");
		p.cgRslt_title10 = p.beansFactory.createColumnGroup("Rslt.title10");
		p.cgRslt_title11 = p.beansFactory.createColumnGroup("Rslt.title11");
		p.cgRslt_title12 = p.beansFactory.createColumnGroup("Rslt.title12");
		p.cgRslt_title13 = p.beansFactory.createColumnGroup("Rslt.title13");
		p.cgRslt_title14 = p.beansFactory.createColumnGroup("Rslt.title14");
		p.cgRslt_title15 = p.beansFactory.createColumnGroup("Rslt.title15");
		p.cgRslt_title16 = p.beansFactory.createColumnGroup("Rslt.title16");
		p.cgRslt_title17 = p.beansFactory.createColumnGroup("Rslt.title17");
		p.cgRslt_title18 = p.beansFactory.createColumnGroup("Rslt.title18");
		p.cgRslt_title19 = p.beansFactory.createColumnGroup("Rslt.title19");
		p.cgRslt_title20 = p.beansFactory.createColumnGroup("Rslt.title20");
		p.cgRslt_title21 = p.beansFactory.createColumnGroup("Rslt.title21");
		p.cgRslt_title22 = p.beansFactory.createColumnGroup("Rslt.title22");
		p.cgRslt_title23 = p.beansFactory.createColumnGroup("Rslt.title23");
		p.cgRslt_title24 = p.beansFactory.createColumnGroup("Rslt.title24");
		p.cgRslt_title25 = p.beansFactory.createColumnGroup("Rslt.title25");
		p.cgRslt_title26 = p.beansFactory.createColumnGroup("Rslt.title26");
		p.cgRslt_title27 = p.beansFactory.createColumnGroup("Rslt.title27");
		p.cgRslt_title28 = p.beansFactory.createColumnGroup("Rslt.title28");
		p.cgRslt_title29 = p.beansFactory.createColumnGroup("Rslt.title29");
		p.cgRslt_title30 = p.beansFactory.createColumnGroup("Rslt.title30");
		p.cgRslt_diff_title = p.beansFactory.createColumnGroup("Rslt.diff_title");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBFP_CostIoSrch p) {
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
		p.FoldPanel.setNextBeans(p.LPnlPanel);
		p.TopPanel.add(p.LPnlPanel, null);
		p.LPnlPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MGBFP_CostIoSrch p) {
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
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MGBFP_CostIoSrch p) {
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
	protected static void jbInitTab2(MGBFP_CostIoSrch p) {
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
	protected static void jbInitTab3(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.TtlPanel, null);
		p.Tab3Panel.setLastBeans(p.TtlPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_no_p_PPanel.setNextBeans(p.Cnd_term);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setLinkBeans(p.Cnd_rmrks,p.Cnd_term,p.Cnd_st_ym);
		p.CndPanel.add(p.Cnd_term);
		p.Cnd_term.setNextBeans(p.Cnd_st_ym);
		p.Cnd_term.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.term_META);
		p.Cnd_term.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_st_ym);
		p.Cnd_st_ym.setNextBeans(p.Cnd_cost_io_id);
		p.Cnd_st_ym.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.st_ym_META);
		p.Cnd_st_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_cost_io_id.setListType(MCListType.FREE);
		p.Cnd_cost_io_id.setLinkBeans(p.Cnd_cost_io_nm);
		p.CndPanel.add(p.Cnd_cost_io_id_Label);
		p.CndPanel.add(p.Cnd_cost_io_id);
		p.Cnd_cost_io_id.setNextBeans(p.Cnd_cost_io_nm);
		p.Cnd_cost_io_id.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.cost_io_id_META);
		p.CndPanel.add(p.Cnd_cost_io_nm);
		p.Cnd_cost_io_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_cost_io_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.cost_io_nm_META);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_ym);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_ym.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_ym_Label);
		p.CndPanel.add(p.Cnd_ym);
		p.Cnd_ym.setNextBeans(p.Cnd_mng_dpt_cd);
		p.Cnd_ym.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.ym_META);
		p.Cnd_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_mng_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mng_dpt_cd, true);
		p.Cnd_mng_dpt_cd.setLinkBeans(p.Cnd_mng_dpt_nm);
		p.CndPanel.add(p.Cnd_mng_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_mng_dpt_cd);
		p.Cnd_mng_dpt_cd.setNextBeans(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.mng_dpt_cd_META);
		p.CndPanel.add(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_mng_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.mng_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_mng_dpt_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_jnl_cd, true);
		p.Cnd_itm_jnl_cd.setLinkBeans(p.Cnd_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setNextBeans(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_jnl_nm_META);
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
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno1);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.sublot_no_META);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno1_Label);
		p.CndPanel.add(p.Cnd_sno1);
		p.Cnd_sno1.setNextBeans(p.Cnd_sno2);
		p.Cnd_sno1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.sno1_META);
		p.setPluralValueEnable(p.Cnd_sno1, true);
		p.CndPanel.add(p.Cnd_sno2_Label);
		p.CndPanel.add(p.Cnd_sno2);
		p.Cnd_sno2.setNextBeans(p.Cnd_sno3);
		p.Cnd_sno2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.sno2_META);
		p.setPluralValueEnable(p.Cnd_sno2, true);
		p.CndPanel.add(p.Cnd_sno3_Label);
		p.CndPanel.add(p.Cnd_sno3);
		p.Cnd_sno3.setNextBeans(p.Cnd_sno4);
		p.Cnd_sno3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.sno3_META);
		p.setPluralValueEnable(p.Cnd_sno3, true);
		p.CndPanel.add(p.Cnd_sno4_Label);
		p.CndPanel.add(p.Cnd_sno4);
		p.Cnd_sno4.setNextBeans(p.Cnd_bp_cd);
		p.Cnd_sno4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.sno4_META);
		p.setPluralValueEnable(p.Cnd_sno4, true);
		p.CndPanel.add(p.Cnd_bp_cd_Label);
		p.CndPanel.add(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_cd, true);
		p.CndPanel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_no_bp_flg);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.bp_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_nm, true);
		p.CndPanel.add(p.Cnd_no_bp_flg);
		p.Cnd_no_bp_flg.setNextBeans(p.Cnd_asst_typ);
		p.Cnd_no_bp_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.no_bp_flg_META);
		p.Cnd_asst_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asst_typ, true);
		p.Cnd_asst_typ.setLinkBeans(p.Cnd_asst_typ_nm);
		p.CndPanel.add(p.Cnd_asst_typ_Label);
		p.CndPanel.add(p.Cnd_asst_typ);
		p.Cnd_asst_typ.setNextBeans(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.asst_typ_META);
		p.CndPanel.add(p.Cnd_asst_typ_nm);
		p.Cnd_asst_typ_nm.setNextBeans(p.Cnd_except_other_flg);
		p.Cnd_asst_typ_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.asst_typ_nm_META);
		p.CndPanel.add(p.Cnd_except_other_flg);
		p.Cnd_except_other_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.except_other_flg_META);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
		p.TtlPanel.add(p.Cnd_wg_flg);
		p.TtlPanel.setLastBeans(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setNextBeans(p.Cnd_mng_dpt_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.wg_flg_META);
		p.TtlPanel.add(p.Cnd_mng_dpt_flg);
		p.Cnd_mng_dpt_flg.setNextBeans(p.Cnd_lot_flg);
		p.Cnd_mng_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.mng_dpt_flg_META);
		p.TtlPanel.add(p.Cnd_lot_flg);
		p.Cnd_lot_flg.setNextBeans(p.Cnd_sublot_flg);
		p.Cnd_lot_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.lot_flg_META);
		p.TtlPanel.add(p.Cnd_sublot_flg);
		p.Cnd_sublot_flg.setNextBeans(p.Cnd_sno1_flg);
		p.Cnd_sublot_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.sublot_flg_META);
		p.TtlPanel.add(p.Cnd_sno1_flg);
		p.Cnd_sno1_flg.setNextBeans(p.Cnd_sno2_flg);
		p.Cnd_sno1_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.sno1_flg_META);
		p.TtlPanel.add(p.Cnd_sno2_flg);
		p.Cnd_sno2_flg.setNextBeans(p.Cnd_sno3_flg);
		p.Cnd_sno2_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.sno2_flg_META);
		p.TtlPanel.add(p.Cnd_sno3_flg);
		p.Cnd_sno3_flg.setNextBeans(p.Cnd_sno4_flg);
		p.Cnd_sno3_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.sno3_flg_META);
		p.TtlPanel.add(p.Cnd_sno4_flg);
		p.Cnd_sno4_flg.setNextBeans(p.Cnd_bp_flg);
		p.Cnd_sno4_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.sno4_flg_META);
		p.TtlPanel.add(p.Cnd_bp_flg);
		p.Cnd_bp_flg.setNextBeans(p.Cnd_asst_typ_flg);
		p.Cnd_bp_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.bp_flg_META);
		p.TtlPanel.add(p.Cnd_asst_typ_flg);
		p.Cnd_asst_typ_flg.setNextBeans(p.Cnd_select_all);
		p.Cnd_asst_typ_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0260.CndR.asst_typ_flg_META);
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
	protected static void jbInitCnd2(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTtl(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.TtlPanel.setValueCheck(false);
		p.TtlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.LPnlPanel.add(p.LPnl_diff);
		p.LPnlPanel.setLastBeans(p.LPnl_diff);
		p.LPnl_diff.setRow(p.getLPnlR(), mcframe.clientMGBF.MGBFP0260.LPnlR.diff_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBFP_CostIoSrch p) {
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
	protected static void jbInitRslt(MGBFP_CostIoSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
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
		MGBFP_CostIoSrch_MC.mcInitTop((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.mcInitFold((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.mcInitTab1((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.mcInitTab2((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.mcInitTab3((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.mcInitCnd((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.mcInitCnd2((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.mcInitTtl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.mcInitLPnl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.mcInitCtrl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.mcInitRslt((MGBFP_CostIoSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBFP_CostIoSrch_MC.statusInitSRCH_Top((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitSRCH_Fold((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitSRCH_Tab1((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitSRCH_Tab2((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitSRCH_Tab3((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitSRCH_Cnd((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitSRCH_Cnd2((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitSRCH_Ttl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitSRCH_LPnl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitSRCH_Ctrl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitSRCH_Rslt((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitSRCH_Mstr((MGBFP_CostIoSrch)this);

		// [REF]ステータスのモードの設定
		MGBFP_CostIoSrch_MC.statusInitREF_Top((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitREF_Fold((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitREF_Tab1((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitREF_Tab2((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitREF_Tab3((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitREF_Cnd((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitREF_Cnd2((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitREF_Ttl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitREF_LPnl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitREF_Ctrl((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitREF_Rslt((MGBFP_CostIoSrch)this);
		MGBFP_CostIoSrch_MC.statusInitREF_Mstr((MGBFP_CostIoSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBFP_CostIoSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBFP_CostIoSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBFP_CostIoSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBFP_CostIoSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MGBFP_CostIoSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBFP_CostIoSrch p) {
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_term.setListListener(p);
		p.Cnd_term.addAllListener(p);
		p.Cnd_st_ym.setListListener(p);
		p.Cnd_st_ym.addAllListener(p);
		p.Cnd_cost_io_id.setListListener(p);
		p.Cnd_cost_io_id.addAllListener(p);
		p.Cnd_cost_io_nm.setListListener(p);
		p.Cnd_cost_io_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_ym.setListListener(p);
		p.Cnd_ym.addAllListener(p);
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
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_no_bp_flg.addAllListener(p);
		p.Cnd_asst_typ.setListListener(p);
		p.Cnd_asst_typ.addAllListener(p);
		p.Cnd_asst_typ_nm.setListListener(p);
		p.Cnd_asst_typ_nm.addAllListener(p);
		p.Cnd_except_other_flg.addAllListener(p);
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
		p.Cnd_lot_flg.addAllListener(p);
		p.Cnd_sublot_flg.addAllListener(p);
		p.Cnd_sno1_flg.addAllListener(p);
		p.Cnd_sno2_flg.addAllListener(p);
		p.Cnd_sno3_flg.addAllListener(p);
		p.Cnd_sno4_flg.addAllListener(p);
		p.Cnd_bp_flg.addAllListener(p);
		p.Cnd_asst_typ_flg.addAllListener(p);
		p.Cnd_select_all.addAllListener(p);
		p.Cnd_select_all.setAPMethodName("doCnd_select_all");
		p.Cnd_deselect_all.addAllListener(p);
		p.Cnd_deselect_all.setAPMethodName("doCnd_deselect_all");
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBFP_CostIoSrch p) {
	}

	/**
	 *  [Ttl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTtl(MGBFP_CostIoSrch p) {
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MGBFP_CostIoSrch p) {
		p.LPnl_diff.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBFP_CostIoSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBFP_CostIoSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_ym.addAllListener(p);
		p.columnRslt_ym.setListListener(p);
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
		p.columnRslt_bp_cd.addAllListener(p);
		p.columnRslt_bp_cd.setListListener(p);
		p.columnRslt_bp_nm.addAllListener(p);
		p.columnRslt_bp_nm.setListListener(p);
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
		p.columnRslt_upri01.addAllListener(p);
		p.columnRslt_upri01.setListListener(p);
		p.columnRslt_std01.addAllListener(p);
		p.columnRslt_std01.setListListener(p);
		p.columnRslt_amt01.addAllListener(p);
		p.columnRslt_amt01.setListListener(p);
		p.columnRslt_diff01.addAllListener(p);
		p.columnRslt_diff01.setListListener(p);
		p.columnRslt_upri02.addAllListener(p);
		p.columnRslt_upri02.setListListener(p);
		p.columnRslt_std02.addAllListener(p);
		p.columnRslt_std02.setListListener(p);
		p.columnRslt_amt02.addAllListener(p);
		p.columnRslt_amt02.setListListener(p);
		p.columnRslt_diff02.addAllListener(p);
		p.columnRslt_diff02.setListListener(p);
		p.columnRslt_upri03.addAllListener(p);
		p.columnRslt_upri03.setListListener(p);
		p.columnRslt_std03.addAllListener(p);
		p.columnRslt_std03.setListListener(p);
		p.columnRslt_amt03.addAllListener(p);
		p.columnRslt_amt03.setListListener(p);
		p.columnRslt_diff03.addAllListener(p);
		p.columnRslt_diff03.setListListener(p);
		p.columnRslt_upri04.addAllListener(p);
		p.columnRslt_upri04.setListListener(p);
		p.columnRslt_std04.addAllListener(p);
		p.columnRslt_std04.setListListener(p);
		p.columnRslt_amt04.addAllListener(p);
		p.columnRslt_amt04.setListListener(p);
		p.columnRslt_diff04.addAllListener(p);
		p.columnRslt_diff04.setListListener(p);
		p.columnRslt_upri05.addAllListener(p);
		p.columnRslt_upri05.setListListener(p);
		p.columnRslt_std05.addAllListener(p);
		p.columnRslt_std05.setListListener(p);
		p.columnRslt_amt05.addAllListener(p);
		p.columnRslt_amt05.setListListener(p);
		p.columnRslt_diff05.addAllListener(p);
		p.columnRslt_diff05.setListListener(p);
		p.columnRslt_upri06.addAllListener(p);
		p.columnRslt_upri06.setListListener(p);
		p.columnRslt_std06.addAllListener(p);
		p.columnRslt_std06.setListListener(p);
		p.columnRslt_amt06.addAllListener(p);
		p.columnRslt_amt06.setListListener(p);
		p.columnRslt_diff06.addAllListener(p);
		p.columnRslt_diff06.setListListener(p);
		p.columnRslt_upri07.addAllListener(p);
		p.columnRslt_upri07.setListListener(p);
		p.columnRslt_std07.addAllListener(p);
		p.columnRslt_std07.setListListener(p);
		p.columnRslt_amt07.addAllListener(p);
		p.columnRslt_amt07.setListListener(p);
		p.columnRslt_diff07.addAllListener(p);
		p.columnRslt_diff07.setListListener(p);
		p.columnRslt_upri08.addAllListener(p);
		p.columnRslt_upri08.setListListener(p);
		p.columnRslt_std08.addAllListener(p);
		p.columnRslt_std08.setListListener(p);
		p.columnRslt_amt08.addAllListener(p);
		p.columnRslt_amt08.setListListener(p);
		p.columnRslt_diff08.addAllListener(p);
		p.columnRslt_diff08.setListListener(p);
		p.columnRslt_upri09.addAllListener(p);
		p.columnRslt_upri09.setListListener(p);
		p.columnRslt_std09.addAllListener(p);
		p.columnRslt_std09.setListListener(p);
		p.columnRslt_amt09.addAllListener(p);
		p.columnRslt_amt09.setListListener(p);
		p.columnRslt_diff09.addAllListener(p);
		p.columnRslt_diff09.setListListener(p);
		p.columnRslt_upri10.addAllListener(p);
		p.columnRslt_upri10.setListListener(p);
		p.columnRslt_std10.addAllListener(p);
		p.columnRslt_std10.setListListener(p);
		p.columnRslt_amt10.addAllListener(p);
		p.columnRslt_amt10.setListListener(p);
		p.columnRslt_diff10.addAllListener(p);
		p.columnRslt_diff10.setListListener(p);
		p.columnRslt_upri11.addAllListener(p);
		p.columnRslt_upri11.setListListener(p);
		p.columnRslt_std11.addAllListener(p);
		p.columnRslt_std11.setListListener(p);
		p.columnRslt_amt11.addAllListener(p);
		p.columnRslt_amt11.setListListener(p);
		p.columnRslt_diff11.addAllListener(p);
		p.columnRslt_diff11.setListListener(p);
		p.columnRslt_upri12.addAllListener(p);
		p.columnRslt_upri12.setListListener(p);
		p.columnRslt_std12.addAllListener(p);
		p.columnRslt_std12.setListListener(p);
		p.columnRslt_amt12.addAllListener(p);
		p.columnRslt_amt12.setListListener(p);
		p.columnRslt_diff12.addAllListener(p);
		p.columnRslt_diff12.setListListener(p);
		p.columnRslt_upri13.addAllListener(p);
		p.columnRslt_upri13.setListListener(p);
		p.columnRslt_std13.addAllListener(p);
		p.columnRslt_std13.setListListener(p);
		p.columnRslt_amt13.addAllListener(p);
		p.columnRslt_amt13.setListListener(p);
		p.columnRslt_diff13.addAllListener(p);
		p.columnRslt_diff13.setListListener(p);
		p.columnRslt_upri14.addAllListener(p);
		p.columnRslt_upri14.setListListener(p);
		p.columnRslt_std14.addAllListener(p);
		p.columnRslt_std14.setListListener(p);
		p.columnRslt_amt14.addAllListener(p);
		p.columnRslt_amt14.setListListener(p);
		p.columnRslt_diff14.addAllListener(p);
		p.columnRslt_diff14.setListListener(p);
		p.columnRslt_upri15.addAllListener(p);
		p.columnRslt_upri15.setListListener(p);
		p.columnRslt_std15.addAllListener(p);
		p.columnRslt_std15.setListListener(p);
		p.columnRslt_amt15.addAllListener(p);
		p.columnRslt_amt15.setListListener(p);
		p.columnRslt_diff15.addAllListener(p);
		p.columnRslt_diff15.setListListener(p);
		p.columnRslt_upri16.addAllListener(p);
		p.columnRslt_upri16.setListListener(p);
		p.columnRslt_std16.addAllListener(p);
		p.columnRslt_std16.setListListener(p);
		p.columnRslt_amt16.addAllListener(p);
		p.columnRslt_amt16.setListListener(p);
		p.columnRslt_diff16.addAllListener(p);
		p.columnRslt_diff16.setListListener(p);
		p.columnRslt_upri17.addAllListener(p);
		p.columnRslt_upri17.setListListener(p);
		p.columnRslt_std17.addAllListener(p);
		p.columnRslt_std17.setListListener(p);
		p.columnRslt_amt17.addAllListener(p);
		p.columnRslt_amt17.setListListener(p);
		p.columnRslt_diff17.addAllListener(p);
		p.columnRslt_diff17.setListListener(p);
		p.columnRslt_upri18.addAllListener(p);
		p.columnRslt_upri18.setListListener(p);
		p.columnRslt_std18.addAllListener(p);
		p.columnRslt_std18.setListListener(p);
		p.columnRslt_amt18.addAllListener(p);
		p.columnRslt_amt18.setListListener(p);
		p.columnRslt_diff18.addAllListener(p);
		p.columnRslt_diff18.setListListener(p);
		p.columnRslt_upri19.addAllListener(p);
		p.columnRslt_upri19.setListListener(p);
		p.columnRslt_std19.addAllListener(p);
		p.columnRslt_std19.setListListener(p);
		p.columnRslt_amt19.addAllListener(p);
		p.columnRslt_amt19.setListListener(p);
		p.columnRslt_diff19.addAllListener(p);
		p.columnRslt_diff19.setListListener(p);
		p.columnRslt_upri20.addAllListener(p);
		p.columnRslt_upri20.setListListener(p);
		p.columnRslt_std20.addAllListener(p);
		p.columnRslt_std20.setListListener(p);
		p.columnRslt_amt20.addAllListener(p);
		p.columnRslt_amt20.setListListener(p);
		p.columnRslt_diff20.addAllListener(p);
		p.columnRslt_diff20.setListListener(p);
		p.columnRslt_upri21.addAllListener(p);
		p.columnRslt_upri21.setListListener(p);
		p.columnRslt_std21.addAllListener(p);
		p.columnRslt_std21.setListListener(p);
		p.columnRslt_amt21.addAllListener(p);
		p.columnRslt_amt21.setListListener(p);
		p.columnRslt_diff21.addAllListener(p);
		p.columnRslt_diff21.setListListener(p);
		p.columnRslt_upri22.addAllListener(p);
		p.columnRslt_upri22.setListListener(p);
		p.columnRslt_std22.addAllListener(p);
		p.columnRslt_std22.setListListener(p);
		p.columnRslt_amt22.addAllListener(p);
		p.columnRslt_amt22.setListListener(p);
		p.columnRslt_diff22.addAllListener(p);
		p.columnRslt_diff22.setListListener(p);
		p.columnRslt_upri23.addAllListener(p);
		p.columnRslt_upri23.setListListener(p);
		p.columnRslt_std23.addAllListener(p);
		p.columnRslt_std23.setListListener(p);
		p.columnRslt_amt23.addAllListener(p);
		p.columnRslt_amt23.setListListener(p);
		p.columnRslt_diff23.addAllListener(p);
		p.columnRslt_diff23.setListListener(p);
		p.columnRslt_upri24.addAllListener(p);
		p.columnRslt_upri24.setListListener(p);
		p.columnRslt_std24.addAllListener(p);
		p.columnRslt_std24.setListListener(p);
		p.columnRslt_amt24.addAllListener(p);
		p.columnRslt_amt24.setListListener(p);
		p.columnRslt_diff24.addAllListener(p);
		p.columnRslt_diff24.setListListener(p);
		p.columnRslt_upri25.addAllListener(p);
		p.columnRslt_upri25.setListListener(p);
		p.columnRslt_std25.addAllListener(p);
		p.columnRslt_std25.setListListener(p);
		p.columnRslt_amt25.addAllListener(p);
		p.columnRslt_amt25.setListListener(p);
		p.columnRslt_diff25.addAllListener(p);
		p.columnRslt_diff25.setListListener(p);
		p.columnRslt_upri26.addAllListener(p);
		p.columnRslt_upri26.setListListener(p);
		p.columnRslt_std26.addAllListener(p);
		p.columnRslt_std26.setListListener(p);
		p.columnRslt_amt26.addAllListener(p);
		p.columnRslt_amt26.setListListener(p);
		p.columnRslt_diff26.addAllListener(p);
		p.columnRslt_diff26.setListListener(p);
		p.columnRslt_upri27.addAllListener(p);
		p.columnRslt_upri27.setListListener(p);
		p.columnRslt_std27.addAllListener(p);
		p.columnRslt_std27.setListListener(p);
		p.columnRslt_amt27.addAllListener(p);
		p.columnRslt_amt27.setListListener(p);
		p.columnRslt_diff27.addAllListener(p);
		p.columnRslt_diff27.setListListener(p);
		p.columnRslt_upri28.addAllListener(p);
		p.columnRslt_upri28.setListListener(p);
		p.columnRslt_std28.addAllListener(p);
		p.columnRslt_std28.setListListener(p);
		p.columnRslt_amt28.addAllListener(p);
		p.columnRslt_amt28.setListListener(p);
		p.columnRslt_diff28.addAllListener(p);
		p.columnRslt_diff28.setListListener(p);
		p.columnRslt_upri29.addAllListener(p);
		p.columnRslt_upri29.setListListener(p);
		p.columnRslt_std29.addAllListener(p);
		p.columnRslt_std29.setListListener(p);
		p.columnRslt_amt29.addAllListener(p);
		p.columnRslt_amt29.setListListener(p);
		p.columnRslt_diff29.addAllListener(p);
		p.columnRslt_diff29.setListListener(p);
		p.columnRslt_upri30.addAllListener(p);
		p.columnRslt_upri30.setListListener(p);
		p.columnRslt_std30.addAllListener(p);
		p.columnRslt_std30.setListListener(p);
		p.columnRslt_amt30.addAllListener(p);
		p.columnRslt_amt30.setListListener(p);
		p.columnRslt_diff30.addAllListener(p);
		p.columnRslt_diff30.setListListener(p);
		p.columnRslt_diff_std.addAllListener(p);
		p.columnRslt_diff_std.setListListener(p);
		p.columnRslt_diff_amt.addAllListener(p);
		p.columnRslt_diff_amt.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBFP_CostIoSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBFP_CostIoSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MGBFP_CostIoSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MGBFP_CostIoSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MGBFP_CostIoSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBFP_CostIoSrch p){
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_term.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_st_ym.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_cost_io_id.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cost_io_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ym.putMode(p, SRCH, MCMode.ENABLE);
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
		p.Cnd_bp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_no_bp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_asst_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_except_other_flg.putMode(p, SRCH, MCMode.REQUIRED);
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
		p.Cnd_lot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sublot_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno1_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno2_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno3_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sno4_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_asst_typ_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MGBFP_CostIoSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ttl(MGBFP_CostIoSrch p){

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MGBFP_CostIoSrch p){
		p.LPnl_diff.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBFP_CostIoSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBFP_CostIoSrch p){
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upri01.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty01_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std01.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt01.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff01.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri02.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty02_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std02.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt02.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff02.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri03.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty03_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std03.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt03.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff03.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri04.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty04_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std04.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt04.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff04.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri05.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty05_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std05.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt05.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff05.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri06.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty06_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std06.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt06.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff06.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri07.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty07_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std07.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt07.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff07.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri08.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty08_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std08.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt08.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff08.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri09.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty09_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std09.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt09.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff09.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty10_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri11.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty11_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std11.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt11.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff11.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri12.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty12_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std12.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt12.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff12.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri13.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty13_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std13.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt13.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff13.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri14.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty14_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std14.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt14.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff14.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri15.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty15_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std15.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt15.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff15.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri16.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty16_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std16.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt16.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff16.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri17.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty17_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std17.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt17.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff17.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri18.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty18_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std18.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt18.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff18.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri19.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty19_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std19.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt19.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff19.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri20.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty20_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std20.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt20.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff20.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri21.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty21_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std21.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt21.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff21.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri22.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty22_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std22.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt22.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff22.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri23.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty23_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std23.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt23.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff23.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri24.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty24_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std24.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt24.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff24.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri25.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty25_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std25.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt25.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff25.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri26.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty26_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std26.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt26.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff26.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri27.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty27_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std27.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt27.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff27.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri28.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty28_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std28.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt28.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff28.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri29.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty29_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std29.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt29.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff29.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upri30.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty30_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std30.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt30.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff30.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_diff_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_diff_std.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_diff_amt.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Mstr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Mstr(MGBFP_CostIoSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBFP_CostIoSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBFP_CostIoSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBFP_CostIoSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBFP_CostIoSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MGBFP_CostIoSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBFP_CostIoSrch p){
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(REF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_term.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_st_ym.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_cost_io_id.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cost_io_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ym.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_bp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_asst_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_except_other_flg.putMode(p, REF, MCMode.REQUIRED);
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
		p.Cnd_lot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sublot_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno1_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno2_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno3_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sno4_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_asst_typ_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBFP_CostIoSrch p){

	}

	/**
	 * [REF]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ttl(MGBFP_CostIoSrch p){

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MGBFP_CostIoSrch p){
		p.LPnl_diff.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBFP_CostIoSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBFP_CostIoSrch p){
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mng_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_upri01.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty01_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std01.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt01.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff01.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri02.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty02_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std02.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt02.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff02.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri03.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty03_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std03.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt03.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff03.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri04.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty04_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std04.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt04.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff04.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri05.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty05_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std05.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt05.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff05.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri06.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty06_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std06.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt06.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff06.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri07.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty07_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std07.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt07.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff07.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri08.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty08_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std08.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt08.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff08.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri09.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty09_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std09.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt09.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff09.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri10.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty10_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri11.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty11_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std11.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt11.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff11.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri12.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty12_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std12.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt12.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff12.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri13.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty13_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std13.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt13.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff13.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri14.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty14_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std14.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt14.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff14.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri15.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty15_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std15.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt15.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff15.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri16.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty16_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std16.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt16.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff16.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri17.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty17_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std17.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt17.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff17.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri18.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty18_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std18.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt18.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff18.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri19.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty19_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std19.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt19.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff19.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri20.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty20_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std20.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt20.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff20.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri21.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty21_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std21.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt21.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff21.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri22.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty22_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std22.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt22.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff22.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri23.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty23_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std23.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt23.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff23.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri24.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty24_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std24.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt24.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff24.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri25.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty25_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std25.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt25.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff25.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri26.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty26_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std26.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt26.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff26.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri27.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty27_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std27.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt27.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff27.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri28.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty28_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std28.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt28.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff28.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri29.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty29_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std29.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt29.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff29.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri30.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty30_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_std30.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt30.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff30.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_diff_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_diff_std.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_diff_amt.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Mstr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mstr(MGBFP_CostIoSrch p){

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
		MGBFP_CostIoSrch_MC.setTableConfigRslt((MGBFP_CostIoSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBFP_CostIoSrch p) {
		p.columnRslt_wg_cd.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_ym.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.ym_META);
		p.columnRslt_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ym);
		p.columnRslt_mng_dpt_cd.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.mng_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mng_dpt_cd);
		p.columnRslt_mng_dpt_nm.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.mng_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mng_dpt_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.columnRslt_itm_jnl_cd.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.itm_jnl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_cd);
		p.columnRslt_itm_jnl_nm.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.itm_jnl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_nm);
		p.columnRslt_lot_no.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.columnRslt_sno1.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.sno1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1);
		p.columnRslt_sno2.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.sno2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2);
		p.columnRslt_sno3.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.sno3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3);
		p.columnRslt_sno4.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.sno4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4);
		p.columnRslt_bp_cd.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_cd);
		p.columnRslt_bp_nm.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_nm);
		p.columnRslt_asst_typ.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.asst_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asst_typ);
		p.columnRslt_asst_typ_nm.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.asst_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asst_typ_nm);
		p.columnRslt_unit_cd.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_cd);
		p.columnRslt_unit_nm.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_nm);
		p.columnRslt_dec_place.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.columnRslt_upri01.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri01_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri01);
		p.RsltTable.addTable(p.Rslt_qty01_p_PPanel.QtyTable);
		p.Rslt_qty01_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std01.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std01_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std01);
		p.columnRslt_amt01.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt01_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt01);
		p.columnRslt_diff01.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff01_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff01);
		p.columnRslt_upri02.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri02_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri02);
		p.RsltTable.addTable(p.Rslt_qty02_p_PPanel.QtyTable);
		p.Rslt_qty02_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std02.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std02_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std02);
		p.columnRslt_amt02.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt02_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt02);
		p.columnRslt_diff02.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff02_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff02);
		p.columnRslt_upri03.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri03_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri03);
		p.RsltTable.addTable(p.Rslt_qty03_p_PPanel.QtyTable);
		p.Rslt_qty03_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std03.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std03_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std03);
		p.columnRslt_amt03.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt03_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt03);
		p.columnRslt_diff03.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff03_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff03);
		p.columnRslt_upri04.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri04_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri04);
		p.RsltTable.addTable(p.Rslt_qty04_p_PPanel.QtyTable);
		p.Rslt_qty04_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std04.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std04_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std04);
		p.columnRslt_amt04.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt04_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt04);
		p.columnRslt_diff04.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff04_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff04);
		p.columnRslt_upri05.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri05_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri05);
		p.RsltTable.addTable(p.Rslt_qty05_p_PPanel.QtyTable);
		p.Rslt_qty05_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std05.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std05_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std05);
		p.columnRslt_amt05.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt05_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt05);
		p.columnRslt_diff05.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff05_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff05);
		p.columnRslt_upri06.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri06_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri06);
		p.RsltTable.addTable(p.Rslt_qty06_p_PPanel.QtyTable);
		p.Rslt_qty06_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std06.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std06_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std06);
		p.columnRslt_amt06.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt06_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt06);
		p.columnRslt_diff06.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff06_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff06);
		p.columnRslt_upri07.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri07_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri07);
		p.RsltTable.addTable(p.Rslt_qty07_p_PPanel.QtyTable);
		p.Rslt_qty07_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std07.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std07_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std07);
		p.columnRslt_amt07.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt07_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt07);
		p.columnRslt_diff07.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff07_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff07);
		p.columnRslt_upri08.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri08_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri08);
		p.RsltTable.addTable(p.Rslt_qty08_p_PPanel.QtyTable);
		p.Rslt_qty08_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std08.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std08_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std08);
		p.columnRslt_amt08.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt08_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt08);
		p.columnRslt_diff08.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff08_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff08);
		p.columnRslt_upri09.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri09_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri09);
		p.RsltTable.addTable(p.Rslt_qty09_p_PPanel.QtyTable);
		p.Rslt_qty09_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std09.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std09_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std09);
		p.columnRslt_amt09.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt09_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt09);
		p.columnRslt_diff09.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff09_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff09);
		p.columnRslt_upri10.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri10);
		p.RsltTable.addTable(p.Rslt_qty10_p_PPanel.QtyTable);
		p.Rslt_qty10_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std10.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std10);
		p.columnRslt_amt10.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt10);
		p.columnRslt_diff10.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff10);
		p.columnRslt_upri11.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri11_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri11);
		p.RsltTable.addTable(p.Rslt_qty11_p_PPanel.QtyTable);
		p.Rslt_qty11_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std11.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std11_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std11);
		p.columnRslt_amt11.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt11_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt11);
		p.columnRslt_diff11.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff11_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff11);
		p.columnRslt_upri12.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri12_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri12);
		p.RsltTable.addTable(p.Rslt_qty12_p_PPanel.QtyTable);
		p.Rslt_qty12_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std12.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std12_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std12);
		p.columnRslt_amt12.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt12_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt12);
		p.columnRslt_diff12.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff12_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff12);
		p.columnRslt_upri13.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri13_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri13);
		p.RsltTable.addTable(p.Rslt_qty13_p_PPanel.QtyTable);
		p.Rslt_qty13_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std13.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std13_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std13);
		p.columnRslt_amt13.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt13_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt13);
		p.columnRslt_diff13.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff13_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff13);
		p.columnRslt_upri14.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri14_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri14);
		p.RsltTable.addTable(p.Rslt_qty14_p_PPanel.QtyTable);
		p.Rslt_qty14_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std14.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std14_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std14);
		p.columnRslt_amt14.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt14_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt14);
		p.columnRslt_diff14.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff14_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff14);
		p.columnRslt_upri15.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri15_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri15);
		p.RsltTable.addTable(p.Rslt_qty15_p_PPanel.QtyTable);
		p.Rslt_qty15_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std15.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std15_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std15);
		p.columnRslt_amt15.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt15_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt15);
		p.columnRslt_diff15.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff15_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff15);
		p.columnRslt_upri16.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri16_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri16);
		p.RsltTable.addTable(p.Rslt_qty16_p_PPanel.QtyTable);
		p.Rslt_qty16_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std16.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std16_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std16);
		p.columnRslt_amt16.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt16_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt16);
		p.columnRslt_diff16.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff16_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff16);
		p.columnRslt_upri17.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri17_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri17);
		p.RsltTable.addTable(p.Rslt_qty17_p_PPanel.QtyTable);
		p.Rslt_qty17_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std17.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std17_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std17);
		p.columnRslt_amt17.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt17_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt17);
		p.columnRslt_diff17.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff17_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff17);
		p.columnRslt_upri18.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri18_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri18);
		p.RsltTable.addTable(p.Rslt_qty18_p_PPanel.QtyTable);
		p.Rslt_qty18_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std18.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std18_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std18);
		p.columnRslt_amt18.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt18_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt18);
		p.columnRslt_diff18.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff18_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff18);
		p.columnRslt_upri19.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri19_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri19);
		p.RsltTable.addTable(p.Rslt_qty19_p_PPanel.QtyTable);
		p.Rslt_qty19_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std19.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std19_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std19);
		p.columnRslt_amt19.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt19_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt19);
		p.columnRslt_diff19.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff19_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff19);
		p.columnRslt_upri20.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri20_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri20);
		p.RsltTable.addTable(p.Rslt_qty20_p_PPanel.QtyTable);
		p.Rslt_qty20_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std20.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std20_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std20);
		p.columnRslt_amt20.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt20_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt20);
		p.columnRslt_diff20.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff20_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff20);
		p.columnRslt_upri21.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri21_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri21);
		p.RsltTable.addTable(p.Rslt_qty21_p_PPanel.QtyTable);
		p.Rslt_qty21_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std21.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std21_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std21);
		p.columnRslt_amt21.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt21_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt21);
		p.columnRslt_diff21.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff21_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff21);
		p.columnRslt_upri22.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri22_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri22);
		p.RsltTable.addTable(p.Rslt_qty22_p_PPanel.QtyTable);
		p.Rslt_qty22_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std22.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std22_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std22);
		p.columnRslt_amt22.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt22_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt22);
		p.columnRslt_diff22.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff22_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff22);
		p.columnRslt_upri23.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri23_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri23);
		p.RsltTable.addTable(p.Rslt_qty23_p_PPanel.QtyTable);
		p.Rslt_qty23_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std23.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std23_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std23);
		p.columnRslt_amt23.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt23_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt23);
		p.columnRslt_diff23.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff23_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff23);
		p.columnRslt_upri24.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri24_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri24);
		p.RsltTable.addTable(p.Rslt_qty24_p_PPanel.QtyTable);
		p.Rslt_qty24_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std24.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std24_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std24);
		p.columnRslt_amt24.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt24_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt24);
		p.columnRslt_diff24.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff24_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff24);
		p.columnRslt_upri25.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri25_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri25);
		p.RsltTable.addTable(p.Rslt_qty25_p_PPanel.QtyTable);
		p.Rslt_qty25_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std25.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std25_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std25);
		p.columnRslt_amt25.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt25_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt25);
		p.columnRslt_diff25.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff25_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff25);
		p.columnRslt_upri26.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri26_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri26);
		p.RsltTable.addTable(p.Rslt_qty26_p_PPanel.QtyTable);
		p.Rslt_qty26_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std26.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std26_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std26);
		p.columnRslt_amt26.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt26_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt26);
		p.columnRslt_diff26.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff26_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff26);
		p.columnRslt_upri27.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri27_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri27);
		p.RsltTable.addTable(p.Rslt_qty27_p_PPanel.QtyTable);
		p.Rslt_qty27_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std27.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std27_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std27);
		p.columnRslt_amt27.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt27_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt27);
		p.columnRslt_diff27.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff27_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff27);
		p.columnRslt_upri28.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri28_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri28);
		p.RsltTable.addTable(p.Rslt_qty28_p_PPanel.QtyTable);
		p.Rslt_qty28_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std28.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std28_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std28);
		p.columnRslt_amt28.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt28_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt28);
		p.columnRslt_diff28.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff28_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff28);
		p.columnRslt_upri29.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri29_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri29);
		p.RsltTable.addTable(p.Rslt_qty29_p_PPanel.QtyTable);
		p.Rslt_qty29_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std29.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std29_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std29);
		p.columnRslt_amt29.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt29_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt29);
		p.columnRslt_diff29.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff29_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff29);
		p.columnRslt_upri30.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.upri30_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri30);
		p.RsltTable.addTable(p.Rslt_qty30_p_PPanel.QtyTable);
		p.Rslt_qty30_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_std30.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.std30_META);
		p.RsltTable.addColumnConfig(p.columnRslt_std30);
		p.columnRslt_amt30.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.amt30_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt30);
		p.columnRslt_diff30.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff30_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff30);
		p.RsltTable.addTable(p.Rslt_diff_qty_p_PPanel.QtyTable);
		p.Rslt_diff_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_diff_std.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff_std_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff_std);
		p.columnRslt_diff_amt.setMeta(mcframe.clientMGBF.MGBFP0260.RsltR.diff_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_diff_amt);
		p.RsltTable.addColumnGroup(p.Rslt_itm_p_PPanel.ItmTable);
		p.cgRslt_title01.add(p.columnRslt_upri01);
		p.cgRslt_title01.add(p.Rslt_qty01_p_PPanel.QtyTable);
		p.cgRslt_title01.add(p.columnRslt_std01);
		p.cgRslt_title01.add(p.columnRslt_amt01);
		p.cgRslt_title01.add(p.columnRslt_diff01);
		p.RsltTable.addColumnGroup(p.cgRslt_title01);
		p.cgRslt_title02.add(p.columnRslt_upri02);
		p.cgRslt_title02.add(p.Rslt_qty02_p_PPanel.QtyTable);
		p.cgRslt_title02.add(p.columnRslt_std02);
		p.cgRslt_title02.add(p.columnRslt_amt02);
		p.cgRslt_title02.add(p.columnRslt_diff02);
		p.RsltTable.addColumnGroup(p.cgRslt_title02);
		p.cgRslt_title03.add(p.columnRslt_upri03);
		p.cgRslt_title03.add(p.Rslt_qty03_p_PPanel.QtyTable);
		p.cgRslt_title03.add(p.columnRslt_std03);
		p.cgRslt_title03.add(p.columnRslt_amt03);
		p.cgRslt_title03.add(p.columnRslt_diff03);
		p.RsltTable.addColumnGroup(p.cgRslt_title03);
		p.cgRslt_title04.add(p.columnRslt_upri04);
		p.cgRslt_title04.add(p.Rslt_qty04_p_PPanel.QtyTable);
		p.cgRslt_title04.add(p.columnRslt_std04);
		p.cgRslt_title04.add(p.columnRslt_amt04);
		p.cgRslt_title04.add(p.columnRslt_diff04);
		p.RsltTable.addColumnGroup(p.cgRslt_title04);
		p.cgRslt_title05.add(p.columnRslt_upri05);
		p.cgRslt_title05.add(p.Rslt_qty05_p_PPanel.QtyTable);
		p.cgRslt_title05.add(p.columnRslt_std05);
		p.cgRslt_title05.add(p.columnRslt_amt05);
		p.cgRslt_title05.add(p.columnRslt_diff05);
		p.RsltTable.addColumnGroup(p.cgRslt_title05);
		p.cgRslt_title06.add(p.columnRslt_upri06);
		p.cgRslt_title06.add(p.Rslt_qty06_p_PPanel.QtyTable);
		p.cgRslt_title06.add(p.columnRslt_std06);
		p.cgRslt_title06.add(p.columnRslt_amt06);
		p.cgRslt_title06.add(p.columnRslt_diff06);
		p.RsltTable.addColumnGroup(p.cgRslt_title06);
		p.cgRslt_title07.add(p.columnRslt_upri07);
		p.cgRslt_title07.add(p.Rslt_qty07_p_PPanel.QtyTable);
		p.cgRslt_title07.add(p.columnRslt_std07);
		p.cgRslt_title07.add(p.columnRslt_amt07);
		p.cgRslt_title07.add(p.columnRslt_diff07);
		p.RsltTable.addColumnGroup(p.cgRslt_title07);
		p.cgRslt_title08.add(p.columnRslt_upri08);
		p.cgRslt_title08.add(p.Rslt_qty08_p_PPanel.QtyTable);
		p.cgRslt_title08.add(p.columnRslt_std08);
		p.cgRslt_title08.add(p.columnRslt_amt08);
		p.cgRslt_title08.add(p.columnRslt_diff08);
		p.RsltTable.addColumnGroup(p.cgRslt_title08);
		p.cgRslt_title09.add(p.columnRslt_upri09);
		p.cgRslt_title09.add(p.Rslt_qty09_p_PPanel.QtyTable);
		p.cgRslt_title09.add(p.columnRslt_std09);
		p.cgRslt_title09.add(p.columnRslt_amt09);
		p.cgRslt_title09.add(p.columnRslt_diff09);
		p.RsltTable.addColumnGroup(p.cgRslt_title09);
		p.cgRslt_title10.add(p.columnRslt_upri10);
		p.cgRslt_title10.add(p.Rslt_qty10_p_PPanel.QtyTable);
		p.cgRslt_title10.add(p.columnRslt_std10);
		p.cgRslt_title10.add(p.columnRslt_amt10);
		p.cgRslt_title10.add(p.columnRslt_diff10);
		p.RsltTable.addColumnGroup(p.cgRslt_title10);
		p.cgRslt_title11.add(p.columnRslt_upri11);
		p.cgRslt_title11.add(p.Rslt_qty11_p_PPanel.QtyTable);
		p.cgRslt_title11.add(p.columnRslt_std11);
		p.cgRslt_title11.add(p.columnRslt_amt11);
		p.cgRslt_title11.add(p.columnRslt_diff11);
		p.RsltTable.addColumnGroup(p.cgRslt_title11);
		p.cgRslt_title12.add(p.columnRslt_upri12);
		p.cgRslt_title12.add(p.Rslt_qty12_p_PPanel.QtyTable);
		p.cgRslt_title12.add(p.columnRslt_std12);
		p.cgRslt_title12.add(p.columnRslt_amt12);
		p.cgRslt_title12.add(p.columnRslt_diff12);
		p.RsltTable.addColumnGroup(p.cgRslt_title12);
		p.cgRslt_title13.add(p.columnRslt_upri13);
		p.cgRslt_title13.add(p.Rslt_qty13_p_PPanel.QtyTable);
		p.cgRslt_title13.add(p.columnRslt_std13);
		p.cgRslt_title13.add(p.columnRslt_amt13);
		p.cgRslt_title13.add(p.columnRslt_diff13);
		p.RsltTable.addColumnGroup(p.cgRslt_title13);
		p.cgRslt_title14.add(p.columnRslt_upri14);
		p.cgRslt_title14.add(p.Rslt_qty14_p_PPanel.QtyTable);
		p.cgRslt_title14.add(p.columnRslt_std14);
		p.cgRslt_title14.add(p.columnRslt_amt14);
		p.cgRslt_title14.add(p.columnRslt_diff14);
		p.RsltTable.addColumnGroup(p.cgRslt_title14);
		p.cgRslt_title15.add(p.columnRslt_upri15);
		p.cgRslt_title15.add(p.Rslt_qty15_p_PPanel.QtyTable);
		p.cgRslt_title15.add(p.columnRslt_std15);
		p.cgRslt_title15.add(p.columnRslt_amt15);
		p.cgRslt_title15.add(p.columnRslt_diff15);
		p.RsltTable.addColumnGroup(p.cgRslt_title15);
		p.cgRslt_title16.add(p.columnRslt_upri16);
		p.cgRslt_title16.add(p.Rslt_qty16_p_PPanel.QtyTable);
		p.cgRslt_title16.add(p.columnRslt_std16);
		p.cgRslt_title16.add(p.columnRslt_amt16);
		p.cgRslt_title16.add(p.columnRslt_diff16);
		p.RsltTable.addColumnGroup(p.cgRslt_title16);
		p.cgRslt_title17.add(p.columnRslt_upri17);
		p.cgRslt_title17.add(p.Rslt_qty17_p_PPanel.QtyTable);
		p.cgRslt_title17.add(p.columnRslt_std17);
		p.cgRslt_title17.add(p.columnRslt_amt17);
		p.cgRslt_title17.add(p.columnRslt_diff17);
		p.RsltTable.addColumnGroup(p.cgRslt_title17);
		p.cgRslt_title18.add(p.columnRslt_upri18);
		p.cgRslt_title18.add(p.Rslt_qty18_p_PPanel.QtyTable);
		p.cgRslt_title18.add(p.columnRslt_std18);
		p.cgRslt_title18.add(p.columnRslt_amt18);
		p.cgRslt_title18.add(p.columnRslt_diff18);
		p.RsltTable.addColumnGroup(p.cgRslt_title18);
		p.cgRslt_title19.add(p.columnRslt_upri19);
		p.cgRslt_title19.add(p.Rslt_qty19_p_PPanel.QtyTable);
		p.cgRslt_title19.add(p.columnRslt_std19);
		p.cgRslt_title19.add(p.columnRslt_amt19);
		p.cgRslt_title19.add(p.columnRslt_diff19);
		p.RsltTable.addColumnGroup(p.cgRslt_title19);
		p.cgRslt_title20.add(p.columnRslt_upri20);
		p.cgRslt_title20.add(p.Rslt_qty20_p_PPanel.QtyTable);
		p.cgRslt_title20.add(p.columnRslt_std20);
		p.cgRslt_title20.add(p.columnRslt_amt20);
		p.cgRslt_title20.add(p.columnRslt_diff20);
		p.RsltTable.addColumnGroup(p.cgRslt_title20);
		p.cgRslt_title21.add(p.columnRslt_upri21);
		p.cgRslt_title21.add(p.Rslt_qty21_p_PPanel.QtyTable);
		p.cgRslt_title21.add(p.columnRslt_std21);
		p.cgRslt_title21.add(p.columnRslt_amt21);
		p.cgRslt_title21.add(p.columnRslt_diff21);
		p.RsltTable.addColumnGroup(p.cgRslt_title21);
		p.cgRslt_title22.add(p.columnRslt_upri22);
		p.cgRslt_title22.add(p.Rslt_qty22_p_PPanel.QtyTable);
		p.cgRslt_title22.add(p.columnRslt_std22);
		p.cgRslt_title22.add(p.columnRslt_amt22);
		p.cgRslt_title22.add(p.columnRslt_diff22);
		p.RsltTable.addColumnGroup(p.cgRslt_title22);
		p.cgRslt_title23.add(p.columnRslt_upri23);
		p.cgRslt_title23.add(p.Rslt_qty23_p_PPanel.QtyTable);
		p.cgRslt_title23.add(p.columnRslt_std23);
		p.cgRslt_title23.add(p.columnRslt_amt23);
		p.cgRslt_title23.add(p.columnRslt_diff23);
		p.RsltTable.addColumnGroup(p.cgRslt_title23);
		p.cgRslt_title24.add(p.columnRslt_upri24);
		p.cgRslt_title24.add(p.Rslt_qty24_p_PPanel.QtyTable);
		p.cgRslt_title24.add(p.columnRslt_std24);
		p.cgRslt_title24.add(p.columnRslt_amt24);
		p.cgRslt_title24.add(p.columnRslt_diff24);
		p.RsltTable.addColumnGroup(p.cgRslt_title24);
		p.cgRslt_title25.add(p.columnRslt_upri25);
		p.cgRslt_title25.add(p.Rslt_qty25_p_PPanel.QtyTable);
		p.cgRslt_title25.add(p.columnRslt_std25);
		p.cgRslt_title25.add(p.columnRslt_amt25);
		p.cgRslt_title25.add(p.columnRslt_diff25);
		p.RsltTable.addColumnGroup(p.cgRslt_title25);
		p.cgRslt_title26.add(p.columnRslt_upri26);
		p.cgRslt_title26.add(p.Rslt_qty26_p_PPanel.QtyTable);
		p.cgRslt_title26.add(p.columnRslt_std26);
		p.cgRslt_title26.add(p.columnRslt_amt26);
		p.cgRslt_title26.add(p.columnRslt_diff26);
		p.RsltTable.addColumnGroup(p.cgRslt_title26);
		p.cgRslt_title27.add(p.columnRslt_upri27);
		p.cgRslt_title27.add(p.Rslt_qty27_p_PPanel.QtyTable);
		p.cgRslt_title27.add(p.columnRslt_std27);
		p.cgRslt_title27.add(p.columnRslt_amt27);
		p.cgRslt_title27.add(p.columnRslt_diff27);
		p.RsltTable.addColumnGroup(p.cgRslt_title27);
		p.cgRslt_title28.add(p.columnRslt_upri28);
		p.cgRslt_title28.add(p.Rslt_qty28_p_PPanel.QtyTable);
		p.cgRslt_title28.add(p.columnRslt_std28);
		p.cgRslt_title28.add(p.columnRslt_amt28);
		p.cgRslt_title28.add(p.columnRslt_diff28);
		p.RsltTable.addColumnGroup(p.cgRslt_title28);
		p.cgRslt_title29.add(p.columnRslt_upri29);
		p.cgRslt_title29.add(p.Rslt_qty29_p_PPanel.QtyTable);
		p.cgRslt_title29.add(p.columnRslt_std29);
		p.cgRslt_title29.add(p.columnRslt_amt29);
		p.cgRslt_title29.add(p.columnRslt_diff29);
		p.RsltTable.addColumnGroup(p.cgRslt_title29);
		p.cgRslt_title30.add(p.columnRslt_upri30);
		p.cgRslt_title30.add(p.Rslt_qty30_p_PPanel.QtyTable);
		p.cgRslt_title30.add(p.columnRslt_std30);
		p.cgRslt_title30.add(p.columnRslt_amt30);
		p.cgRslt_title30.add(p.columnRslt_diff30);
		p.RsltTable.addColumnGroup(p.cgRslt_title30);
		p.cgRslt_diff_title.add(p.Rslt_diff_qty_p_PPanel.QtyTable);
		p.cgRslt_diff_title.add(p.columnRslt_diff_std);
		p.cgRslt_diff_title.add(p.columnRslt_diff_amt);
		p.RsltTable.addColumnGroup(p.cgRslt_diff_title);
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
		Cnd_cost_io_id.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cost_io_id.getListConfig().setPutter(getCnd_cost_io_id_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_ym.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ym.getListConfig().setPutter(getCnd_ym_ListPutter());
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
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
		Cnd_asst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_asst_typ.getListConfig().setPutter(getCnd_asst_typ_ListPutter());
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
	 * [Cnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCalcGrp");
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
	 * [Cnd_cost_io_id_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cost_io_id_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostIoInCalcCostIo");
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
	 * [Cnd_ym_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ym_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CalcArgYm");
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
	 * [Cnd_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_calc_no_p_PPanel.CalcNo_calc_no) return getCnd_calc_no_p_PPanel_CalcNo_calc_no(row, info);
		if(combo == Cnd_cost_io_id) return getCnd_cost_io_id(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_ym) return getCnd_ym(row, info);
		if(combo == Cnd_mng_dpt_cd) return getCnd_mng_dpt_cd(row, info);
		if(combo == Cnd_itm_jnl_cd) return getCnd_itm_jnl_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		if(combo == Cnd_asst_typ) return getCnd_asst_typ(row, info);
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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_term) return doCnd_term_VC(info);
		if (vc == Cnd_st_ym) return doCnd_st_ym_VC(info);
		if (vc == Cnd_cost_io_id) return doCnd_cost_io_id_VC(info);
		if (vc == Cnd_cost_io_nm) return doCnd_cost_io_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_ym) return doCnd_ym_VC(info);
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
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_no_bp_flg) return doCnd_no_bp_flg_VC(info);
		if (vc == Cnd_asst_typ) return doCnd_asst_typ_VC(info);
		if (vc == Cnd_asst_typ_nm) return doCnd_asst_typ_nm_VC(info);
		if (vc == Cnd_except_other_flg) return doCnd_except_other_flg_VC(info);
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
		if (vc == Cnd_lot_flg) return doCnd_lot_flg_VC(info);
		if (vc == Cnd_sublot_flg) return doCnd_sublot_flg_VC(info);
		if (vc == Cnd_sno1_flg) return doCnd_sno1_flg_VC(info);
		if (vc == Cnd_sno2_flg) return doCnd_sno2_flg_VC(info);
		if (vc == Cnd_sno3_flg) return doCnd_sno3_flg_VC(info);
		if (vc == Cnd_sno4_flg) return doCnd_sno4_flg_VC(info);
		if (vc == Cnd_bp_flg) return doCnd_bp_flg_VC(info);
		if (vc == Cnd_asst_typ_flg) return doCnd_asst_typ_flg_VC(info);
		if (vc == LPnl_diff) return doLPnl_diff_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_ym) return doRslt_ym_VC(info);
		if (vc == columnRslt_mng_dpt_cd) return doRslt_mng_dpt_cd_VC(info);
		if (vc == columnRslt_mng_dpt_nm) return doRslt_mng_dpt_nm_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_itm_jnl_cd) return doRslt_itm_jnl_cd_VC(info);
		if (vc == columnRslt_itm_jnl_nm) return doRslt_itm_jnl_nm_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_sno1) return doRslt_sno1_VC(info);
		if (vc == columnRslt_sno2) return doRslt_sno2_VC(info);
		if (vc == columnRslt_sno3) return doRslt_sno3_VC(info);
		if (vc == columnRslt_sno4) return doRslt_sno4_VC(info);
		if (vc == columnRslt_bp_cd) return doRslt_bp_cd_VC(info);
		if (vc == columnRslt_bp_nm) return doRslt_bp_nm_VC(info);
		if (vc == columnRslt_asst_typ) return doRslt_asst_typ_VC(info);
		if (vc == columnRslt_asst_typ_nm) return doRslt_asst_typ_nm_VC(info);
		if (vc == columnRslt_unit_cd) return doRslt_unit_cd_VC(info);
		if (vc == columnRslt_unit_nm) return doRslt_unit_nm_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_upri01) return doRslt_upri01_VC(info);
		if (vc == columnRslt_std01) return doRslt_std01_VC(info);
		if (vc == columnRslt_amt01) return doRslt_amt01_VC(info);
		if (vc == columnRslt_diff01) return doRslt_diff01_VC(info);
		if (vc == columnRslt_upri02) return doRslt_upri02_VC(info);
		if (vc == columnRslt_std02) return doRslt_std02_VC(info);
		if (vc == columnRslt_amt02) return doRslt_amt02_VC(info);
		if (vc == columnRslt_diff02) return doRslt_diff02_VC(info);
		if (vc == columnRslt_upri03) return doRslt_upri03_VC(info);
		if (vc == columnRslt_std03) return doRslt_std03_VC(info);
		if (vc == columnRslt_amt03) return doRslt_amt03_VC(info);
		if (vc == columnRslt_diff03) return doRslt_diff03_VC(info);
		if (vc == columnRslt_upri04) return doRslt_upri04_VC(info);
		if (vc == columnRslt_std04) return doRslt_std04_VC(info);
		if (vc == columnRslt_amt04) return doRslt_amt04_VC(info);
		if (vc == columnRslt_diff04) return doRslt_diff04_VC(info);
		if (vc == columnRslt_upri05) return doRslt_upri05_VC(info);
		if (vc == columnRslt_std05) return doRslt_std05_VC(info);
		if (vc == columnRslt_amt05) return doRslt_amt05_VC(info);
		if (vc == columnRslt_diff05) return doRslt_diff05_VC(info);
		if (vc == columnRslt_upri06) return doRslt_upri06_VC(info);
		if (vc == columnRslt_std06) return doRslt_std06_VC(info);
		if (vc == columnRslt_amt06) return doRslt_amt06_VC(info);
		if (vc == columnRslt_diff06) return doRslt_diff06_VC(info);
		if (vc == columnRslt_upri07) return doRslt_upri07_VC(info);
		if (vc == columnRslt_std07) return doRslt_std07_VC(info);
		if (vc == columnRslt_amt07) return doRslt_amt07_VC(info);
		if (vc == columnRslt_diff07) return doRslt_diff07_VC(info);
		if (vc == columnRslt_upri08) return doRslt_upri08_VC(info);
		if (vc == columnRslt_std08) return doRslt_std08_VC(info);
		if (vc == columnRslt_amt08) return doRslt_amt08_VC(info);
		if (vc == columnRslt_diff08) return doRslt_diff08_VC(info);
		if (vc == columnRslt_upri09) return doRslt_upri09_VC(info);
		if (vc == columnRslt_std09) return doRslt_std09_VC(info);
		if (vc == columnRslt_amt09) return doRslt_amt09_VC(info);
		if (vc == columnRslt_diff09) return doRslt_diff09_VC(info);
		if (vc == columnRslt_upri10) return doRslt_upri10_VC(info);
		if (vc == columnRslt_std10) return doRslt_std10_VC(info);
		if (vc == columnRslt_amt10) return doRslt_amt10_VC(info);
		if (vc == columnRslt_diff10) return doRslt_diff10_VC(info);
		if (vc == columnRslt_upri11) return doRslt_upri11_VC(info);
		if (vc == columnRslt_std11) return doRslt_std11_VC(info);
		if (vc == columnRslt_amt11) return doRslt_amt11_VC(info);
		if (vc == columnRslt_diff11) return doRslt_diff11_VC(info);
		if (vc == columnRslt_upri12) return doRslt_upri12_VC(info);
		if (vc == columnRslt_std12) return doRslt_std12_VC(info);
		if (vc == columnRslt_amt12) return doRslt_amt12_VC(info);
		if (vc == columnRslt_diff12) return doRslt_diff12_VC(info);
		if (vc == columnRslt_upri13) return doRslt_upri13_VC(info);
		if (vc == columnRslt_std13) return doRslt_std13_VC(info);
		if (vc == columnRslt_amt13) return doRslt_amt13_VC(info);
		if (vc == columnRslt_diff13) return doRslt_diff13_VC(info);
		if (vc == columnRslt_upri14) return doRslt_upri14_VC(info);
		if (vc == columnRslt_std14) return doRslt_std14_VC(info);
		if (vc == columnRslt_amt14) return doRslt_amt14_VC(info);
		if (vc == columnRslt_diff14) return doRslt_diff14_VC(info);
		if (vc == columnRslt_upri15) return doRslt_upri15_VC(info);
		if (vc == columnRslt_std15) return doRslt_std15_VC(info);
		if (vc == columnRslt_amt15) return doRslt_amt15_VC(info);
		if (vc == columnRslt_diff15) return doRslt_diff15_VC(info);
		if (vc == columnRslt_upri16) return doRslt_upri16_VC(info);
		if (vc == columnRslt_std16) return doRslt_std16_VC(info);
		if (vc == columnRslt_amt16) return doRslt_amt16_VC(info);
		if (vc == columnRslt_diff16) return doRslt_diff16_VC(info);
		if (vc == columnRslt_upri17) return doRslt_upri17_VC(info);
		if (vc == columnRslt_std17) return doRslt_std17_VC(info);
		if (vc == columnRslt_amt17) return doRslt_amt17_VC(info);
		if (vc == columnRslt_diff17) return doRslt_diff17_VC(info);
		if (vc == columnRslt_upri18) return doRslt_upri18_VC(info);
		if (vc == columnRslt_std18) return doRslt_std18_VC(info);
		if (vc == columnRslt_amt18) return doRslt_amt18_VC(info);
		if (vc == columnRslt_diff18) return doRslt_diff18_VC(info);
		if (vc == columnRslt_upri19) return doRslt_upri19_VC(info);
		if (vc == columnRslt_std19) return doRslt_std19_VC(info);
		if (vc == columnRslt_amt19) return doRslt_amt19_VC(info);
		if (vc == columnRslt_diff19) return doRslt_diff19_VC(info);
		if (vc == columnRslt_upri20) return doRslt_upri20_VC(info);
		if (vc == columnRslt_std20) return doRslt_std20_VC(info);
		if (vc == columnRslt_amt20) return doRslt_amt20_VC(info);
		if (vc == columnRslt_diff20) return doRslt_diff20_VC(info);
		if (vc == columnRslt_upri21) return doRslt_upri21_VC(info);
		if (vc == columnRslt_std21) return doRslt_std21_VC(info);
		if (vc == columnRslt_amt21) return doRslt_amt21_VC(info);
		if (vc == columnRslt_diff21) return doRslt_diff21_VC(info);
		if (vc == columnRslt_upri22) return doRslt_upri22_VC(info);
		if (vc == columnRslt_std22) return doRslt_std22_VC(info);
		if (vc == columnRslt_amt22) return doRslt_amt22_VC(info);
		if (vc == columnRslt_diff22) return doRslt_diff22_VC(info);
		if (vc == columnRslt_upri23) return doRslt_upri23_VC(info);
		if (vc == columnRslt_std23) return doRslt_std23_VC(info);
		if (vc == columnRslt_amt23) return doRslt_amt23_VC(info);
		if (vc == columnRslt_diff23) return doRslt_diff23_VC(info);
		if (vc == columnRslt_upri24) return doRslt_upri24_VC(info);
		if (vc == columnRslt_std24) return doRslt_std24_VC(info);
		if (vc == columnRslt_amt24) return doRslt_amt24_VC(info);
		if (vc == columnRslt_diff24) return doRslt_diff24_VC(info);
		if (vc == columnRslt_upri25) return doRslt_upri25_VC(info);
		if (vc == columnRslt_std25) return doRslt_std25_VC(info);
		if (vc == columnRslt_amt25) return doRslt_amt25_VC(info);
		if (vc == columnRslt_diff25) return doRslt_diff25_VC(info);
		if (vc == columnRslt_upri26) return doRslt_upri26_VC(info);
		if (vc == columnRslt_std26) return doRslt_std26_VC(info);
		if (vc == columnRslt_amt26) return doRslt_amt26_VC(info);
		if (vc == columnRslt_diff26) return doRslt_diff26_VC(info);
		if (vc == columnRslt_upri27) return doRslt_upri27_VC(info);
		if (vc == columnRslt_std27) return doRslt_std27_VC(info);
		if (vc == columnRslt_amt27) return doRslt_amt27_VC(info);
		if (vc == columnRslt_diff27) return doRslt_diff27_VC(info);
		if (vc == columnRslt_upri28) return doRslt_upri28_VC(info);
		if (vc == columnRslt_std28) return doRslt_std28_VC(info);
		if (vc == columnRslt_amt28) return doRslt_amt28_VC(info);
		if (vc == columnRslt_diff28) return doRslt_diff28_VC(info);
		if (vc == columnRslt_upri29) return doRslt_upri29_VC(info);
		if (vc == columnRslt_std29) return doRslt_std29_VC(info);
		if (vc == columnRslt_amt29) return doRslt_amt29_VC(info);
		if (vc == columnRslt_diff29) return doRslt_diff29_VC(info);
		if (vc == columnRslt_upri30) return doRslt_upri30_VC(info);
		if (vc == columnRslt_std30) return doRslt_std30_VC(info);
		if (vc == columnRslt_amt30) return doRslt_amt30_VC(info);
		if (vc == columnRslt_diff30) return doRslt_diff30_VC(info);
		if (vc == columnRslt_diff_std) return doRslt_diff_std_VC(info);
		if (vc == columnRslt_diff_amt) return doRslt_diff_amt_VC(info);
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
	 * [Cnd]パネルの[st_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_st_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_io_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_io_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cost_io_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cost_io_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_flg_VC(MCEventInfo info){
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
	 * [LPnl]パネルの[diff]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_diff_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upri01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri21]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri21_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std21]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std21_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt21]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt21_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff21]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff21_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri22]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri22_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std22]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std22_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt22]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt22_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff22]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff22_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri23]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri23_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std23]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std23_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt23]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt23_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff23]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff23_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri24]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri24_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std24]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std24_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt24]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt24_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff24]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff24_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri25]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri25_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std25]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std25_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt25]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt25_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff25]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff25_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri26]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri26_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std26]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std26_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt26]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt26_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff26]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff26_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri27]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri27_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std27]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std27_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt27]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt27_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff27]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff27_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri28]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri28_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std28]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std28_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt28]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt28_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff28]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff28_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri29]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri29_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std29]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std29_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt29]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt29_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff29]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff29_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri30]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri30_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[std30]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_std30_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt30]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt30_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff30]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff30_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff_std]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff_std_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[diff_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_diff_amt_VC(MCEventInfo info){
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
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_term) doCnd_term_NC(info);
		else if (nc == Cnd_st_ym) doCnd_st_ym_NC(info);
		else if (nc == Cnd_cost_io_id) doCnd_cost_io_id_NC(info);
		else if (nc == Cnd_cost_io_nm) doCnd_cost_io_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_ym) doCnd_ym_NC(info);
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
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_no_bp_flg) doCnd_no_bp_flg_NC(info);
		else if (nc == Cnd_asst_typ) doCnd_asst_typ_NC(info);
		else if (nc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NC(info);
		else if (nc == Cnd_except_other_flg) doCnd_except_other_flg_NC(info);
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
		else if (nc == Cnd_lot_flg) doCnd_lot_flg_NC(info);
		else if (nc == Cnd_sublot_flg) doCnd_sublot_flg_NC(info);
		else if (nc == Cnd_sno1_flg) doCnd_sno1_flg_NC(info);
		else if (nc == Cnd_sno2_flg) doCnd_sno2_flg_NC(info);
		else if (nc == Cnd_sno3_flg) doCnd_sno3_flg_NC(info);
		else if (nc == Cnd_sno4_flg) doCnd_sno4_flg_NC(info);
		else if (nc == Cnd_bp_flg) doCnd_bp_flg_NC(info);
		else if (nc == Cnd_asst_typ_flg) doCnd_asst_typ_flg_NC(info);
		else if (nc == LPnl_diff) doLPnl_diff_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_ym) doRslt_ym_NC(info);
		else if (nc == columnRslt_mng_dpt_cd) doRslt_mng_dpt_cd_NC(info);
		else if (nc == columnRslt_mng_dpt_nm) doRslt_mng_dpt_nm_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NC(info);
		else if (nc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_sno1) doRslt_sno1_NC(info);
		else if (nc == columnRslt_sno2) doRslt_sno2_NC(info);
		else if (nc == columnRslt_sno3) doRslt_sno3_NC(info);
		else if (nc == columnRslt_sno4) doRslt_sno4_NC(info);
		else if (nc == columnRslt_bp_cd) doRslt_bp_cd_NC(info);
		else if (nc == columnRslt_bp_nm) doRslt_bp_nm_NC(info);
		else if (nc == columnRslt_asst_typ) doRslt_asst_typ_NC(info);
		else if (nc == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NC(info);
		else if (nc == columnRslt_unit_cd) doRslt_unit_cd_NC(info);
		else if (nc == columnRslt_unit_nm) doRslt_unit_nm_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_upri01) doRslt_upri01_NC(info);
		else if (nc == columnRslt_std01) doRslt_std01_NC(info);
		else if (nc == columnRslt_amt01) doRslt_amt01_NC(info);
		else if (nc == columnRslt_diff01) doRslt_diff01_NC(info);
		else if (nc == columnRslt_upri02) doRslt_upri02_NC(info);
		else if (nc == columnRslt_std02) doRslt_std02_NC(info);
		else if (nc == columnRslt_amt02) doRslt_amt02_NC(info);
		else if (nc == columnRslt_diff02) doRslt_diff02_NC(info);
		else if (nc == columnRslt_upri03) doRslt_upri03_NC(info);
		else if (nc == columnRslt_std03) doRslt_std03_NC(info);
		else if (nc == columnRslt_amt03) doRslt_amt03_NC(info);
		else if (nc == columnRslt_diff03) doRslt_diff03_NC(info);
		else if (nc == columnRslt_upri04) doRslt_upri04_NC(info);
		else if (nc == columnRslt_std04) doRslt_std04_NC(info);
		else if (nc == columnRslt_amt04) doRslt_amt04_NC(info);
		else if (nc == columnRslt_diff04) doRslt_diff04_NC(info);
		else if (nc == columnRslt_upri05) doRslt_upri05_NC(info);
		else if (nc == columnRslt_std05) doRslt_std05_NC(info);
		else if (nc == columnRslt_amt05) doRslt_amt05_NC(info);
		else if (nc == columnRslt_diff05) doRslt_diff05_NC(info);
		else if (nc == columnRslt_upri06) doRslt_upri06_NC(info);
		else if (nc == columnRslt_std06) doRslt_std06_NC(info);
		else if (nc == columnRslt_amt06) doRslt_amt06_NC(info);
		else if (nc == columnRslt_diff06) doRslt_diff06_NC(info);
		else if (nc == columnRslt_upri07) doRslt_upri07_NC(info);
		else if (nc == columnRslt_std07) doRslt_std07_NC(info);
		else if (nc == columnRslt_amt07) doRslt_amt07_NC(info);
		else if (nc == columnRslt_diff07) doRslt_diff07_NC(info);
		else if (nc == columnRslt_upri08) doRslt_upri08_NC(info);
		else if (nc == columnRslt_std08) doRslt_std08_NC(info);
		else if (nc == columnRslt_amt08) doRslt_amt08_NC(info);
		else if (nc == columnRslt_diff08) doRslt_diff08_NC(info);
		else if (nc == columnRslt_upri09) doRslt_upri09_NC(info);
		else if (nc == columnRslt_std09) doRslt_std09_NC(info);
		else if (nc == columnRslt_amt09) doRslt_amt09_NC(info);
		else if (nc == columnRslt_diff09) doRslt_diff09_NC(info);
		else if (nc == columnRslt_upri10) doRslt_upri10_NC(info);
		else if (nc == columnRslt_std10) doRslt_std10_NC(info);
		else if (nc == columnRslt_amt10) doRslt_amt10_NC(info);
		else if (nc == columnRslt_diff10) doRslt_diff10_NC(info);
		else if (nc == columnRslt_upri11) doRslt_upri11_NC(info);
		else if (nc == columnRslt_std11) doRslt_std11_NC(info);
		else if (nc == columnRslt_amt11) doRslt_amt11_NC(info);
		else if (nc == columnRslt_diff11) doRslt_diff11_NC(info);
		else if (nc == columnRslt_upri12) doRslt_upri12_NC(info);
		else if (nc == columnRslt_std12) doRslt_std12_NC(info);
		else if (nc == columnRslt_amt12) doRslt_amt12_NC(info);
		else if (nc == columnRslt_diff12) doRslt_diff12_NC(info);
		else if (nc == columnRslt_upri13) doRslt_upri13_NC(info);
		else if (nc == columnRslt_std13) doRslt_std13_NC(info);
		else if (nc == columnRslt_amt13) doRslt_amt13_NC(info);
		else if (nc == columnRslt_diff13) doRslt_diff13_NC(info);
		else if (nc == columnRslt_upri14) doRslt_upri14_NC(info);
		else if (nc == columnRslt_std14) doRslt_std14_NC(info);
		else if (nc == columnRslt_amt14) doRslt_amt14_NC(info);
		else if (nc == columnRslt_diff14) doRslt_diff14_NC(info);
		else if (nc == columnRslt_upri15) doRslt_upri15_NC(info);
		else if (nc == columnRslt_std15) doRslt_std15_NC(info);
		else if (nc == columnRslt_amt15) doRslt_amt15_NC(info);
		else if (nc == columnRslt_diff15) doRslt_diff15_NC(info);
		else if (nc == columnRslt_upri16) doRslt_upri16_NC(info);
		else if (nc == columnRslt_std16) doRslt_std16_NC(info);
		else if (nc == columnRslt_amt16) doRslt_amt16_NC(info);
		else if (nc == columnRslt_diff16) doRslt_diff16_NC(info);
		else if (nc == columnRslt_upri17) doRslt_upri17_NC(info);
		else if (nc == columnRslt_std17) doRslt_std17_NC(info);
		else if (nc == columnRslt_amt17) doRslt_amt17_NC(info);
		else if (nc == columnRslt_diff17) doRslt_diff17_NC(info);
		else if (nc == columnRslt_upri18) doRslt_upri18_NC(info);
		else if (nc == columnRslt_std18) doRslt_std18_NC(info);
		else if (nc == columnRslt_amt18) doRslt_amt18_NC(info);
		else if (nc == columnRslt_diff18) doRslt_diff18_NC(info);
		else if (nc == columnRslt_upri19) doRslt_upri19_NC(info);
		else if (nc == columnRslt_std19) doRslt_std19_NC(info);
		else if (nc == columnRslt_amt19) doRslt_amt19_NC(info);
		else if (nc == columnRslt_diff19) doRslt_diff19_NC(info);
		else if (nc == columnRslt_upri20) doRslt_upri20_NC(info);
		else if (nc == columnRslt_std20) doRslt_std20_NC(info);
		else if (nc == columnRslt_amt20) doRslt_amt20_NC(info);
		else if (nc == columnRslt_diff20) doRslt_diff20_NC(info);
		else if (nc == columnRslt_upri21) doRslt_upri21_NC(info);
		else if (nc == columnRslt_std21) doRslt_std21_NC(info);
		else if (nc == columnRslt_amt21) doRslt_amt21_NC(info);
		else if (nc == columnRslt_diff21) doRslt_diff21_NC(info);
		else if (nc == columnRslt_upri22) doRslt_upri22_NC(info);
		else if (nc == columnRslt_std22) doRslt_std22_NC(info);
		else if (nc == columnRslt_amt22) doRslt_amt22_NC(info);
		else if (nc == columnRslt_diff22) doRslt_diff22_NC(info);
		else if (nc == columnRslt_upri23) doRslt_upri23_NC(info);
		else if (nc == columnRslt_std23) doRslt_std23_NC(info);
		else if (nc == columnRslt_amt23) doRslt_amt23_NC(info);
		else if (nc == columnRslt_diff23) doRslt_diff23_NC(info);
		else if (nc == columnRslt_upri24) doRslt_upri24_NC(info);
		else if (nc == columnRslt_std24) doRslt_std24_NC(info);
		else if (nc == columnRslt_amt24) doRslt_amt24_NC(info);
		else if (nc == columnRslt_diff24) doRslt_diff24_NC(info);
		else if (nc == columnRslt_upri25) doRslt_upri25_NC(info);
		else if (nc == columnRslt_std25) doRslt_std25_NC(info);
		else if (nc == columnRslt_amt25) doRslt_amt25_NC(info);
		else if (nc == columnRslt_diff25) doRslt_diff25_NC(info);
		else if (nc == columnRslt_upri26) doRslt_upri26_NC(info);
		else if (nc == columnRslt_std26) doRslt_std26_NC(info);
		else if (nc == columnRslt_amt26) doRslt_amt26_NC(info);
		else if (nc == columnRslt_diff26) doRslt_diff26_NC(info);
		else if (nc == columnRslt_upri27) doRslt_upri27_NC(info);
		else if (nc == columnRslt_std27) doRslt_std27_NC(info);
		else if (nc == columnRslt_amt27) doRslt_amt27_NC(info);
		else if (nc == columnRslt_diff27) doRslt_diff27_NC(info);
		else if (nc == columnRslt_upri28) doRslt_upri28_NC(info);
		else if (nc == columnRslt_std28) doRslt_std28_NC(info);
		else if (nc == columnRslt_amt28) doRslt_amt28_NC(info);
		else if (nc == columnRslt_diff28) doRslt_diff28_NC(info);
		else if (nc == columnRslt_upri29) doRslt_upri29_NC(info);
		else if (nc == columnRslt_std29) doRslt_std29_NC(info);
		else if (nc == columnRslt_amt29) doRslt_amt29_NC(info);
		else if (nc == columnRslt_diff29) doRslt_diff29_NC(info);
		else if (nc == columnRslt_upri30) doRslt_upri30_NC(info);
		else if (nc == columnRslt_std30) doRslt_std30_NC(info);
		else if (nc == columnRslt_amt30) doRslt_amt30_NC(info);
		else if (nc == columnRslt_diff30) doRslt_diff30_NC(info);
		else if (nc == columnRslt_diff_std) doRslt_diff_std_NC(info);
		else if (nc == columnRslt_diff_amt) doRslt_diff_amt_NC(info);
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
	 * [Cnd]パネルの[st_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_flg_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[diff]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_diff_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upri01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri01_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std01_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt01_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff01_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri02_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std02_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt02_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff02_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri03_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std03_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt03_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff03_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri04_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std04_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt04_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff04_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri05_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std05_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt05_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff05_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri06_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std06_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt06_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff06_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri07_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std07_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt07_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff07_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri08_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std08_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt08_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff08_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri09_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std09_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt09_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff09_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri11_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std11_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt11_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff11_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri12_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std12_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt12_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff12_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri13_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std13_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt13_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff13_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri14_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std14_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt14_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff14_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri15_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std15_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt15_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff15_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri16_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std16_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt16_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff16_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri17_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std17_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt17_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff17_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri18_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std18_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt18_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff18_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri19_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std19_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt19_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff19_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri20_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std20_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt20_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff20_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri21]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri21_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std21]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std21_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt21]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt21_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff21]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff21_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri22]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri22_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std22]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std22_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt22]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt22_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff22]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff22_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri23]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri23_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std23]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std23_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt23]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt23_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff23]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff23_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri24]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri24_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std24]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std24_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt24]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt24_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff24]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff24_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri25]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri25_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std25]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std25_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt25]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt25_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff25]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff25_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri26]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri26_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std26]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std26_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt26]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt26_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff26]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff26_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri27]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri27_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std27]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std27_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt27]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt27_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff27]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff27_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri28]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri28_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std28]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std28_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt28]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt28_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff28]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff28_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri29]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri29_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std29]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std29_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt29]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt29_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff29]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff29_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri30]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri30_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std30]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std30_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt30]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt30_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff30]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff30_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff_std]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff_std_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff_amt_NC(MCEventInfo info){
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
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_term) doCnd_term_NE(info);
		else if (ne == Cnd_st_ym) doCnd_st_ym_NE(info);
		else if (ne == Cnd_cost_io_id) doCnd_cost_io_id_NE(info);
		else if (ne == Cnd_cost_io_nm) doCnd_cost_io_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_ym) doCnd_ym_NE(info);
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
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_no_bp_flg) doCnd_no_bp_flg_NE(info);
		else if (ne == Cnd_asst_typ) doCnd_asst_typ_NE(info);
		else if (ne == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NE(info);
		else if (ne == Cnd_except_other_flg) doCnd_except_other_flg_NE(info);
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
		else if (ne == Cnd_lot_flg) doCnd_lot_flg_NE(info);
		else if (ne == Cnd_sublot_flg) doCnd_sublot_flg_NE(info);
		else if (ne == Cnd_sno1_flg) doCnd_sno1_flg_NE(info);
		else if (ne == Cnd_sno2_flg) doCnd_sno2_flg_NE(info);
		else if (ne == Cnd_sno3_flg) doCnd_sno3_flg_NE(info);
		else if (ne == Cnd_sno4_flg) doCnd_sno4_flg_NE(info);
		else if (ne == Cnd_bp_flg) doCnd_bp_flg_NE(info);
		else if (ne == Cnd_asst_typ_flg) doCnd_asst_typ_flg_NE(info);
		else if (ne == LPnl_diff) doLPnl_diff_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_ym) doRslt_ym_NE(info);
		else if (ne == columnRslt_mng_dpt_cd) doRslt_mng_dpt_cd_NE(info);
		else if (ne == columnRslt_mng_dpt_nm) doRslt_mng_dpt_nm_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NE(info);
		else if (ne == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_sno1) doRslt_sno1_NE(info);
		else if (ne == columnRslt_sno2) doRslt_sno2_NE(info);
		else if (ne == columnRslt_sno3) doRslt_sno3_NE(info);
		else if (ne == columnRslt_sno4) doRslt_sno4_NE(info);
		else if (ne == columnRslt_bp_cd) doRslt_bp_cd_NE(info);
		else if (ne == columnRslt_bp_nm) doRslt_bp_nm_NE(info);
		else if (ne == columnRslt_asst_typ) doRslt_asst_typ_NE(info);
		else if (ne == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NE(info);
		else if (ne == columnRslt_unit_cd) doRslt_unit_cd_NE(info);
		else if (ne == columnRslt_unit_nm) doRslt_unit_nm_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_upri01) doRslt_upri01_NE(info);
		else if (ne == columnRslt_std01) doRslt_std01_NE(info);
		else if (ne == columnRslt_amt01) doRslt_amt01_NE(info);
		else if (ne == columnRslt_diff01) doRslt_diff01_NE(info);
		else if (ne == columnRslt_upri02) doRslt_upri02_NE(info);
		else if (ne == columnRslt_std02) doRslt_std02_NE(info);
		else if (ne == columnRslt_amt02) doRslt_amt02_NE(info);
		else if (ne == columnRslt_diff02) doRslt_diff02_NE(info);
		else if (ne == columnRslt_upri03) doRslt_upri03_NE(info);
		else if (ne == columnRslt_std03) doRslt_std03_NE(info);
		else if (ne == columnRslt_amt03) doRslt_amt03_NE(info);
		else if (ne == columnRslt_diff03) doRslt_diff03_NE(info);
		else if (ne == columnRslt_upri04) doRslt_upri04_NE(info);
		else if (ne == columnRslt_std04) doRslt_std04_NE(info);
		else if (ne == columnRslt_amt04) doRslt_amt04_NE(info);
		else if (ne == columnRslt_diff04) doRslt_diff04_NE(info);
		else if (ne == columnRslt_upri05) doRslt_upri05_NE(info);
		else if (ne == columnRslt_std05) doRslt_std05_NE(info);
		else if (ne == columnRslt_amt05) doRslt_amt05_NE(info);
		else if (ne == columnRslt_diff05) doRslt_diff05_NE(info);
		else if (ne == columnRslt_upri06) doRslt_upri06_NE(info);
		else if (ne == columnRslt_std06) doRslt_std06_NE(info);
		else if (ne == columnRslt_amt06) doRslt_amt06_NE(info);
		else if (ne == columnRslt_diff06) doRslt_diff06_NE(info);
		else if (ne == columnRslt_upri07) doRslt_upri07_NE(info);
		else if (ne == columnRslt_std07) doRslt_std07_NE(info);
		else if (ne == columnRslt_amt07) doRslt_amt07_NE(info);
		else if (ne == columnRslt_diff07) doRslt_diff07_NE(info);
		else if (ne == columnRslt_upri08) doRslt_upri08_NE(info);
		else if (ne == columnRslt_std08) doRslt_std08_NE(info);
		else if (ne == columnRslt_amt08) doRslt_amt08_NE(info);
		else if (ne == columnRslt_diff08) doRslt_diff08_NE(info);
		else if (ne == columnRslt_upri09) doRslt_upri09_NE(info);
		else if (ne == columnRslt_std09) doRslt_std09_NE(info);
		else if (ne == columnRslt_amt09) doRslt_amt09_NE(info);
		else if (ne == columnRslt_diff09) doRslt_diff09_NE(info);
		else if (ne == columnRslt_upri10) doRslt_upri10_NE(info);
		else if (ne == columnRslt_std10) doRslt_std10_NE(info);
		else if (ne == columnRslt_amt10) doRslt_amt10_NE(info);
		else if (ne == columnRslt_diff10) doRslt_diff10_NE(info);
		else if (ne == columnRslt_upri11) doRslt_upri11_NE(info);
		else if (ne == columnRslt_std11) doRslt_std11_NE(info);
		else if (ne == columnRslt_amt11) doRslt_amt11_NE(info);
		else if (ne == columnRslt_diff11) doRslt_diff11_NE(info);
		else if (ne == columnRslt_upri12) doRslt_upri12_NE(info);
		else if (ne == columnRslt_std12) doRslt_std12_NE(info);
		else if (ne == columnRslt_amt12) doRslt_amt12_NE(info);
		else if (ne == columnRslt_diff12) doRslt_diff12_NE(info);
		else if (ne == columnRslt_upri13) doRslt_upri13_NE(info);
		else if (ne == columnRslt_std13) doRslt_std13_NE(info);
		else if (ne == columnRslt_amt13) doRslt_amt13_NE(info);
		else if (ne == columnRslt_diff13) doRslt_diff13_NE(info);
		else if (ne == columnRslt_upri14) doRslt_upri14_NE(info);
		else if (ne == columnRslt_std14) doRslt_std14_NE(info);
		else if (ne == columnRslt_amt14) doRslt_amt14_NE(info);
		else if (ne == columnRslt_diff14) doRslt_diff14_NE(info);
		else if (ne == columnRslt_upri15) doRslt_upri15_NE(info);
		else if (ne == columnRslt_std15) doRslt_std15_NE(info);
		else if (ne == columnRslt_amt15) doRslt_amt15_NE(info);
		else if (ne == columnRslt_diff15) doRslt_diff15_NE(info);
		else if (ne == columnRslt_upri16) doRslt_upri16_NE(info);
		else if (ne == columnRslt_std16) doRslt_std16_NE(info);
		else if (ne == columnRslt_amt16) doRslt_amt16_NE(info);
		else if (ne == columnRslt_diff16) doRslt_diff16_NE(info);
		else if (ne == columnRslt_upri17) doRslt_upri17_NE(info);
		else if (ne == columnRslt_std17) doRslt_std17_NE(info);
		else if (ne == columnRslt_amt17) doRslt_amt17_NE(info);
		else if (ne == columnRslt_diff17) doRslt_diff17_NE(info);
		else if (ne == columnRslt_upri18) doRslt_upri18_NE(info);
		else if (ne == columnRslt_std18) doRslt_std18_NE(info);
		else if (ne == columnRslt_amt18) doRslt_amt18_NE(info);
		else if (ne == columnRslt_diff18) doRslt_diff18_NE(info);
		else if (ne == columnRslt_upri19) doRslt_upri19_NE(info);
		else if (ne == columnRslt_std19) doRslt_std19_NE(info);
		else if (ne == columnRslt_amt19) doRslt_amt19_NE(info);
		else if (ne == columnRslt_diff19) doRslt_diff19_NE(info);
		else if (ne == columnRslt_upri20) doRslt_upri20_NE(info);
		else if (ne == columnRslt_std20) doRslt_std20_NE(info);
		else if (ne == columnRslt_amt20) doRslt_amt20_NE(info);
		else if (ne == columnRslt_diff20) doRslt_diff20_NE(info);
		else if (ne == columnRslt_upri21) doRslt_upri21_NE(info);
		else if (ne == columnRslt_std21) doRslt_std21_NE(info);
		else if (ne == columnRslt_amt21) doRslt_amt21_NE(info);
		else if (ne == columnRslt_diff21) doRslt_diff21_NE(info);
		else if (ne == columnRslt_upri22) doRslt_upri22_NE(info);
		else if (ne == columnRslt_std22) doRslt_std22_NE(info);
		else if (ne == columnRslt_amt22) doRslt_amt22_NE(info);
		else if (ne == columnRslt_diff22) doRslt_diff22_NE(info);
		else if (ne == columnRslt_upri23) doRslt_upri23_NE(info);
		else if (ne == columnRslt_std23) doRslt_std23_NE(info);
		else if (ne == columnRslt_amt23) doRslt_amt23_NE(info);
		else if (ne == columnRslt_diff23) doRslt_diff23_NE(info);
		else if (ne == columnRslt_upri24) doRslt_upri24_NE(info);
		else if (ne == columnRslt_std24) doRslt_std24_NE(info);
		else if (ne == columnRslt_amt24) doRslt_amt24_NE(info);
		else if (ne == columnRslt_diff24) doRslt_diff24_NE(info);
		else if (ne == columnRslt_upri25) doRslt_upri25_NE(info);
		else if (ne == columnRslt_std25) doRslt_std25_NE(info);
		else if (ne == columnRslt_amt25) doRslt_amt25_NE(info);
		else if (ne == columnRslt_diff25) doRslt_diff25_NE(info);
		else if (ne == columnRslt_upri26) doRslt_upri26_NE(info);
		else if (ne == columnRslt_std26) doRslt_std26_NE(info);
		else if (ne == columnRslt_amt26) doRslt_amt26_NE(info);
		else if (ne == columnRslt_diff26) doRslt_diff26_NE(info);
		else if (ne == columnRslt_upri27) doRslt_upri27_NE(info);
		else if (ne == columnRslt_std27) doRslt_std27_NE(info);
		else if (ne == columnRslt_amt27) doRslt_amt27_NE(info);
		else if (ne == columnRslt_diff27) doRslt_diff27_NE(info);
		else if (ne == columnRslt_upri28) doRslt_upri28_NE(info);
		else if (ne == columnRslt_std28) doRslt_std28_NE(info);
		else if (ne == columnRslt_amt28) doRslt_amt28_NE(info);
		else if (ne == columnRslt_diff28) doRslt_diff28_NE(info);
		else if (ne == columnRslt_upri29) doRslt_upri29_NE(info);
		else if (ne == columnRslt_std29) doRslt_std29_NE(info);
		else if (ne == columnRslt_amt29) doRslt_amt29_NE(info);
		else if (ne == columnRslt_diff29) doRslt_diff29_NE(info);
		else if (ne == columnRslt_upri30) doRslt_upri30_NE(info);
		else if (ne == columnRslt_std30) doRslt_std30_NE(info);
		else if (ne == columnRslt_amt30) doRslt_amt30_NE(info);
		else if (ne == columnRslt_diff30) doRslt_diff30_NE(info);
		else if (ne == columnRslt_diff_std) doRslt_diff_std_NE(info);
		else if (ne == columnRslt_diff_amt) doRslt_diff_amt_NE(info);
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
	 * [Cnd]パネルの[st_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_flg_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[diff]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_diff_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upri01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri01_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std01_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt01_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff01_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri02_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std02_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt02_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff02_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri03_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std03_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt03_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff03_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri04_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std04_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt04_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff04_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri05_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std05_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt05_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff05_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri06_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std06_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt06_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff06_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri07_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std07_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt07_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff07_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri08_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std08_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt08_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff08_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri09_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std09_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt09_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff09_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri11_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std11_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt11_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff11_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri12_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std12_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt12_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff12_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri13_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std13_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt13_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff13_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri14_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std14_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt14_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff14_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri15_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std15_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt15_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff15_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri16_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std16_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt16_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff16_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri17_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std17_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt17_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff17_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri18_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std18_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt18_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff18_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri19_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std19_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt19_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff19_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri20_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std20_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt20_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff20_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri21]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri21_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std21]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std21_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt21]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt21_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff21]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff21_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri22]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri22_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std22]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std22_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt22]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt22_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff22]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff22_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri23]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri23_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std23]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std23_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt23]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt23_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff23]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff23_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri24]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri24_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std24]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std24_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt24]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt24_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff24]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff24_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri25]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri25_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std25]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std25_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt25]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt25_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff25]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff25_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri26]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri26_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std26]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std26_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt26]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt26_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff26]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff26_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri27]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri27_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std27]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std27_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt27]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt27_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff27]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff27_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri28]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri28_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std28]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std28_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt28]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt28_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff28]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff28_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri29]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri29_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std29]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std29_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt29]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt29_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff29]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff29_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri30]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri30_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std30]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std30_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt30]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt30_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff30]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff30_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff_std]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff_std_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff_amt_NE(MCEventInfo info){
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
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_term) doCnd_term_NX(info);
		else if (nx == Cnd_st_ym) doCnd_st_ym_NX(info);
		else if (nx == Cnd_cost_io_id) doCnd_cost_io_id_NX(info);
		else if (nx == Cnd_cost_io_nm) doCnd_cost_io_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_ym) doCnd_ym_NX(info);
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
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_no_bp_flg) doCnd_no_bp_flg_NX(info);
		else if (nx == Cnd_asst_typ) doCnd_asst_typ_NX(info);
		else if (nx == Cnd_asst_typ_nm) doCnd_asst_typ_nm_NX(info);
		else if (nx == Cnd_except_other_flg) doCnd_except_other_flg_NX(info);
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
		else if (nx == Cnd_lot_flg) doCnd_lot_flg_NX(info);
		else if (nx == Cnd_sublot_flg) doCnd_sublot_flg_NX(info);
		else if (nx == Cnd_sno1_flg) doCnd_sno1_flg_NX(info);
		else if (nx == Cnd_sno2_flg) doCnd_sno2_flg_NX(info);
		else if (nx == Cnd_sno3_flg) doCnd_sno3_flg_NX(info);
		else if (nx == Cnd_sno4_flg) doCnd_sno4_flg_NX(info);
		else if (nx == Cnd_bp_flg) doCnd_bp_flg_NX(info);
		else if (nx == Cnd_asst_typ_flg) doCnd_asst_typ_flg_NX(info);
		else if (nx == LPnl_diff) doLPnl_diff_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_ym) doRslt_ym_NX(info);
		else if (nx == columnRslt_mng_dpt_cd) doRslt_mng_dpt_cd_NX(info);
		else if (nx == columnRslt_mng_dpt_nm) doRslt_mng_dpt_nm_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NX(info);
		else if (nx == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_sno1) doRslt_sno1_NX(info);
		else if (nx == columnRslt_sno2) doRslt_sno2_NX(info);
		else if (nx == columnRslt_sno3) doRslt_sno3_NX(info);
		else if (nx == columnRslt_sno4) doRslt_sno4_NX(info);
		else if (nx == columnRslt_bp_cd) doRslt_bp_cd_NX(info);
		else if (nx == columnRslt_bp_nm) doRslt_bp_nm_NX(info);
		else if (nx == columnRslt_asst_typ) doRslt_asst_typ_NX(info);
		else if (nx == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_NX(info);
		else if (nx == columnRslt_unit_cd) doRslt_unit_cd_NX(info);
		else if (nx == columnRslt_unit_nm) doRslt_unit_nm_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_upri01) doRslt_upri01_NX(info);
		else if (nx == columnRslt_std01) doRslt_std01_NX(info);
		else if (nx == columnRslt_amt01) doRslt_amt01_NX(info);
		else if (nx == columnRslt_diff01) doRslt_diff01_NX(info);
		else if (nx == columnRslt_upri02) doRslt_upri02_NX(info);
		else if (nx == columnRslt_std02) doRslt_std02_NX(info);
		else if (nx == columnRslt_amt02) doRslt_amt02_NX(info);
		else if (nx == columnRslt_diff02) doRslt_diff02_NX(info);
		else if (nx == columnRslt_upri03) doRslt_upri03_NX(info);
		else if (nx == columnRslt_std03) doRslt_std03_NX(info);
		else if (nx == columnRslt_amt03) doRslt_amt03_NX(info);
		else if (nx == columnRslt_diff03) doRslt_diff03_NX(info);
		else if (nx == columnRslt_upri04) doRslt_upri04_NX(info);
		else if (nx == columnRslt_std04) doRslt_std04_NX(info);
		else if (nx == columnRslt_amt04) doRslt_amt04_NX(info);
		else if (nx == columnRslt_diff04) doRslt_diff04_NX(info);
		else if (nx == columnRslt_upri05) doRslt_upri05_NX(info);
		else if (nx == columnRslt_std05) doRslt_std05_NX(info);
		else if (nx == columnRslt_amt05) doRslt_amt05_NX(info);
		else if (nx == columnRslt_diff05) doRslt_diff05_NX(info);
		else if (nx == columnRslt_upri06) doRslt_upri06_NX(info);
		else if (nx == columnRslt_std06) doRslt_std06_NX(info);
		else if (nx == columnRslt_amt06) doRslt_amt06_NX(info);
		else if (nx == columnRslt_diff06) doRslt_diff06_NX(info);
		else if (nx == columnRslt_upri07) doRslt_upri07_NX(info);
		else if (nx == columnRslt_std07) doRslt_std07_NX(info);
		else if (nx == columnRslt_amt07) doRslt_amt07_NX(info);
		else if (nx == columnRslt_diff07) doRslt_diff07_NX(info);
		else if (nx == columnRslt_upri08) doRslt_upri08_NX(info);
		else if (nx == columnRslt_std08) doRslt_std08_NX(info);
		else if (nx == columnRslt_amt08) doRslt_amt08_NX(info);
		else if (nx == columnRslt_diff08) doRslt_diff08_NX(info);
		else if (nx == columnRslt_upri09) doRslt_upri09_NX(info);
		else if (nx == columnRslt_std09) doRslt_std09_NX(info);
		else if (nx == columnRslt_amt09) doRslt_amt09_NX(info);
		else if (nx == columnRslt_diff09) doRslt_diff09_NX(info);
		else if (nx == columnRslt_upri10) doRslt_upri10_NX(info);
		else if (nx == columnRslt_std10) doRslt_std10_NX(info);
		else if (nx == columnRslt_amt10) doRslt_amt10_NX(info);
		else if (nx == columnRslt_diff10) doRslt_diff10_NX(info);
		else if (nx == columnRslt_upri11) doRslt_upri11_NX(info);
		else if (nx == columnRslt_std11) doRslt_std11_NX(info);
		else if (nx == columnRslt_amt11) doRslt_amt11_NX(info);
		else if (nx == columnRslt_diff11) doRslt_diff11_NX(info);
		else if (nx == columnRslt_upri12) doRslt_upri12_NX(info);
		else if (nx == columnRslt_std12) doRslt_std12_NX(info);
		else if (nx == columnRslt_amt12) doRslt_amt12_NX(info);
		else if (nx == columnRslt_diff12) doRslt_diff12_NX(info);
		else if (nx == columnRslt_upri13) doRslt_upri13_NX(info);
		else if (nx == columnRslt_std13) doRslt_std13_NX(info);
		else if (nx == columnRslt_amt13) doRslt_amt13_NX(info);
		else if (nx == columnRslt_diff13) doRslt_diff13_NX(info);
		else if (nx == columnRslt_upri14) doRslt_upri14_NX(info);
		else if (nx == columnRslt_std14) doRslt_std14_NX(info);
		else if (nx == columnRslt_amt14) doRslt_amt14_NX(info);
		else if (nx == columnRslt_diff14) doRslt_diff14_NX(info);
		else if (nx == columnRslt_upri15) doRslt_upri15_NX(info);
		else if (nx == columnRslt_std15) doRslt_std15_NX(info);
		else if (nx == columnRslt_amt15) doRslt_amt15_NX(info);
		else if (nx == columnRslt_diff15) doRslt_diff15_NX(info);
		else if (nx == columnRslt_upri16) doRslt_upri16_NX(info);
		else if (nx == columnRslt_std16) doRslt_std16_NX(info);
		else if (nx == columnRslt_amt16) doRslt_amt16_NX(info);
		else if (nx == columnRslt_diff16) doRslt_diff16_NX(info);
		else if (nx == columnRslt_upri17) doRslt_upri17_NX(info);
		else if (nx == columnRslt_std17) doRslt_std17_NX(info);
		else if (nx == columnRslt_amt17) doRslt_amt17_NX(info);
		else if (nx == columnRslt_diff17) doRslt_diff17_NX(info);
		else if (nx == columnRslt_upri18) doRslt_upri18_NX(info);
		else if (nx == columnRslt_std18) doRslt_std18_NX(info);
		else if (nx == columnRslt_amt18) doRslt_amt18_NX(info);
		else if (nx == columnRslt_diff18) doRslt_diff18_NX(info);
		else if (nx == columnRslt_upri19) doRslt_upri19_NX(info);
		else if (nx == columnRslt_std19) doRslt_std19_NX(info);
		else if (nx == columnRslt_amt19) doRslt_amt19_NX(info);
		else if (nx == columnRslt_diff19) doRslt_diff19_NX(info);
		else if (nx == columnRslt_upri20) doRslt_upri20_NX(info);
		else if (nx == columnRslt_std20) doRslt_std20_NX(info);
		else if (nx == columnRslt_amt20) doRslt_amt20_NX(info);
		else if (nx == columnRslt_diff20) doRslt_diff20_NX(info);
		else if (nx == columnRslt_upri21) doRslt_upri21_NX(info);
		else if (nx == columnRslt_std21) doRslt_std21_NX(info);
		else if (nx == columnRslt_amt21) doRslt_amt21_NX(info);
		else if (nx == columnRslt_diff21) doRslt_diff21_NX(info);
		else if (nx == columnRslt_upri22) doRslt_upri22_NX(info);
		else if (nx == columnRslt_std22) doRslt_std22_NX(info);
		else if (nx == columnRslt_amt22) doRslt_amt22_NX(info);
		else if (nx == columnRslt_diff22) doRslt_diff22_NX(info);
		else if (nx == columnRslt_upri23) doRslt_upri23_NX(info);
		else if (nx == columnRslt_std23) doRslt_std23_NX(info);
		else if (nx == columnRslt_amt23) doRslt_amt23_NX(info);
		else if (nx == columnRslt_diff23) doRslt_diff23_NX(info);
		else if (nx == columnRslt_upri24) doRslt_upri24_NX(info);
		else if (nx == columnRslt_std24) doRslt_std24_NX(info);
		else if (nx == columnRslt_amt24) doRslt_amt24_NX(info);
		else if (nx == columnRslt_diff24) doRslt_diff24_NX(info);
		else if (nx == columnRslt_upri25) doRslt_upri25_NX(info);
		else if (nx == columnRslt_std25) doRslt_std25_NX(info);
		else if (nx == columnRslt_amt25) doRslt_amt25_NX(info);
		else if (nx == columnRslt_diff25) doRslt_diff25_NX(info);
		else if (nx == columnRslt_upri26) doRslt_upri26_NX(info);
		else if (nx == columnRslt_std26) doRslt_std26_NX(info);
		else if (nx == columnRslt_amt26) doRslt_amt26_NX(info);
		else if (nx == columnRslt_diff26) doRslt_diff26_NX(info);
		else if (nx == columnRslt_upri27) doRslt_upri27_NX(info);
		else if (nx == columnRslt_std27) doRslt_std27_NX(info);
		else if (nx == columnRslt_amt27) doRslt_amt27_NX(info);
		else if (nx == columnRslt_diff27) doRslt_diff27_NX(info);
		else if (nx == columnRslt_upri28) doRslt_upri28_NX(info);
		else if (nx == columnRslt_std28) doRslt_std28_NX(info);
		else if (nx == columnRslt_amt28) doRslt_amt28_NX(info);
		else if (nx == columnRslt_diff28) doRslt_diff28_NX(info);
		else if (nx == columnRslt_upri29) doRslt_upri29_NX(info);
		else if (nx == columnRslt_std29) doRslt_std29_NX(info);
		else if (nx == columnRslt_amt29) doRslt_amt29_NX(info);
		else if (nx == columnRslt_diff29) doRslt_diff29_NX(info);
		else if (nx == columnRslt_upri30) doRslt_upri30_NX(info);
		else if (nx == columnRslt_std30) doRslt_std30_NX(info);
		else if (nx == columnRslt_amt30) doRslt_amt30_NX(info);
		else if (nx == columnRslt_diff30) doRslt_diff30_NX(info);
		else if (nx == columnRslt_diff_std) doRslt_diff_std_NX(info);
		else if (nx == columnRslt_diff_amt) doRslt_diff_amt_NX(info);
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
	 * [Cnd]パネルの[st_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asst_typ_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asst_typ_flg_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[diff]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_diff_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upri01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri01_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std01_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt01_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff01_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri02_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std02_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt02_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff02_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri03_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std03_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt03_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff03_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri04_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std04_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt04_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff04_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri05_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std05_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt05_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff05_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri06_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std06_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt06_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff06_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri07_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std07_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt07_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff07_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri08_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std08_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt08_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff08_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri09_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std09_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt09_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff09_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri11_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std11_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt11_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff11_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri12_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std12_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt12_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff12_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri13_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std13_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt13_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff13_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri14_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std14_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt14_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff14_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri15_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std15_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt15_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff15_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri16_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std16_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt16_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff16_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri17_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std17_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt17_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff17_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri18_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std18_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt18_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff18_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri19_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std19_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt19_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff19_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri20_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std20_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt20_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff20_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri21]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri21_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std21]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std21_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt21]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt21_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff21]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff21_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri22]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri22_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std22]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std22_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt22]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt22_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff22]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff22_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri23]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri23_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std23]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std23_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt23]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt23_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff23]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff23_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri24]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri24_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std24]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std24_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt24]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt24_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff24]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff24_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri25]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri25_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std25]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std25_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt25]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt25_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff25]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff25_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri26]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri26_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std26]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std26_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt26]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt26_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff26]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff26_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri27]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri27_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std27]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std27_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt27]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt27_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff27]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff27_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri28]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri28_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std28]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std28_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt28]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt28_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff28]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff28_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri29]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri29_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std29]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std29_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt29]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt29_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff29]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff29_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri30]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri30_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std30]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std30_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt30]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt30_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff30]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff30_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff_std]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff_std_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff_amt_NX(MCEventInfo info){
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
		else if (lc == Cnd_st_ym) doCnd_st_ym_LC(info);
		else if (lc == Cnd_cost_io_id) doCnd_cost_io_id_LC(info);
		else if (lc == Cnd_cost_io_nm) doCnd_cost_io_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_ym) doCnd_ym_LC(info);
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
		else if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_asst_typ) doCnd_asst_typ_LC(info);
		else if (lc == Cnd_asst_typ_nm) doCnd_asst_typ_nm_LC(info);
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
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_ym) doRslt_ym_LC(info);
		else if (lc == columnRslt_mng_dpt_cd) doRslt_mng_dpt_cd_LC(info);
		else if (lc == columnRslt_mng_dpt_nm) doRslt_mng_dpt_nm_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_LC(info);
		else if (lc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_sno1) doRslt_sno1_LC(info);
		else if (lc == columnRslt_sno2) doRslt_sno2_LC(info);
		else if (lc == columnRslt_sno3) doRslt_sno3_LC(info);
		else if (lc == columnRslt_sno4) doRslt_sno4_LC(info);
		else if (lc == columnRslt_bp_cd) doRslt_bp_cd_LC(info);
		else if (lc == columnRslt_bp_nm) doRslt_bp_nm_LC(info);
		else if (lc == columnRslt_asst_typ) doRslt_asst_typ_LC(info);
		else if (lc == columnRslt_asst_typ_nm) doRslt_asst_typ_nm_LC(info);
		else if (lc == columnRslt_unit_cd) doRslt_unit_cd_LC(info);
		else if (lc == columnRslt_unit_nm) doRslt_unit_nm_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_upri01) doRslt_upri01_LC(info);
		else if (lc == columnRslt_std01) doRslt_std01_LC(info);
		else if (lc == columnRslt_amt01) doRslt_amt01_LC(info);
		else if (lc == columnRslt_diff01) doRslt_diff01_LC(info);
		else if (lc == columnRslt_upri02) doRslt_upri02_LC(info);
		else if (lc == columnRslt_std02) doRslt_std02_LC(info);
		else if (lc == columnRslt_amt02) doRslt_amt02_LC(info);
		else if (lc == columnRslt_diff02) doRslt_diff02_LC(info);
		else if (lc == columnRslt_upri03) doRslt_upri03_LC(info);
		else if (lc == columnRslt_std03) doRslt_std03_LC(info);
		else if (lc == columnRslt_amt03) doRslt_amt03_LC(info);
		else if (lc == columnRslt_diff03) doRslt_diff03_LC(info);
		else if (lc == columnRslt_upri04) doRslt_upri04_LC(info);
		else if (lc == columnRslt_std04) doRslt_std04_LC(info);
		else if (lc == columnRslt_amt04) doRslt_amt04_LC(info);
		else if (lc == columnRslt_diff04) doRslt_diff04_LC(info);
		else if (lc == columnRslt_upri05) doRslt_upri05_LC(info);
		else if (lc == columnRslt_std05) doRslt_std05_LC(info);
		else if (lc == columnRslt_amt05) doRslt_amt05_LC(info);
		else if (lc == columnRslt_diff05) doRslt_diff05_LC(info);
		else if (lc == columnRslt_upri06) doRslt_upri06_LC(info);
		else if (lc == columnRslt_std06) doRslt_std06_LC(info);
		else if (lc == columnRslt_amt06) doRslt_amt06_LC(info);
		else if (lc == columnRslt_diff06) doRslt_diff06_LC(info);
		else if (lc == columnRslt_upri07) doRslt_upri07_LC(info);
		else if (lc == columnRslt_std07) doRslt_std07_LC(info);
		else if (lc == columnRslt_amt07) doRslt_amt07_LC(info);
		else if (lc == columnRslt_diff07) doRslt_diff07_LC(info);
		else if (lc == columnRslt_upri08) doRslt_upri08_LC(info);
		else if (lc == columnRslt_std08) doRslt_std08_LC(info);
		else if (lc == columnRslt_amt08) doRslt_amt08_LC(info);
		else if (lc == columnRslt_diff08) doRslt_diff08_LC(info);
		else if (lc == columnRslt_upri09) doRslt_upri09_LC(info);
		else if (lc == columnRslt_std09) doRslt_std09_LC(info);
		else if (lc == columnRslt_amt09) doRslt_amt09_LC(info);
		else if (lc == columnRslt_diff09) doRslt_diff09_LC(info);
		else if (lc == columnRslt_upri10) doRslt_upri10_LC(info);
		else if (lc == columnRslt_std10) doRslt_std10_LC(info);
		else if (lc == columnRslt_amt10) doRslt_amt10_LC(info);
		else if (lc == columnRslt_diff10) doRslt_diff10_LC(info);
		else if (lc == columnRslt_upri11) doRslt_upri11_LC(info);
		else if (lc == columnRslt_std11) doRslt_std11_LC(info);
		else if (lc == columnRslt_amt11) doRslt_amt11_LC(info);
		else if (lc == columnRslt_diff11) doRslt_diff11_LC(info);
		else if (lc == columnRslt_upri12) doRslt_upri12_LC(info);
		else if (lc == columnRslt_std12) doRslt_std12_LC(info);
		else if (lc == columnRslt_amt12) doRslt_amt12_LC(info);
		else if (lc == columnRslt_diff12) doRslt_diff12_LC(info);
		else if (lc == columnRslt_upri13) doRslt_upri13_LC(info);
		else if (lc == columnRslt_std13) doRslt_std13_LC(info);
		else if (lc == columnRslt_amt13) doRslt_amt13_LC(info);
		else if (lc == columnRslt_diff13) doRslt_diff13_LC(info);
		else if (lc == columnRslt_upri14) doRslt_upri14_LC(info);
		else if (lc == columnRslt_std14) doRslt_std14_LC(info);
		else if (lc == columnRslt_amt14) doRslt_amt14_LC(info);
		else if (lc == columnRslt_diff14) doRslt_diff14_LC(info);
		else if (lc == columnRslt_upri15) doRslt_upri15_LC(info);
		else if (lc == columnRslt_std15) doRslt_std15_LC(info);
		else if (lc == columnRslt_amt15) doRslt_amt15_LC(info);
		else if (lc == columnRslt_diff15) doRslt_diff15_LC(info);
		else if (lc == columnRslt_upri16) doRslt_upri16_LC(info);
		else if (lc == columnRslt_std16) doRslt_std16_LC(info);
		else if (lc == columnRslt_amt16) doRslt_amt16_LC(info);
		else if (lc == columnRslt_diff16) doRslt_diff16_LC(info);
		else if (lc == columnRslt_upri17) doRslt_upri17_LC(info);
		else if (lc == columnRslt_std17) doRslt_std17_LC(info);
		else if (lc == columnRslt_amt17) doRslt_amt17_LC(info);
		else if (lc == columnRslt_diff17) doRslt_diff17_LC(info);
		else if (lc == columnRslt_upri18) doRslt_upri18_LC(info);
		else if (lc == columnRslt_std18) doRslt_std18_LC(info);
		else if (lc == columnRslt_amt18) doRslt_amt18_LC(info);
		else if (lc == columnRslt_diff18) doRslt_diff18_LC(info);
		else if (lc == columnRslt_upri19) doRslt_upri19_LC(info);
		else if (lc == columnRslt_std19) doRslt_std19_LC(info);
		else if (lc == columnRslt_amt19) doRslt_amt19_LC(info);
		else if (lc == columnRslt_diff19) doRslt_diff19_LC(info);
		else if (lc == columnRslt_upri20) doRslt_upri20_LC(info);
		else if (lc == columnRslt_std20) doRslt_std20_LC(info);
		else if (lc == columnRslt_amt20) doRslt_amt20_LC(info);
		else if (lc == columnRslt_diff20) doRslt_diff20_LC(info);
		else if (lc == columnRslt_upri21) doRslt_upri21_LC(info);
		else if (lc == columnRslt_std21) doRslt_std21_LC(info);
		else if (lc == columnRslt_amt21) doRslt_amt21_LC(info);
		else if (lc == columnRslt_diff21) doRslt_diff21_LC(info);
		else if (lc == columnRslt_upri22) doRslt_upri22_LC(info);
		else if (lc == columnRslt_std22) doRslt_std22_LC(info);
		else if (lc == columnRslt_amt22) doRslt_amt22_LC(info);
		else if (lc == columnRslt_diff22) doRslt_diff22_LC(info);
		else if (lc == columnRslt_upri23) doRslt_upri23_LC(info);
		else if (lc == columnRslt_std23) doRslt_std23_LC(info);
		else if (lc == columnRslt_amt23) doRslt_amt23_LC(info);
		else if (lc == columnRslt_diff23) doRslt_diff23_LC(info);
		else if (lc == columnRslt_upri24) doRslt_upri24_LC(info);
		else if (lc == columnRslt_std24) doRslt_std24_LC(info);
		else if (lc == columnRslt_amt24) doRslt_amt24_LC(info);
		else if (lc == columnRslt_diff24) doRslt_diff24_LC(info);
		else if (lc == columnRslt_upri25) doRslt_upri25_LC(info);
		else if (lc == columnRslt_std25) doRslt_std25_LC(info);
		else if (lc == columnRslt_amt25) doRslt_amt25_LC(info);
		else if (lc == columnRslt_diff25) doRslt_diff25_LC(info);
		else if (lc == columnRslt_upri26) doRslt_upri26_LC(info);
		else if (lc == columnRslt_std26) doRslt_std26_LC(info);
		else if (lc == columnRslt_amt26) doRslt_amt26_LC(info);
		else if (lc == columnRslt_diff26) doRslt_diff26_LC(info);
		else if (lc == columnRslt_upri27) doRslt_upri27_LC(info);
		else if (lc == columnRslt_std27) doRslt_std27_LC(info);
		else if (lc == columnRslt_amt27) doRslt_amt27_LC(info);
		else if (lc == columnRslt_diff27) doRslt_diff27_LC(info);
		else if (lc == columnRslt_upri28) doRslt_upri28_LC(info);
		else if (lc == columnRslt_std28) doRslt_std28_LC(info);
		else if (lc == columnRslt_amt28) doRslt_amt28_LC(info);
		else if (lc == columnRslt_diff28) doRslt_diff28_LC(info);
		else if (lc == columnRslt_upri29) doRslt_upri29_LC(info);
		else if (lc == columnRslt_std29) doRslt_std29_LC(info);
		else if (lc == columnRslt_amt29) doRslt_amt29_LC(info);
		else if (lc == columnRslt_diff29) doRslt_diff29_LC(info);
		else if (lc == columnRslt_upri30) doRslt_upri30_LC(info);
		else if (lc == columnRslt_std30) doRslt_std30_LC(info);
		else if (lc == columnRslt_amt30) doRslt_amt30_LC(info);
		else if (lc == columnRslt_diff30) doRslt_diff30_LC(info);
		else if (lc == columnRslt_diff_std) doRslt_diff_std_LC(info);
		else if (lc == columnRslt_diff_amt) doRslt_diff_amt_LC(info);
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
	 * [Cnd]パネルの[st_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cost_io_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cost_io_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upri01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri01_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std01_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt01_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff01_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri02_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std02_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt02_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff02_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri03_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std03_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt03_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff03_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri04_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std04_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt04_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff04_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri05_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std05_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt05_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff05_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri06_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std06_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt06_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff06_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri07_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std07_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt07_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff07_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri08_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std08_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt08_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff08_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri09_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std09_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt09_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff09_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri11_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std11_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt11_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff11_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri12_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std12_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt12_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff12_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri13_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std13_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt13_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff13_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri14_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std14_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt14_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff14_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri15_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std15_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt15_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff15_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri16_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std16_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt16_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff16_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri17_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std17_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt17_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff17_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri18_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std18_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt18_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff18_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri19_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std19_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt19_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff19_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri20_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std20_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt20_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff20_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri21]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri21_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std21]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std21_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt21]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt21_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff21]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff21_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri22]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri22_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std22]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std22_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt22]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt22_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff22]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff22_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri23]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri23_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std23]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std23_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt23]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt23_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff23]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff23_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri24]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri24_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std24]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std24_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt24]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt24_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff24]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff24_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri25]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri25_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std25]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std25_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt25]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt25_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff25]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff25_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri26]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri26_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std26]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std26_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt26]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt26_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff26]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff26_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri27]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri27_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std27]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std27_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt27]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt27_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff27]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff27_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri28]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri28_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std28]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std28_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt28]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt28_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff28]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff28_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri29]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri29_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std29]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std29_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt29]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt29_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff29]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff29_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri30]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri30_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[std30]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_std30_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt30]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt30_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff30]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff30_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff_std]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff_std_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[diff_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_diff_amt_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_no_p_PPanel_CalcNo_calc_no]の作成メソッド
	 */
	public MCList getCnd_calc_no_p_PPanel_CalcNo_calc_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCalcNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cost_io_id]の作成メソッド
	 */
	public MCList getCnd_cost_io_id(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostIoInCalcCostIo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ym]の作成メソッド
	 */
	public MCList getCnd_ym(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCalcArgYm(row, info);
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
	 * コンボ／リストのリスト[Cnd_bp_cd]の作成メソッド
	 */
	public MCList getCnd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_asst_typ]の作成メソッド
	 */
	public MCList getCnd_asst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAsstTyp(row, info);
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
		if (id.equals("MG.MGBFL0260.Srch01")) {
			return new MG_MGBFL0260_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBFL0260_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0260_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0260_Srch01;

		/** コンストラクタ */
		protected MG_MGBFL0260_Srch01Bridge() {
			p_MG_MGBFL0260_Srch01 = new MCParam(PDef.MG_MGBFL0260_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0260_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBF.MGBFP0260.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0260.RsltR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0260.MstrR.class));

			p_MG_MGBFL0260_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0260_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0260_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0260_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0260_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBF.MGBFP0260.CndR up0() {
			return (mcframe.clientMGBF.MGBFP0260.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBF.MGBFP0260.RsltR> down0() {
			return (MCList<mcframe.clientMGBF.MGBFP0260.RsltR>)down(0);
		}
		protected MCList<mcframe.clientMGBF.MGBFP0260.MstrR> down1() {
			return (MCList<mcframe.clientMGBF.MGBFP0260.MstrR>)down(1);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0260_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0260.RsltR.class));
			p_MG_MGBFL0260_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0260.MstrR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0260_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBF.MGBFP0260.RsltR>)p_MG_MGBFL0260_Srch01.getContainerParam().getDownBlock(0));
			setMstrL((MCList<mcframe.clientMGBF.MGBFP0260.MstrR>)p_MG_MGBFL0260_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getRsltL().clear();
			getMstrL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getMstrL());
			return result;
		}
	}
}