package mcframe.clientMSBC.MSBCP0290;

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
import mcframe.clientMSBC.MSBCP0290.MSBCP_ItmOrdGanttChart_MC.MS_MSBCL0290_Srch01Caller;
import mcframe.clientMSBC.MSBCP0290.MSBCP_ItmOrdGanttChart_MC.MS_MSBCL0290_Upd01Caller;

/**
 * 画面"MSBCP_ItmOrdGanttChart"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_ItmOrdGanttChart_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBCP0290";

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
	// [Cnd1]ブロック関連のField定義
	public MCPanel Cnd1Panel = null;
	public MCTitledBorder Cnd1TitledBorder = null;
	// [Cnd1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Cnd3]ブロック関連のField定義
	public MCPanel Cnd3Panel = null;
	// [Cnd3]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
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
	 * Allocation schedule classification 引当予定種類.<p>
	 *
	 */
	public MCLabel Cnd_alloc_pln_r_label = null;
	/**
	 * NRML,Normal;PRCD,Long LT;SIM,Simulation;NO,Do not search NRML,通常;PRCD,先行手配;SIM,シミュレーション;NO,検索しない.<p>
	 *
	 */
	public MCButtonGroup Cnd_alloc_pln_r_view_Group = null;
	public MCRadioButton Cnd_alloc_pln_r_view_NRML = null;
	public MCRadioButton Cnd_alloc_pln_r_view_PRCD = null;
	public MCRadioButton Cnd_alloc_pln_r_view_SIM = null;
	public MCRadioButton Cnd_alloc_pln_r_view_NO = null;
	public mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S Cnd_itm_grp_p_PPanel;
	public MCCheckBox Cnd_itm_grp_flg1;	// [Cnd]の[itm_grp_p.itm_grp_flg1]を[Cnd_itm_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd1;	// [Cnd]の[itm_grp_p.itm_grp_cd1]を[Cnd_itm_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm1;	// [Cnd]の[itm_grp_p.itm_grp_nm1]を[Cnd_itm_grp_nm1]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg2;	// [Cnd]の[itm_grp_p.itm_grp_flg2]を[Cnd_itm_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd2;	// [Cnd]の[itm_grp_p.itm_grp_cd2]を[Cnd_itm_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm2;	// [Cnd]の[itm_grp_p.itm_grp_nm2]を[Cnd_itm_grp_nm2]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg3;	// [Cnd]の[itm_grp_p.itm_grp_flg3]を[Cnd_itm_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd3;	// [Cnd]の[itm_grp_p.itm_grp_cd3]を[Cnd_itm_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm3;	// [Cnd]の[itm_grp_p.itm_grp_nm3]を[Cnd_itm_grp_nm3]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg4;	// [Cnd]の[itm_grp_p.itm_grp_flg4]を[Cnd_itm_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd4;	// [Cnd]の[itm_grp_p.itm_grp_cd4]を[Cnd_itm_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm4;	// [Cnd]の[itm_grp_p.itm_grp_nm4]を[Cnd_itm_grp_nm4]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg5;	// [Cnd]の[itm_grp_p.itm_grp_flg5]を[Cnd_itm_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd5;	// [Cnd]の[itm_grp_p.itm_grp_cd5]を[Cnd_itm_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm5;	// [Cnd]の[itm_grp_p.itm_grp_nm5]を[Cnd_itm_grp_nm5]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg6;	// [Cnd]の[itm_grp_p.itm_grp_flg6]を[Cnd_itm_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd6;	// [Cnd]の[itm_grp_p.itm_grp_cd6]を[Cnd_itm_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm6;	// [Cnd]の[itm_grp_p.itm_grp_nm6]を[Cnd_itm_grp_nm6]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg7;	// [Cnd]の[itm_grp_p.itm_grp_flg7]を[Cnd_itm_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd7;	// [Cnd]の[itm_grp_p.itm_grp_cd7]を[Cnd_itm_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm7;	// [Cnd]の[itm_grp_p.itm_grp_nm7]を[Cnd_itm_grp_nm7]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg8;	// [Cnd]の[itm_grp_p.itm_grp_flg8]を[Cnd_itm_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd8;	// [Cnd]の[itm_grp_p.itm_grp_cd8]を[Cnd_itm_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm8;	// [Cnd]の[itm_grp_p.itm_grp_nm8]を[Cnd_itm_grp_nm8]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg9;	// [Cnd]の[itm_grp_p.itm_grp_flg9]を[Cnd_itm_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd9;	// [Cnd]の[itm_grp_p.itm_grp_cd9]を[Cnd_itm_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm9;	// [Cnd]の[itm_grp_p.itm_grp_nm9]を[Cnd_itm_grp_nm9]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg10;	// [Cnd]の[itm_grp_p.itm_grp_flg10]を[Cnd_itm_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd10;	// [Cnd]の[itm_grp_p.itm_grp_cd10]を[Cnd_itm_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm10;	// [Cnd]の[itm_grp_p.itm_grp_nm10]を[Cnd_itm_grp_nm10]としてエイリアス定義。
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	public MCLabel LPnl_select_dt_fr_Label = null;
	/**
	 * Select period FROM 選択期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField LPnl_select_dt_fr = null;
	public MCLabel LPnl_select_dt_to_Label = null;
	/**
	 * Select period TO 選択期間ＴＯ.<p>
	 *
	 */
	public MCDateField LPnl_select_dt_to = null;
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCButton LPnl_select = null;
	/**
	 * Select related item 関連品目選択.<p>
	 *
	 */
	public MCButton LPnl_select_by_alloc_pln = null;
	/**
	 * Left 左へ.<p>
	 *
	 */
	public MCButton LPnl_move_prev_day = null;
	/**
	 * Right 右へ.<p>
	 *
	 */
	public MCButton LPnl_move_next_day = null;
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public MCButton LPnl_sts_opn = null;
	/**
	 * Save 保存.<p>
	 *
	 */
	public MCButton LPnl_sts_sav = null;
	/**
	 * Delete 削除.<p>
	 *
	 */
	public MCButton LPnl_rdel = null;
	/**
	 * Return 戻す.<p>
	 *
	 */
	public MCButton LPnl_undo = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Gantt]ブロック関連のField定義
	public MCPanel GanttPanel = null;
	public MCScrollPane GanttScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP0290.GanttR> GanttTable = null;
	// [Gantt]ブロックの項目のField定義
	// [RsltDisp]ブロック関連のField定義
	public MCPanel RsltDispPanel = null;
	public MCScrollPane RsltDispScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP0290.RsltDispR> RsltDispTable = null;
	// [RsltDisp]ブロックの項目のField定義
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_itm_ord_no = null;
	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_itm_ord_typ = null;
	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_itm_ord_typ_nm = null;
	/**
	 * Load status type for the item order 品目オーダ負荷状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_itm_ord_ld_sts_typ = null;
	/**
	 * Load status type name for the item order 品目オーダ負荷状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_itm_ord_ld_sts_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D RsltDisp_itm_p_PPanel;
	public MCColumnConfig columnRsltDisp_itm_cd;// [RsltDisp]の[itm_p.itm_cd]を[columnRsltDisp_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_sub1;// [RsltDisp]の[itm_p.itm_sub1]を[columnRsltDisp_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_sub2;// [RsltDisp]の[itm_p.itm_sub2]を[columnRsltDisp_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_sub3;// [RsltDisp]の[itm_p.itm_sub3]を[columnRsltDisp_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_nm;// [RsltDisp]の[itm_p.itm_nm]を[columnRsltDisp_itm_nm]としてエイリアス定義。
	/**
	 * Mfg. start date 製造着手日.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_mfg_st_dt = null;
	/**
	 * Mfg. end date 製造終了日.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_mfg_end_dt = null;
	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_mfg_lt = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_inst_qty_p_PPanel;
	public MCColumnConfig columnRsltDisp_qty;// [RsltDisp]の[inst_qty_p.qty]を[columnRsltDisp_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_dec_place = null;
	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rsrc_cd1 = null;
	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rsrc_nm1 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_rsrc_act_qty1_p_PPanel;
	public MCColumnConfig columnRsltDisp_rsrc_act_qty1;// [RsltDisp]の[rsrc_act_qty1_p.qty]を[columnRsltDisp_rsrc_act_qty1]としてエイリアス定義。
	/**
	 * Resource unit name 1 資源単位名１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rsrc_unit_nm1 = null;
	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rsrc_dec_place1 = null;
	/**
	 * Rounding type 1 端数処理区分１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rsrc_rnd_typ1 = null;
	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rsrc_cd2 = null;
	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rsrc_nm2 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltDisp_rsrc_act_qty2_p_PPanel;
	public MCColumnConfig columnRsltDisp_rsrc_act_qty2;// [RsltDisp]の[rsrc_act_qty2_p.qty]を[columnRsltDisp_rsrc_act_qty2]としてエイリアス定義。
	/**
	 * Resource unit name 2 資源単位名２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rsrc_unit_nm2 = null;
	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rsrc_dec_place2 = null;
	/**
	 * Rounding type 2 端数処理区分２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rsrc_rnd_typ2 = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D RsltDisp_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRsltDisp_sno1;// [RsltDisp]の[sno_wrk_no_p.sno1]を[columnRsltDisp_sno1]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_sno2;// [RsltDisp]の[sno_wrk_no_p.sno2]を[columnRsltDisp_sno2]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_sno3;// [RsltDisp]の[sno_wrk_no_p.sno3]を[columnRsltDisp_sno3]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_sno4;// [RsltDisp]の[sno_wrk_no_p.sno4]を[columnRsltDisp_sno4]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_wrk_no;// [RsltDisp]の[sno_wrk_no_p.wrk_no]を[columnRsltDisp_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_wrk_nm;// [RsltDisp]の[sno_wrk_no_p.wrk_nm]を[columnRsltDisp_wrk_nm]としてエイリアス定義。
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_bom_ptn = null;
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_strg_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_strg_loc_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_wg_nm = null;
	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_not_fix_flg = null;
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_master_dt = null;
	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_rqmt_no = null;
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_io_schd_pr_no = null;
	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_inst_po_cnt_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_intr_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D RsltDisp_itm_grp_p_PPanel;
	public MCColumnConfig columnRsltDisp_itm_grp_cd1;// [RsltDisp]の[itm_grp_p.itm_grp_cd1]を[columnRsltDisp_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_nm1;// [RsltDisp]の[itm_grp_p.itm_grp_nm1]を[columnRsltDisp_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_cd2;// [RsltDisp]の[itm_grp_p.itm_grp_cd2]を[columnRsltDisp_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_nm2;// [RsltDisp]の[itm_grp_p.itm_grp_nm2]を[columnRsltDisp_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_cd3;// [RsltDisp]の[itm_grp_p.itm_grp_cd3]を[columnRsltDisp_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_nm3;// [RsltDisp]の[itm_grp_p.itm_grp_nm3]を[columnRsltDisp_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_cd4;// [RsltDisp]の[itm_grp_p.itm_grp_cd4]を[columnRsltDisp_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_nm4;// [RsltDisp]の[itm_grp_p.itm_grp_nm4]を[columnRsltDisp_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_cd5;// [RsltDisp]の[itm_grp_p.itm_grp_cd5]を[columnRsltDisp_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_nm5;// [RsltDisp]の[itm_grp_p.itm_grp_nm5]を[columnRsltDisp_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_cd6;// [RsltDisp]の[itm_grp_p.itm_grp_cd6]を[columnRsltDisp_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_nm6;// [RsltDisp]の[itm_grp_p.itm_grp_nm6]を[columnRsltDisp_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_cd7;// [RsltDisp]の[itm_grp_p.itm_grp_cd7]を[columnRsltDisp_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_nm7;// [RsltDisp]の[itm_grp_p.itm_grp_nm7]を[columnRsltDisp_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_cd8;// [RsltDisp]の[itm_grp_p.itm_grp_cd8]を[columnRsltDisp_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_nm8;// [RsltDisp]の[itm_grp_p.itm_grp_nm8]を[columnRsltDisp_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_cd9;// [RsltDisp]の[itm_grp_p.itm_grp_cd9]を[columnRsltDisp_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_nm9;// [RsltDisp]の[itm_grp_p.itm_grp_nm9]を[columnRsltDisp_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_cd10;// [RsltDisp]の[itm_grp_p.itm_grp_cd10]を[columnRsltDisp_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRsltDisp_itm_grp_nm10;// [RsltDisp]の[itm_grp_p.itm_grp_nm10]を[columnRsltDisp_itm_grp_nm10]としてエイリアス定義。
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_ins_ts = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_upd_srv_req_no = null;
	/**
	 * Item 品目.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_disp_itm_cd = null;
	/**
	 * SEIBAN No. 手配ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltDisp_disp_sno = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP0290.RsltDispR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_no = null;
	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_typ = null;
	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_typ_nm = null;
	/**
	 * Load status type for the item order 品目オーダ負荷状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_ld_sts_typ = null;
	/**
	 * Load status type name for the item order 品目オーダ負荷状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_ld_sts_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Mfg. start date 製造着手日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_st_dt = null;
	/**
	 * Mfg. end date 製造終了日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_end_dt = null;
	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_lt = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_inst_qty_p_PPanel;
	public MCColumnConfig columnRslt_qty;// [Rslt]の[inst_qty_p.qty]を[columnRslt_qty]としてエイリアス定義。
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
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dec_place = null;
	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rsrc_cd1 = null;
	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rsrc_nm1 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_rsrc_act_qty1_p_PPanel;
	public MCColumnConfig columnRslt_rsrc_act_qty1;// [Rslt]の[rsrc_act_qty1_p.qty]を[columnRslt_rsrc_act_qty1]としてエイリアス定義。
	/**
	 * Resource unit name 1 資源単位名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rsrc_unit_nm1 = null;
	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rsrc_dec_place1 = null;
	/**
	 * Rounding type 1 端数処理区分１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rsrc_rnd_typ1 = null;
	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rsrc_cd2 = null;
	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rsrc_nm2 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_rsrc_act_qty2_p_PPanel;
	public MCColumnConfig columnRslt_rsrc_act_qty2;// [Rslt]の[rsrc_act_qty2_p.qty]を[columnRslt_rsrc_act_qty2]としてエイリアス定義。
	/**
	 * Resource unit name 2 資源単位名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rsrc_unit_nm2 = null;
	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rsrc_dec_place2 = null;
	/**
	 * Rounding type 2 端数処理区分２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rsrc_rnd_typ2 = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bom_ptn = null;
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
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_nm = null;
	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_fix_flg = null;
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_master_dt = null;
	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqmt_no = null;
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_pr_no = null;
	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_po_cnt_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_rmrks = null;
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
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D Rslt_itm_grp_p_PPanel;
	public MCColumnConfig columnRslt_itm_grp_cd1;// [Rslt]の[itm_grp_p.itm_grp_cd1]を[columnRslt_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm1;// [Rslt]の[itm_grp_p.itm_grp_nm1]を[columnRslt_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd2;// [Rslt]の[itm_grp_p.itm_grp_cd2]を[columnRslt_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm2;// [Rslt]の[itm_grp_p.itm_grp_nm2]を[columnRslt_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd3;// [Rslt]の[itm_grp_p.itm_grp_cd3]を[columnRslt_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm3;// [Rslt]の[itm_grp_p.itm_grp_nm3]を[columnRslt_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd4;// [Rslt]の[itm_grp_p.itm_grp_cd4]を[columnRslt_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm4;// [Rslt]の[itm_grp_p.itm_grp_nm4]を[columnRslt_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd5;// [Rslt]の[itm_grp_p.itm_grp_cd5]を[columnRslt_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm5;// [Rslt]の[itm_grp_p.itm_grp_nm5]を[columnRslt_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd6;// [Rslt]の[itm_grp_p.itm_grp_cd6]を[columnRslt_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm6;// [Rslt]の[itm_grp_p.itm_grp_nm6]を[columnRslt_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd7;// [Rslt]の[itm_grp_p.itm_grp_cd7]を[columnRslt_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm7;// [Rslt]の[itm_grp_p.itm_grp_nm7]を[columnRslt_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd8;// [Rslt]の[itm_grp_p.itm_grp_cd8]を[columnRslt_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm8;// [Rslt]の[itm_grp_p.itm_grp_nm8]を[columnRslt_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd9;// [Rslt]の[itm_grp_p.itm_grp_cd9]を[columnRslt_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm9;// [Rslt]の[itm_grp_p.itm_grp_nm9]を[columnRslt_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd10;// [Rslt]の[itm_grp_p.itm_grp_cd10]を[columnRslt_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm10;// [Rslt]の[itm_grp_p.itm_grp_nm10]を[columnRslt_itm_grp_nm10]としてエイリアス定義。
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
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
	 * Item 品目.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_itm_cd = null;
	/**
	 * SEIBAN No. 手配ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_sno = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, UPD, FIX_U};
	
	/** [MS_MSBCL0290_Srch01]のCallerの作成 */
	protected MSBCP_ItmOrdGanttChart_MC.MS_MSBCL0290_Srch01Caller createMS_MSBCL0290_Srch01() {
		MSBCP_ItmOrdGanttChart_MC.MS_MSBCL0290_Srch01Caller<MSBCP_ItmOrdGanttChart, MS_MSBCL0290_Srch01Bridge>
		caller = ((MSBCP_ItmOrdGanttChart_MC)this).new MS_MSBCL0290_Srch01Caller<MSBCP_ItmOrdGanttChart, MS_MSBCL0290_Srch01Bridge>(
					(MSBCP_ItmOrdGanttChart)this, new MS_MSBCL0290_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL0290_Srch01]の呼び出し */
	protected void callMS_MSBCL0290_Srch01() {
		MCCaller caller = createMS_MSBCL0290_Srch01();
		caller.exec();
	}
	/** [MS_MSBCL0290_Upd01]のCallerの作成 */
	protected MSBCP_ItmOrdGanttChart_MC.MS_MSBCL0290_Upd01Caller createMS_MSBCL0290_Upd01() {
		MSBCP_ItmOrdGanttChart_MC.MS_MSBCL0290_Upd01Caller<MSBCP_ItmOrdGanttChart, MS_MSBCL0290_Upd01Bridge>
		caller = ((MSBCP_ItmOrdGanttChart_MC)this).new MS_MSBCL0290_Upd01Caller<MSBCP_ItmOrdGanttChart, MS_MSBCL0290_Upd01Bridge>(
					(MSBCP_ItmOrdGanttChart)this, new MS_MSBCL0290_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBCL0290_Upd01]の呼び出し */
	protected void callMS_MSBCL0290_Upd01() {
		MCCaller caller = createMS_MSBCL0290_Upd01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0290.CndR aCndR;
	/** [LPnl]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0290.LPnlR aLPnlR;
	/** [Gantt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0290.GanttR> aGanttL;
	/** [RsltDisp]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0290.RsltDispR> aRsltDispL;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0290.RsltDispR> aRsltL;
	/** [Loc]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0290.LocR> aLocL;
	/** [RsrcLoc]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0290.RsrcLocR> aRsrcLocL;
	/** [Cal]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0290.CalR> aCalL;
	/** [AllocPln]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0290.AllocPlnR> aAllocPlnL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP0290.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0290.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0290.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP0290.CndR.create();
	}

	/**
	 * 項目コピーによってaLPnlRを設定します。
	 *
	 * aLPnlRのインスタンスは変更されません。
	 *
	 * @param row LPnlR
	 */
	public void setLPnlR(mcframe.clientMSBC.MSBCP0290.LPnlR row) {
		if (row != null) {
			MCRow.copyall(getLPnlR(), row);
		}
	}

	/**
	 * [LPnl]ブロックのコンテナaLPnlRを返します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMSBC.MSBCP0290.LPnlR getLPnlR() {
		return aLPnlR;
	}

	/**
	 * aLPnlRを作成します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMSBC.MSBCP0290.LPnlR createLPnlR() {
		return mcframe.clientMSBC.MSBCP0290.LPnlR.create();
	}

	/**
	 * コピーによってaGanttLを設定します。
	 *
	 * aGanttLのインスタンスは変更されません。
	 *
	 * @param dataset GanttL
	 */
	public void setGanttL(MCList<mcframe.clientMSBC.MSBCP0290.GanttR> aList) {
		if (getGanttL() != aList) {
			getGanttL().setAll(aList);
		}
	}

	/**
	 * [Gantt]ブロックのコンテナaGanttLを返します。
	 *
	 * @return GanttL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0290.GanttR> getGanttL() {
		return aGanttL;
	}

	/**
	 * aGanttRを作成します。
	 *
	 * @return GanttR
	 */
	public mcframe.clientMSBC.MSBCP0290.GanttR createGanttR() {
		return mcframe.clientMSBC.MSBCP0290.GanttR.create();
	}

	/**
	 * aGanttLを作成します。
	 *
	 * @return GanttL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0290.GanttR> createGanttL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0290.GanttR.class);
	}

	/**
	 * GanttTableを初期化します。
	 */
	protected void createGanttTable(){
		if(GanttTable == null){
			GanttTable = beansFactory.createTable2("Gantt.table");
		}
	}

	/**
	 * コピーによってaRsltDispLを設定します。
	 *
	 * aRsltDispLのインスタンスは変更されません。
	 *
	 * @param dataset RsltDispL
	 */
	public void setRsltDispL(MCList<mcframe.clientMSBC.MSBCP0290.RsltDispR> aList) {
		if (getRsltDispL() != aList) {
			getRsltDispL().setAll(aList);
		}
	}

	/**
	 * [RsltDisp]ブロックのコンテナaRsltDispLを返します。
	 *
	 * @return RsltDispL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0290.RsltDispR> getRsltDispL() {
		return aRsltDispL;
	}

	/**
	 * aRsltDispRを作成します。
	 *
	 * @return RsltDispR
	 */
	public mcframe.clientMSBC.MSBCP0290.RsltDispR createRsltDispR() {
		return mcframe.clientMSBC.MSBCP0290.RsltDispR.create();
	}

	/**
	 * aRsltDispLを作成します。
	 *
	 * @return RsltDispL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0290.RsltDispR> createRsltDispL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.class);
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
	public void setRsltL(MCList<mcframe.clientMSBC.MSBCP0290.RsltDispR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0290.RsltDispR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBC.MSBCP0290.RsltDispR createRsltR() {
		return mcframe.clientMSBC.MSBCP0290.RsltDispR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0290.RsltDispR> createRsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.class);
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
	 * コピーによってaLocLを設定します。
	 *
	 * aLocLのインスタンスは変更されません。
	 *
	 * @param dataset LocL
	 */
	public void setLocL(MCList<mcframe.clientMSBC.MSBCP0290.LocR> aList) {
		if (getLocL() != aList) {
			getLocL().setAll(aList);
		}
	}

	/**
	 * [Loc]ブロックのコンテナaLocLを返します。
	 *
	 * @return LocL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0290.LocR> getLocL() {
		return aLocL;
	}

	/**
	 * aLocRを作成します。
	 *
	 * @return LocR
	 */
	public mcframe.clientMSBC.MSBCP0290.LocR createLocR() {
		return mcframe.clientMSBC.MSBCP0290.LocR.create();
	}

	/**
	 * aLocLを作成します。
	 *
	 * @return LocL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0290.LocR> createLocL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0290.LocR.class);
	}

	/**
	 * コピーによってaRsrcLocLを設定します。
	 *
	 * aRsrcLocLのインスタンスは変更されません。
	 *
	 * @param dataset RsrcLocL
	 */
	public void setRsrcLocL(MCList<mcframe.clientMSBC.MSBCP0290.RsrcLocR> aList) {
		if (getRsrcLocL() != aList) {
			getRsrcLocL().setAll(aList);
		}
	}

	/**
	 * [RsrcLoc]ブロックのコンテナaRsrcLocLを返します。
	 *
	 * @return RsrcLocL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0290.RsrcLocR> getRsrcLocL() {
		return aRsrcLocL;
	}

	/**
	 * aRsrcLocRを作成します。
	 *
	 * @return RsrcLocR
	 */
	public mcframe.clientMSBC.MSBCP0290.RsrcLocR createRsrcLocR() {
		return mcframe.clientMSBC.MSBCP0290.RsrcLocR.create();
	}

	/**
	 * aRsrcLocLを作成します。
	 *
	 * @return RsrcLocL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0290.RsrcLocR> createRsrcLocL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0290.RsrcLocR.class);
	}

	/**
	 * コピーによってaCalLを設定します。
	 *
	 * aCalLのインスタンスは変更されません。
	 *
	 * @param dataset CalL
	 */
	public void setCalL(MCList<mcframe.clientMSBC.MSBCP0290.CalR> aList) {
		if (getCalL() != aList) {
			getCalL().setAll(aList);
		}
	}

	/**
	 * [Cal]ブロックのコンテナaCalLを返します。
	 *
	 * @return CalL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0290.CalR> getCalL() {
		return aCalL;
	}

	/**
	 * aCalRを作成します。
	 *
	 * @return CalR
	 */
	public mcframe.clientMSBC.MSBCP0290.CalR createCalR() {
		return mcframe.clientMSBC.MSBCP0290.CalR.create();
	}

	/**
	 * aCalLを作成します。
	 *
	 * @return CalL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0290.CalR> createCalL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0290.CalR.class);
	}

	/**
	 * コピーによってaAllocPlnLを設定します。
	 *
	 * aAllocPlnLのインスタンスは変更されません。
	 *
	 * @param dataset AllocPlnL
	 */
	public void setAllocPlnL(MCList<mcframe.clientMSBC.MSBCP0290.AllocPlnR> aList) {
		if (getAllocPlnL() != aList) {
			getAllocPlnL().setAll(aList);
		}
	}

	/**
	 * [AllocPln]ブロックのコンテナaAllocPlnLを返します。
	 *
	 * @return AllocPlnL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0290.AllocPlnR> getAllocPlnL() {
		return aAllocPlnL;
	}

	/**
	 * aAllocPlnRを作成します。
	 *
	 * @return AllocPlnR
	 */
	public mcframe.clientMSBC.MSBCP0290.AllocPlnR createAllocPlnR() {
		return mcframe.clientMSBC.MSBCP0290.AllocPlnR.create();
	}

	/**
	 * aAllocPlnLを作成します。
	 *
	 * @return AllocPlnL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0290.AllocPlnR> createAllocPlnL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0290.AllocPlnR.class);
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
		if(!MCCollectionUtil.contains(ret, getGanttL())) ret.add(getGanttL());
		if(!MCCollectionUtil.contains(ret, getRsltDispL())) ret.add(getRsltDispL());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getLocL())) ret.add(getLocL());
		if(!MCCollectionUtil.contains(ret, getRsrcLocL())) ret.add(getRsrcLocL());
		if(!MCCollectionUtil.contains(ret, getCalL())) ret.add(getCalL());
		if(!MCCollectionUtil.contains(ret, getAllocPlnL())) ret.add(getAllocPlnL());
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
		if(aCnt == getGanttL()) return "Gantt";
		if(aCnt == getRsltDispL()) return "RsltDisp";
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getLocL()) return "Loc";
		if(aCnt == getRsrcLocL()) return "RsrcLoc";
		if(aCnt == getCalL()) return "Cal";
		if(aCnt == getAllocPlnL()) return "AllocPln";
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
		if(bId.equals("Gantt")) return getGanttL();
		if(bId.equals("RsltDisp")) return getRsltDispL();
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("Loc")) return getLocL();
		if(bId.equals("RsrcLoc")) return getRsrcLocL();
		if(bId.equals("Cal")) return getCalL();
		if(bId.equals("AllocPln")) return getAllocPlnL();
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
		ret.add(Cnd1Panel);
		ret.add(Tab2Panel);
		ret.add(Cnd3Panel);
		ret.add(CndPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(GanttPanel);
		ret.add(RsltDispPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_ItmOrdGanttChart_MC_A() {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aGanttL = createGanttL();
		aRsltDispL = createRsltDispL();
		aRsltL = createRsltL();
		aLocL = createLocL();
		aRsrcLocL = createRsrcLocL();
		aCalL = createCalL();
		aAllocPlnL = createAllocPlnL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_ItmOrdGanttChart_MC_A(String name) {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aGanttL = createGanttL();
		createGanttTable();
		GanttTable.setRowName(name);
		aRsltDispL = createRsltDispL();
		createRsltDispTable();
		RsltDispTable.setRowName(name);
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aLocL = createLocL();
		aRsrcLocL = createRsrcLocL();
		aCalL = createCalL();
		aAllocPlnL = createAllocPlnL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBCP_ItmOrdGanttChart_MC.jbCreateTop((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbCreateFold((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbCreateTab1((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbCreateCnd1((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbCreateTab2((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbCreateCnd3((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbCreateCnd((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbCreateLPnl((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbCreateCtrl((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbCreateGantt((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbCreateRsltDisp((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbCreateRslt((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbCreateBtn((MSBCP_ItmOrdGanttChart)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_ItmOrdGanttChart p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_ItmOrdGanttChart p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBCP_ItmOrdGanttChart p) {
	}

	/**
	 * [Cnd1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd1(MSBCP_ItmOrdGanttChart p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBCP_ItmOrdGanttChart p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MSBCP_ItmOrdGanttChart p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_ItmOrdGanttChart p) {
		p.Cnd_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.create(p.getCndR().itm_grp_p());
		p.Cnd_itm_grp_p_PPanel.setName("Cnd.itm_grp_p");
		p.Cnd_itm_grp_flg1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1;
		p.Cnd_itm_grp_flg1.addAliasName("Cnd.itm_grp_flg1", p);
		p.Cnd_itm_grp_cd1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1;
		p.Cnd_itm_grp_cd1.addAliasName("Cnd.itm_grp_cd1", p);
		p.Cnd_itm_grp_nm1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1;
		p.Cnd_itm_grp_nm1.addAliasName("Cnd.itm_grp_nm1", p);
		p.Cnd_itm_grp_flg2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2;
		p.Cnd_itm_grp_flg2.addAliasName("Cnd.itm_grp_flg2", p);
		p.Cnd_itm_grp_cd2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2;
		p.Cnd_itm_grp_cd2.addAliasName("Cnd.itm_grp_cd2", p);
		p.Cnd_itm_grp_nm2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2;
		p.Cnd_itm_grp_nm2.addAliasName("Cnd.itm_grp_nm2", p);
		p.Cnd_itm_grp_flg3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3;
		p.Cnd_itm_grp_flg3.addAliasName("Cnd.itm_grp_flg3", p);
		p.Cnd_itm_grp_cd3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3;
		p.Cnd_itm_grp_cd3.addAliasName("Cnd.itm_grp_cd3", p);
		p.Cnd_itm_grp_nm3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3;
		p.Cnd_itm_grp_nm3.addAliasName("Cnd.itm_grp_nm3", p);
		p.Cnd_itm_grp_flg4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4;
		p.Cnd_itm_grp_flg4.addAliasName("Cnd.itm_grp_flg4", p);
		p.Cnd_itm_grp_cd4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4;
		p.Cnd_itm_grp_cd4.addAliasName("Cnd.itm_grp_cd4", p);
		p.Cnd_itm_grp_nm4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4;
		p.Cnd_itm_grp_nm4.addAliasName("Cnd.itm_grp_nm4", p);
		p.Cnd_itm_grp_flg5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5;
		p.Cnd_itm_grp_flg5.addAliasName("Cnd.itm_grp_flg5", p);
		p.Cnd_itm_grp_cd5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5;
		p.Cnd_itm_grp_cd5.addAliasName("Cnd.itm_grp_cd5", p);
		p.Cnd_itm_grp_nm5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5;
		p.Cnd_itm_grp_nm5.addAliasName("Cnd.itm_grp_nm5", p);
		p.Cnd_itm_grp_flg6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6;
		p.Cnd_itm_grp_flg6.addAliasName("Cnd.itm_grp_flg6", p);
		p.Cnd_itm_grp_cd6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6;
		p.Cnd_itm_grp_cd6.addAliasName("Cnd.itm_grp_cd6", p);
		p.Cnd_itm_grp_nm6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6;
		p.Cnd_itm_grp_nm6.addAliasName("Cnd.itm_grp_nm6", p);
		p.Cnd_itm_grp_flg7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7;
		p.Cnd_itm_grp_flg7.addAliasName("Cnd.itm_grp_flg7", p);
		p.Cnd_itm_grp_cd7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7;
		p.Cnd_itm_grp_cd7.addAliasName("Cnd.itm_grp_cd7", p);
		p.Cnd_itm_grp_nm7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7;
		p.Cnd_itm_grp_nm7.addAliasName("Cnd.itm_grp_nm7", p);
		p.Cnd_itm_grp_flg8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8;
		p.Cnd_itm_grp_flg8.addAliasName("Cnd.itm_grp_flg8", p);
		p.Cnd_itm_grp_cd8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8;
		p.Cnd_itm_grp_cd8.addAliasName("Cnd.itm_grp_cd8", p);
		p.Cnd_itm_grp_nm8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8;
		p.Cnd_itm_grp_nm8.addAliasName("Cnd.itm_grp_nm8", p);
		p.Cnd_itm_grp_flg9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9;
		p.Cnd_itm_grp_flg9.addAliasName("Cnd.itm_grp_flg9", p);
		p.Cnd_itm_grp_cd9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9;
		p.Cnd_itm_grp_cd9.addAliasName("Cnd.itm_grp_cd9", p);
		p.Cnd_itm_grp_nm9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9;
		p.Cnd_itm_grp_nm9.addAliasName("Cnd.itm_grp_nm9", p);
		p.Cnd_itm_grp_flg10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10;
		p.Cnd_itm_grp_flg10.addAliasName("Cnd.itm_grp_flg10", p);
		p.Cnd_itm_grp_cd10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10;
		p.Cnd_itm_grp_cd10.addAliasName("Cnd.itm_grp_cd10", p);
		p.Cnd_itm_grp_nm10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10;
		p.Cnd_itm_grp_nm10.addAliasName("Cnd.itm_grp_nm10", p);
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MSBCP_ItmOrdGanttChart p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_ItmOrdGanttChart p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Gantt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateGantt(MSBCP_ItmOrdGanttChart p) {
	}

	/**
	 * [RsltDisp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltDisp(MSBCP_ItmOrdGanttChart p) {
		p.RsltDisp_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.$itm_p);
		p.RsltDisp_itm_p_PPanel.setName("RsltDisp.itm_p");
		p.columnRsltDisp_itm_cd = p.RsltDisp_itm_p_PPanel.columnItm_itm_cd;
		p.columnRsltDisp_itm_cd.addAliasName("RsltDisp.itm_cd", p);
		p.columnRsltDisp_itm_sub1 = p.RsltDisp_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRsltDisp_itm_sub1.addAliasName("RsltDisp.itm_sub1", p);
		p.columnRsltDisp_itm_sub2 = p.RsltDisp_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRsltDisp_itm_sub2.addAliasName("RsltDisp.itm_sub2", p);
		p.columnRsltDisp_itm_sub3 = p.RsltDisp_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRsltDisp_itm_sub3.addAliasName("RsltDisp.itm_sub3", p);
		p.columnRsltDisp_itm_nm = p.RsltDisp_itm_p_PPanel.columnItm_itm_nm;
		p.columnRsltDisp_itm_nm.addAliasName("RsltDisp.itm_nm", p);
		p.RsltDisp_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.$inst_qty_p);
		p.RsltDisp_inst_qty_p_PPanel.setName("RsltDisp.inst_qty_p");
		p.columnRsltDisp_qty = p.RsltDisp_inst_qty_p_PPanel.columnQty_qty;
		p.columnRsltDisp_qty.addAliasName("RsltDisp.qty", p);
		p.RsltDisp_rsrc_act_qty1_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.$rsrc_act_qty1_p);
		p.RsltDisp_rsrc_act_qty1_p_PPanel.setName("RsltDisp.rsrc_act_qty1_p");
		p.columnRsltDisp_rsrc_act_qty1 = p.RsltDisp_rsrc_act_qty1_p_PPanel.columnQty_qty;
		p.columnRsltDisp_rsrc_act_qty1.addAliasName("RsltDisp.rsrc_act_qty1", p);
		p.RsltDisp_rsrc_act_qty2_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.$rsrc_act_qty2_p);
		p.RsltDisp_rsrc_act_qty2_p_PPanel.setName("RsltDisp.rsrc_act_qty2_p");
		p.columnRsltDisp_rsrc_act_qty2 = p.RsltDisp_rsrc_act_qty2_p_PPanel.columnQty_qty;
		p.columnRsltDisp_rsrc_act_qty2.addAliasName("RsltDisp.rsrc_act_qty2", p);
		p.RsltDisp_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.$sno_wrk_no_p);
		p.RsltDisp_sno_wrk_no_p_PPanel.setName("RsltDisp.sno_wrk_no_p");
		p.columnRsltDisp_sno1 = p.RsltDisp_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRsltDisp_sno1.addAliasName("RsltDisp.sno1", p);
		p.columnRsltDisp_sno2 = p.RsltDisp_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRsltDisp_sno2.addAliasName("RsltDisp.sno2", p);
		p.columnRsltDisp_sno3 = p.RsltDisp_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRsltDisp_sno3.addAliasName("RsltDisp.sno3", p);
		p.columnRsltDisp_sno4 = p.RsltDisp_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRsltDisp_sno4.addAliasName("RsltDisp.sno4", p);
		p.columnRsltDisp_wrk_no = p.RsltDisp_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRsltDisp_wrk_no.addAliasName("RsltDisp.wrk_no", p);
		p.columnRsltDisp_wrk_nm = p.RsltDisp_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRsltDisp_wrk_nm.addAliasName("RsltDisp.wrk_nm", p);
		p.RsltDisp_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.$itm_grp_p);
		p.RsltDisp_itm_grp_p_PPanel.setName("RsltDisp.itm_grp_p");
		p.columnRsltDisp_itm_grp_cd1 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnRsltDisp_itm_grp_cd1.addAliasName("RsltDisp.itm_grp_cd1", p);
		p.columnRsltDisp_itm_grp_nm1 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnRsltDisp_itm_grp_nm1.addAliasName("RsltDisp.itm_grp_nm1", p);
		p.columnRsltDisp_itm_grp_cd2 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnRsltDisp_itm_grp_cd2.addAliasName("RsltDisp.itm_grp_cd2", p);
		p.columnRsltDisp_itm_grp_nm2 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnRsltDisp_itm_grp_nm2.addAliasName("RsltDisp.itm_grp_nm2", p);
		p.columnRsltDisp_itm_grp_cd3 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnRsltDisp_itm_grp_cd3.addAliasName("RsltDisp.itm_grp_cd3", p);
		p.columnRsltDisp_itm_grp_nm3 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnRsltDisp_itm_grp_nm3.addAliasName("RsltDisp.itm_grp_nm3", p);
		p.columnRsltDisp_itm_grp_cd4 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnRsltDisp_itm_grp_cd4.addAliasName("RsltDisp.itm_grp_cd4", p);
		p.columnRsltDisp_itm_grp_nm4 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnRsltDisp_itm_grp_nm4.addAliasName("RsltDisp.itm_grp_nm4", p);
		p.columnRsltDisp_itm_grp_cd5 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnRsltDisp_itm_grp_cd5.addAliasName("RsltDisp.itm_grp_cd5", p);
		p.columnRsltDisp_itm_grp_nm5 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnRsltDisp_itm_grp_nm5.addAliasName("RsltDisp.itm_grp_nm5", p);
		p.columnRsltDisp_itm_grp_cd6 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnRsltDisp_itm_grp_cd6.addAliasName("RsltDisp.itm_grp_cd6", p);
		p.columnRsltDisp_itm_grp_nm6 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnRsltDisp_itm_grp_nm6.addAliasName("RsltDisp.itm_grp_nm6", p);
		p.columnRsltDisp_itm_grp_cd7 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnRsltDisp_itm_grp_cd7.addAliasName("RsltDisp.itm_grp_cd7", p);
		p.columnRsltDisp_itm_grp_nm7 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnRsltDisp_itm_grp_nm7.addAliasName("RsltDisp.itm_grp_nm7", p);
		p.columnRsltDisp_itm_grp_cd8 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnRsltDisp_itm_grp_cd8.addAliasName("RsltDisp.itm_grp_cd8", p);
		p.columnRsltDisp_itm_grp_nm8 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnRsltDisp_itm_grp_nm8.addAliasName("RsltDisp.itm_grp_nm8", p);
		p.columnRsltDisp_itm_grp_cd9 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnRsltDisp_itm_grp_cd9.addAliasName("RsltDisp.itm_grp_cd9", p);
		p.columnRsltDisp_itm_grp_nm9 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnRsltDisp_itm_grp_nm9.addAliasName("RsltDisp.itm_grp_nm9", p);
		p.columnRsltDisp_itm_grp_cd10 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnRsltDisp_itm_grp_cd10.addAliasName("RsltDisp.itm_grp_cd10", p);
		p.columnRsltDisp_itm_grp_nm10 = p.RsltDisp_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnRsltDisp_itm_grp_nm10.addAliasName("RsltDisp.itm_grp_nm10", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBCP_ItmOrdGanttChart p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.$itm_p);
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
		p.Rslt_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.$inst_qty_p);
		p.Rslt_inst_qty_p_PPanel.setName("Rslt.inst_qty_p");
		p.columnRslt_qty = p.Rslt_inst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_qty.addAliasName("Rslt.qty", p);
		p.Rslt_rsrc_act_qty1_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.$rsrc_act_qty1_p);
		p.Rslt_rsrc_act_qty1_p_PPanel.setName("Rslt.rsrc_act_qty1_p");
		p.columnRslt_rsrc_act_qty1 = p.Rslt_rsrc_act_qty1_p_PPanel.columnQty_qty;
		p.columnRslt_rsrc_act_qty1.addAliasName("Rslt.rsrc_act_qty1", p);
		p.Rslt_rsrc_act_qty2_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.$rsrc_act_qty2_p);
		p.Rslt_rsrc_act_qty2_p_PPanel.setName("Rslt.rsrc_act_qty2_p");
		p.columnRslt_rsrc_act_qty2 = p.Rslt_rsrc_act_qty2_p_PPanel.columnQty_qty;
		p.columnRslt_rsrc_act_qty2.addAliasName("Rslt.rsrc_act_qty2", p);
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.$sno_wrk_no_p);
		p.Rslt_sno_wrk_no_p_PPanel.setName("Rslt.sno_wrk_no_p");
		p.columnRslt_sno1 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno2 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno3 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno4 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.columnRslt_wrk_no = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.$itm_grp_p);
		p.Rslt_itm_grp_p_PPanel.setName("Rslt.itm_grp_p");
		p.columnRslt_itm_grp_cd1 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnRslt_itm_grp_cd1.addAliasName("Rslt.itm_grp_cd1", p);
		p.columnRslt_itm_grp_nm1 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnRslt_itm_grp_nm1.addAliasName("Rslt.itm_grp_nm1", p);
		p.columnRslt_itm_grp_cd2 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnRslt_itm_grp_cd2.addAliasName("Rslt.itm_grp_cd2", p);
		p.columnRslt_itm_grp_nm2 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnRslt_itm_grp_nm2.addAliasName("Rslt.itm_grp_nm2", p);
		p.columnRslt_itm_grp_cd3 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnRslt_itm_grp_cd3.addAliasName("Rslt.itm_grp_cd3", p);
		p.columnRslt_itm_grp_nm3 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnRslt_itm_grp_nm3.addAliasName("Rslt.itm_grp_nm3", p);
		p.columnRslt_itm_grp_cd4 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnRslt_itm_grp_cd4.addAliasName("Rslt.itm_grp_cd4", p);
		p.columnRslt_itm_grp_nm4 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnRslt_itm_grp_nm4.addAliasName("Rslt.itm_grp_nm4", p);
		p.columnRslt_itm_grp_cd5 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnRslt_itm_grp_cd5.addAliasName("Rslt.itm_grp_cd5", p);
		p.columnRslt_itm_grp_nm5 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnRslt_itm_grp_nm5.addAliasName("Rslt.itm_grp_nm5", p);
		p.columnRslt_itm_grp_cd6 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnRslt_itm_grp_cd6.addAliasName("Rslt.itm_grp_cd6", p);
		p.columnRslt_itm_grp_nm6 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnRslt_itm_grp_nm6.addAliasName("Rslt.itm_grp_nm6", p);
		p.columnRslt_itm_grp_cd7 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnRslt_itm_grp_cd7.addAliasName("Rslt.itm_grp_cd7", p);
		p.columnRslt_itm_grp_nm7 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnRslt_itm_grp_nm7.addAliasName("Rslt.itm_grp_nm7", p);
		p.columnRslt_itm_grp_cd8 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnRslt_itm_grp_cd8.addAliasName("Rslt.itm_grp_cd8", p);
		p.columnRslt_itm_grp_nm8 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnRslt_itm_grp_nm8.addAliasName("Rslt.itm_grp_nm8", p);
		p.columnRslt_itm_grp_cd9 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnRslt_itm_grp_cd9.addAliasName("Rslt.itm_grp_cd9", p);
		p.columnRslt_itm_grp_nm9 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnRslt_itm_grp_nm9.addAliasName("Rslt.itm_grp_nm9", p);
		p.columnRslt_itm_grp_cd10 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnRslt_itm_grp_cd10.addAliasName("Rslt.itm_grp_cd10", p);
		p.columnRslt_itm_grp_nm10 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnRslt_itm_grp_nm10.addAliasName("Rslt.itm_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBCP_ItmOrdGanttChart p) {
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
	
	
	/** [RsltDisp_itm_ord_ld_sts_typ_ListPutter]の定義 */
	private MCListPutter RsltDisp_itm_ord_ld_sts_typ_p = null;

	/**
	 * [RsltDisp_itm_ord_ld_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getRsltDisp_itm_ord_ld_sts_typ_ListPutter() {
		if (RsltDisp_itm_ord_ld_sts_typ_p == null) {
			RsltDisp_itm_ord_ld_sts_typ_p = createRsltDisp_itm_ord_ld_sts_typ_ListPutter(columnRsltDisp_itm_ord_ld_sts_typ, "itm_ord_ld_sts_typ", "itm_ord_ld_sts_typ_nm");

		}
		return RsltDisp_itm_ord_ld_sts_typ_p;
	}
	
	
	/** [Rslt_itm_ord_ld_sts_typ_ListPutter]の定義 */
	private MCListPutter Rslt_itm_ord_ld_sts_typ_p = null;

	/**
	 * [Rslt_itm_ord_ld_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_ord_ld_sts_typ_ListPutter() {
		if (Rslt_itm_ord_ld_sts_typ_p == null) {
			Rslt_itm_ord_ld_sts_typ_p = createRslt_itm_ord_ld_sts_typ_ListPutter(columnRslt_itm_ord_ld_sts_typ, "itm_ord_ld_sts_typ");

		}
		return Rslt_itm_ord_ld_sts_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_ItmOrdGanttChart create(){
		MSBCP_ItmOrdGanttChart p = new MSBCP_ItmOrdGanttChart();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_ItmOrdGanttChart create(String name){
		MSBCP_ItmOrdGanttChart p = new MSBCP_ItmOrdGanttChart(name);
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
		MSBCP_ItmOrdGanttChart_MC.jbfInitTop((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbfInitFold((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbfInitTab1((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbfInitCnd1((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbfInitTab2((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbfInitCnd3((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbfInitCnd((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbfInitLPnl((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbfInitCtrl((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbfInitGantt((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbfInitRsltDisp((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbfInitRslt((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbfInitBtn((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbInitTop((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbInitFold((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbInitTab1((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbInitCnd1((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbInitTab2((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbInitCnd3((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbInitCnd((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbInitLPnl((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbInitCtrl((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbInitGantt((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbInitRsltDisp((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbInitRslt((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.jbInitBtn((MSBCP_ItmOrdGanttChart)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_ItmOrdGanttChart p) {
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
	protected static void jbfInitTab1(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd1(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.Cnd1Panel = p.beansFactory.createPanel("Cnd1");
		p.Cnd1TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
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
		p.Cnd_alloc_pln_r_label = p.beansFactory.createLabel("Cnd.alloc_pln_r_label");
		p.Cnd_alloc_pln_r_view_Group = p.beansFactory.createButtonGroup("Cnd.alloc_pln_r_view");
		p.Cnd_alloc_pln_r_view_NRML = p.beansFactory.createRadioButton("Cnd.alloc_pln_r_view_NRML");
		p.Cnd_alloc_pln_r_view_PRCD = p.beansFactory.createRadioButton("Cnd.alloc_pln_r_view_PRCD");
		p.Cnd_alloc_pln_r_view_SIM = p.beansFactory.createRadioButton("Cnd.alloc_pln_r_view_SIM");
		p.Cnd_alloc_pln_r_view_NO = p.beansFactory.createRadioButton("Cnd.alloc_pln_r_view_NO");
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
		p.LPnl_select_dt_fr_Label = p.beansFactory.createLabel("LPnl.select_dt_fr_Label");
		p.LPnl_select_dt_fr = p.beansFactory.createDateField("LPnl.select_dt_fr");
		p.LPnl_select_dt_fr.setLabel(p.LPnl_select_dt_fr_Label);
		p.LPnl_select_dt_to_Label = p.beansFactory.createLabel("LPnl.select_dt_to_Label");
		p.LPnl_select_dt_to = p.beansFactory.createDateField("LPnl.select_dt_to");
		p.LPnl_select_dt_to.setLabel(p.LPnl_select_dt_to_Label);
		p.LPnl_select = p.beansFactory.createButton("LPnl.select");
		p.LPnl_select_by_alloc_pln = p.beansFactory.createButton("LPnl.select_by_alloc_pln");
		p.LPnl_move_prev_day = p.beansFactory.createButton("LPnl.move_prev_day");
		p.LPnl_move_next_day = p.beansFactory.createButton("LPnl.move_next_day");
		p.LPnl_sts_opn = p.beansFactory.createButton("LPnl.sts_opn");
		p.LPnl_sts_sav = p.beansFactory.createButton("LPnl.sts_sav");
		p.LPnl_rdel = p.beansFactory.createButton("LPnl.rdel");
		p.LPnl_undo = p.beansFactory.createButton("LPnl.undo");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Gantt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitGantt(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.GanttPanel = p.beansFactory.createPanel("Gantt");
		p.GanttScrollPane = p.beansFactory.createScrollPane("Gantt.scroll");
		p.createGanttTable();
		// ブロックの項目の初期化
	}

	/**
	 * [RsltDisp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltDisp(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.RsltDispPanel = p.beansFactory.createPanel("RsltDisp");
		p.RsltDispScrollPane = p.beansFactory.createScrollPane("RsltDisp.scroll");
		p.createRsltDispTable();
		// ブロックの項目の初期化
		p.columnRsltDisp_itm_ord_no = p.beansFactory.createTableColumn("RsltDisp.itm_ord_no", MCColumnType.TEXT);
		p.columnRsltDisp_itm_ord_typ = p.beansFactory.createTableColumn("RsltDisp.itm_ord_typ", MCColumnType.TEXT);
		p.columnRsltDisp_itm_ord_typ_nm = p.beansFactory.createTableColumn("RsltDisp.itm_ord_typ_nm", MCColumnType.TEXT);
		p.columnRsltDisp_itm_ord_ld_sts_typ = p.beansFactory.createTableColumn("RsltDisp.itm_ord_ld_sts_typ", MCColumnType.TEXT_COMBO);
		p.columnRsltDisp_itm_ord_ld_sts_typ_nm = p.beansFactory.createTableColumn("RsltDisp.itm_ord_ld_sts_typ_nm", MCColumnType.TEXT);
		p.columnRsltDisp_mfg_st_dt = p.beansFactory.createTableColumn("RsltDisp.mfg_st_dt", MCColumnType.DATE);
		p.columnRsltDisp_mfg_end_dt = p.beansFactory.createTableColumn("RsltDisp.mfg_end_dt", MCColumnType.DATE);
		p.columnRsltDisp_mfg_lt = p.beansFactory.createTableColumn("RsltDisp.mfg_lt", MCColumnType.NUMBER);
		p.columnRsltDisp_unit_cd = p.beansFactory.createTableColumn("RsltDisp.unit_cd", MCColumnType.TEXT);
		p.columnRsltDisp_unit_nm = p.beansFactory.createTableColumn("RsltDisp.unit_nm", MCColumnType.TEXT);
		p.columnRsltDisp_dec_place = p.beansFactory.createTableColumn("RsltDisp.dec_place", MCColumnType.NUMBER);
		p.columnRsltDisp_rsrc_cd1 = p.beansFactory.createTableColumn("RsltDisp.rsrc_cd1", MCColumnType.TEXT);
		p.columnRsltDisp_rsrc_nm1 = p.beansFactory.createTableColumn("RsltDisp.rsrc_nm1", MCColumnType.TEXT);
		p.columnRsltDisp_rsrc_unit_nm1 = p.beansFactory.createTableColumn("RsltDisp.rsrc_unit_nm1", MCColumnType.TEXT);
		p.columnRsltDisp_rsrc_dec_place1 = p.beansFactory.createTableColumn("RsltDisp.rsrc_dec_place1", MCColumnType.NUMBER);
		p.columnRsltDisp_rsrc_rnd_typ1 = p.beansFactory.createTableColumn("RsltDisp.rsrc_rnd_typ1", MCColumnType.TEXT);
		p.columnRsltDisp_rsrc_cd2 = p.beansFactory.createTableColumn("RsltDisp.rsrc_cd2", MCColumnType.TEXT);
		p.columnRsltDisp_rsrc_nm2 = p.beansFactory.createTableColumn("RsltDisp.rsrc_nm2", MCColumnType.TEXT);
		p.columnRsltDisp_rsrc_unit_nm2 = p.beansFactory.createTableColumn("RsltDisp.rsrc_unit_nm2", MCColumnType.TEXT);
		p.columnRsltDisp_rsrc_dec_place2 = p.beansFactory.createTableColumn("RsltDisp.rsrc_dec_place2", MCColumnType.NUMBER);
		p.columnRsltDisp_rsrc_rnd_typ2 = p.beansFactory.createTableColumn("RsltDisp.rsrc_rnd_typ2", MCColumnType.TEXT);
		p.columnRsltDisp_mfg_loc_cd = p.beansFactory.createTableColumn("RsltDisp.mfg_loc_cd", MCColumnType.TEXT);
		p.columnRsltDisp_mfg_loc_nm = p.beansFactory.createTableColumn("RsltDisp.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRsltDisp_bom_ptn = p.beansFactory.createTableColumn("RsltDisp.bom_ptn", MCColumnType.TEXT);
		p.columnRsltDisp_strg_loc_cd = p.beansFactory.createTableColumn("RsltDisp.strg_loc_cd", MCColumnType.TEXT);
		p.columnRsltDisp_strg_loc_nm = p.beansFactory.createTableColumn("RsltDisp.strg_loc_nm", MCColumnType.TEXT);
		p.columnRsltDisp_wg_cd = p.beansFactory.createTableColumn("RsltDisp.wg_cd", MCColumnType.TEXT);
		p.columnRsltDisp_wg_nm = p.beansFactory.createTableColumn("RsltDisp.wg_nm", MCColumnType.TEXT);
		p.columnRsltDisp_not_fix_flg = p.beansFactory.createTableColumn("RsltDisp.not_fix_flg", MCColumnType.CHECK);
		p.columnRsltDisp_master_dt = p.beansFactory.createTableColumn("RsltDisp.master_dt", MCColumnType.DATE);
		p.columnRsltDisp_rqmt_no = p.beansFactory.createTableColumn("RsltDisp.rqmt_no", MCColumnType.TEXT);
		p.columnRsltDisp_io_schd_pr_no = p.beansFactory.createTableColumn("RsltDisp.io_schd_pr_no", MCColumnType.TEXT);
		p.columnRsltDisp_inst_po_cnt_rmrks = p.beansFactory.createTableColumn("RsltDisp.inst_po_cnt_rmrks", MCColumnType.TEXT);
		p.columnRsltDisp_intr_rmrks = p.beansFactory.createTableColumn("RsltDisp.intr_rmrks", MCColumnType.TEXT);
		p.columnRsltDisp_sub_char1 = p.beansFactory.createTableColumn("RsltDisp.sub_char1", MCColumnType.TEXT);
		p.columnRsltDisp_sub_char2 = p.beansFactory.createTableColumn("RsltDisp.sub_char2", MCColumnType.TEXT);
		p.columnRsltDisp_sub_char3 = p.beansFactory.createTableColumn("RsltDisp.sub_char3", MCColumnType.TEXT);
		p.columnRsltDisp_ins_usr_id = p.beansFactory.createTableColumn("RsltDisp.ins_usr_id", MCColumnType.TEXT);
		p.columnRsltDisp_ins_usr_nm = p.beansFactory.createTableColumn("RsltDisp.ins_usr_nm", MCColumnType.TEXT);
		p.columnRsltDisp_ins_func_id = p.beansFactory.createTableColumn("RsltDisp.ins_func_id", MCColumnType.TEXT);
		p.columnRsltDisp_ins_func_nm = p.beansFactory.createTableColumn("RsltDisp.ins_func_nm", MCColumnType.TEXT);
		p.columnRsltDisp_ins_ts = p.beansFactory.createTableColumn("RsltDisp.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRsltDisp_upd_cntr = p.beansFactory.createTableColumn("RsltDisp.upd_cntr", MCColumnType.NUMBER);
		p.columnRsltDisp_upd_usr_id = p.beansFactory.createTableColumn("RsltDisp.upd_usr_id", MCColumnType.TEXT);
		p.columnRsltDisp_upd_usr_nm = p.beansFactory.createTableColumn("RsltDisp.upd_usr_nm", MCColumnType.TEXT);
		p.columnRsltDisp_upd_func_id = p.beansFactory.createTableColumn("RsltDisp.upd_func_id", MCColumnType.TEXT);
		p.columnRsltDisp_upd_func_nm = p.beansFactory.createTableColumn("RsltDisp.upd_func_nm", MCColumnType.TEXT);
		p.columnRsltDisp_upd_ts = p.beansFactory.createTableColumn("RsltDisp.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRsltDisp_upd_srv_req_no = p.beansFactory.createTableColumn("RsltDisp.upd_srv_req_no", MCColumnType.TEXT);
		p.columnRsltDisp_disp_itm_cd = p.beansFactory.createTableColumn("RsltDisp.disp_itm_cd", MCColumnType.TEXT);
		p.columnRsltDisp_disp_sno = p.beansFactory.createTableColumn("RsltDisp.disp_sno", MCColumnType.TEXT);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_itm_ord_no = p.beansFactory.createTableColumn("Rslt.itm_ord_no", MCColumnType.TEXT);
		p.columnRslt_itm_ord_typ = p.beansFactory.createTableColumn("Rslt.itm_ord_typ", MCColumnType.TEXT);
		p.columnRslt_itm_ord_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_ord_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_ord_ld_sts_typ = p.beansFactory.createTableColumn("Rslt.itm_ord_ld_sts_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_itm_ord_ld_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_ord_ld_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_st_dt = p.beansFactory.createTableColumn("Rslt.mfg_st_dt", MCColumnType.DATE);
		p.columnRslt_mfg_end_dt = p.beansFactory.createTableColumn("Rslt.mfg_end_dt", MCColumnType.DATE);
		p.columnRslt_mfg_lt = p.beansFactory.createTableColumn("Rslt.mfg_lt", MCColumnType.NUMBER);
		p.columnRslt_unit_cd = p.beansFactory.createTableColumn("Rslt.unit_cd", MCColumnType.TEXT);
		p.columnRslt_unit_nm = p.beansFactory.createTableColumn("Rslt.unit_nm", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_rsrc_cd1 = p.beansFactory.createTableColumn("Rslt.rsrc_cd1", MCColumnType.TEXT);
		p.columnRslt_rsrc_nm1 = p.beansFactory.createTableColumn("Rslt.rsrc_nm1", MCColumnType.TEXT);
		p.columnRslt_rsrc_unit_nm1 = p.beansFactory.createTableColumn("Rslt.rsrc_unit_nm1", MCColumnType.TEXT);
		p.columnRslt_rsrc_dec_place1 = p.beansFactory.createTableColumn("Rslt.rsrc_dec_place1", MCColumnType.NUMBER);
		p.columnRslt_rsrc_rnd_typ1 = p.beansFactory.createTableColumn("Rslt.rsrc_rnd_typ1", MCColumnType.TEXT);
		p.columnRslt_rsrc_cd2 = p.beansFactory.createTableColumn("Rslt.rsrc_cd2", MCColumnType.TEXT);
		p.columnRslt_rsrc_nm2 = p.beansFactory.createTableColumn("Rslt.rsrc_nm2", MCColumnType.TEXT);
		p.columnRslt_rsrc_unit_nm2 = p.beansFactory.createTableColumn("Rslt.rsrc_unit_nm2", MCColumnType.TEXT);
		p.columnRslt_rsrc_dec_place2 = p.beansFactory.createTableColumn("Rslt.rsrc_dec_place2", MCColumnType.NUMBER);
		p.columnRslt_rsrc_rnd_typ2 = p.beansFactory.createTableColumn("Rslt.rsrc_rnd_typ2", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_bom_ptn = p.beansFactory.createTableColumn("Rslt.bom_ptn", MCColumnType.TEXT);
		p.columnRslt_strg_loc_cd = p.beansFactory.createTableColumn("Rslt.strg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_strg_loc_nm = p.beansFactory.createTableColumn("Rslt.strg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_not_fix_flg = p.beansFactory.createTableColumn("Rslt.not_fix_flg", MCColumnType.CHECK);
		p.columnRslt_master_dt = p.beansFactory.createTableColumn("Rslt.master_dt", MCColumnType.DATE);
		p.columnRslt_rqmt_no = p.beansFactory.createTableColumn("Rslt.rqmt_no", MCColumnType.TEXT);
		p.columnRslt_io_schd_pr_no = p.beansFactory.createTableColumn("Rslt.io_schd_pr_no", MCColumnType.TEXT);
		p.columnRslt_inst_po_cnt_rmrks = p.beansFactory.createTableColumn("Rslt.inst_po_cnt_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
		p.columnRslt_disp_itm_cd = p.beansFactory.createTableColumn("Rslt.disp_itm_cd", MCColumnType.TEXT);
		p.columnRslt_disp_sno = p.beansFactory.createTableColumn("Rslt.disp_sno", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.GanttPanel);
		p.TopPanel.setValueCheck(false);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CTCT+");
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
	protected static void jbInitFold(MSBCP_ItmOrdGanttChart p) {
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
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.Cnd1Panel, null);
		p.Tab1Panel.setLastBeans(p.Cnd1Panel);
		p.Cnd1Panel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Cnd1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd1(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.Cnd1Panel.setBorder(p.Cnd1TitledBorder);
		p.Cnd1Panel.setValueCheck(false);
		p.Cnd1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd1Panel.setLayoutPosition("CN");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd3Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd3Panel);
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("CC");
		// ブロックの項目の初期化
		p.Cnd1Panel.add(p.Cnd_opn_flg);
		p.Cnd1Panel.setLastBeans(p.Cnd_opn_flg);
		p.Cnd_opn_flg.setNextBeans(p.Cnd_sav_flg);
		p.Cnd_opn_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.opn_flg_META);
		p.Cnd1Panel.add(p.Cnd_sav_flg);
		p.Cnd_sav_flg.setNextBeans(p.Cnd_fix_flg);
		p.Cnd_sav_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.sav_flg_META);
		p.Cnd1Panel.add(p.Cnd_fix_flg);
		p.Cnd_fix_flg.setNextBeans(p.Cnd_inst_flg);
		p.Cnd_fix_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.fix_flg_META);
		p.Cnd1Panel.add(p.Cnd_inst_flg);
		p.Cnd_inst_flg.setNextBeans(p.Cnd_cmpl_flg);
		p.Cnd_inst_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.inst_flg_META);
		p.Cnd1Panel.add(p.Cnd_cmpl_flg);
		p.Cnd_cmpl_flg.setNextBeans(p.Cnd_prcd_flg);
		p.Cnd_cmpl_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.cmpl_flg_META);
		p.Cnd1Panel.add(p.Cnd_prcd_flg);
		p.Cnd_prcd_flg.setNextBeans(p.Cnd_sim_flg);
		p.Cnd_prcd_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.prcd_flg_META);
		p.Cnd1Panel.add(p.Cnd_sim_flg);
		p.Cnd_sim_flg.setNextBeans(p.Cnd_sim_mrp_no);
		p.Cnd_sim_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.sim_flg_META);
		p.Cnd1Panel.add(p.Cnd_sim_mrp_no_Label);
		p.Cnd1Panel.add(p.Cnd_sim_mrp_no);
		p.Cnd_sim_mrp_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.sim_mrp_no_META);
		p.CndPanel.add(p.Cnd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_dt_fr);
		p.Cnd_dt_fr.setNextBeans(p.Cnd_dt_to);
		p.Cnd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.dt_fr_META);
		p.Cnd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dt_to_Label);
		p.CndPanel.add(p.Cnd_dt_to);
		p.Cnd_dt_to.setNextBeans(p.Cnd_site_cd);
		p.Cnd_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.dt_to_META);
		p.Cnd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.STRICT);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_loc_grp_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.wg_nm_META);
		p.Cnd_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_grp_cd, true);
		p.Cnd_loc_grp_cd.setLinkBeans(p.Cnd_loc_grp_nm);
		p.CndPanel.add(p.Cnd_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_loc_grp_cd);
		p.Cnd_loc_grp_cd.setNextBeans(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_nm.setNextBeans(p.Cnd_mfg_loc_cd);
		p.Cnd_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_mfg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_cd);
		p.Cnd_mfg_loc_cd.setNextBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.mfg_loc_cd_META);
		p.Cnd_mfg_loc_cd.addLinkBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_cd, true);
		p.CndPanel.add(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_nm.setNextBeans(p.Cnd_alloc_pln_r_view_Group);
		p.Cnd_mfg_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.mfg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_loc_nm, true);
		p.CndPanel.add(p.Cnd_alloc_pln_r_label);
		p.Cnd_alloc_pln_r_view_Group.setFirstBeans(p.Cnd_alloc_pln_r_view_NRML);
		p.Cnd_alloc_pln_r_view_NRML.setActionCommand("0");
		p.Cnd_alloc_pln_r_view_Group.add(p.Cnd_alloc_pln_r_view_NRML);
		p.CndPanel.add(p.Cnd_alloc_pln_r_view_NRML);
		p.Cnd_alloc_pln_r_view_NRML.setNextBeans(p.Cnd_alloc_pln_r_view_PRCD);
		p.Cnd_alloc_pln_r_view_PRCD.setActionCommand("1");
		p.Cnd_alloc_pln_r_view_Group.add(p.Cnd_alloc_pln_r_view_PRCD);
		p.CndPanel.add(p.Cnd_alloc_pln_r_view_PRCD);
		p.Cnd_alloc_pln_r_view_PRCD.setNextBeans(p.Cnd_alloc_pln_r_view_SIM);
		p.Cnd_alloc_pln_r_view_SIM.setActionCommand("2");
		p.Cnd_alloc_pln_r_view_Group.add(p.Cnd_alloc_pln_r_view_SIM);
		p.CndPanel.add(p.Cnd_alloc_pln_r_view_SIM);
		p.Cnd_alloc_pln_r_view_SIM.setNextBeans(p.Cnd_alloc_pln_r_view_NO);
		p.Cnd_alloc_pln_r_view_NO.setActionCommand("3");
		p.Cnd_alloc_pln_r_view_Group.add(p.Cnd_alloc_pln_r_view_NO);
		p.CndPanel.add(p.Cnd_alloc_pln_r_view_NO);
		p.Cnd_alloc_pln_r_view_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0290.CndR.alloc_pln_r_view_META);
		p.Cnd3Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd3Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.LPnlPanel.add(p.LPnl_select_dt_fr_Label);
		p.LPnlPanel.add(p.LPnl_select_dt_fr);
		p.LPnlPanel.setLastBeans(p.LPnl_select_dt_fr);
		p.LPnl_select_dt_fr.setNextBeans(p.LPnl_select_dt_to);
		p.LPnl_select_dt_fr.setRow(p.getLPnlR(), mcframe.clientMSBC.MSBCP0290.LPnlR.select_dt_fr_META);
		p.LPnl_select_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.LPnlPanel.add(p.LPnl_select_dt_to_Label);
		p.LPnlPanel.add(p.LPnl_select_dt_to);
		p.LPnl_select_dt_to.setNextBeans(p.LPnl_select);
		p.LPnl_select_dt_to.setRow(p.getLPnlR(), mcframe.clientMSBC.MSBCP0290.LPnlR.select_dt_to_META);
		p.LPnl_select_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.LPnl_select.setFunctionKey(MCFunctionKey.F5);
		p.LPnlPanel.add(p.LPnl_select);
		p.LPnl_select.setNextBeans(p.LPnl_select_by_alloc_pln);
		p.LPnl_select_by_alloc_pln.setFunctionKey(MCFunctionKey.F6);
		p.LPnlPanel.add(p.LPnl_select_by_alloc_pln);
		p.LPnl_select_by_alloc_pln.setNextBeans(p.LPnl_move_prev_day);
		p.LPnl_move_prev_day.setFunctionKey(MCFunctionKey.F15);
		p.LPnlPanel.add(p.LPnl_move_prev_day);
		p.LPnl_move_prev_day.setNextBeans(p.LPnl_move_next_day);
		p.LPnl_move_next_day.setFunctionKey(MCFunctionKey.F16);
		p.LPnlPanel.add(p.LPnl_move_next_day);
		p.LPnl_move_next_day.setNextBeans(p.LPnl_sts_opn);
		p.LPnl_sts_opn.setFunctionKey(MCFunctionKey.F17);
		p.LPnlPanel.add(p.LPnl_sts_opn);
		p.LPnl_sts_opn.setNextBeans(p.LPnl_sts_sav);
		p.LPnl_sts_sav.setFunctionKey(MCFunctionKey.F18);
		p.LPnlPanel.add(p.LPnl_sts_sav);
		p.LPnl_sts_sav.setNextBeans(p.LPnl_rdel);
		p.LPnl_rdel.setFunctionKey(MCFunctionKey.F19);
		p.LPnlPanel.add(p.LPnl_rdel);
		p.LPnl_rdel.setNextBeans(p.LPnl_undo);
		p.LPnl_undo.setFunctionKey(MCFunctionKey.F20);
		p.LPnlPanel.add(p.LPnl_undo);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Gantt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitGantt(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.add(p.GanttPanel);
		p.GanttPanel.setNextBeans(p.RsltDispPanel);
		p.GanttPanel.add(p.GanttScrollPane);
		p.GanttPanel.setLastBeans(p.GanttTable);
		p.GanttScrollPane.setViewportView(p.GanttTable);
		p.GanttTable.setList(p.getGanttL());
		p.GanttPanel.setLayoutPosition("CTCB");
		// ブロックの項目の初期化
	}

	/**
	 * [RsltDisp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltDisp(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.add(p.RsltDispPanel);
		p.RsltDispPanel.setNextBeans(p.RsltPanel);
		p.RsltDispPanel.add(p.RsltDispScrollPane);
		p.RsltDispPanel.setLastBeans(p.RsltDispTable);
		p.RsltDispScrollPane.setViewportView(p.RsltDispTable);
		p.RsltDispTable.setList(p.getRsltDispL());
		p.RsltDispPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBCP_ItmOrdGanttChart p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.setLastBeans(p.Btn_upd);
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
		MSBCP_ItmOrdGanttChart_MC.mcInitTop((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.mcInitFold((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.mcInitTab1((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.mcInitCnd1((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.mcInitTab2((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.mcInitCnd3((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.mcInitCnd((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.mcInitLPnl((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.mcInitCtrl((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.mcInitGantt((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.mcInitRsltDisp((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.mcInitRslt((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.mcInitBtn((MSBCP_ItmOrdGanttChart)this);

		// [SRCH]ステータスのモードの設定
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_Top((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_Fold((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_Tab1((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_Cnd1((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_Tab2((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_Cnd3((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_Cnd((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_LPnl((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_Ctrl((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_Gantt((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_RsltDisp((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_Rslt((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_Btn((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_Loc((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_RsrcLoc((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_Cal((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitSRCH_AllocPln((MSBCP_ItmOrdGanttChart)this);

		// [UPD]ステータスのモードの設定
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_Top((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_Fold((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_Tab1((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_Cnd1((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_Tab2((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_Cnd3((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_Cnd((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_LPnl((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_Ctrl((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_Gantt((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_RsltDisp((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_Rslt((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_Btn((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_Loc((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_RsrcLoc((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_Cal((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitUPD_AllocPln((MSBCP_ItmOrdGanttChart)this);

		// [FIX_U]ステータスのモードの設定
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_Top((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_Fold((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_Tab1((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_Cnd1((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_Tab2((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_Cnd3((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_Cnd((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_LPnl((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_Ctrl((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_Gantt((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_RsltDisp((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_Rslt((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_Btn((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_Loc((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_RsrcLoc((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_Cal((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.statusInitFIX__U_AllocPln((MSBCP_ItmOrdGanttChart)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_ItmOrdGanttChart p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_ItmOrdGanttChart p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBCP_ItmOrdGanttChart p) {
	}

	/**
	 *  [Cnd1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd1(MSBCP_ItmOrdGanttChart p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBCP_ItmOrdGanttChart p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MSBCP_ItmOrdGanttChart p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_ItmOrdGanttChart p) {
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
		p.Cnd_alloc_pln_r_view_Group.addAllListener(p);
		p.Cnd_alloc_pln_r_view_NRML.addAllListener(p);
		p.Cnd_alloc_pln_r_view_PRCD.addAllListener(p);
		p.Cnd_alloc_pln_r_view_SIM.addAllListener(p);
		p.Cnd_alloc_pln_r_view_NO.addAllListener(p);
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MSBCP_ItmOrdGanttChart p) {
		p.LPnl_select_dt_fr.setListListener(p);
		p.LPnl_select_dt_fr.addAllListener(p);
		p.LPnl_select_dt_to.setListListener(p);
		p.LPnl_select_dt_to.addAllListener(p);
		p.LPnl_select.addAllListener(p);
		p.LPnl_select.setAPMethodName("doLPnl_select");
		p.LPnl_select_by_alloc_pln.addAllListener(p);
		p.LPnl_select_by_alloc_pln.setAPMethodName("doLPnl_select_by_alloc_pln");
		p.LPnl_move_prev_day.addAllListener(p);
		p.LPnl_move_prev_day.setAPMethodName("doLPnl_move_prev_day");
		p.LPnl_move_next_day.addAllListener(p);
		p.LPnl_move_next_day.setAPMethodName("doLPnl_move_next_day");
		p.LPnl_sts_opn.addAllListener(p);
		p.LPnl_sts_opn.setAPMethodName("doLPnl_sts_opn");
		p.LPnl_sts_sav.addAllListener(p);
		p.LPnl_sts_sav.setAPMethodName("doLPnl_sts_sav");
		p.LPnl_rdel.addAllListener(p);
		p.LPnl_rdel.setAPMethodName("doLPnl_rdel");
		p.LPnl_undo.addAllListener(p);
		p.LPnl_undo.setAPMethodName("doLPnl_undo");
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBCP_ItmOrdGanttChart p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Gantt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitGantt(MSBCP_ItmOrdGanttChart p) {
		p.GanttTable.addAllListener(p);
	}

	/**
	 *  [RsltDisp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltDisp(MSBCP_ItmOrdGanttChart p) {
		p.RsltDispTable.addAllListener(p);
		p.columnRsltDisp_itm_ord_no.addAllListener(p);
		p.columnRsltDisp_itm_ord_no.setListListener(p);
		p.columnRsltDisp_itm_ord_typ.addAllListener(p);
		p.columnRsltDisp_itm_ord_typ.setListListener(p);
		p.columnRsltDisp_itm_ord_typ_nm.addAllListener(p);
		p.columnRsltDisp_itm_ord_typ_nm.setListListener(p);
		p.columnRsltDisp_itm_ord_ld_sts_typ.addAllListener(p);
		p.columnRsltDisp_itm_ord_ld_sts_typ.setListListener(p);
		p.columnRsltDisp_itm_ord_ld_sts_typ_nm.addAllListener(p);
		p.columnRsltDisp_itm_ord_ld_sts_typ_nm.setListListener(p);
		p.columnRsltDisp_mfg_st_dt.addAllListener(p);
		p.columnRsltDisp_mfg_st_dt.setListListener(p);
		p.columnRsltDisp_mfg_end_dt.addAllListener(p);
		p.columnRsltDisp_mfg_end_dt.setListListener(p);
		p.columnRsltDisp_mfg_lt.addAllListener(p);
		p.columnRsltDisp_mfg_lt.setListListener(p);
		p.columnRsltDisp_unit_cd.addAllListener(p);
		p.columnRsltDisp_unit_cd.setListListener(p);
		p.columnRsltDisp_unit_nm.addAllListener(p);
		p.columnRsltDisp_unit_nm.setListListener(p);
		p.columnRsltDisp_dec_place.addAllListener(p);
		p.columnRsltDisp_dec_place.setListListener(p);
		p.columnRsltDisp_rsrc_cd1.addAllListener(p);
		p.columnRsltDisp_rsrc_cd1.setListListener(p);
		p.columnRsltDisp_rsrc_nm1.addAllListener(p);
		p.columnRsltDisp_rsrc_nm1.setListListener(p);
		p.columnRsltDisp_rsrc_unit_nm1.addAllListener(p);
		p.columnRsltDisp_rsrc_unit_nm1.setListListener(p);
		p.columnRsltDisp_rsrc_dec_place1.addAllListener(p);
		p.columnRsltDisp_rsrc_dec_place1.setListListener(p);
		p.columnRsltDisp_rsrc_rnd_typ1.addAllListener(p);
		p.columnRsltDisp_rsrc_rnd_typ1.setListListener(p);
		p.columnRsltDisp_rsrc_cd2.addAllListener(p);
		p.columnRsltDisp_rsrc_cd2.setListListener(p);
		p.columnRsltDisp_rsrc_nm2.addAllListener(p);
		p.columnRsltDisp_rsrc_nm2.setListListener(p);
		p.columnRsltDisp_rsrc_unit_nm2.addAllListener(p);
		p.columnRsltDisp_rsrc_unit_nm2.setListListener(p);
		p.columnRsltDisp_rsrc_dec_place2.addAllListener(p);
		p.columnRsltDisp_rsrc_dec_place2.setListListener(p);
		p.columnRsltDisp_rsrc_rnd_typ2.addAllListener(p);
		p.columnRsltDisp_rsrc_rnd_typ2.setListListener(p);
		p.columnRsltDisp_mfg_loc_cd.addAllListener(p);
		p.columnRsltDisp_mfg_loc_cd.setListListener(p);
		p.columnRsltDisp_mfg_loc_nm.addAllListener(p);
		p.columnRsltDisp_mfg_loc_nm.setListListener(p);
		p.columnRsltDisp_bom_ptn.addAllListener(p);
		p.columnRsltDisp_bom_ptn.setListListener(p);
		p.columnRsltDisp_strg_loc_cd.addAllListener(p);
		p.columnRsltDisp_strg_loc_cd.setListListener(p);
		p.columnRsltDisp_strg_loc_nm.addAllListener(p);
		p.columnRsltDisp_strg_loc_nm.setListListener(p);
		p.columnRsltDisp_wg_cd.addAllListener(p);
		p.columnRsltDisp_wg_cd.setListListener(p);
		p.columnRsltDisp_wg_nm.addAllListener(p);
		p.columnRsltDisp_wg_nm.setListListener(p);
		p.columnRsltDisp_not_fix_flg.addAllListener(p);
		p.columnRsltDisp_master_dt.addAllListener(p);
		p.columnRsltDisp_master_dt.setListListener(p);
		p.columnRsltDisp_rqmt_no.addAllListener(p);
		p.columnRsltDisp_rqmt_no.setListListener(p);
		p.columnRsltDisp_io_schd_pr_no.addAllListener(p);
		p.columnRsltDisp_io_schd_pr_no.setListListener(p);
		p.columnRsltDisp_inst_po_cnt_rmrks.addAllListener(p);
		p.columnRsltDisp_inst_po_cnt_rmrks.setListListener(p);
		p.columnRsltDisp_intr_rmrks.addAllListener(p);
		p.columnRsltDisp_intr_rmrks.setListListener(p);
		p.columnRsltDisp_sub_char1.addAllListener(p);
		p.columnRsltDisp_sub_char1.setListListener(p);
		p.columnRsltDisp_sub_char2.addAllListener(p);
		p.columnRsltDisp_sub_char2.setListListener(p);
		p.columnRsltDisp_sub_char3.addAllListener(p);
		p.columnRsltDisp_sub_char3.setListListener(p);
		p.columnRsltDisp_ins_usr_id.addAllListener(p);
		p.columnRsltDisp_ins_usr_id.setListListener(p);
		p.columnRsltDisp_ins_usr_nm.addAllListener(p);
		p.columnRsltDisp_ins_usr_nm.setListListener(p);
		p.columnRsltDisp_ins_func_id.addAllListener(p);
		p.columnRsltDisp_ins_func_id.setListListener(p);
		p.columnRsltDisp_ins_func_nm.addAllListener(p);
		p.columnRsltDisp_ins_func_nm.setListListener(p);
		p.columnRsltDisp_ins_ts.addAllListener(p);
		p.columnRsltDisp_ins_ts.setListListener(p);
		p.columnRsltDisp_upd_cntr.addAllListener(p);
		p.columnRsltDisp_upd_cntr.setListListener(p);
		p.columnRsltDisp_upd_usr_id.addAllListener(p);
		p.columnRsltDisp_upd_usr_id.setListListener(p);
		p.columnRsltDisp_upd_usr_nm.addAllListener(p);
		p.columnRsltDisp_upd_usr_nm.setListListener(p);
		p.columnRsltDisp_upd_func_id.addAllListener(p);
		p.columnRsltDisp_upd_func_id.setListListener(p);
		p.columnRsltDisp_upd_func_nm.addAllListener(p);
		p.columnRsltDisp_upd_func_nm.setListListener(p);
		p.columnRsltDisp_upd_ts.addAllListener(p);
		p.columnRsltDisp_upd_ts.setListListener(p);
		p.columnRsltDisp_upd_srv_req_no.addAllListener(p);
		p.columnRsltDisp_upd_srv_req_no.setListListener(p);
		p.columnRsltDisp_disp_itm_cd.addAllListener(p);
		p.columnRsltDisp_disp_itm_cd.setListListener(p);
		p.columnRsltDisp_disp_sno.addAllListener(p);
		p.columnRsltDisp_disp_sno.setListListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBCP_ItmOrdGanttChart p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_itm_ord_no.addAllListener(p);
		p.columnRslt_itm_ord_no.setListListener(p);
		p.columnRslt_itm_ord_typ.addAllListener(p);
		p.columnRslt_itm_ord_typ.setListListener(p);
		p.columnRslt_itm_ord_typ_nm.addAllListener(p);
		p.columnRslt_itm_ord_typ_nm.setListListener(p);
		p.columnRslt_itm_ord_ld_sts_typ.addAllListener(p);
		p.columnRslt_itm_ord_ld_sts_typ.setListListener(p);
		p.columnRslt_itm_ord_ld_sts_typ_nm.addAllListener(p);
		p.columnRslt_itm_ord_ld_sts_typ_nm.setListListener(p);
		p.columnRslt_mfg_st_dt.addAllListener(p);
		p.columnRslt_mfg_st_dt.setListListener(p);
		p.columnRslt_mfg_end_dt.addAllListener(p);
		p.columnRslt_mfg_end_dt.setListListener(p);
		p.columnRslt_mfg_lt.addAllListener(p);
		p.columnRslt_mfg_lt.setListListener(p);
		p.columnRslt_unit_cd.addAllListener(p);
		p.columnRslt_unit_cd.setListListener(p);
		p.columnRslt_unit_nm.addAllListener(p);
		p.columnRslt_unit_nm.setListListener(p);
		p.columnRslt_dec_place.addAllListener(p);
		p.columnRslt_dec_place.setListListener(p);
		p.columnRslt_rsrc_cd1.addAllListener(p);
		p.columnRslt_rsrc_cd1.setListListener(p);
		p.columnRslt_rsrc_nm1.addAllListener(p);
		p.columnRslt_rsrc_nm1.setListListener(p);
		p.columnRslt_rsrc_unit_nm1.addAllListener(p);
		p.columnRslt_rsrc_unit_nm1.setListListener(p);
		p.columnRslt_rsrc_dec_place1.addAllListener(p);
		p.columnRslt_rsrc_dec_place1.setListListener(p);
		p.columnRslt_rsrc_rnd_typ1.addAllListener(p);
		p.columnRslt_rsrc_rnd_typ1.setListListener(p);
		p.columnRslt_rsrc_cd2.addAllListener(p);
		p.columnRslt_rsrc_cd2.setListListener(p);
		p.columnRslt_rsrc_nm2.addAllListener(p);
		p.columnRslt_rsrc_nm2.setListListener(p);
		p.columnRslt_rsrc_unit_nm2.addAllListener(p);
		p.columnRslt_rsrc_unit_nm2.setListListener(p);
		p.columnRslt_rsrc_dec_place2.addAllListener(p);
		p.columnRslt_rsrc_dec_place2.setListListener(p);
		p.columnRslt_rsrc_rnd_typ2.addAllListener(p);
		p.columnRslt_rsrc_rnd_typ2.setListListener(p);
		p.columnRslt_mfg_loc_cd.addAllListener(p);
		p.columnRslt_mfg_loc_cd.setListListener(p);
		p.columnRslt_mfg_loc_nm.addAllListener(p);
		p.columnRslt_mfg_loc_nm.setListListener(p);
		p.columnRslt_bom_ptn.addAllListener(p);
		p.columnRslt_bom_ptn.setListListener(p);
		p.columnRslt_strg_loc_cd.addAllListener(p);
		p.columnRslt_strg_loc_cd.setListListener(p);
		p.columnRslt_strg_loc_nm.addAllListener(p);
		p.columnRslt_strg_loc_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_not_fix_flg.addAllListener(p);
		p.columnRslt_master_dt.addAllListener(p);
		p.columnRslt_master_dt.setListListener(p);
		p.columnRslt_rqmt_no.addAllListener(p);
		p.columnRslt_rqmt_no.setListListener(p);
		p.columnRslt_io_schd_pr_no.addAllListener(p);
		p.columnRslt_io_schd_pr_no.setListListener(p);
		p.columnRslt_inst_po_cnt_rmrks.addAllListener(p);
		p.columnRslt_inst_po_cnt_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
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
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
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
		p.columnRslt_disp_itm_cd.addAllListener(p);
		p.columnRslt_disp_itm_cd.setListListener(p);
		p.columnRslt_disp_sno.addAllListener(p);
		p.columnRslt_disp_sno.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBCP_ItmOrdGanttChart p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [SRCH]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd1(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBCP_ItmOrdGanttChart p){
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
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_loc_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alloc_pln_r_label.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alloc_pln_r_view_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MSBCP_ItmOrdGanttChart p){
		p.LPnl_select_dt_fr.putMode(p, SRCH, MCMode.DISABLE);
		p.LPnl_select_dt_to.putMode(p, SRCH, MCMode.DISABLE);
		p.LPnl_select.putMode(p, SRCH, MCMode.DISABLE);
		p.LPnl_select_by_alloc_pln.putMode(p, SRCH, MCMode.DISABLE);
		p.LPnl_move_prev_day.putMode(p, SRCH, MCMode.DISABLE);
		p.LPnl_move_next_day.putMode(p, SRCH, MCMode.DISABLE);
		p.LPnl_sts_opn.putMode(p, SRCH, MCMode.DISABLE);
		p.LPnl_sts_sav.putMode(p, SRCH, MCMode.DISABLE);
		p.LPnl_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.LPnl_undo.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [SRCH]ステータスの[Gantt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Gantt(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [SRCH]ステータスの[RsltDisp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltDisp(MSBCP_ItmOrdGanttChart p){
		p.columnRsltDisp_itm_ord_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_itm_ord_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_itm_ord_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_itm_ord_ld_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_itm_ord_ld_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltDisp_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltDisp_mfg_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_mfg_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_mfg_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltDisp_inst_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltDisp_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_rsrc_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltDisp_rsrc_act_qty1_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltDisp_rsrc_unit_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_rsrc_dec_place1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_rnd_typ1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_rsrc_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltDisp_rsrc_act_qty2_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltDisp_rsrc_unit_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_rsrc_dec_place2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_rnd_typ2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.RsltDisp_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltDisp_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_strg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_strg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_not_fix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_master_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_rqmt_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_io_schd_pr_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_inst_po_cnt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltDisp_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRsltDisp_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltDisp_disp_itm_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltDisp_disp_sno.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBCP_ItmOrdGanttChart p){
		p.columnRslt_itm_ord_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_ld_sts_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_ld_sts_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_mfg_st_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_mfg_end_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_mfg_lt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_unit_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_unit_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rsrc_cd1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rsrc_nm1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_rsrc_act_qty1_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_rsrc_unit_nm1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rsrc_dec_place1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rsrc_rnd_typ1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rsrc_cd2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rsrc_nm2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_rsrc_act_qty2_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_rsrc_unit_nm2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rsrc_dec_place2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rsrc_rnd_typ2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_bom_ptn.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_not_fix_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rqmt_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_disp_itm_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_disp_sno.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBCP_ItmOrdGanttChart p){
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Loc]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Loc(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [SRCH]ステータスの[RsrcLoc]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsrcLoc(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [SRCH]ステータスの[Cal]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cal(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [SRCH]ステータスの[AllocPln]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AllocPln(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [UPD]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd1(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [UPD]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd3(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBCP_ItmOrdGanttChart p){
		p.Cnd_opn_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_inst_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_prcd_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sim_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sim_mrp_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dt_fr.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dt_to.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_loc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alloc_pln_r_label.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alloc_pln_r_view_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LPnl(MSBCP_ItmOrdGanttChart p){
		p.LPnl_select_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.LPnl_select_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.LPnl_select.putMode(p, UPD, MCMode.ENABLE);
		p.LPnl_select_by_alloc_pln.putMode(p, UPD, MCMode.ENABLE);
		p.LPnl_move_prev_day.putMode(p, UPD, MCMode.ENABLE);
		p.LPnl_move_next_day.putMode(p, UPD, MCMode.ENABLE);
		p.LPnl_sts_opn.putMode(p, UPD, MCMode.ENABLE);
		p.LPnl_sts_sav.putMode(p, UPD, MCMode.ENABLE);
		p.LPnl_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LPnl_undo.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [UPD]ステータスの[Gantt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Gantt(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [UPD]ステータスの[RsltDisp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RsltDisp(MSBCP_ItmOrdGanttChart p){
		p.columnRsltDisp_itm_ord_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_itm_ord_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_itm_ord_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_itm_ord_ld_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_itm_ord_ld_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RsltDisp_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltDisp_mfg_st_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_mfg_end_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_mfg_lt.putMode(p, UPD, MCMode.READ_ONLY);
		p.RsltDisp_inst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltDisp_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_rsrc_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.RsltDisp_rsrc_act_qty1_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltDisp_rsrc_unit_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_rsrc_dec_place1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_rnd_typ1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_rsrc_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.RsltDisp_rsrc_act_qty2_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltDisp_rsrc_unit_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_rsrc_dec_place2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_rnd_typ2.putMode(p, UPD, MCMode.INVISIBLE);
		p.RsltDisp_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltDisp_mfg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_mfg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_bom_ptn.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_strg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_strg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_not_fix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_master_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_rqmt_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_io_schd_pr_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_inst_po_cnt_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_intr_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.RsltDisp_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRsltDisp_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRsltDisp_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRsltDisp_disp_itm_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRsltDisp_disp_sno.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBCP_ItmOrdGanttChart p){
		p.columnRslt_itm_ord_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_ld_sts_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_ld_sts_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_mfg_st_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_mfg_end_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_mfg_lt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_unit_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_unit_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rsrc_cd1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rsrc_nm1.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_rsrc_act_qty1_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_rsrc_unit_nm1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rsrc_dec_place1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rsrc_rnd_typ1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rsrc_cd2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rsrc_nm2.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_rsrc_act_qty2_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_rsrc_unit_nm2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rsrc_dec_place2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rsrc_rnd_typ2.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_bom_ptn.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_strg_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_strg_loc_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_wg_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_not_fix_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_io_schd_pr_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ins_func_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ins_func_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ins_ts.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_upd_func_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_upd_func_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_upd_ts.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_disp_itm_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_disp_sno.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBCP_ItmOrdGanttChart p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Loc]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Loc(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [UPD]ステータスの[RsrcLoc]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RsrcLoc(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [UPD]ステータスの[Cal]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cal(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [UPD]ステータスの[AllocPln]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AllocPln(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd1(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd3(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBCP_ItmOrdGanttChart p){
		p.Cnd_opn_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_inst_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_prcd_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_sim_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_sim_mrp_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_dt_fr.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_dt_to.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_site_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_loc_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_alloc_pln_r_label.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_alloc_pln_r_view_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_LPnl(MSBCP_ItmOrdGanttChart p){
		p.LPnl_select_dt_fr.putMode(p, FIX_U, MCMode.DISABLE);
		p.LPnl_select_dt_to.putMode(p, FIX_U, MCMode.DISABLE);
		p.LPnl_select.putMode(p, FIX_U, MCMode.DISABLE);
		p.LPnl_select_by_alloc_pln.putMode(p, FIX_U, MCMode.DISABLE);
		p.LPnl_move_prev_day.putMode(p, FIX_U, MCMode.DISABLE);
		p.LPnl_move_next_day.putMode(p, FIX_U, MCMode.DISABLE);
		p.LPnl_sts_opn.putMode(p, FIX_U, MCMode.DISABLE);
		p.LPnl_sts_sav.putMode(p, FIX_U, MCMode.DISABLE);
		p.LPnl_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.LPnl_undo.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [FIX_U]ステータスの[Gantt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Gantt(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [FIX_U]ステータスの[RsltDisp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RsltDisp(MSBCP_ItmOrdGanttChart p){
		p.columnRsltDisp_itm_ord_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_itm_ord_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_itm_ord_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_itm_ord_ld_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_itm_ord_ld_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RsltDisp_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltDisp_mfg_st_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_mfg_end_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_mfg_lt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RsltDisp_inst_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltDisp_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_rsrc_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RsltDisp_rsrc_act_qty1_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltDisp_rsrc_unit_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_rsrc_dec_place1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_rnd_typ1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_rsrc_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RsltDisp_rsrc_act_qty2_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltDisp_rsrc_unit_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_rsrc_dec_place2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRsltDisp_rsrc_rnd_typ2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.RsltDisp_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltDisp_mfg_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_mfg_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_bom_ptn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_strg_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_strg_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_not_fix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_master_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_rqmt_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_io_schd_pr_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_inst_po_cnt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RsltDisp_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRsltDisp_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRsltDisp_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRsltDisp_disp_itm_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRsltDisp_disp_sno.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MSBCP_ItmOrdGanttChart p){
		p.columnRslt_itm_ord_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_ld_sts_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_itm_ord_ld_sts_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_mfg_st_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_mfg_end_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_mfg_lt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_unit_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_unit_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rsrc_cd1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rsrc_nm1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_rsrc_act_qty1_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_rsrc_unit_nm1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rsrc_dec_place1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rsrc_rnd_typ1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rsrc_cd2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rsrc_nm2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_rsrc_act_qty2_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_rsrc_unit_nm2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rsrc_dec_place2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rsrc_rnd_typ2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_bom_ptn.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_strg_loc_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_strg_loc_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_wg_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_not_fix_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rqmt_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_io_schd_pr_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sub_char2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sub_char3.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ins_func_id.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ins_func_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ins_ts.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_upd_func_id.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_upd_func_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_upd_ts.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_disp_itm_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_disp_sno.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBCP_ItmOrdGanttChart p){
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Loc]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Loc(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [FIX_U]ステータスの[RsrcLoc]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RsrcLoc(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [FIX_U]ステータスの[Cal]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cal(MSBCP_ItmOrdGanttChart p){

	}

	/**
	 * [FIX_U]ステータスの[AllocPln]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_AllocPln(MSBCP_ItmOrdGanttChart p){

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
		MSBCP_ItmOrdGanttChart_MC.setTableConfigGantt((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.setTableConfigRsltDisp((MSBCP_ItmOrdGanttChart)this);
		MSBCP_ItmOrdGanttChart_MC.setTableConfigRslt((MSBCP_ItmOrdGanttChart)this);
	}

	/**
	 * [Gantt]ブロックのTableの設定
	 */
	protected static void setTableConfigGantt(MSBCP_ItmOrdGanttChart p) {
	}

	/**
	 * [RsltDisp]ブロックのTableの設定
	 */
	protected static void setTableConfigRsltDisp(MSBCP_ItmOrdGanttChart p) {
		p.columnRsltDisp_itm_ord_no.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.itm_ord_no_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_itm_ord_no);
		p.columnRsltDisp_itm_ord_typ.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.itm_ord_typ_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_itm_ord_typ);
		p.columnRsltDisp_itm_ord_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.itm_ord_typ_nm_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_itm_ord_typ_nm);
		p.columnRsltDisp_itm_ord_ld_sts_typ.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.itm_ord_ld_sts_typ_META);
		p.columnRsltDisp_itm_ord_ld_sts_typ.addLinkBeans(p.columnRsltDisp_itm_ord_ld_sts_typ_nm);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_itm_ord_ld_sts_typ);
		p.columnRsltDisp_itm_ord_ld_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.itm_ord_ld_sts_typ_nm_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_itm_ord_ld_sts_typ_nm);
		p.RsltDispTable.addTable(p.RsltDisp_itm_p_PPanel.ItmTable);
		p.columnRsltDisp_mfg_st_dt.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.mfg_st_dt_META);
		p.columnRsltDisp_mfg_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_mfg_st_dt);
		p.columnRsltDisp_mfg_end_dt.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.mfg_end_dt_META);
		p.columnRsltDisp_mfg_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_mfg_end_dt);
		p.columnRsltDisp_mfg_lt.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.mfg_lt_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_mfg_lt);
		p.RsltDispTable.addTable(p.RsltDisp_inst_qty_p_PPanel.QtyTable);
		p.columnRsltDisp_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.unit_cd_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_unit_cd);
		p.columnRsltDisp_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.unit_nm_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_unit_nm);
		p.columnRsltDisp_dec_place.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.dec_place_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_dec_place);
		p.columnRsltDisp_rsrc_cd1.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_cd1_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rsrc_cd1);
		p.columnRsltDisp_rsrc_nm1.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_nm1_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rsrc_nm1);
		p.RsltDispTable.addTable(p.RsltDisp_rsrc_act_qty1_p_PPanel.QtyTable);
		p.columnRsltDisp_rsrc_unit_nm1.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_unit_nm1_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rsrc_unit_nm1);
		p.columnRsltDisp_rsrc_dec_place1.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_dec_place1_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rsrc_dec_place1);
		p.columnRsltDisp_rsrc_rnd_typ1.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_rnd_typ1_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rsrc_rnd_typ1);
		p.columnRsltDisp_rsrc_cd2.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_cd2_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rsrc_cd2);
		p.columnRsltDisp_rsrc_nm2.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_nm2_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rsrc_nm2);
		p.RsltDispTable.addTable(p.RsltDisp_rsrc_act_qty2_p_PPanel.QtyTable);
		p.columnRsltDisp_rsrc_unit_nm2.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_unit_nm2_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rsrc_unit_nm2);
		p.columnRsltDisp_rsrc_dec_place2.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_dec_place2_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rsrc_dec_place2);
		p.columnRsltDisp_rsrc_rnd_typ2.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_rnd_typ2_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rsrc_rnd_typ2);
		p.RsltDispTable.addTable(p.RsltDisp_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRsltDisp_mfg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.mfg_loc_cd_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_mfg_loc_cd);
		p.columnRsltDisp_mfg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.mfg_loc_nm_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_mfg_loc_nm);
		p.columnRsltDisp_bom_ptn.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.bom_ptn_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_bom_ptn);
		p.columnRsltDisp_strg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.strg_loc_cd_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_strg_loc_cd);
		p.columnRsltDisp_strg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.strg_loc_nm_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_strg_loc_nm);
		p.columnRsltDisp_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.wg_cd_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_wg_cd);
		p.columnRsltDisp_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.wg_nm_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_wg_nm);
		p.columnRsltDisp_not_fix_flg.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.not_fix_flg_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_not_fix_flg);
		p.columnRsltDisp_master_dt.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.master_dt_META);
		p.columnRsltDisp_master_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_master_dt);
		p.columnRsltDisp_rqmt_no.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rqmt_no_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_rqmt_no);
		p.columnRsltDisp_io_schd_pr_no.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.io_schd_pr_no_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_io_schd_pr_no);
		p.columnRsltDisp_inst_po_cnt_rmrks.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.inst_po_cnt_rmrks_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_inst_po_cnt_rmrks);
		p.columnRsltDisp_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.intr_rmrks_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_intr_rmrks);
		p.columnRsltDisp_sub_char1.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.sub_char1_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_sub_char1);
		p.columnRsltDisp_sub_char2.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.sub_char2_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_sub_char2);
		p.columnRsltDisp_sub_char3.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.sub_char3_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_sub_char3);
		p.RsltDispTable.addTable(p.RsltDisp_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRsltDisp_ins_usr_id.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.ins_usr_id_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_ins_usr_id);
		p.columnRsltDisp_ins_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.ins_usr_nm_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_ins_usr_nm);
		p.columnRsltDisp_ins_func_id.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.ins_func_id_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_ins_func_id);
		p.columnRsltDisp_ins_func_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.ins_func_nm_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_ins_func_nm);
		p.columnRsltDisp_ins_ts.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.ins_ts_META);
		p.columnRsltDisp_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_ins_ts);
		p.columnRsltDisp_upd_cntr.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.upd_cntr_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_upd_cntr);
		p.columnRsltDisp_upd_usr_id.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.upd_usr_id_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_upd_usr_id);
		p.columnRsltDisp_upd_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.upd_usr_nm_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_upd_usr_nm);
		p.columnRsltDisp_upd_func_id.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.upd_func_id_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_upd_func_id);
		p.columnRsltDisp_upd_func_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.upd_func_nm_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_upd_func_nm);
		p.columnRsltDisp_upd_ts.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.upd_ts_META);
		p.columnRsltDisp_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_upd_ts);
		p.columnRsltDisp_upd_srv_req_no.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.upd_srv_req_no_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_upd_srv_req_no);
		p.columnRsltDisp_disp_itm_cd.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.disp_itm_cd_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_disp_itm_cd);
		p.columnRsltDisp_disp_sno.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.disp_sno_META);
		p.RsltDispTable.addColumnConfig(p.columnRsltDisp_disp_sno);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBCP_ItmOrdGanttChart p) {
		p.columnRslt_itm_ord_no.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.itm_ord_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_no);
		p.columnRslt_itm_ord_typ.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.itm_ord_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_typ);
		p.columnRslt_itm_ord_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.itm_ord_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_typ_nm);
		p.columnRslt_itm_ord_ld_sts_typ.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.itm_ord_ld_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_ld_sts_typ);
		p.columnRslt_itm_ord_ld_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.itm_ord_ld_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_ld_sts_typ_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_mfg_st_dt.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.mfg_st_dt_META);
		p.columnRslt_mfg_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_st_dt);
		p.columnRslt_mfg_end_dt.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.mfg_end_dt_META);
		p.columnRslt_mfg_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_end_dt);
		p.columnRslt_mfg_lt.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.mfg_lt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_lt);
		p.RsltTable.addTable(p.Rslt_inst_qty_p_PPanel.QtyTable);
		p.columnRslt_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_cd);
		p.columnRslt_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_nm);
		p.columnRslt_dec_place.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.columnRslt_rsrc_cd1.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rsrc_cd1);
		p.columnRslt_rsrc_nm1.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rsrc_nm1);
		p.RsltTable.addTable(p.Rslt_rsrc_act_qty1_p_PPanel.QtyTable);
		p.columnRslt_rsrc_unit_nm1.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_unit_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rsrc_unit_nm1);
		p.columnRslt_rsrc_dec_place1.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_dec_place1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rsrc_dec_place1);
		p.columnRslt_rsrc_rnd_typ1.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_rnd_typ1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rsrc_rnd_typ1);
		p.columnRslt_rsrc_cd2.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rsrc_cd2);
		p.columnRslt_rsrc_nm2.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rsrc_nm2);
		p.RsltTable.addTable(p.Rslt_rsrc_act_qty2_p_PPanel.QtyTable);
		p.columnRslt_rsrc_unit_nm2.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_unit_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rsrc_unit_nm2);
		p.columnRslt_rsrc_dec_place2.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_dec_place2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rsrc_dec_place2);
		p.columnRslt_rsrc_rnd_typ2.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rsrc_rnd_typ2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rsrc_rnd_typ2);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_mfg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.mfg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_cd);
		p.columnRslt_mfg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.mfg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_nm);
		p.columnRslt_bom_ptn.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.bom_ptn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bom_ptn);
		p.columnRslt_strg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.strg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_cd);
		p.columnRslt_strg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.strg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_not_fix_flg.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.not_fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_fix_flg);
		p.columnRslt_master_dt.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.master_dt_META);
		p.columnRslt_master_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_master_dt);
		p.columnRslt_rqmt_no.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.rqmt_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_no);
		p.columnRslt_io_schd_pr_no.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.io_schd_pr_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_pr_no);
		p.columnRslt_inst_po_cnt_rmrks.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.inst_po_cnt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_po_cnt_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_disp_itm_cd.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.disp_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_itm_cd);
		p.columnRslt_disp_sno.setMeta(mcframe.clientMSBC.MSBCP0290.RsltDispR.disp_sno_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_sno);
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
		columnRsltDisp_itm_ord_ld_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRsltDisp_itm_ord_ld_sts_typ.getListConfig().setPutter(getRsltDisp_itm_ord_ld_sts_typ_ListPutter());
		columnRslt_itm_ord_ld_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_itm_ord_ld_sts_typ.getListConfig().setPutter(getRslt_itm_ord_ld_sts_typ_ListPutter());
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
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
		lp.setListLogicId("MA.MAUAP0010.MfgWg");
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
	 * [RsltDisp_itm_ord_ld_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createRsltDisp_itm_ord_ld_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ItmOrdLdStsTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_itm_ord_ld_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_ord_ld_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_loc_grp_cd) return getCnd_loc_grp_cd(row, info);
		if(combo == Cnd_mfg_loc_cd) return getCnd_mfg_loc_cd(row, info);
		if(combo == columnRsltDisp_itm_ord_ld_sts_typ) return getRsltDisp_itm_ord_ld_sts_typ(row, info);
		if(combo == columnRslt_itm_ord_ld_sts_typ) return getRslt_itm_ord_ld_sts_typ(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == LPnl_select) doLPnl_select(info);
		else if (ap == LPnl_select_by_alloc_pln) doLPnl_select_by_alloc_pln(info);
		else if (ap == LPnl_move_prev_day) doLPnl_move_prev_day(info);
		else if (ap == LPnl_move_next_day) doLPnl_move_next_day(info);
		else if (ap == LPnl_sts_opn) doLPnl_sts_opn(info);
		else if (ap == LPnl_sts_sav) doLPnl_sts_sav(info);
		else if (ap == LPnl_rdel) doLPnl_rdel(info);
		else if (ap == LPnl_undo) doLPnl_undo(info);
		else if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [LPnl]パネルの[select]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLPnl_select(MCEventInfo info);

	/**
	 * [LPnl]パネルの[select_by_alloc_pln]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLPnl_select_by_alloc_pln(MCEventInfo info);

	/**
	 * [LPnl]パネルの[move_prev_day]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLPnl_move_prev_day(MCEventInfo info);

	/**
	 * [LPnl]パネルの[move_next_day]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLPnl_move_next_day(MCEventInfo info);

	/**
	 * [LPnl]パネルの[sts_opn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLPnl_sts_opn(MCEventInfo info);

	/**
	 * [LPnl]パネルの[sts_sav]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLPnl_sts_sav(MCEventInfo info);

	/**
	 * [LPnl]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLPnl_rdel(MCEventInfo info);

	/**
	 * [LPnl]パネルの[undo]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLPnl_undo(MCEventInfo info);

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

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
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == GanttTable) return doGantt_VC(info);
		if (vc == RsltDispTable) return doRsltDisp_VC(info);
		if (vc == RsltTable) return doRslt_VC(info);
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
		if (vc == Cnd_alloc_pln_r_view_Group) return doCnd_alloc_pln_r_view_VC(info);
		if (vc == LPnl_select_dt_fr) return doLPnl_select_dt_fr_VC(info);
		if (vc == LPnl_select_dt_to) return doLPnl_select_dt_to_VC(info);
		if (vc == columnRsltDisp_itm_ord_no) return doRsltDisp_itm_ord_no_VC(info);
		if (vc == columnRsltDisp_itm_ord_typ) return doRsltDisp_itm_ord_typ_VC(info);
		if (vc == columnRsltDisp_itm_ord_typ_nm) return doRsltDisp_itm_ord_typ_nm_VC(info);
		if (vc == columnRsltDisp_itm_ord_ld_sts_typ) return doRsltDisp_itm_ord_ld_sts_typ_VC(info);
		if (vc == columnRsltDisp_itm_ord_ld_sts_typ_nm) return doRsltDisp_itm_ord_ld_sts_typ_nm_VC(info);
		if (vc == columnRsltDisp_mfg_st_dt) return doRsltDisp_mfg_st_dt_VC(info);
		if (vc == columnRsltDisp_mfg_end_dt) return doRsltDisp_mfg_end_dt_VC(info);
		if (vc == columnRsltDisp_mfg_lt) return doRsltDisp_mfg_lt_VC(info);
		if (vc == columnRsltDisp_unit_cd) return doRsltDisp_unit_cd_VC(info);
		if (vc == columnRsltDisp_unit_nm) return doRsltDisp_unit_nm_VC(info);
		if (vc == columnRsltDisp_dec_place) return doRsltDisp_dec_place_VC(info);
		if (vc == columnRsltDisp_rsrc_cd1) return doRsltDisp_rsrc_cd1_VC(info);
		if (vc == columnRsltDisp_rsrc_nm1) return doRsltDisp_rsrc_nm1_VC(info);
		if (vc == columnRsltDisp_rsrc_unit_nm1) return doRsltDisp_rsrc_unit_nm1_VC(info);
		if (vc == columnRsltDisp_rsrc_dec_place1) return doRsltDisp_rsrc_dec_place1_VC(info);
		if (vc == columnRsltDisp_rsrc_rnd_typ1) return doRsltDisp_rsrc_rnd_typ1_VC(info);
		if (vc == columnRsltDisp_rsrc_cd2) return doRsltDisp_rsrc_cd2_VC(info);
		if (vc == columnRsltDisp_rsrc_nm2) return doRsltDisp_rsrc_nm2_VC(info);
		if (vc == columnRsltDisp_rsrc_unit_nm2) return doRsltDisp_rsrc_unit_nm2_VC(info);
		if (vc == columnRsltDisp_rsrc_dec_place2) return doRsltDisp_rsrc_dec_place2_VC(info);
		if (vc == columnRsltDisp_rsrc_rnd_typ2) return doRsltDisp_rsrc_rnd_typ2_VC(info);
		if (vc == columnRsltDisp_mfg_loc_cd) return doRsltDisp_mfg_loc_cd_VC(info);
		if (vc == columnRsltDisp_mfg_loc_nm) return doRsltDisp_mfg_loc_nm_VC(info);
		if (vc == columnRsltDisp_bom_ptn) return doRsltDisp_bom_ptn_VC(info);
		if (vc == columnRsltDisp_strg_loc_cd) return doRsltDisp_strg_loc_cd_VC(info);
		if (vc == columnRsltDisp_strg_loc_nm) return doRsltDisp_strg_loc_nm_VC(info);
		if (vc == columnRsltDisp_wg_cd) return doRsltDisp_wg_cd_VC(info);
		if (vc == columnRsltDisp_wg_nm) return doRsltDisp_wg_nm_VC(info);
		if (vc == columnRsltDisp_not_fix_flg) return doRsltDisp_not_fix_flg_VC(info);
		if (vc == columnRsltDisp_master_dt) return doRsltDisp_master_dt_VC(info);
		if (vc == columnRsltDisp_rqmt_no) return doRsltDisp_rqmt_no_VC(info);
		if (vc == columnRsltDisp_io_schd_pr_no) return doRsltDisp_io_schd_pr_no_VC(info);
		if (vc == columnRsltDisp_inst_po_cnt_rmrks) return doRsltDisp_inst_po_cnt_rmrks_VC(info);
		if (vc == columnRsltDisp_intr_rmrks) return doRsltDisp_intr_rmrks_VC(info);
		if (vc == columnRsltDisp_sub_char1) return doRsltDisp_sub_char1_VC(info);
		if (vc == columnRsltDisp_sub_char2) return doRsltDisp_sub_char2_VC(info);
		if (vc == columnRsltDisp_sub_char3) return doRsltDisp_sub_char3_VC(info);
		if (vc == columnRsltDisp_ins_usr_id) return doRsltDisp_ins_usr_id_VC(info);
		if (vc == columnRsltDisp_ins_usr_nm) return doRsltDisp_ins_usr_nm_VC(info);
		if (vc == columnRsltDisp_ins_func_id) return doRsltDisp_ins_func_id_VC(info);
		if (vc == columnRsltDisp_ins_func_nm) return doRsltDisp_ins_func_nm_VC(info);
		if (vc == columnRsltDisp_ins_ts) return doRsltDisp_ins_ts_VC(info);
		if (vc == columnRsltDisp_upd_cntr) return doRsltDisp_upd_cntr_VC(info);
		if (vc == columnRsltDisp_upd_usr_id) return doRsltDisp_upd_usr_id_VC(info);
		if (vc == columnRsltDisp_upd_usr_nm) return doRsltDisp_upd_usr_nm_VC(info);
		if (vc == columnRsltDisp_upd_func_id) return doRsltDisp_upd_func_id_VC(info);
		if (vc == columnRsltDisp_upd_func_nm) return doRsltDisp_upd_func_nm_VC(info);
		if (vc == columnRsltDisp_upd_ts) return doRsltDisp_upd_ts_VC(info);
		if (vc == columnRsltDisp_upd_srv_req_no) return doRsltDisp_upd_srv_req_no_VC(info);
		if (vc == columnRsltDisp_disp_itm_cd) return doRsltDisp_disp_itm_cd_VC(info);
		if (vc == columnRsltDisp_disp_sno) return doRsltDisp_disp_sno_VC(info);
		if (vc == columnRslt_itm_ord_no) return doRslt_itm_ord_no_VC(info);
		if (vc == columnRslt_itm_ord_typ) return doRslt_itm_ord_typ_VC(info);
		if (vc == columnRslt_itm_ord_typ_nm) return doRslt_itm_ord_typ_nm_VC(info);
		if (vc == columnRslt_itm_ord_ld_sts_typ) return doRslt_itm_ord_ld_sts_typ_VC(info);
		if (vc == columnRslt_itm_ord_ld_sts_typ_nm) return doRslt_itm_ord_ld_sts_typ_nm_VC(info);
		if (vc == columnRslt_mfg_st_dt) return doRslt_mfg_st_dt_VC(info);
		if (vc == columnRslt_mfg_end_dt) return doRslt_mfg_end_dt_VC(info);
		if (vc == columnRslt_mfg_lt) return doRslt_mfg_lt_VC(info);
		if (vc == columnRslt_unit_cd) return doRslt_unit_cd_VC(info);
		if (vc == columnRslt_unit_nm) return doRslt_unit_nm_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_rsrc_cd1) return doRslt_rsrc_cd1_VC(info);
		if (vc == columnRslt_rsrc_nm1) return doRslt_rsrc_nm1_VC(info);
		if (vc == columnRslt_rsrc_unit_nm1) return doRslt_rsrc_unit_nm1_VC(info);
		if (vc == columnRslt_rsrc_dec_place1) return doRslt_rsrc_dec_place1_VC(info);
		if (vc == columnRslt_rsrc_rnd_typ1) return doRslt_rsrc_rnd_typ1_VC(info);
		if (vc == columnRslt_rsrc_cd2) return doRslt_rsrc_cd2_VC(info);
		if (vc == columnRslt_rsrc_nm2) return doRslt_rsrc_nm2_VC(info);
		if (vc == columnRslt_rsrc_unit_nm2) return doRslt_rsrc_unit_nm2_VC(info);
		if (vc == columnRslt_rsrc_dec_place2) return doRslt_rsrc_dec_place2_VC(info);
		if (vc == columnRslt_rsrc_rnd_typ2) return doRslt_rsrc_rnd_typ2_VC(info);
		if (vc == columnRslt_mfg_loc_cd) return doRslt_mfg_loc_cd_VC(info);
		if (vc == columnRslt_mfg_loc_nm) return doRslt_mfg_loc_nm_VC(info);
		if (vc == columnRslt_bom_ptn) return doRslt_bom_ptn_VC(info);
		if (vc == columnRslt_strg_loc_cd) return doRslt_strg_loc_cd_VC(info);
		if (vc == columnRslt_strg_loc_nm) return doRslt_strg_loc_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_not_fix_flg) return doRslt_not_fix_flg_VC(info);
		if (vc == columnRslt_master_dt) return doRslt_master_dt_VC(info);
		if (vc == columnRslt_rqmt_no) return doRslt_rqmt_no_VC(info);
		if (vc == columnRslt_io_schd_pr_no) return doRslt_io_schd_pr_no_VC(info);
		if (vc == columnRslt_inst_po_cnt_rmrks) return doRslt_inst_po_cnt_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == columnRslt_disp_itm_cd) return doRslt_disp_itm_cd_VC(info);
		if (vc == columnRslt_disp_sno) return doRslt_disp_sno_VC(info);
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
	 * [Gantt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doGantt_VC(MCEventInfo info){
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
	 * [Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[alloc_pln_r_view]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_pln_r_view_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[select_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_select_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[select_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_select_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_itm_ord_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_itm_ord_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_ld_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_itm_ord_ld_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_ld_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_itm_ord_ld_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[mfg_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_mfg_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[mfg_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_mfg_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[mfg_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_mfg_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rsrc_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rsrc_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rsrc_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rsrc_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rsrc_unit_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rsrc_dec_place1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rsrc_dec_place1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rsrc_rnd_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rsrc_rnd_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rsrc_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rsrc_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rsrc_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rsrc_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rsrc_unit_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rsrc_dec_place2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rsrc_dec_place2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rsrc_rnd_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rsrc_rnd_typ2_VC(MCEventInfo info){
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
	 * [RsltDisp]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[strg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_strg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[strg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_strg_loc_nm_VC(MCEventInfo info){
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
	 * [RsltDisp]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[not_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_not_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[master_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_master_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[rqmt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_rqmt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[io_schd_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_io_schd_pr_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[inst_po_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_inst_po_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[disp_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_disp_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltDisp]パネルの[disp_sno]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltDisp_disp_sno_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_ld_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_ld_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_ld_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_ld_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_lt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rsrc_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rsrc_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rsrc_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rsrc_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rsrc_unit_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rsrc_unit_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rsrc_dec_place1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rsrc_dec_place1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rsrc_rnd_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rsrc_rnd_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rsrc_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rsrc_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rsrc_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rsrc_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rsrc_unit_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rsrc_unit_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rsrc_dec_place2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rsrc_dec_place2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rsrc_rnd_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rsrc_rnd_typ2_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bom_ptn_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[not_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[master_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_master_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqmt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_pr_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_po_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_intr_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_sno]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_sno_VC(MCEventInfo info){
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
		else if (nc == GanttTable) doGantt_NC(info);
		else if (nc == RsltDispTable) doRsltDisp_NC(info);
		else if (nc == RsltTable) doRslt_NC(info);
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
		else if (nc == Cnd_alloc_pln_r_view_Group) doCnd_alloc_pln_r_view_NC(info);
		else if (nc == LPnl_select_dt_fr) doLPnl_select_dt_fr_NC(info);
		else if (nc == LPnl_select_dt_to) doLPnl_select_dt_to_NC(info);
		else if (nc == columnRsltDisp_itm_ord_no) doRsltDisp_itm_ord_no_NC(info);
		else if (nc == columnRsltDisp_itm_ord_typ) doRsltDisp_itm_ord_typ_NC(info);
		else if (nc == columnRsltDisp_itm_ord_typ_nm) doRsltDisp_itm_ord_typ_nm_NC(info);
		else if (nc == columnRsltDisp_itm_ord_ld_sts_typ) doRsltDisp_itm_ord_ld_sts_typ_NC(info);
		else if (nc == columnRsltDisp_itm_ord_ld_sts_typ_nm) doRsltDisp_itm_ord_ld_sts_typ_nm_NC(info);
		else if (nc == columnRsltDisp_mfg_st_dt) doRsltDisp_mfg_st_dt_NC(info);
		else if (nc == columnRsltDisp_mfg_end_dt) doRsltDisp_mfg_end_dt_NC(info);
		else if (nc == columnRsltDisp_mfg_lt) doRsltDisp_mfg_lt_NC(info);
		else if (nc == columnRsltDisp_unit_cd) doRsltDisp_unit_cd_NC(info);
		else if (nc == columnRsltDisp_unit_nm) doRsltDisp_unit_nm_NC(info);
		else if (nc == columnRsltDisp_dec_place) doRsltDisp_dec_place_NC(info);
		else if (nc == columnRsltDisp_rsrc_cd1) doRsltDisp_rsrc_cd1_NC(info);
		else if (nc == columnRsltDisp_rsrc_nm1) doRsltDisp_rsrc_nm1_NC(info);
		else if (nc == columnRsltDisp_rsrc_unit_nm1) doRsltDisp_rsrc_unit_nm1_NC(info);
		else if (nc == columnRsltDisp_rsrc_dec_place1) doRsltDisp_rsrc_dec_place1_NC(info);
		else if (nc == columnRsltDisp_rsrc_rnd_typ1) doRsltDisp_rsrc_rnd_typ1_NC(info);
		else if (nc == columnRsltDisp_rsrc_cd2) doRsltDisp_rsrc_cd2_NC(info);
		else if (nc == columnRsltDisp_rsrc_nm2) doRsltDisp_rsrc_nm2_NC(info);
		else if (nc == columnRsltDisp_rsrc_unit_nm2) doRsltDisp_rsrc_unit_nm2_NC(info);
		else if (nc == columnRsltDisp_rsrc_dec_place2) doRsltDisp_rsrc_dec_place2_NC(info);
		else if (nc == columnRsltDisp_rsrc_rnd_typ2) doRsltDisp_rsrc_rnd_typ2_NC(info);
		else if (nc == columnRsltDisp_mfg_loc_cd) doRsltDisp_mfg_loc_cd_NC(info);
		else if (nc == columnRsltDisp_mfg_loc_nm) doRsltDisp_mfg_loc_nm_NC(info);
		else if (nc == columnRsltDisp_bom_ptn) doRsltDisp_bom_ptn_NC(info);
		else if (nc == columnRsltDisp_strg_loc_cd) doRsltDisp_strg_loc_cd_NC(info);
		else if (nc == columnRsltDisp_strg_loc_nm) doRsltDisp_strg_loc_nm_NC(info);
		else if (nc == columnRsltDisp_wg_cd) doRsltDisp_wg_cd_NC(info);
		else if (nc == columnRsltDisp_wg_nm) doRsltDisp_wg_nm_NC(info);
		else if (nc == columnRsltDisp_not_fix_flg) doRsltDisp_not_fix_flg_NC(info);
		else if (nc == columnRsltDisp_master_dt) doRsltDisp_master_dt_NC(info);
		else if (nc == columnRsltDisp_rqmt_no) doRsltDisp_rqmt_no_NC(info);
		else if (nc == columnRsltDisp_io_schd_pr_no) doRsltDisp_io_schd_pr_no_NC(info);
		else if (nc == columnRsltDisp_inst_po_cnt_rmrks) doRsltDisp_inst_po_cnt_rmrks_NC(info);
		else if (nc == columnRsltDisp_intr_rmrks) doRsltDisp_intr_rmrks_NC(info);
		else if (nc == columnRsltDisp_sub_char1) doRsltDisp_sub_char1_NC(info);
		else if (nc == columnRsltDisp_sub_char2) doRsltDisp_sub_char2_NC(info);
		else if (nc == columnRsltDisp_sub_char3) doRsltDisp_sub_char3_NC(info);
		else if (nc == columnRsltDisp_ins_usr_id) doRsltDisp_ins_usr_id_NC(info);
		else if (nc == columnRsltDisp_ins_usr_nm) doRsltDisp_ins_usr_nm_NC(info);
		else if (nc == columnRsltDisp_ins_func_id) doRsltDisp_ins_func_id_NC(info);
		else if (nc == columnRsltDisp_ins_func_nm) doRsltDisp_ins_func_nm_NC(info);
		else if (nc == columnRsltDisp_ins_ts) doRsltDisp_ins_ts_NC(info);
		else if (nc == columnRsltDisp_upd_cntr) doRsltDisp_upd_cntr_NC(info);
		else if (nc == columnRsltDisp_upd_usr_id) doRsltDisp_upd_usr_id_NC(info);
		else if (nc == columnRsltDisp_upd_usr_nm) doRsltDisp_upd_usr_nm_NC(info);
		else if (nc == columnRsltDisp_upd_func_id) doRsltDisp_upd_func_id_NC(info);
		else if (nc == columnRsltDisp_upd_func_nm) doRsltDisp_upd_func_nm_NC(info);
		else if (nc == columnRsltDisp_upd_ts) doRsltDisp_upd_ts_NC(info);
		else if (nc == columnRsltDisp_upd_srv_req_no) doRsltDisp_upd_srv_req_no_NC(info);
		else if (nc == columnRsltDisp_disp_itm_cd) doRsltDisp_disp_itm_cd_NC(info);
		else if (nc == columnRsltDisp_disp_sno) doRsltDisp_disp_sno_NC(info);
		else if (nc == columnRslt_itm_ord_no) doRslt_itm_ord_no_NC(info);
		else if (nc == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_NC(info);
		else if (nc == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_NC(info);
		else if (nc == columnRslt_itm_ord_ld_sts_typ) doRslt_itm_ord_ld_sts_typ_NC(info);
		else if (nc == columnRslt_itm_ord_ld_sts_typ_nm) doRslt_itm_ord_ld_sts_typ_nm_NC(info);
		else if (nc == columnRslt_mfg_st_dt) doRslt_mfg_st_dt_NC(info);
		else if (nc == columnRslt_mfg_end_dt) doRslt_mfg_end_dt_NC(info);
		else if (nc == columnRslt_mfg_lt) doRslt_mfg_lt_NC(info);
		else if (nc == columnRslt_unit_cd) doRslt_unit_cd_NC(info);
		else if (nc == columnRslt_unit_nm) doRslt_unit_nm_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_rsrc_cd1) doRslt_rsrc_cd1_NC(info);
		else if (nc == columnRslt_rsrc_nm1) doRslt_rsrc_nm1_NC(info);
		else if (nc == columnRslt_rsrc_unit_nm1) doRslt_rsrc_unit_nm1_NC(info);
		else if (nc == columnRslt_rsrc_dec_place1) doRslt_rsrc_dec_place1_NC(info);
		else if (nc == columnRslt_rsrc_rnd_typ1) doRslt_rsrc_rnd_typ1_NC(info);
		else if (nc == columnRslt_rsrc_cd2) doRslt_rsrc_cd2_NC(info);
		else if (nc == columnRslt_rsrc_nm2) doRslt_rsrc_nm2_NC(info);
		else if (nc == columnRslt_rsrc_unit_nm2) doRslt_rsrc_unit_nm2_NC(info);
		else if (nc == columnRslt_rsrc_dec_place2) doRslt_rsrc_dec_place2_NC(info);
		else if (nc == columnRslt_rsrc_rnd_typ2) doRslt_rsrc_rnd_typ2_NC(info);
		else if (nc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NC(info);
		else if (nc == columnRslt_bom_ptn) doRslt_bom_ptn_NC(info);
		else if (nc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NC(info);
		else if (nc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_not_fix_flg) doRslt_not_fix_flg_NC(info);
		else if (nc == columnRslt_master_dt) doRslt_master_dt_NC(info);
		else if (nc == columnRslt_rqmt_no) doRslt_rqmt_no_NC(info);
		else if (nc == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NC(info);
		else if (nc == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == columnRslt_disp_itm_cd) doRslt_disp_itm_cd_NC(info);
		else if (nc == columnRslt_disp_sno) doRslt_disp_sno_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Gantt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doGantt_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[alloc_pln_r_view]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_pln_r_view_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[select_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_select_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[select_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_select_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_ld_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_ld_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_ld_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_ld_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_lt_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_cd1_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_nm1_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_nm1_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_dec_place1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_dec_place1_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_rnd_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_rnd_typ1_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_cd2_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_nm2_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_nm2_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_dec_place2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_dec_place2_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_rnd_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_rnd_typ2_NC(MCEventInfo info){
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
	 * [RsltDisp]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[strg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_strg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[strg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_strg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[not_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_not_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[master_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_master_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rqmt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rqmt_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[io_schd_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_io_schd_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[inst_po_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_inst_po_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[disp_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_disp_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[disp_sno]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_disp_sno_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_ld_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_ld_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_ld_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_ld_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_lt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[rsrc_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_unit_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_unit_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_dec_place1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_dec_place1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_rnd_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_rnd_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_unit_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_unit_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_dec_place2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_dec_place2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_rnd_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_rnd_typ2_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_sno]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_sno_NC(MCEventInfo info){
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
		else if (ne == GanttTable) doGantt_NE(info);
		else if (ne == RsltDispTable) doRsltDisp_NE(info);
		else if (ne == RsltTable) doRslt_NE(info);
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
		else if (ne == Cnd_alloc_pln_r_view_Group) doCnd_alloc_pln_r_view_NE(info);
		else if (ne == LPnl_select_dt_fr) doLPnl_select_dt_fr_NE(info);
		else if (ne == LPnl_select_dt_to) doLPnl_select_dt_to_NE(info);
		else if (ne == columnRsltDisp_itm_ord_no) doRsltDisp_itm_ord_no_NE(info);
		else if (ne == columnRsltDisp_itm_ord_typ) doRsltDisp_itm_ord_typ_NE(info);
		else if (ne == columnRsltDisp_itm_ord_typ_nm) doRsltDisp_itm_ord_typ_nm_NE(info);
		else if (ne == columnRsltDisp_itm_ord_ld_sts_typ) doRsltDisp_itm_ord_ld_sts_typ_NE(info);
		else if (ne == columnRsltDisp_itm_ord_ld_sts_typ_nm) doRsltDisp_itm_ord_ld_sts_typ_nm_NE(info);
		else if (ne == columnRsltDisp_mfg_st_dt) doRsltDisp_mfg_st_dt_NE(info);
		else if (ne == columnRsltDisp_mfg_end_dt) doRsltDisp_mfg_end_dt_NE(info);
		else if (ne == columnRsltDisp_mfg_lt) doRsltDisp_mfg_lt_NE(info);
		else if (ne == columnRsltDisp_unit_cd) doRsltDisp_unit_cd_NE(info);
		else if (ne == columnRsltDisp_unit_nm) doRsltDisp_unit_nm_NE(info);
		else if (ne == columnRsltDisp_dec_place) doRsltDisp_dec_place_NE(info);
		else if (ne == columnRsltDisp_rsrc_cd1) doRsltDisp_rsrc_cd1_NE(info);
		else if (ne == columnRsltDisp_rsrc_nm1) doRsltDisp_rsrc_nm1_NE(info);
		else if (ne == columnRsltDisp_rsrc_unit_nm1) doRsltDisp_rsrc_unit_nm1_NE(info);
		else if (ne == columnRsltDisp_rsrc_dec_place1) doRsltDisp_rsrc_dec_place1_NE(info);
		else if (ne == columnRsltDisp_rsrc_rnd_typ1) doRsltDisp_rsrc_rnd_typ1_NE(info);
		else if (ne == columnRsltDisp_rsrc_cd2) doRsltDisp_rsrc_cd2_NE(info);
		else if (ne == columnRsltDisp_rsrc_nm2) doRsltDisp_rsrc_nm2_NE(info);
		else if (ne == columnRsltDisp_rsrc_unit_nm2) doRsltDisp_rsrc_unit_nm2_NE(info);
		else if (ne == columnRsltDisp_rsrc_dec_place2) doRsltDisp_rsrc_dec_place2_NE(info);
		else if (ne == columnRsltDisp_rsrc_rnd_typ2) doRsltDisp_rsrc_rnd_typ2_NE(info);
		else if (ne == columnRsltDisp_mfg_loc_cd) doRsltDisp_mfg_loc_cd_NE(info);
		else if (ne == columnRsltDisp_mfg_loc_nm) doRsltDisp_mfg_loc_nm_NE(info);
		else if (ne == columnRsltDisp_bom_ptn) doRsltDisp_bom_ptn_NE(info);
		else if (ne == columnRsltDisp_strg_loc_cd) doRsltDisp_strg_loc_cd_NE(info);
		else if (ne == columnRsltDisp_strg_loc_nm) doRsltDisp_strg_loc_nm_NE(info);
		else if (ne == columnRsltDisp_wg_cd) doRsltDisp_wg_cd_NE(info);
		else if (ne == columnRsltDisp_wg_nm) doRsltDisp_wg_nm_NE(info);
		else if (ne == columnRsltDisp_not_fix_flg) doRsltDisp_not_fix_flg_NE(info);
		else if (ne == columnRsltDisp_master_dt) doRsltDisp_master_dt_NE(info);
		else if (ne == columnRsltDisp_rqmt_no) doRsltDisp_rqmt_no_NE(info);
		else if (ne == columnRsltDisp_io_schd_pr_no) doRsltDisp_io_schd_pr_no_NE(info);
		else if (ne == columnRsltDisp_inst_po_cnt_rmrks) doRsltDisp_inst_po_cnt_rmrks_NE(info);
		else if (ne == columnRsltDisp_intr_rmrks) doRsltDisp_intr_rmrks_NE(info);
		else if (ne == columnRsltDisp_sub_char1) doRsltDisp_sub_char1_NE(info);
		else if (ne == columnRsltDisp_sub_char2) doRsltDisp_sub_char2_NE(info);
		else if (ne == columnRsltDisp_sub_char3) doRsltDisp_sub_char3_NE(info);
		else if (ne == columnRsltDisp_ins_usr_id) doRsltDisp_ins_usr_id_NE(info);
		else if (ne == columnRsltDisp_ins_usr_nm) doRsltDisp_ins_usr_nm_NE(info);
		else if (ne == columnRsltDisp_ins_func_id) doRsltDisp_ins_func_id_NE(info);
		else if (ne == columnRsltDisp_ins_func_nm) doRsltDisp_ins_func_nm_NE(info);
		else if (ne == columnRsltDisp_ins_ts) doRsltDisp_ins_ts_NE(info);
		else if (ne == columnRsltDisp_upd_cntr) doRsltDisp_upd_cntr_NE(info);
		else if (ne == columnRsltDisp_upd_usr_id) doRsltDisp_upd_usr_id_NE(info);
		else if (ne == columnRsltDisp_upd_usr_nm) doRsltDisp_upd_usr_nm_NE(info);
		else if (ne == columnRsltDisp_upd_func_id) doRsltDisp_upd_func_id_NE(info);
		else if (ne == columnRsltDisp_upd_func_nm) doRsltDisp_upd_func_nm_NE(info);
		else if (ne == columnRsltDisp_upd_ts) doRsltDisp_upd_ts_NE(info);
		else if (ne == columnRsltDisp_upd_srv_req_no) doRsltDisp_upd_srv_req_no_NE(info);
		else if (ne == columnRsltDisp_disp_itm_cd) doRsltDisp_disp_itm_cd_NE(info);
		else if (ne == columnRsltDisp_disp_sno) doRsltDisp_disp_sno_NE(info);
		else if (ne == columnRslt_itm_ord_no) doRslt_itm_ord_no_NE(info);
		else if (ne == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_NE(info);
		else if (ne == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_NE(info);
		else if (ne == columnRslt_itm_ord_ld_sts_typ) doRslt_itm_ord_ld_sts_typ_NE(info);
		else if (ne == columnRslt_itm_ord_ld_sts_typ_nm) doRslt_itm_ord_ld_sts_typ_nm_NE(info);
		else if (ne == columnRslt_mfg_st_dt) doRslt_mfg_st_dt_NE(info);
		else if (ne == columnRslt_mfg_end_dt) doRslt_mfg_end_dt_NE(info);
		else if (ne == columnRslt_mfg_lt) doRslt_mfg_lt_NE(info);
		else if (ne == columnRslt_unit_cd) doRslt_unit_cd_NE(info);
		else if (ne == columnRslt_unit_nm) doRslt_unit_nm_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_rsrc_cd1) doRslt_rsrc_cd1_NE(info);
		else if (ne == columnRslt_rsrc_nm1) doRslt_rsrc_nm1_NE(info);
		else if (ne == columnRslt_rsrc_unit_nm1) doRslt_rsrc_unit_nm1_NE(info);
		else if (ne == columnRslt_rsrc_dec_place1) doRslt_rsrc_dec_place1_NE(info);
		else if (ne == columnRslt_rsrc_rnd_typ1) doRslt_rsrc_rnd_typ1_NE(info);
		else if (ne == columnRslt_rsrc_cd2) doRslt_rsrc_cd2_NE(info);
		else if (ne == columnRslt_rsrc_nm2) doRslt_rsrc_nm2_NE(info);
		else if (ne == columnRslt_rsrc_unit_nm2) doRslt_rsrc_unit_nm2_NE(info);
		else if (ne == columnRslt_rsrc_dec_place2) doRslt_rsrc_dec_place2_NE(info);
		else if (ne == columnRslt_rsrc_rnd_typ2) doRslt_rsrc_rnd_typ2_NE(info);
		else if (ne == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NE(info);
		else if (ne == columnRslt_bom_ptn) doRslt_bom_ptn_NE(info);
		else if (ne == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NE(info);
		else if (ne == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_not_fix_flg) doRslt_not_fix_flg_NE(info);
		else if (ne == columnRslt_master_dt) doRslt_master_dt_NE(info);
		else if (ne == columnRslt_rqmt_no) doRslt_rqmt_no_NE(info);
		else if (ne == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NE(info);
		else if (ne == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == columnRslt_disp_itm_cd) doRslt_disp_itm_cd_NE(info);
		else if (ne == columnRslt_disp_sno) doRslt_disp_sno_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Gantt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doGantt_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[alloc_pln_r_view]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_pln_r_view_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[select_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_select_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[select_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_select_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_ld_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_ld_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_ld_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_ld_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_lt_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_cd1_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_nm1_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_nm1_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_dec_place1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_dec_place1_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_rnd_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_rnd_typ1_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_cd2_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_nm2_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_nm2_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_dec_place2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_dec_place2_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_rnd_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_rnd_typ2_NE(MCEventInfo info){
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
	 * [RsltDisp]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[strg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_strg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[strg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_strg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[not_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_not_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[master_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_master_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rqmt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rqmt_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[io_schd_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_io_schd_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[inst_po_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_inst_po_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[disp_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_disp_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[disp_sno]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_disp_sno_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_ld_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_ld_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_ld_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_ld_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_lt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[rsrc_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_unit_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_unit_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_dec_place1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_dec_place1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_rnd_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_rnd_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_unit_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_unit_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_dec_place2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_dec_place2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_rnd_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_rnd_typ2_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_sno]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_sno_NE(MCEventInfo info){
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
		else if (nx == GanttTable) doGantt_NX(info);
		else if (nx == RsltDispTable) doRsltDisp_NX(info);
		else if (nx == RsltTable) doRslt_NX(info);
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
		else if (nx == Cnd_alloc_pln_r_view_Group) doCnd_alloc_pln_r_view_NX(info);
		else if (nx == LPnl_select_dt_fr) doLPnl_select_dt_fr_NX(info);
		else if (nx == LPnl_select_dt_to) doLPnl_select_dt_to_NX(info);
		else if (nx == columnRsltDisp_itm_ord_no) doRsltDisp_itm_ord_no_NX(info);
		else if (nx == columnRsltDisp_itm_ord_typ) doRsltDisp_itm_ord_typ_NX(info);
		else if (nx == columnRsltDisp_itm_ord_typ_nm) doRsltDisp_itm_ord_typ_nm_NX(info);
		else if (nx == columnRsltDisp_itm_ord_ld_sts_typ) doRsltDisp_itm_ord_ld_sts_typ_NX(info);
		else if (nx == columnRsltDisp_itm_ord_ld_sts_typ_nm) doRsltDisp_itm_ord_ld_sts_typ_nm_NX(info);
		else if (nx == columnRsltDisp_mfg_st_dt) doRsltDisp_mfg_st_dt_NX(info);
		else if (nx == columnRsltDisp_mfg_end_dt) doRsltDisp_mfg_end_dt_NX(info);
		else if (nx == columnRsltDisp_mfg_lt) doRsltDisp_mfg_lt_NX(info);
		else if (nx == columnRsltDisp_unit_cd) doRsltDisp_unit_cd_NX(info);
		else if (nx == columnRsltDisp_unit_nm) doRsltDisp_unit_nm_NX(info);
		else if (nx == columnRsltDisp_dec_place) doRsltDisp_dec_place_NX(info);
		else if (nx == columnRsltDisp_rsrc_cd1) doRsltDisp_rsrc_cd1_NX(info);
		else if (nx == columnRsltDisp_rsrc_nm1) doRsltDisp_rsrc_nm1_NX(info);
		else if (nx == columnRsltDisp_rsrc_unit_nm1) doRsltDisp_rsrc_unit_nm1_NX(info);
		else if (nx == columnRsltDisp_rsrc_dec_place1) doRsltDisp_rsrc_dec_place1_NX(info);
		else if (nx == columnRsltDisp_rsrc_rnd_typ1) doRsltDisp_rsrc_rnd_typ1_NX(info);
		else if (nx == columnRsltDisp_rsrc_cd2) doRsltDisp_rsrc_cd2_NX(info);
		else if (nx == columnRsltDisp_rsrc_nm2) doRsltDisp_rsrc_nm2_NX(info);
		else if (nx == columnRsltDisp_rsrc_unit_nm2) doRsltDisp_rsrc_unit_nm2_NX(info);
		else if (nx == columnRsltDisp_rsrc_dec_place2) doRsltDisp_rsrc_dec_place2_NX(info);
		else if (nx == columnRsltDisp_rsrc_rnd_typ2) doRsltDisp_rsrc_rnd_typ2_NX(info);
		else if (nx == columnRsltDisp_mfg_loc_cd) doRsltDisp_mfg_loc_cd_NX(info);
		else if (nx == columnRsltDisp_mfg_loc_nm) doRsltDisp_mfg_loc_nm_NX(info);
		else if (nx == columnRsltDisp_bom_ptn) doRsltDisp_bom_ptn_NX(info);
		else if (nx == columnRsltDisp_strg_loc_cd) doRsltDisp_strg_loc_cd_NX(info);
		else if (nx == columnRsltDisp_strg_loc_nm) doRsltDisp_strg_loc_nm_NX(info);
		else if (nx == columnRsltDisp_wg_cd) doRsltDisp_wg_cd_NX(info);
		else if (nx == columnRsltDisp_wg_nm) doRsltDisp_wg_nm_NX(info);
		else if (nx == columnRsltDisp_not_fix_flg) doRsltDisp_not_fix_flg_NX(info);
		else if (nx == columnRsltDisp_master_dt) doRsltDisp_master_dt_NX(info);
		else if (nx == columnRsltDisp_rqmt_no) doRsltDisp_rqmt_no_NX(info);
		else if (nx == columnRsltDisp_io_schd_pr_no) doRsltDisp_io_schd_pr_no_NX(info);
		else if (nx == columnRsltDisp_inst_po_cnt_rmrks) doRsltDisp_inst_po_cnt_rmrks_NX(info);
		else if (nx == columnRsltDisp_intr_rmrks) doRsltDisp_intr_rmrks_NX(info);
		else if (nx == columnRsltDisp_sub_char1) doRsltDisp_sub_char1_NX(info);
		else if (nx == columnRsltDisp_sub_char2) doRsltDisp_sub_char2_NX(info);
		else if (nx == columnRsltDisp_sub_char3) doRsltDisp_sub_char3_NX(info);
		else if (nx == columnRsltDisp_ins_usr_id) doRsltDisp_ins_usr_id_NX(info);
		else if (nx == columnRsltDisp_ins_usr_nm) doRsltDisp_ins_usr_nm_NX(info);
		else if (nx == columnRsltDisp_ins_func_id) doRsltDisp_ins_func_id_NX(info);
		else if (nx == columnRsltDisp_ins_func_nm) doRsltDisp_ins_func_nm_NX(info);
		else if (nx == columnRsltDisp_ins_ts) doRsltDisp_ins_ts_NX(info);
		else if (nx == columnRsltDisp_upd_cntr) doRsltDisp_upd_cntr_NX(info);
		else if (nx == columnRsltDisp_upd_usr_id) doRsltDisp_upd_usr_id_NX(info);
		else if (nx == columnRsltDisp_upd_usr_nm) doRsltDisp_upd_usr_nm_NX(info);
		else if (nx == columnRsltDisp_upd_func_id) doRsltDisp_upd_func_id_NX(info);
		else if (nx == columnRsltDisp_upd_func_nm) doRsltDisp_upd_func_nm_NX(info);
		else if (nx == columnRsltDisp_upd_ts) doRsltDisp_upd_ts_NX(info);
		else if (nx == columnRsltDisp_upd_srv_req_no) doRsltDisp_upd_srv_req_no_NX(info);
		else if (nx == columnRsltDisp_disp_itm_cd) doRsltDisp_disp_itm_cd_NX(info);
		else if (nx == columnRsltDisp_disp_sno) doRsltDisp_disp_sno_NX(info);
		else if (nx == columnRslt_itm_ord_no) doRslt_itm_ord_no_NX(info);
		else if (nx == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_NX(info);
		else if (nx == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_NX(info);
		else if (nx == columnRslt_itm_ord_ld_sts_typ) doRslt_itm_ord_ld_sts_typ_NX(info);
		else if (nx == columnRslt_itm_ord_ld_sts_typ_nm) doRslt_itm_ord_ld_sts_typ_nm_NX(info);
		else if (nx == columnRslt_mfg_st_dt) doRslt_mfg_st_dt_NX(info);
		else if (nx == columnRslt_mfg_end_dt) doRslt_mfg_end_dt_NX(info);
		else if (nx == columnRslt_mfg_lt) doRslt_mfg_lt_NX(info);
		else if (nx == columnRslt_unit_cd) doRslt_unit_cd_NX(info);
		else if (nx == columnRslt_unit_nm) doRslt_unit_nm_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_rsrc_cd1) doRslt_rsrc_cd1_NX(info);
		else if (nx == columnRslt_rsrc_nm1) doRslt_rsrc_nm1_NX(info);
		else if (nx == columnRslt_rsrc_unit_nm1) doRslt_rsrc_unit_nm1_NX(info);
		else if (nx == columnRslt_rsrc_dec_place1) doRslt_rsrc_dec_place1_NX(info);
		else if (nx == columnRslt_rsrc_rnd_typ1) doRslt_rsrc_rnd_typ1_NX(info);
		else if (nx == columnRslt_rsrc_cd2) doRslt_rsrc_cd2_NX(info);
		else if (nx == columnRslt_rsrc_nm2) doRslt_rsrc_nm2_NX(info);
		else if (nx == columnRslt_rsrc_unit_nm2) doRslt_rsrc_unit_nm2_NX(info);
		else if (nx == columnRslt_rsrc_dec_place2) doRslt_rsrc_dec_place2_NX(info);
		else if (nx == columnRslt_rsrc_rnd_typ2) doRslt_rsrc_rnd_typ2_NX(info);
		else if (nx == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NX(info);
		else if (nx == columnRslt_bom_ptn) doRslt_bom_ptn_NX(info);
		else if (nx == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NX(info);
		else if (nx == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_not_fix_flg) doRslt_not_fix_flg_NX(info);
		else if (nx == columnRslt_master_dt) doRslt_master_dt_NX(info);
		else if (nx == columnRslt_rqmt_no) doRslt_rqmt_no_NX(info);
		else if (nx == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NX(info);
		else if (nx == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == columnRslt_disp_itm_cd) doRslt_disp_itm_cd_NX(info);
		else if (nx == columnRslt_disp_sno) doRslt_disp_sno_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Gantt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doGantt_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[alloc_pln_r_view]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_pln_r_view_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[select_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_select_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[select_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_select_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_ld_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_ld_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_ld_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_ld_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_lt_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_cd1_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_nm1_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_nm1_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_dec_place1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_dec_place1_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_rnd_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_rnd_typ1_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_cd2_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_nm2_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_nm2_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_dec_place2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_dec_place2_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_rnd_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_rnd_typ2_NX(MCEventInfo info){
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
	 * [RsltDisp]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[strg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_strg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[strg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_strg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[not_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_not_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[master_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_master_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rqmt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rqmt_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[io_schd_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_io_schd_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[inst_po_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_inst_po_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[disp_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_disp_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[disp_sno]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_disp_sno_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_ld_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_ld_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_ld_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_ld_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_lt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[rsrc_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_unit_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_unit_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_dec_place1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_dec_place1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_rnd_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_rnd_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_unit_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_unit_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_dec_place2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_dec_place2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_rnd_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_rnd_typ2_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_sno]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_sno_NX(MCEventInfo info){
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
		else if (lc == LPnl_select_dt_fr) doLPnl_select_dt_fr_LC(info);
		else if (lc == LPnl_select_dt_to) doLPnl_select_dt_to_LC(info);
		else if (lc == columnRsltDisp_itm_ord_no) doRsltDisp_itm_ord_no_LC(info);
		else if (lc == columnRsltDisp_itm_ord_typ) doRsltDisp_itm_ord_typ_LC(info);
		else if (lc == columnRsltDisp_itm_ord_typ_nm) doRsltDisp_itm_ord_typ_nm_LC(info);
		else if (lc == columnRsltDisp_itm_ord_ld_sts_typ) doRsltDisp_itm_ord_ld_sts_typ_LC(info);
		else if (lc == columnRsltDisp_itm_ord_ld_sts_typ_nm) doRsltDisp_itm_ord_ld_sts_typ_nm_LC(info);
		else if (lc == columnRsltDisp_mfg_st_dt) doRsltDisp_mfg_st_dt_LC(info);
		else if (lc == columnRsltDisp_mfg_end_dt) doRsltDisp_mfg_end_dt_LC(info);
		else if (lc == columnRsltDisp_mfg_lt) doRsltDisp_mfg_lt_LC(info);
		else if (lc == columnRsltDisp_unit_cd) doRsltDisp_unit_cd_LC(info);
		else if (lc == columnRsltDisp_unit_nm) doRsltDisp_unit_nm_LC(info);
		else if (lc == columnRsltDisp_dec_place) doRsltDisp_dec_place_LC(info);
		else if (lc == columnRsltDisp_rsrc_cd1) doRsltDisp_rsrc_cd1_LC(info);
		else if (lc == columnRsltDisp_rsrc_nm1) doRsltDisp_rsrc_nm1_LC(info);
		else if (lc == columnRsltDisp_rsrc_unit_nm1) doRsltDisp_rsrc_unit_nm1_LC(info);
		else if (lc == columnRsltDisp_rsrc_dec_place1) doRsltDisp_rsrc_dec_place1_LC(info);
		else if (lc == columnRsltDisp_rsrc_rnd_typ1) doRsltDisp_rsrc_rnd_typ1_LC(info);
		else if (lc == columnRsltDisp_rsrc_cd2) doRsltDisp_rsrc_cd2_LC(info);
		else if (lc == columnRsltDisp_rsrc_nm2) doRsltDisp_rsrc_nm2_LC(info);
		else if (lc == columnRsltDisp_rsrc_unit_nm2) doRsltDisp_rsrc_unit_nm2_LC(info);
		else if (lc == columnRsltDisp_rsrc_dec_place2) doRsltDisp_rsrc_dec_place2_LC(info);
		else if (lc == columnRsltDisp_rsrc_rnd_typ2) doRsltDisp_rsrc_rnd_typ2_LC(info);
		else if (lc == columnRsltDisp_mfg_loc_cd) doRsltDisp_mfg_loc_cd_LC(info);
		else if (lc == columnRsltDisp_mfg_loc_nm) doRsltDisp_mfg_loc_nm_LC(info);
		else if (lc == columnRsltDisp_bom_ptn) doRsltDisp_bom_ptn_LC(info);
		else if (lc == columnRsltDisp_strg_loc_cd) doRsltDisp_strg_loc_cd_LC(info);
		else if (lc == columnRsltDisp_strg_loc_nm) doRsltDisp_strg_loc_nm_LC(info);
		else if (lc == columnRsltDisp_wg_cd) doRsltDisp_wg_cd_LC(info);
		else if (lc == columnRsltDisp_wg_nm) doRsltDisp_wg_nm_LC(info);
		else if (lc == columnRsltDisp_master_dt) doRsltDisp_master_dt_LC(info);
		else if (lc == columnRsltDisp_rqmt_no) doRsltDisp_rqmt_no_LC(info);
		else if (lc == columnRsltDisp_io_schd_pr_no) doRsltDisp_io_schd_pr_no_LC(info);
		else if (lc == columnRsltDisp_inst_po_cnt_rmrks) doRsltDisp_inst_po_cnt_rmrks_LC(info);
		else if (lc == columnRsltDisp_intr_rmrks) doRsltDisp_intr_rmrks_LC(info);
		else if (lc == columnRsltDisp_sub_char1) doRsltDisp_sub_char1_LC(info);
		else if (lc == columnRsltDisp_sub_char2) doRsltDisp_sub_char2_LC(info);
		else if (lc == columnRsltDisp_sub_char3) doRsltDisp_sub_char3_LC(info);
		else if (lc == columnRsltDisp_ins_usr_id) doRsltDisp_ins_usr_id_LC(info);
		else if (lc == columnRsltDisp_ins_usr_nm) doRsltDisp_ins_usr_nm_LC(info);
		else if (lc == columnRsltDisp_ins_func_id) doRsltDisp_ins_func_id_LC(info);
		else if (lc == columnRsltDisp_ins_func_nm) doRsltDisp_ins_func_nm_LC(info);
		else if (lc == columnRsltDisp_ins_ts) doRsltDisp_ins_ts_LC(info);
		else if (lc == columnRsltDisp_upd_cntr) doRsltDisp_upd_cntr_LC(info);
		else if (lc == columnRsltDisp_upd_usr_id) doRsltDisp_upd_usr_id_LC(info);
		else if (lc == columnRsltDisp_upd_usr_nm) doRsltDisp_upd_usr_nm_LC(info);
		else if (lc == columnRsltDisp_upd_func_id) doRsltDisp_upd_func_id_LC(info);
		else if (lc == columnRsltDisp_upd_func_nm) doRsltDisp_upd_func_nm_LC(info);
		else if (lc == columnRsltDisp_upd_ts) doRsltDisp_upd_ts_LC(info);
		else if (lc == columnRsltDisp_upd_srv_req_no) doRsltDisp_upd_srv_req_no_LC(info);
		else if (lc == columnRsltDisp_disp_itm_cd) doRsltDisp_disp_itm_cd_LC(info);
		else if (lc == columnRsltDisp_disp_sno) doRsltDisp_disp_sno_LC(info);
		else if (lc == columnRslt_itm_ord_no) doRslt_itm_ord_no_LC(info);
		else if (lc == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_LC(info);
		else if (lc == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_LC(info);
		else if (lc == columnRslt_itm_ord_ld_sts_typ) doRslt_itm_ord_ld_sts_typ_LC(info);
		else if (lc == columnRslt_itm_ord_ld_sts_typ_nm) doRslt_itm_ord_ld_sts_typ_nm_LC(info);
		else if (lc == columnRslt_mfg_st_dt) doRslt_mfg_st_dt_LC(info);
		else if (lc == columnRslt_mfg_end_dt) doRslt_mfg_end_dt_LC(info);
		else if (lc == columnRslt_mfg_lt) doRslt_mfg_lt_LC(info);
		else if (lc == columnRslt_unit_cd) doRslt_unit_cd_LC(info);
		else if (lc == columnRslt_unit_nm) doRslt_unit_nm_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_rsrc_cd1) doRslt_rsrc_cd1_LC(info);
		else if (lc == columnRslt_rsrc_nm1) doRslt_rsrc_nm1_LC(info);
		else if (lc == columnRslt_rsrc_unit_nm1) doRslt_rsrc_unit_nm1_LC(info);
		else if (lc == columnRslt_rsrc_dec_place1) doRslt_rsrc_dec_place1_LC(info);
		else if (lc == columnRslt_rsrc_rnd_typ1) doRslt_rsrc_rnd_typ1_LC(info);
		else if (lc == columnRslt_rsrc_cd2) doRslt_rsrc_cd2_LC(info);
		else if (lc == columnRslt_rsrc_nm2) doRslt_rsrc_nm2_LC(info);
		else if (lc == columnRslt_rsrc_unit_nm2) doRslt_rsrc_unit_nm2_LC(info);
		else if (lc == columnRslt_rsrc_dec_place2) doRslt_rsrc_dec_place2_LC(info);
		else if (lc == columnRslt_rsrc_rnd_typ2) doRslt_rsrc_rnd_typ2_LC(info);
		else if (lc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_LC(info);
		else if (lc == columnRslt_bom_ptn) doRslt_bom_ptn_LC(info);
		else if (lc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_LC(info);
		else if (lc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_master_dt) doRslt_master_dt_LC(info);
		else if (lc == columnRslt_rqmt_no) doRslt_rqmt_no_LC(info);
		else if (lc == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_LC(info);
		else if (lc == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
		else if (lc == columnRslt_disp_itm_cd) doRslt_disp_itm_cd_LC(info);
		else if (lc == columnRslt_disp_sno) doRslt_disp_sno_LC(info);
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
	 * [LPnl]パネルの[select_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_select_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[select_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_select_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_ld_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_ld_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[itm_ord_ld_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_itm_ord_ld_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[mfg_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_mfg_lt_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_cd1_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_nm1_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_nm1_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_dec_place1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_dec_place1_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_rnd_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_rnd_typ1_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_cd2_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_nm2_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_unit_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_unit_nm2_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_dec_place2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_dec_place2_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rsrc_rnd_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rsrc_rnd_typ2_LC(MCEventInfo info){
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
	 * [RsltDisp]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[strg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_strg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[strg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_strg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[master_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_master_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[rqmt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_rqmt_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[io_schd_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_io_schd_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[inst_po_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_inst_po_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[disp_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_disp_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltDisp]パネルの[disp_sno]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltDisp_disp_sno_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_ld_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_ld_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_ld_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_ld_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_lt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[rsrc_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_unit_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_unit_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_dec_place1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_dec_place1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_rnd_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_rnd_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_unit_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_unit_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_dec_place2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_dec_place2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsrc_rnd_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsrc_rnd_typ2_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_sno]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_sno_LC(MCEventInfo info){
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
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getMfgWg(row, info);
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

	/**
	 * コンボ／リストのリスト[columnRsltDisp_itm_ord_ld_sts_typ]の作成メソッド
	 */
	public MCList getRsltDisp_itm_ord_ld_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getItmOrdLdStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_itm_ord_ld_sts_typ]の作成メソッド
	 */
	public MCList getRslt_itm_ord_ld_sts_typ(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL0290.Srch01")) {
			return new MS_MSBCL0290_Srch01Bridge();
		}
		if (id.equals("MS.MSBCL0290.Upd01")) {
			return new MS_MSBCL0290_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL0290_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0290_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0290_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL0290_Srch01Bridge() {
			p_MS_MSBCL0290_Srch01 = new MCParam(PDef.MS_MSBCL0290_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0290_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0290.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0290.LocR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0290.RsrcLocR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0290.CalR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0290.AllocPlnR.class));

			p_MS_MSBCL0290_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0290_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0290_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0290_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0290_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0290.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0290.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0290.RsltDispR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0290.RsltDispR>)down(0);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0290.LocR> down1() {
			return (MCList<mcframe.clientMSBC.MSBCP0290.LocR>)down(1);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0290.RsrcLocR> down2() {
			return (MCList<mcframe.clientMSBC.MSBCP0290.RsrcLocR>)down(2);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0290.CalR> down3() {
			return (MCList<mcframe.clientMSBC.MSBCP0290.CalR>)down(3);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0290.AllocPlnR> down4() {
			return (MCList<mcframe.clientMSBC.MSBCP0290.AllocPlnR>)down(4);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0290_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.class));
			p_MS_MSBCL0290_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0290.LocR.class));
			p_MS_MSBCL0290_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0290.RsrcLocR.class));
			p_MS_MSBCL0290_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0290.CalR.class));
			p_MS_MSBCL0290_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0290.AllocPlnR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0290_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0290.RsltDispR>)p_MS_MSBCL0290_Srch01.getContainerParam().getDownBlock(0));
			setLocL((MCList<mcframe.clientMSBC.MSBCP0290.LocR>)p_MS_MSBCL0290_Srch01.getContainerParam().getDownBlock(1));
			setRsrcLocL((MCList<mcframe.clientMSBC.MSBCP0290.RsrcLocR>)p_MS_MSBCL0290_Srch01.getContainerParam().getDownBlock(2));
			setCalL((MCList<mcframe.clientMSBC.MSBCP0290.CalR>)p_MS_MSBCL0290_Srch01.getContainerParam().getDownBlock(3));
			setAllocPlnL((MCList<mcframe.clientMSBC.MSBCP0290.AllocPlnR>)p_MS_MSBCL0290_Srch01.getContainerParam().getDownBlock(4));
		}

		protected void clear() {
			getRsltL().clear();
			getLocL().clear();
			getRsrcLocL().clear();
			getCalL().clear();
			getAllocPlnL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getLocL());
			result.add(getRsrcLocL());
			result.add(getCalL());
			result.add(getAllocPlnL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0290_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0290_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0290_Upd01;

		/** コンストラクタ */
		protected MS_MSBCL0290_Upd01Bridge() {
			p_MS_MSBCL0290_Upd01 = new MCParam(PDef.MS_MSBCL0290_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0290_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0290.RsltDispR.class));
			// Down

			p_MS_MSBCL0290_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0290_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0290_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0290_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0290_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0290.RsltDispR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0290.RsltDispR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBCL0290_Upd01;
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
}