package mcframe.clientMGBD.MGBDP0660;

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
import mcframe.clientMGBD.MGBDP0660.MGBDP_ItmProcReg_MC.MG_MGBDL0660_Srch01Caller;
import mcframe.clientMGBD.MGBDP0660.MGBDP_ItmProcReg_MC.MG_MGBDL0660_Upd01Caller;
import mcframe.clientMGBD.MGBDP0660.MGBDP_ItmProcReg_MC.MG_MGBDL0660_Del01Caller;
import mcframe.clientMGBD.MGBDP0660.MGBDP_ItmProcReg_MC.MG_MGBDL0660_Imp01Caller;

/**
 * 画面"MGBDP_ItmProcReg"パネルクラスです。<p>
 *
 * 原価品目加工単価情報を登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_ItmProcReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBDP0660";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;ALL,Bulk update,1;DEL,Delete,2;REF,View,3 UPD,登録・訂正する,0;ALL,一括更新する,1;DEL,削除する,2;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_ALL = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
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
	public mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term_fr;	// [Cnd]の[term_p.term_fr]を[Cnd_term_fr]としてエイリアス定義。
	public MCTextField Cnd_term_fr_nm;	// [Cnd]の[term_p.term_fr_nm]を[Cnd_term_fr_nm]としてエイリアス定義。
	public MCDateComboBox Cnd_term_to;	// [Cnd]の[term_p.term_to]を[Cnd_term_to]としてエイリアス定義。
	public MCTextField Cnd_term_to_nm;	// [Cnd]の[term_p.term_to_nm]を[Cnd_term_to_nm]としてエイリアス定義。
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
	public MCLabel Cnd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Cnd_cur_nm = null;
	public MCLabel Cnd_sppl_cd_Label = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCTextField Cnd_sppl_nm = null;
	public MCLabel Cnd_cntry_cd_Label = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCTextField Cnd_cntry_nm = null;
	public MCLabel Cnd_area_cd_Label = null;
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_area_cd = null;
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public MCTextField Cnd_area_nm = null;
	public MCLabel Cnd_rmrks_Label = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCTextField Cnd_rmrks = null;
	public MCLabel Cnd_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Cnd_sub_char1 = null;
	public MCLabel Cnd_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Cnd_sub_char2 = null;
	public MCLabel Cnd_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Cnd_sub_char3 = null;
	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public MCLabel Cnd_non_calc_flg_lab = null;
	/**
	 * Not to calculate. Off 計算対象外.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_non_calc_flg = null;
	/**
	 * Not to calculate. On 計算対象外.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_non_calc_flg = null;
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
	public MCLabel Cnd_sppl_grp_cd1_Label = null;
	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd1 = null;
	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm1 = null;
	public MCLabel Cnd_sppl_grp_cd2_Label = null;
	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd2 = null;
	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm2 = null;
	public MCLabel Cnd_sppl_grp_cd3_Label = null;
	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd3 = null;
	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm3 = null;
	public MCLabel Cnd_sppl_grp_cd4_Label = null;
	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd4 = null;
	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm4 = null;
	public MCLabel Cnd_sppl_grp_cd5_Label = null;
	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd5 = null;
	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm5 = null;
	public MCLabel Cnd_sppl_grp_cd6_Label = null;
	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd6 = null;
	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm6 = null;
	public MCLabel Cnd_sppl_grp_cd7_Label = null;
	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd7 = null;
	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm7 = null;
	public MCLabel Cnd_sppl_grp_cd8_Label = null;
	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd8 = null;
	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm8 = null;
	public MCLabel Cnd_sppl_grp_cd9_Label = null;
	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd9 = null;
	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm9 = null;
	public MCLabel Cnd_sppl_grp_cd10_Label = null;
	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd10 = null;
	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm10 = null;
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
	// [Cnd3]ブロック関連のField定義
	public MCPanel Cnd3Panel = null;
	// [Cnd3]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Calc]ブロック関連のField定義
	public MCPanel CalcPanel = null;
	// [Calc]ブロックの項目のField定義
	public MCLabel Calc_percentage_Label = null;
	/**
	 * Update rate 更新率.<p>
	 *
	 */
	public MCNumberField Calc_percentage = null;
	/**
	 * % ％.<p>
	 *
	 */
	public MCLabel Calc_percent = null;
	public MCLabel Calc_rnd_typ_Label = null;
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public MCTextComboBox Calc_rnd_typ = null;
	/**
	 * Rounding type name 端数処理区分名.<p>
	 *
	 */
	public MCTextField Calc_rnd_typ_nm = null;
	/**
	 * Calculate new unit price 新単価計算.<p>
	 *
	 */
	public MCButton Calc_calc = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0660.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_ctg_nm = null;
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
	public mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D Rslt_term_p_PPanel;
	public MCColumnConfig columnRslt_term;// [Rslt]の[term_p.term]を[columnRslt_term]としてエイリアス定義。
	public MCColumnConfig columnRslt_term_nm;// [Rslt]の[term_p.term_nm]を[columnRslt_term_nm]としてエイリアス定義。
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
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_qty;// [Rslt]の[base_qty_p.qty]を[columnRslt_base_qty]としてエイリアス定義。
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
	 * Unit number of decimal places 単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dec_place = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_nm = null;
	/**
	 * Currency number of decimal places 通貨小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri_dec_place = null;
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_outsrc_upri_typ = null;
	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_outsrc_upri_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_upri_p_PPanel;
	public MCColumnConfig columnRslt_upri;// [Rslt]の[upri_p.upri]を[columnRslt_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_calc_upri_p_PPanel;
	public MCColumnConfig columnRslt_calc_upri;// [Rslt]の[calc_upri_p.upri]を[columnRslt_calc_upri]としてエイリアス定義。
	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cost_ratio = null;
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
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
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
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd = null;
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
	public MCButton Btn_upd_cmn = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_wg = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del_cmn = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del_wg = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [SRCH_ALL]モードを表す定数 */
	public static final String SRCH_ALL = "SRCH_ALL";
	/** [ALL]モードを表す定数 */
	public static final String ALL = "ALL";
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, SRCH_ALL, ALL, SRCH_REF, REF, SRCH_DEL, DEL, FIX_U};
	
	/** [MG_MGBDL0660_Srch01]のCallerの作成 */
	protected MGBDP_ItmProcReg_MC.MG_MGBDL0660_Srch01Caller createMG_MGBDL0660_Srch01() {
		MGBDP_ItmProcReg_MC.MG_MGBDL0660_Srch01Caller<MGBDP_ItmProcReg, MG_MGBDL0660_Srch01Bridge>
		caller = ((MGBDP_ItmProcReg_MC)this).new MG_MGBDL0660_Srch01Caller<MGBDP_ItmProcReg, MG_MGBDL0660_Srch01Bridge>(
					(MGBDP_ItmProcReg)this, new MG_MGBDL0660_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBDL0660_Srch01]の呼び出し */
	protected void callMG_MGBDL0660_Srch01() {
		MCCaller caller = createMG_MGBDL0660_Srch01();
		caller.exec();
	}
	/** [MG_MGBDL0660_Upd01]のCallerの作成 */
	protected MGBDP_ItmProcReg_MC.MG_MGBDL0660_Upd01Caller createMG_MGBDL0660_Upd01() {
		MGBDP_ItmProcReg_MC.MG_MGBDL0660_Upd01Caller<MGBDP_ItmProcReg, MG_MGBDL0660_Upd01Bridge>
		caller = ((MGBDP_ItmProcReg_MC)this).new MG_MGBDL0660_Upd01Caller<MGBDP_ItmProcReg, MG_MGBDL0660_Upd01Bridge>(
					(MGBDP_ItmProcReg)this, new MG_MGBDL0660_Upd01Bridge());
		return caller;
	}
	/** [MG_MGBDL0660_Upd01]の呼び出し */
	protected void callMG_MGBDL0660_Upd01() {
		MCCaller caller = createMG_MGBDL0660_Upd01();
		caller.exec();
	}
	/** [MG_MGBDL0660_Del01]のCallerの作成 */
	protected MGBDP_ItmProcReg_MC.MG_MGBDL0660_Del01Caller createMG_MGBDL0660_Del01() {
		MGBDP_ItmProcReg_MC.MG_MGBDL0660_Del01Caller<MGBDP_ItmProcReg, MG_MGBDL0660_Del01Bridge>
		caller = ((MGBDP_ItmProcReg_MC)this).new MG_MGBDL0660_Del01Caller<MGBDP_ItmProcReg, MG_MGBDL0660_Del01Bridge>(
					(MGBDP_ItmProcReg)this, new MG_MGBDL0660_Del01Bridge());
		return caller;
	}
	/** [MG_MGBDL0660_Del01]の呼び出し */
	protected void callMG_MGBDL0660_Del01() {
		MCCaller caller = createMG_MGBDL0660_Del01();
		caller.exec();
	}
	/** [MG_MGBDL0660_Imp01]のCallerの作成 */
	protected MGBDP_ItmProcReg_MC.MG_MGBDL0660_Imp01Caller createMG_MGBDL0660_Imp01() {
		MGBDP_ItmProcReg_MC.MG_MGBDL0660_Imp01Caller<MGBDP_ItmProcReg, MG_MGBDL0660_Imp01Bridge>
		caller = ((MGBDP_ItmProcReg_MC)this).new MG_MGBDL0660_Imp01Caller<MGBDP_ItmProcReg, MG_MGBDL0660_Imp01Bridge>(
					(MGBDP_ItmProcReg)this, new MG_MGBDL0660_Imp01Bridge());
		return caller;
	}
	/** [MG_MGBDL0660_Imp01]の呼び出し */
	protected void callMG_MGBDL0660_Imp01() {
		MCCaller caller = createMG_MGBDL0660_Imp01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0660.CndR aCndR;
	/** [Calc]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0660.CalcR aCalcR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0660.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0660.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0660.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0660.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0660.CndR.create();
	}

	/**
	 * 項目コピーによってaCalcRを設定します。
	 *
	 * aCalcRのインスタンスは変更されません。
	 *
	 * @param row CalcR
	 */
	public void setCalcR(mcframe.clientMGBD.MGBDP0660.CalcR row) {
		if (row != null) {
			MCRow.copyall(getCalcR(), row);
		}
	}

	/**
	 * [Calc]ブロックのコンテナaCalcRを返します。
	 *
	 * @return CalcR
	 */
	public mcframe.clientMGBD.MGBDP0660.CalcR getCalcR() {
		return aCalcR;
	}

	/**
	 * aCalcRを作成します。
	 *
	 * @return CalcR
	 */
	public mcframe.clientMGBD.MGBDP0660.CalcR createCalcR() {
		return mcframe.clientMGBD.MGBDP0660.CalcR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBD.MGBDP0660.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0660.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBD.MGBDP0660.RsltR createRsltR() {
		return mcframe.clientMGBD.MGBDP0660.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0660.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0660.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getCalcR())) ret.add(getCalcR());
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
		if(aCnt == getCalcR()) return "Calc";
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
		if(bId.equals("Calc")) return getCalcR();
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
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(Cnd3Panel);
		ret.add(CtrlPanel);
		ret.add(CalcPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ItmProcReg_MC_A() {
		aCndR = createCndR();
		aCalcR = createCalcR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_ItmProcReg_MC_A(String name) {
		aCndR = createCndR();
		aCalcR = createCalcR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBDP_ItmProcReg_MC.jbCreateScreenOpe((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbCreateRegTarget((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbCreateTop((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbCreateFold((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbCreateTab1((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbCreateTab2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbCreateTab3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbCreateCnd((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbCreateCnd2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbCreateCnd3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbCreateCtrl((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbCreateCalc((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbCreateRslt((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbCreateBtn((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbCreateEastBtn((MGBDP_ItmProcReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBDP_ItmProcReg p) {
	}

	/**
	 * [RegTarget]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRegTarget(MGBDP_ItmProcReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBDP_ItmProcReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBDP_ItmProcReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBDP_ItmProcReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBDP_ItmProcReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MGBDP_ItmProcReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_ItmProcReg p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term_fr = p.Cnd_term_p_PPanel.Term_term_fr;
		p.Cnd_term_fr.addAliasName("Cnd.term_fr", p);
		p.Cnd_term_fr_nm = p.Cnd_term_p_PPanel.Term_term_fr_nm;
		p.Cnd_term_fr_nm.addAliasName("Cnd.term_fr_nm", p);
		p.Cnd_term_to = p.Cnd_term_p_PPanel.Term_term_to;
		p.Cnd_term_to.addAliasName("Cnd.term_to", p);
		p.Cnd_term_to_nm = p.Cnd_term_p_PPanel.Term_term_to_nm;
		p.Cnd_term_to_nm.addAliasName("Cnd.term_to_nm", p);
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
	protected static void jbCreateCnd2(MGBDP_ItmProcReg p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MGBDP_ItmProcReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBDP_ItmProcReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Calc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCalc(MGBDP_ItmProcReg p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBDP_ItmProcReg p) {
		p.Rslt_term_p_PPanel = mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.create(mcframe.clientMGBD.MGBDP0660.RsltR.$term_p);
		p.Rslt_term_p_PPanel.setName("Rslt.term_p");
		p.columnRslt_term = p.Rslt_term_p_PPanel.columnTerm_term;
		p.columnRslt_term.addAliasName("Rslt.term", p);
		p.columnRslt_term_nm = p.Rslt_term_p_PPanel.columnTerm_term_nm;
		p.columnRslt_term_nm.addAliasName("Rslt.term_nm", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0660.RsltR.$itm_p);
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
		p.Rslt_base_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0660.RsltR.$base_qty_p);
		p.Rslt_base_qty_p_PPanel.setName("Rslt.base_qty_p");
		p.columnRslt_base_qty = p.Rslt_base_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_qty.addAliasName("Rslt.base_qty", p);
		p.Rslt_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMGBD.MGBDP0660.RsltR.$upri_p);
		p.Rslt_upri_p_PPanel.setName("Rslt.upri_p");
		p.columnRslt_upri = p.Rslt_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_upri.addAliasName("Rslt.upri", p);
		p.Rslt_calc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMGBD.MGBDP0660.RsltR.$calc_upri_p);
		p.Rslt_calc_upri_p_PPanel.setName("Rslt.calc_upri_p");
		p.columnRslt_calc_upri = p.Rslt_calc_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_calc_upri.addAliasName("Rslt.calc_upri", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMGBD.MGBDP0660.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBDP_ItmProcReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBDP_ItmProcReg p) {
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
	
	
	/** [Cnd_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cur_cd_p = null;

	/**
	 * [Cnd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cur_cd_ListPutter() {
		if (Cnd_cur_cd_p == null) {
			Cnd_cur_cd_p = createCnd_cur_cd_ListPutter(Cnd_cur_cd, "cur_cd", "cur_nm");

		}
		return Cnd_cur_cd_p;
	}
	
	
	/** [Cnd_sppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_cd_p = null;

	/**
	 * [Cnd_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_cd_ListPutter() {
		if (Cnd_sppl_cd_p == null) {
			Cnd_sppl_cd_p = createCnd_sppl_cd_ListPutter(Cnd_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Cnd_sppl_cd_p;
	}
	
	
	/** [Cnd_cntry_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cntry_cd_p = null;

	/**
	 * [Cnd_cntry_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cntry_cd_ListPutter() {
		if (Cnd_cntry_cd_p == null) {
			Cnd_cntry_cd_p = createCnd_cntry_cd_ListPutter(Cnd_cntry_cd, "cntry_cd", "cntry_nm");

		}
		return Cnd_cntry_cd_p;
	}
	
	
	/** [Cnd_area_cd_ListPutter]の定義 */
	private MCListPutter Cnd_area_cd_p = null;

	/**
	 * [Cnd_area_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_area_cd_ListPutter() {
		if (Cnd_area_cd_p == null) {
			Cnd_area_cd_p = createCnd_area_cd_ListPutter(Cnd_area_cd, "area_cd", "area_nm");

		}
		return Cnd_area_cd_p;
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
	
	
	/** [Cnd_sppl_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd1_p = null;

	/**
	 * [Cnd_sppl_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd1_ListPutter() {
		if (Cnd_sppl_grp_cd1_p == null) {
			Cnd_sppl_grp_cd1_p = createCnd_sppl_grp_cd1_ListPutter(Cnd_sppl_grp_cd1, "sppl_grp_cd1", "sppl_grp_nm1");

		}
		return Cnd_sppl_grp_cd1_p;
	}
	
	
	/** [Cnd_sppl_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd2_p = null;

	/**
	 * [Cnd_sppl_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd2_ListPutter() {
		if (Cnd_sppl_grp_cd2_p == null) {
			Cnd_sppl_grp_cd2_p = createCnd_sppl_grp_cd2_ListPutter(Cnd_sppl_grp_cd2, "sppl_grp_cd2", "sppl_grp_nm2");

		}
		return Cnd_sppl_grp_cd2_p;
	}
	
	
	/** [Cnd_sppl_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd3_p = null;

	/**
	 * [Cnd_sppl_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd3_ListPutter() {
		if (Cnd_sppl_grp_cd3_p == null) {
			Cnd_sppl_grp_cd3_p = createCnd_sppl_grp_cd3_ListPutter(Cnd_sppl_grp_cd3, "sppl_grp_cd3", "sppl_grp_nm3");

		}
		return Cnd_sppl_grp_cd3_p;
	}
	
	
	/** [Cnd_sppl_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd4_p = null;

	/**
	 * [Cnd_sppl_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd4_ListPutter() {
		if (Cnd_sppl_grp_cd4_p == null) {
			Cnd_sppl_grp_cd4_p = createCnd_sppl_grp_cd4_ListPutter(Cnd_sppl_grp_cd4, "sppl_grp_cd4", "sppl_grp_nm4");

		}
		return Cnd_sppl_grp_cd4_p;
	}
	
	
	/** [Cnd_sppl_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd5_p = null;

	/**
	 * [Cnd_sppl_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd5_ListPutter() {
		if (Cnd_sppl_grp_cd5_p == null) {
			Cnd_sppl_grp_cd5_p = createCnd_sppl_grp_cd5_ListPutter(Cnd_sppl_grp_cd5, "sppl_grp_cd5", "sppl_grp_nm5");

		}
		return Cnd_sppl_grp_cd5_p;
	}
	
	
	/** [Cnd_sppl_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd6_p = null;

	/**
	 * [Cnd_sppl_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd6_ListPutter() {
		if (Cnd_sppl_grp_cd6_p == null) {
			Cnd_sppl_grp_cd6_p = createCnd_sppl_grp_cd6_ListPutter(Cnd_sppl_grp_cd6, "sppl_grp_cd6", "sppl_grp_nm6");

		}
		return Cnd_sppl_grp_cd6_p;
	}
	
	
	/** [Cnd_sppl_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd7_p = null;

	/**
	 * [Cnd_sppl_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd7_ListPutter() {
		if (Cnd_sppl_grp_cd7_p == null) {
			Cnd_sppl_grp_cd7_p = createCnd_sppl_grp_cd7_ListPutter(Cnd_sppl_grp_cd7, "sppl_grp_cd7", "sppl_grp_nm7");

		}
		return Cnd_sppl_grp_cd7_p;
	}
	
	
	/** [Cnd_sppl_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd8_p = null;

	/**
	 * [Cnd_sppl_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd8_ListPutter() {
		if (Cnd_sppl_grp_cd8_p == null) {
			Cnd_sppl_grp_cd8_p = createCnd_sppl_grp_cd8_ListPutter(Cnd_sppl_grp_cd8, "sppl_grp_cd8", "sppl_grp_nm8");

		}
		return Cnd_sppl_grp_cd8_p;
	}
	
	
	/** [Cnd_sppl_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd9_p = null;

	/**
	 * [Cnd_sppl_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd9_ListPutter() {
		if (Cnd_sppl_grp_cd9_p == null) {
			Cnd_sppl_grp_cd9_p = createCnd_sppl_grp_cd9_ListPutter(Cnd_sppl_grp_cd9, "sppl_grp_cd9", "sppl_grp_nm9");

		}
		return Cnd_sppl_grp_cd9_p;
	}
	
	
	/** [Cnd_sppl_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd10_p = null;

	/**
	 * [Cnd_sppl_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd10_ListPutter() {
		if (Cnd_sppl_grp_cd10_p == null) {
			Cnd_sppl_grp_cd10_p = createCnd_sppl_grp_cd10_ListPutter(Cnd_sppl_grp_cd10, "sppl_grp_cd10", "sppl_grp_nm10");

		}
		return Cnd_sppl_grp_cd10_p;
	}
	
	
	/** [Calc_rnd_typ_ListPutter]の定義 */
	private MCListPutter Calc_rnd_typ_p = null;

	/**
	 * [Calc_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getCalc_rnd_typ_ListPutter() {
		if (Calc_rnd_typ_p == null) {
			Calc_rnd_typ_p = createCalc_rnd_typ_ListPutter(Calc_rnd_typ, "rnd_typ", "rnd_typ_nm");

		}
		return Calc_rnd_typ_p;
	}
	
	
	/** [Rslt_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Rslt_calc_ctg_cd_p = null;

	/**
	 * [Rslt_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_calc_ctg_cd_ListPutter() {
		if (Rslt_calc_ctg_cd_p == null) {
			Rslt_calc_ctg_cd_p = createRslt_calc_ctg_cd_ListPutter(columnRslt_calc_ctg_cd, "calc_ctg_cd", "calc_ctg_nm");

		}
		return Rslt_calc_ctg_cd_p;
	}
	
	
	/** [Rslt_wg_cd_ListPutter]の定義 */
	private MCListPutter Rslt_wg_cd_p = null;

	/**
	 * [Rslt_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_wg_cd_ListPutter() {
		if (Rslt_wg_cd_p == null) {
			Rslt_wg_cd_p = createRslt_wg_cd_ListPutter(columnRslt_wg_cd, "wg_cd", "wg_nm");

		}
		return Rslt_wg_cd_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_cd_p = createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_jnl_cd","unit_cd","unit_nm","dec_place","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm","itm_nm","itm_sub1","itm_sub2","itm_sub3","base_qty");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_sub1_p = createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_jnl_cd","unit_cd","unit_nm","dec_place","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm","itm_nm","itm_sub2","itm_sub3","base_qty");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_sub2_p = createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_jnl_cd","unit_cd","unit_nm","dec_place","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm","itm_nm","itm_sub3","base_qty");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_sub3_p = createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_jnl_cd","unit_cd","unit_nm","dec_place","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm","itm_nm","base_qty");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Rslt_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_jnl_cd_p = null;

	/**
	 * [Rslt_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_jnl_cd_ListPutter() {
		if (Rslt_itm_jnl_cd_p == null) {
			Rslt_itm_jnl_cd_p = createRslt_itm_jnl_cd_ListPutter(columnRslt_itm_jnl_cd, "itm_jnl_cd", "itm_jnl_nm");

		}
		return Rslt_itm_jnl_cd_p;
	}
	
	
	/** [Rslt_sppl_cd_ListPutter]の定義 */
	private MCListPutter Rslt_sppl_cd_p = null;

	/**
	 * [Rslt_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_sppl_cd_ListPutter() {
		if (Rslt_sppl_cd_p == null) {
			Rslt_sppl_cd_p = createRslt_sppl_cd_ListPutter(columnRslt_sppl_cd, "sppl_cd", "sppl_nm","cur_cd","outsrc_upri_typ");

		}
		return Rslt_sppl_cd_p;
	}
	
	
	/** [Rslt_cur_cd_ListPutter]の定義 */
	private MCListPutter Rslt_cur_cd_p = null;

	/**
	 * [Rslt_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cur_cd_ListPutter() {
		if (Rslt_cur_cd_p == null) {
			Rslt_cur_cd_p = createRslt_cur_cd_ListPutter(columnRslt_cur_cd, "cur_cd", "cur_nm","upri_dec_place");

		}
		return Rslt_cur_cd_p;
	}
	
	
	/** [Rslt_outsrc_upri_typ_ListPutter]の定義 */
	private MCListPutter Rslt_outsrc_upri_typ_p = null;

	/**
	 * [Rslt_outsrc_upri_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_outsrc_upri_typ_ListPutter() {
		if (Rslt_outsrc_upri_typ_p == null) {
			Rslt_outsrc_upri_typ_p = createRslt_outsrc_upri_typ_ListPutter(columnRslt_outsrc_upri_typ, "outsrc_upri_typ", "outsrc_upri_typ_nm");

		}
		return Rslt_outsrc_upri_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_ItmProcReg create(){
		MGBDP_ItmProcReg p = new MGBDP_ItmProcReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_ItmProcReg create(String name){
		MGBDP_ItmProcReg p = new MGBDP_ItmProcReg(name);
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
		MGBDP_ItmProcReg_MC.jbfInitScreenOpe((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbfInitRegTarget((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbfInitTop((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbfInitFold((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbfInitTab1((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbfInitTab2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbfInitTab3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbfInitCnd((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbfInitCnd2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbfInitCnd3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbfInitCtrl((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbfInitCalc((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbfInitRslt((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbfInitBtn((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbfInitEastBtn((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbInitScreenOpe((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbInitRegTarget((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbInitTop((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbInitFold((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbInitTab1((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbInitTab2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbInitTab3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbInitCnd((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbInitCnd2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbInitCnd3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbInitCtrl((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbInitCalc((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbInitRslt((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbInitBtn((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.jbInitEastBtn((MGBDP_ItmProcReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRegTarget(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.RegTargetPanel = p.beansFactory.createPanel("RegTarget");
		p.RegTargetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBDP_ItmProcReg p) {
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
	protected static void jbfInitTab1(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_ALL = p.beansFactory.createRadioButton("Cnd.ope_ALL");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
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
		p.Cnd_itm_jnl_cd_Label = p.beansFactory.createLabel("Cnd.itm_jnl_cd_Label");
		p.Cnd_itm_jnl_cd = p.beansFactory.createTextComboBox("Cnd.itm_jnl_cd");
		p.Cnd_itm_jnl_cd.setLabel(p.Cnd_itm_jnl_cd_Label);
		p.Cnd_itm_jnl_nm = p.beansFactory.createTextField("Cnd.itm_jnl_nm");
		p.Cnd_cur_cd_Label = p.beansFactory.createLabel("Cnd.cur_cd_Label");
		p.Cnd_cur_cd = p.beansFactory.createTextComboBox("Cnd.cur_cd");
		p.Cnd_cur_cd.setLabel(p.Cnd_cur_cd_Label);
		p.Cnd_cur_nm = p.beansFactory.createTextField("Cnd.cur_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_cntry_cd_Label = p.beansFactory.createLabel("Cnd.cntry_cd_Label");
		p.Cnd_cntry_cd = p.beansFactory.createTextComboBox("Cnd.cntry_cd");
		p.Cnd_cntry_cd.setLabel(p.Cnd_cntry_cd_Label);
		p.Cnd_cntry_nm = p.beansFactory.createTextField("Cnd.cntry_nm");
		p.Cnd_area_cd_Label = p.beansFactory.createLabel("Cnd.area_cd_Label");
		p.Cnd_area_cd = p.beansFactory.createTextComboBox("Cnd.area_cd");
		p.Cnd_area_cd.setLabel(p.Cnd_area_cd_Label);
		p.Cnd_area_nm = p.beansFactory.createTextField("Cnd.area_nm");
		p.Cnd_rmrks_Label = p.beansFactory.createLabel("Cnd.rmrks_Label");
		p.Cnd_rmrks = p.beansFactory.createTextField("Cnd.rmrks");
		p.Cnd_rmrks.setLabel(p.Cnd_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_non_calc_flg_lab = p.beansFactory.createLabel("Cnd.non_calc_flg_lab");
		p.Cnd_off_non_calc_flg = p.beansFactory.createCheckBox("Cnd.off_non_calc_flg");
		p.Cnd_on_non_calc_flg = p.beansFactory.createCheckBox("Cnd.on_non_calc_flg");
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
		p.Cnd_sppl_grp_cd1_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd1_Label");
		p.Cnd_sppl_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd1");
		p.Cnd_sppl_grp_cd1.setLabel(p.Cnd_sppl_grp_cd1_Label);
		p.Cnd_sppl_grp_nm1 = p.beansFactory.createTextField("Cnd.sppl_grp_nm1");
		p.Cnd_sppl_grp_cd2_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd2_Label");
		p.Cnd_sppl_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd2");
		p.Cnd_sppl_grp_cd2.setLabel(p.Cnd_sppl_grp_cd2_Label);
		p.Cnd_sppl_grp_nm2 = p.beansFactory.createTextField("Cnd.sppl_grp_nm2");
		p.Cnd_sppl_grp_cd3_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd3_Label");
		p.Cnd_sppl_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd3");
		p.Cnd_sppl_grp_cd3.setLabel(p.Cnd_sppl_grp_cd3_Label);
		p.Cnd_sppl_grp_nm3 = p.beansFactory.createTextField("Cnd.sppl_grp_nm3");
		p.Cnd_sppl_grp_cd4_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd4_Label");
		p.Cnd_sppl_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd4");
		p.Cnd_sppl_grp_cd4.setLabel(p.Cnd_sppl_grp_cd4_Label);
		p.Cnd_sppl_grp_nm4 = p.beansFactory.createTextField("Cnd.sppl_grp_nm4");
		p.Cnd_sppl_grp_cd5_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd5_Label");
		p.Cnd_sppl_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd5");
		p.Cnd_sppl_grp_cd5.setLabel(p.Cnd_sppl_grp_cd5_Label);
		p.Cnd_sppl_grp_nm5 = p.beansFactory.createTextField("Cnd.sppl_grp_nm5");
		p.Cnd_sppl_grp_cd6_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd6_Label");
		p.Cnd_sppl_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd6");
		p.Cnd_sppl_grp_cd6.setLabel(p.Cnd_sppl_grp_cd6_Label);
		p.Cnd_sppl_grp_nm6 = p.beansFactory.createTextField("Cnd.sppl_grp_nm6");
		p.Cnd_sppl_grp_cd7_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd7_Label");
		p.Cnd_sppl_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd7");
		p.Cnd_sppl_grp_cd7.setLabel(p.Cnd_sppl_grp_cd7_Label);
		p.Cnd_sppl_grp_nm7 = p.beansFactory.createTextField("Cnd.sppl_grp_nm7");
		p.Cnd_sppl_grp_cd8_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd8_Label");
		p.Cnd_sppl_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd8");
		p.Cnd_sppl_grp_cd8.setLabel(p.Cnd_sppl_grp_cd8_Label);
		p.Cnd_sppl_grp_nm8 = p.beansFactory.createTextField("Cnd.sppl_grp_nm8");
		p.Cnd_sppl_grp_cd9_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd9_Label");
		p.Cnd_sppl_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd9");
		p.Cnd_sppl_grp_cd9.setLabel(p.Cnd_sppl_grp_cd9_Label);
		p.Cnd_sppl_grp_nm9 = p.beansFactory.createTextField("Cnd.sppl_grp_nm9");
		p.Cnd_sppl_grp_cd10_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd10_Label");
		p.Cnd_sppl_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd10");
		p.Cnd_sppl_grp_cd10.setLabel(p.Cnd_sppl_grp_cd10_Label);
		p.Cnd_sppl_grp_nm10 = p.beansFactory.createTextField("Cnd.sppl_grp_nm10");
		p.Cnd_srch_cmn = p.beansFactory.createButton("Cnd.srch_cmn");
		p.Cnd_srch_wg = p.beansFactory.createButton("Cnd.srch_wg");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Calc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCalc(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.CalcPanel = p.beansFactory.createPanel("Calc");
		// ブロックの項目の初期化
		p.Calc_percentage_Label = p.beansFactory.createLabel("Calc.percentage_Label");
		p.Calc_percentage = p.beansFactory.createNumberField("Calc.percentage");
		p.Calc_percentage.setLabel(p.Calc_percentage_Label);
		p.Calc_percent = p.beansFactory.createLabel("Calc.percent");
		p.Calc_rnd_typ_Label = p.beansFactory.createLabel("Calc.rnd_typ_Label");
		p.Calc_rnd_typ = p.beansFactory.createTextComboBox("Calc.rnd_typ");
		p.Calc_rnd_typ.setLabel(p.Calc_rnd_typ_Label);
		p.Calc_rnd_typ_nm = p.beansFactory.createTextField("Calc.rnd_typ_nm");
		p.Calc_calc = p.beansFactory.createButton("Calc.calc");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_calc_ctg_cd = p.beansFactory.createTableColumn("Rslt.calc_ctg_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_calc_ctg_nm = p.beansFactory.createTableColumn("Rslt.calc_ctg_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_itm_jnl_cd = p.beansFactory.createTableColumn("Rslt.itm_jnl_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_itm_jnl_nm = p.beansFactory.createTableColumn("Rslt.itm_jnl_nm", MCColumnType.TEXT);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_unit_cd = p.beansFactory.createTableColumn("Rslt.unit_cd", MCColumnType.TEXT);
		p.columnRslt_unit_nm = p.beansFactory.createTableColumn("Rslt.unit_nm", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_cur_cd = p.beansFactory.createTableColumn("Rslt.cur_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_cur_nm = p.beansFactory.createTableColumn("Rslt.cur_nm", MCColumnType.TEXT);
		p.columnRslt_upri_dec_place = p.beansFactory.createTableColumn("Rslt.upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_outsrc_upri_typ = p.beansFactory.createTableColumn("Rslt.outsrc_upri_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_outsrc_upri_typ_nm = p.beansFactory.createTableColumn("Rslt.outsrc_upri_typ_nm", MCColumnType.TEXT);
		p.columnRslt_cost_ratio = p.beansFactory.createTableColumn("Rslt.cost_ratio", MCColumnType.NUMBER);
		p.columnRslt_rmrks = p.beansFactory.createTableColumn("Rslt.rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_non_calc_flg = p.beansFactory.createTableColumn("Rslt.non_calc_flg", MCColumnType.CHECK);
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
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd_cmn = p.beansFactory.createButton("Btn.upd_cmn", "upd");
		p.Btn_upd_wg = p.beansFactory.createButton("Btn.upd_wg", "upd");
		p.Btn_del_cmn = p.beansFactory.createButton("Btn.del_cmn", "del");
		p.Btn_del_wg = p.beansFactory.createButton("Btn.del_wg", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBDP_ItmProcReg p) {
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
	protected static void jbInitRegTarget(MGBDP_ItmProcReg p) {
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
	protected static void jbInitTop(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.CalcPanel);
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
	protected static void jbInitFold(MGBDP_ItmProcReg p) {
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
	protected static void jbInitTab1(MGBDP_ItmProcReg p) {
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
	protected static void jbInitTab2(MGBDP_ItmProcReg p) {
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
	protected static void jbInitTab3(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.Cnd3Panel, null);
		p.Tab3Panel.setLastBeans(p.Cnd3Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_ALL);
		p.Cnd_ope_ALL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_ALL);
		p.ScreenOpePanel.add(p.Cnd_ope_ALL);
		p.Cnd_ope_ALL.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.ope_META);
		p.RegTargetPanel.add(p.Cnd_cmn_flg);
		p.RegTargetPanel.setLastBeans(p.Cnd_cmn_flg);
		p.Cnd_cmn_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_cmn_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.cmn_flg_META);
		p.RegTargetPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.wg_flg_META);
		p.Cnd_calc_ctg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_ctg_cd, true);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ctg_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.calc_ctg_nm_META);
		p.setPluralValueEnable(p.Cnd_calc_ctg_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_term_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_term_p_PPanel.Term_term_fr.setListType(MCListType.FREE);
		p.Cnd_term_p_PPanel.Term_term_to.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_jnl_cd, true);
		p.Cnd_itm_jnl_cd.setLinkBeans(p.Cnd_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setNextBeans(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_jnl_nm_META);
		p.setPluralValueEnable(p.Cnd_itm_jnl_nm, true);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_cur_cd);
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
		p.Cnd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cur_cd, true);
		p.Cnd_cur_cd.setLinkBeans(p.Cnd_cur_nm);
		p.CndPanel.add(p.Cnd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_cur_cd);
		p.Cnd_cur_cd.setNextBeans(p.Cnd_cur_nm);
		p.Cnd_cur_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.cur_cd_META);
		p.CndPanel.add(p.Cnd_cur_nm);
		p.Cnd_cur_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_cur_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.cur_nm_META);
		p.setPluralValueEnable(p.Cnd_cur_nm, true);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_cntry_cd);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.Cnd_cntry_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cntry_cd, true);
		p.Cnd_cntry_cd.setLinkBeans(p.Cnd_cntry_nm);
		p.CndPanel.add(p.Cnd_cntry_cd_Label);
		p.CndPanel.add(p.Cnd_cntry_cd);
		p.Cnd_cntry_cd.setNextBeans(p.Cnd_cntry_nm);
		p.Cnd_cntry_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.cntry_cd_META);
		p.CndPanel.add(p.Cnd_cntry_nm);
		p.Cnd_cntry_nm.setNextBeans(p.Cnd_area_cd);
		p.Cnd_cntry_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.cntry_nm_META);
		p.setPluralValueEnable(p.Cnd_cntry_nm, true);
		p.Cnd_area_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_area_cd, true);
		p.Cnd_area_cd.setLinkBeans(p.Cnd_area_nm);
		p.CndPanel.add(p.Cnd_area_cd_Label);
		p.CndPanel.add(p.Cnd_area_cd);
		p.Cnd_area_cd.setNextBeans(p.Cnd_area_nm);
		p.Cnd_area_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.area_cd_META);
		p.CndPanel.add(p.Cnd_area_nm);
		p.Cnd_area_nm.setNextBeans(p.Cnd_rmrks);
		p.Cnd_area_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.area_nm_META);
		p.setPluralValueEnable(p.Cnd_area_nm, true);
		p.CndPanel.add(p.Cnd_rmrks_Label);
		p.CndPanel.add(p.Cnd_rmrks);
		p.Cnd_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_rmrks.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.rmrks_META);
		p.setPluralValueEnable(p.Cnd_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_off_non_calc_flg);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_non_calc_flg_lab);
		p.CndPanel.add(p.Cnd_off_non_calc_flg);
		p.Cnd_off_non_calc_flg.setNextBeans(p.Cnd_on_non_calc_flg);
		p.Cnd_off_non_calc_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.off_non_calc_flg_META);
		p.CndPanel.add(p.Cnd_on_non_calc_flg);
		p.Cnd_on_non_calc_flg.setNextBeans(p.Cnd_srch_cmn);
		p.Cnd_on_non_calc_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.on_non_calc_flg_META);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
		p.Cnd_sppl_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd1, true);
		p.Cnd_sppl_grp_cd1.setLinkBeans(p.Cnd_sppl_grp_nm1);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd1_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd1);
		p.Cnd3Panel.setLastBeans(p.Cnd_sppl_grp_cd1);
		p.Cnd_sppl_grp_cd1.setNextBeans(p.Cnd_sppl_grp_nm1);
		p.Cnd_sppl_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_cd1_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm1);
		p.Cnd_sppl_grp_nm1.setNextBeans(p.Cnd_sppl_grp_cd2);
		p.Cnd_sppl_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm1, true);
		p.Cnd_sppl_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd2, true);
		p.Cnd_sppl_grp_cd2.setLinkBeans(p.Cnd_sppl_grp_nm2);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd2_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd2);
		p.Cnd_sppl_grp_cd2.setNextBeans(p.Cnd_sppl_grp_nm2);
		p.Cnd_sppl_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_cd2_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm2);
		p.Cnd_sppl_grp_nm2.setNextBeans(p.Cnd_sppl_grp_cd3);
		p.Cnd_sppl_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm2, true);
		p.Cnd_sppl_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd3, true);
		p.Cnd_sppl_grp_cd3.setLinkBeans(p.Cnd_sppl_grp_nm3);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd3_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd3);
		p.Cnd_sppl_grp_cd3.setNextBeans(p.Cnd_sppl_grp_nm3);
		p.Cnd_sppl_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_cd3_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm3);
		p.Cnd_sppl_grp_nm3.setNextBeans(p.Cnd_sppl_grp_cd4);
		p.Cnd_sppl_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm3, true);
		p.Cnd_sppl_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd4, true);
		p.Cnd_sppl_grp_cd4.setLinkBeans(p.Cnd_sppl_grp_nm4);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd4_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd4);
		p.Cnd_sppl_grp_cd4.setNextBeans(p.Cnd_sppl_grp_nm4);
		p.Cnd_sppl_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_cd4_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm4);
		p.Cnd_sppl_grp_nm4.setNextBeans(p.Cnd_sppl_grp_cd5);
		p.Cnd_sppl_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm4, true);
		p.Cnd_sppl_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd5, true);
		p.Cnd_sppl_grp_cd5.setLinkBeans(p.Cnd_sppl_grp_nm5);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd5_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd5);
		p.Cnd_sppl_grp_cd5.setNextBeans(p.Cnd_sppl_grp_nm5);
		p.Cnd_sppl_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_cd5_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm5);
		p.Cnd_sppl_grp_nm5.setNextBeans(p.Cnd_sppl_grp_cd6);
		p.Cnd_sppl_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm5, true);
		p.Cnd_sppl_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd6, true);
		p.Cnd_sppl_grp_cd6.setLinkBeans(p.Cnd_sppl_grp_nm6);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd6_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd6);
		p.Cnd_sppl_grp_cd6.setNextBeans(p.Cnd_sppl_grp_nm6);
		p.Cnd_sppl_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_cd6_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm6);
		p.Cnd_sppl_grp_nm6.setNextBeans(p.Cnd_sppl_grp_cd7);
		p.Cnd_sppl_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm6, true);
		p.Cnd_sppl_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd7, true);
		p.Cnd_sppl_grp_cd7.setLinkBeans(p.Cnd_sppl_grp_nm7);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd7_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd7);
		p.Cnd_sppl_grp_cd7.setNextBeans(p.Cnd_sppl_grp_nm7);
		p.Cnd_sppl_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_cd7_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm7);
		p.Cnd_sppl_grp_nm7.setNextBeans(p.Cnd_sppl_grp_cd8);
		p.Cnd_sppl_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm7, true);
		p.Cnd_sppl_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd8, true);
		p.Cnd_sppl_grp_cd8.setLinkBeans(p.Cnd_sppl_grp_nm8);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd8_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd8);
		p.Cnd_sppl_grp_cd8.setNextBeans(p.Cnd_sppl_grp_nm8);
		p.Cnd_sppl_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_cd8_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm8);
		p.Cnd_sppl_grp_nm8.setNextBeans(p.Cnd_sppl_grp_cd9);
		p.Cnd_sppl_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm8, true);
		p.Cnd_sppl_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd9, true);
		p.Cnd_sppl_grp_cd9.setLinkBeans(p.Cnd_sppl_grp_nm9);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd9_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd9);
		p.Cnd_sppl_grp_cd9.setNextBeans(p.Cnd_sppl_grp_nm9);
		p.Cnd_sppl_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_cd9_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm9);
		p.Cnd_sppl_grp_nm9.setNextBeans(p.Cnd_sppl_grp_cd10);
		p.Cnd_sppl_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm9, true);
		p.Cnd_sppl_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd10, true);
		p.Cnd_sppl_grp_cd10.setLinkBeans(p.Cnd_sppl_grp_nm10);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd10_Label);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_cd10);
		p.Cnd_sppl_grp_cd10.setNextBeans(p.Cnd_sppl_grp_nm10);
		p.Cnd_sppl_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_cd10_META);
		p.Cnd3Panel.add(p.Cnd_sppl_grp_nm10);
		p.Cnd_sppl_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0660.CndR.sppl_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm10, true);
		p.Cnd_srch_cmn.setIcon("SEARCH");
		p.CndPanel.add(p.Cnd_srch_cmn);
		p.Cnd_srch_cmn.setNextBeans(p.Cnd_srch_wg);
		p.Cnd_srch_wg.setIcon("SEARCH");
		p.CndPanel.add(p.Cnd_srch_wg);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Calc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCalc(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.add(p.CalcPanel);
		p.CalcPanel.setNextBeans(p.RsltPanel);
		p.CalcPanel.setValueCheck(false);
		p.CalcPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CalcPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.CalcPanel.add(p.Calc_percentage_Label);
		p.CalcPanel.add(p.Calc_percentage);
		p.CalcPanel.setLastBeans(p.Calc_percentage);
		p.Calc_percentage.setNextBeans(p.Calc_rnd_typ);
		p.Calc_percentage.setRow(p.getCalcR(), mcframe.clientMGBD.MGBDP0660.CalcR.percentage_META);
		p.CalcPanel.add(p.Calc_percent);
		p.Calc_rnd_typ.setListType(MCListType.STRICT);
		p.Calc_rnd_typ.setLinkBeans(p.Calc_rnd_typ_nm);
		p.CalcPanel.add(p.Calc_rnd_typ_Label);
		p.CalcPanel.add(p.Calc_rnd_typ);
		p.Calc_rnd_typ.setNextBeans(p.Calc_rnd_typ_nm);
		p.Calc_rnd_typ.setRow(p.getCalcR(), mcframe.clientMGBD.MGBDP0660.CalcR.rnd_typ_META);
		p.CalcPanel.add(p.Calc_rnd_typ_nm);
		p.Calc_rnd_typ_nm.setNextBeans(p.Calc_calc);
		p.Calc_rnd_typ_nm.setRow(p.getCalcR(), mcframe.clientMGBD.MGBDP0660.CalcR.rnd_typ_nm_META);
		p.Calc_calc.setFunctionKey(MCFunctionKey.F5);
		p.CalcPanel.add(p.Calc_calc);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MGBDP_ItmProcReg p) {
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
	protected static void jbInitBtn(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
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
		p.Btn_deselect_all.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_upd_cmn);
		p.Btn_upd_cmn.setIcon("REGISTER");
		p.Btn_upd_cmn.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_cmn);
		p.Btn_upd_cmn.setNextBeans(p.Btn_upd_wg);
		p.Btn_upd_wg.setIcon("REGISTER");
		p.Btn_upd_wg.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_wg);
		p.Btn_del_cmn.setIcon("DELETE");
		p.Btn_del_cmn.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del_cmn);
		p.EastBtnPanel.add(p.Btn_del_cmn);
		p.Btn_del_cmn.setNextBeans(p.Btn_del_wg);
		p.Btn_del_wg.setIcon("DELETE");
		p.Btn_del_wg.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_wg);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MGBDP_ItmProcReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
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
		MGBDP_ItmProcReg_MC.mcInitScreenOpe((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.mcInitRegTarget((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.mcInitTop((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.mcInitFold((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.mcInitTab1((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.mcInitTab2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.mcInitTab3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.mcInitCnd((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.mcInitCnd2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.mcInitCnd3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.mcInitCtrl((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.mcInitCalc((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.mcInitRslt((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.mcInitBtn((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.mcInitEastBtn((MGBDP_ItmProcReg)this);

		// [UPD]ステータスのモードの設定
		MGBDP_ItmProcReg_MC.statusInitUPD_ScreenOpe((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitUPD_RegTarget((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitUPD_Top((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitUPD_Fold((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitUPD_Tab1((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitUPD_Tab2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitUPD_Tab3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitUPD_Cnd((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitUPD_Cnd2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitUPD_Cnd3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitUPD_Ctrl((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitUPD_Calc((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitUPD_Rslt((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitUPD_Btn((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitUPD_EastBtn((MGBDP_ItmProcReg)this);

		// [SRCH_ALL]ステータスのモードの設定
		MGBDP_ItmProcReg_MC.statusInitSRCH__ALL_ScreenOpe((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__ALL_RegTarget((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__ALL_Top((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__ALL_Fold((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__ALL_Tab1((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__ALL_Tab2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__ALL_Tab3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__ALL_Cnd((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__ALL_Cnd2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__ALL_Cnd3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__ALL_Ctrl((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__ALL_Calc((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__ALL_Rslt((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__ALL_Btn((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__ALL_EastBtn((MGBDP_ItmProcReg)this);

		// [ALL]ステータスのモードの設定
		MGBDP_ItmProcReg_MC.statusInitALL_ScreenOpe((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitALL_RegTarget((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitALL_Top((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitALL_Fold((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitALL_Tab1((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitALL_Tab2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitALL_Tab3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitALL_Cnd((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitALL_Cnd2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitALL_Cnd3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitALL_Ctrl((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitALL_Calc((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitALL_Rslt((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitALL_Btn((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitALL_EastBtn((MGBDP_ItmProcReg)this);

		// [SRCH_REF]ステータスのモードの設定
		MGBDP_ItmProcReg_MC.statusInitSRCH__REF_ScreenOpe((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__REF_RegTarget((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__REF_Top((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__REF_Fold((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__REF_Tab1((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__REF_Tab2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__REF_Tab3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__REF_Cnd((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__REF_Cnd2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__REF_Cnd3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__REF_Ctrl((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__REF_Calc((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__REF_Rslt((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__REF_Btn((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__REF_EastBtn((MGBDP_ItmProcReg)this);

		// [REF]ステータスのモードの設定
		MGBDP_ItmProcReg_MC.statusInitREF_ScreenOpe((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitREF_RegTarget((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitREF_Top((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitREF_Fold((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitREF_Tab1((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitREF_Tab2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitREF_Tab3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitREF_Cnd((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitREF_Cnd2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitREF_Cnd3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitREF_Ctrl((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitREF_Calc((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitREF_Rslt((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitREF_Btn((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitREF_EastBtn((MGBDP_ItmProcReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MGBDP_ItmProcReg_MC.statusInitSRCH__DEL_ScreenOpe((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__DEL_RegTarget((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__DEL_Top((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__DEL_Fold((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__DEL_Tab1((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__DEL_Tab2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__DEL_Tab3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__DEL_Cnd((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__DEL_Cnd2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__DEL_Cnd3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__DEL_Ctrl((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__DEL_Calc((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__DEL_Rslt((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__DEL_Btn((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitSRCH__DEL_EastBtn((MGBDP_ItmProcReg)this);

		// [DEL]ステータスのモードの設定
		MGBDP_ItmProcReg_MC.statusInitDEL_ScreenOpe((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitDEL_RegTarget((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitDEL_Top((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitDEL_Fold((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitDEL_Tab1((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitDEL_Tab2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitDEL_Tab3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitDEL_Cnd((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitDEL_Cnd2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitDEL_Cnd3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitDEL_Ctrl((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitDEL_Calc((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitDEL_Rslt((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitDEL_Btn((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitDEL_EastBtn((MGBDP_ItmProcReg)this);

		// [FIX_U]ステータスのモードの設定
		MGBDP_ItmProcReg_MC.statusInitFIX__U_ScreenOpe((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitFIX__U_RegTarget((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitFIX__U_Top((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitFIX__U_Fold((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitFIX__U_Tab1((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitFIX__U_Tab2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitFIX__U_Tab3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitFIX__U_Cnd((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitFIX__U_Cnd2((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitFIX__U_Cnd3((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitFIX__U_Ctrl((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitFIX__U_Calc((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitFIX__U_Rslt((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitFIX__U_Btn((MGBDP_ItmProcReg)this);
		MGBDP_ItmProcReg_MC.statusInitFIX__U_EastBtn((MGBDP_ItmProcReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBDP_ItmProcReg p) {
	}

	/**
	 *  [RegTarget]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRegTarget(MGBDP_ItmProcReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBDP_ItmProcReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBDP_ItmProcReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBDP_ItmProcReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBDP_ItmProcReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MGBDP_ItmProcReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_ItmProcReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_ALL.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
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
		p.Cnd_itm_jnl_cd.setListListener(p);
		p.Cnd_itm_jnl_cd.addAllListener(p);
		p.Cnd_itm_jnl_nm.setListListener(p);
		p.Cnd_itm_jnl_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_cur_cd.setListListener(p);
		p.Cnd_cur_cd.addAllListener(p);
		p.Cnd_cur_nm.setListListener(p);
		p.Cnd_cur_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_cntry_cd.setListListener(p);
		p.Cnd_cntry_cd.addAllListener(p);
		p.Cnd_cntry_nm.setListListener(p);
		p.Cnd_cntry_nm.addAllListener(p);
		p.Cnd_area_cd.setListListener(p);
		p.Cnd_area_cd.addAllListener(p);
		p.Cnd_area_nm.setListListener(p);
		p.Cnd_area_nm.addAllListener(p);
		p.Cnd_rmrks.setListListener(p);
		p.Cnd_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_off_non_calc_flg.addAllListener(p);
		p.Cnd_on_non_calc_flg.addAllListener(p);
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
		p.Cnd_sppl_grp_cd1.setListListener(p);
		p.Cnd_sppl_grp_cd1.addAllListener(p);
		p.Cnd_sppl_grp_nm1.setListListener(p);
		p.Cnd_sppl_grp_nm1.addAllListener(p);
		p.Cnd_sppl_grp_cd2.setListListener(p);
		p.Cnd_sppl_grp_cd2.addAllListener(p);
		p.Cnd_sppl_grp_nm2.setListListener(p);
		p.Cnd_sppl_grp_nm2.addAllListener(p);
		p.Cnd_sppl_grp_cd3.setListListener(p);
		p.Cnd_sppl_grp_cd3.addAllListener(p);
		p.Cnd_sppl_grp_nm3.setListListener(p);
		p.Cnd_sppl_grp_nm3.addAllListener(p);
		p.Cnd_sppl_grp_cd4.setListListener(p);
		p.Cnd_sppl_grp_cd4.addAllListener(p);
		p.Cnd_sppl_grp_nm4.setListListener(p);
		p.Cnd_sppl_grp_nm4.addAllListener(p);
		p.Cnd_sppl_grp_cd5.setListListener(p);
		p.Cnd_sppl_grp_cd5.addAllListener(p);
		p.Cnd_sppl_grp_nm5.setListListener(p);
		p.Cnd_sppl_grp_nm5.addAllListener(p);
		p.Cnd_sppl_grp_cd6.setListListener(p);
		p.Cnd_sppl_grp_cd6.addAllListener(p);
		p.Cnd_sppl_grp_nm6.setListListener(p);
		p.Cnd_sppl_grp_nm6.addAllListener(p);
		p.Cnd_sppl_grp_cd7.setListListener(p);
		p.Cnd_sppl_grp_cd7.addAllListener(p);
		p.Cnd_sppl_grp_nm7.setListListener(p);
		p.Cnd_sppl_grp_nm7.addAllListener(p);
		p.Cnd_sppl_grp_cd8.setListListener(p);
		p.Cnd_sppl_grp_cd8.addAllListener(p);
		p.Cnd_sppl_grp_nm8.setListListener(p);
		p.Cnd_sppl_grp_nm8.addAllListener(p);
		p.Cnd_sppl_grp_cd9.setListListener(p);
		p.Cnd_sppl_grp_cd9.addAllListener(p);
		p.Cnd_sppl_grp_nm9.setListListener(p);
		p.Cnd_sppl_grp_nm9.addAllListener(p);
		p.Cnd_sppl_grp_cd10.setListListener(p);
		p.Cnd_sppl_grp_cd10.addAllListener(p);
		p.Cnd_sppl_grp_nm10.setListListener(p);
		p.Cnd_sppl_grp_nm10.addAllListener(p);
		p.Cnd_srch_cmn.addAllListener(p);
		p.Cnd_srch_cmn.setAPMethodName("doCnd_srch_cmn");
		p.Cnd_srch_wg.addAllListener(p);
		p.Cnd_srch_wg.setAPMethodName("doCnd_srch_wg");
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBDP_ItmProcReg p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MGBDP_ItmProcReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBDP_ItmProcReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Calc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCalc(MGBDP_ItmProcReg p) {
		p.Calc_percentage.setListListener(p);
		p.Calc_percentage.addAllListener(p);
		p.Calc_rnd_typ.setListListener(p);
		p.Calc_rnd_typ.addAllListener(p);
		p.Calc_rnd_typ_nm.setListListener(p);
		p.Calc_rnd_typ_nm.addAllListener(p);
		p.Calc_calc.addAllListener(p);
		p.Calc_calc.setAPMethodName("doCalc_calc");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBDP_ItmProcReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_calc_ctg_cd.addAllListener(p);
		p.columnRslt_calc_ctg_cd.setListListener(p);
		p.columnRslt_calc_ctg_nm.addAllListener(p);
		p.columnRslt_calc_ctg_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
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
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_unit_cd.addAllListener(p);
		p.columnRslt_unit_cd.setListListener(p);
		p.columnRslt_unit_nm.addAllListener(p);
		p.columnRslt_unit_nm.setListListener(p);
		p.columnRslt_dec_place.addAllListener(p);
		p.columnRslt_dec_place.setListListener(p);
		p.columnRslt_cur_cd.addAllListener(p);
		p.columnRslt_cur_cd.setListListener(p);
		p.columnRslt_cur_nm.addAllListener(p);
		p.columnRslt_cur_nm.setListListener(p);
		p.columnRslt_upri_dec_place.addAllListener(p);
		p.columnRslt_upri_dec_place.setListListener(p);
		p.columnRslt_outsrc_upri_typ.addAllListener(p);
		p.columnRslt_outsrc_upri_typ.setListListener(p);
		p.columnRslt_outsrc_upri_typ_nm.addAllListener(p);
		p.columnRslt_outsrc_upri_typ_nm.setListListener(p);
		p.columnRslt_cost_ratio.addAllListener(p);
		p.columnRslt_cost_ratio.setListListener(p);
		p.columnRslt_rmrks.addAllListener(p);
		p.columnRslt_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_non_calc_flg.addAllListener(p);
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
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBDP_ItmProcReg p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_upd_cmn.addAllListener(p);
		p.Btn_upd_cmn.setAPMethodName("doBtn_upd_cmn");
		p.Btn_upd_wg.addAllListener(p);
		p.Btn_upd_wg.setAPMethodName("doBtn_upd_wg");
		p.Btn_del_cmn.addAllListener(p);
		p.Btn_del_cmn.setAPMethodName("doBtn_del_cmn");
		p.Btn_del_wg.addAllListener(p);
		p.Btn_del_wg.setAPMethodName("doBtn_del_wg");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBDP_ItmProcReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MGBDP_ItmProcReg p){

	}

	/**
	 * [UPD]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RegTarget(MGBDP_ItmProcReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MGBDP_ItmProcReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MGBDP_ItmProcReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MGBDP_ItmProcReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MGBDP_ItmProcReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MGBDP_ItmProcReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBDP_ItmProcReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_non_calc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_on_non_calc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_srch_cmn.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MGBDP_ItmProcReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd3(MGBDP_ItmProcReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MGBDP_ItmProcReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Calc]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Calc(MGBDP_ItmProcReg p){
		p.Calc_percentage.putMode(p, UPD, MCMode.READ_ONLY);
		p.Calc_percent.putMode(p, UPD, MCMode.READ_ONLY);
		p.Calc_rnd_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Calc_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Calc_calc.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MGBDP_ItmProcReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_calc_ctg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.REQUIRED);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnRslt_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_base_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_outsrc_upri_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_outsrc_upri_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.REQUIRED);
		p.Rslt_calc_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_cost_ratio.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_non_calc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MGBDP_ItmProcReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_cmn.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_wg.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del_cmn.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_ALL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_ScreenOpe(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_ALL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_RegTarget(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_ALL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Top(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_ALL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Fold(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_ALL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Tab1(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_ALL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Tab2(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_ALL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Tab3(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_ALL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Cnd(MGBDP_ItmProcReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_ALL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, SRCH_ALL, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, SRCH_ALL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sppl_cd.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_off_non_calc_flg.putMode(p, SRCH_ALL, MCMode.REQUIRED);
		p.Cnd_on_non_calc_flg.putMode(p, SRCH_ALL, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, SRCH_ALL, MCMode.ENABLE);
		p.Cnd_srch_cmn.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, SRCH_ALL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_ALL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Cnd2(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_ALL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Cnd3(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_ALL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Ctrl(MGBDP_ItmProcReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_ALL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_ALL]ステータスの[Calc]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Calc(MGBDP_ItmProcReg p){
		p.Calc_percentage.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.Calc_percent.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.Calc_rnd_typ.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.Calc_rnd_typ_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.Calc_calc.putMode(p, SRCH_ALL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ALL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Rslt(MGBDP_ItmProcReg p){
		p.columnRslt_check.putMode(p, SRCH_ALL, MCMode.REQUIRED);
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.Rslt_base_qty_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.columnRslt_cur_cd.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_upri_dec_place.putMode(p, SRCH_ALL, MCMode.INVISIBLE);
		p.columnRslt_outsrc_upri_typ.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_outsrc_upri_typ_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.Rslt_upri_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_calc_upri_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_cost_ratio.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_ALL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_ALL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_ALL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_ALL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_Btn(MGBDP_ItmProcReg p){
		p.Btn_select_all.putMode(p, SRCH_ALL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_ALL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_ALL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_ALL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_ALL, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, SRCH_ALL, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, SRCH_ALL, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, SRCH_ALL, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, SRCH_ALL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_ALL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ALL_EastBtn(MGBDP_ItmProcReg p){

	}

	/**
	 * [ALL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitALL_ScreenOpe(MGBDP_ItmProcReg p){

	}

	/**
	 * [ALL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitALL_RegTarget(MGBDP_ItmProcReg p){

	}

	/**
	 * [ALL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitALL_Top(MGBDP_ItmProcReg p){

	}

	/**
	 * [ALL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitALL_Fold(MGBDP_ItmProcReg p){

	}

	/**
	 * [ALL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitALL_Tab1(MGBDP_ItmProcReg p){

	}

	/**
	 * [ALL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitALL_Tab2(MGBDP_ItmProcReg p){

	}

	/**
	 * [ALL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitALL_Tab3(MGBDP_ItmProcReg p){

	}

	/**
	 * [ALL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitALL_Cnd(MGBDP_ItmProcReg p){
		p.Cnd_ope_Group.putMode(p, ALL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, ALL, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, ALL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(ALL, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(ALL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(ALL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sppl_cd.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_off_non_calc_flg.putMode(p, ALL, MCMode.REQUIRED);
		p.Cnd_on_non_calc_flg.putMode(p, ALL, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, ALL, MCMode.ENABLE);
		p.Cnd_srch_cmn.putMode(p, ALL, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, ALL, MCMode.INVISIBLE);

	}

	/**
	 * [ALL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitALL_Cnd2(MGBDP_ItmProcReg p){

	}

	/**
	 * [ALL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitALL_Cnd3(MGBDP_ItmProcReg p){

	}

	/**
	 * [ALL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitALL_Ctrl(MGBDP_ItmProcReg p){
		p.Ctrl_ctrl_PPanel.putStatus(ALL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [ALL]ステータスの[Calc]ブロックのモードの設定
	 */
	protected static void statusInitALL_Calc(MGBDP_ItmProcReg p){
		p.Calc_percentage.putMode(p, ALL, MCMode.REQUIRED);
		p.Calc_percent.putMode(p, ALL, MCMode.READ_ONLY);
		p.Calc_rnd_typ.putMode(p, ALL, MCMode.REQUIRED);
		p.Calc_rnd_typ_nm.putMode(p, ALL, MCMode.READ_ONLY);
		p.Calc_calc.putMode(p, ALL, MCMode.ENABLE);

	}

	/**
	 * [ALL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitALL_Rslt(MGBDP_ItmProcReg p){
		p.columnRslt_check.putMode(p, ALL, MCMode.REQUIRED);
		p.columnRslt_calc_ctg_cd.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, ALL, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(ALL, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(ALL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, ALL, MCMode.READ_ONLY);
		p.Rslt_base_qty_p_PPanel.putStatus(ALL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, ALL, MCMode.INVISIBLE);
		p.columnRslt_cur_cd.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_upri_dec_place.putMode(p, ALL, MCMode.INVISIBLE);
		p.columnRslt_outsrc_upri_typ.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_outsrc_upri_typ_nm.putMode(p, ALL, MCMode.READ_ONLY);
		p.Rslt_upri_p_PPanel.putStatus(ALL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_calc_upri_p_PPanel.putStatus(ALL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.REQUIRED);
		p.columnRslt_cost_ratio.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, ALL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(ALL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, ALL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, ALL, MCMode.INVISIBLE);

	}

	/**
	 * [ALL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitALL_Btn(MGBDP_ItmProcReg p){
		p.Btn_select_all.putMode(p, ALL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, ALL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, ALL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, ALL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, ALL, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, ALL, MCMode.ENABLE);
		p.Btn_upd_wg.putMode(p, ALL, MCMode.ENABLE);
		p.Btn_del_cmn.putMode(p, ALL, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, ALL, MCMode.DISABLE);

	}

	/**
	 * [ALL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitALL_EastBtn(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_RegTarget(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab1(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab2(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab3(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MGBDP_ItmProcReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sppl_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_off_non_calc_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_on_non_calc_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_srch_cmn.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd2(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd3(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MGBDP_ItmProcReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Calc]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Calc(MGBDP_ItmProcReg p){
		p.Calc_percentage.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Calc_percent.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Calc_rnd_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Calc_rnd_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Calc_calc.putMode(p, SRCH_REF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MGBDP_ItmProcReg p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_base_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_cur_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upri_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_outsrc_upri_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_outsrc_upri_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_calc_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_cost_ratio.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MGBDP_ItmProcReg p){
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, SRCH_REF, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MGBDP_ItmProcReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBDP_ItmProcReg p){

	}

	/**
	 * [REF]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitREF_RegTarget(MGBDP_ItmProcReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBDP_ItmProcReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBDP_ItmProcReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBDP_ItmProcReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBDP_ItmProcReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MGBDP_ItmProcReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBDP_ItmProcReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_non_calc_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_on_non_calc_flg.putMode(p, REF, MCMode.REQUIRED);
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
		p.Cnd_sppl_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_srch_cmn.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBDP_ItmProcReg p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MGBDP_ItmProcReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBDP_ItmProcReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[Calc]ブロックのモードの設定
	 */
	protected static void statusInitREF_Calc(MGBDP_ItmProcReg p){
		p.Calc_percentage.putMode(p, REF, MCMode.READ_ONLY);
		p.Calc_percent.putMode(p, REF, MCMode.READ_ONLY);
		p.Calc_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Calc_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Calc_calc.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBDP_ItmProcReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_outsrc_upri_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_outsrc_upri_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_calc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_cost_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBDP_ItmProcReg p){
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RegTarget(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab3(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MGBDP_ItmProcReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sppl_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_off_non_calc_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_on_non_calc_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_srch_cmn.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd2(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd3(MGBDP_ItmProcReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MGBDP_ItmProcReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Calc]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Calc(MGBDP_ItmProcReg p){
		p.Calc_percentage.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Calc_percent.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Calc_rnd_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Calc_rnd_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Calc_calc.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MGBDP_ItmProcReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_base_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upri_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_outsrc_upri_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_outsrc_upri_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_calc_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_cost_ratio.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MGBDP_ItmProcReg p){
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MGBDP_ItmProcReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MGBDP_ItmProcReg p){

	}

	/**
	 * [DEL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RegTarget(MGBDP_ItmProcReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MGBDP_ItmProcReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MGBDP_ItmProcReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MGBDP_ItmProcReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MGBDP_ItmProcReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MGBDP_ItmProcReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MGBDP_ItmProcReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sppl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_non_calc_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_on_non_calc_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_srch_cmn.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MGBDP_ItmProcReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd3(MGBDP_ItmProcReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MGBDP_ItmProcReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Calc]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Calc(MGBDP_ItmProcReg p){
		p.Calc_percentage.putMode(p, DEL, MCMode.READ_ONLY);
		p.Calc_percent.putMode(p, DEL, MCMode.READ_ONLY);
		p.Calc_rnd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Calc_rnd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Calc_calc.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MGBDP_ItmProcReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_calc_ctg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_base_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_outsrc_upri_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_outsrc_upri_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_calc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_cost_ratio.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MGBDP_ItmProcReg p){
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_del_wg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MGBDP_ItmProcReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MGBDP_ItmProcReg p){

	}

	/**
	 * [FIX_U]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RegTarget(MGBDP_ItmProcReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MGBDP_ItmProcReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MGBDP_ItmProcReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MGBDP_ItmProcReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MGBDP_ItmProcReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab3(MGBDP_ItmProcReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MGBDP_ItmProcReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_jnl_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cur_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_off_non_calc_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_on_non_calc_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_srch_cmn.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MGBDP_ItmProcReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd3(MGBDP_ItmProcReg p){

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MGBDP_ItmProcReg p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_U, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Calc]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Calc(MGBDP_ItmProcReg p){
		p.Calc_percentage.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Calc_percent.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Calc_rnd_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Calc_rnd_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Calc_calc.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MGBDP_ItmProcReg p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_jnl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_base_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_outsrc_upri_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_outsrc_upri_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_calc_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_cost_ratio.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MGBDP_ItmProcReg p){
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MGBDP_ItmProcReg p){

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
		MGBDP_ItmProcReg_MC.setTableConfigRslt((MGBDP_ItmProcReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBDP_ItmProcReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_calc_ctg_cd.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.calc_ctg_cd_META);
		p.columnRslt_calc_ctg_cd.addLinkBeans(p.columnRslt_calc_ctg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_ctg_cd);
		p.columnRslt_calc_ctg_nm.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.calc_ctg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_ctg_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.wg_cd_META);
		p.columnRslt_wg_cd.addLinkBeans(p.columnRslt_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.RsltTable.addTable(p.Rslt_term_p_PPanel.TermTable);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRslt_itm_jnl_cd, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm, p.columnRslt_itm_nm, p.columnRslt_itm_sub1, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_base_qty);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRslt_itm_jnl_cd, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm, p.columnRslt_itm_nm, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_base_qty);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRslt_itm_jnl_cd, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm, p.columnRslt_itm_nm, p.columnRslt_itm_sub3, p.columnRslt_base_qty);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRslt_itm_jnl_cd, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm, p.columnRslt_itm_nm, p.columnRslt_base_qty);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.columnRslt_itm_jnl_cd.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.itm_jnl_cd_META);
		p.columnRslt_itm_jnl_cd.addLinkBeans(p.columnRslt_itm_jnl_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_cd);
		p.columnRslt_itm_jnl_nm.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.itm_jnl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_jnl_nm);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.sppl_cd_META);
		p.columnRslt_sppl_cd.setListType(MCListType.STRICT);
		p.columnRslt_sppl_cd.addLinkBeans(p.columnRslt_sppl_nm,p.columnRslt_cur_cd,p.columnRslt_outsrc_upri_typ);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.RsltTable.addTable(p.Rslt_base_qty_p_PPanel.QtyTable);
		p.columnRslt_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_cd);
		p.columnRslt_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_nm);
		p.columnRslt_dec_place.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.columnRslt_cur_cd.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.cur_cd_META);
		p.columnRslt_cur_cd.addLinkBeans(p.columnRslt_cur_nm,p.columnRslt_upri_dec_place);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_cd);
		p.columnRslt_cur_nm.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_nm);
		p.columnRslt_upri_dec_place.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri_dec_place);
		p.columnRslt_outsrc_upri_typ.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.outsrc_upri_typ_META);
		p.columnRslt_outsrc_upri_typ.addLinkBeans(p.columnRslt_outsrc_upri_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_outsrc_upri_typ);
		p.columnRslt_outsrc_upri_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.outsrc_upri_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_outsrc_upri_typ_nm);
		p.RsltTable.addTable(p.Rslt_upri_p_PPanel.UpriTable);
		p.Rslt_upri_p_PPanel.columnUpri_upri.setMinusEnable(true);
		p.RsltTable.addTable(p.Rslt_calc_upri_p_PPanel.UpriTable);
		p.Rslt_calc_upri_p_PPanel.columnUpri_upri.setMinusEnable(true);
		p.columnRslt_cost_ratio.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.cost_ratio_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cost_ratio);
		p.columnRslt_rmrks.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_non_calc_flg.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.non_calc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_non_calc_flg);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMGBD.MGBDP0660.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_ctg_cd.getListConfig().setPutter(getCnd_calc_ctg_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_jnl_cd.getListConfig().setPutter(getCnd_itm_jnl_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cur_cd.getListConfig().setPutter(getCnd_cur_cd_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cntry_cd.getListConfig().setPutter(getCnd_cntry_cd_ListPutter());
		Cnd_area_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_area_cd.getListConfig().setPutter(getCnd_area_cd_ListPutter());
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
		Cnd_sppl_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd1.getListConfig().setPutter(getCnd_sppl_grp_cd1_ListPutter());
		Cnd_sppl_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd2.getListConfig().setPutter(getCnd_sppl_grp_cd2_ListPutter());
		Cnd_sppl_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd3.getListConfig().setPutter(getCnd_sppl_grp_cd3_ListPutter());
		Cnd_sppl_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd4.getListConfig().setPutter(getCnd_sppl_grp_cd4_ListPutter());
		Cnd_sppl_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd5.getListConfig().setPutter(getCnd_sppl_grp_cd5_ListPutter());
		Cnd_sppl_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd6.getListConfig().setPutter(getCnd_sppl_grp_cd6_ListPutter());
		Cnd_sppl_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd7.getListConfig().setPutter(getCnd_sppl_grp_cd7_ListPutter());
		Cnd_sppl_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd8.getListConfig().setPutter(getCnd_sppl_grp_cd8_ListPutter());
		Cnd_sppl_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd9.getListConfig().setPutter(getCnd_sppl_grp_cd9_ListPutter());
		Cnd_sppl_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd10.getListConfig().setPutter(getCnd_sppl_grp_cd10_ListPutter());
		Calc_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Calc_rnd_typ.getListConfig().setPutter(getCalc_rnd_typ_ListPutter());
		columnRslt_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_calc_ctg_cd.getListConfig().setPutter(getRslt_calc_ctg_cd_ListPutter());
		columnRslt_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_wg_cd.getListConfig().setPutter(getRslt_wg_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnRslt_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_itm_jnl_cd.getListConfig().setPutter(getRslt_itm_jnl_cd_ListPutter());
		columnRslt_sppl_cd.getListConfig().setPutter(getRslt_sppl_cd_ListPutter());
		columnRslt_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_cur_cd.getListConfig().setPutter(getRslt_cur_cd_ListPutter());
		columnRslt_outsrc_upri_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_outsrc_upri_typ.getListConfig().setPutter(getRslt_outsrc_upri_typ_ListPutter());
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
	 * この画面を[SRCH_ALL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ALLStatus() {
		status = SRCH_ALL;
		setAllStatus(status);
	}

	/**
	 * この画面を[ALL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setALLStatus() {
		status = ALL;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REFStatus() {
		status = SRCH_REF;
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
	 * この画面を[SRCH_DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DELStatus() {
		status = SRCH_DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
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
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (SRCH_ALL.equals(status)) {
			setSRCH_ALLStatus();
		}
		else if (ALL.equals(status)) {
			setALLStatus();
		}
		else if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
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
	 * [Cnd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_cntry_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cntry_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
		return lp;
	}
	 
	/**
	 * [Cnd_area_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_area_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Area");
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
	 * [Cnd_sppl_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
		return lp;
	}
	 
	/**
	 * [Calc_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createCalc_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Rslt_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Rslt_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
		return lp;
	}
	 
	/**
	 * [Rslt_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rslt_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Rslt_outsrc_upri_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_outsrc_upri_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.OutsrcUpriTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_ctg_cd) return getCnd_calc_ctg_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_itm_jnl_cd) return getCnd_itm_jnl_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_cur_cd) return getCnd_cur_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_cntry_cd) return getCnd_cntry_cd(row, info);
		if(combo == Cnd_area_cd) return getCnd_area_cd(row, info);
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
		if(combo == Cnd_sppl_grp_cd1) return getCnd_sppl_grp_cd1(row, info);
		if(combo == Cnd_sppl_grp_cd2) return getCnd_sppl_grp_cd2(row, info);
		if(combo == Cnd_sppl_grp_cd3) return getCnd_sppl_grp_cd3(row, info);
		if(combo == Cnd_sppl_grp_cd4) return getCnd_sppl_grp_cd4(row, info);
		if(combo == Cnd_sppl_grp_cd5) return getCnd_sppl_grp_cd5(row, info);
		if(combo == Cnd_sppl_grp_cd6) return getCnd_sppl_grp_cd6(row, info);
		if(combo == Cnd_sppl_grp_cd7) return getCnd_sppl_grp_cd7(row, info);
		if(combo == Cnd_sppl_grp_cd8) return getCnd_sppl_grp_cd8(row, info);
		if(combo == Cnd_sppl_grp_cd9) return getCnd_sppl_grp_cd9(row, info);
		if(combo == Cnd_sppl_grp_cd10) return getCnd_sppl_grp_cd10(row, info);
		if(combo == Calc_rnd_typ) return getCalc_rnd_typ(row, info);
		if(combo == columnRslt_calc_ctg_cd) return getRslt_calc_ctg_cd(row, info);
		if(combo == columnRslt_wg_cd) return getRslt_wg_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_cd) return getRslt_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub1) return getRslt_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub2) return getRslt_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub3) return getRslt_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnRslt_itm_jnl_cd) return getRslt_itm_jnl_cd(row, info);
		if(combo == columnRslt_sppl_cd) return getRslt_sppl_cd(row, info);
		if(combo == columnRslt_cur_cd) return getRslt_cur_cd(row, info);
		if(combo == columnRslt_outsrc_upri_typ) return getRslt_outsrc_upri_typ(row, info);
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
		else if (ap == Calc_calc) doCalc_calc(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd_cmn) doBtn_upd_cmn(info);
		else if (ap == Btn_upd_wg) doBtn_upd_wg(info);
		else if (ap == Btn_del_cmn) doBtn_del_cmn(info);
		else if (ap == Btn_del_wg) doBtn_del_wg(info);
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
	 * [Calc]パネルの[calc]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCalc_calc(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_cmn(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_wg(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_cmn(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_wg(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_cmn_flg) return doCnd_cmn_flg_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_itm_jnl_cd) return doCnd_itm_jnl_cd_VC(info);
		if (vc == Cnd_itm_jnl_nm) return doCnd_itm_jnl_nm_VC(info);
		if (vc == Cnd_cur_cd) return doCnd_cur_cd_VC(info);
		if (vc == Cnd_cur_nm) return doCnd_cur_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_cntry_cd) return doCnd_cntry_cd_VC(info);
		if (vc == Cnd_cntry_nm) return doCnd_cntry_nm_VC(info);
		if (vc == Cnd_area_cd) return doCnd_area_cd_VC(info);
		if (vc == Cnd_area_nm) return doCnd_area_nm_VC(info);
		if (vc == Cnd_rmrks) return doCnd_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_off_non_calc_flg) return doCnd_off_non_calc_flg_VC(info);
		if (vc == Cnd_on_non_calc_flg) return doCnd_on_non_calc_flg_VC(info);
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
		if (vc == Cnd_sppl_grp_cd1) return doCnd_sppl_grp_cd1_VC(info);
		if (vc == Cnd_sppl_grp_nm1) return doCnd_sppl_grp_nm1_VC(info);
		if (vc == Cnd_sppl_grp_cd2) return doCnd_sppl_grp_cd2_VC(info);
		if (vc == Cnd_sppl_grp_nm2) return doCnd_sppl_grp_nm2_VC(info);
		if (vc == Cnd_sppl_grp_cd3) return doCnd_sppl_grp_cd3_VC(info);
		if (vc == Cnd_sppl_grp_nm3) return doCnd_sppl_grp_nm3_VC(info);
		if (vc == Cnd_sppl_grp_cd4) return doCnd_sppl_grp_cd4_VC(info);
		if (vc == Cnd_sppl_grp_nm4) return doCnd_sppl_grp_nm4_VC(info);
		if (vc == Cnd_sppl_grp_cd5) return doCnd_sppl_grp_cd5_VC(info);
		if (vc == Cnd_sppl_grp_nm5) return doCnd_sppl_grp_nm5_VC(info);
		if (vc == Cnd_sppl_grp_cd6) return doCnd_sppl_grp_cd6_VC(info);
		if (vc == Cnd_sppl_grp_nm6) return doCnd_sppl_grp_nm6_VC(info);
		if (vc == Cnd_sppl_grp_cd7) return doCnd_sppl_grp_cd7_VC(info);
		if (vc == Cnd_sppl_grp_nm7) return doCnd_sppl_grp_nm7_VC(info);
		if (vc == Cnd_sppl_grp_cd8) return doCnd_sppl_grp_cd8_VC(info);
		if (vc == Cnd_sppl_grp_nm8) return doCnd_sppl_grp_nm8_VC(info);
		if (vc == Cnd_sppl_grp_cd9) return doCnd_sppl_grp_cd9_VC(info);
		if (vc == Cnd_sppl_grp_nm9) return doCnd_sppl_grp_nm9_VC(info);
		if (vc == Cnd_sppl_grp_cd10) return doCnd_sppl_grp_cd10_VC(info);
		if (vc == Cnd_sppl_grp_nm10) return doCnd_sppl_grp_nm10_VC(info);
		if (vc == Calc_percentage) return doCalc_percentage_VC(info);
		if (vc == Calc_rnd_typ) return doCalc_rnd_typ_VC(info);
		if (vc == Calc_rnd_typ_nm) return doCalc_rnd_typ_nm_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_calc_ctg_cd) return doRslt_calc_ctg_cd_VC(info);
		if (vc == columnRslt_calc_ctg_nm) return doRslt_calc_ctg_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_itm_jnl_cd) return doRslt_itm_jnl_cd_VC(info);
		if (vc == columnRslt_itm_jnl_nm) return doRslt_itm_jnl_nm_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_unit_cd) return doRslt_unit_cd_VC(info);
		if (vc == columnRslt_unit_nm) return doRslt_unit_nm_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_cur_cd) return doRslt_cur_cd_VC(info);
		if (vc == columnRslt_cur_nm) return doRslt_cur_nm_VC(info);
		if (vc == columnRslt_upri_dec_place) return doRslt_upri_dec_place_VC(info);
		if (vc == columnRslt_outsrc_upri_typ) return doRslt_outsrc_upri_typ_VC(info);
		if (vc == columnRslt_outsrc_upri_typ_nm) return doRslt_outsrc_upri_typ_nm_VC(info);
		if (vc == columnRslt_cost_ratio) return doRslt_cost_ratio_VC(info);
		if (vc == columnRslt_rmrks) return doRslt_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_non_calc_flg) return doRslt_non_calc_flg_VC(info);
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
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
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
	 * [Cnd]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_non_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_non_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_non_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_non_calc_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Calc]パネルの[percentage]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCalc_percentage_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Calc]パネルの[rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCalc_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Calc]パネルの[rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCalc_rnd_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_ctg_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[outsrc_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_outsrc_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[outsrc_upri_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_outsrc_upri_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cost_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cost_ratio_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
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
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_cmn_flg) doCnd_cmn_flg_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NC(info);
		else if (nc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NC(info);
		else if (nc == Cnd_cur_cd) doCnd_cur_cd_NC(info);
		else if (nc == Cnd_cur_nm) doCnd_cur_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_cntry_cd) doCnd_cntry_cd_NC(info);
		else if (nc == Cnd_cntry_nm) doCnd_cntry_nm_NC(info);
		else if (nc == Cnd_area_cd) doCnd_area_cd_NC(info);
		else if (nc == Cnd_area_nm) doCnd_area_nm_NC(info);
		else if (nc == Cnd_rmrks) doCnd_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_off_non_calc_flg) doCnd_off_non_calc_flg_NC(info);
		else if (nc == Cnd_on_non_calc_flg) doCnd_on_non_calc_flg_NC(info);
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
		else if (nc == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_NC(info);
		else if (nc == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_NC(info);
		else if (nc == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_NC(info);
		else if (nc == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_NC(info);
		else if (nc == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_NC(info);
		else if (nc == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_NC(info);
		else if (nc == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_NC(info);
		else if (nc == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_NC(info);
		else if (nc == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_NC(info);
		else if (nc == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_NC(info);
		else if (nc == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_NC(info);
		else if (nc == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_NC(info);
		else if (nc == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_NC(info);
		else if (nc == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_NC(info);
		else if (nc == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_NC(info);
		else if (nc == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_NC(info);
		else if (nc == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_NC(info);
		else if (nc == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_NC(info);
		else if (nc == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_NC(info);
		else if (nc == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_NC(info);
		else if (nc == Calc_percentage) doCalc_percentage_NC(info);
		else if (nc == Calc_rnd_typ) doCalc_rnd_typ_NC(info);
		else if (nc == Calc_rnd_typ_nm) doCalc_rnd_typ_nm_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NC(info);
		else if (nc == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NC(info);
		else if (nc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_unit_cd) doRslt_unit_cd_NC(info);
		else if (nc == columnRslt_unit_nm) doRslt_unit_nm_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_cur_cd) doRslt_cur_cd_NC(info);
		else if (nc == columnRslt_cur_nm) doRslt_cur_nm_NC(info);
		else if (nc == columnRslt_upri_dec_place) doRslt_upri_dec_place_NC(info);
		else if (nc == columnRslt_outsrc_upri_typ) doRslt_outsrc_upri_typ_NC(info);
		else if (nc == columnRslt_outsrc_upri_typ_nm) doRslt_outsrc_upri_typ_nm_NC(info);
		else if (nc == columnRslt_cost_ratio) doRslt_cost_ratio_NC(info);
		else if (nc == columnRslt_rmrks) doRslt_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_non_calc_flg) doRslt_non_calc_flg_NC(info);
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
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
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
	 * [Cnd]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_non_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_non_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_non_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_non_calc_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Calc]パネルの[percentage]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalc_percentage_NC(MCEventInfo info){
	}

	/**
	 * [Calc]パネルの[rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalc_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Calc]パネルの[rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalc_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[outsrc_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[outsrc_upri_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_upri_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_ratio_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_cmn_flg) doCnd_cmn_flg_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NE(info);
		else if (ne == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NE(info);
		else if (ne == Cnd_cur_cd) doCnd_cur_cd_NE(info);
		else if (ne == Cnd_cur_nm) doCnd_cur_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_cntry_cd) doCnd_cntry_cd_NE(info);
		else if (ne == Cnd_cntry_nm) doCnd_cntry_nm_NE(info);
		else if (ne == Cnd_area_cd) doCnd_area_cd_NE(info);
		else if (ne == Cnd_area_nm) doCnd_area_nm_NE(info);
		else if (ne == Cnd_rmrks) doCnd_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_off_non_calc_flg) doCnd_off_non_calc_flg_NE(info);
		else if (ne == Cnd_on_non_calc_flg) doCnd_on_non_calc_flg_NE(info);
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
		else if (ne == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_NE(info);
		else if (ne == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_NE(info);
		else if (ne == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_NE(info);
		else if (ne == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_NE(info);
		else if (ne == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_NE(info);
		else if (ne == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_NE(info);
		else if (ne == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_NE(info);
		else if (ne == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_NE(info);
		else if (ne == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_NE(info);
		else if (ne == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_NE(info);
		else if (ne == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_NE(info);
		else if (ne == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_NE(info);
		else if (ne == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_NE(info);
		else if (ne == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_NE(info);
		else if (ne == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_NE(info);
		else if (ne == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_NE(info);
		else if (ne == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_NE(info);
		else if (ne == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_NE(info);
		else if (ne == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_NE(info);
		else if (ne == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_NE(info);
		else if (ne == Calc_percentage) doCalc_percentage_NE(info);
		else if (ne == Calc_rnd_typ) doCalc_rnd_typ_NE(info);
		else if (ne == Calc_rnd_typ_nm) doCalc_rnd_typ_nm_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NE(info);
		else if (ne == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NE(info);
		else if (ne == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_unit_cd) doRslt_unit_cd_NE(info);
		else if (ne == columnRslt_unit_nm) doRslt_unit_nm_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_cur_cd) doRslt_cur_cd_NE(info);
		else if (ne == columnRslt_cur_nm) doRslt_cur_nm_NE(info);
		else if (ne == columnRslt_upri_dec_place) doRslt_upri_dec_place_NE(info);
		else if (ne == columnRslt_outsrc_upri_typ) doRslt_outsrc_upri_typ_NE(info);
		else if (ne == columnRslt_outsrc_upri_typ_nm) doRslt_outsrc_upri_typ_nm_NE(info);
		else if (ne == columnRslt_cost_ratio) doRslt_cost_ratio_NE(info);
		else if (ne == columnRslt_rmrks) doRslt_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_non_calc_flg) doRslt_non_calc_flg_NE(info);
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
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
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
	 * [Cnd]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_non_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_non_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_non_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_non_calc_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Calc]パネルの[percentage]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalc_percentage_NE(MCEventInfo info){
	}

	/**
	 * [Calc]パネルの[rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalc_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Calc]パネルの[rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalc_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[outsrc_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[outsrc_upri_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_upri_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_ratio_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_cmn_flg) doCnd_cmn_flg_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NX(info);
		else if (nx == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NX(info);
		else if (nx == Cnd_cur_cd) doCnd_cur_cd_NX(info);
		else if (nx == Cnd_cur_nm) doCnd_cur_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_cntry_cd) doCnd_cntry_cd_NX(info);
		else if (nx == Cnd_cntry_nm) doCnd_cntry_nm_NX(info);
		else if (nx == Cnd_area_cd) doCnd_area_cd_NX(info);
		else if (nx == Cnd_area_nm) doCnd_area_nm_NX(info);
		else if (nx == Cnd_rmrks) doCnd_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_off_non_calc_flg) doCnd_off_non_calc_flg_NX(info);
		else if (nx == Cnd_on_non_calc_flg) doCnd_on_non_calc_flg_NX(info);
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
		else if (nx == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_NX(info);
		else if (nx == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_NX(info);
		else if (nx == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_NX(info);
		else if (nx == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_NX(info);
		else if (nx == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_NX(info);
		else if (nx == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_NX(info);
		else if (nx == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_NX(info);
		else if (nx == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_NX(info);
		else if (nx == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_NX(info);
		else if (nx == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_NX(info);
		else if (nx == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_NX(info);
		else if (nx == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_NX(info);
		else if (nx == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_NX(info);
		else if (nx == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_NX(info);
		else if (nx == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_NX(info);
		else if (nx == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_NX(info);
		else if (nx == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_NX(info);
		else if (nx == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_NX(info);
		else if (nx == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_NX(info);
		else if (nx == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_NX(info);
		else if (nx == Calc_percentage) doCalc_percentage_NX(info);
		else if (nx == Calc_rnd_typ) doCalc_rnd_typ_NX(info);
		else if (nx == Calc_rnd_typ_nm) doCalc_rnd_typ_nm_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NX(info);
		else if (nx == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_NX(info);
		else if (nx == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_unit_cd) doRslt_unit_cd_NX(info);
		else if (nx == columnRslt_unit_nm) doRslt_unit_nm_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_cur_cd) doRslt_cur_cd_NX(info);
		else if (nx == columnRslt_cur_nm) doRslt_cur_nm_NX(info);
		else if (nx == columnRslt_upri_dec_place) doRslt_upri_dec_place_NX(info);
		else if (nx == columnRslt_outsrc_upri_typ) doRslt_outsrc_upri_typ_NX(info);
		else if (nx == columnRslt_outsrc_upri_typ_nm) doRslt_outsrc_upri_typ_nm_NX(info);
		else if (nx == columnRslt_cost_ratio) doRslt_cost_ratio_NX(info);
		else if (nx == columnRslt_rmrks) doRslt_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_non_calc_flg) doRslt_non_calc_flg_NX(info);
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
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
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
	 * [Cnd]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_non_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_non_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_non_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_non_calc_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Calc]パネルの[percentage]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalc_percentage_NX(MCEventInfo info){
	}

	/**
	 * [Calc]パネルの[rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalc_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Calc]パネルの[rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalc_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[outsrc_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[outsrc_upri_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_upri_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_ratio_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
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
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_LC(info);
		else if (lc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_LC(info);
		else if (lc == Cnd_cur_cd) doCnd_cur_cd_LC(info);
		else if (lc == Cnd_cur_nm) doCnd_cur_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_cntry_cd) doCnd_cntry_cd_LC(info);
		else if (lc == Cnd_cntry_nm) doCnd_cntry_nm_LC(info);
		else if (lc == Cnd_area_cd) doCnd_area_cd_LC(info);
		else if (lc == Cnd_area_nm) doCnd_area_nm_LC(info);
		else if (lc == Cnd_rmrks) doCnd_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
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
		else if (lc == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_LC(info);
		else if (lc == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_LC(info);
		else if (lc == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_LC(info);
		else if (lc == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_LC(info);
		else if (lc == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_LC(info);
		else if (lc == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_LC(info);
		else if (lc == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_LC(info);
		else if (lc == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_LC(info);
		else if (lc == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_LC(info);
		else if (lc == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_LC(info);
		else if (lc == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_LC(info);
		else if (lc == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_LC(info);
		else if (lc == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_LC(info);
		else if (lc == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_LC(info);
		else if (lc == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_LC(info);
		else if (lc == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_LC(info);
		else if (lc == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_LC(info);
		else if (lc == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_LC(info);
		else if (lc == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_LC(info);
		else if (lc == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_LC(info);
		else if (lc == Calc_percentage) doCalc_percentage_LC(info);
		else if (lc == Calc_rnd_typ) doCalc_rnd_typ_LC(info);
		else if (lc == Calc_rnd_typ_nm) doCalc_rnd_typ_nm_LC(info);
		else if (lc == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_LC(info);
		else if (lc == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_itm_jnl_cd) doRslt_itm_jnl_cd_LC(info);
		else if (lc == columnRslt_itm_jnl_nm) doRslt_itm_jnl_nm_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_unit_cd) doRslt_unit_cd_LC(info);
		else if (lc == columnRslt_unit_nm) doRslt_unit_nm_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_cur_cd) doRslt_cur_cd_LC(info);
		else if (lc == columnRslt_cur_nm) doRslt_cur_nm_LC(info);
		else if (lc == columnRslt_upri_dec_place) doRslt_upri_dec_place_LC(info);
		else if (lc == columnRslt_outsrc_upri_typ) doRslt_outsrc_upri_typ_LC(info);
		else if (lc == columnRslt_outsrc_upri_typ_nm) doRslt_outsrc_upri_typ_nm_LC(info);
		else if (lc == columnRslt_cost_ratio) doRslt_cost_ratio_LC(info);
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
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
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
	 * [Cnd]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Calc]パネルの[percentage]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalc_percentage_LC(MCEventInfo info){
	}

	/**
	 * [Calc]パネルの[rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalc_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Calc]パネルの[rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCalc_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[outsrc_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[outsrc_upri_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_upri_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cost_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cost_ratio_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cntry_cd]の作成メソッド
	 */
	public MCList getCnd_cntry_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_area_cd]の作成メソッド
	 */
	public MCList getCnd_area_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArea(row, info);
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

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[Calc_rnd_typ]の作成メソッド
	 */
	public MCList getCalc_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_calc_ctg_cd]の作成メソッド
	 */
	public MCList getRslt_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_wg_cd]の作成メソッド
	 */
	public MCList getRslt_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_itm_jnl_cd]の作成メソッド
	 */
	public MCList getRslt_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_sppl_cd]の作成メソッド
	 */
	public MCList getRslt_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_cur_cd]の作成メソッド
	 */
	public MCList getRslt_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_outsrc_upri_typ]の作成メソッド
	 */
	public MCList getRslt_outsrc_upri_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOutsrcUpriTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0660.Srch01")) {
			return new MG_MGBDL0660_Srch01Bridge();
		}
		if (id.equals("MG.MGBDL0660.Upd01")) {
			return new MG_MGBDL0660_Upd01Bridge();
		}
		if (id.equals("MG.MGBDL0660.Del01")) {
			return new MG_MGBDL0660_Del01Bridge();
		}
		if (id.equals("MG.MGBDL0660.Imp01")) {
			return new MG_MGBDL0660_Imp01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0660_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0660_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0660_Srch01;

		/** コンストラクタ */
		protected MG_MGBDL0660_Srch01Bridge() {
			p_MG_MGBDL0660_Srch01 = new MCParam(PDef.MG_MGBDL0660_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0660_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0660.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0660.RsltR.class));

			p_MG_MGBDL0660_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0660_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0660_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0660_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0660_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0660.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0660.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0660.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0660.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0660_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0660.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0660_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0660.RsltR>)p_MG_MGBDL0660_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBDL0660_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0660_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0660_Upd01;

		/** コンストラクタ */
		protected MG_MGBDL0660_Upd01Bridge() {
			p_MG_MGBDL0660_Upd01 = new MCParam(PDef.MG_MGBDL0660_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0660_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0660.RsltR.class));
			param.addUpBlock(mcframe.clientMGBD.MGBDP0660.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0660.RsltR.class));

			p_MG_MGBDL0660_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0660_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0660_Upd01.addUpBlock(getRsltL().shallowClone());
			p_MG_MGBDL0660_Upd01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0660_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0660_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0660.RsltR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0660.RsltR>)up(0);
		}
		protected mcframe.clientMGBD.MGBDP0660.CndR up1() {
			return (mcframe.clientMGBD.MGBDP0660.CndR)up(1);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0660.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0660.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0660_Upd01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0660.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0660_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0660.RsltR>)p_MG_MGBDL0660_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
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
	 * [MG_MGBDL0660_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0660_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0660_Del01;

		/** コンストラクタ */
		protected MG_MGBDL0660_Del01Bridge() {
			p_MG_MGBDL0660_Del01 = new MCParam(PDef.MG_MGBDL0660_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0660_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0660.RsltR.class));
			param.addUpBlock(mcframe.clientMGBD.MGBDP0660.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0660.RsltR.class));

			p_MG_MGBDL0660_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0660_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0660_Del01.addUpBlock(getRsltL().shallowClone());
			p_MG_MGBDL0660_Del01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0660_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0660_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0660.RsltR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0660.RsltR>)up(0);
		}
		protected mcframe.clientMGBD.MGBDP0660.CndR up1() {
			return (mcframe.clientMGBD.MGBDP0660.CndR)up(1);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0660.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0660.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0660_Del01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0660.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0660_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0660.RsltR>)p_MG_MGBDL0660_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
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
	 * [MG_MGBDL0660_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0660_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0660_Imp01;

		/** コンストラクタ */
		protected MG_MGBDL0660_Imp01Bridge() {
			p_MG_MGBDL0660_Imp01 = new MCParam(PDef.MG_MGBDL0660_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0660_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0660.RsltR.class));
			param.addUpBlock(mcframe.clientMGBD.MGBDP0660.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0660.RsltR.class));

			p_MG_MGBDL0660_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0660_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0660_Imp01.addUpBlock(getRsltL().shallowClone());
			p_MG_MGBDL0660_Imp01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0660_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0660_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0660.RsltR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0660.RsltR>)up(0);
		}
		protected mcframe.clientMGBD.MGBDP0660.CndR up1() {
			return (mcframe.clientMGBD.MGBDP0660.CndR)up(1);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0660.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0660.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0660_Imp01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0660.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0660_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0660.RsltR>)p_MG_MGBDL0660_Imp01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
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