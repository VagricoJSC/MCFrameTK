package mcframe.clientMGBD.MGBDP0420;

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
import mcframe.clientMGBD.MGBDP0420.MGBDP_CopyBom_MC.MG_MGBDL0420_Ins01Caller;
import mcframe.clientMGBD.MGBDP0420.MGBDP_CopyBom_MC.MG_MGBDL0420_Srch01Caller;
import mcframe.clientMGBD.MGBDP0420.MGBDP_CopyBom_MC.MG_MGBDL0420_Upd01Caller;
import mcframe.clientMGBD.MGBDP0420.MGBDP_CopyBom_MC.MG_MGBDL0420_Upd02Caller;

/**
 * 画面"MGBDP_CopyBom"パネルクラスです。<p>
 *
 * 原価管理で使用するＢＯＭ情報を取り込む<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_CopyBom_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBDP0420";

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
	// [RegTarget]ブロック関連のField定義
	public MCPanel RegTargetPanel = null;
	public MCTitledBorder RegTargetTitledBorder = null;
	// [RegTarget]ブロックの項目のField定義
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
	// [TgtCnd]ブロック関連のField定義
	public MCPanel TgtCndPanel = null;
	// [TgtCnd]ブロックの項目のField定義
	public MCLabel TgtCnd_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox TgtCnd_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCTextField TgtCnd_calc_ctg_nm = null;
	public MCLabel TgtCnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox TgtCnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField TgtCnd_wg_nm = null;
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H TgtCnd_term_p_PPanel;
	public MCDateComboBox TgtCnd_term;	// [TgtCnd]の[term_p.term]を[TgtCnd_term]としてエイリアス定義。
	public MCLabel TgtCnd_dt_Label = null;
	/**
	 * Date 対象日.<p>
	 *
	 */
	public MCDateField TgtCnd_dt = null;
	/**
	 * Include import 取込処理も行う.<p>
	 *
	 */
	public MCCheckBox TgtCnd_lump_flg = null;
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * INS,Create to import,0;IMP,Import,1;LUMP_IMP,Import all,2 INS,取込対象を作成する,0;IMP,取り込む,1;LUMP_IMP,全て取り込む,2.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_IMP = null;
	public MCRadioButton Cnd_ope_LUMP_IMP = null;
	/**
	 * Common 共通.<p>
	 *
	 */
	public MCCheckBox Cnd_cmn_flg = null;
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
	public MCLabel Cnd_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_ctg_nm = null;
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
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term;	// [Cnd]の[term_p.term]を[Cnd_term]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_par_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_par_itm_typ;	// [Cnd]の[par_itm_typ_p.itm_typ]を[Cnd_par_itm_typ]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_typ_d_cd;	// [Cnd]の[par_itm_typ_p.itm_typ_d_cd]を[Cnd_par_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_par_itm_typ_d_nm;	// [Cnd]の[par_itm_typ_p.itm_typ_d_nm]を[Cnd_par_itm_typ_d_nm]としてエイリアス定義。
	public MCLabel Cnd_par_itm_jnl_cd_Label = null;
	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_jnl_cd = null;
	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_jnl_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_par_itm_p_PPanel;
	public MCTextField Cnd_par_itm_cd;	// [Cnd]の[par_itm_p.itm_cd]を[Cnd_par_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub1;	// [Cnd]の[par_itm_p.itm_sub1]を[Cnd_par_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub2;	// [Cnd]の[par_itm_p.itm_sub2]を[Cnd_par_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub3;	// [Cnd]の[par_itm_p.itm_sub3]を[Cnd_par_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_par_itm_nm;	// [Cnd]の[par_itm_p.itm_nm]を[Cnd_par_itm_nm]としてエイリアス定義。
	/**
	 * Not exist 未存在.<p>
	 *
	 */
	public MCCheckBox Cnd_no_exist_flg = null;
	/**
	 * Exist (With change) 存在（変更有）.<p>
	 *
	 */
	public MCCheckBox Cnd_change_flg = null;
	/**
	 * Exist (Without change) 存在（変更無）.<p>
	 *
	 */
	public MCCheckBox Cnd_exist_flg = null;
	/**
	 * | ｜.<p>
	 *
	 */
	public MCLabel Cnd_sep = null;
	/**
	 * Error only エラーのみ.<p>
	 *
	 */
	public MCCheckBox Cnd_imp_err_flg = null;
	public MCLabel Cnd_par_itm_grp_cd1_Label = null;
	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd1 = null;
	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm1 = null;
	public MCLabel Cnd_par_itm_grp_cd2_Label = null;
	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd2 = null;
	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm2 = null;
	public MCLabel Cnd_par_itm_grp_cd3_Label = null;
	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd3 = null;
	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm3 = null;
	public MCLabel Cnd_par_itm_grp_cd4_Label = null;
	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd4 = null;
	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm4 = null;
	public MCLabel Cnd_par_itm_grp_cd5_Label = null;
	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd5 = null;
	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm5 = null;
	public MCLabel Cnd_par_itm_grp_cd6_Label = null;
	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd6 = null;
	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm6 = null;
	public MCLabel Cnd_par_itm_grp_cd7_Label = null;
	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd7 = null;
	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm7 = null;
	public MCLabel Cnd_par_itm_grp_cd8_Label = null;
	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd8 = null;
	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm8 = null;
	public MCLabel Cnd_par_itm_grp_cd9_Label = null;
	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd9 = null;
	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm9 = null;
	public MCLabel Cnd_par_itm_grp_cd10_Label = null;
	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd10 = null;
	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm10 = null;
	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public MCCheckBox Cnd_disp_key = null;
	/**
	 * Search (Common) 検索する（共通）.<p>
	 *
	 */
	public MCButton Cnd_srch_cmn = null;
	/**
	 * Search (WG) 検索する（ワーキンググループ）.<p>
	 *
	 */
	public MCButton Cnd_srch_wg = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Tbl]ブロック関連のField定義
	public MCPanel TblPanel = null;
	// [Tbl]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Hdr_calc_ctg_nm = null;
	public MCLabel Hdr_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Hdr_wg_nm = null;
	public MCLabel Hdr_term_Label = null;
	/**
	 * Term 期.<p>
	 *
	 */
	public MCDateField Hdr_term = null;
	/**
	 * Term name 期名称.<p>
	 *
	 */
	public MCTextField Hdr_term_nm = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0420.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Not exist 未存在.<p>
	 *
	 */
	public MCColumnConfig columnRslt_no_exist_flg = null;
	/**
	 * With changed 変更有.<p>
	 *
	 */
	public MCColumnConfig columnRslt_change_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_par_itm_p_PPanel;
	public MCColumnConfig columnRslt_par_itm_cd;// [Rslt]の[par_itm_p.itm_cd]を[columnRslt_par_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_sub1;// [Rslt]の[par_itm_p.itm_sub1]を[columnRslt_par_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_sub2;// [Rslt]の[par_itm_p.itm_sub2]を[columnRslt_par_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_sub3;// [Rslt]の[par_itm_p.itm_sub3]を[columnRslt_par_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_nm;// [Rslt]の[par_itm_p.itm_nm]を[columnRslt_par_itm_nm]としてエイリアス定義。
	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_itm_typ = null;
	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_itm_typ_nm = null;
	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_itm_typ_d_cd = null;
	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_itm_typ_d_nm = null;
	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_itm_jnl_cd = null;
	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_itm_jnl_nm = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bom_ptn = null;
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
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_seq = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_chd_itm_p_PPanel;
	public MCColumnConfig columnRslt_chd_itm_cd;// [Rslt]の[chd_itm_p.itm_cd]を[columnRslt_chd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_sub1;// [Rslt]の[chd_itm_p.itm_sub1]を[columnRslt_chd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_sub2;// [Rslt]の[chd_itm_p.itm_sub2]を[columnRslt_chd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_sub3;// [Rslt]の[chd_itm_p.itm_sub3]を[columnRslt_chd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_nm;// [Rslt]の[chd_itm_p.itm_nm]を[columnRslt_chd_itm_nm]としてエイリアス定義。
	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_typ = null;
	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_typ_nm = null;
	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_typ_d_cd = null;
	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_typ_d_nm = null;
	/**
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_jnl_cd = null;
	/**
	 * Child item journal name 子品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_jnl_nm = null;
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_grp_cd = null;
	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_grp_nm = null;
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_expns_cd = null;
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_expns_nm = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_seq = null;
	/**
	 * Parent item base unit cd. 親品目基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_unit_cd = null;
	/**
	 * Parent item base unit name 親品目基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_unit_nm = null;
	/**
	 * Parent item base unit number of decimal places 親品目基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_par_rqmt_qty_p_PPanel;
	public MCColumnConfig columnRslt_par_rqmt_qty;// [Rslt]の[par_rqmt_qty_p.qty]を[columnRslt_par_rqmt_qty]としてエイリアス定義。
	/**
	 * Child item base unit cd. 子品目基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_unit_cd = null;
	/**
	 * Child item base unit name 子品目基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_unit_nm = null;
	/**
	 * Child item base unit number of decimal places 子品目基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_chd_rqmt_qty_p_PPanel;
	public MCColumnConfig columnRslt_chd_rqmt_qty;// [Rslt]の[chd_rqmt_qty_p.qty]を[columnRslt_chd_rqmt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_chd_base_qty_p_PPanel;
	public MCColumnConfig columnRslt_chd_base_qty;// [Rslt]の[chd_base_qty_p.qty]を[columnRslt_chd_base_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_fxd_chd_rqmt_qty_p_PPanel;
	public MCColumnConfig columnRslt_fxd_chd_rqmt_qty;// [Rslt]の[fxd_chd_rqmt_qty_p.qty]を[columnRslt_fxd_chd_rqmt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_chd_min_qty_p_PPanel;
	public MCColumnConfig columnRslt_chd_min_qty;// [Rslt]の[chd_min_qty_p.qty]を[columnRslt_chd_min_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_chd_batch_qty_p_PPanel;
	public MCColumnConfig columnRslt_chd_batch_qty;// [Rslt]の[chd_batch_qty_p.qty]を[columnRslt_chd_batch_qty]としてエイリアス定義。
	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_itm_ratio = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rmrks = null;
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
	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public MCColumnConfig columnRslt_non_calc_flg = null;
	/**
	 * Import error 取込エラー.<p>
	 *
	 */
	public MCColumnConfig columnRslt_imp_err_flg = null;
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
	 * Key キー.<p>
	 *
	 */
	public MCColumnConfig columnRslt_key_flg = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Cost BOM list entry 原価ＢＯＭ一覧登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0530 = null;
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
	public MCButton Btn_ins = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_lump = null;
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [SRCH_UPD]モードを表す定数 */
	public static final String SRCH_UPD = "SRCH_UPD";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [UPD_LUMP]モードを表す定数 */
	public static final String UPD_LUMP = "UPD_LUMP";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS, SRCH_UPD, UPD, FIX_U, UPD_LUMP};
	
	/** [MG_MGBDL0420_Ins01]のCallerの作成 */
	protected MGBDP_CopyBom_MC.MG_MGBDL0420_Ins01Caller createMG_MGBDL0420_Ins01() {
		MGBDP_CopyBom_MC.MG_MGBDL0420_Ins01Caller<MGBDP_CopyBom, MG_MGBDL0420_Ins01Bridge>
		caller = ((MGBDP_CopyBom_MC)this).new MG_MGBDL0420_Ins01Caller<MGBDP_CopyBom, MG_MGBDL0420_Ins01Bridge>(
					(MGBDP_CopyBom)this, new MG_MGBDL0420_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBDL0420_Ins01]の呼び出し */
	protected void callMG_MGBDL0420_Ins01() {
		MCCaller caller = createMG_MGBDL0420_Ins01();
		caller.exec();
	}
	/** [MG_MGBDL0420_Srch01]のCallerの作成 */
	protected MGBDP_CopyBom_MC.MG_MGBDL0420_Srch01Caller createMG_MGBDL0420_Srch01() {
		MGBDP_CopyBom_MC.MG_MGBDL0420_Srch01Caller<MGBDP_CopyBom, MG_MGBDL0420_Srch01Bridge>
		caller = ((MGBDP_CopyBom_MC)this).new MG_MGBDL0420_Srch01Caller<MGBDP_CopyBom, MG_MGBDL0420_Srch01Bridge>(
					(MGBDP_CopyBom)this, new MG_MGBDL0420_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBDL0420_Srch01]の呼び出し */
	protected void callMG_MGBDL0420_Srch01() {
		MCCaller caller = createMG_MGBDL0420_Srch01();
		caller.exec();
	}
	/** [MG_MGBDL0420_Upd01]のCallerの作成 */
	protected MGBDP_CopyBom_MC.MG_MGBDL0420_Upd01Caller createMG_MGBDL0420_Upd01() {
		MGBDP_CopyBom_MC.MG_MGBDL0420_Upd01Caller<MGBDP_CopyBom, MG_MGBDL0420_Upd01Bridge>
		caller = ((MGBDP_CopyBom_MC)this).new MG_MGBDL0420_Upd01Caller<MGBDP_CopyBom, MG_MGBDL0420_Upd01Bridge>(
					(MGBDP_CopyBom)this, new MG_MGBDL0420_Upd01Bridge());
		return caller;
	}
	/** [MG_MGBDL0420_Upd01]の呼び出し */
	protected void callMG_MGBDL0420_Upd01() {
		MCCaller caller = createMG_MGBDL0420_Upd01();
		caller.exec();
	}
	/** [MG_MGBDL0420_Upd02]のCallerの作成 */
	protected MGBDP_CopyBom_MC.MG_MGBDL0420_Upd02Caller createMG_MGBDL0420_Upd02() {
		MGBDP_CopyBom_MC.MG_MGBDL0420_Upd02Caller<MGBDP_CopyBom, MG_MGBDL0420_Upd02Bridge>
		caller = ((MGBDP_CopyBom_MC)this).new MG_MGBDL0420_Upd02Caller<MGBDP_CopyBom, MG_MGBDL0420_Upd02Bridge>(
					(MGBDP_CopyBom)this, new MG_MGBDL0420_Upd02Bridge());
		return caller;
	}
	/** [MG_MGBDL0420_Upd02]の呼び出し */
	protected void callMG_MGBDL0420_Upd02() {
		MCCaller caller = createMG_MGBDL0420_Upd02();
		caller.exec();
	}
	/** [TgtCnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0420.TgtCndR aTgtCndR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0420.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0420.HdrR aHdrR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0420.RsltR> aRsltL;

	/**
	 * 項目コピーによってaTgtCndRを設定します。
	 *
	 * aTgtCndRのインスタンスは変更されません。
	 *
	 * @param row TgtCndR
	 */
	public void setTgtCndR(mcframe.clientMGBD.MGBDP0420.TgtCndR row) {
		if (row != null) {
			MCRow.copyall(getTgtCndR(), row);
		}
	}

	/**
	 * [TgtCnd]ブロックのコンテナaTgtCndRを返します。
	 *
	 * @return TgtCndR
	 */
	public mcframe.clientMGBD.MGBDP0420.TgtCndR getTgtCndR() {
		return aTgtCndR;
	}

	/**
	 * aTgtCndRを作成します。
	 *
	 * @return TgtCndR
	 */
	public mcframe.clientMGBD.MGBDP0420.TgtCndR createTgtCndR() {
		return mcframe.clientMGBD.MGBDP0420.TgtCndR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0420.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0420.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0420.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0420.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMGBD.MGBDP0420.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMGBD.MGBDP0420.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMGBD.MGBDP0420.HdrR createHdrR() {
		return mcframe.clientMGBD.MGBDP0420.HdrR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBD.MGBDP0420.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0420.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBD.MGBDP0420.RsltR createRsltR() {
		return mcframe.clientMGBD.MGBDP0420.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0420.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0420.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getTgtCndR())) ret.add(getTgtCndR());
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
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
		if(aCnt == getTgtCndR()) return "TgtCnd";
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getHdrR()) return "Hdr";
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
		if(bId.equals("TgtCnd")) return getTgtCndR();
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Hdr")) return getHdrR();
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
		ret.add(RegTargetPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(TgtCndPanel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(TblPanel);
		ret.add(HdrPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CopyBom_MC_A() {
		aTgtCndR = createTgtCndR();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_CopyBom_MC_A(String name) {
		aTgtCndR = createTgtCndR();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBDP_CopyBom_MC.jbCreateScreenOpe((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbCreateRegTarget((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbCreateTop((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbCreateFold((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbCreateTab1((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbCreateTab2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbCreateTab3((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbCreateTgtCnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbCreateCnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbCreateCnd2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbCreateCtrl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbCreateTbl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbCreateHdr((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbCreateRslt((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbCreateBtn((MGBDP_CopyBom)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBDP_CopyBom p) {
	}

	/**
	 * [RegTarget]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRegTarget(MGBDP_CopyBom p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBDP_CopyBom p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBDP_CopyBom p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBDP_CopyBom p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBDP_CopyBom p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MGBDP_CopyBom p) {
	}

	/**
	 * [TgtCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTgtCnd(MGBDP_CopyBom p) {
		p.TgtCnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getTgtCndR().term_p());
		p.TgtCnd_term_p_PPanel.setName("TgtCnd.term_p");
		p.TgtCnd_term = p.TgtCnd_term_p_PPanel.Term_term;
		p.TgtCnd_term.addAliasName("TgtCnd.term", p);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_CopyBom p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term = p.Cnd_term_p_PPanel.Term_term;
		p.Cnd_term.addAliasName("Cnd.term", p);
		p.Cnd_par_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().par_itm_typ_p());
		p.Cnd_par_itm_typ_p_PPanel.setName("Cnd.par_itm_typ_p");
		p.Cnd_par_itm_typ = p.Cnd_par_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_par_itm_typ.addAliasName("Cnd.par_itm_typ", p);
		p.Cnd_par_itm_typ_d_cd = p.Cnd_par_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_par_itm_typ_d_cd.addAliasName("Cnd.par_itm_typ_d_cd", p);
		p.Cnd_par_itm_typ_d_nm = p.Cnd_par_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Cnd_par_itm_typ_d_nm.addAliasName("Cnd.par_itm_typ_d_nm", p);
		p.Cnd_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().par_itm_p());
		p.Cnd_par_itm_p_PPanel.setName("Cnd.par_itm_p");
		p.Cnd_par_itm_cd = p.Cnd_par_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_par_itm_cd.addAliasName("Cnd.par_itm_cd", p);
		p.Cnd_par_itm_sub1 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_par_itm_sub1.addAliasName("Cnd.par_itm_sub1", p);
		p.Cnd_par_itm_sub2 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_par_itm_sub2.addAliasName("Cnd.par_itm_sub2", p);
		p.Cnd_par_itm_sub3 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_par_itm_sub3.addAliasName("Cnd.par_itm_sub3", p);
		p.Cnd_par_itm_nm = p.Cnd_par_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_par_itm_nm.addAliasName("Cnd.par_itm_nm", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MGBDP_CopyBom p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBDP_CopyBom p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Tbl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTbl(MGBDP_CopyBom p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MGBDP_CopyBom p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBDP_CopyBom p) {
		p.Rslt_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0420.RsltR.$par_itm_p);
		p.Rslt_par_itm_p_PPanel.setName("Rslt.par_itm_p");
		p.columnRslt_par_itm_cd = p.Rslt_par_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_par_itm_cd.addAliasName("Rslt.par_itm_cd", p);
		p.columnRslt_par_itm_sub1 = p.Rslt_par_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_par_itm_sub1.addAliasName("Rslt.par_itm_sub1", p);
		p.columnRslt_par_itm_sub2 = p.Rslt_par_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_par_itm_sub2.addAliasName("Rslt.par_itm_sub2", p);
		p.columnRslt_par_itm_sub3 = p.Rslt_par_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_par_itm_sub3.addAliasName("Rslt.par_itm_sub3", p);
		p.columnRslt_par_itm_nm = p.Rslt_par_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_par_itm_nm.addAliasName("Rslt.par_itm_nm", p);
		p.Rslt_chd_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0420.RsltR.$chd_itm_p);
		p.Rslt_chd_itm_p_PPanel.setName("Rslt.chd_itm_p");
		p.columnRslt_chd_itm_cd = p.Rslt_chd_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_chd_itm_cd.addAliasName("Rslt.chd_itm_cd", p);
		p.columnRslt_chd_itm_sub1 = p.Rslt_chd_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_chd_itm_sub1.addAliasName("Rslt.chd_itm_sub1", p);
		p.columnRslt_chd_itm_sub2 = p.Rslt_chd_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_chd_itm_sub2.addAliasName("Rslt.chd_itm_sub2", p);
		p.columnRslt_chd_itm_sub3 = p.Rslt_chd_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_chd_itm_sub3.addAliasName("Rslt.chd_itm_sub3", p);
		p.columnRslt_chd_itm_nm = p.Rslt_chd_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_chd_itm_nm.addAliasName("Rslt.chd_itm_nm", p);
		p.Rslt_par_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0420.RsltR.$par_rqmt_qty_p);
		p.Rslt_par_rqmt_qty_p_PPanel.setName("Rslt.par_rqmt_qty_p");
		p.columnRslt_par_rqmt_qty = p.Rslt_par_rqmt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_par_rqmt_qty.addAliasName("Rslt.par_rqmt_qty", p);
		p.Rslt_chd_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0420.RsltR.$chd_rqmt_qty_p);
		p.Rslt_chd_rqmt_qty_p_PPanel.setName("Rslt.chd_rqmt_qty_p");
		p.columnRslt_chd_rqmt_qty = p.Rslt_chd_rqmt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_chd_rqmt_qty.addAliasName("Rslt.chd_rqmt_qty", p);
		p.Rslt_chd_base_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0420.RsltR.$chd_base_qty_p);
		p.Rslt_chd_base_qty_p_PPanel.setName("Rslt.chd_base_qty_p");
		p.columnRslt_chd_base_qty = p.Rslt_chd_base_qty_p_PPanel.columnQty_qty;
		p.columnRslt_chd_base_qty.addAliasName("Rslt.chd_base_qty", p);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0420.RsltR.$fxd_chd_rqmt_qty_p);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.setName("Rslt.fxd_chd_rqmt_qty_p");
		p.columnRslt_fxd_chd_rqmt_qty = p.Rslt_fxd_chd_rqmt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_fxd_chd_rqmt_qty.addAliasName("Rslt.fxd_chd_rqmt_qty", p);
		p.Rslt_chd_min_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0420.RsltR.$chd_min_qty_p);
		p.Rslt_chd_min_qty_p_PPanel.setName("Rslt.chd_min_qty_p");
		p.columnRslt_chd_min_qty = p.Rslt_chd_min_qty_p_PPanel.columnQty_qty;
		p.columnRslt_chd_min_qty.addAliasName("Rslt.chd_min_qty", p);
		p.Rslt_chd_batch_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0420.RsltR.$chd_batch_qty_p);
		p.Rslt_chd_batch_qty_p_PPanel.setName("Rslt.chd_batch_qty_p");
		p.columnRslt_chd_batch_qty = p.Rslt_chd_batch_qty_p_PPanel.columnQty_qty;
		p.columnRslt_chd_batch_qty.addAliasName("Rslt.chd_batch_qty", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBDP_CopyBom p) {
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

	
	/** [TgtCnd_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter TgtCnd_calc_ctg_cd_p = null;

	/**
	 * [TgtCnd_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getTgtCnd_calc_ctg_cd_ListPutter() {
		if (TgtCnd_calc_ctg_cd_p == null) {
			TgtCnd_calc_ctg_cd_p = createTgtCnd_calc_ctg_cd_ListPutter(TgtCnd_calc_ctg_cd, "calc_ctg_cd", "calc_ctg_nm");

		}
		return TgtCnd_calc_ctg_cd_p;
	}
	
	
	/** [TgtCnd_wg_cd_ListPutter]の定義 */
	private MCListPutter TgtCnd_wg_cd_p = null;

	/**
	 * [TgtCnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getTgtCnd_wg_cd_ListPutter() {
		if (TgtCnd_wg_cd_p == null) {
			TgtCnd_wg_cd_p = createTgtCnd_wg_cd_ListPutter(TgtCnd_wg_cd, "wg_cd", "wg_nm");

		}
		return TgtCnd_wg_cd_p;
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
	
	
	/** [Cnd_par_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_jnl_cd_p = null;

	/**
	 * [Cnd_par_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_jnl_cd_ListPutter() {
		if (Cnd_par_itm_jnl_cd_p == null) {
			Cnd_par_itm_jnl_cd_p = createCnd_par_itm_jnl_cd_ListPutter(Cnd_par_itm_jnl_cd, "par_itm_jnl_cd", "par_itm_jnl_nm");

		}
		return Cnd_par_itm_jnl_cd_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_cd_p = createCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_cd, "par_itm_cd", "par_itm_nm","par_itm_sub1","par_itm_sub2","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub1_p = createCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub1, "par_itm_sub1", "par_itm_nm","par_itm_sub2","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub2_p = createCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub2, "par_itm_sub2", "par_itm_nm","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub3_p = createCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub3, "par_itm_sub3", "par_itm_nm");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd1_p = null;

	/**
	 * [Cnd_par_itm_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd1_ListPutter() {
		if (Cnd_par_itm_grp_cd1_p == null) {
			Cnd_par_itm_grp_cd1_p = createCnd_par_itm_grp_cd1_ListPutter(Cnd_par_itm_grp_cd1, "par_itm_grp_cd1", "par_itm_grp_nm1");

		}
		return Cnd_par_itm_grp_cd1_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd2_p = null;

	/**
	 * [Cnd_par_itm_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd2_ListPutter() {
		if (Cnd_par_itm_grp_cd2_p == null) {
			Cnd_par_itm_grp_cd2_p = createCnd_par_itm_grp_cd2_ListPutter(Cnd_par_itm_grp_cd2, "par_itm_grp_cd2", "par_itm_grp_nm2");

		}
		return Cnd_par_itm_grp_cd2_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd3_p = null;

	/**
	 * [Cnd_par_itm_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd3_ListPutter() {
		if (Cnd_par_itm_grp_cd3_p == null) {
			Cnd_par_itm_grp_cd3_p = createCnd_par_itm_grp_cd3_ListPutter(Cnd_par_itm_grp_cd3, "par_itm_grp_cd3", "par_itm_grp_nm3");

		}
		return Cnd_par_itm_grp_cd3_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd4_p = null;

	/**
	 * [Cnd_par_itm_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd4_ListPutter() {
		if (Cnd_par_itm_grp_cd4_p == null) {
			Cnd_par_itm_grp_cd4_p = createCnd_par_itm_grp_cd4_ListPutter(Cnd_par_itm_grp_cd4, "par_itm_grp_cd4", "par_itm_grp_nm4");

		}
		return Cnd_par_itm_grp_cd4_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd5_p = null;

	/**
	 * [Cnd_par_itm_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd5_ListPutter() {
		if (Cnd_par_itm_grp_cd5_p == null) {
			Cnd_par_itm_grp_cd5_p = createCnd_par_itm_grp_cd5_ListPutter(Cnd_par_itm_grp_cd5, "par_itm_grp_cd5", "par_itm_grp_nm5");

		}
		return Cnd_par_itm_grp_cd5_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd6_p = null;

	/**
	 * [Cnd_par_itm_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd6_ListPutter() {
		if (Cnd_par_itm_grp_cd6_p == null) {
			Cnd_par_itm_grp_cd6_p = createCnd_par_itm_grp_cd6_ListPutter(Cnd_par_itm_grp_cd6, "par_itm_grp_cd6", "par_itm_grp_nm6");

		}
		return Cnd_par_itm_grp_cd6_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd7_p = null;

	/**
	 * [Cnd_par_itm_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd7_ListPutter() {
		if (Cnd_par_itm_grp_cd7_p == null) {
			Cnd_par_itm_grp_cd7_p = createCnd_par_itm_grp_cd7_ListPutter(Cnd_par_itm_grp_cd7, "par_itm_grp_cd7", "par_itm_grp_nm7");

		}
		return Cnd_par_itm_grp_cd7_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd8_p = null;

	/**
	 * [Cnd_par_itm_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd8_ListPutter() {
		if (Cnd_par_itm_grp_cd8_p == null) {
			Cnd_par_itm_grp_cd8_p = createCnd_par_itm_grp_cd8_ListPutter(Cnd_par_itm_grp_cd8, "par_itm_grp_cd8", "par_itm_grp_nm8");

		}
		return Cnd_par_itm_grp_cd8_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd9_p = null;

	/**
	 * [Cnd_par_itm_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd9_ListPutter() {
		if (Cnd_par_itm_grp_cd9_p == null) {
			Cnd_par_itm_grp_cd9_p = createCnd_par_itm_grp_cd9_ListPutter(Cnd_par_itm_grp_cd9, "par_itm_grp_cd9", "par_itm_grp_nm9");

		}
		return Cnd_par_itm_grp_cd9_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd10_p = null;

	/**
	 * [Cnd_par_itm_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd10_ListPutter() {
		if (Cnd_par_itm_grp_cd10_p == null) {
			Cnd_par_itm_grp_cd10_p = createCnd_par_itm_grp_cd10_ListPutter(Cnd_par_itm_grp_cd10, "par_itm_grp_cd10", "par_itm_grp_nm10");

		}
		return Cnd_par_itm_grp_cd10_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_CopyBom create(){
		MGBDP_CopyBom p = new MGBDP_CopyBom();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_CopyBom create(String name){
		MGBDP_CopyBom p = new MGBDP_CopyBom(name);
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
		MGBDP_CopyBom_MC.jbfInitScreenOpe((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbfInitRegTarget((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbfInitTop((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbfInitFold((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbfInitTab1((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbfInitTab2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbfInitTab3((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbfInitTgtCnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbfInitCnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbfInitCnd2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbfInitCtrl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbfInitTbl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbfInitHdr((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbfInitRslt((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbfInitBtn((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbInitScreenOpe((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbInitRegTarget((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbInitTop((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbInitFold((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbInitTab1((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbInitTab2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbInitTab3((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbInitTgtCnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbInitCnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbInitCnd2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbInitCtrl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbInitTbl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbInitHdr((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbInitRslt((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.jbInitBtn((MGBDP_CopyBom)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRegTarget(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.RegTargetPanel = p.beansFactory.createPanel("RegTarget");
		p.RegTargetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBDP_CopyBom p) {
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
	protected static void jbfInitTab1(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [TgtCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTgtCnd(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.TgtCndPanel = p.beansFactory.createPanel("TgtCnd");
		// ブロックの項目の初期化
		p.TgtCnd_calc_ctg_cd_Label = p.beansFactory.createLabel("TgtCnd.calc_ctg_cd_Label");
		p.TgtCnd_calc_ctg_cd = p.beansFactory.createTextComboBox("TgtCnd.calc_ctg_cd");
		p.TgtCnd_calc_ctg_cd.setLabel(p.TgtCnd_calc_ctg_cd_Label);
		p.TgtCnd_calc_ctg_nm = p.beansFactory.createTextField("TgtCnd.calc_ctg_nm");
		p.TgtCnd_wg_cd_Label = p.beansFactory.createLabel("TgtCnd.wg_cd_Label");
		p.TgtCnd_wg_cd = p.beansFactory.createTextComboBox("TgtCnd.wg_cd");
		p.TgtCnd_wg_cd.setLabel(p.TgtCnd_wg_cd_Label);
		p.TgtCnd_wg_nm = p.beansFactory.createTextField("TgtCnd.wg_nm");
		p.TgtCnd_dt_Label = p.beansFactory.createLabel("TgtCnd.dt_Label");
		p.TgtCnd_dt = p.beansFactory.createDateField("TgtCnd.dt");
		p.TgtCnd_dt.setLabel(p.TgtCnd_dt_Label);
		p.TgtCnd_lump_flg = p.beansFactory.createCheckBox("TgtCnd.lump_flg");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_IMP = p.beansFactory.createRadioButton("Cnd.ope_IMP");
		p.Cnd_ope_LUMP_IMP = p.beansFactory.createRadioButton("Cnd.ope_LUMP_IMP");
		p.Cnd_cmn_flg = p.beansFactory.createCheckBox("Cnd.cmn_flg");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.calc_ctg_cd_Label");
		p.Cnd_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.calc_ctg_cd");
		p.Cnd_calc_ctg_cd.setLabel(p.Cnd_calc_ctg_cd_Label);
		p.Cnd_calc_ctg_nm = p.beansFactory.createTextField("Cnd.calc_ctg_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_par_itm_jnl_cd_Label = p.beansFactory.createLabel("Cnd.par_itm_jnl_cd_Label");
		p.Cnd_par_itm_jnl_cd = p.beansFactory.createTextComboBox("Cnd.par_itm_jnl_cd");
		p.Cnd_par_itm_jnl_cd.setLabel(p.Cnd_par_itm_jnl_cd_Label);
		p.Cnd_par_itm_jnl_nm = p.beansFactory.createTextField("Cnd.par_itm_jnl_nm");
		p.Cnd_no_exist_flg = p.beansFactory.createCheckBox("Cnd.no_exist_flg");
		p.Cnd_change_flg = p.beansFactory.createCheckBox("Cnd.change_flg");
		p.Cnd_exist_flg = p.beansFactory.createCheckBox("Cnd.exist_flg");
		p.Cnd_sep = p.beansFactory.createLabel("Cnd.sep");
		p.Cnd_imp_err_flg = p.beansFactory.createCheckBox("Cnd.imp_err_flg");
		p.Cnd_par_itm_grp_cd1_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd1_Label");
		p.Cnd_par_itm_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd1");
		p.Cnd_par_itm_grp_cd1.setLabel(p.Cnd_par_itm_grp_cd1_Label);
		p.Cnd_par_itm_grp_nm1 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm1");
		p.Cnd_par_itm_grp_cd2_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd2_Label");
		p.Cnd_par_itm_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd2");
		p.Cnd_par_itm_grp_cd2.setLabel(p.Cnd_par_itm_grp_cd2_Label);
		p.Cnd_par_itm_grp_nm2 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm2");
		p.Cnd_par_itm_grp_cd3_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd3_Label");
		p.Cnd_par_itm_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd3");
		p.Cnd_par_itm_grp_cd3.setLabel(p.Cnd_par_itm_grp_cd3_Label);
		p.Cnd_par_itm_grp_nm3 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm3");
		p.Cnd_par_itm_grp_cd4_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd4_Label");
		p.Cnd_par_itm_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd4");
		p.Cnd_par_itm_grp_cd4.setLabel(p.Cnd_par_itm_grp_cd4_Label);
		p.Cnd_par_itm_grp_nm4 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm4");
		p.Cnd_par_itm_grp_cd5_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd5_Label");
		p.Cnd_par_itm_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd5");
		p.Cnd_par_itm_grp_cd5.setLabel(p.Cnd_par_itm_grp_cd5_Label);
		p.Cnd_par_itm_grp_nm5 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm5");
		p.Cnd_par_itm_grp_cd6_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd6_Label");
		p.Cnd_par_itm_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd6");
		p.Cnd_par_itm_grp_cd6.setLabel(p.Cnd_par_itm_grp_cd6_Label);
		p.Cnd_par_itm_grp_nm6 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm6");
		p.Cnd_par_itm_grp_cd7_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd7_Label");
		p.Cnd_par_itm_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd7");
		p.Cnd_par_itm_grp_cd7.setLabel(p.Cnd_par_itm_grp_cd7_Label);
		p.Cnd_par_itm_grp_nm7 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm7");
		p.Cnd_par_itm_grp_cd8_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd8_Label");
		p.Cnd_par_itm_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd8");
		p.Cnd_par_itm_grp_cd8.setLabel(p.Cnd_par_itm_grp_cd8_Label);
		p.Cnd_par_itm_grp_nm8 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm8");
		p.Cnd_par_itm_grp_cd9_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd9_Label");
		p.Cnd_par_itm_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd9");
		p.Cnd_par_itm_grp_cd9.setLabel(p.Cnd_par_itm_grp_cd9_Label);
		p.Cnd_par_itm_grp_nm9 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm9");
		p.Cnd_par_itm_grp_cd10_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd10_Label");
		p.Cnd_par_itm_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd10");
		p.Cnd_par_itm_grp_cd10.setLabel(p.Cnd_par_itm_grp_cd10_Label);
		p.Cnd_par_itm_grp_nm10 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm10");
		p.Cnd_disp_key = p.beansFactory.createCheckBox("Cnd.disp_key");
		p.Cnd_srch_cmn = p.beansFactory.createButton("Cnd.srch_cmn");
		p.Cnd_srch_wg = p.beansFactory.createButton("Cnd.srch_wg");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tbl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTbl(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.TblPanel = p.beansFactory.createPanel("Tbl");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_calc_ctg_cd_Label = p.beansFactory.createLabel("Hdr.calc_ctg_cd_Label");
		p.Hdr_calc_ctg_cd = p.beansFactory.createTextField("Hdr.calc_ctg_cd");
		p.Hdr_calc_ctg_cd.setLabel(p.Hdr_calc_ctg_cd_Label);
		p.Hdr_calc_ctg_nm = p.beansFactory.createTextField("Hdr.calc_ctg_nm");
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextField("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_term_Label = p.beansFactory.createLabel("Hdr.term_Label");
		p.Hdr_term = p.beansFactory.createDateField("Hdr.term");
		p.Hdr_term.setLabel(p.Hdr_term_Label);
		p.Hdr_term_nm = p.beansFactory.createTextField("Hdr.term_nm");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_no_exist_flg = p.beansFactory.createTableColumn("Rslt.no_exist_flg", MCColumnType.CHECK);
		p.columnRslt_change_flg = p.beansFactory.createTableColumn("Rslt.change_flg", MCColumnType.CHECK);
		p.columnRslt_par_itm_typ = p.beansFactory.createTableColumn("Rslt.par_itm_typ", MCColumnType.TEXT);
		p.columnRslt_par_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.par_itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_par_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.par_itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_par_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.par_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_par_itm_jnl_cd = p.beansFactory.createTableColumn("Rslt.par_itm_jnl_cd", MCColumnType.TEXT);
		p.columnRslt_par_itm_jnl_nm = p.beansFactory.createTableColumn("Rslt.par_itm_jnl_nm", MCColumnType.TEXT);
		p.columnRslt_bom_ptn = p.beansFactory.createTableColumn("Rslt.bom_ptn", MCColumnType.TEXT);
		p.columnRslt_oper_cd = p.beansFactory.createTableColumn("Rslt.oper_cd", MCColumnType.TEXT);
		p.columnRslt_oper_nm = p.beansFactory.createTableColumn("Rslt.oper_nm", MCColumnType.TEXT);
		p.columnRslt_oper_seq = p.beansFactory.createTableColumn("Rslt.oper_seq", MCColumnType.NUMBER);
		p.columnRslt_chd_itm_typ = p.beansFactory.createTableColumn("Rslt.chd_itm_typ", MCColumnType.TEXT);
		p.columnRslt_chd_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.chd_itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_chd_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.chd_itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_chd_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.chd_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_chd_itm_jnl_cd = p.beansFactory.createTableColumn("Rslt.chd_itm_jnl_cd", MCColumnType.TEXT);
		p.columnRslt_chd_itm_jnl_nm = p.beansFactory.createTableColumn("Rslt.chd_itm_jnl_nm", MCColumnType.TEXT);
		p.columnRslt_alt_grp_cd = p.beansFactory.createTableColumn("Rslt.alt_grp_cd", MCColumnType.TEXT);
		p.columnRslt_alt_grp_nm = p.beansFactory.createTableColumn("Rslt.alt_grp_nm", MCColumnType.TEXT);
		p.columnRslt_expns_cd = p.beansFactory.createTableColumn("Rslt.expns_cd", MCColumnType.TEXT);
		p.columnRslt_expns_nm = p.beansFactory.createTableColumn("Rslt.expns_nm", MCColumnType.TEXT);
		p.columnRslt_disp_seq = p.beansFactory.createTableColumn("Rslt.disp_seq", MCColumnType.NUMBER);
		p.columnRslt_par_unit_cd = p.beansFactory.createTableColumn("Rslt.par_unit_cd", MCColumnType.TEXT);
		p.columnRslt_par_unit_nm = p.beansFactory.createTableColumn("Rslt.par_unit_nm", MCColumnType.TEXT);
		p.columnRslt_par_dec_place = p.beansFactory.createTableColumn("Rslt.par_dec_place", MCColumnType.NUMBER);
		p.columnRslt_chd_unit_cd = p.beansFactory.createTableColumn("Rslt.chd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_chd_unit_nm = p.beansFactory.createTableColumn("Rslt.chd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_chd_dec_place = p.beansFactory.createTableColumn("Rslt.chd_dec_place", MCColumnType.NUMBER);
		p.columnRslt_alt_itm_ratio = p.beansFactory.createTableColumn("Rslt.alt_itm_ratio", MCColumnType.NUMBER);
		p.columnRslt_rmrks = p.beansFactory.createTableColumn("Rslt.rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_non_calc_flg = p.beansFactory.createTableColumn("Rslt.non_calc_flg", MCColumnType.CHECK);
		p.columnRslt_imp_err_flg = p.beansFactory.createTableColumn("Rslt.imp_err_flg", MCColumnType.CHECK);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
		p.columnRslt_key_flg = p.beansFactory.createTableColumn("Rslt.key_flg", MCColumnType.CHECK);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBDP0530 = p.beansFactory.createButton("Btn.open_MGBDP0530", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_upd_lump = p.beansFactory.createButton("Btn.upd_lump", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.RegTargetPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRegTarget(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.RegTargetPanel.setBorder(p.RegTargetTitledBorder);
		p.add(p.RegTargetPanel);
		p.RegTargetPanel.setNextBeans(p.TopPanel);
		p.RegTargetPanel.setValueCheck(false);
		p.RegTargetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RegTargetPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.TblPanel);
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
	protected static void jbInitFold(MGBDP_CopyBom p) {
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
	protected static void jbInitTab1(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.TgtCndPanel, null);
		p.Tab1Panel.setLastBeans(p.TgtCndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.CndPanel, null);
		p.Tab2Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.Cnd2Panel, null);
		p.Tab3Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [TgtCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTgtCnd(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.TgtCndPanel.setValueCheck(false);
		p.TgtCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TgtCndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.TgtCnd_calc_ctg_cd.setListType(MCListType.STRICT);
		p.TgtCnd_calc_ctg_cd.setLinkBeans(p.TgtCnd_calc_ctg_nm);
		p.TgtCndPanel.add(p.TgtCnd_calc_ctg_cd_Label);
		p.TgtCndPanel.add(p.TgtCnd_calc_ctg_cd);
		p.TgtCndPanel.setLastBeans(p.TgtCnd_calc_ctg_cd);
		p.TgtCnd_calc_ctg_cd.setNextBeans(p.TgtCnd_calc_ctg_nm);
		p.TgtCnd_calc_ctg_cd.setRow(p.getTgtCndR(), mcframe.clientMGBD.MGBDP0420.TgtCndR.calc_ctg_cd_META);
		p.TgtCndPanel.add(p.TgtCnd_calc_ctg_nm);
		p.TgtCnd_calc_ctg_nm.setNextBeans(p.TgtCnd_wg_cd);
		p.TgtCnd_calc_ctg_nm.setRow(p.getTgtCndR(), mcframe.clientMGBD.MGBDP0420.TgtCndR.calc_ctg_nm_META);
		p.TgtCnd_wg_cd.setListType(MCListType.STRICT);
		p.TgtCnd_wg_cd.setLinkBeans(p.TgtCnd_wg_nm);
		p.TgtCndPanel.add(p.TgtCnd_wg_cd_Label);
		p.TgtCndPanel.add(p.TgtCnd_wg_cd);
		p.TgtCnd_wg_cd.setNextBeans(p.TgtCnd_wg_nm);
		p.TgtCnd_wg_cd.setRow(p.getTgtCndR(), mcframe.clientMGBD.MGBDP0420.TgtCndR.wg_cd_META);
		p.TgtCndPanel.add(p.TgtCnd_wg_nm);
		p.TgtCnd_wg_nm.setNextBeans(p.TgtCnd_term_p_PPanel);
		p.TgtCnd_wg_nm.setRow(p.getTgtCndR(), mcframe.clientMGBD.MGBDP0420.TgtCndR.wg_nm_META);
		p.TgtCndPanel.add(p.TgtCnd_term_p_PPanel);
		p.TgtCnd_term_p_PPanel.setNextBeans(p.TgtCnd_dt);
		p.TgtCndPanel.add(p.TgtCnd_dt_Label);
		p.TgtCndPanel.add(p.TgtCnd_dt);
		p.TgtCnd_dt.setNextBeans(p.TgtCnd_lump_flg);
		p.TgtCnd_dt.setRow(p.getTgtCndR(), mcframe.clientMGBD.MGBDP0420.TgtCndR.dt_META);
		p.TgtCnd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.TgtCndPanel.add(p.TgtCnd_lump_flg);
		p.TgtCnd_lump_flg.setRow(p.getTgtCndR(), mcframe.clientMGBD.MGBDP0420.TgtCndR.lump_flg_META);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_IMP);
		p.Cnd_ope_IMP.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_IMP);
		p.ScreenOpePanel.add(p.Cnd_ope_IMP);
		p.Cnd_ope_IMP.setNextBeans(p.Cnd_ope_LUMP_IMP);
		p.Cnd_ope_LUMP_IMP.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_LUMP_IMP);
		p.ScreenOpePanel.add(p.Cnd_ope_LUMP_IMP);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.ope_META);
		p.RegTargetPanel.add(p.Cnd_cmn_flg);
		p.RegTargetPanel.setLastBeans(p.Cnd_cmn_flg);
		p.Cnd_cmn_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_cmn_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.cmn_flg_META);
		p.RegTargetPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.wg_flg_META);
		p.Cnd_calc_ctg_cd.setListType(MCListType.STRICT);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ctg_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.calc_ctg_nm_META);
		p.Cnd_wg_cd.setListType(MCListType.STRICT);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_term_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.wg_nm_META);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_par_itm_typ_p_PPanel);
		p.CndPanel.add(p.Cnd_par_itm_typ_p_PPanel);
		p.Cnd_par_itm_typ_p_PPanel.setNextBeans(p.Cnd_par_itm_jnl_cd);
		p.Cnd_par_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_jnl_cd, true);
		p.Cnd_par_itm_jnl_cd.setLinkBeans(p.Cnd_par_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_par_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_par_itm_jnl_cd);
		p.Cnd_par_itm_jnl_cd.setNextBeans(p.Cnd_par_itm_jnl_nm);
		p.Cnd_par_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_par_itm_jnl_nm);
		p.Cnd_par_itm_jnl_nm.setNextBeans(p.Cnd_par_itm_p_PPanel);
		p.Cnd_par_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_jnl_nm_META);
		p.setPluralValueEnable(p.Cnd_par_itm_jnl_nm, true);
		p.CndPanel.add(p.Cnd_par_itm_p_PPanel);
		p.Cnd_par_itm_p_PPanel.setNextBeans(p.Cnd_no_exist_flg);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub1,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_sub3, true);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_par_itm_nm);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_no_exist_flg);
		p.Cnd_no_exist_flg.setNextBeans(p.Cnd_change_flg);
		p.Cnd_no_exist_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.no_exist_flg_META);
		p.CndPanel.add(p.Cnd_change_flg);
		p.Cnd_change_flg.setNextBeans(p.Cnd_exist_flg);
		p.Cnd_change_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.change_flg_META);
		p.CndPanel.add(p.Cnd_exist_flg);
		p.Cnd_exist_flg.setNextBeans(p.Cnd_imp_err_flg);
		p.Cnd_exist_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.exist_flg_META);
		p.CndPanel.add(p.Cnd_sep);
		p.CndPanel.add(p.Cnd_imp_err_flg);
		p.Cnd_imp_err_flg.setNextBeans(p.Cnd_srch_cmn);
		p.Cnd_imp_err_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.imp_err_flg_META);
		p.Cnd_par_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd1, true);
		p.Cnd_par_itm_grp_cd1.setLinkBeans(p.Cnd_par_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_par_itm_grp_cd1);
		p.Cnd_par_itm_grp_cd1.setNextBeans(p.Cnd_par_itm_grp_nm1);
		p.Cnd_par_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm1);
		p.Cnd_par_itm_grp_nm1.setNextBeans(p.Cnd_par_itm_grp_cd2);
		p.Cnd_par_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm1, true);
		p.Cnd_par_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd2, true);
		p.Cnd_par_itm_grp_cd2.setLinkBeans(p.Cnd_par_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd2);
		p.Cnd_par_itm_grp_cd2.setNextBeans(p.Cnd_par_itm_grp_nm2);
		p.Cnd_par_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm2);
		p.Cnd_par_itm_grp_nm2.setNextBeans(p.Cnd_par_itm_grp_cd3);
		p.Cnd_par_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm2, true);
		p.Cnd_par_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd3, true);
		p.Cnd_par_itm_grp_cd3.setLinkBeans(p.Cnd_par_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd3);
		p.Cnd_par_itm_grp_cd3.setNextBeans(p.Cnd_par_itm_grp_nm3);
		p.Cnd_par_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm3);
		p.Cnd_par_itm_grp_nm3.setNextBeans(p.Cnd_par_itm_grp_cd4);
		p.Cnd_par_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm3, true);
		p.Cnd_par_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd4, true);
		p.Cnd_par_itm_grp_cd4.setLinkBeans(p.Cnd_par_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd4);
		p.Cnd_par_itm_grp_cd4.setNextBeans(p.Cnd_par_itm_grp_nm4);
		p.Cnd_par_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm4);
		p.Cnd_par_itm_grp_nm4.setNextBeans(p.Cnd_par_itm_grp_cd5);
		p.Cnd_par_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm4, true);
		p.Cnd_par_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd5, true);
		p.Cnd_par_itm_grp_cd5.setLinkBeans(p.Cnd_par_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd5);
		p.Cnd_par_itm_grp_cd5.setNextBeans(p.Cnd_par_itm_grp_nm5);
		p.Cnd_par_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm5);
		p.Cnd_par_itm_grp_nm5.setNextBeans(p.Cnd_par_itm_grp_cd6);
		p.Cnd_par_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm5, true);
		p.Cnd_par_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd6, true);
		p.Cnd_par_itm_grp_cd6.setLinkBeans(p.Cnd_par_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd6);
		p.Cnd_par_itm_grp_cd6.setNextBeans(p.Cnd_par_itm_grp_nm6);
		p.Cnd_par_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm6);
		p.Cnd_par_itm_grp_nm6.setNextBeans(p.Cnd_par_itm_grp_cd7);
		p.Cnd_par_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm6, true);
		p.Cnd_par_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd7, true);
		p.Cnd_par_itm_grp_cd7.setLinkBeans(p.Cnd_par_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd7);
		p.Cnd_par_itm_grp_cd7.setNextBeans(p.Cnd_par_itm_grp_nm7);
		p.Cnd_par_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm7);
		p.Cnd_par_itm_grp_nm7.setNextBeans(p.Cnd_par_itm_grp_cd8);
		p.Cnd_par_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm7, true);
		p.Cnd_par_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd8, true);
		p.Cnd_par_itm_grp_cd8.setLinkBeans(p.Cnd_par_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd8);
		p.Cnd_par_itm_grp_cd8.setNextBeans(p.Cnd_par_itm_grp_nm8);
		p.Cnd_par_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm8);
		p.Cnd_par_itm_grp_nm8.setNextBeans(p.Cnd_par_itm_grp_cd9);
		p.Cnd_par_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm8, true);
		p.Cnd_par_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd9, true);
		p.Cnd_par_itm_grp_cd9.setLinkBeans(p.Cnd_par_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd9);
		p.Cnd_par_itm_grp_cd9.setNextBeans(p.Cnd_par_itm_grp_nm9);
		p.Cnd_par_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm9);
		p.Cnd_par_itm_grp_nm9.setNextBeans(p.Cnd_par_itm_grp_cd10);
		p.Cnd_par_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm9, true);
		p.Cnd_par_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd10, true);
		p.Cnd_par_itm_grp_cd10.setLinkBeans(p.Cnd_par_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_cd10);
		p.Cnd_par_itm_grp_cd10.setNextBeans(p.Cnd_par_itm_grp_nm10);
		p.Cnd_par_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_par_itm_grp_nm10);
		p.Cnd_par_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.par_itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm10, true);
		p.HdrPanel.add(p.Cnd_disp_key);
		p.Cnd_disp_key.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0420.CndR.disp_key_META);
		p.Cnd_srch_cmn.setIcon("SEARCH");
		p.CndPanel.add(p.Cnd_srch_cmn);
		p.Cnd_srch_cmn.setNextBeans(p.Cnd_srch_wg);
		p.Cnd_srch_wg.setIcon("SEARCH");
		p.CndPanel.add(p.Cnd_srch_wg);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Tbl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTbl(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.add(p.TblPanel);
		p.TblPanel.setNextBeans(p.BtnPanel);
		p.TblPanel.setLayoutPosition("CBC+");
		// ブロックの項目の初期化
		p.TblPanel.add(p.HdrPanel, null);
		p.TblPanel.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.RsltPanel);
		p.TblPanel.add(p.RsltPanel, null);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.HdrPanel.setValueCheck(false);
		p.HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_calc_ctg_cd_Label);
		p.HdrPanel.add(p.Hdr_calc_ctg_cd);
		p.HdrPanel.setLastBeans(p.Hdr_calc_ctg_cd);
		p.Hdr_calc_ctg_cd.setNextBeans(p.Hdr_calc_ctg_nm);
		p.Hdr_calc_ctg_cd.setRow(p.getHdrR(), mcframe.clientMGBD.MGBDP0420.HdrR.calc_ctg_cd_META);
		p.HdrPanel.add(p.Hdr_calc_ctg_nm);
		p.Hdr_calc_ctg_nm.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_calc_ctg_nm.setRow(p.getHdrR(), mcframe.clientMGBD.MGBDP0420.HdrR.calc_ctg_nm_META);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMGBD.MGBDP0420.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_term);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMGBD.MGBDP0420.HdrR.wg_nm_META);
		p.HdrPanel.add(p.Hdr_term_Label);
		p.HdrPanel.add(p.Hdr_term);
		p.Hdr_term.setNextBeans(p.Hdr_term_nm);
		p.Hdr_term.setRow(p.getHdrR(), mcframe.clientMGBD.MGBDP0420.HdrR.term_META);
		p.Hdr_term.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.HdrPanel.add(p.Hdr_term_nm);
		p.Hdr_term_nm.setNextBeans(p.Cnd_disp_key);
		p.Hdr_term_nm.setRow(p.getHdrR(), mcframe.clientMGBD.MGBDP0420.HdrR.term_nm_META);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBDP_CopyBom p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MGBDP0530.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBDP0530);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBDP0530);
		p.Btn_open_MGBDP0530.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_upd_lump);
		p.Btn_upd_lump.setIcon("REGISTER");
		p.Btn_upd_lump.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_lump);
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
		MGBDP_CopyBom_MC.mcInitScreenOpe((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.mcInitRegTarget((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.mcInitTop((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.mcInitFold((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.mcInitTab1((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.mcInitTab2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.mcInitTab3((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.mcInitTgtCnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.mcInitCnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.mcInitCnd2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.mcInitCtrl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.mcInitTbl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.mcInitHdr((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.mcInitRslt((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.mcInitBtn((MGBDP_CopyBom)this);

		// [INS]ステータスのモードの設定
		MGBDP_CopyBom_MC.statusInitINS_ScreenOpe((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitINS_RegTarget((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitINS_Top((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitINS_Fold((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitINS_Tab1((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitINS_Tab2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitINS_Tab3((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitINS_TgtCnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitINS_Cnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitINS_Cnd2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitINS_Ctrl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitINS_Tbl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitINS_Hdr((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitINS_Rslt((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitINS_Btn((MGBDP_CopyBom)this);

		// [SRCH_UPD]ステータスのモードの設定
		MGBDP_CopyBom_MC.statusInitSRCH__UPD_ScreenOpe((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitSRCH__UPD_RegTarget((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitSRCH__UPD_Top((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitSRCH__UPD_Fold((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitSRCH__UPD_Tab1((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitSRCH__UPD_Tab2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitSRCH__UPD_Tab3((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitSRCH__UPD_TgtCnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitSRCH__UPD_Cnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitSRCH__UPD_Cnd2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitSRCH__UPD_Ctrl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitSRCH__UPD_Tbl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitSRCH__UPD_Hdr((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitSRCH__UPD_Rslt((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitSRCH__UPD_Btn((MGBDP_CopyBom)this);

		// [UPD]ステータスのモードの設定
		MGBDP_CopyBom_MC.statusInitUPD_ScreenOpe((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD_RegTarget((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD_Top((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD_Fold((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD_Tab1((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD_Tab2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD_Tab3((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD_TgtCnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD_Cnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD_Cnd2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD_Ctrl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD_Tbl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD_Hdr((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD_Rslt((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD_Btn((MGBDP_CopyBom)this);

		// [FIX_U]ステータスのモードの設定
		MGBDP_CopyBom_MC.statusInitFIX__U_ScreenOpe((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitFIX__U_RegTarget((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitFIX__U_Top((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitFIX__U_Fold((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitFIX__U_Tab1((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitFIX__U_Tab2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitFIX__U_Tab3((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitFIX__U_TgtCnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitFIX__U_Cnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitFIX__U_Cnd2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitFIX__U_Ctrl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitFIX__U_Tbl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitFIX__U_Hdr((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitFIX__U_Rslt((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitFIX__U_Btn((MGBDP_CopyBom)this);

		// [UPD_LUMP]ステータスのモードの設定
		MGBDP_CopyBom_MC.statusInitUPD__LUMP_ScreenOpe((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD__LUMP_RegTarget((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD__LUMP_Top((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD__LUMP_Fold((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD__LUMP_Tab1((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD__LUMP_Tab2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD__LUMP_Tab3((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD__LUMP_TgtCnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD__LUMP_Cnd((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD__LUMP_Cnd2((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD__LUMP_Ctrl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD__LUMP_Tbl((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD__LUMP_Hdr((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD__LUMP_Rslt((MGBDP_CopyBom)this);
		MGBDP_CopyBom_MC.statusInitUPD__LUMP_Btn((MGBDP_CopyBom)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBDP_CopyBom p) {
	}

	/**
	 *  [RegTarget]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRegTarget(MGBDP_CopyBom p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBDP_CopyBom p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBDP_CopyBom p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBDP_CopyBom p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBDP_CopyBom p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MGBDP_CopyBom p) {
	}

	/**
	 *  [TgtCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTgtCnd(MGBDP_CopyBom p) {
		p.TgtCnd_calc_ctg_cd.setListListener(p);
		p.TgtCnd_calc_ctg_cd.addAllListener(p);
		p.TgtCnd_calc_ctg_nm.setListListener(p);
		p.TgtCnd_calc_ctg_nm.addAllListener(p);
		p.TgtCnd_wg_cd.setListListener(p);
		p.TgtCnd_wg_cd.addAllListener(p);
		p.TgtCnd_wg_nm.setListListener(p);
		p.TgtCnd_wg_nm.addAllListener(p);
		p.TgtCnd_dt.setListListener(p);
		p.TgtCnd_dt.addAllListener(p);
		p.TgtCnd_lump_flg.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_CopyBom p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_IMP.addAllListener(p);
		p.Cnd_ope_LUMP_IMP.addAllListener(p);
		p.Cnd_cmn_flg.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_calc_ctg_cd.setListListener(p);
		p.Cnd_calc_ctg_cd.addAllListener(p);
		p.Cnd_calc_ctg_nm.setListListener(p);
		p.Cnd_calc_ctg_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_par_itm_jnl_cd.setListListener(p);
		p.Cnd_par_itm_jnl_cd.addAllListener(p);
		p.Cnd_par_itm_jnl_nm.setListListener(p);
		p.Cnd_par_itm_jnl_nm.addAllListener(p);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_no_exist_flg.addAllListener(p);
		p.Cnd_change_flg.addAllListener(p);
		p.Cnd_exist_flg.addAllListener(p);
		p.Cnd_imp_err_flg.addAllListener(p);
		p.Cnd_par_itm_grp_cd1.setListListener(p);
		p.Cnd_par_itm_grp_cd1.addAllListener(p);
		p.Cnd_par_itm_grp_nm1.setListListener(p);
		p.Cnd_par_itm_grp_nm1.addAllListener(p);
		p.Cnd_par_itm_grp_cd2.setListListener(p);
		p.Cnd_par_itm_grp_cd2.addAllListener(p);
		p.Cnd_par_itm_grp_nm2.setListListener(p);
		p.Cnd_par_itm_grp_nm2.addAllListener(p);
		p.Cnd_par_itm_grp_cd3.setListListener(p);
		p.Cnd_par_itm_grp_cd3.addAllListener(p);
		p.Cnd_par_itm_grp_nm3.setListListener(p);
		p.Cnd_par_itm_grp_nm3.addAllListener(p);
		p.Cnd_par_itm_grp_cd4.setListListener(p);
		p.Cnd_par_itm_grp_cd4.addAllListener(p);
		p.Cnd_par_itm_grp_nm4.setListListener(p);
		p.Cnd_par_itm_grp_nm4.addAllListener(p);
		p.Cnd_par_itm_grp_cd5.setListListener(p);
		p.Cnd_par_itm_grp_cd5.addAllListener(p);
		p.Cnd_par_itm_grp_nm5.setListListener(p);
		p.Cnd_par_itm_grp_nm5.addAllListener(p);
		p.Cnd_par_itm_grp_cd6.setListListener(p);
		p.Cnd_par_itm_grp_cd6.addAllListener(p);
		p.Cnd_par_itm_grp_nm6.setListListener(p);
		p.Cnd_par_itm_grp_nm6.addAllListener(p);
		p.Cnd_par_itm_grp_cd7.setListListener(p);
		p.Cnd_par_itm_grp_cd7.addAllListener(p);
		p.Cnd_par_itm_grp_nm7.setListListener(p);
		p.Cnd_par_itm_grp_nm7.addAllListener(p);
		p.Cnd_par_itm_grp_cd8.setListListener(p);
		p.Cnd_par_itm_grp_cd8.addAllListener(p);
		p.Cnd_par_itm_grp_nm8.setListListener(p);
		p.Cnd_par_itm_grp_nm8.addAllListener(p);
		p.Cnd_par_itm_grp_cd9.setListListener(p);
		p.Cnd_par_itm_grp_cd9.addAllListener(p);
		p.Cnd_par_itm_grp_nm9.setListListener(p);
		p.Cnd_par_itm_grp_nm9.addAllListener(p);
		p.Cnd_par_itm_grp_cd10.setListListener(p);
		p.Cnd_par_itm_grp_cd10.addAllListener(p);
		p.Cnd_par_itm_grp_nm10.setListListener(p);
		p.Cnd_par_itm_grp_nm10.addAllListener(p);
		p.Cnd_disp_key.addAllListener(p);
		p.Cnd_srch_cmn.addAllListener(p);
		p.Cnd_srch_cmn.setAPMethodName("doCnd_srch_cmn");
		p.Cnd_srch_wg.addAllListener(p);
		p.Cnd_srch_wg.setAPMethodName("doCnd_srch_wg");
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBDP_CopyBom p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBDP_CopyBom p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Tbl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTbl(MGBDP_CopyBom p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MGBDP_CopyBom p) {
		p.Hdr_calc_ctg_cd.setListListener(p);
		p.Hdr_calc_ctg_cd.addAllListener(p);
		p.Hdr_calc_ctg_nm.setListListener(p);
		p.Hdr_calc_ctg_nm.addAllListener(p);
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_term.setListListener(p);
		p.Hdr_term.addAllListener(p);
		p.Hdr_term_nm.setListListener(p);
		p.Hdr_term_nm.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBDP_CopyBom p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_no_exist_flg.addAllListener(p);
		p.columnRslt_change_flg.addAllListener(p);
		p.columnRslt_par_itm_typ.addAllListener(p);
		p.columnRslt_par_itm_typ.setListListener(p);
		p.columnRslt_par_itm_typ_nm.addAllListener(p);
		p.columnRslt_par_itm_typ_nm.setListListener(p);
		p.columnRslt_par_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_par_itm_typ_d_cd.setListListener(p);
		p.columnRslt_par_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_par_itm_typ_d_nm.setListListener(p);
		p.columnRslt_par_itm_jnl_cd.addAllListener(p);
		p.columnRslt_par_itm_jnl_cd.setListListener(p);
		p.columnRslt_par_itm_jnl_nm.addAllListener(p);
		p.columnRslt_par_itm_jnl_nm.setListListener(p);
		p.columnRslt_bom_ptn.addAllListener(p);
		p.columnRslt_bom_ptn.setListListener(p);
		p.columnRslt_oper_cd.addAllListener(p);
		p.columnRslt_oper_cd.setListListener(p);
		p.columnRslt_oper_nm.addAllListener(p);
		p.columnRslt_oper_nm.setListListener(p);
		p.columnRslt_oper_seq.addAllListener(p);
		p.columnRslt_oper_seq.setListListener(p);
		p.columnRslt_chd_itm_typ.addAllListener(p);
		p.columnRslt_chd_itm_typ.setListListener(p);
		p.columnRslt_chd_itm_typ_nm.addAllListener(p);
		p.columnRslt_chd_itm_typ_nm.setListListener(p);
		p.columnRslt_chd_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_chd_itm_typ_d_cd.setListListener(p);
		p.columnRslt_chd_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_chd_itm_typ_d_nm.setListListener(p);
		p.columnRslt_chd_itm_jnl_cd.addAllListener(p);
		p.columnRslt_chd_itm_jnl_cd.setListListener(p);
		p.columnRslt_chd_itm_jnl_nm.addAllListener(p);
		p.columnRslt_chd_itm_jnl_nm.setListListener(p);
		p.columnRslt_alt_grp_cd.addAllListener(p);
		p.columnRslt_alt_grp_cd.setListListener(p);
		p.columnRslt_alt_grp_nm.addAllListener(p);
		p.columnRslt_alt_grp_nm.setListListener(p);
		p.columnRslt_expns_cd.addAllListener(p);
		p.columnRslt_expns_cd.setListListener(p);
		p.columnRslt_expns_nm.addAllListener(p);
		p.columnRslt_expns_nm.setListListener(p);
		p.columnRslt_disp_seq.addAllListener(p);
		p.columnRslt_disp_seq.setListListener(p);
		p.columnRslt_par_unit_cd.addAllListener(p);
		p.columnRslt_par_unit_cd.setListListener(p);
		p.columnRslt_par_unit_nm.addAllListener(p);
		p.columnRslt_par_unit_nm.setListListener(p);
		p.columnRslt_par_dec_place.addAllListener(p);
		p.columnRslt_par_dec_place.setListListener(p);
		p.columnRslt_chd_unit_cd.addAllListener(p);
		p.columnRslt_chd_unit_cd.setListListener(p);
		p.columnRslt_chd_unit_nm.addAllListener(p);
		p.columnRslt_chd_unit_nm.setListListener(p);
		p.columnRslt_chd_dec_place.addAllListener(p);
		p.columnRslt_chd_dec_place.setListListener(p);
		p.columnRslt_alt_itm_ratio.addAllListener(p);
		p.columnRslt_alt_itm_ratio.setListListener(p);
		p.columnRslt_rmrks.addAllListener(p);
		p.columnRslt_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_non_calc_flg.addAllListener(p);
		p.columnRslt_imp_err_flg.addAllListener(p);
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
		p.columnRslt_key_flg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBDP_CopyBom p) {
		p.Btn_open_MGBDP0530.addAllListener(p);
		p.Btn_open_MGBDP0530.setAPMethodName("doBtn_open_MGBDP0530");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_upd_lump.addAllListener(p);
		p.Btn_upd_lump.setAPMethodName("doBtn_upd_lump");
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MGBDP_CopyBom p){

	}

	/**
	 * [INS]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitINS_RegTarget(MGBDP_CopyBom p){

	}

	/**
	 * [INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS_Top(MGBDP_CopyBom p){

	}

	/**
	 * [INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS_Fold(MGBDP_CopyBom p){

	}

	/**
	 * [INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab1(MGBDP_CopyBom p){

	}

	/**
	 * [INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab2(MGBDP_CopyBom p){

	}

	/**
	 * [INS]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab3(MGBDP_CopyBom p){

	}

	/**
	 * [INS]ステータスの[TgtCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_TgtCnd(MGBDP_CopyBom p){
		p.TgtCnd_calc_ctg_cd.putMode(p, INS, MCMode.REQUIRED);
		p.TgtCnd_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.TgtCnd_wg_cd.putMode(p, INS, MCMode.REQUIRED);
		p.TgtCnd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.TgtCnd_term_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.TgtCnd_dt.putMode(p, INS, MCMode.ENABLE);
		p.TgtCnd_lump_flg.putMode(p, INS, MCMode.REQUIRED);

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MGBDP_CopyBom p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_par_itm_jnl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_jnl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_no_exist_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_change_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_exist_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sep.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_imp_err_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd4.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm4.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd5.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm5.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd6.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm6.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd7.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm7.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd8.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm8.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd9.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm9.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd10.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm10.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_disp_key.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd2(MGBDP_CopyBom p){

	}

	/**
	 * [INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ctrl(MGBDP_CopyBom p){
		p.Ctrl_ctrl_PPanel.putStatus(INS, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [INS]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tbl(MGBDP_CopyBom p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MGBDP_CopyBom p){
		p.Hdr_calc_ctg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_term.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_term_nm.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MGBDP_CopyBom p){
		p.columnRslt_check.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_no_exist_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_change_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_par_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_par_itm_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_par_itm_jnl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_par_itm_jnl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_chd_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_jnl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_jnl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_expns_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_expns_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_par_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_par_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_par_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_par_rqmt_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_chd_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_chd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_chd_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_chd_rqmt_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_base_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_min_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_batch_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_alt_itm_ratio.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_imp_err_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_key_flg.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MGBDP_CopyBom p){
		p.Btn_open_MGBDP0530.putMode(p, INS, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, INS, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_upd_lump.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ScreenOpe(MGBDP_CopyBom p){

	}

	/**
	 * [SRCH_UPD]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_RegTarget(MGBDP_CopyBom p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Top(MGBDP_CopyBom p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Fold(MGBDP_CopyBom p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab1(MGBDP_CopyBom p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab2(MGBDP_CopyBom p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab3(MGBDP_CopyBom p){

	}

	/**
	 * [SRCH_UPD]ステータスの[TgtCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_TgtCnd(MGBDP_CopyBom p){
		p.TgtCnd_calc_ctg_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.TgtCnd_calc_ctg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.TgtCnd_wg_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.TgtCnd_wg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.TgtCnd_term_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.TgtCnd_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.TgtCnd_lump_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd(MGBDP_CopyBom p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_par_itm_jnl_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_jnl_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_no_exist_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_change_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_exist_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_sep.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_imp_err_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_cd1.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm1.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd2.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm2.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd3.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm3.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd4.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm4.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd5.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm5.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd6.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm6.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd7.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm7.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd8.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm8.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd9.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm9.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd10.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm10.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_disp_key.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd2(MGBDP_CopyBom p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Ctrl(MGBDP_CopyBom p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tbl(MGBDP_CopyBom p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Hdr(MGBDP_CopyBom p){
		p.Hdr_calc_ctg_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_term.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_term_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Rslt(MGBDP_CopyBom p){
		p.columnRslt_check.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_no_exist_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_change_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_par_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_par_itm_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_jnl_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_jnl_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_chd_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_jnl_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_jnl_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_expns_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_expns_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_par_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_par_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_par_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_par_rqmt_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_chd_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_chd_rqmt_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_base_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_min_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_batch_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_alt_itm_ratio.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_imp_err_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_key_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Btn(MGBDP_CopyBom p){
		p.Btn_open_MGBDP0530.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd_lump.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MGBDP_CopyBom p){

	}

	/**
	 * [UPD]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RegTarget(MGBDP_CopyBom p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MGBDP_CopyBom p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MGBDP_CopyBom p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MGBDP_CopyBom p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MGBDP_CopyBom p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MGBDP_CopyBom p){

	}

	/**
	 * [UPD]ステータスの[TgtCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TgtCnd(MGBDP_CopyBom p){
		p.TgtCnd_calc_ctg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.TgtCnd_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.TgtCnd_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.TgtCnd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.TgtCnd_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.TgtCnd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.TgtCnd_lump_flg.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBDP_CopyBom p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_par_itm_jnl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_jnl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_no_exist_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_change_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_exist_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sep.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_imp_err_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_disp_key.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_srch_cmn.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MGBDP_CopyBom p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MGBDP_CopyBom p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tbl(MGBDP_CopyBom p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MGBDP_CopyBom p){
		p.Hdr_calc_ctg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_term.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_term_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MGBDP_CopyBom p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_no_exist_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_change_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_par_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_par_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_jnl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_par_itm_jnl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_chd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_jnl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_jnl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_expns_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_par_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_par_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_par_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_par_rqmt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_chd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_chd_rqmt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_base_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_min_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_batch_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_alt_itm_ratio.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_imp_err_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_key_flg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MGBDP_CopyBom p){
		p.Btn_open_MGBDP0530.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_lump.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MGBDP_CopyBom p){

	}

	/**
	 * [FIX_U]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RegTarget(MGBDP_CopyBom p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MGBDP_CopyBom p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MGBDP_CopyBom p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MGBDP_CopyBom p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MGBDP_CopyBom p){

	}

	/**
	 * [FIX_U]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab3(MGBDP_CopyBom p){

	}

	/**
	 * [FIX_U]ステータスの[TgtCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_TgtCnd(MGBDP_CopyBom p){
		p.TgtCnd_calc_ctg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.TgtCnd_calc_ctg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.TgtCnd_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.TgtCnd_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.TgtCnd_term_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.TgtCnd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.TgtCnd_lump_flg.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MGBDP_CopyBom p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_par_itm_jnl_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_jnl_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_no_exist_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_change_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_exist_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_sep.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_imp_err_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_par_itm_grp_cd1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd4.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm4.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd5.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm5.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd6.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm6.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd7.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm7.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd8.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm8.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd9.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm9.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd10.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm10.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_disp_key.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_srch_cmn.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MGBDP_CopyBom p){

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MGBDP_CopyBom p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_U, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tbl(MGBDP_CopyBom p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MGBDP_CopyBom p){
		p.Hdr_calc_ctg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_term.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_term_nm.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MGBDP_CopyBom p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_no_exist_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_change_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_par_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_par_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_par_itm_jnl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_par_itm_jnl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_chd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_jnl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_jnl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_expns_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_expns_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_par_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_par_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_par_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_par_rqmt_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_chd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_chd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_chd_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_chd_rqmt_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_base_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_min_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_batch_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_alt_itm_ratio.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_imp_err_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_key_flg.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MGBDP_CopyBom p){
		p.Btn_open_MGBDP0530.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd_lump.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_LUMP]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__LUMP_ScreenOpe(MGBDP_CopyBom p){

	}

	/**
	 * [UPD_LUMP]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitUPD__LUMP_RegTarget(MGBDP_CopyBom p){

	}

	/**
	 * [UPD_LUMP]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__LUMP_Top(MGBDP_CopyBom p){

	}

	/**
	 * [UPD_LUMP]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__LUMP_Fold(MGBDP_CopyBom p){

	}

	/**
	 * [UPD_LUMP]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__LUMP_Tab1(MGBDP_CopyBom p){

	}

	/**
	 * [UPD_LUMP]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__LUMP_Tab2(MGBDP_CopyBom p){

	}

	/**
	 * [UPD_LUMP]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD__LUMP_Tab3(MGBDP_CopyBom p){

	}

	/**
	 * [UPD_LUMP]ステータスの[TgtCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__LUMP_TgtCnd(MGBDP_CopyBom p){
		p.TgtCnd_calc_ctg_cd.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.TgtCnd_calc_ctg_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.TgtCnd_wg_cd.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.TgtCnd_wg_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.TgtCnd_term_p_PPanel.putStatus(UPD_LUMP, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.TgtCnd_dt.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.TgtCnd_lump_flg.putMode(p, UPD_LUMP, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_LUMP]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__LUMP_Cnd(MGBDP_CopyBom p){
		p.Cnd_ope_Group.putMode(p, UPD_LUMP, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, UPD_LUMP, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, UPD_LUMP, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, UPD_LUMP, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, UPD_LUMP, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(UPD_LUMP, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(UPD_LUMP, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_par_itm_jnl_cd.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_jnl_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_p_PPanel.putStatus(UPD_LUMP, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_no_exist_flg.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_change_flg.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_exist_flg.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_sep.putMode(p, UPD_LUMP, MCMode.ENABLE);
		p.Cnd_imp_err_flg.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd1.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm1.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd2.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm2.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd3.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm3.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd4.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm4.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd5.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm5.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd6.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm6.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd7.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm7.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd8.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm8.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd9.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm9.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd10.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm10.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_disp_key.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, UPD_LUMP, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, UPD_LUMP, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_LUMP]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__LUMP_Cnd2(MGBDP_CopyBom p){

	}

	/**
	 * [UPD_LUMP]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__LUMP_Ctrl(MGBDP_CopyBom p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD_LUMP, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [UPD_LUMP]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__LUMP_Tbl(MGBDP_CopyBom p){

	}

	/**
	 * [UPD_LUMP]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__LUMP_Hdr(MGBDP_CopyBom p){
		p.Hdr_calc_ctg_cd.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Hdr_term.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Hdr_term_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_LUMP]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__LUMP_Rslt(MGBDP_CopyBom p){
		p.columnRslt_check.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_no_exist_flg.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_change_flg.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Rslt_par_itm_p_PPanel.putStatus(UPD_LUMP, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_par_itm_typ.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_cd.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_par_itm_typ_d_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_par_itm_jnl_cd.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_par_itm_jnl_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.Rslt_chd_itm_p_PPanel.putStatus(UPD_LUMP, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_jnl_cd.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_jnl_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_expns_cd.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_expns_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_par_unit_cd.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_par_unit_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_par_dec_place.putMode(p, UPD_LUMP, MCMode.INVISIBLE);
		p.Rslt_par_rqmt_qty_p_PPanel.putStatus(UPD_LUMP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_chd_unit_cd.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_chd_unit_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_chd_dec_place.putMode(p, UPD_LUMP, MCMode.INVISIBLE);
		p.Rslt_chd_rqmt_qty_p_PPanel.putStatus(UPD_LUMP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_base_qty_p_PPanel.putStatus(UPD_LUMP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.putStatus(UPD_LUMP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_min_qty_p_PPanel.putStatus(UPD_LUMP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_batch_qty_p_PPanel.putStatus(UPD_LUMP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_alt_itm_ratio.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_imp_err_flg.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_LUMP, MCMode.READ_ONLY);
		p.columnRslt_key_flg.putMode(p, UPD_LUMP, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_LUMP]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__LUMP_Btn(MGBDP_CopyBom p){
		p.Btn_open_MGBDP0530.putMode(p, UPD_LUMP, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_LUMP, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, UPD_LUMP, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD_LUMP, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_LUMP, MCMode.INVISIBLE);
		p.Btn_upd_lump.putMode(p, UPD_LUMP, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MGBDP_CopyBom_MC.setTableConfigRslt((MGBDP_CopyBom)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBDP_CopyBom p) {
		p.columnRslt_check.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_no_exist_flg.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.no_exist_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_no_exist_flg);
		p.columnRslt_change_flg.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.change_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_change_flg);
		p.RsltTable.addTable(p.Rslt_par_itm_p_PPanel.ItmTable);
		p.columnRslt_par_itm_typ.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.par_itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_itm_typ);
		p.columnRslt_par_itm_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.par_itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_itm_typ_nm);
		p.columnRslt_par_itm_typ_d_cd.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.par_itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_itm_typ_d_cd);
		p.columnRslt_par_itm_typ_d_nm.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.par_itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_itm_typ_d_nm);
		p.columnRslt_par_itm_jnl_cd.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.par_itm_jnl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_itm_jnl_cd);
		p.columnRslt_par_itm_jnl_nm.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.par_itm_jnl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_itm_jnl_nm);
		p.columnRslt_bom_ptn.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.bom_ptn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bom_ptn);
		p.columnRslt_oper_cd.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.oper_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_cd);
		p.columnRslt_oper_nm.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.oper_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_nm);
		p.columnRslt_oper_seq.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.oper_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_seq);
		p.RsltTable.addTable(p.Rslt_chd_itm_p_PPanel.ItmTable);
		p.columnRslt_chd_itm_typ.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.chd_itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_typ);
		p.columnRslt_chd_itm_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.chd_itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_typ_nm);
		p.columnRslt_chd_itm_typ_d_cd.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.chd_itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_typ_d_cd);
		p.columnRslt_chd_itm_typ_d_nm.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.chd_itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_typ_d_nm);
		p.columnRslt_chd_itm_jnl_cd.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.chd_itm_jnl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_jnl_cd);
		p.columnRslt_chd_itm_jnl_nm.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.chd_itm_jnl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_jnl_nm);
		p.columnRslt_alt_grp_cd.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.alt_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_grp_cd);
		p.columnRslt_alt_grp_nm.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.alt_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_grp_nm);
		p.columnRslt_expns_cd.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.expns_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_expns_cd);
		p.columnRslt_expns_nm.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.expns_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_expns_nm);
		p.columnRslt_disp_seq.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_seq);
		p.columnRslt_par_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.par_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_unit_cd);
		p.columnRslt_par_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.par_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_unit_nm);
		p.columnRslt_par_dec_place.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.par_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_dec_place);
		p.RsltTable.addTable(p.Rslt_par_rqmt_qty_p_PPanel.QtyTable);
		p.columnRslt_chd_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.chd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_unit_cd);
		p.columnRslt_chd_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.chd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_unit_nm);
		p.columnRslt_chd_dec_place.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.chd_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_dec_place);
		p.RsltTable.addTable(p.Rslt_chd_rqmt_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_chd_base_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_fxd_chd_rqmt_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_chd_min_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_chd_batch_qty_p_PPanel.QtyTable);
		p.columnRslt_alt_itm_ratio.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.alt_itm_ratio_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_itm_ratio);
		p.columnRslt_rmrks.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_non_calc_flg.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.non_calc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_non_calc_flg);
		p.columnRslt_imp_err_flg.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.imp_err_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_imp_err_flg);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_key_flg.setMeta(mcframe.clientMGBD.MGBDP0420.RsltR.key_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_key_flg);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		TgtCnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		TgtCnd_calc_ctg_cd.getListConfig().setPutter(getTgtCnd_calc_ctg_cd_ListPutter());
		TgtCnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		TgtCnd_wg_cd.getListConfig().setPutter(getTgtCnd_wg_cd_ListPutter());
		Cnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_ctg_cd.getListConfig().setPutter(getCnd_calc_ctg_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_par_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_jnl_cd.getListConfig().setPutter(getCnd_par_itm_jnl_cd_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_par_itm_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd1.getListConfig().setPutter(getCnd_par_itm_grp_cd1_ListPutter());
		Cnd_par_itm_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd2.getListConfig().setPutter(getCnd_par_itm_grp_cd2_ListPutter());
		Cnd_par_itm_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd3.getListConfig().setPutter(getCnd_par_itm_grp_cd3_ListPutter());
		Cnd_par_itm_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd4.getListConfig().setPutter(getCnd_par_itm_grp_cd4_ListPutter());
		Cnd_par_itm_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd5.getListConfig().setPutter(getCnd_par_itm_grp_cd5_ListPutter());
		Cnd_par_itm_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd6.getListConfig().setPutter(getCnd_par_itm_grp_cd6_ListPutter());
		Cnd_par_itm_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd7.getListConfig().setPutter(getCnd_par_itm_grp_cd7_ListPutter());
		Cnd_par_itm_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd8.getListConfig().setPutter(getCnd_par_itm_grp_cd8_ListPutter());
		Cnd_par_itm_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd9.getListConfig().setPutter(getCnd_par_itm_grp_cd9_ListPutter());
		Cnd_par_itm_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd10.getListConfig().setPutter(getCnd_par_itm_grp_cd10_ListPutter());
	}

	/**
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UPDStatus() {
		status = SRCH_UPD;
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
	 * この画面を[UPD_LUMP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_LUMPStatus() {
		status = UPD_LUMP;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (INS.equals(status)) {
			setINSStatus();
		}
		else if (SRCH_UPD.equals(status)) {
			setSRCH_UPDStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (UPD_LUMP.equals(status)) {
			setUPD_LUMPStatus();
		}
	}

	/**
	 * [TgtCnd_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createTgtCnd_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [TgtCnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createTgtCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_par_itm_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == TgtCnd_calc_ctg_cd) return getTgtCnd_calc_ctg_cd(row, info);
		if(combo == TgtCnd_wg_cd) return getTgtCnd_wg_cd(row, info);
		if(combo == Cnd_calc_ctg_cd) return getCnd_calc_ctg_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_par_itm_jnl_cd) return getCnd_par_itm_jnl_cd(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_cd) return getCnd_par_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub1) return getCnd_par_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub2) return getCnd_par_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub3) return getCnd_par_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_par_itm_grp_cd1) return getCnd_par_itm_grp_cd1(row, info);
		if(combo == Cnd_par_itm_grp_cd2) return getCnd_par_itm_grp_cd2(row, info);
		if(combo == Cnd_par_itm_grp_cd3) return getCnd_par_itm_grp_cd3(row, info);
		if(combo == Cnd_par_itm_grp_cd4) return getCnd_par_itm_grp_cd4(row, info);
		if(combo == Cnd_par_itm_grp_cd5) return getCnd_par_itm_grp_cd5(row, info);
		if(combo == Cnd_par_itm_grp_cd6) return getCnd_par_itm_grp_cd6(row, info);
		if(combo == Cnd_par_itm_grp_cd7) return getCnd_par_itm_grp_cd7(row, info);
		if(combo == Cnd_par_itm_grp_cd8) return getCnd_par_itm_grp_cd8(row, info);
		if(combo == Cnd_par_itm_grp_cd9) return getCnd_par_itm_grp_cd9(row, info);
		if(combo == Cnd_par_itm_grp_cd10) return getCnd_par_itm_grp_cd10(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch_cmn) doCnd_srch_cmn(info);
		else if (ap == Cnd_srch_wg) doCnd_srch_wg(info);
		else if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == Btn_open_MGBDP0530) doBtn_open_MGBDP0530(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_upd_lump) doBtn_upd_lump(info);
	}

	/**
	 * [Cnd]パネルの[srch_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_cmn(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_wg(MCEventInfo info);

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0530]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0530(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_lump]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_lump(MCEventInfo info);

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
		if (vc == TgtCnd_calc_ctg_cd) return doTgtCnd_calc_ctg_cd_VC(info);
		if (vc == TgtCnd_calc_ctg_nm) return doTgtCnd_calc_ctg_nm_VC(info);
		if (vc == TgtCnd_wg_cd) return doTgtCnd_wg_cd_VC(info);
		if (vc == TgtCnd_wg_nm) return doTgtCnd_wg_nm_VC(info);
		if (vc == TgtCnd_dt) return doTgtCnd_dt_VC(info);
		if (vc == TgtCnd_lump_flg) return doTgtCnd_lump_flg_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_cmn_flg) return doCnd_cmn_flg_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_par_itm_jnl_cd) return doCnd_par_itm_jnl_cd_VC(info);
		if (vc == Cnd_par_itm_jnl_nm) return doCnd_par_itm_jnl_nm_VC(info);
		if (vc == Cnd_no_exist_flg) return doCnd_no_exist_flg_VC(info);
		if (vc == Cnd_change_flg) return doCnd_change_flg_VC(info);
		if (vc == Cnd_exist_flg) return doCnd_exist_flg_VC(info);
		if (vc == Cnd_imp_err_flg) return doCnd_imp_err_flg_VC(info);
		if (vc == Cnd_par_itm_grp_cd1) return doCnd_par_itm_grp_cd1_VC(info);
		if (vc == Cnd_par_itm_grp_nm1) return doCnd_par_itm_grp_nm1_VC(info);
		if (vc == Cnd_par_itm_grp_cd2) return doCnd_par_itm_grp_cd2_VC(info);
		if (vc == Cnd_par_itm_grp_nm2) return doCnd_par_itm_grp_nm2_VC(info);
		if (vc == Cnd_par_itm_grp_cd3) return doCnd_par_itm_grp_cd3_VC(info);
		if (vc == Cnd_par_itm_grp_nm3) return doCnd_par_itm_grp_nm3_VC(info);
		if (vc == Cnd_par_itm_grp_cd4) return doCnd_par_itm_grp_cd4_VC(info);
		if (vc == Cnd_par_itm_grp_nm4) return doCnd_par_itm_grp_nm4_VC(info);
		if (vc == Cnd_par_itm_grp_cd5) return doCnd_par_itm_grp_cd5_VC(info);
		if (vc == Cnd_par_itm_grp_nm5) return doCnd_par_itm_grp_nm5_VC(info);
		if (vc == Cnd_par_itm_grp_cd6) return doCnd_par_itm_grp_cd6_VC(info);
		if (vc == Cnd_par_itm_grp_nm6) return doCnd_par_itm_grp_nm6_VC(info);
		if (vc == Cnd_par_itm_grp_cd7) return doCnd_par_itm_grp_cd7_VC(info);
		if (vc == Cnd_par_itm_grp_nm7) return doCnd_par_itm_grp_nm7_VC(info);
		if (vc == Cnd_par_itm_grp_cd8) return doCnd_par_itm_grp_cd8_VC(info);
		if (vc == Cnd_par_itm_grp_nm8) return doCnd_par_itm_grp_nm8_VC(info);
		if (vc == Cnd_par_itm_grp_cd9) return doCnd_par_itm_grp_cd9_VC(info);
		if (vc == Cnd_par_itm_grp_nm9) return doCnd_par_itm_grp_nm9_VC(info);
		if (vc == Cnd_par_itm_grp_cd10) return doCnd_par_itm_grp_cd10_VC(info);
		if (vc == Cnd_par_itm_grp_nm10) return doCnd_par_itm_grp_nm10_VC(info);
		if (vc == Cnd_disp_key) return doCnd_disp_key_VC(info);
		if (vc == Hdr_calc_ctg_cd) return doHdr_calc_ctg_cd_VC(info);
		if (vc == Hdr_calc_ctg_nm) return doHdr_calc_ctg_nm_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_term) return doHdr_term_VC(info);
		if (vc == Hdr_term_nm) return doHdr_term_nm_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_no_exist_flg) return doRslt_no_exist_flg_VC(info);
		if (vc == columnRslt_change_flg) return doRslt_change_flg_VC(info);
		if (vc == columnRslt_par_itm_typ) return doRslt_par_itm_typ_VC(info);
		if (vc == columnRslt_par_itm_typ_nm) return doRslt_par_itm_typ_nm_VC(info);
		if (vc == columnRslt_par_itm_typ_d_cd) return doRslt_par_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_par_itm_typ_d_nm) return doRslt_par_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_par_itm_jnl_cd) return doRslt_par_itm_jnl_cd_VC(info);
		if (vc == columnRslt_par_itm_jnl_nm) return doRslt_par_itm_jnl_nm_VC(info);
		if (vc == columnRslt_bom_ptn) return doRslt_bom_ptn_VC(info);
		if (vc == columnRslt_oper_cd) return doRslt_oper_cd_VC(info);
		if (vc == columnRslt_oper_nm) return doRslt_oper_nm_VC(info);
		if (vc == columnRslt_oper_seq) return doRslt_oper_seq_VC(info);
		if (vc == columnRslt_chd_itm_typ) return doRslt_chd_itm_typ_VC(info);
		if (vc == columnRslt_chd_itm_typ_nm) return doRslt_chd_itm_typ_nm_VC(info);
		if (vc == columnRslt_chd_itm_typ_d_cd) return doRslt_chd_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_chd_itm_typ_d_nm) return doRslt_chd_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_chd_itm_jnl_cd) return doRslt_chd_itm_jnl_cd_VC(info);
		if (vc == columnRslt_chd_itm_jnl_nm) return doRslt_chd_itm_jnl_nm_VC(info);
		if (vc == columnRslt_alt_grp_cd) return doRslt_alt_grp_cd_VC(info);
		if (vc == columnRslt_alt_grp_nm) return doRslt_alt_grp_nm_VC(info);
		if (vc == columnRslt_expns_cd) return doRslt_expns_cd_VC(info);
		if (vc == columnRslt_expns_nm) return doRslt_expns_nm_VC(info);
		if (vc == columnRslt_disp_seq) return doRslt_disp_seq_VC(info);
		if (vc == columnRslt_par_unit_cd) return doRslt_par_unit_cd_VC(info);
		if (vc == columnRslt_par_unit_nm) return doRslt_par_unit_nm_VC(info);
		if (vc == columnRslt_par_dec_place) return doRslt_par_dec_place_VC(info);
		if (vc == columnRslt_chd_unit_cd) return doRslt_chd_unit_cd_VC(info);
		if (vc == columnRslt_chd_unit_nm) return doRslt_chd_unit_nm_VC(info);
		if (vc == columnRslt_chd_dec_place) return doRslt_chd_dec_place_VC(info);
		if (vc == columnRslt_alt_itm_ratio) return doRslt_alt_itm_ratio_VC(info);
		if (vc == columnRslt_rmrks) return doRslt_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_non_calc_flg) return doRslt_non_calc_flg_VC(info);
		if (vc == columnRslt_imp_err_flg) return doRslt_imp_err_flg_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == columnRslt_key_flg) return doRslt_key_flg_VC(info);
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
	 * [TgtCnd]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgtCnd_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TgtCnd]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgtCnd_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TgtCnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgtCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TgtCnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgtCnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TgtCnd]パネルの[dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgtCnd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TgtCnd]パネルの[lump_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgtCnd_lump_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cmn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmn_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[par_itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_exist_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_exist_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[change_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_change_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[exist_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_exist_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[imp_err_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_imp_err_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm10_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[term]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_term_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_term_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[no_exist_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_no_exist_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[change_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_change_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_itm_jnl_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_itm_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_itm_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[non_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_non_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[imp_err_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_imp_err_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[key_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_key_flg_VC(MCEventInfo info){
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
		else if (nc == TgtCnd_calc_ctg_cd) doTgtCnd_calc_ctg_cd_NC(info);
		else if (nc == TgtCnd_calc_ctg_nm) doTgtCnd_calc_ctg_nm_NC(info);
		else if (nc == TgtCnd_wg_cd) doTgtCnd_wg_cd_NC(info);
		else if (nc == TgtCnd_wg_nm) doTgtCnd_wg_nm_NC(info);
		else if (nc == TgtCnd_dt) doTgtCnd_dt_NC(info);
		else if (nc == TgtCnd_lump_flg) doTgtCnd_lump_flg_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_cmn_flg) doCnd_cmn_flg_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_par_itm_jnl_cd) doCnd_par_itm_jnl_cd_NC(info);
		else if (nc == Cnd_par_itm_jnl_nm) doCnd_par_itm_jnl_nm_NC(info);
		else if (nc == Cnd_no_exist_flg) doCnd_no_exist_flg_NC(info);
		else if (nc == Cnd_change_flg) doCnd_change_flg_NC(info);
		else if (nc == Cnd_exist_flg) doCnd_exist_flg_NC(info);
		else if (nc == Cnd_imp_err_flg) doCnd_imp_err_flg_NC(info);
		else if (nc == Cnd_par_itm_grp_cd1) doCnd_par_itm_grp_cd1_NC(info);
		else if (nc == Cnd_par_itm_grp_nm1) doCnd_par_itm_grp_nm1_NC(info);
		else if (nc == Cnd_par_itm_grp_cd2) doCnd_par_itm_grp_cd2_NC(info);
		else if (nc == Cnd_par_itm_grp_nm2) doCnd_par_itm_grp_nm2_NC(info);
		else if (nc == Cnd_par_itm_grp_cd3) doCnd_par_itm_grp_cd3_NC(info);
		else if (nc == Cnd_par_itm_grp_nm3) doCnd_par_itm_grp_nm3_NC(info);
		else if (nc == Cnd_par_itm_grp_cd4) doCnd_par_itm_grp_cd4_NC(info);
		else if (nc == Cnd_par_itm_grp_nm4) doCnd_par_itm_grp_nm4_NC(info);
		else if (nc == Cnd_par_itm_grp_cd5) doCnd_par_itm_grp_cd5_NC(info);
		else if (nc == Cnd_par_itm_grp_nm5) doCnd_par_itm_grp_nm5_NC(info);
		else if (nc == Cnd_par_itm_grp_cd6) doCnd_par_itm_grp_cd6_NC(info);
		else if (nc == Cnd_par_itm_grp_nm6) doCnd_par_itm_grp_nm6_NC(info);
		else if (nc == Cnd_par_itm_grp_cd7) doCnd_par_itm_grp_cd7_NC(info);
		else if (nc == Cnd_par_itm_grp_nm7) doCnd_par_itm_grp_nm7_NC(info);
		else if (nc == Cnd_par_itm_grp_cd8) doCnd_par_itm_grp_cd8_NC(info);
		else if (nc == Cnd_par_itm_grp_nm8) doCnd_par_itm_grp_nm8_NC(info);
		else if (nc == Cnd_par_itm_grp_cd9) doCnd_par_itm_grp_cd9_NC(info);
		else if (nc == Cnd_par_itm_grp_nm9) doCnd_par_itm_grp_nm9_NC(info);
		else if (nc == Cnd_par_itm_grp_cd10) doCnd_par_itm_grp_cd10_NC(info);
		else if (nc == Cnd_par_itm_grp_nm10) doCnd_par_itm_grp_nm10_NC(info);
		else if (nc == Cnd_disp_key) doCnd_disp_key_NC(info);
		else if (nc == Hdr_calc_ctg_cd) doHdr_calc_ctg_cd_NC(info);
		else if (nc == Hdr_calc_ctg_nm) doHdr_calc_ctg_nm_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_term) doHdr_term_NC(info);
		else if (nc == Hdr_term_nm) doHdr_term_nm_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_no_exist_flg) doRslt_no_exist_flg_NC(info);
		else if (nc == columnRslt_change_flg) doRslt_change_flg_NC(info);
		else if (nc == columnRslt_par_itm_typ) doRslt_par_itm_typ_NC(info);
		else if (nc == columnRslt_par_itm_typ_nm) doRslt_par_itm_typ_nm_NC(info);
		else if (nc == columnRslt_par_itm_typ_d_cd) doRslt_par_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_par_itm_typ_d_nm) doRslt_par_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_par_itm_jnl_cd) doRslt_par_itm_jnl_cd_NC(info);
		else if (nc == columnRslt_par_itm_jnl_nm) doRslt_par_itm_jnl_nm_NC(info);
		else if (nc == columnRslt_bom_ptn) doRslt_bom_ptn_NC(info);
		else if (nc == columnRslt_oper_cd) doRslt_oper_cd_NC(info);
		else if (nc == columnRslt_oper_nm) doRslt_oper_nm_NC(info);
		else if (nc == columnRslt_oper_seq) doRslt_oper_seq_NC(info);
		else if (nc == columnRslt_chd_itm_typ) doRslt_chd_itm_typ_NC(info);
		else if (nc == columnRslt_chd_itm_typ_nm) doRslt_chd_itm_typ_nm_NC(info);
		else if (nc == columnRslt_chd_itm_typ_d_cd) doRslt_chd_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_chd_itm_typ_d_nm) doRslt_chd_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_chd_itm_jnl_cd) doRslt_chd_itm_jnl_cd_NC(info);
		else if (nc == columnRslt_chd_itm_jnl_nm) doRslt_chd_itm_jnl_nm_NC(info);
		else if (nc == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NC(info);
		else if (nc == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_NC(info);
		else if (nc == columnRslt_expns_cd) doRslt_expns_cd_NC(info);
		else if (nc == columnRslt_expns_nm) doRslt_expns_nm_NC(info);
		else if (nc == columnRslt_disp_seq) doRslt_disp_seq_NC(info);
		else if (nc == columnRslt_par_unit_cd) doRslt_par_unit_cd_NC(info);
		else if (nc == columnRslt_par_unit_nm) doRslt_par_unit_nm_NC(info);
		else if (nc == columnRslt_par_dec_place) doRslt_par_dec_place_NC(info);
		else if (nc == columnRslt_chd_unit_cd) doRslt_chd_unit_cd_NC(info);
		else if (nc == columnRslt_chd_unit_nm) doRslt_chd_unit_nm_NC(info);
		else if (nc == columnRslt_chd_dec_place) doRslt_chd_dec_place_NC(info);
		else if (nc == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_NC(info);
		else if (nc == columnRslt_rmrks) doRslt_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_non_calc_flg) doRslt_non_calc_flg_NC(info);
		else if (nc == columnRslt_imp_err_flg) doRslt_imp_err_flg_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == columnRslt_key_flg) doRslt_key_flg_NC(info);
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
	 * [TgtCnd]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_dt_NC(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[lump_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_lump_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[par_itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_exist_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_exist_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[change_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_change_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[exist_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_exist_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imp_err_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imp_err_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[term]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_term_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_term_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[no_exist_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_no_exist_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[change_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_change_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[non_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imp_err_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imp_err_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[key_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_key_flg_NC(MCEventInfo info){
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
		else if (ne == TgtCnd_calc_ctg_cd) doTgtCnd_calc_ctg_cd_NE(info);
		else if (ne == TgtCnd_calc_ctg_nm) doTgtCnd_calc_ctg_nm_NE(info);
		else if (ne == TgtCnd_wg_cd) doTgtCnd_wg_cd_NE(info);
		else if (ne == TgtCnd_wg_nm) doTgtCnd_wg_nm_NE(info);
		else if (ne == TgtCnd_dt) doTgtCnd_dt_NE(info);
		else if (ne == TgtCnd_lump_flg) doTgtCnd_lump_flg_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_cmn_flg) doCnd_cmn_flg_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_par_itm_jnl_cd) doCnd_par_itm_jnl_cd_NE(info);
		else if (ne == Cnd_par_itm_jnl_nm) doCnd_par_itm_jnl_nm_NE(info);
		else if (ne == Cnd_no_exist_flg) doCnd_no_exist_flg_NE(info);
		else if (ne == Cnd_change_flg) doCnd_change_flg_NE(info);
		else if (ne == Cnd_exist_flg) doCnd_exist_flg_NE(info);
		else if (ne == Cnd_imp_err_flg) doCnd_imp_err_flg_NE(info);
		else if (ne == Cnd_par_itm_grp_cd1) doCnd_par_itm_grp_cd1_NE(info);
		else if (ne == Cnd_par_itm_grp_nm1) doCnd_par_itm_grp_nm1_NE(info);
		else if (ne == Cnd_par_itm_grp_cd2) doCnd_par_itm_grp_cd2_NE(info);
		else if (ne == Cnd_par_itm_grp_nm2) doCnd_par_itm_grp_nm2_NE(info);
		else if (ne == Cnd_par_itm_grp_cd3) doCnd_par_itm_grp_cd3_NE(info);
		else if (ne == Cnd_par_itm_grp_nm3) doCnd_par_itm_grp_nm3_NE(info);
		else if (ne == Cnd_par_itm_grp_cd4) doCnd_par_itm_grp_cd4_NE(info);
		else if (ne == Cnd_par_itm_grp_nm4) doCnd_par_itm_grp_nm4_NE(info);
		else if (ne == Cnd_par_itm_grp_cd5) doCnd_par_itm_grp_cd5_NE(info);
		else if (ne == Cnd_par_itm_grp_nm5) doCnd_par_itm_grp_nm5_NE(info);
		else if (ne == Cnd_par_itm_grp_cd6) doCnd_par_itm_grp_cd6_NE(info);
		else if (ne == Cnd_par_itm_grp_nm6) doCnd_par_itm_grp_nm6_NE(info);
		else if (ne == Cnd_par_itm_grp_cd7) doCnd_par_itm_grp_cd7_NE(info);
		else if (ne == Cnd_par_itm_grp_nm7) doCnd_par_itm_grp_nm7_NE(info);
		else if (ne == Cnd_par_itm_grp_cd8) doCnd_par_itm_grp_cd8_NE(info);
		else if (ne == Cnd_par_itm_grp_nm8) doCnd_par_itm_grp_nm8_NE(info);
		else if (ne == Cnd_par_itm_grp_cd9) doCnd_par_itm_grp_cd9_NE(info);
		else if (ne == Cnd_par_itm_grp_nm9) doCnd_par_itm_grp_nm9_NE(info);
		else if (ne == Cnd_par_itm_grp_cd10) doCnd_par_itm_grp_cd10_NE(info);
		else if (ne == Cnd_par_itm_grp_nm10) doCnd_par_itm_grp_nm10_NE(info);
		else if (ne == Cnd_disp_key) doCnd_disp_key_NE(info);
		else if (ne == Hdr_calc_ctg_cd) doHdr_calc_ctg_cd_NE(info);
		else if (ne == Hdr_calc_ctg_nm) doHdr_calc_ctg_nm_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_term) doHdr_term_NE(info);
		else if (ne == Hdr_term_nm) doHdr_term_nm_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_no_exist_flg) doRslt_no_exist_flg_NE(info);
		else if (ne == columnRslt_change_flg) doRslt_change_flg_NE(info);
		else if (ne == columnRslt_par_itm_typ) doRslt_par_itm_typ_NE(info);
		else if (ne == columnRslt_par_itm_typ_nm) doRslt_par_itm_typ_nm_NE(info);
		else if (ne == columnRslt_par_itm_typ_d_cd) doRslt_par_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_par_itm_typ_d_nm) doRslt_par_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_par_itm_jnl_cd) doRslt_par_itm_jnl_cd_NE(info);
		else if (ne == columnRslt_par_itm_jnl_nm) doRslt_par_itm_jnl_nm_NE(info);
		else if (ne == columnRslt_bom_ptn) doRslt_bom_ptn_NE(info);
		else if (ne == columnRslt_oper_cd) doRslt_oper_cd_NE(info);
		else if (ne == columnRslt_oper_nm) doRslt_oper_nm_NE(info);
		else if (ne == columnRslt_oper_seq) doRslt_oper_seq_NE(info);
		else if (ne == columnRslt_chd_itm_typ) doRslt_chd_itm_typ_NE(info);
		else if (ne == columnRslt_chd_itm_typ_nm) doRslt_chd_itm_typ_nm_NE(info);
		else if (ne == columnRslt_chd_itm_typ_d_cd) doRslt_chd_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_chd_itm_typ_d_nm) doRslt_chd_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_chd_itm_jnl_cd) doRslt_chd_itm_jnl_cd_NE(info);
		else if (ne == columnRslt_chd_itm_jnl_nm) doRslt_chd_itm_jnl_nm_NE(info);
		else if (ne == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NE(info);
		else if (ne == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_NE(info);
		else if (ne == columnRslt_expns_cd) doRslt_expns_cd_NE(info);
		else if (ne == columnRslt_expns_nm) doRslt_expns_nm_NE(info);
		else if (ne == columnRslt_disp_seq) doRslt_disp_seq_NE(info);
		else if (ne == columnRslt_par_unit_cd) doRslt_par_unit_cd_NE(info);
		else if (ne == columnRslt_par_unit_nm) doRslt_par_unit_nm_NE(info);
		else if (ne == columnRslt_par_dec_place) doRslt_par_dec_place_NE(info);
		else if (ne == columnRslt_chd_unit_cd) doRslt_chd_unit_cd_NE(info);
		else if (ne == columnRslt_chd_unit_nm) doRslt_chd_unit_nm_NE(info);
		else if (ne == columnRslt_chd_dec_place) doRslt_chd_dec_place_NE(info);
		else if (ne == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_NE(info);
		else if (ne == columnRslt_rmrks) doRslt_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_non_calc_flg) doRslt_non_calc_flg_NE(info);
		else if (ne == columnRslt_imp_err_flg) doRslt_imp_err_flg_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == columnRslt_key_flg) doRslt_key_flg_NE(info);
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
	 * [TgtCnd]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_dt_NE(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[lump_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_lump_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[par_itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_exist_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_exist_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[change_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_change_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[exist_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_exist_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imp_err_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imp_err_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[term]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_term_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_term_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[no_exist_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_no_exist_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[change_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_change_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[non_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imp_err_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imp_err_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[key_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_key_flg_NE(MCEventInfo info){
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
		else if (nx == TgtCnd_calc_ctg_cd) doTgtCnd_calc_ctg_cd_NX(info);
		else if (nx == TgtCnd_calc_ctg_nm) doTgtCnd_calc_ctg_nm_NX(info);
		else if (nx == TgtCnd_wg_cd) doTgtCnd_wg_cd_NX(info);
		else if (nx == TgtCnd_wg_nm) doTgtCnd_wg_nm_NX(info);
		else if (nx == TgtCnd_dt) doTgtCnd_dt_NX(info);
		else if (nx == TgtCnd_lump_flg) doTgtCnd_lump_flg_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_cmn_flg) doCnd_cmn_flg_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_par_itm_jnl_cd) doCnd_par_itm_jnl_cd_NX(info);
		else if (nx == Cnd_par_itm_jnl_nm) doCnd_par_itm_jnl_nm_NX(info);
		else if (nx == Cnd_no_exist_flg) doCnd_no_exist_flg_NX(info);
		else if (nx == Cnd_change_flg) doCnd_change_flg_NX(info);
		else if (nx == Cnd_exist_flg) doCnd_exist_flg_NX(info);
		else if (nx == Cnd_imp_err_flg) doCnd_imp_err_flg_NX(info);
		else if (nx == Cnd_par_itm_grp_cd1) doCnd_par_itm_grp_cd1_NX(info);
		else if (nx == Cnd_par_itm_grp_nm1) doCnd_par_itm_grp_nm1_NX(info);
		else if (nx == Cnd_par_itm_grp_cd2) doCnd_par_itm_grp_cd2_NX(info);
		else if (nx == Cnd_par_itm_grp_nm2) doCnd_par_itm_grp_nm2_NX(info);
		else if (nx == Cnd_par_itm_grp_cd3) doCnd_par_itm_grp_cd3_NX(info);
		else if (nx == Cnd_par_itm_grp_nm3) doCnd_par_itm_grp_nm3_NX(info);
		else if (nx == Cnd_par_itm_grp_cd4) doCnd_par_itm_grp_cd4_NX(info);
		else if (nx == Cnd_par_itm_grp_nm4) doCnd_par_itm_grp_nm4_NX(info);
		else if (nx == Cnd_par_itm_grp_cd5) doCnd_par_itm_grp_cd5_NX(info);
		else if (nx == Cnd_par_itm_grp_nm5) doCnd_par_itm_grp_nm5_NX(info);
		else if (nx == Cnd_par_itm_grp_cd6) doCnd_par_itm_grp_cd6_NX(info);
		else if (nx == Cnd_par_itm_grp_nm6) doCnd_par_itm_grp_nm6_NX(info);
		else if (nx == Cnd_par_itm_grp_cd7) doCnd_par_itm_grp_cd7_NX(info);
		else if (nx == Cnd_par_itm_grp_nm7) doCnd_par_itm_grp_nm7_NX(info);
		else if (nx == Cnd_par_itm_grp_cd8) doCnd_par_itm_grp_cd8_NX(info);
		else if (nx == Cnd_par_itm_grp_nm8) doCnd_par_itm_grp_nm8_NX(info);
		else if (nx == Cnd_par_itm_grp_cd9) doCnd_par_itm_grp_cd9_NX(info);
		else if (nx == Cnd_par_itm_grp_nm9) doCnd_par_itm_grp_nm9_NX(info);
		else if (nx == Cnd_par_itm_grp_cd10) doCnd_par_itm_grp_cd10_NX(info);
		else if (nx == Cnd_par_itm_grp_nm10) doCnd_par_itm_grp_nm10_NX(info);
		else if (nx == Cnd_disp_key) doCnd_disp_key_NX(info);
		else if (nx == Hdr_calc_ctg_cd) doHdr_calc_ctg_cd_NX(info);
		else if (nx == Hdr_calc_ctg_nm) doHdr_calc_ctg_nm_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_term) doHdr_term_NX(info);
		else if (nx == Hdr_term_nm) doHdr_term_nm_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_no_exist_flg) doRslt_no_exist_flg_NX(info);
		else if (nx == columnRslt_change_flg) doRslt_change_flg_NX(info);
		else if (nx == columnRslt_par_itm_typ) doRslt_par_itm_typ_NX(info);
		else if (nx == columnRslt_par_itm_typ_nm) doRslt_par_itm_typ_nm_NX(info);
		else if (nx == columnRslt_par_itm_typ_d_cd) doRslt_par_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_par_itm_typ_d_nm) doRslt_par_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_par_itm_jnl_cd) doRslt_par_itm_jnl_cd_NX(info);
		else if (nx == columnRslt_par_itm_jnl_nm) doRslt_par_itm_jnl_nm_NX(info);
		else if (nx == columnRslt_bom_ptn) doRslt_bom_ptn_NX(info);
		else if (nx == columnRslt_oper_cd) doRslt_oper_cd_NX(info);
		else if (nx == columnRslt_oper_nm) doRslt_oper_nm_NX(info);
		else if (nx == columnRslt_oper_seq) doRslt_oper_seq_NX(info);
		else if (nx == columnRslt_chd_itm_typ) doRslt_chd_itm_typ_NX(info);
		else if (nx == columnRslt_chd_itm_typ_nm) doRslt_chd_itm_typ_nm_NX(info);
		else if (nx == columnRslt_chd_itm_typ_d_cd) doRslt_chd_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_chd_itm_typ_d_nm) doRslt_chd_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_chd_itm_jnl_cd) doRslt_chd_itm_jnl_cd_NX(info);
		else if (nx == columnRslt_chd_itm_jnl_nm) doRslt_chd_itm_jnl_nm_NX(info);
		else if (nx == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NX(info);
		else if (nx == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_NX(info);
		else if (nx == columnRslt_expns_cd) doRslt_expns_cd_NX(info);
		else if (nx == columnRslt_expns_nm) doRslt_expns_nm_NX(info);
		else if (nx == columnRslt_disp_seq) doRslt_disp_seq_NX(info);
		else if (nx == columnRslt_par_unit_cd) doRslt_par_unit_cd_NX(info);
		else if (nx == columnRslt_par_unit_nm) doRslt_par_unit_nm_NX(info);
		else if (nx == columnRslt_par_dec_place) doRslt_par_dec_place_NX(info);
		else if (nx == columnRslt_chd_unit_cd) doRslt_chd_unit_cd_NX(info);
		else if (nx == columnRslt_chd_unit_nm) doRslt_chd_unit_nm_NX(info);
		else if (nx == columnRslt_chd_dec_place) doRslt_chd_dec_place_NX(info);
		else if (nx == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_NX(info);
		else if (nx == columnRslt_rmrks) doRslt_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_non_calc_flg) doRslt_non_calc_flg_NX(info);
		else if (nx == columnRslt_imp_err_flg) doRslt_imp_err_flg_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == columnRslt_key_flg) doRslt_key_flg_NX(info);
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
	 * [TgtCnd]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_dt_NX(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[lump_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_lump_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[par_itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_exist_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_exist_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[change_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_change_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[exist_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_exist_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imp_err_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imp_err_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[term]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_term_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_term_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[no_exist_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_no_exist_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[change_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_change_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[non_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imp_err_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imp_err_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[key_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_key_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == TgtCnd_calc_ctg_cd) doTgtCnd_calc_ctg_cd_LC(info);
		else if (lc == TgtCnd_calc_ctg_nm) doTgtCnd_calc_ctg_nm_LC(info);
		else if (lc == TgtCnd_wg_cd) doTgtCnd_wg_cd_LC(info);
		else if (lc == TgtCnd_wg_nm) doTgtCnd_wg_nm_LC(info);
		else if (lc == TgtCnd_dt) doTgtCnd_dt_LC(info);
		else if (lc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_LC(info);
		else if (lc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_par_itm_jnl_cd) doCnd_par_itm_jnl_cd_LC(info);
		else if (lc == Cnd_par_itm_jnl_nm) doCnd_par_itm_jnl_nm_LC(info);
		else if (lc == Cnd_par_itm_grp_cd1) doCnd_par_itm_grp_cd1_LC(info);
		else if (lc == Cnd_par_itm_grp_nm1) doCnd_par_itm_grp_nm1_LC(info);
		else if (lc == Cnd_par_itm_grp_cd2) doCnd_par_itm_grp_cd2_LC(info);
		else if (lc == Cnd_par_itm_grp_nm2) doCnd_par_itm_grp_nm2_LC(info);
		else if (lc == Cnd_par_itm_grp_cd3) doCnd_par_itm_grp_cd3_LC(info);
		else if (lc == Cnd_par_itm_grp_nm3) doCnd_par_itm_grp_nm3_LC(info);
		else if (lc == Cnd_par_itm_grp_cd4) doCnd_par_itm_grp_cd4_LC(info);
		else if (lc == Cnd_par_itm_grp_nm4) doCnd_par_itm_grp_nm4_LC(info);
		else if (lc == Cnd_par_itm_grp_cd5) doCnd_par_itm_grp_cd5_LC(info);
		else if (lc == Cnd_par_itm_grp_nm5) doCnd_par_itm_grp_nm5_LC(info);
		else if (lc == Cnd_par_itm_grp_cd6) doCnd_par_itm_grp_cd6_LC(info);
		else if (lc == Cnd_par_itm_grp_nm6) doCnd_par_itm_grp_nm6_LC(info);
		else if (lc == Cnd_par_itm_grp_cd7) doCnd_par_itm_grp_cd7_LC(info);
		else if (lc == Cnd_par_itm_grp_nm7) doCnd_par_itm_grp_nm7_LC(info);
		else if (lc == Cnd_par_itm_grp_cd8) doCnd_par_itm_grp_cd8_LC(info);
		else if (lc == Cnd_par_itm_grp_nm8) doCnd_par_itm_grp_nm8_LC(info);
		else if (lc == Cnd_par_itm_grp_cd9) doCnd_par_itm_grp_cd9_LC(info);
		else if (lc == Cnd_par_itm_grp_nm9) doCnd_par_itm_grp_nm9_LC(info);
		else if (lc == Cnd_par_itm_grp_cd10) doCnd_par_itm_grp_cd10_LC(info);
		else if (lc == Cnd_par_itm_grp_nm10) doCnd_par_itm_grp_nm10_LC(info);
		else if (lc == Hdr_calc_ctg_cd) doHdr_calc_ctg_cd_LC(info);
		else if (lc == Hdr_calc_ctg_nm) doHdr_calc_ctg_nm_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_term) doHdr_term_LC(info);
		else if (lc == Hdr_term_nm) doHdr_term_nm_LC(info);
		else if (lc == columnRslt_par_itm_typ) doRslt_par_itm_typ_LC(info);
		else if (lc == columnRslt_par_itm_typ_nm) doRslt_par_itm_typ_nm_LC(info);
		else if (lc == columnRslt_par_itm_typ_d_cd) doRslt_par_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_par_itm_typ_d_nm) doRslt_par_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_par_itm_jnl_cd) doRslt_par_itm_jnl_cd_LC(info);
		else if (lc == columnRslt_par_itm_jnl_nm) doRslt_par_itm_jnl_nm_LC(info);
		else if (lc == columnRslt_bom_ptn) doRslt_bom_ptn_LC(info);
		else if (lc == columnRslt_oper_cd) doRslt_oper_cd_LC(info);
		else if (lc == columnRslt_oper_nm) doRslt_oper_nm_LC(info);
		else if (lc == columnRslt_oper_seq) doRslt_oper_seq_LC(info);
		else if (lc == columnRslt_chd_itm_typ) doRslt_chd_itm_typ_LC(info);
		else if (lc == columnRslt_chd_itm_typ_nm) doRslt_chd_itm_typ_nm_LC(info);
		else if (lc == columnRslt_chd_itm_typ_d_cd) doRslt_chd_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_chd_itm_typ_d_nm) doRslt_chd_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_chd_itm_jnl_cd) doRslt_chd_itm_jnl_cd_LC(info);
		else if (lc == columnRslt_chd_itm_jnl_nm) doRslt_chd_itm_jnl_nm_LC(info);
		else if (lc == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_LC(info);
		else if (lc == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_LC(info);
		else if (lc == columnRslt_expns_cd) doRslt_expns_cd_LC(info);
		else if (lc == columnRslt_expns_nm) doRslt_expns_nm_LC(info);
		else if (lc == columnRslt_disp_seq) doRslt_disp_seq_LC(info);
		else if (lc == columnRslt_par_unit_cd) doRslt_par_unit_cd_LC(info);
		else if (lc == columnRslt_par_unit_nm) doRslt_par_unit_nm_LC(info);
		else if (lc == columnRslt_par_dec_place) doRslt_par_dec_place_LC(info);
		else if (lc == columnRslt_chd_unit_cd) doRslt_chd_unit_cd_LC(info);
		else if (lc == columnRslt_chd_unit_nm) doRslt_chd_unit_nm_LC(info);
		else if (lc == columnRslt_chd_dec_place) doRslt_chd_dec_place_LC(info);
		else if (lc == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_LC(info);
		else if (lc == columnRslt_rmrks) doRslt_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [TgtCnd]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [TgtCnd]パネルの[dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtCnd_dt_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[par_itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[term]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_term_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_term_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[TgtCnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getTgtCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[TgtCnd_wg_cd]の作成メソッド
	 */
	public MCList getTgtCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_jnl_cd]の作成メソッド
	 */
	public MCList getCnd_par_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp10(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0420.Ins01")) {
			return new MG_MGBDL0420_Ins01Bridge();
		}
		if (id.equals("MG.MGBDL0420.Srch01")) {
			return new MG_MGBDL0420_Srch01Bridge();
		}
		if (id.equals("MG.MGBDL0420.Upd01")) {
			return new MG_MGBDL0420_Upd01Bridge();
		}
		if (id.equals("MG.MGBDL0420.Upd02")) {
			return new MG_MGBDL0420_Upd02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0420_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0420_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0420_Ins01;

		/** コンストラクタ */
		protected MG_MGBDL0420_Ins01Bridge() {
			p_MG_MGBDL0420_Ins01 = new MCParam(PDef.MG_MGBDL0420_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0420_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0420.TgtCndR.create());
			// Down

			p_MG_MGBDL0420_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0420_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0420_Ins01.addUpBlock(getTgtCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0420_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0420_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0420.TgtCndR up0() {
			return (mcframe.clientMGBD.MGBDP0420.TgtCndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBDL0420_Ins01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getTgtCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBDL0420_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0420_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0420_Srch01;

		/** コンストラクタ */
		protected MG_MGBDL0420_Srch01Bridge() {
			p_MG_MGBDL0420_Srch01 = new MCParam(PDef.MG_MGBDL0420_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0420_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0420.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0420.RsltR.class));

			p_MG_MGBDL0420_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0420_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0420_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0420_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0420_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0420.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0420.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0420.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0420.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0420_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0420.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0420_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0420.RsltR>)p_MG_MGBDL0420_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBDL0420_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0420_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0420_Upd01;

		/** コンストラクタ */
		protected MG_MGBDL0420_Upd01Bridge() {
			p_MG_MGBDL0420_Upd01 = new MCParam(PDef.MG_MGBDL0420_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0420_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0420.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0420.RsltR.class));
			// Down

			p_MG_MGBDL0420_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0420_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0420_Upd01.addUpBlock(getHdrR());
			p_MG_MGBDL0420_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0420_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0420_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0420.HdrR up0() {
			return (mcframe.clientMGBD.MGBDP0420.HdrR)up(0);
		}
		protected MCList<mcframe.clientMGBD.MGBDP0420.RsltR> up1() {
			return (MCList<mcframe.clientMGBD.MGBDP0420.RsltR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBDL0420_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBDL0420_Upd02]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0420_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0420_Upd02;

		/** コンストラクタ */
		protected MG_MGBDL0420_Upd02Bridge() {
			p_MG_MGBDL0420_Upd02 = new MCParam(PDef.MG_MGBDL0420_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0420_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0420.CndR.create());
			// Down

			p_MG_MGBDL0420_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0420_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0420_Upd02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0420_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0420_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0420.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0420.CndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBDL0420_Upd02;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}