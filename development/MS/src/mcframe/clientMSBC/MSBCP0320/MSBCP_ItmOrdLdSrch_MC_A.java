package mcframe.clientMSBC.MSBCP0320;

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
import mcframe.clientMSBC.MSBCP0320.MSBCP_ItmOrdLdSrch_MC.MS_MSBCL0320_Srch01Caller;

/**
 * 画面"MSBCP_ItmOrdLdSrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_ItmOrdLdSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBCP0320";

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
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd1]ブロック関連のField定義
	public MCPanel Cnd1Panel = null;
	public MCTitledBorder Cnd1TitledBorder = null;
	// [Cnd1]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public MCCheckBox Cnd_opn_flg = null;
	/**
	 * Save 保存.<p>
	 *
	 */
	public MCCheckBox Cnd_sav_flg = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_flg = null;
	/**
	 * Ordered/Placed PO 指図・発注済.<p>
	 *
	 */
	public MCCheckBox Cnd_inst_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_cmpl_flg = null;
	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public MCCheckBox Cnd_prcd_flg = null;
	/**
	 * Simulation シミュレーション.<p>
	 *
	 */
	public MCCheckBox Cnd_sim_flg = null;
	public MCLabel Cnd_sim_mrp_no_Label = null;
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_sim_mrp_no = null;
	public MCLabel Cnd_dt_fr_Label = null;
	/**
	 * Period FROM 期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_dt_fr = null;
	public MCLabel Cnd_dt_to_Label = null;
	/**
	 * Period TO 期間ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_dt_to = null;
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
	public MCLabel Cnd_loc_grp_cd_Label = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_loc_grp_nm = null;
	public MCLabel Cnd_mfg_loc_cd_Label = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_nm = null;
	/**
	 * Only base value exceeded 基準値超過のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_base_qty_over_flg = null;
	/**
	 * Alert threshold exceeded only アラート閾値超過のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_alert_qty_over_flg = null;
	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public MCLabel Cnd_period_typ_label = null;
	/**
	 * DAILY,Day,1;WEEKLY,Week,2;TENDAYS,Ten days,3;MONTHLY,Month,4 DAILY,日,1;WEEKLY,週,2;TENDAYS,旬,3;MONTHLY,月,4.<p>
	 *
	 */
	public MCButtonGroup Cnd_period_typ_view_Group = null;
	public MCRadioButton Cnd_period_typ_view_DAILY = null;
	public MCRadioButton Cnd_period_typ_view_WEEKLY = null;
	public MCRadioButton Cnd_period_typ_view_TENDAYS = null;
	public MCRadioButton Cnd_period_typ_view_MONTHLY = null;
	/**
	 * Display 表示.<p>
	 *
	 */
	public MCLabel Cnd_show_lab1 = null;
	/**
	 * | ｜.<p>
	 *
	 */
	public MCLabel Cnd_show_sep1 = null;
	/**
	 * Actual value 実際値.<p>
	 *
	 */
	public MCCheckBox Cnd_show_act_qty_flg = null;
	/**
	 * Base value 基準値.<p>
	 *
	 */
	public MCCheckBox Cnd_show_base_qty_flg = null;
	/**
	 * Alert threshold アラート閾値.<p>
	 *
	 */
	public MCCheckBox Cnd_show_alert_qty_flg = null;
	/**
	 * | ｜.<p>
	 *
	 */
	public MCLabel Cnd_show_sep2 = null;
	/**
	 * Label ラベル.<p>
	 *
	 */
	public MCCheckBox Cnd_show_label_flg = null;
	/**
	 * Cd. コード.<p>
	 *
	 */
	public MCCheckBox Cnd_show_code_flg = null;
	/**
	 * Name 名称.<p>
	 *
	 */
	public MCCheckBox Cnd_show_name_flg = null;
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RsltDisp]ブロック関連のField定義
	public MCPanel RsltDispPanel = null;
	public MCScrollPane RsltDispScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP0320.RsltDispR> RsltDispTable = null;
	// [RsltDisp]ブロックの項目のField定義
	/**
	 * Label ラベル.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_label = null;
	/**
	 * Cd. コード.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_code = null;
	/**
	 * Name 名称.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_name = null;
	/**
	 * Column type 項目区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_row_title_col = null;
	/**
	 * Column 項目.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_row_title_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty01_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty01;// [RsltDisp]の[qty01_p.qty]を[columnRsltDisp_qty01]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty02_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty02;// [RsltDisp]の[qty02_p.qty]を[columnRsltDisp_qty02]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty03_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty03;// [RsltDisp]の[qty03_p.qty]を[columnRsltDisp_qty03]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty04_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty04;// [RsltDisp]の[qty04_p.qty]を[columnRsltDisp_qty04]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty05_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty05;// [RsltDisp]の[qty05_p.qty]を[columnRsltDisp_qty05]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty06_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty06;// [RsltDisp]の[qty06_p.qty]を[columnRsltDisp_qty06]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty07_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty07;// [RsltDisp]の[qty07_p.qty]を[columnRsltDisp_qty07]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty08_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty08;// [RsltDisp]の[qty08_p.qty]を[columnRsltDisp_qty08]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty09_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty09;// [RsltDisp]の[qty09_p.qty]を[columnRsltDisp_qty09]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty10_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty10;// [RsltDisp]の[qty10_p.qty]を[columnRsltDisp_qty10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty11_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty11;// [RsltDisp]の[qty11_p.qty]を[columnRsltDisp_qty11]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty12_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty12;// [RsltDisp]の[qty12_p.qty]を[columnRsltDisp_qty12]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty13_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty13;// [RsltDisp]の[qty13_p.qty]を[columnRsltDisp_qty13]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty14_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty14;// [RsltDisp]の[qty14_p.qty]を[columnRsltDisp_qty14]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty15_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty15;// [RsltDisp]の[qty15_p.qty]を[columnRsltDisp_qty15]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty16_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty16;// [RsltDisp]の[qty16_p.qty]を[columnRsltDisp_qty16]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty17_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty17;// [RsltDisp]の[qty17_p.qty]を[columnRsltDisp_qty17]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty18_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty18;// [RsltDisp]の[qty18_p.qty]を[columnRsltDisp_qty18]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty19_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty19;// [RsltDisp]の[qty19_p.qty]を[columnRsltDisp_qty19]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty20_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty20;// [RsltDisp]の[qty20_p.qty]を[columnRsltDisp_qty20]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty21_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty21;// [RsltDisp]の[qty21_p.qty]を[columnRsltDisp_qty21]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty22_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty22;// [RsltDisp]の[qty22_p.qty]を[columnRsltDisp_qty22]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty23_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty23;// [RsltDisp]の[qty23_p.qty]を[columnRsltDisp_qty23]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty24_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty24;// [RsltDisp]の[qty24_p.qty]を[columnRsltDisp_qty24]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty25_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty25;// [RsltDisp]の[qty25_p.qty]を[columnRsltDisp_qty25]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty26_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty26;// [RsltDisp]の[qty26_p.qty]を[columnRsltDisp_qty26]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty27_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty27;// [RsltDisp]の[qty27_p.qty]を[columnRsltDisp_qty27]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty28_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty28;// [RsltDisp]の[qty28_p.qty]を[columnRsltDisp_qty28]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty29_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty29;// [RsltDisp]の[qty29_p.qty]を[columnRsltDisp_qty29]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty30_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty30;// [RsltDisp]の[qty30_p.qty]を[columnRsltDisp_qty30]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty31_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty31;// [RsltDisp]の[qty31_p.qty]を[columnRsltDisp_qty31]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty32_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty32;// [RsltDisp]の[qty32_p.qty]を[columnRsltDisp_qty32]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty33_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty33;// [RsltDisp]の[qty33_p.qty]を[columnRsltDisp_qty33]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty34_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty34;// [RsltDisp]の[qty34_p.qty]を[columnRsltDisp_qty34]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty35_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty35;// [RsltDisp]の[qty35_p.qty]を[columnRsltDisp_qty35]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty36_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty36;// [RsltDisp]の[qty36_p.qty]を[columnRsltDisp_qty36]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty37_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty37;// [RsltDisp]の[qty37_p.qty]を[columnRsltDisp_qty37]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty38_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty38;// [RsltDisp]の[qty38_p.qty]を[columnRsltDisp_qty38]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty39_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty39;// [RsltDisp]の[qty39_p.qty]を[columnRsltDisp_qty39]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty40_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty40;// [RsltDisp]の[qty40_p.qty]を[columnRsltDisp_qty40]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty41_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty41;// [RsltDisp]の[qty41_p.qty]を[columnRsltDisp_qty41]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty42_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty42;// [RsltDisp]の[qty42_p.qty]を[columnRsltDisp_qty42]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty43_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty43;// [RsltDisp]の[qty43_p.qty]を[columnRsltDisp_qty43]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty44_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty44;// [RsltDisp]の[qty44_p.qty]を[columnRsltDisp_qty44]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty45_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty45;// [RsltDisp]の[qty45_p.qty]を[columnRsltDisp_qty45]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty46_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty46;// [RsltDisp]の[qty46_p.qty]を[columnRsltDisp_qty46]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty47_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty47;// [RsltDisp]の[qty47_p.qty]を[columnRsltDisp_qty47]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty48_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty48;// [RsltDisp]の[qty48_p.qty]を[columnRsltDisp_qty48]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty49_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty49;// [RsltDisp]の[qty49_p.qty]を[columnRsltDisp_qty49]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty50_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty50;// [RsltDisp]の[qty50_p.qty]を[columnRsltDisp_qty50]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty51_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty51;// [RsltDisp]の[qty51_p.qty]を[columnRsltDisp_qty51]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty52_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty52;// [RsltDisp]の[qty52_p.qty]を[columnRsltDisp_qty52]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty53_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty53;// [RsltDisp]の[qty53_p.qty]を[columnRsltDisp_qty53]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty54_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty54;// [RsltDisp]の[qty54_p.qty]を[columnRsltDisp_qty54]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty55_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty55;// [RsltDisp]の[qty55_p.qty]を[columnRsltDisp_qty55]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty56_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty56;// [RsltDisp]の[qty56_p.qty]を[columnRsltDisp_qty56]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty57_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty57;// [RsltDisp]の[qty57_p.qty]を[columnRsltDisp_qty57]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty58_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty58;// [RsltDisp]の[qty58_p.qty]を[columnRsltDisp_qty58]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty59_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty59;// [RsltDisp]の[qty59_p.qty]を[columnRsltDisp_qty59]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty60_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty60;// [RsltDisp]の[qty60_p.qty]を[columnRsltDisp_qty60]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty61_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty61;// [RsltDisp]の[qty61_p.qty]を[columnRsltDisp_qty61]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty62_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty62;// [RsltDisp]の[qty62_p.qty]を[columnRsltDisp_qty62]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty63_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty63;// [RsltDisp]の[qty63_p.qty]を[columnRsltDisp_qty63]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty64_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty64;// [RsltDisp]の[qty64_p.qty]を[columnRsltDisp_qty64]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty65_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty65;// [RsltDisp]の[qty65_p.qty]を[columnRsltDisp_qty65]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty66_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty66;// [RsltDisp]の[qty66_p.qty]を[columnRsltDisp_qty66]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty67_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty67;// [RsltDisp]の[qty67_p.qty]を[columnRsltDisp_qty67]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty68_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty68;// [RsltDisp]の[qty68_p.qty]を[columnRsltDisp_qty68]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty69_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty69;// [RsltDisp]の[qty69_p.qty]を[columnRsltDisp_qty69]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty70_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty70;// [RsltDisp]の[qty70_p.qty]を[columnRsltDisp_qty70]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty71_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty71;// [RsltDisp]の[qty71_p.qty]を[columnRsltDisp_qty71]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty72_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty72;// [RsltDisp]の[qty72_p.qty]を[columnRsltDisp_qty72]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty73_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty73;// [RsltDisp]の[qty73_p.qty]を[columnRsltDisp_qty73]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty74_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty74;// [RsltDisp]の[qty74_p.qty]を[columnRsltDisp_qty74]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty75_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty75;// [RsltDisp]の[qty75_p.qty]を[columnRsltDisp_qty75]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty76_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty76;// [RsltDisp]の[qty76_p.qty]を[columnRsltDisp_qty76]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty77_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty77;// [RsltDisp]の[qty77_p.qty]を[columnRsltDisp_qty77]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty78_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty78;// [RsltDisp]の[qty78_p.qty]を[columnRsltDisp_qty78]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty79_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty79;// [RsltDisp]の[qty79_p.qty]を[columnRsltDisp_qty79]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty80_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty80;// [RsltDisp]の[qty80_p.qty]を[columnRsltDisp_qty80]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty81_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty81;// [RsltDisp]の[qty81_p.qty]を[columnRsltDisp_qty81]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty82_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty82;// [RsltDisp]の[qty82_p.qty]を[columnRsltDisp_qty82]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty83_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty83;// [RsltDisp]の[qty83_p.qty]を[columnRsltDisp_qty83]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty84_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty84;// [RsltDisp]の[qty84_p.qty]を[columnRsltDisp_qty84]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty85_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty85;// [RsltDisp]の[qty85_p.qty]を[columnRsltDisp_qty85]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty86_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty86;// [RsltDisp]の[qty86_p.qty]を[columnRsltDisp_qty86]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty87_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty87;// [RsltDisp]の[qty87_p.qty]を[columnRsltDisp_qty87]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty88_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty88;// [RsltDisp]の[qty88_p.qty]を[columnRsltDisp_qty88]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty89_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty89;// [RsltDisp]の[qty89_p.qty]を[columnRsltDisp_qty89]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty90_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty90;// [RsltDisp]の[qty90_p.qty]を[columnRsltDisp_qty90]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty91_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty91;// [RsltDisp]の[qty91_p.qty]を[columnRsltDisp_qty91]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty92_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty92;// [RsltDisp]の[qty92_p.qty]を[columnRsltDisp_qty92]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_qty93_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty93;// [RsltDisp]の[qty93_p.qty]を[columnRsltDisp_qty93]としてエイリアス定義。
	/**
	 * Holiday 01 休日０１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday01_flg = null;
	/**
	 * Holiday 02 休日０２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday02_flg = null;
	/**
	 * Holiday 03 休日０３.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday03_flg = null;
	/**
	 * Holiday 04 休日０４.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday04_flg = null;
	/**
	 * Holiday 05 休日０５.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday05_flg = null;
	/**
	 * Holiday 06 休日０６.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday06_flg = null;
	/**
	 * Holiday 07 休日０７.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday07_flg = null;
	/**
	 * Holiday 08 休日０８.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday08_flg = null;
	/**
	 * Holiday 09 休日０９.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday09_flg = null;
	/**
	 * Holiday 10 休日１０.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday10_flg = null;
	/**
	 * Holiday 11 休日１１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday11_flg = null;
	/**
	 * Holiday 12 休日１２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday12_flg = null;
	/**
	 * Holiday 13 休日１３.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday13_flg = null;
	/**
	 * Holiday 14 休日１４.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday14_flg = null;
	/**
	 * Holiday 15 休日１５.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday15_flg = null;
	/**
	 * Holiday 16 休日１６.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday16_flg = null;
	/**
	 * Holiday 17 休日１７.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday17_flg = null;
	/**
	 * Holiday 18 休日１８.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday18_flg = null;
	/**
	 * Holiday 19 休日１９.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday19_flg = null;
	/**
	 * Holiday 20 休日２０.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday20_flg = null;
	/**
	 * Holiday 21 休日２１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday21_flg = null;
	/**
	 * Holiday 22 休日２２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday22_flg = null;
	/**
	 * Holiday 23 休日２３.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday23_flg = null;
	/**
	 * Holiday 24 休日２４.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday24_flg = null;
	/**
	 * Holiday 25 休日２５.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday25_flg = null;
	/**
	 * Holiday 26 休日２６.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday26_flg = null;
	/**
	 * Holiday 27 休日２７.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday27_flg = null;
	/**
	 * Holiday 28 休日２８.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday28_flg = null;
	/**
	 * Holiday 29 休日２９.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday29_flg = null;
	/**
	 * Holiday 30 休日３０.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday30_flg = null;
	/**
	 * Holiday 31 休日３１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday31_flg = null;
	/**
	 * Holiday 32 休日３２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday32_flg = null;
	/**
	 * Holiday 33 休日３３.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday33_flg = null;
	/**
	 * Holiday 34 休日３４.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday34_flg = null;
	/**
	 * Holiday 35 休日３５.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday35_flg = null;
	/**
	 * Holiday 36 休日３６.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday36_flg = null;
	/**
	 * Holiday 37 休日３７.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday37_flg = null;
	/**
	 * Holiday 38 休日３８.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday38_flg = null;
	/**
	 * Holiday 39 休日３９.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday39_flg = null;
	/**
	 * Holiday 40 休日４０.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday40_flg = null;
	/**
	 * Holiday 41 休日４１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday41_flg = null;
	/**
	 * Holiday 42 休日４２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday42_flg = null;
	/**
	 * Holiday 43 休日４３.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday43_flg = null;
	/**
	 * Holiday 44 休日４４.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday44_flg = null;
	/**
	 * Holiday 45 休日４５.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday45_flg = null;
	/**
	 * Holiday 46 休日４６.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday46_flg = null;
	/**
	 * Holiday 47 休日４７.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday47_flg = null;
	/**
	 * Holiday 48 休日４８.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday48_flg = null;
	/**
	 * Holiday 49 休日４９.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday49_flg = null;
	/**
	 * Holiday 50 休日５０.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday50_flg = null;
	/**
	 * Holiday 51 休日５１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday51_flg = null;
	/**
	 * Holiday 52 休日５２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday52_flg = null;
	/**
	 * Holiday 53 休日５３.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday53_flg = null;
	/**
	 * Holiday 54 休日５４.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday54_flg = null;
	/**
	 * Holiday 55 休日５５.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday55_flg = null;
	/**
	 * Holiday 56 休日５６.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday56_flg = null;
	/**
	 * Holiday 57 休日５７.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday57_flg = null;
	/**
	 * Holiday 58 休日５８.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday58_flg = null;
	/**
	 * Holiday 59 休日５９.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday59_flg = null;
	/**
	 * Holiday 60 休日６０.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday60_flg = null;
	/**
	 * Holiday 61 休日６１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday61_flg = null;
	/**
	 * Holiday 62 休日６２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday62_flg = null;
	/**
	 * Holiday 63 休日６３.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday63_flg = null;
	/**
	 * Holiday 64 休日６４.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday64_flg = null;
	/**
	 * Holiday 65 休日６５.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday65_flg = null;
	/**
	 * Holiday 66 休日６６.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday66_flg = null;
	/**
	 * Holiday 67 休日６７.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday67_flg = null;
	/**
	 * Holiday 68 休日６８.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday68_flg = null;
	/**
	 * Holiday 69 休日６９.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday69_flg = null;
	/**
	 * Holiday 70 休日７０.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday70_flg = null;
	/**
	 * Holiday 71 休日７１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday71_flg = null;
	/**
	 * Holiday 72 休日７２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday72_flg = null;
	/**
	 * Holiday 73 休日７３.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday73_flg = null;
	/**
	 * Holiday 74 休日７４.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday74_flg = null;
	/**
	 * Holiday 75 休日７５.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday75_flg = null;
	/**
	 * Holiday 76 休日７６.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday76_flg = null;
	/**
	 * Holiday 77 休日７７.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday77_flg = null;
	/**
	 * Holiday 78 休日７８.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday78_flg = null;
	/**
	 * Holiday 79 休日７９.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday79_flg = null;
	/**
	 * Holiday 80 休日８０.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday80_flg = null;
	/**
	 * Holiday 81 休日８１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday81_flg = null;
	/**
	 * Holiday 82 休日８２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday82_flg = null;
	/**
	 * Holiday 83 休日８３.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday83_flg = null;
	/**
	 * Holiday 84 休日８４.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday84_flg = null;
	/**
	 * Holiday 85 休日８５.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday85_flg = null;
	/**
	 * Holiday 86 休日８６.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday86_flg = null;
	/**
	 * Holiday 87 休日８７.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday87_flg = null;
	/**
	 * Holiday 88 休日８８.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday88_flg = null;
	/**
	 * Holiday 89 休日８９.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday89_flg = null;
	/**
	 * Holiday 90 休日９０.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday90_flg = null;
	/**
	 * Holiday 91 休日９１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday91_flg = null;
	/**
	 * Holiday 92 休日９２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday92_flg = null;
	/**
	 * Holiday 93 休日９３.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_holiday93_flg = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_mfg_loc_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_wg_cd = null;
	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rsrc_cd = null;
	/**
	 * Resource name 資源名.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rsrc_nm = null;
	/**
	 * Resource unit cd. 資源単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rsrc_unit_cd = null;
	/**
	 * Resource unit name 資源単位名.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rsrc_unit_nm = null;
	/**
	 * Resource number of decimal places name 資源小数部有効桁数名.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rsrc_dec_place = null;
	/**
	 * Location resource display order 場所資源表示順.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_disp_seq = null;
	/**
	 * Location master label 場所ラベル.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_label_loc = null;
	/**
	 * Resource label 資源ラベル.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_label_rsrc = null;
	/**
	 * Unit label 単位ラベル.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_label_unit = null;
	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_record_id = null;
	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_record_grp_id = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Item gantt chart 品目ガントチャート.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0290 = null;
	/**
	 * Order status update オーダ確認.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0050 = null;
	/**
	 * Long LT order status update 先行手配オーダ確認.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0130 = null;
	/**
	 * Order status update for simulation シミュレーション用オーダ確認.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0160 = null;
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
	
	/** [MS_MSBCL0320_Srch01]のCallerの作成 */
	protected MSBCP_ItmOrdLdSrch_MC.MS_MSBCL0320_Srch01Caller createMS_MSBCL0320_Srch01() {
		MSBCP_ItmOrdLdSrch_MC.MS_MSBCL0320_Srch01Caller<MSBCP_ItmOrdLdSrch, MS_MSBCL0320_Srch01Bridge>
		caller = ((MSBCP_ItmOrdLdSrch_MC)this).new MS_MSBCL0320_Srch01Caller<MSBCP_ItmOrdLdSrch, MS_MSBCL0320_Srch01Bridge>(
					(MSBCP_ItmOrdLdSrch)this, new MS_MSBCL0320_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL0320_Srch01]の呼び出し */
	protected void callMS_MSBCL0320_Srch01() {
		MCCaller caller = createMS_MSBCL0320_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0320.CndR aCndR;
	/** [RsltDisp]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0320.RsltDispR> aRsltDispL;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0320.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP0320.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0320.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0320.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP0320.CndR.create();
	}

	/**
	 * コピーによってaRsltDispLを設定します。
	 *
	 * aRsltDispLのインスタンスは変更されません。
	 *
	 * @param dataset RsltDispL
	 */
	public void setRsltDispL(MCList<mcframe.clientMSBC.MSBCP0320.RsltDispR> aList) {
		if (getRsltDispL() != aList) {
			getRsltDispL().setAll(aList);
		}
	}

	/**
	 * [RsltDisp]ブロックのコンテナaRsltDispLを返します。
	 *
	 * @return RsltDispL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0320.RsltDispR> getRsltDispL() {
		return aRsltDispL;
	}

	/**
	 * aRsltDispRを作成します。
	 *
	 * @return RsltDispR
	 */
	public mcframe.clientMSBC.MSBCP0320.RsltDispR createRsltDispR() {
		return mcframe.clientMSBC.MSBCP0320.RsltDispR.create();
	}

	/**
	 * aRsltDispLを作成します。
	 *
	 * @return RsltDispL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0320.RsltDispR> createRsltDispL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.class);
	}

	/**
	 * RsltDispTableを初期化します。
	 */
	protected void createRsltDispTable(){
		if(RsltDispTable == null){
			RsltDispTable = beansFactory.createTable2("RsltDisp.table");
		}
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBC.MSBCP0320.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0320.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBC.MSBCP0320.RsltR createRsltR() {
		return mcframe.clientMSBC.MSBCP0320.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0320.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0320.RsltR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getRsltDispL())) ret.add(getRsltDispL());
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
		if(aCnt == getRsltDispL()) return "RsltDisp";
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
		if(bId.equals("RsltDisp")) return getRsltDispL();
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
		ret.add(Cnd1Panel);
		ret.add(CndPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(RsltDispPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_ItmOrdLdSrch_MC_A() {
		aCndR = createCndR();
		aRsltDispL = createRsltDispL();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_ItmOrdLdSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltDispL = createRsltDispL();
		createRsltDispTable();
		RsltDispTable.setRowName(name);
		aRsltL = createRsltL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBCP_ItmOrdLdSrch_MC.jbCreateTop((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbCreateFold((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbCreateCnd1((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbCreateCnd((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbCreateLPnl((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbCreateCtrl((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbCreateRsltDisp((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbCreateBtn((MSBCP_ItmOrdLdSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_ItmOrdLdSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_ItmOrdLdSrch p) {
	}

	/**
	 * [Cnd1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd1(MSBCP_ItmOrdLdSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_ItmOrdLdSrch p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MSBCP_ItmOrdLdSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_ItmOrdLdSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RsltDisp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltDisp(MSBCP_ItmOrdLdSrch p) {
		p.RsltDisp_qty01_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty01_p);
		p.RsltDisp_qty01_p_PPanel.setName("RsltDisp.qty01_p");
		p.columnRsltDisp_qty01 = p.RsltDisp_qty01_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty01.addAliasName("RsltDisp.qty01", p);
		p.RsltDisp_qty02_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty02_p);
		p.RsltDisp_qty02_p_PPanel.setName("RsltDisp.qty02_p");
		p.columnRsltDisp_qty02 = p.RsltDisp_qty02_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty02.addAliasName("RsltDisp.qty02", p);
		p.RsltDisp_qty03_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty03_p);
		p.RsltDisp_qty03_p_PPanel.setName("RsltDisp.qty03_p");
		p.columnRsltDisp_qty03 = p.RsltDisp_qty03_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty03.addAliasName("RsltDisp.qty03", p);
		p.RsltDisp_qty04_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty04_p);
		p.RsltDisp_qty04_p_PPanel.setName("RsltDisp.qty04_p");
		p.columnRsltDisp_qty04 = p.RsltDisp_qty04_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty04.addAliasName("RsltDisp.qty04", p);
		p.RsltDisp_qty05_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty05_p);
		p.RsltDisp_qty05_p_PPanel.setName("RsltDisp.qty05_p");
		p.columnRsltDisp_qty05 = p.RsltDisp_qty05_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty05.addAliasName("RsltDisp.qty05", p);
		p.RsltDisp_qty06_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty06_p);
		p.RsltDisp_qty06_p_PPanel.setName("RsltDisp.qty06_p");
		p.columnRsltDisp_qty06 = p.RsltDisp_qty06_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty06.addAliasName("RsltDisp.qty06", p);
		p.RsltDisp_qty07_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty07_p);
		p.RsltDisp_qty07_p_PPanel.setName("RsltDisp.qty07_p");
		p.columnRsltDisp_qty07 = p.RsltDisp_qty07_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty07.addAliasName("RsltDisp.qty07", p);
		p.RsltDisp_qty08_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty08_p);
		p.RsltDisp_qty08_p_PPanel.setName("RsltDisp.qty08_p");
		p.columnRsltDisp_qty08 = p.RsltDisp_qty08_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty08.addAliasName("RsltDisp.qty08", p);
		p.RsltDisp_qty09_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty09_p);
		p.RsltDisp_qty09_p_PPanel.setName("RsltDisp.qty09_p");
		p.columnRsltDisp_qty09 = p.RsltDisp_qty09_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty09.addAliasName("RsltDisp.qty09", p);
		p.RsltDisp_qty10_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty10_p);
		p.RsltDisp_qty10_p_PPanel.setName("RsltDisp.qty10_p");
		p.columnRsltDisp_qty10 = p.RsltDisp_qty10_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty10.addAliasName("RsltDisp.qty10", p);
		p.RsltDisp_qty11_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty11_p);
		p.RsltDisp_qty11_p_PPanel.setName("RsltDisp.qty11_p");
		p.columnRsltDisp_qty11 = p.RsltDisp_qty11_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty11.addAliasName("RsltDisp.qty11", p);
		p.RsltDisp_qty12_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty12_p);
		p.RsltDisp_qty12_p_PPanel.setName("RsltDisp.qty12_p");
		p.columnRsltDisp_qty12 = p.RsltDisp_qty12_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty12.addAliasName("RsltDisp.qty12", p);
		p.RsltDisp_qty13_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty13_p);
		p.RsltDisp_qty13_p_PPanel.setName("RsltDisp.qty13_p");
		p.columnRsltDisp_qty13 = p.RsltDisp_qty13_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty13.addAliasName("RsltDisp.qty13", p);
		p.RsltDisp_qty14_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty14_p);
		p.RsltDisp_qty14_p_PPanel.setName("RsltDisp.qty14_p");
		p.columnRsltDisp_qty14 = p.RsltDisp_qty14_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty14.addAliasName("RsltDisp.qty14", p);
		p.RsltDisp_qty15_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty15_p);
		p.RsltDisp_qty15_p_PPanel.setName("RsltDisp.qty15_p");
		p.columnRsltDisp_qty15 = p.RsltDisp_qty15_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty15.addAliasName("RsltDisp.qty15", p);
		p.RsltDisp_qty16_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty16_p);
		p.RsltDisp_qty16_p_PPanel.setName("RsltDisp.qty16_p");
		p.columnRsltDisp_qty16 = p.RsltDisp_qty16_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty16.addAliasName("RsltDisp.qty16", p);
		p.RsltDisp_qty17_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty17_p);
		p.RsltDisp_qty17_p_PPanel.setName("RsltDisp.qty17_p");
		p.columnRsltDisp_qty17 = p.RsltDisp_qty17_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty17.addAliasName("RsltDisp.qty17", p);
		p.RsltDisp_qty18_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty18_p);
		p.RsltDisp_qty18_p_PPanel.setName("RsltDisp.qty18_p");
		p.columnRsltDisp_qty18 = p.RsltDisp_qty18_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty18.addAliasName("RsltDisp.qty18", p);
		p.RsltDisp_qty19_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty19_p);
		p.RsltDisp_qty19_p_PPanel.setName("RsltDisp.qty19_p");
		p.columnRsltDisp_qty19 = p.RsltDisp_qty19_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty19.addAliasName("RsltDisp.qty19", p);
		p.RsltDisp_qty20_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty20_p);
		p.RsltDisp_qty20_p_PPanel.setName("RsltDisp.qty20_p");
		p.columnRsltDisp_qty20 = p.RsltDisp_qty20_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty20.addAliasName("RsltDisp.qty20", p);
		p.RsltDisp_qty21_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty21_p);
		p.RsltDisp_qty21_p_PPanel.setName("RsltDisp.qty21_p");
		p.columnRsltDisp_qty21 = p.RsltDisp_qty21_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty21.addAliasName("RsltDisp.qty21", p);
		p.RsltDisp_qty22_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty22_p);
		p.RsltDisp_qty22_p_PPanel.setName("RsltDisp.qty22_p");
		p.columnRsltDisp_qty22 = p.RsltDisp_qty22_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty22.addAliasName("RsltDisp.qty22", p);
		p.RsltDisp_qty23_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty23_p);
		p.RsltDisp_qty23_p_PPanel.setName("RsltDisp.qty23_p");
		p.columnRsltDisp_qty23 = p.RsltDisp_qty23_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty23.addAliasName("RsltDisp.qty23", p);
		p.RsltDisp_qty24_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty24_p);
		p.RsltDisp_qty24_p_PPanel.setName("RsltDisp.qty24_p");
		p.columnRsltDisp_qty24 = p.RsltDisp_qty24_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty24.addAliasName("RsltDisp.qty24", p);
		p.RsltDisp_qty25_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty25_p);
		p.RsltDisp_qty25_p_PPanel.setName("RsltDisp.qty25_p");
		p.columnRsltDisp_qty25 = p.RsltDisp_qty25_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty25.addAliasName("RsltDisp.qty25", p);
		p.RsltDisp_qty26_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty26_p);
		p.RsltDisp_qty26_p_PPanel.setName("RsltDisp.qty26_p");
		p.columnRsltDisp_qty26 = p.RsltDisp_qty26_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty26.addAliasName("RsltDisp.qty26", p);
		p.RsltDisp_qty27_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty27_p);
		p.RsltDisp_qty27_p_PPanel.setName("RsltDisp.qty27_p");
		p.columnRsltDisp_qty27 = p.RsltDisp_qty27_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty27.addAliasName("RsltDisp.qty27", p);
		p.RsltDisp_qty28_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty28_p);
		p.RsltDisp_qty28_p_PPanel.setName("RsltDisp.qty28_p");
		p.columnRsltDisp_qty28 = p.RsltDisp_qty28_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty28.addAliasName("RsltDisp.qty28", p);
		p.RsltDisp_qty29_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty29_p);
		p.RsltDisp_qty29_p_PPanel.setName("RsltDisp.qty29_p");
		p.columnRsltDisp_qty29 = p.RsltDisp_qty29_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty29.addAliasName("RsltDisp.qty29", p);
		p.RsltDisp_qty30_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty30_p);
		p.RsltDisp_qty30_p_PPanel.setName("RsltDisp.qty30_p");
		p.columnRsltDisp_qty30 = p.RsltDisp_qty30_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty30.addAliasName("RsltDisp.qty30", p);
		p.RsltDisp_qty31_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty31_p);
		p.RsltDisp_qty31_p_PPanel.setName("RsltDisp.qty31_p");
		p.columnRsltDisp_qty31 = p.RsltDisp_qty31_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty31.addAliasName("RsltDisp.qty31", p);
		p.RsltDisp_qty32_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty32_p);
		p.RsltDisp_qty32_p_PPanel.setName("RsltDisp.qty32_p");
		p.columnRsltDisp_qty32 = p.RsltDisp_qty32_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty32.addAliasName("RsltDisp.qty32", p);
		p.RsltDisp_qty33_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty33_p);
		p.RsltDisp_qty33_p_PPanel.setName("RsltDisp.qty33_p");
		p.columnRsltDisp_qty33 = p.RsltDisp_qty33_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty33.addAliasName("RsltDisp.qty33", p);
		p.RsltDisp_qty34_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty34_p);
		p.RsltDisp_qty34_p_PPanel.setName("RsltDisp.qty34_p");
		p.columnRsltDisp_qty34 = p.RsltDisp_qty34_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty34.addAliasName("RsltDisp.qty34", p);
		p.RsltDisp_qty35_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty35_p);
		p.RsltDisp_qty35_p_PPanel.setName("RsltDisp.qty35_p");
		p.columnRsltDisp_qty35 = p.RsltDisp_qty35_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty35.addAliasName("RsltDisp.qty35", p);
		p.RsltDisp_qty36_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty36_p);
		p.RsltDisp_qty36_p_PPanel.setName("RsltDisp.qty36_p");
		p.columnRsltDisp_qty36 = p.RsltDisp_qty36_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty36.addAliasName("RsltDisp.qty36", p);
		p.RsltDisp_qty37_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty37_p);
		p.RsltDisp_qty37_p_PPanel.setName("RsltDisp.qty37_p");
		p.columnRsltDisp_qty37 = p.RsltDisp_qty37_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty37.addAliasName("RsltDisp.qty37", p);
		p.RsltDisp_qty38_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty38_p);
		p.RsltDisp_qty38_p_PPanel.setName("RsltDisp.qty38_p");
		p.columnRsltDisp_qty38 = p.RsltDisp_qty38_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty38.addAliasName("RsltDisp.qty38", p);
		p.RsltDisp_qty39_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty39_p);
		p.RsltDisp_qty39_p_PPanel.setName("RsltDisp.qty39_p");
		p.columnRsltDisp_qty39 = p.RsltDisp_qty39_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty39.addAliasName("RsltDisp.qty39", p);
		p.RsltDisp_qty40_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty40_p);
		p.RsltDisp_qty40_p_PPanel.setName("RsltDisp.qty40_p");
		p.columnRsltDisp_qty40 = p.RsltDisp_qty40_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty40.addAliasName("RsltDisp.qty40", p);
		p.RsltDisp_qty41_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty41_p);
		p.RsltDisp_qty41_p_PPanel.setName("RsltDisp.qty41_p");
		p.columnRsltDisp_qty41 = p.RsltDisp_qty41_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty41.addAliasName("RsltDisp.qty41", p);
		p.RsltDisp_qty42_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty42_p);
		p.RsltDisp_qty42_p_PPanel.setName("RsltDisp.qty42_p");
		p.columnRsltDisp_qty42 = p.RsltDisp_qty42_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty42.addAliasName("RsltDisp.qty42", p);
		p.RsltDisp_qty43_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty43_p);
		p.RsltDisp_qty43_p_PPanel.setName("RsltDisp.qty43_p");
		p.columnRsltDisp_qty43 = p.RsltDisp_qty43_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty43.addAliasName("RsltDisp.qty43", p);
		p.RsltDisp_qty44_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty44_p);
		p.RsltDisp_qty44_p_PPanel.setName("RsltDisp.qty44_p");
		p.columnRsltDisp_qty44 = p.RsltDisp_qty44_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty44.addAliasName("RsltDisp.qty44", p);
		p.RsltDisp_qty45_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty45_p);
		p.RsltDisp_qty45_p_PPanel.setName("RsltDisp.qty45_p");
		p.columnRsltDisp_qty45 = p.RsltDisp_qty45_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty45.addAliasName("RsltDisp.qty45", p);
		p.RsltDisp_qty46_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty46_p);
		p.RsltDisp_qty46_p_PPanel.setName("RsltDisp.qty46_p");
		p.columnRsltDisp_qty46 = p.RsltDisp_qty46_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty46.addAliasName("RsltDisp.qty46", p);
		p.RsltDisp_qty47_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty47_p);
		p.RsltDisp_qty47_p_PPanel.setName("RsltDisp.qty47_p");
		p.columnRsltDisp_qty47 = p.RsltDisp_qty47_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty47.addAliasName("RsltDisp.qty47", p);
		p.RsltDisp_qty48_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty48_p);
		p.RsltDisp_qty48_p_PPanel.setName("RsltDisp.qty48_p");
		p.columnRsltDisp_qty48 = p.RsltDisp_qty48_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty48.addAliasName("RsltDisp.qty48", p);
		p.RsltDisp_qty49_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty49_p);
		p.RsltDisp_qty49_p_PPanel.setName("RsltDisp.qty49_p");
		p.columnRsltDisp_qty49 = p.RsltDisp_qty49_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty49.addAliasName("RsltDisp.qty49", p);
		p.RsltDisp_qty50_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty50_p);
		p.RsltDisp_qty50_p_PPanel.setName("RsltDisp.qty50_p");
		p.columnRsltDisp_qty50 = p.RsltDisp_qty50_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty50.addAliasName("RsltDisp.qty50", p);
		p.RsltDisp_qty51_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty51_p);
		p.RsltDisp_qty51_p_PPanel.setName("RsltDisp.qty51_p");
		p.columnRsltDisp_qty51 = p.RsltDisp_qty51_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty51.addAliasName("RsltDisp.qty51", p);
		p.RsltDisp_qty52_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty52_p);
		p.RsltDisp_qty52_p_PPanel.setName("RsltDisp.qty52_p");
		p.columnRsltDisp_qty52 = p.RsltDisp_qty52_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty52.addAliasName("RsltDisp.qty52", p);
		p.RsltDisp_qty53_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty53_p);
		p.RsltDisp_qty53_p_PPanel.setName("RsltDisp.qty53_p");
		p.columnRsltDisp_qty53 = p.RsltDisp_qty53_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty53.addAliasName("RsltDisp.qty53", p);
		p.RsltDisp_qty54_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty54_p);
		p.RsltDisp_qty54_p_PPanel.setName("RsltDisp.qty54_p");
		p.columnRsltDisp_qty54 = p.RsltDisp_qty54_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty54.addAliasName("RsltDisp.qty54", p);
		p.RsltDisp_qty55_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty55_p);
		p.RsltDisp_qty55_p_PPanel.setName("RsltDisp.qty55_p");
		p.columnRsltDisp_qty55 = p.RsltDisp_qty55_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty55.addAliasName("RsltDisp.qty55", p);
		p.RsltDisp_qty56_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty56_p);
		p.RsltDisp_qty56_p_PPanel.setName("RsltDisp.qty56_p");
		p.columnRsltDisp_qty56 = p.RsltDisp_qty56_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty56.addAliasName("RsltDisp.qty56", p);
		p.RsltDisp_qty57_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty57_p);
		p.RsltDisp_qty57_p_PPanel.setName("RsltDisp.qty57_p");
		p.columnRsltDisp_qty57 = p.RsltDisp_qty57_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty57.addAliasName("RsltDisp.qty57", p);
		p.RsltDisp_qty58_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty58_p);
		p.RsltDisp_qty58_p_PPanel.setName("RsltDisp.qty58_p");
		p.columnRsltDisp_qty58 = p.RsltDisp_qty58_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty58.addAliasName("RsltDisp.qty58", p);
		p.RsltDisp_qty59_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty59_p);
		p.RsltDisp_qty59_p_PPanel.setName("RsltDisp.qty59_p");
		p.columnRsltDisp_qty59 = p.RsltDisp_qty59_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty59.addAliasName("RsltDisp.qty59", p);
		p.RsltDisp_qty60_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty60_p);
		p.RsltDisp_qty60_p_PPanel.setName("RsltDisp.qty60_p");
		p.columnRsltDisp_qty60 = p.RsltDisp_qty60_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty60.addAliasName("RsltDisp.qty60", p);
		p.RsltDisp_qty61_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty61_p);
		p.RsltDisp_qty61_p_PPanel.setName("RsltDisp.qty61_p");
		p.columnRsltDisp_qty61 = p.RsltDisp_qty61_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty61.addAliasName("RsltDisp.qty61", p);
		p.RsltDisp_qty62_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty62_p);
		p.RsltDisp_qty62_p_PPanel.setName("RsltDisp.qty62_p");
		p.columnRsltDisp_qty62 = p.RsltDisp_qty62_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty62.addAliasName("RsltDisp.qty62", p);
		p.RsltDisp_qty63_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty63_p);
		p.RsltDisp_qty63_p_PPanel.setName("RsltDisp.qty63_p");
		p.columnRsltDisp_qty63 = p.RsltDisp_qty63_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty63.addAliasName("RsltDisp.qty63", p);
		p.RsltDisp_qty64_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty64_p);
		p.RsltDisp_qty64_p_PPanel.setName("RsltDisp.qty64_p");
		p.columnRsltDisp_qty64 = p.RsltDisp_qty64_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty64.addAliasName("RsltDisp.qty64", p);
		p.RsltDisp_qty65_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty65_p);
		p.RsltDisp_qty65_p_PPanel.setName("RsltDisp.qty65_p");
		p.columnRsltDisp_qty65 = p.RsltDisp_qty65_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty65.addAliasName("RsltDisp.qty65", p);
		p.RsltDisp_qty66_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty66_p);
		p.RsltDisp_qty66_p_PPanel.setName("RsltDisp.qty66_p");
		p.columnRsltDisp_qty66 = p.RsltDisp_qty66_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty66.addAliasName("RsltDisp.qty66", p);
		p.RsltDisp_qty67_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty67_p);
		p.RsltDisp_qty67_p_PPanel.setName("RsltDisp.qty67_p");
		p.columnRsltDisp_qty67 = p.RsltDisp_qty67_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty67.addAliasName("RsltDisp.qty67", p);
		p.RsltDisp_qty68_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty68_p);
		p.RsltDisp_qty68_p_PPanel.setName("RsltDisp.qty68_p");
		p.columnRsltDisp_qty68 = p.RsltDisp_qty68_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty68.addAliasName("RsltDisp.qty68", p);
		p.RsltDisp_qty69_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty69_p);
		p.RsltDisp_qty69_p_PPanel.setName("RsltDisp.qty69_p");
		p.columnRsltDisp_qty69 = p.RsltDisp_qty69_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty69.addAliasName("RsltDisp.qty69", p);
		p.RsltDisp_qty70_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty70_p);
		p.RsltDisp_qty70_p_PPanel.setName("RsltDisp.qty70_p");
		p.columnRsltDisp_qty70 = p.RsltDisp_qty70_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty70.addAliasName("RsltDisp.qty70", p);
		p.RsltDisp_qty71_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty71_p);
		p.RsltDisp_qty71_p_PPanel.setName("RsltDisp.qty71_p");
		p.columnRsltDisp_qty71 = p.RsltDisp_qty71_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty71.addAliasName("RsltDisp.qty71", p);
		p.RsltDisp_qty72_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty72_p);
		p.RsltDisp_qty72_p_PPanel.setName("RsltDisp.qty72_p");
		p.columnRsltDisp_qty72 = p.RsltDisp_qty72_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty72.addAliasName("RsltDisp.qty72", p);
		p.RsltDisp_qty73_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty73_p);
		p.RsltDisp_qty73_p_PPanel.setName("RsltDisp.qty73_p");
		p.columnRsltDisp_qty73 = p.RsltDisp_qty73_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty73.addAliasName("RsltDisp.qty73", p);
		p.RsltDisp_qty74_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty74_p);
		p.RsltDisp_qty74_p_PPanel.setName("RsltDisp.qty74_p");
		p.columnRsltDisp_qty74 = p.RsltDisp_qty74_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty74.addAliasName("RsltDisp.qty74", p);
		p.RsltDisp_qty75_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty75_p);
		p.RsltDisp_qty75_p_PPanel.setName("RsltDisp.qty75_p");
		p.columnRsltDisp_qty75 = p.RsltDisp_qty75_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty75.addAliasName("RsltDisp.qty75", p);
		p.RsltDisp_qty76_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty76_p);
		p.RsltDisp_qty76_p_PPanel.setName("RsltDisp.qty76_p");
		p.columnRsltDisp_qty76 = p.RsltDisp_qty76_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty76.addAliasName("RsltDisp.qty76", p);
		p.RsltDisp_qty77_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty77_p);
		p.RsltDisp_qty77_p_PPanel.setName("RsltDisp.qty77_p");
		p.columnRsltDisp_qty77 = p.RsltDisp_qty77_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty77.addAliasName("RsltDisp.qty77", p);
		p.RsltDisp_qty78_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty78_p);
		p.RsltDisp_qty78_p_PPanel.setName("RsltDisp.qty78_p");
		p.columnRsltDisp_qty78 = p.RsltDisp_qty78_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty78.addAliasName("RsltDisp.qty78", p);
		p.RsltDisp_qty79_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty79_p);
		p.RsltDisp_qty79_p_PPanel.setName("RsltDisp.qty79_p");
		p.columnRsltDisp_qty79 = p.RsltDisp_qty79_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty79.addAliasName("RsltDisp.qty79", p);
		p.RsltDisp_qty80_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty80_p);
		p.RsltDisp_qty80_p_PPanel.setName("RsltDisp.qty80_p");
		p.columnRsltDisp_qty80 = p.RsltDisp_qty80_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty80.addAliasName("RsltDisp.qty80", p);
		p.RsltDisp_qty81_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty81_p);
		p.RsltDisp_qty81_p_PPanel.setName("RsltDisp.qty81_p");
		p.columnRsltDisp_qty81 = p.RsltDisp_qty81_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty81.addAliasName("RsltDisp.qty81", p);
		p.RsltDisp_qty82_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty82_p);
		p.RsltDisp_qty82_p_PPanel.setName("RsltDisp.qty82_p");
		p.columnRsltDisp_qty82 = p.RsltDisp_qty82_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty82.addAliasName("RsltDisp.qty82", p);
		p.RsltDisp_qty83_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty83_p);
		p.RsltDisp_qty83_p_PPanel.setName("RsltDisp.qty83_p");
		p.columnRsltDisp_qty83 = p.RsltDisp_qty83_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty83.addAliasName("RsltDisp.qty83", p);
		p.RsltDisp_qty84_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty84_p);
		p.RsltDisp_qty84_p_PPanel.setName("RsltDisp.qty84_p");
		p.columnRsltDisp_qty84 = p.RsltDisp_qty84_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty84.addAliasName("RsltDisp.qty84", p);
		p.RsltDisp_qty85_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty85_p);
		p.RsltDisp_qty85_p_PPanel.setName("RsltDisp.qty85_p");
		p.columnRsltDisp_qty85 = p.RsltDisp_qty85_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty85.addAliasName("RsltDisp.qty85", p);
		p.RsltDisp_qty86_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty86_p);
		p.RsltDisp_qty86_p_PPanel.setName("RsltDisp.qty86_p");
		p.columnRsltDisp_qty86 = p.RsltDisp_qty86_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty86.addAliasName("RsltDisp.qty86", p);
		p.RsltDisp_qty87_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty87_p);
		p.RsltDisp_qty87_p_PPanel.setName("RsltDisp.qty87_p");
		p.columnRsltDisp_qty87 = p.RsltDisp_qty87_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty87.addAliasName("RsltDisp.qty87", p);
		p.RsltDisp_qty88_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty88_p);
		p.RsltDisp_qty88_p_PPanel.setName("RsltDisp.qty88_p");
		p.columnRsltDisp_qty88 = p.RsltDisp_qty88_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty88.addAliasName("RsltDisp.qty88", p);
		p.RsltDisp_qty89_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty89_p);
		p.RsltDisp_qty89_p_PPanel.setName("RsltDisp.qty89_p");
		p.columnRsltDisp_qty89 = p.RsltDisp_qty89_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty89.addAliasName("RsltDisp.qty89", p);
		p.RsltDisp_qty90_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty90_p);
		p.RsltDisp_qty90_p_PPanel.setName("RsltDisp.qty90_p");
		p.columnRsltDisp_qty90 = p.RsltDisp_qty90_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty90.addAliasName("RsltDisp.qty90", p);
		p.RsltDisp_qty91_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty91_p);
		p.RsltDisp_qty91_p_PPanel.setName("RsltDisp.qty91_p");
		p.columnRsltDisp_qty91 = p.RsltDisp_qty91_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty91.addAliasName("RsltDisp.qty91", p);
		p.RsltDisp_qty92_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty92_p);
		p.RsltDisp_qty92_p_PPanel.setName("RsltDisp.qty92_p");
		p.columnRsltDisp_qty92 = p.RsltDisp_qty92_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty92.addAliasName("RsltDisp.qty92", p);
		p.RsltDisp_qty93_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0320.RsltDispR.$qty93_p);
		p.RsltDisp_qty93_p_PPanel.setName("RsltDisp.qty93_p");
		p.columnRsltDisp_qty93 = p.RsltDisp_qty93_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty93.addAliasName("RsltDisp.qty93", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBCP_ItmOrdLdSrch p) {
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
	
	
	/** [Cnd_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_loc_grp_cd_p = null;

	/**
	 * [Cnd_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loc_grp_cd_ListPutter() {
		if (Cnd_loc_grp_cd_p == null) {
			Cnd_loc_grp_cd_p = createCnd_loc_grp_cd_ListPutter(Cnd_loc_grp_cd, "loc_grp_cd", "loc_grp_nm");

		}
		return Cnd_loc_grp_cd_p;
	}
	
	
	/** [Cnd_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_loc_cd_p = null;

	/**
	 * [Cnd_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_loc_cd_ListPutter() {
		if (Cnd_mfg_loc_cd_p == null) {
			Cnd_mfg_loc_cd_p = createCnd_mfg_loc_cd_ListPutter(Cnd_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm");

		}
		return Cnd_mfg_loc_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_ItmOrdLdSrch create(){
		MSBCP_ItmOrdLdSrch p = new MSBCP_ItmOrdLdSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_ItmOrdLdSrch create(String name){
		MSBCP_ItmOrdLdSrch p = new MSBCP_ItmOrdLdSrch(name);
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
		MSBCP_ItmOrdLdSrch_MC.jbfInitTop((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbfInitFold((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbfInitCnd1((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbfInitCnd((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbfInitLPnl((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbfInitCtrl((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbfInitRsltDisp((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbfInitBtn((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbInitTop((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbInitFold((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbInitCnd1((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbInitCnd((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbInitLPnl((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbInitCtrl((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbInitRsltDisp((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.jbInitBtn((MSBCP_ItmOrdLdSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd1(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.Cnd1Panel = p.beansFactory.createPanel("Cnd1");
		p.Cnd1TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_opn_flg = p.beansFactory.createCheckBox("Cnd.opn_flg");
		p.Cnd_sav_flg = p.beansFactory.createCheckBox("Cnd.sav_flg");
		p.Cnd_fix_flg = p.beansFactory.createCheckBox("Cnd.fix_flg");
		p.Cnd_inst_flg = p.beansFactory.createCheckBox("Cnd.inst_flg");
		p.Cnd_cmpl_flg = p.beansFactory.createCheckBox("Cnd.cmpl_flg");
		p.Cnd_prcd_flg = p.beansFactory.createCheckBox("Cnd.prcd_flg");
		p.Cnd_sim_flg = p.beansFactory.createCheckBox("Cnd.sim_flg");
		p.Cnd_sim_mrp_no_Label = p.beansFactory.createLabel("Cnd.sim_mrp_no_Label");
		p.Cnd_sim_mrp_no = p.beansFactory.createTextField("Cnd.sim_mrp_no");
		p.Cnd_sim_mrp_no.setLabel(p.Cnd_sim_mrp_no_Label);
		p.Cnd_dt_fr_Label = p.beansFactory.createLabel("Cnd.dt_fr_Label");
		p.Cnd_dt_fr = p.beansFactory.createDateField("Cnd.dt_fr");
		p.Cnd_dt_fr.setLabel(p.Cnd_dt_fr_Label);
		p.Cnd_dt_to_Label = p.beansFactory.createLabel("Cnd.dt_to_Label");
		p.Cnd_dt_to = p.beansFactory.createDateField("Cnd.dt_to");
		p.Cnd_dt_to.setLabel(p.Cnd_dt_to_Label);
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.loc_grp_cd_Label");
		p.Cnd_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.loc_grp_cd");
		p.Cnd_loc_grp_cd.setLabel(p.Cnd_loc_grp_cd_Label);
		p.Cnd_loc_grp_nm = p.beansFactory.createTextField("Cnd.loc_grp_nm");
		p.Cnd_mfg_loc_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_cd_Label");
		p.Cnd_mfg_loc_cd = p.beansFactory.createTextField("Cnd.mfg_loc_cd");
		p.Cnd_mfg_loc_cd.setLabel(p.Cnd_mfg_loc_cd_Label);
		p.Cnd_mfg_loc_nm = p.beansFactory.createTextField("Cnd.mfg_loc_nm");
		p.Cnd_base_qty_over_flg = p.beansFactory.createCheckBox("Cnd.base_qty_over_flg");
		p.Cnd_alert_qty_over_flg = p.beansFactory.createCheckBox("Cnd.alert_qty_over_flg");
		p.Cnd_period_typ_label = p.beansFactory.createLabel("Cnd.period_typ_label");
		p.Cnd_period_typ_view_Group = p.beansFactory.createButtonGroup("Cnd.period_typ_view");
		p.Cnd_period_typ_view_DAILY = p.beansFactory.createRadioButton("Cnd.period_typ_view_DAILY");
		p.Cnd_period_typ_view_WEEKLY = p.beansFactory.createRadioButton("Cnd.period_typ_view_WEEKLY");
		p.Cnd_period_typ_view_TENDAYS = p.beansFactory.createRadioButton("Cnd.period_typ_view_TENDAYS");
		p.Cnd_period_typ_view_MONTHLY = p.beansFactory.createRadioButton("Cnd.period_typ_view_MONTHLY");
		p.Cnd_show_lab1 = p.beansFactory.createLabel("Cnd.show_lab1");
		p.Cnd_show_sep1 = p.beansFactory.createLabel("Cnd.show_sep1");
		p.Cnd_show_act_qty_flg = p.beansFactory.createCheckBox("Cnd.show_act_qty_flg");
		p.Cnd_show_base_qty_flg = p.beansFactory.createCheckBox("Cnd.show_base_qty_flg");
		p.Cnd_show_alert_qty_flg = p.beansFactory.createCheckBox("Cnd.show_alert_qty_flg");
		p.Cnd_show_sep2 = p.beansFactory.createLabel("Cnd.show_sep2");
		p.Cnd_show_label_flg = p.beansFactory.createCheckBox("Cnd.show_label_flg");
		p.Cnd_show_code_flg = p.beansFactory.createCheckBox("Cnd.show_code_flg");
		p.Cnd_show_name_flg = p.beansFactory.createCheckBox("Cnd.show_name_flg");
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RsltDisp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltDisp(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.RsltDispPanel = p.beansFactory.createPanel("RsltDisp");
		p.RsltDispScrollPane = p.beansFactory.createScrollPane("RsltDisp.scroll");
		p.createRsltDispTable();
		// ブロックの項目の初期化
		p.columnRsltDisp_label = p.beansFactory.createTableColumn("RsltDisp.label", MCColumnType.TEXT);
		p.columnRsltDisp_code = p.beansFactory.createTableColumn("RsltDisp.code", MCColumnType.TEXT);
		p.columnRsltDisp_name = p.beansFactory.createTableColumn("RsltDisp.name", MCColumnType.TEXT);
		p.columnRsltDisp_row_title_col = p.beansFactory.createTableColumn("RsltDisp.row_title_col", MCColumnType.TEXT);
		p.columnRsltDisp_row_title_nm = p.beansFactory.createTableColumn("RsltDisp.row_title_nm", MCColumnType.TEXT);
		p.columnRsltDisp_holiday01_flg = p.beansFactory.createTableColumn("RsltDisp.holiday01_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday02_flg = p.beansFactory.createTableColumn("RsltDisp.holiday02_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday03_flg = p.beansFactory.createTableColumn("RsltDisp.holiday03_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday04_flg = p.beansFactory.createTableColumn("RsltDisp.holiday04_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday05_flg = p.beansFactory.createTableColumn("RsltDisp.holiday05_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday06_flg = p.beansFactory.createTableColumn("RsltDisp.holiday06_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday07_flg = p.beansFactory.createTableColumn("RsltDisp.holiday07_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday08_flg = p.beansFactory.createTableColumn("RsltDisp.holiday08_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday09_flg = p.beansFactory.createTableColumn("RsltDisp.holiday09_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday10_flg = p.beansFactory.createTableColumn("RsltDisp.holiday10_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday11_flg = p.beansFactory.createTableColumn("RsltDisp.holiday11_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday12_flg = p.beansFactory.createTableColumn("RsltDisp.holiday12_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday13_flg = p.beansFactory.createTableColumn("RsltDisp.holiday13_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday14_flg = p.beansFactory.createTableColumn("RsltDisp.holiday14_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday15_flg = p.beansFactory.createTableColumn("RsltDisp.holiday15_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday16_flg = p.beansFactory.createTableColumn("RsltDisp.holiday16_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday17_flg = p.beansFactory.createTableColumn("RsltDisp.holiday17_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday18_flg = p.beansFactory.createTableColumn("RsltDisp.holiday18_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday19_flg = p.beansFactory.createTableColumn("RsltDisp.holiday19_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday20_flg = p.beansFactory.createTableColumn("RsltDisp.holiday20_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday21_flg = p.beansFactory.createTableColumn("RsltDisp.holiday21_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday22_flg = p.beansFactory.createTableColumn("RsltDisp.holiday22_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday23_flg = p.beansFactory.createTableColumn("RsltDisp.holiday23_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday24_flg = p.beansFactory.createTableColumn("RsltDisp.holiday24_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday25_flg = p.beansFactory.createTableColumn("RsltDisp.holiday25_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday26_flg = p.beansFactory.createTableColumn("RsltDisp.holiday26_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday27_flg = p.beansFactory.createTableColumn("RsltDisp.holiday27_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday28_flg = p.beansFactory.createTableColumn("RsltDisp.holiday28_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday29_flg = p.beansFactory.createTableColumn("RsltDisp.holiday29_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday30_flg = p.beansFactory.createTableColumn("RsltDisp.holiday30_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday31_flg = p.beansFactory.createTableColumn("RsltDisp.holiday31_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday32_flg = p.beansFactory.createTableColumn("RsltDisp.holiday32_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday33_flg = p.beansFactory.createTableColumn("RsltDisp.holiday33_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday34_flg = p.beansFactory.createTableColumn("RsltDisp.holiday34_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday35_flg = p.beansFactory.createTableColumn("RsltDisp.holiday35_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday36_flg = p.beansFactory.createTableColumn("RsltDisp.holiday36_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday37_flg = p.beansFactory.createTableColumn("RsltDisp.holiday37_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday38_flg = p.beansFactory.createTableColumn("RsltDisp.holiday38_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday39_flg = p.beansFactory.createTableColumn("RsltDisp.holiday39_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday40_flg = p.beansFactory.createTableColumn("RsltDisp.holiday40_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday41_flg = p.beansFactory.createTableColumn("RsltDisp.holiday41_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday42_flg = p.beansFactory.createTableColumn("RsltDisp.holiday42_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday43_flg = p.beansFactory.createTableColumn("RsltDisp.holiday43_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday44_flg = p.beansFactory.createTableColumn("RsltDisp.holiday44_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday45_flg = p.beansFactory.createTableColumn("RsltDisp.holiday45_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday46_flg = p.beansFactory.createTableColumn("RsltDisp.holiday46_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday47_flg = p.beansFactory.createTableColumn("RsltDisp.holiday47_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday48_flg = p.beansFactory.createTableColumn("RsltDisp.holiday48_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday49_flg = p.beansFactory.createTableColumn("RsltDisp.holiday49_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday50_flg = p.beansFactory.createTableColumn("RsltDisp.holiday50_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday51_flg = p.beansFactory.createTableColumn("RsltDisp.holiday51_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday52_flg = p.beansFactory.createTableColumn("RsltDisp.holiday52_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday53_flg = p.beansFactory.createTableColumn("RsltDisp.holiday53_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday54_flg = p.beansFactory.createTableColumn("RsltDisp.holiday54_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday55_flg = p.beansFactory.createTableColumn("RsltDisp.holiday55_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday56_flg = p.beansFactory.createTableColumn("RsltDisp.holiday56_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday57_flg = p.beansFactory.createTableColumn("RsltDisp.holiday57_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday58_flg = p.beansFactory.createTableColumn("RsltDisp.holiday58_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday59_flg = p.beansFactory.createTableColumn("RsltDisp.holiday59_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday60_flg = p.beansFactory.createTableColumn("RsltDisp.holiday60_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday61_flg = p.beansFactory.createTableColumn("RsltDisp.holiday61_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday62_flg = p.beansFactory.createTableColumn("RsltDisp.holiday62_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday63_flg = p.beansFactory.createTableColumn("RsltDisp.holiday63_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday64_flg = p.beansFactory.createTableColumn("RsltDisp.holiday64_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday65_flg = p.beansFactory.createTableColumn("RsltDisp.holiday65_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday66_flg = p.beansFactory.createTableColumn("RsltDisp.holiday66_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday67_flg = p.beansFactory.createTableColumn("RsltDisp.holiday67_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday68_flg = p.beansFactory.createTableColumn("RsltDisp.holiday68_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday69_flg = p.beansFactory.createTableColumn("RsltDisp.holiday69_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday70_flg = p.beansFactory.createTableColumn("RsltDisp.holiday70_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday71_flg = p.beansFactory.createTableColumn("RsltDisp.holiday71_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday72_flg = p.beansFactory.createTableColumn("RsltDisp.holiday72_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday73_flg = p.beansFactory.createTableColumn("RsltDisp.holiday73_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday74_flg = p.beansFactory.createTableColumn("RsltDisp.holiday74_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday75_flg = p.beansFactory.createTableColumn("RsltDisp.holiday75_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday76_flg = p.beansFactory.createTableColumn("RsltDisp.holiday76_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday77_flg = p.beansFactory.createTableColumn("RsltDisp.holiday77_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday78_flg = p.beansFactory.createTableColumn("RsltDisp.holiday78_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday79_flg = p.beansFactory.createTableColumn("RsltDisp.holiday79_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday80_flg = p.beansFactory.createTableColumn("RsltDisp.holiday80_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday81_flg = p.beansFactory.createTableColumn("RsltDisp.holiday81_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday82_flg = p.beansFactory.createTableColumn("RsltDisp.holiday82_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday83_flg = p.beansFactory.createTableColumn("RsltDisp.holiday83_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday84_flg = p.beansFactory.createTableColumn("RsltDisp.holiday84_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday85_flg = p.beansFactory.createTableColumn("RsltDisp.holiday85_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday86_flg = p.beansFactory.createTableColumn("RsltDisp.holiday86_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday87_flg = p.beansFactory.createTableColumn("RsltDisp.holiday87_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday88_flg = p.beansFactory.createTableColumn("RsltDisp.holiday88_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday89_flg = p.beansFactory.createTableColumn("RsltDisp.holiday89_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday90_flg = p.beansFactory.createTableColumn("RsltDisp.holiday90_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday91_flg = p.beansFactory.createTableColumn("RsltDisp.holiday91_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday92_flg = p.beansFactory.createTableColumn("RsltDisp.holiday92_flg", MCColumnType.CHECK);
		p.columnRsltDisp_holiday93_flg = p.beansFactory.createTableColumn("RsltDisp.holiday93_flg", MCColumnType.CHECK);
		p.columnRsltDisp_mfg_loc_cd = p.beansFactory.createTableColumn("RsltDisp.mfg_loc_cd", MCColumnType.TEXT);
		p.columnRsltDisp_mfg_loc_nm = p.beansFactory.createTableColumn("RsltDisp.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRsltDisp_wg_cd = p.beansFactory.createTableColumn("RsltDisp.wg_cd", MCColumnType.TEXT);
		p.columnRsltDisp_rsrc_cd = p.beansFactory.createTableColumn("RsltDisp.rsrc_cd", MCColumnType.TEXT);
		p.columnRsltDisp_rsrc_nm = p.beansFactory.createTableColumn("RsltDisp.rsrc_nm", MCColumnType.TEXT);
		p.columnRsltDisp_rsrc_unit_cd = p.beansFactory.createTableColumn("RsltDisp.rsrc_unit_cd", MCColumnType.TEXT);
		p.columnRsltDisp_rsrc_unit_nm = p.beansFactory.createTableColumn("RsltDisp.rsrc_unit_nm", MCColumnType.TEXT);
		p.columnRsltDisp_rsrc_dec_place = p.beansFactory.createTableColumn("RsltDisp.rsrc_dec_place", MCColumnType.NUMBER);
		p.columnRsltDisp_disp_seq = p.beansFactory.createTableColumn("RsltDisp.disp_seq", MCColumnType.NUMBER);
		p.columnRsltDisp_label_loc = p.beansFactory.createTableColumn("RsltDisp.label_loc", MCColumnType.TEXT);
		p.columnRsltDisp_label_rsrc = p.beansFactory.createTableColumn("RsltDisp.label_rsrc", MCColumnType.TEXT);
		p.columnRsltDisp_label_unit = p.beansFactory.createTableColumn("RsltDisp.label_unit", MCColumnType.TEXT);
		p.columnRsltDisp_record_id = p.beansFactory.createTableColumn("RsltDisp.record_id", MCColumnType.NUMBER);
		p.columnRsltDisp_record_grp_id = p.beansFactory.createTableColumn("RsltDisp.record_grp_id", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP0290 = p.beansFactory.createButton("Btn.open_MSBCP0290", "open");
		p.Btn_open_MSBCP0050 = p.beansFactory.createButton("Btn.open_MSBCP0050", "open");
		p.Btn_open_MSBCP0130 = p.beansFactory.createButton("Btn.open_MSBCP0130", "open");
		p.Btn_open_MSBCP0160 = p.beansFactory.createButton("Btn.open_MSBCP0160", "open");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltDispPanel);
		p.TopPanel.setValueCheck(false);
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
	protected static void jbInitFold(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.Cnd1Panel, null);
		p.FoldPanel.setLastBeans(p.Cnd1Panel);
		p.Cnd1Panel.setNextBeans(p.CndPanel);
		p.FoldPanel.add(p.CndPanel, null);
	}

	/**
	 * [Cnd1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd1(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.Cnd1Panel.setBorder(p.Cnd1TitledBorder);
		p.Cnd1Panel.setValueCheck(false);
		p.Cnd1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd1Panel.setLayoutPosition("CN");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("CC");
		// ブロックの項目の初期化
		p.Cnd1Panel.add(p.Cnd_opn_flg);
		p.Cnd1Panel.setLastBeans(p.Cnd_opn_flg);
		p.Cnd_opn_flg.setNextBeans(p.Cnd_sav_flg);
		p.Cnd_opn_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.opn_flg_META);
		p.Cnd1Panel.add(p.Cnd_sav_flg);
		p.Cnd_sav_flg.setNextBeans(p.Cnd_fix_flg);
		p.Cnd_sav_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.sav_flg_META);
		p.Cnd1Panel.add(p.Cnd_fix_flg);
		p.Cnd_fix_flg.setNextBeans(p.Cnd_inst_flg);
		p.Cnd_fix_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.fix_flg_META);
		p.Cnd1Panel.add(p.Cnd_inst_flg);
		p.Cnd_inst_flg.setNextBeans(p.Cnd_cmpl_flg);
		p.Cnd_inst_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.inst_flg_META);
		p.Cnd1Panel.add(p.Cnd_cmpl_flg);
		p.Cnd_cmpl_flg.setNextBeans(p.Cnd_prcd_flg);
		p.Cnd_cmpl_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.cmpl_flg_META);
		p.Cnd1Panel.add(p.Cnd_prcd_flg);
		p.Cnd_prcd_flg.setNextBeans(p.Cnd_sim_flg);
		p.Cnd_prcd_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.prcd_flg_META);
		p.Cnd1Panel.add(p.Cnd_sim_flg);
		p.Cnd_sim_flg.setNextBeans(p.Cnd_sim_mrp_no);
		p.Cnd_sim_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.sim_flg_META);
		p.Cnd1Panel.add(p.Cnd_sim_mrp_no_Label);
		p.Cnd1Panel.add(p.Cnd_sim_mrp_no);
		p.Cnd_sim_mrp_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.sim_mrp_no_META);
		p.CndPanel.add(p.Cnd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_dt_fr);
		p.Cnd_dt_fr.setNextBeans(p.Cnd_dt_to);
		p.Cnd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.dt_fr_META);
		p.Cnd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dt_to_Label);
		p.CndPanel.add(p.Cnd_dt_to);
		p.Cnd_dt_to.setNextBeans(p.Cnd_site_cd);
		p.Cnd_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.dt_to_META);
		p.Cnd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_loc_grp_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_grp_cd, true);
		p.Cnd_loc_grp_cd.setLinkBeans(p.Cnd_loc_grp_nm);
		p.CndPanel.add(p.Cnd_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_loc_grp_cd);
		p.Cnd_loc_grp_cd.setNextBeans(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_nm.setNextBeans(p.Cnd_mfg_loc_cd);
		p.Cnd_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_mfg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_cd);
		p.Cnd_mfg_loc_cd.setNextBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.mfg_loc_cd_META);
		p.Cnd_mfg_loc_cd.addLinkBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_cd, true);
		p.CndPanel.add(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_nm.setNextBeans(p.Cnd_base_qty_over_flg);
		p.Cnd_mfg_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.mfg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_loc_nm, true);
		p.CndPanel.add(p.Cnd_base_qty_over_flg);
		p.Cnd_base_qty_over_flg.setNextBeans(p.Cnd_alert_qty_over_flg);
		p.Cnd_base_qty_over_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.base_qty_over_flg_META);
		p.CndPanel.add(p.Cnd_alert_qty_over_flg);
		p.Cnd_alert_qty_over_flg.setNextBeans(p.Cnd_period_typ_view_Group);
		p.Cnd_alert_qty_over_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.alert_qty_over_flg_META);
		p.CndPanel.add(p.Cnd_period_typ_label);
		p.Cnd_period_typ_view_Group.setFirstBeans(p.Cnd_period_typ_view_DAILY);
		p.Cnd_period_typ_view_DAILY.setActionCommand("1");
		p.Cnd_period_typ_view_Group.add(p.Cnd_period_typ_view_DAILY);
		p.CndPanel.add(p.Cnd_period_typ_view_DAILY);
		p.Cnd_period_typ_view_DAILY.setNextBeans(p.Cnd_period_typ_view_WEEKLY);
		p.Cnd_period_typ_view_WEEKLY.setActionCommand("2");
		p.Cnd_period_typ_view_Group.add(p.Cnd_period_typ_view_WEEKLY);
		p.CndPanel.add(p.Cnd_period_typ_view_WEEKLY);
		p.Cnd_period_typ_view_WEEKLY.setNextBeans(p.Cnd_period_typ_view_TENDAYS);
		p.Cnd_period_typ_view_TENDAYS.setActionCommand("3");
		p.Cnd_period_typ_view_Group.add(p.Cnd_period_typ_view_TENDAYS);
		p.CndPanel.add(p.Cnd_period_typ_view_TENDAYS);
		p.Cnd_period_typ_view_TENDAYS.setNextBeans(p.Cnd_period_typ_view_MONTHLY);
		p.Cnd_period_typ_view_MONTHLY.setActionCommand("4");
		p.Cnd_period_typ_view_Group.add(p.Cnd_period_typ_view_MONTHLY);
		p.CndPanel.add(p.Cnd_period_typ_view_MONTHLY);
		p.Cnd_period_typ_view_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.period_typ_view_META);
		p.LPnlPanel.add(p.Cnd_show_lab1);
		p.LPnlPanel.add(p.Cnd_show_sep1);
		p.LPnlPanel.add(p.Cnd_show_act_qty_flg);
		p.LPnlPanel.setLastBeans(p.Cnd_show_act_qty_flg);
		p.Cnd_show_act_qty_flg.setNextBeans(p.Cnd_show_base_qty_flg);
		p.Cnd_show_act_qty_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.show_act_qty_flg_META);
		p.LPnlPanel.add(p.Cnd_show_base_qty_flg);
		p.Cnd_show_base_qty_flg.setNextBeans(p.Cnd_show_alert_qty_flg);
		p.Cnd_show_base_qty_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.show_base_qty_flg_META);
		p.LPnlPanel.add(p.Cnd_show_alert_qty_flg);
		p.Cnd_show_alert_qty_flg.setNextBeans(p.Cnd_show_label_flg);
		p.Cnd_show_alert_qty_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.show_alert_qty_flg_META);
		p.LPnlPanel.add(p.Cnd_show_sep2);
		p.LPnlPanel.add(p.Cnd_show_label_flg);
		p.Cnd_show_label_flg.setNextBeans(p.Cnd_show_code_flg);
		p.Cnd_show_label_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.show_label_flg_META);
		p.LPnlPanel.add(p.Cnd_show_code_flg);
		p.Cnd_show_code_flg.setNextBeans(p.Cnd_show_name_flg);
		p.Cnd_show_code_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.show_code_flg_META);
		p.LPnlPanel.add(p.Cnd_show_name_flg);
		p.Cnd_show_name_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0320.CndR.show_name_flg_META);
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [RsltDisp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltDisp(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltDispPanel);
		p.RsltDispPanel.setNextBeans(p.BtnPanel);
		p.RsltDispPanel.add(p.RsltDispScrollPane);
		p.RsltDispPanel.setLastBeans(p.RsltDispTable);
		p.RsltDispScrollPane.setViewportView(p.RsltDispTable);
		p.RsltDispTable.setList(p.getRsltDispL());
		p.RsltDispTable.setStatusColumnVisible(false);
		p.RsltDispPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBCP_ItmOrdLdSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP0290.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBCP0290);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBCP0290);
		p.Btn_open_MSBCP0290.setNextBeans(p.Btn_open_MSBCP0050);
		p.Btn_open_MSBCP0050.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBCP0050);
		p.Btn_open_MSBCP0050.setNextBeans(p.Btn_open_MSBCP0130);
		p.Btn_open_MSBCP0130.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBCP0130);
		p.Btn_open_MSBCP0130.setNextBeans(p.Btn_open_MSBCP0160);
		p.Btn_open_MSBCP0160.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBCP0160);
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
		MSBCP_ItmOrdLdSrch_MC.mcInitTop((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.mcInitFold((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.mcInitCnd1((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.mcInitCnd((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.mcInitLPnl((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.mcInitCtrl((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.mcInitRsltDisp((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.mcInitBtn((MSBCP_ItmOrdLdSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBCP_ItmOrdLdSrch_MC.statusInitSRCH_Top((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitSRCH_Fold((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitSRCH_Cnd1((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitSRCH_Cnd((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitSRCH_LPnl((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitSRCH_Ctrl((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitSRCH_RsltDisp((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitSRCH_Rslt((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitSRCH_Btn((MSBCP_ItmOrdLdSrch)this);

		// [REF]ステータスのモードの設定
		MSBCP_ItmOrdLdSrch_MC.statusInitREF_Top((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitREF_Fold((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitREF_Cnd1((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitREF_Cnd((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitREF_LPnl((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitREF_Ctrl((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitREF_RsltDisp((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitREF_Rslt((MSBCP_ItmOrdLdSrch)this);
		MSBCP_ItmOrdLdSrch_MC.statusInitREF_Btn((MSBCP_ItmOrdLdSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_ItmOrdLdSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_ItmOrdLdSrch p) {
	}

	/**
	 *  [Cnd1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd1(MSBCP_ItmOrdLdSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_ItmOrdLdSrch p) {
		p.Cnd_opn_flg.addAllListener(p);
		p.Cnd_sav_flg.addAllListener(p);
		p.Cnd_fix_flg.addAllListener(p);
		p.Cnd_inst_flg.addAllListener(p);
		p.Cnd_cmpl_flg.addAllListener(p);
		p.Cnd_prcd_flg.addAllListener(p);
		p.Cnd_sim_flg.addAllListener(p);
		p.Cnd_sim_mrp_no.setListListener(p);
		p.Cnd_sim_mrp_no.addAllListener(p);
		p.Cnd_dt_fr.setListListener(p);
		p.Cnd_dt_fr.addAllListener(p);
		p.Cnd_dt_to.setListListener(p);
		p.Cnd_dt_to.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_loc_grp_cd.setListListener(p);
		p.Cnd_loc_grp_cd.addAllListener(p);
		p.Cnd_loc_grp_nm.setListListener(p);
		p.Cnd_loc_grp_nm.addAllListener(p);
		p.Cnd_mfg_loc_cd.setListListener(p);
		p.Cnd_mfg_loc_cd.addAllListener(p);
		p.Cnd_mfg_loc_nm.setListListener(p);
		p.Cnd_mfg_loc_nm.addAllListener(p);
		p.Cnd_base_qty_over_flg.addAllListener(p);
		p.Cnd_alert_qty_over_flg.addAllListener(p);
		p.Cnd_period_typ_view_Group.addAllListener(p);
		p.Cnd_period_typ_view_DAILY.addAllListener(p);
		p.Cnd_period_typ_view_WEEKLY.addAllListener(p);
		p.Cnd_period_typ_view_TENDAYS.addAllListener(p);
		p.Cnd_period_typ_view_MONTHLY.addAllListener(p);
		p.Cnd_show_act_qty_flg.addAllListener(p);
		p.Cnd_show_base_qty_flg.addAllListener(p);
		p.Cnd_show_alert_qty_flg.addAllListener(p);
		p.Cnd_show_label_flg.addAllListener(p);
		p.Cnd_show_code_flg.addAllListener(p);
		p.Cnd_show_name_flg.addAllListener(p);
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MSBCP_ItmOrdLdSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBCP_ItmOrdLdSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RsltDisp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltDisp(MSBCP_ItmOrdLdSrch p) {
		p.RsltDispTable.addAllListener(p);
		p.columnRsltDisp_label.addAllListener(p);
		p.columnRsltDisp_label.setListListener(p);
		p.columnRsltDisp_code.addAllListener(p);
		p.columnRsltDisp_code.setListListener(p);
		p.columnRsltDisp_name.addAllListener(p);
		p.columnRsltDisp_name.setListListener(p);
		p.columnRsltDisp_row_title_col.addAllListener(p);
		p.columnRsltDisp_row_title_col.setListListener(p);
		p.columnRsltDisp_row_title_nm.addAllListener(p);
		p.columnRsltDisp_row_title_nm.setListListener(p);
		p.columnRsltDisp_holiday01_flg.addAllListener(p);
		p.columnRsltDisp_holiday02_flg.addAllListener(p);
		p.columnRsltDisp_holiday03_flg.addAllListener(p);
		p.columnRsltDisp_holiday04_flg.addAllListener(p);
		p.columnRsltDisp_holiday05_flg.addAllListener(p);
		p.columnRsltDisp_holiday06_flg.addAllListener(p);
		p.columnRsltDisp_holiday07_flg.addAllListener(p);
		p.columnRsltDisp_holiday08_flg.addAllListener(p);
		p.columnRsltDisp_holiday09_flg.addAllListener(p);
		p.columnRsltDisp_holiday10_flg.addAllListener(p);
		p.columnRsltDisp_holiday11_flg.addAllListener(p);
		p.columnRsltDisp_holiday12_flg.addAllListener(p);
		p.columnRsltDisp_holiday13_flg.addAllListener(p);
		p.columnRsltDisp_holiday14_flg.addAllListener(p);
		p.columnRsltDisp_holiday15_flg.addAllListener(p);
		p.columnRsltDisp_holiday16_flg.addAllListener(p);
		p.columnRsltDisp_holiday17_flg.addAllListener(p);
		p.columnRsltDisp_holiday18_flg.addAllListener(p);
		p.columnRsltDisp_holiday19_flg.addAllListener(p);
		p.columnRsltDisp_holiday20_flg.addAllListener(p);
		p.columnRsltDisp_holiday21_flg.addAllListener(p);
		p.columnRsltDisp_holiday22_flg.addAllListener(p);
		p.columnRsltDisp_holiday23_flg.addAllListener(p);
		p.columnRsltDisp_holiday24_flg.addAllListener(p);
		p.columnRsltDisp_holiday25_flg.addAllListener(p);
		p.columnRsltDisp_holiday26_flg.addAllListener(p);
		p.columnRsltDisp_holiday27_flg.addAllListener(p);
		p.columnRsltDisp_holiday28_flg.addAllListener(p);
		p.columnRsltDisp_holiday29_flg.addAllListener(p);
		p.columnRsltDisp_holiday30_flg.addAllListener(p);
		p.columnRsltDisp_holiday31_flg.addAllListener(p);
		p.columnRsltDisp_holiday32_flg.addAllListener(p);
		p.columnRsltDisp_holiday33_flg.addAllListener(p);
		p.columnRsltDisp_holiday34_flg.addAllListener(p);
		p.columnRsltDisp_holiday35_flg.addAllListener(p);
		p.columnRsltDisp_holiday36_flg.addAllListener(p);
		p.columnRsltDisp_holiday37_flg.addAllListener(p);
		p.columnRsltDisp_holiday38_flg.addAllListener(p);
		p.columnRsltDisp_holiday39_flg.addAllListener(p);
		p.columnRsltDisp_holiday40_flg.addAllListener(p);
		p.columnRsltDisp_holiday41_flg.addAllListener(p);
		p.columnRsltDisp_holiday42_flg.addAllListener(p);
		p.columnRsltDisp_holiday43_flg.addAllListener(p);
		p.columnRsltDisp_holiday44_flg.addAllListener(p);
		p.columnRsltDisp_holiday45_flg.addAllListener(p);
		p.columnRsltDisp_holiday46_flg.addAllListener(p);
		p.columnRsltDisp_holiday47_flg.addAllListener(p);
		p.columnRsltDisp_holiday48_flg.addAllListener(p);
		p.columnRsltDisp_holiday49_flg.addAllListener(p);
		p.columnRsltDisp_holiday50_flg.addAllListener(p);
		p.columnRsltDisp_holiday51_flg.addAllListener(p);
		p.columnRsltDisp_holiday52_flg.addAllListener(p);
		p.columnRsltDisp_holiday53_flg.addAllListener(p);
		p.columnRsltDisp_holiday54_flg.addAllListener(p);
		p.columnRsltDisp_holiday55_flg.addAllListener(p);
		p.columnRsltDisp_holiday56_flg.addAllListener(p);
		p.columnRsltDisp_holiday57_flg.addAllListener(p);
		p.columnRsltDisp_holiday58_flg.addAllListener(p);
		p.columnRsltDisp_holiday59_flg.addAllListener(p);
		p.columnRsltDisp_holiday60_flg.addAllListener(p);
		p.columnRsltDisp_holiday61_flg.addAllListener(p);
		p.columnRsltDisp_holiday62_flg.addAllListener(p);
		p.columnRsltDisp_holiday63_flg.addAllListener(p);
		p.columnRsltDisp_holiday64_flg.addAllListener(p);
		p.columnRsltDisp_holiday65_flg.addAllListener(p);
		p.columnRsltDisp_holiday66_flg.addAllListener(p);
		p.columnRsltDisp_holiday67_flg.addAllListener(p);
		p.columnRsltDisp_holiday68_flg.addAllListener(p);
		p.columnRsltDisp_holiday69_flg.addAllListener(p);
		p.columnRsltDisp_holiday70_flg.addAllListener(p);
		p.columnRsltDisp_holiday71_flg.addAllListener(p);
		p.columnRsltDisp_holiday72_flg.addAllListener(p);
		p.columnRsltDisp_holiday73_flg.addAllListener(p);
		p.columnRsltDisp_holiday74_flg.addAllListener(p);
		p.columnRsltDisp_holiday75_flg.addAllListener(p);
		p.columnRsltDisp_holiday76_flg.addAllListener(p);
		p.columnRsltDisp_holiday77_flg.addAllListener(p);
		p.columnRsltDisp_holiday78_flg.addAllListener(p);
		p.columnRsltDisp_holiday79_flg.addAllListener(p);
		p.columnRsltDisp_holiday80_flg.addAllListener(p);
		p.columnRsltDisp_holiday81_flg.addAllListener(p);
		p.columnRsltDisp_holiday82_flg.addAllListener(p);
		p.columnRsltDisp_holiday83_flg.addAllListener(p);
		p.columnRsltDisp_holiday84_flg.addAllListener(p);
		p.columnRsltDisp_holiday85_flg.addAllListener(p);
		p.columnRsltDisp_holiday86_flg.addAllListener(p);
		p.columnRsltDisp_holiday87_flg.addAllListener(p);
		p.columnRsltDisp_holiday88_flg.addAllListener(p);
		p.columnRsltDisp_holiday89_flg.addAllListener(p);
		p.columnRsltDisp_holiday90_flg.addAllListener(p);
		p.columnRsltDisp_holiday91_flg.addAllListener(p);
		p.columnRsltDisp_holiday92_flg.addAllListener(p);
		p.columnRsltDisp_holiday93_flg.addAllListener(p);
		p.columnRsltDisp_mfg_loc_cd.addAllListener(p);
		p.columnRsltDisp_mfg_loc_cd.setListListener(p);
		p.columnRsltDisp_mfg_loc_nm.addAllListener(p);
		p.columnRsltDisp_mfg_loc_nm.setListListener(p);
		p.columnRsltDisp_wg_cd.addAllListener(p);
		p.columnRsltDisp_wg_cd.setListListener(p);
		p.columnRsltDisp_rsrc_cd.addAllListener(p);
		p.columnRsltDisp_rsrc_cd.setListListener(p);
		p.columnRsltDisp_rsrc_nm.addAllListener(p);
		p.columnRsltDisp_rsrc_nm.setListListener(p);
		p.columnRsltDisp_rsrc_unit_cd.addAllListener(p);
		p.columnRsltDisp_rsrc_unit_cd.setListListener(p);
		p.columnRsltDisp_rsrc_unit_nm.addAllListener(p);
		p.columnRsltDisp_rsrc_unit_nm.setListListener(p);
		p.columnRsltDisp_rsrc_dec_place.addAllListener(p);
		p.columnRsltDisp_rsrc_dec_place.setListListener(p);
		p.columnRsltDisp_disp_seq.addAllListener(p);
		p.columnRsltDisp_disp_seq.setListListener(p);
		p.columnRsltDisp_label_loc.addAllListener(p);
		p.columnRsltDisp_label_loc.setListListener(p);
		p.columnRsltDisp_label_rsrc.addAllListener(p);
		p.columnRsltDisp_label_rsrc.setListListener(p);
		p.columnRsltDisp_label_unit.addAllListener(p);
		p.columnRsltDisp_label_unit.setListListener(p);
		p.columnRsltDisp_record_id.addAllListener(p);
		p.columnRsltDisp_record_id.setListListener(p);
		p.columnRsltDisp_record_grp_id.addAllListener(p);
		p.columnRsltDisp_record_grp_id.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBCP_ItmOrdLdSrch p) {
		p.Btn_open_MSBCP0290.addAllListener(p);
		p.Btn_open_MSBCP0290.setAPMethodName("doBtn_open_MSBCP0290");
		p.Btn_open_MSBCP0050.addAllListener(p);
		p.Btn_open_MSBCP0050.setAPMethodName("doBtn_open_MSBCP0050");
		p.Btn_open_MSBCP0130.addAllListener(p);
		p.Btn_open_MSBCP0130.setAPMethodName("doBtn_open_MSBCP0130");
		p.Btn_open_MSBCP0160.addAllListener(p);
		p.Btn_open_MSBCP0160.setAPMethodName("doBtn_open_MSBCP0160");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBCP_ItmOrdLdSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBCP_ItmOrdLdSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd1(MSBCP_ItmOrdLdSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBCP_ItmOrdLdSrch p){
		p.Cnd_opn_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_inst_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_prcd_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sim_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sim_mrp_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dt_fr.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dt_to.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_base_qty_over_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_alert_qty_over_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_period_typ_label.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_period_typ_view_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_show_lab1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_show_sep1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_show_act_qty_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_show_base_qty_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_show_alert_qty_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_show_sep2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_show_label_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_show_code_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_show_name_flg.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MSBCP_ItmOrdLdSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBCP_ItmOrdLdSrch p){

	}

	/**
	 * [SRCH]ステータスの[RsltDisp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltDisp(MSBCP_ItmOrdLdSrch p){
		p.columnRsltDisp_label.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_code.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_name.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_row_title_col.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_row_title_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltDisp_qty01_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty02_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty03_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty04_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty05_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty06_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty07_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty08_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty09_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty10_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty11_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty12_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty13_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty14_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty15_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty16_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty17_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty18_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty19_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty20_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty21_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty22_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty23_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty24_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty25_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty26_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty27_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty28_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty29_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty30_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty31_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty32_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty33_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty34_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty35_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty36_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty37_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty38_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty39_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty40_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty41_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty42_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty43_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty44_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty45_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty46_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty47_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty48_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty49_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty50_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty51_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty52_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty53_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty54_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty55_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty56_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty57_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty58_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty59_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty60_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty61_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty62_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty63_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty64_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty65_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty66_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty67_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty68_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty69_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty70_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty71_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty72_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty73_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty74_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty75_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty76_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty77_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty78_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty79_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty80_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty81_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty82_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty83_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty84_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty85_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty86_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty87_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty88_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty89_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty90_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty91_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty92_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty93_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltDisp_holiday01_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday02_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday03_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday04_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday05_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday06_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday07_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday08_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday09_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday10_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday11_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday12_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday13_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday14_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday15_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday16_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday17_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday18_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday19_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday20_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday21_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday22_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday23_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday24_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday25_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday26_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday27_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday28_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday29_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday30_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday31_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday32_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday33_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday34_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday35_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday36_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday37_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday38_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday39_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday40_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday41_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday42_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday43_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday44_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday45_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday46_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday47_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday48_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday49_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday50_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday51_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday52_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday53_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday54_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday55_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday56_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday57_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday58_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday59_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday60_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday61_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday62_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday63_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday64_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday65_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday66_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday67_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday68_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday69_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday70_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday71_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday72_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday73_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday74_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday75_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday76_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday77_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday78_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday79_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday80_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday81_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday82_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday83_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday84_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday85_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday86_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday87_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday88_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday89_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday90_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday91_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday92_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday93_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_mfg_loc_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_mfg_loc_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_unit_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_unit_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_disp_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_label_loc.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_label_rsrc.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_label_unit.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_record_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_record_grp_id.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBCP_ItmOrdLdSrch p){

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBCP_ItmOrdLdSrch p){
		p.Btn_open_MSBCP0290.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBCP0050.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBCP0130.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBCP0160.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBCP_ItmOrdLdSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBCP_ItmOrdLdSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd1(MSBCP_ItmOrdLdSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBCP_ItmOrdLdSrch p){
		p.Cnd_opn_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_inst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_prcd_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sim_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sim_mrp_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dt_fr.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dt_to.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_base_qty_over_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_alert_qty_over_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_period_typ_label.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_period_typ_view_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_show_lab1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_show_sep1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_show_act_qty_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_show_base_qty_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_show_alert_qty_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_show_sep2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_show_label_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_show_code_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_show_name_flg.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MSBCP_ItmOrdLdSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBCP_ItmOrdLdSrch p){

	}

	/**
	 * [REF]ステータスの[RsltDisp]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltDisp(MSBCP_ItmOrdLdSrch p){
		p.columnRsltDisp_label.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltDisp_code.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltDisp_name.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltDisp_row_title_col.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_row_title_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltDisp_qty01_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty02_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty03_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty04_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty05_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty06_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty07_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty08_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty09_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty10_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty11_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty12_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty13_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty14_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty15_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty16_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty17_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty18_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty19_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty20_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty21_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty22_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty23_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty24_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty25_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty26_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty27_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty28_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty29_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty30_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty31_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty32_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty33_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty34_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty35_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty36_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty37_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty38_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty39_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty40_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty41_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty42_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty43_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty44_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty45_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty46_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty47_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty48_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty49_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty50_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty51_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty52_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty53_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty54_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty55_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty56_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty57_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty58_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty59_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty60_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty61_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty62_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty63_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty64_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty65_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty66_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty67_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty68_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty69_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty70_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty71_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty72_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty73_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty74_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty75_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty76_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty77_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty78_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty79_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty80_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty81_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty82_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty83_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty84_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty85_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty86_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty87_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty88_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty89_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty90_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty91_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty92_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.RsltDisp_qty93_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltDisp_holiday01_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday02_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday03_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday04_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday05_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday06_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday07_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday08_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday09_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday10_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday11_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday12_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday13_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday14_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday15_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday16_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday17_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday18_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday19_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday20_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday21_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday22_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday23_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday24_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday25_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday26_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday27_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday28_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday29_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday30_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday31_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday32_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday33_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday34_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday35_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday36_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday37_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday38_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday39_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday40_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday41_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday42_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday43_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday44_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday45_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday46_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday47_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday48_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday49_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday50_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday51_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday52_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday53_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday54_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday55_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday56_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday57_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday58_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday59_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday60_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday61_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday62_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday63_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday64_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday65_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday66_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday67_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday68_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday69_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday70_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday71_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday72_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday73_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday74_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday75_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday76_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday77_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday78_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday79_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday80_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday81_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday82_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday83_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday84_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday85_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday86_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday87_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday88_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday89_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday90_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday91_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday92_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_holiday93_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_mfg_loc_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_mfg_loc_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_unit_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_unit_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_disp_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_label_loc.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_label_rsrc.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_label_unit.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_record_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltDisp_record_grp_id.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBCP_ItmOrdLdSrch p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBCP_ItmOrdLdSrch p){
		p.Btn_open_MSBCP0290.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBCP0050.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBCP0130.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBCP0160.putMode(p, REF, MCMode.ENABLE);

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
		MSBCP_ItmOrdLdSrch_MC.setTableConfigRsltDisp((MSBCP_ItmOrdLdSrch)this);
	}

	/**
	 * [RsltDisp]ブロックのTableの設定
	 */
	protected static void setTableConfigRsltDisp(MSBCP_ItmOrdLdSrch p) {
		p.columnRsltDisp_label.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.label_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_label);
		p.columnRsltDisp_code.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.code_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_code);
		p.columnRsltDisp_name.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.name_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_name);
		p.columnRsltDisp_row_title_col.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.row_title_col_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_row_title_col);
		p.columnRsltDisp_row_title_nm.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.row_title_nm_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_row_title_nm);
		p.RsltDispTable.addTable(p.RsltDisp_qty01_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty02_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty03_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty04_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty05_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty06_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty07_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty08_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty09_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty10_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty11_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty12_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty13_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty14_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty15_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty16_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty17_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty18_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty19_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty20_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty21_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty22_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty23_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty24_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty25_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty26_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty27_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty28_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty29_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty30_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty31_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty32_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty33_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty34_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty35_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty36_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty37_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty38_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty39_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty40_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty41_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty42_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty43_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty44_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty45_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty46_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty47_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty48_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty49_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty50_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty51_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty52_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty53_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty54_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty55_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty56_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty57_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty58_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty59_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty60_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty61_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty62_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty63_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty64_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty65_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty66_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty67_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty68_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty69_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty70_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty71_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty72_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty73_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty74_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty75_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty76_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty77_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty78_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty79_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty80_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty81_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty82_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty83_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty84_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty85_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty86_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty87_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty88_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty89_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty90_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty91_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty92_p_PPanel.QtyTable);
		p.RsltDispTable.addTable(p.RsltDisp_qty93_p_PPanel.QtyTable);
		p.columnRsltDisp_holiday01_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday01_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday01_flg);
		p.columnRsltDisp_holiday02_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday02_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday02_flg);
		p.columnRsltDisp_holiday03_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday03_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday03_flg);
		p.columnRsltDisp_holiday04_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday04_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday04_flg);
		p.columnRsltDisp_holiday05_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday05_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday05_flg);
		p.columnRsltDisp_holiday06_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday06_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday06_flg);
		p.columnRsltDisp_holiday07_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday07_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday07_flg);
		p.columnRsltDisp_holiday08_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday08_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday08_flg);
		p.columnRsltDisp_holiday09_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday09_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday09_flg);
		p.columnRsltDisp_holiday10_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday10_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday10_flg);
		p.columnRsltDisp_holiday11_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday11_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday11_flg);
		p.columnRsltDisp_holiday12_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday12_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday12_flg);
		p.columnRsltDisp_holiday13_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday13_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday13_flg);
		p.columnRsltDisp_holiday14_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday14_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday14_flg);
		p.columnRsltDisp_holiday15_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday15_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday15_flg);
		p.columnRsltDisp_holiday16_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday16_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday16_flg);
		p.columnRsltDisp_holiday17_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday17_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday17_flg);
		p.columnRsltDisp_holiday18_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday18_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday18_flg);
		p.columnRsltDisp_holiday19_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday19_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday19_flg);
		p.columnRsltDisp_holiday20_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday20_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday20_flg);
		p.columnRsltDisp_holiday21_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday21_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday21_flg);
		p.columnRsltDisp_holiday22_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday22_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday22_flg);
		p.columnRsltDisp_holiday23_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday23_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday23_flg);
		p.columnRsltDisp_holiday24_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday24_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday24_flg);
		p.columnRsltDisp_holiday25_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday25_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday25_flg);
		p.columnRsltDisp_holiday26_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday26_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday26_flg);
		p.columnRsltDisp_holiday27_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday27_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday27_flg);
		p.columnRsltDisp_holiday28_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday28_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday28_flg);
		p.columnRsltDisp_holiday29_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday29_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday29_flg);
		p.columnRsltDisp_holiday30_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday30_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday30_flg);
		p.columnRsltDisp_holiday31_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday31_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday31_flg);
		p.columnRsltDisp_holiday32_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday32_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday32_flg);
		p.columnRsltDisp_holiday33_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday33_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday33_flg);
		p.columnRsltDisp_holiday34_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday34_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday34_flg);
		p.columnRsltDisp_holiday35_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday35_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday35_flg);
		p.columnRsltDisp_holiday36_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday36_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday36_flg);
		p.columnRsltDisp_holiday37_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday37_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday37_flg);
		p.columnRsltDisp_holiday38_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday38_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday38_flg);
		p.columnRsltDisp_holiday39_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday39_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday39_flg);
		p.columnRsltDisp_holiday40_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday40_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday40_flg);
		p.columnRsltDisp_holiday41_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday41_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday41_flg);
		p.columnRsltDisp_holiday42_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday42_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday42_flg);
		p.columnRsltDisp_holiday43_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday43_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday43_flg);
		p.columnRsltDisp_holiday44_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday44_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday44_flg);
		p.columnRsltDisp_holiday45_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday45_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday45_flg);
		p.columnRsltDisp_holiday46_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday46_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday46_flg);
		p.columnRsltDisp_holiday47_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday47_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday47_flg);
		p.columnRsltDisp_holiday48_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday48_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday48_flg);
		p.columnRsltDisp_holiday49_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday49_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday49_flg);
		p.columnRsltDisp_holiday50_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday50_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday50_flg);
		p.columnRsltDisp_holiday51_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday51_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday51_flg);
		p.columnRsltDisp_holiday52_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday52_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday52_flg);
		p.columnRsltDisp_holiday53_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday53_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday53_flg);
		p.columnRsltDisp_holiday54_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday54_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday54_flg);
		p.columnRsltDisp_holiday55_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday55_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday55_flg);
		p.columnRsltDisp_holiday56_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday56_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday56_flg);
		p.columnRsltDisp_holiday57_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday57_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday57_flg);
		p.columnRsltDisp_holiday58_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday58_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday58_flg);
		p.columnRsltDisp_holiday59_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday59_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday59_flg);
		p.columnRsltDisp_holiday60_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday60_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday60_flg);
		p.columnRsltDisp_holiday61_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday61_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday61_flg);
		p.columnRsltDisp_holiday62_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday62_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday62_flg);
		p.columnRsltDisp_holiday63_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday63_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday63_flg);
		p.columnRsltDisp_holiday64_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday64_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday64_flg);
		p.columnRsltDisp_holiday65_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday65_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday65_flg);
		p.columnRsltDisp_holiday66_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday66_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday66_flg);
		p.columnRsltDisp_holiday67_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday67_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday67_flg);
		p.columnRsltDisp_holiday68_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday68_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday68_flg);
		p.columnRsltDisp_holiday69_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday69_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday69_flg);
		p.columnRsltDisp_holiday70_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday70_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday70_flg);
		p.columnRsltDisp_holiday71_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday71_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday71_flg);
		p.columnRsltDisp_holiday72_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday72_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday72_flg);
		p.columnRsltDisp_holiday73_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday73_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday73_flg);
		p.columnRsltDisp_holiday74_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday74_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday74_flg);
		p.columnRsltDisp_holiday75_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday75_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday75_flg);
		p.columnRsltDisp_holiday76_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday76_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday76_flg);
		p.columnRsltDisp_holiday77_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday77_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday77_flg);
		p.columnRsltDisp_holiday78_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday78_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday78_flg);
		p.columnRsltDisp_holiday79_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday79_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday79_flg);
		p.columnRsltDisp_holiday80_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday80_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday80_flg);
		p.columnRsltDisp_holiday81_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday81_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday81_flg);
		p.columnRsltDisp_holiday82_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday82_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday82_flg);
		p.columnRsltDisp_holiday83_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday83_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday83_flg);
		p.columnRsltDisp_holiday84_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday84_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday84_flg);
		p.columnRsltDisp_holiday85_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday85_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday85_flg);
		p.columnRsltDisp_holiday86_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday86_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday86_flg);
		p.columnRsltDisp_holiday87_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday87_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday87_flg);
		p.columnRsltDisp_holiday88_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday88_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday88_flg);
		p.columnRsltDisp_holiday89_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday89_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday89_flg);
		p.columnRsltDisp_holiday90_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday90_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday90_flg);
		p.columnRsltDisp_holiday91_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday91_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday91_flg);
		p.columnRsltDisp_holiday92_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday92_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday92_flg);
		p.columnRsltDisp_holiday93_flg.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.holiday93_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_holiday93_flg);
		p.columnRsltDisp_mfg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.mfg_loc_cd_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_mfg_loc_cd);
		p.columnRsltDisp_mfg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.mfg_loc_nm_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_mfg_loc_nm);
		p.columnRsltDisp_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.wg_cd_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_wg_cd);
		p.columnRsltDisp_rsrc_cd.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.rsrc_cd_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rsrc_cd);
		p.columnRsltDisp_rsrc_nm.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.rsrc_nm_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rsrc_nm);
		p.columnRsltDisp_rsrc_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.rsrc_unit_cd_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rsrc_unit_cd);
		p.columnRsltDisp_rsrc_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.rsrc_unit_nm_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rsrc_unit_nm);
		p.columnRsltDisp_rsrc_dec_place.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.rsrc_dec_place_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rsrc_dec_place);
		p.columnRsltDisp_disp_seq.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.disp_seq_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_disp_seq);
		p.columnRsltDisp_label_loc.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.label_loc_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_label_loc);
		p.columnRsltDisp_label_rsrc.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.label_rsrc_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_label_rsrc);
		p.columnRsltDisp_label_unit.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.label_unit_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_label_unit);
		p.columnRsltDisp_record_id.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.record_id_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_record_id);
		p.columnRsltDisp_record_grp_id.setMeta(mcframe.clientMSBC.MSBCP0320.RsltDispR.record_grp_id_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_record_grp_id);
		// スクロール固定カラムの指定
		p.RsltDispTable.setUnscrollColumn(p.columnRsltDisp_row_title_nm);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_grp_cd.getListConfig().setPutter(getCnd_loc_grp_cd_ListPutter());
		Cnd_mfg_loc_cd.getListConfig().setPutter(getCnd_mfg_loc_cd_ListPutter());
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
	 * [Cnd_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Cnd_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_loc_grp_cd) return getCnd_loc_grp_cd(row, info);
		if(combo == Cnd_mfg_loc_cd) return getCnd_mfg_loc_cd(row, info);
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
		else if (ap == Btn_open_MSBCP0290) doBtn_open_MSBCP0290(info);
		else if (ap == Btn_open_MSBCP0050) doBtn_open_MSBCP0050(info);
		else if (ap == Btn_open_MSBCP0130) doBtn_open_MSBCP0130(info);
		else if (ap == Btn_open_MSBCP0160) doBtn_open_MSBCP0160(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0290]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0290(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0050]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0050(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0130]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0130(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0160]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0160(MCEventInfo info);

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
		if (vc == RsltDispTable) return doRsltDisp_VC(info);
		if (vc == Cnd_opn_flg) return doCnd_opn_flg_VC(info);
		if (vc == Cnd_sav_flg) return doCnd_sav_flg_VC(info);
		if (vc == Cnd_fix_flg) return doCnd_fix_flg_VC(info);
		if (vc == Cnd_inst_flg) return doCnd_inst_flg_VC(info);
		if (vc == Cnd_cmpl_flg) return doCnd_cmpl_flg_VC(info);
		if (vc == Cnd_prcd_flg) return doCnd_prcd_flg_VC(info);
		if (vc == Cnd_sim_flg) return doCnd_sim_flg_VC(info);
		if (vc == Cnd_sim_mrp_no) return doCnd_sim_mrp_no_VC(info);
		if (vc == Cnd_dt_fr) return doCnd_dt_fr_VC(info);
		if (vc == Cnd_dt_to) return doCnd_dt_to_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_loc_grp_cd) return doCnd_loc_grp_cd_VC(info);
		if (vc == Cnd_loc_grp_nm) return doCnd_loc_grp_nm_VC(info);
		if (vc == Cnd_mfg_loc_cd) return doCnd_mfg_loc_cd_VC(info);
		if (vc == Cnd_mfg_loc_nm) return doCnd_mfg_loc_nm_VC(info);
		if (vc == Cnd_base_qty_over_flg) return doCnd_base_qty_over_flg_VC(info);
		if (vc == Cnd_alert_qty_over_flg) return doCnd_alert_qty_over_flg_VC(info);
		if (vc == Cnd_period_typ_view_Group) return doCnd_period_typ_view_VC(info);
		if (vc == Cnd_show_act_qty_flg) return doCnd_show_act_qty_flg_VC(info);
		if (vc == Cnd_show_base_qty_flg) return doCnd_show_base_qty_flg_VC(info);
		if (vc == Cnd_show_alert_qty_flg) return doCnd_show_alert_qty_flg_VC(info);
		if (vc == Cnd_show_label_flg) return doCnd_show_label_flg_VC(info);
		if (vc == Cnd_show_code_flg) return doCnd_show_code_flg_VC(info);
		if (vc == Cnd_show_name_flg) return doCnd_show_name_flg_VC(info);
		if (vc == columnRsltDisp_label) return doRsltDisp_label_VC(info);
		if (vc == columnRsltDisp_code) return doRsltDisp_code_VC(info);
		if (vc == columnRsltDisp_name) return doRsltDisp_name_VC(info);
		if (vc == columnRsltDisp_row_title_col) return doRsltDisp_row_title_col_VC(info);
		if (vc == columnRsltDisp_row_title_nm) return doRsltDisp_row_title_nm_VC(info);
		if (vc == columnRsltDisp_holiday01_flg) return doRsltDisp_holiday01_flg_VC(info);
		if (vc == columnRsltDisp_holiday02_flg) return doRsltDisp_holiday02_flg_VC(info);
		if (vc == columnRsltDisp_holiday03_flg) return doRsltDisp_holiday03_flg_VC(info);
		if (vc == columnRsltDisp_holiday04_flg) return doRsltDisp_holiday04_flg_VC(info);
		if (vc == columnRsltDisp_holiday05_flg) return doRsltDisp_holiday05_flg_VC(info);
		if (vc == columnRsltDisp_holiday06_flg) return doRsltDisp_holiday06_flg_VC(info);
		if (vc == columnRsltDisp_holiday07_flg) return doRsltDisp_holiday07_flg_VC(info);
		if (vc == columnRsltDisp_holiday08_flg) return doRsltDisp_holiday08_flg_VC(info);
		if (vc == columnRsltDisp_holiday09_flg) return doRsltDisp_holiday09_flg_VC(info);
		if (vc == columnRsltDisp_holiday10_flg) return doRsltDisp_holiday10_flg_VC(info);
		if (vc == columnRsltDisp_holiday11_flg) return doRsltDisp_holiday11_flg_VC(info);
		if (vc == columnRsltDisp_holiday12_flg) return doRsltDisp_holiday12_flg_VC(info);
		if (vc == columnRsltDisp_holiday13_flg) return doRsltDisp_holiday13_flg_VC(info);
		if (vc == columnRsltDisp_holiday14_flg) return doRsltDisp_holiday14_flg_VC(info);
		if (vc == columnRsltDisp_holiday15_flg) return doRsltDisp_holiday15_flg_VC(info);
		if (vc == columnRsltDisp_holiday16_flg) return doRsltDisp_holiday16_flg_VC(info);
		if (vc == columnRsltDisp_holiday17_flg) return doRsltDisp_holiday17_flg_VC(info);
		if (vc == columnRsltDisp_holiday18_flg) return doRsltDisp_holiday18_flg_VC(info);
		if (vc == columnRsltDisp_holiday19_flg) return doRsltDisp_holiday19_flg_VC(info);
		if (vc == columnRsltDisp_holiday20_flg) return doRsltDisp_holiday20_flg_VC(info);
		if (vc == columnRsltDisp_holiday21_flg) return doRsltDisp_holiday21_flg_VC(info);
		if (vc == columnRsltDisp_holiday22_flg) return doRsltDisp_holiday22_flg_VC(info);
		if (vc == columnRsltDisp_holiday23_flg) return doRsltDisp_holiday23_flg_VC(info);
		if (vc == columnRsltDisp_holiday24_flg) return doRsltDisp_holiday24_flg_VC(info);
		if (vc == columnRsltDisp_holiday25_flg) return doRsltDisp_holiday25_flg_VC(info);
		if (vc == columnRsltDisp_holiday26_flg) return doRsltDisp_holiday26_flg_VC(info);
		if (vc == columnRsltDisp_holiday27_flg) return doRsltDisp_holiday27_flg_VC(info);
		if (vc == columnRsltDisp_holiday28_flg) return doRsltDisp_holiday28_flg_VC(info);
		if (vc == columnRsltDisp_holiday29_flg) return doRsltDisp_holiday29_flg_VC(info);
		if (vc == columnRsltDisp_holiday30_flg) return doRsltDisp_holiday30_flg_VC(info);
		if (vc == columnRsltDisp_holiday31_flg) return doRsltDisp_holiday31_flg_VC(info);
		if (vc == columnRsltDisp_holiday32_flg) return doRsltDisp_holiday32_flg_VC(info);
		if (vc == columnRsltDisp_holiday33_flg) return doRsltDisp_holiday33_flg_VC(info);
		if (vc == columnRsltDisp_holiday34_flg) return doRsltDisp_holiday34_flg_VC(info);
		if (vc == columnRsltDisp_holiday35_flg) return doRsltDisp_holiday35_flg_VC(info);
		if (vc == columnRsltDisp_holiday36_flg) return doRsltDisp_holiday36_flg_VC(info);
		if (vc == columnRsltDisp_holiday37_flg) return doRsltDisp_holiday37_flg_VC(info);
		if (vc == columnRsltDisp_holiday38_flg) return doRsltDisp_holiday38_flg_VC(info);
		if (vc == columnRsltDisp_holiday39_flg) return doRsltDisp_holiday39_flg_VC(info);
		if (vc == columnRsltDisp_holiday40_flg) return doRsltDisp_holiday40_flg_VC(info);
		if (vc == columnRsltDisp_holiday41_flg) return doRsltDisp_holiday41_flg_VC(info);
		if (vc == columnRsltDisp_holiday42_flg) return doRsltDisp_holiday42_flg_VC(info);
		if (vc == columnRsltDisp_holiday43_flg) return doRsltDisp_holiday43_flg_VC(info);
		if (vc == columnRsltDisp_holiday44_flg) return doRsltDisp_holiday44_flg_VC(info);
		if (vc == columnRsltDisp_holiday45_flg) return doRsltDisp_holiday45_flg_VC(info);
		if (vc == columnRsltDisp_holiday46_flg) return doRsltDisp_holiday46_flg_VC(info);
		if (vc == columnRsltDisp_holiday47_flg) return doRsltDisp_holiday47_flg_VC(info);
		if (vc == columnRsltDisp_holiday48_flg) return doRsltDisp_holiday48_flg_VC(info);
		if (vc == columnRsltDisp_holiday49_flg) return doRsltDisp_holiday49_flg_VC(info);
		if (vc == columnRsltDisp_holiday50_flg) return doRsltDisp_holiday50_flg_VC(info);
		if (vc == columnRsltDisp_holiday51_flg) return doRsltDisp_holiday51_flg_VC(info);
		if (vc == columnRsltDisp_holiday52_flg) return doRsltDisp_holiday52_flg_VC(info);
		if (vc == columnRsltDisp_holiday53_flg) return doRsltDisp_holiday53_flg_VC(info);
		if (vc == columnRsltDisp_holiday54_flg) return doRsltDisp_holiday54_flg_VC(info);
		if (vc == columnRsltDisp_holiday55_flg) return doRsltDisp_holiday55_flg_VC(info);
		if (vc == columnRsltDisp_holiday56_flg) return doRsltDisp_holiday56_flg_VC(info);
		if (vc == columnRsltDisp_holiday57_flg) return doRsltDisp_holiday57_flg_VC(info);
		if (vc == columnRsltDisp_holiday58_flg) return doRsltDisp_holiday58_flg_VC(info);
		if (vc == columnRsltDisp_holiday59_flg) return doRsltDisp_holiday59_flg_VC(info);
		if (vc == columnRsltDisp_holiday60_flg) return doRsltDisp_holiday60_flg_VC(info);
		if (vc == columnRsltDisp_holiday61_flg) return doRsltDisp_holiday61_flg_VC(info);
		if (vc == columnRsltDisp_holiday62_flg) return doRsltDisp_holiday62_flg_VC(info);
		if (vc == columnRsltDisp_holiday63_flg) return doRsltDisp_holiday63_flg_VC(info);
		if (vc == columnRsltDisp_holiday64_flg) return doRsltDisp_holiday64_flg_VC(info);
		if (vc == columnRsltDisp_holiday65_flg) return doRsltDisp_holiday65_flg_VC(info);
		if (vc == columnRsltDisp_holiday66_flg) return doRsltDisp_holiday66_flg_VC(info);
		if (vc == columnRsltDisp_holiday67_flg) return doRsltDisp_holiday67_flg_VC(info);
		if (vc == columnRsltDisp_holiday68_flg) return doRsltDisp_holiday68_flg_VC(info);
		if (vc == columnRsltDisp_holiday69_flg) return doRsltDisp_holiday69_flg_VC(info);
		if (vc == columnRsltDisp_holiday70_flg) return doRsltDisp_holiday70_flg_VC(info);
		if (vc == columnRsltDisp_holiday71_flg) return doRsltDisp_holiday71_flg_VC(info);
		if (vc == columnRsltDisp_holiday72_flg) return doRsltDisp_holiday72_flg_VC(info);
		if (vc == columnRsltDisp_holiday73_flg) return doRsltDisp_holiday73_flg_VC(info);
		if (vc == columnRsltDisp_holiday74_flg) return doRsltDisp_holiday74_flg_VC(info);
		if (vc == columnRsltDisp_holiday75_flg) return doRsltDisp_holiday75_flg_VC(info);
		if (vc == columnRsltDisp_holiday76_flg) return doRsltDisp_holiday76_flg_VC(info);
		if (vc == columnRsltDisp_holiday77_flg) return doRsltDisp_holiday77_flg_VC(info);
		if (vc == columnRsltDisp_holiday78_flg) return doRsltDisp_holiday78_flg_VC(info);
		if (vc == columnRsltDisp_holiday79_flg) return doRsltDisp_holiday79_flg_VC(info);
		if (vc == columnRsltDisp_holiday80_flg) return doRsltDisp_holiday80_flg_VC(info);
		if (vc == columnRsltDisp_holiday81_flg) return doRsltDisp_holiday81_flg_VC(info);
		if (vc == columnRsltDisp_holiday82_flg) return doRsltDisp_holiday82_flg_VC(info);
		if (vc == columnRsltDisp_holiday83_flg) return doRsltDisp_holiday83_flg_VC(info);
		if (vc == columnRsltDisp_holiday84_flg) return doRsltDisp_holiday84_flg_VC(info);
		if (vc == columnRsltDisp_holiday85_flg) return doRsltDisp_holiday85_flg_VC(info);
		if (vc == columnRsltDisp_holiday86_flg) return doRsltDisp_holiday86_flg_VC(info);
		if (vc == columnRsltDisp_holiday87_flg) return doRsltDisp_holiday87_flg_VC(info);
		if (vc == columnRsltDisp_holiday88_flg) return doRsltDisp_holiday88_flg_VC(info);
		if (vc == columnRsltDisp_holiday89_flg) return doRsltDisp_holiday89_flg_VC(info);
		if (vc == columnRsltDisp_holiday90_flg) return doRsltDisp_holiday90_flg_VC(info);
		if (vc == columnRsltDisp_holiday91_flg) return doRsltDisp_holiday91_flg_VC(info);
		if (vc == columnRsltDisp_holiday92_flg) return doRsltDisp_holiday92_flg_VC(info);
		if (vc == columnRsltDisp_holiday93_flg) return doRsltDisp_holiday93_flg_VC(info);
		if (vc == columnRsltDisp_mfg_loc_cd) return doRsltDisp_mfg_loc_cd_VC(info);
		if (vc == columnRsltDisp_mfg_loc_nm) return doRsltDisp_mfg_loc_nm_VC(info);
		if (vc == columnRsltDisp_wg_cd) return doRsltDisp_wg_cd_VC(info);
		if (vc == columnRsltDisp_rsrc_cd) return doRsltDisp_rsrc_cd_VC(info);
		if (vc == columnRsltDisp_rsrc_nm) return doRsltDisp_rsrc_nm_VC(info);
		if (vc == columnRsltDisp_rsrc_unit_cd) return doRsltDisp_rsrc_unit_cd_VC(info);
		if (vc == columnRsltDisp_rsrc_unit_nm) return doRsltDisp_rsrc_unit_nm_VC(info);
		if (vc == columnRsltDisp_rsrc_dec_place) return doRsltDisp_rsrc_dec_place_VC(info);
		if (vc == columnRsltDisp_disp_seq) return doRsltDisp_disp_seq_VC(info);
		if (vc == columnRsltDisp_label_loc) return doRsltDisp_label_loc_VC(info);
		if (vc == columnRsltDisp_label_rsrc) return doRsltDisp_label_rsrc_VC(info);
		if (vc == columnRsltDisp_label_unit) return doRsltDisp_label_unit_VC(info);
		if (vc == columnRsltDisp_record_id) return doRsltDisp_record_id_VC(info);
		if (vc == columnRsltDisp_record_grp_id) return doRsltDisp_record_grp_id_VC(info);
		return true;
	}

	/**
	 * [RsltDisp]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[opn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_opn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sav_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sav_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prcd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prcd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sim_mrp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[base_qty_over_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_base_qty_over_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alert_qty_over_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alert_qty_over_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[period_typ_view]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_period_typ_view_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[show_act_qty_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_show_act_qty_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[show_base_qty_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_show_base_qty_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[show_alert_qty_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_show_alert_qty_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[show_label_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_show_label_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[show_code_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_show_code_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[show_name_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_show_name_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[label]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_label_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[code]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_code_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[name]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_name_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[row_title_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_row_title_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[row_title_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_row_title_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday01_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday01_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday02_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday02_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday03_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday03_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday04_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday04_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday05_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday05_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday06_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday06_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday07_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday07_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday08_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday08_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday09_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday09_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday10_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday10_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday11_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday11_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday12_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday12_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday13_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday13_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday14_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday14_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday15_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday15_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday16_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday16_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday17_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday17_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday18_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday18_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday19_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday19_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday20_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday20_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday21_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday21_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday22_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday22_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday23_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday23_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday24_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday24_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday25_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday25_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday26_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday26_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday27_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday27_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday28_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday28_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday29_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday29_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday30_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday30_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday31_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday31_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday32_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday32_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday33_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday33_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday34_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday34_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday35_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday35_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday36_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday36_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday37_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday37_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday38_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday38_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday39_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday39_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday40_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday40_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday41_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday41_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday42_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday42_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday43_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday43_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday44_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday44_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday45_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday45_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday46_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday46_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday47_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday47_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday48_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday48_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday49_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday49_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday50_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday50_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday51_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday51_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday52_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday52_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday53_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday53_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday54_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday54_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday55_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday55_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday56_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday56_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday57_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday57_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday58_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday58_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday59_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday59_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday60_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday60_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday61_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday61_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday62_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday62_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday63_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday63_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday64_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday64_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday65_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday65_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday66_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday66_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday67_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday67_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday68_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday68_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday69_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday69_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday70_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday70_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday71_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday71_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday72_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday72_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday73_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday73_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday74_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday74_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday75_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday75_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday76_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday76_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday77_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday77_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday78_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday78_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday79_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday79_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday80_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday80_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday81_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday81_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday82_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday82_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday83_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday83_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday84_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday84_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday85_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday85_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday86_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday86_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday87_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday87_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday88_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday88_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday89_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday89_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday90_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday90_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday91_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday91_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday92_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday92_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[holiday93_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_holiday93_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rsrc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rsrc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rsrc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rsrc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rsrc_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rsrc_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rsrc_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rsrc_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[label_loc]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_label_loc_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[label_rsrc]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_label_rsrc_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[label_unit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_label_unit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[record_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_record_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[record_grp_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_record_grp_id_VC(MCEventInfo info){
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
		if (nc == RsltDispTable) doRsltDisp_NC(info);
		else if (nc == Cnd_opn_flg) doCnd_opn_flg_NC(info);
		else if (nc == Cnd_sav_flg) doCnd_sav_flg_NC(info);
		else if (nc == Cnd_fix_flg) doCnd_fix_flg_NC(info);
		else if (nc == Cnd_inst_flg) doCnd_inst_flg_NC(info);
		else if (nc == Cnd_cmpl_flg) doCnd_cmpl_flg_NC(info);
		else if (nc == Cnd_prcd_flg) doCnd_prcd_flg_NC(info);
		else if (nc == Cnd_sim_flg) doCnd_sim_flg_NC(info);
		else if (nc == Cnd_sim_mrp_no) doCnd_sim_mrp_no_NC(info);
		else if (nc == Cnd_dt_fr) doCnd_dt_fr_NC(info);
		else if (nc == Cnd_dt_to) doCnd_dt_to_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NC(info);
		else if (nc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NC(info);
		else if (nc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NC(info);
		else if (nc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NC(info);
		else if (nc == Cnd_base_qty_over_flg) doCnd_base_qty_over_flg_NC(info);
		else if (nc == Cnd_alert_qty_over_flg) doCnd_alert_qty_over_flg_NC(info);
		else if (nc == Cnd_period_typ_view_Group) doCnd_period_typ_view_NC(info);
		else if (nc == Cnd_show_act_qty_flg) doCnd_show_act_qty_flg_NC(info);
		else if (nc == Cnd_show_base_qty_flg) doCnd_show_base_qty_flg_NC(info);
		else if (nc == Cnd_show_alert_qty_flg) doCnd_show_alert_qty_flg_NC(info);
		else if (nc == Cnd_show_label_flg) doCnd_show_label_flg_NC(info);
		else if (nc == Cnd_show_code_flg) doCnd_show_code_flg_NC(info);
		else if (nc == Cnd_show_name_flg) doCnd_show_name_flg_NC(info);
		else if (nc == columnRsltDisp_label) doRsltDisp_label_NC(info);
		else if (nc == columnRsltDisp_code) doRsltDisp_code_NC(info);
		else if (nc == columnRsltDisp_name) doRsltDisp_name_NC(info);
		else if (nc == columnRsltDisp_row_title_col) doRsltDisp_row_title_col_NC(info);
		else if (nc == columnRsltDisp_row_title_nm) doRsltDisp_row_title_nm_NC(info);
		else if (nc == columnRsltDisp_holiday01_flg) doRsltDisp_holiday01_flg_NC(info);
		else if (nc == columnRsltDisp_holiday02_flg) doRsltDisp_holiday02_flg_NC(info);
		else if (nc == columnRsltDisp_holiday03_flg) doRsltDisp_holiday03_flg_NC(info);
		else if (nc == columnRsltDisp_holiday04_flg) doRsltDisp_holiday04_flg_NC(info);
		else if (nc == columnRsltDisp_holiday05_flg) doRsltDisp_holiday05_flg_NC(info);
		else if (nc == columnRsltDisp_holiday06_flg) doRsltDisp_holiday06_flg_NC(info);
		else if (nc == columnRsltDisp_holiday07_flg) doRsltDisp_holiday07_flg_NC(info);
		else if (nc == columnRsltDisp_holiday08_flg) doRsltDisp_holiday08_flg_NC(info);
		else if (nc == columnRsltDisp_holiday09_flg) doRsltDisp_holiday09_flg_NC(info);
		else if (nc == columnRsltDisp_holiday10_flg) doRsltDisp_holiday10_flg_NC(info);
		else if (nc == columnRsltDisp_holiday11_flg) doRsltDisp_holiday11_flg_NC(info);
		else if (nc == columnRsltDisp_holiday12_flg) doRsltDisp_holiday12_flg_NC(info);
		else if (nc == columnRsltDisp_holiday13_flg) doRsltDisp_holiday13_flg_NC(info);
		else if (nc == columnRsltDisp_holiday14_flg) doRsltDisp_holiday14_flg_NC(info);
		else if (nc == columnRsltDisp_holiday15_flg) doRsltDisp_holiday15_flg_NC(info);
		else if (nc == columnRsltDisp_holiday16_flg) doRsltDisp_holiday16_flg_NC(info);
		else if (nc == columnRsltDisp_holiday17_flg) doRsltDisp_holiday17_flg_NC(info);
		else if (nc == columnRsltDisp_holiday18_flg) doRsltDisp_holiday18_flg_NC(info);
		else if (nc == columnRsltDisp_holiday19_flg) doRsltDisp_holiday19_flg_NC(info);
		else if (nc == columnRsltDisp_holiday20_flg) doRsltDisp_holiday20_flg_NC(info);
		else if (nc == columnRsltDisp_holiday21_flg) doRsltDisp_holiday21_flg_NC(info);
		else if (nc == columnRsltDisp_holiday22_flg) doRsltDisp_holiday22_flg_NC(info);
		else if (nc == columnRsltDisp_holiday23_flg) doRsltDisp_holiday23_flg_NC(info);
		else if (nc == columnRsltDisp_holiday24_flg) doRsltDisp_holiday24_flg_NC(info);
		else if (nc == columnRsltDisp_holiday25_flg) doRsltDisp_holiday25_flg_NC(info);
		else if (nc == columnRsltDisp_holiday26_flg) doRsltDisp_holiday26_flg_NC(info);
		else if (nc == columnRsltDisp_holiday27_flg) doRsltDisp_holiday27_flg_NC(info);
		else if (nc == columnRsltDisp_holiday28_flg) doRsltDisp_holiday28_flg_NC(info);
		else if (nc == columnRsltDisp_holiday29_flg) doRsltDisp_holiday29_flg_NC(info);
		else if (nc == columnRsltDisp_holiday30_flg) doRsltDisp_holiday30_flg_NC(info);
		else if (nc == columnRsltDisp_holiday31_flg) doRsltDisp_holiday31_flg_NC(info);
		else if (nc == columnRsltDisp_holiday32_flg) doRsltDisp_holiday32_flg_NC(info);
		else if (nc == columnRsltDisp_holiday33_flg) doRsltDisp_holiday33_flg_NC(info);
		else if (nc == columnRsltDisp_holiday34_flg) doRsltDisp_holiday34_flg_NC(info);
		else if (nc == columnRsltDisp_holiday35_flg) doRsltDisp_holiday35_flg_NC(info);
		else if (nc == columnRsltDisp_holiday36_flg) doRsltDisp_holiday36_flg_NC(info);
		else if (nc == columnRsltDisp_holiday37_flg) doRsltDisp_holiday37_flg_NC(info);
		else if (nc == columnRsltDisp_holiday38_flg) doRsltDisp_holiday38_flg_NC(info);
		else if (nc == columnRsltDisp_holiday39_flg) doRsltDisp_holiday39_flg_NC(info);
		else if (nc == columnRsltDisp_holiday40_flg) doRsltDisp_holiday40_flg_NC(info);
		else if (nc == columnRsltDisp_holiday41_flg) doRsltDisp_holiday41_flg_NC(info);
		else if (nc == columnRsltDisp_holiday42_flg) doRsltDisp_holiday42_flg_NC(info);
		else if (nc == columnRsltDisp_holiday43_flg) doRsltDisp_holiday43_flg_NC(info);
		else if (nc == columnRsltDisp_holiday44_flg) doRsltDisp_holiday44_flg_NC(info);
		else if (nc == columnRsltDisp_holiday45_flg) doRsltDisp_holiday45_flg_NC(info);
		else if (nc == columnRsltDisp_holiday46_flg) doRsltDisp_holiday46_flg_NC(info);
		else if (nc == columnRsltDisp_holiday47_flg) doRsltDisp_holiday47_flg_NC(info);
		else if (nc == columnRsltDisp_holiday48_flg) doRsltDisp_holiday48_flg_NC(info);
		else if (nc == columnRsltDisp_holiday49_flg) doRsltDisp_holiday49_flg_NC(info);
		else if (nc == columnRsltDisp_holiday50_flg) doRsltDisp_holiday50_flg_NC(info);
		else if (nc == columnRsltDisp_holiday51_flg) doRsltDisp_holiday51_flg_NC(info);
		else if (nc == columnRsltDisp_holiday52_flg) doRsltDisp_holiday52_flg_NC(info);
		else if (nc == columnRsltDisp_holiday53_flg) doRsltDisp_holiday53_flg_NC(info);
		else if (nc == columnRsltDisp_holiday54_flg) doRsltDisp_holiday54_flg_NC(info);
		else if (nc == columnRsltDisp_holiday55_flg) doRsltDisp_holiday55_flg_NC(info);
		else if (nc == columnRsltDisp_holiday56_flg) doRsltDisp_holiday56_flg_NC(info);
		else if (nc == columnRsltDisp_holiday57_flg) doRsltDisp_holiday57_flg_NC(info);
		else if (nc == columnRsltDisp_holiday58_flg) doRsltDisp_holiday58_flg_NC(info);
		else if (nc == columnRsltDisp_holiday59_flg) doRsltDisp_holiday59_flg_NC(info);
		else if (nc == columnRsltDisp_holiday60_flg) doRsltDisp_holiday60_flg_NC(info);
		else if (nc == columnRsltDisp_holiday61_flg) doRsltDisp_holiday61_flg_NC(info);
		else if (nc == columnRsltDisp_holiday62_flg) doRsltDisp_holiday62_flg_NC(info);
		else if (nc == columnRsltDisp_holiday63_flg) doRsltDisp_holiday63_flg_NC(info);
		else if (nc == columnRsltDisp_holiday64_flg) doRsltDisp_holiday64_flg_NC(info);
		else if (nc == columnRsltDisp_holiday65_flg) doRsltDisp_holiday65_flg_NC(info);
		else if (nc == columnRsltDisp_holiday66_flg) doRsltDisp_holiday66_flg_NC(info);
		else if (nc == columnRsltDisp_holiday67_flg) doRsltDisp_holiday67_flg_NC(info);
		else if (nc == columnRsltDisp_holiday68_flg) doRsltDisp_holiday68_flg_NC(info);
		else if (nc == columnRsltDisp_holiday69_flg) doRsltDisp_holiday69_flg_NC(info);
		else if (nc == columnRsltDisp_holiday70_flg) doRsltDisp_holiday70_flg_NC(info);
		else if (nc == columnRsltDisp_holiday71_flg) doRsltDisp_holiday71_flg_NC(info);
		else if (nc == columnRsltDisp_holiday72_flg) doRsltDisp_holiday72_flg_NC(info);
		else if (nc == columnRsltDisp_holiday73_flg) doRsltDisp_holiday73_flg_NC(info);
		else if (nc == columnRsltDisp_holiday74_flg) doRsltDisp_holiday74_flg_NC(info);
		else if (nc == columnRsltDisp_holiday75_flg) doRsltDisp_holiday75_flg_NC(info);
		else if (nc == columnRsltDisp_holiday76_flg) doRsltDisp_holiday76_flg_NC(info);
		else if (nc == columnRsltDisp_holiday77_flg) doRsltDisp_holiday77_flg_NC(info);
		else if (nc == columnRsltDisp_holiday78_flg) doRsltDisp_holiday78_flg_NC(info);
		else if (nc == columnRsltDisp_holiday79_flg) doRsltDisp_holiday79_flg_NC(info);
		else if (nc == columnRsltDisp_holiday80_flg) doRsltDisp_holiday80_flg_NC(info);
		else if (nc == columnRsltDisp_holiday81_flg) doRsltDisp_holiday81_flg_NC(info);
		else if (nc == columnRsltDisp_holiday82_flg) doRsltDisp_holiday82_flg_NC(info);
		else if (nc == columnRsltDisp_holiday83_flg) doRsltDisp_holiday83_flg_NC(info);
		else if (nc == columnRsltDisp_holiday84_flg) doRsltDisp_holiday84_flg_NC(info);
		else if (nc == columnRsltDisp_holiday85_flg) doRsltDisp_holiday85_flg_NC(info);
		else if (nc == columnRsltDisp_holiday86_flg) doRsltDisp_holiday86_flg_NC(info);
		else if (nc == columnRsltDisp_holiday87_flg) doRsltDisp_holiday87_flg_NC(info);
		else if (nc == columnRsltDisp_holiday88_flg) doRsltDisp_holiday88_flg_NC(info);
		else if (nc == columnRsltDisp_holiday89_flg) doRsltDisp_holiday89_flg_NC(info);
		else if (nc == columnRsltDisp_holiday90_flg) doRsltDisp_holiday90_flg_NC(info);
		else if (nc == columnRsltDisp_holiday91_flg) doRsltDisp_holiday91_flg_NC(info);
		else if (nc == columnRsltDisp_holiday92_flg) doRsltDisp_holiday92_flg_NC(info);
		else if (nc == columnRsltDisp_holiday93_flg) doRsltDisp_holiday93_flg_NC(info);
		else if (nc == columnRsltDisp_mfg_loc_cd) doRsltDisp_mfg_loc_cd_NC(info);
		else if (nc == columnRsltDisp_mfg_loc_nm) doRsltDisp_mfg_loc_nm_NC(info);
		else if (nc == columnRsltDisp_wg_cd) doRsltDisp_wg_cd_NC(info);
		else if (nc == columnRsltDisp_rsrc_cd) doRsltDisp_rsrc_cd_NC(info);
		else if (nc == columnRsltDisp_rsrc_nm) doRsltDisp_rsrc_nm_NC(info);
		else if (nc == columnRsltDisp_rsrc_unit_cd) doRsltDisp_rsrc_unit_cd_NC(info);
		else if (nc == columnRsltDisp_rsrc_unit_nm) doRsltDisp_rsrc_unit_nm_NC(info);
		else if (nc == columnRsltDisp_rsrc_dec_place) doRsltDisp_rsrc_dec_place_NC(info);
		else if (nc == columnRsltDisp_disp_seq) doRsltDisp_disp_seq_NC(info);
		else if (nc == columnRsltDisp_label_loc) doRsltDisp_label_loc_NC(info);
		else if (nc == columnRsltDisp_label_rsrc) doRsltDisp_label_rsrc_NC(info);
		else if (nc == columnRsltDisp_label_unit) doRsltDisp_label_unit_NC(info);
		else if (nc == columnRsltDisp_record_id) doRsltDisp_record_id_NC(info);
		else if (nc == columnRsltDisp_record_grp_id) doRsltDisp_record_grp_id_NC(info);
	}

	/**
	 * [RsltDisp]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[opn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sav_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sav_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prcd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prcd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_qty_over_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_qty_over_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alert_qty_over_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alert_qty_over_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[period_typ_view]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_period_typ_view_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_act_qty_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_act_qty_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_base_qty_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_base_qty_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_alert_qty_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_alert_qty_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_label_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_label_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_code_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_code_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_name_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_name_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[code]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_code_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[name]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_name_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[row_title_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_row_title_col_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[row_title_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_row_title_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday01_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday01_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday02_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday02_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday03_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday03_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday04_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday04_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday05_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday05_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday06_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday06_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday07_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday07_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday08_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday08_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday09_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday09_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday10_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday10_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday11_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday11_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday12_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday12_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday13_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday13_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday14_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday14_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday15_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday15_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday16_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday16_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday17_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday17_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday18_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday18_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday19_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday19_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday20_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday20_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday21_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday21_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday22_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday22_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday23_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday23_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday24_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday24_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday25_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday25_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday26_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday26_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday27_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday27_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday28_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday28_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday29_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday29_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday30_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday30_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday31_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday31_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday32_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday32_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday33_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday33_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday34_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday34_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday35_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday35_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday36_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday36_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday37_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday37_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday38_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday38_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday39_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday39_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday40_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday40_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday41_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday41_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday42_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday42_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday43_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday43_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday44_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday44_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday45_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday45_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday46_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday46_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday47_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday47_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday48_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday48_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday49_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday49_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday50_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday50_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday51_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday51_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday52_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday52_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday53_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday53_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday54_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday54_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday55_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday55_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday56_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday56_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday57_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday57_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday58_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday58_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday59_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday59_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday60_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday60_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday61_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday61_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday62_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday62_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday63_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday63_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday64_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday64_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday65_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday65_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday66_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday66_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday67_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday67_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday68_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday68_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday69_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday69_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday70_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday70_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday71_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday71_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday72_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday72_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday73_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday73_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday74_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday74_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday75_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday75_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday76_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday76_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday77_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday77_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday78_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday78_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday79_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday79_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday80_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday80_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday81_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday81_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday82_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday82_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday83_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday83_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday84_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday84_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday85_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday85_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday86_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday86_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday87_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday87_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday88_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday88_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday89_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday89_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday90_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday90_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday91_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday91_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday92_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday92_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday93_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday93_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label_loc]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_loc_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label_rsrc]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_rsrc_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label_unit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_unit_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[record_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_record_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[record_grp_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_record_grp_id_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltDispTable) doRsltDisp_NE(info);
		else if (ne == Cnd_opn_flg) doCnd_opn_flg_NE(info);
		else if (ne == Cnd_sav_flg) doCnd_sav_flg_NE(info);
		else if (ne == Cnd_fix_flg) doCnd_fix_flg_NE(info);
		else if (ne == Cnd_inst_flg) doCnd_inst_flg_NE(info);
		else if (ne == Cnd_cmpl_flg) doCnd_cmpl_flg_NE(info);
		else if (ne == Cnd_prcd_flg) doCnd_prcd_flg_NE(info);
		else if (ne == Cnd_sim_flg) doCnd_sim_flg_NE(info);
		else if (ne == Cnd_sim_mrp_no) doCnd_sim_mrp_no_NE(info);
		else if (ne == Cnd_dt_fr) doCnd_dt_fr_NE(info);
		else if (ne == Cnd_dt_to) doCnd_dt_to_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NE(info);
		else if (ne == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NE(info);
		else if (ne == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NE(info);
		else if (ne == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NE(info);
		else if (ne == Cnd_base_qty_over_flg) doCnd_base_qty_over_flg_NE(info);
		else if (ne == Cnd_alert_qty_over_flg) doCnd_alert_qty_over_flg_NE(info);
		else if (ne == Cnd_period_typ_view_Group) doCnd_period_typ_view_NE(info);
		else if (ne == Cnd_show_act_qty_flg) doCnd_show_act_qty_flg_NE(info);
		else if (ne == Cnd_show_base_qty_flg) doCnd_show_base_qty_flg_NE(info);
		else if (ne == Cnd_show_alert_qty_flg) doCnd_show_alert_qty_flg_NE(info);
		else if (ne == Cnd_show_label_flg) doCnd_show_label_flg_NE(info);
		else if (ne == Cnd_show_code_flg) doCnd_show_code_flg_NE(info);
		else if (ne == Cnd_show_name_flg) doCnd_show_name_flg_NE(info);
		else if (ne == columnRsltDisp_label) doRsltDisp_label_NE(info);
		else if (ne == columnRsltDisp_code) doRsltDisp_code_NE(info);
		else if (ne == columnRsltDisp_name) doRsltDisp_name_NE(info);
		else if (ne == columnRsltDisp_row_title_col) doRsltDisp_row_title_col_NE(info);
		else if (ne == columnRsltDisp_row_title_nm) doRsltDisp_row_title_nm_NE(info);
		else if (ne == columnRsltDisp_holiday01_flg) doRsltDisp_holiday01_flg_NE(info);
		else if (ne == columnRsltDisp_holiday02_flg) doRsltDisp_holiday02_flg_NE(info);
		else if (ne == columnRsltDisp_holiday03_flg) doRsltDisp_holiday03_flg_NE(info);
		else if (ne == columnRsltDisp_holiday04_flg) doRsltDisp_holiday04_flg_NE(info);
		else if (ne == columnRsltDisp_holiday05_flg) doRsltDisp_holiday05_flg_NE(info);
		else if (ne == columnRsltDisp_holiday06_flg) doRsltDisp_holiday06_flg_NE(info);
		else if (ne == columnRsltDisp_holiday07_flg) doRsltDisp_holiday07_flg_NE(info);
		else if (ne == columnRsltDisp_holiday08_flg) doRsltDisp_holiday08_flg_NE(info);
		else if (ne == columnRsltDisp_holiday09_flg) doRsltDisp_holiday09_flg_NE(info);
		else if (ne == columnRsltDisp_holiday10_flg) doRsltDisp_holiday10_flg_NE(info);
		else if (ne == columnRsltDisp_holiday11_flg) doRsltDisp_holiday11_flg_NE(info);
		else if (ne == columnRsltDisp_holiday12_flg) doRsltDisp_holiday12_flg_NE(info);
		else if (ne == columnRsltDisp_holiday13_flg) doRsltDisp_holiday13_flg_NE(info);
		else if (ne == columnRsltDisp_holiday14_flg) doRsltDisp_holiday14_flg_NE(info);
		else if (ne == columnRsltDisp_holiday15_flg) doRsltDisp_holiday15_flg_NE(info);
		else if (ne == columnRsltDisp_holiday16_flg) doRsltDisp_holiday16_flg_NE(info);
		else if (ne == columnRsltDisp_holiday17_flg) doRsltDisp_holiday17_flg_NE(info);
		else if (ne == columnRsltDisp_holiday18_flg) doRsltDisp_holiday18_flg_NE(info);
		else if (ne == columnRsltDisp_holiday19_flg) doRsltDisp_holiday19_flg_NE(info);
		else if (ne == columnRsltDisp_holiday20_flg) doRsltDisp_holiday20_flg_NE(info);
		else if (ne == columnRsltDisp_holiday21_flg) doRsltDisp_holiday21_flg_NE(info);
		else if (ne == columnRsltDisp_holiday22_flg) doRsltDisp_holiday22_flg_NE(info);
		else if (ne == columnRsltDisp_holiday23_flg) doRsltDisp_holiday23_flg_NE(info);
		else if (ne == columnRsltDisp_holiday24_flg) doRsltDisp_holiday24_flg_NE(info);
		else if (ne == columnRsltDisp_holiday25_flg) doRsltDisp_holiday25_flg_NE(info);
		else if (ne == columnRsltDisp_holiday26_flg) doRsltDisp_holiday26_flg_NE(info);
		else if (ne == columnRsltDisp_holiday27_flg) doRsltDisp_holiday27_flg_NE(info);
		else if (ne == columnRsltDisp_holiday28_flg) doRsltDisp_holiday28_flg_NE(info);
		else if (ne == columnRsltDisp_holiday29_flg) doRsltDisp_holiday29_flg_NE(info);
		else if (ne == columnRsltDisp_holiday30_flg) doRsltDisp_holiday30_flg_NE(info);
		else if (ne == columnRsltDisp_holiday31_flg) doRsltDisp_holiday31_flg_NE(info);
		else if (ne == columnRsltDisp_holiday32_flg) doRsltDisp_holiday32_flg_NE(info);
		else if (ne == columnRsltDisp_holiday33_flg) doRsltDisp_holiday33_flg_NE(info);
		else if (ne == columnRsltDisp_holiday34_flg) doRsltDisp_holiday34_flg_NE(info);
		else if (ne == columnRsltDisp_holiday35_flg) doRsltDisp_holiday35_flg_NE(info);
		else if (ne == columnRsltDisp_holiday36_flg) doRsltDisp_holiday36_flg_NE(info);
		else if (ne == columnRsltDisp_holiday37_flg) doRsltDisp_holiday37_flg_NE(info);
		else if (ne == columnRsltDisp_holiday38_flg) doRsltDisp_holiday38_flg_NE(info);
		else if (ne == columnRsltDisp_holiday39_flg) doRsltDisp_holiday39_flg_NE(info);
		else if (ne == columnRsltDisp_holiday40_flg) doRsltDisp_holiday40_flg_NE(info);
		else if (ne == columnRsltDisp_holiday41_flg) doRsltDisp_holiday41_flg_NE(info);
		else if (ne == columnRsltDisp_holiday42_flg) doRsltDisp_holiday42_flg_NE(info);
		else if (ne == columnRsltDisp_holiday43_flg) doRsltDisp_holiday43_flg_NE(info);
		else if (ne == columnRsltDisp_holiday44_flg) doRsltDisp_holiday44_flg_NE(info);
		else if (ne == columnRsltDisp_holiday45_flg) doRsltDisp_holiday45_flg_NE(info);
		else if (ne == columnRsltDisp_holiday46_flg) doRsltDisp_holiday46_flg_NE(info);
		else if (ne == columnRsltDisp_holiday47_flg) doRsltDisp_holiday47_flg_NE(info);
		else if (ne == columnRsltDisp_holiday48_flg) doRsltDisp_holiday48_flg_NE(info);
		else if (ne == columnRsltDisp_holiday49_flg) doRsltDisp_holiday49_flg_NE(info);
		else if (ne == columnRsltDisp_holiday50_flg) doRsltDisp_holiday50_flg_NE(info);
		else if (ne == columnRsltDisp_holiday51_flg) doRsltDisp_holiday51_flg_NE(info);
		else if (ne == columnRsltDisp_holiday52_flg) doRsltDisp_holiday52_flg_NE(info);
		else if (ne == columnRsltDisp_holiday53_flg) doRsltDisp_holiday53_flg_NE(info);
		else if (ne == columnRsltDisp_holiday54_flg) doRsltDisp_holiday54_flg_NE(info);
		else if (ne == columnRsltDisp_holiday55_flg) doRsltDisp_holiday55_flg_NE(info);
		else if (ne == columnRsltDisp_holiday56_flg) doRsltDisp_holiday56_flg_NE(info);
		else if (ne == columnRsltDisp_holiday57_flg) doRsltDisp_holiday57_flg_NE(info);
		else if (ne == columnRsltDisp_holiday58_flg) doRsltDisp_holiday58_flg_NE(info);
		else if (ne == columnRsltDisp_holiday59_flg) doRsltDisp_holiday59_flg_NE(info);
		else if (ne == columnRsltDisp_holiday60_flg) doRsltDisp_holiday60_flg_NE(info);
		else if (ne == columnRsltDisp_holiday61_flg) doRsltDisp_holiday61_flg_NE(info);
		else if (ne == columnRsltDisp_holiday62_flg) doRsltDisp_holiday62_flg_NE(info);
		else if (ne == columnRsltDisp_holiday63_flg) doRsltDisp_holiday63_flg_NE(info);
		else if (ne == columnRsltDisp_holiday64_flg) doRsltDisp_holiday64_flg_NE(info);
		else if (ne == columnRsltDisp_holiday65_flg) doRsltDisp_holiday65_flg_NE(info);
		else if (ne == columnRsltDisp_holiday66_flg) doRsltDisp_holiday66_flg_NE(info);
		else if (ne == columnRsltDisp_holiday67_flg) doRsltDisp_holiday67_flg_NE(info);
		else if (ne == columnRsltDisp_holiday68_flg) doRsltDisp_holiday68_flg_NE(info);
		else if (ne == columnRsltDisp_holiday69_flg) doRsltDisp_holiday69_flg_NE(info);
		else if (ne == columnRsltDisp_holiday70_flg) doRsltDisp_holiday70_flg_NE(info);
		else if (ne == columnRsltDisp_holiday71_flg) doRsltDisp_holiday71_flg_NE(info);
		else if (ne == columnRsltDisp_holiday72_flg) doRsltDisp_holiday72_flg_NE(info);
		else if (ne == columnRsltDisp_holiday73_flg) doRsltDisp_holiday73_flg_NE(info);
		else if (ne == columnRsltDisp_holiday74_flg) doRsltDisp_holiday74_flg_NE(info);
		else if (ne == columnRsltDisp_holiday75_flg) doRsltDisp_holiday75_flg_NE(info);
		else if (ne == columnRsltDisp_holiday76_flg) doRsltDisp_holiday76_flg_NE(info);
		else if (ne == columnRsltDisp_holiday77_flg) doRsltDisp_holiday77_flg_NE(info);
		else if (ne == columnRsltDisp_holiday78_flg) doRsltDisp_holiday78_flg_NE(info);
		else if (ne == columnRsltDisp_holiday79_flg) doRsltDisp_holiday79_flg_NE(info);
		else if (ne == columnRsltDisp_holiday80_flg) doRsltDisp_holiday80_flg_NE(info);
		else if (ne == columnRsltDisp_holiday81_flg) doRsltDisp_holiday81_flg_NE(info);
		else if (ne == columnRsltDisp_holiday82_flg) doRsltDisp_holiday82_flg_NE(info);
		else if (ne == columnRsltDisp_holiday83_flg) doRsltDisp_holiday83_flg_NE(info);
		else if (ne == columnRsltDisp_holiday84_flg) doRsltDisp_holiday84_flg_NE(info);
		else if (ne == columnRsltDisp_holiday85_flg) doRsltDisp_holiday85_flg_NE(info);
		else if (ne == columnRsltDisp_holiday86_flg) doRsltDisp_holiday86_flg_NE(info);
		else if (ne == columnRsltDisp_holiday87_flg) doRsltDisp_holiday87_flg_NE(info);
		else if (ne == columnRsltDisp_holiday88_flg) doRsltDisp_holiday88_flg_NE(info);
		else if (ne == columnRsltDisp_holiday89_flg) doRsltDisp_holiday89_flg_NE(info);
		else if (ne == columnRsltDisp_holiday90_flg) doRsltDisp_holiday90_flg_NE(info);
		else if (ne == columnRsltDisp_holiday91_flg) doRsltDisp_holiday91_flg_NE(info);
		else if (ne == columnRsltDisp_holiday92_flg) doRsltDisp_holiday92_flg_NE(info);
		else if (ne == columnRsltDisp_holiday93_flg) doRsltDisp_holiday93_flg_NE(info);
		else if (ne == columnRsltDisp_mfg_loc_cd) doRsltDisp_mfg_loc_cd_NE(info);
		else if (ne == columnRsltDisp_mfg_loc_nm) doRsltDisp_mfg_loc_nm_NE(info);
		else if (ne == columnRsltDisp_wg_cd) doRsltDisp_wg_cd_NE(info);
		else if (ne == columnRsltDisp_rsrc_cd) doRsltDisp_rsrc_cd_NE(info);
		else if (ne == columnRsltDisp_rsrc_nm) doRsltDisp_rsrc_nm_NE(info);
		else if (ne == columnRsltDisp_rsrc_unit_cd) doRsltDisp_rsrc_unit_cd_NE(info);
		else if (ne == columnRsltDisp_rsrc_unit_nm) doRsltDisp_rsrc_unit_nm_NE(info);
		else if (ne == columnRsltDisp_rsrc_dec_place) doRsltDisp_rsrc_dec_place_NE(info);
		else if (ne == columnRsltDisp_disp_seq) doRsltDisp_disp_seq_NE(info);
		else if (ne == columnRsltDisp_label_loc) doRsltDisp_label_loc_NE(info);
		else if (ne == columnRsltDisp_label_rsrc) doRsltDisp_label_rsrc_NE(info);
		else if (ne == columnRsltDisp_label_unit) doRsltDisp_label_unit_NE(info);
		else if (ne == columnRsltDisp_record_id) doRsltDisp_record_id_NE(info);
		else if (ne == columnRsltDisp_record_grp_id) doRsltDisp_record_grp_id_NE(info);
	}

	/**
	 * [RsltDisp]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[opn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sav_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sav_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prcd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prcd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_qty_over_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_qty_over_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alert_qty_over_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alert_qty_over_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[period_typ_view]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_period_typ_view_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_act_qty_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_act_qty_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_base_qty_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_base_qty_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_alert_qty_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_alert_qty_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_label_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_label_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_code_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_code_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_name_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_name_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[code]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_code_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[name]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_name_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[row_title_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_row_title_col_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[row_title_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_row_title_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday01_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday01_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday02_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday02_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday03_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday03_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday04_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday04_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday05_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday05_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday06_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday06_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday07_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday07_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday08_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday08_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday09_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday09_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday10_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday10_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday11_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday11_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday12_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday12_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday13_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday13_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday14_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday14_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday15_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday15_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday16_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday16_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday17_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday17_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday18_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday18_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday19_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday19_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday20_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday20_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday21_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday21_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday22_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday22_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday23_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday23_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday24_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday24_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday25_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday25_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday26_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday26_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday27_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday27_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday28_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday28_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday29_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday29_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday30_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday30_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday31_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday31_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday32_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday32_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday33_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday33_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday34_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday34_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday35_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday35_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday36_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday36_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday37_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday37_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday38_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday38_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday39_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday39_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday40_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday40_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday41_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday41_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday42_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday42_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday43_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday43_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday44_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday44_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday45_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday45_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday46_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday46_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday47_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday47_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday48_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday48_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday49_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday49_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday50_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday50_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday51_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday51_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday52_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday52_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday53_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday53_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday54_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday54_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday55_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday55_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday56_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday56_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday57_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday57_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday58_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday58_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday59_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday59_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday60_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday60_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday61_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday61_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday62_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday62_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday63_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday63_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday64_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday64_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday65_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday65_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday66_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday66_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday67_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday67_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday68_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday68_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday69_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday69_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday70_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday70_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday71_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday71_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday72_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday72_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday73_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday73_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday74_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday74_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday75_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday75_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday76_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday76_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday77_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday77_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday78_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday78_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday79_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday79_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday80_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday80_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday81_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday81_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday82_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday82_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday83_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday83_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday84_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday84_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday85_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday85_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday86_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday86_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday87_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday87_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday88_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday88_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday89_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday89_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday90_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday90_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday91_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday91_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday92_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday92_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday93_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday93_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label_loc]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_loc_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label_rsrc]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_rsrc_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label_unit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_unit_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[record_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_record_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[record_grp_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_record_grp_id_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltDispTable) doRsltDisp_NX(info);
		else if (nx == Cnd_opn_flg) doCnd_opn_flg_NX(info);
		else if (nx == Cnd_sav_flg) doCnd_sav_flg_NX(info);
		else if (nx == Cnd_fix_flg) doCnd_fix_flg_NX(info);
		else if (nx == Cnd_inst_flg) doCnd_inst_flg_NX(info);
		else if (nx == Cnd_cmpl_flg) doCnd_cmpl_flg_NX(info);
		else if (nx == Cnd_prcd_flg) doCnd_prcd_flg_NX(info);
		else if (nx == Cnd_sim_flg) doCnd_sim_flg_NX(info);
		else if (nx == Cnd_sim_mrp_no) doCnd_sim_mrp_no_NX(info);
		else if (nx == Cnd_dt_fr) doCnd_dt_fr_NX(info);
		else if (nx == Cnd_dt_to) doCnd_dt_to_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NX(info);
		else if (nx == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NX(info);
		else if (nx == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NX(info);
		else if (nx == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NX(info);
		else if (nx == Cnd_base_qty_over_flg) doCnd_base_qty_over_flg_NX(info);
		else if (nx == Cnd_alert_qty_over_flg) doCnd_alert_qty_over_flg_NX(info);
		else if (nx == Cnd_period_typ_view_Group) doCnd_period_typ_view_NX(info);
		else if (nx == Cnd_show_act_qty_flg) doCnd_show_act_qty_flg_NX(info);
		else if (nx == Cnd_show_base_qty_flg) doCnd_show_base_qty_flg_NX(info);
		else if (nx == Cnd_show_alert_qty_flg) doCnd_show_alert_qty_flg_NX(info);
		else if (nx == Cnd_show_label_flg) doCnd_show_label_flg_NX(info);
		else if (nx == Cnd_show_code_flg) doCnd_show_code_flg_NX(info);
		else if (nx == Cnd_show_name_flg) doCnd_show_name_flg_NX(info);
		else if (nx == columnRsltDisp_label) doRsltDisp_label_NX(info);
		else if (nx == columnRsltDisp_code) doRsltDisp_code_NX(info);
		else if (nx == columnRsltDisp_name) doRsltDisp_name_NX(info);
		else if (nx == columnRsltDisp_row_title_col) doRsltDisp_row_title_col_NX(info);
		else if (nx == columnRsltDisp_row_title_nm) doRsltDisp_row_title_nm_NX(info);
		else if (nx == columnRsltDisp_holiday01_flg) doRsltDisp_holiday01_flg_NX(info);
		else if (nx == columnRsltDisp_holiday02_flg) doRsltDisp_holiday02_flg_NX(info);
		else if (nx == columnRsltDisp_holiday03_flg) doRsltDisp_holiday03_flg_NX(info);
		else if (nx == columnRsltDisp_holiday04_flg) doRsltDisp_holiday04_flg_NX(info);
		else if (nx == columnRsltDisp_holiday05_flg) doRsltDisp_holiday05_flg_NX(info);
		else if (nx == columnRsltDisp_holiday06_flg) doRsltDisp_holiday06_flg_NX(info);
		else if (nx == columnRsltDisp_holiday07_flg) doRsltDisp_holiday07_flg_NX(info);
		else if (nx == columnRsltDisp_holiday08_flg) doRsltDisp_holiday08_flg_NX(info);
		else if (nx == columnRsltDisp_holiday09_flg) doRsltDisp_holiday09_flg_NX(info);
		else if (nx == columnRsltDisp_holiday10_flg) doRsltDisp_holiday10_flg_NX(info);
		else if (nx == columnRsltDisp_holiday11_flg) doRsltDisp_holiday11_flg_NX(info);
		else if (nx == columnRsltDisp_holiday12_flg) doRsltDisp_holiday12_flg_NX(info);
		else if (nx == columnRsltDisp_holiday13_flg) doRsltDisp_holiday13_flg_NX(info);
		else if (nx == columnRsltDisp_holiday14_flg) doRsltDisp_holiday14_flg_NX(info);
		else if (nx == columnRsltDisp_holiday15_flg) doRsltDisp_holiday15_flg_NX(info);
		else if (nx == columnRsltDisp_holiday16_flg) doRsltDisp_holiday16_flg_NX(info);
		else if (nx == columnRsltDisp_holiday17_flg) doRsltDisp_holiday17_flg_NX(info);
		else if (nx == columnRsltDisp_holiday18_flg) doRsltDisp_holiday18_flg_NX(info);
		else if (nx == columnRsltDisp_holiday19_flg) doRsltDisp_holiday19_flg_NX(info);
		else if (nx == columnRsltDisp_holiday20_flg) doRsltDisp_holiday20_flg_NX(info);
		else if (nx == columnRsltDisp_holiday21_flg) doRsltDisp_holiday21_flg_NX(info);
		else if (nx == columnRsltDisp_holiday22_flg) doRsltDisp_holiday22_flg_NX(info);
		else if (nx == columnRsltDisp_holiday23_flg) doRsltDisp_holiday23_flg_NX(info);
		else if (nx == columnRsltDisp_holiday24_flg) doRsltDisp_holiday24_flg_NX(info);
		else if (nx == columnRsltDisp_holiday25_flg) doRsltDisp_holiday25_flg_NX(info);
		else if (nx == columnRsltDisp_holiday26_flg) doRsltDisp_holiday26_flg_NX(info);
		else if (nx == columnRsltDisp_holiday27_flg) doRsltDisp_holiday27_flg_NX(info);
		else if (nx == columnRsltDisp_holiday28_flg) doRsltDisp_holiday28_flg_NX(info);
		else if (nx == columnRsltDisp_holiday29_flg) doRsltDisp_holiday29_flg_NX(info);
		else if (nx == columnRsltDisp_holiday30_flg) doRsltDisp_holiday30_flg_NX(info);
		else if (nx == columnRsltDisp_holiday31_flg) doRsltDisp_holiday31_flg_NX(info);
		else if (nx == columnRsltDisp_holiday32_flg) doRsltDisp_holiday32_flg_NX(info);
		else if (nx == columnRsltDisp_holiday33_flg) doRsltDisp_holiday33_flg_NX(info);
		else if (nx == columnRsltDisp_holiday34_flg) doRsltDisp_holiday34_flg_NX(info);
		else if (nx == columnRsltDisp_holiday35_flg) doRsltDisp_holiday35_flg_NX(info);
		else if (nx == columnRsltDisp_holiday36_flg) doRsltDisp_holiday36_flg_NX(info);
		else if (nx == columnRsltDisp_holiday37_flg) doRsltDisp_holiday37_flg_NX(info);
		else if (nx == columnRsltDisp_holiday38_flg) doRsltDisp_holiday38_flg_NX(info);
		else if (nx == columnRsltDisp_holiday39_flg) doRsltDisp_holiday39_flg_NX(info);
		else if (nx == columnRsltDisp_holiday40_flg) doRsltDisp_holiday40_flg_NX(info);
		else if (nx == columnRsltDisp_holiday41_flg) doRsltDisp_holiday41_flg_NX(info);
		else if (nx == columnRsltDisp_holiday42_flg) doRsltDisp_holiday42_flg_NX(info);
		else if (nx == columnRsltDisp_holiday43_flg) doRsltDisp_holiday43_flg_NX(info);
		else if (nx == columnRsltDisp_holiday44_flg) doRsltDisp_holiday44_flg_NX(info);
		else if (nx == columnRsltDisp_holiday45_flg) doRsltDisp_holiday45_flg_NX(info);
		else if (nx == columnRsltDisp_holiday46_flg) doRsltDisp_holiday46_flg_NX(info);
		else if (nx == columnRsltDisp_holiday47_flg) doRsltDisp_holiday47_flg_NX(info);
		else if (nx == columnRsltDisp_holiday48_flg) doRsltDisp_holiday48_flg_NX(info);
		else if (nx == columnRsltDisp_holiday49_flg) doRsltDisp_holiday49_flg_NX(info);
		else if (nx == columnRsltDisp_holiday50_flg) doRsltDisp_holiday50_flg_NX(info);
		else if (nx == columnRsltDisp_holiday51_flg) doRsltDisp_holiday51_flg_NX(info);
		else if (nx == columnRsltDisp_holiday52_flg) doRsltDisp_holiday52_flg_NX(info);
		else if (nx == columnRsltDisp_holiday53_flg) doRsltDisp_holiday53_flg_NX(info);
		else if (nx == columnRsltDisp_holiday54_flg) doRsltDisp_holiday54_flg_NX(info);
		else if (nx == columnRsltDisp_holiday55_flg) doRsltDisp_holiday55_flg_NX(info);
		else if (nx == columnRsltDisp_holiday56_flg) doRsltDisp_holiday56_flg_NX(info);
		else if (nx == columnRsltDisp_holiday57_flg) doRsltDisp_holiday57_flg_NX(info);
		else if (nx == columnRsltDisp_holiday58_flg) doRsltDisp_holiday58_flg_NX(info);
		else if (nx == columnRsltDisp_holiday59_flg) doRsltDisp_holiday59_flg_NX(info);
		else if (nx == columnRsltDisp_holiday60_flg) doRsltDisp_holiday60_flg_NX(info);
		else if (nx == columnRsltDisp_holiday61_flg) doRsltDisp_holiday61_flg_NX(info);
		else if (nx == columnRsltDisp_holiday62_flg) doRsltDisp_holiday62_flg_NX(info);
		else if (nx == columnRsltDisp_holiday63_flg) doRsltDisp_holiday63_flg_NX(info);
		else if (nx == columnRsltDisp_holiday64_flg) doRsltDisp_holiday64_flg_NX(info);
		else if (nx == columnRsltDisp_holiday65_flg) doRsltDisp_holiday65_flg_NX(info);
		else if (nx == columnRsltDisp_holiday66_flg) doRsltDisp_holiday66_flg_NX(info);
		else if (nx == columnRsltDisp_holiday67_flg) doRsltDisp_holiday67_flg_NX(info);
		else if (nx == columnRsltDisp_holiday68_flg) doRsltDisp_holiday68_flg_NX(info);
		else if (nx == columnRsltDisp_holiday69_flg) doRsltDisp_holiday69_flg_NX(info);
		else if (nx == columnRsltDisp_holiday70_flg) doRsltDisp_holiday70_flg_NX(info);
		else if (nx == columnRsltDisp_holiday71_flg) doRsltDisp_holiday71_flg_NX(info);
		else if (nx == columnRsltDisp_holiday72_flg) doRsltDisp_holiday72_flg_NX(info);
		else if (nx == columnRsltDisp_holiday73_flg) doRsltDisp_holiday73_flg_NX(info);
		else if (nx == columnRsltDisp_holiday74_flg) doRsltDisp_holiday74_flg_NX(info);
		else if (nx == columnRsltDisp_holiday75_flg) doRsltDisp_holiday75_flg_NX(info);
		else if (nx == columnRsltDisp_holiday76_flg) doRsltDisp_holiday76_flg_NX(info);
		else if (nx == columnRsltDisp_holiday77_flg) doRsltDisp_holiday77_flg_NX(info);
		else if (nx == columnRsltDisp_holiday78_flg) doRsltDisp_holiday78_flg_NX(info);
		else if (nx == columnRsltDisp_holiday79_flg) doRsltDisp_holiday79_flg_NX(info);
		else if (nx == columnRsltDisp_holiday80_flg) doRsltDisp_holiday80_flg_NX(info);
		else if (nx == columnRsltDisp_holiday81_flg) doRsltDisp_holiday81_flg_NX(info);
		else if (nx == columnRsltDisp_holiday82_flg) doRsltDisp_holiday82_flg_NX(info);
		else if (nx == columnRsltDisp_holiday83_flg) doRsltDisp_holiday83_flg_NX(info);
		else if (nx == columnRsltDisp_holiday84_flg) doRsltDisp_holiday84_flg_NX(info);
		else if (nx == columnRsltDisp_holiday85_flg) doRsltDisp_holiday85_flg_NX(info);
		else if (nx == columnRsltDisp_holiday86_flg) doRsltDisp_holiday86_flg_NX(info);
		else if (nx == columnRsltDisp_holiday87_flg) doRsltDisp_holiday87_flg_NX(info);
		else if (nx == columnRsltDisp_holiday88_flg) doRsltDisp_holiday88_flg_NX(info);
		else if (nx == columnRsltDisp_holiday89_flg) doRsltDisp_holiday89_flg_NX(info);
		else if (nx == columnRsltDisp_holiday90_flg) doRsltDisp_holiday90_flg_NX(info);
		else if (nx == columnRsltDisp_holiday91_flg) doRsltDisp_holiday91_flg_NX(info);
		else if (nx == columnRsltDisp_holiday92_flg) doRsltDisp_holiday92_flg_NX(info);
		else if (nx == columnRsltDisp_holiday93_flg) doRsltDisp_holiday93_flg_NX(info);
		else if (nx == columnRsltDisp_mfg_loc_cd) doRsltDisp_mfg_loc_cd_NX(info);
		else if (nx == columnRsltDisp_mfg_loc_nm) doRsltDisp_mfg_loc_nm_NX(info);
		else if (nx == columnRsltDisp_wg_cd) doRsltDisp_wg_cd_NX(info);
		else if (nx == columnRsltDisp_rsrc_cd) doRsltDisp_rsrc_cd_NX(info);
		else if (nx == columnRsltDisp_rsrc_nm) doRsltDisp_rsrc_nm_NX(info);
		else if (nx == columnRsltDisp_rsrc_unit_cd) doRsltDisp_rsrc_unit_cd_NX(info);
		else if (nx == columnRsltDisp_rsrc_unit_nm) doRsltDisp_rsrc_unit_nm_NX(info);
		else if (nx == columnRsltDisp_rsrc_dec_place) doRsltDisp_rsrc_dec_place_NX(info);
		else if (nx == columnRsltDisp_disp_seq) doRsltDisp_disp_seq_NX(info);
		else if (nx == columnRsltDisp_label_loc) doRsltDisp_label_loc_NX(info);
		else if (nx == columnRsltDisp_label_rsrc) doRsltDisp_label_rsrc_NX(info);
		else if (nx == columnRsltDisp_label_unit) doRsltDisp_label_unit_NX(info);
		else if (nx == columnRsltDisp_record_id) doRsltDisp_record_id_NX(info);
		else if (nx == columnRsltDisp_record_grp_id) doRsltDisp_record_grp_id_NX(info);
	}

	/**
	 * [RsltDisp]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[opn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sav_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sav_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prcd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prcd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_qty_over_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_qty_over_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alert_qty_over_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alert_qty_over_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[period_typ_view]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_period_typ_view_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_act_qty_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_act_qty_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_base_qty_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_base_qty_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_alert_qty_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_alert_qty_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_label_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_label_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_code_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_code_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[show_name_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_show_name_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[code]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_code_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[name]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_name_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[row_title_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_row_title_col_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[row_title_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_row_title_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday01_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday01_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday02_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday02_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday03_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday03_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday04_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday04_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday05_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday05_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday06_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday06_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday07_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday07_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday08_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday08_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday09_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday09_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday10_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday10_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday11_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday11_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday12_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday12_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday13_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday13_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday14_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday14_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday15_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday15_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday16_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday16_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday17_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday17_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday18_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday18_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday19_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday19_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday20_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday20_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday21_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday21_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday22_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday22_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday23_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday23_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday24_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday24_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday25_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday25_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday26_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday26_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday27_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday27_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday28_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday28_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday29_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday29_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday30_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday30_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday31_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday31_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday32_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday32_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday33_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday33_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday34_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday34_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday35_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday35_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday36_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday36_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday37_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday37_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday38_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday38_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday39_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday39_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday40_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday40_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday41_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday41_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday42_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday42_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday43_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday43_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday44_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday44_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday45_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday45_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday46_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday46_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday47_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday47_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday48_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday48_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday49_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday49_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday50_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday50_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday51_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday51_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday52_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday52_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday53_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday53_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday54_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday54_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday55_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday55_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday56_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday56_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday57_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday57_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday58_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday58_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday59_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday59_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday60_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday60_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday61_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday61_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday62_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday62_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday63_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday63_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday64_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday64_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday65_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday65_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday66_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday66_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday67_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday67_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday68_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday68_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday69_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday69_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday70_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday70_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday71_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday71_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday72_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday72_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday73_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday73_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday74_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday74_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday75_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday75_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday76_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday76_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday77_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday77_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday78_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday78_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday79_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday79_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday80_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday80_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday81_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday81_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday82_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday82_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday83_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday83_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday84_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday84_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday85_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday85_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday86_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday86_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday87_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday87_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday88_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday88_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday89_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday89_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday90_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday90_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday91_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday91_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday92_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday92_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[holiday93_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_holiday93_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label_loc]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_loc_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label_rsrc]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_rsrc_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label_unit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_unit_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[record_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_record_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[record_grp_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_record_grp_id_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_sim_mrp_no) doCnd_sim_mrp_no_LC(info);
		else if (lc == Cnd_dt_fr) doCnd_dt_fr_LC(info);
		else if (lc == Cnd_dt_to) doCnd_dt_to_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_LC(info);
		else if (lc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_LC(info);
		else if (lc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_LC(info);
		else if (lc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_LC(info);
		else if (lc == columnRsltDisp_label) doRsltDisp_label_LC(info);
		else if (lc == columnRsltDisp_code) doRsltDisp_code_LC(info);
		else if (lc == columnRsltDisp_name) doRsltDisp_name_LC(info);
		else if (lc == columnRsltDisp_row_title_col) doRsltDisp_row_title_col_LC(info);
		else if (lc == columnRsltDisp_row_title_nm) doRsltDisp_row_title_nm_LC(info);
		else if (lc == columnRsltDisp_mfg_loc_cd) doRsltDisp_mfg_loc_cd_LC(info);
		else if (lc == columnRsltDisp_mfg_loc_nm) doRsltDisp_mfg_loc_nm_LC(info);
		else if (lc == columnRsltDisp_wg_cd) doRsltDisp_wg_cd_LC(info);
		else if (lc == columnRsltDisp_rsrc_cd) doRsltDisp_rsrc_cd_LC(info);
		else if (lc == columnRsltDisp_rsrc_nm) doRsltDisp_rsrc_nm_LC(info);
		else if (lc == columnRsltDisp_rsrc_unit_cd) doRsltDisp_rsrc_unit_cd_LC(info);
		else if (lc == columnRsltDisp_rsrc_unit_nm) doRsltDisp_rsrc_unit_nm_LC(info);
		else if (lc == columnRsltDisp_rsrc_dec_place) doRsltDisp_rsrc_dec_place_LC(info);
		else if (lc == columnRsltDisp_disp_seq) doRsltDisp_disp_seq_LC(info);
		else if (lc == columnRsltDisp_label_loc) doRsltDisp_label_loc_LC(info);
		else if (lc == columnRsltDisp_label_rsrc) doRsltDisp_label_rsrc_LC(info);
		else if (lc == columnRsltDisp_label_unit) doRsltDisp_label_unit_LC(info);
		else if (lc == columnRsltDisp_record_id) doRsltDisp_record_id_LC(info);
		else if (lc == columnRsltDisp_record_grp_id) doRsltDisp_record_grp_id_LC(info);
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[code]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_code_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[name]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_name_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[row_title_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_row_title_col_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[row_title_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_row_title_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label_loc]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_loc_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label_rsrc]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_rsrc_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[label_unit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_label_unit_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[record_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_record_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[record_grp_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_record_grp_id_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL0320.Srch01")) {
			return new MS_MSBCL0320_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL0320_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0320_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0320_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL0320_Srch01Bridge() {
			p_MS_MSBCL0320_Srch01 = new MCParam(PDef.MS_MSBCL0320_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0320_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0320.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0320.RsltR.class));

			p_MS_MSBCL0320_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0320_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0320_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0320_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0320_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0320.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0320.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0320.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0320.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0320_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0320.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0320_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0320.RsltR>)p_MS_MSBCL0320_Srch01.getContainerParam().getDownBlock(0));
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