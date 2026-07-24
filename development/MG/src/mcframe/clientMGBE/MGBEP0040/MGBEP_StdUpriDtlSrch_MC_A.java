package mcframe.clientMGBE.MGBEP0040;

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
import mcframe.clientMGBE.MGBEP0040.MGBEP_StdUpriDtlSrch_MC.MG_MGBEL0040_Srch01Caller;
import mcframe.clientMGBE.MGBEP0040.MGBEP_StdUpriDtlSrch_MC.MG_MGBEL0040_Srch02Caller;
import mcframe.clientMGBE.MGBEP0040.MGBEP_StdUpriDtlSrch_MC.MG_MGBEL0040_Srch03Caller;
import mcframe.clientMGBE.MGBEP0040.MGBEP_StdUpriDtlSrch_MC.MG_MGBEL0040_Srch04Caller;

/**
 * 画面"MGBEP_StdUpriDtlSrch"パネルクラスです。<p>
 *
 * 各品目の工数情報や投入情報を参照する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBEP_StdUpriDtlSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBEP0040";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * SELF,Self operation;ALL,All operations SELF,自工程;ALL,全工程.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_SELF = null;
	public MCRadioButton Cnd_ope_ALL = null;
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
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	/**
	 * Display ideal 理論表示.<p>
	 *
	 */
	public MCCheckBox LPnl_theory = null;
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H Hdr_qty_p_PPanel;
	public MCNumberField Hdr_base_qty;	// [Hdr]の[qty_p.qty]を[Hdr_base_qty]としてエイリアス定義。
	public MCTextField Hdr_base_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCTextField Hdr_base_unit_nm = null;
	public MCNumberField Hdr_base_unit_dec_place = null;
	public MCLabel Hdr_std_upri_Label = null;
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumberField Hdr_std_upri = null;
	public MCLabel Hdr_the_upri_Label = null;
	/**
	 * Ideal unit price 理論単価.<p>
	 *
	 */
	public MCNumberField Hdr_the_upri = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [DtlOper]ブロック関連のField定義
	public MCPanel DtlOperPanel = null;
	public MCScrollPane DtlOperScrollPane = null;
	public MCTable2<mcframe.clientMGBE.MGBEP0040.DtlOperR> DtlOperTable = null;
	// [DtlOper]ブロックの項目のField定義
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlOper_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtlOper_loc_nm = null;
	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCColumnConfig columnDtlOper_disp_seq = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlOper_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnDtlOper_oper_nm = null;
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCColumnConfig columnDtlOper_oper_seq = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlOper_std_qty_p_PPanel;
	public MCColumnConfig columnDtlOper_std_qty;// [DtlOper]の[std_qty_p.qty]を[columnDtlOper_std_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlOper_the_qty_p_PPanel;
	public MCColumnConfig columnDtlOper_the_qty;// [DtlOper]の[the_qty_p.qty]を[columnDtlOper_the_qty]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlOper_base_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtlOper_base_unit_nm = null;
	public MCColumnConfig columnDtlOper_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlOper_oper_qty_p_PPanel;
	public MCColumnConfig columnDtlOper_oper_qty;// [DtlOper]の[oper_qty_p.qty]を[columnDtlOper_oper_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlOper_the_oper_qty_p_PPanel;
	public MCColumnConfig columnDtlOper_the_oper_qty;// [DtlOper]の[the_oper_qty_p.qty]を[columnDtlOper_the_oper_qty]としてエイリアス定義。
	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlOper_oper_unit_cd = null;
	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtlOper_oper_unit_nm = null;
	public MCColumnConfig columnDtlOper_oper_dec_place = null;
	public MCColumnConfig columnDtlOper_oper_std_qty = null;
	public MCColumnConfig columnDtlOper_oper_conv_qty = null;
	public MCColumnConfig columnDtlOper_oper_unit_conv_rnd_typ = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	// [Dtl]ブロックの項目のField定義
	// [Disp]ブロック関連のField定義
	public MCPanel DispPanel = null;
	// [Disp]ブロックの項目のField定義
	/**
	 * Display cost element G 費目Ｇ表示.<p>
	 *
	 */
	public MCCheckBox Disp_expns_grp = null;
	/**
	 * Display cost element 費目表示.<p>
	 *
	 */
	public MCCheckBox Disp_expns = null;
	// [DtlTab]ブロック関連のField定義
	public MCPanel DtlTabPanel = null;
	public MCTabbedPane DtlTabTab = null;
	// [DtlTab]ブロックの項目のField定義
	// [DispInpt]ブロック関連のField定義
	public MCPanel DispInptPanel = null;
	public MCScrollPane DispInptScrollPane = null;
	public MCTable2<mcframe.clientMGBE.MGBEP0040.DispInptR> DispInptTable = null;
	// [DispInpt]ブロックの項目のField定義
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D DispInpt_itm_p_PPanel;
	public MCColumnConfig columnDispInpt_itm_cd;// [DispInpt]の[itm_p.itm_cd]を[columnDispInpt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDispInpt_itm_sub1;// [DispInpt]の[itm_p.itm_sub1]を[columnDispInpt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDispInpt_itm_sub2;// [DispInpt]の[itm_p.itm_sub2]を[columnDispInpt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDispInpt_itm_sub3;// [DispInpt]の[itm_p.itm_sub3]を[columnDispInpt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDispInpt_itm_nm;// [DispInpt]の[itm_p.itm_nm]を[columnDispInpt_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_itm_typ_d_nm = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_itm_jnl_nm = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_upri = null;
	/**
	 * Ideal unit price 理論単価.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_the_upri = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispInpt_std_qty_p_PPanel;
	public MCColumnConfig columnDispInpt_std_qty;// [DispInpt]の[std_qty_p.qty]を[columnDispInpt_std_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DispInpt_the_qty_p_PPanel;
	public MCColumnConfig columnDispInpt_the_qty;// [DispInpt]の[the_qty_p.qty]を[columnDispInpt_the_qty]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_base_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_base_unit_nm = null;
	/**
	 * Ideal cost 理論原価.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_the_cost = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_ttl = null;
	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_var_cost = null;
	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public MCColumnConfig columnDispInpt_fxd_cost = null;
	public MCColumnConfig columnDispInpt_col_000 = null;
	public MCColumnConfig columnDispInpt_col_001 = null;
	public MCColumnConfig columnDispInpt_col_002 = null;
	public MCColumnConfig columnDispInpt_col_003 = null;
	public MCColumnConfig columnDispInpt_col_004 = null;
	public MCColumnConfig columnDispInpt_col_005 = null;
	public MCColumnConfig columnDispInpt_col_006 = null;
	public MCColumnConfig columnDispInpt_col_007 = null;
	public MCColumnConfig columnDispInpt_col_008 = null;
	public MCColumnConfig columnDispInpt_col_009 = null;
	public MCColumnConfig columnDispInpt_col_010 = null;
	public MCColumnConfig columnDispInpt_col_011 = null;
	public MCColumnConfig columnDispInpt_col_012 = null;
	public MCColumnConfig columnDispInpt_col_013 = null;
	public MCColumnConfig columnDispInpt_col_014 = null;
	public MCColumnConfig columnDispInpt_col_015 = null;
	public MCColumnConfig columnDispInpt_col_016 = null;
	public MCColumnConfig columnDispInpt_col_017 = null;
	public MCColumnConfig columnDispInpt_col_018 = null;
	public MCColumnConfig columnDispInpt_col_019 = null;
	public MCColumnConfig columnDispInpt_col_020 = null;
	public MCColumnConfig columnDispInpt_col_021 = null;
	public MCColumnConfig columnDispInpt_col_022 = null;
	public MCColumnConfig columnDispInpt_col_023 = null;
	public MCColumnConfig columnDispInpt_col_024 = null;
	public MCColumnConfig columnDispInpt_col_025 = null;
	public MCColumnConfig columnDispInpt_col_026 = null;
	public MCColumnConfig columnDispInpt_col_027 = null;
	public MCColumnConfig columnDispInpt_col_028 = null;
	public MCColumnConfig columnDispInpt_col_029 = null;
	public MCColumnConfig columnDispInpt_col_030 = null;
	public MCColumnConfig columnDispInpt_col_031 = null;
	public MCColumnConfig columnDispInpt_col_032 = null;
	public MCColumnConfig columnDispInpt_col_033 = null;
	public MCColumnConfig columnDispInpt_col_034 = null;
	public MCColumnConfig columnDispInpt_col_035 = null;
	public MCColumnConfig columnDispInpt_col_036 = null;
	public MCColumnConfig columnDispInpt_col_037 = null;
	public MCColumnConfig columnDispInpt_col_038 = null;
	public MCColumnConfig columnDispInpt_col_039 = null;
	public MCColumnConfig columnDispInpt_col_040 = null;
	public MCColumnConfig columnDispInpt_col_041 = null;
	public MCColumnConfig columnDispInpt_col_042 = null;
	public MCColumnConfig columnDispInpt_col_043 = null;
	public MCColumnConfig columnDispInpt_col_044 = null;
	public MCColumnConfig columnDispInpt_col_045 = null;
	public MCColumnConfig columnDispInpt_col_046 = null;
	public MCColumnConfig columnDispInpt_col_047 = null;
	public MCColumnConfig columnDispInpt_col_048 = null;
	public MCColumnConfig columnDispInpt_col_049 = null;
	public MCColumnConfig columnDispInpt_col_050 = null;
	public MCColumnConfig columnDispInpt_col_051 = null;
	public MCColumnConfig columnDispInpt_col_052 = null;
	public MCColumnConfig columnDispInpt_col_053 = null;
	public MCColumnConfig columnDispInpt_col_054 = null;
	public MCColumnConfig columnDispInpt_col_055 = null;
	public MCColumnConfig columnDispInpt_col_056 = null;
	public MCColumnConfig columnDispInpt_col_057 = null;
	public MCColumnConfig columnDispInpt_col_058 = null;
	public MCColumnConfig columnDispInpt_col_059 = null;
	public MCColumnConfig columnDispInpt_col_060 = null;
	public MCColumnConfig columnDispInpt_col_061 = null;
	public MCColumnConfig columnDispInpt_col_062 = null;
	public MCColumnConfig columnDispInpt_col_063 = null;
	public MCColumnConfig columnDispInpt_col_064 = null;
	public MCColumnConfig columnDispInpt_col_065 = null;
	public MCColumnConfig columnDispInpt_col_066 = null;
	public MCColumnConfig columnDispInpt_col_067 = null;
	public MCColumnConfig columnDispInpt_col_068 = null;
	public MCColumnConfig columnDispInpt_col_069 = null;
	public MCColumnConfig columnDispInpt_col_070 = null;
	public MCColumnConfig columnDispInpt_col_071 = null;
	public MCColumnConfig columnDispInpt_col_072 = null;
	public MCColumnConfig columnDispInpt_col_073 = null;
	public MCColumnConfig columnDispInpt_col_074 = null;
	public MCColumnConfig columnDispInpt_col_075 = null;
	public MCColumnConfig columnDispInpt_col_076 = null;
	public MCColumnConfig columnDispInpt_col_077 = null;
	public MCColumnConfig columnDispInpt_col_078 = null;
	public MCColumnConfig columnDispInpt_col_079 = null;
	public MCColumnConfig columnDispInpt_col_080 = null;
	public MCColumnConfig columnDispInpt_col_081 = null;
	public MCColumnConfig columnDispInpt_col_082 = null;
	public MCColumnConfig columnDispInpt_col_083 = null;
	public MCColumnConfig columnDispInpt_col_084 = null;
	public MCColumnConfig columnDispInpt_col_085 = null;
	public MCColumnConfig columnDispInpt_col_086 = null;
	public MCColumnConfig columnDispInpt_col_087 = null;
	public MCColumnConfig columnDispInpt_col_088 = null;
	public MCColumnConfig columnDispInpt_col_089 = null;
	public MCColumnConfig columnDispInpt_col_090 = null;
	public MCColumnConfig columnDispInpt_col_091 = null;
	public MCColumnConfig columnDispInpt_col_092 = null;
	public MCColumnConfig columnDispInpt_col_093 = null;
	public MCColumnConfig columnDispInpt_col_094 = null;
	public MCColumnConfig columnDispInpt_col_095 = null;
	public MCColumnConfig columnDispInpt_col_096 = null;
	public MCColumnConfig columnDispInpt_col_097 = null;
	public MCColumnConfig columnDispInpt_col_098 = null;
	public MCColumnConfig columnDispInpt_col_099 = null;
	// [DispWk]ブロック関連のField定義
	public MCPanel DispWkPanel = null;
	public MCScrollPane DispWkScrollPane = null;
	public MCTable2<mcframe.clientMGBE.MGBEP0040.DispWkR> DispWkTable = null;
	// [DispWk]ブロックの項目のField定義
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispWk_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDispWk_wg_nm = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispWk_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnDispWk_loc_nm = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispWk_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnDispWk_oper_nm = null;
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDispWk_wk_cost_cd = null;
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public MCColumnConfig columnDispWk_wk_cost_nm = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnDispWk_upri = null;
	/**
	 * Ideal unit price 理論単価.<p>
	 *
	 */
	public MCColumnConfig columnDispWk_the_upri = null;
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D DispWk_std_wk_cost_p_PPanel;
	public MCColumnConfig columnDispWk_std_wk_cost;// [DispWk]の[std_wk_cost_p.wk_cost_qty]を[columnDispWk_std_wk_cost]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D DispWk_the_wk_cost_p_PPanel;
	public MCColumnConfig columnDispWk_the_wk_cost;// [DispWk]の[the_wk_cost_p.wk_cost_qty]を[columnDispWk_the_wk_cost]としてエイリアス定義。
	/**
	 * Man-hour unit name 工数単位名.<p>
	 *
	 */
	public MCColumnConfig columnDispWk_wk_cost_unit_nm = null;
	public MCColumnConfig columnDispWk_dec_place = null;
	/**
	 * Ideal cost 理論原価.<p>
	 *
	 */
	public MCColumnConfig columnDispWk_the_cost = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnDispWk_ttl = null;
	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public MCColumnConfig columnDispWk_var_cost = null;
	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public MCColumnConfig columnDispWk_fxd_cost = null;
	public MCColumnConfig columnDispWk_col_000 = null;
	public MCColumnConfig columnDispWk_col_001 = null;
	public MCColumnConfig columnDispWk_col_002 = null;
	public MCColumnConfig columnDispWk_col_003 = null;
	public MCColumnConfig columnDispWk_col_004 = null;
	public MCColumnConfig columnDispWk_col_005 = null;
	public MCColumnConfig columnDispWk_col_006 = null;
	public MCColumnConfig columnDispWk_col_007 = null;
	public MCColumnConfig columnDispWk_col_008 = null;
	public MCColumnConfig columnDispWk_col_009 = null;
	public MCColumnConfig columnDispWk_col_010 = null;
	public MCColumnConfig columnDispWk_col_011 = null;
	public MCColumnConfig columnDispWk_col_012 = null;
	public MCColumnConfig columnDispWk_col_013 = null;
	public MCColumnConfig columnDispWk_col_014 = null;
	public MCColumnConfig columnDispWk_col_015 = null;
	public MCColumnConfig columnDispWk_col_016 = null;
	public MCColumnConfig columnDispWk_col_017 = null;
	public MCColumnConfig columnDispWk_col_018 = null;
	public MCColumnConfig columnDispWk_col_019 = null;
	public MCColumnConfig columnDispWk_col_020 = null;
	public MCColumnConfig columnDispWk_col_021 = null;
	public MCColumnConfig columnDispWk_col_022 = null;
	public MCColumnConfig columnDispWk_col_023 = null;
	public MCColumnConfig columnDispWk_col_024 = null;
	public MCColumnConfig columnDispWk_col_025 = null;
	public MCColumnConfig columnDispWk_col_026 = null;
	public MCColumnConfig columnDispWk_col_027 = null;
	public MCColumnConfig columnDispWk_col_028 = null;
	public MCColumnConfig columnDispWk_col_029 = null;
	public MCColumnConfig columnDispWk_col_030 = null;
	public MCColumnConfig columnDispWk_col_031 = null;
	public MCColumnConfig columnDispWk_col_032 = null;
	public MCColumnConfig columnDispWk_col_033 = null;
	public MCColumnConfig columnDispWk_col_034 = null;
	public MCColumnConfig columnDispWk_col_035 = null;
	public MCColumnConfig columnDispWk_col_036 = null;
	public MCColumnConfig columnDispWk_col_037 = null;
	public MCColumnConfig columnDispWk_col_038 = null;
	public MCColumnConfig columnDispWk_col_039 = null;
	public MCColumnConfig columnDispWk_col_040 = null;
	public MCColumnConfig columnDispWk_col_041 = null;
	public MCColumnConfig columnDispWk_col_042 = null;
	public MCColumnConfig columnDispWk_col_043 = null;
	public MCColumnConfig columnDispWk_col_044 = null;
	public MCColumnConfig columnDispWk_col_045 = null;
	public MCColumnConfig columnDispWk_col_046 = null;
	public MCColumnConfig columnDispWk_col_047 = null;
	public MCColumnConfig columnDispWk_col_048 = null;
	public MCColumnConfig columnDispWk_col_049 = null;
	public MCColumnConfig columnDispWk_col_050 = null;
	public MCColumnConfig columnDispWk_col_051 = null;
	public MCColumnConfig columnDispWk_col_052 = null;
	public MCColumnConfig columnDispWk_col_053 = null;
	public MCColumnConfig columnDispWk_col_054 = null;
	public MCColumnConfig columnDispWk_col_055 = null;
	public MCColumnConfig columnDispWk_col_056 = null;
	public MCColumnConfig columnDispWk_col_057 = null;
	public MCColumnConfig columnDispWk_col_058 = null;
	public MCColumnConfig columnDispWk_col_059 = null;
	public MCColumnConfig columnDispWk_col_060 = null;
	public MCColumnConfig columnDispWk_col_061 = null;
	public MCColumnConfig columnDispWk_col_062 = null;
	public MCColumnConfig columnDispWk_col_063 = null;
	public MCColumnConfig columnDispWk_col_064 = null;
	public MCColumnConfig columnDispWk_col_065 = null;
	public MCColumnConfig columnDispWk_col_066 = null;
	public MCColumnConfig columnDispWk_col_067 = null;
	public MCColumnConfig columnDispWk_col_068 = null;
	public MCColumnConfig columnDispWk_col_069 = null;
	public MCColumnConfig columnDispWk_col_070 = null;
	public MCColumnConfig columnDispWk_col_071 = null;
	public MCColumnConfig columnDispWk_col_072 = null;
	public MCColumnConfig columnDispWk_col_073 = null;
	public MCColumnConfig columnDispWk_col_074 = null;
	public MCColumnConfig columnDispWk_col_075 = null;
	public MCColumnConfig columnDispWk_col_076 = null;
	public MCColumnConfig columnDispWk_col_077 = null;
	public MCColumnConfig columnDispWk_col_078 = null;
	public MCColumnConfig columnDispWk_col_079 = null;
	public MCColumnConfig columnDispWk_col_080 = null;
	public MCColumnConfig columnDispWk_col_081 = null;
	public MCColumnConfig columnDispWk_col_082 = null;
	public MCColumnConfig columnDispWk_col_083 = null;
	public MCColumnConfig columnDispWk_col_084 = null;
	public MCColumnConfig columnDispWk_col_085 = null;
	public MCColumnConfig columnDispWk_col_086 = null;
	public MCColumnConfig columnDispWk_col_087 = null;
	public MCColumnConfig columnDispWk_col_088 = null;
	public MCColumnConfig columnDispWk_col_089 = null;
	public MCColumnConfig columnDispWk_col_090 = null;
	public MCColumnConfig columnDispWk_col_091 = null;
	public MCColumnConfig columnDispWk_col_092 = null;
	public MCColumnConfig columnDispWk_col_093 = null;
	public MCColumnConfig columnDispWk_col_094 = null;
	public MCColumnConfig columnDispWk_col_095 = null;
	public MCColumnConfig columnDispWk_col_096 = null;
	public MCColumnConfig columnDispWk_col_097 = null;
	public MCColumnConfig columnDispWk_col_098 = null;
	public MCColumnConfig columnDispWk_col_099 = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Standard item operation cost 標準品目工程原価一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MGBEP0020 = null;
	/** [SRCH_SELF]モードを表す定数 */
	public static final String SRCH_SELF = "SRCH_SELF";
	/** [SRCH_ALL]モードを表す定数 */
	public static final String SRCH_ALL = "SRCH_ALL";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_SELF, SRCH_ALL};
	
	/** [MG_MGBEL0040_Srch01]のCallerの作成 */
	protected MGBEP_StdUpriDtlSrch_MC.MG_MGBEL0040_Srch01Caller createMG_MGBEL0040_Srch01() {
		MGBEP_StdUpriDtlSrch_MC.MG_MGBEL0040_Srch01Caller<MGBEP_StdUpriDtlSrch, MG_MGBEL0040_Srch01Bridge>
		caller = ((MGBEP_StdUpriDtlSrch_MC)this).new MG_MGBEL0040_Srch01Caller<MGBEP_StdUpriDtlSrch, MG_MGBEL0040_Srch01Bridge>(
					(MGBEP_StdUpriDtlSrch)this, new MG_MGBEL0040_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBEL0040_Srch01]の呼び出し */
	protected void callMG_MGBEL0040_Srch01() {
		MCCaller caller = createMG_MGBEL0040_Srch01();
		caller.exec();
	}
	/** [MG_MGBEL0040_Srch02]のCallerの作成 */
	protected MGBEP_StdUpriDtlSrch_MC.MG_MGBEL0040_Srch02Caller createMG_MGBEL0040_Srch02() {
		MGBEP_StdUpriDtlSrch_MC.MG_MGBEL0040_Srch02Caller<MGBEP_StdUpriDtlSrch, MG_MGBEL0040_Srch02Bridge>
		caller = ((MGBEP_StdUpriDtlSrch_MC)this).new MG_MGBEL0040_Srch02Caller<MGBEP_StdUpriDtlSrch, MG_MGBEL0040_Srch02Bridge>(
					(MGBEP_StdUpriDtlSrch)this, new MG_MGBEL0040_Srch02Bridge());
		return caller;
	}
	/** [MG_MGBEL0040_Srch02]の呼び出し */
	protected void callMG_MGBEL0040_Srch02() {
		MCCaller caller = createMG_MGBEL0040_Srch02();
		caller.exec();
	}
	/** [MG_MGBEL0040_Srch03]のCallerの作成 */
	protected MGBEP_StdUpriDtlSrch_MC.MG_MGBEL0040_Srch03Caller createMG_MGBEL0040_Srch03() {
		MGBEP_StdUpriDtlSrch_MC.MG_MGBEL0040_Srch03Caller<MGBEP_StdUpriDtlSrch, MG_MGBEL0040_Srch03Bridge>
		caller = ((MGBEP_StdUpriDtlSrch_MC)this).new MG_MGBEL0040_Srch03Caller<MGBEP_StdUpriDtlSrch, MG_MGBEL0040_Srch03Bridge>(
					(MGBEP_StdUpriDtlSrch)this, new MG_MGBEL0040_Srch03Bridge());
		return caller;
	}
	/** [MG_MGBEL0040_Srch03]の呼び出し */
	protected void callMG_MGBEL0040_Srch03() {
		MCCaller caller = createMG_MGBEL0040_Srch03();
		caller.exec();
	}
	/** [MG_MGBEL0040_Srch04]のCallerの作成 */
	protected MGBEP_StdUpriDtlSrch_MC.MG_MGBEL0040_Srch04Caller createMG_MGBEL0040_Srch04() {
		MGBEP_StdUpriDtlSrch_MC.MG_MGBEL0040_Srch04Caller<MGBEP_StdUpriDtlSrch, MG_MGBEL0040_Srch04Bridge>
		caller = ((MGBEP_StdUpriDtlSrch_MC)this).new MG_MGBEL0040_Srch04Caller<MGBEP_StdUpriDtlSrch, MG_MGBEL0040_Srch04Bridge>(
					(MGBEP_StdUpriDtlSrch)this, new MG_MGBEL0040_Srch04Bridge());
		return caller;
	}
	/** [MG_MGBEL0040_Srch04]の呼び出し */
	protected void callMG_MGBEL0040_Srch04() {
		MCCaller caller = createMG_MGBEL0040_Srch04();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBE.MGBEP0040.CndR aCndR;
	/** [LPnl]ブロックのコンテナField定義 */
	private final mcframe.clientMGBE.MGBEP0040.LPnlR aLPnlR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMGBE.MGBEP0040.HdrR aHdrR;
	/** [DtlOper]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBE.MGBEP0040.DtlOperR> aDtlOperL;
	/** [Disp]ブロックのコンテナField定義 */
	private final mcframe.clientMGBE.MGBEP0040.DispR aDispR;
	/** [DispInpt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBE.MGBEP0040.DispInptR> aDispInptL;
	/** [DispWk]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBE.MGBEP0040.DispWkR> aDispWkL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBE.MGBEP0040.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBE.MGBEP0040.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBE.MGBEP0040.CndR createCndR() {
		return mcframe.clientMGBE.MGBEP0040.CndR.create();
	}

	/**
	 * 項目コピーによってaLPnlRを設定します。
	 *
	 * aLPnlRのインスタンスは変更されません。
	 *
	 * @param row LPnlR
	 */
	public void setLPnlR(mcframe.clientMGBE.MGBEP0040.LPnlR row) {
		if (row != null) {
			MCRow.copyall(getLPnlR(), row);
		}
	}

	/**
	 * [LPnl]ブロックのコンテナaLPnlRを返します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMGBE.MGBEP0040.LPnlR getLPnlR() {
		return aLPnlR;
	}

	/**
	 * aLPnlRを作成します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMGBE.MGBEP0040.LPnlR createLPnlR() {
		return mcframe.clientMGBE.MGBEP0040.LPnlR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMGBE.MGBEP0040.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMGBE.MGBEP0040.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMGBE.MGBEP0040.HdrR createHdrR() {
		return mcframe.clientMGBE.MGBEP0040.HdrR.create();
	}

	/**
	 * コピーによってaDtlOperLを設定します。
	 *
	 * aDtlOperLのインスタンスは変更されません。
	 *
	 * @param dataset DtlOperL
	 */
	public void setDtlOperL(MCList<mcframe.clientMGBE.MGBEP0040.DtlOperR> aList) {
		if (getDtlOperL() != aList) {
			getDtlOperL().setAll(aList);
		}
	}

	/**
	 * [DtlOper]ブロックのコンテナaDtlOperLを返します。
	 *
	 * @return DtlOperL
	 */
	public MCList<mcframe.clientMGBE.MGBEP0040.DtlOperR> getDtlOperL() {
		return aDtlOperL;
	}

	/**
	 * aDtlOperRを作成します。
	 *
	 * @return DtlOperR
	 */
	public mcframe.clientMGBE.MGBEP0040.DtlOperR createDtlOperR() {
		return mcframe.clientMGBE.MGBEP0040.DtlOperR.create();
	}

	/**
	 * aDtlOperLを作成します。
	 *
	 * @return DtlOperL
	 */
	public MCList<mcframe.clientMGBE.MGBEP0040.DtlOperR> createDtlOperL() {
		return MCList.create(mcframe.clientMGBE.MGBEP0040.DtlOperR.class);
	}

	/**
	 * DtlOperTableを初期化します。
	 */
	protected void createDtlOperTable(){
		if(DtlOperTable == null){
			DtlOperTable = beansFactory.createTable2("DtlOper.table");
		}
	}

	/**
	 * 項目コピーによってaDispRを設定します。
	 *
	 * aDispRのインスタンスは変更されません。
	 *
	 * @param row DispR
	 */
	public void setDispR(mcframe.clientMGBE.MGBEP0040.DispR row) {
		if (row != null) {
			MCRow.copyall(getDispR(), row);
		}
	}

	/**
	 * [Disp]ブロックのコンテナaDispRを返します。
	 *
	 * @return DispR
	 */
	public mcframe.clientMGBE.MGBEP0040.DispR getDispR() {
		return aDispR;
	}

	/**
	 * aDispRを作成します。
	 *
	 * @return DispR
	 */
	public mcframe.clientMGBE.MGBEP0040.DispR createDispR() {
		return mcframe.clientMGBE.MGBEP0040.DispR.create();
	}

	/**
	 * コピーによってaDispInptLを設定します。
	 *
	 * aDispInptLのインスタンスは変更されません。
	 *
	 * @param dataset DispInptL
	 */
	public void setDispInptL(MCList<mcframe.clientMGBE.MGBEP0040.DispInptR> aList) {
		if (getDispInptL() != aList) {
			getDispInptL().setAll(aList);
		}
	}

	/**
	 * [DispInpt]ブロックのコンテナaDispInptLを返します。
	 *
	 * @return DispInptL
	 */
	public MCList<mcframe.clientMGBE.MGBEP0040.DispInptR> getDispInptL() {
		return aDispInptL;
	}

	/**
	 * aDispInptRを作成します。
	 *
	 * @return DispInptR
	 */
	public mcframe.clientMGBE.MGBEP0040.DispInptR createDispInptR() {
		return mcframe.clientMGBE.MGBEP0040.DispInptR.create();
	}

	/**
	 * aDispInptLを作成します。
	 *
	 * @return DispInptL
	 */
	public MCList<mcframe.clientMGBE.MGBEP0040.DispInptR> createDispInptL() {
		return MCList.create(mcframe.clientMGBE.MGBEP0040.DispInptR.class);
	}

	/**
	 * DispInptTableを初期化します。
	 */
	protected void createDispInptTable(){
		if(DispInptTable == null){
			DispInptTable = beansFactory.createTable2("DispInpt.table");
		}
	}

	/**
	 * コピーによってaDispWkLを設定します。
	 *
	 * aDispWkLのインスタンスは変更されません。
	 *
	 * @param dataset DispWkL
	 */
	public void setDispWkL(MCList<mcframe.clientMGBE.MGBEP0040.DispWkR> aList) {
		if (getDispWkL() != aList) {
			getDispWkL().setAll(aList);
		}
	}

	/**
	 * [DispWk]ブロックのコンテナaDispWkLを返します。
	 *
	 * @return DispWkL
	 */
	public MCList<mcframe.clientMGBE.MGBEP0040.DispWkR> getDispWkL() {
		return aDispWkL;
	}

	/**
	 * aDispWkRを作成します。
	 *
	 * @return DispWkR
	 */
	public mcframe.clientMGBE.MGBEP0040.DispWkR createDispWkR() {
		return mcframe.clientMGBE.MGBEP0040.DispWkR.create();
	}

	/**
	 * aDispWkLを作成します。
	 *
	 * @return DispWkL
	 */
	public MCList<mcframe.clientMGBE.MGBEP0040.DispWkR> createDispWkL() {
		return MCList.create(mcframe.clientMGBE.MGBEP0040.DispWkR.class);
	}

	/**
	 * DispWkTableを初期化します。
	 */
	protected void createDispWkTable(){
		if(DispWkTable == null){
			DispWkTable = beansFactory.createTable2("DispWk.table");
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
		if(!MCCollectionUtil.contains(ret, getLPnlR())) ret.add(getLPnlR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getDtlOperL())) ret.add(getDtlOperL());
		if(!MCCollectionUtil.contains(ret, getDispR())) ret.add(getDispR());
		if(!MCCollectionUtil.contains(ret, getDispInptL())) ret.add(getDispInptL());
		if(!MCCollectionUtil.contains(ret, getDispWkL())) ret.add(getDispWkL());
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
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getDtlOperL()) return "DtlOper";
		if(aCnt == getDispR()) return "Disp";
		if(aCnt == getDispInptL()) return "DispInpt";
		if(aCnt == getDispWkL()) return "DispWk";
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
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("DtlOper")) return getDtlOperL();
		if(bId.equals("Disp")) return getDispR();
		if(bId.equals("DispInpt")) return getDispInptL();
		if(bId.equals("DispWk")) return getDispWkL();
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
		ret.add(CndPanel);
		ret.add(LPnlPanel);
		ret.add(HdrPanel);
		ret.add(CtrlPanel);
		ret.add(DtlOperPanel);
		ret.add(DtlPanel);
		ret.add(DispPanel);
		ret.add(DtlTabPanel);
		ret.add(DispInptPanel);
		ret.add(DispWkPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBEP_StdUpriDtlSrch_MC_A() {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aHdrR = createHdrR();
		aDtlOperL = createDtlOperL();
		aDispR = createDispR();
		aDispInptL = createDispInptL();
		aDispWkL = createDispWkL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBEP_StdUpriDtlSrch_MC_A(String name) {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aHdrR = createHdrR();
		aDtlOperL = createDtlOperL();
		createDtlOperTable();
		DtlOperTable.setRowName(name);
		aDispR = createDispR();
		aDispInptL = createDispInptL();
		createDispInptTable();
		DispInptTable.setRowName(name);
		aDispWkL = createDispWkL();
		createDispWkTable();
		DispWkTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBEP_StdUpriDtlSrch_MC.jbCreateScreenOpe((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbCreateTop((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbCreateCnd((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbCreateLPnl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbCreateHdr((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbCreateCtrl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbCreateDtlOper((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbCreateDtl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbCreateDisp((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbCreateDtlTab((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbCreateDispInpt((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbCreateDispWk((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbCreateBtn((MGBEP_StdUpriDtlSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBEP_StdUpriDtlSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBEP_StdUpriDtlSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBEP_StdUpriDtlSrch p) {
		p.Cnd_calc_no_p_PPanel = mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.create(p.getCndR().calc_no_p());
		p.Cnd_calc_no_p_PPanel.setName("Cnd.calc_no_p");
		p.Cnd_calc_no = p.Cnd_calc_no_p_PPanel.CalcNo_calc_no;
		p.Cnd_calc_no.addAliasName("Cnd.calc_no", p);
		p.Cnd_rmrks = p.Cnd_calc_no_p_PPanel.CalcNo_rmrks;
		p.Cnd_rmrks.addAliasName("Cnd.rmrks", p);
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
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MGBEP_StdUpriDtlSrch p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MGBEP_StdUpriDtlSrch p) {
		p.Hdr_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrR().qty_p());
		p.Hdr_qty_p_PPanel.setName("Hdr.qty_p");
		p.Hdr_base_qty = p.Hdr_qty_p_PPanel.Qty_qty;
		p.Hdr_base_qty.addAliasName("Hdr.base_qty", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBEP_StdUpriDtlSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [DtlOper]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlOper(MGBEP_StdUpriDtlSrch p) {
		p.DtlOper_std_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBE.MGBEP0040.DtlOperR.$std_qty_p);
		p.DtlOper_std_qty_p_PPanel.setName("DtlOper.std_qty_p");
		p.columnDtlOper_std_qty = p.DtlOper_std_qty_p_PPanel.columnQty_qty;
		p.columnDtlOper_std_qty.addAliasName("DtlOper.std_qty", p);
		p.DtlOper_the_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBE.MGBEP0040.DtlOperR.$the_qty_p);
		p.DtlOper_the_qty_p_PPanel.setName("DtlOper.the_qty_p");
		p.columnDtlOper_the_qty = p.DtlOper_the_qty_p_PPanel.columnQty_qty;
		p.columnDtlOper_the_qty.addAliasName("DtlOper.the_qty", p);
		p.DtlOper_oper_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBE.MGBEP0040.DtlOperR.$oper_qty_p);
		p.DtlOper_oper_qty_p_PPanel.setName("DtlOper.oper_qty_p");
		p.columnDtlOper_oper_qty = p.DtlOper_oper_qty_p_PPanel.columnQty_qty;
		p.columnDtlOper_oper_qty.addAliasName("DtlOper.oper_qty", p);
		p.DtlOper_the_oper_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBE.MGBEP0040.DtlOperR.$the_oper_qty_p);
		p.DtlOper_the_oper_qty_p_PPanel.setName("DtlOper.the_oper_qty_p");
		p.columnDtlOper_the_oper_qty = p.DtlOper_the_oper_qty_p_PPanel.columnQty_qty;
		p.columnDtlOper_the_oper_qty.addAliasName("DtlOper.the_oper_qty", p);
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MGBEP_StdUpriDtlSrch p) {
	}

	/**
	 * [Disp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDisp(MGBEP_StdUpriDtlSrch p) {
	}

	/**
	 * [DtlTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlTab(MGBEP_StdUpriDtlSrch p) {
	}

	/**
	 * [DispInpt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispInpt(MGBEP_StdUpriDtlSrch p) {
		p.DispInpt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBE.MGBEP0040.DispInptR.$itm_p);
		p.DispInpt_itm_p_PPanel.setName("DispInpt.itm_p");
		p.columnDispInpt_itm_cd = p.DispInpt_itm_p_PPanel.columnItm_itm_cd;
		p.columnDispInpt_itm_cd.addAliasName("DispInpt.itm_cd", p);
		p.columnDispInpt_itm_sub1 = p.DispInpt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDispInpt_itm_sub1.addAliasName("DispInpt.itm_sub1", p);
		p.columnDispInpt_itm_sub2 = p.DispInpt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDispInpt_itm_sub2.addAliasName("DispInpt.itm_sub2", p);
		p.columnDispInpt_itm_sub3 = p.DispInpt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDispInpt_itm_sub3.addAliasName("DispInpt.itm_sub3", p);
		p.columnDispInpt_itm_nm = p.DispInpt_itm_p_PPanel.columnItm_itm_nm;
		p.columnDispInpt_itm_nm.addAliasName("DispInpt.itm_nm", p);
		p.DispInpt_std_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBE.MGBEP0040.DispInptR.$std_qty_p);
		p.DispInpt_std_qty_p_PPanel.setName("DispInpt.std_qty_p");
		p.columnDispInpt_std_qty = p.DispInpt_std_qty_p_PPanel.columnQty_qty;
		p.columnDispInpt_std_qty.addAliasName("DispInpt.std_qty", p);
		p.DispInpt_the_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBE.MGBEP0040.DispInptR.$the_qty_p);
		p.DispInpt_the_qty_p_PPanel.setName("DispInpt.the_qty_p");
		p.columnDispInpt_the_qty = p.DispInpt_the_qty_p_PPanel.columnQty_qty;
		p.columnDispInpt_the_qty.addAliasName("DispInpt.the_qty", p);
	}

	/**
	 * [DispWk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispWk(MGBEP_StdUpriDtlSrch p) {
		p.DispWk_std_wk_cost_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBE.MGBEP0040.DispWkR.$std_wk_cost_p);
		p.DispWk_std_wk_cost_p_PPanel.setName("DispWk.std_wk_cost_p");
		p.columnDispWk_std_wk_cost = p.DispWk_std_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnDispWk_std_wk_cost.addAliasName("DispWk.std_wk_cost", p);
		p.DispWk_the_wk_cost_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBE.MGBEP0040.DispWkR.$the_wk_cost_p);
		p.DispWk_the_wk_cost_p_PPanel.setName("DispWk.the_wk_cost_p");
		p.columnDispWk_the_wk_cost = p.DispWk_the_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnDispWk_the_wk_cost.addAliasName("DispWk.the_wk_cost", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBEP_StdUpriDtlSrch p) {
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
			Cnd_calc_no_p_PPanel_CalcNo_calc_no_p = createCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(Cnd_calc_no_p_PPanel.CalcNo_calc_no, "calc_no", "rmrks");
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBEP_StdUpriDtlSrch create(){
		MGBEP_StdUpriDtlSrch p = new MGBEP_StdUpriDtlSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBEP_StdUpriDtlSrch create(String name){
		MGBEP_StdUpriDtlSrch p = new MGBEP_StdUpriDtlSrch(name);
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
		MGBEP_StdUpriDtlSrch_MC.jbfInitScreenOpe((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbfInitTop((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbfInitCnd((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbfInitLPnl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbfInitHdr((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbfInitCtrl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbfInitDtlOper((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbfInitDtl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbfInitDisp((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbfInitDtlTab((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbfInitDispInpt((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbfInitDispWk((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbfInitBtn((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbInitScreenOpe((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbInitTop((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbInitCnd((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbInitLPnl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbInitHdr((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbInitCtrl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbInitDtlOper((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbInitDtl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbInitDisp((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbInitDtlTab((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbInitDispInpt((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbInitDispWk((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.jbInitBtn((MGBEP_StdUpriDtlSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_SELF = p.beansFactory.createRadioButton("Cnd.ope_SELF");
		p.Cnd_ope_ALL = p.beansFactory.createRadioButton("Cnd.ope_ALL");
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
		p.LPnl_theory = p.beansFactory.createCheckBox("LPnl.theory");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_base_unit_cd = p.beansFactory.createTextField("Hdr.base_unit_cd");
		p.Hdr_base_unit_nm = p.beansFactory.createTextField("Hdr.base_unit_nm");
		p.Hdr_base_unit_dec_place = p.beansFactory.createNumberField("Hdr.base_unit_dec_place");
		p.Hdr_std_upri_Label = p.beansFactory.createLabel("Hdr.std_upri_Label");
		p.Hdr_std_upri = p.beansFactory.createNumberField("Hdr.std_upri");
		p.Hdr_std_upri.setLabel(p.Hdr_std_upri_Label);
		p.Hdr_the_upri_Label = p.beansFactory.createLabel("Hdr.the_upri_Label");
		p.Hdr_the_upri = p.beansFactory.createNumberField("Hdr.the_upri");
		p.Hdr_the_upri.setLabel(p.Hdr_the_upri_Label);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlOper]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlOper(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.DtlOperPanel = p.beansFactory.createPanel("DtlOper");
		p.DtlOperScrollPane = p.beansFactory.createScrollPane("DtlOper.scroll");
		p.createDtlOperTable();
		// ブロックの項目の初期化
		p.columnDtlOper_loc_cd = p.beansFactory.createTableColumn("DtlOper.loc_cd", MCColumnType.TEXT);
		p.columnDtlOper_loc_nm = p.beansFactory.createTableColumn("DtlOper.loc_nm", MCColumnType.TEXT);
		p.columnDtlOper_disp_seq = p.beansFactory.createTableColumn("DtlOper.disp_seq", MCColumnType.NUMBER);
		p.columnDtlOper_oper_cd = p.beansFactory.createTableColumn("DtlOper.oper_cd", MCColumnType.TEXT);
		p.columnDtlOper_oper_nm = p.beansFactory.createTableColumn("DtlOper.oper_nm", MCColumnType.TEXT);
		p.columnDtlOper_oper_seq = p.beansFactory.createTableColumn("DtlOper.oper_seq", MCColumnType.NUMBER);
		p.columnDtlOper_base_unit_cd = p.beansFactory.createTableColumn("DtlOper.base_unit_cd", MCColumnType.TEXT);
		p.columnDtlOper_base_unit_nm = p.beansFactory.createTableColumn("DtlOper.base_unit_nm", MCColumnType.TEXT);
		p.columnDtlOper_base_unit_dec_place = p.beansFactory.createTableColumn("DtlOper.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtlOper_oper_unit_cd = p.beansFactory.createTableColumn("DtlOper.oper_unit_cd", MCColumnType.TEXT);
		p.columnDtlOper_oper_unit_nm = p.beansFactory.createTableColumn("DtlOper.oper_unit_nm", MCColumnType.TEXT);
		p.columnDtlOper_oper_dec_place = p.beansFactory.createTableColumn("DtlOper.oper_dec_place", MCColumnType.NUMBER);
		p.columnDtlOper_oper_std_qty = p.beansFactory.createTableColumn("DtlOper.oper_std_qty", MCColumnType.NUMBER);
		p.columnDtlOper_oper_conv_qty = p.beansFactory.createTableColumn("DtlOper.oper_conv_qty", MCColumnType.NUMBER);
		p.columnDtlOper_oper_unit_conv_rnd_typ = p.beansFactory.createTableColumn("DtlOper.oper_unit_conv_rnd_typ", MCColumnType.TEXT);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		// ブロックの項目の初期化
	}

	/**
	 * [Disp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDisp(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.DispPanel = p.beansFactory.createPanel("Disp");
		// ブロックの項目の初期化
		p.Disp_expns_grp = p.beansFactory.createCheckBox("Disp.expns_grp");
		p.Disp_expns = p.beansFactory.createCheckBox("Disp.expns");
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlTab(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.DtlTabPanel = p.beansFactory.createPanel("DtlTab");
		p.DtlTabTab = p.beansFactory.createTabbedPane("DtlTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [DispInpt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispInpt(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.DispInptPanel = p.beansFactory.createPanel("DispInpt");
		p.DispInptScrollPane = p.beansFactory.createScrollPane("DispInpt.scroll");
		p.createDispInptTable();
		// ブロックの項目の初期化
		p.columnDispInpt_wg_cd = p.beansFactory.createTableColumn("DispInpt.wg_cd", MCColumnType.TEXT);
		p.columnDispInpt_wg_nm = p.beansFactory.createTableColumn("DispInpt.wg_nm", MCColumnType.TEXT);
		p.columnDispInpt_itm_typ = p.beansFactory.createTableColumn("DispInpt.itm_typ", MCColumnType.TEXT);
		p.columnDispInpt_itm_typ_nm = p.beansFactory.createTableColumn("DispInpt.itm_typ_nm", MCColumnType.TEXT);
		p.columnDispInpt_itm_typ_d_cd = p.beansFactory.createTableColumn("DispInpt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDispInpt_itm_typ_d_nm = p.beansFactory.createTableColumn("DispInpt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDispInpt_itm_jnl_cd = p.beansFactory.createTableColumn("DispInpt.itm_jnl_cd", MCColumnType.TEXT);
		p.columnDispInpt_itm_jnl_nm = p.beansFactory.createTableColumn("DispInpt.itm_jnl_nm", MCColumnType.TEXT);
		p.columnDispInpt_upri = p.beansFactory.createTableColumn("DispInpt.upri", MCColumnType.NUMBER);
		p.columnDispInpt_the_upri = p.beansFactory.createTableColumn("DispInpt.the_upri", MCColumnType.NUMBER);
		p.columnDispInpt_base_unit_cd = p.beansFactory.createTableColumn("DispInpt.base_unit_cd", MCColumnType.TEXT);
		p.columnDispInpt_base_unit_nm = p.beansFactory.createTableColumn("DispInpt.base_unit_nm", MCColumnType.TEXT);
		p.columnDispInpt_the_cost = p.beansFactory.createTableColumn("DispInpt.the_cost", MCColumnType.NUMBER);
		p.columnDispInpt_ttl = p.beansFactory.createTableColumn("DispInpt.ttl", MCColumnType.NUMBER);
		p.columnDispInpt_var_cost = p.beansFactory.createTableColumn("DispInpt.var_cost", MCColumnType.NUMBER);
		p.columnDispInpt_fxd_cost = p.beansFactory.createTableColumn("DispInpt.fxd_cost", MCColumnType.NUMBER);
		p.columnDispInpt_col_000 = p.beansFactory.createTableColumn("DispInpt.col_000", MCColumnType.NUMBER);
		p.columnDispInpt_col_001 = p.beansFactory.createTableColumn("DispInpt.col_001", MCColumnType.NUMBER);
		p.columnDispInpt_col_002 = p.beansFactory.createTableColumn("DispInpt.col_002", MCColumnType.NUMBER);
		p.columnDispInpt_col_003 = p.beansFactory.createTableColumn("DispInpt.col_003", MCColumnType.NUMBER);
		p.columnDispInpt_col_004 = p.beansFactory.createTableColumn("DispInpt.col_004", MCColumnType.NUMBER);
		p.columnDispInpt_col_005 = p.beansFactory.createTableColumn("DispInpt.col_005", MCColumnType.NUMBER);
		p.columnDispInpt_col_006 = p.beansFactory.createTableColumn("DispInpt.col_006", MCColumnType.NUMBER);
		p.columnDispInpt_col_007 = p.beansFactory.createTableColumn("DispInpt.col_007", MCColumnType.NUMBER);
		p.columnDispInpt_col_008 = p.beansFactory.createTableColumn("DispInpt.col_008", MCColumnType.NUMBER);
		p.columnDispInpt_col_009 = p.beansFactory.createTableColumn("DispInpt.col_009", MCColumnType.NUMBER);
		p.columnDispInpt_col_010 = p.beansFactory.createTableColumn("DispInpt.col_010", MCColumnType.NUMBER);
		p.columnDispInpt_col_011 = p.beansFactory.createTableColumn("DispInpt.col_011", MCColumnType.NUMBER);
		p.columnDispInpt_col_012 = p.beansFactory.createTableColumn("DispInpt.col_012", MCColumnType.NUMBER);
		p.columnDispInpt_col_013 = p.beansFactory.createTableColumn("DispInpt.col_013", MCColumnType.NUMBER);
		p.columnDispInpt_col_014 = p.beansFactory.createTableColumn("DispInpt.col_014", MCColumnType.NUMBER);
		p.columnDispInpt_col_015 = p.beansFactory.createTableColumn("DispInpt.col_015", MCColumnType.NUMBER);
		p.columnDispInpt_col_016 = p.beansFactory.createTableColumn("DispInpt.col_016", MCColumnType.NUMBER);
		p.columnDispInpt_col_017 = p.beansFactory.createTableColumn("DispInpt.col_017", MCColumnType.NUMBER);
		p.columnDispInpt_col_018 = p.beansFactory.createTableColumn("DispInpt.col_018", MCColumnType.NUMBER);
		p.columnDispInpt_col_019 = p.beansFactory.createTableColumn("DispInpt.col_019", MCColumnType.NUMBER);
		p.columnDispInpt_col_020 = p.beansFactory.createTableColumn("DispInpt.col_020", MCColumnType.NUMBER);
		p.columnDispInpt_col_021 = p.beansFactory.createTableColumn("DispInpt.col_021", MCColumnType.NUMBER);
		p.columnDispInpt_col_022 = p.beansFactory.createTableColumn("DispInpt.col_022", MCColumnType.NUMBER);
		p.columnDispInpt_col_023 = p.beansFactory.createTableColumn("DispInpt.col_023", MCColumnType.NUMBER);
		p.columnDispInpt_col_024 = p.beansFactory.createTableColumn("DispInpt.col_024", MCColumnType.NUMBER);
		p.columnDispInpt_col_025 = p.beansFactory.createTableColumn("DispInpt.col_025", MCColumnType.NUMBER);
		p.columnDispInpt_col_026 = p.beansFactory.createTableColumn("DispInpt.col_026", MCColumnType.NUMBER);
		p.columnDispInpt_col_027 = p.beansFactory.createTableColumn("DispInpt.col_027", MCColumnType.NUMBER);
		p.columnDispInpt_col_028 = p.beansFactory.createTableColumn("DispInpt.col_028", MCColumnType.NUMBER);
		p.columnDispInpt_col_029 = p.beansFactory.createTableColumn("DispInpt.col_029", MCColumnType.NUMBER);
		p.columnDispInpt_col_030 = p.beansFactory.createTableColumn("DispInpt.col_030", MCColumnType.NUMBER);
		p.columnDispInpt_col_031 = p.beansFactory.createTableColumn("DispInpt.col_031", MCColumnType.NUMBER);
		p.columnDispInpt_col_032 = p.beansFactory.createTableColumn("DispInpt.col_032", MCColumnType.NUMBER);
		p.columnDispInpt_col_033 = p.beansFactory.createTableColumn("DispInpt.col_033", MCColumnType.NUMBER);
		p.columnDispInpt_col_034 = p.beansFactory.createTableColumn("DispInpt.col_034", MCColumnType.NUMBER);
		p.columnDispInpt_col_035 = p.beansFactory.createTableColumn("DispInpt.col_035", MCColumnType.NUMBER);
		p.columnDispInpt_col_036 = p.beansFactory.createTableColumn("DispInpt.col_036", MCColumnType.NUMBER);
		p.columnDispInpt_col_037 = p.beansFactory.createTableColumn("DispInpt.col_037", MCColumnType.NUMBER);
		p.columnDispInpt_col_038 = p.beansFactory.createTableColumn("DispInpt.col_038", MCColumnType.NUMBER);
		p.columnDispInpt_col_039 = p.beansFactory.createTableColumn("DispInpt.col_039", MCColumnType.NUMBER);
		p.columnDispInpt_col_040 = p.beansFactory.createTableColumn("DispInpt.col_040", MCColumnType.NUMBER);
		p.columnDispInpt_col_041 = p.beansFactory.createTableColumn("DispInpt.col_041", MCColumnType.NUMBER);
		p.columnDispInpt_col_042 = p.beansFactory.createTableColumn("DispInpt.col_042", MCColumnType.NUMBER);
		p.columnDispInpt_col_043 = p.beansFactory.createTableColumn("DispInpt.col_043", MCColumnType.NUMBER);
		p.columnDispInpt_col_044 = p.beansFactory.createTableColumn("DispInpt.col_044", MCColumnType.NUMBER);
		p.columnDispInpt_col_045 = p.beansFactory.createTableColumn("DispInpt.col_045", MCColumnType.NUMBER);
		p.columnDispInpt_col_046 = p.beansFactory.createTableColumn("DispInpt.col_046", MCColumnType.NUMBER);
		p.columnDispInpt_col_047 = p.beansFactory.createTableColumn("DispInpt.col_047", MCColumnType.NUMBER);
		p.columnDispInpt_col_048 = p.beansFactory.createTableColumn("DispInpt.col_048", MCColumnType.NUMBER);
		p.columnDispInpt_col_049 = p.beansFactory.createTableColumn("DispInpt.col_049", MCColumnType.NUMBER);
		p.columnDispInpt_col_050 = p.beansFactory.createTableColumn("DispInpt.col_050", MCColumnType.NUMBER);
		p.columnDispInpt_col_051 = p.beansFactory.createTableColumn("DispInpt.col_051", MCColumnType.NUMBER);
		p.columnDispInpt_col_052 = p.beansFactory.createTableColumn("DispInpt.col_052", MCColumnType.NUMBER);
		p.columnDispInpt_col_053 = p.beansFactory.createTableColumn("DispInpt.col_053", MCColumnType.NUMBER);
		p.columnDispInpt_col_054 = p.beansFactory.createTableColumn("DispInpt.col_054", MCColumnType.NUMBER);
		p.columnDispInpt_col_055 = p.beansFactory.createTableColumn("DispInpt.col_055", MCColumnType.NUMBER);
		p.columnDispInpt_col_056 = p.beansFactory.createTableColumn("DispInpt.col_056", MCColumnType.NUMBER);
		p.columnDispInpt_col_057 = p.beansFactory.createTableColumn("DispInpt.col_057", MCColumnType.NUMBER);
		p.columnDispInpt_col_058 = p.beansFactory.createTableColumn("DispInpt.col_058", MCColumnType.NUMBER);
		p.columnDispInpt_col_059 = p.beansFactory.createTableColumn("DispInpt.col_059", MCColumnType.NUMBER);
		p.columnDispInpt_col_060 = p.beansFactory.createTableColumn("DispInpt.col_060", MCColumnType.NUMBER);
		p.columnDispInpt_col_061 = p.beansFactory.createTableColumn("DispInpt.col_061", MCColumnType.NUMBER);
		p.columnDispInpt_col_062 = p.beansFactory.createTableColumn("DispInpt.col_062", MCColumnType.NUMBER);
		p.columnDispInpt_col_063 = p.beansFactory.createTableColumn("DispInpt.col_063", MCColumnType.NUMBER);
		p.columnDispInpt_col_064 = p.beansFactory.createTableColumn("DispInpt.col_064", MCColumnType.NUMBER);
		p.columnDispInpt_col_065 = p.beansFactory.createTableColumn("DispInpt.col_065", MCColumnType.NUMBER);
		p.columnDispInpt_col_066 = p.beansFactory.createTableColumn("DispInpt.col_066", MCColumnType.NUMBER);
		p.columnDispInpt_col_067 = p.beansFactory.createTableColumn("DispInpt.col_067", MCColumnType.NUMBER);
		p.columnDispInpt_col_068 = p.beansFactory.createTableColumn("DispInpt.col_068", MCColumnType.NUMBER);
		p.columnDispInpt_col_069 = p.beansFactory.createTableColumn("DispInpt.col_069", MCColumnType.NUMBER);
		p.columnDispInpt_col_070 = p.beansFactory.createTableColumn("DispInpt.col_070", MCColumnType.NUMBER);
		p.columnDispInpt_col_071 = p.beansFactory.createTableColumn("DispInpt.col_071", MCColumnType.NUMBER);
		p.columnDispInpt_col_072 = p.beansFactory.createTableColumn("DispInpt.col_072", MCColumnType.NUMBER);
		p.columnDispInpt_col_073 = p.beansFactory.createTableColumn("DispInpt.col_073", MCColumnType.NUMBER);
		p.columnDispInpt_col_074 = p.beansFactory.createTableColumn("DispInpt.col_074", MCColumnType.NUMBER);
		p.columnDispInpt_col_075 = p.beansFactory.createTableColumn("DispInpt.col_075", MCColumnType.NUMBER);
		p.columnDispInpt_col_076 = p.beansFactory.createTableColumn("DispInpt.col_076", MCColumnType.NUMBER);
		p.columnDispInpt_col_077 = p.beansFactory.createTableColumn("DispInpt.col_077", MCColumnType.NUMBER);
		p.columnDispInpt_col_078 = p.beansFactory.createTableColumn("DispInpt.col_078", MCColumnType.NUMBER);
		p.columnDispInpt_col_079 = p.beansFactory.createTableColumn("DispInpt.col_079", MCColumnType.NUMBER);
		p.columnDispInpt_col_080 = p.beansFactory.createTableColumn("DispInpt.col_080", MCColumnType.NUMBER);
		p.columnDispInpt_col_081 = p.beansFactory.createTableColumn("DispInpt.col_081", MCColumnType.NUMBER);
		p.columnDispInpt_col_082 = p.beansFactory.createTableColumn("DispInpt.col_082", MCColumnType.NUMBER);
		p.columnDispInpt_col_083 = p.beansFactory.createTableColumn("DispInpt.col_083", MCColumnType.NUMBER);
		p.columnDispInpt_col_084 = p.beansFactory.createTableColumn("DispInpt.col_084", MCColumnType.NUMBER);
		p.columnDispInpt_col_085 = p.beansFactory.createTableColumn("DispInpt.col_085", MCColumnType.NUMBER);
		p.columnDispInpt_col_086 = p.beansFactory.createTableColumn("DispInpt.col_086", MCColumnType.NUMBER);
		p.columnDispInpt_col_087 = p.beansFactory.createTableColumn("DispInpt.col_087", MCColumnType.NUMBER);
		p.columnDispInpt_col_088 = p.beansFactory.createTableColumn("DispInpt.col_088", MCColumnType.NUMBER);
		p.columnDispInpt_col_089 = p.beansFactory.createTableColumn("DispInpt.col_089", MCColumnType.NUMBER);
		p.columnDispInpt_col_090 = p.beansFactory.createTableColumn("DispInpt.col_090", MCColumnType.NUMBER);
		p.columnDispInpt_col_091 = p.beansFactory.createTableColumn("DispInpt.col_091", MCColumnType.NUMBER);
		p.columnDispInpt_col_092 = p.beansFactory.createTableColumn("DispInpt.col_092", MCColumnType.NUMBER);
		p.columnDispInpt_col_093 = p.beansFactory.createTableColumn("DispInpt.col_093", MCColumnType.NUMBER);
		p.columnDispInpt_col_094 = p.beansFactory.createTableColumn("DispInpt.col_094", MCColumnType.NUMBER);
		p.columnDispInpt_col_095 = p.beansFactory.createTableColumn("DispInpt.col_095", MCColumnType.NUMBER);
		p.columnDispInpt_col_096 = p.beansFactory.createTableColumn("DispInpt.col_096", MCColumnType.NUMBER);
		p.columnDispInpt_col_097 = p.beansFactory.createTableColumn("DispInpt.col_097", MCColumnType.NUMBER);
		p.columnDispInpt_col_098 = p.beansFactory.createTableColumn("DispInpt.col_098", MCColumnType.NUMBER);
		p.columnDispInpt_col_099 = p.beansFactory.createTableColumn("DispInpt.col_099", MCColumnType.NUMBER);
	}

	/**
	 * [DispWk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispWk(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.DispWkPanel = p.beansFactory.createPanel("DispWk");
		p.DispWkScrollPane = p.beansFactory.createScrollPane("DispWk.scroll");
		p.createDispWkTable();
		// ブロックの項目の初期化
		p.columnDispWk_wg_cd = p.beansFactory.createTableColumn("DispWk.wg_cd", MCColumnType.TEXT);
		p.columnDispWk_wg_nm = p.beansFactory.createTableColumn("DispWk.wg_nm", MCColumnType.TEXT);
		p.columnDispWk_loc_cd = p.beansFactory.createTableColumn("DispWk.loc_cd", MCColumnType.TEXT);
		p.columnDispWk_loc_nm = p.beansFactory.createTableColumn("DispWk.loc_nm", MCColumnType.TEXT);
		p.columnDispWk_oper_cd = p.beansFactory.createTableColumn("DispWk.oper_cd", MCColumnType.TEXT);
		p.columnDispWk_oper_nm = p.beansFactory.createTableColumn("DispWk.oper_nm", MCColumnType.TEXT);
		p.columnDispWk_wk_cost_cd = p.beansFactory.createTableColumn("DispWk.wk_cost_cd", MCColumnType.TEXT);
		p.columnDispWk_wk_cost_nm = p.beansFactory.createTableColumn("DispWk.wk_cost_nm", MCColumnType.TEXT);
		p.columnDispWk_upri = p.beansFactory.createTableColumn("DispWk.upri", MCColumnType.NUMBER);
		p.columnDispWk_the_upri = p.beansFactory.createTableColumn("DispWk.the_upri", MCColumnType.NUMBER);
		p.columnDispWk_wk_cost_unit_nm = p.beansFactory.createTableColumn("DispWk.wk_cost_unit_nm", MCColumnType.TEXT);
		p.columnDispWk_dec_place = p.beansFactory.createTableColumn("DispWk.dec_place", MCColumnType.NUMBER);
		p.columnDispWk_the_cost = p.beansFactory.createTableColumn("DispWk.the_cost", MCColumnType.NUMBER);
		p.columnDispWk_ttl = p.beansFactory.createTableColumn("DispWk.ttl", MCColumnType.NUMBER);
		p.columnDispWk_var_cost = p.beansFactory.createTableColumn("DispWk.var_cost", MCColumnType.NUMBER);
		p.columnDispWk_fxd_cost = p.beansFactory.createTableColumn("DispWk.fxd_cost", MCColumnType.NUMBER);
		p.columnDispWk_col_000 = p.beansFactory.createTableColumn("DispWk.col_000", MCColumnType.NUMBER);
		p.columnDispWk_col_001 = p.beansFactory.createTableColumn("DispWk.col_001", MCColumnType.NUMBER);
		p.columnDispWk_col_002 = p.beansFactory.createTableColumn("DispWk.col_002", MCColumnType.NUMBER);
		p.columnDispWk_col_003 = p.beansFactory.createTableColumn("DispWk.col_003", MCColumnType.NUMBER);
		p.columnDispWk_col_004 = p.beansFactory.createTableColumn("DispWk.col_004", MCColumnType.NUMBER);
		p.columnDispWk_col_005 = p.beansFactory.createTableColumn("DispWk.col_005", MCColumnType.NUMBER);
		p.columnDispWk_col_006 = p.beansFactory.createTableColumn("DispWk.col_006", MCColumnType.NUMBER);
		p.columnDispWk_col_007 = p.beansFactory.createTableColumn("DispWk.col_007", MCColumnType.NUMBER);
		p.columnDispWk_col_008 = p.beansFactory.createTableColumn("DispWk.col_008", MCColumnType.NUMBER);
		p.columnDispWk_col_009 = p.beansFactory.createTableColumn("DispWk.col_009", MCColumnType.NUMBER);
		p.columnDispWk_col_010 = p.beansFactory.createTableColumn("DispWk.col_010", MCColumnType.NUMBER);
		p.columnDispWk_col_011 = p.beansFactory.createTableColumn("DispWk.col_011", MCColumnType.NUMBER);
		p.columnDispWk_col_012 = p.beansFactory.createTableColumn("DispWk.col_012", MCColumnType.NUMBER);
		p.columnDispWk_col_013 = p.beansFactory.createTableColumn("DispWk.col_013", MCColumnType.NUMBER);
		p.columnDispWk_col_014 = p.beansFactory.createTableColumn("DispWk.col_014", MCColumnType.NUMBER);
		p.columnDispWk_col_015 = p.beansFactory.createTableColumn("DispWk.col_015", MCColumnType.NUMBER);
		p.columnDispWk_col_016 = p.beansFactory.createTableColumn("DispWk.col_016", MCColumnType.NUMBER);
		p.columnDispWk_col_017 = p.beansFactory.createTableColumn("DispWk.col_017", MCColumnType.NUMBER);
		p.columnDispWk_col_018 = p.beansFactory.createTableColumn("DispWk.col_018", MCColumnType.NUMBER);
		p.columnDispWk_col_019 = p.beansFactory.createTableColumn("DispWk.col_019", MCColumnType.NUMBER);
		p.columnDispWk_col_020 = p.beansFactory.createTableColumn("DispWk.col_020", MCColumnType.NUMBER);
		p.columnDispWk_col_021 = p.beansFactory.createTableColumn("DispWk.col_021", MCColumnType.NUMBER);
		p.columnDispWk_col_022 = p.beansFactory.createTableColumn("DispWk.col_022", MCColumnType.NUMBER);
		p.columnDispWk_col_023 = p.beansFactory.createTableColumn("DispWk.col_023", MCColumnType.NUMBER);
		p.columnDispWk_col_024 = p.beansFactory.createTableColumn("DispWk.col_024", MCColumnType.NUMBER);
		p.columnDispWk_col_025 = p.beansFactory.createTableColumn("DispWk.col_025", MCColumnType.NUMBER);
		p.columnDispWk_col_026 = p.beansFactory.createTableColumn("DispWk.col_026", MCColumnType.NUMBER);
		p.columnDispWk_col_027 = p.beansFactory.createTableColumn("DispWk.col_027", MCColumnType.NUMBER);
		p.columnDispWk_col_028 = p.beansFactory.createTableColumn("DispWk.col_028", MCColumnType.NUMBER);
		p.columnDispWk_col_029 = p.beansFactory.createTableColumn("DispWk.col_029", MCColumnType.NUMBER);
		p.columnDispWk_col_030 = p.beansFactory.createTableColumn("DispWk.col_030", MCColumnType.NUMBER);
		p.columnDispWk_col_031 = p.beansFactory.createTableColumn("DispWk.col_031", MCColumnType.NUMBER);
		p.columnDispWk_col_032 = p.beansFactory.createTableColumn("DispWk.col_032", MCColumnType.NUMBER);
		p.columnDispWk_col_033 = p.beansFactory.createTableColumn("DispWk.col_033", MCColumnType.NUMBER);
		p.columnDispWk_col_034 = p.beansFactory.createTableColumn("DispWk.col_034", MCColumnType.NUMBER);
		p.columnDispWk_col_035 = p.beansFactory.createTableColumn("DispWk.col_035", MCColumnType.NUMBER);
		p.columnDispWk_col_036 = p.beansFactory.createTableColumn("DispWk.col_036", MCColumnType.NUMBER);
		p.columnDispWk_col_037 = p.beansFactory.createTableColumn("DispWk.col_037", MCColumnType.NUMBER);
		p.columnDispWk_col_038 = p.beansFactory.createTableColumn("DispWk.col_038", MCColumnType.NUMBER);
		p.columnDispWk_col_039 = p.beansFactory.createTableColumn("DispWk.col_039", MCColumnType.NUMBER);
		p.columnDispWk_col_040 = p.beansFactory.createTableColumn("DispWk.col_040", MCColumnType.NUMBER);
		p.columnDispWk_col_041 = p.beansFactory.createTableColumn("DispWk.col_041", MCColumnType.NUMBER);
		p.columnDispWk_col_042 = p.beansFactory.createTableColumn("DispWk.col_042", MCColumnType.NUMBER);
		p.columnDispWk_col_043 = p.beansFactory.createTableColumn("DispWk.col_043", MCColumnType.NUMBER);
		p.columnDispWk_col_044 = p.beansFactory.createTableColumn("DispWk.col_044", MCColumnType.NUMBER);
		p.columnDispWk_col_045 = p.beansFactory.createTableColumn("DispWk.col_045", MCColumnType.NUMBER);
		p.columnDispWk_col_046 = p.beansFactory.createTableColumn("DispWk.col_046", MCColumnType.NUMBER);
		p.columnDispWk_col_047 = p.beansFactory.createTableColumn("DispWk.col_047", MCColumnType.NUMBER);
		p.columnDispWk_col_048 = p.beansFactory.createTableColumn("DispWk.col_048", MCColumnType.NUMBER);
		p.columnDispWk_col_049 = p.beansFactory.createTableColumn("DispWk.col_049", MCColumnType.NUMBER);
		p.columnDispWk_col_050 = p.beansFactory.createTableColumn("DispWk.col_050", MCColumnType.NUMBER);
		p.columnDispWk_col_051 = p.beansFactory.createTableColumn("DispWk.col_051", MCColumnType.NUMBER);
		p.columnDispWk_col_052 = p.beansFactory.createTableColumn("DispWk.col_052", MCColumnType.NUMBER);
		p.columnDispWk_col_053 = p.beansFactory.createTableColumn("DispWk.col_053", MCColumnType.NUMBER);
		p.columnDispWk_col_054 = p.beansFactory.createTableColumn("DispWk.col_054", MCColumnType.NUMBER);
		p.columnDispWk_col_055 = p.beansFactory.createTableColumn("DispWk.col_055", MCColumnType.NUMBER);
		p.columnDispWk_col_056 = p.beansFactory.createTableColumn("DispWk.col_056", MCColumnType.NUMBER);
		p.columnDispWk_col_057 = p.beansFactory.createTableColumn("DispWk.col_057", MCColumnType.NUMBER);
		p.columnDispWk_col_058 = p.beansFactory.createTableColumn("DispWk.col_058", MCColumnType.NUMBER);
		p.columnDispWk_col_059 = p.beansFactory.createTableColumn("DispWk.col_059", MCColumnType.NUMBER);
		p.columnDispWk_col_060 = p.beansFactory.createTableColumn("DispWk.col_060", MCColumnType.NUMBER);
		p.columnDispWk_col_061 = p.beansFactory.createTableColumn("DispWk.col_061", MCColumnType.NUMBER);
		p.columnDispWk_col_062 = p.beansFactory.createTableColumn("DispWk.col_062", MCColumnType.NUMBER);
		p.columnDispWk_col_063 = p.beansFactory.createTableColumn("DispWk.col_063", MCColumnType.NUMBER);
		p.columnDispWk_col_064 = p.beansFactory.createTableColumn("DispWk.col_064", MCColumnType.NUMBER);
		p.columnDispWk_col_065 = p.beansFactory.createTableColumn("DispWk.col_065", MCColumnType.NUMBER);
		p.columnDispWk_col_066 = p.beansFactory.createTableColumn("DispWk.col_066", MCColumnType.NUMBER);
		p.columnDispWk_col_067 = p.beansFactory.createTableColumn("DispWk.col_067", MCColumnType.NUMBER);
		p.columnDispWk_col_068 = p.beansFactory.createTableColumn("DispWk.col_068", MCColumnType.NUMBER);
		p.columnDispWk_col_069 = p.beansFactory.createTableColumn("DispWk.col_069", MCColumnType.NUMBER);
		p.columnDispWk_col_070 = p.beansFactory.createTableColumn("DispWk.col_070", MCColumnType.NUMBER);
		p.columnDispWk_col_071 = p.beansFactory.createTableColumn("DispWk.col_071", MCColumnType.NUMBER);
		p.columnDispWk_col_072 = p.beansFactory.createTableColumn("DispWk.col_072", MCColumnType.NUMBER);
		p.columnDispWk_col_073 = p.beansFactory.createTableColumn("DispWk.col_073", MCColumnType.NUMBER);
		p.columnDispWk_col_074 = p.beansFactory.createTableColumn("DispWk.col_074", MCColumnType.NUMBER);
		p.columnDispWk_col_075 = p.beansFactory.createTableColumn("DispWk.col_075", MCColumnType.NUMBER);
		p.columnDispWk_col_076 = p.beansFactory.createTableColumn("DispWk.col_076", MCColumnType.NUMBER);
		p.columnDispWk_col_077 = p.beansFactory.createTableColumn("DispWk.col_077", MCColumnType.NUMBER);
		p.columnDispWk_col_078 = p.beansFactory.createTableColumn("DispWk.col_078", MCColumnType.NUMBER);
		p.columnDispWk_col_079 = p.beansFactory.createTableColumn("DispWk.col_079", MCColumnType.NUMBER);
		p.columnDispWk_col_080 = p.beansFactory.createTableColumn("DispWk.col_080", MCColumnType.NUMBER);
		p.columnDispWk_col_081 = p.beansFactory.createTableColumn("DispWk.col_081", MCColumnType.NUMBER);
		p.columnDispWk_col_082 = p.beansFactory.createTableColumn("DispWk.col_082", MCColumnType.NUMBER);
		p.columnDispWk_col_083 = p.beansFactory.createTableColumn("DispWk.col_083", MCColumnType.NUMBER);
		p.columnDispWk_col_084 = p.beansFactory.createTableColumn("DispWk.col_084", MCColumnType.NUMBER);
		p.columnDispWk_col_085 = p.beansFactory.createTableColumn("DispWk.col_085", MCColumnType.NUMBER);
		p.columnDispWk_col_086 = p.beansFactory.createTableColumn("DispWk.col_086", MCColumnType.NUMBER);
		p.columnDispWk_col_087 = p.beansFactory.createTableColumn("DispWk.col_087", MCColumnType.NUMBER);
		p.columnDispWk_col_088 = p.beansFactory.createTableColumn("DispWk.col_088", MCColumnType.NUMBER);
		p.columnDispWk_col_089 = p.beansFactory.createTableColumn("DispWk.col_089", MCColumnType.NUMBER);
		p.columnDispWk_col_090 = p.beansFactory.createTableColumn("DispWk.col_090", MCColumnType.NUMBER);
		p.columnDispWk_col_091 = p.beansFactory.createTableColumn("DispWk.col_091", MCColumnType.NUMBER);
		p.columnDispWk_col_092 = p.beansFactory.createTableColumn("DispWk.col_092", MCColumnType.NUMBER);
		p.columnDispWk_col_093 = p.beansFactory.createTableColumn("DispWk.col_093", MCColumnType.NUMBER);
		p.columnDispWk_col_094 = p.beansFactory.createTableColumn("DispWk.col_094", MCColumnType.NUMBER);
		p.columnDispWk_col_095 = p.beansFactory.createTableColumn("DispWk.col_095", MCColumnType.NUMBER);
		p.columnDispWk_col_096 = p.beansFactory.createTableColumn("DispWk.col_096", MCColumnType.NUMBER);
		p.columnDispWk_col_097 = p.beansFactory.createTableColumn("DispWk.col_097", MCColumnType.NUMBER);
		p.columnDispWk_col_098 = p.beansFactory.createTableColumn("DispWk.col_098", MCColumnType.NUMBER);
		p.columnDispWk_col_099 = p.beansFactory.createTableColumn("DispWk.col_099", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBEP0020 = p.beansFactory.createButton("Btn.open_MGBEP0020", "open");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NN");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.DtlOperPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.CndPanel, null);
		p.TopPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.LPnlPanel);
		p.TopPanel.add(p.LPnlPanel, null);
		p.LPnlPanel.setNextBeans(p.HdrPanel);
		p.TopPanel.add(p.HdrPanel, null);
		p.HdrPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_SELF);
		p.Cnd_ope_SELF.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_SELF);
		p.ScreenOpePanel.add(p.Cnd_ope_SELF);
		p.Cnd_ope_SELF.setNextBeans(p.Cnd_ope_ALL);
		p.Cnd_ope_ALL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_ALL);
		p.ScreenOpePanel.add(p.Cnd_ope_ALL);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0040.CndR.ope_META);
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0040.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0040.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_no_p_PPanel.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setLinkBeans(p.Cnd_rmrks);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0040.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBE.MGBEP0040.CndR.wg_nm_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, false);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, false);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, false);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, false);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.LPnlPanel.add(p.LPnl_theory);
		p.LPnlPanel.setLastBeans(p.LPnl_theory);
		p.LPnl_theory.setRow(p.getLPnlR(), mcframe.clientMGBE.MGBEP0040.LPnlR.theory_META);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.HdrPanel.setValueCheck(false);
		p.HdrPanel.setLayoutPosition("SWXC");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_qty_p_PPanel);
		p.HdrPanel.setLastBeans(p.Hdr_qty_p_PPanel);
		p.Hdr_qty_p_PPanel.setNextBeans(p.Hdr_base_unit_cd);
		p.HdrPanel.add(p.Hdr_base_unit_cd);
		p.Hdr_base_unit_cd.setNextBeans(p.Hdr_base_unit_nm);
		p.Hdr_base_unit_cd.setRow(p.getHdrR(), mcframe.clientMGBE.MGBEP0040.HdrR.base_unit_cd_META);
		p.HdrPanel.add(p.Hdr_base_unit_nm);
		p.Hdr_base_unit_nm.setNextBeans(p.Hdr_base_unit_dec_place);
		p.Hdr_base_unit_nm.setRow(p.getHdrR(), mcframe.clientMGBE.MGBEP0040.HdrR.base_unit_nm_META);
		p.HdrPanel.add(p.Hdr_base_unit_dec_place);
		p.Hdr_base_unit_dec_place.setNextBeans(p.Hdr_std_upri);
		p.Hdr_base_unit_dec_place.setRow(p.getHdrR(), mcframe.clientMGBE.MGBEP0040.HdrR.base_unit_dec_place_META);
		p.HdrPanel.add(p.Hdr_std_upri_Label);
		p.HdrPanel.add(p.Hdr_std_upri);
		p.Hdr_std_upri.setNextBeans(p.Hdr_the_upri);
		p.Hdr_std_upri.setRow(p.getHdrR(), mcframe.clientMGBE.MGBEP0040.HdrR.std_upri_META);
		p.HdrPanel.add(p.Hdr_the_upri_Label);
		p.HdrPanel.add(p.Hdr_the_upri);
		p.Hdr_the_upri.setRow(p.getHdrR(), mcframe.clientMGBE.MGBEP0040.HdrR.the_upri_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [DtlOper]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlOper(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.add(p.DtlOperPanel);
		p.DtlOperPanel.setNextBeans(p.DtlPanel);
		p.DtlOperPanel.add(p.DtlOperScrollPane);
		p.DtlOperPanel.setLastBeans(p.DtlOperTable);
		p.DtlOperScrollPane.setViewportView(p.DtlOperTable);
		p.DtlOperTable.setList(p.getDtlOperL());
		p.DtlOperTable.setStatusColumnVisible(false);
		p.DtlOperPanel.setLayoutPosition("CBCTC");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.setLayoutPosition("CBCBC+");
		// ブロックの項目の初期化
		p.DtlPanel.add(p.DispPanel, null);
		p.DtlPanel.setLastBeans(p.DispPanel);
		p.DispPanel.setNextBeans(p.DtlTabPanel);
		p.DtlPanel.add(p.DtlTabPanel, null);
	}

	/**
	 * [Disp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDisp(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.DispPanel.setValueCheck(false);
		p.DispPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DispPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.DispPanel.add(p.Disp_expns_grp);
		p.DispPanel.setLastBeans(p.Disp_expns_grp);
		p.Disp_expns_grp.setNextBeans(p.Disp_expns);
		p.Disp_expns_grp.setRow(p.getDispR(), mcframe.clientMGBE.MGBEP0040.DispR.expns_grp_META);
		p.DispPanel.add(p.Disp_expns);
		p.Disp_expns.setRow(p.getDispR(), mcframe.clientMGBE.MGBEP0040.DispR.expns_META);
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlTab(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.DtlTabPanel.add(p.DtlTabTab);
		p.DtlTabPanel.setLastBeans(p.DtlTabTab);
		p.DtlTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.DtlTabTab.add(p.DispInptPanel, "DtlTab.inpt");
		p.DtlTabTab.setLastBeans(p.DispInptPanel);
		p.DispInptPanel.setNextBeans(p.DispWkPanel);
		p.DtlTabTab.add(p.DispWkPanel, "DtlTab.wk");
	}

	/**
	 * [DispInpt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispInpt(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.DispInptPanel.setNextBeans(p.DispWkPanel);
		p.DispInptPanel.add(p.DispInptScrollPane);
		p.DispInptPanel.setLastBeans(p.DispInptTable);
		p.DispInptScrollPane.setViewportView(p.DispInptTable);
		p.DispInptTable.setList(p.getDispInptL());
		p.DispInptTable.setStatusColumnVisible(false);
		p.DispInptPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DispWk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispWk(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.DispWkPanel.add(p.DispWkScrollPane);
		p.DispWkPanel.setLastBeans(p.DispWkTable);
		p.DispWkScrollPane.setViewportView(p.DispWkTable);
		p.DispWkTable.setList(p.getDispWkL());
		p.DispWkTable.setStatusColumnVisible(false);
		p.DispWkPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBEP_StdUpriDtlSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_MGBEP0020.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBEP0020);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBEP0020);
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
		MGBEP_StdUpriDtlSrch_MC.mcInitScreenOpe((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.mcInitTop((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.mcInitCnd((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.mcInitLPnl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.mcInitHdr((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.mcInitCtrl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.mcInitDtlOper((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.mcInitDtl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.mcInitDisp((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.mcInitDtlTab((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.mcInitDispInpt((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.mcInitDispWk((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.mcInitBtn((MGBEP_StdUpriDtlSrch)this);

		// [SRCH_SELF]ステータスのモードの設定
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__SELF_ScreenOpe((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__SELF_Top((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__SELF_Cnd((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__SELF_LPnl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__SELF_Hdr((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__SELF_Ctrl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__SELF_DtlOper((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__SELF_Dtl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__SELF_Disp((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__SELF_DtlTab((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__SELF_DispInpt((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__SELF_DispWk((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__SELF_Btn((MGBEP_StdUpriDtlSrch)this);

		// [SRCH_ALL]ステータスのモードの設定
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__ALL_ScreenOpe((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__ALL_Top((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__ALL_Cnd((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__ALL_LPnl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__ALL_Hdr((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__ALL_Ctrl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__ALL_DtlOper((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__ALL_Dtl((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__ALL_Disp((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__ALL_DtlTab((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__ALL_DispInpt((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__ALL_DispWk((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.statusInitSRCH__ALL_Btn((MGBEP_StdUpriDtlSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBEP_StdUpriDtlSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBEP_StdUpriDtlSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBEP_StdUpriDtlSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_SELF.addAllListener(p);
		p.Cnd_ope_ALL.addAllListener(p);
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MGBEP_StdUpriDtlSrch p) {
		p.LPnl_theory.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MGBEP_StdUpriDtlSrch p) {
		p.Hdr_base_unit_cd.setListListener(p);
		p.Hdr_base_unit_cd.addAllListener(p);
		p.Hdr_base_unit_nm.setListListener(p);
		p.Hdr_base_unit_nm.addAllListener(p);
		p.Hdr_base_unit_dec_place.setListListener(p);
		p.Hdr_base_unit_dec_place.addAllListener(p);
		p.Hdr_std_upri.setListListener(p);
		p.Hdr_std_upri.addAllListener(p);
		p.Hdr_the_upri.setListListener(p);
		p.Hdr_the_upri.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBEP_StdUpriDtlSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [DtlOper]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlOper(MGBEP_StdUpriDtlSrch p) {
		p.DtlOperTable.addAllListener(p);
		p.columnDtlOper_loc_cd.addAllListener(p);
		p.columnDtlOper_loc_cd.setListListener(p);
		p.columnDtlOper_loc_nm.addAllListener(p);
		p.columnDtlOper_loc_nm.setListListener(p);
		p.columnDtlOper_disp_seq.addAllListener(p);
		p.columnDtlOper_disp_seq.setListListener(p);
		p.columnDtlOper_oper_cd.addAllListener(p);
		p.columnDtlOper_oper_cd.setListListener(p);
		p.columnDtlOper_oper_nm.addAllListener(p);
		p.columnDtlOper_oper_nm.setListListener(p);
		p.columnDtlOper_oper_seq.addAllListener(p);
		p.columnDtlOper_oper_seq.setListListener(p);
		p.columnDtlOper_base_unit_cd.addAllListener(p);
		p.columnDtlOper_base_unit_cd.setListListener(p);
		p.columnDtlOper_base_unit_nm.addAllListener(p);
		p.columnDtlOper_base_unit_nm.setListListener(p);
		p.columnDtlOper_base_unit_dec_place.addAllListener(p);
		p.columnDtlOper_base_unit_dec_place.setListListener(p);
		p.columnDtlOper_oper_unit_cd.addAllListener(p);
		p.columnDtlOper_oper_unit_cd.setListListener(p);
		p.columnDtlOper_oper_unit_nm.addAllListener(p);
		p.columnDtlOper_oper_unit_nm.setListListener(p);
		p.columnDtlOper_oper_dec_place.addAllListener(p);
		p.columnDtlOper_oper_dec_place.setListListener(p);
		p.columnDtlOper_oper_std_qty.addAllListener(p);
		p.columnDtlOper_oper_std_qty.setListListener(p);
		p.columnDtlOper_oper_conv_qty.addAllListener(p);
		p.columnDtlOper_oper_conv_qty.setListListener(p);
		p.columnDtlOper_oper_unit_conv_rnd_typ.addAllListener(p);
		p.columnDtlOper_oper_unit_conv_rnd_typ.setListListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MGBEP_StdUpriDtlSrch p) {
	}

	/**
	 *  [Disp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDisp(MGBEP_StdUpriDtlSrch p) {
		p.Disp_expns_grp.addAllListener(p);
		p.Disp_expns.addAllListener(p);
	}

	/**
	 *  [DtlTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlTab(MGBEP_StdUpriDtlSrch p) {
		p.DtlTabTab.addAllListener(p);
	}

	/**
	 *  [DispInpt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispInpt(MGBEP_StdUpriDtlSrch p) {
		p.DispInptTable.addAllListener(p);
		p.columnDispInpt_wg_cd.addAllListener(p);
		p.columnDispInpt_wg_cd.setListListener(p);
		p.columnDispInpt_wg_nm.addAllListener(p);
		p.columnDispInpt_wg_nm.setListListener(p);
		p.columnDispInpt_itm_typ.addAllListener(p);
		p.columnDispInpt_itm_typ.setListListener(p);
		p.columnDispInpt_itm_typ_nm.addAllListener(p);
		p.columnDispInpt_itm_typ_nm.setListListener(p);
		p.columnDispInpt_itm_typ_d_cd.addAllListener(p);
		p.columnDispInpt_itm_typ_d_cd.setListListener(p);
		p.columnDispInpt_itm_typ_d_nm.addAllListener(p);
		p.columnDispInpt_itm_typ_d_nm.setListListener(p);
		p.columnDispInpt_itm_jnl_cd.addAllListener(p);
		p.columnDispInpt_itm_jnl_cd.setListListener(p);
		p.columnDispInpt_itm_jnl_nm.addAllListener(p);
		p.columnDispInpt_itm_jnl_nm.setListListener(p);
		p.columnDispInpt_upri.addAllListener(p);
		p.columnDispInpt_upri.setListListener(p);
		p.columnDispInpt_the_upri.addAllListener(p);
		p.columnDispInpt_the_upri.setListListener(p);
		p.columnDispInpt_base_unit_cd.addAllListener(p);
		p.columnDispInpt_base_unit_cd.setListListener(p);
		p.columnDispInpt_base_unit_nm.addAllListener(p);
		p.columnDispInpt_base_unit_nm.setListListener(p);
		p.columnDispInpt_the_cost.addAllListener(p);
		p.columnDispInpt_the_cost.setListListener(p);
		p.columnDispInpt_ttl.addAllListener(p);
		p.columnDispInpt_ttl.setListListener(p);
		p.columnDispInpt_var_cost.addAllListener(p);
		p.columnDispInpt_var_cost.setListListener(p);
		p.columnDispInpt_fxd_cost.addAllListener(p);
		p.columnDispInpt_fxd_cost.setListListener(p);
		p.columnDispInpt_col_000.addAllListener(p);
		p.columnDispInpt_col_000.setListListener(p);
		p.columnDispInpt_col_001.addAllListener(p);
		p.columnDispInpt_col_001.setListListener(p);
		p.columnDispInpt_col_002.addAllListener(p);
		p.columnDispInpt_col_002.setListListener(p);
		p.columnDispInpt_col_003.addAllListener(p);
		p.columnDispInpt_col_003.setListListener(p);
		p.columnDispInpt_col_004.addAllListener(p);
		p.columnDispInpt_col_004.setListListener(p);
		p.columnDispInpt_col_005.addAllListener(p);
		p.columnDispInpt_col_005.setListListener(p);
		p.columnDispInpt_col_006.addAllListener(p);
		p.columnDispInpt_col_006.setListListener(p);
		p.columnDispInpt_col_007.addAllListener(p);
		p.columnDispInpt_col_007.setListListener(p);
		p.columnDispInpt_col_008.addAllListener(p);
		p.columnDispInpt_col_008.setListListener(p);
		p.columnDispInpt_col_009.addAllListener(p);
		p.columnDispInpt_col_009.setListListener(p);
		p.columnDispInpt_col_010.addAllListener(p);
		p.columnDispInpt_col_010.setListListener(p);
		p.columnDispInpt_col_011.addAllListener(p);
		p.columnDispInpt_col_011.setListListener(p);
		p.columnDispInpt_col_012.addAllListener(p);
		p.columnDispInpt_col_012.setListListener(p);
		p.columnDispInpt_col_013.addAllListener(p);
		p.columnDispInpt_col_013.setListListener(p);
		p.columnDispInpt_col_014.addAllListener(p);
		p.columnDispInpt_col_014.setListListener(p);
		p.columnDispInpt_col_015.addAllListener(p);
		p.columnDispInpt_col_015.setListListener(p);
		p.columnDispInpt_col_016.addAllListener(p);
		p.columnDispInpt_col_016.setListListener(p);
		p.columnDispInpt_col_017.addAllListener(p);
		p.columnDispInpt_col_017.setListListener(p);
		p.columnDispInpt_col_018.addAllListener(p);
		p.columnDispInpt_col_018.setListListener(p);
		p.columnDispInpt_col_019.addAllListener(p);
		p.columnDispInpt_col_019.setListListener(p);
		p.columnDispInpt_col_020.addAllListener(p);
		p.columnDispInpt_col_020.setListListener(p);
		p.columnDispInpt_col_021.addAllListener(p);
		p.columnDispInpt_col_021.setListListener(p);
		p.columnDispInpt_col_022.addAllListener(p);
		p.columnDispInpt_col_022.setListListener(p);
		p.columnDispInpt_col_023.addAllListener(p);
		p.columnDispInpt_col_023.setListListener(p);
		p.columnDispInpt_col_024.addAllListener(p);
		p.columnDispInpt_col_024.setListListener(p);
		p.columnDispInpt_col_025.addAllListener(p);
		p.columnDispInpt_col_025.setListListener(p);
		p.columnDispInpt_col_026.addAllListener(p);
		p.columnDispInpt_col_026.setListListener(p);
		p.columnDispInpt_col_027.addAllListener(p);
		p.columnDispInpt_col_027.setListListener(p);
		p.columnDispInpt_col_028.addAllListener(p);
		p.columnDispInpt_col_028.setListListener(p);
		p.columnDispInpt_col_029.addAllListener(p);
		p.columnDispInpt_col_029.setListListener(p);
		p.columnDispInpt_col_030.addAllListener(p);
		p.columnDispInpt_col_030.setListListener(p);
		p.columnDispInpt_col_031.addAllListener(p);
		p.columnDispInpt_col_031.setListListener(p);
		p.columnDispInpt_col_032.addAllListener(p);
		p.columnDispInpt_col_032.setListListener(p);
		p.columnDispInpt_col_033.addAllListener(p);
		p.columnDispInpt_col_033.setListListener(p);
		p.columnDispInpt_col_034.addAllListener(p);
		p.columnDispInpt_col_034.setListListener(p);
		p.columnDispInpt_col_035.addAllListener(p);
		p.columnDispInpt_col_035.setListListener(p);
		p.columnDispInpt_col_036.addAllListener(p);
		p.columnDispInpt_col_036.setListListener(p);
		p.columnDispInpt_col_037.addAllListener(p);
		p.columnDispInpt_col_037.setListListener(p);
		p.columnDispInpt_col_038.addAllListener(p);
		p.columnDispInpt_col_038.setListListener(p);
		p.columnDispInpt_col_039.addAllListener(p);
		p.columnDispInpt_col_039.setListListener(p);
		p.columnDispInpt_col_040.addAllListener(p);
		p.columnDispInpt_col_040.setListListener(p);
		p.columnDispInpt_col_041.addAllListener(p);
		p.columnDispInpt_col_041.setListListener(p);
		p.columnDispInpt_col_042.addAllListener(p);
		p.columnDispInpt_col_042.setListListener(p);
		p.columnDispInpt_col_043.addAllListener(p);
		p.columnDispInpt_col_043.setListListener(p);
		p.columnDispInpt_col_044.addAllListener(p);
		p.columnDispInpt_col_044.setListListener(p);
		p.columnDispInpt_col_045.addAllListener(p);
		p.columnDispInpt_col_045.setListListener(p);
		p.columnDispInpt_col_046.addAllListener(p);
		p.columnDispInpt_col_046.setListListener(p);
		p.columnDispInpt_col_047.addAllListener(p);
		p.columnDispInpt_col_047.setListListener(p);
		p.columnDispInpt_col_048.addAllListener(p);
		p.columnDispInpt_col_048.setListListener(p);
		p.columnDispInpt_col_049.addAllListener(p);
		p.columnDispInpt_col_049.setListListener(p);
		p.columnDispInpt_col_050.addAllListener(p);
		p.columnDispInpt_col_050.setListListener(p);
		p.columnDispInpt_col_051.addAllListener(p);
		p.columnDispInpt_col_051.setListListener(p);
		p.columnDispInpt_col_052.addAllListener(p);
		p.columnDispInpt_col_052.setListListener(p);
		p.columnDispInpt_col_053.addAllListener(p);
		p.columnDispInpt_col_053.setListListener(p);
		p.columnDispInpt_col_054.addAllListener(p);
		p.columnDispInpt_col_054.setListListener(p);
		p.columnDispInpt_col_055.addAllListener(p);
		p.columnDispInpt_col_055.setListListener(p);
		p.columnDispInpt_col_056.addAllListener(p);
		p.columnDispInpt_col_056.setListListener(p);
		p.columnDispInpt_col_057.addAllListener(p);
		p.columnDispInpt_col_057.setListListener(p);
		p.columnDispInpt_col_058.addAllListener(p);
		p.columnDispInpt_col_058.setListListener(p);
		p.columnDispInpt_col_059.addAllListener(p);
		p.columnDispInpt_col_059.setListListener(p);
		p.columnDispInpt_col_060.addAllListener(p);
		p.columnDispInpt_col_060.setListListener(p);
		p.columnDispInpt_col_061.addAllListener(p);
		p.columnDispInpt_col_061.setListListener(p);
		p.columnDispInpt_col_062.addAllListener(p);
		p.columnDispInpt_col_062.setListListener(p);
		p.columnDispInpt_col_063.addAllListener(p);
		p.columnDispInpt_col_063.setListListener(p);
		p.columnDispInpt_col_064.addAllListener(p);
		p.columnDispInpt_col_064.setListListener(p);
		p.columnDispInpt_col_065.addAllListener(p);
		p.columnDispInpt_col_065.setListListener(p);
		p.columnDispInpt_col_066.addAllListener(p);
		p.columnDispInpt_col_066.setListListener(p);
		p.columnDispInpt_col_067.addAllListener(p);
		p.columnDispInpt_col_067.setListListener(p);
		p.columnDispInpt_col_068.addAllListener(p);
		p.columnDispInpt_col_068.setListListener(p);
		p.columnDispInpt_col_069.addAllListener(p);
		p.columnDispInpt_col_069.setListListener(p);
		p.columnDispInpt_col_070.addAllListener(p);
		p.columnDispInpt_col_070.setListListener(p);
		p.columnDispInpt_col_071.addAllListener(p);
		p.columnDispInpt_col_071.setListListener(p);
		p.columnDispInpt_col_072.addAllListener(p);
		p.columnDispInpt_col_072.setListListener(p);
		p.columnDispInpt_col_073.addAllListener(p);
		p.columnDispInpt_col_073.setListListener(p);
		p.columnDispInpt_col_074.addAllListener(p);
		p.columnDispInpt_col_074.setListListener(p);
		p.columnDispInpt_col_075.addAllListener(p);
		p.columnDispInpt_col_075.setListListener(p);
		p.columnDispInpt_col_076.addAllListener(p);
		p.columnDispInpt_col_076.setListListener(p);
		p.columnDispInpt_col_077.addAllListener(p);
		p.columnDispInpt_col_077.setListListener(p);
		p.columnDispInpt_col_078.addAllListener(p);
		p.columnDispInpt_col_078.setListListener(p);
		p.columnDispInpt_col_079.addAllListener(p);
		p.columnDispInpt_col_079.setListListener(p);
		p.columnDispInpt_col_080.addAllListener(p);
		p.columnDispInpt_col_080.setListListener(p);
		p.columnDispInpt_col_081.addAllListener(p);
		p.columnDispInpt_col_081.setListListener(p);
		p.columnDispInpt_col_082.addAllListener(p);
		p.columnDispInpt_col_082.setListListener(p);
		p.columnDispInpt_col_083.addAllListener(p);
		p.columnDispInpt_col_083.setListListener(p);
		p.columnDispInpt_col_084.addAllListener(p);
		p.columnDispInpt_col_084.setListListener(p);
		p.columnDispInpt_col_085.addAllListener(p);
		p.columnDispInpt_col_085.setListListener(p);
		p.columnDispInpt_col_086.addAllListener(p);
		p.columnDispInpt_col_086.setListListener(p);
		p.columnDispInpt_col_087.addAllListener(p);
		p.columnDispInpt_col_087.setListListener(p);
		p.columnDispInpt_col_088.addAllListener(p);
		p.columnDispInpt_col_088.setListListener(p);
		p.columnDispInpt_col_089.addAllListener(p);
		p.columnDispInpt_col_089.setListListener(p);
		p.columnDispInpt_col_090.addAllListener(p);
		p.columnDispInpt_col_090.setListListener(p);
		p.columnDispInpt_col_091.addAllListener(p);
		p.columnDispInpt_col_091.setListListener(p);
		p.columnDispInpt_col_092.addAllListener(p);
		p.columnDispInpt_col_092.setListListener(p);
		p.columnDispInpt_col_093.addAllListener(p);
		p.columnDispInpt_col_093.setListListener(p);
		p.columnDispInpt_col_094.addAllListener(p);
		p.columnDispInpt_col_094.setListListener(p);
		p.columnDispInpt_col_095.addAllListener(p);
		p.columnDispInpt_col_095.setListListener(p);
		p.columnDispInpt_col_096.addAllListener(p);
		p.columnDispInpt_col_096.setListListener(p);
		p.columnDispInpt_col_097.addAllListener(p);
		p.columnDispInpt_col_097.setListListener(p);
		p.columnDispInpt_col_098.addAllListener(p);
		p.columnDispInpt_col_098.setListListener(p);
		p.columnDispInpt_col_099.addAllListener(p);
		p.columnDispInpt_col_099.setListListener(p);
	}

	/**
	 *  [DispWk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispWk(MGBEP_StdUpriDtlSrch p) {
		p.DispWkTable.addAllListener(p);
		p.columnDispWk_wg_cd.addAllListener(p);
		p.columnDispWk_wg_cd.setListListener(p);
		p.columnDispWk_wg_nm.addAllListener(p);
		p.columnDispWk_wg_nm.setListListener(p);
		p.columnDispWk_loc_cd.addAllListener(p);
		p.columnDispWk_loc_cd.setListListener(p);
		p.columnDispWk_loc_nm.addAllListener(p);
		p.columnDispWk_loc_nm.setListListener(p);
		p.columnDispWk_oper_cd.addAllListener(p);
		p.columnDispWk_oper_cd.setListListener(p);
		p.columnDispWk_oper_nm.addAllListener(p);
		p.columnDispWk_oper_nm.setListListener(p);
		p.columnDispWk_wk_cost_cd.addAllListener(p);
		p.columnDispWk_wk_cost_cd.setListListener(p);
		p.columnDispWk_wk_cost_nm.addAllListener(p);
		p.columnDispWk_wk_cost_nm.setListListener(p);
		p.columnDispWk_upri.addAllListener(p);
		p.columnDispWk_upri.setListListener(p);
		p.columnDispWk_the_upri.addAllListener(p);
		p.columnDispWk_the_upri.setListListener(p);
		p.columnDispWk_wk_cost_unit_nm.addAllListener(p);
		p.columnDispWk_wk_cost_unit_nm.setListListener(p);
		p.columnDispWk_dec_place.addAllListener(p);
		p.columnDispWk_dec_place.setListListener(p);
		p.columnDispWk_the_cost.addAllListener(p);
		p.columnDispWk_the_cost.setListListener(p);
		p.columnDispWk_ttl.addAllListener(p);
		p.columnDispWk_ttl.setListListener(p);
		p.columnDispWk_var_cost.addAllListener(p);
		p.columnDispWk_var_cost.setListListener(p);
		p.columnDispWk_fxd_cost.addAllListener(p);
		p.columnDispWk_fxd_cost.setListListener(p);
		p.columnDispWk_col_000.addAllListener(p);
		p.columnDispWk_col_000.setListListener(p);
		p.columnDispWk_col_001.addAllListener(p);
		p.columnDispWk_col_001.setListListener(p);
		p.columnDispWk_col_002.addAllListener(p);
		p.columnDispWk_col_002.setListListener(p);
		p.columnDispWk_col_003.addAllListener(p);
		p.columnDispWk_col_003.setListListener(p);
		p.columnDispWk_col_004.addAllListener(p);
		p.columnDispWk_col_004.setListListener(p);
		p.columnDispWk_col_005.addAllListener(p);
		p.columnDispWk_col_005.setListListener(p);
		p.columnDispWk_col_006.addAllListener(p);
		p.columnDispWk_col_006.setListListener(p);
		p.columnDispWk_col_007.addAllListener(p);
		p.columnDispWk_col_007.setListListener(p);
		p.columnDispWk_col_008.addAllListener(p);
		p.columnDispWk_col_008.setListListener(p);
		p.columnDispWk_col_009.addAllListener(p);
		p.columnDispWk_col_009.setListListener(p);
		p.columnDispWk_col_010.addAllListener(p);
		p.columnDispWk_col_010.setListListener(p);
		p.columnDispWk_col_011.addAllListener(p);
		p.columnDispWk_col_011.setListListener(p);
		p.columnDispWk_col_012.addAllListener(p);
		p.columnDispWk_col_012.setListListener(p);
		p.columnDispWk_col_013.addAllListener(p);
		p.columnDispWk_col_013.setListListener(p);
		p.columnDispWk_col_014.addAllListener(p);
		p.columnDispWk_col_014.setListListener(p);
		p.columnDispWk_col_015.addAllListener(p);
		p.columnDispWk_col_015.setListListener(p);
		p.columnDispWk_col_016.addAllListener(p);
		p.columnDispWk_col_016.setListListener(p);
		p.columnDispWk_col_017.addAllListener(p);
		p.columnDispWk_col_017.setListListener(p);
		p.columnDispWk_col_018.addAllListener(p);
		p.columnDispWk_col_018.setListListener(p);
		p.columnDispWk_col_019.addAllListener(p);
		p.columnDispWk_col_019.setListListener(p);
		p.columnDispWk_col_020.addAllListener(p);
		p.columnDispWk_col_020.setListListener(p);
		p.columnDispWk_col_021.addAllListener(p);
		p.columnDispWk_col_021.setListListener(p);
		p.columnDispWk_col_022.addAllListener(p);
		p.columnDispWk_col_022.setListListener(p);
		p.columnDispWk_col_023.addAllListener(p);
		p.columnDispWk_col_023.setListListener(p);
		p.columnDispWk_col_024.addAllListener(p);
		p.columnDispWk_col_024.setListListener(p);
		p.columnDispWk_col_025.addAllListener(p);
		p.columnDispWk_col_025.setListListener(p);
		p.columnDispWk_col_026.addAllListener(p);
		p.columnDispWk_col_026.setListListener(p);
		p.columnDispWk_col_027.addAllListener(p);
		p.columnDispWk_col_027.setListListener(p);
		p.columnDispWk_col_028.addAllListener(p);
		p.columnDispWk_col_028.setListListener(p);
		p.columnDispWk_col_029.addAllListener(p);
		p.columnDispWk_col_029.setListListener(p);
		p.columnDispWk_col_030.addAllListener(p);
		p.columnDispWk_col_030.setListListener(p);
		p.columnDispWk_col_031.addAllListener(p);
		p.columnDispWk_col_031.setListListener(p);
		p.columnDispWk_col_032.addAllListener(p);
		p.columnDispWk_col_032.setListListener(p);
		p.columnDispWk_col_033.addAllListener(p);
		p.columnDispWk_col_033.setListListener(p);
		p.columnDispWk_col_034.addAllListener(p);
		p.columnDispWk_col_034.setListListener(p);
		p.columnDispWk_col_035.addAllListener(p);
		p.columnDispWk_col_035.setListListener(p);
		p.columnDispWk_col_036.addAllListener(p);
		p.columnDispWk_col_036.setListListener(p);
		p.columnDispWk_col_037.addAllListener(p);
		p.columnDispWk_col_037.setListListener(p);
		p.columnDispWk_col_038.addAllListener(p);
		p.columnDispWk_col_038.setListListener(p);
		p.columnDispWk_col_039.addAllListener(p);
		p.columnDispWk_col_039.setListListener(p);
		p.columnDispWk_col_040.addAllListener(p);
		p.columnDispWk_col_040.setListListener(p);
		p.columnDispWk_col_041.addAllListener(p);
		p.columnDispWk_col_041.setListListener(p);
		p.columnDispWk_col_042.addAllListener(p);
		p.columnDispWk_col_042.setListListener(p);
		p.columnDispWk_col_043.addAllListener(p);
		p.columnDispWk_col_043.setListListener(p);
		p.columnDispWk_col_044.addAllListener(p);
		p.columnDispWk_col_044.setListListener(p);
		p.columnDispWk_col_045.addAllListener(p);
		p.columnDispWk_col_045.setListListener(p);
		p.columnDispWk_col_046.addAllListener(p);
		p.columnDispWk_col_046.setListListener(p);
		p.columnDispWk_col_047.addAllListener(p);
		p.columnDispWk_col_047.setListListener(p);
		p.columnDispWk_col_048.addAllListener(p);
		p.columnDispWk_col_048.setListListener(p);
		p.columnDispWk_col_049.addAllListener(p);
		p.columnDispWk_col_049.setListListener(p);
		p.columnDispWk_col_050.addAllListener(p);
		p.columnDispWk_col_050.setListListener(p);
		p.columnDispWk_col_051.addAllListener(p);
		p.columnDispWk_col_051.setListListener(p);
		p.columnDispWk_col_052.addAllListener(p);
		p.columnDispWk_col_052.setListListener(p);
		p.columnDispWk_col_053.addAllListener(p);
		p.columnDispWk_col_053.setListListener(p);
		p.columnDispWk_col_054.addAllListener(p);
		p.columnDispWk_col_054.setListListener(p);
		p.columnDispWk_col_055.addAllListener(p);
		p.columnDispWk_col_055.setListListener(p);
		p.columnDispWk_col_056.addAllListener(p);
		p.columnDispWk_col_056.setListListener(p);
		p.columnDispWk_col_057.addAllListener(p);
		p.columnDispWk_col_057.setListListener(p);
		p.columnDispWk_col_058.addAllListener(p);
		p.columnDispWk_col_058.setListListener(p);
		p.columnDispWk_col_059.addAllListener(p);
		p.columnDispWk_col_059.setListListener(p);
		p.columnDispWk_col_060.addAllListener(p);
		p.columnDispWk_col_060.setListListener(p);
		p.columnDispWk_col_061.addAllListener(p);
		p.columnDispWk_col_061.setListListener(p);
		p.columnDispWk_col_062.addAllListener(p);
		p.columnDispWk_col_062.setListListener(p);
		p.columnDispWk_col_063.addAllListener(p);
		p.columnDispWk_col_063.setListListener(p);
		p.columnDispWk_col_064.addAllListener(p);
		p.columnDispWk_col_064.setListListener(p);
		p.columnDispWk_col_065.addAllListener(p);
		p.columnDispWk_col_065.setListListener(p);
		p.columnDispWk_col_066.addAllListener(p);
		p.columnDispWk_col_066.setListListener(p);
		p.columnDispWk_col_067.addAllListener(p);
		p.columnDispWk_col_067.setListListener(p);
		p.columnDispWk_col_068.addAllListener(p);
		p.columnDispWk_col_068.setListListener(p);
		p.columnDispWk_col_069.addAllListener(p);
		p.columnDispWk_col_069.setListListener(p);
		p.columnDispWk_col_070.addAllListener(p);
		p.columnDispWk_col_070.setListListener(p);
		p.columnDispWk_col_071.addAllListener(p);
		p.columnDispWk_col_071.setListListener(p);
		p.columnDispWk_col_072.addAllListener(p);
		p.columnDispWk_col_072.setListListener(p);
		p.columnDispWk_col_073.addAllListener(p);
		p.columnDispWk_col_073.setListListener(p);
		p.columnDispWk_col_074.addAllListener(p);
		p.columnDispWk_col_074.setListListener(p);
		p.columnDispWk_col_075.addAllListener(p);
		p.columnDispWk_col_075.setListListener(p);
		p.columnDispWk_col_076.addAllListener(p);
		p.columnDispWk_col_076.setListListener(p);
		p.columnDispWk_col_077.addAllListener(p);
		p.columnDispWk_col_077.setListListener(p);
		p.columnDispWk_col_078.addAllListener(p);
		p.columnDispWk_col_078.setListListener(p);
		p.columnDispWk_col_079.addAllListener(p);
		p.columnDispWk_col_079.setListListener(p);
		p.columnDispWk_col_080.addAllListener(p);
		p.columnDispWk_col_080.setListListener(p);
		p.columnDispWk_col_081.addAllListener(p);
		p.columnDispWk_col_081.setListListener(p);
		p.columnDispWk_col_082.addAllListener(p);
		p.columnDispWk_col_082.setListListener(p);
		p.columnDispWk_col_083.addAllListener(p);
		p.columnDispWk_col_083.setListListener(p);
		p.columnDispWk_col_084.addAllListener(p);
		p.columnDispWk_col_084.setListListener(p);
		p.columnDispWk_col_085.addAllListener(p);
		p.columnDispWk_col_085.setListListener(p);
		p.columnDispWk_col_086.addAllListener(p);
		p.columnDispWk_col_086.setListListener(p);
		p.columnDispWk_col_087.addAllListener(p);
		p.columnDispWk_col_087.setListListener(p);
		p.columnDispWk_col_088.addAllListener(p);
		p.columnDispWk_col_088.setListListener(p);
		p.columnDispWk_col_089.addAllListener(p);
		p.columnDispWk_col_089.setListListener(p);
		p.columnDispWk_col_090.addAllListener(p);
		p.columnDispWk_col_090.setListListener(p);
		p.columnDispWk_col_091.addAllListener(p);
		p.columnDispWk_col_091.setListListener(p);
		p.columnDispWk_col_092.addAllListener(p);
		p.columnDispWk_col_092.setListListener(p);
		p.columnDispWk_col_093.addAllListener(p);
		p.columnDispWk_col_093.setListListener(p);
		p.columnDispWk_col_094.addAllListener(p);
		p.columnDispWk_col_094.setListListener(p);
		p.columnDispWk_col_095.addAllListener(p);
		p.columnDispWk_col_095.setListListener(p);
		p.columnDispWk_col_096.addAllListener(p);
		p.columnDispWk_col_096.setListListener(p);
		p.columnDispWk_col_097.addAllListener(p);
		p.columnDispWk_col_097.setListListener(p);
		p.columnDispWk_col_098.addAllListener(p);
		p.columnDispWk_col_098.setListListener(p);
		p.columnDispWk_col_099.addAllListener(p);
		p.columnDispWk_col_099.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBEP_StdUpriDtlSrch p) {
		p.Btn_open_MGBEP0020.addAllListener(p);
		p.Btn_open_MGBEP0020.setAPMethodName("doBtn_open_MGBEP0020");
	}

	/**
	 * [SRCH_SELF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SELF_ScreenOpe(MGBEP_StdUpriDtlSrch p){

	}

	/**
	 * [SRCH_SELF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SELF_Top(MGBEP_StdUpriDtlSrch p){

	}

	/**
	 * [SRCH_SELF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SELF_Cnd(MGBEP_StdUpriDtlSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_SELF, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH_SELF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH_SELF, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH_SELF, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SELF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);

	}

	/**
	 * [SRCH_SELF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SELF_LPnl(MGBEP_StdUpriDtlSrch p){
		p.LPnl_theory.putMode(p, SRCH_SELF, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_SELF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SELF_Hdr(MGBEP_StdUpriDtlSrch p){
		p.Hdr_qty_p_PPanel.putStatus(SRCH_SELF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_base_unit_cd.putMode(p, SRCH_SELF, MCMode.INVISIBLE);
		p.Hdr_base_unit_nm.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.Hdr_base_unit_dec_place.putMode(p, SRCH_SELF, MCMode.INVISIBLE);
		p.Hdr_std_upri.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.Hdr_the_upri.putMode(p, SRCH_SELF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_SELF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SELF_Ctrl(MGBEP_StdUpriDtlSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_SELF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_SELF]ステータスの[DtlOper]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SELF_DtlOper(MGBEP_StdUpriDtlSrch p){
		p.columnDtlOper_loc_cd.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDtlOper_loc_nm.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDtlOper_disp_seq.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDtlOper_oper_cd.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDtlOper_oper_nm.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDtlOper_oper_seq.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.DtlOper_std_qty_p_PPanel.putStatus(SRCH_SELF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlOper_the_qty_p_PPanel.putStatus(SRCH_SELF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlOper_base_unit_cd.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDtlOper_base_unit_nm.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDtlOper_base_unit_dec_place.putMode(p, SRCH_SELF, MCMode.INVISIBLE);
		p.DtlOper_oper_qty_p_PPanel.putStatus(SRCH_SELF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlOper_the_oper_qty_p_PPanel.putStatus(SRCH_SELF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlOper_oper_unit_cd.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDtlOper_oper_unit_nm.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDtlOper_oper_dec_place.putMode(p, SRCH_SELF, MCMode.INVISIBLE);
		p.columnDtlOper_oper_std_qty.putMode(p, SRCH_SELF, MCMode.INVISIBLE);
		p.columnDtlOper_oper_conv_qty.putMode(p, SRCH_SELF, MCMode.INVISIBLE);
		p.columnDtlOper_oper_unit_conv_rnd_typ.putMode(p, SRCH_SELF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_SELF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SELF_Dtl(MGBEP_StdUpriDtlSrch p){

	}

	/**
	 * [SRCH_SELF]ステータスの[Disp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SELF_Disp(MGBEP_StdUpriDtlSrch p){
		p.Disp_expns_grp.putMode(p, SRCH_SELF, MCMode.REQUIRED);
		p.Disp_expns.putMode(p, SRCH_SELF, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_SELF]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SELF_DtlTab(MGBEP_StdUpriDtlSrch p){

	}

	/**
	 * [SRCH_SELF]ステータスの[DispInpt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SELF_DispInpt(MGBEP_StdUpriDtlSrch p){
		p.columnDispInpt_wg_cd.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_wg_nm.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.DispInpt_itm_p_PPanel.putStatus(SRCH_SELF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDispInpt_itm_typ.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_itm_typ_nm.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_itm_typ_d_cd.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_itm_typ_d_nm.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_itm_jnl_cd.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_itm_jnl_nm.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_upri.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_the_upri.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.DispInpt_std_qty_p_PPanel.putStatus(SRCH_SELF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispInpt_the_qty_p_PPanel.putStatus(SRCH_SELF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispInpt_base_unit_cd.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_base_unit_nm.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_the_cost.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_ttl.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_var_cost.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_fxd_cost.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_000.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_001.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_002.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_003.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_004.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_005.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_006.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_007.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_008.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_009.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_010.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_011.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_012.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_013.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_014.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_015.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_016.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_017.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_018.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_019.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_020.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_021.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_022.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_023.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_024.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_025.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_026.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_027.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_028.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_029.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_030.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_031.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_032.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_033.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_034.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_035.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_036.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_037.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_038.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_039.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_040.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_041.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_042.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_043.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_044.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_045.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_046.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_047.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_048.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_049.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_050.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_051.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_052.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_053.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_054.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_055.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_056.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_057.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_058.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_059.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_060.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_061.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_062.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_063.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_064.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_065.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_066.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_067.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_068.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_069.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_070.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_071.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_072.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_073.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_074.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_075.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_076.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_077.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_078.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_079.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_080.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_081.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_082.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_083.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_084.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_085.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_086.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_087.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_088.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_089.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_090.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_091.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_092.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_093.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_094.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_095.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_096.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_097.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_098.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispInpt_col_099.putMode(p, SRCH_SELF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_SELF]ステータスの[DispWk]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SELF_DispWk(MGBEP_StdUpriDtlSrch p){
		p.columnDispWk_wg_cd.putMode(p, SRCH_SELF, MCMode.INVISIBLE);
		p.columnDispWk_wg_nm.putMode(p, SRCH_SELF, MCMode.INVISIBLE);
		p.columnDispWk_loc_cd.putMode(p, SRCH_SELF, MCMode.INVISIBLE);
		p.columnDispWk_loc_nm.putMode(p, SRCH_SELF, MCMode.INVISIBLE);
		p.columnDispWk_oper_cd.putMode(p, SRCH_SELF, MCMode.INVISIBLE);
		p.columnDispWk_oper_nm.putMode(p, SRCH_SELF, MCMode.INVISIBLE);
		p.columnDispWk_wk_cost_cd.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_wk_cost_nm.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_upri.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_the_upri.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.DispWk_std_wk_cost_p_PPanel.putStatus(SRCH_SELF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispWk_the_wk_cost_p_PPanel.putStatus(SRCH_SELF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnDispWk_wk_cost_unit_nm.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_dec_place.putMode(p, SRCH_SELF, MCMode.INVISIBLE);
		p.columnDispWk_the_cost.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_ttl.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_var_cost.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_fxd_cost.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_000.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_001.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_002.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_003.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_004.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_005.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_006.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_007.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_008.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_009.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_010.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_011.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_012.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_013.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_014.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_015.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_016.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_017.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_018.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_019.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_020.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_021.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_022.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_023.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_024.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_025.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_026.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_027.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_028.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_029.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_030.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_031.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_032.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_033.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_034.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_035.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_036.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_037.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_038.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_039.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_040.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_041.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_042.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_043.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_044.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_045.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_046.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_047.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_048.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_049.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_050.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_051.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_052.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_053.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_054.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_055.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_056.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_057.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_058.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_059.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_060.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_061.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_062.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_063.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_064.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_065.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_066.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_067.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_068.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_069.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_070.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_071.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_072.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_073.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_074.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_075.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_076.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_077.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_078.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_079.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_080.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_081.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_082.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_083.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_084.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_085.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_086.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_087.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_088.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_089.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_090.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_091.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_092.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_093.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_094.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_095.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_096.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_097.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_098.putMode(p, SRCH_SELF, MCMode.READ_ONLY);
		p.columnDispWk_col_099.putMode(p, SRCH_SELF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_SELF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SELF_Btn(MGBEP_StdUpriDtlSrch p){
		p.Btn_open_MGBEP0020.putMode(p, SRCH_SELF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ALL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_ScreenOpe(MGBEP_StdUpriDtlSrch p){

	}

	/**
	 * [SRCH_ALL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Top(MGBEP_StdUpriDtlSrch p){

	}

	/**
	 * [SRCH_ALL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Cnd(MGBEP_StdUpriDtlSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_ALL, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH_ALL, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH_ALL, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);

	}

	/**
	 * [SRCH_ALL]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_LPnl(MGBEP_StdUpriDtlSrch p){
		p.LPnl_theory.putMode(p, SRCH_ALL, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_ALL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Hdr(MGBEP_StdUpriDtlSrch p){
		p.Hdr_qty_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_base_unit_cd.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.Hdr_base_unit_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.Hdr_base_unit_dec_place.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.Hdr_std_upri.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.Hdr_the_upri.putMode(p, SRCH_ALL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ALL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Ctrl(MGBEP_StdUpriDtlSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_ALL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_ALL]ステータスの[DtlOper]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_DtlOper(MGBEP_StdUpriDtlSrch p){
		p.columnDtlOper_loc_cd.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.columnDtlOper_loc_nm.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.columnDtlOper_disp_seq.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.columnDtlOper_oper_cd.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.columnDtlOper_oper_nm.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.columnDtlOper_oper_seq.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.DtlOper_std_qty_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.DtlOper_the_qty_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtlOper_base_unit_cd.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.columnDtlOper_base_unit_nm.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.columnDtlOper_base_unit_dec_place.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.DtlOper_oper_qty_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.DtlOper_the_oper_qty_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtlOper_oper_unit_cd.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.columnDtlOper_oper_unit_nm.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.columnDtlOper_oper_dec_place.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.columnDtlOper_oper_std_qty.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.columnDtlOper_oper_conv_qty.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.columnDtlOper_oper_unit_conv_rnd_typ.putMode(p, SRCH_ALL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_ALL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Dtl(MGBEP_StdUpriDtlSrch p){

	}

	/**
	 * [SRCH_ALL]ステータスの[Disp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Disp(MGBEP_StdUpriDtlSrch p){
		p.Disp_expns_grp.putMode(p, SRCH_ALL, MCMode.REQUIRED);
		p.Disp_expns.putMode(p, SRCH_ALL, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_ALL]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_DtlTab(MGBEP_StdUpriDtlSrch p){

	}

	/**
	 * [SRCH_ALL]ステータスの[DispInpt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_DispInpt(MGBEP_StdUpriDtlSrch p){
		p.columnDispInpt_wg_cd.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_wg_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.DispInpt_itm_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDispInpt_itm_typ.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_itm_typ_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_itm_typ_d_cd.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_itm_typ_d_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_itm_jnl_cd.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_itm_jnl_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_upri.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_the_upri.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.DispInpt_std_qty_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DispInpt_the_qty_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDispInpt_base_unit_cd.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_base_unit_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_the_cost.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_ttl.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_var_cost.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_fxd_cost.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_000.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_001.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_002.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_003.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_004.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_005.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_006.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_007.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_008.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_009.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_010.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_011.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_012.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_013.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_014.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_015.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_016.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_017.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_018.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_019.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_020.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_021.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_022.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_023.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_024.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_025.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_026.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_027.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_028.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_029.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_030.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_031.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_032.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_033.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_034.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_035.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_036.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_037.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_038.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_039.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_040.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_041.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_042.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_043.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_044.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_045.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_046.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_047.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_048.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_049.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_050.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_051.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_052.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_053.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_054.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_055.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_056.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_057.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_058.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_059.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_060.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_061.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_062.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_063.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_064.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_065.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_066.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_067.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_068.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_069.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_070.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_071.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_072.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_073.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_074.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_075.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_076.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_077.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_078.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_079.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_080.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_081.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_082.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_083.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_084.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_085.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_086.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_087.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_088.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_089.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_090.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_091.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_092.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_093.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_094.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_095.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_096.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_097.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_098.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispInpt_col_099.putMode(p, SRCH_ALL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ALL]ステータスの[DispWk]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_DispWk(MGBEP_StdUpriDtlSrch p){
		p.columnDispWk_wg_cd.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_wg_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_loc_cd.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_loc_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_oper_cd.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_oper_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_wk_cost_cd.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_wk_cost_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_upri.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_the_upri.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.DispWk_std_wk_cost_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.DispWk_the_wk_cost_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnDispWk_wk_cost_unit_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_dec_place.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.columnDispWk_the_cost.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_ttl.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_var_cost.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_fxd_cost.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_000.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_001.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_002.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_003.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_004.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_005.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_006.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_007.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_008.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_009.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_010.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_011.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_012.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_013.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_014.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_015.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_016.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_017.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_018.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_019.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_020.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_021.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_022.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_023.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_024.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_025.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_026.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_027.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_028.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_029.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_030.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_031.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_032.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_033.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_034.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_035.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_036.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_037.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_038.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_039.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_040.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_041.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_042.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_043.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_044.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_045.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_046.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_047.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_048.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_049.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_050.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_051.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_052.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_053.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_054.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_055.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_056.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_057.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_058.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_059.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_060.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_061.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_062.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_063.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_064.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_065.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_066.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_067.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_068.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_069.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_070.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_071.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_072.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_073.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_074.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_075.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_076.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_077.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_078.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_079.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_080.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_081.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_082.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_083.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_084.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_085.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_086.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_087.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_088.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_089.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_090.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_091.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_092.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_093.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_094.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_095.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_096.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_097.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_098.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnDispWk_col_099.putMode(p, SRCH_ALL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ALL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Btn(MGBEP_StdUpriDtlSrch p){
		p.Btn_open_MGBEP0020.putMode(p, SRCH_ALL, MCMode.DISABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_SELF;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MGBEP_StdUpriDtlSrch_MC.setTableConfigDtlOper((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.setTableConfigDispInpt((MGBEP_StdUpriDtlSrch)this);
		MGBEP_StdUpriDtlSrch_MC.setTableConfigDispWk((MGBEP_StdUpriDtlSrch)this);
	}

	/**
	 * [DtlOper]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlOper(MGBEP_StdUpriDtlSrch p) {
		p.columnDtlOper_loc_cd.setMeta(mcframe.clientMGBE.MGBEP0040.DtlOperR.loc_cd_META);
		p.DtlOperTable.addColumnConfig(p.columnDtlOper_loc_cd);
		p.columnDtlOper_loc_nm.setMeta(mcframe.clientMGBE.MGBEP0040.DtlOperR.loc_nm_META);
		p.DtlOperTable.addColumnConfig(p.columnDtlOper_loc_nm);
		p.columnDtlOper_disp_seq.setMeta(mcframe.clientMGBE.MGBEP0040.DtlOperR.disp_seq_META);
		p.DtlOperTable.addColumnConfig(p.columnDtlOper_disp_seq);
		p.columnDtlOper_oper_cd.setMeta(mcframe.clientMGBE.MGBEP0040.DtlOperR.oper_cd_META);
		p.DtlOperTable.addColumnConfig(p.columnDtlOper_oper_cd);
		p.columnDtlOper_oper_nm.setMeta(mcframe.clientMGBE.MGBEP0040.DtlOperR.oper_nm_META);
		p.DtlOperTable.addColumnConfig(p.columnDtlOper_oper_nm);
		p.columnDtlOper_oper_seq.setMeta(mcframe.clientMGBE.MGBEP0040.DtlOperR.oper_seq_META);
		p.DtlOperTable.addColumnConfig(p.columnDtlOper_oper_seq);
		p.DtlOperTable.addTable(p.DtlOper_std_qty_p_PPanel.QtyTable);
		p.DtlOperTable.addTable(p.DtlOper_the_qty_p_PPanel.QtyTable);
		p.columnDtlOper_base_unit_cd.setMeta(mcframe.clientMGBE.MGBEP0040.DtlOperR.base_unit_cd_META);
		p.DtlOperTable.addColumnConfig(p.columnDtlOper_base_unit_cd);
		p.columnDtlOper_base_unit_nm.setMeta(mcframe.clientMGBE.MGBEP0040.DtlOperR.base_unit_nm_META);
		p.DtlOperTable.addColumnConfig(p.columnDtlOper_base_unit_nm);
		p.columnDtlOper_base_unit_dec_place.setMeta(mcframe.clientMGBE.MGBEP0040.DtlOperR.base_unit_dec_place_META);
		p.DtlOperTable.addColumnConfig(p.columnDtlOper_base_unit_dec_place);
		p.DtlOperTable.addTable(p.DtlOper_oper_qty_p_PPanel.QtyTable);
		p.DtlOperTable.addTable(p.DtlOper_the_oper_qty_p_PPanel.QtyTable);
		p.columnDtlOper_oper_unit_cd.setMeta(mcframe.clientMGBE.MGBEP0040.DtlOperR.oper_unit_cd_META);
		p.DtlOperTable.addColumnConfig(p.columnDtlOper_oper_unit_cd);
		p.columnDtlOper_oper_unit_nm.setMeta(mcframe.clientMGBE.MGBEP0040.DtlOperR.oper_unit_nm_META);
		p.DtlOperTable.addColumnConfig(p.columnDtlOper_oper_unit_nm);
		p.columnDtlOper_oper_dec_place.setMeta(mcframe.clientMGBE.MGBEP0040.DtlOperR.oper_dec_place_META);
		p.DtlOperTable.addColumnConfig(p.columnDtlOper_oper_dec_place);
		p.columnDtlOper_oper_std_qty.setMeta(mcframe.clientMGBE.MGBEP0040.DtlOperR.oper_std_qty_META);
		p.DtlOperTable.addColumnConfig(p.columnDtlOper_oper_std_qty);
		p.columnDtlOper_oper_conv_qty.setMeta(mcframe.clientMGBE.MGBEP0040.DtlOperR.oper_conv_qty_META);
		p.DtlOperTable.addColumnConfig(p.columnDtlOper_oper_conv_qty);
		p.columnDtlOper_oper_unit_conv_rnd_typ.setMeta(mcframe.clientMGBE.MGBEP0040.DtlOperR.oper_unit_conv_rnd_typ_META);
		p.DtlOperTable.addColumnConfig(p.columnDtlOper_oper_unit_conv_rnd_typ);
	}

	/**
	 * [DispInpt]ブロックのTableの設定
	 */
	protected static void setTableConfigDispInpt(MGBEP_StdUpriDtlSrch p) {
		p.columnDispInpt_wg_cd.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.wg_cd_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_wg_cd);
		p.columnDispInpt_wg_nm.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.wg_nm_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_wg_nm);
		p.DispInptTable.addTable(p.DispInpt_itm_p_PPanel.ItmTable);
		p.columnDispInpt_itm_typ.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.itm_typ_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_itm_typ);
		p.columnDispInpt_itm_typ_nm.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.itm_typ_nm_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_itm_typ_nm);
		p.columnDispInpt_itm_typ_d_cd.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.itm_typ_d_cd_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_itm_typ_d_cd);
		p.columnDispInpt_itm_typ_d_nm.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.itm_typ_d_nm_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_itm_typ_d_nm);
		p.columnDispInpt_itm_jnl_cd.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.itm_jnl_cd_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_itm_jnl_cd);
		p.columnDispInpt_itm_jnl_nm.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.itm_jnl_nm_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_itm_jnl_nm);
		p.columnDispInpt_upri.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.upri_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_upri);
		p.columnDispInpt_the_upri.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.the_upri_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_the_upri);
		p.DispInptTable.addTable(p.DispInpt_std_qty_p_PPanel.QtyTable);
		p.DispInptTable.addTable(p.DispInpt_the_qty_p_PPanel.QtyTable);
		p.columnDispInpt_base_unit_cd.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.base_unit_cd_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_base_unit_cd);
		p.columnDispInpt_base_unit_nm.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.base_unit_nm_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_base_unit_nm);
		p.columnDispInpt_the_cost.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.the_cost_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_the_cost);
		p.columnDispInpt_ttl.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.ttl_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_ttl);
		p.columnDispInpt_var_cost.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.var_cost_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_var_cost);
		p.columnDispInpt_fxd_cost.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.fxd_cost_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_fxd_cost);
		p.columnDispInpt_col_000.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_000_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_000);
		p.columnDispInpt_col_001.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_001_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_001);
		p.columnDispInpt_col_002.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_002_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_002);
		p.columnDispInpt_col_003.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_003_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_003);
		p.columnDispInpt_col_004.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_004_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_004);
		p.columnDispInpt_col_005.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_005_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_005);
		p.columnDispInpt_col_006.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_006_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_006);
		p.columnDispInpt_col_007.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_007_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_007);
		p.columnDispInpt_col_008.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_008_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_008);
		p.columnDispInpt_col_009.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_009_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_009);
		p.columnDispInpt_col_010.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_010_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_010);
		p.columnDispInpt_col_011.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_011_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_011);
		p.columnDispInpt_col_012.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_012_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_012);
		p.columnDispInpt_col_013.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_013_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_013);
		p.columnDispInpt_col_014.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_014_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_014);
		p.columnDispInpt_col_015.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_015_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_015);
		p.columnDispInpt_col_016.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_016_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_016);
		p.columnDispInpt_col_017.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_017_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_017);
		p.columnDispInpt_col_018.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_018_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_018);
		p.columnDispInpt_col_019.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_019_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_019);
		p.columnDispInpt_col_020.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_020_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_020);
		p.columnDispInpt_col_021.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_021_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_021);
		p.columnDispInpt_col_022.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_022_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_022);
		p.columnDispInpt_col_023.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_023_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_023);
		p.columnDispInpt_col_024.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_024_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_024);
		p.columnDispInpt_col_025.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_025_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_025);
		p.columnDispInpt_col_026.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_026_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_026);
		p.columnDispInpt_col_027.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_027_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_027);
		p.columnDispInpt_col_028.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_028_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_028);
		p.columnDispInpt_col_029.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_029_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_029);
		p.columnDispInpt_col_030.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_030_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_030);
		p.columnDispInpt_col_031.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_031_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_031);
		p.columnDispInpt_col_032.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_032_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_032);
		p.columnDispInpt_col_033.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_033_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_033);
		p.columnDispInpt_col_034.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_034_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_034);
		p.columnDispInpt_col_035.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_035_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_035);
		p.columnDispInpt_col_036.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_036_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_036);
		p.columnDispInpt_col_037.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_037_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_037);
		p.columnDispInpt_col_038.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_038_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_038);
		p.columnDispInpt_col_039.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_039_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_039);
		p.columnDispInpt_col_040.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_040_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_040);
		p.columnDispInpt_col_041.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_041_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_041);
		p.columnDispInpt_col_042.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_042_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_042);
		p.columnDispInpt_col_043.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_043_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_043);
		p.columnDispInpt_col_044.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_044_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_044);
		p.columnDispInpt_col_045.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_045_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_045);
		p.columnDispInpt_col_046.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_046_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_046);
		p.columnDispInpt_col_047.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_047_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_047);
		p.columnDispInpt_col_048.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_048_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_048);
		p.columnDispInpt_col_049.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_049_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_049);
		p.columnDispInpt_col_050.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_050_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_050);
		p.columnDispInpt_col_051.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_051_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_051);
		p.columnDispInpt_col_052.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_052_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_052);
		p.columnDispInpt_col_053.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_053_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_053);
		p.columnDispInpt_col_054.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_054_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_054);
		p.columnDispInpt_col_055.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_055_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_055);
		p.columnDispInpt_col_056.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_056_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_056);
		p.columnDispInpt_col_057.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_057_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_057);
		p.columnDispInpt_col_058.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_058_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_058);
		p.columnDispInpt_col_059.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_059_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_059);
		p.columnDispInpt_col_060.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_060_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_060);
		p.columnDispInpt_col_061.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_061_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_061);
		p.columnDispInpt_col_062.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_062_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_062);
		p.columnDispInpt_col_063.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_063_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_063);
		p.columnDispInpt_col_064.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_064_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_064);
		p.columnDispInpt_col_065.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_065_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_065);
		p.columnDispInpt_col_066.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_066_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_066);
		p.columnDispInpt_col_067.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_067_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_067);
		p.columnDispInpt_col_068.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_068_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_068);
		p.columnDispInpt_col_069.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_069_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_069);
		p.columnDispInpt_col_070.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_070_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_070);
		p.columnDispInpt_col_071.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_071_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_071);
		p.columnDispInpt_col_072.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_072_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_072);
		p.columnDispInpt_col_073.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_073_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_073);
		p.columnDispInpt_col_074.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_074_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_074);
		p.columnDispInpt_col_075.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_075_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_075);
		p.columnDispInpt_col_076.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_076_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_076);
		p.columnDispInpt_col_077.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_077_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_077);
		p.columnDispInpt_col_078.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_078_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_078);
		p.columnDispInpt_col_079.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_079_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_079);
		p.columnDispInpt_col_080.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_080_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_080);
		p.columnDispInpt_col_081.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_081_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_081);
		p.columnDispInpt_col_082.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_082_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_082);
		p.columnDispInpt_col_083.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_083_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_083);
		p.columnDispInpt_col_084.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_084_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_084);
		p.columnDispInpt_col_085.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_085_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_085);
		p.columnDispInpt_col_086.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_086_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_086);
		p.columnDispInpt_col_087.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_087_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_087);
		p.columnDispInpt_col_088.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_088_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_088);
		p.columnDispInpt_col_089.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_089_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_089);
		p.columnDispInpt_col_090.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_090_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_090);
		p.columnDispInpt_col_091.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_091_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_091);
		p.columnDispInpt_col_092.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_092_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_092);
		p.columnDispInpt_col_093.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_093_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_093);
		p.columnDispInpt_col_094.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_094_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_094);
		p.columnDispInpt_col_095.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_095_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_095);
		p.columnDispInpt_col_096.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_096_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_096);
		p.columnDispInpt_col_097.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_097_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_097);
		p.columnDispInpt_col_098.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_098_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_098);
		p.columnDispInpt_col_099.setMeta(mcframe.clientMGBE.MGBEP0040.DispInptR.col_099_META);
		p.DispInptTable.addColumnConfig(p.columnDispInpt_col_099);
	}

	/**
	 * [DispWk]ブロックのTableの設定
	 */
	protected static void setTableConfigDispWk(MGBEP_StdUpriDtlSrch p) {
		p.columnDispWk_wg_cd.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.wg_cd_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_wg_cd);
		p.columnDispWk_wg_nm.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.wg_nm_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_wg_nm);
		p.columnDispWk_loc_cd.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.loc_cd_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_loc_cd);
		p.columnDispWk_loc_nm.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.loc_nm_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_loc_nm);
		p.columnDispWk_oper_cd.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.oper_cd_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_oper_cd);
		p.columnDispWk_oper_nm.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.oper_nm_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_oper_nm);
		p.columnDispWk_wk_cost_cd.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.wk_cost_cd_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_wk_cost_cd);
		p.columnDispWk_wk_cost_nm.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.wk_cost_nm_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_wk_cost_nm);
		p.columnDispWk_upri.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.upri_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_upri);
		p.columnDispWk_the_upri.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.the_upri_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_the_upri);
		p.DispWkTable.addTable(p.DispWk_std_wk_cost_p_PPanel.WkCostQtyTable);
		p.DispWkTable.addTable(p.DispWk_the_wk_cost_p_PPanel.WkCostQtyTable);
		p.columnDispWk_wk_cost_unit_nm.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.wk_cost_unit_nm_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_wk_cost_unit_nm);
		p.columnDispWk_dec_place.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.dec_place_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_dec_place);
		p.columnDispWk_the_cost.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.the_cost_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_the_cost);
		p.columnDispWk_ttl.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.ttl_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_ttl);
		p.columnDispWk_var_cost.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.var_cost_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_var_cost);
		p.columnDispWk_fxd_cost.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.fxd_cost_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_fxd_cost);
		p.columnDispWk_col_000.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_000_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_000);
		p.columnDispWk_col_001.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_001_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_001);
		p.columnDispWk_col_002.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_002_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_002);
		p.columnDispWk_col_003.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_003_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_003);
		p.columnDispWk_col_004.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_004_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_004);
		p.columnDispWk_col_005.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_005_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_005);
		p.columnDispWk_col_006.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_006_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_006);
		p.columnDispWk_col_007.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_007_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_007);
		p.columnDispWk_col_008.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_008_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_008);
		p.columnDispWk_col_009.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_009_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_009);
		p.columnDispWk_col_010.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_010_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_010);
		p.columnDispWk_col_011.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_011_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_011);
		p.columnDispWk_col_012.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_012_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_012);
		p.columnDispWk_col_013.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_013_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_013);
		p.columnDispWk_col_014.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_014_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_014);
		p.columnDispWk_col_015.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_015_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_015);
		p.columnDispWk_col_016.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_016_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_016);
		p.columnDispWk_col_017.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_017_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_017);
		p.columnDispWk_col_018.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_018_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_018);
		p.columnDispWk_col_019.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_019_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_019);
		p.columnDispWk_col_020.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_020_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_020);
		p.columnDispWk_col_021.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_021_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_021);
		p.columnDispWk_col_022.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_022_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_022);
		p.columnDispWk_col_023.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_023_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_023);
		p.columnDispWk_col_024.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_024_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_024);
		p.columnDispWk_col_025.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_025_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_025);
		p.columnDispWk_col_026.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_026_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_026);
		p.columnDispWk_col_027.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_027_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_027);
		p.columnDispWk_col_028.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_028_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_028);
		p.columnDispWk_col_029.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_029_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_029);
		p.columnDispWk_col_030.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_030_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_030);
		p.columnDispWk_col_031.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_031_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_031);
		p.columnDispWk_col_032.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_032_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_032);
		p.columnDispWk_col_033.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_033_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_033);
		p.columnDispWk_col_034.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_034_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_034);
		p.columnDispWk_col_035.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_035_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_035);
		p.columnDispWk_col_036.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_036_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_036);
		p.columnDispWk_col_037.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_037_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_037);
		p.columnDispWk_col_038.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_038_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_038);
		p.columnDispWk_col_039.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_039_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_039);
		p.columnDispWk_col_040.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_040_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_040);
		p.columnDispWk_col_041.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_041_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_041);
		p.columnDispWk_col_042.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_042_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_042);
		p.columnDispWk_col_043.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_043_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_043);
		p.columnDispWk_col_044.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_044_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_044);
		p.columnDispWk_col_045.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_045_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_045);
		p.columnDispWk_col_046.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_046_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_046);
		p.columnDispWk_col_047.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_047_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_047);
		p.columnDispWk_col_048.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_048_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_048);
		p.columnDispWk_col_049.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_049_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_049);
		p.columnDispWk_col_050.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_050_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_050);
		p.columnDispWk_col_051.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_051_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_051);
		p.columnDispWk_col_052.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_052_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_052);
		p.columnDispWk_col_053.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_053_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_053);
		p.columnDispWk_col_054.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_054_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_054);
		p.columnDispWk_col_055.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_055_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_055);
		p.columnDispWk_col_056.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_056_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_056);
		p.columnDispWk_col_057.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_057_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_057);
		p.columnDispWk_col_058.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_058_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_058);
		p.columnDispWk_col_059.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_059_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_059);
		p.columnDispWk_col_060.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_060_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_060);
		p.columnDispWk_col_061.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_061_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_061);
		p.columnDispWk_col_062.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_062_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_062);
		p.columnDispWk_col_063.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_063_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_063);
		p.columnDispWk_col_064.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_064_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_064);
		p.columnDispWk_col_065.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_065_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_065);
		p.columnDispWk_col_066.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_066_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_066);
		p.columnDispWk_col_067.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_067_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_067);
		p.columnDispWk_col_068.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_068_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_068);
		p.columnDispWk_col_069.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_069_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_069);
		p.columnDispWk_col_070.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_070_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_070);
		p.columnDispWk_col_071.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_071_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_071);
		p.columnDispWk_col_072.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_072_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_072);
		p.columnDispWk_col_073.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_073_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_073);
		p.columnDispWk_col_074.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_074_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_074);
		p.columnDispWk_col_075.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_075_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_075);
		p.columnDispWk_col_076.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_076_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_076);
		p.columnDispWk_col_077.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_077_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_077);
		p.columnDispWk_col_078.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_078_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_078);
		p.columnDispWk_col_079.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_079_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_079);
		p.columnDispWk_col_080.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_080_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_080);
		p.columnDispWk_col_081.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_081_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_081);
		p.columnDispWk_col_082.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_082_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_082);
		p.columnDispWk_col_083.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_083_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_083);
		p.columnDispWk_col_084.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_084_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_084);
		p.columnDispWk_col_085.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_085_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_085);
		p.columnDispWk_col_086.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_086_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_086);
		p.columnDispWk_col_087.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_087_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_087);
		p.columnDispWk_col_088.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_088_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_088);
		p.columnDispWk_col_089.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_089_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_089);
		p.columnDispWk_col_090.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_090_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_090);
		p.columnDispWk_col_091.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_091_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_091);
		p.columnDispWk_col_092.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_092_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_092);
		p.columnDispWk_col_093.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_093_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_093);
		p.columnDispWk_col_094.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_094_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_094);
		p.columnDispWk_col_095.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_095_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_095);
		p.columnDispWk_col_096.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_096_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_096);
		p.columnDispWk_col_097.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_097_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_097);
		p.columnDispWk_col_098.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_098_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_098);
		p.columnDispWk_col_099.setMeta(mcframe.clientMGBE.MGBEP0040.DispWkR.col_099_META);
		p.DispWkTable.addColumnConfig(p.columnDispWk_col_099);
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
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
	}

	/**
	 * この画面を[SRCH_SELF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SELFStatus() {
		status = SRCH_SELF;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_ALL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ALLStatus() {
		status = SRCH_ALL;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_SELF.equals(status)) {
			setSRCH_SELFStatus();
		}
		else if (SRCH_ALL.equals(status)) {
			setSRCH_ALLStatus();
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_calc_no_p_PPanel.CalcNo_calc_no) return getCnd_calc_no_p_PPanel_CalcNo_calc_no(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
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
		else if (ap == Btn_open_MGBEP0020) doBtn_open_MGBEP0020(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBEP0020]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBEP0020(MCEventInfo info);

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
		if (vc == DtlOperTable) return doDtlOper_VC(info);
		if (vc == DtlTabTab) return doDtlTab_VC(info);
		if (vc == DispInptTable) return doDispInpt_VC(info);
		if (vc == DispWkTable) return doDispWk_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == LPnl_theory) return doLPnl_theory_VC(info);
		if (vc == Hdr_base_unit_cd) return doHdr_base_unit_cd_VC(info);
		if (vc == Hdr_base_unit_nm) return doHdr_base_unit_nm_VC(info);
		if (vc == Hdr_base_unit_dec_place) return doHdr_base_unit_dec_place_VC(info);
		if (vc == Hdr_std_upri) return doHdr_std_upri_VC(info);
		if (vc == Hdr_the_upri) return doHdr_the_upri_VC(info);
		if (vc == columnDtlOper_loc_cd) return doDtlOper_loc_cd_VC(info);
		if (vc == columnDtlOper_loc_nm) return doDtlOper_loc_nm_VC(info);
		if (vc == columnDtlOper_disp_seq) return doDtlOper_disp_seq_VC(info);
		if (vc == columnDtlOper_oper_cd) return doDtlOper_oper_cd_VC(info);
		if (vc == columnDtlOper_oper_nm) return doDtlOper_oper_nm_VC(info);
		if (vc == columnDtlOper_oper_seq) return doDtlOper_oper_seq_VC(info);
		if (vc == columnDtlOper_base_unit_cd) return doDtlOper_base_unit_cd_VC(info);
		if (vc == columnDtlOper_base_unit_nm) return doDtlOper_base_unit_nm_VC(info);
		if (vc == columnDtlOper_base_unit_dec_place) return doDtlOper_base_unit_dec_place_VC(info);
		if (vc == columnDtlOper_oper_unit_cd) return doDtlOper_oper_unit_cd_VC(info);
		if (vc == columnDtlOper_oper_unit_nm) return doDtlOper_oper_unit_nm_VC(info);
		if (vc == columnDtlOper_oper_dec_place) return doDtlOper_oper_dec_place_VC(info);
		if (vc == columnDtlOper_oper_std_qty) return doDtlOper_oper_std_qty_VC(info);
		if (vc == columnDtlOper_oper_conv_qty) return doDtlOper_oper_conv_qty_VC(info);
		if (vc == columnDtlOper_oper_unit_conv_rnd_typ) return doDtlOper_oper_unit_conv_rnd_typ_VC(info);
		if (vc == Disp_expns_grp) return doDisp_expns_grp_VC(info);
		if (vc == Disp_expns) return doDisp_expns_VC(info);
		if (vc == columnDispInpt_wg_cd) return doDispInpt_wg_cd_VC(info);
		if (vc == columnDispInpt_wg_nm) return doDispInpt_wg_nm_VC(info);
		if (vc == columnDispInpt_itm_typ) return doDispInpt_itm_typ_VC(info);
		if (vc == columnDispInpt_itm_typ_nm) return doDispInpt_itm_typ_nm_VC(info);
		if (vc == columnDispInpt_itm_typ_d_cd) return doDispInpt_itm_typ_d_cd_VC(info);
		if (vc == columnDispInpt_itm_typ_d_nm) return doDispInpt_itm_typ_d_nm_VC(info);
		if (vc == columnDispInpt_itm_jnl_cd) return doDispInpt_itm_jnl_cd_VC(info);
		if (vc == columnDispInpt_itm_jnl_nm) return doDispInpt_itm_jnl_nm_VC(info);
		if (vc == columnDispInpt_upri) return doDispInpt_upri_VC(info);
		if (vc == columnDispInpt_the_upri) return doDispInpt_the_upri_VC(info);
		if (vc == columnDispInpt_base_unit_cd) return doDispInpt_base_unit_cd_VC(info);
		if (vc == columnDispInpt_base_unit_nm) return doDispInpt_base_unit_nm_VC(info);
		if (vc == columnDispInpt_the_cost) return doDispInpt_the_cost_VC(info);
		if (vc == columnDispInpt_ttl) return doDispInpt_ttl_VC(info);
		if (vc == columnDispInpt_var_cost) return doDispInpt_var_cost_VC(info);
		if (vc == columnDispInpt_fxd_cost) return doDispInpt_fxd_cost_VC(info);
		if (vc == columnDispInpt_col_000) return doDispInpt_col_000_VC(info);
		if (vc == columnDispInpt_col_001) return doDispInpt_col_001_VC(info);
		if (vc == columnDispInpt_col_002) return doDispInpt_col_002_VC(info);
		if (vc == columnDispInpt_col_003) return doDispInpt_col_003_VC(info);
		if (vc == columnDispInpt_col_004) return doDispInpt_col_004_VC(info);
		if (vc == columnDispInpt_col_005) return doDispInpt_col_005_VC(info);
		if (vc == columnDispInpt_col_006) return doDispInpt_col_006_VC(info);
		if (vc == columnDispInpt_col_007) return doDispInpt_col_007_VC(info);
		if (vc == columnDispInpt_col_008) return doDispInpt_col_008_VC(info);
		if (vc == columnDispInpt_col_009) return doDispInpt_col_009_VC(info);
		if (vc == columnDispInpt_col_010) return doDispInpt_col_010_VC(info);
		if (vc == columnDispInpt_col_011) return doDispInpt_col_011_VC(info);
		if (vc == columnDispInpt_col_012) return doDispInpt_col_012_VC(info);
		if (vc == columnDispInpt_col_013) return doDispInpt_col_013_VC(info);
		if (vc == columnDispInpt_col_014) return doDispInpt_col_014_VC(info);
		if (vc == columnDispInpt_col_015) return doDispInpt_col_015_VC(info);
		if (vc == columnDispInpt_col_016) return doDispInpt_col_016_VC(info);
		if (vc == columnDispInpt_col_017) return doDispInpt_col_017_VC(info);
		if (vc == columnDispInpt_col_018) return doDispInpt_col_018_VC(info);
		if (vc == columnDispInpt_col_019) return doDispInpt_col_019_VC(info);
		if (vc == columnDispInpt_col_020) return doDispInpt_col_020_VC(info);
		if (vc == columnDispInpt_col_021) return doDispInpt_col_021_VC(info);
		if (vc == columnDispInpt_col_022) return doDispInpt_col_022_VC(info);
		if (vc == columnDispInpt_col_023) return doDispInpt_col_023_VC(info);
		if (vc == columnDispInpt_col_024) return doDispInpt_col_024_VC(info);
		if (vc == columnDispInpt_col_025) return doDispInpt_col_025_VC(info);
		if (vc == columnDispInpt_col_026) return doDispInpt_col_026_VC(info);
		if (vc == columnDispInpt_col_027) return doDispInpt_col_027_VC(info);
		if (vc == columnDispInpt_col_028) return doDispInpt_col_028_VC(info);
		if (vc == columnDispInpt_col_029) return doDispInpt_col_029_VC(info);
		if (vc == columnDispInpt_col_030) return doDispInpt_col_030_VC(info);
		if (vc == columnDispInpt_col_031) return doDispInpt_col_031_VC(info);
		if (vc == columnDispInpt_col_032) return doDispInpt_col_032_VC(info);
		if (vc == columnDispInpt_col_033) return doDispInpt_col_033_VC(info);
		if (vc == columnDispInpt_col_034) return doDispInpt_col_034_VC(info);
		if (vc == columnDispInpt_col_035) return doDispInpt_col_035_VC(info);
		if (vc == columnDispInpt_col_036) return doDispInpt_col_036_VC(info);
		if (vc == columnDispInpt_col_037) return doDispInpt_col_037_VC(info);
		if (vc == columnDispInpt_col_038) return doDispInpt_col_038_VC(info);
		if (vc == columnDispInpt_col_039) return doDispInpt_col_039_VC(info);
		if (vc == columnDispInpt_col_040) return doDispInpt_col_040_VC(info);
		if (vc == columnDispInpt_col_041) return doDispInpt_col_041_VC(info);
		if (vc == columnDispInpt_col_042) return doDispInpt_col_042_VC(info);
		if (vc == columnDispInpt_col_043) return doDispInpt_col_043_VC(info);
		if (vc == columnDispInpt_col_044) return doDispInpt_col_044_VC(info);
		if (vc == columnDispInpt_col_045) return doDispInpt_col_045_VC(info);
		if (vc == columnDispInpt_col_046) return doDispInpt_col_046_VC(info);
		if (vc == columnDispInpt_col_047) return doDispInpt_col_047_VC(info);
		if (vc == columnDispInpt_col_048) return doDispInpt_col_048_VC(info);
		if (vc == columnDispInpt_col_049) return doDispInpt_col_049_VC(info);
		if (vc == columnDispInpt_col_050) return doDispInpt_col_050_VC(info);
		if (vc == columnDispInpt_col_051) return doDispInpt_col_051_VC(info);
		if (vc == columnDispInpt_col_052) return doDispInpt_col_052_VC(info);
		if (vc == columnDispInpt_col_053) return doDispInpt_col_053_VC(info);
		if (vc == columnDispInpt_col_054) return doDispInpt_col_054_VC(info);
		if (vc == columnDispInpt_col_055) return doDispInpt_col_055_VC(info);
		if (vc == columnDispInpt_col_056) return doDispInpt_col_056_VC(info);
		if (vc == columnDispInpt_col_057) return doDispInpt_col_057_VC(info);
		if (vc == columnDispInpt_col_058) return doDispInpt_col_058_VC(info);
		if (vc == columnDispInpt_col_059) return doDispInpt_col_059_VC(info);
		if (vc == columnDispInpt_col_060) return doDispInpt_col_060_VC(info);
		if (vc == columnDispInpt_col_061) return doDispInpt_col_061_VC(info);
		if (vc == columnDispInpt_col_062) return doDispInpt_col_062_VC(info);
		if (vc == columnDispInpt_col_063) return doDispInpt_col_063_VC(info);
		if (vc == columnDispInpt_col_064) return doDispInpt_col_064_VC(info);
		if (vc == columnDispInpt_col_065) return doDispInpt_col_065_VC(info);
		if (vc == columnDispInpt_col_066) return doDispInpt_col_066_VC(info);
		if (vc == columnDispInpt_col_067) return doDispInpt_col_067_VC(info);
		if (vc == columnDispInpt_col_068) return doDispInpt_col_068_VC(info);
		if (vc == columnDispInpt_col_069) return doDispInpt_col_069_VC(info);
		if (vc == columnDispInpt_col_070) return doDispInpt_col_070_VC(info);
		if (vc == columnDispInpt_col_071) return doDispInpt_col_071_VC(info);
		if (vc == columnDispInpt_col_072) return doDispInpt_col_072_VC(info);
		if (vc == columnDispInpt_col_073) return doDispInpt_col_073_VC(info);
		if (vc == columnDispInpt_col_074) return doDispInpt_col_074_VC(info);
		if (vc == columnDispInpt_col_075) return doDispInpt_col_075_VC(info);
		if (vc == columnDispInpt_col_076) return doDispInpt_col_076_VC(info);
		if (vc == columnDispInpt_col_077) return doDispInpt_col_077_VC(info);
		if (vc == columnDispInpt_col_078) return doDispInpt_col_078_VC(info);
		if (vc == columnDispInpt_col_079) return doDispInpt_col_079_VC(info);
		if (vc == columnDispInpt_col_080) return doDispInpt_col_080_VC(info);
		if (vc == columnDispInpt_col_081) return doDispInpt_col_081_VC(info);
		if (vc == columnDispInpt_col_082) return doDispInpt_col_082_VC(info);
		if (vc == columnDispInpt_col_083) return doDispInpt_col_083_VC(info);
		if (vc == columnDispInpt_col_084) return doDispInpt_col_084_VC(info);
		if (vc == columnDispInpt_col_085) return doDispInpt_col_085_VC(info);
		if (vc == columnDispInpt_col_086) return doDispInpt_col_086_VC(info);
		if (vc == columnDispInpt_col_087) return doDispInpt_col_087_VC(info);
		if (vc == columnDispInpt_col_088) return doDispInpt_col_088_VC(info);
		if (vc == columnDispInpt_col_089) return doDispInpt_col_089_VC(info);
		if (vc == columnDispInpt_col_090) return doDispInpt_col_090_VC(info);
		if (vc == columnDispInpt_col_091) return doDispInpt_col_091_VC(info);
		if (vc == columnDispInpt_col_092) return doDispInpt_col_092_VC(info);
		if (vc == columnDispInpt_col_093) return doDispInpt_col_093_VC(info);
		if (vc == columnDispInpt_col_094) return doDispInpt_col_094_VC(info);
		if (vc == columnDispInpt_col_095) return doDispInpt_col_095_VC(info);
		if (vc == columnDispInpt_col_096) return doDispInpt_col_096_VC(info);
		if (vc == columnDispInpt_col_097) return doDispInpt_col_097_VC(info);
		if (vc == columnDispInpt_col_098) return doDispInpt_col_098_VC(info);
		if (vc == columnDispInpt_col_099) return doDispInpt_col_099_VC(info);
		if (vc == columnDispWk_wg_cd) return doDispWk_wg_cd_VC(info);
		if (vc == columnDispWk_wg_nm) return doDispWk_wg_nm_VC(info);
		if (vc == columnDispWk_loc_cd) return doDispWk_loc_cd_VC(info);
		if (vc == columnDispWk_loc_nm) return doDispWk_loc_nm_VC(info);
		if (vc == columnDispWk_oper_cd) return doDispWk_oper_cd_VC(info);
		if (vc == columnDispWk_oper_nm) return doDispWk_oper_nm_VC(info);
		if (vc == columnDispWk_wk_cost_cd) return doDispWk_wk_cost_cd_VC(info);
		if (vc == columnDispWk_wk_cost_nm) return doDispWk_wk_cost_nm_VC(info);
		if (vc == columnDispWk_upri) return doDispWk_upri_VC(info);
		if (vc == columnDispWk_the_upri) return doDispWk_the_upri_VC(info);
		if (vc == columnDispWk_wk_cost_unit_nm) return doDispWk_wk_cost_unit_nm_VC(info);
		if (vc == columnDispWk_dec_place) return doDispWk_dec_place_VC(info);
		if (vc == columnDispWk_the_cost) return doDispWk_the_cost_VC(info);
		if (vc == columnDispWk_ttl) return doDispWk_ttl_VC(info);
		if (vc == columnDispWk_var_cost) return doDispWk_var_cost_VC(info);
		if (vc == columnDispWk_fxd_cost) return doDispWk_fxd_cost_VC(info);
		if (vc == columnDispWk_col_000) return doDispWk_col_000_VC(info);
		if (vc == columnDispWk_col_001) return doDispWk_col_001_VC(info);
		if (vc == columnDispWk_col_002) return doDispWk_col_002_VC(info);
		if (vc == columnDispWk_col_003) return doDispWk_col_003_VC(info);
		if (vc == columnDispWk_col_004) return doDispWk_col_004_VC(info);
		if (vc == columnDispWk_col_005) return doDispWk_col_005_VC(info);
		if (vc == columnDispWk_col_006) return doDispWk_col_006_VC(info);
		if (vc == columnDispWk_col_007) return doDispWk_col_007_VC(info);
		if (vc == columnDispWk_col_008) return doDispWk_col_008_VC(info);
		if (vc == columnDispWk_col_009) return doDispWk_col_009_VC(info);
		if (vc == columnDispWk_col_010) return doDispWk_col_010_VC(info);
		if (vc == columnDispWk_col_011) return doDispWk_col_011_VC(info);
		if (vc == columnDispWk_col_012) return doDispWk_col_012_VC(info);
		if (vc == columnDispWk_col_013) return doDispWk_col_013_VC(info);
		if (vc == columnDispWk_col_014) return doDispWk_col_014_VC(info);
		if (vc == columnDispWk_col_015) return doDispWk_col_015_VC(info);
		if (vc == columnDispWk_col_016) return doDispWk_col_016_VC(info);
		if (vc == columnDispWk_col_017) return doDispWk_col_017_VC(info);
		if (vc == columnDispWk_col_018) return doDispWk_col_018_VC(info);
		if (vc == columnDispWk_col_019) return doDispWk_col_019_VC(info);
		if (vc == columnDispWk_col_020) return doDispWk_col_020_VC(info);
		if (vc == columnDispWk_col_021) return doDispWk_col_021_VC(info);
		if (vc == columnDispWk_col_022) return doDispWk_col_022_VC(info);
		if (vc == columnDispWk_col_023) return doDispWk_col_023_VC(info);
		if (vc == columnDispWk_col_024) return doDispWk_col_024_VC(info);
		if (vc == columnDispWk_col_025) return doDispWk_col_025_VC(info);
		if (vc == columnDispWk_col_026) return doDispWk_col_026_VC(info);
		if (vc == columnDispWk_col_027) return doDispWk_col_027_VC(info);
		if (vc == columnDispWk_col_028) return doDispWk_col_028_VC(info);
		if (vc == columnDispWk_col_029) return doDispWk_col_029_VC(info);
		if (vc == columnDispWk_col_030) return doDispWk_col_030_VC(info);
		if (vc == columnDispWk_col_031) return doDispWk_col_031_VC(info);
		if (vc == columnDispWk_col_032) return doDispWk_col_032_VC(info);
		if (vc == columnDispWk_col_033) return doDispWk_col_033_VC(info);
		if (vc == columnDispWk_col_034) return doDispWk_col_034_VC(info);
		if (vc == columnDispWk_col_035) return doDispWk_col_035_VC(info);
		if (vc == columnDispWk_col_036) return doDispWk_col_036_VC(info);
		if (vc == columnDispWk_col_037) return doDispWk_col_037_VC(info);
		if (vc == columnDispWk_col_038) return doDispWk_col_038_VC(info);
		if (vc == columnDispWk_col_039) return doDispWk_col_039_VC(info);
		if (vc == columnDispWk_col_040) return doDispWk_col_040_VC(info);
		if (vc == columnDispWk_col_041) return doDispWk_col_041_VC(info);
		if (vc == columnDispWk_col_042) return doDispWk_col_042_VC(info);
		if (vc == columnDispWk_col_043) return doDispWk_col_043_VC(info);
		if (vc == columnDispWk_col_044) return doDispWk_col_044_VC(info);
		if (vc == columnDispWk_col_045) return doDispWk_col_045_VC(info);
		if (vc == columnDispWk_col_046) return doDispWk_col_046_VC(info);
		if (vc == columnDispWk_col_047) return doDispWk_col_047_VC(info);
		if (vc == columnDispWk_col_048) return doDispWk_col_048_VC(info);
		if (vc == columnDispWk_col_049) return doDispWk_col_049_VC(info);
		if (vc == columnDispWk_col_050) return doDispWk_col_050_VC(info);
		if (vc == columnDispWk_col_051) return doDispWk_col_051_VC(info);
		if (vc == columnDispWk_col_052) return doDispWk_col_052_VC(info);
		if (vc == columnDispWk_col_053) return doDispWk_col_053_VC(info);
		if (vc == columnDispWk_col_054) return doDispWk_col_054_VC(info);
		if (vc == columnDispWk_col_055) return doDispWk_col_055_VC(info);
		if (vc == columnDispWk_col_056) return doDispWk_col_056_VC(info);
		if (vc == columnDispWk_col_057) return doDispWk_col_057_VC(info);
		if (vc == columnDispWk_col_058) return doDispWk_col_058_VC(info);
		if (vc == columnDispWk_col_059) return doDispWk_col_059_VC(info);
		if (vc == columnDispWk_col_060) return doDispWk_col_060_VC(info);
		if (vc == columnDispWk_col_061) return doDispWk_col_061_VC(info);
		if (vc == columnDispWk_col_062) return doDispWk_col_062_VC(info);
		if (vc == columnDispWk_col_063) return doDispWk_col_063_VC(info);
		if (vc == columnDispWk_col_064) return doDispWk_col_064_VC(info);
		if (vc == columnDispWk_col_065) return doDispWk_col_065_VC(info);
		if (vc == columnDispWk_col_066) return doDispWk_col_066_VC(info);
		if (vc == columnDispWk_col_067) return doDispWk_col_067_VC(info);
		if (vc == columnDispWk_col_068) return doDispWk_col_068_VC(info);
		if (vc == columnDispWk_col_069) return doDispWk_col_069_VC(info);
		if (vc == columnDispWk_col_070) return doDispWk_col_070_VC(info);
		if (vc == columnDispWk_col_071) return doDispWk_col_071_VC(info);
		if (vc == columnDispWk_col_072) return doDispWk_col_072_VC(info);
		if (vc == columnDispWk_col_073) return doDispWk_col_073_VC(info);
		if (vc == columnDispWk_col_074) return doDispWk_col_074_VC(info);
		if (vc == columnDispWk_col_075) return doDispWk_col_075_VC(info);
		if (vc == columnDispWk_col_076) return doDispWk_col_076_VC(info);
		if (vc == columnDispWk_col_077) return doDispWk_col_077_VC(info);
		if (vc == columnDispWk_col_078) return doDispWk_col_078_VC(info);
		if (vc == columnDispWk_col_079) return doDispWk_col_079_VC(info);
		if (vc == columnDispWk_col_080) return doDispWk_col_080_VC(info);
		if (vc == columnDispWk_col_081) return doDispWk_col_081_VC(info);
		if (vc == columnDispWk_col_082) return doDispWk_col_082_VC(info);
		if (vc == columnDispWk_col_083) return doDispWk_col_083_VC(info);
		if (vc == columnDispWk_col_084) return doDispWk_col_084_VC(info);
		if (vc == columnDispWk_col_085) return doDispWk_col_085_VC(info);
		if (vc == columnDispWk_col_086) return doDispWk_col_086_VC(info);
		if (vc == columnDispWk_col_087) return doDispWk_col_087_VC(info);
		if (vc == columnDispWk_col_088) return doDispWk_col_088_VC(info);
		if (vc == columnDispWk_col_089) return doDispWk_col_089_VC(info);
		if (vc == columnDispWk_col_090) return doDispWk_col_090_VC(info);
		if (vc == columnDispWk_col_091) return doDispWk_col_091_VC(info);
		if (vc == columnDispWk_col_092) return doDispWk_col_092_VC(info);
		if (vc == columnDispWk_col_093) return doDispWk_col_093_VC(info);
		if (vc == columnDispWk_col_094) return doDispWk_col_094_VC(info);
		if (vc == columnDispWk_col_095) return doDispWk_col_095_VC(info);
		if (vc == columnDispWk_col_096) return doDispWk_col_096_VC(info);
		if (vc == columnDispWk_col_097) return doDispWk_col_097_VC(info);
		if (vc == columnDispWk_col_098) return doDispWk_col_098_VC(info);
		if (vc == columnDispWk_col_099) return doDispWk_col_099_VC(info);
		return true;
	}

	/**
	 * [DtlOper]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_VC(MCEventInfo info){
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
	 * [LPnl]パネルの[theory]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_theory_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[std_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_std_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[the_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_the_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlOper]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlOper]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlOper]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlOper]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlOper]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlOper]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_oper_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlOper]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlOper]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlOper]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlOper]パネルの[oper_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_oper_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlOper]パネルの[oper_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_oper_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlOper]パネルの[oper_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_oper_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlOper]パネルの[oper_std_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_oper_std_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlOper]パネルの[oper_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_oper_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlOper]パネルの[oper_unit_conv_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlOper_oper_unit_conv_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Disp]パネルの[expns_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDisp_expns_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Disp]パネルの[expns]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDisp_expns_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[the_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_the_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[the_cost]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_the_cost_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[ttl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_ttl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[var_cost]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_var_cost_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[fxd_cost]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_fxd_cost_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_000]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_000_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_001]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_001_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_002]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_002_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_003]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_003_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_004]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_004_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_005]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_005_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_006]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_006_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_007]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_007_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_008]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_008_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_009]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_009_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_010]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_010_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_011]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_011_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_012]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_012_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_013]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_013_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_014]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_014_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_015]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_015_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_016]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_016_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_017]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_017_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_018]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_018_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_019]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_019_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_020]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_020_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_021]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_021_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_022]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_022_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_023]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_023_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_024]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_024_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_025]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_025_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_026]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_026_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_027]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_027_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_028]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_028_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_029]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_029_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_030]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_030_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_031]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_031_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_032]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_032_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_033]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_033_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_034]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_034_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_035]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_035_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_036]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_036_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_037]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_037_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_038]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_038_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_039]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_039_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_040]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_040_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_041]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_041_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_042]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_042_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_043]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_043_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_044]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_044_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_045]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_045_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_046]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_046_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_047]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_047_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_048]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_048_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_049]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_049_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_050]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_050_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_051]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_051_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_052]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_052_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_053]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_053_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_054]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_054_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_055]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_055_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_056]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_056_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_057]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_057_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_058]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_058_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_059]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_059_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_060]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_060_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_061]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_061_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_062]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_062_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_063]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_063_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_064]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_064_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_065]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_065_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_066]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_066_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_067]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_067_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_068]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_068_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_069]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_069_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_070]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_070_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_071]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_071_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_072]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_072_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_073]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_073_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_074]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_074_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_075]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_075_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_076]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_076_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_077]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_077_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_078]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_078_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_079]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_079_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_080]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_080_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_081]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_081_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_082]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_082_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_083]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_083_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_084]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_084_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_085]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_085_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_086]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_086_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_087]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_087_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_088]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_088_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_089]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_089_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_090]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_090_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_091]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_091_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_092]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_092_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_093]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_093_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_094]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_094_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_095]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_095_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_096]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_096_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_097]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_097_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_098]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_098_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispInpt]パネルの[col_099]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispInpt_col_099_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[wk_cost_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_wk_cost_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[wk_cost_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_wk_cost_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[the_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_the_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[wk_cost_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_wk_cost_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[the_cost]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_the_cost_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[ttl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_ttl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[var_cost]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_var_cost_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[fxd_cost]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_fxd_cost_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_000]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_000_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_001]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_001_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_002]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_002_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_003]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_003_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_004]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_004_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_005]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_005_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_006]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_006_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_007]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_007_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_008]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_008_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_009]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_009_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_010]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_010_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_011]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_011_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_012]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_012_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_013]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_013_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_014]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_014_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_015]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_015_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_016]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_016_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_017]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_017_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_018]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_018_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_019]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_019_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_020]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_020_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_021]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_021_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_022]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_022_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_023]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_023_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_024]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_024_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_025]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_025_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_026]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_026_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_027]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_027_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_028]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_028_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_029]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_029_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_030]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_030_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_031]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_031_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_032]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_032_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_033]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_033_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_034]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_034_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_035]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_035_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_036]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_036_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_037]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_037_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_038]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_038_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_039]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_039_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_040]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_040_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_041]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_041_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_042]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_042_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_043]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_043_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_044]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_044_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_045]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_045_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_046]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_046_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_047]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_047_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_048]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_048_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_049]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_049_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_050]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_050_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_051]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_051_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_052]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_052_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_053]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_053_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_054]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_054_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_055]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_055_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_056]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_056_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_057]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_057_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_058]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_058_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_059]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_059_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_060]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_060_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_061]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_061_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_062]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_062_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_063]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_063_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_064]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_064_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_065]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_065_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_066]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_066_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_067]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_067_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_068]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_068_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_069]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_069_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_070]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_070_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_071]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_071_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_072]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_072_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_073]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_073_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_074]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_074_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_075]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_075_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_076]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_076_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_077]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_077_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_078]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_078_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_079]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_079_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_080]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_080_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_081]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_081_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_082]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_082_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_083]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_083_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_084]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_084_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_085]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_085_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_086]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_086_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_087]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_087_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_088]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_088_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_089]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_089_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_090]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_090_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_091]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_091_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_092]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_092_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_093]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_093_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_094]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_094_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_095]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_095_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_096]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_096_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_097]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_097_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_098]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_098_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DispWk]パネルの[col_099]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDispWk_col_099_VC(MCEventInfo info){
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
		if (nc == DtlOperTable) doDtlOper_NC(info);
		else if (nc == DtlTabTab) doDtlTab_NC(info);
		else if (nc == DispInptTable) doDispInpt_NC(info);
		else if (nc == DispWkTable) doDispWk_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == LPnl_theory) doLPnl_theory_NC(info);
		else if (nc == Hdr_base_unit_cd) doHdr_base_unit_cd_NC(info);
		else if (nc == Hdr_base_unit_nm) doHdr_base_unit_nm_NC(info);
		else if (nc == Hdr_base_unit_dec_place) doHdr_base_unit_dec_place_NC(info);
		else if (nc == Hdr_std_upri) doHdr_std_upri_NC(info);
		else if (nc == Hdr_the_upri) doHdr_the_upri_NC(info);
		else if (nc == columnDtlOper_loc_cd) doDtlOper_loc_cd_NC(info);
		else if (nc == columnDtlOper_loc_nm) doDtlOper_loc_nm_NC(info);
		else if (nc == columnDtlOper_disp_seq) doDtlOper_disp_seq_NC(info);
		else if (nc == columnDtlOper_oper_cd) doDtlOper_oper_cd_NC(info);
		else if (nc == columnDtlOper_oper_nm) doDtlOper_oper_nm_NC(info);
		else if (nc == columnDtlOper_oper_seq) doDtlOper_oper_seq_NC(info);
		else if (nc == columnDtlOper_base_unit_cd) doDtlOper_base_unit_cd_NC(info);
		else if (nc == columnDtlOper_base_unit_nm) doDtlOper_base_unit_nm_NC(info);
		else if (nc == columnDtlOper_base_unit_dec_place) doDtlOper_base_unit_dec_place_NC(info);
		else if (nc == columnDtlOper_oper_unit_cd) doDtlOper_oper_unit_cd_NC(info);
		else if (nc == columnDtlOper_oper_unit_nm) doDtlOper_oper_unit_nm_NC(info);
		else if (nc == columnDtlOper_oper_dec_place) doDtlOper_oper_dec_place_NC(info);
		else if (nc == columnDtlOper_oper_std_qty) doDtlOper_oper_std_qty_NC(info);
		else if (nc == columnDtlOper_oper_conv_qty) doDtlOper_oper_conv_qty_NC(info);
		else if (nc == columnDtlOper_oper_unit_conv_rnd_typ) doDtlOper_oper_unit_conv_rnd_typ_NC(info);
		else if (nc == Disp_expns_grp) doDisp_expns_grp_NC(info);
		else if (nc == Disp_expns) doDisp_expns_NC(info);
		else if (nc == columnDispInpt_wg_cd) doDispInpt_wg_cd_NC(info);
		else if (nc == columnDispInpt_wg_nm) doDispInpt_wg_nm_NC(info);
		else if (nc == columnDispInpt_itm_typ) doDispInpt_itm_typ_NC(info);
		else if (nc == columnDispInpt_itm_typ_nm) doDispInpt_itm_typ_nm_NC(info);
		else if (nc == columnDispInpt_itm_typ_d_cd) doDispInpt_itm_typ_d_cd_NC(info);
		else if (nc == columnDispInpt_itm_typ_d_nm) doDispInpt_itm_typ_d_nm_NC(info);
		else if (nc == columnDispInpt_itm_jnl_cd) doDispInpt_itm_jnl_cd_NC(info);
		else if (nc == columnDispInpt_itm_jnl_nm) doDispInpt_itm_jnl_nm_NC(info);
		else if (nc == columnDispInpt_upri) doDispInpt_upri_NC(info);
		else if (nc == columnDispInpt_the_upri) doDispInpt_the_upri_NC(info);
		else if (nc == columnDispInpt_base_unit_cd) doDispInpt_base_unit_cd_NC(info);
		else if (nc == columnDispInpt_base_unit_nm) doDispInpt_base_unit_nm_NC(info);
		else if (nc == columnDispInpt_the_cost) doDispInpt_the_cost_NC(info);
		else if (nc == columnDispInpt_ttl) doDispInpt_ttl_NC(info);
		else if (nc == columnDispInpt_var_cost) doDispInpt_var_cost_NC(info);
		else if (nc == columnDispInpt_fxd_cost) doDispInpt_fxd_cost_NC(info);
		else if (nc == columnDispInpt_col_000) doDispInpt_col_000_NC(info);
		else if (nc == columnDispInpt_col_001) doDispInpt_col_001_NC(info);
		else if (nc == columnDispInpt_col_002) doDispInpt_col_002_NC(info);
		else if (nc == columnDispInpt_col_003) doDispInpt_col_003_NC(info);
		else if (nc == columnDispInpt_col_004) doDispInpt_col_004_NC(info);
		else if (nc == columnDispInpt_col_005) doDispInpt_col_005_NC(info);
		else if (nc == columnDispInpt_col_006) doDispInpt_col_006_NC(info);
		else if (nc == columnDispInpt_col_007) doDispInpt_col_007_NC(info);
		else if (nc == columnDispInpt_col_008) doDispInpt_col_008_NC(info);
		else if (nc == columnDispInpt_col_009) doDispInpt_col_009_NC(info);
		else if (nc == columnDispInpt_col_010) doDispInpt_col_010_NC(info);
		else if (nc == columnDispInpt_col_011) doDispInpt_col_011_NC(info);
		else if (nc == columnDispInpt_col_012) doDispInpt_col_012_NC(info);
		else if (nc == columnDispInpt_col_013) doDispInpt_col_013_NC(info);
		else if (nc == columnDispInpt_col_014) doDispInpt_col_014_NC(info);
		else if (nc == columnDispInpt_col_015) doDispInpt_col_015_NC(info);
		else if (nc == columnDispInpt_col_016) doDispInpt_col_016_NC(info);
		else if (nc == columnDispInpt_col_017) doDispInpt_col_017_NC(info);
		else if (nc == columnDispInpt_col_018) doDispInpt_col_018_NC(info);
		else if (nc == columnDispInpt_col_019) doDispInpt_col_019_NC(info);
		else if (nc == columnDispInpt_col_020) doDispInpt_col_020_NC(info);
		else if (nc == columnDispInpt_col_021) doDispInpt_col_021_NC(info);
		else if (nc == columnDispInpt_col_022) doDispInpt_col_022_NC(info);
		else if (nc == columnDispInpt_col_023) doDispInpt_col_023_NC(info);
		else if (nc == columnDispInpt_col_024) doDispInpt_col_024_NC(info);
		else if (nc == columnDispInpt_col_025) doDispInpt_col_025_NC(info);
		else if (nc == columnDispInpt_col_026) doDispInpt_col_026_NC(info);
		else if (nc == columnDispInpt_col_027) doDispInpt_col_027_NC(info);
		else if (nc == columnDispInpt_col_028) doDispInpt_col_028_NC(info);
		else if (nc == columnDispInpt_col_029) doDispInpt_col_029_NC(info);
		else if (nc == columnDispInpt_col_030) doDispInpt_col_030_NC(info);
		else if (nc == columnDispInpt_col_031) doDispInpt_col_031_NC(info);
		else if (nc == columnDispInpt_col_032) doDispInpt_col_032_NC(info);
		else if (nc == columnDispInpt_col_033) doDispInpt_col_033_NC(info);
		else if (nc == columnDispInpt_col_034) doDispInpt_col_034_NC(info);
		else if (nc == columnDispInpt_col_035) doDispInpt_col_035_NC(info);
		else if (nc == columnDispInpt_col_036) doDispInpt_col_036_NC(info);
		else if (nc == columnDispInpt_col_037) doDispInpt_col_037_NC(info);
		else if (nc == columnDispInpt_col_038) doDispInpt_col_038_NC(info);
		else if (nc == columnDispInpt_col_039) doDispInpt_col_039_NC(info);
		else if (nc == columnDispInpt_col_040) doDispInpt_col_040_NC(info);
		else if (nc == columnDispInpt_col_041) doDispInpt_col_041_NC(info);
		else if (nc == columnDispInpt_col_042) doDispInpt_col_042_NC(info);
		else if (nc == columnDispInpt_col_043) doDispInpt_col_043_NC(info);
		else if (nc == columnDispInpt_col_044) doDispInpt_col_044_NC(info);
		else if (nc == columnDispInpt_col_045) doDispInpt_col_045_NC(info);
		else if (nc == columnDispInpt_col_046) doDispInpt_col_046_NC(info);
		else if (nc == columnDispInpt_col_047) doDispInpt_col_047_NC(info);
		else if (nc == columnDispInpt_col_048) doDispInpt_col_048_NC(info);
		else if (nc == columnDispInpt_col_049) doDispInpt_col_049_NC(info);
		else if (nc == columnDispInpt_col_050) doDispInpt_col_050_NC(info);
		else if (nc == columnDispInpt_col_051) doDispInpt_col_051_NC(info);
		else if (nc == columnDispInpt_col_052) doDispInpt_col_052_NC(info);
		else if (nc == columnDispInpt_col_053) doDispInpt_col_053_NC(info);
		else if (nc == columnDispInpt_col_054) doDispInpt_col_054_NC(info);
		else if (nc == columnDispInpt_col_055) doDispInpt_col_055_NC(info);
		else if (nc == columnDispInpt_col_056) doDispInpt_col_056_NC(info);
		else if (nc == columnDispInpt_col_057) doDispInpt_col_057_NC(info);
		else if (nc == columnDispInpt_col_058) doDispInpt_col_058_NC(info);
		else if (nc == columnDispInpt_col_059) doDispInpt_col_059_NC(info);
		else if (nc == columnDispInpt_col_060) doDispInpt_col_060_NC(info);
		else if (nc == columnDispInpt_col_061) doDispInpt_col_061_NC(info);
		else if (nc == columnDispInpt_col_062) doDispInpt_col_062_NC(info);
		else if (nc == columnDispInpt_col_063) doDispInpt_col_063_NC(info);
		else if (nc == columnDispInpt_col_064) doDispInpt_col_064_NC(info);
		else if (nc == columnDispInpt_col_065) doDispInpt_col_065_NC(info);
		else if (nc == columnDispInpt_col_066) doDispInpt_col_066_NC(info);
		else if (nc == columnDispInpt_col_067) doDispInpt_col_067_NC(info);
		else if (nc == columnDispInpt_col_068) doDispInpt_col_068_NC(info);
		else if (nc == columnDispInpt_col_069) doDispInpt_col_069_NC(info);
		else if (nc == columnDispInpt_col_070) doDispInpt_col_070_NC(info);
		else if (nc == columnDispInpt_col_071) doDispInpt_col_071_NC(info);
		else if (nc == columnDispInpt_col_072) doDispInpt_col_072_NC(info);
		else if (nc == columnDispInpt_col_073) doDispInpt_col_073_NC(info);
		else if (nc == columnDispInpt_col_074) doDispInpt_col_074_NC(info);
		else if (nc == columnDispInpt_col_075) doDispInpt_col_075_NC(info);
		else if (nc == columnDispInpt_col_076) doDispInpt_col_076_NC(info);
		else if (nc == columnDispInpt_col_077) doDispInpt_col_077_NC(info);
		else if (nc == columnDispInpt_col_078) doDispInpt_col_078_NC(info);
		else if (nc == columnDispInpt_col_079) doDispInpt_col_079_NC(info);
		else if (nc == columnDispInpt_col_080) doDispInpt_col_080_NC(info);
		else if (nc == columnDispInpt_col_081) doDispInpt_col_081_NC(info);
		else if (nc == columnDispInpt_col_082) doDispInpt_col_082_NC(info);
		else if (nc == columnDispInpt_col_083) doDispInpt_col_083_NC(info);
		else if (nc == columnDispInpt_col_084) doDispInpt_col_084_NC(info);
		else if (nc == columnDispInpt_col_085) doDispInpt_col_085_NC(info);
		else if (nc == columnDispInpt_col_086) doDispInpt_col_086_NC(info);
		else if (nc == columnDispInpt_col_087) doDispInpt_col_087_NC(info);
		else if (nc == columnDispInpt_col_088) doDispInpt_col_088_NC(info);
		else if (nc == columnDispInpt_col_089) doDispInpt_col_089_NC(info);
		else if (nc == columnDispInpt_col_090) doDispInpt_col_090_NC(info);
		else if (nc == columnDispInpt_col_091) doDispInpt_col_091_NC(info);
		else if (nc == columnDispInpt_col_092) doDispInpt_col_092_NC(info);
		else if (nc == columnDispInpt_col_093) doDispInpt_col_093_NC(info);
		else if (nc == columnDispInpt_col_094) doDispInpt_col_094_NC(info);
		else if (nc == columnDispInpt_col_095) doDispInpt_col_095_NC(info);
		else if (nc == columnDispInpt_col_096) doDispInpt_col_096_NC(info);
		else if (nc == columnDispInpt_col_097) doDispInpt_col_097_NC(info);
		else if (nc == columnDispInpt_col_098) doDispInpt_col_098_NC(info);
		else if (nc == columnDispInpt_col_099) doDispInpt_col_099_NC(info);
		else if (nc == columnDispWk_wg_cd) doDispWk_wg_cd_NC(info);
		else if (nc == columnDispWk_wg_nm) doDispWk_wg_nm_NC(info);
		else if (nc == columnDispWk_loc_cd) doDispWk_loc_cd_NC(info);
		else if (nc == columnDispWk_loc_nm) doDispWk_loc_nm_NC(info);
		else if (nc == columnDispWk_oper_cd) doDispWk_oper_cd_NC(info);
		else if (nc == columnDispWk_oper_nm) doDispWk_oper_nm_NC(info);
		else if (nc == columnDispWk_wk_cost_cd) doDispWk_wk_cost_cd_NC(info);
		else if (nc == columnDispWk_wk_cost_nm) doDispWk_wk_cost_nm_NC(info);
		else if (nc == columnDispWk_upri) doDispWk_upri_NC(info);
		else if (nc == columnDispWk_the_upri) doDispWk_the_upri_NC(info);
		else if (nc == columnDispWk_wk_cost_unit_nm) doDispWk_wk_cost_unit_nm_NC(info);
		else if (nc == columnDispWk_dec_place) doDispWk_dec_place_NC(info);
		else if (nc == columnDispWk_the_cost) doDispWk_the_cost_NC(info);
		else if (nc == columnDispWk_ttl) doDispWk_ttl_NC(info);
		else if (nc == columnDispWk_var_cost) doDispWk_var_cost_NC(info);
		else if (nc == columnDispWk_fxd_cost) doDispWk_fxd_cost_NC(info);
		else if (nc == columnDispWk_col_000) doDispWk_col_000_NC(info);
		else if (nc == columnDispWk_col_001) doDispWk_col_001_NC(info);
		else if (nc == columnDispWk_col_002) doDispWk_col_002_NC(info);
		else if (nc == columnDispWk_col_003) doDispWk_col_003_NC(info);
		else if (nc == columnDispWk_col_004) doDispWk_col_004_NC(info);
		else if (nc == columnDispWk_col_005) doDispWk_col_005_NC(info);
		else if (nc == columnDispWk_col_006) doDispWk_col_006_NC(info);
		else if (nc == columnDispWk_col_007) doDispWk_col_007_NC(info);
		else if (nc == columnDispWk_col_008) doDispWk_col_008_NC(info);
		else if (nc == columnDispWk_col_009) doDispWk_col_009_NC(info);
		else if (nc == columnDispWk_col_010) doDispWk_col_010_NC(info);
		else if (nc == columnDispWk_col_011) doDispWk_col_011_NC(info);
		else if (nc == columnDispWk_col_012) doDispWk_col_012_NC(info);
		else if (nc == columnDispWk_col_013) doDispWk_col_013_NC(info);
		else if (nc == columnDispWk_col_014) doDispWk_col_014_NC(info);
		else if (nc == columnDispWk_col_015) doDispWk_col_015_NC(info);
		else if (nc == columnDispWk_col_016) doDispWk_col_016_NC(info);
		else if (nc == columnDispWk_col_017) doDispWk_col_017_NC(info);
		else if (nc == columnDispWk_col_018) doDispWk_col_018_NC(info);
		else if (nc == columnDispWk_col_019) doDispWk_col_019_NC(info);
		else if (nc == columnDispWk_col_020) doDispWk_col_020_NC(info);
		else if (nc == columnDispWk_col_021) doDispWk_col_021_NC(info);
		else if (nc == columnDispWk_col_022) doDispWk_col_022_NC(info);
		else if (nc == columnDispWk_col_023) doDispWk_col_023_NC(info);
		else if (nc == columnDispWk_col_024) doDispWk_col_024_NC(info);
		else if (nc == columnDispWk_col_025) doDispWk_col_025_NC(info);
		else if (nc == columnDispWk_col_026) doDispWk_col_026_NC(info);
		else if (nc == columnDispWk_col_027) doDispWk_col_027_NC(info);
		else if (nc == columnDispWk_col_028) doDispWk_col_028_NC(info);
		else if (nc == columnDispWk_col_029) doDispWk_col_029_NC(info);
		else if (nc == columnDispWk_col_030) doDispWk_col_030_NC(info);
		else if (nc == columnDispWk_col_031) doDispWk_col_031_NC(info);
		else if (nc == columnDispWk_col_032) doDispWk_col_032_NC(info);
		else if (nc == columnDispWk_col_033) doDispWk_col_033_NC(info);
		else if (nc == columnDispWk_col_034) doDispWk_col_034_NC(info);
		else if (nc == columnDispWk_col_035) doDispWk_col_035_NC(info);
		else if (nc == columnDispWk_col_036) doDispWk_col_036_NC(info);
		else if (nc == columnDispWk_col_037) doDispWk_col_037_NC(info);
		else if (nc == columnDispWk_col_038) doDispWk_col_038_NC(info);
		else if (nc == columnDispWk_col_039) doDispWk_col_039_NC(info);
		else if (nc == columnDispWk_col_040) doDispWk_col_040_NC(info);
		else if (nc == columnDispWk_col_041) doDispWk_col_041_NC(info);
		else if (nc == columnDispWk_col_042) doDispWk_col_042_NC(info);
		else if (nc == columnDispWk_col_043) doDispWk_col_043_NC(info);
		else if (nc == columnDispWk_col_044) doDispWk_col_044_NC(info);
		else if (nc == columnDispWk_col_045) doDispWk_col_045_NC(info);
		else if (nc == columnDispWk_col_046) doDispWk_col_046_NC(info);
		else if (nc == columnDispWk_col_047) doDispWk_col_047_NC(info);
		else if (nc == columnDispWk_col_048) doDispWk_col_048_NC(info);
		else if (nc == columnDispWk_col_049) doDispWk_col_049_NC(info);
		else if (nc == columnDispWk_col_050) doDispWk_col_050_NC(info);
		else if (nc == columnDispWk_col_051) doDispWk_col_051_NC(info);
		else if (nc == columnDispWk_col_052) doDispWk_col_052_NC(info);
		else if (nc == columnDispWk_col_053) doDispWk_col_053_NC(info);
		else if (nc == columnDispWk_col_054) doDispWk_col_054_NC(info);
		else if (nc == columnDispWk_col_055) doDispWk_col_055_NC(info);
		else if (nc == columnDispWk_col_056) doDispWk_col_056_NC(info);
		else if (nc == columnDispWk_col_057) doDispWk_col_057_NC(info);
		else if (nc == columnDispWk_col_058) doDispWk_col_058_NC(info);
		else if (nc == columnDispWk_col_059) doDispWk_col_059_NC(info);
		else if (nc == columnDispWk_col_060) doDispWk_col_060_NC(info);
		else if (nc == columnDispWk_col_061) doDispWk_col_061_NC(info);
		else if (nc == columnDispWk_col_062) doDispWk_col_062_NC(info);
		else if (nc == columnDispWk_col_063) doDispWk_col_063_NC(info);
		else if (nc == columnDispWk_col_064) doDispWk_col_064_NC(info);
		else if (nc == columnDispWk_col_065) doDispWk_col_065_NC(info);
		else if (nc == columnDispWk_col_066) doDispWk_col_066_NC(info);
		else if (nc == columnDispWk_col_067) doDispWk_col_067_NC(info);
		else if (nc == columnDispWk_col_068) doDispWk_col_068_NC(info);
		else if (nc == columnDispWk_col_069) doDispWk_col_069_NC(info);
		else if (nc == columnDispWk_col_070) doDispWk_col_070_NC(info);
		else if (nc == columnDispWk_col_071) doDispWk_col_071_NC(info);
		else if (nc == columnDispWk_col_072) doDispWk_col_072_NC(info);
		else if (nc == columnDispWk_col_073) doDispWk_col_073_NC(info);
		else if (nc == columnDispWk_col_074) doDispWk_col_074_NC(info);
		else if (nc == columnDispWk_col_075) doDispWk_col_075_NC(info);
		else if (nc == columnDispWk_col_076) doDispWk_col_076_NC(info);
		else if (nc == columnDispWk_col_077) doDispWk_col_077_NC(info);
		else if (nc == columnDispWk_col_078) doDispWk_col_078_NC(info);
		else if (nc == columnDispWk_col_079) doDispWk_col_079_NC(info);
		else if (nc == columnDispWk_col_080) doDispWk_col_080_NC(info);
		else if (nc == columnDispWk_col_081) doDispWk_col_081_NC(info);
		else if (nc == columnDispWk_col_082) doDispWk_col_082_NC(info);
		else if (nc == columnDispWk_col_083) doDispWk_col_083_NC(info);
		else if (nc == columnDispWk_col_084) doDispWk_col_084_NC(info);
		else if (nc == columnDispWk_col_085) doDispWk_col_085_NC(info);
		else if (nc == columnDispWk_col_086) doDispWk_col_086_NC(info);
		else if (nc == columnDispWk_col_087) doDispWk_col_087_NC(info);
		else if (nc == columnDispWk_col_088) doDispWk_col_088_NC(info);
		else if (nc == columnDispWk_col_089) doDispWk_col_089_NC(info);
		else if (nc == columnDispWk_col_090) doDispWk_col_090_NC(info);
		else if (nc == columnDispWk_col_091) doDispWk_col_091_NC(info);
		else if (nc == columnDispWk_col_092) doDispWk_col_092_NC(info);
		else if (nc == columnDispWk_col_093) doDispWk_col_093_NC(info);
		else if (nc == columnDispWk_col_094) doDispWk_col_094_NC(info);
		else if (nc == columnDispWk_col_095) doDispWk_col_095_NC(info);
		else if (nc == columnDispWk_col_096) doDispWk_col_096_NC(info);
		else if (nc == columnDispWk_col_097) doDispWk_col_097_NC(info);
		else if (nc == columnDispWk_col_098) doDispWk_col_098_NC(info);
		else if (nc == columnDispWk_col_099) doDispWk_col_099_NC(info);
	}

	/**
	 * [DtlOper]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_NC(MCEventInfo info){
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_NC(MCEventInfo info){
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
	 * [LPnl]パネルの[theory]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_theory_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_upri_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[the_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_the_upri_NC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_std_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_std_qty_NC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_unit_conv_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_unit_conv_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Disp]パネルの[expns_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDisp_expns_grp_NC(MCEventInfo info){
	}

	/**
	 * [Disp]パネルの[expns]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDisp_expns_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_upri_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[the_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_the_upri_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[the_cost]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_the_cost_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[ttl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_ttl_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[var_cost]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_var_cost_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[fxd_cost]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_fxd_cost_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_000]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_000_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_001]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_001_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_002]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_002_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_003]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_003_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_004]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_004_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_005]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_005_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_006]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_006_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_007]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_007_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_008]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_008_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_009]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_009_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_010]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_010_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_011]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_011_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_012]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_012_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_013]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_013_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_014]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_014_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_015]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_015_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_016]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_016_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_017]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_017_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_018]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_018_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_019]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_019_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_020]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_020_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_021]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_021_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_022]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_022_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_023]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_023_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_024]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_024_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_025]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_025_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_026]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_026_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_027]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_027_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_028]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_028_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_029]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_029_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_030]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_030_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_031]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_031_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_032]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_032_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_033]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_033_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_034]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_034_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_035]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_035_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_036]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_036_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_037]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_037_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_038]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_038_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_039]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_039_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_040]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_040_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_041]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_041_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_042]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_042_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_043]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_043_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_044]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_044_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_045]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_045_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_046]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_046_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_047]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_047_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_048]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_048_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_049]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_049_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_050]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_050_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_051]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_051_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_052]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_052_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_053]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_053_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_054]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_054_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_055]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_055_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_056]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_056_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_057]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_057_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_058]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_058_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_059]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_059_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_060]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_060_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_061]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_061_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_062]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_062_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_063]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_063_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_064]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_064_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_065]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_065_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_066]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_066_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_067]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_067_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_068]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_068_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_069]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_069_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_070]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_070_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_071]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_071_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_072]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_072_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_073]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_073_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_074]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_074_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_075]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_075_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_076]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_076_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_077]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_077_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_078]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_078_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_079]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_079_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_080]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_080_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_081]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_081_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_082]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_082_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_083]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_083_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_084]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_084_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_085]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_085_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_086]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_086_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_087]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_087_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_088]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_088_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_089]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_089_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_090]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_090_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_091]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_091_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_092]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_092_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_093]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_093_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_094]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_094_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_095]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_095_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_096]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_096_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_097]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_097_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_098]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_098_NC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_099]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_099_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wk_cost_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wk_cost_cd_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wk_cost_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wk_cost_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_upri_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[the_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_the_upri_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wk_cost_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wk_cost_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[the_cost]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_the_cost_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[ttl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_ttl_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[var_cost]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_var_cost_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[fxd_cost]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_fxd_cost_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_000]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_000_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_001]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_001_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_002]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_002_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_003]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_003_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_004]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_004_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_005]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_005_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_006]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_006_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_007]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_007_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_008]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_008_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_009]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_009_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_010]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_010_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_011]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_011_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_012]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_012_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_013]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_013_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_014]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_014_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_015]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_015_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_016]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_016_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_017]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_017_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_018]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_018_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_019]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_019_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_020]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_020_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_021]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_021_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_022]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_022_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_023]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_023_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_024]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_024_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_025]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_025_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_026]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_026_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_027]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_027_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_028]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_028_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_029]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_029_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_030]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_030_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_031]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_031_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_032]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_032_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_033]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_033_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_034]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_034_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_035]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_035_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_036]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_036_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_037]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_037_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_038]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_038_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_039]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_039_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_040]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_040_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_041]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_041_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_042]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_042_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_043]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_043_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_044]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_044_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_045]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_045_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_046]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_046_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_047]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_047_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_048]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_048_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_049]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_049_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_050]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_050_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_051]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_051_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_052]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_052_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_053]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_053_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_054]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_054_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_055]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_055_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_056]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_056_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_057]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_057_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_058]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_058_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_059]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_059_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_060]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_060_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_061]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_061_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_062]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_062_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_063]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_063_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_064]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_064_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_065]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_065_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_066]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_066_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_067]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_067_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_068]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_068_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_069]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_069_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_070]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_070_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_071]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_071_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_072]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_072_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_073]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_073_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_074]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_074_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_075]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_075_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_076]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_076_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_077]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_077_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_078]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_078_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_079]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_079_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_080]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_080_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_081]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_081_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_082]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_082_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_083]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_083_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_084]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_084_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_085]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_085_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_086]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_086_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_087]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_087_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_088]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_088_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_089]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_089_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_090]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_090_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_091]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_091_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_092]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_092_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_093]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_093_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_094]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_094_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_095]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_095_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_096]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_096_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_097]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_097_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_098]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_098_NC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_099]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_099_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlOperTable) doDtlOper_NE(info);
		else if (ne == DtlTabTab) doDtlTab_NE(info);
		else if (ne == DispInptTable) doDispInpt_NE(info);
		else if (ne == DispWkTable) doDispWk_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == LPnl_theory) doLPnl_theory_NE(info);
		else if (ne == Hdr_base_unit_cd) doHdr_base_unit_cd_NE(info);
		else if (ne == Hdr_base_unit_nm) doHdr_base_unit_nm_NE(info);
		else if (ne == Hdr_base_unit_dec_place) doHdr_base_unit_dec_place_NE(info);
		else if (ne == Hdr_std_upri) doHdr_std_upri_NE(info);
		else if (ne == Hdr_the_upri) doHdr_the_upri_NE(info);
		else if (ne == columnDtlOper_loc_cd) doDtlOper_loc_cd_NE(info);
		else if (ne == columnDtlOper_loc_nm) doDtlOper_loc_nm_NE(info);
		else if (ne == columnDtlOper_disp_seq) doDtlOper_disp_seq_NE(info);
		else if (ne == columnDtlOper_oper_cd) doDtlOper_oper_cd_NE(info);
		else if (ne == columnDtlOper_oper_nm) doDtlOper_oper_nm_NE(info);
		else if (ne == columnDtlOper_oper_seq) doDtlOper_oper_seq_NE(info);
		else if (ne == columnDtlOper_base_unit_cd) doDtlOper_base_unit_cd_NE(info);
		else if (ne == columnDtlOper_base_unit_nm) doDtlOper_base_unit_nm_NE(info);
		else if (ne == columnDtlOper_base_unit_dec_place) doDtlOper_base_unit_dec_place_NE(info);
		else if (ne == columnDtlOper_oper_unit_cd) doDtlOper_oper_unit_cd_NE(info);
		else if (ne == columnDtlOper_oper_unit_nm) doDtlOper_oper_unit_nm_NE(info);
		else if (ne == columnDtlOper_oper_dec_place) doDtlOper_oper_dec_place_NE(info);
		else if (ne == columnDtlOper_oper_std_qty) doDtlOper_oper_std_qty_NE(info);
		else if (ne == columnDtlOper_oper_conv_qty) doDtlOper_oper_conv_qty_NE(info);
		else if (ne == columnDtlOper_oper_unit_conv_rnd_typ) doDtlOper_oper_unit_conv_rnd_typ_NE(info);
		else if (ne == Disp_expns_grp) doDisp_expns_grp_NE(info);
		else if (ne == Disp_expns) doDisp_expns_NE(info);
		else if (ne == columnDispInpt_wg_cd) doDispInpt_wg_cd_NE(info);
		else if (ne == columnDispInpt_wg_nm) doDispInpt_wg_nm_NE(info);
		else if (ne == columnDispInpt_itm_typ) doDispInpt_itm_typ_NE(info);
		else if (ne == columnDispInpt_itm_typ_nm) doDispInpt_itm_typ_nm_NE(info);
		else if (ne == columnDispInpt_itm_typ_d_cd) doDispInpt_itm_typ_d_cd_NE(info);
		else if (ne == columnDispInpt_itm_typ_d_nm) doDispInpt_itm_typ_d_nm_NE(info);
		else if (ne == columnDispInpt_itm_jnl_cd) doDispInpt_itm_jnl_cd_NE(info);
		else if (ne == columnDispInpt_itm_jnl_nm) doDispInpt_itm_jnl_nm_NE(info);
		else if (ne == columnDispInpt_upri) doDispInpt_upri_NE(info);
		else if (ne == columnDispInpt_the_upri) doDispInpt_the_upri_NE(info);
		else if (ne == columnDispInpt_base_unit_cd) doDispInpt_base_unit_cd_NE(info);
		else if (ne == columnDispInpt_base_unit_nm) doDispInpt_base_unit_nm_NE(info);
		else if (ne == columnDispInpt_the_cost) doDispInpt_the_cost_NE(info);
		else if (ne == columnDispInpt_ttl) doDispInpt_ttl_NE(info);
		else if (ne == columnDispInpt_var_cost) doDispInpt_var_cost_NE(info);
		else if (ne == columnDispInpt_fxd_cost) doDispInpt_fxd_cost_NE(info);
		else if (ne == columnDispInpt_col_000) doDispInpt_col_000_NE(info);
		else if (ne == columnDispInpt_col_001) doDispInpt_col_001_NE(info);
		else if (ne == columnDispInpt_col_002) doDispInpt_col_002_NE(info);
		else if (ne == columnDispInpt_col_003) doDispInpt_col_003_NE(info);
		else if (ne == columnDispInpt_col_004) doDispInpt_col_004_NE(info);
		else if (ne == columnDispInpt_col_005) doDispInpt_col_005_NE(info);
		else if (ne == columnDispInpt_col_006) doDispInpt_col_006_NE(info);
		else if (ne == columnDispInpt_col_007) doDispInpt_col_007_NE(info);
		else if (ne == columnDispInpt_col_008) doDispInpt_col_008_NE(info);
		else if (ne == columnDispInpt_col_009) doDispInpt_col_009_NE(info);
		else if (ne == columnDispInpt_col_010) doDispInpt_col_010_NE(info);
		else if (ne == columnDispInpt_col_011) doDispInpt_col_011_NE(info);
		else if (ne == columnDispInpt_col_012) doDispInpt_col_012_NE(info);
		else if (ne == columnDispInpt_col_013) doDispInpt_col_013_NE(info);
		else if (ne == columnDispInpt_col_014) doDispInpt_col_014_NE(info);
		else if (ne == columnDispInpt_col_015) doDispInpt_col_015_NE(info);
		else if (ne == columnDispInpt_col_016) doDispInpt_col_016_NE(info);
		else if (ne == columnDispInpt_col_017) doDispInpt_col_017_NE(info);
		else if (ne == columnDispInpt_col_018) doDispInpt_col_018_NE(info);
		else if (ne == columnDispInpt_col_019) doDispInpt_col_019_NE(info);
		else if (ne == columnDispInpt_col_020) doDispInpt_col_020_NE(info);
		else if (ne == columnDispInpt_col_021) doDispInpt_col_021_NE(info);
		else if (ne == columnDispInpt_col_022) doDispInpt_col_022_NE(info);
		else if (ne == columnDispInpt_col_023) doDispInpt_col_023_NE(info);
		else if (ne == columnDispInpt_col_024) doDispInpt_col_024_NE(info);
		else if (ne == columnDispInpt_col_025) doDispInpt_col_025_NE(info);
		else if (ne == columnDispInpt_col_026) doDispInpt_col_026_NE(info);
		else if (ne == columnDispInpt_col_027) doDispInpt_col_027_NE(info);
		else if (ne == columnDispInpt_col_028) doDispInpt_col_028_NE(info);
		else if (ne == columnDispInpt_col_029) doDispInpt_col_029_NE(info);
		else if (ne == columnDispInpt_col_030) doDispInpt_col_030_NE(info);
		else if (ne == columnDispInpt_col_031) doDispInpt_col_031_NE(info);
		else if (ne == columnDispInpt_col_032) doDispInpt_col_032_NE(info);
		else if (ne == columnDispInpt_col_033) doDispInpt_col_033_NE(info);
		else if (ne == columnDispInpt_col_034) doDispInpt_col_034_NE(info);
		else if (ne == columnDispInpt_col_035) doDispInpt_col_035_NE(info);
		else if (ne == columnDispInpt_col_036) doDispInpt_col_036_NE(info);
		else if (ne == columnDispInpt_col_037) doDispInpt_col_037_NE(info);
		else if (ne == columnDispInpt_col_038) doDispInpt_col_038_NE(info);
		else if (ne == columnDispInpt_col_039) doDispInpt_col_039_NE(info);
		else if (ne == columnDispInpt_col_040) doDispInpt_col_040_NE(info);
		else if (ne == columnDispInpt_col_041) doDispInpt_col_041_NE(info);
		else if (ne == columnDispInpt_col_042) doDispInpt_col_042_NE(info);
		else if (ne == columnDispInpt_col_043) doDispInpt_col_043_NE(info);
		else if (ne == columnDispInpt_col_044) doDispInpt_col_044_NE(info);
		else if (ne == columnDispInpt_col_045) doDispInpt_col_045_NE(info);
		else if (ne == columnDispInpt_col_046) doDispInpt_col_046_NE(info);
		else if (ne == columnDispInpt_col_047) doDispInpt_col_047_NE(info);
		else if (ne == columnDispInpt_col_048) doDispInpt_col_048_NE(info);
		else if (ne == columnDispInpt_col_049) doDispInpt_col_049_NE(info);
		else if (ne == columnDispInpt_col_050) doDispInpt_col_050_NE(info);
		else if (ne == columnDispInpt_col_051) doDispInpt_col_051_NE(info);
		else if (ne == columnDispInpt_col_052) doDispInpt_col_052_NE(info);
		else if (ne == columnDispInpt_col_053) doDispInpt_col_053_NE(info);
		else if (ne == columnDispInpt_col_054) doDispInpt_col_054_NE(info);
		else if (ne == columnDispInpt_col_055) doDispInpt_col_055_NE(info);
		else if (ne == columnDispInpt_col_056) doDispInpt_col_056_NE(info);
		else if (ne == columnDispInpt_col_057) doDispInpt_col_057_NE(info);
		else if (ne == columnDispInpt_col_058) doDispInpt_col_058_NE(info);
		else if (ne == columnDispInpt_col_059) doDispInpt_col_059_NE(info);
		else if (ne == columnDispInpt_col_060) doDispInpt_col_060_NE(info);
		else if (ne == columnDispInpt_col_061) doDispInpt_col_061_NE(info);
		else if (ne == columnDispInpt_col_062) doDispInpt_col_062_NE(info);
		else if (ne == columnDispInpt_col_063) doDispInpt_col_063_NE(info);
		else if (ne == columnDispInpt_col_064) doDispInpt_col_064_NE(info);
		else if (ne == columnDispInpt_col_065) doDispInpt_col_065_NE(info);
		else if (ne == columnDispInpt_col_066) doDispInpt_col_066_NE(info);
		else if (ne == columnDispInpt_col_067) doDispInpt_col_067_NE(info);
		else if (ne == columnDispInpt_col_068) doDispInpt_col_068_NE(info);
		else if (ne == columnDispInpt_col_069) doDispInpt_col_069_NE(info);
		else if (ne == columnDispInpt_col_070) doDispInpt_col_070_NE(info);
		else if (ne == columnDispInpt_col_071) doDispInpt_col_071_NE(info);
		else if (ne == columnDispInpt_col_072) doDispInpt_col_072_NE(info);
		else if (ne == columnDispInpt_col_073) doDispInpt_col_073_NE(info);
		else if (ne == columnDispInpt_col_074) doDispInpt_col_074_NE(info);
		else if (ne == columnDispInpt_col_075) doDispInpt_col_075_NE(info);
		else if (ne == columnDispInpt_col_076) doDispInpt_col_076_NE(info);
		else if (ne == columnDispInpt_col_077) doDispInpt_col_077_NE(info);
		else if (ne == columnDispInpt_col_078) doDispInpt_col_078_NE(info);
		else if (ne == columnDispInpt_col_079) doDispInpt_col_079_NE(info);
		else if (ne == columnDispInpt_col_080) doDispInpt_col_080_NE(info);
		else if (ne == columnDispInpt_col_081) doDispInpt_col_081_NE(info);
		else if (ne == columnDispInpt_col_082) doDispInpt_col_082_NE(info);
		else if (ne == columnDispInpt_col_083) doDispInpt_col_083_NE(info);
		else if (ne == columnDispInpt_col_084) doDispInpt_col_084_NE(info);
		else if (ne == columnDispInpt_col_085) doDispInpt_col_085_NE(info);
		else if (ne == columnDispInpt_col_086) doDispInpt_col_086_NE(info);
		else if (ne == columnDispInpt_col_087) doDispInpt_col_087_NE(info);
		else if (ne == columnDispInpt_col_088) doDispInpt_col_088_NE(info);
		else if (ne == columnDispInpt_col_089) doDispInpt_col_089_NE(info);
		else if (ne == columnDispInpt_col_090) doDispInpt_col_090_NE(info);
		else if (ne == columnDispInpt_col_091) doDispInpt_col_091_NE(info);
		else if (ne == columnDispInpt_col_092) doDispInpt_col_092_NE(info);
		else if (ne == columnDispInpt_col_093) doDispInpt_col_093_NE(info);
		else if (ne == columnDispInpt_col_094) doDispInpt_col_094_NE(info);
		else if (ne == columnDispInpt_col_095) doDispInpt_col_095_NE(info);
		else if (ne == columnDispInpt_col_096) doDispInpt_col_096_NE(info);
		else if (ne == columnDispInpt_col_097) doDispInpt_col_097_NE(info);
		else if (ne == columnDispInpt_col_098) doDispInpt_col_098_NE(info);
		else if (ne == columnDispInpt_col_099) doDispInpt_col_099_NE(info);
		else if (ne == columnDispWk_wg_cd) doDispWk_wg_cd_NE(info);
		else if (ne == columnDispWk_wg_nm) doDispWk_wg_nm_NE(info);
		else if (ne == columnDispWk_loc_cd) doDispWk_loc_cd_NE(info);
		else if (ne == columnDispWk_loc_nm) doDispWk_loc_nm_NE(info);
		else if (ne == columnDispWk_oper_cd) doDispWk_oper_cd_NE(info);
		else if (ne == columnDispWk_oper_nm) doDispWk_oper_nm_NE(info);
		else if (ne == columnDispWk_wk_cost_cd) doDispWk_wk_cost_cd_NE(info);
		else if (ne == columnDispWk_wk_cost_nm) doDispWk_wk_cost_nm_NE(info);
		else if (ne == columnDispWk_upri) doDispWk_upri_NE(info);
		else if (ne == columnDispWk_the_upri) doDispWk_the_upri_NE(info);
		else if (ne == columnDispWk_wk_cost_unit_nm) doDispWk_wk_cost_unit_nm_NE(info);
		else if (ne == columnDispWk_dec_place) doDispWk_dec_place_NE(info);
		else if (ne == columnDispWk_the_cost) doDispWk_the_cost_NE(info);
		else if (ne == columnDispWk_ttl) doDispWk_ttl_NE(info);
		else if (ne == columnDispWk_var_cost) doDispWk_var_cost_NE(info);
		else if (ne == columnDispWk_fxd_cost) doDispWk_fxd_cost_NE(info);
		else if (ne == columnDispWk_col_000) doDispWk_col_000_NE(info);
		else if (ne == columnDispWk_col_001) doDispWk_col_001_NE(info);
		else if (ne == columnDispWk_col_002) doDispWk_col_002_NE(info);
		else if (ne == columnDispWk_col_003) doDispWk_col_003_NE(info);
		else if (ne == columnDispWk_col_004) doDispWk_col_004_NE(info);
		else if (ne == columnDispWk_col_005) doDispWk_col_005_NE(info);
		else if (ne == columnDispWk_col_006) doDispWk_col_006_NE(info);
		else if (ne == columnDispWk_col_007) doDispWk_col_007_NE(info);
		else if (ne == columnDispWk_col_008) doDispWk_col_008_NE(info);
		else if (ne == columnDispWk_col_009) doDispWk_col_009_NE(info);
		else if (ne == columnDispWk_col_010) doDispWk_col_010_NE(info);
		else if (ne == columnDispWk_col_011) doDispWk_col_011_NE(info);
		else if (ne == columnDispWk_col_012) doDispWk_col_012_NE(info);
		else if (ne == columnDispWk_col_013) doDispWk_col_013_NE(info);
		else if (ne == columnDispWk_col_014) doDispWk_col_014_NE(info);
		else if (ne == columnDispWk_col_015) doDispWk_col_015_NE(info);
		else if (ne == columnDispWk_col_016) doDispWk_col_016_NE(info);
		else if (ne == columnDispWk_col_017) doDispWk_col_017_NE(info);
		else if (ne == columnDispWk_col_018) doDispWk_col_018_NE(info);
		else if (ne == columnDispWk_col_019) doDispWk_col_019_NE(info);
		else if (ne == columnDispWk_col_020) doDispWk_col_020_NE(info);
		else if (ne == columnDispWk_col_021) doDispWk_col_021_NE(info);
		else if (ne == columnDispWk_col_022) doDispWk_col_022_NE(info);
		else if (ne == columnDispWk_col_023) doDispWk_col_023_NE(info);
		else if (ne == columnDispWk_col_024) doDispWk_col_024_NE(info);
		else if (ne == columnDispWk_col_025) doDispWk_col_025_NE(info);
		else if (ne == columnDispWk_col_026) doDispWk_col_026_NE(info);
		else if (ne == columnDispWk_col_027) doDispWk_col_027_NE(info);
		else if (ne == columnDispWk_col_028) doDispWk_col_028_NE(info);
		else if (ne == columnDispWk_col_029) doDispWk_col_029_NE(info);
		else if (ne == columnDispWk_col_030) doDispWk_col_030_NE(info);
		else if (ne == columnDispWk_col_031) doDispWk_col_031_NE(info);
		else if (ne == columnDispWk_col_032) doDispWk_col_032_NE(info);
		else if (ne == columnDispWk_col_033) doDispWk_col_033_NE(info);
		else if (ne == columnDispWk_col_034) doDispWk_col_034_NE(info);
		else if (ne == columnDispWk_col_035) doDispWk_col_035_NE(info);
		else if (ne == columnDispWk_col_036) doDispWk_col_036_NE(info);
		else if (ne == columnDispWk_col_037) doDispWk_col_037_NE(info);
		else if (ne == columnDispWk_col_038) doDispWk_col_038_NE(info);
		else if (ne == columnDispWk_col_039) doDispWk_col_039_NE(info);
		else if (ne == columnDispWk_col_040) doDispWk_col_040_NE(info);
		else if (ne == columnDispWk_col_041) doDispWk_col_041_NE(info);
		else if (ne == columnDispWk_col_042) doDispWk_col_042_NE(info);
		else if (ne == columnDispWk_col_043) doDispWk_col_043_NE(info);
		else if (ne == columnDispWk_col_044) doDispWk_col_044_NE(info);
		else if (ne == columnDispWk_col_045) doDispWk_col_045_NE(info);
		else if (ne == columnDispWk_col_046) doDispWk_col_046_NE(info);
		else if (ne == columnDispWk_col_047) doDispWk_col_047_NE(info);
		else if (ne == columnDispWk_col_048) doDispWk_col_048_NE(info);
		else if (ne == columnDispWk_col_049) doDispWk_col_049_NE(info);
		else if (ne == columnDispWk_col_050) doDispWk_col_050_NE(info);
		else if (ne == columnDispWk_col_051) doDispWk_col_051_NE(info);
		else if (ne == columnDispWk_col_052) doDispWk_col_052_NE(info);
		else if (ne == columnDispWk_col_053) doDispWk_col_053_NE(info);
		else if (ne == columnDispWk_col_054) doDispWk_col_054_NE(info);
		else if (ne == columnDispWk_col_055) doDispWk_col_055_NE(info);
		else if (ne == columnDispWk_col_056) doDispWk_col_056_NE(info);
		else if (ne == columnDispWk_col_057) doDispWk_col_057_NE(info);
		else if (ne == columnDispWk_col_058) doDispWk_col_058_NE(info);
		else if (ne == columnDispWk_col_059) doDispWk_col_059_NE(info);
		else if (ne == columnDispWk_col_060) doDispWk_col_060_NE(info);
		else if (ne == columnDispWk_col_061) doDispWk_col_061_NE(info);
		else if (ne == columnDispWk_col_062) doDispWk_col_062_NE(info);
		else if (ne == columnDispWk_col_063) doDispWk_col_063_NE(info);
		else if (ne == columnDispWk_col_064) doDispWk_col_064_NE(info);
		else if (ne == columnDispWk_col_065) doDispWk_col_065_NE(info);
		else if (ne == columnDispWk_col_066) doDispWk_col_066_NE(info);
		else if (ne == columnDispWk_col_067) doDispWk_col_067_NE(info);
		else if (ne == columnDispWk_col_068) doDispWk_col_068_NE(info);
		else if (ne == columnDispWk_col_069) doDispWk_col_069_NE(info);
		else if (ne == columnDispWk_col_070) doDispWk_col_070_NE(info);
		else if (ne == columnDispWk_col_071) doDispWk_col_071_NE(info);
		else if (ne == columnDispWk_col_072) doDispWk_col_072_NE(info);
		else if (ne == columnDispWk_col_073) doDispWk_col_073_NE(info);
		else if (ne == columnDispWk_col_074) doDispWk_col_074_NE(info);
		else if (ne == columnDispWk_col_075) doDispWk_col_075_NE(info);
		else if (ne == columnDispWk_col_076) doDispWk_col_076_NE(info);
		else if (ne == columnDispWk_col_077) doDispWk_col_077_NE(info);
		else if (ne == columnDispWk_col_078) doDispWk_col_078_NE(info);
		else if (ne == columnDispWk_col_079) doDispWk_col_079_NE(info);
		else if (ne == columnDispWk_col_080) doDispWk_col_080_NE(info);
		else if (ne == columnDispWk_col_081) doDispWk_col_081_NE(info);
		else if (ne == columnDispWk_col_082) doDispWk_col_082_NE(info);
		else if (ne == columnDispWk_col_083) doDispWk_col_083_NE(info);
		else if (ne == columnDispWk_col_084) doDispWk_col_084_NE(info);
		else if (ne == columnDispWk_col_085) doDispWk_col_085_NE(info);
		else if (ne == columnDispWk_col_086) doDispWk_col_086_NE(info);
		else if (ne == columnDispWk_col_087) doDispWk_col_087_NE(info);
		else if (ne == columnDispWk_col_088) doDispWk_col_088_NE(info);
		else if (ne == columnDispWk_col_089) doDispWk_col_089_NE(info);
		else if (ne == columnDispWk_col_090) doDispWk_col_090_NE(info);
		else if (ne == columnDispWk_col_091) doDispWk_col_091_NE(info);
		else if (ne == columnDispWk_col_092) doDispWk_col_092_NE(info);
		else if (ne == columnDispWk_col_093) doDispWk_col_093_NE(info);
		else if (ne == columnDispWk_col_094) doDispWk_col_094_NE(info);
		else if (ne == columnDispWk_col_095) doDispWk_col_095_NE(info);
		else if (ne == columnDispWk_col_096) doDispWk_col_096_NE(info);
		else if (ne == columnDispWk_col_097) doDispWk_col_097_NE(info);
		else if (ne == columnDispWk_col_098) doDispWk_col_098_NE(info);
		else if (ne == columnDispWk_col_099) doDispWk_col_099_NE(info);
	}

	/**
	 * [DtlOper]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_NE(MCEventInfo info){
	}

	/**
	 * [DtlTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_NE(MCEventInfo info){
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
	 * [LPnl]パネルの[theory]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_theory_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_upri_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[the_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_the_upri_NE(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_std_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_std_qty_NE(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_unit_conv_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_unit_conv_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Disp]パネルの[expns_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDisp_expns_grp_NE(MCEventInfo info){
	}

	/**
	 * [Disp]パネルの[expns]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDisp_expns_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_upri_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[the_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_the_upri_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[the_cost]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_the_cost_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[ttl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_ttl_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[var_cost]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_var_cost_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[fxd_cost]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_fxd_cost_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_000]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_000_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_001]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_001_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_002]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_002_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_003]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_003_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_004]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_004_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_005]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_005_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_006]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_006_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_007]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_007_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_008]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_008_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_009]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_009_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_010]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_010_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_011]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_011_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_012]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_012_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_013]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_013_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_014]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_014_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_015]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_015_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_016]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_016_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_017]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_017_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_018]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_018_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_019]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_019_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_020]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_020_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_021]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_021_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_022]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_022_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_023]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_023_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_024]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_024_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_025]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_025_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_026]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_026_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_027]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_027_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_028]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_028_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_029]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_029_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_030]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_030_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_031]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_031_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_032]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_032_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_033]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_033_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_034]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_034_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_035]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_035_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_036]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_036_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_037]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_037_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_038]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_038_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_039]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_039_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_040]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_040_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_041]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_041_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_042]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_042_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_043]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_043_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_044]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_044_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_045]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_045_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_046]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_046_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_047]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_047_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_048]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_048_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_049]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_049_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_050]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_050_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_051]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_051_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_052]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_052_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_053]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_053_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_054]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_054_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_055]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_055_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_056]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_056_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_057]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_057_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_058]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_058_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_059]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_059_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_060]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_060_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_061]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_061_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_062]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_062_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_063]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_063_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_064]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_064_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_065]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_065_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_066]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_066_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_067]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_067_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_068]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_068_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_069]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_069_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_070]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_070_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_071]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_071_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_072]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_072_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_073]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_073_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_074]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_074_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_075]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_075_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_076]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_076_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_077]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_077_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_078]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_078_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_079]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_079_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_080]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_080_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_081]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_081_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_082]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_082_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_083]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_083_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_084]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_084_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_085]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_085_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_086]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_086_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_087]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_087_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_088]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_088_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_089]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_089_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_090]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_090_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_091]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_091_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_092]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_092_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_093]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_093_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_094]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_094_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_095]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_095_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_096]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_096_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_097]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_097_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_098]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_098_NE(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_099]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_099_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wk_cost_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wk_cost_cd_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wk_cost_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wk_cost_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_upri_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[the_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_the_upri_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wk_cost_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wk_cost_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[the_cost]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_the_cost_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[ttl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_ttl_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[var_cost]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_var_cost_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[fxd_cost]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_fxd_cost_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_000]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_000_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_001]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_001_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_002]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_002_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_003]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_003_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_004]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_004_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_005]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_005_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_006]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_006_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_007]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_007_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_008]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_008_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_009]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_009_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_010]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_010_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_011]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_011_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_012]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_012_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_013]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_013_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_014]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_014_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_015]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_015_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_016]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_016_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_017]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_017_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_018]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_018_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_019]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_019_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_020]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_020_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_021]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_021_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_022]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_022_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_023]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_023_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_024]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_024_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_025]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_025_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_026]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_026_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_027]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_027_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_028]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_028_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_029]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_029_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_030]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_030_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_031]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_031_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_032]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_032_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_033]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_033_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_034]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_034_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_035]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_035_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_036]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_036_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_037]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_037_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_038]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_038_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_039]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_039_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_040]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_040_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_041]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_041_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_042]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_042_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_043]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_043_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_044]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_044_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_045]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_045_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_046]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_046_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_047]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_047_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_048]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_048_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_049]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_049_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_050]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_050_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_051]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_051_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_052]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_052_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_053]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_053_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_054]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_054_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_055]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_055_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_056]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_056_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_057]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_057_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_058]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_058_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_059]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_059_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_060]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_060_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_061]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_061_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_062]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_062_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_063]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_063_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_064]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_064_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_065]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_065_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_066]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_066_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_067]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_067_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_068]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_068_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_069]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_069_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_070]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_070_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_071]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_071_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_072]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_072_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_073]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_073_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_074]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_074_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_075]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_075_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_076]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_076_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_077]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_077_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_078]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_078_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_079]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_079_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_080]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_080_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_081]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_081_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_082]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_082_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_083]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_083_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_084]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_084_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_085]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_085_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_086]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_086_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_087]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_087_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_088]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_088_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_089]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_089_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_090]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_090_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_091]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_091_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_092]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_092_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_093]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_093_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_094]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_094_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_095]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_095_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_096]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_096_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_097]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_097_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_098]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_098_NE(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_099]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_099_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlOperTable) doDtlOper_NX(info);
		else if (nx == DtlTabTab) doDtlTab_NX(info);
		else if (nx == DispInptTable) doDispInpt_NX(info);
		else if (nx == DispWkTable) doDispWk_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == LPnl_theory) doLPnl_theory_NX(info);
		else if (nx == Hdr_base_unit_cd) doHdr_base_unit_cd_NX(info);
		else if (nx == Hdr_base_unit_nm) doHdr_base_unit_nm_NX(info);
		else if (nx == Hdr_base_unit_dec_place) doHdr_base_unit_dec_place_NX(info);
		else if (nx == Hdr_std_upri) doHdr_std_upri_NX(info);
		else if (nx == Hdr_the_upri) doHdr_the_upri_NX(info);
		else if (nx == columnDtlOper_loc_cd) doDtlOper_loc_cd_NX(info);
		else if (nx == columnDtlOper_loc_nm) doDtlOper_loc_nm_NX(info);
		else if (nx == columnDtlOper_disp_seq) doDtlOper_disp_seq_NX(info);
		else if (nx == columnDtlOper_oper_cd) doDtlOper_oper_cd_NX(info);
		else if (nx == columnDtlOper_oper_nm) doDtlOper_oper_nm_NX(info);
		else if (nx == columnDtlOper_oper_seq) doDtlOper_oper_seq_NX(info);
		else if (nx == columnDtlOper_base_unit_cd) doDtlOper_base_unit_cd_NX(info);
		else if (nx == columnDtlOper_base_unit_nm) doDtlOper_base_unit_nm_NX(info);
		else if (nx == columnDtlOper_base_unit_dec_place) doDtlOper_base_unit_dec_place_NX(info);
		else if (nx == columnDtlOper_oper_unit_cd) doDtlOper_oper_unit_cd_NX(info);
		else if (nx == columnDtlOper_oper_unit_nm) doDtlOper_oper_unit_nm_NX(info);
		else if (nx == columnDtlOper_oper_dec_place) doDtlOper_oper_dec_place_NX(info);
		else if (nx == columnDtlOper_oper_std_qty) doDtlOper_oper_std_qty_NX(info);
		else if (nx == columnDtlOper_oper_conv_qty) doDtlOper_oper_conv_qty_NX(info);
		else if (nx == columnDtlOper_oper_unit_conv_rnd_typ) doDtlOper_oper_unit_conv_rnd_typ_NX(info);
		else if (nx == Disp_expns_grp) doDisp_expns_grp_NX(info);
		else if (nx == Disp_expns) doDisp_expns_NX(info);
		else if (nx == columnDispInpt_wg_cd) doDispInpt_wg_cd_NX(info);
		else if (nx == columnDispInpt_wg_nm) doDispInpt_wg_nm_NX(info);
		else if (nx == columnDispInpt_itm_typ) doDispInpt_itm_typ_NX(info);
		else if (nx == columnDispInpt_itm_typ_nm) doDispInpt_itm_typ_nm_NX(info);
		else if (nx == columnDispInpt_itm_typ_d_cd) doDispInpt_itm_typ_d_cd_NX(info);
		else if (nx == columnDispInpt_itm_typ_d_nm) doDispInpt_itm_typ_d_nm_NX(info);
		else if (nx == columnDispInpt_itm_jnl_cd) doDispInpt_itm_jnl_cd_NX(info);
		else if (nx == columnDispInpt_itm_jnl_nm) doDispInpt_itm_jnl_nm_NX(info);
		else if (nx == columnDispInpt_upri) doDispInpt_upri_NX(info);
		else if (nx == columnDispInpt_the_upri) doDispInpt_the_upri_NX(info);
		else if (nx == columnDispInpt_base_unit_cd) doDispInpt_base_unit_cd_NX(info);
		else if (nx == columnDispInpt_base_unit_nm) doDispInpt_base_unit_nm_NX(info);
		else if (nx == columnDispInpt_the_cost) doDispInpt_the_cost_NX(info);
		else if (nx == columnDispInpt_ttl) doDispInpt_ttl_NX(info);
		else if (nx == columnDispInpt_var_cost) doDispInpt_var_cost_NX(info);
		else if (nx == columnDispInpt_fxd_cost) doDispInpt_fxd_cost_NX(info);
		else if (nx == columnDispInpt_col_000) doDispInpt_col_000_NX(info);
		else if (nx == columnDispInpt_col_001) doDispInpt_col_001_NX(info);
		else if (nx == columnDispInpt_col_002) doDispInpt_col_002_NX(info);
		else if (nx == columnDispInpt_col_003) doDispInpt_col_003_NX(info);
		else if (nx == columnDispInpt_col_004) doDispInpt_col_004_NX(info);
		else if (nx == columnDispInpt_col_005) doDispInpt_col_005_NX(info);
		else if (nx == columnDispInpt_col_006) doDispInpt_col_006_NX(info);
		else if (nx == columnDispInpt_col_007) doDispInpt_col_007_NX(info);
		else if (nx == columnDispInpt_col_008) doDispInpt_col_008_NX(info);
		else if (nx == columnDispInpt_col_009) doDispInpt_col_009_NX(info);
		else if (nx == columnDispInpt_col_010) doDispInpt_col_010_NX(info);
		else if (nx == columnDispInpt_col_011) doDispInpt_col_011_NX(info);
		else if (nx == columnDispInpt_col_012) doDispInpt_col_012_NX(info);
		else if (nx == columnDispInpt_col_013) doDispInpt_col_013_NX(info);
		else if (nx == columnDispInpt_col_014) doDispInpt_col_014_NX(info);
		else if (nx == columnDispInpt_col_015) doDispInpt_col_015_NX(info);
		else if (nx == columnDispInpt_col_016) doDispInpt_col_016_NX(info);
		else if (nx == columnDispInpt_col_017) doDispInpt_col_017_NX(info);
		else if (nx == columnDispInpt_col_018) doDispInpt_col_018_NX(info);
		else if (nx == columnDispInpt_col_019) doDispInpt_col_019_NX(info);
		else if (nx == columnDispInpt_col_020) doDispInpt_col_020_NX(info);
		else if (nx == columnDispInpt_col_021) doDispInpt_col_021_NX(info);
		else if (nx == columnDispInpt_col_022) doDispInpt_col_022_NX(info);
		else if (nx == columnDispInpt_col_023) doDispInpt_col_023_NX(info);
		else if (nx == columnDispInpt_col_024) doDispInpt_col_024_NX(info);
		else if (nx == columnDispInpt_col_025) doDispInpt_col_025_NX(info);
		else if (nx == columnDispInpt_col_026) doDispInpt_col_026_NX(info);
		else if (nx == columnDispInpt_col_027) doDispInpt_col_027_NX(info);
		else if (nx == columnDispInpt_col_028) doDispInpt_col_028_NX(info);
		else if (nx == columnDispInpt_col_029) doDispInpt_col_029_NX(info);
		else if (nx == columnDispInpt_col_030) doDispInpt_col_030_NX(info);
		else if (nx == columnDispInpt_col_031) doDispInpt_col_031_NX(info);
		else if (nx == columnDispInpt_col_032) doDispInpt_col_032_NX(info);
		else if (nx == columnDispInpt_col_033) doDispInpt_col_033_NX(info);
		else if (nx == columnDispInpt_col_034) doDispInpt_col_034_NX(info);
		else if (nx == columnDispInpt_col_035) doDispInpt_col_035_NX(info);
		else if (nx == columnDispInpt_col_036) doDispInpt_col_036_NX(info);
		else if (nx == columnDispInpt_col_037) doDispInpt_col_037_NX(info);
		else if (nx == columnDispInpt_col_038) doDispInpt_col_038_NX(info);
		else if (nx == columnDispInpt_col_039) doDispInpt_col_039_NX(info);
		else if (nx == columnDispInpt_col_040) doDispInpt_col_040_NX(info);
		else if (nx == columnDispInpt_col_041) doDispInpt_col_041_NX(info);
		else if (nx == columnDispInpt_col_042) doDispInpt_col_042_NX(info);
		else if (nx == columnDispInpt_col_043) doDispInpt_col_043_NX(info);
		else if (nx == columnDispInpt_col_044) doDispInpt_col_044_NX(info);
		else if (nx == columnDispInpt_col_045) doDispInpt_col_045_NX(info);
		else if (nx == columnDispInpt_col_046) doDispInpt_col_046_NX(info);
		else if (nx == columnDispInpt_col_047) doDispInpt_col_047_NX(info);
		else if (nx == columnDispInpt_col_048) doDispInpt_col_048_NX(info);
		else if (nx == columnDispInpt_col_049) doDispInpt_col_049_NX(info);
		else if (nx == columnDispInpt_col_050) doDispInpt_col_050_NX(info);
		else if (nx == columnDispInpt_col_051) doDispInpt_col_051_NX(info);
		else if (nx == columnDispInpt_col_052) doDispInpt_col_052_NX(info);
		else if (nx == columnDispInpt_col_053) doDispInpt_col_053_NX(info);
		else if (nx == columnDispInpt_col_054) doDispInpt_col_054_NX(info);
		else if (nx == columnDispInpt_col_055) doDispInpt_col_055_NX(info);
		else if (nx == columnDispInpt_col_056) doDispInpt_col_056_NX(info);
		else if (nx == columnDispInpt_col_057) doDispInpt_col_057_NX(info);
		else if (nx == columnDispInpt_col_058) doDispInpt_col_058_NX(info);
		else if (nx == columnDispInpt_col_059) doDispInpt_col_059_NX(info);
		else if (nx == columnDispInpt_col_060) doDispInpt_col_060_NX(info);
		else if (nx == columnDispInpt_col_061) doDispInpt_col_061_NX(info);
		else if (nx == columnDispInpt_col_062) doDispInpt_col_062_NX(info);
		else if (nx == columnDispInpt_col_063) doDispInpt_col_063_NX(info);
		else if (nx == columnDispInpt_col_064) doDispInpt_col_064_NX(info);
		else if (nx == columnDispInpt_col_065) doDispInpt_col_065_NX(info);
		else if (nx == columnDispInpt_col_066) doDispInpt_col_066_NX(info);
		else if (nx == columnDispInpt_col_067) doDispInpt_col_067_NX(info);
		else if (nx == columnDispInpt_col_068) doDispInpt_col_068_NX(info);
		else if (nx == columnDispInpt_col_069) doDispInpt_col_069_NX(info);
		else if (nx == columnDispInpt_col_070) doDispInpt_col_070_NX(info);
		else if (nx == columnDispInpt_col_071) doDispInpt_col_071_NX(info);
		else if (nx == columnDispInpt_col_072) doDispInpt_col_072_NX(info);
		else if (nx == columnDispInpt_col_073) doDispInpt_col_073_NX(info);
		else if (nx == columnDispInpt_col_074) doDispInpt_col_074_NX(info);
		else if (nx == columnDispInpt_col_075) doDispInpt_col_075_NX(info);
		else if (nx == columnDispInpt_col_076) doDispInpt_col_076_NX(info);
		else if (nx == columnDispInpt_col_077) doDispInpt_col_077_NX(info);
		else if (nx == columnDispInpt_col_078) doDispInpt_col_078_NX(info);
		else if (nx == columnDispInpt_col_079) doDispInpt_col_079_NX(info);
		else if (nx == columnDispInpt_col_080) doDispInpt_col_080_NX(info);
		else if (nx == columnDispInpt_col_081) doDispInpt_col_081_NX(info);
		else if (nx == columnDispInpt_col_082) doDispInpt_col_082_NX(info);
		else if (nx == columnDispInpt_col_083) doDispInpt_col_083_NX(info);
		else if (nx == columnDispInpt_col_084) doDispInpt_col_084_NX(info);
		else if (nx == columnDispInpt_col_085) doDispInpt_col_085_NX(info);
		else if (nx == columnDispInpt_col_086) doDispInpt_col_086_NX(info);
		else if (nx == columnDispInpt_col_087) doDispInpt_col_087_NX(info);
		else if (nx == columnDispInpt_col_088) doDispInpt_col_088_NX(info);
		else if (nx == columnDispInpt_col_089) doDispInpt_col_089_NX(info);
		else if (nx == columnDispInpt_col_090) doDispInpt_col_090_NX(info);
		else if (nx == columnDispInpt_col_091) doDispInpt_col_091_NX(info);
		else if (nx == columnDispInpt_col_092) doDispInpt_col_092_NX(info);
		else if (nx == columnDispInpt_col_093) doDispInpt_col_093_NX(info);
		else if (nx == columnDispInpt_col_094) doDispInpt_col_094_NX(info);
		else if (nx == columnDispInpt_col_095) doDispInpt_col_095_NX(info);
		else if (nx == columnDispInpt_col_096) doDispInpt_col_096_NX(info);
		else if (nx == columnDispInpt_col_097) doDispInpt_col_097_NX(info);
		else if (nx == columnDispInpt_col_098) doDispInpt_col_098_NX(info);
		else if (nx == columnDispInpt_col_099) doDispInpt_col_099_NX(info);
		else if (nx == columnDispWk_wg_cd) doDispWk_wg_cd_NX(info);
		else if (nx == columnDispWk_wg_nm) doDispWk_wg_nm_NX(info);
		else if (nx == columnDispWk_loc_cd) doDispWk_loc_cd_NX(info);
		else if (nx == columnDispWk_loc_nm) doDispWk_loc_nm_NX(info);
		else if (nx == columnDispWk_oper_cd) doDispWk_oper_cd_NX(info);
		else if (nx == columnDispWk_oper_nm) doDispWk_oper_nm_NX(info);
		else if (nx == columnDispWk_wk_cost_cd) doDispWk_wk_cost_cd_NX(info);
		else if (nx == columnDispWk_wk_cost_nm) doDispWk_wk_cost_nm_NX(info);
		else if (nx == columnDispWk_upri) doDispWk_upri_NX(info);
		else if (nx == columnDispWk_the_upri) doDispWk_the_upri_NX(info);
		else if (nx == columnDispWk_wk_cost_unit_nm) doDispWk_wk_cost_unit_nm_NX(info);
		else if (nx == columnDispWk_dec_place) doDispWk_dec_place_NX(info);
		else if (nx == columnDispWk_the_cost) doDispWk_the_cost_NX(info);
		else if (nx == columnDispWk_ttl) doDispWk_ttl_NX(info);
		else if (nx == columnDispWk_var_cost) doDispWk_var_cost_NX(info);
		else if (nx == columnDispWk_fxd_cost) doDispWk_fxd_cost_NX(info);
		else if (nx == columnDispWk_col_000) doDispWk_col_000_NX(info);
		else if (nx == columnDispWk_col_001) doDispWk_col_001_NX(info);
		else if (nx == columnDispWk_col_002) doDispWk_col_002_NX(info);
		else if (nx == columnDispWk_col_003) doDispWk_col_003_NX(info);
		else if (nx == columnDispWk_col_004) doDispWk_col_004_NX(info);
		else if (nx == columnDispWk_col_005) doDispWk_col_005_NX(info);
		else if (nx == columnDispWk_col_006) doDispWk_col_006_NX(info);
		else if (nx == columnDispWk_col_007) doDispWk_col_007_NX(info);
		else if (nx == columnDispWk_col_008) doDispWk_col_008_NX(info);
		else if (nx == columnDispWk_col_009) doDispWk_col_009_NX(info);
		else if (nx == columnDispWk_col_010) doDispWk_col_010_NX(info);
		else if (nx == columnDispWk_col_011) doDispWk_col_011_NX(info);
		else if (nx == columnDispWk_col_012) doDispWk_col_012_NX(info);
		else if (nx == columnDispWk_col_013) doDispWk_col_013_NX(info);
		else if (nx == columnDispWk_col_014) doDispWk_col_014_NX(info);
		else if (nx == columnDispWk_col_015) doDispWk_col_015_NX(info);
		else if (nx == columnDispWk_col_016) doDispWk_col_016_NX(info);
		else if (nx == columnDispWk_col_017) doDispWk_col_017_NX(info);
		else if (nx == columnDispWk_col_018) doDispWk_col_018_NX(info);
		else if (nx == columnDispWk_col_019) doDispWk_col_019_NX(info);
		else if (nx == columnDispWk_col_020) doDispWk_col_020_NX(info);
		else if (nx == columnDispWk_col_021) doDispWk_col_021_NX(info);
		else if (nx == columnDispWk_col_022) doDispWk_col_022_NX(info);
		else if (nx == columnDispWk_col_023) doDispWk_col_023_NX(info);
		else if (nx == columnDispWk_col_024) doDispWk_col_024_NX(info);
		else if (nx == columnDispWk_col_025) doDispWk_col_025_NX(info);
		else if (nx == columnDispWk_col_026) doDispWk_col_026_NX(info);
		else if (nx == columnDispWk_col_027) doDispWk_col_027_NX(info);
		else if (nx == columnDispWk_col_028) doDispWk_col_028_NX(info);
		else if (nx == columnDispWk_col_029) doDispWk_col_029_NX(info);
		else if (nx == columnDispWk_col_030) doDispWk_col_030_NX(info);
		else if (nx == columnDispWk_col_031) doDispWk_col_031_NX(info);
		else if (nx == columnDispWk_col_032) doDispWk_col_032_NX(info);
		else if (nx == columnDispWk_col_033) doDispWk_col_033_NX(info);
		else if (nx == columnDispWk_col_034) doDispWk_col_034_NX(info);
		else if (nx == columnDispWk_col_035) doDispWk_col_035_NX(info);
		else if (nx == columnDispWk_col_036) doDispWk_col_036_NX(info);
		else if (nx == columnDispWk_col_037) doDispWk_col_037_NX(info);
		else if (nx == columnDispWk_col_038) doDispWk_col_038_NX(info);
		else if (nx == columnDispWk_col_039) doDispWk_col_039_NX(info);
		else if (nx == columnDispWk_col_040) doDispWk_col_040_NX(info);
		else if (nx == columnDispWk_col_041) doDispWk_col_041_NX(info);
		else if (nx == columnDispWk_col_042) doDispWk_col_042_NX(info);
		else if (nx == columnDispWk_col_043) doDispWk_col_043_NX(info);
		else if (nx == columnDispWk_col_044) doDispWk_col_044_NX(info);
		else if (nx == columnDispWk_col_045) doDispWk_col_045_NX(info);
		else if (nx == columnDispWk_col_046) doDispWk_col_046_NX(info);
		else if (nx == columnDispWk_col_047) doDispWk_col_047_NX(info);
		else if (nx == columnDispWk_col_048) doDispWk_col_048_NX(info);
		else if (nx == columnDispWk_col_049) doDispWk_col_049_NX(info);
		else if (nx == columnDispWk_col_050) doDispWk_col_050_NX(info);
		else if (nx == columnDispWk_col_051) doDispWk_col_051_NX(info);
		else if (nx == columnDispWk_col_052) doDispWk_col_052_NX(info);
		else if (nx == columnDispWk_col_053) doDispWk_col_053_NX(info);
		else if (nx == columnDispWk_col_054) doDispWk_col_054_NX(info);
		else if (nx == columnDispWk_col_055) doDispWk_col_055_NX(info);
		else if (nx == columnDispWk_col_056) doDispWk_col_056_NX(info);
		else if (nx == columnDispWk_col_057) doDispWk_col_057_NX(info);
		else if (nx == columnDispWk_col_058) doDispWk_col_058_NX(info);
		else if (nx == columnDispWk_col_059) doDispWk_col_059_NX(info);
		else if (nx == columnDispWk_col_060) doDispWk_col_060_NX(info);
		else if (nx == columnDispWk_col_061) doDispWk_col_061_NX(info);
		else if (nx == columnDispWk_col_062) doDispWk_col_062_NX(info);
		else if (nx == columnDispWk_col_063) doDispWk_col_063_NX(info);
		else if (nx == columnDispWk_col_064) doDispWk_col_064_NX(info);
		else if (nx == columnDispWk_col_065) doDispWk_col_065_NX(info);
		else if (nx == columnDispWk_col_066) doDispWk_col_066_NX(info);
		else if (nx == columnDispWk_col_067) doDispWk_col_067_NX(info);
		else if (nx == columnDispWk_col_068) doDispWk_col_068_NX(info);
		else if (nx == columnDispWk_col_069) doDispWk_col_069_NX(info);
		else if (nx == columnDispWk_col_070) doDispWk_col_070_NX(info);
		else if (nx == columnDispWk_col_071) doDispWk_col_071_NX(info);
		else if (nx == columnDispWk_col_072) doDispWk_col_072_NX(info);
		else if (nx == columnDispWk_col_073) doDispWk_col_073_NX(info);
		else if (nx == columnDispWk_col_074) doDispWk_col_074_NX(info);
		else if (nx == columnDispWk_col_075) doDispWk_col_075_NX(info);
		else if (nx == columnDispWk_col_076) doDispWk_col_076_NX(info);
		else if (nx == columnDispWk_col_077) doDispWk_col_077_NX(info);
		else if (nx == columnDispWk_col_078) doDispWk_col_078_NX(info);
		else if (nx == columnDispWk_col_079) doDispWk_col_079_NX(info);
		else if (nx == columnDispWk_col_080) doDispWk_col_080_NX(info);
		else if (nx == columnDispWk_col_081) doDispWk_col_081_NX(info);
		else if (nx == columnDispWk_col_082) doDispWk_col_082_NX(info);
		else if (nx == columnDispWk_col_083) doDispWk_col_083_NX(info);
		else if (nx == columnDispWk_col_084) doDispWk_col_084_NX(info);
		else if (nx == columnDispWk_col_085) doDispWk_col_085_NX(info);
		else if (nx == columnDispWk_col_086) doDispWk_col_086_NX(info);
		else if (nx == columnDispWk_col_087) doDispWk_col_087_NX(info);
		else if (nx == columnDispWk_col_088) doDispWk_col_088_NX(info);
		else if (nx == columnDispWk_col_089) doDispWk_col_089_NX(info);
		else if (nx == columnDispWk_col_090) doDispWk_col_090_NX(info);
		else if (nx == columnDispWk_col_091) doDispWk_col_091_NX(info);
		else if (nx == columnDispWk_col_092) doDispWk_col_092_NX(info);
		else if (nx == columnDispWk_col_093) doDispWk_col_093_NX(info);
		else if (nx == columnDispWk_col_094) doDispWk_col_094_NX(info);
		else if (nx == columnDispWk_col_095) doDispWk_col_095_NX(info);
		else if (nx == columnDispWk_col_096) doDispWk_col_096_NX(info);
		else if (nx == columnDispWk_col_097) doDispWk_col_097_NX(info);
		else if (nx == columnDispWk_col_098) doDispWk_col_098_NX(info);
		else if (nx == columnDispWk_col_099) doDispWk_col_099_NX(info);
	}

	/**
	 * [DtlOper]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_NX(MCEventInfo info){
	}

	/**
	 * [DtlTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_NX(MCEventInfo info){
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
	 * [LPnl]パネルの[theory]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_theory_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_upri_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[the_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_the_upri_NX(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_std_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_std_qty_NX(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_unit_conv_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_unit_conv_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Disp]パネルの[expns_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDisp_expns_grp_NX(MCEventInfo info){
	}

	/**
	 * [Disp]パネルの[expns]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDisp_expns_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_upri_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[the_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_the_upri_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[the_cost]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_the_cost_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[ttl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_ttl_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[var_cost]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_var_cost_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[fxd_cost]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_fxd_cost_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_000]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_000_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_001]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_001_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_002]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_002_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_003]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_003_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_004]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_004_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_005]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_005_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_006]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_006_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_007]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_007_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_008]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_008_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_009]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_009_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_010]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_010_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_011]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_011_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_012]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_012_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_013]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_013_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_014]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_014_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_015]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_015_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_016]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_016_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_017]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_017_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_018]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_018_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_019]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_019_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_020]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_020_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_021]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_021_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_022]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_022_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_023]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_023_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_024]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_024_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_025]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_025_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_026]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_026_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_027]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_027_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_028]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_028_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_029]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_029_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_030]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_030_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_031]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_031_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_032]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_032_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_033]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_033_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_034]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_034_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_035]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_035_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_036]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_036_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_037]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_037_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_038]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_038_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_039]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_039_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_040]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_040_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_041]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_041_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_042]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_042_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_043]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_043_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_044]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_044_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_045]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_045_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_046]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_046_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_047]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_047_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_048]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_048_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_049]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_049_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_050]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_050_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_051]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_051_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_052]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_052_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_053]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_053_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_054]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_054_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_055]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_055_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_056]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_056_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_057]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_057_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_058]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_058_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_059]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_059_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_060]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_060_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_061]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_061_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_062]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_062_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_063]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_063_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_064]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_064_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_065]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_065_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_066]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_066_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_067]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_067_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_068]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_068_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_069]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_069_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_070]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_070_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_071]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_071_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_072]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_072_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_073]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_073_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_074]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_074_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_075]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_075_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_076]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_076_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_077]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_077_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_078]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_078_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_079]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_079_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_080]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_080_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_081]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_081_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_082]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_082_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_083]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_083_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_084]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_084_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_085]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_085_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_086]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_086_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_087]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_087_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_088]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_088_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_089]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_089_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_090]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_090_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_091]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_091_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_092]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_092_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_093]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_093_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_094]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_094_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_095]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_095_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_096]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_096_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_097]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_097_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_098]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_098_NX(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_099]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_099_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wk_cost_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wk_cost_cd_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wk_cost_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wk_cost_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_upri_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[the_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_the_upri_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wk_cost_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wk_cost_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[the_cost]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_the_cost_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[ttl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_ttl_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[var_cost]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_var_cost_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[fxd_cost]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_fxd_cost_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_000]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_000_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_001]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_001_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_002]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_002_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_003]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_003_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_004]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_004_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_005]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_005_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_006]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_006_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_007]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_007_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_008]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_008_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_009]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_009_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_010]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_010_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_011]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_011_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_012]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_012_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_013]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_013_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_014]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_014_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_015]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_015_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_016]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_016_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_017]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_017_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_018]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_018_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_019]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_019_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_020]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_020_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_021]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_021_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_022]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_022_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_023]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_023_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_024]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_024_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_025]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_025_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_026]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_026_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_027]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_027_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_028]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_028_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_029]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_029_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_030]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_030_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_031]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_031_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_032]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_032_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_033]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_033_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_034]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_034_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_035]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_035_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_036]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_036_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_037]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_037_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_038]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_038_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_039]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_039_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_040]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_040_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_041]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_041_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_042]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_042_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_043]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_043_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_044]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_044_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_045]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_045_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_046]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_046_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_047]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_047_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_048]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_048_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_049]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_049_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_050]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_050_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_051]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_051_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_052]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_052_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_053]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_053_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_054]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_054_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_055]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_055_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_056]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_056_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_057]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_057_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_058]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_058_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_059]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_059_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_060]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_060_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_061]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_061_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_062]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_062_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_063]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_063_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_064]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_064_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_065]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_065_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_066]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_066_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_067]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_067_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_068]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_068_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_069]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_069_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_070]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_070_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_071]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_071_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_072]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_072_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_073]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_073_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_074]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_074_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_075]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_075_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_076]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_076_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_077]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_077_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_078]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_078_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_079]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_079_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_080]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_080_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_081]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_081_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_082]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_082_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_083]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_083_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_084]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_084_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_085]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_085_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_086]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_086_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_087]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_087_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_088]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_088_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_089]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_089_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_090]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_090_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_091]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_091_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_092]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_092_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_093]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_093_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_094]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_094_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_095]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_095_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_096]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_096_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_097]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_097_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_098]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_098_NX(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_099]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_099_NX(MCEventInfo info){
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
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Hdr_base_unit_cd) doHdr_base_unit_cd_LC(info);
		else if (lc == Hdr_base_unit_nm) doHdr_base_unit_nm_LC(info);
		else if (lc == Hdr_base_unit_dec_place) doHdr_base_unit_dec_place_LC(info);
		else if (lc == Hdr_std_upri) doHdr_std_upri_LC(info);
		else if (lc == Hdr_the_upri) doHdr_the_upri_LC(info);
		else if (lc == columnDtlOper_loc_cd) doDtlOper_loc_cd_LC(info);
		else if (lc == columnDtlOper_loc_nm) doDtlOper_loc_nm_LC(info);
		else if (lc == columnDtlOper_disp_seq) doDtlOper_disp_seq_LC(info);
		else if (lc == columnDtlOper_oper_cd) doDtlOper_oper_cd_LC(info);
		else if (lc == columnDtlOper_oper_nm) doDtlOper_oper_nm_LC(info);
		else if (lc == columnDtlOper_oper_seq) doDtlOper_oper_seq_LC(info);
		else if (lc == columnDtlOper_base_unit_cd) doDtlOper_base_unit_cd_LC(info);
		else if (lc == columnDtlOper_base_unit_nm) doDtlOper_base_unit_nm_LC(info);
		else if (lc == columnDtlOper_base_unit_dec_place) doDtlOper_base_unit_dec_place_LC(info);
		else if (lc == columnDtlOper_oper_unit_cd) doDtlOper_oper_unit_cd_LC(info);
		else if (lc == columnDtlOper_oper_unit_nm) doDtlOper_oper_unit_nm_LC(info);
		else if (lc == columnDtlOper_oper_dec_place) doDtlOper_oper_dec_place_LC(info);
		else if (lc == columnDtlOper_oper_std_qty) doDtlOper_oper_std_qty_LC(info);
		else if (lc == columnDtlOper_oper_conv_qty) doDtlOper_oper_conv_qty_LC(info);
		else if (lc == columnDtlOper_oper_unit_conv_rnd_typ) doDtlOper_oper_unit_conv_rnd_typ_LC(info);
		else if (lc == columnDispInpt_wg_cd) doDispInpt_wg_cd_LC(info);
		else if (lc == columnDispInpt_wg_nm) doDispInpt_wg_nm_LC(info);
		else if (lc == columnDispInpt_itm_typ) doDispInpt_itm_typ_LC(info);
		else if (lc == columnDispInpt_itm_typ_nm) doDispInpt_itm_typ_nm_LC(info);
		else if (lc == columnDispInpt_itm_typ_d_cd) doDispInpt_itm_typ_d_cd_LC(info);
		else if (lc == columnDispInpt_itm_typ_d_nm) doDispInpt_itm_typ_d_nm_LC(info);
		else if (lc == columnDispInpt_itm_jnl_cd) doDispInpt_itm_jnl_cd_LC(info);
		else if (lc == columnDispInpt_itm_jnl_nm) doDispInpt_itm_jnl_nm_LC(info);
		else if (lc == columnDispInpt_upri) doDispInpt_upri_LC(info);
		else if (lc == columnDispInpt_the_upri) doDispInpt_the_upri_LC(info);
		else if (lc == columnDispInpt_base_unit_cd) doDispInpt_base_unit_cd_LC(info);
		else if (lc == columnDispInpt_base_unit_nm) doDispInpt_base_unit_nm_LC(info);
		else if (lc == columnDispInpt_the_cost) doDispInpt_the_cost_LC(info);
		else if (lc == columnDispInpt_ttl) doDispInpt_ttl_LC(info);
		else if (lc == columnDispInpt_var_cost) doDispInpt_var_cost_LC(info);
		else if (lc == columnDispInpt_fxd_cost) doDispInpt_fxd_cost_LC(info);
		else if (lc == columnDispInpt_col_000) doDispInpt_col_000_LC(info);
		else if (lc == columnDispInpt_col_001) doDispInpt_col_001_LC(info);
		else if (lc == columnDispInpt_col_002) doDispInpt_col_002_LC(info);
		else if (lc == columnDispInpt_col_003) doDispInpt_col_003_LC(info);
		else if (lc == columnDispInpt_col_004) doDispInpt_col_004_LC(info);
		else if (lc == columnDispInpt_col_005) doDispInpt_col_005_LC(info);
		else if (lc == columnDispInpt_col_006) doDispInpt_col_006_LC(info);
		else if (lc == columnDispInpt_col_007) doDispInpt_col_007_LC(info);
		else if (lc == columnDispInpt_col_008) doDispInpt_col_008_LC(info);
		else if (lc == columnDispInpt_col_009) doDispInpt_col_009_LC(info);
		else if (lc == columnDispInpt_col_010) doDispInpt_col_010_LC(info);
		else if (lc == columnDispInpt_col_011) doDispInpt_col_011_LC(info);
		else if (lc == columnDispInpt_col_012) doDispInpt_col_012_LC(info);
		else if (lc == columnDispInpt_col_013) doDispInpt_col_013_LC(info);
		else if (lc == columnDispInpt_col_014) doDispInpt_col_014_LC(info);
		else if (lc == columnDispInpt_col_015) doDispInpt_col_015_LC(info);
		else if (lc == columnDispInpt_col_016) doDispInpt_col_016_LC(info);
		else if (lc == columnDispInpt_col_017) doDispInpt_col_017_LC(info);
		else if (lc == columnDispInpt_col_018) doDispInpt_col_018_LC(info);
		else if (lc == columnDispInpt_col_019) doDispInpt_col_019_LC(info);
		else if (lc == columnDispInpt_col_020) doDispInpt_col_020_LC(info);
		else if (lc == columnDispInpt_col_021) doDispInpt_col_021_LC(info);
		else if (lc == columnDispInpt_col_022) doDispInpt_col_022_LC(info);
		else if (lc == columnDispInpt_col_023) doDispInpt_col_023_LC(info);
		else if (lc == columnDispInpt_col_024) doDispInpt_col_024_LC(info);
		else if (lc == columnDispInpt_col_025) doDispInpt_col_025_LC(info);
		else if (lc == columnDispInpt_col_026) doDispInpt_col_026_LC(info);
		else if (lc == columnDispInpt_col_027) doDispInpt_col_027_LC(info);
		else if (lc == columnDispInpt_col_028) doDispInpt_col_028_LC(info);
		else if (lc == columnDispInpt_col_029) doDispInpt_col_029_LC(info);
		else if (lc == columnDispInpt_col_030) doDispInpt_col_030_LC(info);
		else if (lc == columnDispInpt_col_031) doDispInpt_col_031_LC(info);
		else if (lc == columnDispInpt_col_032) doDispInpt_col_032_LC(info);
		else if (lc == columnDispInpt_col_033) doDispInpt_col_033_LC(info);
		else if (lc == columnDispInpt_col_034) doDispInpt_col_034_LC(info);
		else if (lc == columnDispInpt_col_035) doDispInpt_col_035_LC(info);
		else if (lc == columnDispInpt_col_036) doDispInpt_col_036_LC(info);
		else if (lc == columnDispInpt_col_037) doDispInpt_col_037_LC(info);
		else if (lc == columnDispInpt_col_038) doDispInpt_col_038_LC(info);
		else if (lc == columnDispInpt_col_039) doDispInpt_col_039_LC(info);
		else if (lc == columnDispInpt_col_040) doDispInpt_col_040_LC(info);
		else if (lc == columnDispInpt_col_041) doDispInpt_col_041_LC(info);
		else if (lc == columnDispInpt_col_042) doDispInpt_col_042_LC(info);
		else if (lc == columnDispInpt_col_043) doDispInpt_col_043_LC(info);
		else if (lc == columnDispInpt_col_044) doDispInpt_col_044_LC(info);
		else if (lc == columnDispInpt_col_045) doDispInpt_col_045_LC(info);
		else if (lc == columnDispInpt_col_046) doDispInpt_col_046_LC(info);
		else if (lc == columnDispInpt_col_047) doDispInpt_col_047_LC(info);
		else if (lc == columnDispInpt_col_048) doDispInpt_col_048_LC(info);
		else if (lc == columnDispInpt_col_049) doDispInpt_col_049_LC(info);
		else if (lc == columnDispInpt_col_050) doDispInpt_col_050_LC(info);
		else if (lc == columnDispInpt_col_051) doDispInpt_col_051_LC(info);
		else if (lc == columnDispInpt_col_052) doDispInpt_col_052_LC(info);
		else if (lc == columnDispInpt_col_053) doDispInpt_col_053_LC(info);
		else if (lc == columnDispInpt_col_054) doDispInpt_col_054_LC(info);
		else if (lc == columnDispInpt_col_055) doDispInpt_col_055_LC(info);
		else if (lc == columnDispInpt_col_056) doDispInpt_col_056_LC(info);
		else if (lc == columnDispInpt_col_057) doDispInpt_col_057_LC(info);
		else if (lc == columnDispInpt_col_058) doDispInpt_col_058_LC(info);
		else if (lc == columnDispInpt_col_059) doDispInpt_col_059_LC(info);
		else if (lc == columnDispInpt_col_060) doDispInpt_col_060_LC(info);
		else if (lc == columnDispInpt_col_061) doDispInpt_col_061_LC(info);
		else if (lc == columnDispInpt_col_062) doDispInpt_col_062_LC(info);
		else if (lc == columnDispInpt_col_063) doDispInpt_col_063_LC(info);
		else if (lc == columnDispInpt_col_064) doDispInpt_col_064_LC(info);
		else if (lc == columnDispInpt_col_065) doDispInpt_col_065_LC(info);
		else if (lc == columnDispInpt_col_066) doDispInpt_col_066_LC(info);
		else if (lc == columnDispInpt_col_067) doDispInpt_col_067_LC(info);
		else if (lc == columnDispInpt_col_068) doDispInpt_col_068_LC(info);
		else if (lc == columnDispInpt_col_069) doDispInpt_col_069_LC(info);
		else if (lc == columnDispInpt_col_070) doDispInpt_col_070_LC(info);
		else if (lc == columnDispInpt_col_071) doDispInpt_col_071_LC(info);
		else if (lc == columnDispInpt_col_072) doDispInpt_col_072_LC(info);
		else if (lc == columnDispInpt_col_073) doDispInpt_col_073_LC(info);
		else if (lc == columnDispInpt_col_074) doDispInpt_col_074_LC(info);
		else if (lc == columnDispInpt_col_075) doDispInpt_col_075_LC(info);
		else if (lc == columnDispInpt_col_076) doDispInpt_col_076_LC(info);
		else if (lc == columnDispInpt_col_077) doDispInpt_col_077_LC(info);
		else if (lc == columnDispInpt_col_078) doDispInpt_col_078_LC(info);
		else if (lc == columnDispInpt_col_079) doDispInpt_col_079_LC(info);
		else if (lc == columnDispInpt_col_080) doDispInpt_col_080_LC(info);
		else if (lc == columnDispInpt_col_081) doDispInpt_col_081_LC(info);
		else if (lc == columnDispInpt_col_082) doDispInpt_col_082_LC(info);
		else if (lc == columnDispInpt_col_083) doDispInpt_col_083_LC(info);
		else if (lc == columnDispInpt_col_084) doDispInpt_col_084_LC(info);
		else if (lc == columnDispInpt_col_085) doDispInpt_col_085_LC(info);
		else if (lc == columnDispInpt_col_086) doDispInpt_col_086_LC(info);
		else if (lc == columnDispInpt_col_087) doDispInpt_col_087_LC(info);
		else if (lc == columnDispInpt_col_088) doDispInpt_col_088_LC(info);
		else if (lc == columnDispInpt_col_089) doDispInpt_col_089_LC(info);
		else if (lc == columnDispInpt_col_090) doDispInpt_col_090_LC(info);
		else if (lc == columnDispInpt_col_091) doDispInpt_col_091_LC(info);
		else if (lc == columnDispInpt_col_092) doDispInpt_col_092_LC(info);
		else if (lc == columnDispInpt_col_093) doDispInpt_col_093_LC(info);
		else if (lc == columnDispInpt_col_094) doDispInpt_col_094_LC(info);
		else if (lc == columnDispInpt_col_095) doDispInpt_col_095_LC(info);
		else if (lc == columnDispInpt_col_096) doDispInpt_col_096_LC(info);
		else if (lc == columnDispInpt_col_097) doDispInpt_col_097_LC(info);
		else if (lc == columnDispInpt_col_098) doDispInpt_col_098_LC(info);
		else if (lc == columnDispInpt_col_099) doDispInpt_col_099_LC(info);
		else if (lc == columnDispWk_wg_cd) doDispWk_wg_cd_LC(info);
		else if (lc == columnDispWk_wg_nm) doDispWk_wg_nm_LC(info);
		else if (lc == columnDispWk_loc_cd) doDispWk_loc_cd_LC(info);
		else if (lc == columnDispWk_loc_nm) doDispWk_loc_nm_LC(info);
		else if (lc == columnDispWk_oper_cd) doDispWk_oper_cd_LC(info);
		else if (lc == columnDispWk_oper_nm) doDispWk_oper_nm_LC(info);
		else if (lc == columnDispWk_wk_cost_cd) doDispWk_wk_cost_cd_LC(info);
		else if (lc == columnDispWk_wk_cost_nm) doDispWk_wk_cost_nm_LC(info);
		else if (lc == columnDispWk_upri) doDispWk_upri_LC(info);
		else if (lc == columnDispWk_the_upri) doDispWk_the_upri_LC(info);
		else if (lc == columnDispWk_wk_cost_unit_nm) doDispWk_wk_cost_unit_nm_LC(info);
		else if (lc == columnDispWk_dec_place) doDispWk_dec_place_LC(info);
		else if (lc == columnDispWk_the_cost) doDispWk_the_cost_LC(info);
		else if (lc == columnDispWk_ttl) doDispWk_ttl_LC(info);
		else if (lc == columnDispWk_var_cost) doDispWk_var_cost_LC(info);
		else if (lc == columnDispWk_fxd_cost) doDispWk_fxd_cost_LC(info);
		else if (lc == columnDispWk_col_000) doDispWk_col_000_LC(info);
		else if (lc == columnDispWk_col_001) doDispWk_col_001_LC(info);
		else if (lc == columnDispWk_col_002) doDispWk_col_002_LC(info);
		else if (lc == columnDispWk_col_003) doDispWk_col_003_LC(info);
		else if (lc == columnDispWk_col_004) doDispWk_col_004_LC(info);
		else if (lc == columnDispWk_col_005) doDispWk_col_005_LC(info);
		else if (lc == columnDispWk_col_006) doDispWk_col_006_LC(info);
		else if (lc == columnDispWk_col_007) doDispWk_col_007_LC(info);
		else if (lc == columnDispWk_col_008) doDispWk_col_008_LC(info);
		else if (lc == columnDispWk_col_009) doDispWk_col_009_LC(info);
		else if (lc == columnDispWk_col_010) doDispWk_col_010_LC(info);
		else if (lc == columnDispWk_col_011) doDispWk_col_011_LC(info);
		else if (lc == columnDispWk_col_012) doDispWk_col_012_LC(info);
		else if (lc == columnDispWk_col_013) doDispWk_col_013_LC(info);
		else if (lc == columnDispWk_col_014) doDispWk_col_014_LC(info);
		else if (lc == columnDispWk_col_015) doDispWk_col_015_LC(info);
		else if (lc == columnDispWk_col_016) doDispWk_col_016_LC(info);
		else if (lc == columnDispWk_col_017) doDispWk_col_017_LC(info);
		else if (lc == columnDispWk_col_018) doDispWk_col_018_LC(info);
		else if (lc == columnDispWk_col_019) doDispWk_col_019_LC(info);
		else if (lc == columnDispWk_col_020) doDispWk_col_020_LC(info);
		else if (lc == columnDispWk_col_021) doDispWk_col_021_LC(info);
		else if (lc == columnDispWk_col_022) doDispWk_col_022_LC(info);
		else if (lc == columnDispWk_col_023) doDispWk_col_023_LC(info);
		else if (lc == columnDispWk_col_024) doDispWk_col_024_LC(info);
		else if (lc == columnDispWk_col_025) doDispWk_col_025_LC(info);
		else if (lc == columnDispWk_col_026) doDispWk_col_026_LC(info);
		else if (lc == columnDispWk_col_027) doDispWk_col_027_LC(info);
		else if (lc == columnDispWk_col_028) doDispWk_col_028_LC(info);
		else if (lc == columnDispWk_col_029) doDispWk_col_029_LC(info);
		else if (lc == columnDispWk_col_030) doDispWk_col_030_LC(info);
		else if (lc == columnDispWk_col_031) doDispWk_col_031_LC(info);
		else if (lc == columnDispWk_col_032) doDispWk_col_032_LC(info);
		else if (lc == columnDispWk_col_033) doDispWk_col_033_LC(info);
		else if (lc == columnDispWk_col_034) doDispWk_col_034_LC(info);
		else if (lc == columnDispWk_col_035) doDispWk_col_035_LC(info);
		else if (lc == columnDispWk_col_036) doDispWk_col_036_LC(info);
		else if (lc == columnDispWk_col_037) doDispWk_col_037_LC(info);
		else if (lc == columnDispWk_col_038) doDispWk_col_038_LC(info);
		else if (lc == columnDispWk_col_039) doDispWk_col_039_LC(info);
		else if (lc == columnDispWk_col_040) doDispWk_col_040_LC(info);
		else if (lc == columnDispWk_col_041) doDispWk_col_041_LC(info);
		else if (lc == columnDispWk_col_042) doDispWk_col_042_LC(info);
		else if (lc == columnDispWk_col_043) doDispWk_col_043_LC(info);
		else if (lc == columnDispWk_col_044) doDispWk_col_044_LC(info);
		else if (lc == columnDispWk_col_045) doDispWk_col_045_LC(info);
		else if (lc == columnDispWk_col_046) doDispWk_col_046_LC(info);
		else if (lc == columnDispWk_col_047) doDispWk_col_047_LC(info);
		else if (lc == columnDispWk_col_048) doDispWk_col_048_LC(info);
		else if (lc == columnDispWk_col_049) doDispWk_col_049_LC(info);
		else if (lc == columnDispWk_col_050) doDispWk_col_050_LC(info);
		else if (lc == columnDispWk_col_051) doDispWk_col_051_LC(info);
		else if (lc == columnDispWk_col_052) doDispWk_col_052_LC(info);
		else if (lc == columnDispWk_col_053) doDispWk_col_053_LC(info);
		else if (lc == columnDispWk_col_054) doDispWk_col_054_LC(info);
		else if (lc == columnDispWk_col_055) doDispWk_col_055_LC(info);
		else if (lc == columnDispWk_col_056) doDispWk_col_056_LC(info);
		else if (lc == columnDispWk_col_057) doDispWk_col_057_LC(info);
		else if (lc == columnDispWk_col_058) doDispWk_col_058_LC(info);
		else if (lc == columnDispWk_col_059) doDispWk_col_059_LC(info);
		else if (lc == columnDispWk_col_060) doDispWk_col_060_LC(info);
		else if (lc == columnDispWk_col_061) doDispWk_col_061_LC(info);
		else if (lc == columnDispWk_col_062) doDispWk_col_062_LC(info);
		else if (lc == columnDispWk_col_063) doDispWk_col_063_LC(info);
		else if (lc == columnDispWk_col_064) doDispWk_col_064_LC(info);
		else if (lc == columnDispWk_col_065) doDispWk_col_065_LC(info);
		else if (lc == columnDispWk_col_066) doDispWk_col_066_LC(info);
		else if (lc == columnDispWk_col_067) doDispWk_col_067_LC(info);
		else if (lc == columnDispWk_col_068) doDispWk_col_068_LC(info);
		else if (lc == columnDispWk_col_069) doDispWk_col_069_LC(info);
		else if (lc == columnDispWk_col_070) doDispWk_col_070_LC(info);
		else if (lc == columnDispWk_col_071) doDispWk_col_071_LC(info);
		else if (lc == columnDispWk_col_072) doDispWk_col_072_LC(info);
		else if (lc == columnDispWk_col_073) doDispWk_col_073_LC(info);
		else if (lc == columnDispWk_col_074) doDispWk_col_074_LC(info);
		else if (lc == columnDispWk_col_075) doDispWk_col_075_LC(info);
		else if (lc == columnDispWk_col_076) doDispWk_col_076_LC(info);
		else if (lc == columnDispWk_col_077) doDispWk_col_077_LC(info);
		else if (lc == columnDispWk_col_078) doDispWk_col_078_LC(info);
		else if (lc == columnDispWk_col_079) doDispWk_col_079_LC(info);
		else if (lc == columnDispWk_col_080) doDispWk_col_080_LC(info);
		else if (lc == columnDispWk_col_081) doDispWk_col_081_LC(info);
		else if (lc == columnDispWk_col_082) doDispWk_col_082_LC(info);
		else if (lc == columnDispWk_col_083) doDispWk_col_083_LC(info);
		else if (lc == columnDispWk_col_084) doDispWk_col_084_LC(info);
		else if (lc == columnDispWk_col_085) doDispWk_col_085_LC(info);
		else if (lc == columnDispWk_col_086) doDispWk_col_086_LC(info);
		else if (lc == columnDispWk_col_087) doDispWk_col_087_LC(info);
		else if (lc == columnDispWk_col_088) doDispWk_col_088_LC(info);
		else if (lc == columnDispWk_col_089) doDispWk_col_089_LC(info);
		else if (lc == columnDispWk_col_090) doDispWk_col_090_LC(info);
		else if (lc == columnDispWk_col_091) doDispWk_col_091_LC(info);
		else if (lc == columnDispWk_col_092) doDispWk_col_092_LC(info);
		else if (lc == columnDispWk_col_093) doDispWk_col_093_LC(info);
		else if (lc == columnDispWk_col_094) doDispWk_col_094_LC(info);
		else if (lc == columnDispWk_col_095) doDispWk_col_095_LC(info);
		else if (lc == columnDispWk_col_096) doDispWk_col_096_LC(info);
		else if (lc == columnDispWk_col_097) doDispWk_col_097_LC(info);
		else if (lc == columnDispWk_col_098) doDispWk_col_098_LC(info);
		else if (lc == columnDispWk_col_099) doDispWk_col_099_LC(info);
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
	 * [Hdr]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_upri_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[the_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_the_upri_LC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_std_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_std_qty_LC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [DtlOper]パネルの[oper_unit_conv_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlOper_oper_unit_conv_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_upri_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[the_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_the_upri_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[the_cost]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_the_cost_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[ttl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_ttl_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[var_cost]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_var_cost_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[fxd_cost]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_fxd_cost_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_000]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_000_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_001]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_001_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_002]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_002_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_003]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_003_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_004]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_004_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_005]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_005_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_006]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_006_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_007]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_007_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_008]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_008_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_009]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_009_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_010]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_010_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_011]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_011_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_012]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_012_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_013]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_013_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_014]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_014_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_015]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_015_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_016]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_016_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_017]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_017_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_018]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_018_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_019]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_019_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_020]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_020_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_021]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_021_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_022]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_022_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_023]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_023_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_024]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_024_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_025]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_025_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_026]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_026_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_027]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_027_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_028]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_028_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_029]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_029_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_030]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_030_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_031]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_031_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_032]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_032_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_033]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_033_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_034]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_034_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_035]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_035_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_036]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_036_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_037]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_037_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_038]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_038_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_039]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_039_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_040]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_040_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_041]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_041_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_042]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_042_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_043]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_043_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_044]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_044_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_045]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_045_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_046]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_046_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_047]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_047_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_048]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_048_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_049]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_049_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_050]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_050_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_051]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_051_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_052]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_052_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_053]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_053_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_054]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_054_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_055]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_055_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_056]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_056_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_057]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_057_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_058]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_058_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_059]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_059_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_060]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_060_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_061]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_061_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_062]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_062_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_063]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_063_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_064]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_064_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_065]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_065_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_066]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_066_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_067]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_067_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_068]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_068_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_069]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_069_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_070]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_070_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_071]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_071_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_072]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_072_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_073]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_073_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_074]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_074_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_075]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_075_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_076]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_076_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_077]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_077_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_078]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_078_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_079]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_079_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_080]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_080_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_081]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_081_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_082]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_082_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_083]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_083_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_084]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_084_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_085]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_085_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_086]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_086_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_087]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_087_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_088]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_088_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_089]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_089_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_090]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_090_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_091]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_091_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_092]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_092_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_093]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_093_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_094]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_094_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_095]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_095_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_096]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_096_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_097]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_097_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_098]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_098_LC(MCEventInfo info){
	}

	/**
	 * [DispInpt]パネルの[col_099]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispInpt_col_099_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wk_cost_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wk_cost_cd_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wk_cost_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wk_cost_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_upri_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[the_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_the_upri_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[wk_cost_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_wk_cost_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[the_cost]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_the_cost_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[ttl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_ttl_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[var_cost]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_var_cost_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[fxd_cost]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_fxd_cost_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_000]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_000_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_001]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_001_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_002]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_002_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_003]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_003_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_004]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_004_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_005]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_005_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_006]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_006_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_007]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_007_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_008]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_008_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_009]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_009_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_010]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_010_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_011]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_011_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_012]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_012_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_013]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_013_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_014]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_014_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_015]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_015_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_016]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_016_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_017]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_017_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_018]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_018_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_019]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_019_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_020]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_020_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_021]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_021_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_022]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_022_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_023]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_023_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_024]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_024_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_025]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_025_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_026]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_026_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_027]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_027_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_028]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_028_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_029]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_029_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_030]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_030_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_031]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_031_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_032]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_032_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_033]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_033_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_034]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_034_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_035]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_035_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_036]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_036_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_037]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_037_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_038]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_038_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_039]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_039_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_040]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_040_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_041]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_041_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_042]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_042_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_043]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_043_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_044]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_044_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_045]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_045_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_046]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_046_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_047]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_047_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_048]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_048_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_049]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_049_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_050]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_050_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_051]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_051_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_052]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_052_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_053]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_053_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_054]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_054_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_055]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_055_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_056]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_056_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_057]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_057_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_058]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_058_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_059]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_059_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_060]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_060_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_061]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_061_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_062]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_062_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_063]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_063_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_064]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_064_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_065]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_065_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_066]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_066_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_067]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_067_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_068]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_068_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_069]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_069_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_070]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_070_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_071]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_071_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_072]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_072_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_073]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_073_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_074]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_074_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_075]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_075_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_076]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_076_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_077]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_077_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_078]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_078_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_079]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_079_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_080]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_080_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_081]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_081_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_082]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_082_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_083]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_083_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_084]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_084_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_085]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_085_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_086]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_086_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_087]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_087_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_088]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_088_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_089]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_089_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_090]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_090_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_091]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_091_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_092]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_092_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_093]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_093_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_094]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_094_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_095]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_095_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_096]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_096_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_097]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_097_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_098]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_098_LC(MCEventInfo info){
	}

	/**
	 * [DispWk]パネルの[col_099]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDispWk_col_099_LC(MCEventInfo info){
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBEL0040.Srch01")) {
			return new MG_MGBEL0040_Srch01Bridge();
		}
		if (id.equals("MG.MGBEL0040.Srch02")) {
			return new MG_MGBEL0040_Srch02Bridge();
		}
		if (id.equals("MG.MGBEL0040.Srch03")) {
			return new MG_MGBEL0040_Srch03Bridge();
		}
		if (id.equals("MG.MGBEL0040.Srch04")) {
			return new MG_MGBEL0040_Srch04Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBEL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0040_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBEL0040_Srch01;

		/** コンストラクタ */
		protected MG_MGBEL0040_Srch01Bridge() {
			p_MG_MGBEL0040_Srch01 = new MCParam(PDef.MG_MGBEL0040_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBEL0040_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBE.MGBEP0040.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMGBE.MGBEP0040.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0040.DtlOperR.class));

			p_MG_MGBEL0040_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBEL0040_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBEL0040_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBEL0040_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBEL0040_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBE.MGBEP0040.CndR up0() {
			return (mcframe.clientMGBE.MGBEP0040.CndR)up(0);
		}

		protected mcframe.clientMGBE.MGBEP0040.HdrR down0() {
			return (mcframe.clientMGBE.MGBEP0040.HdrR)down(0);
		}
		protected MCList<mcframe.clientMGBE.MGBEP0040.DtlOperR> down1() {
			return (MCList<mcframe.clientMGBE.MGBEP0040.DtlOperR>)down(1);
		}

		protected void setupDownParam() {
			p_MG_MGBEL0040_Srch01.addDownBlock(mcframe.clientMGBE.MGBEP0040.HdrR.create());
			p_MG_MGBEL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0040.DtlOperR.class));
		}
		protected MCParam param() {
			return p_MG_MGBEL0040_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMGBE.MGBEP0040.HdrR)p_MG_MGBEL0040_Srch01.getContainerParam().getDownBlock(0));
			setDtlOperL((MCList<mcframe.clientMGBE.MGBEP0040.DtlOperR>)p_MG_MGBEL0040_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlOperL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlOperL());
			return result;
		}
	}
	/**
	 * [MG_MGBEL0040_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0040_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBEL0040_Srch02;

		/** コンストラクタ */
		protected MG_MGBEL0040_Srch02Bridge() {
			p_MG_MGBEL0040_Srch02 = new MCParam(PDef.MG_MGBEL0040_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBEL0040_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBE.MGBEP0040.DtlOperR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0040.DispInptR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0040.DispWkR.class));

			p_MG_MGBEL0040_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBEL0040_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBEL0040_Srch02.addUpBlock(getDtlOperL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBEL0040_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBEL0040_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBE.MGBEP0040.DtlOperR> up0() {
			return (MCList<mcframe.clientMGBE.MGBEP0040.DtlOperR>)up(0);
		}

		protected MCList<mcframe.clientMGBE.MGBEP0040.DispInptR> down0() {
			return (MCList<mcframe.clientMGBE.MGBEP0040.DispInptR>)down(0);
		}
		protected MCList<mcframe.clientMGBE.MGBEP0040.DispWkR> down1() {
			return (MCList<mcframe.clientMGBE.MGBEP0040.DispWkR>)down(1);
		}

		protected void setupDownParam() {
			p_MG_MGBEL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0040.DispInptR.class));
			p_MG_MGBEL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0040.DispWkR.class));
		}
		protected MCParam param() {
			return p_MG_MGBEL0040_Srch02;
		}

		protected void show() {
			setDispInptL((MCList<mcframe.clientMGBE.MGBEP0040.DispInptR>)p_MG_MGBEL0040_Srch02.getContainerParam().getDownBlock(0));
			setDispWkL((MCList<mcframe.clientMGBE.MGBEP0040.DispWkR>)p_MG_MGBEL0040_Srch02.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDispInptL().clear();
			getDispWkL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlOperL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDispInptL());
			result.add(getDispWkL());
			return result;
		}
	}
	/**
	 * [MG_MGBEL0040_Srch03]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0040_Srch03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBEL0040_Srch03;

		/** コンストラクタ */
		protected MG_MGBEL0040_Srch03Bridge() {
			p_MG_MGBEL0040_Srch03 = new MCParam(PDef.MG_MGBEL0040_Srch03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBEL0040_Srch03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBE.MGBEP0040.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMGBE.MGBEP0040.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0040.DtlOperR.class));

			p_MG_MGBEL0040_Srch03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBEL0040_Srch03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBEL0040_Srch03.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBEL0040_Srch03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBEL0040_Srch03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBE.MGBEP0040.CndR up0() {
			return (mcframe.clientMGBE.MGBEP0040.CndR)up(0);
		}

		protected mcframe.clientMGBE.MGBEP0040.HdrR down0() {
			return (mcframe.clientMGBE.MGBEP0040.HdrR)down(0);
		}
		protected MCList<mcframe.clientMGBE.MGBEP0040.DtlOperR> down1() {
			return (MCList<mcframe.clientMGBE.MGBEP0040.DtlOperR>)down(1);
		}

		protected void setupDownParam() {
			p_MG_MGBEL0040_Srch03.addDownBlock(mcframe.clientMGBE.MGBEP0040.HdrR.create());
			p_MG_MGBEL0040_Srch03.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0040.DtlOperR.class));
		}
		protected MCParam param() {
			return p_MG_MGBEL0040_Srch03;
		}

		protected void show() {
			setHdrR((mcframe.clientMGBE.MGBEP0040.HdrR)p_MG_MGBEL0040_Srch03.getContainerParam().getDownBlock(0));
			setDtlOperL((MCList<mcframe.clientMGBE.MGBEP0040.DtlOperR>)p_MG_MGBEL0040_Srch03.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlOperL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlOperL());
			return result;
		}
	}
	/**
	 * [MG_MGBEL0040_Srch04]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0040_Srch04Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBEL0040_Srch04;

		/** コンストラクタ */
		protected MG_MGBEL0040_Srch04Bridge() {
			p_MG_MGBEL0040_Srch04 = new MCParam(PDef.MG_MGBEL0040_Srch04_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBEL0040_Srch04_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBE.MGBEP0040.DtlOperR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0040.DispInptR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0040.DispWkR.class));

			p_MG_MGBEL0040_Srch04 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBEL0040_Srch04.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBEL0040_Srch04.addUpBlock(getDtlOperL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBEL0040_Srch04.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBEL0040_Srch04.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBE.MGBEP0040.DtlOperR> up0() {
			return (MCList<mcframe.clientMGBE.MGBEP0040.DtlOperR>)up(0);
		}

		protected MCList<mcframe.clientMGBE.MGBEP0040.DispInptR> down0() {
			return (MCList<mcframe.clientMGBE.MGBEP0040.DispInptR>)down(0);
		}
		protected MCList<mcframe.clientMGBE.MGBEP0040.DispWkR> down1() {
			return (MCList<mcframe.clientMGBE.MGBEP0040.DispWkR>)down(1);
		}

		protected void setupDownParam() {
			p_MG_MGBEL0040_Srch04.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0040.DispInptR.class));
			p_MG_MGBEL0040_Srch04.addDownBlock(MCList.create(mcframe.clientMGBE.MGBEP0040.DispWkR.class));
		}
		protected MCParam param() {
			return p_MG_MGBEL0040_Srch04;
		}

		protected void show() {
			setDispInptL((MCList<mcframe.clientMGBE.MGBEP0040.DispInptR>)p_MG_MGBEL0040_Srch04.getContainerParam().getDownBlock(0));
			setDispWkL((MCList<mcframe.clientMGBE.MGBEP0040.DispWkR>)p_MG_MGBEL0040_Srch04.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDispInptL().clear();
			getDispWkL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlOperL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDispInptL());
			result.add(getDispWkL());
			return result;
		}
	}
}