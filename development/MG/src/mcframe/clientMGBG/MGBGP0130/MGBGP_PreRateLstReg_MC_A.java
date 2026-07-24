package mcframe.clientMGBG.MGBGP0130;

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
import mcframe.clientMGBG.MGBGP0130.MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Srch01Caller;
import mcframe.clientMGBG.MGBGP0130.MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Upd01Caller;
import mcframe.clientMGBG.MGBGP0130.MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Upd02Caller;
import mcframe.clientMGBG.MGBGP0130.MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Del01Caller;
import mcframe.clientMGBG.MGBGP0130.MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Del02Caller;
import mcframe.clientMGBG.MGBGP0130.MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Del03Caller;
import mcframe.clientMGBG.MGBGP0130.MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Del04Caller;
import mcframe.clientMGBG.MGBGP0130.MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Imp01Caller;
import mcframe.clientMGBG.MGBGP0130.MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Imp02Caller;
import mcframe.clientMGBG.MGBGP0130.MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Ins01Caller;
import mcframe.clientMGBG.MGBGP0130.MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Ins02Caller;
import mcframe.clientMGBG.MGBGP0130.MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Ins03Caller;
import mcframe.clientMGBG.MGBGP0130.MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Ins04Caller;

/**
 * 画面"MGBGP_PreRateLstReg"パネルクラスです。<p>
 *
 * 一次配賦比率を登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBGP_PreRateLstReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBGP0130";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [TgtTyp]ブロック関連のField定義
	public MCPanel TgtTypPanel = null;
	public MCTitledBorder TgtTypTitledBorder = null;
	// [TgtTyp]ブロックの項目のField定義
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
	 * TERM,Term,0;PLN,Plan,1;ACT,Result,2 TERM,期間,0;PLN,計画,1;ACT,実績,2.<p>
	 *
	 */
	public MCButtonGroup Cnd_tgt_Group = null;
	public MCRadioButton Cnd_tgt_TERM = null;
	public MCRadioButton Cnd_tgt_PLN = null;
	public MCRadioButton Cnd_tgt_ACT = null;
	/**
	 * UPD,Create/Modify,0;DEL,Delete,1;REF,View,2;DELBULK,Delete (Bulk),3;INS_FILE,Import from file,4;INSDEL_FILE,Import from file after bulk deletion,5 UPD,登録・訂正する,0;DEL,削除する,1;REF,参照する,2;DELBULK,削除する（一括）,3;INS_FILE,ファイルから取り込む,4;INSDEL_FILE,一括削除後にファイルから取り込む,5.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_DELBULK = null;
	public MCRadioButton Cnd_ope_INS_FILE = null;
	public MCRadioButton Cnd_ope_INSDEL_FILE = null;
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
	public mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term_fr;	// [Cnd]の[term_p.term_fr]を[Cnd_term_fr]としてエイリアス定義。
	public MCDateComboBox Cnd_term_to;	// [Cnd]の[term_p.term_to]を[Cnd_term_to]としてエイリアス定義。
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
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
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
	public MCLabel Cnd_oper_cd_Label = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCTextField Cnd_oper_nm = null;
	public MCLabel Cnd_bp_cd_Label = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCTextField Cnd_bp_nm = null;
	public MCLabel Cnd_ctg_cd_Label = null;
	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ctg_cd = null;
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public MCTextField Cnd_ctg_nm = null;
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
	public MCLabel Cnd_lot_no_Label = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_sublot_no = null;
	public MCLabel Cnd_sno1_Label = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCTextField Cnd_sno1 = null;
	public MCLabel Cnd_sno2_Label = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCTextField Cnd_sno2 = null;
	public MCLabel Cnd_sno3_Label = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCTextField Cnd_sno3 = null;
	public MCLabel Cnd_sno4_Label = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCTextField Cnd_sno4 = null;
	public MCLabel Cnd_itm_mfg_inst_no_Label = null;
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_itm_mfg_inst_no = null;
	public MCLabel Cnd_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_iv_no = null;
	public MCLabel Cnd_po_no_Label = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_no = null;
	public MCLabel Cnd_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_no = null;
	public MCLabel Cnd_alc_ac_cd_Label = null;
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_ac_cd = null;
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public MCTextField Cnd_alc_ac_nm = null;
	public MCLabel Cnd_alc_ac_grp_cd1_Label = null;
	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_ac_grp_cd1 = null;
	/**
	 * Allocation account group name 1 配賦科目グループ名１.<p>
	 *
	 */
	public MCTextField Cnd_alc_ac_grp_nm1 = null;
	public MCLabel Cnd_alc_ac_grp_cd2_Label = null;
	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_ac_grp_cd2 = null;
	/**
	 * Allocation account group name 2 配賦科目グループ名２.<p>
	 *
	 */
	public MCTextField Cnd_alc_ac_grp_nm2 = null;
	public MCLabel Cnd_alc_ac_grp_cd3_Label = null;
	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_ac_grp_cd3 = null;
	/**
	 * Allocation account group name 3 配賦科目グループ名３.<p>
	 *
	 */
	public MCTextField Cnd_alc_ac_grp_nm3 = null;
	public MCLabel Cnd_trd_wg_cd_Label = null;
	/**
	 * Transfer WG cd. 振替ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_wg_cd = null;
	/**
	 * Transfer WG name 振替ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_trd_wg_nm = null;
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
	// [DelCnd]ブロック関連のField定義
	public MCPanel DelCndPanel = null;
	// [DelCnd]ブロックの項目のField定義
	public MCLabel DelCnd_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox DelCnd_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCTextField DelCnd_calc_ctg_nm = null;
	public MCLabel DelCnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox DelCnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField DelCnd_wg_nm = null;
	public MCLabel DelCnd_ym_fr_Label = null;
	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField DelCnd_ym_fr = null;
	public MCLabel DelCnd_ym_to_Label = null;
	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDateField DelCnd_ym_to = null;
	public mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H DelCnd_term_p_PPanel;
	public MCDateComboBox DelCnd_term_fr;	// [DelCnd]の[term_p.term_fr]を[DelCnd_term_fr]としてエイリアス定義。
	public MCDateComboBox DelCnd_term_to;	// [DelCnd]の[term_p.term_to]を[DelCnd_term_to]としてエイリアス定義。
	public MCLabel DelCnd_pre_alc_rate_cd_Label = null;
	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public MCTextComboBox DelCnd_pre_alc_rate_cd = null;
	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public MCTextField DelCnd_pre_alc_rate_nm = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBG.MGBGP0130.RsltR> RsltTable = null;
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
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ym = null;
	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_alc_rate_cd = null;
	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_alc_rate_nm = null;
	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_alc_ptn_cd = null;
	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_alc_ptn_nm = null;
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
	/**
	 * Ratio 比率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_alc_rate = null;
	/**
	 * Difference adjustment 差額調整.<p>
	 *
	 */
	public MCColumnConfig columnRslt_adj_flg = null;
	/**
	 * Period remarks 期間備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_term_rmrks = null;
	/**
	 * Period spare 1 期間予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_term_sub_char1 = null;
	/**
	 * Period spare 2 期間予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_term_sub_char2 = null;
	/**
	 * Period spare 3 期間予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_term_sub_char3 = null;
	/**
	 * Monthly remarks 月次備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mly_rmrks = null;
	/**
	 * Monthly spare 1 月次予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mly_sub_char1 = null;
	/**
	 * Monthly spare 2 月次予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mly_sub_char2 = null;
	/**
	 * Monthly spare 3 月次予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mly_sub_char3 = null;
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
	/**
	 * Dept. allocation type 部門配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_alc_typ = null;
	/**
	 * Location allocation type 場所配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_alc_typ = null;
	/**
	 * Operation allocation type 工程配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_alc_typ = null;
	/**
	 * BP allocation type 取引先配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_alc_typ = null;
	/**
	 * Item category allocation type 品群配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ctg_alc_typ = null;
	/**
	 * Item allocation type 品目配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_alc_typ = null;
	/**
	 * Lot No. allocation type ロットＮＯ配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_alc_typ = null;
	/**
	 * Sublot No. allocation type サブロットＮＯ配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_alc_typ = null;
	/**
	 * SEIBAN No. 1 allocation type 手配ＮＯ１配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno1_alc_typ = null;
	/**
	 * SEIBAN No. 2 allocation type 手配ＮＯ２配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno2_alc_typ = null;
	/**
	 * SEIBAN No. 3 allocation type 手配ＮＯ３配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno3_alc_typ = null;
	/**
	 * SEIBAN No. 4 allocation type 手配ＮＯ４配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno4_alc_typ = null;
	/**
	 * Order allocation type 指図配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_alc_typ = null;
	/**
	 * Invoice allocation type インボイス配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_alc_typ = null;
	/**
	 * PO allocation type 発注配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_alc_typ = null;
	/**
	 * Sales order allocation type 受注配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_alc_typ = null;
	/**
	 * Allocation account allocation type 配賦科目配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_ac_alc_typ = null;
	/**
	 * WG allocation type ワーキンググループ配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_alc_typ = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Departmental alloc. fixed ratio entry 一次配賦期間比率登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBGP0110 = null;
	/**
	 * Departmental alloc. variable ratio entry 一次配賦月次比率登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBGP0120 = null;
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
	public MCButton Btn_upd = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins_in_file = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins_del_in_file = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del_bulk = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [DEL_BULK]モードを表す定数 */
	public static final String DEL_BULK = "DEL_BULK";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [INS_DEL]モードを表す定数 */
	public static final String INS_DEL = "INS_DEL";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, SRCH_REF, REF, SRCH_DEL, DEL, DEL_BULK, INS, INS_DEL, FIX_U};
	
	/** [MG_MGBGL0130_Srch01]のCallerの作成 */
	protected MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Srch01Caller createMG_MGBGL0130_Srch01() {
		MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Srch01Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Srch01Bridge>
		caller = ((MGBGP_PreRateLstReg_MC)this).new MG_MGBGL0130_Srch01Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Srch01Bridge>(
					(MGBGP_PreRateLstReg)this, new MG_MGBGL0130_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBGL0130_Srch01]の呼び出し */
	protected void callMG_MGBGL0130_Srch01() {
		MCCaller caller = createMG_MGBGL0130_Srch01();
		caller.exec();
	}
	/** [MG_MGBGL0130_Upd01]のCallerの作成 */
	protected MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Upd01Caller createMG_MGBGL0130_Upd01() {
		MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Upd01Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Upd01Bridge>
		caller = ((MGBGP_PreRateLstReg_MC)this).new MG_MGBGL0130_Upd01Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Upd01Bridge>(
					(MGBGP_PreRateLstReg)this, new MG_MGBGL0130_Upd01Bridge());
		return caller;
	}
	/** [MG_MGBGL0130_Upd01]の呼び出し */
	protected void callMG_MGBGL0130_Upd01() {
		MCCaller caller = createMG_MGBGL0130_Upd01();
		caller.exec();
	}
	/** [MG_MGBGL0130_Upd02]のCallerの作成 */
	protected MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Upd02Caller createMG_MGBGL0130_Upd02() {
		MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Upd02Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Upd02Bridge>
		caller = ((MGBGP_PreRateLstReg_MC)this).new MG_MGBGL0130_Upd02Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Upd02Bridge>(
					(MGBGP_PreRateLstReg)this, new MG_MGBGL0130_Upd02Bridge());
		return caller;
	}
	/** [MG_MGBGL0130_Upd02]の呼び出し */
	protected void callMG_MGBGL0130_Upd02() {
		MCCaller caller = createMG_MGBGL0130_Upd02();
		caller.exec();
	}
	/** [MG_MGBGL0130_Del01]のCallerの作成 */
	protected MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Del01Caller createMG_MGBGL0130_Del01() {
		MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Del01Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Del01Bridge>
		caller = ((MGBGP_PreRateLstReg_MC)this).new MG_MGBGL0130_Del01Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Del01Bridge>(
					(MGBGP_PreRateLstReg)this, new MG_MGBGL0130_Del01Bridge());
		return caller;
	}
	/** [MG_MGBGL0130_Del01]の呼び出し */
	protected void callMG_MGBGL0130_Del01() {
		MCCaller caller = createMG_MGBGL0130_Del01();
		caller.exec();
	}
	/** [MG_MGBGL0130_Del02]のCallerの作成 */
	protected MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Del02Caller createMG_MGBGL0130_Del02() {
		MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Del02Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Del02Bridge>
		caller = ((MGBGP_PreRateLstReg_MC)this).new MG_MGBGL0130_Del02Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Del02Bridge>(
					(MGBGP_PreRateLstReg)this, new MG_MGBGL0130_Del02Bridge());
		return caller;
	}
	/** [MG_MGBGL0130_Del02]の呼び出し */
	protected void callMG_MGBGL0130_Del02() {
		MCCaller caller = createMG_MGBGL0130_Del02();
		caller.exec();
	}
	/** [MG_MGBGL0130_Del03]のCallerの作成 */
	protected MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Del03Caller createMG_MGBGL0130_Del03() {
		MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Del03Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Del03Bridge>
		caller = ((MGBGP_PreRateLstReg_MC)this).new MG_MGBGL0130_Del03Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Del03Bridge>(
					(MGBGP_PreRateLstReg)this, new MG_MGBGL0130_Del03Bridge());
		return caller;
	}
	/** [MG_MGBGL0130_Del03]の呼び出し */
	protected void callMG_MGBGL0130_Del03() {
		MCCaller caller = createMG_MGBGL0130_Del03();
		caller.exec();
	}
	/** [MG_MGBGL0130_Del04]のCallerの作成 */
	protected MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Del04Caller createMG_MGBGL0130_Del04() {
		MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Del04Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Del04Bridge>
		caller = ((MGBGP_PreRateLstReg_MC)this).new MG_MGBGL0130_Del04Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Del04Bridge>(
					(MGBGP_PreRateLstReg)this, new MG_MGBGL0130_Del04Bridge());
		return caller;
	}
	/** [MG_MGBGL0130_Del04]の呼び出し */
	protected void callMG_MGBGL0130_Del04() {
		MCCaller caller = createMG_MGBGL0130_Del04();
		caller.exec();
	}
	/** [MG_MGBGL0130_Imp01]のCallerの作成 */
	protected MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Imp01Caller createMG_MGBGL0130_Imp01() {
		MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Imp01Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Imp01Bridge>
		caller = ((MGBGP_PreRateLstReg_MC)this).new MG_MGBGL0130_Imp01Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Imp01Bridge>(
					(MGBGP_PreRateLstReg)this, new MG_MGBGL0130_Imp01Bridge());
		return caller;
	}
	/** [MG_MGBGL0130_Imp01]の呼び出し */
	protected void callMG_MGBGL0130_Imp01() {
		MCCaller caller = createMG_MGBGL0130_Imp01();
		caller.exec();
	}
	/** [MG_MGBGL0130_Imp02]のCallerの作成 */
	protected MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Imp02Caller createMG_MGBGL0130_Imp02() {
		MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Imp02Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Imp02Bridge>
		caller = ((MGBGP_PreRateLstReg_MC)this).new MG_MGBGL0130_Imp02Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Imp02Bridge>(
					(MGBGP_PreRateLstReg)this, new MG_MGBGL0130_Imp02Bridge());
		return caller;
	}
	/** [MG_MGBGL0130_Imp02]の呼び出し */
	protected void callMG_MGBGL0130_Imp02() {
		MCCaller caller = createMG_MGBGL0130_Imp02();
		caller.exec();
	}
	/** [MG_MGBGL0130_Ins01]のCallerの作成 */
	protected MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Ins01Caller createMG_MGBGL0130_Ins01() {
		MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Ins01Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Ins01Bridge>
		caller = ((MGBGP_PreRateLstReg_MC)this).new MG_MGBGL0130_Ins01Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Ins01Bridge>(
					(MGBGP_PreRateLstReg)this, new MG_MGBGL0130_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBGL0130_Ins01]の呼び出し */
	protected void callMG_MGBGL0130_Ins01() {
		MCCaller caller = createMG_MGBGL0130_Ins01();
		caller.exec();
	}
	/** [MG_MGBGL0130_Ins02]のCallerの作成 */
	protected MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Ins02Caller createMG_MGBGL0130_Ins02() {
		MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Ins02Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Ins02Bridge>
		caller = ((MGBGP_PreRateLstReg_MC)this).new MG_MGBGL0130_Ins02Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Ins02Bridge>(
					(MGBGP_PreRateLstReg)this, new MG_MGBGL0130_Ins02Bridge());
		return caller;
	}
	/** [MG_MGBGL0130_Ins02]の呼び出し */
	protected void callMG_MGBGL0130_Ins02() {
		MCCaller caller = createMG_MGBGL0130_Ins02();
		caller.exec();
	}
	/** [MG_MGBGL0130_Ins03]のCallerの作成 */
	protected MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Ins03Caller createMG_MGBGL0130_Ins03() {
		MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Ins03Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Ins03Bridge>
		caller = ((MGBGP_PreRateLstReg_MC)this).new MG_MGBGL0130_Ins03Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Ins03Bridge>(
					(MGBGP_PreRateLstReg)this, new MG_MGBGL0130_Ins03Bridge());
		return caller;
	}
	/** [MG_MGBGL0130_Ins03]の呼び出し */
	protected void callMG_MGBGL0130_Ins03() {
		MCCaller caller = createMG_MGBGL0130_Ins03();
		caller.exec();
	}
	/** [MG_MGBGL0130_Ins04]のCallerの作成 */
	protected MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Ins04Caller createMG_MGBGL0130_Ins04() {
		MGBGP_PreRateLstReg_MC.MG_MGBGL0130_Ins04Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Ins04Bridge>
		caller = ((MGBGP_PreRateLstReg_MC)this).new MG_MGBGL0130_Ins04Caller<MGBGP_PreRateLstReg, MG_MGBGL0130_Ins04Bridge>(
					(MGBGP_PreRateLstReg)this, new MG_MGBGL0130_Ins04Bridge());
		return caller;
	}
	/** [MG_MGBGL0130_Ins04]の呼び出し */
	protected void callMG_MGBGL0130_Ins04() {
		MCCaller caller = createMG_MGBGL0130_Ins04();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBG.MGBGP0130.CndR aCndR;
	/** [DelCnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBG.MGBGP0130.DelCndR aDelCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBG.MGBGP0130.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBG.MGBGP0130.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBG.MGBGP0130.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBG.MGBGP0130.CndR createCndR() {
		return mcframe.clientMGBG.MGBGP0130.CndR.create();
	}

	/**
	 * 項目コピーによってaDelCndRを設定します。
	 *
	 * aDelCndRのインスタンスは変更されません。
	 *
	 * @param row DelCndR
	 */
	public void setDelCndR(mcframe.clientMGBG.MGBGP0130.DelCndR row) {
		if (row != null) {
			MCRow.copyall(getDelCndR(), row);
		}
	}

	/**
	 * [DelCnd]ブロックのコンテナaDelCndRを返します。
	 *
	 * @return DelCndR
	 */
	public mcframe.clientMGBG.MGBGP0130.DelCndR getDelCndR() {
		return aDelCndR;
	}

	/**
	 * aDelCndRを作成します。
	 *
	 * @return DelCndR
	 */
	public mcframe.clientMGBG.MGBGP0130.DelCndR createDelCndR() {
		return mcframe.clientMGBG.MGBGP0130.DelCndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBG.MGBGP0130.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBG.MGBGP0130.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBG.MGBGP0130.RsltR createRsltR() {
		return mcframe.clientMGBG.MGBGP0130.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBG.MGBGP0130.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getDelCndR())) ret.add(getDelCndR());
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
		if(aCnt == getDelCndR()) return "DelCnd";
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
		if(bId.equals("DelCnd")) return getDelCndR();
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
		ret.add(TgtTypPanel);
		ret.add(ScreenOpePanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(DelCndPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBGP_PreRateLstReg_MC_A() {
		aCndR = createCndR();
		aDelCndR = createDelCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBGP_PreRateLstReg_MC_A(String name) {
		aCndR = createCndR();
		aDelCndR = createDelCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBGP_PreRateLstReg_MC.jbCreateTgtTyp((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbCreateScreenOpe((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbCreateTop((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbCreateFold((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbCreateTab1((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbCreateTab2((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbCreateCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbCreateDelCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbCreateCtrl((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbCreateRslt((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbCreateBtn((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbCreateEastBtn((MGBGP_PreRateLstReg)this);
	}

	/**
	 * [TgtTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTgtTyp(MGBGP_PreRateLstReg p) {
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBGP_PreRateLstReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBGP_PreRateLstReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBGP_PreRateLstReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBGP_PreRateLstReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBGP_PreRateLstReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBGP_PreRateLstReg p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term_fr = p.Cnd_term_p_PPanel.Term_term_fr;
		p.Cnd_term_fr.addAliasName("Cnd.term_fr", p);
		p.Cnd_term_to = p.Cnd_term_p_PPanel.Term_term_to;
		p.Cnd_term_to.addAliasName("Cnd.term_to", p);
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
	 * [DelCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDelCnd(MGBGP_PreRateLstReg p) {
		p.DelCnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.create(p.getDelCndR().term_p());
		p.DelCnd_term_p_PPanel.setName("DelCnd.term_p");
		p.DelCnd_term_fr = p.DelCnd_term_p_PPanel.Term_term_fr;
		p.DelCnd_term_fr.addAliasName("DelCnd.term_fr", p);
		p.DelCnd_term_to = p.DelCnd_term_p_PPanel.Term_term_to;
		p.DelCnd_term_to.addAliasName("DelCnd.term_to", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBGP_PreRateLstReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBGP_PreRateLstReg p) {
		p.Rslt_term_p_PPanel = mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.create(mcframe.clientMGBG.MGBGP0130.RsltR.$term_p);
		p.Rslt_term_p_PPanel.setName("Rslt.term_p");
		p.columnRslt_term = p.Rslt_term_p_PPanel.columnTerm_term;
		p.columnRslt_term.addAliasName("Rslt.term", p);
		p.columnRslt_term_nm = p.Rslt_term_p_PPanel.columnTerm_term_nm;
		p.columnRslt_term_nm.addAliasName("Rslt.term_nm", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBG.MGBGP0130.RsltR.$itm_p);
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
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMGBG.MGBGP0130.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBGP_PreRateLstReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBGP_PreRateLstReg p) {
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
	
	
	/** [Cnd_pre_alc_rate_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pre_alc_rate_cd_p = null;

	/**
	 * [Cnd_pre_alc_rate_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pre_alc_rate_cd_ListPutter() {
		if (Cnd_pre_alc_rate_cd_p == null) {
			Cnd_pre_alc_rate_cd_p = createCnd_pre_alc_rate_cd_ListPutter(Cnd_pre_alc_rate_cd, "pre_alc_rate_cd", "pre_alc_rate_nm");

		}
		return Cnd_pre_alc_rate_cd_p;
	}
	
	
	/** [Cnd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_cd_p = null;

	/**
	 * [Cnd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_cd_ListPutter() {
		if (Cnd_dpt_cd_p == null) {
			Cnd_dpt_cd_p = createCnd_dpt_cd_ListPutter(Cnd_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Cnd_dpt_cd_p;
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
	
	
	/** [Cnd_oper_cd_ListPutter]の定義 */
	private MCListPutter Cnd_oper_cd_p = null;

	/**
	 * [Cnd_oper_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_oper_cd_ListPutter() {
		if (Cnd_oper_cd_p == null) {
			Cnd_oper_cd_p = createCnd_oper_cd_ListPutter(Cnd_oper_cd, "oper_cd", "oper_nm");

		}
		return Cnd_oper_cd_p;
	}
	
	
	/** [Cnd_bp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bp_cd_p = null;

	/**
	 * [Cnd_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_cd_ListPutter() {
		if (Cnd_bp_cd_p == null) {
			Cnd_bp_cd_p = createCnd_bp_cd_ListPutter(Cnd_bp_cd, "bp_cd", "bp_nm");

		}
		return Cnd_bp_cd_p;
	}
	
	
	/** [Cnd_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ctg_cd_p = null;

	/**
	 * [Cnd_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ctg_cd_ListPutter() {
		if (Cnd_ctg_cd_p == null) {
			Cnd_ctg_cd_p = createCnd_ctg_cd_ListPutter(Cnd_ctg_cd, "ctg_cd", "ctg_nm");

		}
		return Cnd_ctg_cd_p;
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
	
	
	/** [Cnd_alc_ac_cd_ListPutter]の定義 */
	private MCListPutter Cnd_alc_ac_cd_p = null;

	/**
	 * [Cnd_alc_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_ac_cd_ListPutter() {
		if (Cnd_alc_ac_cd_p == null) {
			Cnd_alc_ac_cd_p = createCnd_alc_ac_cd_ListPutter(Cnd_alc_ac_cd, "alc_ac_cd", "alc_ac_nm");

		}
		return Cnd_alc_ac_cd_p;
	}
	
	
	/** [Cnd_alc_ac_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_alc_ac_grp_cd1_p = null;

	/**
	 * [Cnd_alc_ac_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_ac_grp_cd1_ListPutter() {
		if (Cnd_alc_ac_grp_cd1_p == null) {
			Cnd_alc_ac_grp_cd1_p = createCnd_alc_ac_grp_cd1_ListPutter(Cnd_alc_ac_grp_cd1, "alc_ac_grp_cd1", "alc_ac_grp_nm1");

		}
		return Cnd_alc_ac_grp_cd1_p;
	}
	
	
	/** [Cnd_alc_ac_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_alc_ac_grp_cd2_p = null;

	/**
	 * [Cnd_alc_ac_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_ac_grp_cd2_ListPutter() {
		if (Cnd_alc_ac_grp_cd2_p == null) {
			Cnd_alc_ac_grp_cd2_p = createCnd_alc_ac_grp_cd2_ListPutter(Cnd_alc_ac_grp_cd2, "alc_ac_grp_cd2", "alc_ac_grp_nm2");

		}
		return Cnd_alc_ac_grp_cd2_p;
	}
	
	
	/** [Cnd_alc_ac_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_alc_ac_grp_cd3_p = null;

	/**
	 * [Cnd_alc_ac_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_ac_grp_cd3_ListPutter() {
		if (Cnd_alc_ac_grp_cd3_p == null) {
			Cnd_alc_ac_grp_cd3_p = createCnd_alc_ac_grp_cd3_ListPutter(Cnd_alc_ac_grp_cd3, "alc_ac_grp_cd3", "alc_ac_grp_nm3");

		}
		return Cnd_alc_ac_grp_cd3_p;
	}
	
	
	/** [Cnd_trd_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_trd_wg_cd_p = null;

	/**
	 * [Cnd_trd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_trd_wg_cd_ListPutter() {
		if (Cnd_trd_wg_cd_p == null) {
			Cnd_trd_wg_cd_p = createCnd_trd_wg_cd_ListPutter(Cnd_trd_wg_cd, "trd_wg_cd", "trd_wg_nm");

		}
		return Cnd_trd_wg_cd_p;
	}
	
	
	/** [DelCnd_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter DelCnd_calc_ctg_cd_p = null;

	/**
	 * [DelCnd_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDelCnd_calc_ctg_cd_ListPutter() {
		if (DelCnd_calc_ctg_cd_p == null) {
			DelCnd_calc_ctg_cd_p = createDelCnd_calc_ctg_cd_ListPutter(DelCnd_calc_ctg_cd, "calc_ctg_cd", "calc_ctg_nm");

		}
		return DelCnd_calc_ctg_cd_p;
	}
	
	
	/** [DelCnd_wg_cd_ListPutter]の定義 */
	private MCListPutter DelCnd_wg_cd_p = null;

	/**
	 * [DelCnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDelCnd_wg_cd_ListPutter() {
		if (DelCnd_wg_cd_p == null) {
			DelCnd_wg_cd_p = createDelCnd_wg_cd_ListPutter(DelCnd_wg_cd, "wg_cd", "wg_nm");

		}
		return DelCnd_wg_cd_p;
	}
	
	
	/** [DelCnd_pre_alc_rate_cd_ListPutter]の定義 */
	private MCListPutter DelCnd_pre_alc_rate_cd_p = null;

	/**
	 * [DelCnd_pre_alc_rate_cd_ListPutter]の取得
	 */
	protected MCListPutter getDelCnd_pre_alc_rate_cd_ListPutter() {
		if (DelCnd_pre_alc_rate_cd_p == null) {
			DelCnd_pre_alc_rate_cd_p = createDelCnd_pre_alc_rate_cd_ListPutter(DelCnd_pre_alc_rate_cd, "pre_alc_rate_cd", "pre_alc_rate_nm");

		}
		return DelCnd_pre_alc_rate_cd_p;
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
	
	
	/** [Rslt_pre_alc_rate_cd_ListPutter]の定義 */
	private MCListPutter Rslt_pre_alc_rate_cd_p = null;

	/**
	 * [Rslt_pre_alc_rate_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_pre_alc_rate_cd_ListPutter() {
		if (Rslt_pre_alc_rate_cd_p == null) {
			Rslt_pre_alc_rate_cd_p = createRslt_pre_alc_rate_cd_ListPutter(columnRslt_pre_alc_rate_cd, "pre_alc_rate_cd", "pre_alc_rate_nm","pre_alc_ptn_cd","pre_alc_ptn_nm","dpt_alc_typ","loc_alc_typ","oper_alc_typ","bp_alc_typ","ctg_alc_typ","itm_alc_typ","lot_alc_typ","sublot_alc_typ","sno1_alc_typ","sno2_alc_typ","sno3_alc_typ","sno4_alc_typ","inst_alc_typ","iv_alc_typ","po_alc_typ","slo_alc_typ","alc_ac_alc_typ","wg_alc_typ");

		}
		return Rslt_pre_alc_rate_cd_p;
	}
	
	
	/** [Rslt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_dpt_cd_p = null;

	/**
	 * [Rslt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dpt_cd_ListPutter() {
		if (Rslt_dpt_cd_p == null) {
			Rslt_dpt_cd_p = createRslt_dpt_cd_ListPutter(columnRslt_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Rslt_dpt_cd_p;
	}
	
	
	/** [Rslt_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_loc_cd_p = null;

	/**
	 * [Rslt_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_loc_cd_ListPutter() {
		if (Rslt_loc_cd_p == null) {
			Rslt_loc_cd_p = createRslt_loc_cd_ListPutter(columnRslt_loc_cd, "loc_cd", "loc_nm");

		}
		return Rslt_loc_cd_p;
	}
	
	
	/** [Rslt_oper_cd_ListPutter]の定義 */
	private MCListPutter Rslt_oper_cd_p = null;

	/**
	 * [Rslt_oper_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_oper_cd_ListPutter() {
		if (Rslt_oper_cd_p == null) {
			Rslt_oper_cd_p = createRslt_oper_cd_ListPutter(columnRslt_oper_cd, "oper_cd", "oper_nm");

		}
		return Rslt_oper_cd_p;
	}
	
	
	/** [Rslt_bp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_bp_cd_p = null;

	/**
	 * [Rslt_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_bp_cd_ListPutter() {
		if (Rslt_bp_cd_p == null) {
			Rslt_bp_cd_p = createRslt_bp_cd_ListPutter(columnRslt_bp_cd, "bp_cd", "bp_nm");

		}
		return Rslt_bp_cd_p;
	}
	
	
	/** [Rslt_ctg_cd_ListPutter]の定義 */
	private MCListPutter Rslt_ctg_cd_p = null;

	/**
	 * [Rslt_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ctg_cd_ListPutter() {
		if (Rslt_ctg_cd_p == null) {
			Rslt_ctg_cd_p = createRslt_ctg_cd_ListPutter(columnRslt_ctg_cd, "ctg_cd", "ctg_nm");

		}
		return Rslt_ctg_cd_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_cd_p = createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub1_p = createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub2_p = createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub3_p = createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Rslt_alc_ac_cd_ListPutter]の定義 */
	private MCListPutter Rslt_alc_ac_cd_p = null;

	/**
	 * [Rslt_alc_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_alc_ac_cd_ListPutter() {
		if (Rslt_alc_ac_cd_p == null) {
			Rslt_alc_ac_cd_p = createRslt_alc_ac_cd_ListPutter(columnRslt_alc_ac_cd, "alc_ac_cd", "alc_ac_nm");

		}
		return Rslt_alc_ac_cd_p;
	}
	
	
	/** [Rslt_trd_wg_cd_ListPutter]の定義 */
	private MCListPutter Rslt_trd_wg_cd_p = null;

	/**
	 * [Rslt_trd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_trd_wg_cd_ListPutter() {
		if (Rslt_trd_wg_cd_p == null) {
			Rslt_trd_wg_cd_p = createRslt_trd_wg_cd_ListPutter(columnRslt_trd_wg_cd, "trd_wg_cd", "trd_wg_nm");

		}
		return Rslt_trd_wg_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBGP_PreRateLstReg create(){
		MGBGP_PreRateLstReg p = new MGBGP_PreRateLstReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBGP_PreRateLstReg create(String name){
		MGBGP_PreRateLstReg p = new MGBGP_PreRateLstReg(name);
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
		MGBGP_PreRateLstReg_MC.jbfInitTgtTyp((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbfInitScreenOpe((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbfInitTop((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbfInitFold((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbfInitTab1((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbfInitTab2((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbfInitCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbfInitDelCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbfInitCtrl((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbfInitRslt((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbfInitBtn((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbfInitEastBtn((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbInitTgtTyp((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbInitScreenOpe((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbInitTop((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbInitFold((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbInitTab1((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbInitTab2((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbInitCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbInitDelCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbInitCtrl((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbInitRslt((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbInitBtn((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.jbInitEastBtn((MGBGP_PreRateLstReg)this);
	}

	/**
	 * [TgtTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTgtTyp(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.TgtTypPanel = p.beansFactory.createPanel("TgtTyp");
		p.TgtTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBGP_PreRateLstReg p) {
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
	protected static void jbfInitTab1(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_tgt_Group = p.beansFactory.createButtonGroup("Cnd.tgt");
		p.Cnd_tgt_TERM = p.beansFactory.createRadioButton("Cnd.tgt_TERM");
		p.Cnd_tgt_PLN = p.beansFactory.createRadioButton("Cnd.tgt_PLN");
		p.Cnd_tgt_ACT = p.beansFactory.createRadioButton("Cnd.tgt_ACT");
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_DELBULK = p.beansFactory.createRadioButton("Cnd.ope_DELBULK");
		p.Cnd_ope_INS_FILE = p.beansFactory.createRadioButton("Cnd.ope_INS_FILE");
		p.Cnd_ope_INSDEL_FILE = p.beansFactory.createRadioButton("Cnd.ope_INSDEL_FILE");
		p.Cnd_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.calc_ctg_cd_Label");
		p.Cnd_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.calc_ctg_cd");
		p.Cnd_calc_ctg_cd.setLabel(p.Cnd_calc_ctg_cd_Label);
		p.Cnd_calc_ctg_nm = p.beansFactory.createTextField("Cnd.calc_ctg_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_ym_fr_Label = p.beansFactory.createLabel("Cnd.ym_fr_Label");
		p.Cnd_ym_fr = p.beansFactory.createDateField("Cnd.ym_fr");
		p.Cnd_ym_fr.setLabel(p.Cnd_ym_fr_Label);
		p.Cnd_ym_to_Label = p.beansFactory.createLabel("Cnd.ym_to_Label");
		p.Cnd_ym_to = p.beansFactory.createDateField("Cnd.ym_to");
		p.Cnd_ym_to.setLabel(p.Cnd_ym_to_Label);
		p.Cnd_pre_alc_rate_cd_Label = p.beansFactory.createLabel("Cnd.pre_alc_rate_cd_Label");
		p.Cnd_pre_alc_rate_cd = p.beansFactory.createTextComboBox("Cnd.pre_alc_rate_cd");
		p.Cnd_pre_alc_rate_cd.setLabel(p.Cnd_pre_alc_rate_cd_Label);
		p.Cnd_pre_alc_rate_nm = p.beansFactory.createTextField("Cnd.pre_alc_rate_nm");
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextComboBox("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_oper_cd_Label = p.beansFactory.createLabel("Cnd.oper_cd_Label");
		p.Cnd_oper_cd = p.beansFactory.createTextComboBox("Cnd.oper_cd");
		p.Cnd_oper_cd.setLabel(p.Cnd_oper_cd_Label);
		p.Cnd_oper_nm = p.beansFactory.createTextField("Cnd.oper_nm");
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_ctg_cd_Label = p.beansFactory.createLabel("Cnd.ctg_cd_Label");
		p.Cnd_ctg_cd = p.beansFactory.createTextComboBox("Cnd.ctg_cd");
		p.Cnd_ctg_cd.setLabel(p.Cnd_ctg_cd_Label);
		p.Cnd_ctg_nm = p.beansFactory.createTextField("Cnd.ctg_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextField("Cnd.sublot_no");
		p.Cnd_sno1_Label = p.beansFactory.createLabel("Cnd.sno1_Label");
		p.Cnd_sno1 = p.beansFactory.createTextField("Cnd.sno1");
		p.Cnd_sno1.setLabel(p.Cnd_sno1_Label);
		p.Cnd_sno2_Label = p.beansFactory.createLabel("Cnd.sno2_Label");
		p.Cnd_sno2 = p.beansFactory.createTextField("Cnd.sno2");
		p.Cnd_sno2.setLabel(p.Cnd_sno2_Label);
		p.Cnd_sno3_Label = p.beansFactory.createLabel("Cnd.sno3_Label");
		p.Cnd_sno3 = p.beansFactory.createTextField("Cnd.sno3");
		p.Cnd_sno3.setLabel(p.Cnd_sno3_Label);
		p.Cnd_sno4_Label = p.beansFactory.createLabel("Cnd.sno4_Label");
		p.Cnd_sno4 = p.beansFactory.createTextField("Cnd.sno4");
		p.Cnd_sno4.setLabel(p.Cnd_sno4_Label);
		p.Cnd_itm_mfg_inst_no_Label = p.beansFactory.createLabel("Cnd.itm_mfg_inst_no_Label");
		p.Cnd_itm_mfg_inst_no = p.beansFactory.createTextField("Cnd.itm_mfg_inst_no");
		p.Cnd_itm_mfg_inst_no.setLabel(p.Cnd_itm_mfg_inst_no_Label);
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_po_no_Label = p.beansFactory.createLabel("Cnd.po_no_Label");
		p.Cnd_po_no = p.beansFactory.createTextField("Cnd.po_no");
		p.Cnd_po_no.setLabel(p.Cnd_po_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_alc_ac_cd_Label = p.beansFactory.createLabel("Cnd.alc_ac_cd_Label");
		p.Cnd_alc_ac_cd = p.beansFactory.createTextComboBox("Cnd.alc_ac_cd");
		p.Cnd_alc_ac_cd.setLabel(p.Cnd_alc_ac_cd_Label);
		p.Cnd_alc_ac_nm = p.beansFactory.createTextField("Cnd.alc_ac_nm");
		p.Cnd_alc_ac_grp_cd1_Label = p.beansFactory.createLabel("Cnd.alc_ac_grp_cd1_Label");
		p.Cnd_alc_ac_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.alc_ac_grp_cd1");
		p.Cnd_alc_ac_grp_cd1.setLabel(p.Cnd_alc_ac_grp_cd1_Label);
		p.Cnd_alc_ac_grp_nm1 = p.beansFactory.createTextField("Cnd.alc_ac_grp_nm1");
		p.Cnd_alc_ac_grp_cd2_Label = p.beansFactory.createLabel("Cnd.alc_ac_grp_cd2_Label");
		p.Cnd_alc_ac_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.alc_ac_grp_cd2");
		p.Cnd_alc_ac_grp_cd2.setLabel(p.Cnd_alc_ac_grp_cd2_Label);
		p.Cnd_alc_ac_grp_nm2 = p.beansFactory.createTextField("Cnd.alc_ac_grp_nm2");
		p.Cnd_alc_ac_grp_cd3_Label = p.beansFactory.createLabel("Cnd.alc_ac_grp_cd3_Label");
		p.Cnd_alc_ac_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.alc_ac_grp_cd3");
		p.Cnd_alc_ac_grp_cd3.setLabel(p.Cnd_alc_ac_grp_cd3_Label);
		p.Cnd_alc_ac_grp_nm3 = p.beansFactory.createTextField("Cnd.alc_ac_grp_nm3");
		p.Cnd_trd_wg_cd_Label = p.beansFactory.createLabel("Cnd.trd_wg_cd_Label");
		p.Cnd_trd_wg_cd = p.beansFactory.createTextComboBox("Cnd.trd_wg_cd");
		p.Cnd_trd_wg_cd.setLabel(p.Cnd_trd_wg_cd_Label);
		p.Cnd_trd_wg_nm = p.beansFactory.createTextField("Cnd.trd_wg_nm");
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
	}

	/**
	 * [DelCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDelCnd(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.DelCndPanel = p.beansFactory.createPanel("DelCnd");
		// ブロックの項目の初期化
		p.DelCnd_calc_ctg_cd_Label = p.beansFactory.createLabel("DelCnd.calc_ctg_cd_Label");
		p.DelCnd_calc_ctg_cd = p.beansFactory.createTextComboBox("DelCnd.calc_ctg_cd");
		p.DelCnd_calc_ctg_cd.setLabel(p.DelCnd_calc_ctg_cd_Label);
		p.DelCnd_calc_ctg_nm = p.beansFactory.createTextField("DelCnd.calc_ctg_nm");
		p.DelCnd_wg_cd_Label = p.beansFactory.createLabel("DelCnd.wg_cd_Label");
		p.DelCnd_wg_cd = p.beansFactory.createTextComboBox("DelCnd.wg_cd");
		p.DelCnd_wg_cd.setLabel(p.DelCnd_wg_cd_Label);
		p.DelCnd_wg_nm = p.beansFactory.createTextField("DelCnd.wg_nm");
		p.DelCnd_ym_fr_Label = p.beansFactory.createLabel("DelCnd.ym_fr_Label");
		p.DelCnd_ym_fr = p.beansFactory.createDateField("DelCnd.ym_fr");
		p.DelCnd_ym_fr.setLabel(p.DelCnd_ym_fr_Label);
		p.DelCnd_ym_to_Label = p.beansFactory.createLabel("DelCnd.ym_to_Label");
		p.DelCnd_ym_to = p.beansFactory.createDateField("DelCnd.ym_to");
		p.DelCnd_ym_to.setLabel(p.DelCnd_ym_to_Label);
		p.DelCnd_pre_alc_rate_cd_Label = p.beansFactory.createLabel("DelCnd.pre_alc_rate_cd_Label");
		p.DelCnd_pre_alc_rate_cd = p.beansFactory.createTextComboBox("DelCnd.pre_alc_rate_cd");
		p.DelCnd_pre_alc_rate_cd.setLabel(p.DelCnd_pre_alc_rate_cd_Label);
		p.DelCnd_pre_alc_rate_nm = p.beansFactory.createTextField("DelCnd.pre_alc_rate_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBGP_PreRateLstReg p) {
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
		p.columnRslt_ym = p.beansFactory.createTableColumn("Rslt.ym", MCColumnType.DATE);
		p.columnRslt_pre_alc_rate_cd = p.beansFactory.createTableColumn("Rslt.pre_alc_rate_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_pre_alc_rate_nm = p.beansFactory.createTableColumn("Rslt.pre_alc_rate_nm", MCColumnType.TEXT);
		p.columnRslt_pre_alc_ptn_cd = p.beansFactory.createTableColumn("Rslt.pre_alc_ptn_cd", MCColumnType.TEXT);
		p.columnRslt_pre_alc_ptn_nm = p.beansFactory.createTableColumn("Rslt.pre_alc_ptn_nm", MCColumnType.TEXT);
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_oper_cd = p.beansFactory.createTableColumn("Rslt.oper_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_oper_nm = p.beansFactory.createTableColumn("Rslt.oper_nm", MCColumnType.TEXT);
		p.columnRslt_bp_cd = p.beansFactory.createTableColumn("Rslt.bp_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_bp_nm = p.beansFactory.createTableColumn("Rslt.bp_nm", MCColumnType.TEXT);
		p.columnRslt_ctg_cd = p.beansFactory.createTableColumn("Rslt.ctg_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_ctg_nm = p.beansFactory.createTableColumn("Rslt.ctg_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
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
		p.columnRslt_alc_ac_cd = p.beansFactory.createTableColumn("Rslt.alc_ac_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_alc_ac_nm = p.beansFactory.createTableColumn("Rslt.alc_ac_nm", MCColumnType.TEXT);
		p.columnRslt_trd_wg_cd = p.beansFactory.createTableColumn("Rslt.trd_wg_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_trd_wg_nm = p.beansFactory.createTableColumn("Rslt.trd_wg_nm", MCColumnType.TEXT);
		p.columnRslt_pre_alc_rate = p.beansFactory.createTableColumn("Rslt.pre_alc_rate", MCColumnType.NUMBER);
		p.columnRslt_adj_flg = p.beansFactory.createTableColumn("Rslt.adj_flg", MCColumnType.CHECK);
		p.columnRslt_term_rmrks = p.beansFactory.createTableColumn("Rslt.term_rmrks", MCColumnType.TEXT);
		p.columnRslt_term_sub_char1 = p.beansFactory.createTableColumn("Rslt.term_sub_char1", MCColumnType.TEXT);
		p.columnRslt_term_sub_char2 = p.beansFactory.createTableColumn("Rslt.term_sub_char2", MCColumnType.TEXT);
		p.columnRslt_term_sub_char3 = p.beansFactory.createTableColumn("Rslt.term_sub_char3", MCColumnType.TEXT);
		p.columnRslt_mly_rmrks = p.beansFactory.createTableColumn("Rslt.mly_rmrks", MCColumnType.TEXT);
		p.columnRslt_mly_sub_char1 = p.beansFactory.createTableColumn("Rslt.mly_sub_char1", MCColumnType.TEXT);
		p.columnRslt_mly_sub_char2 = p.beansFactory.createTableColumn("Rslt.mly_sub_char2", MCColumnType.TEXT);
		p.columnRslt_mly_sub_char3 = p.beansFactory.createTableColumn("Rslt.mly_sub_char3", MCColumnType.TEXT);
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
		p.columnRslt_dpt_alc_typ = p.beansFactory.createTableColumn("Rslt.dpt_alc_typ", MCColumnType.TEXT);
		p.columnRslt_loc_alc_typ = p.beansFactory.createTableColumn("Rslt.loc_alc_typ", MCColumnType.TEXT);
		p.columnRslt_oper_alc_typ = p.beansFactory.createTableColumn("Rslt.oper_alc_typ", MCColumnType.TEXT);
		p.columnRslt_bp_alc_typ = p.beansFactory.createTableColumn("Rslt.bp_alc_typ", MCColumnType.TEXT);
		p.columnRslt_ctg_alc_typ = p.beansFactory.createTableColumn("Rslt.ctg_alc_typ", MCColumnType.TEXT);
		p.columnRslt_itm_alc_typ = p.beansFactory.createTableColumn("Rslt.itm_alc_typ", MCColumnType.TEXT);
		p.columnRslt_lot_alc_typ = p.beansFactory.createTableColumn("Rslt.lot_alc_typ", MCColumnType.TEXT);
		p.columnRslt_sublot_alc_typ = p.beansFactory.createTableColumn("Rslt.sublot_alc_typ", MCColumnType.TEXT);
		p.columnRslt_sno1_alc_typ = p.beansFactory.createTableColumn("Rslt.sno1_alc_typ", MCColumnType.TEXT);
		p.columnRslt_sno2_alc_typ = p.beansFactory.createTableColumn("Rslt.sno2_alc_typ", MCColumnType.TEXT);
		p.columnRslt_sno3_alc_typ = p.beansFactory.createTableColumn("Rslt.sno3_alc_typ", MCColumnType.TEXT);
		p.columnRslt_sno4_alc_typ = p.beansFactory.createTableColumn("Rslt.sno4_alc_typ", MCColumnType.TEXT);
		p.columnRslt_inst_alc_typ = p.beansFactory.createTableColumn("Rslt.inst_alc_typ", MCColumnType.TEXT);
		p.columnRslt_iv_alc_typ = p.beansFactory.createTableColumn("Rslt.iv_alc_typ", MCColumnType.TEXT);
		p.columnRslt_po_alc_typ = p.beansFactory.createTableColumn("Rslt.po_alc_typ", MCColumnType.TEXT);
		p.columnRslt_slo_alc_typ = p.beansFactory.createTableColumn("Rslt.slo_alc_typ", MCColumnType.TEXT);
		p.columnRslt_alc_ac_alc_typ = p.beansFactory.createTableColumn("Rslt.alc_ac_alc_typ", MCColumnType.TEXT);
		p.columnRslt_wg_alc_typ = p.beansFactory.createTableColumn("Rslt.wg_alc_typ", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBGP0110 = p.beansFactory.createButton("Btn.open_MGBGP0110", "open");
		p.Btn_open_MGBGP0120 = p.beansFactory.createButton("Btn.open_MGBGP0120", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_ins_in_file = p.beansFactory.createButton("Btn.ins_in_file", "upd");
		p.Btn_ins_del_in_file = p.beansFactory.createButton("Btn.ins_del_in_file", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
		p.Btn_del_bulk = p.beansFactory.createButton("Btn.del_bulk", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [TgtTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTgtTyp(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.TgtTypPanel.setBorder(p.TgtTypTitledBorder);
		p.add(p.TgtTypPanel);
		p.setLastBeans(p.TgtTypPanel);
		p.TgtTypPanel.setNextBeans(p.ScreenOpePanel);
		p.TgtTypPanel.setValueCheck(false);
		p.TgtTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TgtTypPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBGP_PreRateLstReg p) {
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
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MGBGP_PreRateLstReg p) {
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
	protected static void jbInitTab1(MGBGP_PreRateLstReg p) {
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
	protected static void jbInitTab2(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.DelCndPanel, null);
		p.Tab2Panel.setLastBeans(p.DelCndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.TgtTypPanel.setLastBeans(p.Cnd_tgt_Group);
		p.Cnd_tgt_Group.setFirstBeans(p.Cnd_tgt_TERM);
		p.Cnd_tgt_TERM.setActionCommand("0");
		p.Cnd_tgt_Group.add(p.Cnd_tgt_TERM);
		p.TgtTypPanel.add(p.Cnd_tgt_TERM);
		p.Cnd_tgt_TERM.setNextBeans(p.Cnd_tgt_PLN);
		p.Cnd_tgt_PLN.setActionCommand("1");
		p.Cnd_tgt_Group.add(p.Cnd_tgt_PLN);
		p.TgtTypPanel.add(p.Cnd_tgt_PLN);
		p.Cnd_tgt_PLN.setNextBeans(p.Cnd_tgt_ACT);
		p.Cnd_tgt_ACT.setActionCommand("2");
		p.Cnd_tgt_Group.add(p.Cnd_tgt_ACT);
		p.TgtTypPanel.add(p.Cnd_tgt_ACT);
		p.Cnd_tgt_Group.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.tgt_META);
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_DELBULK);
		p.Cnd_ope_DELBULK.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_DELBULK);
		p.ScreenOpePanel.add(p.Cnd_ope_DELBULK);
		p.Cnd_ope_DELBULK.setNextBeans(p.Cnd_ope_INS_FILE);
		p.Cnd_ope_INS_FILE.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS_FILE);
		p.ScreenOpePanel.add(p.Cnd_ope_INS_FILE);
		p.Cnd_ope_INS_FILE.setNextBeans(p.Cnd_ope_INSDEL_FILE);
		p.Cnd_ope_INSDEL_FILE.setActionCommand("5");
		p.Cnd_ope_Group.add(p.Cnd_ope_INSDEL_FILE);
		p.ScreenOpePanel.add(p.Cnd_ope_INSDEL_FILE);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.ope_META);
		p.Cnd_calc_ctg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_ctg_cd, true);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ctg_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.calc_ctg_nm_META);
		p.setPluralValueEnable(p.Cnd_calc_ctg_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_ym_fr);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ym_fr);
		p.Cnd_ym_fr.setNextBeans(p.Cnd_ym_to);
		p.Cnd_ym_fr.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.ym_fr_META);
		p.Cnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ym_to_Label);
		p.CndPanel.add(p.Cnd_ym_to);
		p.Cnd_ym_to.setNextBeans(p.Cnd_term_p_PPanel);
		p.Cnd_ym_to.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.ym_to_META);
		p.Cnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_pre_alc_rate_cd);
		p.Cnd_term_p_PPanel.Term_term_fr.setListType(MCListType.FREE);
		p.Cnd_term_p_PPanel.Term_term_to.setListType(MCListType.FREE);
		p.Cnd_pre_alc_rate_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pre_alc_rate_cd, true);
		p.Cnd_pre_alc_rate_cd.setLinkBeans(p.Cnd_pre_alc_rate_nm);
		p.CndPanel.add(p.Cnd_pre_alc_rate_cd_Label);
		p.CndPanel.add(p.Cnd_pre_alc_rate_cd);
		p.Cnd_pre_alc_rate_cd.setNextBeans(p.Cnd_pre_alc_rate_nm);
		p.Cnd_pre_alc_rate_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.pre_alc_rate_cd_META);
		p.CndPanel.add(p.Cnd_pre_alc_rate_nm);
		p.Cnd_pre_alc_rate_nm.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_pre_alc_rate_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.pre_alc_rate_nm_META);
		p.setPluralValueEnable(p.Cnd_pre_alc_rate_nm, true);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.Cnd_dpt_cd.setLinkBeans(p.Cnd_dpt_nm);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.dpt_cd_META);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_oper_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_oper_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_cd, true);
		p.Cnd_oper_cd.setLinkBeans(p.Cnd_oper_nm);
		p.CndPanel.add(p.Cnd_oper_cd_Label);
		p.CndPanel.add(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setNextBeans(p.Cnd_oper_nm);
		p.Cnd_oper_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.oper_cd_META);
		p.CndPanel.add(p.Cnd_oper_nm);
		p.Cnd_oper_nm.setNextBeans(p.Cnd_bp_cd);
		p.Cnd_oper_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.oper_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_nm, true);
		p.CndPanel.add(p.Cnd_bp_cd_Label);
		p.CndPanel.add(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_cd, true);
		p.CndPanel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_ctg_cd);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.bp_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_nm, true);
		p.Cnd_ctg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ctg_cd, true);
		p.Cnd_ctg_cd.setLinkBeans(p.Cnd_ctg_nm);
		p.CndPanel.add(p.Cnd_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_ctg_cd);
		p.Cnd_ctg_cd.setNextBeans(p.Cnd_ctg_nm);
		p.Cnd_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.ctg_cd_META);
		p.CndPanel.add(p.Cnd_ctg_nm);
		p.Cnd_ctg_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.ctg_nm_META);
		p.setPluralValueEnable(p.Cnd_ctg_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_lot_no);
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
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno1);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.sublot_no_META);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno1_Label);
		p.CndPanel.add(p.Cnd_sno1);
		p.Cnd_sno1.setNextBeans(p.Cnd_sno2);
		p.Cnd_sno1.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.sno1_META);
		p.setPluralValueEnable(p.Cnd_sno1, true);
		p.CndPanel.add(p.Cnd_sno2_Label);
		p.CndPanel.add(p.Cnd_sno2);
		p.Cnd_sno2.setNextBeans(p.Cnd_sno3);
		p.Cnd_sno2.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.sno2_META);
		p.setPluralValueEnable(p.Cnd_sno2, true);
		p.CndPanel.add(p.Cnd_sno3_Label);
		p.CndPanel.add(p.Cnd_sno3);
		p.Cnd_sno3.setNextBeans(p.Cnd_sno4);
		p.Cnd_sno3.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.sno3_META);
		p.setPluralValueEnable(p.Cnd_sno3, true);
		p.CndPanel.add(p.Cnd_sno4_Label);
		p.CndPanel.add(p.Cnd_sno4);
		p.Cnd_sno4.setNextBeans(p.Cnd_itm_mfg_inst_no);
		p.Cnd_sno4.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.sno4_META);
		p.setPluralValueEnable(p.Cnd_sno4, true);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_no_Label);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_no);
		p.Cnd_itm_mfg_inst_no.setNextBeans(p.Cnd_iv_no);
		p.Cnd_itm_mfg_inst_no.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.itm_mfg_inst_no_META);
		p.setPluralValueEnable(p.Cnd_itm_mfg_inst_no, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_po_no);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_po_no_Label);
		p.CndPanel.add(p.Cnd_po_no);
		p.Cnd_po_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_po_no.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.po_no_META);
		p.setPluralValueEnable(p.Cnd_po_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_alc_ac_cd);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.Cnd_alc_ac_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_ac_cd, true);
		p.Cnd_alc_ac_cd.setLinkBeans(p.Cnd_alc_ac_nm);
		p.CndPanel.add(p.Cnd_alc_ac_cd_Label);
		p.CndPanel.add(p.Cnd_alc_ac_cd);
		p.Cnd_alc_ac_cd.setNextBeans(p.Cnd_alc_ac_nm);
		p.Cnd_alc_ac_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.alc_ac_cd_META);
		p.CndPanel.add(p.Cnd_alc_ac_nm);
		p.Cnd_alc_ac_nm.setNextBeans(p.Cnd_alc_ac_grp_cd1);
		p.Cnd_alc_ac_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.alc_ac_nm_META);
		p.setPluralValueEnable(p.Cnd_alc_ac_nm, true);
		p.Cnd_alc_ac_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_cd1, true);
		p.Cnd_alc_ac_grp_cd1.setLinkBeans(p.Cnd_alc_ac_grp_nm1);
		p.CndPanel.add(p.Cnd_alc_ac_grp_cd1_Label);
		p.CndPanel.add(p.Cnd_alc_ac_grp_cd1);
		p.Cnd_alc_ac_grp_cd1.setNextBeans(p.Cnd_alc_ac_grp_nm1);
		p.Cnd_alc_ac_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.alc_ac_grp_cd1_META);
		p.CndPanel.add(p.Cnd_alc_ac_grp_nm1);
		p.Cnd_alc_ac_grp_nm1.setNextBeans(p.Cnd_alc_ac_grp_cd2);
		p.Cnd_alc_ac_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.alc_ac_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_nm1, true);
		p.Cnd_alc_ac_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_cd2, true);
		p.Cnd_alc_ac_grp_cd2.setLinkBeans(p.Cnd_alc_ac_grp_nm2);
		p.CndPanel.add(p.Cnd_alc_ac_grp_cd2_Label);
		p.CndPanel.add(p.Cnd_alc_ac_grp_cd2);
		p.Cnd_alc_ac_grp_cd2.setNextBeans(p.Cnd_alc_ac_grp_nm2);
		p.Cnd_alc_ac_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.alc_ac_grp_cd2_META);
		p.CndPanel.add(p.Cnd_alc_ac_grp_nm2);
		p.Cnd_alc_ac_grp_nm2.setNextBeans(p.Cnd_alc_ac_grp_cd3);
		p.Cnd_alc_ac_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.alc_ac_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_nm2, true);
		p.Cnd_alc_ac_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_cd3, true);
		p.Cnd_alc_ac_grp_cd3.setLinkBeans(p.Cnd_alc_ac_grp_nm3);
		p.CndPanel.add(p.Cnd_alc_ac_grp_cd3_Label);
		p.CndPanel.add(p.Cnd_alc_ac_grp_cd3);
		p.Cnd_alc_ac_grp_cd3.setNextBeans(p.Cnd_alc_ac_grp_nm3);
		p.Cnd_alc_ac_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.alc_ac_grp_cd3_META);
		p.CndPanel.add(p.Cnd_alc_ac_grp_nm3);
		p.Cnd_alc_ac_grp_nm3.setNextBeans(p.Cnd_trd_wg_cd);
		p.Cnd_alc_ac_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.alc_ac_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_alc_ac_grp_nm3, true);
		p.Cnd_trd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_wg_cd, true);
		p.Cnd_trd_wg_cd.setLinkBeans(p.Cnd_trd_wg_nm);
		p.CndPanel.add(p.Cnd_trd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_trd_wg_cd);
		p.Cnd_trd_wg_cd.setNextBeans(p.Cnd_trd_wg_nm);
		p.Cnd_trd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.trd_wg_cd_META);
		p.CndPanel.add(p.Cnd_trd_wg_nm);
		p.Cnd_trd_wg_nm.setNextBeans(p.Cnd_rmrks);
		p.Cnd_trd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.trd_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_wg_nm, true);
		p.CndPanel.add(p.Cnd_rmrks_Label);
		p.CndPanel.add(p.Cnd_rmrks);
		p.Cnd_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_rmrks.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.rmrks_META);
		p.setPluralValueEnable(p.Cnd_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0130.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
	}

	/**
	 * [DelCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDelCnd(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.DelCndPanel.setValueCheck(false);
		p.DelCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DelCndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.DelCnd_calc_ctg_cd.setListType(MCListType.STRICT);
		p.DelCnd_calc_ctg_cd.setLinkBeans(p.DelCnd_calc_ctg_nm);
		p.DelCndPanel.add(p.DelCnd_calc_ctg_cd_Label);
		p.DelCndPanel.add(p.DelCnd_calc_ctg_cd);
		p.DelCndPanel.setLastBeans(p.DelCnd_calc_ctg_cd);
		p.DelCnd_calc_ctg_cd.setNextBeans(p.DelCnd_calc_ctg_nm);
		p.DelCnd_calc_ctg_cd.setRow(p.getDelCndR(), mcframe.clientMGBG.MGBGP0130.DelCndR.calc_ctg_cd_META);
		p.DelCndPanel.add(p.DelCnd_calc_ctg_nm);
		p.DelCnd_calc_ctg_nm.setNextBeans(p.DelCnd_wg_cd);
		p.DelCnd_calc_ctg_nm.setRow(p.getDelCndR(), mcframe.clientMGBG.MGBGP0130.DelCndR.calc_ctg_nm_META);
		p.DelCnd_wg_cd.setListType(MCListType.STRICT);
		p.DelCnd_wg_cd.setLinkBeans(p.DelCnd_wg_nm);
		p.DelCndPanel.add(p.DelCnd_wg_cd_Label);
		p.DelCndPanel.add(p.DelCnd_wg_cd);
		p.DelCnd_wg_cd.setNextBeans(p.DelCnd_wg_nm);
		p.DelCnd_wg_cd.setRow(p.getDelCndR(), mcframe.clientMGBG.MGBGP0130.DelCndR.wg_cd_META);
		p.DelCndPanel.add(p.DelCnd_wg_nm);
		p.DelCnd_wg_nm.setNextBeans(p.DelCnd_ym_fr);
		p.DelCnd_wg_nm.setRow(p.getDelCndR(), mcframe.clientMGBG.MGBGP0130.DelCndR.wg_nm_META);
		p.DelCndPanel.add(p.DelCnd_ym_fr_Label);
		p.DelCndPanel.add(p.DelCnd_ym_fr);
		p.DelCnd_ym_fr.setNextBeans(p.DelCnd_ym_to);
		p.DelCnd_ym_fr.setRow(p.getDelCndR(), mcframe.clientMGBG.MGBGP0130.DelCndR.ym_fr_META);
		p.DelCnd_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DelCndPanel.add(p.DelCnd_ym_to_Label);
		p.DelCndPanel.add(p.DelCnd_ym_to);
		p.DelCnd_ym_to.setNextBeans(p.DelCnd_term_p_PPanel);
		p.DelCnd_ym_to.setRow(p.getDelCndR(), mcframe.clientMGBG.MGBGP0130.DelCndR.ym_to_META);
		p.DelCnd_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DelCndPanel.add(p.DelCnd_term_p_PPanel);
		p.DelCnd_term_p_PPanel.setNextBeans(p.DelCnd_pre_alc_rate_cd);
		p.DelCnd_pre_alc_rate_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.DelCnd_pre_alc_rate_cd, true);
		p.DelCnd_pre_alc_rate_cd.setLinkBeans(p.DelCnd_pre_alc_rate_nm);
		p.DelCndPanel.add(p.DelCnd_pre_alc_rate_cd_Label);
		p.DelCndPanel.add(p.DelCnd_pre_alc_rate_cd);
		p.DelCnd_pre_alc_rate_cd.setNextBeans(p.DelCnd_pre_alc_rate_nm);
		p.DelCnd_pre_alc_rate_cd.setRow(p.getDelCndR(), mcframe.clientMGBG.MGBGP0130.DelCndR.pre_alc_rate_cd_META);
		p.DelCndPanel.add(p.DelCnd_pre_alc_rate_nm);
		p.DelCnd_pre_alc_rate_nm.setRow(p.getDelCndR(), mcframe.clientMGBG.MGBGP0130.DelCndR.pre_alc_rate_nm_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBGP_PreRateLstReg p) {
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
	protected static void jbInitRslt(MGBGP_PreRateLstReg p) {
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
	protected static void jbInitBtn(MGBGP_PreRateLstReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MGBGP0110.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBGP0110);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBGP0110);
		p.Btn_open_MGBGP0110.setNextBeans(p.Btn_open_MGBGP0120);
		p.Btn_open_MGBGP0120.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MGBGP0120);
		p.Btn_open_MGBGP0120.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
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
		p.Btn_rcopy.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_ins_in_file);
		p.Btn_ins_in_file.setIcon("REGISTER");
		p.Btn_ins_in_file.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins_in_file);
		p.Btn_ins_in_file.setNextBeans(p.Btn_ins_del_in_file);
		p.Btn_ins_del_in_file.setIcon("REGISTER");
		p.Btn_ins_del_in_file.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins_del_in_file);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
		p.Btn_del.setNextBeans(p.Btn_del_bulk);
		p.Btn_del_bulk.setIcon("DELETE");
		p.Btn_del_bulk.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_bulk);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MGBGP_PreRateLstReg p) {
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
		MGBGP_PreRateLstReg_MC.mcInitTgtTyp((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.mcInitScreenOpe((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.mcInitTop((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.mcInitFold((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.mcInitTab1((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.mcInitTab2((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.mcInitCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.mcInitDelCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.mcInitCtrl((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.mcInitRslt((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.mcInitBtn((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.mcInitEastBtn((MGBGP_PreRateLstReg)this);

		// [UPD]ステータスのモードの設定
		MGBGP_PreRateLstReg_MC.statusInitUPD_TgtTyp((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitUPD_ScreenOpe((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitUPD_Top((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitUPD_Fold((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitUPD_Tab1((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitUPD_Tab2((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitUPD_Cnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitUPD_DelCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitUPD_Ctrl((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitUPD_Rslt((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitUPD_Btn((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitUPD_EastBtn((MGBGP_PreRateLstReg)this);

		// [SRCH_REF]ステータスのモードの設定
		MGBGP_PreRateLstReg_MC.statusInitSRCH__REF_TgtTyp((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__REF_ScreenOpe((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__REF_Top((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__REF_Fold((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__REF_Tab1((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__REF_Tab2((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__REF_Cnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__REF_DelCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__REF_Ctrl((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__REF_Rslt((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__REF_Btn((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__REF_EastBtn((MGBGP_PreRateLstReg)this);

		// [REF]ステータスのモードの設定
		MGBGP_PreRateLstReg_MC.statusInitREF_TgtTyp((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitREF_ScreenOpe((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitREF_Top((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitREF_Fold((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitREF_Tab1((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitREF_Tab2((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitREF_Cnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitREF_DelCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitREF_Ctrl((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitREF_Rslt((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitREF_Btn((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitREF_EastBtn((MGBGP_PreRateLstReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MGBGP_PreRateLstReg_MC.statusInitSRCH__DEL_TgtTyp((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__DEL_ScreenOpe((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__DEL_Top((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__DEL_Fold((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__DEL_Tab1((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__DEL_Tab2((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__DEL_Cnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__DEL_DelCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__DEL_Ctrl((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__DEL_Rslt((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__DEL_Btn((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitSRCH__DEL_EastBtn((MGBGP_PreRateLstReg)this);

		// [DEL]ステータスのモードの設定
		MGBGP_PreRateLstReg_MC.statusInitDEL_TgtTyp((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL_ScreenOpe((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL_Top((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL_Fold((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL_Tab1((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL_Tab2((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL_Cnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL_DelCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL_Ctrl((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL_Rslt((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL_Btn((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL_EastBtn((MGBGP_PreRateLstReg)this);

		// [DEL_BULK]ステータスのモードの設定
		MGBGP_PreRateLstReg_MC.statusInitDEL__BULK_TgtTyp((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL__BULK_ScreenOpe((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL__BULK_Top((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL__BULK_Fold((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL__BULK_Tab1((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL__BULK_Tab2((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL__BULK_Cnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL__BULK_DelCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL__BULK_Ctrl((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL__BULK_Rslt((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL__BULK_Btn((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitDEL__BULK_EastBtn((MGBGP_PreRateLstReg)this);

		// [INS]ステータスのモードの設定
		MGBGP_PreRateLstReg_MC.statusInitINS_TgtTyp((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS_ScreenOpe((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS_Top((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS_Fold((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS_Tab1((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS_Tab2((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS_Cnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS_DelCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS_Ctrl((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS_Rslt((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS_Btn((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS_EastBtn((MGBGP_PreRateLstReg)this);

		// [INS_DEL]ステータスのモードの設定
		MGBGP_PreRateLstReg_MC.statusInitINS__DEL_TgtTyp((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS__DEL_ScreenOpe((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS__DEL_Top((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS__DEL_Fold((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS__DEL_Tab1((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS__DEL_Tab2((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS__DEL_Cnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS__DEL_DelCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS__DEL_Ctrl((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS__DEL_Rslt((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS__DEL_Btn((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitINS__DEL_EastBtn((MGBGP_PreRateLstReg)this);

		// [FIX_U]ステータスのモードの設定
		MGBGP_PreRateLstReg_MC.statusInitFIX__U_TgtTyp((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitFIX__U_ScreenOpe((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitFIX__U_Top((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitFIX__U_Fold((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitFIX__U_Tab1((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitFIX__U_Tab2((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitFIX__U_Cnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitFIX__U_DelCnd((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitFIX__U_Ctrl((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitFIX__U_Rslt((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitFIX__U_Btn((MGBGP_PreRateLstReg)this);
		MGBGP_PreRateLstReg_MC.statusInitFIX__U_EastBtn((MGBGP_PreRateLstReg)this);

	}

	/**
	 *  [TgtTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTgtTyp(MGBGP_PreRateLstReg p) {
	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBGP_PreRateLstReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBGP_PreRateLstReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBGP_PreRateLstReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBGP_PreRateLstReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBGP_PreRateLstReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBGP_PreRateLstReg p) {
		p.Cnd_tgt_Group.addAllListener(p);
		p.Cnd_tgt_TERM.addAllListener(p);
		p.Cnd_tgt_PLN.addAllListener(p);
		p.Cnd_tgt_ACT.addAllListener(p);
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_DELBULK.addAllListener(p);
		p.Cnd_ope_INS_FILE.addAllListener(p);
		p.Cnd_ope_INSDEL_FILE.addAllListener(p);
		p.Cnd_calc_ctg_cd.setListListener(p);
		p.Cnd_calc_ctg_cd.addAllListener(p);
		p.Cnd_calc_ctg_nm.setListListener(p);
		p.Cnd_calc_ctg_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_ym_fr.setListListener(p);
		p.Cnd_ym_fr.addAllListener(p);
		p.Cnd_ym_to.setListListener(p);
		p.Cnd_ym_to.addAllListener(p);
		p.Cnd_pre_alc_rate_cd.setListListener(p);
		p.Cnd_pre_alc_rate_cd.addAllListener(p);
		p.Cnd_pre_alc_rate_nm.setListListener(p);
		p.Cnd_pre_alc_rate_nm.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_oper_cd.setListListener(p);
		p.Cnd_oper_cd.addAllListener(p);
		p.Cnd_oper_nm.setListListener(p);
		p.Cnd_oper_nm.addAllListener(p);
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_ctg_cd.setListListener(p);
		p.Cnd_ctg_cd.addAllListener(p);
		p.Cnd_ctg_nm.setListListener(p);
		p.Cnd_ctg_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_sno1.setListListener(p);
		p.Cnd_sno1.addAllListener(p);
		p.Cnd_sno2.setListListener(p);
		p.Cnd_sno2.addAllListener(p);
		p.Cnd_sno3.setListListener(p);
		p.Cnd_sno3.addAllListener(p);
		p.Cnd_sno4.setListListener(p);
		p.Cnd_sno4.addAllListener(p);
		p.Cnd_itm_mfg_inst_no.setListListener(p);
		p.Cnd_itm_mfg_inst_no.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_po_no.setListListener(p);
		p.Cnd_po_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_alc_ac_cd.setListListener(p);
		p.Cnd_alc_ac_cd.addAllListener(p);
		p.Cnd_alc_ac_nm.setListListener(p);
		p.Cnd_alc_ac_nm.addAllListener(p);
		p.Cnd_alc_ac_grp_cd1.setListListener(p);
		p.Cnd_alc_ac_grp_cd1.addAllListener(p);
		p.Cnd_alc_ac_grp_nm1.setListListener(p);
		p.Cnd_alc_ac_grp_nm1.addAllListener(p);
		p.Cnd_alc_ac_grp_cd2.setListListener(p);
		p.Cnd_alc_ac_grp_cd2.addAllListener(p);
		p.Cnd_alc_ac_grp_nm2.setListListener(p);
		p.Cnd_alc_ac_grp_nm2.addAllListener(p);
		p.Cnd_alc_ac_grp_cd3.setListListener(p);
		p.Cnd_alc_ac_grp_cd3.addAllListener(p);
		p.Cnd_alc_ac_grp_nm3.setListListener(p);
		p.Cnd_alc_ac_grp_nm3.addAllListener(p);
		p.Cnd_trd_wg_cd.setListListener(p);
		p.Cnd_trd_wg_cd.addAllListener(p);
		p.Cnd_trd_wg_nm.setListListener(p);
		p.Cnd_trd_wg_nm.addAllListener(p);
		p.Cnd_rmrks.setListListener(p);
		p.Cnd_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
	}

	/**
	 *  [DelCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDelCnd(MGBGP_PreRateLstReg p) {
		p.DelCnd_calc_ctg_cd.setListListener(p);
		p.DelCnd_calc_ctg_cd.addAllListener(p);
		p.DelCnd_calc_ctg_nm.setListListener(p);
		p.DelCnd_calc_ctg_nm.addAllListener(p);
		p.DelCnd_wg_cd.setListListener(p);
		p.DelCnd_wg_cd.addAllListener(p);
		p.DelCnd_wg_nm.setListListener(p);
		p.DelCnd_wg_nm.addAllListener(p);
		p.DelCnd_ym_fr.setListListener(p);
		p.DelCnd_ym_fr.addAllListener(p);
		p.DelCnd_ym_to.setListListener(p);
		p.DelCnd_ym_to.addAllListener(p);
		p.DelCnd_pre_alc_rate_cd.setListListener(p);
		p.DelCnd_pre_alc_rate_cd.addAllListener(p);
		p.DelCnd_pre_alc_rate_nm.setListListener(p);
		p.DelCnd_pre_alc_rate_nm.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBGP_PreRateLstReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBGP_PreRateLstReg p) {
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
		p.columnRslt_ym.addAllListener(p);
		p.columnRslt_ym.setListListener(p);
		p.columnRslt_pre_alc_rate_cd.addAllListener(p);
		p.columnRslt_pre_alc_rate_cd.setListListener(p);
		p.columnRslt_pre_alc_rate_nm.addAllListener(p);
		p.columnRslt_pre_alc_rate_nm.setListListener(p);
		p.columnRslt_pre_alc_ptn_cd.addAllListener(p);
		p.columnRslt_pre_alc_ptn_cd.setListListener(p);
		p.columnRslt_pre_alc_ptn_nm.addAllListener(p);
		p.columnRslt_pre_alc_ptn_nm.setListListener(p);
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
		p.columnRslt_pre_alc_rate.addAllListener(p);
		p.columnRslt_pre_alc_rate.setListListener(p);
		p.columnRslt_adj_flg.addAllListener(p);
		p.columnRslt_term_rmrks.addAllListener(p);
		p.columnRslt_term_rmrks.setListListener(p);
		p.columnRslt_term_sub_char1.addAllListener(p);
		p.columnRslt_term_sub_char1.setListListener(p);
		p.columnRslt_term_sub_char2.addAllListener(p);
		p.columnRslt_term_sub_char2.setListListener(p);
		p.columnRslt_term_sub_char3.addAllListener(p);
		p.columnRslt_term_sub_char3.setListListener(p);
		p.columnRslt_mly_rmrks.addAllListener(p);
		p.columnRslt_mly_rmrks.setListListener(p);
		p.columnRslt_mly_sub_char1.addAllListener(p);
		p.columnRslt_mly_sub_char1.setListListener(p);
		p.columnRslt_mly_sub_char2.addAllListener(p);
		p.columnRslt_mly_sub_char2.setListListener(p);
		p.columnRslt_mly_sub_char3.addAllListener(p);
		p.columnRslt_mly_sub_char3.setListListener(p);
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
		p.columnRslt_dpt_alc_typ.addAllListener(p);
		p.columnRslt_dpt_alc_typ.setListListener(p);
		p.columnRslt_loc_alc_typ.addAllListener(p);
		p.columnRslt_loc_alc_typ.setListListener(p);
		p.columnRslt_oper_alc_typ.addAllListener(p);
		p.columnRslt_oper_alc_typ.setListListener(p);
		p.columnRslt_bp_alc_typ.addAllListener(p);
		p.columnRslt_bp_alc_typ.setListListener(p);
		p.columnRslt_ctg_alc_typ.addAllListener(p);
		p.columnRslt_ctg_alc_typ.setListListener(p);
		p.columnRslt_itm_alc_typ.addAllListener(p);
		p.columnRslt_itm_alc_typ.setListListener(p);
		p.columnRslt_lot_alc_typ.addAllListener(p);
		p.columnRslt_lot_alc_typ.setListListener(p);
		p.columnRslt_sublot_alc_typ.addAllListener(p);
		p.columnRslt_sublot_alc_typ.setListListener(p);
		p.columnRslt_sno1_alc_typ.addAllListener(p);
		p.columnRslt_sno1_alc_typ.setListListener(p);
		p.columnRslt_sno2_alc_typ.addAllListener(p);
		p.columnRslt_sno2_alc_typ.setListListener(p);
		p.columnRslt_sno3_alc_typ.addAllListener(p);
		p.columnRslt_sno3_alc_typ.setListListener(p);
		p.columnRslt_sno4_alc_typ.addAllListener(p);
		p.columnRslt_sno4_alc_typ.setListListener(p);
		p.columnRslt_inst_alc_typ.addAllListener(p);
		p.columnRslt_inst_alc_typ.setListListener(p);
		p.columnRslt_iv_alc_typ.addAllListener(p);
		p.columnRslt_iv_alc_typ.setListListener(p);
		p.columnRslt_po_alc_typ.addAllListener(p);
		p.columnRslt_po_alc_typ.setListListener(p);
		p.columnRslt_slo_alc_typ.addAllListener(p);
		p.columnRslt_slo_alc_typ.setListListener(p);
		p.columnRslt_alc_ac_alc_typ.addAllListener(p);
		p.columnRslt_alc_ac_alc_typ.setListListener(p);
		p.columnRslt_wg_alc_typ.addAllListener(p);
		p.columnRslt_wg_alc_typ.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBGP_PreRateLstReg p) {
		p.Btn_open_MGBGP0110.addAllListener(p);
		p.Btn_open_MGBGP0110.setAPMethodName("doBtn_open_MGBGP0110");
		p.Btn_open_MGBGP0120.addAllListener(p);
		p.Btn_open_MGBGP0120.setAPMethodName("doBtn_open_MGBGP0120");
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
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_ins_in_file.addAllListener(p);
		p.Btn_ins_in_file.setAPMethodName("doBtn_ins_in_file");
		p.Btn_ins_del_in_file.addAllListener(p);
		p.Btn_ins_del_in_file.setAPMethodName("doBtn_ins_del_in_file");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
		p.Btn_del_bulk.addAllListener(p);
		p.Btn_del_bulk.setAPMethodName("doBtn_del_bulk");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBGP_PreRateLstReg p) {
	}

	/**
	 * [UPD]ステータスの[TgtTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TgtTyp(MGBGP_PreRateLstReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MGBGP_PreRateLstReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MGBGP_PreRateLstReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MGBGP_PreRateLstReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MGBGP_PreRateLstReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MGBGP_PreRateLstReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBGP_PreRateLstReg p){
		p.Cnd_tgt_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_pre_alc_rate_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_pre_alc_rate_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ctg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ctg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alc_ac_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alc_ac_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DelCnd(MGBGP_PreRateLstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_ym_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_ym_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.READ_ONLY);
		p.DelCnd_pre_alc_rate_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.DelCnd_pre_alc_rate_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MGBGP_PreRateLstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MGBGP_PreRateLstReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_calc_ctg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.REQUIRED);
		p.columnRslt_ym.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_pre_alc_rate_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_pre_alc_rate_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_oper_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.ENABLE);
		p.columnRslt_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sublot_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sno1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sno2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sno3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sno4.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_itm_mfg_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_alc_ac_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_alc_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_trd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_adj_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_term_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_term_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_term_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_term_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_mly_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_mly_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_mly_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_mly_sub_char3.putMode(p, UPD, MCMode.ENABLE);
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
		p.columnRslt_dpt_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_loc_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_oper_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_bp_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ctg_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_itm_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_lot_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sublot_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno1_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno2_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno3_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno4_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_inst_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_iv_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_po_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_slo_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_alc_ac_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_wg_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MGBGP_PreRateLstReg p){
		p.Btn_open_MGBGP0110.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBGP0120.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ins_in_file.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MGBGP_PreRateLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[TgtTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_TgtTyp(MGBGP_PreRateLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MGBGP_PreRateLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MGBGP_PreRateLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MGBGP_PreRateLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab1(MGBGP_PreRateLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab2(MGBGP_PreRateLstReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MGBGP_PreRateLstReg p){
		p.Cnd_tgt_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_pre_alc_rate_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_pre_alc_rate_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ctg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ctg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_alc_ac_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_alc_ac_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_trd_wg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_trd_wg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_DelCnd(MGBGP_PreRateLstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_calc_ctg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_ym_fr.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_ym_to.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_term_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.READ_ONLY);
		p.DelCnd_pre_alc_rate_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.DelCnd_pre_alc_rate_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MGBGP_PreRateLstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MGBGP_PreRateLstReg p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnRslt_ym.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ctg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_adj_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_term_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mly_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
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
		p.columnRslt_dpt_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_loc_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_oper_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_bp_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_ctg_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_itm_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_lot_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sublot_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sno1_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sno2_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sno3_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sno4_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_inst_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_iv_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_po_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_slo_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_alc_ac_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_wg_alc_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MGBGP_PreRateLstReg p){
		p.Btn_open_MGBGP0110.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Btn_open_MGBGP0120.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_ins_in_file.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MGBGP_PreRateLstReg p){

	}

	/**
	 * [REF]ステータスの[TgtTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_TgtTyp(MGBGP_PreRateLstReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBGP_PreRateLstReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBGP_PreRateLstReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBGP_PreRateLstReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBGP_PreRateLstReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBGP_PreRateLstReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBGP_PreRateLstReg p){
		p.Cnd_tgt_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_pre_alc_rate_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pre_alc_rate_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ctg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ctg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_DelCnd(MGBGP_PreRateLstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_ym_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_ym_to.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.READ_ONLY);
		p.DelCnd_pre_alc_rate_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.DelCnd_pre_alc_rate_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBGP_PreRateLstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBGP_PreRateLstReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnRslt_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnRslt_pre_alc_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_adj_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_term_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mly_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnRslt_dpt_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_loc_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_oper_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_bp_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ctg_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_itm_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_lot_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sublot_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno1_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno2_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno3_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno4_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_inst_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_iv_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_po_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_slo_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_alc_ac_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_wg_alc_typ.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBGP_PreRateLstReg p){
		p.Btn_open_MGBGP0110.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBGP0120.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins_in_file.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MGBGP_PreRateLstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[TgtTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_TgtTyp(MGBGP_PreRateLstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MGBGP_PreRateLstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MGBGP_PreRateLstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MGBGP_PreRateLstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MGBGP_PreRateLstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MGBGP_PreRateLstReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MGBGP_PreRateLstReg p){
		p.Cnd_tgt_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_pre_alc_rate_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pre_alc_rate_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ctg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ctg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_trd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_trd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_DelCnd(MGBGP_PreRateLstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_calc_ctg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_ym_fr.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_ym_to.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_term_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.READ_ONLY);
		p.DelCnd_pre_alc_rate_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.DelCnd_pre_alc_rate_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MGBGP_PreRateLstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MGBGP_PreRateLstReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnRslt_ym.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ctg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_adj_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_term_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mly_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
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
		p.columnRslt_dpt_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_loc_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_oper_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_bp_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_ctg_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_lot_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sublot_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno1_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno2_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno3_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno4_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_inst_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_iv_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_po_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_alc_ac_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_wg_alc_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MGBGP_PreRateLstReg p){
		p.Btn_open_MGBGP0110.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Btn_open_MGBGP0120.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_ins_in_file.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MGBGP_PreRateLstReg p){

	}

	/**
	 * [DEL]ステータスの[TgtTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TgtTyp(MGBGP_PreRateLstReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MGBGP_PreRateLstReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MGBGP_PreRateLstReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MGBGP_PreRateLstReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MGBGP_PreRateLstReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MGBGP_PreRateLstReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MGBGP_PreRateLstReg p){
		p.Cnd_tgt_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_pre_alc_rate_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_pre_alc_rate_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ctg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ctg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DelCnd(MGBGP_PreRateLstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_ym_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_ym_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.READ_ONLY);
		p.DelCnd_pre_alc_rate_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.DelCnd_pre_alc_rate_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MGBGP_PreRateLstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MGBGP_PreRateLstReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_calc_ctg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnRslt_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_adj_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_term_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mly_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.columnRslt_dpt_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_loc_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_oper_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_bp_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ctg_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_lot_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sublot_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno1_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno2_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno3_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno4_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_inst_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_iv_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_po_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_alc_ac_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_wg_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MGBGP_PreRateLstReg p){
		p.Btn_open_MGBGP0110.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBGP0120.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins_in_file.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_del_bulk.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MGBGP_PreRateLstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[TgtTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_TgtTyp(MGBGP_PreRateLstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_ScreenOpe(MGBGP_PreRateLstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Top(MGBGP_PreRateLstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Fold(MGBGP_PreRateLstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Tab1(MGBGP_PreRateLstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Tab2(MGBGP_PreRateLstReg p){

	}

	/**
	 * [DEL_BULK]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Cnd(MGBGP_PreRateLstReg p){
		p.Cnd_tgt_Group.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.Cnd_ope_Group.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_ym_to.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.READ_ONLY);
		p.Cnd_pre_alc_rate_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_pre_alc_rate_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_dpt_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_dpt_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_oper_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_oper_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_bp_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_bp_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_ctg_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_ctg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_lot_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_sno1.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_sno2.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_sno3.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_sno4.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_itm_mfg_inst_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_alc_ac_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_alc_ac_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_cd1.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_nm1.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_cd2.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_nm2.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_cd3.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_nm3.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_trd_wg_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_trd_wg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_rmrks.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, DEL_BULK, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_BULK]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_DelCnd(MGBGP_PreRateLstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.DelCnd_calc_ctg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.DelCnd_wg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.DelCnd_ym_fr.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.DelCnd_ym_to.putMode(p, DEL_BULK, MCMode.REQUIRED);
		p.DelCnd_term_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.REQUIRED);
		p.DelCnd_pre_alc_rate_cd.putMode(p, DEL_BULK, MCMode.ENABLE);
		p.DelCnd_pre_alc_rate_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_BULK]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Ctrl(MGBGP_PreRateLstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL_BULK, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [DEL_BULK]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Rslt(MGBGP_PreRateLstReg p){
		p.columnRslt_check.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnRslt_ym.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_ctg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_adj_flg.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_term_rmrks.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char1.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char2.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char3.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_mly_rmrks.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char1.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char2.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char3.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_BULK, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_BULK, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_dpt_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_loc_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_oper_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_bp_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_ctg_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_itm_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_lot_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_sublot_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_sno1_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_sno2_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_sno3_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_sno4_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_inst_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_iv_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_po_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_slo_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_alc_ac_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.columnRslt_wg_alc_typ.putMode(p, DEL_BULK, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_BULK]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_Btn(MGBGP_PreRateLstReg p){
		p.Btn_open_MGBGP0110.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_open_MGBGP0120.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_radd.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL_BULK, MCMode.DISABLE);
		p.Btn_ins_in_file.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL_BULK, MCMode.INVISIBLE);
		p.Btn_del_bulk.putMode(p, DEL_BULK, MCMode.ENABLE);

	}

	/**
	 * [DEL_BULK]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__BULK_EastBtn(MGBGP_PreRateLstReg p){

	}

	/**
	 * [INS]ステータスの[TgtTyp]ブロックのモードの設定
	 */
	protected static void statusInitINS_TgtTyp(MGBGP_PreRateLstReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MGBGP_PreRateLstReg p){

	}

	/**
	 * [INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS_Top(MGBGP_PreRateLstReg p){

	}

	/**
	 * [INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS_Fold(MGBGP_PreRateLstReg p){

	}

	/**
	 * [INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab1(MGBGP_PreRateLstReg p){

	}

	/**
	 * [INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab2(MGBGP_PreRateLstReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MGBGP_PreRateLstReg p){
		p.Cnd_tgt_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_ym_to.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.READ_ONLY);
		p.Cnd_pre_alc_rate_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_pre_alc_rate_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_oper_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_oper_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_bp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_bp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_ctg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_lot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sno4.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_mfg_inst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_alc_ac_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_alc_ac_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_cd1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_cd2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_cd3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_trd_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_trd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_DelCnd(MGBGP_PreRateLstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.DelCnd_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DelCnd_ym_fr.putMode(p, INS, MCMode.READ_ONLY);
		p.DelCnd_ym_to.putMode(p, INS, MCMode.READ_ONLY);
		p.DelCnd_term_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.READ_ONLY);
		p.DelCnd_pre_alc_rate_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.DelCnd_pre_alc_rate_nm.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ctrl(MGBGP_PreRateLstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(INS, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MGBGP_PreRateLstReg p){
		p.columnRslt_check.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnRslt_ym.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_adj_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_term_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mly_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_dpt_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_loc_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_oper_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_bp_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_ctg_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_itm_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_lot_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sublot_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sno1_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sno2_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sno3_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sno4_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_inst_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_iv_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_po_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_slo_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_alc_ac_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_wg_alc_typ.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MGBGP_PreRateLstReg p){
		p.Btn_open_MGBGP0110.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MGBGP0120.putMode(p, INS, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, INS, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.DISABLE);
		p.Btn_radd.putMode(p, INS, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_ins_in_file.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins_del_in_file.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MGBGP_PreRateLstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[TgtTyp]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_TgtTyp(MGBGP_PreRateLstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_ScreenOpe(MGBGP_PreRateLstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Top(MGBGP_PreRateLstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Fold(MGBGP_PreRateLstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Tab1(MGBGP_PreRateLstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Tab2(MGBGP_PreRateLstReg p){

	}

	/**
	 * [INS_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Cnd(MGBGP_PreRateLstReg p){
		p.Cnd_tgt_Group.putMode(p, INS_DEL, MCMode.REQUIRED);
		p.Cnd_ope_Group.putMode(p, INS_DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_ym_fr.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_ym_to.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(INS_DEL, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.READ_ONLY);
		p.Cnd_pre_alc_rate_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_pre_alc_rate_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_dpt_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_dpt_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_oper_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_oper_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_bp_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_bp_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_ctg_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_ctg_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(INS_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(INS_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_lot_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_sno1.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_sno2.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_sno3.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_sno4.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_itm_mfg_inst_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_alc_ac_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_alc_ac_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_cd1.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_nm1.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_cd2.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_nm2.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_cd3.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_alc_ac_grp_nm3.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_trd_wg_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_trd_wg_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_rmrks.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, INS_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [INS_DEL]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_DelCnd(MGBGP_PreRateLstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, INS_DEL, MCMode.REQUIRED);
		p.DelCnd_calc_ctg_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, INS_DEL, MCMode.REQUIRED);
		p.DelCnd_wg_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.DelCnd_ym_fr.putMode(p, INS_DEL, MCMode.REQUIRED);
		p.DelCnd_ym_to.putMode(p, INS_DEL, MCMode.REQUIRED);
		p.DelCnd_term_p_PPanel.putStatus(INS_DEL, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.REQUIRED);
		p.DelCnd_pre_alc_rate_cd.putMode(p, INS_DEL, MCMode.ENABLE);
		p.DelCnd_pre_alc_rate_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [INS_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Ctrl(MGBGP_PreRateLstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(INS_DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [INS_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Rslt(MGBGP_PreRateLstReg p){
		p.columnRslt_check.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(INS_DEL, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnRslt_ym.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_ctg_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(INS_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_adj_flg.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_term_rmrks.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char1.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char2.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char3.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_mly_rmrks.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char1.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char2.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char3.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(INS_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, INS_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_dpt_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_loc_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_oper_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_bp_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_ctg_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_itm_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_lot_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_sublot_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno1_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno2_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno3_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno4_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_inst_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_iv_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_po_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_slo_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_alc_ac_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.columnRslt_wg_alc_typ.putMode(p, INS_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [INS_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_Btn(MGBGP_PreRateLstReg p){
		p.Btn_open_MGBGP0110.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_open_MGBGP0120.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.Btn_ins_in_file.putMode(p, INS_DEL, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, INS_DEL, MCMode.ENABLE);
		p.Btn_del.putMode(p, INS_DEL, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, INS_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [INS_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__DEL_EastBtn(MGBGP_PreRateLstReg p){

	}

	/**
	 * [FIX_U]ステータスの[TgtTyp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_TgtTyp(MGBGP_PreRateLstReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MGBGP_PreRateLstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MGBGP_PreRateLstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MGBGP_PreRateLstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MGBGP_PreRateLstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MGBGP_PreRateLstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MGBGP_PreRateLstReg p){
		p.Cnd_tgt_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ym_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ym_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_term_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_pre_alc_rate_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_pre_alc_rate_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ctg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ctg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sno1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sno2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sno3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sno4.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_alc_ac_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_alc_ac_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_cd3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_alc_ac_grp_nm3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[DelCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DelCnd(MGBGP_PreRateLstReg p){
		p.DelCnd_calc_ctg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_calc_ctg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_ym_fr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_ym_to.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_term_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.READ_ONLY);
		p.DelCnd_pre_alc_rate_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DelCnd_pre_alc_rate_nm.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MGBGP_PreRateLstReg p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_U, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MGBGP_PreRateLstReg p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_calc_ctg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_term_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnRslt_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_ptn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ctg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_adj_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_term_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_term_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mly_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mly_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
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
		p.columnRslt_dpt_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_loc_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_oper_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_bp_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ctg_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_itm_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_lot_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sublot_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sno1_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sno2_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sno3_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sno4_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_inst_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_iv_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_po_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_slo_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_alc_ac_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_wg_alc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MGBGP_PreRateLstReg p){
		p.Btn_open_MGBGP0110.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_open_MGBGP0120.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_ins_in_file.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_ins_del_in_file.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del_bulk.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MGBGP_PreRateLstReg p){

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
		MGBGP_PreRateLstReg_MC.setTableConfigRslt((MGBGP_PreRateLstReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBGP_PreRateLstReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_calc_ctg_cd.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.calc_ctg_cd_META);
		p.columnRslt_calc_ctg_cd.addLinkBeans(p.columnRslt_calc_ctg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_ctg_cd);
		p.columnRslt_calc_ctg_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.calc_ctg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_ctg_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.wg_cd_META);
		p.columnRslt_wg_cd.addLinkBeans(p.columnRslt_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.RsltTable.addTable(p.Rslt_term_p_PPanel.TermTable);
		p.columnRslt_ym.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.ym_META);
		p.columnRslt_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ym);
		p.columnRslt_pre_alc_rate_cd.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.pre_alc_rate_cd_META);
		p.columnRslt_pre_alc_rate_cd.addLinkBeans(p.columnRslt_pre_alc_rate_nm,p.columnRslt_pre_alc_ptn_cd,p.columnRslt_pre_alc_ptn_nm,p.columnRslt_dpt_alc_typ,p.columnRslt_loc_alc_typ,p.columnRslt_oper_alc_typ,p.columnRslt_bp_alc_typ,p.columnRslt_ctg_alc_typ,p.columnRslt_itm_alc_typ,p.columnRslt_lot_alc_typ,p.columnRslt_sublot_alc_typ,p.columnRslt_sno1_alc_typ,p.columnRslt_sno2_alc_typ,p.columnRslt_sno3_alc_typ,p.columnRslt_sno4_alc_typ,p.columnRslt_inst_alc_typ,p.columnRslt_iv_alc_typ,p.columnRslt_po_alc_typ,p.columnRslt_slo_alc_typ,p.columnRslt_alc_ac_alc_typ,p.columnRslt_wg_alc_typ);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_alc_rate_cd);
		p.columnRslt_pre_alc_rate_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.pre_alc_rate_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_alc_rate_nm);
		p.columnRslt_pre_alc_ptn_cd.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.pre_alc_ptn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_alc_ptn_cd);
		p.columnRslt_pre_alc_ptn_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.pre_alc_ptn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_alc_ptn_nm);
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.dpt_cd_META);
		p.columnRslt_dpt_cd.addLinkBeans(p.columnRslt_dpt_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.loc_cd_META);
		p.columnRslt_loc_cd.setListType(MCListType.STRICT);
		p.columnRslt_loc_cd.addLinkBeans(p.columnRslt_loc_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_oper_cd.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.oper_cd_META);
		p.columnRslt_oper_cd.addLinkBeans(p.columnRslt_oper_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_cd);
		p.columnRslt_oper_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.oper_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_nm);
		p.columnRslt_bp_cd.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.bp_cd_META);
		p.columnRslt_bp_cd.addLinkBeans(p.columnRslt_bp_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_cd);
		p.columnRslt_bp_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_nm);
		p.columnRslt_ctg_cd.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.ctg_cd_META);
		p.columnRslt_ctg_cd.addLinkBeans(p.columnRslt_ctg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_ctg_cd);
		p.columnRslt_ctg_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.ctg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ctg_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub1, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub3, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.columnRslt_lot_no.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.columnRslt_sno1.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.sno1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1);
		p.columnRslt_sno2.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.sno2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2);
		p.columnRslt_sno3.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.sno3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3);
		p.columnRslt_sno4.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.sno4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4);
		p.columnRslt_itm_mfg_inst_no.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.itm_mfg_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_mfg_inst_no);
		p.columnRslt_iv_no.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_po_no.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_no);
		p.columnRslt_slo_no.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_alc_ac_cd.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.alc_ac_cd_META);
		p.columnRslt_alc_ac_cd.addLinkBeans(p.columnRslt_alc_ac_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_ac_cd);
		p.columnRslt_alc_ac_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.alc_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_ac_nm);
		p.columnRslt_trd_wg_cd.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.trd_wg_cd_META);
		p.columnRslt_trd_wg_cd.addLinkBeans(p.columnRslt_trd_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_wg_cd);
		p.columnRslt_trd_wg_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.trd_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_wg_nm);
		p.columnRslt_pre_alc_rate.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.pre_alc_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_alc_rate);
		p.columnRslt_adj_flg.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.adj_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adj_flg);
		p.columnRslt_term_rmrks.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.term_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_term_rmrks);
		p.columnRslt_term_sub_char1.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.term_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_term_sub_char1);
		p.columnRslt_term_sub_char2.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.term_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_term_sub_char2);
		p.columnRslt_term_sub_char3.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.term_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_term_sub_char3);
		p.columnRslt_mly_rmrks.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.mly_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mly_rmrks);
		p.columnRslt_mly_sub_char1.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.mly_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mly_sub_char1);
		p.columnRslt_mly_sub_char2.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.mly_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mly_sub_char2);
		p.columnRslt_mly_sub_char3.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.mly_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mly_sub_char3);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_dpt_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.dpt_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_alc_typ);
		p.columnRslt_loc_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.loc_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_alc_typ);
		p.columnRslt_oper_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.oper_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_alc_typ);
		p.columnRslt_bp_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.bp_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_alc_typ);
		p.columnRslt_ctg_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.ctg_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ctg_alc_typ);
		p.columnRslt_itm_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.itm_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_alc_typ);
		p.columnRslt_lot_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.lot_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_alc_typ);
		p.columnRslt_sublot_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.sublot_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_alc_typ);
		p.columnRslt_sno1_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.sno1_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1_alc_typ);
		p.columnRslt_sno2_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.sno2_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2_alc_typ);
		p.columnRslt_sno3_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.sno3_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3_alc_typ);
		p.columnRslt_sno4_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.sno4_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4_alc_typ);
		p.columnRslt_inst_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.inst_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_alc_typ);
		p.columnRslt_iv_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.iv_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_alc_typ);
		p.columnRslt_po_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.po_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_alc_typ);
		p.columnRslt_slo_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.slo_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_alc_typ);
		p.columnRslt_alc_ac_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.alc_ac_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_ac_alc_typ);
		p.columnRslt_wg_alc_typ.setMeta(mcframe.clientMGBG.MGBGP0130.RsltR.wg_alc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_alc_typ);
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
		Cnd_pre_alc_rate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pre_alc_rate_cd.getListConfig().setPutter(getCnd_pre_alc_rate_cd_ListPutter());
		Cnd_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_cd.getListConfig().setPutter(getCnd_oper_cd_ListPutter());
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
		Cnd_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ctg_cd.getListConfig().setPutter(getCnd_ctg_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_alc_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_ac_cd.getListConfig().setPutter(getCnd_alc_ac_cd_ListPutter());
		Cnd_alc_ac_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_ac_grp_cd1.getListConfig().setPutter(getCnd_alc_ac_grp_cd1_ListPutter());
		Cnd_alc_ac_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_ac_grp_cd2.getListConfig().setPutter(getCnd_alc_ac_grp_cd2_ListPutter());
		Cnd_alc_ac_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_ac_grp_cd3.getListConfig().setPutter(getCnd_alc_ac_grp_cd3_ListPutter());
		Cnd_trd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_wg_cd.getListConfig().setPutter(getCnd_trd_wg_cd_ListPutter());
		DelCnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		DelCnd_calc_ctg_cd.getListConfig().setPutter(getDelCnd_calc_ctg_cd_ListPutter());
		DelCnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		DelCnd_wg_cd.getListConfig().setPutter(getDelCnd_wg_cd_ListPutter());
		DelCnd_pre_alc_rate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		DelCnd_pre_alc_rate_cd.getListConfig().setPutter(getDelCnd_pre_alc_rate_cd_ListPutter());
		columnRslt_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_calc_ctg_cd.getListConfig().setPutter(getRslt_calc_ctg_cd_ListPutter());
		columnRslt_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_wg_cd.getListConfig().setPutter(getRslt_wg_cd_ListPutter());
		columnRslt_pre_alc_rate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_pre_alc_rate_cd.getListConfig().setPutter(getRslt_pre_alc_rate_cd_ListPutter());
		columnRslt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_dpt_cd.getListConfig().setPutter(getRslt_dpt_cd_ListPutter());
		columnRslt_loc_cd.getListConfig().setPutter(getRslt_loc_cd_ListPutter());
		columnRslt_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_oper_cd.getListConfig().setPutter(getRslt_oper_cd_ListPutter());
		columnRslt_bp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_bp_cd.getListConfig().setPutter(getRslt_bp_cd_ListPutter());
		columnRslt_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_ctg_cd.getListConfig().setPutter(getRslt_ctg_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnRslt_alc_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_alc_ac_cd.getListConfig().setPutter(getRslt_alc_ac_cd_ListPutter());
		columnRslt_trd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_trd_wg_cd.getListConfig().setPutter(getRslt_trd_wg_cd_ListPutter());
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
	 * この画面を[DEL_BULK]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_BULKStatus() {
		status = DEL_BULK;
		setAllStatus(status);
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
	 * この画面を[INS_DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_DELStatus() {
		status = INS_DEL;
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
		else if (DEL_BULK.equals(status)) {
			setDEL_BULKStatus();
		}
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (INS_DEL.equals(status)) {
			setINS_DELStatus();
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
	 * [Cnd_pre_alc_rate_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pre_alc_rate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.PreAlcRateWithPtn");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
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
	 * [Cnd_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCtg");
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
	 * [Cnd_alc_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAc");
		return lp;
	}
	 
	/**
	 * [Cnd_alc_ac_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_ac_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_alc_ac_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_ac_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_alc_ac_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_ac_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_trd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [DelCnd_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDelCnd_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [DelCnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDelCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [DelCnd_pre_alc_rate_cd_ListPutter]の作成
	 */
	protected MCListPutter createDelCnd_pre_alc_rate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.PreAlcRateWithPtn");
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
	 * [Rslt_pre_alc_rate_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_pre_alc_rate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.PreAlcRateInPreAlcCtgWithPtn");
		return lp;
	}
	 
	/**
	 * [Rslt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Rslt_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Rslt_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 
	/**
	 * [Rslt_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rslt_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCtg");
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
	 * [Rslt_alc_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_alc_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAc");
		return lp;
	}
	 
	/**
	 * [Rslt_trd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_trd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
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
		if(combo == Cnd_pre_alc_rate_cd) return getCnd_pre_alc_rate_cd(row, info);
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_oper_cd) return getCnd_oper_cd(row, info);
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		if(combo == Cnd_ctg_cd) return getCnd_ctg_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_alc_ac_cd) return getCnd_alc_ac_cd(row, info);
		if(combo == Cnd_alc_ac_grp_cd1) return getCnd_alc_ac_grp_cd1(row, info);
		if(combo == Cnd_alc_ac_grp_cd2) return getCnd_alc_ac_grp_cd2(row, info);
		if(combo == Cnd_alc_ac_grp_cd3) return getCnd_alc_ac_grp_cd3(row, info);
		if(combo == Cnd_trd_wg_cd) return getCnd_trd_wg_cd(row, info);
		if(combo == DelCnd_calc_ctg_cd) return getDelCnd_calc_ctg_cd(row, info);
		if(combo == DelCnd_wg_cd) return getDelCnd_wg_cd(row, info);
		if(combo == DelCnd_pre_alc_rate_cd) return getDelCnd_pre_alc_rate_cd(row, info);
		if(combo == columnRslt_calc_ctg_cd) return getRslt_calc_ctg_cd(row, info);
		if(combo == columnRslt_wg_cd) return getRslt_wg_cd(row, info);
		if(combo == columnRslt_pre_alc_rate_cd) return getRslt_pre_alc_rate_cd(row, info);
		if(combo == columnRslt_dpt_cd) return getRslt_dpt_cd(row, info);
		if(combo == columnRslt_loc_cd) return getRslt_loc_cd(row, info);
		if(combo == columnRslt_oper_cd) return getRslt_oper_cd(row, info);
		if(combo == columnRslt_bp_cd) return getRslt_bp_cd(row, info);
		if(combo == columnRslt_ctg_cd) return getRslt_ctg_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_cd) return getRslt_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub1) return getRslt_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub2) return getRslt_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub3) return getRslt_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnRslt_alc_ac_cd) return getRslt_alc_ac_cd(row, info);
		if(combo == columnRslt_trd_wg_cd) return getRslt_trd_wg_cd(row, info);
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
		else if (ap == Btn_open_MGBGP0110) doBtn_open_MGBGP0110(info);
		else if (ap == Btn_open_MGBGP0120) doBtn_open_MGBGP0120(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_ins_in_file) doBtn_ins_in_file(info);
		else if (ap == Btn_ins_del_in_file) doBtn_ins_del_in_file(info);
		else if (ap == Btn_del) doBtn_del(info);
		else if (ap == Btn_del_bulk) doBtn_del_bulk(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBGP0110]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBGP0110(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBGP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBGP0120(MCEventInfo info);

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
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins_in_file]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins_in_file(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins_del_in_file]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins_del_in_file(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_bulk]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_bulk(MCEventInfo info);

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
		if (vc == Cnd_tgt_Group) return doCnd_tgt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_ym_fr) return doCnd_ym_fr_VC(info);
		if (vc == Cnd_ym_to) return doCnd_ym_to_VC(info);
		if (vc == Cnd_pre_alc_rate_cd) return doCnd_pre_alc_rate_cd_VC(info);
		if (vc == Cnd_pre_alc_rate_nm) return doCnd_pre_alc_rate_nm_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_oper_cd) return doCnd_oper_cd_VC(info);
		if (vc == Cnd_oper_nm) return doCnd_oper_nm_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_ctg_cd) return doCnd_ctg_cd_VC(info);
		if (vc == Cnd_ctg_nm) return doCnd_ctg_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_sno1) return doCnd_sno1_VC(info);
		if (vc == Cnd_sno2) return doCnd_sno2_VC(info);
		if (vc == Cnd_sno3) return doCnd_sno3_VC(info);
		if (vc == Cnd_sno4) return doCnd_sno4_VC(info);
		if (vc == Cnd_itm_mfg_inst_no) return doCnd_itm_mfg_inst_no_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_po_no) return doCnd_po_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_alc_ac_cd) return doCnd_alc_ac_cd_VC(info);
		if (vc == Cnd_alc_ac_nm) return doCnd_alc_ac_nm_VC(info);
		if (vc == Cnd_alc_ac_grp_cd1) return doCnd_alc_ac_grp_cd1_VC(info);
		if (vc == Cnd_alc_ac_grp_nm1) return doCnd_alc_ac_grp_nm1_VC(info);
		if (vc == Cnd_alc_ac_grp_cd2) return doCnd_alc_ac_grp_cd2_VC(info);
		if (vc == Cnd_alc_ac_grp_nm2) return doCnd_alc_ac_grp_nm2_VC(info);
		if (vc == Cnd_alc_ac_grp_cd3) return doCnd_alc_ac_grp_cd3_VC(info);
		if (vc == Cnd_alc_ac_grp_nm3) return doCnd_alc_ac_grp_nm3_VC(info);
		if (vc == Cnd_trd_wg_cd) return doCnd_trd_wg_cd_VC(info);
		if (vc == Cnd_trd_wg_nm) return doCnd_trd_wg_nm_VC(info);
		if (vc == Cnd_rmrks) return doCnd_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == DelCnd_calc_ctg_cd) return doDelCnd_calc_ctg_cd_VC(info);
		if (vc == DelCnd_calc_ctg_nm) return doDelCnd_calc_ctg_nm_VC(info);
		if (vc == DelCnd_wg_cd) return doDelCnd_wg_cd_VC(info);
		if (vc == DelCnd_wg_nm) return doDelCnd_wg_nm_VC(info);
		if (vc == DelCnd_ym_fr) return doDelCnd_ym_fr_VC(info);
		if (vc == DelCnd_ym_to) return doDelCnd_ym_to_VC(info);
		if (vc == DelCnd_pre_alc_rate_cd) return doDelCnd_pre_alc_rate_cd_VC(info);
		if (vc == DelCnd_pre_alc_rate_nm) return doDelCnd_pre_alc_rate_nm_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_calc_ctg_cd) return doRslt_calc_ctg_cd_VC(info);
		if (vc == columnRslt_calc_ctg_nm) return doRslt_calc_ctg_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_ym) return doRslt_ym_VC(info);
		if (vc == columnRslt_pre_alc_rate_cd) return doRslt_pre_alc_rate_cd_VC(info);
		if (vc == columnRslt_pre_alc_rate_nm) return doRslt_pre_alc_rate_nm_VC(info);
		if (vc == columnRslt_pre_alc_ptn_cd) return doRslt_pre_alc_ptn_cd_VC(info);
		if (vc == columnRslt_pre_alc_ptn_nm) return doRslt_pre_alc_ptn_nm_VC(info);
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
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
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
		if (vc == columnRslt_pre_alc_rate) return doRslt_pre_alc_rate_VC(info);
		if (vc == columnRslt_adj_flg) return doRslt_adj_flg_VC(info);
		if (vc == columnRslt_term_rmrks) return doRslt_term_rmrks_VC(info);
		if (vc == columnRslt_term_sub_char1) return doRslt_term_sub_char1_VC(info);
		if (vc == columnRslt_term_sub_char2) return doRslt_term_sub_char2_VC(info);
		if (vc == columnRslt_term_sub_char3) return doRslt_term_sub_char3_VC(info);
		if (vc == columnRslt_mly_rmrks) return doRslt_mly_rmrks_VC(info);
		if (vc == columnRslt_mly_sub_char1) return doRslt_mly_sub_char1_VC(info);
		if (vc == columnRslt_mly_sub_char2) return doRslt_mly_sub_char2_VC(info);
		if (vc == columnRslt_mly_sub_char3) return doRslt_mly_sub_char3_VC(info);
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
		if (vc == columnRslt_dpt_alc_typ) return doRslt_dpt_alc_typ_VC(info);
		if (vc == columnRslt_loc_alc_typ) return doRslt_loc_alc_typ_VC(info);
		if (vc == columnRslt_oper_alc_typ) return doRslt_oper_alc_typ_VC(info);
		if (vc == columnRslt_bp_alc_typ) return doRslt_bp_alc_typ_VC(info);
		if (vc == columnRslt_ctg_alc_typ) return doRslt_ctg_alc_typ_VC(info);
		if (vc == columnRslt_itm_alc_typ) return doRslt_itm_alc_typ_VC(info);
		if (vc == columnRslt_lot_alc_typ) return doRslt_lot_alc_typ_VC(info);
		if (vc == columnRslt_sublot_alc_typ) return doRslt_sublot_alc_typ_VC(info);
		if (vc == columnRslt_sno1_alc_typ) return doRslt_sno1_alc_typ_VC(info);
		if (vc == columnRslt_sno2_alc_typ) return doRslt_sno2_alc_typ_VC(info);
		if (vc == columnRslt_sno3_alc_typ) return doRslt_sno3_alc_typ_VC(info);
		if (vc == columnRslt_sno4_alc_typ) return doRslt_sno4_alc_typ_VC(info);
		if (vc == columnRslt_inst_alc_typ) return doRslt_inst_alc_typ_VC(info);
		if (vc == columnRslt_iv_alc_typ) return doRslt_iv_alc_typ_VC(info);
		if (vc == columnRslt_po_alc_typ) return doRslt_po_alc_typ_VC(info);
		if (vc == columnRslt_slo_alc_typ) return doRslt_slo_alc_typ_VC(info);
		if (vc == columnRslt_alc_ac_alc_typ) return doRslt_alc_ac_alc_typ_VC(info);
		if (vc == columnRslt_wg_alc_typ) return doRslt_wg_alc_typ_VC(info);
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
	 * [Cnd]パネルの[tgt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tgt_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ac_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_wg_nm_VC(MCEventInfo info){
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
	 * [DelCnd]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[pre_alc_rate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_pre_alc_rate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DelCnd]パネルの[pre_alc_rate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDelCnd_pre_alc_rate_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_alc_rate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_alc_rate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_alc_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_alc_ptn_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_alc_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_alc_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[adj_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_adj_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[term_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_term_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[term_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_term_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[term_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_term_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[term_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_term_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mly_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mly_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mly_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mly_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mly_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mly_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mly_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mly_sub_char3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dpt_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ctg_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ctg_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno1_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno1_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno2_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno2_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno3_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno3_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno4_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno4_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_ac_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_ac_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_alc_typ_VC(MCEventInfo info){
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
		else if (nc == Cnd_tgt_Group) doCnd_tgt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_ym_fr) doCnd_ym_fr_NC(info);
		else if (nc == Cnd_ym_to) doCnd_ym_to_NC(info);
		else if (nc == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_NC(info);
		else if (nc == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_oper_cd) doCnd_oper_cd_NC(info);
		else if (nc == Cnd_oper_nm) doCnd_oper_nm_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_ctg_cd) doCnd_ctg_cd_NC(info);
		else if (nc == Cnd_ctg_nm) doCnd_ctg_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_sno1) doCnd_sno1_NC(info);
		else if (nc == Cnd_sno2) doCnd_sno2_NC(info);
		else if (nc == Cnd_sno3) doCnd_sno3_NC(info);
		else if (nc == Cnd_sno4) doCnd_sno4_NC(info);
		else if (nc == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_po_no) doCnd_po_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_alc_ac_cd) doCnd_alc_ac_cd_NC(info);
		else if (nc == Cnd_alc_ac_nm) doCnd_alc_ac_nm_NC(info);
		else if (nc == Cnd_alc_ac_grp_cd1) doCnd_alc_ac_grp_cd1_NC(info);
		else if (nc == Cnd_alc_ac_grp_nm1) doCnd_alc_ac_grp_nm1_NC(info);
		else if (nc == Cnd_alc_ac_grp_cd2) doCnd_alc_ac_grp_cd2_NC(info);
		else if (nc == Cnd_alc_ac_grp_nm2) doCnd_alc_ac_grp_nm2_NC(info);
		else if (nc == Cnd_alc_ac_grp_cd3) doCnd_alc_ac_grp_cd3_NC(info);
		else if (nc == Cnd_alc_ac_grp_nm3) doCnd_alc_ac_grp_nm3_NC(info);
		else if (nc == Cnd_trd_wg_cd) doCnd_trd_wg_cd_NC(info);
		else if (nc == Cnd_trd_wg_nm) doCnd_trd_wg_nm_NC(info);
		else if (nc == Cnd_rmrks) doCnd_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == DelCnd_calc_ctg_cd) doDelCnd_calc_ctg_cd_NC(info);
		else if (nc == DelCnd_calc_ctg_nm) doDelCnd_calc_ctg_nm_NC(info);
		else if (nc == DelCnd_wg_cd) doDelCnd_wg_cd_NC(info);
		else if (nc == DelCnd_wg_nm) doDelCnd_wg_nm_NC(info);
		else if (nc == DelCnd_ym_fr) doDelCnd_ym_fr_NC(info);
		else if (nc == DelCnd_ym_to) doDelCnd_ym_to_NC(info);
		else if (nc == DelCnd_pre_alc_rate_cd) doDelCnd_pre_alc_rate_cd_NC(info);
		else if (nc == DelCnd_pre_alc_rate_nm) doDelCnd_pre_alc_rate_nm_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NC(info);
		else if (nc == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_ym) doRslt_ym_NC(info);
		else if (nc == columnRslt_pre_alc_rate_cd) doRslt_pre_alc_rate_cd_NC(info);
		else if (nc == columnRslt_pre_alc_rate_nm) doRslt_pre_alc_rate_nm_NC(info);
		else if (nc == columnRslt_pre_alc_ptn_cd) doRslt_pre_alc_ptn_cd_NC(info);
		else if (nc == columnRslt_pre_alc_ptn_nm) doRslt_pre_alc_ptn_nm_NC(info);
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
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
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
		else if (nc == columnRslt_pre_alc_rate) doRslt_pre_alc_rate_NC(info);
		else if (nc == columnRslt_adj_flg) doRslt_adj_flg_NC(info);
		else if (nc == columnRslt_term_rmrks) doRslt_term_rmrks_NC(info);
		else if (nc == columnRslt_term_sub_char1) doRslt_term_sub_char1_NC(info);
		else if (nc == columnRslt_term_sub_char2) doRslt_term_sub_char2_NC(info);
		else if (nc == columnRslt_term_sub_char3) doRslt_term_sub_char3_NC(info);
		else if (nc == columnRslt_mly_rmrks) doRslt_mly_rmrks_NC(info);
		else if (nc == columnRslt_mly_sub_char1) doRslt_mly_sub_char1_NC(info);
		else if (nc == columnRslt_mly_sub_char2) doRslt_mly_sub_char2_NC(info);
		else if (nc == columnRslt_mly_sub_char3) doRslt_mly_sub_char3_NC(info);
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
		else if (nc == columnRslt_dpt_alc_typ) doRslt_dpt_alc_typ_NC(info);
		else if (nc == columnRslt_loc_alc_typ) doRslt_loc_alc_typ_NC(info);
		else if (nc == columnRslt_oper_alc_typ) doRslt_oper_alc_typ_NC(info);
		else if (nc == columnRslt_bp_alc_typ) doRslt_bp_alc_typ_NC(info);
		else if (nc == columnRslt_ctg_alc_typ) doRslt_ctg_alc_typ_NC(info);
		else if (nc == columnRslt_itm_alc_typ) doRslt_itm_alc_typ_NC(info);
		else if (nc == columnRslt_lot_alc_typ) doRslt_lot_alc_typ_NC(info);
		else if (nc == columnRslt_sublot_alc_typ) doRslt_sublot_alc_typ_NC(info);
		else if (nc == columnRslt_sno1_alc_typ) doRslt_sno1_alc_typ_NC(info);
		else if (nc == columnRslt_sno2_alc_typ) doRslt_sno2_alc_typ_NC(info);
		else if (nc == columnRslt_sno3_alc_typ) doRslt_sno3_alc_typ_NC(info);
		else if (nc == columnRslt_sno4_alc_typ) doRslt_sno4_alc_typ_NC(info);
		else if (nc == columnRslt_inst_alc_typ) doRslt_inst_alc_typ_NC(info);
		else if (nc == columnRslt_iv_alc_typ) doRslt_iv_alc_typ_NC(info);
		else if (nc == columnRslt_po_alc_typ) doRslt_po_alc_typ_NC(info);
		else if (nc == columnRslt_slo_alc_typ) doRslt_slo_alc_typ_NC(info);
		else if (nc == columnRslt_alc_ac_alc_typ) doRslt_alc_ac_alc_typ_NC(info);
		else if (nc == columnRslt_wg_alc_typ) doRslt_wg_alc_typ_NC(info);
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
	 * [Cnd]パネルの[tgt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_wg_nm_NC(MCEventInfo info){
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
	 * [DelCnd]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[pre_alc_rate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_pre_alc_rate_cd_NC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[pre_alc_rate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_pre_alc_rate_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_alc_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adj_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adj_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_sub_char3_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[dpt_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_alc_typ_NC(MCEventInfo info){
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
		else if (ne == Cnd_tgt_Group) doCnd_tgt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_ym_fr) doCnd_ym_fr_NE(info);
		else if (ne == Cnd_ym_to) doCnd_ym_to_NE(info);
		else if (ne == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_NE(info);
		else if (ne == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_oper_cd) doCnd_oper_cd_NE(info);
		else if (ne == Cnd_oper_nm) doCnd_oper_nm_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_ctg_cd) doCnd_ctg_cd_NE(info);
		else if (ne == Cnd_ctg_nm) doCnd_ctg_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_sno1) doCnd_sno1_NE(info);
		else if (ne == Cnd_sno2) doCnd_sno2_NE(info);
		else if (ne == Cnd_sno3) doCnd_sno3_NE(info);
		else if (ne == Cnd_sno4) doCnd_sno4_NE(info);
		else if (ne == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_po_no) doCnd_po_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_alc_ac_cd) doCnd_alc_ac_cd_NE(info);
		else if (ne == Cnd_alc_ac_nm) doCnd_alc_ac_nm_NE(info);
		else if (ne == Cnd_alc_ac_grp_cd1) doCnd_alc_ac_grp_cd1_NE(info);
		else if (ne == Cnd_alc_ac_grp_nm1) doCnd_alc_ac_grp_nm1_NE(info);
		else if (ne == Cnd_alc_ac_grp_cd2) doCnd_alc_ac_grp_cd2_NE(info);
		else if (ne == Cnd_alc_ac_grp_nm2) doCnd_alc_ac_grp_nm2_NE(info);
		else if (ne == Cnd_alc_ac_grp_cd3) doCnd_alc_ac_grp_cd3_NE(info);
		else if (ne == Cnd_alc_ac_grp_nm3) doCnd_alc_ac_grp_nm3_NE(info);
		else if (ne == Cnd_trd_wg_cd) doCnd_trd_wg_cd_NE(info);
		else if (ne == Cnd_trd_wg_nm) doCnd_trd_wg_nm_NE(info);
		else if (ne == Cnd_rmrks) doCnd_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == DelCnd_calc_ctg_cd) doDelCnd_calc_ctg_cd_NE(info);
		else if (ne == DelCnd_calc_ctg_nm) doDelCnd_calc_ctg_nm_NE(info);
		else if (ne == DelCnd_wg_cd) doDelCnd_wg_cd_NE(info);
		else if (ne == DelCnd_wg_nm) doDelCnd_wg_nm_NE(info);
		else if (ne == DelCnd_ym_fr) doDelCnd_ym_fr_NE(info);
		else if (ne == DelCnd_ym_to) doDelCnd_ym_to_NE(info);
		else if (ne == DelCnd_pre_alc_rate_cd) doDelCnd_pre_alc_rate_cd_NE(info);
		else if (ne == DelCnd_pre_alc_rate_nm) doDelCnd_pre_alc_rate_nm_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NE(info);
		else if (ne == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_ym) doRslt_ym_NE(info);
		else if (ne == columnRslt_pre_alc_rate_cd) doRslt_pre_alc_rate_cd_NE(info);
		else if (ne == columnRslt_pre_alc_rate_nm) doRslt_pre_alc_rate_nm_NE(info);
		else if (ne == columnRslt_pre_alc_ptn_cd) doRslt_pre_alc_ptn_cd_NE(info);
		else if (ne == columnRslt_pre_alc_ptn_nm) doRslt_pre_alc_ptn_nm_NE(info);
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
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
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
		else if (ne == columnRslt_pre_alc_rate) doRslt_pre_alc_rate_NE(info);
		else if (ne == columnRslt_adj_flg) doRslt_adj_flg_NE(info);
		else if (ne == columnRslt_term_rmrks) doRslt_term_rmrks_NE(info);
		else if (ne == columnRslt_term_sub_char1) doRslt_term_sub_char1_NE(info);
		else if (ne == columnRslt_term_sub_char2) doRslt_term_sub_char2_NE(info);
		else if (ne == columnRslt_term_sub_char3) doRslt_term_sub_char3_NE(info);
		else if (ne == columnRslt_mly_rmrks) doRslt_mly_rmrks_NE(info);
		else if (ne == columnRslt_mly_sub_char1) doRslt_mly_sub_char1_NE(info);
		else if (ne == columnRslt_mly_sub_char2) doRslt_mly_sub_char2_NE(info);
		else if (ne == columnRslt_mly_sub_char3) doRslt_mly_sub_char3_NE(info);
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
		else if (ne == columnRslt_dpt_alc_typ) doRslt_dpt_alc_typ_NE(info);
		else if (ne == columnRslt_loc_alc_typ) doRslt_loc_alc_typ_NE(info);
		else if (ne == columnRslt_oper_alc_typ) doRslt_oper_alc_typ_NE(info);
		else if (ne == columnRslt_bp_alc_typ) doRslt_bp_alc_typ_NE(info);
		else if (ne == columnRslt_ctg_alc_typ) doRslt_ctg_alc_typ_NE(info);
		else if (ne == columnRslt_itm_alc_typ) doRslt_itm_alc_typ_NE(info);
		else if (ne == columnRslt_lot_alc_typ) doRslt_lot_alc_typ_NE(info);
		else if (ne == columnRslt_sublot_alc_typ) doRslt_sublot_alc_typ_NE(info);
		else if (ne == columnRslt_sno1_alc_typ) doRslt_sno1_alc_typ_NE(info);
		else if (ne == columnRslt_sno2_alc_typ) doRslt_sno2_alc_typ_NE(info);
		else if (ne == columnRslt_sno3_alc_typ) doRslt_sno3_alc_typ_NE(info);
		else if (ne == columnRslt_sno4_alc_typ) doRslt_sno4_alc_typ_NE(info);
		else if (ne == columnRslt_inst_alc_typ) doRslt_inst_alc_typ_NE(info);
		else if (ne == columnRslt_iv_alc_typ) doRslt_iv_alc_typ_NE(info);
		else if (ne == columnRslt_po_alc_typ) doRslt_po_alc_typ_NE(info);
		else if (ne == columnRslt_slo_alc_typ) doRslt_slo_alc_typ_NE(info);
		else if (ne == columnRslt_alc_ac_alc_typ) doRslt_alc_ac_alc_typ_NE(info);
		else if (ne == columnRslt_wg_alc_typ) doRslt_wg_alc_typ_NE(info);
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
	 * [Cnd]パネルの[tgt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_wg_nm_NE(MCEventInfo info){
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
	 * [DelCnd]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[pre_alc_rate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_pre_alc_rate_cd_NE(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[pre_alc_rate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_pre_alc_rate_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_alc_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adj_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adj_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_sub_char3_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[dpt_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_alc_typ_NE(MCEventInfo info){
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
		else if (nx == Cnd_tgt_Group) doCnd_tgt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_ym_fr) doCnd_ym_fr_NX(info);
		else if (nx == Cnd_ym_to) doCnd_ym_to_NX(info);
		else if (nx == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_NX(info);
		else if (nx == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_oper_cd) doCnd_oper_cd_NX(info);
		else if (nx == Cnd_oper_nm) doCnd_oper_nm_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_ctg_cd) doCnd_ctg_cd_NX(info);
		else if (nx == Cnd_ctg_nm) doCnd_ctg_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_sno1) doCnd_sno1_NX(info);
		else if (nx == Cnd_sno2) doCnd_sno2_NX(info);
		else if (nx == Cnd_sno3) doCnd_sno3_NX(info);
		else if (nx == Cnd_sno4) doCnd_sno4_NX(info);
		else if (nx == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_po_no) doCnd_po_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_alc_ac_cd) doCnd_alc_ac_cd_NX(info);
		else if (nx == Cnd_alc_ac_nm) doCnd_alc_ac_nm_NX(info);
		else if (nx == Cnd_alc_ac_grp_cd1) doCnd_alc_ac_grp_cd1_NX(info);
		else if (nx == Cnd_alc_ac_grp_nm1) doCnd_alc_ac_grp_nm1_NX(info);
		else if (nx == Cnd_alc_ac_grp_cd2) doCnd_alc_ac_grp_cd2_NX(info);
		else if (nx == Cnd_alc_ac_grp_nm2) doCnd_alc_ac_grp_nm2_NX(info);
		else if (nx == Cnd_alc_ac_grp_cd3) doCnd_alc_ac_grp_cd3_NX(info);
		else if (nx == Cnd_alc_ac_grp_nm3) doCnd_alc_ac_grp_nm3_NX(info);
		else if (nx == Cnd_trd_wg_cd) doCnd_trd_wg_cd_NX(info);
		else if (nx == Cnd_trd_wg_nm) doCnd_trd_wg_nm_NX(info);
		else if (nx == Cnd_rmrks) doCnd_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == DelCnd_calc_ctg_cd) doDelCnd_calc_ctg_cd_NX(info);
		else if (nx == DelCnd_calc_ctg_nm) doDelCnd_calc_ctg_nm_NX(info);
		else if (nx == DelCnd_wg_cd) doDelCnd_wg_cd_NX(info);
		else if (nx == DelCnd_wg_nm) doDelCnd_wg_nm_NX(info);
		else if (nx == DelCnd_ym_fr) doDelCnd_ym_fr_NX(info);
		else if (nx == DelCnd_ym_to) doDelCnd_ym_to_NX(info);
		else if (nx == DelCnd_pre_alc_rate_cd) doDelCnd_pre_alc_rate_cd_NX(info);
		else if (nx == DelCnd_pre_alc_rate_nm) doDelCnd_pre_alc_rate_nm_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NX(info);
		else if (nx == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_ym) doRslt_ym_NX(info);
		else if (nx == columnRslt_pre_alc_rate_cd) doRslt_pre_alc_rate_cd_NX(info);
		else if (nx == columnRslt_pre_alc_rate_nm) doRslt_pre_alc_rate_nm_NX(info);
		else if (nx == columnRslt_pre_alc_ptn_cd) doRslt_pre_alc_ptn_cd_NX(info);
		else if (nx == columnRslt_pre_alc_ptn_nm) doRslt_pre_alc_ptn_nm_NX(info);
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
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
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
		else if (nx == columnRslt_pre_alc_rate) doRslt_pre_alc_rate_NX(info);
		else if (nx == columnRslt_adj_flg) doRslt_adj_flg_NX(info);
		else if (nx == columnRslt_term_rmrks) doRslt_term_rmrks_NX(info);
		else if (nx == columnRslt_term_sub_char1) doRslt_term_sub_char1_NX(info);
		else if (nx == columnRslt_term_sub_char2) doRslt_term_sub_char2_NX(info);
		else if (nx == columnRslt_term_sub_char3) doRslt_term_sub_char3_NX(info);
		else if (nx == columnRslt_mly_rmrks) doRslt_mly_rmrks_NX(info);
		else if (nx == columnRslt_mly_sub_char1) doRslt_mly_sub_char1_NX(info);
		else if (nx == columnRslt_mly_sub_char2) doRslt_mly_sub_char2_NX(info);
		else if (nx == columnRslt_mly_sub_char3) doRslt_mly_sub_char3_NX(info);
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
		else if (nx == columnRslt_dpt_alc_typ) doRslt_dpt_alc_typ_NX(info);
		else if (nx == columnRslt_loc_alc_typ) doRslt_loc_alc_typ_NX(info);
		else if (nx == columnRslt_oper_alc_typ) doRslt_oper_alc_typ_NX(info);
		else if (nx == columnRslt_bp_alc_typ) doRslt_bp_alc_typ_NX(info);
		else if (nx == columnRslt_ctg_alc_typ) doRslt_ctg_alc_typ_NX(info);
		else if (nx == columnRslt_itm_alc_typ) doRslt_itm_alc_typ_NX(info);
		else if (nx == columnRslt_lot_alc_typ) doRslt_lot_alc_typ_NX(info);
		else if (nx == columnRslt_sublot_alc_typ) doRslt_sublot_alc_typ_NX(info);
		else if (nx == columnRslt_sno1_alc_typ) doRslt_sno1_alc_typ_NX(info);
		else if (nx == columnRslt_sno2_alc_typ) doRslt_sno2_alc_typ_NX(info);
		else if (nx == columnRslt_sno3_alc_typ) doRslt_sno3_alc_typ_NX(info);
		else if (nx == columnRslt_sno4_alc_typ) doRslt_sno4_alc_typ_NX(info);
		else if (nx == columnRslt_inst_alc_typ) doRslt_inst_alc_typ_NX(info);
		else if (nx == columnRslt_iv_alc_typ) doRslt_iv_alc_typ_NX(info);
		else if (nx == columnRslt_po_alc_typ) doRslt_po_alc_typ_NX(info);
		else if (nx == columnRslt_slo_alc_typ) doRslt_slo_alc_typ_NX(info);
		else if (nx == columnRslt_alc_ac_alc_typ) doRslt_alc_ac_alc_typ_NX(info);
		else if (nx == columnRslt_wg_alc_typ) doRslt_wg_alc_typ_NX(info);
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
	 * [Cnd]パネルの[tgt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_wg_nm_NX(MCEventInfo info){
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
	 * [DelCnd]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[pre_alc_rate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_pre_alc_rate_cd_NX(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[pre_alc_rate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_pre_alc_rate_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_alc_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adj_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adj_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_sub_char3_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[dpt_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_alc_typ_NX(MCEventInfo info){
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
		else if (lc == Cnd_ym_fr) doCnd_ym_fr_LC(info);
		else if (lc == Cnd_ym_to) doCnd_ym_to_LC(info);
		else if (lc == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_LC(info);
		else if (lc == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_oper_cd) doCnd_oper_cd_LC(info);
		else if (lc == Cnd_oper_nm) doCnd_oper_nm_LC(info);
		else if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_ctg_cd) doCnd_ctg_cd_LC(info);
		else if (lc == Cnd_ctg_nm) doCnd_ctg_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_sno1) doCnd_sno1_LC(info);
		else if (lc == Cnd_sno2) doCnd_sno2_LC(info);
		else if (lc == Cnd_sno3) doCnd_sno3_LC(info);
		else if (lc == Cnd_sno4) doCnd_sno4_LC(info);
		else if (lc == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_po_no) doCnd_po_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_alc_ac_cd) doCnd_alc_ac_cd_LC(info);
		else if (lc == Cnd_alc_ac_nm) doCnd_alc_ac_nm_LC(info);
		else if (lc == Cnd_alc_ac_grp_cd1) doCnd_alc_ac_grp_cd1_LC(info);
		else if (lc == Cnd_alc_ac_grp_nm1) doCnd_alc_ac_grp_nm1_LC(info);
		else if (lc == Cnd_alc_ac_grp_cd2) doCnd_alc_ac_grp_cd2_LC(info);
		else if (lc == Cnd_alc_ac_grp_nm2) doCnd_alc_ac_grp_nm2_LC(info);
		else if (lc == Cnd_alc_ac_grp_cd3) doCnd_alc_ac_grp_cd3_LC(info);
		else if (lc == Cnd_alc_ac_grp_nm3) doCnd_alc_ac_grp_nm3_LC(info);
		else if (lc == Cnd_trd_wg_cd) doCnd_trd_wg_cd_LC(info);
		else if (lc == Cnd_trd_wg_nm) doCnd_trd_wg_nm_LC(info);
		else if (lc == Cnd_rmrks) doCnd_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == DelCnd_calc_ctg_cd) doDelCnd_calc_ctg_cd_LC(info);
		else if (lc == DelCnd_calc_ctg_nm) doDelCnd_calc_ctg_nm_LC(info);
		else if (lc == DelCnd_wg_cd) doDelCnd_wg_cd_LC(info);
		else if (lc == DelCnd_wg_nm) doDelCnd_wg_nm_LC(info);
		else if (lc == DelCnd_ym_fr) doDelCnd_ym_fr_LC(info);
		else if (lc == DelCnd_ym_to) doDelCnd_ym_to_LC(info);
		else if (lc == DelCnd_pre_alc_rate_cd) doDelCnd_pre_alc_rate_cd_LC(info);
		else if (lc == DelCnd_pre_alc_rate_nm) doDelCnd_pre_alc_rate_nm_LC(info);
		else if (lc == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_LC(info);
		else if (lc == columnRslt_calc_ctg_nm) doRslt_calc_ctg_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_ym) doRslt_ym_LC(info);
		else if (lc == columnRslt_pre_alc_rate_cd) doRslt_pre_alc_rate_cd_LC(info);
		else if (lc == columnRslt_pre_alc_rate_nm) doRslt_pre_alc_rate_nm_LC(info);
		else if (lc == columnRslt_pre_alc_ptn_cd) doRslt_pre_alc_ptn_cd_LC(info);
		else if (lc == columnRslt_pre_alc_ptn_nm) doRslt_pre_alc_ptn_nm_LC(info);
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
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
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
		else if (lc == columnRslt_pre_alc_rate) doRslt_pre_alc_rate_LC(info);
		else if (lc == columnRslt_term_rmrks) doRslt_term_rmrks_LC(info);
		else if (lc == columnRslt_term_sub_char1) doRslt_term_sub_char1_LC(info);
		else if (lc == columnRslt_term_sub_char2) doRslt_term_sub_char2_LC(info);
		else if (lc == columnRslt_term_sub_char3) doRslt_term_sub_char3_LC(info);
		else if (lc == columnRslt_mly_rmrks) doRslt_mly_rmrks_LC(info);
		else if (lc == columnRslt_mly_sub_char1) doRslt_mly_sub_char1_LC(info);
		else if (lc == columnRslt_mly_sub_char2) doRslt_mly_sub_char2_LC(info);
		else if (lc == columnRslt_mly_sub_char3) doRslt_mly_sub_char3_LC(info);
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
		else if (lc == columnRslt_dpt_alc_typ) doRslt_dpt_alc_typ_LC(info);
		else if (lc == columnRslt_loc_alc_typ) doRslt_loc_alc_typ_LC(info);
		else if (lc == columnRslt_oper_alc_typ) doRslt_oper_alc_typ_LC(info);
		else if (lc == columnRslt_bp_alc_typ) doRslt_bp_alc_typ_LC(info);
		else if (lc == columnRslt_ctg_alc_typ) doRslt_ctg_alc_typ_LC(info);
		else if (lc == columnRslt_itm_alc_typ) doRslt_itm_alc_typ_LC(info);
		else if (lc == columnRslt_lot_alc_typ) doRslt_lot_alc_typ_LC(info);
		else if (lc == columnRslt_sublot_alc_typ) doRslt_sublot_alc_typ_LC(info);
		else if (lc == columnRslt_sno1_alc_typ) doRslt_sno1_alc_typ_LC(info);
		else if (lc == columnRslt_sno2_alc_typ) doRslt_sno2_alc_typ_LC(info);
		else if (lc == columnRslt_sno3_alc_typ) doRslt_sno3_alc_typ_LC(info);
		else if (lc == columnRslt_sno4_alc_typ) doRslt_sno4_alc_typ_LC(info);
		else if (lc == columnRslt_inst_alc_typ) doRslt_inst_alc_typ_LC(info);
		else if (lc == columnRslt_iv_alc_typ) doRslt_iv_alc_typ_LC(info);
		else if (lc == columnRslt_po_alc_typ) doRslt_po_alc_typ_LC(info);
		else if (lc == columnRslt_slo_alc_typ) doRslt_slo_alc_typ_LC(info);
		else if (lc == columnRslt_alc_ac_alc_typ) doRslt_alc_ac_alc_typ_LC(info);
		else if (lc == columnRslt_wg_alc_typ) doRslt_wg_alc_typ_LC(info);
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
	 * [Cnd]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ac_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ac_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_wg_nm_LC(MCEventInfo info){
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
	 * [DelCnd]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[pre_alc_rate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_pre_alc_rate_cd_LC(MCEventInfo info){
	}

	/**
	 * [DelCnd]パネルの[pre_alc_rate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDelCnd_pre_alc_rate_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_ptn_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_alc_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[term_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_term_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mly_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mly_sub_char3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[dpt_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_alc_typ_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_pre_alc_rate_cd]の作成メソッド
	 */
	public MCList getCnd_pre_alc_rate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getPreAlcRateWithPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_oper_cd]の作成メソッド
	 */
	public MCList getCnd_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_cd]の作成メソッド
	 */
	public MCList getCnd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCtg(row, info);
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
	 * コンボ／リストのリスト[Cnd_alc_ac_cd]の作成メソッド
	 */
	public MCList getCnd_alc_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_ac_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_alc_ac_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_ac_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_alc_ac_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_ac_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_alc_ac_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_trd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[DelCnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getDelCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[DelCnd_wg_cd]の作成メソッド
	 */
	public MCList getDelCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[DelCnd_pre_alc_rate_cd]の作成メソッド
	 */
	public MCList getDelCnd_pre_alc_rate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getPreAlcRateWithPtn(row, info);
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
	 * コンボ／リストのリスト[columnRslt_pre_alc_rate_cd]の作成メソッド
	 */
	public MCList getRslt_pre_alc_rate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getPreAlcRateInPreAlcCtgWithPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_loc_cd]の作成メソッド
	 */
	public MCList getRslt_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_oper_cd]の作成メソッド
	 */
	public MCList getRslt_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_bp_cd]の作成メソッド
	 */
	public MCList getRslt_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ctg_cd]の作成メソッド
	 */
	public MCList getRslt_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCtg(row, info);
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
	 * コンボ／リストのリスト[columnRslt_alc_ac_cd]の作成メソッド
	 */
	public MCList getRslt_alc_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_trd_wg_cd]の作成メソッド
	 */
	public MCList getRslt_trd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBGL0130.Srch01")) {
			return new MG_MGBGL0130_Srch01Bridge();
		}
		if (id.equals("MG.MGBGL0130.Upd01")) {
			return new MG_MGBGL0130_Upd01Bridge();
		}
		if (id.equals("MG.MGBGL0130.Upd02")) {
			return new MG_MGBGL0130_Upd02Bridge();
		}
		if (id.equals("MG.MGBGL0130.Del01")) {
			return new MG_MGBGL0130_Del01Bridge();
		}
		if (id.equals("MG.MGBGL0130.Del02")) {
			return new MG_MGBGL0130_Del02Bridge();
		}
		if (id.equals("MG.MGBGL0130.Del03")) {
			return new MG_MGBGL0130_Del03Bridge();
		}
		if (id.equals("MG.MGBGL0130.Del04")) {
			return new MG_MGBGL0130_Del04Bridge();
		}
		if (id.equals("MG.MGBGL0130.Imp01")) {
			return new MG_MGBGL0130_Imp01Bridge();
		}
		if (id.equals("MG.MGBGL0130.Imp02")) {
			return new MG_MGBGL0130_Imp02Bridge();
		}
		if (id.equals("MG.MGBGL0130.Ins01")) {
			return new MG_MGBGL0130_Ins01Bridge();
		}
		if (id.equals("MG.MGBGL0130.Ins02")) {
			return new MG_MGBGL0130_Ins02Bridge();
		}
		if (id.equals("MG.MGBGL0130.Ins03")) {
			return new MG_MGBGL0130_Ins03Bridge();
		}
		if (id.equals("MG.MGBGL0130.Ins04")) {
			return new MG_MGBGL0130_Ins04Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBGL0130_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0130_Srch01;

		/** コンストラクタ */
		protected MG_MGBGL0130_Srch01Bridge() {
			p_MG_MGBGL0130_Srch01 = new MCParam(PDef.MG_MGBGL0130_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0130_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBG.MGBGP0130.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));

			p_MG_MGBGL0130_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0130_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0130_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0130_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0130_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBG.MGBGP0130.CndR up0() {
			return (mcframe.clientMGBG.MGBGP0130.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> down0() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBGL0130_Srch01.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBGL0130_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)p_MG_MGBGL0130_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBGL0130_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0130_Upd01;

		/** コンストラクタ */
		protected MG_MGBGL0130_Upd01Bridge() {
			p_MG_MGBGL0130_Upd01 = new MCParam(PDef.MG_MGBGL0130_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0130_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));

			p_MG_MGBGL0130_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0130_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0130_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0130_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0130_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> up0() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> down0() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBGL0130_Upd01.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBGL0130_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)p_MG_MGBGL0130_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBGL0130_Upd02]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0130_Upd02;

		/** コンストラクタ */
		protected MG_MGBGL0130_Upd02Bridge() {
			p_MG_MGBGL0130_Upd02 = new MCParam(PDef.MG_MGBGL0130_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0130_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
			param.addUpBlock(mcframe.clientMGBG.MGBGP0130.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));

			p_MG_MGBGL0130_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0130_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0130_Upd02.addUpBlock(getRsltL().shallowClone());
			p_MG_MGBGL0130_Upd02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0130_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0130_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> up0() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)up(0);
		}
		protected mcframe.clientMGBG.MGBGP0130.CndR up1() {
			return (mcframe.clientMGBG.MGBGP0130.CndR)up(1);
		}

		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> down0() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBGL0130_Upd02.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBGL0130_Upd02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)p_MG_MGBGL0130_Upd02.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBGL0130_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0130_Del01;

		/** コンストラクタ */
		protected MG_MGBGL0130_Del01Bridge() {
			p_MG_MGBGL0130_Del01 = new MCParam(PDef.MG_MGBGL0130_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0130_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));

			p_MG_MGBGL0130_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0130_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0130_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0130_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0130_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> up0() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> down0() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBGL0130_Del01.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBGL0130_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)p_MG_MGBGL0130_Del01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBGL0130_Del02]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Del02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0130_Del02;

		/** コンストラクタ */
		protected MG_MGBGL0130_Del02Bridge() {
			p_MG_MGBGL0130_Del02 = new MCParam(PDef.MG_MGBGL0130_Del02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0130_Del02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
			param.addUpBlock(mcframe.clientMGBG.MGBGP0130.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));

			p_MG_MGBGL0130_Del02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0130_Del02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0130_Del02.addUpBlock(getRsltL().shallowClone());
			p_MG_MGBGL0130_Del02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0130_Del02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0130_Del02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> up0() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)up(0);
		}
		protected mcframe.clientMGBG.MGBGP0130.CndR up1() {
			return (mcframe.clientMGBG.MGBGP0130.CndR)up(1);
		}

		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> down0() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBGL0130_Del02.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBGL0130_Del02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)p_MG_MGBGL0130_Del02.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBGL0130_Del03]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Del03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0130_Del03;

		/** コンストラクタ */
		protected MG_MGBGL0130_Del03Bridge() {
			p_MG_MGBGL0130_Del03 = new MCParam(PDef.MG_MGBGL0130_Del03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0130_Del03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBG.MGBGP0130.DelCndR.create());
			// Down

			p_MG_MGBGL0130_Del03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0130_Del03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0130_Del03.addUpBlock(getDelCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0130_Del03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0130_Del03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBG.MGBGP0130.DelCndR up0() {
			return (mcframe.clientMGBG.MGBGP0130.DelCndR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBGL0130_Del03;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDelCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBGL0130_Del04]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Del04Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0130_Del04;

		/** コンストラクタ */
		protected MG_MGBGL0130_Del04Bridge() {
			p_MG_MGBGL0130_Del04 = new MCParam(PDef.MG_MGBGL0130_Del04_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0130_Del04_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBG.MGBGP0130.DelCndR.create());
			param.addUpBlock(mcframe.clientMGBG.MGBGP0130.CndR.create());
			// Down

			p_MG_MGBGL0130_Del04 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0130_Del04.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0130_Del04.addUpBlock(getDelCndR());
			p_MG_MGBGL0130_Del04.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0130_Del04.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0130_Del04.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBG.MGBGP0130.DelCndR up0() {
			return (mcframe.clientMGBG.MGBGP0130.DelCndR)up(0);
		}
		protected mcframe.clientMGBG.MGBGP0130.CndR up1() {
			return (mcframe.clientMGBG.MGBGP0130.CndR)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBGL0130_Del04;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDelCndR());
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBGL0130_Imp01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0130_Imp01;

		/** コンストラクタ */
		protected MG_MGBGL0130_Imp01Bridge() {
			p_MG_MGBGL0130_Imp01 = new MCParam(PDef.MG_MGBGL0130_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0130_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));

			p_MG_MGBGL0130_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0130_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0130_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0130_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0130_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> up0() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> down0() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBGL0130_Imp01.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBGL0130_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)p_MG_MGBGL0130_Imp01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBGL0130_Imp02]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Imp02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0130_Imp02;

		/** コンストラクタ */
		protected MG_MGBGL0130_Imp02Bridge() {
			p_MG_MGBGL0130_Imp02 = new MCParam(PDef.MG_MGBGL0130_Imp02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0130_Imp02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
			param.addUpBlock(mcframe.clientMGBG.MGBGP0130.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));

			p_MG_MGBGL0130_Imp02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0130_Imp02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0130_Imp02.addUpBlock(getRsltL().shallowClone());
			p_MG_MGBGL0130_Imp02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0130_Imp02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0130_Imp02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> up0() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)up(0);
		}
		protected mcframe.clientMGBG.MGBGP0130.CndR up1() {
			return (mcframe.clientMGBG.MGBGP0130.CndR)up(1);
		}

		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> down0() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBGL0130_Imp02.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBGL0130_Imp02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)p_MG_MGBGL0130_Imp02.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBGL0130_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0130_Ins01;

		/** コンストラクタ */
		protected MG_MGBGL0130_Ins01Bridge() {
			p_MG_MGBGL0130_Ins01 = new MCParam(PDef.MG_MGBGL0130_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0130_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
			// Down

			p_MG_MGBGL0130_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0130_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0130_Ins01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0130_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0130_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> up0() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBGL0130_Ins01;
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
	/**
	 * [MG_MGBGL0130_Ins02]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Ins02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0130_Ins02;

		/** コンストラクタ */
		protected MG_MGBGL0130_Ins02Bridge() {
			p_MG_MGBGL0130_Ins02 = new MCParam(PDef.MG_MGBGL0130_Ins02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0130_Ins02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
			param.addUpBlock(mcframe.clientMGBG.MGBGP0130.CndR.create());
			// Down

			p_MG_MGBGL0130_Ins02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0130_Ins02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0130_Ins02.addUpBlock(getRsltL().shallowClone());
			p_MG_MGBGL0130_Ins02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0130_Ins02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0130_Ins02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> up0() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)up(0);
		}
		protected mcframe.clientMGBG.MGBGP0130.CndR up1() {
			return (mcframe.clientMGBG.MGBGP0130.CndR)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBGL0130_Ins02;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBGL0130_Ins03]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Ins03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0130_Ins03;

		/** コンストラクタ */
		protected MG_MGBGL0130_Ins03Bridge() {
			p_MG_MGBGL0130_Ins03 = new MCParam(PDef.MG_MGBGL0130_Ins03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0130_Ins03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBG.MGBGP0130.DelCndR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
			// Down

			p_MG_MGBGL0130_Ins03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0130_Ins03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0130_Ins03.addUpBlock(getDelCndR());
			p_MG_MGBGL0130_Ins03.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0130_Ins03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0130_Ins03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBG.MGBGP0130.DelCndR up0() {
			return (mcframe.clientMGBG.MGBGP0130.DelCndR)up(0);
		}
		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> up1() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBGL0130_Ins03;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDelCndR());
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBGL0130_Ins04]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0130_Ins04Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0130_Ins04;

		/** コンストラクタ */
		protected MG_MGBGL0130_Ins04Bridge() {
			p_MG_MGBGL0130_Ins04 = new MCParam(PDef.MG_MGBGL0130_Ins04_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0130_Ins04_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBG.MGBGP0130.DelCndR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBG.MGBGP0130.RsltR.class));
			param.addUpBlock(mcframe.clientMGBG.MGBGP0130.CndR.create());
			// Down

			p_MG_MGBGL0130_Ins04 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0130_Ins04.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0130_Ins04.addUpBlock(getDelCndR());
			p_MG_MGBGL0130_Ins04.addUpBlock(getRsltL().shallowClone());
			p_MG_MGBGL0130_Ins04.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0130_Ins04.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0130_Ins04.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBG.MGBGP0130.DelCndR up0() {
			return (mcframe.clientMGBG.MGBGP0130.DelCndR)up(0);
		}
		protected MCList<mcframe.clientMGBG.MGBGP0130.RsltR> up1() {
			return (MCList<mcframe.clientMGBG.MGBGP0130.RsltR>)up(1);
		}
		protected mcframe.clientMGBG.MGBGP0130.CndR up2() {
			return (mcframe.clientMGBG.MGBGP0130.CndR)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBGL0130_Ins04;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDelCndR());
			result.add(getRsltL());
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}