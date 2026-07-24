package mcframe.clientMGBG.MGBGP0150;

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
import mcframe.clientMGBG.MGBGP0150.MGBGP_PreAlcRateSrch_MC.MG_MGBGL0150_Srch01Caller;

/**
 * 画面"MGBGP_PreAlcRateSrch"パネルクラスです。<p>
 *
 * 一次配賦比率を参照します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBGP_PreAlcRateSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBGP0150";

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
	 * TERM,View term ratio,0;PLN,View monthly ratio (Plan),1;ACT,View monthly ratio (Result),2;PA,View monthly ratio (Plan/Result),3; TERM,期間比率を参照する,0;PLN,月次比率（計画）を参照する,1;ACT,月次比率（実績）を参照する,2;PA,月次比率（計画実績）を参照する,3;.<p>
	 *
	 */
	public MCButtonGroup Cnd_typ_Group = null;
	public MCRadioButton Cnd_typ_TERM = null;
	public MCRadioButton Cnd_typ_PLN = null;
	public MCRadioButton Cnd_typ_ACT = null;
	public MCRadioButton Cnd_typ_PA = null;
	public mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term_fr;	// [Cnd]の[term_p.term_fr]を[Cnd_term_fr]としてエイリアス定義。
	public MCDateComboBox Cnd_term_to;	// [Cnd]の[term_p.term_to]を[Cnd_term_to]としてエイリアス定義。
	public MCLabel Cnd_calc_ctg_cd_Label = null;
	/**
	 * Period calculation category cd. 期間計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_ctg_cd = null;
	/**
	 * Period calculation category name 期間計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_ctg_nm = null;
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
	public MCLabel Cnd_pln_calc_ctg_cd_Label = null;
	/**
	 * Plan calculation category cd. 計画計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pln_calc_ctg_cd = null;
	/**
	 * Plan calculation category name 計画計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_pln_calc_ctg_nm = null;
	public MCLabel Cnd_act_calc_ctg_cd_Label = null;
	/**
	 * Result calculation category cd. 実績計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_act_calc_ctg_cd = null;
	/**
	 * Result calculation category name 実績計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_act_calc_ctg_nm = null;
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
	public MCLabel Cnd_pre_alc_rate_cd_Label = null;
	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pre_alc_rate_cd = null;
	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public MCTextField Cnd_pre_alc_rate_nm = null;
	public MCLabel Cnd_pre_alc_ptn_cd_Label = null;
	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pre_alc_ptn_cd = null;
	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public MCTextField Cnd_pre_alc_ptn_nm = null;
	/**
	 * Dept. allocation type 部門配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_dpt_alc_typ = null;
	/**
	 * Location allocation type 場所配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_loc_alc_typ = null;
	/**
	 * Operation allocation type 工程配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_oper_alc_typ = null;
	/**
	 * BP allocation type 取引先配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_bp_alc_typ = null;
	/**
	 * Item category allocation type 品群配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_ctg_alc_typ = null;
	/**
	 * Item allocation type 品目配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_itm_alc_typ = null;
	/**
	 * Lot No. allocation type ロットＮＯ配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_lot_alc_typ = null;
	/**
	 * Sublot No. allocation type サブロットＮＯ配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_sublot_alc_typ = null;
	/**
	 * SEIBAN No. 1 allocation type 手配ＮＯ１配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_sno1_alc_typ = null;
	/**
	 * SEIBAN No. 2 allocation type 手配ＮＯ２配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_sno2_alc_typ = null;
	/**
	 * SEIBAN No. 3 allocation type 手配ＮＯ３配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_sno3_alc_typ = null;
	/**
	 * SEIBAN No. 4 allocation type 手配ＮＯ４配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_sno4_alc_typ = null;
	/**
	 * Order allocation type 指図配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_inst_alc_typ = null;
	/**
	 * Invoice allocation type インボイス配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_iv_alc_typ = null;
	/**
	 * PO allocation type 発注配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_po_alc_typ = null;
	/**
	 * Sales order allocation type 受注配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_slo_alc_typ = null;
	/**
	 * Allocation account allocation type 配賦科目配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_alc_ac_alc_typ = null;
	/**
	 * Calculation category allocation type 計算カテゴリ配賦区分.<p>
	 *
	 */
	public MCTextField Cnd_wg_alc_typ = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCColumnGroupTable<mcframe.clientMGBG.MGBGP0150.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_nm = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_nm = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_nm = null;
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
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ctg_cd = null;
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ctg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
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
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_mfg_inst_no = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
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
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_ac_cd = null;
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_ac_nm = null;
	/**
	 * Transfer WG cd. 振替ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_wg_cd = null;
	/**
	 * Transfer WG name 振替ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_wg_nm = null;
	public MCColumnConfig columnRslt_term00 = null;
	public MCColumnConfig columnRslt_term01 = null;
	public MCColumnConfig columnRslt_term02 = null;
	public MCColumnConfig columnRslt_term03 = null;
	public MCColumnConfig columnRslt_term04 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln00 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act00 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln01 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act01 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln02 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act02 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln03 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act03 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln04 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act04 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln05 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act05 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln06 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act06 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln07 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act07 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln08 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act08 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln09 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act09 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln10 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act10 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln11 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act11 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln12 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act12 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln13 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act13 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln14 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act14 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln15 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act15 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln16 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act16 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln17 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act17 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln18 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act18 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln19 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act19 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln20 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act20 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln21 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act21 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln22 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act22 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln23 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act23 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln24 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act24 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln25 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act25 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln26 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act26 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln27 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act27 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln28 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act28 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln29 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act29 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln30 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act30 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln31 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act31 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln32 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act32 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln33 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act33 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln34 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act34 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln35 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act35 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln36 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act36 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln37 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act37 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln38 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act38 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln39 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act39 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln40 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act40 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln41 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act41 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln42 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act42 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln43 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act43 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln44 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act44 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln45 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act45 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln46 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act46 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln47 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act47 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln48 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act48 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln49 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act49 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln50 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act50 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln51 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act51 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln52 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act52 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln53 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act53 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln54 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act54 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln55 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act55 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln56 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act56 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln57 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act57 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln58 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act58 = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pln59 = null;
	/**
	 * Result 実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act59 = null;
	public MCColumnGroup cgRslt_title00 = null;
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
	public MCColumnGroup cgRslt_title31 = null;
	public MCColumnGroup cgRslt_title32 = null;
	public MCColumnGroup cgRslt_title33 = null;
	public MCColumnGroup cgRslt_title34 = null;
	public MCColumnGroup cgRslt_title35 = null;
	public MCColumnGroup cgRslt_title36 = null;
	public MCColumnGroup cgRslt_title37 = null;
	public MCColumnGroup cgRslt_title38 = null;
	public MCColumnGroup cgRslt_title39 = null;
	public MCColumnGroup cgRslt_title40 = null;
	public MCColumnGroup cgRslt_title41 = null;
	public MCColumnGroup cgRslt_title42 = null;
	public MCColumnGroup cgRslt_title43 = null;
	public MCColumnGroup cgRslt_title44 = null;
	public MCColumnGroup cgRslt_title45 = null;
	public MCColumnGroup cgRslt_title46 = null;
	public MCColumnGroup cgRslt_title47 = null;
	public MCColumnGroup cgRslt_title48 = null;
	public MCColumnGroup cgRslt_title49 = null;
	public MCColumnGroup cgRslt_title50 = null;
	public MCColumnGroup cgRslt_title51 = null;
	public MCColumnGroup cgRslt_title52 = null;
	public MCColumnGroup cgRslt_title53 = null;
	public MCColumnGroup cgRslt_title54 = null;
	public MCColumnGroup cgRslt_title55 = null;
	public MCColumnGroup cgRslt_title56 = null;
	public MCColumnGroup cgRslt_title57 = null;
	public MCColumnGroup cgRslt_title58 = null;
	public MCColumnGroup cgRslt_title59 = null;
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
	
	/** [MG_MGBGL0150_Srch01]のCallerの作成 */
	protected MGBGP_PreAlcRateSrch_MC.MG_MGBGL0150_Srch01Caller createMG_MGBGL0150_Srch01() {
		MGBGP_PreAlcRateSrch_MC.MG_MGBGL0150_Srch01Caller<MGBGP_PreAlcRateSrch, MG_MGBGL0150_Srch01Bridge>
		caller = ((MGBGP_PreAlcRateSrch_MC)this).new MG_MGBGL0150_Srch01Caller<MGBGP_PreAlcRateSrch, MG_MGBGL0150_Srch01Bridge>(
					(MGBGP_PreAlcRateSrch)this, new MG_MGBGL0150_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBGL0150_Srch01]の呼び出し */
	protected void callMG_MGBGL0150_Srch01() {
		MCCaller caller = createMG_MGBGL0150_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBG.MGBGP0150.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBG.MGBGP0150.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBG.MGBGP0150.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBG.MGBGP0150.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBG.MGBGP0150.CndR createCndR() {
		return mcframe.clientMGBG.MGBGP0150.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBG.MGBGP0150.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBG.MGBGP0150.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBG.MGBGP0150.RsltR createRsltR() {
		return mcframe.clientMGBG.MGBGP0150.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBG.MGBGP0150.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBG.MGBGP0150.RsltR.class);
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
		ret.add(ScreenOpePanel);
		ret.add(TopPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBGP_PreAlcRateSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBGP_PreAlcRateSrch_MC_A(String name) {
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
		MGBGP_PreAlcRateSrch_MC.jbCreateScreenOpe((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.jbCreateTop((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.jbCreateCnd((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.jbCreateCtrl((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.jbCreateRslt((MGBGP_PreAlcRateSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBGP_PreAlcRateSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBGP_PreAlcRateSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBGP_PreAlcRateSrch p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term_fr = p.Cnd_term_p_PPanel.Term_term_fr;
		p.Cnd_term_fr.addAliasName("Cnd.term_fr", p);
		p.Cnd_term_to = p.Cnd_term_p_PPanel.Term_term_to;
		p.Cnd_term_to.addAliasName("Cnd.term_to", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBGP_PreAlcRateSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBGP_PreAlcRateSrch p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBG.MGBGP0150.RsltR.$itm_p);
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
	
	
	/** [Cnd_pln_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pln_calc_ctg_cd_p = null;

	/**
	 * [Cnd_pln_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pln_calc_ctg_cd_ListPutter() {
		if (Cnd_pln_calc_ctg_cd_p == null) {
			Cnd_pln_calc_ctg_cd_p = createCnd_pln_calc_ctg_cd_ListPutter(Cnd_pln_calc_ctg_cd, "pln_calc_ctg_cd", "pln_calc_ctg_nm");

		}
		return Cnd_pln_calc_ctg_cd_p;
	}
	
	
	/** [Cnd_act_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_act_calc_ctg_cd_p = null;

	/**
	 * [Cnd_act_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_act_calc_ctg_cd_ListPutter() {
		if (Cnd_act_calc_ctg_cd_p == null) {
			Cnd_act_calc_ctg_cd_p = createCnd_act_calc_ctg_cd_ListPutter(Cnd_act_calc_ctg_cd, "act_calc_ctg_cd", "act_calc_ctg_nm");

		}
		return Cnd_act_calc_ctg_cd_p;
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
	
	
	/** [Cnd_pre_alc_rate_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pre_alc_rate_cd_p = null;

	/**
	 * [Cnd_pre_alc_rate_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pre_alc_rate_cd_ListPutter() {
		if (Cnd_pre_alc_rate_cd_p == null) {
			Cnd_pre_alc_rate_cd_p = createCnd_pre_alc_rate_cd_ListPutter(Cnd_pre_alc_rate_cd, "pre_alc_rate_cd", "pre_alc_rate_nm","pre_alc_ptn_cd","pre_alc_ptn_nm","dpt_alc_typ","loc_alc_typ","oper_alc_typ","bp_alc_typ","ctg_alc_typ","itm_alc_typ","lot_alc_typ","sublot_alc_typ","sno1_alc_typ","sno2_alc_typ","sno3_alc_typ","sno4_alc_typ","inst_alc_typ","iv_alc_typ","po_alc_typ","slo_alc_typ","alc_ac_alc_typ","wg_alc_typ");

		}
		return Cnd_pre_alc_rate_cd_p;
	}
	
	
	/** [Cnd_pre_alc_ptn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pre_alc_ptn_cd_p = null;

	/**
	 * [Cnd_pre_alc_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pre_alc_ptn_cd_ListPutter() {
		if (Cnd_pre_alc_ptn_cd_p == null) {
			Cnd_pre_alc_ptn_cd_p = createCnd_pre_alc_ptn_cd_ListPutter(Cnd_pre_alc_ptn_cd, "pre_alc_ptn_cd");

		}
		return Cnd_pre_alc_ptn_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBGP_PreAlcRateSrch create(){
		MGBGP_PreAlcRateSrch p = new MGBGP_PreAlcRateSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBGP_PreAlcRateSrch create(String name){
		MGBGP_PreAlcRateSrch p = new MGBGP_PreAlcRateSrch(name);
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
		MGBGP_PreAlcRateSrch_MC.jbfInitScreenOpe((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.jbfInitTop((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.jbfInitCnd((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.jbfInitCtrl((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.jbfInitRslt((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.jbInitScreenOpe((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.jbInitTop((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.jbInitCnd((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.jbInitCtrl((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.jbInitRslt((MGBGP_PreAlcRateSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBGP_PreAlcRateSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBGP_PreAlcRateSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBGP_PreAlcRateSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_typ_Group = p.beansFactory.createButtonGroup("Cnd.typ");
		p.Cnd_typ_TERM = p.beansFactory.createRadioButton("Cnd.typ_TERM");
		p.Cnd_typ_PLN = p.beansFactory.createRadioButton("Cnd.typ_PLN");
		p.Cnd_typ_ACT = p.beansFactory.createRadioButton("Cnd.typ_ACT");
		p.Cnd_typ_PA = p.beansFactory.createRadioButton("Cnd.typ_PA");
		p.Cnd_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.calc_ctg_cd_Label");
		p.Cnd_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.calc_ctg_cd");
		p.Cnd_calc_ctg_cd.setLabel(p.Cnd_calc_ctg_cd_Label);
		p.Cnd_calc_ctg_nm = p.beansFactory.createTextField("Cnd.calc_ctg_nm");
		p.Cnd_ym_fr_Label = p.beansFactory.createLabel("Cnd.ym_fr_Label");
		p.Cnd_ym_fr = p.beansFactory.createDateField("Cnd.ym_fr");
		p.Cnd_ym_fr.setLabel(p.Cnd_ym_fr_Label);
		p.Cnd_ym_to_Label = p.beansFactory.createLabel("Cnd.ym_to_Label");
		p.Cnd_ym_to = p.beansFactory.createDateField("Cnd.ym_to");
		p.Cnd_ym_to.setLabel(p.Cnd_ym_to_Label);
		p.Cnd_pln_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.pln_calc_ctg_cd_Label");
		p.Cnd_pln_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.pln_calc_ctg_cd");
		p.Cnd_pln_calc_ctg_cd.setLabel(p.Cnd_pln_calc_ctg_cd_Label);
		p.Cnd_pln_calc_ctg_nm = p.beansFactory.createTextField("Cnd.pln_calc_ctg_nm");
		p.Cnd_act_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.act_calc_ctg_cd_Label");
		p.Cnd_act_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.act_calc_ctg_cd");
		p.Cnd_act_calc_ctg_cd.setLabel(p.Cnd_act_calc_ctg_cd_Label);
		p.Cnd_act_calc_ctg_nm = p.beansFactory.createTextField("Cnd.act_calc_ctg_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_pre_alc_rate_cd_Label = p.beansFactory.createLabel("Cnd.pre_alc_rate_cd_Label");
		p.Cnd_pre_alc_rate_cd = p.beansFactory.createTextComboBox("Cnd.pre_alc_rate_cd");
		p.Cnd_pre_alc_rate_cd.setLabel(p.Cnd_pre_alc_rate_cd_Label);
		p.Cnd_pre_alc_rate_nm = p.beansFactory.createTextField("Cnd.pre_alc_rate_nm");
		p.Cnd_pre_alc_ptn_cd_Label = p.beansFactory.createLabel("Cnd.pre_alc_ptn_cd_Label");
		p.Cnd_pre_alc_ptn_cd = p.beansFactory.createTextComboBox("Cnd.pre_alc_ptn_cd");
		p.Cnd_pre_alc_ptn_cd.setLabel(p.Cnd_pre_alc_ptn_cd_Label);
		p.Cnd_pre_alc_ptn_nm = p.beansFactory.createTextField("Cnd.pre_alc_ptn_nm");
		p.Cnd_dpt_alc_typ = p.beansFactory.createTextField("Cnd.dpt_alc_typ");
		p.Cnd_loc_alc_typ = p.beansFactory.createTextField("Cnd.loc_alc_typ");
		p.Cnd_oper_alc_typ = p.beansFactory.createTextField("Cnd.oper_alc_typ");
		p.Cnd_bp_alc_typ = p.beansFactory.createTextField("Cnd.bp_alc_typ");
		p.Cnd_ctg_alc_typ = p.beansFactory.createTextField("Cnd.ctg_alc_typ");
		p.Cnd_itm_alc_typ = p.beansFactory.createTextField("Cnd.itm_alc_typ");
		p.Cnd_lot_alc_typ = p.beansFactory.createTextField("Cnd.lot_alc_typ");
		p.Cnd_sublot_alc_typ = p.beansFactory.createTextField("Cnd.sublot_alc_typ");
		p.Cnd_sno1_alc_typ = p.beansFactory.createTextField("Cnd.sno1_alc_typ");
		p.Cnd_sno2_alc_typ = p.beansFactory.createTextField("Cnd.sno2_alc_typ");
		p.Cnd_sno3_alc_typ = p.beansFactory.createTextField("Cnd.sno3_alc_typ");
		p.Cnd_sno4_alc_typ = p.beansFactory.createTextField("Cnd.sno4_alc_typ");
		p.Cnd_inst_alc_typ = p.beansFactory.createTextField("Cnd.inst_alc_typ");
		p.Cnd_iv_alc_typ = p.beansFactory.createTextField("Cnd.iv_alc_typ");
		p.Cnd_po_alc_typ = p.beansFactory.createTextField("Cnd.po_alc_typ");
		p.Cnd_slo_alc_typ = p.beansFactory.createTextField("Cnd.slo_alc_typ");
		p.Cnd_alc_ac_alc_typ = p.beansFactory.createTextField("Cnd.alc_ac_alc_typ");
		p.Cnd_wg_alc_typ = p.beansFactory.createTextField("Cnd.wg_alc_typ");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBGP_PreAlcRateSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBGP_PreAlcRateSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_oper_cd = p.beansFactory.createTableColumn("Rslt.oper_cd", MCColumnType.TEXT);
		p.columnRslt_oper_nm = p.beansFactory.createTableColumn("Rslt.oper_nm", MCColumnType.TEXT);
		p.columnRslt_bp_cd = p.beansFactory.createTableColumn("Rslt.bp_cd", MCColumnType.TEXT);
		p.columnRslt_bp_nm = p.beansFactory.createTableColumn("Rslt.bp_nm", MCColumnType.TEXT);
		p.columnRslt_ctg_cd = p.beansFactory.createTableColumn("Rslt.ctg_cd", MCColumnType.TEXT);
		p.columnRslt_ctg_nm = p.beansFactory.createTableColumn("Rslt.ctg_nm", MCColumnType.TEXT);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_sno1 = p.beansFactory.createTableColumn("Rslt.sno1", MCColumnType.TEXT);
		p.columnRslt_sno2 = p.beansFactory.createTableColumn("Rslt.sno2", MCColumnType.TEXT);
		p.columnRslt_sno3 = p.beansFactory.createTableColumn("Rslt.sno3", MCColumnType.TEXT);
		p.columnRslt_sno4 = p.beansFactory.createTableColumn("Rslt.sno4", MCColumnType.TEXT);
		p.columnRslt_itm_mfg_inst_no = p.beansFactory.createTableColumn("Rslt.itm_mfg_inst_no", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_po_no = p.beansFactory.createTableColumn("Rslt.po_no", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_alc_ac_cd = p.beansFactory.createTableColumn("Rslt.alc_ac_cd", MCColumnType.TEXT);
		p.columnRslt_alc_ac_nm = p.beansFactory.createTableColumn("Rslt.alc_ac_nm", MCColumnType.TEXT);
		p.columnRslt_trd_wg_cd = p.beansFactory.createTableColumn("Rslt.trd_wg_cd", MCColumnType.TEXT);
		p.columnRslt_trd_wg_nm = p.beansFactory.createTableColumn("Rslt.trd_wg_nm", MCColumnType.TEXT);
		p.columnRslt_term00 = p.beansFactory.createTableColumn("Rslt.term00", MCColumnType.NUMBER);
		p.columnRslt_term01 = p.beansFactory.createTableColumn("Rslt.term01", MCColumnType.NUMBER);
		p.columnRslt_term02 = p.beansFactory.createTableColumn("Rslt.term02", MCColumnType.NUMBER);
		p.columnRslt_term03 = p.beansFactory.createTableColumn("Rslt.term03", MCColumnType.NUMBER);
		p.columnRslt_term04 = p.beansFactory.createTableColumn("Rslt.term04", MCColumnType.NUMBER);
		p.columnRslt_pln00 = p.beansFactory.createTableColumn("Rslt.pln00", MCColumnType.NUMBER);
		p.columnRslt_act00 = p.beansFactory.createTableColumn("Rslt.act00", MCColumnType.NUMBER);
		p.columnRslt_pln01 = p.beansFactory.createTableColumn("Rslt.pln01", MCColumnType.NUMBER);
		p.columnRslt_act01 = p.beansFactory.createTableColumn("Rslt.act01", MCColumnType.NUMBER);
		p.columnRslt_pln02 = p.beansFactory.createTableColumn("Rslt.pln02", MCColumnType.NUMBER);
		p.columnRslt_act02 = p.beansFactory.createTableColumn("Rslt.act02", MCColumnType.NUMBER);
		p.columnRslt_pln03 = p.beansFactory.createTableColumn("Rslt.pln03", MCColumnType.NUMBER);
		p.columnRslt_act03 = p.beansFactory.createTableColumn("Rslt.act03", MCColumnType.NUMBER);
		p.columnRslt_pln04 = p.beansFactory.createTableColumn("Rslt.pln04", MCColumnType.NUMBER);
		p.columnRslt_act04 = p.beansFactory.createTableColumn("Rslt.act04", MCColumnType.NUMBER);
		p.columnRslt_pln05 = p.beansFactory.createTableColumn("Rslt.pln05", MCColumnType.NUMBER);
		p.columnRslt_act05 = p.beansFactory.createTableColumn("Rslt.act05", MCColumnType.NUMBER);
		p.columnRslt_pln06 = p.beansFactory.createTableColumn("Rslt.pln06", MCColumnType.NUMBER);
		p.columnRslt_act06 = p.beansFactory.createTableColumn("Rslt.act06", MCColumnType.NUMBER);
		p.columnRslt_pln07 = p.beansFactory.createTableColumn("Rslt.pln07", MCColumnType.NUMBER);
		p.columnRslt_act07 = p.beansFactory.createTableColumn("Rslt.act07", MCColumnType.NUMBER);
		p.columnRslt_pln08 = p.beansFactory.createTableColumn("Rslt.pln08", MCColumnType.NUMBER);
		p.columnRslt_act08 = p.beansFactory.createTableColumn("Rslt.act08", MCColumnType.NUMBER);
		p.columnRslt_pln09 = p.beansFactory.createTableColumn("Rslt.pln09", MCColumnType.NUMBER);
		p.columnRslt_act09 = p.beansFactory.createTableColumn("Rslt.act09", MCColumnType.NUMBER);
		p.columnRslt_pln10 = p.beansFactory.createTableColumn("Rslt.pln10", MCColumnType.NUMBER);
		p.columnRslt_act10 = p.beansFactory.createTableColumn("Rslt.act10", MCColumnType.NUMBER);
		p.columnRslt_pln11 = p.beansFactory.createTableColumn("Rslt.pln11", MCColumnType.NUMBER);
		p.columnRslt_act11 = p.beansFactory.createTableColumn("Rslt.act11", MCColumnType.NUMBER);
		p.columnRslt_pln12 = p.beansFactory.createTableColumn("Rslt.pln12", MCColumnType.NUMBER);
		p.columnRslt_act12 = p.beansFactory.createTableColumn("Rslt.act12", MCColumnType.NUMBER);
		p.columnRslt_pln13 = p.beansFactory.createTableColumn("Rslt.pln13", MCColumnType.NUMBER);
		p.columnRslt_act13 = p.beansFactory.createTableColumn("Rslt.act13", MCColumnType.NUMBER);
		p.columnRslt_pln14 = p.beansFactory.createTableColumn("Rslt.pln14", MCColumnType.NUMBER);
		p.columnRslt_act14 = p.beansFactory.createTableColumn("Rslt.act14", MCColumnType.NUMBER);
		p.columnRslt_pln15 = p.beansFactory.createTableColumn("Rslt.pln15", MCColumnType.NUMBER);
		p.columnRslt_act15 = p.beansFactory.createTableColumn("Rslt.act15", MCColumnType.NUMBER);
		p.columnRslt_pln16 = p.beansFactory.createTableColumn("Rslt.pln16", MCColumnType.NUMBER);
		p.columnRslt_act16 = p.beansFactory.createTableColumn("Rslt.act16", MCColumnType.NUMBER);
		p.columnRslt_pln17 = p.beansFactory.createTableColumn("Rslt.pln17", MCColumnType.NUMBER);
		p.columnRslt_act17 = p.beansFactory.createTableColumn("Rslt.act17", MCColumnType.NUMBER);
		p.columnRslt_pln18 = p.beansFactory.createTableColumn("Rslt.pln18", MCColumnType.NUMBER);
		p.columnRslt_act18 = p.beansFactory.createTableColumn("Rslt.act18", MCColumnType.NUMBER);
		p.columnRslt_pln19 = p.beansFactory.createTableColumn("Rslt.pln19", MCColumnType.NUMBER);
		p.columnRslt_act19 = p.beansFactory.createTableColumn("Rslt.act19", MCColumnType.NUMBER);
		p.columnRslt_pln20 = p.beansFactory.createTableColumn("Rslt.pln20", MCColumnType.NUMBER);
		p.columnRslt_act20 = p.beansFactory.createTableColumn("Rslt.act20", MCColumnType.NUMBER);
		p.columnRslt_pln21 = p.beansFactory.createTableColumn("Rslt.pln21", MCColumnType.NUMBER);
		p.columnRslt_act21 = p.beansFactory.createTableColumn("Rslt.act21", MCColumnType.NUMBER);
		p.columnRslt_pln22 = p.beansFactory.createTableColumn("Rslt.pln22", MCColumnType.NUMBER);
		p.columnRslt_act22 = p.beansFactory.createTableColumn("Rslt.act22", MCColumnType.NUMBER);
		p.columnRslt_pln23 = p.beansFactory.createTableColumn("Rslt.pln23", MCColumnType.NUMBER);
		p.columnRslt_act23 = p.beansFactory.createTableColumn("Rslt.act23", MCColumnType.NUMBER);
		p.columnRslt_pln24 = p.beansFactory.createTableColumn("Rslt.pln24", MCColumnType.NUMBER);
		p.columnRslt_act24 = p.beansFactory.createTableColumn("Rslt.act24", MCColumnType.NUMBER);
		p.columnRslt_pln25 = p.beansFactory.createTableColumn("Rslt.pln25", MCColumnType.NUMBER);
		p.columnRslt_act25 = p.beansFactory.createTableColumn("Rslt.act25", MCColumnType.NUMBER);
		p.columnRslt_pln26 = p.beansFactory.createTableColumn("Rslt.pln26", MCColumnType.NUMBER);
		p.columnRslt_act26 = p.beansFactory.createTableColumn("Rslt.act26", MCColumnType.NUMBER);
		p.columnRslt_pln27 = p.beansFactory.createTableColumn("Rslt.pln27", MCColumnType.NUMBER);
		p.columnRslt_act27 = p.beansFactory.createTableColumn("Rslt.act27", MCColumnType.NUMBER);
		p.columnRslt_pln28 = p.beansFactory.createTableColumn("Rslt.pln28", MCColumnType.NUMBER);
		p.columnRslt_act28 = p.beansFactory.createTableColumn("Rslt.act28", MCColumnType.NUMBER);
		p.columnRslt_pln29 = p.beansFactory.createTableColumn("Rslt.pln29", MCColumnType.NUMBER);
		p.columnRslt_act29 = p.beansFactory.createTableColumn("Rslt.act29", MCColumnType.NUMBER);
		p.columnRslt_pln30 = p.beansFactory.createTableColumn("Rslt.pln30", MCColumnType.NUMBER);
		p.columnRslt_act30 = p.beansFactory.createTableColumn("Rslt.act30", MCColumnType.NUMBER);
		p.columnRslt_pln31 = p.beansFactory.createTableColumn("Rslt.pln31", MCColumnType.NUMBER);
		p.columnRslt_act31 = p.beansFactory.createTableColumn("Rslt.act31", MCColumnType.NUMBER);
		p.columnRslt_pln32 = p.beansFactory.createTableColumn("Rslt.pln32", MCColumnType.NUMBER);
		p.columnRslt_act32 = p.beansFactory.createTableColumn("Rslt.act32", MCColumnType.NUMBER);
		p.columnRslt_pln33 = p.beansFactory.createTableColumn("Rslt.pln33", MCColumnType.NUMBER);
		p.columnRslt_act33 = p.beansFactory.createTableColumn("Rslt.act33", MCColumnType.NUMBER);
		p.columnRslt_pln34 = p.beansFactory.createTableColumn("Rslt.pln34", MCColumnType.NUMBER);
		p.columnRslt_act34 = p.beansFactory.createTableColumn("Rslt.act34", MCColumnType.NUMBER);
		p.columnRslt_pln35 = p.beansFactory.createTableColumn("Rslt.pln35", MCColumnType.NUMBER);
		p.columnRslt_act35 = p.beansFactory.createTableColumn("Rslt.act35", MCColumnType.NUMBER);
		p.columnRslt_pln36 = p.beansFactory.createTableColumn("Rslt.pln36", MCColumnType.NUMBER);
		p.columnRslt_act36 = p.beansFactory.createTableColumn("Rslt.act36", MCColumnType.NUMBER);
		p.columnRslt_pln37 = p.beansFactory.createTableColumn("Rslt.pln37", MCColumnType.NUMBER);
		p.columnRslt_act37 = p.beansFactory.createTableColumn("Rslt.act37", MCColumnType.NUMBER);
		p.columnRslt_pln38 = p.beansFactory.createTableColumn("Rslt.pln38", MCColumnType.NUMBER);
		p.columnRslt_act38 = p.beansFactory.createTableColumn("Rslt.act38", MCColumnType.NUMBER);
		p.columnRslt_pln39 = p.beansFactory.createTableColumn("Rslt.pln39", MCColumnType.NUMBER);
		p.columnRslt_act39 = p.beansFactory.createTableColumn("Rslt.act39", MCColumnType.NUMBER);
		p.columnRslt_pln40 = p.beansFactory.createTableColumn("Rslt.pln40", MCColumnType.NUMBER);
		p.columnRslt_act40 = p.beansFactory.createTableColumn("Rslt.act40", MCColumnType.NUMBER);
		p.columnRslt_pln41 = p.beansFactory.createTableColumn("Rslt.pln41", MCColumnType.NUMBER);
		p.columnRslt_act41 = p.beansFactory.createTableColumn("Rslt.act41", MCColumnType.NUMBER);
		p.columnRslt_pln42 = p.beansFactory.createTableColumn("Rslt.pln42", MCColumnType.NUMBER);
		p.columnRslt_act42 = p.beansFactory.createTableColumn("Rslt.act42", MCColumnType.NUMBER);
		p.columnRslt_pln43 = p.beansFactory.createTableColumn("Rslt.pln43", MCColumnType.NUMBER);
		p.columnRslt_act43 = p.beansFactory.createTableColumn("Rslt.act43", MCColumnType.NUMBER);
		p.columnRslt_pln44 = p.beansFactory.createTableColumn("Rslt.pln44", MCColumnType.NUMBER);
		p.columnRslt_act44 = p.beansFactory.createTableColumn("Rslt.act44", MCColumnType.NUMBER);
		p.columnRslt_pln45 = p.beansFactory.createTableColumn("Rslt.pln45", MCColumnType.NUMBER);
		p.columnRslt_act45 = p.beansFactory.createTableColumn("Rslt.act45", MCColumnType.NUMBER);
		p.columnRslt_pln46 = p.beansFactory.createTableColumn("Rslt.pln46", MCColumnType.NUMBER);
		p.columnRslt_act46 = p.beansFactory.createTableColumn("Rslt.act46", MCColumnType.NUMBER);
		p.columnRslt_pln47 = p.beansFactory.createTableColumn("Rslt.pln47", MCColumnType.NUMBER);
		p.columnRslt_act47 = p.beansFactory.createTableColumn("Rslt.act47", MCColumnType.NUMBER);
		p.columnRslt_pln48 = p.beansFactory.createTableColumn("Rslt.pln48", MCColumnType.NUMBER);
		p.columnRslt_act48 = p.beansFactory.createTableColumn("Rslt.act48", MCColumnType.NUMBER);
		p.columnRslt_pln49 = p.beansFactory.createTableColumn("Rslt.pln49", MCColumnType.NUMBER);
		p.columnRslt_act49 = p.beansFactory.createTableColumn("Rslt.act49", MCColumnType.NUMBER);
		p.columnRslt_pln50 = p.beansFactory.createTableColumn("Rslt.pln50", MCColumnType.NUMBER);
		p.columnRslt_act50 = p.beansFactory.createTableColumn("Rslt.act50", MCColumnType.NUMBER);
		p.columnRslt_pln51 = p.beansFactory.createTableColumn("Rslt.pln51", MCColumnType.NUMBER);
		p.columnRslt_act51 = p.beansFactory.createTableColumn("Rslt.act51", MCColumnType.NUMBER);
		p.columnRslt_pln52 = p.beansFactory.createTableColumn("Rslt.pln52", MCColumnType.NUMBER);
		p.columnRslt_act52 = p.beansFactory.createTableColumn("Rslt.act52", MCColumnType.NUMBER);
		p.columnRslt_pln53 = p.beansFactory.createTableColumn("Rslt.pln53", MCColumnType.NUMBER);
		p.columnRslt_act53 = p.beansFactory.createTableColumn("Rslt.act53", MCColumnType.NUMBER);
		p.columnRslt_pln54 = p.beansFactory.createTableColumn("Rslt.pln54", MCColumnType.NUMBER);
		p.columnRslt_act54 = p.beansFactory.createTableColumn("Rslt.act54", MCColumnType.NUMBER);
		p.columnRslt_pln55 = p.beansFactory.createTableColumn("Rslt.pln55", MCColumnType.NUMBER);
		p.columnRslt_act55 = p.beansFactory.createTableColumn("Rslt.act55", MCColumnType.NUMBER);
		p.columnRslt_pln56 = p.beansFactory.createTableColumn("Rslt.pln56", MCColumnType.NUMBER);
		p.columnRslt_act56 = p.beansFactory.createTableColumn("Rslt.act56", MCColumnType.NUMBER);
		p.columnRslt_pln57 = p.beansFactory.createTableColumn("Rslt.pln57", MCColumnType.NUMBER);
		p.columnRslt_act57 = p.beansFactory.createTableColumn("Rslt.act57", MCColumnType.NUMBER);
		p.columnRslt_pln58 = p.beansFactory.createTableColumn("Rslt.pln58", MCColumnType.NUMBER);
		p.columnRslt_act58 = p.beansFactory.createTableColumn("Rslt.act58", MCColumnType.NUMBER);
		p.columnRslt_pln59 = p.beansFactory.createTableColumn("Rslt.pln59", MCColumnType.NUMBER);
		p.columnRslt_act59 = p.beansFactory.createTableColumn("Rslt.act59", MCColumnType.NUMBER);
		p.cgRslt_title00 = p.beansFactory.createColumnGroup("Rslt.title00");
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
		p.cgRslt_title31 = p.beansFactory.createColumnGroup("Rslt.title31");
		p.cgRslt_title32 = p.beansFactory.createColumnGroup("Rslt.title32");
		p.cgRslt_title33 = p.beansFactory.createColumnGroup("Rslt.title33");
		p.cgRslt_title34 = p.beansFactory.createColumnGroup("Rslt.title34");
		p.cgRslt_title35 = p.beansFactory.createColumnGroup("Rslt.title35");
		p.cgRslt_title36 = p.beansFactory.createColumnGroup("Rslt.title36");
		p.cgRslt_title37 = p.beansFactory.createColumnGroup("Rslt.title37");
		p.cgRslt_title38 = p.beansFactory.createColumnGroup("Rslt.title38");
		p.cgRslt_title39 = p.beansFactory.createColumnGroup("Rslt.title39");
		p.cgRslt_title40 = p.beansFactory.createColumnGroup("Rslt.title40");
		p.cgRslt_title41 = p.beansFactory.createColumnGroup("Rslt.title41");
		p.cgRslt_title42 = p.beansFactory.createColumnGroup("Rslt.title42");
		p.cgRslt_title43 = p.beansFactory.createColumnGroup("Rslt.title43");
		p.cgRslt_title44 = p.beansFactory.createColumnGroup("Rslt.title44");
		p.cgRslt_title45 = p.beansFactory.createColumnGroup("Rslt.title45");
		p.cgRslt_title46 = p.beansFactory.createColumnGroup("Rslt.title46");
		p.cgRslt_title47 = p.beansFactory.createColumnGroup("Rslt.title47");
		p.cgRslt_title48 = p.beansFactory.createColumnGroup("Rslt.title48");
		p.cgRslt_title49 = p.beansFactory.createColumnGroup("Rslt.title49");
		p.cgRslt_title50 = p.beansFactory.createColumnGroup("Rslt.title50");
		p.cgRslt_title51 = p.beansFactory.createColumnGroup("Rslt.title51");
		p.cgRslt_title52 = p.beansFactory.createColumnGroup("Rslt.title52");
		p.cgRslt_title53 = p.beansFactory.createColumnGroup("Rslt.title53");
		p.cgRslt_title54 = p.beansFactory.createColumnGroup("Rslt.title54");
		p.cgRslt_title55 = p.beansFactory.createColumnGroup("Rslt.title55");
		p.cgRslt_title56 = p.beansFactory.createColumnGroup("Rslt.title56");
		p.cgRslt_title57 = p.beansFactory.createColumnGroup("Rslt.title57");
		p.cgRslt_title58 = p.beansFactory.createColumnGroup("Rslt.title58");
		p.cgRslt_title59 = p.beansFactory.createColumnGroup("Rslt.title59");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBGP_PreAlcRateSrch p) {
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
	protected static void jbInitTop(MGBGP_PreAlcRateSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.CndPanel, null);
		p.TopPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBGP_PreAlcRateSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_typ_Group);
		p.Cnd_typ_Group.setFirstBeans(p.Cnd_typ_TERM);
		p.Cnd_typ_TERM.setActionCommand("0");
		p.Cnd_typ_Group.add(p.Cnd_typ_TERM);
		p.ScreenOpePanel.add(p.Cnd_typ_TERM);
		p.Cnd_typ_TERM.setNextBeans(p.Cnd_typ_PLN);
		p.Cnd_typ_PLN.setActionCommand("1");
		p.Cnd_typ_Group.add(p.Cnd_typ_PLN);
		p.ScreenOpePanel.add(p.Cnd_typ_PLN);
		p.Cnd_typ_PLN.setNextBeans(p.Cnd_typ_ACT);
		p.Cnd_typ_ACT.setActionCommand("2");
		p.Cnd_typ_Group.add(p.Cnd_typ_ACT);
		p.ScreenOpePanel.add(p.Cnd_typ_ACT);
		p.Cnd_typ_ACT.setNextBeans(p.Cnd_typ_PA);
		p.Cnd_typ_PA.setActionCommand("3");
		p.Cnd_typ_Group.add(p.Cnd_typ_PA);
		p.ScreenOpePanel.add(p.Cnd_typ_PA);
		p.Cnd_typ_Group.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.typ_META);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_calc_ctg_cd);
		p.Cnd_term_p_PPanel.Term_term_fr.setListType(MCListType.FREE);
		p.Cnd_term_p_PPanel.Term_term_to.setListType(MCListType.FREE);
		p.Cnd_calc_ctg_cd.setListType(MCListType.FREE);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_ym_fr);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.calc_ctg_nm_META);
		p.CndPanel.add(p.Cnd_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ym_fr);
		p.Cnd_ym_fr.setNextBeans(p.Cnd_ym_to);
		p.Cnd_ym_fr.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.ym_fr_META);
		p.Cnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ym_to_Label);
		p.CndPanel.add(p.Cnd_ym_to);
		p.Cnd_ym_to.setNextBeans(p.Cnd_pln_calc_ctg_cd);
		p.Cnd_ym_to.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.ym_to_META);
		p.Cnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_pln_calc_ctg_cd.setListType(MCListType.FREE);
		p.Cnd_pln_calc_ctg_cd.setLinkBeans(p.Cnd_pln_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_pln_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_pln_calc_ctg_cd);
		p.Cnd_pln_calc_ctg_cd.setNextBeans(p.Cnd_pln_calc_ctg_nm);
		p.Cnd_pln_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.pln_calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_pln_calc_ctg_nm);
		p.Cnd_pln_calc_ctg_nm.setNextBeans(p.Cnd_act_calc_ctg_cd);
		p.Cnd_pln_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.pln_calc_ctg_nm_META);
		p.Cnd_act_calc_ctg_cd.setListType(MCListType.FREE);
		p.Cnd_act_calc_ctg_cd.setLinkBeans(p.Cnd_act_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_act_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_act_calc_ctg_cd);
		p.Cnd_act_calc_ctg_cd.setNextBeans(p.Cnd_act_calc_ctg_nm);
		p.Cnd_act_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.act_calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_act_calc_ctg_nm);
		p.Cnd_act_calc_ctg_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_act_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.act_calc_ctg_nm_META);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_pre_alc_rate_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.wg_nm_META);
		p.Cnd_pre_alc_rate_cd.setListType(MCListType.FREE);
		p.Cnd_pre_alc_rate_cd.setLinkBeans(p.Cnd_pre_alc_rate_nm,p.Cnd_pre_alc_ptn_cd,p.Cnd_pre_alc_ptn_nm,p.Cnd_dpt_alc_typ,p.Cnd_loc_alc_typ,p.Cnd_oper_alc_typ,p.Cnd_bp_alc_typ,p.Cnd_ctg_alc_typ,p.Cnd_itm_alc_typ,p.Cnd_lot_alc_typ,p.Cnd_sublot_alc_typ,p.Cnd_sno1_alc_typ,p.Cnd_sno2_alc_typ,p.Cnd_sno3_alc_typ,p.Cnd_sno4_alc_typ,p.Cnd_inst_alc_typ,p.Cnd_iv_alc_typ,p.Cnd_po_alc_typ,p.Cnd_slo_alc_typ,p.Cnd_alc_ac_alc_typ,p.Cnd_wg_alc_typ);
		p.CndPanel.add(p.Cnd_pre_alc_rate_cd_Label);
		p.CndPanel.add(p.Cnd_pre_alc_rate_cd);
		p.Cnd_pre_alc_rate_cd.setNextBeans(p.Cnd_pre_alc_rate_nm);
		p.Cnd_pre_alc_rate_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.pre_alc_rate_cd_META);
		p.CndPanel.add(p.Cnd_pre_alc_rate_nm);
		p.Cnd_pre_alc_rate_nm.setNextBeans(p.Cnd_pre_alc_ptn_cd);
		p.Cnd_pre_alc_rate_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.pre_alc_rate_nm_META);
		p.Cnd_pre_alc_ptn_cd.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_pre_alc_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_pre_alc_ptn_cd);
		p.Cnd_pre_alc_ptn_cd.setNextBeans(p.Cnd_pre_alc_ptn_nm);
		p.Cnd_pre_alc_ptn_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.pre_alc_ptn_cd_META);
		p.CndPanel.add(p.Cnd_pre_alc_ptn_nm);
		p.Cnd_pre_alc_ptn_nm.setNextBeans(p.Cnd_dpt_alc_typ);
		p.Cnd_pre_alc_ptn_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.pre_alc_ptn_nm_META);
		p.CndPanel.add(p.Cnd_dpt_alc_typ);
		p.Cnd_dpt_alc_typ.setNextBeans(p.Cnd_loc_alc_typ);
		p.Cnd_dpt_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.dpt_alc_typ_META);
		p.CndPanel.add(p.Cnd_loc_alc_typ);
		p.Cnd_loc_alc_typ.setNextBeans(p.Cnd_oper_alc_typ);
		p.Cnd_loc_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.loc_alc_typ_META);
		p.CndPanel.add(p.Cnd_oper_alc_typ);
		p.Cnd_oper_alc_typ.setNextBeans(p.Cnd_bp_alc_typ);
		p.Cnd_oper_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.oper_alc_typ_META);
		p.CndPanel.add(p.Cnd_bp_alc_typ);
		p.Cnd_bp_alc_typ.setNextBeans(p.Cnd_ctg_alc_typ);
		p.Cnd_bp_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.bp_alc_typ_META);
		p.CndPanel.add(p.Cnd_ctg_alc_typ);
		p.Cnd_ctg_alc_typ.setNextBeans(p.Cnd_itm_alc_typ);
		p.Cnd_ctg_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.ctg_alc_typ_META);
		p.CndPanel.add(p.Cnd_itm_alc_typ);
		p.Cnd_itm_alc_typ.setNextBeans(p.Cnd_lot_alc_typ);
		p.Cnd_itm_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.itm_alc_typ_META);
		p.CndPanel.add(p.Cnd_lot_alc_typ);
		p.Cnd_lot_alc_typ.setNextBeans(p.Cnd_sublot_alc_typ);
		p.Cnd_lot_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.lot_alc_typ_META);
		p.CndPanel.add(p.Cnd_sublot_alc_typ);
		p.Cnd_sublot_alc_typ.setNextBeans(p.Cnd_sno1_alc_typ);
		p.Cnd_sublot_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.sublot_alc_typ_META);
		p.CndPanel.add(p.Cnd_sno1_alc_typ);
		p.Cnd_sno1_alc_typ.setNextBeans(p.Cnd_sno2_alc_typ);
		p.Cnd_sno1_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.sno1_alc_typ_META);
		p.CndPanel.add(p.Cnd_sno2_alc_typ);
		p.Cnd_sno2_alc_typ.setNextBeans(p.Cnd_sno3_alc_typ);
		p.Cnd_sno2_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.sno2_alc_typ_META);
		p.CndPanel.add(p.Cnd_sno3_alc_typ);
		p.Cnd_sno3_alc_typ.setNextBeans(p.Cnd_sno4_alc_typ);
		p.Cnd_sno3_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.sno3_alc_typ_META);
		p.CndPanel.add(p.Cnd_sno4_alc_typ);
		p.Cnd_sno4_alc_typ.setNextBeans(p.Cnd_inst_alc_typ);
		p.Cnd_sno4_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.sno4_alc_typ_META);
		p.CndPanel.add(p.Cnd_inst_alc_typ);
		p.Cnd_inst_alc_typ.setNextBeans(p.Cnd_iv_alc_typ);
		p.Cnd_inst_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.inst_alc_typ_META);
		p.CndPanel.add(p.Cnd_iv_alc_typ);
		p.Cnd_iv_alc_typ.setNextBeans(p.Cnd_po_alc_typ);
		p.Cnd_iv_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.iv_alc_typ_META);
		p.CndPanel.add(p.Cnd_po_alc_typ);
		p.Cnd_po_alc_typ.setNextBeans(p.Cnd_slo_alc_typ);
		p.Cnd_po_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.po_alc_typ_META);
		p.CndPanel.add(p.Cnd_slo_alc_typ);
		p.Cnd_slo_alc_typ.setNextBeans(p.Cnd_alc_ac_alc_typ);
		p.Cnd_slo_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.slo_alc_typ_META);
		p.CndPanel.add(p.Cnd_alc_ac_alc_typ);
		p.Cnd_alc_ac_alc_typ.setNextBeans(p.Cnd_wg_alc_typ);
		p.Cnd_alc_ac_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.alc_ac_alc_typ_META);
		p.CndPanel.add(p.Cnd_wg_alc_typ);
		p.Cnd_wg_alc_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0150.CndR.wg_alc_typ_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBGP_PreAlcRateSrch p) {
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
	protected static void jbInitRslt(MGBGP_PreAlcRateSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
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
		MGBGP_PreAlcRateSrch_MC.mcInitScreenOpe((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.mcInitTop((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.mcInitCnd((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.mcInitCtrl((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.mcInitRslt((MGBGP_PreAlcRateSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBGP_PreAlcRateSrch_MC.statusInitSRCH_ScreenOpe((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.statusInitSRCH_Top((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.statusInitSRCH_Cnd((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.statusInitSRCH_Ctrl((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.statusInitSRCH_Rslt((MGBGP_PreAlcRateSrch)this);

		// [REF]ステータスのモードの設定
		MGBGP_PreAlcRateSrch_MC.statusInitREF_ScreenOpe((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.statusInitREF_Top((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.statusInitREF_Cnd((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.statusInitREF_Ctrl((MGBGP_PreAlcRateSrch)this);
		MGBGP_PreAlcRateSrch_MC.statusInitREF_Rslt((MGBGP_PreAlcRateSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBGP_PreAlcRateSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBGP_PreAlcRateSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBGP_PreAlcRateSrch p) {
		p.Cnd_typ_Group.addAllListener(p);
		p.Cnd_typ_TERM.addAllListener(p);
		p.Cnd_typ_PLN.addAllListener(p);
		p.Cnd_typ_ACT.addAllListener(p);
		p.Cnd_typ_PA.addAllListener(p);
		p.Cnd_calc_ctg_cd.setListListener(p);
		p.Cnd_calc_ctg_cd.addAllListener(p);
		p.Cnd_calc_ctg_nm.setListListener(p);
		p.Cnd_calc_ctg_nm.addAllListener(p);
		p.Cnd_ym_fr.setListListener(p);
		p.Cnd_ym_fr.addAllListener(p);
		p.Cnd_ym_to.setListListener(p);
		p.Cnd_ym_to.addAllListener(p);
		p.Cnd_pln_calc_ctg_cd.setListListener(p);
		p.Cnd_pln_calc_ctg_cd.addAllListener(p);
		p.Cnd_pln_calc_ctg_nm.setListListener(p);
		p.Cnd_pln_calc_ctg_nm.addAllListener(p);
		p.Cnd_act_calc_ctg_cd.setListListener(p);
		p.Cnd_act_calc_ctg_cd.addAllListener(p);
		p.Cnd_act_calc_ctg_nm.setListListener(p);
		p.Cnd_act_calc_ctg_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_pre_alc_rate_cd.setListListener(p);
		p.Cnd_pre_alc_rate_cd.addAllListener(p);
		p.Cnd_pre_alc_rate_nm.setListListener(p);
		p.Cnd_pre_alc_rate_nm.addAllListener(p);
		p.Cnd_pre_alc_ptn_cd.setListListener(p);
		p.Cnd_pre_alc_ptn_cd.addAllListener(p);
		p.Cnd_pre_alc_ptn_nm.setListListener(p);
		p.Cnd_pre_alc_ptn_nm.addAllListener(p);
		p.Cnd_dpt_alc_typ.setListListener(p);
		p.Cnd_dpt_alc_typ.addAllListener(p);
		p.Cnd_loc_alc_typ.setListListener(p);
		p.Cnd_loc_alc_typ.addAllListener(p);
		p.Cnd_oper_alc_typ.setListListener(p);
		p.Cnd_oper_alc_typ.addAllListener(p);
		p.Cnd_bp_alc_typ.setListListener(p);
		p.Cnd_bp_alc_typ.addAllListener(p);
		p.Cnd_ctg_alc_typ.setListListener(p);
		p.Cnd_ctg_alc_typ.addAllListener(p);
		p.Cnd_itm_alc_typ.setListListener(p);
		p.Cnd_itm_alc_typ.addAllListener(p);
		p.Cnd_lot_alc_typ.setListListener(p);
		p.Cnd_lot_alc_typ.addAllListener(p);
		p.Cnd_sublot_alc_typ.setListListener(p);
		p.Cnd_sublot_alc_typ.addAllListener(p);
		p.Cnd_sno1_alc_typ.setListListener(p);
		p.Cnd_sno1_alc_typ.addAllListener(p);
		p.Cnd_sno2_alc_typ.setListListener(p);
		p.Cnd_sno2_alc_typ.addAllListener(p);
		p.Cnd_sno3_alc_typ.setListListener(p);
		p.Cnd_sno3_alc_typ.addAllListener(p);
		p.Cnd_sno4_alc_typ.setListListener(p);
		p.Cnd_sno4_alc_typ.addAllListener(p);
		p.Cnd_inst_alc_typ.setListListener(p);
		p.Cnd_inst_alc_typ.addAllListener(p);
		p.Cnd_iv_alc_typ.setListListener(p);
		p.Cnd_iv_alc_typ.addAllListener(p);
		p.Cnd_po_alc_typ.setListListener(p);
		p.Cnd_po_alc_typ.addAllListener(p);
		p.Cnd_slo_alc_typ.setListListener(p);
		p.Cnd_slo_alc_typ.addAllListener(p);
		p.Cnd_alc_ac_alc_typ.setListListener(p);
		p.Cnd_alc_ac_alc_typ.addAllListener(p);
		p.Cnd_wg_alc_typ.setListListener(p);
		p.Cnd_wg_alc_typ.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBGP_PreAlcRateSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBGP_PreAlcRateSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_dpt_cd.addAllListener(p);
		p.columnRslt_dpt_cd.setListListener(p);
		p.columnRslt_dpt_nm.addAllListener(p);
		p.columnRslt_dpt_nm.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_oper_cd.addAllListener(p);
		p.columnRslt_oper_cd.setListListener(p);
		p.columnRslt_oper_nm.addAllListener(p);
		p.columnRslt_oper_nm.setListListener(p);
		p.columnRslt_bp_cd.addAllListener(p);
		p.columnRslt_bp_cd.setListListener(p);
		p.columnRslt_bp_nm.addAllListener(p);
		p.columnRslt_bp_nm.setListListener(p);
		p.columnRslt_ctg_cd.addAllListener(p);
		p.columnRslt_ctg_cd.setListListener(p);
		p.columnRslt_ctg_nm.addAllListener(p);
		p.columnRslt_ctg_nm.setListListener(p);
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
		p.columnRslt_itm_mfg_inst_no.addAllListener(p);
		p.columnRslt_itm_mfg_inst_no.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_po_no.addAllListener(p);
		p.columnRslt_po_no.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_alc_ac_cd.addAllListener(p);
		p.columnRslt_alc_ac_cd.setListListener(p);
		p.columnRslt_alc_ac_nm.addAllListener(p);
		p.columnRslt_alc_ac_nm.setListListener(p);
		p.columnRslt_trd_wg_cd.addAllListener(p);
		p.columnRslt_trd_wg_cd.setListListener(p);
		p.columnRslt_trd_wg_nm.addAllListener(p);
		p.columnRslt_trd_wg_nm.setListListener(p);
		p.columnRslt_term00.addAllListener(p);
		p.columnRslt_term00.setListListener(p);
		p.columnRslt_term01.addAllListener(p);
		p.columnRslt_term01.setListListener(p);
		p.columnRslt_term02.addAllListener(p);
		p.columnRslt_term02.setListListener(p);
		p.columnRslt_term03.addAllListener(p);
		p.columnRslt_term03.setListListener(p);
		p.columnRslt_term04.addAllListener(p);
		p.columnRslt_term04.setListListener(p);
		p.columnRslt_pln00.addAllListener(p);
		p.columnRslt_pln00.setListListener(p);
		p.columnRslt_act00.addAllListener(p);
		p.columnRslt_act00.setListListener(p);
		p.columnRslt_pln01.addAllListener(p);
		p.columnRslt_pln01.setListListener(p);
		p.columnRslt_act01.addAllListener(p);
		p.columnRslt_act01.setListListener(p);
		p.columnRslt_pln02.addAllListener(p);
		p.columnRslt_pln02.setListListener(p);
		p.columnRslt_act02.addAllListener(p);
		p.columnRslt_act02.setListListener(p);
		p.columnRslt_pln03.addAllListener(p);
		p.columnRslt_pln03.setListListener(p);
		p.columnRslt_act03.addAllListener(p);
		p.columnRslt_act03.setListListener(p);
		p.columnRslt_pln04.addAllListener(p);
		p.columnRslt_pln04.setListListener(p);
		p.columnRslt_act04.addAllListener(p);
		p.columnRslt_act04.setListListener(p);
		p.columnRslt_pln05.addAllListener(p);
		p.columnRslt_pln05.setListListener(p);
		p.columnRslt_act05.addAllListener(p);
		p.columnRslt_act05.setListListener(p);
		p.columnRslt_pln06.addAllListener(p);
		p.columnRslt_pln06.setListListener(p);
		p.columnRslt_act06.addAllListener(p);
		p.columnRslt_act06.setListListener(p);
		p.columnRslt_pln07.addAllListener(p);
		p.columnRslt_pln07.setListListener(p);
		p.columnRslt_act07.addAllListener(p);
		p.columnRslt_act07.setListListener(p);
		p.columnRslt_pln08.addAllListener(p);
		p.columnRslt_pln08.setListListener(p);
		p.columnRslt_act08.addAllListener(p);
		p.columnRslt_act08.setListListener(p);
		p.columnRslt_pln09.addAllListener(p);
		p.columnRslt_pln09.setListListener(p);
		p.columnRslt_act09.addAllListener(p);
		p.columnRslt_act09.setListListener(p);
		p.columnRslt_pln10.addAllListener(p);
		p.columnRslt_pln10.setListListener(p);
		p.columnRslt_act10.addAllListener(p);
		p.columnRslt_act10.setListListener(p);
		p.columnRslt_pln11.addAllListener(p);
		p.columnRslt_pln11.setListListener(p);
		p.columnRslt_act11.addAllListener(p);
		p.columnRslt_act11.setListListener(p);
		p.columnRslt_pln12.addAllListener(p);
		p.columnRslt_pln12.setListListener(p);
		p.columnRslt_act12.addAllListener(p);
		p.columnRslt_act12.setListListener(p);
		p.columnRslt_pln13.addAllListener(p);
		p.columnRslt_pln13.setListListener(p);
		p.columnRslt_act13.addAllListener(p);
		p.columnRslt_act13.setListListener(p);
		p.columnRslt_pln14.addAllListener(p);
		p.columnRslt_pln14.setListListener(p);
		p.columnRslt_act14.addAllListener(p);
		p.columnRslt_act14.setListListener(p);
		p.columnRslt_pln15.addAllListener(p);
		p.columnRslt_pln15.setListListener(p);
		p.columnRslt_act15.addAllListener(p);
		p.columnRslt_act15.setListListener(p);
		p.columnRslt_pln16.addAllListener(p);
		p.columnRslt_pln16.setListListener(p);
		p.columnRslt_act16.addAllListener(p);
		p.columnRslt_act16.setListListener(p);
		p.columnRslt_pln17.addAllListener(p);
		p.columnRslt_pln17.setListListener(p);
		p.columnRslt_act17.addAllListener(p);
		p.columnRslt_act17.setListListener(p);
		p.columnRslt_pln18.addAllListener(p);
		p.columnRslt_pln18.setListListener(p);
		p.columnRslt_act18.addAllListener(p);
		p.columnRslt_act18.setListListener(p);
		p.columnRslt_pln19.addAllListener(p);
		p.columnRslt_pln19.setListListener(p);
		p.columnRslt_act19.addAllListener(p);
		p.columnRslt_act19.setListListener(p);
		p.columnRslt_pln20.addAllListener(p);
		p.columnRslt_pln20.setListListener(p);
		p.columnRslt_act20.addAllListener(p);
		p.columnRslt_act20.setListListener(p);
		p.columnRslt_pln21.addAllListener(p);
		p.columnRslt_pln21.setListListener(p);
		p.columnRslt_act21.addAllListener(p);
		p.columnRslt_act21.setListListener(p);
		p.columnRslt_pln22.addAllListener(p);
		p.columnRslt_pln22.setListListener(p);
		p.columnRslt_act22.addAllListener(p);
		p.columnRslt_act22.setListListener(p);
		p.columnRslt_pln23.addAllListener(p);
		p.columnRslt_pln23.setListListener(p);
		p.columnRslt_act23.addAllListener(p);
		p.columnRslt_act23.setListListener(p);
		p.columnRslt_pln24.addAllListener(p);
		p.columnRslt_pln24.setListListener(p);
		p.columnRslt_act24.addAllListener(p);
		p.columnRslt_act24.setListListener(p);
		p.columnRslt_pln25.addAllListener(p);
		p.columnRslt_pln25.setListListener(p);
		p.columnRslt_act25.addAllListener(p);
		p.columnRslt_act25.setListListener(p);
		p.columnRslt_pln26.addAllListener(p);
		p.columnRslt_pln26.setListListener(p);
		p.columnRslt_act26.addAllListener(p);
		p.columnRslt_act26.setListListener(p);
		p.columnRslt_pln27.addAllListener(p);
		p.columnRslt_pln27.setListListener(p);
		p.columnRslt_act27.addAllListener(p);
		p.columnRslt_act27.setListListener(p);
		p.columnRslt_pln28.addAllListener(p);
		p.columnRslt_pln28.setListListener(p);
		p.columnRslt_act28.addAllListener(p);
		p.columnRslt_act28.setListListener(p);
		p.columnRslt_pln29.addAllListener(p);
		p.columnRslt_pln29.setListListener(p);
		p.columnRslt_act29.addAllListener(p);
		p.columnRslt_act29.setListListener(p);
		p.columnRslt_pln30.addAllListener(p);
		p.columnRslt_pln30.setListListener(p);
		p.columnRslt_act30.addAllListener(p);
		p.columnRslt_act30.setListListener(p);
		p.columnRslt_pln31.addAllListener(p);
		p.columnRslt_pln31.setListListener(p);
		p.columnRslt_act31.addAllListener(p);
		p.columnRslt_act31.setListListener(p);
		p.columnRslt_pln32.addAllListener(p);
		p.columnRslt_pln32.setListListener(p);
		p.columnRslt_act32.addAllListener(p);
		p.columnRslt_act32.setListListener(p);
		p.columnRslt_pln33.addAllListener(p);
		p.columnRslt_pln33.setListListener(p);
		p.columnRslt_act33.addAllListener(p);
		p.columnRslt_act33.setListListener(p);
		p.columnRslt_pln34.addAllListener(p);
		p.columnRslt_pln34.setListListener(p);
		p.columnRslt_act34.addAllListener(p);
		p.columnRslt_act34.setListListener(p);
		p.columnRslt_pln35.addAllListener(p);
		p.columnRslt_pln35.setListListener(p);
		p.columnRslt_act35.addAllListener(p);
		p.columnRslt_act35.setListListener(p);
		p.columnRslt_pln36.addAllListener(p);
		p.columnRslt_pln36.setListListener(p);
		p.columnRslt_act36.addAllListener(p);
		p.columnRslt_act36.setListListener(p);
		p.columnRslt_pln37.addAllListener(p);
		p.columnRslt_pln37.setListListener(p);
		p.columnRslt_act37.addAllListener(p);
		p.columnRslt_act37.setListListener(p);
		p.columnRslt_pln38.addAllListener(p);
		p.columnRslt_pln38.setListListener(p);
		p.columnRslt_act38.addAllListener(p);
		p.columnRslt_act38.setListListener(p);
		p.columnRslt_pln39.addAllListener(p);
		p.columnRslt_pln39.setListListener(p);
		p.columnRslt_act39.addAllListener(p);
		p.columnRslt_act39.setListListener(p);
		p.columnRslt_pln40.addAllListener(p);
		p.columnRslt_pln40.setListListener(p);
		p.columnRslt_act40.addAllListener(p);
		p.columnRslt_act40.setListListener(p);
		p.columnRslt_pln41.addAllListener(p);
		p.columnRslt_pln41.setListListener(p);
		p.columnRslt_act41.addAllListener(p);
		p.columnRslt_act41.setListListener(p);
		p.columnRslt_pln42.addAllListener(p);
		p.columnRslt_pln42.setListListener(p);
		p.columnRslt_act42.addAllListener(p);
		p.columnRslt_act42.setListListener(p);
		p.columnRslt_pln43.addAllListener(p);
		p.columnRslt_pln43.setListListener(p);
		p.columnRslt_act43.addAllListener(p);
		p.columnRslt_act43.setListListener(p);
		p.columnRslt_pln44.addAllListener(p);
		p.columnRslt_pln44.setListListener(p);
		p.columnRslt_act44.addAllListener(p);
		p.columnRslt_act44.setListListener(p);
		p.columnRslt_pln45.addAllListener(p);
		p.columnRslt_pln45.setListListener(p);
		p.columnRslt_act45.addAllListener(p);
		p.columnRslt_act45.setListListener(p);
		p.columnRslt_pln46.addAllListener(p);
		p.columnRslt_pln46.setListListener(p);
		p.columnRslt_act46.addAllListener(p);
		p.columnRslt_act46.setListListener(p);
		p.columnRslt_pln47.addAllListener(p);
		p.columnRslt_pln47.setListListener(p);
		p.columnRslt_act47.addAllListener(p);
		p.columnRslt_act47.setListListener(p);
		p.columnRslt_pln48.addAllListener(p);
		p.columnRslt_pln48.setListListener(p);
		p.columnRslt_act48.addAllListener(p);
		p.columnRslt_act48.setListListener(p);
		p.columnRslt_pln49.addAllListener(p);
		p.columnRslt_pln49.setListListener(p);
		p.columnRslt_act49.addAllListener(p);
		p.columnRslt_act49.setListListener(p);
		p.columnRslt_pln50.addAllListener(p);
		p.columnRslt_pln50.setListListener(p);
		p.columnRslt_act50.addAllListener(p);
		p.columnRslt_act50.setListListener(p);
		p.columnRslt_pln51.addAllListener(p);
		p.columnRslt_pln51.setListListener(p);
		p.columnRslt_act51.addAllListener(p);
		p.columnRslt_act51.setListListener(p);
		p.columnRslt_pln52.addAllListener(p);
		p.columnRslt_pln52.setListListener(p);
		p.columnRslt_act52.addAllListener(p);
		p.columnRslt_act52.setListListener(p);
		p.columnRslt_pln53.addAllListener(p);
		p.columnRslt_pln53.setListListener(p);
		p.columnRslt_act53.addAllListener(p);
		p.columnRslt_act53.setListListener(p);
		p.columnRslt_pln54.addAllListener(p);
		p.columnRslt_pln54.setListListener(p);
		p.columnRslt_act54.addAllListener(p);
		p.columnRslt_act54.setListListener(p);
		p.columnRslt_pln55.addAllListener(p);
		p.columnRslt_pln55.setListListener(p);
		p.columnRslt_act55.addAllListener(p);
		p.columnRslt_act55.setListListener(p);
		p.columnRslt_pln56.addAllListener(p);
		p.columnRslt_pln56.setListListener(p);
		p.columnRslt_act56.addAllListener(p);
		p.columnRslt_act56.setListListener(p);
		p.columnRslt_pln57.addAllListener(p);
		p.columnRslt_pln57.setListListener(p);
		p.columnRslt_act57.addAllListener(p);
		p.columnRslt_act57.setListListener(p);
		p.columnRslt_pln58.addAllListener(p);
		p.columnRslt_pln58.setListListener(p);
		p.columnRslt_act58.addAllListener(p);
		p.columnRslt_act58.setListListener(p);
		p.columnRslt_pln59.addAllListener(p);
		p.columnRslt_pln59.setListListener(p);
		p.columnRslt_act59.addAllListener(p);
		p.columnRslt_act59.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MGBGP_PreAlcRateSrch p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBGP_PreAlcRateSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBGP_PreAlcRateSrch p){
		p.Cnd_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_act_calc_ctg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_pre_alc_rate_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_pre_alc_rate_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_dpt_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_loc_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_oper_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_bp_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_ctg_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_itm_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_lot_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_sublot_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_sno1_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_sno2_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_sno3_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_sno4_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_inst_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_iv_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_po_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_slo_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_alc_ac_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_wg_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBGP_PreAlcRateSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBGP_PreAlcRateSrch p){
		p.columnRslt_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_term00.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_term01.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_term02.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_term03.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_term04.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln00.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act00.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln01.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act01.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln02.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act02.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln03.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act03.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln04.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act04.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln05.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act05.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln06.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act06.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln07.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act07.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln08.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act08.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln09.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act09.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln11.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act11.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln12.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act12.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln13.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act13.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln14.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act14.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln15.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act15.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln16.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act16.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln17.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act17.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln18.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act18.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln19.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act19.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln20.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act20.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln21.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act21.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln22.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act22.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln23.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act23.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln24.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act24.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln25.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act25.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln26.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act26.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln27.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act27.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln28.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act28.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln29.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act29.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln30.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act30.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln31.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act31.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln32.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act32.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln33.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act33.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln34.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act34.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln35.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act35.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln36.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act36.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln37.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act37.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln38.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act38.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln39.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act39.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln40.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act40.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln41.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act41.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln42.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act42.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln43.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act43.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln44.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act44.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln45.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act45.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln46.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act46.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln47.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act47.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln48.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act48.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln49.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act49.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln50.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act50.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln51.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act51.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln52.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act52.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln53.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act53.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln54.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act54.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln55.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act55.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln56.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act56.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln57.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act57.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln58.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act58.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pln59.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act59.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBGP_PreAlcRateSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBGP_PreAlcRateSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBGP_PreAlcRateSrch p){
		p.Cnd_typ_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ym_to.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_pln_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_act_calc_ctg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_act_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_pre_alc_rate_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_pre_alc_rate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_dpt_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_loc_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_oper_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_bp_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_ctg_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_itm_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_lot_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_sublot_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_sno1_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_sno2_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_sno3_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_sno4_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_inst_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_iv_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_po_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_slo_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_alc_ac_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_wg_alc_typ.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBGP_PreAlcRateSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBGP_PreAlcRateSrch p){
		p.columnRslt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_term00.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_term01.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_term02.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_term03.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_term04.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln00.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act00.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln01.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act01.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln02.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act02.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln03.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act03.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln04.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act04.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln05.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act05.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln06.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act06.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln07.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act07.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln08.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act08.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln09.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act09.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln11.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act11.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln12.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act12.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln13.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act13.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln14.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act14.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln15.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act15.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln16.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act16.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln17.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act17.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln18.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act18.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln19.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act19.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln20.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act20.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln21.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act21.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln22.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act22.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln23.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act23.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln24.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act24.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln25.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act25.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln26.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act26.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln27.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act27.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln28.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act28.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln29.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act29.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln30.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act30.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln31.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act31.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln32.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act32.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln33.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act33.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln34.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act34.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln35.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act35.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln36.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act36.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln37.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act37.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln38.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act38.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln39.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act39.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln40.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act40.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln41.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act41.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln42.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act42.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln43.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act43.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln44.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act44.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln45.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act45.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln46.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act46.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln47.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act47.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln48.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act48.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln49.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act49.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln50.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act50.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln51.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act51.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln52.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act52.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln53.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act53.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln54.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act54.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln55.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act55.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln56.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act56.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln57.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act57.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln58.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act58.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pln59.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act59.putMode(p, REF, MCMode.READ_ONLY);

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
		MGBGP_PreAlcRateSrch_MC.setTableConfigRslt((MGBGP_PreAlcRateSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBGP_PreAlcRateSrch p) {
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_oper_cd.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.oper_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_cd);
		p.columnRslt_oper_nm.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.oper_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_nm);
		p.columnRslt_bp_cd.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_cd);
		p.columnRslt_bp_nm.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_nm);
		p.columnRslt_ctg_cd.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.ctg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ctg_cd);
		p.columnRslt_ctg_nm.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.ctg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ctg_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_lot_no.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.columnRslt_sno1.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.sno1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1);
		p.columnRslt_sno2.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.sno2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2);
		p.columnRslt_sno3.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.sno3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3);
		p.columnRslt_sno4.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.sno4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4);
		p.columnRslt_itm_mfg_inst_no.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.itm_mfg_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_mfg_inst_no);
		p.columnRslt_iv_no.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_po_no.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_no);
		p.columnRslt_slo_no.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_alc_ac_cd.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.alc_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_ac_cd);
		p.columnRslt_alc_ac_nm.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.alc_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_ac_nm);
		p.columnRslt_trd_wg_cd.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.trd_wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_wg_cd);
		p.columnRslt_trd_wg_nm.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.trd_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_wg_nm);
		p.columnRslt_term00.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.term00_META);
		p.RsltTable.addColumnConfig(p.columnRslt_term00);
		p.columnRslt_term01.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.term01_META);
		p.RsltTable.addColumnConfig(p.columnRslt_term01);
		p.columnRslt_term02.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.term02_META);
		p.RsltTable.addColumnConfig(p.columnRslt_term02);
		p.columnRslt_term03.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.term03_META);
		p.RsltTable.addColumnConfig(p.columnRslt_term03);
		p.columnRslt_term04.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.term04_META);
		p.RsltTable.addColumnConfig(p.columnRslt_term04);
		p.columnRslt_pln00.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln00_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln00);
		p.columnRslt_act00.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act00_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act00);
		p.columnRslt_pln01.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln01_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln01);
		p.columnRslt_act01.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act01_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act01);
		p.columnRslt_pln02.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln02_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln02);
		p.columnRslt_act02.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act02_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act02);
		p.columnRslt_pln03.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln03_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln03);
		p.columnRslt_act03.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act03_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act03);
		p.columnRslt_pln04.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln04_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln04);
		p.columnRslt_act04.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act04_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act04);
		p.columnRslt_pln05.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln05_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln05);
		p.columnRslt_act05.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act05_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act05);
		p.columnRslt_pln06.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln06_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln06);
		p.columnRslt_act06.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act06_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act06);
		p.columnRslt_pln07.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln07_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln07);
		p.columnRslt_act07.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act07_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act07);
		p.columnRslt_pln08.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln08_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln08);
		p.columnRslt_act08.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act08_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act08);
		p.columnRslt_pln09.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln09_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln09);
		p.columnRslt_act09.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act09_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act09);
		p.columnRslt_pln10.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln10);
		p.columnRslt_act10.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act10);
		p.columnRslt_pln11.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln11_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln11);
		p.columnRslt_act11.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act11_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act11);
		p.columnRslt_pln12.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln12_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln12);
		p.columnRslt_act12.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act12_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act12);
		p.columnRslt_pln13.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln13_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln13);
		p.columnRslt_act13.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act13_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act13);
		p.columnRslt_pln14.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln14_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln14);
		p.columnRslt_act14.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act14_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act14);
		p.columnRslt_pln15.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln15_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln15);
		p.columnRslt_act15.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act15_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act15);
		p.columnRslt_pln16.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln16_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln16);
		p.columnRslt_act16.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act16_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act16);
		p.columnRslt_pln17.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln17_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln17);
		p.columnRslt_act17.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act17_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act17);
		p.columnRslt_pln18.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln18_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln18);
		p.columnRslt_act18.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act18_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act18);
		p.columnRslt_pln19.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln19_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln19);
		p.columnRslt_act19.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act19_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act19);
		p.columnRslt_pln20.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln20_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln20);
		p.columnRslt_act20.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act20_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act20);
		p.columnRslt_pln21.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln21_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln21);
		p.columnRslt_act21.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act21_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act21);
		p.columnRslt_pln22.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln22_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln22);
		p.columnRslt_act22.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act22_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act22);
		p.columnRslt_pln23.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln23_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln23);
		p.columnRslt_act23.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act23_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act23);
		p.columnRslt_pln24.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln24_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln24);
		p.columnRslt_act24.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act24_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act24);
		p.columnRslt_pln25.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln25_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln25);
		p.columnRslt_act25.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act25_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act25);
		p.columnRslt_pln26.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln26_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln26);
		p.columnRslt_act26.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act26_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act26);
		p.columnRslt_pln27.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln27_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln27);
		p.columnRslt_act27.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act27_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act27);
		p.columnRslt_pln28.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln28_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln28);
		p.columnRslt_act28.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act28_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act28);
		p.columnRslt_pln29.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln29_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln29);
		p.columnRslt_act29.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act29_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act29);
		p.columnRslt_pln30.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln30_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln30);
		p.columnRslt_act30.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act30_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act30);
		p.columnRslt_pln31.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln31_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln31);
		p.columnRslt_act31.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act31_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act31);
		p.columnRslt_pln32.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln32_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln32);
		p.columnRslt_act32.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act32_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act32);
		p.columnRslt_pln33.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln33_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln33);
		p.columnRslt_act33.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act33_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act33);
		p.columnRslt_pln34.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln34_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln34);
		p.columnRslt_act34.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act34_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act34);
		p.columnRslt_pln35.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln35_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln35);
		p.columnRslt_act35.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act35_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act35);
		p.columnRslt_pln36.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln36_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln36);
		p.columnRslt_act36.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act36_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act36);
		p.columnRslt_pln37.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln37_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln37);
		p.columnRslt_act37.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act37_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act37);
		p.columnRslt_pln38.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln38_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln38);
		p.columnRslt_act38.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act38_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act38);
		p.columnRslt_pln39.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln39_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln39);
		p.columnRslt_act39.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act39_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act39);
		p.columnRslt_pln40.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln40_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln40);
		p.columnRslt_act40.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act40_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act40);
		p.columnRslt_pln41.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln41_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln41);
		p.columnRslt_act41.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act41_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act41);
		p.columnRslt_pln42.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln42_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln42);
		p.columnRslt_act42.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act42_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act42);
		p.columnRslt_pln43.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln43_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln43);
		p.columnRslt_act43.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act43_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act43);
		p.columnRslt_pln44.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln44_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln44);
		p.columnRslt_act44.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act44_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act44);
		p.columnRslt_pln45.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln45_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln45);
		p.columnRslt_act45.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act45_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act45);
		p.columnRslt_pln46.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln46_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln46);
		p.columnRslt_act46.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act46_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act46);
		p.columnRslt_pln47.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln47_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln47);
		p.columnRslt_act47.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act47_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act47);
		p.columnRslt_pln48.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln48_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln48);
		p.columnRslt_act48.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act48_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act48);
		p.columnRslt_pln49.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln49_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln49);
		p.columnRslt_act49.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act49_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act49);
		p.columnRslt_pln50.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln50_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln50);
		p.columnRslt_act50.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act50_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act50);
		p.columnRslt_pln51.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln51_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln51);
		p.columnRslt_act51.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act51_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act51);
		p.columnRslt_pln52.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln52_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln52);
		p.columnRslt_act52.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act52_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act52);
		p.columnRslt_pln53.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln53_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln53);
		p.columnRslt_act53.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act53_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act53);
		p.columnRslt_pln54.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln54_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln54);
		p.columnRslt_act54.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act54_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act54);
		p.columnRslt_pln55.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln55_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln55);
		p.columnRslt_act55.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act55_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act55);
		p.columnRslt_pln56.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln56_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln56);
		p.columnRslt_act56.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act56_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act56);
		p.columnRslt_pln57.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln57_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln57);
		p.columnRslt_act57.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act57_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act57);
		p.columnRslt_pln58.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln58_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln58);
		p.columnRslt_act58.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act58_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act58);
		p.columnRslt_pln59.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.pln59_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pln59);
		p.columnRslt_act59.setMeta(mcframe.clientMGBG.MGBGP0150.RsltR.act59_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act59);
		p.RsltTable.addColumnGroup(p.Rslt_itm_p_PPanel.ItmTable);
		p.cgRslt_title00.add(p.columnRslt_pln00);
		p.cgRslt_title00.add(p.columnRslt_act00);
		p.RsltTable.addColumnGroup(p.cgRslt_title00);
		p.cgRslt_title01.add(p.columnRslt_pln01);
		p.cgRslt_title01.add(p.columnRslt_act01);
		p.RsltTable.addColumnGroup(p.cgRslt_title01);
		p.cgRslt_title02.add(p.columnRslt_pln02);
		p.cgRslt_title02.add(p.columnRslt_act02);
		p.RsltTable.addColumnGroup(p.cgRslt_title02);
		p.cgRslt_title03.add(p.columnRslt_pln03);
		p.cgRslt_title03.add(p.columnRslt_act03);
		p.RsltTable.addColumnGroup(p.cgRslt_title03);
		p.cgRslt_title04.add(p.columnRslt_pln04);
		p.cgRslt_title04.add(p.columnRslt_act04);
		p.RsltTable.addColumnGroup(p.cgRslt_title04);
		p.cgRslt_title05.add(p.columnRslt_pln05);
		p.cgRslt_title05.add(p.columnRslt_act05);
		p.RsltTable.addColumnGroup(p.cgRslt_title05);
		p.cgRslt_title06.add(p.columnRslt_pln06);
		p.cgRslt_title06.add(p.columnRslt_act06);
		p.RsltTable.addColumnGroup(p.cgRslt_title06);
		p.cgRslt_title07.add(p.columnRslt_pln07);
		p.cgRslt_title07.add(p.columnRslt_act07);
		p.RsltTable.addColumnGroup(p.cgRslt_title07);
		p.cgRslt_title08.add(p.columnRslt_pln08);
		p.cgRslt_title08.add(p.columnRslt_act08);
		p.RsltTable.addColumnGroup(p.cgRslt_title08);
		p.cgRslt_title09.add(p.columnRslt_pln09);
		p.cgRslt_title09.add(p.columnRslt_act09);
		p.RsltTable.addColumnGroup(p.cgRslt_title09);
		p.cgRslt_title10.add(p.columnRslt_pln10);
		p.cgRslt_title10.add(p.columnRslt_act10);
		p.RsltTable.addColumnGroup(p.cgRslt_title10);
		p.cgRslt_title11.add(p.columnRslt_pln11);
		p.cgRslt_title11.add(p.columnRslt_act11);
		p.RsltTable.addColumnGroup(p.cgRslt_title11);
		p.cgRslt_title12.add(p.columnRslt_pln12);
		p.cgRslt_title12.add(p.columnRslt_act12);
		p.RsltTable.addColumnGroup(p.cgRslt_title12);
		p.cgRslt_title13.add(p.columnRslt_pln13);
		p.cgRslt_title13.add(p.columnRslt_act13);
		p.RsltTable.addColumnGroup(p.cgRslt_title13);
		p.cgRslt_title14.add(p.columnRslt_pln14);
		p.cgRslt_title14.add(p.columnRslt_act14);
		p.RsltTable.addColumnGroup(p.cgRslt_title14);
		p.cgRslt_title15.add(p.columnRslt_pln15);
		p.cgRslt_title15.add(p.columnRslt_act15);
		p.RsltTable.addColumnGroup(p.cgRslt_title15);
		p.cgRslt_title16.add(p.columnRslt_pln16);
		p.cgRslt_title16.add(p.columnRslt_act16);
		p.RsltTable.addColumnGroup(p.cgRslt_title16);
		p.cgRslt_title17.add(p.columnRslt_pln17);
		p.cgRslt_title17.add(p.columnRslt_act17);
		p.RsltTable.addColumnGroup(p.cgRslt_title17);
		p.cgRslt_title18.add(p.columnRslt_pln18);
		p.cgRslt_title18.add(p.columnRslt_act18);
		p.RsltTable.addColumnGroup(p.cgRslt_title18);
		p.cgRslt_title19.add(p.columnRslt_pln19);
		p.cgRslt_title19.add(p.columnRslt_act19);
		p.RsltTable.addColumnGroup(p.cgRslt_title19);
		p.cgRslt_title20.add(p.columnRslt_pln20);
		p.cgRslt_title20.add(p.columnRslt_act20);
		p.RsltTable.addColumnGroup(p.cgRslt_title20);
		p.cgRslt_title21.add(p.columnRslt_pln21);
		p.cgRslt_title21.add(p.columnRslt_act21);
		p.RsltTable.addColumnGroup(p.cgRslt_title21);
		p.cgRslt_title22.add(p.columnRslt_pln22);
		p.cgRslt_title22.add(p.columnRslt_act22);
		p.RsltTable.addColumnGroup(p.cgRslt_title22);
		p.cgRslt_title23.add(p.columnRslt_pln23);
		p.cgRslt_title23.add(p.columnRslt_act23);
		p.RsltTable.addColumnGroup(p.cgRslt_title23);
		p.cgRslt_title24.add(p.columnRslt_pln24);
		p.cgRslt_title24.add(p.columnRslt_act24);
		p.RsltTable.addColumnGroup(p.cgRslt_title24);
		p.cgRslt_title25.add(p.columnRslt_pln25);
		p.cgRslt_title25.add(p.columnRslt_act25);
		p.RsltTable.addColumnGroup(p.cgRslt_title25);
		p.cgRslt_title26.add(p.columnRslt_pln26);
		p.cgRslt_title26.add(p.columnRslt_act26);
		p.RsltTable.addColumnGroup(p.cgRslt_title26);
		p.cgRslt_title27.add(p.columnRslt_pln27);
		p.cgRslt_title27.add(p.columnRslt_act27);
		p.RsltTable.addColumnGroup(p.cgRslt_title27);
		p.cgRslt_title28.add(p.columnRslt_pln28);
		p.cgRslt_title28.add(p.columnRslt_act28);
		p.RsltTable.addColumnGroup(p.cgRslt_title28);
		p.cgRslt_title29.add(p.columnRslt_pln29);
		p.cgRslt_title29.add(p.columnRslt_act29);
		p.RsltTable.addColumnGroup(p.cgRslt_title29);
		p.cgRslt_title30.add(p.columnRslt_pln30);
		p.cgRslt_title30.add(p.columnRslt_act30);
		p.RsltTable.addColumnGroup(p.cgRslt_title30);
		p.cgRslt_title31.add(p.columnRslt_pln31);
		p.cgRslt_title31.add(p.columnRslt_act31);
		p.RsltTable.addColumnGroup(p.cgRslt_title31);
		p.cgRslt_title32.add(p.columnRslt_pln32);
		p.cgRslt_title32.add(p.columnRslt_act32);
		p.RsltTable.addColumnGroup(p.cgRslt_title32);
		p.cgRslt_title33.add(p.columnRslt_pln33);
		p.cgRslt_title33.add(p.columnRslt_act33);
		p.RsltTable.addColumnGroup(p.cgRslt_title33);
		p.cgRslt_title34.add(p.columnRslt_pln34);
		p.cgRslt_title34.add(p.columnRslt_act34);
		p.RsltTable.addColumnGroup(p.cgRslt_title34);
		p.cgRslt_title35.add(p.columnRslt_pln35);
		p.cgRslt_title35.add(p.columnRslt_act35);
		p.RsltTable.addColumnGroup(p.cgRslt_title35);
		p.cgRslt_title36.add(p.columnRslt_pln36);
		p.cgRslt_title36.add(p.columnRslt_act36);
		p.RsltTable.addColumnGroup(p.cgRslt_title36);
		p.cgRslt_title37.add(p.columnRslt_pln37);
		p.cgRslt_title37.add(p.columnRslt_act37);
		p.RsltTable.addColumnGroup(p.cgRslt_title37);
		p.cgRslt_title38.add(p.columnRslt_pln38);
		p.cgRslt_title38.add(p.columnRslt_act38);
		p.RsltTable.addColumnGroup(p.cgRslt_title38);
		p.cgRslt_title39.add(p.columnRslt_pln39);
		p.cgRslt_title39.add(p.columnRslt_act39);
		p.RsltTable.addColumnGroup(p.cgRslt_title39);
		p.cgRslt_title40.add(p.columnRslt_pln40);
		p.cgRslt_title40.add(p.columnRslt_act40);
		p.RsltTable.addColumnGroup(p.cgRslt_title40);
		p.cgRslt_title41.add(p.columnRslt_pln41);
		p.cgRslt_title41.add(p.columnRslt_act41);
		p.RsltTable.addColumnGroup(p.cgRslt_title41);
		p.cgRslt_title42.add(p.columnRslt_pln42);
		p.cgRslt_title42.add(p.columnRslt_act42);
		p.RsltTable.addColumnGroup(p.cgRslt_title42);
		p.cgRslt_title43.add(p.columnRslt_pln43);
		p.cgRslt_title43.add(p.columnRslt_act43);
		p.RsltTable.addColumnGroup(p.cgRslt_title43);
		p.cgRslt_title44.add(p.columnRslt_pln44);
		p.cgRslt_title44.add(p.columnRslt_act44);
		p.RsltTable.addColumnGroup(p.cgRslt_title44);
		p.cgRslt_title45.add(p.columnRslt_pln45);
		p.cgRslt_title45.add(p.columnRslt_act45);
		p.RsltTable.addColumnGroup(p.cgRslt_title45);
		p.cgRslt_title46.add(p.columnRslt_pln46);
		p.cgRslt_title46.add(p.columnRslt_act46);
		p.RsltTable.addColumnGroup(p.cgRslt_title46);
		p.cgRslt_title47.add(p.columnRslt_pln47);
		p.cgRslt_title47.add(p.columnRslt_act47);
		p.RsltTable.addColumnGroup(p.cgRslt_title47);
		p.cgRslt_title48.add(p.columnRslt_pln48);
		p.cgRslt_title48.add(p.columnRslt_act48);
		p.RsltTable.addColumnGroup(p.cgRslt_title48);
		p.cgRslt_title49.add(p.columnRslt_pln49);
		p.cgRslt_title49.add(p.columnRslt_act49);
		p.RsltTable.addColumnGroup(p.cgRslt_title49);
		p.cgRslt_title50.add(p.columnRslt_pln50);
		p.cgRslt_title50.add(p.columnRslt_act50);
		p.RsltTable.addColumnGroup(p.cgRslt_title50);
		p.cgRslt_title51.add(p.columnRslt_pln51);
		p.cgRslt_title51.add(p.columnRslt_act51);
		p.RsltTable.addColumnGroup(p.cgRslt_title51);
		p.cgRslt_title52.add(p.columnRslt_pln52);
		p.cgRslt_title52.add(p.columnRslt_act52);
		p.RsltTable.addColumnGroup(p.cgRslt_title52);
		p.cgRslt_title53.add(p.columnRslt_pln53);
		p.cgRslt_title53.add(p.columnRslt_act53);
		p.RsltTable.addColumnGroup(p.cgRslt_title53);
		p.cgRslt_title54.add(p.columnRslt_pln54);
		p.cgRslt_title54.add(p.columnRslt_act54);
		p.RsltTable.addColumnGroup(p.cgRslt_title54);
		p.cgRslt_title55.add(p.columnRslt_pln55);
		p.cgRslt_title55.add(p.columnRslt_act55);
		p.RsltTable.addColumnGroup(p.cgRslt_title55);
		p.cgRslt_title56.add(p.columnRslt_pln56);
		p.cgRslt_title56.add(p.columnRslt_act56);
		p.RsltTable.addColumnGroup(p.cgRslt_title56);
		p.cgRslt_title57.add(p.columnRslt_pln57);
		p.cgRslt_title57.add(p.columnRslt_act57);
		p.RsltTable.addColumnGroup(p.cgRslt_title57);
		p.cgRslt_title58.add(p.columnRslt_pln58);
		p.cgRslt_title58.add(p.columnRslt_act58);
		p.RsltTable.addColumnGroup(p.cgRslt_title58);
		p.cgRslt_title59.add(p.columnRslt_pln59);
		p.cgRslt_title59.add(p.columnRslt_act59);
		p.RsltTable.addColumnGroup(p.cgRslt_title59);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_ctg_cd.getListConfig().setPutter(getCnd_calc_ctg_cd_ListPutter());
		Cnd_pln_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pln_calc_ctg_cd.getListConfig().setPutter(getCnd_pln_calc_ctg_cd_ListPutter());
		Cnd_act_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_act_calc_ctg_cd.getListConfig().setPutter(getCnd_act_calc_ctg_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_pre_alc_rate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pre_alc_rate_cd.getListConfig().setPutter(getCnd_pre_alc_rate_cd_ListPutter());
		Cnd_pre_alc_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pre_alc_ptn_cd.getListConfig().setPutter(getCnd_pre_alc_ptn_cd_ListPutter());
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
	 * [Cnd_pln_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pln_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Cnd_act_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_act_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_pre_alc_rate_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pre_alc_rate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.PreAlcRateWithPtn");
		return lp;
	}
	 
	/**
	 * [Cnd_pre_alc_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pre_alc_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_ctg_cd) return getCnd_calc_ctg_cd(row, info);
		if(combo == Cnd_pln_calc_ctg_cd) return getCnd_pln_calc_ctg_cd(row, info);
		if(combo == Cnd_act_calc_ctg_cd) return getCnd_act_calc_ctg_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_pre_alc_rate_cd) return getCnd_pre_alc_rate_cd(row, info);
		if(combo == Cnd_pre_alc_ptn_cd) return getCnd_pre_alc_ptn_cd(row, info);
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
	}

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_typ_Group) return doCnd_typ_VC(info);
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_ym_fr) return doCnd_ym_fr_VC(info);
		if (vc == Cnd_ym_to) return doCnd_ym_to_VC(info);
		if (vc == Cnd_pln_calc_ctg_cd) return doCnd_pln_calc_ctg_cd_VC(info);
		if (vc == Cnd_pln_calc_ctg_nm) return doCnd_pln_calc_ctg_nm_VC(info);
		if (vc == Cnd_act_calc_ctg_cd) return doCnd_act_calc_ctg_cd_VC(info);
		if (vc == Cnd_act_calc_ctg_nm) return doCnd_act_calc_ctg_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_pre_alc_rate_cd) return doCnd_pre_alc_rate_cd_VC(info);
		if (vc == Cnd_pre_alc_rate_nm) return doCnd_pre_alc_rate_nm_VC(info);
		if (vc == Cnd_pre_alc_ptn_cd) return doCnd_pre_alc_ptn_cd_VC(info);
		if (vc == Cnd_pre_alc_ptn_nm) return doCnd_pre_alc_ptn_nm_VC(info);
		if (vc == Cnd_dpt_alc_typ) return doCnd_dpt_alc_typ_VC(info);
		if (vc == Cnd_loc_alc_typ) return doCnd_loc_alc_typ_VC(info);
		if (vc == Cnd_oper_alc_typ) return doCnd_oper_alc_typ_VC(info);
		if (vc == Cnd_bp_alc_typ) return doCnd_bp_alc_typ_VC(info);
		if (vc == Cnd_ctg_alc_typ) return doCnd_ctg_alc_typ_VC(info);
		if (vc == Cnd_itm_alc_typ) return doCnd_itm_alc_typ_VC(info);
		if (vc == Cnd_lot_alc_typ) return doCnd_lot_alc_typ_VC(info);
		if (vc == Cnd_sublot_alc_typ) return doCnd_sublot_alc_typ_VC(info);
		if (vc == Cnd_sno1_alc_typ) return doCnd_sno1_alc_typ_VC(info);
		if (vc == Cnd_sno2_alc_typ) return doCnd_sno2_alc_typ_VC(info);
		if (vc == Cnd_sno3_alc_typ) return doCnd_sno3_alc_typ_VC(info);
		if (vc == Cnd_sno4_alc_typ) return doCnd_sno4_alc_typ_VC(info);
		if (vc == Cnd_inst_alc_typ) return doCnd_inst_alc_typ_VC(info);
		if (vc == Cnd_iv_alc_typ) return doCnd_iv_alc_typ_VC(info);
		if (vc == Cnd_po_alc_typ) return doCnd_po_alc_typ_VC(info);
		if (vc == Cnd_slo_alc_typ) return doCnd_slo_alc_typ_VC(info);
		if (vc == Cnd_alc_ac_alc_typ) return doCnd_alc_ac_alc_typ_VC(info);
		if (vc == Cnd_wg_alc_typ) return doCnd_wg_alc_typ_VC(info);
		if (vc == columnRslt_dpt_cd) return doRslt_dpt_cd_VC(info);
		if (vc == columnRslt_dpt_nm) return doRslt_dpt_nm_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_oper_cd) return doRslt_oper_cd_VC(info);
		if (vc == columnRslt_oper_nm) return doRslt_oper_nm_VC(info);
		if (vc == columnRslt_bp_cd) return doRslt_bp_cd_VC(info);
		if (vc == columnRslt_bp_nm) return doRslt_bp_nm_VC(info);
		if (vc == columnRslt_ctg_cd) return doRslt_ctg_cd_VC(info);
		if (vc == columnRslt_ctg_nm) return doRslt_ctg_nm_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_sno1) return doRslt_sno1_VC(info);
		if (vc == columnRslt_sno2) return doRslt_sno2_VC(info);
		if (vc == columnRslt_sno3) return doRslt_sno3_VC(info);
		if (vc == columnRslt_sno4) return doRslt_sno4_VC(info);
		if (vc == columnRslt_itm_mfg_inst_no) return doRslt_itm_mfg_inst_no_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_po_no) return doRslt_po_no_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_alc_ac_cd) return doRslt_alc_ac_cd_VC(info);
		if (vc == columnRslt_alc_ac_nm) return doRslt_alc_ac_nm_VC(info);
		if (vc == columnRslt_trd_wg_cd) return doRslt_trd_wg_cd_VC(info);
		if (vc == columnRslt_trd_wg_nm) return doRslt_trd_wg_nm_VC(info);
		if (vc == columnRslt_term00) return doRslt_term00_VC(info);
		if (vc == columnRslt_term01) return doRslt_term01_VC(info);
		if (vc == columnRslt_term02) return doRslt_term02_VC(info);
		if (vc == columnRslt_term03) return doRslt_term03_VC(info);
		if (vc == columnRslt_term04) return doRslt_term04_VC(info);
		if (vc == columnRslt_pln00) return doRslt_pln00_VC(info);
		if (vc == columnRslt_act00) return doRslt_act00_VC(info);
		if (vc == columnRslt_pln01) return doRslt_pln01_VC(info);
		if (vc == columnRslt_act01) return doRslt_act01_VC(info);
		if (vc == columnRslt_pln02) return doRslt_pln02_VC(info);
		if (vc == columnRslt_act02) return doRslt_act02_VC(info);
		if (vc == columnRslt_pln03) return doRslt_pln03_VC(info);
		if (vc == columnRslt_act03) return doRslt_act03_VC(info);
		if (vc == columnRslt_pln04) return doRslt_pln04_VC(info);
		if (vc == columnRslt_act04) return doRslt_act04_VC(info);
		if (vc == columnRslt_pln05) return doRslt_pln05_VC(info);
		if (vc == columnRslt_act05) return doRslt_act05_VC(info);
		if (vc == columnRslt_pln06) return doRslt_pln06_VC(info);
		if (vc == columnRslt_act06) return doRslt_act06_VC(info);
		if (vc == columnRslt_pln07) return doRslt_pln07_VC(info);
		if (vc == columnRslt_act07) return doRslt_act07_VC(info);
		if (vc == columnRslt_pln08) return doRslt_pln08_VC(info);
		if (vc == columnRslt_act08) return doRslt_act08_VC(info);
		if (vc == columnRslt_pln09) return doRslt_pln09_VC(info);
		if (vc == columnRslt_act09) return doRslt_act09_VC(info);
		if (vc == columnRslt_pln10) return doRslt_pln10_VC(info);
		if (vc == columnRslt_act10) return doRslt_act10_VC(info);
		if (vc == columnRslt_pln11) return doRslt_pln11_VC(info);
		if (vc == columnRslt_act11) return doRslt_act11_VC(info);
		if (vc == columnRslt_pln12) return doRslt_pln12_VC(info);
		if (vc == columnRslt_act12) return doRslt_act12_VC(info);
		if (vc == columnRslt_pln13) return doRslt_pln13_VC(info);
		if (vc == columnRslt_act13) return doRslt_act13_VC(info);
		if (vc == columnRslt_pln14) return doRslt_pln14_VC(info);
		if (vc == columnRslt_act14) return doRslt_act14_VC(info);
		if (vc == columnRslt_pln15) return doRslt_pln15_VC(info);
		if (vc == columnRslt_act15) return doRslt_act15_VC(info);
		if (vc == columnRslt_pln16) return doRslt_pln16_VC(info);
		if (vc == columnRslt_act16) return doRslt_act16_VC(info);
		if (vc == columnRslt_pln17) return doRslt_pln17_VC(info);
		if (vc == columnRslt_act17) return doRslt_act17_VC(info);
		if (vc == columnRslt_pln18) return doRslt_pln18_VC(info);
		if (vc == columnRslt_act18) return doRslt_act18_VC(info);
		if (vc == columnRslt_pln19) return doRslt_pln19_VC(info);
		if (vc == columnRslt_act19) return doRslt_act19_VC(info);
		if (vc == columnRslt_pln20) return doRslt_pln20_VC(info);
		if (vc == columnRslt_act20) return doRslt_act20_VC(info);
		if (vc == columnRslt_pln21) return doRslt_pln21_VC(info);
		if (vc == columnRslt_act21) return doRslt_act21_VC(info);
		if (vc == columnRslt_pln22) return doRslt_pln22_VC(info);
		if (vc == columnRslt_act22) return doRslt_act22_VC(info);
		if (vc == columnRslt_pln23) return doRslt_pln23_VC(info);
		if (vc == columnRslt_act23) return doRslt_act23_VC(info);
		if (vc == columnRslt_pln24) return doRslt_pln24_VC(info);
		if (vc == columnRslt_act24) return doRslt_act24_VC(info);
		if (vc == columnRslt_pln25) return doRslt_pln25_VC(info);
		if (vc == columnRslt_act25) return doRslt_act25_VC(info);
		if (vc == columnRslt_pln26) return doRslt_pln26_VC(info);
		if (vc == columnRslt_act26) return doRslt_act26_VC(info);
		if (vc == columnRslt_pln27) return doRslt_pln27_VC(info);
		if (vc == columnRslt_act27) return doRslt_act27_VC(info);
		if (vc == columnRslt_pln28) return doRslt_pln28_VC(info);
		if (vc == columnRslt_act28) return doRslt_act28_VC(info);
		if (vc == columnRslt_pln29) return doRslt_pln29_VC(info);
		if (vc == columnRslt_act29) return doRslt_act29_VC(info);
		if (vc == columnRslt_pln30) return doRslt_pln30_VC(info);
		if (vc == columnRslt_act30) return doRslt_act30_VC(info);
		if (vc == columnRslt_pln31) return doRslt_pln31_VC(info);
		if (vc == columnRslt_act31) return doRslt_act31_VC(info);
		if (vc == columnRslt_pln32) return doRslt_pln32_VC(info);
		if (vc == columnRslt_act32) return doRslt_act32_VC(info);
		if (vc == columnRslt_pln33) return doRslt_pln33_VC(info);
		if (vc == columnRslt_act33) return doRslt_act33_VC(info);
		if (vc == columnRslt_pln34) return doRslt_pln34_VC(info);
		if (vc == columnRslt_act34) return doRslt_act34_VC(info);
		if (vc == columnRslt_pln35) return doRslt_pln35_VC(info);
		if (vc == columnRslt_act35) return doRslt_act35_VC(info);
		if (vc == columnRslt_pln36) return doRslt_pln36_VC(info);
		if (vc == columnRslt_act36) return doRslt_act36_VC(info);
		if (vc == columnRslt_pln37) return doRslt_pln37_VC(info);
		if (vc == columnRslt_act37) return doRslt_act37_VC(info);
		if (vc == columnRslt_pln38) return doRslt_pln38_VC(info);
		if (vc == columnRslt_act38) return doRslt_act38_VC(info);
		if (vc == columnRslt_pln39) return doRslt_pln39_VC(info);
		if (vc == columnRslt_act39) return doRslt_act39_VC(info);
		if (vc == columnRslt_pln40) return doRslt_pln40_VC(info);
		if (vc == columnRslt_act40) return doRslt_act40_VC(info);
		if (vc == columnRslt_pln41) return doRslt_pln41_VC(info);
		if (vc == columnRslt_act41) return doRslt_act41_VC(info);
		if (vc == columnRslt_pln42) return doRslt_pln42_VC(info);
		if (vc == columnRslt_act42) return doRslt_act42_VC(info);
		if (vc == columnRslt_pln43) return doRslt_pln43_VC(info);
		if (vc == columnRslt_act43) return doRslt_act43_VC(info);
		if (vc == columnRslt_pln44) return doRslt_pln44_VC(info);
		if (vc == columnRslt_act44) return doRslt_act44_VC(info);
		if (vc == columnRslt_pln45) return doRslt_pln45_VC(info);
		if (vc == columnRslt_act45) return doRslt_act45_VC(info);
		if (vc == columnRslt_pln46) return doRslt_pln46_VC(info);
		if (vc == columnRslt_act46) return doRslt_act46_VC(info);
		if (vc == columnRslt_pln47) return doRslt_pln47_VC(info);
		if (vc == columnRslt_act47) return doRslt_act47_VC(info);
		if (vc == columnRslt_pln48) return doRslt_pln48_VC(info);
		if (vc == columnRslt_act48) return doRslt_act48_VC(info);
		if (vc == columnRslt_pln49) return doRslt_pln49_VC(info);
		if (vc == columnRslt_act49) return doRslt_act49_VC(info);
		if (vc == columnRslt_pln50) return doRslt_pln50_VC(info);
		if (vc == columnRslt_act50) return doRslt_act50_VC(info);
		if (vc == columnRslt_pln51) return doRslt_pln51_VC(info);
		if (vc == columnRslt_act51) return doRslt_act51_VC(info);
		if (vc == columnRslt_pln52) return doRslt_pln52_VC(info);
		if (vc == columnRslt_act52) return doRslt_act52_VC(info);
		if (vc == columnRslt_pln53) return doRslt_pln53_VC(info);
		if (vc == columnRslt_act53) return doRslt_act53_VC(info);
		if (vc == columnRslt_pln54) return doRslt_pln54_VC(info);
		if (vc == columnRslt_act54) return doRslt_act54_VC(info);
		if (vc == columnRslt_pln55) return doRslt_pln55_VC(info);
		if (vc == columnRslt_act55) return doRslt_act55_VC(info);
		if (vc == columnRslt_pln56) return doRslt_pln56_VC(info);
		if (vc == columnRslt_act56) return doRslt_act56_VC(info);
		if (vc == columnRslt_pln57) return doRslt_pln57_VC(info);
		if (vc == columnRslt_act57) return doRslt_act57_VC(info);
		if (vc == columnRslt_pln58) return doRslt_pln58_VC(info);
		if (vc == columnRslt_act58) return doRslt_act58_VC(info);
		if (vc == columnRslt_pln59) return doRslt_pln59_VC(info);
		if (vc == columnRslt_act59) return doRslt_act59_VC(info);
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
	 * [Cnd]パネルの[typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_typ_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pln_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pln_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pln_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_calc_ctg_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_alc_rate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_rate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_rate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pre_alc_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pre_alc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ctg_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ctg_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sublot_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sublot_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno1_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno1_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno2_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno2_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno3_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno3_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno4_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno4_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ctg_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_mfg_inst_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[alc_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[term00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_term00_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[term01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_term01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[term02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_term02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[term03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_term03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[term04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_term04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln00_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act00_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln21]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln21_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act21]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act21_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln22]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln22_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act22]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act22_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln23]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln23_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act23]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act23_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln24]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln24_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act24]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act24_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln25]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln25_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act25]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act25_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln26]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln26_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act26]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act26_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln27]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln27_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act27]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act27_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln28]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln28_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act28]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act28_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln29]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln29_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act29]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act29_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln30]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln30_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act30]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act30_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln31]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln31_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act31]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act31_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln32]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln32_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act32]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act32_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln33]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln33_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act33]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act33_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln34]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln34_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act34]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act34_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln35]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln35_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act35]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act35_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln36]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln36_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act36]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act36_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln37]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln37_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act37]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act37_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln38]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln38_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act38]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act38_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln39]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln39_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act39]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act39_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln40]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln40_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act40]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act40_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln41]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln41_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act41]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act41_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln42]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln42_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act42]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act42_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln43]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln43_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act43]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act43_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln44]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln44_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act44]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act44_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln45]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln45_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act45]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act45_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln46]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln46_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act46]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act46_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln47]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln47_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act47]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act47_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln48]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln48_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act48]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act48_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln49]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln49_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act49]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act49_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln50]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln50_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act50]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act50_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln51]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln51_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act51]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act51_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln52]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln52_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act52]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act52_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln53]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln53_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act53]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act53_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln54]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln54_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act54]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act54_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln55]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln55_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act55]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act55_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln56]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln56_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act56]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act56_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln57]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln57_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act57]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act57_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln58]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln58_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act58]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act58_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pln59]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pln59_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act59]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act59_VC(MCEventInfo info){
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
		else if (nc == Cnd_typ_Group) doCnd_typ_NC(info);
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_ym_fr) doCnd_ym_fr_NC(info);
		else if (nc == Cnd_ym_to) doCnd_ym_to_NC(info);
		else if (nc == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_NC(info);
		else if (nc == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_NC(info);
		else if (nc == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NC(info);
		else if (nc == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_NC(info);
		else if (nc == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_NC(info);
		else if (nc == Cnd_pre_alc_ptn_cd) doCnd_pre_alc_ptn_cd_NC(info);
		else if (nc == Cnd_pre_alc_ptn_nm) doCnd_pre_alc_ptn_nm_NC(info);
		else if (nc == Cnd_dpt_alc_typ) doCnd_dpt_alc_typ_NC(info);
		else if (nc == Cnd_loc_alc_typ) doCnd_loc_alc_typ_NC(info);
		else if (nc == Cnd_oper_alc_typ) doCnd_oper_alc_typ_NC(info);
		else if (nc == Cnd_bp_alc_typ) doCnd_bp_alc_typ_NC(info);
		else if (nc == Cnd_ctg_alc_typ) doCnd_ctg_alc_typ_NC(info);
		else if (nc == Cnd_itm_alc_typ) doCnd_itm_alc_typ_NC(info);
		else if (nc == Cnd_lot_alc_typ) doCnd_lot_alc_typ_NC(info);
		else if (nc == Cnd_sublot_alc_typ) doCnd_sublot_alc_typ_NC(info);
		else if (nc == Cnd_sno1_alc_typ) doCnd_sno1_alc_typ_NC(info);
		else if (nc == Cnd_sno2_alc_typ) doCnd_sno2_alc_typ_NC(info);
		else if (nc == Cnd_sno3_alc_typ) doCnd_sno3_alc_typ_NC(info);
		else if (nc == Cnd_sno4_alc_typ) doCnd_sno4_alc_typ_NC(info);
		else if (nc == Cnd_inst_alc_typ) doCnd_inst_alc_typ_NC(info);
		else if (nc == Cnd_iv_alc_typ) doCnd_iv_alc_typ_NC(info);
		else if (nc == Cnd_po_alc_typ) doCnd_po_alc_typ_NC(info);
		else if (nc == Cnd_slo_alc_typ) doCnd_slo_alc_typ_NC(info);
		else if (nc == Cnd_alc_ac_alc_typ) doCnd_alc_ac_alc_typ_NC(info);
		else if (nc == Cnd_wg_alc_typ) doCnd_wg_alc_typ_NC(info);
		else if (nc == columnRslt_dpt_cd) doRslt_dpt_cd_NC(info);
		else if (nc == columnRslt_dpt_nm) doRslt_dpt_nm_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_oper_cd) doRslt_oper_cd_NC(info);
		else if (nc == columnRslt_oper_nm) doRslt_oper_nm_NC(info);
		else if (nc == columnRslt_bp_cd) doRslt_bp_cd_NC(info);
		else if (nc == columnRslt_bp_nm) doRslt_bp_nm_NC(info);
		else if (nc == columnRslt_ctg_cd) doRslt_ctg_cd_NC(info);
		else if (nc == columnRslt_ctg_nm) doRslt_ctg_nm_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_sno1) doRslt_sno1_NC(info);
		else if (nc == columnRslt_sno2) doRslt_sno2_NC(info);
		else if (nc == columnRslt_sno3) doRslt_sno3_NC(info);
		else if (nc == columnRslt_sno4) doRslt_sno4_NC(info);
		else if (nc == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_po_no) doRslt_po_no_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_NC(info);
		else if (nc == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_NC(info);
		else if (nc == columnRslt_trd_wg_cd) doRslt_trd_wg_cd_NC(info);
		else if (nc == columnRslt_trd_wg_nm) doRslt_trd_wg_nm_NC(info);
		else if (nc == columnRslt_term00) doRslt_term00_NC(info);
		else if (nc == columnRslt_term01) doRslt_term01_NC(info);
		else if (nc == columnRslt_term02) doRslt_term02_NC(info);
		else if (nc == columnRslt_term03) doRslt_term03_NC(info);
		else if (nc == columnRslt_term04) doRslt_term04_NC(info);
		else if (nc == columnRslt_pln00) doRslt_pln00_NC(info);
		else if (nc == columnRslt_act00) doRslt_act00_NC(info);
		else if (nc == columnRslt_pln01) doRslt_pln01_NC(info);
		else if (nc == columnRslt_act01) doRslt_act01_NC(info);
		else if (nc == columnRslt_pln02) doRslt_pln02_NC(info);
		else if (nc == columnRslt_act02) doRslt_act02_NC(info);
		else if (nc == columnRslt_pln03) doRslt_pln03_NC(info);
		else if (nc == columnRslt_act03) doRslt_act03_NC(info);
		else if (nc == columnRslt_pln04) doRslt_pln04_NC(info);
		else if (nc == columnRslt_act04) doRslt_act04_NC(info);
		else if (nc == columnRslt_pln05) doRslt_pln05_NC(info);
		else if (nc == columnRslt_act05) doRslt_act05_NC(info);
		else if (nc == columnRslt_pln06) doRslt_pln06_NC(info);
		else if (nc == columnRslt_act06) doRslt_act06_NC(info);
		else if (nc == columnRslt_pln07) doRslt_pln07_NC(info);
		else if (nc == columnRslt_act07) doRslt_act07_NC(info);
		else if (nc == columnRslt_pln08) doRslt_pln08_NC(info);
		else if (nc == columnRslt_act08) doRslt_act08_NC(info);
		else if (nc == columnRslt_pln09) doRslt_pln09_NC(info);
		else if (nc == columnRslt_act09) doRslt_act09_NC(info);
		else if (nc == columnRslt_pln10) doRslt_pln10_NC(info);
		else if (nc == columnRslt_act10) doRslt_act10_NC(info);
		else if (nc == columnRslt_pln11) doRslt_pln11_NC(info);
		else if (nc == columnRslt_act11) doRslt_act11_NC(info);
		else if (nc == columnRslt_pln12) doRslt_pln12_NC(info);
		else if (nc == columnRslt_act12) doRslt_act12_NC(info);
		else if (nc == columnRslt_pln13) doRslt_pln13_NC(info);
		else if (nc == columnRslt_act13) doRslt_act13_NC(info);
		else if (nc == columnRslt_pln14) doRslt_pln14_NC(info);
		else if (nc == columnRslt_act14) doRslt_act14_NC(info);
		else if (nc == columnRslt_pln15) doRslt_pln15_NC(info);
		else if (nc == columnRslt_act15) doRslt_act15_NC(info);
		else if (nc == columnRslt_pln16) doRslt_pln16_NC(info);
		else if (nc == columnRslt_act16) doRslt_act16_NC(info);
		else if (nc == columnRslt_pln17) doRslt_pln17_NC(info);
		else if (nc == columnRslt_act17) doRslt_act17_NC(info);
		else if (nc == columnRslt_pln18) doRslt_pln18_NC(info);
		else if (nc == columnRslt_act18) doRslt_act18_NC(info);
		else if (nc == columnRslt_pln19) doRslt_pln19_NC(info);
		else if (nc == columnRslt_act19) doRslt_act19_NC(info);
		else if (nc == columnRslt_pln20) doRslt_pln20_NC(info);
		else if (nc == columnRslt_act20) doRslt_act20_NC(info);
		else if (nc == columnRslt_pln21) doRslt_pln21_NC(info);
		else if (nc == columnRslt_act21) doRslt_act21_NC(info);
		else if (nc == columnRslt_pln22) doRslt_pln22_NC(info);
		else if (nc == columnRslt_act22) doRslt_act22_NC(info);
		else if (nc == columnRslt_pln23) doRslt_pln23_NC(info);
		else if (nc == columnRslt_act23) doRslt_act23_NC(info);
		else if (nc == columnRslt_pln24) doRslt_pln24_NC(info);
		else if (nc == columnRslt_act24) doRslt_act24_NC(info);
		else if (nc == columnRslt_pln25) doRslt_pln25_NC(info);
		else if (nc == columnRslt_act25) doRslt_act25_NC(info);
		else if (nc == columnRslt_pln26) doRslt_pln26_NC(info);
		else if (nc == columnRslt_act26) doRslt_act26_NC(info);
		else if (nc == columnRslt_pln27) doRslt_pln27_NC(info);
		else if (nc == columnRslt_act27) doRslt_act27_NC(info);
		else if (nc == columnRslt_pln28) doRslt_pln28_NC(info);
		else if (nc == columnRslt_act28) doRslt_act28_NC(info);
		else if (nc == columnRslt_pln29) doRslt_pln29_NC(info);
		else if (nc == columnRslt_act29) doRslt_act29_NC(info);
		else if (nc == columnRslt_pln30) doRslt_pln30_NC(info);
		else if (nc == columnRslt_act30) doRslt_act30_NC(info);
		else if (nc == columnRslt_pln31) doRslt_pln31_NC(info);
		else if (nc == columnRslt_act31) doRslt_act31_NC(info);
		else if (nc == columnRslt_pln32) doRslt_pln32_NC(info);
		else if (nc == columnRslt_act32) doRslt_act32_NC(info);
		else if (nc == columnRslt_pln33) doRslt_pln33_NC(info);
		else if (nc == columnRslt_act33) doRslt_act33_NC(info);
		else if (nc == columnRslt_pln34) doRslt_pln34_NC(info);
		else if (nc == columnRslt_act34) doRslt_act34_NC(info);
		else if (nc == columnRslt_pln35) doRslt_pln35_NC(info);
		else if (nc == columnRslt_act35) doRslt_act35_NC(info);
		else if (nc == columnRslt_pln36) doRslt_pln36_NC(info);
		else if (nc == columnRslt_act36) doRslt_act36_NC(info);
		else if (nc == columnRslt_pln37) doRslt_pln37_NC(info);
		else if (nc == columnRslt_act37) doRslt_act37_NC(info);
		else if (nc == columnRslt_pln38) doRslt_pln38_NC(info);
		else if (nc == columnRslt_act38) doRslt_act38_NC(info);
		else if (nc == columnRslt_pln39) doRslt_pln39_NC(info);
		else if (nc == columnRslt_act39) doRslt_act39_NC(info);
		else if (nc == columnRslt_pln40) doRslt_pln40_NC(info);
		else if (nc == columnRslt_act40) doRslt_act40_NC(info);
		else if (nc == columnRslt_pln41) doRslt_pln41_NC(info);
		else if (nc == columnRslt_act41) doRslt_act41_NC(info);
		else if (nc == columnRslt_pln42) doRslt_pln42_NC(info);
		else if (nc == columnRslt_act42) doRslt_act42_NC(info);
		else if (nc == columnRslt_pln43) doRslt_pln43_NC(info);
		else if (nc == columnRslt_act43) doRslt_act43_NC(info);
		else if (nc == columnRslt_pln44) doRslt_pln44_NC(info);
		else if (nc == columnRslt_act44) doRslt_act44_NC(info);
		else if (nc == columnRslt_pln45) doRslt_pln45_NC(info);
		else if (nc == columnRslt_act45) doRslt_act45_NC(info);
		else if (nc == columnRslt_pln46) doRslt_pln46_NC(info);
		else if (nc == columnRslt_act46) doRslt_act46_NC(info);
		else if (nc == columnRslt_pln47) doRslt_pln47_NC(info);
		else if (nc == columnRslt_act47) doRslt_act47_NC(info);
		else if (nc == columnRslt_pln48) doRslt_pln48_NC(info);
		else if (nc == columnRslt_act48) doRslt_act48_NC(info);
		else if (nc == columnRslt_pln49) doRslt_pln49_NC(info);
		else if (nc == columnRslt_act49) doRslt_act49_NC(info);
		else if (nc == columnRslt_pln50) doRslt_pln50_NC(info);
		else if (nc == columnRslt_act50) doRslt_act50_NC(info);
		else if (nc == columnRslt_pln51) doRslt_pln51_NC(info);
		else if (nc == columnRslt_act51) doRslt_act51_NC(info);
		else if (nc == columnRslt_pln52) doRslt_pln52_NC(info);
		else if (nc == columnRslt_act52) doRslt_act52_NC(info);
		else if (nc == columnRslt_pln53) doRslt_pln53_NC(info);
		else if (nc == columnRslt_act53) doRslt_act53_NC(info);
		else if (nc == columnRslt_pln54) doRslt_pln54_NC(info);
		else if (nc == columnRslt_act54) doRslt_act54_NC(info);
		else if (nc == columnRslt_pln55) doRslt_pln55_NC(info);
		else if (nc == columnRslt_act55) doRslt_act55_NC(info);
		else if (nc == columnRslt_pln56) doRslt_pln56_NC(info);
		else if (nc == columnRslt_act56) doRslt_act56_NC(info);
		else if (nc == columnRslt_pln57) doRslt_pln57_NC(info);
		else if (nc == columnRslt_act57) doRslt_act57_NC(info);
		else if (nc == columnRslt_pln58) doRslt_pln58_NC(info);
		else if (nc == columnRslt_act58) doRslt_act58_NC(info);
		else if (nc == columnRslt_pln59) doRslt_pln59_NC(info);
		else if (nc == columnRslt_act59) doRslt_act59_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_typ_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pln_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_alc_rate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[alc_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term00_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term01_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term02_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term03_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term04_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln00_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act00_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln01_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act01_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln02_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act02_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln03_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act03_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln04_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act04_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln05_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act05_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln06_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act06_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln07_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act07_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln08_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act08_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln09_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act09_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln11_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act11_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln12_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act12_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln13_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act13_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln14_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act14_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln15_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act15_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln16_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act16_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln17_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act17_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln18_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act18_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln19_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act19_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln20_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act20_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln21]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln21_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act21]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act21_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln22]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln22_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act22]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act22_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln23]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln23_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act23]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act23_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln24]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln24_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act24]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act24_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln25]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln25_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act25]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act25_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln26]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln26_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act26]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act26_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln27]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln27_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act27]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act27_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln28]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln28_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act28]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act28_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln29]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln29_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act29]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act29_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln30]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln30_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act30]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act30_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln31]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln31_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act31]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act31_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln32]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln32_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act32]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act32_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln33]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln33_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act33]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act33_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln34]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln34_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act34]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act34_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln35]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln35_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act35]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act35_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln36]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln36_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act36]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act36_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln37]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln37_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act37]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act37_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln38]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln38_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act38]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act38_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln39]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln39_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act39]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act39_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln40]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln40_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act40]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act40_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln41]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln41_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act41]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act41_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln42]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln42_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act42]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act42_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln43]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln43_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act43]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act43_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln44]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln44_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act44]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act44_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln45]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln45_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act45]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act45_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln46]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln46_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act46]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act46_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln47]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln47_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act47]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act47_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln48]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln48_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act48]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act48_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln49]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln49_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act49]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act49_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln50]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln50_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act50]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act50_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln51]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln51_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act51]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act51_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln52]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln52_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act52]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act52_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln53]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln53_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act53]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act53_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln54]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln54_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act54]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act54_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln55]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln55_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act55]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act55_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln56]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln56_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act56]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act56_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln57]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln57_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act57]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act57_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln58]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln58_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act58]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act58_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln59]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln59_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act59]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act59_NC(MCEventInfo info){
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
		else if (ne == Cnd_typ_Group) doCnd_typ_NE(info);
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_ym_fr) doCnd_ym_fr_NE(info);
		else if (ne == Cnd_ym_to) doCnd_ym_to_NE(info);
		else if (ne == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_NE(info);
		else if (ne == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_NE(info);
		else if (ne == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NE(info);
		else if (ne == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_NE(info);
		else if (ne == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_NE(info);
		else if (ne == Cnd_pre_alc_ptn_cd) doCnd_pre_alc_ptn_cd_NE(info);
		else if (ne == Cnd_pre_alc_ptn_nm) doCnd_pre_alc_ptn_nm_NE(info);
		else if (ne == Cnd_dpt_alc_typ) doCnd_dpt_alc_typ_NE(info);
		else if (ne == Cnd_loc_alc_typ) doCnd_loc_alc_typ_NE(info);
		else if (ne == Cnd_oper_alc_typ) doCnd_oper_alc_typ_NE(info);
		else if (ne == Cnd_bp_alc_typ) doCnd_bp_alc_typ_NE(info);
		else if (ne == Cnd_ctg_alc_typ) doCnd_ctg_alc_typ_NE(info);
		else if (ne == Cnd_itm_alc_typ) doCnd_itm_alc_typ_NE(info);
		else if (ne == Cnd_lot_alc_typ) doCnd_lot_alc_typ_NE(info);
		else if (ne == Cnd_sublot_alc_typ) doCnd_sublot_alc_typ_NE(info);
		else if (ne == Cnd_sno1_alc_typ) doCnd_sno1_alc_typ_NE(info);
		else if (ne == Cnd_sno2_alc_typ) doCnd_sno2_alc_typ_NE(info);
		else if (ne == Cnd_sno3_alc_typ) doCnd_sno3_alc_typ_NE(info);
		else if (ne == Cnd_sno4_alc_typ) doCnd_sno4_alc_typ_NE(info);
		else if (ne == Cnd_inst_alc_typ) doCnd_inst_alc_typ_NE(info);
		else if (ne == Cnd_iv_alc_typ) doCnd_iv_alc_typ_NE(info);
		else if (ne == Cnd_po_alc_typ) doCnd_po_alc_typ_NE(info);
		else if (ne == Cnd_slo_alc_typ) doCnd_slo_alc_typ_NE(info);
		else if (ne == Cnd_alc_ac_alc_typ) doCnd_alc_ac_alc_typ_NE(info);
		else if (ne == Cnd_wg_alc_typ) doCnd_wg_alc_typ_NE(info);
		else if (ne == columnRslt_dpt_cd) doRslt_dpt_cd_NE(info);
		else if (ne == columnRslt_dpt_nm) doRslt_dpt_nm_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_oper_cd) doRslt_oper_cd_NE(info);
		else if (ne == columnRslt_oper_nm) doRslt_oper_nm_NE(info);
		else if (ne == columnRslt_bp_cd) doRslt_bp_cd_NE(info);
		else if (ne == columnRslt_bp_nm) doRslt_bp_nm_NE(info);
		else if (ne == columnRslt_ctg_cd) doRslt_ctg_cd_NE(info);
		else if (ne == columnRslt_ctg_nm) doRslt_ctg_nm_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_sno1) doRslt_sno1_NE(info);
		else if (ne == columnRslt_sno2) doRslt_sno2_NE(info);
		else if (ne == columnRslt_sno3) doRslt_sno3_NE(info);
		else if (ne == columnRslt_sno4) doRslt_sno4_NE(info);
		else if (ne == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_po_no) doRslt_po_no_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_NE(info);
		else if (ne == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_NE(info);
		else if (ne == columnRslt_trd_wg_cd) doRslt_trd_wg_cd_NE(info);
		else if (ne == columnRslt_trd_wg_nm) doRslt_trd_wg_nm_NE(info);
		else if (ne == columnRslt_term00) doRslt_term00_NE(info);
		else if (ne == columnRslt_term01) doRslt_term01_NE(info);
		else if (ne == columnRslt_term02) doRslt_term02_NE(info);
		else if (ne == columnRslt_term03) doRslt_term03_NE(info);
		else if (ne == columnRslt_term04) doRslt_term04_NE(info);
		else if (ne == columnRslt_pln00) doRslt_pln00_NE(info);
		else if (ne == columnRslt_act00) doRslt_act00_NE(info);
		else if (ne == columnRslt_pln01) doRslt_pln01_NE(info);
		else if (ne == columnRslt_act01) doRslt_act01_NE(info);
		else if (ne == columnRslt_pln02) doRslt_pln02_NE(info);
		else if (ne == columnRslt_act02) doRslt_act02_NE(info);
		else if (ne == columnRslt_pln03) doRslt_pln03_NE(info);
		else if (ne == columnRslt_act03) doRslt_act03_NE(info);
		else if (ne == columnRslt_pln04) doRslt_pln04_NE(info);
		else if (ne == columnRslt_act04) doRslt_act04_NE(info);
		else if (ne == columnRslt_pln05) doRslt_pln05_NE(info);
		else if (ne == columnRslt_act05) doRslt_act05_NE(info);
		else if (ne == columnRslt_pln06) doRslt_pln06_NE(info);
		else if (ne == columnRslt_act06) doRslt_act06_NE(info);
		else if (ne == columnRslt_pln07) doRslt_pln07_NE(info);
		else if (ne == columnRslt_act07) doRslt_act07_NE(info);
		else if (ne == columnRslt_pln08) doRslt_pln08_NE(info);
		else if (ne == columnRslt_act08) doRslt_act08_NE(info);
		else if (ne == columnRslt_pln09) doRslt_pln09_NE(info);
		else if (ne == columnRslt_act09) doRslt_act09_NE(info);
		else if (ne == columnRslt_pln10) doRslt_pln10_NE(info);
		else if (ne == columnRslt_act10) doRslt_act10_NE(info);
		else if (ne == columnRslt_pln11) doRslt_pln11_NE(info);
		else if (ne == columnRslt_act11) doRslt_act11_NE(info);
		else if (ne == columnRslt_pln12) doRslt_pln12_NE(info);
		else if (ne == columnRslt_act12) doRslt_act12_NE(info);
		else if (ne == columnRslt_pln13) doRslt_pln13_NE(info);
		else if (ne == columnRslt_act13) doRslt_act13_NE(info);
		else if (ne == columnRslt_pln14) doRslt_pln14_NE(info);
		else if (ne == columnRslt_act14) doRslt_act14_NE(info);
		else if (ne == columnRslt_pln15) doRslt_pln15_NE(info);
		else if (ne == columnRslt_act15) doRslt_act15_NE(info);
		else if (ne == columnRslt_pln16) doRslt_pln16_NE(info);
		else if (ne == columnRslt_act16) doRslt_act16_NE(info);
		else if (ne == columnRslt_pln17) doRslt_pln17_NE(info);
		else if (ne == columnRslt_act17) doRslt_act17_NE(info);
		else if (ne == columnRslt_pln18) doRslt_pln18_NE(info);
		else if (ne == columnRslt_act18) doRslt_act18_NE(info);
		else if (ne == columnRslt_pln19) doRslt_pln19_NE(info);
		else if (ne == columnRslt_act19) doRslt_act19_NE(info);
		else if (ne == columnRslt_pln20) doRslt_pln20_NE(info);
		else if (ne == columnRslt_act20) doRslt_act20_NE(info);
		else if (ne == columnRslt_pln21) doRslt_pln21_NE(info);
		else if (ne == columnRslt_act21) doRslt_act21_NE(info);
		else if (ne == columnRslt_pln22) doRslt_pln22_NE(info);
		else if (ne == columnRslt_act22) doRslt_act22_NE(info);
		else if (ne == columnRslt_pln23) doRslt_pln23_NE(info);
		else if (ne == columnRslt_act23) doRslt_act23_NE(info);
		else if (ne == columnRslt_pln24) doRslt_pln24_NE(info);
		else if (ne == columnRslt_act24) doRslt_act24_NE(info);
		else if (ne == columnRslt_pln25) doRslt_pln25_NE(info);
		else if (ne == columnRslt_act25) doRslt_act25_NE(info);
		else if (ne == columnRslt_pln26) doRslt_pln26_NE(info);
		else if (ne == columnRslt_act26) doRslt_act26_NE(info);
		else if (ne == columnRslt_pln27) doRslt_pln27_NE(info);
		else if (ne == columnRslt_act27) doRslt_act27_NE(info);
		else if (ne == columnRslt_pln28) doRslt_pln28_NE(info);
		else if (ne == columnRslt_act28) doRslt_act28_NE(info);
		else if (ne == columnRslt_pln29) doRslt_pln29_NE(info);
		else if (ne == columnRslt_act29) doRslt_act29_NE(info);
		else if (ne == columnRslt_pln30) doRslt_pln30_NE(info);
		else if (ne == columnRslt_act30) doRslt_act30_NE(info);
		else if (ne == columnRslt_pln31) doRslt_pln31_NE(info);
		else if (ne == columnRslt_act31) doRslt_act31_NE(info);
		else if (ne == columnRslt_pln32) doRslt_pln32_NE(info);
		else if (ne == columnRslt_act32) doRslt_act32_NE(info);
		else if (ne == columnRslt_pln33) doRslt_pln33_NE(info);
		else if (ne == columnRslt_act33) doRslt_act33_NE(info);
		else if (ne == columnRslt_pln34) doRslt_pln34_NE(info);
		else if (ne == columnRslt_act34) doRslt_act34_NE(info);
		else if (ne == columnRslt_pln35) doRslt_pln35_NE(info);
		else if (ne == columnRslt_act35) doRslt_act35_NE(info);
		else if (ne == columnRslt_pln36) doRslt_pln36_NE(info);
		else if (ne == columnRslt_act36) doRslt_act36_NE(info);
		else if (ne == columnRslt_pln37) doRslt_pln37_NE(info);
		else if (ne == columnRslt_act37) doRslt_act37_NE(info);
		else if (ne == columnRslt_pln38) doRslt_pln38_NE(info);
		else if (ne == columnRslt_act38) doRslt_act38_NE(info);
		else if (ne == columnRslt_pln39) doRslt_pln39_NE(info);
		else if (ne == columnRslt_act39) doRslt_act39_NE(info);
		else if (ne == columnRslt_pln40) doRslt_pln40_NE(info);
		else if (ne == columnRslt_act40) doRslt_act40_NE(info);
		else if (ne == columnRslt_pln41) doRslt_pln41_NE(info);
		else if (ne == columnRslt_act41) doRslt_act41_NE(info);
		else if (ne == columnRslt_pln42) doRslt_pln42_NE(info);
		else if (ne == columnRslt_act42) doRslt_act42_NE(info);
		else if (ne == columnRslt_pln43) doRslt_pln43_NE(info);
		else if (ne == columnRslt_act43) doRslt_act43_NE(info);
		else if (ne == columnRslt_pln44) doRslt_pln44_NE(info);
		else if (ne == columnRslt_act44) doRslt_act44_NE(info);
		else if (ne == columnRslt_pln45) doRslt_pln45_NE(info);
		else if (ne == columnRslt_act45) doRslt_act45_NE(info);
		else if (ne == columnRslt_pln46) doRslt_pln46_NE(info);
		else if (ne == columnRslt_act46) doRslt_act46_NE(info);
		else if (ne == columnRslt_pln47) doRslt_pln47_NE(info);
		else if (ne == columnRslt_act47) doRslt_act47_NE(info);
		else if (ne == columnRslt_pln48) doRslt_pln48_NE(info);
		else if (ne == columnRslt_act48) doRslt_act48_NE(info);
		else if (ne == columnRslt_pln49) doRslt_pln49_NE(info);
		else if (ne == columnRslt_act49) doRslt_act49_NE(info);
		else if (ne == columnRslt_pln50) doRslt_pln50_NE(info);
		else if (ne == columnRslt_act50) doRslt_act50_NE(info);
		else if (ne == columnRslt_pln51) doRslt_pln51_NE(info);
		else if (ne == columnRslt_act51) doRslt_act51_NE(info);
		else if (ne == columnRslt_pln52) doRslt_pln52_NE(info);
		else if (ne == columnRslt_act52) doRslt_act52_NE(info);
		else if (ne == columnRslt_pln53) doRslt_pln53_NE(info);
		else if (ne == columnRslt_act53) doRslt_act53_NE(info);
		else if (ne == columnRslt_pln54) doRslt_pln54_NE(info);
		else if (ne == columnRslt_act54) doRslt_act54_NE(info);
		else if (ne == columnRslt_pln55) doRslt_pln55_NE(info);
		else if (ne == columnRslt_act55) doRslt_act55_NE(info);
		else if (ne == columnRslt_pln56) doRslt_pln56_NE(info);
		else if (ne == columnRslt_act56) doRslt_act56_NE(info);
		else if (ne == columnRslt_pln57) doRslt_pln57_NE(info);
		else if (ne == columnRslt_act57) doRslt_act57_NE(info);
		else if (ne == columnRslt_pln58) doRslt_pln58_NE(info);
		else if (ne == columnRslt_act58) doRslt_act58_NE(info);
		else if (ne == columnRslt_pln59) doRslt_pln59_NE(info);
		else if (ne == columnRslt_act59) doRslt_act59_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_typ_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pln_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_alc_rate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[alc_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term00_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term01_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term02_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term03_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term04_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln00_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act00_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln01_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act01_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln02_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act02_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln03_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act03_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln04_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act04_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln05_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act05_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln06_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act06_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln07_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act07_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln08_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act08_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln09_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act09_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln11_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act11_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln12_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act12_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln13_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act13_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln14_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act14_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln15_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act15_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln16_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act16_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln17_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act17_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln18_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act18_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln19_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act19_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln20_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act20_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln21]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln21_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act21]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act21_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln22]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln22_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act22]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act22_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln23]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln23_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act23]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act23_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln24]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln24_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act24]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act24_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln25]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln25_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act25]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act25_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln26]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln26_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act26]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act26_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln27]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln27_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act27]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act27_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln28]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln28_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act28]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act28_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln29]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln29_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act29]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act29_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln30]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln30_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act30]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act30_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln31]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln31_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act31]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act31_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln32]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln32_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act32]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act32_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln33]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln33_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act33]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act33_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln34]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln34_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act34]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act34_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln35]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln35_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act35]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act35_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln36]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln36_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act36]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act36_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln37]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln37_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act37]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act37_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln38]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln38_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act38]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act38_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln39]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln39_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act39]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act39_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln40]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln40_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act40]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act40_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln41]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln41_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act41]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act41_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln42]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln42_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act42]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act42_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln43]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln43_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act43]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act43_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln44]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln44_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act44]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act44_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln45]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln45_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act45]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act45_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln46]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln46_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act46]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act46_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln47]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln47_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act47]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act47_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln48]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln48_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act48]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act48_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln49]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln49_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act49]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act49_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln50]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln50_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act50]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act50_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln51]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln51_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act51]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act51_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln52]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln52_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act52]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act52_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln53]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln53_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act53]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act53_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln54]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln54_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act54]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act54_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln55]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln55_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act55]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act55_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln56]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln56_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act56]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act56_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln57]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln57_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act57]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act57_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln58]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln58_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act58]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act58_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln59]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln59_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act59]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act59_NE(MCEventInfo info){
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
		else if (nx == Cnd_typ_Group) doCnd_typ_NX(info);
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_ym_fr) doCnd_ym_fr_NX(info);
		else if (nx == Cnd_ym_to) doCnd_ym_to_NX(info);
		else if (nx == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_NX(info);
		else if (nx == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_NX(info);
		else if (nx == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_NX(info);
		else if (nx == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_NX(info);
		else if (nx == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_NX(info);
		else if (nx == Cnd_pre_alc_ptn_cd) doCnd_pre_alc_ptn_cd_NX(info);
		else if (nx == Cnd_pre_alc_ptn_nm) doCnd_pre_alc_ptn_nm_NX(info);
		else if (nx == Cnd_dpt_alc_typ) doCnd_dpt_alc_typ_NX(info);
		else if (nx == Cnd_loc_alc_typ) doCnd_loc_alc_typ_NX(info);
		else if (nx == Cnd_oper_alc_typ) doCnd_oper_alc_typ_NX(info);
		else if (nx == Cnd_bp_alc_typ) doCnd_bp_alc_typ_NX(info);
		else if (nx == Cnd_ctg_alc_typ) doCnd_ctg_alc_typ_NX(info);
		else if (nx == Cnd_itm_alc_typ) doCnd_itm_alc_typ_NX(info);
		else if (nx == Cnd_lot_alc_typ) doCnd_lot_alc_typ_NX(info);
		else if (nx == Cnd_sublot_alc_typ) doCnd_sublot_alc_typ_NX(info);
		else if (nx == Cnd_sno1_alc_typ) doCnd_sno1_alc_typ_NX(info);
		else if (nx == Cnd_sno2_alc_typ) doCnd_sno2_alc_typ_NX(info);
		else if (nx == Cnd_sno3_alc_typ) doCnd_sno3_alc_typ_NX(info);
		else if (nx == Cnd_sno4_alc_typ) doCnd_sno4_alc_typ_NX(info);
		else if (nx == Cnd_inst_alc_typ) doCnd_inst_alc_typ_NX(info);
		else if (nx == Cnd_iv_alc_typ) doCnd_iv_alc_typ_NX(info);
		else if (nx == Cnd_po_alc_typ) doCnd_po_alc_typ_NX(info);
		else if (nx == Cnd_slo_alc_typ) doCnd_slo_alc_typ_NX(info);
		else if (nx == Cnd_alc_ac_alc_typ) doCnd_alc_ac_alc_typ_NX(info);
		else if (nx == Cnd_wg_alc_typ) doCnd_wg_alc_typ_NX(info);
		else if (nx == columnRslt_dpt_cd) doRslt_dpt_cd_NX(info);
		else if (nx == columnRslt_dpt_nm) doRslt_dpt_nm_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_oper_cd) doRslt_oper_cd_NX(info);
		else if (nx == columnRslt_oper_nm) doRslt_oper_nm_NX(info);
		else if (nx == columnRslt_bp_cd) doRslt_bp_cd_NX(info);
		else if (nx == columnRslt_bp_nm) doRslt_bp_nm_NX(info);
		else if (nx == columnRslt_ctg_cd) doRslt_ctg_cd_NX(info);
		else if (nx == columnRslt_ctg_nm) doRslt_ctg_nm_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_sno1) doRslt_sno1_NX(info);
		else if (nx == columnRslt_sno2) doRslt_sno2_NX(info);
		else if (nx == columnRslt_sno3) doRslt_sno3_NX(info);
		else if (nx == columnRslt_sno4) doRslt_sno4_NX(info);
		else if (nx == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_po_no) doRslt_po_no_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_NX(info);
		else if (nx == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_NX(info);
		else if (nx == columnRslt_trd_wg_cd) doRslt_trd_wg_cd_NX(info);
		else if (nx == columnRslt_trd_wg_nm) doRslt_trd_wg_nm_NX(info);
		else if (nx == columnRslt_term00) doRslt_term00_NX(info);
		else if (nx == columnRslt_term01) doRslt_term01_NX(info);
		else if (nx == columnRslt_term02) doRslt_term02_NX(info);
		else if (nx == columnRslt_term03) doRslt_term03_NX(info);
		else if (nx == columnRslt_term04) doRslt_term04_NX(info);
		else if (nx == columnRslt_pln00) doRslt_pln00_NX(info);
		else if (nx == columnRslt_act00) doRslt_act00_NX(info);
		else if (nx == columnRslt_pln01) doRslt_pln01_NX(info);
		else if (nx == columnRslt_act01) doRslt_act01_NX(info);
		else if (nx == columnRslt_pln02) doRslt_pln02_NX(info);
		else if (nx == columnRslt_act02) doRslt_act02_NX(info);
		else if (nx == columnRslt_pln03) doRslt_pln03_NX(info);
		else if (nx == columnRslt_act03) doRslt_act03_NX(info);
		else if (nx == columnRslt_pln04) doRslt_pln04_NX(info);
		else if (nx == columnRslt_act04) doRslt_act04_NX(info);
		else if (nx == columnRslt_pln05) doRslt_pln05_NX(info);
		else if (nx == columnRslt_act05) doRslt_act05_NX(info);
		else if (nx == columnRslt_pln06) doRslt_pln06_NX(info);
		else if (nx == columnRslt_act06) doRslt_act06_NX(info);
		else if (nx == columnRslt_pln07) doRslt_pln07_NX(info);
		else if (nx == columnRslt_act07) doRslt_act07_NX(info);
		else if (nx == columnRslt_pln08) doRslt_pln08_NX(info);
		else if (nx == columnRslt_act08) doRslt_act08_NX(info);
		else if (nx == columnRslt_pln09) doRslt_pln09_NX(info);
		else if (nx == columnRslt_act09) doRslt_act09_NX(info);
		else if (nx == columnRslt_pln10) doRslt_pln10_NX(info);
		else if (nx == columnRslt_act10) doRslt_act10_NX(info);
		else if (nx == columnRslt_pln11) doRslt_pln11_NX(info);
		else if (nx == columnRslt_act11) doRslt_act11_NX(info);
		else if (nx == columnRslt_pln12) doRslt_pln12_NX(info);
		else if (nx == columnRslt_act12) doRslt_act12_NX(info);
		else if (nx == columnRslt_pln13) doRslt_pln13_NX(info);
		else if (nx == columnRslt_act13) doRslt_act13_NX(info);
		else if (nx == columnRslt_pln14) doRslt_pln14_NX(info);
		else if (nx == columnRslt_act14) doRslt_act14_NX(info);
		else if (nx == columnRslt_pln15) doRslt_pln15_NX(info);
		else if (nx == columnRslt_act15) doRslt_act15_NX(info);
		else if (nx == columnRslt_pln16) doRslt_pln16_NX(info);
		else if (nx == columnRslt_act16) doRslt_act16_NX(info);
		else if (nx == columnRslt_pln17) doRslt_pln17_NX(info);
		else if (nx == columnRslt_act17) doRslt_act17_NX(info);
		else if (nx == columnRslt_pln18) doRslt_pln18_NX(info);
		else if (nx == columnRslt_act18) doRslt_act18_NX(info);
		else if (nx == columnRslt_pln19) doRslt_pln19_NX(info);
		else if (nx == columnRslt_act19) doRslt_act19_NX(info);
		else if (nx == columnRslt_pln20) doRslt_pln20_NX(info);
		else if (nx == columnRslt_act20) doRslt_act20_NX(info);
		else if (nx == columnRslt_pln21) doRslt_pln21_NX(info);
		else if (nx == columnRslt_act21) doRslt_act21_NX(info);
		else if (nx == columnRslt_pln22) doRslt_pln22_NX(info);
		else if (nx == columnRslt_act22) doRslt_act22_NX(info);
		else if (nx == columnRslt_pln23) doRslt_pln23_NX(info);
		else if (nx == columnRslt_act23) doRslt_act23_NX(info);
		else if (nx == columnRslt_pln24) doRslt_pln24_NX(info);
		else if (nx == columnRslt_act24) doRslt_act24_NX(info);
		else if (nx == columnRslt_pln25) doRslt_pln25_NX(info);
		else if (nx == columnRslt_act25) doRslt_act25_NX(info);
		else if (nx == columnRslt_pln26) doRslt_pln26_NX(info);
		else if (nx == columnRslt_act26) doRslt_act26_NX(info);
		else if (nx == columnRslt_pln27) doRslt_pln27_NX(info);
		else if (nx == columnRslt_act27) doRslt_act27_NX(info);
		else if (nx == columnRslt_pln28) doRslt_pln28_NX(info);
		else if (nx == columnRslt_act28) doRslt_act28_NX(info);
		else if (nx == columnRslt_pln29) doRslt_pln29_NX(info);
		else if (nx == columnRslt_act29) doRslt_act29_NX(info);
		else if (nx == columnRslt_pln30) doRslt_pln30_NX(info);
		else if (nx == columnRslt_act30) doRslt_act30_NX(info);
		else if (nx == columnRslt_pln31) doRslt_pln31_NX(info);
		else if (nx == columnRslt_act31) doRslt_act31_NX(info);
		else if (nx == columnRslt_pln32) doRslt_pln32_NX(info);
		else if (nx == columnRslt_act32) doRslt_act32_NX(info);
		else if (nx == columnRslt_pln33) doRslt_pln33_NX(info);
		else if (nx == columnRslt_act33) doRslt_act33_NX(info);
		else if (nx == columnRslt_pln34) doRslt_pln34_NX(info);
		else if (nx == columnRslt_act34) doRslt_act34_NX(info);
		else if (nx == columnRslt_pln35) doRslt_pln35_NX(info);
		else if (nx == columnRslt_act35) doRslt_act35_NX(info);
		else if (nx == columnRslt_pln36) doRslt_pln36_NX(info);
		else if (nx == columnRslt_act36) doRslt_act36_NX(info);
		else if (nx == columnRslt_pln37) doRslt_pln37_NX(info);
		else if (nx == columnRslt_act37) doRslt_act37_NX(info);
		else if (nx == columnRslt_pln38) doRslt_pln38_NX(info);
		else if (nx == columnRslt_act38) doRslt_act38_NX(info);
		else if (nx == columnRslt_pln39) doRslt_pln39_NX(info);
		else if (nx == columnRslt_act39) doRslt_act39_NX(info);
		else if (nx == columnRslt_pln40) doRslt_pln40_NX(info);
		else if (nx == columnRslt_act40) doRslt_act40_NX(info);
		else if (nx == columnRslt_pln41) doRslt_pln41_NX(info);
		else if (nx == columnRslt_act41) doRslt_act41_NX(info);
		else if (nx == columnRslt_pln42) doRslt_pln42_NX(info);
		else if (nx == columnRslt_act42) doRslt_act42_NX(info);
		else if (nx == columnRslt_pln43) doRslt_pln43_NX(info);
		else if (nx == columnRslt_act43) doRslt_act43_NX(info);
		else if (nx == columnRslt_pln44) doRslt_pln44_NX(info);
		else if (nx == columnRslt_act44) doRslt_act44_NX(info);
		else if (nx == columnRslt_pln45) doRslt_pln45_NX(info);
		else if (nx == columnRslt_act45) doRslt_act45_NX(info);
		else if (nx == columnRslt_pln46) doRslt_pln46_NX(info);
		else if (nx == columnRslt_act46) doRslt_act46_NX(info);
		else if (nx == columnRslt_pln47) doRslt_pln47_NX(info);
		else if (nx == columnRslt_act47) doRslt_act47_NX(info);
		else if (nx == columnRslt_pln48) doRslt_pln48_NX(info);
		else if (nx == columnRslt_act48) doRslt_act48_NX(info);
		else if (nx == columnRslt_pln49) doRslt_pln49_NX(info);
		else if (nx == columnRslt_act49) doRslt_act49_NX(info);
		else if (nx == columnRslt_pln50) doRslt_pln50_NX(info);
		else if (nx == columnRslt_act50) doRslt_act50_NX(info);
		else if (nx == columnRslt_pln51) doRslt_pln51_NX(info);
		else if (nx == columnRslt_act51) doRslt_act51_NX(info);
		else if (nx == columnRslt_pln52) doRslt_pln52_NX(info);
		else if (nx == columnRslt_act52) doRslt_act52_NX(info);
		else if (nx == columnRslt_pln53) doRslt_pln53_NX(info);
		else if (nx == columnRslt_act53) doRslt_act53_NX(info);
		else if (nx == columnRslt_pln54) doRslt_pln54_NX(info);
		else if (nx == columnRslt_act54) doRslt_act54_NX(info);
		else if (nx == columnRslt_pln55) doRslt_pln55_NX(info);
		else if (nx == columnRslt_act55) doRslt_act55_NX(info);
		else if (nx == columnRslt_pln56) doRslt_pln56_NX(info);
		else if (nx == columnRslt_act56) doRslt_act56_NX(info);
		else if (nx == columnRslt_pln57) doRslt_pln57_NX(info);
		else if (nx == columnRslt_act57) doRslt_act57_NX(info);
		else if (nx == columnRslt_pln58) doRslt_pln58_NX(info);
		else if (nx == columnRslt_act58) doRslt_act58_NX(info);
		else if (nx == columnRslt_pln59) doRslt_pln59_NX(info);
		else if (nx == columnRslt_act59) doRslt_act59_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_typ_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pln_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_alc_rate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[alc_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term00_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term01_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term02_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term03_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term04_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln00_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act00_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln01_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act01_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln02_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act02_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln03_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act03_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln04_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act04_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln05_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act05_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln06_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act06_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln07_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act07_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln08_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act08_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln09_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act09_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln11_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act11_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln12_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act12_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln13_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act13_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln14_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act14_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln15_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act15_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln16_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act16_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln17_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act17_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln18_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act18_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln19_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act19_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln20_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act20_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln21]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln21_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act21]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act21_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln22]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln22_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act22]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act22_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln23]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln23_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act23]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act23_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln24]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln24_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act24]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act24_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln25]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln25_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act25]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act25_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln26]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln26_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act26]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act26_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln27]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln27_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act27]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act27_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln28]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln28_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act28]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act28_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln29]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln29_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act29]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act29_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln30]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln30_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act30]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act30_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln31]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln31_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act31]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act31_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln32]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln32_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act32]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act32_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln33]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln33_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act33]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act33_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln34]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln34_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act34]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act34_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln35]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln35_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act35]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act35_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln36]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln36_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act36]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act36_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln37]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln37_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act37]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act37_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln38]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln38_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act38]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act38_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln39]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln39_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act39]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act39_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln40]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln40_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act40]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act40_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln41]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln41_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act41]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act41_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln42]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln42_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act42]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act42_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln43]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln43_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act43]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act43_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln44]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln44_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act44]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act44_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln45]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln45_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act45]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act45_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln46]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln46_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act46]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act46_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln47]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln47_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act47]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act47_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln48]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln48_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act48]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act48_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln49]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln49_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act49]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act49_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln50]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln50_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act50]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act50_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln51]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln51_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act51]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act51_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln52]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln52_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act52]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act52_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln53]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln53_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act53]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act53_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln54]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln54_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act54]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act54_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln55]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln55_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act55]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act55_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln56]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln56_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act56]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act56_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln57]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln57_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act57]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act57_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln58]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln58_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act58]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act58_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln59]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln59_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act59]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act59_NX(MCEventInfo info){
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
		else if (lc == Cnd_ym_fr) doCnd_ym_fr_LC(info);
		else if (lc == Cnd_ym_to) doCnd_ym_to_LC(info);
		else if (lc == Cnd_pln_calc_ctg_cd) doCnd_pln_calc_ctg_cd_LC(info);
		else if (lc == Cnd_pln_calc_ctg_nm) doCnd_pln_calc_ctg_nm_LC(info);
		else if (lc == Cnd_act_calc_ctg_cd) doCnd_act_calc_ctg_cd_LC(info);
		else if (lc == Cnd_act_calc_ctg_nm) doCnd_act_calc_ctg_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_LC(info);
		else if (lc == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_LC(info);
		else if (lc == Cnd_pre_alc_ptn_cd) doCnd_pre_alc_ptn_cd_LC(info);
		else if (lc == Cnd_pre_alc_ptn_nm) doCnd_pre_alc_ptn_nm_LC(info);
		else if (lc == Cnd_dpt_alc_typ) doCnd_dpt_alc_typ_LC(info);
		else if (lc == Cnd_loc_alc_typ) doCnd_loc_alc_typ_LC(info);
		else if (lc == Cnd_oper_alc_typ) doCnd_oper_alc_typ_LC(info);
		else if (lc == Cnd_bp_alc_typ) doCnd_bp_alc_typ_LC(info);
		else if (lc == Cnd_ctg_alc_typ) doCnd_ctg_alc_typ_LC(info);
		else if (lc == Cnd_itm_alc_typ) doCnd_itm_alc_typ_LC(info);
		else if (lc == Cnd_lot_alc_typ) doCnd_lot_alc_typ_LC(info);
		else if (lc == Cnd_sublot_alc_typ) doCnd_sublot_alc_typ_LC(info);
		else if (lc == Cnd_sno1_alc_typ) doCnd_sno1_alc_typ_LC(info);
		else if (lc == Cnd_sno2_alc_typ) doCnd_sno2_alc_typ_LC(info);
		else if (lc == Cnd_sno3_alc_typ) doCnd_sno3_alc_typ_LC(info);
		else if (lc == Cnd_sno4_alc_typ) doCnd_sno4_alc_typ_LC(info);
		else if (lc == Cnd_inst_alc_typ) doCnd_inst_alc_typ_LC(info);
		else if (lc == Cnd_iv_alc_typ) doCnd_iv_alc_typ_LC(info);
		else if (lc == Cnd_po_alc_typ) doCnd_po_alc_typ_LC(info);
		else if (lc == Cnd_slo_alc_typ) doCnd_slo_alc_typ_LC(info);
		else if (lc == Cnd_alc_ac_alc_typ) doCnd_alc_ac_alc_typ_LC(info);
		else if (lc == Cnd_wg_alc_typ) doCnd_wg_alc_typ_LC(info);
		else if (lc == columnRslt_dpt_cd) doRslt_dpt_cd_LC(info);
		else if (lc == columnRslt_dpt_nm) doRslt_dpt_nm_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_oper_cd) doRslt_oper_cd_LC(info);
		else if (lc == columnRslt_oper_nm) doRslt_oper_nm_LC(info);
		else if (lc == columnRslt_bp_cd) doRslt_bp_cd_LC(info);
		else if (lc == columnRslt_bp_nm) doRslt_bp_nm_LC(info);
		else if (lc == columnRslt_ctg_cd) doRslt_ctg_cd_LC(info);
		else if (lc == columnRslt_ctg_nm) doRslt_ctg_nm_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_sno1) doRslt_sno1_LC(info);
		else if (lc == columnRslt_sno2) doRslt_sno2_LC(info);
		else if (lc == columnRslt_sno3) doRslt_sno3_LC(info);
		else if (lc == columnRslt_sno4) doRslt_sno4_LC(info);
		else if (lc == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_po_no) doRslt_po_no_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_LC(info);
		else if (lc == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_LC(info);
		else if (lc == columnRslt_trd_wg_cd) doRslt_trd_wg_cd_LC(info);
		else if (lc == columnRslt_trd_wg_nm) doRslt_trd_wg_nm_LC(info);
		else if (lc == columnRslt_term00) doRslt_term00_LC(info);
		else if (lc == columnRslt_term01) doRslt_term01_LC(info);
		else if (lc == columnRslt_term02) doRslt_term02_LC(info);
		else if (lc == columnRslt_term03) doRslt_term03_LC(info);
		else if (lc == columnRslt_term04) doRslt_term04_LC(info);
		else if (lc == columnRslt_pln00) doRslt_pln00_LC(info);
		else if (lc == columnRslt_act00) doRslt_act00_LC(info);
		else if (lc == columnRslt_pln01) doRslt_pln01_LC(info);
		else if (lc == columnRslt_act01) doRslt_act01_LC(info);
		else if (lc == columnRslt_pln02) doRslt_pln02_LC(info);
		else if (lc == columnRslt_act02) doRslt_act02_LC(info);
		else if (lc == columnRslt_pln03) doRslt_pln03_LC(info);
		else if (lc == columnRslt_act03) doRslt_act03_LC(info);
		else if (lc == columnRslt_pln04) doRslt_pln04_LC(info);
		else if (lc == columnRslt_act04) doRslt_act04_LC(info);
		else if (lc == columnRslt_pln05) doRslt_pln05_LC(info);
		else if (lc == columnRslt_act05) doRslt_act05_LC(info);
		else if (lc == columnRslt_pln06) doRslt_pln06_LC(info);
		else if (lc == columnRslt_act06) doRslt_act06_LC(info);
		else if (lc == columnRslt_pln07) doRslt_pln07_LC(info);
		else if (lc == columnRslt_act07) doRslt_act07_LC(info);
		else if (lc == columnRslt_pln08) doRslt_pln08_LC(info);
		else if (lc == columnRslt_act08) doRslt_act08_LC(info);
		else if (lc == columnRslt_pln09) doRslt_pln09_LC(info);
		else if (lc == columnRslt_act09) doRslt_act09_LC(info);
		else if (lc == columnRslt_pln10) doRslt_pln10_LC(info);
		else if (lc == columnRslt_act10) doRslt_act10_LC(info);
		else if (lc == columnRslt_pln11) doRslt_pln11_LC(info);
		else if (lc == columnRslt_act11) doRslt_act11_LC(info);
		else if (lc == columnRslt_pln12) doRslt_pln12_LC(info);
		else if (lc == columnRslt_act12) doRslt_act12_LC(info);
		else if (lc == columnRslt_pln13) doRslt_pln13_LC(info);
		else if (lc == columnRslt_act13) doRslt_act13_LC(info);
		else if (lc == columnRslt_pln14) doRslt_pln14_LC(info);
		else if (lc == columnRslt_act14) doRslt_act14_LC(info);
		else if (lc == columnRslt_pln15) doRslt_pln15_LC(info);
		else if (lc == columnRslt_act15) doRslt_act15_LC(info);
		else if (lc == columnRslt_pln16) doRslt_pln16_LC(info);
		else if (lc == columnRslt_act16) doRslt_act16_LC(info);
		else if (lc == columnRslt_pln17) doRslt_pln17_LC(info);
		else if (lc == columnRslt_act17) doRslt_act17_LC(info);
		else if (lc == columnRslt_pln18) doRslt_pln18_LC(info);
		else if (lc == columnRslt_act18) doRslt_act18_LC(info);
		else if (lc == columnRslt_pln19) doRslt_pln19_LC(info);
		else if (lc == columnRslt_act19) doRslt_act19_LC(info);
		else if (lc == columnRslt_pln20) doRslt_pln20_LC(info);
		else if (lc == columnRslt_act20) doRslt_act20_LC(info);
		else if (lc == columnRslt_pln21) doRslt_pln21_LC(info);
		else if (lc == columnRslt_act21) doRslt_act21_LC(info);
		else if (lc == columnRslt_pln22) doRslt_pln22_LC(info);
		else if (lc == columnRslt_act22) doRslt_act22_LC(info);
		else if (lc == columnRslt_pln23) doRslt_pln23_LC(info);
		else if (lc == columnRslt_act23) doRslt_act23_LC(info);
		else if (lc == columnRslt_pln24) doRslt_pln24_LC(info);
		else if (lc == columnRslt_act24) doRslt_act24_LC(info);
		else if (lc == columnRslt_pln25) doRslt_pln25_LC(info);
		else if (lc == columnRslt_act25) doRslt_act25_LC(info);
		else if (lc == columnRslt_pln26) doRslt_pln26_LC(info);
		else if (lc == columnRslt_act26) doRslt_act26_LC(info);
		else if (lc == columnRslt_pln27) doRslt_pln27_LC(info);
		else if (lc == columnRslt_act27) doRslt_act27_LC(info);
		else if (lc == columnRslt_pln28) doRslt_pln28_LC(info);
		else if (lc == columnRslt_act28) doRslt_act28_LC(info);
		else if (lc == columnRslt_pln29) doRslt_pln29_LC(info);
		else if (lc == columnRslt_act29) doRslt_act29_LC(info);
		else if (lc == columnRslt_pln30) doRslt_pln30_LC(info);
		else if (lc == columnRslt_act30) doRslt_act30_LC(info);
		else if (lc == columnRslt_pln31) doRslt_pln31_LC(info);
		else if (lc == columnRslt_act31) doRslt_act31_LC(info);
		else if (lc == columnRslt_pln32) doRslt_pln32_LC(info);
		else if (lc == columnRslt_act32) doRslt_act32_LC(info);
		else if (lc == columnRslt_pln33) doRslt_pln33_LC(info);
		else if (lc == columnRslt_act33) doRslt_act33_LC(info);
		else if (lc == columnRslt_pln34) doRslt_pln34_LC(info);
		else if (lc == columnRslt_act34) doRslt_act34_LC(info);
		else if (lc == columnRslt_pln35) doRslt_pln35_LC(info);
		else if (lc == columnRslt_act35) doRslt_act35_LC(info);
		else if (lc == columnRslt_pln36) doRslt_pln36_LC(info);
		else if (lc == columnRslt_act36) doRslt_act36_LC(info);
		else if (lc == columnRslt_pln37) doRslt_pln37_LC(info);
		else if (lc == columnRslt_act37) doRslt_act37_LC(info);
		else if (lc == columnRslt_pln38) doRslt_pln38_LC(info);
		else if (lc == columnRslt_act38) doRslt_act38_LC(info);
		else if (lc == columnRslt_pln39) doRslt_pln39_LC(info);
		else if (lc == columnRslt_act39) doRslt_act39_LC(info);
		else if (lc == columnRslt_pln40) doRslt_pln40_LC(info);
		else if (lc == columnRslt_act40) doRslt_act40_LC(info);
		else if (lc == columnRslt_pln41) doRslt_pln41_LC(info);
		else if (lc == columnRslt_act41) doRslt_act41_LC(info);
		else if (lc == columnRslt_pln42) doRslt_pln42_LC(info);
		else if (lc == columnRslt_act42) doRslt_act42_LC(info);
		else if (lc == columnRslt_pln43) doRslt_pln43_LC(info);
		else if (lc == columnRslt_act43) doRslt_act43_LC(info);
		else if (lc == columnRslt_pln44) doRslt_pln44_LC(info);
		else if (lc == columnRslt_act44) doRslt_act44_LC(info);
		else if (lc == columnRslt_pln45) doRslt_pln45_LC(info);
		else if (lc == columnRslt_act45) doRslt_act45_LC(info);
		else if (lc == columnRslt_pln46) doRslt_pln46_LC(info);
		else if (lc == columnRslt_act46) doRslt_act46_LC(info);
		else if (lc == columnRslt_pln47) doRslt_pln47_LC(info);
		else if (lc == columnRslt_act47) doRslt_act47_LC(info);
		else if (lc == columnRslt_pln48) doRslt_pln48_LC(info);
		else if (lc == columnRslt_act48) doRslt_act48_LC(info);
		else if (lc == columnRslt_pln49) doRslt_pln49_LC(info);
		else if (lc == columnRslt_act49) doRslt_act49_LC(info);
		else if (lc == columnRslt_pln50) doRslt_pln50_LC(info);
		else if (lc == columnRslt_act50) doRslt_act50_LC(info);
		else if (lc == columnRslt_pln51) doRslt_pln51_LC(info);
		else if (lc == columnRslt_act51) doRslt_act51_LC(info);
		else if (lc == columnRslt_pln52) doRslt_pln52_LC(info);
		else if (lc == columnRslt_act52) doRslt_act52_LC(info);
		else if (lc == columnRslt_pln53) doRslt_pln53_LC(info);
		else if (lc == columnRslt_act53) doRslt_act53_LC(info);
		else if (lc == columnRslt_pln54) doRslt_pln54_LC(info);
		else if (lc == columnRslt_act54) doRslt_act54_LC(info);
		else if (lc == columnRslt_pln55) doRslt_pln55_LC(info);
		else if (lc == columnRslt_act55) doRslt_act55_LC(info);
		else if (lc == columnRslt_pln56) doRslt_pln56_LC(info);
		else if (lc == columnRslt_act56) doRslt_act56_LC(info);
		else if (lc == columnRslt_pln57) doRslt_pln57_LC(info);
		else if (lc == columnRslt_act57) doRslt_act57_LC(info);
		else if (lc == columnRslt_pln58) doRslt_pln58_LC(info);
		else if (lc == columnRslt_act58) doRslt_act58_LC(info);
		else if (lc == columnRslt_pln59) doRslt_pln59_LC(info);
		else if (lc == columnRslt_act59) doRslt_act59_LC(info);
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
	 * [Cnd]パネルの[pln_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pln_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pln_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_calc_ctg_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_alc_rate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[alc_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term00_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term01_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term02_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term03_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term04_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln00_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act00_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln01_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act01_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln02_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act02_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln03_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act03_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln04_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act04_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln05_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act05_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln06_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act06_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln07_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act07_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln08_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act08_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln09_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act09_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln11_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act11_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln12_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act12_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln13_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act13_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln14_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act14_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln15_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act15_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln16_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act16_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln17_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act17_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln18_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act18_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln19_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act19_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln20_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act20_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln21]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln21_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act21]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act21_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln22]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln22_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act22]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act22_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln23]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln23_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act23]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act23_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln24]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln24_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act24]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act24_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln25]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln25_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act25]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act25_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln26]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln26_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act26]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act26_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln27]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln27_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act27]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act27_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln28]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln28_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act28]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act28_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln29]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln29_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act29]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act29_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln30]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln30_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act30]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act30_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln31]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln31_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act31]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act31_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln32]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln32_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act32]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act32_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln33]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln33_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act33]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act33_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln34]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln34_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act34]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act34_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln35]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln35_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act35]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act35_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln36]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln36_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act36]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act36_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln37]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln37_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act37]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act37_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln38]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln38_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act38]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act38_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln39]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln39_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act39]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act39_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln40]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln40_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act40]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act40_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln41]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln41_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act41]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act41_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln42]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln42_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act42]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act42_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln43]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln43_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act43]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act43_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln44]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln44_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act44]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act44_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln45]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln45_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act45]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act45_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln46]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln46_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act46]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act46_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln47]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln47_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act47]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act47_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln48]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln48_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act48]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act48_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln49]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln49_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act49]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act49_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln50]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln50_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act50]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act50_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln51]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln51_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act51]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act51_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln52]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln52_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act52]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act52_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln53]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln53_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act53]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act53_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln54]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln54_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act54]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act54_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln55]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln55_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act55]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act55_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln56]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln56_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act56]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act56_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln57]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln57_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act57]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act57_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln58]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln58_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act58]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act58_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pln59]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pln59_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act59]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act59_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pln_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_pln_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_act_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_act_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pre_alc_rate_cd]の作成メソッド
	 */
	public MCList getCnd_pre_alc_rate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getPreAlcRateWithPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pre_alc_ptn_cd]の作成メソッド
	 */
	public MCList getCnd_pre_alc_ptn_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBGL0150.Srch01")) {
			return new MG_MGBGL0150_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBGL0150_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0150_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0150_Srch01;

		/** コンストラクタ */
		protected MG_MGBGL0150_Srch01Bridge() {
			p_MG_MGBGL0150_Srch01 = new MCParam(PDef.MG_MGBGL0150_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0150_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBG.MGBGP0150.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0150.RsltR.class));

			p_MG_MGBGL0150_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0150_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0150_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0150_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0150_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBG.MGBGP0150.CndR up0() {
			return (mcframe.clientMGBG.MGBGP0150.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBG.MGBGP0150.RsltR> down0() {
			return (MCList<mcframe.clientMGBG.MGBGP0150.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBGL0150_Srch01.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0150.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBGL0150_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBG.MGBGP0150.RsltR>)p_MG_MGBGL0150_Srch01.getContainerParam().getDownBlock(0));
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