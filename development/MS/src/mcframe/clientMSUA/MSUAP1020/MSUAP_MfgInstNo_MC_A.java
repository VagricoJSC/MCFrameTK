package mcframe.clientMSUA.MSUAP1020;

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

/**
 * 画面"MSUAP_MfgInstNo"パネルクラスです。<p>
 *
 * 製造指図・実績viewから製造指図ＮＯに関連した情報を取得します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUAP_MfgInstNo_MC_A extends mcframe.clientMAUD.MAUDP0020.MAUDP_ISPanel{
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
	public static final String SUBMODULE_ID = "MSUA";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSUAP1020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Sts]ブロック関連のField定義
	public MCPanel StsPanel = null;
	public MCTitledBorder StsTitledBorder = null;
	// [Sts]ブロックの項目のField定義
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
	 * Save order 指図保存.<p>
	 *
	 */
	public MCCheckBox Cnd_sav_flg = null;
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public MCCheckBox Cnd_ord_flg = null;
	/**
	 * In process 着手中.<p>
	 *
	 */
	public MCCheckBox Cnd_stt_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_cmpl_flg = null;
	public MCLabel Cnd_mfg_inst_no_Label = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_inst_no = null;
	public MCLabel Cnd_div_seq_Label = null;
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumberComboBox Cnd_div_seq = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_mi_st_schd_dt_p_PPanel;
	public MCDateField Cnd_mi_st_schd_dt_fr;	// [Cnd]の[mi_st_schd_dt_p.ymd_fr]を[Cnd_mi_st_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_mi_st_schd_tm_fr;	// [Cnd]の[mi_st_schd_dt_p.hm_fr]を[Cnd_mi_st_schd_tm_fr]としてエイリアス定義。
	public MCDateField Cnd_mi_st_schd_dt_to;	// [Cnd]の[mi_st_schd_dt_p.ymd_to]を[Cnd_mi_st_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_mi_st_schd_tm_to;	// [Cnd]の[mi_st_schd_dt_p.hm_to]を[Cnd_mi_st_schd_tm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_mi_end_schd_dt_p_PPanel;
	public MCDateField Cnd_mi_end_schd_dt_fr;	// [Cnd]の[mi_end_schd_dt_p.ymd_fr]を[Cnd_mi_end_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_mi_end_schd_tm_fr;	// [Cnd]の[mi_end_schd_dt_p.hm_fr]を[Cnd_mi_end_schd_tm_fr]としてエイリアス定義。
	public MCDateField Cnd_mi_end_schd_dt_to;	// [Cnd]の[mi_end_schd_dt_p.ymd_to]を[Cnd_mi_end_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_mi_end_schd_tm_to;	// [Cnd]の[mi_end_schd_dt_p.hm_to]を[Cnd_mi_end_schd_tm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ma_st_act_dt_p_PPanel;
	public MCDateField Cnd_ma_st_act_dt_fr;	// [Cnd]の[ma_st_act_dt_p.ymd_fr]を[Cnd_ma_st_act_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ma_st_act_tm_fr;	// [Cnd]の[ma_st_act_dt_p.hm_fr]を[Cnd_ma_st_act_tm_fr]としてエイリアス定義。
	public MCDateField Cnd_ma_st_act_dt_to;	// [Cnd]の[ma_st_act_dt_p.ymd_to]を[Cnd_ma_st_act_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ma_st_act_tm_to;	// [Cnd]の[ma_st_act_dt_p.hm_to]を[Cnd_ma_st_act_tm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ma_end_act_dt_p_PPanel;
	public MCDateField Cnd_ma_end_act_dt_fr;	// [Cnd]の[ma_end_act_dt_p.ymd_fr]を[Cnd_ma_end_act_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ma_end_act_tm_fr;	// [Cnd]の[ma_end_act_dt_p.hm_fr]を[Cnd_ma_end_act_tm_fr]としてエイリアス定義。
	public MCDateField Cnd_ma_end_act_dt_to;	// [Cnd]の[ma_end_act_dt_p.ymd_to]を[Cnd_ma_end_act_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ma_end_act_tm_to;	// [Cnd]の[ma_end_act_dt_p.hm_to]を[Cnd_ma_end_act_tm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_mi_rqst_dlv_rqst_dt_p_PPanel;
	public MCDateField Cnd_mi_rqst_dlv_rqst_dt_fr;	// [Cnd]の[mi_rqst_dlv_rqst_dt_p.ymd_fr]を[Cnd_mi_rqst_dlv_rqst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_mi_rqst_dlv_rqst_tm_fr;	// [Cnd]の[mi_rqst_dlv_rqst_dt_p.hm_fr]を[Cnd_mi_rqst_dlv_rqst_tm_fr]としてエイリアス定義。
	public MCDateField Cnd_mi_rqst_dlv_rqst_dt_to;	// [Cnd]の[mi_rqst_dlv_rqst_dt_p.ymd_to]を[Cnd_mi_rqst_dlv_rqst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_mi_rqst_dlv_rqst_tm_to;	// [Cnd]の[mi_rqst_dlv_rqst_dt_p.hm_to]を[Cnd_mi_rqst_dlv_rqst_tm_to]としてエイリアス定義。
	public MCLabel Cnd_imi_mfg_mtd_typ_Label = null;
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_imi_mfg_mtd_typ = null;
	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public MCTextField Cnd_imi_mfg_mtd_typ_nm = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_nm;	// [Cnd]の[itm_typ_p.itm_typ_nm]を[Cnd_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_imi_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_imi_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_imi_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_imi_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_imi_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_imi_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_imi_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_imi_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_imi_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_imi_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_imi_lot_no_Label = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_imi_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_imi_sublot_no = null;
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_wrk_no_p_PPanel;
	public MCTextField Cnd_imi_sno1;	// [Cnd]の[sno_wrk_no_p.sno1]を[Cnd_imi_sno1]としてエイリアス定義。
	public MCTextField Cnd_imi_sno2;	// [Cnd]の[sno_wrk_no_p.sno2]を[Cnd_imi_sno2]としてエイリアス定義。
	public MCTextField Cnd_imi_sno3;	// [Cnd]の[sno_wrk_no_p.sno3]を[Cnd_imi_sno3]としてエイリアス定義。
	public MCTextField Cnd_imi_sno4;	// [Cnd]の[sno_wrk_no_p.sno4]を[Cnd_imi_sno4]としてエイリアス定義。
	public MCTextField Cnd_imi_wrk_no;	// [Cnd]の[sno_wrk_no_p.wrk_no]を[Cnd_imi_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_imi_wrk_nm;	// [Cnd]の[sno_wrk_no_p.wrk_nm]を[Cnd_imi_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_imi_mfg_loc_cd_Label = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_imi_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCTextField Cnd_imi_mfg_loc_nm = null;
	public MCLabel Cnd_imi_mfg_str_ln_cd_Label = null;
	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_imi_mfg_str_ln_cd = null;
	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_imi_mfg_str_ln_nm = null;
	public MCLabel Cnd_imi_sppl_cd_Label = null;
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_imi_sppl_cd = null;
	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public MCTextField Cnd_imi_sppl_nm = null;
	public MCLabel Cnd_mi_po_d_no_Label = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_mi_po_d_no = null;
	/**
	 * PO details No. required flg. 発注明細ＮＯ必須ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_mi_po_d_no_req_flg = null;
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
	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public MCButtonGroup Cnd_match_typ_Group = null;
	public MCRadioButton Cnd_match_typ_0 = null;
	public MCRadioButton Cnd_match_typ_1 = null;
	public MCRadioButton Cnd_match_typ_2 = null;
	public MCRadioButton Cnd_match_typ_3 = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [SrchBtn]ブロック関連のField定義
	public MCPanel SrchBtnPanel = null;
	// [SrchBtn]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSUA.MSUAP1020.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_inst_no = null;
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_div_seq = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_mi_rqst_dlv_rqst_p_PPanel;
	public MCColumnConfig columnRslt_mi_rqst_dlv_rqst_dt;// [Rslt]の[mi_rqst_dlv_rqst_p.ymd]を[columnRslt_mi_rqst_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_mi_rqst_dlv_rqst_hm;// [Rslt]の[mi_rqst_dlv_rqst_p.hm]を[columnRslt_mi_rqst_dlv_rqst_hm]としてエイリアス定義。
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mpr_mfg_sts_typ = null;
	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mpr_mfg_sts_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_imi_itm_p_PPanel;
	public MCColumnConfig columnRslt_imi_itm_cd;// [Rslt]の[imi_itm_p.itm_cd]を[columnRslt_imi_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_imi_itm_sub1;// [Rslt]の[imi_itm_p.itm_sub1]を[columnRslt_imi_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_imi_itm_sub2;// [Rslt]の[imi_itm_p.itm_sub2]を[columnRslt_imi_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_imi_itm_sub3;// [Rslt]の[imi_itm_p.itm_sub3]を[columnRslt_imi_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_imi_itm_nm;// [Rslt]の[imi_itm_p.itm_nm]を[columnRslt_imi_itm_nm]としてエイリアス定義。
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_imi_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_imi_sublot_no = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_imi_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_imi_sno1;// [Rslt]の[imi_sno_wrk_no_p.sno1]を[columnRslt_imi_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_imi_sno2;// [Rslt]の[imi_sno_wrk_no_p.sno2]を[columnRslt_imi_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_imi_sno3;// [Rslt]の[imi_sno_wrk_no_p.sno3]を[columnRslt_imi_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_imi_sno4;// [Rslt]の[imi_sno_wrk_no_p.sno4]を[columnRslt_imi_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_imi_wrk_no;// [Rslt]の[imi_sno_wrk_no_p.wrk_no]を[columnRslt_imi_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_imi_wrk_nm;// [Rslt]の[imi_sno_wrk_no_p.wrk_nm]を[columnRslt_imi_wrk_nm]としてエイリアス定義。
	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mi_base_unit_inst_qty = null;
	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ma_base_unit_yield_qty = null;
	/**
	 * Defective qty. 不良品数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ma_base_unit_dfct_qty = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_imi_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_imi_base_unit_nm = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_imi_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_imi_mfg_loc_nm = null;
	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_imi_mfg_str_ln_cd = null;
	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_imi_mfg_str_ln_nm = null;
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_imi_sppl_cd = null;
	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_imi_sppl_nm = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mi_po_d_no = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_mi_st_schd_dt_p_PPanel;
	public MCColumnConfig columnRslt_mi_st_schd_dt;// [Rslt]の[mi_st_schd_dt_p.ymd]を[columnRslt_mi_st_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_mi_st_schd_hm;// [Rslt]の[mi_st_schd_dt_p.hm]を[columnRslt_mi_st_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_mi_end_schd_dt_p_PPanel;
	public MCColumnConfig columnRslt_mi_end_schd_dt;// [Rslt]の[mi_end_schd_dt_p.ymd]を[columnRslt_mi_end_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_mi_end_schd_hm;// [Rslt]の[mi_end_schd_dt_p.hm]を[columnRslt_mi_end_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ma_st_act_dt_p_PPanel;
	public MCColumnConfig columnRslt_ma_st_act_dt;// [Rslt]の[ma_st_act_dt_p.ymd]を[columnRslt_ma_st_act_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ma_st_act_hm;// [Rslt]の[ma_st_act_dt_p.hm]を[columnRslt_ma_st_act_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ma_end_act_dt_p_PPanel;
	public MCColumnConfig columnRslt_ma_end_act_dt;// [Rslt]の[ma_end_act_dt_p.ymd]を[columnRslt_ma_end_act_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ma_end_act_hm;// [Rslt]の[ma_end_act_dt_p.hm]を[columnRslt_ma_end_act_hm]としてエイリアス定義。
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
	 * Accept 決定する.<p>
	 *
	 */
	public MCButton Btn_accept = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSUA.MSUAP1020.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSUA.MSUAP1020.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSUA.MSUAP1020.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1020.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSUA.MSUAP1020.CndR createCndR() {
		return mcframe.clientMSUA.MSUAP1020.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSUA.MSUAP1020.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1020.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSUA.MSUAP1020.RsltR createRsltR() {
		return mcframe.clientMSUA.MSUAP1020.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSUA.MSUAP1020.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSUA.MSUAP1020.RsltR.class);
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
		ret.add(StsPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(SrchBtnPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUAP_MfgInstNo_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUAP_MfgInstNo_MC_A(String name) {
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
		MSUAP_MfgInstNo_MC.jbCreateSts((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbCreateTop((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbCreateFold((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbCreateTab1((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbCreateTab2((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbCreateCnd((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbCreateCnd2((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbCreateSrchBtn((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbCreateCtrl((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbCreateRslt((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbCreateBtn((MSUAP_MfgInstNo)this);
	}

	/**
	 * [Sts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSts(MSUAP_MfgInstNo p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSUAP_MfgInstNo p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSUAP_MfgInstNo p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSUAP_MfgInstNo p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSUAP_MfgInstNo p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSUAP_MfgInstNo p) {
		p.Cnd_mi_st_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().mi_st_schd_dt_p());
		p.Cnd_mi_st_schd_dt_p_PPanel.setName("Cnd.mi_st_schd_dt_p");
		p.Cnd_mi_st_schd_dt_fr = p.Cnd_mi_st_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_mi_st_schd_dt_fr.addAliasName("Cnd.mi_st_schd_dt_fr", p);
		p.Cnd_mi_st_schd_tm_fr = p.Cnd_mi_st_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_mi_st_schd_tm_fr.addAliasName("Cnd.mi_st_schd_tm_fr", p);
		p.Cnd_mi_st_schd_dt_to = p.Cnd_mi_st_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_mi_st_schd_dt_to.addAliasName("Cnd.mi_st_schd_dt_to", p);
		p.Cnd_mi_st_schd_tm_to = p.Cnd_mi_st_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_mi_st_schd_tm_to.addAliasName("Cnd.mi_st_schd_tm_to", p);
		p.Cnd_mi_end_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().mi_end_schd_dt_p());
		p.Cnd_mi_end_schd_dt_p_PPanel.setName("Cnd.mi_end_schd_dt_p");
		p.Cnd_mi_end_schd_dt_fr = p.Cnd_mi_end_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_mi_end_schd_dt_fr.addAliasName("Cnd.mi_end_schd_dt_fr", p);
		p.Cnd_mi_end_schd_tm_fr = p.Cnd_mi_end_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_mi_end_schd_tm_fr.addAliasName("Cnd.mi_end_schd_tm_fr", p);
		p.Cnd_mi_end_schd_dt_to = p.Cnd_mi_end_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_mi_end_schd_dt_to.addAliasName("Cnd.mi_end_schd_dt_to", p);
		p.Cnd_mi_end_schd_tm_to = p.Cnd_mi_end_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_mi_end_schd_tm_to.addAliasName("Cnd.mi_end_schd_tm_to", p);
		p.Cnd_ma_st_act_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ma_st_act_dt_p());
		p.Cnd_ma_st_act_dt_p_PPanel.setName("Cnd.ma_st_act_dt_p");
		p.Cnd_ma_st_act_dt_fr = p.Cnd_ma_st_act_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ma_st_act_dt_fr.addAliasName("Cnd.ma_st_act_dt_fr", p);
		p.Cnd_ma_st_act_tm_fr = p.Cnd_ma_st_act_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ma_st_act_tm_fr.addAliasName("Cnd.ma_st_act_tm_fr", p);
		p.Cnd_ma_st_act_dt_to = p.Cnd_ma_st_act_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ma_st_act_dt_to.addAliasName("Cnd.ma_st_act_dt_to", p);
		p.Cnd_ma_st_act_tm_to = p.Cnd_ma_st_act_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ma_st_act_tm_to.addAliasName("Cnd.ma_st_act_tm_to", p);
		p.Cnd_ma_end_act_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ma_end_act_dt_p());
		p.Cnd_ma_end_act_dt_p_PPanel.setName("Cnd.ma_end_act_dt_p");
		p.Cnd_ma_end_act_dt_fr = p.Cnd_ma_end_act_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ma_end_act_dt_fr.addAliasName("Cnd.ma_end_act_dt_fr", p);
		p.Cnd_ma_end_act_tm_fr = p.Cnd_ma_end_act_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ma_end_act_tm_fr.addAliasName("Cnd.ma_end_act_tm_fr", p);
		p.Cnd_ma_end_act_dt_to = p.Cnd_ma_end_act_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ma_end_act_dt_to.addAliasName("Cnd.ma_end_act_dt_to", p);
		p.Cnd_ma_end_act_tm_to = p.Cnd_ma_end_act_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ma_end_act_tm_to.addAliasName("Cnd.ma_end_act_tm_to", p);
		p.Cnd_mi_rqst_dlv_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().mi_rqst_dlv_rqst_dt_p());
		p.Cnd_mi_rqst_dlv_rqst_dt_p_PPanel.setName("Cnd.mi_rqst_dlv_rqst_dt_p");
		p.Cnd_mi_rqst_dlv_rqst_dt_fr = p.Cnd_mi_rqst_dlv_rqst_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_mi_rqst_dlv_rqst_dt_fr.addAliasName("Cnd.mi_rqst_dlv_rqst_dt_fr", p);
		p.Cnd_mi_rqst_dlv_rqst_tm_fr = p.Cnd_mi_rqst_dlv_rqst_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_mi_rqst_dlv_rqst_tm_fr.addAliasName("Cnd.mi_rqst_dlv_rqst_tm_fr", p);
		p.Cnd_mi_rqst_dlv_rqst_dt_to = p.Cnd_mi_rqst_dlv_rqst_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_mi_rqst_dlv_rqst_dt_to.addAliasName("Cnd.mi_rqst_dlv_rqst_dt_to", p);
		p.Cnd_mi_rqst_dlv_rqst_tm_to = p.Cnd_mi_rqst_dlv_rqst_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_mi_rqst_dlv_rqst_tm_to.addAliasName("Cnd.mi_rqst_dlv_rqst_tm_to", p);
		p.Cnd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().itm_typ_p());
		p.Cnd_itm_typ_p_PPanel.setName("Cnd.itm_typ_p");
		p.Cnd_itm_typ = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_itm_typ.addAliasName("Cnd.itm_typ", p);
		p.Cnd_itm_typ_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_nm;
		p.Cnd_itm_typ_nm.addAliasName("Cnd.itm_typ_nm", p);
		p.Cnd_itm_typ_d_cd = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_itm_typ_d_cd.addAliasName("Cnd.itm_typ_d_cd", p);
		p.Cnd_itm_typ_d_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Cnd_itm_typ_d_nm.addAliasName("Cnd.itm_typ_d_nm", p);
		p.Cnd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm_p());
		p.Cnd_itm_p_PPanel.setName("Cnd.itm_p");
		p.Cnd_imi_itm_cd = p.Cnd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_imi_itm_cd.addAliasName("Cnd.imi_itm_cd", p);
		p.Cnd_imi_itm_sub1 = p.Cnd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_imi_itm_sub1.addAliasName("Cnd.imi_itm_sub1", p);
		p.Cnd_imi_itm_sub2 = p.Cnd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_imi_itm_sub2.addAliasName("Cnd.imi_itm_sub2", p);
		p.Cnd_imi_itm_sub3 = p.Cnd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_imi_itm_sub3.addAliasName("Cnd.imi_itm_sub3", p);
		p.Cnd_imi_itm_nm = p.Cnd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_imi_itm_nm.addAliasName("Cnd.imi_itm_nm", p);
		p.Cnd_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.create(p.getCndR().sno_wrk_no_p());
		p.Cnd_sno_wrk_no_p_PPanel.setName("Cnd.sno_wrk_no_p");
		p.Cnd_imi_sno1 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno1;
		p.Cnd_imi_sno1.addAliasName("Cnd.imi_sno1", p);
		p.Cnd_imi_sno2 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno2;
		p.Cnd_imi_sno2.addAliasName("Cnd.imi_sno2", p);
		p.Cnd_imi_sno3 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno3;
		p.Cnd_imi_sno3.addAliasName("Cnd.imi_sno3", p);
		p.Cnd_imi_sno4 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno4;
		p.Cnd_imi_sno4.addAliasName("Cnd.imi_sno4", p);
		p.Cnd_imi_wrk_no = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no;
		p.Cnd_imi_wrk_no.addAliasName("Cnd.imi_wrk_no", p);
		p.Cnd_imi_wrk_nm = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm;
		p.Cnd_imi_wrk_nm.addAliasName("Cnd.imi_wrk_nm", p);
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
	protected static void jbCreateCnd2(MSUAP_MfgInstNo p) {
	}

	/**
	 * [SrchBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn(MSUAP_MfgInstNo p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSUAP_MfgInstNo p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSUAP_MfgInstNo p) {
		p.Rslt_mi_rqst_dlv_rqst_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSUA.MSUAP1020.RsltR.$mi_rqst_dlv_rqst_p);
		p.Rslt_mi_rqst_dlv_rqst_p_PPanel.setName("Rslt.mi_rqst_dlv_rqst_p");
		p.columnRslt_mi_rqst_dlv_rqst_dt = p.Rslt_mi_rqst_dlv_rqst_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_mi_rqst_dlv_rqst_dt.addAliasName("Rslt.mi_rqst_dlv_rqst_dt", p);
		p.columnRslt_mi_rqst_dlv_rqst_hm = p.Rslt_mi_rqst_dlv_rqst_p_PPanel.columnYmdHm_hm;
		p.columnRslt_mi_rqst_dlv_rqst_hm.addAliasName("Rslt.mi_rqst_dlv_rqst_hm", p);
		p.Rslt_imi_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSUA.MSUAP1020.RsltR.$imi_itm_p);
		p.Rslt_imi_itm_p_PPanel.setName("Rslt.imi_itm_p");
		p.columnRslt_imi_itm_cd = p.Rslt_imi_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_imi_itm_cd.addAliasName("Rslt.imi_itm_cd", p);
		p.columnRslt_imi_itm_sub1 = p.Rslt_imi_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_imi_itm_sub1.addAliasName("Rslt.imi_itm_sub1", p);
		p.columnRslt_imi_itm_sub2 = p.Rslt_imi_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_imi_itm_sub2.addAliasName("Rslt.imi_itm_sub2", p);
		p.columnRslt_imi_itm_sub3 = p.Rslt_imi_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_imi_itm_sub3.addAliasName("Rslt.imi_itm_sub3", p);
		p.columnRslt_imi_itm_nm = p.Rslt_imi_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_imi_itm_nm.addAliasName("Rslt.imi_itm_nm", p);
		p.Rslt_imi_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSUA.MSUAP1020.RsltR.$imi_sno_wrk_no_p);
		p.Rslt_imi_sno_wrk_no_p_PPanel.setName("Rslt.imi_sno_wrk_no_p");
		p.columnRslt_imi_sno1 = p.Rslt_imi_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_imi_sno1.addAliasName("Rslt.imi_sno1", p);
		p.columnRslt_imi_sno2 = p.Rslt_imi_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_imi_sno2.addAliasName("Rslt.imi_sno2", p);
		p.columnRslt_imi_sno3 = p.Rslt_imi_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_imi_sno3.addAliasName("Rslt.imi_sno3", p);
		p.columnRslt_imi_sno4 = p.Rslt_imi_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_imi_sno4.addAliasName("Rslt.imi_sno4", p);
		p.columnRslt_imi_wrk_no = p.Rslt_imi_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_imi_wrk_no.addAliasName("Rslt.imi_wrk_no", p);
		p.columnRslt_imi_wrk_nm = p.Rslt_imi_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_imi_wrk_nm.addAliasName("Rslt.imi_wrk_nm", p);
		p.Rslt_mi_st_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSUA.MSUAP1020.RsltR.$mi_st_schd_dt_p);
		p.Rslt_mi_st_schd_dt_p_PPanel.setName("Rslt.mi_st_schd_dt_p");
		p.columnRslt_mi_st_schd_dt = p.Rslt_mi_st_schd_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_mi_st_schd_dt.addAliasName("Rslt.mi_st_schd_dt", p);
		p.columnRslt_mi_st_schd_hm = p.Rslt_mi_st_schd_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_mi_st_schd_hm.addAliasName("Rslt.mi_st_schd_hm", p);
		p.Rslt_mi_end_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSUA.MSUAP1020.RsltR.$mi_end_schd_dt_p);
		p.Rslt_mi_end_schd_dt_p_PPanel.setName("Rslt.mi_end_schd_dt_p");
		p.columnRslt_mi_end_schd_dt = p.Rslt_mi_end_schd_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_mi_end_schd_dt.addAliasName("Rslt.mi_end_schd_dt", p);
		p.columnRslt_mi_end_schd_hm = p.Rslt_mi_end_schd_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_mi_end_schd_hm.addAliasName("Rslt.mi_end_schd_hm", p);
		p.Rslt_ma_st_act_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSUA.MSUAP1020.RsltR.$ma_st_act_dt_p);
		p.Rslt_ma_st_act_dt_p_PPanel.setName("Rslt.ma_st_act_dt_p");
		p.columnRslt_ma_st_act_dt = p.Rslt_ma_st_act_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ma_st_act_dt.addAliasName("Rslt.ma_st_act_dt", p);
		p.columnRslt_ma_st_act_hm = p.Rslt_ma_st_act_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ma_st_act_hm.addAliasName("Rslt.ma_st_act_hm", p);
		p.Rslt_ma_end_act_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSUA.MSUAP1020.RsltR.$ma_end_act_dt_p);
		p.Rslt_ma_end_act_dt_p_PPanel.setName("Rslt.ma_end_act_dt_p");
		p.columnRslt_ma_end_act_dt = p.Rslt_ma_end_act_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ma_end_act_dt.addAliasName("Rslt.ma_end_act_dt", p);
		p.columnRslt_ma_end_act_hm = p.Rslt_ma_end_act_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ma_end_act_hm.addAliasName("Rslt.ma_end_act_hm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSUAP_MfgInstNo p) {
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

	
	/** [Cnd_div_seq_ListPutter]の定義 */
	private MCListPutter Cnd_div_seq_p = null;

	/**
	 * [Cnd_div_seq_ListPutter]の取得
	 */
	protected MCListPutter getCnd_div_seq_ListPutter() {
		if (Cnd_div_seq_p == null) {
			Cnd_div_seq_p = createCnd_div_seq_ListPutter(Cnd_div_seq, "div_seq");

		}
		return Cnd_div_seq_p;
	}
	
	
	/** [Cnd_imi_mfg_mtd_typ_ListPutter]の定義 */
	private MCListPutter Cnd_imi_mfg_mtd_typ_p = null;

	/**
	 * [Cnd_imi_mfg_mtd_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_imi_mfg_mtd_typ_ListPutter() {
		if (Cnd_imi_mfg_mtd_typ_p == null) {
			Cnd_imi_mfg_mtd_typ_p = createCnd_imi_mfg_mtd_typ_ListPutter(Cnd_imi_mfg_mtd_typ, "imi_mfg_mtd_typ", "imi_mfg_mtd_typ_nm");

		}
		return Cnd_imi_mfg_mtd_typ_p;
	}
	
	
	/** [Cnd_imi_lot_no_ListPutter]の定義 */
	private MCListPutter Cnd_imi_lot_no_p = null;

	/**
	 * [Cnd_imi_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_imi_lot_no_ListPutter() {
		if (Cnd_imi_lot_no_p == null) {
			Cnd_imi_lot_no_p = createCnd_imi_lot_no_ListPutter(Cnd_imi_lot_no, "imi_lot_no");

		}
		return Cnd_imi_lot_no_p;
	}
	
	
	/** [Cnd_imi_sublot_no_ListPutter]の定義 */
	private MCListPutter Cnd_imi_sublot_no_p = null;

	/**
	 * [Cnd_imi_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_imi_sublot_no_ListPutter() {
		if (Cnd_imi_sublot_no_p == null) {
			Cnd_imi_sublot_no_p = createCnd_imi_sublot_no_ListPutter(Cnd_imi_sublot_no, "imi_sublot_no");

		}
		return Cnd_imi_sublot_no_p;
	}
	
	
	/** [Cnd_imi_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_imi_mfg_loc_cd_p = null;

	/**
	 * [Cnd_imi_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_imi_mfg_loc_cd_ListPutter() {
		if (Cnd_imi_mfg_loc_cd_p == null) {
			Cnd_imi_mfg_loc_cd_p = createCnd_imi_mfg_loc_cd_ListPutter(Cnd_imi_mfg_loc_cd, "imi_mfg_loc_cd", "imi_mfg_loc_nm");

		}
		return Cnd_imi_mfg_loc_cd_p;
	}
	
	
	/** [Cnd_imi_mfg_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_imi_mfg_str_ln_cd_p = null;

	/**
	 * [Cnd_imi_mfg_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_imi_mfg_str_ln_cd_ListPutter() {
		if (Cnd_imi_mfg_str_ln_cd_p == null) {
			Cnd_imi_mfg_str_ln_cd_p = createCnd_imi_mfg_str_ln_cd_ListPutter(Cnd_imi_mfg_str_ln_cd, "imi_mfg_str_ln_cd", "imi_mfg_str_ln_nm");

		}
		return Cnd_imi_mfg_str_ln_cd_p;
	}
	
	
	/** [Cnd_imi_sppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_imi_sppl_cd_p = null;

	/**
	 * [Cnd_imi_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_imi_sppl_cd_ListPutter() {
		if (Cnd_imi_sppl_cd_p == null) {
			Cnd_imi_sppl_cd_p = createCnd_imi_sppl_cd_ListPutter(Cnd_imi_sppl_cd, "imi_sppl_cd", "imi_sppl_nm");

		}
		return Cnd_imi_sppl_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_MfgInstNo create(){
		MSUAP_MfgInstNo p = new MSUAP_MfgInstNo();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSUAP_MfgInstNo create(String name){
		MSUAP_MfgInstNo p = new MSUAP_MfgInstNo(name);
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
		MSUAP_MfgInstNo_MC.jbfInitSts((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbfInitTop((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbfInitFold((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbfInitTab1((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbfInitTab2((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbfInitCnd((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbfInitCnd2((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbfInitSrchBtn((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbfInitCtrl((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbfInitRslt((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbfInitBtn((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbInitSts((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbInitTop((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbInitFold((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbInitTab1((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbInitTab2((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbInitCnd((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbInitCnd2((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbInitSrchBtn((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbInitCtrl((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbInitRslt((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.jbInitBtn((MSUAP_MfgInstNo)this);
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSts(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.StsPanel = p.beansFactory.createPanel("Sts");
		p.StsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSUAP_MfgInstNo p) {
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
	protected static void jbfInitTab1(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_sav_flg = p.beansFactory.createCheckBox("Cnd.sav_flg");
		p.Cnd_ord_flg = p.beansFactory.createCheckBox("Cnd.ord_flg");
		p.Cnd_stt_flg = p.beansFactory.createCheckBox("Cnd.stt_flg");
		p.Cnd_cmpl_flg = p.beansFactory.createCheckBox("Cnd.cmpl_flg");
		p.Cnd_mfg_inst_no_Label = p.beansFactory.createLabel("Cnd.mfg_inst_no_Label");
		p.Cnd_mfg_inst_no = p.beansFactory.createTextField("Cnd.mfg_inst_no");
		p.Cnd_mfg_inst_no.setLabel(p.Cnd_mfg_inst_no_Label);
		p.Cnd_div_seq_Label = p.beansFactory.createLabel("Cnd.div_seq_Label");
		p.Cnd_div_seq = p.beansFactory.createNumberComboBox("Cnd.div_seq");
		p.Cnd_div_seq.setLabel(p.Cnd_div_seq_Label);
		p.Cnd_imi_mfg_mtd_typ_Label = p.beansFactory.createLabel("Cnd.imi_mfg_mtd_typ_Label");
		p.Cnd_imi_mfg_mtd_typ = p.beansFactory.createTextComboBox("Cnd.imi_mfg_mtd_typ");
		p.Cnd_imi_mfg_mtd_typ.setLabel(p.Cnd_imi_mfg_mtd_typ_Label);
		p.Cnd_imi_mfg_mtd_typ_nm = p.beansFactory.createTextField("Cnd.imi_mfg_mtd_typ_nm");
		p.Cnd_imi_lot_no_Label = p.beansFactory.createLabel("Cnd.imi_lot_no_Label");
		p.Cnd_imi_lot_no = p.beansFactory.createTextField("Cnd.imi_lot_no");
		p.Cnd_imi_lot_no.setLabel(p.Cnd_imi_lot_no_Label);
		p.Cnd_imi_sublot_no = p.beansFactory.createTextField("Cnd.imi_sublot_no");
		p.Cnd_imi_mfg_loc_cd_Label = p.beansFactory.createLabel("Cnd.imi_mfg_loc_cd_Label");
		p.Cnd_imi_mfg_loc_cd = p.beansFactory.createTextField("Cnd.imi_mfg_loc_cd");
		p.Cnd_imi_mfg_loc_cd.setLabel(p.Cnd_imi_mfg_loc_cd_Label);
		p.Cnd_imi_mfg_loc_nm = p.beansFactory.createTextField("Cnd.imi_mfg_loc_nm");
		p.Cnd_imi_mfg_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.imi_mfg_str_ln_cd_Label");
		p.Cnd_imi_mfg_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.imi_mfg_str_ln_cd");
		p.Cnd_imi_mfg_str_ln_cd.setLabel(p.Cnd_imi_mfg_str_ln_cd_Label);
		p.Cnd_imi_mfg_str_ln_nm = p.beansFactory.createTextField("Cnd.imi_mfg_str_ln_nm");
		p.Cnd_imi_sppl_cd_Label = p.beansFactory.createLabel("Cnd.imi_sppl_cd_Label");
		p.Cnd_imi_sppl_cd = p.beansFactory.createTextField("Cnd.imi_sppl_cd");
		p.Cnd_imi_sppl_cd.setLabel(p.Cnd_imi_sppl_cd_Label);
		p.Cnd_imi_sppl_nm = p.beansFactory.createTextField("Cnd.imi_sppl_nm");
		p.Cnd_mi_po_d_no_Label = p.beansFactory.createLabel("Cnd.mi_po_d_no_Label");
		p.Cnd_mi_po_d_no = p.beansFactory.createTextField("Cnd.mi_po_d_no");
		p.Cnd_mi_po_d_no.setLabel(p.Cnd_mi_po_d_no_Label);
		p.Cnd_mi_po_d_no_req_flg = p.beansFactory.createCheckBox("Cnd.mi_po_d_no_req_flg");
		p.Cnd_match_typ_Group = p.beansFactory.createButtonGroup("Cnd.match_typ");
		p.Cnd_match_typ_0 = p.beansFactory.createRadioButton("Cnd.match_typ_0");
		p.Cnd_match_typ_1 = p.beansFactory.createRadioButton("Cnd.match_typ_1");
		p.Cnd_match_typ_2 = p.beansFactory.createRadioButton("Cnd.match_typ_2");
		p.Cnd_match_typ_3 = p.beansFactory.createRadioButton("Cnd.match_typ_3");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.SrchBtnPanel = p.beansFactory.createPanel("SrchBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_mfg_inst_no = p.beansFactory.createTableColumn("Rslt.mfg_inst_no", MCColumnType.TEXT);
		p.columnRslt_div_seq = p.beansFactory.createTableColumn("Rslt.div_seq", MCColumnType.NUMBER);
		p.columnRslt_mpr_mfg_sts_typ = p.beansFactory.createTableColumn("Rslt.mpr_mfg_sts_typ", MCColumnType.TEXT);
		p.columnRslt_mpr_mfg_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.mpr_mfg_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_imi_lot_no = p.beansFactory.createTableColumn("Rslt.imi_lot_no", MCColumnType.TEXT);
		p.columnRslt_imi_sublot_no = p.beansFactory.createTableColumn("Rslt.imi_sublot_no", MCColumnType.TEXT);
		p.columnRslt_mi_base_unit_inst_qty = p.beansFactory.createTableColumn("Rslt.mi_base_unit_inst_qty", MCColumnType.NUMBER);
		p.columnRslt_ma_base_unit_yield_qty = p.beansFactory.createTableColumn("Rslt.ma_base_unit_yield_qty", MCColumnType.NUMBER);
		p.columnRslt_ma_base_unit_dfct_qty = p.beansFactory.createTableColumn("Rslt.ma_base_unit_dfct_qty", MCColumnType.NUMBER);
		p.columnRslt_imi_base_unit_cd = p.beansFactory.createTableColumn("Rslt.imi_base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_imi_base_unit_nm = p.beansFactory.createTableColumn("Rslt.imi_base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_imi_mfg_loc_cd = p.beansFactory.createTableColumn("Rslt.imi_mfg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_imi_mfg_loc_nm = p.beansFactory.createTableColumn("Rslt.imi_mfg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_imi_mfg_str_ln_cd = p.beansFactory.createTableColumn("Rslt.imi_mfg_str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_imi_mfg_str_ln_nm = p.beansFactory.createTableColumn("Rslt.imi_mfg_str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_imi_sppl_cd = p.beansFactory.createTableColumn("Rslt.imi_sppl_cd", MCColumnType.TEXT);
		p.columnRslt_imi_sppl_nm = p.beansFactory.createTableColumn("Rslt.imi_sppl_nm", MCColumnType.TEXT);
		p.columnRslt_mi_po_d_no = p.beansFactory.createTableColumn("Rslt.mi_po_d_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_accept = p.beansFactory.createButton("Btn.accept", "upd");
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSts(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.StsPanel.setBorder(p.StsTitledBorder);
		p.add(p.StsPanel);
		p.setLastBeans(p.StsPanel);
		p.StsPanel.setNextBeans(p.TopPanel);
		p.StsPanel.setValueCheck(false);
		p.StsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.StsPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSUAP_MfgInstNo p) {
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
		p.FoldPanel.setNextBeans(p.SrchBtnPanel);
		p.TopPanel.add(p.SrchBtnPanel, null);
		p.SrchBtnPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSUAP_MfgInstNo p) {
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
	protected static void jbInitTab1(MSUAP_MfgInstNo p) {
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
	protected static void jbInitTab2(MSUAP_MfgInstNo p) {
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
	protected static void jbInitCnd(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.StsPanel.add(p.Cnd_sav_flg);
		p.StsPanel.setLastBeans(p.Cnd_sav_flg);
		p.Cnd_sav_flg.setNextBeans(p.Cnd_ord_flg);
		p.Cnd_sav_flg.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.sav_flg_META);
		p.StsPanel.add(p.Cnd_ord_flg);
		p.Cnd_ord_flg.setNextBeans(p.Cnd_stt_flg);
		p.Cnd_ord_flg.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.ord_flg_META);
		p.StsPanel.add(p.Cnd_stt_flg);
		p.Cnd_stt_flg.setNextBeans(p.Cnd_cmpl_flg);
		p.Cnd_stt_flg.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.stt_flg_META);
		p.StsPanel.add(p.Cnd_cmpl_flg);
		p.Cnd_cmpl_flg.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.cmpl_flg_META);
		p.CndPanel.add(p.Cnd_mfg_inst_no_Label);
		p.CndPanel.add(p.Cnd_mfg_inst_no);
		p.CndPanel.setLastBeans(p.Cnd_mfg_inst_no);
		p.Cnd_mfg_inst_no.setNextBeans(p.Cnd_div_seq);
		p.Cnd_mfg_inst_no.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.mfg_inst_no_META);
		p.setPluralValueEnable(p.Cnd_mfg_inst_no, true);
		p.Cnd_div_seq.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_div_seq_Label);
		p.CndPanel.add(p.Cnd_div_seq);
		p.Cnd_div_seq.setNextBeans(p.Cnd_mi_st_schd_dt_p_PPanel);
		p.Cnd_div_seq.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.div_seq_META);
		p.CndPanel.add(p.Cnd_mi_st_schd_dt_p_PPanel);
		p.Cnd_mi_st_schd_dt_p_PPanel.setNextBeans(p.Cnd_mi_end_schd_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_mi_end_schd_dt_p_PPanel);
		p.Cnd_mi_end_schd_dt_p_PPanel.setNextBeans(p.Cnd_ma_st_act_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_ma_st_act_dt_p_PPanel);
		p.Cnd_ma_st_act_dt_p_PPanel.setNextBeans(p.Cnd_ma_end_act_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_ma_end_act_dt_p_PPanel);
		p.Cnd_ma_end_act_dt_p_PPanel.setNextBeans(p.Cnd_mi_rqst_dlv_rqst_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_mi_rqst_dlv_rqst_dt_p_PPanel);
		p.Cnd_mi_rqst_dlv_rqst_dt_p_PPanel.setNextBeans(p.Cnd_imi_mfg_mtd_typ);
		p.Cnd_imi_mfg_mtd_typ.setListType(MCListType.STRICT);
		p.Cnd_imi_mfg_mtd_typ.setLinkBeans(p.Cnd_imi_mfg_mtd_typ_nm);
		p.CndPanel.add(p.Cnd_imi_mfg_mtd_typ_Label);
		p.CndPanel.add(p.Cnd_imi_mfg_mtd_typ);
		p.Cnd_imi_mfg_mtd_typ.setNextBeans(p.Cnd_imi_mfg_mtd_typ_nm);
		p.Cnd_imi_mfg_mtd_typ.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.imi_mfg_mtd_typ_META);
		p.CndPanel.add(p.Cnd_imi_mfg_mtd_typ_nm);
		p.Cnd_imi_mfg_mtd_typ_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_imi_mfg_mtd_typ_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.imi_mfg_mtd_typ_nm_META);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_imi_lot_no);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_imi_lot_no_Label);
		p.CndPanel.add(p.Cnd_imi_lot_no);
		p.Cnd_imi_lot_no.setNextBeans(p.Cnd_imi_sublot_no);
		p.Cnd_imi_lot_no.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.imi_lot_no_META);
		p.Cnd_imi_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_imi_lot_no, true);
		p.CndPanel.add(p.Cnd_imi_sublot_no);
		p.Cnd_imi_sublot_no.setNextBeans(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_imi_sublot_no.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.imi_sublot_no_META);
		p.Cnd_imi_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_imi_sublot_no, true);
		p.CndPanel.add(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_sno_wrk_no_p_PPanel.setNextBeans(p.Cnd_imi_mfg_loc_cd);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_imi_mfg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_imi_mfg_loc_cd);
		p.Cnd_imi_mfg_loc_cd.setNextBeans(p.Cnd_imi_mfg_loc_nm);
		p.Cnd_imi_mfg_loc_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.imi_mfg_loc_cd_META);
		p.Cnd_imi_mfg_loc_cd.addLinkBeans(p.Cnd_imi_mfg_loc_nm);
		p.Cnd_imi_mfg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_imi_mfg_loc_cd, true);
		p.CndPanel.add(p.Cnd_imi_mfg_loc_nm);
		p.Cnd_imi_mfg_loc_nm.setNextBeans(p.Cnd_imi_mfg_str_ln_cd);
		p.Cnd_imi_mfg_loc_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.imi_mfg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_imi_mfg_loc_nm, true);
		p.Cnd_imi_mfg_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_imi_mfg_str_ln_cd, true);
		p.Cnd_imi_mfg_str_ln_cd.setLinkBeans(p.Cnd_imi_mfg_str_ln_nm);
		p.CndPanel.add(p.Cnd_imi_mfg_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_imi_mfg_str_ln_cd);
		p.Cnd_imi_mfg_str_ln_cd.setNextBeans(p.Cnd_imi_mfg_str_ln_nm);
		p.Cnd_imi_mfg_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.imi_mfg_str_ln_cd_META);
		p.CndPanel.add(p.Cnd_imi_mfg_str_ln_nm);
		p.Cnd_imi_mfg_str_ln_nm.setNextBeans(p.Cnd_imi_sppl_cd);
		p.Cnd_imi_mfg_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.imi_mfg_str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_imi_mfg_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_imi_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_imi_sppl_cd);
		p.Cnd_imi_sppl_cd.setNextBeans(p.Cnd_imi_sppl_nm);
		p.Cnd_imi_sppl_cd.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.imi_sppl_cd_META);
		p.Cnd_imi_sppl_cd.addLinkBeans(p.Cnd_imi_sppl_nm);
		p.Cnd_imi_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_imi_sppl_cd, true);
		p.CndPanel.add(p.Cnd_imi_sppl_nm);
		p.Cnd_imi_sppl_nm.setNextBeans(p.Cnd_mi_po_d_no);
		p.Cnd_imi_sppl_nm.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.imi_sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_imi_sppl_nm, true);
		p.CndPanel.add(p.Cnd_mi_po_d_no_Label);
		p.CndPanel.add(p.Cnd_mi_po_d_no);
		p.Cnd_mi_po_d_no.setNextBeans(p.Cnd_mi_po_d_no_req_flg);
		p.Cnd_mi_po_d_no.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.mi_po_d_no_META);
		p.setPluralValueEnable(p.Cnd_mi_po_d_no, true);
		p.CndPanel.add(p.Cnd_mi_po_d_no_req_flg);
		p.Cnd_mi_po_d_no_req_flg.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.mi_po_d_no_req_flg_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
		p.SrchBtnPanel.setLastBeans(p.Cnd_match_typ_Group);
		p.Cnd_match_typ_Group.setFirstBeans(p.Cnd_match_typ_0);
		p.Cnd_match_typ_0.setActionCommand("0");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_0);
		p.SrchBtnPanel.add(p.Cnd_match_typ_0);
		p.Cnd_match_typ_0.setNextBeans(p.Cnd_match_typ_1);
		p.Cnd_match_typ_1.setActionCommand("1");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_1);
		p.SrchBtnPanel.add(p.Cnd_match_typ_1);
		p.Cnd_match_typ_1.setNextBeans(p.Cnd_match_typ_2);
		p.Cnd_match_typ_2.setActionCommand("2");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_2);
		p.SrchBtnPanel.add(p.Cnd_match_typ_2);
		p.Cnd_match_typ_2.setNextBeans(p.Cnd_match_typ_3);
		p.Cnd_match_typ_3.setActionCommand("3");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_3);
		p.SrchBtnPanel.add(p.Cnd_match_typ_3);
		p.Cnd_match_typ_Group.setRow(p.getCndR(), mcframe.clientMSUA.MSUAP1020.CndR.match_typ_META);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.SrchBtnPanel.setLayoutPosition("SEC");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SEE");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setValueCheck(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSUAP_MfgInstNo p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_accept);
		p.Btn_accept.setIcon("REGISTER");
		p.Btn_accept.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_accept);
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
		MSUAP_MfgInstNo_MC.mcInitSts((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.mcInitTop((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.mcInitFold((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.mcInitTab1((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.mcInitTab2((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.mcInitCnd((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.mcInitCnd2((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.mcInitSrchBtn((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.mcInitCtrl((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.mcInitRslt((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.mcInitBtn((MSUAP_MfgInstNo)this);

		// [SRCH]ステータスのモードの設定
		MSUAP_MfgInstNo_MC.statusInitSRCH_Sts((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.statusInitSRCH_Top((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.statusInitSRCH_Fold((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.statusInitSRCH_Tab1((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.statusInitSRCH_Tab2((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.statusInitSRCH_Cnd((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.statusInitSRCH_Cnd2((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.statusInitSRCH_SrchBtn((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.statusInitSRCH_Ctrl((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.statusInitSRCH_Rslt((MSUAP_MfgInstNo)this);
		MSUAP_MfgInstNo_MC.statusInitSRCH_Btn((MSUAP_MfgInstNo)this);

	}

	/**
	 *  [Sts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSts(MSUAP_MfgInstNo p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSUAP_MfgInstNo p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSUAP_MfgInstNo p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSUAP_MfgInstNo p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSUAP_MfgInstNo p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSUAP_MfgInstNo p) {
		p.Cnd_sav_flg.addAllListener(p);
		p.Cnd_ord_flg.addAllListener(p);
		p.Cnd_stt_flg.addAllListener(p);
		p.Cnd_cmpl_flg.addAllListener(p);
		p.Cnd_mfg_inst_no.setListListener(p);
		p.Cnd_mfg_inst_no.addAllListener(p);
		p.Cnd_div_seq.setListListener(p);
		p.Cnd_div_seq.addAllListener(p);
		p.Cnd_imi_mfg_mtd_typ.setListListener(p);
		p.Cnd_imi_mfg_mtd_typ.addAllListener(p);
		p.Cnd_imi_mfg_mtd_typ_nm.setListListener(p);
		p.Cnd_imi_mfg_mtd_typ_nm.addAllListener(p);
		p.Cnd_imi_lot_no.setListListener(p);
		p.Cnd_imi_lot_no.addAllListener(p);
		p.Cnd_imi_sublot_no.setListListener(p);
		p.Cnd_imi_sublot_no.addAllListener(p);
		p.Cnd_imi_mfg_loc_cd.setListListener(p);
		p.Cnd_imi_mfg_loc_cd.addAllListener(p);
		p.Cnd_imi_mfg_loc_nm.setListListener(p);
		p.Cnd_imi_mfg_loc_nm.addAllListener(p);
		p.Cnd_imi_mfg_str_ln_cd.setListListener(p);
		p.Cnd_imi_mfg_str_ln_cd.addAllListener(p);
		p.Cnd_imi_mfg_str_ln_nm.setListListener(p);
		p.Cnd_imi_mfg_str_ln_nm.addAllListener(p);
		p.Cnd_imi_sppl_cd.setListListener(p);
		p.Cnd_imi_sppl_cd.addAllListener(p);
		p.Cnd_imi_sppl_nm.setListListener(p);
		p.Cnd_imi_sppl_nm.addAllListener(p);
		p.Cnd_mi_po_d_no.setListListener(p);
		p.Cnd_mi_po_d_no.addAllListener(p);
		p.Cnd_mi_po_d_no_req_flg.addAllListener(p);
		p.Cnd_match_typ_Group.addAllListener(p);
		p.Cnd_match_typ_0.addAllListener(p);
		p.Cnd_match_typ_1.addAllListener(p);
		p.Cnd_match_typ_2.addAllListener(p);
		p.Cnd_match_typ_3.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSUAP_MfgInstNo p) {
	}

	/**
	 *  [SrchBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn(MSUAP_MfgInstNo p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSUAP_MfgInstNo p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSUAP_MfgInstNo p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_mfg_inst_no.addAllListener(p);
		p.columnRslt_mfg_inst_no.setListListener(p);
		p.columnRslt_div_seq.addAllListener(p);
		p.columnRslt_div_seq.setListListener(p);
		p.columnRslt_mpr_mfg_sts_typ.addAllListener(p);
		p.columnRslt_mpr_mfg_sts_typ.setListListener(p);
		p.columnRslt_mpr_mfg_sts_typ_nm.addAllListener(p);
		p.columnRslt_mpr_mfg_sts_typ_nm.setListListener(p);
		p.columnRslt_imi_lot_no.addAllListener(p);
		p.columnRslt_imi_lot_no.setListListener(p);
		p.columnRslt_imi_sublot_no.addAllListener(p);
		p.columnRslt_imi_sublot_no.setListListener(p);
		p.columnRslt_mi_base_unit_inst_qty.addAllListener(p);
		p.columnRslt_mi_base_unit_inst_qty.setListListener(p);
		p.columnRslt_ma_base_unit_yield_qty.addAllListener(p);
		p.columnRslt_ma_base_unit_yield_qty.setListListener(p);
		p.columnRslt_ma_base_unit_dfct_qty.addAllListener(p);
		p.columnRslt_ma_base_unit_dfct_qty.setListListener(p);
		p.columnRslt_imi_base_unit_cd.addAllListener(p);
		p.columnRslt_imi_base_unit_cd.setListListener(p);
		p.columnRslt_imi_base_unit_nm.addAllListener(p);
		p.columnRslt_imi_base_unit_nm.setListListener(p);
		p.columnRslt_imi_mfg_loc_cd.addAllListener(p);
		p.columnRslt_imi_mfg_loc_cd.setListListener(p);
		p.columnRslt_imi_mfg_loc_nm.addAllListener(p);
		p.columnRslt_imi_mfg_loc_nm.setListListener(p);
		p.columnRslt_imi_mfg_str_ln_cd.addAllListener(p);
		p.columnRslt_imi_mfg_str_ln_cd.setListListener(p);
		p.columnRslt_imi_mfg_str_ln_nm.addAllListener(p);
		p.columnRslt_imi_mfg_str_ln_nm.setListListener(p);
		p.columnRslt_imi_sppl_cd.addAllListener(p);
		p.columnRslt_imi_sppl_cd.setListListener(p);
		p.columnRslt_imi_sppl_nm.addAllListener(p);
		p.columnRslt_imi_sppl_nm.setListListener(p);
		p.columnRslt_mi_po_d_no.addAllListener(p);
		p.columnRslt_mi_po_d_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSUAP_MfgInstNo p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_accept.addAllListener(p);
		p.Btn_accept.setAPMethodName("doBtn_accept");
	}

	/**
	 * [SRCH]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Sts(MSUAP_MfgInstNo p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSUAP_MfgInstNo p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSUAP_MfgInstNo p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSUAP_MfgInstNo p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSUAP_MfgInstNo p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSUAP_MfgInstNo p){
		p.Cnd_sav_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ord_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_stt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cmpl_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_div_seq.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mi_st_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_mi_end_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ma_st_act_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ma_end_act_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_mi_rqst_dlv_rqst_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_imi_mfg_mtd_typ.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_imi_mfg_mtd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_imi_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_imi_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_imi_mfg_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_imi_mfg_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_imi_mfg_str_ln_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_imi_mfg_str_ln_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_imi_sppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_imi_sppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mi_po_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mi_po_d_no_req_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_match_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSUAP_MfgInstNo p){

	}

	/**
	 * [SRCH]ステータスの[SrchBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn(MSUAP_MfgInstNo p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSUAP_MfgInstNo p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSUAP_MfgInstNo p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_mi_rqst_dlv_rqst_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_mpr_mfg_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mpr_mfg_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_imi_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_imi_itm_p_PPanel.columnItm_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_imi_itm_p_PPanel.columnItm_itm_sub1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_imi_itm_p_PPanel.columnItm_itm_sub2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_imi_itm_p_PPanel.columnItm_itm_sub3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_imi_itm_p_PPanel.columnItm_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_imi_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_imi_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_imi_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_imi_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_imi_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_imi_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_imi_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_imi_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_imi_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mi_base_unit_inst_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ma_base_unit_yield_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ma_base_unit_dfct_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_imi_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_imi_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_imi_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_imi_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_imi_mfg_str_ln_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_imi_mfg_str_ln_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_imi_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_imi_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mi_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_mi_st_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_mi_end_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ma_st_act_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ma_end_act_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSUAP_MfgInstNo p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_accept.putMode(p, SRCH, MCMode.ENABLE);

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
		MSUAP_MfgInstNo_MC.setTableConfigRslt((MSUAP_MfgInstNo)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSUAP_MfgInstNo p) {
		p.columnRslt_check.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_mfg_inst_no.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.mfg_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_inst_no);
		p.columnRslt_div_seq.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.div_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_div_seq);
		p.RsltTable.addTable(p.Rslt_mi_rqst_dlv_rqst_p_PPanel.YmdHmTable);
		p.columnRslt_mpr_mfg_sts_typ.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.mpr_mfg_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mpr_mfg_sts_typ);
		p.columnRslt_mpr_mfg_sts_typ_nm.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.mpr_mfg_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mpr_mfg_sts_typ_nm);
		p.RsltTable.addTable(p.Rslt_imi_itm_p_PPanel.ItmTable);
		p.columnRslt_imi_lot_no.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.imi_lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_imi_lot_no);
		p.columnRslt_imi_sublot_no.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.imi_sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_imi_sublot_no);
		p.RsltTable.addTable(p.Rslt_imi_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_mi_base_unit_inst_qty.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.mi_base_unit_inst_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mi_base_unit_inst_qty);
		p.columnRslt_ma_base_unit_yield_qty.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.ma_base_unit_yield_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ma_base_unit_yield_qty);
		p.columnRslt_ma_base_unit_dfct_qty.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.ma_base_unit_dfct_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ma_base_unit_dfct_qty);
		p.columnRslt_imi_base_unit_cd.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.imi_base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_imi_base_unit_cd);
		p.columnRslt_imi_base_unit_nm.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.imi_base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_imi_base_unit_nm);
		p.columnRslt_imi_mfg_loc_cd.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.imi_mfg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_imi_mfg_loc_cd);
		p.columnRslt_imi_mfg_loc_nm.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.imi_mfg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_imi_mfg_loc_nm);
		p.columnRslt_imi_mfg_str_ln_cd.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.imi_mfg_str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_imi_mfg_str_ln_cd);
		p.columnRslt_imi_mfg_str_ln_nm.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.imi_mfg_str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_imi_mfg_str_ln_nm);
		p.columnRslt_imi_sppl_cd.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.imi_sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_imi_sppl_cd);
		p.columnRslt_imi_sppl_nm.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.imi_sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_imi_sppl_nm);
		p.columnRslt_mi_po_d_no.setMeta(mcframe.clientMSUA.MSUAP1020.RsltR.mi_po_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mi_po_d_no);
		p.RsltTable.addTable(p.Rslt_mi_st_schd_dt_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_mi_end_schd_dt_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_ma_st_act_dt_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_ma_end_act_dt_p_PPanel.YmdHmTable);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_div_seq.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_div_seq.getListConfig().setPutter(getCnd_div_seq_ListPutter());
		Cnd_imi_mfg_mtd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_imi_mfg_mtd_typ.getListConfig().setPutter(getCnd_imi_mfg_mtd_typ_ListPutter());
		Cnd_imi_lot_no.getListConfig().setPutter(getCnd_imi_lot_no_ListPutter());
		Cnd_imi_sublot_no.getListConfig().setPutter(getCnd_imi_sublot_no_ListPutter());
		Cnd_imi_mfg_loc_cd.getListConfig().setPutter(getCnd_imi_mfg_loc_cd_ListPutter());
		Cnd_imi_mfg_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_imi_mfg_str_ln_cd.getListConfig().setPutter(getCnd_imi_mfg_str_ln_cd_ListPutter());
		Cnd_imi_sppl_cd.getListConfig().setPutter(getCnd_imi_sppl_cd_ListPutter());
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
	}

	/**
	 * この画面のステータスを返します。
	 *
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * [Cnd_div_seq_ListPutter]の作成
	 */
	protected MCListPutter createCnd_div_seq_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.DivSeq");
		return lp;
	}
	 
	/**
	 * [Cnd_imi_mfg_mtd_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_imi_mfg_mtd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.MfgMtdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_imi_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_imi_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Cnd_imi_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_imi_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Cnd_imi_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_imi_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_imi_mfg_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_imi_mfg_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}
	 
	/**
	 * [Cnd_imi_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_imi_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_div_seq) return getCnd_div_seq(row, info);
		if(combo == Cnd_imi_mfg_mtd_typ) return getCnd_imi_mfg_mtd_typ(row, info);
		if(combo == Cnd_imi_lot_no) return getCnd_imi_lot_no(row, info);
		if(combo == Cnd_imi_sublot_no) return getCnd_imi_sublot_no(row, info);
		if(combo == Cnd_imi_mfg_loc_cd) return getCnd_imi_mfg_loc_cd(row, info);
		if(combo == Cnd_imi_mfg_str_ln_cd) return getCnd_imi_mfg_str_ln_cd(row, info);
		if(combo == Cnd_imi_sppl_cd) return getCnd_imi_sppl_cd(row, info);
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
		else if (ap == Btn_accept) doBtn_accept(info);
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
	 * [Btn]パネルの[accept]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_accept(MCEventInfo info);

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
		if (vc == Cnd_sav_flg) return doCnd_sav_flg_VC(info);
		if (vc == Cnd_ord_flg) return doCnd_ord_flg_VC(info);
		if (vc == Cnd_stt_flg) return doCnd_stt_flg_VC(info);
		if (vc == Cnd_cmpl_flg) return doCnd_cmpl_flg_VC(info);
		if (vc == Cnd_mfg_inst_no) return doCnd_mfg_inst_no_VC(info);
		if (vc == Cnd_div_seq) return doCnd_div_seq_VC(info);
		if (vc == Cnd_imi_mfg_mtd_typ) return doCnd_imi_mfg_mtd_typ_VC(info);
		if (vc == Cnd_imi_mfg_mtd_typ_nm) return doCnd_imi_mfg_mtd_typ_nm_VC(info);
		if (vc == Cnd_imi_lot_no) return doCnd_imi_lot_no_VC(info);
		if (vc == Cnd_imi_sublot_no) return doCnd_imi_sublot_no_VC(info);
		if (vc == Cnd_imi_mfg_loc_cd) return doCnd_imi_mfg_loc_cd_VC(info);
		if (vc == Cnd_imi_mfg_loc_nm) return doCnd_imi_mfg_loc_nm_VC(info);
		if (vc == Cnd_imi_mfg_str_ln_cd) return doCnd_imi_mfg_str_ln_cd_VC(info);
		if (vc == Cnd_imi_mfg_str_ln_nm) return doCnd_imi_mfg_str_ln_nm_VC(info);
		if (vc == Cnd_imi_sppl_cd) return doCnd_imi_sppl_cd_VC(info);
		if (vc == Cnd_imi_sppl_nm) return doCnd_imi_sppl_nm_VC(info);
		if (vc == Cnd_mi_po_d_no) return doCnd_mi_po_d_no_VC(info);
		if (vc == Cnd_mi_po_d_no_req_flg) return doCnd_mi_po_d_no_req_flg_VC(info);
		if (vc == Cnd_match_typ_Group) return doCnd_match_typ_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_mfg_inst_no) return doRslt_mfg_inst_no_VC(info);
		if (vc == columnRslt_div_seq) return doRslt_div_seq_VC(info);
		if (vc == columnRslt_mpr_mfg_sts_typ) return doRslt_mpr_mfg_sts_typ_VC(info);
		if (vc == columnRslt_mpr_mfg_sts_typ_nm) return doRslt_mpr_mfg_sts_typ_nm_VC(info);
		if (vc == columnRslt_imi_lot_no) return doRslt_imi_lot_no_VC(info);
		if (vc == columnRslt_imi_sublot_no) return doRslt_imi_sublot_no_VC(info);
		if (vc == columnRslt_mi_base_unit_inst_qty) return doRslt_mi_base_unit_inst_qty_VC(info);
		if (vc == columnRslt_ma_base_unit_yield_qty) return doRslt_ma_base_unit_yield_qty_VC(info);
		if (vc == columnRslt_ma_base_unit_dfct_qty) return doRslt_ma_base_unit_dfct_qty_VC(info);
		if (vc == columnRslt_imi_base_unit_cd) return doRslt_imi_base_unit_cd_VC(info);
		if (vc == columnRslt_imi_base_unit_nm) return doRslt_imi_base_unit_nm_VC(info);
		if (vc == columnRslt_imi_mfg_loc_cd) return doRslt_imi_mfg_loc_cd_VC(info);
		if (vc == columnRslt_imi_mfg_loc_nm) return doRslt_imi_mfg_loc_nm_VC(info);
		if (vc == columnRslt_imi_mfg_str_ln_cd) return doRslt_imi_mfg_str_ln_cd_VC(info);
		if (vc == columnRslt_imi_mfg_str_ln_nm) return doRslt_imi_mfg_str_ln_nm_VC(info);
		if (vc == columnRslt_imi_sppl_cd) return doRslt_imi_sppl_cd_VC(info);
		if (vc == columnRslt_imi_sppl_nm) return doRslt_imi_sppl_nm_VC(info);
		if (vc == columnRslt_mi_po_d_no) return doRslt_mi_po_d_no_VC(info);
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
	 * [Cnd]パネルの[sav_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sav_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ord_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ord_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stt_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[div_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_div_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[imi_mfg_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_imi_mfg_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[imi_mfg_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_imi_mfg_mtd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[imi_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_imi_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[imi_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_imi_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[imi_mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_imi_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[imi_mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_imi_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[imi_mfg_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_imi_mfg_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[imi_mfg_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_imi_mfg_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[imi_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_imi_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[imi_sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_imi_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mi_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mi_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mi_po_d_no_req_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mi_po_d_no_req_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[match_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_match_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[div_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_div_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mpr_mfg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mpr_mfg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mpr_mfg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mpr_mfg_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[imi_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_imi_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[imi_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_imi_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mi_base_unit_inst_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mi_base_unit_inst_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ma_base_unit_yield_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ma_base_unit_yield_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ma_base_unit_dfct_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ma_base_unit_dfct_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[imi_base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_imi_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[imi_base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_imi_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[imi_mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_imi_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[imi_mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_imi_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[imi_mfg_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_imi_mfg_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[imi_mfg_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_imi_mfg_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[imi_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_imi_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[imi_sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_imi_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mi_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mi_po_d_no_VC(MCEventInfo info){
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
		else if (nc == Cnd_sav_flg) doCnd_sav_flg_NC(info);
		else if (nc == Cnd_ord_flg) doCnd_ord_flg_NC(info);
		else if (nc == Cnd_stt_flg) doCnd_stt_flg_NC(info);
		else if (nc == Cnd_cmpl_flg) doCnd_cmpl_flg_NC(info);
		else if (nc == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NC(info);
		else if (nc == Cnd_div_seq) doCnd_div_seq_NC(info);
		else if (nc == Cnd_imi_mfg_mtd_typ) doCnd_imi_mfg_mtd_typ_NC(info);
		else if (nc == Cnd_imi_mfg_mtd_typ_nm) doCnd_imi_mfg_mtd_typ_nm_NC(info);
		else if (nc == Cnd_imi_lot_no) doCnd_imi_lot_no_NC(info);
		else if (nc == Cnd_imi_sublot_no) doCnd_imi_sublot_no_NC(info);
		else if (nc == Cnd_imi_mfg_loc_cd) doCnd_imi_mfg_loc_cd_NC(info);
		else if (nc == Cnd_imi_mfg_loc_nm) doCnd_imi_mfg_loc_nm_NC(info);
		else if (nc == Cnd_imi_mfg_str_ln_cd) doCnd_imi_mfg_str_ln_cd_NC(info);
		else if (nc == Cnd_imi_mfg_str_ln_nm) doCnd_imi_mfg_str_ln_nm_NC(info);
		else if (nc == Cnd_imi_sppl_cd) doCnd_imi_sppl_cd_NC(info);
		else if (nc == Cnd_imi_sppl_nm) doCnd_imi_sppl_nm_NC(info);
		else if (nc == Cnd_mi_po_d_no) doCnd_mi_po_d_no_NC(info);
		else if (nc == Cnd_mi_po_d_no_req_flg) doCnd_mi_po_d_no_req_flg_NC(info);
		else if (nc == Cnd_match_typ_Group) doCnd_match_typ_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NC(info);
		else if (nc == columnRslt_div_seq) doRslt_div_seq_NC(info);
		else if (nc == columnRslt_mpr_mfg_sts_typ) doRslt_mpr_mfg_sts_typ_NC(info);
		else if (nc == columnRslt_mpr_mfg_sts_typ_nm) doRslt_mpr_mfg_sts_typ_nm_NC(info);
		else if (nc == columnRslt_imi_lot_no) doRslt_imi_lot_no_NC(info);
		else if (nc == columnRslt_imi_sublot_no) doRslt_imi_sublot_no_NC(info);
		else if (nc == columnRslt_mi_base_unit_inst_qty) doRslt_mi_base_unit_inst_qty_NC(info);
		else if (nc == columnRslt_ma_base_unit_yield_qty) doRslt_ma_base_unit_yield_qty_NC(info);
		else if (nc == columnRslt_ma_base_unit_dfct_qty) doRslt_ma_base_unit_dfct_qty_NC(info);
		else if (nc == columnRslt_imi_base_unit_cd) doRslt_imi_base_unit_cd_NC(info);
		else if (nc == columnRslt_imi_base_unit_nm) doRslt_imi_base_unit_nm_NC(info);
		else if (nc == columnRslt_imi_mfg_loc_cd) doRslt_imi_mfg_loc_cd_NC(info);
		else if (nc == columnRslt_imi_mfg_loc_nm) doRslt_imi_mfg_loc_nm_NC(info);
		else if (nc == columnRslt_imi_mfg_str_ln_cd) doRslt_imi_mfg_str_ln_cd_NC(info);
		else if (nc == columnRslt_imi_mfg_str_ln_nm) doRslt_imi_mfg_str_ln_nm_NC(info);
		else if (nc == columnRslt_imi_sppl_cd) doRslt_imi_sppl_cd_NC(info);
		else if (nc == columnRslt_imi_sppl_nm) doRslt_imi_sppl_nm_NC(info);
		else if (nc == columnRslt_mi_po_d_no) doRslt_mi_po_d_no_NC(info);
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
	 * [Cnd]パネルの[sav_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sav_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[div_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_div_seq_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_mtd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mi_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mi_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mi_po_d_no_req_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mi_po_d_no_req_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[match_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_match_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mpr_mfg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mpr_mfg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mpr_mfg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mpr_mfg_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mi_base_unit_inst_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mi_base_unit_inst_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ma_base_unit_yield_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ma_base_unit_yield_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ma_base_unit_dfct_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ma_base_unit_dfct_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mi_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mi_po_d_no_NC(MCEventInfo info){
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
		else if (ne == Cnd_sav_flg) doCnd_sav_flg_NE(info);
		else if (ne == Cnd_ord_flg) doCnd_ord_flg_NE(info);
		else if (ne == Cnd_stt_flg) doCnd_stt_flg_NE(info);
		else if (ne == Cnd_cmpl_flg) doCnd_cmpl_flg_NE(info);
		else if (ne == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NE(info);
		else if (ne == Cnd_div_seq) doCnd_div_seq_NE(info);
		else if (ne == Cnd_imi_mfg_mtd_typ) doCnd_imi_mfg_mtd_typ_NE(info);
		else if (ne == Cnd_imi_mfg_mtd_typ_nm) doCnd_imi_mfg_mtd_typ_nm_NE(info);
		else if (ne == Cnd_imi_lot_no) doCnd_imi_lot_no_NE(info);
		else if (ne == Cnd_imi_sublot_no) doCnd_imi_sublot_no_NE(info);
		else if (ne == Cnd_imi_mfg_loc_cd) doCnd_imi_mfg_loc_cd_NE(info);
		else if (ne == Cnd_imi_mfg_loc_nm) doCnd_imi_mfg_loc_nm_NE(info);
		else if (ne == Cnd_imi_mfg_str_ln_cd) doCnd_imi_mfg_str_ln_cd_NE(info);
		else if (ne == Cnd_imi_mfg_str_ln_nm) doCnd_imi_mfg_str_ln_nm_NE(info);
		else if (ne == Cnd_imi_sppl_cd) doCnd_imi_sppl_cd_NE(info);
		else if (ne == Cnd_imi_sppl_nm) doCnd_imi_sppl_nm_NE(info);
		else if (ne == Cnd_mi_po_d_no) doCnd_mi_po_d_no_NE(info);
		else if (ne == Cnd_mi_po_d_no_req_flg) doCnd_mi_po_d_no_req_flg_NE(info);
		else if (ne == Cnd_match_typ_Group) doCnd_match_typ_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NE(info);
		else if (ne == columnRslt_div_seq) doRslt_div_seq_NE(info);
		else if (ne == columnRslt_mpr_mfg_sts_typ) doRslt_mpr_mfg_sts_typ_NE(info);
		else if (ne == columnRslt_mpr_mfg_sts_typ_nm) doRslt_mpr_mfg_sts_typ_nm_NE(info);
		else if (ne == columnRslt_imi_lot_no) doRslt_imi_lot_no_NE(info);
		else if (ne == columnRslt_imi_sublot_no) doRslt_imi_sublot_no_NE(info);
		else if (ne == columnRslt_mi_base_unit_inst_qty) doRslt_mi_base_unit_inst_qty_NE(info);
		else if (ne == columnRslt_ma_base_unit_yield_qty) doRslt_ma_base_unit_yield_qty_NE(info);
		else if (ne == columnRslt_ma_base_unit_dfct_qty) doRslt_ma_base_unit_dfct_qty_NE(info);
		else if (ne == columnRslt_imi_base_unit_cd) doRslt_imi_base_unit_cd_NE(info);
		else if (ne == columnRslt_imi_base_unit_nm) doRslt_imi_base_unit_nm_NE(info);
		else if (ne == columnRslt_imi_mfg_loc_cd) doRslt_imi_mfg_loc_cd_NE(info);
		else if (ne == columnRslt_imi_mfg_loc_nm) doRslt_imi_mfg_loc_nm_NE(info);
		else if (ne == columnRslt_imi_mfg_str_ln_cd) doRslt_imi_mfg_str_ln_cd_NE(info);
		else if (ne == columnRslt_imi_mfg_str_ln_nm) doRslt_imi_mfg_str_ln_nm_NE(info);
		else if (ne == columnRslt_imi_sppl_cd) doRslt_imi_sppl_cd_NE(info);
		else if (ne == columnRslt_imi_sppl_nm) doRslt_imi_sppl_nm_NE(info);
		else if (ne == columnRslt_mi_po_d_no) doRslt_mi_po_d_no_NE(info);
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
	 * [Cnd]パネルの[sav_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sav_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[div_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_div_seq_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_mtd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mi_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mi_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mi_po_d_no_req_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mi_po_d_no_req_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[match_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_match_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mpr_mfg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mpr_mfg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mpr_mfg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mpr_mfg_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mi_base_unit_inst_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mi_base_unit_inst_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ma_base_unit_yield_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ma_base_unit_yield_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ma_base_unit_dfct_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ma_base_unit_dfct_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mi_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mi_po_d_no_NE(MCEventInfo info){
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
		else if (nx == Cnd_sav_flg) doCnd_sav_flg_NX(info);
		else if (nx == Cnd_ord_flg) doCnd_ord_flg_NX(info);
		else if (nx == Cnd_stt_flg) doCnd_stt_flg_NX(info);
		else if (nx == Cnd_cmpl_flg) doCnd_cmpl_flg_NX(info);
		else if (nx == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NX(info);
		else if (nx == Cnd_div_seq) doCnd_div_seq_NX(info);
		else if (nx == Cnd_imi_mfg_mtd_typ) doCnd_imi_mfg_mtd_typ_NX(info);
		else if (nx == Cnd_imi_mfg_mtd_typ_nm) doCnd_imi_mfg_mtd_typ_nm_NX(info);
		else if (nx == Cnd_imi_lot_no) doCnd_imi_lot_no_NX(info);
		else if (nx == Cnd_imi_sublot_no) doCnd_imi_sublot_no_NX(info);
		else if (nx == Cnd_imi_mfg_loc_cd) doCnd_imi_mfg_loc_cd_NX(info);
		else if (nx == Cnd_imi_mfg_loc_nm) doCnd_imi_mfg_loc_nm_NX(info);
		else if (nx == Cnd_imi_mfg_str_ln_cd) doCnd_imi_mfg_str_ln_cd_NX(info);
		else if (nx == Cnd_imi_mfg_str_ln_nm) doCnd_imi_mfg_str_ln_nm_NX(info);
		else if (nx == Cnd_imi_sppl_cd) doCnd_imi_sppl_cd_NX(info);
		else if (nx == Cnd_imi_sppl_nm) doCnd_imi_sppl_nm_NX(info);
		else if (nx == Cnd_mi_po_d_no) doCnd_mi_po_d_no_NX(info);
		else if (nx == Cnd_mi_po_d_no_req_flg) doCnd_mi_po_d_no_req_flg_NX(info);
		else if (nx == Cnd_match_typ_Group) doCnd_match_typ_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NX(info);
		else if (nx == columnRslt_div_seq) doRslt_div_seq_NX(info);
		else if (nx == columnRslt_mpr_mfg_sts_typ) doRslt_mpr_mfg_sts_typ_NX(info);
		else if (nx == columnRslt_mpr_mfg_sts_typ_nm) doRslt_mpr_mfg_sts_typ_nm_NX(info);
		else if (nx == columnRslt_imi_lot_no) doRslt_imi_lot_no_NX(info);
		else if (nx == columnRslt_imi_sublot_no) doRslt_imi_sublot_no_NX(info);
		else if (nx == columnRslt_mi_base_unit_inst_qty) doRslt_mi_base_unit_inst_qty_NX(info);
		else if (nx == columnRslt_ma_base_unit_yield_qty) doRslt_ma_base_unit_yield_qty_NX(info);
		else if (nx == columnRslt_ma_base_unit_dfct_qty) doRslt_ma_base_unit_dfct_qty_NX(info);
		else if (nx == columnRslt_imi_base_unit_cd) doRslt_imi_base_unit_cd_NX(info);
		else if (nx == columnRslt_imi_base_unit_nm) doRslt_imi_base_unit_nm_NX(info);
		else if (nx == columnRslt_imi_mfg_loc_cd) doRslt_imi_mfg_loc_cd_NX(info);
		else if (nx == columnRslt_imi_mfg_loc_nm) doRslt_imi_mfg_loc_nm_NX(info);
		else if (nx == columnRslt_imi_mfg_str_ln_cd) doRslt_imi_mfg_str_ln_cd_NX(info);
		else if (nx == columnRslt_imi_mfg_str_ln_nm) doRslt_imi_mfg_str_ln_nm_NX(info);
		else if (nx == columnRslt_imi_sppl_cd) doRslt_imi_sppl_cd_NX(info);
		else if (nx == columnRslt_imi_sppl_nm) doRslt_imi_sppl_nm_NX(info);
		else if (nx == columnRslt_mi_po_d_no) doRslt_mi_po_d_no_NX(info);
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
	 * [Cnd]パネルの[sav_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sav_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[div_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_div_seq_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_mtd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mi_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mi_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mi_po_d_no_req_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mi_po_d_no_req_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[match_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_match_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mpr_mfg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mpr_mfg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mpr_mfg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mpr_mfg_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mi_base_unit_inst_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mi_base_unit_inst_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ma_base_unit_yield_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ma_base_unit_yield_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ma_base_unit_dfct_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ma_base_unit_dfct_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mi_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mi_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_mfg_inst_no) doCnd_mfg_inst_no_LC(info);
		else if (lc == Cnd_div_seq) doCnd_div_seq_LC(info);
		else if (lc == Cnd_imi_mfg_mtd_typ) doCnd_imi_mfg_mtd_typ_LC(info);
		else if (lc == Cnd_imi_mfg_mtd_typ_nm) doCnd_imi_mfg_mtd_typ_nm_LC(info);
		else if (lc == Cnd_imi_lot_no) doCnd_imi_lot_no_LC(info);
		else if (lc == Cnd_imi_sublot_no) doCnd_imi_sublot_no_LC(info);
		else if (lc == Cnd_imi_mfg_loc_cd) doCnd_imi_mfg_loc_cd_LC(info);
		else if (lc == Cnd_imi_mfg_loc_nm) doCnd_imi_mfg_loc_nm_LC(info);
		else if (lc == Cnd_imi_mfg_str_ln_cd) doCnd_imi_mfg_str_ln_cd_LC(info);
		else if (lc == Cnd_imi_mfg_str_ln_nm) doCnd_imi_mfg_str_ln_nm_LC(info);
		else if (lc == Cnd_imi_sppl_cd) doCnd_imi_sppl_cd_LC(info);
		else if (lc == Cnd_imi_sppl_nm) doCnd_imi_sppl_nm_LC(info);
		else if (lc == Cnd_mi_po_d_no) doCnd_mi_po_d_no_LC(info);
		else if (lc == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_LC(info);
		else if (lc == columnRslt_div_seq) doRslt_div_seq_LC(info);
		else if (lc == columnRslt_mpr_mfg_sts_typ) doRslt_mpr_mfg_sts_typ_LC(info);
		else if (lc == columnRslt_mpr_mfg_sts_typ_nm) doRslt_mpr_mfg_sts_typ_nm_LC(info);
		else if (lc == columnRslt_imi_lot_no) doRslt_imi_lot_no_LC(info);
		else if (lc == columnRslt_imi_sublot_no) doRslt_imi_sublot_no_LC(info);
		else if (lc == columnRslt_mi_base_unit_inst_qty) doRslt_mi_base_unit_inst_qty_LC(info);
		else if (lc == columnRslt_ma_base_unit_yield_qty) doRslt_ma_base_unit_yield_qty_LC(info);
		else if (lc == columnRslt_ma_base_unit_dfct_qty) doRslt_ma_base_unit_dfct_qty_LC(info);
		else if (lc == columnRslt_imi_base_unit_cd) doRslt_imi_base_unit_cd_LC(info);
		else if (lc == columnRslt_imi_base_unit_nm) doRslt_imi_base_unit_nm_LC(info);
		else if (lc == columnRslt_imi_mfg_loc_cd) doRslt_imi_mfg_loc_cd_LC(info);
		else if (lc == columnRslt_imi_mfg_loc_nm) doRslt_imi_mfg_loc_nm_LC(info);
		else if (lc == columnRslt_imi_mfg_str_ln_cd) doRslt_imi_mfg_str_ln_cd_LC(info);
		else if (lc == columnRslt_imi_mfg_str_ln_nm) doRslt_imi_mfg_str_ln_nm_LC(info);
		else if (lc == columnRslt_imi_sppl_cd) doRslt_imi_sppl_cd_LC(info);
		else if (lc == columnRslt_imi_sppl_nm) doRslt_imi_sppl_nm_LC(info);
		else if (lc == columnRslt_mi_po_d_no) doRslt_mi_po_d_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[div_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_div_seq_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_mtd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_mfg_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_mfg_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[imi_sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_imi_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mi_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mi_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mpr_mfg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mpr_mfg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mpr_mfg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mpr_mfg_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mi_base_unit_inst_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mi_base_unit_inst_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ma_base_unit_yield_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ma_base_unit_yield_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ma_base_unit_dfct_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ma_base_unit_dfct_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_mfg_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_mfg_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[imi_sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_imi_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mi_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mi_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_div_seq]の作成メソッド
	 */
	public MCList getCnd_div_seq(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getDivSeq(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_imi_mfg_mtd_typ]の作成メソッド
	 */
	public MCList getCnd_imi_mfg_mtd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getMfgMtdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_imi_lot_no]の作成メソッド
	 */
	public MCList getCnd_imi_lot_no(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Cnd_imi_sublot_no]の作成メソッド
	 */
	public MCList getCnd_imi_sublot_no(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Cnd_imi_mfg_loc_cd]の作成メソッド
	 */
	public MCList getCnd_imi_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_imi_mfg_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_imi_mfg_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_imi_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_imi_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}