package mcframe.clientMSBC.MSBCP0350;

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
import mcframe.clientMSBC.MSBCP0350.MSBCP_MlyRqmtSchdReg_MC.MS_MSBCL0350_Srch01Caller;
import mcframe.clientMSBC.MSBCP0350.MSBCP_MlyRqmtSchdReg_MC.MS_MSBCL0350_Srch02Caller;
import mcframe.clientMSBC.MSBCP0350.MSBCP_MlyRqmtSchdReg_MC.MS_MSBCL0350_Upd01Caller;

/**
 * 画面"MSBCP_MlyRqmtSchdReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_MlyRqmtSchdReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBCP0350";

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
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify;REF,View UPD,登録・訂正する;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_ym_Label = null;
	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDateField Cnd_ym = null;
	public MCLabel Cnd_prod_ym_fr_Label = null;
	/**
	 * Production month FROM 生産年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_prod_ym_fr = null;
	public MCLabel Cnd_prod_ym_to_Label = null;
	/**
	 * Production month TO 生産年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_prod_ym_to = null;
	public MCLabel Cnd_mps_grp_cd_Label = null;
	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mps_grp_cd = null;
	/**
	 * MPS group name ＭＰＳグループ名.<p>
	 *
	 */
	public MCTextField Cnd_mps_grp_nm = null;
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
	public MCLabel Cnd_strg_loc_grp_cd_Label = null;
	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_strg_loc_grp_cd = null;
	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_strg_loc_grp_nm = null;
	public MCLabel Cnd_strg_loc_cd_Label = null;
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_strg_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCTextField Cnd_strg_loc_nm = null;
	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public MCCheckBox Cnd_disp_key_flg = null;
	/**
	 * Last time 前回.<p>
	 *
	 */
	public MCCheckBox Cnd_disp_pre_flg = null;
	/**
	 * Daily production request 日次生産依頼.<p>
	 *
	 */
	public MCCheckBox Cnd_disp_rqmt_flg = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCCheckBox Cnd_disp_act_flg = null;
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP0350.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Key キー.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_00 = null;
	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mps_grp_cd = null;
	/**
	 * MPS group name ＭＰＳグループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mps_grp_nm = null;
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_loc_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_nm = null;
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
	 * Requested cd. 依頼先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_loc_cd = null;
	/**
	 * Requested-to name 依頼先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_loc_nm = null;
	/**
	 * Procurement provider cd. 調達先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_proc_cd = null;
	/**
	 * Procurement provider name 調達先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_proc_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ym = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dec_place = null;
	/**
	 * Column value 項目値.<p>
	 *
	 */
	public MCColumnConfig columnRslt_row_title_col = null;
	/**
	 * Column 項目.<p>
	 *
	 */
	public MCColumnConfig columnRslt_row_title_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_sum_p_PPanel;
	public MCColumnConfig columnRslt_sum;// [Rslt]の[sum_p.qty]を[columnRslt_sum]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_00_p_PPanel;
	public MCColumnConfig columnRslt_qty_00;// [Rslt]の[qty_00_p.qty]を[columnRslt_qty_00]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_01_p_PPanel;
	public MCColumnConfig columnRslt_qty_01;// [Rslt]の[qty_01_p.qty]を[columnRslt_qty_01]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_02_p_PPanel;
	public MCColumnConfig columnRslt_qty_02;// [Rslt]の[qty_02_p.qty]を[columnRslt_qty_02]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_03_p_PPanel;
	public MCColumnConfig columnRslt_qty_03;// [Rslt]の[qty_03_p.qty]を[columnRslt_qty_03]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_04_p_PPanel;
	public MCColumnConfig columnRslt_qty_04;// [Rslt]の[qty_04_p.qty]を[columnRslt_qty_04]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_05_p_PPanel;
	public MCColumnConfig columnRslt_qty_05;// [Rslt]の[qty_05_p.qty]を[columnRslt_qty_05]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_06_p_PPanel;
	public MCColumnConfig columnRslt_qty_06;// [Rslt]の[qty_06_p.qty]を[columnRslt_qty_06]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_07_p_PPanel;
	public MCColumnConfig columnRslt_qty_07;// [Rslt]の[qty_07_p.qty]を[columnRslt_qty_07]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_08_p_PPanel;
	public MCColumnConfig columnRslt_qty_08;// [Rslt]の[qty_08_p.qty]を[columnRslt_qty_08]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_09_p_PPanel;
	public MCColumnConfig columnRslt_qty_09;// [Rslt]の[qty_09_p.qty]を[columnRslt_qty_09]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_10_p_PPanel;
	public MCColumnConfig columnRslt_qty_10;// [Rslt]の[qty_10_p.qty]を[columnRslt_qty_10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_11_p_PPanel;
	public MCColumnConfig columnRslt_qty_11;// [Rslt]の[qty_11_p.qty]を[columnRslt_qty_11]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_12_p_PPanel;
	public MCColumnConfig columnRslt_qty_12;// [Rslt]の[qty_12_p.qty]を[columnRslt_qty_12]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_13_p_PPanel;
	public MCColumnConfig columnRslt_qty_13;// [Rslt]の[qty_13_p.qty]を[columnRslt_qty_13]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_14_p_PPanel;
	public MCColumnConfig columnRslt_qty_14;// [Rslt]の[qty_14_p.qty]を[columnRslt_qty_14]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_15_p_PPanel;
	public MCColumnConfig columnRslt_qty_15;// [Rslt]の[qty_15_p.qty]を[columnRslt_qty_15]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_16_p_PPanel;
	public MCColumnConfig columnRslt_qty_16;// [Rslt]の[qty_16_p.qty]を[columnRslt_qty_16]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_17_p_PPanel;
	public MCColumnConfig columnRslt_qty_17;// [Rslt]の[qty_17_p.qty]を[columnRslt_qty_17]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_18_p_PPanel;
	public MCColumnConfig columnRslt_qty_18;// [Rslt]の[qty_18_p.qty]を[columnRslt_qty_18]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_19_p_PPanel;
	public MCColumnConfig columnRslt_qty_19;// [Rslt]の[qty_19_p.qty]を[columnRslt_qty_19]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_20_p_PPanel;
	public MCColumnConfig columnRslt_qty_20;// [Rslt]の[qty_20_p.qty]を[columnRslt_qty_20]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_21_p_PPanel;
	public MCColumnConfig columnRslt_qty_21;// [Rslt]の[qty_21_p.qty]を[columnRslt_qty_21]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_22_p_PPanel;
	public MCColumnConfig columnRslt_qty_22;// [Rslt]の[qty_22_p.qty]を[columnRslt_qty_22]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_23_p_PPanel;
	public MCColumnConfig columnRslt_qty_23;// [Rslt]の[qty_23_p.qty]を[columnRslt_qty_23]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_24_p_PPanel;
	public MCColumnConfig columnRslt_qty_24;// [Rslt]の[qty_24_p.qty]を[columnRslt_qty_24]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_25_p_PPanel;
	public MCColumnConfig columnRslt_qty_25;// [Rslt]の[qty_25_p.qty]を[columnRslt_qty_25]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_26_p_PPanel;
	public MCColumnConfig columnRslt_qty_26;// [Rslt]の[qty_26_p.qty]を[columnRslt_qty_26]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_27_p_PPanel;
	public MCColumnConfig columnRslt_qty_27;// [Rslt]の[qty_27_p.qty]を[columnRslt_qty_27]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_28_p_PPanel;
	public MCColumnConfig columnRslt_qty_28;// [Rslt]の[qty_28_p.qty]を[columnRslt_qty_28]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_29_p_PPanel;
	public MCColumnConfig columnRslt_qty_29;// [Rslt]の[qty_29_p.qty]を[columnRslt_qty_29]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_30_p_PPanel;
	public MCColumnConfig columnRslt_qty_30;// [Rslt]の[qty_30_p.qty]を[columnRslt_qty_30]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_31_p_PPanel;
	public MCColumnConfig columnRslt_qty_31;// [Rslt]の[qty_31_p.qty]を[columnRslt_qty_31]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_32_p_PPanel;
	public MCColumnConfig columnRslt_qty_32;// [Rslt]の[qty_32_p.qty]を[columnRslt_qty_32]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_33_p_PPanel;
	public MCColumnConfig columnRslt_qty_33;// [Rslt]の[qty_33_p.qty]を[columnRslt_qty_33]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_34_p_PPanel;
	public MCColumnConfig columnRslt_qty_34;// [Rslt]の[qty_34_p.qty]を[columnRslt_qty_34]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_35_p_PPanel;
	public MCColumnConfig columnRslt_qty_35;// [Rslt]の[qty_35_p.qty]を[columnRslt_qty_35]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_36_p_PPanel;
	public MCColumnConfig columnRslt_qty_36;// [Rslt]の[qty_36_p.qty]を[columnRslt_qty_36]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_37_p_PPanel;
	public MCColumnConfig columnRslt_qty_37;// [Rslt]の[qty_37_p.qty]を[columnRslt_qty_37]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_38_p_PPanel;
	public MCColumnConfig columnRslt_qty_38;// [Rslt]の[qty_38_p.qty]を[columnRslt_qty_38]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_39_p_PPanel;
	public MCColumnConfig columnRslt_qty_39;// [Rslt]の[qty_39_p.qty]を[columnRslt_qty_39]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_40_p_PPanel;
	public MCColumnConfig columnRslt_qty_40;// [Rslt]の[qty_40_p.qty]を[columnRslt_qty_40]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_41_p_PPanel;
	public MCColumnConfig columnRslt_qty_41;// [Rslt]の[qty_41_p.qty]を[columnRslt_qty_41]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_42_p_PPanel;
	public MCColumnConfig columnRslt_qty_42;// [Rslt]の[qty_42_p.qty]を[columnRslt_qty_42]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_43_p_PPanel;
	public MCColumnConfig columnRslt_qty_43;// [Rslt]の[qty_43_p.qty]を[columnRslt_qty_43]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_44_p_PPanel;
	public MCColumnConfig columnRslt_qty_44;// [Rslt]の[qty_44_p.qty]を[columnRslt_qty_44]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_45_p_PPanel;
	public MCColumnConfig columnRslt_qty_45;// [Rslt]の[qty_45_p.qty]を[columnRslt_qty_45]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_46_p_PPanel;
	public MCColumnConfig columnRslt_qty_46;// [Rslt]の[qty_46_p.qty]を[columnRslt_qty_46]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_47_p_PPanel;
	public MCColumnConfig columnRslt_qty_47;// [Rslt]の[qty_47_p.qty]を[columnRslt_qty_47]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_48_p_PPanel;
	public MCColumnConfig columnRslt_qty_48;// [Rslt]の[qty_48_p.qty]を[columnRslt_qty_48]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_49_p_PPanel;
	public MCColumnConfig columnRslt_qty_49;// [Rslt]の[qty_49_p.qty]を[columnRslt_qty_49]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_50_p_PPanel;
	public MCColumnConfig columnRslt_qty_50;// [Rslt]の[qty_50_p.qty]を[columnRslt_qty_50]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_51_p_PPanel;
	public MCColumnConfig columnRslt_qty_51;// [Rslt]の[qty_51_p.qty]を[columnRslt_qty_51]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_52_p_PPanel;
	public MCColumnConfig columnRslt_qty_52;// [Rslt]の[qty_52_p.qty]を[columnRslt_qty_52]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_53_p_PPanel;
	public MCColumnConfig columnRslt_qty_53;// [Rslt]の[qty_53_p.qty]を[columnRslt_qty_53]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_54_p_PPanel;
	public MCColumnConfig columnRslt_qty_54;// [Rslt]の[qty_54_p.qty]を[columnRslt_qty_54]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_55_p_PPanel;
	public MCColumnConfig columnRslt_qty_55;// [Rslt]の[qty_55_p.qty]を[columnRslt_qty_55]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_56_p_PPanel;
	public MCColumnConfig columnRslt_qty_56;// [Rslt]の[qty_56_p.qty]を[columnRslt_qty_56]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_57_p_PPanel;
	public MCColumnConfig columnRslt_qty_57;// [Rslt]の[qty_57_p.qty]を[columnRslt_qty_57]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_58_p_PPanel;
	public MCColumnConfig columnRslt_qty_58;// [Rslt]の[qty_58_p.qty]を[columnRslt_qty_58]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_59_p_PPanel;
	public MCColumnConfig columnRslt_qty_59;// [Rslt]の[qty_59_p.qty]を[columnRslt_qty_59]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_60_p_PPanel;
	public MCColumnConfig columnRslt_qty_60;// [Rslt]の[qty_60_p.qty]を[columnRslt_qty_60]としてエイリアス定義。
	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_grp_peg_no = null;
	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_record_id = null;
	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_record_grp_id = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
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
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX_U, REF};
	
	/** [MS_MSBCL0350_Srch01]のCallerの作成 */
	protected MSBCP_MlyRqmtSchdReg_MC.MS_MSBCL0350_Srch01Caller createMS_MSBCL0350_Srch01() {
		MSBCP_MlyRqmtSchdReg_MC.MS_MSBCL0350_Srch01Caller<MSBCP_MlyRqmtSchdReg, MS_MSBCL0350_Srch01Bridge>
		caller = ((MSBCP_MlyRqmtSchdReg_MC)this).new MS_MSBCL0350_Srch01Caller<MSBCP_MlyRqmtSchdReg, MS_MSBCL0350_Srch01Bridge>(
					(MSBCP_MlyRqmtSchdReg)this, new MS_MSBCL0350_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL0350_Srch01]の呼び出し */
	protected void callMS_MSBCL0350_Srch01() {
		MCCaller caller = createMS_MSBCL0350_Srch01();
		caller.exec();
	}
	/** [MS_MSBCL0350_Srch02]のCallerの作成 */
	protected MSBCP_MlyRqmtSchdReg_MC.MS_MSBCL0350_Srch02Caller createMS_MSBCL0350_Srch02() {
		MSBCP_MlyRqmtSchdReg_MC.MS_MSBCL0350_Srch02Caller<MSBCP_MlyRqmtSchdReg, MS_MSBCL0350_Srch02Bridge>
		caller = ((MSBCP_MlyRqmtSchdReg_MC)this).new MS_MSBCL0350_Srch02Caller<MSBCP_MlyRqmtSchdReg, MS_MSBCL0350_Srch02Bridge>(
					(MSBCP_MlyRqmtSchdReg)this, new MS_MSBCL0350_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBCL0350_Srch02]の呼び出し */
	protected void callMS_MSBCL0350_Srch02() {
		MCCaller caller = createMS_MSBCL0350_Srch02();
		caller.exec();
	}
	/** [MS_MSBCL0350_Upd01]のCallerの作成 */
	protected MSBCP_MlyRqmtSchdReg_MC.MS_MSBCL0350_Upd01Caller createMS_MSBCL0350_Upd01() {
		MSBCP_MlyRqmtSchdReg_MC.MS_MSBCL0350_Upd01Caller<MSBCP_MlyRqmtSchdReg, MS_MSBCL0350_Upd01Bridge>
		caller = ((MSBCP_MlyRqmtSchdReg_MC)this).new MS_MSBCL0350_Upd01Caller<MSBCP_MlyRqmtSchdReg, MS_MSBCL0350_Upd01Bridge>(
					(MSBCP_MlyRqmtSchdReg)this, new MS_MSBCL0350_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBCL0350_Upd01]の呼び出し */
	protected void callMS_MSBCL0350_Upd01() {
		MCCaller caller = createMS_MSBCL0350_Upd01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0350.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0350.RsltR> aRsltL;
	/** [Pln]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0350.PlnR> aPlnL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP0350.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0350.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0350.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP0350.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBC.MSBCP0350.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0350.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBC.MSBCP0350.RsltR createRsltR() {
		return mcframe.clientMSBC.MSBCP0350.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0350.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0350.RsltR.class);
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
	 * コピーによってaPlnLを設定します。
	 *
	 * aPlnLのインスタンスは変更されません。
	 *
	 * @param dataset PlnL
	 */
	public void setPlnL(MCList<mcframe.clientMSBC.MSBCP0350.PlnR> aList) {
		if (getPlnL() != aList) {
			getPlnL().setAll(aList);
		}
	}

	/**
	 * [Pln]ブロックのコンテナaPlnLを返します。
	 *
	 * @return PlnL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0350.PlnR> getPlnL() {
		return aPlnL;
	}

	/**
	 * aPlnRを作成します。
	 *
	 * @return PlnR
	 */
	public mcframe.clientMSBC.MSBCP0350.PlnR createPlnR() {
		return mcframe.clientMSBC.MSBCP0350.PlnR.create();
	}

	/**
	 * aPlnLを作成します。
	 *
	 * @return PlnL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0350.PlnR> createPlnL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0350.PlnR.class);
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
		if(!MCCollectionUtil.contains(ret, getPlnL())) ret.add(getPlnL());
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
		if(aCnt == getPlnL()) return "Pln";
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
		if(bId.equals("Pln")) return getPlnL();
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
		ret.add(CndPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_MlyRqmtSchdReg_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aPlnL = createPlnL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_MlyRqmtSchdReg_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aPlnL = createPlnL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBCP_MlyRqmtSchdReg_MC.jbCreateScreenOpe((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbCreateTop((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbCreateFold((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbCreateCnd((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbCreateLPnl((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbCreateCtrl((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbCreateRslt((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbCreateBtn((MSBCP_MlyRqmtSchdReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBCP_MlyRqmtSchdReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_MlyRqmtSchdReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_MlyRqmtSchdReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_MlyRqmtSchdReg p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MSBCP_MlyRqmtSchdReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_MlyRqmtSchdReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBCP_MlyRqmtSchdReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$itm_p);
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
		p.Rslt_sum_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$sum_p);
		p.Rslt_sum_p_PPanel.setName("Rslt.sum_p");
		p.columnRslt_sum = p.Rslt_sum_p_PPanel.columnQty_qty;
		p.columnRslt_sum.addAliasName("Rslt.sum", p);
		p.Rslt_qty_00_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_00_p);
		p.Rslt_qty_00_p_PPanel.setName("Rslt.qty_00_p");
		p.columnRslt_qty_00 = p.Rslt_qty_00_p_PPanel.columnQty_qty;
		p.columnRslt_qty_00.addAliasName("Rslt.qty_00", p);
		p.Rslt_qty_01_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_01_p);
		p.Rslt_qty_01_p_PPanel.setName("Rslt.qty_01_p");
		p.columnRslt_qty_01 = p.Rslt_qty_01_p_PPanel.columnQty_qty;
		p.columnRslt_qty_01.addAliasName("Rslt.qty_01", p);
		p.Rslt_qty_02_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_02_p);
		p.Rslt_qty_02_p_PPanel.setName("Rslt.qty_02_p");
		p.columnRslt_qty_02 = p.Rslt_qty_02_p_PPanel.columnQty_qty;
		p.columnRslt_qty_02.addAliasName("Rslt.qty_02", p);
		p.Rslt_qty_03_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_03_p);
		p.Rslt_qty_03_p_PPanel.setName("Rslt.qty_03_p");
		p.columnRslt_qty_03 = p.Rslt_qty_03_p_PPanel.columnQty_qty;
		p.columnRslt_qty_03.addAliasName("Rslt.qty_03", p);
		p.Rslt_qty_04_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_04_p);
		p.Rslt_qty_04_p_PPanel.setName("Rslt.qty_04_p");
		p.columnRslt_qty_04 = p.Rslt_qty_04_p_PPanel.columnQty_qty;
		p.columnRslt_qty_04.addAliasName("Rslt.qty_04", p);
		p.Rslt_qty_05_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_05_p);
		p.Rslt_qty_05_p_PPanel.setName("Rslt.qty_05_p");
		p.columnRslt_qty_05 = p.Rslt_qty_05_p_PPanel.columnQty_qty;
		p.columnRslt_qty_05.addAliasName("Rslt.qty_05", p);
		p.Rslt_qty_06_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_06_p);
		p.Rslt_qty_06_p_PPanel.setName("Rslt.qty_06_p");
		p.columnRslt_qty_06 = p.Rslt_qty_06_p_PPanel.columnQty_qty;
		p.columnRslt_qty_06.addAliasName("Rslt.qty_06", p);
		p.Rslt_qty_07_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_07_p);
		p.Rslt_qty_07_p_PPanel.setName("Rslt.qty_07_p");
		p.columnRslt_qty_07 = p.Rslt_qty_07_p_PPanel.columnQty_qty;
		p.columnRslt_qty_07.addAliasName("Rslt.qty_07", p);
		p.Rslt_qty_08_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_08_p);
		p.Rslt_qty_08_p_PPanel.setName("Rslt.qty_08_p");
		p.columnRslt_qty_08 = p.Rslt_qty_08_p_PPanel.columnQty_qty;
		p.columnRslt_qty_08.addAliasName("Rslt.qty_08", p);
		p.Rslt_qty_09_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_09_p);
		p.Rslt_qty_09_p_PPanel.setName("Rslt.qty_09_p");
		p.columnRslt_qty_09 = p.Rslt_qty_09_p_PPanel.columnQty_qty;
		p.columnRslt_qty_09.addAliasName("Rslt.qty_09", p);
		p.Rslt_qty_10_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_10_p);
		p.Rslt_qty_10_p_PPanel.setName("Rslt.qty_10_p");
		p.columnRslt_qty_10 = p.Rslt_qty_10_p_PPanel.columnQty_qty;
		p.columnRslt_qty_10.addAliasName("Rslt.qty_10", p);
		p.Rslt_qty_11_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_11_p);
		p.Rslt_qty_11_p_PPanel.setName("Rslt.qty_11_p");
		p.columnRslt_qty_11 = p.Rslt_qty_11_p_PPanel.columnQty_qty;
		p.columnRslt_qty_11.addAliasName("Rslt.qty_11", p);
		p.Rslt_qty_12_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_12_p);
		p.Rslt_qty_12_p_PPanel.setName("Rslt.qty_12_p");
		p.columnRslt_qty_12 = p.Rslt_qty_12_p_PPanel.columnQty_qty;
		p.columnRslt_qty_12.addAliasName("Rslt.qty_12", p);
		p.Rslt_qty_13_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_13_p);
		p.Rslt_qty_13_p_PPanel.setName("Rslt.qty_13_p");
		p.columnRslt_qty_13 = p.Rslt_qty_13_p_PPanel.columnQty_qty;
		p.columnRslt_qty_13.addAliasName("Rslt.qty_13", p);
		p.Rslt_qty_14_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_14_p);
		p.Rslt_qty_14_p_PPanel.setName("Rslt.qty_14_p");
		p.columnRslt_qty_14 = p.Rslt_qty_14_p_PPanel.columnQty_qty;
		p.columnRslt_qty_14.addAliasName("Rslt.qty_14", p);
		p.Rslt_qty_15_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_15_p);
		p.Rslt_qty_15_p_PPanel.setName("Rslt.qty_15_p");
		p.columnRslt_qty_15 = p.Rslt_qty_15_p_PPanel.columnQty_qty;
		p.columnRslt_qty_15.addAliasName("Rslt.qty_15", p);
		p.Rslt_qty_16_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_16_p);
		p.Rslt_qty_16_p_PPanel.setName("Rslt.qty_16_p");
		p.columnRslt_qty_16 = p.Rslt_qty_16_p_PPanel.columnQty_qty;
		p.columnRslt_qty_16.addAliasName("Rslt.qty_16", p);
		p.Rslt_qty_17_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_17_p);
		p.Rslt_qty_17_p_PPanel.setName("Rslt.qty_17_p");
		p.columnRslt_qty_17 = p.Rslt_qty_17_p_PPanel.columnQty_qty;
		p.columnRslt_qty_17.addAliasName("Rslt.qty_17", p);
		p.Rslt_qty_18_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_18_p);
		p.Rslt_qty_18_p_PPanel.setName("Rslt.qty_18_p");
		p.columnRslt_qty_18 = p.Rslt_qty_18_p_PPanel.columnQty_qty;
		p.columnRslt_qty_18.addAliasName("Rslt.qty_18", p);
		p.Rslt_qty_19_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_19_p);
		p.Rslt_qty_19_p_PPanel.setName("Rslt.qty_19_p");
		p.columnRslt_qty_19 = p.Rslt_qty_19_p_PPanel.columnQty_qty;
		p.columnRslt_qty_19.addAliasName("Rslt.qty_19", p);
		p.Rslt_qty_20_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_20_p);
		p.Rslt_qty_20_p_PPanel.setName("Rslt.qty_20_p");
		p.columnRslt_qty_20 = p.Rslt_qty_20_p_PPanel.columnQty_qty;
		p.columnRslt_qty_20.addAliasName("Rslt.qty_20", p);
		p.Rslt_qty_21_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_21_p);
		p.Rslt_qty_21_p_PPanel.setName("Rslt.qty_21_p");
		p.columnRslt_qty_21 = p.Rslt_qty_21_p_PPanel.columnQty_qty;
		p.columnRslt_qty_21.addAliasName("Rslt.qty_21", p);
		p.Rslt_qty_22_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_22_p);
		p.Rslt_qty_22_p_PPanel.setName("Rslt.qty_22_p");
		p.columnRslt_qty_22 = p.Rslt_qty_22_p_PPanel.columnQty_qty;
		p.columnRslt_qty_22.addAliasName("Rslt.qty_22", p);
		p.Rslt_qty_23_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_23_p);
		p.Rslt_qty_23_p_PPanel.setName("Rslt.qty_23_p");
		p.columnRslt_qty_23 = p.Rslt_qty_23_p_PPanel.columnQty_qty;
		p.columnRslt_qty_23.addAliasName("Rslt.qty_23", p);
		p.Rslt_qty_24_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_24_p);
		p.Rslt_qty_24_p_PPanel.setName("Rslt.qty_24_p");
		p.columnRslt_qty_24 = p.Rslt_qty_24_p_PPanel.columnQty_qty;
		p.columnRslt_qty_24.addAliasName("Rslt.qty_24", p);
		p.Rslt_qty_25_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_25_p);
		p.Rslt_qty_25_p_PPanel.setName("Rslt.qty_25_p");
		p.columnRslt_qty_25 = p.Rslt_qty_25_p_PPanel.columnQty_qty;
		p.columnRslt_qty_25.addAliasName("Rslt.qty_25", p);
		p.Rslt_qty_26_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_26_p);
		p.Rslt_qty_26_p_PPanel.setName("Rslt.qty_26_p");
		p.columnRslt_qty_26 = p.Rslt_qty_26_p_PPanel.columnQty_qty;
		p.columnRslt_qty_26.addAliasName("Rslt.qty_26", p);
		p.Rslt_qty_27_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_27_p);
		p.Rslt_qty_27_p_PPanel.setName("Rslt.qty_27_p");
		p.columnRslt_qty_27 = p.Rslt_qty_27_p_PPanel.columnQty_qty;
		p.columnRslt_qty_27.addAliasName("Rslt.qty_27", p);
		p.Rslt_qty_28_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_28_p);
		p.Rslt_qty_28_p_PPanel.setName("Rslt.qty_28_p");
		p.columnRslt_qty_28 = p.Rslt_qty_28_p_PPanel.columnQty_qty;
		p.columnRslt_qty_28.addAliasName("Rslt.qty_28", p);
		p.Rslt_qty_29_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_29_p);
		p.Rslt_qty_29_p_PPanel.setName("Rslt.qty_29_p");
		p.columnRslt_qty_29 = p.Rslt_qty_29_p_PPanel.columnQty_qty;
		p.columnRslt_qty_29.addAliasName("Rslt.qty_29", p);
		p.Rslt_qty_30_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_30_p);
		p.Rslt_qty_30_p_PPanel.setName("Rslt.qty_30_p");
		p.columnRslt_qty_30 = p.Rslt_qty_30_p_PPanel.columnQty_qty;
		p.columnRslt_qty_30.addAliasName("Rslt.qty_30", p);
		p.Rslt_qty_31_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_31_p);
		p.Rslt_qty_31_p_PPanel.setName("Rslt.qty_31_p");
		p.columnRslt_qty_31 = p.Rslt_qty_31_p_PPanel.columnQty_qty;
		p.columnRslt_qty_31.addAliasName("Rslt.qty_31", p);
		p.Rslt_qty_32_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_32_p);
		p.Rslt_qty_32_p_PPanel.setName("Rslt.qty_32_p");
		p.columnRslt_qty_32 = p.Rslt_qty_32_p_PPanel.columnQty_qty;
		p.columnRslt_qty_32.addAliasName("Rslt.qty_32", p);
		p.Rslt_qty_33_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_33_p);
		p.Rslt_qty_33_p_PPanel.setName("Rslt.qty_33_p");
		p.columnRslt_qty_33 = p.Rslt_qty_33_p_PPanel.columnQty_qty;
		p.columnRslt_qty_33.addAliasName("Rslt.qty_33", p);
		p.Rslt_qty_34_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_34_p);
		p.Rslt_qty_34_p_PPanel.setName("Rslt.qty_34_p");
		p.columnRslt_qty_34 = p.Rslt_qty_34_p_PPanel.columnQty_qty;
		p.columnRslt_qty_34.addAliasName("Rslt.qty_34", p);
		p.Rslt_qty_35_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_35_p);
		p.Rslt_qty_35_p_PPanel.setName("Rslt.qty_35_p");
		p.columnRslt_qty_35 = p.Rslt_qty_35_p_PPanel.columnQty_qty;
		p.columnRslt_qty_35.addAliasName("Rslt.qty_35", p);
		p.Rslt_qty_36_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_36_p);
		p.Rslt_qty_36_p_PPanel.setName("Rslt.qty_36_p");
		p.columnRslt_qty_36 = p.Rslt_qty_36_p_PPanel.columnQty_qty;
		p.columnRslt_qty_36.addAliasName("Rslt.qty_36", p);
		p.Rslt_qty_37_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_37_p);
		p.Rslt_qty_37_p_PPanel.setName("Rslt.qty_37_p");
		p.columnRslt_qty_37 = p.Rslt_qty_37_p_PPanel.columnQty_qty;
		p.columnRslt_qty_37.addAliasName("Rslt.qty_37", p);
		p.Rslt_qty_38_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_38_p);
		p.Rslt_qty_38_p_PPanel.setName("Rslt.qty_38_p");
		p.columnRslt_qty_38 = p.Rslt_qty_38_p_PPanel.columnQty_qty;
		p.columnRslt_qty_38.addAliasName("Rslt.qty_38", p);
		p.Rslt_qty_39_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_39_p);
		p.Rslt_qty_39_p_PPanel.setName("Rslt.qty_39_p");
		p.columnRslt_qty_39 = p.Rslt_qty_39_p_PPanel.columnQty_qty;
		p.columnRslt_qty_39.addAliasName("Rslt.qty_39", p);
		p.Rslt_qty_40_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_40_p);
		p.Rslt_qty_40_p_PPanel.setName("Rslt.qty_40_p");
		p.columnRslt_qty_40 = p.Rslt_qty_40_p_PPanel.columnQty_qty;
		p.columnRslt_qty_40.addAliasName("Rslt.qty_40", p);
		p.Rslt_qty_41_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_41_p);
		p.Rslt_qty_41_p_PPanel.setName("Rslt.qty_41_p");
		p.columnRslt_qty_41 = p.Rslt_qty_41_p_PPanel.columnQty_qty;
		p.columnRslt_qty_41.addAliasName("Rslt.qty_41", p);
		p.Rslt_qty_42_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_42_p);
		p.Rslt_qty_42_p_PPanel.setName("Rslt.qty_42_p");
		p.columnRslt_qty_42 = p.Rslt_qty_42_p_PPanel.columnQty_qty;
		p.columnRslt_qty_42.addAliasName("Rslt.qty_42", p);
		p.Rslt_qty_43_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_43_p);
		p.Rslt_qty_43_p_PPanel.setName("Rslt.qty_43_p");
		p.columnRslt_qty_43 = p.Rslt_qty_43_p_PPanel.columnQty_qty;
		p.columnRslt_qty_43.addAliasName("Rslt.qty_43", p);
		p.Rslt_qty_44_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_44_p);
		p.Rslt_qty_44_p_PPanel.setName("Rslt.qty_44_p");
		p.columnRslt_qty_44 = p.Rslt_qty_44_p_PPanel.columnQty_qty;
		p.columnRslt_qty_44.addAliasName("Rslt.qty_44", p);
		p.Rslt_qty_45_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_45_p);
		p.Rslt_qty_45_p_PPanel.setName("Rslt.qty_45_p");
		p.columnRslt_qty_45 = p.Rslt_qty_45_p_PPanel.columnQty_qty;
		p.columnRslt_qty_45.addAliasName("Rslt.qty_45", p);
		p.Rslt_qty_46_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_46_p);
		p.Rslt_qty_46_p_PPanel.setName("Rslt.qty_46_p");
		p.columnRslt_qty_46 = p.Rslt_qty_46_p_PPanel.columnQty_qty;
		p.columnRslt_qty_46.addAliasName("Rslt.qty_46", p);
		p.Rslt_qty_47_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_47_p);
		p.Rslt_qty_47_p_PPanel.setName("Rslt.qty_47_p");
		p.columnRslt_qty_47 = p.Rslt_qty_47_p_PPanel.columnQty_qty;
		p.columnRslt_qty_47.addAliasName("Rslt.qty_47", p);
		p.Rslt_qty_48_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_48_p);
		p.Rslt_qty_48_p_PPanel.setName("Rslt.qty_48_p");
		p.columnRslt_qty_48 = p.Rslt_qty_48_p_PPanel.columnQty_qty;
		p.columnRslt_qty_48.addAliasName("Rslt.qty_48", p);
		p.Rslt_qty_49_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_49_p);
		p.Rslt_qty_49_p_PPanel.setName("Rslt.qty_49_p");
		p.columnRslt_qty_49 = p.Rslt_qty_49_p_PPanel.columnQty_qty;
		p.columnRslt_qty_49.addAliasName("Rslt.qty_49", p);
		p.Rslt_qty_50_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_50_p);
		p.Rslt_qty_50_p_PPanel.setName("Rslt.qty_50_p");
		p.columnRslt_qty_50 = p.Rslt_qty_50_p_PPanel.columnQty_qty;
		p.columnRslt_qty_50.addAliasName("Rslt.qty_50", p);
		p.Rslt_qty_51_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_51_p);
		p.Rslt_qty_51_p_PPanel.setName("Rslt.qty_51_p");
		p.columnRslt_qty_51 = p.Rslt_qty_51_p_PPanel.columnQty_qty;
		p.columnRslt_qty_51.addAliasName("Rslt.qty_51", p);
		p.Rslt_qty_52_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_52_p);
		p.Rslt_qty_52_p_PPanel.setName("Rslt.qty_52_p");
		p.columnRslt_qty_52 = p.Rslt_qty_52_p_PPanel.columnQty_qty;
		p.columnRslt_qty_52.addAliasName("Rslt.qty_52", p);
		p.Rslt_qty_53_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_53_p);
		p.Rslt_qty_53_p_PPanel.setName("Rslt.qty_53_p");
		p.columnRslt_qty_53 = p.Rslt_qty_53_p_PPanel.columnQty_qty;
		p.columnRslt_qty_53.addAliasName("Rslt.qty_53", p);
		p.Rslt_qty_54_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_54_p);
		p.Rslt_qty_54_p_PPanel.setName("Rslt.qty_54_p");
		p.columnRslt_qty_54 = p.Rslt_qty_54_p_PPanel.columnQty_qty;
		p.columnRslt_qty_54.addAliasName("Rslt.qty_54", p);
		p.Rslt_qty_55_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_55_p);
		p.Rslt_qty_55_p_PPanel.setName("Rslt.qty_55_p");
		p.columnRslt_qty_55 = p.Rslt_qty_55_p_PPanel.columnQty_qty;
		p.columnRslt_qty_55.addAliasName("Rslt.qty_55", p);
		p.Rslt_qty_56_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_56_p);
		p.Rslt_qty_56_p_PPanel.setName("Rslt.qty_56_p");
		p.columnRslt_qty_56 = p.Rslt_qty_56_p_PPanel.columnQty_qty;
		p.columnRslt_qty_56.addAliasName("Rslt.qty_56", p);
		p.Rslt_qty_57_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_57_p);
		p.Rslt_qty_57_p_PPanel.setName("Rslt.qty_57_p");
		p.columnRslt_qty_57 = p.Rslt_qty_57_p_PPanel.columnQty_qty;
		p.columnRslt_qty_57.addAliasName("Rslt.qty_57", p);
		p.Rslt_qty_58_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_58_p);
		p.Rslt_qty_58_p_PPanel.setName("Rslt.qty_58_p");
		p.columnRslt_qty_58 = p.Rslt_qty_58_p_PPanel.columnQty_qty;
		p.columnRslt_qty_58.addAliasName("Rslt.qty_58", p);
		p.Rslt_qty_59_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_59_p);
		p.Rslt_qty_59_p_PPanel.setName("Rslt.qty_59_p");
		p.columnRslt_qty_59 = p.Rslt_qty_59_p_PPanel.columnQty_qty;
		p.columnRslt_qty_59.addAliasName("Rslt.qty_59", p);
		p.Rslt_qty_60_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0350.RsltR.$qty_60_p);
		p.Rslt_qty_60_p_PPanel.setName("Rslt.qty_60_p");
		p.columnRslt_qty_60 = p.Rslt_qty_60_p_PPanel.columnQty_qty;
		p.columnRslt_qty_60.addAliasName("Rslt.qty_60", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBCP_MlyRqmtSchdReg p) {
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

	
	/** [Cnd_mps_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mps_grp_cd_p = null;

	/**
	 * [Cnd_mps_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mps_grp_cd_ListPutter() {
		if (Cnd_mps_grp_cd_p == null) {
			Cnd_mps_grp_cd_p = createCnd_mps_grp_cd_ListPutter(Cnd_mps_grp_cd, "mps_grp_cd", "mps_grp_nm");

		}
		return Cnd_mps_grp_cd_p;
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
	
	
	/** [Cnd_strg_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_strg_loc_grp_cd_p = null;

	/**
	 * [Cnd_strg_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_strg_loc_grp_cd_ListPutter() {
		if (Cnd_strg_loc_grp_cd_p == null) {
			Cnd_strg_loc_grp_cd_p = createCnd_strg_loc_grp_cd_ListPutter(Cnd_strg_loc_grp_cd, "strg_loc_grp_cd", "strg_loc_grp_nm");

		}
		return Cnd_strg_loc_grp_cd_p;
	}
	
	
	/** [Cnd_strg_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_strg_loc_cd_p = null;

	/**
	 * [Cnd_strg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_strg_loc_cd_ListPutter() {
		if (Cnd_strg_loc_cd_p == null) {
			Cnd_strg_loc_cd_p = createCnd_strg_loc_cd_ListPutter(Cnd_strg_loc_cd, "strg_loc_cd", "strg_loc_nm");

		}
		return Cnd_strg_loc_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_MlyRqmtSchdReg create(){
		MSBCP_MlyRqmtSchdReg p = new MSBCP_MlyRqmtSchdReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_MlyRqmtSchdReg create(String name){
		MSBCP_MlyRqmtSchdReg p = new MSBCP_MlyRqmtSchdReg(name);
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
		MSBCP_MlyRqmtSchdReg_MC.jbfInitScreenOpe((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbfInitTop((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbfInitFold((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbfInitCnd((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbfInitLPnl((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbfInitCtrl((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbfInitRslt((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbfInitBtn((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbInitScreenOpe((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbInitTop((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbInitFold((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbInitCnd((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbInitLPnl((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbInitCtrl((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbInitRslt((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.jbInitBtn((MSBCP_MlyRqmtSchdReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBCP_MlyRqmtSchdReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_MlyRqmtSchdReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_MlyRqmtSchdReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_MlyRqmtSchdReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ym_Label = p.beansFactory.createLabel("Cnd.ym_Label");
		p.Cnd_ym = p.beansFactory.createDateField("Cnd.ym");
		p.Cnd_ym.setLabel(p.Cnd_ym_Label);
		p.Cnd_prod_ym_fr_Label = p.beansFactory.createLabel("Cnd.prod_ym_fr_Label");
		p.Cnd_prod_ym_fr = p.beansFactory.createDateField("Cnd.prod_ym_fr");
		p.Cnd_prod_ym_fr.setLabel(p.Cnd_prod_ym_fr_Label);
		p.Cnd_prod_ym_to_Label = p.beansFactory.createLabel("Cnd.prod_ym_to_Label");
		p.Cnd_prod_ym_to = p.beansFactory.createDateField("Cnd.prod_ym_to");
		p.Cnd_prod_ym_to.setLabel(p.Cnd_prod_ym_to_Label);
		p.Cnd_mps_grp_cd_Label = p.beansFactory.createLabel("Cnd.mps_grp_cd_Label");
		p.Cnd_mps_grp_cd = p.beansFactory.createTextComboBox("Cnd.mps_grp_cd");
		p.Cnd_mps_grp_cd.setLabel(p.Cnd_mps_grp_cd_Label);
		p.Cnd_mps_grp_nm = p.beansFactory.createTextField("Cnd.mps_grp_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_strg_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.strg_loc_grp_cd_Label");
		p.Cnd_strg_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.strg_loc_grp_cd");
		p.Cnd_strg_loc_grp_cd.setLabel(p.Cnd_strg_loc_grp_cd_Label);
		p.Cnd_strg_loc_grp_nm = p.beansFactory.createTextField("Cnd.strg_loc_grp_nm");
		p.Cnd_strg_loc_cd_Label = p.beansFactory.createLabel("Cnd.strg_loc_cd_Label");
		p.Cnd_strg_loc_cd = p.beansFactory.createTextField("Cnd.strg_loc_cd");
		p.Cnd_strg_loc_cd.setLabel(p.Cnd_strg_loc_cd_Label);
		p.Cnd_strg_loc_nm = p.beansFactory.createTextField("Cnd.strg_loc_nm");
		p.Cnd_disp_key_flg = p.beansFactory.createCheckBox("Cnd.disp_key_flg");
		p.Cnd_disp_pre_flg = p.beansFactory.createCheckBox("Cnd.disp_pre_flg");
		p.Cnd_disp_rqmt_flg = p.beansFactory.createCheckBox("Cnd.disp_rqmt_flg");
		p.Cnd_disp_act_flg = p.beansFactory.createCheckBox("Cnd.disp_act_flg");
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MSBCP_MlyRqmtSchdReg p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBCP_MlyRqmtSchdReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBCP_MlyRqmtSchdReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_disp_00 = p.beansFactory.createTableColumn("Rslt.disp_00", MCColumnType.TEXT);
		p.columnRslt_mps_grp_cd = p.beansFactory.createTableColumn("Rslt.mps_grp_cd", MCColumnType.TEXT);
		p.columnRslt_mps_grp_nm = p.beansFactory.createTableColumn("Rslt.mps_grp_nm", MCColumnType.TEXT);
		p.columnRslt_strg_loc_cd = p.beansFactory.createTableColumn("Rslt.strg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_strg_loc_nm = p.beansFactory.createTableColumn("Rslt.strg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_loc_cd = p.beansFactory.createTableColumn("Rslt.rqst_loc_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_loc_nm = p.beansFactory.createTableColumn("Rslt.rqst_loc_nm", MCColumnType.TEXT);
		p.columnRslt_proc_cd = p.beansFactory.createTableColumn("Rslt.proc_cd", MCColumnType.TEXT);
		p.columnRslt_proc_nm = p.beansFactory.createTableColumn("Rslt.proc_nm", MCColumnType.TEXT);
		p.columnRslt_ym = p.beansFactory.createTableColumn("Rslt.ym", MCColumnType.DATE);
		p.columnRslt_unit_cd = p.beansFactory.createTableColumn("Rslt.unit_cd", MCColumnType.TEXT);
		p.columnRslt_unit_nm = p.beansFactory.createTableColumn("Rslt.unit_nm", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_row_title_col = p.beansFactory.createTableColumn("Rslt.row_title_col", MCColumnType.TEXT);
		p.columnRslt_row_title_nm = p.beansFactory.createTableColumn("Rslt.row_title_nm", MCColumnType.TEXT);
		p.columnRslt_grp_peg_no = p.beansFactory.createTableColumn("Rslt.grp_peg_no", MCColumnType.NUMBER);
		p.columnRslt_record_id = p.beansFactory.createTableColumn("Rslt.record_id", MCColumnType.NUMBER);
		p.columnRslt_record_grp_id = p.beansFactory.createTableColumn("Rslt.record_grp_id", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBCP_MlyRqmtSchdReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBCP_MlyRqmtSchdReg p) {
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
	protected static void jbInitTop(MSBCP_MlyRqmtSchdReg p) {
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
		p.FoldPanel.setNextBeans(p.LPnlPanel);
		p.TopPanel.add(p.LPnlPanel, null);
		p.LPnlPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBCP_MlyRqmtSchdReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBCP_MlyRqmtSchdReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.ope_META);
		p.CndPanel.add(p.Cnd_ym_Label);
		p.CndPanel.add(p.Cnd_ym);
		p.CndPanel.setLastBeans(p.Cnd_ym);
		p.Cnd_ym.setNextBeans(p.Cnd_prod_ym_fr);
		p.Cnd_ym.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.ym_META);
		p.Cnd_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_prod_ym_fr_Label);
		p.CndPanel.add(p.Cnd_prod_ym_fr);
		p.Cnd_prod_ym_fr.setNextBeans(p.Cnd_prod_ym_to);
		p.Cnd_prod_ym_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.prod_ym_fr_META);
		p.Cnd_prod_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_prod_ym_to_Label);
		p.CndPanel.add(p.Cnd_prod_ym_to);
		p.Cnd_prod_ym_to.setNextBeans(p.Cnd_mps_grp_cd);
		p.Cnd_prod_ym_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.prod_ym_to_META);
		p.Cnd_prod_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_mps_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mps_grp_cd, true);
		p.Cnd_mps_grp_cd.setLinkBeans(p.Cnd_mps_grp_nm);
		p.CndPanel.add(p.Cnd_mps_grp_cd_Label);
		p.CndPanel.add(p.Cnd_mps_grp_cd);
		p.Cnd_mps_grp_cd.setNextBeans(p.Cnd_mps_grp_nm);
		p.Cnd_mps_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.mps_grp_cd_META);
		p.CndPanel.add(p.Cnd_mps_grp_nm);
		p.Cnd_mps_grp_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_mps_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.mps_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_mps_grp_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_strg_loc_grp_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_strg_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_loc_grp_cd, true);
		p.Cnd_strg_loc_grp_cd.setLinkBeans(p.Cnd_strg_loc_grp_nm);
		p.CndPanel.add(p.Cnd_strg_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_strg_loc_grp_cd);
		p.Cnd_strg_loc_grp_cd.setNextBeans(p.Cnd_strg_loc_grp_nm);
		p.Cnd_strg_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.strg_loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_strg_loc_grp_nm);
		p.Cnd_strg_loc_grp_nm.setNextBeans(p.Cnd_strg_loc_cd);
		p.Cnd_strg_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.strg_loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_strg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_strg_loc_cd);
		p.Cnd_strg_loc_cd.setNextBeans(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.strg_loc_cd_META);
		p.Cnd_strg_loc_cd.addLinkBeans(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_loc_cd, true);
		p.CndPanel.add(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.strg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_loc_nm, true);
		p.LPnlPanel.add(p.Cnd_disp_key_flg);
		p.LPnlPanel.setLastBeans(p.Cnd_disp_key_flg);
		p.Cnd_disp_key_flg.setNextBeans(p.Cnd_disp_pre_flg);
		p.Cnd_disp_key_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.disp_key_flg_META);
		p.LPnlPanel.add(p.Cnd_disp_pre_flg);
		p.Cnd_disp_pre_flg.setNextBeans(p.Cnd_disp_rqmt_flg);
		p.Cnd_disp_pre_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.disp_pre_flg_META);
		p.LPnlPanel.add(p.Cnd_disp_rqmt_flg);
		p.Cnd_disp_rqmt_flg.setNextBeans(p.Cnd_disp_act_flg);
		p.Cnd_disp_rqmt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.disp_rqmt_flg_META);
		p.LPnlPanel.add(p.Cnd_disp_act_flg);
		p.Cnd_disp_act_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0350.CndR.disp_act_flg_META);
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MSBCP_MlyRqmtSchdReg p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_MlyRqmtSchdReg p) {
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
	protected static void jbInitRslt(MSBCP_MlyRqmtSchdReg p) {
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
	protected static void jbInitBtn(MSBCP_MlyRqmtSchdReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
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
		MSBCP_MlyRqmtSchdReg_MC.mcInitScreenOpe((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.mcInitTop((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.mcInitFold((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.mcInitCnd((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.mcInitLPnl((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.mcInitCtrl((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.mcInitRslt((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.mcInitBtn((MSBCP_MlyRqmtSchdReg)this);

		// [UPD]ステータスのモードの設定
		MSBCP_MlyRqmtSchdReg_MC.statusInitUPD_ScreenOpe((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitUPD_Top((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitUPD_Fold((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitUPD_Cnd((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitUPD_LPnl((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitUPD_Ctrl((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitUPD_Rslt((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitUPD_Btn((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitUPD_Pln((MSBCP_MlyRqmtSchdReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBCP_MlyRqmtSchdReg_MC.statusInitFIX__U_ScreenOpe((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitFIX__U_Top((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitFIX__U_Fold((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitFIX__U_Cnd((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitFIX__U_LPnl((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitFIX__U_Ctrl((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitFIX__U_Rslt((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitFIX__U_Btn((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitFIX__U_Pln((MSBCP_MlyRqmtSchdReg)this);

		// [REF]ステータスのモードの設定
		MSBCP_MlyRqmtSchdReg_MC.statusInitREF_ScreenOpe((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitREF_Top((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitREF_Fold((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitREF_Cnd((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitREF_LPnl((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitREF_Ctrl((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitREF_Rslt((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitREF_Btn((MSBCP_MlyRqmtSchdReg)this);
		MSBCP_MlyRqmtSchdReg_MC.statusInitREF_Pln((MSBCP_MlyRqmtSchdReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBCP_MlyRqmtSchdReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_MlyRqmtSchdReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_MlyRqmtSchdReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_MlyRqmtSchdReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ym.setListListener(p);
		p.Cnd_ym.addAllListener(p);
		p.Cnd_prod_ym_fr.setListListener(p);
		p.Cnd_prod_ym_fr.addAllListener(p);
		p.Cnd_prod_ym_to.setListListener(p);
		p.Cnd_prod_ym_to.addAllListener(p);
		p.Cnd_mps_grp_cd.setListListener(p);
		p.Cnd_mps_grp_cd.addAllListener(p);
		p.Cnd_mps_grp_nm.setListListener(p);
		p.Cnd_mps_grp_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_strg_loc_grp_cd.setListListener(p);
		p.Cnd_strg_loc_grp_cd.addAllListener(p);
		p.Cnd_strg_loc_grp_nm.setListListener(p);
		p.Cnd_strg_loc_grp_nm.addAllListener(p);
		p.Cnd_strg_loc_cd.setListListener(p);
		p.Cnd_strg_loc_cd.addAllListener(p);
		p.Cnd_strg_loc_nm.setListListener(p);
		p.Cnd_strg_loc_nm.addAllListener(p);
		p.Cnd_disp_key_flg.addAllListener(p);
		p.Cnd_disp_pre_flg.addAllListener(p);
		p.Cnd_disp_rqmt_flg.addAllListener(p);
		p.Cnd_disp_act_flg.addAllListener(p);
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MSBCP_MlyRqmtSchdReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBCP_MlyRqmtSchdReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBCP_MlyRqmtSchdReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_disp_00.addAllListener(p);
		p.columnRslt_disp_00.setListListener(p);
		p.columnRslt_mps_grp_cd.addAllListener(p);
		p.columnRslt_mps_grp_cd.setListListener(p);
		p.columnRslt_mps_grp_nm.addAllListener(p);
		p.columnRslt_mps_grp_nm.setListListener(p);
		p.columnRslt_strg_loc_cd.addAllListener(p);
		p.columnRslt_strg_loc_cd.setListListener(p);
		p.columnRslt_strg_loc_nm.addAllListener(p);
		p.columnRslt_strg_loc_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_mfg_loc_cd.addAllListener(p);
		p.columnRslt_mfg_loc_cd.setListListener(p);
		p.columnRslt_mfg_loc_nm.addAllListener(p);
		p.columnRslt_mfg_loc_nm.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_rqst_loc_cd.addAllListener(p);
		p.columnRslt_rqst_loc_cd.setListListener(p);
		p.columnRslt_rqst_loc_nm.addAllListener(p);
		p.columnRslt_rqst_loc_nm.setListListener(p);
		p.columnRslt_proc_cd.addAllListener(p);
		p.columnRslt_proc_cd.setListListener(p);
		p.columnRslt_proc_nm.addAllListener(p);
		p.columnRslt_proc_nm.setListListener(p);
		p.columnRslt_ym.addAllListener(p);
		p.columnRslt_ym.setListListener(p);
		p.columnRslt_unit_cd.addAllListener(p);
		p.columnRslt_unit_cd.setListListener(p);
		p.columnRslt_unit_nm.addAllListener(p);
		p.columnRslt_unit_nm.setListListener(p);
		p.columnRslt_dec_place.addAllListener(p);
		p.columnRslt_dec_place.setListListener(p);
		p.columnRslt_row_title_col.addAllListener(p);
		p.columnRslt_row_title_col.setListListener(p);
		p.columnRslt_row_title_nm.addAllListener(p);
		p.columnRslt_row_title_nm.setListListener(p);
		p.columnRslt_grp_peg_no.addAllListener(p);
		p.columnRslt_grp_peg_no.setListListener(p);
		p.columnRslt_record_id.addAllListener(p);
		p.columnRslt_record_id.setListListener(p);
		p.columnRslt_record_grp_id.addAllListener(p);
		p.columnRslt_record_grp_id.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBCP_MlyRqmtSchdReg p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBCP_MlyRqmtSchdReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ym.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_prod_ym_fr.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_prod_ym_to.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_mps_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mps_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_disp_key_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_disp_pre_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_disp_rqmt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_disp_act_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LPnl(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBCP_MlyRqmtSchdReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_disp_00.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_mps_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mps_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sppl_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_proc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_proc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ym.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_row_title_col.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_row_title_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_sum_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_00_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_01_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_02_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_03_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_04_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_05_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_06_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_07_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_08_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_09_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_10_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_11_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_12_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_13_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_14_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_15_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_16_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_17_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_18_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_19_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_20_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_21_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_22_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_23_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_24_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_25_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_26_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_27_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_28_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_29_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_30_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_31_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_32_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_33_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_34_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_35_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_36_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_37_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_38_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_39_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_40_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_41_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_42_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_43_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_44_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_45_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_46_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_47_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_48_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_49_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_50_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_51_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_52_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_53_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_54_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_55_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_56_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_57_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_58_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_59_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_60_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_grp_peg_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_record_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_record_grp_id.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBCP_MlyRqmtSchdReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Pln]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Pln(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBCP_MlyRqmtSchdReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_ym.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_prod_ym_fr.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_prod_ym_to.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_mps_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mps_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_disp_key_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_disp_pre_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_disp_rqmt_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_disp_act_flg.putMode(p, FIX_U, MCMode.REQUIRED);

	}

	/**
	 * [FIX_U]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_LPnl(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MSBCP_MlyRqmtSchdReg p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_disp_00.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_mps_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mps_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sppl_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_proc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_proc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ym.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_row_title_col.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_row_title_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_sum_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_00_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_01_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_02_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_03_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_04_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_05_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_06_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_07_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_08_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_09_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_10_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_11_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_12_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_13_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_14_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_15_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_16_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_17_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_18_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_19_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_20_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_21_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_22_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_23_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_24_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_25_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_26_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_27_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_28_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_29_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_30_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_31_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_32_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_33_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_34_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_35_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_36_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_37_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_38_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_39_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_40_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_41_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_42_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_43_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_44_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_45_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_46_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_47_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_48_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_49_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_50_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_51_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_52_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_53_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_54_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_55_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_56_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_57_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_58_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_59_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_60_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_grp_peg_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_record_id.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_record_grp_id.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBCP_MlyRqmtSchdReg p){
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Pln]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Pln(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBCP_MlyRqmtSchdReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_prod_ym_fr.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_prod_ym_to.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mps_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mps_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_disp_key_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_disp_pre_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_disp_rqmt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_disp_act_flg.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBCP_MlyRqmtSchdReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_00.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_mps_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mps_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sppl_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_proc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_proc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ym.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_row_title_col.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_row_title_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sum_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_00_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_01_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_02_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_03_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_04_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_05_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_06_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_07_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_08_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_09_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_10_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_11_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_12_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_13_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_14_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_15_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_16_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_17_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_18_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_19_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_20_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_21_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_22_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_23_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_24_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_25_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_26_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_27_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_28_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_29_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_30_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_31_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_32_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_33_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_34_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_35_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_36_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_37_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_38_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_39_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_40_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_41_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_42_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_43_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_44_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_45_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_46_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_47_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_48_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_49_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_50_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_51_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_52_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_53_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_54_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_55_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_56_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_57_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_58_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_59_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_60_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_grp_peg_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_record_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_record_grp_id.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBCP_MlyRqmtSchdReg p){
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Pln]ブロックのモードの設定
	 */
	protected static void statusInitREF_Pln(MSBCP_MlyRqmtSchdReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return UPD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBCP_MlyRqmtSchdReg_MC.setTableConfigRslt((MSBCP_MlyRqmtSchdReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBCP_MlyRqmtSchdReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_disp_00.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.disp_00_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_00);
		p.columnRslt_mps_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.mps_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mps_grp_cd);
		p.columnRslt_mps_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.mps_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mps_grp_nm);
		p.columnRslt_strg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.strg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_cd);
		p.columnRslt_strg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.strg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_mfg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.mfg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_cd);
		p.columnRslt_mfg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.mfg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_nm);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_rqst_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.rqst_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_loc_cd);
		p.columnRslt_rqst_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.rqst_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_loc_nm);
		p.columnRslt_proc_cd.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.proc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_proc_cd);
		p.columnRslt_proc_nm.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.proc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_proc_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_ym.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.ym_META);
		p.columnRslt_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ym);
		p.columnRslt_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_cd);
		p.columnRslt_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_nm);
		p.columnRslt_dec_place.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.columnRslt_row_title_col.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.row_title_col_META);
		p.RsltTable.addColumnConfig(p.columnRslt_row_title_col);
		p.columnRslt_row_title_nm.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.row_title_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_row_title_nm);
		p.RsltTable.addTable(p.Rslt_sum_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_00_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_01_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_02_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_03_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_04_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_05_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_06_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_07_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_08_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_09_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_10_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_11_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_12_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_13_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_14_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_15_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_16_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_17_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_18_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_19_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_20_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_21_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_22_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_23_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_24_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_25_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_26_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_27_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_28_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_29_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_30_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_31_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_32_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_33_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_34_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_35_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_36_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_37_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_38_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_39_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_40_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_41_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_42_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_43_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_44_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_45_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_46_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_47_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_48_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_49_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_50_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_51_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_52_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_53_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_54_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_55_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_56_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_57_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_58_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_59_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_60_p_PPanel.QtyTable);
		p.columnRslt_grp_peg_no.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.grp_peg_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_grp_peg_no);
		p.columnRslt_record_id.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.record_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_record_id);
		p.columnRslt_record_grp_id.setMeta(mcframe.clientMSBC.MSBCP0350.RsltR.record_grp_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_record_grp_id);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_mps_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mps_grp_cd.getListConfig().setPutter(getCnd_mps_grp_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_strg_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_strg_loc_grp_cd.getListConfig().setPutter(getCnd_strg_loc_grp_cd_ListPutter());
		Cnd_strg_loc_cd.getListConfig().setPutter(getCnd_strg_loc_cd_ListPutter());
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
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
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
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_mps_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mps_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.MpsGrp");
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
	 * [Cnd_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_strg_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_strg_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_strg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_strg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_mps_grp_cd) return getCnd_mps_grp_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_strg_loc_grp_cd) return getCnd_strg_loc_grp_cd(row, info);
		if(combo == Cnd_strg_loc_cd) return getCnd_strg_loc_cd(row, info);
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
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_ym) return doCnd_ym_VC(info);
		if (vc == Cnd_prod_ym_fr) return doCnd_prod_ym_fr_VC(info);
		if (vc == Cnd_prod_ym_to) return doCnd_prod_ym_to_VC(info);
		if (vc == Cnd_mps_grp_cd) return doCnd_mps_grp_cd_VC(info);
		if (vc == Cnd_mps_grp_nm) return doCnd_mps_grp_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_strg_loc_grp_cd) return doCnd_strg_loc_grp_cd_VC(info);
		if (vc == Cnd_strg_loc_grp_nm) return doCnd_strg_loc_grp_nm_VC(info);
		if (vc == Cnd_strg_loc_cd) return doCnd_strg_loc_cd_VC(info);
		if (vc == Cnd_strg_loc_nm) return doCnd_strg_loc_nm_VC(info);
		if (vc == Cnd_disp_key_flg) return doCnd_disp_key_flg_VC(info);
		if (vc == Cnd_disp_pre_flg) return doCnd_disp_pre_flg_VC(info);
		if (vc == Cnd_disp_rqmt_flg) return doCnd_disp_rqmt_flg_VC(info);
		if (vc == Cnd_disp_act_flg) return doCnd_disp_act_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_disp_00) return doRslt_disp_00_VC(info);
		if (vc == columnRslt_mps_grp_cd) return doRslt_mps_grp_cd_VC(info);
		if (vc == columnRslt_mps_grp_nm) return doRslt_mps_grp_nm_VC(info);
		if (vc == columnRslt_strg_loc_cd) return doRslt_strg_loc_cd_VC(info);
		if (vc == columnRslt_strg_loc_nm) return doRslt_strg_loc_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_mfg_loc_cd) return doRslt_mfg_loc_cd_VC(info);
		if (vc == columnRslt_mfg_loc_nm) return doRslt_mfg_loc_nm_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_rqst_loc_cd) return doRslt_rqst_loc_cd_VC(info);
		if (vc == columnRslt_rqst_loc_nm) return doRslt_rqst_loc_nm_VC(info);
		if (vc == columnRslt_proc_cd) return doRslt_proc_cd_VC(info);
		if (vc == columnRslt_proc_nm) return doRslt_proc_nm_VC(info);
		if (vc == columnRslt_ym) return doRslt_ym_VC(info);
		if (vc == columnRslt_unit_cd) return doRslt_unit_cd_VC(info);
		if (vc == columnRslt_unit_nm) return doRslt_unit_nm_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_row_title_col) return doRslt_row_title_col_VC(info);
		if (vc == columnRslt_row_title_nm) return doRslt_row_title_nm_VC(info);
		if (vc == columnRslt_grp_peg_no) return doRslt_grp_peg_no_VC(info);
		if (vc == columnRslt_record_id) return doRslt_record_id_VC(info);
		if (vc == columnRslt_record_grp_id) return doRslt_record_grp_id_VC(info);
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
	 * [Cnd]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prod_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prod_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prod_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prod_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mps_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mps_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mps_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mps_grp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[strg_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[disp_key_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_key_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[disp_pre_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_pre_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[disp_rqmt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_rqmt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[disp_act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_act_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_00_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mps_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mps_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mps_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mps_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_loc_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rqst_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[proc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_proc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[proc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_proc_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[row_title_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_row_title_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[row_title_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_row_title_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[grp_peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_grp_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[record_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_record_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[record_grp_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_record_grp_id_VC(MCEventInfo info){
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
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_ym) doCnd_ym_NC(info);
		else if (nc == Cnd_prod_ym_fr) doCnd_prod_ym_fr_NC(info);
		else if (nc == Cnd_prod_ym_to) doCnd_prod_ym_to_NC(info);
		else if (nc == Cnd_mps_grp_cd) doCnd_mps_grp_cd_NC(info);
		else if (nc == Cnd_mps_grp_nm) doCnd_mps_grp_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_NC(info);
		else if (nc == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_NC(info);
		else if (nc == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NC(info);
		else if (nc == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NC(info);
		else if (nc == Cnd_disp_key_flg) doCnd_disp_key_flg_NC(info);
		else if (nc == Cnd_disp_pre_flg) doCnd_disp_pre_flg_NC(info);
		else if (nc == Cnd_disp_rqmt_flg) doCnd_disp_rqmt_flg_NC(info);
		else if (nc == Cnd_disp_act_flg) doCnd_disp_act_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_disp_00) doRslt_disp_00_NC(info);
		else if (nc == columnRslt_mps_grp_cd) doRslt_mps_grp_cd_NC(info);
		else if (nc == columnRslt_mps_grp_nm) doRslt_mps_grp_nm_NC(info);
		else if (nc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NC(info);
		else if (nc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NC(info);
		else if (nc == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NC(info);
		else if (nc == columnRslt_proc_cd) doRslt_proc_cd_NC(info);
		else if (nc == columnRslt_proc_nm) doRslt_proc_nm_NC(info);
		else if (nc == columnRslt_ym) doRslt_ym_NC(info);
		else if (nc == columnRslt_unit_cd) doRslt_unit_cd_NC(info);
		else if (nc == columnRslt_unit_nm) doRslt_unit_nm_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_row_title_col) doRslt_row_title_col_NC(info);
		else if (nc == columnRslt_row_title_nm) doRslt_row_title_nm_NC(info);
		else if (nc == columnRslt_grp_peg_no) doRslt_grp_peg_no_NC(info);
		else if (nc == columnRslt_record_id) doRslt_record_id_NC(info);
		else if (nc == columnRslt_record_grp_id) doRslt_record_grp_id_NC(info);
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
	 * [Cnd]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mps_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mps_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[strg_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_key_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_pre_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_pre_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_rqmt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_rqmt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_act_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_00_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[rqst_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[row_title_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_col_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[row_title_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[grp_peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_grp_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_grp_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_grp_id_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_ym) doCnd_ym_NE(info);
		else if (ne == Cnd_prod_ym_fr) doCnd_prod_ym_fr_NE(info);
		else if (ne == Cnd_prod_ym_to) doCnd_prod_ym_to_NE(info);
		else if (ne == Cnd_mps_grp_cd) doCnd_mps_grp_cd_NE(info);
		else if (ne == Cnd_mps_grp_nm) doCnd_mps_grp_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_NE(info);
		else if (ne == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_NE(info);
		else if (ne == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NE(info);
		else if (ne == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NE(info);
		else if (ne == Cnd_disp_key_flg) doCnd_disp_key_flg_NE(info);
		else if (ne == Cnd_disp_pre_flg) doCnd_disp_pre_flg_NE(info);
		else if (ne == Cnd_disp_rqmt_flg) doCnd_disp_rqmt_flg_NE(info);
		else if (ne == Cnd_disp_act_flg) doCnd_disp_act_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_disp_00) doRslt_disp_00_NE(info);
		else if (ne == columnRslt_mps_grp_cd) doRslt_mps_grp_cd_NE(info);
		else if (ne == columnRslt_mps_grp_nm) doRslt_mps_grp_nm_NE(info);
		else if (ne == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NE(info);
		else if (ne == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NE(info);
		else if (ne == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NE(info);
		else if (ne == columnRslt_proc_cd) doRslt_proc_cd_NE(info);
		else if (ne == columnRslt_proc_nm) doRslt_proc_nm_NE(info);
		else if (ne == columnRslt_ym) doRslt_ym_NE(info);
		else if (ne == columnRslt_unit_cd) doRslt_unit_cd_NE(info);
		else if (ne == columnRslt_unit_nm) doRslt_unit_nm_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_row_title_col) doRslt_row_title_col_NE(info);
		else if (ne == columnRslt_row_title_nm) doRslt_row_title_nm_NE(info);
		else if (ne == columnRslt_grp_peg_no) doRslt_grp_peg_no_NE(info);
		else if (ne == columnRslt_record_id) doRslt_record_id_NE(info);
		else if (ne == columnRslt_record_grp_id) doRslt_record_grp_id_NE(info);
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
	 * [Cnd]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mps_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mps_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[strg_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_key_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_pre_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_pre_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_rqmt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_rqmt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_act_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_00_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[rqst_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[row_title_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_col_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[row_title_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[grp_peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_grp_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_grp_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_grp_id_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_ym) doCnd_ym_NX(info);
		else if (nx == Cnd_prod_ym_fr) doCnd_prod_ym_fr_NX(info);
		else if (nx == Cnd_prod_ym_to) doCnd_prod_ym_to_NX(info);
		else if (nx == Cnd_mps_grp_cd) doCnd_mps_grp_cd_NX(info);
		else if (nx == Cnd_mps_grp_nm) doCnd_mps_grp_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_NX(info);
		else if (nx == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_NX(info);
		else if (nx == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NX(info);
		else if (nx == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NX(info);
		else if (nx == Cnd_disp_key_flg) doCnd_disp_key_flg_NX(info);
		else if (nx == Cnd_disp_pre_flg) doCnd_disp_pre_flg_NX(info);
		else if (nx == Cnd_disp_rqmt_flg) doCnd_disp_rqmt_flg_NX(info);
		else if (nx == Cnd_disp_act_flg) doCnd_disp_act_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_disp_00) doRslt_disp_00_NX(info);
		else if (nx == columnRslt_mps_grp_cd) doRslt_mps_grp_cd_NX(info);
		else if (nx == columnRslt_mps_grp_nm) doRslt_mps_grp_nm_NX(info);
		else if (nx == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NX(info);
		else if (nx == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NX(info);
		else if (nx == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NX(info);
		else if (nx == columnRslt_proc_cd) doRslt_proc_cd_NX(info);
		else if (nx == columnRslt_proc_nm) doRslt_proc_nm_NX(info);
		else if (nx == columnRslt_ym) doRslt_ym_NX(info);
		else if (nx == columnRslt_unit_cd) doRslt_unit_cd_NX(info);
		else if (nx == columnRslt_unit_nm) doRslt_unit_nm_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_row_title_col) doRslt_row_title_col_NX(info);
		else if (nx == columnRslt_row_title_nm) doRslt_row_title_nm_NX(info);
		else if (nx == columnRslt_grp_peg_no) doRslt_grp_peg_no_NX(info);
		else if (nx == columnRslt_record_id) doRslt_record_id_NX(info);
		else if (nx == columnRslt_record_grp_id) doRslt_record_grp_id_NX(info);
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
	 * [Cnd]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mps_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mps_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[strg_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_key_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_pre_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_pre_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_rqmt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_rqmt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_act_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_00_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[rqst_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[row_title_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_col_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[row_title_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[grp_peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_grp_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_grp_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_grp_id_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ym) doCnd_ym_LC(info);
		else if (lc == Cnd_prod_ym_fr) doCnd_prod_ym_fr_LC(info);
		else if (lc == Cnd_prod_ym_to) doCnd_prod_ym_to_LC(info);
		else if (lc == Cnd_mps_grp_cd) doCnd_mps_grp_cd_LC(info);
		else if (lc == Cnd_mps_grp_nm) doCnd_mps_grp_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_LC(info);
		else if (lc == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_LC(info);
		else if (lc == Cnd_strg_loc_cd) doCnd_strg_loc_cd_LC(info);
		else if (lc == Cnd_strg_loc_nm) doCnd_strg_loc_nm_LC(info);
		else if (lc == columnRslt_disp_00) doRslt_disp_00_LC(info);
		else if (lc == columnRslt_mps_grp_cd) doRslt_mps_grp_cd_LC(info);
		else if (lc == columnRslt_mps_grp_nm) doRslt_mps_grp_nm_LC(info);
		else if (lc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_LC(info);
		else if (lc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_LC(info);
		else if (lc == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_LC(info);
		else if (lc == columnRslt_proc_cd) doRslt_proc_cd_LC(info);
		else if (lc == columnRslt_proc_nm) doRslt_proc_nm_LC(info);
		else if (lc == columnRslt_ym) doRslt_ym_LC(info);
		else if (lc == columnRslt_unit_cd) doRslt_unit_cd_LC(info);
		else if (lc == columnRslt_unit_nm) doRslt_unit_nm_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_row_title_col) doRslt_row_title_col_LC(info);
		else if (lc == columnRslt_row_title_nm) doRslt_row_title_nm_LC(info);
		else if (lc == columnRslt_grp_peg_no) doRslt_grp_peg_no_LC(info);
		else if (lc == columnRslt_record_id) doRslt_record_id_LC(info);
		else if (lc == columnRslt_record_grp_id) doRslt_record_grp_id_LC(info);
	}

	/**
	 * [Cnd]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prod_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prod_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mps_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mps_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[strg_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_00_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[rqst_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[row_title_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_col_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[row_title_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[grp_peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_grp_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_grp_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_grp_id_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_mps_grp_cd]の作成メソッド
	 */
	public MCList getCnd_mps_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getMpsGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_strg_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_strg_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_strg_loc_cd]の作成メソッド
	 */
	public MCList getCnd_strg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL0350.Srch01")) {
			return new MS_MSBCL0350_Srch01Bridge();
		}
		if (id.equals("MS.MSBCL0350.Srch02")) {
			return new MS_MSBCL0350_Srch02Bridge();
		}
		if (id.equals("MS.MSBCL0350.Upd01")) {
			return new MS_MSBCL0350_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL0350_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0350_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0350_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL0350_Srch01Bridge() {
			p_MS_MSBCL0350_Srch01 = new MCParam(PDef.MS_MSBCL0350_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0350_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0350.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0350.PlnR.class));

			p_MS_MSBCL0350_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0350_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0350_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0350_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0350_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0350.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0350.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0350.PlnR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0350.PlnR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0350_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0350.PlnR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0350_Srch01;
		}

		protected void show() {
			setPlnL((MCList<mcframe.clientMSBC.MSBCP0350.PlnR>)p_MS_MSBCL0350_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getPlnL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getPlnL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0350_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0350_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0350_Srch02;

		/** コンストラクタ */
		protected MS_MSBCL0350_Srch02Bridge() {
			p_MS_MSBCL0350_Srch02 = new MCParam(PDef.MS_MSBCL0350_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0350_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0350.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0350.PlnR.class));

			p_MS_MSBCL0350_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0350_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0350_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0350_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0350_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0350.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0350.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0350.PlnR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0350.PlnR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0350_Srch02.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0350.PlnR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0350_Srch02;
		}

		protected void show() {
			setPlnL((MCList<mcframe.clientMSBC.MSBCP0350.PlnR>)p_MS_MSBCL0350_Srch02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getPlnL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getPlnL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0350_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0350_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0350_Upd01;

		/** コンストラクタ */
		protected MS_MSBCL0350_Upd01Bridge() {
			p_MS_MSBCL0350_Upd01 = new MCParam(PDef.MS_MSBCL0350_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0350_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0350.PlnR.class));
			// Down

			p_MS_MSBCL0350_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0350_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0350_Upd01.addUpBlock(getPlnL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0350_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0350_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0350.PlnR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0350.PlnR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBCL0350_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getPlnL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}