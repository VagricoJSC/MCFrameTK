package mcframe.clientMGBF.MGBFP0430;

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
import mcframe.clientMGBF.MGBFP0430.MGBFP_WipLocYmSrch_MC.MG_MGBFL0430_Srch01Caller;
import mcframe.clientMGBF.MGBFP0430.MGBFP_WipLocYmSrch_MC.MG_MGBFL0430_Srch02Caller;

/**
 * 画面"MGBFP_WipLocYmSrch"パネルクラスです。<p>
 *
 * 月別に部門及び場所別の仕掛・発生・完成原価情報を参照する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFP_WipLocYmSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBFP0430";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * LOC,Location,0;DPT,Dept. hierarchy,1 LOC,場所,0;DPT,部門階層,1.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_LOC = null;
	public MCRadioButton Cnd_ope_DPT = null;
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
	public MCLabel Cnd_dpt_lvl_cd_Label = null;
	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_dpt_lvl_cd = null;
	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_lvl_nm = null;
	public MCLabel Cnd_mng_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mng_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_mng_dpt_nm = null;
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
	 * Dept. 部門.<p>
	 *
	 */
	public MCCheckBox Cnd_mng_dpt_flg = null;
	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public MCCheckBox Cnd_site_flg = null;
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
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_cur_cd = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Cnd_amt_dec_place = null;
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
	public MCTable2<mcframe.clientMGBF.MGBFP0430.DispRsltR> DispRsltTable = null;
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
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_mng_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnDispRslt_mng_dpt_nm = null;
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
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_00_p_PPanel;
	public MCColumnConfig columnDispRslt_col_00;// [DispRslt]の[amt_00_p.amt]を[columnDispRslt_col_00]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_01_p_PPanel;
	public MCColumnConfig columnDispRslt_col_01;// [DispRslt]の[amt_01_p.amt]を[columnDispRslt_col_01]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_02_p_PPanel;
	public MCColumnConfig columnDispRslt_col_02;// [DispRslt]の[amt_02_p.amt]を[columnDispRslt_col_02]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_03_p_PPanel;
	public MCColumnConfig columnDispRslt_col_03;// [DispRslt]の[amt_03_p.amt]を[columnDispRslt_col_03]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_04_p_PPanel;
	public MCColumnConfig columnDispRslt_col_04;// [DispRslt]の[amt_04_p.amt]を[columnDispRslt_col_04]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_05_p_PPanel;
	public MCColumnConfig columnDispRslt_col_05;// [DispRslt]の[amt_05_p.amt]を[columnDispRslt_col_05]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_06_p_PPanel;
	public MCColumnConfig columnDispRslt_col_06;// [DispRslt]の[amt_06_p.amt]を[columnDispRslt_col_06]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_07_p_PPanel;
	public MCColumnConfig columnDispRslt_col_07;// [DispRslt]の[amt_07_p.amt]を[columnDispRslt_col_07]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_08_p_PPanel;
	public MCColumnConfig columnDispRslt_col_08;// [DispRslt]の[amt_08_p.amt]を[columnDispRslt_col_08]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_09_p_PPanel;
	public MCColumnConfig columnDispRslt_col_09;// [DispRslt]の[amt_09_p.amt]を[columnDispRslt_col_09]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_10_p_PPanel;
	public MCColumnConfig columnDispRslt_col_10;// [DispRslt]の[amt_10_p.amt]を[columnDispRslt_col_10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_11_p_PPanel;
	public MCColumnConfig columnDispRslt_col_11;// [DispRslt]の[amt_11_p.amt]を[columnDispRslt_col_11]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_12_p_PPanel;
	public MCColumnConfig columnDispRslt_col_12;// [DispRslt]の[amt_12_p.amt]を[columnDispRslt_col_12]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_13_p_PPanel;
	public MCColumnConfig columnDispRslt_col_13;// [DispRslt]の[amt_13_p.amt]を[columnDispRslt_col_13]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_14_p_PPanel;
	public MCColumnConfig columnDispRslt_col_14;// [DispRslt]の[amt_14_p.amt]を[columnDispRslt_col_14]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_15_p_PPanel;
	public MCColumnConfig columnDispRslt_col_15;// [DispRslt]の[amt_15_p.amt]を[columnDispRslt_col_15]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_16_p_PPanel;
	public MCColumnConfig columnDispRslt_col_16;// [DispRslt]の[amt_16_p.amt]を[columnDispRslt_col_16]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_17_p_PPanel;
	public MCColumnConfig columnDispRslt_col_17;// [DispRslt]の[amt_17_p.amt]を[columnDispRslt_col_17]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_18_p_PPanel;
	public MCColumnConfig columnDispRslt_col_18;// [DispRslt]の[amt_18_p.amt]を[columnDispRslt_col_18]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_19_p_PPanel;
	public MCColumnConfig columnDispRslt_col_19;// [DispRslt]の[amt_19_p.amt]を[columnDispRslt_col_19]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_20_p_PPanel;
	public MCColumnConfig columnDispRslt_col_20;// [DispRslt]の[amt_20_p.amt]を[columnDispRslt_col_20]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_21_p_PPanel;
	public MCColumnConfig columnDispRslt_col_21;// [DispRslt]の[amt_21_p.amt]を[columnDispRslt_col_21]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_22_p_PPanel;
	public MCColumnConfig columnDispRslt_col_22;// [DispRslt]の[amt_22_p.amt]を[columnDispRslt_col_22]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_23_p_PPanel;
	public MCColumnConfig columnDispRslt_col_23;// [DispRslt]の[amt_23_p.amt]を[columnDispRslt_col_23]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_24_p_PPanel;
	public MCColumnConfig columnDispRslt_col_24;// [DispRslt]の[amt_24_p.amt]を[columnDispRslt_col_24]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_25_p_PPanel;
	public MCColumnConfig columnDispRslt_col_25;// [DispRslt]の[amt_25_p.amt]を[columnDispRslt_col_25]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_26_p_PPanel;
	public MCColumnConfig columnDispRslt_col_26;// [DispRslt]の[amt_26_p.amt]を[columnDispRslt_col_26]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_27_p_PPanel;
	public MCColumnConfig columnDispRslt_col_27;// [DispRslt]の[amt_27_p.amt]を[columnDispRslt_col_27]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_28_p_PPanel;
	public MCColumnConfig columnDispRslt_col_28;// [DispRslt]の[amt_28_p.amt]を[columnDispRslt_col_28]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_29_p_PPanel;
	public MCColumnConfig columnDispRslt_col_29;// [DispRslt]の[amt_29_p.amt]を[columnDispRslt_col_29]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_30_p_PPanel;
	public MCColumnConfig columnDispRslt_col_30;// [DispRslt]の[amt_30_p.amt]を[columnDispRslt_col_30]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_31_p_PPanel;
	public MCColumnConfig columnDispRslt_col_31;// [DispRslt]の[amt_31_p.amt]を[columnDispRslt_col_31]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_32_p_PPanel;
	public MCColumnConfig columnDispRslt_col_32;// [DispRslt]の[amt_32_p.amt]を[columnDispRslt_col_32]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_33_p_PPanel;
	public MCColumnConfig columnDispRslt_col_33;// [DispRslt]の[amt_33_p.amt]を[columnDispRslt_col_33]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_34_p_PPanel;
	public MCColumnConfig columnDispRslt_col_34;// [DispRslt]の[amt_34_p.amt]を[columnDispRslt_col_34]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_35_p_PPanel;
	public MCColumnConfig columnDispRslt_col_35;// [DispRslt]の[amt_35_p.amt]を[columnDispRslt_col_35]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_36_p_PPanel;
	public MCColumnConfig columnDispRslt_col_36;// [DispRslt]の[amt_36_p.amt]を[columnDispRslt_col_36]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_37_p_PPanel;
	public MCColumnConfig columnDispRslt_col_37;// [DispRslt]の[amt_37_p.amt]を[columnDispRslt_col_37]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_38_p_PPanel;
	public MCColumnConfig columnDispRslt_col_38;// [DispRslt]の[amt_38_p.amt]を[columnDispRslt_col_38]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_39_p_PPanel;
	public MCColumnConfig columnDispRslt_col_39;// [DispRslt]の[amt_39_p.amt]を[columnDispRslt_col_39]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_40_p_PPanel;
	public MCColumnConfig columnDispRslt_col_40;// [DispRslt]の[amt_40_p.amt]を[columnDispRslt_col_40]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_41_p_PPanel;
	public MCColumnConfig columnDispRslt_col_41;// [DispRslt]の[amt_41_p.amt]を[columnDispRslt_col_41]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_42_p_PPanel;
	public MCColumnConfig columnDispRslt_col_42;// [DispRslt]の[amt_42_p.amt]を[columnDispRslt_col_42]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_43_p_PPanel;
	public MCColumnConfig columnDispRslt_col_43;// [DispRslt]の[amt_43_p.amt]を[columnDispRslt_col_43]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_44_p_PPanel;
	public MCColumnConfig columnDispRslt_col_44;// [DispRslt]の[amt_44_p.amt]を[columnDispRslt_col_44]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_45_p_PPanel;
	public MCColumnConfig columnDispRslt_col_45;// [DispRslt]の[amt_45_p.amt]を[columnDispRslt_col_45]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_46_p_PPanel;
	public MCColumnConfig columnDispRslt_col_46;// [DispRslt]の[amt_46_p.amt]を[columnDispRslt_col_46]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_47_p_PPanel;
	public MCColumnConfig columnDispRslt_col_47;// [DispRslt]の[amt_47_p.amt]を[columnDispRslt_col_47]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_48_p_PPanel;
	public MCColumnConfig columnDispRslt_col_48;// [DispRslt]の[amt_48_p.amt]を[columnDispRslt_col_48]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_49_p_PPanel;
	public MCColumnConfig columnDispRslt_col_49;// [DispRslt]の[amt_49_p.amt]を[columnDispRslt_col_49]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_50_p_PPanel;
	public MCColumnConfig columnDispRslt_col_50;// [DispRslt]の[amt_50_p.amt]を[columnDispRslt_col_50]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_51_p_PPanel;
	public MCColumnConfig columnDispRslt_col_51;// [DispRslt]の[amt_51_p.amt]を[columnDispRslt_col_51]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_52_p_PPanel;
	public MCColumnConfig columnDispRslt_col_52;// [DispRslt]の[amt_52_p.amt]を[columnDispRslt_col_52]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_53_p_PPanel;
	public MCColumnConfig columnDispRslt_col_53;// [DispRslt]の[amt_53_p.amt]を[columnDispRslt_col_53]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_54_p_PPanel;
	public MCColumnConfig columnDispRslt_col_54;// [DispRslt]の[amt_54_p.amt]を[columnDispRslt_col_54]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_55_p_PPanel;
	public MCColumnConfig columnDispRslt_col_55;// [DispRslt]の[amt_55_p.amt]を[columnDispRslt_col_55]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_56_p_PPanel;
	public MCColumnConfig columnDispRslt_col_56;// [DispRslt]の[amt_56_p.amt]を[columnDispRslt_col_56]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_57_p_PPanel;
	public MCColumnConfig columnDispRslt_col_57;// [DispRslt]の[amt_57_p.amt]を[columnDispRslt_col_57]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_58_p_PPanel;
	public MCColumnConfig columnDispRslt_col_58;// [DispRslt]の[amt_58_p.amt]を[columnDispRslt_col_58]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_amt_59_p_PPanel;
	public MCColumnConfig columnDispRslt_col_59;// [DispRslt]の[amt_59_p.amt]を[columnDispRslt_col_59]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DispRslt_ttl_amt_p_PPanel;
	public MCColumnConfig columnDispRslt_ttl;// [DispRslt]の[ttl_amt_p.amt]を[columnDispRslt_ttl]としてエイリアス定義。
	/** [SRCH_LOC]モードを表す定数 */
	public static final String SRCH_LOC = "SRCH_LOC";
	/** [REF_LOC]モードを表す定数 */
	public static final String REF_LOC = "REF_LOC";
	/** [SRCH_DPT]モードを表す定数 */
	public static final String SRCH_DPT = "SRCH_DPT";
	/** [REF_DPT]モードを表す定数 */
	public static final String REF_DPT = "REF_DPT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_LOC, REF_LOC, SRCH_DPT, REF_DPT};
	
	/** [MG_MGBFL0430_Srch01]のCallerの作成 */
	protected MGBFP_WipLocYmSrch_MC.MG_MGBFL0430_Srch01Caller createMG_MGBFL0430_Srch01() {
		MGBFP_WipLocYmSrch_MC.MG_MGBFL0430_Srch01Caller<MGBFP_WipLocYmSrch, MG_MGBFL0430_Srch01Bridge>
		caller = ((MGBFP_WipLocYmSrch_MC)this).new MG_MGBFL0430_Srch01Caller<MGBFP_WipLocYmSrch, MG_MGBFL0430_Srch01Bridge>(
					(MGBFP_WipLocYmSrch)this, new MG_MGBFL0430_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBFL0430_Srch01]の呼び出し */
	protected void callMG_MGBFL0430_Srch01() {
		MCCaller caller = createMG_MGBFL0430_Srch01();
		caller.exec();
	}
	/** [MG_MGBFL0430_Srch02]のCallerの作成 */
	protected MGBFP_WipLocYmSrch_MC.MG_MGBFL0430_Srch02Caller createMG_MGBFL0430_Srch02() {
		MGBFP_WipLocYmSrch_MC.MG_MGBFL0430_Srch02Caller<MGBFP_WipLocYmSrch, MG_MGBFL0430_Srch02Bridge>
		caller = ((MGBFP_WipLocYmSrch_MC)this).new MG_MGBFL0430_Srch02Caller<MGBFP_WipLocYmSrch, MG_MGBFL0430_Srch02Bridge>(
					(MGBFP_WipLocYmSrch)this, new MG_MGBFL0430_Srch02Bridge());
		return caller;
	}
	/** [MG_MGBFL0430_Srch02]の呼び出し */
	protected void callMG_MGBFL0430_Srch02() {
		MCCaller caller = createMG_MGBFL0430_Srch02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0430.CndR aCndR;
	/** [DispRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0430.DispRsltR> aDispRsltL;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0430.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBF.MGBFP0430.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0430.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0430.CndR createCndR() {
		return mcframe.clientMGBF.MGBFP0430.CndR.create();
	}

	/**
	 * コピーによってaDispRsltLを設定します。
	 *
	 * aDispRsltLのインスタンスは変更されません。
	 *
	 * @param dataset DispRsltL
	 */
	public void setDispRsltL(MCList<mcframe.clientMGBF.MGBFP0430.DispRsltR> aList) {
		if (getDispRsltL() != aList) {
			getDispRsltL().setAll(aList);
		}
	}

	/**
	 * [DispRslt]ブロックのコンテナaDispRsltLを返します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0430.DispRsltR> getDispRsltL() {
		return aDispRsltL;
	}

	/**
	 * aDispRsltRを作成します。
	 *
	 * @return DispRsltR
	 */
	public mcframe.clientMGBF.MGBFP0430.DispRsltR createDispRsltR() {
		return mcframe.clientMGBF.MGBFP0430.DispRsltR.create();
	}

	/**
	 * aDispRsltLを作成します。
	 *
	 * @return DispRsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0430.DispRsltR> createDispRsltL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.class);
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
	public void setRsltL(MCList<mcframe.clientMGBF.MGBFP0430.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0430.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBF.MGBFP0430.RsltR createRsltR() {
		return mcframe.clientMGBF.MGBFP0430.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0430.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0430.RsltR.class);
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
		ret.add(ScreenOpePanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(TtlPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(DispRsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_WipLocYmSrch_MC_A() {
		aCndR = createCndR();
		aDispRsltL = createDispRsltL();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBFP_WipLocYmSrch_MC_A(String name) {
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
		MGBFP_WipLocYmSrch_MC.jbCreateScreenOpe((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbCreateTop((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbCreateFold((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbCreateTab1((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbCreateTab2((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbCreateCnd((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbCreateTtl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbCreateLPnl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbCreateCtrl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbCreateDispRslt((MGBFP_WipLocYmSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBFP_WipLocYmSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBFP_WipLocYmSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBFP_WipLocYmSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBFP_WipLocYmSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBFP_WipLocYmSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBFP_WipLocYmSrch p) {
	}

	/**
	 * [Ttl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTtl(MGBFP_WipLocYmSrch p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MGBFP_WipLocYmSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBFP_WipLocYmSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DispRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispRslt(MGBFP_WipLocYmSrch p) {
		p.DispRslt_amt_00_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_00_p);
		p.DispRslt_amt_00_p_PPanel.setName("DispRslt.amt_00_p");
		p.columnDispRslt_col_00 = p.DispRslt_amt_00_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_00.addAliasName("DispRslt.col_00", p);
		p.DispRslt_amt_01_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_01_p);
		p.DispRslt_amt_01_p_PPanel.setName("DispRslt.amt_01_p");
		p.columnDispRslt_col_01 = p.DispRslt_amt_01_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_01.addAliasName("DispRslt.col_01", p);
		p.DispRslt_amt_02_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_02_p);
		p.DispRslt_amt_02_p_PPanel.setName("DispRslt.amt_02_p");
		p.columnDispRslt_col_02 = p.DispRslt_amt_02_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_02.addAliasName("DispRslt.col_02", p);
		p.DispRslt_amt_03_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_03_p);
		p.DispRslt_amt_03_p_PPanel.setName("DispRslt.amt_03_p");
		p.columnDispRslt_col_03 = p.DispRslt_amt_03_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_03.addAliasName("DispRslt.col_03", p);
		p.DispRslt_amt_04_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_04_p);
		p.DispRslt_amt_04_p_PPanel.setName("DispRslt.amt_04_p");
		p.columnDispRslt_col_04 = p.DispRslt_amt_04_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_04.addAliasName("DispRslt.col_04", p);
		p.DispRslt_amt_05_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_05_p);
		p.DispRslt_amt_05_p_PPanel.setName("DispRslt.amt_05_p");
		p.columnDispRslt_col_05 = p.DispRslt_amt_05_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_05.addAliasName("DispRslt.col_05", p);
		p.DispRslt_amt_06_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_06_p);
		p.DispRslt_amt_06_p_PPanel.setName("DispRslt.amt_06_p");
		p.columnDispRslt_col_06 = p.DispRslt_amt_06_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_06.addAliasName("DispRslt.col_06", p);
		p.DispRslt_amt_07_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_07_p);
		p.DispRslt_amt_07_p_PPanel.setName("DispRslt.amt_07_p");
		p.columnDispRslt_col_07 = p.DispRslt_amt_07_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_07.addAliasName("DispRslt.col_07", p);
		p.DispRslt_amt_08_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_08_p);
		p.DispRslt_amt_08_p_PPanel.setName("DispRslt.amt_08_p");
		p.columnDispRslt_col_08 = p.DispRslt_amt_08_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_08.addAliasName("DispRslt.col_08", p);
		p.DispRslt_amt_09_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_09_p);
		p.DispRslt_amt_09_p_PPanel.setName("DispRslt.amt_09_p");
		p.columnDispRslt_col_09 = p.DispRslt_amt_09_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_09.addAliasName("DispRslt.col_09", p);
		p.DispRslt_amt_10_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_10_p);
		p.DispRslt_amt_10_p_PPanel.setName("DispRslt.amt_10_p");
		p.columnDispRslt_col_10 = p.DispRslt_amt_10_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_10.addAliasName("DispRslt.col_10", p);
		p.DispRslt_amt_11_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_11_p);
		p.DispRslt_amt_11_p_PPanel.setName("DispRslt.amt_11_p");
		p.columnDispRslt_col_11 = p.DispRslt_amt_11_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_11.addAliasName("DispRslt.col_11", p);
		p.DispRslt_amt_12_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_12_p);
		p.DispRslt_amt_12_p_PPanel.setName("DispRslt.amt_12_p");
		p.columnDispRslt_col_12 = p.DispRslt_amt_12_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_12.addAliasName("DispRslt.col_12", p);
		p.DispRslt_amt_13_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_13_p);
		p.DispRslt_amt_13_p_PPanel.setName("DispRslt.amt_13_p");
		p.columnDispRslt_col_13 = p.DispRslt_amt_13_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_13.addAliasName("DispRslt.col_13", p);
		p.DispRslt_amt_14_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_14_p);
		p.DispRslt_amt_14_p_PPanel.setName("DispRslt.amt_14_p");
		p.columnDispRslt_col_14 = p.DispRslt_amt_14_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_14.addAliasName("DispRslt.col_14", p);
		p.DispRslt_amt_15_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_15_p);
		p.DispRslt_amt_15_p_PPanel.setName("DispRslt.amt_15_p");
		p.columnDispRslt_col_15 = p.DispRslt_amt_15_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_15.addAliasName("DispRslt.col_15", p);
		p.DispRslt_amt_16_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_16_p);
		p.DispRslt_amt_16_p_PPanel.setName("DispRslt.amt_16_p");
		p.columnDispRslt_col_16 = p.DispRslt_amt_16_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_16.addAliasName("DispRslt.col_16", p);
		p.DispRslt_amt_17_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_17_p);
		p.DispRslt_amt_17_p_PPanel.setName("DispRslt.amt_17_p");
		p.columnDispRslt_col_17 = p.DispRslt_amt_17_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_17.addAliasName("DispRslt.col_17", p);
		p.DispRslt_amt_18_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_18_p);
		p.DispRslt_amt_18_p_PPanel.setName("DispRslt.amt_18_p");
		p.columnDispRslt_col_18 = p.DispRslt_amt_18_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_18.addAliasName("DispRslt.col_18", p);
		p.DispRslt_amt_19_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_19_p);
		p.DispRslt_amt_19_p_PPanel.setName("DispRslt.amt_19_p");
		p.columnDispRslt_col_19 = p.DispRslt_amt_19_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_19.addAliasName("DispRslt.col_19", p);
		p.DispRslt_amt_20_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_20_p);
		p.DispRslt_amt_20_p_PPanel.setName("DispRslt.amt_20_p");
		p.columnDispRslt_col_20 = p.DispRslt_amt_20_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_20.addAliasName("DispRslt.col_20", p);
		p.DispRslt_amt_21_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_21_p);
		p.DispRslt_amt_21_p_PPanel.setName("DispRslt.amt_21_p");
		p.columnDispRslt_col_21 = p.DispRslt_amt_21_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_21.addAliasName("DispRslt.col_21", p);
		p.DispRslt_amt_22_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_22_p);
		p.DispRslt_amt_22_p_PPanel.setName("DispRslt.amt_22_p");
		p.columnDispRslt_col_22 = p.DispRslt_amt_22_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_22.addAliasName("DispRslt.col_22", p);
		p.DispRslt_amt_23_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_23_p);
		p.DispRslt_amt_23_p_PPanel.setName("DispRslt.amt_23_p");
		p.columnDispRslt_col_23 = p.DispRslt_amt_23_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_23.addAliasName("DispRslt.col_23", p);
		p.DispRslt_amt_24_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_24_p);
		p.DispRslt_amt_24_p_PPanel.setName("DispRslt.amt_24_p");
		p.columnDispRslt_col_24 = p.DispRslt_amt_24_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_24.addAliasName("DispRslt.col_24", p);
		p.DispRslt_amt_25_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_25_p);
		p.DispRslt_amt_25_p_PPanel.setName("DispRslt.amt_25_p");
		p.columnDispRslt_col_25 = p.DispRslt_amt_25_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_25.addAliasName("DispRslt.col_25", p);
		p.DispRslt_amt_26_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_26_p);
		p.DispRslt_amt_26_p_PPanel.setName("DispRslt.amt_26_p");
		p.columnDispRslt_col_26 = p.DispRslt_amt_26_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_26.addAliasName("DispRslt.col_26", p);
		p.DispRslt_amt_27_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_27_p);
		p.DispRslt_amt_27_p_PPanel.setName("DispRslt.amt_27_p");
		p.columnDispRslt_col_27 = p.DispRslt_amt_27_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_27.addAliasName("DispRslt.col_27", p);
		p.DispRslt_amt_28_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_28_p);
		p.DispRslt_amt_28_p_PPanel.setName("DispRslt.amt_28_p");
		p.columnDispRslt_col_28 = p.DispRslt_amt_28_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_28.addAliasName("DispRslt.col_28", p);
		p.DispRslt_amt_29_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_29_p);
		p.DispRslt_amt_29_p_PPanel.setName("DispRslt.amt_29_p");
		p.columnDispRslt_col_29 = p.DispRslt_amt_29_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_29.addAliasName("DispRslt.col_29", p);
		p.DispRslt_amt_30_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_30_p);
		p.DispRslt_amt_30_p_PPanel.setName("DispRslt.amt_30_p");
		p.columnDispRslt_col_30 = p.DispRslt_amt_30_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_30.addAliasName("DispRslt.col_30", p);
		p.DispRslt_amt_31_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_31_p);
		p.DispRslt_amt_31_p_PPanel.setName("DispRslt.amt_31_p");
		p.columnDispRslt_col_31 = p.DispRslt_amt_31_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_31.addAliasName("DispRslt.col_31", p);
		p.DispRslt_amt_32_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_32_p);
		p.DispRslt_amt_32_p_PPanel.setName("DispRslt.amt_32_p");
		p.columnDispRslt_col_32 = p.DispRslt_amt_32_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_32.addAliasName("DispRslt.col_32", p);
		p.DispRslt_amt_33_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_33_p);
		p.DispRslt_amt_33_p_PPanel.setName("DispRslt.amt_33_p");
		p.columnDispRslt_col_33 = p.DispRslt_amt_33_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_33.addAliasName("DispRslt.col_33", p);
		p.DispRslt_amt_34_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_34_p);
		p.DispRslt_amt_34_p_PPanel.setName("DispRslt.amt_34_p");
		p.columnDispRslt_col_34 = p.DispRslt_amt_34_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_34.addAliasName("DispRslt.col_34", p);
		p.DispRslt_amt_35_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_35_p);
		p.DispRslt_amt_35_p_PPanel.setName("DispRslt.amt_35_p");
		p.columnDispRslt_col_35 = p.DispRslt_amt_35_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_35.addAliasName("DispRslt.col_35", p);
		p.DispRslt_amt_36_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_36_p);
		p.DispRslt_amt_36_p_PPanel.setName("DispRslt.amt_36_p");
		p.columnDispRslt_col_36 = p.DispRslt_amt_36_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_36.addAliasName("DispRslt.col_36", p);
		p.DispRslt_amt_37_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_37_p);
		p.DispRslt_amt_37_p_PPanel.setName("DispRslt.amt_37_p");
		p.columnDispRslt_col_37 = p.DispRslt_amt_37_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_37.addAliasName("DispRslt.col_37", p);
		p.DispRslt_amt_38_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_38_p);
		p.DispRslt_amt_38_p_PPanel.setName("DispRslt.amt_38_p");
		p.columnDispRslt_col_38 = p.DispRslt_amt_38_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_38.addAliasName("DispRslt.col_38", p);
		p.DispRslt_amt_39_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_39_p);
		p.DispRslt_amt_39_p_PPanel.setName("DispRslt.amt_39_p");
		p.columnDispRslt_col_39 = p.DispRslt_amt_39_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_39.addAliasName("DispRslt.col_39", p);
		p.DispRslt_amt_40_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_40_p);
		p.DispRslt_amt_40_p_PPanel.setName("DispRslt.amt_40_p");
		p.columnDispRslt_col_40 = p.DispRslt_amt_40_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_40.addAliasName("DispRslt.col_40", p);
		p.DispRslt_amt_41_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_41_p);
		p.DispRslt_amt_41_p_PPanel.setName("DispRslt.amt_41_p");
		p.columnDispRslt_col_41 = p.DispRslt_amt_41_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_41.addAliasName("DispRslt.col_41", p);
		p.DispRslt_amt_42_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_42_p);
		p.DispRslt_amt_42_p_PPanel.setName("DispRslt.amt_42_p");
		p.columnDispRslt_col_42 = p.DispRslt_amt_42_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_42.addAliasName("DispRslt.col_42", p);
		p.DispRslt_amt_43_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_43_p);
		p.DispRslt_amt_43_p_PPanel.setName("DispRslt.amt_43_p");
		p.columnDispRslt_col_43 = p.DispRslt_amt_43_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_43.addAliasName("DispRslt.col_43", p);
		p.DispRslt_amt_44_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_44_p);
		p.DispRslt_amt_44_p_PPanel.setName("DispRslt.amt_44_p");
		p.columnDispRslt_col_44 = p.DispRslt_amt_44_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_44.addAliasName("DispRslt.col_44", p);
		p.DispRslt_amt_45_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_45_p);
		p.DispRslt_amt_45_p_PPanel.setName("DispRslt.amt_45_p");
		p.columnDispRslt_col_45 = p.DispRslt_amt_45_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_45.addAliasName("DispRslt.col_45", p);
		p.DispRslt_amt_46_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_46_p);
		p.DispRslt_amt_46_p_PPanel.setName("DispRslt.amt_46_p");
		p.columnDispRslt_col_46 = p.DispRslt_amt_46_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_46.addAliasName("DispRslt.col_46", p);
		p.DispRslt_amt_47_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_47_p);
		p.DispRslt_amt_47_p_PPanel.setName("DispRslt.amt_47_p");
		p.columnDispRslt_col_47 = p.DispRslt_amt_47_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_47.addAliasName("DispRslt.col_47", p);
		p.DispRslt_amt_48_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_48_p);
		p.DispRslt_amt_48_p_PPanel.setName("DispRslt.amt_48_p");
		p.columnDispRslt_col_48 = p.DispRslt_amt_48_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_48.addAliasName("DispRslt.col_48", p);
		p.DispRslt_amt_49_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_49_p);
		p.DispRslt_amt_49_p_PPanel.setName("DispRslt.amt_49_p");
		p.columnDispRslt_col_49 = p.DispRslt_amt_49_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_49.addAliasName("DispRslt.col_49", p);
		p.DispRslt_amt_50_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_50_p);
		p.DispRslt_amt_50_p_PPanel.setName("DispRslt.amt_50_p");
		p.columnDispRslt_col_50 = p.DispRslt_amt_50_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_50.addAliasName("DispRslt.col_50", p);
		p.DispRslt_amt_51_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_51_p);
		p.DispRslt_amt_51_p_PPanel.setName("DispRslt.amt_51_p");
		p.columnDispRslt_col_51 = p.DispRslt_amt_51_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_51.addAliasName("DispRslt.col_51", p);
		p.DispRslt_amt_52_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_52_p);
		p.DispRslt_amt_52_p_PPanel.setName("DispRslt.amt_52_p");
		p.columnDispRslt_col_52 = p.DispRslt_amt_52_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_52.addAliasName("DispRslt.col_52", p);
		p.DispRslt_amt_53_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_53_p);
		p.DispRslt_amt_53_p_PPanel.setName("DispRslt.amt_53_p");
		p.columnDispRslt_col_53 = p.DispRslt_amt_53_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_53.addAliasName("DispRslt.col_53", p);
		p.DispRslt_amt_54_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_54_p);
		p.DispRslt_amt_54_p_PPanel.setName("DispRslt.amt_54_p");
		p.columnDispRslt_col_54 = p.DispRslt_amt_54_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_54.addAliasName("DispRslt.col_54", p);
		p.DispRslt_amt_55_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_55_p);
		p.DispRslt_amt_55_p_PPanel.setName("DispRslt.amt_55_p");
		p.columnDispRslt_col_55 = p.DispRslt_amt_55_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_55.addAliasName("DispRslt.col_55", p);
		p.DispRslt_amt_56_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_56_p);
		p.DispRslt_amt_56_p_PPanel.setName("DispRslt.amt_56_p");
		p.columnDispRslt_col_56 = p.DispRslt_amt_56_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_56.addAliasName("DispRslt.col_56", p);
		p.DispRslt_amt_57_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_57_p);
		p.DispRslt_amt_57_p_PPanel.setName("DispRslt.amt_57_p");
		p.columnDispRslt_col_57 = p.DispRslt_amt_57_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_57.addAliasName("DispRslt.col_57", p);
		p.DispRslt_amt_58_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_58_p);
		p.DispRslt_amt_58_p_PPanel.setName("DispRslt.amt_58_p");
		p.columnDispRslt_col_58 = p.DispRslt_amt_58_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_58.addAliasName("DispRslt.col_58", p);
		p.DispRslt_amt_59_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$amt_59_p);
		p.DispRslt_amt_59_p_PPanel.setName("DispRslt.amt_59_p");
		p.columnDispRslt_col_59 = p.DispRslt_amt_59_p_PPanel.columnAmt_amt;
		p.columnDispRslt_col_59.addAliasName("DispRslt.col_59", p);
		p.DispRslt_ttl_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMGBF.MGBFP0430.DispRsltR.$ttl_amt_p);
		p.DispRslt_ttl_amt_p_PPanel.setName("DispRslt.ttl_amt_p");
		p.columnDispRslt_ttl = p.DispRslt_ttl_amt_p_PPanel.columnAmt_amt;
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
	
	
	/** [Cnd_dpt_lvl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_lvl_cd_p = null;

	/**
	 * [Cnd_dpt_lvl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_lvl_cd_ListPutter() {
		if (Cnd_dpt_lvl_cd_p == null) {
			Cnd_dpt_lvl_cd_p = createCnd_dpt_lvl_cd_ListPutter(Cnd_dpt_lvl_cd, "dpt_lvl_cd", "dpt_lvl_nm");

		}
		return Cnd_dpt_lvl_cd_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_WipLocYmSrch create(){
		MGBFP_WipLocYmSrch p = new MGBFP_WipLocYmSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_WipLocYmSrch create(String name){
		MGBFP_WipLocYmSrch p = new MGBFP_WipLocYmSrch(name);
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
		MGBFP_WipLocYmSrch_MC.jbfInitScreenOpe((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbfInitTop((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbfInitFold((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbfInitTab1((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbfInitTab2((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbfInitCnd((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbfInitTtl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbfInitLPnl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbfInitCtrl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbfInitDispRslt((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbInitScreenOpe((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbInitTop((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbInitFold((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbInitTab1((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbInitTab2((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbInitCnd((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbInitTtl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbInitLPnl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbInitCtrl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.jbInitDispRslt((MGBFP_WipLocYmSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBFP_WipLocYmSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBFP_WipLocYmSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBFP_WipLocYmSrch p) {
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
	protected static void jbfInitTab1(MGBFP_WipLocYmSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBFP_WipLocYmSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBFP_WipLocYmSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_LOC = p.beansFactory.createRadioButton("Cnd.ope_LOC");
		p.Cnd_ope_DPT = p.beansFactory.createRadioButton("Cnd.ope_DPT");
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
		p.Cnd_dpt_lvl_cd_Label = p.beansFactory.createLabel("Cnd.dpt_lvl_cd_Label");
		p.Cnd_dpt_lvl_cd = p.beansFactory.createTextComboBox("Cnd.dpt_lvl_cd");
		p.Cnd_dpt_lvl_cd.setLabel(p.Cnd_dpt_lvl_cd_Label);
		p.Cnd_dpt_lvl_nm = p.beansFactory.createTextField("Cnd.dpt_lvl_nm");
		p.Cnd_mng_dpt_cd_Label = p.beansFactory.createLabel("Cnd.mng_dpt_cd_Label");
		p.Cnd_mng_dpt_cd = p.beansFactory.createTextComboBox("Cnd.mng_dpt_cd");
		p.Cnd_mng_dpt_cd.setLabel(p.Cnd_mng_dpt_cd_Label);
		p.Cnd_mng_dpt_nm = p.beansFactory.createTextField("Cnd.mng_dpt_nm");
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
		p.Cnd_calc_grp_flg = p.beansFactory.createCheckBox("Cnd.calc_grp_flg");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_mng_dpt_flg = p.beansFactory.createCheckBox("Cnd.mng_dpt_flg");
		p.Cnd_site_flg = p.beansFactory.createCheckBox("Cnd.site_flg");
		p.Cnd_loc_flg = p.beansFactory.createCheckBox("Cnd.loc_flg");
		p.Cnd_str_ln_flg = p.beansFactory.createCheckBox("Cnd.str_ln_flg");
		p.Cnd_select_all = p.beansFactory.createButton("Cnd.select_all", "no_border");
		p.Cnd_deselect_all = p.beansFactory.createButton("Cnd.deselect_all", "no_border");
		p.Cnd_disp_key = p.beansFactory.createCheckBox("Cnd.disp_key");
		p.Cnd_cur_cd = p.beansFactory.createTextField("Cnd.cur_cd");
		p.Cnd_amt_dec_place = p.beansFactory.createNumberField("Cnd.amt_dec_place");
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTtl(MGBFP_WipLocYmSrch p) {
		// ブロック関連の初期化
		p.TtlPanel = p.beansFactory.createPanel("Ttl");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MGBFP_WipLocYmSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBFP_WipLocYmSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DispRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispRslt(MGBFP_WipLocYmSrch p) {
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
		p.columnDispRslt_site_cd = p.beansFactory.createTableColumn("DispRslt.site_cd", MCColumnType.TEXT);
		p.columnDispRslt_site_nm = p.beansFactory.createTableColumn("DispRslt.site_nm", MCColumnType.TEXT);
		p.columnDispRslt_loc_cd = p.beansFactory.createTableColumn("DispRslt.loc_cd", MCColumnType.TEXT);
		p.columnDispRslt_loc_nm = p.beansFactory.createTableColumn("DispRslt.loc_nm", MCColumnType.TEXT);
		p.columnDispRslt_str_ln_cd = p.beansFactory.createTableColumn("DispRslt.str_ln_cd", MCColumnType.TEXT);
		p.columnDispRslt_str_ln_nm = p.beansFactory.createTableColumn("DispRslt.str_ln_nm", MCColumnType.TEXT);
		p.columnDispRslt_elm_no = p.beansFactory.createTableColumn("DispRslt.elm_no", MCColumnType.NUMBER);
		p.columnDispRslt_elm = p.beansFactory.createTableColumn("DispRslt.elm", MCColumnType.TEXT);
		p.columnDispRslt_elm_nm = p.beansFactory.createTableColumn("DispRslt.elm_nm", MCColumnType.TEXT);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBFP_WipLocYmSrch p) {
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
	protected static void jbInitTop(MGBFP_WipLocYmSrch p) {
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
		p.FoldPanel.setNextBeans(p.LPnlPanel);
		p.TopPanel.add(p.LPnlPanel, null);
		p.LPnlPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MGBFP_WipLocYmSrch p) {
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
		p.FoldTab.add(p.Tab2Panel, "Fold.tab5");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MGBFP_WipLocYmSrch p) {
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
	protected static void jbInitTab2(MGBFP_WipLocYmSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.TtlPanel, null);
		p.Tab2Panel.setLastBeans(p.TtlPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBFP_WipLocYmSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_LOC);
		p.Cnd_ope_LOC.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_LOC);
		p.ScreenOpePanel.add(p.Cnd_ope_LOC);
		p.Cnd_ope_LOC.setNextBeans(p.Cnd_ope_DPT);
		p.Cnd_ope_DPT.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DPT);
		p.ScreenOpePanel.add(p.Cnd_ope_DPT);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.ope_META);
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_grp_cd, true);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_ym_fr);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ym_fr);
		p.Cnd_ym_fr.setNextBeans(p.Cnd_ym_to);
		p.Cnd_ym_fr.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.ym_fr_META);
		p.Cnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ym_to_Label);
		p.CndPanel.add(p.Cnd_ym_to);
		p.Cnd_ym_to.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ym_to.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.ym_to_META);
		p.Cnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_dpt_lvl_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_dpt_lvl_cd.setListType(MCListType.FREE);
		p.Cnd_dpt_lvl_cd.setLinkBeans(p.Cnd_dpt_lvl_nm);
		p.CndPanel.add(p.Cnd_dpt_lvl_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_lvl_cd);
		p.Cnd_dpt_lvl_cd.setNextBeans(p.Cnd_dpt_lvl_nm);
		p.Cnd_dpt_lvl_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.dpt_lvl_cd_META);
		p.CndPanel.add(p.Cnd_dpt_lvl_nm);
		p.Cnd_dpt_lvl_nm.setNextBeans(p.Cnd_mng_dpt_cd);
		p.Cnd_dpt_lvl_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.dpt_lvl_nm_META);
		p.Cnd_mng_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mng_dpt_cd, true);
		p.Cnd_mng_dpt_cd.setLinkBeans(p.Cnd_mng_dpt_nm);
		p.CndPanel.add(p.Cnd_mng_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_mng_dpt_cd);
		p.Cnd_mng_dpt_cd.setNextBeans(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.mng_dpt_cd_META);
		p.CndPanel.add(p.Cnd_mng_dpt_nm);
		p.Cnd_mng_dpt_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_mng_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.mng_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_mng_dpt_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_cur_cd);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.TtlPanel.add(p.Cnd_calc_grp_flg);
		p.TtlPanel.setLastBeans(p.Cnd_calc_grp_flg);
		p.Cnd_calc_grp_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_calc_grp_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.calc_grp_flg_META);
		p.TtlPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setNextBeans(p.Cnd_mng_dpt_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.wg_flg_META);
		p.TtlPanel.add(p.Cnd_mng_dpt_flg);
		p.Cnd_mng_dpt_flg.setNextBeans(p.Cnd_site_flg);
		p.Cnd_mng_dpt_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.mng_dpt_flg_META);
		p.TtlPanel.add(p.Cnd_site_flg);
		p.Cnd_site_flg.setNextBeans(p.Cnd_loc_flg);
		p.Cnd_site_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.site_flg_META);
		p.TtlPanel.add(p.Cnd_loc_flg);
		p.Cnd_loc_flg.setNextBeans(p.Cnd_str_ln_flg);
		p.Cnd_loc_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.loc_flg_META);
		p.TtlPanel.add(p.Cnd_str_ln_flg);
		p.Cnd_str_ln_flg.setNextBeans(p.Cnd_select_all);
		p.Cnd_str_ln_flg.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.str_ln_flg_META);
		p.Cnd_select_all.setIcon("SELECT_ALL");
		p.Cnd_select_all.setFunctionKey(MCFunctionKey.F13);
		p.TtlPanel.add(p.Cnd_select_all);
		p.Cnd_select_all.setNextBeans(p.Cnd_deselect_all);
		p.Cnd_deselect_all.setIcon("DESELECT_ALL");
		p.Cnd_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.TtlPanel.add(p.Cnd_deselect_all);
		p.LPnlPanel.add(p.Cnd_disp_key);
		p.LPnlPanel.setLastBeans(p.Cnd_disp_key);
		p.Cnd_disp_key.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.disp_key_META);
		p.CndPanel.add(p.Cnd_cur_cd);
		p.Cnd_cur_cd.setNextBeans(p.Cnd_amt_dec_place);
		p.Cnd_cur_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.cur_cd_META);
		p.CndPanel.add(p.Cnd_amt_dec_place);
		p.Cnd_amt_dec_place.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0430.CndR.amt_dec_place_META);
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTtl(MGBFP_WipLocYmSrch p) {
		// ブロック関連の初期化
		p.TtlPanel.setValueCheck(false);
		p.TtlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MGBFP_WipLocYmSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBFP_WipLocYmSrch p) {
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
	protected static void jbInitDispRslt(MGBFP_WipLocYmSrch p) {
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
		MGBFP_WipLocYmSrch_MC.mcInitScreenOpe((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.mcInitTop((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.mcInitFold((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.mcInitTab1((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.mcInitTab2((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.mcInitCnd((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.mcInitTtl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.mcInitLPnl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.mcInitCtrl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.mcInitDispRslt((MGBFP_WipLocYmSrch)this);

		// [SRCH_LOC]ステータスのモードの設定
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__LOC_ScreenOpe((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__LOC_Top((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__LOC_Fold((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__LOC_Tab1((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__LOC_Tab2((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__LOC_Cnd((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__LOC_Ttl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__LOC_LPnl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__LOC_Ctrl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__LOC_DispRslt((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__LOC_Rslt((MGBFP_WipLocYmSrch)this);

		// [REF_LOC]ステータスのモードの設定
		MGBFP_WipLocYmSrch_MC.statusInitREF__LOC_ScreenOpe((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__LOC_Top((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__LOC_Fold((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__LOC_Tab1((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__LOC_Tab2((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__LOC_Cnd((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__LOC_Ttl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__LOC_LPnl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__LOC_Ctrl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__LOC_DispRslt((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__LOC_Rslt((MGBFP_WipLocYmSrch)this);

		// [SRCH_DPT]ステータスのモードの設定
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__DPT_ScreenOpe((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__DPT_Top((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__DPT_Fold((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__DPT_Tab1((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__DPT_Tab2((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__DPT_Cnd((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__DPT_Ttl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__DPT_LPnl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__DPT_Ctrl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__DPT_DispRslt((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitSRCH__DPT_Rslt((MGBFP_WipLocYmSrch)this);

		// [REF_DPT]ステータスのモードの設定
		MGBFP_WipLocYmSrch_MC.statusInitREF__DPT_ScreenOpe((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__DPT_Top((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__DPT_Fold((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__DPT_Tab1((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__DPT_Tab2((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__DPT_Cnd((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__DPT_Ttl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__DPT_LPnl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__DPT_Ctrl((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__DPT_DispRslt((MGBFP_WipLocYmSrch)this);
		MGBFP_WipLocYmSrch_MC.statusInitREF__DPT_Rslt((MGBFP_WipLocYmSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBFP_WipLocYmSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBFP_WipLocYmSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBFP_WipLocYmSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBFP_WipLocYmSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBFP_WipLocYmSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBFP_WipLocYmSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_LOC.addAllListener(p);
		p.Cnd_ope_DPT.addAllListener(p);
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
		p.Cnd_dpt_lvl_cd.setListListener(p);
		p.Cnd_dpt_lvl_cd.addAllListener(p);
		p.Cnd_dpt_lvl_nm.setListListener(p);
		p.Cnd_dpt_lvl_nm.addAllListener(p);
		p.Cnd_mng_dpt_cd.setListListener(p);
		p.Cnd_mng_dpt_cd.addAllListener(p);
		p.Cnd_mng_dpt_nm.setListListener(p);
		p.Cnd_mng_dpt_nm.addAllListener(p);
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
		p.Cnd_calc_grp_flg.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_mng_dpt_flg.addAllListener(p);
		p.Cnd_site_flg.addAllListener(p);
		p.Cnd_loc_flg.addAllListener(p);
		p.Cnd_str_ln_flg.addAllListener(p);
		p.Cnd_select_all.addAllListener(p);
		p.Cnd_select_all.setAPMethodName("doCnd_select_all");
		p.Cnd_deselect_all.addAllListener(p);
		p.Cnd_deselect_all.setAPMethodName("doCnd_deselect_all");
		p.Cnd_disp_key.addAllListener(p);
		p.Cnd_cur_cd.setListListener(p);
		p.Cnd_cur_cd.addAllListener(p);
		p.Cnd_amt_dec_place.setListListener(p);
		p.Cnd_amt_dec_place.addAllListener(p);
	}

	/**
	 *  [Ttl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTtl(MGBFP_WipLocYmSrch p) {
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MGBFP_WipLocYmSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBFP_WipLocYmSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DispRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispRslt(MGBFP_WipLocYmSrch p) {
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
		p.columnDispRslt_site_cd.addAllListener(p);
		p.columnDispRslt_site_cd.setListListener(p);
		p.columnDispRslt_site_nm.addAllListener(p);
		p.columnDispRslt_site_nm.setListListener(p);
		p.columnDispRslt_loc_cd.addAllListener(p);
		p.columnDispRslt_loc_cd.setListListener(p);
		p.columnDispRslt_loc_nm.addAllListener(p);
		p.columnDispRslt_loc_nm.setListListener(p);
		p.columnDispRslt_str_ln_cd.addAllListener(p);
		p.columnDispRslt_str_ln_cd.setListListener(p);
		p.columnDispRslt_str_ln_nm.addAllListener(p);
		p.columnDispRslt_str_ln_nm.setListListener(p);
		p.columnDispRslt_elm_no.addAllListener(p);
		p.columnDispRslt_elm_no.setListListener(p);
		p.columnDispRslt_elm.addAllListener(p);
		p.columnDispRslt_elm.setListListener(p);
		p.columnDispRslt_elm_nm.addAllListener(p);
		p.columnDispRslt_elm_nm.setListListener(p);
	}

	/**
	 * [SRCH_LOC]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_ScreenOpe(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Top(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Fold(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Tab1(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Tab2(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Cnd(MGBFP_WipLocYmSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_LOC, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH_LOC, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, SRCH_LOC, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, SRCH_LOC, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_dpt_lvl_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.Cnd_dpt_lvl_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.Cnd_mng_dpt_cd.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_calc_grp_flg.putMode(p, SRCH_LOC, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, SRCH_LOC, MCMode.REQUIRED);
		p.Cnd_mng_dpt_flg.putMode(p, SRCH_LOC, MCMode.REQUIRED);
		p.Cnd_site_flg.putMode(p, SRCH_LOC, MCMode.REQUIRED);
		p.Cnd_loc_flg.putMode(p, SRCH_LOC, MCMode.REQUIRED);
		p.Cnd_str_ln_flg.putMode(p, SRCH_LOC, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_disp_key.putMode(p, SRCH_LOC, MCMode.REQUIRED);
		p.Cnd_cur_cd.putMode(p, SRCH_LOC, MCMode.INVISIBLE);
		p.Cnd_amt_dec_place.putMode(p, SRCH_LOC, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_LOC]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Ttl(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_LPnl(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Ctrl(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_DispRslt(MGBFP_WipLocYmSrch p){
		p.columnDispRslt_calc_grp_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_calc_grp_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_wg_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_wg_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_site_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_site_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_loc_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_loc_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_elm_no.putMode(p, SRCH_LOC, MCMode.INVISIBLE);
		p.columnDispRslt_elm.putMode(p, SRCH_LOC, MCMode.INVISIBLE);
		p.columnDispRslt_elm_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.DispRslt_amt_00_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_01_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_02_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_03_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_04_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_05_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_06_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_07_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_08_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_09_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_10_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_11_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_12_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_13_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_14_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_15_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_16_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_17_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_18_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_19_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_20_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_21_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_22_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_23_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_24_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_25_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_26_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_27_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_28_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_29_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_30_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_31_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_32_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_33_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_34_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_35_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_36_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_37_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_38_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_39_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_40_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_41_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_42_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_43_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_44_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_45_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_46_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_47_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_48_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_49_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_50_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_51_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_52_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_53_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_54_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_55_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_56_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_57_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_58_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_59_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_ttl_amt_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);

	}

	/**
	 * [SRCH_LOC]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Rslt(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_ScreenOpe(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Top(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Fold(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Tab1(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Tab2(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Cnd(MGBFP_WipLocYmSrch p){
		p.Cnd_ope_Group.putMode(p, REF_LOC, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, REF_LOC, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, REF_LOC, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, REF_LOC, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_dpt_lvl_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.Cnd_dpt_lvl_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.Cnd_mng_dpt_cd.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_calc_grp_flg.putMode(p, REF_LOC, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, REF_LOC, MCMode.REQUIRED);
		p.Cnd_mng_dpt_flg.putMode(p, REF_LOC, MCMode.REQUIRED);
		p.Cnd_site_flg.putMode(p, REF_LOC, MCMode.REQUIRED);
		p.Cnd_loc_flg.putMode(p, REF_LOC, MCMode.REQUIRED);
		p.Cnd_str_ln_flg.putMode(p, REF_LOC, MCMode.REQUIRED);
		p.Cnd_select_all.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_disp_key.putMode(p, REF_LOC, MCMode.REQUIRED);
		p.Cnd_cur_cd.putMode(p, REF_LOC, MCMode.INVISIBLE);
		p.Cnd_amt_dec_place.putMode(p, REF_LOC, MCMode.INVISIBLE);

	}

	/**
	 * [REF_LOC]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Ttl(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_LPnl(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Ctrl(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_DispRslt(MGBFP_WipLocYmSrch p){
		p.columnDispRslt_calc_grp_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_calc_grp_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_wg_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_wg_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_site_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_site_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_loc_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_loc_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_str_ln_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDispRslt_elm_no.putMode(p, REF_LOC, MCMode.INVISIBLE);
		p.columnDispRslt_elm.putMode(p, REF_LOC, MCMode.INVISIBLE);
		p.columnDispRslt_elm_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.DispRslt_amt_00_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_01_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_02_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_03_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_04_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_05_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_06_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_07_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_08_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_09_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_10_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_11_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_12_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_13_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_14_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_15_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_16_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_17_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_18_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_19_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_20_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_21_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_22_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_23_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_24_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_25_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_26_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_27_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_28_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_29_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_30_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_31_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_32_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_33_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_34_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_35_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_36_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_37_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_38_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_39_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_40_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_41_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_42_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_43_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_44_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_45_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_46_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_47_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_48_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_49_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_50_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_51_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_52_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_53_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_54_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_55_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_56_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_57_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_58_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_59_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_ttl_amt_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);

	}

	/**
	 * [REF_LOC]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Rslt(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_DPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DPT_ScreenOpe(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_DPT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DPT_Top(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_DPT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DPT_Fold(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_DPT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DPT_Tab1(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_DPT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DPT_Tab2(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_DPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DPT_Cnd(MGBFP_WipLocYmSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_DPT, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH_DPT, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, SRCH_DPT, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, SRCH_DPT, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH_DPT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DPT, MCMode.ENABLE);
		p.Cnd_dpt_lvl_cd.putMode(p, SRCH_DPT, MCMode.REQUIRED);
		p.Cnd_dpt_lvl_nm.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.Cnd_mng_dpt_cd.putMode(p, SRCH_DPT, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, SRCH_DPT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.Cnd_calc_grp_flg.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.Cnd_mng_dpt_flg.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.Cnd_site_flg.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.Cnd_loc_flg.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.Cnd_str_ln_flg.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.Cnd_select_all.putMode(p, SRCH_DPT, MCMode.DISABLE);
		p.Cnd_deselect_all.putMode(p, SRCH_DPT, MCMode.DISABLE);
		p.Cnd_disp_key.putMode(p, SRCH_DPT, MCMode.REQUIRED);
		p.Cnd_cur_cd.putMode(p, SRCH_DPT, MCMode.INVISIBLE);
		p.Cnd_amt_dec_place.putMode(p, SRCH_DPT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DPT]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DPT_Ttl(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_DPT]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DPT_LPnl(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_DPT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DPT_Ctrl(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [SRCH_DPT]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DPT_DispRslt(MGBFP_WipLocYmSrch p){
		p.columnDispRslt_calc_grp_cd.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.columnDispRslt_calc_grp_nm.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.columnDispRslt_wg_cd.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.columnDispRslt_wg_nm.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_cd.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_nm.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.columnDispRslt_site_cd.putMode(p, SRCH_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_site_nm.putMode(p, SRCH_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_loc_cd.putMode(p, SRCH_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_loc_nm.putMode(p, SRCH_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_str_ln_cd.putMode(p, SRCH_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_str_ln_nm.putMode(p, SRCH_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_elm_no.putMode(p, SRCH_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_elm.putMode(p, SRCH_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_elm_nm.putMode(p, SRCH_DPT, MCMode.READ_ONLY);
		p.DispRslt_amt_00_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_01_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_02_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_03_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_04_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_05_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_06_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_07_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_08_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_09_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_10_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_11_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_12_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_13_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_14_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_15_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_16_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_17_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_18_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_19_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_20_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_21_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_22_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_23_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_24_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_25_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_26_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_27_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_28_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_29_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_30_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_31_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_32_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_33_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_34_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_35_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_36_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_37_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_38_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_39_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_40_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_41_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_42_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_43_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_44_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_45_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_46_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_47_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_48_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_49_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_50_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_51_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_52_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_53_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_54_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_55_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_56_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_57_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_58_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_59_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_ttl_amt_p_PPanel.putStatus(SRCH_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);

	}

	/**
	 * [SRCH_DPT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DPT_Rslt(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_DPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_ScreenOpe(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_DPT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Top(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_DPT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Fold(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_DPT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Tab1(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_DPT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Tab2(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_DPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Cnd(MGBFP_WipLocYmSrch p){
		p.Cnd_ope_Group.putMode(p, REF_DPT, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, REF_DPT, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, REF_DPT, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, REF_DPT, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_dpt_lvl_cd.putMode(p, REF_DPT, MCMode.REQUIRED);
		p.Cnd_dpt_lvl_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_mng_dpt_cd.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_mng_dpt_nm.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_calc_grp_flg.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_mng_dpt_flg.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_site_flg.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_loc_flg.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_str_ln_flg.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_select_all.putMode(p, REF_DPT, MCMode.DISABLE);
		p.Cnd_deselect_all.putMode(p, REF_DPT, MCMode.DISABLE);
		p.Cnd_disp_key.putMode(p, REF_DPT, MCMode.REQUIRED);
		p.Cnd_cur_cd.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.Cnd_amt_dec_place.putMode(p, REF_DPT, MCMode.INVISIBLE);

	}

	/**
	 * [REF_DPT]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Ttl(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_DPT]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_LPnl(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_DPT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Ctrl(MGBFP_WipLocYmSrch p){

	}

	/**
	 * [REF_DPT]ステータスの[DispRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_DispRslt(MGBFP_WipLocYmSrch p){
		p.columnDispRslt_calc_grp_cd.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDispRslt_calc_grp_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDispRslt_wg_cd.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDispRslt_wg_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_cd.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDispRslt_mng_dpt_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDispRslt_site_cd.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_site_nm.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_loc_cd.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_loc_nm.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_str_ln_cd.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_str_ln_nm.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_elm_no.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_elm.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDispRslt_elm_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.DispRslt_amt_00_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_01_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_02_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_03_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_04_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_05_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_06_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_07_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_08_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_09_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_10_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_11_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_12_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_13_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_14_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_15_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_16_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_17_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_18_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_19_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_20_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_21_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_22_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_23_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_24_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_25_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_26_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_27_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_28_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_29_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_30_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_31_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_32_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_33_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_34_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_35_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_36_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_37_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_38_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_39_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_40_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_41_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_42_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_43_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_44_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_45_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_46_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_47_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_48_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_49_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_50_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_51_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_52_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_53_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_54_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_55_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_56_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_57_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_58_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_amt_59_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DispRslt_ttl_amt_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);

	}

	/**
	 * [REF_DPT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Rslt(MGBFP_WipLocYmSrch p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_LOC;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MGBFP_WipLocYmSrch_MC.setTableConfigDispRslt((MGBFP_WipLocYmSrch)this);
	}

	/**
	 * [DispRslt]ブロックのTableの設定
	 */
	protected static void setTableConfigDispRslt(MGBFP_WipLocYmSrch p) {
		p.columnDispRslt_calc_grp_cd.setMeta(mcframe.clientMGBF.MGBFP0430.DispRsltR.calc_grp_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_calc_grp_cd);
		p.columnDispRslt_calc_grp_nm.setMeta(mcframe.clientMGBF.MGBFP0430.DispRsltR.calc_grp_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_calc_grp_nm);
		p.columnDispRslt_wg_cd.setMeta(mcframe.clientMGBF.MGBFP0430.DispRsltR.wg_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_cd);
		p.columnDispRslt_wg_nm.setMeta(mcframe.clientMGBF.MGBFP0430.DispRsltR.wg_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_wg_nm);
		p.columnDispRslt_mng_dpt_cd.setMeta(mcframe.clientMGBF.MGBFP0430.DispRsltR.mng_dpt_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_cd);
		p.columnDispRslt_mng_dpt_nm.setMeta(mcframe.clientMGBF.MGBFP0430.DispRsltR.mng_dpt_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_mng_dpt_nm);
		p.columnDispRslt_site_cd.setMeta(mcframe.clientMGBF.MGBFP0430.DispRsltR.site_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_site_cd);
		p.columnDispRslt_site_nm.setMeta(mcframe.clientMGBF.MGBFP0430.DispRsltR.site_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_site_nm);
		p.columnDispRslt_loc_cd.setMeta(mcframe.clientMGBF.MGBFP0430.DispRsltR.loc_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_loc_cd);
		p.columnDispRslt_loc_nm.setMeta(mcframe.clientMGBF.MGBFP0430.DispRsltR.loc_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_loc_nm);
		p.columnDispRslt_str_ln_cd.setMeta(mcframe.clientMGBF.MGBFP0430.DispRsltR.str_ln_cd_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_str_ln_cd);
		p.columnDispRslt_str_ln_nm.setMeta(mcframe.clientMGBF.MGBFP0430.DispRsltR.str_ln_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_str_ln_nm);
		p.columnDispRslt_elm_no.setMeta(mcframe.clientMGBF.MGBFP0430.DispRsltR.elm_no_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm_no);
		p.columnDispRslt_elm.setMeta(mcframe.clientMGBF.MGBFP0430.DispRsltR.elm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm);
		p.columnDispRslt_elm_nm.setMeta(mcframe.clientMGBF.MGBFP0430.DispRsltR.elm_nm_META);
		p.DispRsltTable.addColumnConfig(p.columnDispRslt_elm_nm);
		p.DispRsltTable.addTable(p.DispRslt_amt_00_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_01_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_02_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_03_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_04_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_05_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_06_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_07_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_08_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_09_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_10_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_11_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_12_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_13_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_14_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_15_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_16_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_17_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_18_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_19_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_20_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_21_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_22_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_23_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_24_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_25_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_26_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_27_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_28_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_29_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_30_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_31_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_32_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_33_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_34_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_35_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_36_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_37_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_38_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_39_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_40_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_41_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_42_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_43_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_44_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_45_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_46_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_47_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_48_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_49_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_50_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_51_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_52_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_53_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_54_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_55_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_56_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_57_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_58_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_amt_59_p_PPanel.AmtTable);
		p.DispRsltTable.addTable(p.DispRslt_ttl_amt_p_PPanel.AmtTable);
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
		Cnd_dpt_lvl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dpt_lvl_cd.getListConfig().setPutter(getCnd_dpt_lvl_cd_ListPutter());
		Cnd_mng_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mng_dpt_cd.getListConfig().setPutter(getCnd_mng_dpt_cd_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_LOC]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_LOCStatus() {
		status = SRCH_LOC;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_LOC]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_LOCStatus() {
		status = REF_LOC;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DPTStatus() {
		status = SRCH_DPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_DPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_DPTStatus() {
		status = REF_DPT;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_LOC.equals(status)) {
			setSRCH_LOCStatus();
		}
		else if (REF_LOC.equals(status)) {
			setREF_LOCStatus();
		}
		else if (SRCH_DPT.equals(status)) {
			setSRCH_DPTStatus();
		}
		else if (REF_DPT.equals(status)) {
			setREF_DPTStatus();
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
	 * [Cnd_dpt_lvl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_lvl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DptLvl");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_dpt_lvl_cd) return getCnd_dpt_lvl_cd(row, info);
		if(combo == Cnd_mng_dpt_cd) return getCnd_mng_dpt_cd(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_ym_fr) return doCnd_ym_fr_VC(info);
		if (vc == Cnd_ym_to) return doCnd_ym_to_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_dpt_lvl_cd) return doCnd_dpt_lvl_cd_VC(info);
		if (vc == Cnd_dpt_lvl_nm) return doCnd_dpt_lvl_nm_VC(info);
		if (vc == Cnd_mng_dpt_cd) return doCnd_mng_dpt_cd_VC(info);
		if (vc == Cnd_mng_dpt_nm) return doCnd_mng_dpt_nm_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_calc_grp_flg) return doCnd_calc_grp_flg_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_mng_dpt_flg) return doCnd_mng_dpt_flg_VC(info);
		if (vc == Cnd_site_flg) return doCnd_site_flg_VC(info);
		if (vc == Cnd_loc_flg) return doCnd_loc_flg_VC(info);
		if (vc == Cnd_str_ln_flg) return doCnd_str_ln_flg_VC(info);
		if (vc == Cnd_disp_key) return doCnd_disp_key_VC(info);
		if (vc == Cnd_cur_cd) return doCnd_cur_cd_VC(info);
		if (vc == Cnd_amt_dec_place) return doCnd_amt_dec_place_VC(info);
		if (vc == columnDispRslt_calc_grp_cd) return doDispRslt_calc_grp_cd_VC(info);
		if (vc == columnDispRslt_calc_grp_nm) return doDispRslt_calc_grp_nm_VC(info);
		if (vc == columnDispRslt_wg_cd) return doDispRslt_wg_cd_VC(info);
		if (vc == columnDispRslt_wg_nm) return doDispRslt_wg_nm_VC(info);
		if (vc == columnDispRslt_mng_dpt_cd) return doDispRslt_mng_dpt_cd_VC(info);
		if (vc == columnDispRslt_mng_dpt_nm) return doDispRslt_mng_dpt_nm_VC(info);
		if (vc == columnDispRslt_site_cd) return doDispRslt_site_cd_VC(info);
		if (vc == columnDispRslt_site_nm) return doDispRslt_site_nm_VC(info);
		if (vc == columnDispRslt_loc_cd) return doDispRslt_loc_cd_VC(info);
		if (vc == columnDispRslt_loc_nm) return doDispRslt_loc_nm_VC(info);
		if (vc == columnDispRslt_str_ln_cd) return doDispRslt_str_ln_cd_VC(info);
		if (vc == columnDispRslt_str_ln_nm) return doDispRslt_str_ln_nm_VC(info);
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
	 * [Cnd]パネルの[dpt_lvl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_lvl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_lvl_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[site_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_site_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_key_VC(MCEventInfo info){
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
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_ym_fr) doCnd_ym_fr_NC(info);
		else if (nc == Cnd_ym_to) doCnd_ym_to_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_dpt_lvl_cd) doCnd_dpt_lvl_cd_NC(info);
		else if (nc == Cnd_dpt_lvl_nm) doCnd_dpt_lvl_nm_NC(info);
		else if (nc == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NC(info);
		else if (nc == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_calc_grp_flg) doCnd_calc_grp_flg_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_mng_dpt_flg) doCnd_mng_dpt_flg_NC(info);
		else if (nc == Cnd_site_flg) doCnd_site_flg_NC(info);
		else if (nc == Cnd_loc_flg) doCnd_loc_flg_NC(info);
		else if (nc == Cnd_str_ln_flg) doCnd_str_ln_flg_NC(info);
		else if (nc == Cnd_disp_key) doCnd_disp_key_NC(info);
		else if (nc == Cnd_cur_cd) doCnd_cur_cd_NC(info);
		else if (nc == Cnd_amt_dec_place) doCnd_amt_dec_place_NC(info);
		else if (nc == columnDispRslt_calc_grp_cd) doDispRslt_calc_grp_cd_NC(info);
		else if (nc == columnDispRslt_calc_grp_nm) doDispRslt_calc_grp_nm_NC(info);
		else if (nc == columnDispRslt_wg_cd) doDispRslt_wg_cd_NC(info);
		else if (nc == columnDispRslt_wg_nm) doDispRslt_wg_nm_NC(info);
		else if (nc == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_NC(info);
		else if (nc == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_NC(info);
		else if (nc == columnDispRslt_site_cd) doDispRslt_site_cd_NC(info);
		else if (nc == columnDispRslt_site_nm) doDispRslt_site_nm_NC(info);
		else if (nc == columnDispRslt_loc_cd) doDispRslt_loc_cd_NC(info);
		else if (nc == columnDispRslt_loc_nm) doDispRslt_loc_nm_NC(info);
		else if (nc == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_NC(info);
		else if (nc == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_NC(info);
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
	 * [Cnd]パネルの[dpt_lvl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[site_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_ym_fr) doCnd_ym_fr_NE(info);
		else if (ne == Cnd_ym_to) doCnd_ym_to_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_dpt_lvl_cd) doCnd_dpt_lvl_cd_NE(info);
		else if (ne == Cnd_dpt_lvl_nm) doCnd_dpt_lvl_nm_NE(info);
		else if (ne == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NE(info);
		else if (ne == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_calc_grp_flg) doCnd_calc_grp_flg_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_mng_dpt_flg) doCnd_mng_dpt_flg_NE(info);
		else if (ne == Cnd_site_flg) doCnd_site_flg_NE(info);
		else if (ne == Cnd_loc_flg) doCnd_loc_flg_NE(info);
		else if (ne == Cnd_str_ln_flg) doCnd_str_ln_flg_NE(info);
		else if (ne == Cnd_disp_key) doCnd_disp_key_NE(info);
		else if (ne == Cnd_cur_cd) doCnd_cur_cd_NE(info);
		else if (ne == Cnd_amt_dec_place) doCnd_amt_dec_place_NE(info);
		else if (ne == columnDispRslt_calc_grp_cd) doDispRslt_calc_grp_cd_NE(info);
		else if (ne == columnDispRslt_calc_grp_nm) doDispRslt_calc_grp_nm_NE(info);
		else if (ne == columnDispRslt_wg_cd) doDispRslt_wg_cd_NE(info);
		else if (ne == columnDispRslt_wg_nm) doDispRslt_wg_nm_NE(info);
		else if (ne == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_NE(info);
		else if (ne == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_NE(info);
		else if (ne == columnDispRslt_site_cd) doDispRslt_site_cd_NE(info);
		else if (ne == columnDispRslt_site_nm) doDispRslt_site_nm_NE(info);
		else if (ne == columnDispRslt_loc_cd) doDispRslt_loc_cd_NE(info);
		else if (ne == columnDispRslt_loc_nm) doDispRslt_loc_nm_NE(info);
		else if (ne == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_NE(info);
		else if (ne == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_NE(info);
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
	 * [Cnd]パネルの[dpt_lvl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[site_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_ym_fr) doCnd_ym_fr_NX(info);
		else if (nx == Cnd_ym_to) doCnd_ym_to_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_dpt_lvl_cd) doCnd_dpt_lvl_cd_NX(info);
		else if (nx == Cnd_dpt_lvl_nm) doCnd_dpt_lvl_nm_NX(info);
		else if (nx == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_NX(info);
		else if (nx == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_calc_grp_flg) doCnd_calc_grp_flg_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_mng_dpt_flg) doCnd_mng_dpt_flg_NX(info);
		else if (nx == Cnd_site_flg) doCnd_site_flg_NX(info);
		else if (nx == Cnd_loc_flg) doCnd_loc_flg_NX(info);
		else if (nx == Cnd_str_ln_flg) doCnd_str_ln_flg_NX(info);
		else if (nx == Cnd_disp_key) doCnd_disp_key_NX(info);
		else if (nx == Cnd_cur_cd) doCnd_cur_cd_NX(info);
		else if (nx == Cnd_amt_dec_place) doCnd_amt_dec_place_NX(info);
		else if (nx == columnDispRslt_calc_grp_cd) doDispRslt_calc_grp_cd_NX(info);
		else if (nx == columnDispRslt_calc_grp_nm) doDispRslt_calc_grp_nm_NX(info);
		else if (nx == columnDispRslt_wg_cd) doDispRslt_wg_cd_NX(info);
		else if (nx == columnDispRslt_wg_nm) doDispRslt_wg_nm_NX(info);
		else if (nx == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_NX(info);
		else if (nx == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_NX(info);
		else if (nx == columnDispRslt_site_cd) doDispRslt_site_cd_NX(info);
		else if (nx == columnDispRslt_site_nm) doDispRslt_site_nm_NX(info);
		else if (nx == columnDispRslt_loc_cd) doDispRslt_loc_cd_NX(info);
		else if (nx == columnDispRslt_loc_nm) doDispRslt_loc_nm_NX(info);
		else if (nx == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_NX(info);
		else if (nx == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_NX(info);
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
	 * [Cnd]パネルの[dpt_lvl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[site_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_NX(MCEventInfo info){
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
		if (lc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_LC(info);
		else if (lc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_LC(info);
		else if (lc == Cnd_ym_fr) doCnd_ym_fr_LC(info);
		else if (lc == Cnd_ym_to) doCnd_ym_to_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_dpt_lvl_cd) doCnd_dpt_lvl_cd_LC(info);
		else if (lc == Cnd_dpt_lvl_nm) doCnd_dpt_lvl_nm_LC(info);
		else if (lc == Cnd_mng_dpt_cd) doCnd_mng_dpt_cd_LC(info);
		else if (lc == Cnd_mng_dpt_nm) doCnd_mng_dpt_nm_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_cur_cd) doCnd_cur_cd_LC(info);
		else if (lc == Cnd_amt_dec_place) doCnd_amt_dec_place_LC(info);
		else if (lc == columnDispRslt_calc_grp_cd) doDispRslt_calc_grp_cd_LC(info);
		else if (lc == columnDispRslt_calc_grp_nm) doDispRslt_calc_grp_nm_LC(info);
		else if (lc == columnDispRslt_wg_cd) doDispRslt_wg_cd_LC(info);
		else if (lc == columnDispRslt_wg_nm) doDispRslt_wg_nm_LC(info);
		else if (lc == columnDispRslt_mng_dpt_cd) doDispRslt_mng_dpt_cd_LC(info);
		else if (lc == columnDispRslt_mng_dpt_nm) doDispRslt_mng_dpt_nm_LC(info);
		else if (lc == columnDispRslt_site_cd) doDispRslt_site_cd_LC(info);
		else if (lc == columnDispRslt_site_nm) doDispRslt_site_nm_LC(info);
		else if (lc == columnDispRslt_loc_cd) doDispRslt_loc_cd_LC(info);
		else if (lc == columnDispRslt_loc_nm) doDispRslt_loc_nm_LC(info);
		else if (lc == columnDispRslt_str_ln_cd) doDispRslt_str_ln_cd_LC(info);
		else if (lc == columnDispRslt_str_ln_nm) doDispRslt_str_ln_nm_LC(info);
		else if (lc == columnDispRslt_elm_no) doDispRslt_elm_no_LC(info);
		else if (lc == columnDispRslt_elm) doDispRslt_elm_LC(info);
		else if (lc == columnDispRslt_elm_nm) doDispRslt_elm_nm_LC(info);
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
	 * [Cnd]パネルの[dpt_lvl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_dpt_lvl_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_lvl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDptLvl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mng_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_mng_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBFL0430.Srch01")) {
			return new MG_MGBFL0430_Srch01Bridge();
		}
		if (id.equals("MG.MGBFL0430.Srch02")) {
			return new MG_MGBFL0430_Srch02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBFL0430_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0430_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0430_Srch01;

		/** コンストラクタ */
		protected MG_MGBFL0430_Srch01Bridge() {
			p_MG_MGBFL0430_Srch01 = new MCParam(PDef.MG_MGBFL0430_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0430_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBF.MGBFP0430.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0430.RsltR.class));

			p_MG_MGBFL0430_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0430_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0430_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0430_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0430_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBF.MGBFP0430.CndR up0() {
			return (mcframe.clientMGBF.MGBFP0430.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBF.MGBFP0430.RsltR> down0() {
			return (MCList<mcframe.clientMGBF.MGBFP0430.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0430_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0430.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0430_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBF.MGBFP0430.RsltR>)p_MG_MGBFL0430_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBFL0430_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0430_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0430_Srch02;

		/** コンストラクタ */
		protected MG_MGBFL0430_Srch02Bridge() {
			p_MG_MGBFL0430_Srch02 = new MCParam(PDef.MG_MGBFL0430_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0430_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBF.MGBFP0430.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0430.RsltR.class));

			p_MG_MGBFL0430_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0430_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0430_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0430_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0430_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBF.MGBFP0430.CndR up0() {
			return (mcframe.clientMGBF.MGBFP0430.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBF.MGBFP0430.RsltR> down0() {
			return (MCList<mcframe.clientMGBF.MGBFP0430.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0430_Srch02.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0430.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0430_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBF.MGBFP0430.RsltR>)p_MG_MGBFL0430_Srch02.getContainerParam().getDownBlock(0));
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