package mcframe.clientMSBE.MSBEP0170;

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
import mcframe.clientMSBE.MSBEP0170.MSBEP_OPStkRpl_MC.MS_MSBEL0170_Srch01Caller;
import mcframe.clientMSBE.MSBEP0170.MSBEP_OPStkRpl_MC.MS_MSBEL0170_Sprt01Caller;
import mcframe.clientMSBE.MSBEP0170.MSBEP_OPStkRpl_MC.MS_MSBEL0170_Ins01Caller;

/**
 * 画面"MSBEP_OPStkRpl"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_OPStkRpl_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBEP0170";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_master_dt_Label = null;
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDateField Cnd_master_dt = null;
	public MCLabel Cnd_gr_schd_dt_to_Label = null;
	/**
	 * Until scheduled GR date 入庫予定日まで.<p>
	 *
	 */
	public MCDateField Cnd_gr_schd_dt_to = null;
	public MCLabel Cnd_gi_schd_dt_to_Label = null;
	/**
	 * Until scheduled GI date 出庫予定日まで.<p>
	 *
	 */
	public MCDateField Cnd_gi_schd_dt_to = null;
	public MCLabel Cnd_strg_site_cd_Label = null;
	/**
	 * Storage factory/distribution warehouse cd. 格納工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_strg_site_cd = null;
	/**
	 * Storage factory/distribution warehouse name 格納工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_strg_site_nm = null;
	public MCLabel Cnd_strg_wg_cd_Label = null;
	/**
	 * Storage WG cd. 格納ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_strg_wg_cd = null;
	/**
	 * Storage WG name 格納ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_strg_wg_nm = null;
	public MCLabel Cnd_strg_lg_grp_cd_Label = null;
	/**
	 * Storage distribution group cd. 格納物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_strg_lg_grp_cd = null;
	/**
	 * Storage distribution group name 格納物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_strg_lg_grp_nm = null;
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
	/**
	 * Shortage only 不足のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_shortage_flg = null;
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
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	public MCLabel LPnl_master_dt_Label = null;
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDateField LPnl_master_dt = null;
	public MCLabel LPnl_st_schd_dt_Label = null;
	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public MCDateField LPnl_st_schd_dt = null;
	public MCLabel LPnl_end_schd_dt_Label = null;
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDateField LPnl_end_schd_dt = null;
	/**
	 * | ｜.<p>
	 *
	 */
	public MCLabel LPnl_label_sep01 = null;
	/**
	 * Display SEIBAN No. 手配ＮＯ表示.<p>
	 *
	 */
	public MCCheckBox LPnl_show_sno_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP0170.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asset_mng_typ = null;
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
	 * Replenishment method type 補充方法区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_op_rpl_mtd_typ = null;
	/**
	 * Replenishment method type name 補充方法区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_op_rpl_mtd_typ_nm = null;
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
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_sppl_cd = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bom_ptn = null;
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
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_maker_nm = null;
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_loc_cd = null;
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_loc_nm = null;
	/**
	 * For requested rack/line 依頼先棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Rslt_str_ln_p_PPanel;
	public MCColumnConfig columnRslt_rqst_str_ln_cd;// [Rslt]の[str_ln_p.str_ln_cd]を[columnRslt_rqst_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_rqst_str_ln_nm;// [Rslt]の[str_ln_p.str_ln_nm]を[columnRslt_rqst_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_rqst_str_ln_cd_none_flg;// [Rslt]の[str_ln_p.str_ln_cd_none_flg]を[columnRslt_rqst_str_ln_cd_none_flg]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_gr_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_gr_schd_qty;// [Rslt]の[gr_schd_qty_p.qty]を[columnRslt_gr_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_stk_qty_p_PPanel;
	public MCColumnConfig columnRslt_stk_qty;// [Rslt]の[stk_qty_p.qty]を[columnRslt_stk_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_gi_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_gi_schd_qty;// [Rslt]の[gi_schd_qty_p.qty]を[columnRslt_gi_schd_qty]としてエイリアス定義。
	/**
	 * Include GI schedule 出庫予定含む.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_schd_flg = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_rord_stk_qty_p_PPanel;
	public MCColumnConfig columnRslt_rord_stk_qty;// [Rslt]の[rord_stk_qty_p.qty]を[columnRslt_rord_stk_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_shortage_qty_p_PPanel;
	public MCColumnConfig columnRslt_shortage_qty;// [Rslt]の[shortage_qty_p.qty]を[columnRslt_shortage_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_rord_rqst_qty_p_PPanel;
	public MCColumnConfig columnRslt_rord_rqst_qty;// [Rslt]の[rord_rqst_qty_p.qty]を[columnRslt_rord_rqst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_rqst_qty_p_PPanel;
	public MCColumnConfig columnRslt_rqst_qty;// [Rslt]の[rqst_qty_p.qty]を[columnRslt_rqst_qty]としてエイリアス定義。
	/**
	 * Base unit 基準単位.<p>
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
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_st_schd_dt = null;
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_end_schd_dt = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ver_flg = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_no_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_no_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno4_mng_typ = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_po_cnt_rmrks = null;
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_flg = null;
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_gr_schd_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_gr_schd_cont_qty;// [Rslt]の[gr_schd_cont_qty_p.cont_qty]を[columnRslt_gr_schd_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_stk_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_stk_cont_qty;// [Rslt]の[stk_cont_qty_p.cont_qty]を[columnRslt_stk_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_gi_schd_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_gi_schd_cont_qty;// [Rslt]の[gi_schd_cont_qty_p.cont_qty]を[columnRslt_gi_schd_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_shortage_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_shortage_cont_qty;// [Rslt]の[shortage_cont_qty_p.cont_qty]を[columnRslt_shortage_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Rslt_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnRslt_cont_fctr_unit_cd;// [Rslt]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnRslt_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_cont_fctr_unit_nm;// [Rslt]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnRslt_cont_fctr_unit_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Rslt_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_fctr;// [Rslt]の[std_cont_fctr_p.std_cont_fctr]を[columnRslt_std_cont_fctr]としてエイリアス定義。
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_dec_place = null;
	/**
	 * Storage factory/distribution warehouse cd. 格納工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_site_cd = null;
	/**
	 * Storage factory/distribution warehouse name 格納工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_site_nm = null;
	/**
	 * Storage distribution group cd. 格納物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_lg_grp_cd = null;
	/**
	 * Storage distribution group name 格納物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_lg_grp_nm = null;
	/**
	 * Storage WG cd. 格納ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_wg_cd = null;
	/**
	 * Storage WG name 格納ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_wg_nm = null;
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_wg_cd = null;
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_wg_nm = null;
	/**
	 * Shortage 不足.<p>
	 *
	 */
	public MCColumnConfig columnRslt_shortage_flg = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_master_dt = null;
	public MCColumnConfig columnRslt_strg_sppl_cd = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Current inventory 現状在庫一覧.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0010 = null;
	/**
	 * Inventory forecasting list 在庫推移照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0060 = null;
	/**
	 * Details info. 詳細情報.<p>
	 *
	 */
	public MCButton Btn_open_dtl = null;
	/**
	 * Date calculation 日付計算.<p>
	 *
	 */
	public MCButton Btn_sprt_due_dt = null;
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
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, UPD};
	
	/** [MS_MSBEL0170_Srch01]のCallerの作成 */
	protected MSBEP_OPStkRpl_MC.MS_MSBEL0170_Srch01Caller createMS_MSBEL0170_Srch01() {
		MSBEP_OPStkRpl_MC.MS_MSBEL0170_Srch01Caller<MSBEP_OPStkRpl, MS_MSBEL0170_Srch01Bridge>
		caller = ((MSBEP_OPStkRpl_MC)this).new MS_MSBEL0170_Srch01Caller<MSBEP_OPStkRpl, MS_MSBEL0170_Srch01Bridge>(
					(MSBEP_OPStkRpl)this, new MS_MSBEL0170_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL0170_Srch01]の呼び出し */
	protected void callMS_MSBEL0170_Srch01() {
		MCCaller caller = createMS_MSBEL0170_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL0170_Sprt01]のCallerの作成 */
	protected MSBEP_OPStkRpl_MC.MS_MSBEL0170_Sprt01Caller createMS_MSBEL0170_Sprt01() {
		MSBEP_OPStkRpl_MC.MS_MSBEL0170_Sprt01Caller<MSBEP_OPStkRpl, MS_MSBEL0170_Sprt01Bridge>
		caller = ((MSBEP_OPStkRpl_MC)this).new MS_MSBEL0170_Sprt01Caller<MSBEP_OPStkRpl, MS_MSBEL0170_Sprt01Bridge>(
					(MSBEP_OPStkRpl)this, new MS_MSBEL0170_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBEL0170_Sprt01]の呼び出し */
	protected void callMS_MSBEL0170_Sprt01() {
		MCCaller caller = createMS_MSBEL0170_Sprt01();
		caller.exec();
	}
	/** [MS_MSBEL0170_Ins01]のCallerの作成 */
	protected MSBEP_OPStkRpl_MC.MS_MSBEL0170_Ins01Caller createMS_MSBEL0170_Ins01() {
		MSBEP_OPStkRpl_MC.MS_MSBEL0170_Ins01Caller<MSBEP_OPStkRpl, MS_MSBEL0170_Ins01Bridge>
		caller = ((MSBEP_OPStkRpl_MC)this).new MS_MSBEL0170_Ins01Caller<MSBEP_OPStkRpl, MS_MSBEL0170_Ins01Bridge>(
					(MSBEP_OPStkRpl)this, new MS_MSBEL0170_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBEL0170_Ins01]の呼び出し */
	protected void callMS_MSBEL0170_Ins01() {
		MCCaller caller = createMS_MSBEL0170_Ins01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP0170.CndR aCndR;
	/** [LPnl]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP0170.LPnlR aLPnlR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP0170.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP0170.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0170.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0170.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP0170.CndR.create();
	}

	/**
	 * 項目コピーによってaLPnlRを設定します。
	 *
	 * aLPnlRのインスタンスは変更されません。
	 *
	 * @param row LPnlR
	 */
	public void setLPnlR(mcframe.clientMSBE.MSBEP0170.LPnlR row) {
		if (row != null) {
			MCRow.copyall(getLPnlR(), row);
		}
	}

	/**
	 * [LPnl]ブロックのコンテナaLPnlRを返します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMSBE.MSBEP0170.LPnlR getLPnlR() {
		return aLPnlR;
	}

	/**
	 * aLPnlRを作成します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMSBE.MSBEP0170.LPnlR createLPnlR() {
		return mcframe.clientMSBE.MSBEP0170.LPnlR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP0170.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0170.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP0170.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP0170.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0170.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP0170.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getLPnlR())) ret.add(getLPnlR());
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
		if(aCnt == getLPnlR()) return "LPnl";
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
		if(bId.equals("LPnl")) return getLPnlR();
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
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_OPStkRpl_MC_A() {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_OPStkRpl_MC_A(String name) {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_OPStkRpl_MC.jbCreateTop((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbCreateFold((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbCreateTab1((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbCreateTab2((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbCreateCnd((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbCreateCnd2((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbCreateLPnl((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbCreateCtrl((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbCreateRslt((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbCreateBtn((MSBEP_OPStkRpl)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_OPStkRpl p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_OPStkRpl p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_OPStkRpl p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_OPStkRpl p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_OPStkRpl p) {
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
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBEP_OPStkRpl p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MSBEP_OPStkRpl p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_OPStkRpl p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_OPStkRpl p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$itm_p);
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
		p.Rslt_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$str_ln_p);
		p.Rslt_str_ln_p_PPanel.setName("Rslt.str_ln_p");
		p.columnRslt_rqst_str_ln_cd = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRslt_rqst_str_ln_cd.addAliasName("Rslt.rqst_str_ln_cd", p);
		p.columnRslt_rqst_str_ln_nm = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRslt_rqst_str_ln_nm.addAliasName("Rslt.rqst_str_ln_nm", p);
		p.columnRslt_rqst_str_ln_cd_none_flg = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRslt_rqst_str_ln_cd_none_flg.addAliasName("Rslt.rqst_str_ln_cd_none_flg", p);
		p.Rslt_gr_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$gr_schd_qty_p);
		p.Rslt_gr_schd_qty_p_PPanel.setName("Rslt.gr_schd_qty_p");
		p.columnRslt_gr_schd_qty = p.Rslt_gr_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_gr_schd_qty.addAliasName("Rslt.gr_schd_qty", p);
		p.Rslt_stk_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$stk_qty_p);
		p.Rslt_stk_qty_p_PPanel.setName("Rslt.stk_qty_p");
		p.columnRslt_stk_qty = p.Rslt_stk_qty_p_PPanel.columnQty_qty;
		p.columnRslt_stk_qty.addAliasName("Rslt.stk_qty", p);
		p.Rslt_gi_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$gi_schd_qty_p);
		p.Rslt_gi_schd_qty_p_PPanel.setName("Rslt.gi_schd_qty_p");
		p.columnRslt_gi_schd_qty = p.Rslt_gi_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_gi_schd_qty.addAliasName("Rslt.gi_schd_qty", p);
		p.Rslt_rord_stk_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$rord_stk_qty_p);
		p.Rslt_rord_stk_qty_p_PPanel.setName("Rslt.rord_stk_qty_p");
		p.columnRslt_rord_stk_qty = p.Rslt_rord_stk_qty_p_PPanel.columnQty_qty;
		p.columnRslt_rord_stk_qty.addAliasName("Rslt.rord_stk_qty", p);
		p.Rslt_shortage_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$shortage_qty_p);
		p.Rslt_shortage_qty_p_PPanel.setName("Rslt.shortage_qty_p");
		p.columnRslt_shortage_qty = p.Rslt_shortage_qty_p_PPanel.columnQty_qty;
		p.columnRslt_shortage_qty.addAliasName("Rslt.shortage_qty", p);
		p.Rslt_rord_rqst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$rord_rqst_qty_p);
		p.Rslt_rord_rqst_qty_p_PPanel.setName("Rslt.rord_rqst_qty_p");
		p.columnRslt_rord_rqst_qty = p.Rslt_rord_rqst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_rord_rqst_qty.addAliasName("Rslt.rord_rqst_qty", p);
		p.Rslt_rqst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$rqst_qty_p);
		p.Rslt_rqst_qty_p_PPanel.setName("Rslt.rqst_qty_p");
		p.columnRslt_rqst_qty = p.Rslt_rqst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_rqst_qty.addAliasName("Rslt.rqst_qty", p);
		p.Rslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$ver_no_p);
		p.Rslt_ver_no_p_PPanel.setName("Rslt.ver_no_p");
		p.columnRslt_ver_no = p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$sno_wrk_no_p);
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
		p.Rslt_gr_schd_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$gr_schd_cont_qty_p);
		p.Rslt_gr_schd_cont_qty_p_PPanel.setName("Rslt.gr_schd_cont_qty_p");
		p.columnRslt_gr_schd_cont_qty = p.Rslt_gr_schd_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_gr_schd_cont_qty.addAliasName("Rslt.gr_schd_cont_qty", p);
		p.Rslt_stk_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$stk_cont_qty_p);
		p.Rslt_stk_cont_qty_p_PPanel.setName("Rslt.stk_cont_qty_p");
		p.columnRslt_stk_cont_qty = p.Rslt_stk_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_stk_cont_qty.addAliasName("Rslt.stk_cont_qty", p);
		p.Rslt_gi_schd_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$gi_schd_cont_qty_p);
		p.Rslt_gi_schd_cont_qty_p_PPanel.setName("Rslt.gi_schd_cont_qty_p");
		p.columnRslt_gi_schd_cont_qty = p.Rslt_gi_schd_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_gi_schd_cont_qty.addAliasName("Rslt.gi_schd_cont_qty", p);
		p.Rslt_shortage_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$shortage_cont_qty_p);
		p.Rslt_shortage_cont_qty_p_PPanel.setName("Rslt.shortage_cont_qty_p");
		p.columnRslt_shortage_cont_qty = p.Rslt_shortage_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_shortage_cont_qty.addAliasName("Rslt.shortage_cont_qty", p);
		p.Rslt_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$cont_fctr_unit_p);
		p.Rslt_cont_fctr_unit_p_PPanel.setName("Rslt.cont_fctr_unit_p");
		p.columnRslt_cont_fctr_unit_cd = p.Rslt_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnRslt_cont_fctr_unit_cd.addAliasName("Rslt.cont_fctr_unit_cd", p);
		p.columnRslt_cont_fctr_unit_nm = p.Rslt_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnRslt_cont_fctr_unit_nm.addAliasName("Rslt.cont_fctr_unit_nm", p);
		p.Rslt_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$std_cont_fctr_p);
		p.Rslt_std_cont_fctr_p_PPanel.setName("Rslt.std_cont_fctr_p");
		p.columnRslt_std_cont_fctr = p.Rslt_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnRslt_std_cont_fctr.addAliasName("Rslt.std_cont_fctr", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBE.MSBEP0170.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_OPStkRpl p) {
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

	
	/** [Cnd_strg_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_strg_site_cd_p = null;

	/**
	 * [Cnd_strg_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_strg_site_cd_ListPutter() {
		if (Cnd_strg_site_cd_p == null) {
			Cnd_strg_site_cd_p = createCnd_strg_site_cd_ListPutter(Cnd_strg_site_cd, "strg_site_cd", "strg_site_nm");

		}
		return Cnd_strg_site_cd_p;
	}
	
	
	/** [Cnd_strg_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_strg_wg_cd_p = null;

	/**
	 * [Cnd_strg_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_strg_wg_cd_ListPutter() {
		if (Cnd_strg_wg_cd_p == null) {
			Cnd_strg_wg_cd_p = createCnd_strg_wg_cd_ListPutter(Cnd_strg_wg_cd, "strg_wg_cd", "strg_wg_nm");

		}
		return Cnd_strg_wg_cd_p;
	}
	
	
	/** [Cnd_strg_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_strg_lg_grp_cd_p = null;

	/**
	 * [Cnd_strg_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_strg_lg_grp_cd_ListPutter() {
		if (Cnd_strg_lg_grp_cd_p == null) {
			Cnd_strg_lg_grp_cd_p = createCnd_strg_lg_grp_cd_ListPutter(Cnd_strg_lg_grp_cd, "strg_lg_grp_cd", "strg_lg_grp_nm");

		}
		return Cnd_strg_lg_grp_cd_p;
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
	
	
	/** [Rslt_op_rpl_mtd_typ_ListPutter]の定義 */
	private MCListPutter Rslt_op_rpl_mtd_typ_p = null;

	/**
	 * [Rslt_op_rpl_mtd_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_op_rpl_mtd_typ_ListPutter() {
		if (Rslt_op_rpl_mtd_typ_p == null) {
			Rslt_op_rpl_mtd_typ_p = createRslt_op_rpl_mtd_typ_ListPutter(columnRslt_op_rpl_mtd_typ, "op_rpl_mtd_typ", "op_rpl_mtd_typ_nm");

		}
		return Rslt_op_rpl_mtd_typ_p;
	}
	
	
	/** [Rslt_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_mfg_loc_cd_p = null;

	/**
	 * [Rslt_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_mfg_loc_cd_ListPutter() {
		if (Rslt_mfg_loc_cd_p == null) {
			Rslt_mfg_loc_cd_p = createRslt_mfg_loc_cd_ListPutter(columnRslt_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm","mfg_loc_sppl_cd");

		}
		return Rslt_mfg_loc_cd_p;
	}
	
	
	/** [Rslt_bom_ptn_ListPutter]の定義 */
	private MCListPutter Rslt_bom_ptn_p = null;

	/**
	 * [Rslt_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getRslt_bom_ptn_ListPutter() {
		if (Rslt_bom_ptn_p == null) {
			Rslt_bom_ptn_p = createRslt_bom_ptn_ListPutter(columnRslt_bom_ptn, "bom_ptn", "rqst_wg_cd","rqst_wg_nm");

		}
		return Rslt_bom_ptn_p;
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
	
	
	/** [Rslt_maker_cd_ListPutter]の定義 */
	private MCListPutter Rslt_maker_cd_p = null;

	/**
	 * [Rslt_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_maker_cd_ListPutter() {
		if (Rslt_maker_cd_p == null) {
			Rslt_maker_cd_p = createRslt_maker_cd_ListPutter(columnRslt_maker_cd, "maker_cd", "maker_nm","rqst_wg_cd","rqst_wg_nm");

		}
		return Rslt_maker_cd_p;
	}
	
	
	/** [Rslt_rqst_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_rqst_loc_cd_p = null;

	/**
	 * [Rslt_rqst_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_rqst_loc_cd_ListPutter() {
		if (Rslt_rqst_loc_cd_p == null) {
			Rslt_rqst_loc_cd_p = createRslt_rqst_loc_cd_ListPutter(columnRslt_rqst_loc_cd, "rqst_loc_cd", "rqst_loc_nm","rqst_str_ln_tgt_flg","rqst_wg_cd","rqst_wg_nm");

		}
		return Rslt_rqst_loc_cd_p;
	}
	
	
	/** [Rslt_rqst_wg_cd_ListPutter]の定義 */
	private MCListPutter Rslt_rqst_wg_cd_p = null;

	/**
	 * [Rslt_rqst_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_rqst_wg_cd_ListPutter() {
		if (Rslt_rqst_wg_cd_p == null) {
			Rslt_rqst_wg_cd_p = createRslt_rqst_wg_cd_ListPutter(columnRslt_rqst_wg_cd, "rqst_wg_cd", "rqst_wg_nm");

		}
		return Rslt_rqst_wg_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_OPStkRpl create(){
		MSBEP_OPStkRpl p = new MSBEP_OPStkRpl();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_OPStkRpl create(String name){
		MSBEP_OPStkRpl p = new MSBEP_OPStkRpl(name);
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
		MSBEP_OPStkRpl_MC.jbfInitTop((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbfInitFold((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbfInitTab1((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbfInitTab2((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbfInitCnd((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbfInitCnd2((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbfInitLPnl((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbfInitCtrl((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbfInitRslt((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbfInitBtn((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbInitTop((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbInitFold((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbInitTab1((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbInitTab2((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbInitCnd((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbInitCnd2((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbInitLPnl((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbInitCtrl((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbInitRslt((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.jbInitBtn((MSBEP_OPStkRpl)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_OPStkRpl p) {
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
	protected static void jbfInitTab1(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_master_dt_Label = p.beansFactory.createLabel("Cnd.master_dt_Label");
		p.Cnd_master_dt = p.beansFactory.createDateField("Cnd.master_dt");
		p.Cnd_master_dt.setLabel(p.Cnd_master_dt_Label);
		p.Cnd_gr_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.gr_schd_dt_to_Label");
		p.Cnd_gr_schd_dt_to = p.beansFactory.createDateField("Cnd.gr_schd_dt_to");
		p.Cnd_gr_schd_dt_to.setLabel(p.Cnd_gr_schd_dt_to_Label);
		p.Cnd_gi_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.gi_schd_dt_to_Label");
		p.Cnd_gi_schd_dt_to = p.beansFactory.createDateField("Cnd.gi_schd_dt_to");
		p.Cnd_gi_schd_dt_to.setLabel(p.Cnd_gi_schd_dt_to_Label);
		p.Cnd_strg_site_cd_Label = p.beansFactory.createLabel("Cnd.strg_site_cd_Label");
		p.Cnd_strg_site_cd = p.beansFactory.createTextComboBox("Cnd.strg_site_cd");
		p.Cnd_strg_site_cd.setLabel(p.Cnd_strg_site_cd_Label);
		p.Cnd_strg_site_nm = p.beansFactory.createTextField("Cnd.strg_site_nm");
		p.Cnd_strg_wg_cd_Label = p.beansFactory.createLabel("Cnd.strg_wg_cd_Label");
		p.Cnd_strg_wg_cd = p.beansFactory.createTextComboBox("Cnd.strg_wg_cd");
		p.Cnd_strg_wg_cd.setLabel(p.Cnd_strg_wg_cd_Label);
		p.Cnd_strg_wg_nm = p.beansFactory.createTextField("Cnd.strg_wg_nm");
		p.Cnd_strg_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.strg_lg_grp_cd_Label");
		p.Cnd_strg_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.strg_lg_grp_cd");
		p.Cnd_strg_lg_grp_cd.setLabel(p.Cnd_strg_lg_grp_cd_Label);
		p.Cnd_strg_lg_grp_nm = p.beansFactory.createTextField("Cnd.strg_lg_grp_nm");
		p.Cnd_strg_loc_cd_Label = p.beansFactory.createLabel("Cnd.strg_loc_cd_Label");
		p.Cnd_strg_loc_cd = p.beansFactory.createTextField("Cnd.strg_loc_cd");
		p.Cnd_strg_loc_cd.setLabel(p.Cnd_strg_loc_cd_Label);
		p.Cnd_strg_loc_nm = p.beansFactory.createTextField("Cnd.strg_loc_nm");
		p.Cnd_shortage_flg = p.beansFactory.createCheckBox("Cnd.shortage_flg");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
		p.LPnl_master_dt_Label = p.beansFactory.createLabel("LPnl.master_dt_Label");
		p.LPnl_master_dt = p.beansFactory.createDateField("LPnl.master_dt");
		p.LPnl_master_dt.setLabel(p.LPnl_master_dt_Label);
		p.LPnl_st_schd_dt_Label = p.beansFactory.createLabel("LPnl.st_schd_dt_Label");
		p.LPnl_st_schd_dt = p.beansFactory.createDateField("LPnl.st_schd_dt");
		p.LPnl_st_schd_dt.setLabel(p.LPnl_st_schd_dt_Label);
		p.LPnl_end_schd_dt_Label = p.beansFactory.createLabel("LPnl.end_schd_dt_Label");
		p.LPnl_end_schd_dt = p.beansFactory.createDateField("LPnl.end_schd_dt");
		p.LPnl_end_schd_dt.setLabel(p.LPnl_end_schd_dt_Label);
		p.LPnl_label_sep01 = p.beansFactory.createLabel("LPnl.label_sep01");
		p.LPnl_show_sno_flg = p.beansFactory.createCheckBox("LPnl.show_sno_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_asset_mng_typ = p.beansFactory.createTableColumn("Rslt.asset_mng_typ", MCColumnType.TEXT);
		p.columnRslt_strg_loc_cd = p.beansFactory.createTableColumn("Rslt.strg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_strg_loc_nm = p.beansFactory.createTableColumn("Rslt.strg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_op_rpl_mtd_typ = p.beansFactory.createTableColumn("Rslt.op_rpl_mtd_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_op_rpl_mtd_typ_nm = p.beansFactory.createTableColumn("Rslt.op_rpl_mtd_typ_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_mfg_loc_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_sppl_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_sppl_cd", MCColumnType.TEXT);
		p.columnRslt_bom_ptn = p.beansFactory.createTableColumn("Rslt.bom_ptn", MCColumnType.TEXT_COMBO);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_maker_cd = p.beansFactory.createTableColumn("Rslt.maker_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_maker_nm = p.beansFactory.createTableColumn("Rslt.maker_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_loc_cd = p.beansFactory.createTableColumn("Rslt.rqst_loc_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_loc_nm = p.beansFactory.createTableColumn("Rslt.rqst_loc_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_str_ln_tgt_flg = p.beansFactory.createTableColumn("Rslt.rqst_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_gi_schd_flg = p.beansFactory.createTableColumn("Rslt.gi_schd_flg", MCColumnType.CHECK);
		p.columnRslt_unit_cd = p.beansFactory.createTableColumn("Rslt.unit_cd", MCColumnType.TEXT);
		p.columnRslt_unit_nm = p.beansFactory.createTableColumn("Rslt.unit_nm", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_st_schd_dt = p.beansFactory.createTableColumn("Rslt.st_schd_dt", MCColumnType.DATE);
		p.columnRslt_end_schd_dt = p.beansFactory.createTableColumn("Rslt.end_schd_dt", MCColumnType.DATE);
		p.columnRslt_ver_flg = p.beansFactory.createTableColumn("Rslt.ver_flg", MCColumnType.CHECK);
		p.columnRslt_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt.sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt.sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt.sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt.sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt_inst_po_cnt_rmrks = p.beansFactory.createTableColumn("Rslt.inst_po_cnt_rmrks", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_flg = p.beansFactory.createTableColumn("Rslt.cont_fctr_flg", MCColumnType.CHECK);
		p.columnRslt_cont_fctr_dec_place = p.beansFactory.createTableColumn("Rslt.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnRslt_strg_site_cd = p.beansFactory.createTableColumn("Rslt.strg_site_cd", MCColumnType.TEXT);
		p.columnRslt_strg_site_nm = p.beansFactory.createTableColumn("Rslt.strg_site_nm", MCColumnType.TEXT);
		p.columnRslt_strg_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.strg_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_strg_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.strg_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_strg_wg_cd = p.beansFactory.createTableColumn("Rslt.strg_wg_cd", MCColumnType.TEXT);
		p.columnRslt_strg_wg_nm = p.beansFactory.createTableColumn("Rslt.strg_wg_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_wg_cd = p.beansFactory.createTableColumn("Rslt.rqst_wg_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_rqst_wg_nm = p.beansFactory.createTableColumn("Rslt.rqst_wg_nm", MCColumnType.TEXT);
		p.columnRslt_shortage_flg = p.beansFactory.createTableColumn("Rslt.shortage_flg", MCColumnType.CHECK);
		p.columnRslt_master_dt = p.beansFactory.createTableColumn("Rslt.master_dt", MCColumnType.DATE);
		p.columnRslt_strg_sppl_cd = p.beansFactory.createTableColumn("Rslt.strg_sppl_cd", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP0010 = p.beansFactory.createButton("Btn.open_MSBEP0010", "open");
		p.Btn_open_MSBEP0060 = p.beansFactory.createButton("Btn.open_MSBEP0060", "open");
		p.Btn_open_dtl = p.beansFactory.createButton("Btn.open_dtl", "open");
		p.Btn_sprt_due_dt = p.beansFactory.createButton("Btn.sprt_due_dt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
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
	protected static void jbInitFold(MSBEP_OPStkRpl p) {
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
	protected static void jbInitTab1(MSBEP_OPStkRpl p) {
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
	protected static void jbInitTab2(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_master_dt_Label);
		p.CndPanel.add(p.Cnd_master_dt);
		p.CndPanel.setLastBeans(p.Cnd_master_dt);
		p.Cnd_master_dt.setNextBeans(p.Cnd_gr_schd_dt_to);
		p.Cnd_master_dt.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0170.CndR.master_dt_META);
		p.Cnd_master_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_gr_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_gr_schd_dt_to);
		p.Cnd_gr_schd_dt_to.setNextBeans(p.Cnd_gi_schd_dt_to);
		p.Cnd_gr_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0170.CndR.gr_schd_dt_to_META);
		p.Cnd_gr_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_gi_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_gi_schd_dt_to);
		p.Cnd_gi_schd_dt_to.setNextBeans(p.Cnd_strg_site_cd);
		p.Cnd_gi_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0170.CndR.gi_schd_dt_to_META);
		p.Cnd_gi_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_strg_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_site_cd, true);
		p.Cnd_strg_site_cd.setLinkBeans(p.Cnd_strg_site_nm);
		p.CndPanel.add(p.Cnd_strg_site_cd_Label);
		p.CndPanel.add(p.Cnd_strg_site_cd);
		p.Cnd_strg_site_cd.setNextBeans(p.Cnd_strg_site_nm);
		p.Cnd_strg_site_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0170.CndR.strg_site_cd_META);
		p.CndPanel.add(p.Cnd_strg_site_nm);
		p.Cnd_strg_site_nm.setNextBeans(p.Cnd_strg_wg_cd);
		p.Cnd_strg_site_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0170.CndR.strg_site_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_site_nm, true);
		p.Cnd_strg_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_wg_cd, true);
		p.Cnd_strg_wg_cd.setLinkBeans(p.Cnd_strg_wg_nm);
		p.CndPanel.add(p.Cnd_strg_wg_cd_Label);
		p.CndPanel.add(p.Cnd_strg_wg_cd);
		p.Cnd_strg_wg_cd.setNextBeans(p.Cnd_strg_wg_nm);
		p.Cnd_strg_wg_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0170.CndR.strg_wg_cd_META);
		p.CndPanel.add(p.Cnd_strg_wg_nm);
		p.Cnd_strg_wg_nm.setNextBeans(p.Cnd_strg_lg_grp_cd);
		p.Cnd_strg_wg_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0170.CndR.strg_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_wg_nm, true);
		p.Cnd_strg_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_lg_grp_cd, true);
		p.Cnd_strg_lg_grp_cd.setLinkBeans(p.Cnd_strg_lg_grp_nm);
		p.CndPanel.add(p.Cnd_strg_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_strg_lg_grp_cd);
		p.Cnd_strg_lg_grp_cd.setNextBeans(p.Cnd_strg_lg_grp_nm);
		p.Cnd_strg_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0170.CndR.strg_lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_strg_lg_grp_nm);
		p.Cnd_strg_lg_grp_nm.setNextBeans(p.Cnd_strg_loc_cd);
		p.Cnd_strg_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0170.CndR.strg_lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_lg_grp_nm, true);
		p.CndPanel.add(p.Cnd_strg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_strg_loc_cd);
		p.Cnd_strg_loc_cd.setNextBeans(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0170.CndR.strg_loc_cd_META);
		p.Cnd_strg_loc_cd.addLinkBeans(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_loc_cd, true);
		p.CndPanel.add(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_strg_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0170.CndR.strg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_loc_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_shortage_flg);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.CndPanel.add(p.Cnd_shortage_flg);
		p.Cnd_shortage_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0170.CndR.shortage_flg_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.LPnlPanel.add(p.LPnl_master_dt_Label);
		p.LPnlPanel.add(p.LPnl_master_dt);
		p.LPnlPanel.setLastBeans(p.LPnl_master_dt);
		p.LPnl_master_dt.setNextBeans(p.LPnl_st_schd_dt);
		p.LPnl_master_dt.setRow(p.getLPnlR(), mcframe.clientMSBE.MSBEP0170.LPnlR.master_dt_META);
		p.LPnl_master_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.LPnlPanel.add(p.LPnl_st_schd_dt_Label);
		p.LPnlPanel.add(p.LPnl_st_schd_dt);
		p.LPnl_st_schd_dt.setNextBeans(p.LPnl_end_schd_dt);
		p.LPnl_st_schd_dt.setRow(p.getLPnlR(), mcframe.clientMSBE.MSBEP0170.LPnlR.st_schd_dt_META);
		p.LPnl_st_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.LPnlPanel.add(p.LPnl_end_schd_dt_Label);
		p.LPnlPanel.add(p.LPnl_end_schd_dt);
		p.LPnl_end_schd_dt.setNextBeans(p.LPnl_show_sno_flg);
		p.LPnl_end_schd_dt.setRow(p.getLPnlR(), mcframe.clientMSBE.MSBEP0170.LPnlR.end_schd_dt_META);
		p.LPnl_end_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.LPnlPanel.add(p.LPnl_label_sep01);
		p.LPnlPanel.add(p.LPnl_show_sno_flg);
		p.LPnl_show_sno_flg.setRow(p.getLPnlR(), mcframe.clientMSBE.MSBEP0170.LPnlR.show_sno_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_OPStkRpl p) {
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
	protected static void jbInitBtn(MSBEP_OPStkRpl p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP0010.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP0010);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP0010);
		p.Btn_open_MSBEP0010.setNextBeans(p.Btn_open_MSBEP0060);
		p.Btn_open_MSBEP0060.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBEP0060);
		p.Btn_open_MSBEP0060.setNextBeans(p.Btn_open_dtl);
		p.Btn_open_dtl.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_dtl);
		p.Btn_open_dtl.setNextBeans(p.Btn_sprt_due_dt);
		p.Btn_sprt_due_dt.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_sprt_due_dt);
		p.Btn_sprt_due_dt.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_rdel);
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
		MSBEP_OPStkRpl_MC.mcInitTop((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.mcInitFold((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.mcInitTab1((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.mcInitTab2((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.mcInitCnd((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.mcInitCnd2((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.mcInitLPnl((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.mcInitCtrl((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.mcInitRslt((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.mcInitBtn((MSBEP_OPStkRpl)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_OPStkRpl_MC.statusInitSRCH_Top((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitSRCH_Fold((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitSRCH_Tab1((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitSRCH_Tab2((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitSRCH_Cnd((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitSRCH_Cnd2((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitSRCH_LPnl((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitSRCH_Ctrl((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitSRCH_Rslt((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitSRCH_Btn((MSBEP_OPStkRpl)this);

		// [UPD]ステータスのモードの設定
		MSBEP_OPStkRpl_MC.statusInitUPD_Top((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitUPD_Fold((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitUPD_Tab1((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitUPD_Tab2((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitUPD_Cnd((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitUPD_Cnd2((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitUPD_LPnl((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitUPD_Ctrl((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitUPD_Rslt((MSBEP_OPStkRpl)this);
		MSBEP_OPStkRpl_MC.statusInitUPD_Btn((MSBEP_OPStkRpl)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_OPStkRpl p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_OPStkRpl p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_OPStkRpl p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_OPStkRpl p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_OPStkRpl p) {
		p.Cnd_master_dt.setListListener(p);
		p.Cnd_master_dt.addAllListener(p);
		p.Cnd_gr_schd_dt_to.setListListener(p);
		p.Cnd_gr_schd_dt_to.addAllListener(p);
		p.Cnd_gi_schd_dt_to.setListListener(p);
		p.Cnd_gi_schd_dt_to.addAllListener(p);
		p.Cnd_strg_site_cd.setListListener(p);
		p.Cnd_strg_site_cd.addAllListener(p);
		p.Cnd_strg_site_nm.setListListener(p);
		p.Cnd_strg_site_nm.addAllListener(p);
		p.Cnd_strg_wg_cd.setListListener(p);
		p.Cnd_strg_wg_cd.addAllListener(p);
		p.Cnd_strg_wg_nm.setListListener(p);
		p.Cnd_strg_wg_nm.addAllListener(p);
		p.Cnd_strg_lg_grp_cd.setListListener(p);
		p.Cnd_strg_lg_grp_cd.addAllListener(p);
		p.Cnd_strg_lg_grp_nm.setListListener(p);
		p.Cnd_strg_lg_grp_nm.addAllListener(p);
		p.Cnd_strg_loc_cd.setListListener(p);
		p.Cnd_strg_loc_cd.addAllListener(p);
		p.Cnd_strg_loc_nm.setListListener(p);
		p.Cnd_strg_loc_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_shortage_flg.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBEP_OPStkRpl p) {
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MSBEP_OPStkRpl p) {
		p.LPnl_master_dt.setListListener(p);
		p.LPnl_master_dt.addAllListener(p);
		p.LPnl_st_schd_dt.setListListener(p);
		p.LPnl_st_schd_dt.addAllListener(p);
		p.LPnl_end_schd_dt.setListListener(p);
		p.LPnl_end_schd_dt.addAllListener(p);
		p.LPnl_show_sno_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_OPStkRpl p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_OPStkRpl p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_asset_mng_typ.addAllListener(p);
		p.columnRslt_asset_mng_typ.setListListener(p);
		p.columnRslt_strg_loc_cd.addAllListener(p);
		p.columnRslt_strg_loc_cd.setListListener(p);
		p.columnRslt_strg_loc_nm.addAllListener(p);
		p.columnRslt_strg_loc_nm.setListListener(p);
		p.columnRslt_op_rpl_mtd_typ.addAllListener(p);
		p.columnRslt_op_rpl_mtd_typ.setListListener(p);
		p.columnRslt_op_rpl_mtd_typ_nm.addAllListener(p);
		p.columnRslt_op_rpl_mtd_typ_nm.setListListener(p);
		p.columnRslt_mfg_loc_cd.addAllListener(p);
		p.columnRslt_mfg_loc_cd.setListListener(p);
		p.columnRslt_mfg_loc_nm.addAllListener(p);
		p.columnRslt_mfg_loc_nm.setListListener(p);
		p.columnRslt_mfg_loc_sppl_cd.addAllListener(p);
		p.columnRslt_mfg_loc_sppl_cd.setListListener(p);
		p.columnRslt_bom_ptn.addAllListener(p);
		p.columnRslt_bom_ptn.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_maker_cd.addAllListener(p);
		p.columnRslt_maker_cd.setListListener(p);
		p.columnRslt_maker_nm.addAllListener(p);
		p.columnRslt_maker_nm.setListListener(p);
		p.columnRslt_rqst_loc_cd.addAllListener(p);
		p.columnRslt_rqst_loc_cd.setListListener(p);
		p.columnRslt_rqst_loc_nm.addAllListener(p);
		p.columnRslt_rqst_loc_nm.setListListener(p);
		p.columnRslt_rqst_str_ln_tgt_flg.addAllListener(p);
		p.columnRslt_gi_schd_flg.addAllListener(p);
		p.columnRslt_unit_cd.addAllListener(p);
		p.columnRslt_unit_cd.setListListener(p);
		p.columnRslt_unit_nm.addAllListener(p);
		p.columnRslt_unit_nm.setListListener(p);
		p.columnRslt_dec_place.addAllListener(p);
		p.columnRslt_dec_place.setListListener(p);
		p.columnRslt_st_schd_dt.addAllListener(p);
		p.columnRslt_st_schd_dt.setListListener(p);
		p.columnRslt_end_schd_dt.addAllListener(p);
		p.columnRslt_end_schd_dt.setListListener(p);
		p.columnRslt_ver_flg.addAllListener(p);
		p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_sno1_mng_typ.addAllListener(p);
		p.columnRslt_sno1_mng_typ.setListListener(p);
		p.columnRslt_sno2_mng_typ.addAllListener(p);
		p.columnRslt_sno2_mng_typ.setListListener(p);
		p.columnRslt_sno3_mng_typ.addAllListener(p);
		p.columnRslt_sno3_mng_typ.setListListener(p);
		p.columnRslt_sno4_mng_typ.addAllListener(p);
		p.columnRslt_sno4_mng_typ.setListListener(p);
		p.columnRslt_inst_po_cnt_rmrks.addAllListener(p);
		p.columnRslt_inst_po_cnt_rmrks.setListListener(p);
		p.columnRslt_cont_fctr_flg.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.setListListener(p);
		p.columnRslt_strg_site_cd.addAllListener(p);
		p.columnRslt_strg_site_cd.setListListener(p);
		p.columnRslt_strg_site_nm.addAllListener(p);
		p.columnRslt_strg_site_nm.setListListener(p);
		p.columnRslt_strg_lg_grp_cd.addAllListener(p);
		p.columnRslt_strg_lg_grp_cd.setListListener(p);
		p.columnRslt_strg_lg_grp_nm.addAllListener(p);
		p.columnRslt_strg_lg_grp_nm.setListListener(p);
		p.columnRslt_strg_wg_cd.addAllListener(p);
		p.columnRslt_strg_wg_cd.setListListener(p);
		p.columnRslt_strg_wg_nm.addAllListener(p);
		p.columnRslt_strg_wg_nm.setListListener(p);
		p.columnRslt_rqst_wg_cd.addAllListener(p);
		p.columnRslt_rqst_wg_cd.setListListener(p);
		p.columnRslt_rqst_wg_nm.addAllListener(p);
		p.columnRslt_rqst_wg_nm.setListListener(p);
		p.columnRslt_shortage_flg.addAllListener(p);
		p.columnRslt_master_dt.addAllListener(p);
		p.columnRslt_master_dt.setListListener(p);
		p.columnRslt_strg_sppl_cd.addAllListener(p);
		p.columnRslt_strg_sppl_cd.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_OPStkRpl p) {
		p.Btn_open_MSBEP0010.addAllListener(p);
		p.Btn_open_MSBEP0010.setAPMethodName("doBtn_open_MSBEP0010");
		p.Btn_open_MSBEP0060.addAllListener(p);
		p.Btn_open_MSBEP0060.setAPMethodName("doBtn_open_MSBEP0060");
		p.Btn_open_dtl.addAllListener(p);
		p.Btn_open_dtl.setAPMethodName("doBtn_open_dtl");
		p.Btn_sprt_due_dt.addAllListener(p);
		p.Btn_sprt_due_dt.setAPMethodName("doBtn_sprt_due_dt");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBEP_OPStkRpl p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBEP_OPStkRpl p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBEP_OPStkRpl p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBEP_OPStkRpl p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_OPStkRpl p){
		p.Cnd_master_dt.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gr_schd_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_strg_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_strg_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_shortage_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBEP_OPStkRpl p){

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MSBEP_OPStkRpl p){
		p.LPnl_master_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.LPnl_st_schd_dt.putMode(p, SRCH, MCMode.ENABLE);
		p.LPnl_end_schd_dt.putMode(p, SRCH, MCMode.ENABLE);
		p.LPnl_show_sno_flg.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBEP_OPStkRpl p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBEP_OPStkRpl p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_op_rpl_mtd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_op_rpl_mtd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rqst_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Rslt_gr_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_stk_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_gi_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_gi_schd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rord_stk_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_shortage_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_rord_rqst_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_rqst_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_st_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_end_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_gr_schd_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_stk_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_gi_schd_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_shortage_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_strg_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_strg_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_strg_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_shortage_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_master_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_strg_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_OPStkRpl p){
		p.Btn_open_MSBEP0010.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBEP0060.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_dtl.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_sprt_due_dt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBEP_OPStkRpl p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBEP_OPStkRpl p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBEP_OPStkRpl p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBEP_OPStkRpl p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_OPStkRpl p){
		p.Cnd_master_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_gr_schd_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_shortage_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBEP_OPStkRpl p){

	}

	/**
	 * [UPD]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LPnl(MSBEP_OPStkRpl p){
		p.LPnl_master_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.LPnl_st_schd_dt.putMode(p, UPD, MCMode.ENABLE);
		p.LPnl_end_schd_dt.putMode(p, UPD, MCMode.ENABLE);
		p.LPnl_show_sno_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBEP_OPStkRpl p){

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBEP_OPStkRpl p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_strg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_op_rpl_mtd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_op_rpl_mtd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_mfg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_bom_ptn.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_sppl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_rqst_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_rqst_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.Rslt_gr_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_stk_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_gi_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_gi_schd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_rord_stk_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_shortage_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_rord_rqst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_rqst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_st_schd_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_end_schd_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnRslt_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_gr_schd_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_stk_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_gi_schd_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_shortage_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_strg_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_strg_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_strg_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_rqst_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_shortage_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_master_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_strg_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_OPStkRpl p){
		p.Btn_open_MSBEP0010.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBEP0060.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_dtl.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_sprt_due_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

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
		MSBEP_OPStkRpl_MC.setTableConfigRslt((MSBEP_OPStkRpl)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_OPStkRpl p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_asset_mng_typ.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.asset_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asset_mng_typ);
		p.columnRslt_strg_loc_cd.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.strg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_cd);
		p.columnRslt_strg_loc_nm.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.strg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_nm);
		p.columnRslt_op_rpl_mtd_typ.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.op_rpl_mtd_typ_META);
		p.columnRslt_op_rpl_mtd_typ.addLinkBeans(p.columnRslt_op_rpl_mtd_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_op_rpl_mtd_typ);
		p.columnRslt_op_rpl_mtd_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.op_rpl_mtd_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_op_rpl_mtd_typ_nm);
		p.columnRslt_mfg_loc_cd.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.mfg_loc_cd_META);
		p.columnRslt_mfg_loc_cd.addLinkBeans(p.columnRslt_mfg_loc_nm,p.columnRslt_mfg_loc_sppl_cd);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_cd);
		p.columnRslt_mfg_loc_nm.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.mfg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_nm);
		p.columnRslt_mfg_loc_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.mfg_loc_sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_sppl_cd);
		p.columnRslt_bom_ptn.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.bom_ptn_META);
		p.columnRslt_bom_ptn.addLinkBeans(p.columnRslt_rqst_wg_cd,p.columnRslt_rqst_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_bom_ptn);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.sppl_cd_META);
		p.columnRslt_sppl_cd.addLinkBeans(p.columnRslt_sppl_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_maker_cd.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.maker_cd_META);
		p.columnRslt_maker_cd.addLinkBeans(p.columnRslt_maker_nm,p.columnRslt_rqst_wg_cd,p.columnRslt_rqst_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_cd);
		p.columnRslt_maker_nm.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.maker_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_nm);
		p.columnRslt_rqst_loc_cd.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.rqst_loc_cd_META);
		p.columnRslt_rqst_loc_cd.setListType(MCListType.STRICT);
		p.columnRslt_rqst_loc_cd.addLinkBeans(p.columnRslt_rqst_loc_nm,p.columnRslt_rqst_str_ln_tgt_flg,p.columnRslt_rqst_wg_cd,p.columnRslt_rqst_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_loc_cd);
		p.columnRslt_rqst_loc_nm.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.rqst_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_loc_nm);
		p.columnRslt_rqst_str_ln_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.rqst_str_ln_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_str_ln_tgt_flg);
		p.RsltTable.addTable(p.Rslt_str_ln_p_PPanel.StrLnTable);
		p.RsltTable.addTable(p.Rslt_gr_schd_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_stk_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_gi_schd_qty_p_PPanel.QtyTable);
		p.columnRslt_gi_schd_flg.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.gi_schd_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_schd_flg);
		p.RsltTable.addTable(p.Rslt_rord_stk_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_shortage_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_rord_rqst_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_rqst_qty_p_PPanel.QtyTable);
		p.columnRslt_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_cd);
		p.columnRslt_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_nm);
		p.columnRslt_dec_place.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.columnRslt_st_schd_dt.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.st_schd_dt_META);
		p.columnRslt_st_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_st_schd_dt);
		p.columnRslt_end_schd_dt.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.end_schd_dt_META);
		p.columnRslt_end_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_end_schd_dt);
		p.columnRslt_ver_flg.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.ver_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ver_flg);
		p.RsltTable.addTable(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.columnRslt_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.sno1_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1_mng_typ);
		p.columnRslt_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.sno2_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2_mng_typ);
		p.columnRslt_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.sno3_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3_mng_typ);
		p.columnRslt_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.sno4_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4_mng_typ);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_inst_po_cnt_rmrks.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.inst_po_cnt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_po_cnt_rmrks);
		p.columnRslt_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.cont_fctr_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_flg);
		p.RsltTable.addTable(p.Rslt_gr_schd_cont_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_stk_cont_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_gi_schd_cont_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_shortage_cont_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.RsltTable.addTable(p.Rslt_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.columnRslt_cont_fctr_dec_place.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.cont_fctr_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_dec_place);
		p.columnRslt_strg_site_cd.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.strg_site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_site_cd);
		p.columnRslt_strg_site_nm.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.strg_site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_site_nm);
		p.columnRslt_strg_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.strg_lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_lg_grp_cd);
		p.columnRslt_strg_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.strg_lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_lg_grp_nm);
		p.columnRslt_strg_wg_cd.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.strg_wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_wg_cd);
		p.columnRslt_strg_wg_nm.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.strg_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_wg_nm);
		p.columnRslt_rqst_wg_cd.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.rqst_wg_cd_META);
		p.columnRslt_rqst_wg_cd.addLinkBeans(p.columnRslt_rqst_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_wg_cd);
		p.columnRslt_rqst_wg_nm.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.rqst_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_wg_nm);
		p.columnRslt_shortage_flg.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.shortage_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_shortage_flg);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_master_dt.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.master_dt_META);
		p.columnRslt_master_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_master_dt);
		p.columnRslt_strg_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP0170.RsltR.strg_sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_sppl_cd);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_strg_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_strg_site_cd.getListConfig().setPutter(getCnd_strg_site_cd_ListPutter());
		Cnd_strg_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_strg_wg_cd.getListConfig().setPutter(getCnd_strg_wg_cd_ListPutter());
		Cnd_strg_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_strg_lg_grp_cd.getListConfig().setPutter(getCnd_strg_lg_grp_cd_ListPutter());
		Cnd_strg_loc_cd.getListConfig().setPutter(getCnd_strg_loc_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		columnRslt_op_rpl_mtd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_op_rpl_mtd_typ.getListConfig().setPutter(getRslt_op_rpl_mtd_typ_ListPutter());
		columnRslt_mfg_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_mfg_loc_cd.getListConfig().setPutter(getRslt_mfg_loc_cd_ListPutter());
		columnRslt_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_bom_ptn.getListConfig().setPutter(getRslt_bom_ptn_ListPutter());
		columnRslt_sppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_sppl_cd.getListConfig().setPutter(getRslt_sppl_cd_ListPutter());
		columnRslt_maker_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_maker_cd.getListConfig().setPutter(getRslt_maker_cd_ListPutter());
		columnRslt_rqst_loc_cd.getListConfig().setPutter(getRslt_rqst_loc_cd_ListPutter());
		columnRslt_rqst_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_rqst_wg_cd.getListConfig().setPutter(getRslt_rqst_wg_cd_ListPutter());
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
	}

	/**
	 * [Cnd_strg_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_strg_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_strg_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_strg_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Cnd_strg_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_strg_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
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
	 * [Rslt_op_rpl_mtd_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_op_rpl_mtd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.OpRplMtdTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMfgLoc");
		return lp;
	}
	 
	/**
	 * [Rslt_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createRslt_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlBomPtn");
		return lp;
	}
	 
	/**
	 * [Rslt_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlSppl");
		return lp;
	}
	 
	/**
	 * [Rslt_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMaker");
		return lp;
	}
	 
	/**
	 * [Rslt_rqst_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_rqst_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Rslt_rqst_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_rqst_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_strg_site_cd) return getCnd_strg_site_cd(row, info);
		if(combo == Cnd_strg_wg_cd) return getCnd_strg_wg_cd(row, info);
		if(combo == Cnd_strg_lg_grp_cd) return getCnd_strg_lg_grp_cd(row, info);
		if(combo == Cnd_strg_loc_cd) return getCnd_strg_loc_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == columnRslt_op_rpl_mtd_typ) return getRslt_op_rpl_mtd_typ(row, info);
		if(combo == columnRslt_mfg_loc_cd) return getRslt_mfg_loc_cd(row, info);
		if(combo == columnRslt_bom_ptn) return getRslt_bom_ptn(row, info);
		if(combo == columnRslt_sppl_cd) return getRslt_sppl_cd(row, info);
		if(combo == columnRslt_maker_cd) return getRslt_maker_cd(row, info);
		if(combo == columnRslt_rqst_loc_cd) return getRslt_rqst_loc_cd(row, info);
		if(combo == Rslt_ver_no_p_PPanel.columnVerNo_ver_no) return getRslt_ver_no_p_PPanel_columnVerNo_ver_no(row, info);
		if(combo == columnRslt_rqst_wg_cd) return getRslt_rqst_wg_cd(row, info);
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
		else if (ap == Btn_open_MSBEP0010) doBtn_open_MSBEP0010(info);
		else if (ap == Btn_open_MSBEP0060) doBtn_open_MSBEP0060(info);
		else if (ap == Btn_open_dtl) doBtn_open_dtl(info);
		else if (ap == Btn_sprt_due_dt) doBtn_sprt_due_dt(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0010]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0010(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0060]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0060(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_dtl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_dtl(MCEventInfo info);

	/**
	 * [Btn]パネルの[sprt_due_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt_due_dt(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

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
		if (vc == Cnd_master_dt) return doCnd_master_dt_VC(info);
		if (vc == Cnd_gr_schd_dt_to) return doCnd_gr_schd_dt_to_VC(info);
		if (vc == Cnd_gi_schd_dt_to) return doCnd_gi_schd_dt_to_VC(info);
		if (vc == Cnd_strg_site_cd) return doCnd_strg_site_cd_VC(info);
		if (vc == Cnd_strg_site_nm) return doCnd_strg_site_nm_VC(info);
		if (vc == Cnd_strg_wg_cd) return doCnd_strg_wg_cd_VC(info);
		if (vc == Cnd_strg_wg_nm) return doCnd_strg_wg_nm_VC(info);
		if (vc == Cnd_strg_lg_grp_cd) return doCnd_strg_lg_grp_cd_VC(info);
		if (vc == Cnd_strg_lg_grp_nm) return doCnd_strg_lg_grp_nm_VC(info);
		if (vc == Cnd_strg_loc_cd) return doCnd_strg_loc_cd_VC(info);
		if (vc == Cnd_strg_loc_nm) return doCnd_strg_loc_nm_VC(info);
		if (vc == Cnd_shortage_flg) return doCnd_shortage_flg_VC(info);
		if (vc == LPnl_master_dt) return doLPnl_master_dt_VC(info);
		if (vc == LPnl_st_schd_dt) return doLPnl_st_schd_dt_VC(info);
		if (vc == LPnl_end_schd_dt) return doLPnl_end_schd_dt_VC(info);
		if (vc == LPnl_show_sno_flg) return doLPnl_show_sno_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_asset_mng_typ) return doRslt_asset_mng_typ_VC(info);
		if (vc == columnRslt_strg_loc_cd) return doRslt_strg_loc_cd_VC(info);
		if (vc == columnRslt_strg_loc_nm) return doRslt_strg_loc_nm_VC(info);
		if (vc == columnRslt_op_rpl_mtd_typ) return doRslt_op_rpl_mtd_typ_VC(info);
		if (vc == columnRslt_op_rpl_mtd_typ_nm) return doRslt_op_rpl_mtd_typ_nm_VC(info);
		if (vc == columnRslt_mfg_loc_cd) return doRslt_mfg_loc_cd_VC(info);
		if (vc == columnRslt_mfg_loc_nm) return doRslt_mfg_loc_nm_VC(info);
		if (vc == columnRslt_mfg_loc_sppl_cd) return doRslt_mfg_loc_sppl_cd_VC(info);
		if (vc == columnRslt_bom_ptn) return doRslt_bom_ptn_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_maker_cd) return doRslt_maker_cd_VC(info);
		if (vc == columnRslt_maker_nm) return doRslt_maker_nm_VC(info);
		if (vc == columnRslt_rqst_loc_cd) return doRslt_rqst_loc_cd_VC(info);
		if (vc == columnRslt_rqst_loc_nm) return doRslt_rqst_loc_nm_VC(info);
		if (vc == columnRslt_rqst_str_ln_tgt_flg) return doRslt_rqst_str_ln_tgt_flg_VC(info);
		if (vc == columnRslt_gi_schd_flg) return doRslt_gi_schd_flg_VC(info);
		if (vc == columnRslt_unit_cd) return doRslt_unit_cd_VC(info);
		if (vc == columnRslt_unit_nm) return doRslt_unit_nm_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_st_schd_dt) return doRslt_st_schd_dt_VC(info);
		if (vc == columnRslt_end_schd_dt) return doRslt_end_schd_dt_VC(info);
		if (vc == columnRslt_ver_flg) return doRslt_ver_flg_VC(info);
		if (vc == columnRslt_sno1_mng_typ) return doRslt_sno1_mng_typ_VC(info);
		if (vc == columnRslt_sno2_mng_typ) return doRslt_sno2_mng_typ_VC(info);
		if (vc == columnRslt_sno3_mng_typ) return doRslt_sno3_mng_typ_VC(info);
		if (vc == columnRslt_sno4_mng_typ) return doRslt_sno4_mng_typ_VC(info);
		if (vc == columnRslt_inst_po_cnt_rmrks) return doRslt_inst_po_cnt_rmrks_VC(info);
		if (vc == columnRslt_cont_fctr_flg) return doRslt_cont_fctr_flg_VC(info);
		if (vc == columnRslt_cont_fctr_dec_place) return doRslt_cont_fctr_dec_place_VC(info);
		if (vc == columnRslt_strg_site_cd) return doRslt_strg_site_cd_VC(info);
		if (vc == columnRslt_strg_site_nm) return doRslt_strg_site_nm_VC(info);
		if (vc == columnRslt_strg_lg_grp_cd) return doRslt_strg_lg_grp_cd_VC(info);
		if (vc == columnRslt_strg_lg_grp_nm) return doRslt_strg_lg_grp_nm_VC(info);
		if (vc == columnRslt_strg_wg_cd) return doRslt_strg_wg_cd_VC(info);
		if (vc == columnRslt_strg_wg_nm) return doRslt_strg_wg_nm_VC(info);
		if (vc == columnRslt_rqst_wg_cd) return doRslt_rqst_wg_cd_VC(info);
		if (vc == columnRslt_rqst_wg_nm) return doRslt_rqst_wg_nm_VC(info);
		if (vc == columnRslt_shortage_flg) return doRslt_shortage_flg_VC(info);
		if (vc == columnRslt_master_dt) return doRslt_master_dt_VC(info);
		if (vc == columnRslt_strg_sppl_cd) return doRslt_strg_sppl_cd_VC(info);
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
	 * [Cnd]パネルの[master_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_master_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_lg_grp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[shortage_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_shortage_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[master_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_master_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[st_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_st_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[end_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_end_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[show_sno_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_show_sno_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asset_mng_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[op_rpl_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_op_rpl_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[op_rpl_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_op_rpl_mtd_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_loc_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_sppl_cd_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_maker_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rqst_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_schd_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[st_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_st_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[end_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_end_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno4_mng_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[shortage_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_shortage_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_sppl_cd_VC(MCEventInfo info){
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
		else if (nc == Cnd_master_dt) doCnd_master_dt_NC(info);
		else if (nc == Cnd_gr_schd_dt_to) doCnd_gr_schd_dt_to_NC(info);
		else if (nc == Cnd_gi_schd_dt_to) doCnd_gi_schd_dt_to_NC(info);
		else if (nc == Cnd_strg_site_cd) doCnd_strg_site_cd_NC(info);
		else if (nc == Cnd_strg_site_nm) doCnd_strg_site_nm_NC(info);
		else if (nc == Cnd_strg_wg_cd) doCnd_strg_wg_cd_NC(info);
		else if (nc == Cnd_strg_wg_nm) doCnd_strg_wg_nm_NC(info);
		else if (nc == Cnd_strg_lg_grp_cd) doCnd_strg_lg_grp_cd_NC(info);
		else if (nc == Cnd_strg_lg_grp_nm) doCnd_strg_lg_grp_nm_NC(info);
		else if (nc == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NC(info);
		else if (nc == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NC(info);
		else if (nc == Cnd_shortage_flg) doCnd_shortage_flg_NC(info);
		else if (nc == LPnl_master_dt) doLPnl_master_dt_NC(info);
		else if (nc == LPnl_st_schd_dt) doLPnl_st_schd_dt_NC(info);
		else if (nc == LPnl_end_schd_dt) doLPnl_end_schd_dt_NC(info);
		else if (nc == LPnl_show_sno_flg) doLPnl_show_sno_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NC(info);
		else if (nc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NC(info);
		else if (nc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NC(info);
		else if (nc == columnRslt_op_rpl_mtd_typ) doRslt_op_rpl_mtd_typ_NC(info);
		else if (nc == columnRslt_op_rpl_mtd_typ_nm) doRslt_op_rpl_mtd_typ_nm_NC(info);
		else if (nc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NC(info);
		else if (nc == columnRslt_mfg_loc_sppl_cd) doRslt_mfg_loc_sppl_cd_NC(info);
		else if (nc == columnRslt_bom_ptn) doRslt_bom_ptn_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_maker_cd) doRslt_maker_cd_NC(info);
		else if (nc == columnRslt_maker_nm) doRslt_maker_nm_NC(info);
		else if (nc == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NC(info);
		else if (nc == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NC(info);
		else if (nc == columnRslt_rqst_str_ln_tgt_flg) doRslt_rqst_str_ln_tgt_flg_NC(info);
		else if (nc == columnRslt_gi_schd_flg) doRslt_gi_schd_flg_NC(info);
		else if (nc == columnRslt_unit_cd) doRslt_unit_cd_NC(info);
		else if (nc == columnRslt_unit_nm) doRslt_unit_nm_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_st_schd_dt) doRslt_st_schd_dt_NC(info);
		else if (nc == columnRslt_end_schd_dt) doRslt_end_schd_dt_NC(info);
		else if (nc == columnRslt_ver_flg) doRslt_ver_flg_NC(info);
		else if (nc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NC(info);
		else if (nc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NC(info);
		else if (nc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NC(info);
		else if (nc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NC(info);
		else if (nc == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_NC(info);
		else if (nc == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NC(info);
		else if (nc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NC(info);
		else if (nc == columnRslt_strg_site_cd) doRslt_strg_site_cd_NC(info);
		else if (nc == columnRslt_strg_site_nm) doRslt_strg_site_nm_NC(info);
		else if (nc == columnRslt_strg_lg_grp_cd) doRslt_strg_lg_grp_cd_NC(info);
		else if (nc == columnRslt_strg_lg_grp_nm) doRslt_strg_lg_grp_nm_NC(info);
		else if (nc == columnRslt_strg_wg_cd) doRslt_strg_wg_cd_NC(info);
		else if (nc == columnRslt_strg_wg_nm) doRslt_strg_wg_nm_NC(info);
		else if (nc == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_NC(info);
		else if (nc == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_NC(info);
		else if (nc == columnRslt_shortage_flg) doRslt_shortage_flg_NC(info);
		else if (nc == columnRslt_master_dt) doRslt_master_dt_NC(info);
		else if (nc == columnRslt_strg_sppl_cd) doRslt_strg_sppl_cd_NC(info);
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
	 * [Cnd]パネルの[master_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[shortage_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_shortage_flg_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[master_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_master_dt_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[st_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_st_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[end_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_end_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[show_sno_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_show_sno_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[op_rpl_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_op_rpl_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[op_rpl_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_op_rpl_mtd_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_loc_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[rqst_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_schd_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[st_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[shortage_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_shortage_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_sppl_cd_NC(MCEventInfo info){
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
		else if (ne == Cnd_master_dt) doCnd_master_dt_NE(info);
		else if (ne == Cnd_gr_schd_dt_to) doCnd_gr_schd_dt_to_NE(info);
		else if (ne == Cnd_gi_schd_dt_to) doCnd_gi_schd_dt_to_NE(info);
		else if (ne == Cnd_strg_site_cd) doCnd_strg_site_cd_NE(info);
		else if (ne == Cnd_strg_site_nm) doCnd_strg_site_nm_NE(info);
		else if (ne == Cnd_strg_wg_cd) doCnd_strg_wg_cd_NE(info);
		else if (ne == Cnd_strg_wg_nm) doCnd_strg_wg_nm_NE(info);
		else if (ne == Cnd_strg_lg_grp_cd) doCnd_strg_lg_grp_cd_NE(info);
		else if (ne == Cnd_strg_lg_grp_nm) doCnd_strg_lg_grp_nm_NE(info);
		else if (ne == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NE(info);
		else if (ne == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NE(info);
		else if (ne == Cnd_shortage_flg) doCnd_shortage_flg_NE(info);
		else if (ne == LPnl_master_dt) doLPnl_master_dt_NE(info);
		else if (ne == LPnl_st_schd_dt) doLPnl_st_schd_dt_NE(info);
		else if (ne == LPnl_end_schd_dt) doLPnl_end_schd_dt_NE(info);
		else if (ne == LPnl_show_sno_flg) doLPnl_show_sno_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NE(info);
		else if (ne == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NE(info);
		else if (ne == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NE(info);
		else if (ne == columnRslt_op_rpl_mtd_typ) doRslt_op_rpl_mtd_typ_NE(info);
		else if (ne == columnRslt_op_rpl_mtd_typ_nm) doRslt_op_rpl_mtd_typ_nm_NE(info);
		else if (ne == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NE(info);
		else if (ne == columnRslt_mfg_loc_sppl_cd) doRslt_mfg_loc_sppl_cd_NE(info);
		else if (ne == columnRslt_bom_ptn) doRslt_bom_ptn_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_maker_cd) doRslt_maker_cd_NE(info);
		else if (ne == columnRslt_maker_nm) doRslt_maker_nm_NE(info);
		else if (ne == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NE(info);
		else if (ne == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NE(info);
		else if (ne == columnRslt_rqst_str_ln_tgt_flg) doRslt_rqst_str_ln_tgt_flg_NE(info);
		else if (ne == columnRslt_gi_schd_flg) doRslt_gi_schd_flg_NE(info);
		else if (ne == columnRslt_unit_cd) doRslt_unit_cd_NE(info);
		else if (ne == columnRslt_unit_nm) doRslt_unit_nm_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_st_schd_dt) doRslt_st_schd_dt_NE(info);
		else if (ne == columnRslt_end_schd_dt) doRslt_end_schd_dt_NE(info);
		else if (ne == columnRslt_ver_flg) doRslt_ver_flg_NE(info);
		else if (ne == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NE(info);
		else if (ne == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NE(info);
		else if (ne == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NE(info);
		else if (ne == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NE(info);
		else if (ne == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_NE(info);
		else if (ne == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NE(info);
		else if (ne == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NE(info);
		else if (ne == columnRslt_strg_site_cd) doRslt_strg_site_cd_NE(info);
		else if (ne == columnRslt_strg_site_nm) doRslt_strg_site_nm_NE(info);
		else if (ne == columnRslt_strg_lg_grp_cd) doRslt_strg_lg_grp_cd_NE(info);
		else if (ne == columnRslt_strg_lg_grp_nm) doRslt_strg_lg_grp_nm_NE(info);
		else if (ne == columnRslt_strg_wg_cd) doRslt_strg_wg_cd_NE(info);
		else if (ne == columnRslt_strg_wg_nm) doRslt_strg_wg_nm_NE(info);
		else if (ne == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_NE(info);
		else if (ne == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_NE(info);
		else if (ne == columnRslt_shortage_flg) doRslt_shortage_flg_NE(info);
		else if (ne == columnRslt_master_dt) doRslt_master_dt_NE(info);
		else if (ne == columnRslt_strg_sppl_cd) doRslt_strg_sppl_cd_NE(info);
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
	 * [Cnd]パネルの[master_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[shortage_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_shortage_flg_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[master_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_master_dt_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[st_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_st_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[end_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_end_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[show_sno_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_show_sno_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[op_rpl_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_op_rpl_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[op_rpl_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_op_rpl_mtd_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_loc_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[rqst_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_schd_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[st_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[shortage_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_shortage_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_sppl_cd_NE(MCEventInfo info){
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
		else if (nx == Cnd_master_dt) doCnd_master_dt_NX(info);
		else if (nx == Cnd_gr_schd_dt_to) doCnd_gr_schd_dt_to_NX(info);
		else if (nx == Cnd_gi_schd_dt_to) doCnd_gi_schd_dt_to_NX(info);
		else if (nx == Cnd_strg_site_cd) doCnd_strg_site_cd_NX(info);
		else if (nx == Cnd_strg_site_nm) doCnd_strg_site_nm_NX(info);
		else if (nx == Cnd_strg_wg_cd) doCnd_strg_wg_cd_NX(info);
		else if (nx == Cnd_strg_wg_nm) doCnd_strg_wg_nm_NX(info);
		else if (nx == Cnd_strg_lg_grp_cd) doCnd_strg_lg_grp_cd_NX(info);
		else if (nx == Cnd_strg_lg_grp_nm) doCnd_strg_lg_grp_nm_NX(info);
		else if (nx == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NX(info);
		else if (nx == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NX(info);
		else if (nx == Cnd_shortage_flg) doCnd_shortage_flg_NX(info);
		else if (nx == LPnl_master_dt) doLPnl_master_dt_NX(info);
		else if (nx == LPnl_st_schd_dt) doLPnl_st_schd_dt_NX(info);
		else if (nx == LPnl_end_schd_dt) doLPnl_end_schd_dt_NX(info);
		else if (nx == LPnl_show_sno_flg) doLPnl_show_sno_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NX(info);
		else if (nx == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NX(info);
		else if (nx == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NX(info);
		else if (nx == columnRslt_op_rpl_mtd_typ) doRslt_op_rpl_mtd_typ_NX(info);
		else if (nx == columnRslt_op_rpl_mtd_typ_nm) doRslt_op_rpl_mtd_typ_nm_NX(info);
		else if (nx == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NX(info);
		else if (nx == columnRslt_mfg_loc_sppl_cd) doRslt_mfg_loc_sppl_cd_NX(info);
		else if (nx == columnRslt_bom_ptn) doRslt_bom_ptn_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_maker_cd) doRslt_maker_cd_NX(info);
		else if (nx == columnRslt_maker_nm) doRslt_maker_nm_NX(info);
		else if (nx == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NX(info);
		else if (nx == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NX(info);
		else if (nx == columnRslt_rqst_str_ln_tgt_flg) doRslt_rqst_str_ln_tgt_flg_NX(info);
		else if (nx == columnRslt_gi_schd_flg) doRslt_gi_schd_flg_NX(info);
		else if (nx == columnRslt_unit_cd) doRslt_unit_cd_NX(info);
		else if (nx == columnRslt_unit_nm) doRslt_unit_nm_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_st_schd_dt) doRslt_st_schd_dt_NX(info);
		else if (nx == columnRslt_end_schd_dt) doRslt_end_schd_dt_NX(info);
		else if (nx == columnRslt_ver_flg) doRslt_ver_flg_NX(info);
		else if (nx == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NX(info);
		else if (nx == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NX(info);
		else if (nx == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NX(info);
		else if (nx == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NX(info);
		else if (nx == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_NX(info);
		else if (nx == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NX(info);
		else if (nx == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NX(info);
		else if (nx == columnRslt_strg_site_cd) doRslt_strg_site_cd_NX(info);
		else if (nx == columnRslt_strg_site_nm) doRslt_strg_site_nm_NX(info);
		else if (nx == columnRslt_strg_lg_grp_cd) doRslt_strg_lg_grp_cd_NX(info);
		else if (nx == columnRslt_strg_lg_grp_nm) doRslt_strg_lg_grp_nm_NX(info);
		else if (nx == columnRslt_strg_wg_cd) doRslt_strg_wg_cd_NX(info);
		else if (nx == columnRslt_strg_wg_nm) doRslt_strg_wg_nm_NX(info);
		else if (nx == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_NX(info);
		else if (nx == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_NX(info);
		else if (nx == columnRslt_shortage_flg) doRslt_shortage_flg_NX(info);
		else if (nx == columnRslt_master_dt) doRslt_master_dt_NX(info);
		else if (nx == columnRslt_strg_sppl_cd) doRslt_strg_sppl_cd_NX(info);
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
	 * [Cnd]パネルの[master_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[shortage_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_shortage_flg_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[master_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_master_dt_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[st_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_st_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[end_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_end_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[show_sno_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_show_sno_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[op_rpl_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_op_rpl_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[op_rpl_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_op_rpl_mtd_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_loc_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[rqst_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_schd_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[st_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[shortage_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_shortage_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_master_dt) doCnd_master_dt_LC(info);
		else if (lc == Cnd_gr_schd_dt_to) doCnd_gr_schd_dt_to_LC(info);
		else if (lc == Cnd_gi_schd_dt_to) doCnd_gi_schd_dt_to_LC(info);
		else if (lc == Cnd_strg_site_cd) doCnd_strg_site_cd_LC(info);
		else if (lc == Cnd_strg_site_nm) doCnd_strg_site_nm_LC(info);
		else if (lc == Cnd_strg_wg_cd) doCnd_strg_wg_cd_LC(info);
		else if (lc == Cnd_strg_wg_nm) doCnd_strg_wg_nm_LC(info);
		else if (lc == Cnd_strg_lg_grp_cd) doCnd_strg_lg_grp_cd_LC(info);
		else if (lc == Cnd_strg_lg_grp_nm) doCnd_strg_lg_grp_nm_LC(info);
		else if (lc == Cnd_strg_loc_cd) doCnd_strg_loc_cd_LC(info);
		else if (lc == Cnd_strg_loc_nm) doCnd_strg_loc_nm_LC(info);
		else if (lc == LPnl_master_dt) doLPnl_master_dt_LC(info);
		else if (lc == LPnl_st_schd_dt) doLPnl_st_schd_dt_LC(info);
		else if (lc == LPnl_end_schd_dt) doLPnl_end_schd_dt_LC(info);
		else if (lc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_LC(info);
		else if (lc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_LC(info);
		else if (lc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_LC(info);
		else if (lc == columnRslt_op_rpl_mtd_typ) doRslt_op_rpl_mtd_typ_LC(info);
		else if (lc == columnRslt_op_rpl_mtd_typ_nm) doRslt_op_rpl_mtd_typ_nm_LC(info);
		else if (lc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_LC(info);
		else if (lc == columnRslt_mfg_loc_sppl_cd) doRslt_mfg_loc_sppl_cd_LC(info);
		else if (lc == columnRslt_bom_ptn) doRslt_bom_ptn_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_maker_cd) doRslt_maker_cd_LC(info);
		else if (lc == columnRslt_maker_nm) doRslt_maker_nm_LC(info);
		else if (lc == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_LC(info);
		else if (lc == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_LC(info);
		else if (lc == columnRslt_unit_cd) doRslt_unit_cd_LC(info);
		else if (lc == columnRslt_unit_nm) doRslt_unit_nm_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_st_schd_dt) doRslt_st_schd_dt_LC(info);
		else if (lc == columnRslt_end_schd_dt) doRslt_end_schd_dt_LC(info);
		else if (lc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_LC(info);
		else if (lc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_LC(info);
		else if (lc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_LC(info);
		else if (lc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_LC(info);
		else if (lc == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_LC(info);
		else if (lc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_LC(info);
		else if (lc == columnRslt_strg_site_cd) doRslt_strg_site_cd_LC(info);
		else if (lc == columnRslt_strg_site_nm) doRslt_strg_site_nm_LC(info);
		else if (lc == columnRslt_strg_lg_grp_cd) doRslt_strg_lg_grp_cd_LC(info);
		else if (lc == columnRslt_strg_lg_grp_nm) doRslt_strg_lg_grp_nm_LC(info);
		else if (lc == columnRslt_strg_wg_cd) doRslt_strg_wg_cd_LC(info);
		else if (lc == columnRslt_strg_wg_nm) doRslt_strg_wg_nm_LC(info);
		else if (lc == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_LC(info);
		else if (lc == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_LC(info);
		else if (lc == columnRslt_master_dt) doRslt_master_dt_LC(info);
		else if (lc == columnRslt_strg_sppl_cd) doRslt_strg_sppl_cd_LC(info);
	}

	/**
	 * [Cnd]パネルの[master_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_nm_LC(MCEventInfo info){
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
	 * [LPnl]パネルの[master_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_master_dt_LC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[st_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_st_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[end_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_end_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[op_rpl_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_op_rpl_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[op_rpl_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_op_rpl_mtd_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_loc_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[st_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_strg_site_cd]の作成メソッド
	 */
	public MCList getCnd_strg_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_strg_wg_cd]の作成メソッド
	 */
	public MCList getCnd_strg_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_strg_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_strg_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_strg_loc_cd]の作成メソッド
	 */
	public MCList getCnd_strg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
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
	 * コンボ／リストのリスト[columnRslt_op_rpl_mtd_typ]の作成メソッド
	 */
	public MCList getRslt_op_rpl_mtd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getOpRplMtdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_mfg_loc_cd]の作成メソッド
	 */
	public MCList getRslt_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMfgLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_bom_ptn]の作成メソッド
	 */
	public MCList getRslt_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlBomPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_sppl_cd]の作成メソッド
	 */
	public MCList getRslt_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlSppl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_maker_cd]の作成メソッド
	 */
	public MCList getRslt_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_rqst_loc_cd]の作成メソッド
	 */
	public MCList getRslt_rqst_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_ver_no_p_PPanel_columnVerNo_ver_no]の作成メソッド
	 */
	public MCList getRslt_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmVer(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_rqst_wg_cd]の作成メソッド
	 */
	public MCList getRslt_rqst_wg_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL0170.Srch01")) {
			return new MS_MSBEL0170_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL0170.Sprt01")) {
			return new MS_MSBEL0170_Sprt01Bridge();
		}
		if (id.equals("MS.MSBEL0170.Ins01")) {
			return new MS_MSBEL0170_Ins01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL0170_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0170_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0170_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL0170_Srch01Bridge() {
			p_MS_MSBEL0170_Srch01 = new MCParam(PDef.MS_MSBEL0170_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0170_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP0170.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0170.RsltR.class));

			p_MS_MSBEL0170_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0170_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0170_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0170_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0170_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP0170.CndR up0() {
			return (mcframe.clientMSBE.MSBEP0170.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP0170.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP0170.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL0170_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0170.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL0170_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP0170.RsltR>)p_MS_MSBEL0170_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL0170_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0170_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0170_Sprt01;

		/** コンストラクタ */
		protected MS_MSBEL0170_Sprt01Bridge() {
			p_MS_MSBEL0170_Sprt01 = new MCParam(PDef.MS_MSBEL0170_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0170_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP0170.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0170.RsltR.class));

			p_MS_MSBEL0170_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0170_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0170_Sprt01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0170_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0170_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP0170.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP0170.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP0170.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP0170.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL0170_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0170.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL0170_Sprt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP0170.RsltR>)p_MS_MSBEL0170_Sprt01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL0170_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0170_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0170_Ins01;

		/** コンストラクタ */
		protected MS_MSBEL0170_Ins01Bridge() {
			p_MS_MSBEL0170_Ins01 = new MCParam(PDef.MS_MSBEL0170_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0170_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP0170.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0170.RsltR.class));

			p_MS_MSBEL0170_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0170_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0170_Ins01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0170_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0170_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP0170.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP0170.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP0170.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP0170.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL0170_Ins01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0170.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL0170_Ins01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP0170.RsltR>)p_MS_MSBEL0170_Ins01.getContainerParam().getDownBlock(0));
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
}