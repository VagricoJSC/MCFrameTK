package mcframe.clientMGBD.MGBDP0540;

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
import mcframe.clientMGBD.MGBDP0540.MGBDP_BomExSrch_MC.MG_MGBDL0540_Srch01Caller;
import mcframe.clientMGBD.MGBDP0540.MGBDP_BomExSrch_MC.MG_MGBDL0540_Srch02Caller;

/**
 * 画面"MGBDP_BomExSrch"パネルクラスです。<p>
 *
 * 原価ＢＯＭ情報の検索を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_BomExSrch_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBDP0540";

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
	 * EX1,Explosion,1;EX2,Implosion,2 EX1,正展開,1;EX2,逆展開,2.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_EX1 = null;
	public MCRadioButton Cnd_ope_EX2 = null;
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
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term;	// [Cnd]の[term_p.term]を[Cnd_term]としてエイリアス定義。
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
	/**
	 * Item input assist search type 品目入力補助検索区分.<p>
	 *
	 */
	public MCTextField Cnd_itm_is_srch_typ = null;
	public MCLabel Cnd_bom_ptn_Label = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCTextComboBox Cnd_bom_ptn = null;
	/**
	 * Parent item 親品目.<p>
	 *
	 */
	public MCCheckBox Cnd_par_itm_flg = null;
	/**
	 * Child item 子品目.<p>
	 *
	 */
	public MCCheckBox Cnd_chd_itm_flg = null;
	/**
	 * Copy BOM pattern 構成パタン引継ぎ.<p>
	 *
	 */
	public MCCheckBox Cnd_bom_ptn_flg = null;
	public MCLabel Cnd_max_hrrchy_Label = null;
	/**
	 * Max. hierarchy 最大階層.<p>
	 *
	 */
	public MCNumberField Cnd_max_hrrchy = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RPnl]ブロック関連のField定義
	public MCPanel RPnlPanel = null;
	// [RPnl]ブロックの項目のField定義
	/**
	 * Explode all 全展開する.<p>
	 *
	 */
	public MCButton RPnl_srch_all = null;
	// [DtlPnl]ブロック関連のField定義
	public MCPanel DtlPnlPanel = null;
	// [DtlPnl]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0540.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D Dtl_hrrchy_p_PPanel;
	public MCColumnConfig columnDtl_ext;// [Dtl]の[hrrchy_p.ext]を[columnDtl_ext]としてエイリアス定義。
	public MCColumnConfig columnDtl_hrrchy_str;// [Dtl]の[hrrchy_p.hrrchy_str]を[columnDtl_hrrchy_str]としてエイリアス定義。
	public MCColumnConfig columnDtl_extno;// [Dtl]の[hrrchy_p.extno]を[columnDtl_extno]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_extno;// [Dtl]の[hrrchy_p.par_extno]を[columnDtl_par_extno]としてエイリアス定義。
	public MCColumnConfig columnDtl_loop_flg;// [Dtl]の[hrrchy_p.loop_flg]を[columnDtl_loop_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_leaf_str;// [Dtl]の[hrrchy_p.leaf_str]を[columnDtl_leaf_str]としてエイリアス定義。
	/**
	 * Bottom 最下位.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bottom_flg = null;
	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unreg_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_d_nm = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_jnl_nm = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_ptn = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_nm = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_par_rqmt_qty_p_PPanel;
	public MCColumnConfig columnDtl_par_rqmt_qty;// [Dtl]の[par_rqmt_qty_p.qty]を[columnDtl_par_rqmt_qty]としてエイリアス定義。
	/**
	 * Parent unit cd. 親単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_unit_cd = null;
	/**
	 * Parent unit name 親単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_unit_nm = null;
	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_chd_rqmt_qty_p_PPanel;
	public MCColumnConfig columnDtl_chd_rqmt_qty;// [Dtl]の[chd_rqmt_qty_p.qty]を[columnDtl_chd_rqmt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_chd_base_qty_p_PPanel;
	public MCColumnConfig columnDtl_chd_base_qty;// [Dtl]の[chd_base_qty_p.qty]を[columnDtl_chd_base_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_fxd_chd_rqmt_qty_p_PPanel;
	public MCColumnConfig columnDtl_fxd_chd_rqmt_qty;// [Dtl]の[fxd_chd_rqmt_qty_p.qty]を[columnDtl_fxd_chd_rqmt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_chd_min_qty_p_PPanel;
	public MCColumnConfig columnDtl_chd_min_qty;// [Dtl]の[chd_min_qty_p.qty]を[columnDtl_chd_min_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_chd_batch_qty_p_PPanel;
	public MCColumnConfig columnDtl_chd_batch_qty;// [Dtl]の[chd_batch_qty_p.qty]を[columnDtl_chd_batch_qty]としてエイリアス定義。
	/**
	 * Child unit cd. 子単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_unit_cd = null;
	/**
	 * Child unit name 子単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_unit_nm = null;
	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_dec_place = null;
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_grp_cd = null;
	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_itm_ratio = null;
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_expns_cd = null;
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_expns_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_upper_itm_p_PPanel;
	public MCColumnConfig columnDtl_upper_itm_cd;// [Dtl]の[upper_itm_p.itm_cd]を[columnDtl_upper_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_upper_itm_sub1;// [Dtl]の[upper_itm_p.itm_sub1]を[columnDtl_upper_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_upper_itm_sub2;// [Dtl]の[upper_itm_p.itm_sub2]を[columnDtl_upper_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_upper_itm_sub3;// [Dtl]の[upper_itm_p.itm_sub3]を[columnDtl_upper_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_upper_itm_nm;// [Dtl]の[upper_itm_p.itm_nm]を[columnDtl_upper_itm_nm]としてエイリアス定義。
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_nm = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_ctg_nm = null;
	/**
	 * Item calculation category cd. 品目計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_calc_ctg_cd = null;
	/**
	 * Item calculation category name 品目計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_calc_ctg_nm = null;
	/**
	 * Details calculation category cd. 詳細計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dtl_calc_ctg_cd = null;
	/**
	 * Details calculation category name 詳細計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dtl_calc_ctg_nm = null;
	/**
	 * Purchase calculation category cd. 購買計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_calc_ctg_cd = null;
	/**
	 * Purchase calculation category name 購買計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_calc_ctg_nm = null;
	/**
	 * Subcontracting calculation category cd. 加工計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_proc_calc_ctg_cd = null;
	/**
	 * Subcontracting calculation category name 加工計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_proc_calc_ctg_nm = null;
	/**
	 * Supply calculation category cd. 支給計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_calc_ctg_cd = null;
	/**
	 * Supply calculation category name 支給計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_calc_ctg_nm = null;
	/**
	 * Sales calculation category cd. 販売計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_calc_ctg_cd = null;
	/**
	 * Sales calculation category name 販売計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_calc_ctg_nm = null;
	/**
	 * Limit unit price calculation category cd. 指値計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix_calc_ctg_cd = null;
	/**
	 * Limit unit price calculation category name 指値計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix_calc_ctg_nm = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Search (Breakdown of details) 検索する（詳細）.<p>
	 *
	 */
	public MCButton Btn_srch_dtl = null;
	/**
	 * Cost BOM (Explosion) 原価ＢＯＭ一覧照会（展開）.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0540_ex1 = null;
	/**
	 * Cost BOM (Explosion) 原価ＢＯＭ一覧照会（展開）.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0540_ex2 = null;
	/**
	 * Cost BOM entry 原価ＢＯＭ登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0520 = null;
	/**
	 * Cost BOM list entry 原価ＢＯＭ一覧登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0530 = null;
	/**
	 * Cost BOM list entry 原価ＢＯＭ一覧登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0530_chd = null;
	// [Bottom]ブロック関連のField定義
	public MCPanel BottomPanel = null;
	public MCTabbedPane BottomTab = null;
	// [Bottom]ブロックの項目のField定義
	// [Itm]ブロック関連のField定義
	public MCPanel ItmPanel = null;
	public MCScrollPane ItmScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0540.ItmR> ItmTable = null;
	// [Itm]ブロックの項目のField定義
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItm_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnItm_calc_ctg_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItm_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnItm_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Itm_itm_p_PPanel;
	public MCColumnConfig columnItm_itm_cd;// [Itm]の[itm_p.itm_cd]を[columnItm_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnItm_itm_sub1;// [Itm]の[itm_p.itm_sub1]を[columnItm_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnItm_itm_sub2;// [Itm]の[itm_p.itm_sub2]を[columnItm_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnItm_itm_sub3;// [Itm]の[itm_p.itm_sub3]を[columnItm_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnItm_itm_nm;// [Itm]の[itm_p.itm_nm]を[columnItm_itm_nm]としてエイリアス定義。
	/**
	 * Calculation pattern cd. 計算パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItm_calc_ptn_cd = null;
	/**
	 * Calculation pattern name 計算パタン名.<p>
	 *
	 */
	public MCColumnConfig columnItm_calc_ptn_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Itm_qty_p_PPanel;
	public MCColumnConfig columnItm_std_qty;// [Itm]の[qty_p.qty]を[columnItm_std_qty]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItm_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnItm_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItm_dec_place = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnItm_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnItm_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnItm_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnItm_sub_char3 = null;
	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public MCColumnConfig columnItm_non_calc_flg = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItm_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItm_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItm_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnItm_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnItm_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItm_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItm_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItm_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnItm_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnItm_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnItm_upd_srv_req_no = null;
	// [ItmDtl]ブロック関連のField定義
	public MCPanel ItmDtlPanel = null;
	public MCScrollPane ItmDtlScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0540.ItmDtlR> ItmDtlTable = null;
	// [ItmDtl]ブロックの項目のField定義
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_calc_ctg_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ItmDtl_itm_p_PPanel;
	public MCColumnConfig columnItmDtl_itm_cd;// [ItmDtl]の[itm_p.itm_cd]を[columnItmDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnItmDtl_itm_sub1;// [ItmDtl]の[itm_p.itm_sub1]を[columnItmDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnItmDtl_itm_sub2;// [ItmDtl]の[itm_p.itm_sub2]を[columnItmDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnItmDtl_itm_sub3;// [ItmDtl]の[itm_p.itm_sub3]を[columnItmDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnItmDtl_itm_nm;// [ItmDtl]の[itm_p.itm_nm]を[columnItmDtl_itm_nm]としてエイリアス定義。
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_loc_nm = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_sppl_nm = null;
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_rqst_wg_cd = null;
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_rqst_wg_nm = null;
	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_cost_ratio = null;
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_oper_ptn = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_bom_ptn = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ItmDtl_min_lot_qty_p_PPanel;
	public MCColumnConfig columnItmDtl_min_lot_qty;// [ItmDtl]の[min_lot_qty_p.qty]を[columnItmDtl_min_lot_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ItmDtl_batch_lot_qty_p_PPanel;
	public MCColumnConfig columnItmDtl_batch_lot_qty;// [ItmDtl]の[batch_lot_qty_p.qty]を[columnItmDtl_batch_lot_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ItmDtl_fxd_lot_qty_p_PPanel;
	public MCColumnConfig columnItmDtl_fxd_lot_qty;// [ItmDtl]の[fxd_lot_qty_p.qty]を[columnItmDtl_fxd_lot_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ItmDtl_fxd_yield_qty_p_PPanel;
	public MCColumnConfig columnItmDtl_fxd_yield_qty;// [ItmDtl]の[fxd_yield_qty_p.qty]を[columnItmDtl_fxd_yield_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ItmDtl_nmr_qty_p_PPanel;
	public MCColumnConfig columnItmDtl_nmr_qty;// [ItmDtl]の[nmr_qty_p.qty]を[columnItmDtl_nmr_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ItmDtl_dnm_qty_p_PPanel;
	public MCColumnConfig columnItmDtl_dnm_qty;// [ItmDtl]の[dnm_qty_p.qty]を[columnItmDtl_dnm_qty]としてエイリアス定義。
	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_alc_dpt_cd = null;
	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_alc_dpt_nm = null;
	/**
	 * Exploded dept. cd. 展開部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_exp_dpt_cd = null;
	/**
	 * Exploded dept. name 展開部門名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_exp_dpt_nm = null;
	/**
	 * Explosion priority 展開優先順位.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_exp_prio = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ItmDtl_max_qty_p_PPanel;
	public MCColumnConfig columnItmDtl_max_qty;// [ItmDtl]の[max_qty_p.qty]を[columnItmDtl_max_qty]としてエイリアス定義。
	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_alc_val1 = null;
	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_alc_val2 = null;
	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_alc_val3 = null;
	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_alc_val4 = null;
	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_alc_val5 = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_sub_char3 = null;
	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_non_calc_flg = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upd_srv_req_no = null;
	// [ItmOper]ブロック関連のField定義
	public MCPanel ItmOperPanel = null;
	public MCScrollPane ItmOperScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0540.ItmOperR> ItmOperTable = null;
	// [ItmOper]ブロックの項目のField定義
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_calc_ctg_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ItmOper_itm_p_PPanel;
	public MCColumnConfig columnItmOper_itm_cd;// [ItmOper]の[itm_p.itm_cd]を[columnItmOper_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnItmOper_itm_sub1;// [ItmOper]の[itm_p.itm_sub1]を[columnItmOper_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnItmOper_itm_sub2;// [ItmOper]の[itm_p.itm_sub2]を[columnItmOper_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnItmOper_itm_sub3;// [ItmOper]の[itm_p.itm_sub3]を[columnItmOper_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnItmOper_itm_nm;// [ItmOper]の[itm_p.itm_nm]を[columnItmOper_itm_nm]としてエイリアス定義。
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_loc_nm = null;
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_oper_ptn = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_oper_nm = null;
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_oper_seq = null;
	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_disp_seq = null;
	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_yield_oper_flg = null;
	/**
	 * Yield mfg. qty. 歩留製造数量.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_nmr_qty = null;
	/**
	 * Ideal mfg. qty. 理論製造数量.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_dnm_qty = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_unit_nm = null;
	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_oper_unit_cd = null;
	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_oper_unit_nm = null;
	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_oper_std_qty = null;
	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_oper_conv_qty = null;
	/**
	 * Number of decimal places 小数部有効桁数量.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_dec_place = null;
	/**
	 * Rounding type (Conversion) 換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_unit_conv_rnd_typ = null;
	/**
	 * Rounding type name (Conversion) 換算端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_unit_conv_rnd_typ_nm = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_sub_char3 = null;
	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_non_calc_flg = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnItmOper_upd_srv_req_no = null;
	// [ItmWk]ブロック関連のField定義
	public MCPanel ItmWkPanel = null;
	public MCScrollPane ItmWkScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0540.ItmWkR> ItmWkTable = null;
	// [ItmWk]ブロックの項目のField定義
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_calc_ctg_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ItmWk_itm_p_PPanel;
	public MCColumnConfig columnItmWk_itm_cd;// [ItmWk]の[itm_p.itm_cd]を[columnItmWk_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnItmWk_itm_sub1;// [ItmWk]の[itm_p.itm_sub1]を[columnItmWk_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnItmWk_itm_sub2;// [ItmWk]の[itm_p.itm_sub2]を[columnItmWk_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnItmWk_itm_sub3;// [ItmWk]の[itm_p.itm_sub3]を[columnItmWk_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnItmWk_itm_nm;// [ItmWk]の[itm_p.itm_nm]を[columnItmWk_itm_nm]としてエイリアス定義。
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_loc_nm = null;
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_oper_ptn = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_oper_nm = null;
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_oper_seq = null;
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_wk_cost_cd = null;
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_wk_cost_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ItmWk_qty_p_PPanel;
	public MCColumnConfig columnItmWk_base_qty;// [ItmWk]の[qty_p.qty]を[columnItmWk_base_qty]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_dec_place = null;
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D ItmWk_wk_cost_p_PPanel;
	public MCColumnConfig columnItmWk_wk_cost;// [ItmWk]の[wk_cost_p.wk_cost_qty]を[columnItmWk_wk_cost]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D ItmWk_fxd_wk_cost_p_PPanel;
	public MCColumnConfig columnItmWk_fxd_wk_cost;// [ItmWk]の[fxd_wk_cost_p.wk_cost_qty]を[columnItmWk_fxd_wk_cost]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D ItmWk_min_wk_cost_p_PPanel;
	public MCColumnConfig columnItmWk_min_wk_cost;// [ItmWk]の[min_wk_cost_p.wk_cost_qty]を[columnItmWk_min_wk_cost]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D ItmWk_batch_wk_cost_p_PPanel;
	public MCColumnConfig columnItmWk_batch_wk_cost;// [ItmWk]の[batch_wk_cost_p.wk_cost_qty]を[columnItmWk_batch_wk_cost]としてエイリアス定義。
	/**
	 * Man-hour unit name 工数単位名.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_wk_cost_unit_nm = null;
	/**
	 * Man-hour number of decimal places 工数小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_wk_cost_dec_place = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_sub_char3 = null;
	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_non_calc_flg = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnItmWk_upd_srv_req_no = null;
	// [ItmPurc]ブロック関連のField定義
	public MCPanel ItmPurcPanel = null;
	public MCScrollPane ItmPurcScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0540.ItmPurcR> ItmPurcTable = null;
	// [ItmPurc]ブロックの項目のField定義
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_calc_ctg_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ItmPurc_itm_p_PPanel;
	public MCColumnConfig columnItmPurc_itm_cd;// [ItmPurc]の[itm_p.itm_cd]を[columnItmPurc_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnItmPurc_itm_sub1;// [ItmPurc]の[itm_p.itm_sub1]を[columnItmPurc_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnItmPurc_itm_sub2;// [ItmPurc]の[itm_p.itm_sub2]を[columnItmPurc_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnItmPurc_itm_sub3;// [ItmPurc]の[itm_p.itm_sub3]を[columnItmPurc_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnItmPurc_itm_nm;// [ItmPurc]の[itm_p.itm_nm]を[columnItmPurc_itm_nm]としてエイリアス定義。
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_sppl_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ItmPurc_qty_p_PPanel;
	public MCColumnConfig columnItmPurc_base_qty;// [ItmPurc]の[qty_p.qty]を[columnItmPurc_base_qty]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_dec_place = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_cur_nm = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D ItmPurc_upri_p_PPanel;
	public MCColumnConfig columnItmPurc_upri;// [ItmPurc]の[upri_p.upri]を[columnItmPurc_upri]としてエイリアス定義。
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_upri_dec_place = null;
	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_cost_ratio = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_sub_char3 = null;
	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_non_calc_flg = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnItmPurc_upd_srv_req_no = null;
	// [ItmProc]ブロック関連のField定義
	public MCPanel ItmProcPanel = null;
	public MCScrollPane ItmProcScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0540.ItmProcR> ItmProcTable = null;
	// [ItmProc]ブロックの項目のField定義
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_calc_ctg_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ItmProc_itm_p_PPanel;
	public MCColumnConfig columnItmProc_itm_cd;// [ItmProc]の[itm_p.itm_cd]を[columnItmProc_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnItmProc_itm_sub1;// [ItmProc]の[itm_p.itm_sub1]を[columnItmProc_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnItmProc_itm_sub2;// [ItmProc]の[itm_p.itm_sub2]を[columnItmProc_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnItmProc_itm_sub3;// [ItmProc]の[itm_p.itm_sub3]を[columnItmProc_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnItmProc_itm_nm;// [ItmProc]の[itm_p.itm_nm]を[columnItmProc_itm_nm]としてエイリアス定義。
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_sppl_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ItmProc_qty_p_PPanel;
	public MCColumnConfig columnItmProc_base_qty;// [ItmProc]の[qty_p.qty]を[columnItmProc_base_qty]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_dec_place = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_cur_nm = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D ItmProc_upri_p_PPanel;
	public MCColumnConfig columnItmProc_upri;// [ItmProc]の[upri_p.upri]を[columnItmProc_upri]としてエイリアス定義。
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_upri_dec_place = null;
	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_cost_ratio = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_sub_char3 = null;
	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_non_calc_flg = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnItmProc_upd_srv_req_no = null;
	// [ItmProv]ブロック関連のField定義
	public MCPanel ItmProvPanel = null;
	public MCScrollPane ItmProvScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0540.ItmProvR> ItmProvTable = null;
	// [ItmProv]ブロックの項目のField定義
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_calc_ctg_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ItmProv_itm_p_PPanel;
	public MCColumnConfig columnItmProv_itm_cd;// [ItmProv]の[itm_p.itm_cd]を[columnItmProv_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnItmProv_itm_sub1;// [ItmProv]の[itm_p.itm_sub1]を[columnItmProv_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnItmProv_itm_sub2;// [ItmProv]の[itm_p.itm_sub2]を[columnItmProv_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnItmProv_itm_sub3;// [ItmProv]の[itm_p.itm_sub3]を[columnItmProv_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnItmProv_itm_nm;// [ItmProv]の[itm_p.itm_nm]を[columnItmProv_itm_nm]としてエイリアス定義。
	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_prsppl_cd = null;
	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_prsppl_nm = null;
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_prov_typ = null;
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_prov_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ItmProv_qty_p_PPanel;
	public MCColumnConfig columnItmProv_base_qty;// [ItmProv]の[qty_p.qty]を[columnItmProv_base_qty]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_dec_place = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_cur_nm = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D ItmProv_upri_p_PPanel;
	public MCColumnConfig columnItmProv_upri;// [ItmProv]の[upri_p.upri]を[columnItmProv_upri]としてエイリアス定義。
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_upri_dec_place = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_sub_char3 = null;
	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_non_calc_flg = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnItmProv_upd_srv_req_no = null;
	// [ItmSls]ブロック関連のField定義
	public MCPanel ItmSlsPanel = null;
	public MCScrollPane ItmSlsScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0540.ItmSlsR> ItmSlsTable = null;
	// [ItmSls]ブロックの項目のField定義
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_calc_ctg_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ItmSls_itm_p_PPanel;
	public MCColumnConfig columnItmSls_itm_cd;// [ItmSls]の[itm_p.itm_cd]を[columnItmSls_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnItmSls_itm_sub1;// [ItmSls]の[itm_p.itm_sub1]を[columnItmSls_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnItmSls_itm_sub2;// [ItmSls]の[itm_p.itm_sub2]を[columnItmSls_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnItmSls_itm_sub3;// [ItmSls]の[itm_p.itm_sub3]を[columnItmSls_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnItmSls_itm_nm;// [ItmSls]の[itm_p.itm_nm]を[columnItmSls_itm_nm]としてエイリアス定義。
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_dpt_nm = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_cst_nm = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_dlv_nm = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_dest_nm1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_dest_nm2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_dest_nm3 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ItmSls_qty_p_PPanel;
	public MCColumnConfig columnItmSls_base_qty;// [ItmSls]の[qty_p.qty]を[columnItmSls_base_qty]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_dec_place = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_cur_nm = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D ItmSls_upri_p_PPanel;
	public MCColumnConfig columnItmSls_upri;// [ItmSls]の[upri_p.upri]を[columnItmSls_upri]としてエイリアス定義。
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_upri_dec_place = null;
	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_prio = null;
	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_alc_val1 = null;
	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_alc_val2 = null;
	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_alc_val3 = null;
	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_alc_val4 = null;
	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_alc_val5 = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_sub_char3 = null;
	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_non_calc_flg = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnItmSls_upd_srv_req_no = null;
	// [ItmFix]ブロック関連のField定義
	public MCPanel ItmFixPanel = null;
	public MCScrollPane ItmFixScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0540.ItmFixR> ItmFixTable = null;
	// [ItmFix]ブロックの項目のField定義
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_calc_ctg_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ItmFix_itm_p_PPanel;
	public MCColumnConfig columnItmFix_itm_cd;// [ItmFix]の[itm_p.itm_cd]を[columnItmFix_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnItmFix_itm_sub1;// [ItmFix]の[itm_p.itm_sub1]を[columnItmFix_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnItmFix_itm_sub2;// [ItmFix]の[itm_p.itm_sub2]を[columnItmFix_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnItmFix_itm_sub3;// [ItmFix]の[itm_p.itm_sub3]を[columnItmFix_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnItmFix_itm_nm;// [ItmFix]の[itm_p.itm_nm]を[columnItmFix_itm_nm]としてエイリアス定義。
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_expns_cd = null;
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_expns_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ItmFix_qty_p_PPanel;
	public MCColumnConfig columnItmFix_base_qty;// [ItmFix]の[qty_p.qty]を[columnItmFix_base_qty]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_dec_place = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D ItmFix_std_upri_p_PPanel;
	public MCColumnConfig columnItmFix_std_upri;// [ItmFix]の[std_upri_p.upri]を[columnItmFix_std_upri]としてエイリアス定義。
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_cur_nm = null;
	/**
	 * Standard unit number of decimal places 標準単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_std_upri_dec_place = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_sub_char3 = null;
	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_non_calc_flg = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnItmFix_upd_srv_req_no = null;
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
	
	/** [MG_MGBDL0540_Srch01]のCallerの作成 */
	protected MGBDP_BomExSrch_MC.MG_MGBDL0540_Srch01Caller createMG_MGBDL0540_Srch01() {
		MGBDP_BomExSrch_MC.MG_MGBDL0540_Srch01Caller<MGBDP_BomExSrch, MG_MGBDL0540_Srch01Bridge>
		caller = ((MGBDP_BomExSrch_MC)this).new MG_MGBDL0540_Srch01Caller<MGBDP_BomExSrch, MG_MGBDL0540_Srch01Bridge>(
					(MGBDP_BomExSrch)this, new MG_MGBDL0540_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBDL0540_Srch01]の呼び出し */
	protected void callMG_MGBDL0540_Srch01() {
		MCCaller caller = createMG_MGBDL0540_Srch01();
		caller.exec();
	}
	/** [MG_MGBDL0540_Srch02]のCallerの作成 */
	protected MGBDP_BomExSrch_MC.MG_MGBDL0540_Srch02Caller createMG_MGBDL0540_Srch02() {
		MGBDP_BomExSrch_MC.MG_MGBDL0540_Srch02Caller<MGBDP_BomExSrch, MG_MGBDL0540_Srch02Bridge>
		caller = ((MGBDP_BomExSrch_MC)this).new MG_MGBDL0540_Srch02Caller<MGBDP_BomExSrch, MG_MGBDL0540_Srch02Bridge>(
					(MGBDP_BomExSrch)this, new MG_MGBDL0540_Srch02Bridge());
		return caller;
	}
	/** [MG_MGBDL0540_Srch02]の呼び出し */
	protected void callMG_MGBDL0540_Srch02() {
		MCCaller caller = createMG_MGBDL0540_Srch02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0540.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0540.DtlR> aDtlL;
	/** [Itm]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0540.ItmR> aItmL;
	/** [ItmDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0540.ItmDtlR> aItmDtlL;
	/** [ItmOper]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0540.ItmOperR> aItmOperL;
	/** [ItmWk]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0540.ItmWkR> aItmWkL;
	/** [ItmPurc]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0540.ItmPurcR> aItmPurcL;
	/** [ItmProc]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0540.ItmProcR> aItmProcL;
	/** [ItmProv]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0540.ItmProvR> aItmProvL;
	/** [ItmSls]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0540.ItmSlsR> aItmSlsL;
	/** [ItmFix]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0540.ItmFixR> aItmFixL;
	/** [Cnd2]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0540.Cnd2R aCnd2R;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0540.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0540.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0540.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0540.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMGBD.MGBDP0540.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMGBD.MGBDP0540.DtlR createDtlR() {
		return mcframe.clientMGBD.MGBDP0540.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0540.DtlR.class);
	}

	/**
	 * DtlTableを初期化します。
	 */
	protected void createDtlTable(){
		if(DtlTable == null){
			DtlTable = beansFactory.createTable2("Dtl.table");
		}
	}

	/**
	 * コピーによってaItmLを設定します。
	 *
	 * aItmLのインスタンスは変更されません。
	 *
	 * @param dataset ItmL
	 */
	public void setItmL(MCList<mcframe.clientMGBD.MGBDP0540.ItmR> aList) {
		if (getItmL() != aList) {
			getItmL().setAll(aList);
		}
	}

	/**
	 * [Itm]ブロックのコンテナaItmLを返します。
	 *
	 * @return ItmL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmR> getItmL() {
		return aItmL;
	}

	/**
	 * aItmRを作成します。
	 *
	 * @return ItmR
	 */
	public mcframe.clientMGBD.MGBDP0540.ItmR createItmR() {
		return mcframe.clientMGBD.MGBDP0540.ItmR.create();
	}

	/**
	 * aItmLを作成します。
	 *
	 * @return ItmL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmR> createItmL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0540.ItmR.class);
	}

	/**
	 * ItmTableを初期化します。
	 */
	protected void createItmTable(){
		if(ItmTable == null){
			ItmTable = beansFactory.createTable2("Itm.table");
		}
	}

	/**
	 * コピーによってaItmDtlLを設定します。
	 *
	 * aItmDtlLのインスタンスは変更されません。
	 *
	 * @param dataset ItmDtlL
	 */
	public void setItmDtlL(MCList<mcframe.clientMGBD.MGBDP0540.ItmDtlR> aList) {
		if (getItmDtlL() != aList) {
			getItmDtlL().setAll(aList);
		}
	}

	/**
	 * [ItmDtl]ブロックのコンテナaItmDtlLを返します。
	 *
	 * @return ItmDtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmDtlR> getItmDtlL() {
		return aItmDtlL;
	}

	/**
	 * aItmDtlRを作成します。
	 *
	 * @return ItmDtlR
	 */
	public mcframe.clientMGBD.MGBDP0540.ItmDtlR createItmDtlR() {
		return mcframe.clientMGBD.MGBDP0540.ItmDtlR.create();
	}

	/**
	 * aItmDtlLを作成します。
	 *
	 * @return ItmDtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmDtlR> createItmDtlL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0540.ItmDtlR.class);
	}

	/**
	 * ItmDtlTableを初期化します。
	 */
	protected void createItmDtlTable(){
		if(ItmDtlTable == null){
			ItmDtlTable = beansFactory.createTable2("ItmDtl.table");
		}
	}

	/**
	 * コピーによってaItmOperLを設定します。
	 *
	 * aItmOperLのインスタンスは変更されません。
	 *
	 * @param dataset ItmOperL
	 */
	public void setItmOperL(MCList<mcframe.clientMGBD.MGBDP0540.ItmOperR> aList) {
		if (getItmOperL() != aList) {
			getItmOperL().setAll(aList);
		}
	}

	/**
	 * [ItmOper]ブロックのコンテナaItmOperLを返します。
	 *
	 * @return ItmOperL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmOperR> getItmOperL() {
		return aItmOperL;
	}

	/**
	 * aItmOperRを作成します。
	 *
	 * @return ItmOperR
	 */
	public mcframe.clientMGBD.MGBDP0540.ItmOperR createItmOperR() {
		return mcframe.clientMGBD.MGBDP0540.ItmOperR.create();
	}

	/**
	 * aItmOperLを作成します。
	 *
	 * @return ItmOperL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmOperR> createItmOperL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0540.ItmOperR.class);
	}

	/**
	 * ItmOperTableを初期化します。
	 */
	protected void createItmOperTable(){
		if(ItmOperTable == null){
			ItmOperTable = beansFactory.createTable2("ItmOper.table");
		}
	}

	/**
	 * コピーによってaItmWkLを設定します。
	 *
	 * aItmWkLのインスタンスは変更されません。
	 *
	 * @param dataset ItmWkL
	 */
	public void setItmWkL(MCList<mcframe.clientMGBD.MGBDP0540.ItmWkR> aList) {
		if (getItmWkL() != aList) {
			getItmWkL().setAll(aList);
		}
	}

	/**
	 * [ItmWk]ブロックのコンテナaItmWkLを返します。
	 *
	 * @return ItmWkL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmWkR> getItmWkL() {
		return aItmWkL;
	}

	/**
	 * aItmWkRを作成します。
	 *
	 * @return ItmWkR
	 */
	public mcframe.clientMGBD.MGBDP0540.ItmWkR createItmWkR() {
		return mcframe.clientMGBD.MGBDP0540.ItmWkR.create();
	}

	/**
	 * aItmWkLを作成します。
	 *
	 * @return ItmWkL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmWkR> createItmWkL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0540.ItmWkR.class);
	}

	/**
	 * ItmWkTableを初期化します。
	 */
	protected void createItmWkTable(){
		if(ItmWkTable == null){
			ItmWkTable = beansFactory.createTable2("ItmWk.table");
		}
	}

	/**
	 * コピーによってaItmPurcLを設定します。
	 *
	 * aItmPurcLのインスタンスは変更されません。
	 *
	 * @param dataset ItmPurcL
	 */
	public void setItmPurcL(MCList<mcframe.clientMGBD.MGBDP0540.ItmPurcR> aList) {
		if (getItmPurcL() != aList) {
			getItmPurcL().setAll(aList);
		}
	}

	/**
	 * [ItmPurc]ブロックのコンテナaItmPurcLを返します。
	 *
	 * @return ItmPurcL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmPurcR> getItmPurcL() {
		return aItmPurcL;
	}

	/**
	 * aItmPurcRを作成します。
	 *
	 * @return ItmPurcR
	 */
	public mcframe.clientMGBD.MGBDP0540.ItmPurcR createItmPurcR() {
		return mcframe.clientMGBD.MGBDP0540.ItmPurcR.create();
	}

	/**
	 * aItmPurcLを作成します。
	 *
	 * @return ItmPurcL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmPurcR> createItmPurcL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0540.ItmPurcR.class);
	}

	/**
	 * ItmPurcTableを初期化します。
	 */
	protected void createItmPurcTable(){
		if(ItmPurcTable == null){
			ItmPurcTable = beansFactory.createTable2("ItmPurc.table");
		}
	}

	/**
	 * コピーによってaItmProcLを設定します。
	 *
	 * aItmProcLのインスタンスは変更されません。
	 *
	 * @param dataset ItmProcL
	 */
	public void setItmProcL(MCList<mcframe.clientMGBD.MGBDP0540.ItmProcR> aList) {
		if (getItmProcL() != aList) {
			getItmProcL().setAll(aList);
		}
	}

	/**
	 * [ItmProc]ブロックのコンテナaItmProcLを返します。
	 *
	 * @return ItmProcL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmProcR> getItmProcL() {
		return aItmProcL;
	}

	/**
	 * aItmProcRを作成します。
	 *
	 * @return ItmProcR
	 */
	public mcframe.clientMGBD.MGBDP0540.ItmProcR createItmProcR() {
		return mcframe.clientMGBD.MGBDP0540.ItmProcR.create();
	}

	/**
	 * aItmProcLを作成します。
	 *
	 * @return ItmProcL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmProcR> createItmProcL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0540.ItmProcR.class);
	}

	/**
	 * ItmProcTableを初期化します。
	 */
	protected void createItmProcTable(){
		if(ItmProcTable == null){
			ItmProcTable = beansFactory.createTable2("ItmProc.table");
		}
	}

	/**
	 * コピーによってaItmProvLを設定します。
	 *
	 * aItmProvLのインスタンスは変更されません。
	 *
	 * @param dataset ItmProvL
	 */
	public void setItmProvL(MCList<mcframe.clientMGBD.MGBDP0540.ItmProvR> aList) {
		if (getItmProvL() != aList) {
			getItmProvL().setAll(aList);
		}
	}

	/**
	 * [ItmProv]ブロックのコンテナaItmProvLを返します。
	 *
	 * @return ItmProvL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmProvR> getItmProvL() {
		return aItmProvL;
	}

	/**
	 * aItmProvRを作成します。
	 *
	 * @return ItmProvR
	 */
	public mcframe.clientMGBD.MGBDP0540.ItmProvR createItmProvR() {
		return mcframe.clientMGBD.MGBDP0540.ItmProvR.create();
	}

	/**
	 * aItmProvLを作成します。
	 *
	 * @return ItmProvL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmProvR> createItmProvL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0540.ItmProvR.class);
	}

	/**
	 * ItmProvTableを初期化します。
	 */
	protected void createItmProvTable(){
		if(ItmProvTable == null){
			ItmProvTable = beansFactory.createTable2("ItmProv.table");
		}
	}

	/**
	 * コピーによってaItmSlsLを設定します。
	 *
	 * aItmSlsLのインスタンスは変更されません。
	 *
	 * @param dataset ItmSlsL
	 */
	public void setItmSlsL(MCList<mcframe.clientMGBD.MGBDP0540.ItmSlsR> aList) {
		if (getItmSlsL() != aList) {
			getItmSlsL().setAll(aList);
		}
	}

	/**
	 * [ItmSls]ブロックのコンテナaItmSlsLを返します。
	 *
	 * @return ItmSlsL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmSlsR> getItmSlsL() {
		return aItmSlsL;
	}

	/**
	 * aItmSlsRを作成します。
	 *
	 * @return ItmSlsR
	 */
	public mcframe.clientMGBD.MGBDP0540.ItmSlsR createItmSlsR() {
		return mcframe.clientMGBD.MGBDP0540.ItmSlsR.create();
	}

	/**
	 * aItmSlsLを作成します。
	 *
	 * @return ItmSlsL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmSlsR> createItmSlsL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0540.ItmSlsR.class);
	}

	/**
	 * ItmSlsTableを初期化します。
	 */
	protected void createItmSlsTable(){
		if(ItmSlsTable == null){
			ItmSlsTable = beansFactory.createTable2("ItmSls.table");
		}
	}

	/**
	 * コピーによってaItmFixLを設定します。
	 *
	 * aItmFixLのインスタンスは変更されません。
	 *
	 * @param dataset ItmFixL
	 */
	public void setItmFixL(MCList<mcframe.clientMGBD.MGBDP0540.ItmFixR> aList) {
		if (getItmFixL() != aList) {
			getItmFixL().setAll(aList);
		}
	}

	/**
	 * [ItmFix]ブロックのコンテナaItmFixLを返します。
	 *
	 * @return ItmFixL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmFixR> getItmFixL() {
		return aItmFixL;
	}

	/**
	 * aItmFixRを作成します。
	 *
	 * @return ItmFixR
	 */
	public mcframe.clientMGBD.MGBDP0540.ItmFixR createItmFixR() {
		return mcframe.clientMGBD.MGBDP0540.ItmFixR.create();
	}

	/**
	 * aItmFixLを作成します。
	 *
	 * @return ItmFixL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0540.ItmFixR> createItmFixL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0540.ItmFixR.class);
	}

	/**
	 * ItmFixTableを初期化します。
	 */
	protected void createItmFixTable(){
		if(ItmFixTable == null){
			ItmFixTable = beansFactory.createTable2("ItmFix.table");
		}
	}

	/**
	 * 項目コピーによってaCnd2Rを設定します。
	 *
	 * aCnd2Rのインスタンスは変更されません。
	 *
	 * @param row Cnd2R
	 */
	public void setCnd2R(mcframe.clientMGBD.MGBDP0540.Cnd2R row) {
		if (row != null) {
			MCRow.copyall(getCnd2R(), row);
		}
	}

	/**
	 * [Cnd2]ブロックのコンテナaCnd2Rを返します。
	 *
	 * @return Cnd2R
	 */
	public mcframe.clientMGBD.MGBDP0540.Cnd2R getCnd2R() {
		return aCnd2R;
	}

	/**
	 * aCnd2Rを作成します。
	 *
	 * @return Cnd2R
	 */
	public mcframe.clientMGBD.MGBDP0540.Cnd2R createCnd2R() {
		return mcframe.clientMGBD.MGBDP0540.Cnd2R.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getItmL())) ret.add(getItmL());
		if(!MCCollectionUtil.contains(ret, getItmDtlL())) ret.add(getItmDtlL());
		if(!MCCollectionUtil.contains(ret, getItmOperL())) ret.add(getItmOperL());
		if(!MCCollectionUtil.contains(ret, getItmWkL())) ret.add(getItmWkL());
		if(!MCCollectionUtil.contains(ret, getItmPurcL())) ret.add(getItmPurcL());
		if(!MCCollectionUtil.contains(ret, getItmProcL())) ret.add(getItmProcL());
		if(!MCCollectionUtil.contains(ret, getItmProvL())) ret.add(getItmProvL());
		if(!MCCollectionUtil.contains(ret, getItmSlsL())) ret.add(getItmSlsL());
		if(!MCCollectionUtil.contains(ret, getItmFixL())) ret.add(getItmFixL());
		if(!MCCollectionUtil.contains(ret, getCnd2R())) ret.add(getCnd2R());
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
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getItmL()) return "Itm";
		if(aCnt == getItmDtlL()) return "ItmDtl";
		if(aCnt == getItmOperL()) return "ItmOper";
		if(aCnt == getItmWkL()) return "ItmWk";
		if(aCnt == getItmPurcL()) return "ItmPurc";
		if(aCnt == getItmProcL()) return "ItmProc";
		if(aCnt == getItmProvL()) return "ItmProv";
		if(aCnt == getItmSlsL()) return "ItmSls";
		if(aCnt == getItmFixL()) return "ItmFix";
		if(aCnt == getCnd2R()) return "Cnd2";
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
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Itm")) return getItmL();
		if(bId.equals("ItmDtl")) return getItmDtlL();
		if(bId.equals("ItmOper")) return getItmOperL();
		if(bId.equals("ItmWk")) return getItmWkL();
		if(bId.equals("ItmPurc")) return getItmPurcL();
		if(bId.equals("ItmProc")) return getItmProcL();
		if(bId.equals("ItmProv")) return getItmProvL();
		if(bId.equals("ItmSls")) return getItmSlsL();
		if(bId.equals("ItmFix")) return getItmFixL();
		if(bId.equals("Cnd2")) return getCnd2R();
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
		ret.add(RPnlPanel);
		ret.add(DtlPnlPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(BottomPanel);
		ret.add(ItmPanel);
		ret.add(ItmDtlPanel);
		ret.add(ItmOperPanel);
		ret.add(ItmWkPanel);
		ret.add(ItmPurcPanel);
		ret.add(ItmProcPanel);
		ret.add(ItmProvPanel);
		ret.add(ItmSlsPanel);
		ret.add(ItmFixPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_BomExSrch_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();
		aItmL = createItmL();
		aItmDtlL = createItmDtlL();
		aItmOperL = createItmOperL();
		aItmWkL = createItmWkL();
		aItmPurcL = createItmPurcL();
		aItmProcL = createItmProcL();
		aItmProvL = createItmProvL();
		aItmSlsL = createItmSlsL();
		aItmFixL = createItmFixL();
		aCnd2R = createCnd2R();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_BomExSrch_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aItmL = createItmL();
		createItmTable();
		ItmTable.setRowName(name);
		aItmDtlL = createItmDtlL();
		createItmDtlTable();
		ItmDtlTable.setRowName(name);
		aItmOperL = createItmOperL();
		createItmOperTable();
		ItmOperTable.setRowName(name);
		aItmWkL = createItmWkL();
		createItmWkTable();
		ItmWkTable.setRowName(name);
		aItmPurcL = createItmPurcL();
		createItmPurcTable();
		ItmPurcTable.setRowName(name);
		aItmProcL = createItmProcL();
		createItmProcTable();
		ItmProcTable.setRowName(name);
		aItmProvL = createItmProvL();
		createItmProvTable();
		ItmProvTable.setRowName(name);
		aItmSlsL = createItmSlsL();
		createItmSlsTable();
		ItmSlsTable.setRowName(name);
		aItmFixL = createItmFixL();
		createItmFixTable();
		ItmFixTable.setRowName(name);
		aCnd2R = createCnd2R();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBDP_BomExSrch_MC.jbCreateScreenOpe((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateTop((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateCnd((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateCtrl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateRPnl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateDtlPnl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateDtl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateBtn((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateBottom((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateItm((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateItmDtl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateItmOper((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateItmWk((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateItmPurc((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateItmProc((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateItmProv((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateItmSls((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbCreateItmFix((MGBDP_BomExSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBDP_BomExSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBDP_BomExSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_BomExSrch p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term = p.Cnd_term_p_PPanel.Term_term;
		p.Cnd_term.addAliasName("Cnd.term", p);
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
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBDP_BomExSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MGBDP_BomExSrch p) {
	}

	/**
	 * [DtlPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlPnl(MGBDP_BomExSrch p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MGBDP_BomExSrch p) {
		p.Dtl_hrrchy_p_PPanel = mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.create(mcframe.clientMGBD.MGBDP0540.DtlR.$hrrchy_p);
		p.Dtl_hrrchy_p_PPanel.setName("Dtl.hrrchy_p");
		p.columnDtl_ext = p.Dtl_hrrchy_p_PPanel.columnHrrchy_ext;
		p.columnDtl_ext.addAliasName("Dtl.ext", p);
		p.columnDtl_hrrchy_str = p.Dtl_hrrchy_p_PPanel.columnHrrchy_hrrchy_str;
		p.columnDtl_hrrchy_str.addAliasName("Dtl.hrrchy_str", p);
		p.columnDtl_extno = p.Dtl_hrrchy_p_PPanel.columnHrrchy_extno;
		p.columnDtl_extno.addAliasName("Dtl.extno", p);
		p.columnDtl_par_extno = p.Dtl_hrrchy_p_PPanel.columnHrrchy_par_extno;
		p.columnDtl_par_extno.addAliasName("Dtl.par_extno", p);
		p.columnDtl_loop_flg = p.Dtl_hrrchy_p_PPanel.columnHrrchy_loop_flg;
		p.columnDtl_loop_flg.addAliasName("Dtl.loop_flg", p);
		p.columnDtl_leaf_str = p.Dtl_hrrchy_p_PPanel.columnHrrchy_leaf_str;
		p.columnDtl_leaf_str.addAliasName("Dtl.leaf_str", p);
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0540.DtlR.$itm_p);
		p.Dtl_itm_p_PPanel.setName("Dtl.itm_p");
		p.columnDtl_itm_cd = p.Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_itm_cd.addAliasName("Dtl.itm_cd", p);
		p.columnDtl_itm_sub1 = p.Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_itm_sub1.addAliasName("Dtl.itm_sub1", p);
		p.columnDtl_itm_sub2 = p.Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_itm_sub2.addAliasName("Dtl.itm_sub2", p);
		p.columnDtl_itm_sub3 = p.Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_itm_sub3.addAliasName("Dtl.itm_sub3", p);
		p.columnDtl_itm_nm = p.Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_itm_nm.addAliasName("Dtl.itm_nm", p);
		p.Dtl_par_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.DtlR.$par_rqmt_qty_p);
		p.Dtl_par_rqmt_qty_p_PPanel.setName("Dtl.par_rqmt_qty_p");
		p.columnDtl_par_rqmt_qty = p.Dtl_par_rqmt_qty_p_PPanel.columnQty_qty;
		p.columnDtl_par_rqmt_qty.addAliasName("Dtl.par_rqmt_qty", p);
		p.Dtl_chd_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.DtlR.$chd_rqmt_qty_p);
		p.Dtl_chd_rqmt_qty_p_PPanel.setName("Dtl.chd_rqmt_qty_p");
		p.columnDtl_chd_rqmt_qty = p.Dtl_chd_rqmt_qty_p_PPanel.columnQty_qty;
		p.columnDtl_chd_rqmt_qty.addAliasName("Dtl.chd_rqmt_qty", p);
		p.Dtl_chd_base_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.DtlR.$chd_base_qty_p);
		p.Dtl_chd_base_qty_p_PPanel.setName("Dtl.chd_base_qty_p");
		p.columnDtl_chd_base_qty = p.Dtl_chd_base_qty_p_PPanel.columnQty_qty;
		p.columnDtl_chd_base_qty.addAliasName("Dtl.chd_base_qty", p);
		p.Dtl_fxd_chd_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.DtlR.$fxd_chd_rqmt_qty_p);
		p.Dtl_fxd_chd_rqmt_qty_p_PPanel.setName("Dtl.fxd_chd_rqmt_qty_p");
		p.columnDtl_fxd_chd_rqmt_qty = p.Dtl_fxd_chd_rqmt_qty_p_PPanel.columnQty_qty;
		p.columnDtl_fxd_chd_rqmt_qty.addAliasName("Dtl.fxd_chd_rqmt_qty", p);
		p.Dtl_chd_min_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.DtlR.$chd_min_qty_p);
		p.Dtl_chd_min_qty_p_PPanel.setName("Dtl.chd_min_qty_p");
		p.columnDtl_chd_min_qty = p.Dtl_chd_min_qty_p_PPanel.columnQty_qty;
		p.columnDtl_chd_min_qty.addAliasName("Dtl.chd_min_qty", p);
		p.Dtl_chd_batch_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.DtlR.$chd_batch_qty_p);
		p.Dtl_chd_batch_qty_p_PPanel.setName("Dtl.chd_batch_qty_p");
		p.columnDtl_chd_batch_qty = p.Dtl_chd_batch_qty_p_PPanel.columnQty_qty;
		p.columnDtl_chd_batch_qty.addAliasName("Dtl.chd_batch_qty", p);
		p.Dtl_upper_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0540.DtlR.$upper_itm_p);
		p.Dtl_upper_itm_p_PPanel.setName("Dtl.upper_itm_p");
		p.columnDtl_upper_itm_cd = p.Dtl_upper_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_upper_itm_cd.addAliasName("Dtl.upper_itm_cd", p);
		p.columnDtl_upper_itm_sub1 = p.Dtl_upper_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_upper_itm_sub1.addAliasName("Dtl.upper_itm_sub1", p);
		p.columnDtl_upper_itm_sub2 = p.Dtl_upper_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_upper_itm_sub2.addAliasName("Dtl.upper_itm_sub2", p);
		p.columnDtl_upper_itm_sub3 = p.Dtl_upper_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_upper_itm_sub3.addAliasName("Dtl.upper_itm_sub3", p);
		p.columnDtl_upper_itm_nm = p.Dtl_upper_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_upper_itm_nm.addAliasName("Dtl.upper_itm_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBDP_BomExSrch p) {
	}

	/**
	 * [Bottom]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBottom(MGBDP_BomExSrch p) {
	}

	/**
	 * [Itm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItm(MGBDP_BomExSrch p) {
		p.Itm_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0540.ItmR.$itm_p);
		p.Itm_itm_p_PPanel.setName("Itm.itm_p");
		p.columnItm_itm_cd = p.Itm_itm_p_PPanel.columnItm_itm_cd;
		p.columnItm_itm_cd.addAliasName("Itm.itm_cd", p);
		p.columnItm_itm_sub1 = p.Itm_itm_p_PPanel.columnItm_itm_sub1;
		p.columnItm_itm_sub1.addAliasName("Itm.itm_sub1", p);
		p.columnItm_itm_sub2 = p.Itm_itm_p_PPanel.columnItm_itm_sub2;
		p.columnItm_itm_sub2.addAliasName("Itm.itm_sub2", p);
		p.columnItm_itm_sub3 = p.Itm_itm_p_PPanel.columnItm_itm_sub3;
		p.columnItm_itm_sub3.addAliasName("Itm.itm_sub3", p);
		p.columnItm_itm_nm = p.Itm_itm_p_PPanel.columnItm_itm_nm;
		p.columnItm_itm_nm.addAliasName("Itm.itm_nm", p);
		p.Itm_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.ItmR.$qty_p);
		p.Itm_qty_p_PPanel.setName("Itm.qty_p");
		p.columnItm_std_qty = p.Itm_qty_p_PPanel.columnQty_qty;
		p.columnItm_std_qty.addAliasName("Itm.std_qty", p);
	}

	/**
	 * [ItmDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmDtl(MGBDP_BomExSrch p) {
		p.ItmDtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0540.ItmDtlR.$itm_p);
		p.ItmDtl_itm_p_PPanel.setName("ItmDtl.itm_p");
		p.columnItmDtl_itm_cd = p.ItmDtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnItmDtl_itm_cd.addAliasName("ItmDtl.itm_cd", p);
		p.columnItmDtl_itm_sub1 = p.ItmDtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnItmDtl_itm_sub1.addAliasName("ItmDtl.itm_sub1", p);
		p.columnItmDtl_itm_sub2 = p.ItmDtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnItmDtl_itm_sub2.addAliasName("ItmDtl.itm_sub2", p);
		p.columnItmDtl_itm_sub3 = p.ItmDtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnItmDtl_itm_sub3.addAliasName("ItmDtl.itm_sub3", p);
		p.columnItmDtl_itm_nm = p.ItmDtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnItmDtl_itm_nm.addAliasName("ItmDtl.itm_nm", p);
		p.ItmDtl_min_lot_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.ItmDtlR.$min_lot_qty_p);
		p.ItmDtl_min_lot_qty_p_PPanel.setName("ItmDtl.min_lot_qty_p");
		p.columnItmDtl_min_lot_qty = p.ItmDtl_min_lot_qty_p_PPanel.columnQty_qty;
		p.columnItmDtl_min_lot_qty.addAliasName("ItmDtl.min_lot_qty", p);
		p.ItmDtl_batch_lot_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.ItmDtlR.$batch_lot_qty_p);
		p.ItmDtl_batch_lot_qty_p_PPanel.setName("ItmDtl.batch_lot_qty_p");
		p.columnItmDtl_batch_lot_qty = p.ItmDtl_batch_lot_qty_p_PPanel.columnQty_qty;
		p.columnItmDtl_batch_lot_qty.addAliasName("ItmDtl.batch_lot_qty", p);
		p.ItmDtl_fxd_lot_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.ItmDtlR.$fxd_lot_qty_p);
		p.ItmDtl_fxd_lot_qty_p_PPanel.setName("ItmDtl.fxd_lot_qty_p");
		p.columnItmDtl_fxd_lot_qty = p.ItmDtl_fxd_lot_qty_p_PPanel.columnQty_qty;
		p.columnItmDtl_fxd_lot_qty.addAliasName("ItmDtl.fxd_lot_qty", p);
		p.ItmDtl_fxd_yield_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.ItmDtlR.$fxd_yield_qty_p);
		p.ItmDtl_fxd_yield_qty_p_PPanel.setName("ItmDtl.fxd_yield_qty_p");
		p.columnItmDtl_fxd_yield_qty = p.ItmDtl_fxd_yield_qty_p_PPanel.columnQty_qty;
		p.columnItmDtl_fxd_yield_qty.addAliasName("ItmDtl.fxd_yield_qty", p);
		p.ItmDtl_nmr_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.ItmDtlR.$nmr_qty_p);
		p.ItmDtl_nmr_qty_p_PPanel.setName("ItmDtl.nmr_qty_p");
		p.columnItmDtl_nmr_qty = p.ItmDtl_nmr_qty_p_PPanel.columnQty_qty;
		p.columnItmDtl_nmr_qty.addAliasName("ItmDtl.nmr_qty", p);
		p.ItmDtl_dnm_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.ItmDtlR.$dnm_qty_p);
		p.ItmDtl_dnm_qty_p_PPanel.setName("ItmDtl.dnm_qty_p");
		p.columnItmDtl_dnm_qty = p.ItmDtl_dnm_qty_p_PPanel.columnQty_qty;
		p.columnItmDtl_dnm_qty.addAliasName("ItmDtl.dnm_qty", p);
		p.ItmDtl_max_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.ItmDtlR.$max_qty_p);
		p.ItmDtl_max_qty_p_PPanel.setName("ItmDtl.max_qty_p");
		p.columnItmDtl_max_qty = p.ItmDtl_max_qty_p_PPanel.columnQty_qty;
		p.columnItmDtl_max_qty.addAliasName("ItmDtl.max_qty", p);
	}

	/**
	 * [ItmOper]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmOper(MGBDP_BomExSrch p) {
		p.ItmOper_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0540.ItmOperR.$itm_p);
		p.ItmOper_itm_p_PPanel.setName("ItmOper.itm_p");
		p.columnItmOper_itm_cd = p.ItmOper_itm_p_PPanel.columnItm_itm_cd;
		p.columnItmOper_itm_cd.addAliasName("ItmOper.itm_cd", p);
		p.columnItmOper_itm_sub1 = p.ItmOper_itm_p_PPanel.columnItm_itm_sub1;
		p.columnItmOper_itm_sub1.addAliasName("ItmOper.itm_sub1", p);
		p.columnItmOper_itm_sub2 = p.ItmOper_itm_p_PPanel.columnItm_itm_sub2;
		p.columnItmOper_itm_sub2.addAliasName("ItmOper.itm_sub2", p);
		p.columnItmOper_itm_sub3 = p.ItmOper_itm_p_PPanel.columnItm_itm_sub3;
		p.columnItmOper_itm_sub3.addAliasName("ItmOper.itm_sub3", p);
		p.columnItmOper_itm_nm = p.ItmOper_itm_p_PPanel.columnItm_itm_nm;
		p.columnItmOper_itm_nm.addAliasName("ItmOper.itm_nm", p);
	}

	/**
	 * [ItmWk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmWk(MGBDP_BomExSrch p) {
		p.ItmWk_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0540.ItmWkR.$itm_p);
		p.ItmWk_itm_p_PPanel.setName("ItmWk.itm_p");
		p.columnItmWk_itm_cd = p.ItmWk_itm_p_PPanel.columnItm_itm_cd;
		p.columnItmWk_itm_cd.addAliasName("ItmWk.itm_cd", p);
		p.columnItmWk_itm_sub1 = p.ItmWk_itm_p_PPanel.columnItm_itm_sub1;
		p.columnItmWk_itm_sub1.addAliasName("ItmWk.itm_sub1", p);
		p.columnItmWk_itm_sub2 = p.ItmWk_itm_p_PPanel.columnItm_itm_sub2;
		p.columnItmWk_itm_sub2.addAliasName("ItmWk.itm_sub2", p);
		p.columnItmWk_itm_sub3 = p.ItmWk_itm_p_PPanel.columnItm_itm_sub3;
		p.columnItmWk_itm_sub3.addAliasName("ItmWk.itm_sub3", p);
		p.columnItmWk_itm_nm = p.ItmWk_itm_p_PPanel.columnItm_itm_nm;
		p.columnItmWk_itm_nm.addAliasName("ItmWk.itm_nm", p);
		p.ItmWk_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.ItmWkR.$qty_p);
		p.ItmWk_qty_p_PPanel.setName("ItmWk.qty_p");
		p.columnItmWk_base_qty = p.ItmWk_qty_p_PPanel.columnQty_qty;
		p.columnItmWk_base_qty.addAliasName("ItmWk.base_qty", p);
		p.ItmWk_wk_cost_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBD.MGBDP0540.ItmWkR.$wk_cost_p);
		p.ItmWk_wk_cost_p_PPanel.setName("ItmWk.wk_cost_p");
		p.columnItmWk_wk_cost = p.ItmWk_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnItmWk_wk_cost.addAliasName("ItmWk.wk_cost", p);
		p.ItmWk_fxd_wk_cost_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBD.MGBDP0540.ItmWkR.$fxd_wk_cost_p);
		p.ItmWk_fxd_wk_cost_p_PPanel.setName("ItmWk.fxd_wk_cost_p");
		p.columnItmWk_fxd_wk_cost = p.ItmWk_fxd_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnItmWk_fxd_wk_cost.addAliasName("ItmWk.fxd_wk_cost", p);
		p.ItmWk_min_wk_cost_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBD.MGBDP0540.ItmWkR.$min_wk_cost_p);
		p.ItmWk_min_wk_cost_p_PPanel.setName("ItmWk.min_wk_cost_p");
		p.columnItmWk_min_wk_cost = p.ItmWk_min_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnItmWk_min_wk_cost.addAliasName("ItmWk.min_wk_cost", p);
		p.ItmWk_batch_wk_cost_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMGBD.MGBDP0540.ItmWkR.$batch_wk_cost_p);
		p.ItmWk_batch_wk_cost_p_PPanel.setName("ItmWk.batch_wk_cost_p");
		p.columnItmWk_batch_wk_cost = p.ItmWk_batch_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnItmWk_batch_wk_cost.addAliasName("ItmWk.batch_wk_cost", p);
	}

	/**
	 * [ItmPurc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmPurc(MGBDP_BomExSrch p) {
		p.ItmPurc_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0540.ItmPurcR.$itm_p);
		p.ItmPurc_itm_p_PPanel.setName("ItmPurc.itm_p");
		p.columnItmPurc_itm_cd = p.ItmPurc_itm_p_PPanel.columnItm_itm_cd;
		p.columnItmPurc_itm_cd.addAliasName("ItmPurc.itm_cd", p);
		p.columnItmPurc_itm_sub1 = p.ItmPurc_itm_p_PPanel.columnItm_itm_sub1;
		p.columnItmPurc_itm_sub1.addAliasName("ItmPurc.itm_sub1", p);
		p.columnItmPurc_itm_sub2 = p.ItmPurc_itm_p_PPanel.columnItm_itm_sub2;
		p.columnItmPurc_itm_sub2.addAliasName("ItmPurc.itm_sub2", p);
		p.columnItmPurc_itm_sub3 = p.ItmPurc_itm_p_PPanel.columnItm_itm_sub3;
		p.columnItmPurc_itm_sub3.addAliasName("ItmPurc.itm_sub3", p);
		p.columnItmPurc_itm_nm = p.ItmPurc_itm_p_PPanel.columnItm_itm_nm;
		p.columnItmPurc_itm_nm.addAliasName("ItmPurc.itm_nm", p);
		p.ItmPurc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.ItmPurcR.$qty_p);
		p.ItmPurc_qty_p_PPanel.setName("ItmPurc.qty_p");
		p.columnItmPurc_base_qty = p.ItmPurc_qty_p_PPanel.columnQty_qty;
		p.columnItmPurc_base_qty.addAliasName("ItmPurc.base_qty", p);
		p.ItmPurc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMGBD.MGBDP0540.ItmPurcR.$upri_p);
		p.ItmPurc_upri_p_PPanel.setName("ItmPurc.upri_p");
		p.columnItmPurc_upri = p.ItmPurc_upri_p_PPanel.columnUpri_upri;
		p.columnItmPurc_upri.addAliasName("ItmPurc.upri", p);
	}

	/**
	 * [ItmProc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmProc(MGBDP_BomExSrch p) {
		p.ItmProc_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0540.ItmProcR.$itm_p);
		p.ItmProc_itm_p_PPanel.setName("ItmProc.itm_p");
		p.columnItmProc_itm_cd = p.ItmProc_itm_p_PPanel.columnItm_itm_cd;
		p.columnItmProc_itm_cd.addAliasName("ItmProc.itm_cd", p);
		p.columnItmProc_itm_sub1 = p.ItmProc_itm_p_PPanel.columnItm_itm_sub1;
		p.columnItmProc_itm_sub1.addAliasName("ItmProc.itm_sub1", p);
		p.columnItmProc_itm_sub2 = p.ItmProc_itm_p_PPanel.columnItm_itm_sub2;
		p.columnItmProc_itm_sub2.addAliasName("ItmProc.itm_sub2", p);
		p.columnItmProc_itm_sub3 = p.ItmProc_itm_p_PPanel.columnItm_itm_sub3;
		p.columnItmProc_itm_sub3.addAliasName("ItmProc.itm_sub3", p);
		p.columnItmProc_itm_nm = p.ItmProc_itm_p_PPanel.columnItm_itm_nm;
		p.columnItmProc_itm_nm.addAliasName("ItmProc.itm_nm", p);
		p.ItmProc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.ItmProcR.$qty_p);
		p.ItmProc_qty_p_PPanel.setName("ItmProc.qty_p");
		p.columnItmProc_base_qty = p.ItmProc_qty_p_PPanel.columnQty_qty;
		p.columnItmProc_base_qty.addAliasName("ItmProc.base_qty", p);
		p.ItmProc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMGBD.MGBDP0540.ItmProcR.$upri_p);
		p.ItmProc_upri_p_PPanel.setName("ItmProc.upri_p");
		p.columnItmProc_upri = p.ItmProc_upri_p_PPanel.columnUpri_upri;
		p.columnItmProc_upri.addAliasName("ItmProc.upri", p);
	}

	/**
	 * [ItmProv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmProv(MGBDP_BomExSrch p) {
		p.ItmProv_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0540.ItmProvR.$itm_p);
		p.ItmProv_itm_p_PPanel.setName("ItmProv.itm_p");
		p.columnItmProv_itm_cd = p.ItmProv_itm_p_PPanel.columnItm_itm_cd;
		p.columnItmProv_itm_cd.addAliasName("ItmProv.itm_cd", p);
		p.columnItmProv_itm_sub1 = p.ItmProv_itm_p_PPanel.columnItm_itm_sub1;
		p.columnItmProv_itm_sub1.addAliasName("ItmProv.itm_sub1", p);
		p.columnItmProv_itm_sub2 = p.ItmProv_itm_p_PPanel.columnItm_itm_sub2;
		p.columnItmProv_itm_sub2.addAliasName("ItmProv.itm_sub2", p);
		p.columnItmProv_itm_sub3 = p.ItmProv_itm_p_PPanel.columnItm_itm_sub3;
		p.columnItmProv_itm_sub3.addAliasName("ItmProv.itm_sub3", p);
		p.columnItmProv_itm_nm = p.ItmProv_itm_p_PPanel.columnItm_itm_nm;
		p.columnItmProv_itm_nm.addAliasName("ItmProv.itm_nm", p);
		p.ItmProv_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.ItmProvR.$qty_p);
		p.ItmProv_qty_p_PPanel.setName("ItmProv.qty_p");
		p.columnItmProv_base_qty = p.ItmProv_qty_p_PPanel.columnQty_qty;
		p.columnItmProv_base_qty.addAliasName("ItmProv.base_qty", p);
		p.ItmProv_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMGBD.MGBDP0540.ItmProvR.$upri_p);
		p.ItmProv_upri_p_PPanel.setName("ItmProv.upri_p");
		p.columnItmProv_upri = p.ItmProv_upri_p_PPanel.columnUpri_upri;
		p.columnItmProv_upri.addAliasName("ItmProv.upri", p);
	}

	/**
	 * [ItmSls]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmSls(MGBDP_BomExSrch p) {
		p.ItmSls_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0540.ItmSlsR.$itm_p);
		p.ItmSls_itm_p_PPanel.setName("ItmSls.itm_p");
		p.columnItmSls_itm_cd = p.ItmSls_itm_p_PPanel.columnItm_itm_cd;
		p.columnItmSls_itm_cd.addAliasName("ItmSls.itm_cd", p);
		p.columnItmSls_itm_sub1 = p.ItmSls_itm_p_PPanel.columnItm_itm_sub1;
		p.columnItmSls_itm_sub1.addAliasName("ItmSls.itm_sub1", p);
		p.columnItmSls_itm_sub2 = p.ItmSls_itm_p_PPanel.columnItm_itm_sub2;
		p.columnItmSls_itm_sub2.addAliasName("ItmSls.itm_sub2", p);
		p.columnItmSls_itm_sub3 = p.ItmSls_itm_p_PPanel.columnItm_itm_sub3;
		p.columnItmSls_itm_sub3.addAliasName("ItmSls.itm_sub3", p);
		p.columnItmSls_itm_nm = p.ItmSls_itm_p_PPanel.columnItm_itm_nm;
		p.columnItmSls_itm_nm.addAliasName("ItmSls.itm_nm", p);
		p.ItmSls_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.ItmSlsR.$qty_p);
		p.ItmSls_qty_p_PPanel.setName("ItmSls.qty_p");
		p.columnItmSls_base_qty = p.ItmSls_qty_p_PPanel.columnQty_qty;
		p.columnItmSls_base_qty.addAliasName("ItmSls.base_qty", p);
		p.ItmSls_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMGBD.MGBDP0540.ItmSlsR.$upri_p);
		p.ItmSls_upri_p_PPanel.setName("ItmSls.upri_p");
		p.columnItmSls_upri = p.ItmSls_upri_p_PPanel.columnUpri_upri;
		p.columnItmSls_upri.addAliasName("ItmSls.upri", p);
	}

	/**
	 * [ItmFix]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmFix(MGBDP_BomExSrch p) {
		p.ItmFix_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0540.ItmFixR.$itm_p);
		p.ItmFix_itm_p_PPanel.setName("ItmFix.itm_p");
		p.columnItmFix_itm_cd = p.ItmFix_itm_p_PPanel.columnItm_itm_cd;
		p.columnItmFix_itm_cd.addAliasName("ItmFix.itm_cd", p);
		p.columnItmFix_itm_sub1 = p.ItmFix_itm_p_PPanel.columnItm_itm_sub1;
		p.columnItmFix_itm_sub1.addAliasName("ItmFix.itm_sub1", p);
		p.columnItmFix_itm_sub2 = p.ItmFix_itm_p_PPanel.columnItm_itm_sub2;
		p.columnItmFix_itm_sub2.addAliasName("ItmFix.itm_sub2", p);
		p.columnItmFix_itm_sub3 = p.ItmFix_itm_p_PPanel.columnItm_itm_sub3;
		p.columnItmFix_itm_sub3.addAliasName("ItmFix.itm_sub3", p);
		p.columnItmFix_itm_nm = p.ItmFix_itm_p_PPanel.columnItm_itm_nm;
		p.columnItmFix_itm_nm.addAliasName("ItmFix.itm_nm", p);
		p.ItmFix_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0540.ItmFixR.$qty_p);
		p.ItmFix_qty_p_PPanel.setName("ItmFix.qty_p");
		p.columnItmFix_base_qty = p.ItmFix_qty_p_PPanel.columnQty_qty;
		p.columnItmFix_base_qty.addAliasName("ItmFix.base_qty", p);
		p.ItmFix_std_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMGBD.MGBDP0540.ItmFixR.$std_upri_p);
		p.ItmFix_std_upri_p_PPanel.setName("ItmFix.std_upri_p");
		p.columnItmFix_std_upri = p.ItmFix_std_upri_p_PPanel.columnUpri_upri;
		p.columnItmFix_std_upri.addAliasName("ItmFix.std_upri", p);
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
	
	
	/** [Cnd_bom_ptn_ListPutter]の定義 */
	private MCListPutter Cnd_bom_ptn_p = null;

	/**
	 * [Cnd_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bom_ptn_ListPutter() {
		if (Cnd_bom_ptn_p == null) {
			Cnd_bom_ptn_p = createCnd_bom_ptn_ListPutter(Cnd_bom_ptn, "bom_ptn");

		}
		return Cnd_bom_ptn_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_BomExSrch create(){
		MGBDP_BomExSrch p = new MGBDP_BomExSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_BomExSrch create(String name){
		MGBDP_BomExSrch p = new MGBDP_BomExSrch(name);
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
		MGBDP_BomExSrch_MC.jbfInitScreenOpe((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitTop((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitCnd((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitCtrl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitRPnl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitDtlPnl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitDtl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitBtn((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitBottom((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitItm((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitItmDtl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitItmOper((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitItmWk((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitItmPurc((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitItmProc((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitItmProv((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitItmSls((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbfInitItmFix((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitScreenOpe((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitTop((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitCnd((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitCtrl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitRPnl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitDtlPnl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitDtl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitBtn((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitBottom((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitItm((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitItmDtl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitItmOper((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitItmWk((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitItmPurc((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitItmProc((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitItmProv((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitItmSls((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.jbInitItmFix((MGBDP_BomExSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_EX1 = p.beansFactory.createRadioButton("Cnd.ope_EX1");
		p.Cnd_ope_EX2 = p.beansFactory.createRadioButton("Cnd.ope_EX2");
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_itm_is_srch_typ = p.beansFactory.createTextField("Cnd.itm_is_srch_typ");
		p.Cnd_bom_ptn_Label = p.beansFactory.createLabel("Cnd.bom_ptn_Label");
		p.Cnd_bom_ptn = p.beansFactory.createTextComboBox("Cnd.bom_ptn");
		p.Cnd_bom_ptn.setLabel(p.Cnd_bom_ptn_Label);
		p.Cnd_par_itm_flg = p.beansFactory.createCheckBox("Cnd.par_itm_flg");
		p.Cnd_chd_itm_flg = p.beansFactory.createCheckBox("Cnd.chd_itm_flg");
		p.Cnd_bom_ptn_flg = p.beansFactory.createCheckBox("Cnd.bom_ptn_flg");
		p.Cnd_max_hrrchy_Label = p.beansFactory.createLabel("Cnd.max_hrrchy_Label");
		p.Cnd_max_hrrchy = p.beansFactory.createNumberField("Cnd.max_hrrchy");
		p.Cnd_max_hrrchy.setLabel(p.Cnd_max_hrrchy_Label);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_srch_all = p.beansFactory.createButton("RPnl.srch_all", "srch");
	}

	/**
	 * [DtlPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlPnl(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.DtlPnlPanel = p.beansFactory.createPanel("DtlPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_bottom_flg = p.beansFactory.createTableColumn("Dtl.bottom_flg", MCColumnType.CHECK);
		p.columnDtl_unreg_flg = p.beansFactory.createTableColumn("Dtl.unreg_flg", MCColumnType.CHECK);
		p.columnDtl_itm_typ = p.beansFactory.createTableColumn("Dtl.itm_typ", MCColumnType.TEXT);
		p.columnDtl_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_itm_jnl_cd = p.beansFactory.createTableColumn("Dtl.itm_jnl_cd", MCColumnType.TEXT);
		p.columnDtl_itm_jnl_nm = p.beansFactory.createTableColumn("Dtl.itm_jnl_nm", MCColumnType.TEXT);
		p.columnDtl_bom_ptn = p.beansFactory.createTableColumn("Dtl.bom_ptn", MCColumnType.TEXT);
		p.columnDtl_oper_cd = p.beansFactory.createTableColumn("Dtl.oper_cd", MCColumnType.TEXT);
		p.columnDtl_oper_nm = p.beansFactory.createTableColumn("Dtl.oper_nm", MCColumnType.TEXT);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_par_unit_cd = p.beansFactory.createTableColumn("Dtl.par_unit_cd", MCColumnType.TEXT);
		p.columnDtl_par_unit_nm = p.beansFactory.createTableColumn("Dtl.par_unit_nm", MCColumnType.TEXT);
		p.columnDtl_par_dec_place = p.beansFactory.createTableColumn("Dtl.par_dec_place", MCColumnType.NUMBER);
		p.columnDtl_chd_unit_cd = p.beansFactory.createTableColumn("Dtl.chd_unit_cd", MCColumnType.TEXT);
		p.columnDtl_chd_unit_nm = p.beansFactory.createTableColumn("Dtl.chd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_chd_dec_place = p.beansFactory.createTableColumn("Dtl.chd_dec_place", MCColumnType.NUMBER);
		p.columnDtl_alt_grp_cd = p.beansFactory.createTableColumn("Dtl.alt_grp_cd", MCColumnType.TEXT);
		p.columnDtl_alt_itm_ratio = p.beansFactory.createTableColumn("Dtl.alt_itm_ratio", MCColumnType.NUMBER);
		p.columnDtl_expns_cd = p.beansFactory.createTableColumn("Dtl.expns_cd", MCColumnType.TEXT);
		p.columnDtl_expns_nm = p.beansFactory.createTableColumn("Dtl.expns_nm", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_calc_ctg_cd = p.beansFactory.createTableColumn("Dtl.calc_ctg_cd", MCColumnType.TEXT);
		p.columnDtl_calc_ctg_nm = p.beansFactory.createTableColumn("Dtl.calc_ctg_nm", MCColumnType.TEXT);
		p.columnDtl_itm_calc_ctg_cd = p.beansFactory.createTableColumn("Dtl.itm_calc_ctg_cd", MCColumnType.TEXT);
		p.columnDtl_itm_calc_ctg_nm = p.beansFactory.createTableColumn("Dtl.itm_calc_ctg_nm", MCColumnType.TEXT);
		p.columnDtl_dtl_calc_ctg_cd = p.beansFactory.createTableColumn("Dtl.dtl_calc_ctg_cd", MCColumnType.TEXT);
		p.columnDtl_dtl_calc_ctg_nm = p.beansFactory.createTableColumn("Dtl.dtl_calc_ctg_nm", MCColumnType.TEXT);
		p.columnDtl_purc_calc_ctg_cd = p.beansFactory.createTableColumn("Dtl.purc_calc_ctg_cd", MCColumnType.TEXT);
		p.columnDtl_purc_calc_ctg_nm = p.beansFactory.createTableColumn("Dtl.purc_calc_ctg_nm", MCColumnType.TEXT);
		p.columnDtl_proc_calc_ctg_cd = p.beansFactory.createTableColumn("Dtl.proc_calc_ctg_cd", MCColumnType.TEXT);
		p.columnDtl_proc_calc_ctg_nm = p.beansFactory.createTableColumn("Dtl.proc_calc_ctg_nm", MCColumnType.TEXT);
		p.columnDtl_prov_calc_ctg_cd = p.beansFactory.createTableColumn("Dtl.prov_calc_ctg_cd", MCColumnType.TEXT);
		p.columnDtl_prov_calc_ctg_nm = p.beansFactory.createTableColumn("Dtl.prov_calc_ctg_nm", MCColumnType.TEXT);
		p.columnDtl_sls_calc_ctg_cd = p.beansFactory.createTableColumn("Dtl.sls_calc_ctg_cd", MCColumnType.TEXT);
		p.columnDtl_sls_calc_ctg_nm = p.beansFactory.createTableColumn("Dtl.sls_calc_ctg_nm", MCColumnType.TEXT);
		p.columnDtl_fix_calc_ctg_cd = p.beansFactory.createTableColumn("Dtl.fix_calc_ctg_cd", MCColumnType.TEXT);
		p.columnDtl_fix_calc_ctg_nm = p.beansFactory.createTableColumn("Dtl.fix_calc_ctg_nm", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_srch_dtl = p.beansFactory.createButton("Btn.srch_dtl", "srch");
		p.Btn_open_MGBDP0540_ex1 = p.beansFactory.createButton("Btn.open_MGBDP0540_ex1", "open");
		p.Btn_open_MGBDP0540_ex2 = p.beansFactory.createButton("Btn.open_MGBDP0540_ex2", "open");
		p.Btn_open_MGBDP0520 = p.beansFactory.createButton("Btn.open_MGBDP0520", "open");
		p.Btn_open_MGBDP0530 = p.beansFactory.createButton("Btn.open_MGBDP0530", "open");
		p.Btn_open_MGBDP0530_chd = p.beansFactory.createButton("Btn.open_MGBDP0530_chd", "open");
	}

	/**
	 * [Bottom]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBottom(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.BottomPanel = p.beansFactory.createPanel("Bottom");
		p.BottomTab = p.beansFactory.createTabbedPane("Bottom.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Itm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItm(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmPanel = p.beansFactory.createPanel("Itm");
		p.ItmScrollPane = p.beansFactory.createScrollPane("Itm.scroll");
		p.createItmTable();
		// ブロックの項目の初期化
		p.columnItm_calc_ctg_cd = p.beansFactory.createTableColumn("Itm.calc_ctg_cd", MCColumnType.TEXT);
		p.columnItm_calc_ctg_nm = p.beansFactory.createTableColumn("Itm.calc_ctg_nm", MCColumnType.TEXT);
		p.columnItm_wg_cd = p.beansFactory.createTableColumn("Itm.wg_cd", MCColumnType.TEXT);
		p.columnItm_wg_nm = p.beansFactory.createTableColumn("Itm.wg_nm", MCColumnType.TEXT);
		p.columnItm_calc_ptn_cd = p.beansFactory.createTableColumn("Itm.calc_ptn_cd", MCColumnType.TEXT);
		p.columnItm_calc_ptn_nm = p.beansFactory.createTableColumn("Itm.calc_ptn_nm", MCColumnType.TEXT);
		p.columnItm_unit_cd = p.beansFactory.createTableColumn("Itm.unit_cd", MCColumnType.TEXT);
		p.columnItm_unit_nm = p.beansFactory.createTableColumn("Itm.unit_nm", MCColumnType.TEXT);
		p.columnItm_dec_place = p.beansFactory.createTableColumn("Itm.dec_place", MCColumnType.NUMBER);
		p.columnItm_rmrks = p.beansFactory.createTableColumn("Itm.rmrks", MCColumnType.TEXT);
		p.columnItm_sub_char1 = p.beansFactory.createTableColumn("Itm.sub_char1", MCColumnType.TEXT);
		p.columnItm_sub_char2 = p.beansFactory.createTableColumn("Itm.sub_char2", MCColumnType.TEXT);
		p.columnItm_sub_char3 = p.beansFactory.createTableColumn("Itm.sub_char3", MCColumnType.TEXT);
		p.columnItm_non_calc_flg = p.beansFactory.createTableColumn("Itm.non_calc_flg", MCColumnType.CHECK);
		p.columnItm_ins_usr_id = p.beansFactory.createTableColumn("Itm.ins_usr_id", MCColumnType.TEXT);
		p.columnItm_ins_usr_nm = p.beansFactory.createTableColumn("Itm.ins_usr_nm", MCColumnType.TEXT);
		p.columnItm_ins_func_id = p.beansFactory.createTableColumn("Itm.ins_func_id", MCColumnType.TEXT);
		p.columnItm_ins_func_nm = p.beansFactory.createTableColumn("Itm.ins_func_nm", MCColumnType.TEXT);
		p.columnItm_ins_ts = p.beansFactory.createTableColumn("Itm.ins_ts", MCColumnType.TIMESTAMP);
		p.columnItm_upd_usr_id = p.beansFactory.createTableColumn("Itm.upd_usr_id", MCColumnType.TEXT);
		p.columnItm_upd_usr_nm = p.beansFactory.createTableColumn("Itm.upd_usr_nm", MCColumnType.TEXT);
		p.columnItm_upd_func_id = p.beansFactory.createTableColumn("Itm.upd_func_id", MCColumnType.TEXT);
		p.columnItm_upd_func_nm = p.beansFactory.createTableColumn("Itm.upd_func_nm", MCColumnType.TEXT);
		p.columnItm_upd_ts = p.beansFactory.createTableColumn("Itm.upd_ts", MCColumnType.TIMESTAMP);
		p.columnItm_upd_srv_req_no = p.beansFactory.createTableColumn("Itm.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [ItmDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmDtl(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmDtlPanel = p.beansFactory.createPanel("ItmDtl");
		p.ItmDtlScrollPane = p.beansFactory.createScrollPane("ItmDtl.scroll");
		p.createItmDtlTable();
		// ブロックの項目の初期化
		p.columnItmDtl_calc_ctg_cd = p.beansFactory.createTableColumn("ItmDtl.calc_ctg_cd", MCColumnType.TEXT);
		p.columnItmDtl_calc_ctg_nm = p.beansFactory.createTableColumn("ItmDtl.calc_ctg_nm", MCColumnType.TEXT);
		p.columnItmDtl_wg_cd = p.beansFactory.createTableColumn("ItmDtl.wg_cd", MCColumnType.TEXT);
		p.columnItmDtl_wg_nm = p.beansFactory.createTableColumn("ItmDtl.wg_nm", MCColumnType.TEXT);
		p.columnItmDtl_loc_cd = p.beansFactory.createTableColumn("ItmDtl.loc_cd", MCColumnType.TEXT);
		p.columnItmDtl_loc_nm = p.beansFactory.createTableColumn("ItmDtl.loc_nm", MCColumnType.TEXT);
		p.columnItmDtl_sppl_cd = p.beansFactory.createTableColumn("ItmDtl.sppl_cd", MCColumnType.TEXT);
		p.columnItmDtl_sppl_nm = p.beansFactory.createTableColumn("ItmDtl.sppl_nm", MCColumnType.TEXT);
		p.columnItmDtl_rqst_wg_cd = p.beansFactory.createTableColumn("ItmDtl.rqst_wg_cd", MCColumnType.TEXT);
		p.columnItmDtl_rqst_wg_nm = p.beansFactory.createTableColumn("ItmDtl.rqst_wg_nm", MCColumnType.TEXT);
		p.columnItmDtl_cost_ratio = p.beansFactory.createTableColumn("ItmDtl.cost_ratio", MCColumnType.NUMBER);
		p.columnItmDtl_oper_ptn = p.beansFactory.createTableColumn("ItmDtl.oper_ptn", MCColumnType.TEXT);
		p.columnItmDtl_bom_ptn = p.beansFactory.createTableColumn("ItmDtl.bom_ptn", MCColumnType.TEXT);
		p.columnItmDtl_unit_cd = p.beansFactory.createTableColumn("ItmDtl.unit_cd", MCColumnType.TEXT);
		p.columnItmDtl_unit_nm = p.beansFactory.createTableColumn("ItmDtl.unit_nm", MCColumnType.TEXT);
		p.columnItmDtl_dec_place = p.beansFactory.createTableColumn("ItmDtl.dec_place", MCColumnType.NUMBER);
		p.columnItmDtl_alc_dpt_cd = p.beansFactory.createTableColumn("ItmDtl.alc_dpt_cd", MCColumnType.TEXT);
		p.columnItmDtl_alc_dpt_nm = p.beansFactory.createTableColumn("ItmDtl.alc_dpt_nm", MCColumnType.TEXT);
		p.columnItmDtl_exp_dpt_cd = p.beansFactory.createTableColumn("ItmDtl.exp_dpt_cd", MCColumnType.TEXT);
		p.columnItmDtl_exp_dpt_nm = p.beansFactory.createTableColumn("ItmDtl.exp_dpt_nm", MCColumnType.TEXT);
		p.columnItmDtl_exp_prio = p.beansFactory.createTableColumn("ItmDtl.exp_prio", MCColumnType.NUMBER);
		p.columnItmDtl_alc_val1 = p.beansFactory.createTableColumn("ItmDtl.alc_val1", MCColumnType.NUMBER);
		p.columnItmDtl_alc_val2 = p.beansFactory.createTableColumn("ItmDtl.alc_val2", MCColumnType.NUMBER);
		p.columnItmDtl_alc_val3 = p.beansFactory.createTableColumn("ItmDtl.alc_val3", MCColumnType.NUMBER);
		p.columnItmDtl_alc_val4 = p.beansFactory.createTableColumn("ItmDtl.alc_val4", MCColumnType.NUMBER);
		p.columnItmDtl_alc_val5 = p.beansFactory.createTableColumn("ItmDtl.alc_val5", MCColumnType.NUMBER);
		p.columnItmDtl_rmrks = p.beansFactory.createTableColumn("ItmDtl.rmrks", MCColumnType.TEXT);
		p.columnItmDtl_sub_char1 = p.beansFactory.createTableColumn("ItmDtl.sub_char1", MCColumnType.TEXT);
		p.columnItmDtl_sub_char2 = p.beansFactory.createTableColumn("ItmDtl.sub_char2", MCColumnType.TEXT);
		p.columnItmDtl_sub_char3 = p.beansFactory.createTableColumn("ItmDtl.sub_char3", MCColumnType.TEXT);
		p.columnItmDtl_non_calc_flg = p.beansFactory.createTableColumn("ItmDtl.non_calc_flg", MCColumnType.CHECK);
		p.columnItmDtl_ins_usr_id = p.beansFactory.createTableColumn("ItmDtl.ins_usr_id", MCColumnType.TEXT);
		p.columnItmDtl_ins_usr_nm = p.beansFactory.createTableColumn("ItmDtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnItmDtl_ins_func_id = p.beansFactory.createTableColumn("ItmDtl.ins_func_id", MCColumnType.TEXT);
		p.columnItmDtl_ins_func_nm = p.beansFactory.createTableColumn("ItmDtl.ins_func_nm", MCColumnType.TEXT);
		p.columnItmDtl_ins_ts = p.beansFactory.createTableColumn("ItmDtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnItmDtl_upd_usr_id = p.beansFactory.createTableColumn("ItmDtl.upd_usr_id", MCColumnType.TEXT);
		p.columnItmDtl_upd_usr_nm = p.beansFactory.createTableColumn("ItmDtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnItmDtl_upd_func_id = p.beansFactory.createTableColumn("ItmDtl.upd_func_id", MCColumnType.TEXT);
		p.columnItmDtl_upd_func_nm = p.beansFactory.createTableColumn("ItmDtl.upd_func_nm", MCColumnType.TEXT);
		p.columnItmDtl_upd_ts = p.beansFactory.createTableColumn("ItmDtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnItmDtl_upd_srv_req_no = p.beansFactory.createTableColumn("ItmDtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [ItmOper]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmOper(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmOperPanel = p.beansFactory.createPanel("ItmOper");
		p.ItmOperScrollPane = p.beansFactory.createScrollPane("ItmOper.scroll");
		p.createItmOperTable();
		// ブロックの項目の初期化
		p.columnItmOper_calc_ctg_cd = p.beansFactory.createTableColumn("ItmOper.calc_ctg_cd", MCColumnType.TEXT);
		p.columnItmOper_calc_ctg_nm = p.beansFactory.createTableColumn("ItmOper.calc_ctg_nm", MCColumnType.TEXT);
		p.columnItmOper_wg_cd = p.beansFactory.createTableColumn("ItmOper.wg_cd", MCColumnType.TEXT);
		p.columnItmOper_wg_nm = p.beansFactory.createTableColumn("ItmOper.wg_nm", MCColumnType.TEXT);
		p.columnItmOper_loc_cd = p.beansFactory.createTableColumn("ItmOper.loc_cd", MCColumnType.TEXT);
		p.columnItmOper_loc_nm = p.beansFactory.createTableColumn("ItmOper.loc_nm", MCColumnType.TEXT);
		p.columnItmOper_oper_ptn = p.beansFactory.createTableColumn("ItmOper.oper_ptn", MCColumnType.TEXT);
		p.columnItmOper_oper_cd = p.beansFactory.createTableColumn("ItmOper.oper_cd", MCColumnType.TEXT);
		p.columnItmOper_oper_nm = p.beansFactory.createTableColumn("ItmOper.oper_nm", MCColumnType.TEXT);
		p.columnItmOper_oper_seq = p.beansFactory.createTableColumn("ItmOper.oper_seq", MCColumnType.NUMBER);
		p.columnItmOper_disp_seq = p.beansFactory.createTableColumn("ItmOper.disp_seq", MCColumnType.NUMBER);
		p.columnItmOper_yield_oper_flg = p.beansFactory.createTableColumn("ItmOper.yield_oper_flg", MCColumnType.CHECK);
		p.columnItmOper_nmr_qty = p.beansFactory.createTableColumn("ItmOper.nmr_qty", MCColumnType.NUMBER);
		p.columnItmOper_dnm_qty = p.beansFactory.createTableColumn("ItmOper.dnm_qty", MCColumnType.NUMBER);
		p.columnItmOper_unit_cd = p.beansFactory.createTableColumn("ItmOper.unit_cd", MCColumnType.TEXT);
		p.columnItmOper_unit_nm = p.beansFactory.createTableColumn("ItmOper.unit_nm", MCColumnType.TEXT);
		p.columnItmOper_oper_unit_cd = p.beansFactory.createTableColumn("ItmOper.oper_unit_cd", MCColumnType.TEXT);
		p.columnItmOper_oper_unit_nm = p.beansFactory.createTableColumn("ItmOper.oper_unit_nm", MCColumnType.TEXT);
		p.columnItmOper_oper_std_qty = p.beansFactory.createTableColumn("ItmOper.oper_std_qty", MCColumnType.NUMBER);
		p.columnItmOper_oper_conv_qty = p.beansFactory.createTableColumn("ItmOper.oper_conv_qty", MCColumnType.NUMBER);
		p.columnItmOper_dec_place = p.beansFactory.createTableColumn("ItmOper.dec_place", MCColumnType.NUMBER);
		p.columnItmOper_unit_conv_rnd_typ = p.beansFactory.createTableColumn("ItmOper.unit_conv_rnd_typ", MCColumnType.TEXT);
		p.columnItmOper_unit_conv_rnd_typ_nm = p.beansFactory.createTableColumn("ItmOper.unit_conv_rnd_typ_nm", MCColumnType.TEXT);
		p.columnItmOper_rmrks = p.beansFactory.createTableColumn("ItmOper.rmrks", MCColumnType.TEXT);
		p.columnItmOper_sub_char1 = p.beansFactory.createTableColumn("ItmOper.sub_char1", MCColumnType.TEXT);
		p.columnItmOper_sub_char2 = p.beansFactory.createTableColumn("ItmOper.sub_char2", MCColumnType.TEXT);
		p.columnItmOper_sub_char3 = p.beansFactory.createTableColumn("ItmOper.sub_char3", MCColumnType.TEXT);
		p.columnItmOper_non_calc_flg = p.beansFactory.createTableColumn("ItmOper.non_calc_flg", MCColumnType.CHECK);
		p.columnItmOper_ins_usr_id = p.beansFactory.createTableColumn("ItmOper.ins_usr_id", MCColumnType.TEXT);
		p.columnItmOper_ins_usr_nm = p.beansFactory.createTableColumn("ItmOper.ins_usr_nm", MCColumnType.TEXT);
		p.columnItmOper_ins_func_id = p.beansFactory.createTableColumn("ItmOper.ins_func_id", MCColumnType.TEXT);
		p.columnItmOper_ins_func_nm = p.beansFactory.createTableColumn("ItmOper.ins_func_nm", MCColumnType.TEXT);
		p.columnItmOper_ins_ts = p.beansFactory.createTableColumn("ItmOper.ins_ts", MCColumnType.TIMESTAMP);
		p.columnItmOper_upd_usr_id = p.beansFactory.createTableColumn("ItmOper.upd_usr_id", MCColumnType.TEXT);
		p.columnItmOper_upd_usr_nm = p.beansFactory.createTableColumn("ItmOper.upd_usr_nm", MCColumnType.TEXT);
		p.columnItmOper_upd_func_id = p.beansFactory.createTableColumn("ItmOper.upd_func_id", MCColumnType.TEXT);
		p.columnItmOper_upd_func_nm = p.beansFactory.createTableColumn("ItmOper.upd_func_nm", MCColumnType.TEXT);
		p.columnItmOper_upd_ts = p.beansFactory.createTableColumn("ItmOper.upd_ts", MCColumnType.TIMESTAMP);
		p.columnItmOper_upd_srv_req_no = p.beansFactory.createTableColumn("ItmOper.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [ItmWk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmWk(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmWkPanel = p.beansFactory.createPanel("ItmWk");
		p.ItmWkScrollPane = p.beansFactory.createScrollPane("ItmWk.scroll");
		p.createItmWkTable();
		// ブロックの項目の初期化
		p.columnItmWk_calc_ctg_cd = p.beansFactory.createTableColumn("ItmWk.calc_ctg_cd", MCColumnType.TEXT);
		p.columnItmWk_calc_ctg_nm = p.beansFactory.createTableColumn("ItmWk.calc_ctg_nm", MCColumnType.TEXT);
		p.columnItmWk_wg_cd = p.beansFactory.createTableColumn("ItmWk.wg_cd", MCColumnType.TEXT);
		p.columnItmWk_wg_nm = p.beansFactory.createTableColumn("ItmWk.wg_nm", MCColumnType.TEXT);
		p.columnItmWk_loc_cd = p.beansFactory.createTableColumn("ItmWk.loc_cd", MCColumnType.TEXT);
		p.columnItmWk_loc_nm = p.beansFactory.createTableColumn("ItmWk.loc_nm", MCColumnType.TEXT);
		p.columnItmWk_oper_ptn = p.beansFactory.createTableColumn("ItmWk.oper_ptn", MCColumnType.TEXT);
		p.columnItmWk_oper_cd = p.beansFactory.createTableColumn("ItmWk.oper_cd", MCColumnType.TEXT);
		p.columnItmWk_oper_nm = p.beansFactory.createTableColumn("ItmWk.oper_nm", MCColumnType.TEXT);
		p.columnItmWk_oper_seq = p.beansFactory.createTableColumn("ItmWk.oper_seq", MCColumnType.NUMBER);
		p.columnItmWk_wk_cost_cd = p.beansFactory.createTableColumn("ItmWk.wk_cost_cd", MCColumnType.TEXT);
		p.columnItmWk_wk_cost_nm = p.beansFactory.createTableColumn("ItmWk.wk_cost_nm", MCColumnType.TEXT);
		p.columnItmWk_unit_cd = p.beansFactory.createTableColumn("ItmWk.unit_cd", MCColumnType.TEXT);
		p.columnItmWk_unit_nm = p.beansFactory.createTableColumn("ItmWk.unit_nm", MCColumnType.TEXT);
		p.columnItmWk_dec_place = p.beansFactory.createTableColumn("ItmWk.dec_place", MCColumnType.NUMBER);
		p.columnItmWk_wk_cost_unit_nm = p.beansFactory.createTableColumn("ItmWk.wk_cost_unit_nm", MCColumnType.TEXT);
		p.columnItmWk_wk_cost_dec_place = p.beansFactory.createTableColumn("ItmWk.wk_cost_dec_place", MCColumnType.NUMBER);
		p.columnItmWk_rmrks = p.beansFactory.createTableColumn("ItmWk.rmrks", MCColumnType.TEXT);
		p.columnItmWk_sub_char1 = p.beansFactory.createTableColumn("ItmWk.sub_char1", MCColumnType.TEXT);
		p.columnItmWk_sub_char2 = p.beansFactory.createTableColumn("ItmWk.sub_char2", MCColumnType.TEXT);
		p.columnItmWk_sub_char3 = p.beansFactory.createTableColumn("ItmWk.sub_char3", MCColumnType.TEXT);
		p.columnItmWk_non_calc_flg = p.beansFactory.createTableColumn("ItmWk.non_calc_flg", MCColumnType.CHECK);
		p.columnItmWk_ins_usr_id = p.beansFactory.createTableColumn("ItmWk.ins_usr_id", MCColumnType.TEXT);
		p.columnItmWk_ins_usr_nm = p.beansFactory.createTableColumn("ItmWk.ins_usr_nm", MCColumnType.TEXT);
		p.columnItmWk_ins_func_id = p.beansFactory.createTableColumn("ItmWk.ins_func_id", MCColumnType.TEXT);
		p.columnItmWk_ins_func_nm = p.beansFactory.createTableColumn("ItmWk.ins_func_nm", MCColumnType.TEXT);
		p.columnItmWk_ins_ts = p.beansFactory.createTableColumn("ItmWk.ins_ts", MCColumnType.TIMESTAMP);
		p.columnItmWk_upd_usr_id = p.beansFactory.createTableColumn("ItmWk.upd_usr_id", MCColumnType.TEXT);
		p.columnItmWk_upd_usr_nm = p.beansFactory.createTableColumn("ItmWk.upd_usr_nm", MCColumnType.TEXT);
		p.columnItmWk_upd_func_id = p.beansFactory.createTableColumn("ItmWk.upd_func_id", MCColumnType.TEXT);
		p.columnItmWk_upd_func_nm = p.beansFactory.createTableColumn("ItmWk.upd_func_nm", MCColumnType.TEXT);
		p.columnItmWk_upd_ts = p.beansFactory.createTableColumn("ItmWk.upd_ts", MCColumnType.TIMESTAMP);
		p.columnItmWk_upd_srv_req_no = p.beansFactory.createTableColumn("ItmWk.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [ItmPurc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmPurc(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmPurcPanel = p.beansFactory.createPanel("ItmPurc");
		p.ItmPurcScrollPane = p.beansFactory.createScrollPane("ItmPurc.scroll");
		p.createItmPurcTable();
		// ブロックの項目の初期化
		p.columnItmPurc_calc_ctg_cd = p.beansFactory.createTableColumn("ItmPurc.calc_ctg_cd", MCColumnType.TEXT);
		p.columnItmPurc_calc_ctg_nm = p.beansFactory.createTableColumn("ItmPurc.calc_ctg_nm", MCColumnType.TEXT);
		p.columnItmPurc_wg_cd = p.beansFactory.createTableColumn("ItmPurc.wg_cd", MCColumnType.TEXT);
		p.columnItmPurc_wg_nm = p.beansFactory.createTableColumn("ItmPurc.wg_nm", MCColumnType.TEXT);
		p.columnItmPurc_sppl_cd = p.beansFactory.createTableColumn("ItmPurc.sppl_cd", MCColumnType.TEXT);
		p.columnItmPurc_sppl_nm = p.beansFactory.createTableColumn("ItmPurc.sppl_nm", MCColumnType.TEXT);
		p.columnItmPurc_unit_cd = p.beansFactory.createTableColumn("ItmPurc.unit_cd", MCColumnType.TEXT);
		p.columnItmPurc_unit_nm = p.beansFactory.createTableColumn("ItmPurc.unit_nm", MCColumnType.TEXT);
		p.columnItmPurc_dec_place = p.beansFactory.createTableColumn("ItmPurc.dec_place", MCColumnType.NUMBER);
		p.columnItmPurc_cur_cd = p.beansFactory.createTableColumn("ItmPurc.cur_cd", MCColumnType.TEXT);
		p.columnItmPurc_cur_nm = p.beansFactory.createTableColumn("ItmPurc.cur_nm", MCColumnType.TEXT);
		p.columnItmPurc_upri_dec_place = p.beansFactory.createTableColumn("ItmPurc.upri_dec_place", MCColumnType.NUMBER);
		p.columnItmPurc_cost_ratio = p.beansFactory.createTableColumn("ItmPurc.cost_ratio", MCColumnType.NUMBER);
		p.columnItmPurc_rmrks = p.beansFactory.createTableColumn("ItmPurc.rmrks", MCColumnType.TEXT);
		p.columnItmPurc_sub_char1 = p.beansFactory.createTableColumn("ItmPurc.sub_char1", MCColumnType.TEXT);
		p.columnItmPurc_sub_char2 = p.beansFactory.createTableColumn("ItmPurc.sub_char2", MCColumnType.TEXT);
		p.columnItmPurc_sub_char3 = p.beansFactory.createTableColumn("ItmPurc.sub_char3", MCColumnType.TEXT);
		p.columnItmPurc_non_calc_flg = p.beansFactory.createTableColumn("ItmPurc.non_calc_flg", MCColumnType.CHECK);
		p.columnItmPurc_ins_usr_id = p.beansFactory.createTableColumn("ItmPurc.ins_usr_id", MCColumnType.TEXT);
		p.columnItmPurc_ins_usr_nm = p.beansFactory.createTableColumn("ItmPurc.ins_usr_nm", MCColumnType.TEXT);
		p.columnItmPurc_ins_func_id = p.beansFactory.createTableColumn("ItmPurc.ins_func_id", MCColumnType.TEXT);
		p.columnItmPurc_ins_func_nm = p.beansFactory.createTableColumn("ItmPurc.ins_func_nm", MCColumnType.TEXT);
		p.columnItmPurc_ins_ts = p.beansFactory.createTableColumn("ItmPurc.ins_ts", MCColumnType.TIMESTAMP);
		p.columnItmPurc_upd_usr_id = p.beansFactory.createTableColumn("ItmPurc.upd_usr_id", MCColumnType.TEXT);
		p.columnItmPurc_upd_usr_nm = p.beansFactory.createTableColumn("ItmPurc.upd_usr_nm", MCColumnType.TEXT);
		p.columnItmPurc_upd_func_id = p.beansFactory.createTableColumn("ItmPurc.upd_func_id", MCColumnType.TEXT);
		p.columnItmPurc_upd_func_nm = p.beansFactory.createTableColumn("ItmPurc.upd_func_nm", MCColumnType.TEXT);
		p.columnItmPurc_upd_ts = p.beansFactory.createTableColumn("ItmPurc.upd_ts", MCColumnType.TIMESTAMP);
		p.columnItmPurc_upd_srv_req_no = p.beansFactory.createTableColumn("ItmPurc.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [ItmProc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmProc(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmProcPanel = p.beansFactory.createPanel("ItmProc");
		p.ItmProcScrollPane = p.beansFactory.createScrollPane("ItmProc.scroll");
		p.createItmProcTable();
		// ブロックの項目の初期化
		p.columnItmProc_calc_ctg_cd = p.beansFactory.createTableColumn("ItmProc.calc_ctg_cd", MCColumnType.TEXT);
		p.columnItmProc_calc_ctg_nm = p.beansFactory.createTableColumn("ItmProc.calc_ctg_nm", MCColumnType.TEXT);
		p.columnItmProc_wg_cd = p.beansFactory.createTableColumn("ItmProc.wg_cd", MCColumnType.TEXT);
		p.columnItmProc_wg_nm = p.beansFactory.createTableColumn("ItmProc.wg_nm", MCColumnType.TEXT);
		p.columnItmProc_sppl_cd = p.beansFactory.createTableColumn("ItmProc.sppl_cd", MCColumnType.TEXT);
		p.columnItmProc_sppl_nm = p.beansFactory.createTableColumn("ItmProc.sppl_nm", MCColumnType.TEXT);
		p.columnItmProc_unit_cd = p.beansFactory.createTableColumn("ItmProc.unit_cd", MCColumnType.TEXT);
		p.columnItmProc_unit_nm = p.beansFactory.createTableColumn("ItmProc.unit_nm", MCColumnType.TEXT);
		p.columnItmProc_dec_place = p.beansFactory.createTableColumn("ItmProc.dec_place", MCColumnType.NUMBER);
		p.columnItmProc_cur_cd = p.beansFactory.createTableColumn("ItmProc.cur_cd", MCColumnType.TEXT);
		p.columnItmProc_cur_nm = p.beansFactory.createTableColumn("ItmProc.cur_nm", MCColumnType.TEXT);
		p.columnItmProc_upri_dec_place = p.beansFactory.createTableColumn("ItmProc.upri_dec_place", MCColumnType.NUMBER);
		p.columnItmProc_cost_ratio = p.beansFactory.createTableColumn("ItmProc.cost_ratio", MCColumnType.NUMBER);
		p.columnItmProc_rmrks = p.beansFactory.createTableColumn("ItmProc.rmrks", MCColumnType.TEXT);
		p.columnItmProc_sub_char1 = p.beansFactory.createTableColumn("ItmProc.sub_char1", MCColumnType.TEXT);
		p.columnItmProc_sub_char2 = p.beansFactory.createTableColumn("ItmProc.sub_char2", MCColumnType.TEXT);
		p.columnItmProc_sub_char3 = p.beansFactory.createTableColumn("ItmProc.sub_char3", MCColumnType.TEXT);
		p.columnItmProc_non_calc_flg = p.beansFactory.createTableColumn("ItmProc.non_calc_flg", MCColumnType.CHECK);
		p.columnItmProc_ins_usr_id = p.beansFactory.createTableColumn("ItmProc.ins_usr_id", MCColumnType.TEXT);
		p.columnItmProc_ins_usr_nm = p.beansFactory.createTableColumn("ItmProc.ins_usr_nm", MCColumnType.TEXT);
		p.columnItmProc_ins_func_id = p.beansFactory.createTableColumn("ItmProc.ins_func_id", MCColumnType.TEXT);
		p.columnItmProc_ins_func_nm = p.beansFactory.createTableColumn("ItmProc.ins_func_nm", MCColumnType.TEXT);
		p.columnItmProc_ins_ts = p.beansFactory.createTableColumn("ItmProc.ins_ts", MCColumnType.TIMESTAMP);
		p.columnItmProc_upd_usr_id = p.beansFactory.createTableColumn("ItmProc.upd_usr_id", MCColumnType.TEXT);
		p.columnItmProc_upd_usr_nm = p.beansFactory.createTableColumn("ItmProc.upd_usr_nm", MCColumnType.TEXT);
		p.columnItmProc_upd_func_id = p.beansFactory.createTableColumn("ItmProc.upd_func_id", MCColumnType.TEXT);
		p.columnItmProc_upd_func_nm = p.beansFactory.createTableColumn("ItmProc.upd_func_nm", MCColumnType.TEXT);
		p.columnItmProc_upd_ts = p.beansFactory.createTableColumn("ItmProc.upd_ts", MCColumnType.TIMESTAMP);
		p.columnItmProc_upd_srv_req_no = p.beansFactory.createTableColumn("ItmProc.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [ItmProv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmProv(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmProvPanel = p.beansFactory.createPanel("ItmProv");
		p.ItmProvScrollPane = p.beansFactory.createScrollPane("ItmProv.scroll");
		p.createItmProvTable();
		// ブロックの項目の初期化
		p.columnItmProv_calc_ctg_cd = p.beansFactory.createTableColumn("ItmProv.calc_ctg_cd", MCColumnType.TEXT);
		p.columnItmProv_calc_ctg_nm = p.beansFactory.createTableColumn("ItmProv.calc_ctg_nm", MCColumnType.TEXT);
		p.columnItmProv_wg_cd = p.beansFactory.createTableColumn("ItmProv.wg_cd", MCColumnType.TEXT);
		p.columnItmProv_wg_nm = p.beansFactory.createTableColumn("ItmProv.wg_nm", MCColumnType.TEXT);
		p.columnItmProv_prsppl_cd = p.beansFactory.createTableColumn("ItmProv.prsppl_cd", MCColumnType.TEXT);
		p.columnItmProv_prsppl_nm = p.beansFactory.createTableColumn("ItmProv.prsppl_nm", MCColumnType.TEXT);
		p.columnItmProv_prov_typ = p.beansFactory.createTableColumn("ItmProv.prov_typ", MCColumnType.TEXT);
		p.columnItmProv_prov_typ_nm = p.beansFactory.createTableColumn("ItmProv.prov_typ_nm", MCColumnType.TEXT);
		p.columnItmProv_unit_cd = p.beansFactory.createTableColumn("ItmProv.unit_cd", MCColumnType.TEXT);
		p.columnItmProv_unit_nm = p.beansFactory.createTableColumn("ItmProv.unit_nm", MCColumnType.TEXT);
		p.columnItmProv_dec_place = p.beansFactory.createTableColumn("ItmProv.dec_place", MCColumnType.NUMBER);
		p.columnItmProv_cur_cd = p.beansFactory.createTableColumn("ItmProv.cur_cd", MCColumnType.TEXT);
		p.columnItmProv_cur_nm = p.beansFactory.createTableColumn("ItmProv.cur_nm", MCColumnType.TEXT);
		p.columnItmProv_upri_dec_place = p.beansFactory.createTableColumn("ItmProv.upri_dec_place", MCColumnType.NUMBER);
		p.columnItmProv_rmrks = p.beansFactory.createTableColumn("ItmProv.rmrks", MCColumnType.TEXT);
		p.columnItmProv_sub_char1 = p.beansFactory.createTableColumn("ItmProv.sub_char1", MCColumnType.TEXT);
		p.columnItmProv_sub_char2 = p.beansFactory.createTableColumn("ItmProv.sub_char2", MCColumnType.TEXT);
		p.columnItmProv_sub_char3 = p.beansFactory.createTableColumn("ItmProv.sub_char3", MCColumnType.TEXT);
		p.columnItmProv_non_calc_flg = p.beansFactory.createTableColumn("ItmProv.non_calc_flg", MCColumnType.CHECK);
		p.columnItmProv_ins_usr_id = p.beansFactory.createTableColumn("ItmProv.ins_usr_id", MCColumnType.TEXT);
		p.columnItmProv_ins_usr_nm = p.beansFactory.createTableColumn("ItmProv.ins_usr_nm", MCColumnType.TEXT);
		p.columnItmProv_ins_func_id = p.beansFactory.createTableColumn("ItmProv.ins_func_id", MCColumnType.TEXT);
		p.columnItmProv_ins_func_nm = p.beansFactory.createTableColumn("ItmProv.ins_func_nm", MCColumnType.TEXT);
		p.columnItmProv_ins_ts = p.beansFactory.createTableColumn("ItmProv.ins_ts", MCColumnType.TIMESTAMP);
		p.columnItmProv_upd_usr_id = p.beansFactory.createTableColumn("ItmProv.upd_usr_id", MCColumnType.TEXT);
		p.columnItmProv_upd_usr_nm = p.beansFactory.createTableColumn("ItmProv.upd_usr_nm", MCColumnType.TEXT);
		p.columnItmProv_upd_func_id = p.beansFactory.createTableColumn("ItmProv.upd_func_id", MCColumnType.TEXT);
		p.columnItmProv_upd_func_nm = p.beansFactory.createTableColumn("ItmProv.upd_func_nm", MCColumnType.TEXT);
		p.columnItmProv_upd_ts = p.beansFactory.createTableColumn("ItmProv.upd_ts", MCColumnType.TIMESTAMP);
		p.columnItmProv_upd_srv_req_no = p.beansFactory.createTableColumn("ItmProv.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [ItmSls]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmSls(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmSlsPanel = p.beansFactory.createPanel("ItmSls");
		p.ItmSlsScrollPane = p.beansFactory.createScrollPane("ItmSls.scroll");
		p.createItmSlsTable();
		// ブロックの項目の初期化
		p.columnItmSls_calc_ctg_cd = p.beansFactory.createTableColumn("ItmSls.calc_ctg_cd", MCColumnType.TEXT);
		p.columnItmSls_calc_ctg_nm = p.beansFactory.createTableColumn("ItmSls.calc_ctg_nm", MCColumnType.TEXT);
		p.columnItmSls_wg_cd = p.beansFactory.createTableColumn("ItmSls.wg_cd", MCColumnType.TEXT);
		p.columnItmSls_wg_nm = p.beansFactory.createTableColumn("ItmSls.wg_nm", MCColumnType.TEXT);
		p.columnItmSls_dpt_cd = p.beansFactory.createTableColumn("ItmSls.dpt_cd", MCColumnType.TEXT);
		p.columnItmSls_dpt_nm = p.beansFactory.createTableColumn("ItmSls.dpt_nm", MCColumnType.TEXT);
		p.columnItmSls_cst_cd = p.beansFactory.createTableColumn("ItmSls.cst_cd", MCColumnType.TEXT);
		p.columnItmSls_cst_nm = p.beansFactory.createTableColumn("ItmSls.cst_nm", MCColumnType.TEXT);
		p.columnItmSls_dlv_cd = p.beansFactory.createTableColumn("ItmSls.dlv_cd", MCColumnType.TEXT);
		p.columnItmSls_dlv_nm = p.beansFactory.createTableColumn("ItmSls.dlv_nm", MCColumnType.TEXT);
		p.columnItmSls_dest_cd1 = p.beansFactory.createTableColumn("ItmSls.dest_cd1", MCColumnType.TEXT);
		p.columnItmSls_dest_nm1 = p.beansFactory.createTableColumn("ItmSls.dest_nm1", MCColumnType.TEXT);
		p.columnItmSls_dest_cd2 = p.beansFactory.createTableColumn("ItmSls.dest_cd2", MCColumnType.TEXT);
		p.columnItmSls_dest_nm2 = p.beansFactory.createTableColumn("ItmSls.dest_nm2", MCColumnType.TEXT);
		p.columnItmSls_dest_cd3 = p.beansFactory.createTableColumn("ItmSls.dest_cd3", MCColumnType.TEXT);
		p.columnItmSls_dest_nm3 = p.beansFactory.createTableColumn("ItmSls.dest_nm3", MCColumnType.TEXT);
		p.columnItmSls_unit_cd = p.beansFactory.createTableColumn("ItmSls.unit_cd", MCColumnType.TEXT);
		p.columnItmSls_unit_nm = p.beansFactory.createTableColumn("ItmSls.unit_nm", MCColumnType.TEXT);
		p.columnItmSls_dec_place = p.beansFactory.createTableColumn("ItmSls.dec_place", MCColumnType.NUMBER);
		p.columnItmSls_cur_cd = p.beansFactory.createTableColumn("ItmSls.cur_cd", MCColumnType.TEXT);
		p.columnItmSls_cur_nm = p.beansFactory.createTableColumn("ItmSls.cur_nm", MCColumnType.TEXT);
		p.columnItmSls_upri_dec_place = p.beansFactory.createTableColumn("ItmSls.upri_dec_place", MCColumnType.NUMBER);
		p.columnItmSls_prio = p.beansFactory.createTableColumn("ItmSls.prio", MCColumnType.NUMBER);
		p.columnItmSls_alc_val1 = p.beansFactory.createTableColumn("ItmSls.alc_val1", MCColumnType.NUMBER);
		p.columnItmSls_alc_val2 = p.beansFactory.createTableColumn("ItmSls.alc_val2", MCColumnType.NUMBER);
		p.columnItmSls_alc_val3 = p.beansFactory.createTableColumn("ItmSls.alc_val3", MCColumnType.NUMBER);
		p.columnItmSls_alc_val4 = p.beansFactory.createTableColumn("ItmSls.alc_val4", MCColumnType.NUMBER);
		p.columnItmSls_alc_val5 = p.beansFactory.createTableColumn("ItmSls.alc_val5", MCColumnType.NUMBER);
		p.columnItmSls_rmrks = p.beansFactory.createTableColumn("ItmSls.rmrks", MCColumnType.TEXT);
		p.columnItmSls_sub_char1 = p.beansFactory.createTableColumn("ItmSls.sub_char1", MCColumnType.TEXT);
		p.columnItmSls_sub_char2 = p.beansFactory.createTableColumn("ItmSls.sub_char2", MCColumnType.TEXT);
		p.columnItmSls_sub_char3 = p.beansFactory.createTableColumn("ItmSls.sub_char3", MCColumnType.TEXT);
		p.columnItmSls_non_calc_flg = p.beansFactory.createTableColumn("ItmSls.non_calc_flg", MCColumnType.CHECK);
		p.columnItmSls_ins_usr_id = p.beansFactory.createTableColumn("ItmSls.ins_usr_id", MCColumnType.TEXT);
		p.columnItmSls_ins_usr_nm = p.beansFactory.createTableColumn("ItmSls.ins_usr_nm", MCColumnType.TEXT);
		p.columnItmSls_ins_func_id = p.beansFactory.createTableColumn("ItmSls.ins_func_id", MCColumnType.TEXT);
		p.columnItmSls_ins_func_nm = p.beansFactory.createTableColumn("ItmSls.ins_func_nm", MCColumnType.TEXT);
		p.columnItmSls_ins_ts = p.beansFactory.createTableColumn("ItmSls.ins_ts", MCColumnType.TIMESTAMP);
		p.columnItmSls_upd_usr_id = p.beansFactory.createTableColumn("ItmSls.upd_usr_id", MCColumnType.TEXT);
		p.columnItmSls_upd_usr_nm = p.beansFactory.createTableColumn("ItmSls.upd_usr_nm", MCColumnType.TEXT);
		p.columnItmSls_upd_func_id = p.beansFactory.createTableColumn("ItmSls.upd_func_id", MCColumnType.TEXT);
		p.columnItmSls_upd_func_nm = p.beansFactory.createTableColumn("ItmSls.upd_func_nm", MCColumnType.TEXT);
		p.columnItmSls_upd_ts = p.beansFactory.createTableColumn("ItmSls.upd_ts", MCColumnType.TIMESTAMP);
		p.columnItmSls_upd_srv_req_no = p.beansFactory.createTableColumn("ItmSls.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [ItmFix]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmFix(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmFixPanel = p.beansFactory.createPanel("ItmFix");
		p.ItmFixScrollPane = p.beansFactory.createScrollPane("ItmFix.scroll");
		p.createItmFixTable();
		// ブロックの項目の初期化
		p.columnItmFix_calc_ctg_cd = p.beansFactory.createTableColumn("ItmFix.calc_ctg_cd", MCColumnType.TEXT);
		p.columnItmFix_calc_ctg_nm = p.beansFactory.createTableColumn("ItmFix.calc_ctg_nm", MCColumnType.TEXT);
		p.columnItmFix_wg_cd = p.beansFactory.createTableColumn("ItmFix.wg_cd", MCColumnType.TEXT);
		p.columnItmFix_wg_nm = p.beansFactory.createTableColumn("ItmFix.wg_nm", MCColumnType.TEXT);
		p.columnItmFix_expns_cd = p.beansFactory.createTableColumn("ItmFix.expns_cd", MCColumnType.TEXT);
		p.columnItmFix_expns_nm = p.beansFactory.createTableColumn("ItmFix.expns_nm", MCColumnType.TEXT);
		p.columnItmFix_unit_cd = p.beansFactory.createTableColumn("ItmFix.unit_cd", MCColumnType.TEXT);
		p.columnItmFix_unit_nm = p.beansFactory.createTableColumn("ItmFix.unit_nm", MCColumnType.TEXT);
		p.columnItmFix_dec_place = p.beansFactory.createTableColumn("ItmFix.dec_place", MCColumnType.NUMBER);
		p.columnItmFix_cur_cd = p.beansFactory.createTableColumn("ItmFix.cur_cd", MCColumnType.TEXT);
		p.columnItmFix_cur_nm = p.beansFactory.createTableColumn("ItmFix.cur_nm", MCColumnType.TEXT);
		p.columnItmFix_std_upri_dec_place = p.beansFactory.createTableColumn("ItmFix.std_upri_dec_place", MCColumnType.NUMBER);
		p.columnItmFix_rmrks = p.beansFactory.createTableColumn("ItmFix.rmrks", MCColumnType.TEXT);
		p.columnItmFix_sub_char1 = p.beansFactory.createTableColumn("ItmFix.sub_char1", MCColumnType.TEXT);
		p.columnItmFix_sub_char2 = p.beansFactory.createTableColumn("ItmFix.sub_char2", MCColumnType.TEXT);
		p.columnItmFix_sub_char3 = p.beansFactory.createTableColumn("ItmFix.sub_char3", MCColumnType.TEXT);
		p.columnItmFix_non_calc_flg = p.beansFactory.createTableColumn("ItmFix.non_calc_flg", MCColumnType.CHECK);
		p.columnItmFix_ins_usr_id = p.beansFactory.createTableColumn("ItmFix.ins_usr_id", MCColumnType.TEXT);
		p.columnItmFix_ins_usr_nm = p.beansFactory.createTableColumn("ItmFix.ins_usr_nm", MCColumnType.TEXT);
		p.columnItmFix_ins_func_id = p.beansFactory.createTableColumn("ItmFix.ins_func_id", MCColumnType.TEXT);
		p.columnItmFix_ins_func_nm = p.beansFactory.createTableColumn("ItmFix.ins_func_nm", MCColumnType.TEXT);
		p.columnItmFix_ins_ts = p.beansFactory.createTableColumn("ItmFix.ins_ts", MCColumnType.TIMESTAMP);
		p.columnItmFix_upd_usr_id = p.beansFactory.createTableColumn("ItmFix.upd_usr_id", MCColumnType.TEXT);
		p.columnItmFix_upd_usr_nm = p.beansFactory.createTableColumn("ItmFix.upd_usr_nm", MCColumnType.TEXT);
		p.columnItmFix_upd_func_id = p.beansFactory.createTableColumn("ItmFix.upd_func_id", MCColumnType.TEXT);
		p.columnItmFix_upd_func_nm = p.beansFactory.createTableColumn("ItmFix.upd_func_nm", MCColumnType.TEXT);
		p.columnItmFix_upd_ts = p.beansFactory.createTableColumn("ItmFix.upd_ts", MCColumnType.TIMESTAMP);
		p.columnItmFix_upd_srv_req_no = p.beansFactory.createTableColumn("ItmFix.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBDP_BomExSrch p) {
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
	protected static void jbInitTop(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.DtlPnlPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.CndPanel, null);
		p.TopPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_EX1);
		p.Cnd_ope_EX1.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_EX1);
		p.ScreenOpePanel.add(p.Cnd_ope_EX1);
		p.Cnd_ope_EX1.setNextBeans(p.Cnd_ope_EX2);
		p.Cnd_ope_EX2.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_EX2);
		p.ScreenOpePanel.add(p.Cnd_ope_EX2);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0540.CndR.ope_META);
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0540.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_term_p_PPanel);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0540.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0540.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0540.CndR.wg_nm_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_itm_is_srch_typ);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.CndPanel.add(p.Cnd_itm_is_srch_typ);
		p.Cnd_itm_is_srch_typ.setNextBeans(p.Cnd_bom_ptn);
		p.Cnd_itm_is_srch_typ.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0540.CndR.itm_is_srch_typ_META);
		p.Cnd_bom_ptn.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_bom_ptn_Label);
		p.CndPanel.add(p.Cnd_bom_ptn);
		p.Cnd_bom_ptn.setNextBeans(p.Cnd_par_itm_flg);
		p.Cnd_bom_ptn.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0540.CndR.bom_ptn_META);
		p.CndPanel.add(p.Cnd_par_itm_flg);
		p.Cnd_par_itm_flg.setNextBeans(p.Cnd_chd_itm_flg);
		p.Cnd_par_itm_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0540.CndR.par_itm_flg_META);
		p.CndPanel.add(p.Cnd_chd_itm_flg);
		p.Cnd_chd_itm_flg.setNextBeans(p.Cnd_bom_ptn_flg);
		p.Cnd_chd_itm_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0540.CndR.chd_itm_flg_META);
		p.CndPanel.add(p.Cnd_bom_ptn_flg);
		p.Cnd_bom_ptn_flg.setNextBeans(p.Cnd_max_hrrchy);
		p.Cnd_bom_ptn_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0540.CndR.bom_ptn_flg_META);
		p.CndPanel.add(p.Cnd_max_hrrchy_Label);
		p.CndPanel.add(p.Cnd_max_hrrchy);
		p.Cnd_max_hrrchy.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0540.CndR.max_hrrchy_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRPnl(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_srch_all.setIcon("SEARCH");
		p.RPnl_srch_all.setFunctionKey(MCFunctionKey.F13);
		p.RPnlPanel.add(p.RPnl_srch_all);
		p.RPnlPanel.setLastBeans(p.RPnl_srch_all);
	}

	/**
	 * [DtlPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlPnl(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.add(p.DtlPnlPanel);
		p.DtlPnlPanel.setNextBeans(p.BottomPanel);
		p.DtlPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DtlPnlPanel.setLayoutPosition("CBCT+");
		// ブロックの項目の初期化
		p.DtlPnlPanel.add(p.DtlPanel, null);
		p.DtlPnlPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPnlPanel.add(p.BtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_srch_dtl.setIcon("SEARCH");
		p.Btn_srch_dtl.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_srch_dtl);
		p.BtnPanel.setLastBeans(p.Btn_srch_dtl);
		p.Btn_srch_dtl.setNextBeans(p.Btn_open_MGBDP0540_ex1);
		p.Btn_open_MGBDP0540_ex1.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MGBDP0540_ex1);
		p.Btn_open_MGBDP0540_ex1.setNextBeans(p.Btn_open_MGBDP0540_ex2);
		p.Btn_open_MGBDP0540_ex2.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MGBDP0540_ex2);
		p.Btn_open_MGBDP0540_ex2.setNextBeans(p.Btn_open_MGBDP0520);
		p.Btn_open_MGBDP0520.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MGBDP0520);
		p.Btn_open_MGBDP0520.setNextBeans(p.Btn_open_MGBDP0530);
		p.Btn_open_MGBDP0530.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MGBDP0530);
		p.Btn_open_MGBDP0530.setNextBeans(p.Btn_open_MGBDP0530_chd);
		p.Btn_open_MGBDP0530_chd.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MGBDP0530_chd);
	}

	/**
	 * [Bottom]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBottom(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.add(p.BottomPanel);
		p.BottomPanel.add(p.BottomTab);
		p.BottomPanel.setLastBeans(p.BottomTab);
		p.BottomPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BottomPanel.setLayoutPosition("CBCB");
		// ブロックの項目の初期化
		p.BottomTab.add(p.ItmPanel, "Bottom.itm");
		p.BottomTab.setLastBeans(p.ItmPanel);
		p.ItmPanel.setNextBeans(p.ItmDtlPanel);
		p.BottomTab.add(p.ItmDtlPanel, "Bottom.itmDtl");
		p.ItmDtlPanel.setNextBeans(p.ItmOperPanel);
		p.BottomTab.add(p.ItmOperPanel, "Bottom.itmOper");
		p.ItmOperPanel.setNextBeans(p.ItmWkPanel);
		p.BottomTab.add(p.ItmWkPanel, "Bottom.itmWk");
		p.ItmWkPanel.setNextBeans(p.ItmPurcPanel);
		p.BottomTab.add(p.ItmPurcPanel, "Bottom.itmPurc");
		p.ItmPurcPanel.setNextBeans(p.ItmProcPanel);
		p.BottomTab.add(p.ItmProcPanel, "Bottom.itmProc");
		p.ItmProcPanel.setNextBeans(p.ItmProvPanel);
		p.BottomTab.add(p.ItmProvPanel, "Bottom.itmProv");
		p.ItmProvPanel.setNextBeans(p.ItmSlsPanel);
		p.BottomTab.add(p.ItmSlsPanel, "Bottom.itmSls");
		p.ItmSlsPanel.setNextBeans(p.ItmFixPanel);
		p.BottomTab.add(p.ItmFixPanel, "Bottom.itmFix");
	}

	/**
	 * [Itm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItm(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmPanel.setNextBeans(p.ItmDtlPanel);
		p.ItmPanel.add(p.ItmScrollPane);
		p.ItmPanel.setLastBeans(p.ItmTable);
		p.ItmScrollPane.setViewportView(p.ItmTable);
		p.ItmTable.setList(p.getItmL());
		p.ItmTable.setStatusColumnVisible(false);
		p.ItmPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmDtl(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmDtlPanel.setNextBeans(p.ItmOperPanel);
		p.ItmDtlPanel.add(p.ItmDtlScrollPane);
		p.ItmDtlPanel.setLastBeans(p.ItmDtlTable);
		p.ItmDtlScrollPane.setViewportView(p.ItmDtlTable);
		p.ItmDtlTable.setList(p.getItmDtlL());
		p.ItmDtlTable.setStatusColumnVisible(false);
		p.ItmDtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmOper]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmOper(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmOperPanel.setNextBeans(p.ItmWkPanel);
		p.ItmOperPanel.add(p.ItmOperScrollPane);
		p.ItmOperPanel.setLastBeans(p.ItmOperTable);
		p.ItmOperScrollPane.setViewportView(p.ItmOperTable);
		p.ItmOperTable.setList(p.getItmOperL());
		p.ItmOperTable.setStatusColumnVisible(false);
		p.ItmOperPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmWk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmWk(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmWkPanel.setNextBeans(p.ItmPurcPanel);
		p.ItmWkPanel.add(p.ItmWkScrollPane);
		p.ItmWkPanel.setLastBeans(p.ItmWkTable);
		p.ItmWkScrollPane.setViewportView(p.ItmWkTable);
		p.ItmWkTable.setList(p.getItmWkL());
		p.ItmWkTable.setStatusColumnVisible(false);
		p.ItmWkPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmPurc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmPurc(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmPurcPanel.setNextBeans(p.ItmProcPanel);
		p.ItmPurcPanel.add(p.ItmPurcScrollPane);
		p.ItmPurcPanel.setLastBeans(p.ItmPurcTable);
		p.ItmPurcScrollPane.setViewportView(p.ItmPurcTable);
		p.ItmPurcTable.setList(p.getItmPurcL());
		p.ItmPurcTable.setStatusColumnVisible(false);
		p.ItmPurcPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmProc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmProc(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmProcPanel.setNextBeans(p.ItmProvPanel);
		p.ItmProcPanel.add(p.ItmProcScrollPane);
		p.ItmProcPanel.setLastBeans(p.ItmProcTable);
		p.ItmProcScrollPane.setViewportView(p.ItmProcTable);
		p.ItmProcTable.setList(p.getItmProcL());
		p.ItmProcTable.setStatusColumnVisible(false);
		p.ItmProcPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmProv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmProv(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmProvPanel.setNextBeans(p.ItmSlsPanel);
		p.ItmProvPanel.add(p.ItmProvScrollPane);
		p.ItmProvPanel.setLastBeans(p.ItmProvTable);
		p.ItmProvScrollPane.setViewportView(p.ItmProvTable);
		p.ItmProvTable.setList(p.getItmProvL());
		p.ItmProvTable.setStatusColumnVisible(false);
		p.ItmProvPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmSls]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmSls(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmSlsPanel.setNextBeans(p.ItmFixPanel);
		p.ItmSlsPanel.add(p.ItmSlsScrollPane);
		p.ItmSlsPanel.setLastBeans(p.ItmSlsTable);
		p.ItmSlsScrollPane.setViewportView(p.ItmSlsTable);
		p.ItmSlsTable.setList(p.getItmSlsL());
		p.ItmSlsTable.setStatusColumnVisible(false);
		p.ItmSlsPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmFix]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmFix(MGBDP_BomExSrch p) {
		// ブロック関連の初期化
		p.ItmFixPanel.add(p.ItmFixScrollPane);
		p.ItmFixPanel.setLastBeans(p.ItmFixTable);
		p.ItmFixScrollPane.setViewportView(p.ItmFixTable);
		p.ItmFixTable.setList(p.getItmFixL());
		p.ItmFixTable.setStatusColumnVisible(false);
		p.ItmFixPanel.setLayoutPosition("C");
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
		MGBDP_BomExSrch_MC.mcInitScreenOpe((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitTop((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitCnd((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitCtrl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitRPnl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitDtlPnl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitDtl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitBtn((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitBottom((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitItm((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitItmDtl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitItmOper((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitItmWk((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitItmPurc((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitItmProc((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitItmProv((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitItmSls((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.mcInitItmFix((MGBDP_BomExSrch)this);

		// [SRCH]ステータスのモードの設定
		MGBDP_BomExSrch_MC.statusInitSRCH_ScreenOpe((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_Top((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_Cnd((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_Ctrl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_RPnl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_DtlPnl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_Dtl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_Btn((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_Bottom((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_Itm((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_ItmDtl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_ItmOper((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_ItmWk((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_ItmPurc((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_ItmProc((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_ItmProv((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_ItmSls((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_ItmFix((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitSRCH_Cnd2((MGBDP_BomExSrch)this);

		// [REF]ステータスのモードの設定
		MGBDP_BomExSrch_MC.statusInitREF_ScreenOpe((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_Top((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_Cnd((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_Ctrl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_RPnl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_DtlPnl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_Dtl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_Btn((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_Bottom((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_Itm((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_ItmDtl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_ItmOper((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_ItmWk((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_ItmPurc((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_ItmProc((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_ItmProv((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_ItmSls((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_ItmFix((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.statusInitREF_Cnd2((MGBDP_BomExSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBDP_BomExSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBDP_BomExSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_BomExSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_EX1.addAllListener(p);
		p.Cnd_ope_EX2.addAllListener(p);
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_is_srch_typ.setListListener(p);
		p.Cnd_itm_is_srch_typ.addAllListener(p);
		p.Cnd_bom_ptn.setListListener(p);
		p.Cnd_bom_ptn.addAllListener(p);
		p.Cnd_par_itm_flg.addAllListener(p);
		p.Cnd_chd_itm_flg.addAllListener(p);
		p.Cnd_bom_ptn_flg.addAllListener(p);
		p.Cnd_max_hrrchy.setListListener(p);
		p.Cnd_max_hrrchy.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBDP_BomExSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MGBDP_BomExSrch p) {
		p.RPnl_srch_all.addAllListener(p);
		p.RPnl_srch_all.setAPMethodName("doRPnl_srch_all");
	}

	/**
	 *  [DtlPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlPnl(MGBDP_BomExSrch p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MGBDP_BomExSrch p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_bottom_flg.addAllListener(p);
		p.columnDtl_unreg_flg.addAllListener(p);
		p.columnDtl_itm_typ.addAllListener(p);
		p.columnDtl_itm_typ.setListListener(p);
		p.columnDtl_itm_typ_nm.addAllListener(p);
		p.columnDtl_itm_typ_nm.setListListener(p);
		p.columnDtl_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_itm_typ_d_cd.setListListener(p);
		p.columnDtl_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_itm_typ_d_nm.setListListener(p);
		p.columnDtl_itm_jnl_cd.addAllListener(p);
		p.columnDtl_itm_jnl_cd.setListListener(p);
		p.columnDtl_itm_jnl_nm.addAllListener(p);
		p.columnDtl_itm_jnl_nm.setListListener(p);
		p.columnDtl_bom_ptn.addAllListener(p);
		p.columnDtl_bom_ptn.setListListener(p);
		p.columnDtl_oper_cd.addAllListener(p);
		p.columnDtl_oper_cd.setListListener(p);
		p.columnDtl_oper_nm.addAllListener(p);
		p.columnDtl_oper_nm.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.columnDtl_par_unit_cd.addAllListener(p);
		p.columnDtl_par_unit_cd.setListListener(p);
		p.columnDtl_par_unit_nm.addAllListener(p);
		p.columnDtl_par_unit_nm.setListListener(p);
		p.columnDtl_par_dec_place.addAllListener(p);
		p.columnDtl_par_dec_place.setListListener(p);
		p.columnDtl_chd_unit_cd.addAllListener(p);
		p.columnDtl_chd_unit_cd.setListListener(p);
		p.columnDtl_chd_unit_nm.addAllListener(p);
		p.columnDtl_chd_unit_nm.setListListener(p);
		p.columnDtl_chd_dec_place.addAllListener(p);
		p.columnDtl_chd_dec_place.setListListener(p);
		p.columnDtl_alt_grp_cd.addAllListener(p);
		p.columnDtl_alt_grp_cd.setListListener(p);
		p.columnDtl_alt_itm_ratio.addAllListener(p);
		p.columnDtl_alt_itm_ratio.setListListener(p);
		p.columnDtl_expns_cd.addAllListener(p);
		p.columnDtl_expns_cd.setListListener(p);
		p.columnDtl_expns_nm.addAllListener(p);
		p.columnDtl_expns_nm.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.columnDtl_calc_ctg_cd.addAllListener(p);
		p.columnDtl_calc_ctg_cd.setListListener(p);
		p.columnDtl_calc_ctg_nm.addAllListener(p);
		p.columnDtl_calc_ctg_nm.setListListener(p);
		p.columnDtl_itm_calc_ctg_cd.addAllListener(p);
		p.columnDtl_itm_calc_ctg_cd.setListListener(p);
		p.columnDtl_itm_calc_ctg_nm.addAllListener(p);
		p.columnDtl_itm_calc_ctg_nm.setListListener(p);
		p.columnDtl_dtl_calc_ctg_cd.addAllListener(p);
		p.columnDtl_dtl_calc_ctg_cd.setListListener(p);
		p.columnDtl_dtl_calc_ctg_nm.addAllListener(p);
		p.columnDtl_dtl_calc_ctg_nm.setListListener(p);
		p.columnDtl_purc_calc_ctg_cd.addAllListener(p);
		p.columnDtl_purc_calc_ctg_cd.setListListener(p);
		p.columnDtl_purc_calc_ctg_nm.addAllListener(p);
		p.columnDtl_purc_calc_ctg_nm.setListListener(p);
		p.columnDtl_proc_calc_ctg_cd.addAllListener(p);
		p.columnDtl_proc_calc_ctg_cd.setListListener(p);
		p.columnDtl_proc_calc_ctg_nm.addAllListener(p);
		p.columnDtl_proc_calc_ctg_nm.setListListener(p);
		p.columnDtl_prov_calc_ctg_cd.addAllListener(p);
		p.columnDtl_prov_calc_ctg_cd.setListListener(p);
		p.columnDtl_prov_calc_ctg_nm.addAllListener(p);
		p.columnDtl_prov_calc_ctg_nm.setListListener(p);
		p.columnDtl_sls_calc_ctg_cd.addAllListener(p);
		p.columnDtl_sls_calc_ctg_cd.setListListener(p);
		p.columnDtl_sls_calc_ctg_nm.addAllListener(p);
		p.columnDtl_sls_calc_ctg_nm.setListListener(p);
		p.columnDtl_fix_calc_ctg_cd.addAllListener(p);
		p.columnDtl_fix_calc_ctg_cd.setListListener(p);
		p.columnDtl_fix_calc_ctg_nm.addAllListener(p);
		p.columnDtl_fix_calc_ctg_nm.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBDP_BomExSrch p) {
		p.Btn_srch_dtl.addAllListener(p);
		p.Btn_srch_dtl.setAPMethodName("doBtn_srch_dtl");
		p.Btn_open_MGBDP0540_ex1.addAllListener(p);
		p.Btn_open_MGBDP0540_ex1.setAPMethodName("doBtn_open_MGBDP0540_ex1");
		p.Btn_open_MGBDP0540_ex2.addAllListener(p);
		p.Btn_open_MGBDP0540_ex2.setAPMethodName("doBtn_open_MGBDP0540_ex2");
		p.Btn_open_MGBDP0520.addAllListener(p);
		p.Btn_open_MGBDP0520.setAPMethodName("doBtn_open_MGBDP0520");
		p.Btn_open_MGBDP0530.addAllListener(p);
		p.Btn_open_MGBDP0530.setAPMethodName("doBtn_open_MGBDP0530");
		p.Btn_open_MGBDP0530_chd.addAllListener(p);
		p.Btn_open_MGBDP0530_chd.setAPMethodName("doBtn_open_MGBDP0530_chd");
	}

	/**
	 *  [Bottom]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBottom(MGBDP_BomExSrch p) {
		p.BottomTab.addAllListener(p);
	}

	/**
	 *  [Itm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItm(MGBDP_BomExSrch p) {
		p.ItmTable.addAllListener(p);
		p.columnItm_calc_ctg_cd.addAllListener(p);
		p.columnItm_calc_ctg_cd.setListListener(p);
		p.columnItm_calc_ctg_nm.addAllListener(p);
		p.columnItm_calc_ctg_nm.setListListener(p);
		p.columnItm_wg_cd.addAllListener(p);
		p.columnItm_wg_cd.setListListener(p);
		p.columnItm_wg_nm.addAllListener(p);
		p.columnItm_wg_nm.setListListener(p);
		p.columnItm_calc_ptn_cd.addAllListener(p);
		p.columnItm_calc_ptn_cd.setListListener(p);
		p.columnItm_calc_ptn_nm.addAllListener(p);
		p.columnItm_calc_ptn_nm.setListListener(p);
		p.columnItm_unit_cd.addAllListener(p);
		p.columnItm_unit_cd.setListListener(p);
		p.columnItm_unit_nm.addAllListener(p);
		p.columnItm_unit_nm.setListListener(p);
		p.columnItm_dec_place.addAllListener(p);
		p.columnItm_dec_place.setListListener(p);
		p.columnItm_rmrks.addAllListener(p);
		p.columnItm_rmrks.setListListener(p);
		p.columnItm_sub_char1.addAllListener(p);
		p.columnItm_sub_char1.setListListener(p);
		p.columnItm_sub_char2.addAllListener(p);
		p.columnItm_sub_char2.setListListener(p);
		p.columnItm_sub_char3.addAllListener(p);
		p.columnItm_sub_char3.setListListener(p);
		p.columnItm_non_calc_flg.addAllListener(p);
		p.columnItm_ins_usr_id.addAllListener(p);
		p.columnItm_ins_usr_id.setListListener(p);
		p.columnItm_ins_usr_nm.addAllListener(p);
		p.columnItm_ins_usr_nm.setListListener(p);
		p.columnItm_ins_func_id.addAllListener(p);
		p.columnItm_ins_func_id.setListListener(p);
		p.columnItm_ins_func_nm.addAllListener(p);
		p.columnItm_ins_func_nm.setListListener(p);
		p.columnItm_ins_ts.addAllListener(p);
		p.columnItm_ins_ts.setListListener(p);
		p.columnItm_upd_usr_id.addAllListener(p);
		p.columnItm_upd_usr_id.setListListener(p);
		p.columnItm_upd_usr_nm.addAllListener(p);
		p.columnItm_upd_usr_nm.setListListener(p);
		p.columnItm_upd_func_id.addAllListener(p);
		p.columnItm_upd_func_id.setListListener(p);
		p.columnItm_upd_func_nm.addAllListener(p);
		p.columnItm_upd_func_nm.setListListener(p);
		p.columnItm_upd_ts.addAllListener(p);
		p.columnItm_upd_ts.setListListener(p);
		p.columnItm_upd_srv_req_no.addAllListener(p);
		p.columnItm_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [ItmDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmDtl(MGBDP_BomExSrch p) {
		p.ItmDtlTable.addAllListener(p);
		p.columnItmDtl_calc_ctg_cd.addAllListener(p);
		p.columnItmDtl_calc_ctg_cd.setListListener(p);
		p.columnItmDtl_calc_ctg_nm.addAllListener(p);
		p.columnItmDtl_calc_ctg_nm.setListListener(p);
		p.columnItmDtl_wg_cd.addAllListener(p);
		p.columnItmDtl_wg_cd.setListListener(p);
		p.columnItmDtl_wg_nm.addAllListener(p);
		p.columnItmDtl_wg_nm.setListListener(p);
		p.columnItmDtl_loc_cd.addAllListener(p);
		p.columnItmDtl_loc_cd.setListListener(p);
		p.columnItmDtl_loc_nm.addAllListener(p);
		p.columnItmDtl_loc_nm.setListListener(p);
		p.columnItmDtl_sppl_cd.addAllListener(p);
		p.columnItmDtl_sppl_cd.setListListener(p);
		p.columnItmDtl_sppl_nm.addAllListener(p);
		p.columnItmDtl_sppl_nm.setListListener(p);
		p.columnItmDtl_rqst_wg_cd.addAllListener(p);
		p.columnItmDtl_rqst_wg_cd.setListListener(p);
		p.columnItmDtl_rqst_wg_nm.addAllListener(p);
		p.columnItmDtl_rqst_wg_nm.setListListener(p);
		p.columnItmDtl_cost_ratio.addAllListener(p);
		p.columnItmDtl_cost_ratio.setListListener(p);
		p.columnItmDtl_oper_ptn.addAllListener(p);
		p.columnItmDtl_oper_ptn.setListListener(p);
		p.columnItmDtl_bom_ptn.addAllListener(p);
		p.columnItmDtl_bom_ptn.setListListener(p);
		p.columnItmDtl_unit_cd.addAllListener(p);
		p.columnItmDtl_unit_cd.setListListener(p);
		p.columnItmDtl_unit_nm.addAllListener(p);
		p.columnItmDtl_unit_nm.setListListener(p);
		p.columnItmDtl_dec_place.addAllListener(p);
		p.columnItmDtl_dec_place.setListListener(p);
		p.columnItmDtl_alc_dpt_cd.addAllListener(p);
		p.columnItmDtl_alc_dpt_cd.setListListener(p);
		p.columnItmDtl_alc_dpt_nm.addAllListener(p);
		p.columnItmDtl_alc_dpt_nm.setListListener(p);
		p.columnItmDtl_exp_dpt_cd.addAllListener(p);
		p.columnItmDtl_exp_dpt_cd.setListListener(p);
		p.columnItmDtl_exp_dpt_nm.addAllListener(p);
		p.columnItmDtl_exp_dpt_nm.setListListener(p);
		p.columnItmDtl_exp_prio.addAllListener(p);
		p.columnItmDtl_exp_prio.setListListener(p);
		p.columnItmDtl_alc_val1.addAllListener(p);
		p.columnItmDtl_alc_val1.setListListener(p);
		p.columnItmDtl_alc_val2.addAllListener(p);
		p.columnItmDtl_alc_val2.setListListener(p);
		p.columnItmDtl_alc_val3.addAllListener(p);
		p.columnItmDtl_alc_val3.setListListener(p);
		p.columnItmDtl_alc_val4.addAllListener(p);
		p.columnItmDtl_alc_val4.setListListener(p);
		p.columnItmDtl_alc_val5.addAllListener(p);
		p.columnItmDtl_alc_val5.setListListener(p);
		p.columnItmDtl_rmrks.addAllListener(p);
		p.columnItmDtl_rmrks.setListListener(p);
		p.columnItmDtl_sub_char1.addAllListener(p);
		p.columnItmDtl_sub_char1.setListListener(p);
		p.columnItmDtl_sub_char2.addAllListener(p);
		p.columnItmDtl_sub_char2.setListListener(p);
		p.columnItmDtl_sub_char3.addAllListener(p);
		p.columnItmDtl_sub_char3.setListListener(p);
		p.columnItmDtl_non_calc_flg.addAllListener(p);
		p.columnItmDtl_ins_usr_id.addAllListener(p);
		p.columnItmDtl_ins_usr_id.setListListener(p);
		p.columnItmDtl_ins_usr_nm.addAllListener(p);
		p.columnItmDtl_ins_usr_nm.setListListener(p);
		p.columnItmDtl_ins_func_id.addAllListener(p);
		p.columnItmDtl_ins_func_id.setListListener(p);
		p.columnItmDtl_ins_func_nm.addAllListener(p);
		p.columnItmDtl_ins_func_nm.setListListener(p);
		p.columnItmDtl_ins_ts.addAllListener(p);
		p.columnItmDtl_ins_ts.setListListener(p);
		p.columnItmDtl_upd_usr_id.addAllListener(p);
		p.columnItmDtl_upd_usr_id.setListListener(p);
		p.columnItmDtl_upd_usr_nm.addAllListener(p);
		p.columnItmDtl_upd_usr_nm.setListListener(p);
		p.columnItmDtl_upd_func_id.addAllListener(p);
		p.columnItmDtl_upd_func_id.setListListener(p);
		p.columnItmDtl_upd_func_nm.addAllListener(p);
		p.columnItmDtl_upd_func_nm.setListListener(p);
		p.columnItmDtl_upd_ts.addAllListener(p);
		p.columnItmDtl_upd_ts.setListListener(p);
		p.columnItmDtl_upd_srv_req_no.addAllListener(p);
		p.columnItmDtl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [ItmOper]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmOper(MGBDP_BomExSrch p) {
		p.ItmOperTable.addAllListener(p);
		p.columnItmOper_calc_ctg_cd.addAllListener(p);
		p.columnItmOper_calc_ctg_cd.setListListener(p);
		p.columnItmOper_calc_ctg_nm.addAllListener(p);
		p.columnItmOper_calc_ctg_nm.setListListener(p);
		p.columnItmOper_wg_cd.addAllListener(p);
		p.columnItmOper_wg_cd.setListListener(p);
		p.columnItmOper_wg_nm.addAllListener(p);
		p.columnItmOper_wg_nm.setListListener(p);
		p.columnItmOper_loc_cd.addAllListener(p);
		p.columnItmOper_loc_cd.setListListener(p);
		p.columnItmOper_loc_nm.addAllListener(p);
		p.columnItmOper_loc_nm.setListListener(p);
		p.columnItmOper_oper_ptn.addAllListener(p);
		p.columnItmOper_oper_ptn.setListListener(p);
		p.columnItmOper_oper_cd.addAllListener(p);
		p.columnItmOper_oper_cd.setListListener(p);
		p.columnItmOper_oper_nm.addAllListener(p);
		p.columnItmOper_oper_nm.setListListener(p);
		p.columnItmOper_oper_seq.addAllListener(p);
		p.columnItmOper_oper_seq.setListListener(p);
		p.columnItmOper_disp_seq.addAllListener(p);
		p.columnItmOper_disp_seq.setListListener(p);
		p.columnItmOper_yield_oper_flg.addAllListener(p);
		p.columnItmOper_nmr_qty.addAllListener(p);
		p.columnItmOper_nmr_qty.setListListener(p);
		p.columnItmOper_dnm_qty.addAllListener(p);
		p.columnItmOper_dnm_qty.setListListener(p);
		p.columnItmOper_unit_cd.addAllListener(p);
		p.columnItmOper_unit_cd.setListListener(p);
		p.columnItmOper_unit_nm.addAllListener(p);
		p.columnItmOper_unit_nm.setListListener(p);
		p.columnItmOper_oper_unit_cd.addAllListener(p);
		p.columnItmOper_oper_unit_cd.setListListener(p);
		p.columnItmOper_oper_unit_nm.addAllListener(p);
		p.columnItmOper_oper_unit_nm.setListListener(p);
		p.columnItmOper_oper_std_qty.addAllListener(p);
		p.columnItmOper_oper_std_qty.setListListener(p);
		p.columnItmOper_oper_conv_qty.addAllListener(p);
		p.columnItmOper_oper_conv_qty.setListListener(p);
		p.columnItmOper_dec_place.addAllListener(p);
		p.columnItmOper_dec_place.setListListener(p);
		p.columnItmOper_unit_conv_rnd_typ.addAllListener(p);
		p.columnItmOper_unit_conv_rnd_typ.setListListener(p);
		p.columnItmOper_unit_conv_rnd_typ_nm.addAllListener(p);
		p.columnItmOper_unit_conv_rnd_typ_nm.setListListener(p);
		p.columnItmOper_rmrks.addAllListener(p);
		p.columnItmOper_rmrks.setListListener(p);
		p.columnItmOper_sub_char1.addAllListener(p);
		p.columnItmOper_sub_char1.setListListener(p);
		p.columnItmOper_sub_char2.addAllListener(p);
		p.columnItmOper_sub_char2.setListListener(p);
		p.columnItmOper_sub_char3.addAllListener(p);
		p.columnItmOper_sub_char3.setListListener(p);
		p.columnItmOper_non_calc_flg.addAllListener(p);
		p.columnItmOper_ins_usr_id.addAllListener(p);
		p.columnItmOper_ins_usr_id.setListListener(p);
		p.columnItmOper_ins_usr_nm.addAllListener(p);
		p.columnItmOper_ins_usr_nm.setListListener(p);
		p.columnItmOper_ins_func_id.addAllListener(p);
		p.columnItmOper_ins_func_id.setListListener(p);
		p.columnItmOper_ins_func_nm.addAllListener(p);
		p.columnItmOper_ins_func_nm.setListListener(p);
		p.columnItmOper_ins_ts.addAllListener(p);
		p.columnItmOper_ins_ts.setListListener(p);
		p.columnItmOper_upd_usr_id.addAllListener(p);
		p.columnItmOper_upd_usr_id.setListListener(p);
		p.columnItmOper_upd_usr_nm.addAllListener(p);
		p.columnItmOper_upd_usr_nm.setListListener(p);
		p.columnItmOper_upd_func_id.addAllListener(p);
		p.columnItmOper_upd_func_id.setListListener(p);
		p.columnItmOper_upd_func_nm.addAllListener(p);
		p.columnItmOper_upd_func_nm.setListListener(p);
		p.columnItmOper_upd_ts.addAllListener(p);
		p.columnItmOper_upd_ts.setListListener(p);
		p.columnItmOper_upd_srv_req_no.addAllListener(p);
		p.columnItmOper_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [ItmWk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmWk(MGBDP_BomExSrch p) {
		p.ItmWkTable.addAllListener(p);
		p.columnItmWk_calc_ctg_cd.addAllListener(p);
		p.columnItmWk_calc_ctg_cd.setListListener(p);
		p.columnItmWk_calc_ctg_nm.addAllListener(p);
		p.columnItmWk_calc_ctg_nm.setListListener(p);
		p.columnItmWk_wg_cd.addAllListener(p);
		p.columnItmWk_wg_cd.setListListener(p);
		p.columnItmWk_wg_nm.addAllListener(p);
		p.columnItmWk_wg_nm.setListListener(p);
		p.columnItmWk_loc_cd.addAllListener(p);
		p.columnItmWk_loc_cd.setListListener(p);
		p.columnItmWk_loc_nm.addAllListener(p);
		p.columnItmWk_loc_nm.setListListener(p);
		p.columnItmWk_oper_ptn.addAllListener(p);
		p.columnItmWk_oper_ptn.setListListener(p);
		p.columnItmWk_oper_cd.addAllListener(p);
		p.columnItmWk_oper_cd.setListListener(p);
		p.columnItmWk_oper_nm.addAllListener(p);
		p.columnItmWk_oper_nm.setListListener(p);
		p.columnItmWk_oper_seq.addAllListener(p);
		p.columnItmWk_oper_seq.setListListener(p);
		p.columnItmWk_wk_cost_cd.addAllListener(p);
		p.columnItmWk_wk_cost_cd.setListListener(p);
		p.columnItmWk_wk_cost_nm.addAllListener(p);
		p.columnItmWk_wk_cost_nm.setListListener(p);
		p.columnItmWk_unit_cd.addAllListener(p);
		p.columnItmWk_unit_cd.setListListener(p);
		p.columnItmWk_unit_nm.addAllListener(p);
		p.columnItmWk_unit_nm.setListListener(p);
		p.columnItmWk_dec_place.addAllListener(p);
		p.columnItmWk_dec_place.setListListener(p);
		p.columnItmWk_wk_cost_unit_nm.addAllListener(p);
		p.columnItmWk_wk_cost_unit_nm.setListListener(p);
		p.columnItmWk_wk_cost_dec_place.addAllListener(p);
		p.columnItmWk_wk_cost_dec_place.setListListener(p);
		p.columnItmWk_rmrks.addAllListener(p);
		p.columnItmWk_rmrks.setListListener(p);
		p.columnItmWk_sub_char1.addAllListener(p);
		p.columnItmWk_sub_char1.setListListener(p);
		p.columnItmWk_sub_char2.addAllListener(p);
		p.columnItmWk_sub_char2.setListListener(p);
		p.columnItmWk_sub_char3.addAllListener(p);
		p.columnItmWk_sub_char3.setListListener(p);
		p.columnItmWk_non_calc_flg.addAllListener(p);
		p.columnItmWk_ins_usr_id.addAllListener(p);
		p.columnItmWk_ins_usr_id.setListListener(p);
		p.columnItmWk_ins_usr_nm.addAllListener(p);
		p.columnItmWk_ins_usr_nm.setListListener(p);
		p.columnItmWk_ins_func_id.addAllListener(p);
		p.columnItmWk_ins_func_id.setListListener(p);
		p.columnItmWk_ins_func_nm.addAllListener(p);
		p.columnItmWk_ins_func_nm.setListListener(p);
		p.columnItmWk_ins_ts.addAllListener(p);
		p.columnItmWk_ins_ts.setListListener(p);
		p.columnItmWk_upd_usr_id.addAllListener(p);
		p.columnItmWk_upd_usr_id.setListListener(p);
		p.columnItmWk_upd_usr_nm.addAllListener(p);
		p.columnItmWk_upd_usr_nm.setListListener(p);
		p.columnItmWk_upd_func_id.addAllListener(p);
		p.columnItmWk_upd_func_id.setListListener(p);
		p.columnItmWk_upd_func_nm.addAllListener(p);
		p.columnItmWk_upd_func_nm.setListListener(p);
		p.columnItmWk_upd_ts.addAllListener(p);
		p.columnItmWk_upd_ts.setListListener(p);
		p.columnItmWk_upd_srv_req_no.addAllListener(p);
		p.columnItmWk_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [ItmPurc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmPurc(MGBDP_BomExSrch p) {
		p.ItmPurcTable.addAllListener(p);
		p.columnItmPurc_calc_ctg_cd.addAllListener(p);
		p.columnItmPurc_calc_ctg_cd.setListListener(p);
		p.columnItmPurc_calc_ctg_nm.addAllListener(p);
		p.columnItmPurc_calc_ctg_nm.setListListener(p);
		p.columnItmPurc_wg_cd.addAllListener(p);
		p.columnItmPurc_wg_cd.setListListener(p);
		p.columnItmPurc_wg_nm.addAllListener(p);
		p.columnItmPurc_wg_nm.setListListener(p);
		p.columnItmPurc_sppl_cd.addAllListener(p);
		p.columnItmPurc_sppl_cd.setListListener(p);
		p.columnItmPurc_sppl_nm.addAllListener(p);
		p.columnItmPurc_sppl_nm.setListListener(p);
		p.columnItmPurc_unit_cd.addAllListener(p);
		p.columnItmPurc_unit_cd.setListListener(p);
		p.columnItmPurc_unit_nm.addAllListener(p);
		p.columnItmPurc_unit_nm.setListListener(p);
		p.columnItmPurc_dec_place.addAllListener(p);
		p.columnItmPurc_dec_place.setListListener(p);
		p.columnItmPurc_cur_cd.addAllListener(p);
		p.columnItmPurc_cur_cd.setListListener(p);
		p.columnItmPurc_cur_nm.addAllListener(p);
		p.columnItmPurc_cur_nm.setListListener(p);
		p.columnItmPurc_upri_dec_place.addAllListener(p);
		p.columnItmPurc_upri_dec_place.setListListener(p);
		p.columnItmPurc_cost_ratio.addAllListener(p);
		p.columnItmPurc_cost_ratio.setListListener(p);
		p.columnItmPurc_rmrks.addAllListener(p);
		p.columnItmPurc_rmrks.setListListener(p);
		p.columnItmPurc_sub_char1.addAllListener(p);
		p.columnItmPurc_sub_char1.setListListener(p);
		p.columnItmPurc_sub_char2.addAllListener(p);
		p.columnItmPurc_sub_char2.setListListener(p);
		p.columnItmPurc_sub_char3.addAllListener(p);
		p.columnItmPurc_sub_char3.setListListener(p);
		p.columnItmPurc_non_calc_flg.addAllListener(p);
		p.columnItmPurc_ins_usr_id.addAllListener(p);
		p.columnItmPurc_ins_usr_id.setListListener(p);
		p.columnItmPurc_ins_usr_nm.addAllListener(p);
		p.columnItmPurc_ins_usr_nm.setListListener(p);
		p.columnItmPurc_ins_func_id.addAllListener(p);
		p.columnItmPurc_ins_func_id.setListListener(p);
		p.columnItmPurc_ins_func_nm.addAllListener(p);
		p.columnItmPurc_ins_func_nm.setListListener(p);
		p.columnItmPurc_ins_ts.addAllListener(p);
		p.columnItmPurc_ins_ts.setListListener(p);
		p.columnItmPurc_upd_usr_id.addAllListener(p);
		p.columnItmPurc_upd_usr_id.setListListener(p);
		p.columnItmPurc_upd_usr_nm.addAllListener(p);
		p.columnItmPurc_upd_usr_nm.setListListener(p);
		p.columnItmPurc_upd_func_id.addAllListener(p);
		p.columnItmPurc_upd_func_id.setListListener(p);
		p.columnItmPurc_upd_func_nm.addAllListener(p);
		p.columnItmPurc_upd_func_nm.setListListener(p);
		p.columnItmPurc_upd_ts.addAllListener(p);
		p.columnItmPurc_upd_ts.setListListener(p);
		p.columnItmPurc_upd_srv_req_no.addAllListener(p);
		p.columnItmPurc_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [ItmProc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmProc(MGBDP_BomExSrch p) {
		p.ItmProcTable.addAllListener(p);
		p.columnItmProc_calc_ctg_cd.addAllListener(p);
		p.columnItmProc_calc_ctg_cd.setListListener(p);
		p.columnItmProc_calc_ctg_nm.addAllListener(p);
		p.columnItmProc_calc_ctg_nm.setListListener(p);
		p.columnItmProc_wg_cd.addAllListener(p);
		p.columnItmProc_wg_cd.setListListener(p);
		p.columnItmProc_wg_nm.addAllListener(p);
		p.columnItmProc_wg_nm.setListListener(p);
		p.columnItmProc_sppl_cd.addAllListener(p);
		p.columnItmProc_sppl_cd.setListListener(p);
		p.columnItmProc_sppl_nm.addAllListener(p);
		p.columnItmProc_sppl_nm.setListListener(p);
		p.columnItmProc_unit_cd.addAllListener(p);
		p.columnItmProc_unit_cd.setListListener(p);
		p.columnItmProc_unit_nm.addAllListener(p);
		p.columnItmProc_unit_nm.setListListener(p);
		p.columnItmProc_dec_place.addAllListener(p);
		p.columnItmProc_dec_place.setListListener(p);
		p.columnItmProc_cur_cd.addAllListener(p);
		p.columnItmProc_cur_cd.setListListener(p);
		p.columnItmProc_cur_nm.addAllListener(p);
		p.columnItmProc_cur_nm.setListListener(p);
		p.columnItmProc_upri_dec_place.addAllListener(p);
		p.columnItmProc_upri_dec_place.setListListener(p);
		p.columnItmProc_cost_ratio.addAllListener(p);
		p.columnItmProc_cost_ratio.setListListener(p);
		p.columnItmProc_rmrks.addAllListener(p);
		p.columnItmProc_rmrks.setListListener(p);
		p.columnItmProc_sub_char1.addAllListener(p);
		p.columnItmProc_sub_char1.setListListener(p);
		p.columnItmProc_sub_char2.addAllListener(p);
		p.columnItmProc_sub_char2.setListListener(p);
		p.columnItmProc_sub_char3.addAllListener(p);
		p.columnItmProc_sub_char3.setListListener(p);
		p.columnItmProc_non_calc_flg.addAllListener(p);
		p.columnItmProc_ins_usr_id.addAllListener(p);
		p.columnItmProc_ins_usr_id.setListListener(p);
		p.columnItmProc_ins_usr_nm.addAllListener(p);
		p.columnItmProc_ins_usr_nm.setListListener(p);
		p.columnItmProc_ins_func_id.addAllListener(p);
		p.columnItmProc_ins_func_id.setListListener(p);
		p.columnItmProc_ins_func_nm.addAllListener(p);
		p.columnItmProc_ins_func_nm.setListListener(p);
		p.columnItmProc_ins_ts.addAllListener(p);
		p.columnItmProc_ins_ts.setListListener(p);
		p.columnItmProc_upd_usr_id.addAllListener(p);
		p.columnItmProc_upd_usr_id.setListListener(p);
		p.columnItmProc_upd_usr_nm.addAllListener(p);
		p.columnItmProc_upd_usr_nm.setListListener(p);
		p.columnItmProc_upd_func_id.addAllListener(p);
		p.columnItmProc_upd_func_id.setListListener(p);
		p.columnItmProc_upd_func_nm.addAllListener(p);
		p.columnItmProc_upd_func_nm.setListListener(p);
		p.columnItmProc_upd_ts.addAllListener(p);
		p.columnItmProc_upd_ts.setListListener(p);
		p.columnItmProc_upd_srv_req_no.addAllListener(p);
		p.columnItmProc_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [ItmProv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmProv(MGBDP_BomExSrch p) {
		p.ItmProvTable.addAllListener(p);
		p.columnItmProv_calc_ctg_cd.addAllListener(p);
		p.columnItmProv_calc_ctg_cd.setListListener(p);
		p.columnItmProv_calc_ctg_nm.addAllListener(p);
		p.columnItmProv_calc_ctg_nm.setListListener(p);
		p.columnItmProv_wg_cd.addAllListener(p);
		p.columnItmProv_wg_cd.setListListener(p);
		p.columnItmProv_wg_nm.addAllListener(p);
		p.columnItmProv_wg_nm.setListListener(p);
		p.columnItmProv_prsppl_cd.addAllListener(p);
		p.columnItmProv_prsppl_cd.setListListener(p);
		p.columnItmProv_prsppl_nm.addAllListener(p);
		p.columnItmProv_prsppl_nm.setListListener(p);
		p.columnItmProv_prov_typ.addAllListener(p);
		p.columnItmProv_prov_typ.setListListener(p);
		p.columnItmProv_prov_typ_nm.addAllListener(p);
		p.columnItmProv_prov_typ_nm.setListListener(p);
		p.columnItmProv_unit_cd.addAllListener(p);
		p.columnItmProv_unit_cd.setListListener(p);
		p.columnItmProv_unit_nm.addAllListener(p);
		p.columnItmProv_unit_nm.setListListener(p);
		p.columnItmProv_dec_place.addAllListener(p);
		p.columnItmProv_dec_place.setListListener(p);
		p.columnItmProv_cur_cd.addAllListener(p);
		p.columnItmProv_cur_cd.setListListener(p);
		p.columnItmProv_cur_nm.addAllListener(p);
		p.columnItmProv_cur_nm.setListListener(p);
		p.columnItmProv_upri_dec_place.addAllListener(p);
		p.columnItmProv_upri_dec_place.setListListener(p);
		p.columnItmProv_rmrks.addAllListener(p);
		p.columnItmProv_rmrks.setListListener(p);
		p.columnItmProv_sub_char1.addAllListener(p);
		p.columnItmProv_sub_char1.setListListener(p);
		p.columnItmProv_sub_char2.addAllListener(p);
		p.columnItmProv_sub_char2.setListListener(p);
		p.columnItmProv_sub_char3.addAllListener(p);
		p.columnItmProv_sub_char3.setListListener(p);
		p.columnItmProv_non_calc_flg.addAllListener(p);
		p.columnItmProv_ins_usr_id.addAllListener(p);
		p.columnItmProv_ins_usr_id.setListListener(p);
		p.columnItmProv_ins_usr_nm.addAllListener(p);
		p.columnItmProv_ins_usr_nm.setListListener(p);
		p.columnItmProv_ins_func_id.addAllListener(p);
		p.columnItmProv_ins_func_id.setListListener(p);
		p.columnItmProv_ins_func_nm.addAllListener(p);
		p.columnItmProv_ins_func_nm.setListListener(p);
		p.columnItmProv_ins_ts.addAllListener(p);
		p.columnItmProv_ins_ts.setListListener(p);
		p.columnItmProv_upd_usr_id.addAllListener(p);
		p.columnItmProv_upd_usr_id.setListListener(p);
		p.columnItmProv_upd_usr_nm.addAllListener(p);
		p.columnItmProv_upd_usr_nm.setListListener(p);
		p.columnItmProv_upd_func_id.addAllListener(p);
		p.columnItmProv_upd_func_id.setListListener(p);
		p.columnItmProv_upd_func_nm.addAllListener(p);
		p.columnItmProv_upd_func_nm.setListListener(p);
		p.columnItmProv_upd_ts.addAllListener(p);
		p.columnItmProv_upd_ts.setListListener(p);
		p.columnItmProv_upd_srv_req_no.addAllListener(p);
		p.columnItmProv_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [ItmSls]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmSls(MGBDP_BomExSrch p) {
		p.ItmSlsTable.addAllListener(p);
		p.columnItmSls_calc_ctg_cd.addAllListener(p);
		p.columnItmSls_calc_ctg_cd.setListListener(p);
		p.columnItmSls_calc_ctg_nm.addAllListener(p);
		p.columnItmSls_calc_ctg_nm.setListListener(p);
		p.columnItmSls_wg_cd.addAllListener(p);
		p.columnItmSls_wg_cd.setListListener(p);
		p.columnItmSls_wg_nm.addAllListener(p);
		p.columnItmSls_wg_nm.setListListener(p);
		p.columnItmSls_dpt_cd.addAllListener(p);
		p.columnItmSls_dpt_cd.setListListener(p);
		p.columnItmSls_dpt_nm.addAllListener(p);
		p.columnItmSls_dpt_nm.setListListener(p);
		p.columnItmSls_cst_cd.addAllListener(p);
		p.columnItmSls_cst_cd.setListListener(p);
		p.columnItmSls_cst_nm.addAllListener(p);
		p.columnItmSls_cst_nm.setListListener(p);
		p.columnItmSls_dlv_cd.addAllListener(p);
		p.columnItmSls_dlv_cd.setListListener(p);
		p.columnItmSls_dlv_nm.addAllListener(p);
		p.columnItmSls_dlv_nm.setListListener(p);
		p.columnItmSls_dest_cd1.addAllListener(p);
		p.columnItmSls_dest_cd1.setListListener(p);
		p.columnItmSls_dest_nm1.addAllListener(p);
		p.columnItmSls_dest_nm1.setListListener(p);
		p.columnItmSls_dest_cd2.addAllListener(p);
		p.columnItmSls_dest_cd2.setListListener(p);
		p.columnItmSls_dest_nm2.addAllListener(p);
		p.columnItmSls_dest_nm2.setListListener(p);
		p.columnItmSls_dest_cd3.addAllListener(p);
		p.columnItmSls_dest_cd3.setListListener(p);
		p.columnItmSls_dest_nm3.addAllListener(p);
		p.columnItmSls_dest_nm3.setListListener(p);
		p.columnItmSls_unit_cd.addAllListener(p);
		p.columnItmSls_unit_cd.setListListener(p);
		p.columnItmSls_unit_nm.addAllListener(p);
		p.columnItmSls_unit_nm.setListListener(p);
		p.columnItmSls_dec_place.addAllListener(p);
		p.columnItmSls_dec_place.setListListener(p);
		p.columnItmSls_cur_cd.addAllListener(p);
		p.columnItmSls_cur_cd.setListListener(p);
		p.columnItmSls_cur_nm.addAllListener(p);
		p.columnItmSls_cur_nm.setListListener(p);
		p.columnItmSls_upri_dec_place.addAllListener(p);
		p.columnItmSls_upri_dec_place.setListListener(p);
		p.columnItmSls_prio.addAllListener(p);
		p.columnItmSls_prio.setListListener(p);
		p.columnItmSls_alc_val1.addAllListener(p);
		p.columnItmSls_alc_val1.setListListener(p);
		p.columnItmSls_alc_val2.addAllListener(p);
		p.columnItmSls_alc_val2.setListListener(p);
		p.columnItmSls_alc_val3.addAllListener(p);
		p.columnItmSls_alc_val3.setListListener(p);
		p.columnItmSls_alc_val4.addAllListener(p);
		p.columnItmSls_alc_val4.setListListener(p);
		p.columnItmSls_alc_val5.addAllListener(p);
		p.columnItmSls_alc_val5.setListListener(p);
		p.columnItmSls_rmrks.addAllListener(p);
		p.columnItmSls_rmrks.setListListener(p);
		p.columnItmSls_sub_char1.addAllListener(p);
		p.columnItmSls_sub_char1.setListListener(p);
		p.columnItmSls_sub_char2.addAllListener(p);
		p.columnItmSls_sub_char2.setListListener(p);
		p.columnItmSls_sub_char3.addAllListener(p);
		p.columnItmSls_sub_char3.setListListener(p);
		p.columnItmSls_non_calc_flg.addAllListener(p);
		p.columnItmSls_ins_usr_id.addAllListener(p);
		p.columnItmSls_ins_usr_id.setListListener(p);
		p.columnItmSls_ins_usr_nm.addAllListener(p);
		p.columnItmSls_ins_usr_nm.setListListener(p);
		p.columnItmSls_ins_func_id.addAllListener(p);
		p.columnItmSls_ins_func_id.setListListener(p);
		p.columnItmSls_ins_func_nm.addAllListener(p);
		p.columnItmSls_ins_func_nm.setListListener(p);
		p.columnItmSls_ins_ts.addAllListener(p);
		p.columnItmSls_ins_ts.setListListener(p);
		p.columnItmSls_upd_usr_id.addAllListener(p);
		p.columnItmSls_upd_usr_id.setListListener(p);
		p.columnItmSls_upd_usr_nm.addAllListener(p);
		p.columnItmSls_upd_usr_nm.setListListener(p);
		p.columnItmSls_upd_func_id.addAllListener(p);
		p.columnItmSls_upd_func_id.setListListener(p);
		p.columnItmSls_upd_func_nm.addAllListener(p);
		p.columnItmSls_upd_func_nm.setListListener(p);
		p.columnItmSls_upd_ts.addAllListener(p);
		p.columnItmSls_upd_ts.setListListener(p);
		p.columnItmSls_upd_srv_req_no.addAllListener(p);
		p.columnItmSls_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [ItmFix]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmFix(MGBDP_BomExSrch p) {
		p.ItmFixTable.addAllListener(p);
		p.columnItmFix_calc_ctg_cd.addAllListener(p);
		p.columnItmFix_calc_ctg_cd.setListListener(p);
		p.columnItmFix_calc_ctg_nm.addAllListener(p);
		p.columnItmFix_calc_ctg_nm.setListListener(p);
		p.columnItmFix_wg_cd.addAllListener(p);
		p.columnItmFix_wg_cd.setListListener(p);
		p.columnItmFix_wg_nm.addAllListener(p);
		p.columnItmFix_wg_nm.setListListener(p);
		p.columnItmFix_expns_cd.addAllListener(p);
		p.columnItmFix_expns_cd.setListListener(p);
		p.columnItmFix_expns_nm.addAllListener(p);
		p.columnItmFix_expns_nm.setListListener(p);
		p.columnItmFix_unit_cd.addAllListener(p);
		p.columnItmFix_unit_cd.setListListener(p);
		p.columnItmFix_unit_nm.addAllListener(p);
		p.columnItmFix_unit_nm.setListListener(p);
		p.columnItmFix_dec_place.addAllListener(p);
		p.columnItmFix_dec_place.setListListener(p);
		p.columnItmFix_cur_cd.addAllListener(p);
		p.columnItmFix_cur_cd.setListListener(p);
		p.columnItmFix_cur_nm.addAllListener(p);
		p.columnItmFix_cur_nm.setListListener(p);
		p.columnItmFix_std_upri_dec_place.addAllListener(p);
		p.columnItmFix_std_upri_dec_place.setListListener(p);
		p.columnItmFix_rmrks.addAllListener(p);
		p.columnItmFix_rmrks.setListListener(p);
		p.columnItmFix_sub_char1.addAllListener(p);
		p.columnItmFix_sub_char1.setListListener(p);
		p.columnItmFix_sub_char2.addAllListener(p);
		p.columnItmFix_sub_char2.setListListener(p);
		p.columnItmFix_sub_char3.addAllListener(p);
		p.columnItmFix_sub_char3.setListListener(p);
		p.columnItmFix_non_calc_flg.addAllListener(p);
		p.columnItmFix_ins_usr_id.addAllListener(p);
		p.columnItmFix_ins_usr_id.setListListener(p);
		p.columnItmFix_ins_usr_nm.addAllListener(p);
		p.columnItmFix_ins_usr_nm.setListListener(p);
		p.columnItmFix_ins_func_id.addAllListener(p);
		p.columnItmFix_ins_func_id.setListListener(p);
		p.columnItmFix_ins_func_nm.addAllListener(p);
		p.columnItmFix_ins_func_nm.setListListener(p);
		p.columnItmFix_ins_ts.addAllListener(p);
		p.columnItmFix_ins_ts.setListListener(p);
		p.columnItmFix_upd_usr_id.addAllListener(p);
		p.columnItmFix_upd_usr_id.setListListener(p);
		p.columnItmFix_upd_usr_nm.addAllListener(p);
		p.columnItmFix_upd_usr_nm.setListListener(p);
		p.columnItmFix_upd_func_id.addAllListener(p);
		p.columnItmFix_upd_func_id.setListListener(p);
		p.columnItmFix_upd_func_nm.addAllListener(p);
		p.columnItmFix_upd_func_nm.setListListener(p);
		p.columnItmFix_upd_ts.addAllListener(p);
		p.columnItmFix_upd_ts.setListListener(p);
		p.columnItmFix_upd_srv_req_no.addAllListener(p);
		p.columnItmFix_upd_srv_req_no.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MGBDP_BomExSrch p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBDP_BomExSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBDP_BomExSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_is_srch_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_bom_ptn.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_par_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_chd_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_bom_ptn_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_max_hrrchy.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBDP_BomExSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MGBDP_BomExSrch p){
		p.RPnl_srch_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[DtlPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlPnl(MGBDP_BomExSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MGBDP_BomExSrch p){
		p.Dtl_hrrchy_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.READ_ONLY);
		p.Dtl_hrrchy_p_PPanel.columnHrrchy_loop_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_hrrchy_p_PPanel.columnHrrchy_leaf_str.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bottom_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_unreg_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_par_rqmt_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_par_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_par_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_par_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_chd_rqmt_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_chd_base_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_fxd_chd_rqmt_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_chd_min_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_chd_batch_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_chd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_alt_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_ratio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_expns_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_expns_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_upper_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dtl_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dtl_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_proc_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_proc_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_fix_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_fix_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MGBDP_BomExSrch p){
		p.Btn_srch_dtl.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MGBDP0540_ex1.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MGBDP0540_ex2.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MGBDP0520.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MGBDP0530.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MGBDP0530_chd.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Bottom(MGBDP_BomExSrch p){

	}

	/**
	 * [SRCH]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Itm(MGBDP_BomExSrch p){
		p.columnItm_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Itm_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItm_calc_ptn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_calc_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Itm_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItm_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnItm_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_non_calc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItm_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[ItmDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmDtl(MGBDP_BomExSrch p){
		p.columnItmDtl_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmDtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmDtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_rqst_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_rqst_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_cost_ratio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_oper_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ItmDtl_min_lot_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ItmDtl_batch_lot_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ItmDtl_fxd_lot_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ItmDtl_fxd_yield_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ItmDtl_nmr_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ItmDtl_dnm_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmDtl_alc_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_alc_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_exp_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_exp_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_exp_prio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmDtl_max_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmDtl_alc_val1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_alc_val2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_alc_val3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_alc_val4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_alc_val5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_non_calc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[ItmOper]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmOper(MGBDP_BomExSrch p){
		p.columnItmOper_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmOper_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmOper_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_oper_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_oper_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_yield_oper_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_nmr_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_dnm_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_oper_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_oper_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_oper_std_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_oper_conv_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_dec_place.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_unit_conv_rnd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_unit_conv_rnd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_non_calc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmOper_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[ItmWk]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmWk(MGBDP_BomExSrch p){
		p.columnItmWk_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmWk_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmWk_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_oper_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_oper_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_wk_cost_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_wk_cost_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmWk_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmWk_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ItmWk_wk_cost_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.ItmWk_fxd_wk_cost_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.ItmWk_min_wk_cost_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.ItmWk_batch_wk_cost_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnItmWk_wk_cost_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_wk_cost_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnItmWk_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_non_calc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmWk_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[ItmPurc]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmPurc(MGBDP_BomExSrch p){
		p.columnItmPurc_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmPurc_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmPurc_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmPurc_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmPurc_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnItmPurc_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmPurc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnItmPurc_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnItmPurc_cost_ratio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_non_calc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmPurc_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[ItmProc]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmProc(MGBDP_BomExSrch p){
		p.columnItmProc_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmProc_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmProc_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmProc_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmProc_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnItmProc_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmProc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnItmProc_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnItmProc_cost_ratio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_non_calc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProc_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[ItmProv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmProv(MGBDP_BomExSrch p){
		p.columnItmProv_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmProv_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmProv_prsppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_prsppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_prov_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmProv_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmProv_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnItmProv_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmProv_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnItmProv_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnItmProv_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_non_calc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmProv_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[ItmSls]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmSls(MGBDP_BomExSrch p){
		p.columnItmSls_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmSls_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmSls_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_dlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_dlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmSls_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmSls_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnItmSls_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmSls_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnItmSls_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnItmSls_prio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_alc_val1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_alc_val2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_alc_val3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_alc_val4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_alc_val5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_non_calc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmSls_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[ItmFix]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmFix(MGBDP_BomExSrch p){
		p.columnItmFix_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmFix_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmFix_expns_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_expns_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmFix_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmFix_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ItmFix_std_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnItmFix_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_std_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnItmFix_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_non_calc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmFix_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MGBDP_BomExSrch p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBDP_BomExSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBDP_BomExSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBDP_BomExSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_is_srch_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_bom_ptn.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_par_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_chd_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_bom_ptn_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_max_hrrchy.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBDP_BomExSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MGBDP_BomExSrch p){
		p.RPnl_srch_all.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[DtlPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlPnl(MGBDP_BomExSrch p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MGBDP_BomExSrch p){
		p.Dtl_hrrchy_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.REQUIRED);
		p.Dtl_hrrchy_p_PPanel.columnHrrchy_loop_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_hrrchy_p_PPanel.columnHrrchy_leaf_str.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bottom_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_unreg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_par_rqmt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_par_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_chd_rqmt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_chd_base_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_fxd_chd_rqmt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_chd_min_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_chd_batch_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_chd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_alt_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_upper_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dtl_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dtl_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_proc_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_proc_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBDP_BomExSrch p){
		p.Btn_srch_dtl.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBDP0540_ex1.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBDP0540_ex2.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBDP0520.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBDP0530.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBDP0530_chd.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitREF_Bottom(MGBDP_BomExSrch p){

	}

	/**
	 * [REF]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitREF_Itm(MGBDP_BomExSrch p){
		p.columnItm_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Itm_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItm_calc_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_calc_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Itm_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItm_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnItm_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_non_calc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItm_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ItmDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_ItmDtl(MGBDP_BomExSrch p){
		p.columnItmDtl_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmDtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmDtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_rqst_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_rqst_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_cost_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_oper_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.ItmDtl_min_lot_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ItmDtl_batch_lot_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ItmDtl_fxd_lot_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ItmDtl_fxd_yield_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ItmDtl_nmr_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ItmDtl_dnm_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmDtl_alc_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_alc_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_exp_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_exp_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_exp_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmDtl_max_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmDtl_alc_val1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_alc_val2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_alc_val3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_alc_val4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_alc_val5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_non_calc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ItmOper]ブロックのモードの設定
	 */
	protected static void statusInitREF_ItmOper(MGBDP_BomExSrch p){
		p.columnItmOper_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmOper_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmOper_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_oper_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_oper_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_yield_oper_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_nmr_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_dnm_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_oper_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_oper_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_oper_std_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_oper_conv_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_dec_place.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_unit_conv_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_unit_conv_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_non_calc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmOper_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ItmWk]ブロックのモードの設定
	 */
	protected static void statusInitREF_ItmWk(MGBDP_BomExSrch p){
		p.columnItmWk_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmWk_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmWk_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_oper_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_oper_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_wk_cost_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_wk_cost_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmWk_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmWk_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.ItmWk_wk_cost_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.ItmWk_fxd_wk_cost_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.ItmWk_min_wk_cost_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.ItmWk_batch_wk_cost_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnItmWk_wk_cost_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_wk_cost_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnItmWk_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_non_calc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmWk_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ItmPurc]ブロックのモードの設定
	 */
	protected static void statusInitREF_ItmPurc(MGBDP_BomExSrch p){
		p.columnItmPurc_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmPurc_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmPurc_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmPurc_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmPurc_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnItmPurc_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmPurc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnItmPurc_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnItmPurc_cost_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_non_calc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmPurc_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ItmProc]ブロックのモードの設定
	 */
	protected static void statusInitREF_ItmProc(MGBDP_BomExSrch p){
		p.columnItmProc_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmProc_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmProc_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmProc_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmProc_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnItmProc_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmProc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnItmProc_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnItmProc_cost_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_non_calc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProc_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ItmProv]ブロックのモードの設定
	 */
	protected static void statusInitREF_ItmProv(MGBDP_BomExSrch p){
		p.columnItmProv_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmProv_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmProv_prsppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_prsppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_prov_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_prov_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmProv_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmProv_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnItmProv_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmProv_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnItmProv_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnItmProv_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_non_calc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmProv_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ItmSls]ブロックのモードの設定
	 */
	protected static void statusInitREF_ItmSls(MGBDP_BomExSrch p){
		p.columnItmSls_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmSls_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmSls_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_dlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_dlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_dest_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_dest_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_dest_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_dest_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_dest_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_dest_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmSls_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmSls_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnItmSls_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmSls_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnItmSls_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnItmSls_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_alc_val1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_alc_val2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_alc_val3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_alc_val4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_alc_val5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_non_calc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmSls_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ItmFix]ブロックのモードの設定
	 */
	protected static void statusInitREF_ItmFix(MGBDP_BomExSrch p){
		p.columnItmFix_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmFix_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmFix_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ItmFix_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnItmFix_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.ItmFix_std_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnItmFix_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_std_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnItmFix_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_non_calc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnItmFix_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBDP_BomExSrch p){

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
		MGBDP_BomExSrch_MC.setTableConfigDtl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.setTableConfigItm((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.setTableConfigItmDtl((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.setTableConfigItmOper((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.setTableConfigItmWk((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.setTableConfigItmPurc((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.setTableConfigItmProc((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.setTableConfigItmProv((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.setTableConfigItmSls((MGBDP_BomExSrch)this);
		MGBDP_BomExSrch_MC.setTableConfigItmFix((MGBDP_BomExSrch)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MGBDP_BomExSrch p) {
		p.DtlTable.addTable(p.Dtl_hrrchy_p_PPanel.HrrchyTable);
		p.columnDtl_bottom_flg.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.bottom_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bottom_flg);
		p.columnDtl_unreg_flg.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.unreg_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unreg_flg);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.columnDtl_itm_typ.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ);
		p.columnDtl_itm_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_nm);
		p.columnDtl_itm_typ_d_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_cd);
		p.columnDtl_itm_typ_d_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm);
		p.columnDtl_itm_jnl_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.itm_jnl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_jnl_cd);
		p.columnDtl_itm_jnl_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.itm_jnl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_jnl_nm);
		p.columnDtl_bom_ptn.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_ptn);
		p.columnDtl_oper_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.oper_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_cd);
		p.columnDtl_oper_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.oper_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_nm);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.DtlTable.addTable(p.Dtl_par_rqmt_qty_p_PPanel.QtyTable);
		p.Dtl_par_rqmt_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnDtl_par_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.par_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_unit_cd);
		p.columnDtl_par_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.par_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_unit_nm);
		p.columnDtl_par_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.par_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_dec_place);
		p.DtlTable.addTable(p.Dtl_chd_rqmt_qty_p_PPanel.QtyTable);
		p.Dtl_chd_rqmt_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_chd_base_qty_p_PPanel.QtyTable);
		p.Dtl_chd_base_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_fxd_chd_rqmt_qty_p_PPanel.QtyTable);
		p.Dtl_fxd_chd_rqmt_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_chd_min_qty_p_PPanel.QtyTable);
		p.Dtl_chd_min_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_chd_batch_qty_p_PPanel.QtyTable);
		p.Dtl_chd_batch_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnDtl_chd_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.chd_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_unit_cd);
		p.columnDtl_chd_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.chd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_unit_nm);
		p.columnDtl_chd_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.chd_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_dec_place);
		p.columnDtl_alt_grp_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.alt_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_grp_cd);
		p.columnDtl_alt_itm_ratio.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.alt_itm_ratio_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_itm_ratio);
		p.columnDtl_expns_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.expns_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_expns_cd);
		p.columnDtl_expns_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.expns_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_expns_nm);
		p.DtlTable.addTable(p.Dtl_upper_itm_p_PPanel.ItmTable);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.columnDtl_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.calc_ctg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_ctg_cd);
		p.columnDtl_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.calc_ctg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_ctg_nm);
		p.columnDtl_itm_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.itm_calc_ctg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_calc_ctg_cd);
		p.columnDtl_itm_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.itm_calc_ctg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_calc_ctg_nm);
		p.columnDtl_dtl_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.dtl_calc_ctg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dtl_calc_ctg_cd);
		p.columnDtl_dtl_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.dtl_calc_ctg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dtl_calc_ctg_nm);
		p.columnDtl_purc_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.purc_calc_ctg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_calc_ctg_cd);
		p.columnDtl_purc_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.purc_calc_ctg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_calc_ctg_nm);
		p.columnDtl_proc_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.proc_calc_ctg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_proc_calc_ctg_cd);
		p.columnDtl_proc_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.proc_calc_ctg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_proc_calc_ctg_nm);
		p.columnDtl_prov_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.prov_calc_ctg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_calc_ctg_cd);
		p.columnDtl_prov_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.prov_calc_ctg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_calc_ctg_nm);
		p.columnDtl_sls_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.sls_calc_ctg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_calc_ctg_cd);
		p.columnDtl_sls_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.sls_calc_ctg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_calc_ctg_nm);
		p.columnDtl_fix_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.fix_calc_ctg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix_calc_ctg_cd);
		p.columnDtl_fix_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.DtlR.fix_calc_ctg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix_calc_ctg_nm);
	}

	/**
	 * [Itm]ブロックのTableの設定
	 */
	protected static void setTableConfigItm(MGBDP_BomExSrch p) {
		p.columnItm_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.calc_ctg_cd_META);
		p.ItmTable.addColumnConfig(p.columnItm_calc_ctg_cd);
		p.columnItm_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.calc_ctg_nm_META);
		p.ItmTable.addColumnConfig(p.columnItm_calc_ctg_nm);
		p.columnItm_wg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.wg_cd_META);
		p.ItmTable.addColumnConfig(p.columnItm_wg_cd);
		p.columnItm_wg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.wg_nm_META);
		p.ItmTable.addColumnConfig(p.columnItm_wg_nm);
		p.ItmTable.addTable(p.Itm_itm_p_PPanel.ItmTable);
		p.columnItm_calc_ptn_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.calc_ptn_cd_META);
		p.ItmTable.addColumnConfig(p.columnItm_calc_ptn_cd);
		p.columnItm_calc_ptn_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.calc_ptn_nm_META);
		p.ItmTable.addColumnConfig(p.columnItm_calc_ptn_nm);
		p.ItmTable.addTable(p.Itm_qty_p_PPanel.QtyTable);
		p.Itm_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnItm_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.unit_cd_META);
		p.ItmTable.addColumnConfig(p.columnItm_unit_cd);
		p.columnItm_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.unit_nm_META);
		p.ItmTable.addColumnConfig(p.columnItm_unit_nm);
		p.columnItm_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.dec_place_META);
		p.ItmTable.addColumnConfig(p.columnItm_dec_place);
		p.columnItm_rmrks.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.rmrks_META);
		p.ItmTable.addColumnConfig(p.columnItm_rmrks);
		p.columnItm_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.sub_char1_META);
		p.ItmTable.addColumnConfig(p.columnItm_sub_char1);
		p.columnItm_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.sub_char2_META);
		p.ItmTable.addColumnConfig(p.columnItm_sub_char2);
		p.columnItm_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.sub_char3_META);
		p.ItmTable.addColumnConfig(p.columnItm_sub_char3);
		p.columnItm_non_calc_flg.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.non_calc_flg_META);
		p.ItmTable.addColumnConfig(p.columnItm_non_calc_flg);
		p.columnItm_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.ins_usr_id_META);
		p.ItmTable.addColumnConfig(p.columnItm_ins_usr_id);
		p.columnItm_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.ins_usr_nm_META);
		p.ItmTable.addColumnConfig(p.columnItm_ins_usr_nm);
		p.columnItm_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.ins_func_id_META);
		p.ItmTable.addColumnConfig(p.columnItm_ins_func_id);
		p.columnItm_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.ins_func_nm_META);
		p.ItmTable.addColumnConfig(p.columnItm_ins_func_nm);
		p.columnItm_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.ins_ts_META);
		p.columnItm_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmTable.addColumnConfig(p.columnItm_ins_ts);
		p.columnItm_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.upd_usr_id_META);
		p.ItmTable.addColumnConfig(p.columnItm_upd_usr_id);
		p.columnItm_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.upd_usr_nm_META);
		p.ItmTable.addColumnConfig(p.columnItm_upd_usr_nm);
		p.columnItm_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.upd_func_id_META);
		p.ItmTable.addColumnConfig(p.columnItm_upd_func_id);
		p.columnItm_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.upd_func_nm_META);
		p.ItmTable.addColumnConfig(p.columnItm_upd_func_nm);
		p.columnItm_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.upd_ts_META);
		p.columnItm_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmTable.addColumnConfig(p.columnItm_upd_ts);
		p.columnItm_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0540.ItmR.upd_srv_req_no_META);
		p.ItmTable.addColumnConfig(p.columnItm_upd_srv_req_no);
	}

	/**
	 * [ItmDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigItmDtl(MGBDP_BomExSrch p) {
		p.columnItmDtl_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.calc_ctg_cd_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_calc_ctg_cd);
		p.columnItmDtl_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.calc_ctg_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_calc_ctg_nm);
		p.columnItmDtl_wg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.wg_cd_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_wg_cd);
		p.columnItmDtl_wg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.wg_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_wg_nm);
		p.ItmDtlTable.addTable(p.ItmDtl_itm_p_PPanel.ItmTable);
		p.columnItmDtl_loc_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.loc_cd_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_loc_cd);
		p.columnItmDtl_loc_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.loc_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_loc_nm);
		p.columnItmDtl_sppl_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.sppl_cd_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_sppl_cd);
		p.columnItmDtl_sppl_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.sppl_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_sppl_nm);
		p.columnItmDtl_rqst_wg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.rqst_wg_cd_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_rqst_wg_cd);
		p.columnItmDtl_rqst_wg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.rqst_wg_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_rqst_wg_nm);
		p.columnItmDtl_cost_ratio.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.cost_ratio_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_cost_ratio);
		p.columnItmDtl_oper_ptn.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.oper_ptn_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_oper_ptn);
		p.columnItmDtl_bom_ptn.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.bom_ptn_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_bom_ptn);
		p.columnItmDtl_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.unit_cd_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_unit_cd);
		p.columnItmDtl_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.unit_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_unit_nm);
		p.columnItmDtl_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.dec_place_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_dec_place);
		p.ItmDtlTable.addTable(p.ItmDtl_min_lot_qty_p_PPanel.QtyTable);
		p.ItmDtl_min_lot_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.ItmDtlTable.addTable(p.ItmDtl_batch_lot_qty_p_PPanel.QtyTable);
		p.ItmDtl_batch_lot_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.ItmDtlTable.addTable(p.ItmDtl_fxd_lot_qty_p_PPanel.QtyTable);
		p.ItmDtl_fxd_lot_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.ItmDtlTable.addTable(p.ItmDtl_fxd_yield_qty_p_PPanel.QtyTable);
		p.ItmDtl_fxd_yield_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.ItmDtlTable.addTable(p.ItmDtl_nmr_qty_p_PPanel.QtyTable);
		p.ItmDtl_nmr_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.ItmDtlTable.addTable(p.ItmDtl_dnm_qty_p_PPanel.QtyTable);
		p.ItmDtl_dnm_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnItmDtl_alc_dpt_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.alc_dpt_cd_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_alc_dpt_cd);
		p.columnItmDtl_alc_dpt_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.alc_dpt_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_alc_dpt_nm);
		p.columnItmDtl_exp_dpt_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.exp_dpt_cd_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_exp_dpt_cd);
		p.columnItmDtl_exp_dpt_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.exp_dpt_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_exp_dpt_nm);
		p.columnItmDtl_exp_prio.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.exp_prio_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_exp_prio);
		p.ItmDtlTable.addTable(p.ItmDtl_max_qty_p_PPanel.QtyTable);
		p.ItmDtl_max_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnItmDtl_alc_val1.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.alc_val1_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_alc_val1);
		p.columnItmDtl_alc_val2.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.alc_val2_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_alc_val2);
		p.columnItmDtl_alc_val3.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.alc_val3_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_alc_val3);
		p.columnItmDtl_alc_val4.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.alc_val4_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_alc_val4);
		p.columnItmDtl_alc_val5.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.alc_val5_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_alc_val5);
		p.columnItmDtl_rmrks.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.rmrks_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_rmrks);
		p.columnItmDtl_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.sub_char1_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_sub_char1);
		p.columnItmDtl_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.sub_char2_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_sub_char2);
		p.columnItmDtl_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.sub_char3_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_sub_char3);
		p.columnItmDtl_non_calc_flg.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.non_calc_flg_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_non_calc_flg);
		p.columnItmDtl_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.ins_usr_id_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_ins_usr_id);
		p.columnItmDtl_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.ins_usr_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_ins_usr_nm);
		p.columnItmDtl_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.ins_func_id_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_ins_func_id);
		p.columnItmDtl_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.ins_func_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_ins_func_nm);
		p.columnItmDtl_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.ins_ts_META);
		p.columnItmDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_ins_ts);
		p.columnItmDtl_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.upd_usr_id_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upd_usr_id);
		p.columnItmDtl_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.upd_usr_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upd_usr_nm);
		p.columnItmDtl_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.upd_func_id_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upd_func_id);
		p.columnItmDtl_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.upd_func_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upd_func_nm);
		p.columnItmDtl_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.upd_ts_META);
		p.columnItmDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upd_ts);
		p.columnItmDtl_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0540.ItmDtlR.upd_srv_req_no_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upd_srv_req_no);
	}

	/**
	 * [ItmOper]ブロックのTableの設定
	 */
	protected static void setTableConfigItmOper(MGBDP_BomExSrch p) {
		p.columnItmOper_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.calc_ctg_cd_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_calc_ctg_cd);
		p.columnItmOper_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.calc_ctg_nm_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_calc_ctg_nm);
		p.columnItmOper_wg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.wg_cd_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_wg_cd);
		p.columnItmOper_wg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.wg_nm_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_wg_nm);
		p.ItmOperTable.addTable(p.ItmOper_itm_p_PPanel.ItmTable);
		p.columnItmOper_loc_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.loc_cd_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_loc_cd);
		p.columnItmOper_loc_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.loc_nm_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_loc_nm);
		p.columnItmOper_oper_ptn.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.oper_ptn_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_oper_ptn);
		p.columnItmOper_oper_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.oper_cd_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_oper_cd);
		p.columnItmOper_oper_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.oper_nm_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_oper_nm);
		p.columnItmOper_oper_seq.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.oper_seq_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_oper_seq);
		p.columnItmOper_disp_seq.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.disp_seq_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_disp_seq);
		p.columnItmOper_yield_oper_flg.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.yield_oper_flg_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_yield_oper_flg);
		p.columnItmOper_nmr_qty.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.nmr_qty_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_nmr_qty);
		p.columnItmOper_dnm_qty.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.dnm_qty_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_dnm_qty);
		p.columnItmOper_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.unit_cd_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_unit_cd);
		p.columnItmOper_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.unit_nm_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_unit_nm);
		p.columnItmOper_oper_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.oper_unit_cd_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_oper_unit_cd);
		p.columnItmOper_oper_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.oper_unit_nm_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_oper_unit_nm);
		p.columnItmOper_oper_std_qty.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.oper_std_qty_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_oper_std_qty);
		p.columnItmOper_oper_conv_qty.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.oper_conv_qty_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_oper_conv_qty);
		p.columnItmOper_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.dec_place_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_dec_place);
		p.columnItmOper_unit_conv_rnd_typ.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.unit_conv_rnd_typ_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_unit_conv_rnd_typ);
		p.columnItmOper_unit_conv_rnd_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.unit_conv_rnd_typ_nm_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_unit_conv_rnd_typ_nm);
		p.columnItmOper_rmrks.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.rmrks_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_rmrks);
		p.columnItmOper_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.sub_char1_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_sub_char1);
		p.columnItmOper_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.sub_char2_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_sub_char2);
		p.columnItmOper_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.sub_char3_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_sub_char3);
		p.columnItmOper_non_calc_flg.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.non_calc_flg_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_non_calc_flg);
		p.columnItmOper_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.ins_usr_id_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_ins_usr_id);
		p.columnItmOper_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.ins_usr_nm_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_ins_usr_nm);
		p.columnItmOper_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.ins_func_id_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_ins_func_id);
		p.columnItmOper_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.ins_func_nm_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_ins_func_nm);
		p.columnItmOper_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.ins_ts_META);
		p.columnItmOper_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_ins_ts);
		p.columnItmOper_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.upd_usr_id_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_upd_usr_id);
		p.columnItmOper_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.upd_usr_nm_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_upd_usr_nm);
		p.columnItmOper_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.upd_func_id_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_upd_func_id);
		p.columnItmOper_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.upd_func_nm_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_upd_func_nm);
		p.columnItmOper_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.upd_ts_META);
		p.columnItmOper_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_upd_ts);
		p.columnItmOper_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0540.ItmOperR.upd_srv_req_no_META);
		p.ItmOperTable.addColumnConfig(p.columnItmOper_upd_srv_req_no);
	}

	/**
	 * [ItmWk]ブロックのTableの設定
	 */
	protected static void setTableConfigItmWk(MGBDP_BomExSrch p) {
		p.columnItmWk_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.calc_ctg_cd_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_calc_ctg_cd);
		p.columnItmWk_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.calc_ctg_nm_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_calc_ctg_nm);
		p.columnItmWk_wg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.wg_cd_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_wg_cd);
		p.columnItmWk_wg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.wg_nm_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_wg_nm);
		p.ItmWkTable.addTable(p.ItmWk_itm_p_PPanel.ItmTable);
		p.columnItmWk_loc_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.loc_cd_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_loc_cd);
		p.columnItmWk_loc_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.loc_nm_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_loc_nm);
		p.columnItmWk_oper_ptn.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.oper_ptn_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_oper_ptn);
		p.columnItmWk_oper_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.oper_cd_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_oper_cd);
		p.columnItmWk_oper_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.oper_nm_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_oper_nm);
		p.columnItmWk_oper_seq.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.oper_seq_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_oper_seq);
		p.columnItmWk_wk_cost_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.wk_cost_cd_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_wk_cost_cd);
		p.columnItmWk_wk_cost_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.wk_cost_nm_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_wk_cost_nm);
		p.ItmWkTable.addTable(p.ItmWk_qty_p_PPanel.QtyTable);
		p.ItmWk_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnItmWk_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.unit_cd_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_unit_cd);
		p.columnItmWk_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.unit_nm_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_unit_nm);
		p.columnItmWk_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.dec_place_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_dec_place);
		p.ItmWkTable.addTable(p.ItmWk_wk_cost_p_PPanel.WkCostQtyTable);
		p.ItmWkTable.addTable(p.ItmWk_fxd_wk_cost_p_PPanel.WkCostQtyTable);
		p.ItmWkTable.addTable(p.ItmWk_min_wk_cost_p_PPanel.WkCostQtyTable);
		p.ItmWkTable.addTable(p.ItmWk_batch_wk_cost_p_PPanel.WkCostQtyTable);
		p.columnItmWk_wk_cost_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.wk_cost_unit_nm_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_wk_cost_unit_nm);
		p.columnItmWk_wk_cost_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.wk_cost_dec_place_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_wk_cost_dec_place);
		p.columnItmWk_rmrks.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.rmrks_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_rmrks);
		p.columnItmWk_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.sub_char1_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_sub_char1);
		p.columnItmWk_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.sub_char2_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_sub_char2);
		p.columnItmWk_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.sub_char3_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_sub_char3);
		p.columnItmWk_non_calc_flg.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.non_calc_flg_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_non_calc_flg);
		p.columnItmWk_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.ins_usr_id_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_ins_usr_id);
		p.columnItmWk_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.ins_usr_nm_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_ins_usr_nm);
		p.columnItmWk_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.ins_func_id_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_ins_func_id);
		p.columnItmWk_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.ins_func_nm_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_ins_func_nm);
		p.columnItmWk_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.ins_ts_META);
		p.columnItmWk_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_ins_ts);
		p.columnItmWk_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.upd_usr_id_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_upd_usr_id);
		p.columnItmWk_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.upd_usr_nm_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_upd_usr_nm);
		p.columnItmWk_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.upd_func_id_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_upd_func_id);
		p.columnItmWk_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.upd_func_nm_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_upd_func_nm);
		p.columnItmWk_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.upd_ts_META);
		p.columnItmWk_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_upd_ts);
		p.columnItmWk_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0540.ItmWkR.upd_srv_req_no_META);
		p.ItmWkTable.addColumnConfig(p.columnItmWk_upd_srv_req_no);
	}

	/**
	 * [ItmPurc]ブロックのTableの設定
	 */
	protected static void setTableConfigItmPurc(MGBDP_BomExSrch p) {
		p.columnItmPurc_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.calc_ctg_cd_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_calc_ctg_cd);
		p.columnItmPurc_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.calc_ctg_nm_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_calc_ctg_nm);
		p.columnItmPurc_wg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.wg_cd_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_wg_cd);
		p.columnItmPurc_wg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.wg_nm_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_wg_nm);
		p.ItmPurcTable.addTable(p.ItmPurc_itm_p_PPanel.ItmTable);
		p.columnItmPurc_sppl_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.sppl_cd_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_sppl_cd);
		p.columnItmPurc_sppl_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.sppl_nm_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_sppl_nm);
		p.ItmPurcTable.addTable(p.ItmPurc_qty_p_PPanel.QtyTable);
		p.ItmPurc_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnItmPurc_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.unit_cd_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_unit_cd);
		p.columnItmPurc_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.unit_nm_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_unit_nm);
		p.columnItmPurc_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.dec_place_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_dec_place);
		p.columnItmPurc_cur_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.cur_cd_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_cur_cd);
		p.columnItmPurc_cur_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.cur_nm_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_cur_nm);
		p.ItmPurcTable.addTable(p.ItmPurc_upri_p_PPanel.UpriTable);
		p.ItmPurc_upri_p_PPanel.columnUpri_upri.setMinusEnable(true);
		p.columnItmPurc_upri_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.upri_dec_place_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_upri_dec_place);
		p.columnItmPurc_cost_ratio.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.cost_ratio_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_cost_ratio);
		p.columnItmPurc_rmrks.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.rmrks_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_rmrks);
		p.columnItmPurc_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.sub_char1_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_sub_char1);
		p.columnItmPurc_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.sub_char2_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_sub_char2);
		p.columnItmPurc_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.sub_char3_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_sub_char3);
		p.columnItmPurc_non_calc_flg.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.non_calc_flg_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_non_calc_flg);
		p.columnItmPurc_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.ins_usr_id_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_ins_usr_id);
		p.columnItmPurc_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.ins_usr_nm_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_ins_usr_nm);
		p.columnItmPurc_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.ins_func_id_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_ins_func_id);
		p.columnItmPurc_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.ins_func_nm_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_ins_func_nm);
		p.columnItmPurc_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.ins_ts_META);
		p.columnItmPurc_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_ins_ts);
		p.columnItmPurc_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.upd_usr_id_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_upd_usr_id);
		p.columnItmPurc_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.upd_usr_nm_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_upd_usr_nm);
		p.columnItmPurc_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.upd_func_id_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_upd_func_id);
		p.columnItmPurc_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.upd_func_nm_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_upd_func_nm);
		p.columnItmPurc_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.upd_ts_META);
		p.columnItmPurc_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_upd_ts);
		p.columnItmPurc_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0540.ItmPurcR.upd_srv_req_no_META);
		p.ItmPurcTable.addColumnConfig(p.columnItmPurc_upd_srv_req_no);
	}

	/**
	 * [ItmProc]ブロックのTableの設定
	 */
	protected static void setTableConfigItmProc(MGBDP_BomExSrch p) {
		p.columnItmProc_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.calc_ctg_cd_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_calc_ctg_cd);
		p.columnItmProc_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.calc_ctg_nm_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_calc_ctg_nm);
		p.columnItmProc_wg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.wg_cd_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_wg_cd);
		p.columnItmProc_wg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.wg_nm_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_wg_nm);
		p.ItmProcTable.addTable(p.ItmProc_itm_p_PPanel.ItmTable);
		p.columnItmProc_sppl_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.sppl_cd_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_sppl_cd);
		p.columnItmProc_sppl_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.sppl_nm_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_sppl_nm);
		p.ItmProcTable.addTable(p.ItmProc_qty_p_PPanel.QtyTable);
		p.ItmProc_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnItmProc_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.unit_cd_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_unit_cd);
		p.columnItmProc_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.unit_nm_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_unit_nm);
		p.columnItmProc_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.dec_place_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_dec_place);
		p.columnItmProc_cur_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.cur_cd_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_cur_cd);
		p.columnItmProc_cur_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.cur_nm_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_cur_nm);
		p.ItmProcTable.addTable(p.ItmProc_upri_p_PPanel.UpriTable);
		p.ItmProc_upri_p_PPanel.columnUpri_upri.setMinusEnable(true);
		p.columnItmProc_upri_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.upri_dec_place_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_upri_dec_place);
		p.columnItmProc_cost_ratio.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.cost_ratio_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_cost_ratio);
		p.columnItmProc_rmrks.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.rmrks_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_rmrks);
		p.columnItmProc_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.sub_char1_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_sub_char1);
		p.columnItmProc_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.sub_char2_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_sub_char2);
		p.columnItmProc_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.sub_char3_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_sub_char3);
		p.columnItmProc_non_calc_flg.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.non_calc_flg_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_non_calc_flg);
		p.columnItmProc_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.ins_usr_id_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_ins_usr_id);
		p.columnItmProc_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.ins_usr_nm_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_ins_usr_nm);
		p.columnItmProc_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.ins_func_id_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_ins_func_id);
		p.columnItmProc_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.ins_func_nm_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_ins_func_nm);
		p.columnItmProc_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.ins_ts_META);
		p.columnItmProc_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_ins_ts);
		p.columnItmProc_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.upd_usr_id_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_upd_usr_id);
		p.columnItmProc_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.upd_usr_nm_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_upd_usr_nm);
		p.columnItmProc_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.upd_func_id_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_upd_func_id);
		p.columnItmProc_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.upd_func_nm_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_upd_func_nm);
		p.columnItmProc_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.upd_ts_META);
		p.columnItmProc_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_upd_ts);
		p.columnItmProc_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProcR.upd_srv_req_no_META);
		p.ItmProcTable.addColumnConfig(p.columnItmProc_upd_srv_req_no);
	}

	/**
	 * [ItmProv]ブロックのTableの設定
	 */
	protected static void setTableConfigItmProv(MGBDP_BomExSrch p) {
		p.columnItmProv_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.calc_ctg_cd_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_calc_ctg_cd);
		p.columnItmProv_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.calc_ctg_nm_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_calc_ctg_nm);
		p.columnItmProv_wg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.wg_cd_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_wg_cd);
		p.columnItmProv_wg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.wg_nm_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_wg_nm);
		p.ItmProvTable.addTable(p.ItmProv_itm_p_PPanel.ItmTable);
		p.columnItmProv_prsppl_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.prsppl_cd_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_prsppl_cd);
		p.columnItmProv_prsppl_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.prsppl_nm_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_prsppl_nm);
		p.columnItmProv_prov_typ.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.prov_typ_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_prov_typ);
		p.columnItmProv_prov_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.prov_typ_nm_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_prov_typ_nm);
		p.ItmProvTable.addTable(p.ItmProv_qty_p_PPanel.QtyTable);
		p.ItmProv_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnItmProv_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.unit_cd_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_unit_cd);
		p.columnItmProv_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.unit_nm_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_unit_nm);
		p.columnItmProv_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.dec_place_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_dec_place);
		p.columnItmProv_cur_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.cur_cd_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_cur_cd);
		p.columnItmProv_cur_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.cur_nm_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_cur_nm);
		p.ItmProvTable.addTable(p.ItmProv_upri_p_PPanel.UpriTable);
		p.ItmProv_upri_p_PPanel.columnUpri_upri.setMinusEnable(true);
		p.columnItmProv_upri_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.upri_dec_place_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_upri_dec_place);
		p.columnItmProv_rmrks.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.rmrks_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_rmrks);
		p.columnItmProv_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.sub_char1_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_sub_char1);
		p.columnItmProv_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.sub_char2_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_sub_char2);
		p.columnItmProv_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.sub_char3_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_sub_char3);
		p.columnItmProv_non_calc_flg.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.non_calc_flg_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_non_calc_flg);
		p.columnItmProv_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.ins_usr_id_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_ins_usr_id);
		p.columnItmProv_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.ins_usr_nm_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_ins_usr_nm);
		p.columnItmProv_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.ins_func_id_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_ins_func_id);
		p.columnItmProv_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.ins_func_nm_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_ins_func_nm);
		p.columnItmProv_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.ins_ts_META);
		p.columnItmProv_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_ins_ts);
		p.columnItmProv_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.upd_usr_id_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_upd_usr_id);
		p.columnItmProv_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.upd_usr_nm_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_upd_usr_nm);
		p.columnItmProv_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.upd_func_id_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_upd_func_id);
		p.columnItmProv_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.upd_func_nm_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_upd_func_nm);
		p.columnItmProv_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.upd_ts_META);
		p.columnItmProv_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_upd_ts);
		p.columnItmProv_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0540.ItmProvR.upd_srv_req_no_META);
		p.ItmProvTable.addColumnConfig(p.columnItmProv_upd_srv_req_no);
	}

	/**
	 * [ItmSls]ブロックのTableの設定
	 */
	protected static void setTableConfigItmSls(MGBDP_BomExSrch p) {
		p.columnItmSls_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.calc_ctg_cd_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_calc_ctg_cd);
		p.columnItmSls_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.calc_ctg_nm_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_calc_ctg_nm);
		p.columnItmSls_wg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.wg_cd_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_wg_cd);
		p.columnItmSls_wg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.wg_nm_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_wg_nm);
		p.ItmSlsTable.addTable(p.ItmSls_itm_p_PPanel.ItmTable);
		p.columnItmSls_dpt_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.dpt_cd_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_dpt_cd);
		p.columnItmSls_dpt_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.dpt_nm_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_dpt_nm);
		p.columnItmSls_cst_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.cst_cd_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_cst_cd);
		p.columnItmSls_cst_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.cst_nm_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_cst_nm);
		p.columnItmSls_dlv_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.dlv_cd_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_dlv_cd);
		p.columnItmSls_dlv_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.dlv_nm_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_dlv_nm);
		p.columnItmSls_dest_cd1.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.dest_cd1_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_dest_cd1);
		p.columnItmSls_dest_nm1.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.dest_nm1_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_dest_nm1);
		p.columnItmSls_dest_cd2.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.dest_cd2_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_dest_cd2);
		p.columnItmSls_dest_nm2.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.dest_nm2_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_dest_nm2);
		p.columnItmSls_dest_cd3.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.dest_cd3_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_dest_cd3);
		p.columnItmSls_dest_nm3.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.dest_nm3_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_dest_nm3);
		p.ItmSlsTable.addTable(p.ItmSls_qty_p_PPanel.QtyTable);
		p.ItmSls_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnItmSls_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.unit_cd_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_unit_cd);
		p.columnItmSls_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.unit_nm_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_unit_nm);
		p.columnItmSls_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.dec_place_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_dec_place);
		p.columnItmSls_cur_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.cur_cd_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_cur_cd);
		p.columnItmSls_cur_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.cur_nm_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_cur_nm);
		p.ItmSlsTable.addTable(p.ItmSls_upri_p_PPanel.UpriTable);
		p.ItmSls_upri_p_PPanel.columnUpri_upri.setMinusEnable(true);
		p.columnItmSls_upri_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.upri_dec_place_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_upri_dec_place);
		p.columnItmSls_prio.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.prio_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_prio);
		p.columnItmSls_alc_val1.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.alc_val1_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_alc_val1);
		p.columnItmSls_alc_val2.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.alc_val2_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_alc_val2);
		p.columnItmSls_alc_val3.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.alc_val3_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_alc_val3);
		p.columnItmSls_alc_val4.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.alc_val4_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_alc_val4);
		p.columnItmSls_alc_val5.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.alc_val5_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_alc_val5);
		p.columnItmSls_rmrks.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.rmrks_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_rmrks);
		p.columnItmSls_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.sub_char1_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_sub_char1);
		p.columnItmSls_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.sub_char2_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_sub_char2);
		p.columnItmSls_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.sub_char3_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_sub_char3);
		p.columnItmSls_non_calc_flg.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.non_calc_flg_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_non_calc_flg);
		p.columnItmSls_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.ins_usr_id_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_ins_usr_id);
		p.columnItmSls_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.ins_usr_nm_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_ins_usr_nm);
		p.columnItmSls_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.ins_func_id_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_ins_func_id);
		p.columnItmSls_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.ins_func_nm_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_ins_func_nm);
		p.columnItmSls_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.ins_ts_META);
		p.columnItmSls_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_ins_ts);
		p.columnItmSls_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.upd_usr_id_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_upd_usr_id);
		p.columnItmSls_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.upd_usr_nm_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_upd_usr_nm);
		p.columnItmSls_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.upd_func_id_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_upd_func_id);
		p.columnItmSls_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.upd_func_nm_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_upd_func_nm);
		p.columnItmSls_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.upd_ts_META);
		p.columnItmSls_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_upd_ts);
		p.columnItmSls_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0540.ItmSlsR.upd_srv_req_no_META);
		p.ItmSlsTable.addColumnConfig(p.columnItmSls_upd_srv_req_no);
	}

	/**
	 * [ItmFix]ブロックのTableの設定
	 */
	protected static void setTableConfigItmFix(MGBDP_BomExSrch p) {
		p.columnItmFix_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.calc_ctg_cd_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_calc_ctg_cd);
		p.columnItmFix_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.calc_ctg_nm_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_calc_ctg_nm);
		p.columnItmFix_wg_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.wg_cd_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_wg_cd);
		p.columnItmFix_wg_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.wg_nm_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_wg_nm);
		p.ItmFixTable.addTable(p.ItmFix_itm_p_PPanel.ItmTable);
		p.columnItmFix_expns_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.expns_cd_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_expns_cd);
		p.columnItmFix_expns_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.expns_nm_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_expns_nm);
		p.ItmFixTable.addTable(p.ItmFix_qty_p_PPanel.QtyTable);
		p.ItmFix_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnItmFix_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.unit_cd_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_unit_cd);
		p.columnItmFix_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.unit_nm_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_unit_nm);
		p.columnItmFix_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.dec_place_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_dec_place);
		p.ItmFixTable.addTable(p.ItmFix_std_upri_p_PPanel.UpriTable);
		p.ItmFix_std_upri_p_PPanel.columnUpri_upri.setMinusEnable(true);
		p.columnItmFix_cur_cd.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.cur_cd_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_cur_cd);
		p.columnItmFix_cur_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.cur_nm_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_cur_nm);
		p.columnItmFix_std_upri_dec_place.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.std_upri_dec_place_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_std_upri_dec_place);
		p.columnItmFix_rmrks.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.rmrks_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_rmrks);
		p.columnItmFix_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.sub_char1_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_sub_char1);
		p.columnItmFix_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.sub_char2_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_sub_char2);
		p.columnItmFix_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.sub_char3_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_sub_char3);
		p.columnItmFix_non_calc_flg.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.non_calc_flg_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_non_calc_flg);
		p.columnItmFix_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.ins_usr_id_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_ins_usr_id);
		p.columnItmFix_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.ins_usr_nm_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_ins_usr_nm);
		p.columnItmFix_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.ins_func_id_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_ins_func_id);
		p.columnItmFix_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.ins_func_nm_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_ins_func_nm);
		p.columnItmFix_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.ins_ts_META);
		p.columnItmFix_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_ins_ts);
		p.columnItmFix_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.upd_usr_id_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_upd_usr_id);
		p.columnItmFix_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.upd_usr_nm_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_upd_usr_nm);
		p.columnItmFix_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.upd_func_id_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_upd_func_id);
		p.columnItmFix_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.upd_func_nm_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_upd_func_nm);
		p.columnItmFix_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.upd_ts_META);
		p.columnItmFix_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_upd_ts);
		p.columnItmFix_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0540.ItmFixR.upd_srv_req_no_META);
		p.ItmFixTable.addColumnConfig(p.columnItmFix_upd_srv_req_no);
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
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bom_ptn.getListConfig().setPutter(getCnd_bom_ptn_ListPutter());
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
	 * [Cnd_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.BomPtn");
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
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_bom_ptn) return getCnd_bom_ptn(row, info);
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
		else if (ap == RPnl_srch_all) doRPnl_srch_all(info);
		else if (ap == Btn_srch_dtl) doBtn_srch_dtl(info);
		else if (ap == Btn_open_MGBDP0540_ex1) doBtn_open_MGBDP0540_ex1(info);
		else if (ap == Btn_open_MGBDP0540_ex2) doBtn_open_MGBDP0540_ex2(info);
		else if (ap == Btn_open_MGBDP0520) doBtn_open_MGBDP0520(info);
		else if (ap == Btn_open_MGBDP0530) doBtn_open_MGBDP0530(info);
		else if (ap == Btn_open_MGBDP0530_chd) doBtn_open_MGBDP0530_chd(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[srch_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_srch_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[srch_dtl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_srch_dtl(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0540_ex1]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0540_ex1(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0540_ex2]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0540_ex2(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0520]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0520(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0530]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0530(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0530_chd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0530_chd(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == BottomTab) return doBottom_VC(info);
		if (vc == ItmTable) return doItm_VC(info);
		if (vc == ItmDtlTable) return doItmDtl_VC(info);
		if (vc == ItmOperTable) return doItmOper_VC(info);
		if (vc == ItmWkTable) return doItmWk_VC(info);
		if (vc == ItmPurcTable) return doItmPurc_VC(info);
		if (vc == ItmProcTable) return doItmProc_VC(info);
		if (vc == ItmProvTable) return doItmProv_VC(info);
		if (vc == ItmSlsTable) return doItmSls_VC(info);
		if (vc == ItmFixTable) return doItmFix_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_itm_is_srch_typ) return doCnd_itm_is_srch_typ_VC(info);
		if (vc == Cnd_bom_ptn) return doCnd_bom_ptn_VC(info);
		if (vc == Cnd_par_itm_flg) return doCnd_par_itm_flg_VC(info);
		if (vc == Cnd_chd_itm_flg) return doCnd_chd_itm_flg_VC(info);
		if (vc == Cnd_bom_ptn_flg) return doCnd_bom_ptn_flg_VC(info);
		if (vc == Cnd_max_hrrchy) return doCnd_max_hrrchy_VC(info);
		if (vc == columnDtl_bottom_flg) return doDtl_bottom_flg_VC(info);
		if (vc == columnDtl_unreg_flg) return doDtl_unreg_flg_VC(info);
		if (vc == columnDtl_itm_typ) return doDtl_itm_typ_VC(info);
		if (vc == columnDtl_itm_typ_nm) return doDtl_itm_typ_nm_VC(info);
		if (vc == columnDtl_itm_typ_d_cd) return doDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_itm_typ_d_nm) return doDtl_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_itm_jnl_cd) return doDtl_itm_jnl_cd_VC(info);
		if (vc == columnDtl_itm_jnl_nm) return doDtl_itm_jnl_nm_VC(info);
		if (vc == columnDtl_bom_ptn) return doDtl_bom_ptn_VC(info);
		if (vc == columnDtl_oper_cd) return doDtl_oper_cd_VC(info);
		if (vc == columnDtl_oper_nm) return doDtl_oper_nm_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_par_unit_cd) return doDtl_par_unit_cd_VC(info);
		if (vc == columnDtl_par_unit_nm) return doDtl_par_unit_nm_VC(info);
		if (vc == columnDtl_par_dec_place) return doDtl_par_dec_place_VC(info);
		if (vc == columnDtl_chd_unit_cd) return doDtl_chd_unit_cd_VC(info);
		if (vc == columnDtl_chd_unit_nm) return doDtl_chd_unit_nm_VC(info);
		if (vc == columnDtl_chd_dec_place) return doDtl_chd_dec_place_VC(info);
		if (vc == columnDtl_alt_grp_cd) return doDtl_alt_grp_cd_VC(info);
		if (vc == columnDtl_alt_itm_ratio) return doDtl_alt_itm_ratio_VC(info);
		if (vc == columnDtl_expns_cd) return doDtl_expns_cd_VC(info);
		if (vc == columnDtl_expns_nm) return doDtl_expns_nm_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_calc_ctg_cd) return doDtl_calc_ctg_cd_VC(info);
		if (vc == columnDtl_calc_ctg_nm) return doDtl_calc_ctg_nm_VC(info);
		if (vc == columnDtl_itm_calc_ctg_cd) return doDtl_itm_calc_ctg_cd_VC(info);
		if (vc == columnDtl_itm_calc_ctg_nm) return doDtl_itm_calc_ctg_nm_VC(info);
		if (vc == columnDtl_dtl_calc_ctg_cd) return doDtl_dtl_calc_ctg_cd_VC(info);
		if (vc == columnDtl_dtl_calc_ctg_nm) return doDtl_dtl_calc_ctg_nm_VC(info);
		if (vc == columnDtl_purc_calc_ctg_cd) return doDtl_purc_calc_ctg_cd_VC(info);
		if (vc == columnDtl_purc_calc_ctg_nm) return doDtl_purc_calc_ctg_nm_VC(info);
		if (vc == columnDtl_proc_calc_ctg_cd) return doDtl_proc_calc_ctg_cd_VC(info);
		if (vc == columnDtl_proc_calc_ctg_nm) return doDtl_proc_calc_ctg_nm_VC(info);
		if (vc == columnDtl_prov_calc_ctg_cd) return doDtl_prov_calc_ctg_cd_VC(info);
		if (vc == columnDtl_prov_calc_ctg_nm) return doDtl_prov_calc_ctg_nm_VC(info);
		if (vc == columnDtl_sls_calc_ctg_cd) return doDtl_sls_calc_ctg_cd_VC(info);
		if (vc == columnDtl_sls_calc_ctg_nm) return doDtl_sls_calc_ctg_nm_VC(info);
		if (vc == columnDtl_fix_calc_ctg_cd) return doDtl_fix_calc_ctg_cd_VC(info);
		if (vc == columnDtl_fix_calc_ctg_nm) return doDtl_fix_calc_ctg_nm_VC(info);
		if (vc == columnItm_calc_ctg_cd) return doItm_calc_ctg_cd_VC(info);
		if (vc == columnItm_calc_ctg_nm) return doItm_calc_ctg_nm_VC(info);
		if (vc == columnItm_wg_cd) return doItm_wg_cd_VC(info);
		if (vc == columnItm_wg_nm) return doItm_wg_nm_VC(info);
		if (vc == columnItm_calc_ptn_cd) return doItm_calc_ptn_cd_VC(info);
		if (vc == columnItm_calc_ptn_nm) return doItm_calc_ptn_nm_VC(info);
		if (vc == columnItm_unit_cd) return doItm_unit_cd_VC(info);
		if (vc == columnItm_unit_nm) return doItm_unit_nm_VC(info);
		if (vc == columnItm_dec_place) return doItm_dec_place_VC(info);
		if (vc == columnItm_rmrks) return doItm_rmrks_VC(info);
		if (vc == columnItm_sub_char1) return doItm_sub_char1_VC(info);
		if (vc == columnItm_sub_char2) return doItm_sub_char2_VC(info);
		if (vc == columnItm_sub_char3) return doItm_sub_char3_VC(info);
		if (vc == columnItm_non_calc_flg) return doItm_non_calc_flg_VC(info);
		if (vc == columnItm_ins_usr_id) return doItm_ins_usr_id_VC(info);
		if (vc == columnItm_ins_usr_nm) return doItm_ins_usr_nm_VC(info);
		if (vc == columnItm_ins_func_id) return doItm_ins_func_id_VC(info);
		if (vc == columnItm_ins_func_nm) return doItm_ins_func_nm_VC(info);
		if (vc == columnItm_ins_ts) return doItm_ins_ts_VC(info);
		if (vc == columnItm_upd_usr_id) return doItm_upd_usr_id_VC(info);
		if (vc == columnItm_upd_usr_nm) return doItm_upd_usr_nm_VC(info);
		if (vc == columnItm_upd_func_id) return doItm_upd_func_id_VC(info);
		if (vc == columnItm_upd_func_nm) return doItm_upd_func_nm_VC(info);
		if (vc == columnItm_upd_ts) return doItm_upd_ts_VC(info);
		if (vc == columnItm_upd_srv_req_no) return doItm_upd_srv_req_no_VC(info);
		if (vc == columnItmDtl_calc_ctg_cd) return doItmDtl_calc_ctg_cd_VC(info);
		if (vc == columnItmDtl_calc_ctg_nm) return doItmDtl_calc_ctg_nm_VC(info);
		if (vc == columnItmDtl_wg_cd) return doItmDtl_wg_cd_VC(info);
		if (vc == columnItmDtl_wg_nm) return doItmDtl_wg_nm_VC(info);
		if (vc == columnItmDtl_loc_cd) return doItmDtl_loc_cd_VC(info);
		if (vc == columnItmDtl_loc_nm) return doItmDtl_loc_nm_VC(info);
		if (vc == columnItmDtl_sppl_cd) return doItmDtl_sppl_cd_VC(info);
		if (vc == columnItmDtl_sppl_nm) return doItmDtl_sppl_nm_VC(info);
		if (vc == columnItmDtl_rqst_wg_cd) return doItmDtl_rqst_wg_cd_VC(info);
		if (vc == columnItmDtl_rqst_wg_nm) return doItmDtl_rqst_wg_nm_VC(info);
		if (vc == columnItmDtl_cost_ratio) return doItmDtl_cost_ratio_VC(info);
		if (vc == columnItmDtl_oper_ptn) return doItmDtl_oper_ptn_VC(info);
		if (vc == columnItmDtl_bom_ptn) return doItmDtl_bom_ptn_VC(info);
		if (vc == columnItmDtl_unit_cd) return doItmDtl_unit_cd_VC(info);
		if (vc == columnItmDtl_unit_nm) return doItmDtl_unit_nm_VC(info);
		if (vc == columnItmDtl_dec_place) return doItmDtl_dec_place_VC(info);
		if (vc == columnItmDtl_alc_dpt_cd) return doItmDtl_alc_dpt_cd_VC(info);
		if (vc == columnItmDtl_alc_dpt_nm) return doItmDtl_alc_dpt_nm_VC(info);
		if (vc == columnItmDtl_exp_dpt_cd) return doItmDtl_exp_dpt_cd_VC(info);
		if (vc == columnItmDtl_exp_dpt_nm) return doItmDtl_exp_dpt_nm_VC(info);
		if (vc == columnItmDtl_exp_prio) return doItmDtl_exp_prio_VC(info);
		if (vc == columnItmDtl_alc_val1) return doItmDtl_alc_val1_VC(info);
		if (vc == columnItmDtl_alc_val2) return doItmDtl_alc_val2_VC(info);
		if (vc == columnItmDtl_alc_val3) return doItmDtl_alc_val3_VC(info);
		if (vc == columnItmDtl_alc_val4) return doItmDtl_alc_val4_VC(info);
		if (vc == columnItmDtl_alc_val5) return doItmDtl_alc_val5_VC(info);
		if (vc == columnItmDtl_rmrks) return doItmDtl_rmrks_VC(info);
		if (vc == columnItmDtl_sub_char1) return doItmDtl_sub_char1_VC(info);
		if (vc == columnItmDtl_sub_char2) return doItmDtl_sub_char2_VC(info);
		if (vc == columnItmDtl_sub_char3) return doItmDtl_sub_char3_VC(info);
		if (vc == columnItmDtl_non_calc_flg) return doItmDtl_non_calc_flg_VC(info);
		if (vc == columnItmDtl_ins_usr_id) return doItmDtl_ins_usr_id_VC(info);
		if (vc == columnItmDtl_ins_usr_nm) return doItmDtl_ins_usr_nm_VC(info);
		if (vc == columnItmDtl_ins_func_id) return doItmDtl_ins_func_id_VC(info);
		if (vc == columnItmDtl_ins_func_nm) return doItmDtl_ins_func_nm_VC(info);
		if (vc == columnItmDtl_ins_ts) return doItmDtl_ins_ts_VC(info);
		if (vc == columnItmDtl_upd_usr_id) return doItmDtl_upd_usr_id_VC(info);
		if (vc == columnItmDtl_upd_usr_nm) return doItmDtl_upd_usr_nm_VC(info);
		if (vc == columnItmDtl_upd_func_id) return doItmDtl_upd_func_id_VC(info);
		if (vc == columnItmDtl_upd_func_nm) return doItmDtl_upd_func_nm_VC(info);
		if (vc == columnItmDtl_upd_ts) return doItmDtl_upd_ts_VC(info);
		if (vc == columnItmDtl_upd_srv_req_no) return doItmDtl_upd_srv_req_no_VC(info);
		if (vc == columnItmOper_calc_ctg_cd) return doItmOper_calc_ctg_cd_VC(info);
		if (vc == columnItmOper_calc_ctg_nm) return doItmOper_calc_ctg_nm_VC(info);
		if (vc == columnItmOper_wg_cd) return doItmOper_wg_cd_VC(info);
		if (vc == columnItmOper_wg_nm) return doItmOper_wg_nm_VC(info);
		if (vc == columnItmOper_loc_cd) return doItmOper_loc_cd_VC(info);
		if (vc == columnItmOper_loc_nm) return doItmOper_loc_nm_VC(info);
		if (vc == columnItmOper_oper_ptn) return doItmOper_oper_ptn_VC(info);
		if (vc == columnItmOper_oper_cd) return doItmOper_oper_cd_VC(info);
		if (vc == columnItmOper_oper_nm) return doItmOper_oper_nm_VC(info);
		if (vc == columnItmOper_oper_seq) return doItmOper_oper_seq_VC(info);
		if (vc == columnItmOper_disp_seq) return doItmOper_disp_seq_VC(info);
		if (vc == columnItmOper_yield_oper_flg) return doItmOper_yield_oper_flg_VC(info);
		if (vc == columnItmOper_nmr_qty) return doItmOper_nmr_qty_VC(info);
		if (vc == columnItmOper_dnm_qty) return doItmOper_dnm_qty_VC(info);
		if (vc == columnItmOper_unit_cd) return doItmOper_unit_cd_VC(info);
		if (vc == columnItmOper_unit_nm) return doItmOper_unit_nm_VC(info);
		if (vc == columnItmOper_oper_unit_cd) return doItmOper_oper_unit_cd_VC(info);
		if (vc == columnItmOper_oper_unit_nm) return doItmOper_oper_unit_nm_VC(info);
		if (vc == columnItmOper_oper_std_qty) return doItmOper_oper_std_qty_VC(info);
		if (vc == columnItmOper_oper_conv_qty) return doItmOper_oper_conv_qty_VC(info);
		if (vc == columnItmOper_dec_place) return doItmOper_dec_place_VC(info);
		if (vc == columnItmOper_unit_conv_rnd_typ) return doItmOper_unit_conv_rnd_typ_VC(info);
		if (vc == columnItmOper_unit_conv_rnd_typ_nm) return doItmOper_unit_conv_rnd_typ_nm_VC(info);
		if (vc == columnItmOper_rmrks) return doItmOper_rmrks_VC(info);
		if (vc == columnItmOper_sub_char1) return doItmOper_sub_char1_VC(info);
		if (vc == columnItmOper_sub_char2) return doItmOper_sub_char2_VC(info);
		if (vc == columnItmOper_sub_char3) return doItmOper_sub_char3_VC(info);
		if (vc == columnItmOper_non_calc_flg) return doItmOper_non_calc_flg_VC(info);
		if (vc == columnItmOper_ins_usr_id) return doItmOper_ins_usr_id_VC(info);
		if (vc == columnItmOper_ins_usr_nm) return doItmOper_ins_usr_nm_VC(info);
		if (vc == columnItmOper_ins_func_id) return doItmOper_ins_func_id_VC(info);
		if (vc == columnItmOper_ins_func_nm) return doItmOper_ins_func_nm_VC(info);
		if (vc == columnItmOper_ins_ts) return doItmOper_ins_ts_VC(info);
		if (vc == columnItmOper_upd_usr_id) return doItmOper_upd_usr_id_VC(info);
		if (vc == columnItmOper_upd_usr_nm) return doItmOper_upd_usr_nm_VC(info);
		if (vc == columnItmOper_upd_func_id) return doItmOper_upd_func_id_VC(info);
		if (vc == columnItmOper_upd_func_nm) return doItmOper_upd_func_nm_VC(info);
		if (vc == columnItmOper_upd_ts) return doItmOper_upd_ts_VC(info);
		if (vc == columnItmOper_upd_srv_req_no) return doItmOper_upd_srv_req_no_VC(info);
		if (vc == columnItmWk_calc_ctg_cd) return doItmWk_calc_ctg_cd_VC(info);
		if (vc == columnItmWk_calc_ctg_nm) return doItmWk_calc_ctg_nm_VC(info);
		if (vc == columnItmWk_wg_cd) return doItmWk_wg_cd_VC(info);
		if (vc == columnItmWk_wg_nm) return doItmWk_wg_nm_VC(info);
		if (vc == columnItmWk_loc_cd) return doItmWk_loc_cd_VC(info);
		if (vc == columnItmWk_loc_nm) return doItmWk_loc_nm_VC(info);
		if (vc == columnItmWk_oper_ptn) return doItmWk_oper_ptn_VC(info);
		if (vc == columnItmWk_oper_cd) return doItmWk_oper_cd_VC(info);
		if (vc == columnItmWk_oper_nm) return doItmWk_oper_nm_VC(info);
		if (vc == columnItmWk_oper_seq) return doItmWk_oper_seq_VC(info);
		if (vc == columnItmWk_wk_cost_cd) return doItmWk_wk_cost_cd_VC(info);
		if (vc == columnItmWk_wk_cost_nm) return doItmWk_wk_cost_nm_VC(info);
		if (vc == columnItmWk_unit_cd) return doItmWk_unit_cd_VC(info);
		if (vc == columnItmWk_unit_nm) return doItmWk_unit_nm_VC(info);
		if (vc == columnItmWk_dec_place) return doItmWk_dec_place_VC(info);
		if (vc == columnItmWk_wk_cost_unit_nm) return doItmWk_wk_cost_unit_nm_VC(info);
		if (vc == columnItmWk_wk_cost_dec_place) return doItmWk_wk_cost_dec_place_VC(info);
		if (vc == columnItmWk_rmrks) return doItmWk_rmrks_VC(info);
		if (vc == columnItmWk_sub_char1) return doItmWk_sub_char1_VC(info);
		if (vc == columnItmWk_sub_char2) return doItmWk_sub_char2_VC(info);
		if (vc == columnItmWk_sub_char3) return doItmWk_sub_char3_VC(info);
		if (vc == columnItmWk_non_calc_flg) return doItmWk_non_calc_flg_VC(info);
		if (vc == columnItmWk_ins_usr_id) return doItmWk_ins_usr_id_VC(info);
		if (vc == columnItmWk_ins_usr_nm) return doItmWk_ins_usr_nm_VC(info);
		if (vc == columnItmWk_ins_func_id) return doItmWk_ins_func_id_VC(info);
		if (vc == columnItmWk_ins_func_nm) return doItmWk_ins_func_nm_VC(info);
		if (vc == columnItmWk_ins_ts) return doItmWk_ins_ts_VC(info);
		if (vc == columnItmWk_upd_usr_id) return doItmWk_upd_usr_id_VC(info);
		if (vc == columnItmWk_upd_usr_nm) return doItmWk_upd_usr_nm_VC(info);
		if (vc == columnItmWk_upd_func_id) return doItmWk_upd_func_id_VC(info);
		if (vc == columnItmWk_upd_func_nm) return doItmWk_upd_func_nm_VC(info);
		if (vc == columnItmWk_upd_ts) return doItmWk_upd_ts_VC(info);
		if (vc == columnItmWk_upd_srv_req_no) return doItmWk_upd_srv_req_no_VC(info);
		if (vc == columnItmPurc_calc_ctg_cd) return doItmPurc_calc_ctg_cd_VC(info);
		if (vc == columnItmPurc_calc_ctg_nm) return doItmPurc_calc_ctg_nm_VC(info);
		if (vc == columnItmPurc_wg_cd) return doItmPurc_wg_cd_VC(info);
		if (vc == columnItmPurc_wg_nm) return doItmPurc_wg_nm_VC(info);
		if (vc == columnItmPurc_sppl_cd) return doItmPurc_sppl_cd_VC(info);
		if (vc == columnItmPurc_sppl_nm) return doItmPurc_sppl_nm_VC(info);
		if (vc == columnItmPurc_unit_cd) return doItmPurc_unit_cd_VC(info);
		if (vc == columnItmPurc_unit_nm) return doItmPurc_unit_nm_VC(info);
		if (vc == columnItmPurc_dec_place) return doItmPurc_dec_place_VC(info);
		if (vc == columnItmPurc_cur_cd) return doItmPurc_cur_cd_VC(info);
		if (vc == columnItmPurc_cur_nm) return doItmPurc_cur_nm_VC(info);
		if (vc == columnItmPurc_upri_dec_place) return doItmPurc_upri_dec_place_VC(info);
		if (vc == columnItmPurc_cost_ratio) return doItmPurc_cost_ratio_VC(info);
		if (vc == columnItmPurc_rmrks) return doItmPurc_rmrks_VC(info);
		if (vc == columnItmPurc_sub_char1) return doItmPurc_sub_char1_VC(info);
		if (vc == columnItmPurc_sub_char2) return doItmPurc_sub_char2_VC(info);
		if (vc == columnItmPurc_sub_char3) return doItmPurc_sub_char3_VC(info);
		if (vc == columnItmPurc_non_calc_flg) return doItmPurc_non_calc_flg_VC(info);
		if (vc == columnItmPurc_ins_usr_id) return doItmPurc_ins_usr_id_VC(info);
		if (vc == columnItmPurc_ins_usr_nm) return doItmPurc_ins_usr_nm_VC(info);
		if (vc == columnItmPurc_ins_func_id) return doItmPurc_ins_func_id_VC(info);
		if (vc == columnItmPurc_ins_func_nm) return doItmPurc_ins_func_nm_VC(info);
		if (vc == columnItmPurc_ins_ts) return doItmPurc_ins_ts_VC(info);
		if (vc == columnItmPurc_upd_usr_id) return doItmPurc_upd_usr_id_VC(info);
		if (vc == columnItmPurc_upd_usr_nm) return doItmPurc_upd_usr_nm_VC(info);
		if (vc == columnItmPurc_upd_func_id) return doItmPurc_upd_func_id_VC(info);
		if (vc == columnItmPurc_upd_func_nm) return doItmPurc_upd_func_nm_VC(info);
		if (vc == columnItmPurc_upd_ts) return doItmPurc_upd_ts_VC(info);
		if (vc == columnItmPurc_upd_srv_req_no) return doItmPurc_upd_srv_req_no_VC(info);
		if (vc == columnItmProc_calc_ctg_cd) return doItmProc_calc_ctg_cd_VC(info);
		if (vc == columnItmProc_calc_ctg_nm) return doItmProc_calc_ctg_nm_VC(info);
		if (vc == columnItmProc_wg_cd) return doItmProc_wg_cd_VC(info);
		if (vc == columnItmProc_wg_nm) return doItmProc_wg_nm_VC(info);
		if (vc == columnItmProc_sppl_cd) return doItmProc_sppl_cd_VC(info);
		if (vc == columnItmProc_sppl_nm) return doItmProc_sppl_nm_VC(info);
		if (vc == columnItmProc_unit_cd) return doItmProc_unit_cd_VC(info);
		if (vc == columnItmProc_unit_nm) return doItmProc_unit_nm_VC(info);
		if (vc == columnItmProc_dec_place) return doItmProc_dec_place_VC(info);
		if (vc == columnItmProc_cur_cd) return doItmProc_cur_cd_VC(info);
		if (vc == columnItmProc_cur_nm) return doItmProc_cur_nm_VC(info);
		if (vc == columnItmProc_upri_dec_place) return doItmProc_upri_dec_place_VC(info);
		if (vc == columnItmProc_cost_ratio) return doItmProc_cost_ratio_VC(info);
		if (vc == columnItmProc_rmrks) return doItmProc_rmrks_VC(info);
		if (vc == columnItmProc_sub_char1) return doItmProc_sub_char1_VC(info);
		if (vc == columnItmProc_sub_char2) return doItmProc_sub_char2_VC(info);
		if (vc == columnItmProc_sub_char3) return doItmProc_sub_char3_VC(info);
		if (vc == columnItmProc_non_calc_flg) return doItmProc_non_calc_flg_VC(info);
		if (vc == columnItmProc_ins_usr_id) return doItmProc_ins_usr_id_VC(info);
		if (vc == columnItmProc_ins_usr_nm) return doItmProc_ins_usr_nm_VC(info);
		if (vc == columnItmProc_ins_func_id) return doItmProc_ins_func_id_VC(info);
		if (vc == columnItmProc_ins_func_nm) return doItmProc_ins_func_nm_VC(info);
		if (vc == columnItmProc_ins_ts) return doItmProc_ins_ts_VC(info);
		if (vc == columnItmProc_upd_usr_id) return doItmProc_upd_usr_id_VC(info);
		if (vc == columnItmProc_upd_usr_nm) return doItmProc_upd_usr_nm_VC(info);
		if (vc == columnItmProc_upd_func_id) return doItmProc_upd_func_id_VC(info);
		if (vc == columnItmProc_upd_func_nm) return doItmProc_upd_func_nm_VC(info);
		if (vc == columnItmProc_upd_ts) return doItmProc_upd_ts_VC(info);
		if (vc == columnItmProc_upd_srv_req_no) return doItmProc_upd_srv_req_no_VC(info);
		if (vc == columnItmProv_calc_ctg_cd) return doItmProv_calc_ctg_cd_VC(info);
		if (vc == columnItmProv_calc_ctg_nm) return doItmProv_calc_ctg_nm_VC(info);
		if (vc == columnItmProv_wg_cd) return doItmProv_wg_cd_VC(info);
		if (vc == columnItmProv_wg_nm) return doItmProv_wg_nm_VC(info);
		if (vc == columnItmProv_prsppl_cd) return doItmProv_prsppl_cd_VC(info);
		if (vc == columnItmProv_prsppl_nm) return doItmProv_prsppl_nm_VC(info);
		if (vc == columnItmProv_prov_typ) return doItmProv_prov_typ_VC(info);
		if (vc == columnItmProv_prov_typ_nm) return doItmProv_prov_typ_nm_VC(info);
		if (vc == columnItmProv_unit_cd) return doItmProv_unit_cd_VC(info);
		if (vc == columnItmProv_unit_nm) return doItmProv_unit_nm_VC(info);
		if (vc == columnItmProv_dec_place) return doItmProv_dec_place_VC(info);
		if (vc == columnItmProv_cur_cd) return doItmProv_cur_cd_VC(info);
		if (vc == columnItmProv_cur_nm) return doItmProv_cur_nm_VC(info);
		if (vc == columnItmProv_upri_dec_place) return doItmProv_upri_dec_place_VC(info);
		if (vc == columnItmProv_rmrks) return doItmProv_rmrks_VC(info);
		if (vc == columnItmProv_sub_char1) return doItmProv_sub_char1_VC(info);
		if (vc == columnItmProv_sub_char2) return doItmProv_sub_char2_VC(info);
		if (vc == columnItmProv_sub_char3) return doItmProv_sub_char3_VC(info);
		if (vc == columnItmProv_non_calc_flg) return doItmProv_non_calc_flg_VC(info);
		if (vc == columnItmProv_ins_usr_id) return doItmProv_ins_usr_id_VC(info);
		if (vc == columnItmProv_ins_usr_nm) return doItmProv_ins_usr_nm_VC(info);
		if (vc == columnItmProv_ins_func_id) return doItmProv_ins_func_id_VC(info);
		if (vc == columnItmProv_ins_func_nm) return doItmProv_ins_func_nm_VC(info);
		if (vc == columnItmProv_ins_ts) return doItmProv_ins_ts_VC(info);
		if (vc == columnItmProv_upd_usr_id) return doItmProv_upd_usr_id_VC(info);
		if (vc == columnItmProv_upd_usr_nm) return doItmProv_upd_usr_nm_VC(info);
		if (vc == columnItmProv_upd_func_id) return doItmProv_upd_func_id_VC(info);
		if (vc == columnItmProv_upd_func_nm) return doItmProv_upd_func_nm_VC(info);
		if (vc == columnItmProv_upd_ts) return doItmProv_upd_ts_VC(info);
		if (vc == columnItmProv_upd_srv_req_no) return doItmProv_upd_srv_req_no_VC(info);
		if (vc == columnItmSls_calc_ctg_cd) return doItmSls_calc_ctg_cd_VC(info);
		if (vc == columnItmSls_calc_ctg_nm) return doItmSls_calc_ctg_nm_VC(info);
		if (vc == columnItmSls_wg_cd) return doItmSls_wg_cd_VC(info);
		if (vc == columnItmSls_wg_nm) return doItmSls_wg_nm_VC(info);
		if (vc == columnItmSls_dpt_cd) return doItmSls_dpt_cd_VC(info);
		if (vc == columnItmSls_dpt_nm) return doItmSls_dpt_nm_VC(info);
		if (vc == columnItmSls_cst_cd) return doItmSls_cst_cd_VC(info);
		if (vc == columnItmSls_cst_nm) return doItmSls_cst_nm_VC(info);
		if (vc == columnItmSls_dlv_cd) return doItmSls_dlv_cd_VC(info);
		if (vc == columnItmSls_dlv_nm) return doItmSls_dlv_nm_VC(info);
		if (vc == columnItmSls_dest_cd1) return doItmSls_dest_cd1_VC(info);
		if (vc == columnItmSls_dest_nm1) return doItmSls_dest_nm1_VC(info);
		if (vc == columnItmSls_dest_cd2) return doItmSls_dest_cd2_VC(info);
		if (vc == columnItmSls_dest_nm2) return doItmSls_dest_nm2_VC(info);
		if (vc == columnItmSls_dest_cd3) return doItmSls_dest_cd3_VC(info);
		if (vc == columnItmSls_dest_nm3) return doItmSls_dest_nm3_VC(info);
		if (vc == columnItmSls_unit_cd) return doItmSls_unit_cd_VC(info);
		if (vc == columnItmSls_unit_nm) return doItmSls_unit_nm_VC(info);
		if (vc == columnItmSls_dec_place) return doItmSls_dec_place_VC(info);
		if (vc == columnItmSls_cur_cd) return doItmSls_cur_cd_VC(info);
		if (vc == columnItmSls_cur_nm) return doItmSls_cur_nm_VC(info);
		if (vc == columnItmSls_upri_dec_place) return doItmSls_upri_dec_place_VC(info);
		if (vc == columnItmSls_prio) return doItmSls_prio_VC(info);
		if (vc == columnItmSls_alc_val1) return doItmSls_alc_val1_VC(info);
		if (vc == columnItmSls_alc_val2) return doItmSls_alc_val2_VC(info);
		if (vc == columnItmSls_alc_val3) return doItmSls_alc_val3_VC(info);
		if (vc == columnItmSls_alc_val4) return doItmSls_alc_val4_VC(info);
		if (vc == columnItmSls_alc_val5) return doItmSls_alc_val5_VC(info);
		if (vc == columnItmSls_rmrks) return doItmSls_rmrks_VC(info);
		if (vc == columnItmSls_sub_char1) return doItmSls_sub_char1_VC(info);
		if (vc == columnItmSls_sub_char2) return doItmSls_sub_char2_VC(info);
		if (vc == columnItmSls_sub_char3) return doItmSls_sub_char3_VC(info);
		if (vc == columnItmSls_non_calc_flg) return doItmSls_non_calc_flg_VC(info);
		if (vc == columnItmSls_ins_usr_id) return doItmSls_ins_usr_id_VC(info);
		if (vc == columnItmSls_ins_usr_nm) return doItmSls_ins_usr_nm_VC(info);
		if (vc == columnItmSls_ins_func_id) return doItmSls_ins_func_id_VC(info);
		if (vc == columnItmSls_ins_func_nm) return doItmSls_ins_func_nm_VC(info);
		if (vc == columnItmSls_ins_ts) return doItmSls_ins_ts_VC(info);
		if (vc == columnItmSls_upd_usr_id) return doItmSls_upd_usr_id_VC(info);
		if (vc == columnItmSls_upd_usr_nm) return doItmSls_upd_usr_nm_VC(info);
		if (vc == columnItmSls_upd_func_id) return doItmSls_upd_func_id_VC(info);
		if (vc == columnItmSls_upd_func_nm) return doItmSls_upd_func_nm_VC(info);
		if (vc == columnItmSls_upd_ts) return doItmSls_upd_ts_VC(info);
		if (vc == columnItmSls_upd_srv_req_no) return doItmSls_upd_srv_req_no_VC(info);
		if (vc == columnItmFix_calc_ctg_cd) return doItmFix_calc_ctg_cd_VC(info);
		if (vc == columnItmFix_calc_ctg_nm) return doItmFix_calc_ctg_nm_VC(info);
		if (vc == columnItmFix_wg_cd) return doItmFix_wg_cd_VC(info);
		if (vc == columnItmFix_wg_nm) return doItmFix_wg_nm_VC(info);
		if (vc == columnItmFix_expns_cd) return doItmFix_expns_cd_VC(info);
		if (vc == columnItmFix_expns_nm) return doItmFix_expns_nm_VC(info);
		if (vc == columnItmFix_unit_cd) return doItmFix_unit_cd_VC(info);
		if (vc == columnItmFix_unit_nm) return doItmFix_unit_nm_VC(info);
		if (vc == columnItmFix_dec_place) return doItmFix_dec_place_VC(info);
		if (vc == columnItmFix_cur_cd) return doItmFix_cur_cd_VC(info);
		if (vc == columnItmFix_cur_nm) return doItmFix_cur_nm_VC(info);
		if (vc == columnItmFix_std_upri_dec_place) return doItmFix_std_upri_dec_place_VC(info);
		if (vc == columnItmFix_rmrks) return doItmFix_rmrks_VC(info);
		if (vc == columnItmFix_sub_char1) return doItmFix_sub_char1_VC(info);
		if (vc == columnItmFix_sub_char2) return doItmFix_sub_char2_VC(info);
		if (vc == columnItmFix_sub_char3) return doItmFix_sub_char3_VC(info);
		if (vc == columnItmFix_non_calc_flg) return doItmFix_non_calc_flg_VC(info);
		if (vc == columnItmFix_ins_usr_id) return doItmFix_ins_usr_id_VC(info);
		if (vc == columnItmFix_ins_usr_nm) return doItmFix_ins_usr_nm_VC(info);
		if (vc == columnItmFix_ins_func_id) return doItmFix_ins_func_id_VC(info);
		if (vc == columnItmFix_ins_func_nm) return doItmFix_ins_func_nm_VC(info);
		if (vc == columnItmFix_ins_ts) return doItmFix_ins_ts_VC(info);
		if (vc == columnItmFix_upd_usr_id) return doItmFix_upd_usr_id_VC(info);
		if (vc == columnItmFix_upd_usr_nm) return doItmFix_upd_usr_nm_VC(info);
		if (vc == columnItmFix_upd_func_id) return doItmFix_upd_func_id_VC(info);
		if (vc == columnItmFix_upd_func_nm) return doItmFix_upd_func_nm_VC(info);
		if (vc == columnItmFix_upd_ts) return doItmFix_upd_ts_VC(info);
		if (vc == columnItmFix_upd_srv_req_no) return doItmFix_upd_srv_req_no_VC(info);
		return true;
	}

	/**
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Bottom]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBottom_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_is_srch_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_is_srch_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bom_ptn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bom_ptn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[max_hrrchy]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_max_hrrchy_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bottom_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bottom_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unreg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unreg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_itm_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_itm_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dtl_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dtl_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dtl_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dtl_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[proc_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_proc_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[proc_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_proc_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[calc_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_calc_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[calc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_calc_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[non_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_non_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Itm]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItm_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[cost_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_cost_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[oper_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_oper_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[alc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_alc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[alc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_alc_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[exp_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_exp_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[exp_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_exp_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[exp_prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_exp_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[alc_val1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_alc_val1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[alc_val2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_alc_val2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[alc_val3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_alc_val3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[alc_val4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_alc_val4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[alc_val5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_alc_val5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[non_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_non_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[oper_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_oper_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_oper_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[yield_oper_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_yield_oper_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[nmr_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_nmr_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[dnm_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_dnm_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[oper_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_oper_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[oper_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_oper_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[oper_std_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_oper_std_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[oper_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_oper_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[unit_conv_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_unit_conv_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[unit_conv_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_unit_conv_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[non_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_non_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmOper]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmOper_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[oper_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_oper_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_oper_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[wk_cost_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_wk_cost_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[wk_cost_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_wk_cost_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[wk_cost_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_wk_cost_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[wk_cost_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_wk_cost_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[non_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_non_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmWk]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmWk_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[cost_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_cost_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[non_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_non_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmPurc]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmPurc_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[cost_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_cost_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[non_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_non_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProc]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProc_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[prsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_prsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[prsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_prsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[prov_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_prov_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[prov_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_prov_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[non_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_non_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmProv]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmProv_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[alc_val1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_alc_val1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[alc_val2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_alc_val2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[alc_val3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_alc_val3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[alc_val4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_alc_val4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[alc_val5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_alc_val5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[non_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_non_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmSls]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmSls_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[std_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_std_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[non_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_non_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmFix]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmFix_upd_srv_req_no_VC(MCEventInfo info){
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
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == BottomTab) doBottom_NC(info);
		else if (nc == ItmTable) doItm_NC(info);
		else if (nc == ItmDtlTable) doItmDtl_NC(info);
		else if (nc == ItmOperTable) doItmOper_NC(info);
		else if (nc == ItmWkTable) doItmWk_NC(info);
		else if (nc == ItmPurcTable) doItmPurc_NC(info);
		else if (nc == ItmProcTable) doItmProc_NC(info);
		else if (nc == ItmProvTable) doItmProv_NC(info);
		else if (nc == ItmSlsTable) doItmSls_NC(info);
		else if (nc == ItmFixTable) doItmFix_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_itm_is_srch_typ) doCnd_itm_is_srch_typ_NC(info);
		else if (nc == Cnd_bom_ptn) doCnd_bom_ptn_NC(info);
		else if (nc == Cnd_par_itm_flg) doCnd_par_itm_flg_NC(info);
		else if (nc == Cnd_chd_itm_flg) doCnd_chd_itm_flg_NC(info);
		else if (nc == Cnd_bom_ptn_flg) doCnd_bom_ptn_flg_NC(info);
		else if (nc == Cnd_max_hrrchy) doCnd_max_hrrchy_NC(info);
		else if (nc == columnDtl_bottom_flg) doDtl_bottom_flg_NC(info);
		else if (nc == columnDtl_unreg_flg) doDtl_unreg_flg_NC(info);
		else if (nc == columnDtl_itm_typ) doDtl_itm_typ_NC(info);
		else if (nc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NC(info);
		else if (nc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NC(info);
		else if (nc == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NC(info);
		else if (nc == columnDtl_bom_ptn) doDtl_bom_ptn_NC(info);
		else if (nc == columnDtl_oper_cd) doDtl_oper_cd_NC(info);
		else if (nc == columnDtl_oper_nm) doDtl_oper_nm_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_par_unit_cd) doDtl_par_unit_cd_NC(info);
		else if (nc == columnDtl_par_unit_nm) doDtl_par_unit_nm_NC(info);
		else if (nc == columnDtl_par_dec_place) doDtl_par_dec_place_NC(info);
		else if (nc == columnDtl_chd_unit_cd) doDtl_chd_unit_cd_NC(info);
		else if (nc == columnDtl_chd_unit_nm) doDtl_chd_unit_nm_NC(info);
		else if (nc == columnDtl_chd_dec_place) doDtl_chd_dec_place_NC(info);
		else if (nc == columnDtl_alt_grp_cd) doDtl_alt_grp_cd_NC(info);
		else if (nc == columnDtl_alt_itm_ratio) doDtl_alt_itm_ratio_NC(info);
		else if (nc == columnDtl_expns_cd) doDtl_expns_cd_NC(info);
		else if (nc == columnDtl_expns_nm) doDtl_expns_nm_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_calc_ctg_cd) doDtl_calc_ctg_cd_NC(info);
		else if (nc == columnDtl_calc_ctg_nm) doDtl_calc_ctg_nm_NC(info);
		else if (nc == columnDtl_itm_calc_ctg_cd) doDtl_itm_calc_ctg_cd_NC(info);
		else if (nc == columnDtl_itm_calc_ctg_nm) doDtl_itm_calc_ctg_nm_NC(info);
		else if (nc == columnDtl_dtl_calc_ctg_cd) doDtl_dtl_calc_ctg_cd_NC(info);
		else if (nc == columnDtl_dtl_calc_ctg_nm) doDtl_dtl_calc_ctg_nm_NC(info);
		else if (nc == columnDtl_purc_calc_ctg_cd) doDtl_purc_calc_ctg_cd_NC(info);
		else if (nc == columnDtl_purc_calc_ctg_nm) doDtl_purc_calc_ctg_nm_NC(info);
		else if (nc == columnDtl_proc_calc_ctg_cd) doDtl_proc_calc_ctg_cd_NC(info);
		else if (nc == columnDtl_proc_calc_ctg_nm) doDtl_proc_calc_ctg_nm_NC(info);
		else if (nc == columnDtl_prov_calc_ctg_cd) doDtl_prov_calc_ctg_cd_NC(info);
		else if (nc == columnDtl_prov_calc_ctg_nm) doDtl_prov_calc_ctg_nm_NC(info);
		else if (nc == columnDtl_sls_calc_ctg_cd) doDtl_sls_calc_ctg_cd_NC(info);
		else if (nc == columnDtl_sls_calc_ctg_nm) doDtl_sls_calc_ctg_nm_NC(info);
		else if (nc == columnDtl_fix_calc_ctg_cd) doDtl_fix_calc_ctg_cd_NC(info);
		else if (nc == columnDtl_fix_calc_ctg_nm) doDtl_fix_calc_ctg_nm_NC(info);
		else if (nc == columnItm_calc_ctg_cd) doItm_calc_ctg_cd_NC(info);
		else if (nc == columnItm_calc_ctg_nm) doItm_calc_ctg_nm_NC(info);
		else if (nc == columnItm_wg_cd) doItm_wg_cd_NC(info);
		else if (nc == columnItm_wg_nm) doItm_wg_nm_NC(info);
		else if (nc == columnItm_calc_ptn_cd) doItm_calc_ptn_cd_NC(info);
		else if (nc == columnItm_calc_ptn_nm) doItm_calc_ptn_nm_NC(info);
		else if (nc == columnItm_unit_cd) doItm_unit_cd_NC(info);
		else if (nc == columnItm_unit_nm) doItm_unit_nm_NC(info);
		else if (nc == columnItm_dec_place) doItm_dec_place_NC(info);
		else if (nc == columnItm_rmrks) doItm_rmrks_NC(info);
		else if (nc == columnItm_sub_char1) doItm_sub_char1_NC(info);
		else if (nc == columnItm_sub_char2) doItm_sub_char2_NC(info);
		else if (nc == columnItm_sub_char3) doItm_sub_char3_NC(info);
		else if (nc == columnItm_non_calc_flg) doItm_non_calc_flg_NC(info);
		else if (nc == columnItm_ins_usr_id) doItm_ins_usr_id_NC(info);
		else if (nc == columnItm_ins_usr_nm) doItm_ins_usr_nm_NC(info);
		else if (nc == columnItm_ins_func_id) doItm_ins_func_id_NC(info);
		else if (nc == columnItm_ins_func_nm) doItm_ins_func_nm_NC(info);
		else if (nc == columnItm_ins_ts) doItm_ins_ts_NC(info);
		else if (nc == columnItm_upd_usr_id) doItm_upd_usr_id_NC(info);
		else if (nc == columnItm_upd_usr_nm) doItm_upd_usr_nm_NC(info);
		else if (nc == columnItm_upd_func_id) doItm_upd_func_id_NC(info);
		else if (nc == columnItm_upd_func_nm) doItm_upd_func_nm_NC(info);
		else if (nc == columnItm_upd_ts) doItm_upd_ts_NC(info);
		else if (nc == columnItm_upd_srv_req_no) doItm_upd_srv_req_no_NC(info);
		else if (nc == columnItmDtl_calc_ctg_cd) doItmDtl_calc_ctg_cd_NC(info);
		else if (nc == columnItmDtl_calc_ctg_nm) doItmDtl_calc_ctg_nm_NC(info);
		else if (nc == columnItmDtl_wg_cd) doItmDtl_wg_cd_NC(info);
		else if (nc == columnItmDtl_wg_nm) doItmDtl_wg_nm_NC(info);
		else if (nc == columnItmDtl_loc_cd) doItmDtl_loc_cd_NC(info);
		else if (nc == columnItmDtl_loc_nm) doItmDtl_loc_nm_NC(info);
		else if (nc == columnItmDtl_sppl_cd) doItmDtl_sppl_cd_NC(info);
		else if (nc == columnItmDtl_sppl_nm) doItmDtl_sppl_nm_NC(info);
		else if (nc == columnItmDtl_rqst_wg_cd) doItmDtl_rqst_wg_cd_NC(info);
		else if (nc == columnItmDtl_rqst_wg_nm) doItmDtl_rqst_wg_nm_NC(info);
		else if (nc == columnItmDtl_cost_ratio) doItmDtl_cost_ratio_NC(info);
		else if (nc == columnItmDtl_oper_ptn) doItmDtl_oper_ptn_NC(info);
		else if (nc == columnItmDtl_bom_ptn) doItmDtl_bom_ptn_NC(info);
		else if (nc == columnItmDtl_unit_cd) doItmDtl_unit_cd_NC(info);
		else if (nc == columnItmDtl_unit_nm) doItmDtl_unit_nm_NC(info);
		else if (nc == columnItmDtl_dec_place) doItmDtl_dec_place_NC(info);
		else if (nc == columnItmDtl_alc_dpt_cd) doItmDtl_alc_dpt_cd_NC(info);
		else if (nc == columnItmDtl_alc_dpt_nm) doItmDtl_alc_dpt_nm_NC(info);
		else if (nc == columnItmDtl_exp_dpt_cd) doItmDtl_exp_dpt_cd_NC(info);
		else if (nc == columnItmDtl_exp_dpt_nm) doItmDtl_exp_dpt_nm_NC(info);
		else if (nc == columnItmDtl_exp_prio) doItmDtl_exp_prio_NC(info);
		else if (nc == columnItmDtl_alc_val1) doItmDtl_alc_val1_NC(info);
		else if (nc == columnItmDtl_alc_val2) doItmDtl_alc_val2_NC(info);
		else if (nc == columnItmDtl_alc_val3) doItmDtl_alc_val3_NC(info);
		else if (nc == columnItmDtl_alc_val4) doItmDtl_alc_val4_NC(info);
		else if (nc == columnItmDtl_alc_val5) doItmDtl_alc_val5_NC(info);
		else if (nc == columnItmDtl_rmrks) doItmDtl_rmrks_NC(info);
		else if (nc == columnItmDtl_sub_char1) doItmDtl_sub_char1_NC(info);
		else if (nc == columnItmDtl_sub_char2) doItmDtl_sub_char2_NC(info);
		else if (nc == columnItmDtl_sub_char3) doItmDtl_sub_char3_NC(info);
		else if (nc == columnItmDtl_non_calc_flg) doItmDtl_non_calc_flg_NC(info);
		else if (nc == columnItmDtl_ins_usr_id) doItmDtl_ins_usr_id_NC(info);
		else if (nc == columnItmDtl_ins_usr_nm) doItmDtl_ins_usr_nm_NC(info);
		else if (nc == columnItmDtl_ins_func_id) doItmDtl_ins_func_id_NC(info);
		else if (nc == columnItmDtl_ins_func_nm) doItmDtl_ins_func_nm_NC(info);
		else if (nc == columnItmDtl_ins_ts) doItmDtl_ins_ts_NC(info);
		else if (nc == columnItmDtl_upd_usr_id) doItmDtl_upd_usr_id_NC(info);
		else if (nc == columnItmDtl_upd_usr_nm) doItmDtl_upd_usr_nm_NC(info);
		else if (nc == columnItmDtl_upd_func_id) doItmDtl_upd_func_id_NC(info);
		else if (nc == columnItmDtl_upd_func_nm) doItmDtl_upd_func_nm_NC(info);
		else if (nc == columnItmDtl_upd_ts) doItmDtl_upd_ts_NC(info);
		else if (nc == columnItmDtl_upd_srv_req_no) doItmDtl_upd_srv_req_no_NC(info);
		else if (nc == columnItmOper_calc_ctg_cd) doItmOper_calc_ctg_cd_NC(info);
		else if (nc == columnItmOper_calc_ctg_nm) doItmOper_calc_ctg_nm_NC(info);
		else if (nc == columnItmOper_wg_cd) doItmOper_wg_cd_NC(info);
		else if (nc == columnItmOper_wg_nm) doItmOper_wg_nm_NC(info);
		else if (nc == columnItmOper_loc_cd) doItmOper_loc_cd_NC(info);
		else if (nc == columnItmOper_loc_nm) doItmOper_loc_nm_NC(info);
		else if (nc == columnItmOper_oper_ptn) doItmOper_oper_ptn_NC(info);
		else if (nc == columnItmOper_oper_cd) doItmOper_oper_cd_NC(info);
		else if (nc == columnItmOper_oper_nm) doItmOper_oper_nm_NC(info);
		else if (nc == columnItmOper_oper_seq) doItmOper_oper_seq_NC(info);
		else if (nc == columnItmOper_disp_seq) doItmOper_disp_seq_NC(info);
		else if (nc == columnItmOper_yield_oper_flg) doItmOper_yield_oper_flg_NC(info);
		else if (nc == columnItmOper_nmr_qty) doItmOper_nmr_qty_NC(info);
		else if (nc == columnItmOper_dnm_qty) doItmOper_dnm_qty_NC(info);
		else if (nc == columnItmOper_unit_cd) doItmOper_unit_cd_NC(info);
		else if (nc == columnItmOper_unit_nm) doItmOper_unit_nm_NC(info);
		else if (nc == columnItmOper_oper_unit_cd) doItmOper_oper_unit_cd_NC(info);
		else if (nc == columnItmOper_oper_unit_nm) doItmOper_oper_unit_nm_NC(info);
		else if (nc == columnItmOper_oper_std_qty) doItmOper_oper_std_qty_NC(info);
		else if (nc == columnItmOper_oper_conv_qty) doItmOper_oper_conv_qty_NC(info);
		else if (nc == columnItmOper_dec_place) doItmOper_dec_place_NC(info);
		else if (nc == columnItmOper_unit_conv_rnd_typ) doItmOper_unit_conv_rnd_typ_NC(info);
		else if (nc == columnItmOper_unit_conv_rnd_typ_nm) doItmOper_unit_conv_rnd_typ_nm_NC(info);
		else if (nc == columnItmOper_rmrks) doItmOper_rmrks_NC(info);
		else if (nc == columnItmOper_sub_char1) doItmOper_sub_char1_NC(info);
		else if (nc == columnItmOper_sub_char2) doItmOper_sub_char2_NC(info);
		else if (nc == columnItmOper_sub_char3) doItmOper_sub_char3_NC(info);
		else if (nc == columnItmOper_non_calc_flg) doItmOper_non_calc_flg_NC(info);
		else if (nc == columnItmOper_ins_usr_id) doItmOper_ins_usr_id_NC(info);
		else if (nc == columnItmOper_ins_usr_nm) doItmOper_ins_usr_nm_NC(info);
		else if (nc == columnItmOper_ins_func_id) doItmOper_ins_func_id_NC(info);
		else if (nc == columnItmOper_ins_func_nm) doItmOper_ins_func_nm_NC(info);
		else if (nc == columnItmOper_ins_ts) doItmOper_ins_ts_NC(info);
		else if (nc == columnItmOper_upd_usr_id) doItmOper_upd_usr_id_NC(info);
		else if (nc == columnItmOper_upd_usr_nm) doItmOper_upd_usr_nm_NC(info);
		else if (nc == columnItmOper_upd_func_id) doItmOper_upd_func_id_NC(info);
		else if (nc == columnItmOper_upd_func_nm) doItmOper_upd_func_nm_NC(info);
		else if (nc == columnItmOper_upd_ts) doItmOper_upd_ts_NC(info);
		else if (nc == columnItmOper_upd_srv_req_no) doItmOper_upd_srv_req_no_NC(info);
		else if (nc == columnItmWk_calc_ctg_cd) doItmWk_calc_ctg_cd_NC(info);
		else if (nc == columnItmWk_calc_ctg_nm) doItmWk_calc_ctg_nm_NC(info);
		else if (nc == columnItmWk_wg_cd) doItmWk_wg_cd_NC(info);
		else if (nc == columnItmWk_wg_nm) doItmWk_wg_nm_NC(info);
		else if (nc == columnItmWk_loc_cd) doItmWk_loc_cd_NC(info);
		else if (nc == columnItmWk_loc_nm) doItmWk_loc_nm_NC(info);
		else if (nc == columnItmWk_oper_ptn) doItmWk_oper_ptn_NC(info);
		else if (nc == columnItmWk_oper_cd) doItmWk_oper_cd_NC(info);
		else if (nc == columnItmWk_oper_nm) doItmWk_oper_nm_NC(info);
		else if (nc == columnItmWk_oper_seq) doItmWk_oper_seq_NC(info);
		else if (nc == columnItmWk_wk_cost_cd) doItmWk_wk_cost_cd_NC(info);
		else if (nc == columnItmWk_wk_cost_nm) doItmWk_wk_cost_nm_NC(info);
		else if (nc == columnItmWk_unit_cd) doItmWk_unit_cd_NC(info);
		else if (nc == columnItmWk_unit_nm) doItmWk_unit_nm_NC(info);
		else if (nc == columnItmWk_dec_place) doItmWk_dec_place_NC(info);
		else if (nc == columnItmWk_wk_cost_unit_nm) doItmWk_wk_cost_unit_nm_NC(info);
		else if (nc == columnItmWk_wk_cost_dec_place) doItmWk_wk_cost_dec_place_NC(info);
		else if (nc == columnItmWk_rmrks) doItmWk_rmrks_NC(info);
		else if (nc == columnItmWk_sub_char1) doItmWk_sub_char1_NC(info);
		else if (nc == columnItmWk_sub_char2) doItmWk_sub_char2_NC(info);
		else if (nc == columnItmWk_sub_char3) doItmWk_sub_char3_NC(info);
		else if (nc == columnItmWk_non_calc_flg) doItmWk_non_calc_flg_NC(info);
		else if (nc == columnItmWk_ins_usr_id) doItmWk_ins_usr_id_NC(info);
		else if (nc == columnItmWk_ins_usr_nm) doItmWk_ins_usr_nm_NC(info);
		else if (nc == columnItmWk_ins_func_id) doItmWk_ins_func_id_NC(info);
		else if (nc == columnItmWk_ins_func_nm) doItmWk_ins_func_nm_NC(info);
		else if (nc == columnItmWk_ins_ts) doItmWk_ins_ts_NC(info);
		else if (nc == columnItmWk_upd_usr_id) doItmWk_upd_usr_id_NC(info);
		else if (nc == columnItmWk_upd_usr_nm) doItmWk_upd_usr_nm_NC(info);
		else if (nc == columnItmWk_upd_func_id) doItmWk_upd_func_id_NC(info);
		else if (nc == columnItmWk_upd_func_nm) doItmWk_upd_func_nm_NC(info);
		else if (nc == columnItmWk_upd_ts) doItmWk_upd_ts_NC(info);
		else if (nc == columnItmWk_upd_srv_req_no) doItmWk_upd_srv_req_no_NC(info);
		else if (nc == columnItmPurc_calc_ctg_cd) doItmPurc_calc_ctg_cd_NC(info);
		else if (nc == columnItmPurc_calc_ctg_nm) doItmPurc_calc_ctg_nm_NC(info);
		else if (nc == columnItmPurc_wg_cd) doItmPurc_wg_cd_NC(info);
		else if (nc == columnItmPurc_wg_nm) doItmPurc_wg_nm_NC(info);
		else if (nc == columnItmPurc_sppl_cd) doItmPurc_sppl_cd_NC(info);
		else if (nc == columnItmPurc_sppl_nm) doItmPurc_sppl_nm_NC(info);
		else if (nc == columnItmPurc_unit_cd) doItmPurc_unit_cd_NC(info);
		else if (nc == columnItmPurc_unit_nm) doItmPurc_unit_nm_NC(info);
		else if (nc == columnItmPurc_dec_place) doItmPurc_dec_place_NC(info);
		else if (nc == columnItmPurc_cur_cd) doItmPurc_cur_cd_NC(info);
		else if (nc == columnItmPurc_cur_nm) doItmPurc_cur_nm_NC(info);
		else if (nc == columnItmPurc_upri_dec_place) doItmPurc_upri_dec_place_NC(info);
		else if (nc == columnItmPurc_cost_ratio) doItmPurc_cost_ratio_NC(info);
		else if (nc == columnItmPurc_rmrks) doItmPurc_rmrks_NC(info);
		else if (nc == columnItmPurc_sub_char1) doItmPurc_sub_char1_NC(info);
		else if (nc == columnItmPurc_sub_char2) doItmPurc_sub_char2_NC(info);
		else if (nc == columnItmPurc_sub_char3) doItmPurc_sub_char3_NC(info);
		else if (nc == columnItmPurc_non_calc_flg) doItmPurc_non_calc_flg_NC(info);
		else if (nc == columnItmPurc_ins_usr_id) doItmPurc_ins_usr_id_NC(info);
		else if (nc == columnItmPurc_ins_usr_nm) doItmPurc_ins_usr_nm_NC(info);
		else if (nc == columnItmPurc_ins_func_id) doItmPurc_ins_func_id_NC(info);
		else if (nc == columnItmPurc_ins_func_nm) doItmPurc_ins_func_nm_NC(info);
		else if (nc == columnItmPurc_ins_ts) doItmPurc_ins_ts_NC(info);
		else if (nc == columnItmPurc_upd_usr_id) doItmPurc_upd_usr_id_NC(info);
		else if (nc == columnItmPurc_upd_usr_nm) doItmPurc_upd_usr_nm_NC(info);
		else if (nc == columnItmPurc_upd_func_id) doItmPurc_upd_func_id_NC(info);
		else if (nc == columnItmPurc_upd_func_nm) doItmPurc_upd_func_nm_NC(info);
		else if (nc == columnItmPurc_upd_ts) doItmPurc_upd_ts_NC(info);
		else if (nc == columnItmPurc_upd_srv_req_no) doItmPurc_upd_srv_req_no_NC(info);
		else if (nc == columnItmProc_calc_ctg_cd) doItmProc_calc_ctg_cd_NC(info);
		else if (nc == columnItmProc_calc_ctg_nm) doItmProc_calc_ctg_nm_NC(info);
		else if (nc == columnItmProc_wg_cd) doItmProc_wg_cd_NC(info);
		else if (nc == columnItmProc_wg_nm) doItmProc_wg_nm_NC(info);
		else if (nc == columnItmProc_sppl_cd) doItmProc_sppl_cd_NC(info);
		else if (nc == columnItmProc_sppl_nm) doItmProc_sppl_nm_NC(info);
		else if (nc == columnItmProc_unit_cd) doItmProc_unit_cd_NC(info);
		else if (nc == columnItmProc_unit_nm) doItmProc_unit_nm_NC(info);
		else if (nc == columnItmProc_dec_place) doItmProc_dec_place_NC(info);
		else if (nc == columnItmProc_cur_cd) doItmProc_cur_cd_NC(info);
		else if (nc == columnItmProc_cur_nm) doItmProc_cur_nm_NC(info);
		else if (nc == columnItmProc_upri_dec_place) doItmProc_upri_dec_place_NC(info);
		else if (nc == columnItmProc_cost_ratio) doItmProc_cost_ratio_NC(info);
		else if (nc == columnItmProc_rmrks) doItmProc_rmrks_NC(info);
		else if (nc == columnItmProc_sub_char1) doItmProc_sub_char1_NC(info);
		else if (nc == columnItmProc_sub_char2) doItmProc_sub_char2_NC(info);
		else if (nc == columnItmProc_sub_char3) doItmProc_sub_char3_NC(info);
		else if (nc == columnItmProc_non_calc_flg) doItmProc_non_calc_flg_NC(info);
		else if (nc == columnItmProc_ins_usr_id) doItmProc_ins_usr_id_NC(info);
		else if (nc == columnItmProc_ins_usr_nm) doItmProc_ins_usr_nm_NC(info);
		else if (nc == columnItmProc_ins_func_id) doItmProc_ins_func_id_NC(info);
		else if (nc == columnItmProc_ins_func_nm) doItmProc_ins_func_nm_NC(info);
		else if (nc == columnItmProc_ins_ts) doItmProc_ins_ts_NC(info);
		else if (nc == columnItmProc_upd_usr_id) doItmProc_upd_usr_id_NC(info);
		else if (nc == columnItmProc_upd_usr_nm) doItmProc_upd_usr_nm_NC(info);
		else if (nc == columnItmProc_upd_func_id) doItmProc_upd_func_id_NC(info);
		else if (nc == columnItmProc_upd_func_nm) doItmProc_upd_func_nm_NC(info);
		else if (nc == columnItmProc_upd_ts) doItmProc_upd_ts_NC(info);
		else if (nc == columnItmProc_upd_srv_req_no) doItmProc_upd_srv_req_no_NC(info);
		else if (nc == columnItmProv_calc_ctg_cd) doItmProv_calc_ctg_cd_NC(info);
		else if (nc == columnItmProv_calc_ctg_nm) doItmProv_calc_ctg_nm_NC(info);
		else if (nc == columnItmProv_wg_cd) doItmProv_wg_cd_NC(info);
		else if (nc == columnItmProv_wg_nm) doItmProv_wg_nm_NC(info);
		else if (nc == columnItmProv_prsppl_cd) doItmProv_prsppl_cd_NC(info);
		else if (nc == columnItmProv_prsppl_nm) doItmProv_prsppl_nm_NC(info);
		else if (nc == columnItmProv_prov_typ) doItmProv_prov_typ_NC(info);
		else if (nc == columnItmProv_prov_typ_nm) doItmProv_prov_typ_nm_NC(info);
		else if (nc == columnItmProv_unit_cd) doItmProv_unit_cd_NC(info);
		else if (nc == columnItmProv_unit_nm) doItmProv_unit_nm_NC(info);
		else if (nc == columnItmProv_dec_place) doItmProv_dec_place_NC(info);
		else if (nc == columnItmProv_cur_cd) doItmProv_cur_cd_NC(info);
		else if (nc == columnItmProv_cur_nm) doItmProv_cur_nm_NC(info);
		else if (nc == columnItmProv_upri_dec_place) doItmProv_upri_dec_place_NC(info);
		else if (nc == columnItmProv_rmrks) doItmProv_rmrks_NC(info);
		else if (nc == columnItmProv_sub_char1) doItmProv_sub_char1_NC(info);
		else if (nc == columnItmProv_sub_char2) doItmProv_sub_char2_NC(info);
		else if (nc == columnItmProv_sub_char3) doItmProv_sub_char3_NC(info);
		else if (nc == columnItmProv_non_calc_flg) doItmProv_non_calc_flg_NC(info);
		else if (nc == columnItmProv_ins_usr_id) doItmProv_ins_usr_id_NC(info);
		else if (nc == columnItmProv_ins_usr_nm) doItmProv_ins_usr_nm_NC(info);
		else if (nc == columnItmProv_ins_func_id) doItmProv_ins_func_id_NC(info);
		else if (nc == columnItmProv_ins_func_nm) doItmProv_ins_func_nm_NC(info);
		else if (nc == columnItmProv_ins_ts) doItmProv_ins_ts_NC(info);
		else if (nc == columnItmProv_upd_usr_id) doItmProv_upd_usr_id_NC(info);
		else if (nc == columnItmProv_upd_usr_nm) doItmProv_upd_usr_nm_NC(info);
		else if (nc == columnItmProv_upd_func_id) doItmProv_upd_func_id_NC(info);
		else if (nc == columnItmProv_upd_func_nm) doItmProv_upd_func_nm_NC(info);
		else if (nc == columnItmProv_upd_ts) doItmProv_upd_ts_NC(info);
		else if (nc == columnItmProv_upd_srv_req_no) doItmProv_upd_srv_req_no_NC(info);
		else if (nc == columnItmSls_calc_ctg_cd) doItmSls_calc_ctg_cd_NC(info);
		else if (nc == columnItmSls_calc_ctg_nm) doItmSls_calc_ctg_nm_NC(info);
		else if (nc == columnItmSls_wg_cd) doItmSls_wg_cd_NC(info);
		else if (nc == columnItmSls_wg_nm) doItmSls_wg_nm_NC(info);
		else if (nc == columnItmSls_dpt_cd) doItmSls_dpt_cd_NC(info);
		else if (nc == columnItmSls_dpt_nm) doItmSls_dpt_nm_NC(info);
		else if (nc == columnItmSls_cst_cd) doItmSls_cst_cd_NC(info);
		else if (nc == columnItmSls_cst_nm) doItmSls_cst_nm_NC(info);
		else if (nc == columnItmSls_dlv_cd) doItmSls_dlv_cd_NC(info);
		else if (nc == columnItmSls_dlv_nm) doItmSls_dlv_nm_NC(info);
		else if (nc == columnItmSls_dest_cd1) doItmSls_dest_cd1_NC(info);
		else if (nc == columnItmSls_dest_nm1) doItmSls_dest_nm1_NC(info);
		else if (nc == columnItmSls_dest_cd2) doItmSls_dest_cd2_NC(info);
		else if (nc == columnItmSls_dest_nm2) doItmSls_dest_nm2_NC(info);
		else if (nc == columnItmSls_dest_cd3) doItmSls_dest_cd3_NC(info);
		else if (nc == columnItmSls_dest_nm3) doItmSls_dest_nm3_NC(info);
		else if (nc == columnItmSls_unit_cd) doItmSls_unit_cd_NC(info);
		else if (nc == columnItmSls_unit_nm) doItmSls_unit_nm_NC(info);
		else if (nc == columnItmSls_dec_place) doItmSls_dec_place_NC(info);
		else if (nc == columnItmSls_cur_cd) doItmSls_cur_cd_NC(info);
		else if (nc == columnItmSls_cur_nm) doItmSls_cur_nm_NC(info);
		else if (nc == columnItmSls_upri_dec_place) doItmSls_upri_dec_place_NC(info);
		else if (nc == columnItmSls_prio) doItmSls_prio_NC(info);
		else if (nc == columnItmSls_alc_val1) doItmSls_alc_val1_NC(info);
		else if (nc == columnItmSls_alc_val2) doItmSls_alc_val2_NC(info);
		else if (nc == columnItmSls_alc_val3) doItmSls_alc_val3_NC(info);
		else if (nc == columnItmSls_alc_val4) doItmSls_alc_val4_NC(info);
		else if (nc == columnItmSls_alc_val5) doItmSls_alc_val5_NC(info);
		else if (nc == columnItmSls_rmrks) doItmSls_rmrks_NC(info);
		else if (nc == columnItmSls_sub_char1) doItmSls_sub_char1_NC(info);
		else if (nc == columnItmSls_sub_char2) doItmSls_sub_char2_NC(info);
		else if (nc == columnItmSls_sub_char3) doItmSls_sub_char3_NC(info);
		else if (nc == columnItmSls_non_calc_flg) doItmSls_non_calc_flg_NC(info);
		else if (nc == columnItmSls_ins_usr_id) doItmSls_ins_usr_id_NC(info);
		else if (nc == columnItmSls_ins_usr_nm) doItmSls_ins_usr_nm_NC(info);
		else if (nc == columnItmSls_ins_func_id) doItmSls_ins_func_id_NC(info);
		else if (nc == columnItmSls_ins_func_nm) doItmSls_ins_func_nm_NC(info);
		else if (nc == columnItmSls_ins_ts) doItmSls_ins_ts_NC(info);
		else if (nc == columnItmSls_upd_usr_id) doItmSls_upd_usr_id_NC(info);
		else if (nc == columnItmSls_upd_usr_nm) doItmSls_upd_usr_nm_NC(info);
		else if (nc == columnItmSls_upd_func_id) doItmSls_upd_func_id_NC(info);
		else if (nc == columnItmSls_upd_func_nm) doItmSls_upd_func_nm_NC(info);
		else if (nc == columnItmSls_upd_ts) doItmSls_upd_ts_NC(info);
		else if (nc == columnItmSls_upd_srv_req_no) doItmSls_upd_srv_req_no_NC(info);
		else if (nc == columnItmFix_calc_ctg_cd) doItmFix_calc_ctg_cd_NC(info);
		else if (nc == columnItmFix_calc_ctg_nm) doItmFix_calc_ctg_nm_NC(info);
		else if (nc == columnItmFix_wg_cd) doItmFix_wg_cd_NC(info);
		else if (nc == columnItmFix_wg_nm) doItmFix_wg_nm_NC(info);
		else if (nc == columnItmFix_expns_cd) doItmFix_expns_cd_NC(info);
		else if (nc == columnItmFix_expns_nm) doItmFix_expns_nm_NC(info);
		else if (nc == columnItmFix_unit_cd) doItmFix_unit_cd_NC(info);
		else if (nc == columnItmFix_unit_nm) doItmFix_unit_nm_NC(info);
		else if (nc == columnItmFix_dec_place) doItmFix_dec_place_NC(info);
		else if (nc == columnItmFix_cur_cd) doItmFix_cur_cd_NC(info);
		else if (nc == columnItmFix_cur_nm) doItmFix_cur_nm_NC(info);
		else if (nc == columnItmFix_std_upri_dec_place) doItmFix_std_upri_dec_place_NC(info);
		else if (nc == columnItmFix_rmrks) doItmFix_rmrks_NC(info);
		else if (nc == columnItmFix_sub_char1) doItmFix_sub_char1_NC(info);
		else if (nc == columnItmFix_sub_char2) doItmFix_sub_char2_NC(info);
		else if (nc == columnItmFix_sub_char3) doItmFix_sub_char3_NC(info);
		else if (nc == columnItmFix_non_calc_flg) doItmFix_non_calc_flg_NC(info);
		else if (nc == columnItmFix_ins_usr_id) doItmFix_ins_usr_id_NC(info);
		else if (nc == columnItmFix_ins_usr_nm) doItmFix_ins_usr_nm_NC(info);
		else if (nc == columnItmFix_ins_func_id) doItmFix_ins_func_id_NC(info);
		else if (nc == columnItmFix_ins_func_nm) doItmFix_ins_func_nm_NC(info);
		else if (nc == columnItmFix_ins_ts) doItmFix_ins_ts_NC(info);
		else if (nc == columnItmFix_upd_usr_id) doItmFix_upd_usr_id_NC(info);
		else if (nc == columnItmFix_upd_usr_nm) doItmFix_upd_usr_nm_NC(info);
		else if (nc == columnItmFix_upd_func_id) doItmFix_upd_func_id_NC(info);
		else if (nc == columnItmFix_upd_func_nm) doItmFix_upd_func_nm_NC(info);
		else if (nc == columnItmFix_upd_ts) doItmFix_upd_ts_NC(info);
		else if (nc == columnItmFix_upd_srv_req_no) doItmFix_upd_srv_req_no_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Bottom]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBottom_NC(MCEventInfo info){
	}

	/**
	 * [Itm]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_is_srch_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_is_srch_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_hrrchy]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_hrrchy_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bottom_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bottom_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unreg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unreg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[non_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_non_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[cost_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_cost_ratio_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[oper_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_oper_ptn_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[exp_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_exp_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[exp_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_exp_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[exp_prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_exp_prio_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val1_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val2_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val3_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val4_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val5_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[non_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_non_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_ptn_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_seq_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[yield_oper_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_yield_oper_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[nmr_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_nmr_qty_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[dnm_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_dnm_qty_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_std_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_std_qty_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_conv_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_conv_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_conv_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_conv_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[non_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_non_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_ptn_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_seq_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[non_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_non_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[cost_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_cost_ratio_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[non_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_non_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[cost_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_cost_ratio_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[non_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_non_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prov_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prov_typ_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prov_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prov_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[non_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_non_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_prio_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val1_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val2_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val3_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val4_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val5_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[non_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_non_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[std_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_std_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[non_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_non_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == BottomTab) doBottom_NE(info);
		else if (ne == ItmTable) doItm_NE(info);
		else if (ne == ItmDtlTable) doItmDtl_NE(info);
		else if (ne == ItmOperTable) doItmOper_NE(info);
		else if (ne == ItmWkTable) doItmWk_NE(info);
		else if (ne == ItmPurcTable) doItmPurc_NE(info);
		else if (ne == ItmProcTable) doItmProc_NE(info);
		else if (ne == ItmProvTable) doItmProv_NE(info);
		else if (ne == ItmSlsTable) doItmSls_NE(info);
		else if (ne == ItmFixTable) doItmFix_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_itm_is_srch_typ) doCnd_itm_is_srch_typ_NE(info);
		else if (ne == Cnd_bom_ptn) doCnd_bom_ptn_NE(info);
		else if (ne == Cnd_par_itm_flg) doCnd_par_itm_flg_NE(info);
		else if (ne == Cnd_chd_itm_flg) doCnd_chd_itm_flg_NE(info);
		else if (ne == Cnd_bom_ptn_flg) doCnd_bom_ptn_flg_NE(info);
		else if (ne == Cnd_max_hrrchy) doCnd_max_hrrchy_NE(info);
		else if (ne == columnDtl_bottom_flg) doDtl_bottom_flg_NE(info);
		else if (ne == columnDtl_unreg_flg) doDtl_unreg_flg_NE(info);
		else if (ne == columnDtl_itm_typ) doDtl_itm_typ_NE(info);
		else if (ne == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NE(info);
		else if (ne == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NE(info);
		else if (ne == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NE(info);
		else if (ne == columnDtl_bom_ptn) doDtl_bom_ptn_NE(info);
		else if (ne == columnDtl_oper_cd) doDtl_oper_cd_NE(info);
		else if (ne == columnDtl_oper_nm) doDtl_oper_nm_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_par_unit_cd) doDtl_par_unit_cd_NE(info);
		else if (ne == columnDtl_par_unit_nm) doDtl_par_unit_nm_NE(info);
		else if (ne == columnDtl_par_dec_place) doDtl_par_dec_place_NE(info);
		else if (ne == columnDtl_chd_unit_cd) doDtl_chd_unit_cd_NE(info);
		else if (ne == columnDtl_chd_unit_nm) doDtl_chd_unit_nm_NE(info);
		else if (ne == columnDtl_chd_dec_place) doDtl_chd_dec_place_NE(info);
		else if (ne == columnDtl_alt_grp_cd) doDtl_alt_grp_cd_NE(info);
		else if (ne == columnDtl_alt_itm_ratio) doDtl_alt_itm_ratio_NE(info);
		else if (ne == columnDtl_expns_cd) doDtl_expns_cd_NE(info);
		else if (ne == columnDtl_expns_nm) doDtl_expns_nm_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_calc_ctg_cd) doDtl_calc_ctg_cd_NE(info);
		else if (ne == columnDtl_calc_ctg_nm) doDtl_calc_ctg_nm_NE(info);
		else if (ne == columnDtl_itm_calc_ctg_cd) doDtl_itm_calc_ctg_cd_NE(info);
		else if (ne == columnDtl_itm_calc_ctg_nm) doDtl_itm_calc_ctg_nm_NE(info);
		else if (ne == columnDtl_dtl_calc_ctg_cd) doDtl_dtl_calc_ctg_cd_NE(info);
		else if (ne == columnDtl_dtl_calc_ctg_nm) doDtl_dtl_calc_ctg_nm_NE(info);
		else if (ne == columnDtl_purc_calc_ctg_cd) doDtl_purc_calc_ctg_cd_NE(info);
		else if (ne == columnDtl_purc_calc_ctg_nm) doDtl_purc_calc_ctg_nm_NE(info);
		else if (ne == columnDtl_proc_calc_ctg_cd) doDtl_proc_calc_ctg_cd_NE(info);
		else if (ne == columnDtl_proc_calc_ctg_nm) doDtl_proc_calc_ctg_nm_NE(info);
		else if (ne == columnDtl_prov_calc_ctg_cd) doDtl_prov_calc_ctg_cd_NE(info);
		else if (ne == columnDtl_prov_calc_ctg_nm) doDtl_prov_calc_ctg_nm_NE(info);
		else if (ne == columnDtl_sls_calc_ctg_cd) doDtl_sls_calc_ctg_cd_NE(info);
		else if (ne == columnDtl_sls_calc_ctg_nm) doDtl_sls_calc_ctg_nm_NE(info);
		else if (ne == columnDtl_fix_calc_ctg_cd) doDtl_fix_calc_ctg_cd_NE(info);
		else if (ne == columnDtl_fix_calc_ctg_nm) doDtl_fix_calc_ctg_nm_NE(info);
		else if (ne == columnItm_calc_ctg_cd) doItm_calc_ctg_cd_NE(info);
		else if (ne == columnItm_calc_ctg_nm) doItm_calc_ctg_nm_NE(info);
		else if (ne == columnItm_wg_cd) doItm_wg_cd_NE(info);
		else if (ne == columnItm_wg_nm) doItm_wg_nm_NE(info);
		else if (ne == columnItm_calc_ptn_cd) doItm_calc_ptn_cd_NE(info);
		else if (ne == columnItm_calc_ptn_nm) doItm_calc_ptn_nm_NE(info);
		else if (ne == columnItm_unit_cd) doItm_unit_cd_NE(info);
		else if (ne == columnItm_unit_nm) doItm_unit_nm_NE(info);
		else if (ne == columnItm_dec_place) doItm_dec_place_NE(info);
		else if (ne == columnItm_rmrks) doItm_rmrks_NE(info);
		else if (ne == columnItm_sub_char1) doItm_sub_char1_NE(info);
		else if (ne == columnItm_sub_char2) doItm_sub_char2_NE(info);
		else if (ne == columnItm_sub_char3) doItm_sub_char3_NE(info);
		else if (ne == columnItm_non_calc_flg) doItm_non_calc_flg_NE(info);
		else if (ne == columnItm_ins_usr_id) doItm_ins_usr_id_NE(info);
		else if (ne == columnItm_ins_usr_nm) doItm_ins_usr_nm_NE(info);
		else if (ne == columnItm_ins_func_id) doItm_ins_func_id_NE(info);
		else if (ne == columnItm_ins_func_nm) doItm_ins_func_nm_NE(info);
		else if (ne == columnItm_ins_ts) doItm_ins_ts_NE(info);
		else if (ne == columnItm_upd_usr_id) doItm_upd_usr_id_NE(info);
		else if (ne == columnItm_upd_usr_nm) doItm_upd_usr_nm_NE(info);
		else if (ne == columnItm_upd_func_id) doItm_upd_func_id_NE(info);
		else if (ne == columnItm_upd_func_nm) doItm_upd_func_nm_NE(info);
		else if (ne == columnItm_upd_ts) doItm_upd_ts_NE(info);
		else if (ne == columnItm_upd_srv_req_no) doItm_upd_srv_req_no_NE(info);
		else if (ne == columnItmDtl_calc_ctg_cd) doItmDtl_calc_ctg_cd_NE(info);
		else if (ne == columnItmDtl_calc_ctg_nm) doItmDtl_calc_ctg_nm_NE(info);
		else if (ne == columnItmDtl_wg_cd) doItmDtl_wg_cd_NE(info);
		else if (ne == columnItmDtl_wg_nm) doItmDtl_wg_nm_NE(info);
		else if (ne == columnItmDtl_loc_cd) doItmDtl_loc_cd_NE(info);
		else if (ne == columnItmDtl_loc_nm) doItmDtl_loc_nm_NE(info);
		else if (ne == columnItmDtl_sppl_cd) doItmDtl_sppl_cd_NE(info);
		else if (ne == columnItmDtl_sppl_nm) doItmDtl_sppl_nm_NE(info);
		else if (ne == columnItmDtl_rqst_wg_cd) doItmDtl_rqst_wg_cd_NE(info);
		else if (ne == columnItmDtl_rqst_wg_nm) doItmDtl_rqst_wg_nm_NE(info);
		else if (ne == columnItmDtl_cost_ratio) doItmDtl_cost_ratio_NE(info);
		else if (ne == columnItmDtl_oper_ptn) doItmDtl_oper_ptn_NE(info);
		else if (ne == columnItmDtl_bom_ptn) doItmDtl_bom_ptn_NE(info);
		else if (ne == columnItmDtl_unit_cd) doItmDtl_unit_cd_NE(info);
		else if (ne == columnItmDtl_unit_nm) doItmDtl_unit_nm_NE(info);
		else if (ne == columnItmDtl_dec_place) doItmDtl_dec_place_NE(info);
		else if (ne == columnItmDtl_alc_dpt_cd) doItmDtl_alc_dpt_cd_NE(info);
		else if (ne == columnItmDtl_alc_dpt_nm) doItmDtl_alc_dpt_nm_NE(info);
		else if (ne == columnItmDtl_exp_dpt_cd) doItmDtl_exp_dpt_cd_NE(info);
		else if (ne == columnItmDtl_exp_dpt_nm) doItmDtl_exp_dpt_nm_NE(info);
		else if (ne == columnItmDtl_exp_prio) doItmDtl_exp_prio_NE(info);
		else if (ne == columnItmDtl_alc_val1) doItmDtl_alc_val1_NE(info);
		else if (ne == columnItmDtl_alc_val2) doItmDtl_alc_val2_NE(info);
		else if (ne == columnItmDtl_alc_val3) doItmDtl_alc_val3_NE(info);
		else if (ne == columnItmDtl_alc_val4) doItmDtl_alc_val4_NE(info);
		else if (ne == columnItmDtl_alc_val5) doItmDtl_alc_val5_NE(info);
		else if (ne == columnItmDtl_rmrks) doItmDtl_rmrks_NE(info);
		else if (ne == columnItmDtl_sub_char1) doItmDtl_sub_char1_NE(info);
		else if (ne == columnItmDtl_sub_char2) doItmDtl_sub_char2_NE(info);
		else if (ne == columnItmDtl_sub_char3) doItmDtl_sub_char3_NE(info);
		else if (ne == columnItmDtl_non_calc_flg) doItmDtl_non_calc_flg_NE(info);
		else if (ne == columnItmDtl_ins_usr_id) doItmDtl_ins_usr_id_NE(info);
		else if (ne == columnItmDtl_ins_usr_nm) doItmDtl_ins_usr_nm_NE(info);
		else if (ne == columnItmDtl_ins_func_id) doItmDtl_ins_func_id_NE(info);
		else if (ne == columnItmDtl_ins_func_nm) doItmDtl_ins_func_nm_NE(info);
		else if (ne == columnItmDtl_ins_ts) doItmDtl_ins_ts_NE(info);
		else if (ne == columnItmDtl_upd_usr_id) doItmDtl_upd_usr_id_NE(info);
		else if (ne == columnItmDtl_upd_usr_nm) doItmDtl_upd_usr_nm_NE(info);
		else if (ne == columnItmDtl_upd_func_id) doItmDtl_upd_func_id_NE(info);
		else if (ne == columnItmDtl_upd_func_nm) doItmDtl_upd_func_nm_NE(info);
		else if (ne == columnItmDtl_upd_ts) doItmDtl_upd_ts_NE(info);
		else if (ne == columnItmDtl_upd_srv_req_no) doItmDtl_upd_srv_req_no_NE(info);
		else if (ne == columnItmOper_calc_ctg_cd) doItmOper_calc_ctg_cd_NE(info);
		else if (ne == columnItmOper_calc_ctg_nm) doItmOper_calc_ctg_nm_NE(info);
		else if (ne == columnItmOper_wg_cd) doItmOper_wg_cd_NE(info);
		else if (ne == columnItmOper_wg_nm) doItmOper_wg_nm_NE(info);
		else if (ne == columnItmOper_loc_cd) doItmOper_loc_cd_NE(info);
		else if (ne == columnItmOper_loc_nm) doItmOper_loc_nm_NE(info);
		else if (ne == columnItmOper_oper_ptn) doItmOper_oper_ptn_NE(info);
		else if (ne == columnItmOper_oper_cd) doItmOper_oper_cd_NE(info);
		else if (ne == columnItmOper_oper_nm) doItmOper_oper_nm_NE(info);
		else if (ne == columnItmOper_oper_seq) doItmOper_oper_seq_NE(info);
		else if (ne == columnItmOper_disp_seq) doItmOper_disp_seq_NE(info);
		else if (ne == columnItmOper_yield_oper_flg) doItmOper_yield_oper_flg_NE(info);
		else if (ne == columnItmOper_nmr_qty) doItmOper_nmr_qty_NE(info);
		else if (ne == columnItmOper_dnm_qty) doItmOper_dnm_qty_NE(info);
		else if (ne == columnItmOper_unit_cd) doItmOper_unit_cd_NE(info);
		else if (ne == columnItmOper_unit_nm) doItmOper_unit_nm_NE(info);
		else if (ne == columnItmOper_oper_unit_cd) doItmOper_oper_unit_cd_NE(info);
		else if (ne == columnItmOper_oper_unit_nm) doItmOper_oper_unit_nm_NE(info);
		else if (ne == columnItmOper_oper_std_qty) doItmOper_oper_std_qty_NE(info);
		else if (ne == columnItmOper_oper_conv_qty) doItmOper_oper_conv_qty_NE(info);
		else if (ne == columnItmOper_dec_place) doItmOper_dec_place_NE(info);
		else if (ne == columnItmOper_unit_conv_rnd_typ) doItmOper_unit_conv_rnd_typ_NE(info);
		else if (ne == columnItmOper_unit_conv_rnd_typ_nm) doItmOper_unit_conv_rnd_typ_nm_NE(info);
		else if (ne == columnItmOper_rmrks) doItmOper_rmrks_NE(info);
		else if (ne == columnItmOper_sub_char1) doItmOper_sub_char1_NE(info);
		else if (ne == columnItmOper_sub_char2) doItmOper_sub_char2_NE(info);
		else if (ne == columnItmOper_sub_char3) doItmOper_sub_char3_NE(info);
		else if (ne == columnItmOper_non_calc_flg) doItmOper_non_calc_flg_NE(info);
		else if (ne == columnItmOper_ins_usr_id) doItmOper_ins_usr_id_NE(info);
		else if (ne == columnItmOper_ins_usr_nm) doItmOper_ins_usr_nm_NE(info);
		else if (ne == columnItmOper_ins_func_id) doItmOper_ins_func_id_NE(info);
		else if (ne == columnItmOper_ins_func_nm) doItmOper_ins_func_nm_NE(info);
		else if (ne == columnItmOper_ins_ts) doItmOper_ins_ts_NE(info);
		else if (ne == columnItmOper_upd_usr_id) doItmOper_upd_usr_id_NE(info);
		else if (ne == columnItmOper_upd_usr_nm) doItmOper_upd_usr_nm_NE(info);
		else if (ne == columnItmOper_upd_func_id) doItmOper_upd_func_id_NE(info);
		else if (ne == columnItmOper_upd_func_nm) doItmOper_upd_func_nm_NE(info);
		else if (ne == columnItmOper_upd_ts) doItmOper_upd_ts_NE(info);
		else if (ne == columnItmOper_upd_srv_req_no) doItmOper_upd_srv_req_no_NE(info);
		else if (ne == columnItmWk_calc_ctg_cd) doItmWk_calc_ctg_cd_NE(info);
		else if (ne == columnItmWk_calc_ctg_nm) doItmWk_calc_ctg_nm_NE(info);
		else if (ne == columnItmWk_wg_cd) doItmWk_wg_cd_NE(info);
		else if (ne == columnItmWk_wg_nm) doItmWk_wg_nm_NE(info);
		else if (ne == columnItmWk_loc_cd) doItmWk_loc_cd_NE(info);
		else if (ne == columnItmWk_loc_nm) doItmWk_loc_nm_NE(info);
		else if (ne == columnItmWk_oper_ptn) doItmWk_oper_ptn_NE(info);
		else if (ne == columnItmWk_oper_cd) doItmWk_oper_cd_NE(info);
		else if (ne == columnItmWk_oper_nm) doItmWk_oper_nm_NE(info);
		else if (ne == columnItmWk_oper_seq) doItmWk_oper_seq_NE(info);
		else if (ne == columnItmWk_wk_cost_cd) doItmWk_wk_cost_cd_NE(info);
		else if (ne == columnItmWk_wk_cost_nm) doItmWk_wk_cost_nm_NE(info);
		else if (ne == columnItmWk_unit_cd) doItmWk_unit_cd_NE(info);
		else if (ne == columnItmWk_unit_nm) doItmWk_unit_nm_NE(info);
		else if (ne == columnItmWk_dec_place) doItmWk_dec_place_NE(info);
		else if (ne == columnItmWk_wk_cost_unit_nm) doItmWk_wk_cost_unit_nm_NE(info);
		else if (ne == columnItmWk_wk_cost_dec_place) doItmWk_wk_cost_dec_place_NE(info);
		else if (ne == columnItmWk_rmrks) doItmWk_rmrks_NE(info);
		else if (ne == columnItmWk_sub_char1) doItmWk_sub_char1_NE(info);
		else if (ne == columnItmWk_sub_char2) doItmWk_sub_char2_NE(info);
		else if (ne == columnItmWk_sub_char3) doItmWk_sub_char3_NE(info);
		else if (ne == columnItmWk_non_calc_flg) doItmWk_non_calc_flg_NE(info);
		else if (ne == columnItmWk_ins_usr_id) doItmWk_ins_usr_id_NE(info);
		else if (ne == columnItmWk_ins_usr_nm) doItmWk_ins_usr_nm_NE(info);
		else if (ne == columnItmWk_ins_func_id) doItmWk_ins_func_id_NE(info);
		else if (ne == columnItmWk_ins_func_nm) doItmWk_ins_func_nm_NE(info);
		else if (ne == columnItmWk_ins_ts) doItmWk_ins_ts_NE(info);
		else if (ne == columnItmWk_upd_usr_id) doItmWk_upd_usr_id_NE(info);
		else if (ne == columnItmWk_upd_usr_nm) doItmWk_upd_usr_nm_NE(info);
		else if (ne == columnItmWk_upd_func_id) doItmWk_upd_func_id_NE(info);
		else if (ne == columnItmWk_upd_func_nm) doItmWk_upd_func_nm_NE(info);
		else if (ne == columnItmWk_upd_ts) doItmWk_upd_ts_NE(info);
		else if (ne == columnItmWk_upd_srv_req_no) doItmWk_upd_srv_req_no_NE(info);
		else if (ne == columnItmPurc_calc_ctg_cd) doItmPurc_calc_ctg_cd_NE(info);
		else if (ne == columnItmPurc_calc_ctg_nm) doItmPurc_calc_ctg_nm_NE(info);
		else if (ne == columnItmPurc_wg_cd) doItmPurc_wg_cd_NE(info);
		else if (ne == columnItmPurc_wg_nm) doItmPurc_wg_nm_NE(info);
		else if (ne == columnItmPurc_sppl_cd) doItmPurc_sppl_cd_NE(info);
		else if (ne == columnItmPurc_sppl_nm) doItmPurc_sppl_nm_NE(info);
		else if (ne == columnItmPurc_unit_cd) doItmPurc_unit_cd_NE(info);
		else if (ne == columnItmPurc_unit_nm) doItmPurc_unit_nm_NE(info);
		else if (ne == columnItmPurc_dec_place) doItmPurc_dec_place_NE(info);
		else if (ne == columnItmPurc_cur_cd) doItmPurc_cur_cd_NE(info);
		else if (ne == columnItmPurc_cur_nm) doItmPurc_cur_nm_NE(info);
		else if (ne == columnItmPurc_upri_dec_place) doItmPurc_upri_dec_place_NE(info);
		else if (ne == columnItmPurc_cost_ratio) doItmPurc_cost_ratio_NE(info);
		else if (ne == columnItmPurc_rmrks) doItmPurc_rmrks_NE(info);
		else if (ne == columnItmPurc_sub_char1) doItmPurc_sub_char1_NE(info);
		else if (ne == columnItmPurc_sub_char2) doItmPurc_sub_char2_NE(info);
		else if (ne == columnItmPurc_sub_char3) doItmPurc_sub_char3_NE(info);
		else if (ne == columnItmPurc_non_calc_flg) doItmPurc_non_calc_flg_NE(info);
		else if (ne == columnItmPurc_ins_usr_id) doItmPurc_ins_usr_id_NE(info);
		else if (ne == columnItmPurc_ins_usr_nm) doItmPurc_ins_usr_nm_NE(info);
		else if (ne == columnItmPurc_ins_func_id) doItmPurc_ins_func_id_NE(info);
		else if (ne == columnItmPurc_ins_func_nm) doItmPurc_ins_func_nm_NE(info);
		else if (ne == columnItmPurc_ins_ts) doItmPurc_ins_ts_NE(info);
		else if (ne == columnItmPurc_upd_usr_id) doItmPurc_upd_usr_id_NE(info);
		else if (ne == columnItmPurc_upd_usr_nm) doItmPurc_upd_usr_nm_NE(info);
		else if (ne == columnItmPurc_upd_func_id) doItmPurc_upd_func_id_NE(info);
		else if (ne == columnItmPurc_upd_func_nm) doItmPurc_upd_func_nm_NE(info);
		else if (ne == columnItmPurc_upd_ts) doItmPurc_upd_ts_NE(info);
		else if (ne == columnItmPurc_upd_srv_req_no) doItmPurc_upd_srv_req_no_NE(info);
		else if (ne == columnItmProc_calc_ctg_cd) doItmProc_calc_ctg_cd_NE(info);
		else if (ne == columnItmProc_calc_ctg_nm) doItmProc_calc_ctg_nm_NE(info);
		else if (ne == columnItmProc_wg_cd) doItmProc_wg_cd_NE(info);
		else if (ne == columnItmProc_wg_nm) doItmProc_wg_nm_NE(info);
		else if (ne == columnItmProc_sppl_cd) doItmProc_sppl_cd_NE(info);
		else if (ne == columnItmProc_sppl_nm) doItmProc_sppl_nm_NE(info);
		else if (ne == columnItmProc_unit_cd) doItmProc_unit_cd_NE(info);
		else if (ne == columnItmProc_unit_nm) doItmProc_unit_nm_NE(info);
		else if (ne == columnItmProc_dec_place) doItmProc_dec_place_NE(info);
		else if (ne == columnItmProc_cur_cd) doItmProc_cur_cd_NE(info);
		else if (ne == columnItmProc_cur_nm) doItmProc_cur_nm_NE(info);
		else if (ne == columnItmProc_upri_dec_place) doItmProc_upri_dec_place_NE(info);
		else if (ne == columnItmProc_cost_ratio) doItmProc_cost_ratio_NE(info);
		else if (ne == columnItmProc_rmrks) doItmProc_rmrks_NE(info);
		else if (ne == columnItmProc_sub_char1) doItmProc_sub_char1_NE(info);
		else if (ne == columnItmProc_sub_char2) doItmProc_sub_char2_NE(info);
		else if (ne == columnItmProc_sub_char3) doItmProc_sub_char3_NE(info);
		else if (ne == columnItmProc_non_calc_flg) doItmProc_non_calc_flg_NE(info);
		else if (ne == columnItmProc_ins_usr_id) doItmProc_ins_usr_id_NE(info);
		else if (ne == columnItmProc_ins_usr_nm) doItmProc_ins_usr_nm_NE(info);
		else if (ne == columnItmProc_ins_func_id) doItmProc_ins_func_id_NE(info);
		else if (ne == columnItmProc_ins_func_nm) doItmProc_ins_func_nm_NE(info);
		else if (ne == columnItmProc_ins_ts) doItmProc_ins_ts_NE(info);
		else if (ne == columnItmProc_upd_usr_id) doItmProc_upd_usr_id_NE(info);
		else if (ne == columnItmProc_upd_usr_nm) doItmProc_upd_usr_nm_NE(info);
		else if (ne == columnItmProc_upd_func_id) doItmProc_upd_func_id_NE(info);
		else if (ne == columnItmProc_upd_func_nm) doItmProc_upd_func_nm_NE(info);
		else if (ne == columnItmProc_upd_ts) doItmProc_upd_ts_NE(info);
		else if (ne == columnItmProc_upd_srv_req_no) doItmProc_upd_srv_req_no_NE(info);
		else if (ne == columnItmProv_calc_ctg_cd) doItmProv_calc_ctg_cd_NE(info);
		else if (ne == columnItmProv_calc_ctg_nm) doItmProv_calc_ctg_nm_NE(info);
		else if (ne == columnItmProv_wg_cd) doItmProv_wg_cd_NE(info);
		else if (ne == columnItmProv_wg_nm) doItmProv_wg_nm_NE(info);
		else if (ne == columnItmProv_prsppl_cd) doItmProv_prsppl_cd_NE(info);
		else if (ne == columnItmProv_prsppl_nm) doItmProv_prsppl_nm_NE(info);
		else if (ne == columnItmProv_prov_typ) doItmProv_prov_typ_NE(info);
		else if (ne == columnItmProv_prov_typ_nm) doItmProv_prov_typ_nm_NE(info);
		else if (ne == columnItmProv_unit_cd) doItmProv_unit_cd_NE(info);
		else if (ne == columnItmProv_unit_nm) doItmProv_unit_nm_NE(info);
		else if (ne == columnItmProv_dec_place) doItmProv_dec_place_NE(info);
		else if (ne == columnItmProv_cur_cd) doItmProv_cur_cd_NE(info);
		else if (ne == columnItmProv_cur_nm) doItmProv_cur_nm_NE(info);
		else if (ne == columnItmProv_upri_dec_place) doItmProv_upri_dec_place_NE(info);
		else if (ne == columnItmProv_rmrks) doItmProv_rmrks_NE(info);
		else if (ne == columnItmProv_sub_char1) doItmProv_sub_char1_NE(info);
		else if (ne == columnItmProv_sub_char2) doItmProv_sub_char2_NE(info);
		else if (ne == columnItmProv_sub_char3) doItmProv_sub_char3_NE(info);
		else if (ne == columnItmProv_non_calc_flg) doItmProv_non_calc_flg_NE(info);
		else if (ne == columnItmProv_ins_usr_id) doItmProv_ins_usr_id_NE(info);
		else if (ne == columnItmProv_ins_usr_nm) doItmProv_ins_usr_nm_NE(info);
		else if (ne == columnItmProv_ins_func_id) doItmProv_ins_func_id_NE(info);
		else if (ne == columnItmProv_ins_func_nm) doItmProv_ins_func_nm_NE(info);
		else if (ne == columnItmProv_ins_ts) doItmProv_ins_ts_NE(info);
		else if (ne == columnItmProv_upd_usr_id) doItmProv_upd_usr_id_NE(info);
		else if (ne == columnItmProv_upd_usr_nm) doItmProv_upd_usr_nm_NE(info);
		else if (ne == columnItmProv_upd_func_id) doItmProv_upd_func_id_NE(info);
		else if (ne == columnItmProv_upd_func_nm) doItmProv_upd_func_nm_NE(info);
		else if (ne == columnItmProv_upd_ts) doItmProv_upd_ts_NE(info);
		else if (ne == columnItmProv_upd_srv_req_no) doItmProv_upd_srv_req_no_NE(info);
		else if (ne == columnItmSls_calc_ctg_cd) doItmSls_calc_ctg_cd_NE(info);
		else if (ne == columnItmSls_calc_ctg_nm) doItmSls_calc_ctg_nm_NE(info);
		else if (ne == columnItmSls_wg_cd) doItmSls_wg_cd_NE(info);
		else if (ne == columnItmSls_wg_nm) doItmSls_wg_nm_NE(info);
		else if (ne == columnItmSls_dpt_cd) doItmSls_dpt_cd_NE(info);
		else if (ne == columnItmSls_dpt_nm) doItmSls_dpt_nm_NE(info);
		else if (ne == columnItmSls_cst_cd) doItmSls_cst_cd_NE(info);
		else if (ne == columnItmSls_cst_nm) doItmSls_cst_nm_NE(info);
		else if (ne == columnItmSls_dlv_cd) doItmSls_dlv_cd_NE(info);
		else if (ne == columnItmSls_dlv_nm) doItmSls_dlv_nm_NE(info);
		else if (ne == columnItmSls_dest_cd1) doItmSls_dest_cd1_NE(info);
		else if (ne == columnItmSls_dest_nm1) doItmSls_dest_nm1_NE(info);
		else if (ne == columnItmSls_dest_cd2) doItmSls_dest_cd2_NE(info);
		else if (ne == columnItmSls_dest_nm2) doItmSls_dest_nm2_NE(info);
		else if (ne == columnItmSls_dest_cd3) doItmSls_dest_cd3_NE(info);
		else if (ne == columnItmSls_dest_nm3) doItmSls_dest_nm3_NE(info);
		else if (ne == columnItmSls_unit_cd) doItmSls_unit_cd_NE(info);
		else if (ne == columnItmSls_unit_nm) doItmSls_unit_nm_NE(info);
		else if (ne == columnItmSls_dec_place) doItmSls_dec_place_NE(info);
		else if (ne == columnItmSls_cur_cd) doItmSls_cur_cd_NE(info);
		else if (ne == columnItmSls_cur_nm) doItmSls_cur_nm_NE(info);
		else if (ne == columnItmSls_upri_dec_place) doItmSls_upri_dec_place_NE(info);
		else if (ne == columnItmSls_prio) doItmSls_prio_NE(info);
		else if (ne == columnItmSls_alc_val1) doItmSls_alc_val1_NE(info);
		else if (ne == columnItmSls_alc_val2) doItmSls_alc_val2_NE(info);
		else if (ne == columnItmSls_alc_val3) doItmSls_alc_val3_NE(info);
		else if (ne == columnItmSls_alc_val4) doItmSls_alc_val4_NE(info);
		else if (ne == columnItmSls_alc_val5) doItmSls_alc_val5_NE(info);
		else if (ne == columnItmSls_rmrks) doItmSls_rmrks_NE(info);
		else if (ne == columnItmSls_sub_char1) doItmSls_sub_char1_NE(info);
		else if (ne == columnItmSls_sub_char2) doItmSls_sub_char2_NE(info);
		else if (ne == columnItmSls_sub_char3) doItmSls_sub_char3_NE(info);
		else if (ne == columnItmSls_non_calc_flg) doItmSls_non_calc_flg_NE(info);
		else if (ne == columnItmSls_ins_usr_id) doItmSls_ins_usr_id_NE(info);
		else if (ne == columnItmSls_ins_usr_nm) doItmSls_ins_usr_nm_NE(info);
		else if (ne == columnItmSls_ins_func_id) doItmSls_ins_func_id_NE(info);
		else if (ne == columnItmSls_ins_func_nm) doItmSls_ins_func_nm_NE(info);
		else if (ne == columnItmSls_ins_ts) doItmSls_ins_ts_NE(info);
		else if (ne == columnItmSls_upd_usr_id) doItmSls_upd_usr_id_NE(info);
		else if (ne == columnItmSls_upd_usr_nm) doItmSls_upd_usr_nm_NE(info);
		else if (ne == columnItmSls_upd_func_id) doItmSls_upd_func_id_NE(info);
		else if (ne == columnItmSls_upd_func_nm) doItmSls_upd_func_nm_NE(info);
		else if (ne == columnItmSls_upd_ts) doItmSls_upd_ts_NE(info);
		else if (ne == columnItmSls_upd_srv_req_no) doItmSls_upd_srv_req_no_NE(info);
		else if (ne == columnItmFix_calc_ctg_cd) doItmFix_calc_ctg_cd_NE(info);
		else if (ne == columnItmFix_calc_ctg_nm) doItmFix_calc_ctg_nm_NE(info);
		else if (ne == columnItmFix_wg_cd) doItmFix_wg_cd_NE(info);
		else if (ne == columnItmFix_wg_nm) doItmFix_wg_nm_NE(info);
		else if (ne == columnItmFix_expns_cd) doItmFix_expns_cd_NE(info);
		else if (ne == columnItmFix_expns_nm) doItmFix_expns_nm_NE(info);
		else if (ne == columnItmFix_unit_cd) doItmFix_unit_cd_NE(info);
		else if (ne == columnItmFix_unit_nm) doItmFix_unit_nm_NE(info);
		else if (ne == columnItmFix_dec_place) doItmFix_dec_place_NE(info);
		else if (ne == columnItmFix_cur_cd) doItmFix_cur_cd_NE(info);
		else if (ne == columnItmFix_cur_nm) doItmFix_cur_nm_NE(info);
		else if (ne == columnItmFix_std_upri_dec_place) doItmFix_std_upri_dec_place_NE(info);
		else if (ne == columnItmFix_rmrks) doItmFix_rmrks_NE(info);
		else if (ne == columnItmFix_sub_char1) doItmFix_sub_char1_NE(info);
		else if (ne == columnItmFix_sub_char2) doItmFix_sub_char2_NE(info);
		else if (ne == columnItmFix_sub_char3) doItmFix_sub_char3_NE(info);
		else if (ne == columnItmFix_non_calc_flg) doItmFix_non_calc_flg_NE(info);
		else if (ne == columnItmFix_ins_usr_id) doItmFix_ins_usr_id_NE(info);
		else if (ne == columnItmFix_ins_usr_nm) doItmFix_ins_usr_nm_NE(info);
		else if (ne == columnItmFix_ins_func_id) doItmFix_ins_func_id_NE(info);
		else if (ne == columnItmFix_ins_func_nm) doItmFix_ins_func_nm_NE(info);
		else if (ne == columnItmFix_ins_ts) doItmFix_ins_ts_NE(info);
		else if (ne == columnItmFix_upd_usr_id) doItmFix_upd_usr_id_NE(info);
		else if (ne == columnItmFix_upd_usr_nm) doItmFix_upd_usr_nm_NE(info);
		else if (ne == columnItmFix_upd_func_id) doItmFix_upd_func_id_NE(info);
		else if (ne == columnItmFix_upd_func_nm) doItmFix_upd_func_nm_NE(info);
		else if (ne == columnItmFix_upd_ts) doItmFix_upd_ts_NE(info);
		else if (ne == columnItmFix_upd_srv_req_no) doItmFix_upd_srv_req_no_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Bottom]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBottom_NE(MCEventInfo info){
	}

	/**
	 * [Itm]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_is_srch_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_is_srch_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_hrrchy]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_hrrchy_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bottom_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bottom_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unreg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unreg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[non_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_non_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[cost_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_cost_ratio_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[oper_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_oper_ptn_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[exp_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_exp_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[exp_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_exp_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[exp_prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_exp_prio_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val1_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val2_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val3_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val4_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val5_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[non_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_non_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_ptn_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_seq_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[yield_oper_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_yield_oper_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[nmr_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_nmr_qty_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[dnm_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_dnm_qty_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_std_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_std_qty_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_conv_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_conv_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_conv_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_conv_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[non_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_non_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_ptn_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_seq_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[non_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_non_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[cost_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_cost_ratio_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[non_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_non_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[cost_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_cost_ratio_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[non_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_non_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prov_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prov_typ_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prov_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prov_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[non_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_non_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_prio_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val1_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val2_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val3_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val4_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val5_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[non_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_non_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[std_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_std_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[non_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_non_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == BottomTab) doBottom_NX(info);
		else if (nx == ItmTable) doItm_NX(info);
		else if (nx == ItmDtlTable) doItmDtl_NX(info);
		else if (nx == ItmOperTable) doItmOper_NX(info);
		else if (nx == ItmWkTable) doItmWk_NX(info);
		else if (nx == ItmPurcTable) doItmPurc_NX(info);
		else if (nx == ItmProcTable) doItmProc_NX(info);
		else if (nx == ItmProvTable) doItmProv_NX(info);
		else if (nx == ItmSlsTable) doItmSls_NX(info);
		else if (nx == ItmFixTable) doItmFix_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_itm_is_srch_typ) doCnd_itm_is_srch_typ_NX(info);
		else if (nx == Cnd_bom_ptn) doCnd_bom_ptn_NX(info);
		else if (nx == Cnd_par_itm_flg) doCnd_par_itm_flg_NX(info);
		else if (nx == Cnd_chd_itm_flg) doCnd_chd_itm_flg_NX(info);
		else if (nx == Cnd_bom_ptn_flg) doCnd_bom_ptn_flg_NX(info);
		else if (nx == Cnd_max_hrrchy) doCnd_max_hrrchy_NX(info);
		else if (nx == columnDtl_bottom_flg) doDtl_bottom_flg_NX(info);
		else if (nx == columnDtl_unreg_flg) doDtl_unreg_flg_NX(info);
		else if (nx == columnDtl_itm_typ) doDtl_itm_typ_NX(info);
		else if (nx == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NX(info);
		else if (nx == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NX(info);
		else if (nx == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NX(info);
		else if (nx == columnDtl_bom_ptn) doDtl_bom_ptn_NX(info);
		else if (nx == columnDtl_oper_cd) doDtl_oper_cd_NX(info);
		else if (nx == columnDtl_oper_nm) doDtl_oper_nm_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_par_unit_cd) doDtl_par_unit_cd_NX(info);
		else if (nx == columnDtl_par_unit_nm) doDtl_par_unit_nm_NX(info);
		else if (nx == columnDtl_par_dec_place) doDtl_par_dec_place_NX(info);
		else if (nx == columnDtl_chd_unit_cd) doDtl_chd_unit_cd_NX(info);
		else if (nx == columnDtl_chd_unit_nm) doDtl_chd_unit_nm_NX(info);
		else if (nx == columnDtl_chd_dec_place) doDtl_chd_dec_place_NX(info);
		else if (nx == columnDtl_alt_grp_cd) doDtl_alt_grp_cd_NX(info);
		else if (nx == columnDtl_alt_itm_ratio) doDtl_alt_itm_ratio_NX(info);
		else if (nx == columnDtl_expns_cd) doDtl_expns_cd_NX(info);
		else if (nx == columnDtl_expns_nm) doDtl_expns_nm_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_calc_ctg_cd) doDtl_calc_ctg_cd_NX(info);
		else if (nx == columnDtl_calc_ctg_nm) doDtl_calc_ctg_nm_NX(info);
		else if (nx == columnDtl_itm_calc_ctg_cd) doDtl_itm_calc_ctg_cd_NX(info);
		else if (nx == columnDtl_itm_calc_ctg_nm) doDtl_itm_calc_ctg_nm_NX(info);
		else if (nx == columnDtl_dtl_calc_ctg_cd) doDtl_dtl_calc_ctg_cd_NX(info);
		else if (nx == columnDtl_dtl_calc_ctg_nm) doDtl_dtl_calc_ctg_nm_NX(info);
		else if (nx == columnDtl_purc_calc_ctg_cd) doDtl_purc_calc_ctg_cd_NX(info);
		else if (nx == columnDtl_purc_calc_ctg_nm) doDtl_purc_calc_ctg_nm_NX(info);
		else if (nx == columnDtl_proc_calc_ctg_cd) doDtl_proc_calc_ctg_cd_NX(info);
		else if (nx == columnDtl_proc_calc_ctg_nm) doDtl_proc_calc_ctg_nm_NX(info);
		else if (nx == columnDtl_prov_calc_ctg_cd) doDtl_prov_calc_ctg_cd_NX(info);
		else if (nx == columnDtl_prov_calc_ctg_nm) doDtl_prov_calc_ctg_nm_NX(info);
		else if (nx == columnDtl_sls_calc_ctg_cd) doDtl_sls_calc_ctg_cd_NX(info);
		else if (nx == columnDtl_sls_calc_ctg_nm) doDtl_sls_calc_ctg_nm_NX(info);
		else if (nx == columnDtl_fix_calc_ctg_cd) doDtl_fix_calc_ctg_cd_NX(info);
		else if (nx == columnDtl_fix_calc_ctg_nm) doDtl_fix_calc_ctg_nm_NX(info);
		else if (nx == columnItm_calc_ctg_cd) doItm_calc_ctg_cd_NX(info);
		else if (nx == columnItm_calc_ctg_nm) doItm_calc_ctg_nm_NX(info);
		else if (nx == columnItm_wg_cd) doItm_wg_cd_NX(info);
		else if (nx == columnItm_wg_nm) doItm_wg_nm_NX(info);
		else if (nx == columnItm_calc_ptn_cd) doItm_calc_ptn_cd_NX(info);
		else if (nx == columnItm_calc_ptn_nm) doItm_calc_ptn_nm_NX(info);
		else if (nx == columnItm_unit_cd) doItm_unit_cd_NX(info);
		else if (nx == columnItm_unit_nm) doItm_unit_nm_NX(info);
		else if (nx == columnItm_dec_place) doItm_dec_place_NX(info);
		else if (nx == columnItm_rmrks) doItm_rmrks_NX(info);
		else if (nx == columnItm_sub_char1) doItm_sub_char1_NX(info);
		else if (nx == columnItm_sub_char2) doItm_sub_char2_NX(info);
		else if (nx == columnItm_sub_char3) doItm_sub_char3_NX(info);
		else if (nx == columnItm_non_calc_flg) doItm_non_calc_flg_NX(info);
		else if (nx == columnItm_ins_usr_id) doItm_ins_usr_id_NX(info);
		else if (nx == columnItm_ins_usr_nm) doItm_ins_usr_nm_NX(info);
		else if (nx == columnItm_ins_func_id) doItm_ins_func_id_NX(info);
		else if (nx == columnItm_ins_func_nm) doItm_ins_func_nm_NX(info);
		else if (nx == columnItm_ins_ts) doItm_ins_ts_NX(info);
		else if (nx == columnItm_upd_usr_id) doItm_upd_usr_id_NX(info);
		else if (nx == columnItm_upd_usr_nm) doItm_upd_usr_nm_NX(info);
		else if (nx == columnItm_upd_func_id) doItm_upd_func_id_NX(info);
		else if (nx == columnItm_upd_func_nm) doItm_upd_func_nm_NX(info);
		else if (nx == columnItm_upd_ts) doItm_upd_ts_NX(info);
		else if (nx == columnItm_upd_srv_req_no) doItm_upd_srv_req_no_NX(info);
		else if (nx == columnItmDtl_calc_ctg_cd) doItmDtl_calc_ctg_cd_NX(info);
		else if (nx == columnItmDtl_calc_ctg_nm) doItmDtl_calc_ctg_nm_NX(info);
		else if (nx == columnItmDtl_wg_cd) doItmDtl_wg_cd_NX(info);
		else if (nx == columnItmDtl_wg_nm) doItmDtl_wg_nm_NX(info);
		else if (nx == columnItmDtl_loc_cd) doItmDtl_loc_cd_NX(info);
		else if (nx == columnItmDtl_loc_nm) doItmDtl_loc_nm_NX(info);
		else if (nx == columnItmDtl_sppl_cd) doItmDtl_sppl_cd_NX(info);
		else if (nx == columnItmDtl_sppl_nm) doItmDtl_sppl_nm_NX(info);
		else if (nx == columnItmDtl_rqst_wg_cd) doItmDtl_rqst_wg_cd_NX(info);
		else if (nx == columnItmDtl_rqst_wg_nm) doItmDtl_rqst_wg_nm_NX(info);
		else if (nx == columnItmDtl_cost_ratio) doItmDtl_cost_ratio_NX(info);
		else if (nx == columnItmDtl_oper_ptn) doItmDtl_oper_ptn_NX(info);
		else if (nx == columnItmDtl_bom_ptn) doItmDtl_bom_ptn_NX(info);
		else if (nx == columnItmDtl_unit_cd) doItmDtl_unit_cd_NX(info);
		else if (nx == columnItmDtl_unit_nm) doItmDtl_unit_nm_NX(info);
		else if (nx == columnItmDtl_dec_place) doItmDtl_dec_place_NX(info);
		else if (nx == columnItmDtl_alc_dpt_cd) doItmDtl_alc_dpt_cd_NX(info);
		else if (nx == columnItmDtl_alc_dpt_nm) doItmDtl_alc_dpt_nm_NX(info);
		else if (nx == columnItmDtl_exp_dpt_cd) doItmDtl_exp_dpt_cd_NX(info);
		else if (nx == columnItmDtl_exp_dpt_nm) doItmDtl_exp_dpt_nm_NX(info);
		else if (nx == columnItmDtl_exp_prio) doItmDtl_exp_prio_NX(info);
		else if (nx == columnItmDtl_alc_val1) doItmDtl_alc_val1_NX(info);
		else if (nx == columnItmDtl_alc_val2) doItmDtl_alc_val2_NX(info);
		else if (nx == columnItmDtl_alc_val3) doItmDtl_alc_val3_NX(info);
		else if (nx == columnItmDtl_alc_val4) doItmDtl_alc_val4_NX(info);
		else if (nx == columnItmDtl_alc_val5) doItmDtl_alc_val5_NX(info);
		else if (nx == columnItmDtl_rmrks) doItmDtl_rmrks_NX(info);
		else if (nx == columnItmDtl_sub_char1) doItmDtl_sub_char1_NX(info);
		else if (nx == columnItmDtl_sub_char2) doItmDtl_sub_char2_NX(info);
		else if (nx == columnItmDtl_sub_char3) doItmDtl_sub_char3_NX(info);
		else if (nx == columnItmDtl_non_calc_flg) doItmDtl_non_calc_flg_NX(info);
		else if (nx == columnItmDtl_ins_usr_id) doItmDtl_ins_usr_id_NX(info);
		else if (nx == columnItmDtl_ins_usr_nm) doItmDtl_ins_usr_nm_NX(info);
		else if (nx == columnItmDtl_ins_func_id) doItmDtl_ins_func_id_NX(info);
		else if (nx == columnItmDtl_ins_func_nm) doItmDtl_ins_func_nm_NX(info);
		else if (nx == columnItmDtl_ins_ts) doItmDtl_ins_ts_NX(info);
		else if (nx == columnItmDtl_upd_usr_id) doItmDtl_upd_usr_id_NX(info);
		else if (nx == columnItmDtl_upd_usr_nm) doItmDtl_upd_usr_nm_NX(info);
		else if (nx == columnItmDtl_upd_func_id) doItmDtl_upd_func_id_NX(info);
		else if (nx == columnItmDtl_upd_func_nm) doItmDtl_upd_func_nm_NX(info);
		else if (nx == columnItmDtl_upd_ts) doItmDtl_upd_ts_NX(info);
		else if (nx == columnItmDtl_upd_srv_req_no) doItmDtl_upd_srv_req_no_NX(info);
		else if (nx == columnItmOper_calc_ctg_cd) doItmOper_calc_ctg_cd_NX(info);
		else if (nx == columnItmOper_calc_ctg_nm) doItmOper_calc_ctg_nm_NX(info);
		else if (nx == columnItmOper_wg_cd) doItmOper_wg_cd_NX(info);
		else if (nx == columnItmOper_wg_nm) doItmOper_wg_nm_NX(info);
		else if (nx == columnItmOper_loc_cd) doItmOper_loc_cd_NX(info);
		else if (nx == columnItmOper_loc_nm) doItmOper_loc_nm_NX(info);
		else if (nx == columnItmOper_oper_ptn) doItmOper_oper_ptn_NX(info);
		else if (nx == columnItmOper_oper_cd) doItmOper_oper_cd_NX(info);
		else if (nx == columnItmOper_oper_nm) doItmOper_oper_nm_NX(info);
		else if (nx == columnItmOper_oper_seq) doItmOper_oper_seq_NX(info);
		else if (nx == columnItmOper_disp_seq) doItmOper_disp_seq_NX(info);
		else if (nx == columnItmOper_yield_oper_flg) doItmOper_yield_oper_flg_NX(info);
		else if (nx == columnItmOper_nmr_qty) doItmOper_nmr_qty_NX(info);
		else if (nx == columnItmOper_dnm_qty) doItmOper_dnm_qty_NX(info);
		else if (nx == columnItmOper_unit_cd) doItmOper_unit_cd_NX(info);
		else if (nx == columnItmOper_unit_nm) doItmOper_unit_nm_NX(info);
		else if (nx == columnItmOper_oper_unit_cd) doItmOper_oper_unit_cd_NX(info);
		else if (nx == columnItmOper_oper_unit_nm) doItmOper_oper_unit_nm_NX(info);
		else if (nx == columnItmOper_oper_std_qty) doItmOper_oper_std_qty_NX(info);
		else if (nx == columnItmOper_oper_conv_qty) doItmOper_oper_conv_qty_NX(info);
		else if (nx == columnItmOper_dec_place) doItmOper_dec_place_NX(info);
		else if (nx == columnItmOper_unit_conv_rnd_typ) doItmOper_unit_conv_rnd_typ_NX(info);
		else if (nx == columnItmOper_unit_conv_rnd_typ_nm) doItmOper_unit_conv_rnd_typ_nm_NX(info);
		else if (nx == columnItmOper_rmrks) doItmOper_rmrks_NX(info);
		else if (nx == columnItmOper_sub_char1) doItmOper_sub_char1_NX(info);
		else if (nx == columnItmOper_sub_char2) doItmOper_sub_char2_NX(info);
		else if (nx == columnItmOper_sub_char3) doItmOper_sub_char3_NX(info);
		else if (nx == columnItmOper_non_calc_flg) doItmOper_non_calc_flg_NX(info);
		else if (nx == columnItmOper_ins_usr_id) doItmOper_ins_usr_id_NX(info);
		else if (nx == columnItmOper_ins_usr_nm) doItmOper_ins_usr_nm_NX(info);
		else if (nx == columnItmOper_ins_func_id) doItmOper_ins_func_id_NX(info);
		else if (nx == columnItmOper_ins_func_nm) doItmOper_ins_func_nm_NX(info);
		else if (nx == columnItmOper_ins_ts) doItmOper_ins_ts_NX(info);
		else if (nx == columnItmOper_upd_usr_id) doItmOper_upd_usr_id_NX(info);
		else if (nx == columnItmOper_upd_usr_nm) doItmOper_upd_usr_nm_NX(info);
		else if (nx == columnItmOper_upd_func_id) doItmOper_upd_func_id_NX(info);
		else if (nx == columnItmOper_upd_func_nm) doItmOper_upd_func_nm_NX(info);
		else if (nx == columnItmOper_upd_ts) doItmOper_upd_ts_NX(info);
		else if (nx == columnItmOper_upd_srv_req_no) doItmOper_upd_srv_req_no_NX(info);
		else if (nx == columnItmWk_calc_ctg_cd) doItmWk_calc_ctg_cd_NX(info);
		else if (nx == columnItmWk_calc_ctg_nm) doItmWk_calc_ctg_nm_NX(info);
		else if (nx == columnItmWk_wg_cd) doItmWk_wg_cd_NX(info);
		else if (nx == columnItmWk_wg_nm) doItmWk_wg_nm_NX(info);
		else if (nx == columnItmWk_loc_cd) doItmWk_loc_cd_NX(info);
		else if (nx == columnItmWk_loc_nm) doItmWk_loc_nm_NX(info);
		else if (nx == columnItmWk_oper_ptn) doItmWk_oper_ptn_NX(info);
		else if (nx == columnItmWk_oper_cd) doItmWk_oper_cd_NX(info);
		else if (nx == columnItmWk_oper_nm) doItmWk_oper_nm_NX(info);
		else if (nx == columnItmWk_oper_seq) doItmWk_oper_seq_NX(info);
		else if (nx == columnItmWk_wk_cost_cd) doItmWk_wk_cost_cd_NX(info);
		else if (nx == columnItmWk_wk_cost_nm) doItmWk_wk_cost_nm_NX(info);
		else if (nx == columnItmWk_unit_cd) doItmWk_unit_cd_NX(info);
		else if (nx == columnItmWk_unit_nm) doItmWk_unit_nm_NX(info);
		else if (nx == columnItmWk_dec_place) doItmWk_dec_place_NX(info);
		else if (nx == columnItmWk_wk_cost_unit_nm) doItmWk_wk_cost_unit_nm_NX(info);
		else if (nx == columnItmWk_wk_cost_dec_place) doItmWk_wk_cost_dec_place_NX(info);
		else if (nx == columnItmWk_rmrks) doItmWk_rmrks_NX(info);
		else if (nx == columnItmWk_sub_char1) doItmWk_sub_char1_NX(info);
		else if (nx == columnItmWk_sub_char2) doItmWk_sub_char2_NX(info);
		else if (nx == columnItmWk_sub_char3) doItmWk_sub_char3_NX(info);
		else if (nx == columnItmWk_non_calc_flg) doItmWk_non_calc_flg_NX(info);
		else if (nx == columnItmWk_ins_usr_id) doItmWk_ins_usr_id_NX(info);
		else if (nx == columnItmWk_ins_usr_nm) doItmWk_ins_usr_nm_NX(info);
		else if (nx == columnItmWk_ins_func_id) doItmWk_ins_func_id_NX(info);
		else if (nx == columnItmWk_ins_func_nm) doItmWk_ins_func_nm_NX(info);
		else if (nx == columnItmWk_ins_ts) doItmWk_ins_ts_NX(info);
		else if (nx == columnItmWk_upd_usr_id) doItmWk_upd_usr_id_NX(info);
		else if (nx == columnItmWk_upd_usr_nm) doItmWk_upd_usr_nm_NX(info);
		else if (nx == columnItmWk_upd_func_id) doItmWk_upd_func_id_NX(info);
		else if (nx == columnItmWk_upd_func_nm) doItmWk_upd_func_nm_NX(info);
		else if (nx == columnItmWk_upd_ts) doItmWk_upd_ts_NX(info);
		else if (nx == columnItmWk_upd_srv_req_no) doItmWk_upd_srv_req_no_NX(info);
		else if (nx == columnItmPurc_calc_ctg_cd) doItmPurc_calc_ctg_cd_NX(info);
		else if (nx == columnItmPurc_calc_ctg_nm) doItmPurc_calc_ctg_nm_NX(info);
		else if (nx == columnItmPurc_wg_cd) doItmPurc_wg_cd_NX(info);
		else if (nx == columnItmPurc_wg_nm) doItmPurc_wg_nm_NX(info);
		else if (nx == columnItmPurc_sppl_cd) doItmPurc_sppl_cd_NX(info);
		else if (nx == columnItmPurc_sppl_nm) doItmPurc_sppl_nm_NX(info);
		else if (nx == columnItmPurc_unit_cd) doItmPurc_unit_cd_NX(info);
		else if (nx == columnItmPurc_unit_nm) doItmPurc_unit_nm_NX(info);
		else if (nx == columnItmPurc_dec_place) doItmPurc_dec_place_NX(info);
		else if (nx == columnItmPurc_cur_cd) doItmPurc_cur_cd_NX(info);
		else if (nx == columnItmPurc_cur_nm) doItmPurc_cur_nm_NX(info);
		else if (nx == columnItmPurc_upri_dec_place) doItmPurc_upri_dec_place_NX(info);
		else if (nx == columnItmPurc_cost_ratio) doItmPurc_cost_ratio_NX(info);
		else if (nx == columnItmPurc_rmrks) doItmPurc_rmrks_NX(info);
		else if (nx == columnItmPurc_sub_char1) doItmPurc_sub_char1_NX(info);
		else if (nx == columnItmPurc_sub_char2) doItmPurc_sub_char2_NX(info);
		else if (nx == columnItmPurc_sub_char3) doItmPurc_sub_char3_NX(info);
		else if (nx == columnItmPurc_non_calc_flg) doItmPurc_non_calc_flg_NX(info);
		else if (nx == columnItmPurc_ins_usr_id) doItmPurc_ins_usr_id_NX(info);
		else if (nx == columnItmPurc_ins_usr_nm) doItmPurc_ins_usr_nm_NX(info);
		else if (nx == columnItmPurc_ins_func_id) doItmPurc_ins_func_id_NX(info);
		else if (nx == columnItmPurc_ins_func_nm) doItmPurc_ins_func_nm_NX(info);
		else if (nx == columnItmPurc_ins_ts) doItmPurc_ins_ts_NX(info);
		else if (nx == columnItmPurc_upd_usr_id) doItmPurc_upd_usr_id_NX(info);
		else if (nx == columnItmPurc_upd_usr_nm) doItmPurc_upd_usr_nm_NX(info);
		else if (nx == columnItmPurc_upd_func_id) doItmPurc_upd_func_id_NX(info);
		else if (nx == columnItmPurc_upd_func_nm) doItmPurc_upd_func_nm_NX(info);
		else if (nx == columnItmPurc_upd_ts) doItmPurc_upd_ts_NX(info);
		else if (nx == columnItmPurc_upd_srv_req_no) doItmPurc_upd_srv_req_no_NX(info);
		else if (nx == columnItmProc_calc_ctg_cd) doItmProc_calc_ctg_cd_NX(info);
		else if (nx == columnItmProc_calc_ctg_nm) doItmProc_calc_ctg_nm_NX(info);
		else if (nx == columnItmProc_wg_cd) doItmProc_wg_cd_NX(info);
		else if (nx == columnItmProc_wg_nm) doItmProc_wg_nm_NX(info);
		else if (nx == columnItmProc_sppl_cd) doItmProc_sppl_cd_NX(info);
		else if (nx == columnItmProc_sppl_nm) doItmProc_sppl_nm_NX(info);
		else if (nx == columnItmProc_unit_cd) doItmProc_unit_cd_NX(info);
		else if (nx == columnItmProc_unit_nm) doItmProc_unit_nm_NX(info);
		else if (nx == columnItmProc_dec_place) doItmProc_dec_place_NX(info);
		else if (nx == columnItmProc_cur_cd) doItmProc_cur_cd_NX(info);
		else if (nx == columnItmProc_cur_nm) doItmProc_cur_nm_NX(info);
		else if (nx == columnItmProc_upri_dec_place) doItmProc_upri_dec_place_NX(info);
		else if (nx == columnItmProc_cost_ratio) doItmProc_cost_ratio_NX(info);
		else if (nx == columnItmProc_rmrks) doItmProc_rmrks_NX(info);
		else if (nx == columnItmProc_sub_char1) doItmProc_sub_char1_NX(info);
		else if (nx == columnItmProc_sub_char2) doItmProc_sub_char2_NX(info);
		else if (nx == columnItmProc_sub_char3) doItmProc_sub_char3_NX(info);
		else if (nx == columnItmProc_non_calc_flg) doItmProc_non_calc_flg_NX(info);
		else if (nx == columnItmProc_ins_usr_id) doItmProc_ins_usr_id_NX(info);
		else if (nx == columnItmProc_ins_usr_nm) doItmProc_ins_usr_nm_NX(info);
		else if (nx == columnItmProc_ins_func_id) doItmProc_ins_func_id_NX(info);
		else if (nx == columnItmProc_ins_func_nm) doItmProc_ins_func_nm_NX(info);
		else if (nx == columnItmProc_ins_ts) doItmProc_ins_ts_NX(info);
		else if (nx == columnItmProc_upd_usr_id) doItmProc_upd_usr_id_NX(info);
		else if (nx == columnItmProc_upd_usr_nm) doItmProc_upd_usr_nm_NX(info);
		else if (nx == columnItmProc_upd_func_id) doItmProc_upd_func_id_NX(info);
		else if (nx == columnItmProc_upd_func_nm) doItmProc_upd_func_nm_NX(info);
		else if (nx == columnItmProc_upd_ts) doItmProc_upd_ts_NX(info);
		else if (nx == columnItmProc_upd_srv_req_no) doItmProc_upd_srv_req_no_NX(info);
		else if (nx == columnItmProv_calc_ctg_cd) doItmProv_calc_ctg_cd_NX(info);
		else if (nx == columnItmProv_calc_ctg_nm) doItmProv_calc_ctg_nm_NX(info);
		else if (nx == columnItmProv_wg_cd) doItmProv_wg_cd_NX(info);
		else if (nx == columnItmProv_wg_nm) doItmProv_wg_nm_NX(info);
		else if (nx == columnItmProv_prsppl_cd) doItmProv_prsppl_cd_NX(info);
		else if (nx == columnItmProv_prsppl_nm) doItmProv_prsppl_nm_NX(info);
		else if (nx == columnItmProv_prov_typ) doItmProv_prov_typ_NX(info);
		else if (nx == columnItmProv_prov_typ_nm) doItmProv_prov_typ_nm_NX(info);
		else if (nx == columnItmProv_unit_cd) doItmProv_unit_cd_NX(info);
		else if (nx == columnItmProv_unit_nm) doItmProv_unit_nm_NX(info);
		else if (nx == columnItmProv_dec_place) doItmProv_dec_place_NX(info);
		else if (nx == columnItmProv_cur_cd) doItmProv_cur_cd_NX(info);
		else if (nx == columnItmProv_cur_nm) doItmProv_cur_nm_NX(info);
		else if (nx == columnItmProv_upri_dec_place) doItmProv_upri_dec_place_NX(info);
		else if (nx == columnItmProv_rmrks) doItmProv_rmrks_NX(info);
		else if (nx == columnItmProv_sub_char1) doItmProv_sub_char1_NX(info);
		else if (nx == columnItmProv_sub_char2) doItmProv_sub_char2_NX(info);
		else if (nx == columnItmProv_sub_char3) doItmProv_sub_char3_NX(info);
		else if (nx == columnItmProv_non_calc_flg) doItmProv_non_calc_flg_NX(info);
		else if (nx == columnItmProv_ins_usr_id) doItmProv_ins_usr_id_NX(info);
		else if (nx == columnItmProv_ins_usr_nm) doItmProv_ins_usr_nm_NX(info);
		else if (nx == columnItmProv_ins_func_id) doItmProv_ins_func_id_NX(info);
		else if (nx == columnItmProv_ins_func_nm) doItmProv_ins_func_nm_NX(info);
		else if (nx == columnItmProv_ins_ts) doItmProv_ins_ts_NX(info);
		else if (nx == columnItmProv_upd_usr_id) doItmProv_upd_usr_id_NX(info);
		else if (nx == columnItmProv_upd_usr_nm) doItmProv_upd_usr_nm_NX(info);
		else if (nx == columnItmProv_upd_func_id) doItmProv_upd_func_id_NX(info);
		else if (nx == columnItmProv_upd_func_nm) doItmProv_upd_func_nm_NX(info);
		else if (nx == columnItmProv_upd_ts) doItmProv_upd_ts_NX(info);
		else if (nx == columnItmProv_upd_srv_req_no) doItmProv_upd_srv_req_no_NX(info);
		else if (nx == columnItmSls_calc_ctg_cd) doItmSls_calc_ctg_cd_NX(info);
		else if (nx == columnItmSls_calc_ctg_nm) doItmSls_calc_ctg_nm_NX(info);
		else if (nx == columnItmSls_wg_cd) doItmSls_wg_cd_NX(info);
		else if (nx == columnItmSls_wg_nm) doItmSls_wg_nm_NX(info);
		else if (nx == columnItmSls_dpt_cd) doItmSls_dpt_cd_NX(info);
		else if (nx == columnItmSls_dpt_nm) doItmSls_dpt_nm_NX(info);
		else if (nx == columnItmSls_cst_cd) doItmSls_cst_cd_NX(info);
		else if (nx == columnItmSls_cst_nm) doItmSls_cst_nm_NX(info);
		else if (nx == columnItmSls_dlv_cd) doItmSls_dlv_cd_NX(info);
		else if (nx == columnItmSls_dlv_nm) doItmSls_dlv_nm_NX(info);
		else if (nx == columnItmSls_dest_cd1) doItmSls_dest_cd1_NX(info);
		else if (nx == columnItmSls_dest_nm1) doItmSls_dest_nm1_NX(info);
		else if (nx == columnItmSls_dest_cd2) doItmSls_dest_cd2_NX(info);
		else if (nx == columnItmSls_dest_nm2) doItmSls_dest_nm2_NX(info);
		else if (nx == columnItmSls_dest_cd3) doItmSls_dest_cd3_NX(info);
		else if (nx == columnItmSls_dest_nm3) doItmSls_dest_nm3_NX(info);
		else if (nx == columnItmSls_unit_cd) doItmSls_unit_cd_NX(info);
		else if (nx == columnItmSls_unit_nm) doItmSls_unit_nm_NX(info);
		else if (nx == columnItmSls_dec_place) doItmSls_dec_place_NX(info);
		else if (nx == columnItmSls_cur_cd) doItmSls_cur_cd_NX(info);
		else if (nx == columnItmSls_cur_nm) doItmSls_cur_nm_NX(info);
		else if (nx == columnItmSls_upri_dec_place) doItmSls_upri_dec_place_NX(info);
		else if (nx == columnItmSls_prio) doItmSls_prio_NX(info);
		else if (nx == columnItmSls_alc_val1) doItmSls_alc_val1_NX(info);
		else if (nx == columnItmSls_alc_val2) doItmSls_alc_val2_NX(info);
		else if (nx == columnItmSls_alc_val3) doItmSls_alc_val3_NX(info);
		else if (nx == columnItmSls_alc_val4) doItmSls_alc_val4_NX(info);
		else if (nx == columnItmSls_alc_val5) doItmSls_alc_val5_NX(info);
		else if (nx == columnItmSls_rmrks) doItmSls_rmrks_NX(info);
		else if (nx == columnItmSls_sub_char1) doItmSls_sub_char1_NX(info);
		else if (nx == columnItmSls_sub_char2) doItmSls_sub_char2_NX(info);
		else if (nx == columnItmSls_sub_char3) doItmSls_sub_char3_NX(info);
		else if (nx == columnItmSls_non_calc_flg) doItmSls_non_calc_flg_NX(info);
		else if (nx == columnItmSls_ins_usr_id) doItmSls_ins_usr_id_NX(info);
		else if (nx == columnItmSls_ins_usr_nm) doItmSls_ins_usr_nm_NX(info);
		else if (nx == columnItmSls_ins_func_id) doItmSls_ins_func_id_NX(info);
		else if (nx == columnItmSls_ins_func_nm) doItmSls_ins_func_nm_NX(info);
		else if (nx == columnItmSls_ins_ts) doItmSls_ins_ts_NX(info);
		else if (nx == columnItmSls_upd_usr_id) doItmSls_upd_usr_id_NX(info);
		else if (nx == columnItmSls_upd_usr_nm) doItmSls_upd_usr_nm_NX(info);
		else if (nx == columnItmSls_upd_func_id) doItmSls_upd_func_id_NX(info);
		else if (nx == columnItmSls_upd_func_nm) doItmSls_upd_func_nm_NX(info);
		else if (nx == columnItmSls_upd_ts) doItmSls_upd_ts_NX(info);
		else if (nx == columnItmSls_upd_srv_req_no) doItmSls_upd_srv_req_no_NX(info);
		else if (nx == columnItmFix_calc_ctg_cd) doItmFix_calc_ctg_cd_NX(info);
		else if (nx == columnItmFix_calc_ctg_nm) doItmFix_calc_ctg_nm_NX(info);
		else if (nx == columnItmFix_wg_cd) doItmFix_wg_cd_NX(info);
		else if (nx == columnItmFix_wg_nm) doItmFix_wg_nm_NX(info);
		else if (nx == columnItmFix_expns_cd) doItmFix_expns_cd_NX(info);
		else if (nx == columnItmFix_expns_nm) doItmFix_expns_nm_NX(info);
		else if (nx == columnItmFix_unit_cd) doItmFix_unit_cd_NX(info);
		else if (nx == columnItmFix_unit_nm) doItmFix_unit_nm_NX(info);
		else if (nx == columnItmFix_dec_place) doItmFix_dec_place_NX(info);
		else if (nx == columnItmFix_cur_cd) doItmFix_cur_cd_NX(info);
		else if (nx == columnItmFix_cur_nm) doItmFix_cur_nm_NX(info);
		else if (nx == columnItmFix_std_upri_dec_place) doItmFix_std_upri_dec_place_NX(info);
		else if (nx == columnItmFix_rmrks) doItmFix_rmrks_NX(info);
		else if (nx == columnItmFix_sub_char1) doItmFix_sub_char1_NX(info);
		else if (nx == columnItmFix_sub_char2) doItmFix_sub_char2_NX(info);
		else if (nx == columnItmFix_sub_char3) doItmFix_sub_char3_NX(info);
		else if (nx == columnItmFix_non_calc_flg) doItmFix_non_calc_flg_NX(info);
		else if (nx == columnItmFix_ins_usr_id) doItmFix_ins_usr_id_NX(info);
		else if (nx == columnItmFix_ins_usr_nm) doItmFix_ins_usr_nm_NX(info);
		else if (nx == columnItmFix_ins_func_id) doItmFix_ins_func_id_NX(info);
		else if (nx == columnItmFix_ins_func_nm) doItmFix_ins_func_nm_NX(info);
		else if (nx == columnItmFix_ins_ts) doItmFix_ins_ts_NX(info);
		else if (nx == columnItmFix_upd_usr_id) doItmFix_upd_usr_id_NX(info);
		else if (nx == columnItmFix_upd_usr_nm) doItmFix_upd_usr_nm_NX(info);
		else if (nx == columnItmFix_upd_func_id) doItmFix_upd_func_id_NX(info);
		else if (nx == columnItmFix_upd_func_nm) doItmFix_upd_func_nm_NX(info);
		else if (nx == columnItmFix_upd_ts) doItmFix_upd_ts_NX(info);
		else if (nx == columnItmFix_upd_srv_req_no) doItmFix_upd_srv_req_no_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Bottom]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBottom_NX(MCEventInfo info){
	}

	/**
	 * [Itm]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_is_srch_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_is_srch_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_hrrchy]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_hrrchy_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bottom_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bottom_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unreg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unreg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[non_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_non_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[cost_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_cost_ratio_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[oper_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_oper_ptn_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[exp_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_exp_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[exp_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_exp_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[exp_prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_exp_prio_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val1_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val2_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val3_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val4_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val5_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[non_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_non_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_ptn_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_seq_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[yield_oper_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_yield_oper_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[nmr_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_nmr_qty_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[dnm_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_dnm_qty_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_std_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_std_qty_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_conv_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_conv_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_conv_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_conv_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[non_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_non_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_ptn_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_seq_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[non_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_non_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[cost_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_cost_ratio_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[non_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_non_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[cost_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_cost_ratio_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[non_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_non_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prov_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prov_typ_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prov_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prov_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[non_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_non_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_prio_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val1_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val2_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val3_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val4_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val5_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[non_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_non_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[std_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_std_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[non_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_non_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_srv_req_no_NX(MCEventInfo info){
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
		else if (lc == Cnd_itm_is_srch_typ) doCnd_itm_is_srch_typ_LC(info);
		else if (lc == Cnd_bom_ptn) doCnd_bom_ptn_LC(info);
		else if (lc == Cnd_max_hrrchy) doCnd_max_hrrchy_LC(info);
		else if (lc == columnDtl_itm_typ) doDtl_itm_typ_LC(info);
		else if (lc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_LC(info);
		else if (lc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_LC(info);
		else if (lc == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_LC(info);
		else if (lc == columnDtl_bom_ptn) doDtl_bom_ptn_LC(info);
		else if (lc == columnDtl_oper_cd) doDtl_oper_cd_LC(info);
		else if (lc == columnDtl_oper_nm) doDtl_oper_nm_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_par_unit_cd) doDtl_par_unit_cd_LC(info);
		else if (lc == columnDtl_par_unit_nm) doDtl_par_unit_nm_LC(info);
		else if (lc == columnDtl_par_dec_place) doDtl_par_dec_place_LC(info);
		else if (lc == columnDtl_chd_unit_cd) doDtl_chd_unit_cd_LC(info);
		else if (lc == columnDtl_chd_unit_nm) doDtl_chd_unit_nm_LC(info);
		else if (lc == columnDtl_chd_dec_place) doDtl_chd_dec_place_LC(info);
		else if (lc == columnDtl_alt_grp_cd) doDtl_alt_grp_cd_LC(info);
		else if (lc == columnDtl_alt_itm_ratio) doDtl_alt_itm_ratio_LC(info);
		else if (lc == columnDtl_expns_cd) doDtl_expns_cd_LC(info);
		else if (lc == columnDtl_expns_nm) doDtl_expns_nm_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_calc_ctg_cd) doDtl_calc_ctg_cd_LC(info);
		else if (lc == columnDtl_calc_ctg_nm) doDtl_calc_ctg_nm_LC(info);
		else if (lc == columnDtl_itm_calc_ctg_cd) doDtl_itm_calc_ctg_cd_LC(info);
		else if (lc == columnDtl_itm_calc_ctg_nm) doDtl_itm_calc_ctg_nm_LC(info);
		else if (lc == columnDtl_dtl_calc_ctg_cd) doDtl_dtl_calc_ctg_cd_LC(info);
		else if (lc == columnDtl_dtl_calc_ctg_nm) doDtl_dtl_calc_ctg_nm_LC(info);
		else if (lc == columnDtl_purc_calc_ctg_cd) doDtl_purc_calc_ctg_cd_LC(info);
		else if (lc == columnDtl_purc_calc_ctg_nm) doDtl_purc_calc_ctg_nm_LC(info);
		else if (lc == columnDtl_proc_calc_ctg_cd) doDtl_proc_calc_ctg_cd_LC(info);
		else if (lc == columnDtl_proc_calc_ctg_nm) doDtl_proc_calc_ctg_nm_LC(info);
		else if (lc == columnDtl_prov_calc_ctg_cd) doDtl_prov_calc_ctg_cd_LC(info);
		else if (lc == columnDtl_prov_calc_ctg_nm) doDtl_prov_calc_ctg_nm_LC(info);
		else if (lc == columnDtl_sls_calc_ctg_cd) doDtl_sls_calc_ctg_cd_LC(info);
		else if (lc == columnDtl_sls_calc_ctg_nm) doDtl_sls_calc_ctg_nm_LC(info);
		else if (lc == columnDtl_fix_calc_ctg_cd) doDtl_fix_calc_ctg_cd_LC(info);
		else if (lc == columnDtl_fix_calc_ctg_nm) doDtl_fix_calc_ctg_nm_LC(info);
		else if (lc == columnItm_calc_ctg_cd) doItm_calc_ctg_cd_LC(info);
		else if (lc == columnItm_calc_ctg_nm) doItm_calc_ctg_nm_LC(info);
		else if (lc == columnItm_wg_cd) doItm_wg_cd_LC(info);
		else if (lc == columnItm_wg_nm) doItm_wg_nm_LC(info);
		else if (lc == columnItm_calc_ptn_cd) doItm_calc_ptn_cd_LC(info);
		else if (lc == columnItm_calc_ptn_nm) doItm_calc_ptn_nm_LC(info);
		else if (lc == columnItm_unit_cd) doItm_unit_cd_LC(info);
		else if (lc == columnItm_unit_nm) doItm_unit_nm_LC(info);
		else if (lc == columnItm_dec_place) doItm_dec_place_LC(info);
		else if (lc == columnItm_rmrks) doItm_rmrks_LC(info);
		else if (lc == columnItm_sub_char1) doItm_sub_char1_LC(info);
		else if (lc == columnItm_sub_char2) doItm_sub_char2_LC(info);
		else if (lc == columnItm_sub_char3) doItm_sub_char3_LC(info);
		else if (lc == columnItm_ins_usr_id) doItm_ins_usr_id_LC(info);
		else if (lc == columnItm_ins_usr_nm) doItm_ins_usr_nm_LC(info);
		else if (lc == columnItm_ins_func_id) doItm_ins_func_id_LC(info);
		else if (lc == columnItm_ins_func_nm) doItm_ins_func_nm_LC(info);
		else if (lc == columnItm_ins_ts) doItm_ins_ts_LC(info);
		else if (lc == columnItm_upd_usr_id) doItm_upd_usr_id_LC(info);
		else if (lc == columnItm_upd_usr_nm) doItm_upd_usr_nm_LC(info);
		else if (lc == columnItm_upd_func_id) doItm_upd_func_id_LC(info);
		else if (lc == columnItm_upd_func_nm) doItm_upd_func_nm_LC(info);
		else if (lc == columnItm_upd_ts) doItm_upd_ts_LC(info);
		else if (lc == columnItm_upd_srv_req_no) doItm_upd_srv_req_no_LC(info);
		else if (lc == columnItmDtl_calc_ctg_cd) doItmDtl_calc_ctg_cd_LC(info);
		else if (lc == columnItmDtl_calc_ctg_nm) doItmDtl_calc_ctg_nm_LC(info);
		else if (lc == columnItmDtl_wg_cd) doItmDtl_wg_cd_LC(info);
		else if (lc == columnItmDtl_wg_nm) doItmDtl_wg_nm_LC(info);
		else if (lc == columnItmDtl_loc_cd) doItmDtl_loc_cd_LC(info);
		else if (lc == columnItmDtl_loc_nm) doItmDtl_loc_nm_LC(info);
		else if (lc == columnItmDtl_sppl_cd) doItmDtl_sppl_cd_LC(info);
		else if (lc == columnItmDtl_sppl_nm) doItmDtl_sppl_nm_LC(info);
		else if (lc == columnItmDtl_rqst_wg_cd) doItmDtl_rqst_wg_cd_LC(info);
		else if (lc == columnItmDtl_rqst_wg_nm) doItmDtl_rqst_wg_nm_LC(info);
		else if (lc == columnItmDtl_cost_ratio) doItmDtl_cost_ratio_LC(info);
		else if (lc == columnItmDtl_oper_ptn) doItmDtl_oper_ptn_LC(info);
		else if (lc == columnItmDtl_bom_ptn) doItmDtl_bom_ptn_LC(info);
		else if (lc == columnItmDtl_unit_cd) doItmDtl_unit_cd_LC(info);
		else if (lc == columnItmDtl_unit_nm) doItmDtl_unit_nm_LC(info);
		else if (lc == columnItmDtl_dec_place) doItmDtl_dec_place_LC(info);
		else if (lc == columnItmDtl_alc_dpt_cd) doItmDtl_alc_dpt_cd_LC(info);
		else if (lc == columnItmDtl_alc_dpt_nm) doItmDtl_alc_dpt_nm_LC(info);
		else if (lc == columnItmDtl_exp_dpt_cd) doItmDtl_exp_dpt_cd_LC(info);
		else if (lc == columnItmDtl_exp_dpt_nm) doItmDtl_exp_dpt_nm_LC(info);
		else if (lc == columnItmDtl_exp_prio) doItmDtl_exp_prio_LC(info);
		else if (lc == columnItmDtl_alc_val1) doItmDtl_alc_val1_LC(info);
		else if (lc == columnItmDtl_alc_val2) doItmDtl_alc_val2_LC(info);
		else if (lc == columnItmDtl_alc_val3) doItmDtl_alc_val3_LC(info);
		else if (lc == columnItmDtl_alc_val4) doItmDtl_alc_val4_LC(info);
		else if (lc == columnItmDtl_alc_val5) doItmDtl_alc_val5_LC(info);
		else if (lc == columnItmDtl_rmrks) doItmDtl_rmrks_LC(info);
		else if (lc == columnItmDtl_sub_char1) doItmDtl_sub_char1_LC(info);
		else if (lc == columnItmDtl_sub_char2) doItmDtl_sub_char2_LC(info);
		else if (lc == columnItmDtl_sub_char3) doItmDtl_sub_char3_LC(info);
		else if (lc == columnItmDtl_ins_usr_id) doItmDtl_ins_usr_id_LC(info);
		else if (lc == columnItmDtl_ins_usr_nm) doItmDtl_ins_usr_nm_LC(info);
		else if (lc == columnItmDtl_ins_func_id) doItmDtl_ins_func_id_LC(info);
		else if (lc == columnItmDtl_ins_func_nm) doItmDtl_ins_func_nm_LC(info);
		else if (lc == columnItmDtl_ins_ts) doItmDtl_ins_ts_LC(info);
		else if (lc == columnItmDtl_upd_usr_id) doItmDtl_upd_usr_id_LC(info);
		else if (lc == columnItmDtl_upd_usr_nm) doItmDtl_upd_usr_nm_LC(info);
		else if (lc == columnItmDtl_upd_func_id) doItmDtl_upd_func_id_LC(info);
		else if (lc == columnItmDtl_upd_func_nm) doItmDtl_upd_func_nm_LC(info);
		else if (lc == columnItmDtl_upd_ts) doItmDtl_upd_ts_LC(info);
		else if (lc == columnItmDtl_upd_srv_req_no) doItmDtl_upd_srv_req_no_LC(info);
		else if (lc == columnItmOper_calc_ctg_cd) doItmOper_calc_ctg_cd_LC(info);
		else if (lc == columnItmOper_calc_ctg_nm) doItmOper_calc_ctg_nm_LC(info);
		else if (lc == columnItmOper_wg_cd) doItmOper_wg_cd_LC(info);
		else if (lc == columnItmOper_wg_nm) doItmOper_wg_nm_LC(info);
		else if (lc == columnItmOper_loc_cd) doItmOper_loc_cd_LC(info);
		else if (lc == columnItmOper_loc_nm) doItmOper_loc_nm_LC(info);
		else if (lc == columnItmOper_oper_ptn) doItmOper_oper_ptn_LC(info);
		else if (lc == columnItmOper_oper_cd) doItmOper_oper_cd_LC(info);
		else if (lc == columnItmOper_oper_nm) doItmOper_oper_nm_LC(info);
		else if (lc == columnItmOper_oper_seq) doItmOper_oper_seq_LC(info);
		else if (lc == columnItmOper_disp_seq) doItmOper_disp_seq_LC(info);
		else if (lc == columnItmOper_nmr_qty) doItmOper_nmr_qty_LC(info);
		else if (lc == columnItmOper_dnm_qty) doItmOper_dnm_qty_LC(info);
		else if (lc == columnItmOper_unit_cd) doItmOper_unit_cd_LC(info);
		else if (lc == columnItmOper_unit_nm) doItmOper_unit_nm_LC(info);
		else if (lc == columnItmOper_oper_unit_cd) doItmOper_oper_unit_cd_LC(info);
		else if (lc == columnItmOper_oper_unit_nm) doItmOper_oper_unit_nm_LC(info);
		else if (lc == columnItmOper_oper_std_qty) doItmOper_oper_std_qty_LC(info);
		else if (lc == columnItmOper_oper_conv_qty) doItmOper_oper_conv_qty_LC(info);
		else if (lc == columnItmOper_dec_place) doItmOper_dec_place_LC(info);
		else if (lc == columnItmOper_unit_conv_rnd_typ) doItmOper_unit_conv_rnd_typ_LC(info);
		else if (lc == columnItmOper_unit_conv_rnd_typ_nm) doItmOper_unit_conv_rnd_typ_nm_LC(info);
		else if (lc == columnItmOper_rmrks) doItmOper_rmrks_LC(info);
		else if (lc == columnItmOper_sub_char1) doItmOper_sub_char1_LC(info);
		else if (lc == columnItmOper_sub_char2) doItmOper_sub_char2_LC(info);
		else if (lc == columnItmOper_sub_char3) doItmOper_sub_char3_LC(info);
		else if (lc == columnItmOper_ins_usr_id) doItmOper_ins_usr_id_LC(info);
		else if (lc == columnItmOper_ins_usr_nm) doItmOper_ins_usr_nm_LC(info);
		else if (lc == columnItmOper_ins_func_id) doItmOper_ins_func_id_LC(info);
		else if (lc == columnItmOper_ins_func_nm) doItmOper_ins_func_nm_LC(info);
		else if (lc == columnItmOper_ins_ts) doItmOper_ins_ts_LC(info);
		else if (lc == columnItmOper_upd_usr_id) doItmOper_upd_usr_id_LC(info);
		else if (lc == columnItmOper_upd_usr_nm) doItmOper_upd_usr_nm_LC(info);
		else if (lc == columnItmOper_upd_func_id) doItmOper_upd_func_id_LC(info);
		else if (lc == columnItmOper_upd_func_nm) doItmOper_upd_func_nm_LC(info);
		else if (lc == columnItmOper_upd_ts) doItmOper_upd_ts_LC(info);
		else if (lc == columnItmOper_upd_srv_req_no) doItmOper_upd_srv_req_no_LC(info);
		else if (lc == columnItmWk_calc_ctg_cd) doItmWk_calc_ctg_cd_LC(info);
		else if (lc == columnItmWk_calc_ctg_nm) doItmWk_calc_ctg_nm_LC(info);
		else if (lc == columnItmWk_wg_cd) doItmWk_wg_cd_LC(info);
		else if (lc == columnItmWk_wg_nm) doItmWk_wg_nm_LC(info);
		else if (lc == columnItmWk_loc_cd) doItmWk_loc_cd_LC(info);
		else if (lc == columnItmWk_loc_nm) doItmWk_loc_nm_LC(info);
		else if (lc == columnItmWk_oper_ptn) doItmWk_oper_ptn_LC(info);
		else if (lc == columnItmWk_oper_cd) doItmWk_oper_cd_LC(info);
		else if (lc == columnItmWk_oper_nm) doItmWk_oper_nm_LC(info);
		else if (lc == columnItmWk_oper_seq) doItmWk_oper_seq_LC(info);
		else if (lc == columnItmWk_wk_cost_cd) doItmWk_wk_cost_cd_LC(info);
		else if (lc == columnItmWk_wk_cost_nm) doItmWk_wk_cost_nm_LC(info);
		else if (lc == columnItmWk_unit_cd) doItmWk_unit_cd_LC(info);
		else if (lc == columnItmWk_unit_nm) doItmWk_unit_nm_LC(info);
		else if (lc == columnItmWk_dec_place) doItmWk_dec_place_LC(info);
		else if (lc == columnItmWk_wk_cost_unit_nm) doItmWk_wk_cost_unit_nm_LC(info);
		else if (lc == columnItmWk_wk_cost_dec_place) doItmWk_wk_cost_dec_place_LC(info);
		else if (lc == columnItmWk_rmrks) doItmWk_rmrks_LC(info);
		else if (lc == columnItmWk_sub_char1) doItmWk_sub_char1_LC(info);
		else if (lc == columnItmWk_sub_char2) doItmWk_sub_char2_LC(info);
		else if (lc == columnItmWk_sub_char3) doItmWk_sub_char3_LC(info);
		else if (lc == columnItmWk_ins_usr_id) doItmWk_ins_usr_id_LC(info);
		else if (lc == columnItmWk_ins_usr_nm) doItmWk_ins_usr_nm_LC(info);
		else if (lc == columnItmWk_ins_func_id) doItmWk_ins_func_id_LC(info);
		else if (lc == columnItmWk_ins_func_nm) doItmWk_ins_func_nm_LC(info);
		else if (lc == columnItmWk_ins_ts) doItmWk_ins_ts_LC(info);
		else if (lc == columnItmWk_upd_usr_id) doItmWk_upd_usr_id_LC(info);
		else if (lc == columnItmWk_upd_usr_nm) doItmWk_upd_usr_nm_LC(info);
		else if (lc == columnItmWk_upd_func_id) doItmWk_upd_func_id_LC(info);
		else if (lc == columnItmWk_upd_func_nm) doItmWk_upd_func_nm_LC(info);
		else if (lc == columnItmWk_upd_ts) doItmWk_upd_ts_LC(info);
		else if (lc == columnItmWk_upd_srv_req_no) doItmWk_upd_srv_req_no_LC(info);
		else if (lc == columnItmPurc_calc_ctg_cd) doItmPurc_calc_ctg_cd_LC(info);
		else if (lc == columnItmPurc_calc_ctg_nm) doItmPurc_calc_ctg_nm_LC(info);
		else if (lc == columnItmPurc_wg_cd) doItmPurc_wg_cd_LC(info);
		else if (lc == columnItmPurc_wg_nm) doItmPurc_wg_nm_LC(info);
		else if (lc == columnItmPurc_sppl_cd) doItmPurc_sppl_cd_LC(info);
		else if (lc == columnItmPurc_sppl_nm) doItmPurc_sppl_nm_LC(info);
		else if (lc == columnItmPurc_unit_cd) doItmPurc_unit_cd_LC(info);
		else if (lc == columnItmPurc_unit_nm) doItmPurc_unit_nm_LC(info);
		else if (lc == columnItmPurc_dec_place) doItmPurc_dec_place_LC(info);
		else if (lc == columnItmPurc_cur_cd) doItmPurc_cur_cd_LC(info);
		else if (lc == columnItmPurc_cur_nm) doItmPurc_cur_nm_LC(info);
		else if (lc == columnItmPurc_upri_dec_place) doItmPurc_upri_dec_place_LC(info);
		else if (lc == columnItmPurc_cost_ratio) doItmPurc_cost_ratio_LC(info);
		else if (lc == columnItmPurc_rmrks) doItmPurc_rmrks_LC(info);
		else if (lc == columnItmPurc_sub_char1) doItmPurc_sub_char1_LC(info);
		else if (lc == columnItmPurc_sub_char2) doItmPurc_sub_char2_LC(info);
		else if (lc == columnItmPurc_sub_char3) doItmPurc_sub_char3_LC(info);
		else if (lc == columnItmPurc_ins_usr_id) doItmPurc_ins_usr_id_LC(info);
		else if (lc == columnItmPurc_ins_usr_nm) doItmPurc_ins_usr_nm_LC(info);
		else if (lc == columnItmPurc_ins_func_id) doItmPurc_ins_func_id_LC(info);
		else if (lc == columnItmPurc_ins_func_nm) doItmPurc_ins_func_nm_LC(info);
		else if (lc == columnItmPurc_ins_ts) doItmPurc_ins_ts_LC(info);
		else if (lc == columnItmPurc_upd_usr_id) doItmPurc_upd_usr_id_LC(info);
		else if (lc == columnItmPurc_upd_usr_nm) doItmPurc_upd_usr_nm_LC(info);
		else if (lc == columnItmPurc_upd_func_id) doItmPurc_upd_func_id_LC(info);
		else if (lc == columnItmPurc_upd_func_nm) doItmPurc_upd_func_nm_LC(info);
		else if (lc == columnItmPurc_upd_ts) doItmPurc_upd_ts_LC(info);
		else if (lc == columnItmPurc_upd_srv_req_no) doItmPurc_upd_srv_req_no_LC(info);
		else if (lc == columnItmProc_calc_ctg_cd) doItmProc_calc_ctg_cd_LC(info);
		else if (lc == columnItmProc_calc_ctg_nm) doItmProc_calc_ctg_nm_LC(info);
		else if (lc == columnItmProc_wg_cd) doItmProc_wg_cd_LC(info);
		else if (lc == columnItmProc_wg_nm) doItmProc_wg_nm_LC(info);
		else if (lc == columnItmProc_sppl_cd) doItmProc_sppl_cd_LC(info);
		else if (lc == columnItmProc_sppl_nm) doItmProc_sppl_nm_LC(info);
		else if (lc == columnItmProc_unit_cd) doItmProc_unit_cd_LC(info);
		else if (lc == columnItmProc_unit_nm) doItmProc_unit_nm_LC(info);
		else if (lc == columnItmProc_dec_place) doItmProc_dec_place_LC(info);
		else if (lc == columnItmProc_cur_cd) doItmProc_cur_cd_LC(info);
		else if (lc == columnItmProc_cur_nm) doItmProc_cur_nm_LC(info);
		else if (lc == columnItmProc_upri_dec_place) doItmProc_upri_dec_place_LC(info);
		else if (lc == columnItmProc_cost_ratio) doItmProc_cost_ratio_LC(info);
		else if (lc == columnItmProc_rmrks) doItmProc_rmrks_LC(info);
		else if (lc == columnItmProc_sub_char1) doItmProc_sub_char1_LC(info);
		else if (lc == columnItmProc_sub_char2) doItmProc_sub_char2_LC(info);
		else if (lc == columnItmProc_sub_char3) doItmProc_sub_char3_LC(info);
		else if (lc == columnItmProc_ins_usr_id) doItmProc_ins_usr_id_LC(info);
		else if (lc == columnItmProc_ins_usr_nm) doItmProc_ins_usr_nm_LC(info);
		else if (lc == columnItmProc_ins_func_id) doItmProc_ins_func_id_LC(info);
		else if (lc == columnItmProc_ins_func_nm) doItmProc_ins_func_nm_LC(info);
		else if (lc == columnItmProc_ins_ts) doItmProc_ins_ts_LC(info);
		else if (lc == columnItmProc_upd_usr_id) doItmProc_upd_usr_id_LC(info);
		else if (lc == columnItmProc_upd_usr_nm) doItmProc_upd_usr_nm_LC(info);
		else if (lc == columnItmProc_upd_func_id) doItmProc_upd_func_id_LC(info);
		else if (lc == columnItmProc_upd_func_nm) doItmProc_upd_func_nm_LC(info);
		else if (lc == columnItmProc_upd_ts) doItmProc_upd_ts_LC(info);
		else if (lc == columnItmProc_upd_srv_req_no) doItmProc_upd_srv_req_no_LC(info);
		else if (lc == columnItmProv_calc_ctg_cd) doItmProv_calc_ctg_cd_LC(info);
		else if (lc == columnItmProv_calc_ctg_nm) doItmProv_calc_ctg_nm_LC(info);
		else if (lc == columnItmProv_wg_cd) doItmProv_wg_cd_LC(info);
		else if (lc == columnItmProv_wg_nm) doItmProv_wg_nm_LC(info);
		else if (lc == columnItmProv_prsppl_cd) doItmProv_prsppl_cd_LC(info);
		else if (lc == columnItmProv_prsppl_nm) doItmProv_prsppl_nm_LC(info);
		else if (lc == columnItmProv_prov_typ) doItmProv_prov_typ_LC(info);
		else if (lc == columnItmProv_prov_typ_nm) doItmProv_prov_typ_nm_LC(info);
		else if (lc == columnItmProv_unit_cd) doItmProv_unit_cd_LC(info);
		else if (lc == columnItmProv_unit_nm) doItmProv_unit_nm_LC(info);
		else if (lc == columnItmProv_dec_place) doItmProv_dec_place_LC(info);
		else if (lc == columnItmProv_cur_cd) doItmProv_cur_cd_LC(info);
		else if (lc == columnItmProv_cur_nm) doItmProv_cur_nm_LC(info);
		else if (lc == columnItmProv_upri_dec_place) doItmProv_upri_dec_place_LC(info);
		else if (lc == columnItmProv_rmrks) doItmProv_rmrks_LC(info);
		else if (lc == columnItmProv_sub_char1) doItmProv_sub_char1_LC(info);
		else if (lc == columnItmProv_sub_char2) doItmProv_sub_char2_LC(info);
		else if (lc == columnItmProv_sub_char3) doItmProv_sub_char3_LC(info);
		else if (lc == columnItmProv_ins_usr_id) doItmProv_ins_usr_id_LC(info);
		else if (lc == columnItmProv_ins_usr_nm) doItmProv_ins_usr_nm_LC(info);
		else if (lc == columnItmProv_ins_func_id) doItmProv_ins_func_id_LC(info);
		else if (lc == columnItmProv_ins_func_nm) doItmProv_ins_func_nm_LC(info);
		else if (lc == columnItmProv_ins_ts) doItmProv_ins_ts_LC(info);
		else if (lc == columnItmProv_upd_usr_id) doItmProv_upd_usr_id_LC(info);
		else if (lc == columnItmProv_upd_usr_nm) doItmProv_upd_usr_nm_LC(info);
		else if (lc == columnItmProv_upd_func_id) doItmProv_upd_func_id_LC(info);
		else if (lc == columnItmProv_upd_func_nm) doItmProv_upd_func_nm_LC(info);
		else if (lc == columnItmProv_upd_ts) doItmProv_upd_ts_LC(info);
		else if (lc == columnItmProv_upd_srv_req_no) doItmProv_upd_srv_req_no_LC(info);
		else if (lc == columnItmSls_calc_ctg_cd) doItmSls_calc_ctg_cd_LC(info);
		else if (lc == columnItmSls_calc_ctg_nm) doItmSls_calc_ctg_nm_LC(info);
		else if (lc == columnItmSls_wg_cd) doItmSls_wg_cd_LC(info);
		else if (lc == columnItmSls_wg_nm) doItmSls_wg_nm_LC(info);
		else if (lc == columnItmSls_dpt_cd) doItmSls_dpt_cd_LC(info);
		else if (lc == columnItmSls_dpt_nm) doItmSls_dpt_nm_LC(info);
		else if (lc == columnItmSls_cst_cd) doItmSls_cst_cd_LC(info);
		else if (lc == columnItmSls_cst_nm) doItmSls_cst_nm_LC(info);
		else if (lc == columnItmSls_dlv_cd) doItmSls_dlv_cd_LC(info);
		else if (lc == columnItmSls_dlv_nm) doItmSls_dlv_nm_LC(info);
		else if (lc == columnItmSls_dest_cd1) doItmSls_dest_cd1_LC(info);
		else if (lc == columnItmSls_dest_nm1) doItmSls_dest_nm1_LC(info);
		else if (lc == columnItmSls_dest_cd2) doItmSls_dest_cd2_LC(info);
		else if (lc == columnItmSls_dest_nm2) doItmSls_dest_nm2_LC(info);
		else if (lc == columnItmSls_dest_cd3) doItmSls_dest_cd3_LC(info);
		else if (lc == columnItmSls_dest_nm3) doItmSls_dest_nm3_LC(info);
		else if (lc == columnItmSls_unit_cd) doItmSls_unit_cd_LC(info);
		else if (lc == columnItmSls_unit_nm) doItmSls_unit_nm_LC(info);
		else if (lc == columnItmSls_dec_place) doItmSls_dec_place_LC(info);
		else if (lc == columnItmSls_cur_cd) doItmSls_cur_cd_LC(info);
		else if (lc == columnItmSls_cur_nm) doItmSls_cur_nm_LC(info);
		else if (lc == columnItmSls_upri_dec_place) doItmSls_upri_dec_place_LC(info);
		else if (lc == columnItmSls_prio) doItmSls_prio_LC(info);
		else if (lc == columnItmSls_alc_val1) doItmSls_alc_val1_LC(info);
		else if (lc == columnItmSls_alc_val2) doItmSls_alc_val2_LC(info);
		else if (lc == columnItmSls_alc_val3) doItmSls_alc_val3_LC(info);
		else if (lc == columnItmSls_alc_val4) doItmSls_alc_val4_LC(info);
		else if (lc == columnItmSls_alc_val5) doItmSls_alc_val5_LC(info);
		else if (lc == columnItmSls_rmrks) doItmSls_rmrks_LC(info);
		else if (lc == columnItmSls_sub_char1) doItmSls_sub_char1_LC(info);
		else if (lc == columnItmSls_sub_char2) doItmSls_sub_char2_LC(info);
		else if (lc == columnItmSls_sub_char3) doItmSls_sub_char3_LC(info);
		else if (lc == columnItmSls_ins_usr_id) doItmSls_ins_usr_id_LC(info);
		else if (lc == columnItmSls_ins_usr_nm) doItmSls_ins_usr_nm_LC(info);
		else if (lc == columnItmSls_ins_func_id) doItmSls_ins_func_id_LC(info);
		else if (lc == columnItmSls_ins_func_nm) doItmSls_ins_func_nm_LC(info);
		else if (lc == columnItmSls_ins_ts) doItmSls_ins_ts_LC(info);
		else if (lc == columnItmSls_upd_usr_id) doItmSls_upd_usr_id_LC(info);
		else if (lc == columnItmSls_upd_usr_nm) doItmSls_upd_usr_nm_LC(info);
		else if (lc == columnItmSls_upd_func_id) doItmSls_upd_func_id_LC(info);
		else if (lc == columnItmSls_upd_func_nm) doItmSls_upd_func_nm_LC(info);
		else if (lc == columnItmSls_upd_ts) doItmSls_upd_ts_LC(info);
		else if (lc == columnItmSls_upd_srv_req_no) doItmSls_upd_srv_req_no_LC(info);
		else if (lc == columnItmFix_calc_ctg_cd) doItmFix_calc_ctg_cd_LC(info);
		else if (lc == columnItmFix_calc_ctg_nm) doItmFix_calc_ctg_nm_LC(info);
		else if (lc == columnItmFix_wg_cd) doItmFix_wg_cd_LC(info);
		else if (lc == columnItmFix_wg_nm) doItmFix_wg_nm_LC(info);
		else if (lc == columnItmFix_expns_cd) doItmFix_expns_cd_LC(info);
		else if (lc == columnItmFix_expns_nm) doItmFix_expns_nm_LC(info);
		else if (lc == columnItmFix_unit_cd) doItmFix_unit_cd_LC(info);
		else if (lc == columnItmFix_unit_nm) doItmFix_unit_nm_LC(info);
		else if (lc == columnItmFix_dec_place) doItmFix_dec_place_LC(info);
		else if (lc == columnItmFix_cur_cd) doItmFix_cur_cd_LC(info);
		else if (lc == columnItmFix_cur_nm) doItmFix_cur_nm_LC(info);
		else if (lc == columnItmFix_std_upri_dec_place) doItmFix_std_upri_dec_place_LC(info);
		else if (lc == columnItmFix_rmrks) doItmFix_rmrks_LC(info);
		else if (lc == columnItmFix_sub_char1) doItmFix_sub_char1_LC(info);
		else if (lc == columnItmFix_sub_char2) doItmFix_sub_char2_LC(info);
		else if (lc == columnItmFix_sub_char3) doItmFix_sub_char3_LC(info);
		else if (lc == columnItmFix_ins_usr_id) doItmFix_ins_usr_id_LC(info);
		else if (lc == columnItmFix_ins_usr_nm) doItmFix_ins_usr_nm_LC(info);
		else if (lc == columnItmFix_ins_func_id) doItmFix_ins_func_id_LC(info);
		else if (lc == columnItmFix_ins_func_nm) doItmFix_ins_func_nm_LC(info);
		else if (lc == columnItmFix_ins_ts) doItmFix_ins_ts_LC(info);
		else if (lc == columnItmFix_upd_usr_id) doItmFix_upd_usr_id_LC(info);
		else if (lc == columnItmFix_upd_usr_nm) doItmFix_upd_usr_nm_LC(info);
		else if (lc == columnItmFix_upd_func_id) doItmFix_upd_func_id_LC(info);
		else if (lc == columnItmFix_upd_func_nm) doItmFix_upd_func_nm_LC(info);
		else if (lc == columnItmFix_upd_ts) doItmFix_upd_ts_LC(info);
		else if (lc == columnItmFix_upd_srv_req_no) doItmFix_upd_srv_req_no_LC(info);
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
	 * [Cnd]パネルの[itm_is_srch_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_is_srch_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_hrrchy]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_hrrchy_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[calc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_calc_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Itm]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItm_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[cost_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_cost_ratio_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[oper_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_oper_ptn_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[exp_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_exp_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[exp_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_exp_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[exp_prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_exp_prio_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val1_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val2_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val3_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val4_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[alc_val5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_alc_val5_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_ptn_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_seq_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[nmr_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_nmr_qty_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[dnm_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_dnm_qty_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_std_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_std_qty_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[oper_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_oper_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_conv_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_conv_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[unit_conv_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_unit_conv_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmOper]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmOper_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_ptn_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_oper_seq_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[wk_cost_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_wk_cost_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmWk]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmWk_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[cost_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_cost_ratio_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmPurc]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmPurc_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[cost_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_cost_ratio_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmProc]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProc_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prov_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prov_typ_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[prov_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_prov_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmProv]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmProv_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_prio_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val1_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val2_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val3_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val4_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[alc_val5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_alc_val5_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmSls]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmSls_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[std_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_std_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmFix]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmFix_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
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

	/**
	 * コンボ／リストのリスト[Cnd_bom_ptn]の作成メソッド
	 */
	public MCList getCnd_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getBomPtn(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0540.Srch01")) {
			return new MG_MGBDL0540_Srch01Bridge();
		}
		if (id.equals("MG.MGBDL0540.Srch02")) {
			return new MG_MGBDL0540_Srch02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0540_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0540_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0540_Srch01;

		/** コンストラクタ */
		protected MG_MGBDL0540_Srch01Bridge() {
			p_MG_MGBDL0540_Srch01 = new MCParam(PDef.MG_MGBDL0540_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0540_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0540.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.DtlR.class));

			p_MG_MGBDL0540_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0540_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0540_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0540_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0540_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0540.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0540.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0540.DtlR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0540.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0540_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.DtlR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0540_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMGBD.MGBDP0540.DtlR>)p_MG_MGBDL0540_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MG_MGBDL0540_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0540_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0540_Srch02;

		/** コンストラクタ */
		protected MG_MGBDL0540_Srch02Bridge() {
			p_MG_MGBDL0540_Srch02 = new MCParam(PDef.MG_MGBDL0540_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0540_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0540.Cnd2R.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmOperR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmWkR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmPurcR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmProcR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmProvR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmSlsR.class));
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmFixR.class));

			p_MG_MGBDL0540_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0540_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0540_Srch02.addUpBlock(getCnd2R());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0540_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0540_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0540.Cnd2R up0() {
			return (mcframe.clientMGBD.MGBDP0540.Cnd2R)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0540.ItmR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0540.ItmR>)down(0);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0540.ItmDtlR> down1() {
			return (MCList<mcframe.clientMGBD.MGBDP0540.ItmDtlR>)down(1);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0540.ItmOperR> down2() {
			return (MCList<mcframe.clientMGBD.MGBDP0540.ItmOperR>)down(2);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0540.ItmWkR> down3() {
			return (MCList<mcframe.clientMGBD.MGBDP0540.ItmWkR>)down(3);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0540.ItmPurcR> down4() {
			return (MCList<mcframe.clientMGBD.MGBDP0540.ItmPurcR>)down(4);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0540.ItmProcR> down5() {
			return (MCList<mcframe.clientMGBD.MGBDP0540.ItmProcR>)down(5);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0540.ItmProvR> down6() {
			return (MCList<mcframe.clientMGBD.MGBDP0540.ItmProvR>)down(6);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0540.ItmSlsR> down7() {
			return (MCList<mcframe.clientMGBD.MGBDP0540.ItmSlsR>)down(7);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0540.ItmFixR> down8() {
			return (MCList<mcframe.clientMGBD.MGBDP0540.ItmFixR>)down(8);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0540_Srch02.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmR.class));
			p_MG_MGBDL0540_Srch02.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmDtlR.class));
			p_MG_MGBDL0540_Srch02.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmOperR.class));
			p_MG_MGBDL0540_Srch02.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmWkR.class));
			p_MG_MGBDL0540_Srch02.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmPurcR.class));
			p_MG_MGBDL0540_Srch02.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmProcR.class));
			p_MG_MGBDL0540_Srch02.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmProvR.class));
			p_MG_MGBDL0540_Srch02.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmSlsR.class));
			p_MG_MGBDL0540_Srch02.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0540.ItmFixR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0540_Srch02;
		}

		protected void show() {
			setItmL((MCList<mcframe.clientMGBD.MGBDP0540.ItmR>)p_MG_MGBDL0540_Srch02.getContainerParam().getDownBlock(0));
			setItmDtlL((MCList<mcframe.clientMGBD.MGBDP0540.ItmDtlR>)p_MG_MGBDL0540_Srch02.getContainerParam().getDownBlock(1));
			setItmOperL((MCList<mcframe.clientMGBD.MGBDP0540.ItmOperR>)p_MG_MGBDL0540_Srch02.getContainerParam().getDownBlock(2));
			setItmWkL((MCList<mcframe.clientMGBD.MGBDP0540.ItmWkR>)p_MG_MGBDL0540_Srch02.getContainerParam().getDownBlock(3));
			setItmPurcL((MCList<mcframe.clientMGBD.MGBDP0540.ItmPurcR>)p_MG_MGBDL0540_Srch02.getContainerParam().getDownBlock(4));
			setItmProcL((MCList<mcframe.clientMGBD.MGBDP0540.ItmProcR>)p_MG_MGBDL0540_Srch02.getContainerParam().getDownBlock(5));
			setItmProvL((MCList<mcframe.clientMGBD.MGBDP0540.ItmProvR>)p_MG_MGBDL0540_Srch02.getContainerParam().getDownBlock(6));
			setItmSlsL((MCList<mcframe.clientMGBD.MGBDP0540.ItmSlsR>)p_MG_MGBDL0540_Srch02.getContainerParam().getDownBlock(7));
			setItmFixL((MCList<mcframe.clientMGBD.MGBDP0540.ItmFixR>)p_MG_MGBDL0540_Srch02.getContainerParam().getDownBlock(8));
		}

		protected void clear() {
			getItmL().clear();
			getItmDtlL().clear();
			getItmOperL().clear();
			getItmWkL().clear();
			getItmPurcL().clear();
			getItmProcL().clear();
			getItmProvL().clear();
			getItmSlsL().clear();
			getItmFixL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCnd2R());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getItmL());
			result.add(getItmDtlL());
			result.add(getItmOperL());
			result.add(getItmWkL());
			result.add(getItmPurcL());
			result.add(getItmProcL());
			result.add(getItmProvL());
			result.add(getItmSlsL());
			result.add(getItmFixL());
			return result;
		}
	}
}